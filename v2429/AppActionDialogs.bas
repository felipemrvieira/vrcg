B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Private ApplActionDialog As CustomLayoutDialog
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
	
	Private IsFastOptionCheck As Boolean = False
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
	Private CurrentItemNotesText As String
	Private takeSignature As Button
	Private itemSignatures As CustomListView
	Private signaturePanel As Panel
	Private InnerSignatureView As ImageView
	Private InnerSignatureOnReport As Label
	Private InnerSignatureRemove As Label
	Private InnerSignatureName As Label
	Private PanelSignature As Panel
	Private SignPanel As Panel
	Private btnClearSign As Button
	Private btnSaveSign As Button
	Private SignPerson As Label
	Dim Signature As SignatureData
	Dim SignCanvas As Canvas
	Private InnerSignatureInfo As Label
	Private moreActionQuest As Label
	Private moreActionQuest2 As Label
	Private moreActionQuest3 As Label
	Private takeNewDesign As Button
	Public ItemTitle As String
	
	Private PressedAnswerTagCode As String = ""
	Private ItemHISTNotes As EditText
	Private itemHISTSignatures As CustomListView
	Private ItemHISTImages As CustomListView
	Private SignPanelView As Panel
	Private btnCancelSign As Button
	Private dlgASCCEmails As FloatLabeledEditText
	Private imageSelectedTrash As Label
	Private ObjectsImages As CustomListView
	
	Private ItemImageView As ImageView
	Private btnAssociateImage As B4XStateButton
	Private AssociateImagesList As List
	Private AssociateImagesCompleteList As List
	Private lblObjectImageTitle As Label
	Private editAS As Button
	Private CurrentASTagcode As String = ""
	Private AvisoNoImages As Label
End Sub

'dialog_more_action   H:550
'ItemList_More_Action  H230

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	AS_Status = DBStructures.getASStatus
	AS_Types = DBStructures.getASTypes
	AS_Priority = DBStructures.getPriority
	AS_Urgency = DBStructures.getUrgency
	AS_Modes = DBStructures.getASModes
	CurrentImageList.Initialize
	AssociateImagesList.Initialize

	ObjectTagcode = "" 'innerObject
End Sub

Sub updateThisImageFile2DB(filename As String, id As Int)
	Dim sSQL As String = $"update dta_requests_values_images set imagename='${filename}' where id=${id}"$
	Starter.LocalSQLEVC.ExecNonQuery(sSQL)
End Sub

'RequestCLAItem(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, Title As String, Answer As String, Value As String)
Sub GetMoreActionsDialog(activ As Activity, activObj As Object, this As RequestCLAItem, TabPos As Int, innerObject As String, tobs As String, _
		action As Int, pressedtag As String, tagcodeTPA As String, groupTPA As String, actionforce As Int)
	ProgressDialogShow2(ShareCode.AvisoAguarde, True)
'	Sleep(100)
	CurrentRequestCLAItem = this
	Dim WidthPerc As Int = 100%x
	Dim lbWidth As Int = WidthPerc /3
	PressedAnswerTagCode = pressedtag

	'Dim sf As Object = ApplActionDialog.ShowAsync(this.Title, ShareCode.Option_BACK, ShareCode.Option_SENDEMAIL, ShareCode.Option_MAKEALERT, Null, False)
	Dim sf As Object = ApplActionDialog.ShowAsync(this.Title, ShareCode.Option_BACK, "", ShareCode.Option_MAKEALERT, Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
'	If(ShareCode.ISPHONE) Then
'		ApplActionDialog.SetSize(100%x, 100%y)
'	Else
'		ApplActionDialog.SetSize(95%x, 95%y)
'	End If
	
	ApplActionDialog.SetSize(100%x, 100%y)
	
	'***************************************************
	' ALTERACAO PC - Botao de Criar Alerta nao visivel
	'***************************************************
	
	ApplActionDialog.GetButton(DialogResponse.negative).Visible = False
	ApplActionDialog.GetButton(DialogResponse.negative).Enabled = False
	ThisActivityName_TaskListDialog = activObj
	CurrentCLD = ApplActionDialog
	CurrentActivity = activ
	CurrentCLAItem = this
	ObjectTagcode = innerObject
	ActionCode = ""

	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("Dialog_MoreActions")
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
	AssociateImagesCompleteList.Initialize
	
	'CLA_MORE_Evidence_Alerts
	If (this.Origin = 7) Then
		listsTabPanel.LoadLayout("CLA_MORE_Evidence_Alerts", "Detalhes") '"Evidências") ItemNotes
	Else
		listsTabPanel.LoadLayout("CLA_MORE_Evidence", "Detalhes") '"Evidências")
	End If
	moreActionQuest.Text = this.Title
	
	If Not(this.Origin = 7) Then
		If(ShareCode.ISPHONE) Then
			listsTabPanel.LoadLayout("CLA_MORE_Action", "Acções")
		Else
			listsTabPanel.LoadLayout("CLA_MORE_Action", "Acções subsequentes")	
		End If
			moreActionQuest2.Text = this.Title
	End If
	If (Not(IsFastOptionCheck) And Not(this.Origin = 7)) Then
		listsTabPanel.LoadLayout("CLA_MORE_History", "Histórico")
		moreActionQuest3.Text = this.Title
	End If
'	listsTabPanel.LoadLayout("CLA_MORE_Articles", "Artigos")
	Utils.SetViewBackgroundColorToMainColor(sendEmailImages)
	Dim CountImages As Int = 0
	
	ItemTitle = this.Title
	Dim First As Boolean = True
	For Each lbl As Label In Utils.GetAllTabLabels(listsTabPanel)
		If First Then
			First = False
			lbl.TextColor = Colors.Black
		End If
		lbl.Width = lbWidth
		
		If(ShareCode.ISPHONE) Then
			lbl.TextSize = 12.0
		End If
	Next
	
	obsOptions.Add("")
	If (Utils.NNE(tobs)) Then
		Try
			Dim item As List = Regex.Split("\,", tobs )
			For n= 0 To item.Size-1
				obsOptions.Add(item.Get(n))
			Next
		Catch
			Log(LastException)
		End Try

	End If
	obsOptions.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	obsOptions.DropdownTextColor = Consts.ColorDarkGray
	
	'Request As String, Action As String, Task As String, Item As String, UniqueKey As String
	
	'*************************************************************************************
	' EVIDENCIAS
	'*************************************************************************************
	If Not(this.Origin = 7) Then
		
		Dim Status As Int = 0
		Dim theTagcode As String = Utils.IfNullOrEmpty(PressedAnswerTagCode, this.Tagcode.Trim)
		Dim HaveTagcode As Boolean = (Utils.NNE(theTagcode))
		If (HaveTagcode) Then
	'		If Utils.NNE(PressedAnswerTagCode) Then
	'			theTagcode = PressedAnswerTagCode
	'		End If
			Dim sSQL As String = $"select ifnull(execute_status,0) as status, ifnull(execute_action,'') as action, ifnull(execute_notes,'') as notes,
				ifnull(execute_value,'') as value from dta_requests_values where request_tagcode='${this.Request.Trim}' and
				task_tagcode='${this.Task.Trim}' and item_tagcode='${this.Item.Trim}' and unique_key='${this.UniqueKey.Trim}' 
				and tagcode='${theTagcode}' 
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}
				and repeatfieldcounter=${this.repeatfieldcounter}"$ 
		Else
			Dim sSQL As String = $"select ifnull(execute_status,0) as status, ifnull(execute_action,'') as action, ifnull(execute_notes,'') as notes,
				ifnull(execute_value,'') as value from dta_requests_values where request_tagcode='${this.Request.Trim}' and
				task_tagcode='${this.Task.Trim}' and item_tagcode='${this.Item.Trim}' and unique_key='${this.UniqueKey.Trim}' 
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}
				and repeatfieldcounter=${this.repeatfieldcounter}"$ 
		End If
		Private Record1 As Cursor = Starter.LocalSQLEVC.ExecQuery($"${sSQL}"$)
					
		If Record1.RowCount > 0 Then
			Record1.Position = 0
			ItemNotes.Text = Record1.GetString("notes")
			ItemNotes.Tag = this 'As RequestCLAItem
			ActionCode = Record1.GetString("action")
		End If
		Record1.Close
	Else
	End If

'	If Not(CurrentItemNotes.IsInitialized) Then CurrentItemNotes.Initialize("")
'	CurrentItemNotes.Text = ItemNotes.Text
'	CurrentItemNotes.tag = ItemNotes.tag
'	CurrentItemNotes = ItemNotes

	'***************************************************************************
	' ALTERACAO PC
	' SO SUBSTITUIR O CONTEUDO DE CURRENTITEMNOTESTEXT POR "" SE ITEMNOTES.TEXT FOR VAZIO
	' E CURRENTITEMNOTESTEXT ESTIVER VAZIO
	'***************************************************************************
	
	If ItemNotes.Text <> "" And CurrentItemNotesText = "" Then
		CurrentItemNotesText = ItemNotes.Text
	End If
	
	associateObject.Enabled = False
	associateObject.tag = this
	
	If Not(this.Origin = 7) Then
		Dim Status As Int = 0
		Dim sSQL As String = $"select distinct a.id, ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 0 as base_image, 0 as on_report
		from dta_tasks_items as a 
		inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode 
				and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
		where b.request_tagcode='${this.Request.Trim}' 
			and b.inner_request_tagcode='${this.Action.Trim}' 
			and b.task_tagcode='${this.Task.Trim}' 
			and b.item_tagcode='${this.Item.Trim}' 
			and b.unique_key='${this.UniqueKey.Trim}' 
			and b.repeatcounter=${this.RepeatCounter}
			and b.repeatitemcounter=${this.RepeatItemCounter}
			and b.repeatfieldcounter=${this.repeatfieldcounter}"$
		Private Record2 As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)

		If Record2.RowCount > 0 Then
			CountImages = CountImages + 1
			'For n=0 To Record2.RowCount-1
			Record2.Position = 0
			Dim image As String = Record2.GetString("imageb64")
			Dim filename As String = Record2.GetString("imagename")
		
			Dim ithis As RequestCLAItem = this
			ithis.OnReport = Record2.GetInt("on_report")
			ithis.BaseImage = Record2.GetInt("base_image")
		
'			If Not(Utils.isNullOrEmpty(image)) Then
			If Utils.NNE(image) Then
				Dim loaded As Boolean = True
				Try
					ItemImages.Add(CreateImagePanel(ithis, filename, image, 0, ""), "")
					AssociateImagesCompleteList.Add(filename)
				Catch
					Log(LastException)
					loaded= False
				End Try
				
				If Not(File.Exists(Starter.InternalFolder,$"${filename}"$)) Then
					Utils.SaveImageFromB64ToFile(image, $"${filename}"$, ShareCode.DEVICE_DEF_IMG_FILETYPE)
				End If
				If Not(loaded) Then
					Dim btm As B4XBitmap = LoadBitmap(Starter.InternalFolder, $"${filename}"$)
					Try
						ItemImages.Add(CreateImagePanelBMP(ithis, filename, btm, 0, ""), "")
						AssociateImagesCompleteList.Add(filename)
					Catch
						Log(LastException)
						loaded= False
					End Try
				End If
'			else if Not(Utils.isNullOrEmpty(filename)) Then
			else if Utils.NNE(filename) Then
				If (File.Exists(Starter.InternalFolder,$"${filename}"$)) Then
					Try
'						Dim Base64Con As Base64Convert
'						Base64Con.Initialize
'						Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, filename)
'						ItemImages.Add(CreateImagePanel(ithis, filename, image, 0, ""), "")
'						AssociateImagesCompleteList.Add(filename)
						ItemImages.Add(CreateImagePanelBMP(ithis, filename, btm, 0, ""), "")
						AssociateImagesCompleteList.Add(filename)
					Catch
						Log(LastException)
					End Try
				End If
			End If
			'Next
		End If
		Record2.Close
	End If

'	If Not(this.Origin = 7) Then
	If Not(this.Origin = 7) Then
		If (Utils.NNE(innerObject)) Then
			Dim SQL As String = $"Select a.id, ifnull(a.image, '') as image, ifnull(a.filename, '') as filename from  dta_objects as a where a.tagcode='${innerObject}'"$
			Private Record33 As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
			If Record33.RowCount > 0 Then
				Record33.Position = 0
				CountImages = CountImages + 1
				Dim image As String = Record33.GetString("image")
				Dim ithis As RequestCLAItem = this
	'			image = image.Replace("data:image/png;base64,", "")
				Dim filename As String =  Record33.GetString("filename")   '$"Base_${innerObject}.png"$
				Dim idd As Int = Record33.GetInt("id")
				
				If Utils.isNullOrEmpty(filename) Then
					Dim filename As String =  $"Base_${innerObject}.png"$
				End If

				If Not(Utils.isNullOrEmpty(image)) Then
					image = image.Replace("data:image/png;base64,", "")
					Try
						ItemImages.Add(CreateImagePanel(ithis, filename, image, 0, ""), "")
						AssociateImagesCompleteList.Add(filename)
					Catch
						Log(LastException)
					End Try
					If Not(File.Exists(Starter.InternalFolder,$"${filename}"$)) Then
						Utils.SaveImageFromB64ToFile(image, $"${filename}"$, ShareCode.DEVICE_DEF_IMG_FILETYPE)
						updateThisImageFile2DB(filename, idd)
					End If
				else if Not(Utils.isNullOrEmpty(filename)) Then
					If (File.Exists(Starter.InternalFolder,$"${filename}"$)) Then
						Try
							Dim Base64Con As Base64Convert
							Base64Con.Initialize
							Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, filename)
							ItemImages.Add(CreateImagePanel(ithis, filename, image, 0, ""), "")
							AssociateImagesCompleteList.Add(filename)
						Catch
							Log(LastException)
						End Try
					End If
				End If
				
			End If
			Record33.Close
		End If
	End If
	
	If Not(this.Origin = 7) Then
	Dim Status As Int = 0
		Dim sSQL As String = $"select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report, conf_sid_id,
		ifnull(execute_longitude, '') as execute_longitude, ifnull(execute_latitude, '') as execute_latitude, ifnull(execute_datetime, '') as execute_datetime
		from dta_requests_values_images where request_tagcode='${this.Request}' and
		task_tagcode='${this.Task}' and item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' 
		and tagcode='${this.Tagcode}' 
		and repeatcounter=${this.RepeatCounter}
		and repeatitemcounter=${this.RepeatItemCounter}
		and repeatfieldcounter=${this.repeatfieldcounter}"$
		Private Record2 As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)

		If Record2.RowCount > 0 Then
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				Dim image As String = Record2.GetString("imageb64")
				Dim filename As String = Record2.GetString("imagename")
				Dim conf_sid_id As Int = Record2.GetInt("conf_sid_id")
				Dim imgInfo As String = $"${Record2.GetString("execute_datetime")} - ${Record2.GetString("execute_latitude")}, ${Record2.GetString("execute_longitude")}"$
				If Utils.isNullOrEmpty(filename) Then
					Dim filename As String =  $"IMGNEW_${Utils.MakeFileName}.png"$
				End If
			
				Dim ithis As RequestCLAItem = this
				ithis.OnReport = Record2.GetInt("on_report")
				ithis.BaseImage = Record2.GetInt("base_image")
			
				Dim ShowTheImage As Boolean = False
				If Utils.NNE(image) Then
					image = image.Replace("data:image/png;base64,", "")
					ShowTheImage = True
					If Not(File.Exists(Starter.InternalFolder,$"${filename}"$)) Then
						Utils.SaveImageFromB64ToFile(image, $"${filename}"$, ShareCode.DEVICE_DEF_IMG_FILETYPE)
					End If
				else if Utils.NNE(filename) Then
					If (File.Exists(Starter.InternalFolder,$"${filename}"$)) Then
						ShowTheImage = True
'						Try
'							Dim Base64Con As Base64Convert
'							Base64Con.Initialize
'							Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, filename)
'							If (Utils.NNE(image)) Then
'								ShowTheImage = True
'							End If
'						Catch
'							Log(LastException)
'						End Try
					End If
				End If
			
				If ShowTheImage Then
					Dim btm As B4XBitmap = LoadBitmap(Starter.InternalFolder, $"${filename}"$)
					If (conf_sid_id = 4) Then
'						itemSignatures.Add(CreateSignaturePanel(ithis, filename, image, 0, imgInfo), "")
						itemSignatures.Add(CreateSignaturePanelBMP(ithis, filename, btm, 0, imgInfo), "")
					Else
						Try
'							ItemImages.Add(CreateImagePanel(ithis, filename, image, 0, ""), "")
							ItemImages.Add(CreateImagePanelBMP(ithis, filename, btm, 0, ""), "")
							AssociateImagesCompleteList.Add(filename)
						Catch
							Log(LastException)
						End Try
					End If
				End If
			Next
		End If
		Record2.Close
	End If
	
	
	'*************************************************************************************
	' ACÇÕES SUBSEQUENTES
	'*************************************************************************************
	If Not(this.Origin = 7) Then
		Private Record2 As Cursor
		Dim sSQL As String = $"${DBStructures.EVC_SQL_GET_TASK_MORE_AS} and
			request_tagcode='${this.Request.Trim}' and
			action_tagcode='${this.Action.Trim}' and 
			task_tagcode='${this.Task.Trim}' and 
			item_tagcode='${this.Item.Trim}' and 
			uniquekey='${this.UniqueKey.Trim}' and 
			iu_tagcode='${theTagcode}'  
			and repeatcounter=${this.RepeatCounter}
			and repeatitemcounter=${this.RepeatItemCounter} 
			and repeatfieldcounter=${this.repeatfieldcounter}
			order by id desc limit 1"$
			
		Record2 = Starter.LocalSQLEVC.ExecQuery($"${sSQL}"$)
		Log("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")
		Log(sSQL)
		editAS.Enabled = False
		editAS.Visible = False
		If Record2.RowCount > 0 Then
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				If (n=0) Then
					asPanel.AddView(CreateASPanel(this, True, Record2),0,1dip,100%x,100%y)
					CurrentTagcode = Record2.GetString("tagcode")
					CurrentASTagcode = CurrentTagcode
					Dim email_sent As Int = Record2.GetInt("email_sent")
					If Utils.Int2Bool(email_sent) Then
						editAS.Enabled = False
						editAS.Visible = False
					Else
						editAS.Enabled = True
						editAS.Visible = True
						editAS.Tag = CurrentASTagcode
					End If
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
		listsTabPanel.ScrollTo(TabPos, True)
		
		If (action >= 1) Then
			If (action = 1) Then
				takePhoto_Click
			Else If (action = 2) Then
				'**************************************************************************************************
				' NOTE: VERIFICA SE EXISTE PARAMETRIZAÇÃO QUE PERMITA O PREENCHIMENTO DO CAMPO DE OBSERVAÇÕES
				'		USA CAMPO FORCE_MORE E DO_ORIGIN_TITLEFIELD DA TABELA DTA_TASKS_ITEMS_ANSWERS
				'**************************************************************************************************
				If (this.UniqueKey.Trim = "b444a024-a05d-5187-8f45-190a32728e6a") Or (this.UniqueKey.Trim = "802a6ecf-3786-5bf1-b85e-76a70cad6b0e") Then
					If ItemNotes.Text = "" Then
						ItemNotes.Text = "Lote: "
					End If
				Else
					If ItemNotes.Text = "" Then
						Dim scriptData As String = $"select ifnull(a.do_origin_titlefield, '') as valor
						from dta_tasks_items_answers as a
						inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode
							and b.item_tagcode=a.item_tagcode
							and b.unique_key=a.unique_key
							and b.tagcode=a.tagcode)
						where 1=1
						and a.force_more=1 
						and b.request_tagcode='${this.Request.Trim}' 
						and b.task_tagcode = '${this.Action.Trim}'
						and b.item_tagcode='${this.Item.Trim}' 
						and b.unique_key = '${this.UniqueKey.Trim}'
						and b.tagcode = '${theTagcode}'
						and b.repeatcounter = ${this.RepeatCounter}
						and b.repeatitemcounter = ${this.RepeatItemCounter}
						and b.repeatfieldcounter = ${this.repeatfieldcounter}"$
						Dim textoObs As String = DBStructures.GetScriptColumnStrEVC( scriptData, "valor")
					
						If Utils.NE(textoObs) Then
							ItemNotes.Text = textoObs
						End If
					End If
				End If
				ItemNotes.RequestFocus
			Else If (action = 3) Then
				If Utils.NNE(CurrentASTagcode) Then
					
					If (editAS.Enabled) Then
						Msgbox2Async(ShareCode.GeneralAtentionTitle, ShareCode.ASExistsEditItQuestion, ShareCode.Option_YES, "", ShareCode.Option_NO, Null, False)
						Wait For Msgbox_Result (Result As Int)
						If Result = DialogResponse.POSITIVE Then
							editAS_Click
						End If
					Else
						MsgboxAsync(ShareCode.GeneralAtentionTitle, ShareCode.ASExistsNoEditInformation)
					End If
				Else
					If Utils.NNE(tagcodeTPA) Then
						takeASClick(tagcodeTPA, groupTPA, actionforce)
					Else
						takeAS_Click
					End If
				End If
				
			Else If (action = 4) Then
				'CLA_MORE_Signature
				'conf_sid_id = 4
				takeSignature_Click
			End If
		End If
	End If
	
	If ItemNotes.Text = "" Then
		Dim scriptData As String = $"select ifnull(a.do_origin_titlefield, '') as valor
						from dta_tasks_items_answers as a
						inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode
							and b.item_tagcode=a.item_tagcode
							and b.unique_key=a.unique_key
							and b.tagcode=a.tagcode)
						where 1=1
						and a.force_more=1 
						and b.request_tagcode='${this.Request.Trim}' 
						and b.task_tagcode = '${this.Action.Trim}'
						and b.item_tagcode='${this.Item.Trim}' 
						and b.unique_key = '${this.UniqueKey.Trim}'
						and b.tagcode = '${theTagcode}'
						and b.repeatcounter = ${this.RepeatCounter}
						and b.repeatitemcounter = ${this.RepeatItemCounter}
						and b.repeatfieldcounter = ${this.repeatfieldcounter}"$
		Dim textoObs As String = DBStructures.GetScriptColumnStrEVC( scriptData, "valor")
					
		If Utils.NE(textoObs) Then
			ItemNotes.Text = textoObs
		End If
	End If
	
	If Not(this.Origin = 7) Then
		'**************************************************************************************************
		' NOTE: VERIFICA SE EXISTE PARAMETRIZAÇÃO QUE PERMITA O PREENCHIMENTO DO CAMPO DE OBSERVAÇÕES
		'		USA CAMPO FORCE_MORE E DO_ORIGIN_TITLEFIELD DA TABELA DTA_TASKS_ITEMS_ANSWERS
		'**************************************************************************************************
		If ItemNotes.Text = "" Then
			Dim scriptData As String = $"select ifnull(a.do_origin_titlefield, '') as valor
					from dta_tasks_items_answers as a
					inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode
						and b.item_tagcode=a.item_tagcode
						and b.unique_key=a.unique_key
						and b.tagcode=a.tagcode)
					where 1=1
					and a.force_more=1 
					and b.request_tagcode='${this.Request.Trim}' 
					and b.task_tagcode = '${this.Action.Trim}'
					and b.item_tagcode='${this.Item.Trim}' 
					and b.unique_key = '${this.UniqueKey.Trim}'
					and b.tagcode = '${theTagcode}'
					and b.repeatcounter = ${this.RepeatCounter}
					and b.repeatitemcounter = ${this.RepeatItemCounter}
					and b.repeatfieldcounter = ${this.repeatfieldcounter}"$
			Dim textoObs As String = DBStructures.GetScriptColumnStrEVC( scriptData, "valor")
				
			If Utils.NE(textoObs) Then
				ItemNotes.Text = textoObs
			End If
		End If
		ItemNotes.RequestFocus
	End If
	
	ProgressDialogHide
	Wait For (sf) Dialog_Result(res As Int)
	
	
	If res = DialogResponse.POSITIVE Then ' BOTAO VOLTAR
		CurrentItemNotesText = ItemNotes.Text
	
		If (HaveTagcode) Then
			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
			where request_tagcode='${this.Request.Trim}' 
			and inner_request_tagcode='${this.Action.Trim}' 
			and task_tagcode='${this.Task.Trim}' 
			and item_tagcode='${this.Item.Trim}' 
			and unique_key='${this.UniqueKey.Trim}' 
			and tagcode='${theTagcode}'
			and repeatcounter=${this.RepeatCounter}
			and repeatitemcounter=${this.RepeatItemCounter}
			and repeatfieldcounter=${this.repeatfieldcounter}"$
		Else
			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
			where request_tagcode='${this.Request.Trim}' and inner_request_tagcode='${this.Action.Trim}' 
			and task_tagcode='${this.Task.Trim}' 
			and item_tagcode='${this.Item.Trim}' 
			and unique_key='${this.UniqueKey.Trim}' 
			and repeatcounter=${this.RepeatCounter}
			and repeatitemcounter=${this.RepeatItemCounter}
			and repeatfieldcounter=${this.repeatfieldcounter}"$
		End If
	
		'******************************************************
		'ALTERACAO PC - VALIDAR O EVENTTASK_NOTESACTION
		'******************************************************
		Dim evento As String = ""
		Dim TipoEvento As String = ""
		
		If (HaveTagcode) Then
			evento  = DBStructures.GetScriptColumnStrEVC($"select ifnull(event_tagcode,'') as evento from dta_tasks_items_answers_events where
								task_tagcode = '${this.Task}'
								 AND unique_key = '${this.UniqueKey}'
								 and tagcode='${theTagcode}'
								 AND item_tagcode = '${this.TaskInfo.item_tagcode}'"$, "evento")
		End If
		
		Log(evento)
		
		If evento = "EVENTTASK_NOTESACTION" Then
'			1- Gravar As Observações
'			2- Criar a As automaticamente Do tipo Não conformidade:
'			2.1 Campo de detalhes da As assume o valor/texto inserido nas Observações
'			2.2 Campo de descritivo da As assume o texto da pergunta
'			2.3. Restantes campos assumem valores por omissão
'			$NewASRecordItem->operation_type = 'TOPERT_01';
'			$NewASRecordItem->typerequest_type = '';
'			$NewASRecordItem->priority_tagcode = 'TPRIOT_01';
'			$NewASRecordItem->gravity_tagcode = 'TGRVT_02';

'			Atribui o value do evento ao action_type do dta_Actions_Adds
	
			TipoEvento  = DBStructures.GetScriptColumnStrEVC($"select ifnull(value,'') as tipoevento from dta_tasks_items_answers_events where
								task_tagcode = '${this.Task}'
								 AND unique_key = '${this.UniqueKey}'
								 and tagcode='${theTagcode}'
								 AND item_tagcode = '${this.TaskInfo.item_tagcode}'"$, "tipoevento")
			If Utils.NNE(TipoEvento) Then
				tagcodeTPA = TipoEvento
			End If
	
			' VERIFICAR SE JA EXISTE UMA AS PARA ESTA PERGUNTA, SO CRIAR SE NAO EXISTIR
			Dim RecCount As Cursor
			Dim SqlCheck As String = $"SELECT * from dta_actions where request_Tagcode = '${this.Request}'
			and action_tagcode = '${this.Action}'
			and task_tagcode = '${this.Task}'
			and item_tagcode = '${this.Item}'
			and uniquekey = '${this.UniqueKey}'"$
			RecCount = Starter.LocalSQLEVC.ExecQuery($"${SqlCheck}"$)
			If RecCount.RowCount = 0 Then
	
				Dim asTagcode As String = Utils.GenerateTagcode("AS0")
				Dim dataoper As String = Utils.GetCurrDatetimeext

				asTagcode = DBStructures.InsertRequestASEVC(asTagcode, this.Request, this.Action, this.Task, this.Item, this.UniqueKey, _
					theTagcode, this.Title,CurrentItemNotesText, "TPRIOT_01", "TGRVT_02", ShareCode.SESS_OPER_User,"TOPERT_01", dataoper, 0, "", "", _
					this.RepeatCounter, this.RepeatItemCounter, this.repeatfieldcounter, dataoper, _
					tagcodeTPA, groupTPA, CurrentItemNotesText, 0)
	
				Dim params As Map
				params.Initialize
				params.Clear
				params.Put("_token", ShareCode.APP_TOKEN)
				params.Put("ACLRequest", this.Request.Trim)
				params.Put("ACLAction", this.Action.Trim)
				params.Put("ACLTask", this.Task.Trim)
				params.Put("ACLItem", this.Item.Trim)
				params.Put("ACLUniqueKey", this.UniqueKey.Trim)
				params.Put("ACLTagcode", theTagcode)
				params.Put("ACLATitle", this.Title)
				params.Put("ACLAObs", CurrentItemNotesText)
				params.Put("ACLAASNC", asTagcode)
				params.Put("ACLAType", tagcodeTPA)
				params.Put("ACLADatetime", dataoper)
				params.Put("ACLSessUser", ShareCode.SESS_OPER_User)
				params.Put("ACLAReqCounter", this.RepeatCounter)
				params.Put("ACLARepeatItem", this.RepeatItemCounter)
				params.Put("ACLARepeatField", this.repeatfieldcounter)
				params.Put("versionTagcode", Main.VersionTagcode)
				params.Put("_authorization", Main.DeviceAuthorization)
				params.Put("_instance", Main.DeviceInstance)
				params.put("_deviceBrand", Main.DeviceBrand)
				params.put("_deviceModel", Main.DeviceModel)
				params.put("_deviceMacAddress", Main.DeviceMacAddress)
				params.Put("_user", ShareCode.SESS_User)
				
				Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/event/new/asnc"$
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Utils.CallApi(0, params, Me, Url, "", this.Request.Trim)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
					Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
				End If
				Sleep(550)
				Log(sSQL)
			End If
		End If
		'******************************************************

		Utils.SaveSQLToLog("GetMoreActionsDialog",sSQL, this.Request)
		'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLRequest", this.Request.Trim)
		params.Put("ACLAction", this.Action.Trim)
		params.Put("ACLTask", this.Task.Trim)
		params.Put("ACLItem", this.Item.Trim)
		params.Put("ACLUniqueKey", this.UniqueKey.Trim)
		params.Put("ACLTagcode", theTagcode)
		params.Put("ACLAObs", CurrentItemNotesText)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("ACLARepeatField", this.repeatfieldcounter)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, Me, Url, "", this.Request.Trim)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(550)
		
		For n=0 To ItemImages.Size-1
			Dim pnl As Panel =ItemImages.GetPanel(n)
			Dim img As ImageView = pnl.GetView(0)
			Dim fln As Label = pnl.GetView(1)
			Dim lbl As Label = pnl.GetView(2)
			If (lbl.Tag=1) Or (lbl.Tag=2) Then
				
				Utils.SaveImageviewToFile(img.Bitmap, $"${fln.Text}.png"$, ShareCode.DEVICE_DEF_IMG_FILETYPE)
				Dim Base64Con As Base64Convert
				Base64Con.Initialize
				Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, $"${fln.Text}.png"$)
				If (lbl.Tag=1) Then
					'imageb64|imagename
					Dim sSQL As String = $"update dta_requests_values_images set imageb64='${ImgB64}'
							where request_tagcode='${this.Request.Trim}' and inner_request_tagcode='${this.Action.Trim}' 
							and task_tagcode='${this.Task.Trim}' and 
							item_tagcode='${this.Item.Trim}' and unique_key='${this.UniqueKey.Trim}' and 
							tagcode='${theTagcode}' and imagename='${fln.Text.Trim}' 
							and repeatcounter=${this.RepeatCounter}
							and repeatitemcounter=${this.RepeatItemCounter}
							and repeatfieldcounter=${this.repeatfieldcounter}"$
				Else
					Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3 + 1000000 'id, ${maxid},
					Dim sSQL As String = $"insert into dta_requests_values_images 
							(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, 
							imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter)
							values (${maxid}, '${this.Request.Trim}', '${this.Action.Trim}', '${this.Task.Trim}', '${this.Item.Trim}', '${this.UniqueKey.Trim}', '${theTagcode}',
					'${ImgB64}', '${fln.Text.Trim}', 1, ${this.RepeatCounter}, ${this.RepeatItemCounter}, ${this.repeatfieldcounter})"$
				End If
				
				Utils.SaveSQLToLog("GetMoreActionsDialog",sSQL, this.Request)
				'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
			End If
		Next
		
		Sleep(550)
		CallSub(activObj, "ReturnFromCLAI")
'		CallSubDelayed(activObj, "ReturnFromCLAI")
'		CallSubDelayed(CurrentActivity, "ReturnFromCLAI")
		CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
		
	Else If res = DialogResponse.NEGATIVE Then
		CurrentItemNotesText = ItemNotes.Text
		Dim lst As List
		lst.Initialize
		Dim Filter As AppActionDialogs
		Filter.Initialize
		Filter.GetMoreSendEmailDialog(CurrentCLAItem, CurrentTagcode, CurrentCLD, CurrentItemNotesText, lst ) 'CurrentImageList)
	End If
End Sub

Sub itemSignatures_ItemClick (Index As Int, Value As Object)
	Try
		

		Dim pnl As Panel = itemSignatures.GetPanel(Index)
		'p.Tag = $"${tagcode}|${kind_data}|${id}"$
		Dim this As RequestCLAItem = pnl.Tag
		Dim info As List = Regex.Split("\|", pnl.tag )
		Dim fname As Label = pnl.GetView(1)
	'	Dim tagcode As String = info.Get(0)
	'	Dim val As Int = info.Get(1)
	'	
	'	If (val = 0) Then
			Dim imgdata As ImageViewData = Types.MakeImageViewDataClear
			Dim imgList As List
			imgList.Initialize
			Private Record As Cursor
	'		ItemsCounter = 0

		Dim SQL As String = $"select id,tagcode,imageb64,imagename from dta_requests_values_images where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and
										item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and tagcode='${this.Tagcode}' and imagename='${fname.Text}'
										And repeatcounter=${this.RepeatCounter}
										And repeatitemcounter=${this.RepeatItemCounter}"$
			Log(SQL)								
			Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		
			Dim nRows As Int = Record.RowCount
			If nRows > 0 Then
				For Row = 0 To Record.RowCount-1
	'				ItemsCounter = ItemsCounter + 1
					Record.Position = Row
					Dim imgdata As ImageViewData = Types.MakeImageViewData(Record.GetString("imageb64"), Record.GetString("imagename"))
					imgList.Add(imgdata)
				Next
			Else
				imgList.Add(imgdata)
			End If
			Record.Close

			If Utils.NNE(imgdata.b64) Then
				Dim Filter As AppDialogs
				Filter.Initialize
				Filter.getShowImageViewListDialog(Me, imgList)
			End If
	'	End If

	Catch
		Log(LastException.Message)
	End Try
End Sub

Sub itemSignatures_ItemLongClick (Index As Int, Value As Object)
	
End Sub

Sub takeSignature_Click
	SignPanelView.Visible = True
	PanelSignature.Visible = True
	takeSignature.Visible = False
	SignPerson.Text = "Responsável"
	SignatureCapture.Clear(Signature)
	
	SignCanvas.Initialize(SignPanel)
	
	Signature.Initialize
	Signature.Canvas = SignCanvas
	Signature.Panel = SignPanel
	Signature.SignatureColor = Colors.Black
	Signature.SignatureWidth = 3dip
End Sub

Sub btnCancelSign_Click
	SignatureCapture.Clear(Signature)
	SignPanelView.Visible = False
	PanelSignature.Visible = False
	takeSignature.Visible = True
End Sub

Sub CreateASPanel(this As RequestCLAItem, haveData As Boolean, dataRecord As Cursor) As B4XView
	Dim p As Panel
	p.Initialize("")
	CurrentActivity.AddView(p, 0, 1dip, 100%x,100%y)
	p.LoadLayout("ItemList_More_ActionLast")
	p.RemoveView

	If (haveData) Then
		ItemASDetails.Text = dataRecord.GetString("details")
		ItemASAssign.Text = dataRecord.GetString("assigned_to")
		ItemASEmails.Text = dataRecord.GetString("email_to")
		ItemASRelated.Text = "" 'dataRecord.GetString("related_task")
		ItemASDatetime.Text = dataRecord.GetString("due_date")  'dataRecord.GetString("actiondatetime")
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
'	EDITA ACÇÃO SUBSEQUENTE
'====================================================================================================
Sub editAS_Click
	Dim thisButton As Button = Sender
	Dim myTag As String = thisButton.Tag
	
	Dim theTagcode As String = CurrentCLAItem.Tagcode.Trim
	If Utils.NNE(PressedAnswerTagCode) Then
		theTagcode = PressedAnswerTagCode
	End If
	
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreEditActionsDialog(ThisActivityName_TaskListDialog, CurrentCLAItem, myTag, CurrentItemNotesText, True, _
			theTagcode, CurrentCLD, "", "", 0)
End Sub

'====================================================================================================
'	CRIA NOVA ACÇÃO SUBSQUENTE
'====================================================================================================
Sub takeAS_Click
	takeASClick("", "",0)
End Sub

Sub takeASClick(tagcodeTPA As String, groupTPA As String, actionforce As Int)
	
	Dim theTagcode As String = CurrentCLAItem.Tagcode.Trim
	
	If Utils.NNE(PressedAnswerTagCode) Then
		theTagcode = PressedAnswerTagCode
	End If
	
	If (Utils.NNE(theTagcode)) Then
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and tagcode='${theTagcode}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}
				and repeatfieldcounter=${CurrentCLAItem.repeatfieldcounter}"$ 
	Else
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}
				and repeatfieldcounter=${CurrentCLAItem.repeatfieldcounter}"$ 
	End If
	Utils.SaveSQLToLog("takeAS_Click",sSQL, CurrentCLAItem.Request)
	'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLRequest", CurrentCLAItem.Request)
	params.Put("ACLAction", CurrentCLAItem.Action)
	params.Put("ACLTask", CurrentCLAItem.Task)
	params.Put("ACLItem", CurrentCLAItem.Item)
	params.Put("ACLUniqueKey", CurrentCLAItem.UniqueKey)
	params.Put("ACLTagcode", theTagcode)
	params.Put("ACLAObs", CurrentItemNotesText)
	params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
	params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
	params.Put("ACLARepeatField", CurrentCLAItem.repeatfieldcounter)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
		Utils.CallApi(0, params, Me, Url, "", CurrentCLAItem.Request)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CurrentCLAItem.Request.Trim,CurrentCLAItem.Task.Trim,CurrentCLAItem.Item.Trim)
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(250)
	
	Dim Filter As AppActionDialogs
	Filter.Initialize
	'Filter.GetMoreNewActionsDialog(ThisActivityName_TaskListDialog, CurrentCLAItem, CurrentTagcode, CurrentCLD, CurrentItemNotesText, True, theTagcode)
	Filter.GetMoreNewActionsDialog(ThisActivityName_TaskListDialog, CurrentCLAItem, CurrentTagcode, CurrentItemNotesText, True, _
			theTagcode, CurrentCLD, tagcodeTPA, groupTPA, actionforce)
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

'====================================================================================================
'	CRIA PAINEL DE IMAGEN
'====================================================================================================
Sub CreateImagePanelBMP(this As RequestCLAItem, filename As String, btm As B4XBitmap, state As Int, innerTag As String) As B4XView
	Dim p As Panel
	p.Initialize("") 'ImageViewEdit")
	CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)
	p.LoadLayout("CLA_MORE_IMGAGE_Listview")
	p.RemoveView
	
	ShowImage.SetBackgroundImage(btm)
	ShowImage.Tag = innerTag
	
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
	p.Tag = this
	Return p
End Sub 

'====================================================================================================
'	CRIA PAINEL DE ASSINATURAS
'====================================================================================================
Sub CreateSignaturePanel(this As RequestCLAItem, filename As String, btm As String, state As Int, innerTag As String) As B4XView
	Dim p As Panel
	p.Initialize("") 'ImageViewEdit")
	Dim width As Int = 260dip
	If (ShareCode.DEVICE_ORIENTATION = 1) Then
		width = 200dip
	End If
	CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)
	p.LoadLayout("CLA_MORE_Signature")
	p.RemoveView
	
	If (Utils.NNE(btm)) Then
		InnerSignatureView.SetBackgroundImage(Utils.B64ToBitmap(btm))
	End If
	InnerSignatureName.Text = filename
	InnerSignatureInfo.Text = innerTag
	
	If (this.OnReport = 1) Then
		InnerSignatureOnReport.TextColor = Consts.ColorGreen
	End If
	InnerSignatureView.Tag = this
	InnerSignatureOnReport.Tag = this
	InnerSignatureRemove.Tag = this
	InnerSignatureInfo.Tag = this
	
	p.Tag = this
	Return p
End Sub  'CreateSignaturePanel

'====================================================================================================
'	CRIA PAINEL DE ASSINATURAS
'====================================================================================================
Sub CreateSignaturePanelBMP(this As RequestCLAItem, filename As String, btm As B4XBitmap, state As Int, innerTag As String) As B4XView
	Dim p As Panel
	p.Initialize("") 'ImageViewEdit")
	Dim width As Int = 260dip
	If (ShareCode.DEVICE_ORIENTATION = 1) Then
		width = 200dip
	End If
	CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)
	p.LoadLayout("CLA_MORE_Signature")
	p.RemoveView
	InnerSignatureView.SetBackgroundImage(btm)
	InnerSignatureName.Text = filename
	InnerSignatureInfo.Text = innerTag
	
	If (this.OnReport = 1) Then
		InnerSignatureOnReport.TextColor = Consts.ColorGreen
	End If
	InnerSignatureView.Tag = this
	InnerSignatureOnReport.Tag = this
	InnerSignatureRemove.Tag = this
	InnerSignatureInfo.Tag = this
	
	p.Tag = this
	Return p
End Sub  'CreateSignaturePanel

Sub InnerSignatureRemove_Click
	Dim sndr As Label = Sender
	Dim thisPanel As B4XView = sndr.Parent
	Dim this As RequestCLAItem = thisPanel.Tag
	Dim fname As Label = thisPanel.GetView(1)
	Dim Index As Int = itemSignatures.GetItemFromView(thisPanel)
'	Log(Value)
	
	If (this.BaseImage = 1) Then
		MsgboxAsync("A imagem seleccionada é uma imagem BASE e não pode ser apagada!", "Alerta!")
	Else
		
		Dim i As Int = Msgbox2(ShareCode.CLAImageRemove, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If (i=DialogResponse.POSITIVE) Then
''			Dim thisPanel As B4XView = ItemImages.GetPanel(thisPanel)
''			Dim this As RequestCLAItem = thisPanel.Tag
''			Dim fname As Label = thisPanel.GetView(1)
			'imageb64|imagename
			Dim sSQL As String = $"delete from dta_requests_values_images where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and
									item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and tagcode='${this.Tagcode}' and imagename='${fname.Text}'
									And repeatcounter=${this.RepeatCounter}
									And repeatitemcounter=${this.RepeatItemCounter}"$

			Utils.SaveSQLToLog("ItemImages_ItemLongClick",sSQL, this.Request)
			'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
			Log(sSQL)
			itemSignatures.RemoveAt(Index)

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
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			If (params.IsInitialized) Then
'				Utils.CallApi(0, params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/delete"$, "")
				
				Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/delete"$
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Utils.CallApi(0, params, Me, Url, "", this.Request)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
					Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
				End If
				Sleep(250)
			End If
		End If
		
	End If
End Sub

Sub InnerSignatureOnReport_Click
	Dim thisBut As Label = Sender
	Dim thisPanel As Panel = thisBut.Parent
	Dim this As RequestCLAItem = thisPanel.Tag
	If (this.OnReport = 1) Then
		this.OnReport = 0
		thisBut.TextColor = Consts.ColorLightSilver
	Else
		this.OnReport = 1
		thisBut.TextColor = Consts.ColorGreen
	End If
	thisBut.Tag = this
	Dim fname As Label = thisPanel.GetView(1)
	SetImageSelectedOnReport(this, fname, 4)
End Sub

Sub SignPanel_Touch (Action As Int, X As Float, Y As Float)
	SignatureCapture.Panel_Touch(Signature, x, y, Action)
End Sub

Sub btnSaveSign_Click
	ProgressDialogShow("A processar ...")
	Dim thisFile As String = $"IMG_${CurrentRequestCLAItem.Request.trim}${CurrentRequestCLAItem.Task.trim}_${Utils.GetCurrentTimeExt2}_Signature.png"$
	SignatureCapture.Save(Signature, Starter.InternalFolder, thisFile)
	
	'=======================================================================================
	' PREVIEW DA IMAGEM TIRADA COM GRAVAÇÃO DA DATA E HORA
	'=======================================================================================
	Dim DateTimeName As String = Utils.MakeDateTimeSlash2
	Dim cvs As B4XCanvas = CreateCanvas(720dip, 520dip)
	Dim cvsRect As B4XRect
	cvsRect.Initialize(0,0,720dip, 520dip)
	cvs.DrawBitmap(xui.LoadBitmap(Starter.InternalFolder, thisFile), cvsRect)
	Dim la As String = LocationService.GeoLocal.lat
	Dim lo As String = LocationService.GeoLocal.lon
	DateTimeName = $"${DateTimeName}  -  ${la}/${lo}"$
	
	Dim f As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE)
	Dim dRect As B4XRect
	dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.TargetRect.Height-18dip, cvs.TargetRect.Left+350dip, cvs.TargetRect.Height)
	Utils.DrawTextWithBorder2(cvs, DateTimeName, f, Consts.ColorDarkGray, (dRect.left+dRect.Right)/2, (dRect.Top+dRect.Bottom)/2, 1, 0)
	
	cvs.Invalidate
	Dim Out As OutputStream = File.OpenOutput(Starter.InternalFolder, thisFile, False)
	cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
	cvs.Release
	Out.Close
	
	Private sACLADatetime As String = Utils.GetCurrDatetime
	Private sACLALatitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Private sACLALongitude As String = Utils.IfNullOrEmpty(LocationService.GeoLocal.lon, "")
	
	Dim Base64Con As Base64Convert
	Base64Con.Initialize
	Dim ImgB64 As String = Base64Con.EncodeFromImage(Starter.InternalFolder, thisFile)
	Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3 + 1000000
	Dim sSQL As String = $"insert into dta_requests_values_images
					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, 
					imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, conf_sid_id, execute_datetime, execute_latitude, execute_longitude)
					values (${maxid}, '${CurrentRequestCLAItem.Request.Trim}', 
					'${CurrentRequestCLAItem.Action}', 
					'${CurrentRequestCLAItem.Task}', 
					'${CurrentRequestCLAItem.Item}', 
					'${CurrentRequestCLAItem.UniqueKey}', 
					'${CurrentRequestCLAItem.Tagcode}',
					'${ImgB64}', '${thisFile}', 1,
					${CurrentRequestCLAItem.RepeatCounter}, 
					${CurrentRequestCLAItem.RepeatItemCounter},
					${CurrentRequestCLAItem.repeatfieldcounter}, 4,
					'${sACLADatetime}',
					'${sACLALatitude}',
					'${sACLALongitude}' )"$
				
					
	Utils.SaveSQLToLog("NewSignature",sSQL, CurrentCLAItem.Request)

	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", CurrentRequestCLAItem.Request)
	params.Put("ACLAAction", CurrentRequestCLAItem.Action)
	params.Put("ACLATask", CurrentRequestCLAItem.Task)
	params.Put("ACLAItem", CurrentRequestCLAItem.Item)
	params.Put("ACLAUniqueKey", CurrentRequestCLAItem.UniqueKey)
	params.Put("ACLATagcode", CurrentRequestCLAItem.Tagcode)
	'params.Put("ACLAValueNotes", New)
	'params.Put("ACLAValueAction", New)
	params.Put("ACLAValueImage", ImgB64)
	params.Put("ACLAValueFileImage", thisFile)
	params.Put("ACLAOnReport", 1)
	params.Put("ACLAReqCounter", CurrentRequestCLAItem.RepeatCounter)
	params.Put("ACLARepeatItem", CurrentRequestCLAItem.RepeatItemCounter)
	params.Put("ACLAConfSidId", 4)
	
	params.Put("ACLADatetime", sACLADatetime)
	params.Put("ACLALatitude", sACLALatitude)
	params.Put("ACLALongitude", sACLALongitude)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	'Dim params As Map
	If (params.IsInitialized) Then
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, Me, Url, "", CurrentRequestCLAItem.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CurrentRequestCLAItem.Request.Trim,CurrentRequestCLAItem.Task.Trim,CurrentRequestCLAItem.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
		
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Try
				UploadFilesWithFTP(thisFile)
			Catch
				Log(LastException)
				Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CurrentRequestCLAItem.Request.trim,CurrentRequestCLAItem.Task.trim,CurrentRequestCLAItem.Item.trim)
				Utils.save2update(ServerLocation, thisFile, 1, WorkerND)
			End Try
		Else
			Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CurrentRequestCLAItem.Request.trim,CurrentRequestCLAItem.Task.trim,CurrentRequestCLAItem.Item.trim)
			Utils.save2update(ServerLocation, thisFile, 1, WorkerND)
		End If
		Sleep(250)
	End If
	
	SignPanelView.Visible = False
	PanelSignature.Visible = False
	takeSignature.Visible = True
	ProgressDialogHide
	
	Dim imgInfo As String = $"${sACLADatetime} - ${sACLALatitude}, ${sACLALongitude}"$
	itemSignatures.Add(CreateSignaturePanel(CurrentRequestCLAItem, thisFile, ImgB64, 0, imgInfo), "")
End Sub

Private Sub CreateCanvas(width As Int, height As Int) As B4XCanvas
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, width, height)
	Dim cvs As B4XCanvas
	cvs.Initialize(p)
	Return cvs
End Sub

Sub btnClearSign_Click
	SignatureCapture.Clear(Signature)
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
'	
'	Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotes.Text}'
'				where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and 
'				item_tagcode='${this.Item}' 
'				and unique_key='${this.UniqueKey}'
'				and repeatcounter=${this.RepeatCounter}
'				and repeatitemcounter=${this.RepeatItemCounter}"$ ' and tagcode='${this.Tagcode}'"$
	
	If (Utils.NNE( this.Tagcode)) Then
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${this.Request.Trim}' 
				and task_tagcode='${this.Task.Trim}' 
				and item_tagcode='${this.Item.Trim}' 
				and unique_key='${this.UniqueKey.Trim}' 
				and tagcode='${this.Tagcode.Trim}' 
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}"$ 
	Else
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${this.Request.Trim}' 
				and task_tagcode='${this.Task.Trim}' 
				and item_tagcode='${this.Item.Trim}' 
				and unique_key='${this.UniqueKey.Trim}' 
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}"$ 
	End If
	Utils.SaveSQLToLog("ItemImages_ItemClick",sSQL, this.Request)
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
	params.Put("ACLAObs", CurrentItemNotesText)
	params.Put("ACLAReqCounter", this.RepeatCounter)
	params.Put("ACLARepeatItem", this.RepeatItemCounter)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
		Utils.CallApi(0, params, Me, Url, "", this.Request)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(500)
	
	Dim HaveBaseImage As Boolean = False
	If (this.BaseImage = 1) Then
		Private Record2 As Cursor
		Dim sSQL As String = $"select distinct ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 1 as base_image, 0 as on_report
			from dta_tasks_items as a 
			inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode 
					and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
			where b.request_tagcode='${this.Request}' 
				and b.inner_request_tagcode='${this.Action}' 
				and b.task_tagcode='${this.Task}' 
				and b.item_tagcode='${this.Item}' 
				and b.unique_key='${this.UniqueKey}' 
				and b.repeatcounter=${this.RepeatCounter}
				and b.repeatitemcounter=${this.RepeatItemCounter}"$
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)

		If Record2.RowCount > 0 Then
			Record2.Position = 0
			
			ImgB64 = Record2.GetString("imageb64")
			ImgB64 = ImgB64.Replace("data:image/png;base64,", "")
			ImgB64Name = Record2.GetString("imagename")
			
			HaveBaseImage = Utils.NNE(ImgB64) Or Utils.NNE(ImgB64Name)
		
		End If
		Record2.Close
	Else
		Dim sSQL As String = $"select distinct ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 1 as base_image, 0 as on_report
			from dta_tasks_items as a 
			inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode 
					and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
			where b.request_tagcode='${this.Request}' 
				and b.inner_request_tagcode='${this.Action}' 
				and b.task_tagcode='${this.Task}' 
				and b.item_tagcode='${this.Item}' 
				and b.unique_key='${this.UniqueKey}' 
				and b.repeatcounter=${this.RepeatCounter}
				and b.repeatitemcounter=${this.RepeatItemCounter}"$
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)

		If Record2.RowCount > 0 Then
			Record2.Position = 0
		End If
		
		
	End If
	
	Dim innerTag As String = ImageFilename.Tag
	If Not(HaveBaseImage) Then
		If Utils.NNE(innerTag) Then
			Dim sSQL As String = $"Select ifnull(a.image, '') as image from  dta_objects as a where a.tagcode='${innerTag}'"$
			Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)
			If Record2.RowCount > 0 Then
				Record2.Position = 0
				ImgB64 = Record2.GetString("image")
				ImgB64 = ImgB64.Replace("data:image/png;base64,", "")
				ImgB64Name = ""
			End If
		End If
	End If
'	imageb64|imagename
		
	Record2.Close
	
	If File.Exists(Starter.InternalFolder, ImageFilename.Text) Then
		Try
			Dim Base64Con As Base64Convert
			Base64Con.Initialize
			ImgB64 = Base64Con.EncodeFromImage(Starter.InternalFolder, ImageFilename.Text)
			ImgB64Name = ImageFilename.Text
		Catch
			Log(LastException)
			ImgB64 = ""
		End Try
	End If
	
	
	Dim HaveFileImage As Boolean = Utils.NNE(ImgB64) And Utils.NNE(ImgB64Name)
	If Not(HaveFileImage) Then
		If File.Exists(Starter.InternalFolder, "CROQUI.png") Then
			Try
				Dim Base64Con As Base64Convert
				Base64Con.Initialize
				ImgB64 = Base64Con.EncodeFromImage(Starter.InternalFolder, "CROQUI.png")
			Catch
				Log(LastException)
				ImgB64 = ""
			End Try
		End If
	End If
	HaveFileImage = (Utils.NNE(ImgB64))
	
	If Not(HaveFileImage) Then
		If (Utils.NNE(ImgB64Name)) Then
			If File.Exists(Starter.InternalFolder, ImgB64Name) Then
				Try
					Dim Base64Con As Base64Convert
					Base64Con.Initialize
						
					ImgB64 = Base64Con.EncodeFromImage(Starter.InternalFolder, ImgB64Name)
				Catch
					Log(LastException)
					ImgB64 = ""
				End Try
			End If
		End If
	End If
	
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

Sub imageSelectedTrash_Click
	Dim sndr As Label = Sender
	Dim thisPanel As B4XView = sndr.Parent
	Dim this As RequestCLAItem = thisPanel.Tag
	Dim fname As Label = thisPanel.GetView(1)
	DeleteImageFromList(thisPanel, this, fname)
End Sub

Sub imageSelectedOnReport_Click
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
	SetImageSelectedOnReport(this, fname, 0)
End Sub

Sub SetImageSelectedOnReport(this As RequestCLAItem, fname As Label, fsid As Int)
	Dim sSQL As String = $"update dta_requests_values_images set on_report=${this.OnReport} where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and
							item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and tagcode='${this.Tagcode}' and imagename='${fname.Text}' and conf_sid_id=${fsid}"$
	Utils.SaveSQLToLog("imageSelectedOnReport_Click",sSQL, this.Request)
	'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	
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
	params.Put("ACLAConfSid", fsid)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	If (params.IsInitialized) Then
'		Utils.CallApi(0, params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update2"$, "")
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update2"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, Me, Url, "", this.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
	End If
End Sub

Sub takePhoto_Click
'	Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotes.Text}'
'				where request_tagcode='${CurrentCLAItem.Request}' and task_tagcode='${CurrentCLAItem.Task}' and 
'				item_tagcode='${CurrentCLAItem.Item}' and unique_key='${CurrentCLAItem.UniqueKey}'
'				and repeatcounter=${CurrentCLAItem.RepeatCounter}
'				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ ' and tagcode='${CurrentCLAItem.Tagcode}'"$
				
	If (Utils.NNE( CurrentCLAItem.Tagcode)) Then
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and tagcode='${CurrentCLAItem.Tagcode.Trim}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
	Else
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
	End If
	Utils.SaveSQLToLog("takePhoto_Click",sSQL, CurrentCLAItem.Request)
	'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	
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
	params.Put("ACLAObs", CurrentItemNotesText)
	params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
	params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
		Utils.CallApi(0, params, Me, Url, "", CurrentCLAItem.Request)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CurrentCLAItem.Request.Trim,CurrentCLAItem.Task.Trim,CurrentCLAItem.Item.Trim)
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(250)
	
	CallSubDelayed3(CameraActivity2, "StartCamera2", Me, CurrentCLAItem)
	
End Sub

Sub CameraReturnNothing
	'
End Sub

Sub takeNewDesign_Click
'	Log("click")
'	If (Utils.NNE( CurrentCLAItem.Tagcode)) Then
'		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
'				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
'				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
'				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
'				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
'				and tagcode='${CurrentCLAItem.Tagcode.Trim}' 
'				and repeatcounter=${CurrentCLAItem.RepeatCounter}
'				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
'	Else
'		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
'				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
'				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
'				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
'				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
'				and repeatcounter=${CurrentCLAItem.RepeatCounter}
'				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
'	End If
'	Utils.SaveSQLToLog("takePhoto_Click",sSQL, CurrentCLAItem.Request)
'	'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
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
'	params.Put("ACLAObs", CurrentItemNotesText)
'	params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
'	params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
'		
'	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
'	If Not(ShareCode.APP_WORKING_LOCAL) Then
'		Utils.CallApi(0, params, Me, Url, "")
'	Else
'	Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
'		Utils.save2update(Url, Utils.MapToJson(params), 0, workernd)
'	End If
'	Sleep(250)
'	CurrentCLAItem.Origin = 2
'	CallSubDelayed3(ImageEdit, "StartDraw", CurrentCLAItem, True)
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
		
		Dim maxid As Int = DBStructures.GetMaxOfEVC("dta_requests_values_images", "id", "") +3 + 1000000
		Dim sSQL As String = $"insert into dta_requests_values_images 
						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, 
						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter)
						values (${maxid}, '${this.Request}', '${this.Action}', '${this.Task}', '${this.Item}', '${this.UniqueKey}', '${this.Tagcode}',
		'${ImgB64}', '${FileName}', 1, ${this.RepeatCounter}, ${this.RepeatItemCounter}, ${this.repeatfieldcounter})"$
						
		Utils.SaveSQLToLog("CameraReturn",sSQL, this.Request)
		'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		
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
		'params.Put("ACLAValueNotes", New)
		'params.Put("ACLAValueAction", New)
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
	
	If Not(this.Value = "IMG_B64_EDIT") Then
		If (ItemImages.IsInitialized) Then
			ItemImages.Clear
			AssociateImagesCompleteList.Clear
		End If
		Private Record2 As Cursor
'		Dim Status As Int = 0
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
				If Not(Utils.isNullOrEmpty(image)) Then
					'Dim bmp As Bitmap = Base64Con.DecodeToImage(image)
					If (ItemImages.IsInitialized) Then
						Try
							ItemImages.Add(CreateImagePanel(this, FileName, image, 0, ""), "")
							AssociateImagesCompleteList.Add(FileName)
						Catch
							Log(LastException)
						End Try
					End If
				End If
			Next
		End If
		Record2.Close
	End If
	
	'Dim params As Map
	If (params.IsInitialized) Then
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, Me, Url, "", this.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(1000)
		
'		UploadFilesWithFTP(FileName)
		
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Try
				UploadFilesWithFTP(FileName)
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
		Sleep(1000)
	End If
	
	If (params33.IsInitialized) Then
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more2/img/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params33, Me, Url, "", this.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.trim,this.Task.trim,this.Item.trim)
			Utils.save2update(Url, Utils.MapToJson(params33), 0, WorkerND)
		End If
		Sleep(1000)
	End If
	'CallSub(CameraActivity, "CloseActivity")
End Sub

Public Sub CameraReturnShots(FileList As List, this As RequestCLAItem)
	
	'CurrentCLAItem
	Dim obj As String = ObjectTagcode
	If (Utils.isNullOrEmpty(obj)) Then
		obj = this.TagObject
	End If
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
	
			If Not(this.Value = "IMG_B64_EDIT") Then
				If (ItemImages.IsInitialized) Then
					ItemImages.Clear
					AssociateImagesCompleteList.Clear
				End If
				
				Dim sSQL As String = $"select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report
								from dta_requests_values_images where request_tagcode='${this.Request}' and
								task_tagcode='${this.Task}' and item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and 
								tagcode='${this.Tagcode}'
								And repeatcounter=${this.RepeatCounter}
								And repeatitemcounter=${this.RepeatItemCounter}"$
				Private Record2 As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
		
				If Record2.RowCount > 0 Then
					For n=0 To Record2.RowCount-1
						Record2.Position = n
						Dim image As String = Record2.GetString("imageb64")
						Dim FileName As String = Record2.GetString("imagename")
						If Not(Utils.isNullOrEmpty(image)) Then
							'Dim bmp As Bitmap = Base64Con.DecodeToImage(image)
							If (ItemImages.IsInitialized) Then
								Try
									ItemImages.Add(CreateImagePanel(this, FileName, image, 0, ""), "")
									AssociateImagesCompleteList.Add(FileName)
								Catch
									Log(LastException)
								End Try
							End If
						End If
					Next
				End If
				Record2.Close
			End If
	
			'Dim params As Map
			If (params.IsInitialized) Then
				Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/update"$
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Utils.CallApi(0, params, Me, Url, "", this.Request)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
					Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
				End If
				Sleep(1000)
		
		
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Try
						Dim upl As ResumableSub = UploadFilesWithFTP(FileName)
						Wait For(upl) Complete (finish As Boolean)
					Catch
						Log(LastException)
						Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
						Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
						Utils.save2update(ServerLocation, FileName, 1, WorkerND)
					End Try
				Else
					Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
					Utils.save2update(ServerLocation, FileName, 1, WorkerND)
				End If
				Sleep(1000)
			End If
	
			If (params33.IsInitialized) Then
				Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more2/img/update"$
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Utils.CallApi(0, params33, Me, Url, "", this.Request)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.trim,this.Task.trim,this.Item.trim)
					Utils.save2update(Url, Utils.MapToJson(params33), 0, WorkerND)
				End If
				Sleep(1000)
			End If
			'CallSub(CameraActivity, "CloseActivity")
			
		Next
		ProgressDialogHide
	End If
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
	Return ret
End Sub

Sub obsOptions_ItemClick (Position As Int, Value As Object)
	If (Position = 0) Then
	Else
'		ItemNotes.Text = ItemNotes.Text & obsOptions.GetItem(Position)
'		CurrentItemNotes = ItemNotes
'		CurrentItemNotesText = ItemNotes.Text
'		Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotes.Text}'
'				where request_tagcode='${CurrentCLAItem.Request}' and task_tagcode='${CurrentCLAItem.Task}' and 
'				item_tagcode='${CurrentCLAItem.Item}' and unique_key='${CurrentCLAItem.UniqueKey}'
'				And repeatcounter=${CurrentCLAItem.RepeatCounter}
'				And repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 

		If (Utils.NNE( CurrentCLAItem.Tagcode)) Then
			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and tagcode='${CurrentCLAItem.Tagcode.Trim}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
		Else
			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
		End If
		Utils.SaveSQLToLog("obsOptions_ItemClick",sSQL, CurrentCLAItem.Request)
		'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		
			
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
		params.Put("ACLAObs", CurrentItemNotesText)
		params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
		params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, Me, Url, "", CurrentCLAItem.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CurrentCLAItem.Request.Trim,CurrentCLAItem.Task.Trim,CurrentCLAItem.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
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
	Filter.GetMoreSendEmailDialog(CurrentCLAItem, CurrentTagcode, CurrentCLD, CurrentItemNotesText, lst ) 'CurrentImageList)
End Sub

Sub sendEmailImages_Click
	If (CurrentImageList.Size >= 1) Then
		Dim Filter As AppActionDialogs
		Filter.Initialize
		Filter.GetMoreSendEmailDialog(CurrentCLAItem, CurrentTagcode, CurrentCLD, CurrentItemNotesText, CurrentImageList)
	Else
		MsgboxAsync("Tem de seleccionar 1 ou mais imagens para poder continuar!", "Alerta!")
	End If
End Sub

'*************************************************************************************
' APRESENTA LISTA DE TAREFAS
'*************************************************************************************
'DeviceInfo As DeviceInformation
'dialog_task_list
'ListItem_ViewSimpleList
Sub GetTaskListDialog(activ As Activity, activObj As Object, items As Cursor)
	Dim sf As Object = ApplActionDialog.ShowAsync("Lista de Tarefas", "Cancelar", "", "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	ApplActionDialog.SetSize(75%x, 75%y)
	ThisActivityName_TaskListDialog = activObj
	CurrentCLD = ApplActionDialog
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_task_list")

	For Row = 0 To items.RowCount-1
		items.Position = Row
		Dim p As Panel
		p.Initialize("")
		activ.AddView(p, 0, 0, 100%x, 60dip)
		p.LoadLayout("ListItem_ViewSimpleList")
		p.RemoveView
		ViewSimpleListTitle.text = items.GetString("name")
		ViewSimpleListInfo.text = ""
		If (ShareCode.DEVICE_PARAM_AS_OBS2DETAILS = 1) Then
			ViewSimpleListInfo.text = Utils.IfNullOrEmpty(items.GetString("details"), "")
		End If
		ViewSimpleListNumber.Text = $"#${Row+1}"$
		p.Tag = items.GetString("tagcode")
		ViewSimpleList.Add(p, "") ', 60dip, "")
	Next
	items.close

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		'CallSub2(activ, "SetTheFilters", SetTheFilters)
	End If
End Sub

Sub ViewSimpleList_ItemClick (Index As Int, Value As Object)
	Dim clv As CustomListView = Sender
	Dim pan As Panel = clv.GetPanel(Index)
	CallSub2(ThisActivityName_TaskListDialog, "TaskListItemSelected", pan.Tag)
	CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
End Sub

'*************************************************************************************
' NOVA ACÇÃO SUBSEQUENTE
'*************************************************************************************
'Sub GetMoreNewActionsDialog(activ As Object, this As RequestCLAItem, asTagcode As String, origin As CustomLayoutDialog, _
'		obs As String, IsNew As Boolean, theTagcode As String)
Sub GetMoreNewActionsDialog(activ As Object, this As RequestCLAItem, asTagcode As String,  _
		obs As String, IsNew As Boolean, theTagcode As String, parentDialog As CustomLayoutDialog, _
		tagcodeTPA As String, groupTPA As String, actionforce As Int)
	Dim Title As String = ShareCode.ActionSubEditTitle
	If Utils.isNullOrEmpty(asTagcode) Then Title = ShareCode.ActionSubNewTitle
	Dim sf As Object = ApplDialog.ShowAsync(Title, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, ShareCode.Option_SENDEMAIL, Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		ApplDialog.SetSize(100%x,100%y)
	Else
		ApplDialog.SetSize(90%x, 90%y)
	End If
	

	EmailSentOnNewAS = True
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_more_action2")
	
	'dlgASCCEmails
	
	Dim GravityValue As Int = DBStructures.GetScriptColumnIntEVC($"SELECT a.points FROM dta_tasks_items_answers AS a
										 INNER JOIN dta_requests_values AS c ON (c.task_tagcode=a.task_tagcode
										 	AND c.item_tagcode=a.item_tagcode
										 	AND c.unique_key=a.unique_key
										 	AND c.tagcode=a.tagcode)
											WHERE c.task_tagcode='${this.Task.Trim}'
											And c.item_tagcode='${this.Item.Trim}'
											And c.unique_key='${this.UniqueKey.Trim}'
											And c.tagcode='${this.Tagcode.Trim}'
											And c.repeatcounter=${this.RepeatCounter}
											And c.request_tagcode='${this.Request.Trim}'
											And c.inner_request_tagcode='${this.Action.Trim}'"$, "points")
	
	dlgASAssign.Add("Cliente")
	
'	'MakeDB_ITC(ID As Int, Title As String, Color As String) As DB_ITC
'	dlgASStatus.Color = Consts.ColorWhiteSilverLight
'	dlgASStatus.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For n=0 To AS_Status.Size-1
		Dim itc As DB_ITC = AS_Status.Get(n)
		dlgASStatus.Add(itc.Title)
	Next
	
	dlgASType.Color = Consts.ColorWhiteSilverLight
	dlgASType.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	dlgASType.Add("")
'	For n=0 To AS_Modes.Size-1
'		Dim itc As DB_ITC = AS_Modes.Get(n)
'		dlgASType.Add(itc.Title)
'	Next
	For n=0 To AS_Types.Size-1
		Dim itc As DB_ITC = AS_Types.Get(n)
		dlgASType.Add(itc.Title)
	Next
	
	If (AS_Types.Size > 0) Then
		If (Utils.NNE(tagcodeTPA)) Then
			Dim nPos As Int = DBStructures.getITCTablePos(DBStructures.SQL_DATA_TYPE_ASTYPES, tagcodeTPA)
			If (nPos > 0) Then
				dlgASType.SelectedIndex = nPos
			Else
				dlgASType.SelectedIndex = 1
			End If
		Else
			dlgASType.SelectedIndex = 1
		End If
	End If

	dlgASPriority.Color = Consts.ColorWhiteSilverLight
	dlgASPriority.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For n=0 To AS_Priority.Size-1
		Dim itc As DB_ITC = AS_Priority.Get(n)
		dlgASPriority.Add(itc.Title)
	Next
	
	dlgASUrgency.Color = Consts.ColorWhiteSilverLight
	If (IsNew) Then
		dlgASUrgency.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
		For n=0 To AS_Urgency.Size-1
			Dim itc As DB_ITC = AS_Urgency.Get(n)
			dlgASUrgency.Add(itc.Title)
		Next
	Else
		dlgASUrgency.Enabled = False
	End If
	
	dlgASUrgency.SelectedIndex = GravityValue
	
	dlgASSubject.Color = Consts.ColorWhiteSilverLight
	dlgASSubject.Text = this.Title
	dlgASEmails.Color = Consts.ColorWhiteSilverLight
	dlgASEmails.Text = $""$
	dlgASCCEmails.Color = Consts.ColorWhiteSilverLight
	dlgASCCEmails.Text = $"alertas@${ShareCode.APPL_HOST}"$
	dlgASDueDate.Color = Consts.ColorWhiteSilverLight
	
	
	dlgASDetails.Color = Consts.ColorWhiteSilverLight
	dlgASDetails.Text = $""$
	If  (ShareCode.APP_DOMAIN.ToLowerCase = "edp") Then
		dlgASDetails.Text = obs
	End If
	
'	Private butASDueDate As Button
'	Private dlgASDueDate As FloatLabeledEditText

	ApplDialog.GetButton(DialogResponse.NEGATIVE).Enabled = Not(Utils.Int2Bool(actionforce)) 'False

	Wait For (sf) Dialog_Result(res As Int)
	'If res = DialogResponse.POSITIVE Then
	If (res = DialogResponse.POSITIVE) Or (res = DialogResponse.NEGATIVE) Then
		Dim sendTheEmail As Int = Utils.Bool2Int(res = DialogResponse.NEGATIVE)
		
		If (asTagcode = "") Then
			asTagcode = Utils.GenerateTagcode("AS0")
		End If
		
		Dim dtupd As String = Utils.GetCurrDatetimeExt
		'tagcodeTPA As String, groupTPA
		
		If (IsNew) Then
			asTagcode = DBStructures.InsertRequestASEVC(asTagcode, this.Request, this.Action, this.Task, this.Item, this.UniqueKey, _
					theTagcode, dlgASSubject.Text, dlgASDetails.Text, Utils.getASPriority(dlgASPriority.SelectedIndex+1), _
					Utils.getASUrgency(dlgASUrgency.SelectedIndex+1), ShareCode.SESS_OPER_User, _
					Utils.getASStatus(dlgASStatus.SelectedIndex+1), Utils.GetCurrDatetime, Utils.Bool2Int(EmailSentOnNewAS), _
					dlgASEmails.Text, dlgASDueDate.Text, this.RepeatCounter, this.RepeatItemCounter, this.repeatfieldcounter, dtupd, _
					tagcodeTPA, groupTPA, obs, sendTheEmail)
		Else
			asTagcode = DBStructures.InsertRequestASEVCDetails(asTagcode, this.Request, this.Action, this.Task, this.Item, this.UniqueKey, _
					theTagcode, dlgASSubject.Text, dlgASDetails.Text, Utils.getASPriority(dlgASPriority.SelectedIndex+1), _
					Utils.getASUrgency(dlgASUrgency.SelectedIndex+1), ShareCode.SESS_OPER_User, _
					Utils.getASStatus(dlgASStatus.SelectedIndex+1), Utils.GetCurrDatetime, Utils.Bool2Int(EmailSentOnNewAS), _
					dlgASEmails.Text, dlgASDueDate.Text, this.RepeatCounter, this.RepeatItemCounter, this.repeatfieldcounter, dtupd, sendTheEmail)
		End If
		
		
		Dim sSQL As String = $"SELECT DISTINCT a.actions_tagcode,a.operation_type,a.typerequest_type,a.details,a.priority_tagcode,a.gravity_tagcode,
						a.team_tagcode, a.technical_tagcode, a.commercial_tagcode, a.close_date, a.due_date, a.send_email, a.email_sent,
						a.email_to, a.email_cc, a.updated_at, a.active,
						b.request_tagcode, b.title, b.details,
						c.status_id, c.entity_tagcode, c.object_tagcode,
						d.title_import, d.reference, ifnull(e.title,'') as technical_name,
						IFNULL(t1.tagdesc, '') AS priority_name, 
						IFNULL(t2.tagdesc, '') AS gravity_name, 
						IFNULL(t3.tagdesc, '') AS operation_name,  
						IFNULL(t4.tagdesc, '') AS status_name
						FROM dta_actions_items AS a
						INNER JOIN dta_actions AS b ON (b.tagcode=a.actions_tagcode)
						INNER JOIN dta_requests AS c ON (c.tagcode=b.request_tagcode)
						INNER JOIN dta_objects AS d ON (d.tagcode=c.object_tagcode)
						LEFT JOIN dta_technicals AS e ON (e.tagcode=b.technical_tagcode)
						LEFT JOIN type_prioritytypes AS t1 ON (t1.tagcode=a.priority_tagcode)
						LEFT JOIN type_gravitytypes AS t2 ON (t2.tagcode=a.gravity_tagcode)
						LEFT JOIN type_operationtypes AS t3 ON (t3.tagcode=a.operation_type)
						LEFT JOIN type_statustypes AS t4 ON (t4.id=c.status_id)
						WHERE a.actions_tagcode='${asTagcode}'
						ORDER BY a.id DESC
						LIMIT 1"$
						
		Dim newHTML As String = ""
		Dim RecordCount As Int = 0
		Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			RecordCount = RecordCount + 1
			Record.Position = 0
			
			Dim actions_tagcode As String = Utils.ifnullorempty(Record.getstring("actions_tagcode"), "")
			Dim request_tagcode As String = Utils.ifnullorempty(Record.getstring("request_tagcode"), "")
			Dim reference As String = Utils.ifnullorempty(Record.getstring("reference"), "")
			Dim technical_name As String = Utils.ifnullorempty(Record.getstring("technical_name"), "")
			Dim updated_at As String = Utils.ifnullorempty(Record.getstring("updated_at"), "")
			Dim details As String = Utils.ifnullorempty(Record.getstring("details"), "")
			Dim status_name As String = Utils.ifnullorempty(Record.getstring("status_name"), "")
			Dim due_date As String = Utils.ifnullorempty(Record.getstring("due_date"), "")
			Dim priority_name As String = Utils.ifnullorempty(Record.getstring("priority_name"), "")
			Dim gravity_name As String = Utils.ifnullorempty(Record.getstring("gravity_name"), "")
			Dim operation_name As String = Utils.ifnullorempty(Record.getstring("operation_name"), "")
			
		End If
		Record.Close
		
		If Utils.NNE(due_date) Then
			Try
				Dim ddate As Long = DateTime.DateParse(due_date)
				DateTime.DateFormat = "yyyy-MM-dd"
				due_date = DateTime.Date(ddate)
			Catch
				Log(LastException)
			End Try
		End If
		
		If Utils.NNE(due_date) Then
			Try
				due_date = due_date.Replace("00:00:00", "").Trim
			Catch
				Log(LastException)
			End Try
		End If
		
		
		Dim LOGO As String = ""
		Dim LOGOALT As String = ""
		Dim LOGOTITLE As String = ""
		Dim SUPORTE As String = ""
		
		If (sendTheEmail = 1) Then
			'LOGO = $"https://${ShareCode.APP_DOMAIN.ToLowerCase}.vrcg.pt/imgs/logo.png"$
			LOGO = $"data:image/jpeg;base64,${ShareCode.APP_MAIN_LOGO_MINI}"$
			If  (ShareCode.APP_DOMAIN.ToLowerCase = "edp") Then
				LOGOALT = "EDP"
				LOGOTITLE = "EDP Comercial "
				SUPORTE = "<b>Suporte</b><br>Caso encontre alguma dificuldade, por favor entre em contacto com João Salsa (939395171) ou Pedro Fontoura (936113575)."
			else If  (ShareCode.APP_DOMAIN.ToLowerCase = "uber") Then
				LOGOALT = "UBER"
				LOGOTITLE = "UBER Desinfestações "
				SUPORTE = "<b>Suporte</b><br>"
			else If  (ShareCode.APP_DOMAIN.ToLowerCase.contains("grandative")) Then
				LOGOALT = "GrandAtive"
				LOGOTITLE = "GrandAtive "
				SUPORTE = "<b>Suporte</b><br>"
			Else
				LOGOALT = $"${ShareCode.APP_DOMAIN.ToUpperCase}"$
				LOGOTITLE = $"${ShareCode.APP_DOMAIN.ToUpperCase} "$
				SUPORTE = "<b>Suporte</b><br>"
			End If

			If RecordCount > 0 Then
				Dim newHTML As String = $"<!DOCTYPE html>
				<html xmlns="http://www.w3.org/1999/xhtml"> <head>  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
				<title>${LOGOTITLE}</title>  <meta name="viewport" content="width=device-width, initial-scale=1.0"/></head><body style="margin: 0; padding: 0;">
				<table align="center" border="0" cellpadding="0" cellspacing="0" width="60%">    <tr> <td bgcolor="f00000">&nbsp;</td>
				</tr> <tr><td bgcolor="#fff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				<img src="${LOGO}" alt="${LOGOALT}">${LOGOTITLE}</td></tr><tr>
				<td bgcolor="#fff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				<p><b>ID de ação:</b> ${actions_tagcode}</p><p><b>Nº Inspecção:</b> ${request_tagcode} &nbsp&nbsp 
				</p> <p> <b>Contrato:</b> ${reference} </p> </td></tr>technical_tagcode<tr>
				<td bgcolor="#ffffff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				<table border="1" cellpadding="10" > <tr><td style="width: 25%">Modificado por</td>
				<td style="width: 75%">${technical_name}</td> </tr><tr><td>Data de Modificação</td><td>${updated_at}</td>
				</tr><tr><td>Descrição da Intervenção</td> <td>${details}</td> </tr><tr><td>Estado da Ação</td><td>${status_name}</td>
				</tr> <tr> <td>Data Vencimento</td> <td>${due_date}</td> </tr> <tr> <td>Prioridade</td> <td>${priority_name}</td>
				</tr>  <tr> <td>Gravidade</td> <td>${gravity_name}</td>  
				</tr>gravity_name<tr> <td>Tipo Ação</td> <td>${operation_name}</td> </tr> </table> </td> </tr> <tr>
				<td bgcolor="#ffffff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				${SUPORTE}
				</td> </tr> <tr> <td bgcolor="f00000">&nbsp;</td> </tr> </table> </body> </html>"$
			End If
		
			Log(newHTML)
			Dim imgList As List
			imgList.initialize
		
			Try
				Utils.SendEmailExt(dlgASEmails.Text, "", dlgASSubject.Text, newHTML, imgList)
			Catch
				Log(LastException)
			End Try
			Sleep(250)
		End If
	
		
		Dim params As Map
		params.Initialize
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", this.Request)
		params.Put("ACLAAction", this.Action)
		params.Put("ACLATask", this.Task)
		params.Put("ACLAItem", this.Item)
		params.Put("ACLAUniqueKey", this.UniqueKey)
		params.Put("ASUITagcode", theTagcode)
		params.Put("ACLAExecuteAction", asTagcode)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("ACLARepeatField", this.repeatfieldcounter)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/as/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, activ, Url, "", this.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(550)
		
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
		params.Put("ASUITagcode", theTagcode)
		params.Put("ASTagcode", asTagcode)
		params.Put("ASTitle", dlgASSubject.Text)
		params.Put("ASDetails", dlgASDetails.Text)
		params.Put("ASPriority", Utils.getASPriority(dlgASPriority.SelectedIndex+1))
		params.Put("ASUrgency", Utils.getASUrgency(dlgASUrgency.SelectedIndex+1))
		params.Put("ASAssigned", ShareCode.SESS_OPER_User)
		params.Put("ASAssignedType", 0)
		params.Put("ASStatus", Utils.getASStatus(dlgASStatus.SelectedIndex+1))
		params.Put("ASEmailDatetime", emailsentdate)
		params.Put("ASEmailSent", sendTheEmail) 'Utils.Bool2Int(sendTheEmail))  'Utils.Bool2Int(EmailSentOnNewAS))
		params.Put("ASEmailTo", dlgASEmails.Text)
		params.Put("ASEmailRelatedTask", "")
		params.Put("ASEmailRelatedAction", "")
		params.Put("ASDueDate", dlgASDueDate.Text)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("ACLARepeatField", this.repeatfieldcounter)
		params.Put("ACLACreation", dtupd)
		params.Put("ACLATagcodeTPA", tagcodeTPA)
		params.Put("ACLAGroupTPA", groupTPA)
		params.Put("ACLANew", Utils.Bool2Int(IsNew))
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/as/insert"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, activ, Url, "", this.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(550)

		'CallSubDelayed3(requests3, "Return2CLAI", this, 1)
		CallSubDelayed3(activ, "Return2CLAI", this, 1)
		If Not(parentDialog = Null) Then
			parentDialog.CloseDialog(DialogResponse.POSITIVE)
		End If
	End If
End Sub

'*************************************************************************************
' TIP: EDITA ACÇÃO SUBSEQUENTE
'*************************************************************************************
Sub GetMoreEditActionsDialog(activ As Object, this As RequestCLAItem, asTagcode As String,  _
		obs As String, IsNew As Boolean, theTagcode As String, parentDialog As CustomLayoutDialog, _
		tagcodeTPA As String, groupTPA As String, actionforce As Int)
	Dim Title As String = ShareCode.ActionSubEditTitle
	If Utils.isNullOrEmpty(asTagcode) Then Title = ShareCode.ActionSubNewTitle
	Dim sf As Object = ApplDialog.ShowAsync(Title, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, ShareCode.Option_SENDEMAIL, Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		ApplDialog.SetSize(100%x,100%y)
	Else
		ApplDialog.SetSize(90%x, 90%y)
	End If
	

	EmailSentOnNewAS = True
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_more_action2")
	
	'dlgASCCEmails
	
	Dim GravityValue As Int = DBStructures.GetScriptColumnIntEVC($"SELECT a.points FROM dta_tasks_items_answers AS a
										 INNER JOIN dta_requests_values AS c ON (c.task_tagcode=a.task_tagcode
										 	AND c.item_tagcode=a.item_tagcode
										 	AND c.unique_key=a.unique_key
										 	AND c.tagcode=a.tagcode)
											WHERE c.task_tagcode='${this.Task.Trim}'
											And c.item_tagcode='${this.Item.Trim}'
											And c.unique_key='${this.UniqueKey.Trim}'
											And c.tagcode='${this.Tagcode.Trim}'
											And c.repeatcounter=${this.RepeatCounter}
											And c.request_tagcode='${this.Request.Trim}'
											And c.inner_request_tagcode='${this.Action.Trim}'"$, "points")
	
	dlgASAssign.Add("Cliente")
	For n=0 To AS_Status.Size-1
		Dim itc As DB_ITC = AS_Status.Get(n)
		dlgASStatus.Add(itc.Title)
	Next
	
	dlgASType.Color = Consts.ColorWhiteSilverLight
	dlgASType.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	dlgASType.Add("")
	For n=0 To AS_Types.Size-1
		Dim itc As DB_ITC = AS_Types.Get(n)
		dlgASType.Add(itc.Title)
	Next
	
	If (AS_Types.Size > 0) Then
		If (Utils.NNE(tagcodeTPA)) Then
			Dim nPos As Int = DBStructures.getITCTablePos(DBStructures.SQL_DATA_TYPE_ASTYPES, tagcodeTPA)
			If (nPos > 0) Then
				dlgASType.SelectedIndex = nPos
			Else
				dlgASType.SelectedIndex = 1
			End If
		Else
			dlgASType.SelectedIndex = 1
		End If
	End If

	dlgASPriority.Color = Consts.ColorWhiteSilverLight
	dlgASPriority.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
	For n=0 To AS_Priority.Size-1
		Dim itc As DB_ITC = AS_Priority.Get(n)
		dlgASPriority.Add(itc.Title)
	Next
	
	dlgASUrgency.Color = Consts.ColorWhiteSilverLight
	If (IsNew) Then
		dlgASUrgency.DropdownBackgroundColor = Consts.ColorWhiteSilverLight
		For n=0 To AS_Urgency.Size-1
			Dim itc As DB_ITC = AS_Urgency.Get(n)
			dlgASUrgency.Add(itc.Title)
		Next
	Else
		dlgASUrgency.Enabled = False
	End If
	
	dlgASUrgency.SelectedIndex = GravityValue
	
	dlgASSubject.Color = Consts.ColorWhiteSilverLight
	dlgASSubject.Text = this.Title
	dlgASEmails.Color = Consts.ColorWhiteSilverLight
	dlgASEmails.Text = $""$
	dlgASCCEmails.Color = Consts.ColorWhiteSilverLight
	dlgASCCEmails.Text = $"alertas@${ShareCode.APPL_HOST}"$
	dlgASDueDate.Color = Consts.ColorWhiteSilverLight
	
	Dim detailsText As String = DBStructures.GetScriptColumnStrEVC($"SELECT details from dta_actions WHERE 1=1
																	AND tagcode = '${asTagcode}'
																	And iu_tagcode = '${theTagcode}'
																	And request_tagcode = '${this.Request.Trim}'
																	And task_tagcode = '${this.Action.trim}'"$,"details")
	
	
	
	dlgASDetails.Color = Consts.ColorWhiteSilverLight
	
	
	dlgASDetails.Text = $""$
	
	If  (ShareCode.APP_DOMAIN.ToLowerCase = "edp") Then
		dlgASDetails.Text = obs
	Else
		dlgASDetails.Text = detailsText
	End If
	
	
	ApplDialog.GetButton(DialogResponse.NEGATIVE).Enabled = Not(Utils.Int2Bool(actionforce)) 'False

	Wait For (sf) Dialog_Result(res As Int)
	If (res = DialogResponse.POSITIVE) Or (res = DialogResponse.NEGATIVE) Then
		Dim sendTheEmail As Int = Utils.Bool2Int(res = DialogResponse.NEGATIVE)
		Dim dtupd As String = Utils.GetCurrDatetimeExt
		asTagcode = DBStructures.UpdateRequestASEVC(asTagcode, this.Request, this.Action, this.Task, this.Item, this.UniqueKey, _
					theTagcode, dlgASSubject.Text, dlgASDetails.Text, Utils.getASPriority(dlgASPriority.SelectedIndex+1), _
					Utils.getASUrgency(dlgASUrgency.SelectedIndex+1), ShareCode.SESS_OPER_User, _
					Utils.getASStatus(dlgASStatus.SelectedIndex+1), Utils.GetCurrDatetime, Utils.Bool2Int(EmailSentOnNewAS), _
					dlgASEmails.Text, dlgASDueDate.Text, this.RepeatCounter, this.RepeatItemCounter, this.repeatfieldcounter, dtupd, _
					tagcodeTPA, groupTPA, obs, sendTheEmail)
		
		Dim sSQL As String = $"SELECT DISTINCT a.actions_tagcode,a.operation_type,a.typerequest_type,a.details,a.priority_tagcode,a.gravity_tagcode,
						a.team_tagcode, a.technical_tagcode, a.commercial_tagcode, a.close_date, a.due_date, a.send_email, a.email_sent,
						a.email_to, a.email_cc, a.updated_at, a.active,
						b.request_tagcode, b.title, b.details,
						c.status_id, c.entity_tagcode, c.object_tagcode,
						d.title_import, d.reference, ifnull(e.title,'') as technical_name,
						IFNULL(t1.tagdesc, '') AS priority_name, 
						IFNULL(t2.tagdesc, '') AS gravity_name, 
						IFNULL(t3.tagdesc, '') AS operation_name,  
						IFNULL(t4.tagdesc, '') AS status_name
						FROM dta_actions_items AS a
						INNER JOIN dta_actions AS b ON (b.tagcode=a.actions_tagcode)
						INNER JOIN dta_requests AS c ON (c.tagcode=b.request_tagcode)
						INNER JOIN dta_objects AS d ON (d.tagcode=c.object_tagcode)
						LEFT JOIN dta_technicals AS e ON (e.tagcode=b.technical_tagcode)
						LEFT JOIN type_prioritytypes AS t1 ON (t1.tagcode=a.priority_tagcode)
						LEFT JOIN type_gravitytypes AS t2 ON (t2.tagcode=a.gravity_tagcode)
						LEFT JOIN type_operationtypes AS t3 ON (t3.tagcode=a.operation_type)
						LEFT JOIN type_statustypes AS t4 ON (t4.id=c.status_id)
						WHERE a.actions_tagcode='${asTagcode}'
						ORDER BY a.id DESC
						LIMIT 1"$
						
		Dim newHTML As String = ""
		Dim RecordCount As Int = 0
		Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
		If Record.RowCount > 0 Then
			RecordCount = RecordCount + 1
			Record.Position = 0
			
			Dim actions_tagcode As String = Utils.ifnullorempty(Record.getstring("actions_tagcode"), "")
			Dim request_tagcode As String = Utils.ifnullorempty(Record.getstring("request_tagcode"), "")
			Dim reference As String = Utils.ifnullorempty(Record.getstring("reference"), "")
			Dim technical_name As String = Utils.ifnullorempty(Record.getstring("technical_name"), "")
			Dim updated_at As String = Utils.ifnullorempty(Record.getstring("updated_at"), "")
			Dim details As String = Utils.ifnullorempty(Record.getstring("details"), "")
			Dim status_name As String = Utils.ifnullorempty(Record.getstring("status_name"), "")
			Dim due_date As String = Utils.ifnullorempty(Record.getstring("due_date"), "")
			Dim priority_name As String = Utils.ifnullorempty(Record.getstring("priority_name"), "")
			Dim gravity_name As String = Utils.ifnullorempty(Record.getstring("gravity_name"), "")
			Dim operation_name As String = Utils.ifnullorempty(Record.getstring("operation_name"), "")
			
		End If
		Record.Close
		
		If Utils.NNE(due_date) Then
			Try
				Dim ddate As Long = DateTime.DateParse(due_date)
				DateTime.DateFormat = "yyyy-MM-dd"
				due_date = DateTime.Date(ddate)
			Catch
				Log(LastException)
			End Try
		End If
		
		If Utils.NNE(due_date) Then
			Try
				due_date = due_date.Replace("00:00:00", "").Trim
			Catch
				Log(LastException)
			End Try
		End If
		
		
		Dim LOGO As String = ""
		Dim LOGOALT As String = ""
		Dim LOGOTITLE As String = ""
		Dim SUPORTE As String = ""
		
		If (Utils.Int2Bool(sendTheEmail)) Then
			'LOGO = $"https://${ShareCode.APP_DOMAIN.ToLowerCase}.vrcg.pt/imgs/logo.png"$
			LOGO = $"data:image/jpeg;base64,${ShareCode.APP_MAIN_LOGO_MINI}"$
			If  (ShareCode.APP_DOMAIN.ToLowerCase = "edp") Then
				LOGOALT = "EDP"
				LOGOTITLE = "EDP Comercial "
				SUPORTE = "<b>Suporte</b><br>Caso encontre alguma dificuldade, por favor entre em contacto com João Salsa (939395171) ou Pedro Fontoura (936113575)."
			else If  (ShareCode.APP_DOMAIN.ToLowerCase = "uber") Then
				LOGOALT = "UBER"
				LOGOTITLE = "UBER Desinfestações "
				SUPORTE = "<b>Suporte</b><br>"
			else If  (ShareCode.APP_DOMAIN.ToLowerCase.Contains("grandative")) Then
				LOGOALT = "GrandAtive"
				LOGOTITLE = "GrandAtive "
				SUPORTE = "<b>Suporte</b><br>"
			Else
				LOGOALT = $"${ShareCode.APP_DOMAIN.ToUpperCase}"$
				LOGOTITLE = $"${ShareCode.APP_DOMAIN.ToUpperCase} "$
				SUPORTE = "<b>Suporte</b><br>"
			End If

			If RecordCount > 0 Then
				Dim newHTML As String = $"<!DOCTYPE html>
				<html xmlns="http://www.w3.org/1999/xhtml"> <head>  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
				<title>${LOGOTITLE}</title>  <meta name="viewport" content="width=device-width, initial-scale=1.0"/></head><body style="margin: 0; padding: 0;">
				<table align="center" border="0" cellpadding="0" cellspacing="0" width="60%">    <tr> <td bgcolor="f00000">&nbsp;</td>
				</tr> <tr><td bgcolor="#fff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				<img src="${LOGO}" alt="${LOGOALT}">${LOGOTITLE}</td></tr><tr>
				<td bgcolor="#fff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				<p><b>ID de ação:</b> ${actions_tagcode}</p><p><b>Nº Inspecção:</b> ${request_tagcode} &nbsp&nbsp 
				</p> <p> <b>Contrato:</b> ${reference} </p> </td></tr>technical_tagcode<tr>
				<td bgcolor="#ffffff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				<table border="1" cellpadding="10" > <tr><td style="width: 25%">Modificado por</td>
				<td style="width: 75%">${technical_name}</td> </tr><tr><td>Data de Modificação</td><td>${updated_at}</td>
				</tr><tr><td>Descrição da Intervenção</td> <td>${details}</td> </tr><tr><td>Estado da Ação</td><td>${status_name}</td>
				</tr> <tr> <td>Data Vencimento</td> <td>${due_date}</td> </tr> <tr> <td>Prioridade</td> <td>${priority_name}</td>
				</tr>  <tr> <td>Gravidade</td> <td>${gravity_name}</td>  
				</tr>gravity_name<tr> <td>Tipo Ação</td> <td>${operation_name}</td> </tr> </table> </td> </tr> <tr>
				<td bgcolor="#ffffff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				${SUPORTE}
				</td> </tr> <tr> <td bgcolor="f00000">&nbsp;</td> </tr> </table> </body> </html>"$
			End If
		
			Log(newHTML)
			Dim imgList As List
			imgList.initialize
		
			Try
				Utils.SendEmailExt(dlgASEmails.Text, "", dlgASSubject.Text, newHTML, imgList)
			Catch
				Log(LastException)
			End Try
			Sleep(250)
		End If
	
		
		Dim params As Map
		params.Initialize
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", this.Request)
		params.Put("ACLAAction", this.Action)
		params.Put("ACLATask", this.Task)
		params.Put("ACLAItem", this.Item)
		params.Put("ACLAUniqueKey", this.UniqueKey)
		params.Put("ASUITagcode", theTagcode)
		params.Put("ACLAExecuteAction", asTagcode)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("ACLARepeatField", this.repeatfieldcounter)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/as/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, activ, Url, "", this.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(550)
		
		Dim actiondatetime As String = Utils.GetCurrDatetime
		Dim emailsentdate As String = actiondatetime
		Dim params As Map
		params.Initialize
		params.Put("_token", ShareCode.APP_TOKEN)
'		params.Put("ASRequest", this.Request)
'		params.Put("ASAction", this.Action)
'		params.Put("ASTask", this.Task)
'		params.Put("ASItem", this.Item)
'		params.Put("ASUniqueKey", this.UniqueKey)
'		params.Put("ASUITagcode", theTagcode)
		params.Put("ASTagcode", asTagcode)
		params.Put("ASTitle", dlgASSubject.Text)
		params.Put("ASDetails", dlgASDetails.Text)
		params.Put("ASPriority", Utils.getASPriority(dlgASPriority.SelectedIndex+1))
		params.Put("ASUrgency", Utils.getASUrgency(dlgASUrgency.SelectedIndex+1))
		params.Put("ASAssigned", ShareCode.SESS_OPER_User)
		params.Put("ASAssignedType", 0)
		params.Put("ASStatus", Utils.getASStatus(dlgASStatus.SelectedIndex+1))
		params.Put("ASEmailDatetime", emailsentdate)
		params.Put("ASEmailSent", sendTheEmail) ', Utils.Bool2Int(sendTheEmail))  'Utils.Bool2Int(EmailSentOnNewAS))
		params.Put("ASEmailTo", dlgASEmails.Text)
		params.Put("ASEmailRelatedTask", "")
		params.Put("ASEmailRelatedAction", "")
		params.Put("ASDueDate", dlgASDueDate.Text)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("ACLARepeatField", this.repeatfieldcounter)
		params.Put("ACLACreation", dtupd)
		params.Put("ACLATagcodeTPA", tagcodeTPA)
		params.Put("ACLAGroupTPA", groupTPA)
		params.Put("ACLANew", Utils.Bool2Int(IsNew))
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/as/edit"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, activ, Url, "", this.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(550)

		'CallSubDelayed3(requests3, "Return2CLAI", this, 1)
		CallSubDelayed3(activ, "Return2CLAI", this, 1)
		If Not(parentDialog = Null) Then
			parentDialog.CloseDialog(DialogResponse.POSITIVE)
		End If
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
	
	dlgASEmailsCC.Text = $"alertas@${ShareCode.APPL_HOST}"$
	dlgASEmailsSubject.Text = $"Ref: ${this.Request} - ${this.Title}"$
	dlgASDetails.Text = obs
	
	dlgASEmails.Text = ""

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		origin.CloseDialog(DialogResponse.POSITIVE)
		
		Dim SignatureHtml As String = ShareCode.APP_Company_Name
		If (ShareCode.APP_DOMAIN.ToLowerCase = "brasfone") Then
			Dim SignatureHtml As String = ""
		End If

		Dim HTML As String = $"<html><body>
		<p><h4><strong>Acção/Informação</strong></h4><br><br>
		<strong>Detalhe</strong><br>
		${dlgASDetails.Text}<br></p>
		<p>A equipa ${SignatureHtml}</>
		</body></html>"$
		Utils.SendEmailExt(dlgASEmails.Text, dlgASEmailsCC.Text, dlgASEmailsSubject.Text, HTML, imgList)

		'CallSubDelayed3(requests, "Return2CLAI", this, 1)
	End If
End Sub

'*************************************************************************************
' TAREFA DEMO VERIFICAÇÃO DE VIATURA
'*************************************************************************************
'this As RequestCLAItem, asTagcode As String, origin As CustomLayoutDialog, obs As String, imgList As List
Sub GetFastActionDialog(activ As Activity, CLAItem As RequestCLAItem, title As String, quest As String, tagcode As String, _
		actstate As Int, disableAll As Boolean, Record As CarObject )
	
	FastOptionCheck = actstate
	CurrentActivity = activ
	CurrentCLAItem = CLAItem
	CurrentCLAItem.Answer = quest
	Dim sf As Object = ApplDialog.ShowAsync(title, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	'Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		ApplDialog.SetSize(95%x, 80%x)
	Else
		ApplDialog.SetSize(95%x,40%y)
	End If

	Wait For (sf) Dialog_Ready(pnl As Panel)
	
'	CLAItemsList
	pnl.LoadLayout("CLA_ITEM_TaskSimple")
	pnl.Tag = tagcode
	
	IsFastOptionCheck = True
	ObjectTagcode = Record.obj 'Record.GetString("object_tagcode")
	'ObjectTagcode
	
	Dim YesNO_2_Height As Int = 80dip
	Dim YesNO_Height As Int = 60dip
	If(ShareCode.ISPHONE) Then
		YesNO_2_Height = 90dip
		YesNO_Height = 90dip
	End If
		
	Dim p2 As Panel
	p2.Initialize("CLALineClick")

	CurrentActivity.AddView(p2, 0, 0, 100%x, YesNO_2_Height)
	p2.LoadLayout("CLA_ITEM_TaskSimple_YesNO_2")
	p2.RemoveView
	p2.Tag = tagcode
	CLAItemLabel.Text = "Introduza/actualize os Kilometros"
	Dim rKm As Long = Record.km ' Record.GetInt("kilometers")
	CLAItemEditValue.EditText.InputType = CLAItemEditValue.EditText.INPUT_TYPE_NUMBERS
	CLAItemEditValue.Text = rKm
	CLAItemsList.Add(p2, "")
	
	Dim p1 As Panel
	p1.Initialize("CLALineClick")
	CurrentActivity.AddView(p1, 0, 0, 100%x, YesNO_Height)
	p1.LoadLayout("CLA_ITEM_TaskSimple_YesNO")
	p1.RemoveView
	p1.Tag = tagcode
	CLAItem_G1.Text = quest
	If (actstate = 1) Then
		CLAItemButton_1.State = 1
	Else If (actstate = 2) Then
		CLAItemButton_2.State = 1
	End If
	CLAItemButton_1.Tag = tagcode
	CLAItemButton_2.Tag = tagcode
	If (disableAll) Then
		CLAItemButton_1.Enabled = False
		CLAItemButton_2.Enabled = False
	End If
	If (CLAItem.Value = "GET_MORE_ACTIONS") Then
		listButMoreActionInner_Click
	End If
	CLAItemsList.Add(p1, "")
	'Record.Close

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		
		Dim istatus As Int = 0
		If (CLAItemButton_1.State = 1) Then 
			istatus = 1
		else if (CLAItemButton_2.State = 1) Then
			istatus = 2
		End If
		
		Try
			Dim currdate As String = Utils.GetCurrentDate
			Dim sSQL As String = $"update alerts set kilometers=${CLAItemEditValue.Text}, verification_date='${currdate}', status_id=2, itemstatus=${istatus}, notes='${Master_OBS}', image='${Master_Image}' where tagcode='${tagcode}'"$
			Starter.LocalSQL.ExecNonQuery(sSQL)
		Catch
			Log(LastException)
		End Try
		
		Dim currdate As String = Utils.GetCurrentDate
		Dim sSQL As String = $"update dta_objects_fields set value=${CLAItemEditValue.Text} where object_tagcode='${Record.obj}' and field_tagcode='FIELD_KM'"$
		Utils.SaveSQLToLog("GetFastActionDialog",sSQL, "")
		'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		Dim sSQL As String = $"update dta_objects_fields set value=${currdate} where object_tagcode='${Record.obj}' and field_tagcode='FIELD_DATAKM'"$
		Utils.SaveSQLToLog("GetFastActionDialog",sSQL, "")
		'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
		
		Dim params As Map
		params.Initialize
		params.Clear
		params.Put("_token", ShareCode.APP_TOKEN)
		params.Put("ACLARequest", CLAItem.Request)
		params.Put("ACLAAction", CLAItem.Action)
		params.Put("ACLATask", CLAItem.Task)
		params.Put("ACLAItem", CLAItem.Item)
		params.Put("ACLAObject", ObjectTagcode)
		params.Put("ACLAKeyKM", $"${CLAItemEditValue.Text}"$)
		params.Put("ACLAKeyDate", currdate)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
'		params.Put("ACLADatetime", sACLADatetime)
'		params.Put("ACLALatitude", sACLALatitude)
'		params.Put("ACLALongitude", sACLALongitude)
		
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla-md/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, Me, Url, "", CLAItem.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CLAItem.Request.Trim,CLAItem.Task.Trim,CLAItem.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)
		'FIELD_KM
		'FIELD_DATAKM
		
'		origin.CloseDialog(DialogResponse.POSITIVE)
'
'		Dim HTML As String = $"<html><body>
'		<p><h4><strong>Acção/Informação</strong></h4><br><br>
'		<strong>Detalhe</strong><br>
'		${dlgASDetails.Text}<br></p>
'		<p>A equipa ${ShareCode.APP_Company_Name}</>
'		</body></html>"$
'		Utils.SendEmailExt(dlgASEmails.Text, dlgASEmailsCC.Text, dlgASEmailsSubject.Text, HTML, imgList)

		'CallSubDelayed3(requests, "Return2CLAI", this, 1)
		
		
	End If
End Sub

Sub listButMoreActionInner_Click
	'
	Dim filename As String = $"Base_${ObjectTagcode}.png"$
	If File.Exists(Starter.InternalFolder, filename) Then
		Try
			File.Delete(Starter.InternalFolder, filename)
		Catch
			Log(LastException)
		End Try
	End If
	
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.GetMoreActionsDialog(CurrentActivity, "User", CurrentCLAItem, 0, ObjectTagcode, "", 0, PressedAnswerTagCode, "", "",0)
End Sub

Sub CLAItemButton_StateClick (State As Int)
	Dim btn As B4XStateButton = Sender
	Log(btn.Tag)
	FastOptionCheck = 1
	If ((btn.Tag = "TSKT-0003") And (btn.Reference = "2")) Then
		FastOptionCheck = 2
		Dim sSQL As String = $"update alerts set status_id=2, itemstatus=${FastOptionCheck} where tagcode='${btn.Tag}'"$
		Starter.LocalSQL.ExecNonQuery(sSQL)
		Dim Filter As AppActionDialogs
		Filter.Initialize
		Filter.GetMoreActionsDialog(CurrentActivity, "User", CurrentCLAItem, 0, ObjectTagcode, "", 0, PressedAnswerTagCode, "", "",0)
	Else
		Dim sSQL As String = $"update alerts set status_id=2, itemstatus=${FastOptionCheck} where tagcode='${btn.Tag}'"$
		Starter.LocalSQL.ExecNonQuery(sSQL)
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
	DeleteImageFromList(thisPanel, this, fname)
End Sub

Sub DeleteImageFromList(thisPanel As B4XView, this As RequestCLAItem, fname As Label)
	
	Dim Index As Int = ItemImages.GetItemFromView(thisPanel)
	If (this.BaseImage = 1) Then
		MsgboxAsync("A imagem seleccionada é uma imagem BASE e não pode ser apagada!", "Alerta!")
	Else
		
		Dim i As Int = Msgbox2(ShareCode.CLAImageRemove, ShareCode.GeneralAlertTitle, ShareCode.Option_YES, ShareCode.Option_NO, "", Null)
		If (i=DialogResponse.POSITIVE) Then
			'Dim thisPanel As B4XView = ItemImages.GetPanel(Index)
			Dim this As RequestCLAItem = thisPanel.Tag
			Dim fname As Label = thisPanel.GetView(1)
			'imageb64|imagename
			Dim sSQL As String = $"delete from dta_requests_values_images where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and
									item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}' and tagcode='${this.Tagcode}' and imagename='${fname.Text}'
									And repeatcounter=${this.RepeatCounter}
									And repeatitemcounter=${this.RepeatItemCounter}
									And repeatfieldcounter=${this.repeatfieldcounter}"$

			Utils.SaveSQLToLog("ItemImages_ItemLongClick",sSQL, this.Request)
			'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
			Log(sSQL)
			ItemImages.RemoveAt(Index)
			Dim listviewIndex As Int = AssociateImagesCompleteList.IndexOf(fname.Text)
			AssociateImagesCompleteList.RemoveAt(listviewIndex)
			

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
			params.Put("versionTagcode", Main.VersionTagcode)
			params.Put("_authorization", Main.DeviceAuthorization)
			params.Put("_instance", Main.DeviceInstance)
			params.put("_deviceBrand", Main.DeviceBrand)
			params.put("_deviceModel", Main.DeviceModel)
			params.put("_deviceMacAddress", Main.DeviceMacAddress)
			params.Put("_user", ShareCode.SESS_User)
			If (params.IsInitialized) Then
'				Utils.CallApi(0, params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/delete"$, "")
				
				Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/img/delete"$
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Utils.CallApi(0, params, Me, Url, "", this.Request)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
					Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
				End If
				Sleep(250)
			End If
		End If
		
	End If
End Sub

Sub CLAItemsList_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub ItemNotes_FocusChanged (HasFocus As Boolean)
	Dim curr As EditText = Sender
	If Not(HasFocus) Then
		Dim this As RequestCLAItem = curr.tag
		
		CurrentItemNotesText = Utils.IfNullOrEmpty(CurrentItemNotesText, ItemNotes.Text)
		Log($"CurrentItemNotesText:${CurrentItemNotesText}"$)
		
		If (Utils.NNE( this.Tagcode)) Then
			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${this.Request.Trim}' 
				and task_tagcode='${this.Task.Trim}' 
				and item_tagcode='${this.Item.Trim}' 
				and unique_key='${this.UniqueKey.Trim}' 
				and tagcode='${this.Tagcode.Trim}' 
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}"$ 
		Else
			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
				where request_tagcode='${this.Request.Trim}' 
				and task_tagcode='${this.Task.Trim}' 
				and item_tagcode='${this.Item.Trim}' 
				and unique_key='${this.UniqueKey.Trim}' 
				and repeatcounter=${this.RepeatCounter}
				and repeatitemcounter=${this.RepeatItemCounter}"$ 
		End If
		Utils.SaveSQLToLog("ItemNotes_FocusChanged",sSQL, this.Request)
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
		params.Put("ACLAObs", CurrentItemNotesText)
		params.Put("ACLAReqCounter", this.RepeatCounter)
		params.Put("ACLARepeatItem", this.RepeatItemCounter)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
'		Utils.CallApi(0, params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$, "")
		
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, Me, Url, "", this.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(500)
	End If
	
End Sub

Sub ItemNotes_TextChanged (Old As String, New As String)
	
	CurrentItemNotesText = ItemNotes.Text
	
	'Dim curr As EditText = Sender
'	If (Old <> New) Then
'		CurrentItemNotesText = New
'		Dim this As RequestCLAItem = CurrentRequestCLAItem
''		Dim sSQL As String = $"update dta_requests_values set execute_notes='${New}'
''				where request_tagcode='${this.Request}' and task_tagcode='${this.Task}' and 
''				item_tagcode='${this.Item}' and unique_key='${this.UniqueKey}'"$ ' and tagcode='${this.Tagcode}'"$	
'				
'		If (Utils.NNE( this.Tagcode)) Then
'			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
'				where request_tagcode='${this.Request.Trim}' 
'				and task_tagcode='${this.Task.Trim}' 
'				and item_tagcode='${this.Item.Trim}' 
'				and unique_key='${this.UniqueKey.Trim}' 
'				and tagcode='${this.Tagcode.Trim}' 
'				and repeatcounter=${this.RepeatCounter}
'				and repeatitemcounter=${this.RepeatItemCounter}"$ 
'		Else
'			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
'				where request_tagcode='${this.Request.Trim}' 
'				and task_tagcode='${this.Task.Trim}' 
'				and item_tagcode='${this.Item.Trim}' 
'				and unique_key='${this.UniqueKey.Trim}' 
'				and repeatcounter=${this.RepeatCounter}
'				and repeatitemcounter=${this.RepeatItemCounter}"$ 
'		End If
'		Log(sSQL)
'		Utils.SaveSQLToLog("ItemNotes_TextChanged",sSQL, this.Request)
'		'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
'			
'		Dim params As Map
'		params.Initialize
'		params.Clear
'		params.Put("_token", ShareCode.APP_TOKEN)
'		params.Put("ACLRequest", this.Request)
'		params.Put("ACLAction", this.Action)
'		params.Put("ACLTask", this.Task)
'		params.Put("ACLItem", this.Item)
'		params.Put("ACLUniqueKey", this.UniqueKey)
'		params.Put("ACLTagcode", this.Tagcode)
'		params.Put("ACLAObs", CurrentItemNotesText)
'		params.Put("ACLAReqCounter", this.RepeatCounter)
'		params.Put("ACLARepeatItem", this.RepeatItemCounter)
'		
''		Utils.CallApi(0, params, Me, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$, "")
'		
'		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
'		If Not(ShareCode.APP_WORKING_LOCAL) Then
'			Utils.CallApi(0, params, Me, Url, "")
'		Else
'	Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
'			Utils.save2update(Url, Utils.MapToJson(params), 0, workernd)
'		End If
'		Sleep(500)
'	End If
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
	Filter.getObjectSelectDialog(CurrentActivity, ThisActivityName_TaskListDialog, "Selecção de Objecto", Local)
	
End Sub

Sub takeGeoPhoto_Click
'	CallSub(CheckList3, "OpenPicturesMapDialog")
'	Dim Filter As AppDialogs
'	Filter.Initialize
'	Filter.getPicturesMapDialog(Me)
'	StartActivity(MapsActivity)
'	ShareCode.FadeInFadeOutAnimation
	Dim RecordRow As Cursor
	Dim Latitude As String = ""
	Dim Longitude As String = ""


	If(Utils.NNE( CurrentCLAItem.Tagcode)) Then
		Dim sSQLL As String = $"select execute_latitude, execute_longitude from dta_requests_values
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and tagcode='${CurrentCLAItem.Tagcode.Trim}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}
				and repeatfieldcounter=${CurrentCLAItem.repeatfieldcounter}"$ 
	Else
		Dim sSQLL As String = $"select execute_latitude, execute_longitude from dta_requests_values
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}
				and repeatfieldcounter=${CurrentCLAItem.repeatfieldcounter}"$ 
	End If
	
	

	'Dim NCs As Int = 0
	RecordRow = Starter.LocalSQLEVC.ExecQuery(sSQLL)
	If RecordRow.RowCount > 0 Then
		RecordRow.Position = 0
		Latitude = RecordRow.GetString("execute_latitude")
		Longitude = RecordRow.GetString("execute_longitude")
	End If
   
   
	If(Utils.NNE(Latitude) And Utils.NNE(Longitude)) Then		   

		If (Utils.NNE( CurrentCLAItem.Tagcode)) Then
			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
					where request_tagcode='${CurrentCLAItem.Request.Trim}' 
					and task_tagcode='${CurrentCLAItem.Task.Trim}' 
					and item_tagcode='${CurrentCLAItem.Item.Trim}' 
					and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
					and tagcode='${CurrentCLAItem.Tagcode.Trim}' 
					and repeatcounter=${CurrentCLAItem.RepeatCounter}
					and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
		Else
			Dim sSQL As String = $"update dta_requests_values set execute_notes='${CurrentItemNotesText}'
					where request_tagcode='${CurrentCLAItem.Request.Trim}' 
					and task_tagcode='${CurrentCLAItem.Task.Trim}' 
					and item_tagcode='${CurrentCLAItem.Item.Trim}' 
					and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
					and repeatcounter=${CurrentCLAItem.RepeatCounter}
					and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}"$ 
		End If
		Utils.SaveSQLToLog("takePhoto_Click",sSQL, CurrentCLAItem.Request)
		'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
		Log(sSQL)
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
		params.Put("ACLAObs", CurrentItemNotesText)
		params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
		params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
		params.Put("versionTagcode", Main.VersionTagcode)
		params.Put("_authorization", Main.DeviceAuthorization)
		params.Put("_instance", Main.DeviceInstance)
		params.put("_deviceBrand", Main.DeviceBrand)
		params.put("_deviceModel", Main.DeviceModel)
		params.put("_deviceMacAddress", Main.DeviceMacAddress)
		params.Put("_user", ShareCode.SESS_User)
		Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
		If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
			Utils.CallApi(0, params, Me, Url, "", CurrentCLAItem.Request)
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CurrentCLAItem.Request.Trim,CurrentCLAItem.Task.Trim,CurrentCLAItem.Item.Trim)
			Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
		End If
		Sleep(250)	
		
		Dim location As Map
		location.Initialize
		location.Put("latitude", Latitude)
		location.Put("longitude", Longitude)
		
		ShareCode.CalledFromAlerts = False
		CallSubDelayed3(MapsActivity, "StartMapsActivity",CurrentCLAItem, location)
		
	Else
		ToastMessageShow("Esta pergunta não tem localização disponível", True)
		
	End If
End Sub

Sub CreateAssociateImagesFromObjectPanel(this As RequestCLAItem, filename As String, btm As String, state As Int, innerTag As String) As B4XView
	Dim p As Panel
	p.Initialize("") 'ImageViewEdit")
'	Dim width As Int = 130dip
'	If (ShareCode.DEVICE_ORIENTATION = 1) Then
'		width = 200dip
'	End If
	CurrentActivity.AddView(p, 0, 0, 100%x,130dip)
	p.LoadLayout("object_image_item")
	p.RemoveView
	
	If (Utils.NNE(btm)) Then
		ItemImageView.SetBackgroundImage(Utils.B64ToBitmap(btm))
		btnAssociateImage.Tag = filename
	End If
	
'	If(AssociateImageSelected(filename)) Then
'		btnAssociateImage.State = Consts.ITEM_SELECTED
'	End If
	
'	InnerSignatureName.Text = filename
'	InnerSignatureInfo.Text = innerTag
	
'	If (this.OnReport = 1) Then
'		InnerSignatureOnReport.TextColor = Consts.ColorGreen
'	End If
	ItemImageView.Tag = this
'	InnerSignatureOnReport.Tag = this
'	InnerSignatureRemove.Tag = this
'	InnerSignatureInfo.Tag = this
	
	p.Tag = this
	Return p
End Sub

Sub CreateAssociateImagesFromObjectPanelTitle(this As RequestCLAItem, title As String) As B4XView
	Dim p As Panel
	p.Initialize("") 'ImageViewEdit")
'	Dim width As Int = 260dip
'	If (ShareCode.DEVICE_ORIENTATION = 1) Then
'		width = 200dip
'	End If
	CurrentActivity.AddView(p, 0, 0, 100%x, 75dip)
	p.LoadLayout("object_image_title")
	p.RemoveView
	lblObjectImageTitle.Text = title
'	lblObjectImageTitle.Width = 100%x
'	If (Utils.NNE(btm)) Then
'		ItemImageView.SetBackgroundImage(Utils.B64ToBitmap(btm))
'		btnAssociateImage.Tag = filename
'	End If
'	InnerSignatureName.Text = filename
'	InnerSignatureInfo.Text = innerTag
	
'	If (this.OnReport = 1) Then
'		InnerSignatureOnReport.TextColor = Consts.ColorGreen
'	End If
'	ItemImageView.Tag = this
'	InnerSignatureOnReport.Tag = this
'	InnerSignatureRemove.Tag = this
'	InnerSignatureInfo.Tag = this
	
	p.Tag = this
	Return p
End Sub

Sub AddMoreImagesToObject( act As Activity, this As RequestCLAItem, list As List)
	Dim sf As Object = ApplDialog.ShowAsync("Associar Imagens", "Adicionar", ShareCode.Option_CANCEL, "", Null, False)
	CurrentActivity = act
	AssociateImagesCompleteList = list
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		ApplDialog.SetSize(100%x, 100%y)
	Else
		ApplDialog.SetSize(100%x, 100%y)
	End If
	
	Dim PhotoNums0 As Int = 0
	Dim PhotoNums1 As Int = 1
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_object_image")
	
	
	Dim RecordRow As Cursor
	Dim tagcode As String = ""
	Dim sSQLL As String = $"select object_tagcode from dta_requests
				where tagcode='${this.Request.Trim}'"$ 
	
	AvisoNoImages.Visible = False

	RecordRow = Starter.LocalSQLEVC.ExecQuery(sSQLL)
	Log(sSQLL)
	If RecordRow.RowCount > 0 Then
		
		RecordRow.Position = 0
		tagcode = RecordRow.GetString("object_tagcode")
		
		Private Record2 As Cursor
	
		Dim SQL As String = $"select 1 as child, object_tagcode as tagcode, image, filename, title, sess_user, created_at
								from dta_objects_images where object_tagcode='${tagcode}' and (filename is not null and filename<>'')
								union
								select 0 as child, tagcode, image, filename, title_import as title, '' as sess_user, created_at
								from dta_objects where tagcode='${tagcode}' and (filename is not null and filename<>'')
								order by child"$
		Log(SQL)
		Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record2.RowCount > 0 Then
			PhotoNums0 = Record2.RowCount
			ObjectsImages.Add(CreateAssociateImagesFromObjectPanelTitle(this, "Imagens do Objecto"), "")
			Dim row As Int = 0
			For i=0 To Record2.RowCount-1
				Record2.Position = i
				
				Dim Filename As String = Utils.IfNullOrEmpty(Record2.GetString("filename"), "")
				If Utils.NNE(Filename) Then
					If File.Exists(Starter.InternalFolder, Filename) Then
						Try
							Dim Base64Con As Base64Convert
							Base64Con.Initialize
							Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, Filename)
							ObjectsImages.Add(CreateAssociateImagesFromObjectPanel(this, Filename, image, 0, ""), "")
						Catch
							Log(LastException.Message)
						End Try
					End If
				Else
				End If
			Next
		Else
		End If
		Record2.Close
	Else
		PhotoNums0 = 0	
	End If




	Dim cDate As String = Utils.GetLastWeekDate
	
	Dim SQL As String = $"select distinct ifnull(a.tagcode,'') as tagcode, ifnull(a.title,'') as title,
			ifnull(a.date_verification,'') as date_verification, a.status_id, a.kind_data, a.id,
			(select obs from dta_alerts_images where tagcode=a.tagcode) as obs,
			(select imagename from dta_alerts_images where tagcode=a.tagcode) as imagename
			from dta_alerts as a
			where a.alert_visible=1 
				and a.user_tagcode='${ShareCode.SESS_OPER_User}' 
				and a.active=1 
				and a.date_alert>='${cDate}'"$  

	Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	
	Dim nRows As Int = Record.RowCount
	PhotoNums1 = Record.RowCount
	If nRows > 0 Then
		ObjectsImages.Add(CreateAssociateImagesFromObjectPanelTitle(this, "Imagens das Tarefas"), "")
		For row = 0 To Record.RowCount-1
			Record.Position = row
			Dim imagename As String =  Utils.IfNullOrEmpty(Record.GetString("imagename"),"")
			If Utils.NNE(imagename) Then
				If File.Exists(Starter.InternalFolder, imagename) Then
					Try
						Dim Base64Con As Base64Convert
						Base64Con.Initialize
						Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, imagename)
						ObjectsImages.Add(CreateAssociateImagesFromObjectPanel(this, imagename, image, 0, ""), "")
					Catch
						Log(LastException)
					End Try
				End If
			Else
			End If
		Next
	Else
		PhotoNums1 = 0
	End If
	Record.Close
	
	If PhotoNums0 = 0 And PhotoNums1 = 0 Then
		AvisoNoImages.Text = "Não existem imagens para associar !"
		AvisoNoImages.Visible = True
	End If

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		SaveImages(this)
	Else If res = DialogResponse.CANCEL Then
		CallSub2(CheckList3, "CamImage2", this)
	End If
End Sub

Sub showObjectGallery_Click
    ApplActionDialog.CloseDialog(DialogResponse.POSITIVE)
	Dim Filter As AppActionDialogs
	Filter.Initialize
	Filter.AddMoreImagesToObject(CurrentActivity,CurrentCLAItem, AssociateImagesCompleteList)
End Sub

Sub btnAssociateImage_StateClick (State As Int)
	Dim Button As B4XStateButton = Sender
	Dim imageName As String = Button.Tag
	If State = Consts.ITEM_SELECTED Then
		Dim listviewIndex As Int = AssociateImagesCompleteList.IndexOf(imageName)
		If Not(listviewIndex > -1)  Then
			AssociateImagesList.Add(imageName)
		Else
			ToastMessageShow("Esta imagem já foi adicionada á lista", True)
			Button.State = 0
		End If		
	Else
		Dim index As Int = AssociateImagesList.IndexOf(imageName)
		AssociateImagesList.RemoveAt(index)
	End If
End Sub

Sub AssociateImageSelected(imageName As String) As Boolean
	If AssociateImagesCompleteList.IndexOf(imageName) > -1 Then
		Return True
	End If
	Return False
End Sub

Sub SaveImages(this As RequestCLAItem) As ResumableSub
	
	CurrentCLAItem = this
	Dim obj As String = this.TagObject
	Dim params As Map
	Dim params33 As Map
	If (AssociateImagesList.Size >0) Then
		ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos, False)
		For nFile=0 To AssociateImagesList.Size-1
			Dim FileName As String = AssociateImagesList.Get(nFile) 'Types.MakeShotFoto(ShotFileName, DateTimeName, la, lo, NewDateTimeName)
			If Not(Utils.isNullOrEmpty(FileName)) Then
'				If Not(FileName.IndexOf(".png") >= 0) Then
'					FileName = $"${FileName}.png"$
'				End If
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
				'',
				'',
				'')"$
						
				Utils.SaveSQLToLog("SaveImages",sSQL, this.Request)
		
'				If (Utils.NNE(obj)) Then
'					Dim v As Int = Utils.DBDataCount(Starter.LocalSQLEVC, $"select count(0) as COUNTER from dta_objects_images "$) +1 + 100000
'					Dim sSQL As String = $"insert into dta_objects_images (id, object_tagcode, image, filename)
'					values (${v}, '${obj}', '${ImgB64}', '${FileName}')"$
''					Utils.SaveSQLToLog("CameraReturn",sSQL, this.Request)
'					'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
'			
'					params33.Initialize
'					params33.Clear
'					params33.Put("_token", ShareCode.APP_TOKEN)
'					params33.Put("ACLATagcode", obj)
'					params33.Put("ACLAValueImage", ImgB64)
'					params33.Put("ACLAValueFileImage", FileName)
'			
'				End If
		
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
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.Trim,this.Task.Trim,this.Item.Trim)
					Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
				End If
				Sleep(250)
		
		
				If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
					Try
						Dim upl As ResumableSub = UploadFilesWithFTPCamImage(FileName)
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
				If Not(ShareCode.APP_WORKING_LOCAL) Then
					Utils.CallApi(0, params33, Me, Url, "", this.Request)
				Else
					Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,this.Request.trim,this.Task.trim,this.Item.trim)
					Utils.save2update(Url, Utils.MapToJson(params33), 0, WorkerND)
				End If
				Sleep(250)
			End If
			'CallSub(CameraActivity, "CloseActivity")
			
'			ItemImages.Refresh
		Next
		
		ProgressDialogHide
	End If
'	Sleep(2000)
	CallSub2(CheckList3, "CamImage2", CurrentCLAItem)
	Return True
End Sub

Sub UploadFilesWithFTPCamImage(filename As String )  As ResumableSub
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


'====================================================================================================
'	ATUALIZAÇÃO DE NOTAS
'====================================================================================================
Sub UpdateNotesToServer(Tagcode As String, ItemNotesText As String)
	
	If (Utils.NNE(Tagcode)) Then
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${ItemNotesText}'
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and tagcode='${Tagcode}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}
				and repeatfieldcounter=${CurrentCLAItem.repeatfieldcounter}"$ 
	Else
		Dim sSQL As String = $"update dta_requests_values set execute_notes='${ItemNotesText}'
				where request_tagcode='${CurrentCLAItem.Request.Trim}' 
				and task_tagcode='${CurrentCLAItem.Task.Trim}' 
				and item_tagcode='${CurrentCLAItem.Item.Trim}' 
				and unique_key='${CurrentCLAItem.UniqueKey.Trim}' 
				and repeatcounter=${CurrentCLAItem.RepeatCounter}
				and repeatitemcounter=${CurrentCLAItem.RepeatItemCounter}
				and repeatfieldcounter=${CurrentCLAItem.repeatfieldcounter}"$ 
	End If
	Utils.SaveSQLToLog("takeAS_Click",sSQL, CurrentCLAItem.Request)
	'Starter.LocalSQLEVC.ExecNonQuery($"${sSQL}"$)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLRequest", CurrentCLAItem.Request)
	params.Put("ACLAction", CurrentCLAItem.Action)
	params.Put("ACLTask", CurrentCLAItem.Task)
	params.Put("ACLItem", CurrentCLAItem.Item)
	params.Put("ACLUniqueKey", CurrentCLAItem.UniqueKey)
	params.Put("ACLTagcode", Tagcode)
	params.Put("ACLAObs", ItemNotesText)
	params.Put("ACLAReqCounter", CurrentCLAItem.RepeatCounter)
	params.Put("ACLARepeatItem", CurrentCLAItem.RepeatItemCounter)
	params.Put("ACLARepeatField", CurrentCLAItem.repeatfieldcounter)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai/obs/update"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not(ShareCode.IsInCheckExecution)) Then
		Utils.CallApi(0, params, Me, Url, "", CurrentCLAItem.Request)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(1,CurrentCLAItem.Request.Trim,CurrentCLAItem.Task.Trim,CurrentCLAItem.Item.Trim)
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(250)
End Sub
