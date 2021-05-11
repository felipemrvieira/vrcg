B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=6
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Dim PE As PhoneEvents
	Public GlobalFTP As FTP
	Public CurrentWorkActivity As Object
	Public CurrentFlowPosition As Int = 0
	Public WEBISOK As Boolean = False
	
	Public LocalSQL As SQL
	Public LocalSQLEVC As SQL
	Public LocalSQLWRK As SQL
	Public MakingLogin As Boolean = False

	Public FirstInstall As Boolean = False
	Public RunUpdate As Boolean = False
	Public GPSDEVICE As GPS
	Public AppState As TIniFile
	Public rp As RuntimePermissions
	Public Params As ConfigParameters
	Public Provider As FileProvider
	Public StrFunc As StringFunctions
	Public LocalSessionCode As String 
	
	Public SharedFolder As String
	Public SafeDefaultExternal As String 
	Public InternalFolder As String = File.DirInternal
	Public AssetsFolder As String = File.DirAssets
	Public WIFI As MLwifi
	
	Public EntityKeepFilter As Boolean = False
	Public EntitySearchFilter As String = ""
	Public EntityFilter As EntityFilter
	
	Public RequestFavorites As Int = 0
	Public RequestKeepFilter As Boolean = False
	Public RequestSearchFilter As String = ""
	Public RequestFilters As RequestFilter
	
	Public TaskKeepFilter As Boolean = False
	Public TaskSearchFilter As String = ""
	Public TaskFilters As TaskFilter
	
	Public ObjectKeepFilter As Boolean = False
	Public ObjectFiltered As Boolean = False
	Public ObjectSearchFilter As String = ""
	Public ObjectFilter As ObjectFilter
	
	Public NotifyUserCount As Int = 0
	Public NotifyRequestCount As Int = 0
	Public NotifyActionCount As Int = 0
	
	Public DevInfo As DeviceInformation
	Public KeepColorMain As Int
	Public KeepColorSub As Int
	
	Public CPButtons As ComposedButtonDefs
	Public CPButtonsOFF As ComposedButtonDefs
	
	Public APP_FINE_LOCATION_ACCESS As Boolean = False
	Public APP_CAMERA_ACCESS As Boolean = False
	Public APP_RESET_INSTALL As Boolean = False
	Public APP_IN_EXECUTION As Boolean = False
	Public APP_INSTALL_APK As Boolean = False
	Public APP_SEND_SMS As Boolean = False
	
	Public StopLocationCheck As Boolean = False
	Public StopCommsCheck As Boolean = False
	Public CalledFromSyncButton As Boolean = False
	Public ApiCall As Api
End Sub

'Main.Process_Globals
'Starter.Process_Globals
'Other Activity.Process_Globals
'Other CodeModule.Process_Globals
'Starter.Service_Create
'Starter.Service:Start
'Main.Globals
'Main.Activity_Create
'Main.Activity_Resume

Sub Service_Create
	'*************************************************************************************
    ' @author felipemrvieira
	'	
    ' Refatoração desta sub visando a simplificação e a aplicação de boas práticas
	'	
	' Pontos a rever:	
	' - ApiCall(classe API) pode ser instanciado na classe ou módulo que a invoca. 
	'*************************************************************************************
	
	ApiCall.Initialize
	SetDefaultLocale
	DeleteFiles
	InitializeGPS
	
'	Initializes Phone Events Object that are handled by "Sub Sub PE_..." functions 
	PE.Initialize("PE")
	
	RunUpdate = False
End Sub

Sub Service_Start (StartingIntent As Intent)
	'*************************************************************************************
	' @author felipemrvieira
	'
	' Refatoração desta sub visando a simplificação e a aplicação de boas práticas
	'
	' Pontos a rever:
	' - Verificar a necessidade de se instanciar a classe Params aqui, uma vez que ela apenas mantem um
	' conjunto de variáveis utilizados por CameraActivity, CameraActivity2 e CameraActivity_InnerShot
	'*************************************************************************************
	ShareCode.SESS_IN_PAUSE = 0
	'DateTime.DateFormat = Consts.DateTimeFormat
	
	ShareCode.CURRENT_APPDATE = Utils.GetCurrentDate  'DateTime.Date(DateTime.Now)
	Params.Initialize
	SetFoldersLocation
	LocalSessionCode = $"SESS_${Utils.MakeFileName}"$
	
	CopyAndInitializeAppState
	CopyAndInitializeDatabases
	Create_dbchanges_Table
	
	'******************************************************************************
	' NOTE: CRIA TABELAS AUX. ADICIONAIS CASO NÃO EXISTAM
	'******************************************************************************
	DBStructures.CreateTablesThatDoNotExists

	CopyFiles
	SetAppAndDeviceInfo
	InitializeFTP
	Set_SESS_IN_PAUSE
	
	FirstInstall = (ShareCode.APPL_CONFIRMED = 0) Or (ShareCode.FIRST_INSTALL = 0)
	ShareCode.APP_LAST_USER = AppState.ReadString("APP_START", "LAST_USER", "")
	
	DBStructures.getCurrentConfigValues
	Log($"API_TOKEN : ${ShareCode.APP_TOKEN}"$)
	DBStructures.updateConfigApp(ShareCode.APP_TOKEN)
	Log($"SERVICE STARTER : ${Consts.ColorMain} -- ${Consts.ColorSub}"$)
	DBStructures.getConfigApp(ShareCode.APP_TOKEN)
	
	KeepColorMain = Consts.ColorMain
	KeepColorSub = Consts.ColorSub
	
	'******************************************************************************
	' @author felipemrvieira
	'
	' Verificar uso das variáveis:
	'	- EntitySearchFilter
	'	- ObjectFiltered
	'******************************************************************************
	
	EntityKeepFilter = False
	EntitySearchFilter = ""
	EntityFilter = Types.MakeEntityFilter(0, 0, 0, 0, "", "", 0)
	
	ObjectKeepFilter  = True
	ObjectFiltered  = True
	ObjectSearchFilter = ""
	ObjectFilter = Types.MakeObjectFilter(ShareCode.OBJ_DefaultType, ShareCode.OBJ_DefaultZone, 0, 0, 0, "", "", 0)
	Log($"OBJECT_FILTER_CHANGED: ${ObjectFilter}"$)
	
	CreateCPButtons
	SetAppInfo
	
	DevInfo = Utils.DeviceInfo
	ShareCode.ISPHONE = (DevInfo.Size < 6)
	
	Clear_loc_userssession_Table
End Sub

Sub Create_dbchanges_Table
	If Not(DBUtils.TableExists(LocalSQLWRK, "dbchanges")) Then
		LocalSQLWRK.ExecNonQuery($"CREATE TABLE `dbchanges` (
						`id` INT(10) NOT NULL,
						`app_version` VARCHAR(50) NOT NULL DEFAULT 'VERSION_',
						`tablename` VARCHAR(50) NOT NULL DEFAULT '',
						`datechange` DATE NULL DEFAULT NULL,
						`script` TEXT NULL DEFAULT NULL,
						`titlenotes` VARCHAR(100) NULL DEFAULT '',
						`created_at` TIMESTAMP NULL DEFAULT NULL,
						`updated_at` TIMESTAMP NULL DEFAULT NULL,
						`active` TINYINT(4) NOT NULL DEFAULT '1',
						`updated` TINYINT(4) NOT NULL DEFAULT '0',
						`dateupdate` DATE NULL DEFAULT NULL,
						PRIMARY KEY (`id`, `app_version`, `tablename`) 
					);"$)
	End If
End Sub

Sub DeleteFiles
	If File.Exists(SharedFolder, "template_edp.html") Then
		File.Delete(SharedFolder, "template_edp.html" )
	End If
	
	If Not(File.Exists(InternalFolder, "vazio.png")) Then
		File.Copy(File.DirAssets, "vazio.png", InternalFolder, "vazio.png" )
	End If
	
	If File.Exists(SharedFolder, "template2.html") Then
		File.Delete(SharedFolder, "template2.html" )
	End If
	
	If File.Exists(SharedFolder, "template4.html") Then
		File.Delete(SharedFolder, "template4.html" )
	End If
	
	If File.Exists(SharedFolder, "template5.html") Then
		File.Delete(SharedFolder, "template5.html" )
	End If
	
	If File.Exists(SharedFolder, "template5A.html") Then
		File.Delete(SharedFolder, "template5A.html" )
	End If
	
	If File.Exists(SharedFolder, "template9.html") Then
		File.Delete(SharedFolder, "template9.html" )
	End If
	
	If File.Exists(SharedFolder, "template10.html") Then
		File.Delete(SharedFolder, "template10.html" )
	End If
	
	If File.Exists(SharedFolder, "template12.html") Then
		File.Delete(SharedFolder, "template12.html" )
	End If
	
	If File.Exists(SharedFolder, "template12header.html") Then
		File.Delete(SharedFolder, "template12header.html" )
	End If
	
	If File.Exists(SharedFolder, "template12footer.html") Then
		File.Delete(SharedFolder, "template12footer.html" )
	End If
	
	If File.Exists(SharedFolder, "page_header.html") Then
		File.Delete(SharedFolder, "page_header.html" )
	End If
	
	If File.Exists(SharedFolder, "page_footer.html") Then
		File.Delete(SharedFolder, "page_footer.html" )
	End If
	
	If File.Exists(SharedFolder, "page_content.html") Then
		File.Delete(SharedFolder, "page_content.html" )
	End If
	
	If File.Exists(SharedFolder, "page_identification_first.html") Then
		File.Delete(SharedFolder, "page_identification_first.html" )
	End If
	
	If File.Exists(SharedFolder, "age_identification_first_score.html") Then
		File.Delete(SharedFolder, "age_identification_first_score.html" )
	End If
	
	If File.Exists(SharedFolder, "page_identification_next.html") Then
		File.Delete(SharedFolder, "page_identification_next.html" )
	End If
	
	If File.Exists(SharedFolder, "page_identification_last.html") Then
		File.Delete(SharedFolder, "page_identification_last.html" )
	End If
	
	If File.Exists(SharedFolder, "page_content_images.html") Then
		File.Delete(SharedFolder, "page_content_images.html" )
	End If
	
	If File.Exists(SharedFolder, "page_content_nonconformities.html") Then
		File.Delete(SharedFolder, "page_content_nonconformities.html" )
	End If
	
	If File.Exists(SharedFolder, "page_content_observations.html") Then
		File.Delete(SharedFolder, "page_content_observations.html" )
	End If
	
	If File.Exists(SharedFolder, "page_signature.html") Then
		File.Delete(SharedFolder, "page_signature.html" )
	End If
	
	If File.Exists(SharedFolder, "template20.html") Then
		File.Delete(SharedFolder, "template20.html" )
	End If
	
	If File.Exists(InternalFolder, "CROQUI.png") Then
		File.Delete(InternalFolder, "CROQUI.png" )
	End If
	
	If File.Exists(InternalFolder, "logo_monocromatico.png") Then
		File.Delete(InternalFolder, "logo_monocromatico.png" )
	End If
	
	If File.Exists(SharedFolder, "template20_VStorage.html") Then
		File.Delete(SharedFolder, "template20_VStorage.html" )
	End If
	
	If File.Exists(SharedFolder, "template20_VCampervans.html") Then
		File.Delete(SharedFolder, "template20_VCampervans.html" )
	End If

	If File.Exists(SharedFolder, "page_id_resopre_first.html") Then
		File.Delete(SharedFolder, "page_id_resopre_first.html" )
	End If
	
	If File.Exists(SharedFolder, "page_resopre_footer.html") Then
		File.Delete(SharedFolder, "page_resopre_footer.html" )
	End If
	
	If File.Exists(SharedFolder, "page_resopre_header.html") Then
		File.Delete(SharedFolder, "page_resopre_header.html" )
	End If
	
	If File.Exists(SharedFolder, "template_resopre_group.html") Then
		File.Delete(SharedFolder, "template_resopre_group.html" )
	End If
	
	If File.Exists(SharedFolder, "acail_distribuicao_epis.html") Then
		File.Delete(SharedFolder, "acail_distribuicao_epis.html" )
	End If
	
	If File.Exists(SharedFolder, "acail_reg_despesa.html") Then
		File.Delete(SharedFolder, "acail_reg_despesa.html" )
	End If
	
	If File.Exists(SharedFolder, "template_limpersado_guia.html") Then
		File.Delete(SharedFolder, "template_limpersado_guia.html" )
	End If
End Sub

Sub CopyFiles
	If Not(File.Exists(SharedFolder, "template1.html")) Then
		File.Copy(File.DirAssets, "template1.html", SharedFolder, "template1.html" )
	End If

	If Not(File.Exists(SharedFolder, "template_edp.html")) Then
		File.Copy(File.DirAssets, "template_edp.html", SharedFolder, "template_edp.html" )
	End If

	If Not(File.Exists(SharedFolder, "template20.html")) Then
		File.Copy(File.DirAssets, "template20.html", SharedFolder, "template20.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template2.html")) Then
		File.Copy(File.DirAssets, "template2.html", SharedFolder, "template2.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template3.html")) Then
		File.Copy(File.DirAssets, "template3.html", SharedFolder, "template3.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template4.html")) Then
		File.Copy(File.DirAssets, "template4.html", SharedFolder, "template4.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template5A.html")) Then
		File.Copy(File.DirAssets, "template5A.html", SharedFolder, "template5A.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template5.html")) Then
		File.Copy(File.DirAssets, "template5.html", SharedFolder, "template5.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template6.html")) Then
		File.Copy(File.DirAssets, "template6.html", SharedFolder, "template6.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template7.html")) Then
		File.Copy(File.DirAssets, "template7.html", SharedFolder, "template7.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template6A.html")) Then
		File.Copy(File.DirAssets, "template6A.html", SharedFolder, "template6A.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template7A.html")) Then
		File.Copy(File.DirAssets, "template7A.html", SharedFolder, "template7A.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template9.html")) Then
		File.Copy(File.DirAssets, "template9.html", SharedFolder, "template9.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template10.html")) Then
		File.Copy(File.DirAssets, "template10.html", SharedFolder, "template10.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template12.html")) Then
		File.Copy(File.DirAssets, "template12.html", SharedFolder, "template12.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template12header.html")) Then
		File.Copy(File.DirAssets, "template12header.html", SharedFolder, "template12header.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template12footer.html")) Then
		File.Copy(File.DirAssets, "template12footer.html", SharedFolder, "template12footer.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_header.html")) Then
		File.Copy(File.DirAssets, "page_header.html", SharedFolder, "page_header.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_footer.html")) Then
		File.Copy(File.DirAssets, "page_footer.html", SharedFolder, "page_footer.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_content.html")) Then
		File.Copy(File.DirAssets, "page_content.html", SharedFolder, "page_content.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_identification_first.html")) Then
		File.Copy(File.DirAssets, "page_identification_first.html", SharedFolder, "page_identification_first.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_identification_first_score.html")) Then
		File.Copy(File.DirAssets, "page_identification_first_score.html", SharedFolder, "page_identification_first_score.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_identification_next.html")) Then
		File.Copy(File.DirAssets, "page_identification_next.html", SharedFolder, "page_identification_next.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_identification_last.html")) Then
		File.Copy(File.DirAssets, "page_identification_last.html", SharedFolder, "page_identification_last.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_content_images.html")) Then
		File.Copy(File.DirAssets, "page_content_images.html", SharedFolder, "page_content_images.html" )
	End If
	If Not(File.Exists(SharedFolder, "page_content_nonconformities.html")) Then
		File.Copy(File.DirAssets, "page_content_nonconformities.html", SharedFolder, "page_content_nonconformities.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_content_observations.html")) Then
		File.Copy(File.DirAssets, "page_content_observations.html", SharedFolder, "page_content_observations.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_signature.html")) Then
		File.Copy(File.DirAssets, "page_signature.html", SharedFolder, "page_signature.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template20_VStorage.html")) Then
		File.Copy(File.DirAssets, "template20_VStorage.html", SharedFolder, "template20_VStorage.html" )
	End If
		
	If Not(File.Exists(SharedFolder, "template20_VCampervans.html")) Then
		File.Copy(File.DirAssets, "template20_VCampervans.html", SharedFolder, "template20_VCampervans.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_id_resopre_first.html")) Then
		File.Copy(File.DirAssets, "page_id_resopre_first.html", SharedFolder, "page_id_resopre_first.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_resopre_footer.html")) Then
		File.Copy(File.DirAssets, "page_resopre_footer.html", SharedFolder, "page_resopre_footer.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "page_resopre_header.html")) Then
		File.Copy(File.DirAssets, "page_resopre_header.html", SharedFolder, "page_resopre_header.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template_resopre_group.html")) Then
		File.Copy(File.DirAssets, "template_resopre_group.html", SharedFolder, "template_resopre_group.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "acail_distribuicao_epis.html")) Then
		File.Copy(File.DirAssets, "acail_distribuicao_epis.html", SharedFolder, "acail_distribuicao_epis.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "acail_reg_despesa.html")) Then
		File.Copy(File.DirAssets, "acail_reg_despesa.html", SharedFolder, "acail_reg_despesa.html" )
	End If
	
	If Not(File.Exists(SharedFolder, "template_limpersado_guia.html")) Then
		File.Copy(File.DirAssets, "template_limpersado_guia.html", SharedFolder, "template_limpersado_guia.html" )
	End If
	
	If Not(File.Exists(InternalFolder, "CROQUI.png")) Then
		File.Copy(File.DirAssets, "CROQUI.png", InternalFolder, "CROQUI.png" )
	End If
	
	If Not(File.Exists(InternalFolder, "logo_monocromatico.png")) Then
		File.Copy(File.DirAssets, "logo_monocromatico.png", InternalFolder, "logo_monocromatico.png" )
	End If
	
	If Not(File.Exists(InternalFolder, "logo_monocromatico_mono.png")) Then
		File.Copy(File.DirAssets, "logo_monocromatico_mono.png", InternalFolder, "logo_monocromatico_mono.png" )
	End If
End Sub

Sub CopyAndInitializeDatabases
	If Not(File.Exists(SharedFolder, "orion.db")) Then
		File.Copy(File.DirAssets, "orion.db", SharedFolder, "orion.db" )
	End If
	If Not(File.Exists(SharedFolder, "evolutioncheck.db3")) Then
		File.Copy(File.DirAssets, "evolutioncheck.db3", SharedFolder, "evolutioncheck.db3" )
	End If
	If Not(File.Exists(SharedFolder, "worker.db")) Then
		File.Copy(File.DirAssets, "worker.db", SharedFolder, "worker.db" )
	End If
	If Not(LocalSQL.IsInitialized) Then LocalSQL.Initialize(SharedFolder, "orion.db", True)
	If Not(LocalSQLEVC.IsInitialized) Then LocalSQLEVC.Initialize(SharedFolder, "evolutioncheck.db3", True)
	If Not(LocalSQLWRK.IsInitialized) Then LocalSQLWRK.Initialize(SharedFolder, "worker.db", True)
End Sub

Sub InitializeGPS
	If Not(GPSDEVICE.IsInitialized) Then
		GPSDEVICE.Initialize("GPSDEVICE")
	End If
	
End Sub

Sub InitializeFTP
	If Not(GlobalFTP.IsInitialized) Then
		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
	End If
End Sub

Sub SetDefaultLocale
	Dim jo As JavaObject
	jo.InitializeStatic("java.util.Locale").RunMethod("setDefault", Array(jo.GetField("US")))
End Sub

Sub SetAppAndDeviceInfo
	ShareCode.DEVICE_ORIENTATION = AppState.ReadInteger("APP_START", "DEVICE_ORIENTATION", 0)
	ShareCode.DEVICE_LANGUAGE_STR = AppState.ReadString("APP_START", "LANGUAGE", "PT")
	ShareCode.APPL_CONFIRMED = AppState.ReadInteger("APP_START", "APPL_CONFIRMED", 0)
	ShareCode.FIRST_INSTALL = AppState.ReadInteger("APP_START", "FIRST_INSTALL", 0)
	ShareCode.APP_VERSION = AppState.ReadString("APP_START", "APP_VERSION", "Orion V1.40.991")
	ShareCode.VERSION_BUILD = AppState.ReadString("APP_START", "VERSION_BUILD", "2.01.013")
	ShareCode.VERSION_DATE = AppState.ReadString("APP_START", "VERSION_DATE", "27-10-2019")
	ShareCode.APPL_ACCOUNT = AppState.ReadString("APP_START", "APPL_ACCOUNT", "demo")
'	ShareCode.APP_ISDEV = AppState.ReadInteger("APP_START", "APPL_ISDEV", 0)
	ShareCode.APP_LAST_LITE_UPDATE_DATETIME = AppState.ReadString("APP_START", "APP_LITE_LAST_UPDATE", "")
	
	ShareCode.APP_MAIN_LOGO = AppState.ReadString("APP_START", "APP_MAIN_LOGO", "")
	ShareCode.APP_MAIN_LOGO_MINI = AppState.ReadString("APP_START", "APP_MAIN_LOGO_MINI", "")
	ShareCode.APPL_HOST = AppState.ReadString("APP_START", "APPL_HOST", "")
End Sub

Sub PE_ScreenOn (Intent As Intent)
	Log("PE_ScreenOn")
	
	If IsPaused(Main)=False And Main.keepal Then
		Dim phk As PhoneWakeState
		phk.ReleaseKeepAlive
		phk.KeepAlive(True)
	End If
	
	'*************************************************************************************
	' ALTERACAO PC
	' ESTAVA A DAR ERRO NO STARTSERVICEFOREGROUND (COMMS)
	' CRIACAO DE NOVA FLAG StopCommsCheck PARA CONTROLAR A RECORRENCIA
	' RETIRADO DO SERVICE_CREATE O AUTOMATICFOREGROUND, FICANDO IGUAL AO LOCATIONSERVICE
	'*************************************************************************************
	StopCommsCheck = False
	StopLocationCheck = False
	StartService(Comms)
	StartService(LocationService)
	
End Sub

Sub PE_ScreenOff (Intent As Intent)
	
	Log("screen off by user")
	Dim phk As PhoneWakeState
	phk.ReleaseKeepAlive

	'*************************************************************************************
	' ALTERACAO PC
	' ESTAVA A DAR ERRO NO STARTSERVICEFOREGROUND (COMMS)
	' CRIACAO DE NOVA FLAG StopCommsCheck PARA CONTROLAR A RECORRENCIA
	' RETIRADO DO SERVICE_CREATE O AUTOMATICFOREGROUND, FICANDO IGUAL AO LOCATIONSERVICE
	'*************************************************************************************
	StopService(Comms)
	StopService(LocationService)
	StopCommsCheck = True
	StopLocationCheck = True
	
End Sub

Sub PE_SmsDelivered (PhoneNumber As String, Intent As Intent)
	Log("phs_SmsDelivered: PhoneNumber=" & PhoneNumber & ", message_id=" & Intent.GetExtra("message_id"))
	ToastMessageShow($"${ShareCode.AvisoSMSSent} - ${PhoneNumber}"$,True)
End Sub

Sub PE_SmsSentStatus (Success As Boolean, ErrorMessage As String, PhoneNumber As String, Intent As Intent)
	Log("phs_SmsSentStatus: PhoneNumber=" & PhoneNumber & ", Success=" & Success & ", message_id=" & Intent.GetExtra("message_id"))
	If Not(Success) Then
		ToastMessageShow($"${ShareCode.GeneralErrorTitle}:${ShareCode.AvisoSMSNotSent}"$, True)
	End If
	
End Sub

Sub CopyAndInitializeAppState
	If Not(File.Exists(InternalFolder, "AppState.set")) Then
		File.Copy(File.DirAssets, "AppState.set", InternalFolder, "AppState.set" )
	End If
	
	If Not(AppState.IsInitialized) Then
		AppState.Initialize(InternalFolder, "AppState.set")
		AppState.SetAutoFlush(True)
	End If
End Sub

Sub Set_SESS_IN_PAUSE
	Try
		ShareCode.SESS_IN_PAUSE = AppState.ReadInteger("APP_START", "SESS_IN_PAUSE", 0)
	Catch
		Log(LastException)
		Utils.WriteErrors2Log(LastException)
		ShareCode.SESS_IN_PAUSE = 0
		AppState.WriteInteger("APP_START", "SESS_IN_PAUSE", 0)
		AppState.Flush
	End Try
End Sub

Sub SetFoldersLocation
	Provider.Initialize
	Provider.SharedFolder = rp.GetSafeDirDefaultExternal("orion") 'File.DirRootExternal
	Provider.UseFileProvider = True
	SharedFolder = Provider.SharedFolder '    rp.GetSafeDirDefaultExternal("orion") 'dProvider.SharedFolder
	SafeDefaultExternal = SharedFolder 'rp.GetSafeDirDefaultExternal("orion")
	
	InternalFolder = File.DirInternal
	AssetsFolder = File.DirAssets
End Sub

Sub CreateCPButtons
	CPButtons = Types.MakeComposedButtonDefs(Consts.WhiteSoftDusk, Consts.DarkGray, Consts.BlackNoAlpha, _
			Consts.WhiteSoftDusk, KeepColorMain, KeepColorSub, _
			Consts.ColorMain, 1, 5)
			
	CPButtonsOFF = Types.MakeComposedButtonDefs(Consts.WhiteSoftDusk, Consts.DarkGray, Consts.BlackNoAlpha, _
			Consts.WhiteSoftDusk, Consts.DarkGray, Consts.DarkGray, _
			Consts.DarkGray, 1, 5)
End Sub

Sub SetAppInfo
	ShareCode.APP_VersionNocodeName = Consts.AppVersionCodeName
	ShareCode.APP_EntityBrand = ""

	'ShareCode.APP_WORKING_LOCAL = Not(WIFI.isOnLine)
	'ShareCode.APP_WORKING_LOCAL = True

	ShareCode.CURRENT_APPDATE = DateTime.Date(DateTime.Now)
	Log(ShareCode.CURRENT_APPDATE)
	
	ShareCode.APPDATE_STARTRANGE = Utils.GetCurrentDate 'Utils.GetLastWeekDate
	ShareCode.APPDATE_ENDRANGE = Utils.GetCurrentDate 'GetNextNDays(1) 'GetNextWeekDate
End Sub

Sub Clear_loc_userssession_Table
	If (LocalSQLWRK.IsInitialized) Then
		Try
			DBUtils.ClearTable(LocalSQLWRK, "loc_userssession")
		Catch
			Log(LastException)
			Utils.WriteErrors2Log(LastException)
		End Try
	End If
End Sub


'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub

Sub CheckWebAccess
	Dim startTime As Long = Utils.GetCurrentTicks
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/timming"$
	Dim Prams As Map
	Prams.Initialize
	Prams.Put("_first", Utils.Bool2Int(FirstInstall))
	Prams.Put("authorization", ShareCode.APP_Authorization)
	Prams.Put("_token", ShareCode.APP_TOKEN)
	Log (ServerAddress)
	Log(ShareCode.APP_Authorization)
	Log(ShareCode.APP_TOKEN)
	Dim JSON As JSONGenerator
	JSON.Initialize(Prams) 
	Dim data As String =   JSON.ToPrettyString(1)
	WEBISOK = False
	Dim res  As ResumableSub = TestTheServer(ServerAddress, data)
	Wait For(res) complete (finished As Boolean)
	If finished Then
'		Dim endTime As Long = Utils.GetCurrentTicks
'		Log($"Start: ${startTime}, End: ${endTime}, Diff: ${endTime - startTime}"$)
'		WEBISOK = ((endTime - startTime) < 3500)
		WEBISOK = True
	Else 
		WEBISOK = False
		Log("Erro de identificação do servidor")
	End If
	ShareCode.APP_WORKING_LOCAL = Not(WEBISOK)
	
	Log($"APP_WORKING_LOCAL: ${Utils.Bool2Int(ShareCode.APP_WORKING_LOCAL)}"$)
	
End Sub

Sub TestTheServer(ServerAddress As String, data As String) As ResumableSub
	Try
		Dim Status As Int = 0
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Dim Status As Int = Utils.JobAPIStatus(Job)
			Log(Status)
		Else
			Log(Job.GetString)
		End If
		Job.Release
	Catch
		Log(LastException)
		Utils.WriteErrors2Log(LastException)
	End Try

	Return (Status >= 1)
End Sub

Sub IsOnline As ResumableSub
	'Requires Phone Library
	Dim p As Phone
	Dim Response, Error As StringBuilder
	Response.Initialize
	Error.Initialize
	Try
		'Ping Google DNS - if you can't reach this you are in serious trouble (or in China)!
		p.Shell("ping -q -c 1 -W 2 8.8.8.8",Null,Response,Error)
        
		If Error.ToString = "" Then
			If Response.ToString.Contains(" 100% packet loss") Then
				Log("Ping ran but no response " &  Response.ToString)
				Return False
			Else If Response.ToString.Contains(" 0% packet loss") Then
				Log("Ping Google OK")
				Return True
			End If
			
		Else
			Return False
		End If
	Catch
		Log("Error pinging Google DNS: "  & Error.ToString)
		Return False
	End Try
End Sub


Sub RequestEmailFromBO(NRequest As String, EmailsTO As String, EmailsCC As String, subject As String, sendBCC As String) As ResumableSub
	
	EmailsTO = EmailsTO.Replace(";;", ";")
	EmailsTO = EmailsTO.Replace(",", ";")
	EmailsTO = EmailsTO.Replace("|", ";")
	EmailsTO = EmailsTO.Replace(" ", "")

	EmailsCC = EmailsCC.Replace(";;", ";")
	EmailsCC = EmailsCC.Replace(",", ";")
	EmailsCC = EmailsCC.Replace("|", ";")
	EmailsCC = EmailsCC.Replace(" ", "")
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla/send/email"$
	Dim JobEmail As HttpJob
	JobEmail.Initialize("", Me)
	Dim ParamsEml As Map
	ParamsEml.Initialize
	ParamsEml.Clear
	ParamsEml.Put("_token",ShareCode.APP_TOKEN)
	ParamsEml.Put("request",NRequest)
	ParamsEml.Put("emailsTO",EmailsTO)
	ParamsEml.Put("emailsCC",EmailsCC)
	ParamsEml.Put("subject", subject)
	ParamsEml.Put("date",Utils.GetCurrDatetime)
	ParamsEml.Put("user", ShareCode.SESS_OPER_User)
	ParamsEml.Put("SendBCC", sendBCC)
	ParamsEml.Put("debug", 0)
	ParamsEml.Put("versionTagcode", Main.VersionTagcode)
	ParamsEml.Put("_authorization", Main.DeviceAuthorization)
	ParamsEml.Put("_instance", Main.DeviceInstance)
	ParamsEml.put("_deviceBrand", Main.DeviceBrand)
	ParamsEml.put("_deviceModel", Main.DeviceModel)
	ParamsEml.put("_deviceMacAddress", Main.DeviceMacAddress)
	ParamsEml.Put("_user", ShareCode.SESS_User)
	Dim JSON As JSONGenerator
	JSON.Initialize(ParamsEml)
    
	Dim data As String = JSON.ToPrettyString(1)
	
	Utils.ShowProcinLog("Starter","RequestEmailfromBO",data)
	
	'SUBSTITUIR O QUE EST ABAIXO - NOVA ESTRUTURA NO RequestEmailFromBO do Reportview
	
	JobEmail.PostString(ServerAddress, data)
	JobEmail.GetRequest.SetContentType("application/json")
	JobEmail.GetRequest.Timeout = 90000
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	Wait For (JobEmail) JobDone(JobEmail As HttpJob)
	
	ProgressDialogHide
	
	If JobEmail.Success Then
		Dim JsonStruct As String=""
		Try
			JsonStruct = JobEmail.GetString
			Dim parser As JSONParser
			parser.Initialize(JsonStruct)
			Dim root As Map = parser.NextObject
			Dim Status As String = root.Get("status")
			Dim Message As String = root.Get("message")
		Catch
			Log(LastException)
			Utils.WriteErrors2Log(LastException)
		End Try
		
		Log(JsonStruct)
		If Status = "1" Then
			ShareCode.EML_RESULT = "SUCESSO"
		Else
			ShareCode.EML_RESULT = "ERRO"
		End If
		
		Utils.ShowProcinLog("ReportView","RequestEmailfromBO","Success")
		Dim Eml_result_Text As String = $"${NRequest} - ${ShareCode.EML_RESULT}${CRLF}${EmailsTO}"$
		Str_CreateEmailAlert(Eml_result_Text)
		MsgboxAsync("Verifique o estado do envio em Alertas, no Menu principal",ShareCode.GeneralInfoTitle)
		Return True
	Else
		Log(JobEmail.ErrorMessage)
		Utils.ShowProcinLog("ReportView","RequestEmailfromBO","JOB ERROR")
		Utils.Logerror("Download", ShareCode.SESS_User, JobEmail.ErrorMessage)
		Return True
	End If
	JobEmail.Release
End Sub

Sub Str_CreateEmailAlert(Alert_Text As String)
	Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
	Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
	Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
							values (${mID}, '${alerttagcode}', '', 'ALRTREL_REQUESTS', 'ALRTTYP_NOTIFY', 1, 1, '${Alert_Text}', 
	'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
	Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")
	CallSub(MainMenu,"BadgeCheckUpdate")
End Sub
