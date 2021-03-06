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

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	'Private MarkMyPosition As BalloonMarker
	Public Device As Phone
	
	Private TileSource As String
	Private ZoomLevel As Int
	Private Markers As List
	Private MapFirstTime As Boolean
	
	Private MyPositionLat, MyPositionLon As String
	Private CurrentTabPage As Int = 0
	Private InfoDataWindows As Boolean = False
End Sub

Sub Globals
	Private Icon As BitmapDrawable
	Private xui As XUI
	'Private MapViewArea As MapView
	Private TileSourceSpinner As Spinner
	'Private MarkersBallons As MarkersBalloonOverlay
	Private IsFiltered As Boolean = False
	Private FilterStartDate As String
	Private FilterEndDate As String
	Private FilterTasks As Int = 0
	Private FilterEntity As Int = 0
	Private FilterRoute As Int = 0
	Private FilterStates As Int = 0
	Private FilterTypeRequests As Int = 0
	Private Bloco30 As Int = 0
	
	Private ListTypeRequests As List
	Private ListStates As List
	Private ListEntities As List
	Private ListTasks As List
	Private ListRoutes As List
	
	Private ButtonUserUnavailable As Button
	Private mapUserPosition As Button
	Private ColorTabPanel As Panel

	Private ButtonActionTransport As Button
	Private ButtonAppAlert As Button
	Private ButtonAppNetwork As Button
	Private LabelAppInfo As Label
	Private LabelCopyright As Label
	Private LabelDateTime As Label
	Private LabelVersion As Label
	Private listsBasePanel As Panel
	Private listsBottomLine As Panel
	Private listsBottomPanel As Panel
	Private listsButtonClose As Button
	Private listsButtonFilter As Button
	Private listsLabelInfo As Label
	Private listsTabPanel As TabStrip
	Private listsTopBar As Panel
	Private mainLabelOptLists As Label
	Private mainLogo As ImageView
	Private mainTopLine As Panel
	
	Private IsFiltered As Boolean = False
	Private iDialogReqTypeObject, iDialogReqZone, iDialogReqStatus, iDialogReqRegion, iDialogReqLocal, iDialogReqWithRequests As Int
	Private sDialogReqName, sDialogReqAddress, SearchFilter As String
	Private RegionsList, TypeObjectsList, LocalsList, ReqRequests, ReqRequestsNotToday As List
	Private ItemsCounter As Int = 0

	Private listRequestsButtonMap As Button
	Private mapBaseList As Panel
	Private mapBasePanel As Panel
	'Private mapData As Panel
	Private mapZoomDown As Button
	Private mapZoomUp As Button
	Private listRequests As CustomListView 'ExpandedListView ' CustomListViewCollapse
	Private listsRequestsMap As CustomListView
	
	Private pnlGroupTitle As Panel
	Private pnlGroupData As Panel
	
	Private ListItemTodayRequests As Label
	Private ListItemReference As Label
	Private ListItemDatetime As Label
	Private ListItemContact As Label
	Private ListItemFullName As Label
	Private ListItemStatus As Label
	Private listButMap As Button
	
	Private ListItemObject As Label
	Private ListItemObjectTask As Label
	Private ListItemObjectExecution As Label
	Private listButObjectAction As Button
	Private ListItemObjectStatus As Label
	Private ListItemObjectStatusIcon As Label
	
	Private CurrentGroupItem As Int = 0
	Private pnlGroupCurrenIndex As Int
	Private ClickLabel As Label
	'Private ListItemType As Label
	Private ShowListPedidosMap As Boolean = False
	Private EditSearch As EditText
	Private butSearch As Button
	
	Dim CurrentIndexPanel As Int = -1
	Dim CurrentIDPanel As Int = 0
	
	Private LabelButtonTitleAction As Label
	Private LabelReferenciasDescritivos As Label
	Private LabelStatus As Label
	Private RequestsOptionsPopMenu As MenuOnAnyView
	
	Private CurrentLineItem As Int = 0
	Private TotalLineItems As Int = 0
	Private ListItemObjectNumber As Label
	Private listButMore As Button
	Private ListItemObjectDateTime As Label
	Private ListItemObjectReference As Label
	Private pnlGroupDataSub As Panel
	Private pnlGroupDataList As ExpandedListView 'CustomListViewCollapse
	'Private listsTabPanel2 As AHViewPager
	
	Private CurrentPage As Int
	Private Pages As List '= Array(True, False, True, True)
	'Private listRequestsItem As ExpandedListView
	Private listRequestsItem As CustomListView
	Private CLAButtonOptions As Button
	Private CLAItem_G1 As Label
	Private CLAItemButton_1 As B4XStateButton
	Private CLAItemButton_2 As B4XStateButton
	Private CLAItem_G2 As Label
	Private CLAItem_G3 As Label
	Private CLAItem_G4 As Label
	Private CLAItem_G5 As Label
	Private CLAItem_G6 As Label
	Private CLAItem_G7 As Label
	Private ListItemType As Label
	
	Private ListItem_Notes As Label
	Private ListItem_Status As Label
	Private ListItem_Datetime As Label
	Private ListItem_Entity As Label
	Private ListItem_Cloud As Label
	Private listButCompare As Button
	Private ListItem_TypeRequest As Label
	Private listRequestsItemSecond As CustomListView
	Private CLAItemButtonBR_SVR2 As B4XStateButton
	Private CLAItemButtonBR_SVR2_A As Button
	Private CLA_BR_KSVRF2 As FloatLabeledEditText
	Private CLA_BR_KSVRF2_A As Button
	Private CLA_BR_KSVRI2 As FloatLabeledEditText
	Private CLA_BR_KSVRI2_A As Button
	Private CLA_BR_KSVRI1_A As Button
	Private CLA_BR_KSVRI1 As FloatLabeledEditText
	Private CLA_BR_KSVRF1 As FloatLabeledEditText
	Private CLA_BR_KSVRF1_A As Button
	Private CLAItemButtonBR_SVR1 As B4XStateButton
	Private CLAItemButtonBR_SVR1_A As Button
	Private CLAItemButtonBR_INIT_A As Button
	Private CLAItemButtonBR_INIT As B4XStateButton
	Private CLA_BR_OBS As FloatLabeledEditText
	Private CLA_BR_OBS_A As Button
	Private CLA_BR_KMI_A As Button
	Private CLA_BR_KMI As FloatLabeledEditText
	Private CLA_BR_CAR As FloatLabeledEditText
	Private CLA_BR_CAR_A As Button
	Private CLA_BR_KMF_A As Button
	Private CLA_BR_KMF As FloatLabeledEditText
	Private CLA_BR_E1 As FloatLabeledEditText
	Private CLA_BR_S1 As FloatLabeledEditText
	Private CLA_BR_E2 As FloatLabeledEditText
	Private CLA_BR_S2 As FloatLabeledEditText
	Private CLA_BR_E3 As FloatLabeledEditText
	Private CLA_BR_S3 As FloatLabeledEditText
	Private CLAItemButtonBR As B4XStateButton
	Private CLAItemButtonBR_A As Button
	Private CLAItemButtonX_A As Button
	Private B4XStateButton1 As B4XStateButton
	Private B4XStateButton2 As B4XStateButton
	Private B4XStateButton3 As B4XStateButton
	Private B4XStateButton4 As B4XStateButton
	Private B4XStateButton5 As B4XStateButton
	Private B4XStateButton6 As B4XStateButton
	Private B4XStateButton7 As B4XStateButton
	Private B4XStateButton14 As B4XStateButton
	Private B4XStateButton13 As B4XStateButton
	Private B4XStateButton21 As B4XStateButton
	Private B4XStateButton20 As B4XStateButton
	Private B4XStateButton19 As B4XStateButton
	Private B4XStateButton12 As B4XStateButton
	Private B4XStateButton11 As B4XStateButton
	Private B4XStateButton18 As B4XStateButton
	Private B4XStateButton17 As B4XStateButton
	Private B4XStateButton10 As B4XStateButton
	Private B4XStateButton9 As B4XStateButton
	Private B4XStateButton16 As B4XStateButton
	Private B4XStateButton15 As B4XStateButton
	Private B4XStateButton8 As B4XStateButton
	Private B4XStateButton22 As B4XStateButton
	Private B4XStateButton23 As B4XStateButton
	Private B4XStateButton24 As B4XStateButton
	Private B4XStateButton25 As B4XStateButton
	Private B4XStateButton26 As B4XStateButton
	
	Private VIEW_requests_listview As String = "requests_listview"
	Private VIEW_requests_listviewrequest As String = "requests_listviewrequest"
	Private VIEW_requests_listviewrequest2 As String = "requests_listviewrequest2"
	Private VIEW_requests_mapview As String = "requests_mapview_google"
	Private ButtonActionPause As Button
	Private CurrentFilter As String = ""
	Private mainActiveUser As Label
	Private gmap As GoogleMap
	Private mapData As MapFragment
	Private mapMarker As Marker
	Private listsButtonPull As Button
	Private listButNote As Button
	Private butQuickAction As Button
	Private ListItem_Favorite As Label
	Private listsButtonFavorites As Button
	Private ListItem_Desc02 As Label
	Private ListItem_Desc01 As Label
	Private ListaPrincipalClickItem As Int = -1
	Private ListViewDevice3Panel As Panel
	Private ListViewRequestDevice3Panel As Panel
	Private ListViewRequest2Device3Panel As Panel
	Private ListItemClickIndex As Label
	Private ListItem_Desc00 As Label
	Private SubItemImage As ImageView
	Private LockPanel As Panel

	Private GRANDACTIVE_INSTANCE As String = "PT20180913-2105-006"
	Private LockPanelInfo As Label
	
	Private current_limit As Int = 0
	Private current_offset As Int = 100
	Private next_current_limit As Int = 0
	Private next_offset As Int = 100
	Private CurrentTotalItems As Int = 0
	
	Private SelectedTagcode As String = ""
	Private SelectedRequestData As RequestData 
	Private ListItemNumber As Label
	
	Private data_Intervencao As FloatLabeledEditText
	Private hora_intervencao As FloatLabeledEditText
	Private TaskList2Dup As CustomListView
	Private BotaoDataDup As Button
	Private BotaoHoraDup As Button
	Private dupItemCheck As CheckBox
	Private dupItemLabel As Label
	
	Private ListITemTechnical As Label
	Private GlobalScanReturn As Boolean
End Sub

'
'MakeRequestCLA(Request As String, Task As String, Item As String, UniqueKey As String, Answer As String, Value As String) As RequestCLA
'MakeRequestCLAItem(Request As String, Task As String, Item As String, UniqueKey As String, Answer As String, Value As String, Origin as Int) As RequestCLAItem

Sub Activity_Create(FirstTime As Boolean)
'	ProgressDialogShow2("A carregar lista ...", False)
	ListStates.Initialize
	'Private ListEntities As List
	ListTypeRequests.Initialize
	ListEntities.Initialize
	ListTasks.Initialize
	ListRoutes.Initialize
	Markers.Initialize
	
	CurrentTabPage = 0
	current_limit = 0
	current_offset = 100
	next_current_limit = 0
	
	Starter.CurrentWorkActivity = Me
	Dim userPage As String = "requestslayout"
	userPage  = "requestslayout_device_2"
	
	
	
	'requests_listview_device_3
	VIEW_requests_listview = $"${VIEW_requests_listview}_device_3"$
	VIEW_requests_listviewrequest = $"${VIEW_requests_listviewrequest}_device_3"$
	VIEW_requests_listviewrequest2 = $"${VIEW_requests_listviewrequest2}_device_3"$
	
	Private VIEW_requests_listview As String = "requests_listview_device_3"
	Private VIEW_requests_listviewrequest As String = "requests_listviewrequest_device_3"
	Private VIEW_requests_listviewrequest2 As String = "requests_listviewrequest2_device_3"
	Private VIEW_requests_mapview As String = "requests_mapview_google"
	
	'requests_listview
	
	If (ShareCode.ISPHONE) Then
		ShareCode.DEVICE_ORIENTATION = 1
		Device.SetScreenOrientation(1)
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
		Private Pages As List = Array(True, False, False, True)
	Else
		ShareCode.DEVICE_ORIENTATION = 0
		Device.SetScreenOrientation(0)
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
		Private Pages As List = Array(True, False, False, True)
	End If
		
	'prvd.Initialize
	Activity.LoadLayout(userPage)
	
'	Dim GDrawable As GradientDrawable
'	GDrawable.Initialize("TOP_BOTTOM", Array As Int(Consts.ColorMain, Consts.ColorMainDarker))
'	ColorTabPanel.Background = GDrawable
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
'	If Not(ShareCode.ISPHONE) Then
'		listsTabPanel.LoadLayout(VIEW_requests_listview, "Listagem")
'		listsTabPanel.LoadLayout(VIEW_requests_listviewrequest, "Intervenção")
'		listsTabPanel.LoadLayout(VIEW_requests_listviewrequest2, "Intervenção")
'		listsTabPanel.LoadLayout(VIEW_requests_mapview, "Mapa")
'	Else
	listsTabPanel.LoadLayout(VIEW_requests_listview, ShareCode.requestslistview)
	listsTabPanel.LoadLayout(VIEW_requests_listviewrequest, ShareCode.Requestslistviewrequest)
	listsTabPanel.LoadLayout(VIEW_requests_listviewrequest2, ShareCode.Requestslistviewrequest)
	listsTabPanel.LoadLayout(VIEW_requests_mapview, ShareCode.requestsMapview)
'
'	End If

	
'	Update Tap Colors To ColorMain	
	Utils.SetViewBackgroundColorToMainColor(ListViewDevice3Panel)
	Utils.SetViewBackgroundColorToMainColor(ListViewRequestDevice3Panel)
	Utils.SetViewBackgroundColorToMainColor(ListViewRequest2Device3Panel)
	Utils.SetButtonBackgroundColorToMainColorWithRadius(butQuickAction, 100)

	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		If Not(ShareCode.ISPHONE) Then
			lbl.Width = 25%x '33.33%x
		Else
			lbl.Width = 50%x
		End If
	Next
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
	Bloco30 = Activity.Width / 3
	If FirstTime Then
		'
	End If
	listsButtonFavorites.Visible = (ShareCode.DEVICE_PARAM_FAVORITES = 1)
	
	ListStates = DBStructures.GetListOfFromEVC("type_statustypes", "tagdesc")
	Dim MyDate As String = Utils.GetCurrentDateFormat("yyyy-MM-dd")
'	Log(MyDate)
	Dim where As String = $"select distinct tagcode from dta_requests where execute_date='${MyDate}'"$
	
'	Log(where)
	ReqRequests = DBStructures.GetListOfFromScriptEVC("tagcode", where)
	
	Dim s As String = Utils.StrList2SQLArray(ReqRequests)
	
	
	Dim sSQL As String = $"select distinct x.tagcode, x.object_tagcode, x.title, x.details from
							(select a.request_tagcode as tagcode, b.object_tagcode, c.title_import as title, c.details
								from dta_requests_relations as a
								inner join dta_requests as b on (b.tagcode=a.request_tagcode and b.is_child=0)
								inner join dta_objects as c on (c.tagcode=b.object_tagcode)
								where a.relation_tagcode in (select tagcode from dta_tasks)
								UNION
								select a.request_tagcode as tagcode, b.object_tagcode, c.title_import as title, c.details
								from dta_requests_relations as a
								inner join dta_requests as b on (b.tagcode=a.request_tagcode and b.is_child=1)
								inner join dta_objects as c on (c.tagcode=b.object_tagcode)
							) as x
							where x.tagcode in ${s}"$
							
	If (ShareCode.APP_DOMAIN.ToLowerCase = "printcriativa") Then
		
		Dim sSQL As String = $"select distinct x.tagcode, x.object_tagcode, x.title, x.details, x.fieldval_01 from
							(select a.request_tagcode as tagcode, b.object_tagcode, c.title_import as title, c.details, d.fieldval_01
								from dta_requests_relations as a
								inner join dta_requests as b on (b.tagcode=a.request_tagcode and b.is_child=0)
								inner join dta_objects as c on (c.tagcode=b.object_tagcode)
								inner join dta_requests_adds as d on (d.request_tagcode=b.tagcode)
								where a.relation_tagcode in (select tagcode from dta_tasks)
								UNION
								select a.request_tagcode as tagcode, b.object_tagcode, c.title_import as title, c.details, d.fieldval_01
								from dta_requests_relations as a
								inner join dta_requests as b on (b.tagcode=a.request_tagcode and b.is_child=1)
								inner join dta_requests_adds as d on (d.request_tagcode=b.tagcode)
								inner join dta_objects as c on (c.tagcode=b.object_tagcode)
							) as x
							where x.tagcode in ${s} order by x.fieldval_01"$
	End If
							

										
							
	ListEntities = DBStructures.GetListOfFromScriptCNLEVC("object_tagcode", "title", sSQL)
	
	Dim sSQL As String = $"select distinct e.tagcode, e.title
							from dta_requests as a 
							inner join dta_tasks As e on (e.tagcode in (Select relation_tagcode from dta_requests_relations)) 
							where a.tagcode in ${s}"$
	ListTasks = DBStructures.GetListOfFromScriptCNLEVC("tagcode", "title", sSQL)
	
	Dim where As String = $"select distinct tagcode from dta_requests 
							where execute_date<>'${ShareCode.CURRENT_APPDATE}' and tagcode not in ${s}"$
	ReqRequestsNotToday = DBStructures.GetListOfFromScriptEVC("tagcode", where)
	ListRoutes = DBStructures.GetListOfFromScriptCNLEVC("tagcode", "title", $"select * from dta_routes"$)
	ListTypeRequests = DBStructures.GetListOfFromScriptCNLEVC("tagcode", "title", $"select * from dta_typerequests where active=1"$)

	UpdateMainLayout
	UpdateTabPages
	
	mainLabelOptLists.Text = ShareCode.MainOption_Request.ToUpperCase
	EditSearch.Hint = ShareCode.requestsEditSearch
	LabelButtonTitleAction.text=ShareCode.requestsLabelButtonTitleAction
	LabelReferenciasDescritivos.text=ShareCode.requestsLabelReferenciasDescritivos
	LabelStatus.text=ShareCode.requestsLabelStatus
	Sleep(50)
	
End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
'	If Not(ShareCode.ISPHONE) Then
'		Try
'			FocusedMarker=MarkersBallons.FocusedMarker
'			MapCenter=MapViewArea.GetCenter
'			TileSource=MapViewArea.GetTileSource
'			ZoomLevel=MapViewArea.Zoom
'		Catch
'			Log(LastException)
'		End Try
'	End If
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		listsButtonClose_Click
	End If
	Return True
End Sub

Sub TabPageState(pageIndex As Int, pageState As Boolean)
	If pageIndex > = 0 Then
		Pages.Set(pageIndex, pageState)
	End If
	
	UpdateTabPages
End Sub

Sub UpdateTabPages
	Dim lst As List = Utils.GetAllTabLabels(listsTabPanel)
	For n = 0 To lst.Size-1
		Dim lbl As Label = lst.Get(n)
		If (Pages.Get(n) = True) Then
			lbl.TextColor = Colors.White
		Else
'			lbl.TextColor = Consts.ColorMain
			lbl.TextColor = Colors.ARGB(0,255,255,255)
'			lbl.TextColor = Colors.ARGB(255,200,0,0)
'			lbl.TextColor = Colors.ARGB(255,0,155,255)
		End If
	Next
End Sub


Sub listsTabPanel_PageSelected (Position As Int)
	If Not(ShareCode.ISPHONE) Then	

	Dim FixedPosition As Int = -1
	If Pages.Get(Position) = False Then
		Dim direction As Int = Position - CurrentPage
		Dim i As Int = Position + direction
		Do While i >= 0 And i < Pages.Size
			If Pages.Get(i) = True Then
				FixedPosition = i
				Exit
			End If
			i = i + direction
		Loop
		If FixedPosition = -1 Then FixedPosition = CurrentPage
	Else
		FixedPosition = Position
	End If
	CurrentPage = FixedPosition
'	Log($"pagina: ${CurrentPage}"$)
	listsTabPanel.ScrollTo(FixedPosition, True)
	If Not((CurrentPage = 1)) Then
		TabPageState(1, False)
	End If
	If Not((CurrentPage = 2)) Then
		TabPageState(2, False)
	End If
	Log($"pagina: ${CurrentPage}"$)
	
	End If
End Sub

Sub UpdateMainLayout
	mainLabelOptLists.TextColor = Consts.ColorMain
	If Not(ShareCode.ISPHONE) Then
		mainLogo.Gravity = Gravity.FILL
		mainLogo.Width = Consts.LogoWidth
	End If
	Log($"Inicialização de BMP: ${ShareCode.APP_MAIN_LOGO_MINI}"$)
	If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then
		mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO_MINI))
	End If
'	Dim gc As GradientDrawable
'	gc.Initialize("TOP_BOTTOM", Array As Int(Consts.ColorMain, Consts.ColorSub))
'	ColorTabPanel.Background = gc
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
	Dim jo As JavaObject = listsTabPanel
	jo = jo.GetField("tabStrip")
	'now you can set the properties
	jo.RunMethod("setIndicatorColor", Array(Consts.ColorMain))
End Sub

Sub StartRequestActivity(Clear As Boolean, Filter As String)
	
	ProgressDialogHide
	ProgressDialogShow2(ShareCode.GeneralLoadingMessage, False)
	
	CurrentFilter = Filter
	
	If (ShareCode.DEVICE_PARAM_FAVORITES = 1) Then
		If (Starter.RequestFavorites = 1) Then
			listsButtonFavorites.TextColor = 0xFFF00000
		Else
			listsButtonFavorites.TextColor = 0xFF555555
		End If
	End If
		
	If Clear Then
		Try
			listRequests.Clear
			If Not(ShareCode.ISPHONE) Then
				listsRequestsMap.Clear
				Markers.Clear
'					MarkersBallons.RemoveMarkers
'					Markers.Add( MarkMyPosition )
			End If
		Catch
			Log(LastException)
		End Try
	End If
		
	Private Row As Int = 0
	
	ItemsCounter = 0
'		
'		ShareCode.DEVICE_ONLY_TECHORUSER = DBStructures.getParamState("DEVICE_ONLY_TECHORUSER")
'		ShareCode.DEVICE_DEFAULT_ROUTE = DBStructures.getParamState("DEVICE_DEFAULT_ROUTE")

	ShareCode.SESS_UserTeam = DBStructures.SetUserTeamDate(ShareCode.SESS_User, ShareCode.APPDATE_STARTRANGE, ShareCode.APPDATE_ENDRANGE)
	ShareCode.SESS_UserRoute = DBStructures.SetUserRouteDate(ShareCode.SESS_User, ShareCode.APPDATE_STARTRANGE, ShareCode.APPDATE_ENDRANGE)
		
'		Log(ShareCode.SESS_UserTeam)
'		Log(ShareCode.SESS_UserRoute)
		
		
	Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_NEW
	'sSQL = $"${sSQL} And ((a.technical_tagcode='${ShareCode.SESS_OPER_User}') or (a.team_tagcode in (select tagcode from dta_teams_relations where relation_tagcode='${ShareCode.SESS_OPER_User}')))"$
	
	If (Filter = "0") Then Filter =""
		
	If (Filter <> "") Then
		sSQL = $"${sSQL} ${Filter}"$
	End If
	
	Log(sSQL)
	Log(Filter)
	
	Dim TechUser As String = ""
	Dim RouteFilter As String = ""
		
	If (Utils.Int2Bool(ShareCode.DEVICE_DEFAULT_ROUTE)) And (Utils.NNE(ShareCode.SESS_UserRoute)) Then
		RouteFilter = $" and (a.route_tagcode in (${ShareCode.SESS_UserRoute})) "$
	End If
		
	If (Utils.Int2Bool(ShareCode.DEVICE_ONLY_TECHORUSER)) Then
		If Utils.NNE(ShareCode.SESS_UserTeam) Then
			TechUser = $" and (((a.technical_tagcode='${ShareCode.SESS_User}') or (a.team_tagcode in (${ShareCode.SESS_UserTeam}))) ${RouteFilter})"$
		Else
			TechUser = $" and ((a.technical_tagcode='${ShareCode.SESS_User}') ${RouteFilter}) "$
		End If
		RouteFilter = Utils.IfNotNullOrEmpty(RouteFilter, "")
	End If
		
		
	If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL)) Then
			
		Dim DateControl As String = $"and (((a.execute_date>='${ShareCode.APPDATE_STARTRANGE}') or (a.execute_enddate>='${ShareCode.APPDATE_STARTRANGE}'))
										and ((a.execute_date<='${ShareCode.APPDATE_ENDRANGE}') or (a.execute_enddate<='${ShareCode.APPDATE_ENDRANGE}')))"$
	Else
			
		Dim DateControl As String = $"and ((a.execute_date>='${ShareCode.APPDATE_STARTRANGE}')
										and (a.execute_date<='${ShareCode.APPDATE_ENDRANGE}'))"$
										

		If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW)) Then
			Dim cDate As String = Utils.GetCurrentDate
			Dim CurrDateControl As String = $"('${cDate}'>='${ShareCode.APPDATE_STARTRANGE}')
											And ('${cDate}'<='${ShareCode.APPDATE_ENDRANGE}')"$
			Dim DateControl As String = $"and (((a.execute_date>='${ShareCode.APPDATE_STARTRANGE}')
										and (a.execute_date<='${ShareCode.APPDATE_ENDRANGE}')) or 
										((a.execute_date<>a.execute_enddate) and (a.execute_enddate='${cDate}') and (${CurrDateControl}))
										)"$
		End If
	End If
	Log($" ${TechUser} ${RouteFilter}
				and ((a.execdate_type>=1) or ((a.execdate_type=0) 
				${DateControl})) 
				order by a.execute_date, a.execute_start
				limit ${current_limit}, ${next_offset}"$)
				
	If (ShareCode.APP_DOMAIN.ToLowerCase = "printcriativa") Then
		sSQL = $"${sSQL} ${TechUser} ${RouteFilter}
				and ((a.execdate_type>=1) or ((a.execdate_type=0) 
				${DateControl})) 
				order by a.execute_date, fieldval_01
				limit ${current_limit}, ${next_offset}"$
		
	Else
		sSQL = $"${sSQL} ${TechUser} ${RouteFilter}
				and ((a.execdate_type>=1) or ((a.execdate_type=0) 
				${DateControl})) 
				order by a.execute_date, a.execute_start
				limit ${current_limit}, ${next_offset}"$
	End If
				
	Log("««««««««««««««««««««««««««««««««««««« ------------ »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»")

	CurrentTotalItems = current_limit + current_offset
	next_offset = current_offset
	Sleep(250)
	
	Private Record As Cursor
	
	Log("Query dos REQUESTS")	
'	Log("BEGIN : " & Utils.GetCurrDatetimeExt)
	Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
	TotalLineItems = Record.RowCount
'	Log(TotalLineItems)
'	Log("END : " & Utils.GetCurrDatetimeExt)
	
	CurrentLineItem = 0

	If TotalLineItems < current_offset Then
		next_current_limit = current_limit
	Else
		next_current_limit = current_limit + current_offset
	End If

	If TotalLineItems > 0 Then
		Sleep(200)
		Dim LastDate As String = ""
		For Row = 0 To TotalLineItems-1 ' Record.RowCount-1
			Record.Position = Row
			Dim status_id As Int = Record.GetInt("status_id")
'			Log(status_id)
'				Dim status_color As String = Record.GetString("status_color")
			Dim aaa As String = Utils.IfNullOrEmpty(Record.GetString("nameobject2"), "_")
			
			If Utils.Int2Bool(ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER) Then
				Dim execute_date As String = Utils.IfNullOrEmpty(Record.GetString("execute_date"), "")
				If (Utils.NNE(execute_date)) Then
					If Not(LastDate = execute_date) Then
						LastDate = execute_date
						CreateRequestGroupItem(ItemsCounter, LastDate, listRequests.AsView.Width)
					End If
				End If
			End If
			ItemsCounter = CreateRequestItem(ItemsCounter, Record, listRequests.AsView.Width, 90dip, Null)
			
			If Not(ShareCode.ISPHONE) Then
				If (status_id < 5) Then
					Dim name As String = Record.GetString("name")
					Dim latitude As String = Record.GetString("latitude")
					Dim longitude As String = Record.GetString("longitude")
					Dim tagcode As String = Record.GetString("tagcode")
					'Private thisMarker As Marker = gmap.AddMarker(latitude, longitude, name)
					'Markers.Add( thisMarker )
					If Not(Utils.isNullOrEmpty(latitude)) And Not(Utils.isNullOrEmpty(longitude)) Then
						If gmap.IsInitialized Then
'								mapMarker = gmap.AddMarker(latitude, longitude, name)
							Dim mColor As Int = Consts.ColorGreen
							If (status_id = 1) Then
								mColor = Consts.ColorGreen
							Else If (status_id = 2) Then
								mColor = Consts.ColorYellow
							Else If (status_id = 3) Then
								mColor = Consts.ColorBlue
							else if (status_id = 4) Then
								mColor = Consts.ColorRed
							Else If (status_id = 5) Then
								mColor = Consts.ColorGray
							End If
							mapMarker = gmap.AddMarker3(latitude, longitude, name, CreateBitmapPIN(ItemsCounter+1, mColor, 4dip, 35dip))
							mapMarker.Snippet = tagcode
							Markers.Add( mapMarker )
						End If
						listsRequestsMap.Add( CreateRequestItemMap(ItemsCounter, Record, 0, listsRequestsMap.AsView.Width, 70dip, mColor), "") ', 70dip, "" )
					Else
						
					End If
				End If
			End If
			ItemsCounter = ItemsCounter + 1
			
		Next
		ProgressDialogHide
	End If
'		Log($"DEVOLVE:${n}"$)
	Record.Close
'		Log(ItemsCounter)
	WindowStatusUpdate
'	End If
	ProgressDialogHide
End Sub

Sub CreateRequestGroupItem(cnt As Int, theTitle As String, Width As Int) As Int
	Dim ret As Int = 0
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 45dip
	id.ExpandedHeight = 45dip
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, Width, id.ExpandedHeight)
	p.LoadLayout("requests_listgroupview_separator")
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	If(ShareCode.ISPHONE) Then
		p.Height = id.ExpandedHeight   '200dip
	End If
	p.Tag = "__NONE__"
	ListItem_Desc00.Text = theTitle
	ListItem_Desc00.tag = "__NONE__"
	listRequests.Add(p, id)
	ret = cnt 'ret +1

	Return ret
End Sub


Sub CreateRequestItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable) As Int
'	Log(Height)
	Dim ret As Int = 0
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 105dip
	id.ExpandedHeight = 105dip
	
'	Dim inVIEW_requests_listgroupview As String = "requests_listgroupview"
	Dim inVIEW_requests_listgroupview As String = "requests_listgroupview_new" '"requests_listgroupview"
	'inVIEW_requests_listgroupview = "requests_listgroupview_new" '"requests_listgroupview_device_3"
	If (ShareCode.ISPHONE) Then
'		inVIEW_requests_listgroupview = "requests_listgroupview_device_3"
		id.CollapsedHeight = 150dip '345dip
		id.ExpandedHeight = 150dip '345dip
'		Height  = 220dip '325dip
		inVIEW_requests_listgroupview = "requests_listgroupview_device_3_phone"
	Else
'		inVIEW_requests_listgroupview = "requests_listgroupview_device_3"
		inVIEW_requests_listgroupview = "requests_listgroupview_new"
	End If
	
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim mapPin As Boolean = Not(Utils.isNullOrEmpty(latitude)) And Not(Utils.isNullOrEmpty(longitude))

	Dim RequestLine As B4XView = CreateChapter(colitems, inVIEW_requests_listgroupview, True, id, cnt, Width, mapPin, bd)
	listRequests.Add(RequestLine, id)
	ret = cnt 'ret +1

	Return ret
End Sub

Sub ListaPrincipal_ReachEnd
'	Log("reach_end")
'	current_limit = 0
'	current_offset = 20
'	next_current_limit = 0
	If Not(next_current_limit = current_limit) Then
		current_limit = next_current_limit
		StartRequestActivity(False, CurrentFilter)
	End If
End Sub


'Sub CreateChapter(colitems As Cursor, id As ItemData, idx As Int, width As Int, Expanded As Boolean, bd As BitmapDrawable) As B4XView
Sub CreateChapter(colitems As Cursor, layout As String, pinMap As Boolean, id As ItemData, idx As Int, _
	Width As Int, Expanded As Boolean, bd As BitmapDrawable) As B4XView
'	Log(idx)
'	Log(Expanded)

	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, Width, id.ExpandedHeight)
	p.LoadLayout(layout)
	'listgroupview_new
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	If(ShareCode.ISPHONE) Then
		p.Height = 171dip '200dip
	Else
'		Log($"p.Height: ${p.Height}"$)
		p.Height = 140dip
	End If
	
	Dim tr_is_model As Int = colitems.GetInt("tr_is_model")

	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim ReqReference As String = colitems.Getstring("ReqReference")
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim rq_etime As String = colitems.GetString("request_etime")
	Dim rq_date As String = colitems.GetString("request_date")
	Dim rq_stime As String = colitems.GetString("request_stime")
	Dim fieldref_01 As String = colitems.GetString("fieldref_01")
	Dim rq_number As String = colitems.GetString("tagcode")
	Dim contact_name As String = colitems.GetString("contact_name")
	Dim contact_phone As String = colitems.GetString("contact_phone")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim name As String = colitems.GetString("name")
	Dim request_desc As String = colitems.GetString("request_desc")
	Dim entity As String = colitems.GetString("requester_tagcode")
	Dim notes As String = colitems.GetString("status_notes")
	Dim RequestType As Int = colitems.GetInt("RequestType")
	Dim force_group_request As Int = colitems.GetInt("force_group_request")
	Dim is_favorite As Int = colitems.GetInt("is_favorite")
	Dim report_generated As Int = colitems.GetInt("report_generated")
	Dim onlyinlist As Int = colitems.GetInt("onlyinlist")
	Dim usertagcode As String = colitems.GetString("usertagcode")
	Dim fieldval_05 As Int = colitems.GetInt("fieldval_05") 'CAMPO A LER DO REQUESTS_ADDS, PARA CONTROLAR SE A INTERVENCAO SO TEM CABECALHO OU NAO, foi alterado o DBStructures de modo a incluir o fieldval_05
	
	If ((RequestType=2) And (force_group_request>0)) Then
		RequestType = force_group_request
	End If
	Dim reference As String = colitems.GetString("reference")
	Dim techname As String = colitems.GetString("techname")
	ListItemNumber.Text = idx+1
	Dim repeatcounter As Int = colitems.GetInt("repeatcounter")
	
	Dim address As String = colitems.GetString("address")
	Dim postal_code As String = colitems.GetString("postal_code")
	Dim city As String = colitems.GetString("city")
	
	Dim objaddress As String = colitems.GetString("objaddress")
	Dim objaddress2 As String = colitems.GetString("objaddress2")
	Dim objpostalcode As String = colitems.GetString("objpostalcode")
	Dim objcity As String = colitems.GetString("objlocal")
	
	Dim nameobject As String = colitems.GetString("nameobject") 'Utils.IfNullOrEmpty(colitems.GetString("nameobject"), "")
	Dim desctask As String = Utils.IfNullOrEmpty(colitems.GetString("desctask"), "")
	If Not(desctask = nameobject) And Utils.NNE(desctask) Then
		nameobject = desctask
	End If
	
	Dim route_title As String = Utils.IfNullOrEmpty(colitems.GetString("route_title"), "")
	Dim team_title As String = Utils.IfNullOrEmpty(colitems.GetString("team_title"), "")
	
	Dim execute_date As String = Utils.IfNullOrEmpty(colitems.GetString("execute_date"), "")
	Dim execute_enddate As String = Utils.IfNullOrEmpty(colitems.GetString("execute_enddate"), "")
	Dim isDateEndControl As Boolean = Utils.Int2Bool(ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW)
	
	'Resolução temporaria do problema em que o BO coloca [], nas notes, independentemente do que lá venha.
	'para retirar assim que o BO corrigir
	notes = notes.Replace("[], ","")
	
	If Utils.NNE(notes) Then
		listButNote.tag = notes
		listButNote.Visible = True
	End If
	
	If (RequestType = 1) Then
		SubItemImage.Visible=True
	End If
	ListItem_Desc00.Text = ""
	ListItem_Desc01.Text = ""
	ListItem_Desc02.Text = ""
	'******************************************************************************
	' ALTERACAO PC
	' MOSTRAR A MORADA DO OBJECTO EM VEZ DE SER A DA ENTIDADE
	'******************************************************************************
	If Utils.NNE(objaddress) Then
		ListItem_Desc00.Text = Utils.concatWith(ListItem_Desc00.Text, objaddress, "")
		ListItem_Desc00.Text = Utils.concatWith(ListItem_Desc00.Text, objpostalcode, ", ")
		ListItem_Desc00.Text = Utils.concatWith(ListItem_Desc00.Text, objcity, " - ")
	Else
		ListItem_Desc00.Text = Utils.concatWith(ListItem_Desc00.Text, address, "")
		ListItem_Desc00.Text = Utils.concatWith(ListItem_Desc00.Text, postal_code, ", ")
		ListItem_Desc00.Text = Utils.concatWith(ListItem_Desc00.Text, city, " - ")
	End If
	
	
	
	If (report_generated = 1) Then
		ListItem_Desc02.Text = Utils.concatWith(ListItem_Desc02.Text, "Relatório gerado", " - ")
	End If
	
	If (Utils.Int2Bool(ShareCode.DEVICE_SHOW_REQUEST_ROUTE)) Then
		ListItem_Desc02.Text = Utils.concatWith(ListItem_Desc02.Text, route_title, " - ")
	End If
	
	If (Utils.Int2Bool(ShareCode.DEVICE_SHOW_REQUEST_TEAM)) Then
		'If Utils.NNE(ListItem_Desc00.Text) Then ListItem_Desc00.Text = $"${ListItem_Desc00.Text} - "$
		'ListItem_Desc00.Text = $"${ListItem_Desc00.Text}${team_title}"$
		ListItem_Desc02.Text = Utils.concatWith(ListItem_Desc02.Text, team_title, " - ")
	End If
	
	
	Dim cnt As String = ""
	If Not(Utils.isNullOrEmpty(contact_name)) Then cnt = $"${contact_name}"$
	If Not(Utils.isNullOrEmpty(contact_phone)) Then
		If Not(Utils.isNullOrEmpty(cnt)) Then
			cnt = $"${cnt} - ${contact_phone}"$
		Else
			cnt = $"${contact_phone}"$
		End If
	End If
	If (Not(Utils.isNullOrEmpty(latitude)) And Not(Utils.isNullOrEmpty(longitude))) Then
		If Not(Utils.isNullOrEmpty(cnt)) Then
			cnt = $"${cnt} - (${latitude}|${longitude})"$
		Else
			cnt = $"(${latitude}|${longitude})"$
		End If
	End If
	
	Dim techname As String = DBStructures.GetScriptColumnStrEVC($"select title from dta_technicals where tagcode = '${usertagcode}'"$,"title")
	
	If Utils.NNE(techname) Then
		ListITemTechnical.Text = techname
	Else
		ListITemTechnical.Text = ""
	End If
	
	
	ListItem_TypeRequest.Text = $"${request_desc}"$
	ListItem_TypeRequest.tag = rq_number
	
	If Utils.NNE(reference) Then
		ListItemReference.Text = $"(${reference})"$
	End If
	
	ListItem_Entity.text = $"${name}"$
	ListItem_Entity.tag = $"${entity}"$
	Dim DateTimeReq As String = ""
	Dim DateTimeReqHour As String = ""
	If (ShareCode.APP_DOMAIN.ToLowerCase = "printcriativa") Then
		If Utils.NNE(fieldref_01) Then
'			DateTimeReq = $"${rq_date}, ${fieldref_01}"$
			DateTimeReqHour = $"${fieldref_01}"$
		Else
			DateTimeReq = $"${rq_date}"$
		End If
	Else
'		If Utils.NNE(rq_etime) Then
'			DateTimeReq = $"(${rq_etime})"$
'		End If
		If (ShareCode.APP_DOMAIN.ToLowerCase = "nve") Then
			If Utils.NNE(rq_stime) Then
				DateTimeReqHour = $"${rq_stime}"$
			End If
		Else
			If Utils.NNE(rq_stime) Then
				DateTimeReq = $"${rq_stime} ${DateTimeReq}"$
			End If
		End If
		
		
		If Utils.NNE(rq_date) Then
			If Utils.NNE(DateTimeReq) Then
				DateTimeReq = $"${rq_date}, ${DateTimeReq}"$
			Else
				DateTimeReq = $"${rq_date}"$
			End If
		End If
	End If
	
	If Utils.NNE(ReqReference) Then
		Dim ReqRef As String = $"(${ReqReference})"$
	Else
		Dim ReqRef As String = ""
	End If
	
	
	Dim csLIDT As CSBuilder
	If (Utils.Int2Bool(ShareCode.DEVICE_SHOW_REQUEST_ID)) Then
		If Utils.NNE(DateTimeReq) Then
			csLIDT.Initialize.Bold.Append(rq_number).Pop.Append($" ${ReqRef} / ${DateTimeReq}"$)
			'DateTimeReq = $"${rq_number} / ${DateTimeReq}"$
		Else
			csLIDT.Initialize.Bold.Append($"${rq_number} ${ReqRef}"$).Pop
			'DateTimeReq = $"${rq_number}"$
		End If
				
		If Utils.NNE(DateTimeReqHour) Then
			csLIDT.Append($", "$).Color(Colors.Red).Bold.Append(DateTimeReqHour).Pop.Pop
		End If
	Else
		csLIDT.Initialize.Append(DateTimeReq)
	End If
	csLIDT.Append(" ").PopAll
	
	ListItem_Datetime.text = csLIDT   'DateTimeReq
	ListItem_Status.text = $"${status_desc}"$
	

	ListItemObject.Text = nameobject
	

	listButMap.Enabled = (status_id < 5)
	'ListItem_Notes.Visible = (DateTimeReq.Length =0)
	
'	TIP: VERIFICACAO DOS ICONS DE CLOUD NA INTERVENCAO
	
	'*********************************************************************
	' MOSTRAR ICON DA NUVEM SE A INTERVENCAO FOR SÓ CABECALHO
	'*********************************************************************
'	Log($"fieldval_05:${fieldval_05}"$)
	
	If (fieldval_05 = 0) Then
		ListItem_Cloud.Visible = False
	Else
		ListItem_Cloud.Visible = True
		p.Height = 150dip
	End If
		
	If (ShareCode.DEVICE_PARAM_FAVORITES = 1) Then
		ListItem_Favorite.Visible = True
		If (is_favorite = 1) Then
			ListItem_Favorite.Text = Chr(0xF005)
			ListItem_Favorite.TextColor = Consts.ColorOrange '0xFFFF9400
		Else
			ListItem_Favorite.Text = Chr(0xF006)
			ListItem_Favorite.TextColor = Consts.ColorGray '0xFFCDCDCD
		End If
		'Chr(0xF005)
		'Chr(0xF006)
		'ListItem_Favorite
	Else
		ListItem_Favorite.Visible = False
	End If
		
	'TIP: CORES E ICONS DOS RESPECTIVOS STATUS

	Try
		Dim statusColor As String =  DBStructures.GetScriptColumnstrEVC($"select color from type_statustypes where id = ${status_id}"$, "color")
	Catch
		Dim statusColor As String = "#000000"
	End Try
	
	statusColor = statusColor.ToLowerCase
	
	If (status_id = 1) Then ' POR EXECUTAR
		ListItemTodayRequests.Text = Chr(0xF073)
'		ListItemTodayRequests.TextColor =  Consts.ColorGreen
	Else If (status_id = 2) Then ' EM EXECUÇÃO
		ListItemTodayRequests.Text = Chr(0xF2BE)
'		ListItemTodayRequests.TextColor = Consts.ColorYellow
	Else If (status_id = 3) Then ' CONCLUIDO
		ListItemTodayRequests.Text = Chr(0xF073)
'		ListItemTodayRequests.TextColor = Consts.ColorBlue
	else if (status_id = 4) Then
		ListItemTodayRequests.Text = Chr(0xF073)
'		ListItemTodayRequests.TextColor = Consts.ColorRed
	Else If (status_id = 5) Then ' CANCELADO
		ListItemTodayRequests.Text = Chr(0xF088)
'		ListItemTodayRequests.TextColor = Consts.ColorGray
	End If

	ListItemTodayRequests.TextColor =  Utils.HtmlColor2Int(statusColor)
			
			
	If (ReqRequests.IndexOf(tagcode) >= 0) Then
		ListItemTodayRequests.Text = Chr(0xF017)
	End If
	
	If isDateEndControl Then
		Dim cDate As String = Utils.GetCurrentDate
		Try
			Dim dstart As Long = DateTime.DateParse(ShareCode.APPDATE_STARTRANGE)
			Dim dend As Long = DateTime.DateParse(ShareCode.APPDATE_ENDRANGE)
			Dim ddate As Long = DateTime.DateParse(cDate)
			If (ddate >= dstart) And (ddate <= dend) Then
				If (cDate = execute_enddate) And (execute_date <> execute_enddate) Then
					ListItemTodayRequests.Text = Chr(0xF017)
					ListItemTodayRequests.TextColor = Consts.ColorOrange
				End If
			End If
		Catch
			Log(LastException)
		End Try
		
		
	End If
	
	Dim ClientReport As Int = 0
	'ESTE CODIGO LIMITA AS INTEGRADORAS AOS DOMAIN ESPECIFICADOS ABAIXO
'	If  ((ShareCode.APP_DOMAIN.ToLowerCase = "grandative") Or (ShareCode.APP_DOMAIN.ToLowerCase = "resopre") Or (ShareCode.APP_DOMAIN.ToLowerCase = "uber")) And _
'		(tr_is_model = 1)  Then
'		ClientReport = 1
'	End If
	
	If tr_is_model = 1 Then
		ClientReport = 1
	End If

	Dim reqData  As RequestData = Types.MakeRequestData(tagcode, entity, latitude, longitude, RequestType, is_favorite, ClientReport, onlyinlist, repeatcounter)
	
	If Not(Utils.isNullOrEmpty(latitude)) And Not(Utils.isNullOrEmpty(longitude)) Then
		If Not(ShareCode.ISPHONE) Then
			If (pinMap) Then
				listButMap.Visible = True
				listButMap.Tag = reqData
			Else
				listButMap.Visible = False
			End If
		Else
			listButMap.Visible = False
		End If
	Else
		listButMap.Visible = False
		listButMap.Enabled = False
	End If
	

'	ClickLabel.Tag = idx
	pnlGroupTitle.Tag = reqData
	listButMap.Tag = idx ' Perguntar ao PA porque atribuiu o idx ao listButMap, uma vez que tem de ter o reqData para o icon funcionar
	listButMore.Tag = reqData
	p.Tag = reqData
	ListItem_Favorite.Tag = reqData
	
	Return p
End Sub

Sub CreateBitmapPIN(text As String, theColor As Int, border As Int, lenght As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, lenght, lenght)
	Dim c As B4XCanvas
	c.Initialize(p)
'	'c.DrawRect(c.TargetRect, xui.Color_White, True, 0)
''	c.DrawRect(c.TargetRect, theColor, True, 0)
'	c.DrawCircle(c.TargetRect.CenterX,c.TargetRect.CenterY, 25dip, xui.Color_White, True, 5dip)
'	c = DrawCircleEmpty(c, c.TargetRect.CenterX,c.TargetRect.CenterY, 25dip, theColor)
	c.DrawCircle(c.TargetRect.CenterX,c.TargetRect.CenterY, (lenght/2), theColor, True, 5dip)
	c.TargetRect.Width = c.TargetRect.Width-border
	c.TargetRect.Height = c.TargetRect.Height-border
	
	c.DrawCircle(c.TargetRect.CenterX+(border/2),c.TargetRect.CenterY+(border/2), (lenght/2)-(border), xui.Color_White, True, 5dip)
'	c.DrawText(text, c.TargetRect.CenterX, c.TargetRect.CenterY + 9dip, xui.CreateDefaultBoldFont(12), xui.Color_Black, "CENTER")
	c.DrawText(text, c.TargetRect.CenterX, c.TargetRect.CenterY + 6dip, xui.CreateDefaultBoldFont(12), xui.Color_Black, "CENTER")
	c.Invalidate
	Return c.CreateBitmap
End Sub

Private Sub DrawCircleEmpty(c As B4XCanvas, x As Int, y As Int, Radial As Int , BorderColor As Int) As B4XCanvas
'	Dim BC As BitmapCreator
'	BC.Initialize(Radial*2, Radial*2)
	Dim X1 As Double = X + Radial * CosD(0)
	Dim Y1 As Double = Y + Radial * SinD(0)
  
	For i=1 To 720
		Dim X2 As Double = X + Radial * CosD(i/2)
		Dim Y2 As Double = Y + Radial * SinD(i/2)
		c.Drawline(X1,Y1,X2,Y2,BorderColor, 5dip)
		X1 = X2
		Y1 = Y2
	Next
	Return c
End Sub

Sub CreateRequestItemLevelFirst(cnt As Int, colitems As RequestData, Width As Int, Height As Int, _
		bd As BitmapDrawable, CLA As RequestCLA) As Int
	Dim ret As Int = 0
	Dim tagcode As String = colitems.Tagcode
	'Dim sSQL1 As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS} and a.level=0 and z.request_tagcode='${tagcode}'"$
	Dim sSQL1 As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS} and z.request_tagcode='${tagcode}'"$
	'Dim sSQL2 As String = $"${DBStructures.SQL_GETREQUESTS_DATA_TASKSGRIDS} and a.request_tagcode='${tagcode}' and a.action_tagcode='${tagcode}'"$
	Dim sSQL As String = $"${sSQL1} order by z.position, z.execute_start, z.id"$
'	Log(sSQL)
	listRequestsItem.Clear
	Private thisContinue As Boolean = True
	
	'***********************************************************
	' VERIFICA SE TEM CHECKLISTS QUE SE REPETEM
	'***********************************************************
	Dim sSQLT As String = $"Select distinct a.task_tagcode, b.title, ifnull(c.title, '') as taggroup
							from dta_typerequests_tasks as a 
							inner join dta_tasks as b on (b.tagcode=a.task_tagcode)
							left join dta_tasks_groups as c on (c.tagcode=b.task_group)
							where a.repeated=1 and b.active=1 
								and a.typerequest_tagcode in (select distinct typerequest_tagcode  
										from dta_requests where tagcode='${colitems.Tagcode}')"$
	Private AddRequest As Cursor
	AddRequest = Starter.LocalSQLEVC.ExecQuery(sSQLT)
	Dim AddVisible As Boolean = AddRequest.RowCount >= 1
	AddRequest.Close
	
	If Not(AddVisible) Then
		'***********************************************************
		' VERIFICA SE O TIPO DE INTERVENÇÃO PERMITE ADICIONAR
		' QUALQUER TIPO DE CHECKLISTS 
		'***********************************************************
		Dim sSQLT As String = $"Select distinct a.tagcode
							from dta_typerequests as a 
							inner join type_trclmodetypes as b on (b.tagcode=a.trcl_mode)
							where b.onlyinlist=0 
								and a.tagcode in (select distinct typerequest_tagcode 
										from dta_requests where tagcode='${colitems.Tagcode}')"$
		Private AddRequest As Cursor
		AddRequest = Starter.LocalSQLEVC.ExecQuery(sSQLT)
		Dim AddVisible As Boolean = AddRequest.RowCount >= 1
		AddRequest.Close
	End If
	
	Private ReqDetails As Cursor
	Try
		ReqDetails = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Catch
'		Log(LastException)
		thisContinue = False
	End Try
	
	butQuickAction.Tag = colitems
	butQuickAction.Visible = AddVisible
	Dim thisIndexClick As Int = CLA.Info.ReqIndex 'ListaPrincipalClickItem

	'ListaPrincipalClickItem
	'ListItemClickIndex (index=12)
	
	If thisContinue Then
		If ReqDetails.RowCount > 0 Then
			For i=0 To ReqDetails.RowCount-1
				ReqDetails.Position = i
			
				Dim id As ItemData
				id.Initialize
'				Dim theType As Int = ReqDetails.GetInt("type")
'				If (theType = 2) Then
'					id.CollapsedHeight = 125dip
'					id.ExpandedHeight = 125dip
'					Dim Height As Int = 125dip
'				
'					Dim inVIEW_requests_listgroupview As String = "CLA_ITEM_GridListRequest2"
'					If (ShareCode.ISPHONE) Then
'						inVIEW_requests_listgroupview = "CLA_ITEM_GridListRequest2_device_2"
'						id.CollapsedHeight = 125dip '345dip
'						id.ExpandedHeight = 125dip '345dip
'						Height  = 125dip '325dip
'					End If
'					Dim RequestLine As B4XView = CreateRequestItemLineAction(cnt, ReqDetails, inVIEW_requests_listgroupview, 0, Width, Height, "pnlGroupDataItemInner")
'					'pnlGroupDataSub.AddView(CreateRequestItemLineAction(cnt, ReqDetails2, 0, Width, Height, "pnlGroupDataItemInner"), 0, Top, 100%x, Height)
'				Else
					id.CollapsedHeight = 105dip
					id.ExpandedHeight = 105dip
					Dim Height As Int = 105dip
	
					Dim inVIEW_requests_listgroupview As String = "requests_listgroupview"
					inVIEW_requests_listgroupview = "requests_listgroupview_device_3"
					If (ShareCode.ISPHONE) Then
						'inVIEW_requests_listgroupview = "requests_listgroupview_device_3"
						id.CollapsedHeight = 105dip '345dip
						id.ExpandedHeight = 105dip '345dip
						Height  = 105dip '325dip
					End If
				Dim RequestLine As B4XView = CreateRequestItemLine(cnt, ReqDetails, inVIEW_requests_listgroupview, 0, Width, Height, "pnlGroupDataItem", thisIndexClick)
'				End If
			
			
			
				listRequestsItem.Add( RequestLine, id)
			Next
			
			Dim id As ItemData
			id.Initialize
			id.CollapsedHeight = 105dip
			id.ExpandedHeight = 105dip
			Dim Height As Int = 105dip
		
			Dim RequestLine As B4XView = CreateRequestItemClearLine("request_clear", Width, Height)
			listRequestsItem.Add( RequestLine, id)
		End If
		ReqDetails.Close
	End If
	ret = cnt 'ret +1
	ProgressDialogHide
	Return ret
End Sub

Sub CreateRequestItemLine(cnt As Int, colitems As Cursor, layout As String, Top As Int, Width As Int, Height As Int, mcall As String, idx As Int) As Panel
	
'	Dim p As B4XView = xui.CreatePanel("")
'	p.LoadLayout(layout)
	'
	
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout(layout)
	p.RemoveView

	Dim id As Int = colitems.GetInt("id")
	Dim actionstatus_id As Int = colitems.GetInt("status_id")
	Dim tasktype As Int = colitems.GetInt("type")
	
	Dim status_id As Int = colitems.GetInt("rel_status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim status_desc As String = colitems.GetString("rel_status_desc")
	Dim rq_etime As String = colitems.GetString("request_etime")
	Dim rq_date As String = colitems.GetString("request_date")
	Dim rq_stime As String = colitems.GetString("request_stime")
	Dim rq_number As String = colitems.GetString("tagcode")
	Dim contact_name As String = colitems.GetString("contact_name")
	Dim contact_phone As String = colitems.GetString("contact_phone")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim name As String = colitems.GetString("name")
	Dim nameobject As String = colitems.GetString("nameobject") 'Utils.IfNullOrEmpty(colitems.GetString("nameobject"), "")
	'Dim request_desc As String = colitems.GetString("task_name")  request_desc
	Dim request_desc As String = colitems.GetString("task_desc")
	
	
	'ifnull(g.title, ifnull(e.title, '')) as request_desc,
	Dim entity As String = colitems.GetString("requester_tagcode")
'	Dim notes As String = colitems.GetString("status_notes")
	Dim RequestType As Int = colitems.GetInt("RequestType")
	
	Dim task As String = colitems.GetString("task_tagcode")
	Dim actionkey As String = colitems.GetString("action_tagcode")
	Dim repeatcounter As Int = colitems.GetInt("repeatcounter")
	
	'Dim cnt As String = ""
	If Not(Utils.isNullOrEmpty(contact_name)) Then cnt = $"${contact_name}"$
	If Not(Utils.isNullOrEmpty(contact_phone)) Then
		If Not(Utils.isNullOrEmpty(cnt)) Then
			cnt = $"${cnt} - ${contact_phone}"$
		Else
			cnt = $"${contact_phone}"$
		End If
	End If

	Dim DateTimeReq As String = $"${rq_date}, ${rq_stime} (${rq_etime})"$

	Dim csLIDT As CSBuilder
	If (Utils.Int2Bool(ShareCode.DEVICE_SHOW_REQUEST_ID)) Then
		If Utils.NNE(DateTimeReq) Then
			csLIDT.Initialize.Bold.Append(rq_number).Pop.Append($" / ${DateTimeReq}"$)
			'DateTimeReq = $"${rq_number} / ${DateTimeReq}"$
		Else
			csLIDT.Initialize.Bold.Append(rq_number).Pop
			'DateTimeReq = $"${rq_number}"$
		End If
	Else
		csLIDT.Initialize.Append(DateTimeReq)
	End If
	csLIDT.Append(" ").PopAll
	
	ListItem_Datetime.text = csLIDT   'DateTimeReq
	'ListItem_Datetime.text = $"${rq_date}, ${rq_stime} (${rq_etime})"$
	
	ListItemClickIndex.Tag = idx
	ListItem_TypeRequest.Text = $"${request_desc}"$
	ListItem_TypeRequest.tag = rq_number
	ListItem_Entity.text = $"${name}"$
	ListItem_Entity.tag = $"${entity}"$
	ListItem_Status.text = $"${status_desc}"$
	
	ListItemObject.Text = nameobject
	listButMap.Enabled = (status_id < 5)
	'ListItem_Notes.Visible = (notes.Length >0)
		
	' SE CONCLUIDO (3) MAS DO DIA rq_date = Data de hoje (Verificar os formatos para a comparação
	' O ICON DEVE SER O RELOGIO ( Chr(0xF017) ) E NAO O CALENDARIO ( Chr(0xF073) ) QUALQUER UM COM A COR AZUL
		
	If (status_id = 1) Then ' POR EXECUTAR
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorGreen
		If (ReqRequests.IndexOf(tagcode) >= 0) Then
			ListItemTodayRequests.Text = Chr(0xF017)
		End If
	Else If (status_id = 2) Then ' EM EXECUCAO
		ListItemTodayRequests.Text = Chr(0xF2BE)
		ListItemTodayRequests.TextColor = Consts.ColorYellow
	Else If (status_id = 3) Then ' CONCLUIDO
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorBlue
'	Else If (status_id = 3) And datahoje = dataintercao Then ' CONCLUIDO
'		ListItemTodayRequests.Text = Chr(0xF017)
'		ListItemTodayRequests.TextColor = Consts.ColorBlue
	else if (status_id = 4) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorRed
	Else If (status_id = 5) Then ' CANCELADO
		ListItemTodayRequests.Text = Chr(0xF088)
		ListItemTodayRequests.TextColor = Consts.ColorGray
	End If
	
	
	'Dim RequestType As Int = colitems.GetInt("RequestType")
	Dim onlyinlist As Int = colitems.GetInt("onlyinlist")
	Dim close_type As Int = colitems.GetInt("close_type")
	Dim result_type As Int = colitems.GetInt("result_type")
	Dim result_values As String = colitems.GetString("result_values")
	Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(RequestType, close_type, result_type, result_values, False, 0, 0, 0, Null, Null, idx)
	Dim reqData As RequestCLA = Types.MakeRequestCLA(tagcode, actionkey, task, repeatcounter, tasktype, _
		Types.MakeInterv(id, tagcode, actionstatus_id, Utils.ColorInt(actionstatus_id)), CLAInfo, _
		Types.MakeOtherCLA("", "", ""))
	
	Dim ClientReport As Int = 0
	If  (ShareCode.APP_DOMAIN.ToLowerCase.Contains("grandative")) Then
		ClientReport = 1
	End If
	Dim reqData1  As RequestData = Types.MakeRequestData(tagcode, entity, latitude, longitude, RequestType, 0, ClientReport, onlyinlist, repeatcounter)
	listButMore.Tag =  reqData1
	listButMap.Tag = idx
	pnlGroupTitle.Tag = reqData 'idx
	p.Tag = reqData ' Expanded 'collapsed
	
	Return p

End Sub

Sub CreateRequestItemClearLine(layout As String, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout(layout)
	p.RemoveView
	Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(0, 0, 0, "", False, 0, 0, 0, Null, Null, 0)
	Dim reqData As RequestCLA = Types.MakeRequestCLA("_NOACTION_", "_NOACTION_", "_NOACTION_", 0, 0, _
		Types.MakeInterv(0, "", 0, Consts.ColorWhite), CLAInfo, Types.MakeOtherCLA("", "", ""))
		
	p.Tag = reqData
	Return p
End Sub


Sub CLAItemButton_StateClick (State As Int)
	Dim this As B4XStateButton = Sender
	Dim Columns As List = Regex.Split("\|", this.tag )
	Dim Tagcode As String = Columns.Get(0)
'	Dim actionkey As String = Columns.Get(1)
'	Dim objecttagcode As String = Columns.Get(2)
	Dim task As String = Columns.Get(3)
	Dim item As String = Columns.Get(4)
	Dim unique As String = Columns.Get(5)
	Dim innertagcode As String = Columns.Get(6)
	Dim val As Int = Columns.Get(7)
	Dim repeatcounter As Int = Columns.Get(9)
'	Dim repeatitemcounter As Int = Columns.Get(10)
	Dim NoAnswer As Boolean = False
	If State = 0 Then
		val = 0
		NoAnswer = True
	End If
	Dim sSQL As String = $"update requests_values set status=${val} where request_tagcode='${Tagcode}' and
						task_tagcode='${task}' and item_tagcode='${item}' and uniquekey='${unique}' and tagcode='${innertagcode}'
						and repeatcounter=${repeatcounter}"$
	Starter.LocalSQL.ExecNonQuery(sSQL)
	
	Dim sPanel As Panel = this.parent
	Dim sLabel As Label = sPanel.GetView(0)
	If (NoAnswer) Then
		sLabel.Text = Chr(0xF088)  'Not Answered
		sLabel.TextColor = Consts.ColorGray
	Else
		sLabel.TextColor = Consts.ColorGreen
		sLabel.Text = Chr(0xF087)
	End If
	
'	Log(sSQL)
'	Log("=========================================================================")
'	Dim sSQL As String = $" and a.request_tagcode='${Tagcode}' and a.task_tagcode='${task}' and a.item_tagcode='${item}' and a.uniquekey='${unique}' and a.tagcode='${innertagcode}'"$
'	Dim Record2 As Cursor = Starter.LocalSQL.ExecQuery($"${DBStructures.SQL_GET_TASK_ITEM_VALUE_GRID} ${sSQL}"$)
'	If Record2.RowCount > 0 Then
'		Record2.Position = 0
'		Log($"tagcode='${Record2.GetString("tagcode")}', status=${Record2.GetInt("status")}"$)
'	Else
'		Log("SEM INFORMAÇÃO!!!")
'	End If
	
End Sub

Sub CreateRequestItemMap(cnt As Int, colitems As Cursor, Top As Int, Width As Int, Height As Int, theColor As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, Top, Width, Height)
	p.LoadLayout("requests_itemmapview_new") '"requests_itemmapview")
	p.RemoveView
	
'	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim rq_etime As String = colitems.GetString("request_etime")
	Dim rq_date As String = colitems.GetString("request_date")
	Dim rq_stime As String = colitems.GetString("request_stime")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim name As String = colitems.GetString("name")
	Dim entity As String = colitems.GetString("requester_tagcode")
	Dim RequestType As Int = colitems.GetInt("RequestType")
	Dim is_favorite As Int = colitems.GetInt("is_favorite")
	Dim onlyinlist As Int = colitems.GetInt("onlyinlist")
	Dim repeatcounter As Int = colitems.GetInt("repeatcounter")
	
	ListItemNumber.Text = cnt+1
	Dim cd As ColorDrawable
	cd.Initialize2(xui.Color_White, 5dip, 3dip, theColor)
	ListItemNumber.Background = cd
	
	ListItemFullName.text = $"${name}"$
	ListItemFullName.tag = $"${entity}"$
	ListItemStatus.text = $"${rq_date}, ${rq_stime} (${rq_etime}) - ${status_desc}"$
	
'	If (status_id = 1) Then
'		ListItemTodayRequests.Text = Chr(0xF073)
'		ListItemTodayRequests.TextColor = Consts.ColorGreen
'		If (ReqRequests.IndexOf(tagcode) >= 0) Then
'			ListItemTodayRequests.Text = Chr(0xF017)
'		End If
'	Else If (status_id = 2) Then
'		ListItemTodayRequests.Text = Chr(0xF2BE)
'		ListItemTodayRequests.TextColor = Consts.ColorYellow
'	Else If (status_id = 3) Then
'		ListItemTodayRequests.Text = Chr(0xF073)
'		ListItemTodayRequests.TextColor = Consts.ColorBlue
'	else if (status_id = 4) Then
'		ListItemTodayRequests.Text = Chr(0xF073)
'		ListItemTodayRequests.TextColor = Consts.ColorRed
'	Else If (status_id = 5) Then
'		ListItemTodayRequests.Text = Chr(0xF088)
'		ListItemTodayRequests.TextColor = Consts.ColorGray
'	End If

	
	Dim ClientReport As Int = 0
	If  (ShareCode.APP_DOMAIN.ToLowerCase.contains("grandative")) Then
		ClientReport = 1
	End If
	p.Tag = Types.MakeRequestData(tagcode, entity, latitude, longitude, RequestType, is_favorite, ClientReport, onlyinlist, repeatcounter)
	Return p
End Sub


Sub listsButtonClose_Click
	ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
	Log("Back REQUESTS")
	If ((CurrentTabPage = 0) Or (CurrentTabPage = 3)) Then
'		If (IsFiltered) Then
'			Dim i As Int
'			i = msgbox2("Tem um filtro activo. Deseja mante-lo para a próxima entrada?", "Alerta!", "Sim", "Não", "", Null, False)
'			If (i=DialogResponse.POSITIVE) Then
'				Starter.ObjectKeepFilter  = True
'				Starter.ObjectSearchFilter = SearchFilter
'				Starter.ObjectFilter = Types.MakeObjectFilter(iDialogReqTypeObject, iDialogReqZone, iDialogReqStatus, iDialogReqRegion, _
'							iDialogReqLocal, sDialogReqName, sDialogReqAddress, iDialogReqWithRequests)
'			End If
'		End If
'		If Not(ShareCode.ISPHONE) Then
'			Try
'				
'				MarkersBallons.UnsetFocusedMarker
'				FocusedMarker = MarkersBallons.FocusedMarker
'			Catch
'				Log(LastException)
'			End Try
'		End If
		CallSubDelayed2(MainMenu, "ListsReturn", "")
		ShareCode.CurrentRequestFilter = CurrentFilter
		Activity.Finish
		ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	Else
		CurrentTabPage = CurrentTabPage-1
		
		'TIP : TESTAR SE O BACK NAO ESTA A ACTUAR PORQUE O TabPageState ESTA A FICAR EM MENOR DO QUE 0
		If CurrentTabPage < 0 Then CurrentTabPage = 0
		
		TabPageState(CurrentTabPage, True)
		listsTabPanel.ScrollTo(CurrentTabPage, True)
	End If
	ProgressDialogHide
End Sub


Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub ButtonUserUnavailable_Click
	Dim i As Int
	i = Msgbox2(ShareCode.UserGoAvailableMessage, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
	If (i=DialogResponse.POSITIVE) Then
		Dim cli As AppDialogs
		cli.Initialize
		cli.MakeUserAvailable("Requests3")
	End If
End Sub

Sub WindowStatusUpdate
	If Utils.NE(ShareCode.SESS_OPER_UserName) Then
		StopService(LocationService)
		StopService(Comms)
'		StopService(UserService)
		StopService(Logs)
		StartActivity(Main)
		Sleep(500)
		Activity.Finish
	End If
	LabelVersion.Text = ShareCode.APP_VersionNocodeName
	LabelCopyright.Text = ShareCode.APP_EntityBrand  '"X-Evolution,Lda"
	mainActiveUser.Text = ShareCode.SESS_OPER_UserName
	
	ButtonAppNetwork.Enabled = False
	ButtonAppNetwork.TextColor = Consts.ColorLightSilver
	If (ShareCode.APP_WORKING_LOCAL) Then
		ButtonAppNetwork.Enabled = True
		ButtonAppNetwork.TextColor = Consts.ColorRedOrange
	End If
	ButtonUserUnavailable.Enabled = False
	ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
	If (ShareCode.USR_STATE = 0) Then
		ButtonUserUnavailable.Enabled = True
		ButtonUserUnavailable.TextColor = Consts.ColorRedOrange
	End If
	
	ButtonActionPause.Enabled = False
	ButtonActionPause.TextColor = Consts.ColorLightSilver
	'	If (ShareCode.CLA_STATE >= 1) Then
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		ButtonActionPause.Enabled = True
		ButtonActionPause.TextColor = Consts.ColorRedOrange
	End If
	'listsLabelInfo.Text = $"${CurrentLineItem} / ${TotalLineItems}"$
	Dim tItems As Int = listRequests.Size
	listsLabelInfo.Text = $"${CurrentLineItem} / ${tItems}"$
	ProgressDialogHide
End Sub

Sub ButtonAppNetwork_Click
	
End Sub

Sub ButtonAppAlert_Click
	
End Sub

Sub ButtonActionTransport_Click
	
End Sub

Sub mapZoomUp_Click
'	MapViewArea.ZoomIn
End Sub

Sub mapZoomDown_Click
'	MapViewArea.ZoomOut
End Sub

Sub mapUserPosition_Click
'	If Not(ShareCode.ISPHONE) Then
'		Try
'			
'			MarkersBallons.FocusedMarker = MarkMyPosition
'		Catch
'			Log(LastException)
'		End Try
'	End If
End Sub


Sub listsRequestsMap_ItemClick (Index As Int, Value As Object)
	
	Dim p As Panel  = listsRequestsMap.GetPanel(Index)
	Dim req As RequestData = p.Tag
	Dim ret As ObjectInformation = GetObjectMapInfo(req.Tagcode)
	
	'Dim ThisAddress As String = $"${ret.Address},${ret.Address2}${CRLF}${ret.CPostal} ${ret.City}"$

'	listsTabPanel.ScrollTo(2, True)
	
	If gmap.IsInitialized Then
		Dim cp As CameraPosition
		cp.Initialize(ret.Latitude, ret.Longitude, 17)
		gmap.MoveCamera(cp)
	End If
End Sub

Sub listRequestsButtonMap_Click
	Try
		
'		If Not(ShareCode.ISPHONE) Then
			If ShowListPedidosMap Then
				ShowListPedidosMap = False
				mapBaseList.Visible = False
				listRequestsButtonMap.Color = Colors.ARGB(150, 7, 167, 247)
				listRequestsButtonMap.Left = 10dip
			Else
				ShowListPedidosMap = True
				mapBaseList.Visible = True
				listRequestsButtonMap.Color = Colors.ARGB(150, 7, 119, 167)
				listRequestsButtonMap.Left = 400dip
		End If
'		End If
	Catch
		Log(LastException)
	End Try
End Sub


'**************************************************************************************************
' 	EXECUTA/ABRE/REABRE/VISUALIZA A CHECKLIST DA INTERVENÇÃO SIMPLES (1 INTERVENÇÃO 1 CHECKLIST)
'	CLICA LISTA PRINCIPAL
'	ListaPrincipal
'**************************************************************************************************
' TIP: ABERTURA DA INTERVENCAO QUANDO SE CLICA NA INTERVENCAO
'**************************************************************************************************
Sub ListaPrincipal_ItemClick (Index As Int, Value As Object)

	If Index >= listRequests.Size Then
		Return
	End If
	
	Log($"Lista ListRequests: ${listRequests.Size}"$)
	
	If (Not(listRequests.Size = 0) And (Index>=0)) Then
		Dim p As Panel  = listRequests.GetPanel(Index)
		If Utils.NNE(p.Tag) And Not(p.Tag = "__NONE__") Then
			Dim colitems As RequestData = p.Tag
			Dim LblCloud As Label
			LblCloud.Initialize("")
			'**************************************************************
			' ALTERACAO PC
			' APANHA O INDICE DA VIEW CORRESPONDENTE À CLOUD; MESMO SE NAO FOR A POSICAO NORMAL
			' A LABEL NA VIEW TEM DE TER 'Cloud' NA TAG, PARA FUNCIONAR
			'**************************************************************
			For Each v As View In p.GetAllViewsRecursive
				If v.Tag = "Cloud" Then	LblCloud = v
			Next
			
			ProgressDialogShow(ShareCode.GeneralLoadingMessage)
	
			If Not(colitems.Tagcode = "_NOACTION_") Then
		
		
				Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(colitems.RequestType, 0, 0, "", False, 0, 0, 0, Null, Null, Index)
				Dim CLA As RequestCLA = Types.MakeRequestCLA(colitems.Tagcode, "", "", 0, 0, _
											Types.MakeInterv(0, colitems.Tagcode, 0, Utils.ColorInt(0)), CLAInfo, _
											Types.MakeOtherCLA("", "", ""))
			
				Dim fieldval_05 As Int = DBStructures.GetScriptColumnIntEVC($"select fieldval_05 from dta_requests_adds where
				 												request_tagcode='${CLA.Request.Trim}'"$, "fieldval_05")
																
				Dim reqData  As RequestData = Types.MakeRequestData(colitems.Tagcode,colitems.Entity,colitems.Latitude,colitems.Longitude,colitems.RequestType,colitems.Favorite,colitems.ClientReport,colitems.RequestCanAdd,colitems.RequestCanDelete)
				
				'**********************************************************************************************************
				' SE O ICON DA CLOUD ESTIVER VISIVEL QUER DIZER QUE E SO CABECALHO, POR ISSO PERGUNTA SE QUER DESCARREGAR
				'**********************************************************************************************************

				If (Utils.Int2Bool(fieldval_05)) Then
'					Msgbox2Async("Esta intervenção não tem dados. Deseja descarregá-los ?", ShareCode.GeneralInfoTitle, ShareCode.Option_YES, "", ShareCode.Option_NO, Null, False)
'					Wait For Msgbox_Result (ResCloud As Int)
					'************************************************************************
					' EFECTUA O DOWNLOAD DA INTERVENCAO COMPLETA
					' FAZ UPDATE AO fieldval_05 PASSANDO-O A 0
					' RECARREGA A INTERVENCAO
					'************************************************************************
'					If ResCloud = DialogResponse.POSITIVE Then
						

'						Dim res As ResumableSub = DownloadFullRequest(reqData)
'						Wait For(res) Complete (Downloaded As Boolean)
						ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
						Dim res As ResumableSub = ForceGetRequests(reqData.Tagcode)
						Wait For(res) Complete (Downloaded As Boolean)
						If (Downloaded) Then
							LblCloud.Visible = False
							listRequests.Refresh
						Else
							MsgboxAsync("Não foi possivel descarregar a intervenção!",ShareCode.GeneralErrorTitle)
						End If
						Sleep(1000)
						ProgressDialogHide
						Sleep(10)
'					Else
'						ProgressDialogHide
'						Return
'					End If
				End If
								
				'************************************************************************
				' TIP: INTERVENÇÃO SIMPLES (1I -> 1CL)
				'************************************************************************
				If (colitems.RequestType = 2) Then
		
					Starter.APP_IN_EXECUTION = True
					ListaPrincipalClickItem = -1
					Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS
					sSQL = $"${sSQL} and z.request_tagcode='${colitems.Tagcode}'"$
					Log(sSQL)
					Log(colitems.Tagcode)
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
						Dim nameobject As String = incolitems.GetString("nameobject")
						Dim request_obs As String = incolitems.GetString("request_obs")
						Dim request_type As String = incolitems.GetString("request_type")
						'Dim RequestType As Int = incolitems.GetInt("RequestType")   'colitems.Tagcode
						Dim repeatcounter As Int = incolitems.GetInt("repeatcounter")
						Dim object_type As String = incolitems.GetString("object_type")
						
			
						Dim object_tagcode As String = incolitems.GetString("object_tagcode")
						Dim requester_tagcode As String = incolitems.GetString("requester_tagcode")
						Dim request_date As String = incolitems.GetString("request_date")
						Dim objecttagcode As String = incolitems.GetString("objecttagcode")
						Dim task_tagcode As String = task.Trim
				
						Dim sACLADatetime As String = Utils.GetCurrDatetime
						Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
						Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

						Dim sDate As String = Utils.GetCurrentDate
						Dim sTime As String = Utils.GetCurrentTimeExt
			
						Dim close_type As Int = incolitems.GetInt("close_type")
						Dim result_type As Int = incolitems.GetInt("result_type")
						Dim result_values As String = incolitems.GetString("result_values")
			
						CLAInfo.RequestResOptions = result_values
						CLAInfo.CloseType = close_type
						CLAInfo.RequestResult = result_type
						CLA.Status = Types.MakeInterv(ID, tagcode, status_id, Utils.ColorInt(status_id))
						CLA.Action = actionkey
						CLA.Task = task
						CLA.RepeatCounter = repeatcounter
						CLA.TaskType = tasktype
						Dim request_desc As String = incolitems.GetString("request_desc")
						Dim task_desc As String = incolitems.GetString("task_desc")
						Dim task_name As String = incolitems.GetString("task_name")
						Dim tipo_intervencao As String = incolitems.GetString("tipo_intervencao")
						Dim objectname As String = incolitems.GetString("objectname")
						Log($"${name} - ${nameobject} - ${request_desc} - ${task_desc} - ${task_name} - ${tipo_intervencao}"$)
						If Utils.Int2Bool(ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE) Then 'And Utils.Int2Bool(ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE) Then
							name = $"${name} - ${objectname}"$
						End If

			
						'NOVO PARAMETRO INICIO DAS CHECKLISTS - INTERVENCOES SIMPLES
				
						' APANHA O TYPEREQUEST_TAGCODE DA INTERVENCAO
						Dim typerequest_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode from dta_Requests where 1=1
															and tagcode = '${reqData.Tagcode.trim}'"$,"typerequest_tagcode")
				
								
						Dim JsonParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( 	$"select distinct paramters
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${typerequest_tagcode.Trim}'
												And task_tagcode='${task.trim}'"$, "paramters")	
				
						If JsonParams.ContainsKey("start_control") Then
							Try
								Dim start_control As Int = JsonParams.Get("start_control")
							Catch
								Dim start_control As Int = 0
								Log(LastException)
							End Try
						Else
							Dim start_control As Int = 0
						End If
						
				
						If Utils.Int2Bool(start_control) Then
							Dim r1 As ResumableSub = checkStartParameters(JsonParams,reqData.Tagcode.trim, status_id)
							Wait For (r1) Complete (Rsub As ReturnFromCantrolSub)
							If Rsub.TypeOfControl = 0 Then ' location
								If Not(Rsub.SubResult) Then
									Msgbox2Async($"Encontra-se fora da area definida. A Intervenção não pode prosseguir !"$, ShareCode.GeneralInfoTitle, "Ok", "", "", Null, False)
									Wait For Msgbox_Result (Result As Int)
									Return
								End If
							Else If Rsub.TypeOfControl = 1 Then ' Barcode
								If Not(Rsub.SubResult) Then
									If ShareCode.ScanList.Size > 0 Then 'Nova condição para só mostrar a mensagem se existirem codigos lidos
										Msgbox2Async($"O Valor lido não está correcto. A Intervenção não pode prosseguir !"$, ShareCode.GeneralInfoTitle, "Ok", "", "", Null, False)
										Wait For Msgbox_Result (Result As Int)
									End If
									Return
								End If
							End If
						End If
			
						If (status_id = 2) Then
							'******************************************************************
							' ACTION: INICIADO
							'******************************************************************
							CallSubDelayed3(CheckList3, "StartCLA_Activity", CLA, name)

						Else If (status_id >2) Then
							'******************************************************************
							'	FINALIZADO COM OU NÃO SUCESSO
							'******************************************************************
					
							If (Utils.Int2Bool(ShareCode.DEVICE_REOPEN_CHECKLISTS)) Then
								Msgbox2Async(ShareCode.RequestStartCLAClosed, ShareCode.GeneralAlertTitle, ShareCode.Option_VIEW, ShareCode.Option_CANCEL, ShareCode.Option_REOPEN,  Null, False)
								Wait For Msgbox_Result (Result As Int)
								If Result = DialogResponse.POSITIVE Then
									'******************************************************************
									' ACTION: APENAS VISUALIZA A CHECKLIST
									'******************************************************************
									CallSubDelayed3(CheckList3, "StartCLA_ActivityReadOnly", CLA, name)
								else If Result = DialogResponse.NEGATIVE Then
					
									'******************************************************************
									' ACTION: REABRE A CHECKLIST
									'******************************************************************
									status_id = 2
									CLA.Status.status = status_id
								
									CLA.Status.color = Utils.ColorInt(status_id)
									Dim sSQL As String = $"update dta_requests set status_id=${status_id} where tagcode='${tagcode}'"$
					
									Utils.SaveSQLToLog("ListaPrincipal_ItemClick",sSQL, tagcode)
									'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
					
									Dim params As Map
									params.Initialize
									params.Clear
									params.Put("_token", ShareCode.APP_TOKEN)
									params.Put("ACLARequest", tagcode)
									params.Put("ACLAState", 2)
									params.Put("ACLAUser", ShareCode.SESS_User)
									params.Put("ACLADatetime", sACLADatetime)
									params.Put("ACLALatitude", sACLALatitude)
									params.Put("ACLALongitude", sACLALongitude)
									params.Put("ACLAFirst", "0")
									params.Put("versionTagcode", Main.VersionTagcode)
									params.Put("_authorization", Main.DeviceAuthorization)
									params.Put("_instance", Main.DeviceInstance)
									params.put("_deviceBrand", Main.DeviceBrand)
									params.put("_deviceModel", Main.DeviceModel)
									params.put("_deviceMacAddress", Main.DeviceMacAddress)
									CLA.Info.Map1 = params
					
									Dim sSQL As String = $"update dta_requests_relations set status_id=${status_id}  where request_tagcode='${tagcode}'
										and relation_tagcode='${actionkey}' and repeatcounter=${repeatcounter}"$
									Utils.SaveSQLToLog("ListaPrincipal_ItemClick",sSQL, tagcode)
					
									Dim params As Map
									params.Initialize
									params.Clear
									params.Put("_token", ShareCode.APP_TOKEN)
									params.Put("ACLARequest", tagcode)
									params.Put("ACLAAction", actionkey)
									params.Put("ACLAState", 2)
									params.Put("ACLAUser", ShareCode.SESS_User)
									params.Put("ACLADatetime", sACLADatetime)
									params.Put("ACLAReqCounter", repeatcounter)
									params.Put("ACLALatitude", sACLALatitude)
									params.Put("ACLALongitude", sACLALongitude)
									params.Put("ACLAFirst", "0")
									params.Put("versionTagcode", Main.VersionTagcode)
									params.Put("_authorization", Main.DeviceAuthorization)
									params.Put("_instance", Main.DeviceInstance)
									params.put("_deviceBrand", Main.DeviceBrand)
									params.put("_deviceModel", Main.DeviceModel)
									params.put("_deviceMacAddress", Main.DeviceMacAddress)
									CLA.Info.Map2 = params
					
									Try
										CallSubDelayed3(CheckList3, "StartCLA_Activity", CLA, name)
									Catch
										Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
									End Try
					
								End If
							Else
								
								Msgbox2Async(ShareCode.RequestStartCLAClosedView, ShareCode.GeneralAlertTitle, ShareCode.Option_VIEW, ShareCode.Option_CANCEL, "", Null, False)
								Wait For Msgbox_Result (Result As Int)
								If Result = DialogResponse.POSITIVE Then
									'******************************************************************
									' ACTION: APENAS VISUALIZA A CHECKLIST
									'******************************************************************
									CallSubDelayed3(CheckList3, "StartCLA_ActivityReadOnly", CLA, name)
								End If
							End If
						
						Else
						
							'******************************************************************
							' ACTION: POR INICIAR
							'******************************************************************
							
							Msgbox2Async(ShareCode.RequestStartCLAExecution, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, ShareCode.Option_VIEW,  Null,False)
							Wait For Msgbox_Result (Result As Int)
							If Result = DialogResponse.POSITIVE Then
								Dim r_type As String = "TSKS_20191024_152533"
								Dim r_task As String = "TSKS_20190920_105227"
								Dim r_item As String = "PRAG0002"
								Dim r_unique As String = "ceb88c60-0f26-5ffc-9f34-3dc542ca04f1"
								Dim r_tag As String = "TSKSITMR_20191022_191732_01"
							
								Dim params As Map
								params.Initialize
								params.Clear
								params.Put("_token", ShareCode.APP_TOKEN)
								params.Put("ACLARequest", tagcode)
								params.Put("ACLAState", 2)
								params.Put("ACLAUser", ShareCode.SESS_User)
								params.Put("ACLADatetime", sACLADatetime)
								params.Put("ACLALatitude", sACLALatitude)
								params.Put("ACLALongitude", sACLALongitude)
								params.Put("ACLAFirst", "1")
								params.Put("versionTagcode", Main.VersionTagcode)
								params.Put("_authorization", Main.DeviceAuthorization)
								params.Put("_instance", Main.DeviceInstance)
								params.put("_deviceBrand", Main.DeviceBrand)
								params.put("_deviceModel", Main.DeviceModel)
								params.put("_deviceMacAddress", Main.DeviceMacAddress)
								CLA.Info.Map1 = params
					
												
								Dim params As Map
								params.Initialize
								params.Clear
								params.Put("_token", ShareCode.APP_TOKEN)
								params.Put("ACLARequest", tagcode)
								params.Put("ACLAAction", actionkey)
								params.Put("ACLAState", 2)
								params.Put("ACLAUser", ShareCode.SESS_User)
								params.Put("ACLADatetime", sACLADatetime)
								params.Put("ACLAReqCounter", repeatcounter)
								params.Put("ACLALatitude", sACLALatitude)
								params.Put("ACLALongitude", sACLALongitude)
								params.Put("ACLAFirst", "1")
								params.Put("versionTagcode", Main.VersionTagcode)
								params.Put("_authorization", Main.DeviceAuthorization)
								params.Put("_instance", Main.DeviceInstance)
								params.put("_deviceBrand", Main.DeviceBrand)
								params.put("_deviceModel", Main.DeviceModel)
								params.put("_deviceMacAddress", Main.DeviceMacAddress)
								CLA.Info.Map2 = params
						
								'****************************************************************************************************
								' CHECK: VALIDA E CARREGA CHECKLIST COM TITULOS/DESCRITIVOS DE OUTRAS INTERVENÇÕES DO MESMO OBJECTO
								'****************************************************************************************************
								If  ((ShareCode.APP_DOMAIN.ToLowerCase = "printcriativa") And (request_type = r_type) And (task = r_task)) Then
							
									Dim sRec As String = $"SELECT DISTINCT * FROM dta_requests_values
												WHERE request_tagcode='${tagcode}'
												And inner_request_tagcode='${actionkey}'
												And task_tagcode='${r_task}'
												And item_tagcode='${r_item}'
												And unique_key='${r_unique}'
												And tagcode='${r_tag}'
												And repeatcounter=0"$
									Private dRecord7 As Cursor = Starter.LocalSQLEVC.ExecQuery(sRec)
							
									If (dRecord7.RowCount >0) Then
										dRecord7.Position = 0
										Dim nPos As Int = dRecord7.GetInt("position")
										Dim currDate As String = Utils.IfNullOrEmpty(request_date, Utils.GetCurrentDate)
										Dim sdSQL As String = $"SELECT distinct a.tagcode, ifnull(a.typerequest_tagcode, '') as typerequest_tagcode,
													ifnull(b.title,'') AS tprequest_title, ifnull(c.title_import,'') AS entity_title,
													ifnull(d.title_import,'')  AS object_title, e.tagdesc AS status_title,
													a1.relation_tagcode, a1.inner_title
													FROM dta_requests AS a
													INNER JOIN dta_requests_relations AS a1 ON (a1.request_tagcode=a.tagcode)
													INNER JOIN dta_typerequests AS b ON (b.tagcode=a.typerequest_tagcode)
													LEFT JOIN dta_objects AS c ON (c.tagcode=a.entity_tagcode)
													LEFT JOIN dta_objects AS d ON (d.tagcode=a.object_tagcode)
													LEFT JOIN type_statustypes AS e ON (e.level=a.status_id)
													WHERE a.object_tagcode='${object_tagcode}' AND a.execute_date='${currDate}' AND a.status_id>2"$
										Private dRecord9 As Cursor = Starter.LocalSQLEVC.ExecQuery(sdSQL)
										Log(sdSQL)
										If dRecord9.RowCount > 0 Then
											For ndi = 0 To dRecord9.RowCount-1
												dRecord9.Position = ndi
												Dim theTitle As String = $"${dRecord9.GetString("tprequest_title")} (${dRecord9.GetString("tagcode")} - ${dRecord9.GetString("status_title")})"$
												If (ndi = 0) Then
													Dim InsUpdateStr As String = $"update dta_requests_values set title='${theTitle}'
												WHERE request_tagcode='${tagcode}'
												And inner_request_tagcode='${actionkey}'
												And task_tagcode='${r_task}'
												And item_tagcode='${r_item}'
												And unique_key='${r_unique}'
												And tagcode='${r_tag}'
												And repeatcounter=0"$ 
												Else
													Dim newID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
													Dim InsUpdateStr As String = $"insert into dta_requests_values
												(id,request_tagcode,inner_request_tagcode,task_tagcode,item_tagcode,unique_key,
												tagcode,position,execute_status,execute_value,created_at,repeatfieldcounter,title) values
												('${newID}','${tagcode}','${actionkey}','${r_task}','${r_item}',
													'${r_unique}','${r_tag}',
												${nPos},0,'','${Utils.GetCurrDatetime}','${ndi}','${theTitle}')"$
												End If
												Starter.LocalSQLEVC.ExecNonQuery(InsUpdateStr)
											Next
										End If
										dRecord9.Close
									End If
									dRecord7.Close
								End If
							
								' *****************************************************************
								' CHECK: VERIFICA SE TEM PARAMETROS ESPECÍFICOS
								' DTA_TASKS_ADDS->PARAMTERS ' Nova ResumableSub
								' *****************************************************************
								Dim TAD As ResumableSub = CheckTasksAdds(CLA)
								Wait For (TAD) complete (Finished As Boolean)
												
								' *****************************************************************
								' CHECK:  VERIFICA SE EXISTEM CAMPOS A ACTUALIZAR OS CAMPOS DA CHECKLIST
								' BASE DE DADOS -> CHECKLIST
								' *****************************************************************
																						
								If Utils.NNE(objecttagcode) And Not(objecttagcode = "__NONE__") Then
									
'									Dim RCL As RequestCLA = Types.MakeRequestCLA(tagcode,actionkey,task,repeatcounter, tasktype, _
'									 Types.MakeInterv(0, colitems.Tagcode, 0, Utils.ColorInt(0)), CLAInfo, Types.MakeOtherCLA("", "", ""))

'									Dim ChkObj As ResumableSub = CheckObjectsinCL(RCL, request_type, object_tagcode, object_type)
'									wait for (ChkObj) Complete (Finished As Boolean)
									
																		
									Private Record9 As Cursor
									
									' PEDRO ALPEDRINHA
									' ANALISAR O PORQUE DAS DIFERENCAS DOS SCRIPTS ENTRE CHECKLIST3 - AssociateObject e este
									If  (ShareCode.APP_DOMAIN.ToLowerCase = "gruposores") Then
										Dim sSQL As String = $"SELECT c.connectmode, c.connect2data, b.do_name, b.do_field, b.do_is_additional,
										b.task_tagcode, b.item_tagcode, b.unique_key, b.data_type, b.title
										FROM dta_requests_values AS a
										INNER JOIN dta_tasks_items AS b ON (b.task_tagcode=a.task_tagcode AND b.item_tagcode=a.item_tagcode AND b.unique_key=a.unique_key)
										INNER JOIN dta_tasks AS c ON (c.tagcode=b.task_tagcode)
										WHERE a.execute_status>=1
										AND a.request_tagcode='${tagcode.Trim}'
										AND a.task_tagcode='${actionkey.Trim}'
										AND a.repeatcounter='${repeatcounter}'
										AND ((b.do_name <> '' AND b.do_field <> '' AND c.connect2data <> '') or
										 (b.do_name = '__TYPEREQUEST__' AND b.do_field <> '' )) and b.task_tagcode=a.task_tagcode"$
									Else
										Dim sSQL As String = $"SELECT b.connectmode, b.connect2data, a.do_name, a.do_field, a.do_is_additional,
										a.task_tagcode, a.item_tagcode, a.unique_key, a.data_type, a.title
										FROM dta_tasks_items AS a
										INNER JOIN dta_tasks AS b ON (b.tagcode=a.task_tagcode)
										WHERE  ((a.do_name <> '' AND a.do_field <> '' AND b.connect2data <> '') or
										 (a.do_name = '__TYPEREQUEST__' AND a.do_field <> '' )) and a.task_tagcode='${actionkey.trim}'"$
									End If
										 
									Record9 = Starter.LocalSQLEVC.ExecQuery(sSQL)
									If Record9.RowCount > 0 Then
										For ni = 0 To Record9.RowCount-1
											Record9.Position = ni
											Dim connect2data As String = Record9.GetString("connect2data")
											Dim do_name As String = Record9.GetString("do_name")
											Dim do_field As String = Record9.GetString("do_field")
											Dim do_is_additional As Int = Record9.GetInt("do_is_additional")
											Dim task_tagcode As String = Record9.GetString("task_tagcode")
											Dim item_tagcode As String = Record9.GetString("item_tagcode")
											Dim unique_key As String = Record9.GetString("unique_key")
									
											If (do_name.ToUpperCase = "__TYPEREQUEST__") Then
												'VERIFICA SE OS CAMPOS FORAM LANÇADOS
												If (tagcode.StartsWith("IE_")) Then
													Dim insSQL As String = $"insert into dta_requests_fields (id, request_tagcode, field_tagcode)
														Select id, '${tagcode}' as request_tagcode, field_tagcode 
														from dta_typerequests_fields where typerequest_tagcode='${request_type}' 
														And '${tagcode}'||field_tagcode not in 
															(Select '${tagcode}'||field_tagcode as campo 
															from dta_requests_fields
															where request_tagcode='${tagcode}')"$
													'Starter.LocalSQLEVC.ExecNonQuery(insSQL)
													Utils.SaveSQLToLog("CriaCamposAdicionais",insSQL, tagcode)
													Dim params As Map
													params.Initialize
													params.Clear
													params.Put("_token", ShareCode.APP_TOKEN)
													params.Put("_user",ShareCode.SESS_User)
													params.Put("ACLARequest", tagcode)
													params.Put("ACLARequestType", request_type)
													params.Put("versionTagcode", Main.VersionTagcode)
													params.Put("_authorization", Main.DeviceAuthorization)
													params.Put("_instance", Main.DeviceInstance)
													params.put("_deviceBrand", Main.DeviceBrand)
													params.put("_deviceModel", Main.DeviceModel)
													params.put("_deviceMacAddress", Main.DeviceMacAddress)
													Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla-fields/create"$
													If Not(ShareCode.APP_WORKING_LOCAL) Then
														Utils.CallApi(0, params, Me, Url, "", tagcode)
													Else
														Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,actionkey.Trim,"")
														Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
													End If
													Sleep(500)
												End If
												 				
												' ERRO : ESTAVA request_type em vez de tagcode no request_tagcode
												Dim ObjSQL As String = $"select distinct value from dta_requests_fields where request_tagcode='${tagcode}' and field_tagcode='${do_field}'"$
												Private Record99 As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjSQL)
												If Record99.RowCount > 0 Then
													For nii = 0 To Record99.RowCount-1
														Record99.Position = nii
														Dim val As String = Utils.IfNullOrEmpty(Record99.GetString("value"), "")
														Dim NewSQL As String = $"update dta_requests_values set execute_status=1, execute_value='${val}'
															where request_tagcode='${tagcode}' 
															and inner_request_tagcode='${actionkey}'
															and task_tagcode='${task_tagcode}'
															and item_tagcode='${item_tagcode}'
															and repeatcounter=${repeatcounter} "$
														'And unique_key='${unique_key}'
														Try
															Starter.LocalSQLEVC.ExecNonQuery(NewSQL)
														Catch
															Log($"Erro de campo: ${LastException}"$)
														End Try
														
														Dim params As Map
														params.Initialize
														params.Clear
														params.Put("_token", ShareCode.APP_TOKEN)
														params.Put("ACLARequest", CLA.Request)
														params.Put("ACLAAction", CLA.Action)
														params.Put("ACLATask", CLA.Task)
														params.Put("ACLAItem",item_tagcode)
														params.Put("ACLAUniqueKey", unique_key)
														'														params.Put("ACLATagcode", tagcode)
														params.Put("ACLAValue", val)
														params.Put("ACLAReqCounter", repeatcounter)
														params.Put("ACLARepeatItem", 0)
														params.Put("ACLARepeatField", 0)
														params.Put("ACLAInner", 0)
														params.Put("versionTagcode", Main.VersionTagcode)
														params.Put("_authorization", Main.DeviceAuthorization)
														params.Put("_instance", Main.DeviceInstance)
														params.put("_deviceBrand", Main.DeviceBrand)
														params.put("_deviceModel", Main.DeviceModel)
														params.put("_deviceMacAddress", Main.DeviceMacAddress)
														params.Put("_user", ShareCode.SESS_User)
														Dim sACLADatetime As String = Utils.GetCurrDatetime
														Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
														Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
									
														params.Put("ACLADatetime", sACLADatetime)
														params.Put("ACLALatitude", sACLALatitude)
														params.Put("ACLALongitude", sACLALongitude)
														Dim ACLSessUser As String = ShareCode.SESS_OPER_User
			
														params.Put("ACLSessUser", ACLSessUser)
														params.Put("ACLClear", 0)
					
														Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/update"$
														If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
															If Not(ShareCode.APP_WORKING_LOCAL) Then
																Utils.CallApi(0, params, Me, Url, "", CLA.Request)
															Else
																Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,actionkey.Trim,"")
																Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
															End If
															Sleep(250)
														Else
															Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,actionkey.Trim,"")
															Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
														End If'
														Sleep(100)
													Next
												End If
												Record99.Close
											Else
												' ******************************************************************
												' CHECK: CAMPOS RELACIONADOS COM O OBJECTO SELECIONADO / IDENTIFICADO
												' COMPARAR E VALIDAR SE O DO_NAME É IGUAL AO TIPO DE OBJECTO
												' "object_type"
												' ******************************************************************
												
												If (do_name = object_type) Then
													If (do_is_additional = 1) Then
														Dim ObjSQL As String = $"select distinct `value` from dta_objects_fields where object_tagcode='${object_tagcode}'
																		and field_tagcode='${do_field}'"$
													Else
														If Utils.FieldInList(do_field, "address|address2|postalcode|phone|local|latitude|longitude|block|floor|door") Then
															Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_locations where tagcode in
																	(select local_tagcode from dta_objects where tagcode='${object_tagcode}')"$
														Else If Utils.FieldInList(do_field, "name|phone|email|mobile") Then
															Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_contacts where tagcode in
															(select contact_tagcode from dta_objects_contacts where object_tagcode='${object_tagcode}' limit 1)"$
														Else
															Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_objects where tagcode='${object_tagcode}'"$
														End If
													
														Log(ObjSQL)
													End If
													Private Record99 As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjSQL)
													If Record99.RowCount > 0 Then
														For nii = 0 To Record99.RowCount-1
															Record99.Position = nii
															Dim val As String = Utils.IfNullOrEmpty(Record99.GetString("value"), "")
															Dim NewSQL As String = $"update dta_requests_values set execute_status=1, execute_value='${val}',
															object_tagcode='${object_tagcode}'
															where request_tagcode='${tagcode}' 
															and inner_request_tagcode='${actionkey}'
															and task_tagcode='${task_tagcode}'
															and item_tagcode='${item_tagcode}'
															and unique_key='${unique_key}'
															and repeatcounter=${repeatcounter} "$
															Log(NewSQL)
															Try
																Utils.SaveSQLToLog("ListaPrincipal_ItemClick",NewSQL, tagcode)
																'Starter.LocalSQLEVC.ExecNonQuery(NewSQL)
															Catch
																Log($"Erro de campo: ${LastException}"$)
															End Try
														Next
													End If
													Record99.Close
												End If
									
											End If
									
										Next
									End If
									Record9.Close
									
								End If
								
								
								
								' ************************************************************************************
								'CHECK: ADICIONAR CAMPOS ESPECIFICOS DAS EDP SE VIER COM O OBJECTO PREENCHIDO
								' ************************************************************************************
								Dim res As ResumableSub = FillAdditionalFields(CLA, tagcode, task_tagcode)
								Wait For (res) Complete (Finished As Boolean)
								
								' *****************************************************************
								' CHECK: VERIFICA SE TEM PARAMETROS ESPECÍFICOS
								' DTA_TYPEREQUESTS_TASKS_ADDS->PARAMTERS
								' *****************************************************************
								Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${request_type.Trim}'
												And task_tagcode='${task_tagcode.trim}'"$, "paramters")	
								
								If QuestParams.ContainsKey("upload_data") Then
									Try
										Dim upload_data As Int = QuestParams.Get("upload_data")
									Catch
										Dim upload_data As Int = 0
										Log(LastException)
									End Try
								Else
									Dim upload_data As Int = 0
								End If
								
							
								If Utils.Int2Bool(upload_data) Then
									
									Dim up_settings As Map = QuestParams.Get("up_settings")
									Dim upload_data_start As Int = up_settings.Get("upload_data_start")
									
									If Utils.Int2Bool(upload_data_start) Then
										Dim ud_settings_start As Map = up_settings.Get("ud_settings_start")
										Dim data_tagcode As String = ud_settings_start.Get("data_tagcode")
										Dim data_group As String = ud_settings_start.Get("data_group")
										Dim data_subgroup As String = ud_settings_start.Get("data_subgroup")
										Dim data_origin As String = ud_settings_start.Get("data_origin")
										
										If (data_origin.ToUpperCase = "TINOUT_CHECKLISTS") Then
											Dim chapters As List = ud_settings_start.Get("chapters")
											For Each colchapters As Map In chapters
											
												Dim chapter_in As String = colchapters.Get("chapter_in")
												Dim chapter_out As String = colchapters.Get("chapter_out")
												Dim chapter_repeat As Int = colchapters.Get("chapter_repeat")
											
												'*************************************************************
												' IDENTIFICA O TOTAL DE REGISTOS DE CAPITULOS REPETIDOS
												'*************************************************************
												Dim SQLRepeatedItems As String = $"select distinct repeatitemcounter from dta_requests_values
																		where request_tagcode='${tagcode.Trim}' 
																		and task_tagcode='${data_tagcode}' 
																		And item_tagcode='${chapter_in}'"$
												Dim RepeatedItems As Cursor = Starter.LocalSQLEVC.ExecQuery(SQLRepeatedItems)
												Dim ReqRows As Int = RepeatedItems.RowCount
												If (ReqRows >= 1) Then
												
													Dim items As List = colchapters.Get("items")
													If Not(Utils.Int2Bool(chapter_repeat)) Then
														ReqRows = 1
													End If
												
													For rpos=0 To ReqRows-1
														RepeatedItems.Position = rpos
														If (rpos = 0) Then
															Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
															Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																	tagcode,position,
																	execute_status, execute_value, execute_value_title, title, execute_format_title,
																	confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)
																	select ${maxID}, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																	tagcode,position, 0, '', '', '', execute_format_title, confirmed,changed_value, 
																	repeatcounter, ${rpos}  AS repeatitemcounter, 
																	repeatfieldcounter,val_min, val_max
																	from dta_requests_values As a where
																	a.item_tagcode||a.unique_key in (Select item_tagcode||unique_key
																		from dta_tasks_items where (parent_tagcode in (Select unique_key from dta_tasks_items 
																		where item_tagcode='${chapter_out.Trim}' and repeated=1)) or 
																			(item_tagcode='${chapter_out.Trim}' and repeated=1)) 
																	And a.repeatcounter=${repeatcounter} 
																	and repeatitemcounter=0
																	and a.request_tagcode='${tagcode.Trim}'
																	and a.task_tagcode='${task_tagcode.Trim}'  order by a.position"$


															Log(sSQL)
															Utils.SaveSQLToLog("butAddMore_Click",sSQL, tagcode)
														End If
													Next
												
													For rpos=0 To ReqRows-1
														RepeatedItems.Position = rpos
													
														For Each upcolitems As Map In items
															Dim val_field_in As String = upcolitems.Get("val_field_in")
															Dim val_field_out As String = upcolitems.Get("val_field_out")
															Dim item_tagcode_in As String = upcolitems.Get("item_tagcode_in")
															Dim item_tagcode_out As String = upcolitems.Get("item_tagcode_out")
														
															Dim set_object_field As Int = upcolitems.Get("set_object_field")
															Dim set_title_field As Int = upcolitems.Get("set_title_field")
															Dim set_subobject_field As Int = upcolitems.Get("set_subobject_field")
															Dim set_status As Int = upcolitems.Get("set_status")
														
															Dim colsin As String = val_field_in
															If Utils.Int2Bool(set_object_field) Then
																colsin = $"${Utils.IfNotNullOrEmpty(colsin, $"${colsin}, object_tagcode"$)}"$
															End If
															If Utils.Int2Bool(set_title_field) Then
																colsin = $"${Utils.IfNotNullOrEmpty(colsin, $"${colsin}, title"$)}"$
															End If
															If Utils.Int2Bool(set_subobject_field) Then
																colsin = $"${Utils.IfNotNullOrEmpty(colsin, $"${colsin}, subobject_tagcode"$)}"$
															End If
															If Utils.Int2Bool(set_status) Then
																colsin = $"${Utils.IfNotNullOrEmpty(colsin, $"${colsin}, execute_status"$)}"$
															End If
														
															Dim r110SQL As String = $"select ${colsin} from dta_requests_values where 1=1
																				and request_tagcode='${tagcode.Trim}'
																				and task_tagcode='${data_tagcode.Trim}'
																				and item_tagcode='${item_tagcode_in.Trim}'
																				And repeatcounter='${repeatcounter}'
																				And repeatitemcounter='${rpos}'"$
																				
															
															Dim r110 As Cursor = Starter.LocalSQLEVC.ExecQuery(r110SQL)
															If (r110.RowCount >= 1) Then
																For rr1=0 To r110.RowCount-1
																	r110.Position = rr1
																	
																	Dim colsout As String = $"${val_field_out}='${r110.GetString(val_field_in)}'"$
																	If Utils.Int2Bool(set_object_field) Then
																		colsout = $"${Utils.IfNotNullOrEmpty(colsout, $"${colsout}, object_tagcode='${r110.GetString("object_tagcode")}'"$)}"$
																	End If
																	If Utils.Int2Bool(set_title_field) Then
																		colsout = $"${Utils.IfNotNullOrEmpty(colsout, $"${colsout}, title='${r110.GetString("title")}'"$)}"$
																	End If
																	If Utils.Int2Bool(set_subobject_field) Then
																		colsout = $"${Utils.IfNotNullOrEmpty(colsout, $"${colsout}, subobject_tagcode='${r110.GetString("subobject_tagcode")}'"$)}"$
																	End If
																	If Utils.Int2Bool(set_status) Then
																		colsout = $"${Utils.IfNotNullOrEmpty(colsout, $"${colsout}, execute_status='${r110.GetString("execute_status")}'"$)}"$
																	End If
																
																	Dim updSQLRec As String = $"update dta_requests_values set ${colsout}
																			where 1=1
																			and request_tagcode='${tagcode.Trim}'
																			and task_tagcode='${task_tagcode.Trim}'
																			and item_tagcode='${item_tagcode_out.Trim}'
																			And repeatcounter='${repeatcounter}' 
																			And repeatitemcounter='${rpos}'"$
																			
																	Log(updSQLRec)
																	Try
																		Utils.SaveSQLToLog("ListaPrincipal_ItemClick",updSQLRec, tagcode)
																	Catch
																		Log($"Erro de campo: ${LastException}"$)
																	End Try
																
																Next
															End If
															r110.Close
														Next
													
													Next
												End If
												RepeatedItems.Close

											Next
										End If
										

									End If
								End If
								
								'*******************************************************************
								' TIP : EVENTOS DE CARREGAMENTO DE CHECKLIST
								'*******************************************************************
								
								
								Dim CTRTP3 As ResumableSub = CheckTypeRequestTaskParamters3(CLA.Request, CLA.Action,request_type.trim, objecttagcode.trim, 1)
								Wait For (CTRTP3) Complete (EndCheck As Boolean)
								Sleep(100)
						
						
								If (Utils.NNE(objecttagcode) And Not(objecttagcode = "__NONE__")) Then
									Dim ress As ResumableSub = UploadDataParamters(CLA, tagcode)
									Wait For(ress) Complete (Ended As Boolean)
								End If
								Sleep(250)
								

								' *****************************************************************
								' VERIFICA SE EXISTEM CAMPOS A ACTUALIZAR A TABELA
								' *****************************************************************
								Dim sSQL As String = $"update dta_requests set status_id=2, run_date='${sDate}', run_start='${sTime}' where tagcode='${tagcode}'"$
								Utils.SaveSQLToLog("ListaPrincipal_ItemClick",sSQL, tagcode)
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
								params.Put("ACLAFirst", "1")
								params.Put("ACLALatitude", sACLALatitude)
								params.Put("ACLALongitude", sACLALongitude)
								params.Put("versionTagcode", Main.VersionTagcode)
								params.Put("_authorization", Main.DeviceAuthorization)
								params.Put("_instance", Main.DeviceInstance)
								params.put("_deviceBrand", Main.DeviceBrand)
								params.put("_deviceModel", Main.DeviceModel)
								params.put("_deviceMacAddress", Main.DeviceMacAddress)
								params.Put("_user", ShareCode.SESS_User)
								CLA.Info.Map1 = params
					
					
								'TIP:  ACTUALIZA O ESTADO DA INTERVENCAO NO SERVIDOR APOS EXECUTA-LA PELA PRIMEIRA VEZ
								Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla-satus/update"$
								If Not(ShareCode.APP_WORKING_LOCAL) Then
									Utils.CallApi(0, params, Me, Url, "", tagcode)
								Else
									Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,actionkey.Trim,"")
									Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
								End If
								Sleep(500)
									
								Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'
									where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}' and repeatcounter=${repeatcounter}"$
								Utils.SaveSQLToLog("ListaPrincipal_ItemClick",sSQL, tagcode)
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
								params.Put("ACLAFirst", "1")
								params.Put("ACLAReqCounter", repeatcounter)
								params.Put("ACLALatitude", sACLALatitude)
								params.Put("ACLALongitude", sACLALongitude)
								params.Put("versionTagcode", Main.VersionTagcode)
								params.Put("_authorization", Main.DeviceAuthorization)
								params.Put("_instance", Main.DeviceInstance)
								params.put("_deviceBrand", Main.DeviceBrand)
								params.put("_deviceModel", Main.DeviceModel)
								params.put("_deviceMacAddress", Main.DeviceMacAddress)
								params.Put("_user", ShareCode.SESS_User)
								CLA.Info.Map2 = params
								status_id = 2
								CLA.Status.status = status_id
								
								Dim CTRTP As ResumableSub = CheckTypeRequestTaskParamters(CLA.Request, CLA.Action, request_type.Trim, objecttagcode.trim)
								Wait For (CTRTP) Complete (EndCheck As Boolean)
								
								
								Dim CTRTP2 As ResumableSub = CheckTypeRequestTaskParamters2(CLA.Request, CLA.Action, request_type.Trim, objecttagcode.trim, 1)
								Wait For (CTRTP2) Complete (EndCheck As Boolean)
								
								ProgressDialogShow2(ShareCode.GeneralLoadingMessage,False)
								Sleep(5000) ' Aguarda 5 segundos para ter tempo de finalizar tudo o que estiver ainda a processar
								ProgressDialogHide
								
								Try
									CallSubDelayed3(CheckList3, "StartCLA_Activity", CLA, name)
								Catch
									Log(LastException)
									Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
								End Try

							Else If Result = DialogResponse.NEGATIVE Then
								Try
									CallSubDelayed3(CheckList3, "StartCLA_ActivityReadOnly", CLA, name)
								Catch
									Log(LastException)
									Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
								End Try
							Else
'								cancelou
							End If
						End If
					Else
						Log("NAO TEM DADOS")
						ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
						Dim res As ResumableSub = ForceGetRequests(reqData.Tagcode)
						Wait For(res) Complete (Downloaded As Boolean)
							
						If (Downloaded) Then
							ProgressDialogHide
							If ShareCode.CurrentRequestClickedIndex >= 0 Then
								Dim ActualIndex As Int = ShareCode.CurrentRequestClickedIndex + 1
								ListaPrincipal_ItemClick(ActualIndex, reqData.Tagcode.Trim)
							End If
						Else
							ProgressDialogHide
							MsgboxAsync("Não foi possivel Abrir a intervenção!",ShareCode.GeneralErrorTitle)
						End If
					End If
				Else ' NOTE: ENTRADA NAS INTERVENCOES AGRUPADORAS
					
					ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
					ListaPrincipalClickItem = Index
					Log($"Tipo: ${colitems.RequestType}, Pagina: ${CurrentTabPage}"$)
					Try
				
						CreateRequestItemLevelFirst(1, colitems, 100%x, 105dip, Null, CLA)
						CurrentTabPage = 1
						Sleep(100)
						TabPageState(CurrentTabPage, True)
						listsTabPanel.ScrollTo(CurrentTabPage, True)
				
						Log($"Tipo: ${colitems.RequestType}, Pagina: ${CurrentTabPage}"$)
					Catch
						Log(LastException)
					End Try
					ProgressDialogHide
				End If
			Else
				Log("nada")
			End If
			ProgressDialogHide

		End If
		
	Else
		ToastMessageShow("Identificador/posição do item desconhecido!", False)
	End If
	

End Sub


Sub FillAdditionalFields(CLA As RequestCLA, req_tagcode As String, task_tagcode As String) As ResumableSub
	
		
	Dim obj_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode from dta_requests where 1=1
																	and tagcode = '${req_tagcode}'"$,"object_tagcode")
																	
	If Utils.NNE(obj_tagcode) Then
		Dim FIELD_CLIENT_PSE As String = DBStructures.GetScriptColumnStrEVC($"select title_import from dta_objects where tagcode
										in (select parent_tagcode from dta_objects where tagcode = '${obj_tagcode}')"$,"title_import")
	
		Dim AUTHUSR As String = DBStructures.GetScriptColumnStrEVC($"select value from dta_objects_fields where
																	object_tagcode = '${obj_tagcode}' and field_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'"$,"value")
		
		If Utils.NNE(AUTHUSR) Then
			Dim FIELD_EDPC_CONTRACT_MANAGER As String = DBStructures.GetScriptColumnStrEVC($"select name from aut_users where tagcode = '${AUTHUSR}'"$,"name")
		Else
			Dim FIELD_EDPC_CONTRACT_MANAGER As String = ""
		End If
		
		Dim FIELD_TECHNICAL_NAME As String = ShareCode.SESS_OPER_UserName
		Dim FIELD_TECHNICAL As String = ShareCode.SESS_OPER_User
		
		
		ShareCode.DEVICE_FIELDREPORTDATETIME_SYSOREXEC = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_FIELDREPORTDATETIME_SYSOREXEC"), 0)
		Dim DATA_SYSOREXEC As Boolean = Utils.Int2Bool(ShareCode.DEVICE_FIELDREPORTDATETIME_SYSOREXEC)
		
		If DATA_SYSOREXEC Then
			Dim FIELD_REPORTDATE As String = DBStructures.GetScriptColumnStrEVC($"select execute_date from dta_requests where tagcode = '${req_tagcode}')"$,"execute_date")
			Dim FIELD_REPORTTIME As String = DBStructures.GetScriptColumnStrEVC($"select execute_start from dta_requests where tagcode = '${req_tagcode}')"$,"execute_start")
		Else
			Dim FIELD_REPORTDATE As String = Utils.GetCurrentDate
			Dim FIELD_REPORTTIME As String = Utils.GetCurrentTimeExt
		End If
		
	'TIP : Update Local
		Dim UpdRV As String = $"update dta_requests_values set execute_value = '${FIELD_CLIENT_PSE}' where 1=1
								And request_tagcode = '${req_tagcode}'
								And task_tagcode = '${task_tagcode}'
								And item_tagcode = 'FIELD_CLIENT_PSE'"$
		Starter.LocalSQLEVC.ExecNonQuery(UpdRV)
		Sleep(100)
		'TIP : Update Servidor
		Dim UK As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
															And	request_tagcode = '${req_tagcode}'
															And task_tagcode = '${task_tagcode}'
															And item_tagcode = 'FIELD_CLIENT_PSE'"$,"unique_key")
	
		Dim repeatCounter As Int = DBStructures.GetScriptColumnIntEVC($"select repeatcounter from dta_requests_values where 1=1
															and	request_tagcode = '${req_tagcode}'
															and task_tagcode = '${task_tagcode}'
															and item_tagcode = 'FIELD_CLIENT_PSE'"$,"repeatcounter")
															
		Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_Update(CLA,"FIELD_CLIENT_PSE",UK,FIELD_CLIENT_PSE,"",repeatCounter)
		Wait For (RUpdSvr) Complete (EndUpdate As Boolean)
		
		Dim UpdRV As String = $"update dta_requests_values set execute_value = '${FIELD_EDPC_CONTRACT_MANAGER}', 
								execute_value_title = '${FIELD_EDPC_CONTRACT_MANAGER}',
								object_tagcode = '${AUTHUSR}'
								where 1=1
								And request_tagcode = '${req_tagcode}'
								And task_tagcode = '${task_tagcode}'
								And item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'"$
		Starter.LocalSQLEVC.ExecNonQuery(UpdRV)
		Sleep(100)
		'TIP : Update Servidor
		Dim UK As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
															And	request_tagcode = '${req_tagcode}'
															And task_tagcode = '${task_tagcode}'
															And item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'"$,"unique_key")
	
		Dim repeatCounter As Int = DBStructures.GetScriptColumnIntEVC($"select repeatcounter from dta_requests_values where 1=1
															and	request_tagcode = '${req_tagcode}'
															and task_tagcode = '${task_tagcode}'
															and item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'"$,"repeatcounter")
															
		Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_Update(CLA,"FIELD_EDPC_CONTRACT_MANAGER",UK,FIELD_EDPC_CONTRACT_MANAGER,AUTHUSR,repeatCounter)
		Wait For (RUpdSvr) Complete (EndUpdate As Boolean)
		
		
		Dim UpdRV As String = $"update dta_requests_values set execute_value = '${FIELD_REPORTDATE}' where 1=1
								And request_tagcode = '${req_tagcode}'
								And task_tagcode = '${task_tagcode}'
								And item_tagcode = 'FIELD_REPORTDATE'"$
		Starter.LocalSQLEVC.ExecNonQuery(UpdRV)
		Sleep(100)
		'TIP : Update Servidor
		Dim UK As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
															And	request_tagcode = '${req_tagcode}'
															And task_tagcode = '${task_tagcode}'
															And item_tagcode = 'FIELD_REPORTDATE'"$,"unique_key")
	
		Dim repeatCounter As Int = DBStructures.GetScriptColumnIntEVC($"select repeatcounter from dta_requests_values where 1=1
															and	request_tagcode = '${req_tagcode}'
															and task_tagcode = '${task_tagcode}'
															and item_tagcode = 'FIELD_REPORTDATE'"$,"repeatcounter")
															
		Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_Update(CLA,"FIELD_REPORTDATE",UK,FIELD_REPORTDATE,"",repeatCounter)
		Wait For (RUpdSvr) Complete (EndUpdate As Boolean)
		
		Dim UpdRV As String = $"update dta_requests_values set execute_value = '${FIELD_REPORTTIME}' where 1=1
								And request_tagcode = '${req_tagcode}'
								And task_tagcode = '${task_tagcode}'
								And item_tagcode = 'FIELD_REPORTTIME'"$
		Starter.LocalSQLEVC.ExecNonQuery(UpdRV)
		Sleep(100)
		
		Dim UK As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
															And	request_tagcode = '${req_tagcode}'
															And task_tagcode = '${task_tagcode}'
															And item_tagcode = 'FIELD_REPORTTIME'"$,"unique_key")
	
		Dim repeatCounter As Int = DBStructures.GetScriptColumnIntEVC($"select repeatcounter from dta_requests_values where 1=1
															and	request_tagcode = '${req_tagcode}'
															and task_tagcode = '${task_tagcode}'
															and item_tagcode = 'FIELD_REPORTTIME'"$,"repeatcounter")
															
		Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_Update(CLA,"FIELD_REPORTTIME",UK,FIELD_REPORTTIME,"",repeatCounter)
		Wait For (RUpdSvr) Complete (EndUpdate As Boolean)
		
		Dim UpdRV As String = $"update dta_requests_values set execute_value = '${FIELD_TECHNICAL_NAME}' where 1=1
								And request_tagcode = '${req_tagcode}'
								And task_tagcode = '${task_tagcode}'
								And item_tagcode = 'FIELD_TECHNICAL'"$
		Starter.LocalSQLEVC.ExecNonQuery(UpdRV)
		Sleep(100)
		'TIP : Update Servidor
		Dim UK As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
															And	request_tagcode = '${req_tagcode}'
															And task_tagcode = '${task_tagcode}'
															And item_tagcode = 'FIELD_TECHNICAL'"$,"unique_key")
	
		Dim repeatCounter As Int = DBStructures.GetScriptColumnIntEVC($"select repeatcounter from dta_requests_values where 1=1
															and	request_tagcode = '${req_tagcode}'
															and task_tagcode = '${task_tagcode}'
															and item_tagcode = 'FIELD_TECHNICAL'"$,"repeatcounter")
															
		Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_Update(CLA,"FIELD_TECHNICAL",UK,FIELD_TECHNICAL_NAME,FIELD_TECHNICAL,repeatCounter)
		Wait For (RUpdSvr) Complete (EndUpdate As Boolean)

	End If
	
	Return True
	
End Sub

Sub ActualizaSvr_CLAI_Update (CLA As RequestCLA, itemTC As String, UK As String, val2fill As String, ObjVal As String,repcnt As Int) As ResumableSub
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", CLA.Request)
	params.Put("ACLAAction", CLA.Action)
	params.Put("ACLATask", CLA.Task)
	params.Put("ACLAItem",itemTC)
	params.Put("ACLAUniqueKey", UK)
'	params.Put("ACLATagcode", tagcode)
	params.Put("ACLAObjectTag", ObjVal)
	params.Put("ACLAValue", val2fill)
	params.Put("ACLAReqCounter", repcnt)
	params.Put("ACLARepeatItem", 0)
	params.Put("ACLARepeatField", 0)
	params.Put("ACLAInner", 0)
														
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim sACLADatetime As String = Utils.GetCurrDatetime
	Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

	params.Put("ACLADatetime", sACLADatetime)
	params.Put("ACLALatitude", sACLALatitude)
	params.Put("ACLALongitude", sACLALongitude)
	Dim ACLSessUser As String = ShareCode.SESS_OPER_User
			
	params.Put("ACLSessUser", ACLSessUser)
	params.Put("ACLClear", 0)
					
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/update"$
	If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", CLA.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CLA.Request.Trim,CLA.Task.Trim,itemTC.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CLA.Request.Trim,CLA.Task.Trim,itemTC.Trim)
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If'
	
	Return True
	
End Sub


'**************************************************************************************************
' TIP: EXECUTA/ABRE/REABRE/VISUALIZA A CHECKLIST SELECIONADA DA INTERVENÇÃO AGRUPADORA
'**************************************************************************************************
'	CLICA LISTA SECUNDÁRIA
'	listRequestsItem
'**********************************************************************************

Sub listRequestsItem_ItemClick (Index As Int, Value As Object)
	
	If (Not(listRequestsItem.Size=0) And (Index>= 0)) Then
		Dim p As Panel  = listRequestsItem.GetPanel(Index)
		Dim data As RequestCLA = p.Tag
		Dim tasktype As Int = data.TaskType
		Log($"${data.Task}, ${data.TaskType}"$)

		If (tasktype = 2) Then
		
'		Utils.LogUserAction("TUSRLGOT_12", Me)
'		Sleep(250)
		
			Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS
			sSQL = $"${sSQL} and z.request_tagcode='${data.Request}' and z.relation_tagcode='${data.Action}' and z.repeatcounter=${data.RepeatCounter}"$
			Log(sSQL)
			Log(data.Request)
			Private incolitems As Cursor
			incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)
			If (incolitems.RowCount >= 1) Then
				incolitems.Position = 0

				Dim ID As Int = incolitems.GetInt("id")
				Dim tasktype As Int = incolitems.GetInt("type")
				Dim status_id As Int = incolitems.GetInt("rel_status_id")
				Dim tagcode As String = incolitems.GetString("tagcode")
				Dim actionkey As String = incolitems.GetString("action_tagcode")
				Dim task As String = incolitems.GetString("task_tagcode")
				Dim name As String = incolitems.GetString("name")
'				Dim request_obs As String = incolitems.GetString("request_obs")
'				Dim RequestType As Int = incolitems.GetInt("RequestType")
				Dim repeatcounter As Int = incolitems.GetInt("repeatcounter")
			
				Dim request_desc As String = incolitems.GetString("request_desc")
				Dim task_desc As String = incolitems.GetString("task_desc")
				Dim task_name As String = incolitems.GetString("task_name")
				Dim tipo_intervencao As String = incolitems.GetString("tipo_intervencao")
				Dim objectname As String = incolitems.GetString("objectname")
				Dim objecttagcode As String = incolitems.GetString("objecttagcode")
				Dim request_type As String = incolitems.GetString("request_type")
				Dim object_tagcode As String = incolitems.GetString("object_tagcode")
				Dim object_tagcode_rel As String = incolitems.GetString("object_tagcode_rel")
				Dim object_type As String = incolitems.GetString("object_type")
				Dim object_type_rel As String = incolitems.GetString("object_type_rel")
			
				Log($"${name} - ${objectname} - ${request_desc} - ${task_desc} - ${task_name} - ${tipo_intervencao}"$)
				If Utils.Int2Bool(ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE) Then 'And Utils.Int2Bool(ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE) Then
					name = $"${name} - ${objectname}"$
				End If
			
				Dim sACLADatetime As String = Utils.GetCurrDatetime
				Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
				Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

				Dim sDate As String = Utils.GetCurrentDate
				Dim sTime As String = Utils.GetCurrentTimeExt
			
				Dim close_type As Int = incolitems.GetInt("close_type")
				Dim result_type As Int = incolitems.GetInt("result_type")
				Dim result_values As String = incolitems.GetString("result_values")
			
				Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(1, close_type, result_type, _
											 result_values, False, 0, 0, 0, Null, Null, ListaPrincipalClickItem)
				Dim CLA As RequestCLA = Types.MakeRequestCLA(tagcode, actionkey, task, repeatcounter, tasktype, _
								Types.MakeInterv(ID, tagcode, status_id, Utils.ColorInt(status_id)), CLAInfo, _
								Types.MakeOtherCLA("", "", ""))
			
			
				'NOVO PARAMETRO INICIO DAS CHECKLISTS - INTERVENCOES SIMPLES
				
				' APANHA O TYPEREQUEST_TAGCODE DA INTERVENCAO
				Dim typerequest_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode from dta_Requests where 1=1
															and tagcode = '${data.Request.trim}'"$,"typerequest_tagcode")
				
								
				Dim JsonParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( 	$"select distinct paramters
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${typerequest_tagcode.Trim}'
												And task_tagcode='${task.trim}'"$, "paramters")	
				
				
				If JsonParams.ContainsKey("start_control") Then
					Try
						Dim start_control As Int = JsonParams.Get("start_control")
					Catch
						Dim start_control As Int = 0
						Log(LastException)
					End Try
				Else
					Dim start_control As Int = 0
				End If
				
				
				If Utils.Int2Bool(start_control) Then
					Dim r2 As ResumableSub = checkStartParameters(JsonParams,data.Request.trim, status_id)
					Wait For (r2) Complete (good2go As Boolean)
					If Not(good2go) Then
						If ShareCode.ScanList.Size > 0 Then 'Nova condição para só mostrar a mensagem se existirem codigos lidos
							Msgbox2Async($"O Valor lido não está correcto. A Intervenção não pode prosseguir !"$, ShareCode.GeneralInfoTitle, "Ok", "", "", Null, False)
							Wait For Msgbox_Result (Result As Int)
						End If
						Return
					End If
				End If	
			
				If (status_id = 2) Then ' CHAMA A CHECKLIST A PARTIR DAS INTERVENCOES TIP : status_id=2 = CHECKLIST EM EXECUCAO
					
					CallSubDelayed3(CheckList3, "StartCLA_Activity_Child", CLA, name)
				Else If (status_id >2) Then 'TIP : status_id=3 = CHECKLIST FECHADA COM SUCESSO E status_id=4 CHECKLIST FECHADA COM NAOCONFORMIDADES
				
					If (Utils.Int2Bool(ShareCode.DEVICE_REOPEN_CHECKLISTS)) Then

'						Utils.Int2Bool(ShareCode.DEVICE_REOPEN_ONLY_ONRANGE) ' VERIFICACAO SE ESTA DENTRO DA AREA GEOGRAFICA CORRECTA

						Dim i As Int
						i = Msgbox2(ShareCode.RequestStartCLAClosed, ShareCode.GeneralAlertTitle, ShareCode.Option_VIEW, ShareCode.Option_CANCEL, ShareCode.Option_REOPEN,  Null)
						If (i=DialogResponse.POSITIVE) Then
							CallSubDelayed3(CheckList3, "StartCLA_ActivityReadOnly", CLA, name)
						else If (i=DialogResponse.NEGATIVE) Then
					
							status_id = 2
							CLA.Status.status = status_id
							CLA.Status.color = Utils.ColorInt(status_id)

							Dim params As Map
							params.Initialize
							If (DBStructures.getMainRequestStatus(tagcode) <=1) Then
								Dim sSQL As String = $"update dta_requests set status_id=2 where tagcode='${tagcode}'"$
								Utils.SaveSQLToLog("listRequestsItem_ItemClick",sSQL, tagcode)
								'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
						
								params.Clear
								params.Put("_token", ShareCode.APP_TOKEN)
								params.Put("ACLARequest", tagcode)
								params.Put("ACLAState", 2)
								params.Put("ACLAUser", ShareCode.SESS_User)
								params.Put("ACLADatetime", sACLADatetime)
								params.Put("ACLAFirst", "0")
								params.Put("ACLALatitude", sACLALatitude)
								params.Put("ACLALongitude", sACLALongitude)
								params.Put("versionTagcode", Main.VersionTagcode)
								params.Put("_authorization", Main.DeviceAuthorization)
								params.Put("_instance", Main.DeviceInstance)
								params.put("_deviceBrand", Main.DeviceBrand)
								params.put("_deviceModel", Main.DeviceModel)
								params.put("_deviceMacAddress", Main.DeviceMacAddress)
								params.Put("_user", ShareCode.SESS_User)
							End If
							CLA.Info.Map1 = params
					
							Dim sSQL As String = $"update dta_requests_relations set status_id=2  where request_tagcode='${tagcode}'
								and relation_tagcode='${actionkey}' and repeatcounter=${repeatcounter}"$
							Utils.SaveSQLToLog("listRequestsItem_ItemClick",sSQL, tagcode)
							'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
					
							Dim params As Map
							params.Initialize
							params.Clear
							params.Put("_token", ShareCode.APP_TOKEN)
							params.Put("ACLARequest", tagcode)
							params.Put("ACLAAction", actionkey)
							params.Put("ACLAState", 2)	
							params.Put("ACLAUser", ShareCode.SESS_User)
							params.Put("ACLADatetime", sACLADatetime)
							params.Put("ACLAReqCounter", repeatcounter)
							params.Put("ACLAFirst", "0")
							params.Put("ACLALatitude", sACLALatitude)
							params.Put("ACLALongitude", sACLALongitude)
							params.Put("versionTagcode", Main.VersionTagcode)
							params.Put("_authorization", Main.DeviceAuthorization)
							params.Put("_instance", Main.DeviceInstance)
							params.put("_deviceBrand", Main.DeviceBrand)
							params.put("_deviceModel", Main.DeviceModel)
							params.put("_deviceMacAddress", Main.DeviceMacAddress)
							params.Put("_user", ShareCode.SESS_User)
							CLA.Info.Map2 = params
							Try
								Sleep(100)
								CallSubDelayed3(CheckList3, "StartCLA_Activity_Child", CLA, name)
							Catch
								Sleep(100)
								Utils.logError("Call StartCLA_Activity_Child", ShareCode.SESS_OPER_User, LastException)
							End Try
					
						End If
					Else
						Dim i As Int
						i = Msgbox2(ShareCode.RequestStartCLAClosedView, ShareCode.GeneralAlertTitle, ShareCode.Option_VIEW, ShareCode.Option_CANCEL, ShareCode.Option_REOPEN,  Null)
						If (i=DialogResponse.POSITIVE) Then
							CallSubDelayed3(CheckList3, "StartCLA_ActivityReadOnly", CLA, name)
						End If
					End If
				
				Else
					'******************************************************************
					' ACTION: POR INICIAR
					'******************************************************************
					
					' CODIGO PARA VERIFICAR AS REGRAS DE EXECUCAO
	
					Dim i As Int
					i = Msgbox2(ShareCode.RequestStartCLAExecution, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
					If (i=DialogResponse.POSITIVE) Then
						
						'*******************************************************************
						' ALTERACAO PC 
						' VERIFICACAO DAS CONDICOES DE EXECUCAO DA CHECKLIST
						'*******************************************************************
						Dim Execution_Mode As String = DBStructures.GetScriptColumnStrEVC($"SELECT a.request_tagcode, a.relation_tagcode, a.position , ifnull(t.tagcode,"") as tagcode FROM dta_requests_relations as a
											LEFT JOIN dta_typerequests_tasks AS b ON (b.task_tagcode = a.relation_tagcode)
											LEFT JOIN type_execmodestypes AS t ON (t.tagcode = b.execution_mode)
											WHERE a.request_tagcode='${CLA.Request.Trim}' AND a.relation_tagcode = '${CLA.Action.Trim}' ORDER BY a.position"$,"tagcode")
						
						Log("EXECUTION MODE : " & Execution_Mode)
						
						'*****************************************
						' TIP: APOS CONCLUIR A ANTERIOR
						'*****************************************
						If Execution_Mode = "TEXMT_01" Then 
							Dim Posicao As Int = DBStructures.getscriptcolumnintevc($"SELECT a.position FROM dta_requests_relations as a
							WHERE request_tagcode='${CLA.Request.Trim}' AND relation_tagcode = '${CLA.Action.Trim}'"$,"position")
							If Posicao > 1 Then
								Posicao = Posicao -1
								Dim EstadoCheckListAnterior As Int = DBStructures.getscriptcolumnintevc($"SELECT ifnull(a.status_id,0) AS status_id
																	FROM dta_requests_relations AS a
																	INNER JOIN dta_typerequests_tasks_adds AS t ON (t.task_tagcode = a.relation_tagcode
									AND t.typerequest_tagcode IN (SELECT typerequest_tagcode FROM dta_requests WHERE tagcode = '${CLA.Request.Trim}'))
									WHERE t.position = ${Posicao} and a.request_tagcode='${CLA.Request.Trim}'"$,"status_id")
								If (EstadoCheckListAnterior <> 0) And (EstadoCheckListAnterior < 3) Then
									MsgboxAsync("Tem de concluir a checklist anterior em primeiro lugar",ShareCode.GeneralInfoTitle)
									Return
								End If
								
							End If
							'*****************************************
							' TIP: APENAS NA HORA INDICADA (+/- 5m)
							'*****************************************
						else if Execution_Mode = "TEXMT_02" Then 
							Dim Tf As String= DateTime.TimeFormat
							DateTime.TimeFormat ="HH:mm"
							Dim p_exec As Period
							
							Dim Hora_Execucao_Checklist As String = DBStructures.GetScriptColumnStrEVC($"SELECT ifnull(execute_start,'') as execute_start FROM dta_requests_relations
							WHERE request_tagcode = '${CLA.Request.Trim}' AND relation_tagcode = '${CLA.Action.Trim}'"$, "execute_start")
							
							If Utils.NNE(Hora_Execucao_Checklist) Then
								Dim HoraExecucao As Long = DateTime.TimeParse(Hora_Execucao_Checklist)
								p_exec.Minutes = -5
								
								Dim HoraMinima As Long = DateUtils.AddPeriod(DateTime.TimeParse(DateTime.Time(DateTime.Now)),p_exec)
								p_exec.Minutes = 5
								Dim HoraMaxima As Long = DateUtils.AddPeriod(DateTime.TimeParse(DateTime.Time(DateTime.Now)),p_exec)
							End If
							
							If (HoraExecucao < HoraMinima And HoraExecucao <> 0) Or (HoraExecucao > HoraMaxima And HoraExecucao <> 0) Then
								MsgboxAsync("Esta fora do periodo de execução da checklist",ShareCode.GeneralInfoTitle)
							End If
							
							'*****************************************
							' TIP: APOS CONCLUSAO DA PRINCIPAL
							'*****************************************
						else if Execution_Mode = "TEXMT_03" Then
							Dim Principal As String = DBStructures.GetScriptColumnStrEVC($"SELECT t.task_tagcode, t.cl_is_father FROM  dta_typerequests_tasks_adds AS t WHERE t.task_tagcode in
						 (SELECT a.relation_tagcode FROM dta_requests_relations AS a WHERE a.request_tagcode='${CLA.Request.trim}' AND t.cl_is_father = 1)"$,"task_tagcode")
							If Utils.NNE(Principal) Then
								Dim EstadoChecklistPrincipal As Int = DBStructures.GetScriptColumnIntEVC($"Select ifnull(a.status_id,0) As status_id
								FROM dta_requests_relations As a
								INNER JOIN dta_typerequests_tasks_adds As t ON (t.task_tagcode = a.relation_tagcode
								And t.typerequest_tagcode IN (Select typerequest_tagcode FROM dta_requests WHERE tagcode = '${CLA.Request.Trim}'))
								WHERE t.cl_is_father = 1
								And a.request_tagcode='${CLA.Request.Trim}'"$,"status_id")
								If (EstadoChecklistPrincipal <> 0) And (EstadoChecklistPrincipal < 3) Then
									MsgboxAsync("Tem de concluir a checklist principal em primeiro lugar",ShareCode.GeneralInfoTitle)
									Return
								End If
							End If
						End If
						
						ProgressDialogShow2("A preparar dados de arranque ...", False)
						
						' *****************************************************************
						' SUGESTÃO - NO INICIO DA CHECKLIST, AO INICIAR JÁ VEM COM O OBJECTO DE ANALISE 
						' *****************************************************************
						
						' *****************************************************************
						' VERIFICA SE EXISTEM CAMPOS A ACTUALIZAR A TABELA
						' *****************************************************************
								
						
						'object_type  object_type_rel
						If ((Utils.NNE(objecttagcode) And Not(objecttagcode = "__NONE__")) Or (Utils.NNE(object_tagcode_rel) And Not(object_tagcode_rel = "__NONE__"))) Then
						
							Private Record9 As Cursor
'							Dim sSQL As String = $"SELECT c.connectmode, c.connect2data, b.do_name, b.do_field, b.do_is_additional,
'										b.task_tagcode, b.item_tagcode, b.unique_key, b.data_type, b.title
'										FROM dta_requests_values AS a
'										INNER JOIN dta_tasks_items AS b ON (b.task_tagcode=a.task_tagcode AND b.item_tagcode=a.item_tagcode AND b.unique_key=a.unique_key)
'										INNER JOIN dta_tasks AS c ON (c.tagcode=b.task_tagcode)
'										WHERE a.execute_status>=1
'										AND a.request_tagcode='${tagcode.Trim}'
'										AND a.task_tagcode='${actionkey.Trim}'
'										AND a.repeatcounter='${repeatcounter}'
'										AND ((b.do_name <> '' AND b.do_field <> '' AND c.connect2data <> '') or
'										 (b.do_name = '__TYPEREQUEST__' AND b.do_field <> '' )) and b.task_tagcode=a.task_tagcode"$

							Dim sSQL As String = $"SELECT c.connectmode, c.connect2data, b.do_name, b.do_field, b.do_is_additional,
										b.task_tagcode, b.item_tagcode, b.unique_key, b.data_type, b.title
										FROM dta_requests_values AS a
										INNER JOIN dta_tasks_items AS b ON (b.task_tagcode=a.task_tagcode AND b.item_tagcode=a.item_tagcode AND b.unique_key=a.unique_key)
										INNER JOIN dta_tasks AS c ON (c.tagcode=b.task_tagcode)
										WHERE a.execute_status>=0
										AND a.request_tagcode='${tagcode.Trim}'
										AND a.task_tagcode='${actionkey.Trim}'
										AND a.repeatcounter='${repeatcounter}'
										AND ((b.do_name <> '' AND b.do_field <> '' AND c.connect2data <> '') or
										 (b.do_name = '__TYPEREQUEST__' AND b.do_field <> '' )) and b.task_tagcode=a.task_tagcode"$
							
							Record9 = Starter.LocalSQLEVC.ExecQuery(sSQL)
							If Record9.RowCount > 0 Then
								For ni = 0 To Record9.RowCount-1
									Record9.Position = ni
									Dim do_name As String = Record9.GetString("do_name")
									Dim do_field As String = Record9.GetString("do_field")
									Dim do_is_additional As Int = Record9.GetInt("do_is_additional")
									Dim task_tagcode As String = Record9.GetString("task_tagcode")
									Dim item_tagcode As String = Record9.GetString("item_tagcode")
									Dim unique_key As String = Record9.GetString("unique_key")

									If (do_name.ToUpperCase = "__TYPEREQUEST__") Then
										
										If (tagcode.StartsWith("IE_")) Then
											Dim insSQL As String = $"insert into dta_requests_fields (id, request_tagcode, field_tagcode)
														Select id, '${tagcode}' as request_tagcode, field_tagcode 
														from dta_typerequests_fields where typerequest_tagcode='${request_type}' 
														And '${tagcode}'||field_tagcode not in 
															(Select '${tagcode}'||field_tagcode as campo 
															from dta_requests_fields
															where request_tagcode='${tagcode}')"$
											'Starter.LocalSQLEVC.ExecNonQuery(insSQL)
											Utils.SaveSQLToLog("CriaCamposAdicionais",insSQL, tagcode)
											Dim params As Map
											params.Initialize
											params.Clear
											params.Put("_token", ShareCode.APP_TOKEN)
											params.Put("ACLARequest", tagcode)
											params.Put("ACLARequestType", request_type)
											params.Put("versionTagcode", Main.VersionTagcode)
											params.Put("_authorization", Main.DeviceAuthorization)
											params.Put("_instance", Main.DeviceInstance)
											params.put("_deviceBrand", Main.DeviceBrand)
											params.put("_deviceModel", Main.DeviceModel)
											params.put("_deviceMacAddress", Main.DeviceMacAddress)
											params.Put("_user", ShareCode.SESS_User)
											Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla-fields/create"$
											If Not(ShareCode.APP_WORKING_LOCAL) Then
												Utils.CallApi(0, params, Me, Url, "", tagcode)
											Else
												Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,actionkey.Trim,"")
												Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
											End If
											Sleep(500)
										End If
										Sleep(500)
						
										Dim ObjSQL As String = $"select distinct value from dta_requests_fields where request_tagcode='${request_type}' and field_tagcode='${do_field}'"$
										Private Record99 As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjSQL)
										If Record99.RowCount > 0 Then
											For nii = 0 To Record99.RowCount-1
												Record99.Position = nii
												Dim val As String = Utils.IfNullOrEmpty(Record99.GetString("value"), "")
												Dim NewSQL As String = $"update dta_requests_values set execute_status=1, execute_value='${val}'
															where request_tagcode='${tagcode}' 
															and inner_request_tagcode='${actionkey}'
															and task_tagcode='${task_tagcode}'
															and item_tagcode='${item_tagcode}'
															and unique_key='${unique_key}'
															and repeatcounter=${repeatcounter} "$
												Try
													Starter.LocalSQLEVC.ExecNonQuery(NewSQL)
												Catch
													Log($"Erro de campo: ${LastException}"$)
												End Try
											Next
										End If
										Record99.Close
									Else
										Dim TipoObjectoComparacao As String = ""
										If (Utils.NNE(object_tagcode_rel) And Not(object_tagcode_rel = object_tagcode)) Then
											TipoObjectoComparacao = object_type_rel
										Else
											TipoObjectoComparacao = object_type
										End If
										
										If (do_name = TipoObjectoComparacao) Then
											If (do_is_additional = 1) Then
												Dim ObjSQL As String = $"select distinct `value` from dta_objects_fields where object_tagcode='${object_tagcode}' and field_tagcode='${do_field}'"$
											Else
												If Utils.FieldInList(do_field, "address|address2|postalcode|phone|local|latitude|longitude|block|floor|door") Then
													Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_locations where tagcode in
																	(select local_tagcode from dta_objects where tagcode='${object_tagcode}')"$
												Else If Utils.FieldInList(do_field, "name|phone|email|mobile") Then
													Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_contacts where tagcode in
															(select contact_tagcode from dta_objects_contacts where object_tagcode='${object_tagcode}' limit 1)"$
												Else
													Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_objects where tagcode='${object_tagcode}'"$
												End If
													
												Log(ObjSQL)
											End If
											
											Private Record99 As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjSQL)
											If Record99.RowCount > 0 Then
												For nii = 0 To Record99.RowCount-1
													Record99.Position = nii
													Dim val As String = Utils.IfNullOrEmpty(Record99.GetString("value"), "")
													Dim NewSQL As String = $"update dta_requests_values set execute_status=1, execute_value='${val}', object_tagcode='${object_tagcode}'
															where request_tagcode='${tagcode}' 
															and inner_request_tagcode='${actionkey}'
															and task_tagcode='${task_tagcode}'
															and item_tagcode='${item_tagcode}'
															and unique_key='${unique_key}'
															and repeatcounter=${repeatcounter} "$
													Log(NewSQL)
													Try
														Utils.SaveSQLToLog("ListaPrincipal_ItemClick",NewSQL, tagcode)
														'Starter.LocalSQLEVC.ExecNonQuery(NewSQL)
													Catch
														Log($"Erro de campo: ${LastException}"$)
													End Try
												Next
											End If
											Record99.Close
										End If
									End If
									
								Next
							End If
							Record9.Close
						End If
						Sleep(500)
						
						'Agrupadoras
						Dim CTRTP3 As ResumableSub = CheckTypeRequestTaskParamters3(CLA.Request, CLA.Action,request_type.trim, objecttagcode.trim, 1)
						Wait For (CTRTP3) Complete (EndCheck As Boolean)
						Sleep(100)
						
						' *****************************************************************
						' CHECK: VERIFICA SE TEM PARAMETROS ESPECÍFICOS
						' DTA_TYPEREQUESTS_TASKS_ADDS->PARAMTERS
						' *****************************************************************
						
						Dim sLogScript As String = $"select distinct paramters
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${request_type.Trim}'
												And task_tagcode='${CLA.Action.trim}'"$
						Log(sLogScript)
						Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( sLogScript, "paramters")
												
						Try
							Dim upload_data As Int = QuestParams.Get("upload_data")
						Catch
							Dim upload_data As Int = 0
							Log(LastException)
						End Try
						
						
						Log("*******************************************************************")
						Log(upload_data)
						Log("*******************************************************************")
							
						If Utils.Int2Bool(upload_data) Then
									
							Dim up_settings As Map = QuestParams.Get("up_settings")
							Dim upload_data_start As Int = up_settings.Get("upload_data_start")
									
							If Utils.Int2Bool(upload_data_start) Then
								Dim ud_settings_start As Map = up_settings.Get("ud_settings_start")
								Dim data_tagcode As String = ud_settings_start.Get("data_tagcode")
								Dim data_group As String = ud_settings_start.Get("data_group")
								Dim data_subgroup As String = ud_settings_start.Get("data_subgroup")
								Dim data_origin As String = ud_settings_start.Get("data_origin")
								
								Log("*******************************************************************")
								Log(data_origin)
								Log("*******************************************************************")
								
										
								If (data_origin.ToUpperCase = "TINOUT_CHECKLISTS") Then
									Dim chapters As List = ud_settings_start.Get("chapters")
									For Each colchapters As Map In chapters
											
										Dim chapter_in As String = colchapters.Get("chapter_in")
										Dim chapter_out As String = colchapters.Get("chapter_out")
										Dim chapter_repeat As Int = colchapters.Get("chapter_repeat")
											
										'*************************************************************
										' IDENTIFICA O TOTAL DE REGISTOS DE CAPITULOS REPETIDOS
										'*************************************************************
										Dim SQLRepeatedItems As String = $"select distinct repeatitemcounter from dta_requests_values
																		where request_tagcode='${tagcode.Trim}' 
																		and task_tagcode='${data_tagcode}' 
																		And item_tagcode='${chapter_in}'"$
										Dim RepeatedItems As Cursor = Starter.LocalSQLEVC.ExecQuery(SQLRepeatedItems)
										Dim ReqRows As Int = RepeatedItems.RowCount
										If (ReqRows >= 1) Then
												
											Dim items As List = colchapters.Get("items")
											If Not(Utils.Int2Bool(chapter_repeat)) Then
												ReqRows = 1
											End If
												
											For rpos=0 To ReqRows-1
												RepeatedItems.Position = rpos
												If Not(rpos = 0) Then
													Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
													Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																	tagcode,position,
																	execute_status, execute_value, execute_value_title, title, execute_format_title,
																	confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)
																	select ${maxID}, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																	tagcode,position, 0, '', '', '', execute_format_title, confirmed,changed_value, 
																	repeatcounter, ${rpos}  AS repeatitemcounter, 
																	repeatfieldcounter,val_min, val_max
																	from dta_requests_values As a where
																	a.item_tagcode||a.unique_key in (Select item_tagcode||unique_key
																		from dta_tasks_items where (parent_tagcode in (Select unique_key from dta_tasks_items 
																		where item_tagcode='${chapter_out.Trim}' and repeated=1)) or 
																			(item_tagcode='${chapter_out.Trim}' and repeated=1)) 
																	And a.repeatcounter=${repeatcounter} 
																	and repeatitemcounter=0
																	and a.request_tagcode='${tagcode.Trim}'
																	and a.task_tagcode='${CLA.Action.Trim}'  order by a.position"$
																											
													Log(sSQL)
													Utils.SaveSQLToLog("butAddMore_Click",sSQL, tagcode)
												End If
											Next
												
											For rpos=0 To ReqRows-1
												RepeatedItems.Position = rpos
													
												For Each upcolitems As Map In items
													Dim val_field_in As String = upcolitems.Get("val_field_in")
													Dim val_field_out As String = upcolitems.Get("val_field_out")
													Dim item_tagcode_in As String = upcolitems.Get("item_tagcode_in")
													Dim item_tagcode_out As String = upcolitems.Get("item_tagcode_out")
														
													Dim set_object_field As Int = upcolitems.Get("set_object_field")
													Dim set_title_field As Int = upcolitems.Get("set_title_field")
													Dim set_subobject_field As Int = upcolitems.Get("set_subobject_field")
													Dim set_status As Int = upcolitems.Get("set_status")
														
													Dim colsin As String = val_field_in
													If Utils.Int2Bool(set_object_field) Then
														colsin = $"${Utils.IfNotNullOrEmpty(colsin, $"${colsin}, object_tagcode"$)}"$
													End If
													If Utils.Int2Bool(set_title_field) Then
														colsin = $"${Utils.IfNotNullOrEmpty(colsin, $"${colsin}, title"$)}"$
													End If
													If Utils.Int2Bool(set_subobject_field) Then
														colsin = $"${Utils.IfNotNullOrEmpty(colsin, $"${colsin}, subobject_tagcode"$)}"$
													End If
													If Utils.Int2Bool(set_status) Then
														colsin = $"${Utils.IfNotNullOrEmpty(colsin, $"${colsin}, execute_status"$)}"$
													End If
														
													Dim r110SQL As String = $"select ${colsin} from dta_requests_values where 1=1
																				and request_tagcode='${tagcode.Trim}'
																				and task_tagcode='${data_tagcode.Trim}'
																				and item_tagcode='${item_tagcode_in.Trim}'
																				And repeatcounter='${repeatcounter}'
																				And repeatitemcounter='${rpos}'"$
																				
															
													Dim r110 As Cursor = Starter.LocalSQLEVC.ExecQuery(r110SQL)
													If (r110.RowCount >= 1) Then
														For rr1=0 To r110.RowCount-1
															r110.Position = rr1
															If Utils.NNE(val_field_out) Then
																Dim colsout As String = $"${val_field_out}='${r110.GetString(val_field_in)}'"$
																If Utils.Int2Bool(set_object_field) Then
																	colsout = $"${Utils.IfNotNullOrEmpty(colsout, $"${colsout}, object_tagcode='${r110.GetString("object_tagcode")}'"$)}"$
																End If
																If Utils.Int2Bool(set_title_field) Then
																	colsout = $"${Utils.IfNotNullOrEmpty(colsout, $"${colsout}, title='${r110.GetString("title")}'"$)}"$
																End If
																If Utils.Int2Bool(set_subobject_field) Then
																	colsout = $"${Utils.IfNotNullOrEmpty(colsout, $"${colsout}, subobject_tagcode='${r110.GetString("subobject_tagcode")}'"$)}"$
																End If
																If Utils.Int2Bool(set_status) Then
																	colsout = $"${Utils.IfNotNullOrEmpty(colsout, $"${colsout}, execute_status='${r110.GetString("execute_status")}'"$)}"$
																End If
																
																Dim updSQLRec As String = $"update dta_requests_values set ${colsout}
																			where 1=1
																			and request_tagcode='${tagcode.Trim}'
																			and task_tagcode='${CLA.Action.Trim}'
																			and item_tagcode='${item_tagcode_out.Trim}'
																			And repeatcounter='${repeatcounter}' 
																			And repeatitemcounter='${rpos}'"$
																			
																Log(updSQLRec)
																Try
																	Utils.SaveSQLToLog("ListaPrincipal_ItemClick",updSQLRec, tagcode)
																Catch
																	Log($"Erro de campo: ${LastException}"$)
																End Try
															End If
															
																
														Next
													End If
													r110.Close
												Next
													
											Next
										End If
										RepeatedItems.Close

									Next
								End If

							End If
						End If
						
						'*******************************************************************
						' CHECK: EVENTOS DE CARREGAMENTO DE CHECKLIST
						'*******************************************************************
						If (Utils.NNE(objecttagcode) And Not(objecttagcode = "__NONE__")) Then
							Dim ress As ResumableSub = UploadDataParamters(CLA, tagcode)
							Wait For(ress) Complete (Ended As Boolean)
						End If
						Sleep(250)
						
						ProgressDialogHide
						
						'*******************************************************************
						' FIM EVENTOS DE CARREGAMENTO DE CHECKLIST
						'*******************************************************************
						
						
						Dim params As Map
						params.Initialize
						If (DBStructures.getMainRequestStatus(tagcode) <=1) Then
							Dim sSQL As String = $"update dta_requests set status_id=2, run_date='${sDate}', run_start='${sTime}' where tagcode='${tagcode}'"$
							Utils.SaveSQLToLog("listRequestsItem_ItemClick",sSQL, tagcode)
							'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
							Log("Grava Status na BD local Request")
							params.Clear
							params.Put("_token", ShareCode.APP_TOKEN)
							params.Put("ACLARequest", tagcode)
							params.Put("ACLAState", 2)
							params.Put("ACLAUser", ShareCode.SESS_User)
							params.Put("ACLADatetime", sACLADatetime)
							params.Put("ACLADate", sDate)
							params.Put("ACLATime", sTime)
							params.Put("ACLAFirst", "1")
							params.Put("ACLALatitude", sACLALatitude)
							params.Put("ACLALongitude", sACLALongitude)
							params.Put("versionTagcode", Main.VersionTagcode)
							params.Put("_authorization", Main.DeviceAuthorization)
							params.Put("_instance", Main.DeviceInstance)
							params.put("_deviceBrand", Main.DeviceBrand)
							params.put("_deviceModel", Main.DeviceModel)
							params.put("_deviceMacAddress", Main.DeviceMacAddress)
							params.Put("_user", ShareCode.SESS_User)
						End If
						CLA.Info.Map1 = params
					
						Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'
							where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}' and repeatcounter=${repeatcounter}"$
						Utils.SaveSQLToLog("listRequestsItem_ItemClick",sSQL, tagcode)
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
						params.Put("ACLAReqCounter", repeatcounter)
						params.Put("ACLAFirst", "1")
						params.Put("ACLALatitude", sACLALatitude)
						params.Put("ACLALongitude", sACLALongitude)
						params.Put("versionTagcode", Main.VersionTagcode)
						params.Put("_authorization", Main.DeviceAuthorization)
						params.Put("_instance", Main.DeviceInstance)
						params.put("_deviceBrand", Main.DeviceBrand)
						params.put("_deviceModel", Main.DeviceModel)
						params.put("_deviceMacAddress", Main.DeviceMacAddress)
						params.Put("_user", ShareCode.SESS_User)
						CLA.Info.Map2 = params
						status_id = 2
						CLA.Status.status = status_id
					
						Try
							CallSubDelayed3(CheckList3, "StartCLA_Activity_Child", CLA, name)
						Catch
							Log(LastException)
							Utils.logError("Call StartCLA_Activity_Child", ShareCode.SESS_OPER_User, LastException)
						End Try
					Else If (i=DialogResponse.NEGATIVE) Then
						Try
							CallSubDelayed3(CheckList3, "StartCLA_ActivityReadOnly", CLA, name)
						Catch
							Log(LastException)
							Utils.logError("Call StartCLA_ActivityReadOnly", ShareCode.SESS_OPER_User, LastException)
						End Try
					Else
					End If
				End If
			End If
		End If
	Else
		
	End If
End Sub

'**********************************************************************************
' TIP : CHECKLIST DE CARREGAMENTO DE DADOS ESPECÍFICOS
'**********************************************************************************
Sub UploadDataScriptParamters(CLA As RequestCLA) As ResumableSub
	Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_tasks_adds where 1=1
												and tagcode='${CLA.action.trim}'"$, "paramters")
	Try
		Dim data_script_upload As Int = QuestParams.Get("data_script_upload")
	Catch
		Dim data_script_upload As Int = 0
		Log(LastException)
	End Try
							
	If Utils.Int2Bool(data_script_upload) Then

		Dim data_script_info As Map = QuestParams.Get("data_script_info")
		Dim is_globalscript As Int = data_script_info.Get("is_globalscript")
'		Dim globalscript As String = data_script_info.Get("globalscript")
		
		If Utils.Int2Bool(is_globalscript) Then
			Dim chapters As List = data_script_info.Get("globalscript_fields")
			For Each colchapters As Map In chapters
				
			Next
		Else
			Dim chapters As List = data_script_info.Get("script_fields")
			For Each colchapters As Map In chapters
				Dim field As String = chapters.Get("field")
				Dim item As String = chapters.Get("item")
				Dim script As String = chapters.Get("script")
				Dim control_type As Int = chapters.Get("control_type") '0=sem, 1=Pedido, 2=Objecto, 3=entidade, 4=teccnico, 5=pedido+objecto, 6=pedido+tecnico
				Dim ControlList As List : ControlList.Initialize
				If (control_type >=1) Then
					Dim ThisMap As Map : ThisMap.Initialize
					If (control_type = 1) Then
						ThisMap.Put(":REQUEST", CLA.Request)
					Else If (control_type = 2) Then
						Dim dataReturn As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode as valor from dta_requests where tagcode='${CLA.Request}'"$,"valor")
						ThisMap.Put(":OBJECT", dataReturn)
					Else If (control_type = 3) Then
						Dim dataReturn As String = DBStructures.GetScriptColumnStrEVC($"select entity_tagcode as valor from dta_requests where tagcode='${CLA.Request}'"$,"valor")
						ThisMap.Put(":ENTITY", dataReturn)
					Else If (control_type = 4) Then
						Dim dataReturn As String = DBStructures.GetScriptColumnStrEVC($"select technical_tagcode as valor from dta_requests where tagcode='${CLA.Request}'"$,"valor")
						ThisMap.Put(":TECHNICAL", dataReturn)
					Else If (control_type = 5) Then
						Dim dataReturn As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode as valor from dta_requests where tagcode='${CLA.Request}'"$,"valor")
						ThisMap.Put(":REQUEST", CLA.Request)
						ThisMap.Put(":OBJECT", dataReturn)
					Else If (control_type = 6) Then
						Dim dataReturn As String = DBStructures.GetScriptColumnStrEVC($"select technical_tagcode as valor from dta_requests where tagcode='${CLA.Request}'"$,"valor")
						ThisMap.Put(":REQUEST", CLA.Request)
						ThisMap.Put(":TECHNICAL", dataReturn)
					Else If (control_type = 1) Then
						Dim dataReturn As String = DBStructures.GetScriptColumnStrEVC($"select entity_tagcode as valor from dta_requests where tagcode='${CLA.Request}'"$,"valor")
						ThisMap.Put(":REQUEST", CLA.Request)
						ThisMap.Put(":ENTITY", dataReturn)
					End If
				End If
				Dim Obj_Tc As String = Utils.IfNullOrEmpty( DBStructures.GetScriptColumnStrEVCLSTMAP(script, field, ControlList), "")
				Dim Obj_Stat As String = "0"
				If Utils.NNE(Obj_Tc) Then
					Obj_Stat = "1"
				End If
				
				Dim ss1 As String = $"update dta_requests_values set execute_status=${Obj_Stat}, execute_value='${Obj_Tc}'
																	where 1=1
																	And request_tagcode='${CLA.Request}'
																	And task_tagcode in ('${CLA.Action}')
																	And item_tagcode='${item}'
																	And repeatcounter=${CLA.RepeatCounter}
																	And repeatfieldcounter=0"$
				Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, CLA.Request)
				
				Dim ss1 As String = $"select * from dta_requests_values where 1=1
																	And request_tagcode='${CLA.Request}'
																	And task_tagcode in ('${CLA.Action}')
																	And item_tagcode='${item}'
																	And repeatcounter=${CLA.RepeatCounter}
																	And repeatfieldcounter=0 "$
				Dim ResData As ResultSet = Starter.LocalSQLEVC.ExecQuery(ss1)
				Do While ResData.NextRow
					Dim params As Map
					params.Initialize
					params.Clear
					params.Put("_token", ShareCode.APP_TOKEN)
					params.Put("ACLARequest", CLA.Request)
					params.Put("ACLAAction", CLA.Request)
					params.Put("ACLATask", ResData.GetString("task_tagcode"))
					params.Put("ACLAItem", ResData.GetString("item_tagcode"))
					params.Put("ACLAUniqueKey", ResData.GetString("uniquekey"))
					params.Put("ACLATagcode", ResData.GetString("tagcode"))
					params.Put("ACLAValue", ResData.GetString("execute_value"))
					params.Put("ACLAReqCounter", ResData.GetInt("repeatcounter"))
					params.Put("ACLARepeatItem", ResData.GetInt("repeatitemcounter"))
					params.Put("ACLARepeatField", ResData.GetInt("repeatfieldcounter"))
					params.Put("ACLAInner", 0)
					params.Put("ACLAChangeObjectGeoLocation", 0)
					params.Put("ACLAObjectTag", "")
					params.Put("versionTagcode", Main.VersionTagcode)
					params.Put("_authorization", Main.DeviceAuthorization)
					params.Put("_instance", Main.DeviceInstance)
					params.put("_deviceBrand", Main.DeviceBrand)
					params.put("_deviceModel", Main.DeviceModel)
					params.put("_deviceMacAddress", Main.DeviceMacAddress)
					params.Put("_user", ShareCode.SESS_User)
					Dim sACLADatetime As String = Utils.GetCurrDatetime
					Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
					Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

					params.Put("ACLADatetime", sACLADatetime)
					params.Put("ACLALatitude", sACLALatitude)
					params.Put("ACLALongitude", sACLALongitude)
					Dim ACLSessUser As String = ShareCode.SESS_OPER_User
			
					params.Put("ACLSessUser", ACLSessUser)
					params.Put("ACLClear", 0)
					
					Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/update"$
					If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
						If Not(ShareCode.APP_WORKING_LOCAL) Then
							Utils.CallApi(0, params, Me, Url, "", CLA.Request)
						Else
							Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,CLA.Request.Trim,CLA.Task.Trim,"")
							Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
						End If
						Sleep(250)
					Else
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,CLA.Request.Trim,CLA.Task.Trim,"")
						Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
					End If
					
					Exit
				Loop
			Next
		End If

	End If
	Sleep(250)
	Return True
End Sub


'**********************************************************************************
' TIP : CHECKLIST DE CARREGAMENTO DE ARTIGOS
'**********************************************************************************
Sub UploadDataParamters(CLA As RequestCLA, tagcode As String) As ResumableSub
	Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_tasks_adds where 1=1
												and tagcode='${CLA.action.trim}'"$, "paramters")
	If QuestParams.ContainsKey("data_bulk_upload") Then
		Try
			Dim data_bulk_upload As Int = QuestParams.Get("data_bulk_upload")
		Catch
			Dim data_bulk_upload As Int = 0
			Log(LastException)
		End Try
	Else
		Dim data_bulk_upload As Int = 0
	End If
	
	If Utils.Int2Bool(data_bulk_upload) Then

		Dim data_bulk_info As Map = QuestParams.Get("data_bulk_info")
		Dim affected_from As String = data_bulk_info.Get("affected_from")
		Dim related_to As String = data_bulk_info.Get("related_to")
		Dim origin_master As String = data_bulk_info.Get("origin_master")
		Dim origin_master_condition As String = data_bulk_info.Get("origin_master_condition")
		Dim origin_details As String = data_bulk_info.Get("origin_details")
		Dim origin_details_condition As String = data_bulk_info.Get("origin_details_condition")
		Dim field_group_checklist As String = data_bulk_info.Get("field_group_checklist")
		Dim field_group_chapter As String = data_bulk_info.Get("field_group_chapter")
		Dim is_object_relation As Int = data_bulk_info.Get("is_object_relation")
		Dim iField As Int = DBStructures.GetScriptColumnIntEVC($"select reference from type_inouttypes where tagcode='${affected_from}'"$, "reference")
		Dim gField As String = ""
		Dim WareHouseCode As String = ""
		Dim Obj_Tc As String = ""
		Dim sNewSQL As String = ""
		Dim ServerTempFileName As String = $"${tagcode}_exec.script"$
				
		If Utils.Int2Bool(is_object_relation) Then
			Obj_Tc = DBStructures.GetScriptColumnSTrEVC($"select object_tagcode from dta_requests where tagcode = '${tagcode}'"$,"object_tagcode")
		End If
					
		If iField = 1 Then
			gField = "dta_technicals"
		else If iField = 2 Then
			gField = "dta_departments"
		else If iField = 3 Then
			gField = "dta_teams"
		else If iField = 4 Then
			gField = "dta_objects"
		else If iField = 5 Then
			gField = "" 'Empresas
		else If iField = 6 Then
			gField = "dta_warehouses"
			If Utils.Int2Bool(is_object_relation) And Utils.NNE(Obj_Tc) Then
				WareHouseCode = DBStructures.GetScriptColumnStrEVC($"select tagcode from dta_warehouses where object_tagcode = '${Obj_Tc}'"$,"tagcode")
			Else
				WareHouseCode = related_to
			End If
			Dim sNewSQL As String = $"select x.title as article_title, x.tagcode as article_tagcode, x.*, e.* from (
							select  ifnull(b.title,'') as group_title, ifnull(c.tagdesc,'') as type_title, a.*, d.qtd as qtdw 
							from dta_articles as a
							left join dta_articles_groups as b on (b.tagcode=a.article_group)
							left join type_articlestypes as c on (c.tagcode=a.article_type)
							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and
								d.warehouse_tagcode in ('${WareHouseCode}'))
							) As x
							, dta_requests_values As e
							inner join dta_tasks_items As f on (f.task_tagcode=e.task_tagcode
								And f.item_tagcode=e.item_tagcode
								And f.unique_key=e.unique_key)
							where 1=1
							And e.request_tagcode='${tagcode}'
							And e.task_tagcode in ('${CLA.Action.trim}')
							And f.`level`>0
							order by x.group_title, x.title"$
		else If iField = 8 Then
			gField = "dta_articles"
		else If iField = 9 Then
			gField = "aut_users"
		else If iField = 12 Then
			gField = "dta_equipments"
		else If iField = 14 Then
			gField  = "dta_objects"
		Else
			gField = "dta_articles"
		End If
										
		'SE A TABELA FOR ARMAZEM GROUP = ARMAZEM
		If (Utils.NNE(sNewSQL)) Then		
			Dim rRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(sNewSQL)
			If rRecord.RowCount > 0 Then
					
				Dim Chapter As String = ""
				Dim G_RItem As String = ""
				Dim G_RUniqueKey As String = ""
				Dim cntFieldVal04 As Int = -1
				Dim cntRepeatFieldCounter As Int = 0
				Dim cntRepeatItemCounter As Int = -1
				Dim cntPosicao As Int = 1
				Dim newRequest As String = CLA.Request.Trim
				Dim newTaskTC As String = CLA.Action.Trim
			
				For Row = 0 To rRecord.RowCount-1
					rRecord.Position = Row
					Dim Group As String = rRecord.GetString("group_title")
					Dim Qtd As Int = rRecord.GetInt("qtdw")
					Dim RRepeatcounter As Int = rRecord.GetInt("repeatcounter")
					Dim RObject As String = rRecord.GetString("article_tagcode")
					Dim RTitle As String = rRecord.GetString("article_title")
										
					Dim RItem As String = rRecord.GetString("item_tagcode")
					Dim RUniqueKey As String = rRecord.GetString("unique_key")
										
					Dim G_RItem As String = DBStructures.GetScriptColumnStrEVC($"select item_tagcode from dta_tasks_items where task_tagcode = '${newTaskTC}' and level=0 and components=2"$,"item_tagcode")
					Dim G_RUniqueKey As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_tasks_items where task_tagcode = '${newTaskTC}' and level=0 and components=2"$,"unique_key")
					
										
					' Validacao de capitulo
					If Not(Chapter=Group) Then ' Capitulo e diferente grupo
						cntRepeatItemCounter = cntRepeatItemCounter + 1
						If (Row = 0) Then
							Dim isUpdate As Int = 1
							Dim ss1 As String = $"update dta_requests_values set
																	execute_status=0,
																	execute_value='',
																	title='${Group}',
																	object_tagcode='',
																	position=1,
																	repeatfieldcounter=0,
																	repeatitemcounter=0
																	where 1=1
																	And request_tagcode='${newRequest}'
																	And task_tagcode in ('${newTaskTC}')
																	And item_tagcode='${G_RItem}'
																	And unique_key='${G_RUniqueKey}'
																	And repeatcounter=0
																	And repeatfieldcounter=0"$
							Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, newRequest)
						Else
							Dim isUpdate As Int = 0
							Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
							Dim ss1 As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																		tagcode,position,execute_value,execute_status,execute_format_title,title,object_tagcode,repeatfieldcounter,repeatitemcounter)
																		select ${maxID} as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, 
																		a.item_tagcode, a.unique_key, a.tagcode, 
																		1, '' as execute_value, 0 as execute_status, a.execute_format_title,'${Group}' as title,'' as object_tagcode,
																		${Row} as repeatfieldcounter,
																		${cntRepeatItemCounter} as repeatitemcounter
																		from dta_requests_values As a
																		where 1=1
																		And request_tagcode='${newRequest}'
																		And task_tagcode in ('${newTaskTC}')
																		And item_tagcode='${G_RItem}'
																		And unique_key='${G_RUniqueKey}'
																		And repeatcounter=0
																		And repeatfieldcounter=0 "$
							Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, newRequest)
															
						End If
							
						cntFieldVal04 = cntFieldVal04 + 1
							
						Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, newRequest)
							
						Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values_adds", "id", "") + 1 + 1000000
						Dim sSql1 As String = $"insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
									tagcode,fieldval_04,repeatfieldcounter,repeatitemcounter) values (${maxID}, '${newRequest}','${newTaskTC}', '${newTaskTC}', 
						'${G_RItem}', '${G_RUniqueKey}', '',${cntFieldVal04}, ${cntRepeatFieldCounter},${cntRepeatItemCounter})"$
						Utils.SaveSQLToLog("getTaskDetailsDialog",sSql1, newRequest)
							
						Chapter=Group
						cntPosicao = cntPosicao + 1
						
						'Dim ServerTempFileName As String = $"${tagcode}_exec.script"$
						Dim res1 As ResumableSub = updateServerUploadDataParamters(Group, "", "", newRequest, newTaskTC, _
																	G_RItem, G_RUniqueKey, 0,cntRepeatItemCounter, Row, cntFieldVal04, _
																	cntRepeatFieldCounter, 1, isUpdate, 0, 1, ServerTempFileName)
						Wait For(res1) Complete (Ended As Boolean)
	
						'Counter2=1
					End If
					' Validacao de registo
					If (Row = 0) Then
						Dim isUpdate As Int = 1
						Dim ss1 As String = $"update dta_requests_values set
									execute_status=1,
									execute_value='${Qtd}',
									title='${RTitle}',
									object_tagcode='${RObject}',
									position = 2,
									repeatfieldcounter=0,
									repeatitemcounter=0
									where 1=1
									And request_tagcode='${newRequest}'
									And task_tagcode in ('${newTaskTC}')
									And item_tagcode='${RItem}'
									And unique_key='${RUniqueKey}'
									And repeatcounter=${RRepeatcounter}
									and repeatfieldcounter=0 "$
						Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, newRequest)
					Else
						Dim isUpdate As Int = 0
						Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
						Dim ss1 As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, 
									task_tagcode,item_tagcode,unique_key,
									tagcode,position,execute_value,execute_status, execute_format_title,
									title,object_tagcode,repeatfieldcounter,repeatitemcounter)
									select ${maxID} as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, 
									a.item_tagcode, a.unique_key, a.tagcode, 
									2, '${Qtd}' as execute_value, 1 as execute_status, 
									a.execute_format_title,'${RTitle}' as title,'${RObject}' as object_tagcode,
									${Row} as repeatfieldcounter,
									${cntRepeatItemCounter} as repeatitemcounter
									from dta_requests_values As a
									where 1=1
									And request_tagcode='${newRequest}'
									And task_tagcode in ('${newTaskTC}')
									And item_tagcode='${RItem}'
									And unique_key='${RUniqueKey}'
									And repeatcounter=${RRepeatcounter}
									and repeatfieldcounter=0 "$
						Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, newRequest)
	
					End If
					Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, newRequest)
						
					Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values_adds", "id", "") + 1 + 1000000
							
					Dim sSql1 As String = $"insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
									tagcode,fieldval_04,repeatfieldcounter,repeatitemcounter) values (${maxID}, '${newRequest}','${newTaskTC}', '${newTaskTC}', 
					'${RItem}', '${RUniqueKey}', '',${cntFieldVal04}, ${cntRepeatFieldCounter},${cntRepeatItemCounter})"$
					Utils.SaveSQLToLog("getTaskDetailsDialog",sSql1, newRequest)
					
					Dim res1 As ResumableSub = updateServerUploadDataParamters(RTitle, RObject, Qtd, newRequest, newTaskTC, _
																	RItem, RUniqueKey, RRepeatcounter,cntRepeatItemCounter,Row, cntFieldVal04, _
																	cntRepeatFieldCounter, 0, isUpdate, 1, 2, ServerTempFileName)
					Wait For(res1) Complete (Ended As Boolean)
					
					cntRepeatFieldCounter = cntRepeatFieldCounter + 1
					cntPosicao = cntPosicao + 1
				Next
			End If
			rRecord.Close
		End If
	End If
	Sleep(250)
	Dim res2 As ResumableSub = updateServerUploadDataFileSet(ServerTempFileName)
	Wait For(res2) Complete (Ended As Boolean)
	Return True
End Sub

Sub updateServerUploadDataParamters(Title As String, RObject As String, Qtd As String, Request As String, Task As String, _
	RItem As String, RUniqueKey As String, RRepeatcounter As Int, IRepeatcounter As Int,Row As Int, FieldVal04 As Int, RRepeatFieldcounter As Int, _
	isChapter As Int, isUpdate As Int, Status As Int, Position As Int, ServerTempFileName As String) As ResumableSub
	
	Dim sACLADatetime As String = Utils.GetCurrDatetime
	Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", Request)
	params.Put("ACLAAction", Task)
	params.Put("ACLATask", Task)
	params.Put("ACLAItem", RItem)
	params.Put("ACLAUniqueKey", RUniqueKey)
	params.Put("ACLAValue", Qtd)
	params.Put("ACLAReqCounter", RRepeatcounter)
	params.Put("ACLARepeatItem", IRepeatcounter)
	If (Utils.Int2Bool(isChapter)) Then
		params.Put("ACLARepeatField", Row)
	Else
		params.Put("ACLARepeatField", RRepeatFieldcounter)
	End If
	params.Put("ACLAObject", RObject)
	params.Put("ACLATitle", Title)
	params.Put("ACLAFieldVal04", FieldVal04)
	params.Put("ACLAChapter", isChapter)
	params.Put("ACLAUpdate", isUpdate)
				
	params.Put("ACLADatetime", sACLADatetime)
	params.Put("ACLALatitude", sACLALatitude)
	params.Put("ACLALongitude", sACLALongitude)

	params.Put("ACLAStatus", Status)
	params.Put("ACLAPosition", Position)
	params.Put("ACLAFileNameTemp", ServerTempFileName)
	
					
	Dim ACLSessUser As String = ShareCode.SESS_OPER_User
	params.Put("ACLSessUser", ACLSessUser)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/field/list/update"$
	If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,Request.Trim,Task.Trim,RItem)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(500)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,Request.Trim,Task.Trim,RItem)
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Return True
End Sub

Sub updateServerUploadDataFileSet(ServerTempFileName As String) As ResumableSub

	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLAFileNameTemp", ServerTempFileName)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
					
	Dim ACLSessUser As String = ShareCode.SESS_OPER_User
	params.Put("ACLSessUser", ACLSessUser)
		
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/field/list/runfile"$
	If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Return True
End Sub

Sub CreateRequestItemLevelCLA_BR(cnt As Int, colitems As RequestCLA, layout As String, code As Int, Width As Int, Height As Int, bd As BitmapDrawable) As B4XView
	'Dim Height As Int = 280dip
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, 100%x, Height) '115dip)
	p.LoadLayout(layout)
	p.RemoveView
	
'	CLA_BR_CAR
'	CLA_BR_KMI
'	CLA_BR_OBS
	
	
	Return p
End Sub

Sub listRequestsItemSecond_ItemClick (Index As Int, Value As Object)
'	Dim Pnl As Panel = Sender
'	Dim data As RequestCLA = Pnl.Tag
'	ProgressDialogShow2(ShareCode.LoadingRequestMessage,True)
'	Dim tasktype As Int = data.TaskType
'	
'	If (tasktype = 0) Then
'		Log(data.Request)
'		Dim Entity As Label = Pnl.GetView(0)
'		CallSubDelayed3(Checklist3, "StartCLA_Activity", data, Entity.Text)
'	Else
'		CurrentTabPage = CurrentTabPage + 1
'		TabPageState(CurrentTabPage, True)
'		listsTabPanel.ScrollTo(CurrentTabPage, True)
'		'CreateRequestItemLevel(CurrentTabPage, data, listRequestsItem.sv.Width, 70dip, Null)
'	End If
'	ProgressDialogHide
End Sub


Sub ListItemSelected(pan As Panel)
	For index= 0 To listRequests.Size-1
		Dim p As Panel = listRequests.GetPanel(index).GetView(0)
		p.Color = Consts.ColorWhite
	Next
	pan.Color = Colors.argb(255, 255, 224, 102) 'Consts.ColorCianSoftLight
	WindowStatusUpdate
End Sub


Sub GroupCollpseExpand_Click
'	Dim this As B4XView = Sender
'	If (CurrentGroupItem <> this.Tag) Then CurrentGroupItem = this.tag
'	Dim p As B4XView = listRequests.GetPanel(CurrentGroupItem)
'	CurrentLineItem = CurrentGroupItem 'listRequests.GetItemFromView(p) +1
'	If p.Tag = True Then
'		listRequests.CollapseItem(CurrentGroupItem)
'	Else
'		listRequests.ExpandItem(CurrentGroupItem)
'	End If
'	ListItemSelected(this.Parent)
End Sub

Sub GroupCollpseExpandInner_Click
	'TabPageState(1, False)
	listsTabPanel.ScrollTo(0, True)
End Sub


Sub listButMap_Click
	
	Dim b As Button = Sender
	Dim p As Panel = b.Parent
	
	Try
		If Not(ShareCode.ISPHONE) Then
			Dim req As RequestData = p.Tag
			Dim ret As ObjectInformation = GetObjectMapInfo(req.Tagcode)

			listsTabPanel.ScrollTo(3, True)
			If gmap.IsInitialized Then
				Dim cp As CameraPosition
				cp.Initialize(ret.Latitude, ret.Longitude, 17)
				gmap.MoveCamera(cp)
			End If
			
		End If
	Catch
		Log(LastException)
	End Try

End Sub


Sub GetObjectMapInfo(tagcode As String) As ObjectInformation
	Private Record As Cursor
	ItemsCounter = 0
	Dim SQL As String = $"${DBStructures.EVC_SQL_CURRENT_OBJECTS_ENT} and a.tagcode in (select distinct entity_tagcode from dta_requests where tagcode='${tagcode}')"$
	
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim ret As ObjectInformation = Types.MakeObjectInformation(tagcode, _
							Record.GetInt("type"), _
							Record.GetString("name"), _
							Record.GetString("address"), _
							Record.GetString("address2"), _
							Record.GetString("postal_code"), _
							Record.GetString("city"), _
							Record.GetString("contact_phone"), _
							Record.GetString("contact_name"), _
							Record.GetString("latitude"), _
							Record.GetString("longitude"), _
							False) 
	Else
		Dim ret As ObjectInformation = Types.MakeObjectInformation(tagcode, 0, "", "", "", "", "", "", "", "", "", False)
	End If
	Record.Close
	Return ret
End Sub

Sub listsButtonFilter_Click
	Dim Filter As AppDialogs
	Filter.Initialize
	Dim Curr As RequestFilter = Types.MakeRequestFilter(FilterStartDate,FilterEndDate,FilterStates, _
		FilterTasks,FilterEntity, FilterRoute, FilterTypeRequests)
	Filter.GetRequestFilterDialog("Requests3", Curr, ListTasks, ListEntities, _
		ListStates, ListTypeRequests)
End Sub
	
Sub CancelAllFilters(run As Boolean)
	ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
	ShareCode.STS001 = True
	ShareCode.STS002 = True
	ShareCode.STS003 = True
	ShareCode.STS004 = True
	ShareCode.STS005 = True
	
	IsFiltered  = False
	FilterStartDate = ShareCode.APPDATE_STARTRANGE
	FilterEndDate = ShareCode.APPDATE_ENDRANGE
	FilterTasks = 0
	FilterEntity = 0
	FilterStates = 0
	If (run) Then
		listRequests.Clear
		Try
			If Not(ShareCode.ISPHONE) Then
				listsRequestsMap.Clear
				Markers.Clear
'				Markers.Add( MarkMyPosition )
'				MarkersBallons.RemoveMarkers
			End If
			'MarkersBallons.AddMarkers(Markers)
		Catch
			Log(LastException)
		End Try

		StartRequestActivity(False, "")
	End If
	ProgressDialogHide
End Sub

Sub SetTheFilters(flt As RequestFilter)
	'RequestFilter(SDate As String, EDate As String, State As Int, CheckList As Int, Entity As Int)
	ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
	Sleep(100)
	current_limit = 0
	next_current_limit = 0
	IsFiltered  = True
	Try
		If (flt.SDate <> "") Then FilterStartDate = flt.SDate
		If (flt.EDate <> "") Then FilterEndDate = flt.EDate
		If (flt.Task > 0) Then FilterTasks = flt.Task
		If (flt.Entity > 0) Then FilterEntity = flt.Entity
		If (flt.State >= 0) Then FilterStates = flt.State
		If (flt.Route >= 0) Then FilterRoute = flt.Route
		If (flt.TPRequest >= 0) Then FilterTypeRequests = flt.TPRequest
	Catch
		Log(LastException)
	End Try
	
	listRequests.Clear
	Try
		If Not(ShareCode.ISPHONE) Then
			listsRequestsMap.Clear
			Markers.Clear
'			Markers.Add( MarkMyPosition )
'			MarkersBallons.RemoveMarkers
		End If
		'MarkersBallons.AddMarkers(Markers)
	Catch
		Log(LastException)
	End Try
	
	Dim sData As String = ShareCode.APPDATE_STARTRANGE
	Dim eData As String = ShareCode.APPDATE_ENDRANGE
	
	Dim whereSAL As String = ""
	If (IsFiltered) Then
		If (FilterStartDate <> "") Then
'			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
'			whereSAL = $"${whereSAL} a.execute_date>='${FilterStartDate}'"$
			sData = FilterStartDate
		End If
		
		If (FilterEndDate <> "") Then
'			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
'			whereSAL = $"${whereSAL} a.execute_date<='${FilterEndDate}'"$
			eData = FilterEndDate
		End If
		
		If (FilterTasks > 0) Then
			Dim error As Boolean = False
			Try
				Dim r As CodeNameList = ListTasks.Get(FilterTasks-1)
			Catch
				Log(LastException)
				error = True
			End Try
			
			If Not(error) Then
				If (whereSAL <> "") Then 
					whereSAL = whereSAL & " and "
				End If
				whereSAL = $"${whereSAL} (a.tagcode in (Select request_tagcode from dta_requests_relations where relation_tagcode='${r.TagCode}'))"$
			End If
			'whereSAL = $"${whereSAL} (Task in (select tagcode from Tasks where id=${FilterTasks}))"$
		End If
		
		If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_ROUTES)) Then
			If (FilterRoute > 0) Then
				Dim r As CodeNameList = ListRoutes.Get(FilterRoute-1)
				If (whereSAL <> "") Then whereSAL = whereSAL & " and "
				whereSAL = $"${whereSAL} (a.route_tagcode='${r.TagCode}')"$
			End If
		End If
		
		If (FilterEntity > 0) Then
			Dim error As Boolean = False
			Try
				Dim r As CodeNameList = ListTasks.Get(FilterEntity-1)
			Catch
				Log(LastException)
				error = True
			End Try
			
			If Not(error) Then
				If (whereSAL <> "") Then 
					whereSAL = whereSAL & " and "
				End If
				whereSAL = $"${whereSAL} (b.title_import='${r.Name}')"$
			End If
			'whereSAL = $"${whereSAL} (entity in (select tagcode from entities where id=${FilterEntity}))"$
		End If
		
'		If (FilterStates > 0) Then
'			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
'			whereSAL = $"${whereSAL} a.status_id='${FilterStates}'"$
'		End If
		
		Dim ItemStatus As String = ""
		If (ShareCode.STS001) Then
			ItemStatus = Utils.concatWith(ItemStatus, "1", ",")
		End If
		If (ShareCode.STS002) Then
			ItemStatus = Utils.concatWith(ItemStatus, "2", ",")
		End If
		If (ShareCode.STS003) Then
			ItemStatus = Utils.concatWith(ItemStatus, "3", ",")
		End If
		If (ShareCode.STS004) Then
			ItemStatus = Utils.concatWith(ItemStatus, "4", ",")
		End If
		If (ShareCode.STS005) Then
			ItemStatus = Utils.concatWith(ItemStatus, "5", ",")
		End If
		
		If Utils.NNE(ItemStatus) Then
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} a.status_id in (${ItemStatus})"$
		End If

		
		If (FilterTypeRequests > 0) Then
			Dim r As CodeNameList = ListTypeRequests.Get(FilterTypeRequests-1)
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} (e.title='${r.Name}')"$
		End If
		
		If (whereSAL <> "") Then whereSAL = $" and ${whereSAL}"$
	End If
	
	ShareCode.APPDATE_STARTRANGE = sData
	ShareCode.APPDATE_ENDRANGE = eData
	ProgressDialogHide
	StartRequestActivity(False, whereSAL)
End Sub

Sub EditSearch_EnterPressed
	MakeListSearch(EditSearch.Text)
End Sub

Sub butSearch_Click
	MakeListSearch(EditSearch.Text)
End Sub

Sub MakeListSearch(search As String)
'	Dim Filter As String = $" where (a.tagcode||a.status_desc||ifnull(a.last_execution,'')||a.request_number||a.request_date||a.request_stime||a.request_etime||b.title||"$ & _
'							$"c.tagcode||c.name||c.local||c.contact_name||c.contact_phone||d.address_tagcode||d.address||d.address2||d.postal_code||d.city||d.latitude||d.longitude like '%${search}%')"$
	'
	Dim Filter As String = $" and a.tagcode in (${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_TAGS} and (a.request_tagcode||d.tagdesc||e.title||b.title_import||b.local_tagcode||c.address||ifnull(c.address2,'')||c.postalcode||c.local||c.latitude||c.longitude like '%${search}%'))"$
	SearchFilter = Filter
	IsFiltered = (Filter <> "")
	StartRequestActivity(True, Filter)
End Sub

Sub LabelButtonTitleAction_Click
	'RequestsOptionsPopMenu.OpenMenu
End Sub

'Sub ExpandeAllPopMenu_Click(MenuName As String)
'	For index= 0 To listRequests.Size-1
'		listRequests.ExpandItem (index)
'	Next
'End Sub
'
'Sub CollapseAllPopMenu_Click(MenuName As String)
'	For index= 0 To listRequests.Size-1
'		listRequests.CollapseItem (index)
'	Next
'End Sub


'TIP: ECRAN DE OPCOES ADICIONAIS (3 PONTINHOS)
Sub listButMore_Click
	
	Dim but As Button = Sender
	Dim reqData  As RequestData = but.Tag
	
	Try
		Dim Pnl As Panel = but.Parent
		Dim Btn2 As Button = Pnl.GetView(6)
		If Utils.NNE(Btn2.Tag) Then
			ShareCode.CurrentRequestClickedIndex = Btn2.Tag
		End If
	Catch
		ShareCode.CurrentRequestClickedIndex = 0
		Log(LastException)
	End Try
	SelectedTagcode = reqData.Tagcode
	SelectedRequestData = reqData
	Log($"${reqData.RequestType}, ${CurrentPage}, ${reqData.RequestCanDelete}"$)
	
	If Utils.NNE(reqData.Tagcode) Then
		Dim theFile As String = DBStructures.GetScriptColumnStrEVC($"select * from dta_requests where tagcode='${SelectedTagcode}'"$, "file_report")
		Dim doClose As Boolean = (reqData.RequestType = 1) And (CurrentPage = 0)
		Dim doTask As Boolean = (reqData.RequestType = 1) And (reqData.RequestCanAdd = 0)
		Dim doDelete As Boolean = (reqData.RequestType = 1)  And (CurrentPage > 0) And (reqData.RequestCanDelete > 0)
		Try
			Dim doReport As Boolean = Utils.Int2Bool(ShareCode.DEVICE_PARAM_GENERATEREPORT)  'True
		Catch
			Dim doReport As Boolean = True
		End Try
		
		'****************************************************************************************
		' NOTE: NOVA FUNÇÃO DE RECONSTRUÇÃO DA INTERVENÇÃO E ENVIO PARA O SERVIDOR
		'****************************************************************************************
		'Dim doView As Boolean = Not(Utils.isNullOrEmpty(theFile))
		Dim doView As Boolean = Utils.NNE(reqData.Tagcode)
		
		Try
			Dim doUpdate As Boolean = Utils.Int2Bool(ShareCode.DEVICE_PARAM_RESYNC_REQUESTS)  'True
		Catch
			Dim doUpdate As Boolean = True
		End Try
		
		Try
			Dim doReschedule As Boolean = Utils.Int2Bool(ShareCode.DEVICE_PARAM_CANRESCHEDULE_REQUESTS)  'True
		Catch
			Dim doReschedule As Boolean = True
		End Try
		
		
		Try
			Dim typerequestTC As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode from dta_requests where tagcode='${reqData.Tagcode}'"$,"typerequest_tagcode")
			Dim can_be_duplicated As Int = DBStructures.GetScriptColumnStrEVC($"select can_be_duplicated from dta_typerequests_adds where typerequest_tagcode='${typerequestTC}'"$,"can_be_duplicated")
			If Utils.Int2Bool(can_be_duplicated) Then
				Dim doDuplicate As Boolean = True
			Else
				Dim doDuplicate As Boolean = False
			End If
		Catch
			Log(LastException)
			Dim doDuplicate As Boolean = False
		End Try

		Dim OptList As List : OptList.Initialize
		OptList.AddAll(Array As Int(Utils.Bool2Int(doClose), _
					Utils.Bool2Int(doTask), _
					Utils.Bool2Int(doDelete), _
					Utils.Bool2Int(doReport), _
					Utils.Bool2Int(doView), _
					Utils.Bool2Int(doUpdate), _
					Utils.Bool2Int(doReschedule), _
					Utils.Bool2Int(doDuplicate) ))
		Dim ReqMenu As AppDialogs
		ReqMenu.Initialize
		Try
			ReqMenu.GetRequestOptionsDialog(Me, "Opções adicionais", OptList, reqData)
		Catch
			MsgboxAsync($"Operação inválida! Não foi possível identificar o identificador do registo seleccionado."$, "Alerta!")
		End Try
	Else
		MsgboxAsync($"Operação inválida! Não foi possível identificar o identificador do registo seleccionado."$, "Alerta!")
	End If

End Sub

'***********************************************************************************
' TIP: OPÇÕES DA LISTAGEM DE INTERVENÇÕES 3PONTINHOS
'***********************************************************************************
Sub RunRequestOption(option As Int, reqData  As RequestData)
'	MsgboxAsync($"Opção selecionada com o tagcode ${SelectedTagcode} = ${option}"$, "Nota")
	
	If (option = 1) Then
		'========================================================
		' CLOSE REQUEST
		'========================================================
		ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
		LockPanel.Visible = False
'		option = ShareCode.Option_CLOSE_REQUEST
		Dim sSQL As String = $"update dta_requests set status_id=3  where tagcode='${reqData.Tagcode}'"$
		Utils.SaveSQLToLog("listButMore_Click",sSQL, reqData.Tagcode)
		Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
		Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
			
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", reqData.Tagcode)
		params.Put("ACLAState", 3)
		params.Put("ACLAUser", ShareCode.SESS_User)
		params.Put("ACLADatetime", Utils.GetCurrDatetime)
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
		End Try
		
		Starter.CurrentWorkActivity = Me
		ProgressDialogHide
		StartRequestActivity(True, CurrentFilter)
	
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla-satus/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", reqData.Tagcode)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,reqData.Tagcode,"","")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(500)
	Else If (option = 2) Then
		'========================================================
		' ADD TASK
		'========================================================
		Private Record As Cursor
'		If  Not(ShareCode.APP_DOMAIN.ToLowerCase = "grandative") And Not(ShareCode.APP_DOMAIN.ToLowerCase = "scms") Then
		Dim SQL As String = $"${DBStructures.EVC_V2_SQL_CURRENT_TASKS} and active=1 order by name, type"$
'		Else
'			Dim SQL As String = $"${DBStructures.EVC_SQL_CURRENT_TASKS} and active=1 order by name, type"$
'		End If
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Dim Filter As AppActionDialogs
			Filter.Initialize
			Filter.GetTaskListDialog(Activity, "requests3", Record)
		Else
			MsgboxAsync("Não existem tarefas disponíveis para selecção!", "Alerta")
			Record.Close
		End If
	Else If (option = 3) Then
		'========================================================
		' DELETE TASK
		'========================================================
		Dim i As Int = Msgbox2("Deseja realmente remover a checklist da intervenção seleccionada?", ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		LockPanel.Visible = False
		If (i=DialogResponse.POSITIVE) Then
			If (reqData.RequestType = 1) And (reqData.RequestCanDelete >0) Then
				ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
				Dim action As String = ""
				Dim SQL As String = $"select * from dta_requests_relations where request_tagcode='${reqData.Tagcode}'
								and repeatcounter=${reqData.RequestCanDelete}"$
				Private Recordw As Cursor
				Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
				If Recordw.RowCount > 0 Then
					Recordw.Position = 0
					Dim action As String = Recordw.GetString("relation_tagcode")
				End If
				Recordw.Close
			
				Dim Lista As List : Lista.Initialize
				Lista.Add(reqData.Tagcode)
				If Utils.NNE(action) Then
					DBStructures.DeleteFromLocalDatabaseFromList2(Lista, action, reqData.RequestCanDelete)
					
					Dim sACLADatetime As String = Utils.GetCurrDatetime
					Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
					Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
			
					Dim params As Map
					params.Initialize
					params.Clear
					params.Put("_token", ShareCode.APP_TOKEN)
					params.Put("ACLARequest", reqData.Tagcode)
					params.Put("ACLAAction", action)
					params.Put("ACLAReqCounter", reqData.RequestCanDelete)
					
					params.Put("ACLAUser", ShareCode.SESS_User)
					params.Put("ACLAAuthorization", ShareCode.APP_Authorization)
					params.Put("ACLADatetime", sACLADatetime)
					params.Put("ACLALatitude", sACLALatitude)
					params.Put("ACLALongitude", sACLALongitude)
					params.Put("versionTagcode", Main.VersionTagcode)
					params.Put("_authorization", Main.DeviceAuthorization)
					params.Put("_instance", Main.DeviceInstance)
					params.put("_deviceBrand", Main.DeviceBrand)
					params.put("_deviceModel", Main.DeviceModel)
					params.put("_deviceMacAddress", Main.DeviceMacAddress)
					params.Put("_user", ShareCode.SESS_User)
	
					Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clarel/delete"$
					If Not(ShareCode.APP_WORKING_LOCAL) Then
						Utils.CallApi(0, params, Me, Url, "", reqData.Tagcode)
					Else
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,reqData.Tagcode,"","")
						Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
					End If
					Sleep(500)
				
				End If
				If (ListaPrincipalClickItem >=0) Then
					ListaPrincipal_ItemClick (ListaPrincipalClickItem, "")
					ListaPrincipalClickItem = -1
				End If
				ProgressDialogHide
			End If
		End If
		
	Else If (option = 4) Then
		'========================================================
		' CREATE REPORT
		'========================================================

		LockPanel.Visible = False
		Sleep(50)
		Dim theFile As String = ""
		Dim SQL As String = $"select * from dta_requests where tagcode='${reqData.Tagcode}'"$
		Private Recordw As Cursor
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			Recordw.Position = 0
			theFile = Utils.IfNullOrEmpty(Recordw.GetString("file_report"), "")
		End If
		Recordw.Close
	
		If (reqData.RequestType = 1) Then
'			If Not(Utils.isNullOrEmpty(theFile)) Then
			If Utils.NNE(theFile) Then
				Dim i As Int
				i = Msgbox2("O relatório já foi gerado. Escolha a opção apropriada neste caso.", ShareCode.GeneralNoteTitle, "Visualizar", ShareCode.Option_CANCEL, "Re-Gerar",  Null)
				LockPanel.Visible = False
				If (i=DialogResponse.POSITIVE) Then
					theFile = theFile.Replace("pdf", "html")
					If File.Exists(Starter.SharedFolder, theFile) Then
						CallSubDelayed3(ReportView, "ShowHTMLReport", reqData, theFile)
					End If
				Else If (i=DialogResponse.NEGATIVE) Then
					Try
						Dim sSQL As String = $"update dta_requests set file_report=''  where tagcode='${reqData.Tagcode}'"$
						Utils.SaveSQLToLog("listButMore_Click",sSQL, reqData.Tagcode)
						CallSubDelayed2(ReportView, "ActivityGenerateReport", reqData)
					Catch
						LockPanel.Visible = False
						Log(LastException)
					End Try
				Else If (i=DialogResponse.CANCEL) Then
				End If
				LockPanel.Visible = False
			Else
				LockPanel.Visible = False
				Try
					'GERAR RELATORIO AGRUPADOR
					CallSubDelayed2(ReportView, "ActivityGenerateReport", reqData)
				Catch
					LockPanel.Visible = False
					Log(LastException)
				End Try
				LockPanel.Visible = False
			End If
		End If
	Else If (option = 5) Then
		'========================================================
		' VIEW REPORT
		'========================================================
		
		'****************************************************************************************
		' NOTE: (VIEW REPORT) NOVA FUNÇÃO DE RECONSTRUÇÃO DA INTERVENÇÃO E ENVIO PARA O SERVIDOR
		'****************************************************************************************
		LockPanel.Visible = False
		Dim res As ResumableSub = CheckAndRebuildRequest(reqData.Tagcode)
		Wait For(res) Complete (Returned As Boolean)
		LockPanel.Visible = False
	Else If (option = 6) Then
		'========================================================
		' UPDATE REQUEST DATA
		'========================================================
		Msgbox2Async("Deseja proceder com a opção seleccionada? Irá carregar a informação do servidor sobrepondo a que existe localmente. Confirme para continuar.", ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null, False)
		Wait For Msgbox_Result (Result As Int)
		LockPanel.Visible = False
		
		If Result = DialogResponse.POSITIVE Then
			
			Dim res As ResumableSub = ForceGetRequests(reqData.Tagcode)
			Wait For(res) Complete (Downloaded As Boolean)
			If (Downloaded) Then
				listRequests.Refresh
'				Msgbox2Async("A Intervenção foi revalidada com sucesso.",ShareCode.GeneralInfoTitle,"OK","","",Null,False)
'				Wait For Msgbox_Result (Result As Int)
'				If Result = DialogResponse.POSITIVE Then
'				End If
				Msgbox2Async("A Intervenção foi revalidada com sucesso. Deseja Abri-la !?", ShareCode.GeneralInfoTitle, ShareCode.Option_YES, "", ShareCode.Option_NO, Null, False)
				Wait For Msgbox_Result (Result As Int)
				If Result = DialogResponse.POSITIVE Then
					If ShareCode.CurrentRequestClickedIndex >= 0 Then
						Dim ActualIndex As Int = ShareCode.CurrentRequestClickedIndex + 1
						ListaPrincipal_ItemClick(ActualIndex, reqData.Tagcode.Trim)
					End If
				End If
				
			Else
				MsgboxAsync("Não foi possivel descarregar a intervenção!",ShareCode.GeneralErrorTitle)
			End If
		End If
	Else If (option = 7) Then
		'========================================================
		' RESCHEDULE REQUEST
		'========================================================
		Dim status_id As String = DBStructures.GetScriptColumnStrEVC($"select status_id from dta_requests where tagcode='${reqData.Tagcode}'"$,"status_id")
		
		If status_id = "1" Then 'INTERVENCAO POR EXECUTAR
			Dim res1 As ResumableSub = DialogoDataIntervencao
			Wait For (res1) complete (choosenData As String)
			
			If Utils.NNE(choosenData) Then
				Dim lstdatetime As List = Regex.Split("\|",choosenData)
				Dim n_date As String = lstdatetime.Get(0)
				Dim n_time As String = lstdatetime.Get(1)
				Dim end_n_date As String = n_date
				Dim end_n_time As String = n_time
			Else
				Return
			End If
			
'			calcular a diferenca existente entre a data de inicio e a de fim que ja existe na intervencao para aplica-la a nova data de fim
			Dim DataInicio As String = DBStructures.GetScriptColumnStrEVC($"select execute_date from dta_requests where 1=1 and
																		tagcode = '${reqData.Tagcode}'"$,"execute_date")
																		
			Dim DataFim As String = DBStructures.GetScriptColumnStrEVC($"select execute_enddate from dta_requests where 1=1 and
																		tagcode = '${reqData.Tagcode}'"$,"execute_enddate")
					
						
			Try
				Dim Diferenca As Period = DateUtils.PeriodBetween(DateTime.DateParse(DataInicio),DateTime.DateParse(DataFim))
				Dim new_end_date As Long = DateUtils.AddPeriod(DateTime.DateParse(n_date),Diferenca)
				end_n_date = DateTime.Date(new_end_date)
			Catch
				Log(LastException)
			End Try
			
		
			
			ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
			Dim UpdRequestSql As String = $"update dta_requests set execute_date  = '${n_date}', execute_start  = '${n_time}',
						execute_enddate = '${end_n_date}', execute_end = '${end_n_time}' where 1=1 and tagcode = '${reqData.Tagcode}'"$
			Utils.SaveSQLToLog("RunQuestOption",UpdRequestSql,reqData.Tagcode)


			Dim ObjectTag As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode from dta_requests where 1=1 and
																		tagcode = '${reqData.Tagcode}'"$,"object_tagcode")

			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", reqData.Tagcode)
			params.Put("ACLAExecDate", n_date)
			params.Put("ACLAExecHour", n_time)
			params.Put("ACLAExecEndDate", end_n_date)
			params.Put("ACLAExecEndHour", end_n_time)
			params.Put("ACLAEntity", reqData.Entity.trim)
			params.Put("ACLAObject", ObjectTag)
			params.Put("ACLSessUser", ShareCode.SESS_OPER_User)
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			
			Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/assign"$
			If Not(ShareCode.APP_WORKING_LOCAL) Then
				Utils.CallApi(0, params, Me, Url, "", reqData.Tagcode)
			Else
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,reqData.Tagcode.Trim,"","")
				Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
			End If
			ProgressDialogHide
			Sleep (100)
			StartRequestActivity(True, CurrentFilter)
		Else
			MsgboxAsync("A Intervenção tem de estar Por Executar para ser alterada a data !", ShareCode.GeneralInfoTitle)
		End If
		
	Else If (option = 8) Then
		'========================================================
		' DUPLICATE REQUEST
		'========================================================
		
		Dim status_id As String = DBStructures.GetScriptColumnStrEVC($"select status_id from dta_requests where tagcode='${reqData.Tagcode}'"$,"status_id")
		Dim typerequestTC As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode from dta_requests where tagcode='${reqData.Tagcode}'"$,"typerequest_tagcode")
'		Dim can_be_duplicated As Int = DBStructures.GetScriptColumnStrEVC($"select can_be_duplicated from dta_typerequests_adds where typerequest_tagcode='${typerequestTC}'"$,"can_be_duplicated")
		Dim duplicate_mode As String = DBStructures.GetScriptColumnStrEVC($"select duplicate_mode from dta_typerequests_adds where typerequest_tagcode='${typerequestTC}'"$,"duplicate_mode")
		Dim tr_is_model As Int = DBStructures.GetScriptColumnIntEVC($"select ifnull(tr_is_model, '0') as agrupadora from dta_typerequests where tagcode='${typerequestTC.trim}'"$, "agrupadora")
													
		If status_id = "3" Then ' INTERVENCAO CONCLUIDA
			Dim res1 As ResumableSub = DialogoDataIntervencao
			Wait For (res1) complete (choosenData As String)
			If Utils.NNE(choosenData) Then
				Dim lstdatetime As List = Regex.Split("\|",choosenData)
				Dim n_date As String = lstdatetime.Get(0)
				Dim n_time As String = lstdatetime.Get(1)
			Else
				Return
			End If
			
			Sleep (100)
			
			If Utils.Int2Bool(tr_is_model) Then
				Dim RS_Tasks As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select * from dta_requests_relations where request_tagcode = '${reqData.Tagcode}'"$)
				Dim Lists_Tasks As List
				Lists_Tasks.Initialize
				Do While RS_Tasks.NextRow
					Dim CL_tagcode As String = RS_Tasks.GetString("relation_tagcode")
					Lists_Tasks.Add(CL_tagcode)
				Loop
				
				Dim res2 As ResumableSub = ShowTasks2Duplicate(Lists_Tasks)
				Wait For (res2) complete (string2Process As String)
				Sleep (100)
				
				Dim res3 As ResumableSub = DuplicateIntervention(reqData.Tagcode, n_date, n_time, duplicate_mode, True, string2Process)
				Wait For (res3) complete (completed As Boolean)
				
			Else
				Dim res3 As ResumableSub = DuplicateIntervention(reqData.Tagcode, n_date, n_time, duplicate_mode, False, "")
				Wait For (res3) complete (completed As Boolean)
			End If
				
			Sleep (100)
			StartRequestActivity(True, CurrentFilter)
		Else
			MsgboxAsync(ShareCode.Intervencaoabertaduplicacao, ShareCode.GeneralInfoTitle)
		End If
	Else If (option = 9) Then
		'========================================================
		' CODIGO BARRAS
		'========================================================
		ShareCode.SingleScan = True
		CallSubDelayed2(BarcodeScanner,"StartScanningSingle", "requests3")
	End If
End Sub
Sub ShowTasks2Duplicate(listOfTasks As List) As ResumableSub
	
	Private dialogotasks As B4XDialog
	dialogotasks.Initialize(Activity)
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 800dip, 400dip)
	p.LoadLayout("DialogListaTasks")
	dialogotasks.PutAtTop = True 'put the dialog at the top of the screen
	Dim mapOfTasks As Map
	mapOfTasks.Initialize
	TaskList2Dup.Clear
	For x=0 To listOfTasks.Size  -1
		Dim currentTask As String = listOfTasks.Get(x)
		Dim taskName As String = DBStructures.GetScriptColumnStrEVC($"select title from dta_tasks where tagcode = '${currentTask}'"$,"title")
		mapOfTasks.Put(currentTask, taskName)
'		TaskList2Dup.AddTextItem(taskName,currentTask)
		TaskList2Dup.Add(CreateDupItem(TaskList2Dup.AsView.Width, taskName),currentTask)
	Next 
	
	Wait For (dialogotasks.ShowCustom(p, "OK", "", "SAIR")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		Dim Val2Return As String = ""
		For x=0 To TaskList2Dup.Size -1
			Dim pn As Panel = TaskList2Dup.GetPanel(x)
			Dim chk As CheckBox = pn.GetView(0)
			If chk.Checked = True Then
				Val2Return = Val2Return & $"${TaskList2Dup.GetValue(x)}|"$
			End If
		Next
		Return Val2Return
	End If
End Sub

Private Sub CreateDupItem(Width As Int, nomeItem As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	Dim height As Int = 60dip
	p.SetLayoutAnimated(0, 0, 0, Width, height)
	p.LoadLayout("dupListCell")
 	dupItemLabel.Text = nomeItem
	dupItemCheck.Checked = True
	Return p
End Sub

'TIP: DUPLICAÇÃO DE INTERVENCAO
Sub DuplicateIntervention(tagcode_origem As String,newdate As String, newtime As String , _
	tipoduplicacao As String, is_model As Boolean, listOftasks As String) As ResumableSub
		
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	
	Dim create_new_rec As String = ""
	Dim newRequestTC As String = Utils.MakeRequestTagcode
	
	If Utils.NE(tipoduplicacao) Then
		tipoduplicacao = "TPDUPLICATE_001"
	End If
	
	If is_model Then
		If Utils.NNE(listOftasks) Then
			Dim listOfTasks2process As List = Regex.Split("\|",listOftasks)
		Else
			is_model = False
		End If
	End If
	
	
'	TPDUPLICATE_001 = Todos os dados
'	TPDUPLICATE_002 = Só Cabeçalhos
'	TPDUPLICATE_003 = Cab. +  Respostas 
'	TPDUPLICATE_004 = Cab. +  Respostas e Observações
'	TPDUPLICATE_005 = Cab. +  Respostas e Fotos
'	TPDUPLICATE_006 = Cab. +  Respostas, Observações e Fotos
'	TPDUPLICATE_007 = Cab. +  Respostas e Ações Subsequentes
	
	'-----------------------------------------------------------
	' DTA_REQUESTS
	'-----------------------------------------------------------
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests", "id", "") +1 + 1000000
	
	create_new_rec  = $"insert into dta_requests
					(id, tagcode,prerequest,parent_tagcode,status_id,state_id,reference,details,req_date,req_time,execdate_type,
					execute_date,execute_enddate,execute_start,execute_end,origin_tagcode,entity_tagcode,object_tagcode,
					process_tagcode,technical_tagcode,team_tagcode,contract_tagcode,contact_tagcode,typerequest_tagcode,
					vehicle_tagcode,created_at,notes,dependent_request,process_number,additional_field_relation)
					select '${maxID}', '${newRequestTC}',prerequest,parent_tagcode,1,4,reference,details,'${Utils.GetCurrentDate}',
	'${Utils.GetCurrentTimeExt}',execdate_type,'${newdate}','${newdate}','${newtime}','${newtime}',origin_tagcode,
					entity_tagcode,object_tagcode, process_tagcode,technical_tagcode,team_tagcode,contract_tagcode,contact_tagcode,
					typerequest_tagcode,vehicle_tagcode,'${Utils.GetCurrDatetimeExt}',notes,dependent_request,process_number,additional_field_relation
					from dta_requests where tagcode='${tagcode_origem}'"$
	Try
		Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
	Catch
		Log(LastException)
	End Try
	
	Sleep(200)
	
	'-----------------------------------------------------------
	' DTA_REQUESTS_ADDS
	'-----------------------------------------------------------
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_adds", "id", "") +1 + 1000000
	
	create_new_rec = $"insert into dta_requests_adds (id, request_tagcode,fieldval_04,paramters,created_at)
					select '${maxID}','${newRequestTC}', fieldval_04, paramters,'${Utils.GetCurrDatetimeExt}'
					from dta_requests_adds where request_tagcode='${tagcode_origem}'"$
	
	Try
		Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
	Catch
		Log(LastException)
	End Try
	
	Sleep(200)
	
	'-----------------------------------------------------------
	' DTA_REQUESTS_ENTITIES
	'-----------------------------------------------------------
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_entities", "id", "") +1 + 1000000
	
	create_new_rec = $"insert into dta_requests_entities
					(id, request_tagcode,entity_tagcode,entity_type,ismaster,created_at)
					Select '${maxID}', '${newRequestTC}',entity_tagcode,entity_type,ismaster,'${Utils.GetCurrDatetimeExt}'
					from dta_requests_entities where request_tagcode='${tagcode_origem}'"$
	
	Try
		Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
	Catch
		Log(LastException)
	End Try
	
	Sleep(200)
	
	'-----------------------------------------------------------
	' DTA_REQUESTS_FIELDS
	'-----------------------------------------------------------
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_fields", "id", "") +1 + 1000000

	create_new_rec = $"insert into dta_requests_fields
					(id, request_tagcode,field_tagcode,value,created_at)
					Select '${maxID}', '${newRequestTC}',field_tagcode,value,'${Utils.GetCurrDatetimeExt}'
					from dta_requests_fields
					where request_tagcode='${tagcode_origem}'"$

	Try
		Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
	Catch
		Log(LastException)
	End Try
	
	Sleep(200)

	'-----------------------------------------------------------
	' DTA_REQUESTS_EXTEND
	'-----------------------------------------------------------
'	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_extend", "id", "") +1 + 1000000
'
'	create_new_rec = $"insert into dta_requests_extend
'					(id, tagcode,paramters,created_at)
'					Select '${maxID}', '${newRequestTC}',paramters,'${Utils.GetCurrDatetimeExt}'
'					from dta_requests_extend where tagcode='${tagcode_origem}'"$
'
'	Try
'		Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
'	Catch
'		Log(LastException)
'	End Try
'	
'	Sleep(200)

	'-----------------------------------------------------------
	' DTA_REQUESTS_OBJECTS
	'-----------------------------------------------------------
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_objects", "id", "") +1 + 1000000

	create_new_rec = $"insert into dta_requests_objects
					(id, request_tagcode,object_tagcode,ismaster,created_at)
					Select '${maxID}', '${newRequestTC}',object_tagcode,ismaster,'${Utils.GetCurrDatetimeExt}'
					from dta_requests_objects where request_tagcode='${tagcode_origem}'"$
	
	Try
		Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
	Catch
		Log(LastException)
	End Try
	
	Sleep(200)

	'-----------------------------------------------------------
	' DTA_REQUESTS_PRE
	'-----------------------------------------------------------
'	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_pre", "id", "") +1 + 1000000
'
'	create_new_rec = $"nsert into dta_requests_pre
'					(id, request_tagcode,typeprerequest_tagcode,paramters,created_at)
'					select '${maxID}', '${newRequestTC}',typeprerequest_tagcode,paramters,'${Utils.GetCurrDatetimeExt}'
'					from dta_requests_pre
'					where request_tagcode='${tagcode_origem}'"$
'	Try
'		Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
'	Catch
'		Log(LastException)
'	End Try
'	
'	Sleep(200)

	'------------------------------------------------------------------------------------------------
	' DTA_REQUESTS_RELATIONS ' REPETE PARA COPIAR AS CHECKLIST SELECCIONADAS NO CASO DAS AGRUPAGORAS
	'------------------------------------------------------------------------------------------------
	If is_model Then
		
		For x=0 To listOfTasks2process.Size -1
			Dim relation_origem As String = listOfTasks2process.Get(x)
		
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") +1 + 1000000

			create_new_rec = $"insert into dta_requests_relations
					(id, request_tagcode,relation_tagcode,position,inner_title,type_relation,execute_date,execute_enddate,
					execute_start,execute_end,object_tagcode,repeated,repeatcounter,subobject_tagcode,created_at)
					select '${maxID}', '${newRequestTC}',relation_tagcode,position,inner_title,
					type_relation,'${newdate}','${newdate}','${newtime}','${newtime}',
					object_tagcode,repeated,repeatcounter,subobject_tagcode,'${Utils.GetCurrDatetimeExt}'
					from dta_requests_relations
					where request_tagcode='${tagcode_origem}' and relation_tagcode = '${relation_origem}'"$
	
			Try
				Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
			Catch
				Log(LastException)
			End Try
	
			Sleep(200)
		
		Next
		
	Else
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") +1 + 1000000

		create_new_rec = $"insert into dta_requests_relations
					(id, request_tagcode,relation_tagcode,position,inner_title,type_relation,execute_date,execute_enddate,
					execute_start,execute_end,object_tagcode,repeated,repeatcounter,subobject_tagcode,created_at)
					select '${maxID}', '${newRequestTC}',relation_tagcode,position,inner_title,
					type_relation,'${newdate}','${newdate}','${newtime}','${newtime}',
					object_tagcode,repeated,repeatcounter,subobject_tagcode,'${Utils.GetCurrDatetimeExt}'
					from dta_requests_relations
					where request_tagcode='${tagcode_origem}'"$
		Try
			Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
		Catch
			Log(LastException)
		End Try
	
		Sleep(200)
	End If


	'-----------------------------------------------------------
	' DTA_REQUESTS_DOCUMENTS
	'-----------------------------------------------------------
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_documents", "id", "") +1 + 1000000
	
	create_new_rec = $"insert into dta_requests_documents
					(id, request_tagcode, document_tagcode, document_type, added_date, created_at, updated_at)
					select '${maxID}', '${newRequestTC}', document_tagcode, document_type, added_date, created_at, updated_at 
					from dta_requests_documents where request_tagcode='${tagcode_origem}'"$
	
	Try
		Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
	Catch
		Log(LastException)
	End Try
	
	Sleep(200)
	
	
'	TPDUPLICATE_001 = Todos os dados
'	TPDUPLICATE_002 = Só Cabeçalhos
'	TPDUPLICATE_003 = Cab. +  Respostas
'	TPDUPLICATE_004 = Cab. +  Respostas e Observações
'	TPDUPLICATE_005 = Cab. +  Respostas e Fotos
'	TPDUPLICATE_006 = Cab. +  Respostas, Observações e Fotos
'	TPDUPLICATE_007 = Cab. +  Respostas e Ações Subsequentes
	
		'---------------------------------------------------------------------------------------------
		' DTA_REQUESTS_VALUES - REPETE PARA COPIAR AS CHECKLIST SELECCIONADAS NO CASO DAS AGRUPAGORAS
		'---------------------------------------------------------------------------------------------
	If is_model Then
		
		For x=0 To listOfTasks2process.Size -1
			Dim tasktagcode_origem As String = listOfTasks2process.Get(x)
				
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
				
			If tipoduplicacao <> "TPDUPLICATE_002" Then ' TODOS MENOS A OPCAO DE SÓ CABECALHOS, COPIA AS RESPOSTAS
				create_new_rec = $"insert into dta_requests_values
					(id, request_tagcode,inner_request_tagcode,task_tagcode,item_tagcode,unique_key,tagcode,position,
					execute_status,execute_value,execute_value_title,execute_format_title,repeated,repeatcounter,repeatitemcounter,
					repeatfieldcounter,title,object_tagcode,subobject_tagcode,on_report,on_report_obs,on_report_action,created_at)
					select '${maxID}', '${newRequestTC}',inner_request_tagcode,task_tagcode,item_tagcode,unique_key,tagcode,position,
					execute_status,execute_value,execute_value_title,execute_format_title,repeated,repeatcounter,repeatitemcounter,
					repeatfieldcounter,title,object_tagcode,subobject_tagcode,on_report,on_report_obs,on_report_action,'${Utils.GetCurrDatetimeExt}' 
					from dta_requests_values where request_tagcode='${tagcode_origem}' and task_tagcode = '${tasktagcode_origem}'"$
			Else
				create_new_rec = $"insert into dta_requests_values
					(id, request_tagcode,inner_request_tagcode,task_tagcode,item_tagcode,unique_key,tagcode,position,
					execute_status,execute_value,execute_value_title,execute_format_title,repeated,repeatcounter,repeatitemcounter,
					repeatfieldcounter,title,object_tagcode,subobject_tagcode,on_report,on_report_obs,on_report_action,created_at)
					select '${maxID}', '${newRequestTC}',inner_request_tagcode,task_tagcode,item_tagcode,unique_key,tagcode,position,
					0,'','',execute_format_title,repeated,repeatcounter,repeatitemcounter,
					repeatfieldcounter,title,object_tagcode,subobject_tagcode,on_report,on_report_obs,on_report_action,'${Utils.GetCurrDatetimeExt}' 
					from dta_requests_values where request_tagcode='${tagcode_origem}' and task_tagcode = '${tasktagcode_origem}'"$
			End If
	
			Try
				Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
			Catch
				Log(LastException)
			End Try
	
			Sleep(200)
				
		Next
			
	Else
		
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
		If tipoduplicacao <> "TPDUPLICATE_002" Then ' TODOS MENOS A OPCAO DE SÓ CABECALHOS, COPIA AS RESPOSTAS
			create_new_rec = $"insert into dta_requests_values
					(id, request_tagcode,inner_request_tagcode,task_tagcode,item_tagcode,unique_key,tagcode,position,
					execute_status,execute_value,execute_value_title,execute_format_title,repeated,repeatcounter,repeatitemcounter,
					repeatfieldcounter,title,object_tagcode,subobject_tagcode,on_report,on_report_obs,on_report_action,created_at)
					select '${maxID}', '${newRequestTC}',inner_request_tagcode,task_tagcode,item_tagcode,unique_key,tagcode,position,
					execute_status,execute_value,execute_value_title,execute_format_title,repeated,repeatcounter,repeatitemcounter,
					repeatfieldcounter,title,object_tagcode,subobject_tagcode,on_report,on_report_obs,on_report_action,'${Utils.GetCurrDatetimeExt}' 
					from dta_requests_values where request_tagcode='${tagcode_origem}'"$
		Else
			create_new_rec = $"insert into dta_requests_values
					(id, request_tagcode,inner_request_tagcode,task_tagcode,item_tagcode,unique_key,tagcode,position,
					execute_status,execute_value,execute_value_title,execute_format_title,repeated,repeatcounter,repeatitemcounter,
					repeatfieldcounter,title,object_tagcode,subobject_tagcode,on_report,on_report_obs,on_report_action,created_at)
					select '${maxID}', '${newRequestTC}',inner_request_tagcode,task_tagcode,item_tagcode,unique_key,tagcode,position,
					0,'','',execute_format_title,repeated,repeatcounter,repeatitemcounter,
					repeatfieldcounter,title,object_tagcode,subobject_tagcode,on_report,on_report_obs,on_report_action,'${Utils.GetCurrDatetimeExt}' 
					from dta_requests_values where request_tagcode='${tagcode_origem}'"$
		End If
			
			
	
		Try
			Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
		Catch
			Log(LastException)
		End Try
	
		Sleep(200)
		
	End If
				
	
	
	If tipoduplicacao = "TPDUPLICATE_001" Or tipoduplicacao = "TPDUPLICATE_005" Or tipoduplicacao = "TPDUPLICATE_006" Then
		'-----------------------------------------------------------
		' DTA_REQUESTS_VALUES_IMAGES
		'-----------------------------------------------------------
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +1 + 1000000

		create_new_rec = $"insert into dta_requests_values_images
					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, position,
					imageb64, imagename, created_at, updated_at, sid_id, execute_datetime, execute_longitude,
					execute_latitude, conf_sid_id, cbr_id, active, on_report, repeated, repeatcounter, repeatitemcounter, repeatfieldcounter)
					select '${maxID}', '${newRequestTC}',inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, position, imageb64,
					imagename, created_at, updated_at, sid_id, execute_datetime, execute_longitude,
					execute_latitude, conf_sid_id, cbr_id, active, on_report, repeated, repeatcounter, repeatitemcounter, repeatfieldcounter 
					from dta_requests_values_images where request_tagcode='${tagcode_origem}'"$
	
		Try
			Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
		Catch
			Log(LastException)
		End Try
	
		Sleep(200)
	End If

	If tipoduplicacao = "TPDUPLICATE_001" Or "TPDUPLICATE_006" Then
		'-----------------------------------------------------------
		' DTA_REQUESTS_NOTES
		'-----------------------------------------------------------
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_notes", "id", "") +1 + 1000000

		create_new_rec = $"insert into dta_requests_notes
						(id,request_tagcode,note_type,note,created_at,updated_at,sid_id,cbr_id,active)
						select '${maxID}', '${newRequestTC}',note_type,note,created_at,updated_at,sid_id,cbr_id,active
						from dta_requests_notes where request_tagcode='${tagcode_origem}'"$
		
		Try
			Starter.LocalSQLEVC.ExecNonQuery(create_new_rec)
		Catch
			Log(LastException)
		End Try
	
		Sleep(200)
	End If

	' FAZER CHAMADA A API PARA ENVIAR A INTERVENCAO DUPLICADA PARA O SERVIDOR
	
	Dim ACLSessUser As String = ShareCode.SESS_OPER_User
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", tagcode_origem)
	params.Put("ACLARequestNew", newRequestTC)
	params.Put("ACLADateStart", Utils.GetCurrDatetime)
	params.Put("ACLAHourStart", Utils.GetCurrentTimeExt)
	params.Put("ACLAIsModel", is_model)
	params.Put("ACLADuplicateType", tipoduplicacao)
	params.Put("ACLATasks", listOftasks)
	params.Put("ACLAUser", ACLSessUser)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla/duplicate"$
	If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", tagcode_origem)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,tagcode_origem,"","")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,tagcode_origem,"","")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If

	ProgressDialogHide
	Return True
		
End Sub


Sub DialogoDataIntervencao As ResumableSub
	
	Private dialogo As B4XDialog
	dialogo.Initialize(Activity)
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 800dip, 400dip)
	p.LoadLayout("DialogDataHora")
	dialogo.PutAtTop = True 'put the dialog at the top of the screen
	data_Intervencao.text = Utils.GetCurrentDate
	hora_intervencao.Text = Utils.GetCurrentTimeExt

	Wait For (dialogo.ShowCustom(p, "OK", "", "CANCELAR")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		Dim fulldata As String = $"${Utils.IfNullOrEmpty(data_Intervencao.Text,Utils.GetCurrentDate)}|${Utils.IfNullOrEmpty(hora_intervencao.text, Utils.GetCurrentTimeExt)}"$
		Return fulldata
	Else
		Return ""
	End If
	
End Sub

Sub BotaoDataDup_click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (data_Intervencao.Text  <> "") Then
		dnow = DateTime.DateParse(data_Intervencao.text)
	End If
	dd.Initialize("CalendarGetDupDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
	dd.show("data_Intervencao")
End Sub

Sub CalendarGetDupDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	data_Intervencao.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub BotaoHoraDup_Click
	
	Dim tt As TimePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	Try
		If (hora_intervencao.Text  <> "") Then
			dnow = DateTime.TimeParse($"${hora_intervencao.text}:00"$)
		End If
		
		tt.Initialize("CalendarGetDupTime", DateTime.GetHour(dnow), DateTime.GetMinute(dnow), True)
		tt.show("hora_intervencao")
	Catch
		Log(LastException)
	End Try
End Sub

Sub CalendarGetDupTime_onTimeSet (hour As Int, minute As Int, second As Int)
	hora_intervencao.Text = $"${NumberFormat(hour,2,0)}:${NumberFormat(minute,2,0)}:00"$
End Sub

'**********************************************************************************
'	ADICIONA TAREFA (ACÇÃO/CHECKLIST) À INTERVENÇÃO / ORDEM DE SERVIÇO
'**********************************************************************************
Public Sub TaskListItemSelected(tagcode As String)

End Sub

'===========================================================================================
' 	EFECTUA O DOWNLOAD DE DADOS
'===========================================================================================
Sub DownloadTable(groupName As String, tablename As String, tagcode As String, action As String, rcounter As Int) As ResumableSub
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/download/table/update2"$
	Log("**********  " & tablename & "  ***********")
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Job.PostString(ServerAddress, MakeTableMaps(groupName, tablename, tagcode, action, rcounter) )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	Dim ret As Boolean = Job.Success
	If ret Then
		Try
			InsertUpdateTable(Job.GetString)
			Log(Job.GetString)
		Catch
			Log(LastException)
			Utils.logError($"Download ${groupName}: "$, ShareCode.SESS_User, LastException)
		End Try
	Else
		Utils.logError($"Download ${groupName}: "$, ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	Return ret
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
				DBUtils.InsertMaps(Starter.LocalSQLEVC, table, rows)
				Sleep(50)
			End If

		Next
	End If
End Sub

'===========================================================================================
' 	CRIA MAPEAMENTO DE CAMPOS PARAMETRO PARA EFECTUAR A CHAMADA DA API
'===========================================================================================
Sub MakeTableMaps(groupName As String, tablename As String, tagcode As String, action As String, rcounter As Int) As String
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("_team", ShareCode.SESS_User)
	params.Put("groupname", groupName)
	params.Put("tablename", tablename)
	params.Put("tagcode", tagcode)
	params.Put("action", action)
	params.Put("rcounter", rcounter)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	'params.Put("data", mapAllExistingRecords(tablename))
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String =   JSON.ToPrettyString(1)
	Log(data)
	Return data
End Sub


'**********************************************************************************
'	EXECUTA/VERIFICA/INICIA UMA TAREFA (ACÇÃO/CHECKLIST) DA INTERVENÇÃO OU
' 	ORDEM DE SERVIÇO SELECCIONADA
'
'		- CLICK NA LINHA DE REGISTO
'		- CLICK NO BOTÃO DE MENU
'**********************************************************************************
Sub pnlGroupDataItem_Click
	Dim Pnl As Panel = Sender
	Dim data As RequestCLA = Pnl.Tag
	ProgressDialogShow2(ShareCode.LoadingRequestMessage,True)
	Dim tasktype As Int = data.TaskType
	
	If (tasktype = 0) Then
		Log(data.Request)
		Dim Entity As Label = Pnl.GetView(0)
		CallSubDelayed3(CheckList3, "StartCLA_Activity", data, Entity.Text)
	Else
		CurrentTabPage = CurrentTabPage + 1
		TabPageState(CurrentTabPage, True)
		listsTabPanel.ScrollTo(CurrentTabPage, True)
		'CreateRequestItemLevel(CurrentTabPage, data, listRequestsItem.sv.Width, 70dip, Null)
	End If
	ProgressDialogHide
	'MakeRequestCLA(Request As String, Action As String, Task As String, Status As Intervention) As RequestCLA
	'Sub MakeInterv(id As Int, code As String, status As Int, color As Int) As Intervention
End Sub

Sub listButObjectAction_Click
	Dim Btn As Button = Sender
	Dim Pnl As Panel = Btn.Parent
	Dim data As RequestCLA = Pnl.Tag
	Dim Entity As Label = Pnl.GetView(0)
	CallSubDelayed3(CheckList3, "StartCLA_Activity", data, Entity.Text)
	CurrentIndexPanel = -1
	CurrentIDPanel = 0
End Sub


Sub listButMoreAction_Click
	
End Sub

Sub listButMoreActionInner_Click
	Dim Btn As Button = Sender 'CLAButtonOptions.Tag = CLAItem
	Dim CLAItem As RequestCLAItem = Btn.Tag
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "requests3", CLAItem, 0, "", "", 0, "", "", "",0)
	'CallSubDelayed3(MoreActions, "StartCLA_Activity", Types.MakeActivityParams(Activity, "requests3", 0, "", ""), CLAItem)
End Sub

Sub Return2CLAI(CLAItem As RequestCLAItem, TabPos As Int)
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "requests3", CLAItem, TabPos, "", "", 0, "", "", "",0)
End Sub

Sub CamImage(CLAItem As RequestCLAItem)
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "requests3", CLAItem, 0, "", "", 0, "", "", "",0)
End Sub


Sub listInnerButMore_Click
	
End Sub

Sub listInnerButMap_Click
	
End Sub


Sub pnlGroupDataList_ItemClick (Index As Int, Value As Object)
	
End Sub

'Sub listsTabPanel2_PageChanged (Position As Int)
'	
'End Sub
'
'Sub listsTabPanel2_PageScrolled (Position As Int, PositionOffset As Float, PositionOffsetPixels As Int)
'	
'End Sub


Sub CLAItemButtonBR_INIT_StateClick (State As Int)
	If ((CLA_BR_CAR.Text = "") Or (CLA_BR_KMI.Text = "")) Then
		CLAItemButtonBR_INIT.State = 0
		MsgboxAsync("A viatura e os Kilometros são obrigatórios!", "Alerta!")
	Else
		'Save value and close
		
	End If
End Sub

Sub CLAItemButtonBR_INIT_A_Click
	
End Sub

Sub CLAItemButtonX_StateClick (State As Int)
	
End Sub

Sub CLAItemButtonX_A_Click
	
End Sub

Sub CLAItemButtonBR_A_Click
	
End Sub

Sub CLAItemButtonBR_StateClick (State As Int)
	If ((CLA_BR_KMF.Text = "") Or ((CLA_BR_E1.Text = "") And (CLA_BR_S1.Text = ""))) Then
		CLAItemButtonBR_INIT.State = 0
		MsgboxAsync("Os Kilometros são obrigatórios e pelo menos uma entrada e saída!", "Alerta!")
	Else
		'Save value and close
		
	End If
End Sub

Sub CLAItemEditValueX_EnterPressed
	
End Sub

Sub CLA_BR_KMF_EnterPressed
	
End Sub

Sub CLA_BR_KMF_A_Click
	
End Sub

Sub CLAItemButtonBRINIT_StateClick (State As Int)
	'CLAItemButtonBRINIT
	Dim currPanel As Panel = Sender
	Dim car As FloatLabeledEditText = currPanel.GetView(0)
	Dim kmi As FloatLabeledEditText = currPanel.GetView(1)
	Dim obs As FloatLabeledEditText = currPanel.GetView(2)
	
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

Sub ChecklistReturn(thisCLA As CLAData)
	'
End Sub


Sub mapData_Click (Point As LatLng)
	
End Sub

Sub mapData_Ready
	gmap = mapData.GetMap
	'rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
	If gmap.IsInitialized Then
		Do While gmap.MyLocation.IsInitialized = False
			Sleep(50)
		Loop
		
		Dim cp As CameraPosition
		cp.Initialize(gmap.MyLocation.Latitude, gmap.MyLocation.Longitude, 17)
		gmap.MoveCamera(cp)
	End If
End Sub

Sub mapData_MarkerClick (SelectedMarker As Marker) As Boolean 'Return True to consume the click
	Log(SelectedMarker.Snippet)
End Sub

'*******************************************************************
' 	PULL DE INTERVENÇÕES - EVENTO
'*******************************************************************
'**************************************************************************************************************************************
Sub listsButtonPull_Click
	
End Sub

'*******************************************************************
' 	FAVORITOS DE INTERVENÇÕES - EVENTO
'*******************************************************************
'**************************************************************************************************************************************
Sub listsButtonFavorites_Click
	Dim filter As String = ""
	Dim retfilter As String = CurrentFilter
	
	If (Starter.RequestFavorites = 1) Then
		Starter.RequestFavorites = 0
		listsButtonFavorites.TextColor = 0xFF555555
		filter = $"(a.is_favorite in (0,1))"$
	Else
		Starter.RequestFavorites = 1
		listsButtonFavorites.TextColor = 0xFFF00000
		filter = $"(a.is_favorite in (1))"$
	End If
	If (retfilter <> "") Then
		retfilter = $" ${retfilter} and ${filter}"$
	Else
		retfilter = $" and ${filter}"$
	End If
	StartRequestActivity(True, retfilter)
End Sub

Sub ListItem_Favorite_Click
	Dim thisIcon As Label = Sender
	Dim reqData  As RequestData = thisIcon.Tag   
	
	If (reqData.Favorite = 0) Then
		thisIcon.Text = Chr(0xF005)
		thisIcon.TextColor = Consts.ColorOrange '0xFFFF9400
		reqData.Favorite = 1
	Else
		thisIcon.Text = Chr(0xF006)
		thisIcon.TextColor = Consts.ColorGray '0xFFCDCDCD
		reqData.Favorite = 0
	End If
	
	Dim sSQL As String = $"update dta_requests set is_favorite=${reqData.Favorite} where tagcode='${reqData.Tagcode}'"$
	Utils.SaveSQLToLog("ListItem_Favorite_Click",sSQL, reqData.Tagcode)
	'	Starter.LocalSQLEVC.ExecNonQuery(sSQL)
	
	'Chr(0xF005)
	'Chr(0xF006)
	'ListItem_Favorite
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", reqData.Tagcode)
	params.Put("ACLAState", reqData.Favorite)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla/fav/update"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Utils.CallApi(0, params, Me, Url, "", reqData.Tagcode)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,reqData.Tagcode,"","")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(250)

End Sub

'*******************************************************************
' 	INDICADOR DE NOTAS/OBSERVAÇÕES
'*******************************************************************
'**************************************************************************************************************************************
Sub listButNote_Click
	Dim but As Button = Sender
	Dim txt As String = but.tag
	If Utils.NNE(txt) Then
		MsgboxAsync(txt, "Notas/Observações")
	End If
End Sub


'*******************************************************************
' 	ADICIONA NOVA INTERVENÇÃO
'*******************************************************************
'**************************************************************************************************************************************
Sub butQuickAction_Click
	Dim but As Button = Sender 
	Dim colitems As RequestData = but.Tag
	Dim TagList As List : TagList.Initialize
	
	If (colitems.RequestType = 1) Then
	
		Dim sSQL As String = $"Select distinct a.task_tagcode, b.title, ifnull(c.title, '') as taggroup
							from dta_typerequests_tasks as a 
							inner join dta_tasks as b on (b.tagcode=a.task_tagcode)
							left join dta_tasks_groups as c on (c.tagcode=b.task_group)
							where a.repeated=1 and b.active=1 
								and a.typerequest_tagcode in (select distinct typerequest_tagcode  
										from dta_requests where tagcode='${colitems.Tagcode}')"$
		Log(sSQL)										
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount >= 1 Then
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				TagList.Add( Types.MakeTagListType( Record.GetString("task_tagcode"), Record.GetString("title"), Record.GetString("taggroup")) )
			Next
		End If
		Record.Close
		
		If (TagList.Size = 0) Then
			'***********************************************************
			' VERIFICA SE O TIPO DE INTERVENÇÃO PERMITE ADICIONAR
			' QUALQUER TIPO DE CHECKLISTS
			'***********************************************************
			Dim sSQL As String = $"Select distinct a.tagcode
						from dta_typerequests as a 
						inner join type_trclmodetypes as b on (b.tagcode=a.trcl_mode)
						where b.onlyinlist=0 
							and a.tagcode in (select distinct typerequest_tagcode 
									from dta_requests where tagcode='${colitems.Tagcode}')"$
			Private AddRequest As Cursor
			AddRequest = Starter.LocalSQLEVC.ExecQuery(sSQL)
			Dim AddVisible As Boolean = AddRequest.RowCount >= 1
			AddRequest.Close
			If (AddVisible) Then
				Dim sSQL As String = $"Select distinct a.tagcode, a.title, ifnull(b.title, '') as taggroup
							from dta_tasks as a 
							left join dta_tasks_groups as b on (b.tagcode=a.task_group)
							where a.title is not null and a.active=1
							group by b.title, a.title"$
				Private Record As Cursor
				Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
				If Record.RowCount >= 1 Then
					For Row = 0 To Record.RowCount-1
						Record.Position = Row
						TagList.Add( Types.MakeTagListType( Record.GetString("tagcode"), Record.GetString("title"), Record.GetString("taggroup")) )
					Next
				End If
				Record.Close
			End If
		End If
		If (TagList.Size = 1) Then
			Dim r As TagListType = TagList.Get(0)
			
			Dim Newrepeatcounter As Int = 1
	'		Dim sSQL As String = $"Select distinct max(repeatcounter) as repeatcounter
	'								from dta_requests_relations as a 
	'								inner join dta_requests as b on (b.tagcode=a.request_tagcode)
	'								where b.tagcode='${colitems.Tagcode}' and a.relation_tagcode='TSKS_EJREQUIPMENT'"$
			Dim sSQL As String = $"Select distinct count(0) as repeatcounter
									from dta_requests_relations as a 
									inner join dta_requests as b on (b.tagcode=a.request_tagcode)
									where b.tagcode='${colitems.Tagcode}' and a.relation_tagcode='${r.tagcode}'"$
		Else
			Dim sSQL As String = $"Select distinct count(0) as repeatcounter
									from dta_requests_relations as a 
									inner join dta_requests as b on (b.tagcode=a.request_tagcode)
									where b.tagcode='${colitems.Tagcode}'"$
		End If
		
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount >= 1 Then
			Record.Position = 0
			Newrepeatcounter = Record.GetInt("repeatcounter")  + 1
		End If
		Record.Close
		
		If (TagList.Size = 1) Then
			butCallActions(colitems, TagList.Get(0), Newrepeatcounter)
		else If (TagList.Size > 1) Then
			Dim tempcolitems As RequestData : tempcolitems.initialize
			tempcolitems.Tagcode = colitems.Tagcode
			tempcolitems.Favorite = Newrepeatcounter
			tempcolitems.Entity = colitems.Entity
			tempcolitems.RequestType = colitems.RequestType
			Dim AppDialogAddCL As AppDialogs
			AppDialogAddCL.Initialize
			AppDialogAddCL.getCLADDSelectDialog(Activity, "requests3", "Lista de Tarefas", tempcolitems, TagList)
		Else
			MsgboxAsync("Não foram definidos quaisquer critérios para adição de nova Lista de Verificação (Tarefa). Reveja as definições do tipo de intervenção.", "alerta")
		End If
	End If
End Sub

Sub ReturnFromListCLADD(colitems As RequestData, TagItem As TagListType)
	butCallActions(colitems, TagItem, colitems.Favorite)
End Sub

Sub butCallActions(colitems As RequestData, TagItem As TagListType, NewCounter As Int)

	'CallSubDelayed2(ImageEdit, "StartDraw", 0)
	'Dim tagcode As String = "TSKS_2019_222538"
	Starter.APP_IN_EXECUTION = True
	Dim tagcode3 As String = TagItem.tagcode   '"TSKS_2019_182137"
	If Utils.NNE(tagcode3) Then
		ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
		Try
			Dim newRequestItem As Map
			newRequestItem.Initialize
			
		
			Dim newDate As String = Utils.GetCurrentDate
			Dim newTime As String = Utils.GetCurrentTimeExt
			
			Dim object_tagcode As String = DBStructures.GetScriptColumnStrEVC($"Select object_tagcode from dta_requests where tagcode='${colitems.Tagcode}'"$,"object_tagcode")
			object_tagcode = Utils.IfNullOrEmpty(object_tagcode, "__NONE__")

			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
			Dim newExecution As Map
			newExecution.Initialize
			newExecution.Put("id", maxID)
			newExecution.Put("request_tagcode", colitems.Tagcode)
			newExecution.Put("relation_tagcode", tagcode3)
			newExecution.Put("inner_title", "")
			newExecution.Put("position", NewCounter+2)
			newExecution.Put("type_relation", 0)
			newExecution.Put("status_id", 1)
			newExecution.Put("excel_import", 0)
			newExecution.Put("imported", 0)
			newExecution.Put("import_tagcode", "")
			'newExecution.Put("object_tagcode", object_tagcode)
			newExecution.Put("execute_date", newDate)
			newExecution.Put("execute_start", newTime)
			newExecution.Put("execute_end", newTime)
			newExecution.Put("repeatcounter", NewCounter)
			newExecution.Put("sess_user", ShareCode.SESS_OPER_User)
			newExecution.Put("active", 1)
			Dim ListOfMaps As List
			ListOfMaps.Initialize
			ListOfMaps.Add(newExecution)
			newRequestItem.Put("relation", ListOfMaps)
'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
			Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,colitems.Tagcode,"")

			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000

'			Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
'				tagcode,position,execute_value,confirmed,changed_value, repeatcounter)
'				select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
'				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
'				x.execute_value, x.confirmed, x.changed_value, x.repeatcounter
'				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode as tagcode, 
'				ifnull(d.position, c.position) AS position, '' as execute_value, 0 as confirmed, '' as changed_value, ${NewCounter} AS repeatcounter
'				from dta_requests_relations as a
'				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode='${colitems.Tagcode}' and a.relation_tagcode='${tagcode3}' and a.repeatcounter=0
'				) as x order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$
			
			Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)
				select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
				x.execute_value, x.confirmed, 
				x.execute_format_title, 
				x.changed_value, x.repeatcounter
				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, a.position As relposition,
				'' as execute_value, 
				Case when d.data_type=16 Then d.title Else '' end as execute_format_title, 
				0 as confirmed, '' as changed_value, ${NewCounter} AS repeatcounter
				from dta_requests_relations as a
				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
				where a.type_relation=0 and a.request_tagcode='${colitems.Tagcode}' and a.relation_tagcode='${tagcode3}' and a.repeatcounter= ${NewCounter} 
				) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id"$

			Log(sSQL)
			Utils.SaveSQLToLog("butCallActions",sSQL, colitems.Tagcode)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		
			UploadNewRequestRel2Server(colitems.Tagcode, tagcode3, NewCounter, newRequestItem, "")
			Sleep(2000)

		Catch
			Log(LastException)
		End Try
		
		ProgressDialogHide
		
		Starter.APP_IN_EXECUTION = False
		
		If (ListaPrincipalClickItem >=0) Then
			ListaPrincipal_ItemClick (ListaPrincipalClickItem, "")
			ListaPrincipalClickItem = -1
		End If
	Else
		ToastMessageShow(ShareCode.requestsErroCriarChecklist, False)
	End If
End Sub

Sub UploadNewRequestRel2Server(tagcode As String, relation As String, counter As String, items As Map, tObject As String)  As ResumableSub
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
	params.Put("_relation", relation)
	params.Put("_repeatcounter", counter)
	params.Put("_object", tObject)
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
		Try
			If Job.Success Then
				Log(Job.GetString)
			Else
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.trim,"","")
				Utils.save2update(ServerAddress, data, 0, WorkerND)
			End If
		Catch
			Log(LastException)
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.trim,"","")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End Try
		
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.trim,"","")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If
	Return True
End Sub

'**************************************************************************************************************************************


Sub CheckTypeRequestTaskAdds(Request As String, Action As String)  As ResumableSub
	' *****************************************************************
	' VERIFICA SE TEM PARAMETROS ESPECÍFICOS
	' DTA_TYPEREQUESTS_TASKS_ADDS->PARAMTERS
	' *****************************************************************
	Dim request_type As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(typerequest_tagcode, '') as valor
													from dta_requests where tagcode='${Request.trim}'"$, "valor")
	Dim object_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(object_tagcode, '') as valor
													from dta_requests where tagcode='${Request.trim}'"$, "valor")
	If Utils.NNE(request_type) And Utils.NNE(object_tagcode) Then
		Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${request_type.Trim}'
												And task_tagcode='${Action.trim}'"$, "paramters")	
												
		If QuestParams.ContainsKey("update_object_fields") Then
			Try
				Dim update_object_fields As Int = QuestParams.Get("update_object_fields")
			Catch
				Dim update_object_fields As Int = 0
				Log(LastException)
			End Try
		Else
			Dim update_object_fields As Int = 0
		End If
		
							
		If Utils.Int2Bool(update_object_fields) Then
			Dim updobjfls_settings As List = QuestParams.Get("updobjfls_settings")
			For Each colupdobjfls_settings As Map In updobjfls_settings
										
				Dim field_name As String = colupdobjfls_settings.Get("field_name")
				Dim is_additional As Int = colupdobjfls_settings.Get("is_additional")
				Dim is_address As Int = colupdobjfls_settings.Get("is_address")
				Dim UPDCNDValue As String = colupdobjfls_settings.Get("value")
										
				Dim update_value_type As Int = colupdobjfls_settings.Get("update_value_type")
				Dim script As String = colupdobjfls_settings.Get("script")
				Dim external_tagcode As String = colupdobjfls_settings.Get("external_tagcode")
				Dim is_contact As Int = colupdobjfls_settings.Get("is_contact")
										
										
				'Dim dependent_condition As Int = colupdobjfls_settings.Get("dependent_condition")
				'If (Utils.Int2Bool(dependent_condition)) Then
				'
				'	Dim condition_settings As List = colupdobjfls_settings.Get("condition_settings")
				'	For Each colcondition_settings As Map In condition_settings
				'		Dim condition As String = colcondition_settings.Get("condition")
				'		Dim condition_tagcode As String = colcondition_settings.Get("condition_tagcode")
				'		Dim condition_type As Int = colcondition_settings.Get("condition_type")
				'		Dim condition_value As String = colcondition_settings.Get("condition_value")
				'	Next
				'End If
										
				Dim ContinuarUPDT As Boolean = (update_value_type >= 1)
				Dim UPDTValue As String = ""
										
				If (update_value_type = 1) Then 'Data
					UPDTValue = Utils.GetCurrentDate
				Else If (update_value_type = 2) Then 'Hora
					UPDTValue = Utils.GetCurrentTimeExt
				Else If (update_value_type = 3) Then 'Datahora
					UPDTValue = Utils.GetCurrDatetimeExt
				Else If (update_value_type = 4) Then 'Incrementa
					Dim TempValue As String = ""
					If Utils.Int2Bool(is_additional) Then
						Dim TempValue As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '0') as valor
													from dta_objects_fields where object_tagcode='${object_tagcode.trim}' 
													and field_tagcode='${field_name.trim}'"$, "valor")
					Else
						Dim TempValue As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(${field_name.trim}, '0') as valor
													from dta_objects where tagcode='${object_tagcode.trim}'"$, "valor")
					End If
											
					If Utils.NNE(TempValue) Then
						Try
							Dim iTempValue As Int = TempValue + 1
						Catch
							Dim iTempValue As Int = 1
						End Try
						UPDTValue = iTempValue
					End If
				Else If (update_value_type = 5) Then 'Identificador de estado
				Else If (update_value_type = 6) Then 'Valor de pergunta/resposta (afecta external_tagcode)
				Else If (update_value_type = 7) Then 'Valor específico
					UPDTValue = UPDCNDValue
				Else If (update_value_type = 8) Then 'script (afecta script)
				End If
										
				If (ContinuarUPDT) Then
											
					If Utils.Int2Bool(is_additional) Then
						Dim updSQLRec As String = $"update dta_objects_fields set value='${UPDTValue}'
																			where 1=1
																			and object_tagcode='${object_tagcode.trim}' 
																			and field_tagcode='${field_name.trim}'"$
					Else
						Dim updSQLRec As String = $"update dta_objects set ${field_name.trim}='${UPDTValue}'
																			where 1=1
																			and tagcode='${object_tagcode.trim}'"$
					End If
																			
					Log(updSQLRec)
					Dim UpdateServer As Boolean = True
					Try
						Utils.SaveSQLToLog("ListReturn3",updSQLRec, object_tagcode)
					Catch
						Log($"Erro de campo: ${LastException}"$)
						Dim UpdateServer As Boolean = False
					End Try
					
					If (UpdateServer) Then
						Dim params As Map
						params.Initialize
						params.Clear
						params.Put("_token", ShareCode.APP_TOKEN)
						params.Put("ACLAObject", object_tagcode.trim)
						params.Put("ACLAField", field_name.trim)
						params.Put("ACLAValue", UPDTValue)
						params.Put("versionTagcode", Main.VersionTagcode)
						params.Put("_authorization", Main.DeviceAuthorization)
						params.Put("_instance", Main.DeviceInstance)
						params.put("_deviceBrand", Main.DeviceBrand)
						params.put("_deviceModel", Main.DeviceModel)
						params.put("_deviceMacAddress", Main.DeviceMacAddress)
						params.Put("_user", ShareCode.SESS_User)
						Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla/object/field/update"$
						If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
							If Not(ShareCode.APP_WORKING_LOCAL) Then
								Utils.CallApi(0, params, Me, Url, "", "")
							Else
								Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(3,object_tagcode.trim,"","")
								Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
							End If
							Sleep(500)
						Else
							Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(3,object_tagcode.trim,"","")
							Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
						End If
					End If
				End If
										
			Next
		End If
		
		Sleep(250)
	End If
	Return True
End Sub

Sub CheckTypeRequestNewTask(Request As String, Action As String) As ResumableSub
	' *****************************************************************
	' VERIFICA SE TEM PARAMETROS ESPECÍFICOS
	' DTA_TYPEREQUESTS_TASKS_ADDS->PARAMTERS
	' *****************************************************************
	Dim request_type As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(typerequest_tagcode, '') as valor
													from dta_requests where tagcode='${Request.trim}'"$, "valor")
	Dim tr_is_model As Int = DBStructures.GetScriptColumnIntEVC($"select ifnull(tr_is_model, '0') as valor
													from dta_typerequests where tagcode='${request_type.trim}'"$, "valor")
	
	Dim object_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(object_tagcode, '') as valor
													from dta_requests where tagcode='${Request.trim}'"$, "valor")
													
	Dim object_group As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(object_group, '') as valor
													from dta_objects where tagcode='${object_tagcode.trim}'"$, "valor")
													
	If Utils.NNE(request_type) And Utils.NNE(object_tagcode) And (tr_is_model = 1) And  Utils.NNE(object_group) Then
	
		Dim taskTagcode As String = DBStructures.GetScriptColumnStrEVC($"Select ifnull(tagcode, '') as valor
											from dta_tasks
											where task_type_mode='TTMT_03'
												And connect2data like '%'||(Select distinct i.object_type from dta_objects As i
													where i.tagcode='${object_tagcode.trim}'
													And i.object_group in (
														Select tagcode from dta_objecttypes_groups 
														where objtyp_tagcode=i.object_type
														And tagcode='${object_group.trim}'
													))||'%'
												And parent_tagcode='${object_group.trim}'
												limit 1"$, "valor")
		
		Dim ExistChecklist As Int = DBStructures.GetScriptColumnIntEVC($"Select count(relation_tagcode) As valor
						from dta_requests_relations where request_tagcode='${request_type.trim}' and relation_tagcode='${taskTagcode.trim}'"$, "valor")

		If (ExistChecklist = 0) Then
			If Utils.NNE(taskTagcode) Then
				Dim newRequestItem As Map
				newRequestItem.Initialize
				Dim NewCounter As Int = 0
			
				Dim newDate As String = Utils.GetCurrentDate
				Dim newTime As String = Utils.GetCurrentTimeExt

				Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
				Dim newExecution As Map
				newExecution.Initialize
				newExecution.Put("id", maxID)
				newExecution.Put("request_tagcode", Request.trim)
				newExecution.Put("relation_tagcode", taskTagcode)
				newExecution.Put("inner_title", "")
				newExecution.Put("position", NewCounter+2)
				newExecution.Put("type_relation", 0)
				newExecution.Put("status_id", 1)
				newExecution.Put("excel_import", 0)
				newExecution.Put("imported", 0)
				newExecution.Put("import_tagcode", "")
				'newExecution.Put("object_tagcode", object_tagcode)
				newExecution.Put("execute_date", newDate)
				newExecution.Put("execute_start", newTime)
				newExecution.Put("execute_end", newTime)
				newExecution.Put("repeatcounter", NewCounter)
				newExecution.Put("sess_user", ShareCode.SESS_OPER_User)
				newExecution.Put("active", 1)
				Dim ListOfMaps As List
				ListOfMaps.Initialize
				ListOfMaps.Add(newExecution)
				newRequestItem.Put("relation", ListOfMaps)
				'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
				Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,Request.trim,"")

				Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
				Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,
					item_tagcode,unique_key,
					tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)
					select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
					x.item_tagcode, x.unique_key, x.tagcode, x.position, 
					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter
					from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, 
					a.relation_tagcode as task_tagcode, 
					c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, 
					a.position As relposition, '' as execute_value, 
					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
					0 as confirmed, '' as changed_value, ${NewCounter} AS repeatcounter
					from dta_requests_relations as a
					inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
					inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
					left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
					where a.type_relation=0 and a.request_tagcode='${Request.trim}' and a.relation_tagcode='${taskTagcode}' and a.repeatcounter= ${NewCounter} 
					) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id"$

				Log(sSQL)
				Utils.SaveSQLToLog("butCallActions",sSQL, Request.trim)
				'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
				
				Dim r1  As ResumableSub = UploadNewRequestRel2Server(Request.trim, taskTagcode, NewCounter, newRequestItem, "")
				Wait For(r1) complete (finished As Boolean)
				'			Sleep(2000)
				
			End If
		
			Sleep(250)
		End If
	End If
	Return True
End Sub

Sub CheckTypeRequestNewTask2(Request As String, Action As String) As ResumableSub
	' *****************************************************************
	' VERIFICA SE TEM PARAMETROS ESPECÍFICOS
	' DTA_TYPEREQUESTS_TASKS_ADDS->PARAMTERS
	' *****************************************************************  
	Dim request_type As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(typerequest_tagcode, '') as valor
													from dta_requests where tagcode='${Request.trim}'"$, "valor")
	Dim tr_is_model As Int = DBStructures.GetScriptColumnIntEVC($"select ifnull(tr_is_model, '0') as valor
													from dta_typerequests where tagcode='${request_type.trim}'"$, "valor")
	
	Dim object_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(object_tagcode, '') as valor
													from dta_requests where tagcode='${Request.trim}'"$, "valor")
													
	Dim object_group As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(object_group, '') as valor
													from dta_objects where tagcode='${object_tagcode.trim}'"$, "valor")
													
	Dim ObjectDateValue As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
													from dta_objects_fields where object_tagcode='${object_tagcode.trim}' 
													and field_tagcode='FIELD_PROXIMA_VERIF'"$, "valor")
	
	
	DateTime.DateFormat = "yyyy-MM-dd"
	Try
		Dim DtVal As Long = DateTime.DateParse(Utils.IfNullOrEmpty(ObjectDateValue,Utils.GetCurrentDate))
		'If ObjectDateValue <> "" Then
		'	Dim DtVal As Long = DateTime.DateParse(ObjectDateValue)
		'Else
		'	Dim DtVal As Long = DateTime.DateParse(Utils.GetCurrentDate)
		'End If
		
		Dim DtNow As Long = DateTime.DateParse(Utils.GetCurrentDate)
		Dim CanCreateNewCL As Boolean = Utils.NNE(ObjectDateValue) And (DtNow >= DtVal)
	Catch
		Dim CanCreateNewCL As Boolean = False
		Log(LastException)
	End Try
													
	If Utils.NNE(request_type) And Utils.NNE(object_tagcode) And (tr_is_model = 1) And  Utils.NNE(object_group) And (CanCreateNewCL) Then
	
		Dim taskTagcode As String = DBStructures.GetScriptColumnStrEVC($"Select ifnull(tagcode, '') as valor
											from dta_tasks
											where task_type_mode='TTMT_04'
												And connect2data like '%'||(Select distinct i.object_type from dta_objects As i
													where i.tagcode='${object_tagcode.trim}'
													And i.object_group in (
														Select tagcode from dta_objecttypes_groups 
														where objtyp_tagcode=i.object_type
														And tagcode='${object_group.trim}'
													))||'%'
												And parent_tagcode='${object_group.trim}'
												limit 1"$, "valor")
		
		Dim ExistChecklist As Int = DBStructures.GetScriptColumnIntEVC($"Select count(relation_tagcode) As valor
						from dta_requests_relations where request_tagcode='${Request.trim}' and relation_tagcode='${taskTagcode.trim}'"$, "valor")
						
		If (ExistChecklist = 0) Then
			If Utils.NNE(taskTagcode) Then
				Dim newRequestItem As Map
				newRequestItem.Initialize
				Dim NewCounter As Int = 0
			
				Dim newDate As String = Utils.GetCurrentDate
				Dim newTime As String = Utils.GetCurrentTimeExt

				Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
				Dim newExecution As Map
				newExecution.Initialize
				newExecution.Put("id", maxID)
				newExecution.Put("request_tagcode", Request.trim)
				newExecution.Put("relation_tagcode", taskTagcode)
				newExecution.Put("inner_title", "")
				newExecution.Put("position", NewCounter+2)
				newExecution.Put("type_relation", 0)
				newExecution.Put("status_id", 1)
				newExecution.Put("excel_import", 0)
				newExecution.Put("imported", 0)
				newExecution.Put("import_tagcode", "")
				'newExecution.Put("object_tagcode", object_tagcode)
				newExecution.Put("execute_date", newDate)
				newExecution.Put("execute_start", newTime)
				newExecution.Put("execute_end", newTime)
				newExecution.Put("repeatcounter", NewCounter)
				newExecution.Put("sess_user", ShareCode.SESS_OPER_User)
				newExecution.Put("active", 1)
				Dim ListOfMaps As List
				ListOfMaps.Initialize
				ListOfMaps.Add(newExecution)
				newRequestItem.Put("relation", ListOfMaps)
				'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
				Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,Request.trim,"")

				Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
				Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
					tagcode,position,execute_value, execute_format_title,
					confirmed,changed_value, repeatcounter)
					select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
					x.item_tagcode, x.unique_key, x.tagcode, x.position, 
					x.execute_value, x.execute_format_title, 
					x.confirmed, x.changed_value, x.repeatcounter
					from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
					c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, 
					a.position As relposition, '' as execute_value, 
					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
					0 as confirmed, '' as changed_value, ${NewCounter} AS repeatcounter
					from dta_requests_relations as a
					inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
					inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
					left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
					where a.type_relation=0 and a.request_tagcode='${Request.trim}' and a.relation_tagcode='${taskTagcode}' and a.repeatcounter= ${NewCounter} 
					) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id"$

					
				Log(sSQL)
				Utils.SaveSQLToLog("butCallActions",sSQL, Request.trim)
				'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
				
				Dim r1  As ResumableSub = UploadNewRequestRel2Server(Request.trim, taskTagcode, NewCounter, newRequestItem, "")
				Wait For(r1) complete (finished As Boolean)
				'			Sleep(2000)
				
			End If
		
			Sleep(250)
		End If
	End If
	
	
	'************************************************************************************
	' NOTE: VERIFICA SE EXISTEM CL A CRIAR COM BASE NA VERIFICAÇÃO DA FLAG
	' GLOBAL_CODE E VDEP
	'************************************************************************************
	Dim object_global_code As String = DBStructures.GetScriptColumnStrEVC($"Select ifnull(reference, '') as valor
									from dta_objecttypes_groups where 1=1
									And tagcode in (Select object_group 
									from dta_objects where tagcode='${object_tagcode.trim}')"$, "valor")
									

	Dim TPRParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${request_type.Trim}'
												And task_tagcode='${taskTagcode.trim}'"$, "paramters") 
	Dim VDEP As Int = 0
	Dim VDOB As Int = 0
	Dim VDCL As Int = 0
	Dim VDCode As String = "VDEP"
	
	If TPRParams.ContainsKey("VDEP") Then
		Try
			VDEP = TPRParams.Get("VDEP")
		Catch
			Log(LastException)
		End Try
	End If
	
	If (VDEP = 0) Then
		
		If TPRParams.ContainsKey("VDOB") Then
			Try
				VDOB = TPRParams.Get("VDOB")
			Catch
				Log(LastException)
			End Try
		End If
		
		If (VDOB = 0) Then
			
			If TPRParams.ContainsKey("VDCL") Then
				Try
					VDCL = TPRParams.Get("VDCL")
				Catch
					Log(LastException)
				End Try
			End If

			If (VDCL = 1) Then
				VDCode = "VDCL"
			End If
			
		Else
			VDCode = "VDOB"
		End If
	End If
	
	Dim IsOneVD As Boolean = (VDEP=1) Or (VDOB=1) Or (VDCL=1)
	
	If Utils.NNE(object_global_code) And (IsOneVD) Then
		
		Dim newTaskCode As String = DBStructures.GetScriptColumnStrEVC($"select distinct tagcode
										from dta_tasks_adds where 1=1
										and reference='${VDCode}'
										and paramters like '%${object_global_code.trim}%' limit 1"$, "tagcode")
		If (Utils.NNE(newTaskCode)) Then
			Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
										$"select distinct paramters 
										from dta_tasks_adds where 1=1
										and tagcode='${newTaskCode.trim}'
										and reference='${VDCode}'
										And paramters like '%${object_global_code.trim}%'"$, "paramters")

			If (QuestParams.Size > 0) Then
				Try
					Dim global_code As String = QuestParams.Get("global_code")
				Catch
					Dim global_code As String = ""
				End Try
			End If
	
			If Utils.NNE(global_code) And (global_code = object_global_code) Then
				If Utils.NNE(request_type) And Utils.NNE(object_tagcode) And (tr_is_model = 1) And  Utils.NNE(object_group) Then
	
					Dim ExistChecklist As Int = DBStructures.GetScriptColumnIntEVC($"Select count(relation_tagcode) As valor
						from dta_requests_relations where request_tagcode='${Request.trim}' and relation_tagcode='${newTaskCode.trim}'"$, "valor")
						
					If (ExistChecklist = 0) Then
						If Utils.NNE(newTaskCode) Then
							Dim newRequestItem As Map
							newRequestItem.Initialize
							Dim NewCounter As Int = 0
			
							Dim newDate As String = Utils.GetCurrentDate
							Dim newTime As String = Utils.GetCurrentTimeExt

							Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
							Dim newExecution As Map
							newExecution.Initialize
							newExecution.Put("id", maxID)
							newExecution.Put("request_tagcode", Request.trim)
							newExecution.Put("relation_tagcode", newTaskCode)
							newExecution.Put("inner_title", "")
							newExecution.Put("position", NewCounter+2)
							newExecution.Put("type_relation", 0)
							newExecution.Put("status_id", 1)
							newExecution.Put("excel_import", 0)
							newExecution.Put("imported", 0)
							newExecution.Put("import_tagcode", "")
							'newExecution.Put("object_tagcode", object_tagcode)
							newExecution.Put("execute_date", newDate)
							newExecution.Put("execute_start", newTime)
							newExecution.Put("execute_end", newTime)
							newExecution.Put("repeatcounter", NewCounter)
							newExecution.Put("sess_user", ShareCode.SESS_OPER_User)
							newExecution.Put("active", 1)
							Dim ListOfMaps As List
							ListOfMaps.Initialize
							ListOfMaps.Add(newExecution)
							newRequestItem.Put("relation", ListOfMaps)
							'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
							Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,Request.trim,"")

							Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
							Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
										tagcode,position,execute_value, execute_format_title,
										confirmed,changed_value, repeatcounter)
										select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
										x.item_tagcode, x.unique_key, x.tagcode, x.position, 
										x.execute_value, x.execute_format_title, 
										x.confirmed, x.changed_value, x.repeatcounter
										from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
										c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, 
										a.position As relposition, '' as execute_value, 
										Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
										0 as confirmed, '' as changed_value, ${NewCounter} AS repeatcounter
										from dta_requests_relations as a
										inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
										inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
										left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
										where a.type_relation=0 and a.request_tagcode='${Request.trim}' and a.relation_tagcode='${newTaskCode}' and a.repeatcounter= ${NewCounter} 
										) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id"$

					
							Log(sSQL)
							Utils.SaveSQLToLog("butCallActions",sSQL, Request.trim)
							'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
				
							Dim r1  As ResumableSub = UploadNewRequestRel2Server(Request.trim, newTaskCode, NewCounter, newRequestItem, "")
							Wait For(r1) complete (finished As Boolean)
							'			Sleep(2000)
				
						End If
		
						Sleep(250)
					End If
				End If
		
			End If
		End If
									
	End If
	
	Return True
End Sub


Sub CheckTypeRequestNewTask3(Request As String, Action As String)  As ResumableSub
	' *****************************************************************
	' VERIFICA SE TEM PARAMETROS ESPECÍFICOS
	' DTA_TYPEREQUESTS_TASKS_ADDS->PARAMTERS
	' *****************************************************************
	Dim request_type As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(typerequest_tagcode, '') as valor
													from dta_requests where tagcode='${Request.trim}'"$, "valor")
	Dim tr_is_model As Int = DBStructures.GetScriptColumnIntEVC($"select ifnull(tr_is_model, '0') as valor
													from dta_typerequests where tagcode='${request_type.trim}'"$, "valor")
	Dim RequestStatus As Int = DBStructures.GetScriptColumnIntEVC($"select ifnull(status_id, '0') as valor
													from dta_requests where tagcode='${Request.trim}'"$, "valor")

	DateTime.DateFormat = "yyyy-MM-dd"								
	If (Utils.NNE(request_type) And (tr_is_model = 1)) Then
		Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${request_type.Trim}'
												And task_tagcode='${Action.trim}'"$, "paramters")	
		Try
			Dim close_request As Int = QuestParams.Get("close_request")
		Catch
			Dim close_request As Int = 0
			Log(LastException)
		End Try
		
		If Utils.Int2Bool(close_request) Then

			Dim close_settings As Map = QuestParams.Get("close_settings")
'			Dim makeaction As List = close_settings.Get("makeaction")
'			For Each colmakeaction As Map In makeaction
'				Dim sendto As String = colmakeaction.Get("sendto")
'				Dim subject As String = colmakeaction.Get("subject")
'				Dim sendcc As String = colmakeaction.Get("sendcc")
'				Dim active As Int = colmakeaction.Get("active")
'				Dim assigneduser As String = colmakeaction.Get("assigneduser")
'				Dim distributionlist As String = colmakeaction.Get("distributionlist")
'				Dim on_status_id As Int = colmakeaction.Get("on_status_id")
'				Dim duedatedays As Int = colmakeaction.Get("duedatedays")
'				Dim urgency As String = colmakeaction.Get("urgency")
'				Dim typeaction As String = colmakeaction.Get("typeaction")
'				Dim assignedteam As String = colmakeaction.Get("assignedteam")
'				Dim sendbcc As String = colmakeaction.Get("sendbcc")
'				Dim details As String = colmakeaction.Get("details")
'				Dim sendemail As Int = colmakeaction.Get("sendemail")
'			Next
'			
'			
'			Dim send_email As Int = close_settings.Get("send_email")
'			Dim result_from As Int = close_settings.Get("result_from")
'			Dim email_settings As Map = close_settings.Get("email_settings")
'			Dim sendto As String = email_settings.Get("sendto")
'			Dim sendcc As String = email_settings.Get("sendcc")
'			Dim sendbcc As String = email_settings.Get("sendbcc")
'			Dim default_template As String = email_settings.Get("default_template")
'			Dim distributionlist As String = email_settings.Get("distributionlist")
			
			
			
			Try
				'(NumberFormatException) java.lang.NumberFormatException: For input string: "null"
				Dim makearequest As Int = close_settings.Get("makearequest")
			Catch
				Dim makearequest As Int = 0
				Log(LastException)
			End Try
			Log("E S T A   A Q U I!!!")
			If Utils.Int2Bool(makearequest) Then
				Dim mkrequest_settings As List = close_settings.Get("mkrequest_settings")
				For Each colmkrequest_settings As Map In mkrequest_settings
					Dim typerequest As String = colmkrequest_settings.Get("typerequest")
					Dim mkbased_item_tagcode As String = colmkrequest_settings.Get("mkbased_item_tagcode")
					Dim mkbased_value_in1 As String = colmkrequest_settings.Get("mkbased_value_in1")
					Dim mkbased_item_tagcode2 As String = colmkrequest_settings.Get("mkbased_item_tagcode2")
					Dim mkbased_value_in2 As String = colmkrequest_settings.Get("mkbased_value_in2")
					Dim mkbased_item_tagcode3 As String = colmkrequest_settings.Get("mkbased_item_tagcode3")
					Dim mkbased_value_in3 As String = colmkrequest_settings.Get("mkbased_value_in3")
					Log(typerequest)
					
					'Dim answer_repeatitemcounter As Int = colmkrequest_settings.Get("answer_repeatitemcounter")
					Dim answer_object_tagcode As Int = colmkrequest_settings.Get("answer_object_tagcode")
					Dim answer_object_from As Int = colmkrequest_settings.Get("answer_object_from")
					
					Dim result_from As Int = colmkrequest_settings.Get("result_from")
					Dim Continuar As Boolean = (RequestStatus = result_from)
					
					If (Utils.NNE(mkbased_item_tagcode)) Then
						Dim sCond As String = ""
						If (Utils.NNE(mkbased_value_in1)) Then
							sCond = $"${sCond} and execute_value like '%${mkbased_value_in1}%'"$
						End If
						If (Utils.NNE(mkbased_item_tagcode)) Then
							sCond = $"${sCond} and item_tagcode='${mkbased_item_tagcode}'"$
						End If
						Log("mkbased_item_tagcode :: " & sCond)
						Dim inCounter As Int = DBStructures.GetScriptColumnIntEVC($"Select count(0) As valor
								from dta_requests_values where request_tagcode='${Request.trim}' and task_tagcode='${typerequest.trim}'
								${sCond.trim}"$, _
								"valor")
						Continuar = inCounter >= 1
						Log("inCounter >= 1 :: " & inCounter)
						If (Utils.NNE(mkbased_item_tagcode2)) Then
							Dim sCond As String = ""
							If (Utils.NNE(mkbased_value_in2)) Then
								sCond = $"${sCond} and execute_value like '%${mkbased_value_in2}%'"$
							End If
							If (Utils.NNE(mkbased_item_tagcode2)) Then
								sCond = $"${sCond} and item_tagcode='${mkbased_item_tagcode2}'"$
							End If
						
							Log("mkbased_item_tagcode2 :: " & sCond)
							Dim inCounter As Int = DBStructures.GetScriptColumnIntEVC($"Select count(0) As valor
									from dta_requests_values where request_tagcode='${Request.trim}' and task_tagcode='${typerequest.trim}'
									${sCond.trim}"$, _
									"valor")
							Continuar = inCounter >= 1
							Log("inCounter >= 1 :: " & inCounter)
							If (Utils.NNE(mkbased_item_tagcode3)) Then
								Dim sCond As String = ""
								If (Utils.NNE(mkbased_value_in3)) Then
									sCond = $"${sCond} and execute_value like '%${mkbased_value_in3}%'"$
								End If
								If (Utils.NNE(mkbased_item_tagcode3)) Then
									sCond = $"${sCond} and item_tagcode='${mkbased_item_tagcode3}'"$
								End If
						
								Dim inCounter As Int = DBStructures.GetScriptColumnIntEVC($"Select count(0) As valor
										from dta_requests_values where request_tagcode='${Request.trim}' and task_tagcode='${typerequest.trim}'
										${sCond.trim}"$, _
										"valor")
								Continuar = inCounter >= 1
							End If
						End If
						
					End If
					
					If (Continuar) Then
						Log("Continua")
						Dim oObjectos As List : oObjectos.initialize
						If Utils.Int2Bool(answer_object_tagcode) Then
							Dim sCond As String = ""
							If (answer_object_from = 0) Then
								sCond = $" and item_tagcode='${mkbased_item_tagcode}'"$
							Else If (answer_object_from = 1) Then
								sCond = $" and item_tagcode='${mkbased_item_tagcode2}'"$
							Else If (answer_object_from = 2) Then
								sCond = $" and item_tagcode='${mkbased_item_tagcode3}'"$
							End If
							Log("answer_object_from  :: " & sCond)
							Dim oObjecto As ResultSet = Starter.LocalSQLEVC.ExecQuery($"Select ifnull(object_tagcode, '') As object_tagcode
										from dta_requests_values where request_tagcode='${Request.trim}' and task_tagcode='${typerequest.trim}'
										${sCond.trim}"$)
							
							Do While oObjecto.NextRow
								Dim object_tagcode As String = oObjecto.GetString("object_tagcode")
								If Utils.NNE(object_tagcode) Then
									oObjectos.Add(object_tagcode)
									Log("objecto  :: " & object_tagcode)
								End If
							Loop
						End If
						
						If (oObjectos.Size >=1) Then
							For n=0 To oObjectos.Size-1
								Dim LocalObject As String = oObjectos.Get(n)
								
								Dim ChecklistCounter As Int = DBStructures.GetScriptColumnIntEVC($"Select count(ifnull(relation_tagcode, '')) As valor
									from dta_requests_relations where request_tagcode='${Request.trim}' and relation_tagcode='${typerequest.trim}'"$, _
									"valor")
								Log("ChecklistCounter  :: " & ChecklistCounter)
								If Utils.NNE(typerequest) Then
									Log("typerequest  :: " & typerequest)
									Dim newRequestItem As Map
									newRequestItem.Initialize
									Dim NewCounter As Int = 0
			
									Dim newDate As String = Utils.GetCurrentDate
									Dim newTime As String = Utils.GetCurrentTimeExt

									Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
									Dim newExecution As Map
									newExecution.Initialize
									newExecution.Put("id", maxID)
									newExecution.Put("request_tagcode", Request.trim)
									newExecution.Put("relation_tagcode", typerequest)
									newExecution.Put("inner_title", "")
									newExecution.Put("position", ChecklistCounter+1)
									newExecution.Put("type_relation", 0)
									newExecution.Put("status_id", 1)
									newExecution.Put("excel_import", 0)
									newExecution.Put("imported", 0)
									newExecution.Put("import_tagcode", "")
									newExecution.Put("object_tagcode", LocalObject)
									newExecution.Put("execute_date", newDate)
									newExecution.Put("execute_start", newTime)
									newExecution.Put("execute_end", newTime)
									newExecution.Put("repeatcounter", ChecklistCounter)
									newExecution.Put("sess_user", ShareCode.SESS_OPER_User)
									newExecution.Put("active", 1)
									Dim ListOfMaps As List
									ListOfMaps.Initialize
									ListOfMaps.Add(newExecution)
									newRequestItem.Put("relation", ListOfMaps)
									'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
									Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,Request.trim,"")

									Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
									Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
										tagcode,position,execute_value,execute_format_title, confirmed,changed_value, repeatcounter)
										select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
										x.item_tagcode, x.unique_key, x.tagcode, x.position, 
										x.execute_value, x.execute_format_title, 
										x.confirmed, x.changed_value, x.repeatcounter
										from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
										c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, 
										a.position As relposition, '' as execute_value, 
										Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
										0 as confirmed, '' as changed_value, ${ChecklistCounter} AS repeatcounter
										from dta_requests_relations as a
										inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
										inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
										left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
										where a.type_relation=0 and a.request_tagcode='${Request.trim}' and a.relation_tagcode='${typerequest}' and a.repeatcounter= ${ChecklistCounter} 
										) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id"$

									Log(sSQL)
									Utils.SaveSQLToLog("butCallActions",sSQL, Request.trim)
									
									
									Log("Checklist criada")
				
									Dim r1  As ResumableSub = UploadNewRequestRel2Server(Request.trim, typerequest, ChecklistCounter, newRequestItem, LocalObject)
									Wait For(r1) complete (finished As Boolean)
									'			Sleep(2000)
				
								End If
								Sleep(250)
							Next
						End If
						
						'Dim answer_repeatitemcounter As Int = colmkrequest_settings.Get("answer_repeatitemcounter")
						

					End If
				Next
			End If

		End If
		
		Sleep(250)
	End If
	Return True
End Sub


Sub ReturnFromCLAI
	WindowStatusUpdate
End Sub


Sub ListsReturn(Arg As String)
	Log(Arg)
	Starter.CurrentWorkActivity = Me
	StartRequestActivity(True, CurrentFilter)
End Sub

Sub ListReturn2(data As RequestCLAOBS)
	
	ProgressDialogShow2(ShareCode.Pg2MsgProcessar, False)
	Sleep(250)
	Dim ret As Boolean = Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)
	If Not(ret) Then
		Dim r1  As ResumableSub = CheckAndRunLocal2Server
		Wait For(r1) complete (finished As Boolean)
	End If

	Dim params As Map
	params.Initialize
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", data.cla.Request)
	params.Put("ACLAAction", data.cla.Action)
	params.Put("ACLAObs", data.obs)
	params.Put("ACLAChild", Utils.Bool2Int(data.child))
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	If (data.child) Then
		CurrentTabPage = CurrentTabPage-1
		TabPageState(CurrentTabPage, True)
		listsTabPanel.ScrollTo(CurrentTabPage, True)
	End If
	
	If (params.IsInitialized) Then
		Log("****************** Actualiza CL *********************")
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla/obs/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", data.cla.Request)
			Sleep(250)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,data.cla.Request.trim,data.cla.Action.Trim,"")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
	End If
	Starter.CurrentWorkActivity = Me
	
	Dim r1  As ResumableSub = CheckTypeRequestTaskAdds(data.cla.Request, data.cla.Action)
	Wait For(r1) complete (finished As Boolean)
	
	Dim r1  As ResumableSub = CheckTypeRequestNewTask2(data.cla.Request, data.cla.Action)
	Wait For(r1) complete (finished3 As Boolean)

	Dim r3  As ResumableSub = CheckTypeRequestNewTask3(data.cla.Request, data.cla.Action)
	Wait For(r3) complete (finished3 As Boolean)
	
	If (data.cla.Action = "TSKS_20190920_105227") Or (data.cla.Action = "TSKS_CLMONTAGEM") Or (data.cla.Action = "TSKS_CLDESMONTAGEM") Then
		Dim c As Int = 0
		For Each FileName As String In File.ListFiles(Starter.InternalFolder)
			If FileName.EndsWith(".reqsvr") Then
				Dim params As Map = File.ReadMap(Starter.InternalFolder, FileName)
				If (params.IsInitialized) Then
					Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update"$
					If Not(ShareCode.APP_WORKING_LOCAL) Then
						Utils.CallApi(0, params, Me, Url, "", data.cla.Request)
					Else
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,data.cla.Request.trim,data.cla.Action.Trim,"")
						Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
					End If
					Sleep(250)

					If Not(ShareCode.APP_WORKING_LOCAL) Then
						Try
							Dim upl As ResumableSub = UploadFilesWithFTPCamImage(FileName)
							Wait For(upl) Complete (finish As Boolean)
							If finish Then
								Log("UploadFilesWithFTP finish " & finish )
								File.Delete(Starter.InternalFolder, FileName)
							End If

						Catch
							Log(LastException)
							Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
							Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,data.cla.Request.trim,data.cla.Action.Trim,"")
							Utils.save2update(ServerLocation, FileName, 1, WorkerND)
						End Try
					Else
						Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,data.cla.Request.trim,data.cla.Action.Trim,"")
						Utils.save2update(ServerLocation, FileName, 1, WorkerND)
					End If
					Sleep(250)
				End If
			Else If FileName.EndsWith(".objsvr") Then
				Dim params As Map = File.ReadMap(Starter.InternalFolder, FileName)
				If (params.IsInitialized) Then
					Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more2/img/update"$
					If Not(ShareCode.APP_WORKING_LOCAL) Then
						Utils.CallApi(0, params, Me, Url, "", data.cla.Request)
					Else
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,data.cla.Request.Trim,data.cla.Action.Trim,"")
						Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
					End If
					Sleep(250)
				End If
			End If
		Next
	End If

	StartRequestActivity(True, CurrentFilter)
	
	ProgressDialogHide
	
End Sub
Sub UploadFilesWithFTPCamImage(filename As String )  As ResumableSub
	Dim ret As Boolean = False
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
	myFTP.TimeoutMs =240000
	Log(filename)
	Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, filename, False, "/" & ShareCode.APP_DOMAIN & "/docs/" & filename)
	Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
	If Success Then
		Log("file was uploaded successfully")
		ret = True
	Else
		Log("Error uploading file")
		ret = False
	End If
	myFTP.Close
	Sleep(250)
	Return ret
End Sub

Sub ListReturn3(data As RequestCLAOBS, idx As Int)
	ProgressDialogShow2(ShareCode.Pg2MsgProcessar, False)
	Sleep(250)
	
	If Not(Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
		Dim r1  As ResumableSub = CheckAndRunLocal2Server
		Wait For(r1) complete (finished As Boolean)
	End If
	
	Dim params As Map
	params.Initialize
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", data.cla.Request)
	params.Put("ACLAAction", data.cla.Action)
	params.Put("ACLAObs", data.obs)
	params.Put("ACLAChild", Utils.Bool2Int(data.child))
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	If (data.child) Then
		CurrentTabPage = CurrentTabPage-1
		TabPageState(CurrentTabPage, True)
		listsTabPanel.ScrollTo(CurrentTabPage, True)
	End If
	
	If (params.IsInitialized) Then
		Log("****************** Actualiza CL *********************")
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/cla/obs/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", data.cla.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,data.cla.Request.Trim,data.cla.Action.Trim,"")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
	End If
	Sleep(250)
	
	Dim r1  As ResumableSub = CheckTypeRequestTaskAdds(data.cla.Request, data.cla.Action)
	Wait For(r1) complete (finished1 As Boolean)

	Dim r1  As ResumableSub = CheckTypeRequestNewTask(data.cla.Request, data.cla.Action)
	Wait For(r1) complete (finished2 As Boolean)

	Dim r1  As ResumableSub = CheckTypeRequestNewTask2(data.cla.Request, data.cla.Action)
	Wait For(r1) complete (finished3 As Boolean)

	Dim r3  As ResumableSub = CheckTypeRequestNewTask3(data.cla.Request, data.cla.Action)
	Wait For(r3) complete (finished3 As Boolean)

	'CurrentTotalItems = current_limit + current_offset
	If (CurrentTotalItems > current_offset) Then
		current_limit = 0
		next_offset = CurrentTotalItems
	End If
	Starter.CurrentWorkActivity = Me
	StartRequestActivity(True, CurrentFilter)
	Sleep(250)
	If (idx >= 0) Then
		ListaPrincipal_ItemClick (idx, "")
	End If

	ProgressDialogHide
End Sub

'*****************************************************************************************
' CRIA AÇÕES ESPECIFICAS
'*****************************************************************************************
Sub ListReturn4(data As RequestCLAOBS, value As String)
	
	ProgressDialogShow2(ShareCode.Pg2MsgProcessar, False)
	Sleep(250)
	Dim ret As Boolean = Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)
	If Not(ret) Then
		Dim r1  As ResumableSub = CheckAndRunLocal2Server
		Wait For(r1) complete (finished As Boolean)
	End If
	
	Try
		Dim EntityTG As String = DBStructures.GetScriptColumnStrEVC($"select entity_tagcode from dta_requests where tagcode='${data.cla.Request.Trim}'"$, _
				"entity_tagcode")
		Dim ObjectTG As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode from dta_requests where tagcode='${data.cla.Request.Trim}'"$, _
				"object_tagcode")
				
 		Dim r1  As ResumableSub = CreateChecklistAction(EntityTG, ObjectTG)
		Wait For(r1) complete (finished As Boolean)
	Catch
		Log(LastException)
	End Try
	Sleep(500)

	Starter.CurrentWorkActivity = Me
	StartRequestActivity(True, CurrentFilter)
	ProgressDialogHide
	
End Sub


'				Dim RTA As RunTypeAction
'				RTA.Initialize
'				RTA.tagcode = field_tagcode
'				RTA.title = subject
'				CallSubDelayed3(requests3, "ListReturn5", RTA, CurrentCLA.Info.ReqIndex)


Sub ListReturn5(RTA As RunTypeAction, data As RequestCLAOBS)
	
	ProgressDialogShow2(ShareCode.Pg2MsgProcessar, False)
	Sleep(250)
	Dim ret As Boolean = Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)
	If Not(ret) Then
		Dim r1  As ResumableSub = CheckAndRunLocal2Server
		Wait For(r1) complete (finished As Boolean)
	End If
	Starter.CurrentWorkActivity = Me
	
	Try
		Dim r1  As ResumableSub = CreateActionType(RTA, data)
		Wait For(r1) complete (finished As Boolean)
	Catch
		Log(LastException)
	End Try
	Sleep(500)
	
	StartRequestActivity(True, CurrentFilter)
	ProgressDialogHide
End Sub

Sub CreateActionType(RTA As RunTypeAction, data As RequestCLAOBS) As ResumableSub
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		CreateActionType2(RTA, data, "TOPERT_01", "", 0)
		Sleep(500)
	End If
	Return True
End Sub

Sub CreateActionType2(RTA As RunTypeAction, data As RequestCLAOBS, oper As String, typereq As String, stateid As Int) As ResumableSub
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		InsertRequestASEVC(RTA, data, oper, typereq, stateid)
	End If
	Return True
End Sub


Sub InsertRequestASEVC(RTA As RunTypeAction, data As RequestCLAOBS, oper As String, typereq As String, stateid As Int) As String
					
	Dim tagcodeTPA As String = RTA.tagcode
	If (Utils.NE(tagcodeTPA)) Then
		tagcodeTPA = "TACTTT_001"
	End If
	Dim asTagcode As String = Utils.GenerateTagcode("AS0")
	Dim DataActual As String = Utils.GetCurrDatetime
	Dim NewID As Int =  DBStructures.GetMaxOfEVC("dta_actions", "id", "" ) + 2+ 1000000
	Dim ssql As String = $"INSERT INTO dta_actions (id,tagcode,request_tagcode,action_tagcode,task_tagcode,item_tagcode,uniquekey,iu_tagcode,
				internal,title,operation_type,details,priority_tagcode,gravity_tagcode,technical_tagcode,due_date,
				send_email,email_sent,email_to,email_cc,active, typerequest_type, commercial_tagcode, state_in,
				repeatcounter, repeatitemcounter, repeatfieldcounter, updated_at, created_at)
				values
				('${NewID}','${asTagcode}','${data.cla.Request.Trim}','${data.cla.Action.Trim}','${data.cla.Task}', '','', '',
				'1','${RTA.title}','${oper}','','TPRIOT_01','TGRVT_01','${ShareCode.SESS_OPER_User}','',
				1,1,'','',1, '${typereq}', '${tagcodeTPA}', ${stateid},
				${data.cla.RepeatCounter}, 0, 0, '${DataActual}', '${DataActual}')"$
	Try
		Utils.SaveSQLToLog("NewAS",ssql, asTagcode)
	Catch
		Log(LastException)
	End Try
				
	Dim NewID As Int =  DBStructures.GetMaxOfEVC("dta_actions_items", "id", "" ) + 2
	Dim ssql As String = $"INSERT INTO dta_actions_items (id,actions_tagcode,operation_type,
				details, priority_tagcode, gravity_tagcode, technical_tagcode, due_date,
				send_email,email_sent,email_to,active, 
				repeatcounter, repeatitemcounter, repeatfieldcounter)
				values
				('${NewID}','${asTagcode}','TOPERT_01','','TPRIOT_01','TGRVT_01','${ShareCode.SESS_OPER_User}','',
				1,1,'',1, ${data.cla.RepeatCounter}, 0, 0)"$

	Try
		Utils.SaveSQLToLog("NewASItem",ssql, asTagcode)
	Catch
		Log(LastException)
	End Try
	
	
	If (DBUtils.TableExists(Starter.LocalSQLEVC, "dta_actions_adds")) Then
		
		Dim NewID As Int =  DBStructures.GetMaxOfEVC("dta_actions_adds", "id", "" ) + 1+ 1000000
		Dim ssql As String = $"INSERT INTO dta_actions_adds (id,actions_tagcode,action_type,fieldref_01) values
				('${NewID}','${asTagcode}','${tagcodeTPA}','')"$
		Try
			'Starter.LocalSQLEVC.ExecNonQuery(ssql)
			Utils.SaveSQLToLog("NewASItemAdds",ssql, asTagcode)
		Catch
			Log(LastException)
		End Try
	End If
	
	Return asTagcode
End Sub


Sub CreateChecklistAction(entitytg As String, objecttg As String) As ResumableSub
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		CreateRequestChecklist(entitytg, objecttg)
		Sleep(500)
	End If
	Return True
End Sub

Sub CheckAndRunLocal2Server As ResumableSub
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim RecCounter As Int = LocalDataToUpdate
		Sleep(250)
		If (RecCounter >= 1) Then
			Dim WITHFILES As Boolean = True
			Try
				Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=0"$
				Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
			Catch
				Log(LastException)
				Dim sSQL As String = $"select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0"$
				Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
				WITHFILES = False
			End Try
				
			Dim ut0 As Int = RecordLocalDataToUpdate.RowCount
			Dim ut1 As Int = RecCounter - ut0
				
			If(RecordLocalDataToUpdate.RowCount >= 1) Then
				Dim n As Int = 0
				For n = 0 To RecordLocalDataToUpdate.RowCount-1
					RecordLocalDataToUpdate.Position = n
					Try
						Dim r1  As ResumableSub = SetUpdateHTTPRecord(RecordLocalDataToUpdate, WITHFILES, 0)
						Wait For(r1) complete (finished As Boolean)
							
					Catch
						Log(LastException)
					End Try
				Next
					
			End If
			RecordLocalDataToUpdate.Close
			Sleep(250)
				
			If (ut1 >= 1) And (WITHFILES) Then
				Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=1"$
				Dim RecordLocalDataToUpdate2 As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)

				If(RecordLocalDataToUpdate2.RowCount >= 1) Then
					For n1 = 0 To RecordLocalDataToUpdate2.RowCount-1
						RecordLocalDataToUpdate2.Position = n1
						Try
							SetUpdateFTPRecord(RecordLocalDataToUpdate2, WITHFILES, 1)
						Catch
							Log(LastException)
						End Try
					Next
				End If
				RecordLocalDataToUpdate2.Close
			End If
		End If

	End If
	Return True
End Sub

Sub SetUpdateFTPRecord(inRec As ResultSet, withImg As Boolean, def As Int)
	If withImg Then
		Dim up_type As Int = Utils.IfNullOrEmpty(inRec.GetInt("up_type"), def)
	End If
	Dim up_date As String = Utils.IfNullOrEmpty(inRec.GetString("up_date"), "")
	Dim up_values As String = Utils.IfNullOrEmpty(inRec.GetString("up_values"), "")
	Dim up_tableurl As String = Utils.IfNullOrEmpty(inRec.GetString("up_tableurl"), "")
	If Utils.NNE(up_tableurl) And Utils.NNE(up_values) Then
'		Dim rr As ResumableSub = UtilAPIUpdate(up_values, Me, up_tableurl)
		Dim rr As ResumableSub = UtilAPIUploadFile(up_tableurl, up_values)
		Wait For(rr) complete (finished As Boolean)
		If (finished = True) Then
			Try
				If withImg Then
					Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}' and up_type=${up_type}"$
				Else
					Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}'"$
				End If
				Starter.LocalSQLWRK.ExecNonQuery(upd)
			Catch
				Log(LastException)
			End Try
		End If
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
		End If
		
	Catch
		Log(LastException)
		ret = 0
	End Try
	iRecord.Close
	Return ret
End Sub

Sub SetUpdateHTTPRecord(inRec As ResultSet, withImg As Boolean, def As Int) As ResumableSub
	If withImg Then
		Dim up_type As Int = Utils.IfNullOrEmpty(inRec.GetInt("up_type"), def)
	End If
	Dim up_date As String = Utils.IfNullOrEmpty(inRec.GetString("up_date"), "")
	Dim up_values As String = Utils.IfNullOrEmpty(inRec.GetString("up_values"), "")
	Dim up_tableurl As String = Utils.IfNullOrEmpty(inRec.GetString("up_tableurl"), "")
	If Utils.NNE(up_tableurl) And Utils.NNE(up_values) Then
		Dim rr As ResumableSub = UtilAPIUpdate(up_values, Me, up_tableurl)
		Wait For(rr) complete (finished As Boolean)
		Try
			If withImg Then
				Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}' and up_type=${up_type}"$
			Else
				Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}'"$
			End If
				
			Starter.LocalSQLWRK.ExecNonQuery(upd)
			Return True
		Catch
			Log(LastException)
		End Try
	End If
	Return False
End Sub

Sub UtilAPIUpdate(params As String, target As Object, url As String)  As ResumableSub
	Dim Job As HttpJob
	Job.Initialize("",target)
	Dim addr As String = url

	Job.PostString(addr, params )
	Log(params)
	Job.GetRequest.SetContentType("application/json")

	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Dim Status As Int = Utils.JobAPIStatus(Job)
		Log($"Status: ${Status}"$)
		Return (Status = 1)
	End If
	Job.Release
	Sleep(250)
	Return False
End Sub


' *************************************************************
' TIP: CRIAÇÃO DE PEDIDO DE INTERVENÇÃO/CHECKLIST
' *************************************************************
Sub CreateRequestChecklist(entitytg As String, objecttg As String)
	
	Dim r_type As String = "TSKS_20191024_152533"
	Dim r_task As String = "TSKS_20190920_105227"
	Dim tagcode As String = r_task '"TSKS_20190911_135559"
	
	ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize
		Dim newRequestType As String = r_type  '""
		
		Dim local As String = Utils.IfNullOrEmpty( _
				DBStructures.GetScriptColumnStrEVC($"select local_tagcode from dta_objects where tagcode='${objecttg}'"$, "local_tagcode"), _
				"__NONE__")
	
		Dim newRequest As String = Utils.MakeRequestTagcode
		Dim newDate As String = Utils.GetCurrentDate
		Dim newTime As String = Utils.GetCurrentTimeExt
		' CRIA UMA INTERVENÇÃO
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests", "id", "") +1 + 1000000
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
		newExecution.Put("entity_tagcode", entitytg)
		newExecution.Put("object_tagcode", objecttg)
		newExecution.Put("technical_tagcode", ShareCode.SESS_OPER_User)
		newExecution.Put("team_tagcode", "")
		newExecution.Put("local_tagcode", local)
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
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") +1 + 1000000
		Dim ReqCounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${tagcode}'"$)
		
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("id", maxID)
		newExecution.Put("request_tagcode", newRequest)
		newExecution.Put("relation_tagcode", tagcode)
		newExecution.Put("inner_title", "")
		newExecution.Put("position", 0)
		newExecution.Put("type_relation", 0)
		newExecution.Put("status_id", 1)
		newExecution.Put("excel_import", 0)
		newExecution.Put("imported", 0)
		newExecution.Put("import_tagcode", "")
		newExecution.Put("object_tagcode", objecttg)
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
		
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
		Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
				tagcode,position,execute_value,execute_format_title,
				confirmed,changed_value, repeatcounter)
				select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
				x.execute_value, x.execute_format_title,
				x.confirmed, x.changed_value, x.repeatcounter
				from (select ${maxID} as id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode, 
				c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position, '' as execute_value, 
				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
				0 as confirmed, '' as changed_value, a.repeatcounter
				from dta_requests_relations As a
				inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)
				inner join dta_tasks_items As c on (c.task_tagcode=a.relation_tagcode)
				left join dta_tasks_items_answers As d on (d.parent_tagcode=c.unique_key)
				where a.type_relation=0 And a.request_tagcode='${newRequest}' and a.relation_tagcode='${tagcode}' and a.repeatcounter=${ReqCounter}
				) As x
				order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$

		Log(sSQL)
		Utils.SaveSQLToLog("butCallActions_DEMO",sSQL, newRequest)
		'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		
		Dim resfields As ResumableSub = createRequestFields(newRequest, newRequestType)
		Wait For(resfields) Complete (resfieldsOk As Boolean)
		
		Dim resa1 As ResumableSub = createRequestEntityRelation(newRequest, entitytg)
		Wait For(resa1) Complete (resfieldsOk1 As Boolean)
		
		Dim resa2 As ResumableSub = createRequestObjectRelation(newRequest, objecttg)
		Wait For(resa2) Complete (resfieldsOk2 As Boolean)

		
		UploadNewRequest2Server(newRequest, newRequestItem, "0")
		Sleep(1000)

	Catch
		Log(LastException)
	End Try
		
	ProgressDialogHide
End Sub

Sub createRequestFields(newRequest As String, newRequestType As String) As ResumableSub
	If (Utils.NNE(newRequest) And Utils.NNE(newRequestType)) Then
		Dim SQL1 As String = $"select distinct field_tagcode from dta_typerequests_fields
								where typerequest_tagcode='${newRequestType}'"$
								
		Dim ResData As ResultSet = Starter.LocalSQLEVC.ExecQuery(SQL1)
		Do While ResData.NextRow
			Dim sfield As String = ResData.GetString("field_tagcode")
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_fields", "id", "") + 1 + 1000000
			Dim sSQL As String = $"insert into dta_requests_fields (id, request_tagcode, field_tagcode)
								values ('${maxID}', '${newRequest}', '${sfield}');"$
			Utils.SaveSQLToLog("createRequestFields",sSQL, newRequest)
		Loop
		ResData.Close
								
	End If
	Return True
End Sub

Sub createRequestObjectRelation(newRequest As String, newObject As String) As ResumableSub
	If (Utils.NNE(newRequest) And Utils.NNE(newObject)) Then
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_objects", "id", "") + 1 + 1000000
		Dim sSQL As String = $"insert into dta_requests_objects (id, request_tagcode, object_tagcode, ismaster)
								values ('${maxID}', '${newRequest}', '${newObject}', 1);"$
		Utils.SaveSQLToLog("createRequestObjectRelation",sSQL, newRequest)
	End If
	Return True
End Sub

Sub createRequestEntityRelation(newRequest As String, newObject As String) As ResumableSub
	If (Utils.NNE(newRequest) And Utils.NNE(newObject)) Then
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_entities", "id", "") + 1 + 1000000
		Dim sSQL As String = $"insert into dta_requests_entities (id, request_tagcode, entity_tagcode, ismaster)
								values ('${maxID}', '${newRequest}', '${newObject}', 1);"$
		Utils.SaveSQLToLog("createRequestEntityRelation",sSQL, newRequest)
	End If
	Return True
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
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode,"","")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End If
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode,"","")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If
	
End Sub

'********************************************************************
' TIP: PROCEDIMENTO DE DOWNLOAD DE INTERVENÇÃO UPDATE REQUEST DATA
'********************************************************************
Sub DownloadFullRequest(reqData  As RequestData) As ResumableSub
	
	ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
	
	If (reqData.RequestType = 1) And (reqData.RequestCanDelete > 0) Then
		Dim action As String = ""
		Dim SQL As String = $"select * from dta_requests_relations where request_tagcode='${reqData.Tagcode}'"$  ' and repeatcounter=${reqData.RequestCanDelete}"$
		Private Recordw As Cursor
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			Recordw.Position = 0
			Dim action As String = Recordw.GetString("relation_tagcode")
		End If
		Recordw.Close
				
		Dim Lista As List
		Lista.Initialize
		Lista.Add(reqData.Tagcode)
		If Utils.NNE(action) Then
			DBStructures.DeleteFromLocalDatabaseFromList2(Lista, action, reqData.RequestCanDelete)
			Sleep(500)
			Dim res As ResumableSub = DownloadTable("REQUESTS", "dta_requests", reqData.Tagcode, action, reqData.RequestCanDelete)
			Wait For(res) Complete (RequestSuccessful As Boolean)
			If(RequestSuccessful) Then
				Dim sSQL As String =$"update dta_requests_adds set fieldval_05 = 0 where request_tagcode='${reqData.Tagcode.Trim}'"$
				Utils.SaveSQLToLog("DownloadFullRequest",sSQL, "")
				Sleep(2000)
				Return True
			Else
				Sleep(2000)
				Return False
			End If
		End If
	else If (((reqData.RequestType = 1) And (reqData.RequestCanDelete = 0)) Or (reqData.RequestType = 2)) Then
		
		Dim Lista As List
		Lista.Initialize
		Lista.Add(reqData.Tagcode)
		DBStructures.DeleteFromLocalDatabaseFromList(Lista)
		
		Dim res As ResumableSub = DownloadTable("REQUESTS", "dta_requests", reqData.Tagcode, "", 0)
		Wait For(res) Complete (RequestSuccessful As Boolean)
		If(RequestSuccessful) Then
			Dim sSQL As String =$"update dta_requests_adds set fieldval_05 = 0 where request_tagcode='${reqData.Tagcode.Trim}'"$
			Utils.SaveSQLToLog("DownloadFullRequest",sSQL, "")
			Sleep(2000)
			Return True
		Else
			Sleep(2000)
			Return False
		End If
			
'	else If (reqData.RequestType = 2) And (reqData.RequestCanDelete = 0) Then
'
'		Dim action As String = ""
'		Dim SQL As String = $"select * from dta_requests_relations where request_tagcode='${reqData.Tagcode}'
'								and repeatcounter=${reqData.RequestCanDelete}"$
'		Private Recordw As Cursor
'		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
'		If Recordw.RowCount > 0 Then
'			Recordw.Position = 0
'			Dim action As String = Recordw.GetString("relation_tagcode")
'		End If
'		Recordw.Close
'				
'		Dim Lista As List
'		Lista.Initialize
'		Lista.Add(reqData.Tagcode)
'		If Utils.NNE(action) Then
'			DBStructures.DeleteFromLocalDatabaseFromList2(Lista, action, reqData.RequestCanDelete)
'			Dim res As ResumableSub = DownloadTable("REQUESTS", "dta_requests", reqData.Tagcode, action, reqData.RequestCanDelete)
'			Wait For(res) Complete (RequestSuccessful As Boolean)
'			If(RequestSuccessful) Then
'				Dim sSQL As String =$"update dta_requests_adds set fieldval_05 = 0 where request_tagcode='${reqData.Tagcode.Trim}'"$
'				Utils.SaveSQLToLog("DownloadFullRequest",sSQL, "")
'				Sleep(2000)
'				Return True
'			Else
'				Sleep(2000)
'				Return False
'			End If
'		End If
	End If
	
	Sleep(2000)
	Return False
	
	
End Sub


'*********************************************************************
' TIP: Procedimento de download de Intervenção ForceGetRequests
'*********************************************************************
Sub ForceGetRequests(Requests As String) As ResumableSub
	ShareCode.GlobalEventsTimer = 0
	Starter.StopLocationCheck = True
	StopService(LocationService)
	'*****************************************************************************************
	' PROCESSO DEPOIS DO LOGIN PARA DOWNLOAD DOS FICHEIROS DE DADOS OPERACIONAIS DO DIA ACTUAL
	' E DO DIA ANTERIOR
	'*****************************************************************************************
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	Dim res As ResumableSub = RemoveAllLocalInfoAndSqlFiles
	Wait For(res) Complete (RemoveSuccessful As Boolean)
		
	Dim resReq As ResumableSub = RequestUpdateData(Requests, Me)
	Wait For(resReq) Complete (ReturnData As FileDownloadInformation)
	If(ReturnData.Downloaded) Then
					
		Dim UPDATE_INSTALL_INFO As String = $"${ReturnData.DownloadFilename}.INFO"$
		Dim updateInstallFilesName As String = ReturnData.DownloadFilename
		
		'**********************************************************************************************************
		' LÊ O FICHEIRO INFO PASSADO NA VARIAVEL ReturnData.DownloadFilename E DESCARREGA OS FICHEIROS EXISTENTES
		'**********************************************************************************************************
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
								Log($"Remove Registos de intervenção ${mastertagcode} da tabela : ${table}"$)
								Dim res As ResumableSub = DBStructures.RemoveRecsFromTable(table,mastertagcode, childfield,"", NewInfoList.Get(i))
								Wait For(res) Complete (result As Boolean)
							Next
						
						Next
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
						
						Log($"Remove Registos de intervenção ${UPDATE_INSTALL_INFO}"$)
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
				trycount = trycount + 1
			End If
		Loop
		GlobalFTP.Close
		
		'*****************************************************************************************
		' O NUMERO DE FICHEIROS PARA DOWNLOAD INICIAL ESTA EM SqlFileTotal
		' BASEADO NO updateInstallFilesName E COM UM CICLO For..Next ATE AO SqlFilesTotal
		' OBTER OS FICHEIROS COM OS SCRIPTS DE INSTALACAO, APAGADO-OS ANTES DO DOWNLOAD SE JA EXISTIREM
		'*****************************************************************************************
		If(SqlFilesTotal > 0) Then
			Dim GlobalFTP As FTP
			GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
			GlobalFTP.PassiveMode = True
			GlobalFTP.TimeoutMs = 240000
			
			For i = 1 To SqlFilesTotal
				Dim fileN As String = $"${updateInstallFilesName}${i}.sql"$
				
				If(File.Exists(Starter.Provider.SharedFolder, fileN)) Then
					File.Delete(Starter.Provider.SharedFolder, fileN)
				End If
			
				Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & fileN, False, Starter.Provider.SharedFolder, fileN)
				Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
				If Success Then
					Log(fileN & " file was download successfully")
				Else
					Log("Error downloading file " & fileN)
				End If
			Next
			GlobalFTP.Close
		End If
		Sleep(500)
		
		'*****************************************************************************************
		' BASEADO NO firstInstallFilesName E COM UM CICLO For..Next ATE AO SqlFilesTotal
		' CRIAR UMA LISTA COM AS INSTRUCOES SQL POR ITEM E EXECUTA-LAS
		'*****************************************************************************************
		If(SqlFilesTotal > 0) Then
			
			For i = 1 To SqlFilesTotal
				Dim fileN As String = $"${updateInstallFilesName}${i}.sql"$
				Log(fileN)
				Dim List1 As List
				
				If (List1.IsInitialized) Then
					List1.Clear
				Else
					List1.Initialize
				End If
				
				Try
					List1 = File.ReadList(Starter.Provider.SharedFolder, fileN)
				Catch
					Log(LastException)
				End Try
				
				For n = 0 To List1.Size -1
					Dim Script2Execute As String = List1.Get(n)
					Log(Script2Execute)
					Utils.SaveSQLToLog("Main",Script2Execute, "")
					Sleep(1)
				Next
				Sleep(1)
			Next
			'***************************************************************************************************
			' CHAMAR A ROTINA PARA APAGAR OS FICHEIROS GERADOS NO SERVIDOR PARA NAO OCUPAREM ESPACO
			'***************************************************************************************************
			Dim res As ResumableSub = SendServerProcessComplete(False,ReturnData.DownloadFilename, Me)
			Wait For(res) Complete (Completed As Boolean)
		End If
		ProgressDialogHide
	Else
		ProgressDialogHide
		Return False
	End If
	ProgressDialogHide
	Return True
End Sub


'*********************************************************************
' TIP: Chamada de Operação de download de ficheiros
'*********************************************************************
Sub RequestUpdateData(Requests As String, jobObject As Object) As ResumableSub
	
	'MakeFileDownloadInformation(Downloaded As Boolean, DownloadFilename As String, Status As Int)
	Dim ReturnData As FileDownloadInformation = Types.MakeFileDownloadInformationClear
	
	ReturnData.DownloadFilename  = Utils.RandomString
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/requests/list"$
	Dim Job As HttpJob
	Job.Initialize("",jobObject)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_user", ShareCode.SESS_User)
	params.Put("name", ReturnData.DownloadFilename)
	params.Put("newReturn", ShareCode.newreturn)
	params.Put("date", Utils.GetCurrDatetime)
	params.Put("smart", ShareCode.ISPHONE)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("requestsList", Requests)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
	Dim data As String = JSON.ToPrettyString(1)
	Utils.ShowProcinLog("DataUpdate","RequestUpdateData",data)
	'Utils.ShowProcinLog("DataUpdate","RequestUpdateData",data)
	
	Job.PostString(ServerAddress, data)
	Job.GetRequest.SetContentType("application/json")
	Job.GetRequest.Timeout = 90000
	
	Wait For (Job) JobDone(Job As HttpJob)
	ReturnData.Downloaded = Job.Success
	Job.Release
	Sleep(5000)
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
	params.Put("_user", ShareCode.SESS_User)
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

'TIP: ROTINA DE COMPARAÇÃO DE INTERVENCOES ENTRE O FO E O BO
Sub dataCompare2BO(request As String, pan As Panel) As ResumableSub
	
'	Dim Rs As ResumableSub = dataCompare2BO(data.Request.Trim)
'	Wait for (Rs) Complete (Ended As Boolean)
	Dim pan As Panel = Sender

	If Utils.NNE(request) Then
		Dim GetReqData As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select * from dta_requests where tagcode = '${request}'"$)
		Do While GetReqData.NextRow
			Dim tagcode As String = GetReqData.GetString("tagcode")
			Dim status_id As String = GetReqData.GetString("status_id")
			Dim updated_at As String = GetReqData.GetString("updated_at")
			Exit
		Loop
	
		Dim MapOfFields As Map
		MapOfFields.Initialize
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		Dim GetRelData As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select * from dta_requests_relations where request_tagcode = '${request}'"$)
		Do While GetRelData.NextRow
			Dim request_tagcode As String = GetRelData.GetString("request_tagcode")
			Dim relation_tagcode As String = GetRelData.GetString("relation_tagcode")
			Dim rel_status_id As String = GetRelData.GetString("status_id")
			Dim rel_updated_at As String = GetRelData.GetString("updated_at")
			MapOfFields.Clear
			MapOfFields.Put("request_tagcode",request_tagcode)
			MapOfFields.Put("relation_tagcode",relation_tagcode)
			MapOfFields.Put("status_id",rel_status_id)
			MapOfFields.Put("updated_at",rel_updated_at)
			ListOfMaps.Add(MapOfFields)
		Loop

		Dim params As Map
		params.Initialize
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", tagcode)
		params.Put("ACLAStatus", status_id)
		params.Put("ACLAUpdated", updated_at)
		params.Put("ACLAListOfMaps",ListOfMaps)
		params.Put("versionTagcode", Main.VersionTagcode.trim)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		Dim JSON As JSONGenerator
		JSON.Initialize(params)
		Dim data As String = JSON.ToPrettyString(1)
		Dim JobCompare As HttpJob
		JobCompare.Initialize("",Me)
		Dim addr As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla/check/changes"$
		
		JobCompare.PostString(addr, data )
		JobCompare.GetRequest.SetContentType("application/json")
		Wait For (JobCompare) JobDone (JobCompare As HttpJob)
		If JobCompare.Success Then
			Dim ResCompare As String = JobCompare.GetString
	
			Select Case ResCompare
				Case 0
					'0 = FO = BO Esta e a situação normal, nao precisa de fazer nada
				Case 1
					'1 = FO > BO - Alerta
					Starter.RunUpdate = True
					ProgressDialogShow2(ShareCode.Pg2MsgEnviarDadosVerificacao, True)
					CallSubDelayed(MainMenu,"ResetApplication")
					ProgressDialogHide
					Starter.RunUpdate = False
					Dim Alr As ResumableSub = CreateCompareAlert($"A intervenção ${tagcode}, presente no dispositivo, é mais recente no Back-Office"$)
					wait for (Alr) Complete (IsFinished As Boolean)
				Case 2
					'2 = FO < BO - Nao faz nada pois fica resolvido com Sincronizacao
			End Select

		End If

	End If
	Return True
	
End Sub

'TIP: ROTINA DE COMPARAÇÃO DE INTERVENCOES ENTRE O FO E O BO
Sub CreateCompareAlert(Alert_Text As String) As ResumableSub
	
	Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
	Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
	Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
							values (${mID}, '${alerttagcode}', '', 'ALRTREL_REQUESTS', 'ALRTTYP_NOTIFY', 1, 1, '${Alert_Text}', 
	'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
	Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")
	CallSub(MainMenu,"BadgeCheckUpdate")
	Return True
	
End Sub

'*******************************************************************************************************************
'TIP: CARREGA DADOS DE PARAMETROS TYPEREQUEST_TASKS_ADDS - affectobject_data_onclose
'*******************************************************************************************************************
'Dim CTRTP As ResumableSub = CheckTypeRequestTaskParamters(CLA.request, CLA.action, TypeReques, Object)
'Wait For (CTRTP) Complete (EndCheck As Boolean)
Sub CheckTypeRequestTaskParamters(Request As String, task_tagcode As String, typerequest As String, ACLAObjectChange As String)  As ResumableSub
	
	Dim paramters As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
										$"select distinct paramters 
										from dta_typerequests_tasks_adds where 1=1
										And typerequest_tagcode='${typerequest.trim}'
										And task_tagcode='${task_tagcode.trim}'"$, "paramters")
	
	Dim status_id As Int = DBStructures.GetScriptColumnIntEVC($"select status_id from dta_requests where 1=1 and tagcode='${Request}'"$, "status_id")
	If (paramters.Size > 0) And Utils.NNE(ACLAObjectChange) Then
		Try
			Dim affectobject_data_onclose As Int = paramters.Get("affectobject_data_onclose")
		Catch
			Dim affectobject_data_onclose As Int = 0
		End Try
		
		If Utils.Int2Bool(affectobject_data_onclose) Then
			Dim affectobject_dataonclose_settings As List = paramters.Get("affectobject_dataonclose_settings")
			For Each parm As Map In affectobject_dataonclose_settings
				Dim on_status_id As Int = parm.Get("on_status_id")
				Dim is_additional As Int = parm.Get("is_additional")
				Dim set_value_from As Int = parm.Get("set_value_from")
				Dim field_name As String = parm.Get("field_name")
				Dim fixed_value As String = parm.Get("fixed_value")
				
				Dim value As String = ""
				If (set_value_from = 1) Then
					'/* VALOR FIXO */
					value = fixed_value
				else if (set_value_from = 2) Then
					'/* RESPOSTA DA CL ITEM_TAGCODE */
					'//"item_tagcode":"",
				else if (set_value_from = 3) Then
					'/* RESULTADO DE SCRIPT */
					'//"script_result":""
				else if (set_value_from = 4) Then
					'/* DATA ATUAL */
					value = Utils.GetCurrentDate
				End If
				
				If (on_status_id = 0) Or (on_status_id == status_id) Then
				
					If Utils.Int2Bool(is_additional) Then
						Dim updSQLRec As String = $"update dta_objects_fields set value='${value}'
																				where 1=1
																				and object_tagcode='${ACLAObjectChange.trim}' 
																				and field_tagcode='${field_name.trim}'"$
						Try
							Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
						Catch
							Log($"Erro de campo: ${LastException}"$)
						End Try
					Else
						Dim updSQLRec As String = $"update dta_objects set ${field_name}='${value}'
													where 1=1
													and tagcode='${ACLAObjectChange.trim}'"$
						Try
							Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
						Catch
							Log($"Erro de campo: ${LastException}"$)
						End Try
					End If
				End If
				
			Next

		End If
		
	End If
	Return True
End Sub

'*******************************************************************************************************************
'TIP: CARREGA DADOS DE PARAMETROS TYPEREQUEST_TASKS_ADDS - affectvalues_fields
'*******************************************************************************************************************
'Dim CTRTP As ResumableSub = CheckTypeRequestTaskParamters2(CLA.request, CLA.action, TypeReques, Object, 1)
'Wait For (CTRTP) Complete (EndCheck As Boolean)
Sub CheckTypeRequestTaskParamters2(Request As String, task_tagcode As String, typerequest As String, ACLAObjectChange As String, whento As Int)  As ResumableSub

	Dim paramters As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
										$"select distinct paramters 
										from dta_typerequests_tasks_adds where 1=1
										And typerequest_tagcode='${typerequest.trim}'
										And task_tagcode='${task_tagcode.trim}'"$, "paramters")
	
	Dim status_id As Int = DBStructures.GetScriptColumnIntEVC($"select status_id from dta_requests where 1=1 and tagcode='${Request}'"$, "status_id")
	If (paramters.Size > 0) And Utils.NNE(ACLAObjectChange) Then
		Try
			Dim affectvalues_fields As Int = paramters.Get("affectvalues_fields")
		Catch
			Dim affectvalues_fields As Int = 0
		End Try
		
		If Utils.Int2Bool(affectvalues_fields) Then
			Dim affectvalues_fields_settings As List = paramters.Get("affectvalues_fields_settings")
			For Each parmss As Map In affectvalues_fields_settings
				
				Dim whentoaffect As Int = parmss.Get("whentoaffect")
				Dim affected_context As Int = parmss.Get("affected_context")
				Dim affected_items As List = parmss.Get("affected_items")
				If (whento = whentoaffect) Then
					For Each parm As Map In affected_items
						
						Dim on_change_status_to As Int = parm.Get("on_change_status_to")
						Dim is_additional As Int = parm.Get("is_additional")
						Dim is_address As Int = parm.Get("is_address")
						Dim is_contact As Int = parm.Get("is_contact")
						Dim set_value_from As Int = parm.Get("set_value_from")
						Dim affected_field As String = parm.Get("affected_field")
						Dim concerned_field As String = ""
						Try
							Dim concerned_field As String = parm.Get("concerned_field")
						Catch
							Log(LastException)
						End Try
						
						Dim fixed_value As String = parm.Get("fixed_value")
						'Dim formula As String = parm.Get("formula")
						Dim item_tagcode As String = parm.Get("item_tagcode")
						Dim script_result As String = parm.Get("script_result")
'						Dim fixed_value As String = parm.Get("fixed_value")
				
						Dim value As String = ""
						If (set_value_from = 1) Then
							value = fixed_value
						else if (set_value_from = 2) Then
							value = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as execute_value from dta_requests_values
												where 1=1
												and request_tagcode='${Request.trim}'
												and task_tagcode='${task_tagcode.trim}'
												and item_tagcode='${item_tagcode.trim}'"$, "execute_value")
						else if (set_value_from = 3) Then
							'/* RESULTADO DE SCRIPT */
							'//"script_result":""
							value = DBStructures.GetScriptColumnStrEVC(script_result, "returnvalue")
						else if (set_value_from = 4) Then
							value = Utils.GetCurrentDate
						End If
				
						'affected_context
						'0-Objects, 1-Entities, 2-Request, 3-RequesRelation, 4-RequestValues, 5-As, 6-WareHouse,
						'7-Articles, 8-Technical, 9-Equipments, 10-Teams, 11-Departments, 12-Vehicles, 13-Process
						
						If (on_change_status_to = 0) Or (on_change_status_to == status_id) Then
							If (affected_context = 0) Then
								Dim UDBCO As ResumableSub = UpdateDBContextObject(is_additional, is_address, is_contact,affected_field, value, ACLAObjectChange.Trim)
								Wait For (UDBCO) Complete (EndCheck As Boolean)
							else If (affected_context = 1) Then
								Dim Entity As String =  DBStructures.GetScriptColumnStrEVC($"select entity_tagcode from dta_requests where tagcode = '${Request.Trim}'"$, "entity_tagcode")
								Dim UDBCO As ResumableSub = UpdateDBContextObject(is_additional, is_address, is_contact,affected_field, value, Entity.Trim)
								Wait For (UDBCO) Complete (EndCheck As Boolean)
							else If (affected_context = 2) Then
								Dim UDBCR As ResumableSub = UpdateDBContextRequest(is_additional, is_address, is_contact,affected_field, value, Request.Trim)
								Wait For (UDBCR) Complete (EndCheck As Boolean)
							else If (affected_context = 3) Then
								Dim UDBCRR As ResumableSub = UpdateDBContextReqRelation(affected_field, value, Request.Trim, task_tagcode.trim)
								Wait For (UDBCRR) Complete (EndCheck As Boolean)
							else If (affected_context = 4) Then
								Dim UDBCRV As ResumableSub = UpdateDBContextReqValue(affected_field, value, Request.Trim, task_tagcode.trim, concerned_field.Trim)
								Wait For (UDBCRV) Complete (EndCheck As Boolean)
							End If
							
						End If
					Next
				End If
			Next

		End If
		
	End If
	Return True
End Sub


'*******************************************************************************************************************
'TIP: ATUALIZA CAMPOS DO OBJECTO IDENTIFICADO
'*******************************************************************************************************************
Sub UpdateDBContextObject(is_additional As Int, is_address As Int, is_contact As Int,affected_field As String, value As String, ACLAObjectChange As String) As ResumableSub
	If Utils.Int2Bool(is_additional) Then
		Dim updSQLRec As String = $"update dta_objects_fields set value='${value}'
																				where 1=1
																				and object_tagcode='${ACLAObjectChange.trim}' 
																				and field_tagcode='${affected_field.trim}'"$
		Try
			Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
		Catch
			Log($"Erro de campo: ${LastException}"$)
		End Try
	Else If Utils.Int2Bool(is_address) Then
		Dim updSQLRec As String = $"update dta_locations set ${affected_field}='${value}'
													where 1=1
													and tagcode in (select distinct local_tagcode from dta_objects where tagcode='${ACLAObjectChange.trim}')"$
		Try
			Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
		Catch
			Log($"Erro de campo: ${LastException}"$)
		End Try
	Else If Utils.Int2Bool(is_contact) Then
		Dim updSQLRec As String = $"update dta_contacts set ${affected_field}='${value}'
													where 1=1
													and tagcode in (select distinct contact_tagcode from dta_objects_contacts where object_tagcode='${ACLAObjectChange.trim}')"$
		Try
			Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
		Catch
			Log($"Erro de campo: ${LastException}"$)
		End Try
	Else
		Dim updSQLRec As String = $"update dta_objects set ${affected_field}='${value}'
													where 1=1
													and tagcode='${ACLAObjectChange.trim}'"$
		Try
			Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
		Catch
			Log($"Erro de campo: ${LastException}"$)
		End Try
	End If
	Return True
End Sub

'*******************************************************************************************************************
'TIP: ATUALIZA CAMPOS DO PEDIDO/INTERVENÇÃO IDENTIFICADO
'*******************************************************************************************************************
Sub UpdateDBContextRequest(is_additional As Int, is_address As Int, is_contact As Int,affected_field As String, value As String, ACLAObjectChange As String) As ResumableSub
	If Utils.Int2Bool(is_additional) Then
		Dim updSQLRec As String = $"update dta_requests_fields set value='${value}'
																				where 1=1
																				and request_tagcode='${ACLAObjectChange.trim}' 
																				and field_tagcode='${affected_field.trim}'"$
		Try
			Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
		Catch
			Log($"Erro de campo: ${LastException}"$)
		End Try
	Else If Utils.Int2Bool(is_address) Then
		Dim updSQLRec As String = $"update dta_locations set ${affected_field}='${value}'
													where 1=1
													and tagcode in (select distinct local_tagcode from dta_requests where tagcode='${ACLAObjectChange.trim}')"$
		Try
			Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
		Catch
			Log($"Erro de campo: ${LastException}"$)
		End Try
	Else If Utils.Int2Bool(is_contact) Then
		Dim updSQLRec As String = $"update dta_contacts set ${affected_field}='${value}'
													where 1=1
													and tagcode in (select distinct contact_tagcode from dta_requests_contacts where request_tagcode='${ACLAObjectChange.trim}')"$
		Try
			Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
		Catch
			Log($"Erro de campo: ${LastException}"$)
		End Try
	Else
		Dim updSQLRec As String = $"update dta_requests set ${affected_field}='${value}'
													where 1=1
													and tagcode='${ACLAObjectChange.trim}'"$
		Try
			Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, ACLAObjectChange)
		Catch
			Log($"Erro de campo: ${LastException}"$)
		End Try
	End If
	Return True
End Sub

'*******************************************************************************************************************
'TIP: ATUALIZA CAMPOS DA RELAÇÃO DO PEDIDO/INTERVENÇÃO IDENTIFICADO
'*******************************************************************************************************************
Sub UpdateDBContextReqRelation(affected_field As String, value As String, Request As String, task_tagcode As String) As ResumableSub
	
	Dim updSQLRec As String = $"update dta_requests_relations set ${affected_field}='${value}'
												where 1=1
												and request_tagcode='${Request.trim}'
												and relation_tagcode='${task_tagcode.trim}'"$
	Try
		Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, Request)
	Catch
		Log($"Erro de campo: ${LastException}"$)
	End Try
	Return True
End Sub

'*******************************************************************************************************************
'TIP: ATUALIZA CAMPOS DA TAREFA DO PEDIDO/INTERVENÇÃO IDENTIFICADO
'*******************************************************************************************************************
Sub UpdateDBContextReqValue(affected_field As String, value As String, Request As String, task_tagcode As String, concerned_field As String) As ResumableSub
	
	Dim updSQLRec As String = $"update dta_requests_values set ${affected_field}='${value}'
												where 1=1
												and request_tagcode='${Request.trim}'
												and task_tagcode='${task_tagcode.trim}'
												and item_tagcode='${concerned_field.trim}'"$
	Try
		Utils.SaveSQLToLog("OnStatusChangeClose",updSQLRec, Request)
	Catch
		Log($"Erro de campo: ${LastException}"$)
	End Try
	Return True
End Sub


'*******************************************************************************************************************
'TIP : Evento do upload_bulk_data
'*******************************************************************************************************************
Sub CheckTypeRequestTaskParamters3(Request As String, task_tagcode As String, typerequest As String, Object2Get As String, whento As Int) As ResumableSub
	
	

	
'	whentotoupload = 0-Any, 1-Start, 2-End, 3-Open, 4-Close, 5-AssociateObject, 6-ChangeObject, 7-RemoveObject
'	on_change_status_to = 0-Any, 1 = por iniciar, 2 - em execucao, 3, 4 concluido 5,6

	ProgressDialogShow2(ShareCode.GeneralWaitPlease,True)
	Sleep(150)
	Dim continua As Boolean = False
	
	If typerequest = "_NONE_" Then
		Dim typerequest As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode from dta_requests where tagcode = '${Request}'"$,"typerequest_tagcode")
	End If
	
	Dim JsonParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${typerequest.Trim}'
												And task_tagcode='${task_tagcode.trim}'"$, "paramters")	
												
	Dim status_id As Int = DBStructures.GetScriptColumnIntEVC($"select status_id from dta_requests where 1=1 and tagcode='${Request}'"$, "status_id")
	
	If JsonParams.ContainsKey("upload_bulk_data") Then
		Try
			Dim upload_bulk_data As Int = JsonParams.Get("upload_bulk_data")
		Catch
			Dim upload_bulk_data As Int = 0
			Log(LastException)
		End Try
	Else
		Dim upload_bulk_data As Int = 0
	End If
	
	If Utils.Int2Bool(upload_bulk_data) Then
		
		Dim upload_bulkdata_settings As List = JsonParams.Get("upload_bulkdata_settings")
		For Each colupload_bulkdata_settings As Map In upload_bulkdata_settings
			
			Dim whentotoupload As Int = colupload_bulkdata_settings.Get("whentotoupload")
			Dim ubd_overwrite_data As Int = colupload_bulkdata_settings.Get("ubd_overwrite_data")
			Dim on_change_status_to As Int = colupload_bulkdata_settings.Get("on_change_status_to")
			Dim ubd_add_chapters As Int = colupload_bulkdata_settings.Get("ubd_add_chapters")
			Dim ubd_chapters_field As String = colupload_bulkdata_settings.Get("ubd_chapters_field")
			Dim ubd_repeted_chapter As Int = colupload_bulkdata_settings.Get("ubd_repeted_chapter")
			Dim ubd_chapter_tagcode As String = colupload_bulkdata_settings.Get("ubd_chapter_tagcode")
			Dim data_dependent As Int = colupload_bulkdata_settings.Get("data_dependent")
			Dim datadependent_fixedvalue As String = colupload_bulkdata_settings.Get("datadependent_fixedvalue")
			Dim ubd_script As String = colupload_bulkdata_settings.Get("ubd_script")
			Dim ubd_script_tagcode As String = colupload_bulkdata_settings.Get("ubd_script_tagcode")
			Dim ubd_items As List = colupload_bulkdata_settings.Get("ubd_items")
				
'			0-Não, 1-Objecto, 2-Entidade, 3-Technical, 4-Teams, 5-Departments, 6-Vehicles, 7-Processo, 8-Select
'			(1,2,3,4,5,6,7 - Vem do dta_requests object_tagcode, entity_tagcode, technical_tagcode, team_tagcode, department_tagcode, vehicle_tagcode, process_tagcode)
'			(8 - campo object_tagcode de dta_requests_values)
'			quando e agrupadora, entra como statud_id = 2, simples entra como status_id = 1
			If whentotoupload = whento Then
				
				If (on_change_status_to = 0) Or (on_change_status_to = status_id) Then
					
					continua = True
					
					If data_dependent = 0 Then
						Dim Field2get As String = "_NONE_"
						Dim Table2Get As String = "_NONE_"
					else If data_dependent = 1 Then
						Dim Field2get As String = "object_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 2 Then
						Dim Field2get As String = "entity_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 3 Then
						Dim Field2get As String = "technical_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 4 Then
						Dim Field2get As String = "team_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 5 Then
						Dim Field2get As String = "department_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 6 Then
						Dim Field2get As String = "vehicle_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 7 Then
						Dim Field2get As String = "process_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 8 Then
						Dim Field2get As String = "object_tagcode"
						Dim Table2Get As String = "dta_requests_values"
					End If
			
					If Field2get <> "_NONE_" And Utils.NNE(Object2Get) Then
						Dim data_dependent_result As String = DBStructures.GetScriptColumnStrEVC($"select ${Field2get} from ${Table2Get} where ${Field2get} = '${Object2Get}'"$, Field2get)
					End If
						
					If Utils.nne(ubd_script) Then
						ubd_script = ubd_script.Replace("«","'")
						ubd_script = ubd_script.Replace(":DATADEPENDENT", data_dependent_result)
						ubd_script = ubd_script.Replace(":CLIENTDB.", "")
						ubd_script = ubd_script.Replace(":REQUEST", Request.Trim)
						ubd_script = ubd_script.Replace(":OBJECT", Object2Get.Trim)
						ubd_script = ubd_script.Replace($":TASK"$,task_tagcode.Trim)
'						ubd_script = ubd_script.Replace($":ITEM"$,item_tagcode.Trim)
						Dim ReSet As ResultSet = Starter.LocalSQLEVC.ExecQuery(ubd_script)
						Dim Chapter As Int = 0
						Dim NumRecs As Int = ReSet.RowCount
						Log("Rows:" & NumRecs)
						Dim FullChapterList As List
						FullChapterList.Initialize
						Dim ParamsChapterList As List
						ParamsChapterList.Initialize
						
						Dim ChaptersRS As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select item_tagcode from dta_tasks_items where 1=1
														and parent_tagcode = (select unique_key from dta_tasks_items where item_tagcode = '${ubd_chapter_tagcode}')"$)
														
														
						Do While ChaptersRS.NextRow
							FullChapterList.Add(ChaptersRS.GetString("item_tagcode"))
						Loop
						
						Do While ReSet.NextRow
							Dim ReSetRow As Int = ReSet.Position
							Dim ChapterInsertedInBO As Boolean = False
							For Each colubd_items As Map In ubd_items
								Dim ubd_values_field As String = colubd_items.Get("ubd_values_field")
								Dim ubd_item_tagcode As String = colubd_items.Get("ubd_item_tagcode")
								Dim ubd_tagcode As String = colubd_items.Get("ubd_tagcode")
								Dim ubd_script_field As String = colubd_items.Get("ubd_script_field")
								
								If Utils.NNE(ubd_item_tagcode) Then
									ParamsChapterList.Add(ubd_item_tagcode)
								End If
								
																
								Dim Value2Set As String = ReSet.GetString(ubd_script_field)
								Log(ubd_item_tagcode & ":" & Value2Set)
								
								If Utils.NE(ubd_values_field) Then
									Dim Field2set As String = "execute_value"
								Else
									Dim Field2set As String = ubd_values_field
								End If
								
								Dim obj_tc As String = ""
														
								Dim ChapterUk As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_tasks_items where 1=1
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_chapter_tagcode}'"$,"unique_key")
																								
								Dim Uk As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"unique_key")
										
								Dim Tagcode As String = DBStructures.GetScriptColumnStrEVC($"select tagcode from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"tagcode")
								
								Dim position As String = DBStructures.GetScriptColumnStrEVC($"select position from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"position")
									
								Dim val_max As String = DBStructures.GetScriptColumnStrEVC($"select val_max from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"val_max")
									
								Dim val_min As String = DBStructures.GetScriptColumnStrEVC($"select val_min from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"val_min")
									
								Try
									Dim obj_tc As String = ReSet.GetString("object_tagcode")
								Catch
									Dim obj_tc As String = ""
									Log(LastException)
								End Try
								
								If Not(Utils.Int2Bool(ubd_repeted_chapter)) Then ' NAO E CAPITULO REPETITIVO
									If ReSetRow = 0 Then
										Dim Val2set As String = $"${Field2set}='${Value2Set}'"$
										
										If Field2set = "execute_value" Then
											Dim Val2set As String = $"execute_value='${Value2Set}', execute_value_title = ''"$
										End If
									
										If Field2set = "multi" Then
											Dim Val2set As String = ""
											Dim MapaCampos As Map
											MapaCampos.Initialize
											For f =0 To ReSet.ColumnCount -1
												Dim fieldname As String = ReSet.GetColumnName(f)
												Dim fieldVal As String = Utils.IfNotNullOrEmpty(ReSet.GetString(fieldname),"")
												MapaCampos.Put(fieldname,fieldVal)
											Next
											For x=0 To MapaCampos.Size -1
												Dim f2s As String = MapaCampos.GetKeyAt(x)
												Dim v2s As String = ReSet.GetString(f2s)
												Val2set = Val2set & $"${f2s} = '${v2s}',"$
											Next
											If Val2set.EndsWith(",") Then Val2set = Val2set.SubString2(0,Val2set.Length-1)
										End If
										
										
										
										Dim UpdateREQVAL As String = $"update dta_requests_values
																	set execute_status=1,
																	${Val2set},
																	object_tagcode = '${obj_tc}'
																	where request_tagcode='${Request.trim}' 
																	And inner_request_tagcode='${task_tagcode.trim}'
																	And task_tagcode='${task_tagcode.trim}'
																	And item_tagcode='${ubd_item_tagcode.trim}'
																	And unique_key='${Uk.Trim}'
																	And Tagcode = '${Tagcode.trim}'
																	And repeatfieldcounter = 0
																	And repeatitemcounter=0
																	And repeatcounter=0"$
'									Log(UpdateREQVAL)
										Try
											Starter.LocalSQLEVC.ExecNonQuery(UpdateREQVAL)
										Catch
											Log($"Erro de campo: ${LastException}"$)
										End Try
										
										Dim Rs2 As ResumableSub = UpdateServerUPDorINS("dta_requests_values", "update",Request,task_tagcode,ubd_item_tagcode,0,0,0)
										wait for (Rs2) complete (Finished As Boolean)
										Sleep(250)
									
									Else
										Dim execValue As String = ""
										Dim execValueTitle As String = ""
										Dim execTitle As String = ""
										
										
										If Field2set = "execute_value" Then
											execValue  = Value2Set
										else If Field2set = "execute_value_title" Then
											execValueTitle = Value2Set
										else If Field2set = "title" Then
											execTitle = Value2Set
										else If Field2set = "multi" Then
											Dim Val2set As String = ""
											Dim MapaCampos As Map
											MapaCampos.Initialize
											For f =0 To ReSet.ColumnCount -1
												Dim fieldname As String = ReSet.GetColumnName(f)
												Dim fieldVal As String = Utils.IfNotNullOrEmpty(ReSet.GetString(fieldname),"")
												MapaCampos.Put(fieldname, fieldVal)
											Next
											For x=0 To MapaCampos.Size -1
												Dim f2s As String = MapaCampos.GetKeyAt(x)
												Dim v2s As String = ReSet.GetString(f2s)
												If f2s.ToLowerCase = "execute_value" Then
													execValue = v2s
												else if f2s.ToLowerCase = "execute_value_title" Then
													execValueTitle = v2s
												else if f2s.ToLowerCase = "execute_format_title" Then
													execValueTitle = v2s
												else if f2s.ToLowerCase = "title" Then
													execTitle = v2s
												else if f2s.ToLowerCase = "object_tagcode" Then
													obj_tc = v2s
												End If
												
											Next
											
										End If
												
										Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
										Dim InsertREQVAL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																		tagcode,position, execute_status, object_tagcode, execute_value, execute_value_title, title, execute_format_title,
																		confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)
																		values (${maxid},'${Request}','${task_tagcode}','${task_tagcode}','${ubd_item_tagcode}','${Uk}',
										'${Tagcode}',${position},1,'${obj_tc}','${execValue}','${execValueTitle}','${execTitle}','','','',0, 0, ${ReSetRow}, ${val_min}, ${val_max})"$

										Try
											Starter.LocalSQLEVC.ExecNonQuery(InsertREQVAL)
										Catch
											Log($"Erro de campo: ${LastException}"$)
										End Try
										
										If Not(ChapterInsertedInBO) Then
											Dim Rs2 As ResumableSub = UpdateServerUPDorINS("dta_requests_values", "insert",Request,task_tagcode,ubd_item_tagcode,0,ReSetRow,0)
											wait for (Rs2) complete (Finished As Boolean)
											Sleep(250)
'											Dim Rs1 As ResumableSub = ClaiNewSvrVarValue(Request, task_tagcode, ChapterUk, 0 ,Chapter)
'											wait for (Rs1) Complete (Finished As Boolean)
											Sleep(250)
											ChapterInsertedInBO = True
										End If
										
									End If
									
									
								else If Utils.Int2Bool(ubd_repeted_chapter) And Utils.NNE(ubd_chapter_tagcode) Then ' É CAPITULO REPETITIVO
									If Chapter = 0 Then
										Dim Val2set As String = $"${Field2set}='${Value2Set}'"$
									
										If Field2set = "execute_value" Then
											Dim Val2set As String = $"execute_value='${Value2Set}', execute_value_title = ''"$
										End If
										
										If Field2set = "multi" Then
											Dim Val2set As String = ""
											Dim MapaCampos As Map
											MapaCampos.Initialize
											For f =0 To ReSet.ColumnCount -1
												Dim fieldname As String = ReSet.GetColumnName(f)
												Dim fieldVal As String = Utils.IfNotNullOrEmpty(ReSet.GetString(fieldname),"")
												MapaCampos.Put(fieldname,fieldVal)
											Next
											For x=0 To MapaCampos.Size -1
												Dim f2s As String = MapaCampos.GetKeyAt(x)
												Dim v2s As String = ReSet.GetString(f2s)
												Val2set = Val2set & $"${f2s} = '${v2s}',"$
											Next
											If Val2set.EndsWith(",") Then Val2set = Val2set.SubString2(0,Val2set.Length-1)
										End If
										
										
										Dim UpdateREQVAL As String = $"update dta_requests_values
																	set execute_status=1,
																	${Val2set},
																	object_tagcode = '${obj_tc}'
																	where request_tagcode='${Request.trim}' 
																	And inner_request_tagcode='${task_tagcode.trim}'
																	And task_tagcode='${task_tagcode.trim}'
																	And item_tagcode='${ubd_item_tagcode.trim}'
																	And unique_key='${Uk.Trim}'
																	and tagcode = '${Tagcode.trim}'
																	And repeatfieldcounter=0
																	And repeatitemcounter=0
																	And repeatcounter=0"$
										Log(UpdateREQVAL)
										Try
											Starter.LocalSQLEVC.ExecNonQuery(UpdateREQVAL)
										Catch
											Log($"Erro de campo: ${LastException}"$)
										End Try
														
										Dim Rs2 As ResumableSub = UpdateServerUPDorINS("dta_requests_values", "update",Request,task_tagcode,ubd_item_tagcode,0,0,0)
										wait for (Rs2) complete (Finished As Boolean)
										Sleep(250)
										

									Else ' JA NAO E O PRIMEIRO CAPITULO; FAZ UM INSERT
										
										Dim execValue As String = ""
										Dim execValueTitle As String = ""
										Dim execTitle As String = ""
												
										If Field2set = "execute_value" Then
											execValue  = Value2Set
										else If Field2set = "execute_value_title" Then
											execValueTitle = Value2Set
										else If Field2set = "title" Then
											execTitle = Value2Set
										else If Field2set = "multi" Then
											Dim Val2set As String = ""
											Dim MapaCampos As Map
											MapaCampos.Initialize
											For f =0 To ReSet.ColumnCount
												Dim fieldname As String = ReSet.GetColumnName(f)
												Dim fieldVal As String = Utils.IfNotNullOrEmpty(ReSet.GetString(fieldname),"")
												MapaCampos.Put(fieldname,fieldVal)
											Next
											For x=0 To MapaCampos.Size -1
												Dim f2s As String = MapaCampos.GetKeyAt(x)
												Dim v2s As String = ReSet.GetString(f2s)
												If f2s.ToLowerCase = "execute_value" Then
													execValue = v2s
												else if f2s.ToLowerCase = "execute_value_title" Then
													execValueTitle = v2s
												else if f2s.ToLowerCase = "execute_format_title" Then
													execValueTitle = v2s
												else if f2s.ToLowerCase = "title" Then
													execTitle = v2s
												else if f2s.ToLowerCase = "object_tagcode" Then
													obj_tc = v2s
												End If
												
											Next
											
										End If
												
										Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
										Dim InsertREQVAL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																		tagcode,position, execute_status, object_tagcode, execute_value, execute_value_title, title, execute_format_title,
																		confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)
																		values (${maxid},'${Request}','${task_tagcode}','${task_tagcode}','${ubd_item_tagcode}','${Uk}',
										'${Tagcode}',${position},1,'${obj_tc}','${execValue}','${execValueTitle}','${execTitle}','','','',0,${Chapter},0,${val_min},${val_max})"$
'																		'${Tagcode}','${position}',1,'${execValue}','${execValueTitle}','${execTitle}','','','',0,${Chapter},0,1,10)"$
										Try
											Starter.LocalSQLEVC.ExecNonQuery(InsertREQVAL)
										Catch
											Log($"Erro de campo: ${LastException}"$)
										End Try
										
										If Not(ChapterInsertedInBO) Then
											Dim Rs1 As ResumableSub = ClaiNewSvrVarValue(Request, task_tagcode, ChapterUk, 0 ,Chapter)
											wait for (Rs1) Complete (Finished As Boolean)
											Sleep(250)
											ChapterInsertedInBO = True
										End If
										
									End If
								End If
							Next
							
							Chapter = Chapter + 1
							
							
							For f = 0 To FullChapterList.Size -1
								Dim FCN As String = FullChapterList.Get(f)
								For p = 0 To ParamsChapterList.Size -1
									Dim PCN As String = ParamsChapterList.get(p)
									If PCN.Trim = FCN.Trim Then
										FullChapterList.Set(f,"-")
									End If
								Next
							Next
							
							For f = 0 To FullChapterList.Size -1
								Dim full_chapter_tagcode As String = FullChapterList.Get(f)
								If full_chapter_tagcode <> "-" And Chapter < = (NumRecs-1) Then
									
									Dim ch_Uk As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${full_chapter_tagcode}'"$,"unique_key")
										
									Dim ch_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select tagcode from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${full_chapter_tagcode}'"$,"tagcode")
									
									Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
									Dim InsertREQVAL2 As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																		tagcode,position, execute_status, execute_value, execute_value_title, title, execute_format_title,
																		confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)
																		select ${maxid}, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																		tagcode,position, execute_status, execute_value, execute_value_title, title, execute_format_title,
																		confirmed,changed_value, repeatcounter, ${Chapter}, repeatfieldcounter,val_min, val_max
																		from dta_requests_values where request_tagcode = '${Request}' and task_tagcode = '${task_tagcode}' 
																		and item_tagcode = '${full_chapter_tagcode}' and repeatitemcounter = 0"$
									Try
										Starter.LocalSQLEVC.ExecNonQuery(InsertREQVAL2)
									Catch
										Log($"Erro de campo: ${LastException}"$)
									End Try
													
								End If
								
							Next
							
							' INSERIR OS BOTOES QUE NAO FORAM RESPONDIDOS
'							Dim ChaptersBotoes As ResultSet = Starter.LocalSQLEVC.ExecQuery($"Select * from dta_tasks_items_answers where 1=1
'							and task_tagcode = '${task_tagcode}'
'							and item_tagcode = (select item_tagcode from dta_tasks_items where 1=1 and parent_tagcode = (Select unique_key from dta_tasks_items where item_tagcode = '${ubd_chapter_tagcode}'))"$)
'							
'							If ChaptersBotoes.RowCount > 0 Then
'								Do While ChaptersBotoes.NextRow
'									Dim BtnITC As String = ChaptersBotoes.GetString("item_tagcode")
'									Dim BtnTC As String = ChaptersBotoes.GetString("tagcode")
'									
'									Dim HasRec As Int = DBStructures.GetScriptColumnIntEVC($"select count(request_tagcode) as contador
'																from dta_requests_values where request_tagcode = '${Request}' and task_tagcode = '${task_tagcode}' 
'																And item_tagcode = '${BtnITC}' and tagcode = '${BtnTC}' and execute_status = 0 and repeatitemcounter = 0"$,"contador")
'																
'									If HasRec = 1 Then
'										Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
'										Dim InsertREQVALBotoes As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
'																		tagcode,position, execute_status, execute_value, execute_value_title, title, execute_format_title,
'																		confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)
'																		select ${maxid}, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
'																		tagcode,position, execute_status, execute_value, execute_value_title, title, execute_format_title,
'																		confirmed,changed_value, repeatcounter, ${Chapter}, repeatfieldcounter,val_min, val_max
'																		from dta_requests_values where request_tagcode = '${Request}' and task_tagcode = '${task_tagcode}' 
'																		and item_tagcode = '${BtnITC}' and tagcode = '${BtnTC}' and execute_status = 0 and repeatitemcounter = 0"$
'										Try
'											Starter.LocalSQLEVC.ExecNonQuery(InsertREQVALBotoes)
'										Catch
'											Log($"Erro de campo: ${LastException}"$)
'										End Try
'									End If
'								Loop
'							End If
							
							ChapterInsertedInBO = False
						Loop
						
					End If
				End If
			End If
		Next
		
		'**********************************************************************************************************************
		' CHAMADA AO NOVO ENDPOINT E ENVIO DE TODOS OS DADOS DE UMA VEZ EM VEZ DE CHAMAR O ENDPOINT UM A UM
		'**********************************************************************************************************************
		If continua Then
							
			Dim FinalSql As String =  $"select * from dta_requests_values where 1=1
											and request_tagcode='${Request}'
											And task_tagcode in ('${task_tagcode}')
											and repeatitemcounter > 0"$
			
			Dim RsArtigos As ResultSet = Starter.LocalSQLEVC.ExecQuery(FinalSql)

'				
			If RsArtigos.RowCount > 0 Then
				Do While RsArtigos.NextRow ' ITERA SOBRE TODOS OS REGISTOS

					Dim Req_TC As String = RsArtigos.GetString("request_tagcode")
					Dim Task_TC As String = RsArtigos.GetString("task_tagcode")
					Dim Item_TC As String = RsArtigos.GetString("item_tagcode")
					Dim rc As String = RsArtigos.GetString("repeatcounter")
					Dim rfc As String = RsArtigos.GetString("repeatfieldcounter")
					Dim ric As String = RsArtigos.GetString("repeatitemcounter")
					' ENVIA AO SERVIDOR
					Dim Rs2 As ResumableSub = UpdateServerUPDorINS("dta_requests_values", "update", Req_TC.trim, Task_TC.trim, Item_TC.trim, rc, rfc, ric)
					wait for (Rs2) complete (Finished As Boolean)
					Sleep(250)
				Loop
	
			End If
		End If
'	ProgressDialogHide

	End If
	
	Return True
	
End Sub

Sub UpdateServerUPDorINS (Tablename As String, Operationtype As String, request_tagcode As String, task_tagcode As String, item_tagcode As String, rc As Int, rfc As Int, ric As Int) As ResumableSub
	
	
	If item_tagcode <> "" Then
		
		Dim TableQuery As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select * from ${Tablename} where 1=1
																	And request_tagcode = '${request_tagcode}'
																	And task_tagcode = '${task_tagcode}'
																	and item_tagcode = '${item_tagcode}'
																	and repeatcounter = ${rc}
																	and repeatfieldcounter = ${rfc}
																	and repeatitemcounter = ${ric}"$)
	Else
		Dim TableQuery As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select * from ${Tablename} where 1=1
																	And request_tagcode = '${request_tagcode}'
																	And task_tagcode = '${task_tagcode}'
																	and repeatcounter = ${rc}
																	and repeatitemcounter = ${ric}"$)
	End If
	
	
	

	
	Dim MapFields As Map
	MapFields.Initialize
	Dim DataFields As List
	DataFields.Initialize
	Dim MapItems As Map
	MapItems.Initialize
	Dim ListItems As List
	ListItems.Initialize
	Dim MapConditions As Map
	MapConditions.Initialize
		
	MapItems.Put("table","dta_requests_values")
	MapItems.Put("type",Operationtype)
	
	'CRIAR A LISTA COM OS MAPS DOS NOMES DOS CAMPOS E VALORES
	If TableQuery.RowCount > 0 Then
		Do While TableQuery.NextRow
			For colnum = 0 To TableQuery.ColumnCount -1
				Dim ColName As String = TableQuery.GetColumnName(colnum)
				Dim ColValue As String = TableQuery.GetString(ColName)
				If ColName.ToLowerCase.trim <> "id" And ColName.ToLowerCase.trim <> "created_at" And ColName.ToLowerCase.trim <> "updated_at" Then
					If Utils.isNull(ColValue) Then
						ColValue = ""
					End If
					If Operationtype = "update" Then
						MapFields.Put("execute_status","1")
						If ColName.ToLowerCase.Trim = "execute_value" Then
							MapFields.Put(ColName, ColValue)
						Else If ColName.ToLowerCase.Trim = "execute_value_title" Then
							MapFields.Put(ColName, ColValue)
						Else If ColName.ToLowerCase.Trim = "title" Then
							MapFields.Put(ColName, ColValue)
						Else If ColName.ToLowerCase.Trim = "object_tagcode" Then
							MapFields.Put(ColName, ColValue)
						End If
					Else
						MapFields.Put(ColName, ColValue)
					End If
					
				End If
			Next
		
			DataFields.Add(MapFields)
			
		Loop
		
		MapItems.Put("fields",DataFields)
			
		If Operationtype = "update" Then
		
			MapConditions.Put("request_tagcode",request_tagcode.trim)
			MapConditions.Put("task_tagcode",task_tagcode.trim)
			MapConditions.Put("item_tagcode",item_tagcode.Trim)
			MapConditions.Put("repeatcounter",rc)
			MapConditions.Put("repeatitemcounter",ric)
			MapConditions.Put("repeatfieldcounter",rfc)
		
			Dim ListConditions As List
			ListConditions.Initialize
			ListConditions.Add(MapConditions)
			
			MapItems.Put("where", ListConditions)
			
		End If
		
		ListItems.Add(MapItems)
	
		Dim ACLAJson As Map
		ACLAJson.Initialize
		ACLAJson.put("items",ListItems)
	
		Dim NewParams As Map
		NewParams.Initialize
		NewParams.Clear
		NewParams.Put("_token", ShareCode.APP_TOKEN)
		NewParams.Put("debug", 1)
		NewParams.Put("ACLAJson", ACLAJson)
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/insert-update"$

		If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
			If Not(ShareCode.APP_WORKING_LOCAL) Then
'				Utils.CallApi(NewParams, Me, Url, "", request_tagcode)
				Try
					Dim data As String
					Dim JSON As JSONGenerator
					JSON.Initialize(NewParams)
        
					data = JSON.ToPrettyString(1)
					Dim JobD2S As HttpJob
					JobD2S.Initialize("",Me)
					Dim addr As String = Url
					Log(data)
					JobD2S.PostString(addr, data )
					JobD2S.GetRequest.SetContentType("application/json")
	
					Wait For (JobD2S) JobDone(JobD2S As HttpJob)
				
					If JobD2S.Success Then
						Log("API Reply:" & JobD2S.GetString)
					Else
						Log("API ERROR Reply:" & JobD2S.GetString)
					End If
					JobD2S.Release
				Catch
					Dim theData As String = $"${LastException}, ${data}"$
					Log(theData)
					Utils.logError("JobD2S", ShareCode.SESS_OPER_User, theData)
				End Try

			Else
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1, request_tagcode.trim, task_tagcode.Trim, item_tagcode.trim)
				Utils.save2update(Url, Utils.MapToJson(NewParams), 0, WorkerND)
			End If
			Sleep(250)
'			
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1, request_tagcode.trim, task_tagcode.Trim, item_tagcode.trim)
			Utils.save2update(Url, Utils.MapToJson(NewParams), 0, WorkerND)
		End If
	End If

	Return True
End Sub

Sub OLD_CheckTypeRequestTaskParamters3(Request As String, task_tagcode As String, typerequest As String, Object2Get As String, whento As Int) As ResumableSub
	
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	Dim continua As Boolean = False
	
	If typerequest = "_NONE_" Then
		Dim typerequest As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode from dta_requests where tagcode = '${Request}'"$,"typerequest_tagcode")
	End If
	
	Dim JsonParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${typerequest.Trim}'
												And task_tagcode='${task_tagcode.trim}'"$, "paramters")	
												
	Dim status_id As Int = DBStructures.GetScriptColumnIntEVC($"select status_id from dta_requests where 1=1 and tagcode='${Request}'"$, "status_id")
	
	If JsonParams.ContainsKey("upload_bulk_data") Then
		Try
			Dim upload_bulk_data As Int = JsonParams.Get("upload_bulk_data")
		Catch
			Dim upload_bulk_data As Int = 0
			Log(LastException)
		End Try
	Else
		Dim upload_bulk_data As Int = 0
	End If
	
	
	If Utils.Int2Bool(upload_bulk_data) Then
		
		Dim upload_bulkdata_settings As List = JsonParams.Get("upload_bulkdata_settings")
		For Each colupload_bulkdata_settings As Map In upload_bulkdata_settings
			
			Dim whentotoupload As Int = colupload_bulkdata_settings.Get("whentotoupload")
			Dim ubd_overwrite_data As Int = colupload_bulkdata_settings.Get("ubd_overwrite_data")
			Dim on_change_status_to As Int = colupload_bulkdata_settings.Get("on_change_status_to")
			Dim ubd_add_chapters As Int = colupload_bulkdata_settings.Get("ubd_add_chapters")
			Dim ubd_chapters_field As String = colupload_bulkdata_settings.Get("ubd_chapters_field")
			Dim ubd_repeted_chapter As Int = colupload_bulkdata_settings.Get("ubd_repeted_chapter")
			Dim ubd_chapter_tagcode As String = colupload_bulkdata_settings.Get("ubd_chapter_tagcode")
			Dim data_dependent As Int = colupload_bulkdata_settings.Get("data_dependent")
			Dim datadependent_fixedvalue As String = colupload_bulkdata_settings.Get("datadependent_fixedvalue")
			Dim ubd_script As String = colupload_bulkdata_settings.Get("ubd_script")
			Dim ubd_script_tagcode As String = colupload_bulkdata_settings.Get("ubd_script_tagcode")
			Dim ubd_items As List = colupload_bulkdata_settings.Get("ubd_items")
				
'			0-Não, 1-Objecto, 2-Entidade, 3-Technical, 4-Teams, 5-Departments, 6-Vehicles, 7-Processo, 8-Select
'			(1,2,3,4,5,6,7 - Vem do dta_requests object_tagcode, entity_tagcode, technical_tagcode, team_tagcode, department_tagcode, vehicle_tagcode, process_tagcode)
'			(8 - campo object_tagcode de dta_requests_values)
			If whentotoupload = whento Then
				
				If (on_change_status_to = 0) Or (on_change_status_to = status_id) Then
					
					continua = True
					
					If data_dependent = 0 Then
						Dim Field2get As String = "_NONE_"
						Dim Table2Get As String = "_NONE_"
					else If data_dependent = 1 Then
						Dim Field2get As String = "object_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 2 Then
						Dim Field2get As String = "entity_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 3 Then
						Dim Field2get As String = "technical_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 4 Then
						Dim Field2get As String = "team_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 5 Then
						Dim Field2get As String = "department_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 6 Then
						Dim Field2get As String = "vehicle_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 7 Then
						Dim Field2get As String = "process_tagcode"
						Dim Table2Get As String = "dta_requests"
					else If data_dependent = 8 Then
						Dim Field2get As String = "object_tagcode"
						Dim Table2Get As String = "dta_requests_values"
					End If
			
					If Field2get <> "_NONE_" And Utils.NNE(Object2Get) Then
						Dim data_dependent_result As String = DBStructures.GetScriptColumnStrEVC($"select ${Field2get} from ${Table2Get} where ${Field2get} = '${Object2Get}'"$, Field2get)
					End If
						
					If Utils.nne(ubd_script) Then
						ubd_script = ubd_script.Replace("«","'")
						ubd_script = ubd_script.Replace(":DATADEPENDENT", data_dependent_result)
						ubd_script = ubd_script.Replace(":CLIENTDB.", "")
						ubd_script = ubd_script.Replace(":REQUEST", Request.Trim)
						ubd_script = ubd_script.Replace($":TASK"$,task_tagcode.Trim)
'						ubd_script = ubd_script.Replace($":ITEM"$,item_tagcode.Trim)
						Dim ReSet As ResultSet = Starter.LocalSQLEVC.ExecQuery(ubd_script)
						Dim Chapter As Int = 0
						Dim NumRecs As Int = ReSet.RowCount
						Log("Rows:" & NumRecs)
						Dim FullChapterList As List
						FullChapterList.Initialize
						Dim ParamsChapterList As List
						ParamsChapterList.Initialize
						
						Dim ChaptersRS As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select item_tagcode from dta_tasks_items where 1=1
														and parent_tagcode = (select unique_key from dta_tasks_items where item_tagcode = '${ubd_chapter_tagcode}')"$)
														
						Do While ChaptersRS.NextRow
							FullChapterList.Add(ChaptersRS.GetString("item_tagcode"))
						Loop
						
						Do While ReSet.NextRow
							Dim ChapterInsertedInBO As Boolean = False
							For Each colubd_items As Map In ubd_items
								Dim ubd_values_field As String = colubd_items.Get("ubd_values_field")
								Dim ubd_item_tagcode As String = colubd_items.Get("ubd_item_tagcode")
								Dim ubd_tagcode As String = colubd_items.Get("ubd_tagcode")
								Dim ubd_script_field As String = colubd_items.Get("ubd_script_field")
								
								If Utils.NNE(ubd_item_tagcode) Then
									ParamsChapterList.Add(ubd_item_tagcode)
								End If
								
								Dim Value2Set As String = ReSet.GetString(ubd_script_field)
'								Log(ubd_item_tagcode & ":" & Value2Set)
								
								If Utils.NE(ubd_values_field) Then
									Dim Field2set As String = "execute_value"
								Else
									Dim Field2set As String = ubd_values_field
								End If
						
								Dim ChapterUk As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_tasks_items where 1=1
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_chapter_tagcode}'"$,"unique_key")
																								
								Dim Uk As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"unique_key")
										
								Dim Tagcode As String = DBStructures.GetScriptColumnStrEVC($"select tagcode from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"tagcode")
								
								Dim position As String = DBStructures.GetScriptColumnStrEVC($"select position from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"position")
									
								Dim val_max As String = DBStructures.GetScriptColumnStrEVC($"select val_max from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"val_max")
									
								Dim val_min As String = DBStructures.GetScriptColumnStrEVC($"select val_min from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${ubd_item_tagcode}'"$,"val_min")
									
								Try
									Dim obj_tc As String = ReSet.GetString("object_tagcode")
								Catch
									Dim obj_tc As String = ""
									Log(LastException)
								End Try
									
								If Not(Utils.Int2Bool(ubd_repeted_chapter)) Then
									
									Dim Val2set As String = $"${Field2set}='${Value2Set}'"$
									
									If Field2set = "execute_value" Then
										Dim Val2set As String = $"execute_value='${Value2Set}', execute_value_title = ''"$
									End If
									
									Dim UpdateREQVAL As String = $"update dta_requests_values
																	set execute_status=1,
																	${Val2set},
																	object_tagcode = '${obj_tc}'
																	where request_tagcode='${Request.trim}' 
																	And inner_request_tagcode='${task_tagcode.trim}'
																	And task_tagcode='${task_tagcode.trim}'
																	And item_tagcode='${ubd_item_tagcode.trim}'
																	And unique_key='${Uk.Trim}'
																	And Tagcode = '${Tagcode.trim}'
																	And repeatfieldcounter = 0
																	And repeatitemcounter=0
																	And repeatcounter=0"$
'									Log(UpdateREQVAL)
									Try
										Starter.LocalSQLEVC.ExecNonQuery(UpdateREQVAL)
									Catch
										Log($"Erro de campo: ${LastException}"$)
									End Try
									
									Dim Rs2 As ResumableSub = ClaiUpdateSvrVarValue(Request,task_tagcode,ubd_item_tagcode,Uk,Tagcode,Field2set,Value2Set,0,0,0)
									wait for (Rs2) Complete (Finished As Boolean)
									Sleep(250)
									
								else If Utils.Int2Bool(ubd_repeted_chapter) And Utils.NNE(ubd_chapter_tagcode) Then ' CAPITULO REPETITIVO
									If Chapter = 0 Then
										Dim Val2set As String = $"${Field2set}='${Value2Set}'"$
									
										If Field2set = "execute_value" Then
											Dim Val2set As String = $"execute_value='${Value2Set}', execute_value_title = ''"$
										End If
										
										Dim UpdateREQVAL As String = $"update dta_requests_values
																	set execute_status=1,
																	${Val2set},
																	object_tagcode = '${obj_tc}'
																	where request_tagcode='${Request.trim}' 
																	And inner_request_tagcode='${task_tagcode.trim}'
																	And task_tagcode='${task_tagcode.trim}'
																	And item_tagcode='${ubd_item_tagcode.trim}'
																	And unique_key='${Uk.Trim}'
																	and tagcode = '${Tagcode.trim}'
																	And repeatfieldcounter = 0
																	And repeatitemcounter=0
																	And repeatcounter=0"$
										Log(UpdateREQVAL)
										Try
											Starter.LocalSQLEVC.ExecNonQuery(UpdateREQVAL)
										Catch
											Log($"Erro de campo: ${LastException}"$)
										End Try
																							
										Dim Rs2 As ResumableSub = ClaiUpdateSvrVarValue(Request,task_tagcode,ubd_item_tagcode,Uk,Tagcode,Field2set,Value2Set,0,0,0)
										wait for (Rs2) Complete (Finished As Boolean)
										Sleep(250)
									Else ' JA NAO E O PRIMEIRO CAPITULO; FAZ UM INSERT
										
										Dim execValue As String = ""
										Dim execValueTitle As String = ""
										Dim execTitle As String = ""
												
										If Field2set = "execute_value" Then
											execValue  = Value2Set
										else If Field2set = "execute_value_title" Then
											execValueTitle = Value2Set
										else If Field2set = "title" Then
											execTitle = Value2Set
										End If
												
										Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
										Dim InsertREQVAL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																		tagcode,position, execute_status, execute_value, execute_value_title, title, execute_format_title,
																		confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)
																		values (${maxid},'${Request}','${task_tagcode}','${task_tagcode}','${ubd_item_tagcode}','${Uk}',
										'${Tagcode}',${position},1,'${execValue}','${execValueTitle}','${execTitle}','','','',0,${Chapter},0,${val_min},${val_max})"$
										Try
											Starter.LocalSQLEVC.ExecNonQuery(InsertREQVAL)
										Catch
											Log($"Erro de campo: ${LastException}"$)
										End Try
										
										If Not(ChapterInsertedInBO) Then
											Dim Rs1 As ResumableSub = ClaiNewSvrVarValue(Request, task_tagcode, ChapterUk, 0 ,Chapter)
											wait for (Rs1) Complete (Finished As Boolean)
											Sleep(250)
											ChapterInsertedInBO = True
										End If
										
										Dim Rs2 As ResumableSub = ClaiUpdateSvrVarValue(Request,task_tagcode,ubd_item_tagcode,Uk,Tagcode,Field2set,Value2Set,0,Chapter,0)
										wait for (Rs2) Complete (Finished As Boolean)
										Sleep(250)
										
									End If
								End If
							Next
							
							Chapter = Chapter + 1
							
							
							For f = 0 To FullChapterList.Size -1
								Dim FCN As String = FullChapterList.Get(f)
								For p = 0 To ParamsChapterList.Size -1
									Dim PCN As String = ParamsChapterList.get(p)
									If PCN.Trim = FCN.Trim Then
										FullChapterList.Set(f,"-")
									End If
								Next
							Next
							
							For f = 0 To FullChapterList.Size -1
								Dim full_chapter_tagcode As String = FullChapterList.Get(f)
								If full_chapter_tagcode <> "-" And Chapter < = (NumRecs-1) Then
									
									Dim ch_Uk As String = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${full_chapter_tagcode}'"$,"unique_key")
										
									Dim ch_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select tagcode from dta_requests_values where 1=1
																								and request_tagcode = '${Request.trim}'
																								and task_tagcode = '${task_tagcode}'
																								and item_tagcode = '${full_chapter_tagcode}'"$,"tagcode")
									
									Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") +1 + 1000000
									Dim InsertREQVAL2 As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																		tagcode,position, execute_status, execute_value, execute_value_title, title, execute_format_title,
																		confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)
																		select ${maxid}, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
																		tagcode,position, execute_status, execute_value, execute_value_title, title, execute_format_title,
																		confirmed,changed_value, repeatcounter, ${Chapter}, repeatfieldcounter,val_min, val_max
																		from dta_requests_values where request_tagcode = '${Request}' and task_tagcode = '${task_tagcode}' 
																		and item_tagcode = '${full_chapter_tagcode}' and repeatitemcounter = 0"$
									Try
										Starter.LocalSQLEVC.ExecNonQuery(InsertREQVAL2)
									Catch
										Log($"Erro de campo: ${LastException}"$)
									End Try
													
									Dim Rs2 As ResumableSub = ClaiUpdateSvrVarValue(Request,task_tagcode,ubd_item_tagcode,Uk,Tagcode,Field2set,Value2Set,0,Chapter,0)
									wait for (Rs2) Complete (Finished As Boolean)
									Sleep(250)
								End If
								
							Next
							ChapterInsertedInBO = False
						Loop
						
					End If
				End If
			End If
		Next
	End If
	
	ProgressDialogHide
	
	Return True
	
	End Sub

Sub ClaiNewSvrVarValue(request_tagcode As String, task_tagcode As String, Chapter_Uk As String, rc As Int, ric As Int) As ResumableSub
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", request_tagcode.trim)
	params.Put("ACLATask", task_tagcode.Trim)
	params.Put("ACLAUniqueKey", Chapter_Uk.Trim) ' chapter UK
	params.Put("ACLAReqCounter", rc)
	params.Put("ACLARepeatItem", ric)
'			params.Put("ACLARepeatField", ChapterItem.repeatfieldcounter)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/new"$
	If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", request_tagcode.trim)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,request_tagcode.Trim,task_tagcode.Trim,"")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,request_tagcode.Trim,task_tagcode.Trim,"")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	
	Return True
	
End Sub

Sub ClaiUpdateSvrVarValue(request_tagcode As String, task_tagcode As String,item_tagcode As String, Uk As String, tagcode As String, field2set As String, value2set As String, rc As Int, ric As Int, rfc As Int) As ResumableSub
	
'	Log($"ESCREVE NO BO : ${request_tagcode} ${task_tagcode} ${item_tagcode} ${field2set} ${value2set}"$)
	
	Dim v2Set As String = ""
	Dim vt2Set As String = ""
	Dim t2Set As String = ""
	
	If field2set = "execute_value" Then
		v2Set = value2set
	Else If field2set = "execute_value_title" Then
		vt2Set = value2set
	Else  If field2set = "title" Then
		t2Set = value2set
	Else
		v2Set = value2set
	End If
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", request_tagcode)
	params.Put("ACLAAction", task_tagcode)
	params.Put("ACLATask", task_tagcode)
	params.Put("ACLAItem", item_tagcode)
	params.Put("ACLAUniqueKey", Uk)
	params.Put("ACLATagcode", tagcode)
	params.Put("ACLAValue", v2Set)
	params.Put("ACLAValueTitle", vt2Set)
	params.Put("ACLATitle", t2Set)
	params.Put("ACLAReqCounter", rc)
	params.Put("ACLARepeatItem", ric)
	params.Put("ACLARepeatField", rfc)
	params.Put("ACLAInner", 0)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim sACLADatetime As String = Utils.GetCurrDatetime
	Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

	params.Put("ACLADatetime", sACLADatetime)
	params.Put("ACLALatitude", sACLALatitude)
	params.Put("ACLALongitude", sACLALongitude)
	Dim ACLSessUser As String = ShareCode.SESS_OPER_User
			
	params.Put("ACLSessUser", ACLSessUser)
	params.Put("ACLClear", 0)
					
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/update"$
	If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			Utils.CallApi(0, params, Me, Url, "", request_tagcode)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,request_tagcode.Trim,task_tagcode.Trim,"")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,request_tagcode.Trim,task_tagcode.Trim,"")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	
	Return True
End Sub

Sub CheckAndRebuildRequest(request As String) As ResumableSub
	Wait For (File.ListFilesAsync(Starter.SharedFolder)) Complete (Success As Boolean, Files As List)
	If (Files.size >=1) Then
		For n=0 To Files.Size-1
			Dim theFile As String = Files.Get(n)
			Log(theFile)
			'APICALL_I_20201106_142109wh_TECH_2019_015452__20201106_145356.svrlog
			Dim StartWith As String = $"APICALL_${request.trim}"$
			If (theFile.ToUpperCase.StartsWith(StartWith.ToUpperCase)) Then
				Utils.CallApiLocalSaved(theFile, Me, "")
				Exit
			End If
		Next
	End If
	Return True
End Sub



'*******************************************************************************************************************
'TIP: CRIAÇÃO DE INTERVENÇÃO/CHECKLIST POR PARAMETROS DE TYPEREQUEST_TASKS_ADDS
'	  NOTA #003
'*******************************************************************************************************************
Sub CheckTypeRequestTaskParamters4(request_tagcode As String, task_tagcode As String, typerequest As String, object_tagcode As String, whento As Int, globalcode As String)  As ResumableSub
	Dim boolvalue As Boolean = False
	If (Utils.NNE(typerequest) And Utils.NNE(task_tagcode)) Then
		
		Dim paramters As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
										$"select distinct paramters 
										from dta_typerequests_tasks_adds where 1=1
										And typerequest_tagcode='${typerequest.trim}'
										And task_tagcode='${task_tagcode.trim}'"$, "paramters")
	
		Dim status_id As Int = DBStructures.GetScriptColumnIntEVC($"select status_id from dta_requests where 1=1 and tagcode='${request_tagcode}'"$, "status_id")
		If (paramters.Size > 0) Then
			Try
				Dim create_additional_task As Int = paramters.Get("create_additional_task")
			Catch
				Dim create_additional_task As Int = 0
			End Try
			
			If Utils.Int2Bool(create_additional_task) Then
				Dim create_additional_settings As List = paramters.Get("create_additional_settings")
				For Each params As Map In create_additional_settings
					
					Dim whentocreate As Int = params.Get("whentocreate")
					Dim is_child_task As Int = params.Get("is_child_task")
					Dim dependent_request As Int = params.Get("dependent_request")
					
					Dim condition_based As Int = params.Get("condition_based")
					Dim condition_based_formula As String = params.Get("condition_based_formula")
					Dim condition_based_script As String = params.Get("condition_based_script")
					
					Dim typerequest_tagcode As String = params.Get("typerequest_tagcode")
					Dim checklist_tagcode As String = params.Get("checklist_tagcode")
					
					Dim global_code_based As Int = params.Get("global_code_based")
					Dim global_code_from As Int = params.Get("global_code_from")
					Dim global_code As String = params.Get("global_code")
					
					Dim MainDataScript As String = ""
					If (whento=whentocreate) Then
						boolvalue = True
						
						If (Utils.Int2Bool(is_child_task)) Then
							If (Utils.NNE(checklist_tagcode)) Then
								MainDataScript = $"select tagcode from dta_tasks where 1=1 and tagcode='${checklist_tagcode.Trim}'"$
							End If
						Else
							If (Utils.NNE(typerequest_tagcode)) Then
								MainDataScript = $"select tagcode from dta_typerequests where 1=1 and tagcode='${typerequest_tagcode.Trim}'"$
							End If
						End If
						
						If (condition_based>0) Then
							Dim  CondReturnTrue As Boolean = (condition_based=1) Or (condition_based=3)
							If (condition_based>=3) Then
								Dim gScript As String = condition_based_script
								
								gScript = gScript.Replace("«", "'")
								gScript = gScript.Replace($":REQUEST"$,request_tagcode.Trim)
								gScript = gScript.Replace($":TASK"$,task_tagcode.Trim)
								gScript = gScript.Replace($":OBJECT"$,object_tagcode.Trim)
								gScript = gScript.Replace($":TYPEREQUEST"$,typerequest.Trim)
								gScript = gScript.Replace($":CLIENTDB."$, "")
								
								Dim gScriptRetValue As String = DBStructures.GetScriptColumnStrEVC(gScript, "RESULT")
								condition_based_formula = condition_based_formula.Replace($"[__SCRIPT__]"$,gScriptRetValue.Trim)
							End If
							
							Dim gFormula As String = condition_based_formula
							gFormula = gFormula.Replace($"[REQUEST]"$,request_tagcode.Trim)
							gFormula = gFormula.Replace($"[TASK]"$,task_tagcode.Trim)
							gFormula = gFormula.Replace($"[OBJECT]"$,object_tagcode.Trim)
							gFormula = gFormula.Replace($"[TYPEREQUEST]"$,typerequest.Trim)
							gFormula = gFormula.Replace($"[STATUSID]"$,$"${status_id}"$)
							
							boolvalue = CondReturnTrue And Utils.Test4TrueOnlyValues(gFormula)
						End If
						
						If Utils.Int2Bool(global_code_based) Then
							'************************************************************************************
							' NOTE: VERIFICA SE EXISTEM CL A CRIAR COM BASE NA VERIFICAÇÃO DA FLAG GLOBAL_CODE
							'************************************************************************************
							'0-Identificado em "global_code", 1-Tipo de Intervenção, 2-Checklist, 3-Tipo de Objecto, 4-Armazém, 5-Artigo
							
							Dim localGlobalCode As String = ""
							If (global_code_from>0) Then
								If (global_code_from=1) Then
									localGlobalCode = Utils.IfNullOrEmpty( _
										DBStructures.GetScriptColumnStrEVCJSON($"select distinct paramters from dta_typerequests 
											where tagcode='${typerequest.Trim}'"$, "paramters", "global_code"), "")	
								Else if (global_code_from=2) Then
									localGlobalCode = DBStructures.GetScriptColumnStrEVC($"Select ifnull(reference, '') as valor
										from dta_tasks_adds where 1=1
										And tagcode='${task_tagcode.trim}'"$, "valor")
								Else if (global_code_from=3) Then
									localGlobalCode = DBStructures.GetScriptColumnStrEVC($"Select ifnull(reference, '') as valor
										from dta_objecttypes_groups where 1=1
										And tagcode in (Select object_group 
										from dta_objects where tagcode='${object_tagcode.trim}')"$, "valor")
								Else if (global_code_from=4) Then
									localGlobalCode = Utils.IfNullOrEmpty( _
										DBStructures.GetScriptColumnStrEVCJSON($"select distinct paramters from dta_warehouses_adds 
											where warehouse_tagcode in (select tagcode from dta_warehouses
											where 1=1
											and (object_tagcode='${object_tagcode.Trim}'))"$, "paramters", "global_code"), "")	
								Else if (global_code_from=5) Then
									localGlobalCode = DBStructures.GetScriptColumnStrEVC($"Select ifnull(taggedcode, '') as valor
										from dta_articles_adds where 1=1
										And article_tagcode='${object_tagcode.trim}'"$, "valor")
								End If
							Else
								If Utils.NNE(global_code) Then
									localGlobalCode = global_code
								End If
							End If
	
							If Utils.NNE(localGlobalCode) And Utils.NE(globalcode) Then
								globalcode = localGlobalCode
							End If
							
							If (Utils.Int2Bool(is_child_task)) Then
								MainDataScript = $"select tagcode from dta_tasks where 1=1"$
								If (Utils.NNE(checklist_tagcode)) Then
									MainDataScript = $"${MainDataScript} and tagcode='${checklist_tagcode.Trim}'"$
								else If (Utils.NNE(globalcode)) Then
									
									'MainDataScript = $"${MainDataScript} and tagcode in (select distinct tagcode from dta_tasks_adds where reference='${globalcode.Trim}')"$
									MainDataScript = $"${MainDataScript} and tagcode in (select distinct tagcode from dta_tasks_adds
													where 1=1 and '${globalcode.Trim}' like '%'||reference||'%')"$
								End If
							Else
								'typerequest_tagcode
								MainDataScript = $"select tagcode from dta_typerequests where 1=1"$
								If (Utils.NNE(typerequest_tagcode)) Then
									MainDataScript = $"${MainDataScript} and tagcode='${typerequest_tagcode.Trim}'"$
								else If (Utils.NNE(globalcode)) Then
									MainDataScript = $"${MainDataScript} and paramters like '%global_code":"${globalcode.Trim}"%' limit 1"$
								End If
							End If
						End If
						
						boolvalue = boolvalue And Utils.NNE(MainDataScript)
						
						boolvalue = False
						
						If (boolvalue) Then
							Dim GetReqData As ResultSet = Starter.LocalSQLEVC.ExecQuery(MainDataScript)
							Do While GetReqData.NextRow
								Dim vtagcode As String = GetReqData.GetString("tagcode")
								If (Utils.Int2Bool(is_child_task)) Then
									Dim res As ResumableSub = CallCreateNewChecklistToRequest(request_tagcode, vtagcode)
									Wait For (res) Complete (Finished As Boolean)
								Else
									Dim res As ResumableSub = CallCreateNewRequest(request_tagcode, vtagcode, dependent_request)
									Wait For (res) Complete (Finished As Boolean)
								End If
							Loop
							
						End If
						
					End If
				Next

			End If
		
		End If
	End If


	Return boolvalue
End Sub

Sub CallCreateNewRequest(request_tagcode As String, newRequestType  As String, dependente As Int) As ResumableSub
	Dim resValue As Boolean = False
	ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize

		If Utils.NNE(newRequestType) Then
			Dim Entidade As String = "__NONE__"
			Dim Objecto As String= "__NONE__"
			Dim Tecnico As String = ShareCode.SESS_OPER_User
			Dim Equipa As String = ""
			Dim Veiculo As String = ShareCode.SESS_VEHICLE_OBJECT
			Dim PedidoDependente As String = ""  'dependent_request
			
			Dim cScript As String = $"select * from dta_requests where tagcode='${request_tagcode.Trim}'"$
			Dim ResData As ResultSet = Starter.LocalSQLEVC.ExecQuery(cScript)
			Do While ResData.NextRow
				Dim Entidade As String = ResData.GetString("entity_tagcode")
				Dim Objecto As String= ResData.GetString("object_tagcode")
				Dim Equipa As String = ResData.GetString("team_tagcode")
				If Utils.Int2Bool(dependente) Then
					Dim PedidoDependente As String = ResData.GetString("tagcode")
				End If
				Exit
			Loop
			resValue = True
			'Dim status_id As Int = DBStructures.GetScriptColumnIntEVC($"select status_id from dta_requests where 1=1 and tagcode='${request_tagcode}'"$, "status_id")
	
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
			newExecution.Put("entity_tagcode", Entidade)
			newExecution.Put("object_tagcode", Objecto)
			newExecution.Put("technical_tagcode", Tecnico)
			newExecution.Put("team_tagcode", Equipa)
			newExecution.Put("local_tagcode", "")
			newExecution.Put("typerequest_tagcode", newRequestType)
			newExecution.Put("vehicle_tagcode", Veiculo)
			newExecution.Put("dependent_request", PedidoDependente)
			newExecution.Put("confirmed", 1)
			newExecution.Put("active", 1)
			Dim ListOfMaps As List
			ListOfMaps.Initialize
			ListOfMaps.Add(newExecution)
			newRequestItem.Put("request", ListOfMaps)
'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
			Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 1, "dta_requests", ListOfMaps,newRequest,"")
		
			
			Dim newRequestItem2 As Map
			newRequestItem2.Initialize
			
			Dim cScript As String = $"Select a.task_tagcode, a.allowed from dta_typerequests_tasks As a
					left join dta_typerequests_tasks_adds As b on (b.typerequest_tagcode=a.typerequest_tagcode
						And b.task_tagcode=a.task_tagcode)
					where a.typerequest_tagcode='${newRequestType.Trim}'
					order by b.cl_is_father desc, a.position"$
			Dim ResData As ResultSet = Starter.LocalSQLEVC.ExecQuery(cScript)
			Dim n As Int = 0
			Do While ResData.NextRow
				Dim tagcode As String = ResData.GetString("task_tagcode")

'				Dim cl_is_father As Int = DBStructures.GetScriptColumnIntEVC($"select cl_is_father from dta_typerequests_tasks_adds
'											where typerequest_tagcode='${newRequestType.Trim}'
'											And task_tagcode='${tagcode.Trim}'"$, _
'											"cl_is_father")
				Dim repeatcounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${tagcode}'"$)
			
				Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
				Dim newExecution As Map
				newExecution.Initialize
				newExecution.Put("id", maxID)
				newExecution.Put("request_tagcode", newRequest)
				newExecution.Put("relation_tagcode", tagcode)
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
				newExecution.Put("repeatcounter", repeatcounter)
				newExecution.Put("active", 1)
				Dim ListOfMaps As List
				ListOfMaps.Initialize
				ListOfMaps.Add(newExecution)
				newRequestItem2.Put($"${n}"$, ListOfMaps)
'				DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
				Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 2, "dta_requests_relations", ListOfMaps,newRequest,"")
				n = n + 1
			Loop
			newRequestItem.Put("relation", newRequestItem2)
			
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
		
'			Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
'				tagcode,position,execute_value,execute_format_title,
'				confirmed,changed_value,cbr_id)
'				select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
'				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
'				x.execute_value, x.execute_format_title, 
'				x.confirmed, x.changed_value, 0 As cbr_id
'				from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position, 
'				a.position As relposition, '' as execute_value, 
'				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
'				0 as confirmed, '' as changed_value
'				from dta_requests_relations As a
'				inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode='${newRequest}'
'				union
'				select d.id, '${newRequest}' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) As position,
'				a.position as relposition, '' as execute_value, 
'				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
'				0 as confirmed, '' as changed_value
'				from dta_requests_relations as a
'				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode 
'				from dta_requests_relations where request_tagcode ='${newRequest}')) as x
'				order by  x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id"$


			Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
								tagcode,position,execute_value,execute_format_title,
								confirmed,changed_value,cbr_id)
								select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode,
								x.item_tagcode, x.unique_key, x.tagcode, x.position,
								x.execute_value, x.execute_format_title,
								x.confirmed, x.changed_value, 0 As cbr_id
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
								) as x
								order by x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id"$
								
			Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, newRequest)
			Dim stage As Int = 0
			Dim resfields As ResumableSub = createRequestFields(newRequest, newRequestType)
			Wait For(resfields) Complete (resfieldsOk As Boolean)
		
			Dim resa1 As ResumableSub = createRequestEntityRelation(newRequest, "")
			Wait For(resa1) Complete (resfieldsOk1 As Boolean)
		
			Dim resa2 As ResumableSub = createRequestObjectRelation(newRequest, "")
			Wait For(resa2) Complete (resfieldsOk2 As Boolean)
			
			Dim res As ResumableSub = UploadNewRequest2Server2(newRequest, newRequestItem, "1", stage)
			Wait For(res) Complete (NewRequestCode As CreateRequestReturn)
		Else
			MsgboxAsync(ShareCode.AppDialogsNaoVerificadoTipoIntervencao, ShareCode.GeneralAlertTitle)
		End If
	Catch
		Log(LastException)
	End Try
	ProgressDialogHide
	Return resValue
End Sub

Sub CallCreateNewChecklistToRequest(request_tagcode As String, newRequestType  As String) As ResumableSub
	Dim resValue As Boolean = False
	ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize

		If Utils.NNE(newRequestType) Then
			
			resValue = True
			'Dim status_id As Int = DBStructures.GetScriptColumnIntEVC($"select status_id from dta_requests where 1=1 and tagcode='${request_tagcode}'"$, "status_id")
	
			Dim newRequest As String = request_tagcode
			Dim newDate As String = Utils.GetCurrentDate
			Dim newTime As String = Utils.GetCurrentTimeExt
			
			Dim newRequestItem2 As Map
			newRequestItem2.Initialize
			

			Dim tagcode As String = newRequestType
			Dim repeatcounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${tagcode}'"$)
		
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
			Dim newExecution As Map
			newExecution.Initialize
			newExecution.Put("id", maxID)
			newExecution.Put("request_tagcode", newRequest)
			newExecution.Put("relation_tagcode", tagcode)
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
			newExecution.Put("repeatcounter", repeatcounter)
			newExecution.Put("active", 1)
			Dim ListOfMaps As List
			ListOfMaps.Initialize
			ListOfMaps.Add(newExecution)
			newRequestItem2.Put($"0"$, ListOfMaps)
			Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 2, "dta_requests_relations", ListOfMaps,newRequest,"")
			newRequestItem.Put("relation", newRequestItem2)
			
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
		
'			Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
'				tagcode,position,execute_value,execute_format_title,
'				confirmed,changed_value,cbr_id)
'				select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
'				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
'				x.execute_value, x.execute_format_title, 
'				x.confirmed, x.changed_value, 0 As cbr_id
'				from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position, 
'				a.position As relposition, '' as execute_value, 
'				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
'				0 as confirmed, '' as changed_value
'				from dta_requests_relations As a
'				inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode='${newRequest}'
'				union
'				select d.id, '${newRequest}' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
'				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) As position,
'				a.position as relposition, '' as execute_value, 
'				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
'				0 as confirmed, '' as changed_value
'				from dta_requests_relations as a
'				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
'				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
'				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
'				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode 
'				from dta_requests_relations where request_tagcode ='${newRequest}')) as x
'				order by  x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id"$

			Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
									tagcode,position,execute_value,execute_format_title,
									confirmed,changed_value,cbr_id, repeatcounter)
									select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode,
									x.item_tagcode, x.unique_key, x.tagcode, x.position,
									x.execute_value, x.execute_format_title,
									x.confirmed, x.changed_value, 0 As cbr_id, ${repeatcounter}
									from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode,
									c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position,
									a.position As relposition, '' as execute_value,
									Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
									0 As confirmed, '' as changed_value
									from dta_requests_relations As a
									inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=a.relation_tagcode)
									left join dta_tasks_items_answers As d on (d.parent_tagcode=c.unique_key)
									where a.type_relation=0 And a.request_tagcode='${newRequest}' and a.relation_tagcode='${tagcode.trim}'
									) As x
									order by x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id"$

			Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, newRequest)
			Dim stage As Int = 2
			
			Dim res As ResumableSub = UploadNewRequest2Server2(newRequest, newRequestItem, "1", stage)
			Wait For(res) Complete (NewRequestCode As CreateRequestReturn)
		Else
			MsgboxAsync(ShareCode.AppDialogsNaoVerificadoTipoIntervencao, ShareCode.GeneralAlertTitle)
		End If
	Catch
		Log(LastException)
	End Try
	ProgressDialogHide
	Return resValue
End Sub

Sub UploadNewRequest2Server2(tagcode As String, items As Map, origin As String, stage As Int) As ResumableSub
	Dim RetValue As CreateRequestReturn = Types.MakeCreateRequestReturnClear
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
	params.Put("stageCheck", stage)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
	Dim data As String =   JSON.ToPrettyString(1)
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/upload/request/new"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Log(Job.GetString)
			
			Dim JSON1 As JSONParser
			JSON1.Initialize(Job.GetString)
			Dim MapJSON As Map = JSON1.NextObject
			RetValue.RequestTagcode = Utils.IfNullOrEmpty(MapJSON.Get("newrequest"), "")
			RetValue.Status = Utils.IfNullOrEmptyInt(MapJSON.Get("status"), 0)
			RetValue.Stage = Utils.IfNullOrEmptyInt(MapJSON.Get("stage"), 0)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,"","")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End If
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,"","")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If

	Return RetValue
End Sub

Sub returnedFromScanner
	Log("returnedFromScanner")
	GlobalScanReturn = True
End Sub

Sub checkStartParameters(ParamsMap As Map,Req As String, Status As Int) As ResumableSub
	
'	"startcontrol_settings":
'	"every_time_execution":0,               //Sempre que a CL é executada? 0 = no arranque, 1 = em qualquer estado
'	"proximity_control":0,                  //Controla proximidade?
'	"proximity_bylocation":0,              //Por localização (georreferência)?
'	"proximity_bysensor":0,                //Por sensor?
'	"proximity_distance":0,                //Distância de controlo em Metros
'	"barcode_control":0,                   //Controla QR-Code / Código de barras

'	"control_from_entity":0,                //Origem Do controlo pela entidade
'	"control_from_object":0,               //Origem de controlo pelo objecto
'	"control_from_request":0,              //Origem de controlo pelo Pedido/Intervenção
'	"control_from_value":0,                //Origem de controlo por valor fixado
'	"control_field":"",                    //Campo de controlo (se diferente de tagcode)
'	"control_table":"",                    //Tabela de controlo (se diferente de tabela principal)
'	"control_field_additional":0,           //É campo adicional?
'	"control_value":""                      //Origem de controlo por valor fixado
	Dim TypeOfControl As Int = 0
	Dim object_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode from dta_requests where 1=1 and
																		tagcode = '${Req.trim}'"$,"object_tagcode")
	
	Dim entity_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select entity_tagcode from dta_requests where 1=1 and
																		tagcode = '${Req.trim}'"$,"entity_tagcode")
	
	Dim startcontrol_settings As Map = ParamsMap.Get("startcontrol_settings")
	
	Dim every_time_execution As Int = startcontrol_settings.Get("every_time_execution") 'Sempre que a CL é executada? 0 = no arranque, 1 = em qualquer estado
	Dim proximity_control As Int = startcontrol_settings.Get("proximity_control") 'Controla proximidade?
	Dim proximity_bylocation As Int = startcontrol_settings.Get("proximity_bylocation") 'Por localização (georreferência)?
	Dim proximity_bysensor As Int = startcontrol_settings.Get("proximity_bysensor") 'Por sensor?
	Dim proximity_distance As Int = startcontrol_settings.Get("proximity_distance") 'Distância de controlo em Metros
	Dim barcode_control As Int = startcontrol_settings.Get("barcode_control") 'ontrola QR-Code / Código de barras
		
	Dim control_from_entity As Int = startcontrol_settings.Get("control_from_entity") 'Origem Do controlo pela entidade
	Dim control_from_object As Int = startcontrol_settings.Get("control_from_object") 'Origem de controlo pelo objecto
	Dim control_from_request As Int = startcontrol_settings.Get("control_from_request") 'Origem de controlo pelo Pedido/Intervenção
	Dim control_from_value As Int = startcontrol_settings.Get("control_from_value") 'Origem de controlo por valor fixado nao e o requests
		
	Dim control_field As String = startcontrol_settings.Get("control_field") 'Campo de controlo (se diferente de tagcode)
	Dim control_table As String = startcontrol_settings.Get("control_table") 'Tabela de controlo (se diferente de tabela principal)
		
	Dim control_field_additional As Int = startcontrol_settings.Get("control_field_additional") 'É campo adicional?
	Dim control_value As String = startcontrol_settings.Get("control_value") 'Origem de controlo por valor fixado, depende do control_from_value
		
	Dim Tbl As String = ""
	Dim Fld As String = ""
	Dim Value2Check As String = ""
		
	Dim RetVal As Boolean = True
		
	If Utils.Int2Bool(control_from_object) Then
		Tbl  = "dta_requests"
		Fld = "object_tagcode"
		Dim SqlScript As String = $"select ${Fld} from ${Tbl} where 1=1 and tagcode = '${Req.trim}'"$
			
		If Utils.NNE(control_field) Then
			Fld = control_field
			Dim SqlScript As String = $"select ${control_field} from dta_objects where tagcode = '${object_tagcode}'"$
		End If
			
		Value2Check = DBStructures.GetScriptColumnStrEVC(SqlScript, Fld)
			
	else if Utils.Int2Bool(control_from_entity) Then
		Tbl  = "dta_requests"
		Fld = "entity_tagcode"
		Dim SqlScript As String = $"select ${Fld} from ${Tbl} where 1=1 and tagcode = '${Req.trim}'"$
			
		If Utils.NNE(control_field) Then
			Fld = control_field
			Dim SqlScript As String = $"select ${control_field} from dta_objects where tagcode = '${entity_tagcode}'"$
		End If
			
		Value2Check = DBStructures.GetScriptColumnStrEVC(SqlScript, Fld)
	else if Utils.Int2Bool(control_from_request) Then
		Tbl = "dta_requests"
		Fld = "tagcode"
		Value2Check = Req
			
		If Utils.NNE(control_field) Then
			Fld = control_field
			Dim SqlScript As String = $"select ${control_field} from dta_requests where tagcode = '${Req.trim}'"$
			Value2Check = DBStructures.GetScriptColumnStrEVC(SqlScript, Fld)
		End If

	else if Utils.Int2Bool(control_from_value) Then
		Value2Check = control_value
	End If
		
		
	Log("CHEGOU AO TIPO DE CONTROLO")
	
	If Utils.Int2Bool(every_time_execution) Or Status = 1 Then
			
		If Utils.Int2Bool(barcode_control) Then
			TypeOfControl = 1
			GlobalScanReturn = False
			ShareCode.SingleScan = True
			ShareCode.AllowScanDuplicates = False
			CallSubDelayed2(BarcodeScanner,"StartScanningSingle", "requests3")
				
			Do While GlobalScanReturn = False
				Sleep(0)
			Loop
				
			If ShareCode.ScanList.Size > 0 Then
				Dim Code2Compare As String = ShareCode.ScanList.Get(0)
			Else
				Dim Code2Compare As String = ""
			End If
				
			If Code2Compare = Value2Check Then
				RetVal = True
			Else
				RetVal = False
			End If
		Else If Utils.Int2Bool(proximity_control) And Utils.Int2Bool(proximity_bylocation) Then
			TypeOfControl=0
			ProgressDialogShow2("Por favor Aguarde !! Determinando localização", False)
			
			Private Lat2Check As String = ""
			Private Lon2Check As String = ""
		
			Try
				Dim Loc_TC As String = DBStructures.GetScriptColumnStrEVC($"select local_tagcode from dta_requests where tagcode = '${Req.Trim}'"$,"local_tagcode")
				Dim Obj_TC As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode from dta_requests where tagcode = '${Req.Trim}'"$,"object_tagcode")
			
				Dim sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
				Dim sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
			
				If Utils.NNE(Loc_TC) Then
					Lat2Check = DBStructures.GetScriptColumnStrEVC($"select latitude from dta_locations where tagcode = '${Loc_TC}'"$,"latitude")
					Lon2Check = DBStructures.GetScriptColumnStrEVC($"select longitude from dta_locations where tagcode = '${Loc_TC}'"$,"longitude")
					If Lat2Check = "" Or Lon2Check = "" Then
						Dim Obj_Loc_TC As String = DBStructures.GetScriptColumnStrEVC($"select local_tagcode from dta_objects where tagcode = '${Obj_TC}'"$,"local_tagcode")
						If Utils.NNE("Obj_Loc_TC") Then
							Lat2Check = DBStructures.GetScriptColumnStrEVC($"select latitude from dta_locations where tagcode = '${Obj_Loc_TC}'"$,"latitude")
							Lon2Check = DBStructures.GetScriptColumnStrEVC($"select longitude from dta_locations where tagcode = '${Obj_Loc_TC}'"$,"longitude")
						End If
					End If
				Else if Utils.NNE(Obj_TC) Or Obj_TC <> "__NONE__" Then
					Dim Obj_Loc_TC As String = DBStructures.GetScriptColumnStrEVC($"select local_tagcode from dta_objects where tagcode = '${Obj_TC}'"$,"local_tagcode")
					If Utils.NNE("Obj_Loc_TC") Then
						Lat2Check = DBStructures.GetScriptColumnStrEVC($"select latitude from dta_locations where tagcode = '${Obj_Loc_TC}'"$,"latitude")
						Lon2Check = DBStructures.GetScriptColumnStrEVC($"select longitude from dta_locations where tagcode = '${Obj_Loc_TC}'"$,"longitude")
					End If
				Else
					Lat2Check = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
					Lon2Check = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
				End If
			Catch
				Lat2Check = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
				Lon2Check = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
				Log(LastException)
			End Try
		
			If Lat2Check = "" Or Lon2Check = "" Then
				Lat2Check = sACLALatitude
				Lon2Check = sACLALongitude
			End If
			
			proximity_distance = proximity_distance + 2
			Dim IsInsideGeoFence As Boolean = Utils.InsideGeoFence(Lat2Check,Lon2Check, proximity_distance)
			If IsInsideGeoFence Then
				ProgressDialogHide
				RetVal = True
			Else
				ProgressDialogHide
				RetVal = False
			End If
			
		End If
	End If
	
	Dim RSub As ReturnFromCantrolSub = Types.MakeReturnFromCantrolSub(TypeOfControl, RetVal)
	Return RSub
	
End Sub

Sub CheckTasksAdds(CLA As RequestCLA) As ResumableSub
	Dim sRec11 As String = $"SELECT DISTINCT * FROM dta_tasks_adds WHERE tagcode='${CLA.Task}'"$
	Private dRecord711 As Cursor = Starter.LocalSQLEVC.ExecQuery(sRec11)
	If (dRecord711.RowCount >= 1) Then
		dRecord711.Position = 0
		Dim paramters As String = Utils.IfNullOrEmpty(dRecord711.GetString("paramters"), "")
		If Utils.NNE(paramters) Then
			Dim parser As JSONParser
			parser.Initialize(paramters)
			Dim root As Map = parser.NextObject
			Dim report_layout_type As Int = root.Get("report_layout_type")
			Dim startchangevalue As List = root.Get("startchangevalue")
			For Each colstartchangevalue As Map In startchangevalue
											
				Dim execvaluefield As String = colstartchangevalue.Get("execvaluefield")
				Dim execvaluekey As String = colstartchangevalue.Get("execvaluekey")
				Dim execvaluetag As String = colstartchangevalue.Get("execvaluetag")
				Dim is_adds As Int = colstartchangevalue.Get("is_adds")
				Dim execvalueset As String = colstartchangevalue.Get("execvalueset")
										
				Dim ThisTagCode As String = ""
				If Utils.NNE(execvaluetag) Then
					ThisTagCode = $"and tagcode='${execvaluetag}' "$
				End If
				If Utils.NNE(execvaluefield) Then
					If is_adds = 1 Then
						Dim updSQL As String = $"update dta_requests_values_adds set ${execvaluefield.trim}='${execvalueset}'
													WHERE request_tagcode='${CLA.Request}'
													And inner_request_tagcode='${CLA.Action}'
													And task_tagcode='${CLA.Task}'
													And unique_key='${execvaluekey}' ${ThisTagCode} 
													And repeatcounter=${CLA.RepeatCounter}"$ 
					Else
						Dim updSQL As String = $"update dta_requests_values set ${execvaluefield.trim}='${execvalueset}'
													WHERE request_tagcode='${CLA.Request}'
													And inner_request_tagcode='${CLA.Action}'
													And task_tagcode='${CLA.Task}'
													And unique_key='${execvaluekey}' ${ThisTagCode} 
													And repeatcounter=${CLA.RepeatCounter}"$ 
					End If
					Utils.SaveSQLToLog("ListaPrincipal_UpdateData", updSQL, CLA.Request)
				End If
											
			Next
		End If
	End If
	
	Return True
	
End Sub

Sub CheckObjectsinCL(cla As RequestCLA, request_type As String, object_tagcode As String, object_type As String) As ResumableSub
	
	Dim ret As Boolean = False
	Private Record9 As Cursor

	' PEDRO ALPEDRINHA
	' ANALISAR O PORQUE DAS DIFERENCAS DOS SCRIPTS ENTRE CHECKLIST3 - AssociateObject e este
	If  (ShareCode.APP_DOMAIN.ToLowerCase = "gruposores") Then
		Dim sSQL As String = $"SELECT c.connectmode, c.connect2data, b.do_name, b.do_field, b.do_is_additional,
										b.task_tagcode, b.item_tagcode, b.unique_key, b.data_type, b.title
										FROM dta_requests_values AS a
										INNER JOIN dta_tasks_items AS b ON (b.task_tagcode=a.task_tagcode AND b.item_tagcode=a.item_tagcode AND b.unique_key=a.unique_key)
										INNER JOIN dta_tasks AS c ON (c.tagcode=b.task_tagcode)
										WHERE a.execute_status>=1
										AND a.request_tagcode='${cla.Request.Trim}'
										AND a.task_tagcode='${cla.Action.Trim}'
										AND a.repeatcounter='${cla.RepeatCounter}'
										AND ((b.do_name <> '' AND b.do_field <> '' AND c.connect2data <> '') or
										 (b.do_name = '__TYPEREQUEST__' AND b.do_field <> '' )) and b.task_tagcode=a.task_tagcode"$
	Else
		Dim sSQL As String = $"SELECT b.connectmode, b.connect2data, a.do_name, a.do_field, a.do_is_additional,
										a.task_tagcode, a.item_tagcode, a.unique_key, a.data_type, a.title
										FROM dta_tasks_items AS a
										INNER JOIN dta_tasks AS b ON (b.tagcode=a.task_tagcode)
										WHERE  ((a.do_name <> '' AND a.do_field <> '' AND b.connect2data <> '') or
										 (a.do_name = '__TYPEREQUEST__' AND a.do_field <> '' )) and a.task_tagcode='${cla.Action.trim}'"$
	End If
										 
	Record9 = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If Record9.RowCount > 0 Then
		For ni = 0 To Record9.RowCount-1
			Record9.Position = ni
			Dim connect2data As String = Record9.GetString("connect2data")
			Dim do_name As String = Record9.GetString("do_name")
			Dim do_field As String = Record9.GetString("do_field")
			Dim do_is_additional As Int = Record9.GetInt("do_is_additional")
			Dim task_tagcode As String = Record9.GetString("task_tagcode")
			Dim item_tagcode As String = Record9.GetString("item_tagcode")
			Dim unique_key As String = Record9.GetString("unique_key")

			If (do_name.ToUpperCase = "__TYPEREQUEST__") Then
				'VERIFICA SE OS CAMPOS FORAM LANÇADOS
				If (cla.Request.StartsWith("IE_")) Then
					Dim insSQL As String = $"insert into dta_requests_fields (id, request_tagcode, field_tagcode)
														Select id, '${cla.Request}' as request_tagcode, field_tagcode 
														from dta_typerequests_fields where typerequest_tagcode='${request_type}' 
														And '${cla.Request}'||field_tagcode not in 
															(Select '${cla.Request}'||field_tagcode as campo 
															from dta_requests_fields
															where request_tagcode='${cla.Request}')"$
					'Starter.LocalSQLEVC.ExecNonQuery(insSQL)
					Utils.SaveSQLToLog("CriaCamposAdicionais",insSQL, cla.Request)
					Dim params As Map
					params.Initialize
					params.Clear
					params.Put("_token", ShareCode.APP_TOKEN)
					params.Put("_user",ShareCode.SESS_User)
					params.Put("ACLARequest", cla.Request)
					params.Put("ACLARequestType", request_type)
					params.Put("versionTagcode", Main.VersionTagcode)
					params.Put("_authorization", Main.DeviceAuthorization)
					params.Put("_instance", Main.DeviceInstance)
					params.put("_deviceBrand", Main.DeviceBrand)
					params.put("_deviceModel", Main.DeviceModel)
					params.put("_deviceMacAddress", Main.DeviceMacAddress)
					Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla-fields/create"$
					If Not(ShareCode.APP_WORKING_LOCAL) Then
						Utils.CallApi(0, params, Me, Url, "", cla.Request)
					Else
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,cla.Request.Trim,cla.Action.Trim,"")
						Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
					End If
					Sleep(500)
				End If
												 				
				' ERRO : ESTAVA request_type em vez de tagcode no request_tagcode
				Dim ObjSQL As String = $"select distinct value from dta_requests_fields where request_tagcode='${cla.Request}' and field_tagcode='${do_field}'"$
				Private Record99 As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjSQL)
				If Record99.RowCount > 0 Then
					For nii = 0 To Record99.RowCount-1
						Record99.Position = nii
						Dim val As String = Utils.IfNullOrEmpty(Record99.GetString("value"), "")
						Dim NewSQL As String = $"update dta_requests_values set execute_status=1, execute_value='${val}'
															where request_tagcode='${cla.Request}' 
															and inner_request_tagcode='${cla.Action}'
															and task_tagcode='${cla.Task}'
															and item_tagcode='${item_tagcode}'
															and repeatcounter=${cla.RepeatCounter} "$
						'And unique_key='${unique_key}'
						Try
							Starter.LocalSQLEVC.ExecNonQuery(NewSQL)
						Catch
							Log($"Erro de campo: ${LastException}"$)
						End Try
														
						Dim params As Map
						params.Initialize
						params.Clear
						params.Put("_token", ShareCode.APP_TOKEN)
						params.Put("ACLARequest", cla.Request)
						params.Put("ACLAAction", cla.Action)
						params.Put("ACLATask", cla.Task)
						params.Put("ACLAItem",item_tagcode)
						params.Put("ACLAUniqueKey", unique_key)
'														params.Put("ACLATagcode", tagcode)
						params.Put("ACLAValue", val)
						params.Put("ACLAReqCounter", cla.RepeatCounter)
						params.Put("ACLARepeatItem", 0)
						params.Put("ACLARepeatField", 0)
						params.Put("ACLAInner", 0)
						params.Put("versionTagcode", Main.VersionTagcode)
						params.Put("_authorization", Main.DeviceAuthorization)
						params.Put("_instance", Main.DeviceInstance)
						params.put("_deviceBrand", Main.DeviceBrand)
						params.put("_deviceModel", Main.DeviceModel)
						params.put("_deviceMacAddress", Main.DeviceMacAddress)
						params.Put("_user", ShareCode.SESS_User)
						Dim sACLADatetime As String = Utils.GetCurrDatetime
						Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
						Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

						params.Put("ACLADatetime", sACLADatetime)
						params.Put("ACLALatitude", sACLALatitude)
						params.Put("ACLALongitude", sACLALongitude)
						Dim ACLSessUser As String = ShareCode.SESS_OPER_User
			
						params.Put("ACLSessUser", ACLSessUser)
						params.Put("ACLClear", 0)
					
						Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/update"$
						If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
							If Not(ShareCode.APP_WORKING_LOCAL) Then
								Utils.CallApi(0, params, Me, Url, "", cla.Request)
							Else
								Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,cla.Request.Trim,cla.Action.Trim,"")
								Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
							End If
							Sleep(250)
						Else
							Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,cla.Request.Trim,cla.Action.Trim,"")
							Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
						End If'
						Sleep(100)
					Next
				End If
				Record99.Close
			Else
				' ******************************************************************
				' CHECK: CAMPOS RELACIONADOS COM O OBJECTO SELECIONADO / IDENTIFICADO
				' COMPARAR E VALIDAR SE O DO_NAME É IGUAL AO TIPO DE OBJECTO
				' "object_type"
				' ******************************************************************
												
				If (do_name = object_type) Then
					If (do_is_additional = 1) Then
						Dim ObjSQL As String = $"select distinct `value` from dta_objects_fields where object_tagcode='${object_tagcode}'
																		and field_tagcode='${do_field}'"$
					Else
						If Utils.FieldInList(do_field, "address|address2|postalcode|phone|local|latitude|longitude|block|floor|door") Then
							Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_locations where tagcode in
																	(select local_tagcode from dta_objects where tagcode='${object_tagcode}')"$
						Else If Utils.FieldInList(do_field, "name|phone|email|mobile") Then
							Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_contacts where tagcode in
															(select contact_tagcode from dta_objects_contacts where object_tagcode='${object_tagcode}' limit 1)"$
						Else
							Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_objects where tagcode='${object_tagcode}'"$
						End If
													
						Log(ObjSQL)
					End If
					Private Record99 As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjSQL)
					If Record99.RowCount > 0 Then
						For nii = 0 To Record99.RowCount-1
							Record99.Position = nii
							Dim val As String = Utils.IfNullOrEmpty(Record99.GetString("value"), "")
							Dim NewSQL As String = $"update dta_requests_values set execute_status=1, execute_value='${val}',
															object_tagcode='${object_tagcode}'
															where request_tagcode='${cla.Request}' 
															and inner_request_tagcode='${cla.Action}'
															and task_tagcode='${task_tagcode}'
															and item_tagcode='${item_tagcode}'
															and unique_key='${unique_key}'
															and repeatcounter=${cla.RepeatCounter} "$
							Log(NewSQL)
							Try
								Utils.SaveSQLToLog("ListaPrincipal_ItemClick",NewSQL, cla.Request)
								'Starter.LocalSQLEVC.ExecNonQuery(NewSQL)
							Catch
								Log($"Erro de campo: ${LastException}"$)
							End Try
						Next
					End If
					Record99.Close
				End If

			End If
									
		Next
	End If
	Record9.Close
	ret = True
	Return ret
	
End Sub