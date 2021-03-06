B4A=true
Group=Main Forms
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
'ImageEdit
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

'******************************************************************************************************
' IT IS REQUIRED TO SAVE LAST PINPOINTNUMBER (PPNUMBER) SO IT CAN MAKE THE RIGHT SEQUENCE
' WHEN LOADING CURRENT ACTIVITY
'******************************************************************************************************

Sub Process_Globals
	Dim SaveRects As List
	Public PinPointNumber As Int = 0
	
	Public ShotFileLocation As String = File.DirInternal
	Public ShotFileName As String = ""
	Public Device As Phone
End Sub

Sub Globals
	Private ApplDialog As CustomLayoutDialog
	Private IntputTextField As FloatLabeledEditText
	Private StartMetric As Point
	Private xui As XUI
	Private smiley As B4XBitmap
	Private deg, vx = 10dip, vy = 10dip As Double
	Private SmileyRect As B4XRect
	Private size As Double = 40dip
	Private ImagePanel As B4XView
	Private DrawPanel As Panel
	Private PanelTemp As Panel
	Private cvs As B4XCanvas
	Private isB64Image As Boolean = False
	Private RetToCamera As Boolean = False
	
	Private UndoBMR As BMR
	
	Private DrawingCanvas As B4XCanvas
	Private UndoRect, DrawingRect, cvsRect As B4XRect
	Private sx, sy As Int
	Private CurrIndex  As Int = 0
	Private XPosis, YPosis As Int
	
	Private MarkerColorName As String = "blue"
	Private LineColor As Int = Colors.Blue
	Private LineWidth As Int = 3dip
	Private FontSize As Int = 16
	
	
	Private x0 = 50%x As Int                            ' original center x coordinate
	Private y0 = 50%y As Int                            ' original center y coordinate
	Private r0 = 50dip As Int                           ' original radius
	Private x1, y1 As Int
	Private CircleStroke = 3dip As Int        			' circle line thickness
	Private CircleColor As Int
	
	Private MakeUndo As Boolean = False
	Private PointsMap As List
	
	Private bCamera As Boolean = False
	Private bPencil As Boolean = False
	Private bRect As Boolean = False
	Private bCircle As Boolean = False
	Private bMarker As Boolean = False
	Private bText As Boolean = False
	Private bShot As Boolean = False
	Private bOCR As Boolean = False
	Private bBarcode As Boolean = False
	
	Private bb_BCBarcode As Boolean = False
	Private bb_BCQRCode As Boolean = False
	Private bb_BCStamp As Boolean = False
	Private bb_PINFoto As Boolean = False
	Private bb_PINMarker As Boolean = False
	Private bb_PINText As Boolean = False
	Private bb_PencilDistance As Boolean = False
	Private bb_PencilFree As Boolean = False
	Private bb_PencilLine As Boolean = False
	Private bb_Barcode As Boolean = False
	Private bb_OCRFindAll As Boolean = False
	Private bb_OCRFindSelect As Boolean = False
	'ButtonBCStates ButtonPencilStates ButtonOCRStates ButtonPINStates

	Private HideMe As Button
	Private ShowImage As ImageView
	Private ShowPanel As Panel
	Private butCircle As Button
	Private butMarker As Button
	Private butRect As Button
	Private butShot As Button
	Private butText As Button
	Private memoryLabel As Label
	Private ColorBlack As Button
	Private ColorBlue As Button
	Private ColorGrey As Button
	Private ColorOrange As Button
	Private ColorPanel As Panel
	Private ColorPurple As Button
	Private ColorRed As Button
	Private ColorYellow As Button
	Private ColorGreen As Button
	Private butCamera As Button
	Private butOCR As Button
	Private butBarcode As Button
	Private butOCRFindAll As Button
	Private butOCRFindSelect As Button
	Private OCROptPanel As Panel
	Private ColorWhite As Button
	Private TextField As EditText
	Private TextPanel As Panel
	Private HideText As Button
	Private butFont16 As Button
	Private butFont20 As Button
	Private butFont24 As Button
	Private butFont28 As Button
	Private butFont32 As Button
	Private butFont36 As Button
	Private FontPanel As Panel 'FontSize
	Private ColorPanelIndicator As Panel
	Private BarCodePanel As Panel
	Private BCBarcode As Button
	Private BCQRCode As Button
	Private BCStamp As Button
	Private butActions As Button
	Private butClose As Button
	Private butColors As Button
	Private butPencil As Button
	Private butSave As Button
	Private butUndo As Button
	Private PinPanel As Panel
	Private PINFoto As Button
	Private PINMarker As Button
	Private PINText As Button
	Private butFonts As Button
	Private ActionsPanel As Panel
	Private butPencilDistance As Button
	Private butPencilFree As Button
	Private butPencilLine As Button
	Private PencilPanel As Panel
	Private ImageView1 As ImageView
	Private butReset As Button
	Private butAcceptCrop As Button
	Private LockPanel As Panel

	Private isGrid As Boolean = False
	Private CurrentCLAItem As RequestCLAItem
	Private ExitToDialog As Boolean = False
	
	Private InnerCounter As Int = 0
	Private Touch_X As Int = 0, Touch_Y As Int = 0
	
	Private InnerCamShots As List '.Add(ShotFileName)
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'StartDraw(0)
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	InnerCamShots.Initialize '.Add(ShotFileName)
	CurrentCLAItem = Types.MakeRequestCLAItem("__REPO__", "__REPO__", "__REPO__", "__REPO__", "__REPO__", "__REPO__", 0,0,0,"", "", "", 2, 0, 0, "", _
							DBStructures.DB2CLATaskItem("", ""), "")
End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		butClose_Click
	End If
	Return True
End Sub

Sub RectChange(rtc As B4XRect, left As Int, top As Int, right As Int, bottom As Int)
	rtc.Left = left
	rtc.Top = top
	rtc.Right = right
	rtc.Bottom = bottom
End Sub

Sub RReferCreate(r As B4XRect) As RRefer
	Dim f As RRefer
	f.Initialize
	f.Top = r.Top
	f.Left = r.Left
	f.Right = r.Right
	f.Bottom = r.Bottom
	Return f
End Sub

Sub RRefer2B4XRect(r As RRefer) As B4XRect
	Dim f As B4XRect
	f.Initialize(r.Left,r.Top,r.Right,r.Bottom)
	Return f
End Sub

Sub BMRCreate(bmp As B4XBitmap, r As B4XRect) As BMR
	Dim b As BMR
	b.Initialize
	b.btm = bmp
	b.rct = RReferCreate( r )
	Return b
End Sub

Sub ParamStartBlock
	DrawingCanvas.Initialize(DrawPanel)
	DrawingRect.Initialize(0, 0, 0, 0)
	butPencil_Click
	ColorRed_Click 'ColorBlack_Click
	memoryLabel.Text = Utils.GetFreeMem
End Sub

Public Sub StartDraw(CLAItem As RequestCLAItem, Ex2Dlg As Boolean)
	ShotFileLocation = File.DirAssets
	isGrid = True
	
	ExitToDialog = Ex2Dlg
	ShotFileName = "grid.png"
	PinPointNumber = 0
	Activity.LoadLayout("ImageWindow")
	XPosis = 0
	YPosis = 0
	PointsMap.Initialize
	UndoRect.Initialize(0, 0, 0, 0)
	UndoBMR.Initialize
	
	'ImagePanel.SetBitmap(xui.LoadBitmapResize(File.DirAssets, "fundo.jpeg", Activity.Width, Activity.Height, False))
	'DrawPanel.SetBackgroundImage(xui.LoadBitmapResize(File.DirAssets, "fundo.jpeg", Activity.Width, Activity.Height, False))
	PanelTemp.Initialize("")
	SaveRects.Initialize

	cvs.Initialize(ImagePanel)
	cvsRect.Initialize(0,0,ImagePanel.Width, ImagePanel.Height)
	cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocation, ShotFileName, ImagePanel.Width, ImagePanel.Height, False), cvsRect)
	Dim DateName As String = Utils.MakeFileName
	
	'ESCRITA DA LATITUDE E LONGITUDE NA FOTO
	Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")

	DateName = $"${DateName} - ${sACLALatitude}/${sACLALongitude}"$
	cvs.DrawText(DateName, 10dip, cvs.TargetRect.Height-10dip, xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE), _
						xui.Color_DarkGray, "LEFT")
						
	Dim f As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE)
	Dim dRect As B4XRect 
	dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.TargetRect.Height-10dip, cvs.TargetRect.Left+210dip, cvs.TargetRect.Height)
	DrawTextWithBorder2(cvs, DateName, f, Consts.ColorDarkGray, (dRect.left+dRect.Right)/2, (dRect.Top+dRect.Bottom)/2, 0, 0)
	
	cvs.Invalidate
	
	Dim bm As B4XBitmap = cvs.CreateBitmap
	Dim img As BitmapCreator
	img.Initialize(cvsRect.Width, cvsRect.Height)
	img.DrawBitmap(bm, cvsRect, True)
	SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))
	
	'SaveRects.Add(BMRCreate(cvs.CreateBitmap, cvsRect))
	ParamStartBlock
End Sub

Public Sub StartDrawFrom(Filefolder As FileShot, CLAItem As RequestCLAItem) 'As String, filename As String)
	CurrentCLAItem = CLAItem
	RetToCamera = False
	ShotFileLocation = Filefolder.Folder
	ShotFileName = Filefolder.Filename
	ExitToDialog = True
	PinPointNumber = 0
	Activity.LoadLayout("ImageWindow")
	XPosis = 0
	YPosis = 0
	PointsMap.Initialize
	UndoRect.Initialize(0, 0, 0, 0)
	UndoBMR.Initialize
	
	PanelTemp.Initialize("")
	
	SaveRects.Initialize
	cvs.Initialize(ImagePanel)
	cvsRect.Initialize(0,0,ImagePanel.Width, ImagePanel.Height)
	cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocation, ShotFileName, ImagePanel.Width, ImagePanel.Height, False), cvsRect)
	
	Dim bm As B4XBitmap = cvs.CreateBitmap
	Dim img As BitmapCreator
	img.Initialize(cvsRect.Width, cvsRect.Height)
	img.DrawBitmap(bm, cvsRect, True)
	SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))
	ParamStartBlock
	'SaveRects.Add(BMRCreate(cvs.CreateBitmap, cvsRect))
End Sub

Public Sub StartDrawFrom2(ImgB64 As String, CLAItem As RequestCLAItem)
	CurrentCLAItem = CLAItem
	ExitToDialog = True
	ShotFileLocation = Starter.InternalFolder 
	ShotFileName = ImgB64
	PinPointNumber = 0
	Activity.LoadLayout("ImageWindow")
	XPosis = 0
	YPosis = 0
	PointsMap.Initialize
	UndoRect.Initialize(0, 0, 0, 0)
	UndoBMR.Initialize
	
	PanelTemp.Initialize("")
	
	SaveRects.Initialize
	cvs.Initialize(ImagePanel)
	cvsRect.Initialize(0,0,ImagePanel.Width, ImagePanel.Height)
	'cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocation, ShotFileName, ImagePanel.Width, ImagePanel.Height, False), cvsRect)
	cvs.DrawBitmap(Utils.B64ToBitmap(ShotFileName), cvsRect)
	
	Dim bm As B4XBitmap = cvs.CreateBitmap
	Dim img As BitmapCreator
	img.Initialize(cvsRect.Width, cvsRect.Height)
	img.DrawBitmap(bm, cvsRect, True)
	SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))
	
	'SaveRects.Add(BMRCreate(cvs.CreateBitmap, cvsRect))
	ParamStartBlock
End Sub

Public Sub StartDrawFrom3(ImgB64 As String, CLAItem As RequestCLAItem)
	RetToCamera = False
	isB64Image = True
	CurrentCLAItem = CLAItem
	ExitToDialog = True
	ShotFileLocation = Starter.InternalFolder
	ShotFileName = ImgB64
	PinPointNumber = 0
	Activity.LoadLayout("ImageWindow")
	XPosis = 0
	YPosis = 0
	PointsMap.Initialize
	UndoRect.Initialize(0, 0, 0, 0)
	UndoBMR.Initialize
	
	PanelTemp.Initialize("")
	
	SaveRects.Initialize
	cvs.Initialize(ImagePanel)
	cvsRect.Initialize(0,0,ImagePanel.Width, ImagePanel.Height)
	'cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocation, ShotFileName, ImagePanel.Width, ImagePanel.Height, False), cvsRect)
	cvs.DrawBitmap(Utils.B64ToBitmap(ShotFileName), cvsRect)
	
	Dim bm As B4XBitmap = cvs.CreateBitmap
	Dim img As BitmapCreator
	img.Initialize(cvsRect.Width, cvsRect.Height)
	img.DrawBitmap(bm, cvsRect, True)
	SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))
	
	'SaveRects.Add(BMRCreate(cvs.CreateBitmap, cvsRect))
	ParamStartBlock
End Sub

'*** code is identical from here ***
Sub Resize 'ignore
	cvs.Resize(DrawPanel.Width, DrawPanel.Height)
	cvs.ClearRect(cvs.TargetRect)
	cvs.Invalidate
End Sub

'CreatePIN(30, 35)
Sub CreatePIN(wsize As Int, hsize As Int) As B4XBitmap
	Return xui.LoadBitmapResize(File.DirAssets, "pins_" & MarkerColorName & ".png", wsize, hsize, False)
End Sub

Sub Timer1_Tick
	cvs.ClearRect(cvs.TargetRect)
	If SmileyRect.Right > cvs.TargetRect.Width Then
		vx = -Abs(vx)
	Else If SmileyRect.Left < 0 Then
		vx = Abs(vx)
	End If
	If SmileyRect.Bottom > cvs.TargetRect.Height Then
		vy = -Abs(vy)
	Else If SmileyRect.Top < 0 Then
		vy = Abs(vy)
	End If
	SmileyRect.Left = SmileyRect.Left + vx
	SmileyRect.Top = SmileyRect.Top + vy
	SmileyRect.Width = size
	SmileyRect.Height = size
	deg = deg + 1
	cvs.DrawBitmapRotated(smiley, SmileyRect, deg)
	
	cvs.Invalidate
End Sub

Sub PointMakeImg(X As Int, Y As Int) As Point
	Dim p As Point
	p.Initialize
	p.X=X
	p.Y=Y
	Return p
End Sub

Sub CreateLinePoints(lst As List, clear As Boolean, rct As B4XRect) As B4XPath
	Dim path As B4XPath
	'Dim l = 0, t = 0, r = 0, b = 0 As Int
	Dim rr As B4XRect
	rr.Initialize(0,0,0,0)
	For i = 0 To lst.Size-1
		Dim p As Point = lst.Get(i)
		If (i=0) Then
			rr.Left = p.X
			rr.Right = p.X
			rr.Top = p.Y
			rr.Bottom = p.Y
			path.Initialize(p.X, p.Y)
		Else
			path.LineTo(p.X, p.Y)
		End If
		If p.X < rr.Left Then rr.Left = p.X
		If p.X > rr.Right Then rr.Right = p.X
		If p.Y < rr.Top Then rr.Top = p.Y
		If p.Y > rr.Bottom Then rr.Bottom = p.Y
	Next
	If clear Then
		lst.Clear
	End If
	rct = rr
	Return path
End Sub

Sub SaveRectToUndo( rtc As B4XRect)
	UndoRect.Left = rtc.Left - LineWidth
	UndoRect.Top = rtc.Top - LineWidth
	UndoRect.Right = rtc.Right + LineWidth
	UndoRect.Bottom = rtc.Bottom + LineWidth
	RedimRect(UndoRect)
End Sub

Sub RedimRect(rtc As B4XRect)
	Dim L, T, R, B As Float
	L = rtc.Left
	T = rtc.Top
	R = rtc.Right
	B = rtc.Bottom
	If L > R Then
		L = R
		R = L + (rtc.Left - rtc.Right)
		rtc.Left = L
		rtc.Right = R
	End If
	
	If T > B Then
		T = B
		B = T + (rtc.Top - rtc.Bottom)
		rtc.Top = T
		rtc.Bottom = B
	End If
End Sub

Sub ClearUndoRect
	UndoRect.Left = 0
	UndoRect.Top = 0
	UndoRect.Right = 0
	UndoRect.Bottom = 0
	UndoRect.Width = 0
	UndoRect.Height = 0
End Sub

Sub isUndoRect As Boolean
	Return (UndoRect.Left < UndoRect.Right) And (UndoRect.top < UndoRect.Bottom)
End Sub

Sub DrawPanel_Touch (Action As Int, X As Float, Y As Float)
	Try
		DrawPanelTouch(Action, X, Y)
	Catch
		Log(LastException)
	End Try
End Sub 

Sub DrawPanelTouch (Action As Int, X As Float, Y As Float)
	
	'***********************************************************
	'	DOWN ACTION
	'***********************************************************
	If Action = DrawPanel.ACTION_DOWN Then
		If ((bRect) Or (bShot) Or (bText) Or (bPencil)) Then
			sx = X
			sy = Y
			If (bPencil) And (bb_PencilFree) Then
				PointsMap.Add( PointMakeImg(sx, sy) )
			else if (bPencil) And (bb_PencilDistance) Then
				StartMetric = PointMakeImg(sx, sy)
			End If
		else If ((bCircle)) Then
			x1 = X
			y1 = Y
		End If
	'***********************************************************
	'	UP ACTION
	'***********************************************************
	Else If Action = DrawPanel.ACTION_UP Then
		
		Dim bm As B4XBitmap = cvs.CreateBitmap
		If isUndoRect Then
			'ImageView1.SetBackgroundImage(bm.Crop(UndoRect.Left, UndoRect.Top, UndoRect.Width, UndoRect.Height))
			Dim ww As Int = UndoRect.Width
			Dim hh As Int = UndoRect.Height
			If ww = 0 Then
				ww = 1
				UndoRect.Width = ww
			End If
			If hh = 0 Then 
				hh = 1
				UndoRect.Height = hh
			End If
			SaveRects.Add(BMRCreate(bm.Crop(UndoRect.Left, UndoRect.Top, UndoRect.Width,hh), UndoRect))
		End If
		
		CurrIndex = CurrIndex + 1
				
		If ((bRect) Or (bShot) Or (bText) Or (bPencil)) Then
			If ((bRect)) Then
				cvs.DrawRect(DrawingRect, LineColor, False, LineWidth)
			else if ((bShot)) Then
				
				'
'				Dim bmp As B4XBitmap = cvs.CreateBitmap
'				Dim img As BitmapCreator
'				img.Initialize(DrawingRect.Width, DrawingRect.Height)
'				img.DrawBitmap(bmp, DrawingRect, True)
				ShowImage.SetBackgroundImage(bm.Crop(DrawingRect.Left, DrawingRect.Top, DrawingRect.Width, DrawingRect.Height))
				LockPanel.Visible = True
				ShowPanel.Visible = True
				
			Else if (bPencil) Then
				If (bb_PencilLine) Then
					Dim P As B4XPath
					P.Initialize(sx, sy)
					P.LineTo(X, Y)
					cvs.DrawPath(P, LineColor, False, LineWidth)
					'cvs.DrawLine
				Else If (bb_PencilDistance) Then
					Dim P As B4XPath
					P.Initialize(sx, sy)
					P.LineTo(X, Y)
					cvs.DrawPath(P, LineColor, False, LineWidth)
					'StartMetric = PointMakeImg(sx, sy)
					Dim TextoMedida As String = ""
					
					Dim sf As Object = ApplDialog.ShowAsync("Introduza a medida", "Continuar", "", "Cancelar", Null, False)
					Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
					ApplDialog.SetSize(350dip, 250dip)
					Wait For (sf) Dialog_Ready(pnl As Panel)
					pnl.LoadLayout("Dialog_Item_InputText")
					IntputTextField.Text = ""
					Wait For (sf) Dialog_Result(res As Int)
					If res = DialogResponse.POSITIVE Then
						TextoMedida = IntputTextField.Text
					End If
					Dim rRect As B4XRect
					rRect.Initialize(StartMetric.X, StartMetric.Y, X, Y)
					Dim f As B4XFont = xui.CreateFont(TextField.Typeface, FontSize)
					'DrawTextWithBorder(cvs, TextoMedida, f, LineColor, (rRect.left+rRect.Right)/2, (rRect.Top+rRect.Bottom)/2, 0, 0)
					DrawTextWithBorder3(cvs, TextoMedida, f, LineColor, (rRect.left+rRect.Right)/2, (rRect.Top+rRect.Bottom)/2)
					cvs.Invalidate
					
					StartMetric = PointMakeImg(0, 0)
				Else
					Dim P As B4XPath = CreateLinePoints(PointsMap, True, UndoRect)
					cvs.DrawPath(P, LineColor, False, LineWidth)
					
					'cvs.DrawLine(sx, sy, X, Y, LineColor, LineWidth)
				End If
			Else
				DrawPanelText
			End If
		Else If ((bCircle)) Then
			x0 = X
			y0 = Y
			DrawingRect.Left = x1
			DrawingRect.Top = y1
			DrawingRect.Right = x0
			DrawingRect.Bottom = y0
			r0 = Sqrt(Power(x0 - x1, 2) + Power(y0 - y1, 2))
			cvs.DrawCircle(x1, y1, r0, LineColor, False, CircleStroke)
			x0 = x1
			y0 = y1
		Else If ((bMarker)) Then
			'If Action = DrawPanel.ACTION_UP Then
				
'				XPosis = X
'				YPosis = Y
'				Dim bm As B4XBitmap = cvs.CreateBitmap
'				Dim img As BitmapCreator
'				img.Initialize(cvsRect.Width, cvsRect.Height)
'				Dim ss As String = img.DrawBitmap(bm, cvsRect, True)
			
			CurrIndex = CurrIndex + 1
				
			DrawPanelClick(X, Y)
				
			CheckStates
			'MakeUndo
			'End If
		Else If ((bCamera)) Then
			CurrIndex = CurrIndex + 1	
			InnerCounter = InnerCounter + 1
			Touch_X = X
			Touch_Y = Y
			CallSubDelayed2(CameraActivity_InnerShot, "StartCameraInner", InnerCounter )
			CheckStates
		End If
		
		DrawingCanvas.ClearRect(DrawingCanvas.TargetRect)
		ClearUndoRect
		CheckStates
	'***********************************************************
	'	MOVE ACTION
	'***********************************************************
	Else
		If Action = DrawPanel.ACTION_MOVE Then
			
			DrawingCanvas.ClearRect(DrawingCanvas.TargetRect)
'			cvs.ClearRect(cvs.TargetRect)
			
			If ((bRect) Or (bShot) Or (bText)) Then
				'If Action = DrawPanel.ACTION_MOVE Then
				DrawingRect.Left = Min(sx, X)
				DrawingRect.Right = Max(sx, X)
				DrawingRect.Top = Min(sy, Y)
				DrawingRect.Bottom = Max(sy, Y)
				DrawingCanvas.DrawRect(DrawingRect, Colors.White, False, LineWidth)
'				cvs.DrawRect(DrawingRect, Colors.White, False, LineWidth)
				SaveRectToUndo(DrawingRect)
				'End If
			Else if (bPencil) Then
				PointsMap.Add( PointMakeImg(X, Y) )
				Dim R As B4XRect
				R.Initialize(sx, sy, X, Y)
				DrawingCanvas.ClearRect(R)
'				cvs.ClearRect(R)
				SaveRectToUndo(R)
				
				If (bb_PencilLine) Or (bb_PencilDistance) Then
					Dim P As B4XPath
					P.Initialize(sx, sy)
					P.LineTo(X, Y)
					DrawingCanvas.DrawPath(P, Colors.White, False, LineWidth)
'					cvs.DrawPath(P, Colors.White, False, LineWidth)
				Else
					Dim P As B4XPath = CreateLinePoints(PointsMap, False, R)
					SaveRectToUndo(R)
					DrawingCanvas.DrawPath(P, Colors.White, False, LineWidth)
'					cvs.DrawPath(P, Colors.White, False, LineWidth)
					'DrawingCanvas.DrawLine(sx, sy, X, Y, Colors.White, LineWidth)
				End If
			else If ((bCircle)) Then
				DrawingRect.Left = x1
				DrawingRect.Right = X
				DrawingRect.Top = y1
				DrawingRect.Bottom = Y
				SaveRectToUndo(DrawingRect)
				x0 = X
				y0 = Y
				r0 = Sqrt(Power(x0 - x1, 2) + Power(y0 - y1, 2))
				'DrawingCanvas.ClearRect(DrawingCanvas.TargetRect)
				DrawingCanvas.DrawCircle(x1, y1, r0, Colors.White, False, CircleStroke)
'				cvs.DrawCircle(x1, y1, r0, Colors.White, False, CircleStroke)
				
			End If
			DrawPanel.Invalidate
		End If
	End If
	memoryLabel.Text = Utils.GetFreeMem
End Sub

Sub CheckStates
	MakeUndo = SaveRects.Size > 1
	butUndo.Enabled = MakeUndo
End Sub

Sub DrawPanelClick(X As Int, Y As Int)
	If ((bMarker)) Then
		Log("Marker: " & X & ":" & Y)
		Dim bm As B4XBitmap = CreatePIN(30, 60)
		Dim rr As B4XRect
		rr.Initialize( X-(bm.Width/2), Y-bm.Height, (X-(bm.Width/2))+bm.Width, (Y-bm.Height)+bm.Height)
		SaveRectToUndo(rr)
		
		Dim bmr As B4XBitmap = cvs.CreateBitmap
		'ImageView1.SetBackgroundImage(bmr.Crop(UndoRect.Left, UndoRect.Top, UndoRect.Width, UndoRect.Height))
		SaveRects.Add(BMRCreate(bmr.Crop(UndoRect.Left, UndoRect.Top, UndoRect.Width, UndoRect.Height), UndoRect))

		cvs.DrawBitmap(bm, rr)
		cvs.Invalidate
		ClearUndoRect
	Else
		
		Log("Others")
	End If
	memoryLabel.Text = Utils.GetFreeMem
End Sub

Sub DrawPanelText
	If ((bText)) Then
		TextPanel.Visible=True
		TextField.RequestFocus
	End If
'	memoryLabel.Text = Utils.GetFreeMem
End Sub

Sub Button1_Click
	'
End Sub

Sub HideMe_Click
	ShowPanel.Visible= False
	LockPanel.Visible = False
	'cvs.DrawBitmap(ShowImage.Bitmap,cvsRect)
	'cvs.DrawBitmap(UndoBMR.btm,RRefer2B4XRect(UndoBMR.rct))
	Try
		ShowImage.Bitmap = Null
	Catch
		Log(LastException)
	End Try
End Sub

Sub ShowImage_Click
'	CurrIndex = SaveRects.Size-1
'	UndoBMR = SaveRects.Get( CurrIndex )
'	'cvs.DrawBitmap(UndoBMR.bitm,UndoBMR.rect)
'	
'	'Dim bm As B4XBitmap = b.bitm
'	'Dim br As B4XRect = b.rct
'	'cvs.DrawBitmap(bm,cvsRect)
'	If CurrIndex >= 1 Then
'		SaveRects.RemoveAt( CurrIndex )
'	End If
'	
'	Log("load from undo: " & RRefer2B4XRect(UndoBMR.rct))
'	
'	ShowImage.SetBackgroundImage(UndoBMR.btm)
'	LockPanel.Visible = False
'	memoryLabel.Text = GetFreeMem
End Sub

Sub ButtonStates
'	butCamera.Color = Colors.ARGB( 155, 78, 151, 255 )
'	bCamera = False
	
	butShot.Color = Colors.ARGB( 155, 78, 151, 255 )
	bShot = False
	butRect.Color = Colors.ARGB( 155, 78, 151, 255 )
	bRect = False
	butCircle.Color = Colors.ARGB( 155, 78, 151, 255 )
	bCircle = False
	butMarker.Color = Colors.ARGB( 155, 78, 151, 255 )
	bMarker = False
	butText.Color = Colors.ARGB( 155, 78, 151, 255 )
	bText = False
	butOCR.Color = Colors.ARGB( 155, 78, 151, 255 )
	bOCR = False
	butBarcode.Color = Colors.ARGB( 155, 78, 151, 255 )
	bBarcode = False
	butPencil.Color = Colors.ARGB( 155, 78, 151, 255 )
	bPencil = False
	
	butCamera.Color = Colors.ARGB( 155, 0, 155, 255 )
	bCamera = False
	
	PencilPanel.Visible = False
	ColorPanel.Visible = False
	OCROptPanel.Visible = False
	FontPanel.Visible = False
	PinPanel.Visible = False
	BarCodePanel.Visible = False
	ActionsPanel.Visible = False
End Sub

Sub ButtonFontStates
	butFont16.Color = Colors.ARGB( 150, 119, 218, 255 )
	butFont20.Color = Colors.ARGB( 150, 119, 218, 255 )
	butFont24.Color = Colors.ARGB( 150, 119, 218, 255 )
	butFont28.Color = Colors.ARGB( 150, 119, 218, 255 )
	butFont32.Color = Colors.ARGB( 150, 119, 218, 255 )
	butFont36.Color = Colors.ARGB( 150, 119, 218, 255 )
	'FontPanel.Visible = False
	'FontSize
	'ARGB( 150, 2, 102, 143 )
End Sub

Sub ButtonPencilStates
	butPencilFree.Color = Colors.ARGB( 150, 119, 218, 255 )
	butPencilDistance.Color = Colors.ARGB( 150, 119, 218, 255 )
	butPencilLine.Color = Colors.ARGB( 150, 119, 218, 255 )
	'ARGB( 150, 2, 102, 143 )
	bb_PencilDistance = False
	bb_PencilFree = False
	bb_PencilLine = False
End Sub

Sub ButtonOCRStates
	butOCRFindAll.Color = Colors.ARGB( 150, 119, 218, 255 )
	butOCRFindSelect.Color = Colors.ARGB( 150, 119, 218, 255 )
	'ARGB( 150, 2, 102, 143 )
	bb_OCRFindAll = False
	bb_OCRFindSelect = False
End Sub

Sub ButtonPINStates
	PINFoto.Color = Colors.ARGB( 150, 119, 218, 255 )
	PINText.Color = Colors.ARGB( 150, 119, 218, 255 )
	PINMarker.Color = Colors.ARGB( 150, 119, 218, 255 )
	'ARGB( 150, 2, 102, 143 )
	bb_PINFoto = False
	bb_PINMarker = False
	bb_PINText = False
End Sub

Sub ButtonBCStates
	BCBarcode.Color = Colors.ARGB( 150, 119, 218, 255 )
	BCQRCode.Color = Colors.ARGB( 150, 119, 218, 255 )
	BCStamp.Color = Colors.ARGB( 150, 119, 218, 255 )
	'ARGB( 150, 2, 102, 143 )
	bb_BCBarcode = False
	bb_BCQRCode = False
	bb_BCStamp = False
End Sub

Sub setButtonState(but As Button) As Boolean
	but.Color = Colors.ARGB( 155, 36, 88, 163 )
	ActionsPanel.Visible = False
	Return True
End Sub

Sub butCamera_Click
	ButtonStates
	'CropView1.RectState
	bCamera = setButtonState(butCamera)
	DrawingRect.Initialize(0, 0, 0, 0)
	
'	If Not(bCamera) Then
'		bCamera = True
'	End If
	
'	bCamera = setButtonState(butCamera)
'	DrawingRect.Initialize(0, 0, 0, 0)
'	butCamera.Color = Colors.ARGB( 155, 78, 151, 255 )
'	bCamera = False
End Sub

Sub butShot_Click 'crop
	ButtonStates
	'CropView1.ShotState
	bShot = setButtonState(butShot)
	DrawingRect.Initialize(0, 0, 0, 0)
End Sub

Sub butPencil_Click
	ButtonStates
	'CropView1.ShotState
	bPencil = setButtonState(butPencil)
	DrawingRect.Initialize(0, 0, 0, 0)
	PencilPanel.Visible = True
	butPencilFree_Click
End Sub

Sub butRect_Click
	ButtonStates
	'CropView1.RectState
	bRect = setButtonState(butRect)
	DrawingRect.Initialize(0, 0, 0, 0)
End Sub

Sub butText_Click
	ButtonStates
	'CropView1.ShotState
	bText = setButtonState(butText)
End Sub

Sub butMarker_Click
	ButtonStates
	'CropView1.ShotState
	bMarker = setButtonState(butMarker)
	PinPanel.Visible = True
End Sub

Sub butCircle_Click
	ButtonStates
	'CropView1.ShotState
	bCircle = setButtonState(butCircle)
	'DrawingRect.Initialize(x0 - r0 - CircleStroke, y0 - r0 - CircleStroke, x0 + r0 + CircleStroke, y0 + r0 + CircleStroke)
	DrawingRect.Initialize(0, 0, 0, 0)
End Sub

Sub butOCR_Click
	ButtonStates
	'CropView1.ShotState
	bOCR = setButtonState(butOCR)
	DrawingRect.Initialize(0, 0, 0, 0)
	OCROptPanel.Visible = True
	butOCRFindSelect_Click
End Sub

Sub butBarcode_Click
	ButtonStates
	'CropView1.ShotState
	bBarcode = setButtonState(butBarcode)
	DrawingRect.Initialize(0, 0, 0, 0)
	BarCodePanel.Visible = True
	BCBarcode_Click
End Sub


Sub ColorYellow_Click
	LineColor = Colors.Yellow
	MarkerColorName = "yellow"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub ColorRed_Click
	LineColor = Colors.Red
	MarkerColorName = "red"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub ColorPurple_Click
	LineColor = Colors.RGB(174, 74, 132)
	MarkerColorName = "purple"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub ColorOrange_Click
	LineColor = Colors.RGB(239, 127, 26)
	MarkerColorName = "orange"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub ColorGrey_Click
	LineColor = Colors.Gray
	MarkerColorName = "grey"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub ColorBlue_Click
	LineColor = Colors.Blue
	MarkerColorName = "blue"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub ColorBlack_Click
	LineColor = Colors.Black
	MarkerColorName = "black"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub ColorGreen_Click
	LineColor = Colors.Green
	MarkerColorName = "green"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub ColorWhite_Click
	LineColor = Colors.White
	MarkerColorName = "white"
	ColorPanelIndicator.Color = LineColor
	ColorPanel.Visible = False
End Sub

Sub butOCRFindSelect_Click
	ButtonOCRStates
	butOCRFindSelect.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_OCRFindSelect = True
End Sub

Sub butOCRFindAll_Click
	ButtonOCRStates
	butOCRFindAll.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_OCRFindAll = True
End Sub

Sub TextField_EnterPressed
	Dim f As B4XFont = xui.CreateFont(TextField.Typeface, FontSize)
	DrawTextWithBorder(cvs, TextField.Text, f, LineColor, (DrawingRect.left+DrawingRect.Right)/2, (DrawingRect.Top+DrawingRect.Bottom)/2, 0, 0)
	cvs.Invalidate
	HideText_Click
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

Sub DrawTextWithBorder3 (cvs1 As B4XCanvas, Text As String, Fnt As B4XFont, Clr As Int, CenterX As Int, CenterY As Int)
	Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)
	r.Height = r.Height + (r.Height /2) + 5dip
	r.Width = r.Width + (r.Width /2) + 5dip ' * 2
	Dim baseline As Int = CenterY - ((r.Height - Fnt.Size)/2) - r.Top
	r.Initialize(CenterX - r.Width / 2, CenterY - r.Height / 2, CenterX + r.Width / 2, CenterY + r.Height / 2)
	cvs1.DrawRect(r, Consts.ColorWhite, True, 0)
	cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr, "CENTER")
End Sub

Sub HideText_Click
	ButtonFontStates
	TextPanel.Visible=False
	DrawingRect.Initialize(0, 0, 0, 0)
	
End Sub

Sub butFont36_Click
	ButtonFontStates
	butFont36.Color = Colors.ARGB( 150, 2, 102, 143 )
	FontSize = 36
	FontPanel.Visible = False
End Sub

Sub butFont32_Click
	ButtonFontStates
	butFont32.Color = Colors.ARGB( 150, 2, 102, 143 )
	FontSize = 32
	FontPanel.Visible = False
End Sub

Sub butFont28_Click
	ButtonFontStates
	butFont28.Color = Colors.ARGB( 150, 2, 102, 143 )
	FontSize = 28
	FontPanel.Visible = False
End Sub

Sub butFont24_Click
	ButtonFontStates
	butFont24.Color = Colors.ARGB( 150, 2, 102, 143 )
	FontSize = 24
	FontPanel.Visible = False
End Sub

Sub butFont20_Click
	ButtonFontStates
	butFont20.Color = Colors.ARGB( 150, 2, 102, 143 )
	FontSize = 20
	FontPanel.Visible = False
End Sub

Sub butFont16_Click
	ButtonFontStates
	butFont16.Color = Colors.ARGB( 150, 2, 102, 143 )
	FontSize = 16
	FontPanel.Visible = False
End Sub

Sub butColors_Click
	If ColorPanel.Visible = True Then
		ColorPanel.Visible = False
	Else
		ColorPanel.Visible = True
	End If
End Sub

Sub butActions_Click
	If ActionsPanel.Visible = True Then
		ActionsPanel.Visible = False
	Else
		ActionsPanel.Visible = True
	End If
End Sub

Sub butFonts_Click
	If FontPanel.Visible = True Then
		FontPanel.Visible = False
	Else
		FontPanel.Visible = True
	End If
End Sub

Sub BCStamp_Click
	ButtonBCStates
	BCStamp.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_BCStamp = True
End Sub

Sub BCQRCode_Click
	ButtonBCStates
	BCQRCode.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_BCQRCode = True
End Sub

Sub BCBarcode_Click
	ButtonBCStates
	BCBarcode.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_Barcode = True
End Sub

Sub PINText_Click
	ButtonPINStates
	PINText.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_PINText = True
End Sub

Sub PINMarker_Click
	ButtonPINStates
	PINMarker.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_PINMarker = True
End Sub

Sub PINFoto_Click
	ButtonPINStates
	PINFoto.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_PINFoto = True
End Sub

Sub butPencilLine_Click
	ButtonPencilStates
	butPencilLine.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_PencilLine = True
End Sub

Sub butPencilFree_Click
	ButtonPencilStates
	butPencilFree.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_PencilFree = True
End Sub

Sub butPencilDistance_Click
	ButtonPencilStates
	butPencilDistance.Color = Colors.ARGB( 150, 2, 102, 143 )
	bb_PencilDistance = True
End Sub

Sub butUndo_Click
	If SaveRects.Size >1 Then
		'Dim bm As B4XBitmap = SaveRects.Get( SaveRects.Size-1 )
		UndoBMR = SaveRects.Get( SaveRects.Size-1 )
		cvs.DrawBitmap(UndoBMR.btm,RRefer2B4XRect(UndoBMR.rct))
		'Log("load from undo: " & RRefer2B4XRect(UndoBMR.rct))
		SaveRects.RemoveAt( SaveRects.Size-1 )
	End If
	memoryLabel.Text = Utils.GetFreeMem
	CheckStates
End Sub

Sub butSave_Click
	Dim theFile As String = ShotFileName
	If (ShotFileLocation = File.DirAssets) Then ShotFileLocation = Starter.InternalFolder
	If (isB64Image) Then
		theFile = $"IMG-${Utils.MakeFileName}-000.png"$
		CurrentCLAItem.Value = "IMG_B64_EDIT"
	End If
	
	Dim Out As OutputStream = File.OpenOutput(ShotFileLocation, theFile, False)
	cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
	cvs.Release
	Out.Close
	
'	RetToCamera = False
'	isB64Image = True
'	CurrentCLAItem = CLAItem
'	ExitToDialog = True
	
	If (ExitToDialog) Then
		
		Dim ma As AppActionDialogs
		ma.Initialize
		Try
			ma.CameraReturn(theFile, CurrentCLAItem)
		Catch
			Log(LastException)
		End Try
		Sleep(1000)
		If (CurrentCLAItem.Origin = 1) Then
			CallSubDelayed2(User, "CallMOREActionsAgain", CurrentCLAItem)
		else If (CurrentCLAItem.Origin = 2) Then
			CallSubDelayed2(requests3, "CamImage", CurrentCLAItem)
		else If (CurrentCLAItem.Origin = 3) Then
			CallSubDelayed2(CheckList3, "CamImage2", CurrentCLAItem)
		else If (CurrentCLAItem.Origin = 4) Then
			CallSubDelayed2(CameraActivity2, "CamImage", CurrentCLAItem)
		Else
		End If
	Else
		Dim this As RequestCLAItem = CurrentCLAItem
		Dim Base64Con As Base64Convert
		Base64Con.Initialize
		Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"${theFile}"$)
		'|
		Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3 + 1000000 'id, ${maxid},
		Dim sSQL As String = $"insert into dta_requests_values_images 
					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report,
					repeatcounter, repeatitemcounter, repeatfieldcounter)
					values (${maxid}, '${this.Request}', '${this.Action}', '${this.Task}', '${this.Item}', '${this.UniqueKey}', '${this.Tagcode}',
					'${ImgB64}', '${theFile}', 1,
					${this.RepeatCounter}, ${this.RepeatItemCounter}, ${this.repeatfieldcounter})"$
		Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)

		Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
		Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
		Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal, 
				origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
				values (${mID}, '${alerttagcode}', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', 1, 1, 'Imagens adicionadas ao repositório por utilizar.', 
				'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
		Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		
		Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts_images", "id", "") + 1+ 1000000
		Dim sSQL As String = $"insert into dta_alerts_images
					(id, tagcode, imageb64, imagename, assigned)
					values (${mID}, '${alerttagcode}', '${ImgB64}', '${theFile}', 0)"$
		Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		
		Dim ApiList As List
		ApiList.Initialize
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
		'Utils.CallApi(0, params, Me, "https://demo.${ShareCode.APPL_HOST}/api/orion/alert/new")
		'Sleep(250)
		
		'InnerCamShots.Add(FileName)
		
		CallSubDelayed3(MainMenu, "ListsReturnUpdateServer", $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/alert/new"$, ApiList)
		'CallSubDelayed2(MainMenu, "ListsReturn", "ImageEdit")
		'CallSub2(MainMenu, "ListsReturn", "")
		
	End If
	
	Activity.Finish
	'ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub ForceClose
	Activity.Finish
	'ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

'Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As String, Fnt As B4XFont, Clr As Int, CenterX As Int, CenterY As Int)
'   Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)
'   Dim BaseLine As Int = CenterY - r.Height / 2 - r.Top
'   cvs1.DrawText(Text, CenterX, BaseLine, Fnt, Clr, "CENTER")
'   'cvs1.DrawCircle(CenterX, CenterY, 3dip, xui.Color_Blue, True, 0)
'   r.Initialize(CenterX - r.Width / 2, CenterY - r.Height / 2, CenterX + r.Width / 2, CenterY + r.Height / 2)
'   cvs1.DrawLine(r.Left, BaseLine, r.Right, BaseLine, xui.Color_Gray, 1dip)
'   cvs1.DrawRect(r, xui.Color_Gray, False, 2dip)
'End Sub

Public Sub SaveInnerShot(FileName As String) ', this As RequestCLAItem)
	Dim this As RequestCLAItem = CurrentCLAItem
	Dim theCounter As Int = InnerCounter
	Dim f As B4XFont = xui.CreateFont(TextField.Typeface, 22)
	
	'Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As String, Fnt As B4XFont, Clr As Int, CenterX As Int, CenterY As Int, border As Int, bline As Int)
	'Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As String, Fnt As B4XFont, Clr As Int, CenterX As Int, CenterY As Int, border As Int, bline As Int)
	DrawTextWithBorder2(cvs, theCounter, f, LineColor, Touch_X, Touch_Y, 2, 0)
'	cvs.Invalidate
	
	If Not(Utils.isNullOrEmpty(FileName)) Then
		If Not(FileName.IndexOf(".png") >= 0) Then
			FileName = $"${FileName}.png"$
		End If
		Dim Base64Con As Base64Convert
		Base64Con.Initialize
		Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"${FileName}"$)

		'|
		Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3 + 1000000 'id, ${maxid},
		Dim sSQL As String = $"insert into dta_requests_values_images	
					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report,
					repeatcounter, repeatitemcounter, repeatfieldcounter)
					values (${maxid}, '${this.Request}', '${this.Action}', '${this.Task}', '${this.Item}', '${this.UniqueKey}', '${this.Tagcode}',
					'${ImgB64}', '${FileName}', 1,
					${this.RepeatCounter}, ${this.RepeatItemCounter}, ${this.repeatfieldcounter})"$
		
		Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		InnerCamShots.Add(FileName)
	End If
	cvs.Invalidate
End Sub

Sub butClose_Click
	Dim i As Int
	i = Msgbox2(ShareCode.ExitEditNotSaved, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_CANCEL, "", Null)
	If (i=DialogResponse.POSITIVE) Then
		If (ExitToDialog) Then
'			Dim ma As AppActionDialogs
'			ma.Initialize
'			ma.CameraReturn(ShotFileName, CurrentCLAItem)
			If (CurrentCLAItem.Origin = 1) Then
				CallSubDelayed2(User, "CallMOREActionsAgain", CurrentCLAItem)
			Else If (CurrentCLAItem.Origin = 2) Then
				CallSubDelayed2(requests3, "CamImage", CurrentCLAItem)
			Else If (CurrentCLAItem.Origin = 3) Then
				CallSubDelayed2(CheckList3, "CamImage2", CurrentCLAItem)
			Else If (CurrentCLAItem.Origin = 4) Then
				CallSubDelayed2(CameraActivity2, "CamImage", CurrentCLAItem)
			End If
		End If
		Activity.Finish
	Else If (i=DialogResponse.NEGATIVE) Then
		
	Else
	End If
	
End Sub

Sub butReset_Click
	UndoBMR = SaveRects.Get( 0 )
	cvs.DrawBitmap(UndoBMR.btm,RRefer2B4XRect(UndoBMR.rct))
	'Log("load from undo: " & RRefer2B4XRect(UndoBMR.rct))
	SaveRects.Clear
	
	Dim img As BitmapCreator
	img.Initialize(cvsRect.Width, cvsRect.Height)
	img.DrawBitmap(cvs.CreateBitmap, cvsRect, True)
	SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))
End Sub

Sub butAcceptCrop_Click
	Try
		TryToCrop
	Catch
		MsgboxAsync("Não foi possível efectuar o CROP! Tente novamente sff.", "Alerta!")
	End Try
End Sub

Sub TryToCrop
	Dim bm As B4XBitmap = ShowImage.Bitmap
	'RectChange(cvsRect, 0, 0, bm.Width, bm.Height)
	RectChange(cvsRect, 0,0,ImagePanel.Width, ImagePanel.Height)
	
	cvs.DrawBitmap(bm, cvsRect)
	Dim la As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Dim lo As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
	cvs = Utils.DTGEOSave2Canvas(cvs, la, lo)
'	cvs.RemoveClip
	SaveRects.Clear
	SaveRects.Add(BMRCreate(bm, cvsRect))
	ShowPanel.Visible= False
	LockPanel.Visible = False
	ShowImage.Bitmap = Null
	'memoryLabel.Text = Utils.GetFreeMem
End Sub