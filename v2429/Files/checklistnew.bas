B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.8
@EndOfDesignText@
'CheckListNew

#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private PanelHeader As Panel
	Private ContentList As CustomListView
	Private RecordLineMandatory As Label
	Private RecordLineCritical As Label
	Private RecordLineInformation As Label
	Private RecordLineTitle As Label
	Private RecordLineMoreOptions As Button
	Private RecordLineB4XSButtonC As B4XStateButton
	Private RecordLineB4XSButtonNC As B4XStateButton
	Private RecordLineB4XSButtonNA As B4XStateButton
	Private RecordLineButLeft As Button
	Private RecordLineButAdd As Button
	Private RecordLineButLess As Button
	Private RecordLineTextRepeat As Label
	Private RecordLineButRight As Button
	Private RecordLineCollpseExpand As Button
	Private RecordLineRow As B4XListPanel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ChecklistNewLayout")
	'ChecklistRecordLineView
	'ChecklistRecordLineViewButtons
'	CreateRowsToList
End Sub

Sub CreateRowsToList
	RunThis
End Sub

Sub RunThis
	ProgressDialogShow2("Agurade sff ...", False)
	Sleep(100)
	Dim LOG_StartTime As Long = DateTime.Now
	Dim ChapterCount As Int = 0
	Dim SubChapterCount As Int = 0
	Dim ChapterCounter As Int = 1
	For n=0 To 600   '1000
		If (ChapterCount = 0) Then
			Dim RowRec As B4XView = CreateRowRecordChapter(n, $"${ChapterCounter}. Capítulo com o número : ${n}"$ )
			ContentList.Add(RowRec, n)
		End If
		If (SubChapterCount = 0) Then
			Dim RowRec As B4XView = CreateRowRecordSubChapter(n, $"${ChapterCounter}. ´Sub Capítulo com o número : ${SubChapterCount}"$ )
			ContentList.Add(RowRec, n)
		End If
		Dim RowRec As B4XView = CreateRowRecord(n, $"${ChapterCounter}.${ChapterCount}. Pergunta com o número : ${n}"$ )
		ContentList.Add(RowRec, n)
		ChapterCount = ChapterCount +1
		SubChapterCount = SubChapterCount +1
		If (ChapterCount = 50) Then
			ChapterCount = 0
			SubChapterCount = 0
			ChapterCounter = ChapterCounter +1
		End If
		
		If (SubChapterCount = 20) Then
			SubChapterCount = 0
		End If
		
	Next
	ProgressDialogHide
	Dim LOG_EndTime As Long = DateTime.Now
	Dim Descritivo As String = $"Duração : ${Utils.DTSBTWL(LOG_StartTime, LOG_EndTime)}"$
	Log( Descritivo )
	MsgboxAsync(Descritivo, "Informação")
End Sub

Sub CreateRowRecord(idx As Int, Title As String ) As B4XView
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, 85dip) 
	p.LoadLayout("ChecklistRecordLineViewButtons")
	p.RemoveView
'	
	RecordLineTitle.Text = Title
	RecordLineTitle.Tag = idx
	RecordLineMandatory.Tag = idx
	RecordLineCritical.Tag = idx
	RecordLineInformation.Tag = idx
	RecordLineMoreOptions.Tag = idx
	
	RecordLineB4XSButtonC.Text = "Conforme"
	RecordLineB4XSButtonNC.Text = "Não Conforme"
	RecordLineB4XSButtonNA.Text = "Não Aplicável"

	p.Tag = idx
	Return p
End Sub   

Sub CreateRowRecordChapter(idx As Int, Title As String ) As B4XView
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, 85dip)
	p.LoadLayout("ChecklistRecordLineViewChapter")
	p.RemoveView
'	
	RecordLineTitle.Text = Title
	RecordLineTitle.Tag = idx
	RecordLineInformation.Tag = idx
	RecordLineMoreOptions.Tag = idx

	p.Tag = idx
	Return p
End Sub

Sub CreateRowRecordSubChapter(idx As Int, Title As String ) As B4XView
	Dim p As Panel
	p.Initialize("CLALineClick")
	Activity.AddView(p, 0, 0, 100%x, 85dip) 
	p.LoadLayout("ChecklistRecordLineViewSubChapter")
	p.RemoveView
'	
	RecordLineTitle.Text = Title
	RecordLineTitle.Tag = idx
	RecordLineInformation.Tag = idx
	RecordLineMoreOptions.Tag = idx

	p.Tag = idx 
	Return p
End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub ContentList_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub ContentList_ItemLongClick (Index As Int, Value As Object)
	
End Sub

Sub ContentList_ReachEnd
	
End Sub

Sub ContentList_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
	
End Sub

Sub ContentList_ScrollChanged (Offset As Int)
	
End Sub

Sub PanelHeader_Click
	
End Sub

Sub PanelHeader_LongClick
	
End Sub

Sub RecordLineMoreOptions_Click
	
End Sub

Sub RecordLineTitle_Click
	
End Sub

Sub RecordLineInformation_Click
	
End Sub

Sub RecordLineCritical_Click
	
End Sub

Sub RecordLineMandatory_Click
	
End Sub

Sub RecordLineB4XSButton_StateClick (State As Int)
	MsgboxAsync("Clicou aqui!", "Alerta!")
End Sub

Sub RecordLineCollpseExpand_Click
	
End Sub

Sub RecordLineButRight_Click
	
End Sub

Sub RecordLineTextRepeat_Click
	
End Sub

Sub RecordLineButLess_Click
	
End Sub

Sub RecordLineButAdd_Click
	
End Sub

Sub RecordLineButLeft_Click
	
End Sub

Sub RecordLineRow_OnVisible (State As Int, ID As Int)
	
End Sub

Sub RecordLineRow_OnHide (State As Int, ID As Int)
	
End Sub