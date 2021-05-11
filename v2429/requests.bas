B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region


Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private FocusedMarker, Marker1 As Marker
	Private MarkMyPosition As BalloonMarker
	Public Device As Phone
	
	'	we'll use the new BalloonMarker object for Marker4
	
	Private MapCenter As GeoPoint
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
	Private MapViewArea As MapView
	Private TileSourceSpinner As Spinner
	Private MarkersBallons As MarkersBalloonOverlay
	
	Private IsFiltered As Boolean = False
	Private FilterStartDate As String
	Private FilterEndDate As String
	Private FilterTasks As Int = 0
	Private FilterEntity As Int = 0
	Private FilterStates As Int = -1
	Private Bloco30 As Int = 0
	
	Private ListStates As List
	Private ListEntities As List
	Private ListTasks As List
	
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
	Private mapData As Panel
	Private mapZoomDown As Button
	Private mapZoomUp As Button
	Private listRequests As ExpandedListView ' CustomListViewCollapse
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
	Private Pages As List = Array(True, False, True, True)
	Private listRequestsItem As ExpandedListView
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
	
	Private VIEW_requests_listview As String = "requests_listview"
	Private VIEW_requests_listviewrequest As String = "requests_listviewrequest"
	Private VIEW_requests_mapview As String = "requests_mapview"
	
End Sub

'
'MakeRequestCLA(Request As String, Task As String, Item As String, UniqueKey As String, Answer As String, Value As String) As RequestCLA
'MakeRequestCLAItem(Request As String, Task As String, Item As String, UniqueKey As String, Answer As String, Value As String, Origin as Int) As RequestCLAItem

Sub Activity_Create(FirstTime As Boolean)
	ListStates.Initialize
	ListEntities.Initialize
	ListTasks.Initialize
	
	Dim userPage As String = "requestslayout"
	If (ShareCode.ISPHONE) Then
		userPage  = "requestslayout_device"
		VIEW_requests_listview = $"${VIEW_requests_listview}_device"$
		VIEW_requests_listviewrequest = $"${VIEW_requests_listviewrequest}_device"$
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	
	
	'prvd.Initialize
	Activity.LoadLayout(userPage)
	listsTabPanel.LoadLayout(VIEW_requests_listview, "Listagem")
	listsTabPanel.LoadLayout(VIEW_requests_listviewrequest, "Intervenção")
	If Not(ShareCode.ISPHONE) Then
		listsTabPanel.LoadLayout(VIEW_requests_mapview, "Mapa")
	End If
	'listsTabPanel.LoadLayout("requests_calendarview", "Agenda")
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		If Not(ShareCode.ISPHONE) Then
			lbl.Width = 33.33%x '25%x '33.33%x
		Else
			lbl.Width = 50%x '25%x '33.33%x
		End If
	Next
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
	Bloco30 = Activity.Width / 3
	
	If Not(ShareCode.ISPHONE) Then
		Markers.Initialize
		Dim p As Panel = listsRequestsMap.AsView
		p.Width = Bloco30
		MapViewArea.Initialize("")
		mapData.AddView(MapViewArea, 0, 0, 100%x, 100%y)
		MapViewArea.SetMultiTouchEnabled(True)
		MapViewArea.SetZoomEnabled(True)
		MarkersBallons.Initialize(MapViewArea, "MarkersBallonsRequests", "balloon_overlay")
		MapViewArea.AddOverlay(MarkersBallons)
		MapFirstTime = FirstTime
		Icon.Initialize(LoadBitmap(File.DirAssets, "my_icon_blue.png"))
	
		MarkMyPosition.Initialize(ShareCode.SESS_UserName, "", LocationService.GeoLocal.lat, LocationService.GeoLocal.lon, Icon)
		MarkMyPosition.LayoutName="custom_balloon_overlay"
		Markers.Add( MarkMyPosition )
	End If
	
	If FirstTime Then
		'
	End If
	
	ListStates = DBStructures.GetListOfFrom("type_requestsstatus", "title")
	Dim where As String = $"select distinct tagcode from requests where request_date='${ShareCode.CURRENT_APPDATE}'"$
	ReqRequests = DBStructures.GetListOfFromScript("tagcode", where)
	Dim s As String = Utils.StrList2SQLArray(ReqRequests)
	Dim sSQL As String = $"select distinct c.tagcode, c.name from requests As a inner join Objects As c on (c.tagcode in (Select requester_tagcode from requests_tasks)) where a.tagcode in ${s}"$
	ListEntities = DBStructures.GetListOfFromScriptCNL("tagcode", "name", sSQL)
	Dim sSQL As String = $"select distinct e.tagcode, e.name from requests as a inner join Tasks As e on (e.tagcode in (Select task_tagcode from requests_tasks)) where a.tagcode in ${s}"$
	ListTasks = DBStructures.GetListOfFromScriptCNL("tagcode", "name", sSQL)
	Dim where As String = $"select distinct tagcode from requests where request_date<>'${ShareCode.CURRENT_APPDATE}' and tagcode not in ${s}"$
	ReqRequestsNotToday = DBStructures.GetListOfFromScript("tagcode", where)
	RequestsOptionsPopMenu.Initialize(Activity, Me, LabelButtonTitleAction, Consts.ColorMain, Colors.White, Consts.ColorSub, True, False)
	RequestsOptionsPopMenu.AddMenuItem("Expandir tudo", "ExpandeAllPopMenu")
	RequestsOptionsPopMenu.AddMenuItem("Recolher tudo", "CollapseAllPopMenu")
	UpdateMainLayout
	UpdateTabPages
End Sub

Sub TabPageState(pageIndex As Int, pageState As Boolean)
	Pages.Set(pageIndex, pageState)
	UpdateTabPages
End Sub

Sub UpdateTabPages
	Dim lst As List = Utils.GetAllTabLabels(listsTabPanel)
	For n = 0 To lst.Size-1
		Dim lbl As Label = lst.Get(n)
		If (Pages.Get(n) = True) Then
			lbl.TextColor = Colors.White
		Else
			lbl.TextColor = Colors.ARGB(255,200,0,0)
		End If
	Next
End Sub

Sub listsTabPanel_PageSelected (Position As Int)
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
	listsTabPanel.ScrollTo(FixedPosition, True)
	If Not(CurrentPage = 1) Then
		TabPageState(1, False)
	End If
End Sub

Sub UpdateMainLayout
	mainLabelOptLists.TextColor = Consts.ColorMain
	If Not(ShareCode.ISPHONE) Then
		mainLogo.Gravity = Gravity.FILL
		mainLogo.Width = Consts.LogoWidth
	End If
	mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO))
	Dim gc As GradientDrawable
	gc.Initialize("TOP_BOTTOM", Array As Int(Consts.ColorMain, Consts.ColorSub))
	ColorTabPanel.Background = gc
	Dim jo As JavaObject = listsTabPanel
	jo = jo.GetField("tabStrip")
	'now you can set the properties
	jo.RunMethod("setIndicatorColor", Array(Consts.ColorMain))
End Sub

Sub MarkersBallonsRequests_BalloonClick(ViewTag As String)
	Log("The Balloon View with Tag of '"&ViewTag&"' was Clicked")
'	FocusedMarker=MarkersBallonsEnt.FocusedMarker
'	Select ViewTag
'		Case "MyDescriptionTag"
'			Log("Do something")
'		Case "MoreInfoTag"
'			Log("Show more information for FocusedMarker")
'	End Select
End Sub

Sub MarkersBallonsRequests_BalloonLongClick(ViewTag As String)
	Log("The Balloon View with Tag of '"&ViewTag&"' was LongClicked")
End Sub

Sub StartRequestActivity(Clear As Boolean, Filter As String)
	
	ProgressDialogShow("A ler dados ... ")
	If (Starter.RequestKeepFilter = True) Then
'		Starter.RequestKeepFilter = False
'		If (Starter.RequestSearchFilter <> "") Then
'			Dim sFilter As String = Starter.RequestSearchFilter
'			Starter.RequestSearchFilter = ""
'			Starter.RequestFilters = Types.MakeRequestFilters(ShareCode.OBJ_DefaultType, ShareCode.OBJ_DefaultZone, 0, 0, 0, "", "", 0)
'			StartObjectsActivity(True, sFilter)
'		Else
'			Dim tFilter As RequestFilters = Starter.RequestFilters
'			'Starter.RequestFilters = Types.MakeRequestFilters(ShareCode.OBJ_DefaultType, ShareCode.OBJ_DefaultZone, 0, 0, 0, "", "", 0)
'			Starter.RequestSearchFilter = ""
'			SetTheFilters(tFilter)
'		End If
	Else
		If Clear Then
			listRequests.Clear
			If Not(ShareCode.ISPHONE) Then
				listsRequestsMap.Clear
				Markers.Clear
				MarkersBallons.RemoveMarkers
				Markers.Add( MarkMyPosition )
			End If
		End If
		
		Private Row As Int = 0
		Private Record As Cursor
		ItemsCounter = 0
		Dim sSQL As String = DBStructures.SQL_GETREQUESTS_DATA_NEW
		If (Filter <> "") Then
			sSQL = $"${sSQL} ${Filter}"$
		Else
			sSQL = $"${sSQL} and ((a.request_date>='${ShareCode.APPDATE_STARTRANGE}') and (a.request_date<='${ShareCode.APPDATE_ENDRANGE}'))"$			
		End If
		sSQL = $"${sSQL} order by a.id"$
		Log(sSQL)
		
		
'		Private Row As Int = 0
'		Private Record As Cursor
'		Dim ItemsCounter As Int = 0
'		Dim sSQL As String = $"${DBStructures.SQL_GETREQUESTS_DATA_NEW} order by a.id"$


		
		Record = Starter.LocalSQL.ExecQuery(sSQL)
		CurrentLineItem = 0
		TotalLineItems = Record.RowCount
		Log(Record.RowCount)
		Dim n As Int = 0
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim status_id As Int = Record.GetInt("status_id")
				Dim status_color As String = Record.GetString("status_color")

				Dim bd As BitmapDrawable
				bd.Initialize(Utils.CreateMapIcon(ItemsCounter, status_color))

				'n = n + CreateRequestItem(ItemsCounter, Record, listRequests.AsView.Width, 70dip, bd)
				ItemsCounter = CreateRequestItem(ItemsCounter, Record, listRequests.AsView.Width, 90dip, bd)
				If Not(ShareCode.ISPHONE) Then
					If (status_id < 5) Then
						listsRequestsMap.Add( CreateRequestItemMap(ItemsCounter, Record, 0, listsRequestsMap.AsView.Width, 70dip), "") ', 70dip, "" )
					End If
				End If
				ItemsCounter = ItemsCounter + 1
				
			Next
		End If
		Log($"DEVOLVE:${n}"$)
		Record.Close
		Log(ItemsCounter)

		If Not(ShareCode.ISPHONE) Then
			MarkersBallons.AddMarkers(Markers)
			If MapFirstTime Then
				TileSource="Mapnik"
				'	fit the MapView to the MarkersBalloonOverlay
				MapViewArea.FitMapToBoundingBox(MarkersBallons.GetBoundingBox)
				If Not(ShareCode.ISPHONE) Then
					MarkersBallons.FocusedMarker = MarkMyPosition
				End If
			Else
				'	restore saved zoom level and map center
				MapViewArea.Zoom=ZoomLevel
				MapViewArea.SetCenter3(MapCenter)
				If FocusedMarker<>Null Then
					MarkersBallons.FocusedMarker = FocusedMarker
				End If
			End If
		End If
		WindowStatusUpdate
	End If
	ProgressDialogHide
End Sub

Sub CreateRequestItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable) As Int
	Dim ret As Int = 0
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 90dip
	id.ExpandedHeight = 90dip
	Dim Height As Int = 65dip
	
	Dim inVIEW_requests_listgroupview As String = "requests_listgroupview"
	If (ShareCode.ISPHONE) Then
		inVIEW_requests_listgroupview = "requests_listgroupview_device"
		id.CollapsedHeight = 172.5dip '345dip
		id.ExpandedHeight = 172.5dip '345dip
		Height  = 162.5dip '325dip
	End If
	
	Dim tagcode As String = colitems.GetString("tagcode")  'SQL_GETREQUESTS_DATA_TASKS
	'Dim sSQL As String = $"${DBStructures.SQL_GETREQUESTS_DATA_TASKS} and a.level=0 and a.request_tagcode='${tagcode}' order by a.position"$
	
	Dim sSQL1 As String = $"${DBStructures.SQL_GETREQUESTS_DATA_TASKS} and a.level=0 and a.request_tagcode='${tagcode}'"$
	Dim sSQL2 As String = $"${DBStructures.SQL_GETREQUESTS_DATA_TASKSGRIDS} and a.request_tagcode='${tagcode}' and a.action_tagcode='${tagcode}'"$
	Dim sSQL As String = $"select * from (${sSQL1} UNION ${sSQL2}) order by request_stime, position, id"$
	
	
	Private ReqDetails As Cursor
	ReqDetails = Starter.LocalSQL.ExecQuery(sSQL)
	If ReqDetails.RowCount > 0 Then
		id.ExpandedHeight = id.ExpandedHeight + (Height * ReqDetails.RowCount)
		Dim RequestLine As B4XView = CreateChapter(colitems, inVIEW_requests_listgroupview, True, id, cnt, Width, False, bd)
		Dim Top As Int = 0
		For i=0 To ReqDetails.RowCount-1
			ReqDetails.Position = i
'			If (ReqDetails.GetInt("type") = 1) Then
'				'pnlGroupData.AddView(CreateRequestItemLevel(cnt, ReqDetails, Width, Height, bd), 0, Top, 100%x, Height)
'				Dim NewCollapse As B4XView = CreateRequestItemLevel(cnt, ReqDetails, Width, Height, bd)
'				RequestLine.Height = RequestLine.Height + pnlGroupData.Height + 300dip
'				Dim pnl As B4XView = pnlGroupDataList.Parent
'				'pnl.Height = pnl.Height + NewCollapse.Height
'				pnlGroupData.Height = pnlGroupData.Height + 300dip
'				pnlGroupDataList.Add(NewCollapse, id)
'				cnt = cnt + 1
'			Else
			If (ReqDetails.GetInt("type") = 2) Then
				pnlGroupData.AddView(CreateRequestItemLineAction(cnt, ReqDetails, 0, Width, Height, "pnlGroupDataItemInner"), 0, Top, 100%x, Height)
			Else
				pnlGroupData.AddView(CreateRequestItemLine(cnt, ReqDetails, 0, Width, Height, "pnlGroupDataItem"), 0, Top, 100%x, Height)
			End If

				'pnlGroupDataList.Add(CreateRequestItemLine(cnt, ReqDetails, 0, Width, Height), id)
				
'			End If
			Top = (i+1) * Height
		Next
		listRequests.Add(RequestLine, id)
		ret = cnt 'ret +1
	End If
	ReqDetails.Close
	Return ret
End Sub

'Sub CreateChapter(colitems As Cursor, id As ItemData, idx As Int, width As Int, Expanded As Boolean, bd As BitmapDrawable) As B4XView
Sub CreateChapter(colitems As Cursor, layout As String, pinMap As Boolean, id As ItemData, idx As Int, _
	Width As Int, Expanded As Boolean, bd As BitmapDrawable) As B4XView

	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, Width, id.ExpandedHeight) 
	p.LoadLayout(layout)
	'
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)

	
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim rq_etime As String = colitems.GetString("request_etime")
	Dim rq_date As String = colitems.GetString("request_date")
	Dim rq_stime As String = colitems.GetString("request_stime")
	Dim rq_number As String = colitems.GetString("tagcode")
	Dim contact_name As String = colitems.GetString("contact_name")
	Dim contact_phone As String = colitems.GetString("contact_phone")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim name As String = colitems.GetString("name")
	Dim request_desc As String = colitems.GetString("request_desc")
	Dim entity As String = colitems.GetString("requester_tagcode")
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

	ListItemReference.text = rq_number
	ListItemReference.tag = rq_number
	ListItemDatetime.text = $"${rq_date}, ${rq_stime} (${rq_etime})"$
	ListItemFullName.text = $"${name}"$
	ListItemFullName.tag = $"${entity}"$
	ListItemContact.text = $"${cnt}"$
	ListItemStatus.text = $"${status_desc}"$
	ListItemType.Text = $"${request_desc}"$
	
	listButMap.Enabled = (status_id < 5)
		
	If (status_id = 1) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorGreen
		If (ReqRequests.IndexOf(tagcode) >= 0) Then
			ListItemTodayRequests.Text = Chr(0xF017)
		End If
	Else If (status_id = 2) Then
		ListItemTodayRequests.Text = Chr(0xF2BE)
		ListItemTodayRequests.TextColor = Consts.ColorOrange
	Else If (status_id = 3) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorBlue
	else if (status_id = 4) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorRed
	Else If (status_id = 5) Then
		ListItemTodayRequests.Text = Chr(0xF088)
		ListItemTodayRequests.TextColor = Consts.ColorGray
	End If

	If Not(ShareCode.ISPHONE) Then
		If (pinMap) Then
			If ((status_id < 5) And ((latitude <>"") And (longitude <> ""))) Then
				Marker1.Initialize4(rq_number, name, $"${name}, ${cnt}"$, latitude, longitude, bd)
				Markers.Add(Marker1)
			End If
			listButMap.Tag = Types.MakeRequestData(tagcode, entity, latitude, longitude)
		Else
			listButMap.Visible = False
		End If
	Else
		listButMap.Visible = False
	End If 
	ClickLabel.Tag = idx
	pnlGroupTitle.Tag = idx
	p.Tag = Expanded 'collapsed
	
	Return p
End Sub

'CreateRequestItemLevel(1, ReqDetails, Width, Height, bd), 0, Top, 100%x, Height)
Sub CreateRequestItemLevel(cnt As Int, colitems As RequestCLA, Width As Int, Height As Int, bd As BitmapDrawable) As Int 'B4XView
'	Dim p As Panel
'	p.Initialize("")
'	Activity.AddView(p, 0, 0, Width, Height)
'	p.RemoveView
'	
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 90dip
	id.ExpandedHeight = 90dip
	Dim Height As Int = 65dip
	
	Dim inVIEW_requests_listgroupview_inner As String = "requests_listgroupview_inner"
	If (ShareCode.ISPHONE) Then
		inVIEW_requests_listgroupview_inner = "requests_listgroupview_inner_device"
		id.CollapsedHeight = 172.5dip '345dip
		id.ExpandedHeight = 172.5dip '345dip
		Height  = 162.5dip '325dip
	End If
	listRequestsItem.Clear
	Dim ret As Int = 0
	Dim tagcode As String = colitems.Action  'SQL_GETREQUESTS_DATA_TASKS
	Dim reqtagcode As String = colitems.Request
	Dim sSQL1 As String = $"${DBStructures.SQL_GETREQUESTS_DATA_TASKS} and a.level=1 and a.parent_action='${tagcode}'"$
	Dim sSQL2 As String = $"${DBStructures.SQL_GETREQUESTS_DATA_TASKSGRIDS} and a.request_tagcode='${reqtagcode}' and a.action_tagcode='${tagcode}'"$
	Dim sSQL As String = $"select * from (${sSQL1} UNION ${sSQL2}) order by request_stime, position, id"$
	Private ReqDetails2 As Cursor
	ReqDetails2 = Starter.LocalSQL.ExecQuery(sSQL)
	If ReqDetails2.RowCount > 0 Then
		' TESTA SE É ACÇÕES
		ReqDetails2.Position = 0
		If (ReqDetails2.GetInt("type") = 2) Then
			Height = 65dip
		End If
		id.ExpandedHeight = id.ExpandedHeight + (Height * ReqDetails2.RowCount)
		Dim RequestLine As B4XView = CreateChapterInner(colitems, inVIEW_requests_listgroupview_inner, False, id, cnt, Width, False, bd)
		
		Dim Top As Int = 0
'		For i=0 To ReqDetails2.RowCount-1
'			ReqDetails2.Position = i
'			If (ReqDetails2.GetInt("type") = 2) Then
'				pnlGroupDataSub.AddView(CreateRequestItemLineAction(cnt, ReqDetails2, 0, Width, Height, "pnlGroupDataItemInner"), 0, Top, 100%x, Height)
'			Else
'				pnlGroupDataSub.AddView(CreateRequestItemLine(cnt, ReqDetails2, 0, Width, Height, "pnlGroupDataItemInner"), 0, Top, 100%x, Height)
'			End If
'			Top = (i+1) * Height
'		Next
		
		listRequestsItem.Add(RequestLine, "")
		'listRequestsItem.ExpandItem(0)
		'p.AddView(RequestLine, 0, Top, 100%x, id.ExpandedHeight) 'Height)
		ret = ret +1
	End If
	ReqDetails2.Close
	Return ret
End Sub

Sub CreateChapterInner(incolitems As RequestCLA, layout As String, pinMap As Boolean, id As ItemData, idx As Int, _
	Width As Int, Expanded As Boolean, bd As BitmapDrawable) As B4XView

	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, Width, id.ExpandedHeight) 
	p.LoadLayout(layout)
	'p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	
	Dim sSQL As String = DBStructures.SQL_GETREQUESTS_DATA_TASKS
	sSQL = $"${sSQL} and a.request_tagcode='${incolitems.Request}' and a.action_tagcode='${incolitems.Action}'"$
	
	Private colitems As Cursor
	colitems = Starter.LocalSQL.ExecQuery(sSQL)
	colitems.Position = 0
	
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim rq_etime As String = colitems.GetString("request_etime")
	Dim rq_date As String = colitems.GetString("request_date")
	Dim rq_stime As String = colitems.GetString("request_stime")
	Dim rq_number As String = colitems.GetString("tagcode")
	Dim contact_name As String = colitems.GetString("contact_name")
	Dim contact_phone As String = colitems.GetString("contact_phone")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim name As String = colitems.GetString("name")
	Dim request_desc As String = colitems.GetString("task_name")
	Dim entity As String = colitems.GetString("requester_tagcode")
	
	colitems.Close
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

	ListItemReference.text = rq_number
	ListItemReference.tag = rq_number
	ListItemDatetime.text = $"${rq_date}, ${rq_stime} (${rq_etime})"$
	ListItemFullName.text = $"${name}"$
	ListItemFullName.tag = $"${entity}"$
	ListItemContact.text = $"${cnt}"$
	ListItemStatus.text = $"${status_desc}"$
	ListItemType.Text = $"${request_desc}"$

	listButMap.Enabled = (status_id < 5)
		
	If (status_id = 1) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorGreen
		If (ReqRequests.IndexOf(tagcode) >= 0) Then
			ListItemTodayRequests.Text = Chr(0xF017)
		End If
	Else If (status_id = 2) Then
		ListItemTodayRequests.Text = Chr(0xF2BE)
		ListItemTodayRequests.TextColor = Consts.ColorOrange
	Else If (status_id = 3) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorBlue
	else if (status_id = 4) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorRed
	Else If (status_id = 5) Then
		ListItemTodayRequests.Text = Chr(0xF088)
		ListItemTodayRequests.TextColor = Consts.ColorGray
	End If

	If Not(ShareCode.ISPHONE) Then
		If (pinMap) Then
			If ((status_id < 5) And ((latitude <>"") And (longitude <> ""))) Then
				Marker1.Initialize4(rq_number, name, $"${name}, ${cnt}"$, latitude, longitude, bd)
				Markers.Add(Marker1)
			End If
			listButMap.Tag = Types.MakeRequestData(tagcode, entity, latitude, longitude)
		Else
			listButMap.Visible = False
		End If
	Else
		listButMap.Visible = False
	End If
	ClickLabel.Tag = idx
	pnlGroupTitle.Tag = idx
	p.Tag = Expanded 'collapsed
	Return p
End Sub

Sub CreateRequestItemLine(cnt As Int, colitems As Cursor, Top As Int, Width As Int, Height As Int, mcall As String) As Panel
	
	Dim inVIEW_requests_listitemview As String = "requests_listitemview"
	If (ShareCode.ISPHONE) Then
		inVIEW_requests_listitemview = "requests_listitemview_device"
	End If
	
	Dim p As Panel
	p.Initialize(mcall)
	Activity.AddView(p, 0, Top, Width, Height)
	p.LoadLayout(inVIEW_requests_listitemview)
	'requests_listitemview_action
	p.RemoveView
	
	Dim ID As Int = colitems.GetInt("id")
	Dim actionstatus_id As Int = colitems.GetInt("status_id")
	Dim tasktype As Int = colitems.GetInt("type")
	Dim title As String = colitems.GetString("status_desc")
'	Dim run_start As String = colitems.GetString("run_start")
'	Dim run_end As String = colitems.GetString("run_end")
	Dim request_stime As String = colitems.GetString("request_stime")
	Dim request_etime As String = colitems.GetString("request_etime")
	
	Dim objectdesc As String = colitems.GetString("name")
	Dim taskdesc As String = colitems.GetString("task_name")
	Dim task As String = colitems.GetString("task_tagcode")
	Dim objecttagcode As String = colitems.GetString("requester_tagcode")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim actionkey As String = colitems.GetString("action_tagcode")
	Dim Position As Int = colitems.GetInt("position")
	
	ListItemObjectNumber.Text = $"${Position}"$
	ListItemObject.text = objectdesc
	ListItemObjectTask.text = taskdesc
	ListItemObjectStatus.text = $"${title}"$
	Dim Runner As String = ""
'	If Not(Utils.isNullOrEmpty(run_start)) Then Runner = $"${run_start}"$
'	If Not(Utils.isNullOrEmpty(run_end)) Then Runner = $"${Runner} (${run_end})"$
	If Not(Utils.isNullOrEmpty(request_stime)) Then Runner = $"${request_stime}"$
	If Not(Utils.isNullOrEmpty(request_etime)) Then Runner = $"${Runner} (${request_etime})"$
	ListItemObjectDateTime.Text = Runner
	'ListItemObjectExecution.text = Runner
	'actionkey
	ListItemObjectReference.Text = $"${actionkey}"$
	
	listButObjectAction.Tag = $"${tagcode}|${actionkey}|${objecttagcode}|${task}"$
	Log(listButObjectAction.Tag)
	Dim CLA As RequestCLA = Types.MakeRequestCLA(tagcode, actionkey, task, tasktype, Types.MakeInterv(ID, tagcode, actionstatus_id, Utils.ColorInt(actionstatus_id)))
	Log(CLA)
	
	If (actionstatus_id=2) Then
		ListItemObjectStatusIcon.TextColor = Consts.ColorOrange
		ListItemObjectStatusIcon.Text = Chr(0xF0E7)
	Else if (actionstatus_id=3) Then
		ListItemObjectStatusIcon.TextColor = Consts.ColorGreen
	else If (actionstatus_id=4) Then
		ListItemObjectStatusIcon.TextColor = Consts.ColorRed
		ListItemObjectStatusIcon.Text = Chr(0xF00D)
	End If
	
	p.Tag = CLA
	
	'p.Color = Colors.ARGB(255, 220,220,220)
	Return p
End Sub

Sub CreateRequestItemLineAction(cnt As Int, colitems As Cursor, Top As Int, Width As Int, Height As Int, mcall As String) As Panel
	Dim p As Panel
	p.Initialize(mcall)
	
	Activity.AddView(p, 0, Top, Width, Height)
	
	
	Dim inVIEW_CLA_ITEM_GridListRequest2 As String = "CLA_ITEM_GridListRequest2"
	If (ShareCode.ISPHONE) Then
		inVIEW_CLA_ITEM_GridListRequest2 = "CLA_ITEM_GridListRequest2_device"
	End If
	p.LoadLayout(inVIEW_CLA_ITEM_GridListRequest2)
	
	'CLA_ITEM_GridListRequest2_device
	'CLA_ITEM_GridListRequest
	'requests_listitemview_action
	p.RemoveView
	
'	Private CLAButtonOptions As Button
'	Private CLAItem_G1 As Label
'	Private CLAItemButton_1 As B4XStateButton
'	Private CLAItemButton_2 As B4XStateButton
'	Private CLAItem_G2 As Label
'	Private CLAItem_G3 As Label
'	Private CLAItem_G4 As Label
'	Private CLAItem_G5 As Label
'	Private CLAItem_G6 As Label
'	Private CLAItem_G7 As Label
'	
	ListItemObjectStatusIcon.Text = Chr(0xF088)  'Not Answered
	ListItemObjectStatusIcon.TextColor = Consts.ColorGray
	'OK Chr(0xF087)
'	'
'	
'	'p.Tag = ItemTagcode
'			
'	Dim Tagcode As String = Record.GetString("tagcode")
'			
'	Dim sValue As String = Utils.IfNullOrEmpty(Record.GetString("val_title"), "")
'	If (sValue <> "") Then
'		Dim Columns As List = Regex.Split("\|", sValue )
''				CLAItem_G1.Text = Columns.Get(0)
''				CLAItem_G2.Text = Columns.Get(1)
''				CLAItem_G3.Text = Columns.Get(2)
''				CLAItem_G4.Text = Columns.Get(3)
''				CLAItem_G5.Text = Columns.Get(4)
''				CLAItem_G6.Text = Columns.Get(5)
''				CLAItem_G7.Text = Columns.Get(6)
'		CLAItem_G1.Text = Utils.IfNullOrEmpty(Record.GetString("request_stime"), "")
'		CLAItem_G2.Text = Utils.IfNullOrEmpty(Record.GetString("request_text"), "")
'		CLAItem_G3.Text = Columns.Get(0)
'		CLAItem_G4.Text = Columns.Get(1)
'		CLAItem_G5.Text = Columns.Get(2)
'		CLAItem_G6.Text = Columns.Get(3)
'		CLAItem_G7.Text = Columns.Get(4)
'	End If
'			
'	Private Record2 As Cursor
'	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
'	Record2 = Starter.LocalSQL.ExecQuery($"${DBStructures.SQL_GET_TASK_ITEM_VALUE_GRID} ${sSQL}"$)
'	If Record2.RowCount > 0 Then
'		Record2.Position = 0
'		Dim Status As Int = Record2.GetInt("status")
'		If (Status = 1) Then
'			CLAItemButton_2.State = 1
'			'CLAItemButton_1.State = 1
'		Else If (Status = 2) Then
'			'CLAItemButton_2.State = 1
'			CLAItemButton_1.State = 1
'		End If
'		
''				For Row = 0 To Record.RowCount-1
''					Record.Position = Row
''					Ret.Add(Record.GetInt("status"))
''				Next
'	End If
'	Record2.Close
	
	
	Dim ID As Int = colitems.GetInt("id")
	Dim actionstatus_id As Int = colitems.GetInt("status_id")
	Dim tasktype As Int = colitems.GetInt("type")
	Dim title As String = colitems.GetString("status_desc")
'	Dim run_start As String = colitems.GetString("run_start")
'	Dim run_end As String = colitems.GetString("run_end")
	Dim request_stime As String = colitems.GetString("request_stime")
	Dim request_etime As String = colitems.GetString("request_etime")
	
	Dim objectdesc As String = colitems.GetString("name") 'DATA to split
	Dim taskdesc As String = colitems.GetString("task_name")
	Dim task As String = colitems.GetString("task_tagcode")
	Dim item As String = colitems.GetString("item_tagcode")
	Dim unique As String = colitems.GetString("uniquekey")
	Dim innertagcode As String = colitems.GetString("inner_tagcode")
	Dim objecttagcode As String = colitems.GetString("requester_tagcode")
	Dim Tagcode As String = colitems.GetString("tagcode")
	Dim actionkey As String = colitems.GetString("action_tagcode")
	Dim Position As Int = colitems.GetInt("position")
	
'	ListItemObjectNumber.Text = $"${Position}"$
'	ListItemObject.text = objectdesc
'	ListItemObjectTask.text = taskdesc
'	ListItemObjectStatus.text = $"${title}"$
'	Dim Runner As String = ""
'	If Not(Utils.isNullOrEmpty(request_stime)) Then Runner = $"${request_stime}"$
'	If Not(Utils.isNullOrEmpty(request_etime)) Then Runner = $"${Runner} (${request_etime})"$
'	ListItemObjectDateTime.Text = Runner
'	ListItemObjectReference.Text = $"${actionkey}"$
	
	CLAItem_G1.Text = Utils.IfNullOrEmpty(request_stime, "00:00")
	CLAItem_G2.Text = Utils.IfNullOrEmpty(taskdesc, "------------")
	Dim sValue As String = Utils.IfNullOrEmpty(objectdesc, "")
	If (sValue <> "") Then
		CLAItem_G3.Text = sValue.Replace("|", ",")
'		Dim Columns As List = Regex.Split("\|", sValue )
'		
'		CLAItem_G3.Text = Columns.Get(0)
'		CLAItem_G4.Text = Columns.Get(1)
'		CLAItem_G5.Text = Columns.Get(2)
'		CLAItem_G6.Text = Columns.Get(3)
'		CLAItem_G7.Text = Columns.Get(4)
	End If

	Private Record2 As Cursor
	Dim Status As Int = 0
	Dim sSQL As String = $" and a.request_tagcode='${Tagcode}' and a.task_tagcode='${task}' and a.item_tagcode='${item}' and a.uniquekey='${unique}' and a.tagcode='${innertagcode}'"$
	Record2 = Starter.LocalSQL.ExecQuery($"${DBStructures.SQL_GET_TASK_ITEM_VALUE_GRID} ${sSQL}"$)
	Log(sSQL)
	If Record2.RowCount > 0 Then
		Record2.Position = 0
		Status = Record2.GetInt("status")
		If (Status = 1) Then
			CLAItemButton_1.State = 1
			'CLAItemButton_1.State = 1
		Else If (Status = 2) Then
			'CLAItemButton_2.State = 1
			CLAItemButton_2.State = 1
		End If
	End If
	Record2.Close
	
'	listButObjectAction.Tag = $"${Tagcode}|${actionkey}|${objecttagcode}|${task}|${item}|${unique}|${innertagcode}"$
	ListItemObjectStatusIcon.Tag = $"${Tagcode}|${actionkey}|${objecttagcode}|${task}|${item}|${unique}|${innertagcode}"$
	CLAItemButton_1.Tag = $"${Tagcode}|${actionkey}|${objecttagcode}|${task}|${item}|${unique}|${innertagcode}|1"$
	CLAItemButton_2.Tag = $"${Tagcode}|${actionkey}|${objecttagcode}|${task}|${item}|${unique}|${innertagcode}|2"$
	Dim CLA As RequestCLA = Types.MakeRequestCLA(Tagcode, actionkey, task, tasktype, Types.MakeInterv(ID, Tagcode, actionstatus_id, Utils.ColorInt(actionstatus_id)))
	
	Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Tagcode,actionkey,task,item,unique,innertagcode,taskdesc, taskdesc, taskdesc, 2)
	CLAButtonOptions.Tag = CLAItem
	
'	If (actionstatus_id=2) Then
'		ListItemObjectStatusIcon.TextColor = Consts.ColorOrange
'		ListItemObjectStatusIcon.Text = Chr(0xF0E7)
'	Else if (actionstatus_id=3) Then
'		ListItemObjectStatusIcon.TextColor = Consts.ColorGreen
'		ListItemObjectStatusIcon.Text = Chr(0xF087)
'	else If (actionstatus_id=4) Then
'		ListItemObjectStatusIcon.TextColor = Consts.ColorRed
'		ListItemObjectStatusIcon.Text = Chr(0xF00D)
'	End If

	If (Not((CLAItemButton_1.State = -1) And (CLAItemButton_2.State = -1)) And _
		Not((CLAItemButton_1.State = 0) And (CLAItemButton_2.State = 0))  And _
		Not((CLAItemButton_1.State = 1) And (CLAItemButton_2.State = 1))) Then
		ListItemObjectStatusIcon.TextColor = Consts.ColorGreen
		ListItemObjectStatusIcon.Text = Chr(0xF087)
	End If
	
	p.Tag = CLA

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
	Dim NoAnswer As Boolean = False
	If State = 0 Then 
		val = 0
		NoAnswer = True
	End If
	Dim sSQL As String = $"update requests_values set status=${val} where request_tagcode='${Tagcode}' and 
						task_tagcode='${task}' and item_tagcode='${item}' and uniquekey='${unique}' and tagcode='${innertagcode}'"$
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

Sub CreateRequestItemMap(cnt As Int, colitems As Cursor, Top As Int, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, Top, Width, Height)
	p.LoadLayout("requests_itemmapview")
	p.RemoveView
	
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim rq_etime As String = colitems.GetString("request_etime")
	Dim rq_date As String = colitems.GetString("request_date")
	Dim rq_stime As String = colitems.GetString("request_stime")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim name As String = colitems.GetString("name")
	Dim entity As String = colitems.GetString("requester_tagcode")
	
	ListItemFullName.text = $"${name}"$
	ListItemFullName.tag = $"${entity}"$
	ListItemStatus.text = $"${rq_date}, ${rq_stime} (${rq_etime}) - ${status_desc}"$
	
	If (status_id = 1) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorGreen
		If (ReqRequests.IndexOf(tagcode) >= 0) Then
			ListItemTodayRequests.Text = Chr(0xF017)
		End If
	Else If (status_id = 2) Then
		ListItemTodayRequests.Text = Chr(0xF2BE)
		ListItemTodayRequests.TextColor = Consts.ColorOrange
	Else If (status_id = 3) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorBlue
	else if (status_id = 4) Then
		ListItemTodayRequests.Text = Chr(0xF073)
		ListItemTodayRequests.TextColor = Consts.ColorRed
	Else If (status_id = 5) Then
		ListItemTodayRequests.Text = Chr(0xF088)
		ListItemTodayRequests.TextColor = Consts.ColorGray
	End If

	
	
	'p.Tag = $"${latitude}|${longitude}"$ 'tagcode
	p.Tag = Types.MakeRequestData(tagcode, entity, latitude, longitude)
	Return p
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
	If Not(ShareCode.ISPHONE) Then
		FocusedMarker=MarkersBallons.FocusedMarker
		MapCenter=MapViewArea.GetCenter
		TileSource=MapViewArea.GetTileSource
		ZoomLevel=MapViewArea.Zoom
	End If
End Sub


Sub listsButtonClose_Click
'	If (IsFiltered) Then
'		Dim i As Int
'		i = Msgbox2("Tem um filtro activo. Deseja mante-lo para a próxima entrada?", "Alerta!", "Sim", "Não", "", Null)
'		If (i=DialogResponse.POSITIVE) Then
'			Starter.ObjectKeepFilter  = True
'			Starter.ObjectSearchFilter = SearchFilter
'			Starter.ObjectFilter = Types.MakeObjectFilter(iDialogReqTypeObject, iDialogReqZone, iDialogReqStatus, iDialogReqRegion, _
'							iDialogReqLocal, sDialogReqName, sDialogReqAddress, iDialogReqWithRequests)
'		End If
'	End If
	If Not(ShareCode.ISPHONE) Then
		MarkersBallons.UnsetFocusedMarker
		FocusedMarker = MarkersBallons.FocusedMarker
	End If
	CallSubDelayed2(Main, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
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
		cli.MakeUserAvailable("Requests", "WindowStatusUpdate")
	End If
End Sub

Sub WindowStatusUpdate
	LabelVersion.Text = ShareCode.APP_VersionNocodeName
	LabelCopyright.Text = ShareCode.APP_EntityBrand  '"X-Evolution,Lda"
	ButtonUserUnavailable.Enabled = False
	ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
	If (ShareCode.USR_STATE = 0) Then
		ButtonUserUnavailable.Enabled = True
		ButtonUserUnavailable.TextColor = Consts.ColorRedOrange
	End If
	listsLabelInfo.Text = $"${CurrentLineItem} / ${TotalLineItems}"$
End Sub

Sub ButtonAppNetwork_Click
	
End Sub

Sub ButtonAppAlert_Click
	
End Sub

Sub ButtonActionTransport_Click
	
End Sub

Sub mapZoomUp_Click
	MapViewArea.ZoomIn
End Sub

Sub mapZoomDown_Click
	MapViewArea.ZoomOut
End Sub

Sub mapUserPosition_Click
	If Not(ShareCode.ISPHONE) Then
		MarkersBallons.FocusedMarker = MarkMyPosition
	End If
End Sub

Sub mapData_Click
	
End Sub

Sub listsRequestsMap_ItemClick (Index As Int, Value As Object)
	
	Dim p As Panel  = listsRequestsMap.GetPanel(Index)
	Dim req As RequestData = p.Tag
	Dim ret As ObjectInformation = GetObjectMapInfo(req.Tagcode)
	
	Dim ThisAddress As String = $"${ret.Address},${ret.Address2}${CRLF}${ret.CPostal} ${ret.City}"$

	listsTabPanel.ScrollTo(2, True)
	Dim MarkerThis As Marker
	MarkerThis.Initialize4(ret.Tagcode, ret.Name, $"${ThisAddress}${CRLF}${ret.CtnName} - ${ret.CtnPhone}"$, ret.Latitude, ret.Longitude, Null)
	Dim posis As Int = -1 'MarkersBallons.FocusedMarker = MarkerThis
	For i=0 To Markers.Size-1
		Dim m As Marker = Markers.Get(i)
		If m.UniqueId <> Null Then
			Dim s As String = m.UniqueId
			If (s = ret.Tagcode) Then
				posis = i
				Exit
			End If
			Log($"${s}, ${ret.Tagcode}, ${i}, ${posis}"$)
		Else
			Log("M is NULL!")
		End If
	Next
	If (posis >= 0) Then
		MarkersBallons.FocusedMarker = Markers.Get(posis)
	End If

'	Dim p As Panel  = listsRequestsMap.GetPanel(Index)
'	Dim name As Label = p.GetView(0)
'	Dim lst As List = Regex.Split("\|", name.Tag)
'	
'	Dim MarkerThis As Marker
'	MarkerThis.Initialize4(p.tag, name.text, "", lst.Get(0), lst.Get(1), Null)
'	Dim posis As Int = -1
'	For i=0 To Markers.Size-1
'		Dim m As Marker = Markers.Get(i)
'		If m.UniqueId <> Null Then
'			Dim s As String = m.UniqueId
'			If (s = p.tag) Then
'				posis = i
'				Exit
'			End If
'			Log($"${s}, ${p.tag}, ${i}, ${posis}"$)
'		Else
'			Log("M is NULL!")
'		End If
'	Next
'	If (posis >= 0) Then
'		MarkersBallons.FocusedMarker = Markers.Get(posis)
'	End If
End Sub

Sub listRequestsButtonMap_Click
	If Not(ShareCode.ISPHONE) Then
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
	End If
End Sub

Sub listRequests_ItemClick (Index As Int, Value As Object)
'	Log(Value)
'	
'	Dim p As Panel  = listPedidosMap.GetPanel(Index)
'	Dim name As Label = p.GetView(0)
'	Dim lst As List = Regex.Split("\|", name.Tag)
'	
'	Dim MarkerThis As Marker
'	MarkerThis.Initialize4(p.tag, name.text, "", lst.Get(0), lst.Get(1), Null)
'	Dim posis As Int = -1
'	For i=0 To Markers.Size-1
'		Dim m As Marker = Markers.Get(i)
'		If m.UniqueId <> Null Then
'			Dim s As String = m.UniqueId
'			If (s = p.tag) Then
'				posis = i
'				Exit
'			End If
'			Log($"${s}, ${p.tag}, ${i}, ${posis}"$)
'		Else
'			Log("M is NULL!")
'		End If
'	Next
'	If (posis >= 0) Then
'		MarkersBallons.FocusedMarker = Markers.Get(posis)
'	End If
End Sub


Sub ListItemSelected(pan As Panel)
	For index= 0 To listRequests.Size-1
		Dim p As Panel = listRequests.GetPanel(index).GetView(0)
		p.Color = Consts.ColorWhite
	Next
	pan.Color = Colors.argb(255, 255, 224, 102) 'Consts.ColorCianSoftLight
	WindowStatusUpdate
End Sub

'Sub GroupInnerCollpseExpand_Click
'	'pnlGroupData
'	Dim this As B4XView = Sender
'	If (CurrentGroupItem <> this.Tag) Then CurrentGroupItem = this.tag
'	Dim p As B4XView = pnlGroupData.GetView(CurrentGroupItem) 'pnlGroupDataList.GetPanel(CurrentGroupItem)
'	CurrentLineItem = pnlGroupDataList.GetItemFromView(p) +1
'	
'	If p.Tag = True Then
'		CollapseInnerItem(CurrentGroupItem)
'	Else
'		ExpandInnerItem(CurrentGroupItem)
'	End If
'	'ListItemSelected(this.Parent)
'End Sub
'
'Sub CollapseInnerItem(index As Int)
'	Dim id As ItemData = pnlGroupDataList.GetValue(index)
'	pnlGroupDataList.ResizeItem(index, id.CollapsedHeight)
'	pnlGroupDataList.GetPanel(index).Tag = False
'	'AnimatedArrow(index, 180, 0)
'	
'	If (pnlGroupCurrenIndex <> index) Then
'		'listRequests.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
'		'listRequests.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
''		butGroupCollpseExpand.text = Types.EXPAND_ICON
'		pnlGroupCurrenIndex = index
''	Else
''		butGroupCollpseExpand.text = Types.EXPAND_ICON
'	End If
'	
'End Sub
'
'Sub ExpandInnerItem (index As Int)
'	Dim id As ItemData = pnlGroupDataList.GetValue(index)
'	pnlGroupDataList.ResizeItem(index, id.ExpandedHeight)
'	pnlGroupDataList.GetPanel(index).Tag = True
'	'AnimatedArrow(index, 0, 180)
'	If (pnlGroupCurrenIndex <> index) Then
''		listRequests.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
''		listRequests.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
''		listRequests.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
'		pnlGroupCurrenIndex = index
''	Else
''		listRequests.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
'	End If
'End Sub

Sub GroupCollpseExpand_Click
	Dim this As B4XView = Sender
	If (CurrentGroupItem <> this.Tag) Then CurrentGroupItem = this.tag
	Dim p As B4XView = listRequests.GetPanel(CurrentGroupItem)
	CurrentLineItem = CurrentGroupItem 'listRequests.GetItemFromView(p) +1
	If p.Tag = True Then
		listRequests.CollapseItem(CurrentGroupItem)
	Else
		listRequests.ExpandItem(CurrentGroupItem)
	End If
	ListItemSelected(this.Parent)
	
End Sub

Sub GroupCollpseExpandInner_Click
	'TabPageState(1, False)
	listsTabPanel.ScrollTo(0, True)
End Sub
'
'Sub CollapseItem(index As Int)
'	Dim id As ItemData = listRequests.GetValue(index)
'	listRequests.ResizeItem(index, id.CollapsedHeight)
'	listRequests.GetPanel(index).Tag = False
'	'AnimatedArrow(index, 180, 0)
'	
'	If (pnlGroupCurrenIndex <> index) Then
'		'listRequests.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
'		'listRequests.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
''		butGroupCollpseExpand.text = Types.EXPAND_ICON
'		pnlGroupCurrenIndex = index
''	Else
''		butGroupCollpseExpand.text = Types.EXPAND_ICON
'	End If
'	
'End Sub
'
'Sub ExpandItem (index As Int)
'	Dim id As ItemData = listRequests.GetValue(index)
'	listRequests.ResizeItem(index, id.ExpandedHeight)
'	listRequests.GetPanel(index).Tag = True
'	'AnimatedArrow(index, 0, 180)
'	If (pnlGroupCurrenIndex <> index) Then
''		listRequests.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
''		listRequests.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
''		listRequests.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
'		pnlGroupCurrenIndex = index
''	Else
''		listRequests.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
'	End If
'End Sub

Sub getPanelCLDesc (Index As Int) As String
	Dim pnl As Panel = listRequests.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(2)
	'CallSubDelayed2(CheckList, "StartCLActivity", lbl.Text)
	Return lbl.Text
End Sub

Sub getPanelCLCustomer (Index As Int) As String
	Dim pnl As Panel = listRequests.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(1)
	'CallSubDelayed2(CheckList, "StartCLActivity", lbl.Text)
	Return lbl.Tag 'lbl.Text
End Sub

Sub listButMap_Click
	If Not(ShareCode.ISPHONE) Then
		Dim b As Button = Sender
		Dim req As RequestData = b.Tag
		Dim ret As ObjectInformation = GetObjectMapInfo(req.Tagcode)
		
		Dim ThisAddress As String = $"${ret.Address},${ret.Address2}${CRLF}${ret.CPostal} ${ret.City}"$

		listsTabPanel.ScrollTo(2, True)
		Dim MarkerThis As Marker
		MarkerThis.Initialize4(ret.Tagcode, ret.Name, $"${ThisAddress}${CRLF}${ret.CtnName} - ${ret.CtnPhone}"$, ret.Latitude, ret.Longitude, Null)
		Dim posis As Int = -1 'MarkersBallons.FocusedMarker = MarkerThis
		For i=0 To Markers.Size-1
			Dim m As Marker = Markers.Get(i)
			If m.UniqueId <> Null Then
				Dim s As String = m.UniqueId
				If (s = ret.Tagcode) Then
					posis = i
					Exit
				End If
				Log($"${s}, ${ret.Tagcode}, ${i}, ${posis}"$)
			Else
				Log("M is NULL!")
			End If
		Next
		If (posis >= 0) Then
				MarkersBallons.FocusedMarker = Markers.Get(posis)
		End If
	End If
End Sub

Sub GetObjectMapInfo(tagcode As String) As ObjectInformation
	Private Record As Cursor
	ItemsCounter = 0
	Dim SQL As String = $"${DBStructures.SQL_CURRENT_OBJECTS_ENT} and a.tagcode in (select distinct requester_tagcode from requests where tagcode='${tagcode}')"$
	
	Record = Starter.LocalSQL.ExecQuery(SQL)
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
	Dim Curr As RequestFilter = Types.MakeRequestFilter(FilterStartDate,FilterEndDate,FilterStates,FilterTasks,FilterEntity)
	Filter.GetRequestFilterDialog("Requests", Curr, ListTasks, ListEntities, ListStates)
End Sub
	
Sub CancelAllFilters(run As Boolean)
	IsFiltered  = False
	FilterStartDate = ShareCode.APPDATE_STARTRANGE
	FilterEndDate = ShareCode.APPDATE_ENDRANGE
	FilterTasks = 0
	FilterEntity = 0
	FilterStates = -1
	If (run) Then
		listRequests.Clear
		If Not(ShareCode.ISPHONE) Then
			listsRequestsMap.Clear
			Markers.Clear
			Markers.Add( MarkMyPosition )
			MarkersBallons.RemoveMarkers
		End If
		'MarkersBallons.AddMarkers(Markers)
		StartRequestActivity(False, "")
	End If
End Sub

Sub SetTheFilters(flt As RequestFilter)
	'RequestFilter(SDate As String, EDate As String, State As Int, CheckList As Int, Entity As Int)
	IsFiltered  = True
	If (flt.SDate <> "") Then FilterStartDate = flt.SDate
	If (flt.EDate <> "") Then FilterEndDate = flt.EDate
	If (flt.Task > 0) Then FilterTasks = flt.Task
	If (flt.Entity > 0) Then FilterEntity = flt.Entity
	If (flt.State >= 0) Then FilterStates = flt.State
	listRequests.Clear
	If Not(ShareCode.ISPHONE) Then
		listsRequestsMap.Clear
		Markers.Clear
		Markers.Add( MarkMyPosition )
		MarkersBallons.RemoveMarkers
	End If
	
	Dim whereSAL As String = ""
	If (IsFiltered) Then
		If (FilterStartDate <> "") Then
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} a.request_date>='${FilterStartDate}'"$
		End If
		
		If (FilterEndDate <> "") Then
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} a.request_date<='${FilterEndDate}'"$
		End If
		
		If (FilterTasks > 0) Then
			Dim r As CodeNameList = ListTasks.Get(FilterTasks-1)
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} (a.tagcode in (Select tagcode from requests_tasks where task='${r.TagCode}'))"$
			'whereSAL = $"${whereSAL} (Task in (select tagcode from Tasks where id=${FilterTasks}))"$
		End If
		
		If (FilterEntity > 0) Then
			Dim r As CodeNameList = ListTasks.Get(FilterEntity-1)
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} (c.name='${r.Name}')"$
			'whereSAL = $"${whereSAL} (entity in (select tagcode from entities where id=${FilterEntity}))"$
		End If
		
		If (FilterStates >= 0) Then
			
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} a.status_id='${FilterStates}'"$
		End If
		
		If (whereSAL <> "") Then whereSAL = $" and ${whereSAL}"$
	End If
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
	Dim Filter As String = $" and a.tagcode in (${DBStructures.SQL_GETREQUESTS_DATA_TASKS_TAGS} and (a.request_tagcode||d.title||e.name||b.name||b.local||c.address||ifnull(c.address2,'')||c.postal_code||c.city||c.latitude||c.longitude like '%${search}%'))"$
	SearchFilter = Filter
	IsFiltered = (Filter <> "")
	StartRequestActivity(True, Filter)
End Sub

Sub LabelButtonTitleAction_Click
	RequestsOptionsPopMenu.OpenMenu
End Sub

Sub ExpandeAllPopMenu_Click(MenuName As String)
	For index= 0 To listRequests.Size-1
		listRequests.ExpandItem (index)
	Next
End Sub

Sub CollapseAllPopMenu_Click(MenuName As String)
	For index= 0 To listRequests.Size-1
		listRequests.CollapseItem (index)
	Next
End Sub

Sub listButMore_Click
	'TaskListItemSelected
	Dim i As Int
	i = Msgbox2(ShareCode.TopRequestActionMessage, ShareCode.GeneralNoteTitle, ShareCode.Option_ADD_TASK, ShareCode.Option_CANCEL, ShareCode.Option_MAKE_REPORT, Null)
	If (i=DialogResponse.POSITIVE) Then
		Private Record As Cursor
		Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} and active=1 order by name, type"$
		Record = Starter.LocalSQL.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Dim Filter As AppActionDialogs
			Filter.Initialize
			Filter.GetTaskListDialog(Activity, "requests", Record)
		Else
			Msgbox("Não existem tarefas disponíveis para selecção!", "Alerta")
			Record.Close
		End If
	else If (i=DialogResponse.NEGATIVE) Then
'		ToastMessageShow("Gera relatório", True)
	End If
End Sub

'**********************************************************************************
'	ADICIONA TAREFA (ACÇÃO/CHECKLIST) À INTERVENÇÃI/ORDEM DE SERVIÇO
'**********************************************************************************
Public Sub TaskListItemSelected(tagcode As String)
'	ToastMessageShow($"Foi seleccionado o tag : ${tagcode}"$, True)
End Sub



Sub pnlGroupData_Click
	Log("GroupPanel_Click")
End Sub

Sub pnlGroupDataSub_Click
	Log("pnlGroupDataSub_Click")
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
		CallSubDelayed3(CheckList, "StartCLA_Activity", data, Entity.Text)
	Else
		TabPageState(1, True)
		listsTabPanel.ScrollTo(1, True)
		CreateRequestItemLevel(1, data, listRequestsItem.sv.Width, 70dip, Null)
		
		
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
	
'	Dim i As Int
'	i = Msgbox2(ShareCode.RUN_Action_Confirm, ShareCode.GeneralNoteTitle, ShareCode.Option_YES, ShareCode.Option_CANCEL, "", Null)
'	If (i=DialogResponse.POSITIVE) Then
		'CallSubDelayed3(CheckList, "StartCLActivity", getPanelCLDesc(CurrentIndexPanel), getPanelCLCustomer(CurrentIndexPanel))
		'SQL_CURRENT_TASKS
		
		CallSubDelayed3(CheckList, "StartCLA_Activity", data, Entity.Text)
		
		'CallSubDelayed3(CheckList, "StartCLActivity", "Manutenção de Edíficios", "Cliente")
		CurrentIndexPanel = -1
		CurrentIDPanel = 0
'	Else If (i=DialogResponse.NEGATIVE) Then
'		Log("Negativo")
'	Else
'		Log("Cancel")
'	End If
End Sub


Sub listButMoreAction_Click
	
End Sub

Sub listButMoreActionInner_Click
	Dim Btn As Button = Sender 'CLAButtonOptions.Tag = CLAItem
	Dim CLAItem As RequestCLAItem = Btn.Tag
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "requests", CLAItem, 0)
End Sub

Sub Return2CLAI(CLAItem As RequestCLAItem, TabPos As Int)
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "requests", CLAItem, TabPos)
End Sub

Sub CamImage(CLAItem As RequestCLAItem)
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "requests", CLAItem, 0)
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



