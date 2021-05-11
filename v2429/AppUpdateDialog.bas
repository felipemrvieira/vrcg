B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9
@EndOfDesignText@
Sub Class_Globals
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

Sub Dialog(title As String,textInfo As String, currentCounter As Int, endCounter As Int)
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhiteSilverLight, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(80%x, 200dip)
	CurrentCLD = ApplDialog 'sf
	
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_downloadprogress")
	dialogProgress.Progress = 0
'	END_COUNTER = END_COUNTER + cnt
	dialogMainText.Text = textInfo
	dialogPositions.Text = $"${currentCounter}/${endCounter}"$
	
End Sub

Sub DownloadAllTables(activName As Object, title As String, textInfo As String, cnt As Int, tcnt As Int )
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhiteSilverLight, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(80%x, 200dip)
	CurrentCLD = ApplDialog 'sf
	
'	DeleteFromLocalDatabase
	
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_downloadprogress")
	dialogProgress.Progress = 0
	END_COUNTER = END_COUNTER + cnt
	dialogMainText.Text = textInfo
	dialogPositions.Text = $"${CURRENT_COUNTER}/${END_COUNTER}"$
	
	If (tcnt = 1) Then
		dialogMainText.Text = dialogMainText.Text & " (Processo 1)"
		DownloadStart1(dialogProgress, dialogPositions)
	else if (tcnt = 2) Then
		dialogMainText.Text = dialogMainText.Text & " (Processo 2)"
		DownloadStart2(dialogProgress, dialogPositions)
	else if (tcnt = 3) Then
		dialogMainText.Text = dialogMainText.Text & " (Processo 3)"
		DownloadStart3(dialogProgress, dialogPositions)
	else if (tcnt = 4) Then
		dialogMainText.Text = dialogMainText.Text & " (Processo 4)"
		DownloadStart4(dialogProgress, dialogPositions)
'	else if (tcnt = 4) Then
'		dialogMainText.Text = dialogMainText.Text & " (Artigos, Armazéns, Listas de verificação)"
'		DownloadStart4(dialogProgress, dialogPositions)
'	else if (tcnt = 5) Then
'		dialogMainText.Text = dialogMainText.Text & " (Zonas, Campos adicionais)"
'		DownloadStart5(dialogProgress, dialogPositions)
'	else if (tcnt = 6) Then
'		dialogMainText.Text = dialogMainText.Text & " (Acções, Tipos, Tabelas auxiliares)"
'		DownloadStart6(dialogProgress, dialogPositions)
	End If
	
	'
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		If (tcnt = 1) Then
			CallSub3(activName, $"DownLoadUpdateReturn"$, 2, 1)
		else if (tcnt = 2) Then
			CallSub3(activName, $"DownLoadUpdateReturn"$, 3, 3)
		else if (tcnt = 3) Then
			CallSub3(activName, $"DownLoadUpdateReturn"$, 4, 3)
		else if (tcnt = 4) Then
			CallSub3(activName, $"DownLoadUpdateReturn2"$, 0, 0)
'		else if (tcnt = 3) Then
'			CallSub3(activName, $"DownLoadReturn"$, 4, 14)
'		else if (tcnt = 4) Then
'			CallSub3(activName, $"DownLoadReturn"$, 5, 7)
'		else if (tcnt = 5) Then
'			CallSub3(activName, $"DownLoadReturn"$, 6, 40)
'		else if (tcnt = 6) Then
'			CallSub(activName, $"DownLoadReturn2"$)
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
	dialogPositions.Text = $"${CURRENT_COUNTER}/${END_COUNTER}"$
	DownloadFilesWithFTP("", dialogProgress, dialogPositions)
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub(activName, "DownLoadUpdateReturn3")
	End If
	
End Sub

Sub DownloadStart1(progress As ProgressBar, dlg As Label)
	DownloadDtaRequestsTableAsync(progress, dlg)
	DownloadTable("TYPEREQUESTS", "dta_typerequests", progress, dlg)
	CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
End Sub

Sub DownloadStart2(progress As ProgressBar, dlg As Label)
	DownloadTable("CHECKLISTS", "dta_tasks", progress, dlg)
	DownloadTable("EQUIPMENTS", "dta_equipments", progress, dlg)
	CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
End Sub

Sub DownloadStart3(progress As ProgressBar, dlg As Label)
	DownloadTable("TIPOOBJECTOS", "dta_objecttypes", progress, dlg)
	DownloadTable("OBJECTOS", "dta_objects", progress, dlg)
	CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
End Sub

Sub DownloadStart4(progress As ProgressBar, dlg As Label)
	DownloadTable("ROUTESTEAMS", "", progress, dlg)
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
	params.Put("versionTagcode", Main.VerisonTagcode)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	Log(data)
	Return data
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
	params.Put("versionTagcode", Main.VerisonTagcode)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	Log("MakeTableMaps2" & data)
	Return data
End Sub


Sub MakeDtaRequestsTableMapsBy500(position As Int) As String
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("_team", ShareCode.SESS_User)
	params.Put("position", position)
	params.Put("versionTagcode", Main.VerisonTagcode)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	Log("MakeTableMaps2" & data)
	Return data
End Sub

Sub mapAllExistingRecords(tablename As String) As List
	Dim retList As List
	retList.Initialize
	If (Utils.NNE(tablename)) Then
		Dim sSQL As String = $"Select tagcode, updated_at from ${tablename} Where updated_at >= '${Utils.GetLastNDays(1)}'"$
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


Sub DownloadAllTablesTemp(activName As Object, title As String, textInfo As String, cnt As Int, tcnt As Int )
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
	dialogPositions.Text = $"${CURRENT_COUNTER}/${END_COUNTER}"$
	
	
	DownloadStartTemp(dialogProgress, dialogPositions)
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		
	End If
End Sub

Sub DownloadStartTemp(progress As ProgressBar, dlg As Label)
	DownloadTable("REQUESTS", "dta_requests", progress, dlg)
	
End Sub



'===========================================================================================
' 	EFECTUA O DOWNLOAD DE DADOS
'===========================================================================================
Sub DownloadTable(groupName As String, tablename As String, progress As ProgressBar, dlg As Label)
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/download/table/update"$
	Log("**********  " & tablename & "  ***********")
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Job.PostString(ServerAddress, MakeTableMaps(groupName, tablename) )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			InsertUpdateTable(Job.GetString, progress, dlg)
		Catch
			Log(LastException)
			Utils.logError($"Download ${groupName}: "$, ShareCode.SESS_User, LastException)
		End Try
	Else
		Utils.logError($"Download ${groupName}: "$, ShareCode.SESS_User, Job.ErrorMessage)
		AddCounters(progress, dlg)
	End If
	Job.Release
End Sub

Sub DownloadDtaRequestsTableAsync(progress As ProgressBar, dlg As Label)
	
	Dim recs As Int = 0
	
	Wait For(GetTableDtaRequestsCount) Complete (result As Int)

	If(result > -1) Then
		Do While result > recs
			DownloadDtaRequestTable(recs,progress,dlg)  
			recs = recs + 500
		Loop
	End If
End Sub

Sub DownloadDtaRequestTable(position As Int,progress As ProgressBar, dlg As Label)
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/requests/getData"$
	
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Log("DownloadDtaRequestTable " & MakeDtaRequestsTableMapsBy500(position))
	Job.PostString(ServerAddress,MakeDtaRequestsTableMapsBy500(position))
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			InsertUpdateTableNoProgress("dta_requests", Job.GetString, progress, dlg)
			
		Catch
			Log(LastException)
			'AddCounters(progress, dlg)
		End Try
	Else
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		'AddCounters(progress, dlg)
	End If
	Job.Release
End Sub


Sub DownloadDtaRequestRelationalTable(tagcode As String,progress As ProgressBar, dlg As Label)
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/requests/getDataRelation"$
	
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("request_tagcode", tagcode)
	params.Put("versionTagcode", Main.VerisonTagcode)

	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	
	Job.PostString(ServerAddress,data)
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			CallSub3(ThisActivityName, "LockScreen", 0, 0)
			Dim rs As ResumableSub =InsertUpdateDtaRequestsRelationalTableNoProgress(Job.GetString, tagcode, progress, dlg)
			Wait For(rs) Complete (result As Boolean)
			Log("InsertUpdateDtaRequestsRelationalTableNoProgress = " & result)
			CallSub3(ThisActivityName,"UnlockScreen", 0, 0)
		Catch
			Log(LastException)
			'AddCounters(progress, dlg)
		End Try
	Else
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		'AddCounters(progress, dlg)
	End If
	Job.Release
End Sub

Sub GetTableDtaRequestsCount() As ResumableSub
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/requests/count"$
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("versionTagcode", Main.VerisonTagcode)

	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	
	
	Job.PostString(ServerAddress, data)
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
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	
End Sub

Sub UpdateDtaRequestsRelationalTables(progress As ProgressBar, dlg As Label) As ResumableSub
	'Dim where As String = $"select distinct tagcode from dta_requests"$
	Dim where As String = $"select distinct tagcode from dta_requests WHERE 1=1 
							AND (technical_tagcode='${ShareCode.SESS_User}' OR team_tagcode IN 
								(SELECT tagcode FROM dta_teams_relations WHERE relation_tagcode='${ShareCode.SESS_User}'))
							And (execute_date>=strftime('%Y-%m-%d %H-00','now') and execute_date<=date('now','+2 days'))"$
	Dim Lista As List = DBStructures.GetListOfFromScriptEVC("tagcode", where)
	If (Lista.Size >=1)Then
		For Each row As String In Lista		
			DownloadDtaRequestRelationalTable(row, progress,dlg)
			AddCounters(progress, dlg)
		Next
	End If
End Sub

Sub InsertUpdateTableNoProgress(table As String,datares As String,progress As ProgressBar, dlg As Label)
	Dim parser As JSONParser
	parser.Initialize(datares)
	Dim root As Map = parser.NextObject
	'Dim message As String = root.Get("message")
	Dim status As Int = root.Get("status")
	If (status = 1) Then
			
		Dim rows As List = root.Get("data")
		'MAKE INSERT
		'==========================================
		Dim strIDList As String = GetListMapsIDByListTAG(rows)  'GetListMapsIDByList(rows)
		Dim IDList As List = GetAllDtaRequetsExistingRecordsTAG(table, strIDList) 'GetAllDtaRequetsExistingRecords(table, strIDList)
		
		DeleteFromLocalDatabaseTAG(Utils.StrList2SQLArray(IDList))
	
'		DBUtils.InsertMaps2(Starter.LocalSQLEVC, table, rows, IDList)
		DBUtils.InsertMaps3(Starter.LocalSQLEVC, table, "tagcode", rows, IDList)
'			Sleep(100)
		
		'MAKE UPDATE
		'==========================================
		If (IDList.Size >=1) Then
			For i1 = 0 To rows.Size - 1
				Dim m As Map = rows.Get(i1)
				'Dim mID As Int = m.Get("id")
				Dim mID As String  = m.Get("tagcode")
				If (IDList.IndexOf(mID) >=0) Then
					Dim Mapping As Map
					Mapping.Initialize
					'Mapping.Put("id", mID)
					Mapping.Put("tagcode", mID)
'					DBUtils.UpdateRecord2(Starter.LocalSQLEVC, table, m, Mapping)
					Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC, table, m, Mapping,"","")
				End If
				AddCounters(progress, dlg)
			Next
		End If
		UpdateDtaRequestsRelationalTables(progress,dlg)
'		Next
	Else
		Log("?????????????????????????????????????????????")
		Log("API RETORNA STATUS = 0")
		Log("?????????????????????????????????????????????")
	End If
	Return True
End Sub


Sub InsertUpdateDtaRequestsRelationalTableNoProgress(datares As String, tagcode As String,progress As ProgressBar, dlg As Label) As ResumableSub
	Dim parser As JSONParser
	parser.Initialize(datares)
	Dim root As Map = parser.NextObject
	'Dim message As String = root.Get("message")
	Dim status As Int = root.Get("status")
	If (status = 1) Then
			
		Dim databases As Map = root.Get("data")
		For i =0  To databases.Size-1

			Dim table As String = databases.GetKeyAt(i)
			Dim rows As List = databases.GetValueAt(i)
			
			'VERIFICA A LISTA DE ITEMS
			'==========================================
			Dim strIDList As String = GetListMapsIDByList(rows)
			
			
			'IDENTIFICA OS IDS DA LISTA
			'==========================================
			Dim IDList As List = GetAllExistingRecordsFromList(table, strIDList)
			
			'MAKE INSERT
			'==========================================
			DBUtils.InsertMaps2(Starter.LocalSQLEVC, table, rows, IDList)
			Sleep(100)
			
			'MAKE UPDATE
			'==========================================
			If (IDList.Size >=1) Then
				For i1 = 0 To rows.Size - 1
					Dim m As Map = rows.Get(i1)
					Dim mID As Int = m.Get("id")
					If (IDList.IndexOf(mID) >=0) Then
						
						Log($"Updating data : ${table}-${mID}"$)
						Dim Mapping As Map
						Mapping.Initialize
						Mapping.Put("id", mID)
'						DBUtils.UpdateRecord2(Starter.LocalSQLEVC, table, m, Mapping)
						Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC, table, m, Mapping,"","")
						AddCounters(progress, dlg)
					End If
				Next
			End If
			
			AddCounters(progress, dlg)
			
		Next
	End If
	Return True
End Sub

Sub GetAllDtaRequetsExistingRecords(tablename As String, idLists As String) As List
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

Sub GetAllDtaRequetsExistingRecordsTAG(tablename As String, idLists As String) As List
	Dim retList As List
	retList.Initialize
	If (Utils.NNE(idLists)) Then
		Dim sSQL As String = $"Select tagcode from ${tablename} where tagcode in ${idLists}"$
		Private Row As Int = 0
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim mID As String = Record.GetString("tagcode")
				retList.Add(mID)
			Next
		End If
		Record.Close
	End If
	Return retList
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
	Dim cleardata As Int = root.Get("cleardata")
	Log(datares)
	If (status = 1) Then
		Dim data As List = root.Get("data")
		For Each coldata As Map In data
			Dim table As String = coldata.Get("table")
			Dim rows As List = coldata.Get("rows")
			Dim innerTagcode As String = coldata.Get("tablekey")
		
			'VERIFICA A LISTA DE ITEMS
			'==========================================
			Dim strIDList As String = GetListMapsID(rows, innerTagcode)
			
			'REMOVE ITEMS EXISTENTES NA LISTA DA TABELA LOCAL
			'==========================================
			If (cleardata = 1) Then
				If Utils.NNE(strIDList) Then
					Log($"Deleted data : ${strIDList}"$)
					DeleteAllExistingRecords(table, strIDList, innerTagcode)
				End If
			End If
			
			'IDENTIFICA OS IDS DA LISTA
			'==========================================
			Dim IDList As List = GetAllExistingRecords(table, strIDList, innerTagcode)
			
			'MAKE INSERT
			'==========================================
			DBUtils.InsertMaps2(Starter.LocalSQLEVC, table, rows, IDList)
			Sleep(100)
			
			'MAKE UPDATE
			'==========================================
			If (IDList.Size >=1) Then
				For i1 = 0 To rows.Size - 1
					Dim m As Map = rows.Get(i1)
					Dim mID As Int = m.Get("id")
					If (IDList.IndexOf(mID) >=0) Then
						
						Log($"Updating data : ${table}-${mID}"$)
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

'Sub GetAllExistingRecords(tablename As String, idLists As String) As List
Sub GetAllExistingRecords(tablename As String, idLists As String, innerTagcode As String) As List
	Dim retList As List
	retList.Initialize
	If (Utils.NNE(idLists)) Then
		'Dim sSQL As String = $"Select id from ${tablename} where id in ${idLists}"$
		Dim sSQL As String = $"Select id from ${tablename} where ${innerTagcode} in ${idLists}"$
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

Sub GetAllExistingRecordsFromList(tablename As String, idLists As String) As List
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

'Sub DeleteAllExistingRecords(tablename As String, idLists As String)
Sub DeleteAllExistingRecords(tablename As String, idLists As String, innerTagcode As String)
	If (Utils.NNE(idLists)) Then
		'Dim sSQL As String = $"delete from ${tablename} where id in ${idLists}"$
		Dim sSQL As String = $"delete from ${tablename} where ${innerTagcode} in ${idLists}"$
		Starter.LocalSQLEVC.ExecNonQuery(sSQL)
	End If
End Sub

'===========================================================================================
' 	RETORNA LISTA COM OS IDS DAS LINHAS RECEBIDAS
'===========================================================================================
'Sub GetListMapsID(innerList As List) As String 'List
Sub GetListMapsID(innerList As List, innerTagcode As String) As String 'List
	'Dim retList As List
	'retList.Initialize
	Dim itemsList As String = ""
	For Each row As Map In innerList
		'Dim ID As Int = row.Get("id")
		Dim ID As String = row.Get(innerTagcode)
		If Utils.NNE(itemsList) Then
			itemsList = $"${itemsList},"$
		End If
		itemsList = $"${itemsList}'${ID}'"$
		'retList.Add(ID)
	Next
	
	If Utils.NNE(itemsList) Then
		itemsList = $"(${itemsList})"$
	End If
	
	Return itemsList 'retList
End Sub


Sub GetListMapsIDByList(innerList As List) As String 'List
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

Sub GetListMapsIDByListTAG(innerList As List) As String 'List
	'Dim retList As List
	'retList.Initialize
	Dim itemsList As String = ""
	For Each row As Map In innerList
		Dim TagCode As String = row.Get("tagcode")
		If Utils.NNE(itemsList) Then
			itemsList = $"${itemsList},"$
		End If
		itemsList = $"${itemsList}'${TagCode}'"$
	Next
	
	If Utils.NNE(itemsList) Then
		itemsList = $"(${itemsList})"$
	End If
	
	Return itemsList 'retList
End Sub

Sub DownloadFilesWithFTP(datacontrol As String, progress As ProgressBar, dlg As Label)
	
	If (Not(Starter.FirstInstall)) Then
		If (Utils.isNullOrEmpty(datacontrol)) Then
			datacontrol = Utils.GetCurrDatetimeFixed 'Utils.GetLastNDays(2)
		End If
		
		Try
			Dim datacontrolParse As Long = DateTime.DateParse(datacontrol)
		Catch
			Dim datacontrolParse As Long = DateTime.Now   'DateTime.DateParse(DateTime.Date(DateTime.Now))
		End Try
		
		'************************************************************
		' VERIFICA LISTA DE FICHEIROS DO SERVIDOR
		'************************************************************
		
		Log("************************************************************")
		Log($" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST} "$)
		Log( $"EvolutionCheck@${ShareCode.APPL_HOST}"$ )
		Log("************************************************************")
		Dim flist As List : flist.Initialize  ' = File.ListFiles(Starter.InternalFolder)
		Dim flisthtml As List : flisthtml.Initialize
		
		Dim myFTP As FTP
		myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"EvolutionCheck@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		myFTP.PassiveMode = True
		
		
''		Dim sf As Object = Starter.GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/20190212_113320.jpeg", False, Starter.SharedFolder, "20190212_113320.jpeg")
''		Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
''		If Success Then
''			Log("file was download successfully")
''		Else
''			Log("Error downloading file")
''		End If
		
		
		Dim sfl As Object = myFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
		'
		'Dim sfl As Object = Starter.GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
		Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
		
		If Success Then
			
			'		For i = 0 To Folders.Length - 1
			'			Log(Folders(i).Name)
			'		Next
			'************************************************************
			' CRIA LISTA DE FICHEIROS COM BASE NA DATA INDICADA
			'************************************************************
			If (Files.Length >= 1) Then
				'flist.Initialize
				For i = 0 To Files.Length - 1
					Dim fName As String = Files(i).Name
					If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".jpeg"))  Or (fName.EndsWith(".pdf")) Then
						Dim ext As String = fName.SubString( fName.LastIndexOf(".") -1 )
						If (Files(i).Timestamp >= datacontrolParse) Then
						Try
							flist.Add(Types.MakeDownUpFile(Files(i).Name, ext, Files(i).Timestamp))
						Catch
							Log(LastException)
						End Try
						End If
					Else If (fName.EndsWith(".html")) Then
						Dim ext As String = fName.SubString( fName.LastIndexOf(".") -1 )
						If (Files(i).Timestamp >= datacontrolParse) Then
							Try
								flisthtml.Add(Types.MakeDownUpFile(Files(i).Name, ext, Files(i).Timestamp))
							Catch
								Log(LastException)
							End Try
						End If
					Else
						'flist.Add(Files(i).Name)
					End If
				Next
			End If
			
			If (flist.Size >=1) Then '.IsInitialized) Then
				Dim flistLast As List
				flistLast.Initialize
				'************************************************************
				' VEIRIFCA NOVOS FICHEIROS E FICHEIROS ALTERADOS
				'************************************************************
				If (flist.Size>=1) Then
					For i=0 To flist.Size-1
						Dim fName1 As DownUpFile = flist.Get(i)
						Dim makeCopy As Boolean = False
'						If (File.Exists(Starter.InternalFolder, fName1.Filename)) Then
'							If (fName1.FileDateTime <> File.LastModified(Starter.InternalFolder, fName1.Filename)) Then
'								makeCopy = True
'							End If
'						Else
'							makeCopy = True
'						End If
						
						If Not(File.Exists(Starter.InternalFolder, fName1.Filename)) Then
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
					END_COUNTER = flistLast.Size-1
					For i=0 To flistLast.Size-1
						Dim fName As String = flistLast.Get(i)
						'If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
						Log(fName)
						'Dim sf As Object = Starter.GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
						Dim sf As Object = Starter.GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.SharedFolder, fName)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
						If Success Then
							Log("file was download successfully")
						Else
							Log("Error downloading file")
						End If
						'End If
						AddCounters(progress, dlg)
					Next
				Else
					CURRENT_COUNTER = END_COUNTER
					AddCounters(progress, dlg)
					Log("vazio 0")
				End If
			Else
				CURRENT_COUNTER = END_COUNTER
				AddCounters(progress, dlg)
				Log("vazio 1")
			End If
			
			If (flisthtml.Size >=1) Then '.IsInitialized) Then
				Dim flistLast As List
				flistLast.Initialize
				'************************************************************
				' VEIRIFCA NOVOS FICHEIROS E FICHEIROS ALTERADOS
				'************************************************************
				If (flisthtml.Size>=1) Then
					For i=0 To flisthtml.Size-1
						Dim fName1 As DownUpFile = flisthtml.Get(i)
						Dim makeCopy As Boolean = False
						If Not(File.Exists(Starter.SharedFolder, fName1.Filename)) Then
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
					END_COUNTER = flistLast.Size-1
					For i=0 To flistLast.Size-1
						Dim fName As String = flistLast.Get(i)
						'If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
						Log(fName)
						Dim sf As Object = Starter.GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.SharedFolder, fName)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
						If Success Then
							Log("file was download successfully")
						Else
							Log("Error downloading file")
						End If
						'End If
						AddCounters(progress, dlg)
					Next
				Else
					CURRENT_COUNTER = END_COUNTER
					AddCounters(progress, dlg)
					Log("vazio 0")
				End If
			Else
				CURRENT_COUNTER = END_COUNTER
				AddCounters(progress, dlg)
				Log("vazio 1")
			End If
			'Starter.GlobalFTP.Close
		Else
			CURRENT_COUNTER = END_COUNTER
			AddCounters(progress, dlg)
			Log("Sem sucesso!")
		End If
		
		
		myFTP.Close
	Else
		CURRENT_COUNTER = END_COUNTER
		AddCounters(progress, dlg)
		Log("vazio 2")
	End If
	CallSub3(ThisActivityName,"UnlockScreen", 0, 0)
	
End Sub


Sub DeleteFromLocalDatabase()
	Dim where As String = $"select distinct tagcode from dta_requests where execute_date>='${DateTime.Date(DateTime.Now)}'"$
	Dim Lista As List = DBStructures.GetListOfFromScriptEVC("tagcode", where)
	If (Lista.Size >=1)Then
		
	    Dim ListaStr As String = Utils.StrList2SQLArray(Lista)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_images where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_signatures where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_relations where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_output_actions where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_output where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_objects where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_notes where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_fields where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_entities where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_documents where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_contacts where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_alerts where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests where tagcode in ${ListaStr}"$)
	End If
End Sub


Sub DeleteFromLocalDatabaseTAG(ListaStr As String)
	If (Utils.NNE(ListaStr))Then
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_images where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_signatures where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_relations where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_output_actions where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_output where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_objects where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_notes where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_fields where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_entities where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_documents where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_contacts where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_alerts where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests where tagcode in ${ListaStr}"$)
	End If
End Sub


Sub AddCounters(progress As ProgressBar, dlg As Label)
	CURRENT_COUNTER = CURRENT_COUNTER + 1
	progress.Progress = progress.Progress + 1
	If progress.Progress = 100 Then
		progress.Progress = 0
	End If
	
	dlg.Text = $"${CURRENT_COUNTER}/${END_COUNTER}"$
	Log($"Counter: ${CURRENT_COUNTER} of ${END_COUNTER}"$)
				
	If (CURRENT_COUNTER > END_COUNTER) Then
		CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
	End If
End Sub

