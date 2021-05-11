B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
'CameraActivity2
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
	Public Orientation As PhoneOrientation
	Public HasFocus As Boolean = False
End Sub

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
	Private btnFocus As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(0)
	End If
	Activity.LoadLayout("camerawindowmultiple")
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
	InitializeCamera
End Sub

Public Sub StartCamera3(CLAItem As RequestCLAItem)
	CurrentCLAItem = CLAItem
	ExitToDialog = True
	ReturnToName = "checklist3"
	Sleep(250)
	InitializeCamera
End Sub

Sub Activity_Resume
	CamShots.Initialize
	Dim dir As String = Starter.InternalFolder  '.SafeDefaultExternal
	ShotFileLocation = dir
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	If camEx.IsInitialized Then
		camEx.Release
	End If
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
'		CloseActivity
		butCloseCamera_Click
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
		camEx.SetPictureSize(ShareCode.DEVICE_DEF_IMG_WIDTH,ShareCode.DEVICE_DEF_IMG_HEIGHT)
		camEx.SetContinuousAutoFocus
		camEx.CommitParameters
		camEx.StartPreview
		
		HasFocus = False		
		btnFocus.Enabled = False
		Dim fm As List = camEx.GetSupportedFocusModes
		For n=0 To fm.Size -1
			If fm.Get(n) = "auto" Then
				 HasFocus = True
				btnFocus.Enabled = True
			End If
		Next
		
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
	
'	If HasFocus Then
'		camEx.FocusAndTakePicture
'	Else
		camEx.TakePicture
'	End If
	
	Catch
		Log(LastException)
	End Try

End Sub

Sub btnFocus_Click

	If HasFocus Then
		HasFocus = False
		btnFocus.Text = Chr(0xF1BE)
	Else
		HasFocus = True
		btnFocus.Text = "AF"
End If

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
	If width <= 0 Then width = 1
	If height <=0 Then height = 1
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

Sub FlipPicture(ImgLocation As String, ImgFilename As String, FlipVert As Boolean, FlipHoriz As Boolean) As ResumableSub
	
	Try
		Dim BitmapIn As Bitmap = LoadBitmap(ImgLocation,ImgFilename)
		Dim CanvasOut As Canvas
		Dim DestRect As Rect
		DestRect.Initialize(0,0,BitmapIn.Width,BitmapIn.Height)
		CanvasOut.Initialize(Activity)
		Dim out As OutputStream
		
		CanvasOut.DrawBitmapFlipped(BitmapIn, Null, DestRect, FlipVert, FlipHoriz)
				
		out = File.OpenOutput(ImgLocation, ImgFilename, False)
		CanvasOut.Bitmap.WriteToStream(out, 100, "PNG")
		out.Close
		Return True
	Catch
		Log(LastException)
		Return False
	End Try
	
End Sub

Sub camPanel_PictureTaken (Data() As Byte)
	Dim DateName As String = Utils.MakeFileName
	Dim DateTimeName As String = Utils.MakeDateTimeSlash2
	Dim DatetimeDB As String = Utils.GetCurrDatetimeExt
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
	
	'TIP : FLIP VERTICAL E HORIZONTAL DAS FOTOS
	'***********************************************************************************
	Dim FlipV As Boolean = Utils.Int2Bool(ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE)
	Dim FlipH As Boolean = Utils.Int2Bool(ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE)
	'***********************************************************************************
	' OS VALORES BOOLEANOS CORRESPONDEM AOS FLIP VERTICAL E FLIP HORIZONTAL
	' O FLIP VERTICAL VEM DO PARAMETRO ACIMA, O VERTICAL E FALSO POR DEFEITO
	'***********************************************************************************
	
	'***********************************************************************************
	' FALTOU O MAIS IMPORTANTE!!!
	' SÓ EXECUTA SE OS PARAMETROS ESTIVEREM ACTIVOS
	' POR NÃO FAZER ESTE CONTROLO, TODOS OS CLIENTES RECLAMARAM
	'***********************************************************************************
	If (FlipV) Or (FlipV) Then
		Dim flp As ResumableSub = FlipPicture(ShotFileLocation, ShotFileName, FlipV, FlipH)
		Wait For(flp) Complete (RequestSuccessful As Boolean)
	End If
	
		
	'=======================================================================================
	' PREVIEW DA IMAGEM TIRADA COM GRAVAÇÃO DA DATA E HORA E COORDENADAS
	'=======================================================================================
	Dim fnt As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE) 'xui.CreateFont(Typeface.DEFAULT, 8)
	Dim cvsRect As B4XRect
	Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, cmes.Height)
	cvsRect.Initialize(0,0,cmes.Width, cmes.Height)
	cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, ShotFileName), cvsRect)
	Dim lat As String = LocationService.GeoLocal.lat
	Dim lon As String = LocationService.GeoLocal.lon
	
	'*******************************************************************
	'FORÇA A ESPERAR ATE ACTUALIZAR AS COORDENADAS
	'*******************************************************************
	If LocationService.GeoLocal.lat="Null" Then
		ToastMessageShow("Falha na obtencão de coordenadas GPS",True)
		Dim NewDateTimeName As String = $"${DateTimeName}  -  -/-"$
	Else
		Dim NewDateTimeName As String = $"${DateTimeName}  -  ${lat}/${lon}"$
	End If

	

	If  (ShareCode.APP_DOMAIN.ToLowerCase = "printcriativa") Then
		Dim sSQL As String = $"select ' - '||c.title_import||' - '||d.title_import as stampname
								from dta_requests as a
								LEFT JOIN dta_objects AS c ON (c.tagcode=a.entity_tagcode)
								LEFT JOIN dta_objects AS d ON (d.tagcode=a.object_tagcode)
								where a.tagcode='${CurrentCLAItem.Request.Trim}'"$
		Dim stamp As String = DBStructures.GetScriptColumnStrEVC(sSQL, "stampname")
		NewDateTimeName = $"${stamp}"$
	End If
'	cvs.DrawText(DateTimeName, 10dip, cvs.TargetRect.Height-10dip, fnt, xui.Color_White, "LEFT")
	
	
	Dim dRect As B4XRect
	'*********************************************************************
	' ALTERACAO PC - FONTE DO STAMP DA FOTO É MUITO GRANDE PARA SMARTPHONES
	'*********************************************************************
	If (ShareCode.ISPHONE) Then
		Dim f As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE / 2)
		dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.TargetRect.Height-10dip, cvs.TargetRect.Width-10, cvs.TargetRect.Height)
	Else
		Dim f As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE)
		dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.TargetRect.Height-18dip, cvs.TargetRect.Width-10, cvs.TargetRect.Height)
'		Dim f As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE)
'		dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.TargetRect.Height-18dip, cvs.TargetRect.Left+350dip, cvs.TargetRect.Height)
	End If
	
	DrawTextWithBorder2(cvs, NewDateTimeName, f, Consts.ColorDarkGray, (dRect.left+dRect.Right)/2, (dRect.Top+dRect.Bottom)/2, 1, 0)
	
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
	ShowPreviewShot(True)
	'=======================================================================================

'	Dim theFoto As ShotFoto = Types.MakeShotFoto(ShotFileName, DatetimeName, lat, lon, NewDateTimeName)
	Dim theFoto As ShotFoto = Types.MakeShotFoto(ShotFileName, DatetimeDB, lat, lon, NewDateTimeName)
	'CamShots.Add(ShotFileName)
	CamShots.Add(theFoto)
	If StayOnCamera Then
		camEx.StartPreview 'restart preview
		Counter = Counter + 1
	End If
	Sleep(500)
	ShowPreviewShot(False)
End Sub

Sub ShowPreviewShot(state As Boolean)
	showPicturePanel.Visible = state
	butCloseCamera.Enabled = Not(showPicturePanel.Visible)
	btnTakePicture.Enabled = Not(showPicturePanel.Visible)
	butSavePicture.Enabled = Not(showPicturePanel.Visible)
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
'	Dim effects As List = camEx.GetSupportedColorEffects
'	If effects.IsInitialized = False Then
'		Return
'	End If
'	Dim effect As String = effects.Get((effects.IndexOf(camEx.GetColorEffect) + 1) Mod effects.Size)
'	camEx.SetColorEffect(effect)
'	camEx.CommitParameters
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
	Try
		camEx.SetFlashMode(flash)
		camEx.CommitParameters
	Catch
		ToastMessageShow(flash, False)
	End Try
End Sub

Sub btnPictureSize_Click

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

Sub butSavePicture_Click
	Dim DoContinue As Boolean = True
	Dim JustExit As Boolean = False
	
	If (CamShots.Size = 0) Then
		
		Msgbox2Async("Não existem fotos tiradas para gravar! Deseja sair do módulo?", ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_CANCEL, "", Null,False)
		Wait For Msgbox_Result (Result As Int)
		If Result = DialogResponse.POSITIVE Then
			JustExit = True
		Else
			JustExit = False
			DoContinue = False
		End If
	End If
	
	If Not(JustExit) And (DoContinue) Then
		If (ExitToDialog) Then
			If (ReturnTo Is AppActionDialogs) Then
				If (CurrentCLAItem.Origin = 2) Then
					CallSubDelayed2(requests3, "CamImage", CurrentCLAItem)
				else If (CurrentCLAItem.Origin = 3) Then
					CallSubDelayed3(CheckList3, "CamImage", CurrentCLAItem, CamShots)
				End If
			Else
				If (ReturnToName = "checklist3") Then
					CallSubDelayed3(CheckList3, "CamImage", CurrentCLAItem, CamShots)
					Dim DoContinue As Boolean = True
				End If
			End If
		Else
			Dim this As RequestCLAItem = CurrentCLAItem
			Dim Base64Con As Base64Convert
			Base64Con.Initialize
			If (ShotFileLocation = File.DirAssets) Then 
				ShotFileLocation = Starter.InternalFolder
			End If
			Dim ApiList As List
			ApiList.Initialize
			ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos, False)
			Dim i As Int = 0
			For i=0 To CamShots.Size-1
				Dim theFoto  As ShotFoto = CamShots.Get(i) 'Types.MakeShotFoto(ShotFileName, DateTimeName, la, lo, NewDateTimeName)
				
				Dim theFile As String = theFoto.FileName  'CamShots.Get(i)
				Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"${theFile}"$)
				
				Dim grp As String = $"${Utils.IfNullOrEmpty(theFoto.DateNTime, "")}|${Utils.IfNullOrEmpty(theFoto.Latitude, "")}|${Utils.IfNullOrEmpty(theFoto.Longitude, "")}"$
				

				Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
				Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
				Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
						origin, title, group_tags, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
						values (${mID}, '${alerttagcode}', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', 
						1, 1, 'Imagens adicionadas ao repositório por utilizar.', '${grp}',
						'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
				Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")
	
				Dim titleFoto As String = $"${Utils.IfNullOrEmpty(theFoto.Title, "")}"$
				Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts_images", "id", "") + 1
				Dim sSQL As String = $"insert into dta_alerts_images
							(id, tagcode, imageb64, imagename, assigned, obs)
							values (${mID}, '${alerttagcode}', '${ImgB64}', '${theFile}', 0, '${titleFoto}')"$
			
				Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")

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
			ProgressDialogHide
			Sleep(125)
			CallSubDelayed3(MainMenu, "ListsReturnUpdateServer", $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/alert/new"$, ApiList)
		End If
	End If
	
	If DoContinue Then Activity.Finish
End Sub




Sub CameraReturnShots(FileList As List, this As RequestCLAItem) As ResumableSub
	
	'CurrentCLAItem
	Dim obj As String = this.TagObject
	Dim params As Map
	Dim params33 As Map
	If (FileList.Size >0) Then
		ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos, False)
		For nFile=0 To FileList.Size-1
			Dim theFoto  As ShotFoto = FileList.Get(nFile) 'Types.MakeShotFoto(ShotFileName, DateTimeName, la, lo, NewDateTimeName)
			Dim FileName As String = theFoto.FileName
			If Not(Utils.isNullOrEmpty(FileName)) Then
				If Not(FileName.IndexOf(".png") >= 0) Then
					FileName = $"${FileName}.png"$
				End If
				Dim Base64Con As Base64Convert
				Base64Con.Initialize
				Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"${FileName}"$)
				'imageb64|imagename
				
				Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3 + 1000000
				Dim sSQL As String = $"insert into dta_requests_values_images
						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, 
						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, 
						execute_datetime, execute_latitude, execute_longitude)
						values (${maxid}, '${this.Request}', '${this.Action}', '${this.Task}', '${this.Item}', '${this.UniqueKey}', '${this.Tagcode}',
				'${ImgB64}', '${FileName}', 1, ${this.RepeatCounter}, ${this.RepeatItemCounter}, ${this.repeatfieldcounter},
				'${Utils.IfNullOrEmpty(theFoto.DateNTime, "")}',
				'${Utils.IfNullOrEmpty(theFoto.Latitude, "")}',
				'${Utils.IfNullOrEmpty(theFoto.Longitude, "")}')"$
						
				Utils.SaveSQLToLog("CameraReturn",sSQL, this.Request)
		
				If (Utils.NNE(obj)) Then
					Dim v As Int = Utils.DBDataCount(Starter.LocalSQLEVC, $"select count(0) as COUNTER from dta_objects_images "$) +1
					Dim sSQL As String = $"insert into dta_objects_images (id, object_tagcode, image, filename)
					values (${v}, '${obj}', '${ImgB64}', '${FileName}')"$
					Utils.SaveSQLToLog("CameraReturn",sSQL, this.Request)
					'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
					params33.Initialize
					params33.Clear
					params33.Put("_token", ShareCode.APP_TOKEN)
					params33.Put("ACLATagcode", obj)
					params33.Put("ACLAValueImage", ImgB64)
					params33.Put("ACLAValueFileImage", FileName)
			
				End If
		
				Private sACLADatetime As String = Utils.GetCurrDatetime
				Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
				Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

				params.Initialize
				params.Clear
				params.Put("_token", ShareCode.APP_TOKEN)
				params.Put("ACLARequest", this.Request)
				params.Put("ACLAAction", this.Action)
				params.Put("ACLATask", this.Task)
				params.Put("ACLAItem", this.Item)
				params.Put("ACLAUniqueKey", this.UniqueKey)
				params.Put("ACLATagcode", this.Tagcode)
				params.Put("ACLAValueImage", ImgB64)
				params.Put("ACLAValueFileImage", FileName)
				params.Put("ACLAOnReport", 1)
				params.Put("ACLAReqCounter", this.RepeatCounter)
				params.Put("ACLARepeatItem", this.RepeatItemCounter)
				params.Put("versionTagcode", Main.VersionTagcode)
				params.Put("_authorization", Main.DeviceAuthorization)
				params.Put("_instance", Main.DeviceInstance)
				params.put("_deviceBrand", Main.DeviceBrand)
				params.put("_deviceModel", Main.DeviceModel)
				params.put("_deviceMacAddress", Main.DeviceMacAddress)
				params.Put("_user", ShareCode.SESS_User)
				params.Put("ACLADatetime", sACLADatetime)
				Try
					params.Put("ACLALatitude", sACLALatitude)
					params.Put("ACLALongitude", sACLALongitude)
				Catch
					params.Put("ACLALatitude", "")
					params.Put("ACLALongitude", "")
					Log(LastException)
				End Try
			
			End If
	
'			If Not(this.Value = "IMG_B64_EDIT") Then
'				If (ItemImages.IsInitialized) Then
'					ItemImages.Clear
'				End If
'				
'				Dim sSQL As String = $"select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report
'								from dta_requests_values_images where request_tagcode='${this.Request}' and
'								task_tagcode='${this.Task}' and item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and 
'								tagcode='${this.Tagcode}'
'								And repeatcounter=${this.RepeatCounter}
'								And repeatitemcounter=${this.RepeatItemCounter}"$
'				Private Record2 As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
'		
'				If Record2.RowCount > 0 Then
'					For n=0 To Record2.RowCount-1
'						Record2.Position = n
'						Dim image As String = Record2.GetString("imageb64")
'						Dim FileName As String = Record2.GetString("imagename")
'						If Not(Utils.isNullOrEmpty(image)) Then
'							'Dim bmp As Bitmap = Base64Con.DecodeToImage(image)
'							If (ItemImages.IsInitialized) Then
'								Try
'									ItemImages.Add(CreateImagePanel(this, FileName, image, 0, ""), "")
'								Catch
'									Log(LastException)
'								End Try
'							End If
'						End If
'					Next
'				End If
'				Record2.Close
'			End If
	
			'Dim params As Map
			If (params.IsInitialized) Then
				Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update"$
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Utils.CallApi(0, params, Me, Url, "", this.Request)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
					Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
				End If
				Sleep(250)
		
		
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Try
						Dim upl As ResumableSub = UploadFilesWithFTP(FileName)
						Wait For(upl) Complete (finish As Boolean)
						If finish Then
							Log("UploadFilesWithFTP finish " & finish )
						End If

					Catch
						Log(LastException)
						Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.trim,this.Task.trim,this.Item.trim)
						Utils.save2update(ServerLocation, FileName, 1, WorkerND)
					End Try
				Else
					Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.trim,this.Task.trim,this.Item.trim)
					Utils.save2update(ServerLocation, FileName, 1, WorkerND)
				End If
				Sleep(250)
			End If
	
			If (params33.IsInitialized) Then
				
				Log("3333333333333333333333333333333333333333333333")
				Log(Url)
				Log("3333333333333333333333333333333333333333333333")
				Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more2/img/update"$
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Utils.CallApi(0, params33, Me, Url, "", this.Request)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.trim,this.Task.trim,this.Item.trim)
					Utils.save2update(Url, Utils.MapToJson(params33), 0, WorkerND)
				End If
				Sleep(250)
			End If
			'CallSub(CameraActivity, "CloseActivity")
			
		Next
		ProgressDialogHide
	End If
'	Sleep(2000)
	Return True
End Sub


Sub UploadFilesWithFTP(filename As String )  As ResumableSub
	Dim ret As Boolean = False
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
'	Dim ctm As CustomTrustManager
'	ctm.InitializeAcceptAll
'	myFTP.SetCustomSSLTrustManager(ctm)
	myFTP.TimeoutMs =240000
	Log(filename)
	Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, filename, False, "/" & ShareCode.APP_DOMAIN & "/docs/" & filename)
	Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
	If Success Then
		Log("file was uploaded successfully")
		ret = True
	Else
		Log("Error uploading file")
		ret = False
	End If
	myFTP.Close
	Sleep(250)
	
	Log("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU")
	Log("upload")
	Log("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU")
	Return ret
End Sub


'Sub butCancelPicture_Click
'	showPictureImage.SetBackgroundImage(Null)
'	showPicturePanel.Visible = False
'	butCloseCamera.Enabled = Not(showPicturePanel.Visible)
'	btnTakePicture.Enabled = Not(showPicturePanel.Visible)
'End Sub

Sub ShowPictureClose_Click
	showPicturePanel.Visible = False
End Sub

Sub butCloseCamera_Click
	
	Dim DoContinue As Boolean = True
'	Dim JustExit As Boolean = False
	
	If (CamShots.Size >= 1) Then
		Dim i As Int = Msgbox2("Existem fotos tiradas por gravar! Deseja sair do módulo na mesma sem gravar?", ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_CANCEL, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			DoContinue = True
		Else
			DoContinue = False
		End If
	End If
	
	If (DoContinue) Then
		If (ExitToDialog) Then
			If (ReturnTo Is AppActionDialogs) Then
				If (CurrentCLAItem.Origin = 2) Then
					CallSubDelayed2(requests3, "CamImage", CurrentCLAItem)
				else If (CurrentCLAItem.Origin = 3) Then
					CallSubDelayed2(CheckList3, "CamImage2", CurrentCLAItem)
				End If
			End If
		Else
			CallSubDelayed(MainMenu, "ListsReturnNoAction")
		End If
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

