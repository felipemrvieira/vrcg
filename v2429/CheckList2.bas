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

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
'	Private Const NoColor As Int = Colors.Transparent
'	Private Const ColorRed As Int = Colors.ARGB(255,215,0,0)
'	Private Const ColorGreen As Int = Colors.ARGB(255,5,215,0)
'	Private Const ColorBlue As Int = Colors.ARGB(255,0,129,215)
'	Private Const ColorOrange As Int = Colors.ARGB(255,255,190,0)
'	Private Const ColorYellow As Int = Colors.ARGB(255,255,255,0)
	'Type topheight(top As Int, height As Int)
	Public Device As Phone
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private READONLY_FEATURES As Boolean = False
	Private TOTAL_POINTS As Double = 0.00
	Private POINTS_RESULT As Boolean = False
	Private CLA_CURRENT_STATE As Int = 0
	Private CLA_CURRENT_PAGE As Int = 0
	Private CONFORMITIES As Int = 0
	Private REPORT_GENERATED As Boolean = False
	Private REPORT_FILE_GENERATED As String = ""
	Private CHECKLIST_TITLE As String = ""
	
'	Private SignatureTemplate As B4XSignatureTemplate
	Dim Signature As SignatureData
	Dim SignCanvas As Canvas
	
	Private clListView As CustomListViewCollapse
	Private cl_topPanel As Panel
	Private cl_topTitle As Label
	
	Private LabelVersion As Label
	Private LabelDateTime As Label
	Private LabelCopyright As Label
	
	Private lblTitle As B4XView
	Private pnlTitle As B4XView
	Private pnlExpanded As B4XView
	Private xui As XUI
	
	'Type ItemData (CollapsedHeight As Int, ExpandedHeight As Int)
	Private listsTabPanel As TabStrip
	Private listsButtonPauseRun As Button
	Private listsButtonClose As Button
	Private CLRunning As Boolean = True
	Private cl_InfotopTitle As Label
	Private butCollpseExpand As Button
'	Private cl_lineQuestion As Label
	Private butNotConfirm As Button
	Private butConfirm As Button
	Private pnlCurrenIndex As Int
'	Private panelActionOptions As Panel
'	Private butActionsClose As Button
'	Private butActions As Button
'	Private butTask As Button
'	Private butPhoto As Button
	Private ActionOptionsPanel As Panel
	Private mainLabelOptLists As Label
	Private butChecklistRunAction As Button
	Private butChecklistRunReport As Button
	Private butChecklistRunEnd As Button
	Private ButtonUserUnavailable As Button
	Private ColorTabPanel As Panel
	Private mainLogo As ImageView
	Private cl_FinaltopTitle As Label
	Private ImageView1 As B4XView
	Private pnlGroupCurrenIndex As Int = 0
	
	Private FastCloseAction As Boolean = False
	Private TabPagesCount As Int = 3
	Private CurrentTab As Int = 0
	
	Private CurrentCLA As RequestCLA
	Private CLAItemTitle As Label
	Private CLAItemEditValue As FloatLabeledEditText
	Private CLAButtonOptions As Button
	Private CLAItemButton_1 As B4XStateButton
	Private CLAItemButton_2 As B4XStateButton
	Private CLAItem_G1 As Label
	Private CLAItem_G2 As Label
	Private CLAItem_G3 As Label
	Private CLAItem_G4 As Label
	Private CLAItem_G5 As Label
	Private CLAItem_G6 As Label
	Private CLAItem_G7 As Label
	
	Private LoadingProcess As Boolean = True
	Private CLAItem_V11 As Label
	Private CLAItem_V12 As Label
	Private CLAItem_V13 As Label
	Private CLAItem_V14 As Label
	Private CLAItem_V21 As Label
	Private CLAItem_V22 As Label
	Private CLAItem_V23 As Label
	Private CLAItem_V24 As Label

	Private CLAButtonOpt0 As B4XStateButton
	Private CLAButtonOpt1 As B4XStateButton
	Private CLAButtonOpt2 As B4XStateButton
	Private CLAButtonOpt3 As B4XStateButton
	Private CLAButtonOpt4 As B4XStateButton
	Private CLAButtonOpt5 As B4XStateButton
	Private CLAButtonOpt6 As B4XStateButton
	Private CLAButtonOpt7 As B4XStateButton
	Private CLAButtonOpt8 As B4XStateButton
	Private CLAButtonOpt9 As B4XStateButton
	Private CLAButtonOpt14 As B4XStateButton
	Private CLAButtonOpt15 As B4XStateButton
	Private CLAButtonOpt16 As B4XStateButton
	Private CLAButtonOpt17 As B4XStateButton
	Private CLAButtonOpt18 As B4XStateButton
	Private CLAButtonOpt19 As B4XStateButton
	Private CLAButtonOpt20 As B4XStateButton
	Private CLAButtonOpt21 As B4XStateButton
	Private CLAButtonOpt41 As B4XStateButton
	Private CLAButtonOpt42 As B4XStateButton
	Private CLAButtonOpt43 As B4XStateButton
	Private CLAButtonOpt44 As B4XStateButton
	Private CLAButtonOpt45 As B4XStateButton
	Private CLAButtonOpt46 As B4XStateButton
	Private CLAButtonOpt47 As B4XStateButton
	Private CLAButtonOpt48 As B4XStateButton
	Private FINResult As Label
	Private FINActionButton As Button
	Private FINSignatures As Button
	Private FloatLabeledEditText1 As FloatLabeledEditText
	Private FINItemImages As CustomListView
	Private FINGroups As ExpandedListView
	Private FINPause As Label
	Private FINDuration As Label
	Private FINEnd As Label
	Private FINStart As Label
	Private FINPoints As Label
	Private CLAItemSelectValue As Spinner
	Private CLAItemLabel As Label
	Private SelectOptionPanel As Panel
	Private ButtonActionPause As Button
	Private SignPanel As Panel
	Private PanelSignature As Panel
	Private btnSaveSign As Button
	Private btnClearSign As Button
	'Private CLAItemRulerValue As B4XRulerPicker
	Private CLAItemRulerValue As SeekBar
	
	Private listsTabPanelExec As Panel
	Private listsTabPanelObject As Panel
	Private listsTabPanelTerminate As Panel
	Private InnerlistsTabPanelExec As Panel
	Private InnerlistsTabPanelObject As Panel
	Private InnerlistsTabPanelTerminate As Panel
	Private CLAItemRulerValueMin As Label
	Private CLAItemRulerValueMax As Label
	Private CLAItemRulerValueCurrent As Label
	Private imageSelectedOnReport As Label
	Private ShowImage As ImageView
	Private ImageFilename As Label
	Private ImageState As Label
	Private imageSelected As Label
	Private TabButtonChangeTerminate As Button
	Private TabButtonChangeObject As Button
	Private TabButtonChangeChecklist As Button
	Private butChecklistReport As Button
	Private butChecklistSendReport As Button
	Private SignPerson As Label
	Private CurrentSignature As Int = 0 'Posição da assinatura
	Private lblGroupTitle As Label
	Private butGroupCollpseExpand As Button
	Private pnlGroupExpanded As Panel
	Private pnlGroupTitle As Panel
	Private objectImage As ImageView
	Private objectListView As CustomListViewCollapse
	Private objectNotes As Label
	Private objectTagcode As Label
	Private objectType As Label
	Private objectCode As Label
	Private Button2 As Button
	Private Button5 As Button
	Private lblAddressType As Label
	Private lblAddressName As Label
	Private butAddressEdit As Button
	Private lblAddressName2 As Label
	Private lblAddressPostalCode As Label
	Private lblAddressCity As Label
	Private lblAddressLatitude As Label
	Private lblAddressLongitude As Label
	Private butAddressMap As Button
	Private lblContactName As Label
	Private butContactEdit As Button
	Private lblTypeContact As Label
	Private lblContactEmail As Label
	Private lblContactPhone As Label
	Private lblPropertyValue As Label
	Private butPropertyEdit As Button
	Private lblPropertyName As Label
	Private pnlGroupExpandedProp As Panel
	Private lblGroupTitleProp As Label
	Private butGroupCollpseExpandProp As Button
	Private pnlGroupTitleProp As Panel
	Private pnlGroupExpanded4 As Panel
	Private lblGroupLineName As Label
	Private ButtonAppNetwork As Button
	Private mainActiveUser As Label
	Private CurrentResult As String = ""
	Private SignatureExists As Int = 0 '1=Client, 2=tech, 3=all
	Private CLAItemButton_3 As B4XStateButton
	Private CLAItemButton_4 As B4XStateButton
	Private CLAItemButton_5 As B4XStateButton
	Private CLAMandatory As Label
	Private CLACritical As Label
	Private CLAItemDateEditValue As FloatLabeledEditText
	Private CurrentDateEdit As FloatLabeledEditText
	Private CurrentTimeEdit As FloatLabeledEditText
	Private CLAItemTimeEditValue As FloatLabeledEditText
	Private dlgASDetails As FloatLabeledEditText
	Private dlgASEmailsSubject As FloatLabeledEditText
	Private dlgASEmailsCC As FloatLabeledEditText
	Private dlgASEmails As FloatLabeledEditText
	Private FinalObs As FloatLabeledEditText
	Private CLAItemButton_6 As B4XStateButton
	Private butMoreLeft As Button
	Private butAddMore As Button
	Private butMoreRight As Button
	Private MainObservations As String = ""
	Private ShowImageView As ImageView
	Private CLAItemTitleInfo As Label
End Sub

'Dialog_ItemActions
'CLA_MainLayout

Sub Activity_Create(FirstTime As Boolean)
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	Activity.LoadLayout("CLA_MainLayout_2")
	Starter.CurrentWorkActivity = Me
End Sub


Sub UpdateMainLayout
	mainLabelOptLists.TextColor = Consts.ColorMain
	mainLogo.Gravity = Gravity.FILL
	mainLogo.Width = Consts.LogoWidth
	Log($"Inicialização de BMP: ${ShareCode.APP_MAIN_LOGO_MINI}"$)
	If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then
		mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO_MINI))
	End If
	Dim gc As GradientDrawable
	gc.Initialize("TOP_BOTTOM", Array As Int(Consts.ColorMain, Consts.ColorSub))
	ColorTabPanel.Background = gc
End Sub

Sub WindowStatusUpdate
	LabelVersion.Text = ShareCode.APP_VersionNocodeName
	LabelCopyright.Text = ShareCode.APP_EntityBrand  '"X-Evolution,Lda"
	mainActiveUser.Text = ShareCode.SESS_OPER_UserName
	
	ButtonAppNetwork.Enabled = False
	ButtonAppNetwork.TextColor = Consts.ColorLightSilver
	If (ShareCode.APP_WORKING_LOCAL) Then
		ButtonAppNetwork.Enabled = True
		ButtonAppNetwork.TextColor = Consts.ColorRedOrange
	End If
	ButtonUserUnavailable.Enabled = False
	ButtonUserUnavailable.TextColor = Consts.ColorLightSilver
	If (ShareCode.USR_STATE = 0) Then
		ButtonUserUnavailable.Enabled = True
		ButtonUserUnavailable.TextColor = Consts.ColorRedOrange
	End If
	
	ButtonActionPause.Enabled = False
	ButtonActionPause.TextColor = Consts.ColorLightSilver
	If (ShareCode.CLA_STATE >= 1) Then
		ButtonActionPause.Enabled = True
		ButtonActionPause.TextColor = Consts.ColorRedOrange
	End If
	
	butChecklistRunEnd.Text = "Terminar"
	If (CurrentTab = 0) Then
	Else
		butChecklistRunEnd.Text = "Concluir"
	End If
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		listsButtonClose_Click
	End If
	Return True
End Sub

Sub StartCLA_ActivityReadOnly(data As RequestCLA, Entity As String)
	READONLY_FEATURES = True
	StartCLA_Activity(data, Entity)
End Sub

Sub StartCLA_Activity(data As RequestCLA, Entity As String)
	CurrentCLA = data
	TOTAL_POINTS  = 0.00
	POINTS_RESULT = CurrentCLA.Info.RequestResult = 3
	InnerlistsTabPanelExec.LoadLayout("CLA_TASK_Execution") ', Record.GetString("title")) "Acção/Checklist")
	InnerlistsTabPanelObject.LoadLayout("CLA_TASK_Information")
	InnerlistsTabPanelTerminate.LoadLayout("CLA_TASK_Conclusion")
	
	MainObservations = ""
	
	Private Record As Cursor
	LoadingProcess = True
	Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} and a.tagcode='${CurrentCLA.Task}'"$
	Log(SQL)
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		
		'listsTabPanel.LoadLayout("CLA_TASK_Execution", Record.GetString("title")) '"Acção/Checklist")
		CHECKLIST_TITLE = Record.GetString("name")
		cl_topTitle.Text = CHECKLIST_TITLE
		cl_InfotopTitle.Text = Entity
		cl_FinaltopTitle.Text = Entity
		MainObservations = Record.GetString("task_obs")
		
		
		FastCloseAction = Record.GetInt("fast_close") = 1
		
		Private objRecord As Cursor
		Dim Rows As Int = 0
		Dim objSQL As String = $"${DBStructures.SQL_CURRENT_OBJECTS} where a.tagcode in (select object_tagcode from requests_tasks where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}')"$
		Log(objSQL)
		objRecord = Starter.LocalSQL.ExecQuery(objSQL)
		If objRecord.RowCount > 0 Then
			objRecord.Position = 0
	
			objectCode.Text = objRecord.GetString("reference")
			objectNotes.Text = objRecord.GetString("notes")
			objectTagcode.Text = objRecord.GetString("tagcode")
			objectType.Text = objRecord.GetString("typedesc")
			If Not(Utils.isNullOrEmpty(objRecord.GetString("image"))) Then
				objectImage.Bitmap = Utils.B64ToBitmap(objRecord.GetString("image"))
			End If
			
			Dim idx As Int = CreateobjectDetailsData(False, objRecord)
			CreateobjectDetailsDataProp(idx, False, objRecord.GetString("tagcode"))
			
		Else
			Button2.Visible = False
			Button5.Visible = False
			TabButtonChangeObject.Visible = False
		End If
		objRecord.Close

		
		Private Recordw As Cursor
		Dim Rows As Int = 0
		CurrentSignature = 0  'from_who
		Dim theSignature  As String = ""
		Dim SQL As String = $"select * from requests_signatures where  request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
		
		Recordw = Starter.LocalSQL.ExecQuery(SQL)
		SignatureExists = 0 ' 1=Client, 2=Tech, 3=all
		If Recordw.RowCount > 0 Then
			For Rows = 0 To Recordw.RowCount-1
				Recordw.Position = Rows
				Dim theFile As String = Recordw.GetString("filename")
				If (Recordw.GetInt("from_who") = 0) Then
					If Not(File.Exists(Starter.InternalFolder, $"fisrt_${CurrentCLA.Task}signature.png"$)) Then
						Utils.SaveImageviewToFile(Utils.B64ToBitmap(Recordw.GetString("image")), $"fisrt_${CurrentCLA.Task}signature.png"$, "PNG")
						
	'					Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, "sign.png", SignPanel.Width, SignPanel.Height, True)
	'					SignPanel.SetBackgroundImage(bg) 
					End If
					If (SignatureExists = 0) Then 
						SignatureExists = 1
					Else
						SignatureExists = SignatureExists + 1
					End If
				Else
					If Not(File.Exists(Starter.InternalFolder, $"second_${CurrentCLA.Task}signature.png"$)) Then
						Utils.SaveImageviewToFile(Utils.B64ToBitmap(Recordw.GetString("image")), $"second_${CurrentCLA.Task}signature.png"$, "PNG")
					End If
					If (SignatureExists = 0) Then
						SignatureExists = 2
					Else
						SignatureExists = SignatureExists + 2
					End If
				End If
			Next
		End If
		Recordw.Close
		
		If File.Exists(Starter.InternalFolder, "fisrt_${CurrentCLA.Task}signature.png") Then
			Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, "fisrt_${CurrentCLA.Task}signature.png", SignPanel.Width, SignPanel.Height, True)
			SignPanel.SetBackgroundImage(bg)
			
		End If
		
	
		'SignPerson
		SignCanvas.Initialize(SignPanel)
		Signature.Initialize
		Signature.Canvas = SignCanvas
		Signature.Panel = SignPanel
		Signature.SignatureColor = Colors.Black
		Signature.SignatureWidth = 3dip
		
		
		butChecklistReport.Tag = CurrentCLA
	Else
		ToastMessageShow("Erro!!! Sem informação da tarefa!", True)
		listsButtonClose_Click
	End If
	Record.Close
	
	'
	TabButtonChangeTerminate.Tag = CurrentCLA
	TabButtonChangeObject.Tag = CurrentCLA
	TabButtonChangeChecklist.Tag = CurrentCLA
	If (FINActionButton.IsInitialized) Then
		FINActionButton.Tag = CurrentCLA
	End If
	
	If (CurrentCLA.Status.status >=3) Then
		butChecklistRunEnd.Visible = False
		LoadExecution
	End If

	Dim SQL As String = $"${DBStructures.SQL_GETREQUESTS_CURRENT_TASK} and 
				a.request_tagcode='${CurrentCLA.Request}' and 
				a.action_tagcode='${CurrentCLA.Action}'"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		
		If (POINTS_RESULT) Then
			FINPoints.text = Record.GetDouble("points")
		Else
			FINPoints.text = ""
		End If
		FINStart.Text = Record.GetString("run_start")
	End If
	Record.Close

	
	Private Record As Cursor
	Dim SQL As String = $"${DBStructures.SQL_GET_TASK_ITEMS} and a.task_tagcode='${CurrentCLA.Task}' order by a.position"$
	Log(SQL)
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Dim idx As Int = 0
		Dim TopRec As Int = 0
		Dim Initial As Boolean = True
		Dim chapter As B4XView
		Dim id As ItemData
		
		For Row = 0 To Record.RowCount-1
			Record.Position = Row
			
			Dim oLevel As Int = Record.GetInt("level")
			Dim oType As Int = Record.GetInt("type")
			Dim oItem1 As String = Record.GetString("item_tagcode")
			Dim oUKey As String = Record.GetString("uniquekey")
			Dim oTitle As String = Record.GetString("title")
			Dim oValType As Int = Record.GetInt("value_type")
			Dim repeat As Int = Record.GetInt("repeat")
			Dim infoquest As String = Record.GetString("info")
			If (Utils.isNullOrEmpty(infoquest)) Then
				infoquest = ""
				Dim ExtraHeight As Int = 0
			Else
				Dim ExtraHeight As Int = 55
			End If
			
'			Dim ExtraHeight As Int = DBStructures.getTaskInfoTotal
'			If (ExtraHeight >=1) Then
'				ExtraHeight = ExtraHeight * 55
'			End If
			
			Dim ChapterItem As RequestCLAItem = Types.MakeRequestCLAItem(CurrentCLA.Request, _
							CurrentCLA.Action, CurrentCLA.Task, oItem1, oUKey, "", "", "", "", repeat, 0, 1, "")
			
			'If (CurrentCLA.Request = "I_2019_190346") Then
				Dim oItem As String = oUKey
			'Else
			'	Dim oItem As String = oItem1
			'End If

			Dim gCols As Int = Record.GetInt("cols")
			Dim gViewCols As Int = Record.GetInt("viewcols") 
			
			If ((oLevel = 0) And (oType = 0)) Then
				' Verifica total de registos dependentes
				TopRec = 0
				If Not(Initial) Then
					clListView.Add(chapter, id)
					idx = idx + 1
				Else
					Initial = False
				End If 
				
				Dim DefHeight As Int = 75
				Dim ilen As Int = 0

				If (oValType = 15) Then
					If (ShareCode.ISPHONE) Then 
						DefHeight = 215dip
					Else
						DefHeight = 60dip
					End If
					Dim lItems As Int = DBStructures.getTaskRecordGroupHeightGL_VAL($" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${oItem}' and a.uniquekey='${oUKey}'"$, DefHeight)					
					'If (lItems > 0) Then lItems = lItems +2
				Else if (oValType = 7) Then
					If (ShareCode.ISPHONE) Then DefHeight = 225dip
					lItems = lItems +2
				Else if (oValType = 19) Then
					DefHeight = 90dip
					Dim lItems As Int = DBStructures.getTaskRecordGroupHeight_VAL($" and a.task_tagcode='${CurrentCLA.Task}' and a.parent='${oItem}'"$, DefHeight, DefHeight)
					If (lItems = 0) Then
						'If (ShareCode.ISPHONE) Then DefHeight = 215
						lItems = DBStructures.getTaskRecordGroupHeightGL_VAL($" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${oItem}' and a.uniquekey='${oUKey}'"$, DefHeight)
					End If
					If (lItems > 0) Then lItems = lItems +2
				Else
					If (ShareCode.ISPHONE) Then 
						DefHeight = 110dip
					Else 
						If (oValType = 1) Then
							DefHeight = 60dip
						End If
					End If
					Dim lItems As Int = DBStructures.getTaskRecordGroupHeight_VAL($" and a.task_tagcode='${CurrentCLA.Task}' and a.parent='${oItem}'"$, DefHeight, DefHeight)
					If (lItems = 0) Then
						'If (ShareCode.ISPHONE) Then DefHeight = 215
						lItems = DBStructures.getTaskRecordGroupHeightGL_VAL($" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${oItem}' and a.uniquekey='${oUKey}'"$, DefHeight) 
					End If
'					If Not(CurrentCLA.Request = "I_2019_190346") Then
'						If (lItems > 0) Then lItems = lItems +2
'					End If
				End If
				If (lItems = 0) Then 
					ilen = DefHeight
				Else
					ilen = lItems * DefHeight
				End If

				Dim id As ItemData
				
				id.Initialize
				id.CollapsedHeight = 50dip
				id.ExpandedHeight = 50dip + ilen + ExtraHeight 'lItems
				Dim chapter As B4XView = CreateChapter(Colors.Gray, $"${idx+1} - ${oTitle}"$, id, idx, ChapterItem)
			Else
				If (oValType = 1) Then
					TopRec = CreateLineItemRadioButton(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 2) Then
					TopRec = CreateLineItemEditBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 5) Then
					TopRec = CreateLineItemRadioButtonOne(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 6) Then
					TopRec = CreateLineItemSelectBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 7) Then
					TopRec = CreateLineItemRadioButtonBulk(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 9) Then
					TopRec = CreateLineItemDateEditBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 11) Then
					TopRec = CreateLineItemButton2(chapter, oTitle, TopRec, oItem1, oUKey, Record, infoquest)
				Else if (oValType = 12) Then
					TopRec = CreateLineItemTimeEditBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 13) Then
					TopRec = CreateLineItemNumberBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 15) Then
					Dim th As topheight = CreateLineItemGridList(chapter, oTitle, TopRec, oItem1, oUKey, gCols, gViewCols)
					'topheight(top As Int, height As Int)
					TopRec = th.top
					'id.ExpandedHeight = id.ExpandedHeight + th.height
				Else if (oValType = 16) Then
					TopRec = CreateLineItemButton2(chapter, oTitle, TopRec, oItem1, oUKey, Record, infoquest)
				Else if (oValType = 19) Then
					TopRec = CreateLineItemRulerOption(chapter, oTitle, TopRec, oItem1, oUKey)
'				Else if (oValType = 20) Then
'					TopRec = CreateLineItemGridList(chapter, oTitle, TopRec, oItem, oUKey)
				End If
				
			End If
		Next

		If Not(Initial) Then
			clListView.Add(chapter, id)
			idx = idx + 1
		End If
		
		Dim SQL As String = $"select * from requests_tasks where  request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
		Private Recordw As Cursor
		Recordw = Starter.LocalSQL.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			Recordw.Position = 0
			REPORT_GENERATED = Recordw.GetInt("report_generated") = 1
			REPORT_FILE_GENERATED = Recordw.GetString("report_file")
		End If
		Recordw.Close
		
'		clListView.ResizeItem(0, id.ExpandedHeight)
'		clListView.GetPanel(0).Tag = True

		'Dim sSQL As String = $"update  set report_generated=1, report_file='${theFile}'
		Private Record2 As Cursor
		Dim sSQL As String = $"select request_obs from requests_tasks where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
		Record2 = Starter.LocalSQL.ExecQuery(sSQL)
		If Record2.RowCount > 0 Then
			Record2.Position = 0
			If (FinalObs.IsInitialized) Then FinalObs.Text = Record2.GetString("request_obs")
		End If
		Record2.Close

	Else
		ToastMessageShow("Erro!!! Sem informação da tarefa!", True)
		listsButtonClose_Click
	End If
	Record.Close
	
	LoadingProcess = False
	
	UpdateMainLayout
	WindowStatusUpdate
	If data.Info.Map1.IsInitialized Then
		If data.Info.Map1.Size >= 1 Then
			Utils.CallApi(data.Info.Map1, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/cla-satus/update"$, "")
			Sleep(250)
		End If
	End If
	If data.Info.Map2.IsInitialized Then
		If data.Info.Map2.Size >= 1 Then
			Utils.CallApi(data.Info.Map2, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clarel-satus/update"$, "")
			Sleep(250)
		End If
	End If
	
End Sub

Sub CreateChapterNC(clr As Int, Title As String, layout As String, id As ItemData, idx As Int, Expanded As Boolean) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 100%x, id.ExpandedHeight)
	p.LoadLayout(layout)
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblGroupTitle.Text = Title
	lblGroupTitle.Tag = idx
	pnlGroupTitle.Tag = idx
	butGroupCollpseExpand.Tag = idx
	p.Tag = Expanded 'collapsed
	Return p
End Sub


Sub StartCLA_Activity2(data As RequestCLA, Entity As String)
	CurrentCLA = data
	
	
	Private Record As Cursor
	LoadingProcess = True
	Dim SQL As String = $"${DBStructures.SQL_CURRENT_TASKS} and a.tagcode='${CurrentCLA.Task}'"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		InnerlistsTabPanelExec.LoadLayout("CLA_TASK_Execution") ', Record.GetString("title")) "Acção/Checklist")
		'listsTabPanel.LoadLayout("CLA_TASK_Execution", Record.GetString("title")) '"Acção/Checklist")
		cl_topTitle.Text = Record.GetString("name")
		
		FastCloseAction = True 'Record.GetInt("fast_close") = 1
	Else
		ToastMessageShow("Erro!!! Sem informação da tarefa!", True)
		listsButtonClose_Click
	End If
	Record.Close	
	
	TabButtonChangeTerminate.Tag = CurrentCLA
	TabButtonChangeObject.Tag = CurrentCLA
	TabButtonChangeChecklist.Tag = CurrentCLA
	FINActionButton.Tag = CurrentCLA
	
	If (CurrentCLA.Status.status >=3) Then
		butChecklistRunEnd.Visible = False
		LoadExecution
	End If
	
	Private Record As Cursor
	Dim SQL As String = $"${DBStructures.SQL_GET_TASK_ITEMS} and a.task_tagcode='${CurrentCLA.Task}' order by a.position"$
	
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Dim idx As Int = 0
		Dim TopRec As Int = 0
		Dim Initial As Boolean = True
		Dim chapter As B4XView
		Dim id As ItemData
		
		For Row = 0 To Record.RowCount-1
			Record.Position = Row
			
			Dim oLevel As Int = Record.GetInt("level")
			Dim oType As Int = Record.GetInt("type")
			Dim oItem1 As String = Record.GetString("item_tagcode")
			Dim oUKey As String = Record.GetString("uniquekey")
			Dim oTitle As String = Record.GetString("title")
			Dim oValType As Int = Record.GetInt("value_type")
			Dim repeat As Int = Record.GetInt("repeat")
			
			Dim ChapterItem As RequestCLAItem = Types.MakeRequestCLAItem(CurrentCLA.Request, _
							CurrentCLA.Action, CurrentCLA.Task, oItem1, oUKey, "", "", "", "", repeat, 0, 1, "")
			
			'If (CurrentCLA.Request = "I_2019_190346") Then
				Dim oItem As String = oUKey
			'Else
			'	Dim oItem As String = oItem1
			'End If
			
			Dim gCols As Int = Record.GetInt("cols")
			Dim gViewCols As Int = Record.GetInt("viewcols") 
			
			If ((oLevel = 0) And (oType = 0)) Then
				' Verifica total de registos dependentes
				TopRec = 0
				If Not(Initial) Then
					clListView.Add(chapter, id)
					idx = idx + 1
				Else
					Initial = False
				End If 
				
				Dim DefHeight As Int = 75
				Dim ilen As Int = 0
				
				If (oValType = 15) Then
					If (ShareCode.ISPHONE) Then DefHeight = 215dip
					Dim lItems As Int = DBStructures.getTaskRecordGroupHeightGL_VAL($" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${oItem}' and a.uniquekey='${oUKey}'"$, DefHeight)					
					If (lItems > 0) Then lItems = lItems +2
				Else if (oValType = 7) Then
					If (ShareCode.ISPHONE) Then DefHeight = 225dip
					lItems = lItems +2
				Else
					If (ShareCode.ISPHONE) Then DefHeight = 110dip
					Dim lItems As Int = DBStructures.getTaskRecordGroupHeight_VAL($" and a.task_tagcode='${CurrentCLA.Task}' and a.parent='${oItem}'"$, DefHeight, DefHeight)
					If (lItems = 0) Then
						'If (ShareCode.ISPHONE) Then DefHeight = 215
						lItems = DBStructures.getTaskRecordGroupHeightGL_VAL($" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${oItem}' and a.uniquekey='${oUKey}'"$, DefHeight) 
					End If
'					If Not(CurrentCLA.Request = "I_2019_190346") Then
'						If (lItems > 0) Then lItems = lItems +2
'					End If
				End If
				If (lItems = 0) Then 
					ilen = DefHeight
				Else
					ilen = lItems * DefHeight
				End If

				Dim id As ItemData
				
				id.Initialize
				id.CollapsedHeight = 50dip
				id.ExpandedHeight = 50dip + ilen 'lItems
				Dim chapter As B4XView = CreateChapter(Colors.Gray, $"${idx+1} - ${oTitle}"$, id, idx, ChapterItem)
			Else
				If (oValType = 1) Then
					TopRec = CreateLineItemRadioButton(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 2) Then
					TopRec = CreateLineItemEditBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 5) Then
					TopRec = CreateLineItemRadioButtonOne(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 6) Then
					TopRec = CreateLineItemSelectBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 7) Then
					TopRec = CreateLineItemRadioButtonBulk(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 9) Then
					TopRec = CreateLineItemDateEditBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 11) Then
					TopRec = CreateLineItemButton2(chapter, oTitle, TopRec, oItem1, oUKey, Record, "")
				Else if (oValType = 12) Then
					TopRec = CreateLineItemTimeEditBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 13) Then
					TopRec = CreateLineItemNumberBox(chapter, oTitle, TopRec, oItem1, oUKey)
				Else if (oValType = 15) Then
					Dim th As topheight = CreateLineItemGridList(chapter, oTitle, TopRec, oItem1, oUKey, gCols, gViewCols)
					'topheight(top As Int, height As Int)
					TopRec = th.top
					id.ExpandedHeight = id.ExpandedHeight + th.height
				Else if (oValType = 16) Then
					TopRec = CreateLineItemButton2(chapter, oTitle, TopRec, oItem1, oUKey, Record, "")
				Else if (oValType = 19) Then
					TopRec = CreateLineItemRulerOption(chapter, oTitle, TopRec, oItem1, oUKey)
				End If
				
				
			End If

		Next
		If Not(Initial) Then
			clListView.Add(chapter, id)
			idx = idx + 1
		End If

	Else
		ToastMessageShow("Erro!!! Sem informação da tarefa!", True)
		listsButtonClose_Click
	End If
	Record.Close
	LoadingProcess = False
	
	UpdateMainLayout
	WindowStatusUpdate
	
End Sub

'CLA_ITEM_Editbox
'CLA_ITEM_RadioB2
'CLA_ITEM_GridList


Sub CreateLineItemTimeEditBox(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 75dip
	Else
		Dim height As Int = 100dip
	End If
	
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("CLA_ITEM_TimeEdit") '"CLA_ITEM_Editbox2_device_2")
'	If Not(ShareCode.ISPHONE) Then
'		p.LoadLayout("CLA_ITEM_Editbox2")
'	Else
'		p.LoadLayout("CLA_ITEM_Editbox2_device_2")
'	End If
	p.RemoveView
	p.Tag = ItemTagcode
	CLAItemLabel.Text = Title
	Private Record As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' 
						and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Dim AllSQL As String = $"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$
	Log(AllSQL)
	Record = Starter.LocalSQL.ExecQuery(AllSQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		CLAItemTimeEditValue.EditText.InputType = Bit.Or(CLAItemTimeEditValue.EditText.INPUT_TYPE_TEXT, 4096) 'Maiusculas
		CLAItemTimeEditValue.Text = Record.GetString("value")
		CLAItemTimeEditValue.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		p.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record.GetString("request_tagcode"), _
				Record.GetString("action_tagcode"), _
				Record.GetString("task_tagcode"), _
				Record.GetString("item_tagcode"), _
				Record.GetString("uniquekey"), _
				Record.GetString("tagcode"),"", "", "", 3, 0, 0, "")
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record.Close
	CLAButtonOptions.Tag = CLAItem

	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	'clListView.ExpandItem(0)
	Posis = Posis + height '115dip
	Return Posis
End Sub

Sub CreateLineItemDateEditBox(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 75dip
	Else
		Dim height As Int = 100dip
	End If
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("CLA_ITEM_DateEdit") '"CLA_ITEM_Editbox2_device_2")
'	If Not(ShareCode.ISPHONE) Then
'		p.LoadLayout("CLA_ITEM_Editbox2")
'	Else
'		p.LoadLayout("CLA_ITEM_Editbox2_device_2")
'	End If
	p.RemoveView
	p.Tag = ItemTagcode
	CLAItemLabel.Text = Title
	Private Record As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' 
						and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Dim AllSQL As String = $"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$
	Log(AllSQL)
	Record = Starter.LocalSQL.ExecQuery(AllSQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		CLAItemDateEditValue.EditText.InputType = Bit.Or(CLAItemDateEditValue.EditText.INPUT_TYPE_TEXT, 4096) 'Maiusculas
		CLAItemDateEditValue.Text = Record.GetString("value")
		CLAItemDateEditValue.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		p.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record.GetString("request_tagcode"), _
				Record.GetString("action_tagcode"), _
				Record.GetString("task_tagcode"), _
				Record.GetString("item_tagcode"), _
				Record.GetString("uniquekey"), _
				Record.GetString("tagcode"),"", "", "", 3, 0, 0, "")
		'CLAButtonOptions.Tag = CLAItem
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record.Close
	CLAButtonOptions.Tag = CLAItem

	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	'clListView.ExpandItem(0)
	Posis = Posis + height '115dip
	Return Posis
End Sub

Sub CreateLineItemEditBox(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 75dip
	Else
		Dim height As Int = 100dip
	End If
	
	Dim ExtraInfo As String = ""
	Private Record As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Dim AllSQL As String = $"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$
	Record = Starter.LocalSQL.ExecQuery(AllSQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		'ExtraInfo = Record.GetString("info")
		If Utils.NNE(ExtraInfo) Then
			height = height + 55
		End If
	End If
	
	'CLA_ITEM_DateEdit
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("CLA_ITEM_Editbox_Horizontal_device") '"CLA_ITEM_Editbox2_device_2")
'	If Not(ShareCode.ISPHONE) Then
'		p.LoadLayout("CLA_ITEM_Editbox2")
'	Else
'		p.LoadLayout("CLA_ITEM_Editbox2_device_2")
'	End If
	p.RemoveView
	p.Tag = ItemTagcode
	CLAItemLabel.Text = Title
	'CLAItemEditValue.Hint = Title

	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim vtype As Int = Record.GetInt("val_datatype")
		Dim vfrmt As Int = Record.GetInt("val_format")
		'CLAItemEditValue.EditText.Typeface = Typeface.
		
		CLAItemEditValue.Hint = Record.GetString("val_title")
		'val_datatype, val_format
		If ((vtype=0) Or (vtype=2)) Then
			If (vfrmt=1) Then
				CLAItemEditValue.EditText.InputType = Bit.Or(CLAItemEditValue.EditText.INPUT_TYPE_TEXT, 4096) 'Maiusculas
			else If (vfrmt=2) Then
				CLAItemEditValue.EditText.InputType = Bit.Or(CLAItemEditValue.EditText.INPUT_TYPE_TEXT, 16384) 'Maiusculas
			End If
		else If (vtype=13) Then
			CLAItemEditValue.EditText.InputType = CLAItemEditValue.EditText.INPUT_TYPE_NUMBERS
		else If (vtype=14) Then
			CLAItemEditValue.EditText.InputType = CLAItemEditValue.EditText.INPUT_TYPE_DECIMAL_NUMBERS
		else If (vtype=18) Then
			CLAItemEditValue.EditText.InputType = Bit.Or(CLAItemEditValue.EditText.INPUT_TYPE_TEXT, 32)
		End If
		
		CLAItemEditValue.Text = Record.GetString("value")
		CLAItemEditValue.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		p.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record.GetString("request_tagcode"), _
				Record.GetString("action_tagcode"), _
				Record.GetString("task_tagcode"), _
				Record.GetString("item_tagcode"), _
				Record.GetString("uniquekey"), _
				Record.GetString("tagcode"),"", "", "", 3, 0, 0, "")
		CLAButtonOptions.Tag = CLAItem
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record.Close

	
	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	'clListView.ExpandItem(0)
	Posis = Posis + height '115dip
	Return Posis
End Sub

Sub CreateLineItemNumberBox(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 75dip
	Else
		Dim height As Int = 100dip
	End If
	
	'CLA_ITEM_DateEdit
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("CLA_ITEM_Editbox_Horizontal_device")
'	If Not(ShareCode.ISPHONE) Then
'		p.LoadLayout("CLA_ITEM_Editbox2")
'	Else
'		p.LoadLayout("CLA_ITEM_Editbox2_device_2")
'	End If
	p.RemoveView
	p.Tag = ItemTagcode
	CLAItemLabel.Text = Title
	
	Private Record As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Dim AllSQL As String = $"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$
	Log(AllSQL)
	Record = Starter.LocalSQL.ExecQuery(AllSQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		CLAItemEditValue.Hint = Record.GetString("val_title")
		CLAItemEditValue.EditText.InputType = CLAItemEditValue.EditText.INPUT_TYPE_NUMBERS
		CLAItemEditValue.Text = Record.GetString("value_default")
		If Not(Utils.isNullOrEmpty(Record.GetString("value"))) Then
			CLAItemEditValue.Text = Record.GetString("value")
		End If
		CLAItemEditValue.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		p.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record.GetString("request_tagcode"), _
				Record.GetString("action_tagcode"), _
				Record.GetString("task_tagcode"), _
				Record.GetString("item_tagcode"), _
				Record.GetString("uniquekey"), _
				Record.GetString("tagcode"),"", "", "", 3, 0, 0, "")
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record.Close
	CLAButtonOptions.Tag = CLAItem
	
	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	'clListView.ExpandItem(0)
	Posis = Posis + height '115dip
	Return Posis
End Sub

Sub CreateLineItemRulerOption(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 90dip
	Else
		Dim height As Int = 100dip
	End If
	
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("CLA_ITEM_Ruler_Device")
	'p.LoadLayout("CLA_ITEM_RulerOption_Device")
	p.RemoveView
	p.Tag = ItemTagcode
	CLAItemLabel.Text = Title

	
'	Private Row As Int = 0
	Private Record As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' 
					and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Record = Starter.LocalSQL.ExecQuery($"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$)
	
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim vtype As Int = Record.GetInt("val_datatype")
		Dim options As String = Record.GetString("value_options")
		Dim vfrmt As Int = Record.GetInt("val_format")
		Dim points As Double = Record.GetDouble("points")
		Dim risk As Int = Record.GetInt("risk")
		Dim valMin As Int = Record.GetInt("val_min")
		Dim valMax As Int = Record.GetInt("val_max")
		CLAItemRulerValueMin.text = valMin
		CLAItemRulerValueMax.text = valMax
		
		Dim i As Int = 0
		If IsNumber(Record.GetString("value")) Then
			i = Record.GetString("value")
		End If
		CLAItemRulerValue.Value = i
		CLAItemRulerValueCurrent.Text = CLAItemRulerValue.Value
		CLAItemRulerValue.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		
'		If (i = 0) Then
'			SelectOptionPanel.Color = Consts.ColorSelecNotSelected
'		Else
'			SelectOptionPanel.Color = Consts.ColorSelecSelected
'		End If
		SelectOptionPanel.Tag = $"${i}|${points}|${risk}"$
		
		p.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record.GetString("request_tagcode"), _
				Record.GetString("action_tagcode"), _
				Record.GetString("task_tagcode"), _
				Record.GetString("item_tagcode"), _
				Record.GetString("uniquekey"), _
				Record.GetString("tagcode"),"", "", "", 3, 0, 0, "")
		CLAButtonOptions.Tag = CLAItem
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record.Close

	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	'clListView.ExpandItem(0)
	Posis = Posis + height '115dip
	Return Posis
End Sub

Sub CreateLineItemSelectBox(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 75dip
	Else
		Dim height As Int = 100dip
	End If
	
	Dim ExtraInfo As String = ""
	Private Record As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Record = Starter.LocalSQL.ExecQuery($"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$)
	Dim TotalRecords As Int = Record.RowCount
	If TotalRecords > 0 Then
		Record.Position = 0
		'ExtraInfo = Record.GetString("info")
		If Utils.NNE(ExtraInfo) Then
			height = height + 55
		End If
	End If
	
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("CLA_ITEM_SelectBox_Device")
	p.RemoveView
	p.Tag = ItemTagcode
	CLAItemLabel.Text = Title

	
'	Private Row As Int = 0
	
	If TotalRecords > 0 Then
		Record.Position = 0
		Dim vtype As Int = Record.GetInt("val_datatype")
		Dim options As String = Record.GetString("value_options")
		Dim vfrmt As Int = Record.GetInt("val_format")
		Dim points As Double = Record.GetDouble("points")
		Dim risk As Int = Record.GetInt("risk")

		If Not(Utils.isNullOrEmpty(options)) Then
			Dim Columns As List = Regex.Split("\|", options )
			CLAItemSelectValue.AddAll(Columns)
		End If
		Dim i As Int = 0
		
		If IsNumber(Record.GetString("value")) Then
			i = Record.GetString("value")
		End If
		CLAItemSelectValue.SelectedIndex = 	i 'Record.GetString("value") ' CLAItemSelectValue.IndexOf(Record.GetString("value"))
		CLAItemSelectValue.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		
		If (i = 0) Then
			SelectOptionPanel.Color = Consts.ColorSelecNotSelected
		Else
			SelectOptionPanel.Color = Consts.ColorSelecSelected
		End If
		SelectOptionPanel.Tag = $"${i}|${points}|${risk}"$
		
		p.Tag = $"${Record.GetString("request_tagcode")}|${Record.GetString("action_tagcode")}|${Record.GetString("task_tagcode")}|${Record.GetString("item_tagcode")}|${Record.GetString("uniquekey")}|${Record.GetString("tagcode")}|1|0"$
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record.GetString("request_tagcode"), _
				Record.GetString("action_tagcode"), _
				Record.GetString("task_tagcode"), _
				Record.GetString("item_tagcode"), _
				Record.GetString("uniquekey"), _
				Record.GetString("tagcode"),"", "", "", 3, 0, 0, "")
		CLAButtonOptions.Tag = CLAItem
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record.Close

	
	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	'clListView.ExpandItem(0)
	Posis = Posis + height '115dip
	Return Posis
End Sub

Sub CreateLineItemRadioButton(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 60dip
	Else
		Dim height As Int = 100dip
	End If
	
	Dim ExtraInfo As String = ""
	Private Record2 As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Record2 = Starter.LocalSQL.ExecQuery($"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$)
	If Record2.RowCount > 0 Then
		Record2.Position = 0
		'ExtraInfo = Record2.GetString("info")
		If Utils.NNE(ExtraInfo) Then
			height = height + 55
		End If
	End If
	
	Dim p As Panel
	p.Initialize("CLALineClick")
	'If 
	'butChecklistRunAction this
	
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	'p.LoadLayout("CLA_ITEM_RadioB2")
	If Not(ShareCode.ISPHONE) Then
		p.LoadLayout("CLA_ITEM_RadioB2")
	Else
		p.LoadLayout("CLA_ITEM_RadioB2_device_2")
	End If
	
	p.RemoveView
	p.Tag = ItemTagcode
	CLAItemTitle.Text = Title
'	Private Row As Int = 0
	If Record2.RowCount > 0 Then
		Record2.Position = 0
		
		CLAItemButton_1.Tag = $"${Record2.GetString("request_tagcode")}|${Record2.GetString("action_tagcode")}|${Record2.GetString("task_tagcode")}|${Record2.GetString("item_tagcode")}|${Record2.GetString("uniquekey")}|${Record2.GetString("tagcode")}|1|0"$
		CLAItemButton_2.Tag = $"${Record2.GetString("request_tagcode")}|${Record2.GetString("action_tagcode")}|${Record2.GetString("task_tagcode")}|${Record2.GetString("item_tagcode")}|${Record2.GetString("uniquekey")}|${Record2.GetString("tagcode")}|2|0"$
			
		Dim Status As Int = Record2.GetInt("status")
		If (Status > 0) Then 
			CLAItemButton_1.State = 1
		End If
		
		If (Record2.RowCount > 1) Then
			Record2.Position = 1
			'CLAItemButton_2.Tag = $"${Record2.GetString("request_tagcode")}|${Record2.GetString("action_tagcode")}|${Record2.GetString("task_tagcode")}|${Record2.GetString("item_tagcode")}|${Record2.GetString("uniquekey")}|${Record2.GetString("tagcode")}|2|0"$
			Dim Status As Int = Record2.GetInt("status")
			If (Status > 0) Then
				CLAItemButton_2.State = 1
			End If
		End If
'		For Row = 0 To Record.RowCount-1
'			Record.Position = Row
'			Ret.Add(Record.GetInt("status"))
'		Next

		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record2.GetString("request_tagcode"), _
				Record2.GetString("action_tagcode"), _
				Record2.GetString("task_tagcode"), _
				Record2.GetString("item_tagcode"), _
				Record2.GetString("uniquekey"), _
				Record2.GetString("tagcode"),"", "", "", 3, 0, 0, "")
		CLAButtonOptions.Tag = CLAItem
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record2.Close
	
	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	Posis = Posis + height '115dip
	Return Posis
End Sub

Sub CreateLineItemButton2(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, _
				UniqueKey As String, outRecord As Cursor, InfoTitle As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 60dip
	Else
		Dim height As Int = 100dip
	End If
	
	Dim ExtraInfo As String = InfoTitle  '""
	Private Record2 As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Dim AllSQL As String = $"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$
	Record2 = Starter.LocalSQL.ExecQuery(AllSQL)
	Dim TotalRecords As Int = Record2.RowCount
	If TotalRecords > 0 Then
'		Record2.Position = 0
'		ExtraInfo = Record2.GetString("info")
'		If Utils.NNE(ExtraInfo) Then
'			height = height + 55
'		End If
	End If
	
	If Utils.NNE(ExtraInfo) Then
		height = height + 55
	End If
	
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	
	Dim Mandatory As Int = outRecord.GetInt("mandatory")
	Dim Repeat As Int = outRecord.GetInt("repeat")
	Dim Multi As Int = outRecord.GetInt("multi")
	Dim Critical As Int = outRecord.GetInt("critical")
	
	Try
		Dim Row As Int = 0
		'p.LoadLayout("CLA_ITEM_RadioB2")
		If Not(ShareCode.ISPHONE) Then
			If (TotalRecords = 2) Then
				If Utils.NNE(ExtraInfo) Then
					p.LoadLayout("CLA_ITEM_RadioB2_Info")
				Else
					p.LoadLayout("CLA_ITEM_RadioB2")
				End If
			else If (TotalRecords = 3) Then
				If Utils.NNE(ExtraInfo) Then
					p.LoadLayout("CLA_ITEM_RadioB3_Info")
				Else
					p.LoadLayout("CLA_ITEM_RadioB3")
				End If
			Else If (TotalRecords = 4) Then
				If Utils.NNE(ExtraInfo) Then
					p.LoadLayout("CLA_ITEM_RadioB4_Info")
				Else
					p.LoadLayout("CLA_ITEM_RadioB4")
				End If
			Else If (TotalRecords = 5) Then
				p.LoadLayout("CLA_ITEM_RadioB5")
			Else If (TotalRecords = 6) Then
				p.LoadLayout("CLA_ITEM_RadioB6")
			End If
		Else
			p.LoadLayout("CLA_ITEM_RadioB2_device_2")
		End If
		p.RemoveView
		p.Tag = ItemTagcode
		
		
		CLAItemTitle.Text = Title
		CLAItemTitleInfo.Text = ExtraInfo
		If (Mandatory=1) Then CLAMandatory.TextColor = Consts.ColorYellow
		If (Critical=1) Then CLACritical.TextColor = Consts.ColorRed
		
		If TotalRecords > 0 Then
			For Row = 0 To TotalRecords-1
				Record2.Position = Row
				Dim Status As Int = Record2.GetInt("status")
				Dim cnf As Int = Record2.GetInt("conform_type")
				
				If (Row = 0) Then
					Dim btn As B4XStateButton = CLAItemButton_1
				Else If (Row = 1) Then
					Dim btn As B4XStateButton = CLAItemButton_2
				Else If (Row = 2) Then
					Dim btn As B4XStateButton = CLAItemButton_3
				Else If (Row = 3) Then
					Dim btn As B4XStateButton = CLAItemButton_4
				Else If (Row = 4) Then
					Dim btn As B4XStateButton = CLAItemButton_5
				Else If (Row = 5) Then
					Dim btn As B4XStateButton = CLAItemButton_6
				Else
					Dim btn As B4XStateButton
					btn.Initialize(Me, "")
				End If
				If (btn.IsInitialized) Then
					If (Multi = 0) Then
						
						btn.ButtonGroup = 1
					Else
						btn.ButtonGroup = 0
						btn.SecondStateColor = Consts.ColorBlue
					End If

					btn.Text = Record2.GetString("val_title")
					btn.Tag = $"${Record2.GetString("request_tagcode")}|${Record2.GetString("action_tagcode")}|
								${Record2.GetString("task_tagcode")}|${Record2.GetString("item_tagcode")}|
								${Record2.GetString("uniquekey")}|${Record2.GetString("tagcode")}|
								${Row+1}|0"$
								
					If (cnf = 1) Then
						btn.SecondStateColor = Consts.ColorGreen
					else If (cnf = 2) Then
						btn.SecondStateColor = Consts.ColorRed
					Else
						btn.SecondStateColor = Consts.ColorBlue
					End If
					
					If (Status > 0) Then
						btn.State = 1
					End If
					btn.Conformity = cnf
				End If
					
				Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record2.GetString("request_tagcode"), _
						Record2.GetString("action_tagcode"), _
						Record2.GetString("task_tagcode"), _
						Record2.GetString("item_tagcode"), _
						Record2.GetString("uniquekey"), _
						"","", "", "", 3, 0, 0, "")
				'Record2.GetString("tagcode"),"", "", "", 3, 0, 0)
				CLAButtonOptions.Tag = CLAItem
			Next
		Else
			Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
		End If
		Record2.Close
	
	Catch
		Log(LastException)
		Log(AllSQL)
	End Try
	
	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	Posis = Posis + height '115dip
	Return Posis
End Sub

Sub CreateLineItemRadioButtonOne(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 65dip
	Else
		Dim height As Int = 100dip
	End If
	
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("CLA_ITEM_RadioB1_device_2")
	p.RemoveView
	p.Tag = ItemTagcode
	CLAItemButton_1.Text = Title
'	CLAItemButton_1.ButtonGroup = 0
'	Private Row As Int = 0
	Private Record2 As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Record2 = Starter.LocalSQL.ExecQuery($"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$)
	If Record2.RowCount > 0 Then
		Record2.Position = 0
		CLAItemButton_1.Tag = $"${Record2.GetString("request_tagcode")}|${Record2.GetString("action_tagcode")}|${Record2.GetString("task_tagcode")}|${Record2.GetString("item_tagcode")}|${Record2.GetString("uniquekey")}|${Record2.GetString("tagcode")}|1|0"$
		Dim Status As Int = Record2.GetInt("status")
		If (Status > 0) Then 
			CLAItemButton_1.State = 1
		End If
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record2.GetString("request_tagcode"), _
				Record2.GetString("action_tagcode"), _
				Record2.GetString("task_tagcode"), _
				Record2.GetString("item_tagcode"), _
				Record2.GetString("uniquekey"), _
				Record2.GetString("tagcode"),"", "", "", 3, 0, 0, "")
		CLAButtonOptions.Tag = CLAItem
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record2.Close
	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	Posis = Posis + height '115dip
	Return Posis
End Sub


Sub makeState(btn As B4XStateButton, tags As String)
	btn.State = 1
	btn.Tag = tags
End Sub

Sub CreateLineItemRadioButtonBulk(chapter As B4XView, Title As String, Posis As Int, ItemTagcode As String, UniqueKey As String) As Int
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 65dip
	Else
		Dim height As Int = 215dip
	End If
	
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, height) '115dip)
	p.LoadLayout("CLA_ITEM_RadioBB_device_2")
	
	p.RemoveView
	p.Tag = ItemTagcode
	Private Record2 As Cursor
	Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Record2 = Starter.LocalSQL.ExecQuery($"${DBStructures.SQL_GET_TASK_ITEM_VALUE} ${sSQL} order by a.request_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode,  a.id"$)
	If Record2.RowCount > 0 Then
		Record2.Position = 0
		
		Dim tags As String = $"${Record2.GetString("request_tagcode")}|${Record2.GetString("action_tagcode")}|${Record2.GetString("task_tagcode")}|${Record2.GetString("item_tagcode")}|${Record2.GetString("uniquekey")}|${Record2.GetString("tagcode")}|1|0"$
		Dim Status As Int = Record2.GetInt("status")
		
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record2.GetString("request_tagcode"), _
				Record2.GetString("action_tagcode"), _
				Record2.GetString("task_tagcode"), _
				Record2.GetString("item_tagcode"), _
				Record2.GetString("uniquekey"), _
				Record2.GetString("tagcode"),"", "", "", 3, 0, 0, "")
		CLAButtonOptions.Tag = CLAItem
		
		If (Status > 0) Then
			Dim vVal As String = Record2.GetString("value")
			If (vVal = "0") Then makeState(CLAButtonOpt0, tags)
			If vVal = "1" Then makeState(CLAButtonOpt1, tags)
			If vVal = "2" Then makeState(CLAButtonOpt2, tags)
			If vVal = "3" Then makeState(CLAButtonOpt3, tags)
			If vVal = "4" Then makeState(CLAButtonOpt4, tags)
			If vVal = "5" Then makeState(CLAButtonOpt5, tags)
			If vVal = "6" Then makeState(CLAButtonOpt6, tags)
			If vVal = "7" Then makeState(CLAButtonOpt7, tags)
			If vVal = "8" Then makeState(CLAButtonOpt8, tags)
			If vVal = "9" Then makeState(CLAButtonOpt9, tags)
			If vVal = "14" Then makeState(CLAButtonOpt14, tags)
			If vVal = "15" Then makeState(CLAButtonOpt15, tags)
			If vVal = "16" Then makeState(CLAButtonOpt16, tags)
			If vVal = "17" Then makeState(CLAButtonOpt17, tags)
			If vVal = "18" Then makeState(CLAButtonOpt18, tags)
			If vVal = "19" Then makeState(CLAButtonOpt19, tags)
			If vVal = "20" Then makeState(CLAButtonOpt20, tags)
			If vVal = "21" Then makeState(CLAButtonOpt21, tags)
			If vVal = "41" Then makeState(CLAButtonOpt41, tags)
			If vVal = "42" Then makeState(CLAButtonOpt42, tags)
			If vVal = "43" Then makeState(CLAButtonOpt43, tags)
			If vVal = "44" Then makeState(CLAButtonOpt44, tags)
			If vVal = "45" Then makeState(CLAButtonOpt45, tags)
			If vVal = "46" Then makeState(CLAButtonOpt46, tags)
			If vVal = "47" Then makeState(CLAButtonOpt47, tags)
			If vVal = "48" Then makeState(CLAButtonOpt48, tags)
			
'			For Each v As View In p.GetAllViewsRecursive
'				
'				If (v Is B4XStateButton) Then
'					Dim n As B4XStateButton = v
'					n.tag = CLAItem
'					If (n.text = Record2.GetString("value")) Then
'						n.State = 1
'					End If
'				End If
'			Next
		End If
	Else
		Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
	End If
	Record2.Close
	pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
	Posis = Posis + height '115dip
	Return Posis
End Sub


Sub CreateLineItemGridList(chapter As B4XView, Title As String, Posis As Int, _
		ItemTagcode As String, UniqueKey As String, gCols As Int, gViewCols As Int) As topheight
		
	Dim th As topheight
	th.Initialize '(top As Int, height As Int)
	
	Private Record As Cursor
	Dim Condition As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}'"$
	Dim SQLScript As String = $"${DBStructures.SQL_GET_TASK_GRIDITEMS} ${Condition}"$
	
	If Not(ShareCode.ISPHONE) Then
		Dim height As Int = 60dip
	Else
		Dim height As Int = 215dip
	End If

	Record = Starter.LocalSQL.ExecQuery(SQLScript)
	If Record.RowCount > 0 Then
		th.height = height * Record.RowCount
		For Row = 0 To Record.RowCount-1
			Record.Position = Row
			Dim p As Panel
			p.Initialize("CLALineClick")
			Activity.AddView(p, 0, 0, 100%x, height) '115dip)
			
			
			If (gViewCols = 2) Then
				p.LoadLayout("CLA_ITEM_GridList2Columns")
			Else If (gViewCols = 3) Then
				If Not(ShareCode.ISPHONE) Then
					p.LoadLayout("CLA_ITEM_GridListCols")
				Else
					p.LoadLayout("CLA_ITEM_GridListCols_device_2")
				End If
			Else
				If Not(ShareCode.ISPHONE) Then
					p.LoadLayout("CLA_ITEM_GridList")
				Else
					p.LoadLayout("CLA_ITEM_GridList_device_2")
				End If
			End If
			p.RemoveView
			p.Tag = ItemTagcode
			
			Dim Tagcode As String = Record.GetString("tagcode")
			Dim StatusIcon As Int = 0
			
			Dim sValue As String = Utils.IfNullOrEmpty(Record.GetString("val_title"), "")
			If (sValue <> "") Then
				If (gViewCols = 2) Then
					Dim Columns As List = Regex.Split("\|", sValue )
					CLAItem_G1.Text = Utils.IfNullOrEmpty(Record.GetString("request_text"), "")
					CLAItem_G2.Text = Columns.Get(0) 'sValue
					CLAItem_G3.Text = Columns.Get(1) 'sValue
				Else If (gViewCols = 3) Then
					Dim Columns As List = Regex.Split("\|", sValue )
					If Columns.Size>=1 Then CLAItem_G1.Text = Columns.Get(0)
					If Columns.Size>=2 Then CLAItem_G2.Text = Columns.Get(1)
					If Columns.Size>=3 Then CLAItem_G3.Text = Columns.Get(2)
					If Columns.Size>=4 Then CLAItem_G4.Text = Columns.Get(3)
					If Columns.Size>=5 Then CLAItem_G5.Text = Columns.Get(4)
					If Columns.Size>=6 Then CLAItem_G6.Text = Columns.Get(5)
					If Columns.Size>=7 Then CLAItem_G7.Text = Columns.Get(6)
				Else
					StatusIcon = 1
					Dim Columns As List = Regex.Split("\|", sValue )

					CLAItem_G1.Text = Utils.IfNullOrEmpty(Record.GetString("request_stime"), "")
					CLAItem_G2.Text = Utils.IfNullOrEmpty(Record.GetString("request_text"), "")
					CLAItem_G3.Text = Columns.Get(0)
					CLAItem_G4.Text = Columns.Get(1)
					CLAItem_G5.Text = Columns.Get(2)
					CLAItem_G6.Text = Columns.Get(3)
					CLAItem_G7.Text = Columns.Get(4)
				End If
			End If
			
			Private Record2 As Cursor
			Dim sSQL As String = $" and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}' and a.item_tagcode='${ItemTagcode}' and a.uniquekey='${UniqueKey}' and a.tagcode='${Tagcode}'"$
			Dim sSQL1 As String = $"${DBStructures.SQL_GET_TASK_ITEM_VALUE_GRID} ${sSQL} order by a.id"$
			Record2 = Starter.LocalSQL.ExecQuery(sSQL1)
			If Record2.RowCount > 0 Then
				Record2.Position = 0
				
				Dim Status As Int = Record2.GetInt("status")
				If (Status = 1) Then
					CLAItemButton_2.State = 1
					'CLAItemButton_1.State = 1
				Else If (Status = 2) Then
					'CLAItemButton_2.State = 1
					CLAItemButton_1.State = 1
				End If
		
'				For Row = 0 To Record.RowCount-1
'					Record.Position = Row
'					Ret.Add(Record.GetInt("status"))
'				Next
				CLAItemButton_1.Tag = $"${Record2.GetString("request_tagcode")}|${Record2.GetString("action_tagcode")}|${Record2.GetString("task_tagcode")}|${Record2.GetString("item_tagcode")}|${Record2.GetString("uniquekey")}|${Record2.GetString("tagcode")}|2|${StatusIcon}"$
				CLAItemButton_2.Tag = $"${Record2.GetString("request_tagcode")}|${Record2.GetString("action_tagcode")}|${Record2.GetString("task_tagcode")}|${Record2.GetString("item_tagcode")}|${Record2.GetString("uniquekey")}|${Record2.GetString("tagcode")}|1|${StatusIcon}"$

				Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record2.GetString("request_tagcode"), _
					Record2.GetString("action_tagcode"), _
					Record2.GetString("task_tagcode"), _
					Record2.GetString("item_tagcode"), _
					Record2.GetString("uniquekey"), _
					Record2.GetString("tagcode"),"", "", "", 3, 0, 0, "")
				CLAButtonOptions.Tag = CLAItem
			Else
				Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem("", "", "", "", "", "","", "", "", 3, 0, 0, "")
			End If
			Record2.Close
	
			pnlExpanded.AddView(p, 0, Posis, chapter.Width, height) '115dip)
			Posis = Posis + height '115dip
		Next
		'Ret = Record.GetInt("total")
	End If
	Record.Close
	th.top = Posis
	
	Return th 'Posis
End Sub

Sub CreateChapter(clr As Int, Title As String, id As ItemData, idx As Int, ChapterItem As RequestCLAItem) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 100%x, id.ExpandedHeight) 'clListView.AsView.Width
	p.LoadLayout("CL_checkListItemView")
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblTitle.Text = Title
	pnlTitle.Tag = idx
	
	If (ChapterItem.Origin = 1) Then
		butMoreLeft.Visible = True
		butMoreLeft.Tag = ChapterItem
		butAddMore.Visible = True
		butAddMore.Tag = ChapterItem
		butMoreRight.Visible = True
		butMoreRight.Tag = ChapterItem
	End If
	
	
	p.Tag = False 'collapsed
	Return p
End Sub

Sub MakeMapArray(count As Int, field As String, value As Int) As Object
	Dim vals(count) As Map
	For i=0 To count-1
		vals(i).Initialize
		vals(i).Put(field, value)
	Next
	Return vals
End Sub

Sub ShadeColor(clr As Int) As Int
	Dim argb() As Int = GetARGB(clr)
	Dim factor As Float = 0.75
	Return xui.Color_RGB(argb(1) * factor, argb(2) * factor, argb(3) * factor)
End Sub

Sub GetARGB(Color As Int) As Int()
	Private res(4) As Int
	res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000000), 24)
	res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0xff0000), 16)
	res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00), 8)
	res(3) = Bit.And(Color, 0xff)
	Return res
End Sub

Sub CollapseItem(index As Int)
	Dim id As ItemData = clListView.GetValue(index)
	clListView.ResizeItem(index, id.CollapsedHeight)
	clListView.GetPanel(index).Tag = False
	'AnimatedArrow(index, 180, 0)
	
	If (pnlCurrenIndex <> index) Then
		clListView.GetPanel(pnlCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
		clListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		butCollpseExpand.text = Types.EXPAND_ICON
		pnlCurrenIndex = index
	Else
		butCollpseExpand.text = Types.EXPAND_ICON
	End If
	
End Sub

Sub ExpandItem (index As Int)
	Dim id As ItemData = clListView.GetValue(index)
	clListView.ResizeItem(index, id.ExpandedHeight)
	clListView.GetPanel(index).Tag = True
	'AnimatedArrow(index, 0, 180)
	If (pnlCurrenIndex <> index) Then 
		clListView.GetPanel(pnlCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
		clListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		clListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
		pnlCurrenIndex = index
	Else
		clListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
	End If
End Sub

Sub AnimatedArrow(index As Int, From As Int, ToDegree As Int)
	pnlTitle = clListView.GetPanel(index).GetView(0) 'pnlTitle is the first item
	Dim iv As B4XView = pnlTitle.GetView(1) 'ImageView1 is the second item
	iv.SetRotationAnimated(0, From)
	iv.SetRotationAnimated(clListView.AnimationDuration, ToDegree)
End Sub


Sub ListItemSelected(pan As Panel)
	For index= 0 To clListView.GetSize-1
		Dim p As Panel = clListView.GetPanel(index)
		p.Color = Consts.ColorWhite
	Next
	pan.Color = Consts.ColorCianSoftLight
End Sub

Sub clListView_ItemClick (Index As Int, Value As Object)
	Dim pan As B4XView = clListView.GetPanel(Index)
	If pan.Tag = True Then
		CollapseItem(Index)
	Else
		ExpandItem(Index)
	End If
'	panelActionOptions.Visible = False
	ListItemSelected(pan)
End Sub

Sub clListView_ItemLongClick (Index As Int, Value As Object)
'	panelActionOptions.Visible = True
End Sub

Sub FindExapnded As Int 'ignore
	For i = 0 To clListView.GetSize - 1
		If clListView.GetPanel(i).Tag = True Then Return i
	Next
	Return -1
End Sub

Sub butPhoto_Click
'	panelActionOptions.Visible = False
End Sub

Sub butTask_Click
'	panelActionOptions.Visible = False
End Sub



'**********************************************************************************
'	CHAMA PROPRIEDADES ADICIONAIS DA OPÇÃO
'**********************************************************************************

Sub butActions_Click
	Dim DIA As DialogItemActions
	DIA.Initialize(Activity, ActionOptionsPanel)
	'DIA.StartDlgIOActivity("")
'	panelActionOptions.Visible = False
End Sub


Public Sub RemoveActionOptionsPanel
	If ActionOptionsPanel.NumberOfViews > 0 Then ActionOptionsPanel.RemoveAllViews
	ActionOptionsPanel.SetVisibleAnimated(100, False)
	'If ActionOptionsPanel.Visible Then ActionOptionsPanel.Visible = False
End Sub

Sub butActionsClose_Clickhjh
'	panelActionOptions.Visible = False
End Sub


Sub clListView_ReachEnd
	
End Sub

Sub clListView_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
	
End Sub

Sub listsButtonClose_Click
	saveFinalObs
	'CallSubDelayed2(requests2, "ListsReturn", "")
	CallSubDelayed2(requests3, "ListsReturn", "")
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

Sub listsButtonPauseRun_Click
	If (CLRunning) Then
		Dim n As Int = -Msgbox2("Deseja parar a execução da CheckList?", "Alerta!", "Sim", "Não", "", Null)
		Log(n)
		If n=1 Then
			listsButtonPauseRun.Text = Chr(0xF04B)
			CLRunning = False
			ShareCode.CLA_STATE = ShareCode.CLA_STATE + 1 
		End If 
	Else
		CLRunning = True
		listsButtonPauseRun.Text = Chr(0xF04C)
		ShareCode.CLA_STATE = ShareCode.CLA_STATE - 1
	End If
	WindowStatusUpdate
End Sub

Sub butCollpseExpand_Click
	Dim b As Button = Sender
	Dim p As Panel = b.Parent
	
	clListView_ItemClick(p.tag, "")
End Sub

Sub butConfirm_Click
	butNotConfirm.Color = Consts.ColorBlue
	butConfirm.Color = Consts.ColorGreen
	Log("Confirm")
End Sub

Sub butNotConfirm_Click
	butNotConfirm.Color = Consts.ColorBlue
	butConfirm.Color = Consts.ColorRed
	Log("Not Confirm")
End Sub

Sub CLAButtonOptions_Click
	Dim Btn As Button = Sender 'CLAButtonOptions.Tag = CLAItem
	Dim CLAItem As RequestCLAItem = Btn.Tag
	CLAItem.Origin = 3
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "CheckList2", CLAItem, 0, "", MainObservations)
End Sub

Sub CLAItemButton_StateClick (State As Int)
	Dim this As B4XStateButton = Sender
	Dim Columns As List = Regex.Split("\|", this.tag )
	
	Dim request_tagcode As String = Columns.Get(0)
	Dim action_tagcode As String = Columns.Get(1)
	Dim task_tagcode As String = Columns.Get(2)
	Dim item_tagcode As String = Columns.Get(3)
	Dim uniquekey As String = Columns.Get(4)
	Dim tagcode As String = Columns.Get(5)
	Dim val As Int = Columns.Get(6)
	Dim StatusIcon As Int = Columns.Get(7)
	
	Dim NoAnswer As Boolean = False
	If State = 0 Then
		val = 0
		NoAnswer = True
	End If
	
	Dim sACLADatetime As String = Utils.GetCurrDatetime
	Private sACLALatitude As String = ""
	Private sACLALongitude As String = ""
	If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lat)) Then sACLALatitude = LocationService.GeoLocal.lat
	If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lon)) Then sACLALongitude = LocationService.GeoLocal.lon

	Dim sSQL As String = $"update requests_values set status=0, val_date='${sACLADatetime.Trim}', val_latitude='${sACLALatitude.Trim}',
						val_longitude='${sACLALongitude.Trim}' where request_tagcode='${request_tagcode.Trim}' and
						task_tagcode='${task_tagcode.Trim}' and item_tagcode='${item_tagcode.Trim}' and 
						uniquekey='${uniquekey.Trim}'"$
	Log(sSQL)
	Starter.LocalSQL.ExecNonQuery(sSQL)
	
	Dim sSQL As String = $"update requests_values set status=${val}, val_date='${sACLADatetime.Trim}', val_latitude='${sACLALatitude.Trim}',
						val_longitude='${sACLALongitude.Trim}' where request_tagcode='${request_tagcode.Trim}' and
						task_tagcode='${task_tagcode.Trim}' and item_tagcode='${item_tagcode.Trim}' and 
						uniquekey='${uniquekey.Trim}' and tagcode='${tagcode.Trim}'"$
	Log(sSQL)
	Starter.LocalSQL.ExecNonQuery(sSQL)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", request_tagcode)
	params.Put("ACLAAction", action_tagcode)
	params.Put("ACLATask", task_tagcode)
	params.Put("ACLAItem", item_tagcode)
	params.Put("ACLAUniqueKey", uniquekey)
	params.Put("ACLATagcode", tagcode)
	params.Put("ACLAValue", val)
			
	params.Put("ACLADatetime", sACLADatetime)
	params.Put("ACLALatitude", sACLALatitude)
	params.Put("ACLALongitude", sACLALongitude)
	
	Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/update"$, "")
	Sleep(250)
	
	If (StatusIcon = 1) Then
		Dim sPanel As Panel = this.parent
		Dim sLabel As Label = sPanel.GetView(0)
		If (NoAnswer) Then
			sLabel.Text = Chr(0xF088)  'Not Answered
			sLabel.TextColor = Consts.ColorGray
		Else
			sLabel.TextColor = Consts.ColorGreen
			sLabel.Text = Chr(0xF087)
		End If
	End If
	
End Sub


Sub CLAItemEditValue_EnterPressed
	If (LoadingProcess = False) Then
		Dim this As EditText = Sender
		Dim pan As Panel = this.Parent
		Dim New As String = this.Text
		If Not(Utils.isNullOrEmpty(pan.Tag)) Then
			Dim Columns As List = Regex.Split("\|", pan.tag )
		
			Dim request_tagcode As String = Columns.Get(0)
			Dim action_tagcode As String = Columns.Get(1)
			Dim task_tagcode As String = Columns.Get(2)
			Dim item_tagcode As String = Columns.Get(3)
			Dim uniquekey As String = Columns.Get(4)
			Dim tagcode As String = Columns.Get(5)
			Dim val As Int = Columns.Get(6)
			Dim StatusIcon As Int = Columns.Get(7)
			Dim sACLADatetime As String = Utils.GetCurrDatetime
			Private sACLALatitude As String = ""
			Private sACLALongitude As String = ""
			If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lat)) Then sACLALatitude = LocationService.GeoLocal.lat
			If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lon)) Then sACLALongitude = LocationService.GeoLocal.lon

			Dim sSQL As String = $"update requests_values set value='${New}', val_date='${sACLADatetime}', val_latitude='${sACLALatitude}', val_longitude='${sACLALongitude}' where request_tagcode='${request_tagcode}' and
							task_tagcode='${task_tagcode}' and item_tagcode='${item_tagcode}' and 
							uniquekey='${uniquekey}' and tagcode='${tagcode}'"$
			Log(sSQL)
			Starter.LocalSQL.ExecNonQuery(sSQL)
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", request_tagcode)
			params.Put("ACLAAction", action_tagcode)
			params.Put("ACLATask", task_tagcode)
			params.Put("ACLAItem", item_tagcode)
			params.Put("ACLAUniqueKey", uniquekey)
			params.Put("ACLATagcode", tagcode)
			params.Put("ACLAValue", New)
			
			params.Put("ACLADatetime", sACLADatetime)
			params.Put("ACLALatitude", sACLALatitude)
			params.Put("ACLALongitude", sACLALongitude)
	
			Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/update"$, "")
			Sleep(250)

		End If
	End If
End Sub

Sub CLAItemButtonX_StateClick (State As Int)
	If (LoadingProcess = False) Then
		Dim this As B4XStateButton = Sender
		
		If Not(Utils.isNullOrEmpty(this.tag)) Then
			Dim Columns As List = Regex.Split("\|", this.tag )
			Dim New As String = this.Text
		
			Dim request_tagcode As String = Columns.Get(0)
			Dim action_tagcode As String = Columns.Get(1)
			Dim task_tagcode As String = Columns.Get(2)
			Dim item_tagcode As String = Columns.Get(3)
			Dim uniquekey As String = Columns.Get(4)
			Dim tagcode As String = Columns.Get(5)
			Dim val As Int = Columns.Get(6)
			Dim StatusIcon As Int = Columns.Get(7)
			
			Dim sACLADatetime As String = Utils.GetCurrDatetime
			Private sACLALatitude As String = ""
			Private sACLALongitude As String = ""
			If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lat)) Then sACLALatitude = LocationService.GeoLocal.lat
			If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lon)) Then sACLALongitude = LocationService.GeoLocal.lon

			Dim sSQL As String = $"update requests_values set value='${New}', status='${this.State}', val_date='${sACLADatetime}', val_latitude='${sACLALatitude}', val_longitude='${sACLALongitude}' where request_tagcode='${request_tagcode}' and
							task_tagcode='${task_tagcode}' and item_tagcode='${item_tagcode}' and 
							uniquekey='${uniquekey}' and tagcode='${tagcode}'"$
			Log(sSQL)
			Starter.LocalSQL.ExecNonQuery(sSQL)

	
			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", request_tagcode)
			params.Put("ACLAAction", action_tagcode)
			params.Put("ACLATask", task_tagcode)
			params.Put("ACLAItem", item_tagcode)
			params.Put("ACLAUniqueKey", uniquekey)
			params.Put("ACLATagcode", tagcode)
			params.Put("ACLAValue", New)
			
			params.Put("ACLADatetime", sACLADatetime)
			params.Put("ACLALatitude", sACLALatitude)
			params.Put("ACLALongitude", sACLALongitude)
	
			Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/update"$, "")
			Sleep(250)

		End If
	End If
	'CLAItemButtonX
End Sub

Sub FINSignatures_Click
	PanelSignature.Visible = True
	SignPerson.Text = "Entidade Cliente"
	
	SignatureCapture.Clear(Signature)
	If File.Exists(Starter.InternalFolder, $"fisrt_${CurrentCLA.Task}signature.png"$) Then
		Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, $"fisrt_${CurrentCLA.Task}signature.png"$, SignPanel.Width, SignPanel.Height, True)
		SignPanel.SetBackgroundImage(bg)
	End If
		
	SignCanvas.Initialize(SignPanel)
	Signature.Initialize
	Signature.Canvas = SignCanvas
	Signature.Panel = SignPanel
	Signature.SignatureColor = Colors.Black
	Signature.SignatureWidth = 3dip
End Sub

Sub SignPanel_Touch (Action As Int, X As Float, Y As Float)
	SignatureCapture.Panel_Touch(Signature, x, y, Action)
End Sub

Sub btnSaveSign_Click
	'CurrentCLA
	'${CurrentCLA.Task}
	If (CurrentSignature = 0) Then
		SignatureCapture.Save(Signature, Starter.InternalFolder, $"fisrt_${CurrentCLA.Task}signature.png"$)
		
		Dim Base64Con As Base64Convert
		Base64Con.Initialize
		Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"fisrt_${CurrentCLA.Task}signature.png"$)
		If (SignatureExists=1) Or (SignatureExists=3) Then
			Dim sSQL As String = $"update requests_signatures set image='${ImgB64}', filename='fisrt_${CurrentCLA.Task}signature.png' 
					where from_who=0 and request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
			Starter.LocalSQL.ExecNonQuery(sSQL)
		Else
			Dim sSQL As String = $"insert into requests_signatures (request_tagcode, action_tagcode, task_tagcode, image, filename, from_who) values
								('${CurrentCLA.Request}', '${CurrentCLA.Action}', '${CurrentCLA.Task}', '${ImgB64}', '$fisrt_${CurrentCLA.Task}signature.png}', 0)"$
			Starter.LocalSQL.ExecNonQuery(sSQL)
		End If
		
		CurrentSignature = 1
		SignPerson.Text = "Técnico"
		
		SignatureCapture.Clear(Signature)
		If File.Exists(Starter.InternalFolder, $"second_${CurrentCLA.Task}signature.png"$) Then
			Dim bg As Bitmap = LoadBitmapResize(Starter.InternalFolder, $"second_${CurrentCLA.Task}signature.png"$, SignPanel.Width, SignPanel.Height, True)
			SignPanel.SetBackgroundImage(bg)
		End If
		
		SignCanvas.Initialize(SignPanel)
		Signature.Initialize
		Signature.Canvas = SignCanvas
		Signature.Panel = SignPanel
		Signature.SignatureColor = Colors.Black
		Signature.SignatureWidth = 3dip
	Else
		SignatureCapture.Save(Signature, Starter.InternalFolder, $"second_${CurrentCLA.Task}signature.png"$)
		
		Dim Base64Con As Base64Convert
		Base64Con.Initialize
		Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"second_${CurrentCLA.Task}signature.png"$)
		If (SignatureExists=2) Or (SignatureExists=3) Then
			Dim sSQL As String = $"update requests_signatures set image='${ImgB64}', filename='second_${CurrentCLA.Task}signature.png' 
					where from_who=1 and request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
			Starter.LocalSQL.ExecNonQuery(sSQL)
		Else
			Dim sSQL As String = $"insert into requests_signatures (request_tagcode, action_tagcode, task_tagcode, image, filename, from_who) values
								('${CurrentCLA.Request}', '${CurrentCLA.Action}', '${CurrentCLA.Task}', '${ImgB64}', '$fisrt_${CurrentCLA.Task}signature.png}', 1)"$
			Starter.LocalSQL.ExecNonQuery(sSQL)
		End If
		
		
		PanelSignature.Visible = False
		CurrentSignature = 0
	End If
	' 
'	ToastMessageShow("Signature saved to: " & File.Combine(File.DirRootExternal, "sign.png"), True)
	'The next line will load the image and set it as the activity background.
	'Activity.SetBackgroundImage(LoadBitmap(File.DirRootExternal, "sign.png"))
End Sub

Sub btnClearSign_Click
	SignatureCapture.Clear(Signature)
'	Dim Signature As SignatureData
'	Dim SignCanvas
'	SignPanel
End Sub

Sub FINActionButton_Click
	Dim Btn As Button = Sender 'CLAButtonOptions.Tag = CLAItem
	Dim CLA As RequestCLA = Btn.Tag
	Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(CLA.Request, CLA.Action, CLA.Task, "", "", "", cl_FinaltopTitle.Text, "", "", 3, 0, 0, "")
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "CheckList2", CLAItem, 0, "", MainObservations)
End Sub

Sub CamImage(CLAItem As RequestCLAItem)
	Dim Filter As AppActionDialogs
	
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "CheckList2", CLAItem, 0, "", MainObservations)
End Sub

Sub CLAItemSelectValue_ItemClick (Position As Int, Value As Object)
	'CLAItemSelectValue
	If (LoadingProcess = False) Then
		Dim this As Spinner = Sender
		Dim pan As Panel = this.Parent
		Dim New As Int = this.SelectedIndex
		Dim Newtitle As String = this.SelectedItem
		Dim params As Map
		
		If Not(Utils.isNullOrEmpty(this.Tag)) Then
			Dim Columns As List = Regex.Split("\|", this.tag )
		
			Dim request_tagcode As String = Columns.Get(0)
			Dim action_tagcode As String = Columns.Get(1)
			Dim task_tagcode As String = Columns.Get(2)
			Dim item_tagcode As String = Columns.Get(3)
			Dim uniquekey As String = Columns.Get(4)
			Dim tagcode As String = Columns.Get(5)
			Dim val As Int = Columns.Get(6)
			Dim StatusIcon As Int = Columns.Get(7)
			Dim sACLADatetime As String = Utils.GetCurrDatetime
			Private sACLALatitude As String = ""
			Private sACLALongitude As String = ""
			If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lat)) Then sACLALatitude = LocationService.GeoLocal.lat
			If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lon)) Then sACLALongitude = LocationService.GeoLocal.lon

			Dim sSQL As String = $"update requests_values set value='${New}', val_date='${sACLADatetime}', val_title='${Newtitle}',
							val_latitude='${sACLALatitude}', val_longitude='${sACLALongitude}' where request_tagcode='${request_tagcode}' and
							task_tagcode='${task_tagcode}' and item_tagcode='${item_tagcode}' and 
							uniquekey='${uniquekey}' and tagcode='${tagcode}'"$
			Log(sSQL)
			Starter.LocalSQL.ExecNonQuery(sSQL)
			
			params.Initialize
			'params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", request_tagcode)
			params.Put("ACLAAction", action_tagcode)
			params.Put("ACLATask", task_tagcode)
			params.Put("ACLAItem", item_tagcode)
			params.Put("ACLAUniqueKey", uniquekey)
			params.Put("ACLATagcode", tagcode)
			params.Put("ACLAValue", New)
			params.Put("ACLAValuetitle", Newtitle)
			
			params.Put("ACLADatetime", sACLADatetime)
			params.Put("ACLALatitude", sACLALatitude)
			params.Put("ACLALongitude", sACLALongitude)

		End If
		If (New = 0) Then
			pan.Color = Consts.ColorSelecNotSelected
		Else
			pan.Color = Consts.ColorSelecSelected
		End If
		
		If (POINTS_RESULT) Then
			If Not(Utils.isNullOrEmpty(pan.tag)) Then
				Dim PanCols As List = Regex.Split("\|", pan.tag )
				If Not(PanCols.Get(0) = New) Then
					Dim panval As Float = PanCols.Get(1)
					If (New = 0) Then 
						TOTAL_POINTS  = TOTAL_POINTS - panval
					Else
						TOTAL_POINTS  = TOTAL_POINTS + panval
					End If
				End If
			End If
			FINPoints.Text = TOTAL_POINTS
			
			Dim sSQL As String = $"update requests_tasks set points=${TOTAL_POINTS} where request_tagcode='${request_tagcode}' and
							action_tagcode='${action_tagcode}'"$
			Starter.LocalSQL.ExecNonQuery(sSQL)
			Dim sSQL As String = $"update requests set points=${TOTAL_POINTS} where tagcode='${request_tagcode}'"$
			Starter.LocalSQL.ExecNonQuery(sSQL)
		End If
		
		If (params.IsInitialized) Then
			Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/update"$, "")
			Sleep(250)
		End If
	
	End If
End Sub

Sub ButtonActionPause_Click
	
End Sub

'Sub CLAItemRulerValue_ValueChanged (Value As Float)
'	'ToastMessageShow($"Clicou na opção: ${Value}"$, True)
'End Sub

Sub TabButtonChangeTerminate_Click
	listsTabPanelExec.Visible = False
	listsTabPanelObject.Visible = False
	listsTabPanelTerminate.Visible = True
	'Private CLA_CURRENT_STATE As Int = 0
	CLA_CURRENT_PAGE = 2
	butChecklistRunEnd.Visible = True
	
	If (REPORT_GENERATED) Then
		butChecklistSendReport.Visible = True
	Else
		butChecklistSendReport.Visible = False
	End If
	butChecklistReport.Visible = True
	If (CurrentCLA.Status.status <= 2) Then
		butChecklistRunEnd.Visible = True
		butChecklistRunEnd.Text = "Concluir"
	Else
		butChecklistRunEnd.Visible = False
		butChecklistRunEnd.Text = "Sair"
	End If
	Try
		LoadExecution
	Catch
		Log(LastException)
	End Try
End Sub

Sub TabButtonChangeObject_Click
	listsTabPanelExec.Visible = False
	listsTabPanelObject.Visible = True
	listsTabPanelTerminate.Visible = False
	'Private CLA_CURRENT_STATE As Int = 0
	 CLA_CURRENT_PAGE = 1
	butChecklistRunEnd.Visible = False
	butChecklistSendReport.Visible = False
	butChecklistReport.Visible = False
End Sub

Sub TabButtonChangeChecklist_Click
	listsTabPanelExec.Visible = True
	listsTabPanelObject.Visible = False
	listsTabPanelTerminate.Visible = False
	'Private CLA_CURRENT_STATE As Int = 0
	CLA_CURRENT_PAGE = 0
	butChecklistSendReport.Visible = False
	butChecklistReport.Visible = False
	If (CurrentCLA.Status.status<=2) Then
		butChecklistRunEnd.Visible = True
		butChecklistRunEnd.Text = "Terminar"
	Else
		butChecklistRunEnd.Visible = False
		'butChecklistRunEnd.Text = "Terminar"
	End If
End Sub

Sub CLAItemRulerValue_ValueChanged (Value As Int, UserChanged As Boolean)
'	Private CLAItemRulerValueMin As Label
'	Private CLAItemRulerValueMax As Label
	Dim this As SeekBar = Sender
	Dim pan As Panel = this.Parent
	Dim lbl As Label = pan.GetView(3)
	lbl.Text = Value
End Sub

Sub CloseExecution
	' VERIFICAR SE EXISTEM ACÇÕES SUBSEQUENTES
	Private Record2 As Cursor
	Dim status As Int = 3
	Dim total As Int = 0
	Dim sSQL As String = $"select count(0) as total from requests_actions as a where 
			a.request_tagcode='${CurrentCLA.Request}' and a.action_tagcode='${CurrentCLA.Action}'"$
	Record2 = Starter.LocalSQL.ExecQuery(sSQL)
	If Record2.RowCount > 0 Then
		Record2.Position = 0
		total = Record2.GetInt("total")
	End If
	Record2.Close
	If (total >=1) Then status = 4
	
	Dim sSQL As String = $"update requests_tasks set status_id=${status} where request_tagcode='${CurrentCLA.Request}' and
							action_tagcode='${CurrentCLA.Action}'"$
	Starter.LocalSQL.ExecNonQuery(sSQL)
	Dim sSQL As String = $"update requests set status_id=${status} where tagcode='${CurrentCLA.Request}'"$
	Starter.LocalSQL.ExecNonQuery(sSQL)
	
	Private sACLALatitude As String = ""
	Private sACLALongitude As String = ""
	If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lat)) Then sACLALatitude = LocationService.GeoLocal.lat
	If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lon)) Then sACLALongitude = LocationService.GeoLocal.lon
				
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", CurrentCLA.Request)
	params.Put("ACLAState", status)
	params.Put("ACLAUser", ShareCode.SESS_User)
	params.Put("ACLADatetime", Utils.GetCurrDatetime)
	Try
		params.Put("ACLALatitude", sACLALatitude)
		params.Put("ACLALongitude", sACLALongitude)
	Catch
		Log(LastException)
		params.Put("ACLALatitude", "")
		params.Put("ACLALongitude", "")
	End Try
	Utils.CallApi(params, Me, "https://demo.vrcg.pt/api/orion/cla-satus/update", "")
	Sleep(250)
	
	params.Put("ACLAAction", CurrentCLA.Action)
	Utils.CallApi(params, Me, "https://demo.vrcg.pt/api/orion/clarel-satus/update"$, "")
	Sleep(500)
	
	listsButtonClose_Click
End Sub

Sub PrepareToEndExecution
	Dim sSQL As String = DBStructures.SQL_GETREQUESTS_CURRENT
	sSQL = $"${sSQL} And (a.tagcode='${CurrentCLA.Request}') and (n.action_tagcode='${CurrentCLA.Action}')"$
	
	Dim Row As Int = 0
	Dim Row2 As Int = 0
	Dim Record As Cursor
	Record = Starter.LocalSQL.ExecQuery(sSQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim Points As Double = Record.GetDouble("points")
		Dim results As String = Record.GetString("result_values") 'result_type
		Dim resulttype As Int = Record.GetInt("result_type") 
		
		Dim MRO As ResultOptions 
		Dim MROList As List
		MROList.Initialize
		If Not(Utils.isNullOrEmpty(results)) Then
			Dim resCols As List = Regex.Split("\|", results )
			If (resCols.Size >= 1) Then
				For Row = 0 To resCols.Size-1
					Dim innerList As List = Regex.Split("\;", resCols.Get(Row) )
					MROList.Add(Types.MakeResultOptions(innerList.Get(0), innerList.Get(2), innerList.Get(3)))
				Next
			End If
		End If
		
		' PEGA NA LISTA DE VALORES E VERIFICA AS POSSIBILIDADES
		'Dim CurrentResult As String = ""
		CurrentResult = ""
		If ((resulttype = 1)) Then
			
			Dim sSQL11 As String = $"select distinct count(0) as total
					from  requests_values as a inner join tasks_itemsvalues as b on 
					(b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey and b.tagcode=a.tagcode) 
					where 1=1 and b.conform_type=2 and a.status>=1 and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}'"$
					
			Log(sSQL11)
			
			Dim RecordRow As Cursor
			Dim NCs As Int = 0
			RecordRow = Starter.LocalSQL.ExecQuery(sSQL11)
			If RecordRow.RowCount > 0 Then
				RecordRow.Position = 0
				NCs = RecordRow.GetInt("total")
			End If
						
			If (NCs>=1) Then
				Dim ret As ResultOptions = MROList.Get(1)
				CurrentResult = ret.ValTitle
			Else
				Dim ret As ResultOptions = MROList.Get(0)
				CurrentResult = ret.ValTitle
			End If
			
			
		else If ((resulttype = 3) And (CurrentCLA.Action = "TSKS_2019_221630")) Then
			If (Points = 0) Then
				CurrentResult = "Excelente"
			else if ((Points > 0) And (Points <=5)) Then
				CurrentResult = "Bom com melhorias"
			else if ((Points > 5) And (Points <=45)) Then
				CurrentResult = "Redefinição das condições"
			Else
				CurrentResult = "Fora de questão"
			End If
		Else If ((resulttype = 3) And (CurrentCLA.Action = "TSKS_2019_002843")) Then
			If (Points < 20) Then
				CurrentResult = "Muito Mau"
			else if ((Points >= 20) And (Points <35)) Then
				CurrentResult = "Mau"
			else if ((Points >= 35) And (Points <60)) Then
				CurrentResult = "Razoável"
			else if ((Points >= 60) And (Points <85)) Then
				CurrentResult = "Bom"
			Else
				CurrentResult = "Muito bom"
			End If
		Else
			CurrentResult = "Concluído"
		End If
		
		CreateNonConformities(CurrentCLA)
		
		FINPoints.Text = Points
		FINResult.Text = CurrentResult
		Dim StartTime As String = Record.GetString("run_start")
		If (Utils.isNullOrEmpty(StartTime)) Then
			StartTime = Utils.GetCurrentTimeExt
		End If
		FINStart.Text = StartTime
		FINEnd.Text = Utils.GetCurrentTimeExt 'Record.GetString("run_end")
		Dim sTime As Long = DateTime.TimeParse(FINStart.Text)
		Dim eTime As Long = DateTime.TimeParse(FINEnd.Text)
		
		Dim PeriodTime As Period = DateUtils.PeriodBetween(sTime, eTime)
		FINDuration.Text = $"${PeriodTime.Hours}:${PeriodTime.Minutes}:${PeriodTime.Seconds}"$
		
		Dim sSQL As String = $"update requests_tasks set run_end='${FINEnd.Text}', run_time='${FINDuration.Text}'  where request_tagcode='${CurrentCLA.Request}' and
							action_tagcode='${CurrentCLA.Action}'"$
		Starter.LocalSQL.ExecNonQuery(sSQL)
		Dim sSQL As String = $"update requests set run_end='${FINEnd.Text}', run_time='${FINDuration.Text}' where tagcode='${CurrentCLA.Request}'"$
		Starter.LocalSQL.ExecNonQuery(sSQL)
		
		FINItemImages.Clear
		Private Record2 As Cursor
'		Dim Status As Int = 0
		Dim sSQL As String = $"select ifnull(b.title, a.filename) as title, a.* from requests_values_images as a
				left join tasks_items as b on (b.task_tagcode=a.task_tagcode and 
				b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey)
				where a.request_tagcode='${CurrentCLA.Request}' and a.action_tagcode='${CurrentCLA.Action}'"$
		Record2 = Starter.LocalSQL.ExecQuery(sSQL)
		If Record2.RowCount > 0 Then
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				Dim image As String = Record2.GetString("image")
				Dim title As String = Record2.GetString("title")
				Dim filename As String = Record2.GetString("filename")
				If Not(Utils.isNullOrEmpty(image)) Then
					
					Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record2.GetString("request_tagcode"), _
							Record2.GetString("action_tagcode"), _
							Record2.GetString("task_tagcode"), _
							Record2.GetString("item_tagcode"), _
							Record2.GetString("uniquekey"), _
							Record2.GetString("tagcode"),"", "", "", 3, Record2.GetInt("base_image"), Record2.GetInt("on_report"), "") 
				
					FINItemImages.Add(CreateImagePanel(CLAItem, filename, image, 0, title), "")
				
					If Not(File.Exists(Starter.InternalFolder,$"${filename}.png"$)) Then
						Utils.SaveImageFromB64ToFile(image, $"${filename}.png"$, "PNG")
					End If
				End If
			Next
		End If
		Record2.Close
		
		

'		
'		Dim status_id As Int = Record.GetInt("status_id")
'		Dim status_color As String = Record.GetString("status_color")
'		Dim bd As BitmapDrawable
'		bd.Initialize(Utils.CreateMapIcon(ItemsCounter, status_color))
'		'n = n + CreateRequestItem(ItemsCounter, Record, listRequests.AsView.Width, 70dip, bd)
'		ItemsCounter = CreateRequestItem(ItemsCounter, Record, listRequests.AsView.Width, 90dip, bd)
'		If Not(ShareCode.ISPHONE) Then
'			If (status_id < 5) Then
'				listsRequestsMap.Add( CreateRequestItemMap(ItemsCounter, Record, 0, listsRequestsMap.AsView.Width, 70dip), "") ', 70dip, "" )
'			End If
'		End If
'		ItemsCounter = ItemsCounter + 1
		
	End If
	Record.Close
	TabButtonChangeTerminate_Click
End Sub

Sub LoadExecution
	Dim sSQL As String = DBStructures.SQL_GETREQUESTS_CURRENT
	sSQL = $"${sSQL} And (a.tagcode='${CurrentCLA.Request}') and (n.action_tagcode='${CurrentCLA.Action}')"$
	
	Dim Row As Int = 0
	Dim Row2 As Int = 0
	Dim Record As Cursor
	Record = Starter.LocalSQL.ExecQuery(sSQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim Points As Double = Record.GetDouble("points")
		Dim results As String = Record.GetString("result_values") 'result_type
		Dim resulttype As Int = Record.GetInt("result_type") 
		
		Dim MRO As ResultOptions 
		Dim MROList As List
		MROList.Initialize
		If Not(Utils.isNullOrEmpty(results)) Then
			Dim resCols As List = Regex.Split("\|", results )
			If (resCols.Size >= 1) Then
				For Row = 0 To resCols.Size-1
					Dim innerList As List = Regex.Split("\;", resCols.Get(Row) )
					MROList.Add(Types.MakeResultOptions(innerList.Get(0), innerList.Get(2), innerList.Get(3)))
				Next
			End If
		End If
		
		' PEGA NA LISTA DE VALORES E VERIFICA AS POSSIBILIDADES
		Dim CurrentResult As String = ""
		If ((resulttype = 1)) Then
			
			Dim sSQL11 As String = $"select distinct count(0) as total 
					from  requests_values as a inner join tasks_itemsvalues as b on 
					(b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey and b.tagcode=a.tagcode) 
					where 1=1 and b.conform_type=2 and a.status>=1 and a.request_tagcode='${CurrentCLA.Request}' and a.task_tagcode='${CurrentCLA.Task}'"$
			Dim RecordRow As Cursor
			Dim NCs As Int = 0
			RecordRow = Starter.LocalSQL.ExecQuery(sSQL11)
			If RecordRow.RowCount > 0 Then
				RecordRow.Position = 0
				NCs = RecordRow.GetInt("total")
			End If
						
			If (NCs>=1) Then
				Dim ret As ResultOptions = MROList.Get(1)
				CurrentResult = ret.ValTitle
			Else
				Dim ret As ResultOptions = MROList.Get(0)
				CurrentResult = ret.ValTitle
			End If
			
			
		else If ((resulttype = 3) And (CurrentCLA.Action = "TSKS_2019_221630")) Then
			If (Points = 0) Then
				CurrentResult = "Excelente"
			else if ((Points > 0) And (Points <=5)) Then
				CurrentResult = "Bom com melhorias"
			else if ((Points > 5) And (Points <=45)) Then
				CurrentResult = "Redefinição das condições"
			Else
				CurrentResult = "Fora de questão"
			End If
		Else If ((resulttype = 3) And (CurrentCLA.Action = "TSKS_2019_002843")) Then
			If (Points < 20) Then
				CurrentResult = "Muito Mau"
			else if ((Points >= 20) And (Points <35)) Then
				CurrentResult = "Mau"
			else if ((Points >= 35) And (Points <60)) Then
				CurrentResult = "Razoável"
			else if ((Points >= 60) And (Points <85)) Then
				CurrentResult = "Bom"
			Else
				CurrentResult = "Muito bom"
			End If
		Else
			CurrentResult = "Concluído"
		End If
		FINPoints.Text = Points
		FINResult.Text = CurrentResult
		Dim StartTime As String = Record.GetString("run_start")
		If (Utils.isNullOrEmpty(StartTime)) Then
			StartTime = Utils.GetCurrentTimeExt
		End If
		FINStart.Text = StartTime
		FINEnd.Text = Record.GetString("run_end")
		FINDuration.Text = Record.GetString("run_time")	
		
		CreateNonConformities(CurrentCLA)
		
		FINItemImages.Clear
		Private Record2 As Cursor
'		Dim Status As Int = 0
		Dim sSQL As String = $"select ifnull(b.title, a.filename) as title, a.* from requests_values_images as a
				left join tasks_items as b on (b.task_tagcode=a.task_tagcode and 
				b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey)
				where a.request_tagcode='${CurrentCLA.Request}' and a.action_tagcode='${CurrentCLA.Action}'"$
		Record2 = Starter.LocalSQL.ExecQuery(sSQL)
		If Record2.RowCount > 0 Then
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				Dim image As String = Record2.GetString("image")
				Dim title As String = Record2.GetString("title")
				Dim filename As String = Record2.GetString("filename")
				If Not(Utils.isNullOrEmpty(image)) Then
					
					Dim CLAItem As RequestCLAItem = Types.MakeRequestCLAItem(Record2.GetString("request_tagcode"), _
							Record2.GetString("action_tagcode"), _
							Record2.GetString("task_tagcode"), _
							Record2.GetString("item_tagcode"), _
							Record2.GetString("uniquekey"), _
							Record2.GetString("tagcode"),"", "", "", 3, Record2.GetInt("base_image"), Record2.GetInt("on_report"), "")
				
					FINItemImages.Add(CreateImagePanel(CLAItem, filename, image, 0, title), "")
				
					If Not(File.Exists(Starter.InternalFolder,$"${filename}.png"$)) Then
						Utils.SaveImageFromB64ToFile(image, $"${filename}.png"$, "PNG")
					End If
				End If
			Next
		End If
		Record2.Close
		
		Private Record2 As Cursor
		Dim sSQL As String = $"select request_obs from requests_tasks where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
		Record2 = Starter.LocalSQL.ExecQuery(sSQL)
		If Record2.RowCount > 0 Then
			Record2.Position = 0
			If (FinalObs.IsInitialized) Then FinalObs.Text = Record2.GetString("request_obs")
		End If
		Record2.Close
	End If
	Record.Close
End Sub

Sub CreateNonConformities(nc As RequestCLA)
	FINGroups.Clear
	Dim idx As Int = 0
	If idx >0 Then idx = idx-1
	
	Dim id As ItemData
	Dim t As Int = 0
	Dim h As Int = 60dip
	id.Initialize
	id.CollapsedHeight = 50dip
	Private Record As Cursor
	
	'******************************************************************************
	' CRIA LISTA DE NÃO CONFORMIDADES
	'******************************************************************************
	Dim SQL As String = $"select distinct a.uniquekey, b.conform_type, a.status, c.title
			from  requests_values as a 
			inner join tasks_itemsvalues as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey and b.tagcode=a.tagcode)
			inner join tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.uniquekey=b.uniquekey)
			where 1=1 and b.conform_type=2 and a.status>=1 and 
			a.request_tagcode='${nc.Request}' and a.task_tagcode='${nc.Task}'"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		id.ExpandedHeight = 50dip + (60dip * Record.RowCount)
		Dim chapter As B4XView = CreateNCChapter(Colors.Gray, "Lista de Não Conformidades", "ListCollapseNonConformities", id, idx, False)
		For Row = 0 To Record.RowCount-1
			Record.Position = Row
			CreateNCLineItems(Record, t,  h)
			t = t + 60dip
		Next
		FINGroups.Add(chapter, id)
		FINGroups.ExpandItem(idx)
		idx = idx + 1
	Else
		id.ExpandedHeight = 50dip
		Dim chapter As B4XView = CreateNCChapter(Colors.Gray, "Lista de Não Conformidades", "ListCollapseNonConformities", id, idx, False)
		FINGroups.Add(chapter, id)
		idx = idx + 1
	End If
	Record.Close
End Sub

Sub CreateNCChapter(clr As Int, Title As String, layout As String, id As ItemData, idx As Int, Expanded As Boolean) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, FINGroups.sv.width, id.ExpandedHeight)
	p.LoadLayout(layout) 
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblGroupTitle.Text = Title
	lblGroupTitle.Tag = idx
	pnlGroupTitle.Tag = idx
	butGroupCollpseExpand.Tag = idx
	p.Tag = Expanded 'collapsed
	Return p
End Sub

Sub CreateNCLineItems(colitems As Cursor, top As Int, height As Int) 'As B4XView
	Dim p As Panel
	p.Initialize("GroupLineClickUser")
	Activity.AddView(p, 0, 0, 100%x, height)
	p.LoadLayout("ItemNonConformity")
	p.RemoveView
	Dim name As String = colitems.GetString("title")
	lblGroupLineName.Text = name
	p.Tag = 0
	pnlGroupExpanded4.AddView(p, 0, top, p.Width, height)
End Sub

'====================================================================================================
'====================================================================================================
Sub CreateImagePanel(this As RequestCLAItem, filename As String, btm As String, state As Int, title As String) As B4XView
	Dim p As Panel
	p.Initialize("") 'ImageViewEdit")
	Activity.AddView(p, 0, 0, 100%x, 130dip)
	p.LoadLayout("CLA_MORE_IMGAGE_Listview")
	p.RemoveView

	ShowImage.SetBackgroundImage(Utils.B64ToBitmap(btm))
	ShowImage.Tag = Types.MakeImageViewData(btm, filename)
	ImageFilename.Text = title 'filename
	ImageFilename.Tag = filename
	ImageState.Text = ""
	ImageState.Tag = state
	imageSelected.Tag = 0
	imageSelected.TextColor = Consts.ColorLightSilver
	imageSelected.TextColor = Consts.ColorLightSilver
	imageSelectedOnReport.TextColor = Consts.ColorLightSilver
	imageSelectedOnReport.Tag = this
	If (this.OnReport = 1) Then
		imageSelectedOnReport.TextColor = Consts.ColorGreen
	End If
		
	If (state = 1) Then
		ImageState.Text = "Imagem alterada"
	Else If (state = 2) Then
		ImageState.Text = "Nova imagem"
	End If
	
	p.Tag = this
	Return p
End Sub

Sub imageSelectedOnReport_Click
	'imageSelectedOnReport
	Dim thisBut As Label = Sender
	Dim thisPanel As Panel = thisBut.Parent
	Dim this As RequestCLAItem = thisBut.Tag
	If (this.OnReport = 1) Then
		this.OnReport = 0
		thisBut.TextColor = Consts.ColorLightSilver
	Else
		this.OnReport = 1
		thisBut.TextColor = Consts.ColorGreen
	End If
	thisBut.Tag = this
	Dim fname As Label = thisPanel.GetView(1)
	Dim filename As String = fname.Text
	If Not(Utils.isNullOrEmpty(fname.Tag)) Then 
		filename = fname.tag
	End If
	
	Dim sSQL As String = $"update requests_values_images set on_report=${this.OnReport} where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and
							item_tagcode='${this.Item}' and uniquekey='${this.UniqueKey}' and tagcode='${this.Tagcode}' and filename='${filename}'"$
	Starter.LocalSQL.ExecNonQuery($"${sSQL}"$)
	
	Dim params As Map
	params.Initialize
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", this.Request)
	params.Put("ACLAAction", this.Action)
	params.Put("ACLATask", this.Task)
	params.Put("ACLAItem", this.Item)
	params.Put("ACLAUniqueKey", this.UniqueKey)
	params.Put("ACLATagcode", this.Tagcode)
	params.Put("ACLAValueFileImage", filename)
	params.Put("ACLAOnReport", this.OnReport)

	If (params.IsInitialized) Then
		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai-more/img/update2"$, "")
		Sleep(250)
	End If
End Sub

Sub butChecklistRunEnd_Click
	saveFinalObs
	If (FastCloseAction) Then
		CloseExecution
		'listsButtonClose_Click
	Else
'		Private CLA_CURRENT_STATE As Int = 0
'		Private CLA_CURRENT_PAGE As Int = 0
'		If (CurrentTab <=1) Then
'			listsTabPanel.ScrollTo(2, True)
'		Else
'			listsButtonClose_Click
'		End If
		If (CLA_CURRENT_PAGE = 0) Then
			If (CurrentCLA.Status.status<=2) Then
				PrepareToEndExecution
			Else
				TabButtonChangeTerminate_Click
			End If
		Else If (CLA_CURRENT_PAGE = 1) Then
			TabButtonChangeObject_Click
		Else If (CLA_CURRENT_PAGE = 2) Then
			If (CurrentCLA.Status.status<=2) Then
				CloseExecution
			Else
				TabButtonChangeTerminate_Click
			End If
		End If
	End If
End Sub

Sub butChecklistRunReport_Click
	'saveFinalObs
End Sub

Sub butChecklistRunAction_Click
	'
End Sub


Sub ButtonUserUnavailable_Click
	
End Sub

Sub butChecklistReport_Click
	'butChecklistReport
	Dim btn As Button = Sender
	Dim CLA As RequestCLA = btn.Tag ' (Request As String, Action As String, Task As String, TaskType As Int, Status As Intervention, Info As RequestTaskInfo)
	
	'REPORT_GENERATED
	Dim theFile As String = REPORT_FILE_GENERATED
'	Dim SQL As String = $"select * from requests_tasks where  request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
'	Private Recordw As Cursor
'	Recordw = Starter.LocalSQL.ExecQuery(SQL)
'	If Recordw.RowCount > 0 Then
'		Recordw.Position = 0
'		theFile = Recordw.GetString("report_file")
'	End If
'	Recordw.Close
	
	If Not(Utils.isNullOrEmpty(theFile)) Then
		Dim i As Int
		i = Msgbox2("O relatório já foi gerado. Escolha a opção apropriada neste caso.", ShareCode.GeneralNoteTitle, "Visualizar", ShareCode.Option_CANCEL, "Re-Gerar", Null)
		If (i=DialogResponse.POSITIVE) Then
			If File.Exists(Starter.SharedFolder, theFile) Then
				Utils.ViewPDFFile(theFile)
			End If
		Else If (i=DialogResponse.NEGATIVE) Then
			Dim sSQL As String = $"update requests_tasks set report_generated=0, report_file=''  where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
			Starter.LocalSQL.ExecNonQuery(sSQL)
			GenerateReport(CLA)
		Else If (i=DialogResponse.CANCEL) Then
		End If
		
	Else
		GenerateReport(CLA)
	End If
End Sub

Sub GenerateReport(CLA As RequestCLA)
	saveFinalObs
	ProgressDialogShow("A gerar o relatório ...")
	Sleep(100)
	'Dim HTML As List = File.ReadList(Starter.SharedFolder, "template1.html")
	Dim HTML As String = File.ReadString(Starter.SharedFolder, "template3.html")
	
	Private Record As Cursor
	'FinalObs.Text
	Dim SQL As String = $"${DBStructures.SQL_GETREQUESTS_DATA_TASKS_REP} and a.request_tagcode='${CLA.Request}' and a.action_tagcode='${CLA.Action}'"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
	
		Dim Reference As String = Record.GetString("reference")
		Dim Inicio As String = Record.GetString("run_start")
		Dim Fim As String = Record.GetString("run_end")
		Dim Duracao As String = Record.GetString("run_time")
		Dim Data As String = Utils.GetCurrentDate
		Dim Name As String = Record.GetString("name")
		Dim RequestType As String = Record.GetString("task_name")
		Dim RequestNumber As String = Record.GetString("tagcode")
		Dim Morada As String = $"${Record.GetString("address")}, ${Record.GetString("city")}"$
		Dim request_obs As String = Record.GetString("request_obs")
		
		Dim Technical As String = Record.GetString("username")
		Dim ObjectName As String = Record.GetString("objectname")
		
		HTML = HTML.Replace(":__EXECUTION_NUMBER", RequestNumber)
		HTML = HTML.Replace(":__REPORT_NAME", RequestType)
		HTML = HTML.Replace(":__EXECUTION_RESULT", CurrentResult)
		HTML = HTML.Replace(":__EXECUTION_POINTS", 0)
		HTML = HTML.Replace(":__REQUEST_TYPE", ObjectName)
		HTML = HTML.Replace(":__EXECUTION_DATE", Data)
		HTML = HTML.Replace(":__ENTITY_NAME", Name)
		HTML = HTML.Replace(":__EXECUTION_START", Inicio)
		HTML = HTML.Replace(":__EXECUTION_LOCAL", Morada)
		HTML = HTML.Replace(":__EXECUTION_END", Fim)
		HTML = HTML.Replace(":__EXECUTION_TIME", Duracao)
		HTML = HTML.Replace(":__REPORT_DATE_TIME", Utils.GetCurrDatetime)
		HTML = HTML.Replace(":__REQUEST_OBS", request_obs)
		HTML = HTML.Replace(":__REPORT_INFO_VERSION", "VRCH_STD_DEMO_1")
		HTML = HTML.Replace(":__CURRENT_PAGE", "1")
		
		HTML = HTML.Replace(":__TECHNICAL_NAME1", "")
		HTML = HTML.Replace(":__TECHNICAL_NAME2", "")
		HTML = HTML.Replace(":__TECHNICAL_NAME", Technical)

		Dim DATA_NAME As String = ""
		Private objRecord As Cursor
		Dim Rows As Int = 0
		Dim dataSQL As String = $"select x.value, x.val_desc, x.title, x.position, x.level, x.datatype
								from (select a.value, 
								case WHEN a.val_title <> '' THEN a.val_title ELSE 
								case when a.status>0 THEN b.val_title ELSE a.value END
								end as val_desc, c.title, c.position, c.level, c.value_type as datatype
								from requests_values as a
								inner join tasks_itemsvalues as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey and b.tagcode=a.tagcode)
								inner join tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.uniquekey=b.uniquekey)
								where a.request_tagcode='${CurrentCLA.Request}' and a.action_tagcode='${CurrentCLA.Action}' and a.task_tagcode='${CurrentCLA.Task}' 
								and ((a.status=0 and b.val_datatype<>16) or (a.status>0 and b.val_datatype=16))
								UNION
								select "" as value, "" as val_desc, a.title, a.position, a.level, a.value_type as datatype
								from tasks_items as a 
								where a.task_tagcode='${CurrentCLA.Task}' and a.level=0) as x
								order by x.position"$
								
		'Dim objSQL As String = $"${DBStructures.SQL_CURRENT_OBJECTS} where a.tagcode in (select object_tagcode from requests_tasks where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}')"$
		Log(dataSQL)
		objRecord = Starter.LocalSQL.ExecQuery(dataSQL)
		If objRecord.RowCount > 0 Then
			For Rows =0 To objRecord.RowCount-1
				objRecord.Position = Rows
				Dim CHAPTER_NAME As String = ""
				Dim QUEST_NAME As String = ""
				Dim Level As Int = objRecord.GetInt("level")
				If (Level = 0) Then
					CHAPTER_NAME = $"<div class="col-12" style=""><div class="chapterBar" style="">${objRecord.GetString("title")}</div></div>"$
				Else
					QUEST_NAME = $"<div class="col-12" style=""><div class="col-12" style="margin:10px;"><div class="row">
							<div class="col-6 questionBar" style="">${objRecord.GetString("title")}</div>
							<div class="col-6" style="border-bottom: 1px solid silver;max-width:360px!important">${objRecord.GetString("val_desc")}
							</div></div></div>"$
				End If
				DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
			Next
		End If
		objRecord.Close
	End If
	Record.Close
	Log(DATA_NAME)
	HTML = HTML.Replace(":__DATA_NAME", DATA_NAME)
	Sleep(100)
	Dim SHOW_IMAGES As String = "display:none;"
	Dim IMAGES As String = ""
	Private Record2 As Cursor
	Dim sSQL As String = $"select ifnull(b.title, a.filename) as title, a.* from requests_values_images as a
				left join tasks_items as b on (b.task_tagcode=a.task_tagcode and 
				b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey)
				where a.request_tagcode='${CurrentCLA.Request}' and a.action_tagcode='${CurrentCLA.Action}'"$
	Record2 = Starter.LocalSQL.ExecQuery(sSQL)
	If Record2.RowCount > 0 Then
		SHOW_IMAGES  = "display:block;"
		For n=0 To Record2.RowCount-1
			Record2.Position = n
			Dim image As String = Record2.GetString("image")
'			Dim title As String = Record2.GetString("title")
'			Dim filename As String = Record2.GetString("filename")
			IMAGES = $"${IMAGES}<div class="col-3" style=""><img src="data:image/png;base64,${image}" width="195"></div>"$
		Next
	End If
	Record2.Close
	HTML = HTML.Replace(":__SHOW_IMAGES", SHOW_IMAGES)
	HTML = HTML.Replace(":__IMAGES", IMAGES)
	
	
	Dim SHOW_NON_CONFORMITY As String = "display:none;"
	Dim NON_CONFORMITY As String = ""
	Private Record As Cursor
	Dim SQL As String = $"select distinct a.uniquekey, b.conform_type, a.status, c.title
			from  requests_values as a 
			inner join tasks_itemsvalues as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey and b.tagcode=a.tagcode)
			inner join tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.uniquekey=b.uniquekey)
			where 1=1 and b.conform_type=2 and a.status>=1 and 
			a.request_tagcode='${CLA.Request}' and a.task_tagcode='${CLA.Task}'"$
	Record = Starter.LocalSQL.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		SHOW_NON_CONFORMITY = "display:block;"
		For Row = 0 To Record.RowCount-1
			Record.Position = Row
			NON_CONFORMITY = $"${NON_CONFORMITY}<div class="col-12">${Record.GetString("title")}</div>"$
		Next
	End If
	Record.Close
	HTML = HTML.Replace(":__SHOW_NON_CONFORMITY", SHOW_NON_CONFORMITY)
	HTML = HTML.Replace(":__NON_CONFORMITY", NON_CONFORMITY)
	
	Dim SHOW_ACTION_TASK As String = "display:none;"
	Dim SHOW_ACTION_TASK_END As String = "display:none;"
	Dim SHOW_ACTION_TASK_EXEC As String = "display:none;"
	Dim ACTION_TASK As String = ""
	HTML = HTML.Replace(":__SHOW_ACTION_TASK_END", SHOW_ACTION_TASK_END)
	HTML = HTML.Replace(":__SHOW_ACTION_TASK_EXEC", SHOW_ACTION_TASK_EXEC)
	HTML = HTML.Replace(":__SHOW_ACTION_TASK", SHOW_ACTION_TASK)
	HTML = HTML.Replace(":__ACTION_TASK", ACTION_TASK)
	
	Dim SHOW_SIGNATURES As String = "display:none;"
	Dim SIGNATURE_CLIENT As String = ""
	Dim SIGNATURE_TECHNICAL As String = ""
	Private Recordw As Cursor
	Dim Rows As Int = 0
	Dim SQL As String = $"select * from requests_signatures where  request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
	Recordw = Starter.LocalSQL.ExecQuery(SQL)
	If Recordw.RowCount > 0 Then
		Dim SHOW_SIGNATURES As String = "display:block;"
		For Rows = 0 To Recordw.RowCount-1
			Recordw.Position = Rows
			If (Recordw.GetInt("from_who") = 0) Then
				SIGNATURE_CLIENT = $"${Recordw.GetString("image")}"$
			Else
				SIGNATURE_TECHNICAL = $"${Recordw.GetString("image")}"$
			End If
		Next
	End If
	Recordw.Close
	HTML = HTML.Replace(":__SHOW_SIGNATURES", SHOW_SIGNATURES)
	HTML = HTML.Replace(":__SIGNATURE_CLIENT", SIGNATURE_CLIENT)
	HTML = HTML.Replace(":__SIGNATURE_TECHNICAL", SIGNATURE_TECHNICAL)
	Sleep(100)
	
	Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
	File.WriteString(Starter.SharedFolder, $"${FileReport}.html"$, HTML)
	Sleep(500)
	
	Dim theFile As String = $"${FileReport}.pdf"$
	Try
		Dim phtmltopdf As PalmoHtmlToPdf
		phtmltopdf.Initialize("phtmltopdf")
		phtmltopdf.ConvertFromFile(Starter.SharedFolder, $"${FileReport}.html"$, Starter.SharedFolder, theFile)
		'phtmltopdf.ConvertFromFile(Starter.SharedFolder, $"${FileReport}.html"$, Starter.InternalFolder, theFile)
		Sleep(1000)
	Catch
		Log(LastException)
	End Try
	
	Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
	Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
	REPORT_GENERATED = FileGenerated
	REPORT_FILE_GENERATED = theFile

	Try
		Dim sSQL As String = $"update requests_tasks set report_generated=1, report_file='${theFile}'  where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
		Starter.LocalSQL.ExecNonQuery(sSQL)
		Sleep(500)
	Catch
		Log(LastException)
	End Try
	
	If FileGenerated Then
		Utils.ViewPDFFile(theFile)
	End If
	

	
	Try
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", CLA.Request)
		params.Put("ACLAAction", CLA.Action)
		params.Put("ACLAFilename", theFile)
		params.Put("ACLAB64", "")
		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/rep/update"$, "")
		Sleep(250)
	Catch
		Log(LastException)
	End Try

	
	If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
		Try
			File.Copy(Starter.SharedFolder, theFile, Starter.InternalFolder, theFile )
			
		Catch
			Log(LastException)
		End Try
		Try
			UploadFilesWithFTP(theFile)
		Catch
			Log(LastException)
		End Try
	End If

	Sleep(1000)
	ProgressDialogHide
End Sub

Sub butChecklistSendReport_Click
	'butChecklistSendReport
	Dim emails As String = ""
	Private Record2 As Cursor
	Dim sSQL As String = $"select tagcode, email from contacts
							where tagcode in (select distinct contact from contacts2objects 
							where object in (select distinct requester_tagcode from requests where tagcode='${CurrentCLA.Request}'))"$
	Record2 = Starter.LocalSQL.ExecQuery(sSQL)
	If Record2.RowCount > 0 Then
		Record2.Position = 0
		emails = Record2.GetString("email")
	End If
	Record2.Close
	
	Try
		GetReportSendEmailDialog(CurrentCLA, CHECKLIST_TITLE, emails)
	Catch
		Log(LastException)
	End Try
End Sub

Sub UploadFilesWithFTP(filename As String )
	Dim myFTP As FTP
	myFTP.Initialize("ftp", "ftp.vrcg.pt", 21, "EvolutionCheck@vrcg.pt", "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
	Log(filename)
	Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, filename, False, "/" & ShareCode.APP_DOMAIN & "/docs/" & filename)
	Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
	If Success Then
		Log("file was uploaded successfully")
	Else
		Log("Error uploading file")
	End If
	myFTP.Close
End Sub

Sub GetReportSendEmailDialog(this As RequestCLA, title As String, emails As String)
	
	Private ApplDialog As CustomLayoutDialog
	Dim sf As Object = ApplDialog.ShowAsync(ShareCode.Option_SENDEMAIL, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		ApplDialog.SetSize(95%x, 80%y)
	Else
		ApplDialog.SetSize(70%x, 430dip)
	End If
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_more_action_sendEmail")

	dlgASEmails.Text = emails
	dlgASEmailsCC.Text = "alertas@vrcg.pt"
	dlgASEmailsSubject.Text = $"Relatório: ${this.Request} - ${title}"$
	dlgASDetails.Text = title
	'dlgASEmails.Text = ""
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		ApplDialog.CloseDialog(DialogResponse.POSITIVE)

		Dim HTML As String = $"<html><body>
		<p><h4><strong>Envio de Relatório</strong></h4><br><br>
		<strong>Informação</strong><br>
		${dlgASDetails.Text}<br></p>
		<p>A equipa VRCG</>
		</body></html>"$
		Try
			SendReportEmailExt(dlgASEmails.Text, dlgASEmailsCC.Text, dlgASEmailsSubject.Text, HTML, REPORT_FILE_GENERATED)
		Catch
			Log(LastException)
		End Try

		'CallSubDelayed3(requests, "Return2CLAI", this, 1)
	End If
End Sub

Sub objectImage_Click
	
End Sub


Sub CreateobjectDetailsData(clear As Boolean, Record As Cursor) As Int
	
	If clear Then
		objectListView.Clear
	End If
	Dim idx As Int = objectListView.Size
	If idx >0 Then idx = idx-1
	
	MakeAddressesFolder(0, Record, "Moradas")
	
	idx = idx + 1
	Dim sSQL As String = $"${DBStructures.SQL_CURRENT_CONTACTS}  where a.tagcode in (select contact from contacts2objects where object='${Record.GetString("tagcode")}')"$
	Log(sSQL)
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	Private rContact As Cursor
	rContact = Starter.LocalSQL.ExecQuery(sSQL)
	If rContact.RowCount > 0 Then
		id.ExpandedHeight = 50dip + (rContact.RowCount * 200dip)
		Dim chapter1 As B4XView = CreateChapterContact(Colors.Gray, "Contactos", id, 1, objectListView.AsView.Width, False)
		idx = idx + 1
		
		For i=0 To rContact.RowCount-1
			rContact.Position = i
			MakeContactsFolder(1, chapter1, rContact, id, (i*200dip))
		Next
	Else
		id.ExpandedHeight = 50dip
		Dim chapter1 As B4XView = CreateChapterContact(Colors.Gray, "Contactos", id, 1, objectListView.AsView.Width, False)
		idx = idx + 1
	End If
	rContact.Close
	objectListView.Add(chapter1, id)
	ExpandItemObj(1)

'	MakePropertiesFolder(idx, Record, "Campos adicionais")
'	idx = idx + 1
	
	'Record.Close
	Return idx
End Sub

Sub CreateobjectDetailsDataProp(idx As Int, clear As Boolean, Tagcode As String) 'Record As Cursor)
	'objectPropertyListView.Clear
	MakePropertiesFolder(2, Tagcode, "Campos do objecto")
End Sub

Sub MakeAddressesFolder(idx As Int, Record As Cursor, title As String)
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	id.ExpandedHeight = 50dip + 225dip
	Dim chapter As B4XView = CreateChapterContact(Colors.Gray, title, id, idx, objectListView.AsView.Width, False)
	Dim p As Panel
	p.Initialize("")
	Activity.AddView(p, 0, 0, 100%x, 275dip)
	p.LoadLayout("ItemAddress")
	p.RemoveView
	p.Tag = idx
	lblAddressName.Text = Record.GetString("address")
	lblAddressName2.Text = Record.GetString("address2")
	lblAddressPostalCode.Text = Record.GetString("postal_code")
	lblAddressCity.Text = Record.GetString("city")
	lblAddressLatitude.Text = Record.GetString("latitude")
	lblAddressLongitude.Text = Record.GetString("longitude")
	lblAddressType.Text = "Sede/Facturação"
	butAddressEdit.Tag = Record.GetString("local")
	butAddressMap.Tag = Record.GetString("local")
	pnlGroupExpanded.AddView(p, 0, 0, 100%x, 225dip)
	
	objectListView.Add(chapter, id)
	ExpandItemObj(0)
	
End Sub

Sub MakeContactsFolder(idx As Int, chapter1 As B4XView, Record As Cursor, id As ItemData, top As Int)
	
	Dim p1 As Panel
	p1.Initialize("GroupLineClick")
	Activity.AddView(p1, 0, 0, 100%x, 200dip)
	p1.LoadLayout("ItemContact")
	p1.RemoveView
	p1.Tag = idx
	lblContactName.Text = Record.GetString("name")
	lblContactPhone.Text = Record.GetString("phone")
	lblContactEmail.Text = Record.GetString("email")
	lblTypeContact.Text = Record.GetString("typedesc")
	
	butContactEdit.Tag = Record.GetString("tagcode")
	pnlGroupExpanded.AddView(p1, 0, top, p1.Width, 200dip)
	
End Sub

Sub CollapseItemObj(index As Int)
	Dim id As ItemData = objectListView.GetValue(index)
	objectListView.ResizeItem(index, id.CollapsedHeight)
	objectListView.GetPanel(index).Tag = False
	'AnimatedArrow(index, 180, 0)
	
	If (pnlGroupCurrenIndex <> index) Then
'		objectListView.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
'		objectListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		objectListView.GetPanel(index).GetView(0).GetView(1).Text = Types.EXPAND_ICON
		pnlGroupCurrenIndex = index
'	Else
'		butGroupCollpseExpand.text = Types.EXPAND_ICON
	End If
	
End Sub

Sub ExpandItemObj (index As Int)
	Dim id As ItemData = objectListView.GetValue(index)
	objectListView.ResizeItem(index, id.ExpandedHeight)
	objectListView.GetPanel(index).Tag = True
	'AnimatedArrow(index, 0, 180)
	If (pnlGroupCurrenIndex <> index) Then
'		objectListView.GetPanel(pnlGroupCurrenIndex).GetView(0).GetView(2).Color = Consts.NoColor
'		objectListView.GetPanel(index).GetView(0).GetView(2).Color = Consts.ColorRed
		objectListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
		pnlGroupCurrenIndex = index
'	Else
'		objectListView.GetPanel(index).GetView(0).GetView(1).Text = Types.COLLAPSE_ICON
	End If
End Sub

Sub MakePropertiesFolder(idx As Int, tagcode As String, title As String)
	Dim id As ItemData
	id.Initialize
	id.CollapsedHeight = 50dip
	Dim ExpandThis As Boolean = False
	
	Private Record2 As Cursor
	'Dim tgobject As String = Record.GetString("tagcode")
	Dim SQL As String = $"${DBStructures.SQL_CURRENT_OBJECTS_PROPERTIES} where object='${tagcode}'"$
	Log(SQL)
	Record2 = Starter.LocalSQL.ExecQuery(SQL)
	If Record2.RowCount > 0 Then
		Dim row As Int = 0
		id.ExpandedHeight = 50dip + (60dip * Record2.RowCount)
		Dim chapter As B4XView = CreateChapterProp(Colors.Gray, title, id, idx, objectListView.AsView.Width, False)
		idx = idx +1
		ExpandThis = True
		For i=0 To Record2.RowCount-1
			Record2.Position = row
			
			Dim p As Panel
			p.Initialize( "GroupLineClickProp")
			Activity.AddView(p, 0, 0, 100%x, id.ExpandedHeight)
			p.LoadLayout("ItemProperty")
			p.RemoveView
			p.Tag = idx
			lblPropertyValue.Text = Record2.GetString("value")
			lblPropertyName.Text = Record2.GetString("title")
			lblPropertyName.tag = Record2.GetString("object") 		'Referência da Entidade
			butPropertyEdit.tag = Record2.GetString("property")		'Referência do campo
			Dim Height As Int = ((i+1)*60dip)-60dip
			pnlGroupExpandedProp.AddView(p, 0, Height, 100%x, 60dip)
			row = row +1
		Next
	Else
		id.ExpandedHeight = 50dip
		Dim chapter As B4XView = CreateChapterProp(Colors.Gray, title, id, idx, objectListView.AsView.Width, False)
	End If
	Record2.Close
	
	objectListView.Add(chapter, id)
	ExpandItemObj(2)
	'If ExpandThis Then ExpandItemProp(idx)
End Sub

Sub CreateChapterContact(clr As Int, Title As String, id As ItemData, idx As Int, width As Int, Expanded As Boolean) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, width, id.ExpandedHeight) 'objectListView.AsView.Width, id.ExpandedHeight)
	p.LoadLayout("ListCollapseGroup_2")
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblGroupTitle.Text = Title
	lblGroupTitle.Tag = idx
	pnlGroupTitle.Tag = idx
	butGroupCollpseExpand.Tag = idx
	p.Tag = Expanded 'collapsed
	Return p
End Sub

Sub CreateChapterProp(clr As Int, Title As String, id As ItemData, idx As Int, width As Int, Expanded As Boolean) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, width, id.ExpandedHeight) 'objectListView.AsView.Width, id.ExpandedHeight)
	
	p.LoadLayout("ListCollapseGroupProp")
	p.SetLayoutAnimated(0, 0, 0, p.Width,id.CollapsedHeight)
	lblGroupTitleProp.Text = Title
	lblGroupTitleProp.Tag = idx
	pnlGroupTitleProp.Tag = idx
	butGroupCollpseExpandProp.Tag = idx
	p.Tag = Expanded 'collapsed
	Return p
End Sub

Sub GroupPropCollpseExpand_Click
	'Msgbox("Clicou Expand Painel", "Alerta!")
	Dim p As B4XView = objectListView.GetPanel(pnlGroupCurrenIndex)
	If p.Tag = True Then
		CollapseItemObj(pnlGroupCurrenIndex)
	Else
		ExpandItemObj(pnlGroupCurrenIndex)
	End If
End Sub


Sub GroupCollpseExpand_Click
	'Msgbox("Clicou Expand Painel", "Alerta!")
	Dim p As B4XView = objectListView.GetPanel(pnlGroupCurrenIndex)
	If p.Tag = True Then
		CollapseItemObj(pnlGroupCurrenIndex)
	Else
		ExpandItemObj(pnlGroupCurrenIndex)
	End If
End Sub

Sub CLAItemDateEditValue_EnterPressed
	
End Sub

'Dim tt As TimePickerDialog
Sub CLAItemDateEditValue_FocusChanged (HasFocus As Boolean)
	If (HasFocus = True) Then
		CurrentDateEdit = Sender
		Dim dd As DatePickerDialog
		DateTime.DateFormat = Consts.DateTimeFormat
		Dim dnow As Long = DateTime.Now
		Try
			
			If (CurrentDateEdit.Text  <> "") Then
				dnow = DateTime.DateParse(CurrentDateEdit.text)
			End If
			dd.Initialize("CalendarGetDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
			'dd.AccentColor2 = Consts.ColorRed
			dd.show("CurrentDateEdit")
		Catch
			Log(LastException)
		End Try
	End If
End Sub

Sub CalendarGetDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	CurrentDateEdit.Text = $"${year}-${moy}-${dom}"$
	
	If Not(Utils.isNullOrEmpty(CurrentDateEdit.Tag)) Then
		Dim Columns As List = Regex.Split("\|", CurrentDateEdit.tag )
	
		Dim request_tagcode As String = Columns.Get(0)
		Dim action_tagcode As String = Columns.Get(1)
		Dim task_tagcode As String = Columns.Get(2)
		Dim item_tagcode As String = Columns.Get(3)
		Dim uniquekey As String = Columns.Get(4)
		Dim tagcode As String = Columns.Get(5)
		Dim val As Int = Columns.Get(6)
		Dim StatusIcon As Int = Columns.Get(7)
		Dim sACLADatetime As String = Utils.GetCurrDatetime
		Private sACLALatitude As String = ""
		Private sACLALongitude As String = ""
		If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lat)) Then sACLALatitude = LocationService.GeoLocal.lat
		If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lon)) Then sACLALongitude = LocationService.GeoLocal.lon

		Dim sSQL As String = $"update requests_values set value='${CurrentDateEdit.Text}', val_date='${sACLADatetime}', val_latitude='${sACLALatitude}', val_longitude='${sACLALongitude}' where request_tagcode='${request_tagcode}' and
						task_tagcode='${task_tagcode}' and item_tagcode='${item_tagcode}' and 
						uniquekey='${uniquekey}' and tagcode='${tagcode}'"$
		Log(sSQL)
		Starter.LocalSQL.ExecNonQuery(sSQL)
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", request_tagcode)
		params.Put("ACLAAction", action_tagcode)
		params.Put("ACLATask", task_tagcode)
		params.Put("ACLAItem", item_tagcode)
		params.Put("ACLAUniqueKey", uniquekey)
		params.Put("ACLATagcode", tagcode)
		params.Put("ACLAValue", CurrentDateEdit.Text)
		
		params.Put("ACLADatetime", sACLADatetime)
		params.Put("ACLALatitude", sACLALatitude)
		params.Put("ACLALongitude", sACLALongitude)

		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/update"$, "")
		Sleep(250)

	End If
End Sub

'Dim  As 
Sub CLAItemTimeEditValue_FocusChanged (HasFocus As Boolean)
	If (HasFocus = True) Then
		CurrentTimeEdit = Sender
		Dim tt As TimePickerDialog
		DateTime.DateFormat = Consts.DateTimeFormat
		Dim dnow As Long = DateTime.Now
		Try
			If (CurrentTimeEdit.Text  <> "") Then
				dnow = DateTime.TimeParse($"${CurrentTimeEdit.text}:00"$)
			End If
			
			tt.Initialize("CalendarGetTime", DateTime.GetHour(dnow), DateTime.GetMinute(dnow), True)
			'tt.AccentColor2 = Consts.ColorRed
			tt.show("CurrentTimeEdit")
		Catch
			Log(LastException)
		End Try
	End If
End Sub

Sub CalendarGetTime_onTimeSet (hour As Int, minute As Int, second As Int)
	CurrentTimeEdit.Text = $"$2.0{hour}:$2.0{minute}"$
	If Not(Utils.isNullOrEmpty(CurrentTimeEdit.Tag)) Then
		Dim Columns As List = Regex.Split("\|", CurrentTimeEdit.tag )
	
		Dim request_tagcode As String = Columns.Get(0)
		Dim action_tagcode As String = Columns.Get(1)
		Dim task_tagcode As String = Columns.Get(2)
		Dim item_tagcode As String = Columns.Get(3)
		Dim uniquekey As String = Columns.Get(4)
		Dim tagcode As String = Columns.Get(5)
		Dim val As Int = Columns.Get(6)
		Dim StatusIcon As Int = Columns.Get(7)
		Dim sACLADatetime As String = Utils.GetCurrDatetime
		Private sACLALatitude As String = ""
		Private sACLALongitude As String = ""
		If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lat)) Then sACLALatitude = LocationService.GeoLocal.lat
		If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lon)) Then sACLALongitude = LocationService.GeoLocal.lon

		Dim sSQL As String = $"update requests_values set value='${CurrentTimeEdit.Text}', val_date='${sACLADatetime}', val_latitude='${sACLALatitude}', val_longitude='${sACLALongitude}' where request_tagcode='${request_tagcode}' and
						task_tagcode='${task_tagcode}' and item_tagcode='${item_tagcode}' and 
						uniquekey='${uniquekey}' and tagcode='${tagcode}'"$
		Log(sSQL)
		Starter.LocalSQL.ExecNonQuery(sSQL)
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", request_tagcode)
		params.Put("ACLAAction", action_tagcode)
		params.Put("ACLATask", task_tagcode)
		params.Put("ACLAItem", item_tagcode)
		params.Put("ACLAUniqueKey", uniquekey)
		params.Put("ACLATagcode", tagcode)
		params.Put("ACLAValue", CurrentTimeEdit.Text)
		
		params.Put("ACLADatetime", sACLADatetime)
		params.Put("ACLALatitude", sACLALatitude)
		params.Put("ACLALongitude", sACLALongitude)

		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/update"$, "")
		Sleep(250)

	End If
End Sub


Sub CLAItemEditValue_FocusChanged (HasFocus As Boolean)
	If (HasFocus = True) Then
		Dim edt As FloatLabeledEditText = Sender
		edt.EditText.SelectAll
	End If
End Sub


Sub SendReportEmailExt(EmailTo As String, EmailCC As String, Subject As String, Details As String, fileName As String)
	Dim eSMTP As SMTP
	eSMTP.Initialize("mail.evolutioncheck.pt", 587, "alertas@vrcg.pt", "..Alertas@VRCG_20!9", "eSMTPReturn")
	eSMTP.StartTLSMode = True
	eSMTP.HtmlBody = True
	eSMTP.To.AddAll(Regex.Split("\;", EmailTo ))
	eSMTP.CC.AddAll(Regex.Split("\;", EmailCC ))
	eSMTP.Subject = Subject
	eSMTP.Body = Details
	eSMTP.AddAttachment(Starter.SharedFolder, fileName)
	eSMTP.Send
End Sub

Sub eSMTPReturn_MessageSent(Success As Boolean)
	Log("SMTP send: " & Success )
	If Success Then
		ToastMessageShow("Email Sent !",True)
	Else
		ToastMessageShow("Email NOT Sent !",True)
		Log(LastException.Message)
	End If
End Sub

Sub butMoreRight_Click
	
End Sub

Sub butAddMore_Click
	Dim But As Button = Sender
	Dim ChapterItem As RequestCLAItem = But.Tag
	
	Private sSQL As String = $"select count(0) as total from tasks_items as a where a.parent='${ChapterItem.UniqueKey}'"$
	Private TotalItems As Int = 0
	Private TotalItemsCursor As Cursor
	TotalItemsCursor = Starter.LocalSQL.ExecQuery(sSQL)
	If TotalItemsCursor.RowCount > 0 Then
		TotalItemsCursor.Position = 0
		TotalItems = TotalItemsCursor.GetInt("total")
	End If
	TotalItemsCursor.Close
	
	Private sSQL As String = $"select max(id) as maxID from requests_values"$
	Private maxItems As Int = 0
	Private maxItemsCursor As Cursor
	maxItemsCursor = Starter.LocalSQL.ExecQuery(sSQL)
	If maxItemsCursor.RowCount > 0 Then
		maxItemsCursor.Position = 0
		maxItems = maxItemsCursor.GetInt("maxID")
	End If
	maxItemsCursor.Close
	
	Dim sSQL As String = $"select a.* from requests_values as a where
    					a.item_tagcode||a.uniquekey in (select item_tagcode||uniquekey  
						from tasks_items where parent='${ChapterItem.UniqueKey}') and a.repeatcounter=1"$
	Private TotalItemsCursor As Cursor
	TotalItemsCursor = Starter.LocalSQL.ExecQuery(sSQL)
	If TotalItemsCursor.RowCount > 0 Then
		TotalItemsCursor.Position = 0
		TotalItems = TotalItemsCursor.GetInt("total")
	End If
	TotalItemsCursor.Close
End Sub

Sub butMoreLeft_Click
	
End Sub

Sub Return2CLAI(CLAItem As RequestCLAItem, TabPos As Int)
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(Activity, "CheckList2", CLAItem, TabPos, "", MainObservations)
End Sub

Sub FINItemImages_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub ShowImage_Click
	
End Sub

Sub ShowImage_LongClick
	Dim imgv As ImageView = Sender
	Dim imgdata As ImageViewData = imgv.Tag 'ImageViewData
	Dim Filter As AppDialogs
	Filter.Initialize
	Filter.getShowImageViewDialog(Me, imgdata.filename, imgdata.b64, imgdata.filename)
End Sub

Sub saveFinalObs
	Try
		Dim valor As String = FinalObs.Text
		Dim sSQL As String = $"update requests_tasks set request_obs='${valor}' where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
		Starter.LocalSQL.ExecNonQuery(sSQL)
	Catch
		Log(LastException)
	End Try
End Sub

Sub FinalObs_TextChanged (Old As String, New As String)
'	Dim curr As FloatLabeledEditText = Sender
'	If (Old <> New) Then
'		Try
'			Dim valor As String = curr.Text
'			Dim sSQL As String = $"update requests_tasks set request_obs=${valor} where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
'			Starter.LocalSQL.ExecNonQuery(sSQL)
'		Catch
'			Log(LastException)
'		End Try
'	End If
End Sub


Sub FinalObs_FocusChanged (HasFocus As Boolean)
'	Dim curr As FloatLabeledEditText = Sender
'	If Not(HasFocus) Then
'		Try
'			Dim valor As String = curr.Text
'			Dim sSQL As String = $"update requests_tasks set request_obs=${valor} where request_tagcode='${CurrentCLA.Request}' and action_tagcode='${CurrentCLA.Action}'"$
'			Starter.LocalSQL.ExecNonQuery(sSQL)
'		Catch
'			Log(LastException)
'		End Try
'	End If
End Sub