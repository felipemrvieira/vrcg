B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9
@EndOfDesignText@
Sub Class_Globals
	Private thisTimer As Timer
	Private thisTimerCounter As Int = 0
	Private CurrentActivityObject As Object
	
	Private ApplDialog As CustomLayoutDialog
	Private DialogQuantityValue As FloatLabeledEditText
	Private ReturnQuantityValue As Int = 0
	Private ThisActivity As Activity
	Private ThisActivityName As Object
	
	Private CurrentCLD As CustomLayoutDialog
	Private dialogProgress As ProgressBar
	Private dialogMainText As Label
	Private CURRENT_COUNTER As Int = 0
	Private END_COUNTER As Int = 0
	Private FILES_IN_FTP As Int = 0
	Private FTPFileList As List
	Private dialogPositions As Label
End Sub

Public Sub Initialize
	CURRENT_COUNTER = 0
	END_COUNTER = 0
	FILES_IN_FTP = 0
	'CheckFilesInFTP
End Sub


Sub DownloadAllTables(activName As Object, title As String, textInfo As String, cnt As Int, tcnt As Int )
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhiteSilverLight, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(80%x, 200dip)
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_downloadprogress")
	dialogProgress.Progress = 0
	END_COUNTER = END_COUNTER + cnt
	dialogMainText.Text = textInfo
	If (tcnt = 1) Then
		dialogMainText.Text = dialogMainText.Text & " (Pedidos, Tipos Objectos)"
		DownloadStart1(dialogProgress, dialogPositions)
	else if (tcnt = 2) Then
		dialogMainText.Text = dialogMainText.Text & " (Documentos, Equipamentos, Contactos, Moradas)"
		DownloadStart2(dialogProgress, dialogPositions)
	else if (tcnt = 3) Then
		dialogMainText.Text = dialogMainText.Text & " (Contractos, Departamentos, Equipas)"
		DownloadStart3(dialogProgress, dialogPositions)
	else if (tcnt = 4) Then
		dialogMainText.Text = dialogMainText.Text & " (Artigos, Armazéns, Listas de verificação)"
		DownloadStart4(dialogProgress, dialogPositions)
	else if (tcnt = 5) Then
		dialogMainText.Text = dialogMainText.Text & " (Zonas, Campos adicionais)"
		DownloadStart5(dialogProgress, dialogPositions)
	else if (tcnt = 6) Then
		dialogMainText.Text = dialogMainText.Text & " (Acções, Tipos, Tabelas auxiliares)"
		DownloadStart6(dialogProgress, dialogPositions)
	else if (tcnt = 7) Then
		dialogMainText.Text = dialogMainText.Text & " (Objectos)"
		DownloadStart7(dialogProgress, dialogPositions)
	else if (tcnt = 8) Then
		dialogMainText.Text = dialogMainText.Text & " (Intervenções)"
		DownloadStart8(dialogProgress, dialogPositions)
	else if (tcnt = 9) Then
		dialogMainText.Text = dialogMainText.Text & " (Intervenções - Imagens)"
		DownloadStart9(dialogProgress, dialogPositions)
	End If
	
	'
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		If (tcnt = 1) Then
			CallSub3(activName, $"DownLoadReturn"$, 2, 8)
		else if (tcnt = 2) Then
			CallSub3(activName, $"DownLoadReturn"$, 3, 16)
		else if (tcnt = 3) Then
			CallSub3(activName, $"DownLoadReturn"$, 4, 14)
		else if (tcnt = 4) Then
			CallSub3(activName, $"DownLoadReturn"$, 5, 8)
		else if (tcnt = 5) Then
			CallSub3(activName, $"DownLoadReturn"$, 6, 49)
		else if (tcnt = 6) Then
			CallSub3(activName, $"DownLoadReturn"$, 7, 5)
		else if (tcnt = 7) Then
'			CallSub3(activName, $"DownLoadReturn"$, 8, 1)
'		else if (tcnt = 8) Then
'			CallSub3(activName, $"DownLoadReturn"$, 9, 1)
'		else if (tcnt = 9) Then
			CallSub(activName, $"DownLoadReturn2"$)
		End If
		
	End If
End Sub

Sub DownloadAllTables3(activName As Object, title As String, textInfo As String)
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhiteSilverLight, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(80%x, 200dip)
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_downloadprogress")
	dialogMainText.Text = textInfo
	dialogProgress.Progress = 0
	DownloadFilesWithFTP(dialogProgress, dialogPositions)
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub(activName, "DownLoadReturn3")
	End If
	
End Sub


Sub DownloadStart1(progress As ProgressBar, dlg As Label)
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
'	DownloadTable("REQUESTS", progress, dlg)
	DownloadTable("TIPOOBJECTOS", progress, dlg)
End Sub

Sub DownloadStart2(progress As ProgressBar, dlg As Label)
	
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	DownloadTable("DOCUMENTS", progress, dlg)
	DownloadTable("EQUIPMENTS", progress, dlg)
	'DownloadTable("LOCATIONS", progress, dlg)
	DownloadTableAsync("dta_locations",progress, dlg)
	DownloadTable("CONTACTS", progress, dlg)
'	DownloadTableAsync("dta_contacts",progress, dlg)
End Sub

Sub DownloadStart3(progress As ProgressBar, dlg As Label)
	
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	DownloadTable("CONTRACTS", progress, dlg)
	DownloadTable("DEPARTMENTS", progress, dlg)
	DownloadTable("TEAMS", progress, dlg)
	DownloadTable("TYPEREQUESTS", progress, dlg)
End Sub

Sub DownloadStart4(progress As ProgressBar, dlg As Label)
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	DownloadTable("ARTICLES", progress, dlg)
	DownloadTable("WAREHOUSES", progress, dlg)
	DownloadTable("CHECKLISTS", progress, dlg)
End Sub

Sub DownloadStart5(progress As ProgressBar, dlg As Label)
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	DownloadTable("COMPANY", progress, dlg)
	DownloadTable("REPORTS", progress, dlg)
	DownloadTable("ZONES", progress, dlg)
	DownloadTable("FIELDS", progress, dlg)
End Sub

'			CallSub3(activName, $"DownLoadReturn"$, 6, 40)
'		else if (tcnt = 6) Then
'			CallSub3(activName, $"DownLoadReturn"$, 7, 1)
'		else if (tcnt = 7) Then
'			CallSub(activName, $"DownLoadReturn2"$)

Sub DownloadStart6(progress As ProgressBar, dlg As Label)
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	DownloadTable("TYPES", progress, dlg)
	DownloadTable("ACTIONS", progress, dlg)
End Sub

Sub DownloadStart7(progress As ProgressBar, dlg As Label)
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
'	DownloadTable("OBJECTOS", progress, dlg)
	DownloadTableAsync("dta_objects",progress, dlg)
	Sleep(5000)
	DownloadTableAsync("dta_objects_contacts",progress, dlg)
	DownloadTableAsync("dta_objects_documents",progress, dlg)
	DownloadTableAsync("dta_objects_relations",progress, dlg)
	DownloadTableAsync("dta_objects_images",progress, dlg)
	DownloadTableAsync("dta_objects_fields",progress, dlg)
End Sub

Sub DownloadStart8(progress As ProgressBar, dlg As Label)
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	DownloadTable("REQUESTS1", progress, dlg)
End Sub

Sub DownloadStart9(progress As ProgressBar, dlg As Label)
	Log("************************************************************")
	Log($" 		SERVICE-FIRST INSTALL : ${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	DownloadTable("REQUESTS2", progress, dlg)
End Sub


Sub DownloadTableAsync(tableName As String, progress As ProgressBar, dlg As Label)
	
	Dim recs As Int = 0
'	Dim result  As ResumableSub =  GetTableCount(tableName)
'	Wait For(result) Complete (tableCount As Int)
	
	Wait For(GetTableCount(tableName)) Complete (result As Int)

	If(result > -1) Then
		Do While result > recs
			
			DownloadTableBy500(tableName, recs)
			recs = recs + 500
				
			If(result > recs) Then
				Wait For  (DownloadTableBy500(tableName, recs)) Complete (Complete As Boolean)  ', progress, dlg)
				If(Complete) Then
					recs = recs + 500
				Else
					Return
				End If
			End If
			
			
'			Sleep(100*sleepmultiplier)
'			sleepmultiplier = sleepmultiplier+1
'			If(sleepmultiplier > 50)Then
'				sleepmultiplier = 0
'			End If
		Loop
	End If
	AddCounters(progress, dlg)
End Sub


Sub GetTableCount(tablename As String) As ResumableSub
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/count"$
	
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Job.PostString(ServerAddress, MakeTableMaps2(tablename))
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			Dim JSON1 As JSONParser
			JSON1.Initialize(Job.GetString())
			Dim MapJSON As Map = JSON1.NextObject
			'Dim count As String = MapJSON.Get("count")
			Dim count As Int = MapJSON.Get("count")
			
			Log("Count Final " &  count)
		    Return count
		Catch
			Log(LastException)
'			AddCounters(progress, dlg)
		End Try
	Else
		Log("Erro Count: " & tablename)  ' Job.ErrorMessage)
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	
End Sub

Sub DownloadTableBy500(tablename As String,  position As Int)  As ResumableSub ',  progress As ProgressBar, dlg As Label)
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/getData"$
	
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Log("GetTableCount " & MakeTableMapsBy500(tablename, position))
	Job.PostString(ServerAddress,MakeTableMapsBy500(tablename, position))
	Job.GetRequest.SetContentType("application/json")
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			InsertUpdateTableNoProgress(tablename, Job.GetString)
			
		Catch
			Log(LastException)
			'AddCounters(progress, dlg)
			Return False
		End Try
	Else
		Log("Erro Dby500: " & tablename)  ' Job.ErrorMessage)
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		'AddCounters(progress, dlg)
		Return False
	End If
	Job.Release
	
	Return True
End Sub



Sub MakeTableMapsBy500(tablename As String, position As Int) As String
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("_team", ShareCode.SESS_User)
	params.Put("table", tablename)
	params.Put("position", position)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	Log("MakeTableMaps2" & data)
	Return data
End Sub



Sub MakeTableMaps2(tablename As String) As String
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("_team", ShareCode.SESS_User)
	params.Put("table", tablename)
	
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	Log("MakeTableMaps2" & data)
	Return data
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
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
        
	Dim data As String =   JSON.ToPrettyString(1)
	Return data
End Sub


'===========================================================================================
' 	EFECTUA O DOWNLOAD DE DADOS
'===========================================================================================
Sub DownloadTable(tablename As String, progress As ProgressBar, dlg As Label)
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/download/table"$
	
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Job.PostString(ServerAddress, MakeTableMaps(tablename) )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			InsertUpdateTable(Job.GetString, progress, dlg)
		Catch
			Log(LastException)
			AddCounters(progress, dlg)
		End Try
	Else
		Log(Job.ErrorMessage)
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		AddCounters(progress, dlg)
	End If
	Job.Release
End Sub

'===========================================================================================
' 	GRAVA DADOS RECEBIDOS NAS TABELAS LOCAIS
'===========================================================================================
Sub InsertUpdateTable(datares As String, progress As ProgressBar, dlg As Label)
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
'						DBUtils.UpdateRecord2(Starter.LocalSQLEVC, table, m, Mapping)
						Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC, table, m, Mapping,"","")
					End If
				Next
			End If
			
			AddCounters(progress, dlg)
		Next
	Else
		AddCounters(progress, dlg)
	End If
End Sub

'===========================================================================================
' 	GRAVA DADOS RECEBIDOS NAS TABELAS LOCAIS
'===========================================================================================
Sub InsertUpdateTableNoProgress(table As String,datares As String)
	Dim parser As JSONParser
	parser.Initialize(datares)
	Dim root As Map = parser.NextObject
	'Dim message As String = root.Get("message")
	Dim status As Int = root.Get("status")
	If (status = 1) Then
'		Dim data As List = root.Get("data")
'		For Each coldata As Map In data
'			Dim table As String = coldata.Get("table")
'			Dim rows As List = coldata.Get("rows")
			
			Dim rows As List = root.Get("data")
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
'					DBUtils.UpdateRecord2(Starter.LocalSQLEVC, table, m, Mapping)
					Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC, table, m, Mapping,"","")
					End If
				Next
			End If
'		Next
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

Sub CheckFilesInFTP
'	Log("************************************************************")
'	Log($" 		INITIAL : ${ShareCode.APP_DOMAIN} "$)
'	Log("************************************************************")
'	
'	Dim sfl As Object = Starter.GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
'	Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
'	If Success Then
''		For i = 0 To Folders.Length - 1
''			Log(Folders(i).Name)
''		Next
'		If (Files.Length >= 1) Then
'			FTPFileList.Initialize
'			For i = 0 To Files.Length - 1
'				Dim fName As String = Files(i).Name
'				If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
'					FTPFileList.Add(Files(i).Name)
'				End If
'			Next
'		End If
'	End If
'	If (FTPFileList.IsInitialized) Then
'		FILES_IN_FTP = FTPFileList.Size
'		END_COUNTER = END_COUNTER + FILES_IN_FTP
'		Log("************************************************************")
'		Log($" 		TOTAL FTP: ${FILES_IN_FTP} "$)
'		Log($" 		TOTAL GERAL: ${END_COUNTER} "$)
'		Log("************************************************************")
'		
'	End If
End Sub

Sub DownloadFilesWithFTP(progress As ProgressBar, dlg As Label)
	
	Log("************************************************************")
	Log($" 		INITIAL : ${ShareCode.APPL_HOST}/${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
'	Dim ctm As CustomTrustManager
'	ctm.InitializeAcceptAll
'	myFTP.SetCustomSSLTrustManager(ctm)
	myFTP.TimeoutMs =240000
	Dim sfl As Object = myFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
	'
	'Dim sfl As Object = Starter.GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
	
	Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	If Success Then
'		For i = 0 To Folders.Length - 1
'			Log(Folders(i).Name)
'		Next
		If (Files.Length >= 1) Then
			FTPFileList.Initialize
			For i = 0 To Files.Length - 1
				Dim fName As String = Files(i).Name
				If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
					FTPFileList.Add(Files(i).Name)
				End If
			Next
		End If
	Else
		Log("error getting files list")
		CURRENT_COUNTER = END_COUNTER
		AddCounters(progress, dlg)
	End If

	If (FTPFileList.IsInitialized) Then
		If (FTPFileList.Size>=1) Then
			END_COUNTER = FTPFileList.Size-1
			For i=0 To FTPFileList.Size-1
				Dim fName As String = FTPFileList.Get(i)
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
				AddCounters(progress, dlg)
			Next
		End If
		
	End If
	
	myFTP.Close
End Sub

Sub AddCounters(progress As ProgressBar, dlg As Label)
	progress.Progress = progress.Progress + 1
	If progress.Progress = 100 Then
		progress.Progress = 0
	End If
	
	dlg.Text = $"${CURRENT_COUNTER}/${END_COUNTER}"$
	Log($"Counter: ${CURRENT_COUNTER} of ${END_COUNTER}"$)
	CURRENT_COUNTER = CURRENT_COUNTER + 1
				
	If (CURRENT_COUNTER > END_COUNTER) Then 
		If (thisTimer.IsInitialized) Then
			thisTimer.Enabled = False
		End If
		CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
'	Else If (CURRENT_COUNTER = END_COUNTER) Then
'		thisTimer.Initialize("TimeCheck", 1000)
'		thisTimer.Enabled = True
'		thisTimerCounter = 1
	End If
End Sub

Sub TimeCheck_Tick
	'Handle tick events
	thisTimerCounter = thisTimerCounter + 1
	If thisTimerCounter = 5 Then
		thisTimer.Enabled = False
		CURRENT_COUNTER = END_COUNTER
		CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
	End If
End Sub

