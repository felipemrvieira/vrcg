B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
'StructChecklistItems
Sub Class_Globals

	Type CLTypeOptions( Tagcode As String, Title() As String, Description As String, oCount As Int, oType As Int, _
						oMulti As Boolean, oJump() As String, oNames() As String, oColors() As Int, _
						oValues() As Map, oOptions() As Boolean, NoAsk As Boolean)
	Type BtnCfgOption(Color As Int, ValueOk As Int, Jump As String)
	Type PanCfgOption(TagCode As String, Multi As Boolean, NoAsk As Boolean) 
	
	Private CLItem_Title As Label
	Private CLItem_Description As Label
	Private CLItem_Tagcode As Label
	
	Private CLItem_EditText As EditText
	Private CLItem_Button As Button
	Private CLItem_Selection As B4XComboBox2
	Private CLItem_RepeatBnt As Button
	Private CLItem_DateSelect As AnotherDatePicker
	

	
	Public FirstOptionCheck As String			' Datetime of check clik
	Public FirstOptionSelect As String 			' Date of first selection
	Public OptionLatitude As String
	Public OptionLongitude As String
	
	Private OptionsCount As Int = 0
	Private OptionsType As Int = 0				' Edit, Button, Selection
	Private	OptionsMulti As Boolean = False		' Single Option or Multioptions
	Private OptionJumpTo As String = ""
	
	Private BaseActivity As Activity
	Private BaseView As B4XView
	Private BaseDesigner As String
	Private BaseOptions As CLTypeOptions
	Private BaseHeight As Int
	Private ForceRound As Boolean = False
	Private IsNoAsk As Boolean = False
	Private butActionsClose As Button
	Private butActions As Button
	Private butTask As Button
	Private butPhoto As Button
	Private panelActionOptions As Panel
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Activity As Activity, View As B4XView, Designer As String, Height As Int, Rounded As Boolean)
	BaseActivity = Activity
	BaseView = View
	BaseDesigner = Designer
	BaseHeight = Height
	ForceRound = Rounded
End Sub

Public Sub CreateLineOptions(opts As CLTypeOptions, expViews As Int) As B4XView
	BaseOptions = opts
	Dim p As Panel
	p.Initialize("CLLineClick")
	BaseActivity.AddView(p, 0, 0, 100%x, BaseHeight)
	p.LoadLayout(BaseDesigner)
	p.RemoveView
	p.Tag = PanelConfigMake(opts.Tagcode, opts.oMulti, opts.NoAsk)
	IsNoAsk = opts.NoAsk
	
	Select BaseOptions.oType
		Case Consts.CLOptionType_Buttons
			Dim lst As List = BaseOptions.Title
			Dim TitlesIn As Int = lst.Size 'BaseOptions.Title.Length
			Dim iCount As Int = p.NumberOfViews-(TitlesIn+expViews)  '1
			Dim oCount As Int = BaseOptions.oCount
			If (iCount = oCount) Then
				Dim CLItem_Title As Label = p.GetView(Consts.ARR_FIRSTITEM)
				CLItem_Title.Text = BaseOptions.Title(Consts.ARR_FIRSTITEM)
				For i = Consts.ARR_SECONDITEM To iCount 'p.NumberOfViews-1
					Dim nCLItem_Button As Button = p.GetView(i)
					'CLItem_Button.Initialize("CLItem_Button")
					
					nCLItem_Button.Text = BaseOptions.oNames(i-1)
					nCLItem_Button.Color = Consts.ColorBlue
					If ForceRound Then 
						Dim cd As ColorDrawable
						cd.Initialize(Consts.ColorBlue, 1000dip)
						nCLItem_Button.Background = cd
					End If
					Dim m As Map = BaseOptions.oValues(i-1)
					Dim v As Int = m.Get("value")
					If (v = 1) Then nCLItem_Button.Color = BaseOptions.oColors(i-1)
					nCLItem_Button.Tag = ButtonConfigMake(BaseOptions.oColors(i-1), v, BaseOptions.oJump(i-1))
					'Dim bbt As Button
					'bbt = CLItem_Button
					'bbt.Invalidate
					Log("Added to button : " & nCLItem_Button.Text)
					
				Next
				Dim OptionsAdd As List = BaseOptions.oOptions
				If (OptionsAdd.Get(Consts.POSOPTION_REPEAT) = 1) Then
					'CLItem_RepeatBnt
				End If
				
'				Public Const POSOPTION_REPEAT As Int = 0
'				Public Const POSOPTION_CRITICAL As Int = 1
'				Public Const POSOPTION_MANDATORY As Int = 2
'				Public Const POSOPTION_MULTIOP As Int = 3
			Else
				Log($"Error: Número de Views (${iCount}) diferente do número de objectos (${oCount})"$)
			End If
'		Case Consts.CLOptionType_MultiButtons
'			If (p.NumberOfViews = BaseOptions.oCount) Then
'				CLItem_Title = p.GetView(Consts.ARR_FIRSTITEM)
'				For i = Consts.ARR_SECONDITEM To p.NumberOfViews-1
'					CLItem_Button = p.GetView(i)
'					CLItem_Button.Text = BaseOptions.Title
'					CLItem_Button.Color = Consts.ColorBlue
'					Dim m As Map = BaseOptions.oValues(i-1)
'					Dim v As Int = m.Get("value")
'					If (v = 1) Then CLItem_Button.Color = BaseOptions.oColors(i-1)
'					CLItem_Button.Tag = ButtonConfigMake(BaseOptions.oColors(i-1), v, BaseOptions.oJump(i-1))
'				Next
'			Else
'				Log("Error: Número de Views diferente do número de objectos")
'			End If
'		Case Consts.CLOptionType_TextEdit
'			If (p.NumberOfViews = BaseOptions.oCount) Then
'				CLItem_Title = p.GetView(Consts.ARR_FIRSTITEM)
'				For i = Consts.ARR_SECONDITEM To p.NumberOfViews-1
'					CLItem_Button = p.GetView(i)
'					CLItem_Button.Text = BaseOptions.Title
'					CLItem_Button.Color = Consts.ColorBlue
'					Dim m As Map = BaseOptions.oValues(i-1)
'					Dim v As Int = m.Get("value")
'					If (v = 1) Then CLItem_Button.Color = BaseOptions.oColors(i-1)
'					CLItem_Button.Tag = ButtonConfigMake(BaseOptions.oColors(i-1), v, BaseOptions.oJump(i-1))
'				Next
'			Else
'				Log("Error: Número de Views diferente do número de objectos")
'			End If
'		Case Consts.CLOptionType_SelectionList
'			If (p.NumberOfViews = BaseOptions.oCount) Then
'				CLItem_Title = p.GetView(Consts.ARR_FIRSTITEM)
'				CLItem_Selection = p.GetView(Consts.ARR_SECONDITEM)
'				
''				For i = Consts.ARR_SECONDITEM To p.NumberOfViews-1
''					CLItem_Button = p.GetView(i)
''					CLItem_Button.Text = BaseOptions.Title
''					CLItem_Button.Color = Consts.ColorBlue
''					Dim m As Map = BaseOptions.oValues(i-1)
''					Dim v As Int = m.Get("value")
''					If (v = 1) Then CLItem_Button.Color = BaseOptions.oColors(i-1)
''					CLItem_Button.Tag = ButtonConfigMake(BaseOptions.oColors(i-1), v, BaseOptions.oJump(i-1))
''				Next
'			Else
'				Log("Error: Número de Views diferente do número de objectos")
'			End If
	End Select
	
'	p.Color = Colors.ARGB(255, 250,250,250)
'	If (status_id = 0) Then p.Color = Colors.ARGB(255, 197,197,197)

	Return p
End Sub

Public Sub OtionsTypeMake(Tagcode As String, Title() As String, Description As String, oCount As Int, oType As Int, _
						oMulti As Boolean, oJump() As String, oNames() As String, oColors() As Int, _
						oValues() As Map, oOptions() As Boolean, NoAsk As Boolean) As CLTypeOptions
	Dim opts As CLTypeOptions
	opts.Title = Title
	opts.Description = Description
	opts.Tagcode = Tagcode
	opts.oCount = oCount
	opts.oType = oType
	opts.oMulti = oMulti
	opts.oJump = oJump
	opts.oNames = oNames
	opts.oColors = oColors
	opts.oValues = oValues
	opts.oOptions = oOptions
	opts.NoAsk = NoAsk
	Return opts
End Sub

Sub ButtonConfigMake(Color As Int, ValueOk As Int, Jump As String) As BtnCfgOption
	Dim opts As BtnCfgOption
	opts.Color = Color
	opts.ValueOk = ValueOk
	opts.Jump = Jump
	Return opts
End Sub

'Type PanCfgOption(TagCode As String, Multi As Boolean) 
Sub PanelConfigMake(TagCode As String, Multi As Boolean, NoAsk As Boolean) As PanCfgOption
	Dim opts As PanCfgOption
	opts.TagCode = TagCode
	opts.Multi = Multi
	opts.NoAsk = NoAsk
	Return opts
End Sub

Sub EditTextField_TextChanged (Old As String, New As String)
	
End Sub

Sub EditTextField_EnterPressed
	
End Sub

Sub EditTextField_FocusChanged (HasFocus As Boolean)
	
End Sub

Sub CLItemButton_Click
	Log("Clicked")
	Dim btn As Button = Sender
	Dim cfgColor As Int = getCfgColor(btn.Tag)
	Dim cfgValue As Int = getCfgValueOk(btn.Tag)
	Dim cfgJump As String = getCfgJump(btn.Tag)
	If cfgValue=0 Then
		If (getPanelMulti(btn.Parent)) Then
			cfgValue = 1
			btn.Color = cfgColor
			btn.Tag = ButtonConfigMake(cfgColor, cfgValue, cfgJump)
		Else
			MakeButtonAction(btn, cfgColor, cfgJump)
		End If
		
		If (cfgJump <> "") Then
			' Make the Jump
		End If
	Else
		cfgValue = 0
		btn.Color = Consts.ColorBlue
	End If
End Sub

Sub MakeButtonAction(btn As Button, cfgColor As Int, cfgJump As String)
	Dim lst As List = getAllPressed(btn, btn.Parent)
	If (lst.Size > 0) Then
		If Not(getPanelNoAsk(btn.Parent)) Then
			Msgbox2("Já existe uma opção como resposta! Deseja substituir a resposta dada pela opção seleccionada?", "Alerta!","Sim", "Não", "", Null)
			Wait For Msgbox_Result(iResult As Int)
			If ((-iResult) = 1) Then
				MakeAllPressedUp(lst)
				btn.Color = cfgColor
				btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJump)
			End If
		Else
			MakeAllPressedUp(lst)
			btn.Color = cfgColor
			btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJump)
		End If
	Else
		btn.Color = cfgColor
		btn.Tag = ButtonConfigMake(cfgColor, 1, cfgJump)
	End If
End Sub

Sub MakeAllPressedUp(lst As List) 
	For i=0 To lst.Size-1
		Dim btn As Button = lst.Get(i)
		btn.Tag = ButtonConfigMake(getCfgColor(btn.Tag), 0, getCfgJump(btn.Tag))
		btn.Color = Consts.ColorBlue
	Next
End Sub

' Check if it is multi or not
' Not Multi - Check if any other button was pressed
' If other pressed - Ask if it can change
' If can change - Uncheck the other buttons and proceed
' Else cancel
Sub getAllPressed(obutton As Object, oparent As Object) As List
	Dim ret As List
	ret.Initialize
	Dim prnt As Panel = oparent
	Dim btn As Button = obutton
	For Each v As View In prnt.GetAllViewsRecursive
		If v Is Button Then
			Dim val As Button = v
			If Not(val = btn) Then
				If (getCfgValueOk(val.Tag) = 1) Then
					ret.Add(v)
				End If
			End If

		Else If v Is CheckBox Then
			'Dim val As CheckBox = v
		Else If v Is Label Then
			'Dim val As Label = v
		End If
	Next
	Return ret
End Sub

Sub getPanelTagcode(obj As Object) As String
	'PanCfgOption(TagCode As String, Multi As Boolean)
	Dim pnl As Panel = obj
	Dim cfg As PanCfgOption = pnl.Tag
	Return cfg.TagCode
End Sub

Sub getPanelMulti(obj As Object) As Boolean
	'PanCfgOption(TagCode As String, Multi As Boolean)
	Dim pnl As Panel = obj
	Dim cfg As PanCfgOption = pnl.Tag
	Return cfg.Multi
End Sub

Sub getPanelNoAsk(obj As Object) As Boolean
	'PanCfgOption(TagCode As String, Multi As Boolean)
	Dim pnl As Panel = obj
	Dim cfg As PanCfgOption = pnl.Tag
	Return cfg.NoAsk
End Sub

'Color As Int, ValueOk As Int, Jump As String)
Sub getCfgColor(obj As BtnCfgOption) As Int
	Return obj.Color
End Sub

Sub getCfgValueOk(obj As BtnCfgOption) As Int
	Return obj.ValueOk
End Sub

Sub getCfgJump(obj As BtnCfgOption) As String
	Return obj.Jump
End Sub

Sub ListItems_SelectedIndexChanged (Index As Int)
	
End Sub

Sub CLLineClick_ItemClick (Index As Int, Value As Object)
	panelActionOptions.Visible = False
'	
'	Private butActionsClose As Button
'	Private butActions As Button
'	Private butTask As Button
'	Private butPhoto As Button
'	Private panelActionOptions As Panel
End Sub

Sub CLLineClick_ItemLongClick (Index As Int, Value As Object)
	panelActionOptions.Visible = True
	Log("Eu pressionei")
End Sub

Sub butPhoto_Click
	
End Sub

Sub butTask_Click
	
End Sub

Sub butActions_Click
	
	'CallSubDelayed2(DialogItemActions, "StartDlgIOActivity", "")
	'ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub butActionsClose_Click
	
End Sub