B4A=true
Group=Main Forms
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
'CameraActivity
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

'camerawindowmultiple

Sub Globals
	Private camPanel As Panel
	Private camEx As CameraExClass
	Private butCloseCamera As Button
	Private showPicturePanel As Panel
	Private showPictureImage As ImageView
	Private ShowPictureClose As Button
	Private CurrentCLAItem As RequestCLAItem
	
	Private CurrentFileName As String = ""
	Private ReturnToName As String = "requests3"
	Private LastOrigin As Int = 0
	
	Private ExitToDialog As Boolean = False
	Private butCancelPicture As Button
	Private butSavePicture As Button
	Private btnTakePicture As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	Activity.LoadLayout("CameraWindow")
	CamShots.Initialize
	Dim dir As String = Starter.InternalFolder  '.SafeDefaultExternal
	ShotFileLocation = dir
End Sub

Public Sub StartCamera(ReturnToActivity As Object)
	ReturnTo = ReturnToActivity
	CurrentCLAItem = Types.MakeRequestCLAItem("__DUMMY__",  _  'Utils.MakeFileName, _
		 "__DUMMY__", "__DUMMY__", "__DUMMY__", Utils.udid, _
		 "__DUMMY__", 0,0,0,"", "", "", 1, 0, 0, "", _
		DBStructures.DB2CLATaskItem("", ""), "")
	InitializeCamera
End Sub

Public Sub StartCamera2(ReturnToActivity As Object, CLAItem As RequestCLAItem)
	ReturnTo = ReturnToActivity
	CurrentCLAItem = CLAItem
	ExitToDialog = True
	'ReturnToName = ret
	InitializeCamera
End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	If camEx.IsInitialized Then
		camEx.Release
	End If
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		CloseActivity
	End If
	Return True
End Sub

Private Sub InitializeCamera
	Try			
		If (Starter.APP_CAMERA_ACCESS) Then
			camEx.Initialize(camPanel, frontCamera, Me, "camPanel")
			frontCamera = camEx.Front
		Else
			ToastMessageShow("Sem Permissão!!!", True)
		End If
	Catch
		Log(LastException.Message)
	End Try
	
'	Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_CAMERA)
'	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'	If Result Then
'		camEx.Initialize(camPanel, frontCamera, Me, "camPanel")
'		frontCamera = camEx.Front
'	Else
'	End If
End Sub

Sub camPanel_Ready (Success As Boolean)
	If Success Then
		camEx.SetJpegQuality(ShareCode.DEVICE_DEF_QUALITY)
		'SetMinimumSize
		camEx.SetPictureSize(ShareCode.DEVICE_DEF_IMG_WIDTH,ShareCode.DEVICE_DEF_IMG_HEIGHT)
		camEx.SetContinuousAutoFocus
		camEx.CommitParameters
		camEx.StartPreview
	Else
		ToastMessageShow("Não é possível abrir a camera.", True)
	End If
End Sub


Private Sub SetMinimumSize
	Dim minCS As CameraSize
	For Each cs As CameraSize In camEx.GetSupportedPicturesSizes
		If minCS.Width = 0 Then
			minCS = cs
		Else
			If Power(minCS.Width, 2) + Power(minCS.Height, 2) > Power(cs.Width, 2) + Power(cs.Height, 2) Then
				minCS = cs
			End If
		End If
	Next
	camEx.SetPictureSize(minCS.Width, minCS.Height)
End Sub

Sub btnTakePicture_Click
	Try
		camEx.TakePicture
	Catch
		Log(LastException)
	End Try

End Sub

Sub btnFocus_Click
	camEx.FocusAndTakePicture
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


Sub camPanel_PictureTaken (Data() As Byte)
	Dim DateName As String = Utils.MakeFileName
	Dim DateTimeName As String = Utils.MakeDateTimeSlash2
	
	CurrentFileName = $"IMG-${DateName}-${Counter}"$
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
	Dim cmes As CameraSize = camEx.GetPictureSize
	camEx.SavePictureToFile(Data, ShotFileLocation, ShotFileName)
	
	'=======================================================================================
	' PREVIEW DA IMAGEM TIRADA COM GRAVAÇÃO DA DATA E HORA
	'=======================================================================================
	Dim fnt As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE) 'xui.CreateFont(Typeface.DEFAULT, 8)
	Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, cmes.Height)
	'cvs.Initialize(ImagePanel)
	Dim cvsRect As B4XRect
	cvsRect.Initialize(0,0,cmes.Width, cmes.Height)
	cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, ShotFileName), cvsRect)
	Dim la As String = LocationService.GeoLocal.lat
	Dim lo As String = LocationService.GeoLocal.lon
	DateTimeName = $"${DateTimeName}  -  ${la}/${lo}"$
	If  (ShareCode.APP_DOMAIN.ToLowerCase = "printcriativa") Then
		Dim sSQL As String = $"select ' - '||c.title_import||' - '||d.title_import as stampname
								from dta_requests as a
								LEFT JOIN dta_objects AS c ON (c.tagcode=a.entity_tagcode)
								LEFT JOIN dta_objects AS d ON (d.tagcode=a.object_tagcode)
								where a.tagcode='${CurrentCLAItem.Request.Trim}'"$
		Dim stamp As String = DBStructures.GetScriptColumnStrEVC(sSQL, "stampname")
		DateTimeName = $"${stamp}"$
	End If
'	cvs.DrawText(DateTimeName, 10dip, cvs.TargetRect.Height-10dip, fnt, xui.Color_White, "LEFT")
	
	Dim f As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE)
	Dim dRect As B4XRect
	dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.TargetRect.Height-18dip, cvs.TargetRect.Left+350dip, cvs.TargetRect.Height)
	DrawTextWithBorder2(cvs, DateTimeName, f, Consts.ColorDarkGray, (dRect.left+dRect.Right)/2, (dRect.Top+dRect.Bottom)/2, 1, 0)
	
	Log($"${ShareCode.DEVICE_DEF_QUALITY}, ${ShareCode.DEVICE_DEF_IMG_FILETYPE}"$)
	
	cvs.Invalidate
'	ShareCode.DEVICE_DEF_QUALITY = 90
'	ShareCode.DEVICE_DEF_IMG_FILETYPE = "PNG"
	Dim Out As OutputStream = File.OpenOutput(ShotFileLocation, $"${ShotFileName}"$, False)
	cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
	cvs.Release
	Out.Close
	

	Dim bc1 As B4XBitmap =  xui.LoadBitmapResize(ShotFileLocation, ShotFileName, showPictureImage.Width, showPictureImage.Height, True)
	showPictureImage.SetBackgroundImage(bc1)
	showPicturePanel.Visible = True
	butCloseCamera.Enabled = Not(showPicturePanel.Visible)
	btnTakePicture.Enabled = Not(showPicturePanel.Visible)
	'=======================================================================================
	
	CamShots.Add(ShotFileName)

	If StayOnCamera Then
		camEx.StartPreview 'restart preview
		Counter = Counter + 1
	Else
	End If
End Sub

Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As String, Fnt As B4XFont, Clr As Int, CenterX As Int, CenterY As Int, border As Int, bline As Int)
	'CenterX = (DrawingRect.left+DrawingRect.Right)/2, CenterY = (DrawingRect.Top+DrawingRect.Bottom)/2
	Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)
	Dim baseline As Int = CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr, "CENTER")
	'cvs1.DrawCircle(CenterX, CenterY, 3dip, xui.Color_Blue, True, 0)
	
	r.Initialize(CenterX - r.Width / 2, CenterY - r.Height / 2, CenterX + r.Width / 2, CenterY + r.Height / 2)
	If (bline >=1) Then
		cvs1.DrawLine(r.Left, baseline, r.Right, baseline, Clr, bline)
	End If
	If (border >=1) Then
		cvs1.DrawRect(r, Clr, False, border)
	End If
End Sub

Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text As String, Fnt As B4XFont, Clr As Int, CenterX As Int, CenterY As Int, border As Int, bline As Int)
	'CenterX = (DrawingRect.left+DrawingRect.Right)/2, CenterY = (DrawingRect.Top+DrawingRect.Bottom)/2
	Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)
	r.Height = r.Height + (r.Height /2) + 5dip
	r.Width = r.Width + (r.Width /2) + 5dip ' * 2
	
	Dim baseline As Int = CenterY - ((r.Height - Fnt.Size)/2) - r.Top 'CenterY - r.Height / 2 - r.Top
	'cvs1.DrawCircle(CenterX, CenterY, 3dip, xui.Color_Blue, True, 0)
	r.Initialize(CenterX - r.Width / 2, CenterY - r.Height / 2, CenterX + r.Width / 2, CenterY + r.Height / 2)
	If (bline >=1) Then
		cvs1.DrawLine(r.Left, baseline, r.Right, baseline, Clr, bline)
	End If
	If (border >=1) Then
		Dim ro As B4XRect
		ro.Initialize(r.Left-border, r.Top-border, r.Right+border, r.Bottom+border)
		cvs1.DrawRect(ro, Clr, True, border)
		cvs1.DrawRect(r, Consts.ColorWhite, True, border)
	End If
	'cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr, "CENTER")
	cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr, "CENTER")
End Sub


Sub DrawTextWithBorder2Phone (cvs1 As B4XCanvas, Text As String, Fnt As B4XFont, Clr As Int, CenterX As Int, CenterY As Int, border As Int, bline As Int)
	'CenterX = (DrawingRect.left+DrawingRect.Right)/2, CenterY = (DrawingRect.Top+DrawingRect.Bottom)/2
	Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)
	r.Height = r.Height + (r.Height /2) + 5dip
	r.Width = r.Width + (r.Width /2) + 50dip ' * 2
	
	Dim baseline As Int = CenterY - ((r.Height - Fnt.Size)/2) - r.Top 'CenterY - r.Height / 2 - r.Top
	'cvs1.DrawCircle(CenterX, CenterY, 3dip, xui.Color_Blue, True, 0)
	r.Initialize(CenterX - r.Width / 2, CenterY - r.Height / 2, CenterX + r.Width / 2, CenterY + r.Height / 2)
	If (bline >=1) Then
		cvs1.DrawLine(r.Left, baseline, r.Right, baseline, Clr, bline)
	End If
	If (border >=1) Then
		Dim ro As B4XRect
		ro.Initialize(r.Left-border, r.Top-border, r.Right+border, r.Bottom+border)
		cvs1.DrawRect(ro, Clr, True, border)
		cvs1.DrawRect(r, Consts.ColorWhite, True, border)
	End If
	'cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr, "CENTER")
	cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr, "LEFT")
End Sub

Sub ChangeCamera_Click
	If Starter.Params.CFG_ALLOW_FRONT_CAMERA = 1 Then
		camEx.Release
		frontCamera = Not(frontCamera)
		InitializeCamera
	Else
		ToastMessageShow("Apenas a camera traseira está activa.", True)
	End If
End Sub

Sub btnEffect_Click
	Dim effects As List = camEx.GetSupportedColorEffects
	If effects.IsInitialized = False Then
		ToastMessageShow("Efeitos não suportados.", False)
		Return
	End If
	Dim effect As String = effects.Get((effects.IndexOf(camEx.GetColorEffect) + 1) Mod effects.Size)
	camEx.SetColorEffect(effect)
	ToastMessageShow(effect, False)
	camEx.CommitParameters
End Sub

Sub btnFlash_Click
	Dim f() As Float = camEx.GetFocusDistances
	Log(f(0) & ", " & f(1) & ", " & f(2))
	Dim flashModes As List = camEx.GetSupportedFlashModes
	If flashModes.IsInitialized = False Then
		ToastMessageShow("Flash não suportado.", False)
		Return
	End If
	Dim flash As String = flashModes.Get((flashModes.IndexOf(camEx.GetFlashMode) + 1) Mod flashModes.Size)
	camEx.SetFlashMode(flash)
	ToastMessageShow(flash, False)
	camEx.CommitParameters
End Sub

Sub btnPictureSize_Click
	Dim pictureSizes() As CameraSize = camEx.GetSupportedPicturesSizes
	Dim current As CameraSize = camEx.GetPictureSize
	For i = 0 To pictureSizes.Length - 1
		If pictureSizes(i).Width = current.Width And pictureSizes(i).Height = current.Height Then Exit
	Next
	Dim ps As CameraSize = pictureSizes((i + 1) Mod pictureSizes.Length)
	camEx.SetPictureSize(ps.Width, ps.Height)
	ToastMessageShow(ps.Width & "x" & ps.Height, False)
	camEx.CommitParameters
End Sub

Sub camZoom_ValueChanged (Value As Int, UserChanged As Boolean)
	If UserChanged = False Or camEx.IsZoomSupported = False Then Return
	camEx.Zoom = Value / 100 * camEx.GetMaxZoom
	camEx.CommitParameters
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

Sub CamImage(CLAItem As RequestCLAItem)
	If CLAItem.Origin = 4 Then
		CurrentCLAItem.Origin = LastOrigin
		If (ExitToDialog) Then
			If (CurrentCLAItem.Origin = 1) Then
				CallSubDelayed2(User, "CallMOREActionsAgain", CurrentCLAItem)
			else If (CurrentCLAItem.Origin = 2) Then
				CallSubDelayed2(requests3, "CamImage", CurrentCLAItem)
			else If (CurrentCLAItem.Origin = 3) Then
				
				Dim Base64Con As Base64Convert
				Base64Con.Initialize
				Dim ImgB64 As String = Base64Con.EncodeFromImage(ShotFileLocation, CurrentFileName)
'				Dim sSQL As String = $"insert into requests_values_images
'						(request_tagcode, action_tagcode, task_tagcode, item_tagcode, uniquekey, tagcode, image, filename, base_image, on_report)
'						values ('${CLAItem.Request}', '${CLAItem.Action}', '${CLAItem.Task}', '${CLAItem.Item}', '${CLAItem.UniqueKey}', '${CLAItem.Tagcode}',
'						'${ImgB64}', '${CurrentFileName}', 0, 1)"$
						
				'imageb64|
				Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3 + 1000000 'id, ${maxid},
				Dim sSQL As String = $"insert into dta_requests_values_images 
					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report, 
						repeatcounter, repeatitemcounter, repeatfieldcounter)
					values (${maxid}, '${CLAItem.Request}', '${CLAItem.Action}', '${CLAItem.Task}', '${CLAItem.Item}', '${CLAItem.UniqueKey}', '${CLAItem.Tagcode}',
					'${ImgB64}', '${CurrentFileName}', 1, 
					${CLAItem.RepeatCounter}, ${CLAItem.RepeatItemCounter}, ${CLAItem.repeatfieldcounter})"$
				Utils.SaveSQLToLog("CamImage",sSQL, CLAItem.Request)
				'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
				
		
				Dim sACLADatetime As String = Utils.GetCurrDatetime
				Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
				Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

				Dim params As Map
				params.Initialize
				params.Clear
				params.Put("_token", ShareCode.APP_TOKEN)
				params.Put("ACLARequest", CLAItem.Request)
				params.Put("ACLAAction", CLAItem.Action)
				params.Put("ACLATask", CLAItem.Task)
				params.Put("ACLAItem", CLAItem.Item)
				params.Put("ACLAUniqueKey", CLAItem.UniqueKey)
				params.Put("ACLATagcode", CLAItem.Tagcode)
				params.Put("ACLAValueImage", ImgB64)
				params.Put("ACLAValueFileImage", CurrentFileName)
				params.Put("ACLAOnReport", 1)
				params.Put("ACLADatetime", sACLADatetime)
				params.Put("versionTagcode", Main.VersionTagcode)
				params.Put("_authorization", Main.DeviceAuthorization)
				params.Put("_instance", Main.DeviceInstance)
				params.put("_deviceBrand", Main.DeviceBrand)
				params.put("_deviceModel", Main.DeviceModel)
				params.put("_deviceMacAddress", Main.DeviceMacAddress)
				params.Put("_user", ShareCode.SESS_User)
				Try
					params.Put("ACLALatitude", sACLALatitude)
					params.Put("ACLALongitude", sACLALongitude)
				Catch
					params.Put("ACLALatitude", "")
					params.Put("ACLALongitude", "")
					Log(LastException)
				End Try
'				Utils.CallApi(0, params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update"$, "")
				
				Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update"$
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Utils.CallApi(0, params, Me, Url, "", CLAItem.Request)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
					Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
				End If
				Sleep(250)
				
				CallSubDelayed2(CheckList3, "CamImage", CurrentCLAItem)
			End If
			Activity.Finish
		End If
	End If
End Sub

Sub ShowPictureClose_Click
	showPicturePanel.Visible = False
End Sub

Sub butSavePicture_Click
	Dim DoContinue As Boolean = True
	If (ExitToDialog) Then
'		If (ReturnTo Is DialogItemActions) Then
'			Dim m As DialogItemActions = ReturnTo
'			m.CameraReturn(CamShots)
'		Else 
		If (ReturnTo Is AppActionDialogs) Then
			Try
				Dim ma As AppActionDialogs = ReturnTo
				ma.CameraReturn(CurrentFileName, CurrentCLAItem)
			Catch
				Log(LastException)
			End Try
			If (CurrentCLAItem.Origin = 2) Then
				CallSubDelayed2(requests3, "CamImage", CurrentCLAItem)
			else If (CurrentCLAItem.Origin = 3) Then
				CallSubDelayed2(CheckList3, "CamImage", CurrentCLAItem)
			End If
		End If
	Else
		Dim this As RequestCLAItem = CurrentCLAItem
		Dim Base64Con As Base64Convert
		Base64Con.Initialize
		If (ShotFileLocation = File.DirAssets) Then ShotFileLocation = Starter.InternalFolder
		Dim ApiList As List
		ApiList.Initialize
		
		For i=0 To CamShots.Size-1
			Dim theFile As String = CamShots.Get(i)
			Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"${theFile}"$)

'			Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3  + 100000 'id, ${maxid},
'			Dim sSQL As String = $"insert into dta_requests_values_images 
'				(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report, repeatcounter)
'				values (${maxid}, '${this.Request}', '${this.Action}', '${this.Task}', '${this.Item}', '${this.UniqueKey}', '${this.Tagcode}',
'			'${ImgB64}', '${theFile}', 1, ${this.RepeatCounter})"$
'			Utils.SaveSQLToLog("butSavePicture_Click",sSQL)
'			'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)

			Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
			Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
			Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
			origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
			values (${mID}, '${alerttagcode}', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', 1, 1, 'Imagens adicionadas ao repositório por utilizar.', 
			'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
			Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")
			'TASSGT_OBJECTS
			'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	
			Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts_images", "id", "") + 1+ 1000000
			Dim sSQL As String = $"insert into dta_alerts_images
				(id, tagcode, imageb64, imagename, assigned)
				values (${mID}, '${alerttagcode}', '${ImgB64}', '${theFile}', 0)"$
			
			Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")
			'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)

			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("tagcode", alerttagcode)
			params.Put("relation_type", "ALRTREL_TASKS")
			params.Put("alert_type", "ALRTTYP_TASKS")
			params.Put("internal", 1)
			params.Put("origin", 1)
			params.Put("title", "Imagens adicionadas ao repositório por utilizar.")
			params.Put("user_tagcode", ShareCode.SESS_User)
			params.Put("date_alert", Utils.GetCurrentDate)
			params.Put("date_verification", "")
			params.Put("alert_visible", 1)
			params.Put("imageb64", ImgB64)
			params.Put("imagename", theFile)
			params.Put("status_id", 0)
			params.Put("kind_data", 0)
			params.Put("request_tagcode", this.Request)
			params.Put("action_tagcode", this.Action)
			params.Put("task_tagcode", this.Task)
			params.Put("item_tagcode", this.Item)
			params.Put("uniquekey", this.UniqueKey)
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			ApiList.Add(params)
			
		Next
		CallSubDelayed3(MainMenu, "ListsReturnUpdateServer", $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/alert/new"$, ApiList)
	End If
	
	If DoContinue Then Activity.Finish
End Sub

Sub butCancelPicture_Click
	showPictureImage.SetBackgroundImage(Null)
	showPicturePanel.Visible = False
	butCloseCamera.Enabled = Not(showPicturePanel.Visible)
	btnTakePicture.Enabled = Not(showPicturePanel.Visible)
End Sub

Sub butCloseCamera_Click
	Dim DoContinue As Boolean = True
	If (ExitToDialog) Then
'		If (ReturnTo Is DialogItemActions) Then
'			Dim m As DialogItemActions = ReturnTo
'			m.CameraReturnNoAction
'		Else 
		If (ReturnTo Is AppActionDialogs) Then
			If (CurrentCLAItem.Origin = 2) Then
				CallSubDelayed2(requests3, "CamImage", CurrentCLAItem)
			else If (CurrentCLAItem.Origin = 3) Then
				CallSubDelayed2(CheckList3, "CamImage", CurrentCLAItem)
			End If
		End If
	Else
		CallSubDelayed(MainMenu, "ListsReturnNoAction")
	End If
	If DoContinue Then Activity.Finish
End Sub

Sub showPictureImage_Click
	'showPictureImage
	'CallSubDelayed3(ImageEdit, "StartDrawFrom", ShotFileLocation, ShotFileName)
	LastOrigin = CurrentCLAItem.Origin
	CurrentCLAItem.Origin = 4
	CurrentFileName = ShotFileName
	'CallSubDelayed3(ImageEdit, "StartDrawFrom", Types.MakeFileShot(ShotFileLocation, ShotFileName), CurrentCLAItem)
End Sub

