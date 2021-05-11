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
'	Dim Icon As BitmapDrawable
	Dim xui As XUI
	' **************************************************************
	' GENERAL DATA/INFO
	' **************************************************************
	Private ButtonUserUnavailable As Button
	Private LabelAppInfo As Label
	Private LabelCopyright As Label
	Private LabelDateTime As Label
	Private LabelVersion As Label
	Private listsButtonAdd As Button
	Private listsButtonClose As Button
	Private listsLabelInfo As Label
	Private listsTabPanel As TabStrip
	Private mainLabelOptLists As Label
	
	' **************************************************************
	' ENTITY DATA - entity_generalView
	' **************************************************************
	Private EntityListView As CustomListViewCollapse
	Private entityNotes As Label
	Private entityWebsite As Label
	Private entityEmail As Label
	Private entityPhone As Label
	Private entityCode As Label
	Private entityNif As Label
	Private entityType As Label
	Private entityTagcode As Label
	
	' **************************************************************
	' CONATCT DATA - ItemEntityContact
	' **************************************************************
	Private lblContactName As Label
	Private butContactEdit As Button
	Private lblTypeContact As Label
	Private lblContactEmail As Label
	Private lblContactPhone As Label
	
	' **************************************************************
	' ADDRESS DATA  - ItemEntityAddress
	' **************************************************************
	Private lblAddressType As Label
	Private lblAddressName As Label
	Private lblAddressName2 As Label
	Private lblAddressPostalCode As Label
	Private lblAddressLatitude As Label
	Private lblAddressLongitude As Label
	Private lblAddressCity As Label
	Private butAddressMap As Button
	Private butAddressEdit As Button
	
	' **************************************************************
	' PROPERTIES DATA  - ItemEntityProperties
	' **************************************************************
	Private lblPropertyValue As Label
	Private butPropertyEdit As Button
	Private lblPropertyName As Label
	
	
	Private pnlGroupExpanded As Panel
	Private lblGroupTitle As Label
	Private pnlCurrent As Panel
	Private butGroupCollpseExpand As Button
	Private pnlGroupTitle As Panel
	
	Private CurrentGroupItem As Int = 0
	Private CurrentGroupItem As Int = 0
	Private pnlGroupCurrenIndex As Int
	
	' **************************************************************
	' CONTRACTS DATA  - entity_contractView
	' **************************************************************
	Private entityContractName As Label
	Private entityContractStart As Label
	Private entityContractEnd As Label
	Private entityContractDaysPeriod As Label
	Private entityContractDuration As Label
	Private entityContractDaysNotice As Label
	Private w0,w1,w2,w3,w4,w5,w6,w7 As Button
	Private d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15 As Button
	Private d16,d17,d18,d19,d20,d30,d29,d28,d27,d26,d25,d24,d23 As Button
	Private d22,d21,d31,d32,d33 As Button
	Private contractPanel As Panel
	Private TypePeriodicity As List
	Private TypeDayPeriod As List
	
	' **************************************************************
	' CONTRACTS DATA TASKS  - ItemEntityContractTasks
	' **************************************************************
	Private butContractTask As Button
	Private lblContractTask As Label
	Private entityContractHourPeriod As Label
	Private entityContractHours As Label
	Private entityContractPeriod As Label
	
	'EntityWHItemsCheck
	'EntityWHItemsTaken
	Private entityWHName As Label
	Private EntityWHItemsCheck As CustomListViewCollapse
	Private EntityWHItemsTaken As CustomListViewCollapse
	
	
	Private CurrentAddressTagcode As String
	Private CurrentEntityTagcode As String
	Private TypeAddressList As List
	Private CurrentContactTagcode As String
	Private TypeContactsList As List
	
	' **************************************************************
	' OBJECTS DATA
	' **************************************************************
	Private listObjects As CustomListView
	
	Private ListItemReference As Label
	Private ListItemObject As Label
	Private ListItemEntity As Label
	Private ListItemStatusPanel As Panel
	Private ListItemDescription As Label
	
	' **************************************************************
	' SEM REGISTOS DATA
	' **************************************************************
	Private noRecordsPanel As Panel
	Private noRecordsLabel As Label
	Private listButRefresh As Button
	
	' **************************************************************
	' DOCUMENTS DATA
	' **************************************************************
	Private listDocuments As CustomListView
	Private ListItemDocButton As Label
	Private ListItemTitle As Label
	Private ListItemCategory As Label
	Private ListItemSDate As Label
	Private ListItemEDate As Label
	
	
	Private WareHousePanel As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("entity_editLayout")
	listsTabPanel.LoadLayout("entity_generalView", "Geral")
	listsTabPanel.LoadLayout("objects_listview", "Objectos")
	listsTabPanel.LoadLayout("entity_contractView2", "Contrato")
	listsTabPanel.LoadLayout("entity_warehouseView", "Armazém")
	listsTabPanel.LoadLayout("entity_documentsView", "Documentos")
	listsTabPanel.LoadLayout("listviewlayout", "Intervenções")
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		lbl.Width = 16.66%x
	Next
	TypeAddressList.Initialize
	TypeAddressList = DBStructures.GetListOfAddresseTypes
	
	TypeContactsList.Initialize
	TypeContactsList = DBStructures.GetListOfContactTypes
	'  CurrentContactTagcode
	
	TypePeriodicity.Initialize
	TypePeriodicity = DBStructures.GetListOfPeriodicityTypes
	TypeDayPeriod.Initialize
	TypeDayPeriod = DBStructures.GetListOfDayPeriodTypes
	  
	'
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub StartEntityActivity(Tagcode As String)
	Dim SQL As String = DBStructures.SQL_CURRENT_ENTITIES
	If (Tagcode <> "") Then
		SQL = $"${SQL} where a.tagcode='${Tagcode}'"$
		Private Record As Cursor
		Record = Starter.LocalSQL.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			entityTagcode.text = Record.GetString("tagcode")
			entityType.text = Record.GetString("typedesc")
			entityNif.text = Record.GetString("nifnumber")
			entityCode.text = Record.GetString("id")
			entityPhone.text = Record.GetString("contact_phone")
			entityEmail.text = ""
			entityWebsite.text = "www"
			entityNotes.text = Record.GetString("notes")
			mainLabelOptLists.text = Record.GetString("name")
			CurrentEntityTagcode = entityTagcode.text
			
			Dim haveContract As Int = Record.GetInt("have_contract")
			
'			If Not(haveContract=1) Then
'				'NOContractLabel.Visible = True
'				contrcatPanel.Visible = False
'				WareHousePanel.Visible = False
'			End If
			
			CreateEntityDetailsData(False, Record)
		Else
			Record.Close
		End If
		
		CreateObjectsFromEntity(True, $"a.entity='${CurrentEntityTagcode}'"$)
		CreateContractFromEntity(False, $"b.entity='${CurrentEntityTagcode}'"$)
		CreateDocumentsFromEntity(False, CurrentEntityTagcode)
	End If

End Sub

Sub CreateDocumentsFromEntity(Clear As Boolean, Filter As String)
	If Clear Then
		listDocuments.Clear
	End If
	
	Dim height As Int = 70dip
	Private Record As Cursor
	Dim ItemsCounter As Int = 0
	Dim SQL As String = $"${ DBStructures.SQL_ALL_DOCUMENTS} where a.tagcode in (Select document from docs2entities where entity='${Filter}')"$
'	If (Filter <> "") Then
'		SQL = $"${SQL} ${Filter}"$
'	End If
	SQL = $"${SQL} order by a.title"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		For Row = 0 To Record.RowCount-1
			ItemsCounter = ItemsCounter + 1
			Record.Position = Row
			listDocuments.Add( CreateDocumentListItem(ItemsCounter, Record, listDocuments.AsView.Width, height), height, "" )
		Next
	Else
		listDocuments.Add( CreateNoRecordListItem(ItemsCounter, Null, listDocuments.AsView.Width, height + 5dip), height + 5dip, "" )
	End If
	Record.Close
End Sub

Sub CreateDocumentListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("ListItemDocument")
	p.RemoveView
	
	Dim tagcode As String = colitems.GetString("tagcode")
	ListItemTitle.Text = colitems.GetString("title")
	ListItemCategory.Text = colitems.GetString("categorytitle")
	ListItemSDate.Text = Utils.IfNullOrEmpty(colitems.GetString("valid_from"), "----------")
	ListItemEDate.Text = Utils.IfNullOrEmpty(colitems.GetString("valid_to"), "----------")
	ListItemDocButton.Tag = colitems.GetString("docfilename")
	p.Tag = tagcode
	Return p
End Sub

Sub CreateNoRecordListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("ItemNORecords")
	p.RemoveView
	listButRefresh.Tag = CurrentEntityTagcode
	Return p
End Sub

Sub CreateObjectsFromEntity(Clear As Boolean, Filter As String)
	If Clear Then
		listObjects.Clear
	End If
	
	Dim height As Int = 65dip
	Private Record As Cursor
	Dim ItemsCounter As Int = 0
	Dim SQL As String = DBStructures.SQL_CURRENT_OBJECTS
	If (Filter <> "") Then
		SQL = $"${SQL} where ${Filter}"$
	End If
	SQL = $"${SQL} order by b.name"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		For Row = 0 To Record.RowCount-1
			ItemsCounter = ItemsCounter + 1
			Record.Position = Row
			listObjects.Add( CreateObjListItem(ItemsCounter, Record, listObjects.AsView.Width, height), height, "" )
		Next
	Else
		listObjects.Add( CreateNoRecordListItem(ItemsCounter, Record, listObjects.AsView.Width, height + 5dip), height + 5dip, "" )
	End If
	Record.Close
End Sub

Sub CreateObjListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("objects_itemViewEntity")
	p.RemoveView
	
	Dim status_desc As String = colitems.GetString("status_desc")
	Dim status_color As String = colitems.GetString("status_color")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim name As String = colitems.GetString("name")
	Dim entity As String = colitems.GetString("entity")
	Dim entity_name As String = colitems.GetString("entity_name")
	Dim address As String = colitems.GetString("address")
	Dim postalcode As String = colitems.GetString("postal_code")
	Dim city As String = colitems.GetString("city")
	ListItemObject.text = $"#${cnt} - ${name}"$
	Dim stat As String = $"${status_desc}"$
	ListItemReference.text = $"${tagcode} - ${stat}"$
	ListItemReference.Tag = tagcode
	ListItemDescription.text = $"${address}, ${postalcode} ${city}, ${latitude}|${longitude}"$
	ListItemEntity.text = $"${entity_name}"$
	ListItemEntity.Tag = entity
	ListItemStatusPanel.Color = Utils.ColorString(status_color)
	ListItemStatusPanel.Tag = status_id
	
	p.Tag = tagcode

	Return p
End Sub

Sub CreateContractFromEntity(Clear As Boolean, Filter As String)
	Private Record As Cursor
	Dim SQL As String = DBStructures.SQL_ALL_ENTITY_CONTRACTS
	If (Filter <> "") Then
		SQL = $"${SQL} where ${Filter}"$
	End If
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim CurrentContract As String = Record.GetString("tagcode")
		
'		a.id, a.ascbus, a.tagcode, a.title, a.status_id, a.status_desc, a.status_color, a.document_tagcode, a.docfilename, a.creation_date, a.valid_from,
'		a.valid_to, a.duration, a.confirmdays, a.periodicity, a.periodvisits, a.hourspervisit, a.dayperiod,
'		a.last_visit, a.daysweekvisit, a.daismonthvisit, a.intervention_type
		
		entityContractName.Text = Record.GetString("title")
		entityContractStart.text = Record.GetString("valid_from")
		entityContractEnd.text = Record.GetString("valid_to")
		
		entityContractDaysPeriod.text = Record.GetInt("periodvisits")
		entityContractDuration.text = Record.GetInt("duration")
		entityContractDaysNotice.text = Record.GetInt("confirmdays")
		
		entityContractPeriod.text = TypePeriodicity.Get( Record.GetInt("periodicity") )
		entityContractHours.text = Record.GetInt("hourspervisit")
		entityContractHourPeriod.text = TypeDayPeriod.Get( Record.GetInt("dayperiod") )
		
		Dim dwv As String = Record.GetString("daysweekvisit")
		If Not( Utils.isNullOrEmpty(dwv)) Then
			Dim bbw(8) As Button = Array As Button(w0,w1,w2,w3,w4,w5,w6,w7)
			Dim weekList As List = Regex.Split("\|", Record.GetString("daysweekvisit"))
			For n=0 To weekList.Size-1
				bbw(weekList.Get(n)-1).Color = Colors.ARGB(255, 115, 200, 155)
			Next
		End If 
		
		Dim dwv As String = Record.GetString("daismonthvisit")
		If Not( Utils.isNullOrEmpty(dwv)) Then
			Dim daysList As List = Regex.Split("\|", Record.GetString("daismonthvisit"))
			Dim bbd(33) As Button = Array As Button(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15, _
						d16,d17,d18,d19,d20,d30,d29,d28,d27,d26,d25,d24,d23, _
						d22,d21,d31,d32,d33)
			For n=0 To daysList.Size-1
				bbd(daysList.Get(n)-1).Color = Colors.ARGB(255, 115, 200, 155)
			Next
		End If
		
		contractPanel.Tag = CurrentContract
	Else
		contractPanel.Visible = False
		WareHousePanel.Visible = False
	End If
	Record.Close
End Sub

Sub UpdateEntityForm(Tagcode As String)
	Dim SQL As String = DBStructures.SQL_CURRENT_ENTITIES
	If (Tagcode <> "") Then
		SQL = $"${SQL} where a.tagcode='${Tagcode}'"$
		Private Record As Cursor
		Record = Starter.LocalSQL.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			CreateEntityDetailsData(True, Record)
		Else
			Record.Close
		End If
	End If

End Sub

Sub CreateEntityDetailsData(clear As Boolean, Record As Cursor)
	If clear Then
		EntityListView.Clear
	End If
	Dim idx As Int = EntityListView.Size
	If idx >0 Then idx = idx-1
	
	MakeAddressesFolder(idx, Record, "Moradas")
	idx = idx + 1
	
	Dim sSQL As String = $"${DBStructures.SQL_CURRENT_CONTACTS}  where a.tagcode in (select contact from contacts2entities where entity='${CurrentEntityTagcode}')"$
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	Private rContact As Cursor
	rContact = Starter.LocalSQL.ExecQuery(sSQL)
	If rContact.RowCount > 0 Then
		id.ExpandedHeight = 50dip + (rContact.RowCount * 200dip)
		Dim chapter1 As B4XView = CreateChapter(Colors.Gray, "Contactos", id, idx, False)
		idx = idx + 1
		
		For i=0 To rContact.RowCount-1
			rContact.Position = i
			MakeContactsFolder(idx, chapter1, rContact, id, (i*200dip))
		Next
	Else
		id.ExpandedHeight = 50dip
		Dim chapter1 As B4XView = CreateChapter(Colors.Gray, "Contactos", id, idx, False)
		idx = idx + 1
	End If
	rContact.Close
	EntityListView.Add(chapter1, id)

	MakePropertiesFolder(idx, Record, "Campos adicionais")
	idx = idx + 1
	
	Record.Close
End Sub

Sub MakeContactsFolder(idx As Int, chapter1 As B4XView, Record As Cursor, id As ItemData, top As Int)
	
	Dim p1 As Panel
	p1.Initialize("GroupLineClick")
	Activity.AddView(p1, 0, 0, 100%x, 200dip)
	p1.LoadLayout("ItemEntityContact")
	p1.RemoveView
	p1.Tag = idx
'	lblContactName.Text = Record.GetString("contact_name")
'	lblContactPhone.Text = Record.GetString("contact_phone")
'	lblContactEmail.Text = ""
'	lblTypeContact.Text = "Primário"
	lblContactName.Text = Record.GetString("name")
	lblContactPhone.Text = Record.GetString("phone")
	lblContactEmail.Text = Record.GetString("email")
	lblTypeContact.Text = Record.GetString("typedesc")
	
	butContactEdit.Tag = Record.GetString("tagcode")
	pnlGroupExpanded.AddView(p1, 0, top, p1.Width, 200dip)
	
End Sub

Sub MakeAddressesFolder(idx As Int, Record As Cursor, title As String)
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	id.ExpandedHeight = 50dip + 225dip
	Dim chapter As B4XView = CreateChapter(Colors.Gray, title, id, idx, False)
	Dim p As Panel
	p.Initialize("GroupLineClick")
	Activity.AddView(p, 0, 0, 100%x, 275dip)
	p.LoadLayout("ItemEntityAddress")
	p.RemoveView
	p.Tag = idx
	lblAddressName.Text = Record.GetString("address")
	lblAddressName2.Text = Record.GetString("address2")
	lblAddressPostalCode.Text = Record.GetString("postal_code")
	lblAddressCity.Text = Record.GetString("city")
	lblAddressLatitude.Text = Record.GetString("latitude")
	lblAddressLongitude.Text = Record.GetString("longitude")
	lblAddressType.Text = "Sede/Facturação"
	butAddressEdit.Tag = Record.GetString("local")
	butAddressMap.Tag = Record.GetString("local")
	pnlGroupExpanded.AddView(p, 0, 0, 100%x, 225dip)
	
	EntityListView.Add(chapter, id)
	ExpandItem(idx)
	
End Sub

Sub MakePropertiesFolder(idx As Int, Record As Cursor, title As String)
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	
	Private Record2 As Cursor
	Dim tgEntity As String = Record.GetString("tagcode")
	Dim SQL As String = $"${DBStructures.SQL_CURRENT_ENTITY_PROPERTIES} where entity='${tgEntity}'"$
	Record2 = Starter.LocalSQL.ExecQuery(SQL)
	If Record2.RowCount > 0 Then
		Dim row As Int = 0
		id.ExpandedHeight = 50dip + (60dip * Record2.RowCount)
		Dim chapter As B4XView = CreateChapter(Colors.Gray, title, id, idx, False)
		
		For i=0 To Record2.RowCount-1
			Record2.Position = row
			
			Dim p As Panel
			p.Initialize("GroupLineClick")
			Activity.AddView(p, 0, 0, 100%x, id.ExpandedHeight)
			p.LoadLayout("ItemEntityProperties")
			p.RemoveView
			p.Tag = idx
			lblPropertyValue.Text = Record2.GetString("value")
			lblPropertyName.Text = Record2.GetString("title")
			lblPropertyName.tag = Record2.GetString("entity") 		'Referência da Entidade
			butPropertyEdit.tag = Record2.GetString("property")		'Referência do campo
			
			pnlGroupExpanded.AddView(p, 0, ((i+1)*60dip)-60dip, 100%x, 60dip)
			row = row +1
		Next
	Else
		Dim chapter As B4XView = CreateChapter(Colors.Gray, title, id, idx, False)
	End If
	Record2.Close
	
	EntityListView.Add(chapter, id)
End Sub

Sub CreateChapter(clr As Int, Title As String, id As ItemData, idx As Int, Expanded As Boolean) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, EntityListView.AsView.Width, id.ExpandedHeight)
	p.LoadLayout("ListCollapseGroup")
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblGroupTitle.Text = Title
	lblGroupTitle.Tag = idx
	pnlGroupTitle.Tag = idx
	p.Tag = Expanded 'collapsed
	Return p
End Sub

Sub GroupLineClick_Click
	Log("Clicked")
End Sub

Sub listsButtonClose_Click
	CallSubDelayed2(Entities, "EditReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listsButtonAdd_Click
	
End Sub

Sub ButtonUserUnavailable_Click
	
End Sub

Sub ButtonAddEntityContact_Click
	
End Sub

Sub thisAddressEdit_Click
	Dim b As Button = Sender
	CurrentAddressTagcode = b.Tag
	
	Private Row As Int = 0
	Private Record As Cursor
	Record = Starter.LocalSQL.ExecQuery($"select a.*, b.localtype from locals as a inner join locals2entities as b on (b.locality=a.tagcode) where a.tagcode='${CurrentAddressTagcode}' and b.entity='${CurrentEntityTagcode}'"$)
	If Record.RowCount > 0 Then
		Record.Position = Row
		Dim Curr As Address = Types.MakeAddress(Record.GetInt("localtype"), Record.GetString("address"), Record.GetString("address2"), _
			Record.GetString("postal_code"), Record.GetString("city"), Record.GetString("latitude"), Record.GetString("longitude"), False)
	Else
		Dim Curr As Address = Types.MakeAddress(1, "", "", "", "", "", "", False)
	End If
	Record.Close

	Dim ChangeAddress As AppDialogs
	ChangeAddress.Initialize
	ChangeAddress.GetAddressDialog("EntityEdit", Curr, TypeAddressList, False)
	'
End Sub

Sub ThisGeoReferenceEdit_Click
	Dim b As Button = Sender
	CurrentAddressTagcode = b.Tag
	
	Private Row As Int = 0
	Private Record As Cursor
	Record = Starter.LocalSQL.ExecQuery($"select a.*, b.localtype from locals as a inner join locals2entities as b on (b.locality=a.tagcode) where a.tagcode='${CurrentAddressTagcode}' and b.entity='${CurrentEntityTagcode}'"$)
	If Record.RowCount > 0 Then
		Record.Position = Row
		Dim Curr As GeoReference = Types.MakeGeoReference(Record.GetString("latitude"), Record.GetString("longitude"), False)
	Else
		Dim Curr As GeoReference = Types.MakeGeoReference("", "", False)
	End If
	Record.Close

	Dim ChangeAddress As AppDialogs
	ChangeAddress.Initialize
	ChangeAddress.GetGeoReferenceDialog("EntityEdit", Curr, False)
End Sub

Sub ThisContactEdit_Click
	Dim b As Button = Sender
	CurrentContactTagcode = b.Tag  '
	
	Private Row As Int = 0
	Private Record As Cursor
	Record = Starter.LocalSQL.ExecQuery($"select a.type, a.ascbus, a.tagcode, a.name, a.title, a.phone, a.email from contacts as a where a.tagcode='${CurrentContactTagcode}'"$)
	If Record.RowCount > 0 Then
		Record.Position = Row
		Dim Curr As ContactRecord = Types.MakeContact(Record.GetInt("type"), Record.GetString("name"), Record.GetString("phone"), _
			Record.GetString("email"), Record.GetString("title"), Record.GetString("tagcode"), False)
	Else
		Dim Curr As ContactRecord = Types.MakeContact(1, "", "", "", "", "", False)
	End If
	Record.Close

	Dim ChangeAddress As AppDialogs
	ChangeAddress.Initialize
	ChangeAddress.GetContactDialog("EntityEdit", Curr, TypeContactsList, False)
	
End Sub

Sub ThisPropertyEdit_Click
	Dim b As Button = Sender
	Dim p As Panel = b.Parent
	Dim lv As Label = p.GetView(0)
	Dim lt As Label = p.GetView(1)
	
	Dim ChangeProperty As AppDialogs
	ChangeProperty.Initialize
	ChangeProperty.GetPropertyDialog("EntityEdit", lt.text, lv.text, b.tag, False)
End Sub

Sub GroupCollpseExpand_Click
	Dim p As B4XView = EntityListView.GetPanel(CurrentGroupItem)
	If p.Tag = True Then
		CollapseItem(CurrentGroupItem)
	Else
		ExpandItem(CurrentGroupItem)
	End If
End Sub

Sub CollapseItem(index As Int)
	Dim id As ItemData = EntityListView.GetValue(index)
	EntityListView.ResizeItem(index, id.CollapsedHeight)
	EntityListView.GetPanel(index).Tag = False
	'AnimatedArrow(index, 180, 0)
	
	If (pnlGroupCurrenIndex <> index) Then
		EntityListView.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
		EntityListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		butGroupCollpseExpand.text = Types.EXPAND_ICON
		pnlGroupCurrenIndex = index
	Else
		butGroupCollpseExpand.text = Types.EXPAND_ICON
	End If
	
End Sub

Sub ExpandItem (index As Int)
	Dim id As ItemData = EntityListView.GetValue(index)
	EntityListView.ResizeItem(index, id.ExpandedHeight)
	EntityListView.GetPanel(index).Tag = True
	'AnimatedArrow(index, 0, 180)
	If (pnlGroupCurrenIndex <> index) Then
		EntityListView.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
		EntityListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		EntityListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
		pnlGroupCurrenIndex = index
	Else
		EntityListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
	End If
End Sub

Sub EntityListView_ItemClick (Index As Int, Value As Object)
	CurrentGroupItem = Index
	Log(CurrentGroupItem)
	
	Dim p As B4XView = EntityListView.GetPanel(CurrentGroupItem)
	If p.Tag = True Then
		CollapseItem(CurrentGroupItem)
	Else
		ExpandItem(CurrentGroupItem)
	End If
End Sub

Sub EntityWHItemsTaken_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub EntityWHItemsCheck_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub SetTheAddress(theAddress As Address)
	' CurrentAddressTagcode As String
	' CurrentEntityTagcode As String
	If (theAddress.asNew = False) Then
		DBStructures.UpdateAddress(CurrentEntityTagcode, CurrentAddressTagcode, theAddress)
	Else
		'Dim 
		CurrentAddressTagcode = "ADRSS_" & Utils.GetCurrDatetimeFormat("MMdd", "HHmmss", False)
		DBStructures.InsertAddress(CurrentEntityTagcode, CurrentAddressTagcode, theAddress)
	End If
	UpdateEntityForm(CurrentEntityTagcode)
End Sub

Sub SetTheGeoReference(theGeo As GeoReference)
	If (theGeo.asNew = False) Then
		DBStructures.UpdateAddressGeoReference(CurrentEntityTagcode, CurrentAddressTagcode, theGeo)
'	Else
'		'Dim
'		CurrentAddressTagcode = "ADRSS_" & Utils.GetCurrDatetimeFormat("MMdd", "HHmmss", False)
'		DBStructures.InsertAddress(CurrentEntityTagcode, CurrentAddressTagcode, theGeo)
	End If
	UpdateEntityForm(CurrentEntityTagcode)
End Sub

Sub SetTheContact(theContact As ContactRecord)
	If (theContact.asNew = False) Then
		DBStructures.UpdateContact(theContact)
'	Else
'		'Dim
'		CurrentAddressTagcode = "ADRSS_" & Utils.GetCurrDatetimeFormat("MMdd", "HHmmss", False)
'		DBStructures.InsertAddress(CurrentEntityTagcode, CurrentAddressTagcode, theGeo)
	End If
	UpdateEntityForm(CurrentEntityTagcode)
End Sub

Sub SetThePropertyInsert(property As String, value As String)
	DBStructures.InsertEntityProperty(CurrentEntityTagcode, property, value)
	UpdateEntityForm(CurrentEntityTagcode)
End Sub

Sub SetThePropertyUpdate(property As String, value As String)
	DBStructures.UpdateEntityProperty(CurrentEntityTagcode, property, value)
	UpdateEntityForm(CurrentEntityTagcode)
End Sub

'

Sub listObjects_ItemClick (Index As Int, Value As Object)
	Dim pnl As Panel = listObjects.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(1)
	listsLabelInfo.Text = $"${lbl.Text}"$
	CallSubDelayed3(ObjectEdit, "StartObjectActivityExt", pnl.tag, "EntityEdit")
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listButRefresh_Click
	
End Sub

Sub ListItemDocButton_Click
	Dim b As Label = Sender
	Dim FileName As String = b.tag
	Dim Continua As Boolean = True
	If Continua Then
		Dim theFile As String = Starter.SharedFolder &"/"& FileName
		Log(theFile)
		Dim Intent1 As Intent
		Intent1.Initialize(Intent1.ACTION_VIEW, "file://" & theFile) 
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

Sub mainLogo_Click
	Dim i As Int
	i = Msgbox2("Deseja voltar directamente para o início?", "Alerta!", "Sim", "Cancelar", "", Null)
	If (i=DialogResponse.POSITIVE) Then
		CallSubDelayed2(Main, "ListsReturn", "")
		Activity.Finish
		ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	End If
End Sub