B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=6.01
@EndOfDesignText@
'version 1.01
#DesignerProperty: Key: LinesColor, DisplayName: Lines Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color
#DesignerProperty: Key: BackgroundColor, DisplayName: Background Color, FieldType: Color, DefaultValue: 0xFF000000, Description: Text color
#DesignerProperty: Key: GapsWidth, DisplayName: Gaps Width (dpi), FieldType: Int, DefaultValue: 10
#DesignerProperty: Key: StepValue, DisplayName: Step Value, FieldType: Int, DefaultValue: 1
#DesignerProperty: Key: MinValue, DisplayName: Min Value, FieldType: Int, DefaultValue: 0
#DesignerProperty: Key: MaxValue, DisplayName: Max Value, FieldType: Int, DefaultValue: 100
#DesignerProperty: Key: SnapToGrid, DisplayName: Snap To Grid, FieldType: Boolean, DefaultValue: True
#Event: ValueChanged (Value As Float)
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As B4XView 'ignore
	Private xui As XUI 'ignore
	Private cvs As B4XCanvas
	Private mValue As Float = 0
	Private touchXposition As Int
	Private touchXValue As Float
	Private LinesColor As Int
	Private BackgroundColor As Int
	Private GapsWidth As Int
	Private StepValue As Int
	Private RulerScale As Float
	Private fnt As B4XFont
	Private LongLineInterval As Int = 5
	Private TrianglePath As B4XPath
	Private ShortLineLength, LongLineLength As Int
	Private SnapToGrid As Boolean
	Private TextOffset As Int
	Private MinValue, MaxValue As Int
	Private mTag As Object 
	#if B4A or B4i
	Private StubPanel As Panel 'ignore
	Type MouseEvent (X As Int, Y As Int)
	#End If
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	Dim pnl1 As B4XView = xui.CreatePanel("pnl1")
	mBase.AddView(pnl1, 0, 0, 1dip, 1dip)
	cvs.Initialize(pnl1)
	LinesColor = xui.PaintOrColorToColor(Props.Get("LinesColor"))
	BackgroundColor = xui.PaintOrColorToColor(Props.Get("BackgroundColor")) 
	GapsWidth = DipToCurrent(Props.Get("GapsWidth"))
	StepValue = Props.Get("StepValue")
	MinValue = Props.GetDefault("MinValue", 0) 'using GetDefault as these are new properties.
	MaxValue = Props.GetDefault("MaxValue", 100)
	SnapToGrid = Props.Get("SnapToGrid")
	RulerScale = StepValue / GapsWidth
	Dim xlbl As B4XView = Lbl
	fnt = xlbl.Font
	TextOffset = 15dip
	If xui.IsB4i Then TextOffset = 25dip
	Base_Resize(mBase.Width, mBase.Height)
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 	mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width, Height)
	Dim w As Int = Width
	If w Mod 2 = 1 Then w = w + 1
	cvs.Resize(w, Height)
	TrianglePath.Initialize(w / 2 - 10dip, 0)
	TrianglePath.LineTo(w / 2 + 10dip, 0)
	TrianglePath.LineTo(w / 2, 20dip)
	ShortLineLength = Height / 4
	LongLineLength = Height / 2
	draw
End Sub

Private Sub draw
	'position * scale = value
	Dim CenterPosition As Int = Round(mValue / RulerScale)
	Dim MinPosition As Int = Round(MinValue / RulerScale)
	Dim MaxPosition As Int = Round(MaxValue / RulerScale)
	Dim x0position As Int = CenterPosition - cvs.TargetRect.Width / 2
	Dim FirstLinePosition As Int = Floor(x0position / GapsWidth) * GapsWidth
	If FirstLinePosition < x0position Then FirstLinePosition = FirstLinePosition + GapsWidth
	Dim FirstLineValue As Int = FirstLinePosition * RulerScale
	cvs.DrawRect(cvs.TargetRect, BackgroundColor, True, 0)
	Dim counter As Int = FirstLineValue / StepValue
	For x = FirstLinePosition To x0position + cvs.TargetRect.Width Step GapsWidth
		If x >= MinPosition And x <= MaxPosition Then
			If counter Mod LongLineInterval = 0 Then
				Dim v As Int = x * RulerScale
				cvs.DrawLine(x - x0position, 0, x - x0position, LongLineLength, LinesColor, 2dip)
				cvs.DrawText(v, x - x0position, LongLineLength + TextOffset, fnt, LinesColor, "CENTER")
			Else
				cvs.DrawLine(x - x0position, 0, x-x0position, ShortLineLength, LinesColor, 1dip)
			End If
		End If
		counter = counter + 1
	Next
	cvs.ClipPath(TrianglePath)
	cvs.DrawRect(cvs.TargetRect, LinesColor, True, 0)
	cvs.RemoveClip
	cvs.Invalidate
End Sub
#if B4A or B4i
Private Sub pnl1_Touch (Action As Int, X As Float, Y As Float)
	Private ed As MouseEvent
	ed.X = X
	ed.Y = Y
	If Action = StubPanel.ACTION_DOWN Then
		pnl1_MousePressed(ed)
	Else if Action = StubPanel.ACTION_MOVE Then
		pnl1_MouseDragged(ed)
	Else
		pnl1_MouseReleased(ed)
	End If
End Sub
#End If
Private Sub pnl1_MousePressed (EventData As MouseEvent)
	
	touchXposition = EventData.X
	touchXValue = mValue
End Sub

Private Sub pnl1_MouseDragged (EventData As MouseEvent)
	setValue(touchXValue - (EventData.X - touchXposition) * RulerScale)
	CallSubDelayed2(mCallBack, mEventName & "_valuechanged", mValue)
End Sub

Private Sub pnl1_MouseReleased (EventData As MouseEvent)
	If SnapToGrid Then
		Dim x1 As Int = Floor(mValue / StepValue) * StepValue
		Dim x2 As Int = x1 + StepValue
		If mValue - x1 < x2 - mValue Then
			setValue(x1)
		Else
			setValue(x2)
		End If
		CallSubDelayed2(mCallBack, mEventName & "_valuechanged", mValue)
		draw
	End If
End Sub

Public Sub getValue As Float
	Return mValue
End Sub

Public Sub setValue (f As Float)
	mValue = Min(MaxValue, Max(MinValue, f))
	draw
End Sub

Public Sub getMin As Float
	Return MinValue
End Sub

Public Sub setMin (f As Float)
	MinValue = f
	draw
End Sub


Public Sub getMax As Float
	Return MaxValue
End Sub

Public Sub setMax (f As Float)
	MaxValue = f
	draw
End Sub

Public Sub getTag As Object
	Return mTag
End Sub

Public Sub setTag (f As Object)
	mTag = f
End Sub
	