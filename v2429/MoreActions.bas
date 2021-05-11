B4A=true
Group=Main Forms
ModulesStructureVersion=1
Type=Activity
Version=9
@EndOfDesignText@
'MoreActions
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'Private ApplActionDialog As CustomLayoutDialog
	Private CurrentCLD As CustomLayoutDialog
	Private xui As XUI
	Private ApplDialog As CustomLayoutDialog
	
	' **************************************************************
	' ACTION DIALOGS
	' **************************************************************
	Private ACTDLG_ONE_BUTTON As B4XStateButton
	Private ViewSimpleList As CustomListView
	Private ViewSimpleListTitle As Label
	Private ViewSimpleListInfo As Label
	
	Private ThisActivityName_TaskListDialog As Object
	Private ViewSimpleListNumber As Label
	Private ColorTabPanel As Panel
	Private listsBasePanel As Panel
	Private listsTabPanel As TabStrip
	Private obsOptions As Spinner
	Private ItemNotes As EditText
	Private ItemImages As CustomListView
	Private takePhoto As Button
	
	Private ActionCode As String = ""
	Dim Base64Con As Base64Convert
	Private CurrentActivity As Activity
	Private ShowImage As ImageView
	Private ImageFilename As Label
	Private ImageState As Label
	Private takeObsOption As Button
	
	Private dlgASType As Spinner
	Private dlgASEmails As FloatLabeledEditText
	Private dlgASPriority As Spinner
	Private dlgASUrgency As Spinner
	'Private dlgASDetails As FloatLabeledEditText
	Private dlgASAssign As Spinner
	Private dlgASSendEmail As B4XStateButton
	Private ItemASDetails As Label
	Private ItemASAssign As Label
	Private ItemASEmails As Label
	Private ItemASRelated As Label
	Private ItemASViewRelated As Label
	Private ItemASDatetime As Label
	Private ItemASPriority As Label
	Private ItemASState As Label
	Private ItemASUrgency As Label
	Private takeAS As Button
	Private asHistoryList As ExpandedListView
	Private asPanel As Panel
	
	Private AS_Status As List, AS_Types As List, AS_Priority As List, AS_Urgency As List, AS_Modes As List
	Private pnlGroupTitle As Panel
	Private lblGroupTitle As Label
	Private butGroupExpand As Button
	Private pnlGroupExpanded As Panel
	
	Private CurrentIndex As Int = 0
	Private dlgASStatus As Spinner
	
	Private CurrentImageList As List
	Private EmailSentOnNewAS As Boolean = False
	Private CurrentCLAItem As RequestCLAItem
	Private CurrentTagcode As String = ""
	Private sendEmailImages As Button
	Private sendEmail As Button
	Private dlgASEmailsCC As FloatLabeledEditText
	Private dlgASEmailsSubject As FloatLabeledEditText
	Private imageSelected As Label
	Private CLAItem_G1 As Label
	Private CLAItemButton_1 As B4XStateButton
	Private CLAItemButton_2 As B4XStateButton
	Private CLAButtonOptions As Button
	
	Private Master_OBS As String = ""
	Private Master_Image As String = ""
	Private changeAS As Button
	Private PanelOnTop As Int = 0
	Private asHistory As Panel
	
	Private FastOptionCheck As Int = 0
	Private imageSelectedOnReport As Label
	Private CLAItemsList As CustomListView
	Private CLAItemEditValue As FloatLabeledEditText
	Private CLAItemLabel As Label
	
	Private ObjectTagcode As String = "" 'innerObject
	Private ShowImageView As ImageView
	Private CurrentRequestCLAItem As RequestCLAItem
	Private CurrentItemNotes As EditText
	Private dlgASSubject As EditText
	Private dlgASDetails As EditText
	Private butASDueDate As Button
	Private dlgASDueDate As FloatLabeledEditText
	Private associateObject As Button
	Private ImageStateName As Label

End Sub

Sub Activity_Create(FirstTime As Boolean)
	AS_Status = DBStructures.getASStatus
	AS_Types = DBStructures.getASTypes
	AS_Priority = DBStructures.getPriority
	AS_Urgency = DBStructures.getUrgency
	AS_Modes = DBStructures.getASModes
	CurrentImageList.Initialize
	ObjectTagcode = "" 'innerObject
End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'RequestCLAItem(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, Title As String, Answer As String, Value As String)
'MakeActivityParams(activ As Activity, activObj As Object, Posis As Int, innerObject As String, Obs As String) As ActivityParams
Sub GetMoreActions(ActivityParam As ActivityParams, this As RequestCLAItem)
	CurrentRequestCLAItem = this
	'Dim sf As Object = ApplActionDialog.ShowAsync(this.Title, ShareCode.Option_BACK, ShareCode.Option_SENDEMAIL, ShareCode.Option_MAKEALERT, Null, False)
'	Dim sf As Object = ApplActionDialog.ShowAsync(this.Title, ShareCode.Option_BACK, "", ShareCode.Option_MAKEALERT, Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
'	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
'	ApplActionDialog.SetSize(95%x, 95%y)
	ThisActivityName_TaskListDialog = ActivityParam.activObj
'	CurrentCLD = ApplActionDialog
	CurrentActivity = ActivityParam.activ
	CurrentCLAItem = this
	ObjectTagcode = ActivityParam.innerObject
	
	Dim WidthPerc As Int = 100%x
	Dim lbWidth As Int = WidthPerc /2
	
'	Wait For (sf) Dialog_Ready(pnl As Panel)
	Activity.LoadLayout("Dialog_MoreActions")
	
	If (ShareCode.ISPHONE) Then
		listsTabPanel.LoadLayout("CLA_MORE_Evidence_Fotos", "Evidências")
		listsTabPanel.LoadLayout("CLA_MORE_Evidence_Notes", "Notas")
		listsTabPanel.LoadLayout("CLA_MORE_Action_device2", "Acções")
	Else
		listsTabPanel.LoadLayout("CLA_MORE_Evidence", "Evidências")
		listsTabPanel.LoadLayout("CLA_MORE_Action", "Acções subsequentes")
	End If
	
	'listsTabPanel.LoadLayout("ManagementObservations", "Notas/Observações")
	Dim First As Boolean = True
'	If (ShareCode.ISPHONE) Then
'		lbWidth = WidthPerc /3
'	End If
	
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		If First Then
			First = False
			lbl.TextColor = Colors.Black
		End If
		lbl.Width = lbWidth
	Next
	
	obsOptions.Add("")
	
	If (Utils.NNE(ActivityParam.obs)) Then
		Try
			Dim item As List = Regex.Split("\,", ActivityParam.obs )
			For n= 0 To item.Size-1
				obsOptions.Add(item.Get(n))
			Next
		Catch
			Log(LastException)
		End Try

	End If
	
'	obsOptions.Add("Passageiros não compareceram.")
'	obsOptions.Add("Veículo com problemas de iluminação.")
'	obsOptions.Add("Estradas inundadas. Circulação interdita.")
	obsOptions.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	obsOptions.DropdownTextColor = Consts.ColorDarkGray
	
	'*************************************************************************************
	' EVIDENCIAS
	'*************************************************************************************
	Private Record1 As Cursor
	Dim Status As Int = 0
	Dim sSQL As String = $"select ifnull(execute_status,0) as status, ifnull(execute_action,'') as action, ifnull(execute_notes,'') as notes,
		ifnull(execute_value,'') as value from dta_requests_values where request_tagcode='${this.Request}' and
		task_tagcode='${this.Task}' and item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' 
		and tagcode='${this.Tagcode}' 
		and repeatcounter=${this.RepeatCounter}
		and repeatitemcounter=${this.RepeatItemCounter}"$ 
	Record1 = Starter.LocalSQLEVC.ExecQuery($"${sSQL}"$)
				
	If Record1.RowCount > 0 Then
		Record1.Position = 0
		ItemNotes.Text = Record1.GetString("notes")
		ItemNotes.Tag = this 'As RequestCLAItem
		ActionCode = Record1.GetString("action")
	End If
	Record1.Close
	CurrentItemNotes = ItemNotes
	
	associateObject.Enabled = False
	associateObject.tag = this

	If (Utils.NNE(ActivityParam.innerObject)) Then
		Private Record33 As Cursor
		Dim SQL As String = $"Select ifnull(a.image, '') as image, ifnull(a.filename, '') as filename 
							from  dta_objects as a where a.tagcode='${ActivityParam.innerObject}'"$
		Record33 = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record33.RowCount > 0 Then
			Record33.Position = 0
			Dim image As String = Record33.GetString("image")
			Dim ithis As RequestCLAItem = this
			image = image.Replace("data:image/png;base64,", "")
			Dim filename As String = $"Base_${ActivityParam.innerObject}.png"$
			
			If Not(File.Exists(Starter.InternalFolder, filename)) Then
				Try
					Utils.SaveImageFromB64ToFile(image, filename, ShareCode.DEVICE_DEF_IMG_FILETYPE)
				Catch
					Log(LastException)
				End Try
			End If
			ItemImages.Add( CreateImagePanel(ithis, filename, image, 0, ActivityParam.innerObject), "")
		End If
		Record33.Close
	End If
	
	Private Record2 As Cursor
	Dim Status As Int = 0
'	Dim sSQL As String = $"select ifnull(image,'') as image, ifnull(filename,'') as filename, base_image, on_report
'		from requests_values_images where request_tagcode='${this.Request}' and
'		task_tagcode='${this.Task}' and item_tagcode='${this.Item}' and uniquekey='${this.UniqueKey}' and 
'		tagcode='${this.Tagcode}'"$
'	'Record2 = Starter.LocalSQL.ExecQuery($"${sSQL}"$)
	Dim sSQL As String = $"select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report
		from dta_requests_values_images where request_tagcode='${this.Request}' and
		task_tagcode='${this.Task}' and item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' 
		and tagcode='${this.Tagcode}' 
		and repeatcounter=${this.RepeatCounter}
		and repeatitemcounter=${this.RepeatItemCounter}"$
	Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)

	If Record2.RowCount > 0 Then
		For n=0 To Record2.RowCount-1
			Record2.Position = n
			Dim image As String = Record2.GetString("imageb64")
			Dim filename As String = Record2.GetString("imagename")
			If Utils.isNullOrEmpty(image) Then
				If File.Exists(Starter.InternalFolder,filename) Then
					Try
						Dim Base64Con As Base64Convert
						Base64Con.Initialize
						Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, filename)
					Catch
						Log(LastException)
						image = ""
					End Try
				End If
			End If
			
			If Not(Utils.isNullOrEmpty(image)) Then
				'Dim bmp As Bitmap = Base64Con.DecodeToImage(image)
				Dim ithis As RequestCLAItem = this
				ithis.OnReport = Record2.GetInt("on_report")
				ithis.BaseImage = Record2.GetInt("base_image")
				ItemImages.Add(CreateImagePanel(ithis, filename, image, 0, ""), "")
				
				If Not(File.Exists(Starter.InternalFolder,$"${filename}.png"$)) Then
					Utils.SaveImageFromB64ToFile(image, $"${filename}.png"$, ShareCode.DEVICE_DEF_IMG_FILETYPE)
				End If
			End If
		Next
	End If
	Record2.Close
	
	'*************************************************************************************
	' ACÇÕES SUBSEQUENTES
	'*************************************************************************************
	Private Record2 As Cursor
	Dim sSQL As String = $"${DBStructures.SQL_GET_TASK_MORE_AS} and
		a.request_tagcode='${this.Request}' and
		a.action_tagcode='${this.Action}' and 
		a.task_tagcode='${this.Task}' and 
		a.item_tagcode='${this.Item}' and 
		a.uniquekey='${this.UniqueKey}' and 
		a.iu_tagcode='${this.Tagcode}' 
		and repeatcounter=${this.RepeatCounter}
		and repeatitemcounter=${this.RepeatItemCounter} 
		order by a.actiondatetime desc "$
	Record2 = Starter.LocalSQL.ExecQuery($"${sSQL}"$)
	'Log(sSQL)
	If Record2.RowCount > 0 Then
		For n=0 To Record2.RowCount-1
			Record2.Position = n
			If (n=0) Then
				asPanel.AddView(CreateASPanel(this, True, Record2),0,1dip,100%x,100%y)
				CurrentTagcode = Record2.GetString("tagcode")
			End If
			Dim id As ItemData
			id.Initialize
			id.CollapsedHeight = 50dip
			id.ExpandedHeight = 240dip
			asHistoryList.Add( CreateASItemPanel(this, id, Record2, n), id)
		Next
		takeAS.Enabled = False
		takeAS.Visible = False
	Else
		asPanel.AddView(CreateASPanel(this, False, Record2),0,1dip,100%x,100%y)
	End If
	Record2.Close
	'
	listsTabPanel.ScrollTo(ActivityParam.Posis, True)
	
	
	Wait For (sf) Dialog_Result(res As Int)
	
	If res = DialogResponse.POSITIVE Then
		'If Not(Utils.isNullOrEmpty(ItemNotes.Text)) Then
		'CurrentItemNotes
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${ItemNotes.Text}'
				where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and 
				item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' 
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}"$

		Log(sSQL)
		Utils.SaveSQLToLog("GetMoreActions",sSQL, this.Request)
		'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
			
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLRequest", this.Request)
		params.Put("ACLAction", this.Action)
		params.Put("ACLTask", this.Task)
		params.Put("ACLItem", this.Item)
		params.Put("ACLUniqueKey", this.UniqueKey)
		params.Put("ACLTagcode", this.Tagcode)
		params.Put("ACLAObs", ItemNotes.Text)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("versionTagcode", Main.VerisonTagcode)
		
		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/obs/update"$, "")
		Sleep(500)
			
			
		'End If
		For n=0 To ItemImages.Size-1
			Dim pnl As Panel =ItemImages.GetPanel(n)
			Dim img As ImageView = pnl.GetView(0)
			Dim fln As Label = pnl.GetView(1)
			Dim lbl As Label = pnl.GetView(2)
			If (lbl.Tag=1) Or (lbl.Tag=2) Then
				
				Utils.SaveImageviewToFile(img.Bitmap, $"${fln.Text}.png"$, ShareCode.DEVICE_DEF_IMG_FILETYPE)
				Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"${fln.Text}.png"$)
				If (lbl.Tag=1) Then
					'imageb64|imagename
					Dim sSQL As String = $"update dta_requests_values_images set imageb64='${ImgB64}'
							where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and 
							item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and 
							tagcode='${this.Tagcode}' and imagename='${fln.Text}' 
							and repeatcounter=${this.RepeatCounter}
							and repeatitemcounter=${this.RepeatItemCounter}"$
				Else
					Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3 + 1000000 'id, ${maxid},
					Dim sSQL As String = $"insert into dta_requests_values_images 
							(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, 
							imagename, on_report, repeatcounter, repeatitemcounter)
							values (${maxid}, '${this.Request}', '${this.Action}', '${this.Task}', '${this.Item}', '${this.UniqueKey}', '${this.Tagcode}',
					'${ImgB64}', '${fln.Text}', 1, ${this.RepeatCounter}, ${this.RepeatItemCounter})"$
				End If
				
				Utils.SaveSQLToLog("GetMoreActions",sSQL, this.Request)
				'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
			End If
		Next
		CallSubDelayed(ActivityParam.activObj, "ReturnFromCLAI")
	Else If res = DialogResponse.NEGATIVE Then
		Dim lst As List
		lst.Initialize
		Dim Filter As AppActionDialogs
		Filter.Initialize
		Filter.GetMoreSendEmailDialog(CurrentCLAItem, CurrentTagcode, CurrentCLD, ItemNotes.Text, lst ) 'CurrentImageList)
	End If
End Sub

Sub CreateASPanel(this As RequestCLAItem, haveData As Boolean, dataRecord As Cursor) As B4XView
	Dim p As Panel
	p.Initialize("")
	CurrentActivity.AddView(p, 0, 1dip, 100%x, 130dip)
	p.LoadLayout("ItemList_More_ActionLast")
	p.RemoveView

	If (haveData) Then
		ItemASDetails.Text = dataRecord.GetString("details")
		ItemASAssign.Text = dataRecord.GetString("assigned_to")
		ItemASEmails.Text = dataRecord.GetString("email_to")
		ItemASRelated.Text = "" 'dataRecord.GetString("related_task")
		ItemASDatetime.Text = dataRecord.GetString("actiondatetime")
		ItemASPriority.Text = dataRecord.GetString("priority_desc")
		ItemASUrgency.Text = dataRecord.GetString("urgency_desc")
		ItemASState.Text = dataRecord.GetString("status_desc")
'		Private ItemASViewRelated As Label
	End If
	p.Tag = this
	Return p
End Sub

Sub CreateASItemPanel(this As RequestCLAItem, id As ItemData, dataRecord As Cursor, idx As Int) As B4XView
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, asHistoryList.sv.Width, id.ExpandedHeight)
	p.LoadLayout("ItemList_More_GroupAction")
	p.SetLayoutAnimated(0, 0, 0, asHistoryList.sv.Width, id.CollapsedHeight)
	lblGroupTitle.Text = $"${dataRecord.GetString("actiondatetime")} - (${dataRecord.GetString("status_desc")})"$
	pnlGroupExpanded.AddView(CreateASInnerItemPanel(this, dataRecord), 0, 0, 100%x,190dip)

	lblGroupTitle.Tag = idx
	pnlGroupTitle.Tag = idx
	butGroupExpand.Tag = idx
	
	p.Tag = False
	Return p
End Sub

Sub CreateASInnerItemPanel(this As RequestCLAItem, dataRecord As Cursor) As B4XView
	Dim p As Panel
	p.Initialize("")
	CurrentActivity.AddView(p, 0, 0, pnlGroupExpanded.Width, 190dip)
	p.LoadLayout("ItemList_More_Action")
	p.RemoveView
	ItemASDetails.Text = dataRecord.GetString("details")
	ItemASAssign.Text = dataRecord.GetString("assigned_to")
	ItemASEmails.Text = dataRecord.GetString("email_to")
	ItemASRelated.Text = "" 'dataRecord.GetString("related_task")
	ItemASPriority.Text = dataRecord.GetString("priority_desc")
	ItemASUrgency.Text = dataRecord.GetString("urgency_desc")
	p.Tag = this
	Return p
End Sub

Sub dlgASSendEmail_Click
	
End Sub

Sub dlgASAssign_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub ItemASViewRelated_Click
	
End Sub

Sub asHistoryList_ItemClick (Index As Int, Value As Object)
	CurrentIndex = Index
'	butGroupExpand_Click
	Log("Clicou")
End Sub

'====================================================================================================
'	CRIA NOVA ACÇÃO SUBSQUENTE
'====================================================================================================
Sub takeAS_Click
	Dim theTagcode As String = CurrentCLAItem.Tagcode.Trim
	
	Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotes.Text}'
				where request_tagcode='${CurrentCLAItem.Request}' and task_tagcode='${CurrentCLAItem.Task}' and 
				item_tagcode='${CurrentCLAItem.Item}' and unique_key='${CurrentCLAItem.UniqueKey}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
	Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLRequest", CurrentCLAItem.Request)
	params.Put("ACLAction", CurrentCLAItem.Action)
	params.Put("ACLTask", CurrentCLAItem.Task)
	params.Put("ACLItem", CurrentCLAItem.Item)
	params.Put("ACLUniqueKey", CurrentCLAItem.UniqueKey)
	params.Put("ACLTagcode", CurrentCLAItem.Tagcode)
	params.Put("ACLAObs", CurrentItemNotes.Text)
	params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
	params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
	params.Put("versionTagcode", Main.VerisonTagcode)
		
	Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/obs/update"$, "")
	Sleep(500)
	
	Dim Filter As AppActionDialogs
	Filter.Initialize
	'Filter.GetMoreNewActionsDialog(ThisActivityName_TaskListDialog, CurrentCLAItem, CurrentTagcode, CurrentCLD, CurrentItemNotes.Text, True, theTagcode)
	Filter.GetMoreNewActionsDialog(ThisActivityName_TaskListDialog, CurrentCLAItem, CurrentTagcode, CurrentItemNotes.Text, True, theTagcode, Null, "", "",0)
End Sub

Sub butGroupExpandItem_Click
	
End Sub

Sub butGroupExpand_Click
	Dim this As B4XView = Sender
	If (CurrentIndex <> this.Tag) Then CurrentIndex = this.tag
	Dim p As B4XView = asHistoryList.GetPanel(CurrentIndex)
	If p.Tag = True Then
		asHistoryList.CollapseItem(CurrentIndex)
	Else
		asHistoryList.ExpandItem(CurrentIndex)
	End If
	
End Sub

'====================================================================================================
'	CRIA PAINEL DE IMAGEN
'====================================================================================================
Sub CreateImagePanel(this As RequestCLAItem, filename As String, btm As String, state As Int, innerTag As String) As B4XView
	Dim p As Panel
	p.Initialize("") 'ImageViewEdit")
	CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)
	p.LoadLayout("CLA_MORE_IMGAGE_Listview")
	p.RemoveView
	
	If (Utils.NNE(btm)) Then
		ShowImage.SetBackgroundImage(Utils.B64ToBitmap(btm))
		ShowImage.Tag = innerTag
	End If
	'ShowImage.Bitmap = btm
	
	ImageFilename.Text = filename
	ImageFilename.Tag = innerTag
	ImageStateName.Text = ""
	ImageStateName.Tag = state
	imageSelected.Tag = 0
	imageSelected.TextColor = Consts.ColorLightSilver
	imageSelectedOnReport.TextColor = Consts.ColorLightSilver
	imageSelectedOnReport.Tag = this
	If (this.OnReport = 1) Then
		imageSelectedOnReport.TextColor = Consts.ColorGreen
	End If
'	If (state = 1) Then
'		ImageStateName.Text = "Imagem alterada"
'	Else If (state = 2) Then
'		ImageStateName.Text = "Nova imagem"
'	End If
	
	p.Tag = this
	Return p
End Sub

Sub listsTabPanel_PageSelected (Position As Int)
	Dim lst As List = Utils.GetAllTabLabels(listsTabPanel)
	For Each lbl As Label In lst
		lbl.TextColor = Colors.White
	Next
	Dim lbl As Label = lst.Get(Position)
	lbl.TextColor = Colors.Black
End Sub

'====================================================================================================
' EDITA IMAGEM SELECCIONADA
'====================================================================================================
Sub ItemImages_ItemClick (Index As Int, Value As Object)
	Dim pan As Panel = ItemImages.GetPanel(Index)
	Dim this As RequestCLAItem = pan.Tag
	Dim ImageFilename As Label = pan.GetView(1)
	Dim ImgB64 As String = ""
	Dim ImgB64Name As String = ""
	Private Record2 As Cursor
	
	Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotes.Text}'
				where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and 
				item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}'
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}"$ ' and tagcode='${this.Tagcode}'"$
	Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	
			
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLRequest", this.Request)
	params.Put("ACLAction", this.Action)
	params.Put("ACLTask", this.Task)
	params.Put("ACLItem", this.Item)
	params.Put("ACLUniqueKey", this.UniqueKey)
	params.Put("ACLTagcode", this.Tagcode)
	params.Put("ACLAObs", ItemNotes.Text)
	params.Put("ACLAReqCounter", this.RepeatCounter)
	params.Put("ACLARepeatItem", this.RepeatItemCounter)
	params.Put("versionTagcode", Main.VerisonTagcode)
		
	Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/obs/update"$, "")
	Sleep(500)
	
	Dim innerTag As String = ImageFilename.Tag
	If Utils.NNE(innerTag) Then
		Dim sSQL As String = $"Select ifnull(a.image, '') as image from  dta_objects as a where a.tagcode='${innerTag}'"$
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record2.RowCount > 0 Then
			Record2.Position = 0
			ImgB64 = Record2.GetString("image")
			ImgB64 = ImgB64.Replace("data:image/png;base64,", "")
			ImgB64Name = ""
		End If
		
	Else
		Dim sSQL As String = $"select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report
				from dta_requests_values_images where request_tagcode='${this.Request}' and
				task_tagcode='${this.Task}' and item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and tagcode='${this.Tagcode}'
				and imagename='${ImageFilename.Text}'
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}"$
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record2.RowCount > 0 Then
			Record2.Position = 0
			ImgB64 = Record2.GetString("imageb64")
			ImgB64Name = Record2.GetString("imagename")
			If Utils.isNullOrEmpty(ImgB64) Then
				If File.Exists(Starter.InternalFolder,ImgB64Name) Then
					Try
						Dim Base64Con As Base64Convert
						Base64Con.Initialize
						Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, ImgB64Name)
					Catch
						Log(LastException)
						image = ""
					End Try
				End If
			End If
		End If
	End If
'	imageb64|imagename
		
	Record2.Close
	
'	If Not(Utils.NNE(ImgB64)) Then
'		If (Utils.NNE(ImgB64Name)) Then
'			If File.Exists(Starter.InternalFolder, ImgB64Name) Then
'				Try
'					ImgB64 = Base64Con.EncodeFromImage(Starter.InternalFolder, ImgB64Name)
'				Catch
'					Log(LastException)
'					ImgB64 = ""
'				End Try
'			End If
'		Else
'			If (Utils.NNE(ImageFilename.text)) Then
'				If File.Exists(Starter.InternalFolder, ImageFilename.text) Then
'					Log(ImageFilename.text)
'					Try
'						ImgB64 = Base64Con.EncodeFromImage(Starter.InternalFolder, ImageFilename.text)
'					Catch
'						Log(LastException)
'						ImgB64 = ""
'					End Try
'				End If
'			Else
'			End If
'		End If
'	End If
	
	
	'If Not(Utils.isNullOrEmpty(ImgB64)) Then
	If Utils.NNE(ImgB64) Then
		CallSubDelayed3(ImageEdit, "StartDrawFrom3", ImgB64, CurrentCLAItem)
	Else
		MsgboxAsync("Erro na identificação da imagem seleccionada!", "Alerta!")
	End If
End Sub


Sub ItemImages_LongClick

End Sub

Sub imageSelected_Click
	Dim lbl As Label = Sender
	Dim pnl As Panel = lbl.Parent
	Dim fln As Label = pnl.GetView(1)
	Dim nColor As Int = Consts.ColorLightSilver
	Dim State As Int = 0
	If Not(Utils.isNullOrEmpty(lbl.tag)) Then State = lbl.Tag
	If (State = 0) Then
		State = 1
		nColor = Consts.ColorGreen
		CurrentImageList.Add(fln.Text)
	Else
		State = 0
		Dim val As Int = CurrentImageList.IndexOf(fln.Text)
		If (val >= 0) Then
			CurrentImageList.RemoveAt(CurrentImageList.IndexOf(fln.Text))
		End If
	End If
	'imageSelected
	lbl.Tag = State
	lbl.TextColor = nColor
End Sub

Sub takePhoto_Click
	Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotes.Text}'
				where request_tagcode='${CurrentCLAItem.Request}' and task_tagcode='${CurrentCLAItem.Task}' and 
				item_tagcode='${CurrentCLAItem.Item}' and unique_key='${CurrentCLAItem.UniqueKey}'
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ ' and tagcode='${CurrentCLAItem.Tagcode}'"$
	Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	
			
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLRequest", CurrentCLAItem.Request)
	params.Put("ACLAction", CurrentCLAItem.Action)
	params.Put("ACLTask", CurrentCLAItem.Task)
	params.Put("ACLItem", CurrentCLAItem.Item)
	params.Put("ACLUniqueKey", CurrentCLAItem.UniqueKey)
	params.Put("ACLTagcode", CurrentCLAItem.Tagcode)
	params.Put("ACLAObs", CurrentItemNotes.Text)
	params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
	params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
	params.Put("versionTagcode", Main.VerisonTagcode)
		
	Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/obs/update"$, "")
	Sleep(1000)
	
	CallSubDelayed3(CameraActivity2, "StartCamera2", Me, CurrentCLAItem)
	
End Sub

Sub CameraReturnNothing
	'
End Sub



Sub takeNewDesign_Click
'	Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotes.Text}'
'				where request_tagcode='${CurrentCLAItem.Request}' and task_tagcode='${CurrentCLAItem.Task}' and 
'				item_tagcode='${CurrentCLAItem.Item}' and unique_key='${CurrentCLAItem.UniqueKey}'
'				and repeatcounter=${CurrentCLAItem.RepeatCounter}
'				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ ' and tagcode='${CurrentCLAItem.Tagcode}'"$
'	Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
'	
'	Dim params As Map
'	params.Initialize
'	params.Clear
'	params.Put("_token", ShareCode.APP_TOKEN)
'	params.Put("ACLRequest", CurrentCLAItem.Request)
'	params.Put("ACLAction", CurrentCLAItem.Action)
'	params.Put("ACLTask", CurrentCLAItem.Task)
'	params.Put("ACLItem", CurrentCLAItem.Item)
'	params.Put("ACLUniqueKey", CurrentCLAItem.UniqueKey)
'	params.Put("ACLTagcode", CurrentCLAItem.Tagcode)
'	params.Put("ACLAObs", CurrentItemNotes.Text)
'	params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
'	params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
'		
'	Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/obs/update"$, "")
'	Sleep(500)
'	
'	CallSubDelayed3(ImageEdit, "StartDraw", Me, CurrentCLAItem)
End Sub

'*************************************************************************************
' METODO/FUNÇÃO QUE RETORNA DA EXECUÇÃO DA CAMERA
'*************************************************************************************
Public Sub CameraReturn(FileName As String, this As RequestCLAItem)
	
	'CurrentCLAItem
	Dim obj As String = ObjectTagcode
	If (Utils.isNullOrEmpty(obj)) Then
		obj = this.TagObject
	End If
	Dim params As Map
	Dim params33 As Map
	
	If Not(Utils.isNullOrEmpty(FileName)) Then
		If Not(FileName.IndexOf(".png") >= 0) Then
			FileName = $"${FileName}.png"$
		End If
		Dim Base64Con As Base64Convert
		Base64Con.Initialize
		Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"${FileName}"$)
		'imageb64|imagename
		
		
		Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "")+3 + 1000000 'id, ${maxid},
		Dim sSQL As String = $"insert into dta_requests_values_images 
						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, 
						imagename, on_report, repeatcounter, repeatitemcounter)
						values (${maxid}, '${this.Request}', '${this.Action}', '${this.Task}', '${this.Item}', '${this.UniqueKey}', '${this.Tagcode}',
		'${ImgB64}', '${FileName}', 1, ${this.RepeatCounter}, ${this.RepeatItemCounter})"$
						
		Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		
		If (Utils.NNE(obj)) Then
			Dim v As Int = Utils.DBDataCount(Starter.LocalSQLEVC, $"select count(0) as COUNTER from dta_objects_images "$) +1
			Dim sSQL As String = $"insert into dta_objects_images (id, object_tagcode, image, filename)
					values (${v}, '${obj}', '${ImgB64}', '${FileName}')"$
			Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
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
		'params.Put("ACLAValueNotes", New)
		'params.Put("ACLAValueAction", New)
		params.Put("ACLAValueImage", ImgB64)
		params.Put("ACLAValueFileImage", FileName)
		params.Put("ACLAOnReport", 1)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("versionTagcode", Main.VerisonTagcode)
		
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
	
	If Not(this.Value = "IMG_B64_EDIT") Then
		If (ItemImages.IsInitialized) Then
			ItemImages.Clear
		End If
		Private Record2 As Cursor
		Dim Status As Int = 0
		'imageb64|imagename
		Dim sSQL As String = $"select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report
		from dta_requests_values_images where request_tagcode='${this.Request}' and
		task_tagcode='${this.Task}' and item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and 
		tagcode='${this.Tagcode}'
		And repeatcounter=${this.RepeatCounter}
		And repeatitemcounter=${this.RepeatItemCounter}"$
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)
		
		If Record2.RowCount > 0 Then
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				Dim image As String = Record2.GetString("imageb64")
				Dim FileName As String = Record2.GetString("imagename")
				
				If Utils.isNullOrEmpty(image) Then
					If File.Exists(Starter.InternalFolder,FileName) Then
						Try
							Dim Base64Con As Base64Convert
							Base64Con.Initialize
							Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, FileName)
						Catch
							Log(LastException)
							image = ""
						End Try
					End If
				End If
				If Not(Utils.isNullOrEmpty(image)) Then
					'Dim bmp As Bitmap = Base64Con.DecodeToImage(image)
					If (ItemImages.IsInitialized) Then
						ItemImages.Add(CreateImagePanel(this, FileName, image, 0, ""), "")
					End If
				End If
			Next
		End If
		Record2.Close
	End If
	
	'Dim params As Map
	If (params.IsInitialized) Then
		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai-more/img/update"$, "")
		Sleep(1000)
		
		UploadFilesWithFTP(FileName)
		Sleep(1000)
	End If
	
	If (params33.IsInitialized) Then
		Utils.CallApi(params33, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai-more2/img/update"$, "")
		Sleep(1000)
	End If
	
	
	
	'CallSub(CameraActivity, "CloseActivity")
End Sub

Sub UploadFilesWithFTP(filename As String )
	Dim myFTP As FTP
	myFTP.Initialize("ftp", "ftp.vrcg.pt", 21, "EvolutionCheck@vrcg.pt", "..VRCG@EvolutionCheck20!9")
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
	Else
		Log("Error uploading file")
	End If
	myFTP.Close
End Sub

Sub obsOptions_ItemClick (Position As Int, Value As Object)
	If (Position = 0) Then
	Else
		ItemNotes.Text = ItemNotes.Text & obsOptions.GetItem(Position)
		CurrentItemNotes = ItemNotes
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotes.Text}'
				where request_tagcode='${CurrentCLAItem.Request}' and task_tagcode='${CurrentCLAItem.Task}' and 
				item_tagcode='${CurrentCLAItem.Item}' and unique_key='${CurrentCLAItem.UniqueKey}'
				And repeatcounter=${CurrentCLAItem.RepeatCounter}
				And repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
		Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		
			
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLRequest", CurrentCLAItem.Request)
		params.Put("ACLAction", CurrentCLAItem.Action)
		params.Put("ACLTask", CurrentCLAItem.Task)
		params.Put("ACLItem", CurrentCLAItem.Item)
		params.Put("ACLUniqueKey", CurrentCLAItem.UniqueKey)
		params.Put("ACLTagcode", CurrentCLAItem.Tagcode)
		params.Put("ACLAObs", CurrentItemNotes.Text)
		params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
		params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
		
		params.Put("versionTagcode", Main.VerisonTagcode)
		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/obs/update"$, "")
		Sleep(1000)
		
		obsOptions.SelectedIndex = 0
	End If
End Sub

Sub takeObsOption_Click
	obsOptions_ItemClick(obsOptions.SelectedIndex, "")
End Sub

Sub sendEmail_Click
	'dialog_more_action_sendEmail
	Dim lst As List
	lst.Initialize
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreSendEmailDialog(CurrentCLAItem, CurrentTagcode, CurrentCLD, ItemNotes.Text, lst ) 'CurrentImageList)
End Sub

Sub sendEmailImages_Click
	If (CurrentImageList.Size >= 1) Then
		Dim Filter As AppActionDialogs
		Filter.Initialize
		Filter.GetMoreSendEmailDialog(CurrentCLAItem, CurrentTagcode, CurrentCLD, ItemNotes.Text, CurrentImageList)
	Else
		MsgboxAsync("Tem de seleccionar 1 ou mais imagens para poder continuar!", "Alerta!")
	End If
End Sub




'*************************************************************************************
' NOVA ACÇÃO SUBSEQUENTE
'*************************************************************************************
Sub GetMoreNewActionsDialog(activ As Object, this As RequestCLAItem, asTagcode As String, origin As CustomLayoutDialog, obs As String)
	Dim Title As String = ShareCode.ActionSubEditTitle
	If Utils.isNullOrEmpty(asTagcode) Then Title = ShareCode.ActionSubNewTitle
	Dim sf As Object = ApplDialog.ShowAsync(Title, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		ApplDialog.SetSize(90%x, 95%y)
	Else
		ApplDialog.SetSize(90%x, 690dip)
	End If
	
'	ThisActivityName_TaskListDialog = activObj
'	CurrentCLD = ApplActionDialog
'	CurrentActivity = activ
'	CurrentCLAItem = this
	EmailSentOnNewAS = True
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_more_action")
	
	dlgASAssign.Add("Cliente")
	
	'MakeDB_ITC(ID As Int, Title As String, Color As String) As DB_ITC
	dlgASStatus.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For n=0 To AS_Status.Size-1
		Dim itc As DB_ITC = AS_Status.Get(n)
		dlgASStatus.Add(itc.Title)
	Next
	
	dlgASType.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	dlgASType.Add("")
	For n=0 To AS_Modes.Size-1
		Dim itc As DB_ITC = AS_Modes.Get(n)
		dlgASType.Add(itc.Title)
	Next
	
	dlgASPriority.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For n=0 To AS_Priority.Size-1
		Dim itc As DB_ITC = AS_Priority.Get(n)
		dlgASPriority.Add(itc.Title)
	Next
	
	dlgASUrgency.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For n=0 To AS_Urgency.Size-1
		Dim itc As DB_ITC = AS_Urgency.Get(n)
		dlgASUrgency.Add(itc.Title)
	Next
	
	dlgASSubject.Text = this.Title
	dlgASDetails.Text = obs
	dlgASEmails.Text = "alertas@vrcg.pt"
	
'	Private butASDueDate As Button
'	Private dlgASDueDate As FloatLabeledEditText

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		origin.CloseDialog(DialogResponse.POSITIVE)
		asTagcode = DBStructures.InsertRequestAS(this, asTagcode, dlgASStatus.SelectedIndex+1, _
					dlgASPriority.SelectedIndex+1, dlgASUrgency.SelectedIndex+1, _
					dlgASAssign.SelectedIndex, dlgASDetails.Text, dlgASEmails.Text, EmailSentOnNewAS, dlgASDueDate.Text)
		If (EmailSentOnNewAS) Then
			Dim HTML As String = $"<html><body>
			<p><h4><strong>Acção Subsequente</strong></h4><br><br>
			<strong>Intervenção: </strong>${this.Request}<br>
			<strong>Assunto: </strong>${dlgASSubject.Text}<br>
			<strong>Prioridade: </strong>${dlgASPriority.GetItem(dlgASPriority.SelectedIndex)}<br>
			<strong>Gravidade: </strong>${dlgASUrgency.GetItem(dlgASUrgency.SelectedIndex)}<br>
			<strong>Data limite: </strong>${dlgASDueDate.Text}<br>
			<strong>Detalhes: </strong>${dlgASDetails.Text}<br></p>
			<p>A equipa ${ShareCode.APP_Company_Name}</>
			</body></html>"$
			Starter.RequestEmailFromBO(asTagcode,dlgASEmails.Text,"",$"${asTagcode} - Accção subsequente"$,"")
'			Utils.SendEmail(dlgASEmails.Text, $"${asTagcode} - Accção subsequente"$, HTML)
		End If
		
		Dim params As Map
		params.Initialize
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", this.Request)
		params.Put("ACLAAction", this.Action)
		params.Put("ACLATask", this.Task)
		params.Put("ACLAItem", this.Item)
		params.Put("ACLAUniqueKey", this.UniqueKey)
		params.Put("ACLAExecuteAction", asTagcode)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("versionTagcode", Main.VerisonTagcode)
		
		Utils.CallApi(params, activ, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai-more/as/update"$, "")
		Sleep(250)
		
		Dim actiondatetime As String = Utils.GetCurrDatetime
		Dim emailsentdate As String = actiondatetime
		Dim params As Map
		params.Initialize
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ASRequest", this.Request)
		params.Put("ASAction", this.Action)
		params.Put("ASTask", this.Task)
		params.Put("ASItem", this.Item)
		params.Put("ASUniqueKey", this.UniqueKey)
		params.Put("ASUITagcode", asTagcode)
		params.Put("ASTagcode", asTagcode)
		params.Put("ASTitle", dlgASSubject.Text)
		params.Put("ASDetails", dlgASDetails.Text)
		params.Put("ASPriority", Utils.getASPriority(dlgASPriority.SelectedIndex+1))
		params.Put("ASUrgency", Utils.getASUrgency(dlgASUrgency.SelectedIndex+1))
		params.Put("ASAssigned", ShareCode.SESS_OPER_User)
		params.Put("ASAssignedType", 0)
		params.Put("ASStatus", Utils.getASStatus(dlgASStatus.SelectedIndex+1))
		params.Put("ASEmailDatetime", emailsentdate)
		params.Put("ASEmailSent", Utils.Bool2Int(EmailSentOnNewAS))
		params.Put("ASEmailTo", dlgASEmails.Text)
		params.Put("ASEmailRelatedTask", "")
		params.Put("ASEmailRelatedAction", "")
		params.Put("ASDueDate", dlgASDueDate.Text)
		params.Put("versionTagcode", Main.VerisonTagcode)
		
		Utils.CallApi(params, activ, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai-more/as/insert"$, "")
		Sleep(250)
		
		'CallSubDelayed3(requests3, "Return2CLAI", this, 1)
		CallSubDelayed3(activ, "Return2CLAI", this, 1)
	End If
End Sub

Sub butASDueDate_Click
	Dim dd As DatePickerDialog
	DateTime.DateFormat = Consts.DateTimeFormat
	Dim dnow As Long = DateTime.Now
	If (dlgASDueDate.Text  <> "") Then
		dnow = DateTime.DateParse(dlgASDueDate.text)
	End If
	dd.Initialize("CalendarGetStartDate", DateTime.GetYear(dnow), DateTime.GetMonth(dnow)-1, DateTime.GetDayOfMonth(dnow))
	dd.show("dlgASDueDate")
End Sub

Sub CalendarGetStartDate_onDateSet(year As Int, monthOfYear As Int, dayOfMonth As Int)
	Dim moy As String = monthOfYear+1
	If (moy.Length = 1) Then moy = "0" & moy
	Dim dom As String = dayOfMonth
	If (dom.Length = 1) Then dom = "0" & dom
	dlgASDueDate.Text = $"${year}-${moy}-${dom}"$
End Sub

Sub dlgASType_ItemClick (Position As Int, Value As Object)
'	Dim sSQL As String = $"${DBStructures.SQL_DATA_TYPE_ASMODES} where id=${Position}"$
'	Private Record2 As Cursor
'	Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)
'	If Record2.RowCount > 0 Then
'		Record2.Position = 0
	''		'id, ascbus, tagcode, , , , assign, color
	''		dlgASPriority.SelectedIndex = Record2.GetInt("priority")-1
	''		dlgASUrgency.SelectedIndex = Record2.GetInt("urgency")-1
	''		dlgASDetails.Text = Record2.GetString("title")
	''		'dlgASAssign.SelectedIndex = Record2.GetInt("assign")
'	End If
'	Record2.Close
End Sub

'SendEmail(EmailTo As String, Subject As String)
'Sub dlgASSendEmail_StateClick (State As Int)
'	EmailSentOnNewAS = (State = 1)
'End Sub

'*************************************************************************************
' ENVIAR EMAIL
'*************************************************************************************
Sub GetMoreSendEmailDialog(this As RequestCLAItem, asTagcode As String, origin As CustomLayoutDialog, obs As String, imgList As List)
	If (imgList.Size = 0) Then
		Dim sf As Object = ApplDialog.ShowAsync(ShareCode.Option_MAKEALERT, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	Else
		Dim sf As Object = ApplDialog.ShowAsync(ShareCode.Option_SENDEMAIL, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	End If
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		ApplDialog.SetSize(95%x, 80%y)
	Else
		ApplDialog.SetSize(70%x, 430dip)
	End If
	

	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_more_action_sendEmail")
	
	dlgASEmailsCC.Text = "alertas@vrcg.pt"
	dlgASEmailsSubject.Text = $"Ref: ${this.Request} - ${this.Title}"$
	dlgASDetails.Text = obs
	
	dlgASEmails.Text = ""

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		origin.CloseDialog(DialogResponse.POSITIVE)

		Dim HTML As String = $"<html><body>
		<p><h4><strong>Acção/Informação</strong></h4><br><br>
		<strong>Detalhe</strong><br>
		${dlgASDetails.Text}<br></p>
		<p>A equipa ${ShareCode.APP_Company_Name}</>
		</body></html>"$
		Utils.SendEmailExt(dlgASEmails.Text, dlgASEmailsCC.Text, dlgASEmailsSubject.Text, HTML, imgList)

		'CallSubDelayed3(requests, "Return2CLAI", this, 1)
	End If
End Sub

Sub changeAS_Click
	'asHistory  asPanel
	If (PanelOnTop = 0) Then
		asHistory.BringToFront
		PanelOnTop = 1
	Else
		asPanel.BringToFront
		PanelOnTop = 0
	End If
End Sub

Sub ItemImages_ItemLongClick (Index As Int, Value As Object)
	Log(Value)
	Dim thisPanel As B4XView = ItemImages.GetPanel(Index)
	Dim this As RequestCLAItem = thisPanel.Tag
	Dim fname As Label = thisPanel.GetView(1)
	
	If (this.BaseImage = 1) Then
		MsgboxAsync("A imagem seleccionada é uma imagem BASE e não pode ser apagada!", "Alerta!")
	Else
		
		Dim i As Int = Msgbox2(ShareCode.CLAImageRemove, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			Dim thisPanel As B4XView = ItemImages.GetPanel(Index)
			Dim this As RequestCLAItem = thisPanel.Tag
			Dim fname As Label = thisPanel.GetView(1)
			'imageb64|imagename
			Dim sSQL As String = $"delete from dta_requests_values_images where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and
									item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and tagcode='${this.Tagcode}' and imagename='${fname.Text}'
									And repeatcounter=${this.RepeatCounter}
									And repeatitemcounter=${this.RepeatItemCounter}"$

			Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
			Log(sSQL)
			ItemImages.RemoveAt(Index)

			Dim params As Map
			params.Initialize
			params.Clear
			params.Put("_token", ShareCode.APP_TOKEN)
			params.Put("ACLARequest", this.Request)
			params.Put("ACLAAction", this.Action)
			params.Put("ACLATask", this.Task)
			params.Put("ACLAItem", this.Item)
			params.Put("ACLAUniqueKey", this.UniqueKey)
			params.Put("ACLATagcode", this.Tagcode)
			params.Put("ACLAValueFileImage", fname.Text)
			'
			params.Put("ACLAReqCounter", this.RepeatCounter)
			params.Put("ACLARepeatItem", this.RepeatItemCounter)
			params.Put("versionTagcode", Main.VerisonTagcode)
			If (params.IsInitialized) Then
				Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai-more/img/delete"$, "")
				Sleep(250)
			End If
		End If
		
	End If
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
	
	'imageb64|imagename
	Dim sSQL As String = $"update dta_requests_values_images set on_report=${this.OnReport} where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and
							item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and tagcode='${this.Tagcode}' and imagename='${fname.Text}'"$
	Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	
	Dim params As Map
	params.Initialize
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", this.Request)
	params.Put("ACLAAction", this.Action)
	params.Put("ACLATask", this.Task)
	params.Put("ACLAItem", this.Item)
	params.Put("ACLAUniqueKey", this.UniqueKey)
	params.Put("ACLATagcode", this.Tagcode)
	params.Put("ACLAValueFileImage", fname.Text)
	params.Put("ACLAOnReport", this.OnReport)
	params.Put("ACLAReqCounter", this.RepeatCounter)
	params.Put("ACLARepeatItem", this.RepeatItemCounter)
	params.Put("versionTagcode", Main.VerisonTagcode)

	If (params.IsInitialized) Then
		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai-more/img/update2"$, "")
		Sleep(250)
	End If
End Sub

Sub ItemNotes_FocusChanged (HasFocus As Boolean)
	Dim curr As EditText = Sender
	If Not(HasFocus) Then
		Dim this As RequestCLAItem = curr.tag
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${curr.Text}'
				where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and 
				item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}'"$ ' and tagcode='${this.Tagcode}'"$
		Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
			
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLRequest", this.Request)
		params.Put("ACLAction", this.Action)
		params.Put("ACLTask", this.Task)
		params.Put("ACLItem", this.Item)
		params.Put("ACLUniqueKey", this.UniqueKey)
		params.Put("ACLTagcode", this.Tagcode)
		params.Put("ACLAObs", ItemNotes.Text)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("versionTagcode", Main.VerisonTagcode)
		
		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/obs/update"$, "")
		Sleep(500)
	End If
	
End Sub

Sub ItemNotes_TextChanged (Old As String, New As String)
	'Dim curr As EditText = Sender
	If (Old <> New) Then
		Dim this As RequestCLAItem = CurrentRequestCLAItem
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${New}'
				where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and 
				item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}'"$ ' and tagcode='${this.Tagcode}'"$
		Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
			
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLRequest", this.Request)
		params.Put("ACLAction", this.Action)
		params.Put("ACLTask", this.Task)
		params.Put("ACLItem", this.Item)
		params.Put("ACLUniqueKey", this.UniqueKey)
		params.Put("ACLTagcode", this.Tagcode)
		params.Put("ACLAObs", ItemNotes.Text)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("versionTagcode", Main.VerisonTagcode)
		
		Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/obs/update"$, "")
		Sleep(500)
	End If
End Sub

' ************************************************************************
' SELECCIONA OBJECTO 
' ************************************************************************
Sub associateObject_Click
	Dim btn As Button = Sender
	Dim this As RequestCLAItem = btn.tag
	
	Dim Local As Int = 1 				'RETORNA AOS ALERTAS TAREFAS
	
	'task_item_detail_list
	Dim Filter As AppDialogs
	Filter.Initialize
	Filter.getObjectSelectDialog(Activity, "MoreActions", "Selecção de Objecto", Local)
	
End Sub

Sub ImageStateName_Click
	Dim thisLabel As Label = Sender
	Dim dialog As B4XDialog
	dialog.Initialize(Activity)
	dialog.Title = "Introduza o nome da imagem"
	Dim input As B4XInputTemplate
	input.Initialize
	input.lblTitle.Text = "Nome:"
	'input.ConfigureForNumbers(False, False) 'AllowDecimals, AllowNegative
	Wait For (dialog.ShowTemplate(input, "Aceitar", "", "Cancelar")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		thisLabel.text = input.Text 'no need to check with IsNumber
		Log(thisLabel.text)
	End If
End Sub
