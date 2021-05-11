B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.801
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub GetListfromServer As ResumableSub
	
		
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("name", Utils.RandomString)
	params.Put("datetime", Utils.GetCurrDatetime) ' data do dia actual
	params.Put("_user", ShareCode.SESS_User)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	params.Put("_user", ShareCode.SESS_User)
	

	Dim JSON As JSONGenerator
	JSON.Initialize(params)
	Dim data As String =   JSON.ToPrettyString(1)

	Log(data)
	
	'***********************************************************************************************************************************************************************
	'   A SER SUBSTITUIDO PELA NOVA CHAMADA AO SERVIDOR QUE VAI GERAR OS DADOS MESTRES E INTERVENCOES DO DIA, E SO OS CABECALHOS DOS 60 DIAS ANTERIORES E 7 DIAS A FRENTE
	'***********************************************************************************************************************************************************************
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/generate/requests-count-pending"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		Dim Job As HttpJob
		Job.Initialize("",DataUpdate)
		Job.PostString(ServerAddress, data)
		Job.GetRequest.SetContentType("application/json")
		Wait For (Job) JobDone(Job As HttpJob)
		If Job.Success Then
			Log("Success" & Job.GetString)
				
			Dim JSON1 As JSONParser
			JSON1.Initialize(Job.GetString)
			Dim MapJSON As Map = JSON1.NextObject
			Dim status As Int = MapJSON.Get("status")
			If (status = 1) Then
				Dim NewRecordsCount As Int = MapJSON.Get("results")
				If NewRecordsCount > 0 Then
					'LiteUpdateTagCodes = MapJSON.Get("requestTagcodes")
					Return True
				End If
				
			End If

		Else
			Log("Success" & Job.ErrorMessage)
		End If
		Job.Release
	Else
		Log("Error APP_WORKING_LOCAL")
		Return False
	End If
End Sub