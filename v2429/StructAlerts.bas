B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Private listAlerts As CustomListView
	Private listTasks As CustomListView
	Private listActions As CustomListView
	Private ItemsCounter As Int = 0
	Public TasksList As List
	Private ActivityReference As Activity
	Private GoogleMaps As GoogleMap
	Private rp As RuntimePermissions
	Private ApplDialog As CustomLayoutDialog
	
	Private ListItemReference As Label
	Private ListItemTaskTitle As Label
	Private ListItemStatusPanel As Panel
	Private ListItemDetails As Label
	Private listButCheckNew As Button
	Private ListItemStatus As Label
	Private ListItemPriorities As Label
	Private ListItem_ID As Label
	Private ListItem_StatusID As Label
	Private ListItem_TypeID As Label
	Private ListItem_Icon As Label
	Private ListItemObjectStatusIcon As Label
	Private CLAItem_G1 As Label
	Private CLAItemButton_1 As B4XStateButton
	Private CLAItemButton_2 As B4XStateButton
	Private CLAButtonOptions As Button
	Private CLAItem_G2 As Label
	Private ALERT_VIEW As Int = 0
	Private TASK_VIEW As Int = 1
	Private ACTION_VIEW As Int = 2
	Private ListItemActionRequest As Label
	Private ListItemActionNew As Button
	Private ListItemActionStatus As Label
	Private ListItemActionDetails As Label
	Private ListItemActionClose As Label
	Private ActionObjectStatusIcon As Label
	Private CLAActionAdd As B4XStateButton
	Private CLAActionOptions As B4XStateButton
	Private CLAItem_G3 As Label
	Private CLAItemAlertButton_1 As B4XStateButton
	Private CLAItemAlertButton_2 As B4XStateButton
	Private CLAButtonAlertOptions As Button
	Private CLAItemAlertText As Label
	Private lbl_Eml_Result As Label
	Private Marker_Button As Button
	Private BtnAlertRemove As B4XStateButton
	Private lbl_Alert_type As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Activity As Activity, lstobj() As CustomListView)
	ALERT_VIEW = 0
	TASK_VIEW = 1
	ACTION_VIEW = 2
	'MapTasks Track_Tasks alerts_Types alerts_Status
	ActivityReference = Activity
	
	'If Not(listAlerts.IsInitialized) Then  listAlerts.Initialize(Activity, "listAlerts")
	listAlerts = lstobj(ALERT_VIEW)
	'If Not(listTasks.IsInitialized) Then listTasks.Initialize(Activity, "listTasks")
	listTasks = lstobj(TASK_VIEW)
	'If Not(listActions.IsInitialized) Then listActions.Initialize(Activity, "listActions")
	listActions = lstobj(ACTION_VIEW)

	TasksList.Initialize
	ItemsCounter = 0
End Sub

Sub GetAlertsTotalRecs As ResumableSub
	Log(ShareCode.SystemAlertsCount)
	Log(ShareCode.TasksAlertsCount)
	Log(ShareCode.RequestsAlertsCount)
End Sub

'Public Sub StartTasks(FileArg As String)
Public Sub StartAlerts(clear As Boolean) As Int
	If (clear) Then
		listAlerts.Clear
	End If
	
'	***************************************************************
'	LISTA DE ALERTAS
'	***************************************************************
	Dim height As Int = 65dip
	If(ShareCode.ISPHONE) Then
		height = 120dip
	End If
	Private Record As Cursor
	ItemsCounter = 0
	Dim SQL As String = $"select ifnull(tagcode,'') as tagcode, ifnull(title,'') as title,
						ifnull(date_verification,'') as date_verification, status_id, kind_data, id,
						'' as obs, '' as imagename, alert_type from dta_alerts where 1=1
						 and alert_type = 'ALRTTYP_NOTIFY' and alert_visible=1 and active = 1
                         or alert_type = 'ALRTTYP_SMS' and alert_visible=1 and active = 1
						 or alert_type = 'ALRTTYP_ALERT' and alert_visible=1 and active = 1
                         or alert_type = 'ALRTTYP_EMAIL' and alert_visible=1 and active = 1"$
						
	'kind_data
	Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	
	Dim nRows As Int = Record.RowCount
	ShareCode.SystemAlertsCount = nRows
	If nRows > 0 Then
		For Row = 0 To Record.RowCount-1
			ItemsCounter = ItemsCounter + 1
			Record.Position = Row
			Dim ALRTYPE As String = Record.GetString("alert_type")
			listAlerts.Add( CreateAlertItem( nRows, Record, listAlerts.AsView.Width, height, Null), ALRTYPE)
		Next
	End If
	Record.Close

	
End Sub



'Public Sub StartTasks(FileArg As String)
Public Sub StartTasks(clear As Boolean) As Int
	If (clear) Then
		listTasks.Clear
	End If
	
	'***************************************************************
	' LISTA DE CHECKLISTS
	'***************************************************************
	Dim height As Int = 65dip
	If(ShareCode.ISPHONE) Then
		height = 120dip
	End If
	
	ItemsCounter = 0
	Dim cDate As String = Utils.GetLastWeekDate
	
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
				and a.date_alert>='${cDate}'"$  

	Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	
	Dim nRows As Int = Record.RowCount
	ShareCode.TasksAlertsCount = nRows
	If nRows > 0 Then
		For Row = 0 To Record.RowCount-1
			ItemsCounter = ItemsCounter + 1
			Record.Position = Row
			Dim ALRTYPE As String = Record.GetString("alert_type")
			listTasks.Add( CreateTaskItem( nRows, Record, listTasks.AsView.Width, height, Null), ALRTYPE)
		Next
	End If
	Record.Close
End Sub

Public Sub ListTaskRecords As Int
	Return listTasks.Size
End Sub

' TIP: ALERTAS DE SISTEMA
Sub CreateAlertItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height + 35)
	p.LoadLayout("alerts_alertitem_new") 'alerts_alertitem
	p.RemoveView
	
'	ListItemObjectStatusIcon.Text = Chr(0xF088)  'Not Answered
'	ListItemObjectStatusIcon.TextColor = Consts.ColorGray
	
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim title As String = colitems.GetString("title")
	Dim date_verification As String = colitems.GetString("date_verification")
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim kind_data As Int = colitems.GetInt("kind_data")
	Dim id As Int = colitems.GetInt("id")
	Dim AlertType As String = colitems.GetString("alert_type")
	
	'controlar o title para saber se e intervencao
	CLAItemAlertText.Text = $"${title}"$
	CLAItemAlertText.Text = CLAItemAlertText.Text.Replace(";", $";${CRLF}"$)
	
	If AlertType.ToUpperCase = "ALRTTYP_EMAIL" Then
		Marker_Button.visible = False
		
		If title.Contains("ERRO") Then
			CLAButtonAlertOptions.enabled = False
			lbl_Eml_Result.Visible = True
			lbl_Eml_Result.Text = "E M A I L  N Ã O  E N V I A D O"
			lbl_Eml_Result.TextColor = Colors.Red
		Else if title.Contains ("SUCESSO") Then
			CLAButtonAlertOptions.enabled = False
			lbl_Eml_Result.Visible = True
			lbl_Eml_Result.Text = "E M A I L   E N V I A D O"
			lbl_Eml_Result.TextColor = Consts.ColorGreen
		End If
		
	Else if AlertType.ToUpperCase = "ALRTTYP_REQUESTS" Then
		Marker_Button.visible = True
		CLAButtonAlertOptions.enabled = True
		lbl_Eml_Result.Visible = True
		lbl_Eml_Result.Text = "N O V A  I N T E R V E N C A O"
		lbl_Eml_Result.TextColor = Colors.Red
	Else
		Marker_Button.visible = False
	End If
	
	If (status_id = 1) Then
'		ListItemObjectStatusIcon.TextColor = Consts.ColorGreen
'		ListItemObjectStatusIcon.Text = Chr(0xF087)
'		CLAItemButton_1.State = 1
	Else If (status_id = 2) Then
'		ListItemObjectStatusIcon.TextColor = Consts.ColorRed
'		ListItemObjectStatusIcon.Text = Chr(0xF087)
		CLAItemAlertButton_2.State = 1
	End If
	
	'TASSGT_OBJECTS
	Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("__DUMMY__", _
		 "__DUMMY__", "__DUMMY__", "__DUMMY__", Utils.udid, _
		 "__DUMMY__", 0,0,0, _
		 title, _																'TITULO DO ALERTA
		 "", _
		 tagcode, _																'TAGCODE DO ALERTA
		 7, _																	'INDICAÇÃO DE ALERTA
		 0, 0, "", _
		DBStructures.DB2CLATaskItem("", ""), "")
	
	CLAButtonAlertOptions.Tag = CLAItem
	
'	CLAItemAlertButton_1.Tag = 1
	CLAItemAlertButton_2.Tag = 2
	
	p.Tag = $"${tagcode}|${kind_data}|${id}"$
	Return p
End Sub

' TIP: ALERTAS DE TAREFAS
Sub CreateTaskItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height+55)
	p.LoadLayout("alerts_taskitem_new2") 'alerts_taskitem
	p.RemoveView
	
'	ListItemObjectStatusIcon.Text = Chr(0xF088)  'Not Answered
'	ListItemObjectStatusIcon.TextColor = Consts.ColorGray
	
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim title As String = colitems.GetString("title")
	Dim date_verification As String = colitems.GetString("date_verification")
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim kind_data As Int = colitems.GetInt("kind_data")
	Dim id As Int = colitems.GetInt("id")
	'b.obs, b.imagename
	Dim obs As String = colitems.GetString("obs")
	Dim imagename As String = colitems.GetString("imagename")
		
	CLAItem_G1.Text = $"${title} (${imagename})"$
	CLAItem_G2.Text = date_verification
	CLAItem_G3.Text = obs
	
	If title.Contains("Imagens adicionadas") Then
		lbl_Alert_type.Text = "N O V A   I M A G E M"
		lbl_Alert_type.TextColor = Colors.Red
	Else
		lbl_Alert_type.Text = "N O V A  I N T E R V E N C A O"
		lbl_Alert_type.TextColor = Colors.Red
	End If
	

	
	If (status_id = 1) Then
'		ListItemObjectStatusIcon.TextColor = Consts.ColorGreen
'		ListItemObjectStatusIcon.Text = Chr(0xF087)
		CLAItemButton_1.State = 1
	Else If (status_id = 2) Then
'		ListItemObjectStatusIcon.TextColor = Consts.ColorRed
'		ListItemObjectStatusIcon.Text = Chr(0xF087)
		CLAItemButton_2.State = 1
	End If
	
	'TASSGT_OBJECTS
	Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("__DUMMY__", _  
		 "__DUMMY__", "__DUMMY__", "__DUMMY__", Utils.udid, _
		 "__DUMMY__", 0,0,0, _
		 title, _																'TITULO DO ALERTA
		 "", _
		 tagcode, _																'TAGCODE DO ALERTA
		 7, _																	'INDICAÇÃO DE ALERTA
		 0, 0, "", _
		DBStructures.DB2CLATaskItem("", ""), "")
	
	CLAButtonOptions.Tag = CLAItem
	
	CLAItemButton_1.Tag = 1
	CLAItemButton_2.Tag = 2
	
	p.Tag = $"${tagcode}|${kind_data}|${id}"$
	Return p
End Sub

Sub CLAButtonOptions_Click
	Dim Btn As Button = Sender 'CLAButtonOptions.Tag = CLAItem
	Dim CLAItem As RequestCLAItem = Btn.Tag
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(ActivityReference, "Alerts", CLAItem, 0, "", "", 0, GetPressedAnswerTagCode(CLAItem), "", "",0)
End Sub

Sub GetPressedAnswerTagCode(CLAItem As RequestCLAItem) As String
	Dim sSQL As String = $"select a.tagcode from  dta_requests_values as a where 1=1
						and a.request_tagcode='${CLAItem.Request.trim}' 
						and a.inner_request_tagcode='${CLAItem.Action.trim}' 
						and a.task_tagcode='${CLAItem.Task.trim}'
						and a.item_tagcode='${CLAItem.Item.trim}' 
						and a.unique_key='${CLAItem.UniqueKey.trim}'
						and a.execute_status=1
						and a.repeatcounter=${CLAItem.RepeatCounter}
						and a.repeatitemcounter=${CLAItem.RepeatItemCounter}
						and a.repeatfieldcounter=${CLAItem.repeatfieldcounter}"$
						
	Dim ret As String = DBStructures.GetScriptColumnStrEVC(sSQL, "tagcode")
	Return ret
End Sub


'Public Sub StartActions2(FileArg As String)
'	
'	'***************************************************************
'	' LISTA DE CHECKLISTS
'	'***************************************************************
'	Dim height As Int = 65dip
'	Private Record As Cursor
'	ItemsCounter = 0
'	Dim SQL As String = $"select ifnull(tagcode,'') as tagcode, ifnull(title,'') as title, 
'			ifnull(date_verification,'') as date_verification, status_id, kind_data, id
'			from dta_alerts where alert_visible=1"$  
'			'kind_data
'
'	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
'	
'	Dim nRows As Int = Record.RowCount
'	If nRows > 0 Then
'		For Row = 0 To Record.RowCount-1
'			ItemsCounter = ItemsCounter + 1
'			Record.Position = Row
'			listTasks.Add( CreateTaskItem( nRows, Record, listTasks.AsView.Width, height, Null), "")
'		Next
'	End If
'	Record.Close
'End Sub


'*********************************************************************************************************************************
'*********************************************************************************************************************************
' LISTA DE ACÇÕES SUBSEQUENTES
'*********************************************************************************************************************************
'*********************************************************************************************************************************

Public Sub StartActions(clear As Boolean) As Int
	If (clear) Then
		listActions.Clear
	End If
	'***************************************************************
	' LISTA DE ACÇÕES SUBSEQUENTES
	'***************************************************************
	Dim height As Int = 90dip
	ItemsCounter = 0
	
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
	
	Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	Dim ItemsCounter As Int = Record.RowCount
	ShareCode.RequestsAlertsCount = ItemsCounter
	If ItemsCounter > 0 Then
		For Row = 0 To ItemsCounter-1
			Record.Position = Row
			listActions.Add(CreateActionItem(Row, Record, listActions.AsView.Width, height), "")
		Next
	End If
	
	Return ItemsCounter
End Sub


Public Sub ListActionRecords As Int
	Return listActions.Size
End Sub

public Sub ListAlertsRecords As Int
	Return listAlerts.Size
End Sub

' TIP: ALERTA INTERVENÇÕES
Sub CreateActionItem(posis As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("alerts_actionitem_new") 'alerts_taskitem
	p.RemoveView
'	
'	ActionObjectStatusIcon.Text = Chr(0xF088)  'Not Answered
'	ActionObjectStatusIcon.TextColor = Consts.ColorGray
	
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim title As String = colitems.GetString("title")
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim priority_desc As String = colitems.GetString("priority_desc")
	Dim urgency_desc As String = colitems.GetString("urgency_desc")
	Dim due_date As String = colitems.GetString("due_date")
	Dim request_tagcode As String = colitems.GetString("request_tagcode")
	Dim ChecklistDesc As String = colitems.GetString("checklist")
	Dim inner_title As String = colitems.GetString("inner_title")
	Dim operation_type As String = Utils.IfNullOrEmpty(colitems.GetString("operation_type"), "TOPERT_01")

	Dim kind_data As Int = 0
	Dim id As Int = colitems.GetInt("id")
	
	Dim s0 As String = Utils.IfNullOrEmpty(inner_title, Utils.IfNullOrEmpty(ChecklistDesc, "") )
	If Utils.NNE(s0) Then s0 = $" / ${s0}"$
	Dim s1 As String = Utils.IfNullOrEmpty(title, "")
	If Utils.NNE(s1) Then s1 = $" / ${s1}"$
	Dim s2 As String = $"${request_tagcode}${s0}${s1}"$
	CLAItem_G1.Text = s2 'title
	
	Dim s0 As String = Utils.IfNullOrEmpty(priority_desc, "" )
	If Utils.NNE(s0) Then s0 = $" / ${s0}"$
	Dim s1 As String = Utils.IfNullOrEmpty(urgency_desc, "")
	If Utils.NNE(s1) Then s1 = $" / ${s1}"$
	Dim s2 As String = Utils.IfNullOrEmpty(due_date, "")
	If Utils.NNE(s2) Then s2 = $" / ${s2}"$
	Dim s3 As String = $"${Utils.IfNullOrEmpty(status_desc, "Novo")}${s0}${s1}${s2}"$
	CLAItem_G2.Text = s3 'date_verification
	
	If (operation_type = "TOPERT_01") Then
		ActionObjectStatusIcon.TextColor = Consts.ColorRed
	Else If (operation_type = "TOPERT_02") Then
		ActionObjectStatusIcon.TextColor = Consts.ColorYellow
	Else If (operation_type = "TOPERT_03") Then
		ActionObjectStatusIcon.TextColor = Consts.ColorGreen
	Else
		ActionObjectStatusIcon.TextColor = Consts.ColorBlue
	End If

	Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(colitems.GetString("request_tagcode"), _
				colitems.GetString("action_tagcode"), _
				colitems.GetString("task_tagcode"), _
				colitems.GetString("item_tagcode"), _
				colitems.GetString("uniquekey"), _
				colitems.GetString("tagcode"), _
				colitems.GetInt("repeatcounter"), _
				colitems.GetInt("repeatitemcounter"),0,"", "", "", 3, 0, 0, "", DBStructures.DB2CLATaskItem("", ""), "")
	
	CLAActionAdd.Tag = CLAItem
	CLAActionOptions.Tag = CLAItem
	
	p.Tag = $"${tagcode}|${kind_data}|${id}|ACTION|${posis}"$
	Return p
End Sub

Public Sub ActionItemClick (Index As Int, Value As Object)
	Dim pnl As Panel = listActions.GetPanel(Index)
	'p.Tag = $"${tagcode}|${kind_data}|${id}"$
	Dim info As List = Regex.Split("\|", pnl.tag )
'	Dim tagcode As String = info.Get(0)
	Dim val As Int = info.Get(1)
	
	If (val = 0) Then
'		Dim imgdata As ImageViewData = Types.MakeImageViewDataClear
'		Dim imgList As List
'		imgList.Initialize
'		ItemsCounter = 0
'		Dim SQL As String = $"select id,tagcode,imageb64,imagename
'							from dta_alerts_images
'							where 1=1 and tagcode='${tagcode}'"$  
'		
'		Dim Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(SQL)
'		Do While Record.NextRow
'			ItemsCounter = ItemsCounter + 1
'			Dim imgdata As ImageViewData = Types.MakeImageViewData(Record.GetString("imageb64"), Record.GetString("imagename"))
'			imgList.Add(imgdata)
'		Loop
'		Record.Close
'	
'		If ItemsCounter > 0 Then
		''			imgList.Add(imgdata)
		''		Else
		'
'			'If Utils.NNE(imgdata.b64) Then
'			Dim Filter As AppDialogs
'			Filter.Initialize
'			Filter.getShowImageViewListDialog(Me, imgList)
'		End If
	End If
	Log("listRecordsView_ItemClick")

End Sub

Sub CLAItemActionCancel_StateClick (State As Int)
	
	Dim btn As B4XStateButton = Sender
	Dim Pnl As Panel = btn.Parent
	MakeCLAItemActionClick(btn, btn.Tag, 2)
	
End Sub

Sub CLAItemActionRead_StateClick (State As Int)
	' Chr(0xF088) DOWN
	' Chr(0xF087) UP
	' Chr(0xF08D) PIN
	' Chr(0xF00B) LIST
	' Chr(0xF009) BLOCK
	' Chr(0xF00A) BLKPLUS
	' Chr(0xF187) ARCHIVE
	' Chr(0xF0ED) CLOUD DOWNLOAD
	' Chr(0xF0EE) CLOUD UPLOAD
	
	
	Dim btn As B4XStateButton = Sender
	MakeCLAItemActionClick(btn, btn.Tag, 1)
	
End Sub

Sub MakeCLAItemActionClick(btn As B4XStateButton, btnstate As Int, btnOrigin As Int)
'	Dim Continua As Boolean = True
'	Dim Pnl As Panel = btn.Parent
	''	Dim sts As Int = 0  'btn.State
'	Dim AllowClick As Boolean = True
'	Dim ldata As List = Regex.Split("\|", Pnl.tag )
'	Try
'		Dim TagCode As String = ldata.Get(0)
'		
'	Catch
'		Log(LastException)
'		Continua = False
'	End Try
	'
'	Dim currDate As String = Utils.GetCurrentDate
'	Dim StatusIcon As Label = Pnl.GetView(0)
'	Dim TagData As Label = Pnl.GetView(2)
	'
'	If (Continua) And (Utils.NNE(TagCode)) Then
'		
'		If (btnOrigin = 1) Then
'			StatusIcon.Text = Chr(0xF087)  'Not Answered
'			StatusIcon.TextColor = Consts.ColorGreen
	''			sts = 1
'			AllowClick = False
'			TagData.Text = currDate
'		else if (btnOrigin = 2) Then
'			StatusIcon.Text = Chr(0xF087)  'Not Answered
'			StatusIcon.TextColor = Consts.ColorRed
'			AllowClick = False
'			TagData.Text = currDate
	''			sts = 2
'		Else
'			StatusIcon.Text = Chr(0xF088)  'Not Answered
'			StatusIcon.TextColor = Consts.ColorGray
'		End If
'	
'		For Each v As View In Pnl.GetAllViewsRecursive
'			If (v Is B4XStateButton) Then
'				Dim this_b As B4XStateButton = v
'				this_b.AllowClick = AllowClick
'			End If
'		Next
'	
'		'Dim sSQL As String = $"update dta_alerts set status_id='${sts}', date_verification='${Utils.GetCurrentDate}' where tagcode='${Pnl.Tag}'"$
'		Dim sSQL As String = $"update dta_alerts set status_id='${btnstate}', date_verification='${currDate}' where tagcode='${TagCode}'"$
'		Utils.SaveSQLToLog("CLAItemButton_StateClick",sSQL)
'		'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
'	
'		Dim params As Map
'		params.Initialize
'		params.Clear
'		params.Put("_token", ShareCode.APP_TOKEN)
'		params.Put("tagcode", TagCode)
'		'params.Put("status_id", sts)
'		params.Put("status_id", btnstate)
'		params.Put("date_verification", currDate)
'		params.Put("thec", ShareCode.SESS_OPER_User)
'		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/alert/update"$
'		If Not(ShareCode.APP_WORKING_LOCAL) Then
'			Utils.CallApi(0, params, Me, Url, "")
'		Else
'			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
'		End If
'		Sleep(250)
'	End If


End Sub

Sub CLAItemAlertButton_1_StateClick (State As Int)
	
End Sub

Sub CLAItemAlertButton_2_StateClick (State As Int)
'	Dim btn As B4XStateButton = Sender
'	Dim Pnl As Panel = btn.Parent
'	Dim sts As Int = btn.State
''	Dim AllowClick As Boolean = True
'	Dim Continua As Boolean = True
'	Dim ldata As List = Regex.Split("\|", Pnl.tag )
'	Try
'		Dim TagCode As String = ldata.Get(0)
'	Catch
'		Log(LastException)
'		Continua = False
'	End Try
'	
'	If (Continua) And (Utils.NNE(TagCode)) Then
'		Dim i As Int = Msgbox2(ShareCode.RemoveRecordConfirm, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, "", ShareCode.Option_NO,  Null)
'		If (i=DialogResponse.POSITIVE) Then
'			ListItemObjectStatusIcon.Text = Chr(0xF087)  'Not Answered
'			ListItemObjectStatusIcon.TextColor = Consts.ColorRed
'			sts = 2
'			updateTaskItemView(Pnl, TagCode, sts, 0, "")
'		End If
'	Else
'		ListItemObjectStatusIcon.Text = Chr(0xF088)  'Not Answered
'		ListItemObjectStatusIcon.TextColor = Consts.ColorGray
'	End If

End Sub

Sub CLAActionOptions_StateClick (State As Int)
	
End Sub

Sub CLAActionAdd_StateClick (State As Int)
'	Dim btn As Button = Sender
'	Dim CLAItem As RequestCLAItem = btn.tag
'	Dim Continua As Boolean = True
'	Dim Pnl As Panel = btn.Parent
'	Dim ldata As List = Regex.Split("\|", Pnl.tag )
'	Try
'		Dim TagCode As String = ldata.Get(0)
'	Catch
'		Log(LastException)
'		Continua = False
'	End Try
'	
'	If (Continua) Then
'		Dim Filter As AppActionDialogs
'		Filter.Initialize
'		Filter.GetMoreNewActionsDialog(Alerts, CLAItem, TagCode, "", False, TagCode, Null, "", "")
'	End If
End Sub

Sub CreateActionItem2(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height)
'	p.LoadLayout("alerts_actionitem") ---a
	p.LoadLayout("alerts_actionitem_new")
	p.RemoveView
	
'	Dim CurrentDate As String = Utils.GetCurrentDate
	
	Dim id As Int = colitems.Get("id")
	Dim status_id As Int = colitems.Get("status_id")
	Dim tagcode As String = colitems.Get("tagcode")
'	Dim user_id As Int = colitems.Get("user_id")
	Dim urgency As Int = colitems.Get("urgency")
'	Dim itemstatus As Int = colitems.Get("itemstatus")
	Dim nature_type As Int = colitems.Get("nature_type")
	Dim iType As Int = colitems.Get("type")
	Dim title As String = colitems.Get("title")
	Dim priority As Int = colitems.Get("priority")
'	Dim verification_date As String = colitems.Get("verification_date")
	Dim creation_date As String = colitems.Get("creation_date")
'	Dim close_date As String = colitems.Get("close_date")
	
	Dim details As Map = colitems.Get("details")
	Dim message_text As String = details.Get("message_text")

	ListItemTaskTitle.text = $"#${cnt} - ${title}"$
	Dim stat As String = $"${Structures.GetMapTitleByID( Structures.alerts_Status, status_id)}"$
	ListItemStatus.Text = stat
	ListItemStatusPanel.Color = Utils.ColorString(Structures.GetMapColorByID( Structures.alerts_Status, status_id))
	ListItemStatusPanel.Tag = status_id
	
	ListItemReference.text = $"${tagcode} - ${creation_date}"$
	ListItemReference.Tag = tagcode
	ListItemDetails.text = $"${message_text}"$
	
	Dim cs As CSBuilder
	Dim clr As Int = Colors.ARGB(255, 88,88,88)
	cs.Initialize.Color(clr).Append($"Prioridade: "$)
	cs.Bold.Color(clr).Append(Structures.GetMapTitleByID( Structures.alerts_Priorities, priority)).Pop.Pop
	cs.Append($", Gravidade: "$)
	cs.Bold.Color(clr).Append(Structures.GetMapTitleByID( Structures.alerts_Urgency, urgency)).PopAll
	
	
'	Dim stat As String = $"Prioridade: ${Structures.GetMapTitleByID( Structures.alerts_Priorities, priority)}, "$ & _
'						 $"Gravidade: ${Structures.GetMapTitleByID( Structures.alerts_Urgency, urgency)}"$
	ListItemPriorities.text =cs ' stat
	ListItemPriorities.Tag = $"${priority}|${urgency}"$
	
	ListItem_ID.Text = id
	ListItem_StatusID.Text = status_id
	ListItem_TypeID.Text = iType

	If (nature_type = 0) Then
		' ***** SYSTEM *****
		ListItem_Icon.Text = Chr(0xF085)
	else if (nature_type = 1) Then
		' ***** OBJECT *****
		ListItem_Icon.Text = Chr(0xF1B2)
	else if (nature_type = 2) Then
		' ***** CHECKLIST *****
		ListItem_Icon.Text = Chr(0xF04)
	else if (nature_type = 3) Then
		' ***** NOTE *****
		ListItem_Icon.Text = Chr(0xF24A)
	else if (nature_type = 4) Then
		' ***** ENTITY *****
		ListItem_Icon.Text = Chr(0xF0B1)
	End If

	listButCheckNew.TextColor = Colors.ARGB(255, 60,184,0)
	If (status_id = 0) Then
		listButCheckNew.TextColor = Colors.ARGB(255, 179, 179, 179)
		listButCheckNew.Enabled = False
	End If

	p.Color = Colors.ARGB(255, 250,250,250)
	If (status_id = 0) Then p.Color =Colors.ARGB(255, 255,199,184)
	Return p
End Sub

Public Sub AlertItemClick (Index As Int, Value As Object)
'	Dim pnl As Panel = listObjects.GetPanel(Index)
'	Dim lbl As Label = pnl.GetView(1)
'	listsLabelInfo.Text = $"${lbl.Text}, ${Utils.GetFreeMem}"$
	Log("listRecordsView_ItemClick")
End Sub

Public Sub TaskItemClick (Index As Int, Value As Object)
	Dim pnl As Panel = listTasks.GetPanel(Index)
	'p.Tag = $"${tagcode}|${kind_data}|${id}"$
	Dim info As List = Regex.Split("\|", pnl.tag )
	Dim tagcode As String = info.Get(0)
	Dim val As Int = info.Get(1)
	
	If (val = 0) Then
		Dim imgdata As ImageViewData = Types.MakeImageViewDataClear
		Dim imgList As List 
		imgList.Initialize
		Private Record As Cursor
		ItemsCounter = 0
		Dim SQL As String = $"select id,tagcode,imageb64,imagename
							from dta_alerts_images
							where 1=1 and tagcode='${tagcode}'"$  
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	
		Dim nRows As Int = Record.RowCount
		If nRows > 0 Then
			For Row = 0 To Record.RowCount-1
				ItemsCounter = ItemsCounter + 1
				Record.Position = Row 
				Dim imgdata As ImageViewData = Types.MakeImageViewData(Record.GetString("imageb64"), Record.GetString("imagename"))
				imgList.Add(imgdata)
			Next
		Else
			imgList.Add(imgdata)
		End If
		Record.Close

		If Utils.NNE(imgdata.b64) Then
			Dim Filter As AppDialogs
			Filter.Initialize
			Filter.getShowImageViewListDialog(Me, imgList)
		End If
	End If

End Sub

Sub listButCheckNew_Click
'	Dim b As Button = Sender
End Sub

Sub listButMoreActionInner_Click
''	MAPAS NOS ALERTAS
''	2020/06/22  -  18:05:51  -  38.7645773/-9.3059861
'	Dim btn As Button = Sender
'	Dim pnl As Panel = btn.Parent
'	Dim LblPhoto1 As Label = pnl.GetView(1)
'	Dim LblPhoto2 As Label = pnl.GetView(6)
'	Dim lblphoto1Txt As String = LblPhoto1.Text
'	Dim lblphoto2Txt As String = LblPhoto2.Text
	
'	lblphoto1Txt = lblphoto1Txt.Replace("Imagens adicionadas ao repositório por utilizar.","")

'	Dim PhotoTitle As String = $"${lblphoto1Txt} ${lblphoto2Txt}"$
'	Dim alertsCoord As String = lblphoto2Txt.SubString(26)
'	CallSub3(Alerts,"ShowAlertMaps",PhotoTitle, alertsCoord)

End Sub

Sub CLAItemAlertButton_StateClick (State As Int)
	Dim btn As B4XStateButton = Sender
	Dim Pnl As Panel = btn.Parent
	Dim sts As Int = btn.State
'	Dim AllowClick As Boolean = True
	Dim Continua As Boolean = True
	Dim ldata As List = Regex.Split("\|", Pnl.tag )
	Try
		Dim TagCode As String = ldata.Get(0)
	Catch
		Log(LastException)
		Continua = False
	End Try
	
	If (Continua) And (Utils.NNE(TagCode)) Then
		If (btn.tag = 1) Then
'			ListItemObjectStatusIcon.Text = Chr(0xF087)  'Not Answered
'			ListItemObjectStatusIcon.TextColor = Consts.ColorGreen
			
			Dim Filter As AppDialogs
			Filter.Initialize
			Filter.getObjectSelectViewDialog(ActivityReference, "Alerts", "Seleção de Objecto", Pnl)
			
		else if (btn.Tag = 2) Then
			Dim i As Int = Msgbox2(ShareCode.RemoveRecordConfirm, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, "", ShareCode.Option_NO,  Null)
			If (i=DialogResponse.POSITIVE) Then
				ListItemObjectStatusIcon.Text = Chr(0xF087)  'Not Answered
				ListItemObjectStatusIcon.TextColor = Consts.ColorRed
				sts = 2
				updateTaskItemView(Pnl, TagCode, sts, 0, "")
				StartAlerts(True)
				CallSub(MainMenu,"BadgeCheckUpdate")
				Sleep(500)
				ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
				CallSubDelayed(Alerts,"UpdateAlertsText")
				Sleep(500)
				ProgressDialogHide
			End If
		Else
			ListItemObjectStatusIcon.Text = Chr(0xF088)  'Not Answered
			ListItemObjectStatusIcon.TextColor = Consts.ColorGray
		End If
	End If
End Sub

Sub CLAItemButton_StateClick (State As Int)
	Dim btn As B4XStateButton = Sender
	Dim Pnl As Panel = btn.Parent
	Dim sts As Int = btn.State
'	Dim AllowClick As Boolean = True
	Dim Continua As Boolean = True
	Dim ldata As List = Regex.Split("\|", Pnl.tag )
	Try
		Dim TagCode As String = ldata.Get(0)
	Catch
		Log(LastException)
		Continua = False
	End Try
	
	If (Continua) And (Utils.NNE(TagCode)) Then
		If (btn.tag = 1) Then
'			ListItemObjectStatusIcon.Text = Chr(0xF087)  'Not Answered
'			ListItemObjectStatusIcon.TextColor = Consts.ColorGreen
			
			Dim Filter As AppDialogs
			Filter.Initialize
			Filter.getObjectSelectViewDialog(ActivityReference, "Alerts", "Seleção de Objecto", Pnl)
			
		else if (btn.Tag = 2) Then
			Dim i As Int = Msgbox2(ShareCode.RemoveRecordConfirm, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, "", ShareCode.Option_NO,  Null)
			If (i=DialogResponse.POSITIVE) Then
				ListItemObjectStatusIcon.Text = Chr(0xF087)  'Not Answered
				ListItemObjectStatusIcon.TextColor = Consts.ColorRed
				sts = 2
				updateTaskItemView(Pnl, TagCode, sts, 0, "")
				StartAlerts(True)
				CallSub(MainMenu,"BadgeCheckUpdate")
				Sleep(500)
				ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
				CallSubDelayed(Alerts,"UpdateAlertsText")
				Sleep(500)
				ProgressDialogHide
			End If
		Else
			ListItemObjectStatusIcon.Text = Chr(0xF088)  'Not Answered
			ListItemObjectStatusIcon.TextColor = Consts.ColorGray
		End If
	End If
	
End Sub

Sub AlertObjectSelected(CurrentSelectedCode As String, Pnl As Panel)
	Dim Continua As Boolean = True
	Dim ldata As List = Regex.Split("\|", Pnl.tag )
	Try
		Dim TagCode As String = ldata.Get(0)
	Catch
		Log(LastException)
		Continua = False
	End Try
	
	If (Continua) Then
		ListItemObjectStatusIcon.Text = Chr(0xF087)  'Not Answered
		ListItemObjectStatusIcon.TextColor = Consts.ColorGreen
		updateTaskItemView(Pnl, TagCode, 1, 0, CurrentSelectedCode)
	End If
	
End Sub


Sub updateTaskItemView(Pnl As Panel, TagCode As String, sts As String, active As Int, NewObject As String)
	' SAVE group_tags as georef
	ProgressDialogShow2(ShareCode.AvisoAguarde, False)
	For Each v As View In Pnl.GetAllViewsRecursive
		If (v.tag Is B4XStateButton) Then
			Dim this_b As B4XStateButton = v.tag
			this_b.AllowClick = False
		End If
	Next
	
	Dim cDate As String = Utils.GetCurrentDate
	Dim sSQL As String = $"update dta_alerts set status_id='${sts}', active='${active}', 
							date_verification='${cDate}' 
							where tagcode='${TagCode}'"$
	Utils.SaveSQLToLog("CLAItemButton_StateClick",sSQL, TagCode)
	'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("tagcode", Pnl.Tag)
	params.Put("date_verification", cDate)
	params.Put("status_id", sts)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/alert/update"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Utils.CallApi(0, params, Me, Url, "", "")
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(500)
	
	If Utils.NNE(NewObject) Then
		Dim group_tags As String = ""
		Dim Continua As Boolean = False
		Dim AlertImage As Cursor = Starter.LocalSQLEVC.ExecQuery($"Select a.imageb64, a.imagename, 
											a.uniquekey, ifnull(b.group_tags, '') as group_tags
											from dta_alerts_images as a
											inner join dta_alerts as b on (b.tagcode=a.tagcode)
											where a.tagcode='${TagCode}'"$)
		If (AlertImage.RowCount >= 1) Then
			AlertImage.Position = 0
			Dim imageb64 As String = Utils.IfNullOrEmpty(AlertImage.GetString("imageb64"), "")
			Dim imagename As String = Utils.IfNullOrEmpty(AlertImage.GetString("imagename"), "")
'			Dim uniquekey As String = Utils.IfNullOrEmpty(AlertImage.GetString("uniquekey"), "")
			Dim group_tags As String = Utils.IfNullOrEmpty(AlertImage.GetString("group_tags"), "")
			
			Dim maxID As Int = DBStructures.GetMaxOfEVC("dta_objects_images", "id", "") +1 + 1000000
			Dim sSQL As String = $"insert into dta_objects_images (id, object_tagcode, image, filename, request_tagcode, origin, title, sess_user) values
							(${maxID}, '${NewObject}', '${imageb64}', '${imagename}', '__DUMMY__', 1, '${group_tags}', '${ShareCode.SESS_OPER_User}')"$
			Continua = Utils.SaveSQLToLog("CLAItemButton_StateClick",sSQL, TagCode)
		End If

		If (Continua) Then 
			Dim sSQL As String = $"update dta_alerts_images set iu_tagcode='${NewObject}',
							assigned=1, assigned_type='TASSGT_OBJECTS' 
							where tagcode='${TagCode}'"$
			Utils.SaveSQLToLog("AssignImageToObject",sSQL, TagCode)
			
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("tagcode", TagCode)
			params.Put("iu_tagcode", NewObject)
			params.Put("assigned_type", "TASSGT_OBJECTS")
			params.Put("sess_user", ShareCode.SESS_OPER_User)
			params.Put("group_tags", group_tags)
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/alertimg/update"$
			If Not(ShareCode.APP_WORKING_LOCAL) Then
				Utils.CallApi(0, params, Me, Url, "", "")
			Else
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
				Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
			End If
			Sleep(500)
		End If
	End If
	ProgressDialogHide
	CallSubDelayed2(Alerts, "listsTabPanel_PageSelected2", 1)
	
End Sub

Sub ListItemActionClose_Click
	
End Sub

Sub ListItemActionNew_Click
	
End Sub


Sub Marker_Button_Click
		
	Dim btn As Button = Sender
	Dim pnl As Panel = btn.Parent
	Log(pnl.Tag)
	Dim LblPhoto1 As Label = pnl.GetView(1)
	Dim LblPhoto2 As Label = pnl.GetView(6)
	Dim lblphoto1Txt As String = LblPhoto1.Text
	Dim lblphoto2Txt As String = LblPhoto2.Text
	Dim alertsCoord As String  = ""
	Dim PhotoTitle As String = ""
	Dim TypeOfAlert As String = ""
	
	If lblphoto1Txt.Contains("Imagens adicionadas") Then
		lblphoto1Txt = lblphoto1Txt.Replace("Imagens adicionadas ao repositório por utilizar.","")
		TypeOfAlert = "FOTO"
		PhotoTitle = $"${lblphoto1Txt} ${lblphoto2Txt}"$
		
		If lblphoto2Txt.Length > 26 Then
			alertsCoord  = lblphoto2Txt.SubString(26)
		End If
		
	Else
		TypeOfAlert = "INTERVENCAO"

		If lblphoto2Txt.Length > 24 Then
			alertsCoord  = lblphoto2Txt.SubString(24)
		End If
		
	End If
		
	If Utils.NNE(alertsCoord) Then
		CallSub3(Alerts,"ShowAlertMaps",PhotoTitle, alertsCoord)
	End If
	
	
End Sub

Sub BtnAlertRemove_StateClick (State As Int)
	
	Dim btn As B4XStateButton = Sender
	Dim Pnl As Panel = btn.Parent
	Dim sts As Int = btn.State
'	Dim AllowClick As Boolean = True
	Dim Continua As Boolean = True
	Dim ldata As List = Regex.Split("\|", Pnl.tag )
	Try
		Dim TagCode As String = ldata.Get(0)
	Catch
		Log(LastException)
		Continua = False
	End Try
	
	If (Continua) And (Utils.NNE(TagCode)) Then
		Dim i As Int = Msgbox2(ShareCode.RemoveRecordConfirm, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, "", ShareCode.Option_NO,  Null)
		If (i=DialogResponse.POSITIVE) Then
			ListItemObjectStatusIcon.Text = Chr(0xF087)  'Not Answered
			ListItemObjectStatusIcon.TextColor = Consts.ColorRed
			sts = 2
			updateTaskItemView(Pnl, TagCode, sts, 0, "")
			'refresh view
			StartAlerts(True)
			CallSub(MainMenu,"BadgeCheckUpdate")
			Sleep(500)
			ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
			CallSubDelayed(Alerts,"UpdateAlertsText")
			Sleep(500)
			ProgressDialogHide
		End If
	Else
		ListItemObjectStatusIcon.Text = Chr(0xF088)  'Not Answered
		ListItemObjectStatusIcon.TextColor = Consts.ColorGray
	End If
End Sub