B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	Type CLAItem(status_id As Int, request_tagcode As String, task_tagcode As String, inner_request_tagcode As String, item_tagcode As String, _
				unique_key As String, tagcode As String, execute_datetime As String, execute_longitude As String, execute_latitude As String)
				
	Type CLAHeader(status_id As Int, request_tagcode As String, relation_tagcode As String, execute_datetime As String, execute_longitude As String, _
				execute_latitude As String, execute_date As String, execute_enddate As String, execute_start As String, execute_end As String, _
				duration As Int, paused As Int)
				

'	Type CLAStatus(Status As Int, StartDate As String, Starttime As String, Endtime As String, Duration As String, Points As Double, Risk As Int, _
'			Result As Int, ResultDesc As String, HasImages As Boolean, HasActions As Boolean, HasSignatures As Boolean, _
'			ReportGenerated As Boolean, CanChange As Boolean)
'	Type CLAData(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, ReadOnly As Boolean, _
'			Composed As Boolean, StatusMaster As CLAStatus, StatusChild As CLAStatus)
End Sub

Sub MakeCLAItem(status_id As Int, request_tagcode As String, task_tagcode As String, inner_request_tagcode As String, item_tagcode As String, _
				unique_key As String, tagcode As String, execute_datetime As String, execute_longitude As String, execute_latitude As String) As CLAItem
	Dim ret As CLAItem
	ret.Initialize
	ret.status_id = status_id
	ret.request_tagcode = request_tagcode
	ret.task_tagcode = task_tagcode
	ret.inner_request_tagcode = inner_request_tagcode
	ret.item_tagcode = item_tagcode
	ret.unique_key = unique_key
	ret.tagcode = tagcode
	ret.execute_datetime = execute_datetime
	ret.execute_longitude = execute_longitude
	ret.execute_latitude = execute_latitude
	Return ret
End Sub