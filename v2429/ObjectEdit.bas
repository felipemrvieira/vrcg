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
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Public Device As Phone
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
	' object DATA - object_generalView
	' **************************************************************
	Private objectListView As CustomListViewCollapse
	Private objectNotes As Label
'	Private objectWebsite As Label
'	Private objectEmail As Label
'	Private objectPhone As Label
	Private objectCode As Label
'	Private objectNif As Label
	Private objectType As Label
	Private objectTagcode As Label
	
	' **************************************************************
	' CONATCT DATA - ItemobjectContact
	' **************************************************************
	Private lblContactName As Label
	Private butContactEdit As Button
	Private lblTypeContact As Label
	Private lblContactEmail As Label
	Private lblContactPhone As Label
	
	' **************************************************************
	' ADDRESS DATA  - ItemobjectAddress
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
	' PROPERTIES DATA  - ItemobjectProperties
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
	Private CurrentGroupItemProp As Int = 0
	Private pnlGroupCurrenIndex As Int
	Private pnlGroupCurrenPropIndex As Int
	
	' **************************************************************
	' CONTRACTS DATA  - object_contractView
	' **************************************************************
	Private objectContractName As Label
	Private objectContractStart As Label
	Private objectContractEnd As Label
	Private objectContractDaysPeriod As Label
	Private objectContractDuration As Label
	Private objectContractDaysNotice As Label
	Private w0,w1,w2,w3,w4,w5,w6,w7 As Button
	Private d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15 As Button
	Private d16,d17,d18,d19,d20,d30,d29,d28,d27,d26,d25,d24,d23 As Button
	Private d22,d21,d31,d32,d33 As Button
	Private contractPanel As Panel
	Private TypePeriodicity As List
	Private TypeDayPeriod As List
	
	' **************************************************************
	' CONTRACTS DATA TASKS  - ItemobjectContractTasks
	' **************************************************************
	Private butContractTask As Button
	Private lblContractTask As Label
	Private objectContractHourPeriod As Label
	Private objectContractHours As Label
	Private objectContractPeriod As Label
	
	'objectWHItemsCheck
	'objectWHItemsTaken
	Private objectWHName As Label
	Private objectWHItemsCheck As CustomListViewCollapse
	Private objectWHItemsTaken As CustomListViewCollapse
	
	
	Private CurrentAddressTagcode As String
	Private CurrentobjectTagcode As String
	Private TypeAddressList As List
	Private CurrentContactTagcode As String
	Private TypeContactsList As List
	
	' **************************************************************
	' OBJECTS DATA
	' **************************************************************
	Private listObjects As CustomListView
	
	Private ListItemReference As Label
	'Private ListItemObject As Label
'	Private ListItemStatusPanel As Panel
	Private ListItemLocation As Label
	
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
	Private ListItemFullName As Label
	Private objectPropertyListView As CustomListViewCollapse
	Private pnlGroupTitle2 As Panel
	Private lblGroupTitle2 As Label
	Private butGroupCollpseExpand2 As Button
	Private pnlGroupExpanded2 As Panel
	Private butGroupCollpseExpandProp As Button
	Private lblGroupTitleProp As Label
	Private pnlCurrentProp As Panel
	Private pnlGroupExpandedProp As Panel
	Private pnlGroupTitleProp As Panel
	
	Private ThisObjectType As ObjectType
	Private ListItemType As Label
	Private ListItemTodayRequests As Label
	Private listButMap As Button
	Private ObjRequests, ObjRequestsNotToday As List
	Private ColorTabPanel As Panel
	Private mainActiveUser As Label
	Private mainLogo As ImageView
	
	Private objectsListViewPanel As Panel
	Private objectsDocumentsViewPanel As Panel
	Private objectDocumentsViewPanel As Panel
		
	Private MenuPanelButtonOne As Button
	Private MenuPanelButtomTwo As Button
	Private MenuPanelButtonThree As Button
	Private MenuPanelButtonFour As Button
	Private MenuPanelButtonList As List
	Private MenuPanelPagesTitle As List
	
	Private ButtonOneLayoutIndex As Int
	Private ButtonOneLayoutTwo As Int
	Private ButtonOneLayoutThree As Int
	Private ButtonOneLayoutFour As Int
	Private ObjectEditSelectedName As String
	private ObjectParent as String
	
	Private Panel1 As Panel
	Private MenuPanel As Panel
	Private ShowImage As ImageView
	Private ImageFilename As Label
	Private ImageStateName As Label
	
	Private LabelObjDocsDescritivo As Label
	Private LabelObjDocsValidade As Label
	Private labelTypeObjectFilter As Label
	Private LabelObjVVDescritivo As Label
	Private LabelObjVVValidade As Label
	Private LabelObjVVAccao As Label
	Private objGV2LabelTipoObj As Label
	Private objGV2LabelCodInterno As Label
	Private objGV2LabelObs As Label
	Private objGV2LabelRef As Label
	' **************************************************************
	' ITEM ADDRESS
	' **************************************************************
	Private ItemAddress_TipoMorada As Label
	Private ItemAddress_Endereco As Label
	Private ItemAddress_Continua As Label
	Private ItemAddress_CPostal As Label
	Private ItemAddress_Latitude As Label
	Private ItemAddress_Longitude As Label
	Private ItemAddress_Localidade As Label
	Private objGV2LabelRelacao As Label
	Private ObjParent As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)		
		Activity.LoadLayout("phone_object_editlayout")
		MenuPanelButtonList.Initialize
		MenuPanelButtonList.Add(MenuPanelButtonOne)
		MenuPanelButtonList.Add(MenuPanelButtomTwo)
		MenuPanelButtonList.Add(MenuPanelButtonThree)
		MenuPanelButtonList.Add(MenuPanelButtonFour)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
		Activity.LoadLayout("object_editLayout")
	End If
	
	MenuPanelPagesTitle.Initialize

	
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
		
	Starter.CurrentWorkActivity = Me
	TypeAddressList.Initialize
	TypeAddressList = DBStructures.GetListOfAddresseTypesEVC 'GetListOfAddresseTypes
	TypeContactsList.Initialize
	TypeContactsList = DBStructures.GetListOfContactTypesEVC 'GetListOfContactTypes
	TypePeriodicity.Initialize
	TypePeriodicity = DBStructures.GetListOfPeriodicityTypesEVC 'GetListOfPeriodicityTypes
	TypeDayPeriod.Initialize
	TypeDayPeriod = DBStructures.GetListOfDayPeriodTypesEVC 'GetListOfDayPeriodTypes
	
	Dim where As String = $"select distinct b.object from requests as a inner join requests_objects as b on (b.tagcode=a.tagcode) where a.request_date='${ShareCode.CURRENT_APPDATE}'"$
	ObjRequests = DBStructures.GetListOfFromScript("object", where)
	
	Dim s As String = Utils.StrList2SQLArray(ObjRequests)
	Dim where As String = $"Select distinct b.object from requests As a inner join requests_objects As b on (b.tagcode=a.tagcode)
							where a.request_date<>'${ShareCode.CURRENT_APPDATE}' and b.object not in ${s}"$
	ObjRequestsNotToday = DBStructures.GetListOfFromScript("object", where)
	  
	UpdateMainLayout
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
'	If (ShareCode.ISPHONE ) Then
'		Panel1.Visible = False
'		MenuPanel.Visible = True
'	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		If(ShareCode.ISPHONE) Then
			Return PhoneBackButtonTab
		End If
		listsButtonClose_Click
	End If
	Return True
End Sub

Sub PhoneBackButtonTab As Boolean
	If(ShareCode.ISPHONE) Then
		If (MenuPanel.Visible = False) Then
			Panel1.Visible = False
			MenuPanel.Visible = True
			mainLabelOptLists.Text = ObjectEditSelectedName
			Return True
		End If
	End If
	Return False
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
	SetupMobileButtons
	LabelVersion.Text = ShareCode.APP_VersionNocodeName
	LabelCopyright.Text = ShareCode.APP_EntityBrand  '"X-Evolution,Lda"
	mainActiveUser.Text = ShareCode.SESS_OPER_UserName
	If Not(ShareCode.ISPHONE) Then
		mainLogo.Gravity = Gravity.FILL
		mainLogo.Width = Consts.LogoWidth
	End If
	Log($"Inicialização de BMP: ${ShareCode.APP_MAIN_LOGO_MINI}"$)
	If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then
		mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO_MINI))
	End If
	
'	ButtonAppNetwork.Enabled = False
'	ButtonAppNetwork.TextColor = Consts.ColorLightSilver
'	If (ShareCode.APP_WORKING_LOCAL) Then
'		ButtonAppNetwork.Enabled = True
'		ButtonAppNetwork.TextColor = Consts.ColorRedOrange
'	End If
'	
'	ButtonUserUnavailable.Enabled = False
'	ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
'	If (ShareCode.USR_STATE = 0) Then
'		ButtonUserUnavailable.Enabled = True
'		ButtonUserUnavailable.TextColor = Consts.ColorRedOrange
'	End If
'	
'	ButtonActionPause.Enabled = False
'	ButtonActionPause.TextColor = Consts.ColorLightSilver
'	If (ShareCode.CLA_STATE >= 1) Then
'		ButtonActionPause.Enabled = True
'		ButtonActionPause.TextColor = Consts.ColorRedOrange
'	End If
'	listsLabelInfo.Text = $"${CurrentLineItem} / ${TotalLineItems}"$
End Sub

Sub CreateObjectTABS(tObj As ObjectType)
	
	Dim Counter As Int = 2
	listsTabPanel.LoadLayout("object_generalView2", ShareCode.ObjLayoutsGeral)
	MenuPanelPagesTitle.Add("Geral")
	If tObj.isgroup = 1 Then
		Counter = Counter+1
		listsTabPanel.LoadLayout("objects_listview", ShareCode.ObjLayoutsRelacoes)
		Utils.SetViewBackgroundColorToMainColor(objectsListViewPanel)
		MenuPanelPagesTitle.Add("Relações")
	End If
	
	objGV2LabelTipoObj.Text = ShareCode.checklistLabelTipoObjecto
	objGV2LabelCodInterno.Text = ShareCode.checklistLabelCodigoInternObjecto
	objGV2LabelObs.Text = ShareCode.checklistlFinalObsHint
	objGV2LabelRef.text = ShareCode.checklistLabelReferenciaObjecto
	objGV2LabelRelacao.Text = "Relacao"
	
	
	
	'
	
'	If tObj.have_contracts = 1 Then
'		Counter = Counter+1
'		listsTabPanel.LoadLayout("object_contractView2", "Contrato")
'	End If
'	If tObj.have_warehouse = 1 Then
'		Counter = Counter+1
'		listsTabPanel.LoadLayout("object_warehouseView", "Armazém")
'	End If

	If tObj.have_documents = 1 Then
		Counter = Counter+1
		MenuPanelPagesTitle.Add("Documentos")
		If (Utils.isNullOrEmpty(tObj.doctemplate)) Then
			listsTabPanel.LoadLayout("object_documentsView", ShareCode.ObjLayoutsDocumentos)
			Utils.SetViewBackgroundColorToMainColor(objectsDocumentsViewPanel)
			LabelObjDocsDescritivo.Text = ShareCode.ObjLayoutDocsDescritivo
			LabelObjDocsValidade.text = ShareCode.ObjLayoutDocsvalidade
			labelTypeObjectFilter.Text = ShareCode.ObjLayoutDocsDataAlerta
			
		Else
			listsTabPanel.LoadLayout("object_documentsViewValidate", ShareCode.ObjLayoutsDocumentos)
			Utils.SetViewBackgroundColorToMainColor(objectDocumentsViewPanel)
			LabelObjVVDescritivo.Text = ShareCode.ObjLayoutDocsDescritivo
			LabelObjVVValidade.Text = ShareCode.ObjLayoutDocsvalidade
			LabelObjVVAccao.Text = ShareCode.ObjLayoutDocsDataAlerta
			labelTypeObjectFilter.Text = ShareCode.ObjLayoutDocsDataAlerta
		End If
	End If
	
	listsTabPanel.LoadLayout("listviewlayout", ShareCode.ObjLayoutsIntervencoes)
	MenuPanelPagesTitle.Add("Intervenções")
	
	
	If Not(ShareCode.ISPHONE) Then
		For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
			lbl.Width = 100%x / Counter
		Next
	End If
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)

End Sub

Sub SetupMobileButtons

	If(ShareCode.ISPHONE) Then
	
		For i = 0 To MenuPanelPagesTitle.Size-1
		Dim Button As Button = MenuPanelButtonList.Get(i)
			Button.Text = MenuPanelPagesTitle.Get(i)
		Next

		
		If(MenuPanelPagesTitle.Size > 3) Then
			MenuPanelButtonThree.Visible = True
			MenuPanelButtonFour.Visible = True
		Else If(MenuPanelPagesTitle.Size > 2) Then
			MenuPanelButtonThree.Visible = True
		Else
			MenuPanelButtonThree.Visible = False
			MenuPanelButtonFour.Visible = False
		End If
		Panel1.Visible = False
		MenuPanel.Visible = True
		MenuPanelButtonOne.Color = Consts.ColorMain
		MenuPanelButtomTwo.Color = Consts.ColorMain
		MenuPanelButtonThree.Color  = Consts.ColorMain
		MenuPanelButtonFour.Color  = Consts.ColorMain
	End If

End Sub



Sub StartObjectActivity(Tagcode As String)

	Dim SQL As String = DBStructures.EVC_SQL_CURRENT_OBJECTS 'SQL_CURRENT_OBJECTS
	If (Tagcode <> "") Then
		SQL = $"${SQL} where a.tagcode='${Tagcode}'"$
		Log(SQL)
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			
			ThisObjectType = DBStructures.getDBObjectTypeEVC(Record.GetString("type_tagcode")) 'As ObjectType
			CreateObjectTABS(ThisObjectType)
			Dim obTagCode As String = Record.GetString("tagcode")
			objectType.text = Record.GetString("typedesc")
			'objectCode.text = Record.GetString("id")
			objectCode.Text = Record.GetString("reference")
			objectNotes.text = Record.GetString("notes")
			mainLabelOptLists.text = Record.GetString("name")
			ObjectEditSelectedName = Record.GetString("name")
			ObjectParent = Record.GetString("parent")
			objectTagcode.text = ObjectEditSelectedName
			CurrentobjectTagcode = obTagCode.Trim 'objectTagcode.text
			
			Dim ParentName As String = DBStructures.GetScriptColumnStrEVC($"select title_import from dta_objects where 1=1
																	and tagcode = '${ObjectParent}'"$, "title_import")
		
			If Utils.NNE(ParentName) Then
				ObjParent.Text = ParentName
			Else
				ObjParent.Text = ""
			End If
		
			CreateobjectDetailsData(False, Record)
			CreateobjectDetailsDataProp(0, False, Tagcode)
			
			If ThisObjectType.isgroup = 1 Then
				CreateObjectsFromObject(True, $"a.parent_tagcode='${CurrentobjectTagcode}'"$)
			End If
			
'			If ThisObjectType.have_contracts = 1 Then
'				CreateContractFromobject(False, $"b.object='${CurrentobjectTagcode}'"$)
'			End If
'			
'			If ThisObjectType.have_warehouse = 1 Then
'				'
'			End If

			If ThisObjectType.have_documents = 1 Then
				CreateDocumentsFromobject(False, CurrentobjectTagcode)
			End If
		
		Else
			Record.Close
			MsgboxAsync( "Não foi encontrado qualquer registo em BD com o código interno do objecto seleccionado. Actualize os dados do Tablet e tente novamente.", "Alerta!")
			listsButtonClose_Click
		End If
	Else
		MsgboxAsync( "Não foi identificado o código interno do objecto seleccionado. Actualize os dados do Tablet e tente novamente.", "Alerta!")
		listsButtonClose_Click
	End If
	WindowStatusUpdate
End Sub

Sub CreateDocumentsFromobject(Clear As Boolean, Filter As String)
	If Clear Then
		listDocuments.Clear
	End If
	
	Dim height As Int = 70dip
	If(ShareCode.ISPHONE) Then
		height = 135dip
	End If
	Private Record As Cursor
	Dim ItemsCounter As Int = 0
	'Dim SQL As String = $"${ DBStructures.SQL_ALL_DOCUMENTS} where a.relation_tagcode='${Filter}'"$
	'Dim SQL As String = $"${ DBStructures.EVC_SQL_ALL_DOCUMENTS} where a.tagcode in (Select document from dta_documents2objects where object='${Filter}')"$
	'**********************************************************************
	' ALTERAÇÃO PC
	' O SCRIPT ORIGINAL ESTAVA A INCLUIR TABELAS INEXISTENTES, OU VAZIAS,
	' POR ISSO NUNCA TRAZIA OS DADOS DO DOCUMENTO
	' SUBSTITUIDA A dta_documentos2objects PELA dta_objects_documents
	' E RETIRADA DO SCRIPT A type_documenttypes
	' EFECTUADA RELACAO ENTRE dta_objects / dta_objects_documents / dta_documents
	'**********************************************************************
	
	Dim SQL As String = $"${ DBStructures.EVC_SQL_OBJ_DOCUMENTS}  WHERE o.tagcode='${Filter}'"$
	
	SQL = $"${SQL} order by a.title"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Log("Docs:" & Record.RowCount)
		For Row = 0 To Record.RowCount-1
			ItemsCounter = ItemsCounter + 1
			Record.Position = Row
			listDocuments.Add( CreateDocumentListItem(ItemsCounter, Record, listDocuments.AsView.Width, height), "") ', height, "" )
		Next
	Else
		listDocuments.Add( CreateNoRecordListItem(ItemsCounter, Null, listDocuments.AsView.Width, height + 5dip), "") ', height + 5dip, "" )
	End If
	Record.Close
End Sub

Sub CreateDocumentListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	If (Utils.isNullOrEmpty(ThisObjectType.doctemplate)) Then
		p.LoadLayout("ListItemDocument")
	Else
		p.LoadLayout("ListItemDocumentValidate")
	End If
	p.RemoveView
	
	Dim tagcode As String = colitems.GetString("tagcode")
	ListItemTitle.Text = colitems.GetString("title")
	ListItemCategory.Text = ""'colitems.GetString("categorytitle")
	ListItemSDate.Text = Utils.IfNullOrEmpty(colitems.GetString("valid_from"), "----------")
	ListItemEDate.Text = Utils.IfNullOrEmpty(colitems.GetString("valid_to"), "----------")
	'ListItemDocButton.Tag = colitems.GetString("docfilename")
	ListItemDocButton.Tag = colitems.GetString("doc_filename")
	ListItemTitle.Tag = colitems.GetString("doc_filename")
	
	Dim File2setExt As String = ListItemDocButton.Tag
	If File2setExt.EndsWith("pdf") Then
		ListItemDocButton.text = Chr(0xF1C1)
	else if File2setExt.EndsWith ("xls") Or File2setExt.EndsWith ("xlsx") Then
		ListItemDocButton.Text = Chr(0xF1C3)
	Else If File2setExt.EndsWith ("doc") Or File2setExt.EndsWith ("docx") Then
		ListItemDocButton.Text = Chr(0xF1C2)
	Else If File2setExt.EndsWith ("jpg") Or File2setExt.EndsWith ("png") Then
		ListItemDocButton.Text = Chr(0xF1C5)
	Else
		ListItemDocButton.Text = Chr(0xF016)
	End If
	
	p.Tag = tagcode
	Return p
End Sub

Sub CreateNoRecordListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("ItemNORecords")
	p.RemoveView
	listButRefresh.Tag = CurrentobjectTagcode
	Return p
End Sub

Sub CreateObjectsFromObject(Clear As Boolean, Filter As String)
	If Clear Then
		listObjects.Clear
	End If
	
	Log(Filter)
	
	Dim height As Int = 85dip '65dip
	If(ShareCode.ISPHONE) Then
		height =  135dip
	End If
	Private Record As Cursor
	Dim ItemsCounter As Int = 0
	Dim SQL As String = DBStructures.EVC_SQL_CURRENT_OBJECTS
	If (Filter <> "") Then
		SQL = $"${SQL} where ${Filter}"$
	End If
	SQL = $"${SQL} order by a.title_import"$
	Log(SQL)
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		For Row = 0 To Record.RowCount-1
			ItemsCounter = ItemsCounter + 1
			Record.Position = Row
			listObjects.Add( CreateObjListItem(ItemsCounter, Record, listObjects.AsView.Width, height), "") ', height, "" )
		Next
	Else
		listObjects.Add( CreateNoRecordListItem(ItemsCounter, Record, listObjects.AsView.Width, height + 5dip), "") ', height + 5dip, "" )
	End If
	Record.Close
End Sub

Sub CreateObjListItem(cnt As Int, colitems As Cursor, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("objects_itemView")
	p.RemoveView
	
	Dim status_desc As String = colitems.GetString("status_desc")
'	Dim status_color As String = colitems.GetString("status_color")
	Dim tagcode As String = colitems.GetString("tagcode")
	Dim latitude As String = colitems.GetString("latitude")
	Dim longitude As String = colitems.GetString("longitude")
	Dim status_id As Int = colitems.GetInt("status_id")
	Dim name As String = colitems.GetString("name")
	Dim parent As String = colitems.GetString("parent")
	Dim parent_name As String = colitems.GetString("parent_name")
	Dim address As String = colitems.GetString("address")
	Dim postalcode As String = colitems.GetString("postal_code")
	Dim typedesc As String = colitems.GetString("typedesc")
	Dim city As String = colitems.GetString("city")
	ListItemFullName.text = $"#${cnt} - ${name}"$
	Dim stat As String = $"${status_desc}"$
	ListItemReference.text = $"${tagcode} - ${stat}"$
	ListItemReference.Tag = tagcode
	ListItemLocation.text = $"${address}, ${postalcode} ${city}, ${latitude}|${longitude}"$
	ListItemType.text = typedesc
	
	listButMap.Enabled = False
	listButMap.TextColor = Consts.ColorLightSilver
	'ListItemFullName.text = $"${parent_name}"$
	ListItemFullName.Tag = parent
'	ListItemStatusPanel.Color = Utils.ColorString(status_color)
'	ListItemStatusPanel.Tag = status_id

	If (status_id = 0) Then
		ListItemTodayRequests.TextColor = Consts.ColorGray
		ListItemTodayRequests.Text = Chr(0xF088)
	Else
		'ObjRequests, ObjRequestsNotToday
		If (ObjRequests.IndexOf(tagcode) >= 0) Then
			ListItemTodayRequests.TextColor = Consts.ColorGreen
			ListItemTodayRequests.Text = Chr(0xF017)
		Else
			If (ObjRequestsNotToday.IndexOf(tagcode) >= 0) Then
				ListItemTodayRequests.TextColor = Consts.ColorBlue
				ListItemTodayRequests.Text = Chr(0xF073)
			Else
				ListItemTodayRequests.Visible = False
			End If
		End If
	End If
	
	p.Tag = tagcode

	Return p
End Sub

Sub CreateContractFromobject(Clear As Boolean, Filter As String)
	Private Record As Cursor
	Dim SQL As String = DBStructures.SQL_ALL_OBJECT_CONTRACTS
	If (Filter <> "") Then
		SQL = $"${SQL} where ${Filter}"$
	End If
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim CurrentContract As String = Record.GetString("tagcode")
		
'		a.id, a.ascbus, a.tagcode, a.title, a.status_id, a.status_desc, a.status_color, a.document_tagcode, a.docfilename, a.creation_date, a.valid_from,
'		a.valid_to, a.duration, a.confirmdays, a.periodicity, a.periodvisits, a.hourspervisit, a.dayperiod,
'		a.last_visit, a.daysweekvisit, a.daismonthvisit, a.intervention_type
		
		objectContractName.Text = Record.GetString("title")
		objectContractStart.text = Record.GetString("valid_from")
		objectContractEnd.text = Record.GetString("valid_to")
		
		objectContractDaysPeriod.text = Record.GetInt("periodvisits")
		objectContractDuration.text = Record.GetInt("duration")
		objectContractDaysNotice.text = Record.GetInt("confirmdays")
		
		objectContractPeriod.text = TypePeriodicity.Get( Record.GetInt("periodicity") )
		objectContractHours.text = Record.GetInt("hourspervisit")
		objectContractHourPeriod.text = TypeDayPeriod.Get( Record.GetInt("dayperiod") )
		
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
		If (contractPanel.IsInitialized) Then  contractPanel.Visible = False
		If (WareHousePanel.IsInitialized) Then  WareHousePanel.Visible = False
	End If
	Record.Close
End Sub

Sub UpdateobjectForm(Tagcode As String)
	Dim SQL As String = DBStructures.SQL_CURRENT_OBJECTS
	If (Tagcode <> "") Then
		SQL = $"${SQL} where a.tagcode='${Tagcode}'"$
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			CreateobjectDetailsData(True, Record)
			CreateobjectDetailsDataProp(0, True, Tagcode) 'Record)
		Else
			Record.Close
		End If
	End If

End Sub
'
Sub CreateobjectDetailsData(clear As Boolean, Record As Cursor) As Int
	If clear Then
		objectListView.Clear
	End If
	Dim idx As Int = objectListView.Size
	If idx >0 Then idx = idx-1
	
	MakeAddressesFolder(idx, Record, "Moradas")
	idx = idx + 1
	
	Dim sSQL As String = $"${DBStructures.EVC_SQL_CURRENT_CONTACTS}  where a.tagcode in (select contact_tagcode from dta_objects_contacts where object_tagcode='${CurrentobjectTagcode}')"$
	Log(sSQL)
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	Private rContact As Cursor
	rContact = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If rContact.RowCount > 0 Then
		id.ExpandedHeight = 50dip + (rContact.RowCount * 200dip)
		Dim chapter1 As B4XView = CreateChapter(Colors.Gray, ShareCode.checklistDadosObjectoContactos, id, idx, objectListView.AsView.Width, False) ' Contactos
		idx = idx + 1
		
		For i=0 To rContact.RowCount-1
			rContact.Position = i
			MakeContactsFolder(idx, chapter1, rContact, id, (i*200dip))
		Next
	Else
		id.ExpandedHeight = 50dip
		Dim chapter1 As B4XView = CreateChapter(Colors.Gray, ShareCode.checklistDadosObjectoContactos, id, idx, objectListView.AsView.Width, False) 'Contactos
		idx = idx + 1
	End If
	rContact.Close
	objectListView.Add(chapter1, id)
'	ExpandItem(idx)
	ExpandItem(1)
'	MakePropertiesFolder(idx, Record, "Campos adicionais")
'	idx = idx + 1
	
	Record.Close
	Return idx
End Sub

Sub CreateobjectDetailsDataProp(idx As Int, clear As Boolean, Tagcode As String) 'Record As Cursor)
	'If clear Then
		objectPropertyListView.Clear
	'End If
	'Dim idx2 As Int = objectPropertyListView.Size
	'If ((idx2 >0) And (idx2 <> idx) And (idx>0)) Then idx = idx-1
	
	'objectPropertyListView.Add(chapter1, id)

	MakePropertiesFolder(idx, Tagcode, ShareCode.checklistDadosObjectoCamposObjecto) ' Campos do Objecto
	'idx = idx + 1
	
	'Record.Close
End Sub

Sub MakeContactsFolder(idx As Int, chapter1 As B4XView, Record As Cursor, id As ItemData, top As Int)
	
	Dim p1 As Panel
	p1.Initialize("GroupLineClick")
	Activity.AddView(p1, 0, 0, 100%x, 200dip)
	p1.LoadLayout("ItemContact")'3pontinhos objectos (contactos)
	p1.RemoveView
	p1.Tag = idx
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
	Dim chapter As B4XView = CreateChapter(Colors.Gray, title, id, idx, objectListView.AsView.Width, False)
	Dim p As Panel
	p.Initialize("GroupLineClick")
	Activity.AddView(p, 0, 0, 100%x, 275dip)
	p.LoadLayout("ItemAddress")'3pontinhos objectos (moradas)
	
	ItemAddress_TipoMorada.text = ShareCode.ItemAddressTipoMorada
	ItemAddress_Endereco.text = ShareCode.ItemAddressEndereco
	ItemAddress_Continua.text = ShareCode.ItemAddressContinua
	ItemAddress_CPostal.text = ShareCode.ItemAddressCPostal
	ItemAddress_Latitude.text = ShareCode.ItemAddressLatitude
	ItemAddress_Longitude.text = ShareCode.ItemAddressLongitude
	ItemAddress_Localidade.text = ShareCode.ItemAddressLocalidade
	
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
	
	objectListView.Add(chapter, id)
	ExpandItem(idx)
	
End Sub

'Sub MakePropertiesFolder(idx As Int, Record As Cursor, title As String)
Sub MakePropertiesFolder(idx As Int, tagcode As String, title As String)
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	Dim ExpandThis As Boolean = False
	
	Private Record2 As Cursor
	'Dim tgobject As String = Record.GetString("tagcode")
	Dim SQL As String = $"${DBStructures.EVC_QL_CURRENT_OBJECTS_PROPERTIES} and a.object_tagcode='${tagcode}'"$
	Log(SQL)
	Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record2.RowCount > 0 Then
		Dim row As Int = 0
		id.ExpandedHeight = 50dip + (60dip * Record2.RowCount)
		Dim chapter As B4XView = CreateChapterProp(Colors.Gray, title, id, idx, objectPropertyListView.AsView.Width, False)
		ExpandThis = True
		For i=0 To Record2.RowCount-1
			Record2.Position = row
			
			Dim p As Panel 
			p.Initialize( "GroupLineClickProp")
			Activity.AddView(p, 0, 0, 100%x, id.ExpandedHeight)
			p.LoadLayout("ItemProperty") '3pontinhos objectos (campos)
			p.RemoveView
			p.Tag = idx
			lblPropertyValue.Text = Record2.GetString("value")
			lblPropertyName.Text = Record2.GetString("title")
			lblPropertyName.tag = Record2.GetString("object_tagcode") 		'Referência da Entidade
			butPropertyEdit.tag = Record2.GetString("field_tagcode")		'Referência do campo
			Dim Height As Int = ((i+1)*60dip)-60dip
			pnlGroupExpandedProp.AddView(p, 0, Height, 100%x, 60dip)
			row = row +1
		Next
	Else
		id.ExpandedHeight = 50dip
		Dim chapter As B4XView = CreateChapterProp(Colors.Gray, title, id, idx, objectPropertyListView.AsView.Width, False)
	End If
	Record2.Close
	
	objectPropertyListView.Add(chapter, id)
	If ExpandThis Then ExpandItemProp(idx)
	
	'*************************************************
	' IMAGENS
	'*************************************************
	idx = idx+1
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	Dim ExpandThis As Boolean = False
	
	Private Record2 As Cursor
	'Dim tgobject As String = Record.GetString("tagcode")  object_tagcode='OBJECT_20191210_213812j4'
'	Dim SQL As String = $"${DBStructures.EVC_QL_CURRENT_OBJECTS_IMAGES} and a.object_tagcode='${tagcode}'"$
	
	Dim SQL As String = $"select 1 as child, object_tagcode as tagcode, image, filename, title, sess_user, created_at
						from dta_objects_images where object_tagcode='${tagcode}' and (filename is not null and filename<>'')
						union
						select 0 as child, tagcode, image, filename, title_import as title, '' as sess_user, created_at
						from dta_objects where tagcode='${tagcode}' and (filename is not null and filename<>'')
						order by child"$
	Log(SQL)
	Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record2.RowCount > 0 Then
		Dim row As Int = 0
		id.ExpandedHeight = 50dip + (130dip * Record2.RowCount)
		Dim chapter As B4XView = CreateChapterProp(Colors.Gray, "Galeria", id, idx, objectPropertyListView.AsView.Width, False)
		ExpandThis = True
		For i=0 To Record2.RowCount-1
			Record2.Position = i
			
			Dim p As Panel
			p.Initialize( "")
			Activity.AddView(p, 0, 0, 100%x, 130dip)
			p.LoadLayout("ItemImageGallery")
			p.RemoveView
			p.Tag = idx
			
			Dim Filename As String = Utils.IfNullOrEmpty(Record2.GetString("filename"), "")
			Dim btm As String = Utils.IfNullOrEmpty(Record2.GetString("image"), "")
			Dim created_at As String = Utils.IfNullOrEmpty(Record2.GetString("created_at"), "")
			Dim FileOK As Boolean = True
			
			If Utils.NNE(Filename) Then
				If File.Exists(Starter.InternalFolder, Filename) Then
					Try
						ShowImage.SetBackgroundImage(LoadBitmapSample(Starter.InternalFolder, Filename, ShowImage.Width, ShowImage.Height)) ' Utils.B64ToBitmap(btm))
						ShowImage.Tag = Types.MakeImageViewData(btm, Filename)
					Catch
						FileOK = False
					End Try
				End If
			Else
				FileOK = False
			End If
			
			If Not(FileOK) Then
				If Utils.NNE(btm) Then
					Try
						ShowImage.SetBackgroundImage(Utils.B64ToBitmap(btm))
						ShowImage.Tag = Types.MakeImageViewData(btm, Filename)
						FileOK = True
					Catch
						FileOK = False
					End Try
				Else
					FileOK = False
				End If
			End If
			
			If (FileOK) Then
				ImageFilename.Text = Filename
				ImageFilename.Tag = Filename
				ImageStateName.Text = created_at
				ImageStateName.Tag = tagcode
				Dim Height As Int = ((i+1)*130dip)-130dip
				pnlGroupExpandedProp.AddView(p, 0, Height, 100%x, 130dip)
				row = row +1
			End If
		Next
	Else
		id.ExpandedHeight = 50dip
		Dim chapter As B4XView = CreateChapterProp(Colors.Gray, "Galeria", id, idx, objectPropertyListView.AsView.Width, False)
	End If
	Record2.Close
	
	objectPropertyListView.Add(chapter, id)
	If ExpandThis Then ExpandItemProp(idx)
End Sub

Sub CreateChapter(clr As Int, Title As String, id As ItemData, idx As Int, width As Int, Expanded As Boolean) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, width, id.ExpandedHeight) 'objectListView.AsView.Width, id.ExpandedHeight)
	p.LoadLayout("ListCollapseGroup")
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblGroupTitle.Text = Title
	lblGroupTitle.Tag = idx
	pnlGroupTitle.Tag = idx
	butGroupCollpseExpand.Tag = idx
	p.Tag = Expanded 'collapsed
	Return p
End Sub

Sub CreateChapterProp(clr As Int, Title As String, id As ItemData, idx As Int, width As Int, Expanded As Boolean) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, width, id.ExpandedHeight) 'objectListView.AsView.Width, id.ExpandedHeight)
	
	p.LoadLayout("ListCollapseGroupProp")
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblGroupTitleProp.Text = Title
	lblGroupTitleProp.Tag = idx
	pnlGroupTitleProp.Tag = idx
	butGroupCollpseExpandProp.Tag = idx
	p.Tag = Expanded 'collapsed
	Return p
End Sub

Sub listsButtonClose_Click
	If (ShareCode.ISPHONE) Then
		If(PhoneBackButtonTab) Then
			Return
		End If
	End If
	
	CallSubDelayed2(Objects, "EditReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listsButtonAdd_Click
	
End Sub

Sub ButtonUserUnavailable_Click
	
End Sub

Sub ButtonAddobjectContact_Click
	
End Sub

Sub thisAddressEdit_Click
'	Dim b As Button = Sender
'	CurrentAddressTagcode = b.Tag
'	
'	Private Row As Int = 0
'	Private Record As Cursor
'	Record = Starter.LocalSQLEVC.ExecQuery($"select a.*, b.localtype from locals as a inner join locals2objects as b on (b.locality=a.tagcode) where a.tagcode='${CurrentAddressTagcode}' and b.object='${CurrentobjectTagcode}'"$)
'	If Record.RowCount > 0 Then
'		Record.Position = Row
'		Dim Curr As Address = Types.MakeAddress(Record.GetInt("localtype"), Record.GetString("address"), Record.GetString("address2"), _
'			Record.GetString("postal_code"), Record.GetString("city"), Record.GetString("latitude"), Record.GetString("longitude"), False)
'	Else
'		Dim Curr As Address = Types.MakeAddress(1, "", "", "", "", "", "", False)
'	End If
'	Record.Close
'
'	Dim ChangeAddress As AppDialogs
'	ChangeAddress.Initialize
'	ChangeAddress.GetAddressDialog("ObjectEdit", Curr, TypeAddressList, False)
	'
End Sub

Sub ThisGeoReferenceEdit_Click
'	Dim b As Button = Sender
'	CurrentAddressTagcode = b.Tag
'	
'	Private Row As Int = 0
'	Private Record As Cursor
'	Record = Starter.LocalSQLEVC.ExecQuery($"select a.*, b.localtype from locals as a inner join locals2objects as b on (b.locality=a.tagcode) where a.tagcode='${CurrentAddressTagcode}' and b.object='${CurrentobjectTagcode}'"$)
'	If Record.RowCount > 0 Then
'		Record.Position = Row
'		Dim Curr As GeoReference = Types.MakeGeoReference(Record.GetString("latitude"), Record.GetString("longitude"), False)
'	Else
'		Dim Curr As GeoReference = Types.MakeGeoReference("", "", False)
'	End If
'	Record.Close
'
'	Dim ChangeAddress As AppDialogs
'	ChangeAddress.Initialize
'	ChangeAddress.GetGeoReferenceDialog("ObjectEdit", Curr, False)
End Sub

Sub ThisContactEdit_Click
'	Dim b As Button = Sender
'	CurrentContactTagcode = b.Tag  '
'	
'	Private Row As Int = 0
'	Private Record As Cursor
'	Record = Starter.LocalSQLEVC.ExecQuery($"select a.type, a.ascbus, a.tagcode, a.name, a.title, a.phone, a.email from contacts as a where a.tagcode='${CurrentContactTagcode}'"$)
'	If Record.RowCount > 0 Then
'		Record.Position = Row
'		Dim Curr As ContactRecord = Types.MakeContact(Record.GetInt("type"), Record.GetString("name"), Record.GetString("phone"), _
'			Record.GetString("email"), Record.GetString("title"), Record.GetString("tagcode"), False)
'	Else
'		Dim Curr As ContactRecord = Types.MakeContact(1, "", "", "", "", "", False)
'	End If
'	Record.Close
'
'	Dim ChangeAddress As AppDialogs
'	ChangeAddress.Initialize
'	ChangeAddress.GetContactDialog("ObjectEdit", Curr, TypeContactsList, False)
	
End Sub

Sub ThisPropertyEdit_Click
	Dim b As Button = Sender
	Dim p As Panel = b.Parent
	Dim lv As Label = p.GetView(0)
	Dim lt As Label = p.GetView(1)
	
	Dim ChangeProperty As AppDialogs
	ChangeProperty.Initialize
	ChangeProperty.GetPropertyDialog("ObjectEdit", lt.text, lv.text, b.tag, False)
End Sub

Sub GroupCollpseExpand_Click
	Dim this As B4XView = Sender
	If (CurrentGroupItem <> this.Tag) Then CurrentGroupItem = this.tag
	Dim p As B4XView = objectListView.GetPanel(CurrentGroupItem)
	If p.Tag = True Then
		CollapseItem(CurrentGroupItem)
	Else
		ExpandItem(CurrentGroupItem)
	End If
End Sub

Sub CollapseItem(index As Int)
	Dim id As ItemData = objectListView.GetValue(index)
	objectListView.ResizeItem(index, id.CollapsedHeight)
	objectListView.GetPanel(index).Tag = False
	'AnimatedArrow(index, 180, 0)
	
	If (pnlGroupCurrenIndex <> index) Then
'		objectListView.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
'		objectListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		objectListView.GetPanel(index).GetView(0).GetView(1).Text = Types.EXPAND_ICON
		pnlGroupCurrenIndex = index
'	Else
'		butGroupCollpseExpand.text = Types.EXPAND_ICON
	End If
	
End Sub

Sub ExpandItem (index As Int)
	Dim id As ItemData = objectListView.GetValue(index)
	objectListView.ResizeItem(index, id.ExpandedHeight)
	objectListView.GetPanel(index).Tag = True
	'AnimatedArrow(index, 0, 180)
	If (pnlGroupCurrenIndex <> index) Then
'		objectListView.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
'		objectListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		objectListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
		pnlGroupCurrenIndex = index
'	Else
'		objectListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
	End If
End Sub

Sub CollapseItemProp(index As Int)
	Dim id As ItemData = objectPropertyListView.GetValue(index)
	objectPropertyListView.ResizeItem(index, id.CollapsedHeight)
	objectPropertyListView.GetPanel(index).Tag = False
	'AnimatedArrow(index, 180, 0)
	
	If (pnlGroupCurrenPropIndex <> index) Then
		objectPropertyListView.GetPanel(pnlGroupCurrenPropIndex).GetView(0).GetView(2).Color = Consts.NoColor
		objectPropertyListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		'butGroupCollpseExpandProp.text = Types.EXPAND_ICON
		objectPropertyListView.GetPanel(index).GetView(0).GetView(1).Text = Types.EXPAND_ICON
		pnlGroupCurrenPropIndex = index
	Else
		'butGroupCollpseExpandProp.text = Types.EXPAND_ICON
		objectPropertyListView.GetPanel(index).GetView(0).GetView(1).Text = Types.EXPAND_ICON
	End If
	
End Sub

Sub ExpandItemProp(index As Int)
	Dim id As ItemData = objectPropertyListView.GetValue(index)
	objectPropertyListView.ResizeItem(index, id.ExpandedHeight)
	objectPropertyListView.GetPanel(index).Tag = True
	'AnimatedArrow(index, 0, 180)
	If (pnlGroupCurrenPropIndex <> index) Then
		objectPropertyListView.GetPanel(pnlGroupCurrenPropIndex).GetView(0).GetView(2).Color = Consts.NoColor
		objectPropertyListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		objectPropertyListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
		pnlGroupCurrenPropIndex = index
	Else
		objectPropertyListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
	End If
End Sub


Sub objectListView_ItemClick (Index As Int, Value As Object)
	CurrentGroupItem = Index
	Log(CurrentGroupItem)
	
	Dim p As B4XView = objectListView.GetPanel(CurrentGroupItem)
	If p.Tag = True Then
		CollapseItem(CurrentGroupItem)
	Else
		ExpandItem(CurrentGroupItem)
	End If
End Sub

Sub objectListViewProp_ItemClick (Index As Int, Value As Object)
	CurrentGroupItemProp = Index
	Log(CurrentGroupItemProp)
	
	Dim p As B4XView = objectPropertyListView.GetPanel(CurrentGroupItemProp)
	If p.Tag = True Then
		CollapseItemProp(CurrentGroupItemProp)
	Else
		ExpandItemProp(CurrentGroupItemProp)
	End If
End Sub

Sub objectWHItemsTaken_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub objectWHItemsCheck_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub SetTheAddress(theAddress As Address)
	' CurrentAddressTagcode As String
	' CurrentobjectTagcode As String
	If (theAddress.asNew = False) Then
		DBStructures.UpdateAddress(CurrentobjectTagcode, CurrentAddressTagcode, theAddress)
	Else
		'Dim 
		CurrentAddressTagcode = "ADRSS_" & Utils.GetCurrDatetimeFormat("MMdd", "HHmmss", False)
		DBStructures.InsertAddress(CurrentobjectTagcode, CurrentAddressTagcode, theAddress)
	End If
	UpdateobjectForm(CurrentobjectTagcode)
End Sub

Sub SetTheGeoReference(theGeo As GeoReference)
	If (theGeo.asNew = False) Then
		DBStructures.UpdateAddressGeoReference(CurrentobjectTagcode, CurrentAddressTagcode, theGeo)
'	Else
'		'Dim
'		CurrentAddressTagcode = "ADRSS_" & Utils.GetCurrDatetimeFormat("MMdd", "HHmmss", False)
'		DBStructures.InsertAddress(CurrentobjectTagcode, CurrentAddressTagcode, theGeo)
	End If
	UpdateobjectForm(CurrentobjectTagcode)
End Sub

Sub SetTheContact(theContact As ContactRecord)
	If (theContact.asNew = False) Then
		DBStructures.UpdateContact(theContact)
'	Else
'		'Dim
'		CurrentAddressTagcode = "ADRSS_" & Utils.GetCurrDatetimeFormat("MMdd", "HHmmss", False)
'		DBStructures.InsertAddress(CurrentobjectTagcode, CurrentAddressTagcode, theGeo)
	End If
	UpdateobjectForm(CurrentobjectTagcode)
End Sub

Sub SetThePropertyInsert(property As String, value As String)
	DBStructures.InsertobjectProperty(CurrentobjectTagcode, property, value)
	UpdateobjectForm(CurrentobjectTagcode)
End Sub

Sub SetThePropertyUpdate(property As String, value As String)
	DBStructures.UpdateobjectProperty(CurrentobjectTagcode, property, value)
	UpdateobjectForm(CurrentobjectTagcode)
End Sub

Sub listButRefresh_Click
	
End Sub

Sub ListItemTitle_Click
	Dim b As Label = Sender
	Dim FileName As String = b.tag
	Dim Continua As Boolean = False
	Dim theFile As String = File.Combine(Starter.InternalFolder , FileName)
	'**********************************************************************
	' ALTERAÇÃO PC
	' SE NAO FOR POSSIVEL ACEDER AO OBJECTO, QUESTIONA SE O UTILIZADOR O DESEJA DESCARREGAR.
	' SE RESPONDER QUE SIM, MAS MESMO ASSIM NAO FOR POSSIVEL ACEDER AO FICHEIRO, INFORMA O UTILIZADOR E NAO FAZ MAIS NADA
	' SE DESCARREGAR, ABRE-O PARA VISUALIZAÇÃO
	'**********************************************************************
	If Not(File.Exists(Starter.InternalFolder,FileName)) Then
		Dim result As Int
		result = Msgbox2(ShareCode.userfilenoindentified, ShareCode.GeneralInfoTitle, ShareCode.Option_YES, "", ShareCode.Option_NO, Null)
		If result = DialogResponse.POSITIVE Then
			Dim res As ResumableSub = GetMissingDocument(FileName)
			Wait For(res) Complete (Downloaded As Boolean)
			If(Downloaded) Then
				Log($"Missing File downloaded"$)
				Log(theFile)
				If File.Exists(Starter.InternalFolder, FileName) Then
					File.Copy(Starter.InternalFolder, FileName, Starter.SharedFolder, FileName)
					Continua = True
				End If
				If Continua Then
					Utils.ViewPDFFile(FileName)
				End If
				
			Else
				MsgboxAsync(ShareCode.userfileunavailable,ShareCode.GeneralAlertTitle)
			End If
		End If
	Else
		Log(theFile)
		If File.Exists(Starter.InternalFolder, FileName) Then
			File.Copy(Starter.InternalFolder, FileName, Starter.SharedFolder, FileName)
			Continua = True
		End If
		If Continua Then
			Utils.ViewPDFFile(FileName)
		End If
	End If
End Sub

Sub ListItemDocButton_Click
	Dim b As Label = Sender
	Dim FileName As String = b.tag
	Dim Continua As Boolean = False
	Dim theFile As String = File.Combine(Starter.InternalFolder , FileName)
	'**********************************************************************
	' ALTERAÇÃO PC
	' SE NAO FOR POSSIVEL ACEDER AO OBJECTO, QUESTIONA SE O UTILIZADOR O DESEJA DESCARREGAR.
	' SE RESPONDER QUE SIM, MAS MESMO ASSIM NAO FOR POSSIVEL ACEDER AO FICHEIRO, INFORMA O UTILIZADOR E NAO FAZ MAIS NADA
	' SE DESCARREGAR, ABRE-O PARA VISUALIZAÇÃO
	'**********************************************************************
	If Not(File.Exists(Starter.InternalFolder,FileName)) Then
		Dim result As Int
		result = Msgbox2(ShareCode.userfilenoindentified, ShareCode.GeneralInfoTitle, ShareCode.Option_YES, "", ShareCode.Option_NO, Null)
		If result = DialogResponse.POSITIVE Then
			Dim res As ResumableSub = GetMissingDocument(FileName)
			Wait For(res) Complete (Downloaded As Boolean)
			If(Downloaded) Then
				Log($"Missing File downloaded"$)
				Log(theFile)
				If File.Exists(Starter.InternalFolder, FileName) Then
					File.Copy(Starter.InternalFolder, FileName, Starter.SharedFolder, FileName)
					Continua = True
				End If
				If Continua Then
					Utils.ViewPDFFile(FileName)
				End If
				
			Else
				MsgboxAsync(ShareCode.userfileunavailable,ShareCode.GeneralAlertTitle)
			End If
		End If
	Else
		Log(theFile)
		If File.Exists(Starter.InternalFolder, FileName) Then
			File.Copy(Starter.InternalFolder, FileName, Starter.SharedFolder, FileName)
			Continua = True
		End If
		If Continua Then
			Utils.ViewPDFFile(FileName)
		End If
	End If
End Sub



Sub GetMissingDocument(DocName As String) As ResumableSub
	
	Dim GlobalFTP As FTP
	GlobalFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	GlobalFTP.PassiveMode = True
	GlobalFTP.TimeoutMs = 240000
	Try
		Dim sf As Object = GlobalFTP.DownloadFile("/" & ShareCode.APP_DOMAIN & "/docs/" & DocName, False, Starter.InternalFolder, DocName)
		Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
				
		If Success Then
			Log($"/docs/${DocName} : file was download successfully"$)
			GlobalFTP.Close
			Return True
		Else
			Log($"/docs/${DocName} : Error downloading file"$)
			GlobalFTP.Close
			Return False
		End If
	Catch
		Log(LastException)
		GlobalFTP.Close
		Return False
	End Try
	
End Sub

Sub mainLogo_Click
	Dim i As Int
	i = Msgbox2("Deseja voltar directamente para o início?", "Alerta!", "Sim", "Cancelar", "", Null)
	If (i=DialogResponse.POSITIVE) Then
		CallSubDelayed2(MainMenu, "ListsReturn", "")
		Activity.Finish
		ShareCode.SetAnimation("zoom_enter", "zoom_exit")
	End If
End Sub

Sub objectPropertyListView_ItemClick (Index As Int, Value As Object)
	'MsgboxAsync("Clicou - Lista", "Alerta!")
End Sub


Sub pnlGroupExpandedProp_Click
'	MsgboxAsync("Clicou Painel", "Alerta!")
End Sub

Sub GroupPropCollpseExpand_Click
	'MsgboxAsync("Clicou Expand Painel", "Alerta!")
	Dim p As B4XView = objectPropertyListView.GetPanel(CurrentGroupItemProp)
	If p.Tag = True Then
		CollapseItemProp(CurrentGroupItemProp)
	Else
		ExpandItemProp(CurrentGroupItemProp)
	End If
End Sub

Sub MenuPanelButtonOne_Click
	listsTabPanel.ScrollTo(0,False)
	MenuPanel.Visible = False
	Panel1.Visible = True
	mainLabelOptLists.Text = MenuPanelPagesTitle.Get(0)
	
End Sub

Sub MenuPanelButtomTwo_Click
	listsTabPanel.ScrollTo(1,False)
	MenuPanel.Visible = False
	Panel1.Visible = True
	mainLabelOptLists.Text = MenuPanelPagesTitle.Get(1)
End Sub

Sub MenuPanelButtonThree_Click
	listsTabPanel.ScrollTo(2,False)
	MenuPanel.Visible = False
	Panel1.Visible = True
	mainLabelOptLists.Text = MenuPanelPagesTitle.Get(2)
End Sub

Sub MenuPanelButtonFour_Click
	listsTabPanel.ScrollTo(3,False)
	MenuPanel.Visible = False
	Panel1.Visible = True
	mainLabelOptLists.Text = MenuPanelPagesTitle.Get(3)
End Sub

Sub listsTabPanel_PageSelected (Position As Int)
	If(ShareCode.ISPHONE And MenuPanel.Visible = False) Then
		Dim title As String
		title = MenuPanelPagesTitle.Get(Position)
		mainLabelOptLists.Text = title
'		If(Position = 0) Then
'			title = MenuPanelPagesTitle.Get(0)
'			mainLabelOptLists.Text =
'		Else If	(Position = 1) Then
'			mainLabelOptLists.Text = MenuPanelPagesTitle.Get(1)
'		Else If	(Position = 2) Then
'			mainLabelOptLists.Text = MenuPanelPagesTitle.Get(2)
'		Else If	(Position = 3) Then
'			mainLabelOptLists.Text = MenuPanelPagesTitle.Get(3)
'		End If
	End If
	
End Sub