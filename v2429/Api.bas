B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Public API_RESULT_STATE As Boolean = False
	Private job_url As String
	Private job_funcReturn As String
	Private job_savelocal As Boolean
	Private job_target As Object
	Private job_params As Map
	Private job_data As String
	Private job_done_result As Int = 0
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub UpdateData2Server(params As Map, target As Object, url As String, funcReturn As String, savelocal As Boolean)
	Dim data As String
	job_url = url
	job_funcReturn = funcReturn
	job_savelocal = savelocal
	job_target = target
	job_params = params
	
	API_RESULT_STATE = False
	Try
		Dim JSON As JSONGenerator
		JSON.Initialize(params)
        
		data = JSON.ToPrettyString(1)
		job_data = data
		
		Dim JobD2S As HttpJob
		JobD2S.Initialize("JobD2S",target)

		Dim addr As String = url
		Log(data)
		JobD2S.PostString(addr, data )
		JobD2S.GetRequest.SetContentType("application/json")
	
		Wait For (JobD2S) JobDone(JobD2S As HttpJob)
		Log("API REPLY : " & JobD2S.GetString)
		If JobD2S.Success Then
			job_done_result = 1
			Log("API Reply:" & JobD2S.GetString)
			Dim Status As Int = Utils.JobAPIStatus(JobD2S)
			
			
			Log("**********************************")
			Log("	SUCESSO " & funcReturn )
			Log("**********************************")
			If Utils.NNE(funcReturn) Then
				Log("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR")
				Log(target)
				Log(funcReturn)
				Log(Status)
				Log("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR")
				CallSub2(target, funcReturn, Status)
			End If
		Else
			job_done_result = 1
			Log("API ERROR Reply:" & JobD2S.GetString)
			If (savelocal = True) Then
				Dim thisData As String = Utils.MapToJson(params)
				Dim theData As String = $"${data}, ${thisData}"$
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
				Utils.save2update(url, thisData, 0, WorkerND)
			End If
		End If
		JobD2S.Release
	Catch
		Dim theData As String = $"${LastException}, ${data}"$
		Log(theData)
		Utils.logError("JobD2S", ShareCode.SESS_OPER_User, theData)
		If (savelocal = True) Then
			Dim thisData As String = Utils.MapToJson(params)
			Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
			Utils.save2update(url, thisData, 0, WorkerND)
		End If
	End Try

End Sub

Sub JobDone (Job As HttpJob)
	
	If job_done_result = 0 Then
		If Job.Success Then
			Log("API Reply:" & Job.GetString)
			Dim Status As Int = Utils.JobAPIStatus(Job)
			
			
			Log("**********************************")
			Log("	SUCESSO " & job_funcReturn )
			Log("**********************************")
			If Utils.NNE(job_funcReturn) Then
				Log("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR")
				Log(job_target)
				Log(job_funcReturn)
				Log(Status)
				Log("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR")
				CallSub2(job_target, job_funcReturn, Status)
			End If
		Else
			Log("API ERROR Reply:" & Job.GetString)
			If (job_savelocal = True) Then
				Dim thisData As String = Utils.MapToJson(job_params)
				Dim theData As String = $"${job_data}, ${thisData}"$
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4,"","","")
				Utils.save2update(job_url, thisData, 0, WorkerND)
			End If
		End If
	End If
	
End Sub