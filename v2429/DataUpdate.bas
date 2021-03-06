B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public Device As Phone
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private lbldataupdatetitle As Label
	Private PanelCopyData As Panel
	Private LabelCopyData As Label
	Private lbldataupdatecopy As Label
	Private lbldataupdateload As Label
	Private lbldataupdatedownload As Label
	Private ProgressBar1 As ProgressBar
	Private lbldataupdateprocess As Label
	Private dataLayout As String
	Private ButtonWelcomeNext As Button
	Private SqlFilesTotal As Int
	Private FTPFileList As List
	Private FTPFileList2 As List
	Private RequestFileName As String
	Private RequestFileNameHeaders As String
	Private RequestFileNameOnDay As String
	Private TagCodes As List
	Private TagCodesString As String
	Private TagCodesTasksString As String
	Private TagCodesTPRequestsString As String
	Private TagCodesObjectsString As String
	Private TagCodesLocationsString As String
	Private TagCodesContactsString As String
	Private TagCodesWarehousesString As String
	Private TagCodesArticlesString As String
	Private FlagFirstProcessStep As Int = 0
	Private LabelUpdateProcess As Label
	Private ImageDownload As ImageView
	Private ImageUpload As ImageView
	Private LabelLoadData As Label
	Private LabelDownloadData As Label
	Private CurrentCounter As Int = 0
	Private IsLoginUpdate As Boolean = False
	Private FirstInstallUpdateDate As String
	Private FirstInstallUpdateDate As String
	Private DataUpdateProgressBar As ProgressBar
	Private DataUpdateLabelTarefa As Label
	Private DataUpdateProgressBar2 As ProgressBar
	Private ListaIntervencoesOffline As CustomListView
	Private ChkReqOffline As CheckBox
	Private txtReqOffline As EditText
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	dataLayout = "dataupdate_layout"
	Activity.LoadLayout(dataLayout)
	
	'LabelCopyData.Text =  ShareCode.DataUpdateLabelCopyData
	'LabelLoadData.Text = ShareCode.DataUpdateLabelLoadData
	'LabelDownloadData.Text = ShareCode.DataUpdateLabelDownloadData
	'LabelUpdateProcess.text = ShareCode.DataUpdateLabelUpdateProcess
	ButtonWelcomeNext.Text = ShareCode.DataUpdateButtonWelcomeNext
	
	'Utils.SetViewBackgroundColorToMainColor(ButtonWelcomeNext)
	ButtonWelcomeNext.Enabled = False
	CurrentCounter = 0
'	StartTheActivity(False)
End Sub

Sub StartTheActivity(IsLogin As Boolean)
'	Sleep(100)
'	Try
'		CallTheUpdate
'	Catch
'		Log(LastException)
'		ButtonWelcomeNext_Click
'	End Try

	'**************************************************************************
	' ALTERACAO PC
	' DESACTIVAR O BLOCO TRY ACIMA E ACTIVAR O ABAIXO PARA O NOVO SINCRONISMO
	'**************************************************************************
'	Try
'		If (Starter.FirstInstall) Then
'			CallTheUpdateFirstTime
'		Else
'			CallTheUpdate2Sync
'		End If
'	Catch
'		Log(LastException)
'		ButtonWelcomeNext_Click
'	End Try
	'
'	Log(IsLogin)
End Sub


Sub FirstSubFromLogin
	'**********************************************************************************
	' APOS O LOGIN VERIFICA SE EXISTEM UPDATES DO APK Actualiza ou nao
	' VERIFICA SE E O PRIMEIRO LOGIN DO UTILIZADOR
	' ShareCode.LOGINJORNADA = TRUE
	' SE SIM, DESCARREGA OS CABECALHOS E O REGISTOS DIARIOS
	' SE NAO, DESCARREGA OS REGISTOS DIARIOS
	'**********************************************************************************
	Starter.StopLocationCheck = True
	StopService(LocationService)
	ButtonWelcomeNext.Enabled = False
'	ProgressBar1.Visible = True

	'    --------------------------------------------------
	'    ACTUALIZACAO MANUAL DA TABELA dta_auths
	'    --------------------------------------------------
	
	Dim DBU As ResumableSub = insert_dta_auth
	Wait For (DBU) Complete (Finished As Boolean)


	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim ChkLocData As ResumableSub = UpdateData2Server
		Wait For (ChkLocData) Complete (Finished As Boolean)
	End If
	
	'so para testar
'	ProgressDialogShow2("Processando logs. Aguarde por favor !",False)
'	If Not(ShareCode.APP_WORKING_LOCAL) Then
'		Dim SLF As ResumableSub = SendLogs2Ftp
'		Wait For (SLF) Complete (Finished As Boolean)
'	End If
'	ProgressDialogHide


	If (ShareCode.FIRSTLOGININDEVICE) Then ' Primeiro Login no dispositivo, faz headers e onday
	
'		ProgressDialogShow2("Processando logs. Aguarde por favor !",False)
'		If Not(ShareCode.APP_WORKING_LOCAL) Then
'			Dim SLF As ResumableSub = SendLogs2Ftp
'			Wait For (SLF) Complete (Finished As Boolean)
'		End If
'		ProgressDialogHide
		
		Dim res As ResumableSub = RunUpdate60Last7Next
		Wait For(res) Complete (result As Boolean)
		Log("RunUpdate60Last7Next")
		
		If (SqlFilesTotal <= 0) Then
			ToastMessageShow(ShareCode.MsgNaoExistemActualizacoes,True)
		End If
		Starter.StopLocationCheck = False
		StartService(LocationService)
		ProgressDialogHide
		ButtonWelcomeNext.Enabled = True
	End If
	
	
	ShareCode.GlobalEventsTimer = 0
	
	If ShareCode.FIRSTDAILYLOGIN Then
		Starter.StopLocationCheck = True
		StopService(LocationService)
		ButtonWelcomeNext.Enabled = False
		
		Dim res2 As ResumableSub = RunUpdateOnDay
		Wait For(res2) Complete (result As Boolean)
		Log("RunUpdateOnDay")
		
		Starter.StopLocationCheck = False
		StartService(LocationService)
		ProgressDialogHide
		ButtonWelcomeNext.Enabled = True
	Else
		Starter.StopLocationCheck = True
		StopService(LocationService)
		ButtonWelcomeNext.Enabled = False
		
		ShareCode.SyncManualComponents.Initialize
		ShareCode.SYNC_COMPONENTS = ""
		ShareCode.DownloadDocsFromFTP = False
		ShareCode.AutoSyncFromLogin = True
		Dim res3 As ResumableSub = RunSync("",False)
		Wait For(res3) Complete (result As Boolean)
		Log("First RunSync Auto")
		ShareCode.AutoSyncFromLogin = False
		Starter.StopLocationCheck = False
		StartService(LocationService)
		ProgressDialogHide
		ButtonWelcomeNext.Enabled = True
	End If
			
	If File.Exists(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_ON"$) Then
		File.Delete(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_ON"$)
	End If
		
	If File.Exists(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_autosync.log"$) Then
		Dim LastDoneUpdateStr As String = File.ReadString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_autosync.log"$)
		Dim LastDoneUpdate As Long = DateTime.DateParse(LastDoneUpdateStr)
		Dim LastDueUpdate As Long = Utils.getlastndayslong(2)
		If (LastDoneUpdate < = LastDueUpdate) Then
			InsertAlertSistema(0, LastDoneUpdateStr)
		End If
	End If
		
	If (SqlFilesTotal = 0) Then ToastMessageShow(ShareCode.MsgNaoExistemActualizacoes,True)
		
	ProgressDialogHide
	Starter.StopLocationCheck = False
	StartService(LocationService)
	ButtonWelcomeNext.Enabled = True
		
'	End If
	
	' NUNCA SE VERIFICA ESTA CONDICAO POIS JA E VERIFICADA ANTES DE ENTRAR NESTA SUB E ENTRA PARA O MAINMENU SE FOR VERDADEIRA
	If Not(ShareCode.FIRSTLOGININDEVICE) And Not(ShareCode.FIRSTDAILYLOGIN) Then
		ButtonWelcomeNext_Click
	End If
	
End Sub

Sub SendLogs2Ftp As ResumableSub
	
	Dim ret As Boolean = False
	Dim dtf As String = DateTime.DateFormat
	DateTime.DateFormat = "yyyyMMdd"
	Dim date2name As String = DateTime.Date(DateTime.Now)
	DateTime.DateFormat = dtf
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
	myFTP.TimeoutMs =240000
	Dim ListaFiles As List = File.ListFiles(Starter.SharedFolder)
	Try
		Dim sf As Object = myFTP.SendCommand("MKD",$"${ShareCode.APP_DOMAIN}/errorlogs"$)
		Wait For (sf) myFTP_CommandCompleted (Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
	
		For f=0 To ListaFiles.Size -1
			Dim File2check As String = ListaFiles.Get(f)
			If File2check.Contains("-ErrorsLog.txt") And Not(File2check.Contains(date2name)) Then
				Log(File2check)
				Dim sf As Object = myFTP.UploadFile(Starter.SharedFolder, File2check, False, "/" & ShareCode.APP_DOMAIN & "/" & File2check)
				Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
				
				If Success Then
					Log("file was uploaded successfully")
					ret = True
				Else
					Log("Error uploading file")
					ret = False
				End If
			End If
		Next
		ret = True
		myFTP.Close
	Catch
		ret = False
		Log(LastException)
	End Try
	
	Sleep(250)
	Return ret
	
End Sub

Sub InsertAlertSistema(TypeOfAlert As Int, LastSyncDay As String)
	
	If TypeOfAlert = 0 Then
		Log("INSERT ALERTA LONG TIME NO UPDATE")
		Dim Alert_text As String = $"A Ultima sincronização efectuada foi no dia : ${LastSyncDay}"$
	Else If TypeOfAlert = 1 Then
		Log("INSERT ALERTA ERRO UPDATE OFFLINE")
		Dim Alert_text As String = $"Alguns dados não foram enviados para o Servidor"$
	End If
	

	Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
	Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
	Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
							values (${mID}, '${alerttagcode}', '', 'ALRTREL_REQUESTS', 'ALRTTYP_ALERT', 1, 1, '${Alert_text}', 
	'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
	Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")
	CallSub(MainMenu,"BadgeCheckUpdate")
End Sub


Sub ButtonWelcomeNext_Click
'	Utils.LogUserAction("TUSRLGOT_17", Me)
'	Sleep(500)
	CallSubDelayed2(MainMenu, "StartTheActivity", True)
	Activity.Finish
	'   *******************************************************************
'	Chamar a rotina de Actualizacao so no caso de ter sido uma instalacao inicial
'	para actualizar tarefas e intervencoes existentes
	'   *******************************************************************
'	If Not(ShareCode.APP_WORKING_LOCAL) Then
'		CallSubDelayed2(Me, "StartTheActivity",False)
'	Else
'		MsgboxAsync("Não é possível sincronizar dados com o servidor pois não existe rede de acesso!", "Alerta!")
'	End If

End Sub

Sub SetUpDownArrows(Mode As String)
	
	If Mode.ToUpperCase ="DOWNLOAD" Then
		ImageDownload.Visible = True
		ImageUpload.Visible = False
	Else
		ImageUpload.Visible = True
		ImageDownload.Visible = False
	End If
	
End Sub

Sub SetUpdateHTTPRecord(inRec As ResultSet, withImg As Boolean, def As Int, TC_Filter As String) As ResumableSub
	If withImg Then
		Dim up_type As Int = Utils.IfNullOrEmpty(inRec.GetInt("up_type"), def)
	End If
	Dim up_date As String = Utils.IfNullOrEmpty(inRec.GetString("up_date"), "")
	Dim up_values As String = Utils.IfNullOrEmpty(inRec.GetString("up_values"), "")
	Dim up_tableurl As String = Utils.IfNullOrEmpty(inRec.GetString("up_tableurl"), "")
	If Utils.NNE(up_tableurl) And Utils.NNE(up_values) Then
		Dim rr As ResumableSub = UtilAPIUpdate(up_values, Me, up_tableurl)
		Wait For(rr) complete (finished As Boolean)
		
		If (finished = False) Then
			' INSERIR ALERTA EM QUE DADOS NAO FORAM ACTUALIZADOS
			InsertAlertSistema (1,"")
			Return False
		End If
		
		Try
			If withImg Then
				Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}' and up_type=${up_type} ${TC_Filter}"$
			Else
				Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}' ${TC_Filter}"$
			End If
				
			Starter.LocalSQLWRK.ExecNonQuery(upd)
			Return True
		Catch
			Log(LastException)
			Return False
		End Try
	Else
		Return True
	End If
	
End Sub

Sub SetUpdateHTTPEmailRecord(inRec As ResultSet, TC_Filter As String) As ResumableSub
	
	Dim up_date As String = Utils.IfNullOrEmpty(inRec.GetString("up_date"), "")
	Dim up_values As String = Utils.IfNullOrEmpty(inRec.GetString("up_values"), "")
	Dim up_tableurl As String = Utils.IfNullOrEmpty(inRec.GetString("up_tableurl"), "")
	If Utils.NNE(up_tableurl) And Utils.NNE(up_values) Then
		Dim rr As ResumableSub = UtilAPIUpdate(up_values, Me, up_tableurl)
		Wait For(rr) complete (finished As Boolean)
		If (finished = False) Then
			' INSERIR ALERTA EM QUE DADOS NAO FORAM ACTUALIZADOS
			InsertAlertSistema (1,"")
			Return False
		End If
		
		Try
			Dim upd As String = $"update loc_updateemails set up_state= 1 where up_date='${up_date}' ${TC_Filter}"$
			Starter.LocalSQLWRK.ExecNonQuery(upd)
			Return True
		Catch
			Log(LastException)
			Return False
		End Try
	Else
		Return True
	End If
	
End Sub

Sub SetUpdateFTPRecord(inRec As ResultSet, withImg As Boolean, def As Int, TC_Filter As String)
	If withImg Then
		Dim up_type As Int = Utils.IfNullOrEmpty(inRec.GetInt("up_type"), def)
	End If
	Dim up_date As String = Utils.IfNullOrEmpty(inRec.GetString("up_date"), "")
	Dim up_values As String = Utils.IfNullOrEmpty(inRec.GetString("up_values"), "")
	Dim up_tableurl As String = Utils.IfNullOrEmpty(inRec.GetString("up_tableurl"), "")
	If Utils.NNE(up_tableurl) And Utils.NNE(up_values) Then
		Dim rr As ResumableSub = UtilAPIUploadFile(up_tableurl, up_values)
		Wait For(rr) complete (finished As Boolean)
		If (finished = True) Then
			Try
				If withImg Then
					Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}' and up_type=${up_type} ${TC_Filter}"$
				Else
					Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}' ${TC_Filter}"$
				End If
				Starter.LocalSQLWRK.ExecNonQuery(upd)
			Catch
				Log(LastException)
			End Try
		End If
	End If
End Sub

Sub UtilAPIUpdate(params As String, target As Object, url As String)  As ResumableSub
	Dim Job As HttpJob
	Job.Initialize("",target)
	Dim addr As String = url

	Job.PostString(addr, params )
	Log(params)
	Log(addr)
	Job.GetRequest.SetContentType("application/json")

	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Dim Status As Int = Utils.JobAPIStatus(Job)
		Log($"Status: ${Status}"$)
		Job.Release
		Return True
	Else
		Job.Release
		Sleep(250)
		Return False
	End If
	
End Sub

Sub UtilAPIUploadFile(url As String, filename As String)  As ResumableSub
	Dim ret As Boolean = False
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
	myFTP.TimeoutMs =240000
	
	Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, filename, False, url & filename)
	Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
	Log($"Ficheiro: ${filename}, URL: ${url}, Status: ${Utils.Bool2String(Success)}"$)
	ret = Success
	myFTP.Close
	Return ret
End Sub

Sub LocalDataToUpdate As Int
	Dim ret As Int = 0
	'Dim sSQL As String = $"select distinct up_date from loc_updatesrever where up_state=0"$
	Dim sSQL As String = $"select distinct count(0) as total from loc_updatesrever where up_state=0"$
	Dim iRecord As Cursor
	Try
		iRecord = Starter.LocalSQLWRK.ExecQuery(sSQL)
		If (iRecord.RowCount>0) Then
			iRecord.Position = 0
			ret = iRecord.GetInt("total")
			Log("««««««««««««««««««««««««««««««««««««")
			Log($"Total local data to upload:${ret}"$)
			Log("««««««««««««««««««««««««««««««««««««")
			
		End If
		
	Catch
		Log(LastException)
		InsertAlertErrors($"Erro ao enviar os dados locais para o Servidor ${CRLF}${LastException}"$)
		ret = 0
	End Try
	iRecord.Close
	Return ret
End Sub


Sub DUProgressBar(MaxVal As Int, CurrentVal As Int)
	Dim CurrentVal As Int = (100 * CurrentVal / MaxVal)
	DataUpdateProgressBar.Progress = CurrentVal
End Sub

Sub DUProgressBar2(MaxVal As Int, CurrentVal As Int)
	Dim CurrentVal As Int = (100 * CurrentVal / MaxVal)
	DataUpdateProgressBar2.Progress = CurrentVal
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'*********************************************************************
' TIP: Chamada de Operação de download de pedidos 60Last7Next
'*********************************************************************
Sub RequestUpdate60Last7Next As ResumableSub
	
	RequestFileNameHeaders = Utils.RandomString
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/requests/headers"$
	
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("name", RequestFileNameHeaders)
	params.Put("newReturn", ShareCode.newreturn)
	params.Put("date", Utils.GetCurrDatetime)
	params.Put("smart", ShareCode.ISPHONE)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	
	
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String = JSON.ToPrettyString(1)
	
	Utils.ShowProcinLog("DataUpdate","RequestUpdate60Last7Next",data)
	
	Job.PostString(ServerAddress, data)
	Job.GetRequest.SetContentType("application/json")
	Job.GetRequest.Timeout = 90000
	
	Wait For (Job) JobDone(Job As HttpJob)
	
	If Job.Success Then
		Log(ServerAddress)
		Utils.ShowProcinLog("DataUpdate","RequestUpdate60Last7Next","/api/orion/generate/requests/headers : CONCLUIDA")
		Job.Release
		Return True
	Else
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		Log(ServerAddress)
		Utils.ShowProcinLog("DataUpdate","RequestUpdate60Last7Next","ERRO NA TAREFA /api/orion/generate/requests/headers")
		Job.Release
		Return False
	End If

End Sub

'*********************************************************************
' TIP: Remoção de ficheiros de download INFO
'*********************************************************************
Sub RemoveAllLocalInfoAndSqlFiles As ResumableSub
	
	Dim LocaRes As Boolean = False
	Wait For (File.ListFilesAsync(Starter.Provider.SharedFolder)) Complete (Success As Boolean, Files As List)
	If Success Then
		For Each F As String In Files
			If F.ToLowerCase.EndsWith(".info") And Not(F.ToLowerCase.StartsWith("firstinstall")) Then
				File.Delete(Starter.Provider.SharedFolder,F)
			End If
		Next
		LocaRes = True
	Else
		LocaRes = False
	End If
	
	Wait For (File.ListFilesAsync(Starter.Provider.SharedFolder)) Complete (Success As Boolean, Files As List)
	If Success Then
		For Each F As String In Files
			If F.ToLowerCase.EndsWith(".sql") And Not(F.ToLowerCase.StartsWith("firstinstall")) Then
				File.Delete(Starter.Provider.SharedFolder,F)
			End If
		Next
		LocaRes = True
	Else
		LocaRes = False
	End If
	
	Return LocaRes
	
End Sub

'*********************************************************************
' TIP: Procedimento download pedidos 60Last7Next
'*********************************************************************
Sub RunUpdate60Last7Next As ResumableSub
		
	ShareCode.GlobalEventsTimer = 0
	Starter.StopLocationCheck = True
	Starter.RunUpdate = True
	StopService(LocationService)
	StopService(BackgroundUpdateService)
	ButtonWelcomeNext.Enabled = False
	DataUpdateLabelTarefa.Visible = False
	DUProgressBar(0,0)
	DUProgressBar2(0,0)
	Dim TotalLinesOfScripts As Int = 0
	lbldataupdateprocess.Text = ""
	ProgressBar1.Visible = True
	'*****************************************************************************************
	' PROCESSO DEPOIS DO LOGIN PARA DOWNLOAD DAS INTERVENCOES (SO CABECALHOS)
	' DOS ULTIMOS 60 DIAS E DOS PROXIMOS 7
	' DTA_REQUESTS
	' DTA_REQUESTS_ADDS EM QUE O CMAPO Field_Val05 TEM DE VIR A 1, PARA SINALIZAR SO CABECALHO
	'*****************************************************************************************
	lbldataupdatetitle.Text = ShareCode.MsgUpdateTitlePasso2PrimeiraInstalacao
	
	Dim res As ResumableSub = RemoveAllLocalInfoAndSqlFiles
	Wait For(res) Complete (RemoveSuccessful As Boolean)
		
	Dim res As ResumableSub = RequestUpdate60Last7Next '/api/orion/generate/requests/headers
	Wait For(res) Complete (RequestSuccessful As Boolean)
	If(RequestSuccessful) Then
					
		Dim UPDATE_INSTALL_INFO As String = $"${RequestFileNameHeaders}.INFO"$
		Dim updateInstallFilesName As String = RequestFileNameHeaders
		Dim deleteFileName As String = $"${RequestFileNameHeaders}-DELETE.sql"$
		'*****************************************************************************************************
		' LÊ O FICHEIRO INFO PASSADO NA VARIAVEL REQUESTFILENAMEHEADERS E DESCARREGA OS FICHEIROS EXISTENTES
		'*****************************************************************************************************
		'*****************************************************************************************
		' OBTER O NUMERO DE FICHEIROS PARA DOWNLOAD
		'*****************************************************************************************
		Dim SqlFilesTotal As Int = 0
		Dim trycount As Int = 0
		Dim dotry As Boolean = True
		Dim GlobalFTP As FTP

		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
		Dim ctm As CustomTrustManager
		ctm.InitializeAcceptAll
		GlobalFTP.SetCustomSSLTrustManager(ctm)
		GlobalFTP.TimeoutMs = 240000
		Do While (dotry And (trycount <3))
		
			Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & UPDATE_INSTALL_INFO, False, Starter.Provider.SharedFolder, UPDATE_INSTALL_INFO)
			Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
			If Success Then
				Log(UPDATE_INSTALL_INFO & " file was download successfully")
				'*************************************************************************
				' NOVA ROTINA PARA LER O INFO DA ESTRURUA JSON EM VEZ DE SER DO FICHEIRO
				' TEM DE PASSAR A HAVER UMA CHAMADA A API PARA O FIRSTINSTALL SENAO NAO TEMOS
				' CONTROLO DO PARAMETRO newreturn E NUNCA VEM A NOVA ESTRUTURA NESTE CASO
				'*************************************************************************
				Try
					lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleObterInfo

					If ShareCode.newReturn = 1 Then
						Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, UPDATE_INSTALL_INFO)
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
						Dim DeletesIsPresent As Boolean = False
						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & deleteFileName, False, Starter.Provider.SharedFolder, deleteFileName)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
						If Success Then 'DESCARREGOU O FICHEIRO DE DELETES
							Log(deleteFileName & " file was download successfully")
				
							If File.Exists(Starter.Provider.SharedFolder, deleteFileName) Then
								DeletesIsPresent = True
							Else
								DeletesIsPresent = False
							End If
						Else
							DeletesIsPresent = False
						End If
						
											
'							ShareCode.DEVICE_SYNC_NEWWAY = 1
						
						'***************************************************************
'						If Not(Utils.Int2Bool(ShareCode.DEVICE_SYNC_NEWWAY)) Then
'							DeletesIsPresent = False
'						End If
						'***************************************************************
						
						If DeletesIsPresent Then
							Dim resDel As ResumableSub = MakeDeleteSqlFile(deleteFileName)
							Wait For(resDel) Complete (finish As Boolean)
						Else
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
						End If
						'******************************************************************************
						SqlFilesTotal = Totalfiles
						Dim date As String = DataHora
						Utils.UpdateLiteUpdateDateTime(date)
						DBStructures.UpdateWorkerDbLastUpdate(date)
						dotry = False
						trycount = 3
						GlobalFTP.Close
						'*************************************************************************
					Else
						
						Dim List1 As List
						List1 = File.ReadList(Starter.Provider.SharedFolder, UPDATE_INSTALL_INFO)
						SqlFilesTotal = List1.Get(0) ' Numero de ficheiros para download
						Dim date As String = List1.Get(1)
						Utils.UpdateLiteUpdateDateTime(date)
						DBStructures.UpdateWorkerDbLastUpdate(date)
						dotry = False
						trycount = 3
						GlobalFTP.Close
					End If
				Catch
					Log(LastException)
					trycount = trycount + 1
				End Try
			Else
				Log(LastException)
				Log("Error downloading file " & UPDATE_INSTALL_INFO)
				InsertAlertErrors($"Erro ao Descarregar o ficheiro${CRLF}${UPDATE_INSTALL_INFO}"$)
				trycount = trycount + 1
			End If
		Loop
		GlobalFTP.Close

		'*****************************************************************************************
		' O NUMERO DE FICHEIROS PARA DOWNLOAD  ESTA EM SqlFileTotal
		' BASEADO NO RequestFileNameHeaders E COM UM CICLO For..Next ATE AO SqlFilesTotal
		' OBTER OS FICHEIROS COM OS SCRIPTS DE INSTALACAO, APAGADO-OS ANTES DO DOWNLOAD SE JA EXISTIREM
		'*****************************************************************************************
		If(SqlFilesTotal > 0) Then
			lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDados
			
			Dim GlobalFTP As FTP
			GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
			GlobalFTP.PassiveMode = True

			GlobalFTP.TimeoutMs = 240000
			
			For i = 1 To SqlFilesTotal
				lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDados & $" ${i}/${SqlFilesTotal}"$
				Dim fileN As String = $"${updateInstallFilesName}${i}.sql"$
				
				If(File.Exists(Starter.Provider.SharedFolder, fileN)) Then
					File.Delete(Starter.Provider.SharedFolder, fileN)
				End If
			
				'Log(fileN)
			
				Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & fileN, False, Starter.Provider.SharedFolder, fileN)
				Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
				If Success Then
					Log(fileN & " file was download successfully")
				Else
					Log("Error downloading file " & fileN)
				End If
				
				DUProgressBar(SqlFilesTotal,i)
			
			Next
			GlobalFTP.Close
			
		End If
		
		' LIMPA O PROGRESSBAR E PASSA A NOVA FASE
		DUProgressBar2(0,0)
		Sleep(500)
		
		
		'*****************************************************************************************
		' BASEADO NO RequestFileNameHeaders E COM UM CICLO For..Next ATE AO SqlFilesTotal
		' CRIAR UMA LISTA COM AS INSTRUCOES SQL POR ITEM E EXECUTA-LAS
		'*****************************************************************************************
		If(SqlFilesTotal > 0) Then
			
			For i = 1 To SqlFilesTotal
				TotalLinesOfScripts = 0
				lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleCarregarDados & $" ${i}/${SqlFilesTotal}"$
				Dim fileN As String = $"${updateInstallFilesName}${i}.sql"$
				
				Dim List1 As List
				
				If (List1.IsInitialized) Then
					List1.Clear
				Else
					List1.Initialize
				End If
				
				Try
					List1 = File.ReadList(Starter.Provider.SharedFolder, fileN)
					TotalLinesOfScripts = List1.Size
				Catch
					Log(LastException)
				End Try
				
				DUProgressBar2(0,0)
				DataUpdateProgressBar2.visible = True
				DataUpdateLabelTarefa.Visible = True
				For n = 0 To List1.Size -1
					DataUpdateLabelTarefa.Text = ShareCode.MsgExecProcAct & $" ${n}/${TotalLinesOfScripts}"$
					Dim Script2Execute As String = List1.Get(n)
					Utils.SaveSQLToLog("Main",Script2Execute, "")
					DUProgressBar2(TotalLinesOfScripts,n)
					Sleep(1)
					'Log(Script2Execute)
					'Log($"TotalLinesOfScripts:${TotalLinesOfScripts}"$)
				Next
				
				DataUpdateProgressBar2.visible = False
				DataUpdateLabelTarefa.Visible = False
				DUProgressBar(SqlFilesTotal,n)
				Sleep(1)
			Next
			'***************************************************************************************************
			' CHAMAR A ROTINA PARA APAGAR OS FICHEIROS GERADOS NO SERVIDOR PARA NAO OCUPAREM ESPACO
			'***************************************************************************************************
'			Dim res As ResumableSub = DeleteSqlFilesFromServer(updateInstallFilesName)
'			Wait For(res) Complete (IsFilesDeleted As Boolean)
			Dim res As ResumableSub = SendServerProcessComplete(False, RequestFileNameHeaders, Me)
			Wait For(res) Complete (Completed As Boolean)
		End If

	Else
		
		MsgboxAsync(ShareCode.MsgErroProc60last7new,ShareCode.GeneralAlertTitle)
		If ProgressBar1.Visible = True Then ProgressBar1.Visible = False
		Return False
	End If
	If ProgressBar1.Visible = True Then ProgressBar1.Visible = False
	StartService(BackgroundUpdateService)
	Starter.RunUpdate = False
	Return True
End Sub


'*********************************************************************
' TIP: Chamada de Operação de download OnDay
'*********************************************************************
Sub RequestUpdateOnDay As ResumableSub
	
	RequestFileNameOnDay = Utils.RandomString
	If File.Exists(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_upd.log"$) Then
		Dim LastOnDaySyncDate As String = File.ReadString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_upd.log"$)
	Else
		Dim LastOnDaySyncDate As String = Utils.GetCurrDatetimeExt
	End If
	
	If (ShareCode.FIRSTDAILYLOGIN) Then
		LastOnDaySyncDate = $"${Utils.GetCurrDatetimeExt}"$
	End If
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/requests/onday"$
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("name", RequestFileNameOnDay)
	params.Put("newReturn", ShareCode.newreturn)
	params.Put("date",LastOnDaySyncDate )
	params.Put("smart", ShareCode.ISPHONE)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String = JSON.ToPrettyString(1)
	
	Utils.ShowProcinLog("DataUpdate","RequestUpdateOnDay",data)
	
	Job.PostString(ServerAddress, data)
	Job.GetRequest.SetContentType("application/json")
	Job.GetRequest.Timeout = 90000
	
	Wait For (Job) JobDone(Job As HttpJob)
	
	If Job.Success Then
		Log(ServerAddress)
		Utils.ShowProcinLog("DataUpdate","RequestUpdateOnDay","Completed")
		Job.Release
		Return True
	Else
		Log(ServerAddress)
		Utils.ShowProcinLog("DataUpdate","RequestUpdateOnDay","ERROR")
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	Sleep(5000)
	Return False

End Sub

'*********************************************************************
' TIP: Procedimento de download OnDay
'*********************************************************************
Sub RunUpdateOnDay As ResumableSub
	ShareCode.GlobalEventsTimer = 0
	Starter.StopLocationCheck = True
	Starter.RunUpdate = True
	StopService(LocationService)
	StopService(BackgroundUpdateService)
	ButtonWelcomeNext.Enabled = False
	DataUpdateLabelTarefa.Visible = False
	DUProgressBar(0,0)
	DUProgressBar2(0,0)
	Dim TotalLinesOfScripts As Int = 0
	lbldataupdateprocess.Text = ""
	ProgressBar1.Visible = True
	'***********************************************************************************************************
	' PROCESSO DEPOIS DO LOGIN PARA DOWNLOAD DOS FICHEIROS DE DADOS OPERACIONAIS DO DIA ACTUAL E DO DIA ANTERIOR
	'***********************************************************************************************************
	lbldataupdatetitle.Text = ShareCode.MsgUpdateTitlePasso3PrimeiraInstalacao
		
	Dim res As ResumableSub = RemoveAllLocalInfoAndSqlFiles
	Wait For(res) Complete (RemoveSuccessful As Boolean)
		
	Dim resReq As ResumableSub = RequestUpdateOnDay '/api/orion/generate/requests/onday
	Wait For(resReq) Complete (RequestSuccessful As Boolean)
	If(RequestSuccessful) Then
					
		Dim UPDATE_INSTALL_INFO As String = $"${RequestFileNameOnDay}.INFO"$
		Dim updateInstallFilesName As String = RequestFileNameOnDay
		Dim deleteFileName As String = $"${RequestFileNameOnDay}-DELETE.sql"$
		'*************************************************************************************************
		' LÊ O FICHEIRO INFO PASSADO NA VARIAVEL REQUESTFILENAMEONDAY E DESCARREGA OS FICHEIROS EXISTENTES
		'*************************************************************************************************
		'*****************************************************************************************
		' OBTER O NUMERO DE FICHEIROS PARA DOWNLOAD
		'*****************************************************************************************
		Dim SqlFilesTotal As Int = 0
		Dim trycount As Int = 0
		Dim dotry As Boolean = True
		Dim GlobalFTP As FTP

		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
		Dim ctm As CustomTrustManager
		ctm.InitializeAcceptAll
		GlobalFTP.SetCustomSSLTrustManager(ctm)
		GlobalFTP.TimeoutMs = 240000
		Do While (dotry And (trycount <3))
		
			Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & UPDATE_INSTALL_INFO, False, Starter.Provider.SharedFolder, UPDATE_INSTALL_INFO)
			Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
			If Success Then
				Log(UPDATE_INSTALL_INFO & " file was download successfully")
				'*****************************************************************************
				' NOVA ROTINA PARA LER O INFO DA ESTRURUA JSON EM VEZ DE SER DO FICHEIRO
				' TEM DE PASSAR A HAVER UMA CHAMADA A API PARA O FIRSTINSTALL SENAO NAO TEMOS
				' CONTROLO DO PARAMETRO newreturn E NUNCA VEM A NOVA ESTRUTURA NESTE CASO
				'*****************************************************************************
				Try
					lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleObterInfo
					
					If ShareCode.newReturn = 1 Then
						Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, UPDATE_INSTALL_INFO)
						
						Log(JsonStruct)
						
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
						Dim DeletesIsPresent As Boolean = False
						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & deleteFileName, False, Starter.Provider.SharedFolder, deleteFileName)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
						If Success Then 'DESCARREGOU O FICHEIRO DE DELETES
							Log(deleteFileName & " file was download successfully")
				
							If File.Exists(Starter.Provider.SharedFolder, deleteFileName) Then
								DeletesIsPresent = True
							Else
								DeletesIsPresent = False
							End If
						Else
							DeletesIsPresent = False
						End If
						
						' DEPENDENTE DO PARAMETRO DEVICE_SYNC_NEWWAY
'						If ShareCode.IsDevelopment Then
'							ShareCode.DEVICE_SYNC_NEWWAY = 1
'						End If
'						'***************************************************************
'						If Not(Utils.Int2Bool(ShareCode.DEVICE_SYNC_NEWWAY)) Then
'							DeletesIsPresent = False
'						End If
						'***************************************************************
						
						If DeletesIsPresent Then
							Dim resDel As ResumableSub = MakeDeleteSqlFile(deleteFileName)
							Wait For(resDel) Complete (finish As Boolean)
						Else
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
						End If
						'******************************************************************************
						SqlFilesTotal = Totalfiles
						Dim date As String = DataHora
						Utils.UpdateLiteUpdateDateTime(date)
						DBStructures.UpdateWorkerDbLastUpdate(date)
						dotry = False
						trycount = 3
						GlobalFTP.Close
						'*************************************************************************
					Else
						
						Dim List1 As List
						List1 = File.ReadList(Starter.Provider.SharedFolder, UPDATE_INSTALL_INFO)
						SqlFilesTotal = List1.Get(0) ' Numero de ficheiros para download
						Dim date As String = List1.Get(1)
						Utils.UpdateLiteUpdateDateTime(date)
						DBStructures.UpdateWorkerDbLastUpdate(date)
						dotry = False
						trycount = 3
						GlobalFTP.Close
					End If
				Catch
					Log(LastException)
					trycount = trycount + 1
				End Try
			Else
				Log(LastException)
				Log("Error downloading file " & UPDATE_INSTALL_INFO)
				InsertAlertErrors($"Erro ao Descarregar o ficheiro${CRLF}${UPDATE_INSTALL_INFO}"$)
				trycount = trycount + 1
			End If
		Loop
		GlobalFTP.Close
		
		
		
		If (SqlFilesTotal <= 0) Then
			lbldataupdateprocess.TextColor = Colors.Red
			lbldataupdateprocess.Text = ShareCode.MsgNaoExistemActualizacoes
'			ButtonWelcomeNext_Click
		End If
		
		'*****************************************************************************************
		' O NUMERO DE FICHEIROS PARA DOWNLOAD INICIAL ESTA EM SqlFileTotal
		' BASEADO NO updateInstallFilesName E COM UM CICLO For..Next ATE AO SqlFilesTotal
		' OBTER OS FICHEIROS COM OS SCRIPTS DE INSTALACAO, APAGADO-OS ANTES DO DOWNLOAD SE JA EXISTIREM
		'*****************************************************************************************
		If(SqlFilesTotal > 0) Then
			lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDados
			
			Dim GlobalFTP As FTP
			GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
			GlobalFTP.PassiveMode = True

			GlobalFTP.TimeoutMs = 240000
			DUProgressBar(0,0)
			
			For i = 1 To SqlFilesTotal
				lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDados & $" ${i}/${SqlFilesTotal}"$
				Dim fileN As String = $"${updateInstallFilesName}${i}.sql"$
				
				If(File.Exists(Starter.Provider.SharedFolder, fileN)) Then
					File.Delete(Starter.Provider.SharedFolder, fileN)
				End If
			
				'Log(fileN)
			
				Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & fileN, False, Starter.Provider.SharedFolder, fileN)
				Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
				If Success Then
					Log(fileN & " file was download successfully")
				Else
					Log("Error downloading file " & fileN)
				End If
				
				DUProgressBar(SqlFilesTotal,i)
			
			Next
			GlobalFTP.Close
			
		End If
		
		' LIMPA O PROGRESSBAR E PASSA A NOVA FASE
		DUProgressBar(0,0)
		Sleep(500)
		
		'*****************************************************************************************
		' BASEADO NO firstInstallFilesName E COM UM CICLO For..Next ATE AO SqlFilesTotal
		' CRIAR UMA LISTA COM AS INSTRUCOES SQL POR ITEM E EXECUTA-LAS
		'*****************************************************************************************
		If(SqlFilesTotal > 0) Then
			
			For i = 1 To SqlFilesTotal
				TotalLinesOfScripts = 0
				lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleCarregarDados & $" ${i}/${SqlFilesTotal}"$
				Dim fileN As String = $"${updateInstallFilesName}${i}.sql"$
				
				Dim List1 As List
				
				If (List1.IsInitialized) Then
					List1.Clear
				Else
					List1.Initialize
				End If
				
				Try
					List1 = File.ReadList(Starter.Provider.SharedFolder, fileN)
					TotalLinesOfScripts = List1.Size
				Catch
					Log(LastException)
				End Try
				
				DUProgressBar2(0,0)
				DataUpdateProgressBar2.visible = True
				DataUpdateLabelTarefa.Visible = True
				Dim AlreadyDeleted As Boolean = False
				
				For n = 0 To List1.Size -1
					DataUpdateLabelTarefa.Text = ShareCode.MsgExecProcAct & $" ${n}/${TotalLinesOfScripts}"$
					Dim Script2Execute As String = List1.Get(n)
					' ****************************************************************************************
					' ELIMINA POSSIVEIS REGISTOS NAS TABELAS dta_tablecontrol e dta_Tablecontrol_items
					' ANTES DOS RESPECTIVOS INSERTS
					' ****************************************************************************************
					If Script2Execute.Contains("INSERT INTO") And Script2Execute.Contains("dta_tablecontrol") And Not(AlreadyDeleted) Then
						
						Try
							Dim Sql2Del As String = "delete from dta_tablecontrol"
							Starter.LocalSQLEVC.ExecNonQuery(Sql2Del)
							Log(Sql2Del)
						Catch
							Log(LastException)
						End Try
						
						Try
							Dim Sql2Del As String = "delete from dta_tablecontrol_items"
							Starter.LocalSQLEVC.ExecNonQuery(Sql2Del)
							Log(Sql2Del)
						Catch
							Log(LastException)
						End Try
						AlreadyDeleted = True
					End If
					
					Utils.SaveSQLToLog("Main",Script2Execute, "")
					DUProgressBar2(TotalLinesOfScripts,n)
					Sleep(1)
					'Log(Script2Execute)
					'Log($"TotalLinesOfScripts:${TotalLinesOfScripts}"$)
				Next

				DataUpdateProgressBar2.visible = False
				DataUpdateLabelTarefa.Visible = False
				DUProgressBar(SqlFilesTotal,i)
				Sleep(1)
			Next
			'***************************************************************************************************
			' CHAMAR A ROTINA PARA APAGAR OS FICHEIROS GERADOS NO SERVIDOR PARA NAO OCUPAREM ESPACO
			'***************************************************************************************************
'			Dim res As ResumableSub = DeleteSqlFilesFromServer(updateInstallFilesName)
'			Wait For(res) Complete (IsFilesDeleted As Boolean)
			Dim res As ResumableSub = SendServerProcessComplete(False,RequestFileNameOnDay, Me)
			Wait For(res) Complete (Completed As Boolean)
		End If
	Else
		MsgboxAsync(ShareCode.MsgErroProc60last7new,ShareCode.GeneralAlertTitle)
		If ProgressBar1.Visible = True Then ProgressBar1.Visible = False
		Return False
	End If
	
	lbldataupdateprocess.Text = ShareCode.MsgDataUpdateProcessConcluido
	If ProgressBar1.Visible = True Then ProgressBar1.Visible = False
	
	File.writeString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_upd.log"$,Utils.GetCurrDatetimeExt)
	StartService(BackgroundUpdateService)
	Starter.RunUpdate = False
	Return True
End Sub


'*********************************************************************
' TIP: Chamada de Operação de Sincronização
'*********************************************************************
Sub RequestSync(date2watch As String, SyncDates As Boolean) As ResumableSub
	
	If File.Exists(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_autosync.log"$) Then
		Dim LastUpd As String = File.ReadString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_autosync.log"$)
	Else
		Dim LastUpd As String = $"${Utils.GetCurrentDate} 00:00:00"$
	End If
		
	RequestFileName = Utils.RandomString
	
	If SyncDates Then
		Dim Dates2Sync As List = Regex.Split("\|", date2watch )
		Dim iDate As String = Utils.IfNullOrEmpty(Dates2Sync.Get(0),Utils.GetCurrentDate)
		Dim eDate As String = Utils.IfNullOrEmpty(Dates2Sync.Get(1),Utils.GetCurrentDate)
		iDate = $"${iDate} 00:00:00"$
		eDate = $"${eDate} 23:59:59"$
		
		
		
		' DEPENDENTE DO PARAMETRO DEVICE_SYNC_NEWWAY
'		If ShareCode.IsDevelopment Then
'			ShareCode.DEVICE_SYNC_NEWWAY = 1
'		End If
		'***************************************************************
'		If Utils.Int2Bool(ShareCode.DEVICE_SYNC_NEWWAY) Then
		Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/updateSqliteDatesNew"$
'		Else
'			Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/updateSqliteDates"$
'		End If
		'***************************************************************
		
		
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("authorization", ShareCode.APP_Authorization)
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("_user", ShareCode.SESS_User)
		params.Put("name", RequestFileName)
		params.Put("newReturn", ShareCode.newreturn)
		params.Put("idate", iDate)
		params.Put("edate", eDate)
		params.Put("components", ShareCode.SYNC_COMPONENTS)
		params.Put("smart", ShareCode.ISPHONE)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
	Else
		Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/updateSqliteNew"$
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("authorization", ShareCode.APP_Authorization)
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("_user", ShareCode.SESS_User)
		params.Put("name", RequestFileName)
		params.Put("newReturn", ShareCode.newreturn)
		params.Put("date", LastUpd)
		params.Put("smart", ShareCode.ISPHONE)
		params.Put("debug", 1)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
	End If
		
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String = JSON.ToPrettyString(1)
	
	If SyncDates Then
		Utils.ShowProcinLog("DataUpdate","RequestSyncManual",data)
	Else
		Utils.ShowProcinLog("DataUpdate","RequestSyncAuto",data)
	End If
	
	Job.PostString(ServerAddress, data)
	Job.GetRequest.SetContentType("application/json")
	Job.GetRequest.Timeout = 120000
	
	Wait For (Job) JobDone(Job As HttpJob)
		
	If Not(Job.Success) Then
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		Return False
	End If
	
	Job.Release
	Sleep(1000)
	Return True

End Sub

'*********************************************************************
' TIP: Chamada de Operação de DEL SqlFilesFromServer
'*********************************************************************
Sub DeleteSqlFilesFromServer(filename2delete As String) As ResumableSub
	
	If Utils.NNE(filename2delete) Then
		Dim GlobalFTP As FTP
		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
		GlobalFTP.TimeoutMs =240000
		Log(filename2delete)
		Dim LstDocs2Delete As List
		
		Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/db/")
		Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
		If Success Then
			
			If (files.Length >= 1) Then
				LstDocs2Delete.Initialize
				For i = 0 To files.Length - 1
					lbldataupdateprocess.Text = $"Criando Lista de ficheiros para remocao no servidor"$
					Dim fName2 As String = files(i).Name
					If fName2.Contains(filename2delete) Then
						LstDocs2Delete.Add(files(i).Name)
					End If
				Next
			End If
		Else
			Utils.ShowProcinLog("DataUpdate","DeleteSQLFilesFromServer","error getting files list from /db/")
			Return False
		End If
		
		If LstDocs2Delete.Size = 0 Then
			Return False
		End If
		
		For f = 0 To LstDocs2Delete.Size -1
			filename2delete = LstDocs2Delete.Get(f)
			Dim sf As Object = GlobalFTP.DeleteFile("/" & ShareCode.APP_DOMAIN & "/db/" & filename2delete)
			Wait For (sf) FTP_DeleteCompleted (ServerPath As String, Success As Boolean)
				
			If Success Then
				Log(filename2delete & " file was deleted successfully")
			Else
				Log("Error deleting file " & filename2delete)
			End If
		Next
		
		GlobalFTP.Close
		Return True
	
	End If
	Return False
	
End Sub


Sub RunSync (date2watch As String, SyncDates As Boolean) As ResumableSub
	ShareCode.GlobalEventsTimer = 0
	Dim FilterOfTC As String = ""
	'*****************************************************************************************
	' Para o serviço de localização e faz disable ao botao de Concluir
	'*****************************************************************************************
	Starter.RunUpdate = True
	Starter.StopLocationCheck = True
	StopService(LocationService)
	StopService(BackgroundUpdateService)
	ButtonWelcomeNext.Enabled = False
	DUProgressBar(0,0)
	lbldataupdatetitle.Text = ShareCode.MsgUpdateTitleActualizacao
	lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleObterInfo
	
	Dim RecCounter As Int = LocalDataToUpdate
	Sleep(250)
	
	
	'*****************************************************************************************
	'FORÇA O KEEPALIVE DURANTE A SINCRONIZACAO
	ShareCode.AwakeDevice(True)
	
	If ShareCode.AutoSyncFromLogin Then ' Se veio do Login então nao tem de se preocupar com dados offline. Ja foram tratados
		RecCounter = 0
	End If
	
	If (RecCounter > 0) Then
		'*****************************************************************************************
		'RECCOUNTER > 0 QUER DIZER QUE EXISTEM DADOS OFFLINE PARA ENVIAR PARA O SERVIDOR
		'*****************************************************************************************
		Log("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»")
		Log("SENDING OFFLINE DATA TO SERVER")
		Log("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»")
		
		lbldataupdatetitle.Text = ShareCode.MsgSendDataServer
		Dim WITHFILES As Boolean = True
		
		If Utils.NNE(ShareCode.TCF) Then
			Dim FilterOfTC As String = $"and up_tagcode in (${ShareCode.tcf})"$
		Else
			Dim FilterOfTC As String = ""
		End If
		
		Try
			Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=0 ${FilterOfTC}"$
			Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
		Catch
			Log(LastException)
			Dim sSQL As String = $"select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 ${FilterOfTC}"$
			Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
			WITHFILES = False
		End Try
				
		Try
			Dim sSQLEmails As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where up_state=0 and up_type=0 ${FilterOfTC}"$
			Dim RecordLocalEmailDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQLEmails)
			Dim EmailCheck As Boolean = True
		Catch
			Log(LastException)
			Dim EmailCheck As Boolean = False
		End Try
				
		Dim ut0 As Int = RecordLocalDataToUpdate.RowCount
		Dim ut1 As Int = RecCounter - ut0
				
		lbldataupdateprocess.Text = ShareCode.MsgExecProcAct
				
		DUProgressBar(0,0)
		DUProgressBar2(0,0)
		Sleep(100)
				
		If(RecordLocalDataToUpdate.RowCount >= 1) Then
			Dim n As Int = 0
			Do While RecordLocalDataToUpdate.NextRow
'				RecordLocalDataToUpdate.Position = n
				Try
					Dim r1  As ResumableSub = SetUpdateHTTPRecord(RecordLocalDataToUpdate, WITHFILES, 0, FilterOfTC)
					Wait For(r1) complete (finished As Boolean)
					' ENVIAR DADOS DE EMAIL (HTTP)
					
					If EmailCheck Then
						If RecordLocalEmailDataToUpdate.RowCount > 0 Then
							Dim r2 As ResumableSub = SetUpdateHTTPEmailRecord(RecordLocalEmailDataToUpdate, FilterOfTC)
							Wait For(r2) complete (finished As Boolean)
						End If
					End If
				Catch
					Log(LastException)
				End Try
				If n <= ut0 Then
					DUProgressBar(ut0,n)
					Sleep(1)
				End If
				
				n=n + 1
			Loop
					
		End If
		RecordLocalDataToUpdate.Close
		Sleep(250)
				
		If ut1 >= 1 Then
			Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=1 ${FilterOfTC}"$
			Dim RecordLocalDataToUpdate2 As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
			Dim n1 As Int = 0
			If RecordLocalDataToUpdate2.RowCount >= 1 Then
				Do While RecordLocalDataToUpdate2.NextRow
'					RecordLocalDataToUpdate2.Position = n1
					Try
						SetUpdateFTPRecord(RecordLocalDataToUpdate2, WITHFILES, 1, FilterOfTC)
					Catch
						Log(LastException)
					End Try
					If n1 <= RecordLocalDataToUpdate2.RowCount Then
						DUProgressBar(RecordLocalDataToUpdate2.RowCount,n1)
						Sleep(1)
					End If
					n1=n1 + 1
				Loop
			End If
			RecordLocalDataToUpdate2.Close
		End If
		
		lbldataupdatetitle.Text = ShareCode.MsgDataUpdateProcessConcluido
		CurrentCounter = CurrentCounter + 1
		If (CurrentCounter > 3) Then
			CurrentCounter = 0
			MsgboxAsync(ShareCode.AvisoDadospersistemNaoUpd, ShareCode.GeneralAlertTitle)
					
'			ButtonWelcomeNext_Click

		End If
		Sleep(250)
	End If
		
		
	Starter.RunUpdate = True
	Starter.StopLocationCheck = True
	StopService(LocationService)
	StopService(BackgroundUpdateService)
	ButtonWelcomeNext.Enabled = False
	DUProgressBar(0,0)
	lbldataupdatetitle.Text = ShareCode.MsgUpdateTitleActualizacao
	lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleObterInfo
		
	If (SyncDates) Then
		If (ShareCode.SYNC_COMPONENTS = "") And (ShareCode.DownloadDocsFromFTP) Then
			Dim res As ResumableSub = DownloadDocsOnly(date2watch, True)
			Wait For(res) Complete (RequestSuccessful As Boolean)
			Return True
		End If
	Else
		ShareCode.DownloadDocsFromFTP = False
	End If
	
	Dim res As ResumableSub = RequestSync(date2watch, SyncDates) '/api/orion/generate/updateSqlite
	Wait For(res) Complete (RequestSuccessful As Boolean)
	
	If(RequestSuccessful) Then
		File.writeString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_autosync.log"$,Utils.GetCurrDatetimeExt)
		Dim UPDATE_FILE_INFO As String = $"${RequestFileName}.INFO"$
		Dim updateSQLFilesName As String = RequestFileName
		Dim deleteFileName As String = $"${RequestFileName}-DELETE.sql"$
		lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDados
		Utils.ShowProcinLog("DataUpdate","RunSync",lbldataupdateprocess.Text)
		'*****************************************************************************************************
		' LÊ O FICHEIRO INFO PASSADO NA VARIAVEL REQUESTFILENAME E DESCARREGA OS FICHEIROS EXISTENTES
		'*****************************************************************************************************
		SqlFilesTotal = 0
		Dim GlobalFTP As FTP
		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
		Dim ctm As CustomTrustManager
		ctm.InitializeAcceptAll
		GlobalFTP.SetCustomSSLTrustManager(ctm)
		GlobalFTP.TimeoutMs = 240000
			
		Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & UPDATE_FILE_INFO, False, Starter.Provider.SharedFolder, UPDATE_FILE_INFO)
		Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
		If Success Then 'DESCARREGOU O FICHEIRO .INFO

			Log(UPDATE_FILE_INFO & " file was download successfully")
			
			Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, UPDATE_FILE_INFO)
			Log("JSON:" & JsonStruct)
			Dim parser As JSONParser
			parser.Initialize(JsonStruct)
			Dim root As Map = parser.NextObject
			Dim DataHora As String = root.Get("datetime")
			Dim Totalfiles As Int = root.Get("files")
			Dim inserts As List = root.Get("inserts")
			
			'**************************************************************************************
			' TIP: SE EXISTIR O FICHEIRO DE DELETES, USA-O E NAO APAGA OS REGISTOS CORRESPONDENTES AOS INSERTS QUE ESTAO NOS SCRIPTS SQL A EXECUTAR
			' SE NAO EXISTIR, ENTAO UTILIZA A LISTA DE TAGCODES NO JSON PARA OS APAGAR. ISTO GARANTE QUE NAO VAMOS TER ERROS DE INDICES
			'**************************************************************************************
			Dim DeletesIsPresent As Boolean = False
			Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & deleteFileName, False, Starter.Provider.SharedFolder, deleteFileName)
			Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
			If Success Then 'DESCARREGOU O FICHEIRO DE DELETES
				Log(deleteFileName & " file was download successfully")
				
				If File.Exists(Starter.Provider.SharedFolder, deleteFileName) Then
					DeletesIsPresent = True
				Else
					DeletesIsPresent = False
				End If
			Else
				DeletesIsPresent = False
			End If
			
			' DEPENDENTE DO PARAMETRO DEVICE_SYNC_NEWWAY
'			If ShareCode.IsDevelopment Then
'				ShareCode.DEVICE_SYNC_NEWWAY = 1
'			End If
'			'***************************************************************
'			If Not(Utils.Int2Bool(ShareCode.DEVICE_SYNC_NEWWAY)) Then
'				DeletesIsPresent = False
'			End If
			'***************************************************************
			
			
			If DeletesIsPresent Then
				Dim resDel As ResumableSub = MakeDeleteSqlFile(deleteFileName)
				Wait For(resDel) Complete (finish As Boolean)
			Else
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
						Dim res As ResumableSub = DBStructures.RemoveRecsFromTable(table,mastertagcode,childfield, "", NewInfoList.Get(i))
						Wait For(res) Complete (result As Boolean)
						Sleep(100)
					Next
					
				Next
			End If
			
			'*****************************************************************************************************
			' NESTE PONTO TEMOS O TOTAL DE FICHEIROS PARA DOWNLOAD, O SEU NOME E JA APAGADOS OS REGISTOS DA BD
			' QUE VAO SER ACTUALIZADOS
			'*****************************************************************************************************
			SqlFilesTotal = Totalfiles
			Dim date As String = DataHora
			Utils.UpdateLiteUpdateDateTime(date)
			DBStructures.UpdateWorkerDbLastUpdate(date)
			GlobalFTP.Close
			'*****************************************************************************************************
	
			If(SqlFilesTotal > 0) Then
				For i = 1 To SqlFilesTotal
					lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDados & $" ${i}/${SqlFilesTotal}"$
					Dim fileN As String = $"${updateSQLFilesName}${i}.sql"$
					Dim rs As ResumableSub = DownloadSqlFileWithFTP(fileN)
					Wait For(rs) Complete (finish As Boolean)
					DUProgressBar(SqlFilesTotal,i)
					Sleep(1)
				Next
			End If
		
			lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleCarregarDados
			Utils.ShowProcinLog("DataUpdate","RunSync",lbldataupdateprocess.Text)
			'*****************************************************************************************************
			' CARREGA A LISTA DE FICHEIROS DA VARIAVEL UPDATEINSTALLFILESNAMES E FAZ O INSERT DE DADOS
			'*****************************************************************************************************
			DUProgressBar(100,0)
			Log($"LISTA DE FICHEIROS: ${updateSQLFilesName}"$)
			' SE FOR SINCRONISMO MANUAL COLOCA FLAG AlreadyDeleted EM FALSE PARA
			' PODER APAGAR AS TABELAS DE TYPE ANTES DOS INSERTS.
			' A PRIMEIRA VE QUE CORRE O SCRIPT COLOCA A FLAG EM TRUE PARA NAO APAGAR AS TABELAS POR CADA INSERT
				
			If SyncDates Then
				ShareCode.AlreadyDeleted = False
			Else
				ShareCode.AlreadyDeleted = True
			End If
					
			Dim res As ResumableSub = ExecuteSqlFiles(updateSQLFilesName, True)
			Wait For(res) Complete (finish As Boolean)
							
			If(finish)Then
				Dim res As ResumableSub = SendServerProcessComplete(False,RequestFileName, Me)
				Wait For(res) Complete (Completed As Boolean)
					
				Dim res As ResumableSub = DeleteSqlFiles(updateSQLFilesName)
				Wait For(res) Complete (IsFilesDeleted As Boolean)
			End If
												
		End If
			
		'*****************************************************************************************************
		' ACABA AQUI O PROCESSO DE DOWNLOAD E EXECUCAO DOS SCRIPTS DO RUNSYNC
		' SEGUE PARA O DOWNLOAD DOS FICHEIROS COMPLEMENTARES DO /DOCS E DO /DOCS/TEMPLATES/
		'*****************************************************************************************************
			
	End If
		
	'*****************************************************************************************************
	' FIM DA CONDICAO INICIAL DA SUB E DA CONDICAO DOS MANUALSYNCOMPONENTES
	' AQUI JA FEZ O DOWNLOAD OU UPLOAD DOS FICHEIROS PARA O FTP E VAI PROSSEGUIR COM OS FICHEIROS
	' COMPLEMENTARES
	'*****************************************************************************************************

	'*****************************************************************************************
	' DOWNLOAD DOS FICHEIROS NA PASTA DOCS
	'*****************************************************************************************
	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
	GlobalFTP.TimeoutMs = 240000
	
	If ShareCode.FIRSTDAILYLOGIN Or SyncDates Then
		If ShareCode.DownloadDocsFromFTP Then
			lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
			Log("************************************************************")
			Log($" INITIAL : ${ShareCode.APPL_HOST}/${ShareCode.APP_DOMAIN} "$)
			Log("/docs/")
			Log("************************************************************")
		
			Dim FTPDOCSLIST As List
			Dim TotalDocs As Int = 0
	
			If SyncDates Then
				DateTime.DateFormat = "yyyy-MM-dd"
				Dim Dates2Sync As List = Regex.Split("\|", date2watch )
				Dim iDateL As Long = DateTime.DateParse(Dates2Sync.Get(0))
				Dim eDateL As Long = DateTime.DateParse(Dates2Sync.Get(1))
				Dim LMDate As Long = Utils.GetLastNDaysLong(1)
			Else
				Dim LMDate As Long = Utils.GetLastNDaysLong(1)
			End If
	

			Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
			Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
			If Success Then
				DUProgressBar(100,0)
				If (files.Length >= 1) Then
					FTPDOCSLIST.Initialize
					TotalDocs = files.Length -1
					lbldataupdateprocess.Text = $"Criando Lista de ficheiros para download em /docs/"$
					Sleep(500)
					For i = 0 To files.Length - 1
						Dim fName As String = files(i).Name
						If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".jpeg"))  Or _
						(fName.EndsWith(".pdf"))  Or (fName.EndsWith(".doc"))  Or (fName.EndsWith(".docx"))  Or _
						(fName.EndsWith(".xls"))  Or (fName.EndsWith(".xlsx"))  Or (fName.EndsWith(".ppt")) Or _ 
						(fName.EndsWith(".pptx"))  Or Not((fName.StartsWith("REPORT"))) Then
						
							' CRIAR A CONDICAO ENTRE DATAS PARA O SYNC MANUAL
							If SyncDates Then
								If ShareCode.DownloadDocsFromFTP = True Then
									If (files(i).Timestamp >= iDateL) And (files(i).Timestamp <= eDateL) Then
										FTPDOCSLIST.Add(files(i).Name)
										Log(files(i).Name)
									End If
								Else
									If (files(i).Timestamp >= LMDate) Then
										FTPDOCSLIST.Add(files(i).Name)
										Log(files(i).Name)
									End If
								End If
							Else
								If (files(i).Timestamp >= LMDate) Then
									FTPDOCSLIST.Add(files(i).Name)
									Log(files(i).Name)
								End If
							End If

						End If
					Next
					ProgressDialogHide
					Log("*************************")
					Log($"Total Files Added to /DOCS List = ${FTPDOCSLIST.Size} out of a Total of ${TotalDocs}"$)
					Log("*************************")
				End If
			Else
				Utils.ShowProcinLog("Main","RunSync","error getting files list from /docs/")
			End If
	
			If (FTPDOCSLIST.IsInitialized) Then
				If (FTPDOCSLIST.Size>=1) Then
					TotalDocs = FTPDOCSLIST.Size-1
					Log("*************************")
					Log("Total DOCS : " & TotalDocs)
					Log("*************************")
					For i=0 To FTPDOCSLIST.Size-1
						lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/docs/) ${i}/${TotalDocs}"$
						Dim fName As String = FTPDOCSLIST.Get(i)
						Log(fName)
						Try
							Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
							Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
							If Success Then
								Log("/docs/ : file was download successfully")
							Else
								Log("/docs/ : Error downloading file")
							End If
						Catch
							Log(LastException)
						End Try
						DUProgressBar(TotalDocs,i)
					Next
				End If
			End If

		End If
	
	
		'*****************************************************************************************
		' DOWNLOAD DOS FICHEIROS NA PASTA DOCS/TEMPLATES/
		'*****************************************************************************************
		Log("************************************************************")
		Log("/docs/templates")
		Log("************************************************************")
		DUProgressBar(100,0)
		lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
		Dim FTPTEMPLATESLIST As List
		Dim TotalTemplates As Int = 0
		
		Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/templates/")
		Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
		If Success Then
			
			If (files.Length >= 1) Then
				TotalDocs = files.Length -1
				FTPTEMPLATESLIST.Initialize
				For i = 0 To files.Length - 1
					lbldataupdateprocess.Text = $"Criando Lista de ficheiros para download em :/docs/templates/ ${i}/${TotalDocs}"$
					Dim fName2 As String = files(i).Name
					FTPTEMPLATESLIST.Add(files(i).Name)
				Next
			End If
		Else
			Utils.ShowProcinLog("Main","RunSync","error getting files list from /docs/templates/")
		End If
		
		If (FTPTEMPLATESLIST.IsInitialized) Then
			If (FTPTEMPLATESLIST.Size>=1) Then
				TotalTemplates = FTPTEMPLATESLIST.Size-1
				Log("*************************")
				Log("Total TEMPLATES : " & TotalTemplates)
				Log("*************************")
				For i=0 To FTPTEMPLATESLIST.Size-1
					lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/docs/templates/) ${i}/${TotalTemplates}"$
					Dim fName2 As String = FTPTEMPLATESLIST.Get(i)
					Dim oFName As String = $"REMOVE_${fName2}"$
					If File.Exists(Starter.InternalFolder, fName2) Then
						File.Copy(Starter.InternalFolder, fName2, Starter.InternalFolder, oFName)
						File.Delete(Starter.InternalFolder, fName2)
					End If
					Log(fName2)
					Try
						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/templates/" & fName2, False, Starter.InternalFolder, fName2)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
						If Success Then
							Log("/docs/templates/ : file was download successfully")
						Else
							Log("/docs/templates/ : Error downloading file")
							InsertAlertErrors($"Erro ao Descarregar o ficheiro${CRLF}${fName2}"$)
							File.Copy(Starter.InternalFolder, oFName, Starter.InternalFolder, fName2)
						End If
						If File.Exists(Starter.InternalFolder, oFName) Then
							File.Delete(Starter.InternalFolder, oFName)
						End If
					Catch
						Log(LastException)
					End Try
					DUProgressBar(TotalTemplates,i)
				Next
			End If
		End If
		
		'*****************************************************************************************
		' DOWNLOAD DOS FICHEIROS NA PASTA /INTERNO
		'*****************************************************************************************
		Log("************************************************************")
		Log("/interno")
		Log("************************************************************")
		DUProgressBar(100,0)
		lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
		Dim FTPINTERNOLIST As List
		Dim TotalTemplates As Int = 0
		
		Dim sfl As Object = GlobalFTP.List("/interno/")
		Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
		If Success Then

			If (files.Length >= 1) Then
				FTPINTERNOLIST.Initialize
				For i = 0 To files.Length - 1
					Dim fName2 As String = files(i).Name
					FTPINTERNOLIST.Add(files(i).Name)
				Next
			End If
		Else
			Utils.ShowProcinLog("Main","FirstIntallCompleteProcedure","error getting files list from /interno/")
		End If
		
		If (FTPINTERNOLIST.IsInitialized) Then
			If (FTPINTERNOLIST.Size>=1) Then
				TotalTemplates = FTPINTERNOLIST.Size-1
				Log("*************************")
				Log("Total TEMPLATES : " & TotalTemplates)
				Log("*************************")
				For i=0 To FTPINTERNOLIST.Size-1
					lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/interno/) ${i}/${TotalTemplates}"$
					Dim fName2 As String = FTPINTERNOLIST.Get(i)
					Dim oFName As String = $"REMOVE_${fName2}"$
					If File.Exists(Starter.InternalFolder, fName2) Then
						File.Copy(Starter.InternalFolder, fName2, Starter.InternalFolder, oFName)
						File.Delete(Starter.InternalFolder, fName2)
					End If
					Log(fName2)
					Try
						Dim sf As Object = GlobalFTP.DownloadFile("/interno/" & fName2, False, Starter.InternalFolder, fName2)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
						If Success Then
							Log("/interno/ : file was download successfully")
						Else
							Log("/interno/ : Error downloading file")
							InsertAlertErrors($"Erro ao Descarregar o ficheiro${CRLF}${fName2}"$)
							File.Copy(Starter.InternalFolder, oFName, Starter.InternalFolder, fName2)
						End If
						If File.Exists(Starter.InternalFolder, oFName) Then
							File.Delete(Starter.InternalFolder, oFName)
						End If
					Catch
						Log(LastException)
					End Try
					DUProgressBar(TotalTemplates,i)
				Next
			End If
		End If
		GlobalFTP.Close
	End If

	
	Dim res As ResumableSub = DURemoveAllLocalInfoAndSqlFiles
	Wait For(res) Complete (RemoveSuccessful As Boolean)
	lbldataupdateprocess.Text = ShareCode.MsgDataUpdateProcessConcluido
	'************************************************************************************************************
	' ACTUALIZA DE IMEDIATO AS STRINGS DOS DICTIONARY DESCARREGADOS DAS PASTA /DOCS/TEMPLATES/
	'************************************************************************************************************
	If Utils.NNE(ShareCode.UserLanguage) Then
		ShareCode.CheckTranslations(ShareCode.UserLanguage)
	Else
		ShareCode.CheckTranslations("PT")
	End If
	Starter.FirstInstall = False
		
		
	'*****************************************************************************************
	' REINICIA OS SERVICOS E GRAVA O FICHEIRO COM A DATA ACTUAL OU SEJA D AULTIMA SYNC
	'*****************************************************************************************
	ShareCode.Types_AlreadyDeleted = False
	Starter.RunUpdate = False
	Starter.StopLocationCheck = False
	StartService(LocationService)
	StartService(BackgroundUpdateService)
	ButtonWelcomeNext.Enabled = True
	ProgressBar1.Visible = False
	'*****************************************************************************************
	'LIBERTA O KEEPALIVE DURANTE A SINCRONIZACAO
	ShareCode.AwakeDevice(False)
	Return True
End Sub

Sub DownloadDocsOnly (date2watch As String, SyncDates As Boolean) As ResumableSub
	
	Starter.RunUpdate = True
	'*****************************************************************************************
	' DOWNLOAD DOS FICHEIROS NA PASTA DOCS
	'*****************************************************************************************
	lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
	Log("************************************************************")
	Log($" INITIAL : ${ShareCode.APPL_HOST}/${ShareCode.APP_DOMAIN} "$)
	Log("/docs/")
	Log("************************************************************")
	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
	GlobalFTP.TimeoutMs = 240000
	Dim FTPDOCSLIST As List
	Dim TotalDocs As Int = 0
	
	
	If SyncDates Then
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim Dates2Sync As List = Regex.Split("\|", date2watch )
		Dim iDateL As Long = DateTime.DateParse(Dates2Sync.Get(0))
		Dim eDateL As Long = DateTime.DateParse(Dates2Sync.Get(1))
		Dim LMDate As Long = Utils.GetLastNDaysLong(1)
	Else
		Dim LMDate As Long = Utils.GetLastNDaysLong(1)
	End If
	
	Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
	Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
	If Success Then
		DUProgressBar(100,0)
		If (files.Length >= 1) Then
			FTPDOCSLIST.Initialize
			TotalDocs = files.Length -1
			lbldataupdateprocess.Text = $"Criando Lista de ficheiros para download em :/docs/"$
			Sleep(500)
			For i = 0 To files.Length - 1
				Dim fName As String = files(i).Name
				If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".jpeg"))  Or _
						(fName.EndsWith(".pdf"))  Or (fName.EndsWith(".doc"))  Or (fName.EndsWith(".docx"))  Or _
						(fName.EndsWith(".xls"))  Or (fName.EndsWith(".xlsx"))  Or (fName.EndsWith(".ppt")) Or _ 
						(fName.EndsWith(".pptx"))  Or Not((fName.StartsWith("REPORT"))) Then
						
					' CRIAR A CONDICAO ENTRE DATAS PARA O SYNC MANUAL
					If SyncDates Then
						If ShareCode.DownloadDocsFromFTP = True Then
							If (files(i).Timestamp >= iDateL) And (files(i).Timestamp <= eDateL) Then
								FTPDOCSLIST.Add(files(i).Name)
								Log(files(i).Name)
							End If
						Else
							If (files(i).Timestamp >= LMDate) Then
								FTPDOCSLIST.Add(files(i).Name)
								Log(files(i).Name)
							End If
						End If
					Else
						If (files(i).Timestamp >= LMDate) Then
							FTPDOCSLIST.Add(files(i).Name)
							Log(files(i).Name)
						End If
					End If

				End If
			Next
			ProgressDialogHide
			Log("*************************")
			Log($"Total Files Added to /DOCS List = ${FTPDOCSLIST.Size} out of a Total of ${TotalDocs}"$)
			Log("*************************")
		End If
	Else
		Utils.ShowProcinLog("Main","RunSync","error getting files list from /docs/")
	End If
	If (FTPDOCSLIST.IsInitialized) Then
		If (FTPDOCSLIST.Size>=1) Then
			TotalDocs = FTPDOCSLIST.Size-1
			Log("*************************")
			Log("Total DOCS : " & TotalDocs)
			Log("*************************")
			For i=0 To FTPDOCSLIST.Size-1
				lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/docs/) ${i}/${TotalDocs}"$
				Dim fName As String = FTPDOCSLIST.Get(i)
				Log(fName)
				Try
					Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
					Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
					If Success Then
						Log("/docs/ : file was download successfully")
					Else
						Log("/docs/ : Error downloading file")
					End If
				Catch
					Log(LastException)
				End Try
				DUProgressBar(TotalDocs,i)
			Next
		End If
	End If

	'*****************************************************************************************
	' DOWNLOAD DOS FICHEIROS NA PASTA DOCS/TEMPLATES/
	'*****************************************************************************************
	Log("************************************************************")
	Log("/docs/templates")
	Log("************************************************************")
	DUProgressBar(100,0)
	lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
	Dim FTPTEMPLATESLIST As List
	Dim TotalTemplates As Int = 0
		
	Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/templates/")
	Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
	If Success Then
			
		If (files.Length >= 1) Then
			TotalDocs = files.Length -1
			FTPTEMPLATESLIST.Initialize
			For i = 0 To files.Length - 1
				lbldataupdateprocess.Text = $"Criando Lista de ficheiros para download em :/docs/templates/ ${i}/${TotalDocs}"$
				Dim fName2 As String = files(i).Name
				FTPTEMPLATESLIST.Add(files(i).Name)
			Next
		End If
	Else
		Utils.ShowProcinLog("Main","RunSync","error getting files list from /docs/templates/")
	End If
		
	If (FTPTEMPLATESLIST.IsInitialized) Then
		If (FTPTEMPLATESLIST.Size>=1) Then
			TotalTemplates = FTPTEMPLATESLIST.Size-1
			Log("*************************")
			Log("Total TEMPLATES : " & TotalTemplates)
			Log("*************************")
			For i=0 To FTPTEMPLATESLIST.Size-1
				lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/docs/templates/) ${i}/${TotalTemplates}"$
				Dim fName2 As String = FTPTEMPLATESLIST.Get(i)
				Log(fName2)
				Try
					Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/templates/" & fName2, False, Starter.InternalFolder, fName2)
					Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
					If Success Then
						Log("/docs/templates/ : file was download successfully")
					Else

						Log("/docs/templates/ : Error downloading file")
					End If
					'End If
				Catch
					Log(LastException)
				End Try
				DUProgressBar(TotalTemplates,i)
			Next
		End If
	End If
	
	'*****************************************************************************************
	' DOWNLOAD DOS FICHEIROS NA PASTA interno/
	'*****************************************************************************************
	Log("************************************************************")
	Log("/interno")
	Log("************************************************************")
	DUProgressBar(100,0)
	lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
	Dim FTPTEMPLATESLIST As List
	Dim TotalTemplates As Int = 0
		
	Dim sfl As Object = GlobalFTP.List("/interno/")
	Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
	If Success Then
			
		If (files.Length >= 1) Then
			TotalDocs = files.Length -1
			FTPTEMPLATESLIST.Initialize
			For i = 0 To files.Length - 1
				lbldataupdateprocess.Text = $"Criando Lista de ficheiros para download em :/interno/ ${i}/${TotalDocs}"$
				Dim fName2 As String = files(i).Name
				FTPTEMPLATESLIST.Add(files(i).Name)
			Next
		End If
	Else
		Utils.ShowProcinLog("Main","RunSync","error getting files list from /interno/")
	End If
		
	If (FTPTEMPLATESLIST.IsInitialized) Then
		If (FTPTEMPLATESLIST.Size>=1) Then
			TotalTemplates = FTPTEMPLATESLIST.Size-1
			Log("*************************")
			Log("Total TEMPLATES : " & TotalTemplates)
			Log("*************************")
			For i=0 To FTPTEMPLATESLIST.Size-1
				lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/interno/) ${i}/${TotalTemplates}"$
				Dim fName2 As String = FTPTEMPLATESLIST.Get(i)
				Log(fName2)
				Try
					Dim sf As Object = GlobalFTP.DownloadFile("/interno/" & fName2, False, Starter.InternalFolder, fName2)
					Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
					If Success Then
						Log("/interno/ : file was download successfully")
					Else

						Log("/interno/ : Error downloading file")
					End If
					'End If
				Catch
					Log(LastException)
				End Try
				DUProgressBar(TotalTemplates,i)
			Next
		End If
	End If
	GlobalFTP.Close
	
	'*****************************************************************************************
	' REINICIA OS SERVICOS E GRAVA O FICHEIRO COM A DATA ACTUAL OU SEJA D AULTIMA SYNC
	'*****************************************************************************************
'	File.writeString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_upd.log"$,Utils.GetCurrDatetimeExt)
	Starter.RunUpdate = False
	Starter.StopLocationCheck = False
	StartService(LocationService)
	ButtonWelcomeNext.Enabled = True
	ProgressBar1.Visible = False
	'*****************************************************************************************
	'LIBERTA O KEEPALIVE DURANTE A SINCRONIZACAO
	ShareCode.AwakeDevice(False)
	Return True
End Sub

Sub DURemoveAllLocalInfoAndSqlFiles As ResumableSub
	
	Dim LocaRes As Boolean = False
	Wait For (File.ListFilesAsync(Starter.Provider.SharedFolder)) Complete (Success As Boolean, Files As List)
	If Success Then
		For Each F As String In Files
			If F.ToLowerCase.EndsWith(".info") Then
				If Not(F.ToLowerCase.StartsWith("firstinstall")) Then
					File.Delete(Starter.Provider.SharedFolder,F)
				End If
			End If
		Next
		LocaRes = True
	Else
		LocaRes = False
	End If
	
	Wait For (File.ListFilesAsync(Starter.Provider.SharedFolder)) Complete (Success As Boolean, Files As List)
	If Success Then
		For Each F As String In Files
			If F.ToLowerCase.EndsWith(".sql") Then
				If Not(F.ToLowerCase.StartsWith("firstinstall")) Then
					File.Delete(Starter.Provider.SharedFolder,F)
				End If
			End If
		Next
		LocaRes = True
	Else
		LocaRes = False
	End If
	
	Return LocaRes
	
End Sub



Sub DownloadSqlFiles(fileInfo As String,fileName As String, isupdate As Boolean) As ResumableSub
	
	SqlFilesTotal = 0
	Dim res As ResumableSub = GetFirstInstalSqlFilesTotal(fileInfo, isupdate)
	Wait For(res) complete (result As Int)
	SqlFilesTotal = result
	
	If(SqlFilesTotal > 0)Then
		For i = 1 To SqlFilesTotal
			lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDados & $" ${i}/${SqlFilesTotal}"$
			Dim fileN As String = $"${fileName}${i}.sql"$
			Dim rs As ResumableSub = DownloadSqlFileWithFTP(fileN)
			Wait For(rs) Complete (finish As Boolean)
			DUProgressBar(SqlFilesTotal,i)
			Sleep(1)
		Next
		Return True
	End If

	Return False
End Sub

Sub DownloadSqlFilesFirstInstall(fileInfo As String,fileName As String, isupdate As Boolean) As ResumableSub
	
	SqlFilesTotal = 0
	Dim res As ResumableSub = GetFirstInstalSqlFilesTotal(fileInfo, isupdate)
	Wait For(res) complete (result As Int)
	SqlFilesTotal = result
	
	Dim res As ResumableSub = DeleteSqlFiles(fileName)
	Wait For(res) Complete (IsFilesDeleted As Boolean)
	
	If(IsFilesDeleted) Then

		If(SqlFilesTotal > 0)Then
			For i = 1 To SqlFilesTotal
				Dim fileN As String = $"${fileName}${i}.sql"$
				Dim rs As ResumableSub = DownloadSqlFileWithFTP(fileN)
				Wait For(rs) Complete (finish As Boolean)
'				AddCounters(i, SqlFilesTotal, lbldataupdatecopy)
			Next
			Return True
		End If
	End If
	Return False
End Sub



Sub ExecuteSqlFiles(fileName As String, isupdate As Boolean) As ResumableSub
	If(SqlFilesTotal > 0)Then
		For i = 1 To SqlFilesTotal
			lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleCarregarDados & $" ${i}/${SqlFilesTotal}"$
			Dim fileN As String = $"${fileName}${i}.sql"$
			Dim List1 As List
			
			Try
				List1 = File.ReadList(Starter.Provider.SharedFolder, fileN)
			Catch
				Log(LastException)
			End Try

			DataUpdateLabelTarefa.Visible = True
			DataUpdateProgressBar2.Visible = True
			
			If (List1.IsInitialized) Then
				Dim TotalLinesOfScripts As Int = List1.Size
				For n = 0 To List1.Size - 1
					DataUpdateLabelTarefa.Text = ShareCode.MsgExecProcAct & $" ${n}/${TotalLinesOfScripts}"$
					Dim sval As String = List1.Get(n)
					Dim rs As ResumableSub = MakeExecuteSqlFiles(sval, isupdate)
					Wait For(rs) Complete (finish As Boolean)
					DUProgressBar2(TotalLinesOfScripts,n)
				Next
			Else
				Utils.logError("Update SQL", ShareCode.SESS_OPER_User, $"${fileName}${i}.sql"$)
			End If
			DUProgressBar(SqlFilesTotal,i)
			Sleep(1)
		Next
		DataUpdateLabelTarefa.Visible = False
		DataUpdateProgressBar2.Visible = False
		Return True
	End If
	Return False
End Sub

Sub MakeExecuteSqlFiles(script As String, isupdate As Boolean) As ResumableSub
	
	'****************************************************************************************************************************
	' Correcção de erro reportado pelo Celso em 01/04/2020, em que se os TagCodes vierem so com "_" a aplicação estoira.
	' Corrigido, Forçando-os a "" nessa situação.
	'****************************************************************************************************************************
		
	If (Utils.NNE(script)) Then
		If ((isupdate) And (script.ToLowerCase.StartsWith("insert into `dta_requests"))) Then
			If TagCodesString = "_" Then TagCodesString = ""
			If (Utils.NNE(TagCodesString)) Then
				Dim res As ResumableSub = DBStructures.DeleteFromLocalDatabaseFromString(TagCodesString)
				Wait For(res) Complete (result As Boolean)
				If(result)Then
					TagCodesString = ""
				End If
			End If
		Else If ((isupdate) And (script.ToLowerCase.StartsWith("insert into `dta_tasks"))) Then
			If TagCodesTasksString ="_" Then TagCodesTasksString = ""
			If (Utils.NNE(TagCodesTasksString)) Then
				Dim res As ResumableSub = DBStructures.DeleteTasksFromLocalDatabaseFromString(TagCodesTasksString)
				Wait For(res) Complete (result As Boolean)
				If(result)Then
					TagCodesTasksString = ""
				End If
			End If
		Else If ((isupdate) And (script.ToLowerCase.StartsWith("insert into `dta_typerequests"))) Then
			If TagCodesTPRequestsString = "_" Then TagCodesTPRequestsString = ""
			If (Utils.NNE(TagCodesTPRequestsString)) Then
				Dim res As ResumableSub = DBStructures.DeleteTPRequestsFromLocalDatabaseFromString(TagCodesTPRequestsString)
				Wait For(res) Complete (result As Boolean)
				If(result)Then
					TagCodesTPRequestsString = ""
				End If
			End If
		Else If ((isupdate) And (script.ToLowerCase.StartsWith("insert into `dta_objects"))) Then
			If TagCodesObjectsString = "_" Then TagCodesObjectsString = ""
			If (Utils.NNE(TagCodesObjectsString)) Then
				Dim res As ResumableSub = DBStructures.DeleteObjectsFromLocalDatabaseFromString(TagCodesObjectsString)
				Wait For(res) Complete (result As Boolean)
				If(result)Then
					TagCodesObjectsString = ""
				End If
			End If
		Else If ((isupdate) And (script.ToLowerCase.StartsWith("insert into `dta_locations"))) Then
			If TagCodesLocationsString = "_" Then TagCodesLocationsString = ""
			If (Utils.NNE(TagCodesLocationsString)) Then
				Dim res As ResumableSub = DBStructures.DeleteLocationsFromLocalDatabaseFromString(TagCodesLocationsString)
				Wait For(res) Complete (result As Boolean)
				If(result)Then
					TagCodesLocationsString = ""
				End If
			End If
		Else If ((isupdate) And (script.ToLowerCase.StartsWith("insert into `dta_contacts"))) Then
			If TagCodesContactsString = "_" Then TagCodesContactsString = ""
			If (Utils.NNE(TagCodesContactsString)) Then
				Dim res As ResumableSub = DBStructures.DeleteContactsFromLocalDatabaseFromString(TagCodesContactsString)
				Wait For(res) Complete (result As Boolean)
				If(result)Then
					TagCodesContactsString = ""
				End If
			End If
		Else If ((isupdate) And (script.ToLowerCase.StartsWith("insert into `dta_warehouses"))) Then
			If TagCodesWarehousesString = "_" Then TagCodesWarehousesString = ""
			If (Utils.NNE(TagCodesWarehousesString)) Then
				Dim res As ResumableSub = DBStructures.DeleteWarehousesFromLocalDatabaseFromString(TagCodesWarehousesString)
				Wait For(res) Complete (result As Boolean)
				If(result)Then
					TagCodesWarehousesString = ""
				End If
			End If
		Else If ((isupdate) And (script.ToLowerCase.StartsWith("insert into `dta_articles"))) Then
			If TagCodesArticlesString = "_" Then TagCodesArticlesString = ""
			If (Utils.NNE(TagCodesArticlesString)) Then
				Dim res As ResumableSub = DBStructures.DeleteArticlesFromLocalDatabaseFromString(TagCodesArticlesString)
				Wait For(res) Complete (result As Boolean)
				If(result)Then
					TagCodesArticlesString = ""
				End If
			End If
		Else If ((isupdate) And script.ToLowerCase.StartsWith("insert into `type_")) And (ShareCode.Types_AlreadyDeleted = False) Then
			lbldataupdateprocess.Text = ShareCode.MsgDeleteTypeTabelas
			Log("Deleting type_ tables")
			Dim RBackUpAndDeleteTypes As ResumableSub = BackUpAndDeleteTypes
			Wait For(RBackUpAndDeleteTypes) Complete (DeletedTables As Boolean)
			
		End If
		
		lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleCarregarDados
		Try
			Utils.SaveSQLToLog("DataUpdate",script, "")
			Return True
		Catch
			Log($"ERROR: ${script} - EXCEPTION = ${LastException}"$)
			Return False
		End Try
	Else
		Log($"Empty script"$)
	End If
	Return False
End Sub

Sub MakeDeleteSqlFile(scriptsFilename As String) As ResumableSub
	
	If Utils.NNE(scriptsFilename) Then
		
		Dim ListaDeletes As List = File.ReadList(Starter.Provider.SharedFolder, scriptsFilename)
		For l=0 To ListaDeletes.Size -1
			Dim script As String = ListaDeletes.Get(l)
			Try
				Utils.SaveSQLToLog("DataUpdate",script, "")
			Catch
				Log($"ERROR: ${script} - EXCEPTION = ${LastException}"$)
				Return False
			End Try
		Next
		Return True
	End If

	Return True
	
End Sub

Sub BackUpAndDeleteTypes As ResumableSub
	
	Dim Res As Boolean = True
	
	Res = Utils.SaveSQL2FileAndDelete("type_accessmodetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_actionrequesttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_actiontypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_alertrelationtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_alertstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_answertypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_articlestypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_asmodetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_assignedtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_availabletypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_cla_itemtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_communicationtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_componenttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_conditionstype", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_conformitytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_connmodetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_contacttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_contracttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_dataentrytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_datanaturetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_datatypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_docnaturetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_documenttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_emailactiontypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_emaildriverstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_emailencripttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_entityparams", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_entityproperties", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_entitytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_entrytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_equipmentstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_equipstatetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_eventgrouptypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_eventkindtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_eventtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_execmodestypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_filetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_formfields", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_formfieldstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_formfieldtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_genders", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_generalstatetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_gravitytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_icontypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_idcards", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_inouttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_level3childtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_level3mastertypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_level3types", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_links", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_locationtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_mapcontenttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_menulocations", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_modules", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_moneytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_nonccategories", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_nonconformitytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_notetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_notifactionstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_notifioriginstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_objectnaturetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_objectrelationtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_operationtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_orientationtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_originstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_originvaluetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_oscilationtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_papersizetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_paramtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_paymentmethods", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_paymenttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_perioddaytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_periodicitytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_periodstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_periodsviewtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_priceaffecttype", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_pricefromtype", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_printouttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_prioritytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_propertytypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_reasontypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_recipienttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_relationtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_repitemstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_repreltypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_requeststypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_resobsgroupstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_resobstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_resulttypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_sendtotypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_skilltypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_stagetype", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_statetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_statusobjtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_statustypes", Res)
	
	Res = Utils.SaveSQL2FileAndDelete("type_tasksmodetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_taskstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_tpgroupstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_trclmodetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_tritemstypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_unavailabletypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_unittype", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_userlogtypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_validationexectypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_valuetypes", Res)
	Res = Utils.SaveSQL2FileAndDelete("type_zonesaffecttypes", Res)
	
	ShareCode.Types_AlreadyDeleted = True
	
	If Not(Res) Then
		Log("ERRO AO APAGAR OS TYPE_")
		Utils.ReverSQLFromFilesAndDelete
	End If
	Return Res
End Sub

Sub DeleteTypesFromTable(script As String)
	
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

'******************************************************
' ERRO INDICES LOCATIONS CONTACTS
'******************************************************
Sub GetFirstInstalSqlFilesTotal22(fileName As String, isupdate As Boolean) As ResumableSub
	'Dim total As Int = -1:   ???
	TagCodesString = ""
	TagCodesTasksString = ""
	TagCodesContactsString = ""
	TagCodesLocationsString = ""
	TagCodesTPRequestsString = ""
	TagCodesObjectsString = ""
	Dim trycount As Int = 0
	Dim dotry As Boolean = True
	Dim total As Int = -1
	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
	Dim ctm As CustomTrustManager
	ctm.InitializeAcceptAll
	GlobalFTP.SetCustomSSLTrustManager(ctm)
	GlobalFTP.TimeoutMs = 240000
	Do While (dotry And (trycount <3))
		
		Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & fileName, False, Starter.Provider.SharedFolder, fileName)
		Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
		If Success Then
			
			Try
				Log(fileName & " file was download successfully")
				
				If ShareCode.newReturn = 1 Then
					
					Dim parser As JSONParser
					Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, fileName)
					parser.Initialize(JsonStruct)
					Dim root As Map = parser.NextObject
					Dim DataHora As String = root.Get("datetime")
					Dim Totalfiles As Int = root.Get("files")
					Dim inserts As List = root.Get("inserts")
					'**************************************************************************************
					' APAGA OS REGISTOS CORRESPONDENTES AOS INSERTS QUE ESTAO NOS SCRIPTS SQL A EXECUTAR
					' ABAIXO. ISTO GARANT QUE NAO VAMOS TER ERROS DE INDICES
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
					'*************************************************************************
				Else
						
					Dim List1 As List
					List1 = File.ReadList(Starter.Provider.SharedFolder, fileName)
					total = List1.Get(0) ' Numero de ficheiros para download
					Dim date As String = List1.Get(1)
					Utils.UpdateLiteUpdateDateTime(date)
					DBStructures.UpdateWorkerDbLastUpdate(date)
					dotry = False
					trycount = 3
					GlobalFTP.Close
				End If
				
				Return total
			Catch
				Log(LastException)
				trycount = trycount + 1
			End Try
			
		Else
			Log(LastException)
			Log("Error downloading file " & fileName)
			trycount = trycount + 1
		End If
	Loop

	GlobalFTP.Close
	Return total
End Sub

Sub GetFirstInstalSqlFilesTotal(fileName As String, isupdate As Boolean) As ResumableSub
	'Dim total As Int = -1:   ???
	TagCodesString = ""
	TagCodesTasksString = ""
	TagCodesContactsString = ""
	TagCodesLocationsString = ""
	TagCodesTPRequestsString = ""
	TagCodesObjectsString = ""
	Dim trycount As Int = 0
	Dim dotry As Boolean = True
	Dim total As Int = -1
	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
	Dim ctm As CustomTrustManager
	ctm.InitializeAcceptAll
	GlobalFTP.SetCustomSSLTrustManager(ctm)
	GlobalFTP.TimeoutMs = 240000
	Do While (dotry And (trycount <3))
		
		Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & fileName, False, Starter.Provider.SharedFolder, fileName)
		Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
		If Success Then
			
			Try
				Log(fileName & " file was download successfully")
				
				If ShareCode.newReturn = 1 Then
					Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, fileName)
					Dim parser As JSONParser
					parser.Initialize(JsonStruct)
					Dim root As Map = parser.NextObject
					Dim DataHora As String = root.Get("datetime")
					Dim Totalfiles As Int = root.Get("files")
					Dim inserts As List = root.Get("inserts")
					'**************************************************************************************
					' APAGA OS REGISTOS CORRESPONDENTES AOS INSERTS QUE ESTAO NOS SCRIPTS SQL A EXECUTAR
					' ABAIXO. ISTO GARANT QUE NAO VAMOS TER ERROS DE INDICES
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
					'*************************************************************************
				Else
						
					Dim List1 As List
					List1 = File.ReadList(Starter.Provider.SharedFolder, fileName)
					total = List1.Get(0) ' Numero de ficheiros para download
					Dim date As String = List1.Get(1)
					Utils.UpdateLiteUpdateDateTime(date)
					DBStructures.UpdateWorkerDbLastUpdate(date)
					dotry = False
					trycount = 3
					GlobalFTP.Close
					
					If (isupdate) Then
						TagCodesString = List1.Get(1)
						TagCodesTasksString = List1.Get(2)
						TagCodesObjectsString = List1.Get(3)
						Dim date As String = List1.Get(4)
						TagCodesTPRequestsString = List1.Get(5)
						'***************************************
						'ALTERACAO INCLUIR LOCATIONS E CONTACTS
						'***************************************
						Try
							TagCodesLocationsString = List1.Get(6)
						Catch
							Log(LastException)
						End Try
					
						Try
							TagCodesContactsString = List1.Get(7)
						Catch
							Log(LastException)
						End Try
					
						Try
							TagCodesWarehousesString = List1.Get(8)
						Catch
							Log(LastException)
						End Try
					
						Try
							TagCodesArticlesString = List1.Get(9)
						Catch
							Log(LastException)
						End Try
					
					
						TagCodes.Initialize
						TagCodes = Regex.Split("\,", TagCodesString)
					Else
						Dim date As String = List1.Get(1)
						Utils.UpdateLiteUpdateDateTime(date)
					End If
					
				End If

				Return total
			Catch
				Log(LastException)
				trycount = trycount + 1
				lbldataupdateprocess.Text = ShareCode.MsgUpdateErroActualizar
			End Try
			
		Else
			Log(LastException)
			Log("Error downloading file " & fileName)
			trycount = trycount + 1
		End If
	Loop

	GlobalFTP.Close
	Return total
End Sub

Sub DownloadSqlFileWithFTP(filename As String) As ResumableSub

	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
	GlobalFTP.TimeoutMs =240000
	Log(filename)
	Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & filename, False, Starter.Provider.SharedFolder, filename)
	Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
	If Success Then
		Log(filename & " file was download successfully")
		GlobalFTP.Close
		Return True
	Else
		GlobalFTP.Close
		Return False
		Log("Error downloading file " & filename)
	End If
End Sub

Sub DownloadFilesWithFTP(dlg As Label) As ResumableSub
	Dim CURRENT_COUNTER As Int = 0
	Dim END_COUNTER As Int = 0
	
	Dim CURRENT_COUNTER2 As Int = 0
	Dim END_COUNTER2 As Int = 0
	
	Log("************************************************************")
	Log($" 		INITIAL : ${ShareCode.APPL_HOST}/${ShareCode.APP_DOMAIN} "$)
	Log("************************************************************")
	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
'	Dim ctm As CustomTrustManager
'	ctm.InitializeAcceptAll
'	myFTP.SetCustomSSLTrustManager(ctm)
	GlobalFTP.TimeoutMs = 240000
	
	'************************************************************************************************************
	' Inicio do Processamento da pasta /docs/
	'************************************************************************************************************
	Utils.ShowProcinLog("DataUpdate","DownloadFilesWithFTP","Start FTP with /docs/")
	lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
	Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")

	
	Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	If Success Then
		
		For l1 = 0 To Files.Length - 1
			Log($"/docs/ : ${Files(l1).Name}"$)
		Next

		Dim LMDate As Long = Utils.GetLastNDaysLong(1) '.GetLastMonthDateLong
		
		If (Files.Length >= 1) Then
			FTPFileList.Initialize
			For i = 0 To Files.Length - 1
				Dim fName As String = Files(i).Name
				If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".jpeg"))  Or _
						(fName.EndsWith(".pdf"))  Or (fName.EndsWith(".doc"))  Or (fName.EndsWith(".docx"))  Or _
						(fName.EndsWith(".xls"))  Or (fName.EndsWith(".xlsx"))  Or (fName.EndsWith(".ppt")) Or _
						(fName.EndsWith(".pptx"))  Or (fName.StartsWith("REPORT")) = False Then
					If (Files(i).Timestamp >= LMDate) Then
						FTPFileList.Add(Files(i).Name)
					End If
				End If
			Next
		End If
	Else
		Utils.ShowProcinLog("DataUpdate","DownloadFilesWithFTP","error getting files list from /docs/")
		CURRENT_COUNTER = END_COUNTER
'		AddCounters(CURRENT_COUNTER,CURRENT_COUNTER, dlg)
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
						Log("/docs/ : file was download successfully")
					Else

						Log("/docs/ : Error downloading file")
					End If
					'End If
				Catch
					Log(LastException)
				End Try
				
				If (FTPFileList.Size-1 > CURRENT_COUNTER) Then
					CURRENT_COUNTER = CURRENT_COUNTER+1
				End If
'				AddCounters(CURRENT_COUNTER, END_COUNTER, dlg)
			Next
		End If
		
	End If

	'************************************************************************************************************
	' Fim do Processamento da pasta /docs/
	' Inicio do Processamento da pasta /docs/templates/
	'************************************************************************************************************
	Utils.ShowProcinLog("DataUpdate","DownloadFilesWithFTP","Start FTP with /docs/templates")
	lbldataupdateprocess.Text = "A descarregar ficheiros complementares (templates) do servidor ..."
	Dim sf2 As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/templates/")


	Wait For (sf2) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	If Success Then
		
		For l2 = 0 To Files.Length - 1
			Log($"/docs/templates/ : ${Files(l2).Name}"$)
		Next
		
		Dim LMDate2 As Long = Utils.GetLastNDaysLong(1) '.GetLastMonthDateLong
		'***************************************************************************
		' AlTERACAO PC
		' INCLUIR OS dictionary NA LISTA DE FICHIROS A COPIAR DO SERVIDOR
		'***************************************************************************
		If (Files.Length >= 1) Then
			FTPFileList2.Initialize
			For i = 0 To Files.Length - 1
				Dim fName2 As String = Files(i).Name
				If (fName2.EndsWith(".png")) Or (fName2.EndsWith(".jpg"))  Or (fName2.EndsWith(".jpeg"))  Or _
						(fName2.EndsWith(".pdf"))  Or (fName2.EndsWith(".doc"))  Or (fName2.EndsWith(".docx"))  Or _
						(fName2.EndsWith(".xls"))  Or (fName2.EndsWith(".xlsx"))  Or _
						(fName2.EndsWith(".ppt")) Or (fName2.EndsWith(".pptx"))  Or (fName2.StartsWith("REPORT")) = False Or _
						(fName2.StartsWith("dictionary")) Or (fName2.EndsWith(".html")) Then
					FTPFileList2.Add(Files(i).Name)
				End If
			Next
		End If
	Else
		Utils.ShowProcinLog("DataUpdate","DownloadFilesWithFTP","error getting files list from /docs/templates/")
		CURRENT_COUNTER2 = END_COUNTER2
'		AddCounters(CURRENT_COUNTER2,CURRENT_COUNTER2, dlg)
	End If
	
	If (FTPFileList2.IsInitialized) Then
		If (FTPFileList2.Size>=1) Then
			END_COUNTER2 = FTPFileList2.Size-1
			For i=0 To FTPFileList2.Size-1
				Dim fName2 As String = FTPFileList2.Get(i)
				'If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
				Log(fName2)
				Try
					Dim sf2 As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/templates/" & fName2, False, Starter.InternalFolder, fName2)
					Wait For (sf2) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
					If Success Then
						Log("/docs/templates/ : file was download successfully")
					Else
						Log("/docs/templates/ : Error downloading file")
					End If
					'End If
				Catch
					Log(LastException)
				End Try
				
				If (FTPFileList2.Size-1 > CURRENT_COUNTER2) Then
					CURRENT_COUNTER2 = CURRENT_COUNTER2+1
				End If
'				AddCounters(CURRENT_COUNTER2, END_COUNTER2, dlg)
				
			Next
		End If
		
	End If
	
	'************************************************************************************************************
	' Fim do Processamento da pasta /docs/templates/
	'************************************************************************************************************
	GlobalFTP.Close
	
	'************************************************************************************************************
	' ACTUALIZA DE IMEDIATO AS STRINGS DOS DICTIONARY DESCARREGADOS DAS PASTA /DOCS/TEMPLATES/
	'************************************************************************************************************
	If Utils.NNE(ShareCode.UserLanguage) Then
		ShareCode.CheckTranslations(ShareCode.UserLanguage)
	Else
		ShareCode.CheckTranslations("PT")
	End If
	
	Return True
End Sub

Sub UpdateFilesWithFTP(datacontrol As String,  dlg As Label) As ResumableSub
	
	DUProgressBar(0,0)
	
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
		' VERIFICA LISTA DE FICHEIROS DO SERVIDOR /DOCS/
		'************************************************************
		
		Log("************************************************************")
		Log($" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST} "$)
		Log( $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$ )
		Log("/docs/")
		Log("************************************************************")
		Dim flist As List : flist.Initialize  ' = File.ListFiles(Starter.InternalFolder)
		Dim flisthtml As List : flisthtml.Initialize
		
		Dim GlobalFTP As FTP
		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
		GlobalFTP.TimeoutMs = 240000
		
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
						Dim ext As String = fName.SubString( fName.LastIndexOf(".") +1 )
						If (Files(i).Timestamp >= datacontrolParse) Then
							Try
								Log(fName)
								flist.Add(Types.MakeDownUpFile(Files(i).Name, ext, Files(i).Timestamp))
							Catch
								Log(LastException)
							End Try
						End If
					Else If (fName.EndsWith(".html")) Then
						Dim ext As String = "html"
						If ((Files(i).Timestamp >= datacontrolParse) Or Not(Files(i).Name.StartsWith("REPORT_"))) Then
							Try
								Log(fName)
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
						Dim makeCopy As Boolean = True 'False
						
'						If Not(File.Exists(Starter.InternalFolder, fName1.Filename)) Then
'							makeCopy = True
'						End If
					
						If (makeCopy) Then
							flistLast.Add(fName1.Filename)
						End If
					Next
				End If
			
				'************************************************************
				' EFECTUA O DOWNLOAD DOS FICHEIROS NA LISTA
				'************************************************************
				If (flistLast.Size>=1) Then
					SqlFilesTotal = flistLast.Size-1
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
						DUProgressBar(SqlFilesTotal,i)
					Next
				Else
					
					Log("vazio 0")
				End If
			Else
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
					SqlFilesTotal = flistLast.Size-1
					For i=0 To flistLast.Size-1
						Dim fName As String = flistLast.Get(i)
						'If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".pdf")) Or (fName.EndsWith(".html")) Then
						'Log(fName)
						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
						If Success Then
							Log("file was download successfully")
						Else
							Log("Error downloading file")
						End If
						'End If
						DUProgressBar(SqlFilesTotal,i)
					Next
				Else
					DUProgressBar(0,0)
					Log("vazio 0")
				End If
			Else
				DUProgressBar(0,0)
				Log("vazio 1")
			End If
			'Starter.GlobalFTP.Close
		Else
			DUProgressBar(0,0)
			Log("Sem sucesso!")
		End If
		
		GlobalFTP.Close
		
		'************************************************************
		' VERIFICA LISTA DE FICHEIROS DO SERVIDOR /DOCS/TEMPLATES/
		'************************************************************
		
		Log("************************************************************")
		Log($" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST} "$)
		Log($"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$ )
		Log("/docs/templates/")
		Log("************************************************************")
		Dim flist As List : flist.Initialize  ' = File.ListFiles(Starter.InternalFolder)
		Dim flisthtml As List : flisthtml.Initialize
		
		Dim GlobalFTP As FTP
		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
		GlobalFTP.TimeoutMs = 240000
		
		Dim sf1 As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/templates/")
		Wait For (sf1) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
		
		If Success Then

			'************************************************************
			' CRIA LISTA DE FICHEIROS COM BASE NA DATA INDICADA
			'************************************************************
			If (Files.Length >= 1) Then
				flist.Initialize
				For i = 0 To Files.Length - 1
					Dim fName2 As String = Files(i).Name
					
					If (fName2.EndsWith(".png")) Or (fName2.EndsWith(".jpg"))  Or (fName2.EndsWith(".jpeg"))  Or _
						(fName2.EndsWith(".pdf"))  Or (fName2.EndsWith(".doc"))  Or (fName2.EndsWith(".docx"))  Or _
						(fName2.EndsWith(".xls"))  Or (fName2.EndsWith(".xlsx"))  Or (fName2.EndsWith(".ppt")) Or _
						(fName2.EndsWith(".pptx"))  Or (fName2.StartsWith("REPORT")) = False Or (fName2.StartsWith("dictionary")) Then
						Dim ext As String = fName.SubString( fName.LastIndexOf(".") +1 )
						Log(fName2)
						flist.Add(Types.MakeDownUpFile(Files(i).Name, ext, Files(i).Timestamp))
					Else If (fName2.EndsWith(".html")) Then
						Log(fName2)
						Dim ext As String = "html"
						flisthtml.Add(Types.MakeDownUpFile(Files(i).Name, ext, Files(i).Timestamp))
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
						Dim makeCopy As Boolean = True 'False
					
						If (makeCopy) Then
							flistLast.Add(fName1.Filename)
						End If
					Next
				End If
			
				'************************************************************
				' EFECTUA O DOWNLOAD DOS FICHEIROS NA LISTA
				'************************************************************
				If (flistLast.Size>=1) Then
					SqlFilesTotal = flistLast.Size-1
					For i=0 To flistLast.Size-1
						Dim fName2 As String = flistLast.Get(i)
						Log(fName2)
						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/templates/" & fName2, False, Starter.InternalFolder, fName2)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
						If Success Then
							Log("file was download successfully")
						Else
							Log("Error downloading file")
						End If
						'End If
						
						DUProgressBar(SqlFilesTotal,i)
					Next
				Else
					DUProgressBar(0,0)
					Log("vazio 0")
				End If
			Else
				DUProgressBar(0,0)
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
					SqlFilesTotal = flistLast.Size-1
					For i=0 To flistLast.Size-1
						Dim fName2 As String = flistLast.Get(i)
						Log(fName2)
						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/templates/" & fName2, False, Starter.InternalFolder, fName2)
						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
						If Success Then
							Log("file was download successfully")
						Else
							Log("Error downloading file")
						End If
						'End If
						DUProgressBar(SqlFilesTotal,i)
					Next
				Else
					DUProgressBar(0,0)
					Log("vazio 0")
				End If
			Else
				DUProgressBar(0,0)
				Log("vazio 1")
			End If
			'Starter.GlobalFTP.Close
		Else
			DUProgressBar(0,0)
			Log("Sem sucesso!")
		End If
		
		GlobalFTP.Close
		
		'************************************************************************************************************
		' ACTUALIZA DE IMEDIATO AS STRINGS DOS DICTIONARY DESCARREGADOS DAS PASTA /DOCS/TEMPLATES/
		'************************************************************************************************************
		If Utils.NNE(ShareCode.UserLanguage) Then
			ShareCode.CheckTranslations(ShareCode.UserLanguage)
		Else
			ShareCode.CheckTranslations("PT")
		End If
		
		Return True
	Else
		DUProgressBar(0,0)
		Log("vazio 2")
	End If
	
	'************************************************************************************************************
	' ACTUALIZA DE IMEDIATO AS STRINGS DOS DICTIONARY DESCARREGADOS DAS PASTA /DOCS/TEMPLATES/
	'************************************************************************************************************
	If Utils.NNE(ShareCode.UserLanguage) Then
		ShareCode.CheckTranslations(ShareCode.UserLanguage)
	Else
		ShareCode.CheckTranslations("PT")
	End If
	
	Return True
End Sub

Sub StartTheActivityLiteUpdate(tagCodesList As String)
	IsLoginUpdate = True
	Try
		RunLiteUpdate(tagCodesList)
	Catch
		Log(LastException)
		ButtonWelcomeNext_Click
		''		StartActivity(MainMenu)
'		CallSubDelayed2(MainMenu, "StartTheActivity", True)
'		Activity.Finish
	End Try
End Sub

Sub RunLiteUpdate(tagCodesList As String) 'De onde vem esta lista de tagcodes ?
	
	'*****************************************************************************************
	' Para o serviço de localização e faz disable ao botao de Concluir
	'*****************************************************************************************
	Starter.StopLocationCheck = True
	StopService(LocationService)
	ButtonWelcomeNext.Enabled = False

	SetUpDownArrows("Download")
	lbldataupdatetitle.Text = ShareCode.MsgUpdateTitleActualizacao
	lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleObterInfo
	lbldataupdateprocess.Text = ""
	
	Dim res As ResumableSub = GenerateLiteUpdateFiles(tagCodesList, Me)
	Wait For(res) Complete (ReturnData As FileDownloadInformation) 'GenerateComplete As Boolean)
	
	If (ReturnData.Downloaded) Then
		
		Dim UPDATE_INSTALL_INFO As String = $"${ReturnData.DownloadFilename}.INFO"$
		Dim updateInstallFilesName As String = ReturnData.DownloadFilename
		
		lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDados
		Utils.ShowProcinLog("DataUpdate","RunLiteUpdate",lbldataupdateprocess.Text)
		Dim res As ResumableSub = DownloadSqlFilesLiteUpdate(UPDATE_INSTALL_INFO, updateInstallFilesName)
		Wait For(res) Complete (result As Boolean)
							
		If(result)Then

			lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleCarregarDados
			Utils.ShowProcinLog("DataUpdate","RunLiteUpdate",lbldataupdateprocess.Text)
			ShareCode.AlreadyDeleted = True
			Dim res As ResumableSub = ExecuteSqlFiles(updateInstallFilesName, True)
			Wait For(res) Complete (finish As Boolean)
								
			If(finish)Then
				Dim res As ResumableSub = SendServerProcessComplete(False,ReturnData.DownloadFilename, Me)
				Wait For(res) Complete (Completed As Boolean)
				
				Dim res As ResumableSub = DeleteSqlFiles(updateInstallFilesName)
				Wait For(res) Complete (IsFilesDeleted As Boolean)
								
				If(IsFilesDeleted) Then
					lbldataupdateprocess.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
					Utils.ShowProcinLog("DataUpdate","RunLiteUpdate",lbldataupdateprocess.Text)
					Dim res As ResumableSub = UpdateFilesWithFTP("",lbldataupdatedownload)
					Wait For(res) Complete (IsDownloadFilesFinish As Boolean)
								
					If (IsDownloadFilesFinish) Then
						ButtonWelcomeNext.Enabled = True
						ProgressBar1.Visible = False
						lbldataupdateprocess.Text = ShareCode.MsgDataUpdateProcessConcluido
						Utils.ShowProcinLog("DataUpdate","RunLiteUpdate",lbldataupdateprocess.Text)
						lbldataupdateprocess.TextColor =  Consts.ColorMain
						ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Utils.GetCurrDatetime
					End If
				End If
			End If
		End If
		
	End If
	
	ProgressBar1.Visible = False
	'*****************************************************************************************
	' Reinicia o serviço de localização e faz enable ao botao de Concluir
	'*****************************************************************************************
	Starter.StopLocationCheck = False
	StartService(LocationService)
	ButtonWelcomeNext.Enabled = True
End Sub


Sub DownloadSqlFilesLiteUpdate(fileInfo As String,fileName As String) As ResumableSub
	
	SqlFilesTotal = 0
	Dim res As ResumableSub = GetLiteUpdateInstalSqlFilesTotal(fileInfo)
	Wait For(res) complete (result As Int)
	SqlFilesTotal = result
	
	If(SqlFilesTotal > 0)Then
		For i = 1 To SqlFilesTotal
			Dim fileN As String = $"${fileName}${i}.sql"$
			Dim rs As ResumableSub = DownloadSqlFileWithFTP(fileN)
			Wait For(rs) Complete (finish As Boolean)
'			AddCounters(i, SqlFilesTotal, lbldataupdatecopy)
		Next
		Return True
	End If

	Return False
End Sub

Sub GetLiteUpdateInstalSqlFilesTotal(fileName As String) As ResumableSub
	'Dim total As Int = -1:   ???
	TagCodesString = ""
	TagCodesTasksString = ""
	TagCodesTPRequestsString = ""
	TagCodesObjectsString = ""
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
		Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & fileName, False, Starter.Provider.SharedFolder, fileName)
		Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
		If Success Then
			
			Try
				Log(fileName & " file was download successfully")
				Dim List1 As List
				List1 = File.ReadList(Starter.Provider.SharedFolder, fileName)
				total = List1.Get(0)
				Dim LineOne As String = List1.Get(1)
				Dim LineTwo As String = List1.Get(2)

				GlobalFTP.Close
		
				Return total
			Catch
				Log(LastException)
				trycount = trycount +1
			End Try
			
		Else
			Log(LastException)
			Log("Error downloading file " & fileName)
			trycount = trycount +1
		End If
	Loop
	

	GlobalFTP.Close
	Return total
End Sub


Sub InsertAlertErrors(ErrorMsg As String)
	
	Log("INSERT ALERTA BACKGROUNDUPDATESERVICE")
	Private nRecord As Cursor
	Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
	Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
	Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
							values (${mID}, '${alerttagcode}', '', 'ALRTREL_REQUESTS', 'ALRTTYP_NOTIFY', 1, 1, '${ErrorMsg}', 
	'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
	Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")

	CallSub(MainMenu,"BadgeCheckUpdate")
	
End Sub

Sub GenerateLiteUpdateFiles(tagCodesList As String, jobObject As Object) As ResumableSub
	Dim ReturnData As FileDownloadInformation = Types.MakeFileDownloadInformationClear
	If Starter.FirstInstall Then
		ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Utils.GetLast60Days
		Utils.ShowProcinLog("DataUpdate","GenerateLiteUpdateFiles", $"Set APP_LAST_LITE_UPDATE_DATETIME to Date - 60 Days : ${ShareCode.APP_LAST_LITE_UPDATE_DATETIME}"$)
	End If
	
	ReturnData.DownloadFilename = Utils.RandomString
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("name", ReturnData.DownloadFilename)
	params.Put("datetime", ShareCode.APP_LAST_LITE_UPDATE_DATETIME)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("requestTagcodes", tagCodesList)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)

	Dim JSON As JSONGenerator
	JSON.Initialize(params)
	Dim data As String =   JSON.ToPrettyString(1)
	
	Utils.ShowProcinLog("DataUpdate","GenerateLiteUpdateFiles",data)
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/requests-pending"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim Job As HttpJob
		Job.Initialize("",jobObject)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		ReturnData.Downloaded = Job.Success
		Job.Release
	Else
		Log("Error APP_WORKING_LOCAL")
	End If
	Return ReturnData
End Sub

'*********************************************************************
' TIP: Remoção de ficheiros de download INFO no servidor
'*********************************************************************
Sub SendServerProcessComplete(debug As Boolean, filename As String, jobObject As Object) As ResumableSub
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/removeFilesSqlite"$
	Dim Job As HttpJob
	Job.Initialize("",jobObject)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("debug", Utils.Bool2Int(debug))
	params.Put("_user", ShareCode.SESS_User)
	params.Put("name", filename)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)

	Job.PostString(ServerAddress, data)
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Job.Release
		Return True
	Else
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	Return False
End Sub

Sub UpdateData2Server As ResumableSub
	
	If lbldataupdatetitle.Visible Then
		lbldataupdatetitle.Text = ShareCode.MsgSendDataServer
	End If
		
	ProgressDialogShow2(ShareCode.checklistenviardados2BO, False)
	Starter.RunUpdate = True
	Log("**************************************")
	Log(" SENDING LOCAL DATA TO SERVER ")
	Log("**************************************")
	Log("**************************************")
		
	Dim WITHFILES As Boolean = True
	Dim RecCounter As Int = LocalDataToUpdate
	Dim Resposta As Int = 0
	
	If RecCounter > 0 Then
'		Msgbox2Async($"Existe informação OFFLINE por enviar ao Servidor.${CRLF}NOTA : Uma grande quantidade de dados por enviar pode causar erros de transmissão em redes com pouco sinal.${CRLF}${CRLF}Por favor seleccione uma das seguintes opções."$, ShareCode.GeneralInfoTitle, "ENVIAR TUDO", "ENVIAR MAIS TARDE", "SELECCIONAR", Null, False)
		Msgbox2Async($"Existe informação OFFLINE por enviar ao Servidor.${CRLF}NOTA : Uma grande quantidade de dados por enviar pode causar erros de transmissão em redes com pouco sinal.${CRLF}${CRLF}Por favor seleccione uma das seguintes opções."$, ShareCode.GeneralInfoTitle, "ENVIAR TUDO", "ENVIAR MAIS TARDE", "", Null, False)
		Wait For Msgbox_Result (Result As Int)
		If Result = DialogResponse.POSITIVE Then ' ENVIAR TUDO

			Try
				Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=0"$
				Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
			Catch
				Log(LastException)
				Dim sSQL As String = $"select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0"$
				Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
				WITHFILES = False
			End Try
				
			Try
				Dim sSQLEmails As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where up_state=0 and up_type=0"$
				Dim RecordLocalEmailDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQLEmails)
				Dim EmailCheck As Boolean = True
			Catch
				Log(LastException)
				Dim EmailCheck As Boolean = False
			End Try
	
			Dim ut0 As Int = RecordLocalDataToUpdate.RowCount
			Dim ut1 As Int = RecCounter - ut0
	
	
			If(RecordLocalDataToUpdate.RowCount >= 1) Then
		
'				Dim n As Int = 0
				Do While RecordLocalDataToUpdate.NextRow
										
					Try
						' ENVIAR DADOS DE CHECKLISTS (HTTP)
						Dim r1 As ResumableSub = SetUpdateHTTPRecord(RecordLocalDataToUpdate, WITHFILES, 0, "")
						Wait For(r1) complete (finished As Boolean)
					
						' ENVIAR DADOS DE EMAIL (HTTP)
						If EmailCheck Then
							If RecordLocalEmailDataToUpdate.RowCount > 0 Then
								Dim r2 As ResumableSub = SetUpdateHTTPEmailRecord(RecordLocalEmailDataToUpdate, "")
								Wait For(r2) complete (finished As Boolean)
							End If
						End If
					
					Catch
						Log(LastException)
					End Try
				Loop
			End If
			RecordLocalDataToUpdate.Close
			Sleep(250)

			' ENVIAR FICHEIROS POR FTP.
			If (ut1 >= 1) And (WITHFILES) Then
				Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=1"$
				Dim RecordLocalDataToUpdate2 As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)

				If RecordLocalDataToUpdate2.RowCount > 0 Then
					Do While RecordLocalDataToUpdate2.NextRow
'						RecordLocalDataToUpdate2.Position = n1
						Try
							SetUpdateFTPRecord(RecordLocalDataToUpdate2, WITHFILES, 1,"")
						Catch
							Log(LastException)
						End Try
					Loop
				End If
				RecordLocalDataToUpdate2.Close
			End If
	
			ProgressDialogHide
			Starter.RunUpdate = False
			Return True
'		*******************************************************************************************************************************************
		Else If Result = DialogResponse.NEGATIVE Then ' SELECCIONAR DADOS A ENVIAR
			Dim appldialog As CustomLayoutDialog
			Dim sf As Object = appldialog.ShowAsync("Intervenções por enviar ao Servidor", "Enviar Selecção", "Cancelar", "", Null, False)
	
			Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
			If Not(ShareCode.ISPHONE) Then
				appldialog.SetSize(60%x, 60%y)
			Else
				appldialog.SetSize(60%x, 40%y)
			End If
			Wait For (sf) Dialog_Ready(pnl As Panel)
			pnl.LoadLayout("dialogoOfflineReqs")
			
			ListaIntervencoesOffline.Clear
			
			Dim sSQL As String = $"select distinct up_tagcode from loc_updatesrever where up_state=0"$
			Dim RecLocalOffline As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
			Do While RecLocalOffline.NextRow
				Dim RequestTC As String = RecLocalOffline.GetString("up_tagcode").Trim
				If Utils.NNE(RequestTC) Then
					ListaIntervencoesOffline.Add(createListaOfflineReq(RequestTC,True,50dip), RequestTC)
				End If
				
			Loop
			
			Wait For (sf) Dialog_Result(Res As Int)
				
			If Res = DialogResponse.POSITIVE Then
				'Envio dos dados offline seleccionados
				ProgressDialogShow2(ShareCode.checklistenviardados2BO, False)
				For p=0 To ListaIntervencoesOffline.Size -1
					Dim pnl As Panel = ListaIntervencoesOffline.GetPanel(p)
					Dim Chk As CheckBox = pnl.GetView(0)
					Dim TC As EditText = pnl.GetView(1)
					If Chk.Checked Then

						Try
							Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1
													and up_state=0
													and up_type=0
													and up_tagcode = '${TC.text}'"$
							Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
							WITHFILES = False
						Catch
							Log(LastException)
							Dim sSQL As String = $"select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1
													and up_state=0
													and up_tagcode = '${TC.text}'"$
							Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
							WITHFILES = False
						End Try
				
						Try
							Dim sSQLEmails As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where 1=1
															and up_state=0
															and up_type=0
															and up_tagcode = '${TC.text}'"$
							Dim RecordLocalEmailDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQLEmails)
							Dim EmailCheck As Boolean = True
						Catch
							Log(LastException)
							Dim EmailCheck As Boolean = False
						End Try
	
						Dim ut0 As Int = RecordLocalDataToUpdate.RowCount
						Dim ut1 As Int = RecCounter - ut0
	
						If(RecordLocalDataToUpdate.RowCount >= 1) Then
		
'							Dim n As Int = 0
							Do While RecordLocalDataToUpdate.NextRow
'								RecordLocalDataToUpdate.Position = n
								Try
									' ENVIAR DADOS DE CHECKLISTS (HTTP)
									Dim CurrTC As String = RecordLocalDataToUpdate.GetString("up_tagcode")
									Dim TCF As String =$"and up_tagcode = '${CurrTC}'"$
									Dim r1 As ResumableSub = SetUpdateHTTPRecord(RecordLocalDataToUpdate, WITHFILES, 0, TCF)
									Wait For(r1) complete (finished As Boolean)
					
									' ENVIAR DADOS DE EMAIL (HTTP)
									If EmailCheck Then
										If RecordLocalEmailDataToUpdate.RowCount > 0 Then
											Dim CurrTC As String = RecordLocalEmailDataToUpdate.GetString("up_tagcode")
											Dim TCF As String =$"and up_tagcode = '${CurrTC}'"$
											Dim r2 As ResumableSub = SetUpdateHTTPEmailRecord(RecordLocalEmailDataToUpdate, TCF)
											Wait For(r2) complete (finished As Boolean)
										End If
									End If
					
								Catch
									Log(LastException)
								End Try
							Loop
		
							RecordLocalDataToUpdate.Close
							Sleep(250)

							' ENVIAR FICHEIROS POR FTP.
							If (ut1 >= 1) And (WITHFILES) Then
								Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1
														and up_state=0
														and up_type=1
														and up_tagcode = '${TC.text}'"$
								Dim RecordLocalDataToUpdate2 As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)

								If(RecordLocalDataToUpdate2.RowCount >= 1) Then
									Do While RecordLocalDataToUpdate2.NextRow
'										RecordLocalDataToUpdate2.Position = n1
										Try
											Dim CurrTC As String = RecordLocalDataToUpdate2.GetString("up_tagcode")
											Dim TCF As String =$"and up_tagcode = '${CurrTC}'"$
											SetUpdateFTPRecord(RecordLocalDataToUpdate2, WITHFILES, 1, TCF)
										Catch
											Log(LastException)
										End Try
									Loop
								End If
								RecordLocalDataToUpdate2.Close
							End If
	
						End If
					
					End If
				Next
				ProgressDialogHide
				Starter.RunUpdate = False
				Return True
			Else
				ProgressDialogHide
				Starter.RunUpdate = False
				Return True
			End If
			
		Else
'			Enviar mais tarde
			ProgressDialogHide
			Starter.RunUpdate = False
			Return True
		End If
	Else
		ProgressDialogHide
		Starter.RunUpdate = False
		Return True
	End If

End Sub

Sub insert_dta_auth As ResumableSub
		
	Dim DropAuthTable As String = $"drop table dta_auths;"$
	
	Dim CreateAuthTable As String = $"CREATE TABLE dta_auths (id bigint(20) NOT NULL ,
							tagcode varchar(50) NOT NULL DEFAULT 'AUTHS_', 
							component_type varchar(50) NOT NULL , 
							accessmode_type varchar(50) NOT NULL , 
							inout_tagcode varchar(50) NOT NULL , 
							group_tagcode varchar(50) NOT NULL , 
							is_data tinyint(4) NULL DEFAULT '0', 
							title varchar(100) NOT NULL , 
							authtagcodes varchar(500) NULL , 
							authtabs varchar(500) NULL , 
							authfields varchar(500) NULL , 
							authfieldsadds varchar(500) NULL , 
							departments varchar(500) NULL , 
							teams varchar(500) NULL , 
							users varchar(500) NULL , 
							created_at timestamp NULL , 
							updated_at timestamp NULL , 
							sid_id int(11) NOT NULL DEFAULT '0', 
							cbr_id int(11) NOT NULL DEFAULT '0', 
							active tinyint(4) NOT NULL DEFAULT '1', 
							action_view tinyint(4) NULL DEFAULT '1', 
							action_change tinyint(4) NULL DEFAULT '1', 
							action_add tinyint(4) NULL DEFAULT '1', 
							action_delete tinyint(4) NULL DEFAULT '1', 
							action_use tinyint(4) NULL DEFAULT '1', 
							action_print tinyint(4) NULL DEFAULT '1', 
							action_import tinyint(4) NULL DEFAULT '1', 
							action_export tinyint(4) NULL DEFAULT '1', 
							action_edit tinyint(4) NULL DEFAULT '1', 
							PRIMARY KEY (id, tagcode));"$
	
	
	Dim InsTableDataAuth As String = $"INSERT INTO `dta_auths` (`id`, `tagcode`, `component_type`, `accessmode_type`, `inout_tagcode`, `group_tagcode`, `is_data`, `title`, `authtagcodes`, `authtabs`, `authfields`, `authfieldsadds`, `departments`, `teams`, `users`, `created_at`, `updated_at`, `sid_id`, `cbr_id`, `active`, `action_view`, `action_change`, `action_add`, `action_delete`, `action_use`, `action_print`, `action_import`, `action_export`, `action_edit`) VALUES
	(1, 'AUTHS_20201115_135100', 'TCMPT_ANY', 'TACCMT_001', '', '', 0, 'Tipos de Intervenção para Produção', NULL, NULL, NULL, NULL, 'TDEPT_20201109_191112|TDEPT_20201109_191732', NULL, NULL, '2020-11-15 13:55:06', NULL, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
	(2, 'AUTHS_20201115_135500', 'TCMPT_ANY', 'TACCMT_001', '', '', 0, 'Tipos de Intervenção para Equipamentos', NULL, NULL, NULL, NULL, 'TDEPT_20201109_191052', NULL, NULL, '2020-11-15 13:55:49', NULL, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);"$

	Try
		Dim Resultado As Boolean = False
		If Not(FieldExists(Starter.LocalSQLEVC,"dta_auths","action_edit")) Then
			ProgressDialogShow2("Actualizando a base de dados, Aguarde por favor !",False)
			'Apaga the table
			Starter.LocalSQLEVC.ExecNonQuery(DropAuthTable)
			Sleep(250)
			
			' Insere a tabela com as 29 colunas
			Starter.LocalSQLEVC.ExecNonQuery(CreateAuthTable)
			Sleep(250)
			
			' Insere os dados na tabela so na somafel
			If  (ShareCode.APP_DOMAIN.ToLowerCase = "somafel") Then
				Starter.LocalSQLEVC.ExecNonQuery(InsTableDataAuth)
				Sleep(250)
			End If
			
			ProgressDialogHide
			Resultado = True
		End If
	Catch
		Log(LastException)
	End Try

	Return Resultado

End Sub

Sub FieldExists(SQL As SQL, TableName As String, TableField As String) As Boolean
	Dim result As Boolean
	result = False

	Dim t As List
	t = DBUtils.ExecuteMemoryTable(SQL, "PRAGMA table_info ('" & TableName & "')", Null, 0)

	For i = 0 To t.Size - 1
		Dim values() As String
		values = t.Get(i)

		If values(1).ToLowerCase = TableField.ToLowerCase Then  ' case insensitive
			result = True
			Exit
		End If
	Next

	Return result
End Sub

Sub createListaOfflineReq(Req As String, checkedReq As Boolean, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("ListaOfflineReq" )
	p.RemoveView
	ChkReqOffline.Checked = checkedReq
	txtReqOffline.text = Req
	p.Tag = $"${Req}|${Utils.Bool2Int(checkedReq)}"$
	Return p
End Sub