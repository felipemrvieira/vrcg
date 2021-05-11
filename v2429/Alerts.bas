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
	Public Device As Phone
End Sub

Sub Globals
	Private listsTabPanel As TabStrip
	Private listsButtonClose As Button
	Private recAlerts As StructAlerts
	Public listAlerts As CustomListView
	Public listTasks As CustomListView
	Public listActions As CustomListView
	Private panelRequestOptions As Panel
	Private butRequestInfo As Button
	Private butRequestRun As Button
	Private butRequestAction As Button
	Private butRequestClosePanel As Button
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelCopyright As Label
	Private ButtonUserUnavailable As Button
	
	Private GoogleMaps As GoogleMap
	Private rp As RuntimePermissions
	Private Mapa_Alertas_fragment As MapFragment
	Private PanelMAP As Panel
	
	Private CurrentLineItemAL As Int = 0
	Private TotalLineItemsAL As Int = 0
	Private CurrentLineItemAC As Int = 0
	Private TotalLineItemsAC As Int = 0
	Private CurrentLineItemCL As Int = 0
	Private TotalLineItemsCL As Int = 0
	Public CurrentTab As Int = 0
	Private listsLabelInfo As Label
	Private mainLabelOptLists As Label
	Private mainLogo As ImageView
	Private ColorTabPanel As Panel
	Private ButtonActionPause As Button
	Private ButtonAppNetwork As Button
	Private mainActiveUser As Label
	
	Private alertsAlertsViewPanel As Panel
	Private alertsTasksViewPanel As Panel
	Private alertsActionsViewPanel As Panel

	Private actionsViewType As B4XComboBox
	Private actionsStartDate As EditText
	Private actionsEndDate As EditText
	Private butactionsStartDate As Button
	Private butactionsEndDate As Button
	Private labeln As Label
	Private LabelStatus As Label
	Private LabelDescricaoAlerta As Label
	Private LabelTaskViewStatus As Label
	Private LabelTaskViewDescricao As Label
	Private LabelTaskViewlabeln As Label
	Private LabelActionViewStatus As Label
	Private LabelActionViewDescricao As Label
	Private labelActionViewn As Label
	Private TaskViewTypeObjectFilter As Label
	Private AlertViewTypeObjectFilter As Label
	Private ActionViewTypeObjectFilter As Label
	Private AlertMapButtonDismiss As Button
	Private labelTitleAlertMap As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	Starter.CurrentWorkActivity = Me
	
	
	Dim TotRecs As ResumableSub = GetAlertsTotalRecs
	Wait for (TotRecs) complete (Finished As Boolean)
	
	Activity.LoadLayout("alertsLayout")
	
	Dim NumRecsSystem As String = $" (${ShareCode.SystemAlertsCount})"$
	Dim NumRecsTasks As String = $" (${ShareCode.TasksAlertsCount})"$
	Dim NumRecsRequests As String = $" (${ShareCode.RequestsAlertsCount})"$
	
	listsTabPanel.LoadLayout("alerts_alertsview", ShareCode.alertsChapterSistema & $"${NumRecsSystem}"$)
	listsTabPanel.LoadLayout("alerts_tasksview", ShareCode.alertsChapterTarefas & $"${NumRecsTasks}"$)
	listsTabPanel.LoadLayout("alerts_actionsview", ShareCode.alertsChapterInter & $"${NumRecsRequests}"$)
	
'	Set Main Color To Panels
	Utils.SetViewBackgroundColorToMainColor(alertsAlertsViewPanel)
	Utils.SetViewBackgroundColorToMainColor(alertsTasksViewPanel)
	Utils.SetViewBackgroundColorToMainColor(alertsActionsViewPanel)
	
	labeln.text = ShareCode.alertslabeln
	LabelStatus.Text = ShareCode.alertsLabelStatus
	LabelDescricaoAlerta.Text = ShareCode.alertsLabelDescricaoAlerta
	TaskViewTypeObjectFilter.Text = ShareCode.alertslabelTypeObjectFilter
	AlertViewTypeObjectFilter.Text = ShareCode.alertslabelTypeObjectFilter
	ActionViewTypeObjectFilter.Text = ShareCode.alertslabelTypeObjectFilter
	LabelTaskViewStatus.Text = ShareCode.alertsLabelStatus
	LabelTaskViewDescricao.Text = ShareCode.alertsLabelDescricaoAlerta
	LabelTaskViewlabeln.Text = ShareCode.alertslabeln
	LabelActionViewStatus.Text = ShareCode.alertsLabelStatus
	LabelActionViewDescricao.Text = ShareCode.alertsLabelDescricaoAlerta
	labelActionViewn.text = ShareCode.alertslabeln

	recAlerts.Initialize(Activity, Array As CustomListView(listAlerts, listTasks, listActions))
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 33.33%x
		If(ShareCode.ISPHONE) Then
			lbl.TextSize = 10.0
		End If
	Next
	'Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
	
	UpdateMainLayout
	WindowStatusUpdate
	ProgressDialogHide

End Sub

Sub GetAlertsTotalRecs As ResumableSub
	' Get Number of Requests Alerts
	Dim SQL As String = $"select ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,
								ifnull(d.tagdesc,'') as urgency_desc, a.id, a.request_tagcode, a.repeatcounter, a.repeatitemcounter,
								a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.updated_at as actiondatetime,
								ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, ifnull(a.email_to, '') as email_to,
								ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,
								a.priority_tagcode,  ifnull(a.title,'') as title, a.gravity_tagcode,  a.due_date, b.tagcode as operation_type,
								a1.technical_tagcode, a1.sess_user, a2.inner_title, a3.title AS checklist
								from dta_actions as a 
								INNER JOIN dta_requests AS a1 ON (a1.tagcode=a.request_tagcode)
								INNER JOIN dta_requests_relations AS a2 ON (a2.request_tagcode=a1.tagcode AND a2.relation_tagcode=a.action_tagcode)
								left JOIN dta_tasks AS a3 ON (a3.tagcode=a2.relation_tagcode)
								left join type_operationtypes as b ON (b.tagcode=(SELECT operation_type FROM dta_actions_items 
									WHERE actions_tagcode=a.tagcode 
									ORDER BY updated_at DESC LIMIT 1))
								left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)
								left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)
								where 1=1 and
								a.operation_type Not in ('TOPERT_04') and
								b.tagcode Not in ('TOPERT_04') and
								a.technical_tagcode='${ShareCode.SESS_OPER_User}'  
								order by a.request_tagcode, a.task_tagcode, a.id desc "$
	
	Private RecordReqs As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	ShareCode.RequestsAlertsCount = RecordReqs.RowCount
	RecordReqs.Close
	
	'Get nummber of System Alerts
	Dim SQL As String = $"select ifnull(tagcode,'') as tagcode, ifnull(title,'') as title,
						ifnull(date_verification,'') as date_verification, status_id, kind_data, id,
	'' as obs, '' as imagename, alert_type from dta_alerts where 1=1
						 and alert_type = 'ALRTTYP_NOTIFY' and alert_visible=1 and active = 1
                         or alert_type = 'ALRTTYP_SMS' and alert_visible=1 and active = 1
						 or alert_type = 'ALRTTYP_ALERT' and alert_visible=1 and active = 1
                         or alert_type = 'ALRTTYP_EMAIL' and alert_visible=1 and active = 1"$
						
	
	Private RecordSystem As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	ShareCode.SystemAlertsCount = RecordSystem.RowCount
	RecordSystem.Close
	
	'Get nummber of Tasks Alerts
	Dim SQL As String = $"select distinct ifnull(a.tagcode,'') as tagcode, ifnull(a.title,'') as title,
			ifnull(a.date_verification,'') as date_verification, a.status_id, a.kind_data, a.id,
			(select obs from dta_alerts_images where tagcode=a.tagcode) as obs,
			(select imagename from dta_alerts_images where tagcode=a.tagcode) as imagename,
			a.alert_type from dta_alerts as a
			where a.alert_visible=1 
				and a.user_tagcode='${ShareCode.SESS_OPER_User}' 
				and a.alert_type != 'ALRTTYP_NOTIFY'
				and a.alert_type != 'ALRTTYP_EMAIL'
				and a.alert_type != 'ALRTTYP_SMS'
				and a.alert_type != 'ALRTTYP_ALERT'
				and a.active=1 
				and a.date_alert>='${Utils.GetLastWeekDate}'"$  

	Private RecordTasks As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	ShareCode.TasksAlertsCount = RecordTasks.RowCount
	RecordTasks.close
	
	
'	Log("Sistema:" & ShareCode.SystemAlertsCount)
'	Log("Tarefas:" & ShareCode.TasksAlertsCount)
'	Log("Intervenções:" & ShareCode.RequestsAlertsCount)
	
	Return True
End Sub

Sub ShowAlertMaps(PhotoTitle As String, PhotoCoordinates As String)

	labelTitleAlertMap.Text = PhotoTitle
		
	Try
	If Utils.NNE(PhotoCoordinates) Or PhotoCoordinates.trim <> "/" Then
		
			Dim CoordsList As List = Regex.Split("/", PhotoCoordinates )
			Dim PhotoLat As String = CoordsList.Get(0)
			Dim PhotoLon As String = CoordsList.Get(1)
		Else
			Dim PhotoLat As String = GoogleMaps.MyLocation.Latitude
			Dim PhotoLon As String = GoogleMaps.MyLocation.Longitude
		End If
		Dim location As Map
		location.Initialize
		location.Put("latitude", PhotoLat)
		location.Put("longitude", PhotoLon)
		Dim CurrentCLAItem As RequestCLAItem
		ShareCode.CalledFromAlerts = True
		CallSubDelayed3(MapsActivity, "StartMapsActivity",CurrentCLAItem, location)
	Catch
		Log(LastException)
	End Try
	
	
	
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

	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
	
	Dim jo As JavaObject = listsTabPanel
	jo = jo.GetField("tabStrip")
	jo.RunMethod("setIndicatorColor", Array(Consts.ColorMain))
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
		ButtonUserUnavailable.TextColor = Colors.red
	End If
	
	ButtonActionPause.Enabled = False
	ButtonActionPause.TextColor = Consts.ColorLightSilver
	'	If (ShareCode.CLA_STATE >= 1) Then
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		ButtonActionPause.Enabled = True
		ButtonActionPause.TextColor = Consts.ColorRedOrange
	End If
	If (CurrentTab = 0) Then
		listsLabelInfo.Text = $"${CurrentLineItemAL} / ${TotalLineItemsAL}"$
	Else If (CurrentTab = 1) Then
		listsLabelInfo.Text = $"${CurrentLineItemAC} / ${TotalLineItemsAC}"$
	Else
		listsLabelInfo.Text = $"${CurrentLineItemCL} / ${TotalLineItemsCL}"$
	End If
	
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

Sub StartTasksActivity(FileArg As String)
	ProgressDialogShow(ShareCode.GeneralWaitPlease)
	Sleep(500)
	recAlerts.StartAlerts(False) 'StartTasks(False)
	ProgressDialogHide
End Sub

Sub listsButtonClose_Click
	Log("Back ALERTS")
	CallSubDelayed2(MainMenu, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub butRequestAction_Click
'	Dim p As Panel
'	p.LoadLayout("RequestView")
'	'p.Color = Colors.Black
End Sub

Sub butRequestRun_Click
'	Dim p As Panel
'	p.LoadLayout("RequestCLRunView")
End Sub

Sub butRequestInfo_Click
'	Dim p As Panel
'	p.LoadLayout("RequestActionView")
End Sub

Sub butRequestClosePanel_Click
'	Private panelRequestOptions As Panel
'	Private butRequestInfo As Button
'	Private butRequestRun As Button
'	Private butRequestAction As Button
'	Private butRequestClosePanel As Button
	panelRequestOptions.Visible = False
End Sub

Sub listAlerts_ItemClick (Index As Int, Value As Object)
	CurrentLineItemAL = Index+1
	recAlerts.AlertItemClick(Index, Value)
	ListItemSelected( listAlerts.GetPanel(Index), listAlerts )
End Sub

Sub listTasks_ItemClick (Index As Int, Value As Object)
	CurrentLineItemCL = Index+1
	recAlerts.TaskItemClick(Index, Value)
	ListItemSelected( listTasks.GetPanel(Index), listTasks )
End Sub

Sub listActions_ItemClick (Index As Int, Value As Object)
	CurrentLineItemAC = Index+1
	recAlerts.ActionItemClick(Index, Value)
	ListItemSelected( listActions.GetPanel(Index), listActions )
End Sub

Sub ListItemSelected(pan As Panel, listview As CustomListView)
	For index= 0 To listview.GetSize-1
		Dim p As Panel = listview.GetPanel(index)
		p.Color = Consts.ColorWhite
	Next
	pan.Color = Consts.ColorCianSoftLight
	WindowStatusUpdate
End Sub


Sub ButtonUserUnavailable_Click
	
End Sub

Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub ButtonActionPause_Click
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		'Starter.AppState.WriteBool("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
		Msgbox2Async(ShareCode.AvisoPararPausa, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null,False)
		Wait For Msgbox_Result (Result As Int)
		If Result = DialogResponse.POSITIVE Then
			ShareCode.SESS_IN_PAUSE = 0
			Starter.AppState.WriteInteger("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
			Starter.AppState.Flush
		End If
	End If
	WindowStatusUpdate
End Sub

Sub butactionsEndDate_Click
	
End Sub

Sub butactionsStartDate_Click
	
End Sub

Sub actionsEndDate_EnterPressed
	
End Sub

Sub actionsStartDate_EnterPressed
	
End Sub

Sub actionsViewType_SelectedIndexChanged (Index As Int)
	
End Sub

Sub listsTabPanel_PageSelected (Position As Int)
	CurrentTab = Position+1
	Log(CurrentTab)
	ProgressDialogShow2(ShareCode.GeneralLoadingMessage, True)
	Sleep(100)
	If (CurrentTab = 1) Then
'		recAlerts.AlertsList.Clear
		If (recAlerts.ListAlertsRecords = 0) Then
			TotalLineItemsAL = recAlerts.StartAlerts(True)
			Log( TotalLineItemsAL )
		End If
	else If (CurrentTab = 2) Then
'		recAlerts.TasksList.Clear
		If (recAlerts.ListTaskRecords = 0) Then
			TotalLineItemsAC = recAlerts.StartTasks(True)
			Log( TotalLineItemsAC )
		End If
	Else If (CurrentTab = 3) Then
'		recAlerts.ActionsList.Clear
		If (recAlerts.ListActionRecords = 0) Then
			TotalLineItemsCL = recAlerts.StartActions(True)
			Log( TotalLineItemsCL )
		End If
		
	End If
	ProgressDialogHide
	
	'TabSelected( CurrentTab )
	WindowStatusUpdate
'	End If
End Sub

Sub listsTabPanel_PageSelected2 (Position As Int)
	CurrentTab = Position+1
	Log(CurrentTab)
	ProgressDialogShow2(ShareCode.GeneralLoadingMessage, True)
	Sleep(100)
	If (CurrentTab = 1) Then
		TotalLineItemsAL = recAlerts.Startalerts(True)
	else If (CurrentTab = 2) Then
		TotalLineItemsAC = recAlerts.StartTasks(True)
	Else If (CurrentTab = 3) Then
		TotalLineItemsCL = recAlerts.StartActions(True)
	End If
	ProgressDialogHide
	
	'TabSelected( CurrentTab )
	WindowStatusUpdate
'	End If
End Sub

Sub AlertObjectSelected(CurrentSelectedCode As String, Pnl As Panel)
	recAlerts.AlertObjectSelected(CurrentSelectedCode, Pnl)
End Sub

Sub AlertMapButtonDismiss_Click
	PanelMAP.Visible = False
End Sub

Sub UpdateAlertsText
	
	Dim TotRecs As ResumableSub = GetAlertsTotalRecs
	Wait for (TotRecs) complete (Finished As Boolean)
		
	Dim NumRecsSystem As String = $" (${ShareCode.SystemAlertsCount})"$
	Dim NumRecsTasks As String = $" (${ShareCode.TasksAlertsCount})"$
	Dim NumRecsRequests As String = $" (${ShareCode.RequestsAlertsCount})"$
	
	Dim tse As TabStripViewPagerExtendet
	tse.Initialize
	tse.ChangeTabText(listsTabPanel,ShareCode.alertsChapterSistema & $"${NumRecsSystem}"$,0)
	tse.ChangeTabText(listsTabPanel,ShareCode.alertsChapterTarefas & $"${NumRecsTasks}"$,1)
	tse.ChangeTabText(listsTabPanel,ShareCode.alertsChapterInter & $"${NumRecsRequests}"$,2)
	
End Sub