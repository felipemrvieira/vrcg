B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Private MyPositionLat, MyPositionLon As String
	Public Device As Phone
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
	Private ListItemFullName As Label
	Private listsButtonFilter As Button
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelAppInfo As Label
	Private LabelCopyright As Label
	Private ListItemStatus As Label
	Private ItemsCounter As Int = 0
	Private butSearch As Button
	Private EditSearch As EditText
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
	Private listTypeRequests As CustomListView
	Private TPRCurrentStatus As String = "0,1"
	Private CLCurrentStatus As String = "0,1"
	Private tasksLabelStatus As Label
	Private tasksLabelTitulo As Label
	Private tasksLabelUltimoUpd As Label
	Private tasksLabelGrupo As Label
	Private tasksLabelTResultado As Label
	Private taskslabelTypeObjectFilter As Label
	Private taskLVLabelStatus As Label
	Private taskLVLabelStatusTitulo As Label
	Private taskLVLabelUltimoUdp As Label
	Private taskLVLabelGrupo As Label
	Private taskLVLabelTResultado As Label
	Private tasksLVlabelTypeObjectFilter As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	
	Starter.CurrentWorkActivity = Me
	Activity.LoadLayout("tasksLayout")  
	listsTabPanel.LoadLayout("tasks_typerequests", ShareCode.TABGeneral_TypeRequestsTitle)
	listsTabPanel.LoadLayout("tasks_listview", ShareCode.TAB_Tasks_Procedures)
'	listsTabPanel.LoadLayout("tasks_listviewactions", ShareCode.TABGeneral_ActionsTitle)

	'tasks_typerequests
	tasksLabelStatus.text = ShareCode.objectObjLabelStatus
	tasksLabelTitulo.text = ShareCode.tarefasLabelTitulos
	tasksLabelUltimoUpd.text = ShareCode.tarefasLabelUltimoUpd
	tasksLabelGrupo.text = ShareCode.checklistLabelGrupo
	tasksLabelTResultado.text = ShareCode.tarefasLabelTResultado
	taskslabelTypeObjectFilter.text = ShareCode.alertslabelTypeObjectFilter
	
	'tasks_listview
	taskLVLabelStatus.Text = ShareCode.objectObjLabelStatus
	taskLVLabelStatusTitulo.Text = ShareCode.tarefasLabelTitulos
	taskLVLabelUltimoUdp.Text = ShareCode.tarefasLabelUltimoUpd
	taskLVLabelGrupo.Text = ShareCode.checklistLabelGrupo
	taskLVLabelTResultado.Text = ShareCode.tarefasLabelTResultado
	tasksLVlabelTypeObjectFilter.Text = ShareCode.alertslabelTypeObjectFilter
	
	
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 50%x  '33.33%x
	Next
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
	If FirstTime Then
		' **************
	End If
	
	ProgressDialogShow2(ShareCode.GeneralLoadingMessage, True)
	Sleep(100)
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
	If Not(ShareCode.ISPHONE) Then
		mainLogo.Gravity = Gravity.FILL
		mainLogo.Width = Consts.LogoWidth
		Log($"Inicialização de BMP: ${ShareCode.APP_MAIN_LOGO_MINI}"$)
		If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then
			mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO_MINI))
		End If
		
	End If
	Dim gc As GradientDrawable
	gc.Initialize("TOP_BOTTOM", Array As Int(Consts.ColorMain, Consts.ColorSub))
	ColorTabPanel.Background = gc
	Dim jo As JavaObject = listsTabPanel
	jo = jo.GetField("tabStrip")
	'now you can set the properties
	jo.RunMethod("setIndicatorColor", Array(Consts.ColorMain))
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
	mainLabelOptLists.Text = ShareCode.MainOption_Tasks.ToUpperCase
	
	
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
	
	ShareCode.TaskTPRActive = True
	ShareCode.TaskTPRInactive = True
	ShareCode.TaskTPRSingular = True
	ShareCode.TaskTPRPlural = True

	StartTasksActivity(True, "", CurrentTab)
End Sub

Sub SetTheFilters(flt As TaskFilter)
	IsFiltered  = True
	Dim Filter As String = ""
	
	Dim ItemActive As String = ""
	If (ShareCode.TaskTPRInactive) Then
		ItemActive = "0"
	End If
	
	If (ShareCode.TaskTPRActive) Then
		If Utils.NNE(ItemActive) Then ItemActive = $"${ItemActive},"$
		ItemActive = $"${ItemActive}1"$
	End If
	
	If Utils.NNE(ItemActive) Then
		ItemActive = $" and (a.active in (${ItemActive}))"$
	End If

	
	Dim ItemGroup As String = ""
	If CurrentTab = 0 Then
		If (ShareCode.TaskTPRSingular) Then
			ItemGroup = "0"
		End If
		If (ShareCode.TaskTPRPlural) Then
			If Utils.NNE(ItemGroup) Then ItemGroup = $"${ItemGroup},"$
			ItemGroup = $"${ItemGroup}1"$
		End If
		If Utils.NNE(ItemGroup) Then
			ItemGroup = $" and (a.tr_is_model in (${ItemGroup}))"$
		End If
	End If

	Filter = $"${ItemActive}${ItemGroup}"$
	
	
'	'TaskFilter(TypeTask As Int, Status As Int, Updated As Int, WithRequests As Int)
'	iDialogReqType = flt.TypeTask
'	iDialogReqStatus = flt.Status
'	iDialogReqUpdtated = flt.Updated
'	iDialogReqWithRequests = flt.WithRequests
'	
'	If (iDialogReqStatus > 0) Then
'		If (Filter <> "") Then Filter = $"${Filter} and "$
'		If (iDialogReqStatus = 1) Then
'			Filter = $"${Filter}(a.active=1)"$
'		Else
'			Filter = $"${Filter}(a.active=0)"$
'		End If
'	End If
'	
'	If (iDialogReqUpdtated > 0) Then
'		If (Filter <> "") Then Filter = $"${Filter} and "$
'		'Filter = $"${Filter}(a.type=${iDialogReqType})"$
'		'ShareCode.CURRENT_APPDATE
'		If (iDialogReqUpdtated = 1) Then
'			Filter = $"${Filter}(${DBStructures.WHERE_DAYSBETWEEN_CONDITION} <= 5)"$
'		Else
'			Filter = $"${Filter}(${DBStructures.WHERE_DAYSBETWEEN_CONDITION} > 5)"$
'		End If
'	End If
	
	StartTasksActivity(True, Filter, CurrentTab)
End Sub

Sub EditReturn(arg As String)
	'
End Sub

Sub StartTasksActivityFirst(Clear As Boolean, Filter As String)
	
	If Filter = "CalledFromMenu" Then
		Filter = ""
		EditSearch.Text = ""
	End If
	
	StartTasksActivity(True, Filter, 0)
	
End Sub



Sub StartTasksActivity(Clear As Boolean, Filter As String, tabposis As Int)
	'TaskFilters(TypeTask As Int, Status As Int, Updated As Int, WithRequests As Int)

	Starter.TaskSearchFilter = Filter
	
	If Utils.NE(Filter) Then
		Filter = $" and (a.active in (1))"$
		ShareCode.TaskTPRInactive = False
	End If
	
	If (Starter.EntityKeepFilter = True) Then
		Starter.EntityKeepFilter = False
		If (Starter.TaskSearchFilter <> "") Then
			Dim sFilter As String = Starter.TaskSearchFilter
			Starter.TaskSearchFilter = ""
			Starter.TaskFilters = Types.MakeTaskFilter(0, 0, 0, 0, 0)
			StartTasksActivity(True, sFilter, tabposis)
		Else
			Dim tFilter As TaskFilter = Starter.TaskFilters
			Starter.TaskFilters = Types.MakeTaskFilter(0, 0, 0, 0, 0)
			Starter.TaskSearchFilter = ""
			SetTheFilters(tFilter)
		End If
	Else

		If Clear Then
			If (CurrentTab = 0) Then
				listTypeRequests.Clear
			Else
				listChecklists.Clear
			End If
		End If
		
		'***************************************************************
		' LISTA DE TIPOS DE INTERVENÇÃO
		'***************************************************************
		
		Dim height As Int = 85dip
		
		If(ShareCode.ISPHONE) Then
			height = 145dip
		End If
		
		Private Record As Cursor
		ItemsCounter = 0
		' and (a.active in (1))
		If ShareCode.TaskTPRInactive = False And Not(Filter.Contains("and (a.active in (1))")) Then
			Filter = " and (a.active in (1)) " & Filter
		End If
		
		'***************************************************************
		' NOTE: VALIDA SE AS INTERVENÇÕES ESTÃO RESTRINGIDAS AOS
		'		DEPARTAMENTOS ATRAVÉS DO UTILIZADOR
		'***************************************************************
		Dim default_department As String = DBStructures.GetScriptColumnStrEVC($"Select default_department as value 
								from dta_technicals_adds 
								where technical_tagcode='${ShareCode.SESS_OPER_User.Trim}'"$, "value")
		If Utils.NNE(default_department) Then
			Filter = $" and (e.departments like '%${default_department.Trim}%') ${Filter}"$
		End If
		
		Dim SQLEVC As String = $"SELECT a.tagcode, a.group_type, ifnull(b.tagdesc, '(Sem grupo)') AS taskgroup_desc, '' as typeresults_desc, 
								a.title, a.details, 0 as dayslastupdate, a.group_tags, a.details,a.paramters,c.only_related_type_technicals,
								a.updated_at, a.active, a.published, a.tr_is_model, a.tr_model_modes,a.tagcode FROM dta_typerequests AS a
								LEFT JOIN type_tpgroupstypes AS b ON (b.tagcode=a.group_type) 
								LEFT JOIN dta_typerequests_adds as c ON (c.typerequest_tagcode=a.tagcode)
								left join dta_typerequests_auths as d on (d.typerequest_tagcode=c.typerequest_tagcode)
								left join dta_auths as e on (e.tagcode=d.auths_tagcode)
								WHERE  1=1 
									and a.published=1 
									and a.is_internal=0 
									and published=1 
									${Filter} 
									order by a.title"$
		
		
'		' and a.tagcode||a.title||ifnull(b.tagdesc,'')||ifnull(a.updated_at,'')||ifnull(a.details, '')||ifnull(a.group_tags, '') like '%utenre%'
'		Dim SQLEVC As String = $"SELECT a.tagcode, a.group_type, ifnull(b.tagdesc, '(Sem grupo)') AS taskgroup_desc, '' as typeresults_desc, 
'								a.title, a.details, 0 as dayslastupdate, a.group_tags, a.details,a.paramters,c.only_related_type_technicals,
'								a.updated_at, a.active, a.published, a.tr_is_model, a.tr_model_modes,a.tagcode FROM dta_typerequests AS a
'								LEFT JOIN type_tpgroupstypes AS b ON (b.tagcode=a.group_type) 
'								LEFT JOIN dta_typerequests_adds as c ON (c.typerequest_tagcode=a.tagcode)
'								WHERE  1=1 and a.published=1 and a.is_internal=0 and published = 1 ${Filter} order by a.title"$
		'*****************************************************
		' ALTERACAO PC
		' Certificar o campo authorized_technicals em paramter da tabela dta_typrequests
		'*****************************************************
		Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
		
		
		CurrentLineItemCL = 0
		Log(SQLEVC)
		TotalLineItemsCL = Record.RowCount
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				ItemsCounter = ItemsCounter + 1
				Record.Position = Row
				Dim paramters As String = Record.GetString("paramters")
				Dim only_related_type_technicals As Int = Record.GetInt("only_related_type_technicals") 'A considerar a posteriori
				
				Dim JSON As JSONParser
				Dim MapJson As Map
				JSON.Initialize(paramters)
				MapJson = JSON.NextObject
				Dim execute_location As String = MapJson.Get("execute_location")
				Dim authorized_technicals As String = MapJson.Get("authorized_technicals")
				JSON.Initialize(execute_location)
				MapJson = JSON.NextObject
				Dim can_fo As String = MapJson.Get("can_fo")
				If (can_fo = "1") Then
					
					Dim executa As Boolean = True
					If Utils.NNE(authorized_technicals) Then
'						Dim lstTecs As List = Regex.Split(("\"&splt), pairs(i))
						executa=authorized_technicals.Contains(ShareCode.SESS_User)
					End If
					
					If (executa) Then
						listTypeRequests.Add( CreateListItem(ItemsCounter, Record, listTypeRequests.AsView.Width, height, True), "") ', height, "" )
					End If
					
				End If

				
			Next
		End If
		Record.Close
		
'		'***************************************************************
'		' LISTA DE CHECKLISTS
'		'***************************************************************
'		
'		Dim height As Int = 85dip
'		
'		If(ShareCode.ISPHONE) Then
'			height = 145dip
'		End If
'		
'		
'		
'		Private Record As Cursor
'		ItemsCounter = 0
''		'Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} where a.type=1"$
''		Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} and a.type=1"$
''		
''		If (Filter <> "") Then
''			SQL = $"${SQL} and ${Filter}"$
''		End If
''		SQL = $"${SQL} order by a.name"$
''		Record = Starter.LocalSQL.ExecQuery(SQL)
'		
'		Dim SQLEVC As String = $"select a.id, a.tagcode, a.title, a.task_type, a.task_group, a.type_results,
'								ifnull(b.tagdesc,'') as tasktype_desc, ifnull(c.title, '') as taskgroup_desc,
'								ifnull(e.tagdesc, '') as typeresults_desc, a.group_tags, a.details,
'								a.active, ifnull(a.updated_at, '1970-01-01') as updated_at, 
'								round(ifnull((julianday('now') - julianday(ifnull(a.updated_at, '1970-01-01'))), 0)) as dayslastupdate
'								from dta_tasks as a
'								inner join type_taskstypes as b on (b.tagcode=a.task_type) 
'								left join dta_tasks_groups as c on (c.tagcode=a.task_group) 
'								left join type_resulttypes as e on (e.tagcode=a.type_results)
'								where 1=1 and a.published=1 "$
'								
'		Dim SQL As String = $"${SQLEVC} and a.task_type=='TTT_001'"$
'		If (Filter <> "") Then
'			SQL = $"${SQL} and ${Filter}"$
'		End If
'		SQL = $"${SQL} order by a.title"$
'		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
'		
'		CurrentLineItemAC = 0
'		TotalLineItemsAC = Record.RowCount
'		If Record.RowCount > 0 Then
'			For Row = 0 To Record.RowCount-1
'				ItemsCounter = ItemsCounter + 1
'				Record.Position = Row
'				listChecklists.Add( CreateListItem(ItemsCounter, Record, listChecklists.AsView.Width, height, False), "") ', height, "" )
'			Next
'		End If
'		Record.Close
		
'		'***************************************************************
'		' LISTA DE ACÇÕES
'		'***************************************************************
'		Dim height As Int = 85dip
'		Private Record As Cursor
'		ItemsCounter = 0
''		'Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} where a.type=2"$
''		Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} and a.type=2"$
''		If (Filter <> "") Then
''			SQL = $"${SQL} and ${Filter}"$
''		End If
''		SQL = $"${SQL} order by a.name"$
''		Record = Starter.LocalSQL.ExecQuery(SQL)
'		
'		Dim SQL As String = $"${SQLEVC} and a.task_type=='TTT_002'"$
'		If (Filter <> "") Then
'			SQL = $"${SQL} and ${Filter}"$
'		End If
'		SQL = $"${SQL} order by a.title"$
'		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
'		
'		CurrentLineItemAC = 0
'		TotalLineItemsAC = Record.RowCount
'		If Record.RowCount > 0 Then
'			For Row = 0 To Record.RowCount-1
'				ItemsCounter = ItemsCounter + 1
'				Record.Position = Row
'				listActions.Add( CreateListItem(ItemsCounter, Record, listActions.AsView.Width, height), "") ', height, "" )
'			Next
'		End If
'		Record.Close

		WindowStatusUpdate
	End If
	ProgressDialogHide
End Sub

'Sub CreateListItem(cnt As Int, colitems As Map, Width As Int, height As Int, bd As BitmapDrawable) As Panel
Sub CreateListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int, isTRequest As Boolean) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	If (isTRequest) Then
		If(ShareCode.ISPHONE) Then
			p.LoadLayout("task_itemviewtyperequest")
		Else
			p.LoadLayout("task_itemviewtyperequest")
		End If
	Else
		If(ShareCode.ISPHONE) Then
			p.LoadLayout("tasks_itemviewchecklist_2_phone")
		Else
			p.LoadLayout("tasks_itemviewchecklist_2")
		End If
	End If
	p.RemoveView
	
	
	
	Dim typeresults_desc As String = colitems.GetString("typeresults_desc")
	Dim taskgroup_desc As String = colitems.GetString("taskgroup_desc")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim title As String = colitems.GetString("title")
	Dim status_id As Int = colitems.GetInt("active")
	Dim updated_at As String = colitems.GetString("updated_at")
	Dim dayslastupdate As String = colitems.GetInt("dayslastupdate")
	Dim details As String = colitems.GetString("details")
	
	ListItemDesc.text = $"#${cnt} - ${title}"$
	ListItemUpdate.text = $"${updated_at}"$
	ListItemGroup.text = $"${taskgroup_desc}"$
	ListItemType.text = $"${typeresults_desc}"$
	listButActions.Tag = tagcode
	
	Dim sttext As String = "Inactivo"
	If (status_id = 1) Then sttext = "Activo"
	ListItemStatus.Text = sttext
	
	If (isTRequest) And Utils.NNE(details) Then
		sttext = $"${details} (${sttext})"$
	End If

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
	Log("Back TASKS")
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
	Dim Curr As TaskFilter = Types.MakeTaskFilter(iDialogReqType, iDialogReqStatus, iDialogReqUpdtated, iDialogReqWithRequests, 0)
	Dim sft As StatusFilterTask = Types.MakeStatusFilterTask(ShareCode.TaskTPRActive, ShareCode.TaskTPRInactive, ShareCode.TaskTPRSingular, ShareCode.TaskTPRPlural)
	Filter.GetTaskFiltersDialog("TasksCL2", Curr, CurrentTab, sft)
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
	If (CurrentTab=0) Then
		Dim Filter As String = $" and a.tagcode||a.title||ifnull(b.tagdesc,'')||ifnull(a.updated_at,'')||ifnull(a.details, '')||ifnull(a.group_tags, '') like '%${search}%'"$
	Else
		Dim Filter As String = $" and a.tagcode||a.title||a.version||ifnull(b.tagdesc,'')||ifnull(c.title, '')||ifnull(e.tagdesc, '')||ifnull(a.updated_at,'')||ifnull(a.details, '')||ifnull(a.group_tags, '') like '%${search}%'"$
	End If
	SearchFilter = Filter
	IsFiltered = (Filter <> "")
	StartTasksActivity(True, Filter, CurrentTab)
End Sub

Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub listButActions_Click
	
End Sub



Sub listTypeRequests_ItemClick (Index As Int, Value As Object)
	CurrentLineItemCL = Index+1
	ListItemSelectedRequest( listTypeRequests.GetPanel(Index), listTypeRequests )
End Sub

Sub ListItemSelectedRequest(pan As Panel, listview As CustomListView)
	For index= 0 To listview.GetSize-1
		Dim p As Panel = listview.GetPanel(index)
		p.Color = Consts.ColorWhite
	Next
	pan.Color = Consts.ColorCianSoftLight
	ShowRequestDetails(pan.Tag)
	WindowStatusUpdate
End Sub

'ListItemsList
'**************************************************************************************************************
' VERIFICA TIPO DE INTERVENÇÃO
'**************************************************************************************************************
Sub ShowRequestDetails(tagcode As String)
	Private Record As Cursor
	Dim SQLEVC As String = $"select a.item_type, a.task_tagcode, a.title 
					from dta_tasks_items as a 
					inner join dta_typerequests_tasks as b on (b.task_tagcode=a.task_tagcode)
					where b.typerequest_tagcode='${tagcode}' order by b.position, a.position"$  '  a.task_tagcode='${tagcode}' order by position"$
	Log(SQLEVC)
	Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
	If Record.RowCount > 0 Then
		Dim Filter As AppDialogs
		Filter.Initialize
		Filter.getRequestTaskDetailsDialog(Activity, "TasksCL2", ShareCode.tarefasavisoInfoDescritiva, Record, tagcode)
	Else
		MsgboxAsync(ShareCode.checklistErroacesso, ShareCode.GeneralAlertTitle)
		Record.Close
	End If
End Sub

' ********************************************************************
' TIP: CRIAÇÃO DE PEDIDO DE INTERVENÇÃO (ITEM SELECIONADO DA LISTA)
' ********************************************************************
Sub ReturnShowRequestTaskDetails(newRequestType As String, TVals As List)
	
	'TIP : ENTRADA DA CHECKLIST A PARTIR DAS TAREFAS
	
	'************************************************************************************
	' NECESSÁRIO CRIAR LOOP NA LISTA PARA SELECÇÃO DO TIPO DE INTERVENÇÃO A UTILIZAR
	'************************************************************************************
'	Dim newRequestType As String = items.Get(0)
'	Dim tagcode As String = TVals.value1
	ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize

		If Utils.NNE(newRequestType) Then
	
			Dim newRequest As String = Utils.MakeRequestTagcode
			Dim newDate As String = Utils.GetCurrentDate
			Dim newTime As String = Utils.GetCurrentTimeExt
			Dim TaskName As String = TVals.Get(0)
			
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
			newExecution.Put("entity_tagcode", "__NONE__")
			newExecution.Put("object_tagcode", "__NONE__")
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
'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
			Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 1, "dta_requests", ListOfMaps,newRequest,"")
			
			Dim FirstCheckList As String = ""
			Dim FirstCheckListTemp As String = ""
			
			Dim newRequestItem2 As Map
			newRequestItem2.Initialize
			For n=0 To TVals.Size-1
				Dim tagcode As String = TVals.Get(n)
				If (n = 0) Then
					FirstCheckListTemp = tagcode.trim
				End If
				
				Dim cl_is_father As Int = DBStructures.GetScriptColumnIntEVC($"select cl_is_father from dta_typerequests_tasks_adds
											where typerequest_tagcode='${newRequestType.Trim}'
											And task_tagcode='${tagcode.Trim}'"$, "cl_is_father")
				If (cl_is_father = 1) Then
					FirstCheckList = tagcode.trim
				End If
				
				Dim repeatcounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${tagcode.trim}'"$)
				
				'**********************************************************
				' TIP : CRIA O DTA_REQUESTS_RELATIONS
				'**********************************************************
				
				Dim typerequest_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode from dta_requests where 1=1
																						and tagcode = '${newRequest.trim}'"$,"typerequest_tagcode")

				Try
					If Utils.NNE(typerequest_tagcode) Then
						Dim CL_Position As Int = DBStructures.GetScriptColumnIntEVC($"select position from dta_typerequests_tasks where 1=1
																				and typerequest_tagcode = '${typerequest_tagcode}'
																				and task_tagcode = '${tagcode.trim}'"$,"position")
					Else
						Dim CL_Position As Int = 0
					End If
					
				Catch
					Dim CL_Position As Int = 0
					Log(LastException)
				End Try
																			
				
				Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1 + 1000000
				Dim newExecution As Map
				newExecution.Initialize
				newExecution.Put("id", maxID)
				newExecution.Put("request_tagcode", newRequest)
				newExecution.Put("relation_tagcode", tagcode.trim)
				newExecution.Put("inner_title", "")
				newExecution.Put("position", CL_Position) ' ESTAVA E ENVIAR SEMPRE 0
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
			Next
			newRequestItem.Put("relation", newRequestItem2)
			
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
		
		
'			TIP : CRIA O REQUESTS_VALUES A PARTIR DO TASKS_ITEMS
		
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

			Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, newRequest)
			Dim stage As Int = 0
			
			Dim resfields As ResumableSub = createRequestFields(newRequest, newRequestType)
			Wait For(resfields) Complete (resfieldsOk As Boolean)
		
			Dim resa1 As ResumableSub = createRequestEntityRelation(newRequest, "")
			Wait For(resa1) Complete (resfieldsOk1 As Boolean)
		
			Dim resa2 As ResumableSub = createRequestObjectRelation(newRequest, "")
			Wait For(resa2) Complete (resfieldsOk2 As Boolean)
			
			' ENVIA OS MAPAS PARA O SERVIDOR
			Dim res As ResumableSub = UploadNewRequest2Server2(newRequest, newRequestItem, "1", stage)
			Wait For(res) Complete (NewRequestCode As CreateRequestReturn)
			
'			If (NewRequestCode.Stage<9) Then
'				Dim res1 As ResumableSub = UploadNewRequest2Server2(newRequest, newRequestItem, "1", NewRequestCode.Stage)
'				Wait For(res1) Complete (NewRequestCode As CreateRequestReturn)
'			End If
			'MakeCreateRequestReturn(RequestTagcode As String, Status As Int, Stage As Int) As
			
			If(Utils.NNE(newRequest)) Then
				If (Not(newRequest = NewRequestCode.RequestTagcode) And Utils.NNE(NewRequestCode.RequestTagcode)) Then
					Dim sSQL As String = $"update dta_requests set tagcode='${NewRequestCode.RequestTagcode}' where tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					Dim sSQL As String = $"update dta_requests_adds set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_entities set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_objects set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_contacts set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_fields set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_relations set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					Dim sSQL As String = $"update dta_requests_relations_adds set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_values set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					Dim sSQL As String = $"update dta_requests_values_adds set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					newRequest = NewRequestCode.RequestTagcode
				End If
			End If
			
			Sleep(2000)
				
			'**********************************************************
			' CHECKLIST DE CARREGAMENTO DE ARTIGOS
			'**********************************************************
			Dim QuestParams As Map = DBStructures.GetScriptColumnStrEVCJSONMAP( _
												$"select distinct paramters 
												from dta_tasks_adds where 1=1
												and tagcode='${tagcode.trim}'"$, "paramters")
			Try
				Dim data_bulk_upload As Int = QuestParams.Get("data_bulk_upload")
			Catch
				Dim data_bulk_upload As Int = 0
				Log(LastException)
			End Try
							
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
				Dim iField As Int = DBStructures.GetScriptColumnIntEVC($"select reference from type_inouttypes where tagcode='${origin_master}'"$, "reference")
				Dim gField As String = ""
				Dim WareHouseCode As String = ""
				Dim Obj_Tc As String = ""
				
				If Utils.Int2Bool(is_object_relation) Then
					Obj_Tc = DBStructures.GetScriptColumnSTrEVC($"select object_tagcode from dta_requests where tagcode = '${newRequest}'"$,"object_tagcode")
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
				If (gField = "dta_warehouses") Then
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
							And e.request_tagcode='${newRequest}'
							And e.task_tagcode in ('${tagcode}')
							And f.`level`>0
							order by x.group_title, x.title"$
							
					Dim rRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(sNewSQL)
					
					
																			
					If rRecord.RowCount > 0 Then
						Dim FirstItem As String = ""
						Dim FirstUK As String = ""
						Dim Chapter As String = ""
						Dim cntFieldVal04 As Int = -1
						Dim cntRepeatFieldCounter As Int = 0
						Dim Posicao As Int = 1
						Log(rRecord.RowCount)
						For Row = 0 To rRecord.RowCount-1
							rRecord.Position = Row
							Dim Group As String = rRecord.GetString("group_title")
							Dim Qtd As Int = rRecord.GetInt("qtdw")
							Dim RRepeatcounter As Int = rRecord.GetInt("repeatcounter")
							Dim RObject As String = rRecord.GetString("article_tagcode")
							Dim RTitle As String = rRecord.GetString("article_title")
							Dim RItem As String = rRecord.GetString("item_tagcode")
							Dim RUniqueKey As String = rRecord.GetString("unique_key")
							
							

							
							If Not(Chapter=Group) Then ' Capitulo e diferente grupo
								If (Row = 0) Then
									
									FirstItem = DBStructures.GetScriptColumnStrEVC($"select item_tagcode from dta_requests_values where 1=1
																			And request_tagcode = '${newRequest}'
																			And task_tagcode = '${tagcode}'
																			and position = 1
																			And repeatcounter=0
																			And repeatitemcounter=0
																			And repeatfieldcounter=0"$,"item_tagcode")
								
									FirstUK = DBStructures.GetScriptColumnStrEVC($"select unique_key from dta_requests_values where 1=1
																			And request_tagcode = '${newRequest}'
																			And task_tagcode = '${tagcode}'
																			and position = 1
																			And repeatcounter=0
																			And repeatitemcounter=0
																			And repeatfieldcounter=0"$,"unique_key")
									
									Dim Exec_Status As Int = 0
									Dim OperInsert As Boolean = False
									Dim ss1 As String = $"update dta_requests_values set
															execute_status=${Exec_Status},
															execute_value='',
															title='${Group}',
															object_tagcode='',
															position=1,
															repeatfieldcounter=0
															where 1=1
															And request_tagcode='${newRequest}'
															And task_tagcode in ('${tagcode}')
															And item_tagcode='${FirstItem}'
															And unique_key='${FirstUK}'
															And repeatcounter=0
															And repeatfieldcounter=0"$
									Try
										Starter.LocalSQLEVC.ExecNonQuery(ss1)
									Catch
										Log($"Erro de campo: ${LastException}"$)
									End Try
									
									Dim Rs1 As ResumableSub = UpdateServerUPDorINS("dta_requests_values", "update",newRequest.Trim,tagcode.trim,FirstItem.trim,0,0,0)
									wait for (Rs1) Complete (Finished As Boolean)
									Sleep(250)
								Else
									Dim Exec_Status As Int = 0
									Dim OperInsert As Boolean = True
									Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
									Dim ss1 As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
															tagcode,position,execute_value,
															execute_format_title, 
															execute_status,
															title,object_tagcode,repeatfieldcounter)
															select ${maxID} as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, 
															a.item_tagcode, a.unique_key, a.tagcode, 
															1, '' as execute_value, 
															a.execute_format_title,
															${Exec_Status} as execute_status,'${Group}' as title,'' as object_tagcode,
															${Row} as repeatfieldcounter
															from dta_requests_values As a
															where 1=1
															and request_tagcode='${newRequest}'
															and task_tagcode in ('${tagcode}')
															And item_tagcode='${RItem}'
															And unique_key='${RUniqueKey}'
															And repeatcounter = 0
															And repeatfieldcounter=0 "$
									Try
										Starter.LocalSQLEVC.ExecNonQuery(ss1)
									Catch
										Log($"Erro de campo: ${LastException}"$)
									End Try
									
'									Dim Rs2 As ResumableSub = UpdateServerUPDorINS("dta_requests_values", "insert",newRequest,tagcode,RItem,RRepeatcounter,Row,0)
'									wait for (Rs2) complete (Finished As Boolean)
'									Sleep(250)
									
								End If
							
								cntFieldVal04 = cntFieldVal04 + 1
															
								Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values_adds", "id", "") + 1 + 1000000
								Dim sSql1 As String = $"insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
									tagcode,fieldval_04,repeatfieldcounter) values (${maxID}, '${newRequest}','${tagcode}', '${tagcode}', 
								'${RItem}', '${RUniqueKey}', '',${cntFieldVal04}, ${cntRepeatFieldCounter})"$

								Utils.SaveSQLToLog("getTaskDetailsDialog",sSql1, newRequest)
							
								Chapter=Group
								Posicao = Posicao + 1

							End If
						
							If (Row = 0) Then
								Dim Exec_Status As Int = 0
								Dim OperInsert As Boolean = False
								Dim ss1 As String = $"update dta_requests_values set
														execute_status=${Exec_Status},
														execute_value='${Qtd}',
														title='${RTitle}',
														object_tagcode='${RObject}',
														position = 2,
														repeatfieldcounter=0 
														where 1=1
														And request_tagcode='${newRequest}'
														And task_tagcode in ('${tagcode}')
														And item_tagcode='${RItem}'
														And unique_key='${RUniqueKey}'
														And repeatcounter=${RRepeatcounter}
														and repeatfieldcounter=0 "$
														
								Try
									Starter.LocalSQLEVC.ExecNonQuery(ss1)
								Catch
									Log($"Erro de campo: ${LastException}"$)
								End Try
									
								Dim Rs1 As ResumableSub = UpdateServerUPDorINS("dta_requests_values", "update",newRequest.Trim,tagcode.trim,RItem.trim,0,0,0)
								wait for (Rs1) Complete (Finished As Boolean)
								Sleep(250)
							Else
								Dim Exec_Status As Int = 0
								Dim OperInsert As Boolean = True
								Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
								Dim ss1 As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
														tagcode,position,execute_value,execute_format_title,
														execute_status,title,object_tagcode,repeatfieldcounter)
														select ${maxID} as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, 
														a.item_tagcode, a.unique_key, a.tagcode, 
														2, '${Qtd}' as execute_value, a.execute_format_title,
														${Exec_Status} As execute_status,'${RTitle}' as title,'${RObject}' as object_tagcode,
														${Row} as repeatfieldcounter
														from dta_requests_values As a
														where 1=1
														and request_tagcode='${newRequest}'
														and task_tagcode in ('${tagcode}')
														And item_tagcode='${RItem}'
														And unique_key='${RUniqueKey}'
														And repeatcounter=${RRepeatcounter}
														and repeatfieldcounter=0 "$
				
								Try
									Starter.LocalSQLEVC.ExecNonQuery(ss1)
								Catch
									Log($"Erro de campo: ${LastException}"$)
								End Try
									
'								Dim Rs2 As ResumableSub = UpdateServerUPDorINS("dta_requests_values", "insert",newRequest,tagcode,RItem,RRepeatcounter,Row,0)
'								wait for (Rs2) complete (Finished As Boolean)
'								Sleep(250)
							End If
							
									
							Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values_adds", "id", "") + 1 + 1000000
							
							Dim sSql1 As String = $"insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
									tagcode,fieldval_04,repeatfieldcounter) values (${maxID}, '${newRequest}','${tagcode}', '${tagcode}', 
							'${RItem}', '${RUniqueKey}', '',${cntFieldVal04}, ${cntRepeatFieldCounter})"$
							Utils.SaveSQLToLog("getTaskDetailsDialog",sSql1, newRequest)
							cntRepeatFieldCounter = cntRepeatFieldCounter + 1
							Posicao = Posicao + 1
						Next
					End If
					rRecord.Close
				End If
				
				'**********************************************************************************************************************
				' CHAMADA AO NOVO ENDPOINT E ENVIO DE TODOS OS DADOS DE UMA VEZ EM VEZ DE CHAMAR O ENDPOINT UM A UM
				'**********************************************************************************************************************
				
				Dim ListItems As List
				ListItems.Initialize
				Dim DataFields As List
				DataFields.Initialize
				Dim MapItems As Map
				MapItems.Initialize
				
				Dim FinalSql As String =  $"select * from dta_requests_values where 1=1
											and request_tagcode='${newRequest}'
											And task_tagcode in ('${tagcode}')
											and repeatfieldcounter > 0"$
			
				Dim RsArtigos As ResultSet = Starter.LocalSQLEVC.ExecQuery(FinalSql)
				
				
				MapItems.Put("table","dta_requests_values")
				MapItems.Put("type","insert")
				
				If RsArtigos.RowCount > 0 Then
					Do While RsArtigos.NextRow ' ITERA SOBRE TODOS OS ARTIGOS
						Dim MapFields As Map
						MapFields.Initialize

						For NFields = 0 To RsArtigos.ColumnCount -1
							Dim ColName As String = RsArtigos.GetColumnName(NFields)
							Dim ColValue As String = Utils.IfNullOrEmpty(RsArtigos.GetString(ColName),"")
							If ColName.ToLowerCase.trim <> "id" And	ColName.ToLowerCase.trim <> "created_at" And ColName.ToLowerCase.trim <> "updated_at" Then
								MapFields.Put(ColName, ColValue)
							End If
						Next
						
						DataFields.Add(MapFields)
						Log(MapFields)
					Loop
					
					MapItems.Put("fields",DataFields)
					Log(DataFields)
					ListItems.Add(MapItems)
					
					Dim ACLAJson As Map
					ACLAJson.Initialize	
					ACLAJson.put("items", ListItems)
	
					Dim NewParams As Map
					NewParams.Initialize
					NewParams.Clear
					NewParams.Put("_token", ShareCode.APP_TOKEN)
					NewParams.Put("debug", 1)
					NewParams.Put("ACLAJson", ACLAJson)
					Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/insert-update"$

					If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
						If Not(ShareCode.APP_WORKING_LOCAL) Then

							Try
								Dim data As String
								Dim JSON As JSONGenerator
								JSON.Initialize(NewParams)
        
								data = JSON.ToPrettyString(1)
								Dim JobD2S As HttpJob
								JobD2S.Initialize("",Me)
								Dim addr As String = Url
'								Log(data)
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
							Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1, newRequest.trim, tagcode.Trim, "")
							Utils.save2update(Url, Utils.MapToJson(NewParams), 0, WorkerND)
						End If
						Sleep(250)
'			
					Else
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1, newRequest.trim, tagcode.Trim, "")
						Utils.save2update(Url, Utils.MapToJson(NewParams), 0, WorkerND)
					End If
					
					
				End If
				
				
			End If

			'**********************************************************
			' TIP : CHECKLIST DE CARREGAMENTO DE ARTIGOS
			'**********************************************************
		
			'**********************************************************
			' FIM DA ENCOMENDA
			'**********************************************************

			' VENDA / CARREGAMENTOS
			'TSKS_20200514_113847
			' intervenção: TSKS_20200514_113923
			'((newRequestType = "TSKS_20200514_113923") And (FirstCheckListTemp = "TSKS_20200514_113847")) Then
			'**********************************************************
			If ((newRequestType = "TSKS_20200513_193055") And (FirstCheckListTemp = "TSKS_20200513_191407")) Or _
				((newRequestType = "TSKS_20200514_113923") And (FirstCheckListTemp = "TSKS_20200513_191407")) Then
				Dim sNewSQL As String = $"select x.title as article_title, x.tagcode as article_tagcode, x.*, e.* from (
							select  ifnull(b.title,'') as group_title, ifnull(c.tagdesc,'') as type_title, a.*, d.qtd as qtdw 
							from dta_articles as a
							left join dta_articles_groups as b on (b.tagcode=a.article_group)
							left join type_articlestypes as c on (c.tagcode=a.article_type)
							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and
								d.warehouse_tagcode in (select tagcode from dta_warehouses 
										where object_tagcode in (select tagcode from dta_objects 
											where tagcode in (select vehicle_tagcode from dta_technicals where tagcode='${ShareCode.SESS_User}'))))
							) as x
							, dta_requests_values as e
							inner join dta_tasks_items as f on (f.task_tagcode=e.task_tagcode
								and f.item_tagcode=e.item_tagcode
								and f.unique_key=e.unique_key)
							where 1=1
							and e.request_tagcode='${newRequest}'
							and e.task_tagcode in ('TSKS_20200513_191407')
							and f.`level`>0
							order by x.group_title, x.title"$
							
				Dim rRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(sNewSQL)
				If rRecord.RowCount > 0 Then
					
					Dim Chapter As String = ""
					Dim cntFieldVal04 As Int = -1
					Dim cntRepeatFieldCounter As Int = 0
					Dim cntPosicao As Int = 1
					
					For Row = 0 To rRecord.RowCount-1
						rRecord.Position = Row
						Dim Group As String = rRecord.GetString("group_title")
						Dim Qtd As Int = rRecord.GetInt("qtdw")
						Dim RRepeatcounter As Int = rRecord.GetInt("repeatcounter")
						Dim RObject As String = rRecord.GetString("article_tagcode")
						Dim RTitle As String = rRecord.GetString("article_title")
						Dim RItem As String = rRecord.GetString("item_tagcode")
						Dim RUniqueKey As String = rRecord.GetString("unique_key")
						' Validacao de capitulo
						If Not(Chapter=Group) Then ' Capitulo e diferente grupo
							If (Row = 0) Then
								Dim ss1 As String = $"update dta_requests_values set
									execute_status=0,
									execute_value='',
									title='${Group}',
									object_tagcode='',
									position=1,
									repeatfieldcounter=0
									where 1=1
									And request_tagcode='${newRequest}'
									And task_tagcode in ('TSKS_20200513_191407')
									And item_tagcode='AINV001'
									And unique_key='39f49fe2-8872-5302-8de6-270901935dfa'
									And repeatcounter=0
									And repeatfieldcounter=0"$
							Else
								Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
								Dim ss1 As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode,
									task_tagcode,item_tagcode,unique_key,
									tagcode,position,execute_value, execute_format_title,execute_status,title,object_tagcode,repeatfieldcounter)
									select ${maxID} as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, 
									a.item_tagcode, a.unique_key, a.tagcode, 
									1, '' as execute_value, a.execute_format_title,0 as execute_status,'${Group}' as title,'' as object_tagcode,
									${Row} as repeatfieldcounter
									from dta_requests_values As a
									where 1=1
									and request_tagcode='${newRequest}'
									and task_tagcode in ('TSKS_20200513_191407')
									and item_tagcode='AINV001'
									and unique_key='39f49fe2-8872-5302-8de6-270901935dfa'
									and repeatcounter=0
									and repeatfieldcounter=0 "$
							End If
							
							cntFieldVal04 = cntFieldVal04 + 1
							
							Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, newRequest)
							
							Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values_adds", "id", "") + 1 + 1000000
							Dim sSql1 As String = $"insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
									tagcode,fieldval_04,repeatfieldcounter) values (${maxID}, '${newRequest}','TSKS_20200513_191407', 'TSKS_20200513_191407', 
							'AINV001', '39f49fe2-8872-5302-8de6-270901935dfa', '',${cntFieldVal04}, ${cntRepeatFieldCounter})"$
							Utils.SaveSQLToLog("getTaskDetailsDialog",sSql1, newRequest)
							
							Chapter=Group
							cntPosicao = cntPosicao + 1
							'Counter2=1
						End If
						' Validacao de registo
						If (Row = 0) Then
							Dim ss1 As String = $"update dta_requests_values set
									execute_status=1,
									execute_value='${Qtd}',
									title='${RTitle}',
									object_tagcode='${RObject}',
									position = 2,
									repeatfieldcounter=0 
									where 1=1
									And request_tagcode='${newRequest}'
									And task_tagcode in ('TSKS_20200513_191407')
									And item_tagcode='${RItem}'
									And unique_key='${RUniqueKey}'
									And repeatcounter=${RRepeatcounter}
									and repeatfieldcounter=0 "$
						Else
							Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "") + 1 + 1000000
							Dim ss1 As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
									tagcode,position,execute_value,execute_format_title,execute_status,title,object_tagcode,repeatfieldcounter)
									select ${maxID} as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, 
									a.item_tagcode, a.unique_key, a.tagcode, 
									2, '${Qtd}' as execute_value, a.execute_format_title, 1 as execute_status,'${RTitle}' as title,'${RObject}' as object_tagcode,
									${Row} as repeatfieldcounter
									from dta_requests_values As a
									where 1=1
									and request_tagcode='${newRequest}'
									and task_tagcode in ('TSKS_20200513_191407')
									and item_tagcode='${RItem}'
									and unique_key='${RUniqueKey}'
									and repeatcounter=${RRepeatcounter}
									and repeatfieldcounter=0 "$
						End If
						Utils.SaveSQLToLog("getTaskDetailsDialog",ss1, newRequest)
						
						Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values_adds", "id", "") + 1 + 1000000
							
						Dim sSql1 As String = $"insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
									tagcode,fieldval_04,repeatfieldcounter) values (${maxID}, '${newRequest}','TSKS_20200513_191407', 'TSKS_20200513_191407', 
						'${RItem}', '${RUniqueKey}', '',${cntFieldVal04}, ${cntRepeatFieldCounter})"$
						Utils.SaveSQLToLog("getTaskDetailsDialog",sSql1, newRequest)
						cntRepeatFieldCounter = cntRepeatFieldCounter + 1
						cntPosicao = cntPosicao + 1
					Next
				End If
				rRecord.Close
			End If
			'***************************************************************
			' FIM DA VENDA / CARREGAMENTO
			'***************************************************************
		
			Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS
			sSQL = $"${sSQL} and z.request_tagcode='${newRequest}'"$
			sSQL = $"${sSQL} order by z.position"$
			Log(sSQL)
			Log(newRequest)
			
			Private incolitems As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
			If (incolitems.RowCount >= 1) Then
				Dim Posis As Int = 0
				If (Utils.NNE(FirstCheckList)) Then
					For a1=0 To incolitems.RowCount-1
						incolitems.Position = a1
						Dim tag As String = incolitems.GetString("tagcode")
						If (tag = FirstCheckList) Then
							Posis = a1
						End If
					Next
				End If
				incolitems.Position = Posis
			
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
											Types.MakeOtherCLA("", "", ""))
				
				Dim sSQL As String = $"update dta_requests set status_id=2, run_date='${sDate}', run_start='${sTime}'
										where tagcode='${tagcode}'"$
				Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, tagcode)
				'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
				
				
				
				Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'
										where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}'"$
				Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, tagcode)
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
								where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}' and repeatcounter=${repeatcounter}"$
				Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, tagcode)
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
					params.Put("ACLALatitude", "")
					params.Put("ACLALongitude", "")
				End Try
				CLA.Info.Map2 = params					
				'Utils.CallApi(0, params, Me, "https://demo.${ShareCode.APPL_HOST}/api/orion/clarel-satus/update")
				'Log("Grava Status no Servidor - Request-Relation")
				'Sleep(250)
				CLA.Status.status = 2
								
				Try
					Dim tr_is_model As Int = DBStructures.GetScriptColumnIntEVC($"select tr_is_model from dta_typerequests
											where tagcode='${newRequestType.Trim}'"$, "tr_is_model")
					If Utils.Int2Bool(tr_is_model) Then
						CallSubDelayed3(CheckList3, "StartCLA_Activity_Child", CLA, name)
					Else
						CallSubDelayed3(CheckList3, "StartCLA_ActivityTasks", CLA, name)
					End If
					
				Catch
					Log(LastException)
					Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
				End Try
			End If
			incolitems.Close
		Else
			MsgboxAsync(ShareCode.AppDialogsNaoVerificadoTipoIntervencao, ShareCode.GeneralAlertTitle)
		End If
	Catch
		Log(LastException)
	End Try
	ProgressDialogHide
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
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, request_tagcode.trim, task_tagcode.trim, "")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, request_tagcode.trim, task_tagcode.trim, "")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	
	Return True
	
End Sub

Sub ClaiUpdateSvrVarValue(request_tagcode As String, task_tagcode As String,item_tagcode As String, Uk As String, tagcode As String, field2set As String, value2set As String, rc As Int, ric As Int, rfc As Int) As ResumableSub
	
	Log($"ESCREVE NO BO : ${request_tagcode} ${task_tagcode} ${item_tagcode} ${field2set} ${value2set}"$)
	
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
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1, request_tagcode.trim, task_tagcode.trim, item_tagcode.trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1, request_tagcode.trim, task_tagcode.trim, item_tagcode.trim)
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	
	Return True
	
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
	CurrentLineItemAC = Index+1
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
	Log(SQLEVC)
	Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
	If Record.RowCount > 0 Then
		Dim Filter As AppDialogs
		Filter.Initialize
		Filter.getTaskDetailsDialog(Activity, "TasksCL2", ShareCode.tarefasavisoInfoDescritiva, Record, tagcode)
	Else
		MsgboxAsync(ShareCode.checklistErroacesso, ShareCode.GeneralAlertTitle)
		Record.Close
	End If
End Sub

' ********************************************************************
' TIP: CRIAÇÃO DE CHECKLIST (ITEM SELECIONADO DA LISTA) - ANTIGO!!!
' ********************************************************************
Sub ReturnShowTaskDetails(items As List, TVals As TripleValues)
	'************************************************************************************
	' NECESSÁRIO CRIAR LOOP NA LISTA PARA SELECÇÃO DO TIPO DE INTERVENÇÃO A UTILIZAR
	'************************************************************************************
	Dim newRequestType As String = items.Get(0)
	Dim tagcode As String = TVals.value1
	ProgressDialogShow(ShareCode.AvisoPrepararChecklist)
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize

		If Utils.NNE(newRequestType) Then
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
			newExecution.Put("entity_tagcode", "__NONE__")
			newExecution.Put("object_tagcode", "__NONE__")
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
'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
			Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests", ListOfMaps,newRequest,"")
				
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
			newRequestItem.Put("relation", ListOfMaps)
'			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
			Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, "dta_requests_relations", ListOfMaps,newRequest,"")
					
			
			Dim maxIDi As Int = DBStructures.GetScriptColumnIntEVC("select max(id) as id from dta_requests_values", "id") + 1 + 1000000
			
			'Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "")
			Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
					tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)
					select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
					x.item_tagcode, x.unique_key, x.tagcode, x.position, 
					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter
					from (select ${maxIDi} as id, a.request_tagcode, b.tagcode as inner_request_tagcode, 
					a.relation_tagcode as task_tagcode, 
					c.item_tagcode, c.unique_key, d.tagcode as tagcode, 
					ifnull(d.position, c.position) AS position, '' as execute_value, 
					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
					0 as confirmed, '' as changed_value, a.repeatcounter
					from dta_requests_relations as a
					inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)
					inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)
					left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)
					where a.type_relation=0 and a.request_tagcode='${newRequest}' and a.relation_tagcode='${tagcode}' 
					and a.repeatcounter=${repeatcounter}
					) as x
					order by  x.position, x.request_tagcode, x.task_tagcode, x.id"$
			Log(sSQL)
			Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, newRequest)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
			Dim res As ResumableSub = UploadNewRequest2Server2(newRequest, newRequestItem, "0", 0)
			Wait For(res) Complete (NewRequestCode As CreateRequestReturn)
			If(Utils.NNE(NewRequestCode.RequestTagcode)) Then
				If Not(newRequest = NewRequestCode.RequestTagcode) Then
					Dim sSQL As String = $"update dta_requests set tagcode='${NewRequestCode.RequestTagcode}' where tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					Dim sSQL As String = $"update dta_requests_adds set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_entities set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_objects set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_contacts set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_fields set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_relations set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					Dim sSQL As String = $"update dta_requests_relations_adds set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					
					Dim sSQL As String = $"update dta_requests_values set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					Dim sSQL As String = $"update dta_requests_values_adds set request_tagcode='${NewRequestCode.RequestTagcode}' where request_tagcode='${newRequest}';"$
					Utils.SaveSQLToLog("getTaskDetailsDialogChange",sSQL, NewRequestCode.RequestTagcode)
					newRequest = NewRequestCode.RequestTagcode
				End If
			End If
			
			Sleep(1000)
			
			Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS
			sSQL = $"${sSQL} and z.request_tagcode='${newRequest}'"$
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
				Dim repeatcounter As Int = incolitems.GetInt("repeatcounter")
				
				Dim CLAInfo As RequestTaskInfo = Types.MakeRequestTaskInfo(2, close_type, result_type, result_values, False, 0, 0, 0, Null, Null, -1)
				Dim CLA As RequestCLA = Types.MakeRequestCLA(tagcode, actionkey, task, repeatcounter, tasktype, _
											Types.MakeInterv(ID, tagcode, status_id, Utils.ColorInt(status_id)), CLAInfo, _
											Types.MakeOtherCLA("", "", ""))
				
				Dim sSQL As String = $"update dta_requests set status_id=2, run_date='${sDate}', run_start='${sTime}'
										where tagcode='${tagcode}'"$
				Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, tagcode)
				'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
				Dim sSQL As String = $"update dta_requests_relations set status_id=2, run_date='${sDate}', run_start='${sTime}'
										where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}'"$
				Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, tagcode)
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
								where request_tagcode='${tagcode}' and relation_tagcode='${actionkey}' and repeatcounter=${repeatcounter}"$
				Utils.SaveSQLToLog("getTaskDetailsDialog",sSQL, tagcode)
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
					params.Put("ACLALatitude", "")
					params.Put("ACLALongitude", "")
				End Try
				CLA.Info.Map2 = params					'Utils.CallApi(0, params, Me, "https://demo.${ShareCode.APPL_HOST}/api/orion/clarel-satus/update")
				'Log("Grava Status no Servidor - Request-Relation")
				'Sleep(250)
				CLA.Status.status = 2
				Try
					CallSubDelayed3(CheckList3, "StartCLA_ActivityTasks", CLA, name)
				Catch
					Log(LastException)
					Utils.logError("Call StartCLA_Activity", ShareCode.SESS_OPER_User, LastException)
				End Try
			End If
		Else
			MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo, ShareCode.GeneralAlertTitle)
		End If
	Catch
		Log(LastException)
	End Try
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
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, tagcode.trim, "", "")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End If
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, tagcode.trim, "", "")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If

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
			
			Dim JSON1 As JSONParser
			JSON1.Initialize(Job.GetString)
			Dim MapJSON As Map = JSON1.NextObject
			RetValue.RequestTagcode = Utils.IfNullOrEmpty(MapJSON.Get("newrequest"), "")
			RetValue.Status = Utils.IfNullOrEmptyInt(MapJSON.Get("status"), 0)
			RetValue.Stage = Utils.IfNullOrEmptyInt(MapJSON.Get("stage"), 0)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, tagcode.trim, "", "")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End If
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, tagcode.trim, "", "")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If

	Return RetValue
End Sub

'
'Sub ListsReturn(res As String)
'	StartTasksActivity(True, Starter.TaskSearchFilter, CurrentTab)
'End Sub

Sub ListsReturn(res As String, CurrentCLA As RequestCLA) 
	
	Log(res)
	'Error occurred on line: 0 (TasksCL2)
	'java.lang.Exception: Sub listsreturn signature does not match expected signature.
	'public static void xevolution.vrcg.demov201.taskscl2_subs_0._listsreturn(anywheresoftware.b4a.pc.RemoteObject,anywheresoftware.b4a.pc.RemoteObject) throws java.lang.Exception

	ProgressDialogShow2(ShareCode.Pg2MsgProcessar, False)
	Sleep(250)
	
	Dim r1  As ResumableSub = CheckTypeRequestTaskAdds(CurrentCLA.Request, CurrentCLA.Action)
	Wait For(r1) complete (finished As Boolean)
	
	Dim r2  As ResumableSub = CheckTypeRequestNewTask(CurrentCLA.Request, CurrentCLA.Action)
	Wait For(r2) complete (finished2 As Boolean)
	
	Dim r3  As ResumableSub = CheckTypeRequestNewTask2(CurrentCLA.Request, CurrentCLA.Action)
	Wait For(r3) complete (finished3 As Boolean)
	
	StartTasksActivity(True, Starter.TaskSearchFilter, CurrentTab)
	
	ProgressDialogHide
	
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
		Try
			Dim update_object_fields As Int = QuestParams.Get("update_object_fields")
		Catch
			Dim update_object_fields As Int = 0
			Log(LastException)
		End Try
							
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
								Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(3, object_tagcode.trim, "", "")
								Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
							End If
							Sleep(500)
						Else
							Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(3, object_tagcode.trim, "", "")
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
				Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, 
				task_tagcode,item_tagcode,unique_key,
				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)
				select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
				x.item_tagcode, x.unique_key, x.tagcode, x.position, 
				x.execute_value, x.execute_format_title,x.confirmed, x.changed_value, x.repeatcounter
				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, 
				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, a.position As relposition,
				'' as execute_value, Case when d.data_type=16 Then d.title Else '' end as execute_format_title,
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
		
			
				Dim r1  As ResumableSub = UploadNewRequestRel2Server(Request.trim, taskTagcode, NewCounter, newRequestItem)
				Wait For(r1) complete (finished As Boolean)
'			Sleep(2000)
			
			End If
		End If
		
		Sleep(250)
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
													
	
	Try
		Dim DtVal As Long = DateTime.DateParse(ObjectDateValue)
		Dim DtNow As Long = DateTime.DateParse(Utils.GetCurrentDate)
		Dim CanCreateNewCL As Boolean = Utils.NNE(ObjectDateValue) And (DtNow >= DtVal)
	Catch
		Dim CanCreateNewCL As Boolean = False
		Log(LastException)
	End Try
	
	Dim CanCreateNewCL As Boolean = Utils.NNE(ObjectDateValue) And (DtNow >= DtVal)
	
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
				Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
					tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)
					select ${maxID} as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
					x.item_tagcode, x.unique_key, x.tagcode, x.position, 
					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter
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
			
				
				Dim r1  As ResumableSub = UploadNewRequestRel2Server(Request.trim, taskTagcode, NewCounter, newRequestItem)
				Wait For(r1) complete (finished As Boolean)
				'			Sleep(2000)
				
			End If
		
			Sleep(250)
		End If
	End If
	Return True
End Sub

Sub UploadNewRequestRel2Server(tagcode As String, relation As String, counter As String, items As Map)  As ResumableSub
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
	params.Put("data", ListOfMaps)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)

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
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, tagcode.trim, "", "")
				Utils.save2update(ServerAddress, data, 0, WorkerND)
			End If
		Catch
			Log(LastException)
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, tagcode.trim, "", "")
			Utils.save2update(ServerAddress, data, 0, WorkerND)
		End Try
		
		Job.Release
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(0, tagcode.trim, "", "")
		Utils.save2update(ServerAddress, data, 0, WorkerND)
	End If
	Return True
End Sub


Sub ActualizaSvr_CLAI_Update (request As String, task As String , itemTC As String, UK As String, val2fill As String, title As String, ObjTC As String ,rc As Int, ric As Int, rfc As Int) As ResumableSub
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", request.trim)
	params.Put("ACLAAction", task.Trim)
	params.Put("ACLATask", task.trim)
	params.Put("ACLAItem",itemTC)
	params.Put("ACLAUniqueKey", UK)
'	params.Put("ACLATagcode", tagcode)
	params.Put("ACLAObjectTag", ObjTC)
	params.Put("ACLAValue", val2fill)
	params.Put("ACLATitle",title)
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
			Utils.CallApi(0, params, Me, Url, "", request.trim)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1, request.trim, task.Trim, itemTC.trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1, request.trim, task.Trim, itemTC.trim)
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
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
		NewParams.Put("ACLAJson", ACLAJson)
		NewParams.Put("debug", 1)
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