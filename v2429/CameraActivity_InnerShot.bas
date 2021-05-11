B4A=true
Group=Main Forms
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
'CameraActivity_InnerShot
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region


Sub Process_Globals
	Private xui As XUI
	Public StayOnCamera As Boolean = True
	Public ShotFileLocation As String = File.DirInternal
	Public ShotFileName As String = ""
	Private frontCamera As Boolean = False
	Private Counter As Int = 1
	Private LastFileName As String = ""
	Private CamShots As List
	Private ReturnTo As Object
	Public Device As Phone
End Sub

Sub Globals
	Private camPanelInner As Panel
	Private camExInner As CameraExClass
	Private butCloseCamera As Button
	Private showPicturePanel As Panel
	Private showPictureImage As ImageView
	Private ShowPictureClose As Button
	Private CurrentCLAItem As RequestCLAItem
	Private ExitToDialog As Boolean = False
	Private CurrentFileName As String = ""
	Private IntCounter As Int = 0
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	Activity.LoadLayout("camerawindow_inner_shot")
	CamShots.Initialize
	Dim dir As String = Starter.InternalFolder  '.SafeDefaultExternal
	ShotFileLocation = dir
End Sub

Public Sub StartCameraInner(ICounter As Int)
	ReturnTo = "ImageEdit"
	IntCounter = ICounter
	InitializeCamera
End Sub

Public Sub StartCameraInner2(ReturnToActivity As Object, CLAItem As RequestCLAItem)
	ReturnTo = ReturnToActivity
	CurrentCLAItem = CLAItem
	ExitToDialog = True
	InitializeCamera
End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		CloseActivity
	End If
	Return True
End Sub

Private Sub InitializeCamera
	camExInner.Initialize(camPanelInner, frontCamera, Me, "camPanelInner")
	frontCamera = camExInner.Front
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	If camExInner.IsInitialized Then
		camExInner.Release
	End If
End Sub

Sub camPanelInner_Ready (Success As Boolean)
	If Success Then
		camExInner.SetJpegQuality(ShareCode.DEVICE_DEF_QUALITY)
		
		'SetMinimumSize
		camExInner.SetPictureSize(ShareCode.DEVICE_DEF_IMG_WIDTH,ShareCode.DEVICE_DEF_IMG_HEIGHT)
		camExInner.SetContinuousAutoFocus
		camExInner.CommitParameters
		camExInner.StartPreview
	Else
		ToastMessageShow("Não é possível abrir a camera.", True)
	End If
End Sub


Private Sub SetMinimumSize
	Dim minCS As CameraSize
	For Each cs As CameraSize In camExInner.GetSupportedPicturesSizes
		If minCS.Width = 0 Then
			minCS = cs
		Else
			If Power(minCS.Width, 2) + Power(minCS.Height, 2) > Power(cs.Width, 2) + Power(cs.Height, 2) Then
				minCS = cs
			End If
		End If
	Next
	camExInner.SetPictureSize(minCS.Width, minCS.Height)
End Sub

Sub btnTakePicture_Click
	camExInner.TakePicture
End Sub

Sub btnFocus_Click
	camExInner.FocusAndTakePicture
End Sub

Sub getCamsize(Width As Int, Height As Int) As CameraSize
	Dim ret As CameraSize
	ret.initialize
	ret.Width = Width
	ret.Height = Height
	Return ret
End Sub

Private Sub CreateCanvas(width As Int, height As Int) As B4XCanvas
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, width, height)
	Dim cvs As B4XCanvas
	cvs.Initialize(p)
	Return cvs
End Sub

Public Sub ImageToBytes(Image As B4XBitmap) As Byte()
	Dim out As OutputStream
	out.InitializeToBytesArray(0)
	Image.WriteToStream(out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
	out.Close
	Return out.ToBytesArray
End Sub

Public Sub BytesToImage(bytes() As Byte) As B4XBitmap
	Dim In As InputStream
	In.InitializeFromBytesArray(bytes, 0, bytes.Length)
#if B4A or B4i
	Dim bmp As Bitmap
	bmp.Initialize2(In)
#else
   Dim bmp As Image
   bmp.Initialize2(In)
#end if
	Return bmp
End Sub


Sub camPanelInner_PictureTaken (Data() As Byte)
	Dim DateName As String = Utils.MakeFileName
	Dim DateTimeName As String = Utils.MakeDateTimeSlash
	
	CurrentFileName = $"IMG-${DateName}-${Counter}-INNER-${IntCounter}"$
	Dim filename As String = $"${CurrentFileName}.png"$
	If LastFileName = "" Then
		LastFileName = filename
	End If
	
	ShotFileLocation = Starter.InternalFolder
	If Starter.Params.CFG_TAKE_PICTURE_ALWAYS_AS_NEW = 0 Then
		filename = LastFileName
	End If
	
	'Dim dir As String = Starter.rp.GetSafeDirDefaultExternal("orion") 'File.DirRootExternal
	ShotFileName = filename
	Dim cmes As CameraSize = camExInner.GetPictureSize
	camExInner.SavePictureToFile(Data, ShotFileLocation, ShotFileName)
	
	'=======================================================================================
	' PREVIEW DA IMAGEM TIRADA COM GRAVAÇÃO DA DATA E HORA
	'=======================================================================================
	
	Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, cmes.Height)
	'cvs.Initialize(ImagePanel)
	Dim cvsRect As B4XRect
	cvsRect.Initialize(0,0,cmes.Width, cmes.Height)
	
	cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, ShotFileName), cvsRect)
	'cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocation, ShotFileName, cmes.Width, cmes.Height, True), cvsRect)
	'Dim DateName As String = MakeFileName
	Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
	DateTimeName = $"${DateTimeName} - ${sACLALatitude}/${sACLALongitude}"$
	
	Dim SCounter As String = $"Nº${IntCounter}"$
	cvs.DrawText(SCounter, 10dip, cvs.TargetRect.top+15dip, xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE), xui.Color_White, "LEFT")
	cvs.DrawText(DateTimeName, 10dip, cvs.TargetRect.Height-10dip, xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE), xui.Color_White, "LEFT")
	cvs.Invalidate
	Dim Out As OutputStream = File.OpenOutput(ShotFileLocation, $"${ShotFileName}"$, False)
	cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
	cvs.Release
	Out.Close
	CamShots.Add(ShotFileName)
	
'	
'	If Starter.Params.CFG_COPY_IMAGE_TO_GALLERY = 1 Then
'		Dim Phone As Phone
'		If Phone.SdkVersion <= 18 Then			' min - 4.3.1
'			Dim i As Intent
'			i.Initialize("android.intent.action.MEDIA_SCANNER_SCAN_FILE", "file://" & File.Combine(ShotFileLocation, filename))
'			Phone.SendBroadcastIntent(i)
'				
'		Else If Phone.SdkVersion <= 23 Then		' 4.4.2 - 6.0
'			Dim context As JavaObject
'			context = context.InitializeStatic("anywheresoftware.b4a.BA").GetField("applicationContext")
'			Dim paths() As String = Array As String(File.Combine(ShotFileLocation, filename)) 'files to scan
'			Dim mediaScanner As JavaObject
'			mediaScanner.InitializeStatic("android.media.MediaScannerConnection")
'			mediaScanner.RunMethod("scanFile", Array As Object(context, paths, Null, Null))
'		Else									' 7.0+ ?
'			'
'			Dim i As Intent
'			i.Initialize("android.intent.action.MEDIA_SCANNER_SCAN_FILE", CreateFileProviderUri(ShotFileLocation, filename))
'			Phone.SendBroadcastIntent(i)
'		End If
'		
'	End If
	
	CallSubDelayed2(ImageEdit, "SaveInnerShot", ShotFileName)
	CloseActivity
End Sub

Sub ChangeCamera_Click
	If Starter.Params.CFG_ALLOW_FRONT_CAMERA = 1 Then
		camExInner.Release
		frontCamera = Not(frontCamera)
		InitializeCamera
	Else
		ToastMessageShow("Apenas a camera traseira está activa.", True)
	End If
End Sub

Sub btnFlash_Click
	Dim f() As Float = camExInner.GetFocusDistances
	Log(f(0) & ", " & f(1) & ", " & f(2))
	Dim flashModes As List = camExInner.GetSupportedFlashModes
	If flashModes.IsInitialized = False Then
		ToastMessageShow("Flash não suportado.", False)
		Return
	End If
	Dim flash As String = flashModes.Get((flashModes.IndexOf(camExInner.GetFlashMode) + 1) Mod flashModes.Size)
	camExInner.SetFlashMode(flash)
	ToastMessageShow(flash, False)
	camExInner.CommitParameters
End Sub

Sub camZoom_ValueChanged (Value As Int, UserChanged As Boolean)
	If UserChanged = False Or camExInner.IsZoomSupported = False Then Return
	camExInner.Zoom = Value / 100 * camExInner.GetMaxZoom
	camExInner.CommitParameters
End Sub

Sub CreateFileProviderUri (Dir As String, FileName As String) As Object
	Dim FileProvider1 As JavaObject
	Dim context As JavaObject
	context.InitializeContext
	FileProvider1.InitializeStatic("android.support.v4.content.FileProvider")
	Dim f As JavaObject
	f.InitializeNewInstance("java.io.File", Array(Dir, FileName))
	Return FileProvider1.RunMethod("getUriForFile", Array(context, Application.PackageName & ".provider", f))
End Sub

Public Sub CloseActivity
	Activity.Finish
End Sub

Sub butCloseCamera_Click
	'CL Actions
	Dim DoContinue As Boolean = True
'	If (ReturnTo Is DialogItemActions) Then
'		Dim m As DialogItemActions = ReturnTo
'		m.CameraReturn(CamShots)
'	Else 
	If (ReturnTo Is AppActionDialogs) Then
		'DoContinue = False
		Dim ma As AppActionDialogs = ReturnTo
		Dim i As Int
		i = Msgbox2(ShareCode.SavePictureToCLAItem, ShareCode.GeneralNoteTitle, ShareCode.Option_EXITSAVE, ShareCode.Option_CANCEL, ShareCode.Option_EXITNOSAVE,  Null)
		If (i=DialogResponse.POSITIVE) Then
			If (CurrentCLAItem.Origin = 2) Then
				ma.CameraReturn(CurrentFileName, CurrentCLAItem)
				CallSubDelayed2(requests3, "CamImage", CurrentCLAItem)
			End If
		Else If (i=DialogResponse.NEGATIVE) Then
			ma.CameraReturnNothing
		Else
			DoContinue = False
		End If
		
	Else
		Dim i As Int
		i = Msgbox2(ShareCode.SavePictureToResoucesFolder, ShareCode.GeneralAlertTitle, ShareCode.Option_ACTION, ShareCode.Option_RESOURCE, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			'DialogLogin.getLoginDialog("MainMenu")
					
			'mainPanelLogin.Visible = True
		Else If (i=DialogResponse.NEGATIVE) Then
			'=======================================================================================
			' SAVE TO DB
			'=======================================================================================
			'
			
			Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
			Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

			For i=0 To CamShots.Size-1
				DBStructures.InsertWorkingFiles( ShareCode.SESS_User, Utils.GenerateTagcode("WFF_"), _
					CamShots.Get(i), ShotFileLocation, Utils.GetCurrDatetime, _
					sACLALatitude, sACLALongitude)
			Next
			
		Else
			'MsgboxAsync("Apagar", "Aviso!")
			'prc_AppClose
		End If
	End If
	
	If DoContinue Then Activity.Finish
End Sub

