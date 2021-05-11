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
	Dim FocusedMarker, Marker1 As Marker
	Dim MarkMyPosition As BalloonMarker
	
	Dim MapCenter As GeoPoint
	Dim TileSource As String
	Dim ZoomLevel As Int
	Dim Markers As List
	Dim MapFirstTime As Boolean
	
	Private MyPositionLat, MyPositionLon As String
	
'	Dim FocusedMarker, Marker0, Marker1, Marker2, Marker3 As Marker
'	Dim MapCenter As GeoPoint
'	Dim TileSource As String
'	Dim ZoomLevel As Int
End Sub

Sub Globals
	Dim Icon As BitmapDrawable
'	Dim xui As XUI
	Dim MapViewAreaEnt As MapView
	Dim TileSourceSpinner As Spinner
	Dim MarkersBallonsEnt As MarkersBalloonOverlay
	Private ButtonUserUnavailable As Button
	
	Private listsBasePanel As Panel
	Private listsBottomLine As Panel
	Private listsBottomPanel As Panel
	Private listsButtonClose As Button
	Private listsLabelInfo As Label
	Private listsTabPanel As TabStrip
	Private listsTopBar As Panel
	Private listEntities As CustomListView
	Private mapData As Panel
	Private listButMap As Button
	Private ListItemDescription As Label
	Private ListItemFullName As Label
	Private ListItemStatusPanel As Panel
	Private listsButtonFilter As Button
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelAppInfo As Label
	Private LabelCopyright As Label
	Private ListItemReference As Label
	Private ListItemContact As Label
	Private listPedidosMap As CustomListView
	Private listPedidosButtonMap As Button
	Private ShowListPedidosMap As Boolean = False
	Private Bloco30 As Int = 0
	Private mapBaseList As Panel
	Private mapBasePanel As Panel
	Private mapZoomDown As Button
	Private mapZoomUp As Button
	Private ListItemType As Label
	Private ListItemStatus As Label
	Private ItemsCounter As Int = 0
	Private butSearch As Button
	Private EditSearch As EditText
	Private ListItemTodayRequests As Label
	Private ListItemNif As Label
	Private IsFiltered As Boolean = False
	Private iDialogReqTypeEntity, iDialogReqStatus, iDialogReqRegion, iDialogReqLocal, iDialogReqWithRequests As Int
	Private sDialogReqName, sDialogReqAddress, SearchFilter As String
	Private RegionsList, TypeEntitiesList, LocalsList, EntRequests, EntRequestsNotToday As List
	Private mapUserPosition As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	'prvd.Initialize
	Activity.LoadLayout("entitiesLayout")
	listsTabPanel.LoadLayout("entities_listview", ShareCode.TABGeneral_ListingTitle)
	listsTabPanel.LoadLayout("entities_mapview", ShareCode.TABGeneral_MapTitle)
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 50%x  '33.33%x
	Next
	
	Markers.Initialize
	Bloco30 = Activity.Width / 3
	Dim p As Panel = listPedidosMap.AsView
	p.Width = Bloco30
	MapViewAreaEnt.Initialize("MapViewAreaEntTouch")
	mapData.AddView(MapViewAreaEnt, 0, 0, 100%x, 100%y)
	MapViewAreaEnt.SetMultiTouchEnabled(True)
	MapViewAreaEnt.SetZoomEnabled(True)
	MarkersBallonsEnt.Initialize(MapViewAreaEnt, "MarkersBallonsEntActions", "balloon_overlay")
	MapViewAreaEnt.AddOverlay(MarkersBallonsEnt)
	MapFirstTime = FirstTime
	Icon.Initialize(LoadBitmap(File.DirAssets, "my_icon_blue.png"))
	
	MarkMyPosition.Initialize(ShareCode.SESS_UserName, "", LocationService.GeoLocal.lat, LocationService.GeoLocal.lon, Icon)
	MarkMyPosition.LayoutName="custom_balloon_overlay"
	'Dim Marker4 As BalloonMarker
	'MarkMyPosition.lay
	Markers.Add( MarkMyPosition )
	
	If FirstTime Then
		'
	End If

	LabelCopyright.Text = "X-Evolution,Lda"
	If ShareCode.USR_STATE = 0 Then
		ButtonUserUnavailable.Visible = True
		ButtonUserUnavailable.Enabled = True
	End If
	
	RegionsList.Initialize
	TypeEntitiesList.Initialize
	TypeEntitiesList = DBStructures.GetListOfEntitiesType
	LocalsList.Initialize
	LocalsList = DBStructures.GetListOfEntitiesLocal
	
	Dim where As String = $"tagcode in (select distinct entity from requests where request_date='${ShareCode.CURRENT_APPDATE}')"$
	EntRequests = DBStructures.GetListOfFromWhere("entities", "tagcode", where)
	Log(EntRequests)
	Dim s As String = Utils.StrList2SQLArray(EntRequests)
	Dim where As String = $"tagcode in (select distinct entity from requests where entity not in ${s})"$
	EntRequestsNotToday = DBStructures.GetListOfFromWhere("entities", "tagcode", where)
	Log(EntRequestsNotToday)
	SearchFilter = ""
	
	
End Sub

'MarkerClick (SelectedMarker As Marker) As Boolean

Sub MarkersBallonsEntActions_BalloonClick(ViewTag As String)
	Log("The Balloon View with Tag of '"&ViewTag&"' was Clicked")
'	FocusedMarker=MarkersBallonsEnt.FocusedMarker
'	Select ViewTag
'		Case "MyDescriptionTag"
'			Log("Do something")
'		Case "MoreInfoTag"
'			Log("Show more information for FocusedMarker")
'	End Select
End Sub

Sub MarkersBallonsEntActions_BalloonLongClick(ViewTag As String)
	Log("The Balloon View with Tag of '"&ViewTag&"' was LongClicked")
End Sub

Sub Activity_Resume
	'MarkersBallonsEnt.FocusedMarker = Markers.Get(Markers.IndexOf(MarkMyPosition))
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	FocusedMarker=MarkersBallonsEnt.FocusedMarker
	MapCenter=MapViewAreaEnt.GetCenter
	TileSource=MapViewAreaEnt.GetTileSource
	ZoomLevel=MapViewAreaEnt.Zoom
End Sub

Sub CancelAllFilters(run As Boolean)
	IsFiltered  = False
	iDialogReqTypeEntity = 0
	iDialogReqStatus = 0
	iDialogReqRegion = 0
	iDialogReqLocal = 0
	iDialogReqWithRequests = 0
	sDialogReqName = ""
	sDialogReqAddress = ""
	StartListActivity(True, "")
End Sub

Sub SetTheFilters(flt As EntityFilter)
	'RequestFilter(SDate As String, EDate As String, State As Int, CheckList As Int, Entity As Int)
	IsFiltered  = True
	Dim Filter As String = ""
	iDialogReqTypeEntity = flt.TypeEntity
	iDialogReqStatus = flt.Status
	iDialogReqRegion = flt.Region
	iDialogReqLocal = flt.Local
	iDialogReqWithRequests = flt.Requests
	sDialogReqName = flt.Name
	sDialogReqAddress = flt.Address
	If (sDialogReqName <> "") Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(a.name like '%${sDialogReqName}%')"$
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
	
	If (iDialogReqTypeEntity > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(a.type=${iDialogReqTypeEntity})"$
	End If
	
	If (iDialogReqLocal > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(b.city='${LocalsList.Get(iDialogReqLocal-1)}')"$
	End If
	
	If (iDialogReqWithRequests = 1) Then
		Dim sList As String = ""
		For i=0 To EntRequests.Size-1
			If (sList <> "") Then sList = $"${sList},"$
			sList = $"${sList}'${EntRequests.Get(i)}'"$
		Next
		If (sList <> "") Then
			If (Filter <> "") Then Filter = $"${Filter} and "$
			Filter = $"${Filter}(a.tagcode in (${sList}))"$
		End If
	End If
	Log(Filter)
	
	
'	'TypeEntitiesList = DBStructures.GetListOfEntitiesType
'	'LocalsList = DBStructures.GetListOfEntitiesLocal
'	
''	Select a.type, a.typedesc, a.id, a.tagcode, ifnull(a.lastvisit, '') lastvisit, a.status_id, a.status_desc, a.status_color,
''												a.name, ifnull(local, '') local, b.address, ifnull(b.address2, '') address2, b.postal_code, b.city, 
''												b.latitude, b.longitude, ifnull(a.contact_name, '') contact_name, ifnull(a.notes, '') notes,
''												ifnull(a.contact_phone, '') contact_phone, ifnull(contract, '') contract, ifnull(a.nifnumber, '') nifnumber
'	If (flt.EDate <> "") Then FilterEndDate = flt.EDate
'	If (flt.CheckLst > 0) Then FilterChecklist = flt.CheckLst
'	If (flt.Entity > 0) Then FilterEntity = flt.Entity
'	If (flt.State >= 0) Then FilterStates = flt.State
	StartListActivity(True, Filter)
End Sub

Sub EditReturn(arg As String)
	'
End Sub

Sub FitMap_Click
	MapViewAreaEnt.FitMapToBoundingBox(MarkersBallonsEnt.GetBoundingBox)
End Sub

Sub TileSourceSelect_ItemClick (Position As Int, Value As Object)
	'MapViewAreaEnt.SetTileSource(Value)
End Sub

Sub StartListActivity(Clear As Boolean, Filter As String)
	
	If (Starter.EntityKeepFilter = True) Then
		Starter.EntityKeepFilter = False
		If (Starter.EntitySearchFilter <> "") Then
			Dim sFilter As String = Starter.EntitySearchFilter
			Starter.EntitySearchFilter = ""
			Starter.EntityFilter = Types.MakeEntityFilter(0, 0, 0, 0, "", "", 0)
			StartListActivity(True, sFilter)
		Else
			Dim tFilter As EntityFilter = Starter.EntityFilter
			Starter.EntityFilter = Types.MakeEntityFilter(0, 0, 0, 0, "", "", 0)
			Starter.EntitySearchFilter = ""
			SetTheFilters(tFilter)
		End If
	Else

		If Clear Then
			listEntities.Clear
			Markers.Clear
			Markers.Add( MarkMyPosition )
			MarkersBallonsEnt.RemoveMarkers
		End If
		
		Dim height As Int = 85dip
		Private Record As Cursor
		ItemsCounter = 0
		Dim SQL As String = DBStructures.SQL_CURRENT_ENTITIES
		If (Filter <> "") Then
			SQL = $"${SQL} where ${Filter}"$
		End If
		SQL = $"${SQL} order by a.name"$
		Record = Starter.LocalSQL.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				ItemsCounter = ItemsCounter + 1
				Record.Position = Row
				
	'			Dim status_id As Int = Record.GetInt("status_id")
				Dim status_color As String = Record.GetString("status_color")
				Dim tagcode As String = Record.GetString("tagcode")
				
				If (EntRequests.IndexOf(tagcode) >= 0) Then
					status_color = "BLUE"
				End If
				
				Dim bd As BitmapDrawable
				bd.Initialize(Utils.CreateMapIcon(ItemsCounter, status_color))
			
				listEntities.Add( CreateListItem(ItemsCounter, Record, listEntities.AsView.Width, height, bd, EntRequests, EntRequestsNotToday), height, "" )
				listPedidosMap.Add( CreateListItemMap(ItemsCounter, Record, listPedidosMap.AsView.Width, 65dip, bd, EntRequests, EntRequestsNotToday), 65dip, "" )
				'
				'
			Next
		End If
		Record.Close
		
		MarkersBallonsEnt.AddMarkers(Markers)
		If MapFirstTime Then
			TileSource="Mapnik"
			MapViewAreaEnt.FitMapToBoundingBox(MarkersBallonsEnt.GetBoundingBox)
			MarkersBallonsEnt.FocusedMarker = MarkMyPosition
		Else
			MapViewAreaEnt.Zoom=ZoomLevel
			MapViewAreaEnt.SetCenter3(MapCenter)
			If FocusedMarker<>Null Then
				MarkersBallonsEnt.FocusedMarker = FocusedMarker
			End If
		End If
	End If
End Sub

'Sub CreateListItem(cnt As Int, colitems As Map, Width As Int, height As Int, bd As BitmapDrawable) As Panel
Sub CreateListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable, req As List, nreq As List) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("entities_itemview")
	p.RemoveView
	
	Dim contact_name As String = colitems.GetString("contact_name")
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim contact_phone As String = colitems.GetString("contact_phone")
'	Dim have_contract As Int = colitems.GetInt("have_contract")
'	Dim lastvisit As String = colitems.Get("lastvisit")
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim name As String = colitems.GetString("name")
	Dim typedesc As String = colitems.GetString("typedesc")
	Dim address As String = colitems.GetString("address")
	Dim address2 As String = colitems.GetString("address2")
	Dim postal_code As String = colitems.GetString("postal_code")
	Dim city As String = colitems.GetString("city")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim status_color As String = colitems.GetString("status_color")
	Dim nifnumber As String = colitems.GetString("nifnumber")
	
	ListItemFullName.text = $"#${cnt} - ${name}"$
	ListItemContact.text = $"${contact_name} - ${contact_phone}"$
	ListItemStatus.Text = status_desc
	If (address2 <> "") Then address2 = $"${CRLF}${address2},"$
	Dim ThisAddress As String = $"${address},${address2}${CRLF}${postal_code} ${city}"$
	ListItemDescription.text = ThisAddress
	
	ListItemType.Text = typedesc
	ListItemNif.Text = nifnumber
	ListItemReference.text = tagcode
	ListItemReference.tag = tagcode
	listButMap.Tag = $"${latitude}|${longitude}"$
	ListItemStatusPanel.Color = Utils.ColorString(status_color)
	ListItemStatusPanel.Tag = status_id
	
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
	

	'Marker1.Initialize4(tagcode, name, $"${name}, ${contact_name} - ${contact_phone}"$, latitude, longitude, bd)
	Marker1.Initialize4(tagcode, name, $"${ThisAddress}${CRLF}${contact_name} - ${contact_phone}"$, latitude, longitude, bd)
	Markers.Add(Marker1)
	
'	p.Color = Colors.ARGB(255, 250,250,250)
'	If (status_id = 0) Then p.Color = Colors.ARGB(255, 197,197,197)
	
	p.Tag = tagcode
	Return p
End Sub

Sub CreateListItemMap(cnt As Int, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable, req As List, nreq As List) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("entities_itemMapView")
	p.RemoveView
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim name As String = colitems.GetString("name")
	Dim typedesc As String = colitems.GetString("typedesc")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	ListItemFullName.text = $"#${cnt} - ${name}"$
	ListItemFullName.Tag = $"${latitude}|${longitude}"$
	ListItemType.Text = typedesc
	ListItemTodayRequests.Tag = status_id
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

	p.Tag = tagcode
	Return p
End Sub

'Sub CreateListContractItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
'	Dim p As Panel
'	p.Initialize("")
'	Activity.AddView(p, 0, 0, Width, Height)
'	p.LoadLayout("entities_itemcontract")
'	p.RemoveView
'
'	Dim contract As Map = colitems.Get("contract")
'	Dim creation_date As String = contract.Get("creation_date")
'	Dim ctagcode As String = contract.Get("tagcode")
'	Dim valid_to As String = contract.Get("valid_to")
'	'Dim document_tagcode As String = contract.Get("document_tagcode")
'	Dim title As String = contract.Get("title")
'	Dim docfilename As String = contract.Get("docfilename")
'
'	Dim tagcode As String = colitems.Get("tagcode")
'	Dim name As String = colitems.Get("name")
'	Dim typedesc As String = colitems.Get("typedesc")
'
'	ListItemFullName.text = $"#${cnt} - ${name}"$
'	ListItemReference.text =  $"${typedesc}: ${tagcode}"$
'	ListItemContract.Text = $"Contrato: ${ctagcode},  Início: ${creation_date} - Fim: ${valid_to}"$
'	ListItemTitle.Text = title
'	'listButContract.Tag = $"${document_tagcode}"$
'	listButContract2.Tag = $"${docfilename}"$
'	Return p
'End Sub

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
			
			MarkersBallonsEnt.RemoveMarkers   '.RemoveMarker(MarkMyPosition)
			MarkersBallonsEnt.AddMarkers(Markers)
		End If
	End If
	
End Sub

Sub listsTabPanel_PageSelected (Position As Int)
	
End Sub

Sub listsButtonClose_Click
	If (IsFiltered) Then
		Dim i As Int
		i = Msgbox2("Tem um filtro activo. Deseja mante-lo para a próxima entrada?", "Alerta!", "Sim", "Não", "", Null)
		If (i=DialogResponse.POSITIVE) Then
			Starter.EntityKeepFilter  = True
			Starter.EntitySearchFilter = SearchFilter
			Starter.EntityFilter = Types.MakeEntityFilter(iDialogReqTypeEntity, iDialogReqStatus, iDialogReqRegion, _
							iDialogReqLocal, sDialogReqName, sDialogReqAddress, iDialogReqWithRequests)
		End If
	End If
	MarkersBallonsEnt.UnsetFocusedMarker
	FocusedMarker = MarkersBallonsEnt.FocusedMarker
	CallSubDelayed2(Main, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listsButtonAdd_Click
	
End Sub

Sub ListItemPanel_Click
	
End Sub

Sub GetEntityMapInfo(tagcode As String) As EntityInformation
	'MakeEntityInformation(tagcode As String, entType As Int, entName As String, entAddress As String, entAddress2 As String, entCpostal As String, _
	'entCity As String, entCtnPhone As String, entCtnName As String, entLatitude As String, entLongitude As String, asNew As Boolean) As EntityInformation
	
	Private Record As Cursor
	ItemsCounter = 0
	Dim SQL As String = $"${DBStructures.SQL_CURRENT_ENTITIES} where a.tagcode='${tagcode}'"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim ret As EntityInformation = Types.MakeEntityInformation(tagcode, _
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
		Dim ret As EntityInformation = Types.MakeEntityInformation(tagcode, 0, "", "", "", "", "", "", "", "", "", False) 
	End If
	Record.Close
	Return ret
End Sub

Sub listButMap_Click
	Dim b As Button = Sender
	Dim p As Panel  = b.Parent
	Dim ret As EntityInformation = GetEntityMapInfo(p.Tag)
	Dim ThisAddress As String = $"${ret.entAddress},${ret.entAddress2}${CRLF}${ret.entCPostal} ${ret.entCity}"$

	listsTabPanel.ScrollTo(1, True)  
	Dim MarkerThis As Marker
	MarkerThis.Initialize4(ret.Tagcode, ret.entName, $"${ThisAddress}${CRLF}${ret.entCtnName} - ${ret.entCtnPhone}"$, ret.entLatitude, ret.entLongitude, Null)
	Dim posis As Int = -1 'MarkersBallonsEnt.FocusedMarker = MarkerThis
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
		MarkersBallonsEnt.FocusedMarker = Markers.Get(posis)
	End If
End Sub

Sub listButInfo_Click
	
End Sub

Sub listButAttach_Click
	listsLabelInfo.Text = $"${Utils.GetFreeMem}"$
End Sub

Sub ListItemPanel_Touch (Action As Int, X As Float, Y As Float)
	listsLabelInfo.Text = "Touch Click"
End Sub

Sub ListItemPanel_LongClick

End Sub

Sub listsButtonFilter_Click
	Dim Filter As AppDialogs
	Filter.Initialize
	Dim Curr As EntityFilter = Types.MakeEntityFilter( iDialogReqTypeEntity,  iDialogReqStatus, iDialogReqRegion, iDialogReqLocal,  _
					sDialogReqName, sDialogReqAddress, iDialogReqWithRequests)
	Filter.GetEntityFilterDialog("Entities", Curr, TypeEntitiesList, RegionsList, LocalsList)
End Sub

Sub listPedidosButtonMap_Click
	If ShowListPedidosMap Then
		ShowListPedidosMap = False
		mapBaseList.Visible = False
'		mapBaseList.width = 1dip
'		mapBasePanel.Left = 2dip
'		mapBasePanel.Width = mapBasePanel.Width+Bloco30
		listPedidosButtonMap.Color = Colors.ARGB(150, 7, 167, 247)
		listPedidosButtonMap.Left = 10dip
'		MapViewAreaEnt.Width = mapData.Width
	Else
		ShowListPedidosMap = True
		mapBaseList.Visible = True
'		mapBaseList.width = Bloco30
'		mapBasePanel.Left = Bloco30+1dip
'		mapBasePanel.Width = mapBasePanel.Width-Bloco30
		listPedidosButtonMap.Color = Colors.ARGB(150, 7, 119, 167)
		listPedidosButtonMap.Left = 400dip
'		MapViewAreaEnt.Width = mapData.Width - mapBasePanel.Width
	End If
'	mapData.Width = mapBasePanel.Width
'	MapViewAreaEnt.Width = mapBasePanel.Width
	'MapViewAreaEnt.GetCenter
'	MapViewAreaEnt.FitMapToBoundingBox(MarkersBallonsEnt.GetBoundingBox)
End Sub

Sub listPedidosMap_ItemClick (Index As Int, Value As Object)
	Log(Value)
	
	Dim p As Panel  = listPedidosMap.GetPanel(Index)
	Dim name As Label = p.GetView(0)
	Dim lst As List = Regex.Split("\|", name.Tag)
	
	Dim MarkerThis As Marker
	MarkerThis.Initialize4(p.tag, name.text, "", lst.Get(0), lst.Get(1), Null)
	Dim posis As Int = -1
	For i=0 To Markers.Size-1
		Dim m As Marker = Markers.Get(i)
		If m.UniqueId <> Null Then
			Dim s As String = m.UniqueId
			If (s = p.tag) Then
				posis = i
				Exit
			End If
			Log($"${s}, ${p.tag}, ${i}, ${posis}"$)
		Else
			Log("M is NULL!")
		End If
	Next
	If (posis >= 0) Then
		MarkersBallonsEnt.FocusedMarker = Markers.Get(posis)
	End If
End Sub

Sub mapZoomUp_Click
	MapViewAreaEnt.ZoomIn
End Sub

Sub mapZoomDown_Click
	MapViewAreaEnt.ZoomOut
End Sub

Sub listButAttachMap_Click
	
End Sub

Sub listButInfoMap_Click
	
End Sub

Sub listEntities_ItemClick (Index As Int, Value As Object)
	Dim pnl As Panel = listEntities.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(1)
	listsLabelInfo.Text = $"${lbl.Text}"$
	
	'ProgressDialogShow("A carregar ...")
	CallSubDelayed2(EntityEdit, "StartEntityActivity", pnl.tag)
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listButDocuments_Click
	
End Sub

Sub listButContract_Click
	'ListItemDocButton.tag
	Dim l As Label = Sender
	
	Log(l.Tag)
	Dim p As Panel  = l.Parent
	
	Dim lidb As Label = p.GetView(8)
	
	Dim Filename As String = lidb.Tag
	Dim Continua As Boolean = True
	If Continua Then
		Private Provider As FileProvider
		Provider.Initialize
		Provider.InitializeSafeDir
		Dim theFile As String = Provider.GetFileUri(Filename)

		Log(theFile)
		Dim Intent1 As Intent
		Intent1.Initialize(Intent1.ACTION_VIEW, "file://" & theFile) 'File.DirInternal & Filename)
		Intent1.SetType("application/pdf")
		Dim pdfAppsList As List
		pdfAppsList = Utils.QueryIntent(Intent1)
		If pdfAppsList.size>0 Then
			' pdf viewer(s) exists
			Log("pdf viewer(s) exists")
			StartActivity(Intent1)
		End If
	End If
	
End Sub

Sub listContracts_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub listButContract2_Click
	Dim l As Label = Sender
	
	Log(l.Tag)
	Dim p As Panel  = l.Parent
	
	Dim lidb As Label = p.GetView(3)
	
	Dim Filename As String = lidb.Tag
	Dim Continua As Boolean = True
	If Continua Then
		Private Provider As FileProvider
		Provider.Initialize
		Provider.InitializeSafeDir
		Dim theFile As String = Provider.GetFileUri(Filename)

		Log(theFile)
		Dim Intent1 As Intent
		Intent1.Initialize(Intent1.ACTION_VIEW, "file://" & theFile) 'File.DirInternal & Filename)
		Intent1.SetType("application/pdf")
		Dim pdfAppsList As List
		pdfAppsList = Utils.QueryIntent(Intent1)
		If pdfAppsList.size>0 Then
			' pdf viewer(s) exists
			Log("pdf viewer(s) exists")
			StartActivity(Intent1)
		End If
	End If
End Sub

Sub ButtonUserUnavailable_Click
	
End Sub

Sub EditSearch_EnterPressed
	MakeListSearch(EditSearch.Text)
End Sub

Sub butSearch_Click
	MakeListSearch(EditSearch.Text)
End Sub

Sub MakeListSearch(search As String)
	Dim Filter As String = $"a.typedesc||a.tagcode||a.status_desc||a.name||b.address||b.postal_code||b.city||a.contact_name||a.contact_phone||a.nifnumber like '%${search}%'"$
	SearchFilter = Filter
	IsFiltered = (Filter <> "")
	StartListActivity(True, Filter)
End Sub

Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub mapUserPosition_Click
	MarkersBallonsEnt.FocusedMarker = MarkMyPosition
End Sub