B4A=true
Group=Main Forms
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
	
	Public Device As Phone
	'Dim MapCenter As GeoPoint
	Dim TileSource As String
	Dim ZoomLevel As Int
	Dim Markers As List
	Dim MapFirstTime As Boolean
	Private MyPositionLat, MyPositionLon As String
End Sub

Sub Globals
	Private xui As XUI
	Private StartingRow As Int = 0
	Private ReadRows As Int = 20		
	Private NextStartingRow As Int = 0
	Dim Icon As BitmapDrawable
	Dim CurrentFilter As String = ""
	Dim TileSourceSpinner As Spinner
	Private ButtonUserUnavailable As Button
	Private ThisDialog As CustomLayoutDialog
	
	Private listsBasePanel As Panel
	Private listsBottomLine As Panel
	Private listsBottomPanel As Panel
	Private listsButtonClose As Button
	Private listsLabelInfo As Label
	Private listsTabPanel As TabStrip
	Private listsTopBar As Panel
	Private listObjects As CustomListView
	'Private mapData As Panel
	Private listButMap As Button
	Private ListItemLocation As Label
	Private ListItemFullName As Label
'	Private ListItemStatusPanel As Panel
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
'	Private ListItemNif As Label
	Private IsFiltered As Boolean = False
	Private iDialogReqTypeObject, iDialogReqZone, iDialogReqStatus, iDialogReqRegion, iDialogReqLocal, iDialogReqWithRequests As Int
	Private sDialogReqName, sDialogReqAddress, SearchFilter As String
	Private RegionsList, TypeObjectsList, LocalsList, ObjRequests, ObjRequestsNotToday As List
	Private mapUserPosition As Button
	
	Private listsButtonType As Button
	Private listsButtonZone As Button
	Private listButSelect As Button
	Private ObjectTypePopMenu As MenuOnAnyView
	Private ObjectZonePopMenu As MenuOnAnyView
	
	Private labelTypeObjectFilter As Label
	Private ColorTabPanel As Panel
	
	Private CurrentLineItem As Int = 0
	Private TotalLineItems As Int = 0
	 
	Private mainLabelOptLists As Label
	Private mainLogo As ImageView
	Private listTasks As CustomListView
	Private ButtonActionPause As Button
	Private ButtonAppNetwork As Button
	Private mainActiveUser As Label
	Private gmap As GoogleMap
	Private mapData As MapFragment
	Private mapMarker As Marker
	Private ListItemNumber As Label
	Private objectsListViewPanel As Panel
	Private FirstTimeBool As Boolean = True 
	Private CLAPreRequestTypeSpinner As Spinner
	Private CLAPreRequestSpinner As Spinner
	Private GroupList As List
	Private ReqList As List
	Private DistrictsList As List
	Private CountyList As List
	Private listRequests As CustomListView
	Private noPreRequestPanel As Panel
	Private ObjectsRequestsTitleLabel As Label
	Private ListItemRequestDesc As Label
	Private ListItemRequestObject As Label
	Private listButPreRequestDownload As Button
	Private listButPreRequestView As Button
	Private listButPreSelect As Button
	Private noRequestPanel As Panel
	Private listButRequest As Button
	Private SelObject As String = ""
	Private SelCheckList As String = ""
	Private SelectedObjectsCount As Int = 0
	Private FromBulkOption As Int = 0
	Private ListItemDesc As Label
	Private ListItemState As Label
	Private butBulkCreateRequest As Button
	Private butBulkPreRequest As Button
	Private CLARequestList As CustomListView
	Private CLARequestTypeSpinner As Spinner
	Private butCreateRequestCancel As Button
	Private butCreateRequest As Button
	Private NoRequestPanelTitleLabel As Label
	Private CLAPreRequestPickerLabel As Spinner
	Private CLAPreRequestEditSearch As EditText
	Private CLAPreRequestDistrictePickerLabel As Spinner
	Private CLAPreRequestCountyPickerLabel As Spinner
	Private listButPreSelectAll As Button
	Private LabelPreRequestNumber As Label
	Private LabelPreRequestType As Label
	Private LabelPreRequestEntity As Label
	Private LabelPreRequestObject As Label
	Private LabelPreRequestDateTime As Label
	Private LabelPreRequestDetails As Label
	Private listOfFields As CustomListView
	Private LabelPreRequestFieldValue As Label
	Private LabelPreRequestFieldName As Label
	
	'NOVAS VARIAVEIS PREREQUISITOS
	Private Qry_TypeRequest As String = ""
	Private Qry_District As String = ""
	Private Qry_County As String = ""
	Private Qry_DateIn As String = ""
	Private Qry_DateOut As String = ""
	Private Qry_Filter As String = ""
	
	Private CumulativeTypeRequest As Int = 0
	Private CumulativeDistrict As Int = 0
	Private CumulativeCounty As Int = 0
	Private CumulativeDateIn As String = ""
	Private CumulativeDateOut As String = ""
	Private CumulativeFilter As String = ""
	Private DialogReqStartDateLabel As Label
	Private DialogReqEndDateLabel As Label
	Private ObjLabelObjectos As Label
	Private ObjLabelMorada As Label
	Private ObjLabelStatus As Label
	Private ObjLabelLocal As Label
	Private LabelObjRequestTipoInter As Label
	Private LabelObjRequestDataInicio As Label
	Private LabelObjRequestDataFim As Label
	Private LabelObjRequestConcelho As Label
	Private LabelObjRequestDistrito As Label
	Private LabelObjRequestPLivre As Label
	Private LabelObjRequestTipoInter2 As Label
	Private LabelObjRequestTipoGrupoInter As Label
	Private ListItemRequestHeader As Label
	Private ListItemActionHeader As Label
	Private DummyMenuPlaceHlder As Label
	Private CLAButtonRequestFilter As Button
	Private CLAButtonRequestDownload As Button
	Private LstPreReqs2Download As List
	Private ListItemParent As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:

	
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	
	Starter.CurrentWorkActivity = Me
	'prvd.Initialize
	Activity.LoadLayout("ObjectsLayout")
	listsTabPanel.LoadLayout("Objects_listview", ShareCode.TABGeneral_ListingTitle)
	listsTabPanel.LoadLayout("Objects_requests_new", ShareCode.TABGeneral_Requests)
	listsTabPanel.LoadLayout("objects_mapview_goolge", ShareCode.TABGeneral_MapTitle)
	
	LstPreReqs2Download.Initialize
	
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
	Utils.SetViewBackgroundColorToMainColor(objectsListViewPanel)
	Utils.SetViewBackgroundColorToMainColor(ObjectsRequestsTitleLabel)
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
	
	ObjLabelObjectos.Text = ShareCode.objectObjLabelObjectos
	ObjLabelMorada.Text = ShareCode.objectObjLabelMorada
	ObjLabelStatus.Text = ShareCode.objectObjLabelStatus
	ObjLabelLocal.text = ShareCode.objectObjLabelLocal
	'labelTypeObjectFilter.text = "Tipo de Objecto"
	LabelObjRequestTipoInter.Text = ShareCode.ObjLabelObjRequestTipoInter
	LabelObjRequestDataInicio.Text = ShareCode.AppDialogsFilterLabelDataInicio
	LabelObjRequestDataFim.Text = ShareCode.AppDialogsFilterLabelDataFim
	LabelObjRequestConcelho.Text = ShareCode.ObjLabelObjRequestConcelho
	LabelObjRequestDistrito.Text = ShareCode.ObjLabelObjRequestDistrito
	LabelObjRequestPLivre.Text = ShareCode.ObjLabelObjRequestPLivre
	LabelObjRequestTipoInter2.Text = ShareCode.ObjLabelObjRequestTipoInter
	LabelObjRequestTipoGrupoInter.Text = ShareCode.ObjLabelObjRequestTipoGrupoInter
	ListItemRequestHeader.Text = ShareCode.ObjListItemRequestHeader
	ListItemActionHeader.Text = ShareCode.ObjListItemActionHeader
	
	DialogReqStartDateLabel.Text = Utils.GetCurrentDate
	DialogReqEndDateLabel.Text = Utils.GetCurrentDate
	
	
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 33.33%x
	Next
	
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
	
	Markers.Initialize
	SelectedObjectsCount = 0
	FromBulkOption = 0
	Bloco30 = Activity.Width / 3
	If Not(ShareCode.ISPHONE Or ShareCode.DEVICE_ORIENTATION  = 1) Then
		Dim p As Panel = listPedidosMap.AsView
		p.Width = Bloco30
	End If

	
	If FirstTime Then
		'
	End If
	
	CumulativeTypeRequest = 0
	CumulativeDistrict = 0
	CumulativeCounty = 0
	CumulativeFilter = ""
	CumulativeDateIn = ""
	CumulativeDateOut = ""

	RegionsList.Initialize
	TypeObjectsList.Initialize
	TypeObjectsList = DBStructures.GetListOfObjectsTypesEVC(True) 'GetListOfObjectsTypes(True)
	LocalsList.Initialize
	LocalsList = DBStructures.GetListOfLocalEVC 'GetListOfLocal
	
	butCreateRequestCancel.Color = Consts.ColorMain
	butCreateRequest.Color = Consts.ColorMain
	butBulkCreateRequest.Color  = Consts.ColorMain
	butBulkPreRequest.Color  = Consts.ColorMain
	Utils.SetViewBackgroundColorToMainColor(NoRequestPanelTitleLabel)
	
	DummyMenuPlaceHlder.Top = 0 + DummyMenuPlaceHlder.Height + (DummyMenuPlaceHlder.Height * TypeObjectsList.Size / 2)
	ObjectTypePopMenu.Initialize(Activity, Me, DummyMenuPlaceHlder, Consts.ColorMain, Colors.White, Consts.ColorSub, True, False)
	
	For i=0 To TypeObjectsList.Size-1
		Dim bt As ObjectTypes = TypeObjectsList.Get(i)
		ObjectTypePopMenu.AddMenuItem(bt.title, "ObjectTypePopMenu")
	Next
	
	
	ObjectZonePopMenu.Initialize(Activity, Me, listsButtonZone, Consts.ColorMain, Colors.White, Consts.ColorSub, True, False)
	For i=0 To Types.ZONEOBJECTSFILTER.Size-1
		ObjectZonePopMenu.AddMenuItem(Types.ZONEOBJECTSFILTER.Get(i), "ObjectZonePopMenu")
	Next

	SearchFilter = ""

	Dim where As String = $"select distinct b.object from requests as a inner join requests_objects as b on (b.tagcode=a.tagcode) where request_date='${ShareCode.CURRENT_APPDATE}'"$
	ObjRequests = DBStructures.GetListOfFromScript("object", where)
	
	Dim s As String = Utils.StrList2SQLArray(ObjRequests)
	Dim where As String = $"Select distinct b.object from requests As a inner join requests_objects As b on (b.tagcode=a.tagcode)
							where a.request_date<>'${ShareCode.CURRENT_APPDATE}' and b.object not in ${s}"$
	ObjRequestsNotToday = DBStructures.GetListOfFromScript("object", where)
	
	GroupList = DBStructures.getTASKGroups
'	ReqList = DBStructures.getTASKRequests
	
	Dim sSQL As String = $"SELECT tagcode, title FROM dta_typerequests WHERE active=1"$
	ReqList.Initialize
	ReqList = DBStructures.GetListOfFromScriptCNLEVC("tagcode", "title", sSQL)
	
	'LISTA DE DISTRITOS
	DistrictsList.Initialize
	DistrictsList = DBStructures.GetListOfFromScriptCNLEVC("tagcode", "title", DBStructures.EVC_SQL_GETDISTRICTS)
	
	'LISTA DE CONCELHOS
	CountyList.Initialize
	CountyList = DBStructures.GetListOfFromScriptCNLEVC("tagcode", "title", DBStructures.EVC_SQL_GETCOUNTIES)
	
	Dim flist As List : flist.initialize
	flist.Add("(Todos)")
	For i = 0 To GroupList.Size-1
		Dim itc As DB_ITC = GroupList.Get(i)
		flist.Add(itc.Title)
	Next
	CLARequestTypeSpinner.AddAll(flist)
'	CLAPreRequestTypeSpinner.AddAll(flist)
	
	Dim flist As List : flist.initialize
	flist.Add("(Todos)")
	For i = 0 To ReqList.Size-1
		Dim r As CodeNameList = ReqList.Get(i)
		flist.Add( r.Name )
	Next
'	CLAPreRequestSpinner.AddAll(flist)
	CLAPreRequestPickerLabel.AddAll(flist)
	
	Dim flist As List : flist.initialize
	flist.Add("(Todos)")
	For i = 0 To DistrictsList.Size-1
		Dim r As CodeNameList = DistrictsList.Get(i)
		flist.Add(r.Name)
	Next
	CLAPreRequestDistrictePickerLabel.AddAll(flist)
	
	Dim flist As List : flist.initialize
	flist.Add("(Todos)")
	For i = 0 To CountyList.Size-1
		Dim r As CodeNameList = CountyList.Get(i)
		flist.Add(r.Name)
	Next
	CLAPreRequestCountyPickerLabel.AddAll(flist)
	noRequestPanel.Visible = False
	UpdateMainLayout
	
End Sub


Sub UpdateMainLayout
	mainLabelOptLists.TextColor = Consts.ColorMain
 	If Not(ShareCode.ISPHONE) Then
		mainLogo.Gravity = Gravity.FILL
		mainLogo.Width = Consts.LogoWidth
		Log($"Inicialização de BMP: ${ShareCode.APP_MAIN_LOGO_MINI}"$)
		If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then
			mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO_MINI))
		End If
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

Sub Activity_Resume
	If(FirstTimeBool) Then
		Sleep(2000)
		StartObjectsActivity(False, "")
		FirstTimeBool = False
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		listsButtonClose_Click
	End If
	Return True
End Sub

Sub CancelAllFilters(run As Boolean)
	IsFiltered  = False
	iDialogReqTypeObject = ShareCode.OBJ_DefaultType
	iDialogReqZone = ShareCode.OBJ_DefaultZone
	iDialogReqStatus = 0
	sDialogReqName = ""
	iDialogReqRegion = 0
	iDialogReqLocal = 0
	sDialogReqAddress = ""
	iDialogReqWithRequests = 0
	UpdateGlobalObjectFilter
	StartObjectsActivity(True, "")
End Sub

Sub UpdateGlobalObjectFilter
	Starter.ObjectFilter.TypeObject = iDialogReqTypeObject
	Starter.ObjectFilter.ZoneObject = iDialogReqZone
	Starter.ObjectFilter.Status = iDialogReqStatus
	Starter.ObjectFilter.Name = sDialogReqName
	Starter.ObjectFilter.Region = iDialogReqRegion
	Starter.ObjectFilter.Local = iDialogReqLocal
	Starter.ObjectFilter.Address = sDialogReqAddress
	Starter.ObjectFilter.Request = iDialogReqWithRequests
End Sub

Sub SetTheFilters(flt As ObjectFilter)
	'RequestFilter(SDate As String, EDate As String, State As Int, CheckList As Int, Object As Int)
'	Private StartingRow As Int = 0
'	Private ReadRows As Int = 20
'	Private NextStartingRow As Int = 0
	StartingRow = 0
	NextStartingRow = 0
	ReadRows = 20
	IsFiltered  = True
	Dim Filter As String = ""
	iDialogReqTypeObject = flt.TypeObject
	iDialogReqZone = flt.ZoneObject
	iDialogReqStatus = flt.Status
	iDialogReqRegion = flt.Region
	iDialogReqLocal = flt.Local
	iDialogReqWithRequests = flt.Request
	sDialogReqName = flt.Name
	sDialogReqAddress = flt.Address
	UpdateGlobalObjectFilter
	
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim CurrDate As String = $"$date{DateTime.Now}"$
	
	
	If (sDialogReqName <> "") Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(a.title_import like '%${sDialogReqName}%')"$
	End If
	
	If (iDialogReqZone > 0) Then
		
'		If iDialogReqZone = 1 Then
'			If (Filter <> "") Then Filter = $"${Filter} and "$
'			Filter = $"${Filter}(a.tagcode in (Select distinct b1.object_tagcode from requests As a1 inner join requests_tasks As b1 on (b1.request_tagcode=a1.tagcode) where a1.request_date='${CurrDate}')) or
'					(a.tagcode in (Select distinct b1.requester_tagcode from requests As a1 inner join requests_tasks As b1 on (b1.request_tagcode=a1.tagcode) where b1.request_date='${CurrDate}'))"$
'		Else if iDialogReqZone = 2 Then
'			If (Filter <> "") Then Filter = $"${Filter} and "$
'			Filter = $"${Filter}(a.tagcode in (Select distinct b1.object_tagcode from requests As a1 inner join requests_tasks As b1 on (b1.request_tagcode=a1.tagcode) where a1.request_date>='${CurrDate}')) or 
'					(a.tagcode in (Select distinct b1.requester_tagcode from requests As a1 inner join requests_tasks As b1 on (b1.request_tagcode=a1.tagcode) where b1.request_date>='${CurrDate}'))"$
'		Else
''			Filter = $"${Filter}(c.city='${LocalsList.Get(iDialogReqLocal-1)}')"$
''			iDialogReqLocal = 0
'		End If
		 		
	End If
	
	If (sDialogReqAddress <> "") Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(c.address like '%${sDialogReqAddress}%')"$
	End If
	
	If (iDialogReqStatus > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		If (iDialogReqStatus = 1) Then 
			Filter = $"${Filter}(a.active=1)"$
		Else
			Filter = $"${Filter}(a.active=0)"$
		End If
	End If
	
	If (iDialogReqTypeObject > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(b.id=${iDialogReqTypeObject})"$
	End If
	
	If (iDialogReqLocal > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		Filter = $"${Filter}(c.local='${LocalsList.Get(iDialogReqLocal-1)}')"$
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
	
	
'	'TypeObjectsList = DBStructures.GetListOfObjectsType
'	'LocalsList = DBStructures.GetListOfObjectsLocal
'	
''	Select a.type, a.typedesc, a.id, a.tagcode, ifnull(a.lastvisit, '') lastvisit, a.status_id, a.status_desc, a.status_color,
''												a.name, ifnull(local, '') local, b.address, ifnull(b.address2, '') address2, b.postal_code, b.city, 
''												b.latitude, b.longitude, ifnull(a.contact_name, '') contact_name, ifnull(a.notes, '') notes,
''												ifnull(a.contact_phone, '') contact_phone, ifnull(contract, '') contract, ifnull(a.nifnumber, '') nifnumber
'	If (flt.EDate <> "") Then FilterEndDate = flt.EDate
'	If (flt.CheckLst > 0) Then FilterChecklist = flt.CheckLst
'	If (flt.Object > 0) Then FilterObject = flt.Object
'	If (flt.State >= 0) Then FilterStates = flt.State
	CurrentFilter = Filter
	StartObjectsActivity(True, Filter)
End Sub

Sub EditReturn(arg As String)
	WindowStatusUpdate
End Sub

Sub FitMap_Click
End Sub

Sub TileSourceSelect_ItemClick (Position As Int, Value As Object)
	'MapViewAreaEnt.SetTileSource(Value)
End Sub

Sub StartObjectsActivity(Clear As Boolean, Filter As String)
	
	ProgressDialogShow2(ShareCode.GeneralLoadingMessage, False)
	Sleep(100)
	
	If (Starter.ObjectKeepFilter = True) Then
		Starter.ObjectKeepFilter = False
		If (Starter.ObjectSearchFilter <> "") Then
			Dim sFilter As String = Starter.ObjectSearchFilter
			Starter.ObjectSearchFilter = ""
			Starter.ObjectFilter = Types.MakeObjectFilter(ShareCode.OBJ_DefaultType, ShareCode.OBJ_DefaultZone, 0, 0, 0, "", "", 0)
			StartObjectsActivity(True, sFilter)
		Else
			Dim tFilter As ObjectFilter = Starter.ObjectFilter
			'Starter.ObjectFilter = Types.MakeObjectFilter(ShareCode.OBJ_DefaultType, ShareCode.OBJ_DefaultZone, 0, 0, 0, "", "", 0)
			Starter.ObjectSearchFilter = ""
			SetTheFilters(tFilter)
		End If
	Else

		If Clear Then
			Try
				listObjects.Clear
				Markers.Clear
				StartingRow = 0
				NextStartingRow = 0
				ReadRows = 20
			Catch
				Log(LastException)
				Utils.WriteErrors2Log(LastException)
			End Try
		End If
		
		Dim height As Int = 95dip
		Dim mapHeight As Int = 95dip
		If(ShareCode.ISPHONE) Then
			height =  245dip
			mapHeight = 85dip
		End If
		Private Record As Cursor
		ItemsCounter = 0
		
		'**********************************************************************************
		' ALTERACAO PC
		' PARA OS OBJECTOS VIREM CORRECTAMENTE, E ENQUANTO A dta_locations NAO VIER ACTUALIZADA DO BO/API
		' O SCRIPT ABAIXO PASSA DE INNER JOIN PAR A LEFT JOIN EM dta_locations
		'**********************************************************************************
		Dim SQL As String = DBStructures.EVC_SQL_CURRENT_OBJECTS
		

													
		If (Filter <> "") Then
			SQL = $"${SQL} where ${Filter} and ((a.title_import is not null) and ((a.title_import <>'') and (a.tagcode <>'__NONE__'))) "$
		Else
			SQL = $"${SQL} where ((a.title_import is not null) and ((a.title_import <>'') and (a.tagcode <>'__NONE__'))) "$
		End If
		
		Log(SQL)
		
		SQL = $"${SQL} order by a.title_import limit ${StartingRow}, ${ReadRows}"$
		
		Log(SQL)
		
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		'CurrentLineItem = 0
		
		Dim thisLinesCount As Int = Record.RowCount
		
		If (thisLinesCount < ReadRows) Then
			NextStartingRow = StartingRow
		Else
			NextStartingRow = StartingRow + ReadRows
			ItemsCounter = StartingRow
		End If
		
		TotalLineItems = NextStartingRow
		
		If Record.RowCount > 0 Then
'			If Not(ObjRequests.IsInitialized) Then
'				Dim where As String = $"select distinct b.object from requests as a inner join requests_objects as b on (b.tagcode=a.tagcode) where request_date='${ShareCode.CURRENT_APPDATE}'"$
'				ObjRequests = DBStructures.GetListOfFromScript("object", where)
'		
'				Dim s As String = Utils.StrList2SQLArray(ObjRequests)
'				Dim where As String = $"Select distinct b.object from requests As a inner join requests_objects As b on (b.tagcode=a.tagcode)
'								where a.request_date<>'${ShareCode.CURRENT_APPDATE}' and b.object not in ${s}"$
'				ObjRequestsNotToday = DBStructures.GetListOfFromScript("object", where)
'			End If
			
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim icString As String = ""
	'			Dim status_id As Int = Record.GetInt("status_id")
				Dim status_color As String = Record.GetString("status_color")
				Dim tagcode As String = Record.GetString("tagcode")
				Dim latitude As String = Record.GetString("latitude")
				Dim longitude As String = Record.GetString("longitude")
				
				ItemsCounter = ItemsCounter + 1
				icString = ItemsCounter
				
				
				If (ObjRequests.IndexOf(tagcode) >= 0) Then
					status_color = "BLUE"
				End If
				
				listObjects.Add( CreateListItem(icString, Record, listObjects.AsView.Width, height, ObjRequests, ObjRequestsNotToday), "") ', height, "" )
				
				If Not(Utils.isNullOrEmpty(latitude)) And Not(Utils.isNullOrEmpty(longitude)) Then
'					Dim bd As BitmapDrawable
'					bd.Initialize(Utils.CreateMapIcon(ItemsCounter, status_color))
'					listPedidosMap.Add( CreateListItemMap(icString, Record, listPedidosMap.AsView.Width, mapHeight, bd, ObjRequests, ObjRequestsNotToday), "") ', 65dip, "" )
					listPedidosMap.Add( CreateListItemMap(icString, Record, listPedidosMap.AsView.Width, mapHeight, ObjRequests, ObjRequestsNotToday), "") ', 65dip, "" )
				End If
				'
				'
			Next
		End If
		Record.Close
		WindowStatusUpdate
	End If
	
'	MakePreRequestTaskList(-1, 0, 0, "")
	ProgressDialogHide
'	ProgressDialogHide
End Sub

'Sub CreateListItem(cnt As Int, colitems As Map, Width As Int, height As Int, bd As BitmapDrawable) As Panel
Sub CreateListItem(cnt As String, colitems As Cursor, Width As Int, Height As Int, req As List, nreq As List) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	If(ShareCode.ISPHONE)Then
		p.LoadLayout("objects_itemview_phone")
	Else
		p.LoadLayout("Objects_itemview")
	End If	
	p.RemoveView

	Dim name As String = colitems.GetString("name")
'	Dim contact_name As String = colitems.GetString("contact_name")
	Dim status_desc As String = colitems.GetString("status_desc")
'	Dim contact_phone As String = colitems.GetString("contact_phone")
'	Dim have_contract As Int = colitems.GetInt("have_contract")
'	Dim lastvisit As String = colitems.Get("lastvisit")
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim typedesc As String = colitems.GetString("typedesc")
	Dim address As String = colitems.GetString("address")
	Dim address2 As String = colitems.GetString("address2")
	Dim postal_code As String = colitems.GetString("postal_code")
	Dim city As String = colitems.GetString("city")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim ObjRef As String = colitems.GetString("reference")
	Dim ObjectParent As String = colitems.GetString("parent")
'	Dim status_color As String = colitems.GetString("status_color")
	'Dim nifnumber As String = colitems.GetString("nifnumber")
	
	
	
	If Utils.NNE(ObjRef) Then
		ObjRef = $"(${ObjRef})"$
	Else
		ObjRef = ""
	End If
	
	ListItemFullName.text = $"${name} ${ObjRef}"$
	If Utils.NNE(cnt) Then 
		ListItemNumber.Text = $"${cnt}"$
		ListItemNumber.Color =Consts.ColorYellow
	End If
	
	
	Dim ParentName As String = DBStructures.GetScriptColumnStrEVC($"select title_import from dta_objects where 1=1
																	and tagcode = '${ObjectParent}'"$, "title_import")
		
	If Utils.NNE(ParentName) Then
		ListItemParent.Text = ParentName
	Else
		ListItemParent.Text = ""
	End If
	
	
	
	'ListItemContact.text = $"${cnt} - ${contact_name} - ${contact_phone}"$
	ListItemStatus.Text = status_desc
	If (address2 <> "") Then address2 = $"${CRLF}${address2},"$
	Dim ThisAddress As String = $"${address},${address2}${CRLF}${postal_code} ${city}"$
	ListItemLocation.text = ThisAddress
	
	ListItemType.Text = typedesc
'	ListItemNif.Text = nifnumber
	ListItemReference.text = tagcode
	ListItemReference.tag = tagcode
	'ListItemStatusPanel.Color = Utils.ColorString(status_color)
	'ListItemStatusPanel.Tag = status_id
	
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
	
	If Not(Utils.isNullOrEmpty(latitude)) And Not(Utils.isNullOrEmpty(longitude)) Then
		listButMap.Tag = $"${latitude}|${longitude}"$
	Else
		listButMap.TextColor = Consts.ColorLightSilver
	End If
	listButRequest.Tag = tagcode
	listButSelect.Tag = $"${tagcode}|0"$
	p.Tag = tagcode
	Return p
End Sub

'Sub CreateListItemMap(cnt As String, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable, req As List, nreq As List) As Panel
Sub CreateListItemMap(cnt As String, colitems As Cursor, Width As Int, Height As Int, req As List, nreq As List) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("Objects_itemMapView")
	p.RemoveView
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim name As String = colitems.GetString("name")
	Dim typedesc As String = colitems.GetString("typedesc")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	ListItemFullName.text = $"${cnt} - ${name}"$
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
	
	If Not(Utils.isNullOrEmpty(latitude)) And Not(Utils.isNullOrEmpty(longitude)) Then
		If gmap.IsInitialized Then
			Try
				mapMarker = gmap.AddMarker(latitude, longitude, name) ' TextLabel($"${cnt}"$))
				Markers.Add( mapMarker )
			Catch
				Log(LastException)
				Utils.WriteErrors2Log(LastException)
			End Try
		End If
	End If

	p.Tag = tagcode
	Return p
End Sub

Sub TextLabel(Text As String) As Bitmap
	Dim tpf As B4XFont = xui.CreateDefaultFont(10)
	Dim c As B4XCanvas
	c.Initialize(gmap)
	
	Dim r As B4XRect = c.MeasureText(Text, tpf)
	r.Height = r.Height + (r.Height /2) + 5dip
	r.Width = r.Width + (r.Width /2) + 5dip ' * 2
	
	c.DrawRect(r, Consts.ColorWhite, True, 0)
	c.DrawText(Text, r.CenterX, r.CenterY, tpf, Colors.Black, "CENTER")

	Dim bm As Bitmap = c.CreateBitmap
	Return bm.Crop(0,0,r.Width,r.Height)
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

	
End Sub

Sub listsTabPanel_PageSelected (Position As Int)
	
End Sub

Sub listsButtonClose_Click
	Log("Back OBJECTS")
	Starter.ObjectKeepFilter  = True
	Starter.ObjectSearchFilter = SearchFilter
	Starter.ObjectFilter = Types.MakeObjectFilter(iDialogReqTypeObject, iDialogReqZone, iDialogReqStatus, iDialogReqRegion, _
					iDialogReqLocal, sDialogReqName, sDialogReqAddress, iDialogReqWithRequests)

	CallSubDelayed2(MainMenu, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listsButtonAdd_Click
	
End Sub

Sub ListItemPanel_Click
	
End Sub

Sub GetObjectMapInfo(tagcode As String) As ObjectInformation

	Private Record As Cursor
	ItemsCounter = 0
	Dim SQL As String = $"${DBStructures.EVC_SQL_CURRENT_OBJECTS} where a.tagcode='${tagcode}'"$
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

Sub listButMap_Click
	Dim b As Button = Sender
	Dim p As Panel  = b.Parent
	Dim ret As ObjectInformation = GetObjectMapInfo(p.Tag)
	
	If Not(Utils.isNullOrEmpty(ret.Latitude)) And Not(Utils.isNullOrEmpty(ret.Longitude)) Then
		listsTabPanel.ScrollTo(2, True)

		If gmap.IsInitialized Then
			Dim cp As CameraPosition
			cp.Initialize(ret.Latitude, ret.Longitude, 17)
			gmap.MoveCamera(cp)
		End If
		
	End If
End Sub

Sub listButInfo_Click
	
End Sub

Sub ListItemPanel_LongClick

End Sub

Sub listsButtonFilter_Click
	Dim Filter As AppDialogs
	Filter.Initialize
	Dim Curr As ObjectFilter = Types.MakeObjectFilter( iDialogReqTypeObject, iDialogReqZone, iDialogReqStatus, iDialogReqRegion, iDialogReqLocal,  _
					sDialogReqName, sDialogReqAddress, iDialogReqWithRequests)
	Filter.GetObjectFilterDialog("objects", Curr, TypeObjectsList, RegionsList, LocalsList)
End Sub

Sub listPedidosButtonMap_Click
	Try
		If ShowListPedidosMap Then
			ShowListPedidosMap = False
			mapBaseList.Visible = False
			listPedidosButtonMap.Color = Colors.ARGB(150, 7, 167, 247)
			listPedidosButtonMap.Left = 10dip
		Else
			ShowListPedidosMap = True
			mapBaseList.Visible = True
			listPedidosButtonMap.Color = Colors.ARGB(150, 7, 119, 167)
			If Not(ShareCode.ISPHONE) Then
				listPedidosButtonMap.Left = 33.33%x
			Else
				listPedidosButtonMap.Left = 310dip
			End If
		
		End If
	Catch
		Log(LastException)
		Utils.WriteErrors2Log(LastException)
	End Try

End Sub

Sub listPedidosMap_ItemClick (Index As Int, Value As Object)
	Log(Value)
	
	Dim p As Panel  = listPedidosMap.GetPanel(Index)
	Dim name As Label = p.GetView(0)
	Dim lst As List = Regex.Split("\|", name.Tag)

	If (lst.Size >= 1) Then
		Dim lat As String = lst.Get(0)
		Dim lon As String = lst.Get(1)
		
		If Not(Utils.isNullOrEmpty(lat)) And Not(Utils.isNullOrEmpty(lon)) Then
			If gmap.IsInitialized Then
				Dim cp As CameraPosition
			
				cp.Initialize(lst.Get(0), lst.Get(1), 17)
				gmap.MoveCamera(cp)
			End If
		End If 
	End If
End Sub

Sub mapZoomUp_Click
'	MapViewAreaEnt.ZoomIn
End Sub

Sub mapZoomDown_Click
'	MapViewAreaEnt.ZoomOut
End Sub

Sub listButAttachMap_Click
	
End Sub

Sub listButInfoMap_Click
	
End Sub

Sub ListItemSelected(pan As Panel)
	For index= 0 To listObjects.GetSize-1
		Dim p As Panel = listObjects.GetPanel(index)
		p.Color = Consts.ColorWhite
	Next
	pan.Color = Consts.ColorCianSoftLight
	WindowStatusUpdate
End Sub

Sub listObjects_ItemClick (Index As Int, Value As Object)
	CurrentLineItem = Index + 1
	Dim pnl As Panel = listObjects.GetPanel(Index)
	CallSubDelayed2(ObjectEdit, "StartObjectActivity", pnl.tag)
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	ListItemSelected(pnl)
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
	Dim i As Int
	i = Msgbox2(ShareCode.UserGoAvailableMessage, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
	If (i=DialogResponse.POSITIVE) Then
		Dim cli As AppDialogs
		cli.Initialize
		cli.MakeUserAvailable("Objects")
	End If
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
	listsLabelInfo.Text = $"${CurrentLineItem} / ${TotalLineItems}"$
	ProgressDialogHide
End Sub

Sub EditSearch_EnterPressed
	MakeListSearch(EditSearch.Text)
End Sub

Sub butSearch_Click
	MakeListSearch(EditSearch.Text)
End Sub

Sub MakeListSearch(search As String)
	'Dim Filter As String = $"b.title||a.tagcode||a.title_import||c.address||c.postalcode||c.local like '%${search}%'"$
	Dim Filter As String = $"b.title||a.tagcode||a.title_import||c.address||c.postalcode||c.local||ifnull(d.title_import,'')||ifnull(a.reference,'')||ifnull(d.reference,'') like '%${search}%'"$
	
	SearchFilter = Filter
	IsFiltered = (Filter <> "")
	StartObjectsActivity(True, Filter)
End Sub

Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub mapUserPosition_Click

End Sub

Sub listsButtonZone_Click
	ObjectZonePopMenu.OpenMenu
End Sub
 
Sub ObjectTypePopMenu_Click(MenuName As String)
	Dim bt As ObjectTypes = Types.ObjectTypesInList(TypeObjectsList, MenuName)
	Starter.ObjectFilter.TypeObject = bt.id 'TypeObjectsList.IndexOf(MenuName)
	SetTheFilters(Starter.ObjectFilter)
End Sub

Sub ObjectZonePopMenu_Click(MenuName As String)
	Starter.ObjectFilter.ZoneObject = Types.ZONEOBJECTSFILTER.IndexOf(MenuName)
	SetTheFilters(Starter.ObjectFilter)
End Sub

Sub labelTypeObjectFilter_Click
	
	If ObjectTypePopMenu.MenuIsOpen Then
		ObjectTypePopMenu.CloseMenu
	Else
		ObjectTypePopMenu.OpenMenu
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

Sub mapData_Ready
	gmap = mapData.GetMap
	'rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
	If gmap.IsInitialized Then
		Do While gmap.MyLocation.IsInitialized = False
			Sleep(100)
		Loop
		
		Dim cp As CameraPosition
		cp.Initialize(gmap.MyLocation.Latitude, gmap.MyLocation.Longitude, 17)
		gmap.MoveCamera(cp)
	End If
End Sub

Sub mapData_Click (Point As LatLng)
	
End Sub


Sub mapData_MarkerClick (SelectedMarker As Marker) As Boolean 'Return True to consume the click
	
End Sub

Sub listObjects_ReachEnd
	If Not(NextStartingRow = StartingRow) Then
		StartingRow = NextStartingRow
		StartObjectsActivity(False, CurrentFilter)
	End If
End Sub

Sub MakePreRequestTaskList(Index As Int, district As Int, county As Int, DateIn As String, DateOut As String, Filter As String)
	
	
	
'	Sleep(100)
'	Dim SQLEVC As String = $"${DBStructures.EVC_SQL_GETPREREQUESTS_DATA_NEW} "$
'	Log(SQLEVC)
'	
'	CumulativeTypeRequest = Index
'	CumulativeDistrict = district
'	CumulativeCounty = county
'	CumulativeFilter = Filter
'	CumulativeDateIn = DateIn
'	CumulativeDateOut = DateOut
'	
'	If (Index > 0) Then
'		Dim r As CodeNameList = ReqList.Get(Index-1)
'		SQLEVC = $"${SQLEVC} and (e.tagcode='${r.TagCode}')"$
'	End If
'	
'	If (district > 0) Then
'		Dim r As CodeNameList = DistrictsList.Get(district-1)
'		SQLEVC = $"${SQLEVC} and (cc.district_tagcode='${r.TagCode}')"$
'	End If
'	
'	If (county > 0) Then
'		Dim r As CodeNameList = CountyList.Get(county-1)  '
''		SQLEVC = $"${SQLEVC} and (cc.district_tagcode in (select distinct district_tagcode from dta_counties where tagcode='${r.TagCode}'))"$
'		SQLEVC = $"${SQLEVC} and (cc.county_tagcode='${r.TagCode}')"$
'	End If
'	
'	If Utils.NNE(DateIn) Then
'		SQLEVC = $"${SQLEVC} and (a.execute_date>='${DateIn}')"$
'	End If
'	
'	If Utils.NNE(DateOut) Then
'		SQLEVC = $"${SQLEVC} and (a.execute_date<='${DateOut}')"$
'	End If
'	
'	SQLEVC = $"${SQLEVC} ${Filter} order by a.execute_date desc, a.execute_start desc, cc.address"$
'	Log(SQLEVC)
				
	
'	If (Index >= 0) Then
'		Dim itc As DB_ITC = ReqList.Get(Index)
'		SQLEVC = $"${SQLEVC} and (e.id=${itc.ID})"$
'	End If
'	SQLEVC = $"${SQLEVC} order by b2.title_import"$

	'Guardar a Query para o Botao a despoletar


End Sub

Sub CreatePreReqHeaders As ResumableSub
	
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	
	Qry_TypeRequest = ""
	Qry_District = ""
	Qry_County = ""
	Qry_Filter = ""
	Qry_DateIn = ""
	Qry_DateOut = ""
	
	'**************************************************************************************************
	' LIMPA A LISTA E APAGA DA BD LOCAL TODOS OS REQUESTS CUJO STATE_ID SEJA ENTRE 1 e 3
	'**************************************************************************************************
	
	listRequests.Clear
	Dim res As ResumableSub = DeletePreRequestsFromLocalDB
	Wait For(res) Complete (Completed As Boolean)
	
	If (CLAPreRequestPickerLabel.SelectedIndex > 0) Then
		Dim r As CodeNameList = ReqList.Get(CLAPreRequestPickerLabel.SelectedIndex-1)
		Qry_TypeRequest = r.TagCode
	End If
	
	
	If (CLAPreRequestDistrictePickerLabel.SelectedIndex > 0) Then
		Dim r As CodeNameList = DistrictsList.Get(CLAPreRequestDistrictePickerLabel.SelectedIndex-1)
		Qry_District =  r.TagCode
	End If
	
	If (CLAPreRequestCountyPickerLabel.SelectedIndex > 0) Then
		Dim r As CodeNameList = CountyList.Get(CLAPreRequestCountyPickerLabel.SelectedIndex -1)  '
		Qry_County = r.TagCode
	End If
	
	If Utils.NNE(DialogReqStartDateLabel.Text) Then
		Qry_DateIn = DialogReqStartDateLabel.Text
	End If
	
	If Utils.NNE(DialogReqEndDateLabel.Text) Then
		Qry_DateOut = DialogReqEndDateLabel.Text
	End If
	
	Qry_Filter = CLAPreRequestEditSearch.Text
		
	Log("Qry_TypeRequest:" & Qry_TypeRequest)
	Log("Qry_District:" & Qry_District)
	Log("Qry_County:" & Qry_County)
	Log("Qry_Filter" & Qry_Filter)
	Log("Qry_DateIn:" & Qry_DateIn)
	Log("Qry_DateOut:" & Qry_DateOut)

	Dim RequestFileNamePreRequests As String = Utils.RandomString
	
	'ENVIAR O PEDIDO PARA A API - NOVO ENDPOIT
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/prerequests/headers"$
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("typeRequest",Qry_TypeRequest)
	params.Put("district",Qry_District)
	params.Put("county",Qry_County)
	params.Put("filter",Qry_Filter)
	params.Put("dateIn",Utils.IfNullOrEmpty(Qry_DateIn,Utils.GetCurrentDate))
	params.Put("dateOut",Utils.IfNullOrEmpty(Qry_DateOut,Utils.GetCurrentDate))
	params.Put("user", ShareCode.SESS_User)
	params.Put("name", RequestFileNamePreRequests)
	params.Put("newReturn", ShareCode.newreturn)
	params.Put("date", Utils.GetCurrDatetimeExt)
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
    
	Dim data As String = JSON.ToPrettyString(1)
	
	Utils.ShowProcinLog("Objects","CLAButton",data)
	
	Job.PostString(ServerAddress, data)
	Job.GetRequest.SetContentType("application/json")
	Job.GetRequest.Timeout = 90000
	
	Dim continua As Boolean = True
	
	Wait For (Job) JobDone(Job As HttpJob)

	If Job.Success Then
		Log(ServerAddress)
		Utils.ShowProcinLog("Objects","CLAButtonRequestFilter","Completed")
		Log (Job.GetString)
	Else
		Log(ServerAddress)
		Utils.ShowProcinLog("Objects","CLAButtonRequestFilter","ERROR")
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		ProgressDialogHide
		continua = False
		Log (Job.GetString)
	End If
	Job.Release
		
	If continua Then

		Dim PREREQ_INFO As String = $"${RequestFileNamePreRequests}.INFO"$
		Dim prereq_fileName As String = RequestFileNamePreRequests
		
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
		
			Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/db/" & PREREQ_INFO, False, Starter.Provider.SharedFolder, PREREQ_INFO)
			Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
			If Success Then
				Log(PREREQ_INFO & " file was download successfully")

				Try

					If ShareCode.newReturn = 1 Then
						Dim JsonStruct As String = File.readstring(Starter.Provider.SharedFolder, PREREQ_INFO)
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
								Utils.WriteErrors2Log(LastException)
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
						SqlFilesTotal = Totalfiles
						Dim date As String = DataHora
						Utils.UpdateLiteUpdateDateTime(date)
						DBStructures.UpdateWorkerDbLastUpdate(date)
						dotry = False
						trycount = 3
						GlobalFTP.Close
						'*************************************************************************
					End If
				Catch
					Log(LastException)
					Utils.WriteErrors2Log(LastException)
					trycount = trycount + 1
				End Try
			Else
				Log(LastException)
				Utils.WriteErrors2Log(LastException)
				Log("Error downloading file " & PREREQ_INFO)
				trycount = trycount + 1
			End If
		Loop
		GlobalFTP.Close
	
		If(SqlFilesTotal > 0) Then
						
			Dim GlobalFTP As FTP
			GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
			GlobalFTP.PassiveMode = True

			GlobalFTP.TimeoutMs = 240000
						
			For i = 1 To SqlFilesTotal
				Dim fileN As String = $"${RequestFileNamePreRequests}${i}.sql"$
				
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
				
						
			Next
			GlobalFTP.Close
		
		'*****************************************************************************************
		' BASEADO NO RequestFileNamePreRequests E COM UM CICLO For..Next ATE AO SqlFilesTotal
		' CRIAR UMA LISTA COM AS INSTRUCOES SQL POR ITEM E EXECUTA-LAS
		'*****************************************************************************************
				
			For i = 1 To SqlFilesTotal
				Dim fileN As String = $"${RequestFileNamePreRequests}${i}.sql"$
								
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
					Utils.WriteErrors2Log(LastException)
				End Try
				
				For n = 0 To List1.Size -1
					Dim Script2Execute As String = List1.Get(n)
					Utils.SaveSQLToLog("Objects",Script2Execute, "")
				Next
			Next
			'***************************************************************************************************
			' CHAMAR A ROTINA PARA APAGAR OS FICHEIROS GERADOS NO SERVIDOR PARA NAO OCUPAREM ESPACO
			'***************************************************************************************************
			Dim res As ResumableSub = SendServerProcessComplete(False,RequestFileNamePreRequests)
			Wait For(res) Complete (Completed As Boolean)
		End If
		
	
		Sleep(100)
		Dim SQLEVC As String = $"${DBStructures.EVC_SQL_GETPREREQUESTS_DATA_NEW} and a.status_id < 5"$
		
		Log(SQLEVC)
	
		Dim height As Int = 80dip
		Dim TotalLineItemsCL As Int = 0
		Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
		If (Record.RowCount>=1) Then
			For n=0 To Record.RowCount-1
				Record.Position = n
				If Utils.NNE(Record.GetString("tagcode")) Then
					'Log(ItemsCounter)
					Dim CanAdd As Boolean = True
					Try
						Dim pp As Panel =  CreatePreRequestListItem(ItemsCounter, Record, listRequests.AsView.Width, height)
					Catch
						Log(LastException)
						Utils.WriteErrors2Log(LastException)
						CanAdd = False
					End Try
					If (CanAdd) Then
						TotalLineItemsCL = TotalLineItemsCL +1
						ItemsCounter = ItemsCounter + 1
						listRequests.Add(pp, "")
					End If
				End If
			Next
		End If
		Record.Close
		ProgressDialogHide
		If TotalLineItemsCL = 0 Then
			MsgboxAsync($"Não existem dados de acordo com os parametros selecionados. ${CRLF}Por favor altere a sua seleccção e tente de novo."$,"Pedidos")
		Else
			Log("Total Pedidos : " & TotalLineItemsCL)
			SetAllPreReqSelect(False)
		End If
		
	End If
	
	Return True
	
End Sub

Sub DeletePreRequestsFromLocalDB As ResumableSub
	Dim Continuar As Boolean = True
	Dim SqlRemove As String = "SELECT * FROM dta_requests AS a where a.state_id>=1 and a.state_id < 4"
	Try
		Dim Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(SqlRemove)
	
	Catch
		Log(LastException)
		Utils.WriteErrors2Log(LastException)
		Continuar = False
	End Try
	
	If (Continuar) Then
		
		Dim ContinuarLoc As Boolean = True
		Dim SqlLocRemove As String = "SELECT * FROM dta_locations AS a where a.tagcode in (SELECT local_tagcode FROM dta_requests AS a where a.state_id>=1 and a.state_id < 4)"
		Try
			Dim RecordLOC As ResultSet = Starter.LocalSQLEVC.ExecQuery(SqlLocRemove)
		Catch
			Log(LastException)
			Utils.WriteErrors2Log(LastException)
			ContinuarLoc = False
		End Try
		If (ContinuarLoc) Then
			Dim TgCode As String = ""
			Do While RecordLOC.NextRow
				Dim TgCode As String = Utils.FieldResultSet2SQLArray(RecordLOC,"tagcode")
				Exit
			Loop
			RecordLOC.Close
			
			Dim res As ResumableSub = DBStructures.RemoveRecsFromTableBulk("dta_locations","tagcode",TgCode)
			Wait For(res) Complete (Completed As Boolean)
		End If
		
		Dim TgCode As String = ""
		Do While Record.NextRow
			Dim TgCode As String = Utils.FieldResultSet2SQLArray(Record,"tagcode")
			Exit
		Loop
		Record.Close
		
		Dim res As ResumableSub = DBStructures.RemoveRecsFromTableBulk("dta_requests","tagcode",TgCode)
		Wait For(res) Complete (Completed As Boolean)
	
		Dim res As ResumableSub = DBStructures.RemoveRecsFromTableBulk("dta_requests_adds","request_tagcode",TgCode)
		Wait For(res) Complete (Completed As Boolean)
	
		Dim res As ResumableSub = DBStructures.RemoveRecsFromTableBulk("dta_requests_fields","request_tagcode",TgCode)
		Wait For(res) Complete (Completed As Boolean)
					
		Dim res As ResumableSub = DBStructures.RemoveRecsFromTableBulk("dta_requests_relations","request_tagcode",TgCode)
		Wait For(res) Complete (Completed As Boolean)
		
	End If
	Return True
		
End Sub

Sub GetPreReqAssign
	
	Dim RequestFileNamePreRequests As String = Utils.RandomString
	Dim ListOfRequests As List ' Lista de tagcodes separados por pipe "|"
	ListOfRequests.Initialize
	Dim SelectedOption As String = "1" ' 0 = Do dia, 1 = Todos
	Dim Msg2Show As String = $"A opção “DO DIA” vai atribuir a Si apenas os Pedidos/Necessidades com o agendamento do dia de hoje, 
	sendo que TODOS serão os que estão selecionados.Poderá efetuar a sincronização para os descarregar.
	Identifique a opção pretendida."$
	
	Msgbox2Async(Msg2Show, "Selecção de Pedidos", "TODOS", "CANCELAR", "DO DIA", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		SelectedOption = "1"
	else if Result = DialogResponse.NEGATIVE Then
		SelectedOption = "0"
	Else
		Return
	End If
	
	ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
	
	'ENVIAR O PEDIDO PARA A API - NOVO ENDPOIT
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla/prerequest/assign"$
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("user", ShareCode.SESS_User)
	params.Put("newReturn", ShareCode.newreturn)
	params.Put("name", RequestFileNamePreRequests)
	params.Put("option", SelectedOption) 
	params.Put("date", Utils.GetCurrDatetimeExt)
	params.Put("requests",Utils.List2Str(LstPreReqs2Download,"|"))
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String = JSON.ToPrettyString(1)
	
	

	Utils.ShowProcinLog("Objects","GetPreReqAssign",data)
	
	Job.PostString(ServerAddress, data)
	Job.GetRequest.SetContentType("application/json")
	Job.GetRequest.Timeout = 90000
	
	Dim continua As Boolean = True
	
	Wait For (Job) JobDone(Job As HttpJob)

	If Job.Success Then
		Log(ServerAddress)
		Utils.ShowProcinLog("Objects","GetPreReqAssign","Completed")
	Else
		Log(ServerAddress)
		Utils.ShowProcinLog("Objects","GetPreReqAssign","ERROR")
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		ProgressDialogHide
		continua = False
	End If
	Job.Release
	
	ProgressDialogHide
	MsgboxAsync("Intervenções atribuidas", ShareCode.GeneralInfoTitle)

End Sub

Sub CLAButtonRequestFilter_Click
	 
	
	Dim res As ResumableSub = CreatePreReqHeaders
	Wait For(res) Complete (Completed As Boolean)
	
	CLAButtonRequestDownload.Enabled = True
	
End Sub

Sub CLAButtonRequestDownload_Click
	
	GetPreReqAssign
	
End Sub



Sub SendServerProcessComplete(debug As Boolean, filename As String) As ResumableSub
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/removeFilesSqlite"$
	Dim Job As HttpJob
	Job.Initialize("",Me)
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

Sub CreatePreRequestListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	
	Dim p As Panel
	p.Initialize("")
'	p.SetLayoutAnimated(0, 1, 0, 0, Width, Height)
	If ShareCode.ISPHONE Then
		p.Height =  100%y
		p.Width =  100%x
	Else
		p.Height = Height
		p.Width = Width
	End If

	p.LoadLayout("taskListPreRequest")
	p.RemoveView
	
'	Dim request_desc As String = colitems.GetString("request_desc")
'	Dim nameobject As String = colitems.GetString("nameobject")
'	Dim tagcode As String = colitems.GetString("tagcode")
'	
'	ListItemRequestDesc.text = $"${request_desc}"$
'	ListItemRequestDesc.Tag = tagcode
'	ListItemRequestObject.text = $"${nameobject}"$
'	ListItemRequestObject.Tag = tagcode
	'
'	
'	p.Tag = tagcode

	Dim request_desc As String = colitems.GetString("request_desc")
	Dim nameobject As String = colitems.GetString("nameobject")
	Dim tagcode As String = colitems.GetString("tagcode")
	
	Dim reqaddress As String = colitems.GetString("reqaddress")
	Dim reqpostal_code As String = colitems.GetString("reqpostal_code")
	Dim reqcity As String = colitems.GetString("reqcity")
	Dim request_date As String = colitems.GetString("request_date")
	Dim request_stime As String = colitems.GetString("request_stime")
	
	
	Dim InfoReq As String = $"${request_desc}"$
	If Utils.NNE(request_date) Then
		If Utils.NNE(InfoReq) Then
			InfoReq = $"${InfoReq}  (${request_date})"$
		Else
			InfoReq = $"(${request_date})"$
		End If
	End If
	If Utils.NNE(request_stime) Then
		If Utils.NNE(InfoReq) Then
			InfoReq = $"${InfoReq}  (${request_stime})"$
		Else
			InfoReq = $"(${request_stime})"$
		End If
	End If
	
	
	Dim InfoText As String = $"${nameobject}"$
	
	If Utils.NNE(reqaddress) Then
		If Utils.NNE(InfoText) Then
			InfoText = $"${InfoText}, ${reqaddress}"$
		Else
			InfoText = $"${reqaddress}"$
		End If
	End If
	
	If Utils.NNE(reqpostal_code) Then
		If Utils.NNE(InfoText) Then
			InfoText = $"${InfoText}, ${reqpostal_code}"$
		Else
			InfoText = $"${reqpostal_code}"$
		End If
	End If
	
	If Utils.NNE(reqcity) Then
		If Utils.NNE(InfoText) Then
			InfoText = $"${InfoText}, ${reqcity}"$
		Else
			InfoText = $"${reqcity}"$
		End If
	End If

	ListItemRequestDesc.text = $"${InfoReq}"$
	ListItemRequestDesc.Tag = tagcode
	ListItemRequestObject.text = $"${InfoText}"$
	ListItemRequestObject.Tag = tagcode
	listButPreRequestDownload.Tag = tagcode
	listButPreRequestView.Tag = tagcode
	listButPreSelect.Tag = tagcode
'	listButPreSelect.Visible = False
	
	p.Tag = tagcode
	Return p
End Sub

Sub CLAPreRequestTypeSpinner_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub CLAPreRequestSpinner_ItemClick (Position As Int, Value As Object)
	listRequests.Clear
	MakePreRequestTaskList(Position-1, 0, 0, "", "", "")
End Sub

'****************************************************************
'TIP: CLICK: LISTA TIPOS DE INTERVENÇÃO
'****************************************************************
Sub listButRequest_Click
	Dim bb As Button = Sender
	SelObject = bb.Tag
	noRequestPanel.Visible = True
	CLARequestList.Clear
	MakeTaskList(0, SelObject)
End Sub

Sub listButSelect_Click
	Dim thsibut As Button = Sender
	Dim lst As List = Regex.Split("\|", thsibut.Tag)
	If (lst.Size > 0) Then
		Dim ival As Int = lst.Get(1)
		If (ival = 0) Then
			thsibut.Tag = $"${lst.Get(0)}|1"$
			'thsibut.Color = Consts.ColorRed
			thsibut.TextColor = Consts.ColorRed
			SelectedObjectsCount = SelectedObjectsCount + 1
		Else
			thsibut.Tag = $"${lst.Get(0)}|0"$
			'BEBEBE
			'thsibut.Color = 0xFFBEBEBE
			thsibut.TextColor = 0xFFBEBEBE
			SelectedObjectsCount = SelectedObjectsCount - 1
		End If
		Log(thsibut.Tag)
	End If
	UpdateExtraButtons
End Sub

Sub MakeTaskList(Index As Int, theObject As String) ' VAI PARA AQUI NO RELAMPAGO DO OBJECTO
	
	Dim SQLEVC As String = $"SELECT a.tagcode, a.group_type, ifnull(b.tagdesc, '(Sem grupo)') AS taskgroup_desc, '' as typeresults_desc,
								a.title, a.details, 0 as dayslastupdate, a.group_tags, a.details,a.paramters,c.only_related_type_technicals,
								a.updated_at, a.active, a.published, a.tr_is_model, a.tr_model_modes,a.tagcode 
								FROM dta_typerequests AS a
								LEFT JOIN type_tpgroupstypes AS b ON (b.tagcode=a.group_type) 
								LEFT JOIN dta_typerequests_adds as c ON (c.typerequest_tagcode=a.tagcode)
								WHERE  1=1 
								and a.active=1
								and a.published=1 and a.is_internal=0 
								order by a.title"$
								
'	and create_cl_only_ondemand":0
								
'	Dim SQLEVC As String = $"select a.id, a.tagcode, a.title, a.task_type, a.task_group, a.type_results,
'							ifnull(b.tagdesc,'') as tasktype_desc, ifnull(c.title, '') as taskgroup_desc,
'							ifnull(e.tagdesc, '') as typeresults_desc,
'							a.active, ifnull(a.updated_at, '1970-01-01') as updated_at, 
'							round(ifnull((julianday('now') - julianday(ifnull(a.updated_at, '1970-01-01'))), 0)) as dayslastupdate
'							from dta_tasks as a
'							inner join type_taskstypes as b on (b.tagcode=a.task_type) 
'							left join dta_tasks_groups as c on (c.tagcode=a.task_group) 
'							left join type_resulttypes as e on (e.tagcode=a.type_results)
'							where 1=1 and a.published=1 and a.active=1 and a.task_type='TTT_001' "$
'
'	If (Index > 0) Then
'		Dim itc As DB_ITC = GroupList.Get(Index)
'		SQLEVC = $"${SQLEVC} and (a.tagcode IN
'								(SELECT DISTINCT task_tagcode FROM dta_typerequests_tasks WHERE typerequest_tagcode IN 
'									(SELECT distinct typerequest_tagcode FROM dta_tpr_groups_items WHERE tprgroup_tagcode in
'										(select distinct tagcode from dta_tpr_groups where id=${itc.ID}))))"$
'	End If
'	SQLEVC = $"${SQLEVC} order by a.title"$

	Dim height As Int = 45dip
	Dim TotalLineItemsCL As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
	Do While Record.NextRow
		If Utils.NNE(Record.GetString("tagcode")) Then
			Log(ItemsCounter)
			Dim CanAdd As Boolean = True
			Try
				Dim pp As Panel =  CreateRequestListItem(ItemsCounter, Record, CLARequestList.AsView.Width, height, theObject)
			Catch
				Log(LastException)
				Utils.WriteErrors2Log(LastException)
				CanAdd = False
			End Try
			If (CanAdd) Then
				TotalLineItemsCL = TotalLineItemsCL +1
				ItemsCounter = ItemsCounter + 1
				CLARequestList.Add(pp, "")
			End If
		End If
	Loop
	Record.Close
End Sub

Sub UpdateExtraButtons
	Dim v As Boolean = (SelectedObjectsCount > 0) And Not(noRequestPanel.Visible) And (listsTabPanel.CurrentPage = 0)
	butBulkCreateRequest.Visible = v
	butBulkPreRequest.Visible = v
End Sub

Sub CreateRequestListItem(cnt As Int, colitems As ResultSet, Width As Int, Height As Int, theObject As String) As Panel
	
	Dim p As Panel
	p.Initialize("")
'	p.SetLayoutAnimated(0, 1, 0, 0, Width, Height)
	p.Height = Height
	p.Width = Width
	p.LoadLayout("taskListRequest")
	p.RemoveView
	
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim title As String = colitems.GetString("title")
	Dim status_id As Int = colitems.GetInt("active")
	Dim dayslastupdate As String = colitems.GetInt("dayslastupdate")

	ListItemDesc.text = $"#${cnt} - ${title}"$
	ListItemDesc.Tag = tagcode

	If (status_id = 0) Then
		ListItemState.TextColor = Consts.ColorGray
		ListItemState.Text = Chr(0xF088)
	Else
		ListItemState.Text = Chr(0xF087)
		If (dayslastupdate >5) Then
			ListItemState.TextColor = Consts.ColorYellow
		Else
			ListItemState.TextColor = Consts.ColorGreen
		End If
	End If
	
	p.Tag = tagcode
	Return p
End Sub

Sub butBulkCreateRequest_Click
	FromBulkOption = 1
	listButRequest_Click
	UpdateExtraButtons
End Sub

Sub butBulkPreRequest_Click
	FromBulkOption = 1
	UpdateExtraButtons
End Sub




Sub CLARequestTypeSpinner_ItemClick (Position As Int, Value As Object)
	CLARequestList.Clear
	Dim index As Int = Position-1
	MakeTaskList(index, "")
End Sub

Sub butCreateRequestCancel_Click
	noRequestPanel.Visible = False
	CLARequestTypeSpinner.SelectedIndex = 0
	CLARequestList.Clear
	SelCheckList = ""
	SelObject = ""
	FromBulkOption = 0
	UpdateExtraButtons
End Sub

Sub butCreateRequest_Click
	
	Dim Verdade As Boolean = Utils.NNE(SelCheckList)  And Utils.NNE(SelObject)
	If Verdade Then
'		Dim sSQL As String = $"select distinct task_tagcode from dta_typerequests_tasks where typerequest_tagcode='${SelCheckList}' "$
		Dim sSQL As String = $"select distinct a.task_tagcode
							from dta_typerequests_tasks as a
							left join dta_typerequests_tasks_adds as b on
								(b.typerequest_tagcode=a.typerequest_tagcode
								and b.task_tagcode=a.task_tagcode)
							where 1=1
							and a.typerequest_tagcode='${SelCheckList}'
							and b.paramters not like '%create_cl_only_ondemand":1%';"$

		Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL)
		Dim SelCheckListList As List : SelCheckListList.Initialize
		Do While Record.NextRow
			SelCheckListList.Add(Record.GetString("task_tagcode"))
		Loop
		Record.Close
		If (SelCheckListList.Size>=1) Then
			CreateRequestsToObjects2(SelCheckList, SelCheckListList, SelObject, True)
		Else
			MsgboxAsync(ShareCode.NoChecklistInTypeRequest, ShareCode.GeneralAlertTitle)
		End If
	End If
	
	
'	Dim Verdade As Boolean = Utils.NNE(SelCheckList)
'	Dim Verdade As Boolean = Verdade And (Utils.NNE(SelObject) Or (FromBulkOption = 1))
'	If Verdade Then
'		
'		Try
'			Dim newRequestType As String = ""
'			Dim sSQL As String = $"select distinct tagcode, title, tr_is_model
'				from dta_typerequests 
'				where tagcode in (select distinct typerequest_tagcode 
'					from dta_typerequests_tasks where task_tagcode='${SelCheckList}')"$   ' limit 1"$
'			Log(sSQL)
'
'			Private Record As Cursor
'			Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
'			If Record.RowCount >= 1 Then
'				For n=0 To Record.RowCount-1
'					Record.Position = n
'					newRequestType = Record.GetString("tagcode")
'					Dim model As Int = Record.GetInt("tr_is_model")
'					If (model = 1) Then
'						Dim newRequestType As String = ""
'					End If
'				Next
'			End If
'			Record.Close
'
'			If Not(Utils.NNE(newRequestType)) Then
'				Dim nrt As String = ""
'				Dim sSQL As String = $"select distinct tagcode, title from dta_typerequests where id=0 and is_internal=1 limit 1"$
'				Private Recordw As Cursor
'				Recordw = Starter.LocalSQLEVC.ExecQuery(sSQL)
'				If Recordw.RowCount >= 1 Then
'					For n=0 To Recordw.RowCount-1
'						Recordw.Position = n
'						nrt = Recordw.GetString("tagcode")
'					Next
'				End If
'				Recordw.Close
'				newRequestType = Utils.IfNullOrEmpty(nrt, "TSKS_INTERNO_01")
'			End If
'			
'			If Utils.NNE(newRequestType) Then
'				If (FromBulkOption = 1) Then
'					Dim cc As Int = 0
'					Dim tagList As List : tagList.initialize
'					For n = 0 To listObjects.Size-1
'						Dim p As Panel = listObjects.GetPanel(n)
'						Dim b As Button = p.GetView(10)
'						If Utils.NNE(b.Tag) Then
'							Dim lst As List = Regex.Split("\|", b.Tag)
'							If (lst.Size >= 1) Then
'								Dim tagcode As String = lst.Get(0)
'								If (lst.Size > 1) Then
'									Dim isSel As Int = lst.Get(1)
'									If (isSel = 1) Then
'										tagList.Add(tagcode)
'										cc = cc + 1
'									End If
'								Else
'									tagList.Add(tagcode)
'									cc = 1
'								End If
'							End If
'						End If
'					Next
'					If (tagList.Size >= 1) Then
'						For i=0 To tagList.Size-1
'							CreateRequestsToObjects(newRequestType, SelCheckList, tagList.Get(i), False)
'						Next
'					End If
'					If (cc >= 1) Then	
'						Dim dialog As Int
'						dialog = Msgbox2(ShareCode.AppDialogsCriadasIntervencoesObjectos, ShareCode.GeneralAlertTitle, ShareCode.Option_REQUESTS, ShareCode.Option_BACK, "", Null)
'						If (dialog=DialogResponse.POSITIVE) Then
'							CallSubDelayed3(requests3, "StartRequestActivity", False, ShareCode.CurrentRequestFilter)
'							ShareCode.SetAnimation("zoom_enter", "zoom_exit")
'						End If
'					End If
'				Else
'					CreateRequestsToObjects(newRequestType, SelCheckList, SelObject, True)
'				End If
'
'			Else
'				MsgboxAsync(ShareCode.AppDialogsNaoVerificadoTipoIntervencao, ShareCode.GeneralAlertTitle)
'			End If
'		Catch
'			Log(LastException.Message)
'		End Try
'
'		ProgressDialogHide
'	End If
'	FromBulkOption = 0
'	UpdateExtraButtons
End Sub

' *************************************************************
' TIP: CRIAÇÃO DE PEDIDO DE INTERVENÇÃO PARA O OBJECTO (OLD)
' *************************************************************
Sub CreateRequestsToObjects(newRequestType As String, strSelCheckList As String, strSelObject As String, RunCL As Boolean)
	ProgressDialogShow(ShareCode.objectMsgPrepararInter)
	Sleep(100)
	Dim newRequestItem As Map
	newRequestItem.Initialize
	
	Dim entity_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select case when (parent_tagcode is null) or (parent_tagcode='') then tagcode else parent_tagcode end as valor
						from dta_objects where tagcode='${strSelObject.trim}'"$, "valor")
	If Utils.NE(entity_tagcode) Then
		entity_tagcode = strSelObject.trim
	End If
	
	Dim newRequest As String = Utils.MakeRequestTagcode
	Dim newDate As String = Utils.GetCurrentDate
	Dim newTime As String = Utils.GetCurrentTimeExt
	' CRIA UMA INTERVENÇÃO
	Dim newExecution As Map
	newExecution.Initialize
	newExecution.Put("id",0)
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
	newExecution.Put("entity_tagcode", entity_tagcode)
	newExecution.Put("object_tagcode", strSelObject)
	newExecution.Put("technical_tagcode", ShareCode.SESS_OPER_User)
	newExecution.Put("team_tagcode", "")
	newExecution.Put("local_tagcode", "")
	newExecution.Put("typerequest_tagcode", newRequestType)
	newExecution.Put("vehicle_tagcode", ShareCode.SESS_VEHICLE_OBJECT)
	newExecution.Put("confirmed", 1)
	newExecution.Put("active", 1)
	Dim ListOfMaps As List
	ListOfMaps.Initialize
	ListOfMaps.Add(newExecution)
	newRequestItem.Put("request", ListOfMaps)
'	DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
	Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests", ListOfMaps,newRequest,"")
				
	Dim repeatcounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${strSelCheckList}'"$)
			
	Dim newExecution As Map
	newExecution.Initialize
	newExecution.Put("id",0)
	newExecution.Put("request_tagcode", newRequest)
	newExecution.Put("relation_tagcode", strSelCheckList)
	newExecution.Put("inner_title", "")
	newExecution.Put("position", 0)
	newExecution.Put("type_relation", 0)
	newExecution.Put("status_id", 1)
	newExecution.Put("excel_import", 0)
	newExecution.Put("imported", 0)
	newExecution.Put("import_tagcode", "")
	newExecution.Put("object_tagcode", strSelObject)
	newExecution.Put("execute_date", newDate)
	newExecution.Put("execute_start", newTime)
	newExecution.Put("execute_end", newTime)
	newExecution.Put("repeatcounter", repeatcounter)
	newExecution.Put("active", 1)
	Dim ListOfMaps As List
	ListOfMaps.Initialize
	ListOfMaps.Add(newExecution)
	newRequestItem.Put("relation", ListOfMaps)
'	DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
	Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,newRequest,"")
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000

	Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
					tagcode,position,execute_value,execute_format_title, confirmed,changed_value, repeatcounter)
					select ${maxID}, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
					x.item_tagcode, x.unique_key, x.tagcode, x.position, 
					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter
					from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, 
					a.relation_tagcode As task_tagcode, 
					c.item_tagcode, c.unique_key, d.tagcode As tagcode, 
					ifnull(d.position, c.position) As position, '' as execute_value, 
					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
					 0 as confirmed, '' as changed_value, a.repeatcounter
					from dta_requests_relations As a
					inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)
					inner join dta_tasks_items As c on (c.task_tagcode=a.relation_tagcode)
					left join dta_tasks_items_answers As d on (d.parent_tagcode=c.unique_key)
					where a.type_relation=0 And a.request_tagcode='${newRequest}' and a.relation_tagcode='${strSelCheckList}' and a.repeatcounter=${repeatcounter}
					) As x
					order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$

	Log(sSQL)
	Starter.LocalSQLEVC.ExecNonQuery(sSQL)
	
	Dim resfields As ResumableSub = createRequestFields(newRequest, newRequestType)
	Wait For(resfields) Complete (resfieldsOk As Boolean)
		
	Dim resa1 As ResumableSub = createRequestEntityRelation(newRequest, strSelObject)
	Wait For(resa1) Complete (resfieldsOk1 As Boolean)
		
	Dim resa2 As ResumableSub = createRequestObjectRelation(newRequest, strSelObject)
	Wait For(resa2) Complete (resfieldsOk2 As Boolean)
			
	UploadNewRequest2Server(newRequest, newRequestItem, "0")
	Sleep(1000)
	
	ProgressDialogHide
	
	If (RunCL) Then
		butCreateRequestCancel_Click
		RunThisChecklist(newRequest)
	End If
		
End Sub

' *************************************************************
' TIP: CRIAÇÃO DE PEDIDO DE INTERVENÇÃO PARA OS OBJECTOS
' *************************************************************
Sub CreateRequestsToObjects2(newRequestType As String, strSelCheckListList As List, strSelObject As String, RunCL As Boolean)
	ProgressDialogShow(ShareCode.objectMsgPrepararInter)
	Dim newRequestItem As Map
	newRequestItem.Initialize
	
	Dim newRequest As String = Utils.MakeRequestTagcode
	Dim newDate As String = Utils.GetCurrentDate
	Dim newTime As String = Utils.GetCurrentTimeExt
	
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests", "id", "") + 1
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
	newExecution.Put("entity_tagcode", strSelObject)
	newExecution.Put("object_tagcode", strSelObject)
	newExecution.Put("technical_tagcode", ShareCode.SESS_OPER_User)
	newExecution.Put("team_tagcode", "")
	newExecution.Put("local_tagcode", "")
	newExecution.Put("typerequest_tagcode", newRequestType)
	newExecution.Put("vehicle_tagcode", ShareCode.SESS_VEHICLE_OBJECT)
	newExecution.Put("confirmed", 1)
	newExecution.Put("active", 1)
	Dim ListOfMaps As List
	ListOfMaps.Initialize
	ListOfMaps.Add(newExecution)
	newRequestItem.Put("request", ListOfMaps)
'	DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
	Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests", ListOfMaps,newRequest,"")
	
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_objects", "id", "") + 1
	Dim newExecution As Map
	newExecution.Initialize
	newExecution.Put("id", maxID)
	newExecution.Put("request_tagcode", newRequest)
	newExecution.Put("object_tagcode", strSelObject)
	newExecution.Put("ismaster", 0)
	newExecution.Put("active", 1)
	Dim ListOfMaps As List
	ListOfMaps.Initialize
	ListOfMaps.Add(newExecution)
	DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_objects", ListOfMaps)
	
	Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_entities", "id", "") + 1
	Dim newExecution As Map
	newExecution.Initialize
	newExecution.Put("id", maxID)
	newExecution.Put("request_tagcode", newRequest)
	newExecution.Put("entity_tagcode", strSelObject)
	newExecution.Put("entity_type", "")
	newExecution.Put("ismaster", 0)
	newExecution.Put("active", 1)
	Dim ListOfMaps As List
	ListOfMaps.Initialize
	ListOfMaps.Add(newExecution)
	DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_entities", ListOfMaps)
	
	For nn=0 To strSelCheckListList.size-1
		Dim strSelCheckList As String = strSelCheckListList.Get(nn)
		Dim repeatcounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${strSelCheckList}'"$)
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1
						
		Dim newExecution As Map
		newExecution.Initialize
		newExecution.Put("id", maxID)
		newExecution.Put("request_tagcode", newRequest)
		newExecution.Put("relation_tagcode", strSelCheckList)
		newExecution.Put("inner_title", "")
		newExecution.Put("position", 0)
		newExecution.Put("type_relation", 0)
		newExecution.Put("status_id", 1)
		newExecution.Put("excel_import", 0)
		newExecution.Put("imported", 0)
		newExecution.Put("import_tagcode", "")
		newExecution.Put("object_tagcode", strSelObject)
		newExecution.Put("execute_date", newDate)
		newExecution.Put("execute_start", newTime)
		newExecution.Put("execute_end", newTime)
		newExecution.Put("repeatcounter", repeatcounter)
		newExecution.Put("active", 1)
		Dim ListOfMaps As List
		ListOfMaps.Initialize
		ListOfMaps.Add(newExecution)
		newRequestItem.Put("relation", ListOfMaps)
'		DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
		Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,newRequest,"")
		
		Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1
		Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
					tagcode,position,execute_value,confirmed,changed_value, repeatcounter)
					select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
					x.item_tagcode, x.unique_key, x.tagcode, x.position, 
					x.execute_value, x.confirmed, x.changed_value, x.repeatcounter
					from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, 
					a.relation_tagcode As task_tagcode, 
					c.item_tagcode, c.unique_key, d.tagcode As tagcode, 
					ifnull(d.position, c.position) As position, '' as execute_value, 0 as confirmed, '' as changed_value, a.repeatcounter
					from dta_requests_relations As a
					inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)
					inner join dta_tasks_items As c on (c.task_tagcode=a.relation_tagcode)
					left join dta_tasks_items_answers As d on (d.parent_tagcode=c.unique_key)
					where a.type_relation=0 And a.request_tagcode='${newRequest}' and a.relation_tagcode='${strSelCheckList}' and a.repeatcounter=${repeatcounter}
					) As x
					order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$
		Log(sSQL)
		'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		Utils.SaveSQLToLog("CriaDtaRequestValues",sSQL, newRequest)
		
	Next
	
	Dim resfields As ResumableSub = createRequestFields(newRequest, newRequestType)
	Wait For(resfields) Complete (resfieldsOk As Boolean)
		
	Dim resa1 As ResumableSub = createRequestEntityRelation(newRequest, strSelObject)
	Wait For(resa1) Complete (resfieldsOk1 As Boolean)
		
	Dim resa2 As ResumableSub = createRequestObjectRelation(newRequest, strSelObject)
	Wait For(resa2) Complete (resfieldsOk2 As Boolean)
			
'	Dim insSQL As String = $"insert into dta_requests_fields (id, request_tagcode, field_tagcode)
'														Select id, '${newRequest}' as request_tagcode, field_tagcode 
'														from dta_typerequests_fields where typerequest_tagcode='${newRequestType}' 
'														And '${newRequest}'||field_tagcode not in 
'															(Select '${newRequest}'||field_tagcode as campo 
'															from dta_requests_fields
'															where request_tagcode='${newRequest}')"$
'	Utils.SaveSQLToLog("CriaCamposAdicionais",insSQL, newRequest)
	
	Dim res As ResumableSub = UploadNewRequest2Server2(newRequest, newRequestItem, "0", newRequestType)
	Wait For(res) Complete (NewRequestCode As String)
	If(Utils.NNE(NewRequestCode)) Then
		If Not(newRequest = NewRequestCode) Then
			Dim sSQL As String = $"update dta_requests set tagcode='${NewRequestCode}' where tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
			Dim sSQL As String = $"update dta_requests_adds set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
					
			Dim sSQL As String = $"update dta_requests_entities set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
					
			Dim sSQL As String = $"update dta_requests_objects set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
					
			Dim sSQL As String = $"update dta_requests_contacts set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
					
			Dim sSQL As String = $"update dta_requests_fields set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
					
			Dim sSQL As String = $"update dta_requests_relations set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
			Dim sSQL As String = $"update dta_requests_relations_adds set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
					
			Dim sSQL As String = $"update dta_requests_values set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
			Dim sSQL As String = $"update dta_requests_values_adds set request_tagcode='${NewRequestCode}' where request_tagcode='${newRequest}';"$
			Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode)
			newRequest = NewRequestCode
		End If
	End If
			
	Sleep(1000)
	ProgressDialogHide
	
	If (RunCL) Then
		RunThisChecklist(newRequest)
	End If
		
End Sub

'TIP: UPDATE NEW REQUEST TO SERVER 
Sub UploadNewRequest2Server2(tagcode As String, items As Map, origin As String, reqtype As String) As ResumableSub
	Dim RetValue As String = ""
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
			RetValue = Utils.IfNullOrEmpty(MapJSON.Get("newrequest"), "")
			
			
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", tagcode)
			params.Put("ACLARequestType", reqtype)
								
			Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla-fields/create"$
			If Not(ShareCode.APP_WORKING_LOCAL) Then
				Utils.CallApi(0, params, Me, Url, "", tagcode)
			Else
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,"","")
				Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
			End If
			Sleep(500)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.trim,"","")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End If
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,"","")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If
	Return RetValue
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

' *************************************************************
' TIP: PROCEDIMENTO DE EXECUÇÃO DE CHAKLIST/INTERVENÇÃO
' *************************************************************
Sub RunThisChecklist(newRequest As String)
	
	ProgressDialogShow(ShareCode.objectMsgPrepararInter)
	Sleep(100)
	
	Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS
				sSQL = $"${sSQL} and z.request_tagcode='${newRequest}'"$
	Log(sSQL)
	Log(newRequest)

'	Private incolitems As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL)
'	Do While incolitems.NextRow
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
		Dim object_tagcode As String = incolitems.GetInt("object_tagcode")
		Dim request_type As String = incolitems.GetInt("request_type")
		
				
		Dim sACLADatetime As String = Utils.GetCurrDatetime
		Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
		Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

		Dim sDate As String = Utils.GetCurrentDate
		Dim sTime As String = Utils.GetCurrentTimeExt
				
		Dim close_type As Int = incolitems.GetInt("close_type")
		Dim result_type As Int = incolitems.GetInt("result_type")
		Dim result_values As String = incolitems.GetString("result_values")
		Dim repeatcounter As Int = incolitems.GetInt("repeatcounter")
				
		Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(2, close_type, result_type, result_values, False, 0, 0, 0, Null, Null, -1)
		Dim CLA As RequestCLA = Types.MakeRequestCLA(tagcode, actionkey, task, repeatcounter, tasktype, _
											Types.MakeInterv(ID, tagcode, status_id, Utils.ColorInt(status_id)), CLAInfo, _
											Types.MakeOtherCLA("", "", ""))
				
		Dim sSQL As String = $"update dta_requests set status_id=2, run_date='${sDate}', run_start='${sTime}'
										where tagcode='${tagcode}'"$
		Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'
										where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}'"$
		Starter.LocalSQLEVC.ExecNonQuery(sSQL)
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
			Utils.WriteErrors2Log(LastException)
			params.Put("ACLALatitude", "")
			params.Put("ACLALongitude", "")
			Utils.logError("ACLALatitude - ACLALongitude", ShareCode.SESS_OPER_User, LastException)
		End Try
		CLA.Info.Map1 = params
				
		Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'
								where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}' and repeatcounter=${repeatcounter}"$
		Starter.LocalSQLEVC.ExecNonQuery(sSQL)
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
		params.Put("ACLAFirst", 1)
					
		params.Put("ACLAReqCounter", repeatcounter)
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
			Utils.WriteErrors2Log(LastException)
			params.Put("ACLALatitude", "")
			params.Put("ACLALongitude", "")
		End Try
		CLA.Info.Map2 = params
		CLA.Status.status = 2
		
		'**********************************************************************************
		'CHECK: ATUALIZA CAMPOS __TYPEREQUEST__ COM O OBJECTO PREENCHIDO
		'**********************************************************************************
		Dim object_type As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(object_type, '') as valor
						from dta_objects where tagcode='${object_tagcode.trim}'"$, "valor")
						
		Dim resa2 As ResumableSub = UpdateTyperequestFields(object_type, object_tagcode, request_type, tagcode, _
									actionkey, repeatcounter, CLA) 
		Wait For(resa2) Complete (resfieldsOk2 As Boolean)
		Sleep(100)
		
		'**********************************************************************************
		'CHECK: ADICIONAR CAMPOS ESPECIFICOS DAS EDP COM O OBJECTO PREENCHIDO
		'**********************************************************************************
		Dim res As ResumableSub = FillAdditionalFields(CLA, tagcode, actionkey)
		Wait For (res) Complete (Finished As Boolean)
		Sleep(100)
		
		' *****************************************************************
		' CHECK: VERIFICA SE TEM PARAMETROS ESPECÍFICOS
		' DTA_TYPEREQUESTS_TASKS_ADDS->PARAMTERS
		' *****************************************************************
		Dim res1 As ResumableSub = CheckDatToUpdateInChecklist(request_type, tagcode, actionkey, repeatcounter)
		Wait For (res1) Complete (Finished1 As Boolean)
		Sleep(100)
		
		Try
'			ProgressDialogHide
			
			Dim tr_is_model As Int = DBStructures.GetScriptColumnIntEVC($"select tr_is_model from dta_typerequests
					where tagcode in (select typerequest_tagcode from dta_requests where tagcode = '${tagcode}')"$, "tr_is_model")
			
			If Utils.Int2Bool(tr_is_model) Then
				CallSubDelayed3(CheckList3, "StartCLA_Activity_Child", CLA, name)
			Else
				CallSubDelayed3(CheckList3, "StartCLA_Activity", CLA, name)
			End If
			
		Catch
			ProgressDialogHide
			Log(LastException)
			Utils.WriteErrors2Log(LastException)
			Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
		End Try
	Else
		ProgressDialogHide
	End If
End Sub

Sub CheckDatToUpdateInChecklist(request_type As String, tagcode As String, actionkey As String, repeatcounter As Int) As ResumableSub
	Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_typerequests_tasks_adds where 1=1
												And typerequest_tagcode='${request_type.Trim}'
												And task_tagcode='${actionkey.trim}'"$, "paramters")	
												
	Try
		Dim upload_data As Int = QuestParams.Get("upload_data")
	Catch
		Dim upload_data As Int = 0
		Log(LastException)
		Utils.WriteErrors2Log(LastException)
	End Try
							
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
																	and a.task_tagcode='${actionkey.Trim}'  order by a.position"$


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
																			and task_tagcode='${actionkey.Trim}'
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
	
	Log("CheckDatToUpdateInChecklist")
	Return True
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
	
	Log("FillAdditionalFields")
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
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,CLA.Request.Trim,"","")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,CLA.Request.Trim,"","")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If'
	
	Return True
	
End Sub



Sub UpdateTyperequestFields(object_type As String, objecttagcode As String, request_type As String, tagcode As String, _
	actionkey As String, repeatcounter As Int, CLA As RequestCLA)  As ResumableSub
	' *****************************************************************
	' CHECK:  VERIFICA SE EXISTEM CAMPOS A ACTUALIZAR OS CAMPOS DA CHECKLIST
	' BASE DE DADOS -> CHECKLIST
	' *****************************************************************
	If Utils.NNE(objecttagcode) And Not(objecttagcode = "__NONE__") Then
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
							Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,"","")
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
									Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,CLA.Request.Trim,CLA.Task.trim,"")
									Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
								End If
								Sleep(250)
							Else
								Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,CLA.Request.Trim,CLA.Task.trim,"")
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
							Dim ObjSQL As String = $"select distinct `value` from dta_objects_fields where object_tagcode='${objecttagcode}'
																		and field_tagcode='${do_field}'"$
						Else
							If Utils.FieldInList(do_field, "address|address2|postalcode|phone|local|latitude|longitude|block|floor|door") Then
								Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_locations where tagcode in
																	(select local_tagcode from dta_objects where tagcode='${objecttagcode}')"$
							Else If Utils.FieldInList(do_field, "name|phone|email|mobile") Then
								Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_contacts where tagcode in
															(select contact_tagcode from dta_objects_contacts where object_tagcode='${objecttagcode}' limit 1)"$
							Else
								Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_objects where tagcode='${objecttagcode}'"$
							End If
													
							Log(ObjSQL)
						End If
						Private Record99 As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjSQL)
						If Record99.RowCount > 0 Then
							For nii = 0 To Record99.RowCount-1
								Record99.Position = nii
								Dim val As String = Utils.IfNullOrEmpty(Record99.GetString("value"), "")
								Dim NewSQL As String = $"update dta_requests_values set execute_status=1, execute_value='${val}',
															object_tagcode='${objecttagcode}'
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
	Log("UpdateTyperequestFields")
	Sleep(100)
	Return True
End Sub

' *************************************************************
' TIP: CRIAÇÃO DE PEDIDO PARA O OBJECTO NO SERVIDOR
' *************************************************************
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

Sub CLARequestList_ItemClick (Index As Int, Value As Object)
	ListItemsListClearSelection
	Dim pan As Panel = CLARequestList.GetPanel(Index)
	pan.Color = 0x9637FF4B
	SelCheckList = pan.Tag
End Sub

Sub ListItemsListClearSelection
	For n=0 To CLARequestList.Size-1
		Dim pan As B4XView = CLARequestList.GetPanel(n)
		If Utils.NNE(pan.tag) Then
'			Dim lbl As Label = pan.GetView(0)
			pan.Color = 0xFFFFFFFF
		End If
	Next
End Sub

Sub noRequestPanel_Click
	
End Sub


Sub AddFavoriteLabel_Click
	Dim lbl As Label =  Sender
	Dim requestAdded As String = 0xFFD3D3D3
	
	If(lbl.TextColor <> requestAdded)Then
		lbl.Text  = Chr(0xf006)
		lbl.TextColor = 0xFFD3D3D3
		
	Else
		lbl.Text  = Chr(0xf005)
		lbl.TextColor = 0xFFFFCC00
		
	End If
End Sub

Sub CLAPreRequestCountyPickerLabel_ItemClick (Position As Int, Value As Object)
'	MakePreRequestTaskList(0, 0, Position, "")
	MakePreRequestTaskList(CumulativeTypeRequest, CumulativeDistrict, Position, CumulativeDateIn, CumulativeDateOut, CumulativeFilter)
End Sub

Sub CLAPreRequestDistrictePickerLabel_ItemClick (Position As Int, Value As Object)
'	MakePreRequestTaskList(0, Position, 0, "")
	Dim where As String = ""
	If (Position > 0) Then
		Dim r As CodeNameList = DistrictsList.Get(Position-1)
		where = $"where district_tagcode='${r.TagCode}'"$
	End If
	CumulativeCounty = 0
'	CLAPreRequestDistrictePickerLabel.SelectedIndex = 0    '.Text = "(Todos)"
	CountyList.Clear
	CountyList = DBStructures.GetListOfFromScriptCNLEVC("tagcode", "title", $"select tagcode, title, country_id, district_tagcode from dta_counties ${where} order by title"$)
	CLAPreRequestCountyPickerLabel.Clear
	CLAPreRequestCountyPickerLabel.Add("(Todos)")
	For c=0 To CountyList.Size -1
		Dim c2g As CodeNameList = CountyList.Get(c)
		CLAPreRequestCountyPickerLabel.Add(c2g.Name)
	Next

End Sub

Sub CLAPreRequestEditSearch_EnterPressed
	MakeListSearchPreRequest(CLAPreRequestEditSearch.Text)
End Sub

Sub MakeListSearchPreRequest(search As String)
	Dim Filter As String = $" and (ifnull(e.title, '')||ifnull(a.execute_date, '')||ifnull(b.title_import,'')||ifnull(b.details,'')||ifnull(b.reference,'')||ifnull(a.local_tagcode, '')||ifnull(cc.address, '')||ifnull(cc.address2, '')||ifnull(cc.postalcode, '')||ifnull(cc.`local`, '')||ifnull(cc.latitude, '')||ifnull(cc.longitude, '')||ifnull(b2.title_import,'') like '%${search}%') "$
	MakePreRequestTaskList(CumulativeTypeRequest, CumulativeDistrict, CumulativeCounty, CumulativeDateIn, CumulativeDateOut, Filter)
End Sub

Sub CLAPreRequestPickerLabel_ItemClick (Position As Int, Value As Object)
'	MakePreRequestTaskList(Position, 0, 0, "")
	MakePreRequestTaskList(Position, CumulativeDistrict, CumulativeCounty, CumulativeDateIn, CumulativeDateOut, CumulativeFilter)
End Sub

Sub listButPreSelectAll_Click
	If listButPreSelectAll.Text = Chr(0xF046) Then
		listButPreSelectAll.Text = Chr(0xF096)
		SetAllPreReqSelect(False)
	Else
		listButPreSelectAll.Text = Chr(0xF046)
		SetAllPreReqSelect(True)
	End If
	SetPreReqList
End Sub

Sub SetAllPreReqSelect(SelectState As Boolean)
	If SelectState = True Then
		For inx=0 To listRequests.Size -1
			Dim p As Panel
			p = listRequests.GetPanel(inx)
			Dim b As Button
			b = p.GetView(0)
			b.Text = Chr(0xF046)
		Next
	Else
		For inx=0 To listRequests.Size -1
			Dim p As Panel
			p = listRequests.GetPanel(inx)
			Dim b As Button
			b = p.GetView(0)
			b.Text = Chr(0xF096)
		Next
	End If
	
	
End Sub

'PRE VISUALIZAR PEDIDOS
Sub listButPreRequestView_Click
	Dim bb As Button = Sender
	If Utils.NNE(bb.Tag) Then
		ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
		ShowRequestInfoDialog(bb.Tag, "Informação do Pedido", listsBasePanel)
		ProgressDialogHide
	Else
		MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo, ShareCode.GeneralAlertTitle)
	End If
End Sub

' *************************************************************
' TIP: DOWNLOAD DE PEDIDOS E EXECUÇÃO - PREREQUESTS
' *************************************************************
Sub listButPreRequestDownload_Click
	Dim bb As Button = Sender
	If Utils.NNE(bb.Tag) Then
		Dim ReqTagcode As String = bb.Tag
		Dim i As Int = Msgbox2(ShareCode.objectsMsgConfirmaatribuicaoasi, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, ShareCode.Option_YESEXEC,  Null)
		If (i=DialogResponse.POSITIVE) Or (i=DialogResponse.NEGATIVE) Then

			ProgressDialogShow2(ShareCode.objectMsgPrepararInter, False)
			Sleep(250)
			Dim CurrDate As String = Utils.GetDate(DateTime.Now)
			Dim CurrTime As String = Utils.GetCurrentTime
			Dim EntityTag As String = DBStructures.GetScriptColumnStrEVC($"select
										Case WHEN (entity_tagcode <> '') and (entity_tagcode is not null) THEN entity_tagcode 
										ELSE '__NONE__' End  as entity_tagcode
										from dta_requests where tagcode='${ReqTagcode}'"$, _
										"entity_tagcode")
			Dim ObjectTag As String = DBStructures.GetScriptColumnStrEVC($"select
										Case WHEN (object_tagcode <> '') and (object_tagcode is not null) THEN object_tagcode 
										ELSE '__NONE__' End  as object_tagcode
										from dta_requests where tagcode='${ReqTagcode}'"$, _
										"object_tagcode")
			Dim typerequest_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode
										from dta_requests where tagcode='${ReqTagcode}'"$, _
										"typerequest_tagcode")
			Dim sSQL As String = $"update dta_requests set state_id=4, technical_tagcode='${ShareCode.SESS_OPER_User}',
							entity_tagcode='${EntityTag}', 
							object_tagcode='${ObjectTag}', 
							execute_date='${CurrDate}', 
							execute_start='${CurrTime}' 
							where tagcode='${ReqTagcode}'"$
			
			Utils.SaveSQLToLog("CLAItemButton_StateClick",sSQL, ReqTagcode.Trim)
			
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", ReqTagcode)
			params.Put("ACLAExecDate", CurrDate)
			params.Put("ACLAExecHour", CurrTime)
			params.Put("ACLAEntity", EntityTag)
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
				Utils.CallApi(0, params, Me, Url, "", ReqTagcode)
			Else
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,ReqTagcode.Trim,"","")
				Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
			End If
			Sleep(1500)
			If (i=DialogResponse.NEGATIVE) Then
				Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS
				sSQL = $"${sSQL} and z.request_tagcode='${ReqTagcode}'"$
				Log(sSQL)
				Log(ReqTagcode)
				Dim CLA As RequestCLA = Types.MakeRequestCLA("_NOACTION_", "_NOACTION_", "_NOACTION_", 0, 0, _
					Types.MakeInterv(0, "", 0, Consts.ColorWhite), _
					Types.MakeRequestTaskInfo(2, 0, 0, 0, False, 0, 0, 0, Null, Null, -1), _
					Types.MakeOtherCLA("","",""))
							
				Dim ContinuarExec As Boolean = True
				Dim Registos As Int = 0

				Private incolitems As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
				If (incolitems.RowCount>0) Then
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
					Dim repeatcounter As Int = incolitems.GetInt("repeatcounter")
				
					Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(2, close_type, result_type, result_values, False, 0, 0, 0, Null, Null, -1)
					Dim CLA As RequestCLA = Types.MakeRequestCLA(tagcode, actionkey, task, repeatcounter, tasktype, _
											Types.MakeInterv(ID, tagcode, status_id, Utils.ColorInt(status_id)), CLAInfo, _
											Types.MakeOtherCLA("","",""))
				
					Dim sSQL As String = $"update dta_requests set status_id=2, run_date='${sDate}', run_start='${sTime}'
										where tagcode='${tagcode}'"$
					Starter.LocalSQLEVC.ExecNonQuery(sSQL)
					Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'
										where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}'"$
					Starter.LocalSQLEVC.ExecNonQuery(sSQL)
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
						Utils.WriteErrors2Log(LastException)
						params.Put("ACLALatitude", "")
						params.Put("ACLALongitude", "")
						Utils.logError("ACLALatitude - ACLALongitude", ShareCode.SESS_OPER_User, LastException)
					End Try
					CLA.Info.Map1 = params
				
					Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'
								where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}' and repeatcounter=${repeatcounter}"$
					Starter.LocalSQLEVC.ExecNonQuery(sSQL)
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
					params.Put("ACLAFirst", 1)
					params.Put("versionTagcode", Main.VersionTagcode)
					params.Put("_authorization", Main.DeviceAuthorization)
					params.Put("_instance", Main.DeviceInstance)
					params.put("_deviceBrand", Main.DeviceBrand)
					params.put("_deviceModel", Main.DeviceModel)
					params.put("_deviceMacAddress", Main.DeviceMacAddress)
					params.Put("_user", ShareCode.SESS_User)
					params.Put("ACLAReqCounter", repeatcounter)
					Try
						params.Put("ACLALatitude", sACLALatitude)
						params.Put("ACLALongitude", sACLALongitude)
						Utils.logError("ACLALatitude - ACLALongitude", ShareCode.SESS_OPER_User, LastException)
					Catch
						Log(LastException)
						Utils.WriteErrors2Log(LastException)
						params.Put("ACLALatitude", "")
						params.Put("ACLALongitude", "")
					End Try
					CLA.Info.Map2 = params
					CLA.Status.status = 2
					Registos = Registos + 1
				End If
				incolitems.Close
				ContinuarExec = Registos > 0
			
				If ContinuarExec Then
					
					If Utils.NNE(ObjectTag) And Not(ObjectTag = "__NONE__") Then
						Private Record9 As Cursor
						Dim sSQL As String = $"SELECT b.connectmode, b.connect2data, a.do_name, a.do_field, a.do_is_additional,
										a.task_tagcode, a.item_tagcode, a.unique_key, a.data_type, a.title
										FROM dta_tasks_items AS a
										INNER JOIN dta_tasks AS b ON (b.tagcode=a.task_tagcode)
										WHERE  ((a.do_name <> '' AND a.do_field <> '' AND b.connect2data <> '') or
										 (a.do_name = '__TYPEREQUEST__' AND a.do_field <> '' )) and a.task_tagcode='${actionkey}'"$
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
									'VERIFICA SE OS CAMPOS FORAM LANÇADOS
									Dim insSQL As String = $"insert into dta_requests_fields (id, request_tagcode, field_tagcode)
														Select id, '${tagcode}' as request_tagcode, field_tagcode 
														from dta_typerequests_fields where typerequest_tagcode='${typerequest_tagcode}' 
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
									params.Put("ACLARequestType", typerequest_tagcode)
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
										Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0,tagcode.Trim,"","")
										Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
									End If
									Sleep(500)
						
									Dim ObjSQL As String = $"select distinct value from dta_requests_fields where request_tagcode='${typerequest_tagcode}' and field_tagcode='${do_field}'"$
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
									If (do_is_additional = 1) Then
										Dim ObjSQL As String = $"select distinct `value` from dta_objects_fields where object_tagcode='${ObjectTag}' and field_tagcode='${do_field}'"$
									Else
										If Utils.FieldInList(do_field, "address|address2|postalcode|phone|local|latitude|longitude|block|floor|door") Then
										'If ((do_field.Trim = "address") Or (do_field.Trim = "address2") Or (do_field.Trim = "postalcode") Or (do_field.Trim = "local")) Then
											Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_locations where tagcode in
																	(select local_tagcode from dta_objects where tagcode='${ObjectTag}')"$
										Else
											Dim ObjSQL As String = $"select distinct ${do_field} as `value` from dta_objects where tagcode='${ObjectTag}'"$
										End If
										Log(ObjSQL)
									End If
										
									Private Record99 As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjSQL)
									If Record99.RowCount > 0 Then
										For nii = 0 To Record99.RowCount-1
											Record99.Position = nii
											Dim val As String = Utils.IfNullOrEmpty(Record99.GetString("value"), "")
											Dim NewSQL As String = $"update dta_requests_values set execute_status=1, execute_value='${val}', object_tagcode='${ObjectTag}'
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
									
							Next
						End If
						Record9.Close
					End If
					
					ProgressDialogHide
					Try
						CallSubDelayed3(CheckList3, "StartCLA_Activity", CLA, name)
					Catch
						Log(LastException)
						Utils.WriteErrors2Log(LastException)
						Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
					End Try
				End If
			Else
				MakePreRequestTaskList(0, 0, 0, "", "", "")
			End If
			ProgressDialogHide
		End If
	Else
		MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo,ShareCode.GeneralAlertTitle)
	End If
End Sub

Sub listButPreSelect_Click
	Dim btn As Button
	btn = Sender
	
	If btn.Text = Chr(0xF046) Then
		btn.Text = Chr(0xF096)
	Else
		btn.Text = Chr(0xF046)
	End If
	
	SetPreReqList
	
End Sub

Sub SetPreReqList
	
	LstPreReqs2Download.Clear
	For inx=0 To listRequests.Size -1
		Dim p As Panel
		p = listRequests.GetPanel(inx)
		Dim b As Button
		b = p.GetView(0)
		If b.Text = Chr(0xF046) Then ' Selected
			LstPreReqs2Download.Add(b.Tag)
		End If
	Next
	
	For i=0 To LstPreReqs2Download.Size -1
		Log(LstPreReqs2Download.Get(i))
	Next
	
	If LstPreReqs2Download.Size >= 1 Then
		CLAButtonRequestDownload.Enabled = True
		CLAButtonRequestDownload.Visible = True
	Else
		CLAButtonRequestDownload.Enabled = False
		CLAButtonRequestDownload.Visible = False
	End If
	
End Sub

'REVISUALIÇÃO DO PEDIDO - OBJECTOS
Sub ShowRequestInfoDialog(tagcode As String, title As String, parentDialog As B4XView)
	
	
	Dim sf As Object = ThisDialog.ShowAsync(title, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ThisDialog.SetSize(70%x, 80%y)
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("Request_Information_View")
	
	Dim SQL As String = $"${DBStructures.EVC_SQL_GETPREREQUESTS_DATA_NEW} and a.tagcode='${tagcode}' "$
	Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	If (Record.RowCount>=1) Then
		Record.Position = 0
		Dim tagcode As String = Record.GetString("tagcode")
		Dim request_desc As String = Record.GetString("request_desc")
		Dim name As String = Record.GetString("name")
		Dim nameobject As String = Record.GetString("nameobject")
		Dim request_date As String = Record.GetString("request_date")
		Dim request_stime As String = Record.GetString("request_stime")
		Dim details As String = Record.GetString("details")
				
		LabelPreRequestNumber.Text = tagcode
		LabelPreRequestType.Text = request_desc
		LabelPreRequestEntity.Text = name
		LabelPreRequestObject.Text = nameobject
		LabelPreRequestDateTime.Text = $"${request_date} / ${request_stime}"$
		LabelPreRequestDetails.Text = details
		
		'PREENCHIMENTO DAS PROPRIEDADES DO PEDIDO
		Dim SQL2 As String = $"${DBStructures.EVC_QL_CURRENT_REQUEST_PROPERTIES} and b.tagcode='${tagcode}' "$
		Private Record2 As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL2)
		If (Record2.RowCount>=1) Then
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				listOfFields.Add( CreateShowRequestInfoField(Record2, listOfFields.AsView), "" )
			Next
		End If
		Record2.Close
	End If
	Record.Close
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		'
	End If
End Sub

Sub CreateShowRequestInfoField(colitems As Cursor, parentDialog As B4XView) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, parentDialog.Width, 45dip)
	If(ShareCode.ISPHONE)Then
		p.LoadLayout("Request_Information_Fields_View")
	Else
		p.LoadLayout("Request_Information_Fields_View")
	End If
	p.RemoveView
	
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim title As String = colitems.GetString("title")
	Dim value As String = colitems.GetString("value")
	LabelPreRequestFieldName.text = title
	LabelPreRequestFieldValue.Text = value
	
	p.Tag = tagcode
	Return p
End Sub

Sub DialogReqEndDateLabel_Click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (DialogReqEndDateLabel.Text  <> "") Then
		dnow = DateTime.DateParse(DialogReqEndDateLabel.text)
	End If
	dd.Initialize("CalendarGetEndDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
	Log(dd.AccentColor) ' AccentColor2 = Colors.Blue
	dd.show("DialogReqEndDateLabel")
End Sub

Sub DialogReqStartDateLabel_Click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (DialogReqStartDateLabel.Text  <> "") Then
		dnow = DateTime.DateParse(DialogReqStartDateLabel.text)
	End If
	dd.Initialize("CalendarGetStartDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
	Log(dd.AccentColor) ' AccentColor2 = Colors.Blue
	dd.show("DialogReqStartDateLabel")
End Sub

Sub CalendarGetStartDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	DialogReqStartDateLabel.Text = $"${year}-${moy}-${dom}"$
	
	CumulativeDateIn = DialogReqStartDateLabel.Text
	CumulativeDateOut = DialogReqEndDateLabel.Text
	MakePreRequestTaskList(CumulativeTypeRequest, CumulativeDistrict, CumulativeCounty, CumulativeDateIn, CumulativeDateOut, CumulativeFilter)
End Sub

Sub CalendarGetEndDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	DialogReqEndDateLabel.Text = $"${year}-${moy}-${dom}"$
	
	CumulativeDateIn = DialogReqStartDateLabel.Text
	CumulativeDateOut = DialogReqEndDateLabel.Text
	MakePreRequestTaskList(CumulativeTypeRequest, CumulativeDistrict, CumulativeCounty, CumulativeDateIn, CumulativeDateOut, CumulativeFilter)
End Sub




