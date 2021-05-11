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

End Sub

Sub Globals
	Private listsTabPanel As TabStrip
	Private listsBackground As ImageView
	Private listsBasePanel As Panel
	Private listsBottomLine As Panel
	Private listsBottomPanel As Panel
	Private listsButtonAdd As Button
	Private listsButtonClose As Button
	Private listsLabelInfo As Label
	Private listsTopBar As Panel
	
	Private listButMap As Button
	Private listsButtonFilter As Button
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelAppInfo As Label
	Private LabelCopyright As Label
	
	Private ListItemReference As Label
	Private ListItemObject As Label
	Private ListItemStatusPanel As Panel
	Private ListItemDescription As Label
	Private listButDocuments As Button
	Private listButMap As Button
	Private listButPlanning As Button
	Private ListItemStatus As Label
	Private ListItemEntity As Label
	Private listButProperties As Button
	
	Private ItemsCounter As Int = 0
	Private ListItemTitle As Label
	
	Private ObjectsList As List
	Private listObjects As CustomListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("objectsLayout")
	listsTabPanel.LoadLayout("objects_listview", "Listagem")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub StartObjectsActivity(FileArg As String)
	Dim JSON As JSONParser
	JSON.Initialize( Utils.LoadJSONFile(File.DirInternal,  FileArg))
	Structures.MapObjects = JSON.NextObject
	Structures.Objects_Types = Structures.MapObjects.Get("types")
	'Dim count As Int = Structures.MapObjects.Get("count")
	ObjectsList = Structures.MapEntities.Get("items")
	For Each colitems As Map In ObjectsList
		ItemsCounter = ItemsCounter + 1
		listObjects.Add( CreateListItem(ItemsCounter, colitems, listObjects.AsView.Width, 100dip, Null), 100dip, "" )
	Next
End Sub

Sub CreateListItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("objects_itemview")
	p.RemoveView
	
	Dim status_desc As String = colitems.Get("status_desc")
	Dim documents As List = colitems.Get("documents")
	Dim status_color As String = colitems.Get("status_color")
	Dim local As Map = colitems.Get("local")
	Dim tagcode As String = local.Get("tagcode")
	Dim latitude As String = local.Get("latitude")
	Dim longitude As String = local.Get("longitude")
	
	Dim last_execution As String = colitems.Get("last_execution")
	Dim status_id As Int = colitems.Get("status_id")
	
	Dim have_scheme As Int = colitems.Get("have_scheme")
	
	Dim tagcode As String = colitems.Get("tagcode")
	Dim name As String = colitems.Get("name")
	Dim details As String = colitems.Get("details")
	'Dim id As Int = colitems.Get("id")
	Dim typedesc As String = colitems.Get("typedesc")
	
	Dim entity As Map = colitems.Get("entity")
	Dim enttagcode As String = entity.Get("tagcode")
	Dim entity_name As String = entity.Get("entity_name")
	
	Dim contrat_tagcode As String = colitems.Get("contrat_tagcode")
	Dim properties As List = colitems.Get("properties")
	Private ListItemReference As Label
	Private ListItemObject As Label
	Private ListItemStatusPanel As Panel
	Private ListItemDescription As Label
	Private ListItemStatus As Label
	Private ListItemEntity As Label
	
	ListItemObject.text = $"#${cnt} - ${name}"$
	ListItemStatus.Text = $"${status_desc}  (última execução: ${last_execution})"$
	ListItemReference.text = $"${tagcode} - ${typedesc}"$
	ListItemReference.Tag = tagcode
	ListItemDescription.text = $"${details}"$
	ListItemEntity.text = $"${entity_name}"$
	ListItemEntity.Tag = enttagcode
	
	listButPlanning.Tag = tagcode
	listButProperties.Tag = tagcode
	listButDocuments.Tag = tagcode
	listButMap.Tag = $"${latitude}|${longitude}"$

	ListItemStatusPanel.Color = Utils.ColorString(status_color)
	ListItemStatusPanel.Tag = status_id
	
	listButPlanning.Enabled = (contrat_tagcode <> "")
	listButDocuments.Enabled = (have_scheme = 1) Or (documents.size > 0)
	listButProperties.Enabled = (properties > 0)
	listButMap.Enabled = (properties > 0)
	
	p.Color = Colors.ARGB(255, 250,250,250)
	If (status_id = 0) Then p.Color = Colors.ARGB(255, 197,197,197)

	Return p
End Sub
