B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=8.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
#End Region

Sub Process_Globals
	Private nid As Int = 1
	Private GPS As GPS
	Private Tracking As Boolean
	Private LastUpdateTime As Long
	Private lock As PhoneWakeState
	Private bigCounter As Int = 0
End Sub

Sub Service_Create
	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_NEVER
	Service.StopAutomaticForeground
End Sub

Sub Service_Start (StartingIntent As Intent)

End Sub

Public Sub Track
	UploadFilesWithFTP
	Service.StopAutomaticForeground
End Sub

Sub UploadFilesWithFTP
	Dim myFTP As FTP
	Dim flist As List = File.ListFiles(Starter.InternalFolder)
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"EvolutionCheck@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
	myFTP.TimeoutMs =240000
	
	For i=0 To flist.Size-1
		Dim fName As String = flist.Get(i) 
		If (fName.EndsWith(".png")) Or (fName.EndsWith(".pdf")) Then
			Log(fName)
			Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, fName, False, "/" & ShareCode.APP_DOMAIN & "/docs/" & fName)
			Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
			If Success Then
				Log("file was uploaded successfully")
			Else
				Log("Error uploading file")
			End If
		End If
	Next
	myFTP.Close
End Sub

Sub TablesCheck
	Dim started As String = Utils.GetCurrentTimeExt

	Log("============>> Outros")
	getDataToTable($"select distinct tagcode from dta_documents"$, "tagcode", "dta_documents", False)
	'getDataToTable($"select distinct document from dta_documents2objects"$, "document", "dta_documents2objects", False)
	getDataToTable($"select distinct tagcode from dta_contacts"$, "tagcode", "dta_contacts", False)
	'getDataToTable($"select distinct tagcode from dta_technicals"$, "tagcode", "dta_technicals", False)
	Sleep(100)
	getDataToTable($"select distinct tagcode from dta_fields"$, "tagcode", "dta_fields", False)
	getDataToTable($"select distinct tagcode from dta_locations"$, "tagcode", "dta_locations", False)
	Sleep(100)
	
	getDataToTable($"select distinct tagcode from dta_tasks"$, "tagcode", "dta_tasks", False)
	Sleep(100)
	getDataToTable($"select distinct task_tagcode from dta_tasks_documents"$, "task_tagcode", "dta_tasks_documents", False)
	Sleep(100)
	getDataToTable($"select distinct task_tagcode from dta_tasks_events"$, "task_tagcode", "dta_tasks_events", False)
	Sleep(100)
	getDataToTable($"select distinct tagcode from dta_tasks_groups"$, "tagcode", "dta_tasks_groups", False)
	Sleep(100)
	getDataToTable($"select distinct task_tagcode from dta_tasks_items"$, "task_tagcode", "dta_tasks_items", False)
	Sleep(100)
	getDataToTable($"select distinct task_tagcode from dta_tasks_items_answers"$, "task_tagcode", "dta_tasks_items_answers", False)
	Sleep(100)
	getDataToTable($"select distinct task_tagcode from dta_tasks_items_answers_events"$, "task_tagcode", "dta_tasks_items_answers_events", False)
	Sleep(100)
	getDataToTable($"select distinct task_tagcode from dta_tasks_obsnotes"$, "task_tagcode", "dta_tasks_obsnotes", False)
	Sleep(100)
	
	getDataToTable($"select distinct tagcode from dta_requests"$, "tagcode", "dta_requests", False)
	Sleep(100)
	getDataToTable($"select distinct request_tagcode from dta_requests_alerts"$, "request_tagcode", "dta_requests_alerts", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_contacts"$, "request_tagcode", "dta_requests_contacts", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_documents"$, "request_tagcode", "dta_requests_documents", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_entities"$, "request_tagcode", "dta_requests_entities", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_fields"$, "request_tagcode", "dta_requests_fields", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_notes"$, "request_tagcode", "dta_requests_notes", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_objects"$, "request_tagcode", "dta_requests_objects", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_output"$, "request_tagcode", "dta_requests_output", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_output_actions"$, "request_tagcode", "dta_requests_output_actions", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_relations"$, "request_tagcode", "dta_requests_relations", False)
	getDataToTable($"select distinct request_tagcode from dta_requests_values"$, "request_tagcode", "dta_requests_values", False)
	'getDataToTable($"select distinct request_tagcode from dta_requests_values_images"$, "request_tagcode", "dta_requests_values_images", False)
	
	Dim ended As String = Utils.GetCurrentTimeExt
	Log($"Server update START:${started}, END:${ended}"$)
	
End Sub

Sub TablesCheckNew
	Dim started As String = Utils.GetCurrentTimeExt
	
'	getDataToTableNewTypes(True)
	getDataToTableNew(True)

	Dim ended As String = Utils.GetCurrentTimeExt
	Log($"Server update START:${started}, END:${ended}"$)
End Sub

Sub Service_Destroy
'	If Tracking Then
'		GPS.Stop
'	End If
	Tracking = False
	lock.ReleasePartialLock
End Sub

Sub getDataToTable(script As String, fieldname As String, tablename As String, clearTable As Boolean)
	Dim params As Map = getTagList2(script, fieldname, tablename)
	getServer2Data(params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/get"$, tablename, clearTable)
	Sleep(100)
End Sub

Sub getDataToTableNew(clearTable As Boolean)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("versionTagcode", Main.VerisonTagcode)
	getServer2Data2(params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/getall"$, clearTable)
	Sleep(100)
	
	getServer2Data2(params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/getall1"$, clearTable)
	Sleep(100)
	
	getServer2Data2(params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/getall2"$, clearTable)
	Sleep(100)
	
	getServer2Data2(params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/getall3"$, clearTable)
	Sleep(100)
	
'	params.Put("row", 0)
'	getServer2Data2Repeat(params, Me, "https://demo.${ShareCode.APPL_HOST}/api/orion/table/getall4", clearTable)
'	Sleep(100)
End Sub

Sub getDataToTableNewTypes(clearTable As Boolean)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("versionTagcode", Main.VerisonTagcode)
	getServer2Data2(params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/types/getall"$, clearTable)
	Sleep(100)
	
	getServer2Data2(params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/table/types/getall2"$, clearTable)
	Sleep(100)
End Sub

Sub getServer2Data(params As Map, target As Object, url As String, tablename As String, clearTable As Boolean)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
        
	Dim data As String =   JSON.ToPrettyString(1)
	Dim Job As HttpJob
	Job.Initialize("",target)
	Dim addr As String = url
	
	Job.PostString(addr, data )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log(Job.GetString)
		'CallSub3(Me, "InsertDataToTable", Job.GetString, tablename)
		InsertDataToTable(Job.GetString, tablename, clearTable)
	Else
		Log("Erro no serviço")
	End If
	Job.Release
End Sub

Sub InsertDataToTable(data As String, tablename As String, clearTable As Boolean)
	'Log(data)
	Dim InsertList As List
	InsertList.Initialize
	Dim JSON1 As JSONParser = getJSONData(data)

	Dim MapJSON As Map = JSON1.NextObject
	Dim status As Int = MapJSON.Get("status")
	If (status =1) Then
		Dim DataGet As List = MapJSON.Get("data")
		If (DataGet.Size >=1) Then
			For Each thisdata As Map In DataGet
				InsertList.Add(thisdata)
			Next
			If (clearTable) Then
				DBUtils.ClearTable(Starter.LocalSQLEVC, tablename)
			End If
			DBUtils.InsertMaps(Starter.LocalSQLEVC, tablename, InsertList)
			Sleep(100)
		End If
	End If
End Sub

Sub getServer2Data2(params As Map, target As Object, url As String, clearTable As Boolean)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
        
	Dim data As String =   JSON.ToPrettyString(1)
	Dim Job As HttpJob
	Job.Initialize("",target)
	Dim addr As String = url
	
	Job.PostString(addr, data )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log(Job.GetString)
		'CallSub3(Me, "InsertDataToTable", Job.GetString, tablename)
		InsertDataToTableTypes(Job.GetString, clearTable)
	Else
		Log("Erro no serviço")
	End If
	Job.Release
End Sub

Sub getServer2Data2Repeat(params As Map, target As Object, url As String, clearTable As Boolean)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
        
	Dim data As String =   JSON.ToPrettyString(1)
	Dim Job As HttpJob
	Job.Initialize("",target)
	Dim addr As String = url
	
	Job.PostString(addr, data )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log(Job.GetString)
		'CallSub3(Me, "InsertDataToTable", Job.GetString, tablename)
		InsertDataToTableRepeat(Job.GetString, params, target, url, clearTable)
	Else
		Log("Erro no serviço")
	End If
	Job.Release
End Sub

Sub InsertDataToTableTypes(data As String, clearTable As Boolean)
	'Log(data)
	Dim JSON1 As JSONParser = getJSONData(data)
	Dim MapJSON As Map = JSON1.NextObject
	Dim status As Int = MapJSON.Get("status")
	If (status =1) Then
		Dim DataGet As List = MapJSON.Get("data")
		If (DataGet.Size >=1) Then
			For Each thisdata As Map In DataGet
				Dim InsertList As List
				InsertList.Initialize
				Dim Name As String = thisdata.Get("table")
				Dim innerDataGet As List = thisdata.Get("data")
				For Each innerData As Map In innerDataGet
					InsertList.Add(innerData)
				Next
				If (clearTable) Then
					DBUtils.ClearTable(Starter.LocalSQLEVC, Name)
				End If
				DBUtils.InsertMaps(Starter.LocalSQLEVC, Name, InsertList)
				Sleep(100)
			Next
		End If
	End If
End Sub

Sub InsertDataToTableRepeat(data As String, params As Map, target As Object, url As String, clearTable As Boolean)
	'Log(data)
	Dim JSON1 As JSONParser = getJSONData(data)
	Dim MapJSON As Map = JSON1.NextObject
	Dim status As Int = MapJSON.Get("status")
	Dim nextrow As Int = MapJSON.Get("nextrow")
	Dim remain As Int = MapJSON.Get("remain")
	If (status =1) Then
		Dim DataGet As List = MapJSON.Get("data")
		If (DataGet.Size >=1) Then
			For Each thisdata As Map In DataGet
				Dim InsertList As List
				InsertList.Initialize
				Dim Name As String = thisdata.Get("table")
				Dim innerDataGet As List = thisdata.Get("data")
				For Each innerData As Map In innerDataGet
					InsertList.Add(innerData)
				Next
				If (clearTable) Then
					DBUtils.ClearTable(Starter.LocalSQLEVC, Name)
				End If
				DBUtils.InsertMaps(Starter.LocalSQLEVC, Name, InsertList)
				Sleep(100)
			Next
		End If
		If (remain > 0) Then
			params.Put("row", nextrow)
			getServer2Data2Repeat(params, target, url, False)
		End If
	End If
End Sub

Sub getTagList2(sql As String, field As String, tablename As String) As Map
	Dim params As Map
	params.Initialize
	' VERIFICAR TODOS OS NOVOS   
	Dim sList As String = Utils.List2Str(DBStructures.GetListOfFromScriptEVC(field, sql), "|")				'AAA|BBB
	'Log(sList)
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("notin", sList)
	params.Put("table", tablename)
	params.Put("versionTagcode", Main.VerisonTagcode)
	Return params
End Sub

Sub getTagList3(tablename As String) As Map
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("table", tablename)
	params.Put("versionTagcode", Main.VerisonTagcode)
	Return params
End Sub

Sub getTagList(sql As String, field As String) As Map
	Dim params As Map
	params.Initialize
	' VERIFICAR TODOS OS NOVOS
	Dim sList As String = Utils.List2Str(DBStructures.GetListOfFromScript(field, sql), "|")				'AAA|BBB
	'Log(sList)
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("locals", sList)
	Return params
End Sub

Sub getJSONData(data As String) As JSONParser
	Dim JSON1 As JSONParser
	If (Starter.StrFunc.Left(data, 1) = "[") Then
		data = Starter.StrFunc.Trim(Starter.StrFunc.Mid(data, 2, Starter.StrFunc.Len(data)-1))
	End If
	JSON1.Initialize(data)
	Return JSON1
End Sub


Sub UpdateData2Server(params As Map, target As Object, url As String)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
        
	Dim data As String =   JSON.ToPrettyString(1)
	Dim Job As HttpJob
	Job.Initialize("",target)
	Dim addr As String = url
	
	Job.PostString(addr, data )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
'		'Log(Job.GetString)
'		'MsgboxAsync("Operação executada com sucesso!", "Nota!")
'	Else
'		MsgboxAsync("Operação não executada!", "Alerta!")
	End If
	Job.Release
End Sub

Sub UpdateServer2Data(params As Map, target As Object, url As String, func As String)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
        
	Dim data As String =   JSON.ToPrettyString(1)
	Dim Job As HttpJob
	Job.Initialize("",target)
	Dim addr As String = url
	
	Job.PostString(addr, data )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		CallSub2( Me, func, Job.GetString)
		'Log(Job.GetString)
		'MsgboxAsync("Operação executada com sucesso!", "Nota!")
	Else
		Log("Erro no serviço")
	End If
	Job.Release
End Sub



	