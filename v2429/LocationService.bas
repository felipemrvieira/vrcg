B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=8.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public FusedLocationProvider1 As FusedLocationProvider
	Private LastLocation As Location
	Public GeoLocal As GeoData

End Sub

Sub Service_Create

End Sub

Sub Service_Start (StartingIntent As Intent)

	FusedLocationProvider1.Initialize("FusedLocationProvider1")
	If Not(Starter.APP_RESET_INSTALL) And Not(Starter.APP_IN_EXECUTION) And Not (Starter.RunUpdate)  Then
		FusedLocationProvider1.Connect
		GeoLocal.lat = "Null"
		GeoLocal.lon = "Null"
	End If
	
	If Not(Starter.StopLocationCheck) Then
		StartServiceAt(Me, DateTime.Now + 10 * 1000, True)
'		Log("LocationService")
		ShareCode.GlobalEventsTimer = ShareCode.GlobalEventsTimer +  10
'		Log("GlobalEventsTimer:" & ShareCode.GlobalEventsTimer)
		If ShareCode.GlobalEventsTimer >= 1800 Then ' 30 minutes
			ShareCode.GlobalEventsTimer = 0
			CallSub2(MainMenu,"MainPopMenuLoginChange_Click","")
'			Log("Logout Event")
		End If
		
	End If
	
End Sub

Sub Service_TaskRemoved

End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy
	FusedLocationProvider1.Disconnect
	Service.StopAutomaticForeground
End Sub

Sub FusedLocationProvider1_ConnectionFailed(ConnectionResult1 As Int)
	Select ConnectionResult1
		Case FusedLocationProvider1.ConnectionResult.NETWORK_ERROR
			FusedLocationProvider1.Connect
		Case Else
			'	TODO handle other errors
	End Select
End Sub

Sub FusedLocationProvider1_ConnectionSuccess
	If Not(Starter.APP_RESET_INSTALL) And Not(Starter.APP_IN_EXECUTION) Then
		Dim LocationRequest1 As LocationRequest
		LocationRequest1.Initialize
		LocationRequest1.SetInterval(30000)	'	1000 milliseconds
		LocationRequest1.SetPriority(LocationRequest1.Priority.PRIORITY_HIGH_ACCURACY)
		LocationRequest1.SetSmallestDisplacement(1)	'	1 meter
		Try
			FusedLocationProvider1.RequestLocationUpdates(LocationRequest1)
		Catch
			Log(LastException)
		End Try
	End If
End Sub

Sub FusedLocationProvider1_ConnectionSuspended(SuspendedCause1 As Int)
	Select SuspendedCause1
		Case FusedLocationProvider1.SuspendedCause.CAUSE_NETWORK_LOST
			'	TODO take action
		Case FusedLocationProvider1.SuspendedCause.CAUSE_SERVICE_DISCONNECTED
			'	TODO take action
	End Select
End Sub

Sub FusedLocationProvider1_LocationChanged(Location1 As Location)
	'Log("FusedLocationProvider1.LocationChanged")
	If Not(Starter.APP_RESET_INSTALL) Then
		If (Utils.NNE(Location1.Latitude) And Utils.NNE(Location1.Longitude)) Then
			LastLocation=Location1
		End If
		UpdateUI(Location1)
	End If 
End Sub

Sub UpdateUI(Location1 As Location)
	GeoLocal = Types.setGeoDataDT("-", "-", "")
	If Not(Starter.APP_RESET_INSTALL) Then
		DateTime.TimeFormat = "HH:mm:ss"
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim Data As String  = $"$date{DateTime.Now} $time{DateTime.Now}"$ ' ${LastLocation.Time}"$
		Dim lat As String = "-"
		Dim lon As String = "-"
		Try
			Dim lat As String = $"${Utils.IfNullOrEmpty(Location1.Latitude, "")}"$
			Dim lon As String = $"${Utils.IfNullOrEmpty(Location1.Longitude, "")}"$
		Catch
			Log(LastException)
		End Try
		GeoLocal = Types.setGeoDataDT(lat, lon, Data)
	End If
End Sub