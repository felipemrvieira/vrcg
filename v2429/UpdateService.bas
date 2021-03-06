B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=9
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Service_Create

End Sub

Sub Service_Start (StartingIntent As Intent)
	If Not(Starter.APP_RESET_INSTALL) And Not(Starter.APP_IN_EXECUTION)  Then
		StartServiceAt(Me, DateTime.Now + 600 * 1000, True) '10 minutos
		Track
		Service.StopAutomaticForeground
	End If
End Sub

Sub Service_Destroy

End Sub

Sub Track
	If Not(Starter.FirstInstall) Then
		DownloadTable("CHECKLISTS", "dta_tasks")
		Sleep(500)
		DownloadTable("REQUESTS", "dta_requests")
		Sleep(500)
		DownloadTable("TYPEREQUESTS", "dta_typerequests")
		Sleep(500)
		DownloadTable("EQUIPMENTS", "dta_equipments")
		Sleep(500)
	'	DownloadTable("ACTIONS")
	'	
	'	
	'	DownloadTable("TIPOOBJECTOS")
	'	DownloadTable("OBJECTOS")
	'	DownloadTable("DOCUMENTS")
	'	DownloadTable("EQUIPMENTS")
	'	DownloadTable("LOCATIONS")
	'	DownloadTable("CONTACTS")
	'	DownloadTable("CONTRACTS")
	'	DownloadTable("DEPARTMENTS")
	'	DownloadTable("TEAMS")
	'	DownloadTable("TYPEREQUESTS")
	'	DownloadTable("CHECKLISTS")

		Try
			DownloadFilesWithFTP(Starter.FirstInstall, "")
		Catch
			Log(LastException)
			Utils.WriteErrors2Log(LastException)
		End Try
	End If
End Sub


'===========================================================================================
' 	CRIA MAPEAMENTO DE CAMPOS PARAMETRO PARA EFECTUAR A CHAMADA DA API
'===========================================================================================
Sub MakeTableMaps(groupName As String, tablename As String) As String
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("_team", ShareCode.SESS_User)
	params.Put("groupname", groupName)
	params.Put("tablename", tablename)
	params.Put("data", mapAllExistingRecords(tablename))
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	Log(data)
	Return data
End Sub

Sub mapAllExistingRecords(tablename As String) As List
	Dim retList As List
	retList.Initialize
	If (Utils.NNE(tablename)) Then
		Dim sSQL As String = $"Select tagcode, updated_at from ${tablename}"$
		Private Row As Int = 0
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim Par2 As Map
				Par2.Initialize
				Par2.Put("tagcode", Record.GetString("tagcode"))
				Par2.Put("updated_at", Record.GetString("updated_at"))
				retList.Add(Par2)
			Next
		End If
		Record.Close
	End If
	Return retList
End Sub


'===========================================================================================
' 	EFECTUA O DOWNLOAD DE DADOS
'===========================================================================================
Sub DownloadTable(groupName As String, tablename As String)
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/download/table/update"$
	Log("**********  " & tablename & "  ***********")
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Job.PostString(ServerAddress, MakeTableMaps(groupName, tablename) )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			InsertUpdateTable(Job.GetString)
		Catch
			Log(LastException)
			Utils.WriteErrors2Log(LastException)
			Utils.logError($"Download ${groupName}: "$, ShareCode.SESS_User, LastException)
		End Try
	Else
		Utils.logError($"Download ${groupName}: "$, ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	
End Sub

'===========================================================================================
' 	GRAVA DADOS RECEBIDOS NAS TABELAS LOCAIS
'===========================================================================================
Sub InsertUpdateTable(datares As String)
	Dim parser As JSONParser
	parser.Initialize(datares)
	Dim root As Map = parser.NextObject
	'Dim message As String = root.Get("message")
	Dim status As Int = root.Get("status")
	If (status = 1) Then
		Dim data As List = root.Get("data")
		For Each coldata As Map In data
			Dim table As String = coldata.Get("table")
			Dim rows As List = coldata.Get("rows")
			
			If (rows.IsInitialized) Then
				'MAKE INSERT
				'==========================================
				Dim strIDList As String = GetListMapsID(rows)
				Dim IDList As List = GetAllExistingRecords(table, strIDList)
		
				'InsertMaps
				DBUtils.InsertMaps2(Starter.LocalSQLEVC, table, rows, IDList)
				Sleep(100)
			
				'MAKE UPDATE
				'==========================================
				If (IDList.Size >=1) Then
					For i1 = 0 To rows.Size - 1
						Dim m As Map = rows.Get(i1)
						Dim mID As Int = m.Get("id")
						If (IDList.IndexOf(mID) >=0) Then
							Dim Mapping As Map
							Mapping.Initialize
							Mapping.Put("id", mID)
							DBUtils.UpdateRecord2(Starter.LocalSQLEVC, table, m, Mapping)
							Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC, table, m, Mapping,"","")
						End If
					Next
				End If
			End If

		Next
	End If
End Sub

Sub GetAllExistingRecords(tablename As String, idLists As String) As List
	Dim retList As List
	retList.Initialize
	If (Utils.NNE(idLists)) Then
		Dim sSQL As String = $"Select id from ${tablename} where id in ${idLists}"$
		Private Row As Int = 0
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim mID As Int = Record.GetInt("id")
				retList.Add(mID)
			Next
		End If
		Record.Close
	End If
	Return retList
End Sub

'===========================================================================================
' 	RETORNA LISTA COM OS IDS DAS LINHAS RECEBIDAS
'===========================================================================================
Sub GetListMapsID(innerList As List) As String 'List
	'Dim retList As List
	'retList.Initialize
	Dim itemsList As String = ""
	For Each row As Map In innerList
		Dim ID As Int = row.Get("id")
		If Utils.NNE(itemsList) Then
			itemsList = $"${itemsList},"$
		End If
		itemsList = $"${itemsList}${ID}"$
		'retList.Add(ID)
	Next
	
	If Utils.NNE(itemsList) Then
		itemsList = $"(${itemsList})"$
	End If
	
	Return itemsList 'retList
End Sub

Sub DownloadFilesWithFTP(isfirsttime As Boolean, datacontrol As String)
	If (Not(isfirsttime)) Then
		If (Utils.isNullOrEmpty(datacontrol)) Then
			datacontrol = Utils.GetCurrentDate 'Utils.GetLastNDays(2)
		End If
		
		'************************************************************
		' VERIFICA LISTA DE FICHEIROS DO SERVIDOR
		'************************************************************
		
		Log("************************************************************")
		Log($" 		INITIAL : ${ShareCode.APP_DOMAIN} "$)
		Log("************************************************************")
		Dim flist As List  ' = File.ListFiles(Starter.InternalFolder)
		'flist.Initialize
		Dim sfl As Object = Starter.GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
		Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
		If Success Then
	'		For i = 0 To Folders.Length - 1
	'			Log(Folders(i).Name)
			'		Next
			'************************************************************
			' CRIA LISTA DE FICHEIROS COM BASE NA DATA INDICADA
			'************************************************************
			If (Files.Length >= 1) Then
				flist.Initialize
				For i = 0 To Files.Length - 1
					Dim fName As String = Files(i).Name
					If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
						Dim ext As String = fName.SubString( fName.LastIndexOf(".") -1 )
						If (Files(i).Timestamp >= DateTime.DateParse(datacontrol)) Then
							flist.Add(Types.MakeDownUpFile(Files(i).Name, ext, Files(i).Timestamp))
						End If
					Else
						'flist.Add(Files(i).Name)
					End If
				Next
			End If
		End If
		
		If (flist.IsInitialized) Then
			Dim flistLast As List
			flistLast.Initialize
			'************************************************************
			' VEIRIFCA NOVOS FICHEIROS E FICHEIROS ALTERADOS
			'************************************************************
			If (flist.Size>=1) Then
				For i=0 To flist.Size-1
					Dim fName1 As DownUpFile = flist.Get(i)
					Dim makeCopy As Boolean = False
					If (File.Exists(Starter.InternalFolder, fName1.Filename)) Then
						If (fName1.FileDateTime > File.LastModified(Starter.InternalFolder, fName1.Filename)) Then
							makeCopy = True
						End If
					Else
						makeCopy = True
					End If
					
					If (makeCopy) Then
						flistLast.Add(fName1.Filename)
					End If
				Next
			End If
			
			'************************************************************
			' EFECTUA O DOWNLOAD DOS FICHEIROS NA LISTA
			'************************************************************
			If (flistLast.Size>=1) Then
				For i=0 To flistLast.Size-1
					Dim fName As String = flistLast.Get(i)
					'If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
					Log(fName)
					Dim sf As Object = Starter.GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
					Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
					If Success Then
						Log("file was download successfully")
					Else
						Log("Error downloading file")
					End If
					'End If
				Next
			End If
			
		End If
		'Starter.GlobalFTP.Close
	End If
End Sub

Sub innerUpdate_EVC_ORI
	
	
	
End Sub

