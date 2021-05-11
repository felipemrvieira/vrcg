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
	Private MyPositionLat, MyPositionLon As String
	Private TimeStart As Timer
	Public Device As Phone
	'Private tse As TabStripViewPagerExtendet
End Sub

Sub Globals
	'Dim Icon As BitmapDrawable
	'Dim xui As XUI
'	Dim prvd As FileProvider
	'Private listsBackground As ImageView
	Private listsBasePanel As Panel
	Private listsBottomLine As Panel
	Private listsBottomPanel As Panel
	'Private listsButtonAdd As Button
	Private listsButtonClose As Button
	Private listsLabelInfo As Label
	Private listsTabPanel As TabStrip
	Private listsTopBar As Panel
	
'	Private ItemsCounter As Int = 0
'	Private userCategory As Label
'	Private userCertDate As Label
'	Private userCertificate As Label
'	Private userName As Label
'	Private userNotes As Label
'	Private userPhoto As ImageView
'	Private usersPanel As Panel
'	Private userTagcode As Label
'	Private userVehicle As Label
'	Private userVehiclePlate As Label
'	Private userShowCertificate As Button
'	Private ListItemCategory As Label
'	Private ListItemDocButton As Label
'	Private ListItemNotes As Label
'	Private ListItemReference As Label
'	Private ListItemTitle As Label
'	Private ListItemQtd As Label
'	Private ListItemPrice As Label
'	Private listDocuments As CustomListView
'	Private listEquipments As CustomListView
	Dim Base64Con As Base64Convert
	Private butWareHouses As Button
	Dim mPopMenu As MenuOnAnyView
	Dim mDocPopMenu As MenuOnAnyView
	Dim mEqipPopMenu As MenuOnAnyView
	Private butDocFilter As Button
	Private butEquipFilter As Button
	Private UserDocuments As List
	Private UserEquipments As List
	Private pc1 As PieChart
	Private listPeriods As B4XComboBox2
	Private StartDateSelect As Label
	Private EndDateSelect As Label
	Private butDateFilter As Button
	Private butCancelFilter As Button
	Private adps As List
	Private labelKPIDescription As Label
	Private labelKPIValue As Label
	Private labelKPIValueCompare As Label
	Private KPIList As CustomListView
	Private KPIUpdateProgress As ProgressBar
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelCopyright As Label
	Private ButtonUserUnavailable As Button
	Private labelUserLate As Label
	Private labelUserAvarage As Label
	Private labelUserNotMade As Label
	Private labelUserMade As Label
	Private panelUserMade As Panel
	Private panelUserLate As Panel
	Private panelUserAvarage As Panel
	Private panelUserNotMade As Panel
	Private pc0 As PieChart
	Private DialogReqPeriodType As Spinner
	Private DialogReqStartDate As FloatLabeledEditText
	Private DialogReqEndDate As FloatLabeledEditText
	Private butReqStartDate As Button
	Private butReqEndDate As Button
	
	Private SDateFilterValue As String = ""
	Private EDateFilterValue As String = ""
	Private PeriodFilterValue As Int = 0
	
	Private KPIListAll As CustomListView
	Private ColorTabPanel As Panel
	Private mainLabelOptLists As Label
	Private mainLogo As ImageView
	Private ButtonActionPause As Button
	Private ButtonAppNetwork As Button
	Private mainActiveUser As Label
	Private LabelEstadoPedidos As Label
	Private LabelPeriodo As Label
	Private LabelDataInicio As Label
	Private LabelDataFim As Label
	Private LabelKPIDescricao As Label
	Private LabelValor As Label
	Private LabelKPIEstadoPedidos As Label
	Private LabelKPIOutrosIndicadores As Label
	Private LabelKPIValor As Label
	Private LabelKPIComparacao As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	Activity.LoadLayout("reportsLayout")
'	tse.Initialize 'to Initialize the class
	mainLabelOptLists.Text = ShareCode.MainOption_KPI.ToUpperCase
	
	If(ShareCode.ISPHONE) Then
		listsTabPanel.LoadLayout("reports_kpiview", ShareCode.reportsIndicadoresDia)
		listsTabPanel.LoadLayout("reports_kpiviewAll", ShareCode.reportsIndicadoresComparacao)
	Else
		listsTabPanel.LoadLayout("reports_kpiview", ShareCode.reportsIndicadoresDia)
		listsTabPanel.LoadLayout("reports_kpiviewAll", ShareCode.reportsIndicadoresComparacao)
	End If

	'*****************************************************************
	'ALTERACAO PC
	'*****************************************************************
	LabelDataInicio.Text = ShareCode.AppDialogsFilterLabelDataInicio
	LabelDataFim.Text = ShareCode.AppDialogsFilterLabelDataFim
	LabelEstadoPedidos.Text = ShareCode.reportsLabelEstadoPedidos
	LabelPeriodo.Text = ShareCode.reportsLabelPeriodo
	LabelKPIDescricao.Text = ShareCode.reportsLabelKPIDescricao
	LabelValor.Text = ShareCode.reportsLabelValor
		
	LabelKPIEstadoPedidos.text = ShareCode.reportsLabelEstadoPedidos
	LabelKPIOutrosIndicadores.Text = ShareCode.reportsLabelKPIOutrosIndicadores
	LabelKPIValor.Text = ShareCode.reportsLabelValor
	LabelKPIComparacao.Text = ShareCode.reportsLabelKPIComparacao
	
	
	
	
	


	'listsTabPanel.LoadLayout("DocsViewLayout", "Documentos e equipamentos") 'user_EquipmentItem  user_DocumentItem
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
'		lbl.Color = Consts.ColorBlue
'		lbl.TextColor = Colors.White
		lbl.Width = 50%x
	Next
	Utils.MakeTabPanelEffect(ColorTabPanel, Consts.ColorMainDarker,Consts.ColorSub)
'	'tse.UnderlineColor(listsTabPanel,Colors.Red)
'	tse.TabBackgroundColor(listsTabPanel,Consts.ColorBlue, Consts.ColorRed, 0)
'	tse.IndicatorColor(listsTabPanel,Colors.Red)
'	'tse.CenterAllTabs(listsTabPanel, 50%x)

	adps = Array(StartDateSelect, EndDateSelect)
	'StartDateSelect.ShowOnThisPanel(DatePanel)
	If FirstTime Then

	End If
	Base64Con.Initialize
	Utils.SetProgressDrawableExt(KPIUpdateProgress,"TOP_BOTTOM", Array As Int(Consts.ColorBlue,Consts.ColorBlue), 0)
	KPIUpdateProgress.Progress = 0
	TimeStart.Initialize("TimeStart",10)
	TimeStart.Enabled = False
	
	LabelVersion.Text = ShareCode.APP_VersionNocodeName
	LabelCopyright.Text = ShareCode.APP_EntityBrand  '"X-Evolution,Lda"
	If ShareCode.USR_STATE = 0 Then
		ButtonUserUnavailable.Visible = True
		ButtonUserUnavailable.Enabled = True
	End If
	UpdateMainLayout
	WindowStatusUpdate
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
		ButtonUserUnavailable.TextColor = Consts.ColorRedOrange
	End If
	
	ButtonActionPause.Enabled = False
	ButtonActionPause.TextColor = Consts.ColorLightSilver
	'	If (ShareCode.CLA_STATE >= 1) Then
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		ButtonActionPause.Enabled = True
		ButtonActionPause.TextColor = Consts.ColorRedOrange
	End If
	'listsLabelInfo.Text = $"${CurrentLineItem} / ${TotalLineItems}"$
End Sub

'
'Sub Activity_KeyPress (KeyCode As Int) As Boolean
'	If KeyCode = KeyCodes.KEYCODE_BACK Then
'		For Each adp As AnotherDatePicker In adps
'			If adp.IsVisible Then
'				adp.btnCancel_Click 'emulate a click on Cancel button
'				Return True
'			End If
'		Next
'	End If
'	Return False
'End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		listsButtonClose_Click
	End If
	Return True
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub TimeStart_Tick
	KPIUpdateProgress.Progress = KPIUpdateProgress.Progress + 1
	If (KPIUpdateProgress.Progress = 100) Then
		TimeStart.Enabled = False
		KPIUpdateProgress.Progress =0
	End If
End Sub

Sub StartReportActivity(index As Int)
	
'	iColors.Initialize
'	sNames.Initialize
'	iCount.Initialize
	Dim sNames() As String 
	Dim iCount() As Int 
	Dim whereclause As String = ""
	Private Record As Cursor
	If (index = 0) Then
		whereclause = " where a.execute_date >= (date('now','-1 month')) "
	Else If (index = 1) Then
		whereclause = " "
	Else If (index = 2) Then
		whereclause = " where a.execute_date = date('now', 'localtime') "
'	Else If (index = 1) Then
'		whereclause = " where strftime('%m', a.execute_date) = strftime('%m', date('now'))-1 "
'	Else If (index = 3) Then
'		Dim sSQL As String = $"${DBStructures.EVC_SQL_KPIALL_STATUS} group by a.status_id order by a.status_id"$
	End If
	
	Dim sSQL As String = $"${DBStructures.EVC_SQL_KPIALL_STATUS} ${whereclause} group by a.status_id order by a.status_id"$
	Log(sSQL)
	Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Dim ret As Int = Record.RowCount
	If (ret >= 1) Then
		Dim iColors(ret) As Int ' As List
		Dim sNames(ret) As String ' As List
		Dim iCount(ret) As Int ' As List
		For i=0 To ret-1
			Record.Position = i
			', a.status_color, a.status_id, count(a.status_id) as counter
'			iColors.Add(Utils.ColorString(Record.GetString("status_color")))
'			sNames.Add(Record.GetString("status_desc"))
'			iCount.Add(Record.GetInt("counter"))
			iColors(i) = Utils.ColorString(Record.GetString("status_color"))
			sNames(i) = Record.GetString("status_desc")
			iCount(i) = Record.GetInt("counter")
		Next
	End If
	Record.Close
	
	createPieChart(pc0, iCount, sNames, iColors)
	createPieChart(pc1, iCount, sNames, iColors)

	Dim padd_Normal() As Int = Array As Int (10dip, 0, 0, 0)
	Dim padd_Inner() As Int = Array As Int (50dip, 0, 0, 0)
	KPIList.Clear
	KPIListAll.Clear
		
	If (sNames.Length >= 1) Then
		Dim total As Int = 0
		For i=0 To iCount.Length-1
			total = total + iCount(i)
		Next
		
		KPIList.Add( CreateKPIRecord( "Total de intervenções", total, "", padd_Normal, 40dip), "") 
		KPIListAll.Add( CreateKPIRecordAll( "Total de intervenções", total, "---", padd_Normal, 40dip), "")
		For i=0 To sNames.Length-1
			KPIList.Add( CreateKPIRecord( sNames(i), iCount(i), "", padd_Inner, 40dip), "")
			KPIListAll.Add( CreateKPIRecordAll( sNames(i), iCount(i), "---", padd_Inner, 40dip), "")
		Next
	End If
	listPeriods.SetItems(Utils.GetListStrArrayItems( Array As String("Últimos 30 dias", "Desde o ínicio", "Intervenções do dia"))) ', "Entre datas")))
	listPeriods.SelectedIndex = index
End Sub

Sub createPieChart(view As PieChart, intStatus() As Int, descStatus() As String, intColors() As Int)
	view.BorderColor = Colors.Transparent 
	view.BorderWidth = 7.0
	view.CircleBorderColor = Colors.Transparent
	view.CircleBorderWidth = 15.0
	view.DisplayBorder = True 
	view.LongitudeColor = Colors.Transparent
	
	view.PieTextColor = Colors.black
	view.PieTextSize = 15.0
	view.setTitlePosition(pc1.Left + 5%x, pc1.Top + 2%y)
	
	view.PieSliceColors = intColors 'piecolors
	view.PieSliceValues = intStatus 'pievalues
	view.PieSliceTitles = descStatus 'pietitles
	view.initPieChart
End Sub

Sub CreateKPIRecord(Title As String, Value As String, ValCompare As String, padd() As Int, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	If(ShareCode.ISPHONE) Then
		height = 60dip
		Activity.AddView(p, 0, 0, 100%x, height)
	Else
		Activity.AddView(p, 0, 0, 560dip, height)
	End If
	p.LoadLayout("reports_kpiItems")
	p.RemoveView
	labelKPIDescription.Padding = padd
	labelKPIDescription.text = Title
	labelKPIValue.text = Value
	Return p
End Sub

Sub CreateKPIRecordAll(Title As String, Value As String, ValCompare As String, padd() As Int, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	If(ShareCode.ISPHONE) Then
		height = 60dip
		Activity.AddView(p, 0, 0, 100%x, height)
	Else
		Activity.AddView(p, 0, 0, 560dip, height)
	End If
	p.LoadLayout("reports_kpiItemsAll")
	p.RemoveView
	labelKPIDescription.Padding = padd
	labelKPIDescription.text = Title
	labelKPIValue.text = Value
	labelKPIValueCompare.text = ValCompare
	Return p
End Sub

Sub whouses_Click(MenuName As String)
'	Select MenuName
'		Case "Automobiles"
'		Case "Passenger Buses"
'		Case "Trucks"
'	End Select
End Sub


Sub listsTabPanel_PageSelected (Position As Int)
	
End Sub

Sub listsButtonClose_Click
	Log("Back REPORTS")
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

Sub butWareHouses_Click
	mPopMenu.OpenMenu()
End Sub

Sub butEquipFilter_Click
	mEqipPopMenu.OpenMenu()
End Sub

Sub butDocFilter_Click
	mDocPopMenu.OpenMenu()
End Sub


Sub butCancelFilter_Click
	TimeStart.Enabled = True
End Sub

Sub butDateFilter_Click
	If (SDateFilterValue = "") Then SDateFilterValue = ShareCode.CURRENT_APPDATE
	If (EDateFilterValue = "") Then EDateFilterValue = ShareCode.CURRENT_APPDATE
	Dim curr As KPIFilter = Types.MakeKPIFilter(PeriodFilterValue, SDateFilterValue, EDateFilterValue)
	Dim Filter As AppDialogs
	Filter.Initialize
	Filter.GetKPIFilterDialog(Activity, curr)
	TimeStart.Enabled = True
End Sub

Sub listPeriods_SelectedIndexChanged (Index As Int)
	StartReportActivity(Index)
End Sub

Sub KPIList_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub EndDateSelect_Click
'	If (listPeriods.SelectedIndex = Consts.KPIBetweenDates) Then
'		Dim dd As DatePickerDialog
'		DateTime.DateFormat = Consts.DateTimeFormat
'		Dim dnow As Long = DateTime.Now
'		If (EndDateSelect.Text  <> "") Then
'			dnow = DateTime.DateParse(EndDateSelect.text)
'		End If
'		dd.Initialize("CalendarGetEndDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
'		dd.show("EndDateSelect")
'	End If
End Sub

Sub CalendarGetEndDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
'	Dim moy As String = monthOfYear+1
'	If (moy.Length = 1) Then moy = "0" & moy
'	Dim dom As String = dayOfMonth
'	If (dom.Length = 1) Then dom = "0" & dom
'	EndDateSelect.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub StartDateSelect_Click
'	If (listPeriods.SelectedIndex = Consts.KPIBetweenDates) Then
'		Dim dd As DatePickerDialog
'		DateTime.DateFormat = Consts.DateTimeFormat
'		Dim dnow As Long = DateTime.Now
'		If (StartDateSelect.Text  <> "") Then
'			dnow = DateTime.DateParse(StartDateSelect.text)
'		End If
'		dd.Initialize("CalendarGetStartDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
'		dd.show("StartDateSelect")
'	End If
End Sub

Sub CalendarGetStartDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
'	Dim moy As String = monthOfYear+1
'	If (moy.Length = 1) Then moy = "0" & moy
'	Dim dom As String = dayOfMonth
'	If (dom.Length = 1) Then dom = "0" & dom
'	StartDateSelect.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub ButtonUserUnavailable_Click
	
End Sub

Sub DialogReqPeriodType_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub mainLogo_Click
	listsButtonClose_Click
End Sub

Sub ButtonActionPause_Click
	If (ShareCode.SESS_IN_PAUSE = 1) Then
		'Starter.AppState.WriteBool("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
		Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			ShareCode.SESS_IN_PAUSE = 0
			Starter.AppState.WriteInteger("APP_START", "SESS_IN_PAUSE", ShareCode.SESS_IN_PAUSE)
			Starter.AppState.Flush
		End If
	End If
	WindowStatusUpdate
End Sub
