B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
'v1.00
Sub Class_Globals
	Public SharedFolder As String = ""
	Public UseFileProvider As Boolean = False
	Private rp As RuntimePermissions
	Public ApplicationFolder As String
End Sub

Public Sub Initialize
	ApplicationFolder = ""
End Sub

Public Sub InitializeCombine
	'CallSub(Me, "Initialize")
	Dim p As Phone
	If p.SdkVersion >= 24 Or File.ExternalWritable = False Then
		UseFileProvider = True
		SharedFolder = File.Combine(File.DirInternal, "shared")
		File.MakeDir("", SharedFolder)
	Else
		UseFileProvider = False
		SharedFolder = rp.GetSafeDirDefaultExternal("shared")
	End If
	Log($"Using FileProvider? ${UseFileProvider}"$)
	ApplicationFolder = SharedFolder
End Sub

Public Sub InitializeSafeDir
	'CallSub(Me, "Initialize")
	UseFileProvider = False
	SharedFolder = rp.GetSafeDirDefaultExternal("shared")
	Log($"Using FileProvider? ${UseFileProvider}, ShareFolder: ${SharedFolder}"$)
	ApplicationFolder = SharedFolder
End Sub

'Returns the file uri.
Public Sub GetFileUri (FileName As String) As Object
	
	If UseFileProvider = False Then
		Dim uri As JavaObject
		Return uri.InitializeStatic("android.net.Uri").RunMethod("parse", Array("file://" & File.Combine(SharedFolder, FileName)))
	Else
		Dim f As JavaObject
		f.InitializeNewInstance("java.io.File", Array(SharedFolder, FileName))
		Dim fp As JavaObject
		Dim context As JavaObject
		context.InitializeContext
		fp.InitializeStatic("android.support.v4.content.FileProvider")
		Return fp.RunMethod("getUriForFile", Array(context, Application.PackageName & ".provider", f))
	End If
End Sub


Public Sub GetApkFileUri () As Object
	Dim FLAG_ACTIVITY_CLEAR_TOP As Int = 0x04000000
	Dim FLAG_ACTIVITY_CLEAR_TASK As Int = 0x00008000
	Dim FLAG_ACTIVITY_NEW_TASK As Int = 0x10000000
	
	Dim iIntent As Intent
	Dim uri As JavaObject
	Dim uriString As String = uri.InitializeStatic("android.net.Uri").RunMethod("parse", Array("content://" & File.Combine(File.DirRootExternal & "/Download/","vrcg_demo.apk" )))
	iIntent.Initialize("android.intent.action.INSTALL_PACKAGE", uriString)
'		iIntent.Initialize(iIntent.ACTION_VIEW, File.Combine("file://"&File.DirRootExternal, "/Download/vrcg_demo.apk"))
	iIntent.SetType("application/vnd.android.package-archive")
	iIntent.Flags = FLAG_ACTIVITY_CLEAR_TASK
		
	'iIntent.GetData
	'iIntent.SetComponent("")
	StartActivity(iIntent)
End Sub


'Replaces the intent Data field with the file uri.
'Resets the type field. Make sure to call Intent.SetType after calling this method
Public Sub SetFileUriAsIntentData (Intent As Intent, FileName As String)
	Dim jo As JavaObject = Intent
	jo.RunMethod("setData", Array(GetFileUri(FileName)))
	Intent.Flags = Bit.Or(Intent.Flags, 1) 'FLAG_GRANT_READ_URI_PERMISSION
End Sub


