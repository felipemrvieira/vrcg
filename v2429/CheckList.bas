B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	Public Device As Phone
End Sub

Sub Globals
	Private TOTAL_POINTS_VALUE As Float = 0
	Private CurrentCLAData As CLAHeader 'CLAData
	Private CurrentActivity As Activity
	Private InnerlistsTabPanelExec As Panel
	Private InnerlistsTabPanelObject As Panel
	Private InnerlistsTabPanelTerminate As Panel
	Private CLAItemsList As ExpandedListView
	Private OBJECTListView As ExpandedListView
	Private FINGroups As ExpandedListView
	Private FINItemImages As CustomListView 
	
	Private Const Index_CLA_Icon As Int = 0
	Private Const Index_CLA_Title As Int = 1
	Private Const Index_CLA_AddButton As Int = 2
	Private Const Index_CLA_ExpandButton As Int = 3
	
	Private CLAItemsPanel As Panel
	Private CLATitleAddButton As Button
	Private CLATitleExpandButton As Button
	Private CLATitleIconLabel As Label
	Private CLATitleLabel As Label
	Private CLATitlePanel As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	If (ShareCode.ISPHONE) Then
		Device.SetScreenOrientation(1)
	Else
		Device.SetScreenOrientation(ShareCode.DEVICE_ORIENTATION)
	End If
	'CurrentCLAData = Types.ClearCLAData
	Activity.LoadLayout("CLA_MainLayout_2")
End Sub

Sub Activity_Resume
	'
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	'
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		ActivityClose(False)
	End If
	Return True
End Sub

Sub ActivityClose(NoData As Boolean)
	If (NoData) Then
		ToastMessageShow("Checklist sem dados/especificação!", False)
	Else
		CallSubDelayed2(CurrentActivity, "ChecklistReturn", CurrentCLAData)
	End If
	Activity.Finish
	ShareCode.SetAnimation("zoom_enter", "zoom_exit")
End Sub

'MakeCLAStatus(Status As Int, StartDate As String, Starttime As String, Endtime As String, Duration As String, Points As Double, Risk As Int, _
'			Result As Int, ResultDesc As String, HasImages As Boolean, HasActions As Boolean, HasSignatures As Boolean, _
'			ReportGenerated As Boolean, CanChange As Boolean) As CLAStatus
'MakeCLAData(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, ReadOnly As Boolean, _
'			Composed As Boolean, StatusMaster As CLAStatus, StatusChild As CLAStatus) As CLAData
'
'		Public Const REQUESTS_GET_CURRENT_TASK_ITEMS As String = $"select distinct a.request_tagcode, a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.status,
'					b.mandatory, b.critical, b.multi, b.repeat, b.on_report, b.info, b.title, b.parent, b.value_type, b.value_options, b.level, b.type from  requests_values as a 
'					inner join tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey) where 1=1"$


' ==============================================================================================================================
'	INICIA ACTIVADADE DE CHECKLIST
' ==============================================================================================================================
'Sub StartChecklistActivity(thisActivity As Activity, thisCLA As CLAData)
Sub StartChecklistActivity(thisActivity As Activity, thisCLA As CLAHeader)
	If Not(Utils.isNullOrEmpty(thisCLA.request_tagcode)) Then
		CurrentCLAData = thisCLA
		CurrentActivity = thisActivity
		
		InnerlistsTabPanelExec.LoadLayout("CLA_TASK_V2_Execution")
		InnerlistsTabPanelObject.LoadLayout("CLA_TASK_V2_Information")
		InnerlistsTabPanelTerminate.LoadLayout("CLA_TASK_V2_Conclusion") 
		
'		'listsTabPanel.LoadLayout("CLA_TASK_Execution", Record.GetString("title")) '"Acção/Checklist")
'		cl_topTitle.Text = Record.GetString("name")
'		
'		FastCloseAction = Record.GetInt("fast_close") = 1
'		'If (FastCloseAction) Then TabPagesCount = 1
'		
''		If (Not(FastCloseAction) And (TabPagesCount > 1)) Then
''			listsTabPanel.LoadLayout("CLA_TASK_Information", "Documentação/Informação")
''			
''			cl_InfotopTitle.Text = Entity
''		End If
'		'listsTabPanel.LoadLayout("CLA_TASK_Conclusion", "Concluir/Terminar")
'		cl_FinaltopTitle.Text = Entity
		
		' ==============================================================================================================================
		'	CARREGA DADOS DA INTERVENÇÃO (REQUESTS_TASKS_ITEMS)
		'	CRIAR SEQUÊNCIA LÓGICA DA CHECKLIST, CRIA CAPÍTULOS SE EXISTIREM, CRIA PERGUNTAS E POSSÍVEIS RESPOSTAS
		' ==============================================================================================================================
		Private thisSQL As String = $"${DBStructures.REQUESTS_GET_CURRENT_TASK_ITEMS_V2} and a.request_tagcode='${CurrentCLAData.request_tagcode}'
								and a.inner_request_tagcode='${CurrentCLAData.relation_tagcode}' order by b.position"$
		' ==============================================================================================================================
		'	VERIFICA EXISTÊNCIA DE DADOS 
		' ==============================================================================================================================
		Private Record As Cursor
		Record = Starter.LocalSQL.ExecQuery(thisSQL)
		If Record.RowCount > 0 Then
			Dim Row As Int = 0
			
			Dim Initial As Boolean = True
			Dim GroupAdded As Int = 0
			For Row = 0 To Record.RowCount -1
				Record.Position = Row
				
				Dim Group As Boolean = False
				Dim SubGroup As Boolean = False
				'|||*********** APRESENTA DADOS AGRUPADOS POR CAPÍTULOS E POSIÇÃO
				Group = ((Record.GetInt("level")=0) And (Record.GetInt("item_type")<=1))
				'|||*********** Verifica dimensão do grupo
				If (Group) Then
					'|||*********** Cria Grupo
					'CLA_CHAPTER_V2_Item
					If Not(Initial) Then
						'|||*********** Adiciona capítulo/grupo à lista
						'|||*********** Leitura da lista deve ser carregada para o painel : InnerlistsTabPanelExec
						'clListView.Add(chapter, id)
						'idx = idx + 1
					Else
						Initial = False
					End If
				Else
					SubGroup = ((Record.GetInt("level")>0) And (Record.GetInt("item_type")=5))
					If (SubGroup) Then
						'|||*********** Cria SubGrupo
					Else
						'|||*********** Cria Item
					End If
				End If
				
'				Chr(0xF071) 'Alert Exclamation
'				Chr(0xF056)	'Critical
				
			Next
		End If
		Record.Close
	Else
		ActivityClose(True)
	End If
End Sub


' ==============================================================================================================================
'	SELECÇÃO DE ITEM DA CHECKLIST
' ==============================================================================================================================
Sub CLAItemsList_ItemClick (Index As Int, Value As Object)
	
End Sub

' ==============================================================================================================================
'	SELECÇÃO DE ITEM DO OBJECTO (MORADA/DADOS ADICIONAIS/CONTACTOS)
' ==============================================================================================================================
Sub OBJECTListView_ItemClick (Index As Int, Value As Object)
	
End Sub

' ==============================================================================================================================
'	SELECÇÃO DE NÃO CONFORMIDADES/OUTROS NA FINALIZAÇÃO DA CHECKLIST
' ==============================================================================================================================
Sub FINGroups_ItemClick (Index As Int, Value As Object)
	
End Sub

' ==============================================================================================================================
'	SELECÇÃO DE IMAGENS NA FINALIZAÇÃO DA CHECKLIST
' ==============================================================================================================================
Sub FINItemImages_ItemClick (Index As Int, Value As Object)
	
End Sub

' ==============================================================================================================================
'	OPERCAÇÕES DE CLICK NO TITULO
' ==============================================================================================================================
Sub CLATitlePanel_Click
	ChapterClick( Sender )
End Sub

Sub CLATitleLabel_Click
	ChapterClick( Sender )
End Sub

Sub CLATitleIconLabel_Click
	ChapterClick( Sender )
End Sub

Sub CLATitleExpandButton_Click
	ChapterClick( Sender )
End Sub

Sub CLATitleAddButton_Click
	' ESPECIFICO
End Sub

Sub ChapterClick(Sndr As Object)
	'Sndr
	Log(Sndr)
End Sub