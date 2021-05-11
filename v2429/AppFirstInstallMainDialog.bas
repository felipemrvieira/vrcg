B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9
@EndOfDesignText@
'AppFirstInstallMainDialog
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
	Private FILES_IN_FTP As Int = 0
	Private FTPFileList As List
	Private dialogPositions As Label
	
	Private TableCountersList As List
End Sub

Public Sub Initialize
	CURRENT_COUNTER = 0
	END_COUNTER = 0
	FILES_IN_FTP = 0
	'CheckFilesInFTP
End Sub

Sub DownloadAllTables(activName As Object, title As String, textInfo As String )
	ThisActivityName = activName
	Dim sf As Object = ApplDialog.ShowAsync(title, "", "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorWhiteSilverLight, Consts.ColorGray, 3, 5)
	ApplDialog.SetSize(80%x, 200dip)
	CurrentCLD = ApplDialog 'sf
	Wait For Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialog_downloadmainprogress")
	TableCountersList.Initialize
	dialogMainText.Text = textInfo
	DownloadTableCounters
	Wait For (sf) Dialog_Result(res As Int)
	If res = DialogResponse.POSITIVE Then
		CallSub(activName, $"DownLoadUpdateReturn3"$)
	End If
End Sub

'Sub DownloadAllTables3(activName As Object, title As String, textInfo As String)
'	ThisActivityName = activName
'	Dim sf As Object = ApplDialog.ShowAsync(title, "", "", "", Null, False)
'	Utils.SetDialogColors(sf, Consts.ColorWhiteSilverLight, Consts.ColorGray, 3, 5)
'	ApplDialog.SetSize(80%x, 200dip)
'	CurrentCLD = ApplDialog 'sf
'	Wait For Dialog_Ready (DialogPanel As Panel)
'	DialogPanel.LoadLayout("dialog_downloadprogress")
'	dialogMainText.Text = textInfo
'	dialogProgress.Progress = 0
'	DownloadFilesWithFTP(dialogProgress, dialogPositions)
'	Wait For (sf) Dialog_Result(res As Int)
'	If res = DialogResponse.POSITIVE Then
'		CallSub(activName, "DownLoadReturn3")
'	End If
'	
'End Sub


'===========================================================================================
' 	CRIA MAPEAMENTO DE CAMPOS PARAMETRO PARA EFECTUAR A CHAMADA DA API
'===========================================================================================
Sub MakeTableMaps As String
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("authorization", ShareCode.APP_Authorization)
	params.Put("_token", ShareCode.APP_TOKEN)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
        
	Dim data As String =   JSON.ToPrettyString(1)
	Return data
End Sub


'===========================================================================================
' 	EFECTUA O VERIFICAÇÃO DE DADOS
'===========================================================================================
Sub DownloadTableCounters
	Dim ServerAddress As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/download/table/counts"$
	
	Dim Job As HttpJob
	Job.Initialize("",Me)
	Job.PostString(ServerAddress, MakeTableMaps)
	Job.GetRequest.SetContentType("application/json")
	
	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Try
			CallDownloadUpdateTables(Job.GetString)
		Catch
			Log(LastException)
		End Try
	Else
		Log(Job.ErrorMessage)
		Utils.logError("Download", ShareCode.SESS_User, Job.ErrorMessage)
	End If
	Job.Release
	
End Sub

'===========================================================================================
' 	VERIFICA TABELAS E CONTADORES
'===========================================================================================
Sub CallDownloadUpdateTables(datares As String)
	Log(datares)
	Dim parser As JSONParser
	parser.Initialize(datares)
	Dim root As Map = parser.NextObject
	'Dim message As String = root.Get("message")
	Dim status As Int = root.Get("status")
	If (status = 1) Then
		Dim data As List = root.Get("data")
		For Each coldata As Map In data
			Dim table As String = coldata.Get("table")
			Dim rows As Int = coldata.Get("rows")
			TableCountersList.Add(Types.MakeTableCounters(table, rows))
		Next
		
		If (TableCountersList.Size > 0) Then
			For n = 0 To TableCountersList.Size-1
				Dim retItem As TableCounters = TableCountersList.Get(n)
				Dim Total As Int = retItem.counter
				If (Total > 100) Then
					Dim StartCount As Int = 0
					Dim TotalPages As Int = Round(Total/100)
					For i = 0 To TotalPages-1
						Try
							Log($"${retItem.tablename}  :  ${StartCount}/${Total}"$)
							Dim Filter As AppFirstInstallChildDialog
							Filter.Initialize
							Filter.DownloadDataTable(Me, retItem.tablename, StartCount, 100, Total)
							StartCount = StartCount + 100
							'TableName, start, Count
						Catch
							'Log(LastException)
							Log($"${retItem.tablename}  :  ERROR (${StartCount}/${Total})"$)
						End Try
					Next
					
				Else
					Try
						Log($"${retItem.tablename}  :  ${StartCount}/${Total}"$)
						Dim Filter2 As AppFirstInstallChildAllDialog
						Filter2.Initialize
						Filter2.DownloadAllDataTable(Me, retItem.tablename, StartCount, Total)
						'TableName, start, Count
					Catch
						'Log(LastException)
						Log($"${retItem.tablename}  :  ERROR (${StartCount}/${Total})"$)
					End Try
				End If
				
			Next
		End If
	End If
End Sub
