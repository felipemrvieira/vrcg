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
	Dim FocusedMarker, Marker1 As Marker
	Dim MarkMyPosition As BalloonMarker
	
	Dim MapCenter As GeoPoint
	Dim TileSource As String
	Dim ZoomLevel As Int
	Dim MarkersObj As List
	Dim MapFirstTime As Boolean
	
	Private MyPositionLat, MyPositionLon As String
End Sub

Sub Globals
	Dim Icon As BitmapDrawable
	Dim MapViewAreaObj As MapView
	'	create the MarkersBalloonOverlay
	Dim MarkersBallonsObj As MarkersBalloonOverlay
	Private Bloco30 As Int = 0

	
	Private listsTabPanel As TabStrip
	Private listsButtonClose As Button
	Private recObjects As StructObjects
	Private listObjects As CustomListView
	Private planObjectsList As CustomListView
	
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelCopyright As Label
	Private ButtonUserUnavailable As Button
	Private mapData As Panel
	Private mapZoomUp As Button
	Private mapZoomDown As Button
	Private listItemsMap As CustomListView
	Private listItemsButtonMap As Button
	
	Private ListItemReference As Label
	Private ListItemObject As Label
	Private ListItemStatusPanel As Panel
	Private ListItemDescription As Label
	Private listButMap As Button
	Private ListItemEntity As Label
	Private listObjects As CustomListView
	
	Private ItemsCounter As Int = 0
	Public ObjectsList As List
	
	Private RegionsList, TypeObjectsList, ObjRequests, LocalsList, ObjRequestsNotToday As List
	Private IsFiltered As Boolean = False
	Private iDialogReqTypeObject, iDialogReqStatus, iDialogReqRegion, iDialogReqLocal, iDialogReqWithRequests As Int
	Private sDialogReqName, sDialogReqAddress As String
	Private LabelAppInfo As Label
	Private butSearch As Button
	Private EditSearch As EditText
	Private ListItemTodayRequests As Label
	
	
	Private noRecordsPanel As Panel
	Private noRecordsLabel As Label
	Private listButRefresh As Button
	Private listsLabelInfo As Label
	Private mapUserPosition As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("objectsLayout")
	listsTabPanel.LoadLayout("objects_listview", "Listagem")
	'listsTabPanel.LoadLayout("objects_planningview", "Planeamento")
	listsTabPanel.LoadLayout("objects_mapview", "Mapa")

	recObjects.Initialize(Activity, Array As CustomListView(listObjects, planObjectsList))
	
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 50%x
	Next
	
	MarkersObj.Initialize
	Bloco30 = Activity.Width / 3
	Dim p As Panel = listItemsMap.AsView
	p.Width = Bloco30
	MapViewAreaObj.Initialize("")
	mapData.AddView(MapViewAreaObj, 0, 0, 100%x, 100%y)
	MapViewAreaObj.SetMultiTouchEnabled(True)
	MapViewAreaObj.SetZoomEnabled(True)
	MarkersBallonsObj.Initialize(MapViewAreaObj, "MarkersBallonsObjActions", "balloon_overlay")
	MapViewAreaObj.AddOverlay(MarkersBallonsObj)
	MapFirstTime = FirstTime
	Icon.Initialize(LoadBitmap(File.DirAssets, "my_icon_blue.png"))
	MarkMyPosition.Initialize(ShareCode.SESS_UserName, "", LocationService.GeoLocal.lat, LocationService.GeoLocal.lon, Icon)
	MarkMyPosition.LayoutName="custom_balloon_overlay"
	MarkersObj.Add( MarkMyPosition )
	
	'objects_planItemView
	'objects_planDatesView
	LabelCopyright.Text = "X-Evolution,Lda"
	If ShareCode.USR_STATE = 0 Then
		ButtonUserUnavailable.Visible = True
		ButtonUserUnavailable.Enabled = True
	End If
	
	RegionsList.Initialize
	TypeObjectsList.Initialize
	TypeObjectsList = DBStructures.GetListOfObjectsTypes
	
	
	LocalsList.Initialize
	LocalsList = DBStructures.GetListOfEntitiesLocal
	
	Dim where As String = $"tagcode in (select distinct object from requests where request_date='${ShareCode.CURRENT_APPDATE}')"$
	ObjRequests = DBStructures.GetListOfFromWhere("objects", "tagcode", where)
	
	Dim s As String = Utils.StrList2SQLArray(ObjRequests)
	Dim where As String = $"tagcode in (select distinct object from requests where object not in ${s})"$
	ObjRequestsNotToday = DBStructures.GetListOfFromWhere("objects", "tagcode", where)

	Log(ObjRequests)
End Sub

Sub MarkersBallonsObjActions_BalloonClick(ViewTag As String)
	Log("The Balloon View with Tag of '"&ViewTag&"' was Clicked")
'	FocusedMarker=MarkersBallons.FocusedMarker
'	Select ViewTag
'		Case "MyDescriptionTag"
'			Log("Do something")
'		Case "MoreInfoTag"
'			Log("Show more information for FocusedMarker")
'	End Select
End Sub

Sub MarkersBallonsObjActions_BalloonLongClick(ViewTag As String)
	Log("The Balloon View with Tag of '"&ViewTag&"' was LongClicked")
End Sub

Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	FocusedMarker=MarkersBallonsObj.FocusedMarker
	MapCenter=MapViewAreaObj.GetCenter
	TileSource=MapViewAreaObj.GetTileSource
	ZoomLevel=MapViewAreaObj.Zoom
End Sub

Sub CancelAllFilters(run As Boolean)
	IsFiltered  = False
	iDialogReqTypeObject = 0
	iDialogReqStatus = 0
	iDialogReqRegion = 0
	iDialogReqLocal = 0
	iDialogReqWithRequests = 0
	sDialogReqName = ""
	sDialogReqAddress = ""
	StartObjectsActivity(True, "")
End Sub

Sub SetTheFilters(flt As ObjectFilter)
	'RequestFilter(SDate As String, EDate As String, State As Int, CheckList As Int, Entity As Int)
	'MakeObjectFilter(TypeObject As Int, Status As Int, Region As Int, Local As Int, Name As String, Address As String, Requests As Int) As ObjectFilter
	'dialog_filterObject
	IsFiltered  = True
	Dim Filter As String = ""
	iDialogReqTypeObject = flt.TypeObject
	iDialogReqStatus = flt.Status
	iDialogReqRegion = flt.Region
	iDialogReqLocal = flt.Local
	iDialogReqWithRequests = flt.Requests
	sDialogReqName = flt.Name
	sDialogReqAddress = flt.Address
	If (sDialogReqName <> "") Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(a.entity_name like '%${sDialogReqName}%')"$
	End If
	If (sDialogReqAddress <> "") Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(b.address like '%${sDialogReqAddress}%')"$
	End If
	
	If (iDialogReqStatus > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		If (iDialogReqStatus = 1) Then
			Filter = $"${Filter}(a.status_id=1)"$
		Else
			Filter = $"${Filter}(a.status_id=0)"$
		End If
	End If
	
	If (iDialogReqTypeObject > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(a.type=${iDialogReqTypeObject})"$
	End If
	
	If (iDialogReqLocal > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(b.city='${LocalsList.Get(iDialogReqLocal-1)}')"$
	End If
	
	If (iDialogReqWithRequests = 1) Then
		Dim sList As String = ""
		For i=0 To ObjRequests.Size-1
			If (sList <> "") Then sList = $"${sList},"$
			sList = $"${sList}'${ObjRequests.Get(i)}'"$
		Next
		If (sList <> "") Then
			If (Filter <> "") Then Filter = $"${Filter} and "$
			Filter = $"${Filter}(a.tagcode in (${sList}))"$
		End If
	End If
	Log(Filter)
	StartObjectsActivity(True, Filter)
End Sub

Sub EditReturn(arg As String)
	'
End Sub

Sub FitMap_Click
	MapViewAreaObj.FitMapToBoundingBox(MarkersBallonsObj.GetBoundingBox)
End Sub

Public Sub UpdateMyPosition(Lat As String, Lon As String)
	If (LabelAppInfo.IsInitialized) Then
		MyPositionLat = Lat
		MyPositionLon = Lon
		LabelAppInfo.Text =  $"Latitude: ${MyPositionLat}, Longitude: ${MyPositionLon}"$
	End If
	
	If (MarkersObj.IsInitialized) Then
		ChangeMyPosition
	End If
End Sub

Public Sub ChangeMyPosition
	If (MarkersObj.Size > 0) Then
		If ((MyPositionLat <> $"${MarkMyPosition.GeoPoint.Latitude}"$) Or (MyPositionLon <> $"${MarkMyPosition.GeoPoint.Longitude}"$)) Then
			Log("Changing position")
			MarkersObj.RemoveAt(MarkersObj.IndexOf(MarkMyPosition))
			MarkMyPosition.Initialize("Eu", "", MyPositionLat, MyPositionLon, Icon)
			MarkersObj.Add( MarkMyPosition )
			
			MarkersBallonsObj.RemoveMarkers   '.RemoveMarker(MarkMyPosition)
			MarkersBallonsObj.AddMarkers(MarkersObj)
		End If
	End If
	
End Sub

Sub StartObjectsActivity(Clear As Boolean, Filter As String)
	If Clear Then
		listObjects.Clear
		MarkersObj.Clear
		MarkersObj.Add( MarkMyPosition )
		MarkersBallonsObj.RemoveMarkers
	End If
	
	Dim height As Int = 65dip
	Private Record As Cursor
	ItemsCounter = 0
	Dim SQL As String = DBStructures.SQL_CURRENT_OBJECTS
	If (Filter <> "") Then
		SQL = $"${SQL} where ${Filter}"$
	End If
	SQL = $"${SQL} order by b.name"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		For Row = 0 To Record.RowCount-1
			ItemsCounter = ItemsCounter + 1
			Record.Position = Row
			
'			Dim status_id As Int = Record.GetInt("status_id")
			Dim status_color As String = Record.GetString("status_color")
			Dim tagcode As String = Record.GetString("tagcode")
			
			If (ObjRequests.IndexOf(tagcode) >= 0) Then
				status_color = "BLUE"
			End If
	
			Dim bd As BitmapDrawable
			bd.Initialize(Utils.CreateMapIcon(ItemsCounter, status_color))
		
			listObjects.Add( CreateListItem(ItemsCounter, Record, listObjects.AsView.Width, height, bd, ObjRequests,ObjRequestsNotToday), height, "" )
		Next
	End If
	Record.Close
	
	MarkersBallonsObj.AddMarkers(MarkersObj)
	If MapFirstTime Then
		TileSource="Mapnik"
		MapViewAreaObj.FitMapToBoundingBox(MarkersBallonsObj.GetBoundingBox)
		MarkersBallonsObj.FocusedMarker = MarkMyPosition
	Else
		MapViewAreaObj.Zoom=ZoomLevel
		MapViewAreaObj.SetCenter3(MapCenter)
		If FocusedMarker<>Null Then
			MarkersBallonsObj.FocusedMarker = FocusedMarker
		End If
	End If
End Sub


'Sub CreateListItem(cnt As Int, colitems As Map, Width As Int, height As Int, bd As BitmapDrawable) As Panel
Sub CreateListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable, req As List, nreq As List) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	'p.LoadLayout("objects_itemview")
	p.LoadLayout("objects_itemView2")
	p.RemoveView
	
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim status_color As String = colitems.GetString("status_color")
'	Dim local As Map = colitems.GetString("local")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim status_id As Int = colitems.GetInt("status_id")
	
	Dim name As String = colitems.GetString("name")
'	Dim details As String = colitems.Get("details")

	Dim contact_name As String = colitems.GetString("contact_name")
	Dim contact_phone As String = colitems.GetString("contact_phone")
	
	Dim entity As String = colitems.GetString("entity")
	Dim entity_name As String = colitems.GetString("entity_name")
	
	Dim address As String = colitems.GetString("address")
	Dim address2 As String = colitems.GetString("address2")
	Dim postal_code As String = colitems.GetString("postal_code")
	Dim city As String = colitems.GetString("city")
	
	ListItemObject.text = $"#${cnt} - ${name}"$
	Dim stat As String = $"${status_desc}"$
	ListItemReference.text = $"${tagcode} - ${stat}"$
	ListItemReference.Tag = tagcode
	
	If (address2 <> "") Then address2 = $",${address2}"$
	Dim ThisAddress As String = $"${address}${address2},${postal_code} ${city}"$
	ListItemDescription.text = ThisAddress
	
	'ListItemDescription.text = $"${address}, ${postal_code} ${city}, ${latitude}|${longitude}"$
	'ListItemDescription.text = $"${details}"$
	ListItemEntity.text = $"${entity_name}"$
	ListItemEntity.Tag = entity

	listButMap.Tag = $"${latitude}|${longitude}"$

	ListItemStatusPanel.Color = Utils.ColorString(status_color)
	ListItemStatusPanel.Tag = status_id
'	
'	If (req.IndexOf(tagcode) >= 0) Then
'		ListItemTodayRequests.TextColor = Consts.ColorBlue
'	End If
	
	If (status_id = 0) Then
		ListItemTodayRequests.TextColor = Consts.ColorGray
		ListItemTodayRequests.Text = Chr(0xF088)
	Else
		If (req.IndexOf(tagcode) >= 0) Then
			ListItemTodayRequests.TextColor = Consts.ColorGreen
			ListItemTodayRequests.Text = Chr(0xF017)
		Else
			If (nreq.IndexOf(tagcode) >= 0) Then
				ListItemTodayRequests.TextColor = Consts.ColorBlue
				ListItemTodayRequests.Text = Chr(0xF073)
			Else
				ListItemTodayRequests.Visible = False
			End If
		End If
	End If
	
	Dim address2 As String = colitems.GetString("address2")
	If (address2 <> "") Then address2 = $",${CRLF}${address2}"$
	Dim ThisAddress As String = $"${address}${address2},${postal_code} ${city}"$
	Marker1.Initialize4(tagcode, entity_name, $"${ThisAddress}${CRLF}${contact_name} - ${contact_phone}"$, latitude, longitude, bd)
	MarkersObj.Add(Marker1)
	p.Tag = tagcode
	Return p
End Sub

Sub listsButtonClose_Click
	MarkersBallonsObj.UnsetFocusedMarker
	FocusedMarker = MarkersBallonsObj.FocusedMarker
	CallSubDelayed2(Main, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listObjects_ItemClick (Index As Int, Value As Object)
	Dim pnl As Panel = listObjects.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(1)
	listsLabelInfo.Text = $"${lbl.Text}"$
	CallSubDelayed2(ObjectEdit, "StartObjectActivity", pnl.tag)
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub ButtonUserUnavailable_Click
	
End Sub

'$"select a.type, a.tagcode, a.name, a.details, a.status_id, a.status_desc, a.status_color, a.last_execution,
'												a.status_notes, a.contrat_tagcode, a.local, a.entity, a.have_scheme, a.scheme_plant,
'												b.name as entity_name, d.title, d.tagcode as typecode, 
'												c.address, c.address2, c.postal_code, c.city, c.latitude, c.longitude, 
'												ifnull(c.region, '') region, ifnull(c.district, '') district, c.country
'												from objects as a
'												inner join entities as b on (b.tagcode=a.entity)
'												inner join locals as c on (c.tagcode=a.local)
'												left join type_objects as d on (d.id=a.type)"$

Sub GetObjectMapInfo(tagcode As String) As ObjectInformation
	'ObjectInformation(tagcode As String, iType As Int, Name As String, Address As String, Address2 As String, Cpostal As String, _
	'City As String, CtnPhone As String, CtnName As String, Latitude As String, Longitude As String, asNew As Boolean) As ObjectInformation
	
	Private Record As Cursor
	ItemsCounter = 0
	Dim SQL As String = $"${DBStructures.SQL_CURRENT_OBJECTS} where a.tagcode='${tagcode}'"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim ret As ObjectInformation = Types.MakeObjectInformation(tagcode, _
							Record.GetInt("type"), _
							Record.GetString("entity_name"), _
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


Sub listButMap_Click
	Dim b As Button = Sender
	Dim p As Panel  = b.Parent
	Dim ret As ObjectInformation = GetObjectMapInfo(p.Tag)
	
'	Dim reference As Label = p.GetView(0)
'	Dim name As Label = p.GetView(1)
'	Dim entity As Label = p.GetView(2)
'	Dim lst As List = Regex.Split("\|", b.Tag)
'
'	Log( $"Name: ${name}, Tag: ${b.Tag}"$)
	Dim ThisAddress As String = $"${ret.Address},${ret.Address2}${CRLF}${ret.CPostal} ${ret.City}"$

	listsTabPanel.ScrollTo(1, True)
	Dim MarkerThis As Marker
	
	'MarkerThis.Initialize4(reference.tag, entity.text, $"${name.Text}, ${entity.Text}"$, lst.Get(0), lst.Get(1), Null)
	MarkerThis.Initialize4(ret.Tagcode, ret.Name, $"${ThisAddress}${CRLF}${ret.CtnName} - ${ret.CtnPhone}"$, ret.Latitude, ret.Longitude, Null)
	Dim posis As Int = -1 'MarkersBallonsObj.FocusedMarker = MarkerThis
	For i=0 To MarkersObj.Size-1
		Dim m As Marker = MarkersObj.Get(i)
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
		MarkersBallonsObj.FocusedMarker = MarkersObj.Get(posis)
	End If
End Sub

Sub mapZoomDown_Click
	MapViewAreaObj.ZoomOut
End Sub

Sub mapZoomUp_Click
	MapViewAreaObj.ZoomIn
End Sub

Sub listItemsButtonMap_Click
	
End Sub

Sub listItemsMap_ItemClick (Index As Int, Value As Object)
	
End Sub


Sub listsButtonFilter_Click
	Dim Filter As AppDialogs
	Filter.Initialize
	Dim Curr As ObjectFilter = Types.MakeObjectFilter( iDialogReqTypeObject,  iDialogReqStatus, iDialogReqRegion, iDialogReqLocal,  _
					sDialogReqName, sDialogReqAddress, iDialogReqWithRequests)
	Filter.GetObjectFilterDialog("Objectos", Curr, TypeObjectsList, RegionsList, LocalsList)
End Sub

	'RequestFilter(SDate As String, EDate As String, State As Int, CheckList As Int, Entity As Int)
	'MakeObjectFilter(TypeObject As Int, Status As Int, Region As Int, Local As Int, Name As String, Address As String, Requests As Int) As ObjectFilter
	'dialog_filterObject


Sub EditSearch_EnterPressed
	MakeListSearch(EditSearch.Text)
End Sub

Sub butSearch_Click
	MakeListSearch(EditSearch.Text)
End Sub

Sub MakeListSearch(search As String)
	Dim Filter As String = $"d.title||a.tagcode||a.status_desc||a.name||c.address||c.postal_code||c.city||b.name like '%${search}%'"$
	StartObjectsActivity(True, Filter)
End Sub

Sub listButRefresh_Click
	
End Sub

Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub mapUserPosition_Click
	MarkersBallonsObj.FocusedMarker = MarkMyPosition
End Sub