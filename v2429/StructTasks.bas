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
	
'	Private ListItemReference As Label
'	Private ListItemObject As Label
'	Private ListItemStatusPanel As Panel
'	Private ListItemDescription As Label
'	Private listButDocuments As Button
'	Private listButMap As Button
'	Private listButPlanning As Button
'	Private ListItemStatus As Label
'	Private ListItemEntity As Label
'	Private listButProperties As Button
'	Private ListItemTitle As Label
	
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
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Activity As Activity, lstobj() As CustomListView)
	'MapTasks Track_Tasks Tasks_Types Tasks_Status
	ActivityReference = Activity
	
	If Not(listAlerts.IsInitialized) Then listAlerts.Initialize(Activity, "listAlerts")
	listAlerts = lstobj(0)
	If Not(listTasks.IsInitialized) Then listTasks.Initialize(Activity, "listTasks")
	listTasks = lstobj(1)
	If Not(listActions.IsInitialized) Then listActions.Initialize(Activity, "listActions")
	listActions = lstobj(2)

	If Not(TasksList.IsInitialized) Then TasksList.Initialize
	ItemsCounter = 0
End Sub

Public Sub StartTasks(FileArg As String)
	Dim JSON As JSONParser
	JSON.Initialize( Utils.LoadJSONFile(File.DirInternal,  FileArg))
	Structures.MapTasks = JSON.NextObject
	Structures.Tasks_Types = Structures.MapTasks.Get("types")
	Structures.Tasks_Status = Structures.MapTasks.Get("status")
	Structures.Tasks_ItemStatus = Structures.MapTasks.Get("itemstatus")
	Structures.Tasks_Priorities = Structures.MapTasks.Get("priorities")
	Structures.Tasks_Urgency = Structures.MapTasks.Get("urgency")
	
	'Dim count As Int = Structures.MapTasks.Get("count")
	TasksList = Structures.MapTasks.Get("items")
	Dim CountAlert =0, CountTask = 0, CountAction As Int
	For Each colitems As Map In TasksList
		ItemsCounter = ItemsCounter + 1
		
		Dim type_id As Int = colitems.Get("type")
	
		If (type_id = Consts.TASKTYPE_ALERT) Then 
			CountAlert = CountAlert + 1
			listAlerts.Add( CreateAlertItem(CountAlert, colitems, listAlerts.AsView.Width, 100dip, Null), 100dip, "" )
		else if (type_id = Consts.TASKTYPE_TASK) Then
			CountTask = CountTask + 1
			listTasks.Add( CreateTaskItem(CountTask, colitems, listTasks.AsView.Width, 100dip, Null),100dip, "" )
		Else If (type_id = Consts.TASKTYPE_ACTION) Then
			CountAction = CountAction + 1
			listActions.Add( CreateActionItem(CountAction, colitems, listActions.AsView.Width, 100dip, Null),100dip, "" )
		End If
'		Public Const TASKTYPE_UNKNOWN As Int = 0
'		Public Const TASKTYPE_ALERT As Int = 1
'		Public Const TASKTYPE_TASK As Int = 2
'		Public Const TASKTYPE_ACTION As Int = 3
		'listObjects.Add( CreateListItem(ItemsCounter, colitems, listObjects.AsView.Width, 100dip, Null), 100dip, "" )
	Next
End Sub

Sub CreateAlertItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("tasks_alertitem")
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
'	Dim object_tagcode As String = details.Get("object_tagcode")
'	Dim checklist_tagcode As String = details.Get("checklist_tagcode")
'	Dim email_to As String = details.Get("email_to")
'	Dim delegate_to_user As String = details.Get("delegate_to_user")
'	Dim evidence_shot_b64 As String = details.Get("evidence_shot_b64")
'	Dim email_date As String = details.Get("email_date")
'	Dim sent_email As Int = details.Get("sent_email")
'	Dim delegate As Int = details.Get("delegate")
'	Dim related As Int = details.Get("related")
'	Dim request_number As String = details.Get("request_number")
'	Dim delegate_to_team As String = details.Get("delegate_to_team")
'	Dim cl_item_tagcode As String = details.Get("cl_item_tagcode")
'	Dim email_cc As String = details.Get("email_cc")
	
'	Dim history As List = colitems.Get("history")
'	For Each colhistory As Map In history
'		Dim email_to As String = colhistory.Get("email_to")
'		Dim delegate_to_user As String = colhistory.Get("delegate_to_user")
'		Dim evidence_shot_b64 As String = colhistory.Get("evidence_shot_b64")
'		Dim email_date As String = colhistory.Get("email_date")
'		Dim sent_email As Int = colhistory.Get("sent_email")
'		Dim itemstatus As Int = colhistory.Get("itemstatus")
'		Dim delegate As Int = colhistory.Get("delegate")
'		Dim message_text As String = colhistory.Get("message_text")
'		Dim status_id As Int = colhistory.Get("status_id")
'		Dim delegate_to_team As String = colhistory.Get("delegate_to_team")
'		Dim user_id As Int = colhistory.Get("user_id")
'		Dim history_date As String = colhistory.Get("history_date")
'		Dim email_cc As String = colhistory.Get("email_cc")
'	Next

	
	ListItemTaskTitle.text = $"#${cnt} - ${title}"$
	Dim stat As String = $"${Structures.GetMapTitleByID( Structures.Tasks_Status, status_id)}"$
	ListItemStatus.Text = stat
	ListItemStatusPanel.Color = Utils.ColorString(Structures.GetMapColorByID( Structures.Tasks_Status, status_id))
	ListItemStatusPanel.Tag = status_id
	
	ListItemReference.text = $"${tagcode} - ${creation_date}"$
	ListItemReference.Tag = tagcode
	ListItemDetails.text = $"${message_text}"$
	
	Dim cs As CSBuilder
	Dim clr As Int = Colors.ARGB(255, 88,88,88)
	cs.Initialize.Color(clr).Append($"Prioridade: "$)
	cs.Bold.Color(clr).Append(Structures.GetMapTitleByID( Structures.Tasks_Priorities, priority)).Pop
	cs.Append($", Urgência: "$).PopAll
	cs.Bold.Color(clr).Append(Structures.GetMapTitleByID( Structures.Tasks_Urgency, urgency)).Pop
	
	
'	Dim stat As String = $"Prioridade: ${Structures.GetMapTitleByID( Structures.Tasks_Priorities, priority)}, "$ & _
'						 $"Urgência: ${Structures.GetMapTitleByID( Structures.Tasks_Urgency, urgency)}"$
	ListItemPriorities.text =cs ' stat
	ListItemPriorities.Tag = $"${priority}|${urgency}"$
	
	ListItem_ID.Text = id
	ListItem_StatusID.Text = status_id
	ListItem_TypeID.Text = iType
	
	
	'FA GEAR 0xF085
	'FA CUBE 0xF1B2
	'FA CHECK 0xF04
	'FA STIKY 0xF24A
	'FA BRIEFCASE 0xF0B1
	
	'ListItem_Icon.Text =
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
	If (status_id > 0) Then 
		listButCheckNew.TextColor = Colors.ARGB(255, 179, 179, 179)
		listButCheckNew.Enabled = False
	End If

	p.Color = Colors.ARGB(255, 250,250,250)
	If (status_id = 0) Then p.Color =Colors.ARGB(255, 255,199,184)
	Return p
End Sub

Sub CreateTaskItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("tasks_taskitem")
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
	Dim stat As String = $"${Structures.GetMapTitleByID( Structures.Tasks_Status, status_id)}"$
	ListItemStatus.Text = stat
	ListItemStatusPanel.Color = Utils.ColorString(Structures.GetMapColorByID( Structures.Tasks_Status, status_id))
	ListItemStatusPanel.Tag = status_id
	
	ListItemReference.text = $"${tagcode} - ${creation_date}"$
	ListItemReference.Tag = tagcode
	ListItemDetails.text = $"${message_text}"$
	
	Dim cs As CSBuilder
	Dim clr As Int = Colors.ARGB(255, 88,88,88)
	cs.Initialize.Color(clr).Append($"Prioridade: "$)
	cs.Bold.Color(clr).Append(Structures.GetMapTitleByID( Structures.Tasks_Priorities, priority)).Pop
	cs.Append($", Urgência: "$).PopAll
	cs.Bold.Color(clr).Append(Structures.GetMapTitleByID( Structures.Tasks_Urgency, urgency)).Pop
	
	
'	Dim stat As String = $"Prioridade: ${Structures.GetMapTitleByID( Structures.Tasks_Priorities, priority)}, "$ & _
'						 $"Urgência: ${Structures.GetMapTitleByID( Structures.Tasks_Urgency, urgency)}"$
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

Sub CreateActionItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("tasks_actionitem")
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
	Dim stat As String = $"${Structures.GetMapTitleByID( Structures.Tasks_Status, status_id)}"$
	ListItemStatus.Text = stat
	ListItemStatusPanel.Color = Utils.ColorString(Structures.GetMapColorByID( Structures.Tasks_Status, status_id))
	ListItemStatusPanel.Tag = status_id
	
	ListItemReference.text = $"${tagcode} - ${creation_date}"$
	ListItemReference.Tag = tagcode
	ListItemDetails.text = $"${message_text}"$
	
	Dim cs As CSBuilder
	Dim clr As Int = Colors.ARGB(255, 88,88,88)
	cs.Initialize.Color(clr).Append($"Prioridade: "$)
	cs.Bold.Color(clr).Append(Structures.GetMapTitleByID( Structures.Tasks_Priorities, priority)).Pop.Pop
	cs.Append($", Urgência: "$)
	cs.Bold.Color(clr).Append(Structures.GetMapTitleByID( Structures.Tasks_Urgency, urgency)).PopAll
	
	
'	Dim stat As String = $"Prioridade: ${Structures.GetMapTitleByID( Structures.Tasks_Priorities, priority)}, "$ & _
'						 $"Urgência: ${Structures.GetMapTitleByID( Structures.Tasks_Urgency, urgency)}"$
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
'	Dim pnl As Panel = listObjects.GetPanel(Index)
'	Dim lbl As Label = pnl.GetView(1)
'	listsLabelInfo.Text = $"${lbl.Text}, ${Utils.GetFreeMem}"$
	Log("listRecordsView_ItemClick")
End Sub

Public Sub ActionItemClick (Index As Int, Value As Object)
'	Dim pnl As Panel = listObjects.GetPanel(Index)
'	Dim lbl As Label = pnl.GetView(1)
'	listsLabelInfo.Text = $"${lbl.Text}, ${Utils.GetFreeMem}"$
	Log("listRecordsView_ItemClick")
End Sub

Sub listButCheckNew_Click
'	Dim b As Button = Sender
End Sub