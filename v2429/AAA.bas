B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private A__CLA_Request As FloatLabeledEditText
	Private A__CLA_Confirm As B4XStateButton
	Private A__CLA_Task As FloatLabeledEditText
	Private A__CLA_Item As FloatLabeledEditText
	Private A__CLA_UniqueKey As FloatLabeledEditText
	Private A__CLA_Tagcode As FloatLabeledEditText
	Private A__CLA_Value As FloatLabeledEditText
	Private A__CLA_Obs As FloatLabeledEditText
	Private A__CLA_Action As FloatLabeledEditText
	Private A__CLA_Image As ImageView
	Private A__CLA_GetRequest As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("__TESTE_CLA_SERVER")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub A__CLA_GetRequest_Click
	
End Sub

Sub ACLAImage_Click
	
End Sub

Sub ACLAConfirm_StateClick (State As Int)
	
End Sub