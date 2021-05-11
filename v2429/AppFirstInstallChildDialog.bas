B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9
@EndOfDesignText@
'AppFirstInstallChildDialog
Sub Class_Globals
	Private CurrentActivityObject As Object
	
	Private ApplDialog As CustomLayoutDialog
	Private DialogQuantityValue As FloatLabeledEditText
	Private ReturnQuantityValue As Int = 0
	Private ThisActivity As Activity
	Private ThisActivityName As Object
	
	Private CurrentCLD As CustomLayoutDialog
	Private dialogProgress As ProgressBar
	Private dialogMainText As Label
	Private CURRENT_COUNTER As Int = 0
	Private END_COUNTER As Int = 0
	Private TOTAL_END_COUNTER As Int = 0
	Private FILES_IN_FTP As Int = 0
	Private FTPFileList As List
	Private dialogPositions As Label
	Private CURRENT_Progress As ProgressBar
	Private CURRENT_Positions As Label
End Sub

Public Sub Initialize
	CURRENT_COUNTER = 0
	END_COUNTER = 0
	TOTAL_END_COUNTER = 0
	FILES_IN_FTP = 0
	'CheckFilesInFTP
End Sub

Sub DownloadDataTable(activName As Object, tablename As String, starting As Int, counter As Int, totalcounter As Int )
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync("", "", "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhiteSilverLight, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(200dip, 200dip)
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
'	DialogPanel.LoadLayout("dialog_downloadchildprogress")
'	
'	Log($"${tablename}  :  ${starting}/${totalcounter}"$)
	CURRENT_COUNTER = starting
	END_COUNTER = starting + counter
	TOTAL_END_COUNTER = totalcounter
'	dialogProgress.Progress = 0
'	dialogPositions.Text = $"${starting}/${totalcounter}"$
	
'	CURRENT_Progress = dialogProgress
'	CURRENT_Positions = dialogPositions
	
	DownloadStart(tablename, starting)

	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		'CallSub(activName, $"DownLoadReturn2"$)
	End If
End Sub


'===========================================================================================
' 	CRIA MAPEAMENTO DE CAMPOS PARAMETRO PARA EFECTUAR A CHAMADA DA API
'===========================================================================================
Sub MakeTableMaps(tablename As String, starting As Int) As String
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("tablename", tablename)
	params.Put("startcount", starting)
	params.Put("endcount", 100)
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
	Dim data As String =   JSON.ToPrettyString(1)
	Return data
End Sub


'===========================================================================================
' 	EFECTUA O DOWNLOAD DE DADOS
'===========================================================================================
Sub DownloadStart(tablename As String, starting As Int)
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/download/table/items"$
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Job.PostString(ServerAddress, MakeTableMaps(tablename, starting) )
	Job.GetRequest.SetContentType("application/json")
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			InsertUpdateTable(Job.GetString)
		Catch
'			Log(LastException)
			AddCounters
		End Try
	Else
'		Log(Job.ErrorMessage)
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
		AddCounters
	End If
	Job.Release
End Sub


'===========================================================================================
' 	GRAVA DADOS RECEBIDOS NAS TABELAS LOCAIS
'===========================================================================================
Sub InsertUpdateTable(datares As String)
	Dim parser As JSONParser
	parser.Initialize(datares)
	Dim root As Map = parser.NextObject
	Dim status As Int = root.Get("status")
	If (status = 1) Then
		Dim data As List = root.Get("data")
		For Each coldata As Map In data
			Dim table As String = coldata.Get("table")
			Dim rows As List = coldata.Get("rows")
			Dim IDList As List 
			IDList.Initialize
			DBUtils.InsertMaps2(Starter.LocalSQLEVC, table, rows, IDList)
'			Sleep(50)
			AddCounters
		Next
	Else
		AddCounters
	End If
End Sub


Sub AddCounters
	CURRENT_COUNTER = CURRENT_COUNTER + 1
'	CURRENT_Progress.Progress = CURRENT_Progress.Progress + 1
'	If CURRENT_Progress.Progress = 100 Then
'		CURRENT_Progress.Progress = 0
'	End If
'	
'	CURRENT_Positions.Text = $"${CURRENT_COUNTER}/${TOTAL_END_COUNTER}"$
'	Log($"Counter: $({CURRENT_COUNTER} of ${END_COUNTER}) of ${TOTAL_END_COUNTER}"$)
'				
	If (CURRENT_COUNTER >= END_COUNTER) Then
		CurrentCLD.CloseDialog(DialogResponse.POSITIVE)
	End If
End Sub

