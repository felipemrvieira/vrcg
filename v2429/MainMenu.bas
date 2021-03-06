B4A=true
Group=Main Forms
ModulesStructureVersion=1
Type=Activity
Version=9
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

'CL_imageMaint
'CL_checklistRun
'CL_checkListItemView
'Dialog_ItemActions
'dialog_appAuthorization

Sub Process_Globals
	Private TimeStart As Timer
	Public AppStarted As Boolean
	Public mainShowDialogResult As Int = 0
	Public Started As Boolean = False
	Public WaitToConfirm As Boolean = False
	Private CurrentLoginUser As String = ""
	Public isLoginDone As Boolean = False
	Public isMainScreen As Boolean = False
	Public Device As Phone
	Public IsFirsttime As Boolean = False
	Public Requestauth As Boolean = False
	Private xui As XUI
End Sub

Sub Globals
	Public BadgerItems As Badger
	Private mainBasePanel As Panel
	Private mainBottomPanel As Panel
	Private mainButtonMenu As Button
	Private mainTopBar As Panel
	Private mainBottomLine As Panel
	Private mainLogo As ImageView
	Private mainTopLine As Panel
	Private mainLabelInfo As Label

	Private panelOptions As Panel
	Private butQuickAction As Button
	Private butCallCamera As Button
	Private butCallActions As Button
	
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelAppInfo As Label
	Private LabelCopyright As Label
	
	Private DialogLogin As AppDialogs
	Private DialogAuthorization As AppDialogs
	Private ButtonUserUnavailable As Button
	
	Private AuthVersionsList As List
	Private CPButtonTasks As Panel
	Private CPButtonRequests As Panel
	Private CPButtonObjects As Panel
	Private CPButtonUser As Panel
	Private CPButtonKPI As Panel
	Private CPButtonAlerts As Panel
	
	Private MainPopMenu As MenuOnAnyView
	Private MainPopMenuList As ListView
	Public LGO_PasswordMode As Boolean = True
	Private NetErrorTryCount As Int = 0

	Private CustomListView1 As CustomListView
	Private ButtonActionPause As Button
	Private ButtonAppNetwork As Button
	Private ButtonAppLatency As Button
	Private mainActiveUser As Label
	
	
	Private mainLayout As String = ""
	Private LockPanel As Panel
	Private MainMenuTabStrip As TabStrip
	Private butCallShort3 As Button
	Private butCallShort2 As Button
	Private butCallShort1 As Button
	Private Printer As BT_Printer
	
	Private UpdateServiceTimer As Timer
	Private LabelAvisoProcessamento As Label
	Private PanelFirstInstallConfig As Panel
	Private ProgressoInicial2 As ProgressBar
	Private LabelTarefa As Label
	Private ProgressoInicial As ProgressBar
	Private LabelDownloadInicialFases As Label
	Private LabelDownloadInicialTitle As Label
	Private PanelDownloadInicial As Panel

	Private DataSyncManual As AnotherDatePicker
	
	Private CurrentCLD As CustomLayoutDialog
	Private ApplDialog As CustomLayoutDialog
	
	Private ButtonAssociated As Button
	Private ButtonScanPrinter As Button
	Private ListViewBluetoothDevices As ListView
	Private ButtonPrint As Button
	Private PrinterMessage As String
	Private CurrentPrinterConnected As Object
	Private butSearch As Button
	Private EditSearch As EditText
	Private SearchPanel As Panel
	
	Private EditSearchSearch As EditText
	Private butSearchSearch As Button
	Private butSearchServer As Button
	Private mainActiveUserSearch As Label
	Private mainLogoSearch As ImageView
	Private ProgressSearch As ProgressBar
	Private butActionSearch As Button
	Private butCloseSearchPanel As Button
	Private ExpandListSearch As CustomListView
	Private RecordLinePanel As Panel
	Private RecordLineTitle As Label
	Private RecordLineMoreOptions As Button
	Private RecordLineTitleSecond As Label
	Private butSearchClear As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	mainLayout = "MainMenuLayout"
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
		mainLayout = "phone_mainmenulayout"
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
		
	If (FirstTime = True) Then
		IsFirsttime = FirstTime
	End If
	Activity.LoadLayout(mainLayout)
	
	butSearch.Visible = Utils.Int2Bool(ShareCode.DEVICE_SHOW_GLOBAL_SEARCH)
	EditSearch.Visible = Utils.Int2Bool(ShareCode.DEVICE_SHOW_GLOBAL_SEARCH)
		
	LabelAvisoProcessamento.Text = ShareCode.mainmenuLabelAvisoProcessamento
	
	
	If (ShareCode.ISPHONE) Then		
		MainMenuTabStrip.LoadLayout("main_menu_first_tab","")
		MainMenuTabStrip.LoadLayout("main_menu_second_tab","")
	End If
	
	If Not(Comms.AlreadyStarted) Then
		StartService(Comms)
	End If
	
	Utils.SetButtonBackgroundColorToMainColorWithRadius(butQuickAction, 100)
	
	AfterCreateOrPause(IsFirsttime)
	Starter.CurrentWorkActivity = Me
	
'	ShareCode.DEVICE_PARAM_FAVORITES = DBStructures.getParamState("DEVICE_PARAM_FAVORITES")
'	ShareCode.DEVICE_PARAM_PRINT_DRAFT = DBStructures.getParamState("DEVICE_PARAM_PRINT_DRAFT")
'	ShareCode.DEVICE_ONLY_TECHORUSER = DBStructures.getParamState("DEVICE_ONLY_TECHORUSER")
'	ShareCode.DEVICE_DEFAULT_ROUTE = DBStructures.getParamState("DEVICE_DEFAULT_ROUTE")
'	ShareCode.APPDATE_ENDRANGE = Utils.GetCurrentDate 'GetNextNDays(1) 'GetNextWeekDate
'		
'	ShareCode.DEVICE_PARAM_ROUTES = DBStructures.getParamState("DEVICE_PARAM_ROUTES")
'	ShareCode.DEVICE_SHOW_REQUEST_ROUTE = DBStructures.getParamState("DEVICE_SHOW_REQUEST_ROUTE")
'	ShareCode.DEVICE_PARAM_ORIENTATION = DBStructures.getParamState("DEVICE_PARAM_ORIENTATION")
'	ShareCode.DEVICE_PARAM_AVAILABILITY = DBStructures.getParamState("DEVICE_PARAM_AVAILABILITY")
'	ShareCode.DEVICE_PARAM_PAUSE_REQUEST = DBStructures.getParamState("DEVICE_PARAM_PAUSE_REQUEST")
'	ShareCode.DEVICE_PARAM_DATA_CONFIRM = DBStructures.getParamState("DEVICE_PARAM_DATA_CONFIRM")
'	ShareCode.DEVICE_PARAM_PAUSE_TECH = DBStructures.getParamState("DEVICE_PARAM_PAUSE_TECH")
'	ShareCode.DEVICE_PARAM_PULL = DBStructures.getParamState("DEVICE_PARAM_PULL")
'	ShareCode.DEVICE_SHOW_REQUEST_ID = DBStructures.getParamState("DEVICE_SHOW_REQUEST_ID")
'	ShareCode.DEVICE_AUTOUPDATE_ONLOGIN = DBStructures.getParamState("DEVICE_AUTOUPDATE_ONLOGIN")
	
	ShareCode.DEVICE_ONLY_TECHORUSER 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_ONLY_TECHORUSER"), 0)
	ShareCode.DEVICE_SHOW_REQUEST_ID 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_SHOW_REQUEST_ID"), 0)
	ShareCode.DEVICE_PARAM_DATA_CONFIRM 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_DATA_CONFIRM"), 0)
	ShareCode.DEVICE_PARAM_AVAILABILITY 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_AVAILABILITY"), 0)
	ShareCode.DEVICE_PARAM_FAVORITES 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_FAVORITES"), 0)
	ShareCode.DEVICE_PARAM_PAUSE_REQUEST 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PAUSE_REQUEST"), 0)
	ShareCode.DEVICE_PARAM_PAUSE_TECH 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PAUSE_TECH"), 0)
	ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION = Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_UPLOAD_ONEXECUTION"), 0)
	ShareCode.DEVICE_REQUEST_AUTOUPDT_ONALERT 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_AUTOUPDT_ONALERT"), 0)
	ShareCode.DEVICE_AS_SEND_IMMEDIATLY 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AS_SEND_IMMEDIATLY"), 0)
	ShareCode.DEVICE_REQUEST_HIDECANCELED 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_HIDECANCELED"), 0)
	ShareCode.DEVICE_AUTOUPDATE_ONLOGIN 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AUTOUPDATE_ONLOGIN"), 0)
	ShareCode.DEVICE_AUTO_EXPAND_FIRST 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AUTO_EXPAND_FIRST"), 0)
	ShareCode.DEVICE_AUTO_EXPAND_CHECKLIST 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AUTO_EXPAND_CHECKLIST"), 0)
	ShareCode.DEVICE_DEFAULT_ROUTE 				= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_DEFAULT_ROUTE"), 0)
	ShareCode.DEVICE_AS_INCLUDE_OBS_FIRST 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AS_INCLUDE_OBS_FIRST"), 0)
	ShareCode.DEVICE_PARAM_PRINT_DRAFT 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PRINT_DRAFT"), 0)
	ShareCode.DEVICE_SHOW_REQUEST_ROUTE 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_SHOW_REQUEST_ROUTE"), 0)
	ShareCode.DEVICE_REQUEST_PUSH_OTHER 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_PUSH_OTHER"), 0)
	ShareCode.DEVICE_PARAM_PHOTO_QUALITY 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PHOTO_QUALITY"), 0)
	
	ShareCode.DEVICE_REOPEN_CHECKLISTS 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REOPEN_CHECKLISTS"), 0)
'	ShareCode.REQUEST_REOPEN_ONLY_ORANGE		= Utils.IfNullOrEmpty(DBStructures.getParamState("REQUEST_REOPEN_ONLY_ORANGE"), 0)
	
	ShareCode.DEVICE_REQUEST_SIGNATURE_TRG 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_SIGNATURE_TRG"), 0)
	ShareCode.DEVICE_REQUEST_PUSH_OTHER_AUTH 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_PUSH_OTHER_AUTH"), 0)
	ShareCode.DEVICE_PARAM_ORIENTATION 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_ORIENTATION"), 0)
	ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE 		= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_FONTSIZE", "value"), 12)
	ShareCode.DEVICE_PARAM_PHOTO_HEIGHT 		= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_HEIGHT", "value"), 615)
	ShareCode.DEVICE_PARAM_PHOTO_WIDTH 			= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_WIDTH", "value"), 820)
	ShareCode.DEVICE_REQUEST_CAN_DELETE_OWNED 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_CAN_DELETE_OWNED"), 0)
	ShareCode.DEVICE_PARAM_PHOTO_FILETYPE 		= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_FILETYPE", "value"), "PNG")
	ShareCode.DEVICE_PARAM_PULL 				= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PULL"), 0)
	ShareCode.DEVICE_PARAM_ROUTES 				= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_ROUTES"), 0)
	
	ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_GENERATEREPORT"), 1)
	ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_RESYNC_REQUESTS"), 1)
	ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_RUNCL_NOTYPEREQUEST"), 1)
	ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_FOTO_EVIDENCE"), 1)
	ShareCode.DEVICE_PARAM_DRAW_EVIDENCE 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_DRAW_EVIDENCE"), 1)
	
	ShareCode.DEVICE_PARAM_SENDREPORT 					= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_SENDREPORT"), 1)
	ShareCode.DEVICE_PARAM_CANCHANGE_OBJECT 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_CANCHANGE_OBJECT"), 1)
	ShareCode.DEVICE_PARAM_CANCHANGE_ENTITY 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_CANCHANGE_ENTITY"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_CANDUPLICATE 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_CANDUPLICATE"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_ASSIGNTO 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_ASSIGNTO"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE"), 0)
	ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE"), 0)
	ShareCode.DEVICE_PARAM_ADDITIONAL_USERS_REGISTER 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ADDITIONAL_USERS_REGISTER"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_ENDDATE_CONTROL"), 0)
	ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW"), 0)
	
	ShareCode.DEVICE_REQUEST_SHOWNEWICON_ONALERT 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REQUEST_SHOWNEWICON_ONALERT"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP"), 0)
	ShareCode.DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE"), 0)
	ShareCode.DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT"), 0)
	ShareCode.DEVICE_PARAM_DEFAULT_DATE_PERIOD 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_DEFAULT_DATE_PERIOD"), 0)
	ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REQUEST_SHOW_DATE_DIVIDER"), 0)
		
	ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE"), 0)
	ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER"), 0)
	ShareCode.DEVICE_ASKTOUPDATE_ONLOGIN 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_ASKTOUPDATE_ONLOGIN"), 0)
	ShareCode.DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY"), 0)
	ShareCode.DEVICE_PARAM_ACCESS_REQUESTS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_REQUESTS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_REPORTS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_REPORTS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_ALERTS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_ALERTS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_OBJECTS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_OBJECTS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_TASKS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_TASKS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_MYDATA 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_MYDATA"), 1)
	ShareCode.DEVICE_REQUEST_CUSTOMORDER 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REQUEST_CUSTOMORDER"), 0)
	
	ShareCode.DEVICE_CHECKLIST_STARTON_MYDATA 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_STARTON_MYDATA"), 0)
	ShareCode.DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP"), 0)
	
	ShareCode.DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND"), 0)
	ShareCode.DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND"), 0)
	ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACTIVATE_PRINTMODULE"), 0)
	ShareCode.DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN"), 0)
	ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT"), 0)
	ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION"), 0)
	ShareCode.DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS"), 0)
	ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE"), 0)
	
	ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_INVERTED_FOTO_DEVICE"), 0)
	ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE"), 0)
	
	ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REPORT_DATE_FROM_CHECKLIST"), 1)
		
	ShareCode.DEVICE_TYPEREQUEST_START_NEWWAY = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_TYPEREQUEST_START_NEWWAY"), 0)
	ShareCode.DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY"), 0)
	
	ShareCode.DEVICE_EMAIL_OLD_MODEL = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_EMAIL_OLD_MODEL"), 1)
	ShareCode.EmailOldModel = Utils.Int2Bool(ShareCode.DEVICE_EMAIL_OLD_MODEL)
	ShareCode.DEVICE_SHOW_GLOBAL_SEARCH = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_SHOW_GLOBAL_SEARCH"), 0)
	
'	ShareCode.DEVICE_SYNC_NEWWAY = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_SYNC_NEWWAY"), 0)
	
	ShareCode.STS005 = Utils.Int2Bool(ShareCode.DEVICE_REQUEST_HIDECANCELED)

	
	ShareCode.DEVICE_DEF_FONT_SIZE = ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE
	ShareCode.DEVICE_DEF_QUALITY = ShareCode.DEVICE_PARAM_PHOTO_QUALITY
	ShareCode.DEVICE_DEF_IMG_FILETYPE = ShareCode.DEVICE_PARAM_PHOTO_FILETYPE
	ShareCode.DEVICE_DEF_IMG_WIDTH = ShareCode.DEVICE_PARAM_PHOTO_WIDTH
	ShareCode.DEVICE_DEF_IMG_HEIGHT = ShareCode.DEVICE_PARAM_PHOTO_HEIGHT

	If (Not(ShareCode.APP_DOMAIN.ToLowerCase = "demo") And Not(ShareCode.APP_DOMAIN.ToLowerCase = "brasfone") And Not(ShareCode.APP_DOMAIN.ToLowerCase.Contains("grandative"))) Then
		butCallActions.Visible = False
		butCallActions.Enabled = False
	End If

'	CallSub(Starter, "CheckWebAccess")
'	Printer.Initialize("")
	
	Printer.Initialize(Me,"Printer",Encoding.Windows1252)
'	UpdateServiceTimer.Initialize("UpdateServiceTimer",1000)


	StartService(BackgroundUpdateService)
End Sub

'Sub Activity_PermissionResult (Permission As String, Result As Boolean)
'	CallSubDelayed3("printer", "Activity_PermissionResult", Permission, Result)
'End Sub

Sub UpdateServiceTimer_Tick
	Log("UpdateServiceTimer_Tick")
End Sub

Sub StartTheActivity(FirstTime As Boolean)
	Log("chegou")
End Sub

Sub LockScreen(nextSetp As Int, counter As Int)
	LockPanel.Visible = False
	ShareCode.MainLockPanel = LockPanel.Visible
End Sub

Sub UnlockScreen(nextSetp As Int, counter As Int)
	LockPanel.Visible = False	
	ShareCode.MainLockPanel = LockPanel.Visible
End Sub
	
Sub Activity_Resume
	LockPanel.Visible = False
	mainLabelInfo.Text = ""
	If (Starter.APP_FINE_LOCATION_ACCESS) Then
		If Not(LocationService.FusedLocationProvider1.IsInitialized) Then
			StartService(LocationService)
		End If
	End If
	UpdateServiceTimer.Initialize("UpdateServiceTimer",1000)
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	Starter.AppState.Flush
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		Dim Result As Int
		Result = Msgbox2(ShareCode.ApplicationExit, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If Result = DialogResponse.POSITIVE Then
			CallSubDelayed(Main, "ActivityFinish")
			Activity.Finish
		End If
	End If
	Return True
End Sub

Sub AfterCreateOrPause(FirstTime As Boolean)
	Log($"Starter.MakingLogin = ${Starter.MakingLogin}"$)
	If (Starter.MakingLogin = True) Then
		Starter.MakingLogin = False
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			'MakeUpdateData
		Else
			LockPanel.Visible = False
			ShareCode.MainLockPanel = LockPanel.Visible
		End If
	End If
	
	
'	ShareCode.SESS_UserTeam = DBStructures.SetUserTeamDate(ShareCode.SESS_User, Utils.GetCurrentDate, Utils.GetCurrentDate)
'	ShareCode.SESS_UserRoute = DBStructures.SetUserRouteDate(ShareCode.SESS_User, Utils.GetCurrentDate, Utils.GetCurrentDate)
'	Log(ShareCode.SESS_UserTeam)
'	Log(ShareCode.SESS_UserRoute)
'	
	If Not(Requestauth) Then
		Consts.ColorMain = Starter.KeepColorMain
		Consts.ColorSub = Starter.KeepColorSub
		
		If Not(ShareCode.APP_ComboValues.IsInitialized) Then ShareCode.APP_ComboValues.Initialize
		If Not(BadgerItems.IsInitialized) Then BadgerItems.Initialize

		UpdateMainLayout
		WaitToConfirm = False
		DBStructures.getCurrentConfigValues
		Started = True
		Starter.FirstInstall = False
		
'		If (FirstTime) Then
		Dim ThisButton As ComposedButtonDefs = Starter.CPButtons
		'If Not(Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACCESS_REQUESTS)) Then ThisButton = Starter.CPButtonsOFF
		Utils.MakeComposedButtonExt(CPButtonRequests, Chr(0xF046), ShareCode.MainOption_Request, ThisButton) 'Starter.CPButtons)

		Dim ThisButton As ComposedButtonDefs = Starter.CPButtons
		'If Not(Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACCESS_ALERTS)) Then ThisButton = Starter.CPButtonsOFF
		Utils.MakeComposedButtonExt(CPButtonAlerts, Chr(0xF16C), ShareCode.MainOption_Alerts, ThisButton) 'Starter.CPButtons)
			
		Dim ThisButton As ComposedButtonDefs = Starter.CPButtons
		'If Not(Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACCESS_REPORTS)) Then ThisButton = Starter.CPButtonsOFF
		Utils.MakeComposedButtonExt(CPButtonKPI, Chr(0xF080), ShareCode.MainOption_KPI, ThisButton) 'Starter.CPButtons)

		Dim ThisButton As ComposedButtonDefs = Starter.CPButtons
		'If Not(Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACCESS_TASKS)) Then ThisButton = Starter.CPButtonsOFF
		Utils.MakeComposedButtonExt(CPButtonTasks, Chr(0xF0B1), ShareCode.MainOption_Tasks, ThisButton) 'Starter.CPButtons)
			
		Dim ThisButton As ComposedButtonDefs = Starter.CPButtons
		'If Not(Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACCESS_OBJECTS)) Then ThisButton = Starter.CPButtonsOFF
		If(ShareCode.ISPHONE) Then
			Utils.MakeComposedButtonExt(CPButtonObjects, Chr(0xF1B3), ShareCode.MainOption_Planning, ThisButton) 'Starter.CPButtons)
		Else
			Utils.MakeComposedButtonExt(CPButtonObjects, Chr(0xF1B3), ShareCode.MainOption_Objects, ThisButton) 'Starter.CPButtons)
		End If
			
		Dim ThisButton As ComposedButtonDefs = Starter.CPButtons
		'If Not(Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACCESS_MYDATA)) Then ThisButton = Starter.CPButtonsOFF
		Utils.MakeComposedButtonExt(CPButtonUser, Chr(0xF2BC), ShareCode.MainOption_User, ThisButton) 'Starter.CPButtons)
			
		MainPopMenu.Initialize(Activity, Me, mainButtonMenu, Consts.ColorMain, Colors.White, Consts.ColorSub, True, False)
		
		Dim LblListNomeMenu As Label
		Dim LblListOpcaoMenu As Label
		MainPopMenuList.Color = Consts.ColorMain
		MainPopMenuList.Height = Activity.Height / 2 + 50
		MainPopMenuList.SingleLineLayout.Label.TextSize = 16
		MainPopMenuList.SingleLineLayout.Label.TextColor = Colors.White
		
		MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainPopMenuSync, "MainPopMenuSync")
		MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainPopMenuSync, "MainPopMenuSync")
		
		If (ShareCode.SESS_UserProfile = "PRF_ADMIN") Or (ShareCode.SESS_UserProfile = "PRF_SUPER") Then
			MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainDataValidation, "MainDataValidation")
			MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainPopMenuCompany, "MainPopMenuCompany")
			MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainDataValidation, "MainDataValidation")
			MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainPopMenuCompany, "MainPopMenuCompany")
		End If
			
		If  (ShareCode.APP_DOMAIN.ToLowerCase = "scms") Then
			MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainPopMenuPushRequest, "MainPopMenuPushRequest")
			MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainPopMenuPushRequest, "MainPopMenuPushRequest")
		End If
			
'		If  (ShareCode.APP_DOMAIN.ToLowerCase = "demo") Then
'			MainPopMenu.AddMenuItem("Teste de Checklist 1000 registos", "MainPopMenuChecklistTest" )
'		End If
			
		MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainPopMenuLoginChange, "MainPopMenuLoginChange")
		MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainPopMenuLoginChange, "MainPopMenuLoginChange")
		
		MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainDeviceInfoPopMenu, "MainDeviceInfoPopMenu")
		MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainDeviceInfoPopMenu, "MainDeviceInfoPopMenu")
		
		MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainInstallApk, "MainUpdateAPK")
		MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainInstallApk, "MainUpdateAPK")
		
		'	xxx -RETIRAR APOS OS TESTES
'		ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE = 1
		
		If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE)) Or _
			((ShareCode.APP_DOMAIN.ToLowerCase = "demo") Or (ShareCode.APP_DOMAIN.ToLowerCase = "erguelop") Or (ShareCode.APP_DOMAIN.ToLowerCase.contains ("transgrua"))) Then
			MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainDevicePrint, "MainDevicePrint")
			MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainDevicePrint, "MainDevicePrint")
		End If
		
		If ((ShareCode.APP_DOMAIN.ToLowerCase = "devdemo") Or (ShareCode.APP_DOMAIN.ToLowerCase = "demo") ) Then
			MainPopMenu.AddMenuItem("Codigo Barras", "BCQR")
		End If
		
		MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_MainPopMenuExit, "MainPopMenuExit")
		MainPopMenuList.AddSingleLine2(ShareCode.POPUPMENU_MainPopMenuExit, "MainPopMenuExit")
		AppStart
		
	End If
End Sub



Sub UpdateMainLayout
	If Not(ShareCode.ISPHONE) Then
		mainLogo.Gravity = Gravity.FILL
		mainLogo.Width = Consts.LogoWidth
		mainLogoSearch.Gravity = Gravity.FILL
		mainLogoSearch.Width = Consts.LogoWidth
	End If
	Log($"Inicialização de BMP: ${ShareCode.APP_MAIN_LOGO_MINI}"$)
	If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then
		mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO_MINI))
		mainLogoSearch.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO_MINI))
	End If
End Sub

Sub AppStart
	If (ShareCode.DEVICE_ORIENTATION = 1) Then
		ShareCode.DEVICE_DEF_IMG_WIDTH = 615
		ShareCode.DEVICE_DEF_IMG_HEIGHT  = 820 
	End If
	If ShareCode.APP_WORKING_LOCAL Then
		If (ShareCode.APPL_CONFIRMED = 0) Then
			MsgboxAsync(ShareCode.AuthorizationData_NoConnection_Validate, ShareCode.GeneralAlertTitle)
			CallSubDelayed(Main, "ActivityFinish")
			Activity.Finish
		End If
	End If
	
	mainBasePanel.Visible = True
	LabelDateTime.Text =  $"${Main.AppBuildVersionDate}"$   '$"$date{DateTime.Now} $time{DateTime.Now}"$
	UpdateMainLayout
	'backupActivityStates
	BadgeCheckUpdate
	WindowStatusUpdate
	
	Dim mList As List = File.ListFiles(Starter.InternalFolder)
	For n = 0 To mList.Size-1
		Dim ffile As String =  mList.Get(n)
		If (ffile.EndsWith("html")) Then
			Log("Ficheiro: " & ffile & ": " & File.Size(Starter.InternalFolder,ffile))
		End If
	Next
	
End Sub

Sub mainButtonMenu_Click
	Try
		If(MainPopMenu.MenuIsOpen) Then
			MainPopMenu.CloseMenu
		Else
			MainPopMenu.OpenMenu
		End If
	Catch
		MainPopMenuList.Left = mainButtonMenu.Left - MainPopMenuList.Width + mainButtonMenu.Width
		MainPopMenuList.top = mainButtonMenu.top + mainButtonMenu.Height
		If MainPopMenuList.Visible = True Then
			MainPopMenuList.Visible = False
		Else
			MainPopMenuList.Visible = True
		End If
	End Try
End Sub

Public Sub BadgeCheckUpdate
	Dim Ori As Int = 0
	If (ShareCode.ISPHONE) Then
		Ori = 1
	End If
	If Not(BadgerItems.IsInitialized) Then
		BadgerItems.Initialize
	End If
	'*************************************
	' USER
	'*************************************
	Try
		Dim userBadge As Int = 0
		If (ShareCode.UWDUKEY_DETAILS = 0) Then userBadge = userBadge +1
		If (ShareCode.UWDUKEY_PRODUCTS = 0) Then userBadge = userBadge +1
		If (CPButtonUser.IsInitialized) Then
			If (userBadge >= 1) Then
				BadgerItems.SetBadge(CPButtonUser, userBadge, Ori)
				'Log($"Badge: ${userBadge}"$)
			Else
'				Dim val As Int = BadgerItems.GetBadge(CPButtonUser)
				'Log($"Badge: ${val}"$)
				BadgerItems.SetBadge(CPButtonUser, 0, Ori)
			End If
			'***********************************************************
			' Removido o Badger de User, já que já não existe o botão Validar dados
			'***********************************************************
			BadgerItems.SetBadge(CPButtonUser, 0, Ori)
		End If
	Catch
		Log(LastException)
	End Try
	
	
	'*************************************
	' ALERTS
	'*************************************
	Try
		Dim alertBadge As Int = 0
		Private Record As Cursor
'		Dim sSQL As String = $"select count(0) as total from dta_alerts where status_id=0 and active=1 and alert_visible=1"$
		Dim sSQL As String = $"select count(0) as total from dta_alerts where alert_visible=1 
								and user_tagcode='${ShareCode.SESS_OPER_User}' 
								and active=1 and date_alert>='${Utils.GetLastWeekDate}'"$ 
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			alertBadge = Record.GetInt("total")
		End If
		Record.Close
		If (CPButtonAlerts.IsInitialized) Then
			If (alertBadge >= 1) Then
				BadgerItems.SetBadge(CPButtonAlerts, alertBadge, Ori)
			Else
'				Dim val As Int = BadgerItems.GetBadge(CPButtonAlerts)
				BadgerItems.SetBadge(CPButtonAlerts, 0, Ori)
			End If
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub WindowStatusUpdate
	If Utils.NE(ShareCode.SESS_OPER_UserName) Then
		StopService(LocationService)
		StopService(Comms)
		StopService(UserService)
		StopService(Logs)
		StartActivity(Main)
		Sleep(500)
		Activity.Finish
	End If
	
	LockPanel.Visible = False   'ShareCode.MainLockPanel
	Try
		LabelVersion.Text = ShareCode.APP_VersionNocodeName
		LabelCopyright.Text = ShareCode.APP_EntityBrand  '"X-Evolution,Lda"
		mainActiveUser.Text = ShareCode.SESS_OPER_UserName
		
		mainActiveUserSearch.Text = ShareCode.SESS_OPER_UserName
	Catch
		Log("Labels")
	End Try
	
	Try
		ButtonAppNetwork.Enabled = False
		ButtonAppNetwork.TextColor = Consts.ColorLightSilver
		If (ShareCode.APP_WORKING_LOCAL) Then
			ButtonAppNetwork.Enabled = True
			ButtonAppNetwork.TextColor = Consts.ColorRedOrange
		End If
	Catch
		Log("ButtonAppNetwork")
	End Try
	
	Try
		ButtonUserUnavailable.Enabled = False
		ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
		If (ShareCode.USR_STATE = 0) Then
			ButtonUserUnavailable.Enabled = True
			ButtonUserUnavailable.TextColor = Consts.ColorOrange
		End If
	Catch
		Log("ButtonUserUnavailable")
	End Try
	
	Try
		
		ButtonActionPause.Enabled = False
		ButtonActionPause.TextColor = Consts.ColorLightSilver
		'	If (ShareCode.CLA_STATE >= 1) Then
		If (ShareCode.SESS_IN_PAUSE = 1) Then
			ButtonActionPause.Enabled = True
			ButtonActionPause.TextColor = Consts.ColorOrange
		End If
	Catch
		Log("ButtonActionPause")
	End Try
End Sub

Sub butQuickAction_Click
'	mainPanelMenu.Visible = False
	ShareCode.GlobalEventsTimer = 0
	Try
		If panelOptions.Visible Then
			panelOptions.Visible = False
		Else
			panelOptions.Visible = True
		End If
	Catch
		Log(LastException.Message)
	End Try
End Sub

Sub butCallCamera_Click
	ShareCode.GlobalEventsTimer = 0
	If Utils.Int2Bool(ShareCode.DEVICE_PARAM_FOTO_EVIDENCE) Then
		ProgressDialogShow(ShareCode.GeneralLoadingMessage)
		CallSubDelayed2(CameraActivity2, "StartCamera", "MainMenu")
		ProgressDialogHide
	End If
	panelOptions.Visible = False
End Sub

Sub butCallImage_Click
	ShareCode.GlobalEventsTimer = 0
	If Utils.Int2Bool(ShareCode.DEVICE_PARAM_DRAW_EVIDENCE) Then
		ProgressDialogShow(ShareCode.GeneralLoadingMessage)
		Dim CurrentCLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "", _
						0,0, 0, "", "", "", 3, 0, 0, "", DBStructures.DB2CLATaskItem("", ""), "")
		CallSubDelayed3(ImageEdit, "StartDraw", Me, CurrentCLAItem)
		ProgressDialogHide
	End If
	panelOptions.Visible = False
End Sub
'
'	ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_GENERATEREPORT"), 1)
'	ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_RESYNC_REQUESTS"), 1)
'	ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_RUNCL_NOTYPEREQUEST"), 1)
'	ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_FOTO_EVIDENCE"), 1)
'	ShareCode.DEVICE_PARAM_DRAW_EVIDENCE

Sub butCallActions_Click
	ShareCode.GlobalEventsTimer = 0
	If (ShareCode.APP_DOMAIN.ToLowerCase = "demo") Then
		butCallActions_DEMO
	else if  (ShareCode.APP_DOMAIN.ToLowerCase.Contains("grandative")) Then
		butCallActions_GA
	else if  (ShareCode.APP_DOMAIN.ToLowerCase = "brasfone") Then
		butCallActions_BF
	End If
End Sub

' *************************************************************
' TIP: CRIAÇÃO DE PEDIDO DE INTERVENÇÃO (GA)
' *************************************************************
Sub butCallActions_GA
	ShareCode.GlobalEventsTimer = 0
	'CallSubDelayed2(ImageEdit, "StartDraw", 0)
	'Dim tagcode As String = "TSKS_2019_222538"
	
	Dim tagcode0 As String = "TSKS_EJRFO"
	Dim tagcode1 As String = "TSKS_PROSPECT"
	Dim tagcode2 As String = "TSKS_EJREGERAL"
	Dim tagcode3 As String = "TSKS_EJREQUIPMENT"
	
	ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize
		
		Dim newRequestItem2 As Map
		newRequestItem2.Initialize
		
		Dim newRequestItem3 As Map
		newRequestItem3.Initialize
		
		Dim newRequestType As String = ""
		Dim sSQL As String = $"select distinct tagcode, title
				from dta_typerequests  where tagcode='${tagcode0}'"$
'				 in (Select distinct typerequest_tagcode 
'					from dta_typerequests_tasks where task_tagcode='${tagcode}') limit 1"$
					
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			newRequestType = Record.GetString("tagcode")
		End If
		Record.Close
		Dim newRequest As String = Utils.MakeRequestTagcode
		Dim newDate As String = Utils.GetCurrentDate
		Dim newTime As String = Utils.GetCurrentTimeExt
		
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests", "id", "") + 1 + 1000000
		
		' CRIA UMA INTERVENÇÃO
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("id", maxID)
		newExecution.Put("tagcode", newRequest)
		newExecution.Put("route_tagcode", "ROUTE__NONE__")
		newExecution.Put("is_child", 0)
		newExecution.Put("prerequest", "")
		newExecution.Put("status_id", 1)
		newExecution.Put("state_id", 4)
		newExecution.Put("req_date", newDate)
		newExecution.Put("req_time", newTime)
		newExecution.Put("execdate_type", 0)
		newExecution.Put("dayweekmonth", 0)
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("origin_tagcode", "TORI_INTERNAL")
		newExecution.Put("entity_tagcode", "OBJECT_DESIGNATE")
		newExecution.Put("object_tagcode", "__NONE__")
		newExecution.Put("technical_tagcode", ShareCode.SESS_OPER_User)
		newExecution.Put("team_tagcode", "")
		newExecution.Put("local_tagcode", "ADRSS_20190522105322")
		newExecution.Put("typerequest_tagcode", tagcode0)
		newExecution.Put("vehicle_tagcode", ShareCode.SESS_VEHICLE_OBJECT)
		newExecution.Put("confirmed", 1)
		newExecution.Put("active", 1)
		newExecution.Put("cbr_id", 0)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem.Put("request", ListOfMaps)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests", ListOfMaps,newRequest,"")
		
		
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("id", maxID)
		newExecution.Put("request_tagcode", newRequest)
		newExecution.Put("relation_tagcode", tagcode1)
		newExecution.Put("inner_title", "")
		newExecution.Put("position", 0)
		newExecution.Put("type_relation", 0)
		newExecution.Put("status_id", 1)
		newExecution.Put("excel_import", 0)
		newExecution.Put("imported", 0)
		newExecution.Put("import_tagcode", "")
		newExecution.Put("object_tagcode", "__NONE__")
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("active", 1)
		newExecution.Put("cbr_id", 0)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem2.Put("0", ListOfMaps)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,newRequest,"")
		
		maxID = maxID + 1 + 100000
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("id", maxID)
		newExecution.Put("request_tagcode", newRequest)
		newExecution.Put("relation_tagcode", tagcode2)
		newExecution.Put("inner_title", "")
		newExecution.Put("position", 0)
		newExecution.Put("type_relation", 0)
		newExecution.Put("status_id", 1)
		newExecution.Put("excel_import", 0)
		newExecution.Put("imported", 0)
		newExecution.Put("import_tagcode", "")
		newExecution.Put("object_tagcode", "__NONE__")
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("active", 1)
		newExecution.Put("cbr_id", 0)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem2.Put("1", ListOfMaps)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,newRequest,"")
		 
		maxID = maxID + 1 + 100000
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("id", maxID)
		newExecution.Put("request_tagcode", newRequest)
		newExecution.Put("relation_tagcode", tagcode3)
		newExecution.Put("inner_title", "")
		newExecution.Put("position", 0)
		newExecution.Put("type_relation", 0)
		newExecution.Put("status_id", 1)
		newExecution.Put("excel_import", 0)
		newExecution.Put("imported", 0)
		newExecution.Put("import_tagcode", "")
		newExecution.Put("object_tagcode", "__NONE__")
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("active", 1)
		newExecution.Put("cbr_id", 0)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem2.Put("2", ListOfMaps)
		newRequestItem.Put("relation", newRequestItem2)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,newRequest,"")
		
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1000000
		
		Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
				tagcode,position,execute_value,execute_format_title,confirmed,changed_value,cbr_id)
				select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
				x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, 0 As cbr_id
				from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode, 
				c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position, 
				a.position As relposition, '' as execute_value, 
				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
				0 as confirmed, '' as changed_value
				from dta_requests_relations As a
				inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)
				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
				where a.type_relation=0 and a.request_tagcode='${newRequest}'
				union
				select d.id, '${newRequest}' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) As position,
				a.position as relposition, '' as execute_value, 
				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
				0 as confirmed, '' as changed_value
				from dta_requests_relations as a
				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode 
				from dta_requests_relations where request_tagcode ='${newRequest}')) as x
				order by  x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id"$
				
		Log(sSQL)
		Utils.SaveSQLToLog("butCallActions_GA",sSQL, newRequest)
		'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		
		
		UploadNewRequest2Server(newRequest, newRequestItem, "1")

		Sleep(1000)

		CallRequests
		
	Catch
		Log(LastException)
	End Try

	ProgressDialogHide
	
	panelOptions.Visible = False
	ProgressDialogHide
End Sub

' *************************************************************
' TIP: CRIAÇÃO DE PEDIDO DE INTERVENÇÃO (DEMO) 
' *************************************************************
Sub butCallActions_DEMO
	ShareCode.GlobalEventsTimer = 0
'	TSKS_20191002_232135
'	TSKS_20191002_193834
'	OBJECT_2019_091642
'	OBJECT_20191002_193449
	
	'CallSubDelayed2(ImageEdit, "StartDraw", 0)
	Dim tagcode As String = "TSKS_20191002_193834" '"TSKS_2019_222538" 'CHECKLIST
	ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize
		Dim newRequestType As String = ""
		Dim sSQL As String = $"select distinct tagcode, title
				from dta_typerequests 
				where tagcode in (select distinct typerequest_tagcode 
					from dta_typerequests_tasks where task_tagcode='${tagcode}') and tr_is_model=0 limit 1"$
					
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			newRequestType = Utils.IfNullOrEmpty(Record.GetString("tagcode"), "TSKS_20191002_232135")
		End If
		Record.Close
		Dim newRequest As String = Utils.MakeRequestTagcode
		Dim newDate As String = Utils.GetCurrentDate
		Dim newTime As String = Utils.GetCurrentTimeExt
		' CRIA UMA INTERVENÇÃO
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("tagcode", newRequest)
		newExecution.Put("route_tagcode", "ROUTE__NONE__")
		newExecution.Put("is_child", 0)
		newExecution.Put("prerequest", "")
		newExecution.Put("status_id", 2)
		newExecution.Put("state_id", 4)
		newExecution.Put("req_date", newDate)
		newExecution.Put("req_time", newTime)
		newExecution.Put("execdate_type", 0)
		newExecution.Put("dayweekmonth", 0)
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("origin_tagcode", "TORI_INTERNAL")
		newExecution.Put("entity_tagcode", "OBJECT_2019_091642") '"OBJECT_2019_091642")
		newExecution.Put("object_tagcode", "OBJECT_20191002_193449") '"OBJECT_2019_180935")
		newExecution.Put("technical_tagcode", ShareCode.SESS_OPER_User)
		newExecution.Put("team_tagcode", "")
		newExecution.Put("local_tagcode", "ADRSS_20191002_193449") '"ADRSS_20190520091642")
		newExecution.Put("typerequest_tagcode", newRequestType) '"TSKS_2019_181756")
		newExecution.Put("vehicle_tagcode", ShareCode.SESS_VEHICLE_OBJECT)
		newExecution.Put("confirmed", 1)
		newExecution.Put("active", 1)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem.Put("request", ListOfMaps)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests", ListOfMaps,newRequest,"")
		
		' 	verifica contador
		Dim ReqCounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${tagcode}'"$)
		
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("request_tagcode", newRequest)
		newExecution.Put("relation_tagcode", tagcode)
		newExecution.Put("inner_title", "")
		newExecution.Put("position", 0)
		newExecution.Put("type_relation", 0)
		newExecution.Put("status_id", 2)
		newExecution.Put("excel_import", 0)
		newExecution.Put("imported", 0)
		newExecution.Put("import_tagcode", "")
		newExecution.Put("object_tagcode", "OBJECT_20191002_193449") '"OBJECT_2019_180935")
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("repeatcounter", ReqCounter)
		newExecution.Put("active", 1)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem.Put("relation", ListOfMaps)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,newRequest,"")
		
'		Dim sSQL As String = $"insert into dta_requests_values (request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
'				tagcode,position,execute_value,confirmed,changed_value, repeatcounter)
'				select x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
'				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
'				x.execute_value, x.confirmed, x.changed_value
'				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode as tagcode, d.position, 
'				'' as execute_value, 0 as confirmed, '' as changed_value, a.repeatcounter
'				from dta_requests_relations as a
'				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				inner join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode='${newRequest}' and a.relation_tagcode='${tagcode}' and a.repeatcounter=${ReqCounter}
'				union
'				select d.id, '${newRequest}' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode as tagcode, d.position,
'				'' as execute_value, 0 as confirmed, '' as changed_value, a.repeatcounter
'				from dta_requests_relations as a
'				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				inner join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode 
'				from dta_requests_relations where request_tagcode ='${newRequest}')) as x
'				order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$

		Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)
				select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode,
				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
				x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter
				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, 
				'' as execute_value, 
				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
				0 as confirmed, '' as changed_value, a.repeatcounter
				from dta_requests_relations as a
				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
				where a.type_relation=0 and a.request_tagcode='${newRequest}' and a.relation_tagcode='${tagcode}' and a.repeatcounter=${ReqCounter}
				) as x
				order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$
		Log(sSQL)
		Utils.SaveSQLToLog("butCallActions_DEMO",sSQL, newRequest)
		'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		
		UploadNewRequest2Server(newRequest, newRequestItem, "0")
		Sleep(1000)
		
		Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS
		sSQL = $"${sSQL} and z.request_tagcode='${newRequest}' and z.repeatcounter=${ReqCounter}"$
		Log(sSQL)
		Log(newRequest)
		Private incolitems As Cursor
		incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If (incolitems.RowCount >= 1) Then
			incolitems.Position = 0
		
			Dim ID As Int = incolitems.GetInt("id")
			Dim tasktype As Int = incolitems.GetInt("type")
			Dim status_id As Int = incolitems.GetInt("status_id")
			Dim tagcode As String = incolitems.GetString("tagcode")
			Dim actionkey As String = incolitems.GetString("action_tagcode")
			Dim task As String = incolitems.GetString("task_tagcode")
			Dim name As String = incolitems.GetString("name")
			'Dim RequestType As Int = incolitems.GetInt("RequestType")
			
			Dim sACLADatetime As String = Utils.GetCurrDatetime
			Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
			Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

			Dim sDate As String = Utils.GetCurrentDate
			Dim sTime As String = Utils.GetCurrentTimeExt
			
			Dim close_type As Int = incolitems.GetInt("close_type")
			Dim result_type As Int = incolitems.GetInt("result_type")
			Dim result_values As String = incolitems.GetString("result_values")
			
			Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(2, close_type, result_type, result_values, False, 0, 0, 0, Null, Null, -1)
			Dim CLA As RequestCLA = Types.MakeRequestCLA(tagcode, actionkey, task, ReqCounter, tasktype, _
					Types.MakeInterv(ID, tagcode, status_id, Utils.ColorInt(status_id)), CLAInfo, _
					Types.MakeOtherCLA("", "", ""))
			
			Dim sSQL As String = $"update dta_requests set status_id=2, run_date='${sDate}', run_start='${sTime}' where tagcode='${tagcode}'"$
			Utils.SaveSQLToLog("butCallActions_DEMO",sSQL, tagcode)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			Log("Grava Status na BD local Request")
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", tagcode)
			params.Put("ACLAState", 2)
			params.Put("ACLAUser", ShareCode.SESS_User)
			params.Put("ACLADatetime", sACLADatetime)
			params.Put("ACLADate", sDate)
			params.Put("ACLATime", sTime)
			params.Put("ACLAFirst", 1)
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			Try
				params.Put("ACLALatitude", sACLALatitude)
				params.Put("ACLALongitude", sACLALongitude)
			Catch
				Log(LastException)
				params.Put("ACLALatitude", "")
				params.Put("ACLALongitude", "")
				Utils.logError("ACLALatitude - ACLALongitude", ShareCode.SESS_OPER_User, LastException)
			End Try
			CLA.Info.Map1 = params
			
			Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'  
						where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}' and repeatcounter=${ReqCounter}"$
			Utils.SaveSQLToLog("butCallActions_DEMO",sSQL, tagcode)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			Log("Grava Status na BD local Request-Relation")
			
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", tagcode)
			params.Put("ACLAAction", actionkey)
			params.Put("ACLAState", 2)
			params.Put("ACLAUser", ShareCode.SESS_User)
			params.Put("ACLADatetime", sACLADatetime)
			params.Put("ACLADate", sDate)
			params.Put("ACLATime", sTime)
			params.Put("ACLAReqCounter", ReqCounter)
			params.Put("ACLAFirst", 1)
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			Try
				params.Put("ACLALatitude", sACLALatitude)
				params.Put("ACLALongitude", sACLALongitude)
				Utils.logError("ACLALatitude - ACLALongitude", ShareCode.SESS_OPER_User, LastException)
			Catch
				Log(LastException)
				params.Put("ACLALatitude", "")
				params.Put("ACLALongitude", "")
			End Try
			CLA.Info.Map2 = params
			CLA.Status.status = 2
			Try
				CallSubDelayed3(CheckList3, "StartCLA_ActivityMain", CLA, name)
			Catch
				Log(LastException)
				Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
			End Try
		End If
	Catch
		Log(LastException)
	End Try
		
'		
'		Dim newObject As String = "__NONE__"
'		
'		Dim newRequestType As String = ""
'		Dim newExecDate As String = Utils.GetCurrentDate
'		Dim newExecDate As String = Utils.GetCurrentDate
'		Dim newStartTime As String = Utils.GetCurrentTimeExt
'		
'		Dim sSQL As String = $"select distinct tagcode, title
'				from dta_typerequests 
'				where tagcode in (select distinct typerequest_tagcode 
'					from dta_typerequests_tasks where task_tagcode='${tagcode}') limit 1"$
'					
'		Private Record As Cursor
'		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
'		If Record.RowCount > 0 Then
'			Record.Position = 0
'			MsgboxAsync($"Foi encontrada o tipo de Intervenção '${Record.GetString("title")}' com o tagcode='${Record.GetString("tagcode")}'"$, "Alerta!")
'		End If
'		Record.Close
'		Log(newRequest)
	ProgressDialogHide
	
	panelOptions.Visible = False
	ProgressDialogHide
End Sub

' *************************************************************
' TIP: CRIAÇÃO DE PEDIDO DE INTERVENÇÃO (BRASFONE)
' *************************************************************
Sub butCallActions_BF
	ShareCode.GlobalEventsTimer = 0
	'CallSubDelayed2(ImageEdit, "StartDraw", 0)
	Dim tagcode As String = "TSKS_20190911_135559"
	ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize
		Dim newRequestType As String = ""
		Dim sSQL As String = $"select distinct tagcode, title
				from dta_typerequests 
				where tagcode in (select distinct typerequest_tagcode 
					from dta_typerequests_tasks where task_tagcode='${tagcode}') limit 1"$
					
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			newRequestType = Record.GetString("tagcode")
		End If
		Record.Close
		Dim newRequest As String = Utils.MakeRequestTagcode
		Dim newDate As String = Utils.GetCurrentDate
		Dim newTime As String = Utils.GetCurrentTimeExt
		' CRIA UMA INTERVENÇÃO
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("tagcode", newRequest)
		newExecution.Put("route_tagcode", "ROUTE__NONE__")
		newExecution.Put("is_child", 0)
		newExecution.Put("prerequest", "")
		newExecution.Put("status_id", 2)
		newExecution.Put("state_id", 4)
		newExecution.Put("req_date", newDate)
		newExecution.Put("req_time", newTime)
		newExecution.Put("execdate_type", 0)
		newExecution.Put("dayweekmonth", 0)
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("origin_tagcode", "TORI_INTERNAL")
		newExecution.Put("entity_tagcode", "OBJECT_20190911_122437")
		newExecution.Put("object_tagcode", "OBJECT_20190911_122437")
		newExecution.Put("technical_tagcode", ShareCode.SESS_OPER_User)
		newExecution.Put("team_tagcode", "")
		newExecution.Put("local_tagcode", "ADRSS_20190911_122437")
		newExecution.Put("typerequest_tagcode", newRequestType) '"TSKS_20190911_144700")
		newExecution.Put("vehicle_tagcode", ShareCode.SESS_VEHICLE_OBJECT)
		newExecution.Put("confirmed", 1)
		newExecution.Put("active", 1)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem.Put("request", ListOfMaps)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests", ListOfMaps,newRequest,"")
		
		' 	verifica contador
		Dim ReqCounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${tagcode}'"$)
		
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("request_tagcode", newRequest)
		newExecution.Put("relation_tagcode", tagcode)
		newExecution.Put("inner_title", "")
		newExecution.Put("position", 0)
		newExecution.Put("type_relation", 0)
		newExecution.Put("status_id", 2)
		newExecution.Put("excel_import", 0)
		newExecution.Put("imported", 0)
		newExecution.Put("import_tagcode", "")
		newExecution.Put("object_tagcode", "OBJECT_20190911_122437")
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("repeatcounter", ReqCounter)
		newExecution.Put("active", 1)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem.Put("relation", ListOfMaps)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,newRequest,"")
		
'		Dim sSQL As String = $"insert into dta_requests_values (request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
'				tagcode,position,execute_value,confirmed,changed_value, repeatcounter)
'				select x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
'				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
'				x.execute_value, x.confirmed, x.changed_value
'				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode as tagcode, d.position, 
'				'' as execute_value, 0 as confirmed, '' as changed_value, a.repeatcounter
'				from dta_requests_relations as a
'				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				inner join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode='${newRequest}' and a.relation_tagcode='${tagcode}' and a.repeatcounter=${ReqCounter}
'				union
'				select d.id, '${newRequest}' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode as tagcode, d.position,
'				'' as execute_value, 0 as confirmed, '' as changed_value, a.repeatcounter
'				from dta_requests_relations as a
'				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				inner join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode 
'				from dta_requests_relations where request_tagcode ='${newRequest}')) as x
'				order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$

		Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)
				select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
				x.execute_value, x.execute_format_title,x.confirmed, x.changed_value, x.repeatcounter
				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, 
				'' as execute_value, 
				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
				0 as confirmed, '' as changed_value, a.repeatcounter
				from dta_requests_relations as a
				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
				where a.type_relation=0 and a.request_tagcode='${newRequest}' and a.relation_tagcode='${tagcode}' and a.repeatcounter=${ReqCounter}
				) as x
				order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$
		Log(sSQL)
		Utils.SaveSQLToLog("butCallActions_DEMO",sSQL, newRequest)
		'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		
		UploadNewRequest2Server(newRequest, newRequestItem, "0")
		Sleep(1000)
		
		Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS
		sSQL = $"${sSQL} and z.request_tagcode='${newRequest}' and z.repeatcounter=${ReqCounter}"$
		Log(sSQL)
		Log(newRequest)
		Private incolitems As Cursor
		incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If (incolitems.RowCount >= 1) Then
			incolitems.Position = 0
		
			Dim ID As Int = incolitems.GetInt("id")
			Dim tasktype As Int = incolitems.GetInt("type")
			Dim status_id As Int = incolitems.GetInt("status_id")
			Dim tagcode As String = incolitems.GetString("tagcode")
			Dim actionkey As String = incolitems.GetString("action_tagcode")
			Dim task As String = incolitems.GetString("task_tagcode")
			Dim name As String = incolitems.GetString("name")
			'Dim RequestType As Int = incolitems.GetInt("RequestType")
			
			Dim sACLADatetime As String = Utils.GetCurrDatetime
			Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
			Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

			Dim sDate As String = Utils.GetCurrentDate
			Dim sTime As String = Utils.GetCurrentTimeExt
			
			Dim close_type As Int = incolitems.GetInt("close_type")
			Dim result_type As Int = incolitems.GetInt("result_type")
			Dim result_values As String = incolitems.GetString("result_values")
			
			Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(2, close_type, result_type, result_values, False, 0, 0, 0, Null, Null, -1)
			Dim CLA As RequestCLA = Types.MakeRequestCLA(tagcode, actionkey, task, ReqCounter, tasktype, _
						Types.MakeInterv(ID, tagcode, status_id, Utils.ColorInt(status_id)), CLAInfo, _
						Types.MakeOtherCLA("", "", ""))
			
			Dim sSQL As String = $"update dta_requests set status_id=2, run_date='${sDate}', run_start='${sTime}' where tagcode='${tagcode}'"$
			Utils.SaveSQLToLog("butCallActions_DEMO",sSQL, tagcode)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			Log("Grava Status na BD local Request")
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", tagcode)
			params.Put("ACLAState", 2)
			params.Put("ACLAUser", ShareCode.SESS_User)
			params.Put("ACLADatetime", sACLADatetime)
			params.Put("ACLADate", sDate)
			params.Put("ACLATime", sTime)
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			Try
				params.Put("ACLALatitude", sACLALatitude)
				params.Put("ACLALongitude", sACLALongitude)
			Catch
				Log(LastException)
				params.Put("ACLALatitude", "")
				params.Put("ACLALongitude", "")
				Utils.logError("ACLALatitude - ACLALongitude", ShareCode.SESS_OPER_User, LastException)
			End Try
			CLA.Info.Map1 = params
			
			Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'  
						where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}' and repeatcounter=${ReqCounter}"$
			Utils.SaveSQLToLog("butCallActions_DEMO",sSQL, tagcode)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			Log("Grava Status na BD local Request-Relation")
			
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", tagcode)
			params.Put("ACLAAction", actionkey)
			params.Put("ACLAState", 2)
			params.Put("ACLAUser", ShareCode.SESS_User)
			params.Put("ACLADatetime", sACLADatetime)
			params.Put("ACLADate", sDate)
			params.Put("ACLATime", sTime)
			params.Put("ACLAReqCounter", ReqCounter)
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			Try
				params.Put("ACLALatitude", sACLALatitude)
				params.Put("ACLALongitude", sACLALongitude)
				Utils.logError("ACLALatitude - ACLALongitude", ShareCode.SESS_OPER_User, LastException)
			Catch
				Log(LastException)
				params.Put("ACLALatitude", "")
				params.Put("ACLALongitude", "")
			End Try
			CLA.Info.Map2 = params
			CLA.Status.status = 2
			Try
				CallSubDelayed3(CheckList3, "StartCLA_ActivityMain", CLA, name)
			Catch
				Log(LastException)
				Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
			End Try
		End If
	Catch
		Log(LastException)
	End Try
		
'		
'		Dim newObject As String = "__NONE__"
'		
'		Dim newRequestType As String = ""
'		Dim newExecDate As String = Utils.GetCurrentDate
'		Dim newExecDate As String = Utils.GetCurrentDate
'		Dim newStartTime As String = Utils.GetCurrentTimeExt
'		
'		Dim sSQL As String = $"select distinct tagcode, title
'				from dta_typerequests 
'				where tagcode in (select distinct typerequest_tagcode 
'					from dta_typerequests_tasks where task_tagcode='${tagcode}') limit 1"$
'					
'		Private Record As Cursor
'		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
'		If Record.RowCount > 0 Then
'			Record.Position = 0
'			MsgboxAsync($"Foi encontrada o tipo de Intervenção '${Record.GetString("title")}' com o tagcode='${Record.GetString("tagcode")}'"$, "Alerta!")
'		End If
'		Record.Close
'		Log(newRequest)
	ProgressDialogHide
	
	panelOptions.Visible = False
	ProgressDialogHide
End Sub

Sub UploadNewRequest2Server(tagcode As String, items As Map, origin As String)
	Dim ListOfMaps As List
	ListOfMaps.Initialize
	ListOfMaps.Add(items)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("_tagcode", tagcode)
	params.Put("origin", origin)
	params.Put("data", ListOfMaps)
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
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/upload/request/new"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Log(Job.GetString)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End If
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If
	
End Sub

Sub UploadNewRequestRel2Server(tagcode As String, items As Map)
	Dim ListOfMaps As List
	ListOfMaps.Initialize
	ListOfMaps.Add(items)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("_tagcode", tagcode)
	params.Put("data", ListOfMaps)
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
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/upload/request/rel-new"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Log(Job.GetString)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End If
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If
End Sub

Sub UpdateMeData(data As String)
	If (LabelAppInfo.IsInitialized) Then LabelAppInfo.Text = data
End Sub

Sub ButtonUserUnavailable_Click
	Dim i As Int
	i = Msgbox2(ShareCode.UserGoAvailableMessage, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
	If (i=DialogResponse.POSITIVE) Then
		Dim cli As AppDialogs
		cli.Initialize
		cli.MakeUserAvailable("MainMenu")
	End If
End Sub


Sub CPButtonTasks_Click
'	ShareCode.APP_WORKING_LOCAL = Not(Starter.WIFI.isOnLine)
'	CallSub(Starter, "CheckWebAccess")
'	Sleep(100)
	ProgressDialogShow(ShareCode.GeneralWaitPlease)
	Sleep(100)
	If IsPaused(Comms) Then
		StartService(Comms)
	End If
	If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(ShareCode.SESS_BLOCK_OPTIONS)) Then
		mainLabelInfo.Text = ShareCode.MainOption_Tasks
'		If Not(ShareCode.ISPHONE) Then
			CallTasks
'		End If
	End If
End Sub

Sub CPButtonAlerts_Click
'	ShareCode.APP_WORKING_LOCAL = Not(Starter.WIFI.isOnLine)
'	CallSub(Starter, "CheckWebAccess")
'	Sleep(100)
	ProgressDialogShow(ShareCode.GeneralWaitPlease)
	Sleep(250)
	If IsPaused(Comms) Then
		StartService(Comms)
	End If
	If (Not(ShareCode.SESS_BLOCK_OPTIONS)) Then
		mainLabelInfo.Text = ShareCode.MainOption_Alerts
'		If (ShareCode.ISPHONE) Then
'			MsgboxAsync("Esta opção ainda não foi pré-configurada no Back-Office. De momento encontra-se indisponível.", "Alerta")
'		Else
			CallAlerts '
'		End If
	End If
'	LockPanel.Visible = False
End Sub

Sub CPButtonKPI_Click
'	ShareCode.APP_WORKING_LOCAL = Not(Starter.WIFI.isOnLine)
'	CallSub(Starter, "CheckWebAccess")
'	Sleep(100)
	ProgressDialogShow(ShareCode.GeneralWaitPlease)
	Sleep(250)
	If IsPaused(Comms) Then
		StartService(Comms)
	End If
	If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(ShareCode.SESS_BLOCK_OPTIONS)) Then
		mainLabelInfo.Text = ShareCode.MainOption_KPI
'		If (ShareCode.ISPHONE) Then
'			MsgboxAsync("Esta opção ainda não foi pré-configurada no Back-Office. De momento encontra-se indisponível.", "Alerta")
'		Else
			CallReports
'		End If
	End If
End Sub

Sub CPButtonUser_Click
'	ShareCode.APP_WORKING_LOCAL = Not(Starter.WIFI.isOnLine)
	CallSub(Starter, "CheckWebAccess")
'	Sleep(100)
	ProgressDialogShow(ShareCode.GeneralWaitPlease)
	Sleep(250)
	mainLabelInfo.Text = ShareCode.MainOption_User
	CallUser
End Sub

Sub CPButtonObjects_Click
'	ShareCode.APP_WORKING_LOCAL = Not(Starter.WIFI.isOnLine)
'	CallSub(Starter, "CheckWebAccess")
'	Sleep(100)
	ProgressDialogShow(ShareCode.GeneralWaitPlease)
	Sleep(250)
	If IsPaused(Comms) Then
		StartService(Comms)
	End If
	If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(ShareCode.SESS_BLOCK_OPTIONS)) Then
		If(ShareCode.ISPHONE) Then
			mainLabelInfo.Text = ShareCode.MainOption_Planning
		Else
			mainLabelInfo.Text = ShareCode.MainOption_Objects
		End If
		
'		If Not(ShareCode.ISPHONE) Then
			CallObjects
'		End If
	End If
End Sub

Sub CPButtonRequests_Click

	ProgressDialogShow(ShareCode.GeneralWaitPlease)
	Sleep(250)
	If IsPaused(Comms) Then
		StartService(Comms)
	End If
	If Not(ShareCode.SESS_IN_PAUSE = 1) Then
		mainLabelInfo.Text = ShareCode.MainOption_Request
		If LocationService.FusedLocationProvider1.IsInitialized Then
			If Not(LocationService.FusedLocationProvider1.IsConnected) Then
				LocationService.FusedLocationProvider1.Connect
				If (LocationService.FusedLocationProvider1.IsConnecting) Then
					Dim susp As SuspendedCause = LocationService.FusedLocationProvider1.SuspendedCause
					Log( $"${susp.CAUSE_NETWORK_LOST}:${susp.CAUSE_NETWORK_LOST}"$)
				End If
			End If
			CallRequests
		End If
	End If
End Sub


Sub CallAlerts
	ShareCode.GlobalEventsTimer = 0
	ProgressDialogShow(ShareCode.GeneralLoadingMessage)
	CallSubDelayed2(Alerts, "StartTasksActivity", "")
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	'ProgressDialogHide
End Sub

Sub CallReports
	ShareCode.GlobalEventsTimer = 0
	ProgressDialogShow(ShareCode.GeneralLoadingMessage)
	CallSubDelayed2(Report, "StartReportActivity", 0)
'	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	'ProgressDialogHide
End Sub

Sub CallObjects
	ShareCode.GlobalEventsTimer = 0
	'StartActivity(teste)
'	ProgressDialogShow(ShareCode.GeneralLoadingMessage)
	CallSubDelayed3(Objects, "StartObjectsActivity", False, "")
	ShareCode.FadeInFadeOutAnimation
'	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	'ProgressDialogHide
End Sub

Sub CallTasks
	ShareCode.GlobalEventsTimer = 0
	ProgressDialogShow(ShareCode.GeneralLoadingMessage)
'	CallSubDelayed3(TasksCL, "StartTasksActivity", False, "")
	CallSubDelayed3(TasksCL2, "StartTasksActivityFirst", False, "CalledFromMenu")
'	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	'ProgressDialogHide
End Sub

Sub CallRequests
	ShareCode.GlobalEventsTimer = 0
	ProgressDialogShow(ShareCode.GeneralLoadingMessage)
	
	If ShareCode.APP_DOMAIN.ToLowerCase.Contains("grandative") And ShareCode.CurrentRequestFilter="0" Then
		ShareCode.CurrentRequestFilter = " and  a.status_id in (1,2,3,4)"
		ShareCode.STS005 = False
	End If
	
	CallSubDelayed3(requests3, "StartRequestActivity", False, ShareCode.CurrentRequestFilter)
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	ProgressDialogHide
End Sub

Sub CallUser
	ShareCode.GlobalEventsTimer = 0
	ProgressDialogShow(ShareCode.GeneralLoadingMessage)
	CallSubDelayed2(User, "StartUserActivity", "user.json")
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	ProgressDialogHide
End Sub

Sub ListsReturn(Arg As String)
	Sleep(500)
	Starter.CurrentWorkActivity = Me
	WindowStatusUpdate
	BadgeCheckUpdate
'	Log("chegou aqui")
	If (Arg = "ImageEdit") Then
		CallSub(ImageEdit, "ForceClose")
	End If
End Sub

Sub ListsReturnUpdateServer(Url As String, mappings As List)
	ProgressDialogShow2(ShareCode.AvisoAguarde, False)
	Sleep(100)
	Dim CountUploadFiles As Int = 0
	For i=0 To mappings.Size-1
		Dim params As Map = mappings.Get(i)
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", "")
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Dim Filename As String = params.Get("imagename")
		If Utils.NNE(Filename) Then
			If Not(ShareCode.APP_WORKING_LOCAL) Then
				Dim upl  As ResumableSub = UploadFilesWithFTP(Filename)
				Wait For(upl) Complete (finish As Boolean)
				If(finish = False)Then
					CountUploadFiles = CountUploadFiles + 1
				End If
				Sleep(500)
			Else
				Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
				Utils.save2update(ServerLocation, Filename, 1, WorkerND)
			End If
		End If
	Next
	Sleep(500)
	ProgressDialogHide
	Starter.CurrentWorkActivity = Me
	WindowStatusUpdate
	BadgeCheckUpdate
End Sub

Sub UploadFilesWithFTP(filename As String ) As ResumableSub
	Dim ret As Boolean = False
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
'	Dim ctm As CustomTrustManager
'	ctm.InitializeAcceptAll
'	myFTP.SetCustomSSLTrustManager(ctm)
	myFTP.TimeoutMs =240000
	Log(filename)
	Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
	Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, filename, False, ServerLocation & filename)
	Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
	If Success Then
		Log("file was uploaded successfully")
		ret = True
	Else
		Log("Error uploading file")
		ret = False
	End If
	myFTP.Close
	Return ret
End Sub

Sub ListsReturnNoAction
	Starter.CurrentWorkActivity = Me
	WindowStatusUpdate
	BadgeCheckUpdate
End Sub

Sub MainPopMenuCompany_Click(MenuName As String)
	Dim FilterParams As AppDialogs
	FilterParams.Initialize
	FilterParams.getDeviceParamsDialog(Activity, "MainMenu", MenuName)
End Sub

Sub MainDataValidation_Click(MenuName As String)
	Private this As AppDialogs
	this.Initialize
	this.GetDataInfoDialog("MainMenu") 
End Sub

Sub MainPopMenuPushRequest_Click(MenuName As String)
	Log("MainPopMenuPushRequest")
	Dim FilterParams As AppDialogs
	FilterParams.Initialize
	FilterParams.getPushRequestCode(Activity, "MainMenu", "Puxar intervenção")
End Sub

Sub MainPopMenuChecklistTest_Click(MenuName As String)
	Log("MainPopMenuChecklistTest")
'	CallChecklistTest
End Sub

Sub CallChecklistTest
	ShareCode.GlobalEventsTimer = 0
	CallSubDelayed(CheckListNew, "CreateRowsToList")
End Sub


Sub ReturnFromPushRequest(status As Int, theCode As String)
	Log("ReturnFromPushRequest")
	If (status = 1) And Utils.NNE(theCode) Then
		Dim FilterParams1 As AppDialogs
		FilterParams1.Initialize
		FilterParams1.getRequestSelectDialog(Activity, "MainMenu", "Seleccionar intervenção", 0)
	End If
End Sub

Sub ReturnFromPushRequestSelect(status As Int, theCode As String)
	If (status = 1) And Utils.NNE(theCode) Then
		'theCode = Código do Pedido
		'MsgboxAsync($"${theCode} : ${ShareCode.SESS_User} : ${ShareCode.SESS_UserTeam}"$, "Nota")
		Dim updSQL As String = ""
		Dim updType As Int = 0
		Dim updTag As String = Utils.IfNullOrEmpty(ShareCode.SESS_UserTeam, ShareCode.SESS_User)
		If (Utils.NNE(ShareCode.SESS_UserTeam)) Then
			Dim updSQL As String = $"Update dta_requests set team_tagcode='${ShareCode.SESS_UserTeam}' where tagcode='${theCode}'"$
		Else
			Dim updSQL As String = $"Update dta_requests set technical_tagcode='${ShareCode.SESS_User}' where tagcode='${theCode}'"$
			updType = 1
		End If
		If Utils.NNE(updSQL) Then
			Starter.LocalSQLEVC.ExecNonQuery(updSQL)
			
			
			Dim sACLADatetime As String = Utils.GetCurrDatetime
			Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
			Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
			
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", theCode)
			params.Put("ACLARelation", updType)
			params.Put("ACLATagcode", updTag)
			
			params.Put("ACLADatetime", sACLADatetime)
			params.Put("ACLALatitude", sACLALatitude)
			params.Put("ACLALongitude", sACLALongitude)
			params.Put("ACLSessUser", ShareCode.SESS_User)
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			
			Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/request/owner/change"$
			If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
				If Not(ShareCode.APP_WORKING_LOCAL) Then
					Utils.CallApi(0, params, Me, Url, "", theCode)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
					Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
				End If
				Sleep(250)
			Else
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
				Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
			End If
			
			MsgboxAsync(ShareCode.AvisoOperacaoConcluida, ShareCode.GeneralNoteTitle)
		Else
			
			MsgboxAsync(ShareCode.maimenuproblemaatribuicao, ShareCode.GeneralAlertTitle)
		End If
		'ShareCode.SESS_UserTeam
		'	ShareCode.SESS_UserTeam = DBStructures.SetUserTeamDate(ShareCode.SESS_User, ShareCode.APPDATE_STARTRANGE, ShareCode.APPDATE_ENDRANGE)
	End If
End Sub

Sub MainPopMenuSync_Click(MenuName As String)
	If Not(ShareCode.APP_WORKING_LOCAL) Then
'		If (ShareCode.APP_DOMAIN.ToLowerCase = "demo") Then
			
			Msgbox2Async(ShareCode.POPUPMENU_SyncManual,ShareCode.POPUPMENU_MainPopMenuSync,ShareCode.Option_AUTOMATICO,ShareCode.Option_CANCEL,ShareCode.Option_MANUAL, Null, False)
			Wait For Msgbox_Result (Result As Int)

			If Result = DialogResponse.POSITIVE Then
				ShareCode.SyncManualComponents.Initialize
				ShareCode.SYNC_COMPONENTS = ""
				ShareCode.DownloadDocsFromFTP = True
				CallSubDelayed3(DataUpdate, "RunSync","",False)
			Else If Result = DialogResponse.NEGATIVE Then
				ShareCode.DownloadDocsFromFTP = False
				Dim TipoDlg As Int = 0
				Dim Filter As AppDialogs
				Filter.Initialize
				ShareCode.SyncManualComponents.Initialize
				ShareCode.SYNC_COMPONENTS = ""
				Filter.getSyncManual(Me, TipoDlg)
			End If
'		Else
'			ShareCode.DownloadDocsFromFTP = True
'			CallSubDelayed3(DataUpdate, "RunSync","",False)
'		End If
	Else
		MsgboxAsync(ShareCode.AvisoNoSync, ShareCode.GeneralAlertTitle)
	End If
	End Sub
'
'Private Sub Date_From_Picker_onDateSet(year As Int, monthOfYear As Int,	dayOfMonth As Int)
'	Dim dte2set As String = $"${year}-${monthOfYear}-${dayOfMonth} ${Utils.GetCurrentTime}"$
'	If Utils.NNE(dte2set) Then
'		CallSubDelayed3(DataUpdate, "RunSync",dte2set,False)
'	End If
'	
'End Sub

Sub ReleaseDeviceAuthorization
'	Log(ShareCode.APP_DOMAIN)
'	Log(ShareCode.APPL_HOST)
'	Dim Core_DB As SQL
'	
'	Dim ClearSQL As String = "SELECT * FROM sys_contracts_devices WHERE contract_tagcode = 'PT20180913-2105-003' ORDER BY device_auth"
End Sub

Sub RunSyncManual(date2watch As String, SyncDates As Boolean)
	
	CallSubDelayed3(DataUpdate,"RunSync",date2watch, SyncDates)
	
End Sub

Sub MainUpdateAPK_Click(Menuname As String)
	'CallSubDelayed(Main,"CheckAppVersion")
End Sub

Sub TestSMS_Click(Menuname As String)
	Dim ExtraData2Send As String = $"${ShareCode.APPL_HOST}${CRLF}${ShareCode.SESS_OPER_UserName}${CRLF}"$
	
	'CallSub3(Me, "SendLargeSms","938590580",$"${ExtraData2Send}Boa tarde.${CRLF}Hora de chegada aproximada em cerca de 15 minutos.${CRLF}Obrigado!"$) ' Bruno Marques
	CallSub3(Me, "SendLargeSms","912193296",$"${ExtraData2Send}Boa tarde.${CRLF}Hora de chegada aproximada em cerca de 15 minutos.${CRLF}Obrigado!"$) ' Pedro Alpedrinha
	'CallSub3(Me, "SendLargeSms","925295899",$"${ExtraData2Send}Boa tarde.${CRLF}Hora de chegada aproximada em cerca de 15 minutos.${CRLF}Obrigado!"$)
End Sub


Sub SendSMS(sms_2number As String,sms_body As String)
	Dim In As Intent
	In.Initialize(In.ACTION_VIEW, "sms:" & sms_2number)
	In.PutExtra("sms_body", sms_body)
	StartActivity(In)
End Sub

Sub SendLargeSms(Destination As String, Message As String)
	
	Dim ctxt As JavaObject
	Dim Extra As String = "extra"
	ctxt.InitializeContext
	Dim smsManager As JavaObject
	smsManager = smsManager.InitializeStatic("android.telephony.SmsManager").RunMethod("getDefault", Null)
	Dim parts As JavaObject = smsManager.RunMethod("divideMessage", Array As String (Message))
	Dim size As Int = parts.RunMethod("size", Null)
 
	Dim i As Intent
	i.Initialize("b4a.smssent", "")
	i.PutExtra("phone", Destination)
	i.PutExtra("message_id", Extra)
	Dim pi As JavaObject
	pi = pi.InitializeStatic("android.app.PendingIntent").RunMethod("getBroadcast", _
     Array(ctxt, 0, i, 134217728))
 
	Dim i2 As Intent
	i2.Initialize("b4a.smsdelivered", "")
	i2.PutExtra("phone", Destination)
	i2.PutExtra("message_id", Extra)
	Dim pi2 As JavaObject
	pi2 = pi2.InitializeStatic("android.app.PendingIntent").RunMethod("getBroadcast", _
     Array(ctxt, 0, i2, 134217728))
 
	Dim al, al2 As JavaObject
	al.InitializeNewInstance("java.util.ArrayList", Null)
	al2.InitializeNewInstance("java.util.ArrayList", Null)
	For ii = 0 To size - 2
		al.RunMethod("add", Array(Null))
		al2.RunMethod("add", Array(Null))
	Next
	al.RunMethod("add", Array(pi))
	al2.RunMethod("add", Array(pi2))
	smsManager.RunMethod("sendMultipartTextMessage", Array(Destination, Null, parts, al, al2))
End Sub


Sub MainPopMenuExit_Click(MenuName As String)
	
	Msgbox2Async(ShareCode.mainlayoutAskSair, ShareCode.GeneralInfoTitle, ShareCode.Option_YES, "", ShareCode.Option_NO, Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Utils.LogUserAction("TUSRLGOT_2", Me)
		Sleep(250)
	
		DBUtils.ClearTable(Starter.LocalSQLWRK, "loc_userssession")
		Starter.AppState.WriteString("APP_START", "LAST_USER", ShareCode.APP_LAST_USER)
		Starter.AppState.Flush
		
		Dim res As ResumableSub = CloseAllServicesFromMenu
		Wait For(res) Complete (finished As Boolean)
		
		CallSubDelayed(Main, "ActivityFinish")
	End If
End Sub


Sub CloseAllServicesFromMenu As ResumableSub
	Try
		CancelScheduledService(Comms)
		StopService(Comms)
		CancelScheduledService(BackgroundUpdateService)
		StopService(BackgroundUpdateService)
		CancelScheduledService(LocationService)
		StopService(LocationService)
		CancelScheduledService(Logs)
		StopService(Logs)
		CancelScheduledService(Starter)
		StopService(Starter)
		CancelScheduledService(UpdateService)
		StopService(UpdateService)
		CancelScheduledService(UserService)
		StopService(UserService)
	Catch
		Log(LastException)
		Return False
	End Try
	Return True
End Sub

Sub MainPopMenuLoginChange_Click(MenuName As String)
	Utils.LogUserAction("TUSRLGOT_2", Me)
	Sleep(250)
	
	DBUtils.ClearTable(Starter.LocalSQLWRK, "loc_userssession")
	Starter.AppState.WriteString("APP_START", "LAST_USER", "")
	Starter.AppState.Flush

	StopService(LocationService)
	Log($"Stop service : LocationService"$)
	StopService(Comms)
	Log($"Stop service : Comms"$)
	StopService(UserService)
	Log($"Stop service : UserService"$)
	StopService(Logs)
	Log($"Stop service : Logs"$)
	Sleep(1000)
	StartActivity(Main)
	Sleep(500)
	Log("Voltou do StartActivity(Main)")
	Activity.Finish
End Sub

Sub MainDeviceInfoPopMenu_Click(MenuName As String)

	Private this As AppDialogs
	this.Initialize
	this.GetDeviceInfoDialog("MainMenu", Starter.DevInfo) 'Utils.DeviceInfo)
End Sub


Sub MainDevicePrint_Click(MenuName As String)
'	Dim Filter As AppDialogs
'	Filter.Initialize
'	Filter.GetBluetoothDevicesListDialog(Activity, "MainMenu", "Escolha o Dispositívo", Printer)
	GetBluetoothDevicesListDialog("Escolha o Dispositívo")
End Sub

Sub CompactDB_Click(MenuName As String)
	Starter.LocalSQLEVC.ExecNonQuery("vacuum;")
End Sub

Sub BCQR_Click(MenuName As String)
	ShareCode.SingleScan = False
	CallSubDelayed2(BarcodeScanner,"StarScanningMulti", "MainMenu")
End Sub

Sub returnedFromScanner
	Log("returnedFromScanner")
	For i=0 To ShareCode.ScanList.Size -1
		If Utils.NNE(ShareCode.ScanList.Get(i)) Then Log(ShareCode.ScanList.Get(i))
	Next
End Sub

Sub ResetApplication
	Starter.RunUpdate = True
	ProgressDialogShow2(ShareCode.Pg2MsgEnviarDadosVerificacao, True)
	Sleep(500)
	
	Dim res As ResumableSub = UploadFilesWithFTPLocalData
	Wait For(res) Complete (finish As Boolean)
	If(finish = False)Then
		MsgboxAsync("Erro ao enviar dados de verificação Tente Novamente.... ", "Erro")
	End If
	ProgressDialogHide
	
	Starter.RunUpdate = False
End Sub

Sub DeviceInfoOrientationChange(newOri As Int)
	Dim i As Int = Msgbox2(ShareCode.OrientationChange, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
	If (i=DialogResponse.POSITIVE) Then
		CallSubDelayed2(Main, "RestartApp", newOri)
		Activity.Finish
	End If
End Sub

Sub ButtonActionPause_Click
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		'Starter.AppState.WriteBool("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
		Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			ShareCode.SESS_IN_PAUSE = 0
			Starter.AppState.WriteInteger("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
			Starter.AppState.Flush
		End If
	End If
	WindowStatusUpdate
End Sub

Sub ButtonAppNetwork_Click
	MsgboxAsync(ShareCode.ConnectionBreak, ShareCode.GeneralNoteTitle)
End Sub

Sub UploadFilesWithFTPLocalData As ResumableSub
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
	myFTP.TimeoutMs =240000
	
	Dim Continua As Boolean = True
	Try
		Dim myFolder As String = $"/${ShareCode.APP_DOMAIN}/import/internal/D${Utils.MakeFileName}"$
		myFTP.SendCommand("MKD", myFolder)
		Wait For ftp_CommandCompleted (Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
	Catch
		Log(LastException)
		Continua = False
	End Try
	
	If (Continua) Then
		Log(myFolder)
		Log(Success)
		Log(Command)
		If Not(Success) Then
			Dim myFolder As String = $"/${ShareCode.APP_DOMAIN}/import/internal/"$
		Else
			myFolder = $"${myFolder}/"$
		End If
		Log(myFolder)
'*****************************************
' Alteração PC
		Try
			Dim sf As Object = myFTP.UploadFile(Starter.SharedFolder, "evolutioncheck.db3", False, myFolder & "evolutioncheck.db3")
			Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
			Log("ftp_UploadCompleted Success = " & Success)
		Catch
			Log(LastException)
		End Try
	
		Try
			Dim sf As Object = myFTP.UploadFile(Starter.SharedFolder, "worker.db", False, myFolder & "worker.db")
			Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
			Log("ftp_UploadCompleted Success = " & Success )
		Catch
			Log(LastException)
		End Try
	
		Dim fLogList As List = File.ListFiles(Starter.SharedFolder)
		For n1=0 To fLogList.Size-1
			Dim ff As String = fLogList.Get(n1)
			
			If (ff.EndsWith(".log")) Then
				Try
					Dim sf As Object = myFTP.UploadFile(Starter.SharedFolder, ff, False, myFolder & ff)
					Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
					Log($"ftp_UploadCompleted  FileName = ${ff}$ " Success = ${Success}$ "$)
			
				Catch
					Return False
					Log(LastException)
				End Try
			End If
		Next
		
		Dim fList As List = File.ListFiles(Starter.InternalFolder) ' so png
		For n=0 To fList.Size-1
			Dim ff As String = fList.Get(n)
			If (ff.EndsWith(".png")) Then
				Try
					Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, ff, False, myFolder & ff)
					Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
					Log($"ftp_UploadCompleted  FileName = ${ff}$ " Success = ${Success}$ "$)
				Catch
					Return False
					Log(LastException)
				End Try
			End If
		Next
		Try
			Dim sf As Object = myFTP.UploadFile(Starter.SharedFolder, "evolutioncheck.db3", False, myFolder & "evolutioncheck.db3")
			Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
			Log("ftp_UploadCompleted Success = " & Success)
		Catch
			Log(LastException)
		End Try
	
		Try
			Dim sf As Object = myFTP.UploadFile(Starter.SharedFolder, "worker.db", False, myFolder & "worker.db")
			Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
			Log("ftp_UploadCompleted Success = " & Success )
		Catch
			Log(LastException)
		End Try
		myFTP.Close
	Else
		myFTP.Close
		MsgboxAsync("Erro de comunicação! Operação cancelada.", "Alerta")
		Return False
	End If
	
	Return True
End Sub

'Sub SendFile2FTP(foldername As String, filename As String)
'	Dim myFTP As FTP
'	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
'	myFTP.PassiveMode = True
'	myFTP.TimeoutMs =240000
'	Dim sf As Object = myFTP.UploadFile(Starter.SharedFolder, "evolutioncheck.db3", False, foldername & filename)
'	Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
'	myFTP.Close
'End Sub

Sub butCallShort1_Click
	
End Sub

Sub butCallShort2_Click
	
End Sub

Sub butCallShort3_Click
	
End Sub


Sub MainRestartConfig_Click(MenuName As String)
	Msgbox2Async("Confirma o procedimento de re-inicialização da configuração do equipamento?", ShareCode.GeneralInfoTitle, ShareCode.Option_YES, "", ShareCode.Option_NO, Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Utils.LogUserAction("TUSRLGOT_2", Me)
		Sleep(250)
		
		MakeRestartConfig
	End If
End Sub

Sub MakeRestartConfig
	Starter.LocalSQLEVC.Close
	If File.Exists(Starter.SharedFolder, "evolutioncheck.db3") Then
		File.Delete(Starter.SharedFolder, "evolutioncheck.db3" )
	End If
	Sleep(250)
	
	If Not(File.Exists(Starter.SharedFolder, "evolutioncheck.db3")) Then
		File.Copy(File.DirAssets, "evolutioncheck.db3", Starter.SharedFolder, "evolutioncheck.db3" )
	End If
	Sleep(250)
	
	If Not(Starter.LocalSQLEVC.IsInitialized) Then Starter.LocalSQLEVC.Initialize(Starter.SharedFolder, "evolutioncheck.db3", True)
	Dim res As ResumableSub = FirstInstallCompleteProcedure(False)
	Wait For(res) Complete (result As Boolean)
	If Not(result)Then
		MsgboxAsync(ShareCode.AvisoErroComms,ShareCode.GeneralAlertTitle)
		Starter.APP_IN_EXECUTION = False
	End If
	
	MainPopMenuLoginChange_Click("")
End Sub

Sub Reinstallation(Download As Boolean)
	PanelDownloadInicial.Visible = True
	Dim res As ResumableSub = FirstInstallCompleteProcedure(Download)
	Wait For(res) Complete (result As Boolean)
	If Not(result)Then
		MsgboxAsync(ShareCode.AvisoErroComms,ShareCode.GeneralAlertTitle)
		Starter.APP_IN_EXECUTION = False
	End If
	
	MainPopMenuLoginChange_Click("")
	
End Sub


Sub FirstInstallCompleteProcedure(Reinstall As Boolean) As ResumableSub
	'*****************************************************************************************
	' Para o serviço de localização e faz disable ao botao de Concluir
	'*****************************************************************************************

	ShareCode.GlobalEventsTimer = 0
	Starter.StopLocationCheck = True
	StopService(BackgroundUpdateService)
	StopService(LocationService)
'	ButtonWelcomeNext.Enabled = False
	LabelTarefa.Visible = False
	UpdateProgressBar(100,0)
	UpdateProgressBar2(100,0)
	Dim TotalLinesOfScripts As Int = 0
	Private ExceptionError As String = ""
	'*****************************************************************************************
	' COLOCAR O SHARECODE.NEWRETURN A 1 PARA ACTIVAR O NOVO INFO EM JSON
	'*****************************************************************************************
	' PROCESSO ANTES DO LOGIN PARA DOWNLOAD DOS FICHEIROS MESTRE
	' CONFIGURACAO
	' ESTRUTURAS
	' REGISTOS BASE
	'*****************************************************************************************
	PanelFirstInstallConfig.Visible = True
	'*****************************************************************************************
	'FORÇAR O KEEPALIVE DURANTE A INSTALACAO INICIAL
	ShareCode.AwakeDevice(True)
	
	If ShareCode.IsDevelopment Then
		ShareCode.APP_FTP_USER = "DevEvolutionCheck"
	Else
		ShareCode.APP_FTP_USER = "EvolutionCheck"
	End If
	
	
	Try
		LabelDownloadInicialTitle.Text = ShareCode.MsgUpdateTitlePasso1PrimeiraInstalacao
		
		Dim FIRST_INSTALL_INFO As String = "FIRSTINSTALL.INFO"
		Dim firstInstallFilesName As String = "FIRSTINSTALL"
			
		Utils.ShowProcinLog("Main","FirstInstallCompleteProc",$"DOWNLOAD MESTRES"$)
		

		'*****************************************************************************************
		' CRIAR UM FICHEIRO DE CONTROLO DA INSTALAÇÃO, QUE SERÁ APAGADO NO FINAL DA MESMA
		' SE O FICHEIRO EXISTIR SIGNIFICA QUE A INSTALACAO NAO TERMINOU CORRECTAMENTE
		'*****************************************************************************************
		If File.Exists(Starter.SharedFolder,"FIRSTINSTALL_IN_PROGRESS") Then
		
'			Msgbox2Async($"O sistema detectou uma instalação anterior incompleta !${CRLF}Por favor reinstale a aplicação, desinstalando a actual primeiro."$,ShareCode.GeneralAlertTitle, "OK", "", "", Null, False)
			Msgbox2Async($"O sistema detectou uma instalação anterior incompleta !${CRLF}A instalação vai Reiniciar."$,ShareCode.GeneralAlertTitle, "OK", "", "", Null, False)
			Wait For Msgbox_Result (Result As Int)
			If Result = DialogResponse.POSITIVE Then
'				ExitApplication
			End If
	
		End If
	
		File.writestring(Starter.SharedFolder,"FIRSTINSTALL_IN_PROGRESS", Utils.GetCurrDatetime)
		
		'SE OS FICHEIROS DA PRIMEIRA INSTALAÇÃO EXISTIREM, ENTAO UTILIZA-OS EM VEZ DE OS REUTILIZAR A MENOS QUE SEJAM ANTIGOS
		
		If File.Exists(Starter.SharedFolder, FIRST_INSTALL_INFO) And Not(Reinstall) Then
			Log("FIRSTINSTALL JA EXISTE")
			
			' APAGA A BD PARA VOLTAR A INSERIR OS REGISTOS
			Starter.LocalSQLEVC.Close
			If File.Exists(Starter.SharedFolder, "evolutioncheck.db3") Then
				File.Delete(Starter.SharedFolder, "evolutioncheck.db3" )
			End If
			Sleep(250)
	
			If Not(File.Exists(Starter.SharedFolder, "evolutioncheck.db3")) Then
				File.Copy(File.DirAssets, "evolutioncheck.db3", Starter.SharedFolder, "evolutioncheck.db3" )
			End If
			Sleep(250)
	
			If Not(Starter.LocalSQLEVC.IsInitialized) Then Starter.LocalSQLEVC.Initialize(Starter.SharedFolder, "evolutioncheck.db3", True)
			Sleep(100)
			
			' LE O NUMERO DE FICHEIROS EXISTENTES NO FIRSTINSTALL.INFO
			Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, FIRST_INSTALL_INFO)
			Dim parser As JSONParser
			parser.Initialize(JsonStruct)
			Dim root As Map = parser.NextObject
			Dim DataHora As String = root.Get("datetime")
			File.writeString(Starter.SharedFolder,$"date_installed.log"$, DataHora)
			ShareCode.Installed_Date = DataHora
			File.writeString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_autosync.log"$, DataHora)
			Dim SqlFilesTotal As Int = root.Get("files")
			Dim inserts As List = root.Get("inserts")
			Dim date As String = DataHora
			Utils.UpdateLiteUpdateDateTime(date)
			DBStructures.UpdateWorkerDbLastUpdate(date)
	
			If SqlFilesTotal = 0 Then
			
				If File.Exists(Starter.SharedFolder,$"date_installed.log"$) Then
					File.Delete(Starter.SharedFolder,$"date_installed.log"$)
					ShareCode.Installed_Date = ""
				End If
			
				Msgbox2Async($"UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS${CRLF}POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!"$, ShareCode.GeneralAlertTitle, "OK", "", "", Null, False)
				Wait For Msgbox_Result (Result As Int)
				If Result = DialogResponse.POSITIVE Then
					ExitApplication
				End If
			End If
		Else
			Log("FIRSTINSTALL NAO EXISTE")
			'*****************************************************************************************
			' OBTER O NUMERO DE FICHEIROS PARA DOWNLOAD INICIAL
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
		
				Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & FIRST_INSTALL_INFO, False, Starter.Provider.SharedFolder, FIRST_INSTALL_INFO)
				Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
				If Success Then
			
					Try
						LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleObterInfo
					
						Log(FIRST_INSTALL_INFO & " file was download successfully")
					
						'*************************************************************************
						' NOVA ROTINA PARA LER O INFO DA ESTRURUA JSON EM VEZ DE SER DO FICHEIRO
						' TEM DE PASSAR A HAVER UMA CHAMADA A API PARA O FIRSTINSTALL SENAO NAO TEMOS
						' CONTROLO DO PARAMETRO newreturn E NUNCA VEM A NOVA ESTRUTURA NESTE CASO
						'*************************************************************************
						Dim TesteJson As String = File.readstring(Starter.Provider.SharedFolder, FIRST_INSTALL_INFO)
					
						If ShareCode.newReturn = 1 Then
							If TesteJson.Contains("{") Then
								Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, FIRST_INSTALL_INFO)
								Dim parser As JSONParser
								parser.Initialize(JsonStruct)
								Dim root As Map = parser.NextObject
								Dim DataHora As String = root.Get("datetime")
								File.writeString(Starter.SharedFolder,$"date_installed.log"$, DataHora)
								File.writeString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_autosync.log"$, DataHora)
								Dim SqlFilesTotal As Int = root.Get("files")
								Dim inserts As List = root.Get("inserts")
								Dim date As String = DataHora
								Utils.UpdateLiteUpdateDateTime(date)
								DBStructures.UpdateWorkerDbLastUpdate(date)
								dotry = False
								trycount = 3
								GlobalFTP.Close
							Else
								Dim List1 As List
								List1 = File.ReadList(Starter.Provider.SharedFolder, FIRST_INSTALL_INFO)
								SqlFilesTotal = List1.Get(0) ' Numero de ficheiros para download
								Dim date As String = List1.Get(1)
								Utils.UpdateLiteUpdateDateTime(date)
								DBStructures.UpdateWorkerDbLastUpdate(date)
								dotry = False
								trycount = 3
								GlobalFTP.Close
							End If
						
						Else
							Dim List1 As List
							List1 = File.ReadList(Starter.Provider.SharedFolder, FIRST_INSTALL_INFO)
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
					Log("Error downloading file " & FIRST_INSTALL_INFO)
					trycount = trycount + 1
					ExceptionError = LastException
				End If
			Loop
			GlobalFTP.Close
		
			If SqlFilesTotal = 0 Then
			
				If File.Exists(Starter.SharedFolder,$"date_installed.log"$) Then
					File.Delete(Starter.SharedFolder,$"date_installed.log"$)
					ShareCode.Installed_Date = ""
				End If
			
				Msgbox2Async($"UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS${CRLF}POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!"$, ShareCode.GeneralAlertTitle, "OK", "", "", Null, False)
				Wait For Msgbox_Result (Result As Int)
				If Result = DialogResponse.POSITIVE Then
					ExitApplication
				End If
			
			End If
			'*****************************************************************************************
			' O NUMERO DE FICHEIROS PARA DOWNLOAD INICIAL ESTA EM SqlFileTotal
			' BASEADO NO firstInstallFilesName E COM UM CICLO For..Next ATE AO SqlFilesTotal
			' OBTER OS FICHEIROS COM OS SCRIPTS DE INSTALACAO, APAGADO-OS ANTES DO DOWNLOAD SE JA EXISTIREM
			'*****************************************************************************************
			If(SqlFilesTotal > 0) Then
				LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleDownloadDados
			
				Dim GlobalFTP As FTP
				GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
				GlobalFTP.PassiveMode = True

				GlobalFTP.TimeoutMs = 240000
			
				For i = 1 To SqlFilesTotal
					LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleDownloadDados & $" ${i}/${SqlFilesTotal}"$
					Dim fileN As String = $"${firstInstallFilesName}${i}.sql"$
				
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
					
						Dim MsgFatal As String = $"Ocorreu um Erro ao descarregar um dos ficheiros mestres.${CRLF}Ficheiro FIRSTINTALL${i}.SQL${CRLF}A aplicação vai terminar !${CRLF}Por favor verifique o acesso à internet e reinstale a aplicação, depois de desinstalar a actual !"$
						Msgbox2Async(MsgFatal, ShareCode.GeneralAlertTitle, "OK", "", "", Null, False)
					
						If File.Exists(Starter.SharedFolder,$"date_installed.log"$) Then
							File.Delete(Starter.SharedFolder,$"date_installed.log"$)
							ShareCode.Installed_Date = ""
						End If
					
						Wait For Msgbox_Result (Result As Int)
					
						If Result = DialogResponse.POSITIVE Then
							ExitApplication
						End If
					
					End If
				
					UpdateProgressBar(SqlFilesTotal,i)
			
				Next
				GlobalFTP.Close
			
			End If
		
			' LIMPA O PROGRESSBAR E PASSA A NOVA FASE
			UpdateProgressBar(100,0)
			Sleep(500)
		End If
		
		'*****************************************************************************************
		' BASEADO NO firstInstallFilesName E COM UM CICLO For..Next ATE AO SqlFilesTotal
		' CRIAR UMA LISTA COM AS INSTRUCOES SQL POR ITEM E EXECUTA-LAS
		'*****************************************************************************************
		If(SqlFilesTotal > 0) Then
			
			For i = 1 To SqlFilesTotal
				TotalLinesOfScripts = 0
				LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleCarregarDados & $" ${i}/${SqlFilesTotal}"$
				Dim fileN As String = $"${firstInstallFilesName}${i}.sql"$
				
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
				
				UpdateProgressBar2(100,0)
				ProgressoInicial2.visible = True
				LabelTarefa.Visible = True
				For n = 0 To List1.Size -1
					LabelTarefa.Text = ShareCode.MsgExecProcAct & $" ${n}/${TotalLinesOfScripts}"$
					Dim Script2Execute As String = List1.Get(n)
					Utils.SaveSQLToLog("Main",Script2Execute, "")
					UpdateProgressBar2(TotalLinesOfScripts,n)
					Sleep(1)
				Next
				
				ProgressoInicial2.visible = False
				LabelTarefa.Visible = False
				UpdateProgressBar(SqlFilesTotal,i)
				Sleep(1)
			Next
		End If

		
		UpdateProgressBar2(100,0)
		ProgressoInicial2.visible = False
		LabelTarefa.Visible = False
		UpdateProgressBar(100,0)
		
		
		'***********************************************************************
		' APAGAR O FICHEIRO DE CONTROLO DA INSTALACAO INICIAL
		' SE FALHAR NA INSTALACAO SEGUINTE, DOCS e DOCS/TEMPLATES, NAO É
		' CRITICO POIS VEM NA SINCRONIZACAO
		'***********************************************************************
'		Starter.SharedFolder,"INSTALLING.CTRL"

		If File.Exists(Starter.SharedFolder,"FIRSTINSTALL_IN_PROGRESS") Then
			File.Delete(Starter.SharedFolder,"FIRSTINSTALL_IN_PROGRESS")
		End If
		
		
		'*****************************************************************************************
		' DOWNLOAD DOS FICHEIROS NA PASTA DOCS
		'*****************************************************************************************
'		LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
'		Log("************************************************************")
'		Log($" 		INITIAL : ${ShareCode.APPL_HOST}/${ShareCode.APP_DOMAIN} "$)
'		Log("/docs/")
'		Log("************************************************************")
'		Dim GlobalFTP As FTP
'		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
'		GlobalFTP.PassiveMode = True
'		GlobalFTP.TimeoutMs = 240000
'		Dim FTPDOCSLIST As List
'		Dim TotalDocs As Int = 0
'		
'		Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/")
'
'	
'		Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
'		If Success Then
'		
''			For l1 = 0 To Files.Length - 1
''				Log($"/docs/ : ${Files(l1).Name}"$)
''			Next
'
'			Dim LMDate As Long = Utils.GetLastNDaysLong(1) '.GetLastMonthDateLong
'		
'			If (files.Length >= 1) Then
'				FTPDOCSLIST.Initialize
'				For i = 0 To files.Length - 1
'					Dim fName As String = files(i).Name
'					If (fName.EndsWith(".png")) Or (fName.EndsWith(".jpg"))  Or (fName.EndsWith(".jpeg"))  Or _
'						(fName.EndsWith(".pdf"))  Or (fName.EndsWith(".doc"))  Or (fName.EndsWith(".docx"))  Or _
'						(fName.EndsWith(".xls"))  Or (fName.EndsWith(".xlsx"))  Or _
'						(fName.EndsWith(".ppt")) Or (fName.EndsWith(".pptx"))  Or Not((fName.StartsWith("REPORT"))) Then
'						If (files(i).Timestamp >= LMDate) Then
'							FTPDOCSLIST.Add(files(i).Name)
'							Log(files(i).Name)
'						End If
'					End If
'				Next
'			End If
'		Else
'			Utils.ShowProcinLog("Main","FirstIntallCompleteProcedure","error getting files list from /docs/")
'		End If
'		
'		If (FTPDOCSLIST.IsInitialized) Then
'			If (FTPDOCSLIST.Size>=1) Then
'				TotalDocs = FTPDOCSLIST.Size-1
'				For i=0 To FTPDOCSLIST.Size-1
'					LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/docs/) ${i}/${TotalDocs}"$
'					Dim fName As String = FTPDOCSLIST.Get(i)
'					Log(fName)
'					Try
'						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & fName, False, Starter.InternalFolder, fName)
'						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
'				
'						If Success Then
'							Log("/docs/ : file was download successfully")
'						Else
'
'							Log("/docs/ : Error downloading file")
'						End If
'						'End If
'					Catch
'						Log(LastException)
'					End Try
'					UpdateProgressBar(TotalDocs,i)
'				Next
'			End If
'		
'		End If
'
'		'*****************************************************************************************
'		' DOWNLOAD DOS FICHEIROS NA PASTA DOCS/TEMPLATES/
'		'*****************************************************************************************
'		Log("************************************************************")
'		Log("/docs/templates")
'		Log("************************************************************")
'		UpdateProgressBar(100,0)
'		LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
'		Dim FTPTEMPLATESLIST As List
'		Dim TotalTemplates As Int = 0
'		
'		Dim sfl As Object = GlobalFTP.List("/" & ShareCode.APP_DOMAIN & "/docs/templates/")
'
'	
'		Wait For (sfl) FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, files() As FTPEntry)
'		If Success Then
'		
''			For l1 = 0 To Files.Length - 1
''				Log($"/docs/templates/ : ${Files(l1).Name}"$)
''			Next
'
'		
'			If (files.Length >= 1) Then
'				FTPTEMPLATESLIST.Initialize
'				For i = 0 To files.Length - 1
'					Dim fName2 As String = files(i).Name
'					If (fName2.EndsWith(".png")) Or (fName2.EndsWith(".jpg"))  Or (fName2.EndsWith(".jpeg"))  Or _
'						(fName2.EndsWith(".pdf"))  Or (fName2.EndsWith(".doc"))  Or (fName2.EndsWith(".docx"))  Or _
'						(fName2.EndsWith(".xls"))  Or (fName2.EndsWith(".xlsx"))  Or _
'						(fName2.EndsWith(".ppt")) Or (fName2.EndsWith(".pptx")) Or (fName2.EndsWith(".html")) Or _ 
'						Not((fName2.StartsWith("REPORT"))) Or (fName2.StartsWith("dictionary")) Then
'						FTPTEMPLATESLIST.Add(files(i).Name)
'					End If
'				Next
'			End If
'		Else
'			Utils.ShowProcinLog("Main","FirstIntallCompleteProcedure","error getting files list from /docs/templates/")
'		End If
'		
'		If (FTPTEMPLATESLIST.IsInitialized) Then
'			If (FTPTEMPLATESLIST.Size>=1) Then
'				TotalTemplates = FTPTEMPLATESLIST.Size-1
'				For i=0 To FTPTEMPLATESLIST.Size-1
'					LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/docs/templates/) ${i}/${TotalTemplates}"$
'					Dim fName2 As String = FTPTEMPLATESLIST.Get(i)
'					Log(fName2)
'					Try
'						Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/templates/" & fName2, False, Starter.InternalFolder, fName2)
'						Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
'				
'						If Success Then
'							Log("/docs/templates/ : file was download successfully")
'						Else
'
'							Log("/docs/templates/ : Error downloading file")
'						End If
'						'End If
'					Catch
'						Log(LastException)
'					End Try
'					UpdateProgressBar(TotalTemplates,i)
'				Next
'			End If
'		End If
		
		'*****************************************************************************************
		' DOWNLOAD DOS FICHEIROS NA PASTA /INTERNO
		'*****************************************************************************************
		Log("************************************************************")
		Log("/interno")
		Log("************************************************************")
		UpdateProgressBar(100,0)
		LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra
		Dim GlobalFTP As FTP
		GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		GlobalFTP.PassiveMode = True
		GlobalFTP.TimeoutMs = 240000
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
				For i=0 To FTPINTERNOLIST.Size-1
					LabelDownloadInicialFases.Text = ShareCode.MsgUpdateTitleDownloadDadosExtra & $"(/interno/) ${i}/${TotalTemplates}"$
					Dim fName2 As String = FTPINTERNOLIST.Get(i)
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
					UpdateProgressBar(TotalTemplates,i)
				Next
			End If
		End If
		GlobalFTP.Close
	
'		Dim res As ResumableSub = RemoveAllLocalInfoAndSqlFiles
'		Wait For(res) Complete (RemoveSuccessful As Boolean)

		'************************************************************************************************************
		' ACTUALIZA DE IMEDIATO AS STRINGS DOS DICTIONARY DESCARREGADOS DAS PASTA /DOCS/TEMPLATES/
		'************************************************************************************************************
		If Utils.NNE(ShareCode.UserLanguage) Then
			ShareCode.CheckTranslations(ShareCode.UserLanguage)
		Else
			ShareCode.CheckTranslations("PT")
		End If

		'*****************************************************************************************
		'LIBERTA O KEEPALIVE DURANTE A INSTALACAO INICIAL
		ShareCode.AwakeDevice(False)
		PanelFirstInstallConfig.Visible = False
		Return True
	Catch
			
		'*****************************************************************************************
		' Deu erro ! Por isso reinicia o serviço de localização e faz enable ao botao de Concluir
		'*****************************************************************************************
		Starter.StopLocationCheck = False
		StartService(LocationService)
		StartService(BackgroundUpdateService)
'		ButtonWelcomeNext.Enabled = True
		Starter.FirstInstall = True
		MsgboxAsync(LastException.Message, ShareCode.GeneralErrorTitle)
		Log(LastException)
		'*****************************************************************************************
		'LIBERTA O KEEPALIVE DURANTE A INSTALACAO INICIAL
		ShareCode.AwakeDevice(False)
		PanelFirstInstallConfig.Visible = False
		Return False
	End Try
End Sub


Sub UpdateProgressBar(MaxVal As Int, CurrentVal As Int)
	Dim CurrentVal As Int = (100 * CurrentVal / MaxVal)
	ProgressoInicial.Progress = CurrentVal
End Sub

Sub UpdateProgressBar2(MaxVal As Int, CurrentVal As Int)
	Dim CurrentVal As Int = (100 * CurrentVal / MaxVal)
	ProgressoInicial2.Progress = CurrentVal
End Sub



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



Sub GetBluetoothDevicesListDialog(title As String)
'	Dim cd As CustomLayoutDialog
'	cd.ShowAsync(title, "", "Cancelar", "", Null, False)
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(80%x, 80%y)
	End If

	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_bluetooth_devices") '_device_2")
	ListViewBluetoothDevices.SingleLineLayout.Label.TextSize=15
	ListViewBluetoothDevices.SingleLineLayout.Label.TextColor = Colors.Black
	ListViewBluetoothDevices.SingleLineLayout.ItemHeight=40dip
'	Printer.Initialize(Me,"Printer",Encoding.Windows1252)
	ButtonAssociated.Color = Consts.ColorMain
	ButtonScanPrinter.Color = Consts.ColorMain
	ButtonPrint.Color = Consts.ColorMain

	'Wait For CLVDialog_ItemClick (Index As Int, Value As Object)
	'cd.CloseDialog(DialogResponse.POSITIVE)
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		'CallSub2(activ, "SetResetPassword", mainEditLoginPassword.Text)
		'MsgboxAsync("Opção POSITIVA - " & CurrentTagcode, "Alerta!")
	Else
		'MsgboxAsync("A palavra chave não foi alterada, sendo a mesma obrigatória. A aplicação vai fechar.", "Alerta!")
		'CallSub(activ, "prc_AppClose")
	End If
End Sub

Sub Printer_ListPrinterAssociated (ListNameAndMac As Map)
	' Return a List of BT associated
	Try
		ListViewBluetoothDevices.Clear
		For I=0 To ListNameAndMac.Size-1
			ListViewBluetoothDevices.AddSingleLine2(ListNameAndMac.GetKeyAt(I),ListNameAndMac.GetValueAt(I))
			Log($"${ListNameAndMac.GetKeyAt(I)}, ${ListNameAndMac.GetValueAt(I)}"$)
		Next
	Catch
		Log(LastException)
	End Try
End Sub

Sub DialogReqRoute_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub Printer_DiscoveryNewPrinter (PrinterFound As Map, DeviceClass As Int)
	' Find new printer
	Try
		Log("DEVICE Class:" & DeviceClass)
		ListViewBluetoothDevices.AddSingleLine2(PrinterFound.GetKeyAt(0),PrinterFound.GetValueAt(0))
	Catch
		Log(LastException)
	End Try
End Sub

Sub Printer_DiscoveryFinished
	Log("Search End")
End Sub

Sub Printer_DiscoveryNoDeviceFound
	ToastMessageShow("Device not found",True)
End Sub


Sub Printer_ConnectedToPrint (Success As Boolean)
	' When is connect
	If Success Then
		ButtonPrint.Visible = True
		ToastMessageShow(PrinterMessage,False)
		ListViewBluetoothDevices.Clear
	Else
		ButtonPrint.Visible = False
		ToastMessageShow("Erro ao conectar a Impressora",False)
	End If
End Sub

Sub Printer_SendTerminated
	Log("Finish!!")
	'Printer.Close
End Sub

Sub ListViewBluetoothDevices_ItemClick (Position As Int, Value As Object)
	Try
		CurrentPrinterConnected = Value
		PrinterMessage = "Impressora Conectada"
		Printer.ClearBuffer
		
		If Not(File.Exists(Starter.InternalFolder,"xevolution_mono_logo.png")) Then
			If File.Exists(Starter.AssetsFolder,"xevolution_mono_logo.png") Then
				File.Copy(Starter.AssetsFolder,"xevolution_mono_logo.png",Starter.InternalFolder,"xevolution_mono_logo.png")
			End If
		End If
		
		Try
			Printer.AddBuffer_Bitmap(LoadBitmap(Starter.InternalFolder,"xevolution_mono_logo.png"),0)
			Printer.SendBufferToPrinter
		Catch
			
		End Try
		
'		Printer.AddBuffer_Writeline(ESC_POS.BoldOn & "ERGUELOP LDA" & ESC_POS.DoubleOff)
'		Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal & "Contribuinte: 507601190" & ESC_POS.FontA_Normal)
		Printer.AddBuffer_Writeline(ESC_POS.BoldOn & "XEVOLUTION LDA" & ESC_POS.DoubleOff)
		Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal & "- VRCG -" & ESC_POS.FontA_Normal)
		Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAssets,"barra_cinza.png"),0)
		For n=0 To 10
			Printer.AddBuffer_Writeline($"Linha de Teste ${n}"$)
		Next
'		Printer.AddBuffer_Writeline("GUIA DE REMESSA")
'		Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal & "Número: XXXXXX      Data: XXXX-XX-XX" & ESC_POS.FontA_Normal)
		Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAssets,"barra_cinza.png"),0)
		Printer.AddBuffer_Writeline("")
		Printer.AddBuffer_Writeline("")
		Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAssets,"barra_cinza.png"),0)
		Printer.SelectFromMac(Value)
		File.WriteString(Starter.InternalFolder,$"defultprinter.set"$, Value)
	Catch
		Log(LastException)
	End Try
End Sub

Sub ButtonAssociated_Click
	' connect to Associated Printer
	Try
		ListViewBluetoothDevices.Clear
		Printer.SelectFromAssociatedPrinter
	Catch
		Log(LastException)
	End Try
End Sub

'First
Sub ButtonScanPrinter_Click
	Private rp As RuntimePermissions
'	Scan For find Bluetooth Printer
	Try
		ListViewBluetoothDevices.Clear
		rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result = False Then
			ToastMessageShow("No permission...", False)
			Return
		End If
		
	Catch
		Log(LastException)
	End Try
	
	Try
		FindPrintersBT
	Catch
		Log(LastException)
	End Try
		
End Sub

Sub FindPrintersBT
	Printer.SearchNewPrinter
End Sub


Sub ButtonPrint_Click
	'Printer.
	Try
		If Not(Printer.Connected) Then
			PrinterMessage = "A Processar....."
			Printer.ClearBuffer
			Printer.AddBuffer_Writeline(ESC_POS.BoldOn & "X-Evolution" & ESC_POS.DoubleOff)
'		Printer.AddBuffer_Writeline("X-Evolution")
			Printer.AddBuffer_Writeline("VRCG")
			Printer.AddBuffer_Writeline("VRCG")
			''		Printer.AddBuffer_Writeline("")
'		Dim Image As Bitmap = LoadBitmap(File.DirAssets,"qr.jpg")
'		Printer.AddBuffer_Bitmap(Image,0)
			Printer.AddBuffer_Writeline("")
			Printer.AddBuffer_Writeline("")
			Printer.SelectFromMac(CurrentPrinterConnected)
			Sleep(2500)
		End If

		Printer.flushAllAndClose
	Catch
		Log(LastException)
	End Try
	
End Sub

'***********************************************************************************************************************************
' TIP: PESQUISA GLOBAL DE DADOS
'***********************************************************************************************************************************
Sub EditSearch_EnterPressed
	' NÃO FAZ NADA
End Sub

Sub EditSearch_FocusChanged (HasFocus As Boolean)
	' NÃO FAZ NADA
End Sub

'***********************************************************************************************************************************
' TIP: ACTION - PESQUISA GLOBAL DE DADOS
'***********************************************************************************************************************************
Sub butSearch_Click
	' NOTE: IDENTIFICA SE O CAMPO DE PESQUISA ESTÁ PREENCHIDO
	'		SE ESTIVER PREENCHIDO, APRESENTA JANELA (PANEL) COM A AÇÃO DE PESQUISA NA
	'		BASE DE DADOS LOCAL E APRESENTA TODA A INFORMAÇÃO AGRUPADA POR TIPO DE DADOS
	'		NOMEADAMENTE POR:
	'			INTERVENÇÕES (PESQUISA EM: TAGCODE|REFERENCIA|OBJECTO|ENTIDADE|CHECKLIST|TIPO DE INTERVENÇÃO|MORADA|TÉCNICO)
	'			OBJECTOS (PESQUISA EM: TAGCODE|REFERENCIA|TITULO|PARENT|MORADA|CAMPOS ADICIONAIS NIF)
	'			TIPOS INTERVENÇÃO/CHECKLISTS (TITULO)
	' NOTE: ESTA OPÇÃO PERMITIRÁ QUE O UTILIZADOR ACEDA DIRECTAMENTE AO REGISTO SELECCIONADO E PROCEDA DE ACORDO COM OS PARAMETROS:
	'		INTERVENÇÕES - ABRE/EXECUTA A INTERVENÇÃO (ENTRA EM INTERVENÇÕES E EXECUTA)
	'		OBJECTOS - VISUALIZA A FICHA DO OBJECTO SELECIONADO (ENTRA EM OBJECTOS E EDITA)
	'		TIPOS INTERVENÇÃO/CHECKLIST - CRIA E EXECUTA A INTERVENÇÃO (ENTRA EM TAREFAS E EXECUTA)
	' NOTE: ESTA OPÇÃO TAMBÉM PERMITIRÁ PESQUISAR PELOS RESPECTIVOS DADOS NO SERVIDOR CASO OS MESMOS NÃO ESTEJAM PRESENTES
	'		LOCALMENTE, PERMITINDO QUE O UTILIZADOR DESCARREGUE A RESPECTIVA INFORMAÇÃO DIRECTAMENTE POR AQUI.
	
	If Utils.NNE(EditSearch.Text) Then
		SearchPanel.visible = True
		ExpandListSearch.Clear
		EditSearchSearch.Text = EditSearch.Text
		
		Dim upl  As ResumableSub = MakeGlobalSearchData(EditSearch.Text)
		Wait For(upl) Complete (finish As Boolean)
		
'		ProgressDialogShow2("A pesquisar! Aguarde por favor ...", False)
'		Dim DaisCheck As Int = 15
'		Dim ClientDB As String = ""
'		
'		Dim SSQL As String = DBStructures.EVC_SQL_GLOBAL_SEARCH
'		SSQL = SSQL.Replace(":ClientDB.", ClientDB).Replace(":DAYSCHECK", DaisCheck).Replace(":FINDTEXT", EditSearch.Text)
'		Dim Resul
		
'		ProgressDialogHide    
	End If
End Sub

Sub MakeGlobalSearchData(textdata As String) As ResumableSub
		
	ProgressDialogShow2("A pesquisar! Aguarde por favor ...", False)
	Sleep(50)
	Dim DaisCheck As Int = 15
	Dim ClientDB As String = ""
	ProgressSearch.Visible= True
	
	Dim SSQL As String = DBStructures.EVC_SQL_GLOBAL_SEARCH
	SSQL = SSQL.Replace(":CLIENTDB.", ClientDB).Replace(":DAYSCHECK", DaisCheck).Replace(":FINDTEXT", textdata)
	Dim Result As ResultSet = Starter.LocalSQLEVC.ExecQuery(SSQL)
	Dim LastGrupo As Int = 0
	Dim chapter As B4XView
	Do While Result.NextRow
		Dim grupo As Int = Result.GetInt("grupo")
		If (Not(LastGrupo = grupo)) Then 
			LastGrupo = grupo
			Dim oTitle As String = $"Registos"$
			
			If (grupo =1) Then
				Dim oTitle As String = $"Intervenções"$
			else if (grupo=2) Then
				Dim oTitle As String = $"Objectos"$
			Else
				Dim oTitle As String = $"Tarefas"$
			End If
			
			Dim chapter As B4XView = CreateChapter(grupo, oTitle)
			ExpandListSearch.Add(chapter, grupo)
		End If
		
		Dim Item As B4XView = CreateChapterItem(grupo, Result)
		ExpandListSearch.Add(Item, grupo)
		
	Loop
	Result.Close
	ProgressSearch.Visible= False
	ProgressDialogHide
	Return True
	
End Sub
	
'	Private EditSearchSearch As EditText
'	Private butSearchSearch As Button
'	Private butSearchServer As Button
'	Private mainActiveUserSearch As Label
'	Private mainLogoSearch As ImageView
'	Private ProgressSearch As ProgressBar

' *************************************************************
' NOTE: VIEW DE CAPÍTULO
' *************************************************************
Sub CreateChapter(idx As Int, Title As String) As B4XView
	Dim height As Int = Utils.IntToDIP(70)
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("RecordGroupTitle")
	p.RemoveView
	RecordLineTitle.Text = $"${Title}"$
	p.Tag = $"${idx}"$
	Return p
End Sub

' *************************************************************
' NOTE: VIEW DE CAPÍTULO
' *************************************************************
Sub CreateChapterItem(idx As Int, Result As ResultSet) As B4XView
	Dim height As Int = Utils.IntToDIP(70)
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("RecordGroupItemRequest")
	p.RemoveView
	
	Dim tagcode As String = Result.GetString("tagcode")
	Dim execute_date As String = Result.GetString("execute_date")
	Dim execute_start As String = Result.GetString("execute_start")
	Dim reference As String = Result.GetString("reference")
	Dim entidade As String = Result.GetString("entidade")
	Dim objecto As String = Result.GetString("objecto")
	Dim tipointervencao As String = Result.GetString("tipointervencao")
	Dim tecnico As String = Result.GetString("tecnico")
	Dim tipoobjecto As String = Result.GetString("tipoobjecto")
	Dim morada1 As String = Result.GetString("morada1")
	Dim concelhodistrito1 As String = Result.GetString("concelhodistrito1")
	Dim georef1 As String = Result.GetString("georef1")
	Dim morada2 As String = Result.GetString("morada2")
	Dim concelhodistrito2 As String = Result.GetString("concelhodistrito2")
	Dim georef2 As String = Result.GetString("georef2")
	Dim morada3 As String = Result.GetString("morada3")
	Dim concelhodistrito3 As String = Result.GetString("concelhodistrito3")
	Dim georef3 As String = Result.GetString("georef3")
	
	Dim Title As String = $""$
	Dim SubTitle As String = $""$
	If (idx =1) Then
		Title = $"${execute_date} ${execute_start} - ${tipointervencao}, ${objecto}, ${reference}, (${tagcode}) "$
		If Utils.NNE(morada1) Then
			SubTitle = $"${morada1} ${concelhodistrito1} - (${georef1})"$
		else If Utils.NNE(morada2) Then
			SubTitle = $"${morada2} ${concelhodistrito2} - (${georef2})"$
		else If Utils.NNE(morada3) Then
			SubTitle = $"${morada3} ${concelhodistrito3} - (${georef3})"$
		End If
	else if (idx=2) Then
		Title = $"${objecto} - ${tipoobjecto}, ${reference}, (${tagcode})"$
		SubTitle = $"${morada1} ${concelhodistrito1} - (${georef1})"$
	Else
		Title = $"(${tagcode}) ${objecto}, ${reference}"$
	End If
	If Utils.NNE(SubTitle) Then
		Dim aaa As String = SubTitle.ToLowerCase
		If Not(aaa.Contains("a") Or aaa.Contains("e") Or aaa.Contains("i") Or aaa.Contains("o") Or aaa.Contains("u")) Then
			SubTitle = ""
		End If
	End If
	
	RecordLineMoreOptions.Tag = $"${tagcode}"$
	
	RecordLineTitle.Text = $"${Title}"$
	RecordLineTitle.tag = $"${tagcode}"$
	RecordLineTitleSecond.Text = $"${SubTitle}"$
	RecordLineTitleSecond.tag = $"${tagcode}"$
	p.Tag = $"${idx}|${tagcode}"$
	Return p
End Sub

Sub butActionSearch_Click
	'butActionSearch
	Dim bbut As Button = Sender
	If Utils.NNE(bbut.Tag) Then
		Dim lst As List = Regex.Split("\|", bbut.tag )
		If (lst.Size > 1) Then
			If (lst.Get(0)="1") Then
				'Intervenções
				Log(lst.Get(1))
			else if (lst.Get(0)="2") Then
				'Objectos
				Log(lst.Get(1))
			else if (lst.Get(0)="3") Then
				'Tarefas
				Log(lst.Get(1))
			End If
		End If
	End If
End Sub

Sub butSearchServer_Click
	
End Sub

Sub butSearchSearch_Click
	If Utils.NNE(EditSearchSearch.Text) Then
		ExpandListSearch.Clear
		Dim upl  As ResumableSub = MakeGlobalSearchData(EditSearchSearch.Text)
		Wait For(upl) Complete (finish As Boolean)   
	End If
End Sub


Sub butCloseSearchPanel_Click
	SearchPanel.Visible = False
	butActionSearch.Tag = ""
	EditSearch.Text=""
End Sub

Sub ExpandListSearch_ItemClick (Index As Int, Value As Object)
	Dim panel As B4XView = ExpandListSearch.GetPanel(Index)
	Dim valStr As String = panel.Tag
	If Utils.NNE(valStr) Then
		If (Not(valStr = "1") And Not(valStr = "2") And Not(valStr = "3")) Then
			butActionSearch.Tag = valStr
			
		End If
	End If
End Sub

Sub RecordLineMoreOptions_Click
	
End Sub

Sub butSearchClear_Click
	ExpandListSearch.Clear
	EditSearchSearch.Text = ""
	EditSearch.Text = ""
	butActionSearch.Tag = ""
End Sub

Sub MainPopMenuList_ItemClick (Position As Int, Value As Object)

	MainPopMenuList.Visible = False
	Select Case Value
		Case "MainPopMenuSync"
			MainPopMenuSync_Click(Value)
		Case "MainDataValidation"
			MainDataValidation_Click(Value)
		Case "MainPopMenuCompany"
			MainPopMenuCompany_Click(Value)
		Case "MainPopMenuPushRequest"
			MainPopMenuPushRequest_Click(Value)
		Case "MainPopMenuLoginChange"
			MainPopMenuLoginChange_Click(Value)
		Case "MainDeviceInfoPopMenu"
			MainDeviceInfoPopMenu_Click(Value)
		Case "MainUpdateAPK"
			MainUpdateAPK_Click(Value)
		Case "MainDevicePrint"
			MainDevicePrint_Click(Value)
		Case "MainPopMenuExit"
			MainPopMenuExit_Click(Value)
	End Select
	
End Sub