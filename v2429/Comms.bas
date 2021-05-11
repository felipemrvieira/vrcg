B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=9
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	Private nid As Int = 2
	Private lock As PhoneWakeState
	Private bigCounter As Int = 0
	Public AlreadyStarted As Boolean = False
End Sub

Sub Service_Create

End Sub

Sub Service_Start (StartingIntent As Intent)
	
	
	If Not(Starter.APP_RESET_INSTALL) And Not(Starter.APP_IN_EXECUTION)  Then
		'Service.StartForeground(nid, CreateNotification("VRCG Comm Check"))
		UpdateData
	End If
	Service.StopAutomaticForeground
	AlreadyStarted = True
	
	If Not(Starter.StopCommsCheck) Then
		StartServiceAt(Me, DateTime.Now + 10 * 1000, True)
		UpdateData
'		Log("Comms Check")
	End If
	
End Sub

Sub Service_Destroy
	Service.StopAutomaticForeground
End Sub

Public Sub UpdateData
	
	If Not((Starter.RunUpdate) Or (Starter.FirstInstall)) Then
		Try
			CheckWebAccess
		Catch
			Log(LastException)
		End Try
	End If

End Sub

Sub CheckWebAccess
	Dim startTime As Long = Utils.GetCurrentTicks
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/timming"$
	Dim Prams As Map
	Prams.Initialize
	Prams.Put("_first", Utils.Bool2Int(Starter.FirstInstall))
	Prams.Put("authorization", ShareCode.APP_Authorization)
	Prams.Put("_token", ShareCode.APP_TOKEN)
'	Log (ServerAddress)
'	Log(ShareCode.APP_Authorization)
'	Log(ShareCode.APP_TOKEN)
	Dim JSON As JSONGenerator
	JSON.Initialize(Prams)
	Dim data As String =   JSON.ToPrettyString(1)
	Starter.WEBISOK = False

		Try
			Dim res  As ResumableSub = TestTheServer(ServerAddress, data)
			Wait For(res) complete (finished As Boolean)
			If finished Then
				Dim endTime As Long = Utils.GetCurrentTicks
				
			If ShareCode.IntensiveWorkLoad Then
				Dim valRef As String = " / Ref = 5000"
				Starter.WEBISOK = ((endTime - startTime) < 5000)	
			Else
				Starter.WEBISOK = ((endTime - startTime) < 3500)
				Dim valRef As String = " / Ref = 3500"
			End If
			
'			Log($"Start: ${startTime}, End: ${endTime}, Diff: ${endTime - startTime} ${valRef}"$)
			
			Else
				Log("Erro de identificação do servidor")
			End If
		Catch
			Log(LastException)
		End Try
	
	ShareCode.APP_WORKING_LOCAL = Not(Starter.WEBISOK)

End Sub

Sub TestTheServer(ServerAddress As String, data As String) As ResumableSub
'	Log(ServerAddress)
'	Log(data)
	Try
		Dim Status As Int = 0
		Dim Job As HttpJob
		Job.Initialize("",Me)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Dim Status As Int = Utils.JobAPIStatus(Job)
		Else
			Log(Job.GetString)
			Log("OFFLINE")
		End If
		Job.Release
	Catch
		Log(LastException)
	End Try
	If Utils.NE(Status) Then Status = 0
	Return (Status >= 1)
End Sub

Sub IsOnline As ResumableSub
	'Requires Phone Library
	Dim p As Phone
	Dim Response, Error As StringBuilder
	Response.Initialize
	Error.Initialize
	Try
		'Ping Google DNS - if you can't reach this you are in serious trouble (or in China)!
		p.Shell("ping -q -c 1 -W 2 8.8.8.8",Null,Response,Error)
        
		If Error.ToString = "" Then
			
			If Response.ToString.Contains(" 100% packet loss") Then
				Log("Ping ran but no response " & Response.ToString)
				Return False
			Else If Response.ToString.Contains(" 0% packet loss") Then
				Log("Ping Google OK")
				Return True
			End If
			
		Else
			Return False
		End If
	Catch
		Log("Error pinging Google DNS: " & Error.ToString)
		Return False
	End Try
End Sub