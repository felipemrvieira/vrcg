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

'
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Private MyPositionLat, MyPositionLon As String
	Public Device As Phone
End Sub

Sub Globals
	Dim Icon As BitmapDrawable
	Dim xui As XUI
	'Dim prvd As FileProvider
	Private GoBackMOREActions As Boolean = False

	Private listsBackground As ImageView
	Private listsBasePanel As Panel
	Private listsBottomLine As Panel
	Private listsBottomPanel As Panel
	Private listsButtonAdd As Button
	Private listsButtonClose As Button
	Private listsLabelInfo As Label
	Private listsTabPanel As TabStrip
	Private listsTopBar As Panel
	
	Private ItemsCounter As Int = 0
	
	Private userCategory As Label
	Private userCertDate As Label
	Private userCertificate As Label
	Private userName As Label
	Private userNotes As Label
	Private userPhoto As ImageView
	Private usersPanel As Panel
	Private userTagcode As Label
	Private userVehicle As Label
	Private userVehiclePlate As Label
	Private userShowCertificate As Button
	
	Private ButtonListNotConfirm As Button
	Private ButtonListConfirm As Button
	Private butEquipSearch As Button
	

	Private listDocuments As CustomListView
	Private listEquipments As CustomListView
	
	
	'Dim Base64Con As Base64Convert
	Private butWareHouses As Button
	
	Dim mPopMenu As MenuOnAnyView
	Dim mDocPopMenu As MenuOnAnyView
	Dim mEqipPopMenu As MenuOnAnyView
	Private butDocFilter As Button
	Private butEquipFilter As Button
	
	Private UserDocuments As List
	Private UserEquipments As List
	Private butCarRunning As Button
	Private LabelCopyright As Label
	Private LabelVersion As Label
	Private LabelDateTime As Label
	
	Private CurrentEquipItem As Int = 0
	Private TotalLineItems As Int = 0
	Private CurrentDocItem As Int = 0
	Private CurrentGroupItem As Int = 0
	Private pnlGroupCurrenIndex As Int
	
	Private userCompany As Label
	'Private UserListView As CustomListViewCollapse
	Private UserListView As ExpandedListView
	Private lblGroupTitle As Label
	Private butGroupCollpseExpand As Button
	Private pnlGroupTitle As Panel
	Private pnlGroupExpanded As Panel
	Private butGrpLineChange As Button
	Private lblGroupLineValidate As Label
	Private lblGroupLineDesc As Label
	Private lblGroupLineModel As Label
	Private lblGroupLineSerial As Label
	Private lblGroupLinePlate As Label
	Private butUserUnavailable As Button
	Private ButtonUserUnavailable As Button
	Private EditEquipSearch As EditText
'	Private ButtonAddUserEquipment As Button
	Private butGrpLineRemove As Button
	
	Private ConfirmProducts As Boolean = (ShareCode.UWDUKEY_PRODUCTS = 0)
	Private ProductsToConfirm As Int = 0
	Private FirstDataLoad As Boolean = True
	Private butUserConfirmData As Button
	Private ColorTabPanel As Panel
	Private SecondPanel As Panel
	Private butGroupCEAdd As Button
	Private mainLogo As ImageView
	Private mainLabelOptLists As Label
	
	Private ListItemDocView As Label
	Private ListItemDates As Label
	Private ListItemInformation As Label
	Private ListItemRefresh As Label
	Private ListItemCategory As Label
	Private ListItemDocButton As Label
	Private ListItemNotes As Label
	Private ListItemReference As Label
	Private ListItemTitle As Label
	Private ListItemQtd As Label
	Private ListItemMinQtd As Label
	Private ListItemPrice As Label
	
	Private VIEW_ItemUserAuto As String = "ItemUserAuto"
	Private VIEW_ItemUserAutoLine As String = "ItemUserAutoLine"
	Private VIEW_ItemUserEquipment As String = "ItemUserEquipment"
	Private VIEW_ListCollapseGroup_UserEquip As String = "ListCollapseGroup_UserEquip"
	Private VIEW_ListCollapseGroup_UserRegister As String = "ListCollapseGroup_UserRegister"
	
	Private VIEW_ItemUserRegister As String = "ItemUserRegister"
	'ListCollapseGroup_UserEquip
	
	Private DialogLogin As AppDialogs
	Private userCode As Label
	Private ButtonActionPause As Button
	Private butGroupURegisterAdd As Button
	Private lblGroupLineCode As Label
	Private lblGroupLineName As Label
	Private pnlGroupExpanded4 As Panel
	Private ButtonAppNetwork As Button
	Private mainActiveUser As Label
	Private butGroupCarChange As Button
	Private CurrentCarID As AutoIdentification
	Private CurrentCarObject As CarObject
	Private ShowImageView As ImageView
	Private butUserPauseAction As Button
	Private UserDocumentsViewLayoutPanel As Panel
	Private UserEquipmentsViewLayoutPanel As Panel
	Private MenuPanel As Panel
	Private MenuPanelUserButton As Button
	Private MenuPanelDocsButtom As Button
	Private MenuPanelConsumablesButton As Button
	Private MenuPanelOperatorsButton As Button
	Private Panel1 As Panel
	Private IsFirstTime As Boolean
	Private userLabelFoto As Label
	Private userLabelNome As Label
	Private userLabelOrganizacao As Label
	Private userLabelCategoria As Label
	Private userLabelCodigoUser As Label
	Private USERWAREHOUSE As String = ""
	Private ButtonListAddAccion As Button
	Private butUserEstadoAction As Button
	Private butUserStopWork As Button
	Private butUserStartWork As Button
	Private lblEstadoUserJornada As Label
	
	Private EditTextJustificacaoRMJ As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Starter.CurrentWorkActivity = Me
	IsFirstTime	 = FirstTime
	Dim LayOutView As String = "userLayout"
	Dim userPage As String = "UserViewLayout"
	
	If (ShareCode.ISPHONE) Then
		LayOutView = "mobile_user_layout"
'		LayOutView = "userLayout_device_2"
'		userPage  = "UserViewLayout_device"
'		VIEW_ItemUserAuto = $"${VIEW_ItemUserAuto}_device_2"$
'		VIEW_ItemUserAutoLine = $"${VIEW_ItemUserAutoLine}_device"$
'		VIEW_ItemUserEquipment = $"${VIEW_ItemUserEquipment}_device"$
'		VIEW_ListCollapseGroup_UserEquip = $"${VIEW_ListCollapseGroup_UserEquip}_device"$
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If

	Activity.LoadLayout(LayOutView)
	'listsTabPanel.LoadLayout("DocsViewLayout", "Equipamentos/Peças") 'user_EquipmentItem  
	If (ShareCode.ISPHONE) Then
	
		listsTabPanel.LoadLayout("phone_user_layout", "")
		listsTabPanel.LoadLayout("UserDocumentsViewLayout", "") 'user_EquipmentItem  user_DocumentItem  EquipmentsViewLayout
		listsTabPanel.LoadLayout("UserEquipmentsViewLayout", "") '
		listsTabPanel.LoadLayout("phone_user_operators_layout", "") '
		
		MenuPanelUserButton.Color = Consts.ColorMain
		MenuPanelDocsButtom.Color = Consts.ColorMain
		MenuPanelConsumablesButton.Color  = Consts.ColorMain
		MenuPanelOperatorsButton.Color  = Consts.ColorMain		
'		listsTabPanel.LoadLayout("UserToolsViewLayout", "Ferramentas") 'user_EquipmentItem  user_DocumentItem  EquipmentsViewLayout
	Else
		listsTabPanel.LoadLayout(userPage, ShareCode.userlayoutpanelOper)
		listsTabPanel.LoadLayout("UserDocumentsViewLayout", ShareCode.userlayoutpanelDocsOrg) 'user_EquipmentItem  user_DocumentItem  EquipmentsViewLayout
		listsTabPanel.LoadLayout("UserEquipmentsViewLayout", ShareCode.userlayoutpanelConsum) 'user_EquipmentItem  user_DocumentItem  EquipmentsViewLayout

	End If
	
	
	If userPage = "UserViewLayout" Then
		userLabelFoto.Text = ShareCode.useruserLabelFoto
		userLabelNome.Text = ShareCode.useruserLabelNome
		userLabelOrganizacao.Text = ShareCode.useruserLabelOrganizacao
		userLabelCategoria.Text = ShareCode.useruserLabelCategoria
		userLabelCodigoUser.text = ShareCode.useruserLabelCodigoUser
	End If
	
	Utils.SetViewBackgroundColorToMainColor(UserDocumentsViewLayoutPanel)
	Utils.SetViewBackgroundColorToMainColor(UserEquipmentsViewLayoutPanel)
	If (ShareCode.ISPHONE) Then
'		For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
'			lbl.Width = 50%x
'		Next
	Else
		For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
			lbl.Width = 33.33%x
		Next
	End If

	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
	If FirstTime Then
		'
	End If
	'Base64Con.Initialize
	
	ConfirmProducts = (ShareCode.UWDUKEY_PRODUCTS = 0)
	FirstDataLoad = True
	
	If Not(DialogLogin.IsInitialized) Then DialogLogin.Initialize
	
'	Dim jo As JavaObject = listsTabPanel
'	Dim event As Object = jo.CreateEventFromUI("android.support.v4.view.ViewPager.OnPageChangeListener", "PageChangeListener", Null)
'	jo.GetFieldJO("tabStrip").RunMethod("setOnPageChangeListener", Array(event))
	
	UpdateMainLayout
	WindowStatusUpdate
End Sub

Sub Activity_Resume
	If (ShareCode.ISPHONE And IsFirstTime) Then
		Panel1.Visible = False
		MenuPanel.Visible = True
		IsFirstTime = False
	End If
	

'Select All Vehicles 

'Select a.tagcode , a.title_import from dta_objects As a
' 	INNER JOIN dta_objecttypes As b on 
' 		(b.tagcode = a.object_type And b.inout_tagcode = 'TINOUT_VEHICLES')
	
	
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
			mainLabelOptLists.Text = ShareCode.MainOption_User
			Return True
		End If
	End If
	Return False
End Sub

Sub PageChangeListener_Event (MethodName As String, Args() As Object) As Object
	If (MethodName = "onPageScrolled") Then
		Dim thisTab As Int = Args(0)
		SecondPanel.Visible = thisTab > 0
	End If
	Return Null
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
	ButtonUserUnavailable.Enabled = False
	ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
	ButtonActionPause.TextColor = Consts.ColorLightSilver
	butUserPauseAction.textColor = Colors.black
	butUserUnavailable.TextColor = Colors.black
	butUserEstadoAction.TextColor = Colors.black
	
	mainLabelOptLists.Text = ShareCode.MainOption_User.ToUpperCase
	MenuPanelUserButton.Text = ShareCode.usermainLabelOptListsUser
	MenuPanelDocsButtom.Text = ShareCode.usermainLabelOptListsDocs
	MenuPanelConsumablesButton.Text = ShareCode.usermainLabelOptListsCons
	MenuPanelOperatorsButton.Text = ShareCode.usermainLabelOptListsOper

	ButtonAppNetwork.Enabled = False
	ButtonAppNetwork.TextColor = Consts.ColorLightSilver
	
	If (ShareCode.APP_WORKING_LOCAL) Then
		ButtonAppNetwork.Enabled = True
		ButtonAppNetwork.TextColor = Consts.ColorRedOrange
	End If
	
	If ShareCode.USR_STATE = 0 Then
		butUserUnavailable.TextColor = Consts.ColorRed
		butUserEstadoAction.TextColor = Consts.ColorRed
		ButtonUserUnavailable.TextColor = Consts.ColorRed
		ButtonUserUnavailable.Enabled = True
	Else
		butUserUnavailable.TextColor = Colors.black
		butUserEstadoAction.TextColor = Colors.black
		ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
	End If
	
'	If (ShareCode.UWDUKEY_DETAILS=1) And (ShareCode.UWDUKEY_PRODUCTS=1) Then
'		butUserConfirmData.Color = Consts.ColorGreen
'	Else if (ShareCode.UWDUKEY_DETAILS=1) And (ShareCode.UWDUKEY_PRODUCTS=0) Then
'		butUserConfirmData.Color = Consts.ColorYellow
'	Else
'		butUserConfirmData.Color = Consts.ColorMain
'	End If
	
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		Utils.LogUserAction("TUSRLGOT_3", Me)
		Sleep(250)
		ButtonActionPause.TextColor = Consts.ColorOrange
		butUserPauseAction.TextColor = Consts.ColorOrange
'		ButtonUserUnavailable.TextColor = Consts.ColorOrange
		lblEstadoUserJornada.Text = ShareCode.MsgUserMessageJornadaIndisponivel
	Else
		Utils.LogUserAction("TUSRLGOT_4", Me)
		Sleep(250)
		ButtonActionPause.TextColor = Consts.ColorLightSilver
		butUserPauseAction.TextColor = Colors.Black
'		ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
		lblEstadoUserJornada.Text = ShareCode.MsgUserMessageJornadaActivo
	End If
	
	listsLabelInfo.Text = $"${CurrentEquipItem} / ${TotalLineItems}"$

End Sub

Sub StartUserActivity(FileArg As String)

	Dim vehicleplate As String = ""
	Dim photo As String = ""
	Dim title As String = ""
	Dim vehicle As String = ""
	Dim tagcode As String = ""
	Dim name As String = ""
	Dim userCodeName As String = ""
	
	Private Row As Int = 0
	Private Record As Cursor
	
	Dim nSQL As String = $"Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo,  ifnull(a.vehicle_tagcode,'') As vehicle_tagcode,
			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, a.*, ifnull(c.photo,ifnull(a.foto,'')) as photo
			from dta_technicals as a
			inner join aut_users as b on (b.tagcode=a.user_tagcode)
			inner join aut_users_details as c on (c.user_tagcode=a.user_tagcode)
			left join dta_objects as d on (d.tagcode=a.vehicle_tagcode)
			left join dta_objects_fields as e1 on (e1.object_tagcode=d.tagcode and e1.field_tagcode='FIELD_MARCA')
			left join dta_objects_fields as e2 on (e2.object_tagcode=d.tagcode and e2.field_tagcode='FIELD_MODELO')
			left join dta_objects_fields as e3 on (e3.object_tagcode=d.tagcode and e3.field_tagcode='FIELD_MATRICULA')
			left join dta_objects_fields as e4 on (e4.object_tagcode=d.tagcode and e4.field_tagcode='FIELD_KM')
			where a.tagcode='${ShareCode.SESS_User}'"$   'ShareCode.SESS_OPER_User
	Log(nSQL)
	Record = Starter.LocalSQLEVC.ExecQuery(nSQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim vehicleplate As String = Utils.IfNullOrEmpty(Record.GetString("vmatricula"), "")
		Dim userCodeName As String = Utils.IfNullOrEmpty(Record.GetString("username"), "")
'		Dim certificate As String = Utils.IfNullOrEmpty(Record.GetString("certificate"), "")
'		Dim cert_valid As String = Utils.IfNullOrEmpty(Record.GetString("cert_valid"), "")
		Dim photo As String = Utils.IfNullOrEmpty(Record.GetString("photo"), "")
'		Dim filename As String = Utils.IfNullOrEmpty(Record.GetString("filename"), "")
		Dim title As String = Utils.IfNullOrEmpty(Record.GetString("jobtitle"), "")
		Dim vehicle As String = Utils.IfNullOrEmpty(Record.GetString("vmarca"), "")
		Dim vmodel As String = Utils.IfNullOrEmpty(Record.GetString("vmodelo"), "")
		Dim tagcode As String = Utils.IfNullOrEmpty(Record.GetString("tagcode"), "")
		Dim name As String = Utils.IfNullOrEmpty(Record.GetString("title"), "")
		Dim vehicle_tagcode As String = Utils.IfNullOrEmpty(Record.GetString("vehicle_tagcode"), "")
'		Dim details As String = Utils.IfNullOrEmpty(Record.GetString("details"), "")
'		Dim doccertfile As String = Utils.IfNullOrEmpty(Record.GetString("doccertfile"), "")

	End If
	Record.Close
	Log(name)
	
	If (vehicleplate= "") Then
		Dim nSQL As String = $"Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo, d.tagcode,
			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, ifnull(d.image,'') as photo, ifnull(d.filename,'') as filename
			from  dta_objects As d 
			left join dta_objects_fields As e1 on (e1.object_tagcode=d.tagcode And e1.field_tagcode='FIELD_MARCA')
			left join dta_objects_fields As e2 on (e2.object_tagcode=d.tagcode And e2.field_tagcode='FIELD_MODELO')
			left join dta_objects_fields As e3 on (e3.object_tagcode=d.tagcode And e3.field_tagcode='FIELD_MATRICULA')
			left join dta_objects_fields As e4 on (e4.object_tagcode=d.tagcode And e4.field_tagcode='FIELD_KM')
			where d.tagcode in (Select distinct vehicle_tagcode from dta_teams where tagcode in (
					Select tagcode from dta_teams_relations where relation_tagcode='${ShareCode.SESS_User}'))"$
		Dim dRecord As Cursor
		dRecord = Starter.LocalSQLEVC.ExecQuery(nSQL)
		If dRecord.RowCount > 0 Then
			dRecord.Position = 0
			Dim vehicleplate As String = Utils.IfNullOrEmpty(dRecord.GetString("vmatricula"), "")
			Dim vehicle As String = Utils.IfNullOrEmpty(dRecord.GetString("vmarca"), "")
			Dim vmodel As String = Utils.IfNullOrEmpty(dRecord.GetString("vmodelo"), "")
			Dim vehicle_tagcode As String = Utils.IfNullOrEmpty(dRecord.GetString("tagcode"), "")
'			Dim photo As String = Utils.IfNullOrEmpty(Record.GetString("photo"), "")
'			Dim filename As String = Utils.IfNullOrEmpty(Record.GetString("filename"), "")
		End If
		dRecord.close
	End If
	
	ShareCode.SESS_VEHICLE_OBJECT = vehicle_tagcode
	ShareCode.SESS_VEHICLE_PLATE = vehicleplate
	
	Dim cptitle As String = ""
'	Dim cpnifnumber As String = ""
	Dim sSQL1 As String = $"select a.* from dta_companies as a"$
	Dim dRecord11 As Cursor
	dRecord11 = Starter.LocalSQLEVC.ExecQuery(sSQL1)
	If dRecord11.RowCount > 0 Then
		dRecord11.Position = 0
		Dim cptitle As String = Utils.IfNullOrEmpty(dRecord11.GetString("title"), "")
'		Dim cpnifnumber As String = Utils.IfNullOrEmpty(dRecord.GetString("nif_number"), "")
	End If
	dRecord11.close

	userCategory.text = title
	userCode.Text = userCodeName
	userCompany.text = cptitle 
	userName.text = name
	'userName.Color = Consts.ColorLightSilver
	userTagcode.text = tagcode
	If Not(Utils.isNullOrEmpty(photo)) Then
		photo = photo.Replace("data:image/png;base64,", "")
		userPhoto.SetBackgroundImage(Utils.B64ToBitmap(photo))
	End If
	
	'Dim Car As AutoIdentification = Types.NewAutoIdentification(tagcode, vehicle_tagcode, vehicleplate, vehicle)
	CurrentCarID = Types.NewAutoIdentification(tagcode, vehicle_tagcode, vehicleplate, vehicle, vmodel)
	UserListView.UpDownIconExists = True
	UserListView.UpDownIconIndex = 1
	
	CreateUserDetailsData(False, CurrentCarID)
	
'	If Not(ShareCode.ISPHONE) Then
		MakeDocumentsList(0)
		MakeEquipmentsList(0)
		Private Record As Cursor
		mPopMenu.Initialize(Activity, Me, butWareHouses, Colors.DarkGray, Colors.White, Colors.LightGray, True, False)
		Record = Starter.LocalSQL.ExecQuery($"select * from warehouses"$)
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim whtitle As String = Record.GetString("title")
				mPopMenu.AddMenuItem(whtitle, "whouses")
			Next
		End If
		Record.Close
	
		Private Record As Cursor
		mEqipPopMenu.Initialize(Activity, Me, butEquipFilter, Colors.DarkGray, Colors.White, Colors.LightGray, True, False)
		mEqipPopMenu.AddMenuItem("Todos", "catitems")
		Record = Starter.LocalSQL.ExecQuery($"select * from warehouses_categories"$)
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim ctitle As String = Record.GetString("title")
				mEqipPopMenu.AddMenuItem(ctitle, "catitems")
			Next
		End If
		Record.Close
'	End If

	FirstDataLoad = False
End Sub


Sub CreateUserDetailsData(clear As Boolean, car As AutoIdentification)
	If clear Then
		UserListView.Clear
	End If
	Dim idx As Int = UserListView.Size
	If idx >0 Then idx = idx-1
	'Dim lItems As Int = 1
	
	Dim id As ItemData
	Dim t As Int = 0
	Dim h As Int = 60dip
	id.Initialize
	id.CollapsedHeight = 50dip
	Private Record As Cursor
	
	'******************************************************************************
	' CRIA LISTA DE EQUIPAMENTOS DO COLABORADOR
	'******************************************************************************

	'Dim SQL As String = $"Select * from dta_equipments where tagcode in (Select equipment_tagcode from dta_equipments_technicals where technical_tagcode='${ShareCode.SESS_User}')"$
	Dim SQL As String = $"select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode in (Select equipment_tagcode from dta_equipments_technicals where technical_tagcode='${ShareCode.SESS_User}')"$
	'Dim SQL As String = $"select * from equipments where tagcode in (select equipment_tagcode from equipment2user where user_tagcode='${ShareCode.SESS_User}')"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		id.ExpandedHeight = 50dip + 40dip + (60dip * Record.RowCount)
		Dim chapter As B4XView = CreateChapter(Colors.Gray, ShareCode.userchapterEquip, VIEW_ListCollapseGroup_UserEquip, id, idx, False, False, False, Types.ClearedCarObject)
		For Row = 0 To Record.RowCount-1
			Record.Position = Row

			CreateGroupLineItems(Record, t,  h)
			t = t + 60dip
		Next
		UserListView.Add(chapter, id)
		UserListView.ExpandItem(idx)
		idx = idx + 1
	Else
		id.ExpandedHeight = 50dip
		Dim chapter As B4XView = CreateChapter(Colors.Gray, ShareCode.userchapterEquip, VIEW_ListCollapseGroup_UserEquip, id, idx, False, False, False, Types.ClearedCarObject)
		UserListView.Add(chapter, id)
		idx = idx + 1
	End If
	Record.Close
	
	Dim id As ItemData
	Dim t As Int = 0
	Dim h As Int = 60dip
	id.Initialize
	id.CollapsedHeight = 50dip
	Private Record As Cursor
	'carta_verde.pdf
	
	'******************************************************************************
	' CRIA DADOS DA VIATURA E LISTA DE DOCUMENTOS DA VIATURA DO COLABORADOR
	'******************************************************************************
	
	Dim SQL As String = $"Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo, 
			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '0') as vkm, a.*
			from  dta_objects as a 
			left join dta_objects_fields as e1 on (e1.object_tagcode=a.tagcode and e1.field_tagcode='FIELD_MARCA')
			left join dta_objects_fields as e2 on (e2.object_tagcode=a.tagcode and e2.field_tagcode='FIELD_MODELO')
			left join dta_objects_fields as e3 on (e3.object_tagcode=a.tagcode and e3.field_tagcode='FIELD_MATRICULA')
			left join dta_objects_fields as e4 on (e4.object_tagcode=a.tagcode and e4.field_tagcode='FIELD_KM')
			-- left join dta_fields as f on (f.tagcode=e.field_tagcode)
			where a.tagcode='${car.objTagcode}'"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	
	'Dim SQL As String = $"select * from documents where tagcode in (select document from docs2user where typegroup=1 and user in (select id from user where tagcode='${ShareCode.SESS_User}'))"$
	'Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		t = t + 150dip
		'id.ExpandedHeight = 50dip + t + (60dip * Record.RowCount)
		id.ExpandedHeight = 50dip + t + (20dip * Record.RowCount)
		Record.Position = 0
		Dim CarObj As CarObject = Types.MakeCarObject(car.objTagcode, _
									Record.GetString("vmarca"), _
									Record.GetString("vmodelo"), _
									Record.GetString("vmatricula"), _
									Record.GetLong("vkm"))
		CurrentCarObject = CarObj
		ShareCode.SESS_CurrentCarObject = CurrentCarObject
		Dim chapter As B4XView = CreateChapter(Colors.Gray, ShareCode.userchapterViatura, "ListCollapseGroup_UserCar", id, idx, False, True, True, CarObj) 'car.objTagcode)
		
									
		CreateGroupLineAuto(car.Name, car.model, car.Plate, car.Tag, 0,  t, idx, CarObj)
'		'ItemUserAutoLine
'		For Row = 0 To Record.RowCount-1
'			Record.Position = Row
'			CreateGroupLineItemsAuto(Record, t,  h, idx)
'			t = t + 60dip
'		Next
		UserListView.Add(chapter, id)
		UserListView.ExpandItem(idx)
		idx = idx + 1
	Else
		id.ExpandedHeight = 50dip + t
		Dim chapter As B4XView = CreateChapter(Colors.Gray, ShareCode.userchapterViatura, "ListCollapseGroup_UserCar", id, idx, False, True, True, Types.ClearedCarObject)
		UserListView.Add(chapter, id)
		idx = idx + 1
	End If
	Record.Close
	
	Dim id As ItemData
	Dim t As Int = 0
	Dim h As Int = 60dip
	id.Initialize
	id.CollapsedHeight = 50dip
	Private Record1 As Cursor
	'******************************************************************************
	' CRIA REGISTO DE UTILIZADORES EM SESSÃO
	'******************************************************************************
	Dim SQL As String = $"select * from loc_userssession where session='${Starter.LocalSessionCode}'"$
	Record1 = Starter.LocalSQLWRK.ExecQuery(SQL)
	If Record1.RowCount > 0 Then
		
		id.ExpandedHeight = 50dip + 40dip + t + (60dip * Record1.RowCount)
		Dim chapter As B4XView = CreateChapter(Colors.Gray, ShareCode.userchapterUsers, VIEW_ListCollapseGroup_UserRegister, id, idx, False, False, False, Types.ClearedCarObject)
		For Row = 0 To Record1.RowCount-1
			Record1.Position = Row
			CreateGroupLineItemsUserRegister(Record1, t,  h, chapter.Width)
			t = t + 60dip
		Next
		UserListView.Add(chapter, id)
		UserListView.ExpandItem(idx)
		idx = idx + 1
	Else
		id.ExpandedHeight = 50dip + t
		Dim chapter As B4XView = CreateChapter(Colors.Gray, ShareCode.userchapterUsers, "VIEW_ListCollapseGroup_UserRegister", id, idx, False, False, False, Types.ClearedCarObject)
		UserListView.Add(chapter, id)
		idx = idx + 1
	End If
	Record1.Close
'	
'	CallSub3(activ, "SetLoginRegister", mainEditLoginUser.Text, mainEditLoginPassword.Text)
'	CallSub(activ, "SetLoginRegisterCancel")
End Sub

Sub CreateChapter(clr As Int, Title As String, layout As String, id As ItemData, idx As Int, Expanded As Boolean, isCar As Boolean, showBut As Boolean, carObj As CarObject) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, UserListView.sv.width, id.ExpandedHeight)
	p.LoadLayout(layout) 
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblGroupTitle.Text = Title
	lblGroupTitle.Tag = idx
	pnlGroupTitle.Tag = idx
	butGroupCollpseExpand.Tag = idx
	If (isCar) Then
		butGroupCarChange.Tag = carObj
		butGroupCarChange.Visible = showBut
	End If
	p.Tag = Expanded 'collapsed
	Return p
End Sub


Sub CreateGroupLineItems(colitems As Cursor, top As Int, height As Int) 'As B4XView
	Dim p As Panel
	p.Initialize("GroupLineClick")
	Activity.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout(VIEW_ItemUserEquipment)
	p.RemoveView
	
	Dim Equipment As String = colitems.GetString("title")
	Dim Serial As String = Utils.IfNullOrEmpty(colitems.GetString("serialnumber"), "")
	Dim Valid As String = Utils.IfNullOrEmpty(colitems.GetString("valid_to"), "")
	Dim Tagcode As String = colitems.GetString("tagcode")
	
	'p.Tag = Tagcode
	butGrpLineChange.Tag = Tagcode
	'butGrpLineRemove.Tag = Tagcode
	lblGroupLineDesc.Text = Equipment
	lblGroupLineValidate.Text = Valid
	lblGroupLineSerial.Text = Serial
	p.Tag = 0
	
	pnlGroupExpanded.AddView(p, 0, top, p.Width, height)
End Sub


Sub CreateGroupLineItemsUserRegister(colitems As Cursor, top As Int, height As Int, width As Int) 'As B4XView
	Dim p As Panel
	p.Initialize("GroupLineClickUser")
	Activity.AddView(p, 0, 0, width, height)
	p.LoadLayout(VIEW_ItemUserRegister)
	p.RemoveView
	
	Dim code As String = colitems.GetString("username")
	Dim name As String = colitems.GetString("name")
	Dim Tagcode As String = colitems.GetString("tagcode")

	lblGroupLineCode.Text = code
	lblGroupLineName.Text = name
	lblGroupLineCode.tag = Tagcode
	lblGroupLineName.tag = Tagcode
	butGrpLineChange.Tag = Tagcode
	p.Tag = 0
	pnlGroupExpanded4.AddView(p, 0, top, p.Width, height)
End Sub

'Title As String, Plate As String, Tagcode As String, top As Int, height As Int, idx As Int, CarObj As CarObject
Sub CreateGroupLineAuto(Title As String, Model As String, Plate As String, Tagcode As String, top As Int, height As Int, idx As Int, CarObj As CarObject) 'As B4XView
	Dim p As Panel
	p.Initialize("GroupLineClick")
	Activity.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout(VIEW_ItemUserAuto)
	p.RemoveView

	
	butGrpLineChange.Tag = Tagcode
	lblGroupLineDesc.Text = Title
	lblGroupLineModel.text = Model
	lblGroupLinePlate.Text = Plate
	
	'lblGroupLineSerial.Text = Serial
	butGrpLineChange.Tag = CarObj '$"${Tagcode}|${Plate}"$
	p.Tag = idx
	
	pnlGroupExpanded.AddView(p, 0, top, p.Width, height)
End Sub

Sub CreateGroupLineItemsAuto(colitems As Cursor, top As Int, height As Int, idx As Int) 'As B4XView
	Dim p As Panel
	p.Initialize("GroupLineClick")
	Activity.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout(VIEW_ItemUserAutoLine)
	p.RemoveView
	
	Dim Equipment As String = Utils.IfNullOrEmpty(colitems.GetString("title"), "")
	'Dim Serial As String = colitems.GetString("serial")
	Dim Valid As String = Utils.IfNullOrEmpty(colitems.GetString("valid_to"), "")
	If (Utils.isNull(Valid )) Then Valid = ""
	Dim Tagcode As String = colitems.GetString("tagcode")
	Dim FileName As String = Utils.IfNullOrEmpty(colitems.GetString("docfilename"), "")
	
	
	lblGroupLineDesc.Text = Equipment
	lblGroupLineDesc.Tag = FileName
	
	lblGroupLineValidate.Text = Valid
	lblGroupLineValidate.Tag = Tagcode
	
	'lblGroupLineSerial.Text = Serial
	p.Tag = idx
	pnlGroupExpanded.AddView(p, 0, top, p.Width, height)
End Sub

Sub doccategories_Click(MenuName As String)
'	listDocuments.Clear
'	Dim Filter As String = MenuName.ToUpperCase
'	For Each coldocuments As Map In UserDocuments
'		Dim category As String = coldocuments.Get("category")
'		Log(Filter & " - " & category.ToUpperCase)
'		If ((Filter = "TODOS") Or (Filter = category.ToUpperCase)) Then
'			listDocuments.Add( CreateDocListItem(ItemsCounter, coldocuments, listDocuments.AsView.Width, 100dip, Null), 100dip, "" )
'		End If
'	Next
End Sub

Sub MakeDocumentsList(Filter As Int)
	Private ThisRecord As Cursor
'	Dim sSQL As String = $"select * from documents where internal=1 "$ & _
'					$"And ((tagcode Not in (Select document from docs2teams)) Or "$ & _
'					$"(tagcode in (Select document from docs2teams where team in (Select team from teams2user "$ & _
'					$"where userid in (Select id from user where tagcode='${ShareCode.SESS_User}')))))"$
					
	Dim sSQL As String = $"Select b.tagdesc As doctype_title, a.title, a.valid_to, a.tagcode, a.doc_filename
						from dta_documents As a
						left join type_documenttypes As b on (b.tagcode=a.document_type)
						where a.is_from=0 "$	
								
	
	ThisRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If ThisRecord.RowCount > 0 Then
		CurrentDocItem = 0
		TotalLineItems = ThisRecord.RowCount
		For Row = 0 To TotalLineItems-1
			ThisRecord.Position = Row
			Dim Continua As Boolean = True ' ((Filter = 0) Or (Record.GetInt("category")=Filter))
			Dim Height As Int =100dip
			
			If(ShareCode.ISPHONE) Then
				Height = 135dip
			End If
			
			If (Continua) Then
				listDocuments.Add(CreateDocListItem(Row, ThisRecord, listDocuments.AsView.Width, Height, Null), "") ', 100dip, "" )
			End If
		Next
	Else
		ThisRecord.Close
	End If
	ThisRecord.Close
End Sub

'Sub CreateEquipListItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
Sub CreateDocListItem(cnt As Int, Recordr As Cursor, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("user_DocumentItem")
	p.RemoveView

	Dim Document As String = Utils.IfNullOrEmpty(Recordr.GetString("title"), "")
	Dim Valid As String = Utils.IfNullOrEmpty(Recordr.GetString("valid_to"), "")
	Dim GroupType As String = Utils.IfNullOrEmpty(Recordr.GetString("doctype_title"), "")
	Dim tagcode As String = Recordr.GetString("tagcode")
	Dim FileName As String = Utils.IfNullOrEmpty(Recordr.GetString("doc_filename"), "")
	p.Tag = FileName
	ListItemTitle.text = Document
	ListItemInformation.text =  $"${GroupType} - ${FileName}"$
	ListItemDates.text = Valid
	ListItemDocView.Tag = FileName
	ListItemRefresh.Tag = tagcode
	If FileName.EndsWith("pdf") Then
		ListItemDocView.text = Chr(0xF1C1)
	else if FileName.EndsWith ("xls") Or FileName.EndsWith ("xlsx") Then
		ListItemDocView.Text = Chr(0xF1C3)
	Else If FileName.EndsWith ("doc") Or FileName.EndsWith ("docx") Then
		ListItemDocView.Text = Chr(0xF1C2)
	Else If FileName.EndsWith ("jpg") Or FileName.EndsWith ("png") Then
		ListItemDocView.Text = Chr(0xF1C5)
	Else
		ListItemDocView.Text = Chr(0xF016)
	End If
	
'	p.Tag = tagcode

	'Recordr.Close
	Return p
End Sub

Sub ListItemRefresh_Click
	'
	
End Sub

Sub ListItemDocView_Click
	Dim lbl As Label = Sender
	Dim FileName As String = lbl.Tag
	If File.Exists(Starter.InternalFolder, FileName) Then
		Try
			File.Copy(Starter.InternalFolder, FileName, Starter.SharedFolder, FileName )
		Catch
			Log(LastException)
		End Try
		
'		Try
'			Utils.ViewPDFFile(FileName)
'		Catch
'			Log(LastException)
'		End Try
	Else
		If File.Exists(Starter.SharedFolder, FileName) Then
			Try
				File.Copy(Starter.SharedFolder, FileName, Starter.InternalFolder, FileName )
			Catch
				Log(LastException)
			End Try
			
		Else
			Dim i As Int = Msgbox2(ShareCode.userfilenoindentified, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
			If (i=DialogResponse.POSITIVE) Then
				Try
					DownloadFilesWithFTP(FileName)
				Catch
					Log(LastException)
				End Try
			Else
				FileName = ""
			End If
		End If
	End If
	
'	
'	Try
'		MsgboxAsync(Starter.Provider.GetFileUri(FileName), "...")
'	Catch
'		Log(LastException)
'	End Try
	Try
		If Utils.NNE(FileName) Then
			Utils.ViewPDFFile(FileName)
		End If
	Catch
		Log(LastException)
		Dim i As Int = Msgbox2(ShareCode.userfilewithproblems, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			Try
				DownloadFilesWithFTP(FileName)
			Catch
				Log(LastException)
			End Try
		Else
			FileName = ""
		End If
		Try
			If Utils.NNE(FileName) Then
				Utils.ViewPDFFile(FileName)
			End If
		Catch
			Log(LastException)
		End Try
		
	End Try
	
'	Try
'		Utils.ViewPDFFile(FileName)
'	Catch
'		Log(LastException)
'	End Try
	
'	Dim lbl As Label = Sender
'	Dim FileName As String = lbl.Tag
'	Dim Continua As Boolean = True
'	If Continua Then
'		Dim Intent1 As Intent
'		Intent1.Initialize(Intent1.ACTION_VIEW, Starter.Provider.GetFileUri(FileName))
'		Intent1.SetType("application/pdf")
'		Intent1.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION
'		Dim pdfAppsList As List
'		pdfAppsList = Utils.QueryIntent(Intent1)
'		If pdfAppsList.size>0 Then
'			StartActivity(Intent1)
'		End If
'	End If
End Sub

Sub DownloadFilesWithFTP(filename As String )
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
'	Dim ctm As CustomTrustManager
'	ctm.InitializeAcceptAll
'	myFTP.SetCustomSSLTrustManager(ctm)
	myFTP.TimeoutMs =240000
	Dim path As String = "/" & ShareCode.APP_DOMAIN & "/docs/" & filename
	Log($"file ${filename}, caminho:  ${path}"$)
	Dim sf As Object = myFTP.DownloadFile(path, False, Starter.InternalFolder, filename)
	Wait For (sf) FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
	If Success Then
		Log("file was download successfully")
	Else
		Log($"Error downloading file ${ServerPath}"$)
	End If
	
'	Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, filename, False, "/" & ShareCode.APP_DOMAIN & "/docs/" & filename)
'	Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
'	If Success Then
'		Log("file was uploaded successfully")
'	Else
'		Log("Error uploading file")
'	End If
	myFTP.Close
End Sub

Sub MakeEquipmentsList(Filter As Int)
	Private Record As Cursor
	Dim sSQL As String = $"select ifnull(b.title,'') as group_title, d.qtd AS qtdw, ifnull(c.tagdesc,'') as type_title, a.*, d.warehouse_tagcode 
							from dta_articles as a
							left join dta_articles_groups as b on (b.tagcode=a.article_group)
							left join type_articlestypes as c on (c.tagcode=a.article_type)
							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and
								d.warehouse_tagcode in (select tagcode from dta_warehouses 
										where object_tagcode in (select tagcode from dta_objects 
											where tagcode in (select vehicle_tagcode from dta_technicals where tagcode='${ShareCode.SESS_User}'))))"$
	Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If Record.RowCount > 0 Then
		CurrentEquipItem = 0
		TotalLineItems = Record.RowCount
		Dim Height As Int = 100dip
		
		If(ShareCode.ISPHONE) Then
			Height = 140dip
		End If
		
		
		For Row = 0 To Record.RowCount-1			
			Record.Position = Row
			If Row = 0 Then
				USERWAREHOUSE = Utils.IfNullOrEmpty(Record.getstring("warehouse_tagcode"),"")
			End If
			Dim Continua As Boolean = True '((Filter = 0) Or (Record.GetInt("category")=Filter))
			If (Continua) Then
				listEquipments.Add(CreateEquipListItem(Row, Record, listEquipments.AsView.Width, Height, Null), "") ', 100dip, "" )
				If ConfirmProducts And FirstDataLoad Then
					ProductsToConfirm = ProductsToConfirm + 1
				End If
			End If
		Next
	End If
	Record.Close
End Sub

Sub catitems_Click(MenuName As String)
	listEquipments.Clear
	Dim FilterName As String = MenuName
	Dim FilterID As Int = 0
	If Not(FilterName.ToUpperCase = "TODOS") Then
		FilterID = DBStructures.GetIDFrom("warehouses_categories", "title", FilterName)
	End If
	MakeEquipmentsList(FilterID)
End Sub

Sub whouses_Click(MenuName As String)
'	Select MenuName
'		Case "Automobiles"
'		Case "Passenger Buses"
'		Case "Trucks"
'	End Select
End Sub

'Sub CreateEquipListItem(cnt As Int, colitems As Map, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
Sub CreateEquipListItem(cnt As Int, Record As Cursor, Width As Int, Height As Int, bd As BitmapDrawable) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, Width, Height)
	p.LoadLayout("user_EquipmentItem")
	p.RemoveView
	
	
	Dim Status As Int = Record.GetInt("active")
	ButtonListConfirm.Tag = 0
	ButtonListNotConfirm.Tag = 0
	If Status = 1 Then
		ButtonListConfirm.TextColor = Consts.ColorGreen
		ButtonListConfirm.Tag = Status
	else if Status = 2 Then
		ButtonListNotConfirm.TextColor = Consts.ColorRed
		ButtonListNotConfirm.Tag = Status
	End If
	
	Dim qtd As Int = Record.GetInt("qtdw")
	Dim notes As String = Utils.IfNullOrEmpty(Record.GetString("details"), "")
	Dim tagcode As String = Record.GetString("tagcode")
	Dim category As String = Utils.IfNullOrEmpty(Record.GetString("group_title"), "")
	Dim title As String = Utils.IfNullOrEmpty(Record.GetString("title"), "")
	Dim MinQtd As Int = Record.GetInt("minqtd")
	
	ListItemCategory.text = category
	ListItemNotes.text = notes
	ListItemReference.text = tagcode
	ListItemTitle.text = title
	ListItemQtd.text = qtd
	ListItemMinQtd.Text = MinQtd
	'ListItemPrice.text = "0"
	p.Tag = tagcode 'id

	Return p
End Sub




Sub listsButtonClose_Click
	Log("Back USER")
	If (ShareCode.ISPHONE) Then
		If(PhoneBackButtonTab) Then
			Return
		End If
	End If
	CallSubDelayed2(MainMenu, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listsButtonAdd_Click
	
End Sub

Sub listPedidos_ItemClick (Index As Int, Value As Object)
	
	'Dim Index As Int = listPedidos.GetItemFromView(Sender)
	
End Sub

Sub ListItemPanel_Click
	
End Sub

Sub ListItemPanel_LongClick

End Sub

Sub userShowCertificate_Click
	Dim Filename As String = userCertificate.Tag
	Dim Continua As Boolean = True
	If Continua Then
		Private Provider As FileProvider
		Provider.Initialize
		Provider.InitializeSafeDir
		Dim theFile As String = Provider.GetFileUri(Filename)


		'Dim theFile As String = File.Combine(File.DirInternal,Filename)
		Log(theFile)
		Dim Intent1 As Intent
		Intent1.Initialize(Intent1.ACTION_VIEW, "file://" & theFile) 'File.DirInternal & Filename)
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


Public Sub PDFReturn(info As String)
	Log( "Return" )
End Sub

Sub ListItemDocButton_Click
	'ListItemDocButton.tag
	Dim l As Label = Sender
	
	Log(l.Tag)
	Dim p As Panel  = l.Parent
	
	Dim lidb As Label = p.GetView(0)
	Dim lidb1 As Label = p.GetView(1)
	Dim lidb2 As Label = p.GetView(2)
	Dim lidb3 As Label = p.GetView(3)
	Dim lidb4 As Label = p.GetView(4)
	Log($"${lidb.tag}, ${lidb1.tag}, ${lidb2.tag}, ${lidb3.tag}, ${lidb4.tag}"$)
	
	
	Dim Filename As String = lidb.Tag
	Dim Continua As Boolean = True
	If Continua Then
		Private Provider As FileProvider
		Provider.Initialize
		Provider.InitializeSafeDir
		Dim theFile As String = Provider.GetFileUri(Filename)

		Log(theFile)
		Dim Intent1 As Intent
		Intent1.Initialize(Intent1.ACTION_VIEW, "file://" & theFile) 'File.DirInternal & Filename)
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

Sub listDocuments_ItemClick (Index As Int, Value As Object)
	Dim pnl As Panel = listDocuments.GetPanel(Index)
	Dim FileName As String = ""
	FileName = pnl.Tag
'	Dim lbl As Label = pnl.GetView(1)
	Try
		If File.Exists(Starter.InternalFolder, FileName) Then
			If Not(File.IsDirectory(Starter.SharedFolder, FileName)) Then
			
				File.Copy(Starter.InternalFolder, FileName,Starter.SharedFolder, FileName)
				Utils.ViewPDFFile(FileName)
		
				Sleep(20000)
				File.Delete(Starter.SharedFolder, FileName)
			Else
				MsgboxAsync(ShareCode.userfileunavailable, ShareCode.GeneralErrorTitle)
			End If
		End If
	Catch
		Log(LastException)
	End Try
	
'	listsLabelInfo.Text = lbl.Text
'	listsLabelInfo.Text = $"${lbl.Text}, ${Utils.GetFreeMem}"$
'	CurrentEquipItem = 0

End Sub




Sub ListItemSelected(pan As Panel)
	For index= 0 To listEquipments.GetSize-1
		Dim p As Panel = listEquipments.GetPanel(index)
		p.Color = Consts.ColorWhite
	Next
	pan.Color = Consts.ColorCianSoftLight
	WindowStatusUpdate
End Sub

Sub listEquipments_ItemClick (Index As Int, Value As Object)
	
	CurrentEquipItem = Index +1
	Dim pnl As Panel = listEquipments.GetPanel(CurrentEquipItem-1)
	Dim qtd As Label = pnl.GetView(3)
	Dim dlg As AppDialogs
	dlg.Initialize
	dlg.GetUserQuantityDialog("User", pnl.tag, qtd.Text)
	
'	Dim lbl As Label = pnl.GetView(1)
'	listsLabelInfo.Text = $"${lbl.Text}, ${Utils.GetFreeMem}"$
	CurrentDocItem = 0
	ListItemSelected(pnl)
End Sub

Sub QuantityDialogReturn(code As String, qtd As Int)
	Dim warehouse As String = USERWAREHOUSE
	DBStructures.updateNotifyUserStock(code, qtd, warehouse)
	Dim pnl As Panel = listEquipments.GetPanel(CurrentEquipItem-1)
	Dim qtdlbl As Label = pnl.GetView(3)
	qtdlbl.Text = qtd
	'Log($"${code} >> Valor da QTD: ${qtd}"$)
End Sub

Sub butWareHouses_Click
	mPopMenu.OpenMenu()
End Sub

Sub butEquipFilter_Click
	mEqipPopMenu.OpenMenu()
End Sub

Sub butDocFilter_Click
	mDocPopMenu.OpenMenu()
End Sub

Sub butCarRunning_Click
	
End Sub

Sub UserListView_ItemClick (Index As Int, Value As Object)
	CurrentGroupItem = Index
End Sub


Sub GroupLineChange_Click
	Dim b As Button = Sender
	Dim ItemTagCode As String = b.Tag
	Dim p As Panel = b.Parent
	Dim ListType As Int = p.Tag
	
	If (ListType = 0) Then
		ListOfUserEquipments(ItemTagCode)
	End If
End Sub

Sub UserLineChange_Click
	Dim b As Button = Sender
	Dim ItemTagCode As String = b.Tag
	Dim i As Int
	Dim QQ As String = $"select * from loc_userssession where session='${Starter.LocalSessionCode}' and tagcode='${ItemTagCode}'"$
	Dim Record As Cursor
	Record = Starter.LocalSQLWRK.ExecQuery(QQ)
	Dim hasData As Boolean = Record.RowCount >= 1
	If (hasData) Then
		Record.Position = 0
		If (Record.GetString("username") = ShareCode.SESS_OPER_UWDUKEY) Then
			MsgboxAsync(ShareCode.userErroRemoveOwnUser, ShareCode.GeneralAlertTitle)
		Else
			If (Record.GetInt("login") = 1) Then
				MsgboxAsync(ShareCode.userSelectedUserNoRemove, ShareCode.GeneralAlertTitle)
			Else
				i = Msgbox2(ShareCode.userAskRemoveUser, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.option_no, "", Null)
				If (i=DialogResponse.POSITIVE) Then
					Dim sqlScript As String = $"delete from loc_userssession where session='${Starter.LocalSessionCode}' and tagcode='${ItemTagCode}'"$
					Starter.LocalSQLWRK.ExecNonQuery(sqlScript)
					CreateUserDetailsData(True, CurrentCarID)
				End If
			End If
			
		End If
	End If
	Record.Close
	
End Sub


Sub GroupLineRemove_Click
	Dim b As Button = Sender
	Dim ItemTagCode As String = b.Tag
	Dim p As Panel = b.Parent
	Dim ListType As Int = p.Tag
	
	If (ListType = 0) Then
		RemoveUserEquipments(ItemTagCode)
	End If
End Sub

'ListItemsList
Sub ListOfUserEquipments(tagcode As String)
	Private Record As Cursor
	
	Dim SQL As String = $"select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode not in (select equipment_tagcode from dta_equipments_technicals where technical_tagcode='${ShareCode.SESS_User}')"$
	'Dim SQL As String = $"select * from equipments where tagcode not in (select equipment_tagcode from equipment2user where user_tagcode='${ShareCode.SESS_User}')"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Dim Filter As AppDialogs
		Filter.Initialize
		Filter.getDoubleLineEquipmentsDialog(Activity, "User", "Lista de equipamentos", Record, tagcode)
	Else
		MsgboxAsync(ShareCode.userNoEquipments, ShareCode.GeneralAlertTitle)
		Record.Close
	End If
End Sub

Sub ListOfVehicles()
	Private Record As Cursor
	
	Dim SQL As String = $"Select a.tagcode , a.title_import from dta_objects As a
 														INNER JOIN dta_objecttypes As b on 
 															(b.tagcode = a.object_type And b.inout_tagcode = 'TINOUT_VEHICLES')
								where a.active=1"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Dim Filter As AppDialogs
		Filter.Initialize
		Filter.getVehiclesListDialog(Activity, "User", "Lista de Veículos", Record)
	Else
		MsgboxAsync(ShareCode.userNoVehicles, ShareCode.GeneralAlertTitle)
		Record.Close
	End If
End Sub





Sub RemoveUserEquipments(tagcode As String)
	Dim i As Int
	i = Msgbox2(ShareCode.userAskRemoveEquipment, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
	If (i=DialogResponse.POSITIVE) Then
		DBStructures.deleteUserEquipment(ShareCode.SESS_User, tagcode)
		CreateUserDetailsData(True, CurrentCarID)
	End If
End Sub

Sub ChangeUserEquipment(oldtagcode As String, newtagcode As String)
	If oldtagcode = "" Then
		DBStructures.insertUserEquipment(ShareCode.SESS_User, newtagcode)
	Else
		DBStructures.updateUserEquipment(ShareCode.SESS_User, newtagcode, oldtagcode)
	End If
	
	CreateUserDetailsData(True, CurrentCarID)
	
End Sub


Sub ChangeUserVehicle(oldtagcode As String, newtagcode As String)

	DBStructures.updateUserVehicle(ShareCode.SESS_User, newtagcode)
	Sleep(200)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token",ShareCode.APP_TOKEN)
	params.Put("_user",ShareCode.SESS_OPER_User)
	params.Put("_keyCar",newtagcode)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
	Dim data As String =   JSON.ToPrettyString(1)
	Log(data)
	Dim Job As HttpJob
	Job.Initialize("",Me)
		
	'Job.PostString(ShareCode.APP_URL & "api/" & ShareCode.APP_ConfirmUser, data )
	Dim ConfUser As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/mobile/user/carchange"$
	Log(ConfUser)
	Job.PostString(ConfUser, data )
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log($"Carro alterado: ${newtagcode}"$)
	End If
	Job.Release
	
	Dim nSQL As String = $"Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo,  ifnull(a.vehicle_tagcode,'') As vehicle_tagcode,
			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, a.*
			from dta_technicals as a
			left join dta_objects as d on (d.tagcode=a.vehicle_tagcode)
			left join dta_objects_fields as e1 on (e1.object_tagcode=d.tagcode and e1.field_tagcode='FIELD_MARCA')
			left join dta_objects_fields as e2 on (e2.object_tagcode=d.tagcode and e2.field_tagcode='FIELD_MODELO')
			left join dta_objects_fields as e3 on (e3.object_tagcode=d.tagcode and e3.field_tagcode='FIELD_MATRICULA')
			left join dta_objects_fields as e4 on (e4.object_tagcode=d.tagcode and e4.field_tagcode='FIELD_KM')
			where a.tagcode='${ShareCode.SESS_User}'"$  
	Log(nSQL)
	Dim Record As Cursor = Starter.LocalSQLEVC.ExecQuery(nSQL)
	Dim tagcode As String = ""
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim vehicleplate As String = Utils.IfNullOrEmpty(Record.GetString("vmatricula"), "")
		Dim vehicle As String = Utils.IfNullOrEmpty(Record.GetString("vmarca"), "")
		Dim vmodel As String = Utils.IfNullOrEmpty(Record.GetString("vmodelo"), "")
		Dim tagcode As String = Utils.IfNullOrEmpty(Record.GetString("tagcode"), "")
		Dim vehicle_tagcode As String = Utils.IfNullOrEmpty(Record.GetString("vehicle_tagcode"), "")

	End If
	Record.Close
	
	If (Utils.NNE(tagcode)) Then
		CurrentCarID = Types.NewAutoIdentification(tagcode, vehicle_tagcode, vehicleplate, vehicle, vmodel)		
		CreateUserDetailsData(True, CurrentCarID)
	
	End If
	
End Sub

Sub GroupCollpseExpand_Click
	Dim this As B4XView = Sender
	If (CurrentGroupItem <> this.Tag) Then 
		If Not(Utils.isNullOrEmpty(this.tag)) Then CurrentGroupItem = this.tag
	End If
	Dim p As B4XView = UserListView.GetPanel(CurrentGroupItem)
	If p.Tag = True Then
		UserListView.CollapseItem(CurrentGroupItem)
	Else
		UserListView.ExpandItem(CurrentGroupItem)
	End If
End Sub

Sub butUserConfirmData_Click
	Dim remainingItems As Int = ProductsToConfirm-ConfirmedProducts
	If (remainingItems > 0) Then
		Dim i As Int
		i = Msgbox2(ShareCode.userAskConfirmProducts, ShareCode.GeneralAlertTitle, ShareCode.Option_CONTINUE, ShareCode.Option_CANCEL, ShareCode.userOptionConfirmProduct,  Null)
		If (i=DialogResponse.POSITIVE) Then
			DBStructures.UpdateWorkingDayStatus(ShareCode.SESS_UWDUKEY, ShareCode.SESS_User, 1, 0)
		Else If (i=DialogResponse.NEGATIVE) Then
			DBStructures.UpdateWorkingDayStatus(ShareCode.SESS_UWDUKEY, ShareCode.SESS_User, 1, 1)
		Else
		End If
	Else
		Dim i As Int
		i = Msgbox2(ShareCode.userAskConfirmUserData, ShareCode.GeneralAlertTitle, ShareCode.Option_CONTINUE, ShareCode.Option_CANCEL, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			DBStructures.UpdateWorkingDayStatus(ShareCode.SESS_UWDUKEY, ShareCode.SESS_User, 1, 1)
		End If
	End If
	DBStructures.CheckWorkingDayTasks
	WindowStatusUpdate
End Sub

Sub butUserUnavailable_Click
	'dialog_userUnavailable
	If (ShareCode.USR_STATE = 1) Then
		Dim durations As List
		durations.Initialize
		durations.Add(ShareCode.userdurationsHoje)
		durations.Add(ShareCode.userdurationsVarios)
		
		Dim reasons As List
		reasons.Initialize
		reasons.Add(ShareCode.userreasonsMedico)
		reasons.Add(ShareCode.userreasonsAssist)
		reasons.Add(ShareCode.userreasonsDoente)
		reasons.Add(ShareCode.userreasonsOutras)
		
		Dim Filter As AppDialogs
		Filter.Initialize
		Filter.getUserUnavailableDialog("User", durations, reasons)
	Else
'		Dim i As Int
'		i = msgbox2("Deseja voltar a tornar a disponibilidade activa?", "Nota!", "Sim", "Não", "", Null, False)
'		If (i=DialogResponse.POSITIVE) Then
'			MakeAvailable
'		End If
		CallUnavailableChange
	End If
End Sub


Sub MakeUnavailable(unv As Unavailable)
	ProgressDialogShow(ShareCode.userAguardeumMomento)
	
	Log("**********************************")
	Log("	GRAVA INDISPONIBILIDADE")
	Log("**********************************")
	ShareCode.USR_STATE = 0
	DBStructures.updateUserAvailableState(ShareCode.SESS_OPER_User, ShareCode.USR_STATE)
	DBStructures.insertUserUnavailable(ShareCode.SESS_OPER_User, unv.StartDate, unv.EndDate, unv.Reason)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_tagcode", ShareCode.SESS_OPER_User)
	params.Put("_state", 0)
	params.Put("start_date", unv.StartDate)
	params.Put("end_date", unv.EndDate)
	params.Put("reason", unv.Reason)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Log("**********************************")
	Log("	CHAMA API")
	Log("**********************************")
'	Utils.CallApi(0, params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/mobile/user/available"$, "UnavReturn")
	
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/mobile/user/available"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Utils.CallApi(0, params, Me, Url, "UnavReturn", "")
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(250)

	Utils.LogUserAction("TUSRLGOT_5", Me)
'	Sleep(500)
'	
'	'Dim RReasons As List = Regex.Split("\|", "Consulta médica|Assistência à família|Doente/Mal estar|Outras razões" )
'	'Dim Razao As String = $"reason=>'${RReasons.Get(unv.Reason)}'"$
'	Dim Job As HttpJob = Utils.CallJobAPI(ShareCode.APP_AvailableUser, _
'						Utils.ListOfPairs( _
'						Array As String($"_tagcode=>"$, $"=>0"$, _
'						$"=>"$, _ 
'						$"=>${}"$, _
'						$"=>${n}"$), ""), Me, "Unavailable")
'	
'	Wait For (Job) JobDone(Job As HttpJob)
'	If Job.Success Then
'		Dim Status As Int = Utils.JobAPIStatus(Job)
'		If Status = 1 Then
'			ShareCode.USR_STATE = 0
	''			DBStructures.updateUserAvailableState(ShareCode.SESS_OPER_User, ShareCode.USR_STATE)
	''			DBStructures.insertUserUnavailable(ShareCode.SESS_OPER_User, unv.StartDate, unv.EndDate, unv.Reason)
'			'butUserUnavailable.Color = Consts.ColorOrange
'			
'			WindowStatusUpdate
'		End If
'	Else

'	End If
'	Job.Release
	WindowStatusUpdate
	ProgressDialogHide
End Sub


Sub MakeUnavailable2(unv As Unavailable2)
	ProgressDialogShow(ShareCode.userAguardeumMomento)
	
	Log("**********************************")
	Log("	GRAVA INDISPONIBILIDADE")
	Log("**********************************")
	ShareCode.USR_STATE = 0
	DBStructures.updateUserAvailableState(ShareCode.SESS_OPER_User, ShareCode.USR_STATE)
	DBStructures.insertUserUnavailable(ShareCode.SESS_OPER_User, unv.StartDate, unv.EndDate, unv.Reason)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_tagcode", ShareCode.SESS_OPER_User)
	params.Put("_state", 0)
	params.Put("start_date", unv.StartDate)
	params.Put("end_date", unv.EndDate)
	params.Put("reason", unv.Reason)
	params.Put("cause", unv.Cause)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Log("**********************************")
	Log("	CHAMA API")
	Log("**********************************")
'	Utils.CallApi(0, params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/mobile/user/available"$, "UnavReturn")
	
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/mobile/user/available"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Utils.CallApi(0, params, Me, Url, "UnavReturn", "")
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(250)

	Utils.LogUserAction("TUSRLGOT_5", Me)
	Sleep(500)
	WindowStatusUpdate
	ProgressDialogHide
End Sub

Sub UnavReturn(status As Int)
	If status = 1 Then

		ShareCode.USR_STATE = 0
		WindowStatusUpdate
	Else
		ToastMessageShow(ShareCode.AvisoToastNoUpdateServer, False)
	End If
End Sub

Sub Unavailable(status As Int)
	If status = 1 Then
		ShareCode.USR_STATE = 1
		WindowStatusUpdate
	Else
		ToastMessageShow(ShareCode.AvisoToastNoUpdateServer, False)
	End If
End Sub

'Sub MakeAvailable
'	ProgressDialogShow("Aguarde um momento ...")
'	Dim Job As HttpJob = Utils.CallJobAPI(ShareCode.APP_AvailableUser, _
'						Utils.ListOfPairs( _
'						Array As String($"_tagcode=>${ShareCode.SESS_User}"$, $"_state=>1"$), ""), Me, "Unavailable")
'	
'	Wait For (Job) JobDone(Job As HttpJob)
'	If Job.Success Then
'		Dim Status As Int = Utils.JobAPIStatus(Job)
'		If Status = 1 Then
'			ShareCode.USR_STATE = 1
'			DBStructures.updateUserAvailableState(ShareCode.SESS_User, ShareCode.USR_STATE)
'			
'			'butUserUnavailable.Color = Consts.ColorBlue
'			WindowStatusUpdate
'		End If
'	Else
'	End If
'	Job.Release
'	ProgressDialogHide
'End Sub

Sub CancelUnavailable
	Log("Canceled")
End Sub

Sub ButtonUserUnavailable_Click
	CallUnavailableChange
End Sub

Public Sub CallUnavailableChange
	
	Msgbox2Async(ShareCode.UserGoAvailableMessage, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null,False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Dim cli As AppDialogs
		cli.Initialize
		cli.MakeUserAvailable("User")
		butUserUnavailable.TextColor = Colors.Black
		butUserEstadoAction.TextColor = Colors.Black
		ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
		lblEstadoUserJornada.Text = "Disponível"
	End If
End Sub

Sub ButtonListConfirm_Click
	If (ShareCode.UWDUKEY_PRODUCTS =0) Then
		Dim b As Button = Sender
		Dim p As Panel = b.Parent
		If (b.Tag = 0) Then
			b.Tag = 1
			b.TextColor = Consts.ColorGreen
		Else 
			b.Tag = 0
			b.TextColor = Consts.ColorLightSilver
		End If
		DBStructures.UpdateOrCreateWorkDayProduct(ShareCode.SESS_UWDUKEY, p.tag, b.Tag, "")
	End If
End Sub

Sub ButtonListNotConfirm_Click
	If (ShareCode.UWDUKEY_PRODUCTS =0) Then
		Dim b As Button = Sender
		Dim p As Panel = b.Parent
		Dim n As String = ""
		If (b.Tag = 0) Then
			b.Tag = 2
			b.TextColor = Consts.ColorRed
			
			Msgbox2Async(ShareCode.userAskProductAusente, ShareCode.GeneralAlertTitle, ShareCode.userOptionSimAusente, ShareCode.Option_CANCEL, ShareCode.userOptionOutrasRazoes,  Null, False)
			Wait For Msgbox_Result (Result As Int)
			If Result = DialogResponse.POSITIVE Then
				n = "Produto ausente"
			Else If (DialogResponse.NEGATIVE) Then
				n = "Outras razões"
			Else
				n = "Sem justificação"
			End If
		Else
			b.Tag = 0
			b.TextColor = Consts.ColorLightSilver
		End If
		DBStructures.UpdateOrCreateWorkDayProduct(ShareCode.SESS_UWDUKEY, p.tag, b.Tag, n)
	End If
End Sub

Sub ConfirmedProducts As Int
	Dim ret As Int = 0
	If Not(ShareCode.ISPHONE) Then
		For i=0 To listEquipments.GetSize-1
			Dim p As Panel = listEquipments.GetPanel(i)
			Dim b1 As Button = p.GetView(7) 'ButtonListConfirm
			Dim b2 As Button = p.GetView(8) 'ButtonListNotConfirm
			If (b1.Tag > 0) Or (b2.Tag > 0) Then ret = ret + 1
		Next
	End If
	Return ret
End Sub

Sub EditEquipSearch_TextChanged (Old As String, New As String)
	
End Sub

Sub EditEquipSearch_EnterPressed
	MakeEquipmentListSearch(EditEquipSearch.Text)
End Sub

Sub butEquipSearch_Click
	MakeEquipmentListSearch(EditEquipSearch.Text)
End Sub

Sub MakeEquipmentListSearch(search As String)
	Private Record As Cursor
	Dim sSQL As String = $"select a.*, ifnull(b.status, 0) as status from warehouses_items as a left join userinnertasksnolines as b on (b.product_tagcode=a.tagcode and b.tagcode='${ShareCode.SESS_User}')
 							where a.warehouse='${ShareCode.SESS_WareHouse}' "$
							'$"Select * from warehouses_items where warehouse='${ShareCode.SESS_WareHouse}'"$
	If (search <> "") Then
		sSQL = $"${sSQL} and a.title||a.value||a.notes like '%${search}%'"$
		'Select * from warehouses_items where title||value||notes like '%${search}%' and warehouse='${ShareCode.SESS_WareHouse}'"$
	End If
	Record = Starter.LocalSQL.ExecQuery(sSQL)
	listEquipments.Clear
	If Record.RowCount > 0 Then
		For Row = 0 To Record.RowCount-1			
			Record.Position = Row
			listEquipments.Add( CreateEquipListItem(Row, Record, listEquipments.AsView.Width, 100dip, Null), "") ', 100dip, "" )
		Next
	End If
	Record.Close
End Sub


'Sub ButtonAddUserEquipment_Click
'	Private Record As Cursor
'	Dim SQL As String = $"select * from equipments where tagcode not in (select equipment_tagcode from equipment2user where user_tagcode='${ShareCode.SESS_User}')"$
'	Record = Starter.LocalSQL.ExecQuery(SQL)
'	If Record.RowCount > 0 Then
'		Dim Filter As AppDialogs
'		Filter.Initialize
'		Filter.getDoubleLineEquipmentsDialog(Activity, "User", "Lista de equipamentos", Record, "")
'	Else
'		MsgboxAsync("Não existem equipamentos disponíveis para substitução!", "Alerta")
'		Record.Close
'	End If
'End Sub



Sub GroupLineDesc_Click
	
End Sub

Sub GroupLineDesc_LongClick
	Dim lbl As Label = Sender
	Dim FileName As String = lbl.Tag
	Dim Continua As Boolean = True
	If Continua Then
'		Private Provider As FileProvider
'		Provider.Initialize
'		Provider.InitializeSafeDir
		'Starter.SharedFolder
		
		Dim intent1 As Intent
		intent1.Initialize(intent1.ACTION_VIEW, Starter.Provider.GetFileUri(FileName))
		intent1.SetType("application/pdf")
		intent1.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION
		
'		
'		Dim theFile As String = Utils.CreateFileProviderUri(FileName)
'		'Dim theFile As String = Starter.SharedFolder &"/"& FileName
'		'Log(theFile)
'		
'		Dim intent1 As Intent
'		'Intent1.Initialize(Intent1.ACTION_VIEW, "file://" & theFile) 'File.DirInternal & Filename)
'		'Starter.SharedFolder, "carta_verde.pdf"
'		'Intent1.Initialize(Intent1.ACTION_VIEW, Utils.CreateFileProviderUri(Starter.SharedFolder, FileName))
'		'Intent1.Initialize(Intent1.ACTION_VIEW, Utils.CreateFileProviderUri(Starter.SharedFolder, "carta_verde.pdf"))
'		
'		
'		intent1.Initialize(intent1.ACTION_VIEW, Starter.Provider.SetFileUriAsIntentData(intent1, FileName)) '"file://" & theFile) 'File.DirInternal & Filename)
'		intent1.SetType("application/pdf")
		
		Dim pdfAppsList As List
		pdfAppsList = Utils.QueryIntent(intent1)
		If pdfAppsList.size>0 Then
			StartActivity(intent1)
		End If
	End If
End Sub



Sub mainLogo_Click
	listsButtonClose_Click
End Sub


Sub butGroupCEAdd_Click
	Private Record As Cursor
	Dim SQL As String = $"select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode not in (select equipment_tagcode from dta_equipments_technicals where technical_tagcode='${ShareCode.SESS_User}')"$
	'Dim SQL As String = $"select * from equipments where tagcode not in (select equipment_tagcode from equipment2user where user_tagcode='${ShareCode.SESS_User}')"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Dim Filter As AppDialogs
		Filter.Initialize
		Filter.getDoubleLineEquipmentsDialog(Activity, "User", "Lista de equipamentos", Record, "")
	Else
		MsgboxAsync(ShareCode.userNoEquipmentsReplace, ShareCode.GeneralAlertTitle)
		Record.Close
	End If
End Sub

Public Sub CallMOREActionsAgain(CurrentCLAItem As RequestCLAItem)
	GoBackMOREActions = True
	'GroupLineAutoChange_Click
	Dim tgo As String = "TSKT-0003"
	
	If (ShareCode.SESS_CurrentCarObject.IsInitialized) Then
		Dim CarObj As CarObject = ShareCode.SESS_CurrentCarObject
	Else
		Dim CarObj As CarObject = Types.ClearedCarObject
	End If

	Dim sSQL As String = $"select * from alerts where tagcode='${tgo}'"$
	Private Record As Cursor
	Record = Starter.LocalSQL.ExecQuery($"${sSQL}"$)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim ItemStatus As Int = Record.GetInt("itemstatus")
		Dim Filter As AppActionDialogs
'		Private CurrentRecord As Cursor = Record
		Filter.Initialize
		Filter.GetFastActionDialog(Activity, CurrentCLAItem, "Verificação de viatura", CurrentCLAItem.Answer, tgo, ItemStatus, False, CarObj)
	Else
		Record.Close
	End If
End Sub

Sub GroupLineAutoChange_Click
'	Dim btn As Button = Sender
	
	Private Record As Cursor
	Dim SQL As String = $"Select ifnull(a.value, '0') as vkm 
			from dta_objects_fields as a  where a.field_tagcode='FIELD_KM' and object_tagcode='${CurrentCarObject.obj}'"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		CurrentCarObject.km = Record.GetLong("vkm")
	End If
	Record.Close
	Dim CarObj As CarObject = CurrentCarObject 'btn.tag
	
	'Dim lst As List = Regex.Split("\|", btn.Tag)
	Dim tgo As String = "TSKT-0003"
	If (GoBackMOREActions) Then
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(tgo,tgo,tgo,tgo,tgo,tgo,0,0,0, "Verificação de viatura", "", _
							"GET_MORE_ACTIONS", 1, 0, 0, _
							CurrentCarObject.obj, DBStructures.DB2CLATaskItem("", ""), "")
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(tgo,tgo,tgo,tgo,tgo,tgo,0,0,0, "Verificação de viatura", "", "", 1, 0, 0, _
							CurrentCarObject.obj, DBStructures.DB2CLATaskItem("", ""), "")
	End If

	
	Dim sSQL As String = $"select * from alerts where tagcode='${tgo}'"$
	Private Record As Cursor
	Record = Starter.LocalSQL.ExecQuery($"${sSQL}"$)
	If Record.RowCount > 0 Then
		Record.Position = 0
		'Private CurrentRecord As Cursor = Record
		Dim Status As Int = Record.GetInt("status_id")
		If (Status=1) Then
			Dim Filter As AppActionDialogs
			Filter.Initialize
			'Filter.GetFastActionDialog(Activity, CLAItem, "Verificação de viatura", $"Viatura com matricula ${lst.Get(1)} sem danos a registar?"$, tgo, 0, False) 'CurrentImageList)
			Filter.GetFastActionDialog(Activity, CLAItem, "Verificação de viatura", $"Viatura com matricula ${CarObj.plate} sem danos a registar?"$, tgo, 0, False, CarObj) 'CurrentImageList)
		Else
			Dim ItemStatus As Int = Record.GetInt("itemstatus")
			Dim ItemDesc As String = "A verificação da viatura já foi realizada, sem registo de danos!"
			If (ItemStatus = 2) Then 
				ItemDesc = "A verificação da viatura já foi realizada, com registo de danos!"
			End If
			Dim i As Int
			i = Msgbox2($"${ItemDesc} ${ShareCode.userChoiceOptionAvailable}"$, ShareCode.GeneralNoteTitle, ShareCode.userOptionVerAccao, ShareCode.Option_CANCEL, ShareCode.userOptionReExecuteAccao,  Null)
			If (i=DialogResponse.POSITIVE) Then
				Dim Filter As AppActionDialogs
				Filter.Initialize
				Filter.GetFastActionDialog(Activity, CLAItem, "Verificação de viatura", $"Viatura com matricula ${CarObj.plate} sem danos a registar?"$, tgo, ItemStatus, True, CarObj)
			Else If (i=DialogResponse.NEGATIVE) Then
				Dim Filter As AppActionDialogs
				Filter.Initialize
				Filter.GetFastActionDialog(Activity, CLAItem, "Verificação de viatura", $"Viatura com matricula ${CarObj.plate} sem danos a registar?"$, tgo, ItemStatus, False, CarObj)
			End If
		End If
	Else
		Record.Close
	End If
	Record.Close
	
End Sub

Sub ButtonActionPause_Click
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		'Starter.AppState.WriteBool("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
		Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			ShareCode.SESS_IN_PAUSE = 0
			Starter.AppState.WriteInteger("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
			Starter.AppState.Flush
			'butUserPauseAction.Enabled = True
			butUserPauseAction.TextColor = Consts.ColorOrange
		End If
	End If
	WindowStatusUpdate
End Sub


Sub GroupLineClickUser_Click
	Dim pnl As Panel = Sender
	Dim pnl1 As Label = pnl.GetView(0)
	' VERIFICA SE EXISTE MAIS DO QUE 1 UTILIZADOR REGISTADO
	If (Utils.DBDataCount(Starter.LocalSQLWRK, $"select count(0) as COUNTER from loc_userssession where session='${Starter.LocalSessionCode}'"$) > 1) Then
		' VERIFICA SE NÃO É O UTILIZADOR JÁ EM SESSÃO OPERACIONAL
		If (ShareCode.SESS_OPER_User <> pnl1.Tag) Then
			ChangeUserOperation(pnl1.tag)
		End If
	End If 
End Sub

Sub ChangeUserOperation(tagcode As String)
	'MsgboxAsync(tagcode, "tagcode")
	Dim i As Int = Msgbox2(ShareCode.UserWorkSessionChange, ShareCode.GeneralNoteTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
	If (i=DialogResponse.POSITIVE) Then
		
		userPhoto.Background = Null
		
		Dim nSQL As String = $"select a.*, ifnull(c.photo, ifnull(a.foto, '')) as photo 
			from dta_technicals as a
			inner join aut_users as b on (b.tagcode=a.user_tagcode)
			inner join aut_users_details as c on (c.user_tagcode=a.user_tagcode)
			where a.tagcode='${tagcode}'"$   
		Log(nSQL)
		Private Row As Int = 0
		Private Record As Cursor
		Record = Starter.LocalSQLEVC.ExecQuery(nSQL)
		If Record.RowCount > 0 Then
			Record.Position = Row
			Dim userCodeName As String = Utils.IfNullOrEmpty(Record.GetString("username"), "")
			Dim photo As String = Utils.IfNullOrEmpty(Record.GetString("photo"), "")
			Dim title As String = Utils.IfNullOrEmpty(Record.GetString("jobtitle"), "")
			Dim tagcode As String = Utils.IfNullOrEmpty(Record.GetString("tagcode"), "")
			Dim name As String = Utils.IfNullOrEmpty(Record.GetString("title"), "")
		End If
		Record.Close
	
		userCategory.text = title
		userCode.Text = userCodeName
'		userCompany.text = "Santa Casa de Misericordia de Setubal"
		userName.text = name
		userTagcode.text = tagcode
		If Not(Utils.isNullOrEmpty(photo)) Then
			photo = photo.Replace("data:image/png;base64,", "")
			userPhoto.SetBackgroundImage(Utils.B64ToBitmap(photo))
		End If
		
'		Dim photo As String = ""
'		Dim title As String = ""
'		'Dim tagcode As String = ""
'		Dim name As String = ""
'		Dim userCodeName As String = ""
'		Private Row As Int = 0
'		Private Record As Cursor
'		Dim nSQL As String = $"Select * from User where tagcode='${tagcode}'"$
'		Record = Starter.LocalSQL.ExecQuery(nSQL)
'		If Record.RowCount > 0 Then
'			Record.Position = Row
'			Dim userCodeName As String = Utils.IfNullOrEmpty(Record.GetString("username"), "")
'			Dim photo As String = Utils.IfNullOrEmpty(Record.GetString("photo"), "")
'			Dim title As String = Utils.IfNullOrEmpty(Record.GetString("title"), "")
'			'Dim tagcode As String = Utils.IfNullOrEmpty(Record.GetString("tagcode"), "")
'			Dim name As String = Utils.IfNullOrEmpty(Record.GetString("name"), "")
'		End If
'		Record.Close
'		userCategory.text = title
'		userCode.Text = userCodeName
'		userCompany.text = "Demo"
'		userName.text = name
'		userTagcode.text = tagcode
'		If Not(Utils.isNullOrEmpty(photo)) Then
'			userPhoto.SetBackgroundImage(Utils.B64ToBitmap(photo))
'		End If

		ShareCode.SESS_OPER_User = tagcode
		ShareCode.SESS_OPER_UserName = name
		ShareCode.SESS_OPER_UWDUKEY = userCodeName
		WindowStatusUpdate
	End If
End Sub


Sub butGroupURegisterAdd_Click
	DialogLogin.getLoginDialog2("User")
End Sub

Sub SetLoginRegister(uname As String, upass As String)
	'MsgboxAsync($"Novo utilizador registado: ${uname}"$, "Nota")
	Dim OK As Boolean = False
	ShareCode.APP_URL  = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/"$
	' VERIFICA SE OS VALORES ESTÃO EM BRANCO OU NÃO
	' VERIFICA SE O CÓDIGO DE UTILIZADOR É DIFERENTE DO CÓDIGO INSERIDO
	' VERIFICA SE O UTILIZADOR ESTÁ REGISTADO EM WEB/LOCAL
	' CONFIRMA DADOS
	If ((uname <> "") And (upass <> "")) Then
		If (uname <> ShareCode.SESS_UWDUKEY) Then
			If ShareCode.APP_WORKING_LOCAL Then
				
				Private Row As Int = 0
				Private Record As Cursor
				Dim SQLScript As String = $"Select name, tagcode, warehouse, available from User where username='${uname}' and password='${upass}'"$
				Record = Starter.LocalSQL.ExecQuery(SQLScript)
				If Record.RowCount > 0 Then
					Record.Position = Row
					If (Record.GetString("name") <> "") Then
						
						' VERIFICA SE O UTILIZADOR JÁ ESTÁ REGISTADO OU NÃO
						If Not(Utils.DBDataExists(Starter.LocalSQLWRK, $"select * from loc_userssession where session='${Starter.LocalSessionCode}' and username='${uname}'"$)) Then
							OK = True
							Dim params As Map
							params.Initialize
							params.Put("session", Starter.LocalSessionCode)
							params.Put("username", uname)
							params.Put("tagcode", Record.GetString("tagcode"))
							params.Put("name", Record.GetString("name"))
							params.Put("active", 1)
							params.Put("login", 0)
							Dim InsertList As List
							InsertList.Initialize
							InsertList.Add(params)
							DBUtils.InsertMaps(Starter.LocalSQLWRK, "loc_userssession", InsertList)
						Else
							MsgboxAsync(ShareCode.userAlreadyRegistered, ShareCode.GeneralAtentionTitle)
						End If
					Else
						MsgboxAsync(ShareCode.userIncorrectInfo, ShareCode.GeneralAtentionTitle)
					End If
				Else
					Dim i As Int = Msgbox2(ShareCode.userInvalidLogin, ShareCode.GeneralAtentionTitle, ShareCode.Option_TRY, ShareCode.Option_CANCEL, "", Null)
					If (i=DialogResponse.POSITIVE) Then
						DialogLogin.getLoginDialog2("User")
					End If
				End If
			Else
				If Not(Utils.DBDataExists(Starter.LocalSQLWRK, $"select * from loc_userssession where session='${Starter.LocalSessionCode}' and username='${uname}'"$)) Then
					
					
					Dim CallAgain As Boolean = False
				
					Dim params As Map
					params.Initialize
					params.Clear
					params.Put("_token",ShareCode.APP_TOKEN)
					params.Put("_user", uname)
					params.Put("_key", upass)
					params.Put("versionTagcode", Main.VersionTagcode)
					params.Put("_authorization", Main.DeviceAuthorization)
					params.Put("_instance", Main.DeviceInstance)
					params.put("_deviceBrand", Main.DeviceBrand)
					params.put("_deviceModel", Main.DeviceModel)
					params.put("_deviceMacAddress", Main.DeviceMacAddress)
					Dim sccommand As String = $"username='${uname}', password='${upass}'"$
					Log(sccommand)
			
					Dim JSON As JSONGenerator
					JSON.Initialize(params)
					Dim data As String =   JSON.ToPrettyString(1)
					Log(data)
					Dim Job As HttpJob
					Job.Initialize("",Me)
		
					'Job.PostString(ShareCode.APP_URL & "api/" & ShareCode.APP_ConfirmUser, data )
					Dim ConfUser As String = ShareCode.APP_URL & ShareCode.APP_ConfirmUser
					Log(ConfUser)
					Job.PostString(ConfUser, data )
					Job.GetRequest.SetContentType("application/json")
	
					Wait For (Job) JobDone(Job As HttpJob)
					If Job.Success Then
				
						Log(Job.GetString)
						Dim ResultStr As String = Job.GetString
						Log("================================================================")
						Log("                          AUTENTICAÇÃO                          ")
						Log("================================================================")
						Log(ResultStr)
						Log("================================================================")
				
						Dim JSON1 As JSONParser
						If (Starter.StrFunc.Left(ResultStr, 1) = "[") Then
							ResultStr = Starter.StrFunc.Trim(Starter.StrFunc.Mid(ResultStr, 2, Starter.StrFunc.Len(ResultStr)-1))
						End If
						JSON1.Initialize(ResultStr)
						Dim MapJSON As Map = JSON1.NextObject
						Dim Active As Int = MapJSON.Get("status")
			
						If (Active = 1) Then
							' Verificar e actualizar restantes dados
'							Utils.LogUserAction("TUSRLGOT_10", Me)
'							Sleep(500)
							
							
							Private Record As Cursor
							Dim UserIn As Map = MapJSON.Get("user")
							Dim Name As String = UserIn.Get("title")
							Dim Tagcode As String = UserIn.Get("tagcode")
							Dim WareHouse As String = Utils.IfNullOrEmpty(UserIn.Get("warehouse"), "")
							Dim update_at As String = Utils.IfNullOrEmpty(UserIn.Get("update_at"), "")
							Dim Available As Int = UserIn.Get("available")
							Dim pwdrequest As Int = UserIn.Get("pwdrequest")
					
							Dim tech As Map = MapJSON.Get("tech")
							Dim utech As Map = MapJSON.Get("utech")
							Dim udtech As Map = MapJSON.Get("udtech")
							Private RecordTech As Cursor
							RecordTech = Starter.LocalSQLEVC.ExecQuery($"Select * from dta_technicals where username='${uname}'"$)
							If RecordTech.RowCount > 0 Then
								RecordTech.Position = 0
								Log("... Updating")
								Dim datacheck As String = RecordTech.GetString("updated_at")
								Dim GravaLocal As Int = 0
								If (Utils.IfNullOrEmpty(datacheck, "") <> update_at) Then
									Log("... Make update")
									Dim InsertListm As Map
									InsertListm.Initialize
									InsertListm.Put("username", uname)
									Try
'										DBUtils.UpdateRecord2(Starter.LocalSQLEVC, "dta_technicals", tech, InsertListm)
										Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC, "dta_technicals", tech, InsertListm,uname,"")
										Sleep(100)
										GravaLocal = GravaLocal +1
									Catch
										Log(LastException)
										Utils.logError("Actualizar Técnicos", ShareCode.SESS_OPER_User, LastException)
									End Try
							
									Dim tgcode As String = tech.Get("user_tagcode")
						
									Dim InsertListm As Map
									InsertListm.Initialize
									InsertListm.Put("tagcode", tgcode)
									Try
'										DBUtils.UpdateRecord2(Starter.LocalSQLEVC, "aut_users", utech, InsertListm)
										Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC, "aut_users", utech, InsertListm,uname,"")
										Sleep(100)
										GravaLocal = GravaLocal +1
									Catch
										Log(LastException)
										Utils.logError("Actualizar Utilizadores", ShareCode.SESS_OPER_User, LastException)
									End Try
							
									Dim InsertListm As Map
									InsertListm.Initialize
									InsertListm.Put("user_tagcode", tgcode)
									Try
'										DBUtils.UpdateRecord2(Starter.LocalSQLEVC, "aut_users_details", udtech, InsertListm)
										Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC, "aut_users_details", udtech, InsertListm,uname,"")
										Sleep(100)
										GravaLocal = GravaLocal +1
									Catch
										Log(LastException)
										Utils.logError("Actualizar Detalhes Utilizador", ShareCode.SESS_OPER_User, LastException)
									End Try

								End If
							Else
								Log("... Inserting")
								Dim InsertList As List
								InsertList.Initialize
								InsertList.Add(tech)
								Try
									DBUtils.InsertMaps(Starter.LocalSQLEVC, "dta_technicals", InsertList)
									Sleep(100)
									GravaLocal = GravaLocal +1
								Catch
									Log(LastException)
									Utils.logError("Inserir Técnicos", ShareCode.SESS_OPER_User, LastException)
								End Try
						
						
								Dim InsertList As List
								InsertList.Initialize
								InsertList.Add(utech)
								Try
									DBUtils.InsertMaps(Starter.LocalSQLEVC, "aut_users", InsertList)
									Sleep(100)
									GravaLocal = GravaLocal +1
								Catch
									Log(LastException)
									Utils.logError("Inserir Utilizadores", ShareCode.SESS_OPER_User, LastException)
								End Try
						
								Dim InsertList As List
								InsertList.Initialize
								InsertList.Add(udtech)
								Try
									DBUtils.InsertMaps(Starter.LocalSQLEVC, "aut_users_details", InsertList)
									Sleep(100)
									GravaLocal = GravaLocal +1
								Catch
									Log(LastException)
									Utils.logError("Inserir Detalhes Utilizador", ShareCode.SESS_OPER_User, LastException)
								End Try
							End If
							RecordTech.Close
							
							Dim params As Map
							params.Initialize
							params.Put("session", Starter.LocalSessionCode)
							params.Put("username", uname)
							params.Put("tagcode", Tagcode)
							params.Put("name", Name)
							params.Put("active", 1)
							Dim InsertList As List
							InsertList.Initialize
							InsertList.Add(params)
							DBUtils.InsertMaps(Starter.LocalSQLWRK, "loc_userssession", InsertList)

							OK = True
						Else
							Dim i As Int
							i = Msgbox2(ShareCode.LoginMessage_NOTOK, ShareCode.GeneralErrorTitle, ShareCode.Option_TRY, ShareCode.Option_CANCEL, "", Null)
							If (i=DialogResponse.POSITIVE) Then
								CallAgain = True
							Else If (i=DialogResponse.CANCEL) Then
								OK = False
							Else
								'MsgboxAsync("Apagar", "Aviso!")
								OK = False
							End If
						End If

					Else
						Dim i As Int
						i = Msgbox2(ShareCode.LoginServerError, ShareCode.GeneralErrorTitle, ShareCode.Option_TRY, ShareCode.Option_CANCEL, "", Null)
						If (i=DialogResponse.POSITIVE) Then
							OK = True
							CallAgain = True
						Else If (i=DialogResponse.NEGATIVE) Then
							OK = False
						Else If (i=DialogResponse.CANCEL) Then
							OK = False
						End If
					End If
					Job.Release
				
					If (CallAgain) Then
						DialogLogin.getLoginDialog2("User")
					End If
			
				Else
					MsgboxAsync(ShareCode.userAlreadyRegistered, ShareCode.GeneralAtentionTitle)
				End If

			End If
		Else
			MsgboxAsync(ShareCode.userAlreadyRegistered, ShareCode.GeneralAtentionTitle)
		End If
	Else
		MsgboxAsync(ShareCode.userCodeandPasswordMandatory, ShareCode.GeneralAtentionTitle)
	End If
	
	If (OK) Then
'		Private Row As Int = 0
'		Private Record As Cursor
'		Record = Starter.LocalSQL.ExecQuery($"Select * from User where tagcode='${ShareCode.SESS_User}'"$)
'		If Record.RowCount > 0 Then
'			Record.Position = Row
'			Dim vehicleplate As String = Utils.IfNullOrEmpty(Record.GetString("vehicleplate"), "")
'			Dim vehicle As String = Utils.IfNullOrEmpty(Record.GetString("vehicle"), "")
'			Dim Tagcode As String = Record.GetString("tagcode")
'		End If
'		Record.Close
'		Dim Car As AutoIdentification = Types.NewAutoIdentification(Tagcode, vehicleplate, vehicle)
		CreateUserDetailsData(True, CurrentCarID)
	End If
End Sub

Sub SetLoginRegisterCancel
		
End Sub

Sub butGroupCarChange_Click
	ListOfVehicles
End Sub

Sub butUserPauseAction_Click
	If ShareCode.SESS_IN_PAUSE = 1 Then
		Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			ShareCode.SESS_IN_PAUSE = 0
			Starter.AppState.WriteInteger("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
			Starter.AppState.Flush
			
			If ShareCode.PREVIOUS_STATUS = "ON" Then 
				butUserStartWork.TextColor = Consts.ColorGreen
				ButtonUserUnavailable.Color = Consts.ColorGreen
			Else
				butUserStartWork.TextColor = Consts.ColorRed
				ButtonUserUnavailable.Color = Consts.ColorRed
			End If
		End If
	Else
		Msgbox2Async(ShareCode.AvisoIniciarPausa, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null,False)
		Wait For Msgbox_Result (Result As Int)
		If Result = DialogResponse.POSITIVE Then
			ShareCode.SESS_IN_PAUSE = 1
			Starter.AppState.WriteInteger("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
			Starter.AppState.Flush
		End If
	End If
	
	WindowStatusUpdate
End Sub

Sub ReturnFromCLAI
	WindowStatusUpdate
End Sub

Sub MenuPanelUserButton_Click
	listsTabPanel.ScrollTo(0,False)
	MenuPanel.Visible = False
	Panel1.Visible = True
	mainLabelOptLists.Text = ShareCode.usermainLabelOptListsUser
	
End Sub

Sub MenuPanelDocsButtom_Click
	listsTabPanel.ScrollTo(1,False)
	MenuPanel.Visible = False
	Panel1.Visible = True
	mainLabelOptLists.Text = ShareCode.usermainLabelOptListsDocs
End Sub

Sub MenuPanelConsumablesButton_Click
	listsTabPanel.ScrollTo(2,False)
	MenuPanel.Visible = False
	Panel1.Visible = True
	mainLabelOptLists.Text = ShareCode.usermainLabelOptListsCons
End Sub

Sub MenuPanelOperatorsButton_Click
	listsTabPanel.ScrollTo(3,False)
	MenuPanel.Visible = False
	Panel1.Visible = True
	mainLabelOptLists.Text = ShareCode.usermainLabelOptListsOper
End Sub


Sub listsTabPanel_PageSelected (Position As Int)
	If(ShareCode.ISPHONE And MenuPanel.Visible = False) Then
		If(Position = 0) Then
			mainLabelOptLists.Text = ShareCode.usermainLabelOptListsUser ' Utilizador
		Else If	(Position = 1) Then
			mainLabelOptLists.Text = ShareCode.usermainLabelOptListsDocs ' Documentos
		Else If	(Position = 2) Then
			mainLabelOptLists.Text = ShareCode.usermainLabelOptListsCons ' Consumiveis
		Else If	(Position = 3) Then
			mainLabelOptLists.Text = ShareCode.usermainLabelOptListsOper ' Operacionais
		End If
	End If
	
End Sub

Sub butUserStartWork_Click
	
	If File.Exists(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_ON"$) Then
		MsgboxAsync("A Jornada já foi iniciada",ShareCode.GeneralInfoTitle)
		Return
	End If
	
	Msgbox2Async(ShareCode.MsgUserStartJornada, "JORNADA", ShareCode.Option_YES, "", ShareCode.Option_NO, Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Utils.LogUserAction("TUSRLGOT_20", Me)
		Sleep(250)
		butUserStartWork.TextColor = Consts.ColorGreen
		ButtonUserUnavailable.TextColor = Consts.ColorGreen
		butUserStopWork.TextColor = Colors.Black
		lblEstadoUserJornada.Text = ShareCode.MsgUserMessageJornadaActivo
		ShareCode.PREVIOUS_STATUS = "ON"
		File.WriteString(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_ON"$,Utils.GetCurrDatetime)
	End If
End Sub

Sub butUserStopWork_Click
	If File.Exists(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_ON"$) Then
		File.Delete(Starter.InternalFolder,$"${ShareCode.SESS_OPER_User}_ON"$)
	Else
		MsgboxAsync("A Jornada ainda nao foi iniciada",ShareCode.GeneralInfoTitle)
		Return
	End If
	
	Msgbox2Async(ShareCode.MsgUserStopJornada, "JORNADA", ShareCode.Option_YES, "", ShareCode.Option_NO, Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Utils.LogUserAction("TUSRLGOT_21", Me)
		Sleep(250)
		butUserStartWork.TextColor = Colors.Black
		butUserStopWork.TextColor = Consts.ColorRed
		ButtonUserUnavailable.TextColor = Consts.ColorRed
		lblEstadoUserJornada.Text = ShareCode.MsgUserMessageJornadaInactivo
		ShareCode.PREVIOUS_STATUS = "OFF"
	End If
	
End Sub

Sub butUserEstadoAction_Click
	
	Dim reasons As List
	reasons.Initialize
	reasons.Addall(Array As String("Inicio Jornada","Fim Jornada","Inicio Pausa","Fim Pausa","Indisponibilidade"))
	
	Dim causes As List
	causes.Initialize
	causes.AddAll(Array As String("Avaria/Atraso Transporte", ShareCode.userreasonsDoente,ShareCode.userreasonsMedico, _
	"Tribunal",ShareCode.userreasonsAssist,"Tribunal","Luto","FÉRIAS",ShareCode.userreasonsOutras))
	
	Dim TipoDlg As Int = 0
	
	Dim Filter As AppDialogs

	Filter.Initialize
	Filter.getuserRegistoManualJornada("User", reasons, causes, TipoDlg)
	
End Sub

