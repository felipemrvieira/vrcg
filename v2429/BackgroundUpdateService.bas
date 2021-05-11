B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=9.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Private SqlFilesTotal As Int
	Private RequestFileName As String
	Private FTPFileList As List
	Private TagCodesString As String
	Private RequestTagcodes  As String
End Sub

Sub Service_Create

End Sub

Sub Service_Start (StartingIntent As Intent)
	
	'************************************************************************************************
	'Alteração PC, para garantir que o Serviço está em funcionamento e mostra no log quando executado
	'************************************************************************************************
	
	Log("BackgroundUpdateService: First Time")
		
	If Not(ShareCode.APP_WORKING_LOCAL) And Not(Starter.RunUpdate) Then
		Dim res As ResumableSub = CheckIfUpdateIsAvailable
		Wait For(res) Complete (IsUpdateAvailable As Boolean)
		If IsUpdateAvailable Then
			RunLiteUpdate
		End If
		Log("BackgroundUpdateService: Verify")
		Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
	End If
	
	StartServiceAt(Me, DateTime.Now + 150 * 1000, True) ' 2.5 minutos
	
End Sub

Sub Service_Destroy

End Sub



Sub CheckIfUpdateIsAvailable As ResumableSub
	
	If File.Exists(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_quicksync.def"$) Then
		Dim QuickSyncDate As String = File.readstring(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_quicksync.def"$)
	Else
		Dim QuickSyncDate As String = Utils.GetCurrDatetime
		File.writestring(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_quicksync.def"$, QuickSyncDate)
	End If
	
	Dim LoginUpdateFileName  As String= ""
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("name", ShareCode.SESS_User)
	params.Put("datetime", QuickSyncDate)
	params.Put("_user", ShareCode.SESS_User)
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
	
	Log(data)
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/requests-count-pending"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Log("Success" & Job.GetString)
				
			Dim JSON1 As JSONParser
			JSON1.Initialize(Job.GetString)
			Dim MapJSON As Map = JSON1.NextObject
			Dim status As Int = MapJSON.Get("status")
			If (status = 1) Then
				Dim NewRecordsCount As Int = MapJSON.Get("results")
				
				If NewRecordsCount > 0 Then
					RequestTagcodes = MapJSON.Get("requestTagcodes")
					Return True
					Log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
					Log("LITE UPDATES EXISTS")
					Log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
				End If
				
			End If

		Else
			Log("Success" & Job.ErrorMessage)
		End If
		Job.Release
	Else
		Log("Error APP_WORKING_LOCAL")
	End If
	Log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
	Log("NO LITE UPDATES")
	Log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
	Return False
End Sub


Sub RunLiteUpdate
	
	Dim res As ResumableSub = GenerateLiteUpdateFiles
	Wait For(res) Complete (GenerateComplete As Boolean)
	
	If (GenerateComplete) Then
		
		Dim UPDATE_INSTALL_INFO As String = $"${RequestFileName}.INFO"$
		Dim updateInstallFilesName As String = RequestFileName
		Dim res As ResumableSub = DownloadSqlFilesLiteUpdate(UPDATE_INSTALL_INFO, updateInstallFilesName)
		Wait For(res) Complete (result As Boolean)
							
		If(result)Then

			Dim res As ResumableSub = ExecuteSqlFiles(updateInstallFilesName)
			Wait For(res) Complete (finish As Boolean)
								
			If(finish)Then
				SendServerProcessComplete
				Dim res As ResumableSub = DeleteSqlFiles(updateInstallFilesName)
				Wait For(res) Complete (IsFilesDeleted As Boolean)
								
				If(IsFilesDeleted) Then
					Dim res As ResumableSub = UpdateFilesWithFTP("")
					Wait For(res) Complete (IsDownloadFilesFinish As Boolean)
								
					If (IsDownloadFilesFinish) Then
						Dim QuickSyncDate As String = Utils.GetCurrDatetime
						File.writestring(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_quicksync.def"$, QuickSyncDate)
					End If
				End If
			End If
		End If
		
	End If
	
End Sub


Sub GenerateLiteUpdateFiles As ResumableSub
	
	Dim QuickSyncDate As String = File.readstring(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_quicksync.def"$)
	
	RequestFileName = Utils.RandomString
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("name", RequestFileName)
	params.Put("newReturn", ShareCode.newreturn)
	params.Put("datetime", QuickSyncDate)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("requestTagcodes", RequestTagcodes)
	params.Put("smart", ShareCode.ISPHONE)
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
	
	Log(data)
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/requests-pending"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Log("Success" & Job.GetString)
			Return True
		Else
			Log("Success" & Job.ErrorMessage)
		End If
		Job.Release
	Else
		Log("Error APP_WORKING_LOCAL")
	End If
	Return False
End Sub


Sub DownloadSqlFilesLiteUpdate(fileInfo As String,Filename As String) As ResumableSub
	
	SqlFilesTotal = 0
	Dim res As ResumableSub = GetLoginUpdateInstalSqlFilesTotal(fileInfo)
	Wait For(res) complete (result As Int)
	SqlFilesTotal = result
	
	' ALEM DE RETORNAR O NUMERO DE SCRIPTS A EXECUTAR, JA APAGOU OS TAGCODES QUE VAI ACTUALIZAR
	
	If(SqlFilesTotal > 0)Then
		For i = 1 To SqlFilesTotal
			Dim Filen As String = $"${Filename}${i}.sql"$
			Dim rs As ResumableSub = DownloadSqlFileWithFTP(Filen)
			Wait For(rs) Complete (finish As Boolean)
		Next
		Return True
	End If

	Return False
End Sub

Sub GetLoginUpdateInstalSqlFilesTotal(Filename As String) As ResumableSub
	TagCodesString = ""
	Dim trycount As Int = 0
	Dim dotry As Boolean = True
	Dim total As Int = -1
	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
	Dim ctm As CustomTrustManager
	ctm.InitializeAcceptAll
	GlobalFTP.SetCustomSSLTrustManager(ctm)
	GlobalFTP.TimeoutMs =240000
	Do While (dotry And (trycount <3))
		Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & Filename, False, Starter.Provider.SharedFolder, Filename)
		Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
		If Success Then
			
			Try
				Log(Filename & " file was download successfully")
				
				If ShareCode.newReturn = 1 Then
					Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, Filename)
					Dim parser As JSONParser
					parser.Initialize(JsonStruct)
					Dim root As Map = parser.NextObject
					Dim DataHora As String = root.Get("datetime")
					Dim Totalfiles As Int = root.Get("files")
					Dim inserts As List = root.Get("inserts")
					'**************************************************************************************
					' APAGA OS REGISTOS CORRESPONDENTES AOS INSERTS QUE ESTAO NOS SCRIPTS SQL A EXECUTAR
					' ABAIXO. ISTO GARANTE QUE NAO VAMOS TER ERROS DE INDICES
					'**************************************************************************************
					For Each colinserts As Map In inserts
						Dim mastertagcode As String = colinserts.Get("mastertagcode")
						Try
							Dim childfield As String = colinserts.Get("childfield")
						Catch
							Dim childfield As String = ""
							Log(LastException)
						End Try
						Dim tagcodelist As String = colinserts.Get("tagcodelist")
						Dim NewInfoList As List = Regex.Split("\|", tagcodelist )
						Dim table As String = colinserts.Get("table")
							
						For i=0 To NewInfoList.Size -1
							Dim res As ResumableSub = DBStructures.RemoveRecsFromTable(table,mastertagcode,childfield,"",NewInfoList.Get(i))
							Wait For(res) Complete (result As Boolean)
						Next
						
					Next
					'******************************************************************************
					total = Totalfiles
					Dim date As String = DataHora
					Utils.UpdateLiteUpdateDateTime(date)
					DBStructures.UpdateWorkerDbLastUpdate(date)
					dotry = False
					trycount = 3
					GlobalFTP.Close
					'******************************************************************************
				Else
					Dim List1 As List
					List1 = File.ReadList(Starter.Provider.SharedFolder, Filename)
					total = List1.Get(0) ' Numero de ficheiros para download
					Dim date As String = List1.Get(1)
					Utils.UpdateLiteUpdateDateTime(date)
					DBStructures.UpdateWorkerDbLastUpdate(date)
					dotry = False
					trycount = 3
					GlobalFTP.Close
				End If

			Catch
				Log(LastException)
				trycount = trycount +1
			End Try
			
		Else
			Log(LastException)
			Log("Error downloading file " & Filename)
			trycount = trycount +1
		End If
	Loop
	

	GlobalFTP.Close
	Return total
End Sub



Sub DownloadSqlFileWithFTP(Filename As String) As ResumableSub

	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
	GlobalFTP.TimeoutMs =240000
	Log(Filename)
	Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & Filename, False, Starter.Provider.SharedFolder, Filename)
	Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
	If Success Then
		Log(Filename & " file was download successfully")
		GlobalFTP.Close
		Return True
	Else
		GlobalFTP.Close
		Return False
		Log("Error downloading file " & Filename)
	End If
End Sub

Sub ExecuteSqlFiles(fileName As String) As ResumableSub
	If(SqlFilesTotal > 0)Then
'		Try
		
		If ShareCode.NewRequestsList.IsInitialized Then
			ShareCode.NewRequestsList.Clear
		Else
			ShareCode.NewRequestsList.Initialize
		End If
		
		For i = 1 To SqlFilesTotal
			Dim fileN As String = $"${fileName}${i}.sql"$
			Dim List1 As List
			
			Try
				List1 = File.ReadList(Starter.Provider.SharedFolder, fileN)
			Catch
				Log(LastException)
			End Try

			If (List1.IsInitialized) Then
				For n = 0 To List1.Size - 1
					Dim Script2Execute As String = List1.Get(n)
					Log(Script2Execute)
'					Dim rs As ResumableSub = MakeExecuteSqlFiles(sval, True)
'					Wait For(rs) Complete (finish As Boolean)
					Try
						Utils.SaveSQLToLog("BackgroundUpdateService",Script2Execute, "")
						'**************************************************************
						' ALTERACAO PC
						' INSERT DE NOTIFICACAO DE QUE HA INTERVENCOES NOVAS
						'**************************************************************
						
						If Script2Execute.Contains("INSERT INTO `dta_requests`") Then
							Dim SplitScript As List  = Regex.Split(",", Script2Execute)
							For x=0 To SplitScript.Size -1
								Dim dummy As String = SplitScript.Get(x)
								If dummy.StartsWith("'I_") Or dummy.StartsWith("'IP_")Then 
									Dim Request_tagcode As String = SplitScript.Get(x)
									Request_tagcode = Request_tagcode.Replace("'","")
									ShareCode.NewRequestsList.Add(Request_tagcode)
								End If
							Next
						End If

						'**************************************************************
					Catch
						Log($"ERROR: ${Script2Execute} - EXCEPTION = ${LastException}"$)
					End Try
				Next
			Else
				Utils.logError("Update SQL", ShareCode.SESS_OPER_User, $"${fileName}${i}.sql"$)
			End If
		
		Next
		InsertAlertNewRequests
		Return True
'		Catch
'			Log(LastException)
'		End Try
	End If
	Return False
End Sub

Sub InsertAlertNewRequests
	
	Log("INSERT ALERTA BACKGROUNDUPDATESERVICE")
	Private nRecord As Cursor
	If ShareCode.NewRequestsList.Size > 0 Then
		Dim Alert_text As String = ""
		For x=0 To ShareCode.NewRequestsList.Size -1
			Dim ItemFromList As String = ShareCode.NewRequestsList.Get(x)
			
			Dim sSQL As String = $"SELECT  t.title as tipointervencao , ifnull(o.title_import,'') as nomeobjecto , r.tagcode as intervencao ,
					r.entity_tagcode,p.title_import AS nomecliente,ifnull(p.reference, 'x') AS numerocliente,o.title_import AS estabelecimento,
					r.req_date as datareq, r.req_time as horareq, l.address as morada, l.postalcode as cpostal, l.local as localidade,
					l.latitude as latitude, l.longitude as longitude from dta_requests AS r
					INNER JOIN dta_typerequests AS t ON (t.tagcode = r.typerequest_tagcode)
					LEFT JOIN dta_objects AS o ON (o.tagcode = r.object_tagcode)
					LEFT JOIN dta_objects AS p ON (p.tagcode = r.entity_tagcode)
					LEFT JOIN dta_locations as l on (l.tagcode = p.local_tagcode)
					WHERE 1=1 and r.tagcode ='${ItemFromList.Trim}'"$	
			
			nRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)
			
			If nRecord.RowCount > 0 Then
				nRecord.Position = 0
				Dim intervencao As String = nRecord.GetString("intervencao")
				Dim nomeobjecto As String = nRecord.GetString("nomeobjecto")
				Dim tipointervencao As String = nRecord.GetString("tipointervencao")
				Dim numerocliente As String = nRecord.GetString("numerocliente")
				Dim nomecliente As String = nRecord.GetString("nomecliente")
				Dim estabelecimento As String = nRecord.GetString("estabelecimento")
				Dim morada As String = nRecord.GetString("morada")
				Dim cpostal As String = nRecord.GetString("cpostal")
				Dim localidade As String = nRecord.GetString("localidade")
				Dim latitude As String = nRecord.GetString("latitude")
				Dim longitude As String = nRecord.GetString("longitude")
				Dim datareq As String = Utils.IfNullOrEmpty(nRecord.GetString("datareq"),Utils.GetCurrentDate)
				Dim horareq As String = Utils.IfNullOrEmpty(nRecord.GetString("horareq"), Utils.GetCurrentTimeExt)
				If numerocliente = "" Then numerocliente = "0"
				Dim AlertsLoc As String = $"${datareq} - ${horareq} - ${latitude}/${longitude}"$
				Alert_text = Alert_text & $"${tipointervencao} - ${nomeobjecto} (${intervencao})${CRLF}${numerocliente}:${nomecliente}${CRLF}${estabelecimento}"$
			End If
			
			
		Next
		nRecord.close
		Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
		Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
		Dim sSQL1 As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
							values (${mID}, '${alerttagcode}', '', 'ALRTREL_REQUESTS', 'ALRTTYP_REQUESTS', 1, 1, '${Alert_text}', 
		'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
		Utils.SaveSQLToLog("InsertAlertNewRequests",sSQL1, "")
		
		Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts_images", "id", "") + 1+ 1000000
		Dim sSQL2 As String = $"insert into dta_alerts_images
				(id, tagcode, imageb64, imagename, assigned, active, obs)
				values (${mID}, '${alerttagcode}', '', '', 0, 1, '${AlertsLoc}')"$
		Utils.SaveSQLToLog("InsertAlertNewRequests_obs",sSQL2, "")
		
		CallSub(MainMenu,"BadgeCheckUpdate")


	End If

	
End Sub

Sub MakeExecuteSqlFiles(script As String, isupdate As Boolean) As ResumableSub
'	Log("IsUpdate " & isupdate)
'	If (Utils.NNE(script)) Then
'		If ( (script.Contains("dta_requests"))) Then
'		If (Utils.NNE(TagCodesString)) Then
'			Dim res As ResumableSub = DBStructures.DeleteFromLocalDatabaseFromString(TagCodesString)
'			Wait For(res) Complete (result As Boolean)
'			If(result)Then
'				TagCodesString = ""
'			End If
'		End If
'	End If
	
	
'		Else If ((isupdate) And (script.Contains("dta_tasks"))) Then
'			If (Utils.NNE(TagCodesTasksString)) Then
'				Dim res As ResumableSub = DBStructures.DeleteTasksFromLocalDatabaseFromString(TagCodesTasksString)
'				Wait For(res) Complete (result As Boolean)
'				If(result)Then
'					TagCodesTasksString = ""
'				End If
'			End If
'		Else If ((isupdate) And (script.Contains("dta_typerequests"))) Then
'			If (Utils.NNE(TagCodesTPRequestsString)) Then
'				Dim res As ResumableSub = DBStructures.DeleteTPRequestsFromLocalDatabaseFromString(TagCodesTPRequestsString)
'				Wait For(res) Complete (result As Boolean)
'				If(result)Then
'					TagCodesTPRequestsString = ""
'				End If
'			End If
'		Else If ((isupdate) And (script.Contains("dta_objects"))) Then
'			If (Utils.NNE(TagCodesObjectsString)) Then
'				Dim res As ResumableSub = DBStructures.DeleteObjectsFromLocalDatabaseFromString(TagCodesObjectsString)
'				Wait For(res) Complete (result As Boolean)
'				If(result)Then
'					TagCodesObjectsString = ""
'				End If
'			End If
'		End If
'		'TagCodesTasksString
'End If

'		Try
'			Utils.SaveSQLToLog("BackgroundUpdateService",script, "")
'			Return True
'		Catch
'			Log($"ERROR: ${script} - EXCEPTION = ${LastException}"$)
'			Return False
'		End Try

End Sub

Sub DeleteSqlFiles(fileName As String) As ResumableSub
	If(SqlFilesTotal > 0)Then
		For i = 1 To SqlFilesTotal
			Dim fileN As String = $"${fileName}${i}.sql"$
			If(File.Exists(Starter.Provider.SharedFolder, fileN)) Then
				File.Delete(Starter.Provider.SharedFolder, fileN)
			End If
		Next
		Return True
	End If
	Return False
End Sub

Sub DownloadFilesWithFTP(dlg As Label) As ResumableSub
	Dim CURRENT_COUNTER As Int = 0
	Dim END_COUNTER As Int = 0
	Log("************************************************************")
	Log($" 		INITIAL : ${ShareCode.APPL_HOST}/${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
'	Dim ctm As CustomTrustManager
'	ctm.InitializeAcceptAll
'	myFTP.SetCustomSSLTrustManager(ctm)
	GlobalFTP.TimeoutMs =240000
	Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
	'
	'Dim sfl As Object = Starter.GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
	
	Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	If Success Then
'		For i = 0 To Folders.Length - 1
'			Log(Folders(i).Name)
'		Next
		'
		Dim LMDate As Long = Utils.GetLastNDaysLong(1) '.GetLastMonthDateLong
		If (Files.Length >= 1) Then
			FTPFileList.Initialize
			For i = 0 To Files.Length - 1
				Dim fName As String = Files(i).Name
				If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".jpeg"))  Or _
						(fName.EndsWith(".pdf"))  Or (fName.EndsWith(".doc"))  Or (fName.EndsWith(".docx"))  Or _
						(fName.EndsWith(".xls"))  Or (fName.EndsWith(".xlsx"))  Or _
						(fName.EndsWith(".ppt")) Or (fName.EndsWith(".pptx")) Then
					If (Files(i).Timestamp >= LMDate) Then
						FTPFileList.Add(Files(i).Name)
					End If
				End If
			Next
		End If
	Else
		Log("error getting files list")
		CURRENT_COUNTER = END_COUNTER
	End If

	If (FTPFileList.IsInitialized) Then
		If (FTPFileList.Size>=1) Then
			END_COUNTER = FTPFileList.Size-1
			For i=0 To FTPFileList.Size-1
				Dim fName As String = FTPFileList.Get(i)
				'If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
				Log(fName)
				Try
					Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
					Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
					If Success Then
						Log("file was download successfully")
					Else

						Log("Error downloading file")
					End If
					'End If
				Catch
					Log(LastException)
				End Try
				
				If (FTPFileList.Size-1 > CURRENT_COUNTER) Then
					CURRENT_COUNTER = CURRENT_COUNTER+1
				End If
			Next
		End If
		
	End If
	GlobalFTP.Close
	Return True
End Sub



Sub UpdateFilesWithFTP(datacontrol As String) As ResumableSub
	Dim CURRENT_COUNTER As Int = 0
	Dim END_COUNTER As Int = 0
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
		Log( $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$ )
		Log("************************************************************")
		Dim flist As List : flist.Initialize  ' = File.ListFiles(Starter.InternalFolder)
		Dim flisthtml As List : flisthtml.Initialize
		
		Dim GlobalFTP As FTP
		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
'		Dim ctm As CustomTrustManager
'		ctm.InitializeAcceptAll
'		myFTP.SetCustomSSLTrustManager(ctm)
		GlobalFTP.TimeoutMs =240000
		
		
		''		Dim sf As Object = Starter.GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/20190212_113320.jpeg", False, Starter.SharedFolder, "20190212_113320.jpeg")
		''		Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
		''		If Success Then
		''			Log("file was download successfully")
		''		Else
		''			Log("Error downloading file")
		''		End If
		
		
		Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
		'
		'Dim sfl As Object = Starter.GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
		Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
		
		If Success Then

			'************************************************************
			' CRIA LISTA DE FICHEIROS COM BASE NA DATA INDICADA
			'************************************************************
			If (Files.Length >= 1) Then
				flist.Initialize
				For i = 0 To Files.Length - 1
					Dim fName As String = Files(i).Name
					If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".jpeg"))  Or _
						(fName.EndsWith(".pdf"))  Or (fName.EndsWith(".doc"))  Or (fName.EndsWith(".docx"))  Or _
						(fName.EndsWith(".xls"))  Or (fName.EndsWith(".xlsx"))  Or _
						(fName.EndsWith(".ppt")) Or (fName.EndsWith(".pptx")) Then
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
						If ((Files(i).Timestamp >= datacontrolParse) Or Not(Files(i).Name.StartsWith("REPORT_"))) Then
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
				If Not(flistLast.IsInitialized) Then
					flistLast.Initialize
				End If
				
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
						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
						If Success Then
							Log("file was download successfully")
						Else
							Log("Error downloading file")
						End If
						'End If
						
						If (flistLast.Size-1 > CURRENT_COUNTER) Then
							CURRENT_COUNTER = CURRENT_COUNTER+1
						End If
					Next
				Else
					CURRENT_COUNTER = END_COUNTER
					Log("vazio 0")
				End If
			Else
				CURRENT_COUNTER = END_COUNTER
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
					CURRENT_COUNTER = 0
					END_COUNTER = flistLast.Size-1
					For i=0 To flistLast.Size-1
						Dim fName As String = flistLast.Get(i)
						'If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
						Log(fName)
						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
						If Success Then
							Log("file was download successfully")
						Else
							Log("Error downloading file")
						End If
						'End If
						If (flistLast.Size-1 > CURRENT_COUNTER) Then
							CURRENT_COUNTER = CURRENT_COUNTER+1
						End If
					Next
				Else
					CURRENT_COUNTER = END_COUNTER
					Log("vazio 0")
				End If
			Else
				CURRENT_COUNTER = END_COUNTER
				Log("vazio 1")
			End If
			'Starter.GlobalFTP.Close
		Else
			CURRENT_COUNTER = END_COUNTER
			Log("Sem sucesso!")
		End If
		
		
		GlobalFTP.Close
		Return True
	Else
		CURRENT_COUNTER = END_COUNTER
		Log("vazio 2")
	End If
	Return True
End Sub

Sub SendServerProcessComplete As ResumableSub
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/removeFilesSqlite"$
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("name", RequestFileName)
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

	Job.PostString(ServerAddress, data)
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Return True
	Else
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	
	Return False
End Sub














