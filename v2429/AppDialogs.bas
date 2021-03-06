B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	
	Private DialogFirstName As FloatLabeledEditText
	Private DialogLastName As FloatLabeledEditText
	Private DialogAge As Spinner
	Private CurrentActivityObject As Object
	Private CurrentPosition As Int = 0
	Private CurrentImagesView As List
	Public CurrentSelectedCode As String
	Public SelectedObjectTypeTagcode As String
	
	' **************************************************************
	' REQUEST FILTERS
	' **************************************************************
	Private DialogReqEntity As Spinner
	Private DialogReqTypeRequest As Spinner
	Private DialogReqStartDate As FloatLabeledEditText 'AnotherDatePicker
	Private DialogReqEndDate As FloatLabeledEditText
	Private DialogReqChecklist As Spinner
	
	Private ApplDialog As CustomLayoutDialog
	Private DialogQuantityValue As FloatLabeledEditText
	Private ReturnQuantityValue As Int = 0
	Private ThisActivity As Activity
	Private ThisActivityName As Object
	Private ThisRequestData As RequestData
	
	Private adps As List
	Private butReqEndDate As Button
	Private butReqStartDate As Button
	Private LGO_PasswordMode As Boolean = True
	' **************************************************************
	' LOGIN DIALOG
	' **************************************************************
	Private mainButLoginConfig As Button
	Private mainEditLoginUser As EditText
	Private mainEditLoginPassword As EditText
	Private mainButLoginShowPassword As Button
	Private mainLoginReminder As CheckBox
	
	' **************************************************************
	' UNAVAILABLE REASON DIALOG
	' **************************************************************
	Private DialogReqType As Spinner
	Private DialogReqReason As Spinner
	
	
	' **************************************************************
	' RESET PASSWORD DIALOG
	' **************************************************************
	Private mainEditLoginPasswordConfirm As EditText
	
	Private CurrentTagcode As String = ""
	Private MasterTagcode As String = ""
	Private CurrentCLD As CustomLayoutDialog
	
	' **************************************************************
	' LIST DOUBLE LINE ITEMS DIALOG
	' **************************************************************
	Private lbltitle As Label
	Private lblsubtitle As Label
	Private CLVDialog As CustomListView
	
	
	' **************************************************************
	' LIST VEHICLE ITEMS DIALOG
	' **************************************************************
	Private lblvehicleName As Label
	Private VIDialog As CustomListView
	
	
	' **************************************************************
	' KPI FILTERS
	' **************************************************************
	Private DialogReqPeriodType As Spinner
	
	' **************************************************************
	' ENTITY FILTERS
	' **************************************************************
	Private DialogReqTypeEntity As Spinner
	Private DialogReqName As FloatLabeledEditText
	Private DialogReqAddress As FloatLabeledEditText
	Private DialogReqRegion As Spinner
	Private DialogReqWithRequests As CheckBox
	Private DialogReqLocal As Spinner
	Private DialogReqStatus As Spinner
	
	' **************************************************************
	' OBJECT FILTERS
	' **************************************************************
	' Plus Entities Filters
	Private DialogReqTypeObject As Spinner
	
	
	'dialog_entityAddress (95%x500)
	'dialog_entityGeoReference (755x250)
	
	' **************************************************************
	' ADDRESS DIALOG
	' **************************************************************
	Private DialogAddressType As Spinner
	Private DialogAddressName As FloatLabeledEditText
	Private DialogAddressName2 As FloatLabeledEditText
	Private DialogAddressCity As FloatLabeledEditText
	Private DialogAddressPostalCode As FloatLabeledEditText
	Private DialogAddressLatitude As FloatLabeledEditText
	Private DialogAddressLongitude As FloatLabeledEditText
	
	
	' **************************************************************
	' CONTACT DIALOG
	' **************************************************************
	Private DialogContactType As Spinner
	Private DialogContactName As FloatLabeledEditText
	Private DialogContactTitle As FloatLabeledEditText
	Private DialogContactEmail As FloatLabeledEditText
	Private DialogContactPhone As FloatLabeledEditText
	
	' **************************************************************
	' PROPERTY DIALOG
	' **************************************************************
	
	Private DialogPropertyValue As FloatLabeledEditText
	Private DialogPropertyTitle As Label
	
	' **************************************************************
	' AUTORIZATIONS DIALOG
	' **************************************************************
	Private ConfigEditVersion As Spinner
	Private ConfigEditInstance As FloatLabeledEditText
	Private ConfigEditAuth As FloatLabeledEditText
	Private DialogReqZone As Spinner
	Private DialogReqUpdated As Spinner
	Private butReqEndTime As Button
	Private butReqStartTime As Button
	Private DialogReqStartTime As FloatLabeledEditText
	Private DialogReqEndTime As FloatLabeledEditText
	Private DialogReqTime As Spinner
	Private DialogDevicePhone As Label
	Private DialogDeviceDimension As Label
	Private DialogDeviceDescription As Label
	
	' **************************************************************
	' ACTION DIALOGS
	' **************************************************************
	
	Private ConfigEditOrientation As Spinner
	Private IntputTextField As FloatLabeledEditText
	Private SelectOrientation As Spinner
	Private ListItemsList As CustomListView
	Private ListItemsListChk As CustomListView ' ALTERACAO PC - Para ter 2 lists diferentes
	Private ListItemDesc As Label
	Private butResetApplication As Button
	Private ShowImageView As ImageView
	Private DialogReqRoute As Spinner
	Private leftPreviewImage As Label
	Private rightPreviewImage As Label
	Private lblGroupTitle As Label
	Private lblLineData As Label
	Private lblLineHeader As Label
	Private HiddenListItemLabel As Object
	Private HiddenListItemTagList As TagListType
	Private ParamItemsList As CustomListView
	Private ButParamItem As B4XStateButton
	Private ThisTagItem As TagListType
	
	Private ThisStartDate As Label 
	Private CheckValueEdit As EditText
	Private ValidationButton As Button
	Private ResultDataLabel As Label
	Private ROBut_09 As Button
	Private ROBut_08 As Button
	Private ROBut_07 As Button
	Private ROBut_06 As Button
	Private ROBut_05 As Button
	Private ROBut_04 As Button
	Private ROBut_03 As Button
	Private ROBut_02 As Button
	Private ROBut_01 As Button
	Private EditParamItem As EditText
	Private PushRequestEdit As EditText
	Private ListItemsRequest As CustomListView
	Private LastIndexList As Int = 0
	
	Private TBSingular As ToggleButton
	Private TBPlural As ToggleButton
	Private TBActive As ToggleButton
	Private TBInactive As ToggleButton
	Private TB001 As ToggleButton
	Private TB002 As ToggleButton
	Private TB003 As ToggleButton
	Private TB004 As ToggleButton
	Private TB005 As ToggleButton
	Private CLAObjectList As CustomListView
	Private CancelSelectObjectButton As Button
	Private CLAObjectDesc As EditText
	Private suggestObjectButton As Button
	Private CLAObjectFind As Button
	Private CLAObjectClear As Button
	Private CLAObjectGroupSpinner As Spinner
	Private CLAObjectTypeSpinner As Spinner
	Private createObjectConfirmButton As Button
	Private createObjectCancelButton As Button
	Private ObjectTypeListView As CustomListView
	Private selectObjectPanel As Panel
	Private objectTypePanel As Panel
	Private createObjectPanel As Panel
	Private lblGroupObjectTitle As Label
	Private ObjectsListIndex As Int = 0	
	
	Private OBJ_Types As List
	Private OBJ_Groups As List	
	
'	Private GoogleMaps As GoogleMap
'	Private DialogMap As MapFragment
'	Private rp As RuntimePermissions
	
	
	Private ListViewBluetoothDevices As ListView
	Private Printer As BT_Printer
	Private rp As RuntimePermissions
	Private CurrentPrinterConnected As Object
	Private ButtonAssociated As Button
	Private ButtonScanPrinter As Button
	Private ButtonPrint As Button
	Private PrinterMessage As String
	Private DialogDeviceVersion As Label
		
	Private FilterLabelTipoIntervencao As Label
	Private FilterLabelEntidade As Label
	Private FilterLabelEstadosIntervencao As Label
	Private FilterLabelDataInicio As Label
	Private FilterLabelDataFim As Label
	Private FilterLabelTipoChecklist As Label
	Private FilterLabelRota As Label

	' **************************************************************
	' DIALOGO JORNADA USER
	' **************************************************************
	Private DialogReqCause As Spinner
	Private DialogReqDateRMJ As FloatLabeledEditText
	Private DialogReqTimeRMJ As FloatLabeledEditText
	Private butReqDateRMJ As Button
	Private butReqTimeRMJ As Button
	Private textoRMJ As ACEditText
	Private Painel_Historico_RMJ As Panel
	Private DialogReqReasonRMJ As Spinner
	Private DialogReqCauseRMJ As Spinner
	Private EditTextJustificacaoRMJ As EditText
	
	' **************************************************************
	' DIALOGO FULLTEXT - TIPO 28
	' **************************************************************
	Private BoxEditFullText As EditText
	
	
	' **************************************************************
	' DIALOGO SEARCH - TIPO 29
	' **************************************************************
	Private BoxEditSearchedValue As EditText
	Private PassScript As String
	Private mapList As Map
	Private SearchDummy As String
	Private btnUserFilter As Button
	Private lblSearchChoosenItem As Label
	Private Lista2Search As CustomListView
	Private label2search1 As Label
	Private PassedAct As Activity
	Private StartingRow As Int = 0
	Private NextStartingRow As Int = 0
	Private ReadRows As Int = 25
	
	'OUTROS
	Private ListaOutros As CustomListView
	Private editTextOutros As EditText
	Private lblTitleOutros As Label
	
	' **************************************************************
	' DIALOGO SINCRONISMO MANUAL
	' **************************************************************

	Private sync_manual_Btn_edate As Button
	Private sync_manual_Btn_idate As Button
	Private sync_manual_chk1 As CheckBox
	Private sync_manual_chk10 As CheckBox
	Private sync_manual_chk11 As CheckBox
	Private sync_manual_chk12 As CheckBox
	Private sync_manual_chk2 As CheckBox
	Private sync_manual_chk3 As CheckBox
	Private sync_manual_chk4 As CheckBox
	Private sync_manual_chk5 As CheckBox
	Private sync_manual_chk6 As CheckBox
	Private sync_manual_chk7 As CheckBox
	Private sync_manual_chk8 As CheckBox
	Private sync_manual_chk9 As CheckBox
	Private sync_manual_edate As FloatLabeledEditText
	Private sync_manual_idate As FloatLabeledEditText
	Private sync_manual_Radio_diaria As RadioButton
	Private sync_manual_Radio_seleccao As RadioButton
	Private sync_manual_Radio_todos As RadioButton
	Private sync_manual_warning As Label
	Private sync_manual_chk_docs_templates As CheckBox
	Private BoxEditNumberText As FloatLabeledEditText
	Private BoxEditNumberTextEDIT As EditText
	Private DataVazia As Boolean = True
	
	Private btnUserFilter As Button
	Private lblSearchChoosenItem As Label
	
	' SYNC MANUAL
	Private sync_manual_downloadrunfirstintall As CheckBox
	Private sync_manual_runfirstintall As CheckBox
	Private PanelMestres As Panel
	Private sync_manual_Radio_mestres As RadioButton
	Private DisclaimerMestres As Label
	Private panel_SyncManual_Upload As Panel
	Private panel_SyncManual_Download As Panel
	Private btn_Upload_SyncManual As Button
	Private btn_Download_SyncManual As Button
	Private lstOfflineData As CustomListView
	Private ChkReqOffline As CheckBox
	Private txtReqOffline As EditText
	Private CurrActiv As Activity
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	'Quantidade de produto/peça
	'adps.Initialize
	'adps = Array(DialogReqStartDate, DialogReqEndDate)
	ThisStartDate.Initialize("")
End Sub


' ************************************************************************
' SELECCIONA INTERVENÇÃO
' ************************************************************************
Sub getPushRequestCode(activName As Object, objName As String, title As String)
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "Continuar", "Cancelar", "", Null, True)
	CurrentCLD = ApplDialog
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(60%x, 200dip)
	
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_getvalue")
	
	Wait For (sf) Dialog_Result(Res As Int)
	If Res = DialogResponse.POSITIVE Then
		If Utils.NNE(PushRequestEdit.Text) Then
			Dim ss As String = PushRequestEdit.Text
'			CallSubDelayed3(ThisActivityName, "ReturnFromPushRequest", 1, ss)
			CallSub3(MainMenu, "ReturnFromPushRequest", 1, ss)
		Else
'			CallSubDelayed3(ThisActivityName, "ReturnFromPushRequest", 0, "")
			CallSub3(MainMenu, "ReturnFromPushRequest", 0, "")
		End If
	End If

End Sub

Sub getRequestSelectDialog(activ As Activity, activName As Object, title As String, local As Int)
	ThisActivity = activ
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "Confirmar", "Cancelar", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(70%x, 90%y)
	CurrentCLD = ApplDialog 'sf

	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("request_item_list") 'ListItemsList")")
	LastIndexList = 0

	ShareCode.SESS_UserTeam = DBStructures.SetUserTeamDate(ShareCode.SESS_User, ShareCode.APPDATE_STARTRANGE, ShareCode.APPDATE_ENDRANGE)
	ShareCode.SESS_UserRoute = DBStructures.SetUserRouteDate(ShareCode.SESS_User, ShareCode.APPDATE_STARTRANGE, ShareCode.APPDATE_ENDRANGE)
		
	Dim sSQL As String = DBStructures.EVC_SQL_GETREQUESTS_DATA_NEW
	Dim TechUser As String = ""
	Dim RouteFilter As String = ""
		
	If (Utils.NNE(ShareCode.SESS_UserRoute)) Then
		RouteFilter = $" and (a.route_tagcode not in (${ShareCode.SESS_UserRoute})) "$
	End If
	If Utils.NNE(ShareCode.SESS_UserTeam) Then
		TechUser = $" and (((a.technical_tagcode<>'${ShareCode.SESS_User}') and (a.team_tagcode not in (${ShareCode.SESS_UserTeam}))) ${RouteFilter})"$
	Else
		TechUser = $" and ((a.technical_tagcode<>'${ShareCode.SESS_User}') ${RouteFilter}) "$
	End If
	RouteFilter = Utils.IfNotNullOrEmpty(RouteFilter, "")
		
	sSQL = $"${sSQL} ${TechUser} ${RouteFilter}
				and ((a.execdate_type>=1) or ((a.execdate_type=0) 
				and (a.execute_date>='${ShareCode.APPDATE_STARTRANGE}') 
				and (a.execute_date<='${ShareCode.APPDATE_ENDRANGE}'))) 
				order by a.execute_date, a.execute_start"$
				
	Log("««««««««««««««««««««««««««««««««««««« ------------ »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»")
	Log(sSQL)
				
	Dim items As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If items.RowCount > 0 Then
		For Row = 0 To items.RowCount-1
			items.Position = Row
			ListItemsRequest.Add(createRequestLineItemDetail(activ, items, 45dip), "")
		Next
	End If
	items.Close
	HiddenListItemLabel = ""
	CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = False
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub3(MainMenu, "ReturnFromPushRequestSelect", 1, HiddenListItemLabel)
	End If
End Sub

Sub ListItemsRequest_ItemClick (Index As Int, Value As Object)
	Dim pnl As Panel = ListItemsRequest.GetPanel(Index)
	Dim lbl As Label = pnl.GetView(0)
'	pnl.Color = Consts.ColorBlue
'	pnl.SetColorAnimated(250, Consts.ColorBlue, Consts.ColorBlueDark)
'	pnl.Invalidate
	lbl.Color = Colors.Green   '.SetColorAnimated(250, Consts.ColorBlue, Consts.ColorBlue)
	lbl.Invalidate
	HiddenListItemLabel = lbl.Tag
	Dim oldpnl As Panel = ListItemsRequest.GetPanel(LastIndexList)
	Dim oldlbl As Label = oldpnl.GetView(0)
	oldlbl.Color = Colors.White
	oldlbl.Invalidate
	LastIndexList = Index
	CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = Utils.NNE(HiddenListItemLabel)
End Sub

Sub createRequestLineItemDetail(activ As Activity, items As Cursor, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	'p.LoadLayout("ItemGroupLineDetails" )
	p.LoadLayout("ItemLineRequest" )
	p.RemoveView
	
'	Dim objecttype_desc As String = items.GetString("objecttype_desc")
'	Dim title_import As String = items.GetString("title_import")
	Dim route_title As String = items.GetString("route_title")
	Dim nameobject As String = items.GetString("nameobject")
	Dim request_desc As String = items.GetString("request_desc")
	Dim tagcode As String = items.GetString("tagcode")
	
	If Utils.NNE(route_title) Then
		route_title = $"${route_title} / "$
	End If
	If Utils.NNE(nameobject) Then
		nameobject = $"${nameobject} / "$
	End If
	If Utils.NNE(request_desc) Then
		request_desc = $"${request_desc} / "$
	End If
	Dim sRet As String = $"${route_title}${nameobject}${request_desc}"$
	
	lblLineHeader.text = sRet
	lblLineHeader.tag = tagcode
	p.tag = tagcode
	'lblLineData.text = titledesc
	Return p
End Sub

' ************************************************************************
' OPÇÕES DOS PEDIDOS/INTERVENÇÕES 3PONTINHOS
' ************************************************************************
Sub GetRequestOptionsDialog(activName As Object, title As String, activeList As List, reqData  As RequestData)
	ThisActivityName = activName
	ThisRequestData = reqData
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "", "", Null, True)
	CurrentCLD = ApplDialog
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(60%x, 490dip)
	
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_requestoptions")
	
	If Not(ShareCode.ISPHONE) Then
		ROBut_01.Width = (DialogPanel.Width / 2) - 20
		ROBut_02.Width = ROBut_01.Width
		ROBut_03.Width = ROBut_01.Width
		ROBut_04.Width = ROBut_01.Width
		ROBut_05.Width = ROBut_01.Width
		ROBut_06.Width = ROBut_01.Width
		ROBut_07.Width = ROBut_01.Width
		ROBut_08.Width = ROBut_01.Width
		ROBut_09.Width = ROBut_01.Width
		
		ROBut_04.Left = ROBut_01.Left + ROBut_01.Width + 10
		ROBut_03.Left = ROBut_04.Left
		ROBut_05.left = ROBut_04.Left
		ROBut_08.left = ROBut_04.Left
		ROBut_09.left = ROBut_01.Left
	End If
	
	'TESTE DE CODIGOS DE BARRAS
	If ((ShareCode.APP_DOMAIN.ToLowerCase = "devdemo") Or (ShareCode.APP_DOMAIN.ToLowerCase = "demo") ) Then
		ROBut_09.Visible = True
	Else
		ROBut_09.Visible = False
	End If
	
	For n=0 To activeList.Size-1
		Dim v As Int = activeList.Get(n)
		ROButtonstate(n+1, (v = 1))
	Next

	Wait For (sf) Dialog_Result(Res As Int)
	If Res = DialogResponse.POSITIVE Then
		'
	End If

End Sub

Sub ROButOption_Click
	Dim Btn As Button = Sender
	Dim val As Int = Btn.Tag
		
	CallSubDelayed3(ThisActivityName, "RunRequestOption", val, ThisRequestData)
	CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
End Sub

Sub ROButtonstate(posis As Int, state As Boolean)
	If (posis = 1) Then
		ROBut_01.Enabled = state
		If (state = False) Then ROBut_01.Color = Consts.ColorGray
	Else If (posis = 2) Then
		ROBut_02.Enabled = state
		If (state = False) Then ROBut_02.Color = Consts.ColorGray
	Else If (posis = 3) Then
		ROBut_03.Enabled = state
		If (state = False) Then ROBut_03.Color = Consts.ColorGray
	Else If (posis = 4) Then
		ROBut_04.Enabled = state
		If (state = False) Then ROBut_04.Color = Consts.ColorGray
	Else If (posis = 5) Then
		ROBut_05.Enabled = state
		If (state = False) Then ROBut_05.Color = Consts.ColorGray
	Else If (posis = 6) Then
		ROBut_06.Enabled = state
		If (state = False) Then ROBut_06.Color = Consts.ColorGray
	Else If (posis = 7) Then
		ROBut_07.Enabled = state
		If (state = False) Then ROBut_07.Color = Consts.ColorGray
	Else If (posis = 8) Then
		ROBut_08.Enabled = state
		If (state = False) Then ROBut_08.Color = Consts.ColorGray
		
	End If
End Sub


' ************************************************************************
' FORM DE INFORMAÇÃO
' ************************************************************************
Sub GetDataInfoDialog(activ As Object)
	'CurrentActivityObject = activ
	Dim sf As Object = ApplDialog.ShowAsync("Informação de dados", "Continuar", "", "", Null, False)
	CurrentCLD = ApplDialog
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(80%x, 320dip)
	
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_datainfo")
	
	Wait For (sf) Dialog_Result(Res As Int)
	If Res = DialogResponse.POSITIVE Then
		'
	End If

End Sub

Sub ValidationButton_Click
	Dim curr As Button = Sender
	Dim pnl As Panel = curr.Parent
	Dim edit As EditText = pnl.GetView(0)
	Dim lbl As Label = pnl.GetView(1)
	lbl.Text = ""
	Dim ssTr As String = $"select distinct * from dta_objects where (title_import||tagcode||reference) like '%${edit.Text.Trim}%' "$
	Log(ssTr)
	
	Dim Cursor1 As Cursor = Starter.LocalSQLEVC.ExecQuery(ssTr)
	
	If (Cursor1.RowCount >=1) Then
		For n = 0 To Cursor1.RowCount-1
			Cursor1.Position = n
			lbl.Text = $"${lbl.text}<br> ${Cursor1.GetString("tagcode")}${Cursor1.GetString("title_import")}"$
		Next
	End If
	Cursor1.Close
	edit.Text = ""
End Sub


' ************************************************************************
' ESCOLHE CHECKLIST A CRIAR/DUPLICAR/REPETIR
' ************************************************************************
Sub getCLADDSelectDialog(activ As Activity, activName As Object, title As String, colitems As RequestData, TagList As List)
	ThisActivity = activ
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(70%x, 90%y)
	CurrentCLD = ApplDialog 'sf

	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("task_item_detail_list_chk") 'ListItemsListchk")")
	Dim LastGroup As String = ""
	For Row = 0 To TagList.size-1
		Dim TagItem As TagListType = TagList.Get(Row)
		
		Dim GroupItem As String = TagItem.taggroup
		Dim Groupdesc As String = TagItem.taggroup
		Dim title As String = TagItem.tagname
		Dim tagcode As String = TagItem.tagcode
		If (GroupItem.Trim <> LastGroup.Trim) Then
			LastGroup = GroupItem
			ListItemsListChk.Add( createCLADDGroupLineItemDetail(activ, Groupdesc, 45dip), GroupItem)
		End If
		ListItemsListChk.Add( createCLADDLineItemDetail(activ, tagcode, title, 45dip, TagItem), "")
	Next
	
	HiddenListItemLabel = Types.MakeTagListType( "", "", "")
	HiddenListItemTagList = Types.MakeTagListType( "", "", "")
	CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = False
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub3(ThisActivityName, "ReturnFromListCLADD", colitems, HiddenListItemTagList)
	End If
End Sub

Sub createCLADDGroupLineItemDetail(activ As Activity, title As String, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("ItemGroupTitle" )
	p.RemoveView
	lblGroupTitle.text = Utils.IfNullOrEmpty(title, "(Sem grupo)")
	p.Tag = ""
	Return p
End Sub

Sub createCLADDLineItemDetail(activ As Activity, tagcode As String, title As String, height As Int, TagItem As TagListType) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	'p.LoadLayout("ItemGroupLineDetails" )
	p.LoadLayout("ItemGroupLine" )
	p.RemoveView
	lblLineHeader.text = title
	lblLineHeader.tag = tagcode
	p.tag = TagItem
	'lblLineData.text = titledesc
	Return p
End Sub


' ************************************************************************
' SELECCIONA PARAMETROS DO DISPOSITIVO
' ************************************************************************
Sub getDeviceParamsDialog(activ As Activity, activName As Object, title As String)
	ThisActivity = activ
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "Continuar", "", "Aplicar a todos", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(90%x, 90%y)
	Else
		ApplDialog.SetSize(95%x, 95%y)
	End If
	
	CurrentCLD = ApplDialog 'sf

	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("param_item_list") 
	
	
	ProgressDialogShow2(ShareCode.GeneralLoadingMessage, True)
	Sleep(100)
	
	Dim items As Cursor
	Dim sSQL As String = $"select id, tagcode, title, value_state, value, active, state_in from dta_device_params order by title"$
	
	Dim height As Int = 60dip
	If(ShareCode.ISPHONE) Then
		height = 85dip
	End If
				
	'(Sem identificação)
	items = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If items.RowCount > 0 Then
		For Row = 0 To items.RowCount-1
			items.Position = Row
			Dim title As String = items.GetString("title")
			Dim value_state As Int = items.GetInt("value_state")
			Dim state_in As Int = items.GetInt("state_in")
			Dim VALUE As String = items.GetString("value")
			Dim tagcode As String = items.GetString("tagcode")
			Dim active As Int = items.GetInt("active")
			If (active = 1) Then
				If (Utils.NNE(VALUE)) Then
					ParamItemsList.Add( createParamLineItemEdit(activ, tagcode, title, value_state, VALUE, state_in, 60dip, DialogPanel.Width), "")
				Else
					ParamItemsList.Add( createParamLineItem(activ, tagcode, title, value_state, VALUE, state_in, 60dip, DialogPanel.Width), "")
				End If
			End If
		Next
	End If
	items.Close
	'HiddenListItemLabel = ""
	'CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = False
	ProgressDialogHide
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		updateAllFlags
	Else If res = DialogResponse.NEGATIVE Then
		updateAllFlags
		updatedeAllFlagsServer
	End If
End Sub

Sub updateAllFlags
	'CallSub2(ThisActivityName, "ObjectSelected", HiddenListItemLabel)
	ShareCode.DEVICE_ONLY_TECHORUSER 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_ONLY_TECHORUSER"), 1)
	ShareCode.DEVICE_SHOW_REQUEST_ID 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_SHOW_REQUEST_ID"), 0)
	ShareCode.DEVICE_PARAM_DATA_CONFIRM 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_DATA_CONFIRM"), 0)
	ShareCode.DEVICE_PARAM_AVAILABILITY 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_AVAILABILITY"), 0)
	ShareCode.DEVICE_PARAM_FAVORITES 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_FAVORITES"), 0)
	ShareCode.DEVICE_PARAM_PAUSE_REQUEST 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PAUSE_REQUEST"), 1)
	ShareCode.DEVICE_PARAM_PAUSE_TECH 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PAUSE_TECH"), 0)
	ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION = Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_UPLOAD_ONEXECUTION"), 1)
	ShareCode.DEVICE_REQUEST_AUTOUPDT_ONALERT 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_AUTOUPDT_ONALERT"), 0)
	ShareCode.DEVICE_AS_SEND_IMMEDIATLY 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AS_SEND_IMMEDIATLY"), 1)
	ShareCode.DEVICE_REQUEST_HIDECANCELED 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_HIDECANCELED"), 0)
	ShareCode.DEVICE_AUTOUPDATE_ONLOGIN 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AUTOUPDATE_ONLOGIN"), 0)
	ShareCode.DEVICE_AUTO_EXPAND_FIRST 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AUTO_EXPAND_FIRST"), 0)
	ShareCode.DEVICE_AUTO_EXPAND_CHECKLIST 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AUTO_EXPAND_CHECKLIST"), 0)
	ShareCode.DEVICE_DEFAULT_ROUTE 				= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_DEFAULT_ROUTE"), 0)
	ShareCode.DEVICE_AS_INCLUDE_OBS_FIRST 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_AS_INCLUDE_OBS_FIRST"), 0)
	ShareCode.DEVICE_PARAM_PRINT_DRAFT 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PRINT_DRAFT"), 0)
	ShareCode.DEVICE_SHOW_REQUEST_ROUTE 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_SHOW_REQUEST_ROUTE"), 0)
	ShareCode.DEVICE_REQUEST_PUSH_OTHER 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_PUSH_OTHER"), 0)
	ShareCode.DEVICE_PARAM_PHOTO_QUALITY 		= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_QUALITY", "value"), 90)
	ShareCode.DEVICE_REOPEN_CHECKLISTS 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REOPEN_CHECKLISTS"), 1)
'	ShareCode.REQUEST_REOPEN_ONLY_ORANGE		= Utils.IfNullOrEmpty(DBStructures.getParamState("REQUEST_REOPEN_ONLY_ORANGE"), 0)
	
	ShareCode.DEVICE_REQUEST_SIGNATURE_TRG 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_SIGNATURE_TRG"), 0)
	ShareCode.DEVICE_REQUEST_PUSH_OTHER_AUTH 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_PUSH_OTHER_AUTH"), 0)
	ShareCode.DEVICE_PARAM_ORIENTATION 			= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_ORIENTATION"), 0)
	ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE 		= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_FONTSIZE", "value"), 12)
	ShareCode.DEVICE_PARAM_PHOTO_HEIGHT 		= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_HEIGHT", "value"), 615)
	ShareCode.DEVICE_PARAM_PHOTO_WIDTH 			= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_WIDTH", "value"), 820)
	ShareCode.DEVICE_REQUEST_CAN_DELETE_OWNED 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_REQUEST_CAN_DELETE_OWNED"), 1)
	ShareCode.DEVICE_PARAM_PHOTO_FILETYPE 		= Utils.IfNullOrEmpty(DBStructures.getParamStateField("DEVICE_PARAM_PHOTO_FILETYPE", "value"), "PNG")
	ShareCode.DEVICE_PARAM_PULL 				= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_PULL"), 0)
	ShareCode.DEVICE_PARAM_ROUTES 				= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_ROUTES"), 0)

	ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_GENERATEREPORT"), 1)

	ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_RESYNC_REQUESTS"), 1)
	ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_RUNCL_NOTYPEREQUEST"), 1)
	ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_FOTO_EVIDENCE"), 1)
	ShareCode.DEVICE_PARAM_DRAW_EVIDENCE 		= Utils.IfNullOrEmpty(DBStructures.getParamState("DEVICE_PARAM_DRAW_EVIDENCE"), 1)

	ShareCode.DEVICE_PARAM_SENDREPORT 					= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_SENDREPORT"), 1)
	ShareCode.DEVICE_PARAM_CANCHANGE_OBJECT 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_CANCHANGE_OBJECT"), 1)
	ShareCode.DEVICE_PARAM_CANCHANGE_ENTITY 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_CANCHANGE_ENTITY"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_CANDUPLICATE 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_CANDUPLICATE"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_ASSIGNTO 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_ASSIGNTO"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE"), 0)
	ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE"), 0)
	ShareCode.DEVICE_PARAM_ADDITIONAL_USERS_REGISTER 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ADDITIONAL_USERS_REGISTER"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL"), 1)
	ShareCode.DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL"), 1)
	ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_ENDDATE_CONTROL"), 0)
	ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW"), 0)
	
	ShareCode.DEVICE_REQUEST_SHOWNEWICON_ONALERT 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REQUEST_SHOWNEWICON_ONALERT"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB"), 0)
	ShareCode.DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP"), 0)
	ShareCode.DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE"), 0)
	ShareCode.DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT"), 0)
	ShareCode.DEVICE_PARAM_DEFAULT_DATE_PERIOD 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_DEFAULT_DATE_PERIOD"), 0)
	ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REQUEST_SHOW_DATE_DIVIDER"), 0)

	ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE"), 0)
	ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER"), 0)
	ShareCode.DEVICE_ASKTOUPDATE_ONLOGIN 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_ASKTOUPDATE_ONLOGIN"), 0)
	ShareCode.DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY"), 0)
	ShareCode.DEVICE_PARAM_ACCESS_REQUESTS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_REQUESTS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_REPORTS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_REPORTS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_ALERTS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_ALERTS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_OBJECTS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_OBJECTS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_TASKS 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_TASKS"), 1)
	ShareCode.DEVICE_PARAM_ACCESS_MYDATA 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACCESS_MYDATA"), 1)
	ShareCode.DEVICE_REQUEST_CUSTOMORDER 				= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REQUEST_CUSTOMORDER"), 0)
	
	ShareCode.DEVICE_CHECKLIST_STARTON_MYDATA 			= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_STARTON_MYDATA"), 0)
	ShareCode.DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP"), 0)
	
	ShareCode.DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND"), 0)
	ShareCode.DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND"), 0)
	ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE 		= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_ACTIVATE_PRINTMODULE"), 0)
	ShareCode.DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN 	= Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN"), 0)
	ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT"), 0)
	ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION"), 0)
	ShareCode.DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS"), 0)
	ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE"), 0)
		
	ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE = Utils.ifnullorempty(DBStructures.getParamState("DEVICE_PARAM_INVERTED_FOTO_DEVICE"), 0)
	ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE = Utils.ifnullorempty(DBStructures.getParamState("DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE"), 0)
	
	ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_REPORT_DATE_FROM_CHECKLIST"), 1)
		
	ShareCode.DEVICE_TYPEREQUEST_START_NEWWAY = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_TYPEREQUEST_START_NEWWAY"), 0)
	ShareCode.DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY"), 0)
		
	ShareCode.DEVICE_EMAIL_OLD_MODEL = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_EMAIL_OLD_MODEL"), 1)
	ShareCode.EmailOldModel = Utils.Int2Bool(ShareCode.DEVICE_EMAIL_OLD_MODEL)
	ShareCode.DEVICE_SHOW_GLOBAL_SEARCH = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_SHOW_GLOBAL_SEARCH"), 0)
'	ShareCode.DEVICE_SYNC_NEWWAY = Utils.ifnullorempty(DBStructures.getparamstate("DEVICE_SYNC_NEWWAY"), 0)
	
'	If (ShareCode.APP_DOMAIN.ToLowerCase = "printcriativa") Then
'		ShareCode.DEVICE_PARAM_SENDREPORT = 0
'		ShareCode.DEVICE_PARAM_GENERATEREPORT = 0
'	End If
	ShareCode.STS005 = Utils.Int2Bool(ShareCode.DEVICE_REQUEST_HIDECANCELED)
		
	ShareCode.DEVICE_DEF_FONT_SIZE = ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE
	ShareCode.DEVICE_DEF_QUALITY = ShareCode.DEVICE_PARAM_PHOTO_QUALITY
	ShareCode.DEVICE_DEF_IMG_FILETYPE = ShareCode.DEVICE_PARAM_PHOTO_FILETYPE
	ShareCode.DEVICE_DEF_IMG_WIDTH = ShareCode.DEVICE_PARAM_PHOTO_WIDTH
	ShareCode.DEVICE_DEF_IMG_HEIGHT = ShareCode.DEVICE_PARAM_PHOTO_HEIGHT
End Sub

Sub updatedeAllFlagsServer
	Dim thisCursor As Cursor = Starter.LocalSQLEVC.ExecQuery( $"SELECT tagcode, value_state, ifnull(VALUE, '') AS valueout FROM dta_device_params"$ )
	Dim outString As String = ""
	If thisCursor.RowCount >= 1 Then
		For n=0 To thisCursor.RowCount-1
			thisCursor.Position = n
			Dim tagcode As String = thisCursor.GetString("tagcode")
			Dim value_state As Int = thisCursor.GetInt("value_state")
			Dim valueout As String = thisCursor.GetString("valueout")
			If (Utils.NNE(outString)) Then 
				outString = $"${outString}|"$
			End If
			outString = $"${outString}${tagcode},${value_state},${valueout}"$
		Next
	End If
	
	If (Utils.NNE(outString)) Then
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("outString", outString)
		params.Put("ACLSessUser", ShareCode.SESS_OPER_User)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/device/params/update"$
		If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
			If Not(ShareCode.APP_WORKING_LOCAL) Then
				Utils.CallApi(0, params, Me, Url, "", "")
			Else
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
				Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
			End If
			Sleep(250)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
		
	End If
End Sub

Sub createParamLineItem(activ As Activity, tagcode As String, title As String, value_state As Int, VALUE As String, state_in As Int, height As Int, width As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, width, height)
	p.LoadLayout("ParamItmeLine" )
	p.RemoveView
	lblLineHeader.text = title
	Log(VALUE)
	
	ButParamItem.updateButtonState(value_state)
	ButParamItem.State = value_state
	Dim TagControl As String = $"${tagcode}|${value_state}|1"$
	lblLineHeader.tag = TagControl
	ButParamItem.tag = TagControl
	
	If (state_in = 2) Then
		Dim bpan As Panel = lblLineHeader.Parent
		lblLineHeader.Color = Consts.ColorLightSilver
		bpan.Color = Consts.ColorLightSilver
		bpan.Enabled = False
		ButParamItem.Enabled = False
	End If
	
	p.tag = tagcode
	Return p
End Sub


Sub createParamLineItemEdit(activ As Activity, tagcode As String, title As String, value_state As Int, VALUE As String, _
		state_in As Int, height As Int, width As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, width, height)
	p.LoadLayout("ParamItmeLineEdit" )
	p.RemoveView
	lblLineHeader.text = title
	EditParamItem.Text = VALUE
	Log(value_state)

	Dim TagControl As String = $"${tagcode}|${VALUE}|0"$
	lblLineHeader.tag = TagControl
	EditParamItem.tag = TagControl
	
	If (state_in = 2) Then
		Dim bpan As Panel = lblLineHeader.Parent
		lblLineHeader.Color = Consts.ColorLightSilver
		bpan.Color = Consts.ColorLightSilver
		bpan.Enabled = False
		EditParamItem.Enabled = False
	End If
	
	p.tag = tagcode
	Return p
End Sub

Sub ParamItemsList_ItemClick (Index As Int, Value As Object)
	'param_item_list
	'ParamItmeLine
End Sub

Sub ButParamItem_StateClick (State As Int)
	Dim this As B4XStateButton = Sender
	Log(State)
	Dim Pan As Panel = this.Parent
	Dim Pan2 As Panel = Pan.Parent
	Dim sSQL As String = $"update dta_device_params set value_state=${State} where tagcode='${Pan2.Tag}'"$
	Utils.SaveSQLToLog("ButParamItem_StateClick",sSQL, "")
	'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
End Sub


Sub EditParamItem_FocusChanged (HasFocus As Boolean)
	Dim this As EditText = Sender
	Log(HasFocus)
	Dim Pan As Panel = this.Parent
	Dim Pan2 As Panel = Pan.Parent
	Dim sSQL As String = $"update dta_device_params set value='${this.Text}' where tagcode='${Pan2.Tag}'"$
	Utils.SaveSQLToLog("ButParamItem_ValueClick",sSQL, "")
	'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
End Sub

' ************************************************************************
' SELECCIONA IMAGEM
' ************************************************************************
Sub getShowImageViewDialog(activName As Object, title As String, b64Image As String, filename As String)
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "Continuar", "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(780dip, 680dip)
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_ShowImageView")
	
	Dim ContinueDlg As Boolean = True
	If Utils.NNE(b64Image) Then
		ShowImageView.SetBackgroundImage(Utils.B64ToBitmap(b64Image))
	Else if Utils.NNE(filename) Then
		Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, filename, 480dip, 380dip, True)
		ShowImageView.SetBackgroundImage(bg)
	Else
		ContinueDlg = False
	End If
	If ContinueDlg Then
		Wait For (sf) Dialog_Result(res As Int)
		If res = DialogResponse.POSITIVE Then
		End If
	End If
End Sub

Sub getShowImageViewListDialog(activName As Object, images As List)
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync("Informação", "Continuar", "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
'	ApplDialog.SetSize(780dip, 680dip)
	ApplDialog.SetSize(70%x, 90%y)
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_ShowImageView") 
	
	CurrentImagesView = images
	CurrentPosition = 0
	
	leftPreviewImage.Visible = (CurrentImagesView.Size > 1)
	rightPreviewImage.Visible = (CurrentImagesView.Size > 1)
	
	Dim ContinueDlg As Boolean = True
	Dim CurrentImage As ImageViewData = CurrentImagesView.Get(CurrentPosition)
	
	Utils.SetDialogtitle(sf, CurrentImage.filename)
	
	If Utils.NNE(CurrentImage.b64) Then
		ShowImageView.SetBackgroundImage(Utils.B64ToBitmap(CurrentImage.b64))
	Else if Utils.NNE(CurrentImage.filename) Then
		Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, CurrentImage.filename, 780dip, 620dip, True)
		ShowImageView.SetBackgroundImage(bg)
	Else
		ContinueDlg = False
	End If
	
	If ContinueDlg Then
		Wait For (sf) Dialog_Result(res As Int)
		If res = DialogResponse.POSITIVE Then
		End If
	End If
End Sub


Sub getPicturesMapDialog(activName As Object)
'	ThisActivityName = activName
'	Dim sf As Object = ApplDialog.ShowAsync("Informação", "Continuar", "", "", Null, False)
'	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
''	ApplDialog.SetSize(780dip, 680dip)
'	ApplDialog.SetSize(70%x, 90%y)
'	CurrentCLD = ApplDialog 'sf
'	Wait For Dialog_Ready (DialogPanel As Panel)
'	DialogPanel.LoadLayout("dialog_pictures_map")
'	
''	Wait For DialogMap_Ready
''	GoogleMaps = DialogMap.GetMap
''	Sleep(2000)
''	rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
''	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
''	If Result Then
''		GoogleMaps.MyLocationEnabled = True
''	Else
''		Log("No permission!")
''	End If
'	
''	leftPreviewImage.Visible = (CurrentImagesView.Size > 1)
''	rightPreviewImage.Visible = (CurrentImagesView.Size > 1)
''	
'	Dim ContinueDlg As Boolean = True
''	Dim CurrentImage As ImageViewData = CurrentImagesView.Get(CurrentPosition)
''	
''	Utils.SetDialogtitle(sf, CurrentImage.filename)
''	
''	If Utils.NNE(CurrentImage.b64) Then
''		ShowImageView.SetBackgroundImage(Utils.B64ToBitmap(CurrentImage.b64))
''	Else if Utils.NNE(CurrentImage.filename) Then
''		Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, CurrentImage.filename, 780dip, 620dip, True)
''		ShowImageView.SetBackgroundImage(bg)
''	Else
''		ContinueDlg = False
''	End If
'	
'	If ContinueDlg Then
'		Wait For (sf) Dialog_Result(res As Int)
'		If res = DialogResponse.POSITIVE Then
'		End If
'	End If
End Sub


Sub leftPreviewImage_Click
	If (CurrentPosition > 0) Then
		CurrentPosition = CurrentPosition -1
		Dim CurrentImage As ImageViewData = CurrentImagesView.Get(CurrentPosition)
	
		If Utils.NNE(CurrentImage.b64) Then
			ShowImageView.SetBackgroundImage(Utils.B64ToBitmap(CurrentImage.b64))
		Else if Utils.NNE(CurrentImage.filename) Then
			Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, CurrentImage.filename, 780dip, 620dip, True)
			ShowImageView.SetBackgroundImage(bg)
		Else
			CurrentPosition = CurrentPosition +1
		End If
	End If
End Sub

Sub rightPreviewImage_Click
	
	If (CurrentPosition < CurrentImagesView.size-1) Then
		CurrentPosition = CurrentPosition +1
		Dim CurrentImage As ImageViewData = CurrentImagesView.Get(CurrentPosition)
	
		If Utils.NNE(CurrentImage.b64) Then
			ShowImageView.SetBackgroundImage(Utils.B64ToBitmap(CurrentImage.b64))
		Else if Utils.NNE(CurrentImage.filename) Then
			Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, CurrentImage.filename, 780dip, 620dip, True)
			ShowImageView.SetBackgroundImage(bg)
		Else
			CurrentPosition = CurrentPosition -1
		End If
	End If
End Sub


' ************************************************************************
' SELECCIONA OBJECTO
' ************************************************************************
Sub getObjectSelectDialog(activ As Activity, activName As Object, title As String, local As Int)
	ThisActivity = activ
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "Confirmar", "Cancelar", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(70%x, 90%y)
	Else
		ApplDialog.SetSize(95%x, 95%y)
	End If
	
	CurrentCLD = ApplDialog 'sf

	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("task_item_detail_list") 'ListItemsList")")
	
	Dim items As Cursor
	Dim sSQL As String = $"select a.id, a.tagcode, a.object_type, a.title_import, a.`status`, ifnull(b.title, '') as objecttype_desc
				from dta_objects as a inner join dta_objecttypes as b on (b.tagcode=a.object_type)
				where a.active=1 and b.active=1 and a.`status`<=1 and a.tagcode<>'__NONE__' and a.title_import<>'Insira um descritivo/título'
				group by b.title, a.id, a.tagcode, a.object_type, a.title_import, a.`status`
				order by b.title, a.title_import"$
				
	'(Sem identificação)
	items = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If items.RowCount > 0 Then
		Dim LastGroup As String = ""
		For Row = 0 To items.RowCount-1
			items.Position = Row
			Dim object_type As String = items.GetString("object_type")
			Dim objecttype_desc As String = items.GetString("objecttype_desc")
			Dim title_import As String = items.GetString("title_import")
			Dim tagcode As String = items.GetString("tagcode")
			If (object_type.Trim <> LastGroup.Trim) Then
				LastGroup = object_type
				ListItemsList.Add( createObjGroupLineItemDetail(activ, objecttype_desc, 45dip), object_type)
			End If
			ListItemsList.Add(createObjectLineItemDetail(activ, tagcode, title_import, objecttype_desc, 45dip), "")
		Next
	End If
	items.Close
	HiddenListItemLabel = ""
	CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = False
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub3(ThisActivityName, "ObjectSelected", HiddenListItemLabel, local)
	End If
End Sub

Sub ListItemsListClearSelection
	For n=0 To ListItemsList.Size-1
		Dim pan As B4XView = ListItemsList.GetPanel(n)
		If Utils.NNE(pan.tag) Then
			pan.Color = 0xFFFFFFFF
			Dim lbl As Label = pan.GetView(0)
			lbl.Color = 0xFFFFFFFF
		End If
	Next
End Sub

Sub ListItemsListChkClearSelection
	For n=0 To ListItemsListChk.Size-1
		Dim pan As B4XView = ListItemsListChk.GetPanel(n)
		If Utils.NNE(pan.tag) Then
			pan.Color = 0xFFFFFFFF
			Dim lbl As Label = pan.GetView(0)
			lbl.Color = 0xFFFFFFFF
		End If
	Next
End Sub

Sub ListItemsList_ItemClick (Index As Int, Value As Object)
	ListItemsListClearSelection
	Dim pan As B4XView = ListItemsList.GetPanel(Index)
	'pan.SetColorAndBorder(0x9637FF4B, 0, 0x9637FF4B, 0)
	Dim lbl As Label = pan.GetView(0)
	lbl.Color = 0x9637FF4B
	HiddenListItemLabel = lbl.Tag
	Dim valid As Boolean = Utils.NNE(HiddenListItemLabel)
	HiddenListItemTagList = Types.MakeTagListType(lbl.Tag, lbl.Text, "")
	'***************************************************************************************************
	' Alteração PC
	' botao executar estava a ficar disabled ao seleccionar um item da lista
	' CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = valid
End Sub

Sub createObjGroupLineItemDetail(activ As Activity, title As String, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("ItemGroupTitle" ) 
	p.RemoveView
	lblGroupTitle.text = title
	p.Tag = ""
	Return p
End Sub

Sub createObjectLineItemDetail(activ As Activity, tagcode As String, title As String, titledesc As String, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	'p.LoadLayout("ItemGroupLineDetails" )
	p.LoadLayout("ItemGroupLine" )
	p.RemoveView
	lblLineHeader.text = title
	lblLineHeader.tag = tagcode
	p.tag = tagcode
	'lblLineData.text = titledesc
	Return p
End Sub


' ************************************************************************
' SELECCIONA OBJECTO COM PESQUISA
' ************************************************************************
Sub getObjectSelectViewDialog(activ As Activity, activName As Object, title As String, Pnl As Panel)
	ThisActivity = activ
	ThisActivityName = activName
	CurrentSelectedCode = ""
	Dim sf As Object = ApplDialog.ShowAsync(title, "Confirmar", "Cancelar", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(85%x, 90%y)
	Else
		ApplDialog.SetSize(95%x, 95%y)
	End If
	ObjectsListIndex = 0
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("ObjectSelectViewDialog")

	Dim ObjectsTypes As List = DBStructures.getObjectTypes
	For n=0 To ObjectsTypes.Size-1
		Dim itc As DB_ITC = ObjectsTypes.Get(n)
		ObjectTypeListView.Add(createObjectTypeLineItemDetail(ThisActivity, itc.Title, itc.TagCode, 45dip), itc.ID)
	Next
	
	OBJ_Types = DBStructures.getObjectTypes
	OBJ_Groups = DBStructures.getObjectGroups
	CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = Utils.NNE(CurrentSelectedCode)
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub3(ThisActivityName, "AlertObjectSelected", CurrentSelectedCode, Pnl)
	End If
End Sub


Sub createObjectTypeLineItemDetail(activ As Activity, title As String, tagcode As String, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("itemobjecttype")
	p.RemoveView
	lblGroupObjectTitle.text = title
	p.Height = lblGroupObjectTitle.Height
	p.Tag = tagcode
	Return p
End Sub

Sub createObjGroupLineItemDetailView(activ As Activity, title As String, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("ItemGroupTitle")
	p.RemoveView
	lblGroupTitle.text = title
	p.Height = lblGroupTitle.Height
	p.Tag = ""
	Return p
End Sub

Sub createObjectLineItemDetailView(activ As Activity, tagcode As String, title As String, titledesc As String, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	'p.LoadLayout("ItemGroupLineDetails" )
	p.LoadLayout("ItemGroupLine" )
	p.RemoveView
	lblLineHeader.text = title
	lblLineHeader.tag = tagcode
	p.Height =  lblLineHeader.Height
	p.tag = tagcode
	'lblLineData.text = titledesc
	Return p
End Sub

Sub ListItemsListClearSelectionView
	For n=0 To ListItemsList.Size-1
		Dim pan As B4XView = ListItemsList.GetPanel(n)
		If Utils.NNE(pan.tag) Then
			Dim lbl As Label = pan.GetView(0)
			lbl.Color = 0xFFFFFFFF
		End If
	Next
End Sub

Sub CLAObjectList_ItemClick (Index As Int, Value As Object)
	Dim pan As B4XView = CLAObjectList.GetPanel(Index)
	Dim lbl As Label = pan.GetView(0)
	lbl.Color = 0x9637FF4B
	CurrentSelectedCode = lbl.Tag
	CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = Utils.NNE(CurrentSelectedCode)
End Sub

Sub butCreateObject_Click
	createObjectPanel.Visible = True
End Sub

Sub createObjectCancelButton_Click
	createObjectPanel.Visible = False
End Sub

Sub ObjectTypeListView_ItemClick (Index As Int, Value As Object)
	For n=0 To ObjectTypeListView.Size-1
		Dim pan As B4XView = ObjectTypeListView.GetPanel(n)
		Dim lbl As Label = pan.GetView(0)
		lbl.Color = 0xFFFFFFFF
	Next
	
	Dim pan As B4XView = ObjectTypeListView.GetPanel(Index)
	Dim lbl As Label = pan.GetView(0)
	lbl.Color = 0x9637FF4B
	Dim TagCode As String = pan.Tag
	SelectedObjectTypeTagcode = TagCode
	Sleep(50)
	SelectObjectType(Index)
	CLAObjectTypeSpinner.SelectedIndex = Index
	
	objectTypePanel.Visible = False
	selectObjectPanel.Visible = True
End Sub

Sub createObjectConfirmButton_Click
	objectTypePanel.Visible = False
	selectObjectPanel.Visible = True
End Sub

Sub CLAObjectClear_Click
	CLAObjectList.Clear
	CLAObjectDesc.Text = ""
	CurrentSelectedCode = ""
	CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = Utils.NNE(CurrentSelectedCode)
End Sub


Sub CLAObjectTypeSpinner_ItemClick (Position As Int, Value As Object)
	Dim obtIndex As Int = CLAObjectTypeSpinner.SelectedIndex
	Dim obgIndex As Int = CLAObjectGroupSpinner.SelectedIndex
	Dim obtext As String = CLAObjectDesc.Text
	Dim res As ResumableSub = GetObjectsList(obtIndex,obgIndex,obtext,True)
	Wait For(res) Complete (finish As Boolean)
	If(finish) Then
		Log(finish)
	End If
	ObjectsListIndex = 0
End Sub

Sub SelectObjectType(index As Int)
		CLAObjectDesc.Text = ""
		CLAObjectGroupSpinner.SelectedIndex = 0
		Dim obtIndex As Int = index
		Dim obgIndex As Int = CLAObjectGroupSpinner.SelectedIndex
		Dim obtext As String = CLAObjectDesc.Text
		Dim res As ResumableSub = GetObjectsList(obtIndex,obgIndex,obtext,True)
		Wait For(res) Complete (finish As Boolean)
		If(finish) Then
			Log(finish)
		End If
		ObjectsListIndex = 0
End Sub

Sub suggestObjectButton_Click
	
End Sub

Sub CancelSelectObjectButton_Click
	objectTypePanel.Visible = True
	selectObjectPanel.Visible = False
	CurrentSelectedCode = ""
	CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = Utils.NNE(CurrentSelectedCode)
End Sub

Sub CLAObjectDesc_TextChanged (Old As String, New As String)
	Dim obtIndex As Int = CLAObjectTypeSpinner.SelectedIndex
	Dim obgIndex As Int = CLAObjectGroupSpinner.SelectedIndex
	ObjectsListIndex = 0
	Dim obtext As String = New
	If(Utils.NNE(obtext)) Then
		Dim res As ResumableSub = GetObjectsList(obtIndex,obgIndex,obtext,True)
		Wait For(res) Complete (finish As Boolean)
		If(finish) Then
			Log(finish)
		End If
	End If
End Sub

Sub GetObjectsList(ObjectTypeIndex As Int, ObjectGroupIndex As Int, ObjectDescText As String, newRequest As Boolean) As ResumableSub
	Dim result As Boolean = False
	If(newRequest) Then
		CLAObjectList.Clear
	End If
	
	Dim sType As String = ""
	If ObjectTypeIndex > 0 Then
		Dim itc As DB_ITC = OBJ_Types.Get(ObjectTypeIndex)
		sType = $" and (b.id=${itc.ID}) "$
	End If
		
	Dim sGroup As String = ""
	If ObjectGroupIndex > 0 Then
		Dim itc As DB_ITC = OBJ_Groups.Get(ObjectGroupIndex)
	End If
		
	Dim sDesc As String = ""
	If Utils.NNE(ObjectDescText) Then
		sDesc = $" and (a.title_import||a.tagcode||a.reference||b.title like '%${ObjectDescText.Trim}%') "$
	End If
		
	Dim sSQL As String = $"select a.id, a.tagcode, a.object_type, a.title_import, a.`status`, ifnull(b.title, '') as objecttype_desc,
		a.reference
		from dta_objects as a inner join dta_objecttypes as b on (b.tagcode=a.object_type)
		where a.active=1 and b.active=1 and a.`status`<=1 and a.tagcode<>'__NONE__' and a.title_import<>'Insira um descritivo/título'
		${sType}${sGroup}${sDesc}
		group by b.title, a.id, a.tagcode, a.object_type, a.title_import, a.`status`
			order by b.title, a.title_import limit ${ObjectsListIndex}, 10"$
	Log(sSQL)

	Dim LastGroup As String = ""
	Dim RecordRowCount As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL)
'	If(ObjectsListIndex < Record.RowCount) Then			
		Do While Record.NextRow 
			Dim object_type As String = Record.GetString("object_type")
			Dim objecttype_desc As String = Record.GetString("objecttype_desc")
			Dim title_import As String = Record.GetString("title_import")
			Dim tagcode As String = Record.GetString("tagcode")
			If(newRequest) Then
				If (object_type.Trim <> LastGroup.Trim) Then
					LastGroup = object_type
					CLAObjectList.Add( createObjGroupLineItemDetailView(ThisActivity, objecttype_desc, 45dip), object_type)
				End If
			End If

			CLAObjectList.Add(createObjectLineItemDetailView(ThisActivity, tagcode, title_import, objecttype_desc, 45dip), "")
			RecordRowCount = RecordRowCount +1
			result = True
		Loop
		Record.Close
'	End If
'	ProgressDialogHide
	Return result
End Sub

Sub CLAObjectGroupSpinner_ItemClick (Position As Int, Value As Object)
	Dim obtIndex As Int = CLAObjectTypeSpinner.SelectedIndex
	Dim obgIndex As Int = CLAObjectGroupSpinner.SelectedIndex
	Dim obtext As String = CLAObjectDesc.Text
	Dim res As ResumableSub = GetObjectsList(obtIndex,obgIndex,obtext,True)
	Wait For(res) Complete (finish As Boolean)
	If(finish) Then
		Log(finish)
	End If
	ObjectsListIndex = 0
End Sub

Sub CLAObjectList_ReachEnd
	ObjectsListIndex = ObjectsListIndex + 10	
	Dim obtIndex As Int = CLAObjectTypeSpinner.SelectedIndex
	Dim obgIndex As Int = CLAObjectGroupSpinner.SelectedIndex
	Dim obtext As String = CLAObjectDesc.Text
	
	Dim res As ResumableSub = GetObjectsList(obtIndex,obgIndex,obtext,False)
	Wait For(res) Complete (finish As Boolean)
	If(finish) Then
		Log(finish)
	End If
	
	
End Sub


' ************************************************************************
' APRESENTA DETALHES DE CHECKLIST
' ************************************************************************
Sub getRequestTaskDetailsDialog(activ As Activity, activName As Object, title As String, items As Cursor, tagcode As String)
	MasterTagcode = tagcode
	ThisActivity = activ
	ThisActivityName = activName
	'Dim sf As Object = ApplDialog.ShowAsync(title, "Executar", "Voltar", "Actualizar", Null, False)
	Dim sf As Object = ApplDialog.ShowAsync(title, "Executar", "Voltar", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(95%x, 90%y)
	Else
		ApplDialog.SetSize(90%x, 90%y)
	End If
	
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("task_item_detail_list") 'ListItemsList")")
	Dim Height As Int = 45dip
	If(ShareCode.ISPHONE) Then
		Height = 60dip
	End If
	
	For Row = 0 To items.RowCount-1
		items.Position = Row
		ListItemsList.Add( createTaskLineItemDetail(activ, items.GetString("title"), items.GetInt("item_type"), Height), "")
	Next
	items.close
	
	'*************************************************************
	' VERIFICA TIPOS DE INTERVENÇÃO ASSOCIADA
	'*************************************************************
	Dim newRequestType As String = tagcode
	
'	Dim TypeList As List : TypeList.Initialize
	
'	Dim sSQL As String = $"select distinct tagcode, title, tr_is_model
'	from dta_typerequests
'				where tagcode in (select distinct typerequest_tagcode 
'					from dta_typerequests_tasks where task_tagcode='${tagcode}') and active=1 and tr_is_model=0 
'					ORDER BY created_at desc "$   ' limit 1"$
'	Log(sSQL)
'	Private Record As Cursor
'	Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
'	If Record.RowCount >= 1 Then
'		For n=0 To Record.RowCount-1
'			Record.Position = n
'			newRequestType = Record.GetString("tagcode")
'			TypeList.Add(newRequestType)
''			Dim model As Int = Record.GetInt("tr_is_model")
''			If (model = 1) Then
''				Dim newRequestType As String = ""
''			End If
'		Next
'	Else
'		'
'	End If
'	Record.Close
	
''	If Not(Utils.NNE(newRequestType)) Then
'	If (TypeList.Size = 0) Then
'		Utils.SetDialogtitle(sf, $"${title} (Intervenção geral)"$)
'		Dim nrt As String = ""
'		Dim sSQL As String = $"select distinct tagcode, title from dta_typerequests where id=0 and is_internal=1 limit 1"$
'		Private Recordw As Cursor
'		Recordw = Starter.LocalSQLEVC.ExecQuery(sSQL)
'		If Recordw.RowCount > 0 Then
'			Recordw.Position = 0
'			nrt = Recordw.GetString("tagcode")
'		End If
'		Recordw.Close
'		newRequestType = Utils.IfNullOrEmpty(nrt, "TSKS_INTERNO_01")
'		TypeList.Add(newRequestType)
'		
'		ApplDialog.GetButton(DialogResponse.POSITIVE).Enabled = Utils.Int2Bool(ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST)
'	End If

	Dim SQLEVC As String = $"select a.task_tagcode from dta_typerequests_tasks as a where a.typerequest_tagcode='${tagcode}' order by a.position"$  
	Dim localRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(SQLEVC)
	Dim TVals As List : TVals.Initialize
	
	If localRecord.RowCount > 0 Then
		For nn = 0 To localRecord.RowCount-1
			localRecord.Position = nn
			TVals.Add(localRecord.GetString("task_tagcode"))
		Next
	End If
	localRecord.Close

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSubDelayed3(TasksCL2, "ReturnShowRequestTaskDetails", newRequestType, TVals)
'		CallSubDelayed3(TasksCL, "ReturnShowTaskDetails", TypeList, TVals)
		
	End If
End Sub


' ************************************************************************
' APRESENTA DETALHES DE CHECKLIST
' ************************************************************************
Sub getTaskDetailsDialog(activ As Activity, activName As Object, title As String, items As Cursor, tagcode As String)
	MasterTagcode = tagcode
	ThisActivity = activ
	ThisActivityName = activName
	'Dim sf As Object = ApplDialog.ShowAsync(title, "Executar", "Voltar", "Actualizar", Null, False)
	Dim sf As Object = ApplDialog.ShowAsync(title, "Executar", "Voltar", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(95%x, 90%y)
	Else
		ApplDialog.SetSize(90%x, 90%y)
	End If
	
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("task_item_detail_list") 'ListItemsList")") 
	Dim Height As Int = 45dip
	If(ShareCode.ISPHONE) Then
		Height = 60dip
	End If
	
	For Row = 0 To items.RowCount-1
		items.Position = Row
		ListItemsList.Add( createTaskLineItemDetail(activ, items.GetString("title"), items.GetInt("item_type"), Height), "")
	Next
	items.close
	
	'*************************************************************
	' VERIFICA TIPOS DE INTERVENÇÃO ASSOCIADA
	'*************************************************************
	Dim TypeList As List : TypeList.Initialize
	Dim newRequestType As String = ""
	Dim sSQL As String = $"select distinct tagcode, title, tr_is_model
				from dta_typerequests 
				where tagcode in (select distinct typerequest_tagcode 
					from dta_typerequests_tasks where task_tagcode='${tagcode}') and active=1 and tr_is_model=0 
					ORDER BY created_at desc "$   ' limit 1"$
	Log(sSQL)
	Private Record As Cursor
	Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If Record.RowCount >= 1 Then
		For n=0 To Record.RowCount-1
			Record.Position = n
			newRequestType = Record.GetString("tagcode")
			TypeList.Add(newRequestType)
'			Dim model As Int = Record.GetInt("tr_is_model")
'			If (model = 1) Then
'				Dim newRequestType As String = ""
'			End If
		Next
	Else
	'
	End If
	Record.Close
	
'	If Not(Utils.NNE(newRequestType)) Then
	If (TypeList.Size = 0) Then
		Utils.SetDialogtitle(sf, $"${title} (Intervenção geral)"$)
		Dim nrt As String = ""
		Dim sSQL As String = $"select distinct tagcode, title from dta_typerequests where id=0 and is_internal=1 limit 1"$
		Private Recordw As Cursor
		Recordw = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Recordw.RowCount > 0 Then
			Recordw.Position = 0
			nrt = Recordw.GetString("tagcode")
		End If
		Recordw.Close
		newRequestType = Utils.IfNullOrEmpty(nrt, "TSKS_INTERNO_01")
		TypeList.Add(newRequestType)
		
		ApplDialog.GetButton(DialogResponse.POSITIVE).Enabled = Utils.Int2Bool(ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST)
	End If

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		Dim TVals As TripleValues = Types.MakeTripleValues(tagcode, "", "")
		CallSubDelayed3(TasksCL2, "ReturnShowTaskDetails", TypeList, TVals)
'		CallSubDelayed3(TasksCL, "ReturnShowTaskDetails", TypeList, TVals)
		
	End If
End Sub

Sub createTaskLineItemDetail(activ As Activity, title As String, typeitem As Int, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	If (typeitem = 1) Then
		p.LoadLayout("task_item_detail_groupitem" ) '_device_2")
	Else
		p.LoadLayout("task_item_detail_lineitem" ) '_device_2")
	End If
	p.RemoveView
	ListItemDesc.text = title
	Return p
End Sub


Sub GetDeviceInfoDialog(activ As Object, curr As DeviceInformation)
	CurrentActivityObject = activ
	Dim sf As Object = ApplDialog.ShowAsync("Informação do dispositivo", "Continuar", "", "", Null, False)
	CurrentCLD = ApplDialog
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(680dip, 420dip)
	Else
		ApplDialog.SetSize(95%x, 65%y)
	End If
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_deviceInfo_2")
	Utils.SetViewBackgroundColorToMainColor(butResetApplication)

	DialogDeviceDescription.Text = ShareCode.APP_Instance 'curr.Description
	DialogDeviceDimension.Text = ShareCode.APP_Authorization 'curr.Size
	If (curr.HavePhone) Then 
		DialogDevicePhone.Text = "Sim"
	Else
		DialogDevicePhone.Text = "Não"
	End If
	
	DialogDeviceVersion.Text = $"${Main.AppBuildVersion}, (${Main.AppBuildVersionDate})"$
	SelectOrientation.Add("Orientação Landscape")
	SelectOrientation.Add("Orientação Portrait")
	SelectOrientation.SelectedIndex = ShareCode.DEVICE_ORIENTATION
	SelectOrientation.Enabled = False

'	Wait For (sf) Dialog_Result(Res As Int)
'	If Res = DialogResponse.POSITIVE Then
'		If Not(SelectOrientation.SelectedIndex = ShareCode.DEVICE_ORIENTATION) Then
'			Starter.AppState.WriteInteger("APP_START", "DEVICE_ORIENTATION", SelectOrientation.SelectedIndex)
'			Starter.AppState.Flush
'			CallSubDelayed2(activ, "DeviceInfoOrientationChange", SelectOrientation.SelectedIndex)
'		End If
'	End If
End Sub

Sub butResetApplication_Click
	CallSubDelayed(CurrentActivityObject, "ResetApplication")
	CurrentCLD.CloseDialog(DialogResponse.NEGATIVE)
End Sub

Sub ResetApplication
	
End Sub


'Sub GetInputTextDialog(title As String) As String
'	Dim sf As Object = ApplDialog.ShowAsync(title, "Continuar", "", "Cancelar", Null, False)
'	Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
'	ApplDialog.SetSize(100dip, 200dip)
'	Wait For (sf) Dialog_Ready(pnl As Panel)
'	pnl.LoadLayout("Dialog_Item_InputText")
'	IntputTextField.Text = ""
'	Wait For (sf) Dialog_Result(res As Int)
'	If res = DialogResponse.POSITIVE Then
'		Return IntputTextField.Text
'	Else
'		Return ""
'	End If
'End Sub


Sub GetTaskFiltersDialog(activ As Object, curr As TaskFilter, tabposis As Int, sft As StatusFilterTask)
	Dim sf As Object = ApplDialog.ShowAsync("Filtros", "Confirmar", "Cancelar", "Remover filtro", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If tabposis = 0 Then
		ApplDialog.SetSize(500dip, 380dip)
	Else
		ApplDialog.SetSize(95%x, 65%y)
	End If
	Wait For (sf) Dialog_Ready(pnl As Panel)
	'
	If tabposis = 0 Then
		pnl.LoadLayout("dialog_filtertask_typerequest")
		SetUpdateTBColor(TBSingular, sft.singular)
		SetUpdateTBColor(TBPlural, sft.plural)
		SetUpdateTBColor(TBActive, sft.active)
		SetUpdateTBColor(TBInactive, sft.inactive)
		'TextosFiltro
		
	Else If tabposis = 1 Then
		pnl.LoadLayout("dialog_filtertask_device_2")
	Else
		pnl.LoadLayout("dialog_filtertask_device_2")
		DialogReqType.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
		DialogReqType.Add( "(Todos)" )
		DialogReqType.Add( "Checklist" )
		DialogReqType.Add( "Tarefas" )
	
		DialogReqStatus.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
		DialogReqStatus.Add( "(Todos)" )
		DialogReqStatus.Add( "Activos" )
		DialogReqStatus.Add( "Inactivos" )
	
		DialogReqUpdated.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
		DialogReqUpdated.Add( "(Todos)" )
		DialogReqUpdated.Add( "Actualizados" )
		DialogReqUpdated.Add( "Por actualizar" )
	
		DialogReqType.SelectedIndex = curr.TypeTask
		DialogReqStatus.SelectedIndex = curr.Status
		DialogReqUpdated.SelectedIndex = curr.Updated
		Dim wchk As Boolean = True
		If curr.WithRequests = 0 Then wchk = False
		DialogReqWithRequests.Checked = wchk
	End If
	
	
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		If tabposis = 0 Then
			ShareCode.TaskTPRActive = TBActive.Checked
			ShareCode.TaskTPRInactive = TBInactive.Checked
			ShareCode.TaskTPRSingular = TBSingular.Checked
			ShareCode.TaskTPRPlural = TBPlural.Checked
			'ALTERACAO PC - ADAPTACAO Types.MakeTaskFilter TEM MAIS UM PARAMETRO
			Dim SetTheFilters As TaskFilter =  Types.MakeTaskFilter( 0,  0, 0, 0, 0)
			CallSub2(TasksCL2, "SetTheFilters", SetTheFilters)
		Else
			Dim WReq As Int = 0
			If (DialogReqWithRequests.Checked) Then WReq = 1
			Dim SetTheFilters As TaskFilter =  Types.MakeTaskFilter( DialogReqType.SelectedIndex,  DialogReqStatus.SelectedIndex, DialogReqUpdated.SelectedIndex,  WReq, 0)
			CallSub2(TasksCL2, "SetTheFilters", SetTheFilters)
		End If
	else If res = DialogResponse.NEGATIVE Then
		CallSub2(TasksCL2, "CancelAllFilters", True)
	End If
End Sub

Sub SetUpdateTBColor(mButton As ToggleButton, Checked As Boolean)
	mButton.Checked = Checked
	If Checked Then
		mButton.Color = 0xFF818181
	Else
		mButton.Color = 0xFFC6C6C6
	End If
End Sub

Sub TBChangeColor_CheckedChange(Checked As Boolean)
	Dim mButton As ToggleButton = Sender
	If Checked Then
		mButton.Color = 0xFF818181
	Else
		mButton.Color = 0xFFC6C6C6
	End If
End Sub

Sub getAppAuthorizationDialog(activ As Object, funcCall As String, AuthData As Authorization, versions As List, orientation As Int)
	Dim sf As Object = ApplDialog.ShowAsync("Definições de Autorização", "Confirmar", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		ApplDialog.SetSize(95%x, 95%y)
	Else
		ApplDialog.SetSize(70%x, 450dip)
	End If 
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_appAuthorization_device_2")
	
	ConfigEditVersion.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To versions.Size-1
		ConfigEditVersion.Add( versions.Get(i) )
	Next
	If Not(Utils.isNullOrEmpty(AuthData.Instance)) Then 
		ConfigEditInstance.Text = AuthData.Instance
	End If
	'If (AuthData.Authorization <> "") Then
	If Not(Utils.isNullOrEmpty(AuthData.Authorization)) Then
		ConfigEditAuth.Text = AuthData.Authorization
	End If
	ConfigEditVersion.SelectedIndex = AuthData.Version
	
	ConfigEditOrientation.Add("Orientação Landscape")
	ConfigEditOrientation.Add("Orientação Portrait")
	ConfigEditOrientation.SelectedIndex = orientation
	If (ShareCode.ISPHONE) Then
		ConfigEditOrientation.Enabled = False
		ConfigEditOrientation.SelectedIndex = 1
	End If
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		Dim retData As Authorization = Types.MakeAuthorization(ConfigEditInstance.Text, ConfigEditAuth.Text, ConfigEditVersion.SelectedIndex, ShareCode.APP_DOMAIN)
		ShareCode.DEVICE_ORIENTATION = ConfigEditOrientation.SelectedIndex
		CallSub2(activ, funcCall, retData)  '"SetAuthorization"
	Else
		CallSub(activ, "prc_AppClose")
	End If
End Sub

Sub GetPropertyDialog(activ As Object, propTitle As String, propValue As String, tagcode As String, asNew As Boolean)
	Dim Texto As String = ShareCode.AppDialogsEdicao
	If (asNew) Then Texto = ShareCode.AppDialogsnovo
	Dim sf As Object = ApplDialog.ShowAsync(Texto, "Confirmar", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	
	ApplDialog.SetSize(85%x, 220dip)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_propertyChange_device_2")

	DialogPropertyTitle.Text = propTitle
	DialogPropertyValue.Text = propValue
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		If (asNew) Then 
			CallSub3(activ, "SetThePropertyInsert", tagcode, DialogPropertyValue.Text)
		Else
			CallSub3(activ, "SetThePropertyUpdate", tagcode, DialogPropertyValue.Text)
		End If
	End If
End Sub

'MakeAddress(AddressType As Int, AddressName As String, AddressName2 As String, AddressCity As String, AddressPostalCode As String, AddressLatitude As String, AddressLongitude As String) As Address
'MakeGeoReference(Latitude As String, Longitude As String) As GeoReference
Sub GetAddressDialog(activ As Object, curr As Address, typAddress As List, asNew As Boolean)
	Dim Texto As String = ShareCode.AppDialogsEdicao
	If (asNew) Then Texto = ShareCode.AppDialogsnovo
	Dim sf As Object = ApplDialog.ShowAsync(Texto, "Confirmar", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(95%x, 500dip)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_entityAddress_device_2")

	DialogAddressType.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To typAddress.Size-1
		DialogAddressType.Add( typAddress.Get(i) )
	Next
	
	If Not(asNew) Then
		If (curr.AddressName <> "") Then
			DialogAddressName.Text = curr.AddressName
		End If
		If (curr.AddressName2 <> "") Then
			DialogAddressName2.Text = curr.AddressName2
		End If
		If (curr.AddressPostalCode <> "") Then
			DialogAddressPostalCode.Text = curr.AddressPostalCode
		End If
		If (curr.AddressCity <> "") Then
			DialogAddressCity.Text = curr.AddressCity
		End If
		If (curr.AddressLatitude <> "") Then
			DialogAddressLatitude.Text = curr.AddressLatitude
		End If
		If (curr.AddressLongitude <> "") Then
			DialogAddressLongitude.Text = curr.AddressLongitude
		End If
	End If
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		Dim SetTheAddress As Address = _
			Types.MakeAddress( DialogAddressType.SelectedIndex, DialogAddressName.text, DialogAddressName2.text, _
					DialogAddressPostalCode.text, DialogAddressCity.text, DialogAddressLatitude.text, DialogAddressLongitude.text, asNew)
		CallSub2(activ, "SetTheAddress", SetTheAddress)
	End If
End Sub

Sub GetGeoReferenceDialog(activ As Object, curr As GeoReference, asNew As Boolean)
	Dim Texto As String = ShareCode.AppDialogsEdicao
	If (asNew) Then Texto = ShareCode.AppDialogsnovo
	Dim sf As Object = ApplDialog.ShowAsync(Texto, "Confirmar", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(755dip, 250dip) 
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_entityGeoReference_device_2")

	If Not(asNew) Then
		If (curr.Latitude <> "") Then
			DialogAddressLatitude.Text = curr.Latitude
		End If
		If (curr.Longitude <> "") Then
			DialogAddressLongitude.Text = curr.Longitude
		End If
	End If
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		Dim SetTheGeoRefer As GeoReference = _
			Types.MakeGeoReference(DialogAddressLatitude.text, DialogAddressLongitude.text, asNew)
		CallSub2(activ, "SetTheGeoReference", SetTheGeoRefer)
	End If
End Sub

Sub GetContactDialog(activ As Object, curr As ContactRecord, typContacts As List, asNew As Boolean)
	Dim Texto As String = ShareCode.AppDialogsEdicao
	If (asNew) Then Texto = ShareCode.AppDialogsnovo
	Dim sf As Object = ApplDialog.ShowAsync(Texto, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(95%x, 450dip)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_ContactEdit_device_2")

	DialogContactType.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To typContacts.Size-1
		DialogContactType.Add( typContacts.Get(i) )
	Next
	DialogContactType.SelectedIndex = curr.contactType
	If Not(asNew) Then
		If (curr.contactName <> "") Then
			DialogContactName.Text = curr.contactName
		End If
		If (curr.contactTitle <> "") Then
			DialogContactTitle.Text = curr.contactTitle
		End If
		If (curr.contactEmail <> "") Then
			DialogContactEmail.Text = curr.contactEmail
		End If
		If (curr.contactPhone <> "") Then
			DialogContactPhone.Text = curr.contactPhone
		End If
	End If
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		Dim SetTheContact As ContactRecord = _
			Types.MakeContact( DialogAddressType.SelectedIndex, DialogContactName.text, DialogContactTitle.text, _
					DialogContactEmail.text, DialogContactPhone.text, curr.tagcode, asNew)
		CallSub2(activ, "SetTheContact", SetTheContact)
	End If
End Sub

Sub GetEntityFilterDialog(activ As Object, curr As EntityFilter, typEntity As List, Regions As List, Locals As List)
	Dim sf As Object = ApplDialog.ShowAsync("Filtros", "Confirmar", "Cancelar", "Remover filtro", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(95%x, 590dip)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_filterEntity_device_2")

	DialogReqTypeEntity.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqTypeEntity.Add( "(Todos)" )
	For i = 0 To typEntity.Size-1
		DialogReqTypeEntity.Add( typEntity.Get(i) )
	Next
	
	DialogReqStatus.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqStatus.Add( "(Todos)" )
	DialogReqStatus.Add( "Activos" )
	DialogReqStatus.Add( "Inactivos" )
	
	DialogReqRegion.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqRegion.Add( "(Todos)" )
	For i = 0 To Regions.Size-1
		DialogReqRegion.Add( Regions.Get(i) )
	Next
	DialogReqLocal.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqLocal.Add( "(Todos)" )
	For i = 0 To Locals.Size-1
		DialogReqLocal.Add( Locals.Get(i) )
	Next
	If (curr.Name <> "") Then
		DialogReqName.Text = curr.Name
	End If
	If (curr.Address <> "") Then
		DialogReqAddress.Text = curr.Address
	End If
	
	If (curr.Request = 1) Then
		DialogReqWithRequests.Checked = True
	End If
	
	DialogReqTypeEntity.SelectedIndex = curr.TypeEntity
	DialogReqStatus.SelectedIndex = curr.Status
	DialogReqRegion.SelectedIndex = curr.Region
	DialogReqLocal.SelectedIndex = curr.Local
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		Dim WReq As Int = 0
		If (DialogReqWithRequests.Checked) Then WReq = 1
		Dim SetTheFilters As EntityFilter = _
			Types.MakeEntityFilter( DialogReqTypeEntity.SelectedIndex,  DialogReqStatus.SelectedIndex,  _
					DialogReqRegion.SelectedIndex,  DialogReqLocal.SelectedIndex,  _
					DialogReqName.text, DialogReqAddress.text, WReq)
		CallSub2(activ, "SetTheFilters", SetTheFilters)
	else If res = DialogResponse.NEGATIVE Then
		CallSub2(activ, "CancelAllFilters", True)
	End If
End Sub


Sub GetObjectFilterDialog(activ As Object, curr As ObjectFilter, typObject As List, Regions As List, Locals As List)
	Dim sf As Object = ApplDialog.ShowAsync("Filtros", "Confirmar", "Cancelar", "Remover filtro", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(95%x, 95%y)
	Else
		ApplDialog.SetSize(95%x, 90%y)
	End If
'	ApplDialog.SetSize(95%x, 590dip)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	
	pnl.LoadLayout("dialog_filterObject") '_device_2")

	DialogReqTypeObject.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To typObject.Size-1
		Dim bt As ObjectTypes = typObject.Get(i)   'Types.ObjectTypesInList(TypeObjectsList, MenuName)
		DialogReqTypeObject.Add( bt.title )
	Next
	
	DialogReqZone.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To Types.ZONEOBJECTSFILTER.Size-1
		DialogReqZone.Add( Types.ZONEOBJECTSFILTER.Get(i) )
	Next
	
	DialogReqStatus.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqStatus.Add( "(Todos)" )
	DialogReqStatus.Add( "Activos" )
	DialogReqStatus.Add( "Inactivos" )
	
	DialogReqRegion.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqRegion.Add( "(Todos)" )
	For i = 0 To Regions.Size-1
		DialogReqRegion.Add( Regions.Get(i) )
	Next
	DialogReqLocal.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqLocal.Add( "(Todos)" )
	For i = 0 To Locals.Size-1
		DialogReqLocal.Add( Locals.Get(i) )
	Next
	If (curr.Name <> "") Then
		DialogReqName.Text = curr.Name
	End If
	If (curr.Address <> "") Then
		DialogReqAddress.Text = curr.Address
	End If
	
	If (curr.Request = 1) Then
		DialogReqWithRequests.Checked = True
	End If
	
	DialogReqTypeObject.SelectedIndex = curr.TypeObject
	DialogReqZone.SelectedIndex = curr.ZoneObject
	DialogReqStatus.SelectedIndex = curr.Status
	DialogReqRegion.SelectedIndex = curr.Region
	DialogReqLocal.SelectedIndex = curr.Local
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		Dim WReq As Int = 0
		If (DialogReqWithRequests.Checked) Then WReq = 1
		Dim bt As ObjectTypes = typObject.Get(DialogReqTypeObject.SelectedIndex)
		Dim SetTheFilters As ObjectFilter = _
			Types.MakeObjectFilter( bt.id, DialogReqZone.SelectedIndex, DialogReqStatus.SelectedIndex,  _
					DialogReqRegion.SelectedIndex,  DialogReqLocal.SelectedIndex,  _
					DialogReqName.text, DialogReqAddress.text, WReq)
		CallSub2(activ, "SetTheFilters", SetTheFilters)
	else If res = DialogResponse.NEGATIVE Then
		CallSub2(activ, "CancelAllFilters", True)
	End If
End Sub


Sub GetKPIFilterDialog(activ As Object, curr As KPIFilter)
	'Type KPIFilter(period As Int, SDate As String, EDate As String)
	'MakeKPIFilter(period As Int, SDate As String, EDate As String) As KPIFilter
	Dim sf As Object = ApplDialog.ShowAsync("Filtros", "Confirmar", "Cancelar", "Remover filtro", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(90%x, 80%y)
	Else
		ApplDialog.SetSize(590dip, 490dip)
	End If
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_filterKPI_device_2")
	
	DialogReqPeriodType.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqPeriodType.Add( "Últimos 30 dias" )
	DialogReqPeriodType.Add( "Último Trimestre" )
	DialogReqPeriodType.Add( "Último Semestre" )
	DialogReqPeriodType.Add( "Último Ano" )
	DialogReqPeriodType.Add( "Entre datas" )

	If (curr.SDate <> "") Then
		DialogReqStartDate.Text = curr.SDate
	End If
	If (curr.EDate <> "") Then
		DialogReqEndDate.Text = curr.EDate 
	End If
	DialogReqPeriodType.SelectedIndex = curr.period
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		Dim SetTheFilters As KPIFilter = Types.MakeKPIFilter(DialogReqPeriodType.SelectedIndex, DialogReqStartDate.text, DialogReqEndDate.text)
		'CallSub2(activ, "SetTheFilters", SetTheFilters)
	else If res = DialogResponse.NEGATIVE Then
		'CallSub2(activ, "CancelAllFilters", True)
	End If
End Sub


Sub MakeUserAvailable(activName As Object)
	ProgressDialogShow(ShareCode.userAguardeumMomento)

	Log("**********************************")
	Log("	GRAVA DISPONIBILIDADE")
	Log("**********************************")
	ShareCode.USR_STATE =  1
	DBStructures.updateUserAvailableState(ShareCode.SESS_OPER_User, ShareCode.USR_STATE)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("_tagcode", ShareCode.SESS_OPER_User)
	params.Put("_state", 1)
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
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/mobile/user/unavailable"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Utils.CallApi(0, params, activName, Url, "WindowStatusUpdate", "")
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(250)
	
	ProgressDialogHide
End Sub

Sub getDoubleLineEquipmentsDialog(activ As Activity, activName As Object, title As String, items As Cursor, tagcode As String)
	MasterTagcode = tagcode
	ThisActivity = activ
	ThisActivityName = activName
'	Dim cd As CustomLayoutDialog
'	cd.ShowAsync(title, "", "Cancelar", "", Null, False)
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(80%x, 80%y)
	End If

	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_listdoublelineitems") '_device_2")
	For Row = 0 To items.RowCount-1
		items.Position = Row
		
		Dim Equipment As String = items.GetString("title")
		Dim Serial As String = Utils.IfNullOrEmpty(items.GetString("serialnumber"), "")
		Dim Valid As String = Utils.IfNullOrEmpty(items.GetString("valid_to"), "")
		Dim tagcode As String = items.GetString("tagcode")
		
		CLVDialog.Add( createDoubleLineItem(activ, Equipment,  $"# ${tagcode}   -   s/n: ${Serial} (${Valid})"$, 100dip, tagcode), "") 
		
	Next
	items.close
	'Wait For CLVDialog_ItemClick (Index As Int, Value As Object)
	'cd.CloseDialog(DialogResponse.POSITIVE)
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		'CallSub2(activ, "SetResetPassword", mainEditLoginPassword.Text)
		'MsgboxAsync("Opção POSITIVA - " & CurrentTagcode, "Alerta!")
	Else
		'MsgboxAsync("A palavra chave não foi alterada, sendo a mesma obrigatória. A aplicação vai fechar.", "Alerta!")
		'CallSub(activ, "prc_AppClose")
	End If
End Sub



Sub getVehiclesListDialog(activ As Activity, activName As Object, title As String, items As Cursor)
	ThisActivity = activ
	ThisActivityName = activName
'	Dim cd As CustomLayoutDialog
'	cd.ShowAsync(title, "", "Cancelar", "", Null, False)
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(80%x, 80%y)
	End If	
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_vehiclesListltems") '_device_2")
	For Row = 0 To items.RowCount-1
		items.Position = Row
		
		Dim VehicleName As String = items.GetString("title_import")
		Dim tagcode As String = items.GetString("tagcode")
		VIDialog.Add(createVehicleItem(activ, VehicleName, 50dip, tagcode), "")
		
	Next
	items.close
	'Wait For CLVDialog_ItemClick (Index As Int, Value As Object)
	'cd.CloseDialog(DialogResponse.POSITIVE)
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		'CallSub2(activ, "SetResetPassword", mainEditLoginPassword.Text)
		'MsgboxAsync("Opção POSITIVA - " & CurrentTagcode, "Alerta!")
	Else
		'MsgboxAsync("A palavra chave não foi alterada, sendo a mesma obrigatória. A aplicação vai fechar.", "Alerta!")
		'CallSub(activ, "prc_AppClose")
	End If
End Sub





Sub CLVDialog_ItemClick (Index As Int, Value As Object)
	Dim clv As CustomListView = Sender
	Dim pan As Panel = clv.GetPanel(Index)
	Log(pan.Tag)
	CurrentTagcode = pan.Tag
	CallSub3(ThisActivityName, "ChangeUserEquipment", MasterTagcode, CurrentTagcode)
	CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
	
End Sub



Sub VIDialog_ItemClick (Index As Int, Value As Object)
	Dim clv As CustomListView = Sender
	Dim pan As Panel = clv.GetPanel(Index)
	Log(pan.Tag)
	CurrentTagcode = pan.Tag
	CallSub3(ThisActivityName, "ChangeUserVehicle", MasterTagcode, CurrentTagcode)
	CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
	
End Sub




Sub createDoubleLineItem(activ As Activity, title As String, subtitle As String, height As Int, tag As String) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("listdoublelineitem" ) '_device_2")
	p.RemoveView
	lbltitle.text = title
	lblsubtitle.text = subtitle
	p.Tag = tag
	Return p
End Sub

Sub createVehicleItem(activ As Activity, vehicleName As String, height As Int, tag As String) As Panel
	Dim p As Panel
	p.Initialize("")
	activ.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("vehicleItem" ) '_device_2")
	p.RemoveView
	lblvehicleName.text = vehicleName
	p.Tag = tag
	Return p
End Sub




Sub setResetPwdDialog(activ As Object, oldPwd As String)
	Dim sf As Object = ApplDialog.ShowAsync("Reset de password", "Confirmar", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(650dip, 350dip)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_RestePassword_device_2")
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		If (mainEditLoginPassword.Text = mainEditLoginPasswordConfirm.Text) And (mainEditLoginPassword.Text <> "") Then
'			If (mainEditLoginPassword.Text <> oldPwd) Then
'			Else
'			End If
			CallSub2(activ, "SetResetPassword", mainEditLoginPassword.Text)
		Else
			MsgboxAsync("As chaves introduzidas não são coincidentes! Tente novamente ou cancele a operação.", "Erro!")
			setResetPwdDialog(activ, oldPwd)
		End If
	Else
		MsgboxAsync("A palavra chave não foi alterada, sendo a mesma obrigatória. A aplicação vai fechar.", "Alerta!")
		CallSub(activ, "prc_AppClose")
	End If
	
End Sub

' ************************************************************************
' DIALOGO DE FULL TEXT DO TIPO 28
' ************************************************************************
Sub getBoxEditFullText(activ As Object, this As FloatLabeledEditText, title2show As String, txt2edit As String)
	
	Dim sf As Object = ApplDialog.ShowAsync(title2show, "Confirmar", "Cancelar", "", Null, False)
	
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(60%x, 50%y)
	Else
		ApplDialog.SetSize(90%x, 70%y)
	End If
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_full_text")
	BoxEditFullText.Text=this.Text
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		this.Text = BoxEditFullText.Text
		CallSubDelayed2(activ, "CLAItemEditValueReturnFromFloatEditBox", this)
	Else
		CallSubDelayed2(activ, "CLAItemEditValueReturnFromFloatEditBoxCancel", this)
	End If
End Sub

' ************************************************************************
' TIP: DIALOGO DE SEARCH DO TIPO 29
' ************************************************************************
Sub getBoxEditSearch(activ As Activity, this As FloatLabeledEditText, InScript As String, title2show As String, params As Map, ShowOthers As Int)

	If Utils.Int2Bool(ShowOthers) Then
		Dim sf As Object = ApplDialog.ShowAsync(title2show, "Confirmar", "Cancelar", "Outros", Null, False)
	Else
		Dim sf As Object = ApplDialog.ShowAsync(title2show, "Confirmar", "Cancelar", "", Null, False)
	End If
	
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(75%x, 80%y)
	Else
		ApplDialog.SetSize(90%x, 70%y)
	End If
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
'	pnl.LoadLayout("dialog_search")
	pnl.LoadLayout("dialog_search_V2")
	
	
	BoxEditSearchedValue.Text=this.Text
	Lista2Search.Clear
	PassScript = InScript
	PassedAct = activ
	
	StartingRow = 0
	Dim InScriptwithLimit As String = ""
	
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	Sleep(100)
	
	If ShareCode.SearchFromQuery Then
		
		If PassScript.EndsWith(";") Then
			PassScript = PassScript.SubString2(0,PassScript.Length -1)
		End If
		
		PassScript = $"select TBL.* from (${PassScript}) as TBL where 1=1 "$
		
		Dim TstFld As ResultSet = Starter.LocalSQLEVC.ExecQuery(PassScript)
		Dim ListaCampos As List
		ListaCampos.Initialize
		For i=0 To TstFld.ColumnCount - 1
			Dim ColName As String = TstFld.GetColumnName(i)
			If Not(ColName.ToLowerCase.Contains("tagcode")) Then
				ListaCampos.Add($"TBL.${ColName}"$)
			End If
		Next

		Dim SqlPesquisa As String = ""
		For d=0 To ListaCampos.Size -1
			Dim LFD As String = ListaCampos.Get(d)
			If d=0 Then
				Dim SqlOPer As String = "and"
				
			Else
				Dim SqlOPer As String = "or"
				
			End If
			SqlPesquisa = SqlPesquisa & $" ${SqlOPer} ${LFD} like '%${BoxEditSearchedValue.Text}%'"$
							
		Next
		InScript = PassScript & SqlPesquisa
	Else
		InScript = PassScript.Replace(":__VALOR",BoxEditSearchedValue.Text)
	End If
		
	ShareCode.CurrentSerchquery = InScript
	InScriptwithLimit = InScript & $" limit 0, 25"$
	Log(InScriptwithLimit)
	
	Try
		Dim registos As Int = 0
		Private Records2Search As ResultSet = Starter.LocalSQLEVC.ExecQuery(InScriptwithLimit)
		Log(Records2Search.RowCount)
		Dim ListLine_key As String = ""
		ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
		
		Lista2Search.Clear ' xxx - Para nao duplicar items nos capitulos repetitivos que contenham 29
		
		Do While Records2Search.NextRow
			For i=0 To Records2Search.ColumnCount -1
				If Records2Search.GetColumnName(i).ToLowerCase = "tagcode" Then
					ListLine_key =  Records2Search.GetString(Records2Search.GetColumnName(i))
				End If
			Next
			registos = registos +1
			Lista2Search.Add(createSearchLineDetail(activ, Records2Search, 50dip),ListLine_key)
		Loop
		Records2Search.Close
'		ProgressDialogHide
	Catch
		Log(LastException)
	End Try
	Log($"Encontrou ${registos} registos!"$)
	If registos <= 0 Then
		MsgboxAsync("Não existem registos para o criterio definido !",ShareCode.GeneralInfoTitle)
		ProgressDialogHide
		ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = ""
		ShareCode.TAG_RETURNED_FROM_SEARCHLIST = ""
	End If
	
	ProgressDialogHide
		
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then 'Confirmar
		CallSubDelayed3(CheckList3, "returnfromSearchDialog",this, params)
	Else if res = DialogResponse.NEGATIVE Then
		DialogoOutros(activ,this,params)
	Else
		ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = ""
		ShareCode.TAG_RETURNED_FROM_SEARCHLIST = ""
	End If
End Sub

Sub createSearchLineDetail(activ As Activity, items As ResultSet, height As Int) As Panel
	
	Dim pnl As Panel
	pnl.Initialize("")
	activ.AddView(pnl, 0, 0,98%x, height)
	pnl.LoadLayout("linha2search" )
	pnl.RemoveView
	Dim sText As String = ""
	Dim sTag As String = ""
	label2search1.text = ""
	Dim ShowField As Int = 1
	Dim ShowPosition As Int = 1
	Dim MapOfProperties As Map
	MapOfProperties.Initialize
	Dim search_field_settings As Map = ShareCode.Current29Map.Get("search_field_settings")
	Dim fields As List = search_field_settings.Get("fields")
	For Each colfields As Map In fields
		Dim field_name As String = colfields.Get("field_name")
		Dim show_inlist As Int = colfields.Get("show_inlist")
		Dim show_position As Int = colfields.Get("show_position") 'apanhar a definicao de posicao
		Dim Props As String = $"${show_inlist}|${show_position}"$
		MapOfProperties.Put(field_name,Props)
	Next
	
	Dim listaString As List
	listaString.Initialize
	
	For inx = 0 To items.ColumnCount -1
		
		Dim theName As String = items.GetColumnName(inx)
		Dim theValue As String = items.GetString(theName)
		
		Try
			If MapOfProperties.ContainsKey(theName) Then
				Dim KeyVal As String = MapOfProperties.Get(theName)
				Dim PropFields As List = Regex.Split("\|",KeyVal)
				ShowField = PropFields.Get(0)
				ShowPosition = PropFields.Get(1)
			Else
				ShowField = 0
				ShowPosition = 0
			End If
		Catch
			ShowField = 0
			ShowPosition = 0
'			Log(LastException)
		End Try
		
		sTag = sTag & $"${theName}=${theValue}|"$
		Log(sTag)
		
		
		If theName.ToLowerCase.Contains("tagcode") = False Then
			If ShowField = 1 Then
				listaString.Add($"${ShowPosition}-${theValue}"$)
			End If
		End If
	Next
	
	listaString.Sort(True)
	
	For i=0 To listaString.Size -1
		Dim ItemLista As String = listaString.Get(i)
		Dim PosSort As Int = ItemLista.IndexOf("-")
		If PosSort > 0 Then
			ItemLista = ItemLista.SubString2(PosSort+1,ItemLista.Length)
		End If
		sText = sText & ItemLista & ", "
	Next
	
	
	If sText.EndsWith(", ") Then sText = sText.SubString2(0,sText.Length-2)
	If sText.StartsWith(", ") Then sText = sText.SubString2(2,sText.Length)
	label2search1.text = sText
	label2search1.tag = sTag
	
	Return pnl
End Sub

Sub btnUserFilter_Click

	Lista2Search.Clear
	ShareCode.CurrentSerchquery = ""
	Dim PassScriptwithLimit As String = ""
	Dim PassScriptwithLimitAndFilter As String = ""
	StartingRow = 0
	
	If ShareCode.SearchFromQuery Then
		
		If PassScript.EndsWith(";") Then
			PassScript = PassScript.SubString2(0,PassScript.Length -1)
		End If
		
		PassScript = $"select TBL.* from (${PassScript}) as TBL where 1=1 "$
		
		Dim TstFld As ResultSet = Starter.LocalSQLEVC.ExecQuery(PassScript)
		Dim ListaCampos As List
		ListaCampos.Initialize
		For i=0 To TstFld.ColumnCount - 1
			Dim ColName As String = TstFld.GetColumnName(i)
			If Not(ColName.ToLowerCase.Contains("tagcode")) Then
				ListaCampos.Add($"TBL.${ColName}"$)
			End If
		Next
		
		Dim SqlPesquisa As String = ""
		For d=0 To ListaCampos.Size -1
			Dim LFD As String = ListaCampos.Get(d)
			If d=0 Then
				Dim SqlOPer As String = "and"
			Else
				Dim SqlOPer As String = "or"
			End If
			SqlPesquisa = SqlPesquisa & $" ${SqlOPer} ${LFD} like '%${BoxEditSearchedValue.Text}%'"$
		Next
		PassScriptwithLimit = PassScript & SqlPesquisa
	Else
		PassScriptwithLimit = PassScript.Replace(":__VALOR",BoxEditSearchedValue.Text)
	End If
	ShareCode.CurrentSerchquery = PassScriptwithLimit
	PassScriptwithLimitAndFilter = PassScriptwithLimit & $" limit 0, 25"$
	Log(PassScriptwithLimitAndFilter)
	
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	Private Records2Search As ResultSet = Starter.LocalSQLEVC.ExecQuery(PassScriptwithLimitAndFilter)
	Dim ListLine_key As String = ""
	If StartingRow > Records2Search.RowCount Then
		StartingRow = 0
	End If
	Lista2Search.Clear
	Do While Records2Search.NextRow
		For i=0 To Records2Search.ColumnCount -1
			If Records2Search.GetColumnName(i).ToLowerCase = "tagcode" Then
				ListLine_key =  Records2Search.GetString(Records2Search.GetColumnName(i))
			End If
		Next
		Lista2Search.Add(createSearchLineDetail(PassedAct, Records2Search, 50dip),ListLine_key)
	Loop
	Records2Search.Close
	ProgressDialogHide
	
	
End Sub

Sub Lista2Search_ReachEnd
	
	Dim PassScriptwithLimit As String = ""
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	If Utils.NNE(ShareCode.CurrentSerchquery) Then
		NextStartingRow = NextStartingRow + 25
		PassScriptwithLimit = ShareCode.CurrentSerchquery & $" limit 25 offset ${NextStartingRow}"$
		
'		Log(PassScriptwithLimit)
		
		Private Records2Search As ResultSet = Starter.LocalSQLEVC.ExecQuery(PassScriptwithLimit)
		Dim ListLine_key As String = ""
		
		If Records2Search.RowCount > 0 Then
			ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
'			Lista2Search.Clear
			Do While Records2Search.NextRow
				For i=0 To Records2Search.ColumnCount -1
					If Records2Search.GetColumnName(i).ToLowerCase = "tagcode" Then
						ListLine_key =  Records2Search.GetString(Records2Search.GetColumnName(i))
					End If
				Next
				Lista2Search.Add(createSearchLineDetail(PassedAct, Records2Search,50dip),ListLine_key)
			Loop
		End If
		ProgressDialogHide
		Records2Search.Close
	End If
	ProgressDialogHide
	
End Sub

Sub Lista2Search_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
	
End Sub

Sub Lista2Search_ItemClick (Index As Int, Value As Object)
	lblSearchChoosenItem.Text = Value
End Sub

Sub DialogoOutros(activ As Activity, this As FloatLabeledEditText, params As Map)
	Dim sf As Object = ApplDialog.ShowAsync("Adicionar Registo", "Actualizar Checklist", "Cancelar", "", Null, False)
	
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(75%x, 80%y)
	Else
		ApplDialog.SetSize(90%x, 70%y)
	End If
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_search_outros")
	
	
	Dim search_field_settings As Map = params.Get("search_field_settings")
	Dim fields As List = search_field_settings.Get("fields")
	Dim returned_field As String = search_field_settings.Get("returned_field")
	Dim fillotherfields_settings As List = search_field_settings.Get("fillotherfields_settings")
	
	Dim mapOutros As Map
	mapOutros.Initialize
				
	'ITERAR NOS DIVERSOS CAMPOS E CONDICOES PARA CONSTRUIR O SCIPT SQL
	
			
	For Each colfillotherfields_settings As Map In fillotherfields_settings
		Dim field_name As String = colfillotherfields_settings.Get("field_name")
		
		Try
			Dim alt_bookmark As String = colfillotherfields_settings.Get("alt_bookmark")
			Dim field_title As String = colfillotherfields_settings.Get("field_title")
		Catch
			Dim alt_bookmark As String = ""
			Dim field_title As String = field_name
			Log(LastException)
		End Try
		If field_title = "" Then field_title = field_name
		Dim show_position As Int = colfillotherfields_settings.Get("show_position")
		Dim show_inlist As Int = colfillotherfields_settings.Get("show_inlist")
		Dim is_location As Int = colfillotherfields_settings.Get("is_location")
		Dim is_additional As Int = colfillotherfields_settings.Get("is_additional")
		Dim is_contact As Int = colfillotherfields_settings.Get("is_contact")
		mapOutros.Put(field_name,field_title)
	Next
	ListaOutros.Clear
	
	For x = 0 To mapOutros.Size -1
		ListaOutros.Add(CreateOutrosDetail(activ,mapOutros.GetKeyAt(x),mapOutros.GetValueAt(x),50dip),"")
	Next
	Dim sRet As String = ""
	Dim chave As String = ""
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then 'Actualizar Checklist
		For i = 0 To ListaOutros.Size -1
			Dim p As Panel = ListaOutros.GetPanel(i)
			Dim lblOutrosTitle As Label = p.GetView(0)
			Dim lblOutrosValor As EditText = p.GetView(1)
			sRet = sRet & $"${lblOutrosTitle.Tag}=${lblOutrosValor.Text}|"$
			chave = chave & $"${lblOutrosValor.Text}|"$
		Next
		
		ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = chave
		ShareCode.TAG_RETURNED_FROM_SEARCHLIST = sRet
		CallSubDelayed3(CheckList3, "returnfromoutros",this, params)		
	End If
End Sub

Sub CreateOutrosDetail(activ As Activity, val2place As String,title2place As String, height As Int) As Panel
	Dim pnl As Panel
	pnl.Initialize("")
	activ.AddView(pnl, 0, 0,100%x, height)
	pnl.LoadLayout("detalheOutros" )
	pnl.RemoveView
	lblTitleOutros.Text=title2place
	lblTitleOutros.Tag=val2place
	Return pnl
End Sub

Sub label2search1_click
	Dim TextBox As B4XView = Sender
	lblSearchChoosenItem.Text = TextBox.Text
	ShareCode.ITEM_RETURNED_FROM_SEARCHLIST = lblSearchChoosenItem.Text
	ShareCode.TAG_RETURNED_FROM_SEARCHLIST = TextBox.Tag
End Sub

Sub getSyncManual (activ As Object, TipoDialogo As Int)

	Dim sf As Object = ApplDialog.ShowAsync("Sincronização manual", "Confirmar", "Cancelar", "", Null, False)
'	Log(TipoDialogo)
	
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)

	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_sync_manual")
	btn_Upload_SyncManual.Color = Colors.LightGray
	btn_Download_SyncManual.Color = Consts.ColorMain
	
	Dim sSQL As String = $"select distinct up_tagcode from loc_updatesrever where up_state=0"$
	Dim RecLocalOffline As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
	
	lstOfflineData.Clear
	If RecLocalOffline.RowCount <= 0 Then
		btn_Upload_SyncManual.Enabled = False
		ShareCode.TCF = ""
	Else
		btn_Upload_SyncManual.Enabled = True
		btn_Upload_SyncManual.Text = $"Envio de dados OFFLINE (${RecLocalOffline.RowCount})"$
	
		Do While RecLocalOffline.NextRow
			Dim RequestTC As String = RecLocalOffline.GetString("up_tagcode").Trim
			If Utils.NNE(RequestTC) Then
				lstOfflineData.Add(CreatelstOfflineData(RequestTC,True,50dip), RequestTC)
			End If
		Loop
	
	End If
	
	btn_Upload_SyncManual.Enabled = False ' xxx - Retirar esta linha depois de testado o procedimento
	
	
	
	sync_manual_warning.Text = $"ATENÇÃO !!${CRLF}A selecção de um periodo muito alargado irá causar um tempo de espera e um consumo de dados maior."$
	sync_manual_idate.Text = Utils.GetCurrentDate
	sync_manual_edate.Text = Utils.GetCurrentDate
	
	sync_manual_Radio_diaria.Checked = True
	sync_manual_Radio_diaria_CheckedChange(True)
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		
		If lstOfflineData.Size > 0 Then
			ShareCode.TCF = ""
			For a=0 To lstOfflineData.Size -1
				Dim pOff As Panel = lstOfflineData.GetPanel(a)
				Dim Chk As CheckBox = pnl.GetView(0)
				Dim TC As EditText = pnl.GetView(1)
				If Chk.Checked Then
					ShareCode.TCF = ShareCode.TCF & $"'${TC}',"$
				End If
			Next
			If ShareCode.TCF.EndsWith(",") Then
				ShareCode.TCF = ShareCode.TCF.SubString2(0,ShareCode.TCF.Length -1)
			End If
		Else
			ShareCode.TCF = ""
		End If
		
		
		If sync_manual_downloadrunfirstintall.Checked Then
			Starter.LocalSQLEVC.Close
			If File.Exists(Starter.SharedFolder, "evolutioncheck.db3") Then
				File.Delete(Starter.SharedFolder, "evolutioncheck.db3" )
			End If
			Sleep(250)
	
			If Not(File.Exists(Starter.SharedFolder, "evolutioncheck.db3")) Then
				File.Copy(File.DirAssets, "evolutioncheck.db3", Starter.SharedFolder, "evolutioncheck.db3" )
			End If
			Sleep(250)
			
			If File.Exists(Starter.SharedFolder,"logins.log") Then
				File.Delete(Starter.SharedFolder,"logins.log")
				Dim updfile As String = $"${ShareCode.SESS_OPER_User}_upd.log"$
				If File.Exists(Starter.InternalFolder,updfile) Then
					File.Delete(Starter.InternalFolder,updfile)
				End If
			End If
			
			If Not(Starter.LocalSQLEVC.IsInitialized) Then Starter.LocalSQLEVC.Initialize(Starter.SharedFolder, "evolutioncheck.db3", True)
			CallSub2(MainMenu,"Reinstallation",True)
			
		else if sync_manual_runfirstintall.Checked Then
			Starter.LocalSQLEVC.Close
			If File.Exists(Starter.SharedFolder, "evolutioncheck.db3") Then
				File.Delete(Starter.SharedFolder, "evolutioncheck.db3" )
			End If
			Sleep(250)
	
			If Not(File.Exists(Starter.SharedFolder, "evolutioncheck.db3")) Then
				File.Copy(File.DirAssets, "evolutioncheck.db3", Starter.SharedFolder, "evolutioncheck.db3" )
			End If
			Sleep(250)
			
			If File.Exists(Starter.SharedFolder,"logins.log") Then
				File.Delete(Starter.SharedFolder,"logins.log")
				Dim updfile As String = $"${ShareCode.SESS_OPER_User}_upd.log"$
				If File.Exists(Starter.InternalFolder,updfile) Then
					File.Delete(Starter.InternalFolder,updfile)
				End If
			End If
			
			If Not(Starter.LocalSQLEVC.IsInitialized) Then Starter.LocalSQLEVC.Initialize(Starter.SharedFolder, "evolutioncheck.db3", True)
			CallSub2(MainMenu,"Reinstallation", False)
		Else
			ShareCode.SyncManualComponents.Clear
			SetChecksSyncManual
			ShareCode.SyncManualDates = $"${sync_manual_idate.Text}|${sync_manual_edate.text}"$
		
			If sync_manual_chk_docs_templates.Checked Then
				ShareCode.DownloadDocsFromFTP = True
			Else
				ShareCode.DownloadDocsFromFTP = False
			End If
				
			CallSub3(MainMenu,"RunSyncManual",ShareCode.SyncManualDates,True)
		End If
		
	Else
		Log(res)
	End If
End Sub

Sub getuserRegistoManualJornada(activ As Object, reasons As List, causes As List, TipoDialogo As Int)
	
	Dim sf As Object = ApplDialog.ShowAsync("Registo Manual de Jornada", "Confirmar", "Cancelar", "", Null, False)

	Log(TipoDialogo)

	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(1000dip, 750dip)
	Else
		ApplDialog.SetSize(95%x, 95%y)
	End If
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_registo_manual_jornada")
	
	DialogReqCauseRMJ.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To causes.Size-1
		DialogReqCauseRMJ.Add( causes.Get(i) )
	Next
	
	DialogReqReasonRMJ.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To reasons.Size-1
		DialogReqReasonRMJ.Add( reasons.Get(i) )
	Next
	
	DateTime.DateFormat = Consts.DateTimeFormat
	
	DialogReqDateRMJ.text = DateTime.Date(DateTime.Now)
	DialogReqTimeRMJ.text = DateTime.Time(DateTime.Now)
	
	DialogReqStartDate.text = DateTime.Date(DateTime.Now)
	DialogReqEndDate.text = DateTime.Date(DateTime.Now)
	
	DialogReqStartTime.text = DateTime.Time(DateTime.Now)
	DialogReqEndTime.text = DateTime.Time(DateTime.Now)
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub2(activ, "MakeUnavailable2", Types.MakeUnavailable2(DialogReqStartDate.text, DialogReqEndDate.text, _
		DialogReqReasonRMJ.GetItem(DialogReqReasonRMJ.SelectedIndex),DialogReqCauseRMJ.GetItem(DialogReqCauseRMJ.SelectedIndex)))
	Else
		CallSub(activ, "CancelUnavailable")
	End If
End Sub


Sub DialogReqReasonRMJ_ItemClick (Position As Int, Value As Object)
	Log (Value)
End Sub

Sub DialogReqCauseRMJ_ItemClick (Position As Int, Value As Object)
	Log (Value)
End Sub

Sub getUserUnavailableDialog(activ As Object, durations As List, reasons As List)
	Dim sf As Object = ApplDialog.ShowAsync("Indisponibilidade", "Confirmar", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(1000dip, 430dip)
	Else
		ApplDialog.SetSize(95%x, 95%y)
	End If
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_userUnavailable") '_device_2")
	
	DialogReqType.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To durations.Size-1
		DialogReqType.Add( durations.Get(i) )
	Next
	DialogReqReason.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For i = 0 To reasons.Size-1
		DialogReqReason.Add( reasons.Get(i) )
	Next
	
	DateTime.DateFormat = Consts.DateTimeFormat
	DialogReqStartDate.text = DateTime.Date(DateTime.Now)
	DialogReqEndDate.text = DateTime.Date(DateTime.Now)
	
	DialogReqStartTime.text = DateTime.Time(DateTime.Now)
	DialogReqEndTime.text = DateTime.Time(DateTime.Now)
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub2(activ, "MakeUnavailable", _
				Types.MakeUnavailable(DialogReqStartDate.text, DialogReqEndDate.text, _
				DialogReqReason.GetItem(DialogReqReason.SelectedIndex)))
	Else
		CallSub(activ, "CancelUnavailable")
	End If
	
End Sub

Sub getLoginDialog2(activ As Object)
	Dim xW As Int = 50%x, xH As Int = 350dip
	If (ShareCode.ISPHONE) Then
		xW = 80%x
		xH = 80%x
	End If
	
	Dim but1 As String = "Confirmar", but2 As String = "Cancelar", but3 As String = ""
	Dim dLayout As String = "dialog_login_userregister"
'	If (ShareCode.ISPHONE) Then
'		xW = 95%x
'		xH = 400dip
'		but3 = "Reset"
'		dLayout = "dialog_login_userregister_device_2"
'	End If
	
	Dim sf As Object = ApplDialog.ShowAsync("Registo de novo utilizador", but1, but2, but3, Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)	
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(xW, xH)

	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout(dLayout)
	
	Wait For (sf) Dialog_Result(res As Int)
	
	If res = DialogResponse.POSITIVE Then
		CallSub3(activ, "SetLoginRegister", mainEditLoginUser.Text, mainEditLoginPassword.Text)
	Else
		CallSub(activ, "SetLoginRegisterCancel")
	End If
	
End Sub

Sub getLoginDialog(activ As Object)
	Dim xW As Int = 70%x, xH As Int = 450dip
	Dim but1 As String = "Confirmar", but2 As String = "Cancelar", but3 As String = "Esqueci password"
	Dim dLayout As String = "dialog_Login"
	If (ShareCode.ISPHONE) Then
		xW = 95%x
		xH = 400dip
		but3 = "Reset"
		dLayout = "dialog_Login_device_2"
	End If
	
	Dim sf As Object = ApplDialog.ShowAsync("Controlo de acesso", but1, but2, but3, Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(xW, xH)

	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout(dLayout)
	
	Wait For (sf) Dialog_Result(res As Int)
	
	If res = DialogResponse.POSITIVE Then
		CallSub3(activ, "SetLogin", mainEditLoginUser.Text, mainEditLoginPassword.Text)
	else If res = DialogResponse.NEGATIVE Then
		'Dim SMTPExtras1 As SMTPExtras
		CallSub2(activ, "SetLoginReset", mainEditLoginUser.Text)
	Else 
		CallSub(activ, "prc_AppClose")
	End If
	
End Sub

Sub GetRequestFilterDialog(activ As Object, curr As RequestFilter, chks As List, _
				ents As List, sts As List, tpreq As List)
	Dim xW As Int = 95%x, xH As Int = 500dip
	Dim but1 As String = "Confirmar", but2 As String = "Cancelar", but3 As String = "Remover filtro"
	Dim dLayout As String = "dialog_filterRequest"
	If (ShareCode.ISPHONE) Then
		xW = 95%x
		xH = 95%y
		but1 = "Confirmar"
		but2 = "Cancelar"
		but3 = "Remover"
		dLayout = "dialog_filterRequest_device_2"
	End If
	
	Dim sSQL As String = $"select distinct id, tagcode, title from dta_routes"$
	Private Routes As List
	Routes.Initialize
	Routes = DBStructures.GetListOfFromScriptCNLEVC("tagcode", "title", sSQL)
	
	
	Dim sf As Object = ApplDialog.ShowAsync("Filtros", but1, but2, but3, Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(xW, xH)
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout(dLayout)
	
	'campos Do filtro
	FilterLabelTipoIntervencao.Text=ShareCode.AppDialogsFilterLabelTipoIntervencao
	FilterLabelEntidade.Text=ShareCode.AppDialogsFilterLabelEntidade
	FilterLabelEstadosIntervencao.Text=ShareCode.AppDialogsFilterLabelEstadosIntervencao
	FilterLabelDataInicio.Text=ShareCode.AppDialogsFilterLabelDatainicio
	FilterLabelDataFim.Text=ShareCode.AppDialogsFilterLabelDatafim
	FilterLabelTipoChecklist.Text=ShareCode.AppDialogsFilterLabelTipoChecklist
	FilterLabelRota.Text=ShareCode.AppDialogsFilterLabelRota
	
	DialogReqChecklist.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqChecklist.Add( "(Todos)" )
	For i = 0 To chks.Size-1
		Dim r As CodeNameList = chks.Get(i)
		DialogReqChecklist.Add( r.Name )
	Next
	
	DialogReqEntity.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqEntity.Add( "(Todos)" )
	For i = 0 To ents.Size-1
		Dim r As CodeNameList = ents.Get(i)
		DialogReqEntity.Add( r.Name )
	Next
	
	If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_ROUTES)) Then
		DialogReqRoute.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
		DialogReqRoute.Add( "(Todos)" )
		For i = 0 To Routes.Size-1
			Dim r As CodeNameList = Routes.Get(i)
			DialogReqRoute.Add( r.Name )
			'Não especificada
		Next
	End If
	
	
	DialogReqStatus.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqStatus.Add( "(Todos)" )
	For i = 0 To sts.Size-1
		DialogReqStatus.Add( sts.Get(i) )
	Next
	
	DialogReqTypeRequest.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	DialogReqTypeRequest.Add( "(Todos)" )
	For i = 0 To tpreq.Size-1
		Dim r As CodeNameList = tpreq.Get(i)
		DialogReqTypeRequest.Add( r.Name )
	Next
	
	If (curr.SDate <> "") Then
		DialogReqStartDate.Text = curr.SDate ' .SetDate(DateTime.DateParse(curr.SDate),True)
	Else
		DialogReqStartDate.Text = ShareCode.APPDATE_STARTRANGE
	End If
	
	If (curr.EDate <> "") Then
		DialogReqEndDate.Text = curr.EDate ' .SetDate(DateTime.DateParse(curr.EDate),True)
	Else
		DialogReqEndDate.Text = ShareCode.APPDATE_ENDRANGE
	End If
	
	DialogReqChecklist.SelectedIndex = 0
	If (curr.Task > 0) Then
		DialogReqChecklist.SelectedIndex = curr.Task
	End If
	
	DialogReqEntity.SelectedIndex = 0
	If (curr.Entity > 0) Then
		DialogReqEntity.SelectedIndex = curr.Entity
	End If
	
	DialogReqTypeRequest.SelectedIndex = 0
	If (curr.TPRequest > 0) Then
		DialogReqTypeRequest.SelectedIndex = curr.TPRequest
	End If

	DialogReqStatus.SelectedIndex = 0
	If (curr.State > 0) Then
		DialogReqStatus.SelectedIndex = curr.State
	End If
	
	SetUpdateTBColor(TB001, ShareCode.STS001)
	SetUpdateTBColor(TB002, ShareCode.STS002)
	SetUpdateTBColor(TB003, ShareCode.STS003)
	SetUpdateTBColor(TB004, ShareCode.STS004)
	SetUpdateTBColor(TB005, ShareCode.STS005)


	Wait For (sf) Dialog_Result(res As Int)
	'force the keyboard to hide
'	DialogQuantityValue.EditText.Enabled = False
'	ProgressDialogShow2("Aguarde por favor ...", False)
	
	If res = DialogResponse.POSITIVE Then
		Try
			ShareCode.STS001 = TB001.Checked
			ShareCode.STS002 = TB002.Checked
			ShareCode.STS003 = TB003.Checked
			ShareCode.STS004 = TB004.Checked
			ShareCode.STS005 = TB005.Checked
		
			Dim SetTheFilters As RequestFilter = _
			Types.MakeRequestFilter( DialogReqStartDate.text, DialogReqEndDate.text, _
				DialogReqStatus.SelectedIndex, DialogReqChecklist.SelectedIndex, DialogReqEntity.SelectedIndex, _
				DialogReqRoute.SelectedIndex, DialogReqTypeRequest.SelectedIndex)
			'DateTime.Date(DialogReqStartDate.GetDate)
			CallSub2(activ, "SetTheFilters", SetTheFilters)
		Catch
			CallSub2(activ, "CancelAllFilters", True)
		End Try
		
	else If res = DialogResponse.NEGATIVE Then
		CallSub2(activ, "CancelAllFilters", True)
	End If
'	ProgressDialogHide
End Sub

Sub GetUserQuantityDialog(activ As Object, code As String, qtd As Int) 
	Dim sf As Object = ApplDialog.ShowAsync("Quantidade de produto/peça", "Confirmar", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(60%x, 300dip)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_quantity_device_2")
	DialogQuantityValue.EditText.InputType = DialogQuantityValue.EditText.INPUT_TYPE_NUMBERS 'Bit.Or(0x00002000, DialogQuantityValue.EditText.InputType)
	DialogQuantityValue.EditText.Text = qtd
	
	'ApplDialog.GetButton(DialogResponse.POSITIVE).Enabled = False
	Wait For (sf) Dialog_Result(res As Int)
	'force the keyboard to hide
	DialogQuantityValue.EditText.Enabled = False
	If res = DialogResponse.POSITIVE Then
		ReturnQuantityValue = DialogQuantityValue.Text
		CallSub3(activ, "QuantityDialogReturn", code, ReturnQuantityValue)
		'ReturnQuantityValue = DialogQuantityValue.Text
	End If
End Sub

Sub butReqStartDate_Click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (DialogReqStartDate.Text  <> "") Then
		dnow = DateTime.DateParse(DialogReqStartDate.text)
	End If
	dd.Initialize("CalendarGetStartDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
	Log(dd.AccentColor) ' AccentColor2 = Colors.Blue
	dd.show("DialogReqStartDate")
End Sub

Sub butReqEndDate_Click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (DialogReqEndDate.Text  <> "") Then
		dnow = DateTime.DateParse(DialogReqEndDate.text)
	End If
	dd.Initialize("CalendarGetEndDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
	'dd.AccentColor2 = Colors.Blue
	dd.ThemeDark = True
	Log(dd.AccentColor) ' AccentColor2 = Colors.Blue
	dd.show("DialogReqEndDate")
End Sub

Sub CalendarGetStartDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	DialogReqStartDate.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub CalendarGetEndDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	DialogReqEndDate.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub CalendarGetDateRMJ_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	DialogReqDateRMJ.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub butReqDateRMJ_Click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (DialogReqDateRMJ.EditText.Text  <> "") Then
		dnow = DateTime.DateParse(DialogReqDateRMJ.text)
	End If
	dd.Initialize("CalendarGetDateRMJ", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
	Log(dd.AccentColor) ' AccentColor2 = Colors.Blue
	dd.show("DialogReqDateRMJ")
End Sub

Sub mainButLoginShowPassword_Click
	If (LGO_PasswordMode) Then
		LGO_PasswordMode = False
	Else
		LGO_PasswordMode = True
	End If
	mainEditLoginPassword.PasswordMode = LGO_PasswordMode
End Sub

Sub mainButLoginConfig_Click
	
End Sub


Sub DialogReqTypeRMJ_ItemClick (Position As Int, Value As Object)
	
End Sub


Sub DialogReqPeriodType_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub butReqTimeRMJ_Click
	Dim but As Button = Sender
	Dim pan As Panel = but.Parent
	Dim CurrentTimeEdit As FloatLabeledEditText = pan.GetView(11)
	Dim tt As TimePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	Try
		If (CurrentTimeEdit.Text  <> "") Then
			dnow = DateTime.TimeParse($"${CurrentTimeEdit.Text}:00"$)
		End If
		
		tt.Initialize("CalendarGetTime", DateTime.GetHour(dnow), DateTime.GetMinute(dnow), True)
		'tt.AccentColor2 = Consts.ColorRed
		tt.show("CurrentTimeEdit")
	Catch
		Log(LastException)
	End Try
End Sub


Sub butReqStartTime_Click
	Dim but As Button = Sender
	Dim pan As Panel = but.Parent
	Dim CurrentTimeEdit As FloatLabeledEditText = pan.GetView(5)
	Dim tt As TimePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
		Try
			If (CurrentTimeEdit.Text  <> "") Then
		dnow = DateTime.TimeParse($"${CurrentTimeEdit.text}:00"$)
			End If
		
			tt.Initialize("CalendarGetTime", DateTime.GetHour(dnow), DateTime.GetMinute(dnow), True)
		'tt.AccentColor2 = Consts.ColorRed
	tt.show("CurrentTimeEdit")
		Catch
	Log(LastException)
	End Try
End Sub

Sub butReqEndTime_Click
	Dim but As Button = Sender
	Dim pan As Panel = but.Parent
	Dim CurrentTimeEdit As FloatLabeledEditText = pan.GetView(6)
	Dim tt As TimePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	Try
		If (CurrentTimeEdit.Text  <> "") Then
			dnow = DateTime.TimeParse($"${CurrentTimeEdit.text}:00"$)
		End If
		
		tt.Initialize("CalendarGetTime", DateTime.GetHour(dnow), DateTime.GetMinute(dnow), True)
		'tt.AccentColor2 = Consts.ColorRed
		tt.show("CurrentTimeEdit")
	Catch
		Log(LastException)
	End Try
End Sub



Sub DialogReqStartTime_FocusChanged (HasFocus As Boolean)
	If (HasFocus = True) Then
		Dim CurrentTimeEdit As FloatLabeledEditText = Sender
		Dim tt As TimePickerDialog
		DateTime.DateFormat = Consts.DateTimeFormat
		Dim dnow As Long = DateTime.Now
		Try
			If (CurrentTimeEdit.Text  <> "") Then
				dnow = DateTime.TimeParse($"${CurrentTimeEdit.text}:00"$)
			End If
			
			tt.Initialize("CalendarGetTime", DateTime.GetHour(dnow), DateTime.GetMinute(dnow), True)
			'tt.AccentColor2 = Consts.ColorRed
			tt.show("CurrentTimeEdit")
		Catch
			Log(LastException)
		End Try
	End If
End Sub

Sub DialogReqEndTime_FocusChanged (HasFocus As Boolean)
	
	If (HasFocus = True) Then
		Dim CurrentTimeEdit As FloatLabeledEditText = Sender
		Dim tt As TimePickerDialog
		DateTime.DateFormat = Consts.DateTimeFormat
		Dim dnow As Long = DateTime.Now
		Try
			If (CurrentTimeEdit.Text  <> "") Then
				dnow = DateTime.TimeParse($"${CurrentTimeEdit.text}:00"$)
			End If
			
			tt.Initialize("CalendarGetTime", DateTime.GetHour(dnow), DateTime.GetMinute(dnow), True)
			'tt.AccentColor2 = Consts.ColorRed
			tt.show("CurrentTimeEdit")
		Catch
			Log(LastException)
		End Try
	End If
End Sub

Sub DialogReqTimeRMJ_FocusChanged (HasFocus As Boolean)
	
	If (HasFocus = True) Then
		Dim CurrentTimeEdit As FloatLabeledEditText = Sender
		Dim tt As TimePickerDialog
		DateTime.DateFormat = Consts.DateTimeFormat
		Dim dnow As Long = DateTime.Now
		Try
			If (CurrentTimeEdit.Text  <> "") Then
				dnow = DateTime.TimeParse($"${CurrentTimeEdit.text}:00"$)
			End If
			
			tt.Initialize("CalendarGetTime", DateTime.GetHour(dnow), DateTime.GetMinute(dnow), True)
			'tt.AccentColor2 = Consts.ColorRed
			tt.show("CurrentTimeEdit")
		Catch
			Log(LastException)
		End Try
	End If
End Sub

Sub GetBluetoothDevicesListDialog(activ As Activity, activName As Object, title As String)
	ThisActivity = activ
	ThisActivityName = activName

'	Dim cd As CustomLayoutDialog
'	cd.ShowAsync(title, "", "Cancelar", "", Null, False)
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "Cancelar", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(80%x, 80%y)
	End If

	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_bluetooth_devices") '_device_2")
	ListViewBluetoothDevices.SingleLineLayout.Label.TextSize=15
	ListViewBluetoothDevices.SingleLineLayout.Label.TextColor = Colors.Black
	ListViewBluetoothDevices.SingleLineLayout.ItemHeight=40dip
	Printer.Initialize(Me,"Printer",Encoding.Windows1252)
	ButtonAssociated.Color = Consts.ColorMain
	ButtonScanPrinter.Color = Consts.ColorMain
	ButtonPrint.Color = Consts.ColorMain

	'Wait For CLVDialog_ItemClick (Index As Int, Value As Object)
	'cd.CloseDialog(DialogResponse.POSITIVE)
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		'CallSub2(activ, "SetResetPassword", mainEditLoginPassword.Text)
		'MsgboxAsync("Opção POSITIVA - " & CurrentTagcode, "Alerta!")
	Else
		'MsgboxAsync("A palavra chave não foi alterada, sendo a mesma obrigatória. A aplicação vai fechar.", "Alerta!")
		'CallSub(activ, "prc_AppClose")
	End If
End Sub

Sub Printer_ListPrinterAssociated (ListNameAndMac As Map)
	' Return a List of BT associated
	Try
		ListViewBluetoothDevices.Clear
		For I=0 To ListNameAndMac.Size-1
			ListViewBluetoothDevices.AddSingleLine2(ListNameAndMac.GetKeyAt(I),ListNameAndMac.GetValueAt(I))
			Log($"${ListNameAndMac.GetKeyAt(I)}, ${ListNameAndMac.GetValueAt(I)}"$)
		Next
	Catch
		Log(LastException)
	End Try
End Sub

Sub DialogReqRoute_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub Printer_DiscoveryNewPrinter (PrinterFound As Map, DeviceClass As Int)
	' Find new printer
	Try
		Log("DEVICE Class:" & DeviceClass)
		ListViewBluetoothDevices.AddSingleLine2(PrinterFound.GetKeyAt(0),PrinterFound.GetValueAt(0))
	Catch
		Log(LastException)
	End Try
End Sub

Sub Printer_DiscoveryFinished
	Log("Search End")
End Sub

Sub Printer_DiscoveryNoDeviceFound
	ToastMessageShow("Device not found",True)
End Sub


Sub Printer_ConnectedToPrint (Success As Boolean)
	' When is connect
	If Success Then	
		ButtonPrint.Visible = True
		ToastMessageShow(PrinterMessage,False)
		ListViewBluetoothDevices.Clear
	Else
		ButtonPrint.Visible = False
		ToastMessageShow("Erro ao conectar a Impressora",False)
	End If
End Sub

Sub Printer_SendTerminated
	Log("Finish!!")
	'Printer.Close
End Sub 

Sub ListViewBluetoothDevices_ItemClick (Position As Int, Value As Object)
	Try
		CurrentPrinterConnected = Value
		PrinterMessage = "Impressora Conectada"
		Printer.ClearBuffer
		Printer.AddBuffer_Bitmap(LoadBitmap(Starter.InternalFolder,"logo_monocromatico_mono.png"),0)
		Printer.AddBuffer_Writeline(ESC_POS.BoldOn & "ERGUELOP LDA" & ESC_POS.DoubleOff)
		Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal & "Contribuinte: 507601190" & ESC_POS.FontA_Normal)
		Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAssets,"barra_cinza.png"),0)
		Printer.AddBuffer_Writeline("GUIA DE REMESSA")
		Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal & "Número: XXXXXX      Data: XXXX-XX-XX" & ESC_POS.FontA_Normal)
		Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAssets,"barra_cinza.png"),0)
		Printer.AddBuffer_Writeline("")
		Printer.AddBuffer_Writeline("")
		Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAssets,"barra_cinza.png"),0)
		Printer.SelectFromMac(Value)
		File.WriteString(Starter.InternalFolder,$"defultprinter.set"$, Value)
	Catch
		Log(LastException)
	End Try
End Sub

Sub ButtonAssociated_Click
	' connect to Associated Printer
	Try
		ListViewBluetoothDevices.Clear
		Printer.SelectFromAssociatedPrinter
	Catch
		Log(LastException)
	End Try
End Sub

'First
Sub ButtonScanPrinter_Click
'	Scan For find Bluetooth Printer
	Try
		ListViewBluetoothDevices.Clear
		rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result = False Then
			ToastMessageShow("No permission...", False)
			Return
		End If
		
	Catch
		Log(LastException)
	End Try
	
	Try
		FindPrintersBT
	Catch
		Log(LastException)
	End Try
		
End Sub

Sub FindPrintersBT
	Printer.SearchNewPrinter
End Sub


Sub ButtonPrint_Click
	'Printer.
	Try
		If Not(Printer.Connected) Then
			PrinterMessage = "A Processar....."
			Printer.ClearBuffer
			Printer.AddBuffer_Writeline(ESC_POS.BoldOn & "X-Evolution" & ESC_POS.DoubleOff)
'		Printer.AddBuffer_Writeline("X-Evolution")
			Printer.AddBuffer_Writeline("VRCG")
			Printer.AddBuffer_Writeline("VRCG")
			''		Printer.AddBuffer_Writeline("")
'		Dim Image As Bitmap = LoadBitmap(File.DirAssets,"qr.jpg")
'		Printer.AddBuffer_Bitmap(Image,0)
			Printer.AddBuffer_Writeline("")
			Printer.AddBuffer_Writeline("")
			Printer.SelectFromMac(CurrentPrinterConnected)
			Sleep(2500)
		End If

		Printer.flushAllAndClose
	Catch
		Log(LastException)
	End Try
	
End Sub

Sub ListItemsListChk_ItemClick (Index As Int, Value As Object)
	ListItemsListChkClearSelection
	Dim pan As B4XView = ListItemsListChk.GetPanel(Index)
	'pan.SetColorAndBorder(0x9637FF4B, 0, 0x9637FF4B, 0)
	Dim lbl As Label = pan.GetView(0)
	lbl.Color = 0x9637FF4B
	HiddenListItemLabel = lbl.Tag
	Dim valid As Boolean = Utils.NNE(HiddenListItemLabel)
	HiddenListItemTagList = Types.MakeTagListType(lbl.Tag, lbl.Text, "")
	 CurrentCLD.GetButton(DialogResponse.POSITIVE).Enabled = valid
End Sub

Sub sync_manual_others_CheckedChange(Checked As Boolean)
	sync_manual_downloadrunfirstintall.Checked = False
	sync_manual_runfirstintall.Checked = False
End Sub

Sub sync_manual_Radio_seleccao_CheckedChange(Checked As Boolean)
	If Checked Then
		sync_manual_chk1.Enabled = True
		sync_manual_chk2.Enabled = True
		sync_manual_chk3.Enabled = True
		sync_manual_chk4.Enabled = True
		sync_manual_chk5.Enabled = True
		sync_manual_chk6.Enabled = True
		sync_manual_chk7.Enabled = True
		sync_manual_chk8.Enabled = True
		sync_manual_chk9.Enabled = True
		sync_manual_chk10.Enabled = True
		sync_manual_chk11.Enabled = True
		sync_manual_chk12.Enabled = True
		sync_manual_chk_docs_templates.Enabled = True
		sync_manual_runfirstintall.Enabled = True
		sync_manual_downloadrunfirstintall.Enabled = True

		sync_manual_chk1.Checked = False
		sync_manual_chk2.Checked = False
		sync_manual_chk3.Checked = False
		sync_manual_chk4.Checked = False
		sync_manual_chk5.Checked = False
		sync_manual_chk6.Checked = False
		sync_manual_chk7.Checked = False
		sync_manual_chk8.Checked = False
		sync_manual_chk9.Checked = False
		sync_manual_chk10.Checked = False
		sync_manual_chk11.Checked = False
		sync_manual_chk12.Checked = False
		sync_manual_chk_docs_templates.Checked = False
		PanelMestres.Visible = False
		sync_manual_runfirstintall.Checked = False
		sync_manual_downloadrunfirstintall.Checked = False

		If DataVazia Then
			sync_manual_idate.Text = Utils.GetLastWeekDate
		End If
		
		sync_manual_edate.Text = Utils.GetCurrentDate
	End If
End Sub

Sub sync_manual_runfirstintall_CheckedChange(Checked As Boolean)
	If Checked Then
		sync_manual_chk1.Checked = False
		sync_manual_chk2.Checked = False
		sync_manual_chk3.Checked = False
		sync_manual_chk4.Checked = False
		sync_manual_chk5.Checked = False
		sync_manual_chk6.Checked = False
		sync_manual_chk7.Checked = False
		sync_manual_chk8.Checked = False
		sync_manual_chk9.Checked = False
		sync_manual_chk10.Checked = False
		sync_manual_chk11.Checked = False
		sync_manual_chk12.Checked = False
		sync_manual_chk_docs_templates.Checked = False
		sync_manual_downloadrunfirstintall.Checked = False
	End If
End Sub

Sub sync_manual_downloadrunfirstintall_CheckedChange(Checked As Boolean)
	If Checked Then
		sync_manual_chk1.Checked = False
		sync_manual_chk2.Checked = False
		sync_manual_chk3.Checked = False
		sync_manual_chk4.Checked = False
		sync_manual_chk5.Checked = False
		sync_manual_chk6.Checked = False
		sync_manual_chk7.Checked = False
		sync_manual_chk8.Checked = False
		sync_manual_chk9.Checked = False
		sync_manual_chk10.Checked = False
		sync_manual_chk11.Checked = False
		sync_manual_chk12.Checked = False
		sync_manual_chk_docs_templates.Checked = False
		sync_manual_runfirstintall.Checked = False
	End If
End Sub

Sub sync_manual_Radio_diaria_CheckedChange(Checked As Boolean)
	If Checked Then
		sync_manual_chk1.Enabled = False
		sync_manual_chk2.Enabled = False
		sync_manual_chk3.Enabled = False
		sync_manual_chk4.Enabled = False
		sync_manual_chk5.Enabled = False
		sync_manual_chk6.Enabled = False
		sync_manual_chk7.Enabled = False
		sync_manual_chk8.Enabled = False
		sync_manual_chk9.Enabled = False
		sync_manual_chk10.Enabled = False
		sync_manual_chk11.Enabled = False
		sync_manual_chk12.Enabled = False
		sync_manual_chk_docs_templates.Enabled = False
				
		sync_manual_chk1.Checked = True
		sync_manual_chk2.Checked = True
		sync_manual_chk3.Checked = False
		sync_manual_chk4.Checked = False
		sync_manual_chk5.Checked = False
		sync_manual_chk6.Checked = False
		sync_manual_chk7.Checked = False
		sync_manual_chk8.Checked = False
		sync_manual_chk9.Checked = False
		sync_manual_chk10.Checked = False
		sync_manual_chk11.Checked = False
		sync_manual_chk12.Checked = False
		sync_manual_chk_docs_templates.Checked = False
		
		PanelMestres.Visible = False
		sync_manual_runfirstintall.Checked = False
		sync_manual_downloadrunfirstintall.Checked = False
	End If
End Sub

Sub sync_manual_Radio_todos_CheckedChange(Checked As Boolean)
	If Checked Then
		sync_manual_chk1.Enabled = False
		sync_manual_chk2.Enabled = False
		sync_manual_chk3.Enabled = False
		sync_manual_chk4.Enabled = False
		sync_manual_chk5.Enabled = False
		sync_manual_chk6.Enabled = False
		sync_manual_chk7.Enabled = False
		sync_manual_chk8.Enabled = False
		sync_manual_chk9.Enabled = False
		sync_manual_chk10.Enabled = False
		sync_manual_chk11.Enabled = False
		sync_manual_chk12.Enabled = False
		sync_manual_chk_docs_templates.Enabled = False
					
		sync_manual_chk1.Checked = True
		sync_manual_chk2.Checked = True
		sync_manual_chk3.Checked = True
		sync_manual_chk4.Checked = True
		sync_manual_chk5.Checked = True
		sync_manual_chk6.Checked = True
		sync_manual_chk7.Checked = True
		sync_manual_chk8.Checked = True
		sync_manual_chk9.Checked = True
		sync_manual_chk10.Checked = True
		sync_manual_chk11.Checked = True
		sync_manual_chk12.Checked = True
		sync_manual_chk_docs_templates.Checked = True
		
		PanelMestres.Visible = False
		sync_manual_runfirstintall.Checked = False
		sync_manual_downloadrunfirstintall.Checked = False
	End If
End Sub

Sub sync_manual_Radio_mestres_CheckedChange(Checked As Boolean)
	If Checked Then
		sync_manual_chk1.Checked = False
		sync_manual_chk2.Checked = False
		sync_manual_chk3.Checked = False
		sync_manual_chk4.Checked = False
		sync_manual_chk5.Checked = False
		sync_manual_chk6.Checked = False
		sync_manual_chk7.Checked = False
		sync_manual_chk8.Checked = False
		sync_manual_chk9.Checked = False
		sync_manual_chk10.Checked = False
		sync_manual_chk11.Checked = False
		sync_manual_chk12.Checked = False
		sync_manual_chk_docs_templates.Checked = False
		
		DisclaimerMestres.text = ShareCode.Sync_DisclaimerMestres
		PanelMestres.Visible = True
		sync_manual_runfirstintall.Enabled = True
		sync_manual_downloadrunfirstintall.Enabled = True
		sync_manual_runfirstintall.Checked = True
		sync_manual_downloadrunfirstintall.Checked = False
	End If
End Sub

Sub SetChecksSyncManual
	
	ShareCode.SYNC_COMPONENTS=""
	If ShareCode.SyncManualComponents.IsInitialized Then
		ShareCode.SyncManualComponents.Clear
	Else
		ShareCode.SyncManualComponents.Initialize
	End If
	
	If sync_manual_chk1.Checked Then ShareCode.SyncManualComponents.Add("1")
	If sync_manual_chk2.Checked Then ShareCode.SyncManualComponents.Add("2")
	If sync_manual_chk3.Checked Then ShareCode.SyncManualComponents.Add("3")
	If sync_manual_chk4.Checked Then ShareCode.SyncManualComponents.Add("4")
	If sync_manual_chk5.Checked Then ShareCode.SyncManualComponents.Add("5")
	If sync_manual_chk6.Checked Then ShareCode.SyncManualComponents.Add("6")
	If sync_manual_chk7.Checked Then ShareCode.SyncManualComponents.Add("7")
	If sync_manual_chk8.Checked Then ShareCode.SyncManualComponents.Add("8")
	If sync_manual_chk9.Checked Then ShareCode.SyncManualComponents.Add("9")
	If sync_manual_chk10.Checked Then ShareCode.SyncManualComponents.Add("10")
	If sync_manual_chk11.Checked Then ShareCode.SyncManualComponents.Add("11")
	If sync_manual_chk12.Checked Then ShareCode.SyncManualComponents.Add("12")
	
	ShareCode.SYNC_COMPONENTS = Utils.List2Str(ShareCode.SyncManualComponents,"|")
	
End Sub

Sub CalSynciDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	sync_manual_idate.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub CalSynceDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	sync_manual_edate.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub sync_manual_Btn_idate_Click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (sync_manual_idate.EditText.Text  <> "") Then
		dnow = DateTime.DateParse(sync_manual_idate.text)
	End If
	dd.Initialize("CalSynciDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
'	Log(dd.AccentColor) ' AccentColor2 = Colors.Blue
	dd.show("sync_manual_idate")
	DataVazia = False
End Sub

Sub sync_manual_Btn_edate_Click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (sync_manual_edate.EditText.Text  <> "") Then
		dnow = DateTime.DateParse(sync_manual_idate.text)
	End If
	dd.Initialize("CalSynceDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
	Log(dd.AccentColor) ' AccentColor2 = Colors.Blue
	dd.show("sync_manual_edate")
End Sub


' ************************************************************************
' DIALOGO DE EDIT PARA O TIPO 13,18
' ************************************************************************
Sub getBoxEditNumberText(activ As Object, this As FloatLabeledEditText, title2show As String)
	
	Dim sf As Object = ApplDialog.ShowAsync(title2show, "Confirmar", "Cancelar", "", Null, False)
	
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(300dip, 200dip)
	Else
		ApplDialog.SetSize(300dip, 200dip)
	End If
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_number_text")
	BoxEditNumberText.Text=this.Text
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		this.Text = BoxEditNumberText.Text
		CallSubDelayed2(activ, "ReturnFromNumberBox", this)
	End If
End Sub

Sub getBoxEditNumberTextEDIT(activ As Object, this As EditText, title2show As String)
	
	Dim sf As Object = ApplDialog.ShowAsync(title2show, "Confirmar", "Cancelar", "", Null, False)
	
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If Not(ShareCode.ISPHONE) Then
		ApplDialog.SetSize(300dip, 200dip)
	Else
		ApplDialog.SetSize(300dip, 200dip)
	End If
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_number_text_edit")
	BoxEditNumberTextEDIT.Text=this.Text
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		this.Text = BoxEditNumberTextEDIT.Text
		CallSubDelayed2(activ, "ReturnFromNumberBoxEDIT", this)
	End If
End Sub

Private Sub btn_Upload_SyncManual_Click
	btn_Upload_SyncManual.Color = Consts.ColorMain
	btn_Download_SyncManual.Color = Colors.LightGray
	panel_SyncManual_Upload.Visible = True
	panel_SyncManual_Download.Visible = False
	
End Sub

Private Sub btn_Download_SyncManual_Click
	btn_Upload_SyncManual.Color = Colors.LightGray
	btn_Download_SyncManual.Color = Consts.ColorMain
	panel_SyncManual_Upload.Visible = False
	panel_SyncManual_Download.Visible = True
End Sub

Sub CreatelstOfflineData(Req As String, checkedReq As Boolean, height As Int) As Panel
	Dim xui As XUI
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 100%x, height)
	p.LoadLayout("ListaOfflineReq" )
	ChkReqOffline.Checked = checkedReq
	txtReqOffline.text = Req
	p.Tag = $"${Req}|${Utils.Bool2Int(checkedReq)}"$
	Return p
End Sub
