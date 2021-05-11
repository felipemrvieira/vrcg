B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
'DialogItemActions

Sub Class_Globals
	Dim IME As IME
	Private dlgTabPanel As TabStrip
	Private listsButtonClose As Button
	Private ParentWindow As Activity
	Private OwnerPanel As B4XView
	Private imgButtonBox As Button
	Private imgImage As ImageView
	Private pnlImageBoxOptions As Panel
	Private mngImagesArea As CustomListView
	Private mngNotesField As EditText
	Private mngObsBasePanel As Panel
	Private textPanel As Panel
	Private KeyHidBtn As Button
	Private dlgBasePanel As Panel
	Private mainLabelOptLists As Label
	Private imgButtonEdit As Button
	Private imgButtonDuplicate As Button
	Private imgButtonDelete As Button
	Private imgAddButtonBox As Button
	
	Private imageRow As Int
	Private imageCol As Int
	Private imageTotalCols As Int
	
	Private imagesTotal As Int = 0
	Private imagesTagcode As String
	Private imagesUniqueID As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(act As Activity, Owner As B4XView)
	ParentWindow = act
	OwnerPanel = Owner
	OwnerPanel.LoadLayout("Dialog_ItemsActions")
	dlgTabPanel.LoadLayout("ManagementImageList", "Evidências")
	dlgTabPanel.LoadLayout("ManagementActions", "Acções subsequentes")
	dlgTabPanel.LoadLayout("ManagementObservations", "Notas/Observações")
	For Each lbl As Label In Utils.GetAllTabLabels(dlgTabPanel)
		lbl.Width = 33.33%x
	Next
	StartDlgIOActivity("ABC1", "ABC1", 1)
	

	IME.Initialize("IME")
	
	OwnerPanel.visible = True
End Sub

Sub StartDlgIOActivity(Tagcode As String, UniqueID As String, ImgCount As Int) 
	imagesTotal = ImgCount
	imagesTagcode = Tagcode
	imagesUniqueID = UniqueID
	
	Dim Cols As Int = Floor(OwnerPanel.Width/225)
	Dim Rows As Int = Round2((ImgCount + 1) / Cols, 0)
	If (Rows = 0) Then Rows = 1
	
	imageTotalCols = Cols

	Dim isFirst As Boolean = True
	Dim index As Int = 0
	Dim Out As Boolean = False
	For i = 1 To Rows
		Dim p As Panel
		p.Initialize("")
		ParentWindow.AddView(p, 0, 0, 100%x, 165dip)
		Dim colindex As Int = 0
		If isFirst Then
			p.LoadLayout("imgView")
		Else
			p.LoadLayout("imgViewNextRow")
		End If
		p.Height = 165dip
		p.RemoveView
		For n = 1 To Cols
			If isFirst Then
				isFirst = False
				imgAddButtonBox.Tag = Tagcode
			Else
				Dim pnl As B4XView = p.GetView(colindex)
				pnl.Visible = True
				pnl.Color = Rnd(0xFF000000, 0xFFFFFFFF)
				index = index + 1
			End If
			colindex = n
			Out = ((index+1)=ImgCount)
			If Out Then
				imageCol = colindex
				Exit
			End If
		Next
		mngImagesArea.Add(p, "") ', 165dip, "")
		If Out Then
			Exit
		End If
	Next
	imageRow = Rows
End Sub

Sub listsButtonClose_Click
	Log("Back DIALOGS")
	'OwnerPanel.visible = False
	'CallSubDelayed(ParentWindow, "RemoveActionOptionsPanel")
	CallSubDelayed("CheckList3", "RemoveActionOptionsPanel")
End Sub

Sub dlgTabPanel_PageSelected (Position As Int)
	IME.HideKeyboard
End Sub

Sub imgButtonBox_Click
	
End Sub

Sub imgImage_Click
	
End Sub

Sub imgImage_LongClick
	
End Sub

Sub mngImagesArea_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub mngNotesField_TextChanged (Old As String, New As String)
	
End Sub

Sub mngNotesField_FocusChanged (HasFocus As Boolean)
	If Not(HasFocus) Then IME.HideKeyboard
End Sub

Sub mainLabelOptLists_Click
	IME.HideKeyboard
End Sub

Sub imgButtonDelete_Click
	
End Sub

Sub imgButtonDuplicate_Click
	
End Sub

Sub imgButtonEdit_Click
	
End Sub

Sub imgAddButtonBox_Click
	'imgAddButtonBox
	CallSubDelayed2(CameraActivity2, "StartCamera", Me)
End Sub

Public Sub CameraReturn(shots As List)
'	imageTotalCols
'	imagesTotal = ImgCount
'	imagesTagcode = Tagcode
'	imagesUniqueID = UniqueID
'	
'	Private imageRow As Int
'	Private imageCol As Int
'	Private imageTotalCols As Int
	
	imagesTotal = imagesTotal + shots.Size
	Dim Cols As Int = imageTotalCols 'Floor(OwnerPanel.Width/225)
	Dim Rows As Int = Round2((imagesTotal + 1) / Cols, 0)
	Dim colStart As Int = imageCol

	Dim isFirst As Boolean = False
	Dim index As Int = 0
	Dim Out As Boolean = False
	Dim xui As XUI
	
	For i = imageRow To Rows
		If (colStart = Cols) Then
			Dim p As Panel
			p.Initialize("")
			ParentWindow.AddView(p, 0, 0, 100%x, 165dip)
			Dim colindex As Int = 0
			If isFirst Then
				p.LoadLayout("imgView")
			Else
				p.LoadLayout("imgViewNextRow")
			End If
			
		Else
			Dim p As Panel = mngImagesArea.GetPanel(i-1)
		End If
		p.Height = 175dip
		p.RemoveView
		
		For n = colStart To Cols
			If isFirst Then
				isFirst = False
				imgAddButtonBox.Tag = imagesTagcode
			Else
				Dim pnl As B4XView = p.GetView(colindex)
				pnl.Visible = True
				
				pnl.SetBitmap(xui.LoadBitmapResize(Starter.SafeDefaultExternal, shots.Get(index), pnl.Width, pnl.Height, False))
				'pnl.Color = Rnd(0xFF000000, 0xFFFFFFFF)
				index = index + 1
			End If
			colindex = n
			Out = ((index+1)=imagesTotal)
			If Out Then
				imageCol = colindex
				Exit
			End If
		Next
		mngImagesArea.Add(p, "") ', 165dip, "")
		If Out Then
			Exit
		End If
	Next
	imageRow = Rows
	
End Sub


Public Sub CameraReturnNoAction
	'
End Sub

Sub imgPictureClick_Click
	
End Sub