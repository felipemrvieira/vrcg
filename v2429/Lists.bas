B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region


Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim FocusedMarker, Marker1, Marker2, Marker3 As Marker
	Dim MarkMyPosition As BalloonMarker
	
	'	we'll use the new BalloonMarker object for Marker4
	
	Dim MapCenter As GeoPoint
	Dim TileSource As String
	Dim ZoomLevel As Int
	Dim Markers As List
	Dim MapFirstTime As Boolean
	
	Private MyPositionLat, MyPositionLon As String
	Private CurrentTabPage As Int = 0
	Private InfoDataWindows As Boolean = False
End Sub

Sub Globals
	Dim Icon As BitmapDrawable
	Dim xui As XUI
	Dim MapViewArea As MapView
	Dim TileSourceSpinner As Spinner
	'Dim prvd As FileProvider
	
	'	create the MarkersBalloonOverlay
	Dim MarkersBallons As MarkersBalloonOverlay

	Private listsBackground As ImageView
	Private listsBasePanel As Panel
	Private listsBottomLine As Panel
	Private listsBottomPanel As Panel
	Private listsButtonAdd As Button
	Private listsButtonClose As Button
	Private listsLabelInfo As Label
	Private listsTabPanel As TabStrip
	Private listsTopBar As Panel
	Private listPedidos As CustomListView
	'Private calendarData As Panel
	Private mapData As Panel
	Private listButAttach As Button
	Private listButCalendar As Button
	Private listButCamera As Button
	Private listButInfo As Button
	Private listButMap As Button
	Private ListItemBasePanel As Panel
	Private ListItemDatetime As Label
	Private ListItemDescription As Label
	Private ListItemFullName As Label
	Private ListItemPanel As Panel
	Private ListItemStatusPanel As Panel
	Private combo As B4XComboBox
	Private ItemFieldName As Label
	Private ItemFilterCondition As B4XComboBox
	Private ItemFilterEdit As EditText
	Private listsCustomFilter As CustomListView
	Private listsPanelFilter As Panel
	Private listsButtonFilter As Button
	Private ItemFilterC1 As B4XComboBox
	Private ItemFilterC2 As B4XComboBox
	Private ItemFilterC3 As B4XComboBox
	Private ItemFilterEdit1 As EditText
	Private ItemFilterEdit2 As EditText
	Private ItemFilterEdit3 As EditText
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelAppInfo As Label
	Private LabelCopyright As Label
	
	Private ListItemRunStart As Label
	Private ListItemReference As Label
	Private ListItemCheckList As Label
	Private ListItemHistory As Label
	Private ListItemTimes As Label
	Private ListItemRunEnd As Label
	Private ListItemRunTime As Label
	Private ListItemContact As Label
	Private listPedidosMap As CustomListView
	Private ListItemIcon As ImageView
	Private listPedidosButtonMap As Button
	
	Private ShowListPedidosMap As Boolean = False
	Private Bloco30 As Int = 0
	Private mapBaseList As Panel
	Private mapBasePanel As Panel
	Private mapZoomDown As Button
	Private mapZoomUp As Button
	Private listButInfoMap As Button
	Private listButAttachMap As Button
	Private ListItemCheckListMap As Label
	Private ListItemReferenceMap As Label
	Private ListItemFullNameMap As Label
	Private ListItemContactMap As Label
	Private ListItemDatetimeMap As Label
	Private ListItemTimesMap As Label
	Private ListItemStatus As Label
	Private ItemsCounter As Int = 0
	Private panelRequestOptions As Panel
	Private ListItemStatusPanelMap As Panel
	Private butRequestInfo As Button
	Private butRequestRun As Button
	Private butRequestAction As Button
	Private butRequestClosePanel As Button
	Private calendarData As MonthViewCalendar
	
	Dim CurrentIndexPanel As Int = -1
	Dim CurrentIDPanel As Int = 0
	Private butCarRunning As Button
	Private ListItemNumber As Label
	Private panelRequestInfo As Panel
	Private labelRequestInfoTitle As Label
	Private butRequestInfoClose As Button
	Private lblInfoReq_Code As Label
	Private lblInfoReq_Date As Label
	Private lblInfoReq_STime As Label
	Private lblInfoReq_ETime As Label
	Private lblInfoReq_Address As Label
	Private lblInfoReq_Address2 As Label
	Private lblInfoReq_PostalCode As Label
	Private lblInfoReq_Local As Label
	Private lblInfoReq_Latitude As Label
	Private lblInfoReq_Longitude As Label
	Private lblInfoReq_State As Label
	Private lblInfoReq_DateRun As Label
	Private lblInfoReq_SRun As Label
	Private lblInfoReq_ERun As Label
	Private lblInfoReq_Contact As Label
	Private lblInfoReq_Phone As Label
	Private lblInfoReq_Notes As Label
	Private ListItemNotes As Label
	
	
	Private IsFiltered As Boolean = False
	Private FilterStartDate As String
	Private FilterEndDate As String
	Private FilterChecklist As Int = 0
	Private FilterEntity As Int = 0
	Private FilterStates As Int = -1
	
	Private ListStates As List
	Private ListEntities As List
	Private ListChecklists As List
	
	Private ButtonUserUnavailable As Button
	Private mapUserPosition As Button
	Private ColorTabPanel As Panel
	Private mainLabelOptLists As Label
	Private mainLogo As ImageView
End Sub

'dialog_filterRequest

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	ListStates.Initialize
	ListEntities.Initialize
	ListChecklists.Initialize
	'prvd.Initialize
	Activity.LoadLayout("listsLayout")
	listsTabPanel.LoadLayout("ListViewLayout", "Listagem")
	listsTabPanel.LoadLayout("MapViewLayout", "Mapa")
	listsTabPanel.LoadLayout("CalendarViewLayout", "Agenda")
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 33.33%x
	Next
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorBlueSoftDark,Consts.ColorBlueDark)
	Markers.Initialize
	Bloco30 = Activity.Width / 3
	
	Dim p As Panel = listPedidosMap.AsView
	p.Width = Bloco30
	MapViewArea.Initialize("")
	mapData.AddView(MapViewArea, 0, 0, 100%x, 100%y)
	MapViewArea.SetMultiTouchEnabled(True)
	MapViewArea.SetZoomEnabled(True)
	MarkersBallons.Initialize(MapViewArea, "", "balloon_overlay")
	
	MapViewArea.AddOverlay(MarkersBallons)
	MapFirstTime = FirstTime
	
	Icon.Initialize(LoadBitmap(File.DirAssets, "my_icon_blue.png"))
	MarkMyPosition.Initialize(ShareCode.SESS_UserName, "", LocationService.GeoLocal.lat, LocationService.GeoLocal.lon, Icon)
	
	MarkMyPosition.LayoutName="custom_balloon_overlay"
	Markers.Add( MarkMyPosition )
	
	If FirstTime Then
		'
	End If
	LabelVersion.Text = ShareCode.APP_VersionNocodeName
	LabelCopyright.Text = ShareCode.APP_EntityBrand  '"X-Evolution,Lda"
	
	ListStates = DBStructures.GetListOfFrom("type_requestsstatus", "title")
	Log(ListStates)
	ListEntities = DBStructures.GetListOfFrom("entities", "name")
	Log(ListEntities)
	ListChecklists = DBStructures.GetListOfFrom("tasks", "name")
	Log(ListChecklists)
	
	CancelAllFilters(False)
	If ShareCode.USR_STATE = 0 Then
		ButtonUserUnavailable.Visible = True
		ButtonUserUnavailable.Enabled = True
	End If
	UpdateMainLayout
End Sub

Sub UpdateMainLayout
	mainLabelOptLists.TextColor = Consts.ColorMain
	mainLogo.Gravity = Gravity.FILL
	mainLogo.Width = Consts.LogoWidth
	mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO))
	Dim gc As GradientDrawable
	gc.Initialize("TOP_BOTTOM", Array As Int(Consts.ColorMain, Consts.ColorSub))
	ColorTabPanel.Background = gc
	Dim jo As JavaObject = listsTabPanel
	jo = jo.GetField("tabStrip")
	'now you can set the properties
	jo.RunMethod("setIndicatorColor", Array(Consts.ColorMain))
End Sub

Sub Activity_Resume

End Sub

'Sub Activity_KeyPress (KeyCode As Int) As Boolean
''	If KeyCode = KeyCodes.KEYCODE_BACK Then
''		For Each adp As AnotherDatePicker In adps
''			If adp.IsVisible Then
''				adp.btnCancel_Click 'emulate a click on Cancel button
''				Return True
''			End If
''		Next
''	End If
''	Return False
'End Sub

Sub Activity_Pause (UserClosed As Boolean)
	FocusedMarker=MarkersBallons.FocusedMarker
	MapCenter=MapViewArea.GetCenter
	TileSource=MapViewArea.GetTileSource
	ZoomLevel=MapViewArea.Zoom
End Sub

Sub CancelAllFilters(run As Boolean)
	IsFiltered  = False
	FilterStartDate = ""
	FilterEndDate = ""
	FilterChecklist = 0
	FilterEntity = 0
	FilterStates = -1
	If (run) Then
		listPedidos.Clear
		listPedidosMap.Clear
		Markers.Clear
		Markers.Add( MarkMyPosition )
		MarkersBallons.RemoveMarkers
		'MarkersBallons.AddMarkers(Markers)
		StartListActivityFilter
	End If
End Sub

Sub SetTheFilters(flt As RequestFilter)
	'RequestFilter(SDate As String, EDate As String, State As Int, CheckList As Int, Entity As Int)
	IsFiltered  = True
	If (flt.SDate <> "") Then FilterStartDate = flt.SDate
	If (flt.EDate <> "") Then FilterEndDate = flt.EDate
	If (flt.Task > 0) Then FilterChecklist = flt.Task
	If (flt.Entity > 0) Then FilterEntity = flt.Entity
	If (flt.State >= 0) Then FilterStates = flt.State
	listPedidos.Clear
	listPedidosMap.Clear
	Markers.Clear
	Markers.Add( MarkMyPosition )
	MarkersBallons.RemoveMarkers
	StartListActivityFilter
End Sub

Sub FitMap_Click
	MapViewArea.FitMapToBoundingBox(MarkersBallons.GetBoundingBox)
End Sub

Sub TileSourceSelect_ItemClick (Position As Int, Value As Object)
	'MapViewArea.SetTileSource(Value)
End Sub

Sub StartListActivity(FileArg As String)
	ProgressDialogShow("A ler dados ... ")

	
	Private Row As Int = 0
	Private Record As Cursor
	Record = Starter.LocalSQL.ExecQuery(DBStructures.SQL_GETREQUESTS_DATA)
	If Record.RowCount > 0 Then
		For Row = 0 To Record.RowCount-1
			Record.Position = Row
			ItemsCounter = ItemsCounter + 1
			Dim status_id As Int = Record.GetInt("status_id")
			Dim status_color As String = Record.GetString("status_color")
			
			Dim pbd As Panel
			pbd.Initialize("")
			pbd.Width = 37dip
			pbd.Height = 64dip
			pbd.SetBackgroundImage(LoadBitmap(File.DirAssets, $"p_${status_color.ToLowerCase}.png"$))
			Dim cvs As B4XCanvas
			cvs.Initialize(pbd)
			Dim cvsRect As B4XRect
			cvsRect.Initialize(0, 0, 37dip, 37dip)
			Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFAULT, 12)
			Dim CenterX As Int = (cvsRect.left+cvsRect.Right)/2
			Dim CenterY As Int = (cvsRect.Top+cvsRect.Bottom)/2
			Dim r As B4XRect = cvs.MeasureText(ItemsCounter, fnt)
			Dim baseline As Int = CenterY - r.Height / 2 - r.Top
			
			cvs.DrawText(ItemsCounter, CenterX, baseline, fnt, Colors.Black, "CENTER")
			cvs.Invalidate
			Dim bd As BitmapDrawable
			bd.Initialize(cvs.CreateBitmap)

			listPedidos.Add( CreateListItem(ItemsCounter, Record, listPedidos.AsView.Width, 90dip, bd), 90dip, "" )
			If (status_id < 5) Then
				listPedidosMap.Add( CreateListItemMap(ItemsCounter, Record, Bloco30, 120dip), 120dip, "" )
			End If
		Next
	End If
	Record.Close

	MarkersBallons.AddMarkers(Markers)
	
	If MapFirstTime Then
		TileSource="Mapnik"
		'	fit the MapView to the MarkersBalloonOverlay
		MapViewArea.FitMapToBoundingBox(MarkersBallons.GetBoundingBox)
	Else
		'	restore saved zoom level and map center
		MapViewArea.Zoom=ZoomLevel
		MapViewArea.SetCenter3(MapCenter)
		If FocusedMarker<>Null Then
			'	restore the Balloon if was open before the orientation change (or Activity_Pause)
			MarkersBallons.FocusedMarker = FocusedMarker
		End If
	End If
	ProgressDialogHide
End Sub

Sub StartListActivityFilter
	ProgressDialogShow("A ler dados ... ")
	Private Row As Int = 0
	Private Record As Cursor
	Dim SQLScript As String = DBStructures.SQL_GETREQUESTS_DATA
	If (IsFiltered) Then
		Dim whereSAL As String = ""
'		id, ascbus, tagcode, Type, status_id, status_desc,
'		status_color, last_execution, have_history, status_notes, CheckList, request_number,
'		request_date, request_stime, request_etime, entity, object, run_start, run_end, run_time
		
		If (FilterStartDate <> "") Then 
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} request_date>='${FilterStartDate}'"$
		End If
		
		If (FilterEndDate <> "") Then 
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} request_date<='${FilterEndDate}'"$
		End If
		
		If (FilterChecklist > 0) Then
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} (Task in (select tagcode from Tasks where id=${FilterChecklist}))"$
		End If
		
		If (FilterEntity > 0) Then
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} (entity in (select tagcode from entities where id=${FilterEntity}))"$
		End If
		
		If (FilterStates >= 0) Then 
			If (whereSAL <> "") Then whereSAL = whereSAL & " and "
			whereSAL = $"${whereSAL} a.status_id='${FilterStates}'"$
		End If
		
		If (whereSAL <> "") Then whereSAL = $" where ${whereSAL}"$
		SQLScript = $"${SQLScript} ${whereSAL}"$
	End If
	
	Record = Starter.LocalSQL.ExecQuery(SQLScript)
	If Record.RowCount > 0 Then
		For Row = 0 To Record.RowCount-1
			Record.Position = Row
			ItemsCounter = ItemsCounter + 1
			Dim status_id As Int = Record.GetInt("status_id")
			Dim status_color As String = Record.GetString("status_color")
			
			Dim pbd As Panel
			pbd.Initialize("")
			pbd.Width = 37dip
			pbd.Height = 64dip
			pbd.SetBackgroundImage(LoadBitmap(File.DirAssets, $"p_${status_color.ToLowerCase}.png"$))
			Dim cvs As B4XCanvas
			cvs.Initialize(pbd)
			Dim cvsRect As B4XRect
			cvsRect.Initialize(0, 0, 37dip, 37dip)
			Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFAULT, 12)
			Dim CenterX As Int = (cvsRect.left+cvsRect.Right)/2
			Dim CenterY As Int = (cvsRect.Top+cvsRect.Bottom)/2
			Dim r As B4XRect = cvs.MeasureText(ItemsCounter, fnt)
			Dim baseline As Int = CenterY - r.Height / 2 - r.Top
			
			cvs.DrawText(ItemsCounter, CenterX, baseline, fnt, Colors.Black, "CENTER")
			cvs.Invalidate
			Dim bd As BitmapDrawable
			bd.Initialize(cvs.CreateBitmap)

			listPedidos.Add( CreateListItem(ItemsCounter, Record, listPedidos.AsView.Width, 90dip, bd), 90dip, "" )
			If (status_id < 5) Then
				listPedidosMap.Add( CreateListItemMap(ItemsCounter, Record, Bloco30, 120dip), 120dip, "" )
			End If
		Next
	End If
	Record.Close

	MarkersBallons.AddMarkers(Markers)
	
	If MapFirstTime Then
		TileSource="Mapnik"
		'	fit the MapView to the MarkersBalloonOverlay
		MapViewArea.FitMapToBoundingBox(MarkersBallons.GetBoundingBox)
	Else
		'	restore saved zoom level and map center
		MapViewArea.Zoom=ZoomLevel
		MapViewArea.SetCenter3(MapCenter)
		If FocusedMarker<>Null Then
			'	restore the Balloon if was open before the orientation change (or Activity_Pause)
			MarkersBallons.FocusedMarker = FocusedMarker
		End If
	End If
	ProgressDialogHide
End Sub

'Sub CreateListItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
Sub CreateListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("ListItemSmallView") '("ListItemViewLayout")
	p.RemoveView
	
	Dim ID As Int = colitems.GetInt("id")
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim status_notes As String = colitems.GetString("status_notes")
	Dim status_desc As String = colitems.GetString("status_desc")
	

	Dim rq_etime As String = colitems.GetString("request_etime")
	Dim rq_date As String = colitems.GetString("request_date")
	Dim rq_stime As String = colitems.GetString("request_stime")
	Dim rq_number As String = colitems.GetString("request_number")
'	Dim schecklist As String = colitems.GetString("checklist")
	Dim cl_name As String = colitems.GetString("cl_name")
'	Dim entity As String = colitems.GetString("entity")
	Dim contact_name As String = colitems.GetString("contact_name")
	Dim contact_phone As String = colitems.GetString("contact_phone")
	Dim latitude As String = colitems.GetString("latitude")
	Dim name As String = colitems.GetString("name")
	Dim longitude As String = colitems.GetString("longitude")
	ListItemReference.text = rq_number
	ListItemCheckList.text = $"${cl_name}"$ 'cl_name
	ListItemNumber.Text = $"# ${cnt}"$
	ListItemDatetime.text = $"${rq_date}, ${rq_stime} (${rq_etime})"$
	ListItemFullName.text = $"${name} (${cl_name})"$
	ListItemFullName.tag = $"${name}"$
	ListItemContact.text = $"${contact_name} - ${contact_phone} - (${latitude}|${longitude})"$
	listButMap.Tag = $"${latitude}|${longitude}"$
	listButInfo.Tag = $"${status_notes}"$
	ListItemStatusPanel.Color = Utils.ColorInt(status_id)
	ListItemStatusPanel.Tag = status_id
'	Dim cs As CSBuilder
'	If (status_notes <>"") And (status_notes <>Null) Then
'		status_notes = cs.Initialize.Color(Consts.ColorOrange).Append(status_notes).PopAll
'	Else 
'		status_notes = ""
'	End If
	ListItemStatus.Text =  $"${status_desc}"$ 'Starter.StrFunc.Trim($"${status_desc} ${status_notes}"$
	
	If (status_notes <> "") And (status_notes <> "null") Then
		ListItemNotes.Text = $"${status_notes}"$
	else if (status_notes = "null") Then
		ListItemNotes.Text = ""
	End If
	
	listButMap.Enabled = (status_id < 5)
	
	If ((status_id < 5) And ((latitude <>"") And (longitude <> ""))) Then
		Marker1.Initialize4(rq_number, name, $"${cl_name}, ${contact_name} - ${contact_phone}"$, latitude, longitude, bd)
		Markers.Add(Marker1)
	End If
	p.Tag = Types.MakeInterv(ID, rq_number, status_id, Utils.ColorInt(status_id))
	Return p
End Sub

'Sub CreateListItemMap(cnt As Int, colitems As Map, Width As Int, Height As Int) As Panel
Sub CreateListItemMap(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("ListItemViewLayoutMap")
	p.RemoveView
	
'	Dim ID As Int = colitems.GetInt("id")
	Dim status_id As Int = colitems.GetInt("status_id")
	
'	Dim status_color As String = colitems.GetString("status_color")
	Dim status_notes As String = colitems.GetString("status_notes")
	Dim rq_etime As String = colitems.GetString("request_etime")
	Dim rq_date As String = colitems.GetString("request_date")
	Dim rq_stime As String = colitems.GetString("request_stime")
	Dim rq_number As String = colitems.GetString("request_number")
'	Dim schecklist As String = colitems.GetString("checklist")
	Dim cl_name As String = colitems.GetString("cl_name")
'	Dim entity As String = colitems.GetString("entity")
	Dim contact_name As String = colitems.GetString("contact_name")
	Dim contact_phone As String = colitems.GetString("contact_phone")
	Dim latitude As String = colitems.GetString("latitude")
	Dim name As String = colitems.GetString("name")
	Dim longitude As String = colitems.GetString("longitude")
	
	ListItemCheckListMap.text = $"#${cnt} - ${cl_name}"$ 'cl_name
	ListItemReferenceMap.text = rq_number
	ListItemDatetimeMap.text = rq_date
	ListItemTimesMap.text = $"${rq_stime} - ${rq_etime}"$
	ListItemFullNameMap.text = name
	ListItemContactMap.text = $"${contact_name} - ${contact_phone}"$
	ListItemFullNameMap.Tag = $"${latitude}|${longitude}"$
	listButInfoMap.Tag = $"${status_notes}"$
	listButAttachMap.Tag = ""
	ListItemStatusPanelMap.Color = Utils.ColorInt(status_id)
	ListItemStatusPanelMap.Tag = status_id
	listButAttachMap.Enabled = (status_id < 5)
	p.Color = Colors.ARGB(255, 250,250,250)
	If (status_id = 5) Then p.Color = Colors.ARGB(255, 255,199,184)
	
	Return p
End Sub

Public Sub UpdateMyPosition(Lat As String, Lon As String)
	If (LabelAppInfo.IsInitialized) Then
		MyPositionLat = Lat
		MyPositionLon = Lon
		LabelAppInfo.Text =  $"Latitude: ${MyPositionLat}, Longitude: ${MyPositionLon}"$
	End If
	
	If (Markers.IsInitialized) Then
		ChangeMyPosition
	End If
End Sub

Public Sub ChangeMyPosition
	If (Markers.Size > 0) Then
		If ((MyPositionLat <> $"${MarkMyPosition.GeoPoint.Latitude}"$) Or (MyPositionLon <> $"${MarkMyPosition.GeoPoint.Longitude}"$)) Then
			Log("Changing position")
			Markers.RemoveAt(Markers.IndexOf(MarkMyPosition))
			MarkMyPosition.Initialize("Eu", "", MyPositionLat, MyPositionLon, Icon)
			Markers.Add( MarkMyPosition )
			
			MarkersBallons.RemoveMarkers   '.RemoveMarker(MarkMyPosition)
			MarkersBallons.AddMarkers(Markers)
		End If
	End If
	
End Sub

Sub listsTabPanel_PageSelected (Position As Int)
	If (InfoDataWindows) Then
		listsTabPanel.ScrollTo( CurrentTabPage, True)
	Else
		CurrentTabPage = Position
	End If
End Sub

Sub listsButtonClose_Click
	MarkersBallons.UnsetFocusedMarker
	FocusedMarker = MarkersBallons.FocusedMarker
	CallSubDelayed2(Main, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listsButtonAdd_Click
	
End Sub

Sub listPedidos_ItemClick (Index As Int, Value As Object)
	
	'Dim Index As Int = listPedidos.GetItemFromView(Sender)
	Dim pnl As Panel = listPedidos.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(0)
	listsLabelInfo.Text = $"${lbl.Text}, ${Utils.GetFreeMem}"$
	
	CurrentIndexPanel = Index
	Dim interv As Intervention = pnl.Tag 'Types.MakeInterv(id, rq_number, status_id, Utils.ColorInt(status_id))
	CurrentIDPanel = interv.id
	
	panelRequestOptions.Visible = True
End Sub

Sub getPanelCLDesc (Index As Int) As String
	Dim pnl As Panel = listPedidos.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(2)
	'CallSubDelayed2(CheckList, "StartCLActivity", lbl.Text)
	Return lbl.Text
End Sub

Sub getPanelCLCustomer (Index As Int) As String
	Dim pnl As Panel = listPedidos.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(1)
	'CallSubDelayed2(CheckList, "StartCLActivity", lbl.Text)
	Return lbl.Tag 'lbl.Text
End Sub

Sub ListItemPanel_Click
	panelRequestOptions.Visible = False
End Sub

Sub listButMap_Click
	panelRequestOptions.Visible = False
	Dim b As Button = Sender
	Dim p As Panel  = b.Parent
	'Dim schecklist As Label = p.GetView(0)
	'Dim reference As Label = p.GetView(0)
	Dim name As Label = p.GetView(1)
	
	Dim interv As Intervention = p.Tag 'Types.MakeInterv(id, rq_number, status_id, Utils.ColorInt(status_id))
	CurrentIDPanel = interv.id
	
'	Dim status As Panel = p.GetView(3)
'	Dim desc As Label = p.GetView(4)
	Dim contact As Label = p.GetView(4)
	Dim lst As List = Regex.Split("\|", b.Tag)
	
	Log( $"Name: ${name}, Tag: ${b.Tag}"$)
	
'	If status_id = 0 Then
'		ListItemStatusPanel.Color = Colors.Blue
'	else if status_id = 1 Then
'		ListItemStatusPanel.Color = Colors.Yellow
'	Else If status_id = 2 Then
'		ListItemStatusPanel.Color = Colors.Green
'	Else If status_id = 3 Then
'		ListItemStatusPanel.Color = Colors.Red
'	Else If status_id = 4 Then
'		ListItemStatusPanel.Color = Colors.Red
'	Else If status_id = 5 Then
'		ListItemStatusPanel.Color = Colors.Gray
'	End If
	
	
	'listButMap.Tag = $"${latitude}|${longitude}"$
	
	listsTabPanel.ScrollTo(1, True)   '.LoadLayout("MapViewLayout", "Mapa")
	Dim MarkerThis As Marker 
	MarkerThis.Initialize4(interv.code, name.text, $"${name.Text}, ${contact.Text}"$, lst.Get(0), lst.Get(1), Null)
	Dim posis As Int = -1 'MarkersBallons.FocusedMarker = MarkerThis
	For i=0 To Markers.Size-1
		Dim m As Marker = Markers.Get(i)
		If m.UniqueId <> Null Then
		Dim s As String = m.UniqueId
			If (s = interv.code) Then
			posis = i
			Exit
		End If
			Log($"${s}, ${interv.code}, ${i}, ${posis}"$)
		Else
			Log("M is NULL!")
		End If
	Next
	If (posis >= 0) Then
		MarkersBallons.FocusedMarker = Markers.Get(posis)
	End If
	
	'Dim posis As Int = Markers.IndexOf(MarkerThis)
	'Log($"${name.Text}, ${checklist.Text}, ${contact.Text} : ${lst.Get(0)}, ${lst.Get(1)}, ${posis}"$)
	'Log(Markers)
End Sub

Sub listButInfo_Click
	panelRequestOptions.Visible = False
End Sub

Sub listButCamera_Click
	panelRequestOptions.Visible = False
	'CallSubDelayed(CameraActivity, "StartCamera")
	CallSubDelayed2(CameraActivity, "StartCamera", "Lists")
End Sub

Sub listButCalendar_Click
	panelRequestOptions.Visible = False
End Sub

Sub listButAttach_Click
	panelRequestOptions.Visible = False
	listsLabelInfo.Text = $"${Utils.GetFreeMem}"$
End Sub

Sub ListItemPanel_Touch (Action As Int, X As Float, Y As Float)
	panelRequestOptions.Visible = False
	listsLabelInfo.Text = "Touch Click"
End Sub

Sub ListItemPanel_LongClick
	panelRequestOptions.Visible = False
End Sub

Sub combo_SelectedIndexChanged (Index As Int)
	
End Sub

Sub ItemFilterEdit_TextChanged (Old As String, New As String)
	
End Sub

Sub ItemFilterEdit_EnterPressed
	
End Sub

Sub ItemFilterCondition_SelectedIndexChanged (Index As Int)
	
End Sub

Sub listsCustomFilter_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub listsCustomFilter_ReachEnd
	'listsPanelFilter
End Sub

Sub listsButtonFilter_Click
	
	Dim Filter As AppDialogs
	Filter.Initialize
	Dim Curr As RequestFilter = Types.MakeRequestFilter(FilterStartDate,FilterEndDate,FilterStates,FilterChecklist,FilterEntity)

	Filter.GetRequestFilterDialog("Lists", Curr, ListChecklists, ListEntities, ListStates)
	
'	panelRequestOptions.Visible = False
'	If (listsPanelFilter.Visible) Then
'		listsPanelFilter.Visible = False
'	Else
'		Dim ComboValues As List
'		ComboValues.Initialize
'		ComboValues.Add("=")
'		ComboValues.Add(">=")
'		ComboValues.Add("<=")
'		ComboValues.Add("!=")
'		ComboValues.Add(">")
'		ComboValues.Add("<")
'	
'		ItemFilterC1.SetItems(ComboValues)
'		ItemFilterC2.SetItems(ComboValues)
'		ItemFilterC3.SetItems(ComboValues)
'		listsPanelFilter.Visible = True
'	End If
End Sub



Sub ItemFilterC3_SelectedIndexChanged (Index As Int)
	
End Sub

Sub ItemFilterC2_SelectedIndexChanged (Index As Int)
	
End Sub

Sub ItemFilterC1_SelectedIndexChanged (Index As Int)
	
End Sub

Sub listPedidosButtonMap_Click
	panelRequestOptions.Visible = False
	If ShowListPedidosMap Then
		ShowListPedidosMap = False
		mapBaseList.width = 1dip
		mapBasePanel.Left = 2dip
		mapBasePanel.Width = mapBasePanel.Width+Bloco30
		listPedidosButtonMap.Color = Colors.ARGB(150, 7, 167, 247)
	Else
		ShowListPedidosMap = True
		mapBaseList.width = Bloco30
		mapBasePanel.Left = Bloco30+1dip
		mapBasePanel.Width = mapBasePanel.Width-Bloco30
		listPedidosButtonMap.Color = Colors.ARGB(150, 7, 119, 167)
	End If
	mapData.Width = mapBasePanel.Width
	MapViewArea.Width = mapBasePanel.Width
	'MapViewArea.GetCenter
	MapViewArea.FitMapToBoundingBox(MarkersBallons.GetBoundingBox)
End Sub

Sub listPedidosMap_ItemClick (Index As Int, Value As Object)
	panelRequestOptions.Visible = False
	Log(Value)
	
	Dim p As Panel  = listPedidosMap.GetPanel(Index)
	Dim schecklist As Label = p.GetView(0)
	Dim reference As Label = p.GetView(1)
	Dim name As Label = p.GetView(2)
	Dim contact As Label = p.GetView(5)
	Dim lst As List = Regex.Split("\|", name.Tag)
	Dim MarkerThis As Marker
	MarkerThis.Initialize4(reference.text, name.text, $"${schecklist.Text}, ${contact.Text}"$, lst.Get(0), lst.Get(1), Null)
	Dim posis As Int = -1
	For i=0 To Markers.Size-1
		Dim m As Marker = Markers.Get(i)
		If m.UniqueId <> Null Then
			Dim s As String = m.UniqueId
			If (s = reference.text) Then
				posis = i
				Exit
			End If
			Log($"${s}, ${reference.text}, ${i}, ${posis}"$)
		Else
			Log("M is NULL!")
		End If
	Next
	If (posis >= 0) Then
		MarkersBallons.FocusedMarker = Markers.Get(posis)
	End If
End Sub

Sub mapZoomUp_Click
	MapViewArea.ZoomIn
End Sub

Sub mapZoomDown_Click
	MapViewArea.ZoomOut
End Sub

Sub listButAttachMap_Click
	
End Sub

Sub listButInfoMap_Click
	
End Sub

Sub butRequestAction_Click
'	Dim p As Panel
'	p.LoadLayout("RequestView")
'	'p.Color = Colors.Black
End Sub

Sub butRequestRun_Click
'	getPanelCLDesc (Index As Int) As String
'   Dim pnl As Panel = listPedidos.GetPanel(Index)
'	Dim lbl As Label = pnl.GetView(1)
'	'CallSubDelayed2(CheckList, "StartCLActivity", lbl.Text)
'	Return lbl.Text
	CallSubDelayed3(CheckList, "StartCLActivity", getPanelCLDesc(CurrentIndexPanel), getPanelCLCustomer(CurrentIndexPanel))
	CurrentIndexPanel = -1
	CurrentIDPanel = 0
	panelRequestOptions.Visible = False
End Sub

Sub butRequestInfo_Click
'	Dim p As Panel
'	p.LoadLayout("RequestActionView")

	Dim pnl As Panel = listPedidos.GetPanel(CurrentIndexPanel)
	Dim interv As Intervention = pnl.tag
	Dim Sql As String = $"${DBStructures.SQL_GETREQUESTS_DATA} where a.request_number='${interv.code}'"$
	
	Private Row As Int = 0
	Private Record As Cursor
	Record = Starter.LocalSQL.ExecQuery(Sql)
	If Record.RowCount > 0 Then
		Record.Position = Row

		labelRequestInfoTitle.Text = Record.GetString("name")
		lblInfoReq_Code.Text = Record.GetString("request_number")
		lblInfoReq_Date.Text = Record.GetString("request_date")
		lblInfoReq_STime.Text = Record.GetString("request_stime")
		lblInfoReq_ETime.Text = Record.GetString("request_etime")
		
		lblInfoReq_Address.Text = Record.GetString("address")
		lblInfoReq_Address2.Text = Record.GetString("address2")
		lblInfoReq_PostalCode.Text = Record.GetString("postal_code")
		lblInfoReq_Local.Text = Record.GetString("city")
		
		lblInfoReq_Latitude.Text = Record.GetString("latitude")
		lblInfoReq_Longitude.Text = Record.GetString("longitude")
		
		lblInfoReq_State.Text = Record.GetString("status_desc")
		lblInfoReq_DateRun.Text = ""
		lblInfoReq_SRun.Text = Record.GetString("run_start")
		lblInfoReq_ERun.Text = Record.GetString("run_end")
		
		lblInfoReq_Contact.Text = Record.GetString("contact_name")
		lblInfoReq_Phone.Text = Record.GetString("contact_phone")
		lblInfoReq_Notes.Text = Record.GetString("status_notes")
		

	End If
	Record.Close

	panelRequestOptions.Visible = False
	panelRequestInfo.Visible = True
	InfoDataWindows = panelRequestInfo.Visible
End Sub

Sub butRequestClosePanel_Click
'	Private panelRequestOptions As Panel
'	Private butRequestInfo As Button
'	Private butRequestRun As Button
'	Private butRequestAction As Button
'	Private butRequestClosePanel As Button
	panelRequestOptions.Visible = False
End Sub

Sub ListsReturn(Arg As String)
	' Return from Lists
End Sub

Sub butCarRunning_Click
	
End Sub

Sub butRequestInfoClose_Click
	panelRequestInfo.Visible = False
	'CurrentTabPage
	InfoDataWindows = panelRequestInfo.Visible
End Sub

Sub ButtonUserUnavailable_Click
	
End Sub

Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub mapUserPosition_Click
	MarkersBallons.FocusedMarker = MarkMyPosition
End Sub