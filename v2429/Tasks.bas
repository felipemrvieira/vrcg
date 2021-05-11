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
'	Dim FocusedMarker, Marker1 As Marker
'	Dim MarkMyPosition As BalloonMarker
'	
'	Dim MapCenter As GeoPoint
'	Dim TileSource As String
'	Dim ZoomLevel As Int
'	Dim Markers As List
'	Dim MapFirstTime As Boolean
	
	Private MyPositionLat, MyPositionLon As String
	Public Device As Phone
	
'	Dim FocusedMarker, Marker0, Marker1, Marker2, Marker3 As Marker
'	Dim MapCenter As GeoPoint
'	Dim TileSource As String
'	Dim ZoomLevel As Int
End Sub

Sub Globals
	Private ButtonUserUnavailable As Button
	
	Private listsBasePanel As Panel
	Private listsBottomLine As Panel
	Private listsBottomPanel As Panel
	Private listsButtonClose As Button
	Private listsLabelInfo As Label
	Private listsTabPanel As TabStrip
	Private listsTopBar As Panel
	Private tasksListViewPanel As Panel
	Private tasksListViewActionsPanel As Panel
'	Private listEntities As CustomListView
'	Private mapData As Panel
'	Private listButMap As Button
'	Private ListItemDescription As Label
	Private ListItemFullName As Label
'	Private ListItemStatusPanel As Panel
	Private listsButtonFilter As Button
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelAppInfo As Label
	Private LabelCopyright As Label
'	Private ListItemReference As Label
'	Private ListItemContact As Label
'	Private listPedidosMap As CustomListView
'	Private listPedidosButtonMap As Button
'	Private ShowListPedidosMap As Boolean = False
'	Private Bloco30 As Int = 0
'	Private mapBaseList As Panel
'	Private mapBasePanel As Panel
'	Private mapZoomDown As Button
'	Private mapZoomUp As Button
'	Private ListItemType As Label
	Private ListItemStatus As Label
	Private ItemsCounter As Int = 0
	Private butSearch As Button
	Private EditSearch As EditText
'	Private ListItemNif As Label
	Private IsFiltered As Boolean = False
	Private iDialogReqType, iDialogReqStatus, iDialogReqUpdtated, iDialogReqWithRequests As Int
	Private SearchFilter As String
	Private listButActions As Button
	Private ListItemUpdate As Label
	Private ListItemState As Label
	Private ListItemProgress As ProgressBar
	Private listChecklists As CustomListView
	Private ListItemDateVersion As Label
	Private ListItemVersion As Label
	Private ColorTabPanel As Panel
	Private listActions As CustomListView
	
	Private CurrentLineItemCL As Int = 0
	Private TotalLineItemsCL As Int = 0
	Private CurrentLineItemAC As Int = 0
	Private TotalLineItemsAC As Int = 0
	Private CurrentTab As Int = 0
	Private mainLabelOptLists As Label
	Private mainLogo As ImageView
	Private ButtonActionPause As Button
	Private mainActiveUser As Label
	Private ButtonAppNetwork As Button
	Private ListItemDesc As Label
	Private ListItemGroup As Label
	Private ListItemType As Label
	Private ListItemsList As CustomListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'prvd.Initialize
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	
	Starter.CurrentWorkActivity = Me
	Activity.LoadLayout("tasksLayout")
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
	listsTabPanel.LoadLayout("tasks_listview", ShareCode.TABGeneral_ChecklistTitle)
	listsTabPanel.LoadLayout("tasks_listviewactions", ShareCode.TABGeneral_ActionsTitle)
	'listsTabPanel.LoadLayout("entities_mapview", ShareCode.TABGeneral_MapTitle)
	
	Utils.SetViewBackgroundColorToMainGradientColor(tasksListViewPanel)
	Utils.SetViewBackgroundColorToMainGradientColor(tasksListViewActionsPanel)
	
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 50%x  '33.33%x
	Next
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
	If FirstTime Then
		' **************
	End If
	
'	SearchFilter = ""
	Dim jo As JavaObject = listsTabPanel
	Dim event As Object = jo.CreateEventFromUI("android.support.v4.view.ViewPager.OnPageChangeListener", "PageChangeListener", Null)
	jo.GetFieldJO("tabStrip").RunMethod("setOnPageChangeListener", Array(event))
	
	UpdateMainLayout
End Sub

Sub Activity_Resume
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		listsButtonClose_Click
	End If
	Return True
End Sub

Sub PageChangeListener_Event (MethodName As String, Args() As Object) As Object
	If (MethodName = "onPageScrolled") Then
		CurrentTab = Args(0)
	End If
	WindowStatusUpdate
	Return Null
End Sub

Sub UpdateMainLayout
	mainLabelOptLists.TextColor = Consts.ColorMain
	mainLogo.Gravity = Gravity.FILL
	mainLogo.Width = Consts.LogoWidth
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

Sub WindowStatusUpdate
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
	If (CurrentTab = 0) Then
		listsLabelInfo.Text = $"${CurrentLineItemCL} / ${TotalLineItemsCL}"$
	Else
		listsLabelInfo.Text = $"${CurrentLineItemAC} / ${TotalLineItemsAC}"$
	End If
	
End Sub

Sub CancelAllFilters(run As Boolean)
	IsFiltered  = False
	iDialogReqType = 0
	iDialogReqStatus = 0
	iDialogReqUpdtated = 0
	iDialogReqWithRequests = 0
	StartTasksActivity(True, "")
End Sub

Sub SetTheFilters(flt As TaskFilter)
	IsFiltered  = True
	Dim Filter As String = ""
	
	'TaskFilter(TypeTask As Int, Status As Int, Updated As Int, WithRequests As Int)
	iDialogReqType = flt.TypeTask
	iDialogReqStatus = flt.Status
	iDialogReqUpdtated = flt.Updated
	iDialogReqWithRequests = flt.WithRequests
	
	If (iDialogReqStatus > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		If (iDialogReqStatus = 1) Then
			Filter = $"${Filter}(a.active=1)"$
		Else
			Filter = $"${Filter}(a.active=0)"$
		End If
	End If
	
	If (iDialogReqUpdtated > 0) Then
		If (Filter <> "") Then Filter = $"${Filter} and "$
		'Filter = $"${Filter}(a.type=${iDialogReqType})"$
		'ShareCode.CURRENT_APPDATE
		If (iDialogReqUpdtated = 1) Then
			Filter = $"${Filter}(${DBStructures.WHERE_DAYSBETWEEN_CONDITION} <= 5)"$
		Else
			Filter = $"${Filter}(${DBStructures.WHERE_DAYSBETWEEN_CONDITION} > 5)"$
		End If
	End If
	
	StartTasksActivity(True, Filter)
End Sub

Sub EditReturn(arg As String)
	'
End Sub


Sub StartTasksActivity(Clear As Boolean, Filter As String)
	'TaskFilters(TypeTask As Int, Status As Int, Updated As Int, WithRequests As Int)
	Starter.TaskSearchFilter = Filter
	If (Starter.EntityKeepFilter = True) Then
		Starter.EntityKeepFilter = False
		If (Starter.TaskSearchFilter <> "") Then
			Dim sFilter As String = Starter.TaskSearchFilter
			Starter.TaskSearchFilter = ""
			Starter.TaskFilters = Types.MakeTaskFilter(0, 0, 0, 0)
			StartTasksActivity(True, sFilter)
		Else
			Dim tFilter As TaskFilter = Starter.TaskFilters
			Starter.TaskFilters = Types.MakeTaskFilter(0, 0, 0, 0)
			Starter.TaskSearchFilter = ""
			SetTheFilters(tFilter)
		End If
	Else

		If Clear Then
			listChecklists.Clear
		End If
		
		'***************************************************************
		' LISTA DE CHECKLISTS
		'***************************************************************
		Dim height As Int = 85dip
		Private Record As Cursor
		ItemsCounter = 0
'		'Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} where a.type=1"$
'		Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} and a.type=1"$
'		
'		If (Filter <> "") Then
'			SQL = $"${SQL} and ${Filter}"$
'		End If
'		SQL = $"${SQL} order by a.name"$
'		Record = Starter.LocalSQL.ExecQuery(SQL)
		
		Dim SQLEVC As String = $"select a.id, a.tagcode, a.title, a.task_type, a.task_group, a.type_results, 
								ifnull(b.tagdesc,'') as tasktype_desc, ifnull(c.title, '') as taskgroup_desc,
								ifnull(e.tagdesc, '') as typeresults_desc,
								a.active, ifnull(a.updated_at, '1970-01-01') as updated_at, 
								round(ifnull((julianday('now') - julianday(ifnull(a.updated_at, '1970-01-01'))), 0)) as dayslastupdate
								from dta_tasks as a
								inner join type_taskstypes as b on (b.tagcode=a.task_type) 
								left join dta_tasks_groups as c on (c.tagcode=a.task_group) 
								left join type_resulttypes as e on (e.tagcode=a.type_results)
								where 1=1 and a.published=1 "$
								
		Dim SQL As String = $"${SQLEVC} and a.task_type=='TTT_001'"$
		If (Filter <> "") Then
			SQL = $"${SQL} and ${Filter}"$
		End If
		SQL = $"${SQL} order by a.title"$
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		CurrentLineItemCL = 0
		TotalLineItemsCL = Record.RowCount
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				ItemsCounter = ItemsCounter + 1
				Record.Position = Row
				listChecklists.Add( CreateListItem(ItemsCounter, Record, listChecklists.AsView.Width, height), "") ', height, "" )
			Next
		End If
		Record.Close
		
		'***************************************************************
		' LISTA DE ACÇÕES
		'***************************************************************
		Dim height As Int = 85dip
		Private Record As Cursor
		ItemsCounter = 0
'		'Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} where a.type=2"$
'		Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} and a.type=2"$
'		If (Filter <> "") Then
'			SQL = $"${SQL} and ${Filter}"$
'		End If
'		SQL = $"${SQL} order by a.name"$
'		Record = Starter.LocalSQL.ExecQuery(SQL)
		
		Dim SQL As String = $"${SQLEVC} and a.task_type=='TTT_002'"$
		If (Filter <> "") Then
			SQL = $"${SQL} and ${Filter}"$
		End If
		SQL = $"${SQL} order by a.title"$
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		
		CurrentLineItemAC = 0
		TotalLineItemsAC = Record.RowCount
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				ItemsCounter = ItemsCounter + 1
				Record.Position = Row
				listActions.Add( CreateListItem(ItemsCounter, Record, listActions.AsView.Width, height), "") ', height, "" )
			Next
		End If
		Record.Close
		WindowStatusUpdate
	End If
End Sub

'Sub CreateListItem(cnt As Int, colitems As Map, Width As Int, height As Int, bd As BitmapDrawable) As Panel
Sub CreateListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("tasks_itemviewchecklist_2")
	p.RemoveView
	
	Dim typeresults_desc As String = colitems.GetString("typeresults_desc")
	Dim taskgroup_desc As String = colitems.GetString("taskgroup_desc")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim title As String = colitems.GetString("title")
	Dim status_id As Int = colitems.GetInt("active")
	Dim updated_at As String = colitems.GetString("updated_at")
	Dim dayslastupdate As String = colitems.GetInt("dayslastupdate")
	
	ListItemDesc.text = $"#${cnt} - ${title}"$
	ListItemUpdate.text = $"${updated_at}"$
	ListItemGroup.text = $"${taskgroup_desc}"$
	ListItemType.text = $"${typeresults_desc}"$
	listButActions.Tag = tagcode
	
	Dim sttext As String = "Inactivo"
	If (status_id = 1) Then sttext = "Activo"
	ListItemStatus.Text = sttext

	If (status_id = 0) Then
		ListItemState.TextColor = Consts.ColorGray
		ListItemState.Text = Chr(0xF088)
	Else
		ListItemState.Text = Chr(0xF087)
		If (dayslastupdate >5) Then
			ListItemState.TextColor = Consts.ColorOrange
		Else
			ListItemState.TextColor = Consts.ColorGreen
		End If
	End If
	
	p.Tag = tagcode
	Return p
End Sub

Public Sub UpdateMyPosition(Lat As String, Lon As String)
	If (LabelAppInfo.IsInitialized) Then
		MyPositionLat = Lat
		MyPositionLon = Lon
		LabelAppInfo.Text =  $"Latitude: ${MyPositionLat}, Longitude: ${MyPositionLon}"$
	End If
End Sub

Public Sub ChangeMyPosition

End Sub

Sub listsTabPanel_PageSelected (Position As Int)
	
End Sub

Sub listsButtonClose_Click
	CallSubDelayed2(MainMenu, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listsButtonAdd_Click
	
End Sub

Sub ListItemPanel_Click
	
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
	Dim Curr As TaskFilter = Types.MakeTaskFilter(iDialogReqType, iDialogReqStatus, iDialogReqUpdtated, iDialogReqWithRequests)
	Filter.GetTaskFiltersDialog("TasksCL", Curr)
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
	Dim Filter As String = $"a.tagcode||a.title||a.version||ifnull(b.tagdesc,'')||ifnull(c.title, '')||ifnull(e.tagdesc, '')||ifnull(a.updated_at,'') like '%${search}%'"$
	SearchFilter = Filter
	IsFiltered = (Filter <> "")
	StartTasksActivity(True, Filter)
End Sub

Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub listButActions_Click
	
End Sub

Sub ListItemSelected(pan As Panel, listview As CustomListView)
	For index= 0 To listview.GetSize-1
		Dim p As Panel = listview.GetPanel(index)
		p.Color = Consts.ColorWhite
	Next
	pan.Color = Consts.ColorCianSoftLight
	ShowTaskDetails(pan.Tag)
	WindowStatusUpdate
End Sub

Sub listChecklists_ItemClick (Index As Int, Value As Object)
	CurrentLineItemCL = Index+1
	ListItemSelected( listChecklists.GetPanel(Index), listChecklists )
End Sub

Sub listActions_ItemClick (Index As Int, Value As Object)
	CurrentLineItemAC = Index+1
	Dim Pnl As Panel = listActions.GetPanel(Index)
	ListItemSelected( Pnl, listActions )
	ShowTaskDetails(Pnl.Tag)
End Sub

'ListItemsList
'**************************************************************************************************************
' VERIFICA CHECKLIST/EXECUTA CHECKLIST
'**************************************************************************************************************
Sub ShowTaskDetails(tagcode As String)
	Private Record As Cursor
	Dim SQLEVC As String = $"select a.item_type, a.task_tagcode, a.title from dta_tasks_items as a where a.task_tagcode='${tagcode}' order by position"$	
	Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
	If Record.RowCount > 0 Then
		Dim Filter As AppDialogs
		Filter.Initialize
		Filter.getTaskDetailsDialog(Activity, "TasksCL", "Informação descritiva da Tarefa", Record, tagcode)
	Else
		Msgbox("Erro no acesso da Checklist! Efectue um sincronização e tente novamente.", "Alerta")
		Record.Close
	End If
End Sub

Sub ListsReturn(res As String)
	StartTasksActivity(True, Starter.TaskSearchFilter)
End Sub


Sub ButtonActionPause_Click
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		'Starter.AppState.WriteBool("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
		Dim i As Int = Msgbox2("Deseja parar a pausa e voltar ao estado normal de operação?", "Alerta!", "Sim", "Não", "", Null)
		If (i=DialogResponse.POSITIVE) Then
			ShareCode.SESS_IN_PAUSE = 0
			Starter.AppState.WriteInteger("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
			Starter.AppState.Flush
		End If
	End If
	WindowStatusUpdate
End Sub