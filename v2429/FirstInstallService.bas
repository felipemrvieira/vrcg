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
	
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	DownloadTable("TIPOOBJECTOS")
	DownloadTable("OBJECTOS")
	DownloadTable("DOCUMENTS")
	DownloadTable("EQUIPMENTS")
	DownloadTable("LOCATIONS")
	DownloadTable("CONTACTS")
	DownloadTable("CONTRACTS")
	DownloadTable("DEPARTMENTS")
	DownloadTable("TEAMS")
	DownloadTable("TYPEREQUESTS")
	DownloadTable("CHECKLISTS")
	DownloadTable("ARTICLES")
	DownloadTable("WAREHOUSES")
	DownloadTable("COMPANY")
	DownloadTable("REPORTS")
	DownloadTable("ZONES")
	DownloadTable("FIELDS")
	DownloadTable("REQUESTS")
	DownloadTable("TYPES")
	DownloadTable("ACTIONS")
	DownloadFilesWithFTP
	Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
End Sub

Sub Service_Destroy

End Sub


'===========================================================================================
' 	CRIA MAPEAMENTO DE CAMPOS PARAMETRO PARA EFECTUAR A CHAMADA DA API
'===========================================================================================
Sub MakeTableMaps(tablename As String) As String
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("tablename", tablename)
	params.Put("versionTagcode", Main.VerisonTagcode)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
        
	Dim data As String =   JSON.ToPrettyString(1)
	Return data
End Sub


'===========================================================================================
' 	EFECTUA O DOWNLOAD DE DADOS
'===========================================================================================
Sub DownloadTable(tablename As String)
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/download/table"$
	
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Job.PostString(ServerAddress, MakeTableMaps(tablename) )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		InsertUpdateTable(tablename, Job.GetString)
	Else
		Utils.logError("Download TiposObjectos", ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	
End Sub

'===========================================================================================
' 	GRAVA DADOS RECEBIDOS NAS TABELAS LOCAIS
'===========================================================================================
Sub InsertUpdateTable(tablename As String, datares As String)
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
			
			'MAKE INSERT
			'==========================================
			Dim strIDList As String = GetListMapsID(rows)
			Dim IDList As List = GetAllExistingRecords(table, strIDList)
		
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

Sub DownloadFilesWithFTP
	
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
		If (Files.Length >= 1) Then
			flist.Initialize
			For i = 0 To Files.Length - 1
				Dim fName As String = Files(i).Name
				If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
					flist.Add(Files(i).Name)
				End If
			Next
		End If
	End If
	If (flist.IsInitialized) Then
		If (flist.Size>=1) Then
			For i=0 To flist.Size-1
				Dim fName As String = flist.Get(i)
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
End Sub

