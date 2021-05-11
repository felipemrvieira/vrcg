B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Private ApplActionDialog As CustomLayoutDialog
	Private CurrentCLD As CustomLayoutDialog
	Private xui As XUI
	Private ThisActivityName_TaskListDialog As Object
	
	Private A__CLA_Request As FloatLabeledEditText
	Private A__CLA_Action As FloatLabeledEditText
	Private A__CLA_Task As FloatLabeledEditText
	Private A__CLA_Item As FloatLabeledEditText
	Private A__CLA_UniqueKey As FloatLabeledEditText
	Private A__CLA_Tagcode As FloatLabeledEditText
	Private A__CLA_Value As FloatLabeledEditText
	Private A__CLA_Obs As FloatLabeledEditText
	Private A__CLA_ActionSub As FloatLabeledEditText
	Private A__CLA_Image As ImageView
	Private A__CLA_GetRequest As Label
	Private A__CLA_Confirm As B4XStateButton
	
	Private CurrentCLAItem As TestRequestItem
	
	Private ACLARequest As Int = 0
	Private ACLAAction As Int = 1
	Private ACLATask As Int = 2
	Private ACLAItem As Int = 3
	Private ACLAUniqueKey As Int = 4
	Private ACLATagcode As Int = 5
	Private ACLAValue As Int = 6
	Private ACLAObs As Int = 7
	Private ACLAActionSub As Int = 8
	Private ACLAImage As Int = 9
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

'MakeTestRequestItem(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, _
'				Value As String, Obs As String, ActionSub As String, Image As String) As TestRequestItem
Sub GetTestDialog(activ As Activity, activObj As Object, this As TestRequestItem, TabPos As Int)
	'Dim sf As Object = ApplActionDialog.ShowAsync(this.Title, ShareCode.Option_BACK, ShareCode.Option_SENDEMAIL, ShareCode.Option_MAKEALERT, Null, False)
	'TestRequestItem
	Dim sf As Object = ApplActionDialog.ShowAsync("Teste de request", ShareCode.Option_BACK, "", "", Null, False)
	Utils.SetDialogColors(sf, Consts.ColorSub, Consts.ColorMain, 2, 5)
	ApplActionDialog.SetSize(95%x, 95%y)
	Dim Base64Con As Base64Convert
	Private CurrentActivity As Activity
	
	ThisActivityName_TaskListDialog = activObj
	CurrentCLD = ApplActionDialog
	CurrentActivity = activ
	CurrentCLAItem = this
	
	Wait For (sf) Dialog_Ready(pnl As Panel)
	pnl.LoadLayout("__TESTE_CLA_SERVER")
	
	If Not(Utils.isNullOrEmpty(this.Request)) Then A__CLA_Request.text = this.Request
	If Not(Utils.isNullOrEmpty(this.Action)) Then A__CLA_Action.text = this.Action
	If Not(Utils.isNullOrEmpty(this.Task)) Then A__CLA_Task.text = this.Task
	If Not(Utils.isNullOrEmpty(this.Item)) Then A__CLA_Item.text = this.Item
	If Not(Utils.isNullOrEmpty(this.UniqueKey)) Then A__CLA_UniqueKey.text = this.UniqueKey
	If Not(Utils.isNullOrEmpty(this.Tagcode)) Then A__CLA_Tagcode.text = this.Tagcode
	If Not(Utils.isNullOrEmpty(this.Value)) Then A__CLA_Value.text = this.Value
	If Not(Utils.isNullOrEmpty(this.Obs)) Then A__CLA_Obs.text = this.Obs
	If Not(Utils.isNullOrEmpty(this.ActionSub)) Then A__CLA_ActionSub.text = this.ActionSub
	If Not(Utils.isNullOrEmpty(this.Image)) Then A__CLA_Image.SetBackgroundImage(Utils.B64ToBitmap(this.Image))
	'A__CLA_GetRequest.Text = ""

	Wait For (sf) Dialog_Result(res As Int)
	
	If res = DialogResponse.POSITIVE Then
		'
	Else If res = DialogResponse.NEGATIVE Then
		'
	End If
End Sub

Sub A__CLA_GetRequest_Click
	
End Sub

Sub ACLAImage_Click
	
End Sub

Sub ACLAConfirm_StateClick (State As Int)
	Dim this As B4XStateButton = Sender
	Dim pan As Panel = this.Parent
	Dim sACLARequest As FloatLabeledEditText = pan.GetView(ACLARequest)
	Dim sACLAAction As FloatLabeledEditText = pan.GetView(ACLAAction)
	Dim sACLATask As FloatLabeledEditText = pan.GetView(ACLATask)
	Dim sACLAItem As FloatLabeledEditText = pan.GetView(ACLAItem)
	Dim sACLAUniqueKey As FloatLabeledEditText = pan.GetView(ACLAUniqueKey)
	Dim sACLATagcode As FloatLabeledEditText = pan.GetView(ACLATagcode)
	Dim sACLAValue As FloatLabeledEditText = pan.GetView(ACLAValue)
	Dim sACLAObs As FloatLabeledEditText = pan.GetView(ACLAObs)
	Dim sACLAActionSub As FloatLabeledEditText = pan.GetView(ACLAActionSub)
	Dim sACLAImage As ImageView = pan.GetView(ACLAImage)
	
	Dim sACLADatetime As String = Utils.GetCurrDatetime
	Private sACLALatitude As String = ""
	Private sACLALongitude As String = ""
	If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lat)) Then sACLALatitude = LocationService.GeoLocal.lat
	If Not(Utils.isNullOrEmpty(LocationService.GeoLocal.lon)) Then sACLALongitude = LocationService.GeoLocal.lon

	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLARequest", sACLARequest.text)
	params.Put("ACLAAction", sACLAAction.text)
	params.Put("ACLATask", sACLATask.text)
	params.Put("ACLAItem", sACLAItem.text)
	params.Put("ACLAUniqueKey", sACLAUniqueKey.text)
	params.Put("ACLATagcode", sACLATagcode.text)
	params.Put("ACLAValue", sACLAValue.text)
	params.Put("ACLAObs", sACLAObs.text)
	params.Put("ACLAActionSub", sACLAActionSub.text)
	params.Put("ACLAImage", "") 'sACLAImage.text)
	params.Put("ACLADatetime", sACLADatetime)
	Try
		params.Put("ACLALatitude", sACLALatitude)
		params.Put("ACLALongitude", sACLALongitude)
	Catch
		params.Put("ACLALatitude", "")
		params.Put("ACLALongitude", "")
		Log(LastException)
	End Try
					
	Dim ACLSessUser As String = ShareCode.SESS_OPER_User
	Dim ACLClear As Int = 0
	params.Put("ACLSessUser", ACLSessUser)
	params.Put("ACLClear", ACLClear)
	
	Utils.CallApi(params, Me, $"https://${ShareCode.APP_DOMAIN}.vrcg.pt/api/orion/clai/update"$, "")
	Sleep(250)
	
	Dim TRI As TestRequestItem = Types.MakeTestRequestItem("I_2019_125544", "CHKLST_00001", "CHKLST_00001", "TSKSITM_0011", "39c83377-23f4-5810-9e15-b63fb4dfd5ec", "TSKSITM_00111", "1", "", "", "")
End Sub

