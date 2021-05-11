package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class alerts_subs_0 {


public static RemoteObject  _actionsenddate_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("actionsEndDate_EnterPressed (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,398);
if (RapidSub.canDelegate("actionsenddate_enterpressed")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","actionsenddate_enterpressed");}
 BA.debugLineNum = 398;BA.debugLine="Sub actionsEndDate_EnterPressed";
Debug.ShouldStop(8192);
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actionsstartdate_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("actionsStartDate_EnterPressed (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,402);
if (RapidSub.canDelegate("actionsstartdate_enterpressed")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","actionsstartdate_enterpressed");}
 BA.debugLineNum = 402;BA.debugLine="Sub actionsStartDate_EnterPressed";
Debug.ShouldStop(131072);
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actionsviewtype_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("actionsViewType_SelectedIndexChanged (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,406);
if (RapidSub.canDelegate("actionsviewtype_selectedindexchanged")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","actionsviewtype_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 406;BA.debugLine="Sub actionsViewType_SelectedIndexChanged (Index As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 408;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,72);
if (RapidSub.canDelegate("activity_create")) { xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(xevolution.vrcg.devdemov2400.alerts parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.alerts parent;
RemoteObject _firsttime;
RemoteObject _totrecs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _numrecssystem = RemoteObject.createImmutable("");
RemoteObject _numrecstasks = RemoteObject.createImmutable("");
RemoteObject _numrecsrequests = RemoteObject.createImmutable("");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,72);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 74;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 75;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(1024);
parent._device.runVoidMethod ("SetScreenOrientation",alerts.processBA,(Object)(BA.numberCast(int.class, 1)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 77;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(4096);
parent._device.runVoidMethod ("SetScreenOrientation",alerts.processBA,(Object)(parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 79;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(16384);
parent.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = alerts.getObject();
 BA.debugLineNum = 82;BA.debugLine="Dim TotRecs As ResumableSub = GetAlertsTotalRecs";
Debug.ShouldStop(131072);
_totrecs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_totrecs = _getalertstotalrecs();Debug.locals.put("TotRecs", _totrecs);Debug.locals.put("TotRecs", _totrecs);
 BA.debugLineNum = 83;BA.debugLine="Wait for (TotRecs) complete (Finished As Boolean)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", alerts.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "alerts", "activity_create"), _totrecs);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finished", _finished);
;
 BA.debugLineNum = 85;BA.debugLine="Activity.LoadLayout(\"alertsLayout\")";
Debug.ShouldStop(1048576);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("alertsLayout")),alerts.mostCurrent.activityBA);
 BA.debugLineNum = 87;BA.debugLine="Dim NumRecsSystem As String = $\" (${ShareCode.Sys";
Debug.ShouldStop(4194304);
_numrecssystem = (RemoteObject.concat(RemoteObject.createImmutable(" ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._systemalertscount /*RemoteObject*/ ))),RemoteObject.createImmutable(")")));Debug.locals.put("NumRecsSystem", _numrecssystem);Debug.locals.put("NumRecsSystem", _numrecssystem);
 BA.debugLineNum = 88;BA.debugLine="Dim NumRecsTasks As String = $\" (${ShareCode.Task";
Debug.ShouldStop(8388608);
_numrecstasks = (RemoteObject.concat(RemoteObject.createImmutable(" ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._tasksalertscount /*RemoteObject*/ ))),RemoteObject.createImmutable(")")));Debug.locals.put("NumRecsTasks", _numrecstasks);Debug.locals.put("NumRecsTasks", _numrecstasks);
 BA.debugLineNum = 89;BA.debugLine="Dim NumRecsRequests As String = $\" (${ShareCode.R";
Debug.ShouldStop(16777216);
_numrecsrequests = (RemoteObject.concat(RemoteObject.createImmutable(" ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._requestsalertscount /*RemoteObject*/ ))),RemoteObject.createImmutable(")")));Debug.locals.put("NumRecsRequests", _numrecsrequests);Debug.locals.put("NumRecsRequests", _numrecsrequests);
 BA.debugLineNum = 91;BA.debugLine="listsTabPanel.LoadLayout(\"alerts_alertsview\", Sha";
Debug.ShouldStop(67108864);
parent.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("alerts_alertsview")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._alertschaptersistema /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numrecssystem))),RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 92;BA.debugLine="listsTabPanel.LoadLayout(\"alerts_tasksview\", Shar";
Debug.ShouldStop(134217728);
parent.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("alerts_tasksview")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._alertschaptertarefas /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numrecstasks))),RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 93;BA.debugLine="listsTabPanel.LoadLayout(\"alerts_actionsview\", Sh";
Debug.ShouldStop(268435456);
parent.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("alerts_actionsview")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._alertschapterinter /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numrecsrequests))),RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 96;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(alertsAle";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), parent.mostCurrent._alertsalertsviewpanel.getObject()));
 BA.debugLineNum = 97;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(alertsTas";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), parent.mostCurrent._alertstasksviewpanel.getObject()));
 BA.debugLineNum = 98;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(alertsAct";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), parent.mostCurrent._alertsactionsviewpanel.getObject()));
 BA.debugLineNum = 100;BA.debugLine="labeln.text = ShareCode.alertslabeln";
Debug.ShouldStop(8);
parent.mostCurrent._labeln.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeln /*RemoteObject*/ ));
 BA.debugLineNum = 101;BA.debugLine="LabelStatus.Text = ShareCode.alertsLabelStatus";
Debug.ShouldStop(16);
parent.mostCurrent._labelstatus.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabelstatus /*RemoteObject*/ ));
 BA.debugLineNum = 102;BA.debugLine="LabelDescricaoAlerta.Text = ShareCode.alertsLabel";
Debug.ShouldStop(32);
parent.mostCurrent._labeldescricaoalerta.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeldescricaoalerta /*RemoteObject*/ ));
 BA.debugLineNum = 103;BA.debugLine="TaskViewTypeObjectFilter.Text = ShareCode.alertsl";
Debug.ShouldStop(64);
parent.mostCurrent._taskviewtypeobjectfilter.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*RemoteObject*/ ));
 BA.debugLineNum = 104;BA.debugLine="AlertViewTypeObjectFilter.Text = ShareCode.alerts";
Debug.ShouldStop(128);
parent.mostCurrent._alertviewtypeobjectfilter.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*RemoteObject*/ ));
 BA.debugLineNum = 105;BA.debugLine="ActionViewTypeObjectFilter.Text = ShareCode.alert";
Debug.ShouldStop(256);
parent.mostCurrent._actionviewtypeobjectfilter.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*RemoteObject*/ ));
 BA.debugLineNum = 106;BA.debugLine="LabelTaskViewStatus.Text = ShareCode.alertsLabelS";
Debug.ShouldStop(512);
parent.mostCurrent._labeltaskviewstatus.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabelstatus /*RemoteObject*/ ));
 BA.debugLineNum = 107;BA.debugLine="LabelTaskViewDescricao.Text = ShareCode.alertsLab";
Debug.ShouldStop(1024);
parent.mostCurrent._labeltaskviewdescricao.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeldescricaoalerta /*RemoteObject*/ ));
 BA.debugLineNum = 108;BA.debugLine="LabelTaskViewlabeln.Text = ShareCode.alertslabeln";
Debug.ShouldStop(2048);
parent.mostCurrent._labeltaskviewlabeln.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeln /*RemoteObject*/ ));
 BA.debugLineNum = 109;BA.debugLine="LabelActionViewStatus.Text = ShareCode.alertsLabe";
Debug.ShouldStop(4096);
parent.mostCurrent._labelactionviewstatus.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabelstatus /*RemoteObject*/ ));
 BA.debugLineNum = 110;BA.debugLine="LabelActionViewDescricao.Text = ShareCode.alertsL";
Debug.ShouldStop(8192);
parent.mostCurrent._labelactionviewdescricao.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeldescricaoalerta /*RemoteObject*/ ));
 BA.debugLineNum = 111;BA.debugLine="labelActionViewn.text = ShareCode.alertslabeln";
Debug.ShouldStop(16384);
parent.mostCurrent._labelactionviewn.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeln /*RemoteObject*/ ));
 BA.debugLineNum = 113;BA.debugLine="recAlerts.Initialize(Activity, Array As CustomLis";
Debug.ShouldStop(65536);
parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_initialize" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,(Object)(parent.mostCurrent._activity),(Object)(RemoteObject.createNewArray("b4a.example3.customlistview",new int[] {3},new Object[] {parent.mostCurrent._listalerts,parent.mostCurrent._listtasks,parent.mostCurrent._listactions})));
 BA.debugLineNum = 114;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//for
this.state = 14;
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
group32 = parent.mostCurrent._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,(Object)(parent.mostCurrent._liststabpanel));
index32 = 0;
groupLen32 = group32.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("lbl", _lbl);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 14;
if (index32 < groupLen32) {
this.state = 9;
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group32.runMethod(false,"Get",index32));}
if (true) break;

case 17:
//C
this.state = 16;
index32++;
Debug.locals.put("lbl", _lbl);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 115;BA.debugLine="lbl.Width = 33.33%x";
Debug.ShouldStop(262144);
_lbl.runMethod(true,"setWidth",parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33.33)),alerts.mostCurrent.activityBA));
 BA.debugLineNum = 116;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(524288);
if (true) break;

case 10:
//if
this.state = 13;
if ((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 117;BA.debugLine="lbl.TextSize = 10.0";
Debug.ShouldStop(1048576);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 10.0));
 if (true) break;

case 13:
//C
this.state = 17;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 122;BA.debugLine="UpdateMainLayout";
Debug.ShouldStop(33554432);
_updatemainlayout();
 BA.debugLineNum = 123;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(67108864);
_windowstatusupdate();
 BA.debugLineNum = 124;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _finished) throws Exception{
}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,294);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 294;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, alerts.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 296;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(128);
_listsbuttonclose_click();
 };
 BA.debugLineNum = 298;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return alerts.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,291);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 291;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,288);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","activity_resume");}
 BA.debugLineNum = 288;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _alertmapbuttondismiss_click() throws Exception{
try {
		Debug.PushSubsStack("AlertMapButtonDismiss_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,465);
if (RapidSub.canDelegate("alertmapbuttondismiss_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","alertmapbuttondismiss_click");}
 BA.debugLineNum = 465;BA.debugLine="Sub AlertMapButtonDismiss_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 466;BA.debugLine="PanelMAP.Visible = False";
Debug.ShouldStop(131072);
alerts.mostCurrent._panelmap.runMethod(true,"setVisible",alerts.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _alertobjectselected(RemoteObject _currentselectedcode,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("AlertObjectSelected (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,461);
if (RapidSub.canDelegate("alertobjectselected")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","alertobjectselected", _currentselectedcode, _pnl);}
Debug.locals.put("CurrentSelectedCode", _currentselectedcode);
Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 461;BA.debugLine="Sub AlertObjectSelected(CurrentSelectedCode As Str";
Debug.ShouldStop(4096);
 BA.debugLineNum = 462;BA.debugLine="recAlerts.AlertObjectSelected(CurrentSelectedCode";
Debug.ShouldStop(8192);
alerts.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_alertobjectselected" /*RemoteObject*/ ,(Object)(_currentselectedcode),(Object)(_pnl));
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butactionsenddate_click() throws Exception{
try {
		Debug.PushSubsStack("butactionsEndDate_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,390);
if (RapidSub.canDelegate("butactionsenddate_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","butactionsenddate_click");}
 BA.debugLineNum = 390;BA.debugLine="Sub butactionsEndDate_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butactionsstartdate_click() throws Exception{
try {
		Debug.PushSubsStack("butactionsStartDate_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,394);
if (RapidSub.canDelegate("butactionsstartdate_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","butactionsstartdate_click");}
 BA.debugLineNum = 394;BA.debugLine="Sub butactionsStartDate_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butrequestaction_click() throws Exception{
try {
		Debug.PushSubsStack("butRequestAction_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,315);
if (RapidSub.canDelegate("butrequestaction_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","butrequestaction_click");}
 BA.debugLineNum = 315;BA.debugLine="Sub butRequestAction_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butrequestclosepanel_click() throws Exception{
try {
		Debug.PushSubsStack("butRequestClosePanel_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,331);
if (RapidSub.canDelegate("butrequestclosepanel_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","butrequestclosepanel_click");}
 BA.debugLineNum = 331;BA.debugLine="Sub butRequestClosePanel_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 337;BA.debugLine="panelRequestOptions.Visible = False";
Debug.ShouldStop(65536);
alerts.mostCurrent._panelrequestoptions.runMethod(true,"setVisible",alerts.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butrequestinfo_click() throws Exception{
try {
		Debug.PushSubsStack("butRequestInfo_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,326);
if (RapidSub.canDelegate("butrequestinfo_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","butrequestinfo_click");}
 BA.debugLineNum = 326;BA.debugLine="Sub butRequestInfo_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butrequestrun_click() throws Exception{
try {
		Debug.PushSubsStack("butRequestRun_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,321);
if (RapidSub.canDelegate("butrequestrun_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","butrequestrun_click");}
 BA.debugLineNum = 321;BA.debugLine="Sub butRequestRun_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonactionpause_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonActionPause_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,376);
if (RapidSub.canDelegate("buttonactionpause_click")) { xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","buttonactionpause_click"); return;}
ResumableSub_ButtonActionPause_Click rsub = new ResumableSub_ButtonActionPause_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonActionPause_Click extends BA.ResumableSub {
public ResumableSub_ButtonActionPause_Click(xevolution.vrcg.devdemov2400.alerts parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.alerts parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonActionPause_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,376);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 377;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 8;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 379;BA.debugLine="Msgbox2Async(ShareCode.AvisoPararPausa, ShareCod";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisopararpausa /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),alerts.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 380;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", alerts.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "alerts", "buttonactionpause_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 381;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(268435456);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 382;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(536870912);
parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 383;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
Debug.ShouldStop(1073741824);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ));
 BA.debugLineNum = 384;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 387;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(4);
_windowstatusupdate();
 BA.debugLineNum = 388;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _buttonuserunavailable_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUserUnavailable_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,368);
if (RapidSub.canDelegate("buttonuserunavailable_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","buttonuserunavailable_click");}
 BA.debugLineNum = 368;BA.debugLine="Sub ButtonUserUnavailable_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 370;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalertstotalrecs() throws Exception{
try {
		Debug.PushSubsStack("GetAlertsTotalRecs (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,128);
if (RapidSub.canDelegate("getalertstotalrecs")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","getalertstotalrecs");}
ResumableSub_GetAlertsTotalRecs rsub = new ResumableSub_GetAlertsTotalRecs(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetAlertsTotalRecs extends BA.ResumableSub {
public ResumableSub_GetAlertsTotalRecs(xevolution.vrcg.devdemov2400.alerts parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.alerts parent;
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _recordreqs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _recordsystem = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _recordtasks = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetAlertsTotalRecs (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,128);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 130;BA.debugLine="Dim SQL As String = $\"select ifnull(b.tagdesc,'')";
Debug.ShouldStop(2);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,\n"),RemoteObject.createImmutable("								ifnull(d.tagdesc,'') as urgency_desc, a.id, a.request_tagcode, a.repeatcounter, a.repeatitemcounter,\n"),RemoteObject.createImmutable("								a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.updated_at as actiondatetime,\n"),RemoteObject.createImmutable("								ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, ifnull(a.email_to, '') as email_to,\n"),RemoteObject.createImmutable("								ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,\n"),RemoteObject.createImmutable("								a.priority_tagcode,  ifnull(a.title,'') as title, a.gravity_tagcode,  a.due_date, b.tagcode as operation_type,\n"),RemoteObject.createImmutable("								a1.technical_tagcode, a1.sess_user, a2.inner_title, a3.title AS checklist\n"),RemoteObject.createImmutable("								from dta_actions as a \n"),RemoteObject.createImmutable("								INNER JOIN dta_requests AS a1 ON (a1.tagcode=a.request_tagcode)\n"),RemoteObject.createImmutable("								INNER JOIN dta_requests_relations AS a2 ON (a2.request_tagcode=a1.tagcode AND a2.relation_tagcode=a.action_tagcode)\n"),RemoteObject.createImmutable("								left JOIN dta_tasks AS a3 ON (a3.tagcode=a2.relation_tagcode)\n"),RemoteObject.createImmutable("								left join type_operationtypes as b ON (b.tagcode=(SELECT operation_type FROM dta_actions_items \n"),RemoteObject.createImmutable("									WHERE actions_tagcode=a.tagcode \n"),RemoteObject.createImmutable("									ORDER BY updated_at DESC LIMIT 1))\n"),RemoteObject.createImmutable("								left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)\n"),RemoteObject.createImmutable("								left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)\n"),RemoteObject.createImmutable("								where 1=1 and\n"),RemoteObject.createImmutable("								a.operation_type Not in ('TOPERT_04') and\n"),RemoteObject.createImmutable("								b.tagcode Not in ('TOPERT_04') and\n"),RemoteObject.createImmutable("								a.technical_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("'  \n"),RemoteObject.createImmutable("								order by a.request_tagcode, a.task_tagcode, a.id desc ")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 152;BA.debugLine="Private RecordReqs As Cursor = Starter.LocalSQLEV";
Debug.ShouldStop(8388608);
_recordreqs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_recordreqs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("RecordReqs", _recordreqs);
 BA.debugLineNum = 153;BA.debugLine="ShareCode.RequestsAlertsCount = RecordReqs.RowCou";
Debug.ShouldStop(16777216);
parent.mostCurrent._sharecode._requestsalertscount /*RemoteObject*/  = _recordreqs.runMethod(true,"getRowCount");
 BA.debugLineNum = 154;BA.debugLine="RecordReqs.Close";
Debug.ShouldStop(33554432);
_recordreqs.runVoidMethod ("Close");
 BA.debugLineNum = 157;BA.debugLine="Dim SQL As String = $\"select ifnull(tagcode,'') a";
Debug.ShouldStop(268435456);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(tagcode,'') as tagcode, ifnull(title,'') as title,\n"),RemoteObject.createImmutable("						ifnull(date_verification,'') as date_verification, status_id, kind_data, id,\n"),RemoteObject.createImmutable("	'' as obs, '' as imagename, alert_type from dta_alerts where 1=1\n"),RemoteObject.createImmutable("						 and alert_type = 'ALRTTYP_NOTIFY' and alert_visible=1 and active = 1\n"),RemoteObject.createImmutable("                         or alert_type = 'ALRTTYP_SMS' and alert_visible=1 and active = 1\n"),RemoteObject.createImmutable("						 or alert_type = 'ALRTTYP_ALERT' and alert_visible=1 and active = 1\n"),RemoteObject.createImmutable("                         or alert_type = 'ALRTTYP_EMAIL' and alert_visible=1 and active = 1")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 166;BA.debugLine="Private RecordSystem As Cursor = Starter.LocalSQL";
Debug.ShouldStop(32);
_recordsystem = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_recordsystem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("RecordSystem", _recordsystem);
 BA.debugLineNum = 167;BA.debugLine="ShareCode.SystemAlertsCount = RecordSystem.RowCou";
Debug.ShouldStop(64);
parent.mostCurrent._sharecode._systemalertscount /*RemoteObject*/  = _recordsystem.runMethod(true,"getRowCount");
 BA.debugLineNum = 168;BA.debugLine="RecordSystem.Close";
Debug.ShouldStop(128);
_recordsystem.runVoidMethod ("Close");
 BA.debugLineNum = 171;BA.debugLine="Dim SQL As String = $\"select distinct ifnull(a.ta";
Debug.ShouldStop(1024);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct ifnull(a.tagcode,'') as tagcode, ifnull(a.title,'') as title,\n"),RemoteObject.createImmutable("			ifnull(a.date_verification,'') as date_verification, a.status_id, a.kind_data, a.id,\n"),RemoteObject.createImmutable("			(select obs from dta_alerts_images where tagcode=a.tagcode) as obs,\n"),RemoteObject.createImmutable("			(select imagename from dta_alerts_images where tagcode=a.tagcode) as imagename,\n"),RemoteObject.createImmutable("			a.alert_type from dta_alerts as a\n"),RemoteObject.createImmutable("			where a.alert_visible=1 \n"),RemoteObject.createImmutable("				and a.user_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and a.alert_type != 'ALRTTYP_NOTIFY'\n"),RemoteObject.createImmutable("				and a.alert_type != 'ALRTTYP_EMAIL'\n"),RemoteObject.createImmutable("				and a.alert_type != 'ALRTTYP_SMS'\n"),RemoteObject.createImmutable("				and a.alert_type != 'ALRTTYP_ALERT'\n"),RemoteObject.createImmutable("				and a.active=1 \n"),RemoteObject.createImmutable("				and a.date_alert>='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_getlastweekdate" /*RemoteObject*/ ,alerts.mostCurrent.activityBA)))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 185;BA.debugLine="Private RecordTasks As Cursor = Starter.LocalSQLE";
Debug.ShouldStop(16777216);
_recordtasks = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_recordtasks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("RecordTasks", _recordtasks);
 BA.debugLineNum = 186;BA.debugLine="ShareCode.TasksAlertsCount = RecordTasks.RowCount";
Debug.ShouldStop(33554432);
parent.mostCurrent._sharecode._tasksalertscount /*RemoteObject*/  = _recordtasks.runMethod(true,"getRowCount");
 BA.debugLineNum = 187;BA.debugLine="RecordTasks.close";
Debug.ShouldStop(67108864);
_recordtasks.runVoidMethod ("Close");
 BA.debugLineNum = 194;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private listsTabPanel As TabStrip";
alerts.mostCurrent._liststabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 12;BA.debugLine="Private listsButtonClose As Button";
alerts.mostCurrent._listsbuttonclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private recAlerts As StructAlerts";
alerts.mostCurrent._recalerts = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.structalerts");
 //BA.debugLineNum = 14;BA.debugLine="Public listAlerts As CustomListView";
alerts.mostCurrent._listalerts = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 15;BA.debugLine="Public listTasks As CustomListView";
alerts.mostCurrent._listtasks = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 16;BA.debugLine="Public listActions As CustomListView";
alerts.mostCurrent._listactions = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 17;BA.debugLine="Private panelRequestOptions As Panel";
alerts.mostCurrent._panelrequestoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private butRequestInfo As Button";
alerts.mostCurrent._butrequestinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private butRequestRun As Button";
alerts.mostCurrent._butrequestrun = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private butRequestAction As Button";
alerts.mostCurrent._butrequestaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private butRequestClosePanel As Button";
alerts.mostCurrent._butrequestclosepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelVersion As Label";
alerts.mostCurrent._labelversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LabelDateTime As Label";
alerts.mostCurrent._labeldatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LabelCopyright As Label";
alerts.mostCurrent._labelcopyright = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonUserUnavailable As Button";
alerts.mostCurrent._buttonuserunavailable = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private GoogleMaps As GoogleMap";
alerts.mostCurrent._googlemaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private rp As RuntimePermissions";
alerts.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 29;BA.debugLine="Private Mapa_Alertas_fragment As MapFragment";
alerts.mostCurrent._mapa_alertas_fragment = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelMAP As Panel";
alerts.mostCurrent._panelmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private CurrentLineItemAL As Int = 0";
alerts._currentlineitemal = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 33;BA.debugLine="Private TotalLineItemsAL As Int = 0";
alerts._totallineitemsal = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 34;BA.debugLine="Private CurrentLineItemAC As Int = 0";
alerts._currentlineitemac = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 35;BA.debugLine="Private TotalLineItemsAC As Int = 0";
alerts._totallineitemsac = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 36;BA.debugLine="Private CurrentLineItemCL As Int = 0";
alerts._currentlineitemcl = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 37;BA.debugLine="Private TotalLineItemsCL As Int = 0";
alerts._totallineitemscl = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 38;BA.debugLine="Public CurrentTab As Int = 0";
alerts._currenttab = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 39;BA.debugLine="Private listsLabelInfo As Label";
alerts.mostCurrent._listslabelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private mainLabelOptLists As Label";
alerts.mostCurrent._mainlabeloptlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private mainLogo As ImageView";
alerts.mostCurrent._mainlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private ColorTabPanel As Panel";
alerts.mostCurrent._colortabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private ButtonActionPause As Button";
alerts.mostCurrent._buttonactionpause = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private ButtonAppNetwork As Button";
alerts.mostCurrent._buttonappnetwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private mainActiveUser As Label";
alerts.mostCurrent._mainactiveuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private alertsAlertsViewPanel As Panel";
alerts.mostCurrent._alertsalertsviewpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private alertsTasksViewPanel As Panel";
alerts.mostCurrent._alertstasksviewpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private alertsActionsViewPanel As Panel";
alerts.mostCurrent._alertsactionsviewpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private actionsViewType As B4XComboBox";
alerts.mostCurrent._actionsviewtype = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xcombobox");
 //BA.debugLineNum = 52;BA.debugLine="Private actionsStartDate As EditText";
alerts.mostCurrent._actionsstartdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private actionsEndDate As EditText";
alerts.mostCurrent._actionsenddate = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private butactionsStartDate As Button";
alerts.mostCurrent._butactionsstartdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private butactionsEndDate As Button";
alerts.mostCurrent._butactionsenddate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private labeln As Label";
alerts.mostCurrent._labeln = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private LabelStatus As Label";
alerts.mostCurrent._labelstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private LabelDescricaoAlerta As Label";
alerts.mostCurrent._labeldescricaoalerta = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private LabelTaskViewStatus As Label";
alerts.mostCurrent._labeltaskviewstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private LabelTaskViewDescricao As Label";
alerts.mostCurrent._labeltaskviewdescricao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private LabelTaskViewlabeln As Label";
alerts.mostCurrent._labeltaskviewlabeln = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private LabelActionViewStatus As Label";
alerts.mostCurrent._labelactionviewstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private LabelActionViewDescricao As Label";
alerts.mostCurrent._labelactionviewdescricao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private labelActionViewn As Label";
alerts.mostCurrent._labelactionviewn = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private TaskViewTypeObjectFilter As Label";
alerts.mostCurrent._taskviewtypeobjectfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private AlertViewTypeObjectFilter As Label";
alerts.mostCurrent._alertviewtypeobjectfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private ActionViewTypeObjectFilter As Label";
alerts.mostCurrent._actionviewtypeobjectfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private AlertMapButtonDismiss As Button";
alerts.mostCurrent._alertmapbuttondismiss = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private labelTitleAlertMap As Label";
alerts.mostCurrent._labeltitlealertmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listactions_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listActions_ItemClick (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,352);
if (RapidSub.canDelegate("listactions_itemclick")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","listactions_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 352;BA.debugLine="Sub listActions_ItemClick (Index As Int, Value As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="CurrentLineItemAC = Index+1";
Debug.ShouldStop(1);
alerts._currentlineitemac = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 354;BA.debugLine="recAlerts.ActionItemClick(Index, Value)";
Debug.ShouldStop(2);
alerts.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_actionitemclick" /*RemoteObject*/ ,(Object)(_index),(Object)(_value));
 BA.debugLineNum = 355;BA.debugLine="ListItemSelected( listActions.GetPanel(Index), li";
Debug.ShouldStop(4);
_listitemselected(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), alerts.mostCurrent._listactions.runMethod(false,"_getpanel",(Object)(_index)).getObject()),alerts.mostCurrent._listactions);
 BA.debugLineNum = 356;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listalerts_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listAlerts_ItemClick (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,340);
if (RapidSub.canDelegate("listalerts_itemclick")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","listalerts_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 340;BA.debugLine="Sub listAlerts_ItemClick (Index As Int, Value As O";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="CurrentLineItemAL = Index+1";
Debug.ShouldStop(1048576);
alerts._currentlineitemal = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 342;BA.debugLine="recAlerts.AlertItemClick(Index, Value)";
Debug.ShouldStop(2097152);
alerts.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_alertitemclick" /*RemoteObject*/ ,(Object)(_index),(Object)(_value));
 BA.debugLineNum = 343;BA.debugLine="ListItemSelected( listAlerts.GetPanel(Index), lis";
Debug.ShouldStop(4194304);
_listitemselected(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), alerts.mostCurrent._listalerts.runMethod(false,"_getpanel",(Object)(_index)).getObject()),alerts.mostCurrent._listalerts);
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemselected(RemoteObject _pan,RemoteObject _listview) throws Exception{
try {
		Debug.PushSubsStack("ListItemSelected (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,358);
if (RapidSub.canDelegate("listitemselected")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","listitemselected", _pan, _listview);}
int _index = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("pan", _pan);
Debug.locals.put("listview", _listview);
 BA.debugLineNum = 358;BA.debugLine="Sub ListItemSelected(pan As Panel, listview As Cus";
Debug.ShouldStop(32);
 BA.debugLineNum = 359;BA.debugLine="For index= 0 To listview.GetSize-1";
Debug.ShouldStop(64);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_listview.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_index = 0 ;
for (;(step1 > 0 && _index <= limit1) || (step1 < 0 && _index >= limit1) ;_index = ((int)(0 + _index + step1))  ) {
Debug.locals.put("index", _index);
 BA.debugLineNum = 360;BA.debugLine="Dim p As Panel = listview.GetPanel(index)";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _listview.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _index))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 361;BA.debugLine="p.Color = Consts.ColorWhite";
Debug.ShouldStop(256);
_p.runVoidMethod ("setColor",alerts.mostCurrent._consts._colorwhite /*RemoteObject*/ );
 }
}Debug.locals.put("index", _index);
;
 BA.debugLineNum = 363;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
Debug.ShouldStop(1024);
_pan.runVoidMethod ("setColor",alerts.mostCurrent._consts._colorciansoftlight /*RemoteObject*/ );
 BA.debugLineNum = 364;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(2048);
_windowstatusupdate();
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonclose_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonClose_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,308);
if (RapidSub.canDelegate("listsbuttonclose_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","listsbuttonclose_click");}
 BA.debugLineNum = 308;BA.debugLine="Sub listsButtonClose_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="Log(\"Back ALERTS\")";
Debug.ShouldStop(1048576);
alerts.mostCurrent.__c.runVoidMethod ("LogImpl","663307777",RemoteObject.createImmutable("Back ALERTS"),0);
 BA.debugLineNum = 310;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
Debug.ShouldStop(2097152);
alerts.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",alerts.processBA,(Object)((alerts.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturn")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 311;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
alerts.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 312;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(8388608);
alerts.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _liststabpanel_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,410);
if (RapidSub.canDelegate("liststabpanel_pageselected")) { xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","liststabpanel_pageselected", _position); return;}
ResumableSub_listsTabPanel_PageSelected rsub = new ResumableSub_listsTabPanel_PageSelected(null,_position);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_listsTabPanel_PageSelected extends BA.ResumableSub {
public ResumableSub_listsTabPanel_PageSelected(xevolution.vrcg.devdemov2400.alerts parent,RemoteObject _position) {
this.parent = parent;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.alerts parent;
RemoteObject _position;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,410);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
 BA.debugLineNum = 411;BA.debugLine="CurrentTab = Position+1";
Debug.ShouldStop(67108864);
parent._currenttab = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 412;BA.debugLine="Log(CurrentTab)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","664421890",BA.NumberToString(parent._currenttab),0);
 BA.debugLineNum = 413;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",alerts.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 414;BA.debugLine="Sleep(100)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",alerts.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "alerts", "liststabpanel_pageselected"),BA.numberCast(int.class, 100));
this.state = 21;
return;
case 21:
//C
this.state = 1;
;
 BA.debugLineNum = 415;BA.debugLine="If (CurrentTab = 1) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 1)))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 421;BA.debugLine="else If (CurrentTab = 2) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 2)))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 427;BA.debugLine="Else If (CurrentTab = 3) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 3)))) { 
this.state = 15;
}}}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 417;BA.debugLine="If (recAlerts.ListAlertsRecords = 0) Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_listalertsrecords" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 418;BA.debugLine="TotalLineItemsAL = recAlerts.StartAlerts(True)";
Debug.ShouldStop(2);
parent._totallineitemsal = parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_startalerts" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 419;BA.debugLine="Log( TotalLineItemsAL )";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","664421897",BA.NumberToString(parent._totallineitemsal),0);
 if (true) break;

case 7:
//C
this.state = 20;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 423;BA.debugLine="If (recAlerts.ListTaskRecords = 0) Then";
Debug.ShouldStop(64);
if (true) break;

case 10:
//if
this.state = 13;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_listtaskrecords" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 424;BA.debugLine="TotalLineItemsAC = recAlerts.StartTasks(True)";
Debug.ShouldStop(128);
parent._totallineitemsac = parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_starttasks" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 425;BA.debugLine="Log( TotalLineItemsAC )";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","664421903",BA.NumberToString(parent._totallineitemsac),0);
 if (true) break;

case 13:
//C
this.state = 20;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 429;BA.debugLine="If (recAlerts.ListActionRecords = 0) Then";
Debug.ShouldStop(4096);
if (true) break;

case 16:
//if
this.state = 19;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_listactionrecords" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 430;BA.debugLine="TotalLineItemsCL = recAlerts.StartActions(True)";
Debug.ShouldStop(8192);
parent._totallineitemscl = parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_startactions" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 431;BA.debugLine="Log( TotalLineItemsCL )";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","664421909",BA.NumberToString(parent._totallineitemscl),0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 435;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 438;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(2097152);
_windowstatusupdate();
 BA.debugLineNum = 440;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _liststabpanel_pageselected2(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected2 (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,442);
if (RapidSub.canDelegate("liststabpanel_pageselected2")) { xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","liststabpanel_pageselected2", _position); return;}
ResumableSub_listsTabPanel_PageSelected2 rsub = new ResumableSub_listsTabPanel_PageSelected2(null,_position);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_listsTabPanel_PageSelected2 extends BA.ResumableSub {
public ResumableSub_listsTabPanel_PageSelected2(xevolution.vrcg.devdemov2400.alerts parent,RemoteObject _position) {
this.parent = parent;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.alerts parent;
RemoteObject _position;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected2 (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,442);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
 BA.debugLineNum = 443;BA.debugLine="CurrentTab = Position+1";
Debug.ShouldStop(67108864);
parent._currenttab = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 444;BA.debugLine="Log(CurrentTab)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","664487426",BA.NumberToString(parent._currenttab),0);
 BA.debugLineNum = 445;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",alerts.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 446;BA.debugLine="Sleep(100)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",alerts.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "alerts", "liststabpanel_pageselected2"),BA.numberCast(int.class, 100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 447;BA.debugLine="If (CurrentTab = 1) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 8;
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 1)))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 449;BA.debugLine="else If (CurrentTab = 2) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 2)))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 451;BA.debugLine="Else If (CurrentTab = 3) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 3)))) { 
this.state = 7;
}}}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 448;BA.debugLine="TotalLineItemsAL = recAlerts.Startalerts(True)";
Debug.ShouldStop(-2147483648);
parent._totallineitemsal = parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_startalerts" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 450;BA.debugLine="TotalLineItemsAC = recAlerts.StartTasks(True)";
Debug.ShouldStop(2);
parent._totallineitemsac = parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_starttasks" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 452;BA.debugLine="TotalLineItemsCL = recAlerts.StartActions(True)";
Debug.ShouldStop(8);
parent._totallineitemscl = parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_startactions" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 454;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 457;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(256);
_windowstatusupdate();
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _listtasks_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listTasks_ItemClick (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,346);
if (RapidSub.canDelegate("listtasks_itemclick")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","listtasks_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 346;BA.debugLine="Sub listTasks_ItemClick (Index As Int, Value As Ob";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="CurrentLineItemCL = Index+1";
Debug.ShouldStop(67108864);
alerts._currentlineitemcl = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 348;BA.debugLine="recAlerts.TaskItemClick(Index, Value)";
Debug.ShouldStop(134217728);
alerts.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_taskitemclick" /*RemoteObject*/ ,(Object)(_index),(Object)(_value));
 BA.debugLineNum = 349;BA.debugLine="ListItemSelected( listTasks.GetPanel(Index), list";
Debug.ShouldStop(268435456);
_listitemselected(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), alerts.mostCurrent._listtasks.runMethod(false,"_getpanel",(Object)(_index)).getObject()),alerts.mostCurrent._listtasks);
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainlogo_click() throws Exception{
try {
		Debug.PushSubsStack("mainLogo_Click (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,372);
if (RapidSub.canDelegate("mainlogo_click")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","mainlogo_click");}
 BA.debugLineNum = 372;BA.debugLine="Sub mainLogo_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 373;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(1048576);
_listsbuttonclose_click();
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public Device As Phone";
alerts._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showalertmaps(RemoteObject _phototitle,RemoteObject _photocoordinates) throws Exception{
try {
		Debug.PushSubsStack("ShowAlertMaps (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,197);
if (RapidSub.canDelegate("showalertmaps")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","showalertmaps", _phototitle, _photocoordinates);}
RemoteObject _coordslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _photolat = RemoteObject.createImmutable("");
RemoteObject _photolon = RemoteObject.createImmutable("");
RemoteObject _location = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _currentclaitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
Debug.locals.put("PhotoTitle", _phototitle);
Debug.locals.put("PhotoCoordinates", _photocoordinates);
 BA.debugLineNum = 197;BA.debugLine="Sub ShowAlertMaps(PhotoTitle As String, PhotoCoord";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="labelTitleAlertMap.Text = PhotoTitle";
Debug.ShouldStop(64);
alerts.mostCurrent._labeltitlealertmap.runMethod(true,"setText",BA.ObjectToCharSequence(_phototitle));
 BA.debugLineNum = 201;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 202;BA.debugLine="If Utils.NNE(PhotoCoordinates) Or PhotoCoordinate";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(".",alerts.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,(Object)(_photocoordinates))) || RemoteObject.solveBoolean("!",_photocoordinates.runMethod(true,"trim"),BA.ObjectToString("/"))) { 
 BA.debugLineNum = 204;BA.debugLine="Dim CoordsList As List = Regex.Split(\"/\", Photo";
Debug.ShouldStop(2048);
_coordslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_coordslist = alerts.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(alerts.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(_photocoordinates))));Debug.locals.put("CoordsList", _coordslist);Debug.locals.put("CoordsList", _coordslist);
 BA.debugLineNum = 205;BA.debugLine="Dim PhotoLat As String = CoordsList.Get(0)";
Debug.ShouldStop(4096);
_photolat = BA.ObjectToString(_coordslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("PhotoLat", _photolat);Debug.locals.put("PhotoLat", _photolat);
 BA.debugLineNum = 206;BA.debugLine="Dim PhotoLon As String = CoordsList.Get(1)";
Debug.ShouldStop(8192);
_photolon = BA.ObjectToString(_coordslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("PhotoLon", _photolon);Debug.locals.put("PhotoLon", _photolon);
 }else {
 BA.debugLineNum = 208;BA.debugLine="Dim PhotoLat As String = GoogleMaps.MyLocation.";
Debug.ShouldStop(32768);
_photolat = BA.NumberToString(alerts.mostCurrent._googlemaps.runMethod(false,"getMyLocation").runMethod(true,"getLatitude"));Debug.locals.put("PhotoLat", _photolat);Debug.locals.put("PhotoLat", _photolat);
 BA.debugLineNum = 209;BA.debugLine="Dim PhotoLon As String = GoogleMaps.MyLocation.";
Debug.ShouldStop(65536);
_photolon = BA.NumberToString(alerts.mostCurrent._googlemaps.runMethod(false,"getMyLocation").runMethod(true,"getLongitude"));Debug.locals.put("PhotoLon", _photolon);Debug.locals.put("PhotoLon", _photolon);
 };
 BA.debugLineNum = 211;BA.debugLine="Dim location As Map";
Debug.ShouldStop(262144);
_location = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("location", _location);
 BA.debugLineNum = 212;BA.debugLine="location.Initialize";
Debug.ShouldStop(524288);
_location.runVoidMethod ("Initialize");
 BA.debugLineNum = 213;BA.debugLine="location.Put(\"latitude\", PhotoLat)";
Debug.ShouldStop(1048576);
_location.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("latitude"))),(Object)((_photolat)));
 BA.debugLineNum = 214;BA.debugLine="location.Put(\"longitude\", PhotoLon)";
Debug.ShouldStop(2097152);
_location.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("longitude"))),(Object)((_photolon)));
 BA.debugLineNum = 215;BA.debugLine="Dim CurrentCLAItem As RequestCLAItem";
Debug.ShouldStop(4194304);
_currentclaitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");Debug.locals.put("CurrentCLAItem", _currentclaitem);
 BA.debugLineNum = 216;BA.debugLine="ShareCode.CalledFromAlerts = True";
Debug.ShouldStop(8388608);
alerts.mostCurrent._sharecode._calledfromalerts /*RemoteObject*/  = alerts.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 217;BA.debugLine="CallSubDelayed3(MapsActivity, \"StartMapsActivity";
Debug.ShouldStop(16777216);
alerts.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",alerts.processBA,(Object)((alerts.mostCurrent._mapsactivity.getObject())),(Object)(BA.ObjectToString("StartMapsActivity")),(Object)((_currentclaitem)),(Object)((_location)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",alerts.processBA, e19.toString()); BA.debugLineNum = 219;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
alerts.mostCurrent.__c.runVoidMethod ("LogImpl","662849046",BA.ObjectToString(alerts.mostCurrent.__c.runMethod(false,"LastException",alerts.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _starttasksactivity(RemoteObject _filearg) throws Exception{
try {
		Debug.PushSubsStack("StartTasksActivity (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,301);
if (RapidSub.canDelegate("starttasksactivity")) { xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","starttasksactivity", _filearg); return;}
ResumableSub_StartTasksActivity rsub = new ResumableSub_StartTasksActivity(null,_filearg);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartTasksActivity extends BA.ResumableSub {
public ResumableSub_StartTasksActivity(xevolution.vrcg.devdemov2400.alerts parent,RemoteObject _filearg) {
this.parent = parent;
this._filearg = _filearg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.alerts parent;
RemoteObject _filearg;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartTasksActivity (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,301);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("FileArg", _filearg);
 BA.debugLineNum = 302;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",alerts.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )));
 BA.debugLineNum = 303;BA.debugLine="Sleep(500)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Sleep",alerts.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "alerts", "starttasksactivity"),BA.numberCast(int.class, 500));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 304;BA.debugLine="recAlerts.StartAlerts(False) 'StartTasks(False)";
Debug.ShouldStop(32768);
parent.mostCurrent._recalerts.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_startalerts" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 305;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _updatealertstext() throws Exception{
try {
		Debug.PushSubsStack("UpdateAlertsText (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,469);
if (RapidSub.canDelegate("updatealertstext")) { xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","updatealertstext"); return;}
ResumableSub_UpdateAlertsText rsub = new ResumableSub_UpdateAlertsText(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateAlertsText extends BA.ResumableSub {
public ResumableSub_UpdateAlertsText(xevolution.vrcg.devdemov2400.alerts parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.alerts parent;
RemoteObject _totrecs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _numrecssystem = RemoteObject.createImmutable("");
RemoteObject _numrecstasks = RemoteObject.createImmutable("");
RemoteObject _numrecsrequests = RemoteObject.createImmutable("");
RemoteObject _tse = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.tabstripviewpagerextendet");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateAlertsText (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,469);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 471;BA.debugLine="Dim TotRecs As ResumableSub = GetAlertsTotalRecs";
Debug.ShouldStop(4194304);
_totrecs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_totrecs = _getalertstotalrecs();Debug.locals.put("TotRecs", _totrecs);Debug.locals.put("TotRecs", _totrecs);
 BA.debugLineNum = 472;BA.debugLine="Wait for (TotRecs) complete (Finished As Boolean)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", alerts.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "alerts", "updatealertstext"), _totrecs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finished", _finished);
;
 BA.debugLineNum = 474;BA.debugLine="Dim NumRecsSystem As String = $\" (${ShareCode.Sys";
Debug.ShouldStop(33554432);
_numrecssystem = (RemoteObject.concat(RemoteObject.createImmutable(" ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._systemalertscount /*RemoteObject*/ ))),RemoteObject.createImmutable(")")));Debug.locals.put("NumRecsSystem", _numrecssystem);Debug.locals.put("NumRecsSystem", _numrecssystem);
 BA.debugLineNum = 475;BA.debugLine="Dim NumRecsTasks As String = $\" (${ShareCode.Task";
Debug.ShouldStop(67108864);
_numrecstasks = (RemoteObject.concat(RemoteObject.createImmutable(" ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._tasksalertscount /*RemoteObject*/ ))),RemoteObject.createImmutable(")")));Debug.locals.put("NumRecsTasks", _numrecstasks);Debug.locals.put("NumRecsTasks", _numrecstasks);
 BA.debugLineNum = 476;BA.debugLine="Dim NumRecsRequests As String = $\" (${ShareCode.R";
Debug.ShouldStop(134217728);
_numrecsrequests = (RemoteObject.concat(RemoteObject.createImmutable(" ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._requestsalertscount /*RemoteObject*/ ))),RemoteObject.createImmutable(")")));Debug.locals.put("NumRecsRequests", _numrecsrequests);Debug.locals.put("NumRecsRequests", _numrecsrequests);
 BA.debugLineNum = 478;BA.debugLine="Dim tse As TabStripViewPagerExtendet";
Debug.ShouldStop(536870912);
_tse = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.tabstripviewpagerextendet");Debug.locals.put("tse", _tse);
 BA.debugLineNum = 479;BA.debugLine="tse.Initialize";
Debug.ShouldStop(1073741824);
_tse.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_initialize" /*RemoteObject*/ ,alerts.processBA);
 BA.debugLineNum = 480;BA.debugLine="tse.ChangeTabText(listsTabPanel,ShareCode.alertsC";
Debug.ShouldStop(-2147483648);
_tse.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_changetabtext" /*RemoteObject*/ ,(Object)(parent.mostCurrent._liststabpanel),(Object)(RemoteObject.concat(parent.mostCurrent._sharecode._alertschaptersistema /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numrecssystem))),RemoteObject.createImmutable(""))))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 481;BA.debugLine="tse.ChangeTabText(listsTabPanel,ShareCode.alertsC";
Debug.ShouldStop(1);
_tse.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_changetabtext" /*RemoteObject*/ ,(Object)(parent.mostCurrent._liststabpanel),(Object)(RemoteObject.concat(parent.mostCurrent._sharecode._alertschaptertarefas /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numrecstasks))),RemoteObject.createImmutable(""))))),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 482;BA.debugLine="tse.ChangeTabText(listsTabPanel,ShareCode.alertsC";
Debug.ShouldStop(2);
_tse.runClassMethod (xevolution.vrcg.devdemov2400.tabstripviewpagerextendet.class, "_changetabtext" /*RemoteObject*/ ,(Object)(parent.mostCurrent._liststabpanel),(Object)(RemoteObject.concat(parent.mostCurrent._sharecode._alertschapterinter /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numrecsrequests))),RemoteObject.createImmutable(""))))),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 484;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _updatemainlayout() throws Exception{
try {
		Debug.PushSubsStack("UpdateMainLayout (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,226);
if (RapidSub.canDelegate("updatemainlayout")) { return xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","updatemainlayout");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 226;BA.debugLine="Sub UpdateMainLayout";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
Debug.ShouldStop(4);
alerts.mostCurrent._mainlabeloptlists.runMethod(true,"setTextColor",alerts.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 228;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(8);
if (alerts.mostCurrent.__c.runMethod(true,"Not",(Object)(alerts.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 229;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
Debug.ShouldStop(16);
alerts.mostCurrent._mainlogo.runMethod(true,"setGravity",alerts.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 230;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
Debug.ShouldStop(32);
alerts.mostCurrent._mainlogo.runMethod(true,"setWidth",alerts.mostCurrent._consts._logowidth /*RemoteObject*/ );
 };
 BA.debugLineNum = 232;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
Debug.ShouldStop(128);
alerts.mostCurrent.__c.runVoidMethod ("LogImpl","662914566",(RemoteObject.concat(RemoteObject.createImmutable("Inicialização de BMP: "),alerts.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((alerts.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 233;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
Debug.ShouldStop(256);
if ((alerts.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,(Object)(alerts.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 234;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
Debug.ShouldStop(512);
alerts.mostCurrent._mainlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((alerts.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,(Object)(alerts.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 };
 BA.debugLineNum = 237;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(4096);
alerts.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), alerts.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 239;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
Debug.ShouldStop(16384);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), alerts.mostCurrent._liststabpanel);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 240;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(32768);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 241;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndicatorColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(alerts.mostCurrent._consts._colormain /*RemoteObject*/ )})));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _windowstatusupdate() throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,244);
if (RapidSub.canDelegate("windowstatusupdate")) { xevolution.vrcg.devdemov2400.alerts.remoteMe.runUserSub(false, "alerts","windowstatusupdate"); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.alerts parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.alerts parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (alerts) ","alerts",11,alerts.mostCurrent.activityBA,alerts.mostCurrent,244);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 245;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,alerts.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 246;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StopService",alerts.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 247;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StopService",alerts.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 248;BA.debugLine="StopService(UserService)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StopService",alerts.processBA,(Object)((parent.mostCurrent._userservice.getObject())));
 BA.debugLineNum = 249;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StopService",alerts.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 250;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",alerts.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 251;BA.debugLine="Sleep(500)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",alerts.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "alerts", "windowstatusupdate"),BA.numberCast(int.class, 500));
this.state = 24;
return;
case 24:
//C
this.state = 4;
;
 BA.debugLineNum = 252;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 254;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(536870912);
parent.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 255;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
Debug.ShouldStop(1073741824);
parent.mostCurrent._labelcopyright.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/ ));
 BA.debugLineNum = 256;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._mainactiveuser.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ));
 BA.debugLineNum = 258;BA.debugLine="ButtonAppNetwork.Enabled = False";
Debug.ShouldStop(2);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 259;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
Debug.ShouldStop(4);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 260;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(8);
if (true) break;

case 5:
//if
this.state = 8;
if ((parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 261;BA.debugLine="ButtonAppNetwork.Enabled = True";
Debug.ShouldStop(16);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 262;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
Debug.ShouldStop(32);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 264;BA.debugLine="ButtonUserUnavailable.Enabled = False";
Debug.ShouldStop(128);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 265;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
Debug.ShouldStop(256);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 266;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
Debug.ShouldStop(512);
if (true) break;

case 9:
//if
this.state = 12;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._usr_state /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 267;BA.debugLine="ButtonUserUnavailable.Enabled = True";
Debug.ShouldStop(1024);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 268;BA.debugLine="ButtonUserUnavailable.TextColor = Colors.red";
Debug.ShouldStop(2048);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 271;BA.debugLine="ButtonActionPause.Enabled = False";
Debug.ShouldStop(16384);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 272;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
Debug.ShouldStop(32768);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 274;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 275;BA.debugLine="ButtonActionPause.Enabled = True";
Debug.ShouldStop(262144);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 276;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorRedOra";
Debug.ShouldStop(524288);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 278;BA.debugLine="If (CurrentTab = 0) Then";
Debug.ShouldStop(2097152);

case 16:
//if
this.state = 23;
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 0)))) { 
this.state = 18;
}else 
{ BA.debugLineNum = 280;BA.debugLine="Else If (CurrentTab = 1) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 1)))) { 
this.state = 20;
}else {
this.state = 22;
}}
if (true) break;

case 18:
//C
this.state = 23;
 BA.debugLineNum = 279;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemAL} / $";
Debug.ShouldStop(4194304);
parent.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._currentlineitemal))),RemoteObject.createImmutable(" / "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._totallineitemsal))),RemoteObject.createImmutable("")))));
 if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 281;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemAC} / $";
Debug.ShouldStop(16777216);
parent.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._currentlineitemac))),RemoteObject.createImmutable(" / "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._totallineitemsac))),RemoteObject.createImmutable("")))));
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 283;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemCL} / $";
Debug.ShouldStop(67108864);
parent.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._currentlineitemcl))),RemoteObject.createImmutable(" / "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._totallineitemscl))),RemoteObject.createImmutable("")))));
 if (true) break;

case 23:
//C
this.state = -1;
;
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}