B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Private ListItemReference As Label
	Private ListItemObject As Label
	Private ListItemStatusPanel As Panel
	Private ListItemDescription As Label
	Private listButMap As Button
	Private ListItemEntity As Label
	Private listObjects As CustomListView
	
	Private ItemsCounter As Int = 0
	Public ObjectsList As List
	
	
	Private listButDocuments As Button
	Private listButPlanning As Button
	Private ListItemStatus As Label
	Private listButProperties As Button
	Private ListItemTitle As Label
	Private planObjectsList As CustomListView
		
	Private ItemsCounter As Int = 0
	Public ObjectsList As List
	
	Private ActivityReference As Activity
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Activity As Activity, lstobj() As CustomListView)
	ActivityReference = Activity
	If Not(listObjects.IsInitialized) Then listObjects.Initialize(Activity, "listRecordsView")
	listObjects = lstobj(0)
	If Not(planObjectsList.IsInitialized) Then planObjectsList.Initialize(Activity, "planObjectsList")
	planObjectsList = lstobj(1)
'	If Not(ListItemReference.IsInitialized) Then ListItemReference.Initialize("")
'	If Not(ListItemObject.IsInitialized) Then ListItemObject.Initialize("")
'	If Not(ListItemStatusPanel.IsInitialized) Then ListItemStatusPanel.Initialize("")
'	If Not(ListItemDescription.IsInitialized) Then ListItemDescription.Initialize("")
'	If Not(ListItemStatus.IsInitialized) Then ListItemStatus.Initialize("")
'	If Not(ListItemEntity.IsInitialized) Then ListItemEntity.Initialize("")
'	If Not(ListItemTitle.IsInitialized) Then ListItemTitle.Initialize("")
'	
'	
'	If Not(listButProperties.IsInitialized) Then listButProperties.Initialize("listButProperties")
'	If Not(listButDocuments.IsInitialized) Then listButDocuments.Initialize("listButDocuments")
'	If Not(listButMap.IsInitialized) Then listButMap.Initialize("listButMap")
'	If Not(listButPlanning.IsInitialized) Then listButPlanning.Initialize("listButPlanning")
	
	If Not(ObjectsList.IsInitialized) Then ObjectsList.Initialize
	ItemsCounter = 0
End Sub

Public Sub StartObjects(FileArg As String)
	Dim JSON As JSONParser
	JSON.Initialize( Utils.LoadJSONFile(File.DirInternal,  FileArg))
	Structures.MapObjects = JSON.NextObject
	Structures.Objects_Types = Structures.MapObjects.Get("types")
	'Dim count As Int = Structures.MapObjects.Get("count")
	ObjectsList = Structures.MapObjects.Get("items")
	For Each colitems As Map In ObjectsList
		ItemsCounter = ItemsCounter + 1
		Dim contrat_tagcode As String = colitems.Get("contrat_tagcode")
		listObjects.Add( CreateListItem(ItemsCounter, colitems, listObjects.AsView.Width, 65dip, Null), "") ', 65dip, "" )
		If (contrat_tagcode <> "") Then
			planObjectsList.Add( CreateListContractItem(ItemsCounter, colitems, planObjectsList.AsView.Width, 65dip, Null), "") ', 65dip, "" )
		End If
	Next
End Sub

Sub CreateListItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height)
	'p.LoadLayout("objects_itemview")
	p.LoadLayout("objects_itemView2")
	p.RemoveView
	
	Dim status_desc As String = colitems.Get("status_desc")
'	Dim documents As List = colitems.Get("documents")
	Dim status_color As String = colitems.Get("status_color")
	Dim local As Map = colitems.Get("local")
	Dim tagcode As String = local.Get("tagcode")
	Dim latitude As String = local.Get("latitude")
	Dim longitude As String = local.Get("longitude")
	
'	Dim last_execution As String = colitems.Get("last_execution")
	Dim status_id As Int = colitems.Get("status_id")
'	Dim have_scheme As Int = colitems.Get("have_scheme")
	
	Dim tagcode As String = colitems.Get("tagcode")
	Dim name As String = colitems.Get("name")
'	Dim details As String = colitems.Get("details")
	'Dim id As Int = colitems.Get("id")
'	Dim typedesc As String = colitems.Get("typedesc")
	
	Dim entity As Map = colitems.Get("entity")
	Dim enttagcode As String = entity.Get("tagcode")
	Dim entity_name As String = entity.Get("entity_name")
	
'	Dim contrat_tagcode As String = colitems.Get("contrat_tagcode")
'	Dim properties As List = colitems.Get("properties")

	
	ListItemObject.text = $"#${cnt} - ${name}"$
	Dim stat As String = $"${status_desc}"$
'	If (last_execution <> "") Then  stat = $"${stat}  (Últ. Execução: ${last_execution})"$
'	ListItemStatus.Text = stat
	ListItemReference.text = $"${tagcode} - ${stat}"$
	ListItemReference.Tag = tagcode
	ListItemDescription.text = $"${latitude} - ${longitude}"$
	'ListItemDescription.text = $"${details}"$
	ListItemEntity.text = $"${entity_name}"$
	ListItemEntity.Tag = enttagcode
	
'	listButPlanning.Tag = tagcode
'	listButProperties.Tag = tagcode
'	listButDocuments.Tag = tagcode
	listButMap.Tag = $"${latitude}|${longitude}"$

	ListItemStatusPanel.Color = Utils.ColorString(status_color)
	ListItemStatusPanel.Tag = status_id
	
'	listButPlanning.Enabled = (contrat_tagcode <> "")
'	listButDocuments.Enabled = (have_scheme = 1) Or (documents.size > 0)
'	listButProperties.Enabled = (properties.Size > 0)
'	listButMap.Enabled = (latitude <> "") And (longitude <> "")
	
	p.Color = Colors.ARGB(255, 250,250,250)
	If (status_id = 0) Then p.Color = Colors.ARGB(255, 197,197,197)

	Return p
End Sub

Sub CreateListContractItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	ActivityReference.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("objects_planItemView")
	p.RemoveView
	
	Dim tagcode As String = colitems.Get("tagcode")
	Dim name As String = colitems.Get("name")
	Dim details As String = colitems.Get("details")
	'Dim id As Int = colitems.Get("id"
	Dim entity As Map = colitems.Get("entity")
	Dim enttagcode As String = entity.Get("tagcode")
	Dim entity_name As String = entity.Get("entity_name")
	
	Dim contrat_tagcode As String = colitems.Get("contrat_tagcode")
	
	ListItemObject.text = $"#${cnt} - ${name}"$
	ListItemObject.Tag = tagcode
	ListItemDescription.text = $"${details}"$
	
	ListItemEntity.text = $"${entity_name}"$
	ListItemEntity.Tag = enttagcode
	
	p.Tag = contrat_tagcode

	Return p
End Sub

Public Sub ItemClick (Index As Int, Value As Object)
'	Dim pnl As Panel = listObjects.GetPanel(Index)
'	Dim lbl As Label = pnl.GetView(1)
'	listsLabelInfo.Text = $"${lbl.Text}, ${Utils.GetFreeMem}"$
	Log("listRecordsView_ItemClick")
End Sub

Sub listButProperties_Click
	Log("listButProperties_Click")
End Sub

Sub listButPlanning_Click
	Log("listButPlanning_Click")
End Sub

Sub listButMap_Click
	Log("listButMap_Click")
End Sub

Sub listButDocuments_Click
	Log("listButDocuments_Click")
End Sub