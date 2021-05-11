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
	listsTabPanel.LoadLayout("tasks_listview", ShareCode.TABGeneral_ChecklistTitle)
'	listsTabPanel.LoadLayout("tasks_listviewactions", ShareCode.TABGeneral_ActionsTitle)
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 50%x  '33.33%x
	Next
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
	If FirstTime Then
		' **************
	End If
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
		' LISTA DE TIPOS DE INTERVENÇÃO
		'***************************************************************
		
		Dim height As Int = 85dip
		
		If(ShareCode.ISPHONE) Then
			height = 145dip
		End If
		
		
		
		Private Record As Cursor
		ItemsCounter = 0
		
		Dim SQLEVC As String = $"SELECT a.tagcode, a.group_type, ifnull(b.tagdesc, '(Sem grupo)') AS taskgroup_desc, '' as typeresults_desc, 
								a.title, a.details, 0 as dayslastupdate,
								a.updated_at, a.active, a.published, a.tr_is_model, a.tr_model_modes
								FROM dta_typerequests AS a
								LEFT JOIN type_tpgroupstypes AS b ON (b.tagcode=a.group_type) 
								WHERE  1=1 and a.published=1 and a.is_internal=0  order by a.title"$
								
		Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
		CurrentLineItemCL = 0
		Log(SQLEVC)
		TotalLineItemsCL = Record.RowCount
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				ItemsCounter = ItemsCounter + 1
				Record.Position = Row
				listTypeRequests.Add( CreateListItem(ItemsCounter, Record, listTypeRequests.AsView.Width, height, True), "") ', height, "" )
			Next
		End If
		Record.Close
		
		'***************************************************************
		' LISTA DE CHECKLISTS
		'***************************************************************
		
		Dim height As Int = 85dip
		
		If(ShareCode.ISPHONE) Then
			height = 145dip
		End If
		
		
		
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
		
		CurrentLineItemAC = 0
		TotalLineItemsAC = Record.RowCount
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				ItemsCounter = ItemsCounter + 1
				Record.Position = Row
				listChecklists.Add( CreateListItem(ItemsCounter, Record, listChecklists.AsView.Width, height, False), "") ', height, "" )
			Next
		End If
		Record.Close
		
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
	Filter.GetTaskFiltersDialog("TasksCL2", Curr)
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
	Log(SQLEVC)
	Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
	If Record.RowCount > 0 Then
		Dim Filter As AppDialogs
		Filter.Initialize
		Filter.getTaskDetailsDialog(Activity, "TasksCL2", "Informação descritiva da Tarefa", Record, tagcode)
	Else
		Msgbox("Erro no acesso da Checklist! Efectue um sincronização e tente novamente.", "Alerta")
		Record.Close
	End If
End Sub

Sub ReturnShowTaskDetails(items As List, TVals As TripleValues)
	'************************************************************************************
	' NECESSÁRIO CRIAR LOOP NA LISTA PARA SELECÇÃO DO TIPO DE INTERVENÇÃO A UTILIZAR
	'************************************************************************************
	Dim newRequestType As String = items.Get(0)
	Dim tagcode As String = TVals.value1
	ProgressDialogShow("A criar/preparar execução de Checklist. Aguarde ...")
	Try
		Dim newRequestItem As Map
		newRequestItem.Initialize

		If Utils.NNE(newRequestType) Then
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
			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests", ListOfMaps)
				
			Dim repeatcounter As Int = DBStructures.GetCountOfEVC("dta_requests_relations", $" and request_tagcode='${newRequest}' and relation_tagcode='${tagcode}'"$)
			
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_relations", "id", "") + 1
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
			DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_requests_relations", ListOfMaps)
					
			
			Dim maxIDi As Int = DBStructures.GetScriptColumnIntEVC("select max(id) as id from dta_requests_values", "id") + 1
			
			'Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_requests_values", "id", "")
			Dim sSQL As String = $"insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,
					tagcode,position,execute_value,confirmed,changed_value, repeatcounter)
					select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, 
					x.item_tagcode, x.unique_key, x.tagcode, x.position, 
					x.execute_value, x.confirmed, x.changed_value, x.repeatcounter
					from (select ${maxIDi} as id, a.request_tagcode, b.tagcode as inner_request_tagcode, 
					a.relation_tagcode as task_tagcode, 
					c.item_tagcode, c.unique_key, d.tagcode as tagcode, 
					ifnull(d.position, c.position) AS position, '' as execute_value, 0 as confirmed, '' as changed_value, a.repeatcounter
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
			
			UploadNewRequest2Server(newRequest, newRequestItem, "0")
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
											Types.MakeInterv(ID, tagcode, status_id, Utils.ColorInt(status_id)), CLAInfo, Types.MakeOtherCLA(""))
				
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
				CLA.Info.Map2 = params					'Utils.CallApi(params, Me, "https://demo.${ShareCode.APPL_HOST}/api/orion/clarel-satus/update")
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
			Msgbox("Não foi possível verificar o tipo de intervenção/serviço associado à Checklist. Efectue a actualização/sincronização de dados e tente novamente.", "Alerta!")
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
			Utils.save2update(ServerAddress, data, 0)
		End If
		Job.Release
	Else
		Utils.save2update(ServerAddress, data, 0)
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

Sub listTypeRequests_ItemClick (Index As Int, Value As Object)
	
End Sub