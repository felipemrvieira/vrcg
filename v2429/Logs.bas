B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=9
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
#End Region

Sub Process_Globals
	Private nid As Int = 1
	Private GPS As GPS
	Private Tracking As Boolean
	Private LastUpdateTime As Long
	Private lock As PhoneWakeState
	Private bigCounter As Int = 0
End Sub

Sub Service_Create
	Service.AutomaticForegroundMode = Service.AUTOMATIC_FOREGROUND_NEVER 
	lock.PartialLock
End Sub

Sub Service_Start (StartingIntent As Intent)
	If Not(Starter.APP_RESET_INSTALL) And Not(Starter.APP_IN_EXECUTION)  Then
		StartServiceAt(Me, DateTime.Now + 600 * 1000, True)
		UpdateServer
	Else
		Service.StopAutomaticForeground
	End If
End Sub

Public Sub UpdateServer
	If Not(Starter.APP_RESET_INSTALL) And Not(Starter.APP_IN_EXECUTION)  Then
		Dim Job As HttpJob = Utils.CallJobAPI(ShareCode.APP_LogsUpload, Utils.Logs2Server, Me, "Logs")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Dim Status As Int = Utils.JobAPIStatus(Job)
			If Status = 1 Then
			Else
				'Log("Erro ao actualizar o Servidor")
			End If
		Else
			Log("Não foi possível actualizar o Servidor")
		End If
		Job.Release
	End If
End Sub
