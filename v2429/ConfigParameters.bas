B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
'**************************************************
'Name: ConfigParameters
'Date: 2018-11-02 21:53
'Author: Pedro Alpedrinha
'Desc: Configuration variables 
'**************************************************

Sub Class_Globals
	Public CFG_ALLOW_FRONT_CAMERA As Int = 0
	Public CFG_COPY_IMAGE_TO_GALLERY As Int = 1
	Public CFG_TAKE_PICTURE_ALWAYS_AS_NEW As Int = 1 'If 0 the will replace last one
	
	Private ConfigFileName As String = "config.json"
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	MakeInitialize
End Sub

Public Sub Initialize2(ConfigFile As String)
	ConfigFileName = ConfigFile
	MakeInitialize
End Sub

Sub MakeInitialize
	If File.Exists(File.DirInternal, ConfigFileName) Then
	End If
	'Check if Config.json file exists
	'If exists:
	'Load Config.json file
	'Set values from config.json to Globals
	'If NOT exists:
	'Does nothing
End Sub