B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

'	PDFViewer
'	Reflection
'	StringUtils
'	Dialogs
'	ViewEx



'Sub Globals
'	Private FileString As String = ""
'	Private FileName As String = ""
'	
'End Sub
'
'Sub Activity_Create(FirstTime As Boolean)
'	'Do not forget to load the layout file created with the visual designer. For example:
'	'Activity.LoadLayout("1")
'	Log("CopyFile()")
'	If Not(File.Exists(File.DirRootExternal, "CERTIFICADO.pdf")) Then
'		Log("test.pdf does not exist at DirRootExternal")
'		File.Copy(File.DirAssets, "CERTIFICADO.pdf", File.DirRootExternal, "CERTIFICADO.pdf")
'		Log("CERTIFICADO.pdf copied")
'	End If
'	
'	If File.Exists(File.DirRootExternal, "CERTIFICA.pdf") Then
'		File.Delete(File.DirRootExternal, "CERTIFICA.pdf")
'	End If
'	If Not(File.Exists(File.DirRootExternal, "CERTIFICA.pdf")) Then
'		FileString = File.ReadString(File.DirAssets, "ff.txt")
'		Log(FileString)
'		Dim su As StringUtils
'		Dim b() As Byte = su.DecodeBase64(FileString)
'		File.WriteBytes(File.DirRootExternal, "CERTIFICA.pdf", b)
'		Log($"Ficheiro Certifica.pdf criado!"$)
'	End If
'	FileName = "CERTIFICA.pdf"
'	
'End Sub
'
'Sub PDFReturn
'	Log( "Return" )
'End Sub

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	Dim pdf As PDFViewer
	Private PageCount As Int = 0
	Private ZoomLevel As Int = 1
	Private CurrentPage As Int = 0
	Private pdfFileName As String = ""
	Private pdfRootFolder As String = ""
	
	Private mainPanel As Panel
	Private butMore As Button
	Private butLess As Button
	Private butPageLeft As Button
	Private butPage As Button
	Private butPageRight As Button
	Private butClose As Button
	Private butOriRight As Button
	Private butOriLeft As Button
	Private butSendTo As Button
	Private butSendEmail As Button
	Private labelInfoFile As Label
	
	Private DetailsDialog As CustomLayoutDialog
	Private DialogCC As FloatLabeledEditText
	Private DialogTo As FloatLabeledEditText
	Private DialogMessage As FloatLabeledEditText
	Private DialogSubject As FloatLabeledEditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("PDFViewLayout")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Public Sub StartPDFActivity(RootFolder As String, FileName As String)
	pdfFileName = FileName
	pdfRootFolder = RootFolder
	
	'Do not forget to load the layout file created with the visual designer. For example:
	
'	Log("CopyFile()")
'	If Not(File.Exists(File.DirRootExternal, "CERTIFICADO.pdf")) Then
'		Log("test.pdf does not exist at DirRootExternal")
'		
'		File.Copy(File.DirAssets, "CERTIFICADO.pdf", File.DirRootExternal, "CERTIFICADO.pdf")		
'		Log("CERTIFICADO.pdf copied")
'	End If
'	
'	If Not(File.Exists(File.DirRootExternal, "CERTIFICA.pdf")) Then
'	
'		pdfFileString = File.ReadString(File.DirAssets, "ff.txt")
'		Log(pdfFileString)
'		Dim su As StringUtils
'		Dim b() As Byte = su.DecodeBase64(pdfFileString)
'		File.WriteBytes(File.DirRootExternal, "CERTIFICA.pdf", b)
'		Log($"Ficheiro Certifica.pdf criado!"$)
'		FileName = "CERTIFICA.pdf"
'	End If

	pdf.init
	mainPanel.AddView(pdf,0,0,-1,-1)
	pdf.getpdf2(File.Combine(pdfRootFolder,pdfFileName),"")
	pdf.RequestFocus
	CurrentPage = 0
	If pdf.isValid Then
		Log("pagecount:"&pdf.GetPageCount)
		pdf.scrollToPage(CurrentPage)
		PageCount = pdf.GetPageCount
		ZoomLevel = 1
		pdf.zoom(1/0.5) '19.0)
		pdf.zoom(0.5) '19.0)
		Log("ZoomLevel level:"&ZoomLevel)
		
		labelInfoFile.Text = $"Página ${CurrentPage+1}/${PageCount} --- ${pdfFileName}"$
	Else
		ToastMessageShow( "O documento PDF é inválido ou está corrupto!", 3)
		'Msgbox("Error pdf file!","Error")
		labelInfoFile.Text = $"${pdfFileName}"$
	End If
	
End Sub

Public Sub PDFZoomLevel(pdf1 As PDFViewer, Zoom As Float) As Object
	Dim r As Reflector
	r.Target = pdf1
	Return r.RunMethod2("zoom", Zoom, "java.lang.float")
End Sub

Public Sub setRotation(pdf1 As PDFViewer, angle As Int) As Object
	Dim r As Reflector
	r.Target = pdf1
	Return r.RunMethod2("setRotation", angle, "java.lang.int")
End Sub

Public Sub getRotation(pdf1 As PDFViewer) As Int 'worked
	Dim r As Reflector
	r.Target = pdf1
	Return r.RunMethod("getRotation")
End Sub

Sub butLess_Click
	If (ZoomLevel > 1) Then
		ZoomLevel = ZoomLevel -1
		PDFZoomLevel(pdf, 0.5)
	End If
	Log("ZoomLevel :"&ZoomLevel)
	labelInfoFile.Text = $"Página ${CurrentPage+1}/${PageCount} - ${pdfFileName} -  ${Utils.GetFreeMem}"$
End Sub

Sub butMore_Click
	If (ZoomLevel < 5) Then
		ZoomLevel = ZoomLevel +1
		PDFZoomLevel(pdf, 1/0.5)
	End If
	Log("ZoomLevel :"&ZoomLevel)
	labelInfoFile.Text = $"Página ${CurrentPage+1}/${PageCount} - ${pdfFileName} -  ${Utils.GetFreeMem}"$
End Sub


Sub butSendEmail_Click
	Dim sf As Object = DetailsDialog.ShowAsync("Enviar email", "Confirmar", "Cancelar", "", LoadBitmap(File.DirAssets, "mail2.png"), True)
	DetailsDialog.SetSize(75%x, 90%y)
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_sendEmail")
	'0x00002000 = TYPE_TEXT_FLAG_CAP_WORDS (capitalize first character of each word)
	DialogTo.EditText.InputType = Bit.Or(0x00002000, DialogTo.EditText.InputType)
	DialogCC.EditText.InputType = Bit.Or(0x00002000, DialogCC.EditText.InputType)
	
	DialogSubject.EditText.InputType = Bit.Or(0x00002000, DialogSubject.EditText.InputType)
	DialogMessage.EditText.InputType = Bit.Or(0x00002000, DialogMessage.EditText.InputType)
	
	'Private emailPanel As Panel
	
	DetailsDialog.GetButton(DialogResponse.POSITIVE).Enabled = False
	Wait For (sf) Dialog_Result(res As Int)
	'force the keyboard to hide
	DialogTo.EditText.Enabled = False
	DialogCC.EditText.Enabled = False
	If res = DialogResponse.POSITIVE Then
		ToastMessageShow($"${DialogTo.Text} ${DialogCC.Text} is years old"$, True)
	End If
End Sub

Sub butSendTo_Click
	
End Sub

Sub butOriLeft_Click
	setRotation(pdf, -90)
End Sub

Sub butOriRight_Click
	setRotation(pdf, 90)
End Sub

Sub butClose_Click
	pdf.finalize
	CallSubDelayed2(User, "PDFReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub butPageRight_Click
	If (CurrentPage+1) < PageCount Then
		CurrentPage = CurrentPage + 1
		pdf.scrollToPage(CurrentPage)
		'labelInfoFile.Text = $"Página ${CurrentPage+1}/${PageCount} --- ${pdfFileName}"$
		labelInfoFile.Text = $"Página ${CurrentPage+1}/${PageCount} - ${pdfFileName} -  ${Utils.GetFreeMem}"$
	End If
End Sub

Sub butPage_Click
End Sub

Sub butPageLeft_Click
	If (CurrentPage+1) > 1 Then
		CurrentPage = CurrentPage - 1
		pdf.scrollToPage(CurrentPage)
		labelInfoFile.Text = $"Página ${CurrentPage+1}/${PageCount} - ${pdfFileName} -  ${Utils.GetFreeMem}"$
	End If
End Sub

Sub btnEnterDetails_Click

End Sub

Sub DialogAge_ItemClick (Position As Int, Value As Object)
	CheckAllFieldsValid
End Sub

Sub DialogCC_TextChanged (Old As String, New As String)
	CheckAllFieldsValid
End Sub

Sub DialogTo_TextChanged (Old As String, New As String)
	CheckAllFieldsValid
End Sub

Sub CheckAllFieldsValid
	'Dim valid As Boolean = DialogFirstName.Text.Length > 0 And DialogLastName.Text.Length > 0
	'DetailsDialog.GetButton(DialogResponse.POSITIVE).Enabled = valid
End Sub