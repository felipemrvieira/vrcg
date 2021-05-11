B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
'MonthViewCalendar Class

#Event: MonthChangging (NewMonth As Int, Allow As Boolean)
#Event: MonthChanged (PrevMonth as int, NewMonth as int)
#Event: YearChangging (NewYear as int, Allow as boolean)
#Event: YearChanged (PrevYear as int, NewYear as int)
#Event: DayChangging (NewDay as int, Allow as boolean)    
#Event: DayChanged (PrevDay as int, NewDay as int)
#Event: IndicatorAdded (Number as int, Day as int, Month as int, Year as int) 
#DesignerProperty: Key: ShowTitle, DisplayName: Show Title, FieldType: Boolean, DefaultValue: True, Description: Show a title bar for Calendar.
#DesignerProperty: Key: Title, DisplayName: Calendar Title, FieldType: String, DefaultValue: Month View Calendar
#DesignerProperty: Key: TitleBackColor, DisplayName: Calendar Title Background Color, DefaultValue: 0xFFCD0000, FieldType: Color
#DesignerProperty: Key: TitleFontColor, DisplayName: Calendar Title Font Color, DefaultValue: 0xFFFFFFFF, FieldType: Color
#DesignerProperty: Key: MonthNames, DisplayName: Month Names List, FieldType: String, DefaultValue: January|February|March|April|May|June|July|August|September|October|November|December
#DesignerProperty: Key: ShortMonthNames, DisplayName: Short Month Names List, FieldType: String, DefaultValue: Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec
#DesignerProperty: Key: MonthBackColor, DisplayName: Calendar Month Background Color, DefaultValue: 0xFFCACACA, FieldType: Color
#DesignerProperty: Key: MonthFontColor, DisplayName: Calendar Month Font Color, DefaultValue: 0xFFFFFFFF, FieldType: Color
#DesignerProperty: Key: WeekStartsOn, DisplayName: Week Starts On, FieldType: String, DefaultValue: Monday, List: Monday|Sunday
#DesignerProperty: Key: ShowWeekNumber, DisplayName: Show Week Number, FieldType: Boolean, DefaultValue: False, Description: Show column with week number.
#DesignerProperty: Key: DayWeekNames, DisplayName: Day Week Names, FieldType: String, DefaultValue: Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday
#DesignerProperty: Key: ShortDayWeekNames, DisplayName: Short Day Week Names, FieldType: String, DefaultValue: Mon|Tue|Wed|Thu|Fri|Sat|Sun
#DesignerProperty: Key: DayWeekBorder, DisplayName: Day Week Border, FieldType: Int, DefaultValue: 0
#DesignerProperty: Key: DayWeekBorderColor, DisplayName: Day Week Border Color, FieldType: Color, DefaultValue: Null
#DesignerProperty: Key: HighlightWeekend, DisplayName: Highlight Weekend, FieldType: Boolean, DefaultValue: True, Description: Highlight the weekend column with specific color.
#DesignerProperty: Key: WeekendColColor, DisplayName: Weekend column Color, FieldType: Color, DefaultValue: 0xFFCACACA, Description: Color for weekend columns.
#DesignerProperty: Key: WeekBackColor, DisplayName: Calendar Week Bar Background Color, DefaultValue: 0xFFDFDFDF, FieldType: Color
#DesignerProperty: Key: WeekFontColor, DisplayName: Calendar Week Bar Font Color, DefaultValue: 0xFF3E3E3E, FieldType: Color
#DesignerProperty: Key: HighlightToday, DisplayName: Highlight Today, FieldType: Boolean, DefaultValue: True, Description: Do highlight today?   If HaveStates is TRUE CellCurrentColor will override Highlightcolor
#DesignerProperty: Key: HighlightColor, DisplayName: Today Color cell, DefaultValue: 0xFF65D5EC, FieldType: Color, Description: Color for today Cell.
#DesignerProperty: Key: HaveStates, DisplayName: Cells Have States, FieldType: Boolean, DefaultValue: True, Description: Identify if each cell can have a state.
#DesignerProperty: Key: StatesList, DisplayName: List of States, FieldType: String, DefaultValue: Clear|Current|Selected|Something there|Holliday, Description: Starting position = 0 (0=Clear; 1=Current; ...)
#DesignerProperty: Key: CellHollidayColor, DisplayName: Cell Holliday Color (ID:4), DefaultValue: 0xFFCACACA, FieldType: Color, Description: Color for holliday Cells.
#DesignerProperty: Key: CellSomethingColor, DisplayName: Cell Something Color (ID:3), DefaultValue: 0xFFFFFFFF, FieldType: Color, Description: Color for Cells with state = 3.
#DesignerProperty: Key: CellSelectedBorder, DisplayName: Cell Selected Border, DefaultValue: 3, MinRange: 0, MaxRange: 100, FieldType: Int 
#DesignerProperty: Key: CellSelectedBorderRadius, DisplayName: Cell Selected Border Radius, DefaultValue: 0, FieldType: Int
#DesignerProperty: Key: CellSelectedBorderColor, DisplayName: Cell Selected Border Color, DefaultValue: 0xFF0061C0, FieldType: Color, Description: Border color for selected Cells.
#DesignerProperty: Key: CellSelectedColor, DisplayName: Cell Selected Color (ID:2), DefaultValue: 0xFF70D75E, FieldType: Color, Description: Color for selected Cells.
#DesignerProperty: Key: CellCurrentColor, DisplayName: Cell Current Color (ID:1), DefaultValue: 0xFF65D5EC, FieldType: Color, Description: Color for current Cell.
#DesignerProperty: Key: CellClearColor, DisplayName: Cell Clear Color (ID:0), DefaultValue: 0xFFFFFFFF, FieldType: Color, Description: Color for cleared Cells.
#DesignerProperty: Key: ShowIndicators, DisplayName: Show Indicators in Cell, DefaultValue: True, FieldType: Boolean, Description: Show indicators in cells?
#DesignerProperty: Key: IndicatorFontColor, DisplayName: Indicator Font Color, DefaultValue: 0xFF3E3E3E, FieldType: Color, Description: Font color for indicators.
#DesignerProperty: Key: IndicatorFontSize, DisplayName: Indicator Font Size, DefaultValue: 8, FieldType: Int, Description: Fontsize for indicators.
#DesignerProperty: Key: HaveBackground, DisplayName: Have Background, DefaultValue: True, FieldType: Boolean, Description: Indicators have a background? If false background will be transparent.
#DesignerProperty: Key: IndicatorBackgroundColor, DisplayName: Indicator Background Color, DefaultValue: 0xFFCD0000, FieldType: Color, Description: Background color for indicators.
#DesignerProperty: Key: RoundIndicator, DisplayName: Round Indicator, DefaultValue: True, FieldType: Boolean, Description: Is rounded? If yes will show as a circle.
#DesignerProperty: Key: GeneralRadius, DisplayName: General Border Radius, DefaultValue: 0, FieldType: Int
#DesignerProperty: Key: CellFontSize, DisplayName: Cell Font Size, DefaultValue: 12, FieldType: Int

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Panel
	Private Const DefaultColorConstant As Int = -984833 'ignore
	Private Const PanelMinHeight As Int = 50dip
	Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DOWN = 0 As Int
	
	Private TitlePanel As Panel
	Private MonthPanel As Panel
	Private WeekPanel As Panel
	Private CellsPanel As Panel
	Private CellsPanelBack As Panel
	
	
	Private Months As Spinner
	Private Years As Spinner
	
	Private waitForAddToActivity As Boolean
	Private GeneralRadius As Int
	
	Private cvs As Canvas
	Private cvsBackground As Canvas
	Private month, year As Int
	Private lmonth, lyear As Int
	Private tempSelectedDay As Int
	'Private CellsPanelBack As Panel
	Private targetLabel As Label
	Private lblSelectedDay As Label
	Private dayOfWeekOffset As Int
	Private daysInMonth As Int
	Private tempSelectedColor As Int
	Private selectedColor As Int
	Private minYear, maxYear, firstDay As Int
	Private selectedDate As Long
	Private selectedYear, selectedMonth, selectedDay As Int
	Private boxW, boxH As Float
	Private vCorrection As Float
	Dim YearsList, MonthList As List
	
	Private innerMaps As Map
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	If (Base.IsInitialized = False) Then
		Base.Initialize("")
	End If
	mBase = Base
	waitForAddToActivity = True
	CallSubDelayed2(Me, "AfterLoadLayout", Props)
End Sub

Public Sub AfterLoadLayout (Props As Map)
	Log("***************** AFTER LOAD LAYOUT *****************")
	waitForAddToActivity = False
	GeneralRadius = Props.Get("GeneralRadius")
	
	month = GetCurrentMonth
	year = GetCurrentYear
	InitializeComponents
	If SetDimensions(Props) Then
		selectedMonth = month
		selectedYear = year
		cvs.Initialize(CellsPanel)
		
		vCorrection = cvs.MeasureStringHeight("1", Typeface.DEFAULT_BOLD, Props.Get("CellFontSize")) / 2
		If (Props.Get("ShowWeekNumber")) Then
			boxW = cvs.Bitmap.Width / 8
		Else
			boxW = cvs.Bitmap.Width / 7
		End If
		boxH = cvs.Bitmap.Height / 7
		cvsBackground.Initialize(CellsPanelBack)
		innerMaps = Props
		DrawDays(innerMaps)
	End If
End Sub

Sub InitializeComponents
	Log("***************** INITIALIZE COMPONENTS *****************")
	TitlePanel.Initialize("TitlePanel")
	MonthPanel.Initialize("MonthPanel")
	WeekPanel.Initialize("WeekPanel")
	CellsPanel.Initialize("CellsPanel")
	CellsPanelBack.Initialize("CellsPanelBack")
	targetLabel.Initialize("targetLabel")
	lblSelectedDay.Initialize("")
End Sub

Sub SetDimensions(Props As Map) As Boolean
	Log("***************** SET DIMENSIONS *****************")
	Dim AlignCenter As Int = Bit.Or(Gravity.CENTER, Gravity.CENTER_HORIZONTAL)
	Dim NextTop As Int = 0, NextLeft As Int = 0
	If (Props.Get("ShowTitle")) Then 
		TitlePanel.Top = NextTop
		TitlePanel.Left = NextLeft
		TitlePanel.Width = mBase.Width
		TitlePanel.Height = PanelMinHeight
		TitlePanel.Color = Props.Get("TitleBackColor") '0xFFCD0000
		AddLabel(TitlePanel, Props.Get("Title"), AlignCenter, Props.Get("TitleBackColor"), Props.Get("TitleFontColor"))
		mBase.AddView(TitlePanel, NextLeft, NextTop, TitlePanel.Width, TitlePanel.Height)
		NextTop = NextTop + PanelMinHeight
		Log(Props.Get("ShowTitle"))
		Log(Props.Get("Title"))
	End If
	
	MonthPanel.Top = NextTop
	MonthPanel.Left = NextLeft
	MonthPanel.Width = mBase.Width
	MonthPanel.Height = PanelMinHeight
	MonthPanel.Color = Props.Get("MonthBackColor")
	AddList(MonthPanel, "cmbboxMonth", Props.Get("MonthNames"), GetCurrentMonth-1, 0, Props.Get("MonthBackColor"), Props.Get("MonthFontColor"))
	Dim sYears As String = GenerateListString(1970,2100)
	AddList(MonthPanel, "cmbboxYear", sYears, GetValuePosition(sYears, GetCurrentYear), 1, Props.Get("MonthBackColor"), Props.Get("MonthFontColor"))

	mBase.AddView(MonthPanel, NextLeft, NextTop, MonthPanel.Width, MonthPanel.Height)
	NextTop = NextTop + PanelMinHeight
	Log(Props.Get("MonthNames"))
	
	Dim et As EditText
	et.Initialize("")
	targetLabel.Background = et.Background
	
	WeekPanel.Top = NextTop
	WeekPanel.Left = NextLeft
	WeekPanel.Width = mBase.Width
	WeekPanel.Height = PanelMinHeight
	WeekPanel.Color = Props.Get("WeekBackColor")
	Dim Columns As Int = 7
	If (Props.Get("ShowWeekNumber")) Then 
		Columns = 8
	End If
	Dim BLLeft As Int = 0, Blocks As Int = Round(mBase.Width/Columns)
	Dim WDays As String = Props.Get("ShortDayWeekNames")
	Dim NamesList As List = GetAsList(WDays)
	
	For i=0 To Columns-1
		Dim n As String
		If (Props.Get("ShowWeekNumber")) Then 
			If (i = 0) Then
				n = "#"
			Else
				n = NamesList.Get(i-1)
			End If
		Else
			n = NamesList.Get(i)
		End If
		Log($"${n} : ${i}"$)
		AddLabelPos(WeekPanel, n, AlignCenter, Props.Get("WeekBackColor"), Props.Get("WeekFontColor"), BLLeft, BLLeft+Blocks, Props.Get("DayWeekBorder"), Props.Get("DayWeekBorderColor"))
		BLLeft = BLLeft+Blocks
		n = ""
	Next
	If (Props.Get("ShowWeekNumber")) Then
		AddLabelPos(WeekPanel, NamesList.Get(NamesList.Size-1), AlignCenter, _
			Props.Get("WeekBackColor"), Props.Get("WeekFontColor"), BLLeft, BLLeft+Blocks, Props.Get("DayWeekBorder"), Props.Get("DayWeekBorderColor"))
	End If
	
	mBase.AddView(WeekPanel, NextLeft, NextTop, WeekPanel.Width, WeekPanel.Height)
	NextTop = NextTop + PanelMinHeight
	Log(Props.Get("WeekPanel"))
	
	CellsPanelBack.Top = NextTop
	CellsPanelBack.Left = NextLeft
	CellsPanelBack.Width = mBase.Width
	CellsPanelBack.Height = mBase.Height
	mBase.AddView(CellsPanelBack, NextLeft, NextTop, CellsPanelBack.Width, CellsPanelBack.Height)
	
	CellsPanel.Top = NextTop
	CellsPanel.Left = NextLeft
	CellsPanel.Width = mBase.Width
	CellsPanel.Height = mBase.Height
	mBase.AddView(CellsPanel, NextLeft, NextTop, CellsPanel.Width, CellsPanel.Height)
	
		
'		MonthPanel.Initialize("MonthPanel")
'		WeekPanel.Initialize("WeekPanel")
'		CellsPanel.Initialize("CellsPanel")   
	Return True
End Sub

Private Sub SelectDay(day As Int, UpdateLabel As Boolean)
	
	selectedDate = DateUtils.SetDate(year, month, day)
	selectedDay = day
	selectedMonth = month
	selectedYear = year
	If UpdateLabel Then targetLabel.Text = DateTime.Date(selectedDate)
End Sub


Private Sub targetLabel_Click
	'Show
	Log("show:taretLabel")
	targetLabel.Color = Colors.Black
End Sub

Private Sub CellsPanel_Touch (ACTION As Int, X As Float, Y As Float)
	Dim boxX = X / boxW, boxY = Y / boxH As Int
	Dim newSelectedDay As Int = boxY * 7 + boxX + 1 - dayOfWeekOffset
	Dim validDay As Boolean = newSelectedDay > 0 And newSelectedDay <= daysInMonth
	
	year = Years.GetItem( Years.SelectedIndex )   ' = year - minYear
	month = Months.SelectedIndex +1
	
	If ACTION = ACTION_DOWN Or ACTION = ACTION_MOVE Then
		If newSelectedDay = tempSelectedDay Then Return
		cvsBackground.DrawColor(Colors.Transparent) 'clear background
		tempSelectedDay = newSelectedDay
		If validDay Then
			DrawBox(cvsBackground, tempSelectedColor, boxX, boxY)
			lblSelectedDay.Text = newSelectedDay
			lblSelectedDay.Visible = True
		Else
			lblSelectedDay.Visible = False
		End If
	Else If ACTION = ACTION_UP Then
		lblSelectedDay.Visible = False
		cvsBackground.DrawColor(Colors.Transparent)
		If validDay Then
			SelectDay(newSelectedDay, True)
			CallSub3(mCallBack, mEventName & "_Closed", False, GetDate)
			Hide
		End If
	End If
	CellsPanelBack.Invalidate
	Log($"${year} : ${month}"$)
End Sub

Public Sub GetDate As Long
	Return selectedDate
End Sub

Public Sub SetDate(date As Long, UpdateLabel As Boolean)
	If waitForAddToActivity Then
		CallSubDelayed3(Me, "SetDate", date, UpdateLabel)
		Return
	End If
	year = DateTime.GetYear(date)
	month = DateTime.GetMonth(date)
	Log($"SET: ${year}-${month}"$)
	SelectDay(DateTime.GetDayOfMonth(date), UpdateLabel)
	Years.SelectedIndex = year - minYear
	Months.SelectedIndex = month - 1
	
	If Not(YearsList.IsInitialized) Then YearsList.Initialize
	If Not(MonthList.IsInitialized) Then MonthList.Initialize
End Sub

Public Sub Hide
	'mBase.SetVisibleAnimated(500, False)
End Sub

Public Sub Show
	If waitForAddToActivity Then
		'not ready yey
		CallSubDelayed(Me, "show")
		Return
	End If
	mBase.SetVisibleAnimated(500, True)
	DrawDays(innerMaps)
End Sub

Public Sub ShowOnThisPanel(pnl As Panel)
	mBase = pnl
	CallSubDelayed(Me, "show")
End Sub


'#DesignerProperty: Key: WeekStartsOn, DisplayName: Week Starts On, FieldType: String, DefaultValue: Monday, List: Sunday|Monday
'#DesignerProperty: Key: ShowWeekNumber, DisplayName: Show Week Number, FieldType: Boolean, DefaultValue: True, Description: Show column with week number.
'#DesignerProperty: Key: DayWeekNames, DisplayName: Day Week Names, FieldType: String, DefaultValue: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
'#DesignerProperty: Key: ShortDayWeekNames, DisplayName: Short Day Week Names, FieldType: String, DefaultValue: Mon|Sun|Tue|Wed|Thu|Fri|Sat
'#DesignerProperty: Key: HighlightWeekend, DisplayName: Highlight Weekend, FieldType: Boolean, DefaultValue: True, Description: Highlight the weekend column with specific color.
'#DesignerProperty: Key: WeekendColColor, DisplayName: Weekend Color column, FieldType: Color, DefaultValue: 0xFFCACACA, Description: Color for weekend columns.
'#DesignerProperty: Key: WeekBackColor, DisplayName: Calendar Week Background Color, DefaultValue: 0xFFDFDFDF, FieldType: Color
'#DesignerProperty: Key: WeekFontColor, DisplayName: Calendar Week Font Color, DefaultValue: 0xFF3E3E3E, FieldType: Color



Sub LabelMake(txt As String, align As Int, bkcol As Int, forcol As Int, width As Int, height As Int) As Label
	Dim lbl As Label
	Dim tpf As Typeface = Typeface.CreateNew(Typeface.DEFAULT, Typeface.STYLE_BOLD)
	lbl.Initialize("")
	lbl.Width = width
	lbl.Height = height
	lbl.SetColorAnimated(0,bkcol, bkcol)
	lbl.TextColor = forcol
	lbl.Text = txt
	lbl.Typeface = tpf
	lbl.Gravity= align
	Return lbl
End Sub

Sub AddLabel(dest As Panel, txt As String, align As Int, bkcol As Int, forcol As Int)
	Log($"AddLabel --> ${txt}, ${dest.Width}:${dest.Height}"$)
	dest.AddView(LabelMake(txt, align, bkcol, forcol, dest.Width, dest.Height), 0, 0, dest.Width, dest.Height)
End Sub

Sub AddLabelPos(dest As Panel, txt As String, align As Int, bkcol As Int, forcol As Int, left As Int, right As Int, brd As Int, brdcolor As Int)
	Log($"AddLabelPOS --> ${txt}, ${left}:${right}"$)
	Dim lbl As Label = LabelMake(txt, align, bkcol, forcol, right-left, dest.Height)
	If brd >= 1 Then
		Dim cd As ColorDrawable
		cd.Initialize2(Colors.Transparent, GeneralRadius, brd, brdcolor)
		lbl.Background = cd
	End If
	dest.AddView(lbl, left, 0, right-left, dest.Height)
End Sub

Sub AddList(dest As Panel, name As String, values As String, index As Int, align As Int, bkcol As Int, forcol As Int)
	Dim spn As Spinner
	If (name.ToLowerCase = "cmbboxmonth") Then
		MonthList.Initialize
		Months.Initialize("Months")
		spn = Months
	Else
		YearsList.Initialize
		Years.Initialize("Years")
		spn = Years
	End If
	spn.Color = bkcol
	spn.TextColor = forcol
	
	
	Dim arrVal As List = Regex.Split("\|", values)
	For i = 0 To arrVal.Size-1
		spn.Add(arrVal.Get(i))
		If (name.ToLowerCase = "cmbboxmonth") Then
			MonthList.Add(arrVal.Get(i))
		Else
			YearsList.Add(arrVal.Get(i))
		End If
	Next
	
	spn.SelectedIndex = index
	
	If align = 0 Then
		dest.AddView(spn, 0, 0, dest.Width/2, dest.Height)
	Else
		dest.AddView(spn, dest.Width/2, 0, dest.Width/2, dest.Height)
	End If
End Sub


Private Sub Years_ItemClick (Position As Int, Value As Object)
	year = Value
	DrawDays(innerMaps)
	Log("Years click")
End Sub


Private Sub Months_ItemClick (Position As Int, Value As Object)
	month = Position + 1
	DrawDays(innerMaps)
	Log("Month click")
End Sub

Sub GenerateListString(startnum As Int, endnum As Int) As String
	Dim str As String
	For i = startnum To endnum
		If (str <> "") Then str = str & "|"
		str = str & i
	Next
	Return str
End Sub

Sub GetValuePosition(lstvalues As String, value As String) As Int
	Dim arrVal As List = Regex.Split("\|", lstvalues)
	Return arrVal.IndexOf(value)
End Sub

Sub GetAsList(lstvalues As String) As List
	Dim arrVal As List = Regex.Split("\|", lstvalues)
	Return arrVal
End Sub

Sub GetCurrentMonth As Int
	DateTime.DateFormat = "MM"
	Return DateTime.Date(DateTime.Now)
End Sub

Sub GetCurrentYear As Int
	DateTime.DateFormat = "yyyy"
	Return DateTime.Date(DateTime.Now)
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub

Private Sub DrawDays(Props As Map)
	cvsBackground.DrawColor(Colors.Transparent)
	cvs.DrawColor(Colors.Transparent)
	
	'month = lmonth 'GetCurrentMonth
	'year = lyear 'GetCurrentYear
	If (month <= 0) Or (month >12) Then
		month = GetCurrentMonth
	End If
	
	If (year < 1970) Or (year >2100) Then
		year = GetCurrentYear
	End If
	
	Dim firstDayOfMonth As Long = DateUtils.SetDate(year, month, 1) - 1
	dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firstDayOfMonth) - 0) Mod 7
	daysInMonth = DateUtils.NumberOfDaysInMonth(month, year)
	Log($"daysInMonth: ${daysInMonth}, dayOfWeekOffset: ${dayOfWeekOffset}, year: ${year}, month: ${month}"$)
	If year = selectedYear And month = selectedMonth Then
		'draw the selected box
		selectedColor = Colors.LightGray
		'DrawBox(cvs, selectedColor, (selectedDay - 1 + dayOfWeekOffset) Mod 7, (selectedDay - 1 + dayOfWeekOffset) / 7)
		DrawBox(cvs, selectedColor, (selectedDay + dayOfWeekOffset) Mod 7, (selectedDay + dayOfWeekOffset) / 7)
		Log("dia actual")
	End If
	For day = 1 To daysInMonth
		Dim row As Int = (day - 1 + dayOfWeekOffset) / 7
		If (Props.Get("ShowWeekNumber")) Then
			row = (day - 1 + dayOfWeekOffset) / 8
		End If
		
		cvs.DrawText(day, (((dayOfWeekOffset + day - 1) Mod 7) + 0.5) * boxW, _
			(row + 0.5)* boxH + vCorrection, Typeface.DEFAULT_BOLD, Props.Get("CellFontSize"), Colors.Black, "CENTER")
		Log($"Row: ${row}, boxW: ${boxW}, boxH: ${boxH}, vCorrection: ${vCorrection}"$)
	Next
	month = lmonth 'GetCurrentMonth
	year = lyear 'GetCurrentYear
	CellsPanel.Invalidate
End Sub

Private Sub DrawBox(c As Canvas, clr As Int, x As Int, y As Int)
	Dim r As Rect
	r.Initialize(x * boxW, y * boxH, (x + 1) * boxW, (y + 1) * boxH)
	c.DrawRect(r, clr, True, 0)
End Sub