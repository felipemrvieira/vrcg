B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@

Sub Process_Globals
	Private frontCamera As Boolean = False
	Private detector As JavaObject
	Private SearchForBarcodes As Boolean
	Private LastPreview As Long
	Private IntervalBetweenPreviewsMs As Int = 500
End Sub

Sub Globals
	Private Panel1 As Panel
	Private camEx As CameraExClass
	Private pnlDrawing As Panel
	Private cvs As B4XCanvas
	Private ScanOnlyOne As Boolean
	Private btnCancel As Button
	Private btnClear As Button
	Private txt2set As FloatLabeledEditText
	Private PassedAct As String
	Private ListaCodigosLidos As CustomListView
	Private BarcodeString As Label
	Private BarCodeState As Label
	Private BarCodeCheck As CheckBox
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("scanner")
	
	If ShareCode.ClearBarcodeList = True Then
		ShareCode.ScanList.Clear
		ListaCodigosLidos.Clear
	End If
	
	If FirstTime Then
		CreateDetector (Array("ALL_FORMATS"))
	End If
	cvs.Initialize(pnlDrawing)
	ShareCode.ScanList.Initialize
End Sub

Sub StartScanning(act As String, view2set As FloatLabeledEditText)
	ScanOnlyOne = ShareCode.SingleScan
	txt2set = view2set
	PassedAct = act
End Sub

Sub StartScanningSingle(act As String)
	ListaCodigosLidos.AsView.Visible = False
	ShareCode.Flag2CompareCodes = False
	btnClear.Visible = False
	ScanOnlyOne = ShareCode.SingleScan
	PassedAct = act
End Sub

Sub StarScanningMulti(act As String)
	ListaCodigosLidos.AsView.Visible = True
	ShareCode.Flag2CompareCodes = False
	btnClear.Visible = True
	ScanOnlyOne = False
	PassedAct = act
End Sub

Sub StarScanningMulti2Compare(act As String)
	ListaCodigosLidos.AsView.Visible = True
	ShareCode.Flag2CompareCodes = True
	btnClear.Visible = True
	ScanOnlyOne = False
	PassedAct = act
End Sub


Sub Return2Activity
	If PassedAct = "CheckList3" Then
		CallSubDelayed2(CheckList3,"returnedFromScanner",txt2set)
		Activity.Finish
	Else If PassedAct = "requests3" Then
		CallSubDelayed(requests3, "returnedFromScanner")
		Activity.Finish
	Else If PassedAct = "MainMenu" Then
		CallSubDelayed(MainMenu, "returnedFromScanner")
		Activity.Finish
	else if PassedAct = "CalledFromChapter" Then
		CallSubDelayed(CheckList3,"returnedFromScanner2")
		Activity.Finish
	End If
End Sub

Private Sub CreateDetector (Codes As List)
	Dim ctxt As JavaObject
	ctxt.InitializeContext
	Dim builder As JavaObject
	builder.InitializeNewInstance("com/google/android/gms/vision/barcode/BarcodeDetector.Builder".Replace("/", "."), Array(ctxt))
	Dim barcodeClass As String = "com/google/android/gms/vision/barcode/Barcode".Replace("/", ".")
	Dim barcodeStatic As JavaObject
	barcodeStatic.InitializeStatic(barcodeClass)
	Dim format As Int
	For Each formatName As String In Codes
		format = Bit.Or(format, barcodeStatic.GetField(formatName))
	Next
	builder.RunMethod("setBarcodeFormats", Array(format))
	detector = builder.RunMethod("build", Null)
	Dim operational As Boolean = detector.RunMethod("isOperational", Null)
	Log("Is detector operational: " & operational)
	SearchForBarcodes = operational
	
End Sub

Sub ScanCamera_Preview (data() As Byte)
	If SearchForBarcodes Then
		If DateTime.Now > LastPreview + IntervalBetweenPreviewsMs Then
			'Dim n As Long = DateTime.Now
			cvs.ClearRect(cvs.TargetRect)
			Dim frameBuilder As JavaObject
			Dim bb As JavaObject
			bb = bb.InitializeStatic("java.nio.ByteBuffer").RunMethod("wrap", Array(data))
			frameBuilder.InitializeNewInstance("com/google/android/gms/vision/Frame.Builder".Replace("/", "."), Null)
			Dim cs As CameraSize = camEx.GetPreviewSize
			frameBuilder.RunMethod("setImageData", Array(bb, cs.Width, cs.Height,  842094169))
			Dim frame As JavaObject = frameBuilder.RunMethod("build", Null)
			Dim SparseArray As JavaObject = detector.RunMethod("detect", Array(frame))
			LastPreview = DateTime.Now
			Dim Matches As Int = SparseArray.RunMethod("size", Null)
			For i = 0 To Matches - 1
				Dim barcode As JavaObject = SparseArray.RunMethod("valueAt", Array(i))
				Dim raw As String = barcode.GetField("rawValue")
'				Log(raw)
				
				
				If ShareCode.SingleScan Then
					ShareCode.ScanList.Clear
					ShareCode.ScanList.Add(raw)
					Sleep(500)
'					Log("Barcode:" & ShareCode.ScanList)
					Return2Activity
				Else
					If ShareCode.AllowScanDuplicates Then
						ShareCode.ScanList.Add(raw)
						ListaCodigosLidos.Add(createListaItem(raw,False,2,50dip), "")
					Else
						Dim found As Boolean = False
						For x=0 To ShareCode.ScanList.Size -1
							Dim codeinlist As String = ShareCode.ScanList.Get(x)
							If codeinlist = raw Then
								found = True
							End If
						Next
						If Not(found) Then
							ShareCode.ScanList.Add(raw)
							ListaCodigosLidos.Add(createListaItem(raw,False,2,50dip),"")
'							Log("Barcode:" & ShareCode.ScanList)
						End If
						
					End If
					
					'COMPARE CODE WITH LIST if Flag2compare is true
					If ShareCode.Flag2CompareCodes Then
						Log($"code to compare with list = ${raw}"$)
						If ShareCode.ListOfCodes2Compare.Size > 0 Then
							ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
							For a=0 To ShareCode.ListOfCodes2Compare.size -1
								If ShareCode.ListOfCodes2Compare.Get(a) = raw Then
									For i=0 To ListaCodigosLidos.Size -1
										Dim pnl As Panel = ListaCodigosLidos.GetPanel(i)
										Dim check_box As CheckBox = pnl.GetView(0)
										Dim lbl_state As Label = pnl.GetView(1)
										Dim lbl_barcode As Label  = pnl.GetView(2)
							
										If lbl_barcode.Text.Trim = raw Then
											lbl_state.Text = Chr(0xF00C)
											lbl_state.TextColor = Colors.Green
										End If
									Next
								Else
									For i=0 To ListaCodigosLidos.Size -1
										Dim pnl As Panel = ListaCodigosLidos.GetPanel(i)
										Dim check_box As CheckBox = pnl.GetView(0)
										Dim lbl_state As Label = pnl.GetView(1)
										Dim lbl_barcode As Label  = pnl.GetView(2)
							
										If lbl_barcode.Text.Trim = raw Then
											lbl_state.Text = Chr(0xF00D)
											lbl_state.TextColor = Colors.red
										End If
									Next
								End If
							Next
							ProgressDialogHide
						End If

					End If
				End If
				
				ToastMessageShow(ShareCode.ScanList, True)
				
				Dim points() As Object = barcode.GetField("cornerPoints")
				Dim tl As JavaObject = points(0)
'				Dim tr As JavaObject = points(1)
				Dim br As JavaObject = points(2)
'				Dim bl As JavaObject = points(3)
				Dim r As B4XRect
				
				Dim size As CameraSize = camEx.GetPreviewSize
				Dim xscale, yscale As Float
				If camEx.PreviewOrientation Mod 180 = 0 Then
					xscale = Panel1.Width / size.Width
					yscale = Panel1.Height / size.Height
					r.Initialize(tl.GetField("x"), tl.GetField("y"), br.GetField("x"), br.GetField("y"))
				Else
					xscale = Panel1.Width / size.Height
					yscale = Panel1.Height / size.Width
					r.Initialize(br.GetField("y"), br.GetField("x"), tl.GetField("y"),tl.GetField("x"))
				End If
				
				Select camEx.PreviewOrientation
					Case 180
						r.Initialize(size.Width - r.Right, size.Height - r.Bottom, size.Width - r.Left, size.Height - r.Top)
					Case 90
						r.Initialize(size.Height - r.Right, r.Top, size.Height - r.Left, r.Bottom)
				End Select
				r.Left = r.Left * xscale
				r.Right = r.Right * xscale
				r.Top = r.Top * yscale
				r.Bottom = r.Bottom * yscale
				cvs.DrawRect(r, Colors.Red, False, 5dip)
			Next
			If Matches = 0 Then
				cvs.ClearRect(cvs.TargetRect)
			End If
			cvs.Invalidate
			
			'Log(DateTime.Now - n)
		End If
	End If
End Sub

Sub Activity_Resume
	InitializeCamera
End Sub

Private Sub InitializeCamera
	Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_CAMERA)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		camEx.Initialize(Panel1, frontCamera, Me, "ScanCamera")
		frontCamera = camEx.Front
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	If camEx.IsInitialized Then
		camEx.Release
	End If
End Sub


Sub ScanCamera_Ready (Success As Boolean)
	If Success Then
		camEx.SetJpegQuality(90)
		camEx.SetContinuousAutoFocus
		camEx.CommitParameters
		camEx.StartPreview
		
	Else
		ToastMessageShow("Cannot open camera.", True)
	End If
End Sub

Sub ScanCamera_PictureTaken (Data() As Byte)

End Sub

Sub btnCancel_Click
	Log("BTNCANCEL")
	Sleep(100)
	Return2Activity
End Sub

Sub btnClear_Click
	Msgbox2Async("Limpar todos os códigos lidos ?", "Reinicializar lista de códigos", "Todos", "Seleccionados", "Não", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		ListaCodigosLidos.Clear
		ShareCode.ScanList.Clear
	else if Result = DialogResponse.CANCEL Then
		Dim lst2delete As List
		lst2delete.Initialize
		For t=0 To ListaCodigosLidos.Size -1
			Dim pnl As Panel = ListaCodigosLidos.GetPanel(t)
			Dim check_box As CheckBox = pnl.GetView(0)
			Dim lbl_state As Label = pnl.GetView(1)
			Dim lbl_barcode As Label  = pnl.GetView(2)
			If Not(check_box.Checked) Then
				lst2delete.Add($"0;${lbl_state.text};${lbl_barcode.text}"$)
			End If
		Next
		
		ListaCodigosLidos.Clear
		ShareCode.ScanList.Clear
		
		For l=0 To lst2delete.Size -1
			Dim linha2recover As List =  Regex.Split(";",lst2delete.Get(l))
			Dim Sta As String = linha2recover.Get(1)
			Dim CBQR As String = linha2recover.Get(2)	
			ShareCode.ScanList.Add(CBQR)
			If Sta = Chr(0xF00D) Then
				Dim StaCod As Int = 0
			Else If Sta = Chr(0xF00C) Then
				Dim StaCod As Int = 1
			Else
				Dim StaCod As Int = 2
			End If
			
			ListaCodigosLidos.Add(createListaItem(CBQR,False,StaCod,50dip), "")
		Next
		
	End If

End Sub

Sub createListaItem(Barcode As String, SelectedRec As Boolean, StateRec As Int, height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("ListaBarcodes" )
	p.RemoveView
	BarcodeString.TextSize = 12
	BarcodeString.text = Barcode
	BarCodeCheck.Checked = SelectedRec
	
	If StateRec = 1 Then
		BarCodeState.Text = Chr(0xF00C)
		BarCodeState.TextColor = Colors.Green
	Else if StateRec = 0 Then
		BarCodeState.Text = Chr(0xF00D)
		BarCodeState.TextColor = Colors.red
	Else
		BarCodeState.Text = Chr(0xF068)
		BarCodeState.TextColor = Colors.LightGray
	End If
	
	p.Tag = $"${Barcode}|${Utils.Bool2Int(SelectedRec)}|${StateRec}"$
	Return p
End Sub