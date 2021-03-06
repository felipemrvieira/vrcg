B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Public Device As Phone
	Private xui As XUI
End Sub

Sub Globals
	
'	is_group_report

	Private butClose As Button
	Private listsBasePanel As Panel
	Private ReportPanel As Panel
	Private ColorTabPanel As Panel
	Private ReportView As WebView
	Private ReportProgress As ProgressBar
	Private listsBottomPanel As Panel
	Private listsBottomLine As Panel
	Private EditSearch As EditText
	Private butSearch As Button
	Private butSendReport As Button
	Private Label1 As Label
	Private ListEmailTemplate As Spinner
	Private listsTopBar As Panel
	Private mainLabelOptLists As Label
	Private mainTopLine As Panel
	Private mainLogo As ImageView
	Private mainActiveUser As Label
	Private butReGenerate As Button
	Private DialogConditionAreValid As Boolean = True
	Private SendEmailApplDialog As CustomLayoutDialog
	
	Private dlgASDetails As EditText 'FloatLabeledEditText
	Private dlgASEmailsSubject As FloatLabeledEditText
	Private dlgASEmailsCC As FloatLabeledEditText
	Private dlgASEmails As FloatLabeledEditText
	
	Private GRANDACTIVE_INSTANCE As String = "PT20180913-2105-006"
	Private SIMGRANDACTIVE_INSTANCE As String = "PT20180913-2106-006"
	
	Private RESOPRE_INSTANCE As String = "PT20191121-1009-001"
	Private AGRUPADOR_INSTANCE As String = ""
	Private CurrentCLA As RequestData
	Private CurrentRCLA As RequestCLA
	Private CurrentFile As String = ""
	
	Private CLOrigin As Boolean = False
	Private ThisReportDate As String = ""
	Private MarkXValue1 As String = ""
	Private MarkXValue2 As String = ""
	Private MarkXValue3 As String = ""
	Private MarkXValue4 As String = ""
	Private MarkXValue5 As String = ""
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Starter.CurrentWorkActivity = Me
	Dim userPage As String = "report_generator"
	
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	
	Activity.LoadLayout(userPage)
	butSendReport.Enabled = Utils.Int2Bool(ShareCode.DEVICE_PARAM_SENDREPORT)
	butSendReport.Visible = Utils.Int2Bool(ShareCode.DEVICE_PARAM_SENDREPORT)
	ListEmailTemplate.Add("Modelo de email Standard")
	If ShareCode.APP_DOMAIN.ToLowerCase.contains("grandative") Then
		ListEmailTemplate.Add("Modelo de email com Não Conformidades")
	End If
	CLOrigin = False
	UpdateMainLayout
	WindowStatusUpdate
End Sub

Sub UpdateMainLayout
	mainLabelOptLists.TextColor = Consts.ColorMain
	If Not(ShareCode.ISPHONE) Then
		mainLogo.Gravity = Gravity.FILL
		mainLogo.Width = Consts.LogoWidth
	End If

	Log($"Inicialização de BMP: ${ShareCode.APP_MAIN_LOGO_MINI}"$)
	If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then
		mainLogo.SetBackgroundImage(Utils.B64ToBitmap(ShareCode.APP_MAIN_LOGO_MINI))
	End If
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
End Sub

Sub WindowStatusUpdate
	If Utils.NE(ShareCode.SESS_OPER_UserName) Then
		StopService(LocationService)
		StopService(Comms)
		StopService(UserService)
		StopService(Logs)
		StartActivity(Main)
		Sleep(500)
		Activity.Finish
	End If
	Try
		mainActiveUser.Text = ShareCode.SESS_OPER_UserName
	Catch
		Log(LastException)
	End Try

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub butClose_Click
	Activity.Finish
End Sub

Sub ListEmailTemplate_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub ShowHTMLReport(CLA As RequestData, repFile As String)
	CurrentCLA = CLA
	CurrentFile = repFile
	'Sleep(100)
	If (File.Exists(Starter.SharedFolder ,$"${repFile}"$)) Then
		ProgressDialogShow2(ShareCode.reportsMsgProcessar, False)
		Sleep(50)
		Try
			ReportView.LoadHtml(File.ReadString(Starter.SharedFolder ,$"${repFile}"$))
		Catch
			Log(LastException)
			MsgboxAsync(ShareCode.reportsErroLerFicheiro, ShareCode.GeneralAlertTitle)
		End Try
		ReportProgress.Visible = False
		ProgressDialogHide
	Else
		LoadThisInternalFolderFile(repFile)
	End If

End Sub

Sub LoadThisInternalFolderFile(repFile As String)
	If (File.Exists(Starter.InternalFolder ,$"${repFile}"$)) Then
		ProgressDialogShow2(ShareCode.reportsMsgProcessar, False)
		Sleep(50)
		Try
			ReportView.LoadHtml(File.ReadString(Starter.InternalFolder ,$"${repFile}"$))
		Catch
			Log(LastException)
			MsgboxAsync(ShareCode.reportsErroLerFicheiro, ShareCode.GeneralAlertTitle)
		End Try
		ReportProgress.Visible = False
		ProgressDialogHide
	Else
'		MsgboxAsync(ShareCode.reportsErroLerFicheiro, ShareCode.GeneralAlertTitle)
		ProgressDialogHide
		ReportProgress.Visible = False
		butReGenerate_Click
	End If
End Sub

Sub ShowCLHTMLReport(CLA As RequestCLA, repFile As String)
	CLOrigin = True
	CurrentRCLA = CLA
	CurrentFile = repFile
	'Sleep(100)
	If (File.Exists(Starter.SharedFolder ,$"${repFile}"$)) Then
		ProgressDialogShow2(ShareCode.reportsMsgProcessar, False)
		Sleep(100)
		Try
			ReportView.LoadHtml(File.ReadString(Starter.SharedFolder ,$"${repFile}"$))
		Catch
			Log(LastException)
			MsgboxAsync(ShareCode.reportsErroLerFicheiro, ShareCode.GeneralAlertTitle)
		End Try
		ReportProgress.Visible = False
		ProgressDialogHide
	Else
		LoadThisInternalFolderFile(repFile)
	End If
	
End Sub

Sub butSendReport_Click
	ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
	If Not(CLOrigin) Then
		SendReportFromRequests
	Else
		SendReportFromChecklist
	End If

	ProgressDialogHide
End Sub

Sub SendReportFromRequests
	Dim theFile As String = CurrentFile
	Dim thePDFFile As String = theFile.Replace("html", "pdf")
	ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
'	Wait For(CreateReportFromHTMLToPDFFile(theFile, thePDFFile)) Complete (ReportHTMLToPDF As Boolean)
	If (ShareCode.EmailOldModel = True) Then
		Wait For(CreateReportFromHTMLToPDFFile(theFile, thePDFFile)) Complete (ReportHTMLToPDF As Boolean)
		If Not(ReportHTMLToPDF) Then
			Dim thePDFFile As String = theFile.Replace("pdf", "html")
		End If
	End If
	Log($"File to send : ${thePDFFile}"$)
	Sleep(1000)
'	If (ReportHTMLToPDF = True) Then

		Dim emails As String = ""
		Dim sSQL As String = $"Select tagcode, email from dta_contacts
					where tagcode in (Select distinct contact_tagcode from dta_objects_contacts
					where object_tagcode in (Select distinct object_tagcode from dta_requests where tagcode='${CurrentCLA.Tagcode.Trim}'))"$				
		emails = GetColValues2String(sSQL, "email", ";", "@")
		
		Dim SQLField As String = $"Select value as email from dta_objects_fields
					where field_tagcode='FIELD_EDPC_CONTRACT_MANAGER' 
					and object_tagcode in (Select distinct object_tagcode from dta_requests where tagcode='${CurrentCLA.Tagcode.Trim}')"$
		Dim emailTag As String = DBStructures.GetScriptColumnStrEVC(SQLField, "email")
		
		Dim sSQL As String = $"Select email from aut_users where tagcode='${emailTag.Trim}'"$
		emails = $"${emails}${GetColValues2String(sSQL, "email", ";", "@")}"$
		
		
		Dim SQLField As String = $"Select value as email from dta_objects_fields
						where field_tagcode='FIELD_EDPC_CONTRACT_MANPLUS' 
						and object_tagcode in (Select distinct object_tagcode from dta_requests where tagcode='${CurrentCLA.Tagcode.Trim}')"$
		Dim emailTag As String = DBStructures.GetScriptColumnStrEVC(SQLField, "email")
		
		Dim lstStr As String = Utils.StrList2SQLArray(Regex.Split("\|", emailTag))
		Dim sSQL As String = $"Select email from aut_users where tagcode in ${lstStr.Trim}"$
		Dim ccemails As String = $"${GetColValues2String(sSQL, "email", ";", "@")}"$
	
		If (Not(ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP")) Then
			Dim sSQL As String = $"Select tagcode, email from dta_contacts
					where tagcode in (Select distinct contact_tagcode from dta_objects_contacts
					where object_tagcode in (Select distinct entity_tagcode from dta_requests where tagcode='${CurrentCLA.Tagcode.Trim}'))"$
							
			emails = $"${emails}${GetColValues2String(sSQL, "email", ";", "@")}"$
		End If
		ProgressDialogHide
		Try
			GetReportSendEmailDialog(CurrentCLA.Tagcode, CurrentCLA.Entity, emails, ccemails, thePDFFile)
		Catch
			Log(LastException)
		End Try
'	End If
End Sub

Sub GetColValues2String(sSQL As String, sCol As String, sDiv As String, checkthis As String) As String
	Dim sRet As String = ""
	If Utils.NNE(sDiv) Then sDiv = ";"
	Private Record2 As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If Record2.RowCount > 0 Then
		For nn1=0 To Record2.RowCount-1
			Record2.Position = nn1
			
			Dim eml As String = Utils.IfNullOrEmpty(Record2.GetString(sCol), "")
			If Utils.NNE(checkthis) And Utils.NNE(eml) Then
				If Not(eml.Contains(checkthis)) Then
					eml = ""
				End If
			End If
			If Utils.NNE(eml) Then
				If Utils.NNE(sRet) Then
					sRet = $"${sRet}${sDiv}"$
				End If
				sRet = $"${sRet}${eml}${sDiv}"$
			End If
		Next
	End If
	Record2.Close
	Return sRet
End Sub

Sub SendReportFromChecklist
	Dim theFile As String = CurrentFile
	Dim thePDFFile As String = theFile.Replace("html", "pdf")
	ProgressDialogShow2(ShareCode.GeneralWaitPlease, False)
	If (ShareCode.EmailOldModel = True) Then
		Wait For(CreateReportFromHTMLToPDFFile(theFile, thePDFFile)) Complete (ReportHTMLToPDF As Boolean)
		If Not(ReportHTMLToPDF) Then
			Dim thePDFFile As String = theFile.Replace("pdf", "html")
		End If
	End If

	Log($"File to send : ${thePDFFile}"$)
	Sleep(1000)
'	If (ReportHTMLToPDF = True) Then

		Dim emails As String = ""
		Dim sSQL As String = $"Select tagcode, email from dta_contacts
					where tagcode in (Select distinct contact_tagcode from dta_objects_contacts
					where object_tagcode in (Select distinct object_tagcode from dta_requests where tagcode='${CurrentRCLA.Request.Trim}'))"$
		
		emails = GetColValues2String(sSQL, "email", ";", "@")
		
'		EDP
		Dim SQLField As String = $"Select value as email from dta_objects_fields
					where field_tagcode='FIELD_EDPC_CONTRACT_MANAGER' 
					and object_tagcode in (Select distinct object_tagcode from dta_requests where tagcode='${CurrentRCLA.Request.Trim}')"$
		Dim emailTag As String = DBStructures.GetScriptColumnStrEVC(SQLField, "email")
		
		Dim sSQL As String = $"Select email from aut_users where tagcode='${emailTag.Trim}'"$
		emails = $"${emails}${GetColValues2String(sSQL, "email", ";", "@")}"$
		
		Dim SQLField As String = $"Select value as email from dta_objects_fields
						where field_tagcode='FIELD_EDPC_CONTRACT_MANPLUS' 
						and object_tagcode in (Select distinct object_tagcode from dta_requests where tagcode='${CurrentRCLA.Request.Trim}')"$
	Dim emailTag As String = DBStructures.GetScriptColumnStrEVC(SQLField, "email")

	If (ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP") Then
		Dim lstStr As String = Utils.StrList2SQLArray(Regex.Split("\|", emailTag))
		Dim sSQL As String = $"Select email from aut_users where tagcode in ${lstStr.Trim}"$
		Dim ccemails As String = $"${GetColValues2String(sSQL, "email", ";", "@")}"$
	Else
		Dim ccemails As String = ""
		Dim ccEmailsSource1 As String = DBStructures.GetScriptColumnStrEVC($"SELECT email FROM dta_companies"$, "email")
		If Utils.NNE(ccEmailsSource1) Then
			ccemails = ccEmailsSource1
		End If
		
		Dim ALERT_DATES_DEFAULT_CC_EMAIL As String = DBStructures.GetScriptColumnStrEVC($"SELECT value from dta_appparamters WHERE 1=1 and
																			tagcode = 'ALERT_DATES_DEFAULT_CC_EMAIL'"$, "value")
		If Utils.NNE(ALERT_DATES_DEFAULT_CC_EMAIL) Then
			ccemails = $"${ccemails};${ALERT_DATES_DEFAULT_CC_EMAIL}"$
		End If
	End If
	
	
	If (Not(ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP")) Then
		Dim sSQL As String = $"Select tagcode, email from dta_contacts
					where tagcode in (Select distinct contact_tagcode from dta_objects_contacts
					where object_tagcode in (Select distinct entity_tagcode from dta_requests where tagcode='${CurrentRCLA.Request.Trim}'))"$
		Dim emailsfinal As String = $"${emails};${GetColValues2String(sSQL, "email", ";", "@")}"$
	Else
		Dim emailsfinal As String = $"${emails}"$
	End If
	ProgressDialogHide
	
'	Eliminar emails duplicados	
	
	'emailsfinal
	Dim lstEmails As List
	lstEmails.Initialize
	lstEmails = Regex.Split(";",emailsfinal)
	Dim LstEmailsFiltered As List
	LstEmailsFiltered.Initialize
	LstEmailsFiltered = Utils.RemoveDuplicates(lstEmails)
	emailsfinal = ""
	For i=0 To LstEmailsFiltered.Size -1
		Dim linhaLstEmailsFiltered As String = LstEmailsFiltered.Get(i)
		If Utils.NNE(linhaLstEmailsFiltered) Then
			emailsfinal = emailsfinal & $"${linhaLstEmailsFiltered};"$
		End If
	Next
	
	'ccemails
	Dim lstEmails As List
	lstEmails.Initialize
	lstEmails = Regex.Split(";",ccemails)
	Dim LstEmailsFiltered As List
	LstEmailsFiltered.Initialize
	LstEmailsFiltered = Utils.RemoveDuplicates(lstEmails)
	ccemails = ""
	For i=0 To LstEmailsFiltered.Size -1
		Dim linhaLstEmailsFiltered As String = LstEmailsFiltered.Get(i)
		If Utils.NNE(linhaLstEmailsFiltered) Then
			ccemails = ccemails & $"${linhaLstEmailsFiltered};"$
		End If
	Next
	
	
	Try
		GetReportSendEmailDialog(CurrentRCLA.Request, "", emailsfinal, ccemails, thePDFFile)
	Catch
		Log(LastException)
	End Try
'	End If
End Sub

'Sub GetReportSendEmailDialog(this As RequestData, title As String, emails As String, filename As String)
Sub GetReportSendEmailDialog(this As String, title As String, emails As String, ccemails As String, filename As String)
	
	'SendEmailApplDialog as CustoDialog - IN DECLARATIONS
	
	Dim sf As Object = SendEmailApplDialog.ShowAsync(ShareCode.Option_SENDEMAIL, ShareCode.Option_CONFIRM, ShareCode.Option_CANCEL, "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhite, Consts.ColorGray, 3, 5)
	If (ShareCode.ISPHONE) Then
		SendEmailApplDialog.SetSize(95%x, 90%y)
	Else
		SendEmailApplDialog.SetSize(70%x, 430dip)
	End If
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("dialog_more_action_sendEmail")
	
	If emails = ";" Then emails = ""
	
	dlgASEmails.Text = Utils.IfNullOrEmpty(emails, "")
'	dlgASEmailsCC.Text = $"alertas@${ShareCode.APPL_HOST};${ccemails}"$
	dlgASEmailsCC.Text = $"${ccemails}"$
	sendBCC = "alertas@vrcg.pt"
	
	Dim ALERT_DATES_DEFAULT_BCC_EMAIL As String = DBStructures.GetScriptColumnStrEVC($"SELECT value from dta_appparamters WHERE 1=1 and
																			tagcode = 'ALERT_DATES_DEFAULT_BCC_EMAIL'"$, "value")
	If Utils.NNE(ALERT_DATES_DEFAULT_BCC_EMAIL) Then
		sendBCC = $"${sendBCC};${ALERT_DATES_DEFAULT_BCC_EMAIL}"$
	End If
		
	If (title.Trim.ToUpperCase = "OBJECT_DESIGNATE") Then
		title = "(Não identificado)"
	End If
	
	dlgASEmailsSubject.Text = $"Relatório: ${this} - ${title}"$
	If  (ShareCode.APP_DOMAIN.ToLowerCase = "edp") Then
		dlgASEmailsSubject.Text = $"Relatório VRCG - Coordenação de Ambiente e Segurança da Área Comercial da EDP"$
	End If

	'************************************************************
	' ALTERACAO PC - SCRIPT PARA VERIFICAR SE OS ENDERECOS DE EMAIL SAO VALIDOS
	'************************************************************
	If dlgASEmails.Text <> "" Then
		dlgASEmails.text = dlgASEmails.text.Replace(";;", ";")
		dlgASEmails.Text = dlgASEmails.Text.Replace(",", ";")
		dlgASEmails.Text = dlgASEmails.Text.Replace("|", ";")
		dlgASEmails.Text = dlgASEmails.Text.Replace(" ", "")
		Dim NewListOfValidEmails As String = ""
		Dim tst_eml As List = Regex.Split(";",dlgASEmails.Text)
		If tst_eml.Size > 1 Then
			For x = 0 To tst_eml.Size -1
				Dim eml2test As String = tst_eml.Get(x)
				If Not(eml2test.Contains("@")) And Not(eml2test.contains(".")) Then
					eml2test = ""
				End If
				NewListOfValidEmails = NewListOfValidEmails & eml2test & ";"
			Next
		Else
			NewListOfValidEmails = dlgASEmails.Text
		End If
		dlgASEmails.Text = NewListOfValidEmails
	End If
	
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		SendEmailApplDialog.CloseDialog(DialogResponse.POSITIVE)
		Dim sendBCC As String = ""
		If  (ShareCode.APP_DOMAIN.ToLowerCase = "edp") Then
			Dim LOGO As String = ""
			Dim INFOHEADER As String = ""
			Dim LOGOALT As String = ""
			Dim LOGOTITLE As String = ""
			Dim SUPORTE As String = ""
			Dim reference As String = DBStructures.GetScriptColumnStrEVC($"select reference from dta_objects where tagcode in
												(select object_tagcode from dta_requests where tagcode='${this}')"$, "reference")

'			LOGO = $"https://${ShareCode.APP_DOMAIN.ToLowerCase}.vrcg.pt/imgs/logo.png"$
			LOGO = $"data:image/jpeg;base64,${ShareCode.APP_MAIN_LOGO_MINI}"$
			
			LOGOALT = "EDP"
			LOGOTITLE = "EDP Comercial "
			INFOHEADER = $"<tr><td bgcolor="#fff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
					<p>A área de sustentabilidade da área Comercial da  EDP Comercial informa a empresa que foi efetuada a Inspeção com referência ${this}  no âmbito do Contrato ${reference} para a qual solicitamos a vossa melhor atenção na resolução de eventuais Não Conformidades detetadas.</p>
					<p>A resolução atempada das Não Conformidades será um fator a considerar para a avaliação global Do desempenho da presente prestação de serviços. Para resolver As Não Conformidades por favor para aceder, com As suas credencias, ao Portal das Inspeções.</p>
				</td></tr>"$

			SUPORTE = "<b>Suporte</b><br>Caso encontre alguma dificuldade, por favor entre em contacto com Sara Abreu (968773729)."
			sendBCC = "" '"ambiente.seguranca_edpc@edp.com"
			
			Dim HTML As String = $"<!DOCTYPE html>
				<html xmlns="http://www.w3.org/1999/xhtml"> <head>  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
				<title>${LOGOTITLE}</title>  <meta name="viewport" content="width=device-width, initial-scale=1.0"/></head><body style="margin: 0; padding: 0;">
				<table align="center" border="0" cellpadding="0" cellspacing="0" width="60%">    <tr> <td bgcolor="f00000">&nbsp;</td>
				</tr> <tr><td bgcolor="#fff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				<img src="${LOGO}" alt="${LOGOALT}" width="250">${LOGOTITLE}</td></tr><tr>
				<td bgcolor="#fff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				<p><b>Envio de relatório</b> </p><p><b>Nº Inspecção:</b> ${this}  
				</p> <p> <b>Contrato:</b> ${reference} </p> </td></tr><tr>
				${INFOHEADER}	
				<td bgcolor="#ffffff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				 </td> </tr> <tr>
				<td bgcolor="#ffffff" style="padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;">
				${SUPORTE}
				</td> </tr> <tr> <td bgcolor="f00000">&nbsp;</td> </tr> </table> </body> </html>"$
		Else If  (ShareCode.APP_DOMAIN.ToLowerCase = "hemer") Then
												
			If File.Exists(Starter.InternalFolder, "new_email_template.html") Then
				Dim HTML As String = File.ReadString(Starter.InternalFolder, "new_email_template.html")
			Else
				ToastMessageShow("Ficheiro não encontrado!", False)
				Dim HTML As String = $"<html><body><p>Exmos. Srs.,<br><br>Segue relatório em anexo da verificação realizada.<br></p>
						<p>Melhores cumprimentos<br>HEMER-SERVIÇOS, LDA.</p>
						</body></html>"$
			End If

			sendBCC = "alertas@vrcg.pt"
		Else
			Dim NON_CONFORMITY As String = ""
			Private Record As Cursor
			Dim SQL As String = $"select DISTINCT x.as_title, x.details, x.priority_desc, x.gravity_desc, x.due_date,
				x.unique_key, x.conform_type, 
				x.status, x.title, x.execute_notes, x.execute_action, x.repeatcounter,
				x.task_tagcode, x.item_tagcode, x.tagcode, x.request_tagcode, x.bullet_master, x.bullet_child, 
				x.nametitle, x.executeaction from (select DISTINCT
				ifnull(e.title, '') AS as_title, 
				ifnull(e.details,'') AS details, 
				ifnull(f.tagdesc, '') AS priority_desc, 
				ifnull(g.tagdesc, '') AS gravity_desc, 
				ifnull(e.due_date,'') AS due_date, 
				a.unique_key, d.id as conform_type, 
				a.execute_status as status, c.title, 
				a.execute_notes, 
				a.execute_action, a.repeatcounter,
				a.task_tagcode, a.item_tagcode, a.tagcode, a.request_tagcode, c.bullet_master, c.bullet_child, 
				(SELECT ifnull(inner_title, ( 
					SELECT title FROM dta_tasks WHERE tagcode=a.task_tagcode)) AS inner_title FROM dta_requests_relations WHERE request_tagcode=a.request_tagcode 
							AND relation_tagcode=a.inner_request_tagcode 
							AND repeatcounter=a.repeatcounter) AS nametitle,
				(SELECT distinct execute_action FROM dta_requests_values WHERE request_tagcode=a.request_tagcode 
							AND inner_request_tagcode=a.inner_request_tagcode 
							AND task_tagcode=a.task_tagcode
							AND item_tagcode=a.item_tagcode
							AND unique_key=a.unique_key LIMIT 1) AS executeaction 
				from  dta_requests_values as a 
				inner join dta_tasks_items_answers as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode) 
				inner join dta_tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.unique_key=b.unique_key) 
				inner join type_conformitytypes as d on (d.tagcode=b.type_conformity) 
				INNER JOIN dta_actions AS e ON (e.tagcode=a.execute_action)
				left JOIN type_prioritytypes AS f ON (f.tagcode=e.priority_tagcode)
				left JOIN type_gravitytypes AS g ON (g.tagcode=e.gravity_tagcode)
				where 1=1 and a.execute_status>=1 and  
				a.request_tagcode='${this}' and d.id=2  AND a.execute_notes IS NOT null) as x
				order BY x.task_tagcode, x.repeatcounter, x.bullet_master, x.bullet_child"$
			'a.repeatcounter,
			Log(SQL)
				
			Dim SHOW_NON_CONFORMITY As String = "display:none;"
			Dim dNON_CONFORMITY As String = $""$
			Dim GroupStart As String = ""
			Record = Starter.LocalSQLEVC.ExecQuery(SQL)
			If Record.RowCount > 0 Then
				SHOW_NON_CONFORMITY = "display:block;"
			
				Dim NCStart As String = $"<div class="row"><div class="col-12" style="font-size:10px;">
									<table class="table table-bordered" style="width:100%;">"$
				Dim NCHeader As String =  $"<thead style="background:#b7e1dc;">
										<tr>
											<th style="width:30%;">Pergunta/Resposta</th>
											<th style="width:20%;">Observação</th>
											<th style="width:20%;">Recomendação/Ação</th>
											<th style="width:10%;">Gravidade</th>
											<th style="width:10%;">Data Limite</th>
											<th style="width:10%;">Alocado a</th>
										</tr>
										</thead>"$ 

								
				Dim NCEnd As String = $"</table></div></div></div>"$
				NON_CONFORMITY =""
				For Row = 0 To Record.RowCount-1
					Record.Position = Row
					Dim ThisGroupStart As String = Utils.IfNullOrEmpty(Record.GetString("nametitle"), "")
								
					If Not(GroupStart = ThisGroupStart) Then
						NON_CONFORMITY = $"${NON_CONFORMITY}
										<tr colspan="6">
											<td><strong>${ThisGroupStart.ToUpperCase}</strong></td>
										</tr>"$ 
						GroupStart = ThisGroupStart
					End If
				
					Dim DueDate As String = Utils.IfNullOrEmpty(Record.GetString("due_date"), "")
					If Utils.NNE(DueDate) Then
						DueDate.Replace(" 00:00:00","")
						Try
							Dim ddate As Long = DateTime.DateParse(DueDate)
							DateTime.DateFormat = "yyyy-MM-dd"
							DueDate = DateTime.Date(ddate)
						Catch
							Log(LastException)
						End Try
					End If
					DueDate = DueDate.Replace("00:00:00", "").Trim
				
					NON_CONFORMITY = $"${NON_CONFORMITY}
									<tr>
										<td style="width:30%;">${Utils.IfNullOrEmpty(Record.GetString("as_title"), "")}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("execute_notes"), "")}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("details"), "")}</td>
										<td style="width:10%;">${Utils.IfNullOrEmpty(Record.GetString("gravity_desc"), "")}</td>
										<td style="width:10%;">${DueDate}</td>
										<td style="width:10%;">Cliente</td>
									</tr>"$
				
				Next
				Dim dNON_CONFORMITY As String = $"${NCStart}${NCHeader}<tbody>${NON_CONFORMITY}</tbody>${NCEnd}"$
		
			End If
			Record.Close
			Dim HTML As String = $"<html><body><p>Exmos. Srs.,<br><br>Segue relatório em anexo da verificação realizada, com a informação abaixo indicada: <br></p>
						<p> <strong>Informação</strong><br>
						${dlgASDetails.Text}<br><br></p>
						<p>${dNON_CONFORMITY}<br><br></p>
						<p>Melhores cumprimentos<br>A equipa ${ShareCode.APP_DOMAIN.ToUpperCase}</p>
						</body></html>"$
		End If
		
		
		Try
			If (ShareCode.EmailOldModel = True) Then
				ProgressDialogShow2(ShareCode.checklistenviardados2BO, False)
				Dim UD2BO As ResumableSub = UpdateData2Server
				Wait For (UD2BO) Complete (Succeded As Boolean)
				ProgressDialogHide
				
				If Succeded = True Then
					SendReportEmailExt(this, dlgASEmails.Text.Trim, dlgASEmailsCC.Text.Trim, dlgASEmailsSubject.Text, HTML, filename, sendBCC)
				Else
					MsgboxAsync("Não foi possivel enviar os dados Offline para o Servidor !", ShareCode.GeneralErrorTitle)
				End If
				
			Else
				ProgressDialogShow2(ShareCode.checklistenviardados2BO, False)
				Dim UD2BO As ResumableSub = UpdateData2Server
				Wait For (UD2BO) Complete (Succeded As Boolean)
				ProgressDialogHide
				
				If Succeded = True Then
					RequestEmailFromBO(this, dlgASEmails.Text.Trim, dlgASEmailsCC.Text.Trim, dlgASEmailsSubject.Text,"",sendBCC)
				Else
					MsgboxAsync("Não foi possivel enviar os dados Offline para o Servidor !", ShareCode.GeneralErrorTitle)
				End If

			End If
			
		Catch
			Log(LastException)
			MsgboxAsync("Não foi possível enviar o relatório por email devido a erro de comunicação. Tente novamente ou contacte o administrador de sistema.", "Alerta!")
		End Try
	End If
End Sub

Sub dlgASEmails_TextChanged (Old As String, New As String)
	Try
		'xxx Verificar porque esta a vir como Floatedittext 
		If dlgASEmails.Text = "" Then
			SendEmailApplDialog.GetButton(xui.DialogResponse_Positive).Enabled = False
		Else
			SendEmailApplDialog.GetButton(xui.DialogResponse_Positive).Enabled = True
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub RequestEmailFromBO(NRequest As String, EmailsTO As String, EmailsCC As String, subject As String,detail As String ,sendBCC As String) As ResumableSub
	EmailsTO = EmailsTO.Replace(";;", ";")
	EmailsTO = EmailsTO.Replace(",", ";")
	EmailsTO = EmailsTO.Replace("|", ";")
	EmailsTO = EmailsTO.Replace(" ", "")

	EmailsCC = EmailsCC.Replace(";;", ";")
	EmailsCC = EmailsCC.Replace(",", ";")
	EmailsCC = EmailsCC.Replace("|", ";")
	EmailsCC = EmailsCC.Replace(" ", "")
	
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/cla/send/email"$
	Dim JobEmail As HttpJob
	JobEmail.Initialize("",Me)
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token",ShareCode.APP_TOKEN)
	params.Put("request",NRequest)
	params.Put("emailsTO",EmailsTO)
	params.Put("emailsCC",EmailsCC)
	params.Put("subject", subject)
'	params.Put("detail", detail)
	params.Put("date",Utils.GetCurrDatetime)
	params.Put("user", ShareCode.SESS_OPER_User)
	params.Put("SendBCC", sendBCC)
	params.Put("debug", 0)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
    
	Dim data As String = JSON.ToPrettyString(1)
	
	Utils.ShowProcinLog("ReportView","RequestEmailfromBO",data)
	
	If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION)) Then
		If Not(ShareCode.APP_WORKING_LOCAL) Then
			JobEmail.PostString(ServerAddress, data)
			JobEmail.GetRequest.SetContentType("application/json")
			JobEmail.GetRequest.Timeout = 90000
			ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
			Wait For (JobEmail) JobDone(JobEmail As HttpJob)
	
			ProgressDialogHide
	
			If JobEmail.Success Then
				Dim JsonStruct As String=""
				Try
					Log(JobEmail.GetString)
					JsonStruct = JobEmail.GetString
					Dim parser As JSONParser
					parser.Initialize(JsonStruct)
					Dim root As Map = parser.NextObject
					Dim Status As String = root.Get("status")
					Dim Message As String = root.Get("message")
				Catch
					Log(LastException)
					Log(JobEmail.GetString)
				End Try

				If Status = "1" Then
					ShareCode.EML_RESULT = "SUCESSO"
				Else
					ShareCode.EML_RESULT = "ERRO"
				End If
		
				Utils.ShowProcinLog("ReportView","RequestEmailfromBO","Success")
				Dim Eml_result_Text As String = $"${NRequest} - ${ShareCode.EML_RESULT}${CRLF}${EmailsTO}"$
				CreateEmailAlert(Eml_result_Text)
				MsgboxAsync("Verifique o estado do envio em Alertas, no Menu principal",ShareCode.GeneralInfoTitle)
				JobEmail.Release
				Return True
			Else
				Log(JobEmail.ErrorMessage)
				Utils.ShowProcinLog("ReportView","RequestEmailfromBO","JOB ERROR")
				Utils.logError("ReportView", ShareCode.SESS_User, JobEmail.ErrorMessage)
				JobEmail.Release
				Return True
			End If
			
		
		Else
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,NRequest.Trim,"","")
			Utils.saveEmail2update(ServerAddress, Utils.MapToJson(params), 0, WorkerND)
			MsgboxAsync("A APP está a trabalhar em OFFLINE ! O Email será enviado quando for restabelecida a ligação ao servidor",ShareCode.GeneralAlertTitle)
		End If
		Sleep(200)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,NRequest.Trim,"","")
		Utils.saveEmail2update(ServerAddress, Utils.MapToJson(params), 0, WorkerND)
		MsgboxAsync("A APP está a trabalhar em OFFLINE ! O Email será enviado quando for restabelecida a ligação ao servidor",ShareCode.GeneralAlertTitle)
	End If
	
End Sub

Sub SendReportEmailExt(this As String, EmailTo As String, EmailCC As String, Subject As String, Details As String, fileName As String, bcc As String)
	
	EmailTo = EmailTo.Replace(",", ";")
	EmailTo = EmailTo.Replace("|", ";")
	EmailTo = EmailTo.Replace(" ", "")

	EmailCC = EmailCC.Replace(",", ";")
	EmailCC = EmailCC.Replace("|", ";")
	EmailCC = EmailCC.Replace(" ", "")
	
	Dim eSMTP As SMTP
	'******************************************************************************************************************************
	' Verificar dados de email em dta_companies
	'******************************************************************************************************************************
	
	'INICIALIZACAO DE VARIAVEIS, NAO PONHO VALORES POR DEFEITO PARA NAO CORRER O RISCO DE ALGUM SER USADO NA INICIALIZACAO
	'
	Dim Eml_Driver As String = ""
	Dim Eml_Encryption As String = ""
	Dim Eml_Host As String = ""
	Dim Eml_Port As Int = 587
	Dim Eml_User As String = ""
	Dim Eml_Password As String = ""
	Dim Eml_Address As String = ""
	
	Dim SqlEmail As String = $"SELECT d.code AS driver, e.code AS encryption ,a.email, a.email_host, a.email_port, a.email_user, a.email_password, a.email_address
							FROM dta_companies AS a
							LEFT JOIN type_emaildriverstypes AS d ON (d.tagcode = a.email_driver)
							LEFT JOIN type_emailencripttypes AS e ON (e.tagcode = a.email_encription) "$
	
	Dim CrsEmail As Cursor
	CrsEmail = Starter.LocalSQLEVC.ExecQuery(SqlEmail)
	If CrsEmail.RowCount > 0 Then
		CrsEmail.Position = 0
		Eml_Driver = CrsEmail.GetString("driver")
		Eml_Encryption = CrsEmail.GetString("encryption")
		Eml_Host = CrsEmail.GetString("email_host")
		Eml_Port = CrsEmail.GetInt("email_port")
		Eml_User = CrsEmail.GetString("email_user")
		Eml_Password = CrsEmail.GetString("email_password")
		Eml_Address = CrsEmail.GetString("email_address")
	End If
	CrsEmail.Close
	
	'**************************************************************************
	' CONDICAO PARA USAR OS VALORES DA BD = HOST AND USER AND PASS AND PORTA
	'**************************************************************************
	
	If Utils.NE(Eml_Host) Or Utils.NE(Eml_Port) Or Utils.NE(Eml_User) Or Utils.NE(Eml_Password) Then
'		eSMTP.Initialize($"mail.${ShareCode.APPL_HOST}"$, 587, $"webmaster@${ShareCode.APPL_HOST}"$, "..We6Master@20!8", "eSMTPReturn")
		eSMTP.Initialize($"mail.${ShareCode.APPL_HOST}"$, 587, $"alertas@${ShareCode.APPL_HOST}"$, "..Alertas@VRCG_20!9", "eSMTPReturn")
		eSMTP.StartTLSMode = True
'		eSMTP.Sender = "webmaster@vrcg.pt"
		eSMTP.Sender = "alertas@vrcg.pt"
		Dim BCCItems As String = "alertas@vrcg.pt;email_delivers@vrcg.pt"
	Else
		eSMTP.Initialize(Eml_Host,Eml_Port,Eml_User,Eml_Password,"eSMTPReturn")
		If Utils.NE(Eml_Encryption) Then
			eSMTP.StartTLSMode = True
		Else
			If Eml_Encryption.ToUpperCase.Contains("TLS") Then
				eSMTP.StartTLSMode = True
			Else
				eSMTP.StartTLSMode = False
			End If
		End If
		
		If Eml_User.Contains("@") And Eml_User.Contains(".") Then
			Dim BCCItems As String = Eml_User
		Else
			If Eml_Address.Contains("@") And Eml_Address.Contains(".") Then
				Dim BCCItems As String = Eml_Address
			Else
				Dim BCCItems As String = ""
			End If
		End If
		eSMTP.Sender = Eml_Address
	End If
		
	If  (ShareCode.APP_DOMAIN.ToLowerCase.contains("grandative")) Then
		eSMTP.Sender = "apoioaocliente@grandative.pt"
	End If
	
'	Log(EmailTo)
'	Log(EmailCC)
	
	eSMTP.HtmlBody = True
	eSMTP.To.AddAll(Regex.Split("\;", EmailTo ))
	eSMTP.CC.AddAll(Regex.Split("\;", EmailCC ))

	If  ((ShareCode.APP_DOMAIN.ToLowerCase = "edp") And Utils.NNE(bcc)) Then
		BCCItems = $"${BCCItems};${bcc.Trim}"$
	End If
	
	eSMTP.BCC.AddAll(Regex.Split("\;", BCCItems ))
	eSMTP.Subject = Subject
	eSMTP.Body = Details
	eSMTP.AddAttachment(Starter.SharedFolder, fileName)
	
	ShareCode.EML_DETAIL = Details
	ShareCode.EML_REQUEST = this
	ShareCode.EML_TO = EmailTo
	
	eSMTP.Send
	
	ProgressDialogShow2(ShareCode.GeneralWaitPlease,False)
	Sleep(3000)
	ProgressDialogHide
	MsgboxAsync(ShareCode.MsgAvisoEmailAlerta,ShareCode.GeneralInfoTitle)
	
End Sub

Sub eSMTPReturn_MessageSent(Success As Boolean)
	' INSERIR ALERTA DE SISTEMA COM O RESULTADO DO ENVIO DO EMAIL

	Log("SMTP send: " & Success )
	If Success Then
		ShareCode.EML_RESULT = "SUCESSO"
		Dim Eml_result_Text As String = $"${ShareCode.EML_REQUEST} - ${ShareCode.EML_RESULT}${CRLF}${ShareCode.EML_TO}"$
'		MsgboxAsync(ShareCode.reportsMsgEnviarEmail,ShareCode.GeneralNoteTitle)
	Else
		ShareCode.EML_RESULT = "ERRO :" & LastException.Message
		Dim Eml_result_Text As String = $"${ShareCode.EML_REQUEST} - ${ShareCode.EML_RESULT}${CRLF}${ShareCode.EML_TO}"$
'		MsgboxAsync(ShareCode.reportsErroEmail & LastException.Message, ShareCode.GeneralAlertTitle)
		Log(LastException.Message)
	End If

	CreateEmailAlert(Eml_result_Text)

End Sub

Sub CreateEmailAlert(Alert_Text As String)
	Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
	Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
	Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
							values (${mID}, '${alerttagcode}', '', 'ALRTREL_REQUESTS', 'ALRTTYP_EMAIL', 1, 1, '${Alert_Text}', 
	'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
	Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")
	CallSub(MainMenu,"BadgeCheckUpdate")
End Sub

Sub butReGenerate_Click
	If Not(CLOrigin) Then
		ActivityGenerateReport(CurrentCLA)
	Else
		ActivityCLGenerateReport(CurrentRCLA)
	End If
End Sub

Sub RegenerateFromCL(CL_CLA As RequestCLA)
	ActivityCLGenerateReport(CL_CLA)
End Sub

Sub ActivityGenerateReport(CLA As RequestData)
	
	CurrentCLA = CLA
	Dim RepBuild As ResumableSub = GenerateReportProcedure(CLA)
	Wait For (RepBuild) Complete (FinishedRep As Boolean)
	
	If Not(FinishedRep) And (CLA.ClientReport = 1) Then
		MsgboxAsync("Não Existem Relatórios Agrupadores configurados",ShareCode.GeneralInfoTitle)
		ReportProgress.Visible = False
		butClose_Click
	Else If Not(FinishedRep) And (CLA.ClientReport = 0) Then
		ToastMessageShow("Sem configuração !",True)
		ReportProgress.Visible = False
		butClose_Click
	End If
	
End Sub

Sub ActivityCLGenerateReport(CLA As RequestCLA)
	Sleep(250)
	CLOrigin = True
	CurrentRCLA = CLA
	
	Dim RepBuild As ResumableSub = STDGenerateReportProcedure(CLA)
	Wait For (RepBuild) Complete (Finished As Boolean)
End Sub

Sub GenerateReportProcedure(CLA As RequestData) As ResumableSub
	Try
		If (CLA.ClientReport = 1) Then
			If ShareCode.APP_DOMAIN.ToLowerCase.contains("grandative") Then
				GAGenerateReport(CLA)
			else If ShareCode.APP_DOMAIN.ToLowerCase = "resopre" Then
				RESOPRE2GenerateReport(CLA)
			Else 
				AGRUPADOR2GenerateReport(CLA)
			End If
		Else
			Return False
		End If
	Catch
		Log(LastException)
	End Try
	
	Return True
	
End Sub

Sub STDGenerateReportProcedure(CLA As RequestCLA) As ResumableSub
	Try
		If (ShareCode.APP_DOMAIN.ToLowerCase.Contains("grandative")) Then
			GA2GenerateReport(CLA)
		else If(ShareCode.APP_DOMAIN.ToLowerCase = "limpersado") Then
			LIMPERSADOGenerateReport(CLA)
		else If(ShareCode.APP_DOMAIN.ToLowerCase = "acail") Then
			ACAILGenerateReport(CLA)
		else If(ShareCode.APP_DOMAIN.ToLowerCase = "resopre") Then
			Dim rlt As Int = Utils.IfNullOrEmpty( _
							DBStructures.GetScriptColumnStrEVCJSON( _
							$"select distinct paramters from dta_tasks_adds where tagcode='${CLA.Task}'"$, _
							"paramters", "report_layout_type"), "0")
			If (rlt = 2) Then
				RESOPREGenerateReport(CLA)
			Else
				GenerateReport(CLA)
			End If
		Else
			GenerateReport(CLA)
		End If
	Catch
		Log(LastException)
	End Try
	Return True
End Sub

Sub WriteReportToHTMLFile(FileReport As String, SecondCount As Int) As ResumableSub
	Dim Out As OutputStream
	Out = File.OpenOutput(Starter.SharedFolder, FileReport, False)
	Dim val As TextWriter
	val.Initialize(Out)
	Try
		Dim template12header As String = File.ReadString(Starter.SharedFolder, "template12header.html")
		val.Write(template12header)
		Dim FIRSTREP As String = File.ReadString(Starter.SharedFolder, "FIRSTREP.TMP")
		val.Write(FIRSTREP)
		
		For n=0 To SecondCount -1
			If File.Exists(Starter.SharedFolder, $"SECONDREP${n}.TMP"$) Then
				Dim SECONDREP1 As String = File.ReadString(Starter.SharedFolder, $"SECONDREP${n}.TMP"$)
				val.Write(SECONDREP1)
			End If
		Next
		Dim IMAGES As String = File.ReadString(Starter.SharedFolder, "IMAGES.TMP")
		val.Write(IMAGES)
		Dim SUMARY As String = File.ReadString(Starter.SharedFolder, "SUMARY.TMP")
		val.Write(SUMARY)
		Dim template12footer As String = File.ReadString(Starter.SharedFolder, "template12footer.html")
		val.Write(template12footer)
	Catch
		Log(LastException)
	End Try
	val.Close
	Out.Close
	
	Try
		If File.Exists(Starter.SharedFolder, "FIRSTREP.TMP") Then
			File.Delete(Starter.SharedFolder, "FIRSTREP.TMP")
		End If
		
		For n=0 To SecondCount-1
			If File.Exists(Starter.SharedFolder, $"SECONDREP${n}".TMP"$) Then
				File.Delete(Starter.SharedFolder, $"SECONDREP${n}.TMP"$)
			End If
		Next
		
		If File.Exists(Starter.SharedFolder, "IMAGES.TMP") Then
			File.Delete(Starter.SharedFolder, "IMAGES.TMP")
		End If
		
		If File.Exists(Starter.SharedFolder, "SUMARY.TMP") Then
			File.Delete(Starter.SharedFolder, "SUMARY.TMP")
		End If
	Catch
		Log(LastException)
	End Try
	'Sleep(12000)
	Sleep(4000)
	Return True
End Sub

Sub CreateReportFromHTMLToPDFFile(FileReport As String, theFile As String) As ResumableSub
	Dim phtmltopdf As PalmoHtmlToPdf
	phtmltopdf.Initialize("phtmltopdf")
	'phtmltopdf.ConvertFromFile(Starter.SharedFolder, $"${FileReport}.html"$, Starter.SharedFolder, theFile)
	Try
		phtmltopdf.ConvertFromFile(Starter.SharedFolder, FileReport, Starter.SharedFolder, theFile)
	Catch
		Log(LastException)
	End Try
'	Sleep(12000)
	Sleep(4000)
	Return True
End Sub

Sub CallReportAPIFile(Tagcode As String, theFile As String) As ResumableSub
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", Tagcode)
	params.Put("ACLAFilename", theFile)
	params.Put("ACLAB64", "")
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/cla/rep/update"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Utils.CallApi(0, params, Me, Url, "", Tagcode)
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4, Tagcode.trim, "", "")
		Utils.save2update(Url, Utils.MapToJson(params), 0, WorkerND)
	End If
	Sleep(500)
	Return True
End Sub


Sub CopyReportFileToShared(theFile As String) As ResumableSub
	Try
		File.Copy(Starter.SharedFolder, theFile, Starter.InternalFolder, theFile )
	Catch
		Log(LastException)
		Return False
	End Try
	Sleep(500)
	Return True
End Sub

Sub UploadReportFileToServer(theFile As String) As ResumableSub
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Try
			UploadFilesWithFTP(theFile)
		Catch
			Log(LastException)
			Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4, "", "", "")
			Utils.save2update(ServerLocation, theFile, 1, WorkerND)
			Return False
		End Try
	Else
		Dim ServerLocation As String = $"/${ShareCode.APP_DOMAIN}/docs/"$
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4, "", "", "")
		Utils.save2update(ServerLocation, theFile, 1, WorkerND)
		Return False
	End If
	Sleep(5000)
	Return True
End Sub

Sub UploadFilesWithFTP(filename As String )
	Dim myFTP As FTP
	myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
	myFTP.PassiveMode = True
	Log(filename)
	Dim sf As Object = myFTP.UploadFile(Starter.SharedFolder, filename, False, "/" & ShareCode.APP_DOMAIN & "/docs/" & filename)
	Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
	If Success Then
		Log("file was uploaded successfully")
	Else
		Log("Error uploading file")
	End If
	myFTP.Close
End Sub

Sub GenerateReportSQLScripts(CLA As RequestCLA, ScriptName As String) As String
	
	
	'TIP : VERIFICA PARAMETROS ESPECIFICOS DA CHECKLIST PARA A QUERY DO RELATORIO
	'
	Dim Paramters As String = DBStructures.GetScriptColumnStrEVC($"select paramters from dta_tasks_adds where tagcode='${CLA.Action.Trim}'"$, "paramters")
	If Utils.NNE(Paramters) Then
		Log(Paramters)
		Dim root As Map = Utils.JSON2MAP(Paramters)
		Try
			Dim report_layout_type As Int = root.Get("report_layout_type")
			Dim report_print_conditions As Map = root.Get("report_print_conditions")
			Dim inc_inline_obs As Int = report_print_conditions.Get("inc_inline_obs")
			Dim score_formula As String = report_print_conditions.Get("score_formula")
			Dim show_as_appendix As Int = report_print_conditions.Get("show_as_appendix")
			Dim score_script As String = report_print_conditions.Get("score_script")
			Dim inc_disabled_answers As Int = report_print_conditions.Get("inc_disabled_answers")
			Dim inc_inline_fotos As Int = report_print_conditions.Get("inc_inline_fotos")
			Dim is_score As Int = report_print_conditions.Get("is_score")
			Dim show_fotos_appendix As Int = report_print_conditions.Get("show_fotos_appendix")
			Dim inc_not_answered As Int = report_print_conditions.Get("inc_not_answered")
			Dim show_signature_appendix As Int = report_print_conditions.Get("show_signature_appendix")
			Dim stmd_documents_first As Int = root.Get("stmd_documents_first")
			Dim start_mydata As Int = root.Get("start_mydata")
		Catch
			Dim inc_not_answered As Int = 1
			Log(LastException)
		End Try
		
	End If
	
	
	Select Case ScriptName.ToUpperCase

		Case "DETALHE1"
			Dim SQLSCript As String = $"Select x.unique_key, x.execute_value, x.execute_notes, x.val_desc, x.title, x.position, x.level,
									x.datatype, x.repeatcounter, x.repeatitemcounter, x.repeatfieldcounter, x.repeated, x.title_2, x.bullet_level, x.type_conformity,
									x.bullet_master, x.bullet_child
									from (Select a.unique_key, a.execute_value, ifnull(a.execute_notes,'') as execute_notes, 
										Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
										Case when (a.execute_status>0 and (b.data_type in (16)) and length(a.execute_value)<2) Then b.title 
											  when (a.execute_status>0 and (b.data_type in (10,21)) and length(a.execute_value)<2) Then 
												 	Case when (a.execute_value = '1')  Then 'Conforme'
												 	else 'Não Conforme' end
										Else a.execute_value End end as val_desc,
										c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									a.repeatitemcounter, a.repeatfieldcounter, c.repeated, a.title as title_2, c.bullet_level, 
									c.bullet_master, c.bullet_child, b.type_conformity
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
									and a.task_tagcode='${CLA.Task.Trim}' AND c.on_report=1 
									And ((b.data_type not in (10,16,21)) or (a.execute_status=0 And (b.data_type not in (10,16,21))) 
										Or (a.execute_status > 0 And (b.data_type in (10,16,21)) Or (a.execute_status > 0 And b.data_type=6)))
									UNION
									Select a.unique_key, "" As execute_value, "" as execute_notes, "" As val_desc, a.title, 
									a.position, a.level, a.data_type As datatype, 0 as repeatcounter, 
									0 as repeatitemcounter, 0 as repeatfieldcounter, a.repeated, '' as title_2, a.bullet_level, 
									a.bullet_master, a.bullet_child, '' as type_conformity
									from dta_tasks_items As a 
									where a.task_tagcode='${CLA.Task.Trim}' and a.level=0) as x
									order by x.bullet_master, x.repeatcounter, x.repeatitemcounter, x.position, x.repeatfieldcounter"$
									
			
			
			If Not(Utils.Int2Bool(inc_not_answered)) Then
				Dim SQLSCript As String = $"Select x.unique_key, x.execute_value, x.execute_notes, x.val_desc, x.title, x.position, x.level,
									x.datatype, x.repeatcounter, x.repeatitemcounter, x.repeatfieldcounter, x.repeated, x.title_2, x.bullet_level, x.type_conformity,
									x.bullet_master, x.bullet_child
									from (Select a.unique_key, a.execute_value, ifnull(a.execute_notes,'') as execute_notes, 
										Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
										Case when (a.execute_status>0 and (b.data_type in (16)) and length(a.execute_value)<2) Then b.title 
											  when (a.execute_status>0 and (b.data_type in (10,21)) and length(a.execute_value)<2) Then 
												 	Case when (a.execute_value = '1')  Then 'Conforme'
												 	else 'Não Conforme' end
										Else a.execute_value End end as val_desc,
										c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									a.repeatitemcounter, a.repeatfieldcounter, c.repeated, a.title as title_2, c.bullet_level, 
									c.bullet_master, c.bullet_child, b.type_conformity
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
									and a.task_tagcode='${CLA.Task.Trim}' AND c.on_report=1 and a.execute_status = 1
									UNION
									Select a.unique_key, "" As execute_value, "" as execute_notes, "" As val_desc, a.title, 
									a.position, a.level, a.data_type As datatype, 0 as repeatcounter, 
									0 as repeatitemcounter, 0 as repeatfieldcounter, a.repeated, '' as title_2, a.bullet_level, 
									a.bullet_master, a.bullet_child, '' as type_conformity
									from dta_tasks_items As a 
									where a.task_tagcode='${CLA.Task.Trim}' and a.level=0) as x
									order by x.bullet_master, x.repeatcounter, x.repeatitemcounter, x.position, x.repeatfieldcounter"$
			End If
			
			Log($"${ScriptName.ToUpperCase}:${CRLF}${SQLSCript}"$)
			Return SQLSCript
			
		Case "NAOCONFORMIDADES"
			Dim SQLSCript As String = $"Select * from
							(
							Select distinct ifnull(a.execute_action, '') as execute_action, b.id as conform_type, a.execute_status as status, 
							c.title, c.bullet_master, c.bullet_child,b.type_conformity,
							(Select title from dta_actiontypes where tagcode in 
							(Select action_type from dta_actions_adds where actions_tagcode=a.execute_action)) As atype
							
							from  dta_requests_values As a 
							inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
							inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
							inner join type_conformitytypes As d on (d.tagcode=b.type_conformity And (d.id=2 Or (d.id=1 And a.execute_action Is Not Null)))
							where 1=1 And a.execute_status>=1 
							And  a.request_tagcode='${CLA.Request.Trim}' and a.task_tagcode='${CLA.Task.Trim}' and a.repeatcounter=${CLA.RepeatCounter} 
							union
							Select distinct ifnull(a.execute_action, (
								select distinct tagcode from dta_actions where 1=1
									and request_tagcode=a.request_tagcode
									and action_tagcode=a.inner_request_tagcode
									and task_tagcode=a.task_tagcode
									and item_tagcode=a.item_tagcode
									and uniquekey=a.unique_key
									and iu_tagcode=a.tagcode
									and repeatcounter=a.repeatcounter
									and repeatfieldcounter=a.repeatfieldcounter
									
							)) as execute_action, a1.fieldconfirm_nc as conform_type, a.execute_status as status, 
							ifnull(a.title, ifnull(a.execute_value_title, c.title)) As title, c.bullet_master, c.bullet_child,
							(Select title from dta_actiontypes where tagcode in 
							(Select action_type from dta_actions_adds where actions_tagcode in ((
								select distinct tagcode from dta_actions where 1=1
									and request_tagcode=a.request_tagcode
									and action_tagcode=a.inner_request_tagcode
									and task_tagcode=a.task_tagcode
									and item_tagcode=a.item_tagcode
									and uniquekey=a.unique_key
									and iu_tagcode=a.tagcode
									and repeatcounter=a.repeatcounter
									and repeatfieldcounter=a.repeatfieldcounter
									
							)))) As atype, b.type_conformity 
							from  dta_requests_values As a 
							inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
							inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
							inner join dta_requests_values_adds As a1 on 
									(a1.request_tagcode=a.request_tagcode 
										And a1.task_tagcode=a.task_tagcode 
										And a1.item_tagcode=a.item_tagcode 
										And a1.unique_key=a.unique_key 
										And a1.tagcode=a.tagcode 
										And a1.repeatcounter=a.repeatcounter
										And a1.repeatfieldcounter=a.repeatfieldcounter )
							where 1=1 And a.execute_status>=1 
							And  a.request_tagcode='${CLA.Request.Trim}' and a.task_tagcode='${CLA.Task.Trim}' and a.repeatcounter=${CLA.RepeatCounter} 
							And a1.fieldconfirm_nc=2
							) As x
							order by x.bullet_master, x.bullet_child"$	
							
			Log($"${ScriptName.ToUpperCase}:${CRLF}${SQLSCript}"$)
			Return SQLSCript
	End Select
	
End Sub

'===============================================================================================================
' CHECKLIST REPORT GENERATION
'===============================================================================================================
Sub GenerateReport(CLA As RequestCLA)
	'saveFinalObs
	'CLA.Other.Filter

	ProgressDialogShow(ShareCode.reportsMsgGeralRelatorio)
	Sleep(50)
	Private Record As Cursor
	Dim HtmlFile As String = ""
	'Dim HTML As List = File.ReadList(Starter.SharedFolder, "template1.html")
	Dim HtmlCode As String = ""
	Dim SQL As String = $"select * from dta_tasks where tagcode='${CLA.Task}'"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim repOptions As String = Utils.IfNullOrEmpty(Record.GetString("generate_report_list"), "")
		Dim ReportList As List = Regex.Split("\|", repOptions.trim )
		If (ReportList.Size>=1) Then
			HtmlCode = ReportList.Get(0)
		Else
			If Utils.NNE(repOptions) Then
				HtmlCode = repOptions
			End If
		End If
	End If
	Record.Close
	Log(HtmlCode)
	
	If Utils.NNE(HtmlCode) Then
		Dim SQL As String = $"select template_file from dta_reports where tagcode='${HtmlCode}' and prepared=1"$
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			Log($"1=${Record.GetString("template_file")}"$)
			HtmlFile = Record.GetString("template_file")
		End If
		Record.Close
	End If
	Log($"2=${HtmlFile}"$)
	
	If Not(Utils.NNE(HtmlFile)) Then
		'HtmlFile = "acail_reg_despesa.html"
		HtmlFile = "template4.html"
		If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "RESOPRE")) Then
			HtmlFile = "template1.html"
		End If
		
	End If
	
	If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP")) Then
		HtmlFile = "template_edp.html"
'	else If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "BRASFONE")) Then  
'		HtmlFile = "template20.html"
	End If
	
	If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "ERGUELOP")) Then
		HtmlFile = "template4_erguelop.html"
	End If
	
	If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "HEMER")) Then
		HtmlFile = "template_hemer.html"
	End If
	
	Log($"3=${HtmlFile}"$)
	
	Dim fExists As Boolean = False
	If (File.Exists(Starter.InternalFolder, HtmlFile) And File.Exists(Starter.SharedFolder, HtmlFile)) Then
		If (File.LastModified(Starter.InternalFolder, HtmlFile) > File.LastModified(Starter.SharedFolder, HtmlFile)) Then
			File.Copy(Starter.InternalFolder, HtmlFile, Starter.SharedFolder, HtmlFile )
		End If
		fExists = True
	End If
	
	If Not(fExists) Then
		If Not(File.Exists(Starter.SharedFolder, HtmlFile)) Then
			If File.Exists(Starter.InternalFolder, HtmlFile) Then
				File.Copy(Starter.InternalFolder, HtmlFile, Starter.SharedFolder, HtmlFile )
				fExists = True
			End If
		Else
			fExists = True
		End If
		If Not(fExists) Then
			If File.Exists(File.DirAssets, HtmlFile) Then
				File.Copy(File.DirAssets, HtmlFile, Starter.SharedFolder, HtmlFile )
				fExists = True
			End If
		End If
	End If
	
	If (fExists) Then
		Dim HTML As String = File.ReadString(Starter.SharedFolder, HtmlFile)
		
		Log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
'		Log(HTML)
		Log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
		
		Dim DATA_NAME As String = ""
		Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Request}'
							and z.relation_tagcode='${CLA.Action}'
							and z.repeatcounter=${CLA.RepeatCounter} 
							ORDER BY z.position, z.repeatcounter"$
		Log(SQL)
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			
			If(ShareCode.APP_DOMAIN.ToLowerCase.Contains("grandative")) Then
				Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
				Dim contracto As String = Utils.IfNullOrEmpty(Record.GetString("contracto"), "")
				If Utils.NNE(contracto) Then
					If Utils.NNE(Reference) Then
						Reference = $"${Reference} (${contracto})"$
					Else
						Reference = $"${contracto}"$
					End If
				End If
				Reference = Utils.IfNullOrEmpty(Reference, "Sem contrato/Prospect")
			Else
				Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "")
			End If
			
			Dim Points As Double = Record.GetDouble("points")
			Dim Inicio As String = Record.GetString("run_start")
			Dim Fim As String = Record.GetString("run_end")
			Dim Duracao As String = Record.GetString("run_time")
			Dim Data As String = Record.GetString("run_date")
			Dim Name As String = Utils.IfNullOrEmpty(Record.GetString("name"), "_")
			Dim RequestType As String = Utils.IfNullOrEmpty(Record.GetString("task_name"), "_")
			Dim RequestNumber As String = Record.GetString("tagcode")
			Dim Morada As String = $"${Record.GetString("address")}, ${Record.GetString("city")}"$
			Dim request_obs As String = Utils.IfNullOrEmpty(Record.GetString("request_obs"), "_")
			Dim Address As String = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
			Dim Address2 As String = Utils.IfNullOrEmpty(Record.GetString("address2"), "_")
			Dim City As String = Utils.IfNullOrEmpty(Record.GetString("city"), "_")
			Dim PostalCode As String = Utils.IfNullOrEmpty(Record.GetString("postal_code"), "_")
			Dim Nif As String = Utils.IfNullOrEmpty(Record.GetString("nif"), "_")
			Dim Contact As String = Utils.IfNullOrEmpty(Record.GetString("contact_name"), "_")
			Dim Phone As String = Utils.IfNullOrEmpty(Record.GetString("phone"), "_")
			Dim tipo_intervencao As String = Utils.IfNullOrEmpty(Record.GetString("tipo_intervencao"), "")
			Dim object_tagcode As String = Record.GetString("object_tagcode")
			Dim status_desc As String = Record.GetString("status_desc")
			
			
			If Utils.Int2Bool(ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST) Then
				Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
						WHERE request_tagcode='${CLA.Request.trim}' And repeatcounter=0"$
			Else
				Dim script As String = $"SELECT req_date as executedatetime from dta_requests WHERE tagcode='${CLA.Request.trim}'"$
			End If
	
			Dim Data As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC(script, "executedatetime"), _
						Record.GetString("run_date"))
			
			' ALTERACAO CAMPOS EDP
			'****************************************************************************************
			'			CODIGO NOVO E A FUNCIONAR CORRECTAMENTE
			'****************************************************************************************

			Dim ENTITY_CLIENT As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_CLIENT_NAME' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			If Utils.NE(ENTITY_CLIENT) Then
				Dim ENTITY_CLIENT As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_CLIENT_NAME'"$, "valor")
			End If
			
			If Utils.NNE(ENTITY_CLIENT) Then Name = ENTITY_CLIENT
						
			Dim ENTITY_NUM_PROCESS As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_PROCESSO_FUNCIONA' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			If Utils.NE(ENTITY_NUM_PROCESS) Then
				Dim ENTITY_NUM_PROCESS As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_PROCESSO_FUNCIONA'"$, "valor")
			End If
						
			Dim ENTITY_NUM_SUBPROCESS As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_NUM_ID' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			If Utils.NE(ENTITY_NUM_SUBPROCESS) Then
				Dim ENTITY_NUM_SUBPROCESS As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_NUM_ID'"$, "valor")
			End If
						
			Dim ENTITY_AUDIT_WORKERS As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_AUDITED_WORKERS' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			If Utils.NE(ENTITY_AUDIT_WORKERS) Then
				Dim ENTITY_AUDIT_WORKERS As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_AUDITED_WORKERS'"$, "valor")
			End If
						
'			Dim ENTITY_MAINT_NAME As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value_title, execute_value) as valor
'						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
'						and item_tagcode='FIELD_EDPC_CONTRACT_MANAGER' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			
			Dim ENTITY_MAINT_NAME As String = DBStructures.GetScriptColumnStrEVC($"Select Case when (execute_value_title Is Null) Or
						(execute_value_title = '') then execute_value
							Else execute_value_title
						end as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_EDPC_CONTRACT_MANAGER' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			
		
			
'			If Utils.NE(ENTITY_MAINT_NAME) Then
'				Dim Temp As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
'					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_EDPC_CONTRACT_MANAGER'"$, "valor")
'				If (Utils.NNE(Temp)) Then
'					Dim ENTITY_MAINT_NAME As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(name, '') as valor
'						from aut_users where tagcode='${Temp.trim}'"$, "valor")
'				End If
'			End If
						
			Dim ENTITY_OBRA_TIPO As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_CATEGORIA' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			If Utils.NE(ENTITY_OBRA_TIPO) Then
				Dim ENTITY_OBRA_TIPO As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_CATEGORIA'"$, "valor")
			End If
						
			Dim ENTITY_AUDIT_COMPANY As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_INSTALADOR' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			If Utils.NE(ENTITY_AUDIT_COMPANY) Then
				Dim ENTITY_AUDIT_COMPANY As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_INSTALADOR'"$, "valor")
			End If
						
			Dim EXECUTION_LOCAL As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_CLIENT_ADDRESS' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			If Utils.NE(EXECUTION_LOCAL) Then
				Dim EXECUTION_LOCAL As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_CLIENT_ADDRESS'"$, "valor")
			End If
						
			Dim TEAM_INSTALLATION As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request}' and task_tagcode = '${CLA.Task}'
						and item_tagcode='FIELD_INSTALLATION_TEAM' and repeatcounter = ${CLA.RepeatCounter}"$, "valor")
			If Utils.NE(TEAM_INSTALLATION) Then
				Dim TEAM_INSTALLATION As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
					from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_INSTALLATION_TEAM'"$, "valor")
			End If
			
			If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP")) Then
				Morada = EXECUTION_LOCAL
				If Morada = "_" Or Morada = "__" Then Morada = ""
			Else
				If Utils.NNE(EXECUTION_LOCAL) Then Morada = EXECUTION_LOCAL
			End If
								
			Dim Object2Name As String = Utils.IfNullOrEmpty(Record.GetString("objectname"), "_")
			
			Dim Technical As String = ShareCode.SESS_OPER_UserName  'Utils.IfNullOrEmpty(Record.GetString("sess_user"), ShareCode.SESS_OPER_User)
			Dim ObjectName As String = Utils.IfNullOrEmpty(Record.GetString("nameobject"), "_")   'objectname"), "_")
			Dim Draft As String = "none"
			Dim status As Int = Record.GetInt("task_status_id")
			If (ShareCode.DEVICE_PARAM_PRINT_DRAFT = 1) Then
				If ((status <=2) Or (status =5)) Then Draft = "block"
			End If
			
			Dim FIELD_AJUDANTE As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value_title, execute_value) as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_AJUDANTE'"$, "valor")
			Dim FIELD_EXPEDENOME As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_EXPEDENOME'"$, "valor")
			Dim FIELD_EXPEDEMORADA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_EXPEDEMORADA'"$, "valor")
			Dim FIELD_EXPEDE_HORA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_EXPEDE_HORA'"$, "valor")
						
			Dim FIELD_DESCARGANOME As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_DESCARGANOME'"$, "valor")
			Dim FIELD_DESCARGAMORADA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_DESCARGAMORADA'"$, "valor")
			Dim FIELD_DESCARGAHORA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_DESCARGAHORA'"$, "valor")
			
			Dim ENTITY_NIF As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
						from dta_objects_fields where object_tagcode in (select object_tagcode from dta_requests where tagcode='${CLA.Request.Trim}')  and field_tagcode='FIELD_NIF'"$, "valor")
						
			Dim EXECUTION_CGR_DATA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_date, '') as valor
							from dta_requests where tagcode='${CLA.Request.Trim}'"$, "valor")
						
			Dim EXECUTION_CGR_NUMBER As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(process_number, '') as valor
							from dta_requests where tagcode='${CLA.Request.Trim}'"$, "valor")
							
			Dim ENTITY_NIF2 As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
						from dta_objects_fields where object_tagcode in (select entity_tagcode from dta_requests where tagcode='${CLA.Request.Trim}')  
						and field_tagcode='FIELD_NIF'"$, "valor")
			Dim OBJECT_TITLE2 As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(title_import, '') as valor
						from dta_objects where tagcode in (select object_tagcode from dta_requests where tagcode='${CLA.Request.Trim}')"$, "valor")
			Dim OBJECT_SERIAL2 As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
						from dta_objects_fields where object_tagcode in (select object_tagcode from dta_requests where tagcode='${CLA.Request.Trim}')  
						and field_tagcode='FIELD_2019_080502'"$, "valor")
			Dim OBJECT_BRAND2 As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
						from dta_objects_fields where object_tagcode in (select object_tagcode from dta_requests where tagcode='${CLA.Request.Trim}')  
						and field_tagcode='FIELD_MARCA'"$, "valor")
			Dim OBJECT_MODEL2 As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
						from dta_objects_fields where object_tagcode in (select object_tagcode from dta_requests where tagcode='${CLA.Request.Trim}')  
						and field_tagcode='FIELD_MAQUINA'"$, "valor")
			Dim OBJECT_LOCAL2 As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
						from dta_objects_fields where object_tagcode in (select object_tagcode from dta_requests where tagcode='${CLA.Request.Trim}')  
						and field_tagcode='FIELD_LOCALIZACAO'"$, "valor")
	
			'***************************************************************
			Dim FIELD_DOCUMENTO As String = ""
			Dim LOCAL_CARGA As String = ""
			Dim HORA_CARGA As String = ""
			Dim PESO_CARGA As String = ""
			Dim LOCAL_DESCARGA As String = ""
			Dim FIELD_CODIGO_AT As String = ""
			Dim FIELD_TIPO_MAT As String = ""
			Dim FIELD_CUSTOMER_NAME As String = ""
			Dim FIELD_MATRICULA As String = ""
			
			Dim FIELD_DOCUMENTO As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='FIELD_DOCUMENTO'"$, "execute_value"),"")
		
			Dim LOCAL_CARGA As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value_title from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='LOCAL_CARGA'"$,  "execute_value_title"),"")
		
			Dim HORA_CARGA As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='HORA_CARGA'"$,  "execute_value"),"")
		
			Dim HORA_DESCARGA As String = "23:00"
		
			If Utils.NNE(HORA_CARGA) Then
				HORA_DESCARGA = Utils.SetNHours(2,HORA_CARGA)
			End If
		
			Dim PESO_CARGA As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='PESO_CARGA'"$,  "execute_value"),"")
		
			Dim LOCAL_DESCARGA As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value_title from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='LOCAL_DESCARGA'"$,  "execute_value_title"),"")
		
			Dim FIELD_CODIGO_AT As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='FIELD_CODIGO_AT'"$,  "execute_value"),"")
		
			Dim FIELD_PHC_NUMBER As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='FIELD_PHC_NUMBER'"$,  "execute_value"),"")
			
		
			Dim FIELD_TIPO_MAT As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value_title from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='FIELD_TIPO_MAT'"$,  "execute_value_title"),"")
		
			Dim FIELD_CUSTOMER_NAME As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
									where request_tagcode='${CLA.Request.trim}' and task_tagcode='${CLA.Action.trim}'
									and item_tagcode='FIELD_CUSTOMER_NAME'"$,  "execute_value"),"")
		
				
			Dim FIELD_MATRICULA As String = ""
			Dim vehicle As String = ""
			Dim vmodel As String = ""
			Dim tagcode As String = ""
			Dim vehicle_tagcode As String = ""
			Dim nSQL As String = $"Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo,  ifnull(a.vehicle_tagcode,'') As vehicle_tagcode,
				ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, a.*
				from dta_technicals as a
				left join dta_objects as d on (d.tagcode=a.vehicle_tagcode)
				left join dta_objects_fields as e1 on (e1.object_tagcode=d.tagcode and e1.field_tagcode='FIELD_MARCA')
				left join dta_objects_fields as e2 on (e2.object_tagcode=d.tagcode and e2.field_tagcode='FIELD_MODELO')
				left join dta_objects_fields as e3 on (e3.object_tagcode=d.tagcode and e3.field_tagcode='FIELD_MATRICULA')
				left join dta_objects_fields as e4 on (e4.object_tagcode=d.tagcode and e4.field_tagcode='FIELD_KM')
				where a.tagcode='${ShareCode.SESS_User}'"$  
			Try
				Dim Recordsss As Cursor = Starter.LocalSQLEVC.ExecQuery(nSQL)
				Dim tagcode As String = ""
				If Recordsss.RowCount > 0 Then
					Recordsss.Position = 0
					Dim FIELD_MATRICULA As String = Utils.IfNullOrEmpty(Recordsss.GetString("vmatricula"), "")
					Dim vehicle As String = Utils.IfNullOrEmpty(Recordsss.GetString("vmarca"), "")
					Dim vmodel As String = Utils.IfNullOrEmpty(Recordsss.GetString("vmodelo"), "")
					Dim tagcode As String = Utils.IfNullOrEmpty(Recordsss.GetString("tagcode"), "")
					Dim vehicle_tagcode As String = Utils.IfNullOrEmpty(Recordsss.GetString("vehicle_tagcode"), "")
				End If
				Recordsss.Close
			Catch
				Log(LastException)
			End Try

			HTML = HTML.Replace(":__FIELD_DOCUMENTO", FIELD_DOCUMENTO)
			HTML = HTML.Replace(":__LOCAL_CARGA", LOCAL_CARGA)
			HTML = HTML.Replace(":__HORA_CARGA", HORA_CARGA)
			HTML = HTML.Replace(":__HORA_DESCARGA", HORA_DESCARGA)
			HTML = HTML.Replace(":__PESO_CARGA", PESO_CARGA)
			HTML = HTML.Replace(":__LOCAL_DESCARGA", LOCAL_DESCARGA)
			HTML = HTML.Replace(":__FIELD_CODIGO_AT", FIELD_CODIGO_AT)
			HTML = HTML.Replace(":__FIELD_PHC_NUMBER", FIELD_PHC_NUMBER)
			HTML = HTML.Replace(":__FIELD_TIPO_MAT", FIELD_TIPO_MAT)
			HTML = HTML.Replace(":__FIELD_CUSTOMER_NAME", FIELD_CUSTOMER_NAME)
			HTML = HTML.Replace(":__FIELD_MATRICULA", FIELD_MATRICULA)
			HTML = HTML.Replace(":__EXECUTION_STATUS_DESC", EXECUTION_CGR_NUMBER)
			HTML = HTML.Replace(":__REQUEST_PRIORITY", "")
'			HTML = HTML.Replace(":__OBJECT_FIELD_SERIAL", OBJECT_SERIAL2)
			HTML = HTML.Replace(":__OBJECT_TITLE", OBJECT_TITLE2)
'			HTML = HTML.Replace(":__OBJECT_FIELD_BRAND", OBJECT_BRAND2)
'			HTML = HTML.Replace(":__OBJECT_FIELD_MODEL", OBJECT_MODEL2)
			HTML = HTML.Replace(":__OBJECT_LOCATION", OBJECT_LOCAL2)
			HTML = HTML.Replace(":__EXECUTION_ADDRESS", Address)
			
			If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP")) Then
				HTML = HTML.Replace(":__EXECUTION_LOCAL", Morada)
			Else
				HTML = HTML.Replace(":__EXECUTION_LOCAL", $"${PostalCode} ${City}"$)
			End If
			
			HTML = HTML.Replace(":__ENTITY_PHONE", Phone)
			HTML = HTML.Replace(":__ENTITY_NIF", ENTITY_NIF2)
			HTML = HTML.Replace(":__ENTITY_LIN", "")
			HTML = HTML.Replace(":__ENTITY_APROVAL", "")
			HTML = HTML.Replace(":__EXECUTION_CGR_NUMBER", EXECUTION_CGR_NUMBER)
			HTML = HTML.Replace(":__EXECUTION_CGR_DATA", EXECUTION_CGR_DATA)
			HTML = HTML.Replace(":__ENTITY_NIF", ENTITY_NIF)
			HTML = HTML.Replace(":__ENTITY_PHONE", "")
			HTML = HTML.Replace(":__EXPEDIDOR_NAME", FIELD_EXPEDENOME)
			HTML = HTML.Replace(":__EXPEDIDOR_LOCAL", FIELD_EXPEDEMORADA)
			HTML = HTML.Replace(":__DESTINATARIO_NAME", FIELD_DESCARGANOME)
			HTML = HTML.Replace(":__DESTINATARIO_LOCAL", FIELD_DESCARGAMORADA)
			HTML = HTML.Replace(":__EXECUTION_NUMBER", RequestNumber)
			HTML = HTML.Replace(":__REPORT_NAME", RequestType)
			HTML = HTML.Replace(":__EXECUTION_RESULT", status_desc)
			HTML = HTML.Replace(":__EXECUTION_POINTS", Points)
			HTML = HTML.Replace(":__REQUEST_TYPE", tipo_intervencao)
			HTML = HTML.Replace(":__EXECUTION_DATE", Data)
			HTML = HTML.Replace(":__ENTITY_NAME", Name)
			HTML = HTML.Replace(":__EXECUTION_START",Utils.IfNullOrEmpty(Inicio,Utils.GetCurrentTime))
			HTML = HTML.Replace(":__EXECUTION_END", Fim)
			HTML = HTML.Replace(":__EXECUTION_TIME", Duracao)
			HTML = HTML.Replace(":__REPORT_DATE_TIME", Utils.GetCurrDatetime)
			HTML = HTML.Replace(":__REQUEST_OBS", request_obs)
			HTML = HTML.Replace(":__REPORT_INFO_VERSION", "VRCH_STD_DEMO_1")
			HTML = HTML.Replace(":__CURRENT_PAGE", "1")
			HTML = HTML.Replace(":__EXECUTION_START", Inicio)
			HTML = HTML.Replace(":__ENTITY_UNITY", ObjectName)
			HTML = HTML.Replace(":__EXECUTE_OBJECT", ObjectName)
			
			If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "RESOPRE" Or ShareCode.APPL_ACCOUNT.ToUpperCase = "VFDSEGP")) Then
				HTML = HTML.Replace(":__ENTITY_UNITY", Object2Name)
				HTML = HTML.Replace(":__EXECUTE_OBJECT", Object2Name)
			End If
			
			HTML = HTML.Replace(":__EXECUTE_NUMBER", RequestNumber)
			HTML = HTML.Replace(":__EXECUTE_STARTDATE", Data)
			HTML = HTML.Replace(":__EXECUTE_ENTITY", Name)
			HTML = HTML.Replace(":__EXECUTE_STARTTIME", Inicio)
			HTML = HTML.Replace(":__EXECUTE_ADDRESS", Morada)
			HTML = HTML.Replace(":__EXECUTE_ENDTIME", Fim)
			HTML = HTML.Replace(":__EXECUTION_START", Inicio)
			HTML = HTML.Replace(":__EXECUTE_TECHNICAL", Technical)
			HTML = HTML.Replace(":__EXECUTE_CODPOSTAL", "")
			HTML = HTML.Replace(":__EXECUTE_LOCAL", "")
			HTML = HTML.Replace(":__EXECUTE_LATITUDE", "")
			HTML = HTML.Replace(":__EXECUTE_LONGITUDE", "")
			HTML = HTML.Replace(":__EXECUTE_VEHICLE", "")
			HTML = HTML.Replace(":__EXECUTE_DATETIME", "")
			HTML = HTML.Replace(":__EXECUTE_ENDDATE", "")
			HTML = HTML.Replace(":__EXECUTE_TYPEREQUEST", "")
			HTML = HTML.Replace(":__EXECUTE_CHECKLIST_1", "")
			HTML = HTML.Replace(":__EXECUTE_CHECKLIST_2", "")
			HTML = HTML.Replace(":__EXECUTE_CHECKLIST_3", "")
			HTML = HTML.Replace(":__EXECUTION_DATETIME", Utils.GetCurrDatetime)
			HTML = HTML.Replace(":__TECHNICAL_NAME1", "")
			HTML = HTML.Replace(":__TECHNICAL_NAME2", "")
			HTML = HTML.Replace(":__TECHNICAL_NAME", Technical)
			HTML = HTML.Replace(":__CONTRACT", Reference)
			HTML = HTML.Replace(":__DISPLAY_DRAFT", Draft)
			HTML = HTML.Replace(":__ENTITY_OBJECT", Object2Name)  'ObjectName)
			HTML = HTML.Replace(":__ENTITY_MAINT_NAME", ENTITY_MAINT_NAME)
			HTML = HTML.Replace(":__ENTITY_CONTRACT", Reference)
			HTML = HTML.Replace(":__ENTITY_NUM_PROCESS", ENTITY_NUM_PROCESS)
			HTML = HTML.Replace(":__ENTITY_NUM_SUBPROCESS", ENTITY_NUM_SUBPROCESS)
			HTML = HTML.Replace(":__ENTITY_OBRA_TIPO", ENTITY_OBRA_TIPO)
			HTML = HTML.Replace(":__ENTITY_AUDIT_COMPANY", ENTITY_AUDIT_COMPANY)
			HTML = HTML.Replace(":__ENTITY_AUDIT_WORKERS", ENTITY_AUDIT_WORKERS)
			HTML = HTML.Replace(":__ENTITY_CLIENT", Name)
			HTML = HTML.Replace(":__TEAM_INSTALLATION", TEAM_INSTALLATION)
			HTML = HTML.Replace(":__ADDRESS", Address)
			HTML = HTML.Replace(":__ADDRESS_DETAILS", Address2)
			HTML = HTML.Replace(":__POSTAL_CODE", PostalCode)
			HTML = HTML.Replace(":__LOCAL_CITY", City)
			HTML = HTML.Replace(":__NIF_NUMBER", Nif)
			HTML = HTML.Replace(":__PHONE_NUMBER", Phone)
			HTML = HTML.Replace(":__WEEK_DAY", "_")
			HTML = HTML.Replace(":__CLCT_CODE", "_")
			HTML = HTML.Replace(":__BEST_HOUR", "_")
			HTML = HTML.Replace(":__CONTACT_NAME", Contact)
			HTML = HTML.Replace(":__REPORT_NUMBER", RequestNumber)
			HTML = HTML.Replace(":____SERVICE_01", RequestType)
			HTML = HTML.Replace(":__SERVICE_02", "_")
			HTML = HTML.Replace(":__SERVICE_03", "_")
			HTML = HTML.Replace(":__DEPARTMENT", ObjectName)
			HTML = HTML.Replace(":__NAME", Name)
			HTML = HTML.Replace(":__FUNCTION", Reference)
			HTML = HTML.Replace(":__YEAR", "")
			HTML = HTML.Replace(":__MONTH", "")
			HTML = HTML.Replace(":__NUMBER", "")
			HTML = HTML.Replace(":__OBSERVATIONS", "")
			
			' DTA_CONTACTS
						
'			HTML = HTML.Replace(":__CONTACTOBJ_NAME", "")
'			HTML = HTML.Replace(":__CONTACTOBJ_EMAIL", "")
'			HTML = HTML.Replace(":__CONTACTOBJ_PHONE", "")
'			HTML = HTML.Replace(":__FIELD_TREATMENT", "")
			
			
			' *******************************************************************************************************
			' TIP : SUBRELATORIO PARA APRESENTACAO DE DADOS
			' VALIDA SE CHECKLIST TEM ASSOCIAÇÃO COM OUTRO TIPO DE OBJECTOS (DESCENTENTES/ASCENDENTES) PARA
			' APRESENTAÇÃO DE DADOS NO RELATÓRIOS. CONFIGURAÇÕES EXISTENTES NA COLUNA "PARAMTERS" DA TABELA DTA_TASKS_ADDS
			' *******************************************************************************************************
			If Utils.NNE(object_tagcode) And Not(object_tagcode = "__NONE__") Then
				Dim Paramters As String = DBStructures.GetScriptColumnStrEVC($"select paramters from dta_tasks_adds where tagcode='${CLA.Action.Trim}'"$, "paramters")
				If Utils.NNE(Paramters) Then
					Log(Paramters)
					Dim JSONMAP As Map = Utils.JSON2MAP(Paramters)
					Try
						Dim report_descendents As Int = Utils.IfNullOrEmpty(JSONMAP.Get("report_descendents"),"0")
					Catch
						Log(LastException)
						Dim report_descendents As Int = 0
					End Try
					'
					If Utils.Int2Bool(report_descendents) Then
						Dim report_desc_settings As Map = JSONMAP.Get("report_desc_settings")
						Dim from As Int = report_desc_settings.Get("from")
						Dim multiple As Int = report_desc_settings.Get("multiple")
						Dim file_part As String = report_desc_settings.Get("file_part")
						Dim group_types As String = report_desc_settings.Get("group_types")
						Dim Data2Replace As String = "<div><div>:__VALUETOREPLACE</div></div>"
						If Utils.NNE(file_part) And File.Exists(Starter.InternalFolder, file_part) Then
							Dim Data2Replace As String = File.ReadString(Starter.InternalFolder, file_part)
						End If
						Dim DataGroup As String = ""
						Dim fields_list As List = report_desc_settings.Get("fields_list")
					
						Dim sQ1 As String = ""
						If Utils.NNE(group_types) Then
							sQ1 = $" and a.child_tagcode in (select distinct tagcode from dta_objects
								 where object_type in ${Utils.StrList2SQLArray(Utils.Str2List(group_types, "|"))})"$
						End If
					
						Dim ObjDescFindSQL As String = $"select distinct a.child_tagcode as object_tagcode
													from dta_objects_relations as a
													where a.parent_tagcode='${object_tagcode}' ${sQ1}"$
						Dim ObjDesc As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjDescFindSQL)
						
						If (ObjDesc.RowCount >=1) Then
							For i=0 To ObjDesc.RowCount-1
								ObjDesc.Position = i
								
								
								Dim ThisObjTagCode As String = ObjDesc.Getstring("object_tagcode")
								
								Log($"posicao:${i} / ThisObjTagCode${ThisObjTagCode}"$)
								
								Dim DataReplace As String = Data2Replace
								For Each colfields_list As Map In fields_list
									Dim fieldname As String = colfields_list.Get("fieldname")
									Dim bookmark As String = colfields_list.Get("bookmark")
									Dim outputname As String = colfields_list.Get("outputname")
									Dim is_location As Int = colfields_list.Get("is_location")
									Dim is_additional As Int = colfields_list.Get("is_additional")
									Dim is_contact As Int = colfields_list.Get("is_contact")
									Dim title_import As String = ""
									
									If Utils.Int2Bool(is_additional) Then
										
										
										Dim valueSTR As String = DBStructures.GetScriptColumnStrEVC($"select value from dta_objects_fields
																	where object_tagcode='${ThisObjTagCode.Trim}'
																	and field_tagcode='${outputname.Trim}' "$, "value")
									else If Utils.Int2Bool(is_location) Then
										Dim valueSTR As String = DBStructures.GetScriptColumnStrEVC($"select ${fieldname.Trim}
																	from dta_locations
																	where tagcode in (select local_tagcode from dta_objects
																	where tagcode='${ThisObjTagCode.Trim}') "$, fieldname.Trim)
									else If Utils.Int2Bool(is_contact) Then
										Dim valueSTR As String = DBStructures.GetScriptColumnStrEVC($"select ${fieldname.Trim}
																	from dta_contacts
																	where tagcode in (select contact_tagcode from dta_objects_contacts
																	where object_tagcode='${ThisObjTagCode.Trim}') "$, fieldname.Trim)
									Else
										Dim valueSTR As String = DBStructures.GetScriptColumnStrEVC($"select b.title as objecttype_desc, a.*
																	from dta_objects as a
																	inner join dta_objecttypes as b on (b.tagcode=a.object_type)
																	where a.tagcode='${ThisObjTagCode.Trim}'"$, fieldname.Trim)
									End If
'									TIP : VERIFICA SE O VALUE RETORNADO E UM INDICE E NAO O VALOR FINAL
									Try
										Dim is_index As String = colfields_list.Get("is_index")
										
										If Utils.Int2Bool(is_index) Then
											title_import  = DBStructures.GetScriptColumnStrEVC($"SELECT title_import FROM dta_objects
											where tagcode ='${ThisObjTagCode.Trim}'"$,"title_import")
											If Utils.NNE(title_import) Then
												valueSTR = title_import
											End If
										End If
									Catch
										Log(LastException)
									End Try
																				 
									valueSTR=Utils.IfNullOrEmpty(valueSTR,"&nbsp;")
									 									
									DataReplace = DataReplace.Replace($":${bookmark.ToUpperCase}"$, valueSTR)
									
								Next
								DataGroup = $"${DataGroup} ${DataReplace}"$
							Next
						End If
						ObjDesc.Close
						
						DataGroup = DataGroup.Replace(":__VALUETOREPLACE", "")
						HTML = HTML.Replace(":__DESCENDENTS_OBJECTS", DataGroup)
					End If
				End If
			End If
			
			Dim checkRes As ResumableSub = ReportRunParamterInQuery(CLA, HTML, object_tagcode, True)
			Wait For (checkRes) Complete (dataHtmlReturn As String)
			
			If Utils.NNE(dataHtmlReturn) Then
				HTML = dataHtmlReturn
			End If
			
			
			HTML = HTML.Replace(":__MARK1_XVALUE", MarkXValue1)
			HTML = HTML.Replace(":__MARK2_XVALUE", MarkXValue2)
			HTML = HTML.Replace(":__MARK3_XVALUE", MarkXValue3)
			HTML = HTML.Replace(":__MARK4_XVALUE", MarkXValue4)
			HTML = HTML.Replace(":__MARK5_XVALUE", MarkXValue5)
					
			HTML = ReportSetOtherFields(HTML, CLA)
			
			Log("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
'			Log(HTML)
			
			
			' *******************************************************************************************************
			' IDENTIFICAR O OBJECTO DE ANÁLISE E
			'	1) IDENTIFICAR TODAS AS RELAÇÕES COM CAMPOS ADICIONAIS (DTA_OBJECTS_FIELDS)
			'   2) IDENTIFICAR O PRIMEIRO CONTACTO DO OBJECTO (DTA_OBJECTS_CONTACTS->DTA_CONTACTS)
			'   3) IDENTIFICAR OS CAMPOS EXTRA DO PRÓPRIO OBJECTO ALÉM DO NOME (REFERÊNCIA, OBS, ...
			'   4) IDENTIFICAR OS CAMPOS DA MORADA E RELACIONADOS (LOCAL_TAGCODE -> DTA_LOCATIONS)
			' *******************************************************************************************************
			Dim object_tagcode As String = Utils.IfNullOrEmpty(Record.GetString("object_tagcode"), "")
						
			Dim ObjsSQL As String = $"select * from dta_objects as obj
									left join dta_locations as loc on loc.tagcode = obj.local_tagcode
									left JOIN dta_objects_contacts as ocnt on ocnt.object_tagcode = obj.tagcode 
									left join dta_contacts as cnt on cnt.tagcode = ocnt.contact_tagcode
									where obj.tagcode = '${object_tagcode}'"$
									
			'left JOIN (select TOP 1 * from dta_contacts) As cnt on cnt.tagcode = ocnt.contact_tagcode
			
			Dim RsRelObj As Cursor = Starter.LocalSQLEVC.ExecQuery(ObjsSQL)
			
			'*******************************************************************************
			' Correccao do erro reportado pelo Celso no report em 20/04/2020
			'*******************************************************************************
			If (RsRelObj.RowCount >= 1) Then
				RsRelObj.Position = 1
				
				If RsRelObj.RowCount = 1 Then
					RsRelObj.Position = 0 ' Se rowcount for 1, tem de atribuir a position 0 e nao 1
				End If
				
				RsRelObj.GetString("name")
				RsRelObj.GetString("details")
				RsRelObj.GetString("email")
				RsRelObj.GetString("phone")
				RsRelObj.GetString("mobile")
				RsRelObj.GetString("address")
				RsRelObj.GetString("local")
				RsRelObj.GetString("postalcode")
			End If
			
			RsRelObj.Close
			
			' *******************************************************************************************************
			'IGUAL AO COMENTARIO DE CIMA
			' *******************************************************************************************************
			Dim entity_tagcode As String = Utils.IfNullOrEmpty(Record.GetString("requester_tagcode"), "")
			
			' *******************************************************************************************************
			' IDENTIFICAR A INTERVENÇÃO (CABEÇALHO)
			'	1) IDENTIFICAR TODAS AS RELAÇÕES COM CAMPOS ADICIONAIS (DTA_REQUESTS_FIELDS)
			' *******************************************************************************************************
			Dim request_tagcode As String = Utils.IfNullOrEmpty(CLA.Request, "")

			' ************************************************************************
			' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
			' ***********************************************************************
			Dim PointCounter As Int = 1
			Dim ImageCounter As Int = 0
			Dim DATA_NAME As String = ""
			Private objRecord As Cursor
			Dim Rows As Int = 0
			
			'*******************************************************************************************
			' FUNCAO QUE DEVOLVE OS SCRIPS SQL, PARA RETIRAR CODIGO DESTA SUB, DEVIDO A ERRO DO DEBUG
			'*******************************************************************************************
			Dim dataSQL As String = GenerateReportSQLScripts(CLA,"DETALHE1")
			Dim PseudoChild As Int = 0
			objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
			If objRecord.RowCount > 0 Then
				Dim LineCounter As Int = 1
				Dim RecordRowCount As Int = 0
				For Rows =0 To objRecord.RowCount-1
					objRecord.Position = Rows
					Dim CHAPTER_NAME As String = ""
					Dim QUEST_NAME As String = ""
					
					Dim BBullet As Int = objRecord.GetInt("bullet_master")
					Dim CBullet As Int = objRecord.GetInt("bullet_child")
								
					Dim repeatfieldcounter As Int = objRecord.GetInt("repeatfieldcounter")
					Dim vDesc As String = objRecord.GetString("val_desc")
					Dim xTitle As String = objRecord.GetString("title")
					Dim title_2 As String = objRecord.GetString("title_2")
								
'					Log($"rfc= ${repeatfieldcounter} - ${BBullet} : ${CBullet} : ${xTitle} : ${xTitle2} : ${vDesc}"$)
					
					Dim Marca As Boolean = True
					If (BBullet = 1) And (ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP") Then
						Marca = False
					End If
				
					If (Marca) Then
						Dim Level As Int = objRecord.GetInt("level")
'						Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
						If (Level = 0) Then
							PointCounter = PointCounter + 1
							LineCounter = 1

							Dim borderBottom As String = $"border-bottom: 1px solid silver;"$
							If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP")) Then
								Dim borderBottom As String = $"border-bottom: 1px solid #72C4BA;"$
							End If
							Dim borderRight As String = $"border-right: 1px solid silver;"$
							If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP")) Then
								Dim borderRight As String = $"border-right: 1px solid #72C4BA;"$
							End If
							
							CHAPTER_NAME = $"<table style="width:100%;" class="table">
												<thead>
													<tr>
														<th style="${borderBottom}width:50%;text-align: left;${borderRight}padding: 4px 6px;">${objRecord.GetInt("bullet_master")}. ${objRecord.GetString("title")}</th>
														<th style="${borderBottom}width:25%;text-align: left;${borderRight}padding: 4px 6px;">Resposta</th>
														<th style="${borderBottom}width:25%;text-align: left;${borderRight}padding: 4px 6px;">Observações</th>
													</tr>
												</thead>
												<tbody>"$


						Else
							
							Dim uk As String = objRecord.GetString("unique_key")
							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim datatype As String = objRecord.GetString("datatype")
							
							If Utils.NNE(title_2) And datatype = "23" Then
								sVal = objRecord.GetString("execute_value")
							End If
							
							Dim scolor As String = "#ffffff"
					
							
							Dim sNotes As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
							
'							'******************************************************************************************************
'							' ALTERACAO PC - VERIFICACAO DE NAO CONFORMITADES DE ACORDO COM O type_conformity E ATRIBUICAO DA COR
'							'******************************************************************************************************

							Dim type_conformity As String = Utils.IfNullOrEmpty(objRecord.GetString("type_conformity"), "")
							If Utils.NNE(type_conformity) Then
								Dim color As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select color from type_conformitytypes where tagcode = '${type_conformity}'"$,"color"),"white")
							Else
								color = "white"
							End If
							
							scolor = Utils.Color2Hex(color)
							
														
							Try
								Dim ttitle As String = objRecord.GetString("title")
								Dim ttitle2 As String = objRecord.GetString("title_2")
								If (Utils.NNE(ttitle2)) Then
									ttitle = ttitle2
								End If
								LineCounter = LineCounter + 1

								' ************************************************************************
								' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
								' ************************************************************************
								
								Dim sSQL2 As String = $"select count(0) as total from dta_requests_values_images as a
													where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
													and a.unique_key='${uk}' 
													and a.repeatcounter=${CLA.RepeatCounter}
													and a.repeatfieldcounter=${repeatfieldcounter}
													And a.on_report=1"$
								Dim totalImages As Int = DBStructures.GetScriptColumnIntEVC(sSQL2, "total")
								Dim TotalDesc As String = ""
								If (totalImages >=1) Then
									TotalDesc = " (Imagens ...)"
									sNotes = $"${sNotes}${TotalDesc}"$
								End If
								
								Dim borderBottom As String = $""$
								If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "EDP")) Then
									Dim borderBottom As String = $"border-bottom: 1px solid #B5B9BA;"$
								End If
								'TIP: PRENECHE OS DETALHES DO RELATORIO
								QUEST_NAME = $"<tr ${borderBottom}>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;">
												${objRecord.GetInt("bullet_master")}.${objRecord.GetInt("bullet_child")}. ${ttitle.Trim}</td>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;background-color:${scolor};">${sVal}</td>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;">${sNotes}</td>
											</tr>"$
							Catch
								Log(LastException)
							End Try

						End If
						DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
					End If
					RecordRowCount=RecordRowCount+1
					
				Next
			End If
			objRecord.Close
		End If

		DATA_NAME = $"${DATA_NAME}</tbody> </table><div class="col-12">&nbsp;</div>"$
		HTML = HTML.Replace(":__DATA_NAME", DATA_NAME)

		Sleep(50)
		Dim SHOW_IMAGES As String = "display:none;"
		Dim IMAGES As String = ""
		Private Record2 As Cursor
		'imageb64|
		' ************************************************************************
		' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
		' ************************************************************************
		Dim sSQL As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename, b.bullet_master, b.bullet_child
					from dta_requests_values_images as a
					left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
					b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
					where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
					and a.repeatcounter=${CLA.RepeatCounter}
					and a.on_report=1 order by a.id"$
					
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)
		Try

			If Record2.RowCount > 0 Then
				SHOW_IMAGES  = "display:block;"

				For n=0 To Record2.RowCount-1
					Record2.Position = n
				
					Dim image As String = Utils.IfNullOrEmpty(Record2.GetString("imageb64"), "")
					Dim imagename As String = Utils.IfNullOrEmpty(Record2.GetString("imagename"), "")
									
					ImageCounter = ImageCounter + 1
					If Utils.NE(image) Then
						If Utils.NNE(imagename) Then
							Dim image As String = Utils.ConvertImageSizeFromFileWH(imagename, ImageCounter, 320dip, 240dip)
						End If
					Else
						Dim image As String = Utils.ConvertImageSizeWH(image, ImageCounter, 320dip, 240dip)
					End If
			
					IMAGES = $"${IMAGES}<div class="col-6" style="text-align="center;">
					<img src="data:image/png;base64,${image}" width="250" /><br>
						Imagem ${ImageCounter} - Ponto ${Record2.GetInt("bullet_master")}.${Record2.GetInt("bullet_child")},
					</div>"$

				Next
			End If
					
		Catch
			Record2.Close
			Log(LastException)
		End Try
		Record2.Close
		
		If Utils.NNE(IMAGES) Then
			IMAGES = $"<div class="col-12" style="text-align:center;"><div class="row">${IMAGES}</div></div>"$
		End If
		
		HTML = HTML.Replace(":__SHOW_IMAGES", SHOW_IMAGES)
		HTML = HTML.Replace(":__IMAGES", IMAGES)

		' ************************************************************************
		' PEGA NA LISTA DE NÃO CONFORMIDADES
		' ************************************************************************
		Dim SHOW_NON_CONFORMITY As String = "display:none;"
		Dim NON_CONFORMITY As String = ""
		Private Record As Cursor
				
		'*******************************************************************************************
		' FUNCAO QUE DEVOLVE OS SCRIPS SQL, PARA RETIRAR CODIGO DESTA SUB, DEVIDO A ERRO DO DEBUG
		'*******************************************************************************************
		Dim SQL As String = GenerateReportSQLScripts(CLA,"NAOCONFORMIDADES")
		
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			SHOW_NON_CONFORMITY = "display:block;"
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim execute_action As String = Record.GetString("execute_action")
				Dim type_conformity As String = Utils.IfNullOrEmpty(Record.GetString("type_conformity"),"")
			
				If type_conformity = "TCTT_002" Or Utils.NNE(execute_action) Then
					Dim textoNC As String = Utils.IfNullOrEmpty(Record.GetString("atype"), "")
					If Utils.NNE(textoNC) Then
						textoNC = $" <strong>[${textoNC}]</strong>"$
					End If
					NON_CONFORMITY = $"${NON_CONFORMITY}<div class="col-12">${Record.GetInt("bullet_master")}.${Record.GetInt("bullet_child")}. ${Record.GetString("title")} ${textoNC}</div>"$
				End If
			
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
		Dim SIGNATURE_TERCEIRO As String = ""
				
		Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFrom(CLA, 1)
		Dim SIGANTURE_ENTITY_TECHNICAL As String = SignatureRequestFrom(CLA, 2)
		HTML = HTML.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
		HTML = HTML.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		HTML = HTML.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		Private Recordw As Cursor
		Dim Rows As Int = 0
		Dim SQL As String = $"select * from dta_requests_signatures where request_tagcode='${CLA.Request.Trim}'
							and inner_request_tagcode='${CLA.Action.Trim}' and repeatcounter=${CLA.RepeatCounter}"$
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			Dim SHOW_SIGNATURES As String = "display:block;"
			For Rows = 0 To Recordw.RowCount-1
				Recordw.Position = Rows
				If (Recordw.GetInt("from_who") = 0) Then
					SIGNATURE_CLIENT = $"${Recordw.GetString("image")}"$
				Else If (Recordw.GetInt("from_who") = 1) Then
					SIGNATURE_TECHNICAL = $"${Recordw.GetString("image")}"$
				Else If (Recordw.GetInt("from_who") = 2) Then
					SIGNATURE_TERCEIRO = $"${Recordw.GetString("image")}"$
				End If
			Next
		End If
		Recordw.Close
		HTML = HTML.Replace(":__SHOW_SIGNATURES", SHOW_SIGNATURES)
		HTML = HTML.Replace(":__SIGNATURE_CLIENT", SIGNATURE_CLIENT)
		HTML = HTML.Replace(":__SIGNATURE_TECHNICAL", SIGNATURE_TECHNICAL)
		
		HTML = HTML.Replace(":__SIGNATURE_ORDER01", SIGNATURE_CLIENT)
		HTML = HTML.Replace(":__SIGNATURE_ORDER02", SIGNATURE_TECHNICAL)
		HTML = HTML.Replace(":__SIGNATURE_ORDER03", SIGNATURE_TERCEIRO)
		
		
		Sleep(50)
		
		Dim DATA_ADDITIONAL As String = $"<div class="col-12">&nbsp;</div><div class="col-12">&nbsp;</div>"$
		HTML = HTML.Replace(":__DATA_ADDITIONAL", DATA_ADDITIONAL)
		Sleep(50)
		
		Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
		File.WriteString(Starter.SharedFolder, $"${FileReport}.html"$, HTML)
		Sleep(500)
		
		Dim ReportContinue As Boolean = File.Exists(Starter.SharedFolder, $"${FileReport}.html"$)
		If ReportContinue Then
			Dim theFile As String = $"${FileReport}.html"$
			CurrentFile = $"${FileReport}.html"$
			Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
			Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
		
			Wait For(CallReportAPIFile(CLA.Request, theFile)) Complete (ReportAPIFile As Boolean)

			ProgressDialogHide
			ProgressDialogShow(ShareCode.reportsMsgGeralRelatorioCarregaFicheiro)
		
			If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
				Wait For(CopyReportFileToShared(theFile)) Complete (ReportCopyFile As Boolean)
				Wait For(UploadReportFileToServer(theFile)) Complete (ReportUploadFile As Boolean)
			End If
			
			Dim sSQL As String = $"update dta_requests set file_report='${theFile}' where tagcode='${CLA.Request.Trim}'"$
			Utils.SaveSQLToLog("GenerateReport",sSQL, CLA.Request)
		End If
		
		If (File.Size(Starter.SharedFolder ,$"${FileReport}.html"$) < 20000000) Then
			
'			If (ShareCode.EmailOldModel = True) Then
'				ToastMessageShow("Envio de email ...", False)
'			End If
			Dim ShowReport As Boolean = True
			Try
				Dim ThisStringReport As String = File.ReadString(Starter.SharedFolder ,$"${FileReport}.html"$)
			Catch
				Log(LastException)
				ShowReport = False
			End Try
			ReportProgress.Visible = False
			If ShowReport Then
				Try
					ReportView.LoadHtml(ThisStringReport)
				Catch
					MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
					Log(LastException)
				End Try
			End If
		Else
			MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
		End If

		ProgressDialogHide
	Else
		Msgbox2Async(ShareCode.reportsErroAbrirTemplate, ShareCode.GeneralAlertTitle,"OK","","",Null,False)
		Wait For Msgbox_Result (Result As Int)
		ProgressDialogHide
		butClose_Click
	End If
End Sub
'
Sub OLD_ReportRunParamterInQuery(CLA As RequestCLA, OriginalHTML As String, object_tagcode As String, overwrite As Boolean) As ResumableSub
'	Dim RetHtml As String = ""
'	Dim innerHTML As String = OriginalHTML
'	Dim MarkValue As String = ""
'	Dim add_mark As Int = 0
'	Dim mark_part As String = ""
'	Dim ThisMarkXValue1 As String = ""
'	Dim ThisMarkXValue2 As String = ""
'	Dim ThisMarkXValue3 As String = ""
'	Dim ThisMarkXValue4 As String = ""
'	Dim ThisMarkXValue5 As String = ""
'
'	' *******************************************************************************************************
'	'  VERIFICA LISTA DE ITEMS PARA IMPRESSÃO NO RELATÓRIO
'	' *******************************************************************************************************
'	If (Utils.NNE(object_tagcode) And Not(object_tagcode = "__NONE__")) Or (overwrite) Then
'		Dim Paramters As String = DBStructures.GetScriptColumnStrEVC($"select paramters from dta_tasks_adds where tagcode='${CLA.Action.Trim}'"$, "paramters")
'		If Utils.NNE(Paramters) Then
'			Dim JSONMAP As Map = Utils.JSON2MAP(Paramters)
'			Log(JSONMAP)
'			Try
'				Dim query_script As Int = JSONMAP.Get("query_script")
'			Catch
'				Log(LastException)
'				Dim query_script As Int = 0
'			End Try
'					
'			If Utils.Int2Bool(query_script) Then
'				Dim Data2Replace As String = "<div><div>:__VALUETOREPLACE</div></div>"
'				Dim query_settings As List = JSONMAP.Get("query_settings")
'				Dim file_part As String = ""
'				Dim bookmark_part As String = ""
'				Dim run_script As String = ""
'				Dim multiple As Int = 0
'				Dim fields_list As List
'				For Each colquery_settings As Map In query_settings
'					Dim fields_list As List = colquery_settings.Get("fields_list")
'					Dim multiple As Int = colquery_settings.Get("multiple")
'					Dim run_script As String = colquery_settings.Get("run_script")
'					Dim file_part As String = colquery_settings.Get("file_part")
'					Dim bookmark_part As String = colquery_settings.Get("bookmark_part")
'					
'					Dim add_mark As Int = colquery_settings.Get("add_mark")
'					Dim mark_part As String = colquery_settings.Get("mark_part")
'					
'					If Utils.NNE(file_part) And File.Exists(Starter.InternalFolder, file_part) Then
'						Dim Data2Replace As String = File.ReadString(Starter.InternalFolder, file_part)
'					End If
'					Dim DataGroup As String = ""
'												
'					If (fields_list.IsInitialized) And (Utils.NNE(run_script)) Then
'						run_script = run_script.Replace("«", "'")
'						run_script = run_script.Replace($":REQUEST"$, CLA.Request.Trim)
'						run_script = run_script.Replace($":TASK"$, CLA.Action.Trim)
'						run_script = run_script.Replace($":OBJECT"$, object_tagcode.Trim)
'						run_script = run_script.Replace($":CLIENTDB."$, "")
'						Log(run_script)
'						Dim ContinuarThis As Boolean = True
'						Try
'							Dim ObjDesc As ResultSet = Starter.LocalSQLEVC.ExecQuery(run_script)
'						Catch
'							Log(LastException)
'							ContinuarThis = False
'						End Try
'						If (ContinuarThis) Then
'								
''							If (ObjDesc.RowCount >=1) Then
'								
'							If (add_mark >= 1) Then
'								Dim MarkValue As String = "X"
'							End If
'							
'							Do While ObjDesc.NextRow
'								Dim DataReplace As String = Data2Replace
''								Dim ThisObjTagCode As String = ObjDesc.Getstring("object_tagcode")
''								Dim reference1 As String = ObjDesc.Getstring("reference")
'									
'								For Each colfields_list As Map In fields_list
'									Dim fieldname As String = colfields_list.Get("fieldname")
'									Dim bookmark As String = colfields_list.Get("bookmark")
'									Dim ThisMarkXValue1 As String = ReturnValueIfExists(ObjDesc, "MarkXValue1")
'									Dim ThisMarkXValue2 As String = ReturnValueIfExists(ObjDesc, "MarkXValue2")
'									Dim ThisMarkXValue3 As String = ReturnValueIfExists(ObjDesc, "MarkXValue3")
'									Dim ThisMarkXValue4 As String = ReturnValueIfExists(ObjDesc, "MarkXValue4")
'									Dim ThisMarkXValue5 As String = ReturnValueIfExists(ObjDesc, "MarkXValue5")
'									Dim valueSTR As String = ObjDesc.Getstring(fieldname)
'									valueSTR=Utils.IfNullOrEmpty(valueSTR,"&nbsp;")
'									DataReplace = DataReplace.Replace($":${bookmark.ToUpperCase}"$, valueSTR)
'									Log($":${bookmark.ToUpperCase} = "$ & valueSTR)
'								Next
'								DataGroup = $"${DataGroup} ${DataReplace}"$
'							Loop
'							
'							ObjDesc.Close
'							Log(DataGroup)
'							
'							DataGroup = DataGroup.Replace(":__VALUETOREPLACE", "")
'							If (Utils.NNE(bookmark_part)) Then
'								innerHTML = innerHTML.Replace(bookmark_part, DataGroup)
'							Else
'								innerHTML = innerHTML.Replace(":__PARAM_QUERY_LIST", DataGroup)
'							End If
'						End If
'							
'					End If
'				Next
'
'			End If
'		End If
'	End If
'	
'	If (Utils.Int2Bool(add_mark) And Utils.NNE(MarkValue)) Then
'		If (mark_part = "__MARK1_XVALUE") Then
'			MarkXValue1 = Utils.IfNullOrEmpty(ThisMarkXValue1, MarkValue)
'		Else If (mark_part = "__MARK2_XVALUE") Then
'			MarkXValue2 =Utils.IfNullOrEmpty(ThisMarkXValue2,  MarkValue)
'		Else If (mark_part = "__MARK3_XVALUE") Then
'			MarkXValue3 = Utils.IfNullOrEmpty(ThisMarkXValue3, MarkValue)
'		Else If (mark_part = "__MARK4_XVALUE") Then
'			MarkXValue4 = Utils.IfNullOrEmpty(ThisMarkXValue4, MarkValue)
'		Else If (mark_part = "__MARK5_XVALUE") Then
'			MarkXValue5 = Utils.IfNullOrEmpty(ThisMarkXValue5, MarkValue)
'		End If
'	End If
'	
'	Log("Chegou aqui")
'	
'	
'	If Not(innerHTML = OriginalHTML) Then
'		RetHtml = innerHTML
'	End If
'	
'	Return RetHtml
'	
End Sub
'
Sub ReportRunParamterInQuery(CLA As RequestCLA, OriginalHTML As String, object_tagcode As String, overwrite As Boolean) As ResumableSub
	Dim RetHtml As String = ""
	Dim innerHTML As String = OriginalHTML
	Dim MarkValue As String = ""
	Dim add_mark As Int = 0
	Dim mark_part As String = ""
	Dim ThisMarkXValue1 As String = ""
	Dim ThisMarkXValue2 As String = ""
	Dim ThisMarkXValue3 As String = ""
	Dim ThisMarkXValue4 As String = ""
	Dim ThisMarkXValue5 As String = ""

	' *******************************************************************************************************
	'  VERIFICA LISTA DE ITEMS PARA IMPRESSÃO NO RELATÓRIO
	' *******************************************************************************************************
	If (Utils.NNE(object_tagcode) And Not(object_tagcode = "__NONE__")) Or (overwrite) Then
		Dim Paramters As String = DBStructures.GetScriptColumnStrEVC($"select paramters from dta_tasks_adds where tagcode='${CLA.Action.Trim}'"$, "paramters")
		If Utils.NNE(Paramters) Then
			Dim JSONMAP As Map = Utils.JSON2MAP(Paramters)
			Log(JSONMAP)
			Try
				Dim query_script As Int = JSONMAP.Get("query_script")
			Catch
				Log(LastException)
				Dim query_script As Int = 0
			End Try
					
			If Utils.Int2Bool(query_script) Then
				Dim ValidScript As String = ""
				Dim Data2Replace As String = "" '"<div><div>:__VALUETOREPLACE</div></div>"
				Dim query_settings As List = JSONMAP.Get("query_settings")
				Dim file_part As String = ""
				Dim bookmark_part As String = ""
				Dim run_script As String = ""
				Dim multiple As Int = 0
				Dim fields_list As List
				For Each colquery_settings As Map In query_settings
					Dim fields_list As List = colquery_settings.Get("fields_list")
					Dim multiple As Int = colquery_settings.Get("multiple")
					Dim run_script As String = colquery_settings.Get("run_script")
					
					If colquery_settings.ContainsKey("run_script_fo") Then
						Dim run_script_fo As String = colquery_settings.Get("run_script_fo")
						If Utils.NNE(run_script_fo) Then
							ValidScript = run_script_fo
						Else
							ValidScript = run_script
						End If
					Else
						ValidScript = run_script
					End If
					
					Dim file_part As String = colquery_settings.Get("file_part")
					Dim bookmark_part As String = colquery_settings.Get("bookmark_part")
					
					Dim add_mark As Int = colquery_settings.Get("add_mark")
					Dim mark_part As String = colquery_settings.Get("mark_part")
					
					If Utils.NNE(file_part) And File.Exists(Starter.InternalFolder, file_part) Then
						Dim Data2Replace As String = File.ReadString(Starter.InternalFolder, file_part)
					Else
						Dim Data2Replace As String = ""
					End If
					
					Dim DataGroup As String = ""
												
					If (fields_list.IsInitialized) And (Utils.NNE(ValidScript)) Then
						ValidScript = ValidScript.Replace("«", "'")
						ValidScript = ValidScript.Replace($":REQUEST"$, CLA.Request.Trim)
						ValidScript = ValidScript.Replace($":TASK"$, CLA.Action.Trim)
						ValidScript = ValidScript.Replace($":OBJECT"$, object_tagcode.Trim)
						ValidScript = ValidScript.Replace($":CLIENTDB."$, "")
						Log(ValidScript)
						Dim ContinuarThis As Boolean = True
						Try
							Dim ObjDesc As ResultSet = Starter.LocalSQLEVC.ExecQuery(ValidScript)
						Catch
							Log(LastException)
							ContinuarThis = False
						End Try
						If (ContinuarThis) Then
								
'							If (ObjDesc.RowCount >=1) Then
								
							If (add_mark >= 1) Then
								Dim MarkValue As String = "X"
							End If
							
							Do While ObjDesc.NextRow
								Dim DataReplace As String = Data2Replace
'								Dim ThisObjTagCode As String = ObjDesc.Getstring("object_tagcode")
'								Dim reference1 As String = ObjDesc.Getstring("reference")
									
								For Each colfields_list As Map In fields_list
									Dim fieldname As String = colfields_list.Get("fieldname")
									Dim bookmark As String = colfields_list.Get("bookmark")
									Dim ThisMarkXValue1 As String = ReturnValueIfExists(ObjDesc, "MarkXValue1")
									Dim ThisMarkXValue2 As String = ReturnValueIfExists(ObjDesc, "MarkXValue2")
									Dim ThisMarkXValue3 As String = ReturnValueIfExists(ObjDesc, "MarkXValue3")
									Dim ThisMarkXValue4 As String = ReturnValueIfExists(ObjDesc, "MarkXValue4")
									Dim ThisMarkXValue5 As String = ReturnValueIfExists(ObjDesc, "MarkXValue5")
									
									Try
										Dim valueSTR As String = ObjDesc.Getstring(fieldname)
									Catch
										Dim valueSTR As String = ""
										Log(LastException)
									End Try
									
									valueSTR = Utils.IfNullOrEmpty(valueSTR,"&nbsp;")
									
									
									If Utils.NNE(DataReplace) Then
										DataReplace = DataReplace.Replace($":${bookmark.ToUpperCase}"$, valueSTR)
										Log($"DataReplace :${bookmark.ToUpperCase} = "$ & valueSTR)
									Else
										' AFETA DIRECTAMENTE o HTML
										innerHTML = innerHTML.Replace($":${bookmark.ToUpperCase}"$, valueSTR)
										Log($"innerHTML :${bookmark.ToUpperCase} = "$ & valueSTR)
									End If
									
								Next

								If Utils.NNE(DataReplace) Then
									DataGroup = $"${DataGroup} ${DataReplace}"$
								End If
							Loop
							
							ObjDesc.Close
														
							If Utils.NNE(Data2Replace) Then
								DataGroup = DataGroup.Replace(":__VALUETOREPLACE", "")
								If (Utils.NNE(bookmark_part)) Then
									innerHTML = innerHTML.Replace(bookmark_part, DataGroup)
								Else
									innerHTML = innerHTML.Replace(":__PARAM_QUERY_LIST", DataGroup)
								End If
							End If
						End If
							
					End If
				Next

			End If
		End If
	End If
	
	If (Utils.Int2Bool(add_mark) And Utils.NNE(MarkValue)) Then
		If (mark_part = "__MARK1_XVALUE") Then
			MarkXValue1 = Utils.IfNullOrEmpty(ThisMarkXValue1, MarkValue)
		Else If (mark_part = "__MARK2_XVALUE") Then
			MarkXValue2 =Utils.IfNullOrEmpty(ThisMarkXValue2,  MarkValue)
		Else If (mark_part = "__MARK3_XVALUE") Then
			MarkXValue3 = Utils.IfNullOrEmpty(ThisMarkXValue3, MarkValue)
		Else If (mark_part = "__MARK4_XVALUE") Then
			MarkXValue4 = Utils.IfNullOrEmpty(ThisMarkXValue4, MarkValue)
		Else If (mark_part = "__MARK5_XVALUE") Then
			MarkXValue5 = Utils.IfNullOrEmpty(ThisMarkXValue5, MarkValue)
		End If
	End If
	
	Log("Chegou aqui")
	If Not(innerHTML = OriginalHTML) Then
		RetHtml = innerHTML
	End If

	Return RetHtml
End Sub

Sub ReturnValueIfExists(Res As ResultSet, TestValue As String)  As String 
	Try
		Dim ThisReturn As String = Res.Getstring(TestValue)
	Catch
		Dim ThisReturn As String = ""
	End Try
	Return ThisReturn
End Sub

Sub ReportSetOtherFields(HTML As String, CLA As RequestCLA) As String
	' *******************************************************************************************************
	' NOTE: PEGA NA LISTA DE TODOS OS ITEM_TAGCODES PARA IDENTIFICAÇÃO DOS BOOKMARKS NO RELATÓRIO
	' *******************************************************************************************************
	Dim fieldsSQL As String = $"select distinct item_tagcode from dta_tasks_items where task_tagcode='${CLA.Task.Trim}'"$
	Dim FieldsRS As ResultSet = Starter.LocalSQLEVC.ExecQuery(fieldsSQL)
	Do While FieldsRS.NextRow
		Dim theName As String = Utils.IfNullOrEmpty(FieldsRS.GetString("item_tagcode"), "")
		If Utils.NNE(theName) Then
			Dim theField As String = DBStructures.GetScriptColumnStrEVC($"select b.item_tagcode, a.item_tagcode, a.unique_key, a.tagcode,
											case when (a.execute_value_title is not null AND a.execute_value_title<>'') then a.execute_value_title
											ELSE
											case when b.data_type=16 then b.title
											else a.execute_value
											end
											end as valor
											from dta_requests_values AS a
											LEFT JOIN dta_tasks_items_answers AS b ON (b.task_tagcode=a.task_tagcode
											AND b.item_tagcode=a.item_tagcode
											AND b.unique_key=a.unique_key
											AND b.tagcode=a.tagcode)
											WHERE 1=1
											AND a.request_tagcode='${CLA.Request.Trim}' 
											AND a.task_tagcode='${CLA.Task.Trim}'
											AND a.item_tagcode='${theName.ToUpperCase}'
											AND a.execute_status=1"$,"valor")

			HTML = HTML.Replace($":__${theName.ToUpperCase}"$, theField)
		End If
	Loop
	FieldsRS.Close

	' *******************************************************************************************************
	' NOTE: PEGA NA LISTA DE TODOS OS FIELD_CODES PARA IDENTIFICAÇÃO DOS BOOKMARKS NO RELATÓRIO DO PEDIDO
	' *******************************************************************************************************
	Dim fieldsSQL As String = $"Select field_tagcode, ifnull(value, '') as valor from dta_requests_fields where request_tagcode='${CLA.Request.trim}'"$
	Dim FieldsRS As ResultSet = Starter.LocalSQLEVC.ExecQuery(fieldsSQL)
	
	Do While FieldsRS.NextRow
		Dim field_tagcode As String = Utils.IfNullOrEmpty(FieldsRS.GetString("field_tagcode"), "")
		If Utils.NNE(field_tagcode) Then
			Dim valueField As String = Utils.IfNullOrEmpty(FieldsRS.GetString("valor"), "")
			HTML = HTML.Replace($":__${field_tagcode.ToUpperCase}"$, valueField)
			HTML = HTML.Replace($":__REQUEST_${field_tagcode.ToUpperCase}"$, valueField)
		End If
	Loop
	
	FieldsRS.Close
	
	' *******************************************************************************************************
	' NOTE: PEGA NA LISTA DE TODOS OS FIELD_CODES DO OBJECTO PARA IDENTIFICAÇÃO DOS BOOKMARKS NO RELATÓRIO
	' *******************************************************************************************************
	Dim objecto As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(object_tagcode, '') as object_tagcode
							from dta_requests where tagcode='${CLA.Request.Trim}'"$, "object_tagcode")
	If (Utils.NNE(objecto)) Then
		Dim fieldsSQL As String = $"Select field_tagcode, ifnull(value, '') as valor
								from dta_objects_fields where object_tagcode='${objecto.trim}'"$
		Dim FieldsRS As ResultSet = Starter.LocalSQLEVC.ExecQuery(fieldsSQL)
		Do While FieldsRS.NextRow
			Dim field_tagcode As String = Utils.IfNullOrEmpty(FieldsRS.GetString("field_tagcode"), "")
			If Utils.NNE(field_tagcode) Then
				Dim valueField As String = Utils.IfNullOrEmpty(FieldsRS.GetString("valor"), "")
				HTML = HTML.Replace($":__OBJECT_${field_tagcode.ToUpperCase}"$, valueField)
'				HTML = HTML.Replace($":__${field_tagcode.ToUpperCase}"$, valueField)
			End If
		Loop
		FieldsRS.Close
	End If
			
	' **************************************************************************************************************************
	' NOTE: PEGA NA LISTA DE CAMPOS DO PRIMEIRO CONTACTO DA ENTIDADE
	' BOOKMARKS: CONTACT_NAME, CONTACT_EMAIL, CONTACT_PHONE, CONTACT_MOBILE, CONTACT_JOBFUNCTION, CONTACT_REFERENCE
	' **************************************************************************************************************************
	Dim Adicional As String = ""
	If ((ShareCode.APPL_ACCOUNT.ToLowerCase = "powersil")) Then
		Dim Adicional As String = "and a.type_contact='TCNTC_FIN'"
	End If
	Dim fieldsSQL As String = $"select a.tagcode, ifnull(a.reference, '') as reference, a.name,
										ifnull(a.email, '') as email, ifnull(a.phone,'') as phone, 
										ifnull(a.mobile,'') as mobile, ifnull(b.tagdesc, '') as jobfunction
										from dta_contacts as a
										left join type_contacttypes as b on (b.tagcode=a.type_contact)
										where a.tagcode in (select contact_tagcode 
											from dta_objects_contacts 
											where object_tagcode in (select entity_tagcode 
												from dta_requests where tagcode='${CLA.Request.trim}')) 
											${Adicional} 
										limit 1"$
	Dim FieldsRS As ResultSet = Starter.LocalSQLEVC.ExecQuery(fieldsSQL)
	Do While FieldsRS.NextRow
		For n=0 To FieldsRS.ColumnCount-1
			Dim fname As String = FieldsRS.GetColumnName(n)
			Dim fvalue As String = FieldsRS.GetString(fname)
			If Utils.NNE(fname) Then
				HTML = HTML.Replace($":__CONTACT_${fname.ToUpperCase}"$, fvalue)
			End If
		Next
		Exit
	Loop
	FieldsRS.Close
			
	' **************************************************************************************************************************
	' NOTE: PEGA NA LISTA DE CAMPOS DO PRIMEIRO CONTACTO DO CONTACTO
	' BOOKMARKS: CONTACTOBJ_NAME, CONTACTOBJ_EMAIL, CONTACTOBJ_PHONE, CONTACTOBJ_MOBILE, CONTACTOBJ_JOBFUNCTION, CONTACTOBJ_REFERENCE
	' **************************************************************************************************************************
	' PS: ALTERAR PARA QUE POSSA SER GENÉRICA
	Dim Adicional As String = ""
	If ((ShareCode.APPL_ACCOUNT.ToLowerCase = "powersil")) Then
		Dim Adicional As String = "and a.type_contact='TCNTC_FIN'"
	End If
	Dim fieldsSQL As String = $"select a.tagcode, ifnull(a.reference, '') as reference, a.name,
										ifnull(a.email, '') as email, ifnull(a.phone,'') as phone, 
										ifnull(a.mobile,'') as mobile, ifnull(b.tagdesc, '') as jobfunction
										from dta_contacts as a
										left join type_contacttypes as b on (b.tagcode=a.type_contact)
										where a.tagcode in (select contact_tagcode 
											from dta_objects_contacts 
											where object_tagcode in (select object_tagcode 
												from dta_requests where tagcode='${CLA.Request.trim}')) 
											${Adicional} 
										limit 1"$
	Dim FieldsRS As ResultSet = Starter.LocalSQLEVC.ExecQuery(fieldsSQL)
	Do While FieldsRS.NextRow
		For n=0 To FieldsRS.ColumnCount-1
			Dim fname As String = FieldsRS.GetColumnName(n)
			Dim fvalue As String = FieldsRS.GetString(fname)
			If Utils.NNE(fname) Then
				HTML = HTML.Replace($":__CONTACTOBJ_${fname.ToUpperCase}"$, fvalue)
			End If
		Next
		Exit
	Loop
	FieldsRS.Close
	
	HTML = HTML.Replace($":__REQUEST_${field_tagcode.ToUpperCase}"$, valueField)

	Return HTML
End Sub

'===============================================================================================================
' REQUEST REPORT GENERATION GA
'===============================================================================================================
Sub GAGetReportPageHeader(CLA As RequestData, thisPage As PageA4, thisPageData As PageData, Record As Cursor) As PageData
	Dim Name As String = ""
'	Dim Morada As String = ""
	Dim ObjectName As String = ""
	'Dim objContact As String = ""
	Dim Local As String = ""
	Dim codPostal As String = ""
	Dim localidade As String = ""
	Dim unidade As String = ""
			
	Dim sSQL As String = $"select
						ifnull((select distinct execute_value from dta_requests_values where item_tagcode='TSPRTV20002' and request_tagcode='${CLA.Tagcode}' and repeatcounter=0), '') as nome,
						ifnull((select distinct execute_value from dta_requests_values where item_tagcode='TSPRTV20004' and request_tagcode='${CLA.Tagcode}' and repeatcounter=0), '') as morada,
						ifnull((select distinct execute_value from dta_requests_values where item_tagcode='TSPRTV20006' and request_tagcode='${CLA.Tagcode}' and repeatcounter=0), '') as localmorada,
						ifnull((select distinct execute_value from dta_requests_values where item_tagcode='TSPRTV20008' and request_tagcode='${CLA.Tagcode}' and repeatcounter=0), '') as codpostal,
						ifnull((select distinct execute_value from dta_requests_values where item_tagcode='TSPRTV20010' and request_tagcode='${CLA.Tagcode}' and repeatcounter=0), '') as localidade,
						ifnull((select distinct execute_value from dta_requests_values where item_tagcode='TSPRTV20013' and request_tagcode='${CLA.Tagcode}' and repeatcounter=0), '') as contacto,
						ifnull((select distinct execute_value from dta_requests_values where item_tagcode='TSPRTV20019' and request_tagcode='${CLA.Tagcode}' and repeatcounter=0), '') as telefone,
						ifnull((select distinct execute_value from dta_requests_values where item_tagcode='TSPRTV20022' and request_tagcode='${CLA.Tagcode}' and repeatcounter=0), '') as unidade"$
	Dim currRec As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL)
	If currRec.RowCount > 0 Then
		currRec.Position = 0
		Name = Utils.IfNullOrEmpty(currRec.GetString("nome"), "_")
'		Morada = Utils.IfNullOrEmpty(currRec.GetString("morada"), "_")
		Local = Utils.IfNullOrEmpty(currRec.GetString("localmorada"), "_")
		codPostal = Utils.IfNullOrEmpty(currRec.GetString("codpostal"), "_")
		localidade = Utils.IfNullOrEmpty(currRec.GetString("localidade"), "_")
		unidade = Utils.IfNullOrEmpty(currRec.GetString("unidade"), "_")
	End If
	currRec.Close
				
	'Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
	Dim Inicio As String = Record.GetString("run_start") 'req_run_start")
	Dim Fim As String = Record.GetString("req_run_end")
	Dim Duracao As String = Record.GetString("run_time")
	Dim Data As String = Utils.GetCurrentDate
	Dim RequestTypeDesc As String = Utils.IfNullOrEmpty(Record.GetString("request_desc"), "_")
	Dim RequestNumber As String = Record.GetString("tagcode")
'	Dim request_obs As String = Utils.IfNullOrEmpty(Record.GetString("request_obs"), "_")
	Dim Technical As String = Utils.IfNullOrEmpty(Record.GetString("username"), "_")
	thisPageData.Technical = Technical
	'Dim Pacote As String = "EJR - Espaços de Jogos e Recreio"
	Dim MoradaMais As String = $"${Local}, ${codPostal} ${localidade}"$
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_NUMBER", RequestNumber)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REPORT_NAME", RequestTypeDesc)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_RESULT", "Avaliação")
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_POINTS", 0)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REQUEST_TYPE", ObjectName)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_DATE", Data)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_NAME", Name)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_START", Inicio)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_LOCAL", MoradaMais) 'Morada)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_END", Fim)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_TIME", Duracao)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_UNITY", unidade)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__TECHNICAL_NAME", Technical)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__CONTRACT", "Sem contrato/Prospect")
				
	Return thisPageData
End Sub

Sub GAGetReportPageHeaderSTD(CLA As RequestData, thisPage As PageA4, thisPageData As PageData, Record As Cursor) As PageData
	Dim Name As String = ""
	Dim Morada As String = ""
	Dim ObjectName As String = ""
	'Dim objContact As String = ""
	Dim Local As String = ""
	Dim codPostal As String = ""
	Dim localidade As String = ""
	Dim unidade As String = ""
	
	Name = Utils.IfNullOrEmpty(Record.GetString("name"), "_")
	ObjectName = Utils.IfNullOrEmpty(Record.GetString("objectname"), "_")
	Morada = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
	Local = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
	codPostal = Utils.IfNullOrEmpty(Record.GetString("postal_code"), "_")
	localidade = Utils.IfNullOrEmpty(Record.GetString("city"), "_")
	unidade = Utils.IfNullOrEmpty(Record.GetString("nameobject"), "_")
	Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
	
	Dim contracto As String = Utils.IfNullOrEmpty(Record.GetString("contracto"), "")
	If Utils.NNE(contracto) Then
		If Utils.NNE(Reference) Then
			Reference = $"${Reference} (${contracto})"$
		Else
			Reference = $"${contracto}"$
		End If
	End If
	
	Reference = Utils.IfNullOrEmpty(Reference, "Sem contrato/Prospect")
	Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
						WHERE request_tagcode='${CLA.Tagcode.Trim}' 
						And ((inner_request_tagcode='TSKS_EJREQUIPMENT' AND task_tagcode='TSKS_EJREQUIPMENT') 
						Or (inner_request_tagcode='TSKS_EJRGALQUIPMENT' AND task_tagcode='TSKS_EJRGALQUIPMENT'))
						And repeatcounter=0"$
	Dim Data As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC(script, "executedatetime"), _
						Record.GetString("run_date"))
	
	Data = Utils.IfNullOrEmpty(Data, Utils.GetCurrentDate)
	Data = Utils.GetDate(DateTime.DateParse(Data))
			
	Dim Inicio As String = Record.GetString("run_start") 'req_run_start")
	Dim Fim As String = Record.GetString("run_end")
	Dim Duracao As String = Record.GetString("run_time")
'	Dim Data As String = Record.GetString("run_date")
	'Dim Data As String = Utils.GetCurrentDate
	Dim RequestTypeDesc As String = Utils.IfNullOrEmpty(Record.GetString("request_desc"), "_")
	Dim RequestNumber As String = Record.GetString("tagcode")
	Dim Technical As String = Utils.IfNullOrEmpty(Record.GetString("sessusername"), "_")
	thisPageData.Technical = Technical
	'Dim Pacote As String = "EJR - Espaços de Jogos e Recreio"
	Dim MoradaMais As String = $"${Local}, ${codPostal} ${localidade}"$
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_NUMBER", RequestNumber)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REPORT_NAME", RequestTypeDesc)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_RESULT", "Avaliação")
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_POINTS", 0)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REQUEST_TYPE", ObjectName)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_DATE", Data)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_NAME", Name)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_START", Inicio)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_LOCAL", MoradaMais) 'Morada)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_END", Fim)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_TIME", Duracao)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_UNITY", ObjectName) 'unidade)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__TECHNICAL_NAME", Technical)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__CONTRACT", Reference)		
	Return thisPageData
End Sub

Sub GAGenerateReportFirst(CLA As RequestData, thisPage As PageA4, thisPageData As PageData) As PageData
	ProgressDialogShow(ShareCode.reportsMsgGerarGeral)
	
	Private Record As Cursor
	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Tagcode}' ORDER BY z.position, z.repeatcounter"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then

		thisPageData.PageTotal = thisPage.A4Margins + thisPage.PageHeaderHeight + thisPage.PageFirstHeight + thisPage.PageFooterHeight  '370 + 23

		For nRow = 0 To Record.RowCount-1
			Record.Position = nRow
			Dim dbRequest As String = Record.GetString("tagcode")
			Dim dbAction As String = Record.GetString("action_tagcode")
			Dim repeatcounter As Int = Record.GetInt("repeatcounter")
			Dim request_type As String = Record.GetString("request_type")
			
			Dim RunThisTask As Boolean = False
			If (((request_type = "TSKS_EJRBO") Or (request_type = "TSKS_EJRGALBO")) And (nRow = 0)) Then
				thisPageData = GAGetReportPageHeaderSTD(CLA, thisPage, thisPageData, Record)
				thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageHeader}${thisPage.PageFirst}"$
				RunThisTask = True
			else if (((request_type = "TSKS_EJRFO") Or (request_type = "TSKS_EJRGALFO")) And (nRow = 0)) Then
				thisPageData = GAGetReportPageHeader(CLA, thisPage, thisPageData, Record)
				thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageHeader}${thisPage.PageFirst}"$
			else if (((request_type = "TSKS_EJRFO") Or (request_type = "TSKS_EJRGALFO")) And (nRow = 1)) Then
				RunThisTask = True
			Else
				If (nRow >= 2) Then
					Exit
				End If
			End If
			
			' ****************************************************************
			' PEGA NO PRIMEIRO FICHEIRO (PROSPECT)
			' ****************************************************************
			If (RunThisTask) Then

				Log($"*******************************************"$)
				Log($"****************  START   ***************"$)
				Log($"${thisPageData.PageNumber} - ${thisPageData.PageTotal}"$)
				Log($"*******************************************"$)
								
				' ****************************************************************
				' PEGA NO SEGUNDO FICHEIRO (EJR GERAL)
				' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
				' ****************************************************************
				Dim DATA_NAME As String = ""
				Private objRecord As Cursor
				Dim Rows As Int = 0
				Dim dataSQL As String = $"Select x.execute_value, x.val_desc, x.title, x.position, x.level, x.datatype,
									x.repeatcounter, x.unique_key, x.execute_notes, x.item_tagcode, x.bullet_master, x.bullet_child
									from (Select a.execute_value, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									c.unique_key, a.execute_notes, a.item_tagcode, c.bullet_master, c.bullet_child
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${dbRequest.Trim}' and a.inner_request_tagcode='${dbAction.Trim}' and a.task_tagcode='${dbAction.Trim}' 
									and a.repeatcounter=${repeatcounter} 
									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select "" As execute_value, "" As val_desc, a.title, a.position, a.level, a.data_type As datatype, 
									0 as repeatcounter, '' as unique_key, '' as execute_notes, a.item_tagcode, a.bullet_master, a.bullet_child
									from dta_tasks_items As a 
									where a.task_tagcode='${dbAction.Trim}' and a.level=0) as x
									order by x.position, x.repeatcounter"$

				Log("********************************************************")
				Log("********************************************************")
				Log("********************************************************")
				Log(dataSQL)
				objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
				If objRecord.RowCount > 0 Then
					
					'PageTotal = PageTotal + 100 'Margin
					'PageTotal = A4Margins + PageHeaderHeight + PageFirstHeight + PageFooterHeight  '370 + 23
					
					thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageContent}"$
					Log(thisPageData.BuildPage)
					Dim LineCounter As Int = 1
					Dim OldChapter As String = ""
					Dim OldLabelBox As Double = 0
					For Rows =0 To objRecord.RowCount-1
						objRecord.Position = Rows
						Dim CHAPTER_NAME As String = ""
						Dim QUEST_NAME As String = ""
						
						Dim Level As Int = objRecord.GetInt("level")
						Dim repeatcounter As Int = objRecord.GetInt("repeatcounter")
						
						Dim bullet_master As Int = objRecord.GetInt("bullet_master")
						Dim bullet_child As Int = objRecord.GetInt("bullet_child")
						'Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
						If (Level = 0) Then
							thisPageData.PointCounter = thisPageData.PointCounter + 1
							LineCounter = 1
							
							Dim ColRows As Int = 1
							If (bullet_master > 0) Then
								Dim ttitle As String = $"${bullet_master}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							Else
								Dim ttitle As String = $"${thisPageData.PointCounter}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							End If
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							Dim LabelBox As Double = ((thisPage.PageLabelSpaceHeight + thisPage.PageLabelHeight) * ColRows) + 2 + thisPage.PageLabelSpaceHeight
'							Dim PageLabelHeight As Double = 9.449
'							Dim PageLabelSpaceHeight As Double = 5.670
'							Dim PageLabelBoxHeight As Double = 22.667  'With Border
							
							CHAPTER_NAME = $"<table style="width:100%;" class="table">
											<thead>
												<tr>
													<th style="width:55%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">${ttitle}</th>
													<th style="width:15%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Resposta</th>
													<th style="width:30%;text-align: left;padding: 4px 6px;">Observações</th>
												</tr>
											</thead>
											<tbody>"$
							OldChapter = $"${CHAPTER_NAME}"$
							OldLabelBox = LabelBox
							If (Rows >= 1) Then
								CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
							End If
							
						Else
							Dim bBullet As String = ""
							Dim uk As String = objRecord.GetString("unique_key")

							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim scolor As String = "#ffffff"
							If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
								Dim scolor As String = "#b3ff66"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
								Dim scolor As String =  "#ff5c33"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAUDITADO") Then
								Dim scolor As String =  "#e6e6e6"
							Else If (sVal.Replace("ã", "a").Replace("á", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAPLICAVEL") Then
								Dim scolor As String =  "#3399ff"
							End If
							
							Dim ColRows As Int = 1
							Dim ttitle As String = objRecord.GetString("title")
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							If ((sVal.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((sVal.Trim.Length) / 12)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							Dim LabelBox As Double = ((thisPage.PageLabelSpaceHeight + thisPage.PageLabelHeight) * ColRows) + 2 + thisPage.PageLabelSpaceHeight
								
							Dim vNotes As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
							If ((vNotes.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((vNotes.Trim.Length) / 20)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							LineCounter = LineCounter + 1
							
							If ((bullet_master > 0) And (bullet_child > 0)) Then
								bBullet = $"${bullet_master}.${bullet_child}."$
								Dim ttitle2 As String = $"${bBullet} ${ttitle.Trim}"$ 'objRecord.GetString("title")
							Else
								bBullet = $"${thisPageData.PointCounter}.${LineCounter}."$
								Dim ttitle2 As String = $"${bBullet} ${ttitle.Trim}"$ 'objRecord.GetString("title")
							End If
							
							
							
							
							Dim TEMPQUEST_NAME As String = $"<tr>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;">
											${ttitle2.Trim}</td>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;background:${scolor};">${sVal}</td>
											<td style="padding: 4px 6px;">${vNotes}</td>
										</tr>"$
							QUEST_NAME = TEMPQUEST_NAME

							Dim IMAGES As String = ""
							Private Record22 As Cursor
							' ************************************************************************
							' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
							' ************************************************************************
							Dim sSQL2 As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename from dta_requests_values_images as a
												left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
												b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
												where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
												and a.repeatcounter=${repeatcounter}
												And a.on_report=1"$
							Record22 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
							
							If Record22.RowCount > 0 Then
								Dim ImageCounter As Int = 0
								Dim thisRow As Int = 1
								Dim ptotalimg As Double = thisPage.PageImgRowHeight
								For n=0 To Record22.RowCount-1
									Record22.Position = n
									thisPageData.ImageCounter = thisPageData.ImageCounter + 1
									Dim image As String = Utils.IfNullOrEmpty(Record22.GetString("imageb64"), "")
									Dim imagename As String = Utils.IfNullOrEmpty(Record22.GetString("imagename"), "")
							
									ImageCounter = ImageCounter + 1
									If Utils.NE(image) Then
										If Utils.NNE(imagename) Then
											Dim image As String = Utils.ConvertImageSizeFromFileWH(imagename, ImageCounter, 200dip, 140dip)
										End If
									Else
										Dim image As String = Utils.ConvertImageSizeWH(image, ImageCounter, 200dip, 140dip)
									End If
									
									IMAGES = $"${IMAGES}
											<li>
												<img src="data:image/png;base64,${image}"  width="190" /><br>
												Foto: ${bBullet} 
											</li>"$
											
									

								Next
								thisPageData.PageTotal = thisPageData.PageTotal + ptotalimg
								Log("*************************************")
								Log("*************************************")
								Log(" PAGE TOTAL : " & thisPageData.PageTotal)
								Log(" IMAGE TOTAL : " & ptotalimg)
								Log("*************************************")
								Log("*************************************")
							End If
							Record22.Close
							
							If Utils.NNE(IMAGES) Then
								thisPageData.PageTotal = thisPageData.PageTotal + thisPage.PageLabelSpaceHeight
								IMAGES = $"<tr>
											<td colspan="3" style="">
												<div class="col-12" style="">
													<ul class="photos" style="padding-left:0;">
														${IMAGES}
													</ul>
												</div>
											</td>
										</tr>"$
							End If
							QUEST_NAME = $"${QUEST_NAME}${IMAGES}"$

						End If
						DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
						
					Next
				End If
				objRecord.Close
			End If
		Next
		DATA_NAME = $"${DATA_NAME}</tbody> </table>"$
		
	End If
	Record.Close
	
'	Dim CurrTotal As Double = thisPage.PageHeight-(thisPageData.PageTotal+35)' -102
'	Dim Col12 As String = $"<div class="col-12" style="min-height:${CurrTotal}px;">&nbsp;</div>"$
'	Log($"${thisPageData.PointCounter}.${LineCounter} - ${CurrTotal}"$)
'	DATA_NAME = $"${DATA_NAME}</tbody> </table>${Col12}${thisPage.PageFooter}"$ ' CRIA FOOTER + HEADER    <div class="PAGE_BREAK" style="page-break-after: always;"></div>
'	DATA_NAME = DATA_NAME.Replace(":__REPORT_INFO_VERSION", "GA_EJR_01V1")
'	DATA_NAME = DATA_NAME.Replace(":__CURRENT_PAGE", thisPageData.PageNumber)
'	
	DATA_NAME = $"${DATA_NAME}<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
	thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_NAME", DATA_NAME)
	thisPageData.PagesOut.Add(thisPageData.BuildPage)
	File.WriteList(Starter.SharedFolder, "FIRSTREP.TMP", thisPageData.PagesOut)
	thisPageData.PagesOut.Clear
	ProgressDialogHide
	'Sleep(100)
	Return thisPageData
End Sub

Sub GAGenerateReportSecond(CLA As RequestData, thisPage As PageA4, thisPageData As PageData) As PageData
	ProgressDialogShow(ShareCode.reportsMsgGerarEquipamentos)
'	Dim DefLockInfo As String = "Geração de Equipamentos"
	Private Record As Cursor
	Dim EQUIPMENT As String = ""
	Dim EQUIPMENTNUM As String = ""
'	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Tagcode}'"$
	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Tagcode}' 
						and z.relation_tagcode in ('TSKS_EJREQUIPMENT', 'TSKS_EJRGALQUIPMENT') 
						ORDER BY z.position, z.repeatcounter"$
	thisPageData.BuildPage = ""
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Dim FilesCount As Int = 0
		Dim PointCounter As Int = 1
		For nRow = 0 To Record.RowCount-1
			Record.Position = nRow
			
			FilesCount = FilesCount + 1
			
			Dim dbRequest As String = Record.GetString("tagcode")
			Dim dbAction As String = Record.GetString("action_tagcode")
			Dim repeatcounter As Int = Record.GetInt("repeatcounter")
'			Dim request_type As String = Record.GetString("request_type")
			
'			If ((request_type = "TSKS_EJRBO") And (nRow >= 1)) Or ((request_type = "TSKS_EJRFO") And (nRow >= 2)) Then

			'thisPageData.BuildPage = $"${thisPage.PageHeader}${thisPage.PageNext}${thisPage.PageContent}"$
			thisPageData.BuildPage = $"${thisPage.PageNext}${thisPage.PageContent}"$
			' ************************************************************************
			' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
			' ************************************************************************
			Dim DATA_NAME As String = ""
			Private objRecord As Cursor
			Dim Rows As Int = 0
			Dim dataSQL As String = $"Select x.execute_value, x.val_desc, x.title, x.position, x.level, x.datatype,
									x.repeatcounter, x.unique_key, x.execute_notes, x.item_tagcode, x.bullet_master, x.bullet_child
									from (Select a.execute_value, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									c.unique_key, a.execute_notes, a.item_tagcode, c.bullet_master, c.bullet_child
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${dbRequest.trim}' 
									and ((a.inner_request_tagcode='TSKS_EJREQUIPMENT' and a.task_tagcode='TSKS_EJREQUIPMENT')
									or (a.inner_request_tagcode='TSKS_EJRGALQUIPMENT' and a.task_tagcode='TSKS_EJRGALQUIPMENT'))
									and a.repeatcounter=${repeatcounter} 
									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select "" As execute_value, "" As val_desc, a.title, a.position, a.level, a.data_type As datatype, 
									0 as repeatcounter, '' as unique_key, '' as execute_notes, a.item_tagcode, a.bullet_master, a.bullet_child
									from dta_tasks_items As a 
									where a.task_tagcode='${dbAction.trim}' and a.level=0) as x
									order by x.position, x.repeatcounter "$
									

			'Log(dataSQL)
			objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
			If objRecord.RowCount > 0 Then
				Dim PointCounter As Int = 1
				thisPageData.PageTotal = 100 + 80 + 52 + 52 + 23
				'PageTotal = PageTotal + 120 'Margin
				Dim LineCounter As Int = 1
				Dim OldChapter As String = ""
					
				For Rows =0 To objRecord.RowCount-1
					objRecord.Position = Rows
					Dim CHAPTER_NAME As String = ""
					Dim QUEST_NAME As String = ""
						
					Dim Level As Int = objRecord.GetInt("level")
					'Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
					Dim itemTask As String = Utils.IfNullOrEmpty(objRecord.GetString("item_tagcode"), "")
					  
					If ((itemTask.ToUpperCase <> "EJREV20001") And (itemTask.ToUpperCase <> "EJREV20002")) And _
						((itemTask.ToUpperCase <> "EJRGALE0001") And (itemTask.ToUpperCase <> "EJRGALE0002"))Then
						
						Dim bBullet As String = ""
						
						If (Level = 0) Then
							PointCounter = PointCounter + 1
							LineCounter = 1
								
							Dim ColRows As Int = 1
							Dim ttitle As String = $"${PointCounter}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							
							CHAPTER_NAME = $"<table style="width:100%;" class="table">
												<thead>
													<tr>
														<th style="width:55%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">
														${ttitle}</th>
														<th style="width:15%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Resposta</th>
														<th style="width:30%;text-align: left;padding: 4px 6px;">Observações</th>
													</tr>
												</thead>
												<tbody>"$
							OldChapter = $"${CHAPTER_NAME}"$
							If (Rows >= 1) Then
								CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
							End If
							
							thisPageData.PageTotal = thisPageData.PageTotal + (thisPage.PageTextHeight * ColRows) + thisPage.PageTextMargins
								
						Else
								
							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim scolor As String = "#ffffff"
							If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
								scolor = "#b3ff66"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
								scolor = "#ff5c33"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAUDITADO") Then
								Dim scolor As String =  "#e6e6e6"
							Else If (sVal.Replace("ã", "a").Replace("á", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAPLICAVEL") Then
								Dim scolor As String =  "#3399ff"
							End If
								
							Dim ColRows As Int = 1
							Dim ttitle As String = objRecord.GetString("title")
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							If ((sVal.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((sVal.Trim.Length) / 12)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
								
							Dim vNotes As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
							If ((vNotes.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((vNotes.Trim.Length) / 20)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							thisPageData.PageTotal = thisPageData.PageTotal + ((thisPage.PageTextHeight * ColRows) + thisPage.PageTextMargins)
							
							bBullet = $"${PointCounter}.${LineCounter}."$
							LineCounter = LineCounter + 1
							QUEST_NAME = $"<tr>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;">
											${bBullet} ${ttitle.Trim}</td>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;background:${scolor};">${sVal}</td>
											<td style="padding: 4px 6px;">${vNotes}</td>
										</tr>"$
								
							Dim uk As String = objRecord.GetString("unique_key")
							Dim IMAGES As String = ""
							Private Record22 As Cursor
							' ************************************************************************
							' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
							' ************************************************************************
							Dim sSQL2 As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename
													from dta_requests_values_images as a
													left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
													b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
													where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
													and a.repeatcounter=${repeatcounter}
													And a.on_report=1"$
							Record22 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
							If Record22.RowCount > 0 Then
'								Dim thisRow As Int = 1
								Dim ImageCounter As Int = 0
								Dim ptotalimg As Double = thisPage.PageImgRowHeight
								For n=0 To Record22.RowCount-1
									Record22.Position = n
									thisPageData.ImageCounter = thisPageData.ImageCounter + 1
									Dim image As String = Utils.IfNullOrEmpty(Record22.GetString("imageb64"), "")
									Dim imagename As String = Utils.IfNullOrEmpty(Record22.GetString("imagename"), "")
									
									ImageCounter = ImageCounter + 1
									If Utils.NE(image) Then
										If Utils.NNE(imagename) Then
'											Dim image As String = Utils.ConvertImageSizeFromFileWH(imagename, ImageCounter, 320dip, 240dip)
											Dim image As String = Utils.ConvertImageSizeFromFileWH(imagename, ImageCounter, 201dip, 148dip)
										End If
									Else
'										Dim image As String = Utils.ConvertImageSizeWH(image, ImageCounter, 320dip, 240dip)
										Dim image As String = Utils.ConvertImageSizeWH(image, ImageCounter, 201dip, 148dip)
									End If
									
									
'									Dim percent As Double = 1.20
'									Dim image As String = Utils.ConvertImage(image, thisPageData.ImageCounter, percent)
'									'IMAGES = $"${IMAGES}<div class="col-3" style=""><img src="data:image/png;base64,${image}" width="195"></div>"$
									IMAGES = $"${IMAGES}
											<li>
												<img src="data:image/png;base64,${image}"  width="190" /><br>
												Foto: ${bBullet} ${EQUIPMENT}
											</li>"$
									
'									IMAGES = $"${IMAGES}
'											<li>
'												<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" style="width:100%;" /><br>
'												Foto: ${bBullet} ${EQUIPMENT}
'											</li>"$
								Next
								thisPageData.PageTotal = thisPageData.PageTotal + ptotalimg
							End If
							Record22.Close
								
							If Utils.NNE(IMAGES) Then
								IMAGES = $"<tr>
												<td colspan="3" style="padding: 4px 6px;">
													<div class="col-12" style="margin-bottom:10px;">
														<ul class="photos" style="padding-left:0;">
															${IMAGES}
														</ul>
													</div>
												</td>
											</tr>"$
							End If
							QUEST_NAME = $"${QUEST_NAME}${IMAGES}"$
						End If
					Else 
						If (itemTask.ToUpperCase = "EJREV20002") Or (itemTask.ToUpperCase = "EJRGALE0002") Then
							Dim OBJECT_NAME_IMAGE As String = ""
							
							'EQUIPMENT = $"${PointCounter}. ${Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")}"$
							EQUIPMENT = $"${Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")}"$
							EQUIPMENTNUM = $"${PointCounter}."$
								
							Dim uk As String = objRecord.GetString("unique_key")
							Dim IMAGES As String = ""
							Private Record22 As Cursor
							' ************************************************************************
							' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
							' ************************************************************************
							Dim sSQL2 As String = $"select distinct ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename
													from dta_requests_values_images as a
													left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
													b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
													where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
													and a.repeatcounter=${repeatcounter}
													And a.on_report=1"$
							Record22 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
							If Record22.RowCount > 0 Then
								Record22.Position = 0
'								Dim image As String = Utils.IfNullOrEmpty(Record22.GetString("imageb64"), "")
'								Dim imagename As String = Record22.GetString("imagename")
								Dim image As String = Utils.IfNullOrEmpty(Record22.GetString("imageb64"), "")
								Dim imagename As String = Utils.IfNullOrEmpty(Record22.GetString("imagename"), "")
									
								ImageCounter = ImageCounter + 1
								If Utils.NE(image) Then
									If Utils.NNE(imagename) Then
'										Dim image As String = Utils.ConvertImageSizeFromFileWH(imagename, ImageCounter, 320dip, 240dip)
										Dim image As String = Utils.ConvertImageSizeFromFileWH(imagename, ImageCounter, 201dip, 148dip)
									End If
								Else
'									Dim image As String = Utils.ConvertImageSizeWH(image, ImageCounter, 320dip, 240dip)
									Dim image As String = Utils.ConvertImageSizeWH(image, ImageCounter, 201dip, 148dip)
								End If
								
								
								If Utils.NNE(image) Then
									OBJECT_NAME_IMAGE = $"<div class="col-12" style="text-align:center;">
											<img src="data:image/png;base64,${image}" width="320" height="240" /><br>
											Foto: ${PointCounter}.${LineCounter}. ${EQUIPMENT}
										</div>"$
										
									thisPageData.PageTotal = thisPageData.PageTotal + 240
								Else
									If Utils.NNE(imagename) Then

										OBJECT_NAME_IMAGE = $"<div class="col-12" style="text-align:center;">
												<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" width="320" height="240" /><br>
												Foto: ${PointCounter}.${LineCounter}. ${EQUIPMENT}
											</div>"$
											
										thisPageData.PageTotal = thisPageData.PageTotal + 240
									End If
								End If
									
'								If Utils.NNE(imagename) Then
'
'									OBJECT_NAME_IMAGE = $"<div class="col-12" style="text-align:center;">
'												<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" width="320" height="240" /><br>
'												Foto: ${PointCounter}.${LineCounter}. ${EQUIPMENT}
'											</div>"$
'											
'									thisPageData.PageTotal = thisPageData.PageTotal + 240
'								End If
								
								
									
							End If
							Record22.Close
							thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__OBJECT_NAME_IMAGE", OBJECT_NAME_IMAGE)
							'__OBJECT_NAME_IMAGE
								
							':__OBJECT_NAME
							'HTML1 = HTML1.Replace(":__EXECUTION_NUMBER", RequestNumber)
						End If
					End If
					DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
						
				Next
			End If
			objRecord.Close
'			End If
			DATA_NAME = $"${DATA_NAME}</tbody> </table>"$
			DATA_NAME = $"${DATA_NAME}<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
			If (Utils.NNE(thisPageData.BuildPage)) Then
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__OBJECT_NAME", $"${EQUIPMENTNUM} ${EQUIPMENT}"$)
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_NAME", DATA_NAME)
				thisPageData.PagesOut.Add(thisPageData.BuildPage)
				File.WriteList(Starter.SharedFolder, "SECONDREP"&nRow&".TMP", thisPageData.PagesOut)
				thisPageData.PagesOut.Clear
			End If
		Next
		thisPageData.PointCounter = FilesCount
	End If
	Record.Close

	ProgressDialogHide
	Return thisPageData
End Sub

Sub GAGenerateReport(CLA As RequestData) 'As ResumableSub
	
	Dim ReportList As List
	ReportList.Initialize
	ReportList.AddAll(Array As String("page_header", _
	"page_footer", _
	"page_content", _
	"page_signature", _
	"page_content_observations", _
	"page_content_images", _
	"template12", _
	"page_identification_first_score", _
	"page_identification_next", _
	"page_identification_last"))
	
	Dim AllfilesPresent As Boolean = True
	
	For x=0 To ReportList.Size -1
		Dim File2check As String = ReportList.Get(x)
		If File.Exists(Starter.InternalFolder, $"${File2check}.html"$) Then
			File.Copy(Starter.InternalFolder, $"${File2check}.html"$,Starter.SharedFolder, $"${File2check}.html"$)
			Log(File2check)
		Else
			AllfilesPresent = False
		End If
	Next
	
	
	
	If File.Exists(Starter.InternalFolder, "page_identification_first.html") Then
		File.Copy(Starter.InternalFolder, "page_identification_first.html",Starter.SharedFolder, "page_identification_first.html")
	End If
	
	
	CurrentCLA = CLA
	'Sleep(100)
	ProgressDialogShow(ShareCode.reportsMsgProcessar)
	Sleep(150)
	
	ThisReportDate = Utils.GetCurrentDate

	Dim APPL_INSTANCE As String = Utils.SelectFieldFromLocalSQLWRKConfigTable("instance")

	If(APPL_INSTANCE = GRANDACTIVE_INSTANCE) Or (APPL_INSTANCE = SIMGRANDACTIVE_INSTANCE ) Then
		ProgressDialogShow(ShareCode.reportsMsgGerarGeral)
		Sleep(50)

		Dim pOut As List : pOut.Initialize
		
		Dim PageNonConformities As String = $"<div class="col-12" style="margin-bottom:10px;:__SHOW_NON_CONFORMITY">
												<div class="col-12" style="">
													<div class="topBar topBarExt" style="border-top:2px solid #555555;">
														N&atilde;o conformidades / Riscos
													</div>
												</div>
												<div class="col-12" style="font-size:10px;">
														:__NON_CONFORMITY
												</div>
											</div>"$
											
'		Dim template12header As String = "template12header.html"
'		Dim template12footer As String = "template12footer.html"
		
		'Dim thisPage As PageA4 = Types.MakePageA4(1118.740, 113.386, (1118.740 - 113.38), 50, 150, 285, 9.449, 5.670, _
		Dim thisPage As PageA4 = Types.MakePageA4(1118.740, 113.386, (1118.740), 50, 150, 285, 9.449, 5.670, _
								22.667, 4, 15, (77.480 + 11.339 + 5.670), 240, 24, 22.67, _
								File.ReadString(Starter.SharedFolder, "page_header.html"), _
								File.ReadString(Starter.SharedFolder, "page_footer.html"), _
								File.ReadString(Starter.SharedFolder, "page_content.html"), _
								File.ReadString(Starter.SharedFolder, "page_signature.html"), _
								File.ReadString(Starter.SharedFolder, "page_content_observations.html"), _
								File.ReadString(Starter.SharedFolder, "page_content_images.html"), _
								PageNonConformities, _
								File.ReadString(Starter.SharedFolder, "template12.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_first.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_next.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_last.html"))
		
		Dim thisPageData As PageData = Types.MakePageData(pOut, 1, 0, "", 0, 0, 0, 0, "none", "", "", "")
'		
'		Dim HTML2 As String = "" 'File.ReadString(Starter.SharedFolder, "template6A.html")
'		Dim HTML3 As String = File.ReadString(Starter.SharedFolder, "template7A.html")

		
		'**********************************************************************************************************************************************
		'	TRATAMENTO DO PRIMEIRO FICHEIRO DE DADOS
		'**********************************************************************************************************************************************
		thisPageData.BuildPage = ""
		thisPageData.PointCounter = 1
		thisPageData = GAGenerateReportFirst(CLA, thisPage, thisPageData)
		'Log(thisPageData.BuildPage)

		'	'**********************************************************************************************************************************************
		'	'	TRATAMENTO DO TERCEIRO FICHEIRO DE DADOS E SEGUINTES
		'	'**********************************************************************************************************************************************
		thisPageData.BuildPage = ""
		thisPageData.PointCounter = 1
		thisPageData = GAGenerateReportSecond(CLA, thisPage, thisPageData)
		
		
		thisPageData.BuildPage = ""
		thisPageData.BuildPage = $"${thisPage.PageLast}${thisPage.PageImages}"$
		
		Dim SecondFilesCount As Int = thisPageData.PointCounter
		

		Dim SHOW_IMAGES As String = "display:none;"
		Dim IMAGES As String = ""
		Dim ImageCounter As Int = 0
		Private Record2 As Cursor
		'imageb64|
		' ************************************************************************
		' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
		' ************************************************************************
		Dim dbRequest As String = CLA.Tagcode
		Dim sSQL2 As String = $"select distinct ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename,
					b.bullet_master, b.bullet_child, ifnull(c.inner_title, '') as inner_title
					from dta_requests_values_images as a
					left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
					left join dta_requests_relations as c on (c.request_tagcode=a.request_tagcode 
							and c.relation_tagcode=a.inner_request_tagcode 
							and c.repeatcounter=a.repeatcounter)
					where a.request_tagcode='${dbRequest}' 
					And a.on_report=1 
					order by a.id"$
					
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
		If Record2.RowCount > 0 Then
			'thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageImages}"$
			SHOW_IMAGES  = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_IMAGES", SHOW_IMAGES)
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				Dim image As String = Utils.IfNullOrEmpty(Record2.GetString("imageb64"), "")
				Dim imagename As String = Utils.IfNullOrEmpty(Record2.GetString("imagename"), "")
				Dim bBullet As String = $"${Record2.GetInt("bullet_master")}.${Record2.GetInt("bullet_child")}."$
				Dim imgtitle As String = Record2.GetString("inner_title")
'				If Utils.isNullOrEmpty(image) Then
'					If File.Exists(Starter.InternalFolder,imagename) Then
'						Try
'							Dim Base64Con As Base64Convert
'							Base64Con.Initialize
'							Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, imagename)
'						Catch
'							Log(LastException)
'							image = ""
'						End Try
'					End If
'				End If
				ImageCounter = ImageCounter + 1
				If Utils.NE(image) Then
					If Utils.NNE(imagename) Then 
'						Dim image As String = Utils.ConvertImageSizeFromFileWH(imagename, ImageCounter, 300dip, 220dip)
						Dim image As String = Utils.ConvertImageSizeFromFileWH(imagename, ImageCounter, 201dip, 148dip)
					End If
				Else
'					Dim image As String = Utils.ConvertImageSizeWH(image, ImageCounter, 300dip, 220dip)
					Dim image As String = Utils.ConvertImageSizeWH(image, ImageCounter, 201dip, 148dip)
				End If
'				If Utils.NNE(imagename) Then
				If Utils.NNE(image) Then
					
'					Dim percent As Double = 1.65
'					Dim image As String = Utils.ConvertImage(image, ImageCounter, percent)
'					IMAGES = $"${IMAGES}<div class="col-6" style="text-align:center;">
'					<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" width="320" height="240"/><br>
'							Foto ${ImageCounter}
'							</div>"$

					
					IMAGES = $"${IMAGES}<div class="col-6" style="text-align:center;">
							<img src="data:image/png;base64,${image}" width="320" height="240"/><br>
							Foto: ${bBullet} ${imgtitle}
							</div>"$
					
'					IMAGES = $"${IMAGES}<div class="col-6" style="text-align:center;">
'					<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" width="320" height="240"/><br>
'							Foto: ${bBullet} ${imgtitle}
'							</div>"$
				End If
				
			Next
			IMAGES = $"<div class="col-12" style=""><div class="row">${IMAGES}</div></div>"$
		End If
		Record2.Close
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__IMAGES", IMAGES)
		
		thisPageData.PagesOut.Add(thisPageData.BuildPage)
		File.WriteList(Starter.SharedFolder, "IMAGES.TMP", thisPageData.PagesOut)
		thisPageData.PagesOut.Clear
		
		thisPageData.BuildPage = ""
		thisPageData.BuildPage = $"${thisPage.PageNonConformities}${thisPage.PageObservations}${thisPage.PageSignature}"$
		
		ProgressDialogHide
		ProgressDialogShow(ShareCode.reportsMsgGerarNaoConformidades)
		
		' ************************************************************************
		' PEGA NA LISTA DE NÃO CONFORMIDADES
		' ************************************************************************
		
		Dim SHOW_NON_CONFORMITY As String = "display:none;"
		Dim NON_CONFORMITY As String = ""
		Private Record As Cursor
		Dim SQL As String = $"select DISTINCT x.as_title, x.details, x.priority_desc, x.gravity_desc, x.due_date,
				x.unique_key, x.conform_type, 
				x.status, x.title, x.execute_notes, x.execute_action, x.repeatcounter,
				x.task_tagcode, x.item_tagcode, x.tagcode, x.request_tagcode, x.bullet_master, x.bullet_child, 
				x.nametitle, x.executeaction from (select DISTINCT
				ifnull(e.title, '') AS as_title, 
				ifnull(e.details,'') AS details, 
				ifnull(f.tagdesc, '') AS priority_desc, 
				ifnull(g.tagdesc, '') AS gravity_desc, 
				ifnull(e.due_date,'') AS due_date, 
				a.unique_key, d.id as conform_type, 
				a.execute_status as status, c.title, 
				a.execute_notes, 
				a.execute_action, a.repeatcounter,
				a.task_tagcode, a.item_tagcode, a.tagcode, a.request_tagcode, c.bullet_master, c.bullet_child, 
				(SELECT ifnull(inner_title, ( 
					SELECT title FROM dta_tasks WHERE tagcode=a.task_tagcode)) AS inner_title FROM dta_requests_relations WHERE request_tagcode=a.request_tagcode 
							AND relation_tagcode=a.inner_request_tagcode 
							AND repeatcounter=a.repeatcounter) AS nametitle,
				(SELECT distinct execute_action FROM dta_requests_values WHERE request_tagcode=a.request_tagcode 
							AND inner_request_tagcode=a.inner_request_tagcode 
							AND task_tagcode=a.task_tagcode
							AND item_tagcode=a.item_tagcode
							AND unique_key=a.unique_key LIMIT 1) AS executeaction 
				from  dta_requests_values as a 
				inner join dta_tasks_items_answers as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode) 
				inner join dta_tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.unique_key=b.unique_key) 
				inner join type_conformitytypes as d on (d.tagcode=b.type_conformity) 
				left JOIN dta_actions AS e ON (e.tagcode=a.execute_action)
				left JOIN type_prioritytypes AS f ON (f.tagcode=e.priority_tagcode)
				left JOIN type_gravitytypes AS g ON (g.tagcode=e.gravity_tagcode)
				where 1=1 and a.execute_status>=1  
				and  (a.execute_notes is not null and a.execute_notes<>'')
				and a.request_tagcode='${dbRequest}' and d.id=2 ) as x
				order BY x.task_tagcode, x.repeatcounter, x.bullet_master, x.bullet_child"$
		'a.repeatcounter,
		Log(SQL)
				
		Dim dNON_CONFORMITY As String = $""$
		Dim GroupStart As String = ""
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			SHOW_NON_CONFORMITY = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_NON_CONFORMITY", SHOW_NON_CONFORMITY)
			
			Dim NCStart As String = $"<div class="row"><div class="col-12" style="font-size:10px;">
									<table class="table table-bordered" style="width:100%;">"$
			Dim NCHeader As String =  $"<thead style="background:#b7e1dc;">
										<tr>
											<th style="width:30%;">Pergunta/Resposta</th>
											<th style="width:20%;">Observação</th>
											<th style="width:20%;">Recomendação/Ação</th>
											<th style="width:10%;">Gravidade</th>
											<th style="width:10%;">Data Limite</th>
											<th style="width:10%;">Alocado a</th>
										</tr>
										</thead>"$ 

								
			Dim NCEnd As String = $"</table></div></div></div>"$
			NON_CONFORMITY =""
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim ThisGroupStart As String = Utils.IfNullOrEmpty(Record.GetString("nametitle"), "")
								
				If Not(GroupStart = ThisGroupStart) Then
					NON_CONFORMITY = $"${NON_CONFORMITY}
										<tr colspan="6">
											<td><strong>${ThisGroupStart.ToUpperCase}</strong></td>
										</tr>"$ 
					GroupStart = ThisGroupStart
				End If
				
				Dim DueDate As String = Utils.IfNullOrEmpty(Record.GetString("due_date"), "")
				If Utils.NNE(DueDate) Then
					Try
						Dim ddate As Long = DateTime.DateParse(DueDate)
						DateTime.DateFormat = "yyyy-MM-dd"
						DueDate = DateTime.Date(ddate)
					Catch
						Log(LastException)
					End Try
				End If
				DueDate = DueDate.Replace("00:00:00", "").Trim
				Dim theTitle As String = Utils.IfNullOrEmpty(Record.GetString("as_title"), "")
				If Utils.NE(theTitle) Then
					theTitle = $"${Record.GetInt("bullet_master")}.${Record.GetInt("bullet_child")}. ${Record.GetString("title")}"$
				End If
				
				NON_CONFORMITY = $"${NON_CONFORMITY}
									<tr>
										<td style="width:30%;">${theTitle}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("execute_notes"), "")}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("details"), "")}</td>
										<td style="width:10%;">${Utils.IfNullOrEmpty(Record.GetString("gravity_desc"), "")}</td>
										<td style="width:10%;">${DueDate}</td>
										<td style="width:10%;">Cliente</td>
									</tr>"$
				
			Next
			Dim dNON_CONFORMITY As String = $"${NCStart}${NCHeader}<tbody>${NON_CONFORMITY}</tbody>${NCEnd}"$
		
		End If
		Record.Close
		

		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__NON_CONFORMITY", dNON_CONFORMITY)
		
		ProgressDialogHide
		ProgressDialogShow(ShareCode.reportsMsgGerarSumario)
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__REQUEST_OBS", thisPageData.request_obs)
		
		Dim SHOW_SIGNATURES As String = "display:none;"
		Dim SIGNATURE_CLIENT As String = ""
		Dim SIGNATURE_TECHNICAL As String = ""
		
		Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFromRD(CLA, 1)
		Dim SIGANTURE_ENTITY_TECHNICAL As String = SignatureRequestFromRD(CLA, 2)
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		Private Recordw As Cursor
		Dim Rows As Int = 0
		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${dbRequest}'
				and inner_request_tagcode in ('TSKS_EJREGERAL', 'TSKS_EJRGALGERAL')"$    
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			thisPageData.PageTotal = thisPageData.PageTotal + 187
		
			Dim SHOW_SIGNATURES As String = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_SIGNATURES", SHOW_SIGNATURES)
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
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__REPORT_DATE_TIME", ThisReportDate) 'Utils.GetCurrDatetime)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME1", "")
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME2", "")
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME", thisPageData.Technical)
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_CLIENT", SIGNATURE_CLIENT)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_TECHNICAL", SIGNATURE_TECHNICAL)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_ADDITIONAL", $""$)
		
		Dim Col12 As String = $"<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
		thisPageData.BuildPage = $"${thisPageData.BuildPage}${Col12}"$    
		thisPageData.PagesOut.Add(thisPageData.BuildPage)
		
		File.WriteList(Starter.SharedFolder, "SUMARY.TMP", thisPageData.PagesOut)
		thisPageData.PagesOut.Clear
		ProgressDialogHide
		
		ProgressDialogShow(ShareCode.reportsMsgGerarArquivo)
		
		'************************************************************************
		'************************************************************************
		'************************************************************************
		Dim ReportContinue As Boolean = True
		Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
		Wait For(WriteReportToHTMLFile($"${FileReport}.html"$, SecondFilesCount)) Complete (ReportHTMLSave As Boolean)
		If ReportHTMLSave Then
			
			Dim theFile As String = $"${FileReport}.html"$
			CurrentFile = $"${FileReport}.html"$
			Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
			Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
		
			Wait For(CallReportAPIFile(CLA.Tagcode, theFile)) Complete (ReportAPIFile As Boolean)

			ProgressDialogHide
			ProgressDialogShow(ShareCode.reportsMsgGeralRelatorioCarregaFicheiro)
		
			If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
				Wait For(CopyReportFileToShared(theFile)) Complete (ReportCopyFile As Boolean)
				Wait For(UploadReportFileToServer(theFile)) Complete (ReportUploadFile As Boolean)
			End If
			
			Dim sSQL As String = $"update dta_requests set file_report='${theFile}' where tagcode='${CLA.Tagcode}'"$
			Utils.SaveSQLToLog("GAGenerateReport",sSQL, CLA.Tagcode)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
		Else
			ReportContinue = False
		End If
		
		
		If ReportContinue Then
			If (File.Size(Starter.SharedFolder ,$"${FileReport}.html"$) < 20000000) Then
				Dim ShowReport As Boolean = True
				Try
					Dim ThisStringReport As String = File.ReadString(Starter.SharedFolder ,$"${FileReport}.html"$)
				Catch
					Log(LastException)
					ShowReport = False
				End Try
				ReportProgress.Visible = False
				If (ShowReport) Then
					Try
						ReportView.LoadHtml(ThisStringReport)
	'				Dim Filename As String = $"${FileReport}.html"$
	'				ReportView.LoadHtml( $"file://${File.Combine(Starter.SharedFolder, Filename)}"$ )
	'				ReportView.Invalidate
	'				'ReportView.LoadHtml( Starter.Provider.GetFileUri($"${FileReport}.html"$) )
					Catch
					
						MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
						Log(LastException)
					End Try
				End If
			End If
		Else
			MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
		End If

		ProgressDialogHide
'		Return True
	Else
		MsgboxAsync(ShareCode.reportsMsgFuncionalidadeNCFG, ShareCode.GeneralAlertTitle)
	End If
	ReportProgress.Visible = False
	
	ProgressDialogHide
'	Return True
End Sub

'===============================================================================================================
' REQUEST REPORT GENERATION GA2
'===============================================================================================================
Sub GA2GetReportPageHeaderSTD(CLA As RequestCLA, thisPage As PageA4, thisPageData As PageData, Record As Cursor) As PageData
	Dim Name As String = ""
	Dim Morada As String = ""
	Dim ObjectName As String = ""
	'Dim objContact As String = ""
	Dim Local As String = ""
	Dim codPostal As String = ""
	Dim localidade As String = ""
	Dim unidade As String = ""
	
	Name = Utils.IfNullOrEmpty(Record.GetString("name"), "_")
	ObjectName = Utils.IfNullOrEmpty(Record.GetString("objectname"), "_")
	Morada = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
	Local = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
	codPostal = Utils.IfNullOrEmpty(Record.GetString("postal_code"), "_")
	localidade = Utils.IfNullOrEmpty(Record.GetString("city"), "_")
	unidade = Utils.IfNullOrEmpty(Record.GetString("nameobject"), "_")
	Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
	
	Dim contracto As String = Utils.IfNullOrEmpty(Record.GetString("contracto"), "")
	If Utils.NNE(contracto) Then
		If Utils.NNE(Reference) Then
			Reference = $"${Reference} (${contracto})"$
		Else
			Reference = $"${contracto}"$
		End If
	End If
	
	Reference = Utils.IfNullOrEmpty(Reference, "Sem contrato/Prospect")
	Dim Data As String = Utils.IfNullOrEmpty(Record.GetString("run_date"), Utils.GetCurrentDate)
	Data = Utils.GetDate(DateTime.DateParse(Data))
			
	Dim Inicio As String = Record.GetString("run_start") 'req_run_start")
	Dim Fim As String = Record.GetString("run_end")
	Dim Duracao As String = Record.GetString("run_time")
	Dim RequestTypeDesc As String = Utils.IfNullOrEmpty(Record.GetString("request_desc"), "_")
	Dim RequestNumber As String = Record.GetString("tagcode")
	Dim Technical As String = Utils.IfNullOrEmpty(Record.GetString("sessusername"), "")
	Dim Technical2 As String = Utils.IfNullOrEmpty(Record.GetString("sessusername2"), "")
	Technical = Utils.IfNullOrEmpty(Technical, Technical2)
	
	thisPageData.Technical = Technical
	Dim MoradaMais As String = $"${Local}, ${codPostal} ${localidade}"$
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_NUMBER", RequestNumber)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REPORT_NAME", RequestTypeDesc)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_RESULT", "Avaliação")
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_POINTS", 0)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REQUEST_TYPE", ObjectName)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_DATE", Data)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_NAME", Name)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_START", Inicio)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_LOCAL", MoradaMais) 'Morada)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_END", Fim)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_TIME", Duracao)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_UNITY", ObjectName) 'unidade)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__TECHNICAL_NAME", Technical)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__CONTRACT", Reference)
	
	Dim getCO As Int = DBStructures.GetScriptColumnIntEVC($"Select sum(b.points) As total FROM dta_requests_values As a
											INNER JOIN dta_tasks_items_answers As b ON (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
											WHERE a.request_tagcode='${CLA.Request.Trim}'
												And a.execute_status=1
												And a.execute_value=1"$, "total")
	Dim getNA As Int = DBStructures.GetScriptColumnIntEVC($"Select sum(b.points) As total FROM dta_requests_values As a
											INNER JOIN dta_tasks_items_answers As b ON (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.points>0)
											WHERE a.request_tagcode='${CLA.Request.Trim}'
												And a.execute_status=1
												And a.execute_value>2"$, "total")
	Dim getTotal As Int = DBStructures.GetScriptColumnIntEVC($"Select sum(points) as total from dta_tasks_items_answers
											where task_tagcode='${CLA.Action.Trim}' and type_conformity='TCTT_001'"$, "total")
												
	' CALCULO DO SCORE
	Dim vTotal As Double = 0
	vTotal = (getCO / (getTotal - getNA)) * 100
	Dim valScore As String = vTotal
	
	Dim PACKAGENAME As String = Utils.IfNullOrEmpty( DBStructures.GetScriptColumnStrEVC( _
						$"select ifnull(reference, '') as valor
						from dta_tasks_adds where tagcode='${CLA.Action}' limit 1"$, "valor"), _
						$"Controlo"$)
	Dim rlt As Int = Utils.IfNullOrEmpty( _
			DBStructures.GetScriptColumnStrEVCJSON( _
			$"select distinct paramters from dta_tasks_adds where tagcode='${CLA.Task}'"$, _
			"paramters", "report_layout_type"), "0")
	
	If Utils.NNE(valScore) And (rlt = 0) Then
		Log("teste")
		Dim strScore As String = $"Score ${Round2(valScore,1)} %"$
		Dim strScoreDesc As String = $""$  '$"(Em ${ObjCount} registos)"$
'		Dim strPackDesk As String = $"Controlo"$
	Else
		Dim strScore As String = $""$
		Dim strScoreDesc As String = $""$
'		Dim strPackDesk As String = 
	End If
	
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__SCORE_TEXT", strScoreDesc)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__SCORE", strScore)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__PACK", PACKAGENAME) 'strPackDesk)
		
	Return thisPageData
End Sub

Sub GA2GenerateReportFirst(CLA As RequestCLA, thisPage As PageA4, thisPageData As PageData) As PageData
	ProgressDialogShow(ShareCode.reportsMsgGerarGeral)
	
	Private Record As Cursor
	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Request}' ORDER BY z.position, z.repeatcounter"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then

		thisPageData.PageTotal = thisPage.A4Margins + thisPage.PageHeaderHeight + thisPage.PageFirstHeight + thisPage.PageFooterHeight  '370 + 23

		For nRow = 0 To Record.RowCount-1
			Record.Position = nRow
			Dim dbRequest As String = Record.GetString("tagcode")
			Dim dbAction As String = Record.GetString("action_tagcode")
			Dim repeatcounter As Int = Record.GetInt("repeatcounter")
			Dim request_type As String = Record.GetString("request_type")
			
			
			thisPageData = GA2GetReportPageHeaderSTD(CLA, thisPage, thisPageData, Record)
			thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageHeader}${thisPage.PageFirst}"$
			
			Dim RunThisTask As Boolean = True

			' ****************************************************************
			' PEGA NO PRIMEIRO FICHEIRO (PROSPECT)
			' ****************************************************************
			If (RunThisTask) Then

				Log($"*******************************************"$)
				Log($"****************  START   ***************"$)
				Log($"${thisPageData.PageNumber} - ${thisPageData.PageTotal}"$)
				Log($"*******************************************"$)
								
				' ****************************************************************
				' PEGA NO SEGUNDO FICHEIRO (EJR GERAL)
				' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
				' ****************************************************************
				Dim DATA_NAME As String = ""
				Private objRecord As Cursor
				Dim Rows As Int = 0
				Dim task_title As String = DBStructures.GetScriptColumnStrEVC($"select title from dta_tasks where tagcode = '${dbAction}'"$,"title")
				
				If task_title.Trim.ToUpperCase.Contains("PRAGAS") Then
					Dim dataSQL As String = $"Select x.execute_value, x.val_desc, x.title, x.position, x.level, x.datatype,
									x.repeatcounter, x.unique_key, x.execute_notes, x.item_tagcode, x.bullet_master, x.bullet_child
									from (Select a.execute_value, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									c.unique_key, a.execute_notes, a.item_tagcode, c.bullet_master, c.bullet_child
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${dbRequest.Trim}' and a.inner_request_tagcode='${dbAction.Trim}' and a.task_tagcode='${dbAction.Trim}' 
									and a.repeatcounter=${repeatcounter} 
									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status=0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select "" As execute_value, "" As val_desc, a.title, a.position, a.level, a.data_type As datatype, 
									0 as repeatcounter, '' as unique_key, '' as execute_notes, a.item_tagcode, a.bullet_master, a.bullet_child
									from dta_tasks_items As a 
									where a.task_tagcode='${dbAction.Trim}' and a.level=0) as x
									order by x.position, x.repeatcounter"$
				Else
					Dim dataSQL As String = $"Select x.execute_value, x.val_desc, x.title, x.position, x.level, x.datatype,
									x.repeatcounter, x.unique_key, x.execute_notes, x.item_tagcode, x.bullet_master, x.bullet_child
									from (Select a.execute_value, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									c.unique_key, a.execute_notes, a.item_tagcode, c.bullet_master, c.bullet_child
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${dbRequest.Trim}' and a.inner_request_tagcode='${dbAction.Trim}' and a.task_tagcode='${dbAction.Trim}' 
									and a.repeatcounter=${repeatcounter} 
									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select "" As execute_value, "" As val_desc, a.title, a.position, a.level, a.data_type As datatype, 
									0 as repeatcounter, '' as unique_key, '' as execute_notes, a.item_tagcode, a.bullet_master, a.bullet_child
									from dta_tasks_items As a 
									where a.task_tagcode='${dbAction.Trim}' and a.level=0) as x
									order by x.position, x.repeatcounter"$
				End If
'				

				Log("********************************************************")
				Log("********************************************************")
				Log("********************************************************")
				Log(dataSQL)
				objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
				If objRecord.RowCount > 0 Then
					
					thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageContent}"$
					Log(thisPageData.BuildPage)
					Dim LineCounter As Int = 1
					Dim OldChapter As String = ""
					Dim OldLabelBox As Double = 0
					For Rows =0 To objRecord.RowCount-1
						objRecord.Position = Rows
						Dim CHAPTER_NAME As String = ""
						Dim QUEST_NAME As String = ""
						
						Dim Level As Int = objRecord.GetInt("level")
						Dim repeatcounter As Int = objRecord.GetInt("repeatcounter")
						
						Dim bullet_master As Int = objRecord.GetInt("bullet_master")
						Dim bullet_child As Int = objRecord.GetInt("bullet_child")
						'Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
						If (Level = 0) Then
							thisPageData.PointCounter = thisPageData.PointCounter + 1
							LineCounter = 1
							
							Dim ColRows As Int = 1
							If (bullet_master > 0) Then
								Dim ttitle As String = $"${bullet_master}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							Else
								Dim ttitle As String = $"${thisPageData.PointCounter}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							End If
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							Dim LabelBox As Double = ((thisPage.PageLabelSpaceHeight + thisPage.PageLabelHeight) * ColRows) + 2 + thisPage.PageLabelSpaceHeight

							CHAPTER_NAME = $"<table style="width:100%;" class="table">
											<thead>
												<tr>
													<th style="width:55%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">${ttitle}</th>
													<th style="width:15%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Resposta</th>
													<th style="width:30%;text-align: left;padding: 4px 6px;">Observações</th>
												</tr>
											</thead>
											<tbody>"$
							OldChapter = $"${CHAPTER_NAME}"$
							OldLabelBox = LabelBox
							If (Rows >= 1) Then
								CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
							End If
							
						Else
							Dim bBullet As String = ""
							Dim uk As String = objRecord.GetString("unique_key")

							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim scolor As String = "#ffffff"
							If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
								Dim scolor As String = "#b3ff66"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
								Dim scolor As String =  "#ff5c33"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAUDITADO") Then
								Dim scolor As String =  "#e6e6e6"
							Else If (sVal.Replace("ã", "a").Replace("á", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAPLICAVEL") Then
								Dim scolor As String =  "#3399ff"
							End If
							
							Dim ColRows As Int = 1
							Dim ttitle As String = objRecord.GetString("title")
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							If ((sVal.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((sVal.Trim.Length) / 12)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							Dim LabelBox As Double = ((thisPage.PageLabelSpaceHeight + thisPage.PageLabelHeight) * ColRows) + 2 + thisPage.PageLabelSpaceHeight
								
							Dim vNotes As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
							If ((vNotes.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((vNotes.Trim.Length) / 20)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							LineCounter = LineCounter + 1
							
							If ((bullet_master > 0) And (bullet_child > 0)) Then
								bBullet = $"${bullet_master}.${bullet_child}."$
								Dim ttitle2 As String = $"${bBullet} ${ttitle.Trim}"$ 'objRecord.GetString("title")
							Else
								bBullet = $"${thisPageData.PointCounter}.${LineCounter}."$
								Dim ttitle2 As String = $"${bBullet} ${ttitle.Trim}"$ 'objRecord.GetString("title")
							End If
							
							Dim TEMPQUEST_NAME As String = $"<tr>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;">
											${ttitle2.Trim}</td>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;background:${scolor};">${sVal}</td>
											<td style="padding: 4px 6px;">${vNotes}</td>
										</tr>"$
							QUEST_NAME = TEMPQUEST_NAME

							Dim IMAGES As String = ""
							Private Record22 As Cursor
							' ************************************************************************
							' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
							' ************************************************************************
							Dim sSQL2 As String = $"select distinct ifnull(b.title, ifnull(a.imagename,'')) as title, 
												ifnull(a.imageb64,'') as imageb64, 
												ifnull(a.imagename,'') as imagename
												from dta_requests_values_images as a
												left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
												b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
												where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
												and a.repeatcounter=${repeatcounter}
												And a.on_report=1"$
							
							Dim rec22 As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL2)
							Dim thisRow As Int = 0
								
							Do While rec22.NextRow
								
								thisPageData.ImageCounter = thisPageData.ImageCounter + 1
								Dim imagename As String = rec22.GetString("imagename")
								
								If (Utils.NNE(imagename)) Then
									If thisRow = 0 Then
										Dim thisRow As Int = 1
									End If
									IMAGES = $"${IMAGES}
										<li>
											<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" style="width:100%;" /><br>
											Foto: ${bBullet} 
											
										</li>"$
								End If
							Loop
							If (thisRow >= 1) Then
								Dim ptotalimg As Double = thisPage.PageImgRowHeight
								thisPageData.PageTotal = thisPageData.PageTotal + ptotalimg
								Log("*************************************")
								Log("*************************************")
								Log(" PAGE TOTAL : " & thisPageData.PageTotal)
								Log(" IMAGE TOTAL : " & ptotalimg)
								Log("*************************************")
								Log("*************************************")
							End If
							
							
'							Private Record22 As Cursor = Starter.LocalSQLEVC.ExecQuery(sSQL2)
'							If Record22.RowCount > 0 Then
'
'								Dim thisRow As Int = 1
'								Dim ptotalimg As Double = thisPage.PageImgRowHeight
'								For n=0 To Record22.RowCount-1
'									Record22.Position = n
'									thisPageData.ImageCounter = thisPageData.ImageCounter + 1
''									Dim image As String = Record22.GetString("imageb64")
'									Dim imagename As String = Record22.GetString("imagename")
'									
'
'									IMAGES = $"${IMAGES}
'											<li>
'												<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" style="width:100%;" /><br>
'												Foto: ${bBullet} 
'												
'											</li>"$
'								Next
'								thisPageData.PageTotal = thisPageData.PageTotal + ptotalimg
'								Log("*************************************")
'								Log("*************************************")
'								Log(" PAGE TOTAL : " & thisPageData.PageTotal)
'								Log(" IMAGE TOTAL : " & ptotalimg)
'								Log("*************************************")
'								Log("*************************************")
'							End If
'							Record22.Close
							
							If Utils.NNE(IMAGES) Then
								thisPageData.PageTotal = thisPageData.PageTotal + thisPage.PageLabelSpaceHeight
								IMAGES = $"<tr>
											<td colspan="3" style="">
												<div class="col-12" style="">
													<ul class="photos" style="padding-left:0;">
														${IMAGES}
													</ul>
												</div>
											</td>
										</tr>"$
							End If
							QUEST_NAME = $"${QUEST_NAME}${IMAGES}"$

						End If
						DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
						
					Next
				End If
				objRecord.Close
			End If
		Next
		DATA_NAME = $"${DATA_NAME}</tbody> </table>"$
		
	End If
	Record.Close
	
	DATA_NAME = $"${DATA_NAME}<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
	thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_NAME", DATA_NAME)
	thisPageData.PagesOut.Add(thisPageData.BuildPage)
	File.WriteList(Starter.SharedFolder, "FIRSTREP.TMP", thisPageData.PagesOut)
	thisPageData.PagesOut.Clear
	ProgressDialogHide
	'Sleep(100)
	Return thisPageData
End Sub

Sub GA2GenerateReport(CLA As RequestCLA) 'CLA As RequestData) 'As ResumableSub
	
	Dim ReportList As List
	ReportList.Initialize
	ReportList.AddAll(Array As String("page_header", _
	"page_footer", _
	"page_content", _
	"page_signature", _
	"page_content_observations", _
	"page_content_images", _
	"template12", _
	"page_identification_first_score", _
	"page_identification_next", _
	"page_identification_last"))
	
	Dim AllfilesPresent As Boolean = True
	
	For x=0 To ReportList.Size -1
		Dim File2check As String = ReportList.Get(x)
		If File.Exists(Starter.InternalFolder, $"${File2check}.html"$) Then
			File.Copy(Starter.InternalFolder, $"${File2check}.html"$,Starter.SharedFolder, $"${File2check}.html"$)
			Log(File2check)
		Else
			AllfilesPresent = False
		End If
	Next
	
	
	If File.Exists(Starter.InternalFolder, "page_identification_first.html") Then
		File.Copy(Starter.InternalFolder, "page_identification_first.html",Starter.SharedFolder, "page_identification_first.html")
	End If
'	CurrentCLA = CLA
	CurrentRCLA = CLA
	'Sleep(100)
	ProgressDialogShow(ShareCode.reportsMsgProcessar)
	Sleep(50)
	
	ThisReportDate = Utils.GetCurrentDate

	Dim APPL_INSTANCE As String = Utils.SelectFieldFromLocalSQLWRKConfigTable("instance")

	If(APPL_INSTANCE = GRANDACTIVE_INSTANCE) Or (APPL_INSTANCE = SIMGRANDACTIVE_INSTANCE ) Then
		ProgressDialogShow(ShareCode.reportsMsgGerarGeral)
		Sleep(50)

		Dim pOut As List : pOut.Initialize
		
		Dim PageNonConformities As String = $"<div class="col-12" style="margin-bottom:10px;:__SHOW_NON_CONFORMITY">
												<div class="col-12" style="">
													<div class="topBar topBarExt" style="border-top:2px solid #555555;">
														N&atilde;o conformidades / Riscos
													</div>
												</div>
												<div class="col-12" style="font-size:10px;">
														:__NON_CONFORMITY
												</div>
											</div>"$
											
		Dim thisPage As PageA4 = Types.MakePageA4(1118.740, 113.386, (1118.740), 50, 150, 285, 9.449, 5.670, _
								22.667, 4, 15, (77.480 + 11.339 + 5.670), 240, 24, 22.67, _
								File.ReadString(Starter.SharedFolder, "page_header.html"), _
								File.ReadString(Starter.SharedFolder, "page_footer.html"), _
								File.ReadString(Starter.SharedFolder, "page_content.html"), _
								File.ReadString(Starter.SharedFolder, "page_signature.html"), _
								File.ReadString(Starter.SharedFolder, "page_content_observations.html"), _
								File.ReadString(Starter.SharedFolder, "page_content_images.html"), _
								PageNonConformities, _
								File.ReadString(Starter.SharedFolder, "template12.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_first_score.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_next.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_last.html"))

		
		Dim thisPageData As PageData = Types.MakePageData(pOut, 1, 0, "", 0, 0, 0, 0, "none", "", "", "")

		'**********************************************************************************************************************************************
		'	TRATAMENTO DO PRIMEIRO FICHEIRO DE DADOS
		'**********************************************************************************************************************************************
		thisPageData.BuildPage = ""
		thisPageData.PointCounter = 1
		thisPageData = GA2GenerateReportFirst(CLA, thisPage, thisPageData)
		'Log(thisPageData.BuildPage)

		thisPageData.BuildPage = ""
		thisPageData.BuildPage = $"${thisPage.PageLast}${thisPage.PageImages}"$
		
		Dim SecondFilesCount As Int = 0 'thisPageData.PointCounter
		
		Dim SHOW_IMAGES As String = "display:none;"
		Dim IMAGES As String = ""
		Dim ImageCounter As Int = 0
		Private Record2 As Cursor
		'imageb64|
		' ************************************************************************
		' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
		' ************************************************************************
		Dim dbRequest As String = CLA.Request
		Dim sSQL2 As String = $"select distinct ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename,
					b.bullet_master, b.bullet_child, ifnull(c.inner_title, '') as inner_title
					from dta_requests_values_images as a
					left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
					left join dta_requests_relations as c on (c.request_tagcode=a.request_tagcode 
							and c.relation_tagcode=a.inner_request_tagcode 
							and c.repeatcounter=a.repeatcounter)
					where a.request_tagcode='${dbRequest}' 
					And a.on_report=1 
					order by a.id"$
					
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
		If Record2.RowCount > 0 Then
			'thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageImages}"$
			SHOW_IMAGES  = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_IMAGES", SHOW_IMAGES)
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				Dim imageB64 As String = Record2.GetString("imageb64")
				Dim imagename As String = Record2.GetString("imagename")
				Dim bBullet As String = $"${Record2.GetInt("bullet_master")}.${Record2.GetInt("bullet_child")}."$
				Dim imgtitle As String = Record2.GetString("inner_title")

				If Utils.NNE(imagename) Then
					ImageCounter = ImageCounter + 1
					
					If Not(File.Exists(Starter.InternalFolder, imagename)) Then
						Dim Pic As Bitmap = Utils.B64ToBitmap(imageB64)
						
						If imagename.ToLowerCase.EndsWith ("png") Then
							Dim Extension As String = "png"
						Else If imagename.ToLowerCase.EndsWith ("jpg") Then
							Dim Extension As String = "jpg"
						Else
							Dim Extension As String = "png"
						End If
						
						Dim res As ResumableSub = CreateBitmap2File(Starter.InternalFolder,imagename,Pic, Extension)
						Wait For (res) Complete (Finished As Boolean)
					End If
					
					IMAGES = $"${IMAGES}<div class="col-6" style="text-align:center;">
					<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" width="320" height="240"/><br>
							Foto: ${bBullet} ${imgtitle}
							</div>"$
				End If
				
			Next
			IMAGES = $"<div class="col-12" style=""><div class="row">${IMAGES}</div></div>"$
		End If
		Record2.Close
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__IMAGES", IMAGES)
		
		thisPageData.PagesOut.Add(thisPageData.BuildPage)
		File.WriteList(Starter.SharedFolder, "IMAGES.TMP", thisPageData.PagesOut)
		thisPageData.PagesOut.Clear
		
		thisPageData.BuildPage = ""
		thisPageData.BuildPage = $"${thisPage.PageNonConformities}${thisPage.PageObservations}${thisPage.PageSignature}"$
		
		ProgressDialogHide
		ProgressDialogShow(ShareCode.reportsMsgGerarNaoConformidades)
		
		'
		' ************************************************************************
		' PEGA NA LISTA DE NÃO CONFORMIDADES
		' ************************************************************************
		
		Dim SHOW_NON_CONFORMITY As String = "display:none;"
		Dim NON_CONFORMITY As String = ""
		Private Record As Cursor
		Dim SQL As String = $"select DISTINCT x.as_title, x.details, x.priority_desc, x.gravity_desc, x.due_date,
				x.unique_key, x.conform_type, 
				x.status, x.title, x.execute_notes, x.execute_action, x.repeatcounter,
				x.task_tagcode, x.item_tagcode, x.tagcode, x.request_tagcode, x.bullet_master, x.bullet_child, 
				x.nametitle, x.executeaction from (select DISTINCT
				ifnull(e.title, '') AS as_title, 
				ifnull(e.details,'') AS details, 
				ifnull(f.tagdesc, '') AS priority_desc, 
				ifnull(g.tagdesc, '') AS gravity_desc, 
				ifnull(e.due_date,'') AS due_date, 
				a.unique_key, d.id as conform_type, 
				a.execute_status as status, c.title, 
				a.execute_notes, 
				a.execute_action, a.repeatcounter,
				a.task_tagcode, a.item_tagcode, a.tagcode, a.request_tagcode, c.bullet_master, c.bullet_child, 
				(SELECT ifnull(inner_title, ( 
					SELECT title FROM dta_tasks WHERE tagcode=a.task_tagcode)) AS inner_title FROM dta_requests_relations WHERE request_tagcode=a.request_tagcode 
							AND relation_tagcode=a.inner_request_tagcode 
							AND repeatcounter=a.repeatcounter) AS nametitle,
				(SELECT distinct execute_action FROM dta_requests_values WHERE request_tagcode=a.request_tagcode 
							AND inner_request_tagcode=a.inner_request_tagcode 
							AND task_tagcode=a.task_tagcode
							AND item_tagcode=a.item_tagcode
							AND unique_key=a.unique_key LIMIT 1) AS executeaction 
				from  dta_requests_values as a 
				inner join dta_tasks_items_answers as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode) 
				inner join dta_tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.unique_key=b.unique_key) 
				inner join type_conformitytypes as d on (d.tagcode=b.type_conformity) 
				left JOIN dta_actions AS e ON (e.tagcode=a.execute_action)
				left JOIN type_prioritytypes AS f ON (f.tagcode=e.priority_tagcode)
				left JOIN type_gravitytypes AS g ON (g.tagcode=e.gravity_tagcode)
				where 1=1 and a.execute_status>=1  
				and  (a.execute_notes is not null and a.execute_notes<>'')
				and a.request_tagcode='${dbRequest}' and d.id=2 ) as x
				order BY x.task_tagcode, x.repeatcounter, x.bullet_master, x.bullet_child"$
		'a.repeatcounter,
		Log(SQL)
				
		Dim dNON_CONFORMITY As String = $""$
		Dim GroupStart As String = ""
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			SHOW_NON_CONFORMITY = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_NON_CONFORMITY", SHOW_NON_CONFORMITY)
			
			Dim NCStart As String = $"<div class="row"><div class="col-12" style="font-size:10px;">
									<table class="table table-bordered" style="width:100%;">"$
			Dim NCHeader As String =  $"<thead style="background:#b7e1dc;">
										<tr>
											<th style="width:30%;">Pergunta/Resposta</th>
											<th style="width:20%;">Observação</th>
											<th style="width:20%;">Recomendação/Ação</th>
											<th style="width:10%;">Gravidade</th>
											<th style="width:10%;">Data Limite</th>
											<th style="width:10%;">Alocado a</th>
										</tr>
										</thead>"$ 

								
			Dim NCEnd As String = $"</table></div></div></div>"$
			NON_CONFORMITY =""
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Dim ThisGroupStart As String = Utils.IfNullOrEmpty(Record.GetString("nametitle"), "")
								
				If Not(GroupStart = ThisGroupStart) Then
'					NON_CONFORMITY = $"${NON_CONFORMITY}
'										<tr colspan="6">
'											<td><strong>${ThisGroupStart.ToUpperCase}</strong></td>
'										</tr>"$ 
					GroupStart = ThisGroupStart
				End If
				
				Dim DueDate As String = Utils.IfNullOrEmpty(Record.GetString("due_date"), "")
				If Utils.NNE(DueDate) Then
					Try
						Dim ddate As Long = DateTime.DateParse(DueDate)
						DateTime.DateFormat = "yyyy-MM-dd"
						DueDate = DateTime.Date(ddate)
					Catch
						Log(LastException)
					End Try
				End If
				DueDate = DueDate.Replace("00:00:00", "").Trim
				
				Dim theTitle As String = Utils.IfNullOrEmpty(Record.GetString("as_title"), "")
				If Utils.NE(theTitle) Then
					theTitle = $"${Record.GetInt("bullet_master")}.${Record.GetInt("bullet_child")}. ${Record.GetString("title")}"$
				End If
				
				NON_CONFORMITY = $"${NON_CONFORMITY}
									<tr>
										<td style="width:30%;">${theTitle}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("execute_notes"), "")}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("details"), "")}</td>
										<td style="width:10%;">${Utils.IfNullOrEmpty(Record.GetString("gravity_desc"), "")}</td>
										<td style="width:10%;">${DueDate}</td>
										<td style="width:10%;">Cliente</td>
									</tr>"$
				
			Next
			Dim dNON_CONFORMITY As String = $"${NCStart}${NCHeader}<tbody>${NON_CONFORMITY}</tbody>${NCEnd}"$
		
		End If
		Record.Close
		

		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__NON_CONFORMITY", dNON_CONFORMITY)
		
		ProgressDialogHide
		ProgressDialogShow(ShareCode.reportsMsgGerarSumario)
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__REQUEST_OBS", thisPageData.request_obs)
		
		Dim SHOW_SIGNATURES As String = "display:none;"
		Dim SIGNATURE_CLIENT As String = ""
		Dim SIGNATURE_TECHNICAL As String = ""
		
		Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFrom(CLA, 1)
		Dim SIGANTURE_ENTITY_TECHNICAL As String = SignatureRequestFrom(CLA, 2)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		Private Recordw As Cursor
		Dim Rows As Int = 0
'		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${dbRequest}'
'				and inner_request_tagcode in ('TSKS_EJREGERAL', 'TSKS_EJRGALGERAL')"$   
		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${CLA.Request.Trim}'
							and inner_request_tagcode='${CLA.Action.Trim}' and repeatcounter=${CLA.RepeatCounter}"$ 
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			thisPageData.PageTotal = thisPageData.PageTotal + 187
		
			Dim SHOW_SIGNATURES As String = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_SIGNATURES", SHOW_SIGNATURES)
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
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__REPORT_DATE_TIME", ThisReportDate) 'Utils.GetCurrDatetime)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME1", "")
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME2", "")
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME", thisPageData.Technical)
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_CLIENT", SIGNATURE_CLIENT)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_TECHNICAL", SIGNATURE_TECHNICAL)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_ADDITIONAL", $""$)
		
		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${dbRequest}'"$
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			For Rows = 0 To Recordw.RowCount-1
				Recordw.Position = Rows
				Dim SignCount As String = Utils.ZeroLeft(Rows,2)
				Dim SignBookmark As String = $":__SIGNATURE_ORDER${SignCount}"$
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(SignBookmark, Recordw.GetString("image"))
			Next
		End If
		Recordw.Close
		
		
		Dim Col12 As String = $"<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
		thisPageData.BuildPage = $"${thisPageData.BuildPage}${Col12}"$    
		thisPageData.PagesOut.Add(thisPageData.BuildPage)
		
		File.WriteList(Starter.SharedFolder, "SUMARY.TMP", thisPageData.PagesOut)
		thisPageData.PagesOut.Clear
		ProgressDialogHide
		
		ProgressDialogShow(ShareCode.reportsMsgGerarArquivo)
		
		'************************************************************************
		'************************************************************************
		'************************************************************************
		SecondFilesCount= 0
		Dim ReportContinue As Boolean = True
		Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
		Wait For(WriteReportToHTMLFile($"${FileReport}.html"$, SecondFilesCount)) Complete (ReportHTMLSave As Boolean)
		If ReportHTMLSave Then
			
			Dim theFile As String = $"${FileReport}.html"$
			CurrentFile = $"${FileReport}.html"$
			Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
			Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
		
			Wait For(CallReportAPIFile(CLA.Request, theFile)) Complete (ReportAPIFile As Boolean)

			ProgressDialogHide
			ProgressDialogShow(ShareCode.reportsMsgGeralRelatorioCarregaFicheiro)
		
			If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
				Wait For(CopyReportFileToShared(theFile)) Complete (ReportCopyFile As Boolean)
				Wait For(UploadReportFileToServer(theFile)) Complete (ReportUploadFile As Boolean)
			End If
			
			Dim sSQL As String = $"update dta_requests set file_report='${theFile}' where tagcode='${CLA.Request}'"$
			Utils.SaveSQLToLog("GAGenerateReport",sSQL, CLA.Request)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
		Else
			ReportContinue = False
		End If
		
		
		If ReportContinue Then
			If (File.Size(Starter.SharedFolder ,$"${FileReport}.html"$) < 20000000) Then
				Dim ShowReport As Boolean = True
				Try
					Dim ThisStringReport As String = File.ReadString(Starter.SharedFolder ,$"${FileReport}.html"$)
				Catch
					Log(LastException)
					ShowReport = False
				End Try
				ReportProgress.Visible = False
				If (ShowReport) Then
					Try
						ReportView.LoadHtml(ThisStringReport)
					Catch
					
						MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
						Log(LastException)
					End Try
				End If
			End If
		Else
			MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
		End If

		ProgressDialogHide
'		Return True
	Else
		MsgboxAsync(ShareCode.reportsMsgFuncionalidadeNCFG, ShareCode.GeneralAlertTitle)
	End If
	ReportProgress.Visible = False
	
	ProgressDialogHide
'	Return True
End Sub


'===============================================================================================================
' CHECKLIST REPORT GENERATION - ACAIL
'===============================================================================================================

Sub ACAILGenerateReport(CLA As RequestCLA)
	'saveFinalObs
	'CLA.Other.Filter

	ProgressDialogShow(ShareCode.reportsMsgGeralRelatorio)
	Sleep(50)
	Private Record As Cursor
	Dim HtmlFile As String = ""
	'Dim HTML As List = File.ReadList(Starter.SharedFolder, "template1.html")
	Dim HtmlCode As String = ""
	Dim ReportCode As String = ""
	Dim SQL As String = $"select * from dta_tasks where tagcode='${CLA.Task}'"$
	Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim repOptions As String = Utils.IfNullOrEmpty(Record.GetString("generate_report_list"), "")
		Dim ReportList As List = Regex.Split("\|", repOptions.trim )
		If (ReportList.Size>=1) Then
			HtmlCode = ReportList.Get(0)
			ReportCode = HtmlCode
		Else
			If Utils.NNE(repOptions) Then
				HtmlCode = repOptions
				ReportCode = HtmlCode
			End If
		End If
	End If
	Record.Close
	Log(HtmlCode)
	
	If Utils.NNE(HtmlCode) Then
		Dim SQL As String = $"select template_file from dta_reports where tagcode='${HtmlCode}' and prepared=1"$
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			Log($"1=${Record.GetString("template_file")}"$)
			HtmlFile = Record.GetString("template_file")
		End If
		Record.Close
	End If
	Log($"2=${HtmlFile}"$)
	
	If Not(Utils.NNE(HtmlFile)) Then
		HtmlFile = "template4.html"
	End If
	
	Log($"3=${HtmlFile}"$)
	
	Dim fExists As Boolean = False
	If (File.Exists(Starter.InternalFolder, HtmlFile) And File.Exists(Starter.SharedFolder, HtmlFile)) Then
		If (File.LastModified(Starter.InternalFolder, HtmlFile) > File.LastModified(Starter.SharedFolder, HtmlFile)) Then
			File.Copy(Starter.InternalFolder, HtmlFile, Starter.SharedFolder, HtmlFile )
		End If
		fExists = True
	Else If (File.Exists(Starter.InternalFolder, HtmlFile) Or File.Exists(Starter.SharedFolder, HtmlFile)) Then
		If File.Exists(File.DirAssets, HtmlFile) Then
			File.Copy(File.DirAssets, HtmlFile, Starter.SharedFolder, HtmlFile )
			File.Copy(File.DirAssets, HtmlFile, Starter.InternalFolder, HtmlFile )
			fExists = True
		End If
		fExists = True
	End If
	
	If Not(fExists) Then
		If Not(File.Exists(Starter.SharedFolder, HtmlFile)) Then
			If File.Exists(Starter.InternalFolder, HtmlFile) Then
				File.Copy(Starter.InternalFolder, HtmlFile, Starter.SharedFolder, HtmlFile )
				fExists = True
			End If
		Else
			fExists = True
		End If
		If Not(fExists) Then
			If File.Exists(File.DirAssets, HtmlFile) Then
				File.Copy(File.DirAssets, HtmlFile, Starter.SharedFolder, HtmlFile )
				File.Copy(File.DirAssets, HtmlFile, Starter.InternalFolder, HtmlFile )
				fExists = True
			End If
		End If
	End If
		
	Dim GridReport As Boolean = (ReportCode = "REPORT_0003") Or (ReportCode = "REPORT_0004")
		
	If (fExists) Then
		
		If File.Exists(Starter.InternalFolder, HtmlFile) Then
			Log($"Ficheiro: ${HtmlFile} existe!"$)
		End If
		
		
		Dim HTML As String = File.ReadString(Starter.InternalFolder, HtmlFile)
	
		
		Dim DATA_NAME As String = ""
		Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Request}'
							and z.relation_tagcode='${CLA.Action}'
							and z.repeatcounter=${CLA.RepeatCounter} 
							ORDER BY z.position, z.repeatcounter"$
		Log(SQL)
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		Dim ContinuarReport As Boolean = Record.RowCount > 0
		If ContinuarReport Then
			Record.Position = 0
			
			Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
	
			Dim contracto As String = Utils.IfNullOrEmpty(Record.GetString("contracto"), "")
			If Utils.NNE(contracto) Then
				If Utils.NNE(Reference) Then
					Reference = $"${Reference} (${contracto})"$
				Else
					Reference = $"${contracto}"$
				End If
			End If
			
			Reference = Utils.IfNullOrEmpty(Reference, "Sem contrato/Prospect")
			
			Dim Points As Double = Record.GetDouble("points")
			Dim Inicio As String = Record.GetString("run_start")
			Dim Fim As String = Record.GetString("run_end")
			Dim Duracao As String = Record.GetString("run_time")
			Dim Data As String = Utils.GetCurrentDate
			Dim Name As String = Utils.IfNullOrEmpty(Record.GetString("name"), "_")
			Dim RequestType As String = Utils.IfNullOrEmpty(Record.GetString("task_name"), "_")
			Dim RequestNumber As String = Record.GetString("tagcode")
			Dim Morada As String = $"${Record.GetString("address")}, ${Record.GetString("city")}"$
			Dim Postal_Code As String = Record.GetString("postal_code")
			Dim Longitude As String = Record.GetString("longitude")
			Dim Latitude As String = Record.GetString("latitude")
			Dim Phone As String = Record.GetString("phone")
			Dim object_tagcode As String = Record.GetString("object_tagcode")
			
			Dim request_obs As String = Utils.IfNullOrEmpty(Record.GetString("request_obs"), "_")
			
			Dim Technical As String = ShareCode.SESS_OPER_UserName  'Utils.IfNullOrEmpty(Record.GetString("sess_user"), ShareCode.SESS_OPER_User)
			Dim ObjectName As String = Utils.IfNullOrEmpty(Record.GetString("nameobject"), "_")   'objectname"), "_")
			
			Dim username As String = Utils.IfNullOrEmpty(Record.GetString("username"), "")
			Dim techname As String = Utils.IfNullOrEmpty(Record.GetString("techname"), "")
			Dim jobtitle As String = Utils.IfNullOrEmpty(Record.GetString("jobtitle"), "")
			Dim department As String = Utils.IfNullOrEmpty(Record.GetString("department"), "")
			Dim request_type As String = Utils.IfNullOrEmpty(Record.GetString("request_type"), "")
			Dim tipo_intervencao As String = Utils.IfNullOrEmpty(Record.GetString("tipo_intervencao"), "")
			
			Dim Draft As String = "none"
			Dim status As Int = Record.GetInt("task_status_id")
			If (ShareCode.DEVICE_PARAM_PRINT_DRAFT = 1) Then
				'If ((status >=3) And (status <=4)) Then Draft = "block"
				If ((status <=2) Or (status =5)) Then Draft = "block"
			End If
			
			Dim ExecAno As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
							where request_tagcode='${CLA.Request.Trim}'
							and unique_key='43e911f5-ee65-542d-9569-d2d6dd11235d'"$, "execute_value"), "")
			Dim ExecMes As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
							where request_tagcode='${CLA.Request.Trim}'
							and unique_key='01c07189-43a4-56ff-8f5e-180a50fa527b'"$, "execute_value"), "")
			Dim ExecNome As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
							where request_tagcode='${CLA.Request.Trim}'
							and unique_key='0fff1ee1-177a-5a17-81e6-a98a791d02d4'"$, "execute_value"), "")
			
			Dim typerequest_tagcode As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode from dta_requests
							 where tagcode='${CLA.Request.Trim}'"$, "typerequest_tagcode"),"")
							 
			
			If Utils.Int2Bool(ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST) Then
				Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
						WHERE request_tagcode='${CLA.Request.trim}' And repeatcounter=0"$
			Else
				Dim script As String = $"SELECT req_date as executedatetime from dta_requests WHERE tagcode='${CLA.Request.trim}'"$
			End If
	
			Dim Data As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC(script, "executedatetime"), _
						Record.GetString("run_date"))
			
			'*******************************************************************************************
			' ALTERACAO PC - INTEGRAR O CAMPO DA TABELA DTA_TYPEREQUESTS_SIGNATURES
			'*******************************************************************************************
			Try
				Dim SqlAcail As String = $"select position, title from dta_typerequests_signature where typerequest_tagcode='${typerequest_tagcode}'"$
				Dim RecAcail As Cursor
				Private RecAcail As Cursor = Starter.LocalSQLEVC.ExecQuery(SqlAcail)
				If RecAcail.RowCount > 0 Then
					For xP = 0 To RecAcail.RowCount -1
						RecAcail.Position = xP
						Dim xPos As Int = RecAcail.GetInt("position")
						Dim xTitle As String = RecAcail.GetString("title")
						If xPos = 1 Then
							Dim XEntity As String = xTitle
						Else
							Dim XTecnico As String = xTitle
						End If
					Next
				Else
					Dim XEntity As String = ""
					Dim XTecnico As String = ""
				End If
			Catch
				Log(LastException)
				Dim XEntity As String = ""
				Dim XTecnico As String = ""
			End Try
			
			HTML = HTML.Replace(":__EXECUTION_NUMBER", RequestNumber)
			HTML = HTML.Replace(":__REPORT_NAME", RequestType)
			HTML = HTML.Replace(":__EXECUTION_RESULT", CLA.Other.Filter) '  CurrentResult)
			HTML = HTML.Replace(":__EXECUTION_POINTS", Points)
			HTML = HTML.Replace(":__REQUEST_TYPE", tipo_intervencao)
			
			HTML = HTML.Replace(":__ENTITY_NAME", Name)
			HTML = HTML.Replace(":__EXECUTION_START", Inicio)
			HTML = HTML.Replace(":__EXECUTION_LOCAL", Morada)
			HTML = HTML.Replace(":__EXECUTION_END", Fim)
			HTML = HTML.Replace(":__EXECUTION_TIME", Duracao)
			
			HTML = HTML.Replace(":__REQUEST_OBS", request_obs)
			HTML = HTML.Replace(":__REPORT_INFO_VERSION", "VRCH_STD_DEMO_1")
			HTML = HTML.Replace(":__CURRENT_PAGE", "1")
			HTML = HTML.Replace(":__EXECUTION_START", Inicio)
			HTML = HTML.Replace(":__ENTITY_UNITY", ObjectName)
		
			HTML = HTML.Replace(":__TECHNICAL_NAME1", "")
			HTML = HTML.Replace(":__TECHNICAL_NAME2", "")
			HTML = HTML.Replace(":__TECHNICAL_NAME", Technical)
			HTML = HTML.Replace(":__CONTRACT", Reference)
			
			HTML = HTML.Replace(":__DISPLAY_DRAFT", Draft)
			HTML = HTML.Replace(":__EXECUTION_DATE", Data)
			HTML = HTML.Replace(":__EXECUTION_DATETIME", Utils.GetCurrDatetime)
			HTML = HTML.Replace(":__REPORT_DATE_TIME", Utils.GetCurrDatetime)
			HTML = HTML.Replace(":__ENTITY_OBJECT", ObjectName)
			HTML = HTML.Replace(":__ENTITY_MAINT_NAME", "_")
			HTML = HTML.Replace(":__ENTITY_CONTRACT", Reference)
			HTML = HTML.Replace(":__ENTITY_NUM_PROCESS", "_")
			HTML = HTML.Replace(":__ENTITY_NUM_SUBPROCESS", "_")
			HTML = HTML.Replace(":__ENTITY_OBRA_TIPO", "_")
			HTML = HTML.Replace(":__ENTITY_AUDIT_COMPANY", "_")
			HTML = HTML.Replace(":__ENTITY_AUDIT_WORKERS", "_")
			HTML = HTML.Replace(":__ENTITY_CLIENT", Name)

			HTML = HTML.Replace(":__DEPARTMENT", department)
			HTML = HTML.Replace(":__NAMEMASTER", ExecNome)
			HTML = HTML.Replace(":__NAMEUSER", techname)
			HTML = HTML.Replace(":__NAME", username) 'techname)
			HTML = HTML.Replace(":__FUNCTION", jobtitle)
			HTML = HTML.Replace(":__YEAR", ExecAno)
			HTML = HTML.Replace(":__MONTH", ExecMes)
			HTML = HTML.Replace(":__NUMBER", Reference)
			HTML = HTML.Replace(":__OBSERVATIONS", "")
			HTML = HTML.Replace(":__DATE", Data)
			HTML = HTML.Replace(":__REQUEST", RequestNumber)
			HTML = HTML.Replace(":__FUNCUSER", jobtitle)
			HTML = HTML.Replace(":__USERSIGNATURE", "")
			HTML = HTML.Replace(":__MASTERSIGNATURE", "")
			HTML = HTML.Replace(":__USERDATE", "")
			HTML = HTML.Replace(":__MASTERDATE", "")
			
			HTML = HTML.Replace(":__VERIFIEDBY", "")
			HTML = HTML.Replace(":__VERIFIEDDATE", "")
			HTML = HTML.Replace(":__VALIDATEDDATE", "")
			HTML = HTML.Replace(":__VALIDATED", "")
			'***************************************************************************
			' BOOKMARKS QUE ESTAO NO RELATORIO DA ACAIL MAS NAO ESTAVAM AQUI
			'***************************************************************************
			HTML = HTML.Replace(":__EXECUTION_ENTITY", ObjectName)
			HTML = HTML.Replace(":__EXECUTION_OBJECT", ObjectName)
			HTML = HTML.Replace(":__EXECUTION_ADDRESS", Morada)
			HTML = HTML.Replace(":__EXECUTION_CODPOSTAL", Postal_Code)
			HTML = HTML.Replace(":__EXECUTION_LATITUDE", Latitude)
			HTML = HTML.Replace(":__EXECUTION_LONGITUDE", Longitude)

			HTML = HTML.Replace(":__PHONE",Phone )
			HTML = HTML.Replace(":__FAX","" )
			HTML = HTML.Replace(":__EMAIL","" )

			HTML = HTML.Replace(":__SIGNATURE_TEXT_ENTITY", XEntity)
			HTML = HTML.Replace(":__SIGNATURE_TEXT_TECHNICAL", XTecnico)

		
			' CAMPOS DO OBJECT_FIELDS
			Dim OBJECT_FIELD As String = "FIELD_TREATMENT"
			Dim OBJECTO As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode from dta_requests where tagcode = '${CLA.Request.Trim}'"$,"object_tagcode")
			Dim NumeroSeleccao As String = DBStructures.GetScriptColumnStrEVC($"select value from dta_objects_fields where object_tagcode = '${OBJECTO}' and field_tagcode = '${OBJECT_FIELD}'"$,"value")
			If Utils.NNE(NumeroSeleccao) Then
				Dim listaOpcoes As String = DBStructures.GetScriptColumnStrEVC($"select options_list from dta_fields where tagcode = '${OBJECT_FIELD}' and dataentrytype_id=6"$,"options_list")
			
				listaOpcoes = "Sem selecção|" & listaOpcoes
				Dim Tratamento As String = ""
				Try
					Dim NomesTrat As List  = Regex.Split("\|", listaOpcoes)
					If NumeroSeleccao > 0 Then 
						Tratamento = NomesTrat.Get(NumeroSeleccao -1)
					Else
						Tratamento = NomesTrat.Get(NumeroSeleccao)
					End If
				Catch
					Log(LastException)
					Tratamento = ""
				End Try
			Else
				Tratamento = ""
			End If
			
			HTML = HTML.Replace(":__OBJECT_FIELD_TREATMENT", Tratamento)
			   
			' *******************************************************************************************************
			' PEGA NA LISTA DE TODOS OS ITEM_TAGCODES PARA IDENTIFICAÇÃO DOS BOOKMARKS NO RELATÓRIO
			' *******************************************************************************************************
			HTML = ReportSetOtherFields(HTML, CLA)
			   
			   ' CAMPOS DOS OBJECTOS E CONTACTOS
			   
			Dim fieldsSQL As String = $"select a.tagcode, ifnull(a.reference, '') as reference, a.name,
										ifnull(a.email, '') as email, ifnull(a.phone,'') as phone, 
										ifnull(a.mobile,'') as mobile, ifnull(b.tagdesc, '') as jobfunction
										from dta_contacts as a
										left join type_contacttypes as b on (b.tagcode=a.type_contact)
										where a.tagcode in (select contact_tagcode 
											from dta_objects_contacts 
											where object_tagcode in (select object_tagcode 
												from dta_requests where tagcode='${CLA.Request.trim}')) 
										limit 1"$
			Dim Fields As Cursor = Starter.LocalSQLEVC.ExecQuery(fieldsSQL)
			If (Fields.RowCount >=1) Then
				For i=0 To Fields.RowCount-1
					Fields.Position = 0
					For n=0 To Fields.ColumnCount-1
						Dim fname As String = Fields.GetColumnName(n)
						Dim fvalue As String = Fields.GetString(fname)
						If Utils.NNE(fname) Then
							HTML = HTML.Replace($":__CONTACTOBJ_${fname.ToUpperCase}"$, fvalue)
						End If
					Next
				Next
			End If
			   
			' ************************************************************************
			' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
			' ***********************************************************************
			Dim PointCounter As Int = 1
			Dim ImageCounter As Int = 0
			Dim DATA_NAME As String = ""
			Private objRecord As Cursor
			Dim Rows As Int = 0
			
			
			'REPORT_0003 - Report Registo de Despesas   (parent = d0220476-b981-5dad-a088-df19ef80c65b)
			'Ano = 43e911f5-ee65-542d-9569-d2d6dd11235d
			'Mês = 01c07189-43a4-56ff-8f5e-180a50fa527b
			
			
			'REPORT_0004 - Report Distribuição de EPI's (parent = 1dac7422-c56f-50ee-bdf8-3b3dcbd60caf)
			'Name = 0fff1ee1-177a-5a17-81e6-a98a791d02d4
			'Assinatura = 1504b1c0-772f-5bae-8801-1de202562dfd
			
			Dim dataSQL As String = ""
			If (GridReport) Then
				If (ReportCode = "REPORT_0003") Then
					Dim UKey As String = "d0220476-b981-5dad-a088-df19ef80c65b"
				Else
					Dim UKey As String = "1dac7422-c56f-50ee-bdf8-3b3dcbd60caf"
				End If
				
				
				'request_type  tipo_intervencao  request_type  tipo_intervencao
				Dim Paramters As String = DBStructures.GetScriptColumnStrEVC($"select paramters from dta_typerequests where tagcode='${request_type}'"$, "paramters")
				If Utils.NNE(Paramters) Then
					Dim JSON1 As JSONParser
					Dim ContinuaJSON As Boolean = True
					Try
						JSON1.Initialize(Paramters)
						Dim MapJSON As Map = JSON1.NextObject
					Catch
						Log(LastException)
						ContinuaJSON = False
					End Try

					If (ContinuaJSON) Then
						UKey = Utils.IfNullOrEmpty(MapJSON.Get("report_grid_group"), UKey)
					End If
				
				End If
				
				
				' ==================================================
				'Identifica o grupo de valores e repetições
				' ==================================================
				Dim tr As String = ""
				Dim outSQL As String = $"select * from dta_requests_values where unique_key='${UKey}' and request_tagcode='${CLA.Request.Trim}' "$
				Log(outSQL)
				Private outRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(outSQL)
				If outRecord.RowCount > 0 Then
					For nn=0 To outRecord.RowCount-1
						outRecord.Position = nn
						Dim parent As String = Utils.IfNullOrEmpty(outRecord.GetString("unique_key"),"")
						If Utils.NNE(parent) Then
							
							Dim repeat As Int = outRecord.GetInt("repeatcounter")
							Dim repeatitem As Int = outRecord.GetInt("repeatitemcounter")
							Dim inSQL As String = $"select ifnull(a.execute_value_title, a.execute_value) as executeValue,
								a.execute_value_title, a.execute_value, a.title, a.object_tagcode,
								ifnull(c.reference, '') as reference, 
								ifnull(c.lote_number, '') as lote_number, 
								ifnull(c.risk_notes, '') as risk_notes, 
								ifnull(c.category_notes, '') as category_notes
								from dta_requests_values as a 
								inner join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode
									and b.item_tagcode=a.item_tagcode
									and b.unique_key=a.unique_key
									and b.parent_tagcode='${parent}')
								left join dta_articles as c on (c.tagcode=a.object_tagcode)
								where a.request_tagcode='${CLA.Request.Trim}'
									and a.repeatcounter=${repeat}
									and a.repeatitemcounter=${repeatitem} "$
							Log(inSQL)
							Dim td As String = ""
							Private inRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(inSQL)
							If inRecord.RowCount > 0 Then
								If (ReportCode = "REPORT_0003") Then
									For ii=0 To inRecord.RowCount-1
										inRecord.Position = ii
										Dim dataValue As String = inRecord.GetString("executeValue")
										Dim execute_value As String = inRecord.GetString("execute_value")
										Dim execute_value_title As String = inRecord.GetString("execute_value_title")
										Dim title As String = inRecord.GetString("title")
										Dim Reference As String = inRecord.GetString("reference")
										Dim risk_notes As String = inRecord.GetString("risk_notes")
										Dim category_notes As String = inRecord.GetString("category_notes")
'									Log(execute_value)
'									Log(dataValue)
										If (Utils.NNE(execute_value_title)) Then
											dataValue = execute_value_title
										Else
											dataValue = execute_value
										End If
									
										If (ii = inRecord.RowCount-1) Then
											td = $"${td}<td style="text-align:right;">${dataValue} €</td>"$
										Else
											td = $"${td}<td>${dataValue}</td>"$
										End If
									
'									td = $"${td}<td>${dataValue}</td>"$
									Next
									If Utils.NNE(td) Then
										tr = $"${tr}<tr>${td}</tr>"$
									End If
								Else
									For ii=0 To inRecord.RowCount-1
										inRecord.Position = ii
										Dim dataValue As String = inRecord.GetString("executeValue")
										Dim execute_value As String = inRecord.GetString("execute_value")
										Dim execute_value_title As String = inRecord.GetString("execute_value_title")
										Dim title As String = inRecord.GetString("title")
										Dim Reference As String = inRecord.GetString("reference")
										Dim risk_notes As String = inRecord.GetString("risk_notes")
										Dim category_notes As String = inRecord.GetString("category_notes")
										
										If (Utils.NNE(execute_value_title)) Then
											dataValue = execute_value_title
										Else
											dataValue = execute_value
										End If
										
										td = $"<td>${Reference}</td><td>${title}</td><td>${execute_value}</td><td>${risk_notes}</td>"$
										tr = $"${tr}<tr>${td}</tr>"$
		
									Next
								End If
								
							End If
							inRecord.Close
							
							
						End If
					Next
					If (ReportCode = "REPORT_0003") Then
						Dim val As Double = DBStructures.GetScriptColumnDoubleEVC($"select sum(execute_value) as total from dta_requests_values
											where unique_key='c0e6a6ef-399d-555a-be31-b9163ebe09ca' and request_tagcode='${CLA.Request.trim}'"$, "total")
						tr = $"${tr}<tr><td colspan="4" style="text-align:right;">Total</td><td style="text-align:right;"><strong>${val} €</strong></td></tr>"$
					End If
				End If
				outRecord.Close
				
				If Utils.NNE(tr) Then
					HTML = HTML.Replace(":__DATAITEMS", tr)
				End If
			Else
				Dim dataSQL As String = $"Select x.unique_key, x.execute_value, x.execute_notes, x.val_desc, x.title, x.position, x.level,
									x.datatype, x.repeatcounter, x.repeatitemcounter, x.repeated
									from (Select a.unique_key, a.execute_value, ifnull(a.execute_notes,'') as execute_notes, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									a.repeatitemcounter, c.repeated
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
									and a.task_tagcode='${CLA.Task.Trim}' 
									and a.repeatcounter=${CLA.RepeatCounter}
									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select a.unique_key, "" As execute_value, "" as execute_notes, "" As val_desc, a.title, 
									a.position, a.level, a.data_type As datatype, 0 as repeatcounter, 
									0 as repeatitemcounter, a.repeated
									from dta_tasks_items As a 
									where a.task_tagcode='${CLA.Task.Trim}' and a.level=0) as x
									order by x.position, x.repeatcounter, x.repeatitemcounter"$
								
				Dim PageSizeLine As Int = 28
				Dim PageSizeLineTotal As Int = 0
				Dim PageFotos As Int = 0 '450
				Log("********************************************************")
				Log("********************************************************")
				Log("********************************************************")
				Log(dataSQL)
				objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
				If objRecord.RowCount > 0 Then
					'PageSizeLineTotal = PageSizeLine * objRecord.RowCount
					Dim LineCounter As Int = 1
					For Rows =0 To objRecord.RowCount-1
						objRecord.Position = Rows
						Dim CHAPTER_NAME As String = ""
						Dim QUEST_NAME As String = ""
						
						Dim Level As Int = objRecord.GetInt("level")
						Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
						If (Level = 0) Then
							PointCounter = PointCounter + 1
							LineCounter = 1
							CHAPTER_NAME = $"<table style="width:100%;" class="table">
											<thead>
												<tr>
													<th style="width:55%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">${PointCounter}. ${objRecord.GetString("title")}</th>
													<th style="width:20%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Resposta</th>
													<th style="width:25%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Observações</th>
												</tr>
											</thead>
											<tbody>"$
							If (Rows >= 1) Then
								CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
							End If
						Else
							
							Dim uk As String = objRecord.GetString("unique_key")
							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim sEN As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
							'execute_notes
							Dim scolor As String = "#ffffff"
							If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
								scolor = "#b3ff66"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
								scolor = "#ff5c33"
							End If
							
							Try
								Dim ttitle As String = objRecord.GetString("title")
								LineCounter = LineCounter + 1
								QUEST_NAME = $"<tr>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;">
											${PointCounter}.${LineCounter}. ${ttitle.Trim}</td>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;background-color:${scolor};">${sVal}</td>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;">${sEN}</td>
										</tr>"$

							Catch
								Log(LastException)
							End Try
							

						End If
						DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
					Next
				End If
				objRecord.Close
			End If
			
			
			'************************************************************************************************************
			' NOTE: ESTRUTURA DE REPETICAO DA CAPITULOS BASEADO EM PARAMETROS E UM HTML ADICIONAL
			'************************************************************************************************************
				
			Dim checkRes As ResumableSub = ReportRunParamterInQuery(CLA, HTML, object_tagcode, True)
			Wait For (checkRes) Complete (dataHtmlReturn As String)
			
			Log(dataHtmlReturn)
			
			If Utils.NNE(dataHtmlReturn) Then
				HTML = dataHtmlReturn
			End If
			
'			
'			HTML = HTML.Replace(":__MARK1_XVALUE", MarkXValue1)
'			HTML = HTML.Replace(":__MARK2_XVALUE", MarkXValue2)
'			HTML = HTML.Replace(":__MARK3_XVALUE", MarkXValue3)
'			HTML = HTML.Replace(":__MARK4_XVALUE", MarkXValue4)
'			HTML = HTML.Replace(":__MARK5_XVALUE", MarkXValue5)
			
			'GridReport and ContinuarReport
			If GridReport = False Then
				DATA_NAME = $"${DATA_NAME}</tbody> </table><div class="col-12">&nbsp;</div>"$
		
				Log(DATA_NAME)
				HTML = HTML.Replace(":__DATA_NAME", DATA_NAME)

				Sleep(50)
				Dim SHOW_IMAGES As String = "display:none;"
				Dim IMAGES As String = ""
				Private Record2 As Cursor
				'imageb64|
				' ************************************************************************
				' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
				' ************************************************************************
				Dim sSQL As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename from dta_requests_values_images as a
					left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
					b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
					where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
					and a.repeatcounter=${CLA.RepeatCounter}
					and a.on_report=1 order by a.id"$
				Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)
				If Record2.RowCount > 0 Then
					SHOW_IMAGES  = "display:block;"
			
					For n=0 To Record2.RowCount-1
						Record2.Position = n
						ImageCounter = ImageCounter + 1
						Dim image As String = Record2.GetString("imageb64")
						Dim imagename As String = Record2.GetString("imagename")
									
						If Utils.isNullOrEmpty(image) Then
							If File.Exists(Starter.InternalFolder,imagename) Then
								Try
									Dim Base64Con As Base64Convert
									Base64Con.Initialize
									Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, imagename)
								Catch
									Log(LastException)
									image = ""
								End Try
							End If
						End If
				
						IMAGES = $"${IMAGES}<div class="col-6" style="text-align:center;">
					<img src="data:image/png;base64,${image}" width="250" /><br>
					Foto ${ImageCounter}
					</div>"$
					Next
				End If
				Record2.Close
		
				If Utils.NNE(IMAGES) Then
					IMAGES = $"<div class="col-12" style="text-align:center;"><div class="row">
					${IMAGES}
					</div></div>"$
				End If
		
				HTML = HTML.Replace(":__SHOW_IMAGES", SHOW_IMAGES)
				HTML = HTML.Replace(":__IMAGES", IMAGES)
		

		
				' ************************************************************************
				' PEGA NA LISTA DE NÃO CONFORMIDADES
				' ************************************************************************
				Dim SHOW_NON_CONFORMITY As String = "display:none;"
				Dim NON_CONFORMITY As String = ""
				Private Record As Cursor
				Dim SQL As String = $"select distinct a.unique_key, b.id as conform_type, a.execute_status as status, c.title, c.bullet_master, c.bullet_child
				from  dta_requests_values as a 
				inner join dta_tasks_items_answers as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode)
				inner join dta_tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.unique_key=b.unique_key)
				inner join type_conformitytypes as d on (d.tagcode=b.type_conformity and d.id=2)
				where 1=1 and a.execute_status>=1 and 
				a.request_tagcode='${CLA.Request.Trim}' and a.task_tagcode='${CLA.Task.Trim}' and a.repeatcounter=${CLA.RepeatCounter}"$
				
				
				Record = Starter.LocalSQLEVC.ExecQuery(SQL)
				If Record.RowCount > 0 Then
					SHOW_NON_CONFORMITY = "display:block;"
					For Row = 0 To Record.RowCount-1
						Record.Position = Row
						NON_CONFORMITY = $"${NON_CONFORMITY}<div class="col-12">${Record.GetInt("bullet_master")}.${Record.GetInt("bullet_child")}. ${Record.GetString("title")}</div>"$
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
				
				Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFrom(CLA, 1)
				Dim SIGANTURE_ENTITY_TECHNICAL As String = SignatureRequestFrom(CLA, 1)
				HTML = HTML.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
				HTML = HTML.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
				HTML = HTML.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
				Private Recordw As Cursor
				Dim Rows As Int = 0
				Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${CLA.Request.Trim}'
							and inner_request_tagcode='${CLA.Action.Trim}' and repeatcounter=${CLA.RepeatCounter}"$
				Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
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
				Sleep(50)
		
				Dim DATA_ADDITIONAL As String = $"<div class="col-12">&nbsp;</div><div class="col-12">&nbsp;</div>"$
				HTML = HTML.Replace(":__DATA_ADDITIONAL", DATA_ADDITIONAL)
				Sleep(50)
			End If

			'************************************************************************
			'************************************************************************
			'************************************************************************
			Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
			File.WriteString(Starter.SharedFolder, $"${FileReport}.html"$, HTML)
			Sleep(500)
		
			Dim ReportContinue As Boolean = File.Exists(Starter.SharedFolder, $"${FileReport}.html"$)
			If ReportContinue Then
				Dim theFile As String = $"${FileReport}.html"$
				CurrentFile = $"${FileReport}.html"$
				Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
				Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
		
				Wait For(CallReportAPIFile(CLA.Request, theFile)) Complete (ReportAPIFile As Boolean)

				ProgressDialogHide
				ProgressDialogShow(ShareCode.reportsMsgGeralRelatorioCarregaFicheiro)
		
				If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
					Wait For(CopyReportFileToShared(theFile)) Complete (ReportCopyFile As Boolean)
					Wait For(UploadReportFileToServer(theFile)) Complete (ReportUploadFile As Boolean)
				End If
			
				Dim sSQL As String = $"update dta_requests set file_report='${theFile}' where tagcode='${CLA.Request.Trim}'"$
				Utils.SaveSQLToLog("GenerateReport",sSQL, CLA.Request)
				'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			End If
		
			If (File.Size(Starter.SharedFolder ,$"${FileReport}.html"$) < 20000000) Then
				Dim ShowReport As Boolean = True
				Try
					Dim ThisStringReport As String = File.ReadString(Starter.SharedFolder ,$"${FileReport}.html"$)
				Catch
					Log(LastException)
					ShowReport = False
				End Try
				ReportProgress.Visible = False
				If ShowReport Then
					Try
						ReportView.LoadHtml(ThisStringReport)
						'			Dim FileName As String = $"${FileReport}.html"$
						'			ReportView.LoadHtml( $"file://${File.Combine(Starter.SharedFolder, FileName)}"$ )
						'			ReportView.Invalidate
						'			'ReportView.LoadHtml( Starter.Provider.GetFileUri($"${FileReport}.html"$) )
					Catch
						'			ReportContinue = False
						MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
						Log(LastException)
					End Try
				End If
			Else
				MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
			End If

			ProgressDialogHide
		End If

		
	Else
'		MsgboxAsync($"${ShareCode.reportsErroAbrirTemplate}${CRLF}${HtmlFile}"$, ShareCode.GeneralAlertTitle)
		ProgressDialogHide
		Msgbox2Async(ShareCode.reportsErroAbrirTemplate, ShareCode.GeneralAlertTitle,"OK","","",Null,False)
		Wait For Msgbox_Result (Result As Int)
		ProgressDialogHide
		butClose_Click
	End If
End Sub


'===============================================================================================================
' CHECKLIST REPORT GENERATION - RESOPRE
'===============================================================================================================

Sub RESOPREGenerateReport(CLA As RequestCLA)
	'saveFinalObs
	'CLA.Other.Filter

	ProgressDialogShow(ShareCode.reportsMsgGeralRelatorio)
	Sleep(50)
	Private Record As Cursor
	Dim HtmlFile As String = ""
	'Dim HTML As List = File.ReadList(Starter.SharedFolder, "template1.html")
	Dim HtmlCode As String = ""
	Dim ReportCode As String = ""
	Dim SQL As String = $"select * from dta_tasks where tagcode='${CLA.Task}'"$
	Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim repOptions As String = Utils.IfNullOrEmpty(Record.GetString("generate_report_list"), "")
		Dim ReportList As List = Regex.Split("\|", repOptions.trim )
		If (ReportList.Size>=1) Then
			HtmlCode = ReportList.Get(0)
			ReportCode = HtmlCode
		Else
			If Utils.NNE(repOptions) Then
				HtmlCode = repOptions
				ReportCode = HtmlCode
			End If
		End If
	End If
	Record.Close
	Log(HtmlCode)
	
	If Utils.NNE(HtmlCode) Then
		Dim SQL As String = $"select template_file from dta_reports where tagcode='${HtmlCode}' and prepared=1"$
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			Log($"1=${Record.GetString("template_file")}"$)
			HtmlFile = Record.GetString("template_file")
		End If
		Record.Close
	End If
	Log($"2=${HtmlFile}"$)
	
	If Not(Utils.NNE(HtmlFile)) Then
		HtmlFile = "template1.html"
	End If
	
	Log($"3=${HtmlFile}"$)
	
	Dim fExists As Boolean = False
	If (File.Exists(Starter.InternalFolder, HtmlFile) And File.Exists(Starter.SharedFolder, HtmlFile)) Then
		If (File.LastModified(Starter.InternalFolder, HtmlFile) > File.LastModified(Starter.SharedFolder, HtmlFile)) Then
			File.Copy(Starter.InternalFolder, HtmlFile, Starter.SharedFolder, HtmlFile )
		End If
		fExists = True
	End If
	
	If Not(fExists) Then
		If Not(File.Exists(Starter.SharedFolder, HtmlFile)) Then
			If File.Exists(Starter.InternalFolder, HtmlFile) Then
				File.Copy(Starter.InternalFolder, HtmlFile, Starter.SharedFolder, HtmlFile )
				fExists = True
			End If
		Else
			fExists = True
		End If
		If Not(fExists) Then
			If File.Exists(File.DirAssets, HtmlFile) Then
				File.Copy(File.DirAssets, HtmlFile, Starter.SharedFolder, HtmlFile )
				fExists = True
			End If
		End If
	End If
		
	Dim GridReport As Boolean = (ReportCode = "REPORT_0002")
		
	If (fExists) Then
		Dim HTML As String = File.ReadString(Starter.SharedFolder, HtmlFile)
		Dim DATA_NAME As String = ""
		Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Request}'
							and z.relation_tagcode='${CLA.Action}'
							and z.repeatcounter=${CLA.RepeatCounter} 
							ORDER BY z.position, z.repeatcounter"$
		Log(SQL)
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		Dim ContinuarReport As Boolean = Record.RowCount > 0
		If ContinuarReport Then
			Record.Position = 0
			
			Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
	
			Dim contracto As String = Utils.IfNullOrEmpty(Record.GetString("contracto"), "")
			If Utils.NNE(contracto) Then
				If Utils.NNE(Reference) Then
					Reference = $"${Reference} (${contracto})"$
				Else
					Reference = $"${contracto}"$
				End If
			End If
			
			Reference = Utils.IfNullOrEmpty(Reference, "Sem contrato/Prospect")
			
			Dim Points As Double = Record.GetDouble("points")
			Dim Inicio As String = Record.GetString("run_start")
			Dim Fim As String = Record.GetString("run_end")
			Dim Duracao As String = Record.GetString("run_time")
			Dim Data As String = Utils.GetCurrentDate
			Dim Name As String = Utils.IfNullOrEmpty(Record.GetString("name"), "_")
			Dim RequestType As String = Utils.IfNullOrEmpty(Record.GetString("task_name"), "_")
			Dim RequestNumber As String = Record.GetString("tagcode")
			Dim Morada As String = $"${Record.GetString("address")}, ${Record.GetString("city")}"$
			Dim request_obs As String = Utils.IfNullOrEmpty(Record.GetString("request_obs"), "_")
			
			Dim Technical As String = ShareCode.SESS_OPER_UserName  'Utils.IfNullOrEmpty(Record.GetString("sess_user"), ShareCode.SESS_OPER_User)
			Dim ObjectName As String = Utils.IfNullOrEmpty(Record.GetString("objectname"), "_")   'objectname"), "_")
			
			Dim username As String = Utils.IfNullOrEmpty(Record.GetString("username"), "")
			Dim techname As String = Utils.IfNullOrEmpty(Record.GetString("techname"), "")
			Dim jobtitle As String = Utils.IfNullOrEmpty(Record.GetString("jobtitle"), "")
			Dim department As String = Utils.IfNullOrEmpty(Record.GetString("department"), "")
			Dim request_type As String = Utils.IfNullOrEmpty(Record.GetString("request_type"), "")
			Dim tipo_intervencao As String = Utils.IfNullOrEmpty(Record.GetString("tipo_intervencao"), "")
			
			
			If Utils.Int2Bool(ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST) Then
				Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
						WHERE request_tagcode='${CLA.Request.trim}' And repeatcounter=0"$
			Else
				Dim script As String = $"SELECT req_date as executedatetime from dta_requests WHERE tagcode='${CLA.Request.trim}'"$
			End If
	
			Dim Data As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC(script, "executedatetime"), _
						Record.GetString("run_date"))
						
			
			Dim Draft As String = "none"
			Dim status As Int = Record.GetInt("task_status_id")
			If (ShareCode.DEVICE_PARAM_PRINT_DRAFT = 1) Then
				'If ((status >=3) And (status <=4)) Then Draft = "block"
				If ((status <=2) Or (status =5)) Then Draft = "block"
			End If
			
			Dim ExecEquipment As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value_title from dta_requests_values
							where request_tagcode='${CLA.Request.Trim}'
							and unique_key='a9bbaccf-cb8c-5f51-adc3-f1285aeb6ae1'"$, "execute_value_title"), "")
			Dim ExecReference As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
							where request_tagcode='${CLA.Request.Trim}'
							and unique_key='9eae1033-9c3b-5ce9-8e9c-bbe253ec1032'"$, "execute_value"), "")
			Dim ExecBrand As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values
							where request_tagcode='${CLA.Request.Trim}'
							and unique_key='d75fd091-e960-56af-8535-4d0b02973653'"$, "execute_value"), "")
							
			HTML = HTML.Replace(":__EXECUTION_NUMBER", RequestNumber)
			HTML = HTML.Replace(":__REPORT_NAME", RequestType)
			HTML = HTML.Replace(":__EXECUTION_RESULT", CLA.Other.Filter) '  CurrentResult)
			HTML = HTML.Replace(":__EXECUTION_POINTS", Points)
			HTML = HTML.Replace(":__REQUEST_TYPE", tipo_intervencao)
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
			HTML = HTML.Replace(":__EXECUTION_START", Inicio)
			HTML = HTML.Replace(":__ENTITY_UNITY", ObjectName)
			
			HTML = HTML.Replace(":__EXECUTE_NUMBER", RequestNumber)
			HTML = HTML.Replace(":__EXECUTE_STARTDATE", Data)
			HTML = HTML.Replace(":__EXECUTE_ENTITY", Name)
			HTML = HTML.Replace(":__EXECUTE_STARTTIME", Inicio)
			HTML = HTML.Replace(":__EXECUTE_ADDRESS", Morada)
			HTML = HTML.Replace(":__EXECUTE_ENDTIME", Fim)
			HTML = HTML.Replace(":__EXECUTION_START", Inicio)
			HTML = HTML.Replace(":__EXECUTE_OBJECT", ObjectName)
			HTML = HTML.Replace(":__EXECUTE_TECHNICAL", Technical)
			HTML = HTML.Replace(":__EXECUTE_CODPOSTAL", "")
			HTML = HTML.Replace(":__EXECUTE_LOCAL", "")
			HTML = HTML.Replace(":__EXECUTE_LATITUDE", "")
			HTML = HTML.Replace(":__EXECUTE_LONGITUDE", "")
			HTML = HTML.Replace(":__EXECUTE_VEHICLE", "")
			HTML = HTML.Replace(":__EXECUTE_DATETIME", "")
			HTML = HTML.Replace(":__EXECUTE_ENDDATE", "")
			HTML = HTML.Replace(":__EXECUTE_TYPEREQUEST", "")
			HTML = HTML.Replace(":__EXECUTE_CHECKLIST_1", "")
			HTML = HTML.Replace(":__EXECUTE_CHECKLIST_2", "")
			HTML = HTML.Replace(":__EXECUTE_CHECKLIST_3", "")
		
			HTML = HTML.Replace(":__TECHNICAL_NAME1", "")
			HTML = HTML.Replace(":__TECHNICAL_NAME2", "")
			HTML = HTML.Replace(":__TECHNICAL_NAME", Technical)
			HTML = HTML.Replace(":__CONTRACT", Reference)
			
			HTML = HTML.Replace(":__DISPLAY_DRAFT", Draft)
			
			
			HTML = HTML.Replace(":__ENTITY_OBJECT", ObjectName)
			HTML = HTML.Replace(":__ENTITY_MAINT_NAME", "_")
			HTML = HTML.Replace(":__ENTITY_CONTRACT", Reference)
			HTML = HTML.Replace(":__ENTITY_NUM_PROCESS", "_")
			HTML = HTML.Replace(":__ENTITY_NUM_SUBPROCESS", "_")
			HTML = HTML.Replace(":__ENTITY_OBRA_TIPO", "_")
			HTML = HTML.Replace(":__ENTITY_AUDIT_COMPANY", "_")
			HTML = HTML.Replace(":__ENTITY_AUDIT_WORKERS", "_")
			HTML = HTML.Replace(":__ENTITY_CLIENT", Name)

			HTML = HTML.Replace(":__DEPARTMENT", department)
			HTML = HTML.Replace(":__NAMEUSER", techname)
			HTML = HTML.Replace(":__NAME", username) 'techname)
			HTML = HTML.Replace(":__FUNCTION", jobtitle)
			HTML = HTML.Replace(":__NUMBER", Reference)
			HTML = HTML.Replace(":__OBSERVATIONS", "")
			HTML = HTML.Replace(":__DATE", Data)
			HTML = HTML.Replace(":__REQUEST", RequestNumber)
			HTML = HTML.Replace(":__FUNCUSER", jobtitle)
			HTML = HTML.Replace(":__USERSIGNATURE", "")
			HTML = HTML.Replace(":__MASTERSIGNATURE", "")
			HTML = HTML.Replace(":__USERDATE", "")
			HTML = HTML.Replace(":__MASTERDATE", "")
			
			HTML = HTML.Replace(":__VERIFIEDBY", "")
			HTML = HTML.Replace(":__VERIFIEDDATE", "")
			HTML = HTML.Replace(":__VALIDATEDDATE", "")
			HTML = HTML.Replace(":__VALIDATED", "")
			
			
			HTML = HTML.Replace(":__EQUIPMENT", ExecEquipment)
			HTML = HTML.Replace(":__REFERENCE", ExecReference)
			HTML = HTML.Replace(":__BRAND", ExecBrand)
			

			' ************************************************************************
			' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
			' ***********************************************************************
			Dim PointCounter As Int = 1
			Dim ImageCounter As Int = 0
			Dim DATA_NAME As String = ""
			Private objRecord As Cursor
			Dim Rows As Int = 0
			
			
			'REPORT_0003 - Report Registo de Despesas   (parent = d0220476-b981-5dad-a088-df19ef80c65b)
			'Ano = 43e911f5-ee65-542d-9569-d2d6dd11235d
			'Mês = 01c07189-43a4-56ff-8f5e-180a50fa527b
			
			
			'REPORT_0004 - Report Distribuição de EPI's (parent = 1dac7422-c56f-50ee-bdf8-3b3dcbd60caf)
			'Name = 0fff1ee1-177a-5a17-81e6-a98a791d02d4
			'Assinatura = 1504b1c0-772f-5bae-8801-1de202562dfd
			
			Dim dataSQL As String = ""
			If (GridReport) Then
				
				Dim tr As String = ""
				Dim UKey1 As String = DBStructures.GetScriptColumnStrEVCJSON($"select paramters from dta_typerequests where tagcode='${request_type}'"$, _
							"paramters", "report_grid_group")
				Dim UKey2 As String = DBStructures.GetScriptColumnStrEVCJSON($"select paramters from dta_typerequests where tagcode='${request_type}'"$, _
							"paramters", "report_grid_group2")
			
				
				If (Utils.NNE(UKey1)) Then
					' ==================================================
					'Identifica o grupo de valores e repetições
					' ==================================================
					Dim outSQL As String = $"select distinct * from dta_requests_values where unique_key='${UKey1}' 
										and request_tagcode='${CLA.Request.Trim}'
										AND task_tagcode='${CLA.Task.Trim}'
										AND repeatcounter=${CLA.RepeatCounter} "$
					Log(outSQL)
					Private outRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(outSQL)
					If outRecord.RowCount > 0 Then
						For nn=0 To outRecord.RowCount-1
							outRecord.Position = nn
							Dim parent As String = Utils.IfNullOrEmpty(outRecord.GetString("unique_key"),"")
							If Utils.NNE(parent) Then
							
								Dim repeat As Int = outRecord.GetInt("repeatcounter")
								Dim repeatitem As Int = outRecord.GetInt("repeatitemcounter")
								Dim inSQL As String = $"SELECT DISTINCT a.repeatitemcounter, a.item_tagcode, a.execute_value_title, 
											a.execute_value, a.execute_status,
											a.title, a.object_tagcode
											FROM dta_requests_values AS a
											inner join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode
											and b.item_tagcode=a.item_tagcode
											and b.unique_key=a.unique_key
											and b.parent_tagcode='${parent}') 
											WHERE a.task_tagcode='TSKS_20191130_122739' and a.request_tagcode='${CLA.Request.Trim}'
											and a.repeatcounter=${repeat}
											and a.repeatitemcounter=${repeatitem}
											ORDER BY b.position"$   'b.bullet_level, a.repeatcounter, a.repeatitemcounter, b.position"$
								Log(inSQL)
								Dim td As String = ""
								Private inRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(inSQL)
								If inRecord.RowCount > 0 Then
									For ii=0 To inRecord.RowCount-1
										inRecord.Position = ii
										Dim dataValue As String = ""
'											Dim dataValue As String = inRecord.GetString("executeValue")
										Dim execute_value As String = inRecord.GetString("execute_value")
										Dim execute_value_title As String = inRecord.GetString("execute_value_title")
										Dim title As String = inRecord.GetString("title")
										
										If (Utils.NNE(execute_value_title)) Then
											dataValue = execute_value_title
										Else
											dataValue = execute_value
										End If
								
										If (ii = inRecord.RowCount-1) Then
											td = $"${td}<td style="text-align:right;">${dataValue}</td>"$
										Else
											td = $"${td}<td>${dataValue}</td>"$
										End If
								
									Next
									If Utils.NNE(td) Then
										tr = $"${tr}<tr>${td}</tr>"$
									End If
								
								End If
								inRecord.Close
							
							
							End If
						Next
						Dim UKeyTotal As Int = DBStructures.GetScriptColumnStrEVCJSON($"select paramters from dta_typerequests where tagcode='${request_type}'"$, _
							"paramters", "report_grid_calc_total")
						Dim FieldTotal As String = DBStructures.GetScriptColumnStrEVCJSON($"select paramters from dta_typerequests where tagcode='${request_type}'"$, _
							"paramters", "report_grid_field_total")
						If ((UKeyTotal = 1) And Utils.NNE(FieldTotal)) Then
							
							Dim val As Double = DBStructures.GetScriptColumnDoubleEVC($"select sum(execute_value) as total from dta_requests_values
											where unique_key='${FieldTotal}' and request_tagcode='${CLA.Request.trim}'"$, "total")
							tr = $"${tr}<tr><td colspan="4" style="text-align:right;">Total</td><td style="text-align:right;">${val}</td></tr>"$
						End If
					End If
					outRecord.Close
				End If
				
				HTML = HTML.Replace(":__DATAITEMS", tr)
				
				
				Dim tr As String = ""
				If (Utils.NNE(UKey2)) Then
					' ==================================================
					'Identifica o grupo de valores e repetições
					' ==================================================
					Dim outSQL As String = $"select distinct * from dta_requests_values where unique_key='${UKey2}'
										and request_tagcode='${CLA.Request.Trim}'
										AND task_tagcode='${CLA.Task.Trim}'
										AND repeatcounter=${CLA.RepeatCounter} "$
					'ce87abb7-ea05-5900-ad7e-b23c349122bc
'					Log(outSQL)
					Private outRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(outSQL)
					If outRecord.RowCount > 0 Then
						For nn=0 To outRecord.RowCount-1
							outRecord.Position = nn
							Dim parent As String = Utils.IfNullOrEmpty(outRecord.GetString("unique_key"),"")
							If Utils.NNE(parent) Then
							
								Dim repeat As Int = outRecord.GetInt("repeatcounter")
								Dim repeatitem As Int = outRecord.GetInt("repeatitemcounter")
								Dim inSQL As String = $"SELECT DISTINCT a.repeatitemcounter, a.item_tagcode, a.execute_value_title,
											a.execute_value, a.execute_status,
											a.title, a.object_tagcode
											FROM dta_requests_values AS a
											inner join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode
											and b.item_tagcode=a.item_tagcode
											and b.unique_key=a.unique_key
											and b.parent_tagcode='${parent}') 
											WHERE a.task_tagcode='TSKS_20191130_122739' and a.request_tagcode='${CLA.Request.Trim}'
											and a.repeatcounter=${repeat}
											and a.repeatitemcounter=${repeatitem}
											ORDER BY b.position"$   'b.bullet_level, a.repeatcounter, a.repeatitemcounter, b.position"$
								Log(inSQL)
								Dim td As String = ""
								Private inRecord As Cursor = Starter.LocalSQLEVC.ExecQuery(inSQL)
								If inRecord.RowCount > 0 Then
									For ii=0 To inRecord.RowCount-1
										inRecord.Position = ii
										Dim dataValue As String = ""
'											Dim dataValue As String = inRecord.GetString("executeValue")
										Dim execute_value As String = inRecord.GetString("execute_value")
										Dim execute_value_title As String = inRecord.GetString("execute_value_title")
										Dim title As String = inRecord.GetString("title")
										
										If (Utils.NNE(execute_value_title)) Then
											dataValue = execute_value_title
										Else
											dataValue = execute_value
										End If
								
										If (ii = inRecord.RowCount-1) Then
											td = $"${td}<td style="text-align:right;">${dataValue}</td>"$
										Else
											td = $"${td}<td>${dataValue}</td>"$
										End If
								
									Next
									If Utils.NNE(td) Then
										tr = $"${tr}<tr>${td}</tr>"$
									End If
								
								End If
								inRecord.Close
							
							
							End If
						Next
						Dim UKeyTotal As Int = DBStructures.GetScriptColumnStrEVCJSON($"select paramters from dta_typerequests where tagcode='${request_type}'"$, _
							"paramters", "report_grid_calc_total2")
						Dim FieldTotal As String = DBStructures.GetScriptColumnStrEVCJSON($"select paramters from dta_typerequests where tagcode='${request_type}'"$, _
							"paramters", "report_grid_field_total2")
						If ((UKeyTotal = 1) And Utils.NNE(FieldTotal)) Then
							
							Dim val As Double = DBStructures.GetScriptColumnDoubleEVC($"select sum(execute_value) as total from dta_requests_values
											where unique_key='${FieldTotal}' and request_tagcode='${CLA.Request.trim}'"$, "total")
							tr = $"${tr}<tr><td colspan="4" style="text-align:right;">Total</td><td style="text-align:right;">${val}</td></tr>"$
						End If
					End If
					outRecord.Close
				End If
				
				HTML = HTML.Replace(":__MATITEMSDATA", tr)
				
				Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFrom(CLA, 1)
				Dim SIGNATURE_ENTITY_TECHNICAL As String = SignatureRequestFrom(CLA, 1)
				HTML = HTML.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
				HTML = HTML.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGNATURE_ENTITY_TECHNICAL)
				'HTML = HTML.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGNATURE_ENTITY_TECHNICAL)
				
				Dim SIGNATURE_TECHNICAL As String = ""
				Private Recordw As Cursor
				Dim Rows As Int = 0
				Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${CLA.Request.Trim}'
							and inner_request_tagcode='${CLA.Action.Trim}' and repeatcounter=${CLA.RepeatCounter}"$
				Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
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
				HTML = HTML.Replace(":__SIGNATURE_CLIENT", SIGNATURE_CLIENT)
				HTML = HTML.Replace(":__SIGNATURE_TECHNICAL", SIGNATURE_TECHNICAL)
				Sleep(50)
			
			Else
'				Dim dataSQL As String = $"Select x.unique_key, x.execute_value, x.execute_notes, x.val_desc, x.title, x.position, x.level,
'									x.datatype, x.repeatcounter, x.repeatitemcounter, x.repeated
'									from (Select a.unique_key, a.execute_value, ifnull(a.execute_notes,'') as execute_notes, 
'									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
'									Case when (a.execute_status>0 and b.data_type=16) Then b.title Else a.execute_value End
'									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
'									a.repeatitemcounter, c.repeated
'									from dta_requests_values As a
'									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
'									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
'									where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
'									and a.task_tagcode='${CLA.Task.Trim}' 
'									and a.repeatcounter=${CLA.RepeatCounter}
'									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
'									UNION
'									Select a.unique_key, "" As execute_value, "" as execute_notes, "" As val_desc, a.title, 
'									a.position, a.level, a.data_type As datatype, 0 as repeatcounter, 
'									0 as repeatitemcounter, a.repeated
'									from dta_tasks_items As a 
'									where a.task_tagcode='${CLA.Task.Trim}' and a.level=0) as x
'									order by x.position, x.repeatcounter, x.repeatitemcounter"$
									
				Dim dataSQL As String = $"Select x.unique_key, x.execute_value, x.execute_notes, x.val_desc, x.title, x.position, x.level,
									x.datatype, x.repeatcounter, x.repeatitemcounter, x.repeatfieldcounter, x.repeated, x.title_2, x.bullet_level, 
									x.bullet_master, x.bullet_child
									from (Select a.unique_key, a.execute_value, ifnull(a.execute_notes,'') as execute_notes, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									a.repeatitemcounter, a.repeatfieldcounter, c.repeated, a.title as title_2, c.bullet_level, 
									c.bullet_master, c.bullet_child
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
									and a.task_tagcode='${CLA.Task.Trim}' 
									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) 
										Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select a.unique_key, "" As execute_value, "" as execute_notes, "" As val_desc, a.title, 
									a.position, a.level, a.data_type As datatype, 0 as repeatcounter, 
									0 as repeatitemcounter, 0 as repeatfieldcounter, a.repeated, '' as title_2, a.bullet_level, 
									a.bullet_master, a.bullet_child
									from dta_tasks_items As a 
									where a.task_tagcode='${CLA.Task.Trim}' and a.level=0) as x
									order by x.bullet_master, x.repeatcounter, x.repeatitemcounter, x.position, x.repeatfieldcounter"$
								
				Dim PageSizeLine As Int = 28
				Dim PageSizeLineTotal As Int = 0
				Dim PageFotos As Int = 0 '450
				Log("********************************************************")
				Log("********************************************************")
				Log("********************************************************")
				Log(dataSQL)
				objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
				If objRecord.RowCount > 0 Then
					'PageSizeLineTotal = PageSizeLine * objRecord.RowCount
					Dim LineCounter As Int = 1
					For Rows =0 To objRecord.RowCount-1
						objRecord.Position = Rows
						Dim CHAPTER_NAME As String = ""
						Dim QUEST_NAME As String = ""
						
						Dim Level As Int = objRecord.GetInt("level")
						Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
						If (Level = 0) Then
							PointCounter = PointCounter + 1
							LineCounter = 1
							CHAPTER_NAME = $"<table style="width:100%;" class="table">
											<thead>
												<tr>
													<th style="width:55%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">${PointCounter}. ${objRecord.GetString("title")}</th>
													<th style="width:45%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Resposta</th>
												</tr>
											</thead>
											<tbody>"$
							If (Rows >= 1) Then
								CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
							End If
						Else
							
							Dim uk As String = objRecord.GetString("unique_key")
							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim scolor As String = "#ffffff"
							If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
								scolor = "#b3ff66"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
								scolor = "#ff5c33"
							End If
							
							Try
								Dim ttitle As String = objRecord.GetString("title")
								LineCounter = LineCounter + 1
								QUEST_NAME = $"<tr>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;">
											${PointCounter}.${LineCounter}. ${ttitle.Trim}</td>
											<td style="border-right: 2px solid #B5B9BA;padding: 4px 6px;background-color:${scolor};">${sVal}</td>
										</tr>"$

							Catch
								Log(LastException)
							End Try
							

						End If
						DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
					Next
				End If
				objRecord.Close
			End If
			
			'GridReport and ContinuarReport
			If GridReport = False Then
				DATA_NAME = $"${DATA_NAME}</tbody> </table><div class="col-12">&nbsp;</div>"$
		
				Log(DATA_NAME)
				HTML = HTML.Replace(":__DATA_NAME", DATA_NAME)


				Sleep(50)
				Dim SHOW_IMAGES As String = "display:none;"
				Dim IMAGES As String = ""
				Private Record2 As Cursor
				'imageb64|
				' ************************************************************************
				' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
				' ************************************************************************
				Dim sSQL As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename from dta_requests_values_images as a
					left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
					b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
					where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
					and a.repeatcounter=${CLA.RepeatCounter}
					and a.on_report=1 order by a.id"$
				Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)
				If Record2.RowCount > 0 Then
					SHOW_IMAGES  = "display:block;"
			
					For n=0 To Record2.RowCount-1
						Record2.Position = n
						ImageCounter = ImageCounter + 1
						Dim image As String = Record2.GetString("imageb64")
						Dim imagename As String = Record2.GetString("imagename")
									
						If Utils.isNullOrEmpty(image) Then
							If File.Exists(Starter.InternalFolder,imagename) Then
								Try
									Dim Base64Con As Base64Convert
									Base64Con.Initialize
									Dim image As String = Base64Con.EncodeFromImage(Starter.InternalFolder, imagename)
								Catch
									Log(LastException)
									image = ""
								End Try
							End If
						End If
				
						IMAGES = $"${IMAGES}<div class="col-6" style="text-align:center;">
					<img src="data:image/png;base64,${image}" width="250" /><br>
					Foto ${ImageCounter}
					</div>"$
					Next
				End If
				Record2.Close
		
				If Utils.NNE(IMAGES) Then
					IMAGES = $"<div class="col-12" style="text-align:center;"><div class="row">
					${IMAGES}
					</div></div>"$
				End If
		
				HTML = HTML.Replace(":__SHOW_IMAGES", SHOW_IMAGES)
				HTML = HTML.Replace(":__IMAGES", IMAGES)
		

		
				' ************************************************************************
				' PEGA NA LISTA DE NÃO CONFORMIDADES
				' ************************************************************************
				Dim SHOW_NON_CONFORMITY As String = "display:none;"
				Dim NON_CONFORMITY As String = ""
				Private Record As Cursor
				Dim SQL As String = $"select distinct a.unique_key, b.id as conform_type, a.execute_status as status, c.title, c.bullet_master, c.bullet_child
				from  dta_requests_values as a 
				inner join dta_tasks_items_answers as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode)
				inner join dta_tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.unique_key=b.unique_key)
				inner join type_conformitytypes as d on (d.tagcode=b.type_conformity and d.id=2)
				where 1=1 and a.execute_status>=1 and 
				a.request_tagcode='${CLA.Request.Trim}' and a.task_tagcode='${CLA.Task.Trim}' and a.repeatcounter=${CLA.RepeatCounter}"$
				
				
				Record = Starter.LocalSQLEVC.ExecQuery(SQL)
				If Record.RowCount > 0 Then
					SHOW_NON_CONFORMITY = "display:block;"
					For Row = 0 To Record.RowCount-1
						Record.Position = Row
						NON_CONFORMITY = $"${NON_CONFORMITY}<div class="col-12">${Record.GetInt("bullet_master")}.${Record.GetInt("bullet_child")}. ${Record.GetString("title")}</div>"$
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
				
				Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFrom(CLA, 1)
				Dim SIGANTURE_ENTITY_TECHNICAL As String = SignatureRequestFrom(CLA, 1)
				HTML = HTML.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
				HTML = HTML.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
				HTML = HTML.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
				Private Recordw As Cursor
				Dim Rows As Int = 0
				Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${CLA.Request.Trim}'
							and inner_request_tagcode='${CLA.Action.Trim}' and repeatcounter=${CLA.RepeatCounter}"$
				Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
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
				Sleep(50)
		
				Dim DATA_ADDITIONAL As String = $"<div class="col-12">&nbsp;</div><div class="col-12">&nbsp;</div>"$
				HTML = HTML.Replace(":__DATA_ADDITIONAL", DATA_ADDITIONAL)
				Sleep(50)
			End If

			'************************************************************************
			'************************************************************************
			'************************************************************************
			Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
			File.WriteString(Starter.SharedFolder, $"${FileReport}.html"$, HTML)
			Sleep(500)
		
			Dim ReportContinue As Boolean = File.Exists(Starter.SharedFolder, $"${FileReport}.html"$)
			If ReportContinue Then
				Dim theFile As String = $"${FileReport}.html"$
				CurrentFile = $"${FileReport}.html"$
				Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
				Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
		
				Wait For(CallReportAPIFile(CLA.Request, theFile)) Complete (ReportAPIFile As Boolean)

				ProgressDialogHide
				ProgressDialogShow(ShareCode.reportsMsgGeralRelatorioCarregaFicheiro)
		
				If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
					Wait For(CopyReportFileToShared(theFile)) Complete (ReportCopyFile As Boolean)
					Wait For(UploadReportFileToServer(theFile)) Complete (ReportUploadFile As Boolean)
				End If
			
				Dim sSQL As String = $"update dta_requests set file_report='${theFile}' where tagcode='${CLA.Request.Trim}'"$
				Utils.SaveSQLToLog("GenerateReport",sSQL, CLA.Request)
				'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			End If
		
			If (File.Size(Starter.SharedFolder ,$"${FileReport}.html"$) < 20000000) Then
				Dim ShowReport As Boolean = True
				Try
					Dim ThisStringReport As String = File.ReadString(Starter.SharedFolder ,$"${FileReport}.html"$)
				Catch
					Log(LastException)
					ShowReport = False
				End Try
				ReportProgress.Visible = False
				If ShowReport Then
					Try
						ReportView.LoadHtml(ThisStringReport)
						'			Dim FileName As String = $"${FileReport}.html"$
						'			ReportView.LoadHtml( $"file://${File.Combine(Starter.SharedFolder, FileName)}"$ )
						'			ReportView.Invalidate
						'			'ReportView.LoadHtml( Starter.Provider.GetFileUri($"${FileReport}.html"$) )
					Catch
						'			ReportContinue = False
						MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
						Log(LastException)
					End Try
				End If
			Else
				MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
			End If

			ProgressDialogHide
		End If

		
	Else
		Msgbox2Async(ShareCode.reportsErroAbrirTemplate, ShareCode.GeneralAlertTitle,"OK","","",Null,False)
		Wait For Msgbox_Result (Result As Int)
		ProgressDialogHide
		butClose_Click
	End If
End Sub

'===============================================================================================================
' REQUEST REPORT GENERATION RESOPRE2
'===============================================================================================================

Sub RESOPRE2GetReportPageHeaderSTD(CLA As RequestData, thisPage As PageA4, thisPageData As PageData, Record As Cursor) As PageData
	Dim Name As String = ""
	Dim Morada As String = ""
	Dim ObjectName As String = ""
	'Dim objContact As String = ""
	Dim Local As String = ""
	Dim codPostal As String = ""
	Dim localidade As String = ""
	Dim unidade As String = ""
	
	Name = Utils.IfNullOrEmpty(Record.GetString("name"), "_")
	ObjectName = Utils.IfNullOrEmpty(Record.GetString("objectname"), "_")
	Morada = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
	Local = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
	codPostal = Utils.IfNullOrEmpty(Record.GetString("postal_code"), "_")
	localidade = Utils.IfNullOrEmpty(Record.GetString("city"), "_")
	unidade = Utils.IfNullOrEmpty(Record.GetString("nameobject"), "_")
	Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
	
	Dim contracto As String = Utils.IfNullOrEmpty(Record.GetString("contracto"), "")
	If Utils.NNE(contracto) Then
		If Utils.NNE(Reference) Then
			Reference = $"${Reference} (${contracto})"$
		Else
			Reference = $"${contracto}"$
		End If
	End If
	
	Reference = Utils.IfNullOrEmpty(Reference, "Sem contrato/Prospect")
	Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
						WHERE request_tagcode='${CLA.Tagcode.Trim}' 
						And ((inner_request_tagcode='TSKS_EJREQUIPMENT' AND task_tagcode='TSKS_EJREQUIPMENT') 
						Or (inner_request_tagcode='TSKS_EJRGALQUIPMENT' AND task_tagcode='TSKS_EJRGALQUIPMENT'))
						And repeatcounter=0"$
	Dim Data As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC(script, "executedatetime"), _
						Record.GetString("run_date"))
	
	Data = Utils.IfNullOrEmpty(Data, Utils.GetCurrentDate)
	Data = Utils.GetDate(DateTime.DateParse(Data))
	
'	If Utils.Int2Bool(ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST) Then
'		Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
'						WHERE request_tagcode='${CLA.Request.trim}' And repeatcounter=0"$
'	Else
'		Dim script As String = $"SELECT req_date as executedatetime from dta_requests WHERE tagcode='${CLA.Request.trim}'"$
'	End If
'	
'	Dim Data As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC(script, "executedatetime"), _
'						Record.GetString("run_date"))
			
	Dim Inicio As String = Record.GetString("run_start") 'req_run_start")
	Dim Fim As String = Record.GetString("run_end")
	Dim Duracao As String = Record.GetString("run_time")
'	Dim Data As String = Record.GetString("run_date")
	'Dim Data As String = Utils.GetCurrentDate
	Dim RequestTypeDesc As String = Utils.IfNullOrEmpty(Record.GetString("request_desc"), "_")
	Dim RequestNumber As String = Record.GetString("tagcode")
	Dim Technical As String = Utils.IfNullOrEmpty(Record.GetString("sessusername"), "_")
	thisPageData.Technical = Technical
	'Dim Pacote As String = "EJR - Espaços de Jogos e Recreio"
	Dim MoradaMais As String = $"${Local}, ${codPostal} ${localidade}"$
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_NUMBER", RequestNumber)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REPORT_NAME", RequestTypeDesc)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_RESULT", "Avaliação")
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_POINTS", 0)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REQUEST_TYPE", ObjectName)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_DATE", Data)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_NAME", Name)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_START", Inicio)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_LOCAL", MoradaMais) 'Morada)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_END", Fim)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_TIME", Duracao)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_UNITY", ObjectName) 'unidade)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__TECHNICAL_NAME", Technical)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__CONTRACT", Reference)		
	Return thisPageData
End Sub

Sub RESOPRE2GenerateReportFirst(CLA As RequestData, thisPage As PageA4, thisPageData As PageData) As PageData
	ProgressDialogShow(ShareCode.reportsMsgGerarGeral)
	
	Private Record As Cursor
	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} 
						and z.request_tagcode='${CLA.Tagcode}' 
						and z1.repeated=0 
						ORDER BY z.position, z.repeatcounter"$

	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then

		thisPageData.PageTotal = thisPage.A4Margins + thisPage.PageHeaderHeight + thisPage.PageFirstHeight + thisPage.PageFooterHeight  '370 + 23

		For nRow = 0 To Record.RowCount-1
			Record.Position = nRow
			Dim dbRequest As String = Record.GetString("tagcode")
			Dim dbAction As String = Record.GetString("action_tagcode")
			Dim repeatcounter As Int = Record.GetInt("repeatcounter")
			Dim request_type As String = Record.GetString("request_type")
			
			Dim RunThisTask As Boolean = False
			If (nRow=0) Then
				thisPageData = RESOPRE2GetReportPageHeaderSTD(CLA, thisPage, thisPageData, Record)
				thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageHeader}${thisPage.PageFirst}"$
				RunThisTask = True
			End If
			
			' ****************************************************************
			' PEGA NO PRIMEIRO FICHEIRO (CABEÇALHO)
			' ****************************************************************
			If (RunThisTask) Then

				Log($"*******************************************"$)
				Log($"****************  START   ***************"$)
				Log($"${thisPageData.PageNumber} - ${thisPageData.PageTotal}"$)
				Log($"*******************************************"$)
								
				' ****************************************************************
				' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
				' ****************************************************************
				Dim DATA_NAME As String = ""
				Private objRecord As Cursor
				Dim Rows As Int = 0
				Dim dataSQL As String = $"Select x.execute_value, x.val_desc, x.title, x.position, x.level, x.datatype,
									x.repeatcounter, x.unique_key, x.execute_notes, x.item_tagcode, x.bullet_master, x.bullet_child, x.type_conformity 
									from (Select a.execute_value, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									c.unique_key, a.execute_notes, a.item_tagcode, c.bullet_master, c.bullet_child, b.type_conformity
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${dbRequest.trim}' 
										and a.task_tagcode='${dbAction.trim}'
										and a.repeatcounter=${repeatcounter} 
										And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select "" As execute_value, "" As val_desc, a.title, a.position, a.level, a.data_type As datatype, 
									0 as repeatcounter, '' as unique_key, '' as execute_notes, a.item_tagcode, a.bullet_master, a.bullet_child, '' as type_conformity 
									from dta_tasks_items As a 
									where a.task_tagcode='${dbAction.trim}' and a.level=0) as x
									order by x.position, x.repeatcounter "$

				Log("********************************************************")
				Log("********************************************************")
				Log("********************************************************")
				Log(dataSQL)
				objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
				If objRecord.RowCount > 0 Then
					thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageContent}"$
					Log(thisPageData.BuildPage)
					Dim LineCounter As Int = 1
					Dim OldChapter As String = ""
					Dim OldLabelBox As Double = 0
					For Rows =0 To objRecord.RowCount-1
						objRecord.Position = Rows
						Dim CHAPTER_NAME As String = ""
						Dim QUEST_NAME As String = ""
						
						Dim Level As Int = objRecord.GetInt("level")
						Dim repeatcounter As Int = objRecord.GetInt("repeatcounter")
						
						Dim bullet_master As Int = objRecord.GetInt("bullet_master")
						Dim bullet_child As Int = objRecord.GetInt("bullet_child")
						'Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
						If (Level = 0) Then
							thisPageData.PointCounter = thisPageData.PointCounter + 1
							LineCounter = 1
							
							Dim ColRows As Int = 1
							If (bullet_master > 0) Then
								Dim ttitle As String = $"${bullet_master}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							Else
								Dim ttitle As String = $"${thisPageData.PointCounter}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							End If
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							Dim LabelBox As Double = ((thisPage.PageLabelSpaceHeight + thisPage.PageLabelHeight) * ColRows) + 2 + thisPage.PageLabelSpaceHeight

							CHAPTER_NAME = $"<table style="width:100%;" class="table">
											<thead>
												<tr>
													<th class="barLineTypeBorderRight" style="width:55%;text-align: left;padding: 4px 6px;">${ttitle}</th>
													<th class="barLineTypeBorderRight" style="width:15%;text-align: left;padding: 4px 6px;">Resposta</th>
													<th style="width:30%;text-align: left;padding: 4px 6px;">Observações</th>
												</tr>
											</thead>
											<tbody>"$
							OldChapter = $"${CHAPTER_NAME}"$
							OldLabelBox = LabelBox
							If (Rows >= 1) Then
								CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
							End If
							
						Else
							Dim bBullet As String = ""
							Dim uk As String = objRecord.GetString("unique_key")
							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim type_conformity As String = Utils.IfNullOrEmpty(objRecord.GetString("type_conformity"), "")
							Dim scolor As String = "#ffffff"
							
							'************************************************************************************
'							' ALTERACAO PC - VERIFICACAO DE NAO CONFORMITADES DE ACORDO COM O type_conformity
'							'************************************************************************************

							If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
								Dim scolor As String = "#b3ff66"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
								Dim scolor As String =  "#ff5c33"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAUDITADO") Then
								Dim scolor As String =  "#e6e6e6"
							Else If (sVal.Replace("ã", "a").Replace("á", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAPLICAVEL") Then
								Dim scolor As String =  "#3399ff"
							End If

							
							If (type_conformity = "TCTT_001") Then
								scolor = "#b3ff66"
							else if	(type_conformity = "TCTT_002") Then
								scolor = "#ff5c33"
							else if	(type_conformity = "TCTT_003") Then
								scolor = "#3399ff"
							End If
							
							
							Dim ColRows As Int = 1
							Dim ttitle As String = objRecord.GetString("title")
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							If ((sVal.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((sVal.Trim.Length) / 12)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							Dim LabelBox As Double = ((thisPage.PageLabelSpaceHeight + thisPage.PageLabelHeight) * ColRows) + 2 + thisPage.PageLabelSpaceHeight
								
							Dim vNotes As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
							If ((vNotes.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((vNotes.Trim.Length) / 20)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							LineCounter = LineCounter + 1
							
							If ((bullet_master > 0) And (bullet_child > 0)) Then
								bBullet = $"${bullet_master}.${bullet_child}."$
								Dim ttitle2 As String = $"${bBullet} ${ttitle.Trim}"$ 'objRecord.GetString("title")
							Else
								bBullet = $"${thisPageData.PointCounter}.${LineCounter}."$
								Dim ttitle2 As String = $"${bBullet} ${ttitle.Trim}"$ 'objRecord.GetString("title")
							End If
							
							Dim TEMPQUEST_NAME As String = $"<tr>
											<td class="barLineTypeBorderRight" style="padding: 4px 6px;">
											${ttitle2.Trim}</td>
											<td class="barLineTypeBorderRight" style="padding: 4px 6px;background:${scolor};">${sVal}</td>
											<td style="padding: 4px 6px;">${vNotes}</td>
										</tr>"$
							QUEST_NAME = TEMPQUEST_NAME

							Dim IMAGES As String = ""
							Private Record22 As Cursor
							' ************************************************************************
							' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
							' ************************************************************************
							Dim sSQL2 As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename from dta_requests_values_images as a
												left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
												b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
												where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
												and a.repeatcounter=${repeatcounter}
												And a.on_report=1"$
							Record22 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
							
							If Record22.RowCount > 0 Then

								Dim thisRow As Int = 1
								Dim ptotalimg As Double = thisPage.PageImgRowHeight
								For n=0 To Record22.RowCount-1
									Record22.Position = n
									thisPageData.ImageCounter = thisPageData.ImageCounter + 1
									Dim imagename As String = Record22.GetString("imagename")
									Dim image As String = Record22.GetString("imageb64")
									
									If Not(File.Exists(Starter.InternalFolder,imagename)) Then
										If Utils.NNE(image) Then
											Utils.Bitmap2File( Utils.B64ToBitmap(image),Starter.InternalFolder,imagename)
										End If
									End If
				
									If File.Exists(Starter.InternalFolder,imagename) Then
										IMAGES = $"${IMAGES}
											<li>
												<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" style="width:100%;" /><br>
												Foto: ${bBullet} 
												
											</li>"$
									End If

								Next
								thisPageData.PageTotal = thisPageData.PageTotal + ptotalimg
								Log("*************************************")
								Log("*************************************")
								Log(" PAGE TOTAL : " & thisPageData.PageTotal)
								Log(" IMAGE TOTAL : " & ptotalimg)
								Log("*************************************")
								Log("*************************************")
							End If
							Record22.Close
							
							If Utils.NNE(IMAGES) Then
								thisPageData.PageTotal = thisPageData.PageTotal + thisPage.PageLabelSpaceHeight
								IMAGES = $"<tr>
											<td colspan="3" style="">
												<div class="col-12" style="">
													<ul class="photos" style="padding-left:0;">
														${IMAGES}
													</ul>
												</div>
											</td>
										</tr>"$
							End If
							QUEST_NAME = $"${QUEST_NAME}${IMAGES}"$

						End If
						DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
						
					Next
				End If
				objRecord.Close
			End If
		Next
		DATA_NAME = $"${DATA_NAME}</tbody> </table>"$
		
	End If
	Record.Close

	DATA_NAME = $"${DATA_NAME}<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
	thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_NAME", DATA_NAME)
	thisPageData.PagesOut.Add(thisPageData.BuildPage)
	File.WriteList(Starter.SharedFolder, "FIRSTREP.TMP", thisPageData.PagesOut)
	thisPageData.PagesOut.Clear
	ProgressDialogHide
	'Sleep(100)
	Return thisPageData
End Sub

Sub RESOPRE2GenerateReportSecond(CLA As RequestData, thisPage As PageA4, thisPageData As PageData) As PageData
	ProgressDialogShow(ShareCode.reportsMsgGerarEquipamentos)
'	Dim DefLockInfo As String = "Geração de Equipamentos"
	Private Record As Cursor
	Dim EQUIPMENT As String = ""
	Dim EQUIPMENTNUM As String = ""
	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Tagcode}' 
						and z1.repeated=1 
						ORDER BY z.position, z.repeatcounter"$
	thisPageData.BuildPage = ""
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Dim FilesCount As Int = 0
		Dim PointCounter As Int = 1
		For nRow = 0 To Record.RowCount-1
			Record.Position = nRow
			
			FilesCount = FilesCount + 1
			
			Dim dbRequest As String = Record.GetString("tagcode")
			Dim dbAction As String = Record.GetString("action_tagcode")
			Dim repeatcounter As Int = Record.GetInt("repeatcounter")
			thisPageData.BuildPage = $"${thisPage.PageNext}${thisPage.PageContent}"$
			' ************************************************************************
			' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
			' ************************************************************************
			Dim DATA_NAME As String = ""
			Private objRecord As Cursor
			Dim Rows As Int = 0
			Dim dataSQL As String = $"Select x.execute_value, x.val_desc, x.title, x.position, x.level, x.datatype,  
									x.repeatcounter, x.unique_key, x.execute_notes, x.item_tagcode, x.bullet_master, x.bullet_child, x.task_title, x.type_conformity 
									from (Select a.execute_value, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									c.unique_key, a.execute_notes, a.item_tagcode, c.bullet_master, c.bullet_child, d.title as task_title, b.type_conformity 
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									inner join dta_tasks As d on (d.tagcode=a.task_tagcode)
									where a.request_tagcode='${dbRequest.trim}' 
										and a.task_tagcode='${dbAction.trim}'
										and a.repeatcounter=${repeatcounter} 
										And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select "" As execute_value, "" As val_desc, a.title, a.position, a.level, a.data_type As datatype, 
									0 as repeatcounter, '' as unique_key, '' as execute_notes, a.item_tagcode, a.bullet_master, a.bullet_child, b.title as task_title, '' as type_conformity  
									from dta_tasks_items As a 
									inner join dta_tasks As b on (b.tagcode=a.task_tagcode)
									where a.task_tagcode='${dbAction.trim}' and a.level=0) as x
									order by x.position, x.repeatcounter "$
									
			

			'Log(dataSQL)
			objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
			If objRecord.RowCount > 0 Then
				Dim PointCounter As Int = 1
				thisPageData.PageTotal = 100 + 80 + 52 + 52 + 23
				'PageTotal = PageTotal + 120 'Margin
				Dim LineCounter As Int = 1
				Dim OldChapter As String = ""
					
				For Rows =0 To objRecord.RowCount-1
					objRecord.Position = Rows
					Dim CHAPTER_NAME As String = ""
					Dim QUEST_NAME As String = ""
					Dim task_title As String = objRecord.GetString("task_title")
					Dim Level As Int = objRecord.GetInt("level")
					'Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
					Dim itemTask As String = Utils.IfNullOrEmpty(objRecord.GetString("item_tagcode"), "")
					  
'					If (Rows >=1) Then
						
						If (Rows = 0) Then
							Dim OBJECT_NAME_IMAGE As String = ""
						
							'EQUIPMENT = $"${PointCounter}. ${Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")}"$
							EQUIPMENT = $"${Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")}"$
'							EQUIPMENTNUM = $"EQUIPAMENTO"$   '${PointCounter}."$
							EQUIPMENTNUM = task_title
							thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__OBJECT_NAME_IMAGE", OBJECT_NAME_IMAGE)
						End If
						
						Dim bBullet As String = ""
						
						If (Level = 0) Then
							PointCounter = PointCounter + 1
							LineCounter = 1
								
							Dim ColRows As Int = 1
							Dim ttitle As String = $"${PointCounter}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							
							CHAPTER_NAME = $"<table style="width:100%;" class="table">
												<thead>
													<tr>
														<th class="barLineTypeBorderRight" style="width:55%;text-align: left;padding: 4px 6px;">
														${ttitle}</th>
														<th class="barLineTypeBorderRight" style="width:15%;text-align: left;padding: 4px 6px;">Resposta</th>
														<th style="width:30%;text-align: left;padding: 4px 6px;">Observações</th>
													</tr>
												</thead>
												<tbody>"$
							OldChapter = $"${CHAPTER_NAME}"$
							If (Rows >= 1) Then
								CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
							End If
							
							thisPageData.PageTotal = thisPageData.PageTotal + (thisPage.PageTextHeight * ColRows) + thisPage.PageTextMargins
								
						Else
								
							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim scolor As String = "#ffffff"
						Dim type_conformity As String = Utils.IfNullOrEmpty(objRecord.GetString("type_conformity"), "")
						'************************************************************************************
'							' ALTERACAO PC - VERIFICACAO DE NAO CONFORMITADES DE ACORDO COM O type_conformity
'							'************************************************************************************
			
						If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
							scolor = "#b3ff66"
						Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
							scolor = "#ff5c33"
						Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAUDITADO") Then
							Dim scolor As String =  "#e6e6e6"
						Else If (sVal.Replace("ã", "a").Replace("á", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAPLICAVEL") Then
							Dim scolor As String =  "#3399ff"
						End If

						If (type_conformity = "TCTT_001") Then
							scolor = "#b3ff66"
						else if	(type_conformity = "TCTT_002") Then
							scolor = "#ff5c33"
						else if	(type_conformity = "TCTT_003") Then
							scolor = "#3399ff"
						End If
								
							Dim ColRows As Int = 1
							Dim ttitle As String = objRecord.GetString("title")
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							If ((sVal.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((sVal.Trim.Length) / 12)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
					
							
							Dim vNotes As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
							If ((vNotes.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((vNotes.Trim.Length) / 20)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							thisPageData.PageTotal = thisPageData.PageTotal + ((thisPage.PageTextHeight * ColRows) + thisPage.PageTextMargins)
							
							bBullet = $"${PointCounter}.${LineCounter}."$
							LineCounter = LineCounter + 1
							QUEST_NAME = $"<tr>
											<td class="barLineTypeBorderRight" style="padding: 4px 6px;">
											${bBullet} ${ttitle.Trim}</td>
											<td class="barLineTypeBorderRight" style="padding: 4px 6px;background:${scolor};">${sVal}</td>
											<td class="" style="padding: 4px 6px;">${vNotes}</td>
										</tr>"$
								
							Dim uk As String = objRecord.GetString("unique_key")
							Dim IMAGES As String = ""
							Private Record22 As Cursor
							' ************************************************************************
							' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
							' ************************************************************************
							Dim sSQL2 As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename
													from dta_requests_values_images as a
													left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
													b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
													where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
													and a.repeatcounter=${repeatcounter}
													And a.on_report=1"$
							Record22 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
						If Record22.RowCount > 0 Then
'								Dim thisRow As Int = 1
							Dim ptotalimg As Double = thisPage.PageImgRowHeight
							For n=0 To Record22.RowCount-1
								Record22.Position = n
								thisPageData.ImageCounter = thisPageData.ImageCounter + 1
'									Dim image As String = Record22.GetString("imageb64")
								Dim imagename As String = Record22.GetString("imagename")
								Dim image As String = Record22.GetString("imageb64")
									
								If Not(File.Exists(Starter.InternalFolder,imagename)) Then
									If Utils.NNE(image) Then
										Utils.Bitmap2File( Utils.B64ToBitmap(image),Starter.InternalFolder,imagename)
									End If
								End If
				
								If File.Exists(Starter.InternalFolder,imagename) Then
									IMAGES = $"${IMAGES}
											<li>
												<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" style="width:100%;" /><br>
												Foto: ${bBullet} ${EQUIPMENT}
											</li>"$
								End If
									
							Next
							thisPageData.PageTotal = thisPageData.PageTotal + ptotalimg
						End If
						Record22.Close
								
							If Utils.NNE(IMAGES) Then
								IMAGES = $"<tr>
												<td colspan="3" style="padding: 4px 6px;">
													<div class="col-12" style="margin-bottom:10px;">
														<ul class="photos" style="padding-left:0;">
															${IMAGES}
														</ul>
													</div>
												</td>
											</tr>"$
							End If
							QUEST_NAME = $"${QUEST_NAME}${IMAGES}"$
						End If
'					Else 
'						
'						Dim OBJECT_NAME_IMAGE As String = ""
'						
'						'EQUIPMENT = $"${PointCounter}. ${Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")}"$
'						EQUIPMENT = $"${Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")}"$
'						EQUIPMENTNUM = $"${PointCounter}."$
'							
''						Dim uk As String = objRecord.GetString("unique_key")
''						Dim IMAGES As String = ""
''						Private Record22 As Cursor
''						' ************************************************************************
''						' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
''						' ************************************************************************
''						Dim sSQL2 As String = $"select distinct ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename
''												from dta_requests_values_images as a
''												left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
''												b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
''												where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
''												and a.repeatcounter=${repeatcounter}
''												And a.on_report=1"$
''						Record22 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
''						If Record22.RowCount > 0 Then
''							Record22.Position = 0
'''								Dim image As String = Utils.IfNullOrEmpty(Record22.GetString("imageb64"), "")
''							Dim imagename As String = Record22.GetString("imagename")
''								
''							If Utils.NNE(imagename) Then
''
''								OBJECT_NAME_IMAGE = $"<div class="col-12" style="text-align:center;">
''											<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" width="320" height="240" /><br>
''											Foto: ${PointCounter}.${LineCounter}. ${EQUIPMENT}
''										</div>"$
''										
''								thisPageData.PageTotal = thisPageData.PageTotal + 240
''							End If
''								
''						End If
''						Record22.Close
'						thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__OBJECT_NAME_IMAGE", OBJECT_NAME_IMAGE)
'					End If
					DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
						
				Next
			End If
			objRecord.Close
'			End If
			DATA_NAME = $"${DATA_NAME}</tbody> </table>"$
			DATA_NAME = $"${DATA_NAME}<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
			If (Utils.NNE(thisPageData.BuildPage)) Then
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__OBJECT_NAME", $"${EQUIPMENTNUM} ${EQUIPMENT}"$)
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_NAME", DATA_NAME)
				thisPageData.PagesOut.Add(thisPageData.BuildPage)
				File.WriteList(Starter.SharedFolder, "SECONDREP"&nRow&".TMP", thisPageData.PagesOut)
				thisPageData.PagesOut.Clear
			End If
		Next
		thisPageData.PointCounter = FilesCount
	End If
	Record.Close

	ProgressDialogHide
	Return thisPageData
End Sub

Sub RESOPRE2GenerateReport(CLA As RequestData) 'As ResumableSub
	
	If File.Exists(Starter.InternalFolder, "page_id_resopre_first.html") Then
		File.Copy(Starter.InternalFolder, "page_id_resopre_first.html",Starter.SharedFolder, "page_id_resopre_first.html")
	End If
	
	CurrentCLA = CLA
	'Sleep(100)
	ProgressDialogShow(ShareCode.reportsMsgProcessar)
	Sleep(50)
	
	ThisReportDate = Utils.GetCurrentDate

	Dim APPL_INSTANCE As String = Utils.SelectFieldFromLocalSQLWRKConfigTable("instance")

	If(APPL_INSTANCE = RESOPRE_INSTANCE) Then
		ProgressDialogShow(ShareCode.reportsMsgGerarGeral)
		Sleep(50)

		Dim pOut As List : pOut.Initialize
		
		Dim PageNonConformities As String = $"<div class="col-12" style="margin-bottom:10px;:__SHOW_NON_CONFORMITY">
												<div class="col-12" style="">
													<div class="topBar topBarExt" style="border-top:2px solid #555555;">
														N&atilde;o conformidades / Riscos
													</div>
												</div>
												<div class="col-12" style="font-size:10px;">
														:__NON_CONFORMITY
												</div>
											</div>"$
											
		Dim thisPage As PageA4 = Types.MakePageA4(1118.740, 113.386, (1118.740), 50, 150, 285, 9.449, 5.670, _
								22.667, 4, 15, (77.480 + 11.339 + 5.670), 240, 24, 22.67, _
								File.ReadString(Starter.SharedFolder, "page_resopre_header.html"), _
								File.ReadString(Starter.SharedFolder, "page_resopre_footer.html"), _
								File.ReadString(Starter.SharedFolder, "page_content.html"), _
								File.ReadString(Starter.SharedFolder, "page_signature.html"), _
								File.ReadString(Starter.SharedFolder, "page_content_observations.html"), _
								File.ReadString(Starter.SharedFolder, "page_content_images.html"), _
								PageNonConformities, _
								File.ReadString(Starter.SharedFolder, "template_resopre_group.html"), _
								File.ReadString(Starter.SharedFolder, "page_id_resopre_first.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_next.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_last.html"))
		
		Dim thisPageData As PageData = Types.MakePageData(pOut, 1, 0, "", 0, 0, 0, 0, "none", "", "", "")

		
		'**********************************************************************************************************************************************
		'	TRATAMENTO DO PRIMEIRO FICHEIRO DE DADOS
		'**********************************************************************************************************************************************
		thisPageData.BuildPage = ""
		thisPageData.PointCounter = 1
		thisPageData = RESOPRE2GenerateReportFirst(CLA, thisPage, thisPageData)
		'Log(thisPageData.BuildPage)

		'	'**********************************************************************************************************************************************
		'	'	TRATAMENTO DO TERCEIRO FICHEIRO DE DADOS E SEGUINTES
		'	'**********************************************************************************************************************************************
		thisPageData.BuildPage = ""
		thisPageData.PointCounter = 1
		thisPageData = RESOPRE2GenerateReportSecond(CLA, thisPage, thisPageData)
		
		
		thisPageData.BuildPage = ""
		thisPageData.BuildPage = $"${thisPage.PageLast}${thisPage.PageImages}"$
		
		Dim SecondFilesCount As Int = thisPageData.PointCounter
		

		Dim SHOW_IMAGES As String = "display:none;"
		Dim IMAGES As String = ""
		Dim ImageCounter As Int = 0
		Private Record2 As Cursor
		'imageb64|
		' ************************************************************************
		' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
		' ************************************************************************
		Dim dbRequest As String = CLA.Tagcode
		Dim sSQL2 As String = $"select distinct ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename,
					b.bullet_master, b.bullet_child, ifnull(c.inner_title, '') as inner_title
					from dta_requests_values_images as a
					left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
					left join dta_requests_relations as c on (c.request_tagcode=a.request_tagcode 
							and c.relation_tagcode=a.inner_request_tagcode 
							and c.repeatcounter=a.repeatcounter)
					where a.request_tagcode='${dbRequest}' 
					And a.on_report=1 
					order by a.id"$
					
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
		If Record2.RowCount > 0 Then
			'thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageImages}"$
			SHOW_IMAGES  = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_IMAGES", SHOW_IMAGES)
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				Dim image As String = Record2.GetString("imageb64")
				Dim imagename As String = Record2.GetString("imagename")
				Dim bBullet As String = $"${Record2.GetInt("bullet_master")}.${Record2.GetInt("bullet_child")}."$
				Dim imgtitle As String = Record2.GetString("inner_title")
				
				If Not(File.Exists(Starter.InternalFolder,imagename)) Then
					If Utils.NNE(image) Then
						Utils.Bitmap2File( Utils.B64ToBitmap(image),Starter.InternalFolder,imagename)
					End If
				End If
				
				If File.Exists(Starter.InternalFolder,imagename) Then
					ImageCounter = ImageCounter + 1
					IMAGES = $"${IMAGES}<div class="col-6" style="text-align:center;">
					<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" width="320" height="240"/><br>
							Foto: ${bBullet} ${imgtitle}
							</div>"$
				End If
				
			Next
			IMAGES = $"<div class="col-12" style=""><div class="row">${IMAGES}</div></div>"$
		End If
		Record2.Close
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__IMAGES", IMAGES)
		
		thisPageData.PagesOut.Add(thisPageData.BuildPage)
		File.WriteList(Starter.SharedFolder, "IMAGES.TMP", thisPageData.PagesOut)
		thisPageData.PagesOut.Clear
		
		thisPageData.BuildPage = ""
		thisPageData.BuildPage = $"${thisPage.PageNonConformities}${thisPage.PageObservations}${thisPage.PageSignature}"$
		
		ProgressDialogHide
		ProgressDialogShow(ShareCode.reportsMsgGerarNaoConformidades)
		
		'
		' ************************************************************************
		' PEGA NA LISTA DE NÃO CONFORMIDADES
		' ************************************************************************
		
		Dim SHOW_NON_CONFORMITY As String = "display:none;"
		Dim NON_CONFORMITY As String = ""
		Private Record As Cursor
		Dim SQL As String = $"select DISTINCT x.as_title, x.details, x.priority_desc, x.gravity_desc, x.due_date,
				x.unique_key, x.conform_type, 
				x.status, x.title, x.execute_notes, x.execute_action, x.repeatcounter,
				x.task_tagcode, x.item_tagcode, x.tagcode, x.request_tagcode, x.bullet_master, x.bullet_child, 
				x.nametitle, x.executeaction from (select DISTINCT
				ifnull(e.title, '') AS as_title, 
				ifnull(e.details,'') AS details, 
				ifnull(f.tagdesc, '') AS priority_desc, 
				ifnull(g.tagdesc, '') AS gravity_desc, 
				ifnull(e.due_date,'') AS due_date, 
				a.unique_key, d.id as conform_type, 
				a.execute_status as status, c.title, 
				a.execute_notes, 
				a.execute_action, a.repeatcounter,
				a.task_tagcode, a.item_tagcode, a.tagcode, a.request_tagcode, c.bullet_master, c.bullet_child, 
				(SELECT ifnull(inner_title, ( 
					SELECT title FROM dta_tasks WHERE tagcode=a.task_tagcode)) AS inner_title FROM dta_requests_relations WHERE request_tagcode=a.request_tagcode 
							AND relation_tagcode=a.inner_request_tagcode 
							AND repeatcounter=a.repeatcounter) AS nametitle,
				(SELECT distinct execute_action FROM dta_requests_values WHERE request_tagcode=a.request_tagcode 
							AND inner_request_tagcode=a.inner_request_tagcode 
							AND task_tagcode=a.task_tagcode
							AND item_tagcode=a.item_tagcode
							AND unique_key=a.unique_key LIMIT 1) AS executeaction 
				from  dta_requests_values as a 
				inner join dta_tasks_items_answers as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode) 
				inner join dta_tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.unique_key=b.unique_key) 
				inner join type_conformitytypes as d on (d.tagcode=b.type_conformity) 
				left JOIN dta_actions AS e ON (e.tagcode=a.execute_action)
				left JOIN type_prioritytypes AS f ON (f.tagcode=e.priority_tagcode)
				left JOIN type_gravitytypes AS g ON (g.tagcode=e.gravity_tagcode)
				where 1=1 and a.execute_status>=1   
				and  (a.execute_notes is not null and a.execute_notes<>'')
				and a.request_tagcode='${dbRequest}' and d.id=2  AND a.execute_notes IS NOT null) as x
				order BY x.task_tagcode, x.repeatcounter, x.bullet_master, x.bullet_child"$
		'a.repeatcounter,
		Log(SQL)
				
		Dim dNON_CONFORMITY As String = $""$
		
		Dim GroupStart As String = ""
		
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			SHOW_NON_CONFORMITY = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_NON_CONFORMITY", SHOW_NON_CONFORMITY)
			
			Dim NCStart As String = $"<div class="row"><div class="col-12" style="font-size:10px;">
									<table class="table table-bordered" style="width:100%;">"$
			'style="background:#b7e1dc;"
			Dim NCHeader As String =  $"<thead class="barType2">
										<tr>
											<th style="width:30%;">Pergunta/Resposta</th>
											<th style="width:20%;">Observação</th>
											<th style="width:20%;">Recomendação/Ação</th>
											<th style="width:10%;">Gravidade</th>
											<th style="width:10%;">Data Limite</th>
											<th style="width:10%;">Alocado a</th>
										</tr>
										</thead>"$ 

								
			Dim NCEnd As String = $"</table></div></div></div>"$
			NON_CONFORMITY =""
				
			
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				
				
				Dim ThisGroupStart As String = Utils.IfNullOrEmpty(Record.GetString("nametitle"), "")
								
				If Not(GroupStart = ThisGroupStart) Then
					NON_CONFORMITY = $"${NON_CONFORMITY}
										<tr colspan="6">
											<td><strong>${ThisGroupStart.ToUpperCase}</strong></td>
										</tr>"$ 
					GroupStart = ThisGroupStart
				End If
				
				Dim DueDate As String = Utils.IfNullOrEmpty(Record.GetString("due_date"), "")
				If Utils.NNE(DueDate) Then
					Try
						Dim ddate As Long = DateTime.DateParse(DueDate)
						DateTime.DateFormat = "yyyy-MM-dd"
						DueDate = DateTime.Date(ddate)
					Catch
						Log(LastException)
					End Try
				End If
				DueDate = DueDate.Replace("00:00:00", "").Trim
				Dim theTitle As String = Utils.IfNullOrEmpty(Record.GetString("as_title"), "")
				If Utils.NE(theTitle) Then
					theTitle = $"${Record.GetInt("bullet_master")}.${Record.GetInt("bullet_child")}. ${Record.GetString("title")}"$
				End If
				
				NON_CONFORMITY = $"${NON_CONFORMITY}
									<tr>
										<td style="width:30%;">${theTitle}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("execute_notes"), "")}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("details"), "")}</td>
										<td style="width:10%;">${Utils.IfNullOrEmpty(Record.GetString("gravity_desc"), "")}</td>
										<td style="width:10%;">${DueDate}</td>
										<td style="width:10%;">Cliente</td>
									</tr>"$
			Next
			Dim dNON_CONFORMITY As String = $"${NCStart}${NCHeader}<tbody>${NON_CONFORMITY}</tbody>${NCEnd}"$
		
		End If
		Record.Close
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__NON_CONFORMITY", dNON_CONFORMITY)
		
		ProgressDialogHide
		ProgressDialogShow(ShareCode.reportsMsgGerarSumario)
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__REQUEST_OBS", thisPageData.request_obs)
		
		Dim SHOW_SIGNATURES As String = "display:none;"
		Dim SIGNATURE_CLIENT As String = ""
		Dim SIGNATURE_TECHNICAL As String = ""
		
		Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFromRD(CLA, 1)
		Dim SIGANTURE_ENTITY_TECHNICAL As String = SignatureRequestFromRD(CLA, 1)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		Private Recordw As Cursor
		Dim Rows As Int = 0
'		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${dbRequest}'
'				and inner_request_tagcode in ('TSKS_EJREGERAL', 'TSKS_EJRGALGERAL')"$    
		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${dbRequest}' limit 2"$   
				
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			thisPageData.PageTotal = thisPageData.PageTotal + 187
		
			Dim SHOW_SIGNATURES As String = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_SIGNATURES", SHOW_SIGNATURES)
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
		
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__REPORT_DATE_TIME", ThisReportDate) 'Utils.GetCurrDatetime)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME1", "")
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME2", "")
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME", thisPageData.Technical)
		'**********************************************************************
		' ASSINATURAS RELATORIO AGREGADOR
		'**********************************************************************
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_CLIENT", SIGNATURE_CLIENT)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_TECHNICAL", SIGNATURE_TECHNICAL)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_ADDITIONAL", $""$)
		
		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${dbRequest}'"$
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			For Rows = 0 To Recordw.RowCount-1
				Recordw.Position = Rows
				Dim SignCount As String = Utils.ZeroLeft(Rows,2)
				Dim SignBookmark As String = $":__SIGNATURE_ORDER${SignCount}"$
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(SignBookmark, Recordw.GetString("image"))
			Next
		End If
		Recordw.Close
		
		
		Dim Col12 As String = $"<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
		thisPageData.BuildPage = $"${thisPageData.BuildPage}${Col12}"$    
		thisPageData.PagesOut.Add(thisPageData.BuildPage)
		
		File.WriteList(Starter.SharedFolder, "SUMARY.TMP", thisPageData.PagesOut)
		thisPageData.PagesOut.Clear
		ProgressDialogHide
		
		ProgressDialogShow(ShareCode.reportsMsgGerarArquivo)
		
		'************************************************************************
		'************************************************************************
		'************************************************************************
		Dim ReportContinue As Boolean = True
		Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
		Wait For(WriteReportToHTMLFile($"${FileReport}.html"$, SecondFilesCount)) Complete (ReportHTMLSave As Boolean)
		If ReportHTMLSave Then
			
			Dim theFile As String = $"${FileReport}.html"$
			CurrentFile = $"${FileReport}.html"$
			Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
			Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
		
			Wait For(CallReportAPIFile(CLA.Tagcode, theFile)) Complete (ReportAPIFile As Boolean)

			ProgressDialogHide
			ProgressDialogShow(ShareCode.reportsMsgGeralRelatorioCarregaFicheiro)
		
			If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
				Wait For(CopyReportFileToShared(theFile)) Complete (ReportCopyFile As Boolean)
				Wait For(UploadReportFileToServer(theFile)) Complete (ReportUploadFile As Boolean)
			End If
			
			Dim sSQL As String = $"update dta_requests set file_report='${theFile}' where tagcode='${CLA.Tagcode}'"$
			Utils.SaveSQLToLog("GAGenerateReport",sSQL, CLA.Tagcode)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			
		Else
			ReportContinue = False
		End If
		
		
		If ReportContinue Then
			If (File.Size(Starter.SharedFolder ,$"${FileReport}.html"$) < 20000000) Then
				Dim ShowReport As Boolean = True
				Try
					Dim ThisStringReport As String = File.ReadString(Starter.SharedFolder ,$"${FileReport}.html"$)
				Catch
					Log(LastException)
					ShowReport = False
				End Try
				ReportProgress.Visible = False
				If (ShowReport) Then
					Try
						ReportView.LoadHtml(ThisStringReport)
					Catch
					
						MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
						Log(LastException)
					End Try
				End If
			End If
		Else
			MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
		End If

		ProgressDialogHide
'		Return True
	Else
		MsgboxAsync(ShareCode.reportsMsgFuncionalidadeNCFG, ShareCode.GeneralAlertTitle)
	End If
	ReportProgress.Visible = False
	
	ProgressDialogHide
'	Return True
End Sub

'===============================================================================================================
' SUBS DO RELATORIO GENERICO AGRUPADOR
'===============================================================================================================

Sub AGRUPADOR2GetReportPageHeaderSTD(CLA As RequestData, thisPage As PageA4, thisPageData As PageData, Record As Cursor) As PageData
	Dim Name As String = ""
	Dim Morada As String = ""
	Dim ObjectName As String = ""
	'Dim objContact As String = ""
	Dim Local As String = ""
	Dim codPostal As String = ""
	Dim localidade As String = ""
	Dim unidade As String = ""
	
	Name = Utils.IfNullOrEmpty(Record.GetString("name"), "_")
	ObjectName = Utils.IfNullOrEmpty(Record.GetString("objectname"), "_")
	Morada = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
	Local = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
	codPostal = Utils.IfNullOrEmpty(Record.GetString("postal_code"), "_")
	localidade = Utils.IfNullOrEmpty(Record.GetString("city"), "_")
	unidade = Utils.IfNullOrEmpty(Record.GetString("nameobject"), "_")
	Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
	
	Dim contracto As String = Utils.IfNullOrEmpty(Record.GetString("contracto"), "")
	If Utils.NNE(contracto) Then
		If Utils.NNE(Reference) Then
			Reference = $"${Reference} (${contracto})"$
		Else
			Reference = $"${contracto}"$
		End If
	End If
	
	Reference = Utils.IfNullOrEmpty(Reference, "Sem contrato/Prospect")
	
'	Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
'						WHERE request_tagcode='${CLA.Tagcode.Trim}' And repeatcounter=0"$

	If ShareCode.APP_DOMAIN.ToLowerCase = "engitagus" Then
		ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = 0
	End If
	
	If Utils.Int2Bool(ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST) Then
		Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
						WHERE request_tagcode='${CLA.Tagcode.Trim}' And repeatcounter=0"$
	Else
		Dim script As String = $"SELECT req_date as executedatetime from dta_requests WHERE tagcode='${CLA.Tagcode.Trim}'"$
	End If
	
	
	
	Dim Data As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC(script, "executedatetime"), _
						Record.GetString("run_date"))
						

	Data = Utils.IfNullOrEmpty(Data, Utils.GetCurrentDate)
	Data = Utils.GetDate(DateTime.DateParse(Data))
	
	Dim DataAgendada As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_date from dta_requests where tagcode='${CLA.Tagcode.Trim}'"$, "execute_date"), Data)
	Dim DataFimAgendamento As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC($"select execute_enddate from dta_requests where tagcode='${CLA.Tagcode.Trim}'"$, "execute_enddate"), Data)
	
	Dim Inicio As String = Record.GetString("run_start") 'req_run_start")
	Dim Fim As String = Record.GetString("run_end")
	Dim Duracao As String = Record.GetString("run_time")
'	Dim Data As String = Record.GetString("run_date")
	'Dim Data As String = Utils.GetCurrentDate
	Dim RequestTypeDesc As String = Utils.IfNullOrEmpty(Record.GetString("request_desc"), "_")
	Dim RequestNumber As String = Record.GetString("tagcode")
	Dim Technical As String = Utils.IfNullOrEmpty(Record.GetString("sessusername"), "_")
	thisPageData.Technical = Technical
	'Dim Pacote As String = "EJR - Espaços de Jogos e Recreio"
	Dim MoradaMais As String = $"${Local}, ${codPostal} ${localidade}"$
	
	If ShareCode.APP_DOMAIN.ToLowerCase = "engitagus" Then
		thisPage.PageFirst = thisPage.PageFirst.Replace(":__ETGIEAC207", Data)
	End If
	
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_NUMBER", RequestNumber)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REPORT_NAME", RequestTypeDesc)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_RESULT", "Avaliação")
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_POINTS", 0)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__REQUEST_TYPE", ObjectName)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_DATE", Data)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__SCHEDULE_DATE", DataAgendada)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__SCHEDULE_ENDDATE", DataFimAgendamento)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_NAME", Name)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_START", Inicio)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_LOCAL", MoradaMais) 'Morada)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_END", Fim)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__EXECUTION_TIME", Duracao)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__ENTITY_UNITY", ObjectName) 'unidade)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__TECHNICAL_NAME", Technical)
	thisPage.PageFirst = thisPage.PageFirst.Replace(":__CONTRACT", Reference)		
	Return thisPageData
End Sub

Sub AGRUPADOR2GenerateReportFirst(CLA As RequestData, thisPage As PageA4, thisPageData As PageData) As PageData
	ProgressDialogShow(ShareCode.reportsMsgGerarGeral)
	
	Private Record As Cursor
	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP}
						and z.request_tagcode='${CLA.Tagcode}' 
						and z1.repeated=0 
						ORDER BY z.position, z.repeatcounter"$

	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then

		thisPageData.PageTotal = thisPage.A4Margins + thisPage.PageHeaderHeight + thisPage.PageFirstHeight + thisPage.PageFooterHeight  '370 + 23
		
		For nRow = 0 To Record.RowCount-1
			Record.Position = nRow
			Dim dbRequest As String = Record.GetString("tagcode")
			Dim dbAction As String = Record.GetString("action_tagcode")
			Dim repeatcounter As Int = Record.GetInt("repeatcounter")
			Dim request_type As String = Record.GetString("request_type")
			Dim Task_name As String = Record.getstring("task_name")
			Dim RunThisTask As Boolean = False
			
			If (nRow=0) Then
				thisPageData = AGRUPADOR2GetReportPageHeaderSTD(CLA, thisPage, thisPageData, Record)
				thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageHeader}${thisPage.PageFirst}"$
				RunThisTask = True
			End If

			' ****************************************************************
			' PEGA NO PRIMEIRO FICHEIRO (CABEÇALHO)
			' ****************************************************************
			If (RunThisTask) Then

				Log($"*******************************************"$)
				Log($"****************  START   ***************"$)
				Log($"${thisPageData.PageNumber} - ${thisPageData.PageTotal}"$)
				Log($"*******************************************"$)
								
				' ****************************************************************
				' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
				' ****************************************************************
				Dim DATA_NAME As String = ""
				Private objRecord As Cursor
				Dim Rows As Int = 0
				Dim dataSQL As String = $"Select x.execute_value, x.val_desc, x.title, x.position, x.level, x.datatype,
									x.repeatcounter, x.unique_key, x.execute_notes, x.item_tagcode, x.bullet_master, x.bullet_child, x.type_conformity 
									from (Select a.execute_value, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									c.unique_key, a.execute_notes, a.item_tagcode, c.bullet_master, c.bullet_child, b.type_conformity
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${dbRequest.trim}' 
										and a.task_tagcode='${dbAction.trim}'
										and a.repeatcounter=${repeatcounter} 
										And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select "" As execute_value, "" As val_desc, a.title, a.position, a.level, a.data_type As datatype, 
									0 as repeatcounter, '' as unique_key, '' as execute_notes, a.item_tagcode, a.bullet_master, a.bullet_child, '' as type_conformity 
									from dta_tasks_items As a 
									where a.task_tagcode='${dbAction.trim}' and a.level=0) as x
									order by x.position, x.repeatcounter "$

				Log("********************************************************")
				Log("********************************************************")
				Log("********************************************************")
				Log(dataSQL)
				objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
				If objRecord.RowCount > 0 Then
					thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageContent}"$
					Log(thisPageData.BuildPage)
					Dim LineCounter As Int = 1
					Dim OldChapter As String = ""
					Dim OldLabelBox As Double = 0
					For Rows =0 To objRecord.RowCount-1
						objRecord.Position = Rows
						Dim CHAPTER_NAME As String = ""
						Dim QUEST_NAME As String = ""
						
						Dim Level As Int = objRecord.GetInt("level")
						Dim repeatcounter As Int = objRecord.GetInt("repeatcounter")
						
						Dim bullet_master As Int = objRecord.GetInt("bullet_master")
						Dim bullet_child As Int = objRecord.GetInt("bullet_child")
						'Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
						
						thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__OBJECT_NAME", $"${Task_name}"$)
						
						If (Level = 0) Then
							thisPageData.PointCounter = thisPageData.PointCounter + 1
							LineCounter = 1
							
							Dim ColRows As Int = 1
							If (bullet_master > 0) Then
								Dim ttitle As String = $"${bullet_master}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							Else
								Dim ttitle As String = $"${thisPageData.PointCounter}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
							End If
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							Dim LabelBox As Double = ((thisPage.PageLabelSpaceHeight + thisPage.PageLabelHeight) * ColRows) + 2 + thisPage.PageLabelSpaceHeight

							CHAPTER_NAME = $"<table style="width:100%;" class="table">
											<thead>
												<tr>
													<th class="barLineTypeBorderRight" style="width:55%;text-align: left;padding: 4px 6px;">${ttitle}</th>
													<th class="barLineTypeBorderRight" style="width:15%;text-align: left;padding: 4px 6px;">Resposta</th>
													<th style="width:30%;text-align: left;padding: 4px 6px;">Observações</th>
												</tr>
											</thead>
											<tbody>"$
							OldChapter = $"${CHAPTER_NAME}"$
							OldLabelBox = LabelBox
							If (Rows >= 1) Then
								CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
							End If
							
						Else
							Dim bBullet As String = ""
							Dim uk As String = objRecord.GetString("unique_key")
							Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
							Dim type_conformity As String = Utils.IfNullOrEmpty(objRecord.GetString("type_conformity"), "")
							Dim scolor As String = "#ffffff"
							
							'************************************************************************************
'							' ALTERACAO PC - VERIFICACAO DE NAO CONFORMITADES DE ACORDO COM O type_conformity
'							'************************************************************************************

							If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
								Dim scolor As String = "#b3ff66"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
								Dim scolor As String =  "#ff5c33"
							Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAUDITADO") Then
								Dim scolor As String =  "#e6e6e6"
							Else If (sVal.Replace("ã", "a").Replace("á", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAPLICAVEL") Then
								Dim scolor As String =  "#3399ff"
							End If

							
							If (type_conformity = "TCTT_001") Then
								scolor = "#b3ff66"
							else if	(type_conformity = "TCTT_002") Then
								scolor = "#ff5c33"
							else if	(type_conformity = "TCTT_003") Then
								scolor = "#3399ff"
							End If
														
							Dim ColRows As Int = 1
							Dim ttitle As String = objRecord.GetString("title")
							If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
							If (ColRows = 0) Then ColRows = 1
							If ((sVal.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((sVal.Trim.Length) / 12)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							Dim LabelBox As Double = ((thisPage.PageLabelSpaceHeight + thisPage.PageLabelHeight) * ColRows) + 2 + thisPage.PageLabelSpaceHeight
								
							Dim vNotes As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
							If ((vNotes.Trim.Length) > 12) Then
								Dim ColRows1 As Int = Round((vNotes.Trim.Length) / 20)
								If (ColRows1 > ColRows) Then ColRows = ColRows1
							End If
							LineCounter = LineCounter + 1
							
							If ((bullet_master > 0) And (bullet_child > 0)) Then
								bBullet = $"${bullet_master}.${bullet_child}."$
								Dim ttitle2 As String = $"${bBullet} ${ttitle.Trim}"$ 'objRecord.GetString("title")
							Else
								bBullet = $"${thisPageData.PointCounter}.${LineCounter}."$
								Dim ttitle2 As String = $"${bBullet} ${ttitle.Trim}"$ 'objRecord.GetString("title")
							End If
							
							Dim TEMPQUEST_NAME As String = $"<tr>
											<td class="barLineTypeBorderRight" style="padding: 4px 6px;">
											${ttitle2.Trim}</td>
											<td class="barLineTypeBorderRight" style="padding: 4px 6px;background:${scolor};">${sVal}</td>
											<td style="padding: 4px 6px;">${vNotes}</td>
										</tr>"$
							QUEST_NAME = TEMPQUEST_NAME

							Dim IMAGES As String = ""
							Private Record22 As Cursor
							' ************************************************************************
							' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
							' ************************************************************************
							Dim sSQL2 As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename from dta_requests_values_images as a
												left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
												b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
												where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
												and a.repeatcounter=${repeatcounter}
												And a.on_report=1"$
							Record22 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
							
							If Record22.RowCount > 0 Then

								Dim thisRow As Int = 1
								Dim ptotalimg As Double = thisPage.PageImgRowHeight
								For n=0 To Record22.RowCount-1
									Record22.Position = n
									thisPageData.ImageCounter = thisPageData.ImageCounter + 1
									Dim imagename As String = Record22.GetString("imagename")
									Dim image As String = Record22.GetString("imageb64")
									
									If Not(File.Exists(Starter.InternalFolder,imagename)) Then
										If Utils.NNE(image) Then
											Utils.Bitmap2File( Utils.B64ToBitmap(image),Starter.InternalFolder,imagename)
										End If
									End If
				
									If File.Exists(Starter.InternalFolder,imagename) Then
										IMAGES = $"${IMAGES}
											<li>
												<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" style="width:100%;" /><br>
												Foto: ${bBullet} 
												
											</li>"$
									End If

								Next
								thisPageData.PageTotal = thisPageData.PageTotal + ptotalimg
								Log("*************************************")
								Log("*************************************")
								Log(" PAGE TOTAL : " & thisPageData.PageTotal)
								Log(" IMAGE TOTAL : " & ptotalimg)
								Log("*************************************")
								Log("*************************************")
							End If
							Record22.Close
							
							
							If Utils.NNE(IMAGES) Then
								thisPageData.PageTotal = thisPageData.PageTotal + thisPage.PageLabelSpaceHeight
								IMAGES = $"<tr>
											<td colspan="3" style="">
												<div class="col-12" style="">
													<ul class="photos" style="padding-left:0;">
														${IMAGES}
													</ul>
												</div>
											</td>
										</tr>"$
							End If
							QUEST_NAME = $"${QUEST_NAME}${IMAGES}"$

						End If
						DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
						
					Next
				End If
				objRecord.Close
			End If
		Next
		DATA_NAME = $"${DATA_NAME}</tbody> </table>"$
		
	End If
	Record.Close

	DATA_NAME = $"${DATA_NAME}<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
	thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_NAME", DATA_NAME)

	thisPageData.PagesOut.Add(thisPageData.BuildPage)
	File.WriteList(Starter.SharedFolder, "FIRSTREP.TMP", thisPageData.PagesOut)
	thisPageData.PagesOut.Clear
	ProgressDialogHide
	'Sleep(100)
	Return thisPageData
End Sub

Sub AGRUPADOR2GenerateReportSecond(CLA As RequestData, thisPage As PageA4, thisPageData As PageData) As PageData
	ProgressDialogShow(ShareCode.reportsMsgGerarEquipamentos)
'	Dim DefLockInfo As String = "Geração de Equipamentos"
	Private Record As Cursor
	Dim EQUIPMENT As String = ""
	Dim EQUIPMENTNUM As String = ""
	
'	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP}
'						and z.request_tagcode='${CLA.Tagcode}'
'						and z1.repeated=1 
'						ORDER BY z.position, z.repeatcounter"$
	
	Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP}
						and z.request_tagcode='${CLA.Tagcode}'
						and z1.repeated=0 
						AND z1.position > 1
						ORDER BY z.position, z.repeatcounter"$
	
	
	If ShareCode.APP_DOMAIN.ToLowerCase = "showbrilha" Then
		Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP}
						and z.request_tagcode='${CLA.Tagcode}'
						and z1.repeated=1 
						ORDER BY z.position, z.repeatcounter"$
	End If
	
						
	thisPageData.BuildPage = ""
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	Log(SQL)
	If Record.RowCount > 0 Then
		Dim FilesCount As Int = 0
		Dim PointCounter As Int = 1
		For nRow = 0 To Record.RowCount-1
			Record.Position = nRow
			
			FilesCount = FilesCount + 1
			
			Dim dbRequest As String = Record.GetString("tagcode")
			Dim dbAction As String = Record.GetString("action_tagcode")
			Dim repeatcounter As Int = Record.GetInt("repeatcounter")
			thisPageData.BuildPage = $"${thisPage.PageNext}${thisPage.PageContent}"$
					
			' ************************************************************************
			' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
			' ************************************************************************
			Dim DATA_NAME As String = ""
			Private objRecord As Cursor
			Dim Rows As Int = 0
			Dim dataSQL As String = $"Select x.execute_value, x.val_desc, x.title, x.position, x.level, x.datatype,
									x.repeatcounter, x.unique_key, x.execute_notes, x.item_tagcode, x.bullet_master, x.bullet_child, x.task_title, x.type_conformity 
									from (Select a.execute_value, 
									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									c.unique_key, a.execute_notes, a.item_tagcode, c.bullet_master, c.bullet_child, d.title as task_title, b.type_conformity 
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									inner join dta_tasks As d on (d.tagcode=a.task_tagcode)
									where a.request_tagcode='${dbRequest.trim}' 
										and a.task_tagcode='${dbAction.trim}'
										and a.repeatcounter=${repeatcounter} 
										And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))
									UNION
									Select "" As execute_value, "" As val_desc, a.title, a.position, a.level, a.data_type As datatype, 
									0 as repeatcounter, '' as unique_key, '' as execute_notes, a.item_tagcode, a.bullet_master, a.bullet_child, b.title as task_title, '' as type_conformity  
									from dta_tasks_items As a 
									inner join dta_tasks As b on (b.tagcode=a.task_tagcode)
									where a.task_tagcode='${dbAction.trim}' and a.level=0) as x
									order by x.position, x.repeatcounter "$

			'Log(dataSQL)
			objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
			If objRecord.RowCount > 0 Then
				Dim PointCounter As Int = 1
				thisPageData.PageTotal = 100 + 80 + 52 + 52 + 23
				'PageTotal = PageTotal + 120 'Margin
				Dim LineCounter As Int = 1
				Dim OldChapter As String = ""
					
				For Rows =0 To objRecord.RowCount-1
					objRecord.Position = Rows
					Dim CHAPTER_NAME As String = ""
					Dim QUEST_NAME As String = ""
					Dim task_title As String = objRecord.GetString("task_title")
					Dim Level As Int = objRecord.GetInt("level")
					'Log($"${objRecord.GetString("title")} :: ${objRecord.GetString("val_desc")}"$)
					Dim itemTask As String = Utils.IfNullOrEmpty(objRecord.GetString("item_tagcode"), "")
					  
'					If (Rows > 1) Then
					If (Rows = 0) Then
						Dim OBJECT_NAME_IMAGE As String = ""
						
						'EQUIPMENT = $"${PointCounter}. ${Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")}"$
						EQUIPMENT = $"${Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")}"$
'							EQUIPMENTNUM = $"EQUIPAMENTO"$   '${PointCounter}."$
						EQUIPMENTNUM = task_title
						thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__OBJECT_NAME_IMAGE", OBJECT_NAME_IMAGE)
					End If
						
					Dim bBullet As String = ""
						
					If (Level = 0) Then
						PointCounter = PointCounter + 1
						LineCounter = 1
								
						Dim ColRows As Int = 1
						Dim ttitle As String = $"${PointCounter}. ${objRecord.GetString("title")}"$ 'objRecord.GetString("title")
						If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
						If (ColRows = 0) Then ColRows = 1
							
						CHAPTER_NAME = $"<table style="width:100%;" class="table">
												<thead>
													<tr>
														<th class="barLineTypeBorderRight" style="width:55%;text-align: left;padding: 4px 6px;">
														${ttitle}</th>
														<th class="barLineTypeBorderRight" style="width:15%;text-align: left;padding: 4px 6px;">Resposta</th>
														<th style="width:30%;text-align: left;padding: 4px 6px;">Observações</th>
													</tr>
												</thead>
												<tbody>"$
						OldChapter = $"${CHAPTER_NAME}"$
						If (Rows >= 1) Then
							CHAPTER_NAME = $"</tbody> </table> ${CHAPTER_NAME}"$
						End If
							
						thisPageData.PageTotal = thisPageData.PageTotal + (thisPage.PageTextHeight * ColRows) + thisPage.PageTextMargins
								
					Else
								
						Dim sVal As String = Utils.IfNullOrEmpty(objRecord.GetString("val_desc"), "")
						Dim scolor As String = "#ffffff"
						Dim type_conformity As String = Utils.IfNullOrEmpty(objRecord.GetString("type_conformity"), "")
						'************************************************************************************
'							' ALTERACAO PC - VERIFICACAO DE NAO CONFORMITADES DE ACORDO COM O type_conformity
'							'************************************************************************************
			
						If (sVal.Replace(" ", "").Trim.ToUpperCase = "CONFORME") Then
							scolor = "#b3ff66"
						Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOCONFORME") Then
							scolor = "#ff5c33"
						Else If (sVal.Replace("ã", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAUDITADO") Then
							Dim scolor As String =  "#e6e6e6"
						Else If (sVal.Replace("ã", "a").Replace("á", "a").Replace(" ", "").Trim.ToUpperCase = "NAOAPLICAVEL") Then
							Dim scolor As String =  "#3399ff"
						End If

						If (type_conformity = "TCTT_001") Then
							scolor = "#b3ff66"
						else if	(type_conformity = "TCTT_002") Then
							scolor = "#ff5c33"
						else if	(type_conformity = "TCTT_003") Then
							scolor = "#3399ff"
						End If
								
						Dim ColRows As Int = 1
						Dim ttitle As String = objRecord.GetString("title")
						If ((ttitle.Trim.Length+4) > 50) Then ColRows = Round((ttitle.Trim.Length+4) / 50)
						If (ColRows = 0) Then ColRows = 1
						If ((sVal.Trim.Length) > 12) Then
							Dim ColRows1 As Int = Round((sVal.Trim.Length) / 12)
							If (ColRows1 > ColRows) Then ColRows = ColRows1
						End If
					
							
						Dim vNotes As String = Utils.IfNullOrEmpty(objRecord.GetString("execute_notes"), "")
						If ((vNotes.Trim.Length) > 12) Then
							Dim ColRows1 As Int = Round((vNotes.Trim.Length) / 20)
							If (ColRows1 > ColRows) Then ColRows = ColRows1
						End If
						thisPageData.PageTotal = thisPageData.PageTotal + ((thisPage.PageTextHeight * ColRows) + thisPage.PageTextMargins)
							
						bBullet = $"${PointCounter}.${LineCounter}."$
						LineCounter = LineCounter + 1
						QUEST_NAME = $"<tr>
											<td class="barLineTypeBorderRight" style="padding: 4px 6px;">
											${bBullet} ${ttitle.Trim}</td>
											<td class="barLineTypeBorderRight" style="padding: 4px 6px;background:${scolor};">${sVal}</td>
											<td class="" style="padding: 4px 6px;">${vNotes}</td>
										</tr>"$

						Dim uk As String = objRecord.GetString("unique_key")
						Dim IMAGES As String = ""
						Private Record22 As Cursor
						' ************************************************************************
						' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
						' ************************************************************************
						Dim sSQL2 As String = $"select ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename
													from dta_requests_values_images as a
													left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and 
													b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
													where a.request_tagcode='${dbRequest}' and a.inner_request_tagcode='${dbAction}' and a.unique_key='${uk}' 
													and a.repeatcounter=${repeatcounter}
													And a.on_report=1"$
						Record22 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
						If Record22.RowCount > 0 Then
'								Dim thisRow As Int = 1
							Dim ptotalimg As Double = thisPage.PageImgRowHeight
							For n=0 To Record22.RowCount-1
								Record22.Position = n
								thisPageData.ImageCounter = thisPageData.ImageCounter + 1
'									Dim image As String = Record22.GetString("imageb64")
								Dim imagename As String = Record22.GetString("imagename")
								Dim image As String = Record22.GetString("imageb64")
									
								If Not(File.Exists(Starter.InternalFolder,imagename)) Then
									If Utils.NNE(image) Then
										Utils.Bitmap2File( Utils.B64ToBitmap(image),Starter.InternalFolder,imagename)
									End If
								End If
				
								If File.Exists(Starter.InternalFolder,imagename) Then
									IMAGES = $"${IMAGES}
											<li>
												<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" style="width:100%;" /><br>
												Foto: ${bBullet} ${EQUIPMENT}
											</li>"$
								End If
									
							Next
							thisPageData.PageTotal = thisPageData.PageTotal + ptotalimg
						End If
						Record22.Close
								
						If Utils.NNE(IMAGES) Then
							IMAGES = $"<tr>
												<td colspan="3" style="padding: 4px 6px;">
													<div class="col-12" style="margin-bottom:10px;">
														<ul class="photos" style="padding-left:0;">
															${IMAGES}
														</ul>
													</div>
												</td>
											</tr>"$
						End If
						QUEST_NAME = $"${QUEST_NAME}${IMAGES}"$
					End If
					DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}${QUEST_NAME}"$
						
				Next
			End If
			objRecord.Close
'			End If
			DATA_NAME = $"${DATA_NAME}</tbody> </table>"$
			DATA_NAME = $"${DATA_NAME}<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
			If (Utils.NNE(thisPageData.BuildPage)) Then
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__OBJECT_NAME", $"${EQUIPMENTNUM} ${EQUIPMENT}"$)
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_NAME", DATA_NAME)
				thisPageData.PagesOut.Add(thisPageData.BuildPage)
				File.WriteList(Starter.SharedFolder, $"SECONDREP${nRow}.TMP"$, thisPageData.PagesOut)
				thisPageData.PagesOut.Clear
			End If
							
		Next
		
		thisPageData.PointCounter = FilesCount
	End If
	Record.Close
	
	ProgressDialogHide
	Return thisPageData
End Sub

Sub AGRUPADOR2GenerateReport(CLA As RequestData) 'As ResumableSub
	
	If File.Exists(Starter.InternalFolder, "page_id_first.html") Then
		File.Copy(Starter.InternalFolder, "page_id_first.html",Starter.SharedFolder, "page_id_first.html")
	End If
	
	
	Dim AgrupadorList As List
	AgrupadorList.Initialize
	AgrupadorList.AddAll(Array As String("page_header", _
	"page_footer", _
	"page_content", _
	"page_signature", _
	"page_content_observations", _
	"page_content_images", _
	"template_group", _
	"page_id_first", _
	"page_identification_next", _
	"page_identification_last"))
	
	Dim AllfilesPresent As Boolean = True
	Dim missingFiles As String=""
	For x=0 To AgrupadorList.Size -1
		Dim File2check As String = AgrupadorList.Get(x)
		
			If File.Exists(Starter.InternalFolder, $"${File2check}.html"$) Then
				File.Copy(Starter.InternalFolder, $"${File2check}.html"$,Starter.SharedFolder, $"${File2check}.html"$)
				Log(File2check)
			Else
			missingFiles=missingFiles & $"${File2check}; "$
				Log("Missing:" & File2check)
				AllfilesPresent = False
			End If
	Next
	
	If Not(AllfilesPresent) Then
		MsgboxAsync($"${ShareCode.reportsErroLerFicheiro}${CRLF}${CRLF}${missingFiles}"$ ,ShareCode.GeneralAlertTitle)
		ProgressDialogHide
		Return
	End If
	
	
	
	CurrentCLA = CLA
	'Sleep(100)
	ProgressDialogShow(ShareCode.reportsMsgProcessar)
	Sleep(50)
	
	ThisReportDate = Utils.GetCurrentDate

	Dim APPL_INSTANCE As String = Utils.SelectFieldFromLocalSQLWRKConfigTable("instance")
	
	If(APPL_INSTANCE <> AGRUPADOR_INSTANCE) Then ' UMA VEZ QUE A VARIAVEL AGRUPADOR_INSTANCE ESTA A "" ENTAO DA PARA TODOS OS QUE NAO FOREM RESOPRE OU GRANDATIVE
		ProgressDialogShow(ShareCode.reportsMsgGerarGeral)
		Sleep(50)

		Dim pOut As List : pOut.Initialize
		
		Dim PageNonConformities As String = $"<div class="col-12" style="margin-bottom:10px;:__SHOW_NON_CONFORMITY">
												<div class="col-12" style="">
													<div class="topBar topBarExt" style="border-top:2px solid #555555;">
														N&atilde;o conformidades / Riscos
													</div>
												</div>
												<div class="col-12" style="font-size:10px;">
														:__NON_CONFORMITY
												</div>
											</div>"$
											
		Dim thisPage As PageA4 = Types.MakePageA4(1118.740, 113.386, (1118.740), 50, 150, 285, 9.449, 5.670, _
								22.667, 4, 15, (77.480 + 11.339 + 5.670), 240, 24, 22.67, _
								File.ReadString(Starter.SharedFolder, "page_header.html"), _
								File.ReadString(Starter.SharedFolder, "page_footer.html"), _
								File.ReadString(Starter.SharedFolder, "page_content.html"), _
								File.ReadString(Starter.SharedFolder, "page_signature.html"), _
								File.ReadString(Starter.SharedFolder, "page_content_observations.html"), _
								File.ReadString(Starter.SharedFolder, "page_content_images.html"), _
								PageNonConformities, _
								File.ReadString(Starter.SharedFolder, "template_group.html"), _
								File.ReadString(Starter.SharedFolder, "page_id_first.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_next.html"), _
								File.ReadString(Starter.SharedFolder, "page_identification_last.html"))
		
		Dim thisPageData As PageData = Types.MakePageData(pOut, 1, 0, "", 0, 0, 0, 0, "none", "", "", "")

		
		'**********************************************************************************************************************************************
		'	TRATAMENTO DO PRIMEIRO FICHEIRO DE DADOS
		'**********************************************************************************************************************************************
		thisPageData.BuildPage = ""
		thisPageData.PointCounter = 1
		thisPageData = AGRUPADOR2GenerateReportFirst(CLA, thisPage, thisPageData)

		'	'**********************************************************************************************************************************************
		'	'	TRATAMENTO DO TERCEIRO FICHEIRO DE DADOS E SEGUINTES
		'	'**********************************************************************************************************************************************
		thisPageData.BuildPage = ""
		thisPageData.PointCounter = 1
		thisPageData = AGRUPADOR2GenerateReportSecond(CLA, thisPage, thisPageData)
		
		
		thisPageData.BuildPage = ""
		thisPageData.BuildPage = $"${thisPage.PageLast}${thisPage.PageImages}"$
		
		Dim SecondFilesCount As Int = thisPageData.PointCounter
		

		Dim SHOW_IMAGES As String = "display:none;"
		Dim IMAGES As String = ""
		Dim ImageCounter As Int = 0
		Private Record2 As Cursor
		'imageb64|
		' ************************************************************************
		' PEGA NA LISTA DE VALORES DE IMAGENS TIRADAS
		' ************************************************************************
		Dim dbRequest As String = CLA.Tagcode
		Dim sSQL2 As String = $"select distinct ifnull(b.title, ifnull(a.imagename,'')) as title, a.imageb64, a.imagename,
					b.bullet_master, b.bullet_child, ifnull(c.inner_title, '') as inner_title
					from dta_requests_values_images as a
					left join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)
					left join dta_requests_relations as c on (c.request_tagcode=a.request_tagcode 
							and c.relation_tagcode=a.inner_request_tagcode 
							and c.repeatcounter=a.repeatcounter)
					where a.request_tagcode='${dbRequest}' 
					And a.on_report=1 
					order by a.id"$
					
		Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL2)
		If Record2.RowCount > 0 Then
			'thisPageData.BuildPage = $"${thisPageData.BuildPage}${thisPage.PageImages}"$
			SHOW_IMAGES  = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_IMAGES", SHOW_IMAGES)
			For n=0 To Record2.RowCount-1
				Record2.Position = n
				Dim image As String = Record2.GetString("imageb64")
				Dim imagename As String = Record2.GetString("imagename")
				Dim bBullet As String = $"${Record2.GetInt("bullet_master")}.${Record2.GetInt("bullet_child")}."$
				Dim imgtitle As String = Record2.GetString("inner_title")
				
				If Not(File.Exists(Starter.InternalFolder,imagename)) Then
					If Utils.NNE(image) Then
						Utils.Bitmap2File( Utils.B64ToBitmap(image),Starter.InternalFolder,imagename)
					End If
				End If
				
				If File.Exists(Starter.InternalFolder,imagename) Then
					ImageCounter = ImageCounter + 1
					IMAGES = $"${IMAGES}<div class="col-6" style="text-align:center;">
					<img src="${xui.FileUri(Starter.InternalFolder, imagename)}" width="320" height="240"/><br>
							Foto: ${bBullet} ${imgtitle}
							</div>"$
				End If
				
			Next
			IMAGES = $"<div class="col-12" style=""><div class="row">${IMAGES}</div></div>"$
		End If
		Record2.Close
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__IMAGES", IMAGES)
		
		thisPageData.PagesOut.Add(thisPageData.BuildPage)
		File.WriteList(Starter.SharedFolder, "IMAGES.TMP", thisPageData.PagesOut)
		thisPageData.PagesOut.Clear
		
		thisPageData.BuildPage = ""
		thisPageData.BuildPage = $"${thisPage.PageNonConformities}${thisPage.PageObservations}${thisPage.PageSignature}"$
		
		ProgressDialogHide
		ProgressDialogShow(ShareCode.reportsMsgGerarNaoConformidades)
		
		'
		' ************************************************************************
		' PEGA NA LISTA DE NÃO CONFORMIDADES
		' ************************************************************************
		
		Dim SHOW_NON_CONFORMITY As String = "display:none;"
		Dim NON_CONFORMITY As String = ""
		Private Record As Cursor
		Dim SQL As String = $"select DISTINCT x.as_title, x.details, x.priority_desc, x.gravity_desc, x.due_date,
				x.unique_key, x.conform_type, 
				x.status, x.title, x.execute_notes, x.execute_action, x.repeatcounter,
				x.task_tagcode, x.item_tagcode, x.tagcode, x.request_tagcode, x.bullet_master, x.bullet_child, 
				x.nametitle, x.executeaction from (select DISTINCT
				ifnull(e.title, '') AS as_title, 
				ifnull(e.details,'') AS details, 
				ifnull(f.tagdesc, '') AS priority_desc, 
				ifnull(g.tagdesc, '') AS gravity_desc, 
				ifnull(e.due_date,'') AS due_date, 
				a.unique_key, d.id as conform_type, 
				a.execute_status as status, c.title, 
				a.execute_notes, 
				a.execute_action, a.repeatcounter,
				a.task_tagcode, a.item_tagcode, a.tagcode, a.request_tagcode, c.bullet_master, c.bullet_child, 
				(SELECT ifnull(inner_title, ( 
					SELECT title FROM dta_tasks WHERE tagcode=a.task_tagcode)) AS inner_title FROM dta_requests_relations WHERE request_tagcode=a.request_tagcode 
							AND relation_tagcode=a.inner_request_tagcode 
							AND repeatcounter=a.repeatcounter) AS nametitle,
				(SELECT distinct execute_action FROM dta_requests_values WHERE request_tagcode=a.request_tagcode 
							AND inner_request_tagcode=a.inner_request_tagcode 
							AND task_tagcode=a.task_tagcode
							AND item_tagcode=a.item_tagcode
							AND unique_key=a.unique_key LIMIT 1) AS executeaction 
				from  dta_requests_values as a 
				inner join dta_tasks_items_answers as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode) 
				inner join dta_tasks_items as c on (c.task_tagcode=b.task_tagcode and c.item_tagcode=b.item_tagcode and c.unique_key=b.unique_key) 
				inner join type_conformitytypes as d on (d.tagcode=b.type_conformity) 
				left JOIN dta_actions AS e ON (e.tagcode=a.execute_action)
				left JOIN type_prioritytypes AS f ON (f.tagcode=e.priority_tagcode)
				left JOIN type_gravitytypes AS g ON (g.tagcode=e.gravity_tagcode)
				where 1=1 and a.execute_status>=1   
				and  (a.execute_notes is not null and a.execute_notes<>'')
				and a.request_tagcode='${dbRequest}' and d.id=2  AND a.execute_notes IS NOT null) as x
				order BY x.task_tagcode, x.repeatcounter, x.bullet_master, x.bullet_child"$
		'a.repeatcounter,
		Log(SQL)
				
		Dim dNON_CONFORMITY As String = $""$
		
		Dim GroupStart As String = ""
		
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			SHOW_NON_CONFORMITY = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_NON_CONFORMITY", SHOW_NON_CONFORMITY)
			
			Dim NCStart As String = $"<div class="row"><div class="col-12" style="font-size:10px;">
									<table class="table table-bordered" style="width:100%;">"$
			'style="background:#b7e1dc;"
			Dim NCHeader As String =  $"<thead class="barType2">
										<tr>
											<th style="width:30%;">Pergunta/Resposta</th>
											<th style="width:20%;">Observação</th>
											<th style="width:20%;">Recomendação/Ação</th>
											<th style="width:10%;">Gravidade</th>
											<th style="width:10%;">Data Limite</th>
											<th style="width:10%;">Alocado a</th>
										</tr>
										</thead>"$ 

								
			Dim NCEnd As String = $"</table></div></div></div>"$
			NON_CONFORMITY =""
				
			
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				
				
				Dim ThisGroupStart As String = Utils.IfNullOrEmpty(Record.GetString("nametitle"), "")
								
				If Not(GroupStart = ThisGroupStart) Then
					NON_CONFORMITY = $"${NON_CONFORMITY}
										<tr colspan="6">
											<td><strong>${ThisGroupStart.ToUpperCase}</strong></td>
										</tr>"$ 
					GroupStart = ThisGroupStart
				End If
				
				Dim DueDate As String = Utils.IfNullOrEmpty(Record.GetString("due_date"), "")
				If Utils.NNE(DueDate) Then
					Try
						Dim ddate As Long = DateTime.DateParse(DueDate)
						DateTime.DateFormat = "yyyy-MM-dd"
						DueDate = DateTime.Date(ddate)
					Catch
						Log(LastException)
					End Try
				End If
				DueDate = DueDate.Replace("00:00:00", "").Trim
				Dim theTitle As String = Utils.IfNullOrEmpty(Record.GetString("as_title"), "")
				If Utils.NE(theTitle) Then
					theTitle = $"${Record.GetInt("bullet_master")}.${Record.GetInt("bullet_child")}. ${Record.GetString("title")}"$
				End If
				

				
				NON_CONFORMITY = $"${NON_CONFORMITY}
									<tr>
										<td style="width:30%;">${theTitle}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("execute_notes"), "")}</td>
										<td style="width:20%;">${Utils.IfNullOrEmpty(Record.GetString("details"), "")}</td>
										<td style="width:10%;">${Utils.IfNullOrEmpty(Record.GetString("gravity_desc"), "")}</td>
										<td style="width:10%;">${DueDate}</td>
										<td style="width:10%;">Cliente</td>
									</tr>"$
			Next
			Dim dNON_CONFORMITY As String = $"${NCStart}${NCHeader}<tbody>${NON_CONFORMITY}</tbody>${NCEnd}"$
		
		End If
		Record.Close
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__NON_CONFORMITY", dNON_CONFORMITY)
		
		ProgressDialogHide
		ProgressDialogShow(ShareCode.reportsMsgGerarSumario)
			
		Log("REQ:" & dbRequest)
		
		
		'**********************************************************************
		' OBSERVACOES DAS CHECKLISTS DA INTERVENCAO AGRUPADORA
		'**********************************************************************
		
		Dim SHOW_OBS As String = ""
		Dim SHOW_OBSLINHA As String = ""
		
		Dim sSQL As String = $"SELECT b.title, a.request_obs FROM dta_requests_relations AS a
								LEFT JOIN dta_tasks AS b ON(a.relation_tagcode = b.tagcode)
								WHERE request_tagcode = '${dbRequest}'"$
		
		Private RecordObs As Cursor
		RecordObs = Starter.LocalSQLEVC.ExecQuery(sSQL)
				
		If RecordObs.RowCount > 0 Then
			For r=0 To RecordObs.RowCount -1
				RecordObs.Position = r
				Dim chkListTitle As String = Utils.IfNullOrEmpty(RecordObs.GetString("title"),"")
				Dim chkListObs As String = Utils.IfNullOrEmpty(RecordObs.GetString("request_obs"),"")
				SHOW_OBSLINHA=$"<strong>${chkListTitle}</strong><br>${chkListObs}<br>"$
				SHOW_OBS = SHOW_OBS & SHOW_OBSLINHA
			Next

		End If
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__REQUEST_OBS", SHOW_OBS)


		'**********************************************************************
		' ASSINATURAS RELATORIO AGREGADOR
		'**********************************************************************
		
		Dim SHOW_SIGNATURES As String = "display:none;"
		Dim SIGNATURE_CLIENT As String = ""
		Dim SIGNATURE_TECHNICAL As String = ""
		
		Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFromRD(CLA, 1)
		Dim SIGANTURE_ENTITY_TECHNICAL As String = SignatureRequestFromRD(CLA, 1)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		Private Recordw As Cursor
		Dim Rows As Int = 0
		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${dbRequest}' limit 2"$   
				
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			thisPageData.PageTotal = thisPageData.PageTotal + 187
		
			Dim SHOW_SIGNATURES As String = "display:block;"
			thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SHOW_SIGNATURES", SHOW_SIGNATURES)
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
		ThisReportDate = Utils.GetCurrDatetime
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__REPORT_DATE_TIME", ThisReportDate)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME1", "")
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME2", "")
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__TECHNICAL_NAME", thisPageData.Technical)

		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_CLIENT", SIGNATURE_CLIENT)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__SIGNATURE_TECHNICAL", SIGNATURE_TECHNICAL)
		thisPageData.BuildPage = thisPageData.BuildPage.Replace(":__DATA_ADDITIONAL", $""$)
		
		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${dbRequest}'"$
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Recordw.RowCount > 0 Then
			For Rows = 0 To Recordw.RowCount-1
				Recordw.Position = Rows
				Dim SignCount As String = Utils.ZeroLeft(Rows,2)
				Dim SignBookmark As String = $":__SIGNATURE_ORDER${SignCount}"$
				thisPageData.BuildPage = thisPageData.BuildPage.Replace(SignBookmark, Recordw.GetString("image"))
			Next
		End If
		Recordw.Close
		
		
		
		Dim Col12 As String = $"<div class="col-12" style="min-height:100px;">&nbsp;</div>"$
		thisPageData.BuildPage = $"${thisPageData.BuildPage}${Col12}"$    
		thisPageData.PagesOut.Add(thisPageData.BuildPage)
		
		File.WriteList(Starter.SharedFolder, "SUMARY.TMP", thisPageData.PagesOut)
		thisPageData.PagesOut.Clear
		ProgressDialogHide
		
		ProgressDialogShow(ShareCode.reportsMsgGerarArquivo)
		'************************************************************************
		Dim ReportContinue As Boolean = True
		Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
		
		Dim ResWR As ResumableSub = WriteReportToHTMLFile($"${FileReport}.html"$, SecondFilesCount)
		Wait For(ResWR) Complete (ReportHTMLSave As Boolean)
		
		If ReportHTMLSave Then
			
			Dim theFile As String = $"${FileReport}.html"$
			CurrentFile = $"${FileReport}.html"$
			Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
			Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
		
			Wait For(CallReportAPIFile(CLA.Tagcode, theFile)) Complete (ReportAPIFile As Boolean)

			ProgressDialogHide
			ProgressDialogShow(ShareCode.reportsMsgGeralRelatorioCarregaFicheiro)
		
			If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
				Wait For(CopyReportFileToShared(theFile)) Complete (ReportCopyFile As Boolean)
				Wait For(UploadReportFileToServer(theFile)) Complete (ReportUploadFile As Boolean)
			End If
			
			Dim sSQL As String = $"update dta_requests set file_report='${theFile}' where tagcode='${CLA.Tagcode}'"$
			Utils.SaveSQLToLog("AGRUPADOR2GenerateReport",sSQL, CLA.Tagcode)
			
		Else
			ReportContinue = False
		End If
		
		
		If ReportContinue Then
			If (File.Size(Starter.SharedFolder ,$"${FileReport}.html"$) < 20000000) Then
				Dim ShowReport As Boolean = True
				Try
					Dim ThisStringReport As String = File.ReadString(Starter.SharedFolder ,$"${FileReport}.html"$)
				Catch
					Log(LastException)
					ShowReport = False
				End Try
				ReportProgress.Visible = False
				If (ShowReport) Then
					Try
						ReportView.LoadHtml(ThisStringReport)
					Catch
					
						MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
						Log(LastException)
					End Try
				End If
			End If
		Else
			MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
		End If

		ProgressDialogHide
'		Return True
	Else
		MsgboxAsync(ShareCode.reportsMsgFuncionalidadeNCFG, ShareCode.GeneralAlertTitle)
	End If
	ReportProgress.Visible = False
	
	ProgressDialogHide
'	Return True
End Sub

'===============================================================================================================
' CHECKLIST REPORT GENERATION
'===============================================================================================================

Sub LIMPERSADOGenerateReport(CLA As RequestCLA)
	'saveFinalObs
	'CLA.Other.Filter
	
	ProgressDialogShow(ShareCode.reportsMsgGeralRelatorio)

	Sleep(50) 

	Private Record As Cursor
	Dim HtmlFile As String = ""
	'Dim HTML As List = File.ReadList(Starter.SharedFolder, "template1.html")
	Dim HtmlCode As String = ""
	Dim SQL As String = $"select * from dta_tasks where tagcode='${CLA.Task}'"$
	Record = Starter.LocalSQLEVC.ExecQuery(SQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		Dim repOptions As String = Utils.IfNullOrEmpty(Record.GetString("generate_report_list"), "")
		Dim ReportList As List = Regex.Split("\|", repOptions.trim )
		If (ReportList.Size>=1) Then
			HtmlCode = ReportList.Get(0)
		Else
			If Utils.NNE(repOptions) Then
				HtmlCode = repOptions
			End If
		End If
	End If
	Record.Close
	Log(HtmlCode)
	
	If Utils.NNE(HtmlCode) Then
		Dim SQL As String = $"select template_file from dta_reports where tagcode='${HtmlCode}' and prepared=1"$
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			Log($"1=${Record.GetString("template_file")}"$)
			HtmlFile = Record.GetString("template_file")
		End If
		Record.Close
	End If
	Log($"2=${HtmlFile}"$)
	
	If Not(Utils.NNE(HtmlFile)) Then
		HtmlFile = "template_limpersado_guia.html"
	End If

	Dim fExists As Boolean = False
	If (File.Exists(Starter.InternalFolder, HtmlFile) And File.Exists(Starter.SharedFolder, HtmlFile)) Then
		If (File.LastModified(Starter.InternalFolder, HtmlFile) > File.LastModified(Starter.SharedFolder, HtmlFile)) Then
			File.Copy(Starter.InternalFolder, HtmlFile, Starter.SharedFolder, HtmlFile )
		End If
		fExists = True
	End If
	
	If Not(fExists) Then
		If Not(File.Exists(Starter.SharedFolder, HtmlFile)) Then
			If File.Exists(Starter.InternalFolder, HtmlFile) Then
				File.Copy(Starter.InternalFolder, HtmlFile, Starter.SharedFolder, HtmlFile )
				fExists = True
			End If
		Else
			fExists = True
		End If
		If Not(fExists) Then
			If File.Exists(File.DirAssets, HtmlFile) Then
				File.Copy(File.DirAssets, HtmlFile, Starter.SharedFolder, HtmlFile )
				fExists = True
			End If
		End If
	End If
	
	If (fExists) Then
		Dim HTML As String = File.ReadString(Starter.SharedFolder, HtmlFile)
		Dim DATA_NAME As String = ""
		Dim SQL As String = $"${DBStructures.EVC_SQL_GETREQUESTS_DATA_TASKS_REP} and z.request_tagcode='${CLA.Request}'
							and z.relation_tagcode='${CLA.Action}'
							and z.repeatcounter=${CLA.RepeatCounter} 
							ORDER BY z.position, z.repeatcounter"$
		Log(SQL)
		Record = Starter.LocalSQLEVC.ExecQuery(SQL)
		If Record.RowCount > 0 Then
			Record.Position = 0
			
'			If(ShareCode.APP_DOMAIN.ToLowerCase = "grandative") Then
'				Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
'				Dim contracto As String = Utils.IfNullOrEmpty(Record.GetString("contracto"), "")
'				If Utils.NNE(contracto) Then
'					If Utils.NNE(Reference) Then
'						Reference = $"${Reference} (${contracto})"$
'					Else
'						Reference = $"${contracto}"$
'					End If
'				End If
'				Reference = Utils.IfNullOrEmpty(Reference, "Sem contrato/Prospect")
'			Else
				Dim Reference As String = Utils.IfNullOrEmpty(Record.GetString("reference"), "_")
'			End If
			
			Dim Points As Double = Record.GetDouble("points")
			Dim Inicio As String = Record.GetString("run_start")
			Dim Fim As String = Record.GetString("run_end")
			Dim Duracao As String = Record.GetString("run_time")
			Dim Data As String = Utils.GetCurrentDate
			Dim Name As String = Utils.IfNullOrEmpty(Record.GetString("name"), "_")
			Dim RequestType As String = Utils.IfNullOrEmpty(Record.GetString("task_name"), "_")
			Dim RequestNumber As String = Record.GetString("tagcode")
			Dim Morada As String = $"${Record.GetString("address")}, ${Record.GetString("city")}"$
			Dim request_obs As String = Utils.IfNullOrEmpty(Record.GetString("request_obs"), "_")
			
			Dim Address As String = Utils.IfNullOrEmpty(Record.GetString("address"), "_")
			Dim Address2 As String = Utils.IfNullOrEmpty(Record.GetString("address2"), "_")
			Dim City As String = Utils.IfNullOrEmpty(Record.GetString("city"), "_")
			Dim PostalCode As String = Utils.IfNullOrEmpty(Record.GetString("postal_code"), "_")
			Dim Nif As String = Utils.IfNullOrEmpty(Record.GetString("nif"), "_")
			Dim Contact As String = Utils.IfNullOrEmpty(Record.GetString("contact_name"), "_")
			Dim Phone As String = Utils.IfNullOrEmpty(Record.GetString("phone"), "_")
			Dim tipo_intervencao As String = Utils.IfNullOrEmpty(Record.GetString("tipo_intervencao"), "")
			
			Dim ENTITY_CLIENT As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
						from dta_requests_fields where request_tagcode='${CLA.Request}' and field_tagcode='FIELD_CLIENT_NAME'"$, "valor")
			If Utils.NNE(ENTITY_CLIENT) Then
				Name = ENTITY_CLIENT
			End If
			
			Dim Object2Name As String = Utils.IfNullOrEmpty(Record.GetString("objectname"), "_")
			
			Dim Technical As String = ShareCode.SESS_OPER_UserName  'Utils.IfNullOrEmpty(Record.GetString("sess_user"), ShareCode.SESS_OPER_User)
			Dim ObjectName As String = Utils.IfNullOrEmpty(Record.GetString("nameobject"), "_")   'objectname"), "_")
			Dim Draft As String = "none"
			Dim status As Int = Record.GetInt("task_status_id")
			If (ShareCode.DEVICE_PARAM_PRINT_DRAFT = 1) Then
				'If ((status >=3) And (status <=4)) Then Draft = "block"
				If ((status <=2) Or (status =5)) Then Draft = "block"
			End If
			
			If Utils.Int2Bool(ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST) Then
				Dim script As String = $"SELECT min(execute_datetime) as executedatetime FROM dta_requests_values
						WHERE request_tagcode='${CLA.Request.trim}' And repeatcounter=0"$
			Else
				Dim script As String = $"SELECT req_date as executedatetime from dta_requests WHERE tagcode='${CLA.Request.trim}'"$
			End If
	
			Dim Data As String = Utils.IfNullOrEmpty(DBStructures.GetScriptColumnStrEVC(script, "executedatetime"), _
						Record.GetString("run_date"))
			
			
			Dim FIELD_AJUDANTE As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value_title, execute_value) as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_AJUDANTE'"$, "valor")
			Dim FIELD_EXPEDENOME As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_EXPEDENOME'"$, "valor")
			Dim FIELD_EXPEDEMORADA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_EXPEDEMORADA'"$, "valor")
			Dim FIELD_EXPEDE_HORA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_EXPEDE_HORA'"$, "valor")
						
			Dim FIELD_DESCARGANOME As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_DESCARGANOME'"$, "valor")
			Dim FIELD_DESCARGAMORADA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_DESCARGAMORADA'"$, "valor")
			Dim FIELD_DESCARGAHORA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_DESCARGAHORA'"$, "valor")
			
			Dim ENTITY_NIF As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(value, '') as valor
						from dta_objects_fields where object_tagcode in (select object_tagcode from dta_requests where tagcode='${CLA.Request.Trim}')  and field_tagcode='FIELD_NIF'"$, "valor")
						
			Dim EXECUTION_CGR_DATA As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_date, '') as valor
							from dta_requests where tagcode='${CLA.Request.Trim}'"$, "valor")
						
			Dim EXECUTION_CGR_NUMBER As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(process_number, '') as valor
							from dta_requests where tagcode='${CLA.Request.Trim}'"$, "valor")
			

			Dim FIELD_NUM_ONU As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_NUM_ONU'"$, "valor")
			Dim FIELD_QTDVOLUMES As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_QTDVOLUMES'"$, "valor")
			Dim FIELD_VOLUME As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_VOLUME'"$, "valor")
			Dim FIELD_PESOBRUTO As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, '') as valor
						from dta_requests_values where request_tagcode='${CLA.Request.Trim}' and task_tagcode='${CLA.Task.Trim}' and item_tagcode='FIELD_PESOBRUTO'"$, "valor")

'			
'			GRP_RECEBE
'			FIELD_RECEBE
'			FIELD_RECEBEVALOR
'			GRP_AVALIA
'			FIELD_AVALTECH
'			FIELD_AVALHORA
'			FIELD_AVALSERV
'			FIELD_AVALEPI
'			FIELD_AVALLIMPO

			HTML = HTML.Replace(":__FIELD_NUM_ONU", FIELD_NUM_ONU)
			HTML = HTML.Replace(":__FIELD_QTDVOLUMES", FIELD_QTDVOLUMES)
			HTML = HTML.Replace(":__FIELD_VOLUME", FIELD_VOLUME)
			HTML = HTML.Replace(":__FIELD_PESOBRUTO", FIELD_PESOBRUTO)
			
			
			HTML = HTML.Replace(":__EXECUTION_CGR_NUMBER", $"${EXECUTION_CGR_NUMBER}/2020"$)
			HTML = HTML.Replace(":__EXECUTION_CGR_DATA", EXECUTION_CGR_DATA)
			HTML = HTML.Replace(":__ENTITY_NIF", ENTITY_NIF)
			HTML = HTML.Replace(":__ENTITY_PHONE", "")
			HTML = HTML.Replace(":__EXPEDIDOR_NAME", FIELD_EXPEDENOME)
			HTML = HTML.Replace(":__EXPEDIDOR_LOCAL", FIELD_EXPEDEMORADA)
			HTML = HTML.Replace(":__DESTINATARIO_NAME", FIELD_DESCARGANOME)
			HTML = HTML.Replace(":__DESTINATARIO_LOCAL", FIELD_DESCARGAMORADA)


			HTML = HTML.Replace(":__EXECUTION_NUMBER", RequestNumber)
			HTML = HTML.Replace(":__REPORT_NAME", RequestType)
			HTML = HTML.Replace(":__EXECUTION_RESULT", CLA.Other.Filter) '  CurrentResult)
			HTML = HTML.Replace(":__EXECUTION_POINTS", Points)
			HTML = HTML.Replace(":__REQUEST_TYPE", tipo_intervencao)
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
			HTML = HTML.Replace(":__EXECUTION_START", Inicio)
			
			
'			If ((ShareCode.APPL_ACCOUNT.ToUpperCase = "RESOPRE")) Then
'				HTML = HTML.Replace(":__ENTITY_UNITY", Object2Name)
'			Else
				HTML = HTML.Replace(":__ENTITY_UNITY", ObjectName)
'			End If
			
		
			HTML = HTML.Replace(":__TECHNICAL_NAME1", "")
			HTML = HTML.Replace(":__TECHNICAL_NAME2", "")
			HTML = HTML.Replace(":__TECHNICAL_NAME", Technical)
			HTML = HTML.Replace(":__CONTRACT", Reference)
			
			HTML = HTML.Replace(":__DISPLAY_DRAFT", Draft)
			
			HTML = HTML.Replace(":__ENTITY_OBJECT", Object2Name)  'ObjectName)
			HTML = HTML.Replace(":__ENTITY_CLIENT", Name)
			
			HTML = HTML.Replace(":__ADDRESS", Address)
			HTML = HTML.Replace(":__ADDRESS_DETAILS", Address2)
			HTML = HTML.Replace(":__POSTAL_CODE", PostalCode)
			HTML = HTML.Replace(":__LOCAL_CITY", City)
			HTML = HTML.Replace(":__NIF_NUMBER", Nif)
			HTML = HTML.Replace(":__PHONE_NUMBER", Phone)
			HTML = HTML.Replace(":__WEEK_DAY", "_")
			HTML = HTML.Replace(":__CLCT_CODE", "_")
			HTML = HTML.Replace(":__BEST_HOUR", "_")
			HTML = HTML.Replace(":__CONTACT_NAME", Contact)
			
			
			HTML = HTML.Replace(":__REPORT_NUMBER", RequestNumber)
			HTML = HTML.Replace(":____SERVICE_01", RequestType)
			HTML = HTML.Replace(":__SERVICE_02", "_")
			HTML = HTML.Replace(":__SERVICE_03", "_")

			HTML = HTML.Replace(":__DEPARTMENT", ObjectName)
			HTML = HTML.Replace(":__NAME", Name)
			HTML = HTML.Replace(":__FUNCTION", Reference)
			HTML = HTML.Replace(":__YEAR", "")
			HTML = HTML.Replace(":__MONTH", "")
			HTML = HTML.Replace(":__NUMBER", "")
			HTML = HTML.Replace(":__OBSERVATIONS", "")
			
			'__REQUEST  __NAMEMASTER  __DATE  __NAMEUSER  __FUNCUSER __USERSIGNATURE __USERDATE __MASTERSIGNATURE  __MASTERDATE

			' ************************************************************************
			' PEGA NA LISTA DE VALORES PARA CRIAÇÃO DE DETALHE DE RELATÓRIO
			' ***********************************************************************
			Dim DATA_NAME As String = ""
			Private objRecord As Cursor
			Dim Rows As Int = 0
				
'			Dim dataSQL As String = $"Select x.unique_key, x.execute_value, x.execute_notes, x.val_desc, x.title, x.position, x.level,
'									x.datatype, x.repeatcounter, x.repeatitemcounter, x.repeatfieldcounter, x.repeated, x.title_2, x.bullet_level, 
'									x.bullet_master, x.bullet_child
'									from (Select a.unique_key, a.execute_value, ifnull(a.execute_notes,'') as execute_notes, 
'									Case WHEN a.execute_value_title <> '' THEN a.execute_value_title ELSE 
'									Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then b.title Else a.execute_value End
'									end as val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
'									a.repeatitemcounter, a.repeatfieldcounter, c.repeated, a.title as title_2, c.bullet_level, 
'									c.bullet_master, c.bullet_child
'									from dta_requests_values As a
'									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
'									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
'									where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
'									and a.task_tagcode='${CLA.Task.Trim}'  and a.item_tagcode in ('FIELD_SERVICO', 'FIELD_QTD', 'FIELD_DURACAO')
'									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) 
'										Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))) as x
'									order by x.bullet_master, x.repeatcounter, x.repeatitemcounter, x.position"$
									
			Dim dataSQL As String = $"Select x.unique_key, x.execute_value, x.execute_notes, ifnull(x.val_desc,'') AS val_desc, x.title, x.position, x.level,
									x.datatype, x.repeatcounter, x.repeatitemcounter, x.repeatfieldcounter, x.repeated, x.title_2, x.bullet_level, 
									x.bullet_master, x.bullet_child
									from (Select a.unique_key, a.execute_value, ifnull(a.execute_notes,'') as execute_notes, 
									Case WHEN a.execute_value_title <> '' THEN
										a.execute_value_title
									ELSE 
										Case when (a.execute_status>0 and b.data_type=16 and length(a.execute_value)<2) Then
											b.title
										Else
										   a.execute_value
										END
									End AS val_desc, c.title, c.position, c.level, c.data_type As datatype, a.repeatcounter, 
									a.repeatitemcounter, a.repeatfieldcounter, c.repeated, a.title as title_2, c.bullet_level, 
									c.bullet_master, c.bullet_child
									from dta_requests_values As a
									inner join dta_tasks_items_answers As b on (b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.unique_key=a.unique_key And b.tagcode=a.tagcode)
									inner join dta_tasks_items As c on (c.task_tagcode=b.task_tagcode And c.item_tagcode=b.item_tagcode And c.unique_key=b.unique_key)
									where a.request_tagcode='${CLA.Request.Trim}' and a.inner_request_tagcode='${CLA.Action.Trim}' 
									and a.task_tagcode='${CLA.Task.Trim}' and a.item_tagcode in ('FIELD_SERVICO', 'FIELD_QTD', 'FIELD_DURACAO')
									And ((b.data_type<>16) or (a.execute_status=0 And b.data_type<>16) 
										Or (a.execute_status>0 And b.data_type=16) Or (a.execute_status>0 And b.data_type=6))) as x
									order by x.bullet_master, x.repeatcounter, x.repeatitemcounter, x.position"$					
					
						 
						
			Log("********************************************************")
			Log("********************************************************")
			Log("********************************************************")
			Log(dataSQL)
			objRecord = Starter.LocalSQLEVC.ExecQuery(dataSQL)
			If objRecord.RowCount > 0 Then
				'PageSizeLineTotal = PageSizeLine * objRecord.RowCount
				Dim LineCounter As Int = 1
				Dim RecordRowCount As Int = 0
				
				Dim borderBottom As String = $"border-bottom: 1px solid #B5B9BA;"$
				Dim CHAPTER_NAME As String = $"<table style="width:100%;" class="table">
								<thead>
									<tr>
										<th style="${borderBottom}width:80%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Descritivo</th>
										<th style="${borderBottom}width:10%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Quantidade</th>
										<th style="${borderBottom}width:10%;text-align: left;border-right: 1px solid #B5B9BA;padding: 4px 6px;">Duração</th>
									</tr>
								</thead>
								<tbody>"$
				
				Dim ITEM1 As String = ""
				Dim ITEM2 As String = ""
				Dim ITEM3 As String = ""
				For Rows =0 To objRecord.RowCount-1
					objRecord.Position = Rows
					
					If (LineCounter = 4) Then
						LineCounter = 1
						
						CHAPTER_NAME = $"${CHAPTER_NAME}<tr ${borderBottom}>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;">${ITEM1.Trim}</td>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;">${ITEM2.Trim}</td>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;">${ITEM3.Trim}</td>
											</tr>"$
						Dim ITEM1 As String = ""
						Dim ITEM2 As String = ""
						Dim ITEM3 As String = ""
					End If
					
					If (LineCounter = 1) Then
							Dim ITEM1 As String = objRecord.GetString("val_desc")
					Else If (LineCounter = 2) Then
							Dim ITEM2 As String = objRecord.GetString("val_desc")
					Else If (LineCounter = 3) Then
							Dim ITEM3 As String = objRecord.GetString("val_desc")
					End If
					
'					If (LineCounter = 1) Then
'						Try
'							Dim ITEM1 As String = objRecord.GetString("val_desc")
'						Catch
'							Log(LastException)
'							Dim ITEM1 As String = ""
'						End Try
'						
'					Else If (LineCounter = 2) Then
'						Try
'							Dim ITEM2 As String = objRecord.GetString("val_desc")
'						Catch
'							Log(LastException)
'							Dim ITEM2 As String = ""
'						End Try
'					Else If (LineCounter = 3) Then
'						Try
'							Dim ITEM3 As String = objRecord.GetString("val_desc")
'						Catch
'							Log(LastException)
'							Dim ITEM3 As String = ""
'						End Try
'					End If
					RecordRowCount=RecordRowCount+1
					LineCounter = LineCounter +1
					
				Next
			End If
			objRecord.Close
		End If
		
		
		'************************************************************************************************************
		' NOTE: ESTRUTURA DE REPETICAO DA CAPITULOS BASEADO EM PARAMETROS E UM HTML ADICIONAL
		'************************************************************************************************************
		Dim object_tagcode As String = DBStructures.GetScriptColumnStrEVC($"select object_tagcode from dta_requests where tagcode = '${CLA.Request.Trim}'"$,"object_tagcode")
		Dim checkRes As ResumableSub = ReportRunParamterInQuery(CLA, HTML, object_tagcode, True)
		Wait For (checkRes) Complete (dataHtmlReturn As String)
			
		Log(dataHtmlReturn)
			
		If Utils.NNE(dataHtmlReturn) Then
			HTML = dataHtmlReturn
		End If
		
		If (LineCounter > 2) Then
			CHAPTER_NAME = $"${CHAPTER_NAME}<tr ${borderBottom}>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;">${ITEM1.Trim}</td>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;">${ITEM2.Trim}</td>
												<td style="${borderBottom}border-right: 1px solid #B5B9BA;padding: 4px 6px;">${ITEM3.Trim}</td>
											</tr>"$
		End If
		
		CHAPTER_NAME = $"${CHAPTER_NAME}</tbody> </table><div class="col-12">&nbsp;</div> "$
		DATA_NAME = $"${DATA_NAME}${CHAPTER_NAME}"$
		HTML = HTML.Replace(":__DATA_NAME", DATA_NAME)

		Dim SHOW_SIGNATURES As String = "display:none;"
		Dim SIGNATURE_CLIENT As String = ""
		Dim SIGNATURE_TECHNICAL As String = ""
		
		Dim SIGNATURE_ENTITY_NAME As String = SignatureRequestFrom(CLA, 1)
		Dim SIGANTURE_ENTITY_TECHNICAL As String = SignatureRequestFrom(CLA, 1)
		HTML = HTML.Replace(":__SIGNATURE_ENTITY_NAME", SIGNATURE_ENTITY_NAME)
		HTML = HTML.Replace(":__SIGNATURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		HTML = HTML.Replace(":__SIGANTURE_ENTITY_TECHNICAL", SIGANTURE_ENTITY_TECHNICAL)
		Private Recordw As Cursor
		Dim Rows As Int = 0
		Dim SQL As String = $"select * from dta_requests_signatures where  request_tagcode='${CLA.Request.Trim}'
							and inner_request_tagcode='${CLA.Action.Trim}' and repeatcounter=${CLA.RepeatCounter}"$
		Recordw = Starter.LocalSQLEVC.ExecQuery(SQL)
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
		Sleep(50)
		
		Dim DATA_ADDITIONAL As String = $"<div class="col-12">&nbsp;</div><div class="col-12">&nbsp;</div>"$
		HTML = HTML.Replace(":__DATA_ADDITIONAL", DATA_ADDITIONAL)
		Sleep(50)
		
		'************************************************************************
		'************************************************************************
		'************************************************************************
		Dim FileReport As String = $"REPORT_${Utils.MakeFileName}"$
		File.WriteString(Starter.SharedFolder, $"${FileReport}.html"$, HTML)
		Sleep(500)
		
		Dim ReportContinue As Boolean = File.Exists(Starter.SharedFolder, $"${FileReport}.html"$)
		If ReportContinue Then
			Dim theFile As String = $"${FileReport}.html"$
			CurrentFile = $"${FileReport}.html"$
			Dim FileGenerated As Boolean = File.Exists(Starter.SharedFolder, theFile)
			Utils.logChangeFile(theFile, 0, 0, 1, Utils.GetCurrentDate)
		
			Wait For(CallReportAPIFile(CLA.Request, theFile)) Complete (ReportAPIFile As Boolean)

			ProgressDialogHide
			ProgressDialogShow(ShareCode.reportsMsgGeralRelatorioCarregaFicheiro)
		
			If (FileGenerated) And Not(File.Exists(Starter.InternalFolder, theFile)) Then
				Wait For(CopyReportFileToShared(theFile)) Complete (ReportCopyFile As Boolean)
				Wait For(UploadReportFileToServer(theFile)) Complete (ReportUploadFile As Boolean)
			End If
			
			Dim sSQL As String = $"update dta_requests set file_report='${theFile}' where tagcode='${CLA.Request.Trim}'"$
			Utils.SaveSQLToLog("GenerateReport",sSQL, CLA.Request)
			'Starter.LocalSQLEVC.ExecNonQuery(sSQL)
		End If
		
		If (File.Size(Starter.SharedFolder ,$"${FileReport}.html"$) < 20000000) Then
			Dim ShowReport As Boolean = True
			Try
				Dim ThisStringReport As String = File.ReadString(Starter.SharedFolder ,$"${FileReport}.html"$)
			Catch
				Log(LastException)
				ShowReport = False
			End Try
			ReportProgress.Visible = False
			If ShowReport Then
				Try
					ReportView.LoadHtml(ThisStringReport)
				Catch
					MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
					Log(LastException)
				End Try
			End If
		Else
			MsgboxAsync(ShareCode.reportsErroTamanhoExcessivo, ShareCode.GeneralAlertTitle)
		End If

		ProgressDialogHide
	Else
		Msgbox2Async(ShareCode.reportsErroAbrirTemplate, ShareCode.GeneralAlertTitle,"OK","","",Null,False)
		Wait For Msgbox_Result (Result As Int)
		ProgressDialogHide
		butClose_Click
	End If
End Sub

Sub SignatureRequestFrom(data As RequestCLA, Posis As Int) As String
	Dim ret As String = ""
	If DBUtils.TableExists(Starter.LocalSQLEVC, "dta_typerequests_signature") Then
		Dim typetask As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode
						from dta_requests where tagcode='${data.Request}'"$, "typerequest_tagcode")
						
		Dim sSignSql As String = $"select title, mandatory, dategeo_stamp
						from dta_typerequests_signature 
						where typerequest_tagcode='${typetask}'
						and ((related_to=0) or ((related_to=1) and (task_tagcode='${data.Task.trim}'))) and active=1 order by position "$
		Private signCursor As Cursor = Starter.LocalSQLEVC.ExecQuery(sSignSql)
		Dim SignatureRequest As Int = signCursor.RowCount
		If SignatureRequest > 0 Then
			For nn = 0 To signCursor.RowCount-1
				signCursor.Position = nn
				If (nn = Posis-1) Then
					ret = signCursor.GetString("title")
				End If
			Next
		End If
	End If
	Return ret
End Sub


Sub SignatureRequestFromRD(data As RequestData, Posis As Int) As String
	Dim ret As String = ""
	If DBUtils.TableExists(Starter.LocalSQLEVC, "dta_typerequests_signature") Then
		Dim typetask As String = DBStructures.GetScriptColumnStrEVC($"select typerequest_tagcode
						from dta_requests where tagcode='${data.Tagcode}'"$, "typerequest_tagcode")
						
		Dim sSignSql As String = $"select title, mandatory, dategeo_stamp
						from dta_typerequests_signature 
						where typerequest_tagcode='${typetask}'
						and ((related_to=0)) and active=1 order by position "$
		Private signCursor As Cursor = Starter.LocalSQLEVC.ExecQuery(sSignSql)
		Dim SignatureRequest As Int = signCursor.RowCount
		If SignatureRequest > 0 Then
			For nn = 0 To signCursor.RowCount-1
				signCursor.Position = nn
				If (nn = Posis-1) Then
					ret = signCursor.GetString("title")
				End If
			Next
		End If
	End If
	Return ret
End Sub


#Region UpdateDados2BO

Sub UpdateData2Server As ResumableSub
	
	ProgressDialogShow2(ShareCode.checklistenviardados2BO, False)
	Starter.RunUpdate = True
	Log("**************************************")
	Log(" SENDING LOCAL DATA TO SERVER ")
	Log("**************************************")
		
	Dim WITHFILES As Boolean = True
	Dim RecCounter As Int = LocalDataToUpdate
	
	Dim CompletedHttp As Boolean = True
	Dim CompletedHttpEmail As Boolean = True
	Dim CompletedFTP As Boolean = True
	
	Try
		Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=0"$
		Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
	Catch
		Log(LastException)
		Dim sSQL As String = $"select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0"$
		Dim RecordLocalDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)
		WITHFILES = False
	End Try
				
	Try
		Dim sSQLEmails As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where up_state=0 and up_type=0"$
		Dim RecordLocalEmailDataToUpdate As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQLEmails)
		Dim EmailCheck As Boolean = True
	Catch
		Log(LastException)
		Dim EmailCheck As Boolean = False
	End Try
				
	Dim ut0 As Int = RecordLocalDataToUpdate.RowCount
	Dim ut1 As Int = RecCounter - ut0
					
	If(RecordLocalDataToUpdate.RowCount >= 1) Then
		Dim n As Int = 0
		For n = 0 To RecordLocalDataToUpdate.RowCount-1
			RecordLocalDataToUpdate.Position = n
			Try
				Dim r1  As ResumableSub = SetUpdateHTTPRecord(RecordLocalDataToUpdate, WITHFILES, 0)
				Wait For(r1) complete (Succeded As Boolean)
				CompletedHttp = Succeded
				
				' ENVIAR DADOS DE EMAIL (HTTP)
				If EmailCheck Then
					Dim r2 As ResumableSub = SetUpdateHTTPEmailRecord(RecordLocalEmailDataToUpdate)
					Wait For(r2) complete (finished As Boolean)
					CompletedHttpEmail = finished
				End If
			Catch
				Log(LastException)
				CompletedHttp = False
			End Try
			
		Next
	Else
		CompletedHttp = True			
	End If
	
	RecordLocalDataToUpdate.Close
	Sleep(250)
				
	If (ut1 >= 1) And (WITHFILES) Then
		Dim sSQL As String = $"select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=1"$
		Dim RecordLocalDataToUpdate2 As ResultSet = Starter.LocalSQLWRK.ExecQuery(sSQL)

		If(RecordLocalDataToUpdate2.RowCount >= 1) Then
			For n1 = 0 To RecordLocalDataToUpdate2.RowCount-1
				RecordLocalDataToUpdate2.Position = n1
				Try
					Dim r2 As ResumableSub = SetUpdateFTPRecord(RecordLocalDataToUpdate2, WITHFILES, 1)
					Wait For (r2) Complete (Succeded2 As Boolean)
					CompletedFTP = Succeded2
				Catch
					Log(LastException)
					CompletedFTP = False
				End Try
			Next
		End If
		RecordLocalDataToUpdate2.Close
	Else
		CompletedFTP = True
	End If
		
	ProgressDialogHide
	Starter.RunUpdate = False
	
	If CompletedHttp = True And CompletedFTP = True And CompletedHttpEmail = True Then
		Dim CompletResult As Boolean = True
	Else
		Dim CompletResult As Boolean = False
	End If
	
	Return CompletResult
	
End Sub

Sub SetUpdateHTTPRecord(inRec As ResultSet, withImg As Boolean, def As Int) As ResumableSub

	If withImg Then
		Dim up_type As Int = Utils.IfNullOrEmpty(inRec.GetInt("up_type"), def)
	End If
	
	Dim res As Boolean = True
	Dim up_date As String = Utils.IfNullOrEmpty(inRec.GetString("up_date"), "")
	Dim up_values As String = Utils.IfNullOrEmpty(inRec.GetString("up_values"), "")
	Dim up_tableurl As String = Utils.IfNullOrEmpty(inRec.GetString("up_tableurl"), "")
	If Utils.NNE(up_tableurl) And Utils.NNE(up_values) Then

		Dim Job As HttpJob
		Job.Initialize("",Me)
		Dim addr As String = up_tableurl

		Job.PostString(addr, up_values )
		Log(up_values)
		Job.GetRequest.SetContentType("application/json")

		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Dim Status As Int = Utils.JobAPIStatus(Job)
			Log($"Status: ${Status}"$)
			res = True
			
			Try
				If withImg Then
					Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}' and up_type=${up_type}"$
				Else
					Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}'"$
				End If
				
				Starter.LocalSQLWRK.ExecNonQuery(upd)
				res = True
			Catch
				Log(LastException)
				res = False
			End Try
			
		Else
			res = False
		End If
	
		Job.Release
		Sleep(250)

	Else
		res = True
	End If
	
	Return res
End Sub

Sub SetUpdateHTTPEmailRecord(inRec As ResultSet) As ResumableSub
	
	Dim up_date As String = Utils.IfNullOrEmpty(inRec.GetString("up_date"), "")
	Dim up_values As String = Utils.IfNullOrEmpty(inRec.GetString("up_values"), "")
	Dim up_tableurl As String = Utils.IfNullOrEmpty(inRec.GetString("up_tableurl"), "")
	If Utils.NNE(up_tableurl) And Utils.NNE(up_values) Then
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Dim addr As String = up_tableurl

		Job.PostString(addr, up_values )
		Log(up_values)
		Job.GetRequest.SetContentType("application/json")

		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Try
				Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}'"$
				Starter.LocalSQLWRK.ExecNonQuery(upd)
				Return True
			Catch
				Log(LastException)
				Return False
			End Try
		Else
			Return False
		End If
	Else
		Return True
	End If
	
End Sub

Sub SetUpdateFTPRecord(inRec As ResultSet, withImg As Boolean, def As Int) As ResumableSub

	If withImg Then
		Dim up_type As Int = Utils.IfNullOrEmpty(inRec.GetInt("up_type"), def)
	End If
	Dim up_date As String = Utils.IfNullOrEmpty(inRec.GetString("up_date"), "")
	Dim up_values As String = Utils.IfNullOrEmpty(inRec.GetString("up_values"), "")
	Dim up_tableurl As String = Utils.IfNullOrEmpty(inRec.GetString("up_tableurl"), "")
	If Utils.NNE(up_tableurl) And Utils.NNE(up_values) Then
		
		Dim myFTP As FTP
		myFTP.Initialize("ftp", $"${ShareCode.APPL_ACCOUNT.ToLowerCase}.${ShareCode.APPL_HOST}"$, 21, $"${ShareCode.APP_FTP_USER}@${ShareCode.APPL_HOST}"$, "..VRCG@EvolutionCheck20!9")
		myFTP.PassiveMode = True
		myFTP.TimeoutMs =240000
	
		Dim sf As Object = myFTP.UploadFile(Starter.InternalFolder, up_values, False, up_tableurl & up_values)
		Wait For (sf) ftp_UploadCompleted (ServerPath As String, Success As Boolean)
		Log($"Ficheiro: ${up_values}, URL: ${up_tableurl}, Status: ${Utils.Bool2String(Success)}"$)
		Dim finished As Boolean = Success
		myFTP.Close
				
		If (finished = True) Then
			Try
				If withImg Then
					Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}' and up_type=${up_type}"$
				Else
					Dim upd As String = $"update loc_updatesrever set up_state= 1 where up_date='${up_date}'"$
				End If
				Starter.LocalSQLWRK.ExecNonQuery(upd)
			Catch
				Log(LastException)
			End Try
		Else
			Return False
		End If
	End If
	Return True
End Sub

Sub LocalDataToUpdate As Int
	Dim ret As Int = 0

	Dim sSQL As String = $"select distinct count(0) as total from loc_updatesrever where up_state=0"$
	Dim iRecord As Cursor
	Try
		iRecord = Starter.LocalSQLWRK.ExecQuery(sSQL)
		If (iRecord.RowCount>0) Then
			iRecord.Position = 0
			ret = iRecord.GetInt("total")
			Log("««««««««««««««««««««««««««««««««««««")
			Log($"Total local data to upload:${ret}"$)
			Log("««««««««««««««««««««««««««««««««««««")
		End If
	Catch
		Log(LastException)
		ret = 0
	End Try
	iRecord.Close
	Return ret
End Sub

Sub InsertAlertErrors(ErrorMsg As String)
	
	Log("INSERT ALERTA BACKGROUNDUPDATESERVICE")
	Private nRecord As Cursor
	Dim mID As Int = DBStructures.GetMaxOfEVC("dta_alerts", "id", "") + 1+ 1000000
	Dim alerttagcode As String = $"${Utils.GenerateTagcode("ALERTINF_")}"$
	Dim sSQL As String = $"insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,
							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)
							values (${mID}, '${alerttagcode}', '', 'ALRTREL_REQUESTS', 'ALRTTYP_NOTIFY', 1, 1, '${ErrorMsg}', 
	'${ShareCode.SESS_User}', '${Utils.GetCurrentDate}', '', 1, 1, 0, 0)"$
	Utils.SaveSQLToLog("butSavePicture_Click",sSQL, "")

	CallSub(MainMenu,"BadgeCheckUpdate")
	
End Sub

#End Region

Sub CreateBitmap2File(myDir As String, myfilename As String, imagem As Bitmap, extension As String) As ResumableSub
	Dim out As OutputStream
	
	If extension.ToLowerCase = "png" Then
		Dim Ext As String = "PNG"
	Else If extension.ToLowerCase = "jpg" Or extension.ToLowerCase = "jpeg" Then
		Dim Ext As String = "JPEG"
	End If
	
	out = File.OpenOutput(myDir, myfilename, False)
	imagem.WriteToStream(out, 100, Ext)
	
	out.Close
	Return True
End Sub