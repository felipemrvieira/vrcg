B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
' B4XStateButton class 
'******************************************************************************************************************************************
' Author: Pedro Alpedrinha
' Date: 2018-11-12
' Version: 1
' Desc: This component encapsulates a button type view and extend its functionality to control:
'		- Button State
'			- 2 States (Boolean like) - ex: ON/OFF, YES/NO, ACCEPT/NOT ACCEPTED
'			- 3 States - YES/NO/MAY BE, CONFIRMED/NOT CONFIRMED/NOT APPLIED
'		- Grouping buttons (BooleanState must be TRUE)
'			- 0 Value - Acts individually
'			- N Value - Belong to the Group N
'				- When pressed, all buttons on the same level and that belongs to the same group will have it's state set to 0 (Zero)
'
' Notes: 
'	ANDROID (IOS ... NOT TESTED!!!, BUT SHOULD BE THE SAME ...)
'		Some properties were added to control visual effects and aspect (State colors, border and radius).
'		XUI - https://www.b4x.com/android/forum/threads/b4x-xui-cross-platform-native-ui-library.84359/#content
'	B4J
'		CSS is used to control visual effects and aspect. Please include B4XStateButton.css in the appl. You can change it as your will. Each state refers to a CSS class
' 		For B4J you may need to install Java v8u40+
'			A link to get it : https://sourceforge.net/projects/javaclientmsiinstallers/files/v8u40/
'
'******************************************************************************************************************************************
#Event: StateClick (State As Int)
#DesignerProperty: Key: Reference, DisplayName: Reference, FieldType: String, DefaultValue: , Description: Reference - Can be anything. Ex: Internal code
#DesignerProperty: Key: Conformity, DisplayName: Conformity, FieldType: Int, DefaultValue: 0, Description: Conformity Can be : 0/1/2/3 - NN/C/NC/NA
#DesignerProperty: Key: BooleanState, DisplayName: Boolean State, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: State, DisplayName: State, FieldType: Int, DefaultValue: 0, Description: Identify the Button State (0/1 == False/True or 0/1/2)
#if B4J
#DesignerProperty: Key: FirstState, DisplayName: First State CSS, FieldType: String, DefaultValue: B4XSB_First, Description: First State CSS
#DesignerProperty: Key: SecondState, DisplayName: Second State CSS, FieldType: String, DefaultValue: B4XSB_Second, Description: Second State CSS
#DesignerProperty: Key: ThirdState, DisplayName: Third State CSS, FieldType: String, DefaultValue: B4XSB_Third, Description: Third State CSS
#Else
#DesignerProperty: Key: TextStateColor, DisplayName: Text State Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color on State change > 0
#DesignerProperty: Key: FirstStateColor, DisplayName: First State Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: First State Color
#DesignerProperty: Key: SecondStateColor, DisplayName: Second State Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Second State Color
#DesignerProperty: Key: ThirdStateColor, DisplayName: Third State Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Third State Color
#DesignerProperty: Key: ShowBorder, DisplayName: Show Border, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: BorderSize, DisplayName: Border Size, FieldType: Int, DefaultValue: 0, Description: 
#DesignerProperty: Key: BorderColor, DisplayName: Border Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: 
#DesignerProperty: Key: RadiusSize, DisplayName: Radius Size, FieldType: Int, DefaultValue: 0, Description: 
#DesignerProperty: Key: UseDIP, DisplayName: Use DIP size, FieldType: Boolean, DefaultValue: True, Description: Use DIP size - If TRUE will multiply all sizes by 1dip
#End If
#DesignerProperty: Key: ButtonGroup, DisplayName: Button Group, FieldType: Int, DefaultValue: 0, Description: Button Group - If different from ZERO (BooleanState=TRUE) will affect all butoons in the same group (and same parent) by changing their states to zero before changing the state of this button. 
'#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color

Sub Class_Globals
	Type SBG(State As Int, Group As Int, Reference As String, mainTag As String)
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As B4XView 'ignore
	Private mBaseLabel As Label 'ignore
	Private mParent As B4XView 'ignore
	Private xui As XUI 'ignore
	Private mButton As Button
	Private mState As Int
	
	Private mReference As String
	Private mConformity As Int = 0
	
	Private mBooleanState As Boolean
#if B4J	
	Private mFirstState As String
	Private mSecondState As String
	Private mThirdState As String
	Private fx As JFX
#else
	Private mDefaultColor As Int
	Private mTextStateColor As Int
	Private mFirstStateColor As Int
	Private mSecondStateColor As Int
	Private mThirdStateColor As Int
	Private mBorderColor As Int
	Private mBorderSize As Int
	Private mShowBorder As Boolean
	Private mRadiusSize As Int
	Private mUseDIP As Boolean
#end if
	Private mButtonGroup As Int
	Private mTag As Object
	Private mEnabled As Boolean = True
	Private mAllowClick As Boolean = True
	Private LastButton As Button
	
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mAllowClick = True
	mBase = Base
	mBase.Color = xui.Color_ARGB(0,255,255,255)
	mButton.Initialize("ThisButtonClick")
	mBase.AddView(mButton, 0, 0, mBase.Width, mBase.Height)
	getDesignProperties(Props)
	
	mButton.Text = Lbl.Text
	mButton.TextColor = Lbl.TextColor
	mButton.TextSize = Lbl.TextSize
	mParent = mBase.Parent
	mEnabled = True
	mBaseLabel = Lbl
	mDefaultColor = mBaseLabel.TextColor
	mBase.Tag = Me

#if B4J
	Dim thisStyle As String
	If mState = 0 Then
		thisStyle = mFirstState
	else if mState = 1 Then
		thisStyle = mSecondState
	else if mState = 2 Then
		thisStyle = mThirdState
	End If
	mButton.Font = Lbl.Font
'	mButton.StyleClasses.Clear
'	mButton.StyleClasses.Add(thisStyle)
	mButton.Alpha = 50
	'mButton.Style = thisStyle
#else
	Dim thisColor As Int
	If mState = 0 Then
		thisColor = mFirstStateColor
	else if mState = 1 Then
		thisColor = mSecondStateColor
	else if mState = 2 Then
		thisColor = mThirdStateColor
	End If
	mButton.Typeface = Lbl.Typeface
	Dim thisRadius As Int = mRadiusSize
	Dim thisBorderColor As Int = mBorderColor
	Dim thisBorder As Int = 0
	If mShowBorder Then thisBorder = mBorderSize
	Dim cd As ColorDrawable
	cd.initialize2(thisColor, thisRadius, thisBorder, thisBorderColor)
	mButton.background = cd
#end if
	mButton.tag = CreateSBG(mState, mButtonGroup, mReference, mTag)
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Sub CreateSBG(State As Int, Group As Int, Reference As String, mainTag As String) As SBG
	Dim thisSBG As SBG
	thisSBG.Initialize
	thisSBG.State = State
	thisSBG.Group = Group
	thisSBG.Reference = Reference
	thisSBG.MainTag = mainTag
	Return thisSBG
End Sub

Sub getDesignProperties(Props As Map)
	mConformity = Props.Get("Conformity")
	mReference = Props.Get("Reference")
	mBooleanState = Props.Get("BooleanState")
	mState = Props.Get("State")
#if B4J
	mFirstState = Props.Get("FirstState")
	mSecondState = Props.Get("SecondState")
	mThirdState = Props.Get("ThirdState")
#else
	'mDefaultColor
	mTextStateColor = xui.PaintOrColorToColor(Props.Get("TextStateColor"))
	mFirstStateColor = xui.PaintOrColorToColor(Props.Get("FirstStateColor"))
	mSecondStateColor = xui.PaintOrColorToColor(Props.Get("SecondStateColor"))
	mThirdStateColor = xui.PaintOrColorToColor(Props.Get("ThirdStateColor"))
	mBorderColor = xui.PaintOrColorToColor(Props.Get("BorderColor"))
	mShowBorder = Props.Get("ShowBorder")
	mBorderSize = Props.Get("BorderSize")
	mRadiusSize = Props.Get("RadiusSize")
	mUseDIP = Props.Get("UseDIP")
	If (mUseDIP) Then
		mBorderSize = mBorderSize * 1dip
		mRadiusSize = mRadiusSize * 1dip
	End If
#end if
	mButtonGroup = Props.Get("ButtonGroup")
End Sub

Private Sub ThisButtonClick_Click
	If (mAllowClick) Then
		Dim bs As SBG = mButton.Tag
		mState = bs.State
		If mState = 0 Then
			If mBooleanState Then
				setState(1)
			Else
				setState(NextSate)
			End If
		Else
			If mBooleanState Then
				setState(0)
			Else
				setState(NextSate)
			End If
		End If
	End If
	CallSub2(mCallBack, mEventName & "_StateClick", getState)
End Sub

Sub MakeClick
	If (mAllowClick) Then
		Dim bs As SBG = mButton.Tag
		mState = bs.State
		If mState = 0 Then
			If mBooleanState Then
				setState(1)
			Else
				setState(NextSate)
			End If
		Else
			If mBooleanState Then
				setState(0)
			Else
				setState(NextSate)
			End If
		End If
	End If
	CallSub2(mCallBack, mEventName & "_StateClick", getState)
End Sub

Sub updateButtonState(thisState As Int)
	changeGroupStates
	updateButtonStateFirst(thisState)
'#if B4J
'	Dim thisStyle As String
'	If mState = 0 Then
'		thisStyle = mFirstState
'	else if mState = 1 Then
'		thisStyle = mSecondState
'	else if mState = 2 Then
'		thisStyle = mThirdState
'	End If
'	mButton.StyleClasses.Clear
'	mButton.StyleClasses.Add(thisStyle)
'	'mButton.Style = thisStyle
'#else
'	mDefaultColor = mBaseLabel.TextColor
'	Dim textColor As Int
'	Dim thisColor As Int
'	If thisState = 0 Then
'		thisColor = mFirstStateColor
'		textColor = mDefaultColor
'	else if thisState = 1 Then
'		textColor = mTextStateColor
'		thisColor = mSecondStateColor
'	else if thisState = 2 Then
'		textColor = mTextStateColor
'		thisColor = mThirdStateColor
'	Else
'		textColor = mDefaultColor
'	End If
'	Dim thisRadius As Int = mRadiusSize
'	Dim thisBorderColor As Int = mBorderColor
'	Dim thisBorder As Int = 0
'	If mShowBorder Then thisBorder = mBorderSize
'	Dim cd As ColorDrawable
'	cd.initialize2(thisColor, thisRadius, thisBorder, thisBorderColor)
'	mButton.background = cd
'	mButton.TextColor = textColor
'#end if
'	mButton.tag = CreateSBG(mState, mButtonGroup, mReference, mTag)
End Sub

Sub updateButtonStateFirst(thisState As Int)
#if B4J
	Dim thisStyle As String
	If mState = 0 Then
		thisStyle = mFirstState
	else if mState = 1 Then
		thisStyle = mSecondState
	else if mState = 2 Then
		thisStyle = mThirdState
	End If
	mButton.StyleClasses.Clear
	mButton.StyleClasses.Add(thisStyle)
	'mButton.Style = thisStyle
#else
	mDefaultColor = mBaseLabel.TextColor
	Dim textColor As Int
	Dim thisColor As Int
	If thisState = 0 Then
		thisColor = mFirstStateColor
		textColor = mDefaultColor
	else if thisState = 1 Then
		textColor = mTextStateColor
		thisColor = mSecondStateColor
	else if thisState = 2 Then
		textColor = mTextStateColor
		thisColor = mThirdStateColor
	Else
		textColor = mDefaultColor
	End If
	Dim thisRadius As Int = mRadiusSize
	Dim thisBorderColor As Int = mBorderColor
	Dim thisBorder As Int = 0
	If mShowBorder Then thisBorder = mBorderSize
	Dim cd As ColorDrawable
	cd.initialize2(thisColor, thisRadius, thisBorder, thisBorderColor)
	mButton.background = cd
	mButton.TextColor = textColor
#end if
	mButton.tag = CreateSBG(mState, mButtonGroup, mReference, mTag)
End Sub

Sub changeGroupStates
	If mButtonGroup > 0 Then
		Dim par As B4XView = mButton.Parent
		Dim par2 As B4XView = par.Parent
		For Each pan As B4XView In par2.GetAllViewsRecursive
'			Log($"Tyepe of: ${GetType(pan)}"$)
			If (pan Is Button) And (pan.Text <> mButton.Text) Then
				Dim st As Object = pan.Tag
				If (st Is SBG) Then 
					
					Dim bgrp As SBG = pan.Tag
					Dim bm2 As SBG = mButton.Tag
					If (bgrp.Group = bm2.Group) Then
						
						If (bgrp.State=1) Then
							LastButton = pan
						End If
						
						ResetButtonGroup( pan )
					End If
				End If 
			End If
		Next
	End If
End Sub

Sub SetColorManual(color2Set As Int)
	mButton.Color = color2Set
End Sub

Sub SetConformityManual(val2set As Int)
	mConformity = val2set
End Sub


Sub RevertToLastButton
	' CONFIRMA QUE O LASTBUTTON FOI INICIALIZADO
	If LastButton.IsInitialized Then
		' VERIFICA SE O LASTBUTTON É O PRÓPRIO BOTÃO OU NÃO
		' SE SIM BASTA IGUALAR
		If (mButton.Text = LastButton.Text) And (GetSBG(mButton.tag, 2) = GetSBG(LastButton.Tag, 2)) _
				And (GetSBG(mButton.tag, 3) = GetSBG(LastButton.Tag, 3)) Then
				mButton = LastButton
		Else
			'NÃO É O BOTÃO ENTÃO TEM DE IR À PESCA
			
			If mButtonGroup > 0 Then
				Dim par As B4XView = mButton.Parent
				Dim par2 As B4XView = par.Parent
				For Each pan As B4XView In par2.GetAllViewsRecursive
					If (pan Is Button) And (pan.Text = LastButton.Text) _
						And (GetSBG(pan.tag, 2) = GetSBG(LastButton.Tag, 2)) _
						And (GetSBG(pan.tag, 3) = GetSBG(LastButton.Tag, 3)) Then
						pan = LastButton
						Exit
					End If
				Next
				ResetButtonGroup( mButton )
			End If
		End If
	End If
End Sub

Sub GetSBG(thisSBG As SBG, field As Int) As String
	If (thisSBG.IsInitialized) Then
		If (field = 1) Then
			Return thisSBG.State
		else if (field = 2) Then
			Return thisSBG.Group
		else if (field = 3) Then
			Return thisSBG.Reference
		Else
			Return thisSBG.MainTag
		End If
	Else
		Return ""
	End If
End Sub

Public Sub ResetButtonGroup (BBut_ As Button)
	Dim bgrp As SBG = BBut_.Tag
	bgrp.State = 0 
#if B4j
	BBut_.Style = mFirstState
#else
	mDefaultColor = mBaseLabel.TextColor
	Dim thisRadius As Int = mRadiusSize
	Dim thisBorderColor As Int = mBorderColor
	Dim thisBorder As Int = 0
	If mShowBorder Then thisBorder = mBorderSize
	Dim cd As ColorDrawable
	cd.initialize2(mFirstStateColor, thisRadius, thisBorder, thisBorderColor)
	BBut_.background = cd
	BBut_.TextColor = mDefaultColor
#end if
	BBut_.tag = bgrp
End Sub


#if B4J
Public Sub CreateButton(Base As Object, sTitle As String, sReference As String, iState As Int, bBooleanState As Boolean, _
			sFirstState As String, sSecondState As String, sThirdState As String, _
			iButtonGroup As Int)
#else
Public Sub CreateButton(Base As Object, sTitle As String, sReference As String, iState As Int, bBooleanState As Boolean, _
			iFirstStateColor As Int,iSecondStateColor As Int,iThirdStateColor As Int, _
			iBorderColor As Int,iBorderSize As Int, bShowBorder As Boolean, iRadiusSize As Int, bUseDIP As Boolean, _
			iButtonGroup As Int)
#End If
	mBase = Base
	mBase.Color = xui.Color_ARGB(0,255,255,255)
	mButton.Initialize("ThisButtonClick")
	mBase.AddView(mButton, 0, 0, mBase.Width, mBase.Height)
	mBooleanState = bBooleanState
	mState = iState
	mReference = sReference
	mButtonGroup = iButtonGroup
#if B4J
	mFirstState = sFirstState
	mSecondState = sSecondState
	mThirdState = sThirdState
	Dim thisStyle As String
	If mState = 0 Then
		thisStyle = mFirstState
	else if mState = 1 Then
		thisStyle = mSecondState
	else if mState = 2 Then
		thisStyle = mThirdState
	End If
	mButton.StyleClasses.Clear
	mButton.StyleClasses.Add(thisStyle)
	'mButton.Style = thisStyle
#else
	'mFirstStateColor = xui.PaintOrColorToColor(iFirstStateColor)
	mFirstStateColor = xui.PaintOrColorToColor(iFirstStateColor)
	mSecondStateColor = xui.PaintOrColorToColor(iSecondStateColor)
	mThirdStateColor = xui.PaintOrColorToColor(iThirdStateColor)
	mBorderColor = xui.PaintOrColorToColor(iBorderColor)
	mShowBorder = bShowBorder
	mBorderSize = iBorderSize
	mRadiusSize = iRadiusSize
	mUseDIP = bUseDIP
	If (mUseDIP) Then
		mBorderSize = mBorderSize * 1dip
		mRadiusSize = mRadiusSize * 1dip
	End If
	
	Dim thisColor As Int
	If mState = 0 Then
		thisColor = mFirstStateColor
	else if mState = 1 Then
		thisColor = mSecondStateColor
	else if mState = 2 Then
		thisColor = mThirdStateColor
	End If
	Dim thisRadius As Int = mRadiusSize
	Dim thisBorderColor As Int = mBorderColor
	Dim thisBorder As Int = 0
	If mShowBorder Then thisBorder = mBorderSize
	Dim cd As ColorDrawable
	cd.initialize2(thisColor, thisRadius, thisBorder, thisBorderColor)
	mButton.background = cd
#end if
	mButton.Text = sTitle
	mButton.tag = CreateSBG(mState, mButtonGroup, mReference, mTag)
End Sub

Public Sub getParent As B4XView
	Return mParent
End Sub

'Public Sub setParent(theObj As B4XView)
'	mParent = theObj
'End Sub

Public Sub getAllowClick As Boolean
	Return mAllowClick
End Sub

Public Sub setAllowClick(theObj As Boolean)
	mAllowClick = theObj
End Sub

Public Sub getEnabled As Boolean
	Return mEnabled
End Sub

Public Sub setEnabled(theObj As Boolean)
	mEnabled = theObj
	mButton.Enabled = mEnabled
End Sub

Public Sub getTag As Object
	Return mTag
End Sub

Public Sub setTag(theObj As Object)
	mTag = theObj
	mButton.tag = CreateSBG(mState, mButtonGroup, mReference, mTag)
End Sub

Public Sub getReference As String
	Dim bs As SBG = mButton.Tag
	If (bs.Reference = Null) Or (bs.Reference.ToLowerCase = "null")  Or (bs.Reference.Trim = "") Then
		bs.Reference = "0"
	End If
	Return bs.Reference
End Sub

Public Sub setReference(theText As String)
	Dim bs As SBG = mButton.Tag
	bs.Reference = theText
	mButton.Tag = bs
End Sub

Public Sub getButtonGroup As Int
	Dim bs As SBG = mButton.Tag
	Return bs.Group
End Sub

Public Sub setButtonGroup(group As Int)
	Dim bs As SBG = mButton.Tag
	bs.Group = group
	mButtonGroup = group
	mButton.Tag = bs
End Sub

Public Sub getConformity As Int
	Return mConformity
End Sub

Public Sub setConformity(val As Int)
	mConformity = val
End Sub

Public Sub getText As String
	Return mButton.Text
End Sub

Public Sub setText(theText As String)
	mButton.Text = theText
End Sub

Public Sub NextSate As Int
	Dim rNext As Int = mState +1
	If rNext >= 3 Then rNext = 0
	Return rNext
End Sub

Public Sub getState As Int
	Dim bs As SBG = mButton.Tag
	Return bs.State
End Sub

Public Sub setState(thisState As Int)
	mState = thisState
	updateButtonState(mState)
End Sub

Public Sub setFirstState(thisState As Int)
	mState = thisState
	updateButtonStateFirst(mState)
End Sub

#if b4j
public Sub getTextColor As Int
	Return fx.Colors.To32Bit(mButton.TextColor)
End Sub

public Sub setTextColor(parm As Int)
	mButton.TextColor = fx.Colors.From32Bit(xui.PaintOrColorToColor(parm))
End Sub
#Else
public Sub getTextColor As Int
	Return mButton.TextColor
End Sub

public Sub setTextColor(parm As Int)
	mButton.TextColor = parm
End Sub
#end if 

public Sub getTextSize As Int
	Return mButton.TextSize
End Sub

public Sub setTextSize(parm As Int)
	mButton.TextSize = parm
End Sub

#If B4J
public Sub getTypeface As Font
	Return mButton.Font
End Sub

public Sub setTypeface(parm As Font)
	mButton.Font = parm
End Sub
#else

public Sub getTypeface As Typeface
	Return mButton.Typeface
End Sub

public Sub setTypeface(parm As Typeface)
	mButton.Typeface = parm
End Sub

#End If


public Sub UpdateControl
#if B4J
	Dim thisStyle As String
	If mState = 0 Then
		thisStyle = mFirstState
	else if mState = 1 Then
		thisStyle = mSecondState
	else if mState = 2 Then
		thisStyle = mThirdState
	End If
	mButton.StyleClasses.Clear
	mButton.StyleClasses.Add(thisStyle)
#else
	If (mUseDIP) Then
		mBorderSize = mBorderSize * 1dip
		mRadiusSize = mRadiusSize * 1dip
	End If

	mDefaultColor = mBaseLabel.TextColor
	Dim textColor As Int
	Dim thisColor As Int
	If mState = 0 Then
		thisColor = mFirstStateColor
		textColor = mDefaultColor
	else if mState = 1 Then
		thisColor = mSecondStateColor
		thisColor = mSecondStateColor
	else if mState = 2 Then
		thisColor = mThirdStateColor
		thisColor = mThirdStateColor
	Else
		textColor = mDefaultColor
	End If
	Dim thisRadius As Int = mRadiusSize
	Dim thisBorderColor As Int = mBorderColor
	Dim thisBorder As Int = 0
	If mShowBorder Then thisBorder = mBorderSize
	Dim cd As ColorDrawable
	cd.initialize2(thisColor, thisRadius, thisBorder, thisBorderColor)
	mButton.background = cd
	mButton.TextColor = textColor
	
#end if
End Sub

#if b4j
public Sub getFirstStateStyle As String
	Return mFirstState
End Sub

public Sub setFirstStateStyle(parm As String)
	mFirstState = parm
End Sub
#Else
public Sub getFirstStateColor As Int
	Return mFirstStateColor
End Sub

public Sub setFirstStateColor(parm As Int)
	mFirstStateColor = xui.PaintOrColorToColor(parm)
End Sub
#end if 

#if b4j
public Sub getSecondStateStyle As String
	Return mSecondState
End Sub

public Sub setSecondStateStyle(parm As String)
	mSecondState = parm
End Sub
#Else
public Sub getSecondStateColor As Int
	Return mSecondStateColor
End Sub

public Sub setSecondStateColor(parm As Int)
	mSecondStateColor = xui.PaintOrColorToColor(parm)
End Sub
#end if 

#if b4j
public Sub getThirdStateStyle As String
	Return mThirdState
End Sub

public Sub setThirdStateStyle(parm As String)
	mThirdState = parm
End Sub
#Else
public Sub getThirdStateColor As Int
	Return mThirdStateColor
End Sub

public Sub setThirdStateColor(parm As Int)
	mThirdStateColor = xui.PaintOrColorToColor(parm)
End Sub
#end if 