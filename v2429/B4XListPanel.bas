B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.9
@EndOfDesignText@
' B4XListPanel class 
'******************************************************************************************************************************************
' Author: Pedro Alpedrinha
' Date: 2020-07-13
' Version: 1
'
'******************************************************************************************************************************************
#Event: OnExpand (State As Int, ID as int)
#Event: OnCollapse (State As Int, ID as int)
#Event: OnHide (State As Int, ID as int)
#Event: OnVisible (State As Int, ID as int)
#Event: OnReadOnly (State As Int, ID as int)
#DesignerProperty: Key: Reference, DisplayName: Reference, FieldType: String, DefaultValue: , Description: Reference - Can be anything. Ex: Internal code
#DesignerProperty: Key: Tagcode1, DisplayName: Tagcode1, FieldType: String, DefaultValue: , Description: 
#DesignerProperty: Key: Tagcode2, DisplayName: Tagcode2, FieldType: String, DefaultValue: , Description: 
#DesignerProperty: Key: Tagcode3, DisplayName: Tagcode3, FieldType: String, DefaultValue: , Description: 
#DesignerProperty: Key: Tagcode4, DisplayName: Tagcode4, FieldType: String, DefaultValue: , Description: 
#DesignerProperty: Key: Tagcode5, DisplayName: Tagcode5, FieldType: String, DefaultValue: , Description: 
#DesignerProperty: Key: Tagcode6, DisplayName: Tagcode6, FieldType: String, DefaultValue: , Description: 
#DesignerProperty: Key: Tagcode7, DisplayName: Tagcode7, FieldType: String, DefaultValue: , Description: 
#DesignerProperty: Key: Value, DisplayName: Value, FieldType: String, DefaultValue: , Description: 
#DesignerProperty: Key: AllowClick, DisplayName: AllowClick, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: AllowHide, DisplayName: AllowHide, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: AllowExpand, DisplayName: AllowExpand, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: IsGroup, DisplayName: IsGroup, FieldType: Boolean, DefaultValue: False
#DesignerProperty: Key: IsSubGroup, DisplayName: IsSubGroup, FieldType: Boolean, DefaultValue: False
#DesignerProperty: Key: IsActive, DisplayName: IsActive, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: IsVisible, DisplayName: IsVisible, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: IsExpanded, DisplayName: IsExpanded, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: IsReadOnly, DisplayName: IsReadOnly, FieldType: Boolean, DefaultValue: False
#DesignerProperty: Key: IsRepeated, DisplayName: IsRepeated, FieldType: Boolean, DefaultValue: False

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private xui As XUI 'ignore
	Public mBase As B4XView
	Public Tag As Object
	
	Private mLeft, mTop, mWidth, mHeight, mRadius As Double
	
	
	Public IsGroup As Boolean = True
	Public IsSubGroup As Boolean = True
	Public IsActive As Boolean = True
	Public IsVisible As Boolean = True
	Public IsExpanded As Boolean = True
	Public IsReadOnly As Boolean = False
	Public IsRepeated As Boolean = False
	Private mID As Int = 0
	Private mGroup As Int = 0
	Private mSubGroup As Int = 0
	Private mLevel As Int = 0
	Private mPosition As Int = 0
	Private mRepeatCount As Int = 0
	Private mRepeatItemCount As Int = 0
	Private mRepeatFieldCount As Int = 0
	Private mBulletMaster As Int = 0
	Private mBulletChild As Int = 0
	Private mBulletInner As Int = 0
	Private mBulletLevel As Int = 0
	Private mCodeId As Int = 0
	Public Reference As String = ""
	Public Tagcode1 As String = ""
	Public Tagcode2 As String = ""
	Public Tagcode3 As String = ""
	Public Tagcode4 As String = ""
	Public Tagcode5 As String = ""
	Public Tagcode6 As String = ""
	Public Tagcode7 As String = ""
	Public Value As String = ""
	Private mLastValue As String = ""
	Public AllowClick As Boolean = True
	Public AllowHide As Boolean = True
	
	Public Other As Object
	Private mState As Int = 0
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	Tag = mBase.Tag
	mBase.Tag = Me
	getDesignProperties(Props)
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Sub getDesignProperties(Props As Map)
	IsGroup = Props.Get("IsGroup")
	IsSubGroup = Props.Get("IsSubGroup")
	IsActive = Props.Get("IsActive")
	IsVisible = Props.Get("IsVisible")
	IsExpanded = Props.Get("IsExpanded")
	IsReadOnly = Props.Get("IsReadOnly")
	IsRepeated = Props.Get("IsRepeated")
	Reference = Props.Get("Reference")
	Tagcode1 = Props.Get("Tagcode1")
	Tagcode2 = Props.Get("Tagcode2")
	Tagcode3 = Props.Get("Tagcode3")
	Tagcode4 = Props.Get("Tagcode4")
	Tagcode5 = Props.Get("Tagcode5")
	Tagcode6 = Props.Get("Tagcode6")
	Tagcode7 = Props.Get("Tagcode7")
	Value = Props.Get("Value")
	AllowClick = Props.Get("AllowClick")
	AllowHide = Props.Get("AllowHide")
End Sub

Public Sub getParent As B4XView
	Return mBase.Parent
End Sub

Public Sub getState As Int
	Return mState
End Sub

Public Sub setState(thisState As Int)
	mState = thisState
End Sub

Public Sub setVisibleState(thisState As Boolean)
	IsVisible = thisState
	If IsVisible Then
		If SubExists(mCallBack, mEventName & "_OnVisible") Then
			CallSub3(mCallBack, mEventName & "_OnVisible", mState, mID)
		End If
	Else
		If SubExists(mCallBack, mEventName & "_OnHide") Then
			CallSub3(mCallBack, mEventName & "_OnHide", mState, mID)
		End If
	End If
End Sub

Public Sub setReadOnlyState(thisState As Boolean)
	IsReadOnly = thisState
	If SubExists(mCallBack, mEventName & "_OnReadOnly") Then
		CallSub3(mCallBack, mEventName & "_OnReadOnly", mState, mID)
	End If
End Sub

Public Sub setExpandState(thisState As Boolean)
	IsExpanded = thisState
	If IsExpanded Then
		If SubExists(mCallBack, mEventName & "_OnExpand") Then
			CallSub3(mCallBack, mEventName & "_OnExpand", mState, mID)
		End If
	Else
		If SubExists(mCallBack, mEventName & "_OnCollapse") Then
			CallSub3(mCallBack, mEventName & "_OnCollapse", mState, mID)
		End If
	End If
End Sub
