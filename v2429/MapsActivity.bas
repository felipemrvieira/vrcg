B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Private MainMap As GoogleMap
	Private MainMapFragment As MapFragment
	Private BlockPanel As Panel
	Private ProgressBar As ProgressBar
	Private CurrentCLAItem As RequestCLAItem
	Private Latitude As String
	Private Longitude As String
	Private ColorTabPanel As Panel

	Private LabelLat As Label
	Private LabelLng As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("maps_layout")
	If MainMapFragment.IsGooglePlayServicesAvailable = False Then
		ToastMessageShow("Please install Google Play Services.", True)
	End If
	Utils.SetViewBackgroundColorToMainGradientColor(ColorTabPanel)
	

End Sub

Sub Activity_Resume
	Sleep(4000)
	InitMaps
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub MainMapFragment_Ready
	MainMap = MainMapFragment.GetMap
End Sub

Sub InitMaps
	
	Try
		If(MainMap.MyLocation.IsInitialized) Then
			Dim cp As CameraPosition
			cp.Initialize(Latitude, Longitude,15)
			MainMap.AddMarker(Latitude, Longitude, "Localizaçâo do registo")
			LabelLat.Text = Latitude
			LabelLng.Text = Longitude
			MainMap.MoveCamera(cp)
			Dim location As String = $"${MainMap.MyLocation.Latitude},${MainMap.MyLocation.Longitude}"$
			BlockPanel.Visible = False
			ProgressBar.Visible = False

		Else

		
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Public Sub StartMapsActivity(CLAItem As RequestCLAItem, Location As Map)
	CurrentCLAItem = CLAItem
	Latitude = Location.Get("latitude")
	Longitude = Location.Get("longitude")

End Sub

Sub mapBack_Click
	If ShareCode.CalledFromAlerts Then
		Activity.Finish
	Else
		CallSubDelayed2(CheckList3, "CamImage2", CurrentCLAItem)
		Activity.Finish
		ShareCode.FadeInFadeOutAnimation
	End If
	
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
'		CloseActivity
		mapBack_Click
	End If
	Return True
End Sub
