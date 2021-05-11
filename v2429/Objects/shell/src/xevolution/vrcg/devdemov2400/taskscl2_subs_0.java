package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class taskscl2_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,73);
if (RapidSub.canDelegate("activity_create")) { xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","activity_create", _firsttime); return;}
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
public ResumableSub_Activity_Create(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _firsttime;
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,73);
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
parent._device.runVoidMethod ("SetScreenOrientation",taskscl2.processBA,(Object)(BA.numberCast(int.class, 1)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 77;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(4096);
parent._device.runVoidMethod ("SetScreenOrientation",taskscl2.processBA,(Object)(parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 80;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(32768);
parent.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = taskscl2.getObject();
 BA.debugLineNum = 81;BA.debugLine="Activity.LoadLayout(\"tasksLayout\")";
Debug.ShouldStop(65536);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("tasksLayout")),taskscl2.mostCurrent.activityBA);
 BA.debugLineNum = 82;BA.debugLine="listsTabPanel.LoadLayout(\"tasks_typerequests\", Sh";
Debug.ShouldStop(131072);
parent.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("tasks_typerequests")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tabgeneral_typerequeststitle /*RemoteObject*/ )));
 BA.debugLineNum = 83;BA.debugLine="listsTabPanel.LoadLayout(\"tasks_listview\", ShareC";
Debug.ShouldStop(262144);
parent.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("tasks_listview")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tab_tasks_procedures /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="tasksLabelStatus.text = ShareCode.objectObjLabelS";
Debug.ShouldStop(4194304);
parent.mostCurrent._taskslabelstatus.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectobjlabelstatus /*RemoteObject*/ ));
 BA.debugLineNum = 88;BA.debugLine="tasksLabelTitulo.text = ShareCode.tarefasLabelTit";
Debug.ShouldStop(8388608);
parent.mostCurrent._taskslabeltitulo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabeltitulos /*RemoteObject*/ ));
 BA.debugLineNum = 89;BA.debugLine="tasksLabelUltimoUpd.text = ShareCode.tarefasLabel";
Debug.ShouldStop(16777216);
parent.mostCurrent._taskslabelultimoupd.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabelultimoupd /*RemoteObject*/ ));
 BA.debugLineNum = 90;BA.debugLine="tasksLabelGrupo.text = ShareCode.checklistLabelGr";
Debug.ShouldStop(33554432);
parent.mostCurrent._taskslabelgrupo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._checklistlabelgrupo /*RemoteObject*/ ));
 BA.debugLineNum = 91;BA.debugLine="tasksLabelTResultado.text = ShareCode.tarefasLabe";
Debug.ShouldStop(67108864);
parent.mostCurrent._taskslabeltresultado.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabeltresultado /*RemoteObject*/ ));
 BA.debugLineNum = 92;BA.debugLine="taskslabelTypeObjectFilter.text = ShareCode.alert";
Debug.ShouldStop(134217728);
parent.mostCurrent._taskslabeltypeobjectfilter.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*RemoteObject*/ ));
 BA.debugLineNum = 95;BA.debugLine="taskLVLabelStatus.Text = ShareCode.objectObjLabel";
Debug.ShouldStop(1073741824);
parent.mostCurrent._tasklvlabelstatus.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectobjlabelstatus /*RemoteObject*/ ));
 BA.debugLineNum = 96;BA.debugLine="taskLVLabelStatusTitulo.Text = ShareCode.tarefasL";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._tasklvlabelstatustitulo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabeltitulos /*RemoteObject*/ ));
 BA.debugLineNum = 97;BA.debugLine="taskLVLabelUltimoUdp.Text = ShareCode.tarefasLabe";
Debug.ShouldStop(1);
parent.mostCurrent._tasklvlabelultimoudp.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabelultimoupd /*RemoteObject*/ ));
 BA.debugLineNum = 98;BA.debugLine="taskLVLabelGrupo.Text = ShareCode.checklistLabelG";
Debug.ShouldStop(2);
parent.mostCurrent._tasklvlabelgrupo.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._checklistlabelgrupo /*RemoteObject*/ ));
 BA.debugLineNum = 99;BA.debugLine="taskLVLabelTResultado.Text = ShareCode.tarefasLab";
Debug.ShouldStop(4);
parent.mostCurrent._tasklvlabeltresultado.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabeltresultado /*RemoteObject*/ ));
 BA.debugLineNum = 100;BA.debugLine="tasksLVlabelTypeObjectFilter.Text = ShareCode.ale";
Debug.ShouldStop(8);
parent.mostCurrent._taskslvlabeltypeobjectfilter.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*RemoteObject*/ ));
 BA.debugLineNum = 103;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
Debug.ShouldStop(64);
if (true) break;

case 7:
//for
this.state = 10;
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
group22 = parent.mostCurrent._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._liststabpanel));
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("lbl", _lbl);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if (index22 < groupLen22) {
this.state = 9;
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group22.runMethod(false,"Get",index22));}
if (true) break;

case 16:
//C
this.state = 15;
index22++;
Debug.locals.put("lbl", _lbl);
if (true) break;

case 9:
//C
this.state = 16;
 BA.debugLineNum = 104;BA.debugLine="lbl.Width = 50%x  '33.33%x";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setWidth",parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),taskscl2.mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 106;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_maketabpaneleffect" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._colortabpanel),(Object)(parent.mostCurrent._consts._colormaindarker /*RemoteObject*/ ),(Object)(parent.mostCurrent._consts._colorsub /*RemoteObject*/ ));
 BA.debugLineNum = 107;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(1024);
if (true) break;

case 11:
//if
this.state = 14;
if (_firsttime.<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 111;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 112;BA.debugLine="Sleep(100)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "activity_create"),BA.numberCast(int.class, 100));
this.state = 17;
return;
case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 113;BA.debugLine="UpdateMainLayout";
Debug.ShouldStop(65536);
_updatemainlayout();
 BA.debugLineNum = 114;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,122);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 122;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, taskscl2.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 124;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(134217728);
_listsbuttonclose_click();
 };
 BA.debugLineNum = 126;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return taskscl2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Pause (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,119);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 119;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,116);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","activity_resume");}
 BA.debugLineNum = 116;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actualizasvr_clai_update(RemoteObject _request,RemoteObject _task,RemoteObject _itemtc,RemoteObject _uk,RemoteObject _val2fill,RemoteObject _title,RemoteObject _objtc,RemoteObject _rc,RemoteObject _ric,RemoteObject _rfc) throws Exception{
try {
		Debug.PushSubsStack("ActualizaSvr_CLAI_Update (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2639);
if (RapidSub.canDelegate("actualizasvr_clai_update")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","actualizasvr_clai_update", _request, _task, _itemtc, _uk, _val2fill, _title, _objtc, _rc, _ric, _rfc);}
ResumableSub_ActualizaSvr_CLAI_Update rsub = new ResumableSub_ActualizaSvr_CLAI_Update(null,_request,_task,_itemtc,_uk,_val2fill,_title,_objtc,_rc,_ric,_rfc);
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
public static class ResumableSub_ActualizaSvr_CLAI_Update extends BA.ResumableSub {
public ResumableSub_ActualizaSvr_CLAI_Update(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _request,RemoteObject _task,RemoteObject _itemtc,RemoteObject _uk,RemoteObject _val2fill,RemoteObject _title,RemoteObject _objtc,RemoteObject _rc,RemoteObject _ric,RemoteObject _rfc) {
this.parent = parent;
this._request = _request;
this._task = _task;
this._itemtc = _itemtc;
this._uk = _uk;
this._val2fill = _val2fill;
this._title = _title;
this._objtc = _objtc;
this._rc = _rc;
this._ric = _ric;
this._rfc = _rfc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _request;
RemoteObject _task;
RemoteObject _itemtc;
RemoteObject _uk;
RemoteObject _val2fill;
RemoteObject _title;
RemoteObject _objtc;
RemoteObject _rc;
RemoteObject _ric;
RemoteObject _rfc;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _aclsessuser = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizaSvr_CLAI_Update (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2639);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("request", _request);
Debug.locals.put("task", _task);
Debug.locals.put("itemTC", _itemtc);
Debug.locals.put("UK", _uk);
Debug.locals.put("val2fill", _val2fill);
Debug.locals.put("title", _title);
Debug.locals.put("ObjTC", _objtc);
Debug.locals.put("rc", _rc);
Debug.locals.put("ric", _ric);
Debug.locals.put("rfc", _rfc);
 BA.debugLineNum = 2640;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32768);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2641;BA.debugLine="params.Initialize";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2642;BA.debugLine="params.Clear";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2643;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2644;BA.debugLine="params.Put(\"ACLARequest\", request.trim)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_request.runMethod(true,"trim"))));
 BA.debugLineNum = 2645;BA.debugLine="params.Put(\"ACLAAction\", task.Trim)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_task.runMethod(true,"trim"))));
 BA.debugLineNum = 2646;BA.debugLine="params.Put(\"ACLATask\", task.trim)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_task.runMethod(true,"trim"))));
 BA.debugLineNum = 2647;BA.debugLine="params.Put(\"ACLAItem\",itemTC)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_itemtc)));
 BA.debugLineNum = 2648;BA.debugLine="params.Put(\"ACLAUniqueKey\", UK)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_uk)));
 BA.debugLineNum = 2650;BA.debugLine="params.Put(\"ACLAObjectTag\", ObjTC)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObjectTag"))),(Object)((_objtc)));
 BA.debugLineNum = 2651;BA.debugLine="params.Put(\"ACLAValue\", val2fill)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValue"))),(Object)((_val2fill)));
 BA.debugLineNum = 2652;BA.debugLine="params.Put(\"ACLATitle\",title)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATitle"))),(Object)((_title)));
 BA.debugLineNum = 2653;BA.debugLine="params.Put(\"ACLAReqCounter\", rc)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_rc)));
 BA.debugLineNum = 2654;BA.debugLine="params.Put(\"ACLARepeatItem\", ric)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_ric)));
 BA.debugLineNum = 2655;BA.debugLine="params.Put(\"ACLARepeatField\", rfc)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((_rfc)));
 BA.debugLineNum = 2656;BA.debugLine="params.Put(\"ACLAInner\", 0)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAInner"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2658;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2659;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2660;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2661;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2662;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2663;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2664;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2665;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDateti";
Debug.ShouldStop(256);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 2666;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
Debug.ShouldStop(512);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 2667;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
Debug.ShouldStop(1024);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 2669;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 2670;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 2671;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 2672;BA.debugLine="Dim ACLSessUser As String = ShareCode.SESS_OPER_U";
Debug.ShouldStop(32768);
_aclsessuser = parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ;Debug.locals.put("ACLSessUser", _aclsessuser);Debug.locals.put("ACLSessUser", _aclsessuser);
 BA.debugLineNum = 2674;BA.debugLine="params.Put(\"ACLSessUser\", ACLSessUser)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLSessUser"))),(Object)((_aclsessuser)));
 BA.debugLineNum = 2675;BA.debugLine="params.Put(\"ACLClear\", 0)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLClear"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2677;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(1048576);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2678;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOA";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 12;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2679;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 2680;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", request.t";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(taskscl2.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_request.runMethod(true,"trim")));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2682;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(33554432);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_request.runMethod(true,"trim")),(Object)(_task.runMethod(true,"trim")),(Object)(_itemtc.runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2683;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 2685;BA.debugLine="Sleep(250)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "actualizasvr_clai_update"),BA.numberCast(int.class, 250));
this.state = 13;
return;
case 13:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2687;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(1073741824);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_request.runMethod(true,"trim")),(Object)(_task.runMethod(true,"trim")),(Object)(_itemtc.runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2688;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2691;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2693;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _butsearch_click() throws Exception{
try {
		Debug.PushSubsStack("butSearch_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,639);
if (RapidSub.canDelegate("butsearch_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","butsearch_click");}
 BA.debugLineNum = 639;BA.debugLine="Sub butSearch_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 640;BA.debugLine="MakeListSearch(EditSearch.Text)";
Debug.ShouldStop(-2147483648);
_makelistsearch(taskscl2.mostCurrent._editsearch.runMethod(true,"getText"));
 BA.debugLineNum = 641;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonactionpause_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonActionPause_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2199);
if (RapidSub.canDelegate("buttonactionpause_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","buttonactionpause_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2199;BA.debugLine="Sub ButtonActionPause_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 2200;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",taskscl2.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 2202;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
Debug.ShouldStop(33554432);
_i = taskscl2.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(taskscl2.mostCurrent._sharecode._avisopararpausa /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(taskscl2.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(taskscl2.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(taskscl2.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((taskscl2.mostCurrent.__c.getField(false,"Null"))),taskscl2.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 2203;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, taskscl2.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 2204;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(134217728);
taskscl2.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2205;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
Debug.ShouldStop(268435456);
taskscl2.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(taskscl2.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ));
 BA.debugLineNum = 2206;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(536870912);
taskscl2.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 2209;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(1);
_windowstatusupdate();
 BA.debugLineNum = 2210;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonuserunavailable_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUserUnavailable_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,631);
if (RapidSub.canDelegate("buttonuserunavailable_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","buttonuserunavailable_click");}
 BA.debugLineNum = 631;BA.debugLine="Sub ButtonUserUnavailable_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 633;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancelallfilters(RemoteObject _run) throws Exception{
try {
		Debug.PushSubsStack("CancelAllFilters (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,201);
if (RapidSub.canDelegate("cancelallfilters")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","cancelallfilters", _run);}
Debug.locals.put("run", _run);
 BA.debugLineNum = 201;BA.debugLine="Sub CancelAllFilters(run As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="IsFiltered  = False";
Debug.ShouldStop(512);
taskscl2._isfiltered = taskscl2.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 203;BA.debugLine="iDialogReqType = 0";
Debug.ShouldStop(1024);
taskscl2._idialogreqtype = BA.numberCast(int.class, 0);
 BA.debugLineNum = 204;BA.debugLine="iDialogReqStatus = 0";
Debug.ShouldStop(2048);
taskscl2._idialogreqstatus = BA.numberCast(int.class, 0);
 BA.debugLineNum = 205;BA.debugLine="iDialogReqUpdtated = 0";
Debug.ShouldStop(4096);
taskscl2._idialogrequpdtated = BA.numberCast(int.class, 0);
 BA.debugLineNum = 206;BA.debugLine="iDialogReqWithRequests = 0";
Debug.ShouldStop(8192);
taskscl2._idialogreqwithrequests = BA.numberCast(int.class, 0);
 BA.debugLineNum = 208;BA.debugLine="ShareCode.TaskTPRActive = True";
Debug.ShouldStop(32768);
taskscl2.mostCurrent._sharecode._tasktpractive /*RemoteObject*/  = taskscl2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 209;BA.debugLine="ShareCode.TaskTPRInactive = True";
Debug.ShouldStop(65536);
taskscl2.mostCurrent._sharecode._tasktprinactive /*RemoteObject*/  = taskscl2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 210;BA.debugLine="ShareCode.TaskTPRSingular = True";
Debug.ShouldStop(131072);
taskscl2.mostCurrent._sharecode._tasktprsingular /*RemoteObject*/  = taskscl2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 211;BA.debugLine="ShareCode.TaskTPRPlural = True";
Debug.ShouldStop(262144);
taskscl2.mostCurrent._sharecode._tasktprplural /*RemoteObject*/  = taskscl2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 213;BA.debugLine="StartTasksActivity(True, \"\", CurrentTab)";
Debug.ShouldStop(1048576);
_starttasksactivity(taskscl2.mostCurrent.__c.getField(true,"True"),BA.ObjectToString(""),taskscl2._currenttab);
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changemyposition() throws Exception{
try {
		Debug.PushSubsStack("ChangeMyPosition (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,584);
if (RapidSub.canDelegate("changemyposition")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","changemyposition");}
 BA.debugLineNum = 584;BA.debugLine="Public Sub ChangeMyPosition";
Debug.ShouldStop(128);
 BA.debugLineNum = 586;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checktyperequestnewtask(RemoteObject _request,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("CheckTypeRequestNewTask (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2358);
if (RapidSub.canDelegate("checktyperequestnewtask")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","checktyperequestnewtask", _request, _action);}
ResumableSub_CheckTypeRequestNewTask rsub = new ResumableSub_CheckTypeRequestNewTask(null,_request,_action);
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
public static class ResumableSub_CheckTypeRequestNewTask extends BA.ResumableSub {
public ResumableSub_CheckTypeRequestNewTask(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _request,RemoteObject _action) {
this.parent = parent;
this._request = _request;
this._action = _action;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _request;
RemoteObject _action;
RemoteObject _request_type = RemoteObject.createImmutable("");
RemoteObject _tr_is_model = RemoteObject.createImmutable(0);
RemoteObject _object_tagcode = RemoteObject.createImmutable("");
RemoteObject _object_group = RemoteObject.createImmutable("");
RemoteObject _tasktagcode = RemoteObject.createImmutable("");
RemoteObject _existchecklist = RemoteObject.createImmutable(0);
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newcounter = RemoteObject.createImmutable(0);
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _r1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckTypeRequestNewTask (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2358);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 2363;BA.debugLine="Dim request_type As String = DBStructures.GetScri";
Debug.ShouldStop(67108864);
_request_type = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(typerequest_tagcode, '') as valor\n"),RemoteObject.createImmutable("													from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("request_type", _request_type);Debug.locals.put("request_type", _request_type);
 BA.debugLineNum = 2365;BA.debugLine="Dim tr_is_model As Int = DBStructures.GetScriptCo";
Debug.ShouldStop(268435456);
_tr_is_model = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(tr_is_model, '0') as valor\n"),RemoteObject.createImmutable("													from dta_typerequests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_type.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("tr_is_model", _tr_is_model);Debug.locals.put("tr_is_model", _tr_is_model);
 BA.debugLineNum = 2368;BA.debugLine="Dim object_tagcode As String = DBStructures.GetSc";
Debug.ShouldStop(-2147483648);
_object_tagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(object_tagcode, '') as valor\n"),RemoteObject.createImmutable("													from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("object_tagcode", _object_tagcode);Debug.locals.put("object_tagcode", _object_tagcode);
 BA.debugLineNum = 2371;BA.debugLine="Dim object_group As String = DBStructures.GetScri";
Debug.ShouldStop(4);
_object_group = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(object_group, '') as valor\n"),RemoteObject.createImmutable("													from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("object_group", _object_group);Debug.locals.put("object_group", _object_group);
 BA.debugLineNum = 2374;BA.debugLine="If Utils.NNE(request_type) And Utils.NNE(object_t";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_request_type))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_object_tagcode))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_tr_is_model,BA.numberCast(double.class, 1))))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_object_group)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2376;BA.debugLine="Dim taskTagcode As String = DBStructures.GetScri";
Debug.ShouldStop(128);
_tasktagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select ifnull(tagcode, '') as valor\n"),RemoteObject.createImmutable("											from dta_tasks\n"),RemoteObject.createImmutable("											where task_type_mode='TTMT_03'\n"),RemoteObject.createImmutable("												And connect2data like '%'||(Select distinct i.object_type from dta_objects As i\n"),RemoteObject.createImmutable("													where i.tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("													And i.object_group in (\n"),RemoteObject.createImmutable("														Select tagcode from dta_objecttypes_groups \n"),RemoteObject.createImmutable("														where objtyp_tagcode=i.object_type\n"),RemoteObject.createImmutable("														And tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_group.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("													))||'%'\n"),RemoteObject.createImmutable("												And parent_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_group.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("												limit 1")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("taskTagcode", _tasktagcode);Debug.locals.put("taskTagcode", _tasktagcode);
 BA.debugLineNum = 2389;BA.debugLine="Dim ExistChecklist As Int = DBStructures.GetScri";
Debug.ShouldStop(1048576);
_existchecklist = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select count(relation_tagcode) As valor\n"),RemoteObject.createImmutable("						from dta_requests_relations where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_type.runMethod(true,"trim")))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tasktagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("ExistChecklist", _existchecklist);Debug.locals.put("ExistChecklist", _existchecklist);
 BA.debugLineNum = 2392;BA.debugLine="If (ExistChecklist = 0) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//if
this.state = 11;
if ((RemoteObject.solveBoolean("=",_existchecklist,BA.numberCast(double.class, 0)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2393;BA.debugLine="If Utils.NNE(taskTagcode) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_tasktagcode)).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2394;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(33554432);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 2395;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(67108864);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 2396;BA.debugLine="Dim NewCounter As Int = 0";
Debug.ShouldStop(134217728);
_newcounter = BA.numberCast(int.class, 0);Debug.locals.put("NewCounter", _newcounter);Debug.locals.put("NewCounter", _newcounter);
 BA.debugLineNum = 2398;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(536870912);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 2399;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeEx";
Debug.ShouldStop(1073741824);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 2401;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(1);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2402;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(2);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 2403;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 2404;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 2405;BA.debugLine="newExecution.Put(\"request_tagcode\", Request.tr";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_request.runMethod(true,"trim"))));
 BA.debugLineNum = 2406;BA.debugLine="newExecution.Put(\"relation_tagcode\", taskTagco";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tasktagcode)));
 BA.debugLineNum = 2407;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2408;BA.debugLine="newExecution.Put(\"position\", NewCounter+2)";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)((RemoteObject.solve(new RemoteObject[] {_newcounter,RemoteObject.createImmutable(2)}, "+",1, 1))));
 BA.debugLineNum = 2409;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2410;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2411;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2412;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2413;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2415;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 2416;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 2417;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 2418;BA.debugLine="newExecution.Put(\"repeatcounter\", NewCounter)";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_newcounter)));
 BA.debugLineNum = 2419;BA.debugLine="newExecution.Put(\"sess_user\", ShareCode.SESS_O";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sess_user"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 2420;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2421;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(1048576);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2422;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(2097152);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2423;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(4194304);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 2424;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
Debug.ShouldStop(8388608);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2426;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_request.runMethod(true,"trim")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2428;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(134217728);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2429;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
Debug.ShouldStop(268435456);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, \n"),RemoteObject.createImmutable("				task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"),RemoteObject.createImmutable("				select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"),RemoteObject.createImmutable("				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("				x.execute_value, x.execute_format_title,x.confirmed, x.changed_value, x.repeatcounter\n"),RemoteObject.createImmutable("				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"),RemoteObject.createImmutable("				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, a.position As relposition,\n"),RemoteObject.createImmutable("				'' as execute_value, Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("				0 as confirmed, '' as changed_value, "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newcounter))),RemoteObject.createImmutable(" AS repeatcounter\n"),RemoteObject.createImmutable("				from dta_requests_relations as a\n"),RemoteObject.createImmutable("				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("				where a.type_relation=0 and a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("' and a.relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tasktagcode))),RemoteObject.createImmutable("' and a.repeatcounter= "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newcounter))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("				) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2446;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185335896",_ssql,0);
 BA.debugLineNum = 2447;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions\",sSQL, Requ";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions")),(Object)(_ssql),(Object)(_request.runMethod(true,"trim")));
 BA.debugLineNum = 2451;BA.debugLine="Dim r1  As ResumableSub = UploadNewRequestRel2";
Debug.ShouldStop(262144);
_r1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r1 = _uploadnewrequestrel2server(_request.runMethod(true,"trim"),_tasktagcode,BA.NumberToString(_newcounter),_newrequestitem);Debug.locals.put("r1", _r1);Debug.locals.put("r1", _r1);
 BA.debugLineNum = 2452;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "checktyperequestnewtask"), _r1);
this.state = 13;
return;
case 13:
//C
this.state = 10;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 2458;BA.debugLine="Sleep(250)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "checktyperequestnewtask"),BA.numberCast(int.class, 250));
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2460;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2461;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _checktyperequestnewtask2(RemoteObject _request,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("CheckTypeRequestNewTask2 (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2463);
if (RapidSub.canDelegate("checktyperequestnewtask2")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","checktyperequestnewtask2", _request, _action);}
ResumableSub_CheckTypeRequestNewTask2 rsub = new ResumableSub_CheckTypeRequestNewTask2(null,_request,_action);
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
public static class ResumableSub_CheckTypeRequestNewTask2 extends BA.ResumableSub {
public ResumableSub_CheckTypeRequestNewTask2(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _request,RemoteObject _action) {
this.parent = parent;
this._request = _request;
this._action = _action;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _request;
RemoteObject _action;
RemoteObject _request_type = RemoteObject.createImmutable("");
RemoteObject _tr_is_model = RemoteObject.createImmutable(0);
RemoteObject _object_tagcode = RemoteObject.createImmutable("");
RemoteObject _object_group = RemoteObject.createImmutable("");
RemoteObject _objectdatevalue = RemoteObject.createImmutable("");
RemoteObject _dtval = RemoteObject.createImmutable(0L);
RemoteObject _dtnow = RemoteObject.createImmutable(0L);
RemoteObject _cancreatenewcl = RemoteObject.createImmutable(false);
RemoteObject _tasktagcode = RemoteObject.createImmutable("");
RemoteObject _existchecklist = RemoteObject.createImmutable(0);
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newcounter = RemoteObject.createImmutable(0);
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _r1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckTypeRequestNewTask2 (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2463);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 2468;BA.debugLine="Dim request_type As String = DBStructures.GetScri";
Debug.ShouldStop(8);
_request_type = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(typerequest_tagcode, '') as valor\n"),RemoteObject.createImmutable("													from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("request_type", _request_type);Debug.locals.put("request_type", _request_type);
 BA.debugLineNum = 2470;BA.debugLine="Dim tr_is_model As Int = DBStructures.GetScriptCo";
Debug.ShouldStop(32);
_tr_is_model = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(tr_is_model, '0') as valor\n"),RemoteObject.createImmutable("													from dta_typerequests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_type.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("tr_is_model", _tr_is_model);Debug.locals.put("tr_is_model", _tr_is_model);
 BA.debugLineNum = 2473;BA.debugLine="Dim object_tagcode As String = DBStructures.GetSc";
Debug.ShouldStop(256);
_object_tagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(object_tagcode, '') as valor\n"),RemoteObject.createImmutable("													from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("object_tagcode", _object_tagcode);Debug.locals.put("object_tagcode", _object_tagcode);
 BA.debugLineNum = 2476;BA.debugLine="Dim object_group As String = DBStructures.GetScri";
Debug.ShouldStop(2048);
_object_group = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(object_group, '') as valor\n"),RemoteObject.createImmutable("													from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("object_group", _object_group);Debug.locals.put("object_group", _object_group);
 BA.debugLineNum = 2479;BA.debugLine="Dim ObjectDateValue As String = DBStructures.GetS";
Debug.ShouldStop(16384);
_objectdatevalue = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(value, '') as valor\n"),RemoteObject.createImmutable("													from dta_objects_fields where object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("													and field_tagcode='FIELD_PROXIMA_VERIF'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("ObjectDateValue", _objectdatevalue);Debug.locals.put("ObjectDateValue", _objectdatevalue);
 BA.debugLineNum = 2484;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 2485;BA.debugLine="Dim DtVal As Long = DateTime.DateParse(ObjectDat";
Debug.ShouldStop(1048576);
_dtval = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_objectdatevalue));Debug.locals.put("DtVal", _dtval);Debug.locals.put("DtVal", _dtval);
 BA.debugLineNum = 2486;BA.debugLine="Dim DtNow As Long = DateTime.DateParse(Utils.Get";
Debug.ShouldStop(2097152);
_dtnow = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA)));Debug.locals.put("DtNow", _dtnow);Debug.locals.put("DtNow", _dtnow);
 BA.debugLineNum = 2487;BA.debugLine="Dim CanCreateNewCL As Boolean = Utils.NNE(Object";
Debug.ShouldStop(4194304);
_cancreatenewcl = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_objectdatevalue))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_dtnow,_dtval)))));Debug.locals.put("CanCreateNewCL", _cancreatenewcl);Debug.locals.put("CanCreateNewCL", _cancreatenewcl);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 2489;BA.debugLine="Dim CanCreateNewCL As Boolean = False";
Debug.ShouldStop(16777216);
_cancreatenewcl = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("CanCreateNewCL", _cancreatenewcl);Debug.locals.put("CanCreateNewCL", _cancreatenewcl);
 BA.debugLineNum = 2490;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185401371",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
 BA.debugLineNum = 2493;BA.debugLine="Dim CanCreateNewCL As Boolean = Utils.NNE(ObjectD";
Debug.ShouldStop(268435456);
_cancreatenewcl = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_objectdatevalue))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_dtnow,_dtval)))));Debug.locals.put("CanCreateNewCL", _cancreatenewcl);Debug.locals.put("CanCreateNewCL", _cancreatenewcl);
 BA.debugLineNum = 2495;BA.debugLine="If Utils.NNE(request_type) And Utils.NNE(object_t";
Debug.ShouldStop(1073741824);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_request_type))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_object_tagcode))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_tr_is_model,BA.numberCast(double.class, 1))))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_object_group))) && RemoteObject.solveBoolean(".",(_cancreatenewcl))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2497;BA.debugLine="Dim taskTagcode As String = DBStructures.GetScri";
Debug.ShouldStop(1);
_tasktagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select ifnull(tagcode, '') as valor\n"),RemoteObject.createImmutable("											from dta_tasks\n"),RemoteObject.createImmutable("											where task_type_mode='TTMT_04'\n"),RemoteObject.createImmutable("												And connect2data like '%'||(Select distinct i.object_type from dta_objects As i\n"),RemoteObject.createImmutable("													where i.tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("													And i.object_group in (\n"),RemoteObject.createImmutable("														Select tagcode from dta_objecttypes_groups \n"),RemoteObject.createImmutable("														where objtyp_tagcode=i.object_type\n"),RemoteObject.createImmutable("														And tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_group.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("													))||'%'\n"),RemoteObject.createImmutable("												And parent_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_group.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("												limit 1")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("taskTagcode", _tasktagcode);Debug.locals.put("taskTagcode", _tasktagcode);
 BA.debugLineNum = 2510;BA.debugLine="Dim ExistChecklist As Int = DBStructures.GetScri";
Debug.ShouldStop(8192);
_existchecklist = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select count(relation_tagcode) As valor\n"),RemoteObject.createImmutable("						from dta_requests_relations where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_type.runMethod(true,"trim")))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tasktagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("ExistChecklist", _existchecklist);Debug.locals.put("ExistChecklist", _existchecklist);
 BA.debugLineNum = 2513;BA.debugLine="If (ExistChecklist = 0) Then";
Debug.ShouldStop(65536);
if (true) break;

case 10:
//if
this.state = 17;
if ((RemoteObject.solveBoolean("=",_existchecklist,BA.numberCast(double.class, 0)))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2514;BA.debugLine="If Utils.NNE(taskTagcode) Then";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 16;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_tasktagcode)).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2515;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(262144);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 2516;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(524288);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 2517;BA.debugLine="Dim NewCounter As Int = 0";
Debug.ShouldStop(1048576);
_newcounter = BA.numberCast(int.class, 0);Debug.locals.put("NewCounter", _newcounter);Debug.locals.put("NewCounter", _newcounter);
 BA.debugLineNum = 2519;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(4194304);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 2520;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeEx";
Debug.ShouldStop(8388608);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 2522;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(33554432);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2523;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(67108864);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 2524;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 2525;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 2526;BA.debugLine="newExecution.Put(\"request_tagcode\", Request.tr";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_request.runMethod(true,"trim"))));
 BA.debugLineNum = 2527;BA.debugLine="newExecution.Put(\"relation_tagcode\", taskTagco";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tasktagcode)));
 BA.debugLineNum = 2528;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2529;BA.debugLine="newExecution.Put(\"position\", NewCounter+2)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)((RemoteObject.solve(new RemoteObject[] {_newcounter,RemoteObject.createImmutable(2)}, "+",1, 1))));
 BA.debugLineNum = 2530;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2531;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2532;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2533;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2534;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2536;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 2537;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 2538;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 2539;BA.debugLine="newExecution.Put(\"repeatcounter\", NewCounter)";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_newcounter)));
 BA.debugLineNum = 2540;BA.debugLine="newExecution.Put(\"sess_user\", ShareCode.SESS_O";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sess_user"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 2541;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2542;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(8192);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2543;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(16384);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2544;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(32768);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 2545;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
Debug.ShouldStop(65536);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2547;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0";
Debug.ShouldStop(262144);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_request.runMethod(true,"trim")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2549;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(1048576);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2550;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
Debug.ShouldStop(2097152);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("					tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"),RemoteObject.createImmutable("					select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"),RemoteObject.createImmutable("					x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter\n"),RemoteObject.createImmutable("					from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"),RemoteObject.createImmutable("					c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, \n"),RemoteObject.createImmutable("					a.position As relposition, '' as execute_value, \n"),RemoteObject.createImmutable("					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("					0 as confirmed, '' as changed_value, "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newcounter))),RemoteObject.createImmutable(" AS repeatcounter\n"),RemoteObject.createImmutable("					from dta_requests_relations as a\n"),RemoteObject.createImmutable("					inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("					inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("					left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("					where a.type_relation=0 and a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("' and a.relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tasktagcode))),RemoteObject.createImmutable("' and a.repeatcounter= "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newcounter))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("					) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2567;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185401448",_ssql,0);
 BA.debugLineNum = 2568;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions\",sSQL, Requ";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("butCallActions")),(Object)(_ssql),(Object)(_request.runMethod(true,"trim")));
 BA.debugLineNum = 2572;BA.debugLine="Dim r1  As ResumableSub = UploadNewRequestRel2";
Debug.ShouldStop(2048);
_r1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r1 = _uploadnewrequestrel2server(_request.runMethod(true,"trim"),_tasktagcode,BA.NumberToString(_newcounter),_newrequestitem);Debug.locals.put("r1", _r1);Debug.locals.put("r1", _r1);
 BA.debugLineNum = 2573;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "checktyperequestnewtask2"), _r1);
this.state = 19;
return;
case 19:
//C
this.state = 16;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 2578;BA.debugLine="Sleep(250)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "checktyperequestnewtask2"),BA.numberCast(int.class, 250));
this.state = 20;
return;
case 20:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 2581;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2582;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",taskscl2.processBA, e0.toString());}
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
public static RemoteObject  _checktyperequesttaskadds(RemoteObject _request,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("CheckTypeRequestTaskAdds (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2213);
if (RapidSub.canDelegate("checktyperequesttaskadds")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","checktyperequesttaskadds", _request, _action);}
ResumableSub_CheckTypeRequestTaskAdds rsub = new ResumableSub_CheckTypeRequestTaskAdds(null,_request,_action);
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
public static class ResumableSub_CheckTypeRequestTaskAdds extends BA.ResumableSub {
public ResumableSub_CheckTypeRequestTaskAdds(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _request,RemoteObject _action) {
this.parent = parent;
this._request = _request;
this._action = _action;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _request;
RemoteObject _action;
RemoteObject _request_type = RemoteObject.createImmutable("");
RemoteObject _object_tagcode = RemoteObject.createImmutable("");
RemoteObject _questparams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _update_object_fields = RemoteObject.createImmutable(0);
RemoteObject _updobjfls_settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colupdobjfls_settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _field_name = RemoteObject.createImmutable("");
RemoteObject _is_additional = RemoteObject.createImmutable(0);
RemoteObject _is_address = RemoteObject.createImmutable(0);
RemoteObject _updcndvalue = RemoteObject.createImmutable("");
RemoteObject _update_value_type = RemoteObject.createImmutable(0);
RemoteObject _script = RemoteObject.createImmutable("");
RemoteObject _external_tagcode = RemoteObject.createImmutable("");
RemoteObject _is_contact = RemoteObject.createImmutable(0);
RemoteObject _continuarupdt = RemoteObject.createImmutable(false);
RemoteObject _updtvalue = RemoteObject.createImmutable("");
RemoteObject _tempvalue = RemoteObject.createImmutable("");
RemoteObject _itempvalue = RemoteObject.createImmutable(0);
RemoteObject _updsqlrec = RemoteObject.createImmutable("");
RemoteObject _updateserver = RemoteObject.createImmutable(false);
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckTypeRequestTaskAdds (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2213);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 2218;BA.debugLine="Dim request_type As String = DBStructures.GetScri";
Debug.ShouldStop(512);
_request_type = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(typerequest_tagcode, '') as valor\n"),RemoteObject.createImmutable("													from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("request_type", _request_type);Debug.locals.put("request_type", _request_type);
 BA.debugLineNum = 2220;BA.debugLine="Dim object_tagcode As String = DBStructures.GetSc";
Debug.ShouldStop(2048);
_object_tagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(object_tagcode, '') as valor\n"),RemoteObject.createImmutable("													from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("object_tagcode", _object_tagcode);Debug.locals.put("object_tagcode", _object_tagcode);
 BA.debugLineNum = 2222;BA.debugLine="If Utils.NNE(request_type) And Utils.NNE(object_t";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 80;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_request_type))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_object_tagcode)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2223;BA.debugLine="Dim QuestParams As Map = DBStructures.GetScriptC";
Debug.ShouldStop(16384);
_questparams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_questparams = parent.mostCurrent._dbstructures.runMethod(false,"_getscriptcolumnstrevcjsonmap" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select distinct paramters \n"),RemoteObject.createImmutable("												from dta_typerequests_tasks_adds where 1=1\n"),RemoteObject.createImmutable("												And typerequest_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_type.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("												And task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_action.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("paramters")));Debug.locals.put("QuestParams", _questparams);Debug.locals.put("QuestParams", _questparams);
 BA.debugLineNum = 2228;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 2229;BA.debugLine="Dim update_object_fields As Int = QuestParams.G";
Debug.ShouldStop(1048576);
_update_object_fields = BA.numberCast(int.class, _questparams.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("update_object_fields")))));Debug.locals.put("update_object_fields", _update_object_fields);Debug.locals.put("update_object_fields", _update_object_fields);
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 2231;BA.debugLine="Dim update_object_fields As Int = 0";
Debug.ShouldStop(4194304);
_update_object_fields = BA.numberCast(int.class, 0);Debug.locals.put("update_object_fields", _update_object_fields);Debug.locals.put("update_object_fields", _update_object_fields);
 BA.debugLineNum = 2232;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185270291",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2235;BA.debugLine="If Utils.Int2Bool(update_object_fields) Then";
Debug.ShouldStop(67108864);

case 9:
//if
this.state = 79;
this.catchState = 0;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_update_object_fields)).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2236;BA.debugLine="Dim updobjfls_settings As List = QuestParams.Ge";
Debug.ShouldStop(134217728);
_updobjfls_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_updobjfls_settings = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _questparams.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updobjfls_settings")))));Debug.locals.put("updobjfls_settings", _updobjfls_settings);
 BA.debugLineNum = 2237;BA.debugLine="For Each colupdobjfls_settings As Map In updobj";
Debug.ShouldStop(268435456);
if (true) break;

case 12:
//for
this.state = 78;
_colupdobjfls_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group13 = _updobjfls_settings;
index13 = 0;
groupLen13 = group13.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colupdobjfls_settings", _colupdobjfls_settings);
this.state = 81;
if (true) break;

case 81:
//C
this.state = 78;
if (index13 < groupLen13) {
this.state = 14;
_colupdobjfls_settings = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group13.runMethod(false,"Get",index13));}
if (true) break;

case 82:
//C
this.state = 81;
index13++;
Debug.locals.put("colupdobjfls_settings", _colupdobjfls_settings);
if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2239;BA.debugLine="Dim field_name As String = colupdobjfls_settin";
Debug.ShouldStop(1073741824);
_field_name = BA.ObjectToString(_colupdobjfls_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field_name")))));Debug.locals.put("field_name", _field_name);Debug.locals.put("field_name", _field_name);
 BA.debugLineNum = 2240;BA.debugLine="Dim is_additional As Int = colupdobjfls_settin";
Debug.ShouldStop(-2147483648);
_is_additional = BA.numberCast(int.class, _colupdobjfls_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_additional")))));Debug.locals.put("is_additional", _is_additional);Debug.locals.put("is_additional", _is_additional);
 BA.debugLineNum = 2241;BA.debugLine="Dim is_address As Int = colupdobjfls_settings.";
Debug.ShouldStop(1);
_is_address = BA.numberCast(int.class, _colupdobjfls_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_address")))));Debug.locals.put("is_address", _is_address);Debug.locals.put("is_address", _is_address);
 BA.debugLineNum = 2242;BA.debugLine="Dim UPDCNDValue As String = colupdobjfls_setti";
Debug.ShouldStop(2);
_updcndvalue = BA.ObjectToString(_colupdobjfls_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("UPDCNDValue", _updcndvalue);Debug.locals.put("UPDCNDValue", _updcndvalue);
 BA.debugLineNum = 2244;BA.debugLine="Dim update_value_type As Int = colupdobjfls_se";
Debug.ShouldStop(8);
_update_value_type = BA.numberCast(int.class, _colupdobjfls_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("update_value_type")))));Debug.locals.put("update_value_type", _update_value_type);Debug.locals.put("update_value_type", _update_value_type);
 BA.debugLineNum = 2245;BA.debugLine="Dim script As String = colupdobjfls_settings.G";
Debug.ShouldStop(16);
_script = BA.ObjectToString(_colupdobjfls_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("script")))));Debug.locals.put("script", _script);Debug.locals.put("script", _script);
 BA.debugLineNum = 2246;BA.debugLine="Dim external_tagcode As String = colupdobjfls_";
Debug.ShouldStop(32);
_external_tagcode = BA.ObjectToString(_colupdobjfls_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("external_tagcode")))));Debug.locals.put("external_tagcode", _external_tagcode);Debug.locals.put("external_tagcode", _external_tagcode);
 BA.debugLineNum = 2247;BA.debugLine="Dim is_contact As Int = colupdobjfls_settings.";
Debug.ShouldStop(64);
_is_contact = BA.numberCast(int.class, _colupdobjfls_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_contact")))));Debug.locals.put("is_contact", _is_contact);Debug.locals.put("is_contact", _is_contact);
 BA.debugLineNum = 2262;BA.debugLine="Dim ContinuarUPDT As Boolean = (update_value_t";
Debug.ShouldStop(2097152);
_continuarupdt = BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_update_value_type,BA.numberCast(double.class, 1))));Debug.locals.put("ContinuarUPDT", _continuarupdt);Debug.locals.put("ContinuarUPDT", _continuarupdt);
 BA.debugLineNum = 2263;BA.debugLine="Dim UPDTValue As String = \"\"";
Debug.ShouldStop(4194304);
_updtvalue = BA.ObjectToString("");Debug.locals.put("UPDTValue", _updtvalue);Debug.locals.put("UPDTValue", _updtvalue);
 BA.debugLineNum = 2265;BA.debugLine="If (update_value_type = 1) Then 'Data";
Debug.ShouldStop(16777216);
if (true) break;

case 15:
//if
this.state = 47;
if ((RemoteObject.solveBoolean("=",_update_value_type,BA.numberCast(double.class, 1)))) { 
this.state = 17;
}else 
{ BA.debugLineNum = 2267;BA.debugLine="Else If (update_value_type = 2) Then 'Hora";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_update_value_type,BA.numberCast(double.class, 2)))) { 
this.state = 19;
}else 
{ BA.debugLineNum = 2269;BA.debugLine="Else If (update_value_type = 3) Then 'Datahora";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",_update_value_type,BA.numberCast(double.class, 3)))) { 
this.state = 21;
}else 
{ BA.debugLineNum = 2271;BA.debugLine="Else If (update_value_type = 4) Then 'Incremen";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",_update_value_type,BA.numberCast(double.class, 4)))) { 
this.state = 23;
}else 
{ BA.debugLineNum = 2290;BA.debugLine="Else If (update_value_type = 5) Then 'Identifi";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_update_value_type,BA.numberCast(double.class, 5)))) { 
this.state = 40;
}else 
{ BA.debugLineNum = 2291;BA.debugLine="Else If (update_value_type = 6) Then 'Valor de";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",_update_value_type,BA.numberCast(double.class, 6)))) { 
this.state = 42;
}else 
{ BA.debugLineNum = 2292;BA.debugLine="Else If (update_value_type = 7) Then 'Valor es";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",_update_value_type,BA.numberCast(double.class, 7)))) { 
this.state = 44;
}else 
{ BA.debugLineNum = 2294;BA.debugLine="Else If (update_value_type = 8) Then 'script (";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",_update_value_type,BA.numberCast(double.class, 8)))) { 
this.state = 46;
}}}}}}}}
if (true) break;

case 17:
//C
this.state = 47;
 BA.debugLineNum = 2266;BA.debugLine="UPDTValue = Utils.GetCurrentDate";
Debug.ShouldStop(33554432);
_updtvalue = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("UPDTValue", _updtvalue);
 if (true) break;

case 19:
//C
this.state = 47;
 BA.debugLineNum = 2268;BA.debugLine="UPDTValue = Utils.GetCurrentTimeExt";
Debug.ShouldStop(134217728);
_updtvalue = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("UPDTValue", _updtvalue);
 if (true) break;

case 21:
//C
this.state = 47;
 BA.debugLineNum = 2270;BA.debugLine="UPDTValue = Utils.GetCurrDatetimeExt";
Debug.ShouldStop(536870912);
_updtvalue = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("UPDTValue", _updtvalue);
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2272;BA.debugLine="Dim TempValue As String = \"\"";
Debug.ShouldStop(-2147483648);
_tempvalue = BA.ObjectToString("");Debug.locals.put("TempValue", _tempvalue);Debug.locals.put("TempValue", _tempvalue);
 BA.debugLineNum = 2273;BA.debugLine="If Utils.Int2Bool(is_additional) Then";
Debug.ShouldStop(1);
if (true) break;

case 24:
//if
this.state = 29;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_is_additional)).<Boolean>get().booleanValue()) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 2274;BA.debugLine="Dim TempValue As String = DBStructures.GetSc";
Debug.ShouldStop(2);
_tempvalue = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(value, '0') as valor\n"),RemoteObject.createImmutable("													from dta_objects_fields where object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("													and field_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_name.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("TempValue", _tempvalue);Debug.locals.put("TempValue", _tempvalue);
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 2278;BA.debugLine="Dim TempValue As String = DBStructures.GetSc";
Debug.ShouldStop(32);
_tempvalue = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_name.runMethod(true,"trim")))),RemoteObject.createImmutable(", '0') as valor\n"),RemoteObject.createImmutable("													from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("TempValue", _tempvalue);Debug.locals.put("TempValue", _tempvalue);
 if (true) break;
;
 BA.debugLineNum = 2282;BA.debugLine="If Utils.NNE(TempValue) Then";
Debug.ShouldStop(512);

case 29:
//if
this.state = 38;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_tempvalue)).<Boolean>get().booleanValue()) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 2283;BA.debugLine="Try";
Debug.ShouldStop(1024);
if (true) break;

case 32:
//try
this.state = 37;
this.catchState = 36;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 37;
this.catchState = 36;
 BA.debugLineNum = 2284;BA.debugLine="Dim iTempValue As Int = TempValue + 1";
Debug.ShouldStop(2048);
_itempvalue = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tempvalue),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("iTempValue", _itempvalue);Debug.locals.put("iTempValue", _itempvalue);
 Debug.CheckDeviceExceptions();
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
 BA.debugLineNum = 2286;BA.debugLine="Dim iTempValue As Int = 1";
Debug.ShouldStop(8192);
_itempvalue = BA.numberCast(int.class, 1);Debug.locals.put("iTempValue", _itempvalue);Debug.locals.put("iTempValue", _itempvalue);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
;
 BA.debugLineNum = 2288;BA.debugLine="UPDTValue = iTempValue";
Debug.ShouldStop(32768);
_updtvalue = BA.NumberToString(_itempvalue);Debug.locals.put("UPDTValue", _updtvalue);
 if (true) break;

case 38:
//C
this.state = 47;
;
 if (true) break;

case 40:
//C
this.state = 47;
 if (true) break;

case 42:
//C
this.state = 47;
 if (true) break;

case 44:
//C
this.state = 47;
 BA.debugLineNum = 2293;BA.debugLine="UPDTValue = UPDCNDValue";
Debug.ShouldStop(1048576);
_updtvalue = _updcndvalue;Debug.locals.put("UPDTValue", _updtvalue);
 if (true) break;

case 46:
//C
this.state = 47;
 if (true) break;
;
 BA.debugLineNum = 2297;BA.debugLine="If (ContinuarUPDT) Then";
Debug.ShouldStop(16777216);

case 47:
//if
this.state = 77;
if ((_continuarupdt).<Boolean>get().booleanValue()) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 2299;BA.debugLine="If Utils.Int2Bool(is_additional) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 50:
//if
this.state = 55;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_is_additional)).<Boolean>get().booleanValue()) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 55;
 BA.debugLineNum = 2300;BA.debugLine="Dim updSQLRec As String = $\"update dta_objec";
Debug.ShouldStop(134217728);
_updsqlrec = (RemoteObject.concat(RemoteObject.createImmutable("update dta_objects_fields set value='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updtvalue))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			where 1=1\n"),RemoteObject.createImmutable("																			and object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("																			and field_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_name.runMethod(true,"trim")))),RemoteObject.createImmutable("'")));Debug.locals.put("updSQLRec", _updsqlrec);Debug.locals.put("updSQLRec", _updsqlrec);
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 2305;BA.debugLine="Dim updSQLRec As String = $\"update dta_objec";
Debug.ShouldStop(1);
_updsqlrec = (RemoteObject.concat(RemoteObject.createImmutable("update dta_objects set "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_name.runMethod(true,"trim")))),RemoteObject.createImmutable("='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updtvalue))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			where 1=1\n"),RemoteObject.createImmutable("																			and tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")));Debug.locals.put("updSQLRec", _updsqlrec);Debug.locals.put("updSQLRec", _updsqlrec);
 if (true) break;

case 55:
//C
this.state = 56;
;
 BA.debugLineNum = 2310;BA.debugLine="Log(updSQLRec)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185270369",_updsqlrec,0);
 BA.debugLineNum = 2311;BA.debugLine="Dim UpdateServer As Boolean = True";
Debug.ShouldStop(64);
_updateserver = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("UpdateServer", _updateserver);Debug.locals.put("UpdateServer", _updateserver);
 BA.debugLineNum = 2312;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 56:
//try
this.state = 61;
this.catchState = 60;
this.state = 58;
if (true) break;

case 58:
//C
this.state = 61;
this.catchState = 60;
 BA.debugLineNum = 2313;BA.debugLine="Utils.SaveSQLToLog(\"ListReturn3\",updSQLRec,";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("ListReturn3")),(Object)(_updsqlrec),(Object)(_object_tagcode));
 Debug.CheckDeviceExceptions();
if (true) break;

case 60:
//C
this.state = 61;
this.catchState = 0;
 BA.debugLineNum = 2315;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185270374",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2316;BA.debugLine="Dim UpdateServer As Boolean = False";
Debug.ShouldStop(2048);
_updateserver = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("UpdateServer", _updateserver);Debug.locals.put("UpdateServer", _updateserver);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2319;BA.debugLine="If (UpdateServer) Then";
Debug.ShouldStop(16384);

case 61:
//if
this.state = 76;
this.catchState = 0;
if ((_updateserver).<Boolean>get().booleanValue()) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 2320;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32768);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2321;BA.debugLine="params.Initialize";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2322;BA.debugLine="params.Clear";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2323;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2324;BA.debugLine="params.Put(\"ACLAObject\", object_tagcode.trim";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObject"))),(Object)((_object_tagcode.runMethod(true,"trim"))));
 BA.debugLineNum = 2325;BA.debugLine="params.Put(\"ACLAField\", field_name.trim)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAField"))),(Object)((_field_name.runMethod(true,"trim"))));
 BA.debugLineNum = 2326;BA.debugLine="params.Put(\"ACLAValue\", UPDTValue)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValue"))),(Object)((_updtvalue)));
 BA.debugLineNum = 2327;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTag";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2328;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuth";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2329;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2330;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2331;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2332;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceM";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2333;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2334;BA.debugLine="Dim Url As String = $\"https://${ShareCode.AP";
Debug.ShouldStop(536870912);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/cla/object/field/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2335;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_";
Debug.ShouldStop(1073741824);
if (true) break;

case 64:
//if
this.state = 75;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 66;
}else {
this.state = 74;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 2336;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 67:
//if
this.state = 72;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
 BA.debugLineNum = 2337;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(taskscl2.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 2339;BA.debugLine="Dim WorkerND As WorkerNewData = Types.Make";
Debug.ShouldStop(4);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 3)),(Object)(_object_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2340;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(par";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 72:
//C
this.state = 75;
;
 BA.debugLineNum = 2342;BA.debugLine="Sleep(500)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "checktyperequesttaskadds"),BA.numberCast(int.class, 500));
this.state = 83;
return;
case 83:
//C
this.state = 75;
;
 if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 2344;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeW";
Debug.ShouldStop(128);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 3)),(Object)(_object_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2345;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(para";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 75:
//C
this.state = 76;
;
 if (true) break;

case 76:
//C
this.state = 77;
;
 if (true) break;

case 77:
//C
this.state = 82;
;
 if (true) break;
if (true) break;

case 78:
//C
this.state = 79;
Debug.locals.put("colupdobjfls_settings", _colupdobjfls_settings);
;
 if (true) break;

case 79:
//C
this.state = 80;
;
 BA.debugLineNum = 2353;BA.debugLine="Sleep(250)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "checktyperequesttaskadds"),BA.numberCast(int.class, 250));
this.state = 84;
return;
case 84:
//C
this.state = 80;
;
 if (true) break;

case 80:
//C
this.state = -1;
;
 BA.debugLineNum = 2355;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2356;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",taskscl2.processBA, e0.toString());}
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
public static RemoteObject  _clainewsvrvarvalue(RemoteObject _request_tagcode,RemoteObject _task_tagcode,RemoteObject _chapter_uk,RemoteObject _rc,RemoteObject _ric) throws Exception{
try {
		Debug.PushSubsStack("ClaiNewSvrVarValue (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1604);
if (RapidSub.canDelegate("clainewsvrvarvalue")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","clainewsvrvarvalue", _request_tagcode, _task_tagcode, _chapter_uk, _rc, _ric);}
ResumableSub_ClaiNewSvrVarValue rsub = new ResumableSub_ClaiNewSvrVarValue(null,_request_tagcode,_task_tagcode,_chapter_uk,_rc,_ric);
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
public static class ResumableSub_ClaiNewSvrVarValue extends BA.ResumableSub {
public ResumableSub_ClaiNewSvrVarValue(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _request_tagcode,RemoteObject _task_tagcode,RemoteObject _chapter_uk,RemoteObject _rc,RemoteObject _ric) {
this.parent = parent;
this._request_tagcode = _request_tagcode;
this._task_tagcode = _task_tagcode;
this._chapter_uk = _chapter_uk;
this._rc = _rc;
this._ric = _ric;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _request_tagcode;
RemoteObject _task_tagcode;
RemoteObject _chapter_uk;
RemoteObject _rc;
RemoteObject _ric;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ClaiNewSvrVarValue (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1604);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("request_tagcode", _request_tagcode);
Debug.locals.put("task_tagcode", _task_tagcode);
Debug.locals.put("Chapter_Uk", _chapter_uk);
Debug.locals.put("rc", _rc);
Debug.locals.put("ric", _ric);
 BA.debugLineNum = 1606;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1607;BA.debugLine="params.Initialize";
Debug.ShouldStop(64);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1608;BA.debugLine="params.Clear";
Debug.ShouldStop(128);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1609;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1610;BA.debugLine="params.Put(\"ACLARequest\", request_tagcode.trim)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_request_tagcode.runMethod(true,"trim"))));
 BA.debugLineNum = 1611;BA.debugLine="params.Put(\"ACLATask\", task_tagcode.Trim)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_task_tagcode.runMethod(true,"trim"))));
 BA.debugLineNum = 1612;BA.debugLine="params.Put(\"ACLAUniqueKey\", Chapter_Uk.Trim) ' ch";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_chapter_uk.runMethod(true,"trim"))));
 BA.debugLineNum = 1613;BA.debugLine="params.Put(\"ACLAReqCounter\", rc)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_rc)));
 BA.debugLineNum = 1614;BA.debugLine="params.Put(\"ACLARepeatItem\", ric)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_ric)));
 BA.debugLineNum = 1616;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1617;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1618;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1619;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1620;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1621;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1622;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1623;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(4194304);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/new")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1624;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOA";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 12;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1625;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1626;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", request_t";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(taskscl2.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_request_tagcode.runMethod(true,"trim")));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1628;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(134217728);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_request_tagcode.runMethod(true,"trim")),(Object)(_task_tagcode.runMethod(true,"trim")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1629;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 1631;BA.debugLine="Sleep(250)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "clainewsvrvarvalue"),BA.numberCast(int.class, 250));
this.state = 13;
return;
case 13:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1633;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(1);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_request_tagcode.runMethod(true,"trim")),(Object)(_task_tagcode.runMethod(true,"trim")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1634;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1637;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1639;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _claiupdatesvrvarvalue(RemoteObject _request_tagcode,RemoteObject _task_tagcode,RemoteObject _item_tagcode,RemoteObject _uk,RemoteObject _tagcode,RemoteObject _field2set,RemoteObject _value2set,RemoteObject _rc,RemoteObject _ric,RemoteObject _rfc) throws Exception{
try {
		Debug.PushSubsStack("ClaiUpdateSvrVarValue (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1641);
if (RapidSub.canDelegate("claiupdatesvrvarvalue")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","claiupdatesvrvarvalue", _request_tagcode, _task_tagcode, _item_tagcode, _uk, _tagcode, _field2set, _value2set, _rc, _ric, _rfc);}
ResumableSub_ClaiUpdateSvrVarValue rsub = new ResumableSub_ClaiUpdateSvrVarValue(null,_request_tagcode,_task_tagcode,_item_tagcode,_uk,_tagcode,_field2set,_value2set,_rc,_ric,_rfc);
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
public static class ResumableSub_ClaiUpdateSvrVarValue extends BA.ResumableSub {
public ResumableSub_ClaiUpdateSvrVarValue(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _request_tagcode,RemoteObject _task_tagcode,RemoteObject _item_tagcode,RemoteObject _uk,RemoteObject _tagcode,RemoteObject _field2set,RemoteObject _value2set,RemoteObject _rc,RemoteObject _ric,RemoteObject _rfc) {
this.parent = parent;
this._request_tagcode = _request_tagcode;
this._task_tagcode = _task_tagcode;
this._item_tagcode = _item_tagcode;
this._uk = _uk;
this._tagcode = _tagcode;
this._field2set = _field2set;
this._value2set = _value2set;
this._rc = _rc;
this._ric = _ric;
this._rfc = _rfc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _request_tagcode;
RemoteObject _task_tagcode;
RemoteObject _item_tagcode;
RemoteObject _uk;
RemoteObject _tagcode;
RemoteObject _field2set;
RemoteObject _value2set;
RemoteObject _rc;
RemoteObject _ric;
RemoteObject _rfc;
RemoteObject _v2set = RemoteObject.createImmutable("");
RemoteObject _vt2set = RemoteObject.createImmutable("");
RemoteObject _t2set = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _aclsessuser = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ClaiUpdateSvrVarValue (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1641);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("request_tagcode", _request_tagcode);
Debug.locals.put("task_tagcode", _task_tagcode);
Debug.locals.put("item_tagcode", _item_tagcode);
Debug.locals.put("Uk", _uk);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("field2set", _field2set);
Debug.locals.put("value2set", _value2set);
Debug.locals.put("rc", _rc);
Debug.locals.put("ric", _ric);
Debug.locals.put("rfc", _rfc);
 BA.debugLineNum = 1643;BA.debugLine="Log($\"ESCREVE NO BO : ${request_tagcode} ${task_t";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184418306",(RemoteObject.concat(RemoteObject.createImmutable("ESCREVE NO BO : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_tagcode))),RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item_tagcode))),RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field2set))),RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value2set))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 1645;BA.debugLine="Dim v2Set As String = \"\"";
Debug.ShouldStop(4096);
_v2set = BA.ObjectToString("");Debug.locals.put("v2Set", _v2set);Debug.locals.put("v2Set", _v2set);
 BA.debugLineNum = 1646;BA.debugLine="Dim vt2Set As String = \"\"";
Debug.ShouldStop(8192);
_vt2set = BA.ObjectToString("");Debug.locals.put("vt2Set", _vt2set);Debug.locals.put("vt2Set", _vt2set);
 BA.debugLineNum = 1647;BA.debugLine="Dim t2Set As String = \"\"";
Debug.ShouldStop(16384);
_t2set = BA.ObjectToString("");Debug.locals.put("t2Set", _t2set);Debug.locals.put("t2Set", _t2set);
 BA.debugLineNum = 1649;BA.debugLine="If field2set = \"execute_value\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_field2set,BA.ObjectToString("execute_value"))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 1651;BA.debugLine="Else If field2set = \"execute_value_title\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_field2set,BA.ObjectToString("execute_value_title"))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 1653;BA.debugLine="Else  If field2set = \"title\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_field2set,BA.ObjectToString("title"))) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 1650;BA.debugLine="v2Set = value2set";
Debug.ShouldStop(131072);
_v2set = _value2set;Debug.locals.put("v2Set", _v2set);
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 1652;BA.debugLine="vt2Set = value2set";
Debug.ShouldStop(524288);
_vt2set = _value2set;Debug.locals.put("vt2Set", _vt2set);
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 1654;BA.debugLine="t2Set = value2set";
Debug.ShouldStop(2097152);
_t2set = _value2set;Debug.locals.put("t2Set", _t2set);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1656;BA.debugLine="v2Set = value2set";
Debug.ShouldStop(8388608);
_v2set = _value2set;Debug.locals.put("v2Set", _v2set);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1659;BA.debugLine="Dim params As Map";
Debug.ShouldStop(67108864);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1660;BA.debugLine="params.Initialize";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1661;BA.debugLine="params.Clear";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1662;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1663;BA.debugLine="params.Put(\"ACLARequest\", request_tagcode)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_request_tagcode)));
 BA.debugLineNum = 1664;BA.debugLine="params.Put(\"ACLAAction\", task_tagcode)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_task_tagcode)));
 BA.debugLineNum = 1665;BA.debugLine="params.Put(\"ACLATask\", task_tagcode)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_task_tagcode)));
 BA.debugLineNum = 1666;BA.debugLine="params.Put(\"ACLAItem\", item_tagcode)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_item_tagcode)));
 BA.debugLineNum = 1667;BA.debugLine="params.Put(\"ACLAUniqueKey\", Uk)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_uk)));
 BA.debugLineNum = 1668;BA.debugLine="params.Put(\"ACLATagcode\", tagcode)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 1669;BA.debugLine="params.Put(\"ACLAValue\", v2Set)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValue"))),(Object)((_v2set)));
 BA.debugLineNum = 1670;BA.debugLine="params.Put(\"ACLAValueTitle\", vt2Set)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueTitle"))),(Object)((_vt2set)));
 BA.debugLineNum = 1671;BA.debugLine="params.Put(\"ACLATitle\", t2Set)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATitle"))),(Object)((_t2set)));
 BA.debugLineNum = 1672;BA.debugLine="params.Put(\"ACLAReqCounter\", rc)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_rc)));
 BA.debugLineNum = 1673;BA.debugLine="params.Put(\"ACLARepeatItem\", ric)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_ric)));
 BA.debugLineNum = 1674;BA.debugLine="params.Put(\"ACLARepeatField\", rfc)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)((_rfc)));
 BA.debugLineNum = 1675;BA.debugLine="params.Put(\"ACLAInner\", 0)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAInner"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1676;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1677;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1678;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1679;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1680;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1681;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1682;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1683;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDateti";
Debug.ShouldStop(262144);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 1684;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
Debug.ShouldStop(524288);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1685;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
Debug.ShouldStop(1048576);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1687;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1688;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1689;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 1690;BA.debugLine="Dim ACLSessUser As String = ShareCode.SESS_OPER_U";
Debug.ShouldStop(33554432);
_aclsessuser = parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ;Debug.locals.put("ACLSessUser", _aclsessuser);Debug.locals.put("ACLSessUser", _aclsessuser);
 BA.debugLineNum = 1692;BA.debugLine="params.Put(\"ACLSessUser\", ACLSessUser)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLSessUser"))),(Object)((_aclsessuser)));
 BA.debugLineNum = 1693;BA.debugLine="params.Put(\"ACLClear\", 0)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLClear"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1695;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(1073741824);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1696;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOA";
Debug.ShouldStop(-2147483648);
if (true) break;

case 11:
//if
this.state = 22;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1697;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(1);
if (true) break;

case 14:
//if
this.state = 19;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 1698;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", request_t";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(taskscl2.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_request_tagcode));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1700;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(8);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_request_tagcode.runMethod(true,"trim")),(Object)(_task_tagcode.runMethod(true,"trim")),(Object)(_item_tagcode.runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1701;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 19:
//C
this.state = 22;
;
 BA.debugLineNum = 1703;BA.debugLine="Sleep(250)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "claiupdatesvrvarvalue"),BA.numberCast(int.class, 250));
this.state = 23;
return;
case 23:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1705;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(256);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_request_tagcode.runMethod(true,"trim")),(Object)(_task_tagcode.runMethod(true,"trim")),(Object)(_item_tagcode.runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1706;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 1709;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1711;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _createlistitem(RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _istrequest) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,516);
if (RapidSub.canDelegate("createlistitem")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","createlistitem", _cnt, _colitems, _width, _height, _istrequest);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _typeresults_desc = RemoteObject.createImmutable("");
RemoteObject _taskgroup_desc = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _dayslastupdate = RemoteObject.createImmutable("");
RemoteObject _details = RemoteObject.createImmutable("");
RemoteObject _sttext = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("isTRequest", _istrequest);
 BA.debugLineNum = 516;BA.debugLine="Sub CreateListItem(cnt As Int, colitems As Cursor,";
Debug.ShouldStop(8);
 BA.debugLineNum = 517;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 518;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(32);
_p.runVoidMethod ("Initialize",taskscl2.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 519;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(64);
taskscl2.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 520;BA.debugLine="If (isTRequest) Then";
Debug.ShouldStop(128);
if ((_istrequest).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 521;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(256);
if ((taskscl2.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 522;BA.debugLine="p.LoadLayout(\"task_itemviewtyperequest\")";
Debug.ShouldStop(512);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("task_itemviewtyperequest")),taskscl2.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 524;BA.debugLine="p.LoadLayout(\"task_itemviewtyperequest\")";
Debug.ShouldStop(2048);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("task_itemviewtyperequest")),taskscl2.mostCurrent.activityBA);
 };
 }else {
 BA.debugLineNum = 527;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(16384);
if ((taskscl2.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 528;BA.debugLine="p.LoadLayout(\"tasks_itemviewchecklist_2_phone\")";
Debug.ShouldStop(32768);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("tasks_itemviewchecklist_2_phone")),taskscl2.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 530;BA.debugLine="p.LoadLayout(\"tasks_itemviewchecklist_2\")";
Debug.ShouldStop(131072);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("tasks_itemviewchecklist_2")),taskscl2.mostCurrent.activityBA);
 };
 };
 BA.debugLineNum = 533;BA.debugLine="p.RemoveView";
Debug.ShouldStop(1048576);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 537;BA.debugLine="Dim typeresults_desc As String = colitems.GetStri";
Debug.ShouldStop(16777216);
_typeresults_desc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("typeresults_desc")));Debug.locals.put("typeresults_desc", _typeresults_desc);Debug.locals.put("typeresults_desc", _typeresults_desc);
 BA.debugLineNum = 538;BA.debugLine="Dim taskgroup_desc As String = colitems.GetString";
Debug.ShouldStop(33554432);
_taskgroup_desc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("taskgroup_desc")));Debug.locals.put("taskgroup_desc", _taskgroup_desc);Debug.locals.put("taskgroup_desc", _taskgroup_desc);
 BA.debugLineNum = 539;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(67108864);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 540;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
Debug.ShouldStop(134217728);
_title = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 541;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"active\")";
Debug.ShouldStop(268435456);
_status_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("active")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 542;BA.debugLine="Dim updated_at As String = colitems.GetString(\"up";
Debug.ShouldStop(536870912);
_updated_at = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("updated_at")));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 543;BA.debugLine="Dim dayslastupdate As String = colitems.GetInt(\"d";
Debug.ShouldStop(1073741824);
_dayslastupdate = BA.NumberToString(_colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("dayslastupdate"))));Debug.locals.put("dayslastupdate", _dayslastupdate);Debug.locals.put("dayslastupdate", _dayslastupdate);
 BA.debugLineNum = 544;BA.debugLine="Dim details As String = colitems.GetString(\"detai";
Debug.ShouldStop(-2147483648);
_details = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")));Debug.locals.put("details", _details);Debug.locals.put("details", _details);
 BA.debugLineNum = 546;BA.debugLine="ListItemDesc.text = $\"#${cnt} - ${title}\"$";
Debug.ShouldStop(2);
taskscl2.mostCurrent._listitemdesc.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("#"),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt))),RemoteObject.createImmutable(" - "),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 547;BA.debugLine="ListItemUpdate.text = $\"${updated_at}\"$";
Debug.ShouldStop(4);
taskscl2.mostCurrent._listitemupdate.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updated_at))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 548;BA.debugLine="ListItemGroup.text = $\"${taskgroup_desc}\"$";
Debug.ShouldStop(8);
taskscl2.mostCurrent._listitemgroup.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_taskgroup_desc))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 549;BA.debugLine="ListItemType.text = $\"${typeresults_desc}\"$";
Debug.ShouldStop(16);
taskscl2.mostCurrent._listitemtype.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_typeresults_desc))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 550;BA.debugLine="listButActions.Tag = tagcode";
Debug.ShouldStop(32);
taskscl2.mostCurrent._listbutactions.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 552;BA.debugLine="Dim sttext As String = \"Inactivo\"";
Debug.ShouldStop(128);
_sttext = BA.ObjectToString("Inactivo");Debug.locals.put("sttext", _sttext);Debug.locals.put("sttext", _sttext);
 BA.debugLineNum = 553;BA.debugLine="If (status_id = 1) Then sttext = \"Activo\"";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 1)))) { 
_sttext = BA.ObjectToString("Activo");Debug.locals.put("sttext", _sttext);};
 BA.debugLineNum = 554;BA.debugLine="ListItemStatus.Text = sttext";
Debug.ShouldStop(512);
taskscl2.mostCurrent._listitemstatus.runMethod(true,"setText",BA.ObjectToCharSequence(_sttext));
 BA.debugLineNum = 556;BA.debugLine="If (isTRequest) And Utils.NNE(details) Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(".",(_istrequest)) && RemoteObject.solveBoolean(".",taskscl2.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_details)))) { 
 BA.debugLineNum = 557;BA.debugLine="sttext = $\"${details} (${sttext})\"$";
Debug.ShouldStop(4096);
_sttext = (RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_details))),RemoteObject.createImmutable(" ("),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sttext))),RemoteObject.createImmutable(")")));Debug.locals.put("sttext", _sttext);
 };
 BA.debugLineNum = 560;BA.debugLine="If (status_id = 0) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 561;BA.debugLine="ListItemState.TextColor = Consts.ColorGray";
Debug.ShouldStop(65536);
taskscl2.mostCurrent._listitemstate.runMethod(true,"setTextColor",taskscl2.mostCurrent._consts._colorgray /*RemoteObject*/ );
 BA.debugLineNum = 562;BA.debugLine="ListItemState.Text = Chr(0xF088)";
Debug.ShouldStop(131072);
taskscl2.mostCurrent._listitemstate.runMethod(true,"setText",BA.ObjectToCharSequence(taskscl2.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf088)))));
 }else {
 BA.debugLineNum = 564;BA.debugLine="ListItemState.Text = Chr(0xF087)";
Debug.ShouldStop(524288);
taskscl2.mostCurrent._listitemstate.runMethod(true,"setText",BA.ObjectToCharSequence(taskscl2.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf087)))));
 BA.debugLineNum = 565;BA.debugLine="If (dayslastupdate >5) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, _dayslastupdate),BA.numberCast(double.class, 5)))) { 
 BA.debugLineNum = 566;BA.debugLine="ListItemState.TextColor = Consts.ColorYellow";
Debug.ShouldStop(2097152);
taskscl2.mostCurrent._listitemstate.runMethod(true,"setTextColor",taskscl2.mostCurrent._consts._coloryellow /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 568;BA.debugLine="ListItemState.TextColor = Consts.ColorGreen";
Debug.ShouldStop(8388608);
taskscl2.mostCurrent._listitemstate.runMethod(true,"setTextColor",taskscl2.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 572;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(134217728);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 573;BA.debugLine="Return p";
Debug.ShouldStop(268435456);
if (true) return _p;
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequestentityrelation(RemoteObject _newrequest,RemoteObject _newobject) throws Exception{
try {
		Debug.PushSubsStack("createRequestEntityRelation (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1744);
if (RapidSub.canDelegate("createrequestentityrelation")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","createrequestentityrelation", _newrequest, _newobject);}
ResumableSub_createRequestEntityRelation rsub = new ResumableSub_createRequestEntityRelation(null,_newrequest,_newobject);
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
public static class ResumableSub_createRequestEntityRelation extends BA.ResumableSub {
public ResumableSub_createRequestEntityRelation(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _newrequest,RemoteObject _newobject) {
this.parent = parent;
this._newrequest = _newrequest;
this._newobject = _newobject;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _newrequest;
RemoteObject _newobject;
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("createRequestEntityRelation (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1744);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("newRequest", _newrequest);
Debug.locals.put("newObject", _newobject);
 BA.debugLineNum = 1745;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newObject";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequest))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newobject))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1746;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(131072);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_entities")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1747;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(262144);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_entities (id, request_tagcode, entity_tagcode, ismaster)\n"),RemoteObject.createImmutable("								values ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newobject))),RemoteObject.createImmutable("', 1);")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1749;BA.debugLine="Utils.SaveSQLToLog(\"createRequestEntityRelation\"";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("createRequestEntityRelation")),(Object)(_ssql),(Object)(_newrequest));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1751;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1752;BA.debugLine="End Sub";
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
public static RemoteObject  _createrequestfields(RemoteObject _newrequest,RemoteObject _newrequesttype) throws Exception{
try {
		Debug.PushSubsStack("createRequestFields (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1715);
if (RapidSub.canDelegate("createrequestfields")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","createrequestfields", _newrequest, _newrequesttype);}
ResumableSub_createRequestFields rsub = new ResumableSub_createRequestFields(null,_newrequest,_newrequesttype);
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
public static class ResumableSub_createRequestFields extends BA.ResumableSub {
public ResumableSub_createRequestFields(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _newrequest,RemoteObject _newrequesttype) {
this.parent = parent;
this._newrequest = _newrequest;
this._newrequesttype = _newrequesttype;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _newrequest;
RemoteObject _newrequesttype;
RemoteObject _sql1 = RemoteObject.createImmutable("");
RemoteObject _resdata = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _sfield = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("createRequestFields (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1715);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("newRequest", _newrequest);
Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 1716;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newReques";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 8;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequest))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequesttype))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1717;BA.debugLine="Dim SQL1 As String = $\"select distinct field_tag";
Debug.ShouldStop(1048576);
_sql1 = (RemoteObject.concat(RemoteObject.createImmutable("select distinct field_tagcode from dta_typerequests_fields\n"),RemoteObject.createImmutable("								where typerequest_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequesttype))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL1", _sql1);Debug.locals.put("SQL1", _sql1);
 BA.debugLineNum = 1720;BA.debugLine="Dim ResData As ResultSet = Starter.LocalSQLEVC.E";
Debug.ShouldStop(8388608);
_resdata = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_resdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql1)));Debug.locals.put("ResData", _resdata);
 BA.debugLineNum = 1721;BA.debugLine="Do While ResData.NextRow";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//do while
this.state = 7;
while (_resdata.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
 BA.debugLineNum = 1722;BA.debugLine="Dim sfield As String = ResData.GetString(\"field";
Debug.ShouldStop(33554432);
_sfield = _resdata.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("field_tagcode")));Debug.locals.put("sfield", _sfield);Debug.locals.put("sfield", _sfield);
 BA.debugLineNum = 1723;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
Debug.ShouldStop(67108864);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_fields")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1724;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_fields (id, request_tagcode, field_tagcode) \n"),RemoteObject.createImmutable("								values ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sfield))),RemoteObject.createImmutable("');")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1726;BA.debugLine="Utils.SaveSQLToLog(\"createRequestFields\",sSQL,";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("createRequestFields")),(Object)(_ssql),(Object)(_newrequest));
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1728;BA.debugLine="ResData.Close";
Debug.ShouldStop(-2147483648);
_resdata.runVoidMethod ("Close");
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1731;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1732;BA.debugLine="End Sub";
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
public static RemoteObject  _createrequestobjectrelation(RemoteObject _newrequest,RemoteObject _newobject) throws Exception{
try {
		Debug.PushSubsStack("createRequestObjectRelation (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1734);
if (RapidSub.canDelegate("createrequestobjectrelation")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","createrequestobjectrelation", _newrequest, _newobject);}
ResumableSub_createRequestObjectRelation rsub = new ResumableSub_createRequestObjectRelation(null,_newrequest,_newobject);
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
public static class ResumableSub_createRequestObjectRelation extends BA.ResumableSub {
public ResumableSub_createRequestObjectRelation(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _newrequest,RemoteObject _newobject) {
this.parent = parent;
this._newrequest = _newrequest;
this._newobject = _newobject;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _newrequest;
RemoteObject _newobject;
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("createRequestObjectRelation (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1734);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("newRequest", _newrequest);
Debug.locals.put("newObject", _newobject);
 BA.debugLineNum = 1735;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newObject";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequest))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newobject))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1736;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(128);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_objects")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1737;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(256);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_objects (id, request_tagcode, object_tagcode, ismaster)\n"),RemoteObject.createImmutable("								values ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newobject))),RemoteObject.createImmutable("', 1);")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1739;BA.debugLine="Utils.SaveSQLToLog(\"createRequestObjectRelation\"";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("createRequestObjectRelation")),(Object)(_ssql),(Object)(_newrequest));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1741;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1742;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _editreturn(RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("EditReturn (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,281);
if (RapidSub.canDelegate("editreturn")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","editreturn", _arg);}
Debug.locals.put("arg", _arg);
 BA.debugLineNum = 281;BA.debugLine="Sub EditReturn(arg As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editsearch_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditSearch_EnterPressed (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,635);
if (RapidSub.canDelegate("editsearch_enterpressed")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","editsearch_enterpressed");}
 BA.debugLineNum = 635;BA.debugLine="Sub EditSearch_EnterPressed";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 636;BA.debugLine="MakeListSearch(EditSearch.Text)";
Debug.ShouldStop(134217728);
_makelistsearch(taskscl2.mostCurrent._editsearch.runMethod(true,"getText"));
 BA.debugLineNum = 637;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private ButtonUserUnavailable As Button";
taskscl2.mostCurrent._buttonuserunavailable = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private listsBasePanel As Panel";
taskscl2.mostCurrent._listsbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private listsBottomLine As Panel";
taskscl2.mostCurrent._listsbottomline = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private listsBottomPanel As Panel";
taskscl2.mostCurrent._listsbottompanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private listsButtonClose As Button";
taskscl2.mostCurrent._listsbuttonclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private listsLabelInfo As Label";
taskscl2.mostCurrent._listslabelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private listsTabPanel As TabStrip";
taskscl2.mostCurrent._liststabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 19;BA.debugLine="Private listsTopBar As Panel";
taskscl2.mostCurrent._liststopbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ListItemFullName As Label";
taskscl2.mostCurrent._listitemfullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private listsButtonFilter As Button";
taskscl2.mostCurrent._listsbuttonfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelVersion As Label";
taskscl2.mostCurrent._labelversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LabelDateTime As Label";
taskscl2.mostCurrent._labeldatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LabelAppInfo As Label";
taskscl2.mostCurrent._labelappinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelCopyright As Label";
taskscl2.mostCurrent._labelcopyright = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ListItemStatus As Label";
taskscl2.mostCurrent._listitemstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ItemsCounter As Int = 0";
taskscl2._itemscounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 28;BA.debugLine="Private butSearch As Button";
taskscl2.mostCurrent._butsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private EditSearch As EditText";
taskscl2.mostCurrent._editsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private IsFiltered As Boolean = False";
taskscl2._isfiltered = taskscl2.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 31;BA.debugLine="Private iDialogReqType, iDialogReqStatus, iDialog";
taskscl2._idialogreqtype = RemoteObject.createImmutable(0);
taskscl2._idialogreqstatus = RemoteObject.createImmutable(0);
taskscl2._idialogrequpdtated = RemoteObject.createImmutable(0);
taskscl2._idialogreqwithrequests = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 32;BA.debugLine="Private SearchFilter As String";
taskscl2.mostCurrent._searchfilter = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Private listButActions As Button";
taskscl2.mostCurrent._listbutactions = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private ListItemUpdate As Label";
taskscl2.mostCurrent._listitemupdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ListItemState As Label";
taskscl2.mostCurrent._listitemstate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private ListItemProgress As ProgressBar";
taskscl2.mostCurrent._listitemprogress = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private listChecklists As CustomListView";
taskscl2.mostCurrent._listchecklists = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 38;BA.debugLine="Private ListItemDateVersion As Label";
taskscl2.mostCurrent._listitemdateversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private ListItemVersion As Label";
taskscl2.mostCurrent._listitemversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private ColorTabPanel As Panel";
taskscl2.mostCurrent._colortabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private listActions As CustomListView";
taskscl2.mostCurrent._listactions = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 42;BA.debugLine="Private CurrentLineItemCL As Int = 0";
taskscl2._currentlineitemcl = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 43;BA.debugLine="Private TotalLineItemsCL As Int = 0";
taskscl2._totallineitemscl = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 44;BA.debugLine="Private CurrentLineItemAC As Int = 0";
taskscl2._currentlineitemac = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 45;BA.debugLine="Private TotalLineItemsAC As Int = 0";
taskscl2._totallineitemsac = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 46;BA.debugLine="Private CurrentTab As Int = 0";
taskscl2._currenttab = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 47;BA.debugLine="Private mainLabelOptLists As Label";
taskscl2.mostCurrent._mainlabeloptlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private mainLogo As ImageView";
taskscl2.mostCurrent._mainlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private ButtonActionPause As Button";
taskscl2.mostCurrent._buttonactionpause = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private mainActiveUser As Label";
taskscl2.mostCurrent._mainactiveuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private ButtonAppNetwork As Button";
taskscl2.mostCurrent._buttonappnetwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private ListItemDesc As Label";
taskscl2.mostCurrent._listitemdesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private ListItemGroup As Label";
taskscl2.mostCurrent._listitemgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private ListItemType As Label";
taskscl2.mostCurrent._listitemtype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private ListItemsList As CustomListView";
taskscl2.mostCurrent._listitemslist = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 56;BA.debugLine="Private listTypeRequests As CustomListView";
taskscl2.mostCurrent._listtyperequests = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 57;BA.debugLine="Private TPRCurrentStatus As String = \"0,1\"";
taskscl2.mostCurrent._tprcurrentstatus = BA.ObjectToString("0,1");
 //BA.debugLineNum = 58;BA.debugLine="Private CLCurrentStatus As String = \"0,1\"";
taskscl2.mostCurrent._clcurrentstatus = BA.ObjectToString("0,1");
 //BA.debugLineNum = 59;BA.debugLine="Private tasksLabelStatus As Label";
taskscl2.mostCurrent._taskslabelstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private tasksLabelTitulo As Label";
taskscl2.mostCurrent._taskslabeltitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private tasksLabelUltimoUpd As Label";
taskscl2.mostCurrent._taskslabelultimoupd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private tasksLabelGrupo As Label";
taskscl2.mostCurrent._taskslabelgrupo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private tasksLabelTResultado As Label";
taskscl2.mostCurrent._taskslabeltresultado = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private taskslabelTypeObjectFilter As Label";
taskscl2.mostCurrent._taskslabeltypeobjectfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private taskLVLabelStatus As Label";
taskscl2.mostCurrent._tasklvlabelstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private taskLVLabelStatusTitulo As Label";
taskscl2.mostCurrent._tasklvlabelstatustitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private taskLVLabelUltimoUdp As Label";
taskscl2.mostCurrent._tasklvlabelultimoudp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private taskLVLabelGrupo As Label";
taskscl2.mostCurrent._tasklvlabelgrupo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private taskLVLabelTResultado As Label";
taskscl2.mostCurrent._tasklvlabeltresultado = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private tasksLVlabelTypeObjectFilter As Label";
taskscl2.mostCurrent._taskslvlabeltypeobjectfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listactions_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listActions_ItemClick (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1769);
if (RapidSub.canDelegate("listactions_itemclick")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listactions_itemclick", _index, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1769;BA.debugLine="Sub listActions_ItemClick (Index As Int, Value As";
Debug.ShouldStop(256);
 BA.debugLineNum = 1770;BA.debugLine="CurrentLineItemAC = Index+1";
Debug.ShouldStop(512);
taskscl2._currentlineitemac = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 1771;BA.debugLine="Dim Pnl As Panel = listActions.GetPanel(Index)";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), taskscl2.mostCurrent._listactions.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 1772;BA.debugLine="ListItemSelected( Pnl, listActions )";
Debug.ShouldStop(2048);
_listitemselected(_pnl,taskscl2.mostCurrent._listactions);
 BA.debugLineNum = 1773;BA.debugLine="ShowTaskDetails(Pnl.Tag)";
Debug.ShouldStop(4096);
_showtaskdetails(BA.ObjectToString(_pnl.runMethod(false,"getTag")));
 BA.debugLineNum = 1774;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutactions_click() throws Exception{
try {
		Debug.PushSubsStack("listButActions_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,658);
if (RapidSub.canDelegate("listbutactions_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listbutactions_click");}
 BA.debugLineNum = 658;BA.debugLine="Sub listButActions_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 660;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutattach_click() throws Exception{
try {
		Debug.PushSubsStack("listButAttach_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,611);
if (RapidSub.canDelegate("listbutattach_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listbutattach_click");}
 BA.debugLineNum = 611;BA.debugLine="Sub listButAttach_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 612;BA.debugLine="listsLabelInfo.Text = $\"${Utils.GetFreeMem}\"$";
Debug.ShouldStop(8);
taskscl2.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((taskscl2.mostCurrent._utils.runMethod(true,"_getfreemem" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA)))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 613;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutinfo_click() throws Exception{
try {
		Debug.PushSubsStack("listButInfo_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,607);
if (RapidSub.canDelegate("listbutinfo_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listbutinfo_click");}
 BA.debugLineNum = 607;BA.debugLine="Sub listButInfo_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listchecklists_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listChecklists_ItemClick (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1764);
if (RapidSub.canDelegate("listchecklists_itemclick")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listchecklists_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1764;BA.debugLine="Sub listChecklists_ItemClick (Index As Int, Value";
Debug.ShouldStop(8);
 BA.debugLineNum = 1765;BA.debugLine="CurrentLineItemAC = Index+1";
Debug.ShouldStop(16);
taskscl2._currentlineitemac = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 1766;BA.debugLine="ListItemSelected( listChecklists.GetPanel(Index),";
Debug.ShouldStop(32);
_listitemselected(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), taskscl2.mostCurrent._listchecklists.runMethod(false,"_getpanel",(Object)(_index)).getObject()),taskscl2.mostCurrent._listchecklists);
 BA.debugLineNum = 1767;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitempanel_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemPanel_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,603);
if (RapidSub.canDelegate("listitempanel_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listitempanel_click");}
 BA.debugLineNum = 603;BA.debugLine="Sub ListItemPanel_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 605;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitempanel_longclick() throws Exception{
try {
		Debug.PushSubsStack("ListItemPanel_LongClick (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,619);
if (RapidSub.canDelegate("listitempanel_longclick")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listitempanel_longclick");}
 BA.debugLineNum = 619;BA.debugLine="Sub ListItemPanel_LongClick";
Debug.ShouldStop(1024);
 BA.debugLineNum = 621;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitempanel_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("ListItemPanel_Touch (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,615);
if (RapidSub.canDelegate("listitempanel_touch")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listitempanel_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 615;BA.debugLine="Sub ListItemPanel_Touch (Action As Int, X As Float";
Debug.ShouldStop(64);
 BA.debugLineNum = 616;BA.debugLine="listsLabelInfo.Text = \"Touch Click\"";
Debug.ShouldStop(128);
taskscl2.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence("Touch Click"));
 BA.debugLineNum = 617;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("ListItemSelected (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1754);
if (RapidSub.canDelegate("listitemselected")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listitemselected", _pan, _listview);}
int _index = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("pan", _pan);
Debug.locals.put("listview", _listview);
 BA.debugLineNum = 1754;BA.debugLine="Sub ListItemSelected(pan As Panel, listview As Cus";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1755;BA.debugLine="For index= 0 To listview.GetSize-1";
Debug.ShouldStop(67108864);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_listview.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_index = 0 ;
for (;(step1 > 0 && _index <= limit1) || (step1 < 0 && _index >= limit1) ;_index = ((int)(0 + _index + step1))  ) {
Debug.locals.put("index", _index);
 BA.debugLineNum = 1756;BA.debugLine="Dim p As Panel = listview.GetPanel(index)";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _listview.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _index))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 1757;BA.debugLine="p.Color = Consts.ColorWhite";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("setColor",taskscl2.mostCurrent._consts._colorwhite /*RemoteObject*/ );
 }
}Debug.locals.put("index", _index);
;
 BA.debugLineNum = 1759;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
Debug.ShouldStop(1073741824);
_pan.runVoidMethod ("setColor",taskscl2.mostCurrent._consts._colorciansoftlight /*RemoteObject*/ );
 BA.debugLineNum = 1760;BA.debugLine="ShowTaskDetails(pan.Tag)";
Debug.ShouldStop(-2147483648);
_showtaskdetails(BA.ObjectToString(_pan.runMethod(false,"getTag")));
 BA.debugLineNum = 1761;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(1);
_windowstatusupdate();
 BA.debugLineNum = 1762;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemselectedrequest(RemoteObject _pan,RemoteObject _listview) throws Exception{
try {
		Debug.PushSubsStack("ListItemSelectedRequest (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,669);
if (RapidSub.canDelegate("listitemselectedrequest")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listitemselectedrequest", _pan, _listview);}
int _index = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("pan", _pan);
Debug.locals.put("listview", _listview);
 BA.debugLineNum = 669;BA.debugLine="Sub ListItemSelectedRequest(pan As Panel, listview";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 670;BA.debugLine="For index= 0 To listview.GetSize-1";
Debug.ShouldStop(536870912);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_listview.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_index = 0 ;
for (;(step1 > 0 && _index <= limit1) || (step1 < 0 && _index >= limit1) ;_index = ((int)(0 + _index + step1))  ) {
Debug.locals.put("index", _index);
 BA.debugLineNum = 671;BA.debugLine="Dim p As Panel = listview.GetPanel(index)";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _listview.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _index))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 672;BA.debugLine="p.Color = Consts.ColorWhite";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("setColor",taskscl2.mostCurrent._consts._colorwhite /*RemoteObject*/ );
 }
}Debug.locals.put("index", _index);
;
 BA.debugLineNum = 674;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
Debug.ShouldStop(2);
_pan.runVoidMethod ("setColor",taskscl2.mostCurrent._consts._colorciansoftlight /*RemoteObject*/ );
 BA.debugLineNum = 675;BA.debugLine="ShowRequestDetails(pan.Tag)";
Debug.ShouldStop(4);
_showrequestdetails(BA.ObjectToString(_pan.runMethod(false,"getTag")));
 BA.debugLineNum = 676;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(8);
_windowstatusupdate();
 BA.debugLineNum = 677;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonadd_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonAdd_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,599);
if (RapidSub.canDelegate("listsbuttonadd_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listsbuttonadd_click");}
 BA.debugLineNum = 599;BA.debugLine="Sub listsButtonAdd_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 601;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("listsButtonClose_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,592);
if (RapidSub.canDelegate("listsbuttonclose_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listsbuttonclose_click");}
 BA.debugLineNum = 592;BA.debugLine="Sub listsButtonClose_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 593;BA.debugLine="Log(\"Back TASKS\")";
Debug.ShouldStop(65536);
taskscl2.mostCurrent.__c.runVoidMethod ("LogImpl","6183173121",RemoteObject.createImmutable("Back TASKS"),0);
 BA.debugLineNum = 594;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
Debug.ShouldStop(131072);
taskscl2.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",taskscl2.processBA,(Object)((taskscl2.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturn")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 595;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
taskscl2.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 596;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(524288);
taskscl2.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 597;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonfilter_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonFilter_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,623);
if (RapidSub.canDelegate("listsbuttonfilter_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listsbuttonfilter_click");}
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
RemoteObject _curr = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._taskfilter");
RemoteObject _sft = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._statusfiltertask");
 BA.debugLineNum = 623;BA.debugLine="Sub listsButtonFilter_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 624;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(32768);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 625;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(65536);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);
 BA.debugLineNum = 626;BA.debugLine="Dim Curr As TaskFilter = Types.MakeTaskFilter(iDi";
Debug.ShouldStop(131072);
_curr = taskscl2.mostCurrent._types.runMethod(false,"_maketaskfilter" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(taskscl2._idialogreqtype),(Object)(taskscl2._idialogreqstatus),(Object)(taskscl2._idialogrequpdtated),(Object)(taskscl2._idialogreqwithrequests),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("Curr", _curr);Debug.locals.put("Curr", _curr);
 BA.debugLineNum = 627;BA.debugLine="Dim sft As StatusFilterTask = Types.MakeStatusFil";
Debug.ShouldStop(262144);
_sft = taskscl2.mostCurrent._types.runMethod(false,"_makestatusfiltertask" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(taskscl2.mostCurrent._sharecode._tasktpractive /*RemoteObject*/ ),(Object)(taskscl2.mostCurrent._sharecode._tasktprinactive /*RemoteObject*/ ),(Object)(taskscl2.mostCurrent._sharecode._tasktprsingular /*RemoteObject*/ ),(Object)(taskscl2.mostCurrent._sharecode._tasktprplural /*RemoteObject*/ ));Debug.locals.put("sft", _sft);Debug.locals.put("sft", _sft);
 BA.debugLineNum = 628;BA.debugLine="Filter.GetTaskFiltersDialog(\"TasksCL2\", Curr, Cur";
Debug.ShouldStop(524288);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_gettaskfiltersdialog" /*void*/ ,(Object)(RemoteObject.createImmutable(("TasksCL2"))),(Object)(_curr),(Object)(taskscl2._currenttab),(Object)(_sft));
 BA.debugLineNum = 629;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listsreturn(RemoteObject _res,RemoteObject _currentcla) throws Exception{
try {
		Debug.PushSubsStack("ListsReturn (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2174);
if (RapidSub.canDelegate("listsreturn")) { xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listsreturn", _res, _currentcla); return;}
ResumableSub_ListsReturn rsub = new ResumableSub_ListsReturn(null,_res,_currentcla);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListsReturn extends BA.ResumableSub {
public ResumableSub_ListsReturn(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _res,RemoteObject _currentcla) {
this.parent = parent;
this._res = _res;
this._currentcla = _currentcla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _res;
RemoteObject _currentcla;
RemoteObject _r1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _r2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished2 = RemoteObject.createImmutable(false);
RemoteObject _r3 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished3 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListsReturn (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2174);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("res", _res);
Debug.locals.put("CurrentCLA", _currentcla);
 BA.debugLineNum = 2176;BA.debugLine="Log(res)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185139202",_res,0);
 BA.debugLineNum = 2181;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessar, Fa";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._pg2msgprocessar /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2182;BA.debugLine="Sleep(250)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "listsreturn"),BA.numberCast(int.class, 250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 2184;BA.debugLine="Dim r1  As ResumableSub = CheckTypeRequestTaskAdd";
Debug.ShouldStop(128);
_r1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r1 = _checktyperequesttaskadds(_currentcla.getField(true,"Request" /*RemoteObject*/ ),_currentcla.getField(true,"Action" /*RemoteObject*/ ));Debug.locals.put("r1", _r1);Debug.locals.put("r1", _r1);
 BA.debugLineNum = 2185;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "listsreturn"), _r1);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 2187;BA.debugLine="Dim r2  As ResumableSub = CheckTypeRequestNewTask";
Debug.ShouldStop(1024);
_r2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r2 = _checktyperequestnewtask(_currentcla.getField(true,"Request" /*RemoteObject*/ ),_currentcla.getField(true,"Action" /*RemoteObject*/ ));Debug.locals.put("r2", _r2);Debug.locals.put("r2", _r2);
 BA.debugLineNum = 2188;BA.debugLine="Wait For(r2) complete (finished2 As Boolean)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "listsreturn"), _r2);
this.state = 3;
return;
case 3:
//C
this.state = -1;
_finished2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished2", _finished2);
;
 BA.debugLineNum = 2190;BA.debugLine="Dim r3  As ResumableSub = CheckTypeRequestNewTask";
Debug.ShouldStop(8192);
_r3 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r3 = _checktyperequestnewtask2(_currentcla.getField(true,"Request" /*RemoteObject*/ ),_currentcla.getField(true,"Action" /*RemoteObject*/ ));Debug.locals.put("r3", _r3);Debug.locals.put("r3", _r3);
 BA.debugLineNum = 2191;BA.debugLine="Wait For(r3) complete (finished3 As Boolean)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "listsreturn"), _r3);
this.state = 4;
return;
case 4:
//C
this.state = -1;
_finished3 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished3", _finished3);
;
 BA.debugLineNum = 2193;BA.debugLine="StartTasksActivity(True, Starter.TaskSearchFilter";
Debug.ShouldStop(65536);
_starttasksactivity(parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent._starter._tasksearchfilter /*RemoteObject*/ ,parent._currenttab);
 BA.debugLineNum = 2195;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2197;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _liststabpanel_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,588);
if (RapidSub.canDelegate("liststabpanel_pageselected")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","liststabpanel_pageselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 588;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 590;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listtyperequests_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listTypeRequests_ItemClick (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,664);
if (RapidSub.canDelegate("listtyperequests_itemclick")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","listtyperequests_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 664;BA.debugLine="Sub listTypeRequests_ItemClick (Index As Int, Valu";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 665;BA.debugLine="CurrentLineItemCL = Index+1";
Debug.ShouldStop(16777216);
taskscl2._currentlineitemcl = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 666;BA.debugLine="ListItemSelectedRequest( listTypeRequests.GetPane";
Debug.ShouldStop(33554432);
_listitemselectedrequest(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), taskscl2.mostCurrent._listtyperequests.runMethod(false,"_getpanel",(Object)(_index)).getObject()),taskscl2.mostCurrent._listtyperequests);
 BA.debugLineNum = 667;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("mainLogo_Click (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,654);
if (RapidSub.canDelegate("mainlogo_click")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","mainlogo_click");}
 BA.debugLineNum = 654;BA.debugLine="Sub mainLogo_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 655;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(16384);
_listsbuttonclose_click();
 BA.debugLineNum = 656;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makelistsearch(RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("MakeListSearch (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,643);
if (RapidSub.canDelegate("makelistsearch")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","makelistsearch", _search);}
RemoteObject _filter = RemoteObject.createImmutable("");
Debug.locals.put("search", _search);
 BA.debugLineNum = 643;BA.debugLine="Sub MakeListSearch(search As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 644;BA.debugLine="If (CurrentTab=0) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",taskscl2._currenttab,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 645;BA.debugLine="Dim Filter As String = $\" and a.tagcode||a.title";
Debug.ShouldStop(16);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(" and a.tagcode||a.title||ifnull(b.tagdesc,'')||ifnull(a.updated_at,'')||ifnull(a.details, '')||ifnull(a.group_tags, '') like '%"),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%'")));Debug.locals.put("Filter", _filter);Debug.locals.put("Filter", _filter);
 }else {
 BA.debugLineNum = 647;BA.debugLine="Dim Filter As String = $\" and a.tagcode||a.title";
Debug.ShouldStop(64);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(" and a.tagcode||a.title||a.version||ifnull(b.tagdesc,'')||ifnull(c.title, '')||ifnull(e.tagdesc, '')||ifnull(a.updated_at,'')||ifnull(a.details, '')||ifnull(a.group_tags, '') like '%"),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%'")));Debug.locals.put("Filter", _filter);Debug.locals.put("Filter", _filter);
 };
 BA.debugLineNum = 649;BA.debugLine="SearchFilter = Filter";
Debug.ShouldStop(256);
taskscl2.mostCurrent._searchfilter = _filter;
 BA.debugLineNum = 650;BA.debugLine="IsFiltered = (Filter <> \"\")";
Debug.ShouldStop(512);
taskscl2._isfiltered = BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable(""))));
 BA.debugLineNum = 651;BA.debugLine="StartTasksActivity(True, Filter, CurrentTab)";
Debug.ShouldStop(1024);
_starttasksactivity(taskscl2.mostCurrent.__c.getField(true,"True"),_filter,taskscl2._currenttab);
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagechangelistener_event(RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("PageChangeListener_Event (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,129);
if (RapidSub.canDelegate("pagechangelistener_event")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","pagechangelistener_event", _methodname, _args);}
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 129;BA.debugLine="Sub PageChangeListener_Event (MethodName As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="If (MethodName = \"onPageScrolled\") Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_methodname,RemoteObject.createImmutable("onPageScrolled")))) { 
 BA.debugLineNum = 131;BA.debugLine="CurrentTab = Args(0)";
Debug.ShouldStop(4);
taskscl2._currenttab = BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 133;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(16);
_windowstatusupdate();
 BA.debugLineNum = 134;BA.debugLine="Return Null";
Debug.ShouldStop(32);
if (true) return taskscl2.mostCurrent.__c.getField(false,"Null");
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private MyPositionLat, MyPositionLon As String";
taskscl2._mypositionlat = RemoteObject.createImmutable("");
taskscl2._mypositionlon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Public Device As Phone";
taskscl2._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _returnshowrequesttaskdetails(RemoteObject _newrequesttype,RemoteObject _tvals) throws Exception{
try {
		Debug.PushSubsStack("ReturnShowRequestTaskDetails (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,704);
if (RapidSub.canDelegate("returnshowrequesttaskdetails")) { xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","returnshowrequesttaskdetails", _newrequesttype, _tvals); return;}
ResumableSub_ReturnShowRequestTaskDetails rsub = new ResumableSub_ReturnShowRequestTaskDetails(null,_newrequesttype,_tvals);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReturnShowRequestTaskDetails extends BA.ResumableSub {
public ResumableSub_ReturnShowRequestTaskDetails(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _newrequesttype,RemoteObject _tvals) {
this.parent = parent;
this._newrequesttype = _newrequesttype;
this._tvals = _tvals;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _newrequesttype;
RemoteObject _tvals;
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newrequest = RemoteObject.createImmutable("");
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _taskname = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _firstchecklist = RemoteObject.createImmutable("");
RemoteObject _firstchecklisttemp = RemoteObject.createImmutable("");
RemoteObject _newrequestitem2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _n = 0;
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _cl_is_father = RemoteObject.createImmutable(0);
RemoteObject _repeatcounter = RemoteObject.createImmutable(0);
RemoteObject _typerequest_tagcode = RemoteObject.createImmutable("");
RemoteObject _cl_position = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _stage = RemoteObject.createImmutable(0);
RemoteObject _resfields = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok = RemoteObject.createImmutable(false);
RemoteObject _resa1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok1 = RemoteObject.createImmutable(false);
RemoteObject _resa2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok2 = RemoteObject.createImmutable(false);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _newrequestcode = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._createrequestreturn");
RemoteObject _questparams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data_bulk_upload = RemoteObject.createImmutable(0);
RemoteObject _data_bulk_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _affected_from = RemoteObject.createImmutable("");
RemoteObject _related_to = RemoteObject.createImmutable("");
RemoteObject _origin_master = RemoteObject.createImmutable("");
RemoteObject _origin_master_condition = RemoteObject.createImmutable("");
RemoteObject _origin_details = RemoteObject.createImmutable("");
RemoteObject _origin_details_condition = RemoteObject.createImmutable("");
RemoteObject _field_group_checklist = RemoteObject.createImmutable("");
RemoteObject _field_group_chapter = RemoteObject.createImmutable("");
RemoteObject _is_object_relation = RemoteObject.createImmutable(0);
RemoteObject _ifield = RemoteObject.createImmutable(0);
RemoteObject _gfield = RemoteObject.createImmutable("");
RemoteObject _warehousecode = RemoteObject.createImmutable("");
RemoteObject _obj_tc = RemoteObject.createImmutable("");
RemoteObject _snewsql = RemoteObject.createImmutable("");
RemoteObject _rrecord = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _firstitem = RemoteObject.createImmutable("");
RemoteObject _firstuk = RemoteObject.createImmutable("");
RemoteObject _chapter = RemoteObject.createImmutable("");
RemoteObject _cntfieldval04 = RemoteObject.createImmutable(0);
RemoteObject _cntrepeatfieldcounter = RemoteObject.createImmutable(0);
RemoteObject _posicao = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _group = RemoteObject.createImmutable("");
RemoteObject _qtd = RemoteObject.createImmutable(0);
RemoteObject _rrepeatcounter = RemoteObject.createImmutable(0);
RemoteObject _robject = RemoteObject.createImmutable("");
RemoteObject _rtitle = RemoteObject.createImmutable("");
RemoteObject _ritem = RemoteObject.createImmutable("");
RemoteObject _runiquekey = RemoteObject.createImmutable("");
RemoteObject _exec_status = RemoteObject.createImmutable(0);
RemoteObject _operinsert = RemoteObject.createImmutable(false);
RemoteObject _ss1 = RemoteObject.createImmutable("");
RemoteObject _rs1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _ssql1 = RemoteObject.createImmutable("");
RemoteObject _listitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _datafields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mapitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _finalsql = RemoteObject.createImmutable("");
RemoteObject _rsartigos = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _mapfields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _nfields = 0;
RemoteObject _colname = RemoteObject.createImmutable("");
RemoteObject _colvalue = RemoteObject.createImmutable("");
RemoteObject _aclajson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newparams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _jobd2s = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");
RemoteObject _thedata = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _cntposicao = RemoteObject.createImmutable(0);
RemoteObject _incolitems = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _posis = RemoteObject.createImmutable(0);
int _a1 = 0;
RemoteObject _tag = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _tasktype = RemoteObject.createImmutable(0);
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _actionkey = RemoteObject.createImmutable("");
RemoteObject _task = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _sdate = RemoteObject.createImmutable("");
RemoteObject _stime = RemoteObject.createImmutable("");
RemoteObject _close_type = RemoteObject.createImmutable(0);
RemoteObject _result_type = RemoteObject.createImmutable(0);
RemoteObject _result_values = RemoteObject.createImmutable("");
RemoteObject _clainfo = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requesttaskinfo");
RemoteObject _cla = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestcla");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tr_is_model = RemoteObject.createImmutable(0);
int step46;
int limit46;
int step195;
int limit195;
int step283;
int limit283;
int step349;
int limit349;
int step398;
int limit398;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReturnShowRequestTaskDetails (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,704);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("newRequestType", _newrequesttype);
Debug.locals.put("TVals", _tvals);
 BA.debugLineNum = 713;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*RemoteObject*/ )));
 BA.debugLineNum = 714;BA.debugLine="Try";
Debug.ShouldStop(512);
if (true) break;

case 1:
//try
this.state = 242;
this.catchState = 241;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 241;
 BA.debugLineNum = 715;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(1024);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 716;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(2048);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 718;BA.debugLine="If Utils.NNE(newRequestType) Then";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//if
this.state = 239;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequesttype)).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 238;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 720;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTag";
Debug.ShouldStop(32768);
_newrequest = parent.mostCurrent._utils.runMethod(true,"_makerequesttagcode" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newRequest", _newrequest);Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 721;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(65536);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 722;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(131072);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 723;BA.debugLine="Dim TaskName As String = TVals.Get(0)";
Debug.ShouldStop(262144);
_taskname = BA.ObjectToString(_tvals.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("TaskName", _taskname);Debug.locals.put("TaskName", _taskname);
 BA.debugLineNum = 725;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
Debug.ShouldStop(1048576);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 727;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(4194304);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 728;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 729;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 730;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 731;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE_";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("route_tagcode"))),(Object)((RemoteObject.createImmutable("ROUTE__NONE__"))));
 BA.debugLineNum = 732;BA.debugLine="newExecution.Put(\"is_child\", 0)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_child"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 733;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("prerequest"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 734;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 735;BA.debugLine="newExecution.Put(\"state_id\", 4)";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state_id"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 736;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_date"))),(Object)((_newdate)));
 BA.debugLineNum = 737;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_time"))),(Object)((_newtime)));
 BA.debugLineNum = 738;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execdate_type"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 739;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dayweekmonth"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 740;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 741;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 742;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 743;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERN";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin_tagcode"))),(Object)((RemoteObject.createImmutable("TORI_INTERNAL"))));
 BA.debugLineNum = 744;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"__NONE__\")";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 745;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 746;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("technical_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 747;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("team_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 748;BA.debugLine="newExecution.Put(\"local_tagcode\", \"\")";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("local_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 749;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newRequ";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("typerequest_tagcode"))),(Object)((_newrequesttype)));
 BA.debugLineNum = 750;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.S";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vehicle_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_vehicle_object /*RemoteObject*/ )));
 BA.debugLineNum = 751;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("confirmed"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 752;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 753;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(65536);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 754;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(131072);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 755;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(262144);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 756;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
Debug.ShouldStop(524288);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 758;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 1,";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("dta_requests")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 760;BA.debugLine="Dim FirstCheckList As String = \"\"";
Debug.ShouldStop(8388608);
_firstchecklist = BA.ObjectToString("");Debug.locals.put("FirstCheckList", _firstchecklist);Debug.locals.put("FirstCheckList", _firstchecklist);
 BA.debugLineNum = 761;BA.debugLine="Dim FirstCheckListTemp As String = \"\"";
Debug.ShouldStop(16777216);
_firstchecklisttemp = BA.ObjectToString("");Debug.locals.put("FirstCheckListTemp", _firstchecklisttemp);Debug.locals.put("FirstCheckListTemp", _firstchecklisttemp);
 BA.debugLineNum = 763;BA.debugLine="Dim newRequestItem2 As Map";
Debug.ShouldStop(67108864);
_newrequestitem2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem2", _newrequestitem2);
 BA.debugLineNum = 764;BA.debugLine="newRequestItem2.Initialize";
Debug.ShouldStop(134217728);
_newrequestitem2.runVoidMethod ("Initialize");
 BA.debugLineNum = 765;BA.debugLine="For n=0 To TVals.Size-1";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//for
this.state = 30;
step46 = 1;
limit46 = RemoteObject.solve(new RemoteObject[] {_tvals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 243;
if (true) break;

case 243:
//C
this.state = 30;
if ((step46 > 0 && _n <= limit46) || (step46 < 0 && _n >= limit46)) this.state = 9;
if (true) break;

case 244:
//C
this.state = 243;
_n = ((int)(0 + _n + step46)) ;
Debug.locals.put("n", _n);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 766;BA.debugLine="Dim tagcode As String = TVals.Get(n)";
Debug.ShouldStop(536870912);
_tagcode = BA.ObjectToString(_tvals.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 767;BA.debugLine="If (n = 0) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 10:
//if
this.state = 13;
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_n),BA.numberCast(double.class, 0)))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 768;BA.debugLine="FirstCheckListTemp = tagcode.trim";
Debug.ShouldStop(-2147483648);
_firstchecklisttemp = _tagcode.runMethod(true,"trim");Debug.locals.put("FirstCheckListTemp", _firstchecklisttemp);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 771;BA.debugLine="Dim cl_is_father As Int = DBStructures.GetScri";
Debug.ShouldStop(4);
_cl_is_father = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select cl_is_father from dta_typerequests_tasks_adds\n"),RemoteObject.createImmutable("											where typerequest_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequesttype.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("cl_is_father")));Debug.locals.put("cl_is_father", _cl_is_father);Debug.locals.put("cl_is_father", _cl_is_father);
 BA.debugLineNum = 774;BA.debugLine="If (cl_is_father = 1) Then";
Debug.ShouldStop(32);
if (true) break;

case 14:
//if
this.state = 17;
if ((RemoteObject.solveBoolean("=",_cl_is_father,BA.numberCast(double.class, 1)))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 775;BA.debugLine="FirstCheckList = tagcode.trim";
Debug.ShouldStop(64);
_firstchecklist = _tagcode.runMethod(true,"trim");Debug.locals.put("FirstCheckList", _firstchecklist);
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 778;BA.debugLine="Dim repeatcounter As Int = DBStructures.GetCou";
Debug.ShouldStop(512);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getcountofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(" and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 784;BA.debugLine="Dim typerequest_tagcode As String = DBStructur";
Debug.ShouldStop(32768);
_typerequest_tagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select typerequest_tagcode from dta_requests where 1=1\n"),RemoteObject.createImmutable("																						and tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("typerequest_tagcode")));Debug.locals.put("typerequest_tagcode", _typerequest_tagcode);Debug.locals.put("typerequest_tagcode", _typerequest_tagcode);
 BA.debugLineNum = 787;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 18:
//try
this.state = 29;
this.catchState = 28;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 28;
 BA.debugLineNum = 788;BA.debugLine="If Utils.NNE(typerequest_tagcode) Then";
Debug.ShouldStop(524288);
if (true) break;

case 21:
//if
this.state = 26;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_typerequest_tagcode)).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 789;BA.debugLine="Dim CL_Position As Int = DBStructures.GetScr";
Debug.ShouldStop(1048576);
_cl_position = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select position from dta_typerequests_tasks where 1=1\n"),RemoteObject.createImmutable("																				and typerequest_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_typerequest_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																				and task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("position")));Debug.locals.put("CL_Position", _cl_position);Debug.locals.put("CL_Position", _cl_position);
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 793;BA.debugLine="Dim CL_Position As Int = 0";
Debug.ShouldStop(16777216);
_cl_position = BA.numberCast(int.class, 0);Debug.locals.put("CL_Position", _cl_position);Debug.locals.put("CL_Position", _cl_position);
 if (true) break;

case 26:
//C
this.state = 29;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 241;
 BA.debugLineNum = 797;BA.debugLine="Dim CL_Position As Int = 0";
Debug.ShouldStop(268435456);
_cl_position = BA.numberCast(int.class, 0);Debug.locals.put("CL_Position", _cl_position);Debug.locals.put("CL_Position", _cl_position);
 BA.debugLineNum = 798;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287326",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 29:
//C
this.state = 244;
this.catchState = 241;
;
 BA.debugLineNum = 802;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(2);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 803;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(4);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 804;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 805;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 806;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 807;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode.t";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tagcode.runMethod(true,"trim"))));
 BA.debugLineNum = 808;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 809;BA.debugLine="newExecution.Put(\"position\", CL_Position) ' ES";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)((_cl_position)));
 BA.debugLineNum = 810;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 811;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 812;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 813;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 814;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 815;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 816;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 817;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 818;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 819;BA.debugLine="newExecution.Put(\"repeatcounter\", repeatcounte";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 820;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 821;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(1048576);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 822;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(2097152);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 823;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(4194304);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 824;BA.debugLine="newRequestItem2.Put($\"${n}\"$, ListOfMaps)";
Debug.ShouldStop(8388608);
_newrequestitem2.runVoidMethod ("Put",(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable(""))))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 826;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 2";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 828;BA.debugLine="newRequestItem.Put(\"relation\", newRequestItem2)";
Debug.ShouldStop(134217728);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_newrequestitem2.getObject())));
 BA.debugLineNum = 830;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
Debug.ShouldStop(536870912);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 835;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("				tagcode,position,execute_value,execute_format_title,\n"),RemoteObject.createImmutable("				confirmed,changed_value,cbr_id)\n"),RemoteObject.createImmutable("				select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"),RemoteObject.createImmutable("				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("				x.execute_value, x.execute_format_title, \n"),RemoteObject.createImmutable("				x.confirmed, x.changed_value, 0 As cbr_id\n"),RemoteObject.createImmutable("				from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode, \n"),RemoteObject.createImmutable("				c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position, \n"),RemoteObject.createImmutable("				a.position As relposition, '' as execute_value, \n"),RemoteObject.createImmutable("				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("				0 as confirmed, '' as changed_value\n"),RemoteObject.createImmutable("				from dta_requests_relations As a\n"),RemoteObject.createImmutable("				inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("				where a.type_relation=0 and a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				union\n"),RemoteObject.createImmutable("				select d.id, '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"),RemoteObject.createImmutable("				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) As position,\n"),RemoteObject.createImmutable("				a.position as relposition, '' as execute_value, \n"),RemoteObject.createImmutable("				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("				0 as confirmed, '' as changed_value\n"),RemoteObject.createImmutable("				from dta_requests_relations as a\n"),RemoteObject.createImmutable("				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode \n"),RemoteObject.createImmutable("				from dta_requests_relations where request_tagcode ='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("')) as x\n"),RemoteObject.createImmutable("				order by  x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 866;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL,";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql),(Object)(_newrequest));
 BA.debugLineNum = 867;BA.debugLine="Dim stage As Int = 0";
Debug.ShouldStop(4);
_stage = BA.numberCast(int.class, 0);Debug.locals.put("stage", _stage);Debug.locals.put("stage", _stage);
 BA.debugLineNum = 869;BA.debugLine="Dim resfields As ResumableSub = createRequestFi";
Debug.ShouldStop(16);
_resfields = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resfields = _createrequestfields(_newrequest,_newrequesttype);Debug.locals.put("resfields", _resfields);Debug.locals.put("resfields", _resfields);
 BA.debugLineNum = 870;BA.debugLine="Wait For(resfields) Complete (resfieldsOk As Bo";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"), _resfields);
this.state = 245;
return;
case 245:
//C
this.state = 31;
_resfieldsok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk", _resfieldsok);
;
 BA.debugLineNum = 872;BA.debugLine="Dim resa1 As ResumableSub = createRequestEntity";
Debug.ShouldStop(128);
_resa1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resa1 = _createrequestentityrelation(_newrequest,RemoteObject.createImmutable(""));Debug.locals.put("resa1", _resa1);Debug.locals.put("resa1", _resa1);
 BA.debugLineNum = 873;BA.debugLine="Wait For(resa1) Complete (resfieldsOk1 As Boole";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"), _resa1);
this.state = 246;
return;
case 246:
//C
this.state = 31;
_resfieldsok1 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk1", _resfieldsok1);
;
 BA.debugLineNum = 875;BA.debugLine="Dim resa2 As ResumableSub = createRequestObject";
Debug.ShouldStop(1024);
_resa2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resa2 = _createrequestobjectrelation(_newrequest,RemoteObject.createImmutable(""));Debug.locals.put("resa2", _resa2);Debug.locals.put("resa2", _resa2);
 BA.debugLineNum = 876;BA.debugLine="Wait For(resa2) Complete (resfieldsOk2 As Boole";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"), _resa2);
this.state = 247;
return;
case 247:
//C
this.state = 31;
_resfieldsok2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk2", _resfieldsok2);
;
 BA.debugLineNum = 879;BA.debugLine="Dim res As ResumableSub = UploadNewRequest2Serv";
Debug.ShouldStop(16384);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _uploadnewrequest2server2(_newrequest,_newrequestitem,BA.ObjectToString("1"),_stage);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 880;BA.debugLine="Wait For(res) Complete (NewRequestCode As Creat";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"), _res);
this.state = 248;
return;
case 248:
//C
this.state = 31;
_newrequestcode = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("NewRequestCode", _newrequestcode);
;
 BA.debugLineNum = 888;BA.debugLine="If(Utils.NNE(newRequest)) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 31:
//if
this.state = 38;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequest))).<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 889;BA.debugLine="If (Not(newRequest = NewRequestCode.RequestTag";
Debug.ShouldStop(16777216);
if (true) break;

case 34:
//if
this.state = 37;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_newrequest,_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 890;BA.debugLine="Dim sSQL As String = $\"update dta_requests se";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 891;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 892;BA.debugLine="Dim sSQL As String = $\"update dta_requests_ad";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 893;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 895;BA.debugLine="Dim sSQL As String = $\"update dta_requests_en";
Debug.ShouldStop(1073741824);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_entities set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 896;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 898;BA.debugLine="Dim sSQL As String = $\"update dta_requests_ob";
Debug.ShouldStop(2);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_objects set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 899;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 901;BA.debugLine="Dim sSQL As String = $\"update dta_requests_co";
Debug.ShouldStop(16);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_contacts set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 902;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 904;BA.debugLine="Dim sSQL As String = $\"update dta_requests_fi";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_fields set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 905;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 907;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
Debug.ShouldStop(1024);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 908;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 909;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
Debug.ShouldStop(4096);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 910;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 912;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
Debug.ShouldStop(32768);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 913;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(65536);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 914;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
Debug.ShouldStop(131072);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 915;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(262144);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 916;BA.debugLine="newRequest = NewRequestCode.RequestTagcode";
Debug.ShouldStop(524288);
_newrequest = _newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ );Debug.locals.put("newRequest", _newrequest);
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 920;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"),BA.numberCast(int.class, 2000));
this.state = 249;
return;
case 249:
//C
this.state = 39;
;
 BA.debugLineNum = 925;BA.debugLine="Dim QuestParams As Map = DBStructures.GetScript";
Debug.ShouldStop(268435456);
_questparams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_questparams = parent.mostCurrent._dbstructures.runMethod(false,"_getscriptcolumnstrevcjsonmap" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select distinct paramters \n"),RemoteObject.createImmutable("												from dta_tasks_adds where 1=1\n"),RemoteObject.createImmutable("												and tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("paramters")));Debug.locals.put("QuestParams", _questparams);Debug.locals.put("QuestParams", _questparams);
 BA.debugLineNum = 929;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 39:
//try
this.state = 44;
this.catchState = 43;
this.state = 41;
if (true) break;

case 41:
//C
this.state = 44;
this.catchState = 43;
 BA.debugLineNum = 930;BA.debugLine="Dim data_bulk_upload As Int = QuestParams.Get(";
Debug.ShouldStop(2);
_data_bulk_upload = BA.numberCast(int.class, _questparams.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_bulk_upload")))));Debug.locals.put("data_bulk_upload", _data_bulk_upload);Debug.locals.put("data_bulk_upload", _data_bulk_upload);
 Debug.CheckDeviceExceptions();
if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 241;
 BA.debugLineNum = 932;BA.debugLine="Dim data_bulk_upload As Int = 0";
Debug.ShouldStop(8);
_data_bulk_upload = BA.numberCast(int.class, 0);Debug.locals.put("data_bulk_upload", _data_bulk_upload);Debug.locals.put("data_bulk_upload", _data_bulk_upload);
 BA.debugLineNum = 933;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287461",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 936;BA.debugLine="If Utils.Int2Bool(data_bulk_upload) Then";
Debug.ShouldStop(128);

case 44:
//if
this.state = 170;
this.catchState = 241;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_data_bulk_upload)).<Boolean>get().booleanValue()) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 938;BA.debugLine="Dim data_bulk_info As Map = QuestParams.Get(\"d";
Debug.ShouldStop(512);
_data_bulk_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data_bulk_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _questparams.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_bulk_info")))));Debug.locals.put("data_bulk_info", _data_bulk_info);
 BA.debugLineNum = 939;BA.debugLine="Dim affected_from As String = data_bulk_info.G";
Debug.ShouldStop(1024);
_affected_from = BA.ObjectToString(_data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("affected_from")))));Debug.locals.put("affected_from", _affected_from);Debug.locals.put("affected_from", _affected_from);
 BA.debugLineNum = 940;BA.debugLine="Dim related_to As String = data_bulk_info.Get(";
Debug.ShouldStop(2048);
_related_to = BA.ObjectToString(_data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("related_to")))));Debug.locals.put("related_to", _related_to);Debug.locals.put("related_to", _related_to);
 BA.debugLineNum = 941;BA.debugLine="Dim origin_master As String = data_bulk_info.G";
Debug.ShouldStop(4096);
_origin_master = BA.ObjectToString(_data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("origin_master")))));Debug.locals.put("origin_master", _origin_master);Debug.locals.put("origin_master", _origin_master);
 BA.debugLineNum = 942;BA.debugLine="Dim origin_master_condition As String = data_b";
Debug.ShouldStop(8192);
_origin_master_condition = BA.ObjectToString(_data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("origin_master_condition")))));Debug.locals.put("origin_master_condition", _origin_master_condition);Debug.locals.put("origin_master_condition", _origin_master_condition);
 BA.debugLineNum = 943;BA.debugLine="Dim origin_details As String = data_bulk_info.";
Debug.ShouldStop(16384);
_origin_details = BA.ObjectToString(_data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("origin_details")))));Debug.locals.put("origin_details", _origin_details);Debug.locals.put("origin_details", _origin_details);
 BA.debugLineNum = 944;BA.debugLine="Dim origin_details_condition As String = data_";
Debug.ShouldStop(32768);
_origin_details_condition = BA.ObjectToString(_data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("origin_details_condition")))));Debug.locals.put("origin_details_condition", _origin_details_condition);Debug.locals.put("origin_details_condition", _origin_details_condition);
 BA.debugLineNum = 945;BA.debugLine="Dim field_group_checklist As String = data_bul";
Debug.ShouldStop(65536);
_field_group_checklist = BA.ObjectToString(_data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field_group_checklist")))));Debug.locals.put("field_group_checklist", _field_group_checklist);Debug.locals.put("field_group_checklist", _field_group_checklist);
 BA.debugLineNum = 946;BA.debugLine="Dim field_group_chapter As String = data_bulk_";
Debug.ShouldStop(131072);
_field_group_chapter = BA.ObjectToString(_data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("field_group_chapter")))));Debug.locals.put("field_group_chapter", _field_group_chapter);Debug.locals.put("field_group_chapter", _field_group_chapter);
 BA.debugLineNum = 947;BA.debugLine="Dim is_object_relation As Int = data_bulk_info";
Debug.ShouldStop(262144);
_is_object_relation = BA.numberCast(int.class, _data_bulk_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_object_relation")))));Debug.locals.put("is_object_relation", _is_object_relation);Debug.locals.put("is_object_relation", _is_object_relation);
 BA.debugLineNum = 948;BA.debugLine="Dim iField As Int = DBStructures.GetScriptColu";
Debug.ShouldStop(524288);
_ifield = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select reference from type_inouttypes where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_origin_master))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("reference")));Debug.locals.put("iField", _ifield);Debug.locals.put("iField", _ifield);
 BA.debugLineNum = 949;BA.debugLine="Dim gField As String = \"\"";
Debug.ShouldStop(1048576);
_gfield = BA.ObjectToString("");Debug.locals.put("gField", _gfield);Debug.locals.put("gField", _gfield);
 BA.debugLineNum = 950;BA.debugLine="Dim WareHouseCode As String = \"\"";
Debug.ShouldStop(2097152);
_warehousecode = BA.ObjectToString("");Debug.locals.put("WareHouseCode", _warehousecode);Debug.locals.put("WareHouseCode", _warehousecode);
 BA.debugLineNum = 951;BA.debugLine="Dim Obj_Tc As String = \"\"";
Debug.ShouldStop(4194304);
_obj_tc = BA.ObjectToString("");Debug.locals.put("Obj_Tc", _obj_tc);Debug.locals.put("Obj_Tc", _obj_tc);
 BA.debugLineNum = 953;BA.debugLine="If Utils.Int2Bool(is_object_relation) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 47:
//if
this.state = 50;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_is_object_relation)).<Boolean>get().booleanValue()) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 954;BA.debugLine="Obj_Tc = DBStructures.GetScriptColumnSTrEVC($";
Debug.ShouldStop(33554432);
_obj_tc = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select object_tagcode from dta_requests where tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("object_tagcode")));Debug.locals.put("Obj_Tc", _obj_tc);
 if (true) break;
;
 BA.debugLineNum = 957;BA.debugLine="If iField = 1 Then";
Debug.ShouldStop(268435456);

case 50:
//if
this.state = 79;
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 1))) { 
this.state = 52;
}else 
{ BA.debugLineNum = 959;BA.debugLine="else If iField = 2 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 2))) { 
this.state = 54;
}else 
{ BA.debugLineNum = 961;BA.debugLine="else If iField = 3 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 3))) { 
this.state = 56;
}else 
{ BA.debugLineNum = 963;BA.debugLine="else If iField = 4 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 4))) { 
this.state = 58;
}else 
{ BA.debugLineNum = 965;BA.debugLine="else If iField = 5 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 5))) { 
this.state = 60;
}else 
{ BA.debugLineNum = 967;BA.debugLine="else If iField = 6 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 6))) { 
this.state = 62;
}else 
{ BA.debugLineNum = 974;BA.debugLine="else If iField = 8 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 8))) { 
this.state = 70;
}else 
{ BA.debugLineNum = 976;BA.debugLine="else If iField = 9 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 9))) { 
this.state = 72;
}else 
{ BA.debugLineNum = 978;BA.debugLine="else If iField = 12 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 12))) { 
this.state = 74;
}else 
{ BA.debugLineNum = 980;BA.debugLine="else If iField = 14 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_ifield,BA.numberCast(double.class, 14))) { 
this.state = 76;
}else {
this.state = 78;
}}}}}}}}}}
if (true) break;

case 52:
//C
this.state = 79;
 BA.debugLineNum = 958;BA.debugLine="gField = \"dta_technicals\"";
Debug.ShouldStop(536870912);
_gfield = BA.ObjectToString("dta_technicals");Debug.locals.put("gField", _gfield);
 if (true) break;

case 54:
//C
this.state = 79;
 BA.debugLineNum = 960;BA.debugLine="gField = \"dta_departments\"";
Debug.ShouldStop(-2147483648);
_gfield = BA.ObjectToString("dta_departments");Debug.locals.put("gField", _gfield);
 if (true) break;

case 56:
//C
this.state = 79;
 BA.debugLineNum = 962;BA.debugLine="gField = \"dta_teams\"";
Debug.ShouldStop(2);
_gfield = BA.ObjectToString("dta_teams");Debug.locals.put("gField", _gfield);
 if (true) break;

case 58:
//C
this.state = 79;
 BA.debugLineNum = 964;BA.debugLine="gField = \"dta_objects\"";
Debug.ShouldStop(8);
_gfield = BA.ObjectToString("dta_objects");Debug.locals.put("gField", _gfield);
 if (true) break;

case 60:
//C
this.state = 79;
 BA.debugLineNum = 966;BA.debugLine="gField = \"\" 'Empresas";
Debug.ShouldStop(32);
_gfield = BA.ObjectToString("");Debug.locals.put("gField", _gfield);
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 968;BA.debugLine="gField = \"dta_warehouses\"";
Debug.ShouldStop(128);
_gfield = BA.ObjectToString("dta_warehouses");Debug.locals.put("gField", _gfield);
 BA.debugLineNum = 969;BA.debugLine="If Utils.Int2Bool(is_object_relation) And Uti";
Debug.ShouldStop(256);
if (true) break;

case 63:
//if
this.state = 68;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_is_object_relation))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_obj_tc)))) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
 BA.debugLineNum = 970;BA.debugLine="WareHouseCode = DBStructures.GetScriptColumn";
Debug.ShouldStop(512);
_warehousecode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select tagcode from dta_warehouses where object_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_obj_tc))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("WareHouseCode", _warehousecode);
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 972;BA.debugLine="WareHouseCode = related_to";
Debug.ShouldStop(2048);
_warehousecode = _related_to;Debug.locals.put("WareHouseCode", _warehousecode);
 if (true) break;

case 68:
//C
this.state = 79;
;
 if (true) break;

case 70:
//C
this.state = 79;
 BA.debugLineNum = 975;BA.debugLine="gField = \"dta_articles\"";
Debug.ShouldStop(16384);
_gfield = BA.ObjectToString("dta_articles");Debug.locals.put("gField", _gfield);
 if (true) break;

case 72:
//C
this.state = 79;
 BA.debugLineNum = 977;BA.debugLine="gField = \"aut_users\"";
Debug.ShouldStop(65536);
_gfield = BA.ObjectToString("aut_users");Debug.locals.put("gField", _gfield);
 if (true) break;

case 74:
//C
this.state = 79;
 BA.debugLineNum = 979;BA.debugLine="gField = \"dta_equipments\"";
Debug.ShouldStop(262144);
_gfield = BA.ObjectToString("dta_equipments");Debug.locals.put("gField", _gfield);
 if (true) break;

case 76:
//C
this.state = 79;
 BA.debugLineNum = 981;BA.debugLine="gField  = \"dta_objects\"";
Debug.ShouldStop(1048576);
_gfield = BA.ObjectToString("dta_objects");Debug.locals.put("gField", _gfield);
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 983;BA.debugLine="gField = \"dta_articles\"";
Debug.ShouldStop(4194304);
_gfield = BA.ObjectToString("dta_articles");Debug.locals.put("gField", _gfield);
 if (true) break;
;
 BA.debugLineNum = 987;BA.debugLine="If (gField = \"dta_warehouses\") Then";
Debug.ShouldStop(67108864);

case 79:
//if
this.state = 129;
if ((RemoteObject.solveBoolean("=",_gfield,RemoteObject.createImmutable("dta_warehouses")))) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 988;BA.debugLine="Dim sNewSQL As String = $\"select x.title as a";
Debug.ShouldStop(134217728);
_snewsql = (RemoteObject.concat(RemoteObject.createImmutable("select x.title as article_title, x.tagcode as article_tagcode, x.*, e.* from (\n"),RemoteObject.createImmutable("							select  ifnull(b.title,'') as group_title, ifnull(c.tagdesc,'') as type_title, a.*, d.qtd as qtdw \n"),RemoteObject.createImmutable("							from dta_articles as a\n"),RemoteObject.createImmutable("							left join dta_articles_groups as b on (b.tagcode=a.article_group)\n"),RemoteObject.createImmutable("							left join type_articlestypes as c on (c.tagcode=a.article_type)\n"),RemoteObject.createImmutable("							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and\n"),RemoteObject.createImmutable("								d.warehouse_tagcode in ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_warehousecode))),RemoteObject.createImmutable("'))\n"),RemoteObject.createImmutable("							) As x\n"),RemoteObject.createImmutable("							, dta_requests_values As e\n"),RemoteObject.createImmutable("							inner join dta_tasks_items As f on (f.task_tagcode=e.task_tagcode\n"),RemoteObject.createImmutable("								And f.item_tagcode=e.item_tagcode\n"),RemoteObject.createImmutable("								And f.unique_key=e.unique_key)\n"),RemoteObject.createImmutable("							where 1=1\n"),RemoteObject.createImmutable("							And e.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("							And e.task_tagcode in ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable("							And f.`level`>0\n"),RemoteObject.createImmutable("							order by x.group_title, x.title")));Debug.locals.put("sNewSQL", _snewsql);Debug.locals.put("sNewSQL", _snewsql);
 BA.debugLineNum = 1006;BA.debugLine="Dim rRecord As Cursor = Starter.LocalSQLEVC.E";
Debug.ShouldStop(8192);
_rrecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_rrecord = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_snewsql)));Debug.locals.put("rRecord", _rrecord);
 BA.debugLineNum = 1010;BA.debugLine="If rRecord.RowCount > 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 82:
//if
this.state = 128;
if (RemoteObject.solveBoolean(">",_rrecord.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 1011;BA.debugLine="Dim FirstItem As String = \"\"";
Debug.ShouldStop(262144);
_firstitem = BA.ObjectToString("");Debug.locals.put("FirstItem", _firstitem);Debug.locals.put("FirstItem", _firstitem);
 BA.debugLineNum = 1012;BA.debugLine="Dim FirstUK As String = \"\"";
Debug.ShouldStop(524288);
_firstuk = BA.ObjectToString("");Debug.locals.put("FirstUK", _firstuk);Debug.locals.put("FirstUK", _firstuk);
 BA.debugLineNum = 1013;BA.debugLine="Dim Chapter As String = \"\"";
Debug.ShouldStop(1048576);
_chapter = BA.ObjectToString("");Debug.locals.put("Chapter", _chapter);Debug.locals.put("Chapter", _chapter);
 BA.debugLineNum = 1014;BA.debugLine="Dim cntFieldVal04 As Int = -1";
Debug.ShouldStop(2097152);
_cntfieldval04 = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("cntFieldVal04", _cntfieldval04);Debug.locals.put("cntFieldVal04", _cntfieldval04);
 BA.debugLineNum = 1015;BA.debugLine="Dim cntRepeatFieldCounter As Int = 0";
Debug.ShouldStop(4194304);
_cntrepeatfieldcounter = BA.numberCast(int.class, 0);Debug.locals.put("cntRepeatFieldCounter", _cntrepeatfieldcounter);Debug.locals.put("cntRepeatFieldCounter", _cntrepeatfieldcounter);
 BA.debugLineNum = 1016;BA.debugLine="Dim Posicao As Int = 1";
Debug.ShouldStop(8388608);
_posicao = BA.numberCast(int.class, 1);Debug.locals.put("Posicao", _posicao);Debug.locals.put("Posicao", _posicao);
 BA.debugLineNum = 1017;BA.debugLine="Log(rRecord.RowCount)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287545",BA.NumberToString(_rrecord.runMethod(true,"getRowCount")),0);
 BA.debugLineNum = 1018;BA.debugLine="For Row = 0 To rRecord.RowCount-1";
Debug.ShouldStop(33554432);
if (true) break;

case 85:
//for
this.state = 127;
step195 = 1;
limit195 = RemoteObject.solve(new RemoteObject[] {_rrecord.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
this.state = 250;
if (true) break;

case 250:
//C
this.state = 127;
if ((step195 > 0 && _row <= limit195) || (step195 < 0 && _row >= limit195)) this.state = 87;
if (true) break;

case 251:
//C
this.state = 250;
_row = ((int)(0 + _row + step195)) ;
Debug.locals.put("Row", _row);
if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 1019;BA.debugLine="rRecord.Position = Row";
Debug.ShouldStop(67108864);
_rrecord.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 1020;BA.debugLine="Dim Group As String = rRecord.GetString(\"gr";
Debug.ShouldStop(134217728);
_group = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("group_title")));Debug.locals.put("Group", _group);Debug.locals.put("Group", _group);
 BA.debugLineNum = 1021;BA.debugLine="Dim Qtd As Int = rRecord.GetInt(\"qtdw\")";
Debug.ShouldStop(268435456);
_qtd = _rrecord.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("qtdw")));Debug.locals.put("Qtd", _qtd);Debug.locals.put("Qtd", _qtd);
 BA.debugLineNum = 1022;BA.debugLine="Dim RRepeatcounter As Int = rRecord.GetInt(";
Debug.ShouldStop(536870912);
_rrepeatcounter = _rrecord.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("RRepeatcounter", _rrepeatcounter);Debug.locals.put("RRepeatcounter", _rrepeatcounter);
 BA.debugLineNum = 1023;BA.debugLine="Dim RObject As String = rRecord.GetString(\"";
Debug.ShouldStop(1073741824);
_robject = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("article_tagcode")));Debug.locals.put("RObject", _robject);Debug.locals.put("RObject", _robject);
 BA.debugLineNum = 1024;BA.debugLine="Dim RTitle As String = rRecord.GetString(\"a";
Debug.ShouldStop(-2147483648);
_rtitle = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("article_title")));Debug.locals.put("RTitle", _rtitle);Debug.locals.put("RTitle", _rtitle);
 BA.debugLineNum = 1025;BA.debugLine="Dim RItem As String = rRecord.GetString(\"it";
Debug.ShouldStop(1);
_ritem = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("item_tagcode")));Debug.locals.put("RItem", _ritem);Debug.locals.put("RItem", _ritem);
 BA.debugLineNum = 1026;BA.debugLine="Dim RUniqueKey As String = rRecord.GetStrin";
Debug.ShouldStop(2);
_runiquekey = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("RUniqueKey", _runiquekey);Debug.locals.put("RUniqueKey", _runiquekey);
 BA.debugLineNum = 1031;BA.debugLine="If Not(Chapter=Group) Then ' Capitulo e dif";
Debug.ShouldStop(64);
if (true) break;

case 88:
//if
this.state = 109;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_chapter,_group)))).<Boolean>get().booleanValue()) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 1032;BA.debugLine="If (Row = 0) Then";
Debug.ShouldStop(128);
if (true) break;

case 91:
//if
this.state = 108;
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_row),BA.numberCast(double.class, 0)))) { 
this.state = 93;
}else {
this.state = 101;
}if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 1034;BA.debugLine="FirstItem = DBStructures.GetScriptColumnS";
Debug.ShouldStop(512);
_firstitem = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select item_tagcode from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("																			And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			and position = 1\n"),RemoteObject.createImmutable("																			And repeatcounter=0\n"),RemoteObject.createImmutable("																			And repeatitemcounter=0\n"),RemoteObject.createImmutable("																			And repeatfieldcounter=0")))),(Object)(RemoteObject.createImmutable("item_tagcode")));Debug.locals.put("FirstItem", _firstitem);
 BA.debugLineNum = 1042;BA.debugLine="FirstUK = DBStructures.GetScriptColumnStr";
Debug.ShouldStop(131072);
_firstuk = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select unique_key from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("																			And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			and position = 1\n"),RemoteObject.createImmutable("																			And repeatcounter=0\n"),RemoteObject.createImmutable("																			And repeatitemcounter=0\n"),RemoteObject.createImmutable("																			And repeatfieldcounter=0")))),(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("FirstUK", _firstuk);
 BA.debugLineNum = 1050;BA.debugLine="Dim Exec_Status As Int = 0";
Debug.ShouldStop(33554432);
_exec_status = BA.numberCast(int.class, 0);Debug.locals.put("Exec_Status", _exec_status);Debug.locals.put("Exec_Status", _exec_status);
 BA.debugLineNum = 1051;BA.debugLine="Dim OperInsert As Boolean = False";
Debug.ShouldStop(67108864);
_operinsert = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OperInsert", _operinsert);Debug.locals.put("OperInsert", _operinsert);
 BA.debugLineNum = 1052;BA.debugLine="Dim ss1 As String = $\"update dta_requests";
Debug.ShouldStop(134217728);
_ss1 = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set\n"),RemoteObject.createImmutable("															execute_status="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_exec_status))),RemoteObject.createImmutable(",\n"),RemoteObject.createImmutable("															execute_value='',\n"),RemoteObject.createImmutable("															title='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_group))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("															object_tagcode='',\n"),RemoteObject.createImmutable("															position=1,\n"),RemoteObject.createImmutable("															repeatfieldcounter=0\n"),RemoteObject.createImmutable("															where 1=1\n"),RemoteObject.createImmutable("															And request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And task_tagcode in ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable("															And item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_firstitem))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_firstuk))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And repeatcounter=0\n"),RemoteObject.createImmutable("															And repeatfieldcounter=0")));Debug.locals.put("ss1", _ss1);Debug.locals.put("ss1", _ss1);
 BA.debugLineNum = 1066;BA.debugLine="Try";
Debug.ShouldStop(512);
if (true) break;

case 94:
//try
this.state = 99;
this.catchState = 98;
this.state = 96;
if (true) break;

case 96:
//C
this.state = 99;
this.catchState = 98;
 BA.debugLineNum = 1067;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(ss1)";
Debug.ShouldStop(1024);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ss1));
 Debug.CheckDeviceExceptions();
if (true) break;

case 98:
//C
this.state = 99;
this.catchState = 241;
 BA.debugLineNum = 1069;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287597",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 99:
//C
this.state = 108;
this.catchState = 241;
;
 BA.debugLineNum = 1072;BA.debugLine="Dim Rs1 As ResumableSub = UpdateServerUPD";
Debug.ShouldStop(32768);
_rs1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs1 = _updateserverupdorins(BA.ObjectToString("dta_requests_values"),BA.ObjectToString("update"),_newrequest.runMethod(true,"trim"),_tagcode.runMethod(true,"trim"),_firstitem.runMethod(true,"trim"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));Debug.locals.put("Rs1", _rs1);Debug.locals.put("Rs1", _rs1);
 BA.debugLineNum = 1073;BA.debugLine="wait for (Rs1) Complete (Finished As Bool";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"), _rs1);
this.state = 252;
return;
case 252:
//C
this.state = 108;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finished", _finished);
;
 BA.debugLineNum = 1074;BA.debugLine="Sleep(250)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"),BA.numberCast(int.class, 250));
this.state = 253;
return;
case 253:
//C
this.state = 108;
;
 if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 1076;BA.debugLine="Dim Exec_Status As Int = 0";
Debug.ShouldStop(524288);
_exec_status = BA.numberCast(int.class, 0);Debug.locals.put("Exec_Status", _exec_status);Debug.locals.put("Exec_Status", _exec_status);
 BA.debugLineNum = 1077;BA.debugLine="Dim OperInsert As Boolean = True";
Debug.ShouldStop(1048576);
_operinsert = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OperInsert", _operinsert);Debug.locals.put("OperInsert", _operinsert);
 BA.debugLineNum = 1078;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfE";
Debug.ShouldStop(2097152);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1079;BA.debugLine="Dim ss1 As String = $\"insert into dta_req";
Debug.ShouldStop(4194304);
_ss1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("															tagcode,position,execute_value,\n"),RemoteObject.createImmutable("															execute_format_title, \n"),RemoteObject.createImmutable("															execute_status,\n"),RemoteObject.createImmutable("															title,object_tagcode,repeatfieldcounter)\n"),RemoteObject.createImmutable("															select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, \n"),RemoteObject.createImmutable("															a.item_tagcode, a.unique_key, a.tagcode, \n"),RemoteObject.createImmutable("															1, '' as execute_value, \n"),RemoteObject.createImmutable("															a.execute_format_title,\n"),RemoteObject.createImmutable("															"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_exec_status))),RemoteObject.createImmutable(" as execute_status,'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_group))),RemoteObject.createImmutable("' as title,'' as object_tagcode,\n"),RemoteObject.createImmutable("															"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_row)))),RemoteObject.createImmutable(" as repeatfieldcounter\n"),RemoteObject.createImmutable("															from dta_requests_values As a\n"),RemoteObject.createImmutable("															where 1=1\n"),RemoteObject.createImmutable("															and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode in ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable("															And item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ritem))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_runiquekey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And repeatcounter = 0\n"),RemoteObject.createImmutable("															And repeatfieldcounter=0 ")));Debug.locals.put("ss1", _ss1);Debug.locals.put("ss1", _ss1);
 BA.debugLineNum = 1098;BA.debugLine="Try";
Debug.ShouldStop(512);
if (true) break;

case 102:
//try
this.state = 107;
this.catchState = 106;
this.state = 104;
if (true) break;

case 104:
//C
this.state = 107;
this.catchState = 106;
 BA.debugLineNum = 1099;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(ss1)";
Debug.ShouldStop(1024);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ss1));
 Debug.CheckDeviceExceptions();
if (true) break;

case 106:
//C
this.state = 107;
this.catchState = 241;
 BA.debugLineNum = 1101;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287629",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 107:
//C
this.state = 108;
this.catchState = 241;
;
 if (true) break;

case 108:
//C
this.state = 109;
;
 BA.debugLineNum = 1110;BA.debugLine="cntFieldVal04 = cntFieldVal04 + 1";
Debug.ShouldStop(2097152);
_cntfieldval04 = RemoteObject.solve(new RemoteObject[] {_cntfieldval04,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("cntFieldVal04", _cntfieldval04);
 BA.debugLineNum = 1112;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEV";
Debug.ShouldStop(8388608);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_adds")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1113;BA.debugLine="Dim sSql1 As String = $\"insert into dta_re";
Debug.ShouldStop(16777216);
_ssql1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("									tagcode,fieldval_04,repeatfieldcounter) values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("','"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("								'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ritem))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_runiquekey))),RemoteObject.createImmutable("', '',"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cntfieldval04))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cntrepeatfieldcounter))),RemoteObject.createImmutable(")")));Debug.locals.put("sSql1", _ssql1);Debug.locals.put("sSql1", _ssql1);
 BA.debugLineNum = 1117;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql1),(Object)(_newrequest));
 BA.debugLineNum = 1119;BA.debugLine="Chapter=Group";
Debug.ShouldStop(1073741824);
_chapter = _group;Debug.locals.put("Chapter", _chapter);
 BA.debugLineNum = 1120;BA.debugLine="Posicao = Posicao + 1";
Debug.ShouldStop(-2147483648);
_posicao = RemoteObject.solve(new RemoteObject[] {_posicao,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Posicao", _posicao);
 if (true) break;
;
 BA.debugLineNum = 1124;BA.debugLine="If (Row = 0) Then";
Debug.ShouldStop(8);

case 109:
//if
this.state = 126;
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_row),BA.numberCast(double.class, 0)))) { 
this.state = 111;
}else {
this.state = 119;
}if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 1125;BA.debugLine="Dim Exec_Status As Int = 0";
Debug.ShouldStop(16);
_exec_status = BA.numberCast(int.class, 0);Debug.locals.put("Exec_Status", _exec_status);Debug.locals.put("Exec_Status", _exec_status);
 BA.debugLineNum = 1126;BA.debugLine="Dim OperInsert As Boolean = False";
Debug.ShouldStop(32);
_operinsert = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OperInsert", _operinsert);Debug.locals.put("OperInsert", _operinsert);
 BA.debugLineNum = 1127;BA.debugLine="Dim ss1 As String = $\"update dta_requests_";
Debug.ShouldStop(64);
_ss1 = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set\n"),RemoteObject.createImmutable("														execute_status="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_exec_status))),RemoteObject.createImmutable(",\n"),RemoteObject.createImmutable("														execute_value='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_qtd))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("														title='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rtitle))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("														object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_robject))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("														position = 2,\n"),RemoteObject.createImmutable("														repeatfieldcounter=0 \n"),RemoteObject.createImmutable("														where 1=1\n"),RemoteObject.createImmutable("														And request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("														And task_tagcode in ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable("														And item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ritem))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("														And unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_runiquekey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("														And repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rrepeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("														and repeatfieldcounter=0 ")));Debug.locals.put("ss1", _ss1);Debug.locals.put("ss1", _ss1);
 BA.debugLineNum = 1142;BA.debugLine="Try";
Debug.ShouldStop(2097152);
if (true) break;

case 112:
//try
this.state = 117;
this.catchState = 116;
this.state = 114;
if (true) break;

case 114:
//C
this.state = 117;
this.catchState = 116;
 BA.debugLineNum = 1143;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(ss1)";
Debug.ShouldStop(4194304);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ss1));
 Debug.CheckDeviceExceptions();
if (true) break;

case 116:
//C
this.state = 117;
this.catchState = 241;
 BA.debugLineNum = 1145;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287673",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 117:
//C
this.state = 126;
this.catchState = 241;
;
 BA.debugLineNum = 1148;BA.debugLine="Dim Rs1 As ResumableSub = UpdateServerUPDo";
Debug.ShouldStop(134217728);
_rs1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs1 = _updateserverupdorins(BA.ObjectToString("dta_requests_values"),BA.ObjectToString("update"),_newrequest.runMethod(true,"trim"),_tagcode.runMethod(true,"trim"),_ritem.runMethod(true,"trim"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));Debug.locals.put("Rs1", _rs1);Debug.locals.put("Rs1", _rs1);
 BA.debugLineNum = 1149;BA.debugLine="wait for (Rs1) Complete (Finished As Boole";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"), _rs1);
this.state = 254;
return;
case 254:
//C
this.state = 126;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finished", _finished);
;
 BA.debugLineNum = 1150;BA.debugLine="Sleep(250)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"),BA.numberCast(int.class, 250));
this.state = 255;
return;
case 255:
//C
this.state = 126;
;
 if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 1152;BA.debugLine="Dim Exec_Status As Int = 0";
Debug.ShouldStop(-2147483648);
_exec_status = BA.numberCast(int.class, 0);Debug.locals.put("Exec_Status", _exec_status);Debug.locals.put("Exec_Status", _exec_status);
 BA.debugLineNum = 1153;BA.debugLine="Dim OperInsert As Boolean = True";
Debug.ShouldStop(1);
_operinsert = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OperInsert", _operinsert);Debug.locals.put("OperInsert", _operinsert);
 BA.debugLineNum = 1154;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEV";
Debug.ShouldStop(2);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1155;BA.debugLine="Dim ss1 As String = $\"insert into dta_requ";
Debug.ShouldStop(4);
_ss1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("														tagcode,position,execute_value,execute_format_title,\n"),RemoteObject.createImmutable("														execute_status,title,object_tagcode,repeatfieldcounter)\n"),RemoteObject.createImmutable("														select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, \n"),RemoteObject.createImmutable("														a.item_tagcode, a.unique_key, a.tagcode, \n"),RemoteObject.createImmutable("														2, '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_qtd))),RemoteObject.createImmutable("' as execute_value, a.execute_format_title,\n"),RemoteObject.createImmutable("														"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_exec_status))),RemoteObject.createImmutable(" As execute_status,'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rtitle))),RemoteObject.createImmutable("' as title,'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_robject))),RemoteObject.createImmutable("' as object_tagcode,\n"),RemoteObject.createImmutable("														"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_row)))),RemoteObject.createImmutable(" as repeatfieldcounter\n"),RemoteObject.createImmutable("														from dta_requests_values As a\n"),RemoteObject.createImmutable("														where 1=1\n"),RemoteObject.createImmutable("														and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("														and task_tagcode in ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable("														And item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ritem))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("														And unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_runiquekey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("														And repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rrepeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("														and repeatfieldcounter=0 ")));Debug.locals.put("ss1", _ss1);Debug.locals.put("ss1", _ss1);
 BA.debugLineNum = 1172;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 120:
//try
this.state = 125;
this.catchState = 124;
this.state = 122;
if (true) break;

case 122:
//C
this.state = 125;
this.catchState = 124;
 BA.debugLineNum = 1173;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(ss1)";
Debug.ShouldStop(1048576);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ss1));
 Debug.CheckDeviceExceptions();
if (true) break;

case 124:
//C
this.state = 125;
this.catchState = 241;
 BA.debugLineNum = 1175;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287703",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 125:
//C
this.state = 126;
this.catchState = 241;
;
 if (true) break;

case 126:
//C
this.state = 251;
;
 BA.debugLineNum = 1184;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC";
Debug.ShouldStop(-2147483648);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_adds")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1186;BA.debugLine="Dim sSql1 As String = $\"insert into dta_req";
Debug.ShouldStop(2);
_ssql1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("									tagcode,fieldval_04,repeatfieldcounter) values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("','"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("							'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ritem))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_runiquekey))),RemoteObject.createImmutable("', '',"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cntfieldval04))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cntrepeatfieldcounter))),RemoteObject.createImmutable(")")));Debug.locals.put("sSql1", _ssql1);Debug.locals.put("sSql1", _ssql1);
 BA.debugLineNum = 1189;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",s";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql1),(Object)(_newrequest));
 BA.debugLineNum = 1190;BA.debugLine="cntRepeatFieldCounter = cntRepeatFieldCount";
Debug.ShouldStop(32);
_cntrepeatfieldcounter = RemoteObject.solve(new RemoteObject[] {_cntrepeatfieldcounter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("cntRepeatFieldCounter", _cntrepeatfieldcounter);
 BA.debugLineNum = 1191;BA.debugLine="Posicao = Posicao + 1";
Debug.ShouldStop(64);
_posicao = RemoteObject.solve(new RemoteObject[] {_posicao,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Posicao", _posicao);
 if (true) break;
if (true) break;

case 127:
//C
this.state = 128;
Debug.locals.put("Row", _row);
;
 if (true) break;

case 128:
//C
this.state = 129;
;
 BA.debugLineNum = 1194;BA.debugLine="rRecord.Close";
Debug.ShouldStop(512);
_rrecord.runVoidMethod ("Close");
 if (true) break;

case 129:
//C
this.state = 130;
;
 BA.debugLineNum = 1201;BA.debugLine="Dim ListItems As List";
Debug.ShouldStop(65536);
_listitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListItems", _listitems);
 BA.debugLineNum = 1202;BA.debugLine="ListItems.Initialize";
Debug.ShouldStop(131072);
_listitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 1203;BA.debugLine="Dim DataFields As List";
Debug.ShouldStop(262144);
_datafields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("DataFields", _datafields);
 BA.debugLineNum = 1204;BA.debugLine="DataFields.Initialize";
Debug.ShouldStop(524288);
_datafields.runVoidMethod ("Initialize");
 BA.debugLineNum = 1205;BA.debugLine="Dim MapItems As Map";
Debug.ShouldStop(1048576);
_mapitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("MapItems", _mapitems);
 BA.debugLineNum = 1206;BA.debugLine="MapItems.Initialize";
Debug.ShouldStop(2097152);
_mapitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 1208;BA.debugLine="Dim FinalSql As String =  $\"select * from dta_";
Debug.ShouldStop(8388608);
_finalsql = (RemoteObject.concat(RemoteObject.createImmutable("select * from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("											and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("											And task_tagcode in ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')\n"),RemoteObject.createImmutable("											and repeatfieldcounter > 0")));Debug.locals.put("FinalSql", _finalsql);Debug.locals.put("FinalSql", _finalsql);
 BA.debugLineNum = 1213;BA.debugLine="Dim RsArtigos As ResultSet = Starter.LocalSQLE";
Debug.ShouldStop(268435456);
_rsartigos = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_rsartigos = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_finalsql)));Debug.locals.put("RsArtigos", _rsartigos);
 BA.debugLineNum = 1216;BA.debugLine="MapItems.Put(\"table\",\"dta_requests_values\")";
Debug.ShouldStop(-2147483648);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("table"))),(Object)((RemoteObject.createImmutable("dta_requests_values"))));
 BA.debugLineNum = 1217;BA.debugLine="MapItems.Put(\"type\",\"insert\")";
Debug.ShouldStop(1);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("insert"))));
 BA.debugLineNum = 1219;BA.debugLine="If RsArtigos.RowCount > 0 Then";
Debug.ShouldStop(4);
if (true) break;

case 130:
//if
this.state = 169;
if (RemoteObject.solveBoolean(">",_rsartigos.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 132;
}if (true) break;

case 132:
//C
this.state = 133;
 BA.debugLineNum = 1220;BA.debugLine="Do While RsArtigos.NextRow ' ITERA SOBRE TODO";
Debug.ShouldStop(8);
if (true) break;

case 133:
//do while
this.state = 144;
while (_rsartigos.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 135;
if (true) break;
}
if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 1221;BA.debugLine="Dim MapFields As Map";
Debug.ShouldStop(16);
_mapfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("MapFields", _mapfields);
 BA.debugLineNum = 1222;BA.debugLine="MapFields.Initialize";
Debug.ShouldStop(32);
_mapfields.runVoidMethod ("Initialize");
 BA.debugLineNum = 1224;BA.debugLine="For NFields = 0 To RsArtigos.ColumnCount -1";
Debug.ShouldStop(128);
if (true) break;

case 136:
//for
this.state = 143;
step283 = 1;
limit283 = RemoteObject.solve(new RemoteObject[] {_rsartigos.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nfields = 0 ;
Debug.locals.put("NFields", _nfields);
this.state = 256;
if (true) break;

case 256:
//C
this.state = 143;
if ((step283 > 0 && _nfields <= limit283) || (step283 < 0 && _nfields >= limit283)) this.state = 138;
if (true) break;

case 257:
//C
this.state = 256;
_nfields = ((int)(0 + _nfields + step283)) ;
Debug.locals.put("NFields", _nfields);
if (true) break;

case 138:
//C
this.state = 139;
 BA.debugLineNum = 1225;BA.debugLine="Dim ColName As String = RsArtigos.GetColumn";
Debug.ShouldStop(256);
_colname = _rsartigos.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _nfields)));Debug.locals.put("ColName", _colname);Debug.locals.put("ColName", _colname);
 BA.debugLineNum = 1226;BA.debugLine="Dim ColValue As String = Utils.IfNullOrEmpt";
Debug.ShouldStop(512);
_colvalue = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_rsartigos.runMethod(true,"GetString",(Object)(_colname))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("ColValue", _colvalue);Debug.locals.put("ColValue", _colvalue);
 BA.debugLineNum = 1227;BA.debugLine="If ColName.ToLowerCase.trim <> \"id\" And	Col";
Debug.ShouldStop(1024);
if (true) break;

case 139:
//if
this.state = 142;
if (RemoteObject.solveBoolean("!",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("id")) && RemoteObject.solveBoolean("!",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("created_at")) && RemoteObject.solveBoolean("!",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("updated_at"))) { 
this.state = 141;
}if (true) break;

case 141:
//C
this.state = 142;
 BA.debugLineNum = 1228;BA.debugLine="MapFields.Put(ColName, ColValue)";
Debug.ShouldStop(2048);
_mapfields.runVoidMethod ("Put",(Object)((_colname)),(Object)((_colvalue)));
 if (true) break;

case 142:
//C
this.state = 257;
;
 if (true) break;
if (true) break;

case 143:
//C
this.state = 133;
Debug.locals.put("NFields", _nfields);
;
 BA.debugLineNum = 1232;BA.debugLine="DataFields.Add(MapFields)";
Debug.ShouldStop(32768);
_datafields.runVoidMethod ("Add",(Object)((_mapfields.getObject())));
 BA.debugLineNum = 1233;BA.debugLine="Log(MapFields)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287761",BA.ObjectToString(_mapfields),0);
 if (true) break;

case 144:
//C
this.state = 145;
;
 BA.debugLineNum = 1236;BA.debugLine="MapItems.Put(\"fields\",DataFields)";
Debug.ShouldStop(524288);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fields"))),(Object)((_datafields.getObject())));
 BA.debugLineNum = 1237;BA.debugLine="Log(DataFields)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287765",BA.ObjectToString(_datafields),0);
 BA.debugLineNum = 1238;BA.debugLine="ListItems.Add(MapItems)";
Debug.ShouldStop(2097152);
_listitems.runVoidMethod ("Add",(Object)((_mapitems.getObject())));
 BA.debugLineNum = 1240;BA.debugLine="Dim ACLAJson As Map";
Debug.ShouldStop(8388608);
_aclajson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ACLAJson", _aclajson);
 BA.debugLineNum = 1241;BA.debugLine="ACLAJson.Initialize";
Debug.ShouldStop(16777216);
_aclajson.runVoidMethod ("Initialize");
 BA.debugLineNum = 1242;BA.debugLine="ACLAJson.put(\"items\", ListItems)";
Debug.ShouldStop(33554432);
_aclajson.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("items"))),(Object)((_listitems.getObject())));
 BA.debugLineNum = 1244;BA.debugLine="Dim NewParams As Map";
Debug.ShouldStop(134217728);
_newparams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("NewParams", _newparams);
 BA.debugLineNum = 1245;BA.debugLine="NewParams.Initialize";
Debug.ShouldStop(268435456);
_newparams.runVoidMethod ("Initialize");
 BA.debugLineNum = 1246;BA.debugLine="NewParams.Clear";
Debug.ShouldStop(536870912);
_newparams.runVoidMethod ("Clear");
 BA.debugLineNum = 1247;BA.debugLine="NewParams.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1073741824);
_newparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1248;BA.debugLine="NewParams.Put(\"debug\", 1)";
Debug.ShouldStop(-2147483648);
_newparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("debug"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1249;BA.debugLine="NewParams.Put(\"ACLAJson\", ACLAJson)";
Debug.ShouldStop(1);
_newparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAJson"))),(Object)((_aclajson.getObject())));
 BA.debugLineNum = 1250;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP";
Debug.ShouldStop(2);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/insert-update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1252;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_U";
Debug.ShouldStop(8);
if (true) break;

case 145:
//if
this.state = 168;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 147;
}else {
this.state = 167;
}if (true) break;

case 147:
//C
this.state = 148;
 BA.debugLineNum = 1253;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(16);
if (true) break;

case 148:
//if
this.state = 165;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 150;
}else {
this.state = 164;
}if (true) break;

case 150:
//C
this.state = 151;
 BA.debugLineNum = 1255;BA.debugLine="Try";
Debug.ShouldStop(64);
if (true) break;

case 151:
//try
this.state = 162;
this.catchState = 161;
this.state = 153;
if (true) break;

case 153:
//C
this.state = 154;
this.catchState = 161;
 BA.debugLineNum = 1256;BA.debugLine="Dim data As String";
Debug.ShouldStop(128);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 1257;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(256);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1258;BA.debugLine="JSON.Initialize(NewParams)";
Debug.ShouldStop(512);
_json.runVoidMethod ("Initialize",(Object)(_newparams));
 BA.debugLineNum = 1260;BA.debugLine="data = JSON.ToPrettyString(1)";
Debug.ShouldStop(2048);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);
 BA.debugLineNum = 1261;BA.debugLine="Dim JobD2S As HttpJob";
Debug.ShouldStop(4096);
_jobd2s = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("JobD2S", _jobd2s);
 BA.debugLineNum = 1262;BA.debugLine="JobD2S.Initialize(\"\",Me)";
Debug.ShouldStop(8192);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,taskscl2.processBA,(Object)(BA.ObjectToString("")),(Object)(taskscl2.getObject()));
 BA.debugLineNum = 1263;BA.debugLine="Dim addr As String = Url";
Debug.ShouldStop(16384);
_addr = _url;Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 1265;BA.debugLine="JobD2S.PostString(addr, data )";
Debug.ShouldStop(65536);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_data));
 BA.debugLineNum = 1266;BA.debugLine="JobD2S.GetRequest.SetContentType(\"applicat";
Debug.ShouldStop(131072);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1268;BA.debugLine="Wait For (JobD2S) JobDone(JobD2S As HttpJo";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"), (_jobd2s));
this.state = 258;
return;
case 258:
//C
this.state = 154;
_jobd2s = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("JobD2S", _jobd2s);
;
 BA.debugLineNum = 1270;BA.debugLine="If JobD2S.Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 154:
//if
this.state = 159;
if (_jobd2s.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 156;
}else {
this.state = 158;
}if (true) break;

case 156:
//C
this.state = 159;
 BA.debugLineNum = 1271;BA.debugLine="Log(\"API Reply:\" & JobD2S.GetString)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287799",RemoteObject.concat(RemoteObject.createImmutable("API Reply:"),_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 158:
//C
this.state = 159;
 BA.debugLineNum = 1273;BA.debugLine="Log(\"API ERROR Reply:\" & JobD2S.GetString";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287801",RemoteObject.concat(RemoteObject.createImmutable("API ERROR Reply:"),_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 159:
//C
this.state = 162;
;
 BA.debugLineNum = 1275;BA.debugLine="JobD2S.Release";
Debug.ShouldStop(67108864);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 161:
//C
this.state = 162;
this.catchState = 241;
 BA.debugLineNum = 1277;BA.debugLine="Dim theData As String = $\"${LastException}";
Debug.ShouldStop(268435456);
_thedata = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_data))),RemoteObject.createImmutable("")));Debug.locals.put("theData", _thedata);Debug.locals.put("theData", _thedata);
 BA.debugLineNum = 1278;BA.debugLine="Log(theData)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287806",_thedata,0);
 BA.debugLineNum = 1279;BA.debugLine="Utils.logError(\"JobD2S\", ShareCode.SESS_OP";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("JobD2S")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(_thedata));
 if (true) break;
if (true) break;

case 162:
//C
this.state = 165;
this.catchState = 241;
;
 if (true) break;

case 164:
//C
this.state = 165;
 BA.debugLineNum = 1283;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeW";
Debug.ShouldStop(4);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_newrequest.runMethod(true,"trim")),(Object)(_tagcode.runMethod(true,"trim")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1284;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(NewP";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newparams))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 165:
//C
this.state = 168;
;
 BA.debugLineNum = 1286;BA.debugLine="Sleep(250)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowrequesttaskdetails"),BA.numberCast(int.class, 250));
this.state = 259;
return;
case 259:
//C
this.state = 168;
;
 if (true) break;

case 167:
//C
this.state = 168;
 BA.debugLineNum = 1289;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWo";
Debug.ShouldStop(256);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_newrequest.runMethod(true,"trim")),(Object)(_tagcode.runMethod(true,"trim")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1290;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(NewPa";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newparams))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 168:
//C
this.state = 169;
;
 if (true) break;

case 169:
//C
this.state = 170;
;
 if (true) break;
;
 BA.debugLineNum = 1312;BA.debugLine="If ((newRequestType = \"TSKS_20200513_193055\") A";
Debug.ShouldStop(-2147483648);

case 170:
//if
this.state = 196;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_newrequesttype,RemoteObject.createImmutable("TSKS_20200513_193055"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_firstchecklisttemp,RemoteObject.createImmutable("TSKS_20200513_191407")))))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_newrequesttype,RemoteObject.createImmutable("TSKS_20200514_113923"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_firstchecklisttemp,RemoteObject.createImmutable("TSKS_20200513_191407"))))))))) { 
this.state = 172;
}if (true) break;

case 172:
//C
this.state = 173;
 BA.debugLineNum = 1314;BA.debugLine="Dim sNewSQL As String = $\"select x.title as ar";
Debug.ShouldStop(2);
_snewsql = (RemoteObject.concat(RemoteObject.createImmutable("select x.title as article_title, x.tagcode as article_tagcode, x.*, e.* from (\n"),RemoteObject.createImmutable("							select  ifnull(b.title,'') as group_title, ifnull(c.tagdesc,'') as type_title, a.*, d.qtd as qtdw \n"),RemoteObject.createImmutable("							from dta_articles as a\n"),RemoteObject.createImmutable("							left join dta_articles_groups as b on (b.tagcode=a.article_group)\n"),RemoteObject.createImmutable("							left join type_articlestypes as c on (c.tagcode=a.article_type)\n"),RemoteObject.createImmutable("							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and\n"),RemoteObject.createImmutable("								d.warehouse_tagcode in (select tagcode from dta_warehouses \n"),RemoteObject.createImmutable("										where object_tagcode in (select tagcode from dta_objects \n"),RemoteObject.createImmutable("											where tagcode in (select vehicle_tagcode from dta_technicals where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("'))))\n"),RemoteObject.createImmutable("							) as x\n"),RemoteObject.createImmutable("							, dta_requests_values as e\n"),RemoteObject.createImmutable("							inner join dta_tasks_items as f on (f.task_tagcode=e.task_tagcode\n"),RemoteObject.createImmutable("								and f.item_tagcode=e.item_tagcode\n"),RemoteObject.createImmutable("								and f.unique_key=e.unique_key)\n"),RemoteObject.createImmutable("							where 1=1\n"),RemoteObject.createImmutable("							and e.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("							and e.task_tagcode in ('TSKS_20200513_191407')\n"),RemoteObject.createImmutable("							and f.`level`>0\n"),RemoteObject.createImmutable("							order by x.group_title, x.title")));Debug.locals.put("sNewSQL", _snewsql);Debug.locals.put("sNewSQL", _snewsql);
 BA.debugLineNum = 1334;BA.debugLine="Dim rRecord As Cursor = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(2097152);
_rrecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_rrecord = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_snewsql)));Debug.locals.put("rRecord", _rrecord);
 BA.debugLineNum = 1335;BA.debugLine="If rRecord.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 173:
//if
this.state = 195;
if (RemoteObject.solveBoolean(">",_rrecord.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 175;
}if (true) break;

case 175:
//C
this.state = 176;
 BA.debugLineNum = 1337;BA.debugLine="Dim Chapter As String = \"\"";
Debug.ShouldStop(16777216);
_chapter = BA.ObjectToString("");Debug.locals.put("Chapter", _chapter);Debug.locals.put("Chapter", _chapter);
 BA.debugLineNum = 1338;BA.debugLine="Dim cntFieldVal04 As Int = -1";
Debug.ShouldStop(33554432);
_cntfieldval04 = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("cntFieldVal04", _cntfieldval04);Debug.locals.put("cntFieldVal04", _cntfieldval04);
 BA.debugLineNum = 1339;BA.debugLine="Dim cntRepeatFieldCounter As Int = 0";
Debug.ShouldStop(67108864);
_cntrepeatfieldcounter = BA.numberCast(int.class, 0);Debug.locals.put("cntRepeatFieldCounter", _cntrepeatfieldcounter);Debug.locals.put("cntRepeatFieldCounter", _cntrepeatfieldcounter);
 BA.debugLineNum = 1340;BA.debugLine="Dim cntPosicao As Int = 1";
Debug.ShouldStop(134217728);
_cntposicao = BA.numberCast(int.class, 1);Debug.locals.put("cntPosicao", _cntposicao);Debug.locals.put("cntPosicao", _cntposicao);
 BA.debugLineNum = 1342;BA.debugLine="For Row = 0 To rRecord.RowCount-1";
Debug.ShouldStop(536870912);
if (true) break;

case 176:
//for
this.state = 194;
step349 = 1;
limit349 = RemoteObject.solve(new RemoteObject[] {_rrecord.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
this.state = 260;
if (true) break;

case 260:
//C
this.state = 194;
if ((step349 > 0 && _row <= limit349) || (step349 < 0 && _row >= limit349)) this.state = 178;
if (true) break;

case 261:
//C
this.state = 260;
_row = ((int)(0 + _row + step349)) ;
Debug.locals.put("Row", _row);
if (true) break;

case 178:
//C
this.state = 179;
 BA.debugLineNum = 1343;BA.debugLine="rRecord.Position = Row";
Debug.ShouldStop(1073741824);
_rrecord.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 1344;BA.debugLine="Dim Group As String = rRecord.GetString(\"gro";
Debug.ShouldStop(-2147483648);
_group = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("group_title")));Debug.locals.put("Group", _group);Debug.locals.put("Group", _group);
 BA.debugLineNum = 1345;BA.debugLine="Dim Qtd As Int = rRecord.GetInt(\"qtdw\")";
Debug.ShouldStop(1);
_qtd = _rrecord.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("qtdw")));Debug.locals.put("Qtd", _qtd);Debug.locals.put("Qtd", _qtd);
 BA.debugLineNum = 1346;BA.debugLine="Dim RRepeatcounter As Int = rRecord.GetInt(\"";
Debug.ShouldStop(2);
_rrepeatcounter = _rrecord.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("RRepeatcounter", _rrepeatcounter);Debug.locals.put("RRepeatcounter", _rrepeatcounter);
 BA.debugLineNum = 1347;BA.debugLine="Dim RObject As String = rRecord.GetString(\"a";
Debug.ShouldStop(4);
_robject = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("article_tagcode")));Debug.locals.put("RObject", _robject);Debug.locals.put("RObject", _robject);
 BA.debugLineNum = 1348;BA.debugLine="Dim RTitle As String = rRecord.GetString(\"ar";
Debug.ShouldStop(8);
_rtitle = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("article_title")));Debug.locals.put("RTitle", _rtitle);Debug.locals.put("RTitle", _rtitle);
 BA.debugLineNum = 1349;BA.debugLine="Dim RItem As String = rRecord.GetString(\"ite";
Debug.ShouldStop(16);
_ritem = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("item_tagcode")));Debug.locals.put("RItem", _ritem);Debug.locals.put("RItem", _ritem);
 BA.debugLineNum = 1350;BA.debugLine="Dim RUniqueKey As String = rRecord.GetString";
Debug.ShouldStop(32);
_runiquekey = _rrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("RUniqueKey", _runiquekey);Debug.locals.put("RUniqueKey", _runiquekey);
 BA.debugLineNum = 1352;BA.debugLine="If Not(Chapter=Group) Then ' Capitulo e dife";
Debug.ShouldStop(128);
if (true) break;

case 179:
//if
this.state = 188;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_chapter,_group)))).<Boolean>get().booleanValue()) { 
this.state = 181;
}if (true) break;

case 181:
//C
this.state = 182;
 BA.debugLineNum = 1353;BA.debugLine="If (Row = 0) Then";
Debug.ShouldStop(256);
if (true) break;

case 182:
//if
this.state = 187;
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_row),BA.numberCast(double.class, 0)))) { 
this.state = 184;
}else {
this.state = 186;
}if (true) break;

case 184:
//C
this.state = 187;
 BA.debugLineNum = 1354;BA.debugLine="Dim ss1 As String = $\"update dta_requests_";
Debug.ShouldStop(512);
_ss1 = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set\n"),RemoteObject.createImmutable("									execute_status=0,\n"),RemoteObject.createImmutable("									execute_value='',\n"),RemoteObject.createImmutable("									title='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_group))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("									object_tagcode='',\n"),RemoteObject.createImmutable("									position=1,\n"),RemoteObject.createImmutable("									repeatfieldcounter=0\n"),RemoteObject.createImmutable("									where 1=1\n"),RemoteObject.createImmutable("									And request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									And task_tagcode in ('TSKS_20200513_191407')\n"),RemoteObject.createImmutable("									And item_tagcode='AINV001'\n"),RemoteObject.createImmutable("									And unique_key='39f49fe2-8872-5302-8de6-270901935dfa'\n"),RemoteObject.createImmutable("									And repeatcounter=0\n"),RemoteObject.createImmutable("									And repeatfieldcounter=0")));Debug.locals.put("ss1", _ss1);Debug.locals.put("ss1", _ss1);
 if (true) break;

case 186:
//C
this.state = 187;
 BA.debugLineNum = 1369;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEV";
Debug.ShouldStop(16777216);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1370;BA.debugLine="Dim ss1 As String = $\"insert into dta_requ";
Debug.ShouldStop(33554432);
_ss1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode,\n"),RemoteObject.createImmutable("									task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("									tagcode,position,execute_value, execute_format_title,execute_status,title,object_tagcode,repeatfieldcounter)\n"),RemoteObject.createImmutable("									select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, \n"),RemoteObject.createImmutable("									a.item_tagcode, a.unique_key, a.tagcode, \n"),RemoteObject.createImmutable("									1, '' as execute_value, a.execute_format_title,0 as execute_status,'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_group))),RemoteObject.createImmutable("' as title,'' as object_tagcode,\n"),RemoteObject.createImmutable("									"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_row)))),RemoteObject.createImmutable(" as repeatfieldcounter\n"),RemoteObject.createImmutable("									from dta_requests_values As a\n"),RemoteObject.createImmutable("									where 1=1\n"),RemoteObject.createImmutable("									and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									and task_tagcode in ('TSKS_20200513_191407')\n"),RemoteObject.createImmutable("									and item_tagcode='AINV001'\n"),RemoteObject.createImmutable("									and unique_key='39f49fe2-8872-5302-8de6-270901935dfa'\n"),RemoteObject.createImmutable("									and repeatcounter=0\n"),RemoteObject.createImmutable("									and repeatfieldcounter=0 ")));Debug.locals.put("ss1", _ss1);Debug.locals.put("ss1", _ss1);
 if (true) break;

case 187:
//C
this.state = 188;
;
 BA.debugLineNum = 1387;BA.debugLine="cntFieldVal04 = cntFieldVal04 + 1";
Debug.ShouldStop(1024);
_cntfieldval04 = RemoteObject.solve(new RemoteObject[] {_cntfieldval04,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("cntFieldVal04", _cntfieldval04);
 BA.debugLineNum = 1389;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",s";
Debug.ShouldStop(4096);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ss1),(Object)(_newrequest));
 BA.debugLineNum = 1391;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC";
Debug.ShouldStop(16384);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_adds")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1392;BA.debugLine="Dim sSql1 As String = $\"insert into dta_req";
Debug.ShouldStop(32768);
_ssql1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("									tagcode,fieldval_04,repeatfieldcounter) values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("','TSKS_20200513_191407', 'TSKS_20200513_191407', \n"),RemoteObject.createImmutable("							'AINV001', '39f49fe2-8872-5302-8de6-270901935dfa', '',"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cntfieldval04))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cntrepeatfieldcounter))),RemoteObject.createImmutable(")")));Debug.locals.put("sSql1", _ssql1);Debug.locals.put("sSql1", _ssql1);
 BA.debugLineNum = 1395;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",s";
Debug.ShouldStop(262144);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql1),(Object)(_newrequest));
 BA.debugLineNum = 1397;BA.debugLine="Chapter=Group";
Debug.ShouldStop(1048576);
_chapter = _group;Debug.locals.put("Chapter", _chapter);
 BA.debugLineNum = 1398;BA.debugLine="cntPosicao = cntPosicao + 1";
Debug.ShouldStop(2097152);
_cntposicao = RemoteObject.solve(new RemoteObject[] {_cntposicao,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("cntPosicao", _cntposicao);
 if (true) break;
;
 BA.debugLineNum = 1402;BA.debugLine="If (Row = 0) Then";
Debug.ShouldStop(33554432);

case 188:
//if
this.state = 193;
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_row),BA.numberCast(double.class, 0)))) { 
this.state = 190;
}else {
this.state = 192;
}if (true) break;

case 190:
//C
this.state = 193;
 BA.debugLineNum = 1403;BA.debugLine="Dim ss1 As String = $\"update dta_requests_v";
Debug.ShouldStop(67108864);
_ss1 = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set\n"),RemoteObject.createImmutable("									execute_status=1,\n"),RemoteObject.createImmutable("									execute_value='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_qtd))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("									title='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rtitle))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("									object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_robject))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("									position = 2,\n"),RemoteObject.createImmutable("									repeatfieldcounter=0 \n"),RemoteObject.createImmutable("									where 1=1\n"),RemoteObject.createImmutable("									And request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									And task_tagcode in ('TSKS_20200513_191407')\n"),RemoteObject.createImmutable("									And item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ritem))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									And unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_runiquekey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									And repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rrepeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("									and repeatfieldcounter=0 ")));Debug.locals.put("ss1", _ss1);Debug.locals.put("ss1", _ss1);
 if (true) break;

case 192:
//C
this.state = 193;
 BA.debugLineNum = 1418;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC";
Debug.ShouldStop(512);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1419;BA.debugLine="Dim ss1 As String = $\"insert into dta_reque";
Debug.ShouldStop(1024);
_ss1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("									tagcode,position,execute_value,execute_format_title,execute_status,title,object_tagcode,repeatfieldcounter)\n"),RemoteObject.createImmutable("									select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, \n"),RemoteObject.createImmutable("									a.item_tagcode, a.unique_key, a.tagcode, \n"),RemoteObject.createImmutable("									2, '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_qtd))),RemoteObject.createImmutable("' as execute_value, a.execute_format_title, 1 as execute_status,'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rtitle))),RemoteObject.createImmutable("' as title,'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_robject))),RemoteObject.createImmutable("' as object_tagcode,\n"),RemoteObject.createImmutable("									"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_row)))),RemoteObject.createImmutable(" as repeatfieldcounter\n"),RemoteObject.createImmutable("									from dta_requests_values As a\n"),RemoteObject.createImmutable("									where 1=1\n"),RemoteObject.createImmutable("									and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									and task_tagcode in ('TSKS_20200513_191407')\n"),RemoteObject.createImmutable("									and item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ritem))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									and unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_runiquekey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("									and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rrepeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("									and repeatfieldcounter=0 ")));Debug.locals.put("ss1", _ss1);Debug.locals.put("ss1", _ss1);
 if (true) break;

case 193:
//C
this.state = 261;
;
 BA.debugLineNum = 1434;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",ss";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ss1),(Object)(_newrequest));
 BA.debugLineNum = 1436;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(";
Debug.ShouldStop(134217728);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_adds")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1438;BA.debugLine="Dim sSql1 As String = $\"insert into dta_requ";
Debug.ShouldStop(536870912);
_ssql1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("									tagcode,fieldval_04,repeatfieldcounter) values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("','TSKS_20200513_191407', 'TSKS_20200513_191407', \n"),RemoteObject.createImmutable("						'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ritem))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_runiquekey))),RemoteObject.createImmutable("', '',"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cntfieldval04))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cntrepeatfieldcounter))),RemoteObject.createImmutable(")")));Debug.locals.put("sSql1", _ssql1);Debug.locals.put("sSql1", _ssql1);
 BA.debugLineNum = 1441;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sS";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql1),(Object)(_newrequest));
 BA.debugLineNum = 1442;BA.debugLine="cntRepeatFieldCounter = cntRepeatFieldCounte";
Debug.ShouldStop(2);
_cntrepeatfieldcounter = RemoteObject.solve(new RemoteObject[] {_cntrepeatfieldcounter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("cntRepeatFieldCounter", _cntrepeatfieldcounter);
 BA.debugLineNum = 1443;BA.debugLine="cntPosicao = cntPosicao + 1";
Debug.ShouldStop(4);
_cntposicao = RemoteObject.solve(new RemoteObject[] {_cntposicao,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("cntPosicao", _cntposicao);
 if (true) break;
if (true) break;

case 194:
//C
this.state = 195;
Debug.locals.put("Row", _row);
;
 if (true) break;

case 195:
//C
this.state = 196;
;
 BA.debugLineNum = 1446;BA.debugLine="rRecord.Close";
Debug.ShouldStop(32);
_rrecord.runVoidMethod ("Close");
 if (true) break;

case 196:
//C
this.state = 197;
;
 BA.debugLineNum = 1452;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETRE";
Debug.ShouldStop(2048);
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*RemoteObject*/ ;Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1453;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newRe";
Debug.ShouldStop(4096);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" and z.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1454;BA.debugLine="sSQL = $\"${sSQL} order by z.position\"$";
Debug.ShouldStop(8192);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" order by z.position")));Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1455;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287983",_ssql,0);
 BA.debugLineNum = 1456;BA.debugLine="Log(newRequest)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184287984",_newrequest,0);
 BA.debugLineNum = 1458;BA.debugLine="Private incolitems As Cursor = Starter.LocalSQL";
Debug.ShouldStop(131072);
_incolitems = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_incolitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("incolitems", _incolitems);
 BA.debugLineNum = 1459;BA.debugLine="If (incolitems.RowCount >= 1) Then";
Debug.ShouldStop(262144);
if (true) break;

case 197:
//if
this.state = 236;
if ((RemoteObject.solveBoolean("g",_incolitems.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 199;
}if (true) break;

case 199:
//C
this.state = 200;
 BA.debugLineNum = 1460;BA.debugLine="Dim Posis As Int = 0";
Debug.ShouldStop(524288);
_posis = BA.numberCast(int.class, 0);Debug.locals.put("Posis", _posis);Debug.locals.put("Posis", _posis);
 BA.debugLineNum = 1461;BA.debugLine="If (Utils.NNE(FirstCheckList)) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 200:
//if
this.state = 211;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_firstchecklist))).<Boolean>get().booleanValue()) { 
this.state = 202;
}if (true) break;

case 202:
//C
this.state = 203;
 BA.debugLineNum = 1462;BA.debugLine="For a1=0 To incolitems.RowCount-1";
Debug.ShouldStop(2097152);
if (true) break;

case 203:
//for
this.state = 210;
step398 = 1;
limit398 = RemoteObject.solve(new RemoteObject[] {_incolitems.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_a1 = 0 ;
Debug.locals.put("a1", _a1);
this.state = 262;
if (true) break;

case 262:
//C
this.state = 210;
if ((step398 > 0 && _a1 <= limit398) || (step398 < 0 && _a1 >= limit398)) this.state = 205;
if (true) break;

case 263:
//C
this.state = 262;
_a1 = ((int)(0 + _a1 + step398)) ;
Debug.locals.put("a1", _a1);
if (true) break;

case 205:
//C
this.state = 206;
 BA.debugLineNum = 1463;BA.debugLine="incolitems.Position = a1";
Debug.ShouldStop(4194304);
_incolitems.runMethod(true,"setPosition",BA.numberCast(int.class, _a1));
 BA.debugLineNum = 1464;BA.debugLine="Dim tag As String = incolitems.GetString(\"ta";
Debug.ShouldStop(8388608);
_tag = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tag", _tag);Debug.locals.put("tag", _tag);
 BA.debugLineNum = 1465;BA.debugLine="If (tag = FirstCheckList) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 206:
//if
this.state = 209;
if ((RemoteObject.solveBoolean("=",_tag,_firstchecklist))) { 
this.state = 208;
}if (true) break;

case 208:
//C
this.state = 209;
 BA.debugLineNum = 1466;BA.debugLine="Posis = a1";
Debug.ShouldStop(33554432);
_posis = BA.numberCast(int.class, _a1);Debug.locals.put("Posis", _posis);
 if (true) break;

case 209:
//C
this.state = 263;
;
 if (true) break;
if (true) break;

case 210:
//C
this.state = 211;
Debug.locals.put("a1", _a1);
;
 if (true) break;

case 211:
//C
this.state = 212;
;
 BA.debugLineNum = 1470;BA.debugLine="incolitems.Position = Posis";
Debug.ShouldStop(536870912);
_incolitems.runMethod(true,"setPosition",_posis);
 BA.debugLineNum = 1472;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
Debug.ShouldStop(-2147483648);
_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 1473;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\"";
Debug.ShouldStop(1);
_tasktype = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type")));Debug.locals.put("tasktype", _tasktype);Debug.locals.put("tasktype", _tasktype);
 BA.debugLineNum = 1474;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"stat";
Debug.ShouldStop(2);
_status_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 1475;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"";
Debug.ShouldStop(4);
_tagcode = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1476;BA.debugLine="Dim actionkey As String = incolitems.GetString";
Debug.ShouldStop(8);
_actionkey = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("action_tagcode")));Debug.locals.put("actionkey", _actionkey);Debug.locals.put("actionkey", _actionkey);
 BA.debugLineNum = 1477;BA.debugLine="Dim task As String = incolitems.GetString(\"tas";
Debug.ShouldStop(16);
_task = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")));Debug.locals.put("task", _task);Debug.locals.put("task", _task);
 BA.debugLineNum = 1478;BA.debugLine="Dim name As String = incolitems.GetString(\"nam";
Debug.ShouldStop(32);
_name = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1481;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDat";
Debug.ShouldStop(256);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 1482;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
Debug.ShouldStop(512);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1483;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
Debug.ShouldStop(1024);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1485;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(4096);
_sdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("sDate", _sdate);Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 1486;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(8192);
_stime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("sTime", _stime);Debug.locals.put("sTime", _stime);
 BA.debugLineNum = 1488;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"clo";
Debug.ShouldStop(32768);
_close_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("close_type")));Debug.locals.put("close_type", _close_type);Debug.locals.put("close_type", _close_type);
 BA.debugLineNum = 1489;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"re";
Debug.ShouldStop(65536);
_result_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("result_type")));Debug.locals.put("result_type", _result_type);Debug.locals.put("result_type", _result_type);
 BA.debugLineNum = 1490;BA.debugLine="Dim result_values As String = incolitems.GetSt";
Debug.ShouldStop(131072);
_result_values = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("result_values")));Debug.locals.put("result_values", _result_values);Debug.locals.put("result_values", _result_values);
 BA.debugLineNum = 1491;BA.debugLine="Dim repeatcounter As Int = incolitems.GetInt(\"";
Debug.ShouldStop(262144);
_repeatcounter = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 1493;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeReq";
Debug.ShouldStop(1048576);
_clainfo = parent.mostCurrent._types.runMethod(false,"_makerequesttaskinfo" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 2)),(Object)(_close_type),(Object)(_result_type),(Object)(_result_values),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));Debug.locals.put("CLAInfo", _clainfo);Debug.locals.put("CLAInfo", _clainfo);
 BA.debugLineNum = 1494;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(t";
Debug.ShouldStop(2097152);
_cla = parent.mostCurrent._types.runMethod(false,"_makerequestcla" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_actionkey),(Object)(_task),(Object)(_repeatcounter),(Object)(_tasktype),(Object)(parent.mostCurrent._types.runMethod(false,"_makeinterv" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_id),(Object)(_tagcode),(Object)(_status_id),(Object)(parent.mostCurrent._utils.runMethod(true,"_colorint" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_status_id))))),(Object)(_clainfo),(Object)(parent.mostCurrent._types.runMethod(false,"_makeothercla" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("CLA", _cla);Debug.locals.put("CLA", _cla);
 BA.debugLineNum = 1498;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1500;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1505;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rel";
Debug.ShouldStop(1);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1507;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1509;BA.debugLine="Log(\"Grava Status na BD local Request\")";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184288037",RemoteObject.createImmutable("Grava Status na BD local Request"),0);
 BA.debugLineNum = 1510;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1511;BA.debugLine="params.Initialize";
Debug.ShouldStop(64);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1512;BA.debugLine="params.Clear";
Debug.ShouldStop(128);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1513;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1514;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 1515;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1516;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1517;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1518;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 1519;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 1520;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1521;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1522;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1523;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1524;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1525;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1526;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1527;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1528;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 212:
//try
this.state = 217;
this.catchState = 216;
this.state = 214;
if (true) break;

case 214:
//C
this.state = 217;
this.catchState = 216;
 BA.debugLineNum = 1529;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1530;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 216:
//C
this.state = 217;
this.catchState = 241;
 BA.debugLineNum = 1532;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184288060",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1533;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1534;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1535;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 217:
//C
this.state = 218;
this.catchState = 241;
;
 BA.debugLineNum = 1537;BA.debugLine="CLA.Info.Map1 = params";
Debug.ShouldStop(1);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map1" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 1539;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rel";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("' and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1541;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1543;BA.debugLine="Log(\"Grava Status na BD local Request-Relation";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184288071",RemoteObject.createImmutable("Grava Status na BD local Request-Relation"),0);
 BA.debugLineNum = 1545;BA.debugLine="Dim params As Map";
Debug.ShouldStop(256);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1546;BA.debugLine="params.Initialize";
Debug.ShouldStop(512);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1547;BA.debugLine="params.Clear";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1548;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1549;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 1550;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_actionkey)));
 BA.debugLineNum = 1551;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1552;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1553;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1554;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 1555;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 1556;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1557;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1558;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1559;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1560;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1561;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1562;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1563;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1564;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 1565;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 218:
//try
this.state = 223;
this.catchState = 222;
this.state = 220;
if (true) break;

case 220:
//C
this.state = 223;
this.catchState = 222;
 BA.debugLineNum = 1566;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 1567;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 1568;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 222:
//C
this.state = 223;
this.catchState = 241;
 BA.debugLineNum = 1570;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184288098",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1571;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1572;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 223:
//C
this.state = 224;
this.catchState = 241;
;
 BA.debugLineNum = 1574;BA.debugLine="CLA.Info.Map2 = params";
Debug.ShouldStop(32);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map2" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 1578;BA.debugLine="CLA.Status.status = 2";
Debug.ShouldStop(512);
_cla.getField(false,"Status" /*RemoteObject*/ ).setField ("status" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 1580;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 224:
//try
this.state = 235;
this.catchState = 234;
this.state = 226;
if (true) break;

case 226:
//C
this.state = 227;
this.catchState = 234;
 BA.debugLineNum = 1581;BA.debugLine="Dim tr_is_model As Int = DBStructures.GetScri";
Debug.ShouldStop(4096);
_tr_is_model = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select tr_is_model from dta_typerequests\n"),RemoteObject.createImmutable("											where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequesttype.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("tr_is_model")));Debug.locals.put("tr_is_model", _tr_is_model);Debug.locals.put("tr_is_model", _tr_is_model);
 BA.debugLineNum = 1583;BA.debugLine="If Utils.Int2Bool(tr_is_model) Then";
Debug.ShouldStop(16384);
if (true) break;

case 227:
//if
this.state = 232;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_tr_is_model)).<Boolean>get().booleanValue()) { 
this.state = 229;
}else {
this.state = 231;
}if (true) break;

case 229:
//C
this.state = 232;
 BA.debugLineNum = 1584;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activi";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",taskscl2.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("StartCLA_Activity_Child")),(Object)((_cla)),(Object)((_name)));
 if (true) break;

case 231:
//C
this.state = 232;
 BA.debugLineNum = 1586;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activi";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",taskscl2.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("StartCLA_ActivityTasks")),(Object)((_cla)),(Object)((_name)));
 if (true) break;

case 232:
//C
this.state = 235;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 234:
//C
this.state = 235;
this.catchState = 241;
 BA.debugLineNum = 1590;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184288118",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1591;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Shar";
Debug.ShouldStop(4194304);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("Call StartCLA_Activity")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 235:
//C
this.state = 236;
this.catchState = 241;
;
 if (true) break;

case 236:
//C
this.state = 239;
;
 BA.debugLineNum = 1594;BA.debugLine="incolitems.Close";
Debug.ShouldStop(33554432);
_incolitems.runVoidMethod ("Close");
 if (true) break;

case 238:
//C
this.state = 239;
 BA.debugLineNum = 1596;BA.debugLine="MsgboxAsync(ShareCode.AppDialogsNaoVerificadoTi";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._appdialogsnaoverificadotipointervencao /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),taskscl2.processBA);
 if (true) break;

case 239:
//C
this.state = 242;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 241:
//C
this.state = 242;
this.catchState = 0;
 BA.debugLineNum = 1599;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184288127",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 242:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1601;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1602;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",taskscl2.processBA, e0.toString());}
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
public static void  _jobdone(RemoteObject _jobd2s) throws Exception{
}
public static void  _returnshowtaskdetails(RemoteObject _items,RemoteObject _tvals) throws Exception{
try {
		Debug.PushSubsStack("ReturnShowTaskDetails (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1798);
if (RapidSub.canDelegate("returnshowtaskdetails")) { xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","returnshowtaskdetails", _items, _tvals); return;}
ResumableSub_ReturnShowTaskDetails rsub = new ResumableSub_ReturnShowTaskDetails(null,_items,_tvals);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReturnShowTaskDetails extends BA.ResumableSub {
public ResumableSub_ReturnShowTaskDetails(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _items,RemoteObject _tvals) {
this.parent = parent;
this._items = _items;
this._tvals = _tvals;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _items;
RemoteObject _tvals;
RemoteObject _newrequesttype = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newrequest = RemoteObject.createImmutable("");
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _repeatcounter = RemoteObject.createImmutable(0);
RemoteObject _maxidi = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _newrequestcode = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._createrequestreturn");
RemoteObject _incolitems = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _tasktype = RemoteObject.createImmutable(0);
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _actionkey = RemoteObject.createImmutable("");
RemoteObject _task = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _sdate = RemoteObject.createImmutable("");
RemoteObject _stime = RemoteObject.createImmutable("");
RemoteObject _close_type = RemoteObject.createImmutable(0);
RemoteObject _result_type = RemoteObject.createImmutable(0);
RemoteObject _result_values = RemoteObject.createImmutable("");
RemoteObject _clainfo = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requesttaskinfo");
RemoteObject _cla = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestcla");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReturnShowTaskDetails (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1798);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("items", _items);
Debug.locals.put("TVals", _tvals);
 BA.debugLineNum = 1802;BA.debugLine="Dim newRequestType As String = items.Get(0)";
Debug.ShouldStop(512);
_newrequesttype = BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("newRequestType", _newrequesttype);Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 1803;BA.debugLine="Dim tagcode As String = TVals.value1";
Debug.ShouldStop(1024);
_tagcode = _tvals.getField(true,"value1" /*RemoteObject*/ );Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1804;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*RemoteObject*/ )));
 BA.debugLineNum = 1805;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//try
this.state = 42;
this.catchState = 41;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 41;
 BA.debugLineNum = 1806;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(8192);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 1807;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(16384);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 1809;BA.debugLine="If Utils.NNE(newRequestType) Then";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 39;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequesttype)).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 38;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1810;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTag";
Debug.ShouldStop(131072);
_newrequest = parent.mostCurrent._utils.runMethod(true,"_makerequesttagcode" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newRequest", _newrequest);Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 1811;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(262144);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 1812;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(524288);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 1813;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
Debug.ShouldStop(1048576);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1815;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(4194304);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 1816;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 1817;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 1818;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 1819;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE_";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("route_tagcode"))),(Object)((RemoteObject.createImmutable("ROUTE__NONE__"))));
 BA.debugLineNum = 1820;BA.debugLine="newExecution.Put(\"is_child\", 0)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_child"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1821;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("prerequest"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1822;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1823;BA.debugLine="newExecution.Put(\"state_id\", 4)";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state_id"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 1824;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_date"))),(Object)((_newdate)));
 BA.debugLineNum = 1825;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_time"))),(Object)((_newtime)));
 BA.debugLineNum = 1826;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execdate_type"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1827;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dayweekmonth"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1828;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 1829;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 1830;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 1831;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERN";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin_tagcode"))),(Object)((RemoteObject.createImmutable("TORI_INTERNAL"))));
 BA.debugLineNum = 1832;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"__NONE__\")";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 1833;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 1834;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("technical_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 1835;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("team_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1836;BA.debugLine="newExecution.Put(\"local_tagcode\", \"\")";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("local_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1837;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newRequ";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("typerequest_tagcode"))),(Object)((_newrequesttype)));
 BA.debugLineNum = 1838;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.S";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vehicle_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_vehicle_object /*RemoteObject*/ )));
 BA.debugLineNum = 1839;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("confirmed"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1840;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1841;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(65536);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 1842;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(131072);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 1843;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(262144);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 1844;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
Debug.ShouldStop(524288);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 1846;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1848;BA.debugLine="Dim repeatcounter As Int = DBStructures.GetCoun";
Debug.ShouldStop(8388608);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getcountofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(" and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")))));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 1850;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
Debug.ShouldStop(33554432);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 1851;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(67108864);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 1852;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 1853;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 1854;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 1855;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode)";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 1856;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1857;BA.debugLine="newExecution.Put(\"position\", 0)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1858;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1859;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1860;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1861;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1862;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1863;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((RemoteObject.createImmutable("__NONE__"))));
 BA.debugLineNum = 1864;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 1865;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 1866;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 1867;BA.debugLine="newExecution.Put(\"repeatcounter\", repeatcounter";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 1868;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1869;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(4096);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 1870;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(8192);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 1871;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(16384);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 1872;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
Debug.ShouldStop(32768);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 1874;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1877;BA.debugLine="Dim maxIDi As Int = DBStructures.GetScriptColum";
Debug.ShouldStop(1048576);
_maxidi = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("select max(id) as id from dta_requests_values")),(Object)(RemoteObject.createImmutable("id"))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxIDi", _maxidi);Debug.locals.put("maxIDi", _maxidi);
 BA.debugLineNum = 1880;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests";
Debug.ShouldStop(8388608);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("					tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"),RemoteObject.createImmutable("					select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"),RemoteObject.createImmutable("					x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter\n"),RemoteObject.createImmutable("					from (select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxidi))),RemoteObject.createImmutable(" as id, a.request_tagcode, b.tagcode as inner_request_tagcode, \n"),RemoteObject.createImmutable("					a.relation_tagcode as task_tagcode, \n"),RemoteObject.createImmutable("					c.item_tagcode, c.unique_key, d.tagcode as tagcode, \n"),RemoteObject.createImmutable("					ifnull(d.position, c.position) AS position, '' as execute_value, \n"),RemoteObject.createImmutable("					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("					0 as confirmed, '' as changed_value, a.repeatcounter\n"),RemoteObject.createImmutable("					from dta_requests_relations as a\n"),RemoteObject.createImmutable("					inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("					inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("					left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("					where a.type_relation=0 and a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and a.relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("					and a.repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("					) as x\n"),RemoteObject.createImmutable("					order by  x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1899;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942693",_ssql,0);
 BA.debugLineNum = 1900;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL,";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql),(Object)(_newrequest));
 BA.debugLineNum = 1903;BA.debugLine="Dim res As ResumableSub = UploadNewRequest2Serv";
Debug.ShouldStop(16384);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _uploadnewrequest2server2(_newrequest,_newrequestitem,BA.ObjectToString("0"),BA.numberCast(int.class, 0));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1904;BA.debugLine="Wait For(res) Complete (NewRequestCode As Creat";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowtaskdetails"), _res);
this.state = 43;
return;
case 43:
//C
this.state = 7;
_newrequestcode = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("NewRequestCode", _newrequestcode);
;
 BA.debugLineNum = 1905;BA.debugLine="If(Utils.NNE(NewRequestCode.RequestTagcode)) Th";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 14;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1906;BA.debugLine="If Not(newRequest = NewRequestCode.RequestTagc";
Debug.ShouldStop(131072);
if (true) break;

case 10:
//if
this.state = 13;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_newrequest,_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1907;BA.debugLine="Dim sSQL As String = $\"update dta_requests se";
Debug.ShouldStop(262144);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1908;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1909;BA.debugLine="Dim sSQL As String = $\"update dta_requests_ad";
Debug.ShouldStop(1048576);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1910;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1912;BA.debugLine="Dim sSQL As String = $\"update dta_requests_en";
Debug.ShouldStop(8388608);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_entities set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1913;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1915;BA.debugLine="Dim sSQL As String = $\"update dta_requests_ob";
Debug.ShouldStop(67108864);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_objects set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1916;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1918;BA.debugLine="Dim sSQL As String = $\"update dta_requests_co";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_contacts set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1919;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1921;BA.debugLine="Dim sSQL As String = $\"update dta_requests_fi";
Debug.ShouldStop(1);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_fields set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1922;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1924;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
Debug.ShouldStop(8);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1925;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1926;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
Debug.ShouldStop(32);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1927;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1929;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
Debug.ShouldStop(256);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1930;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1931;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
Debug.ShouldStop(1024);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1932;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ )));
 BA.debugLineNum = 1933;BA.debugLine="newRequest = NewRequestCode.RequestTagcode";
Debug.ShouldStop(4096);
_newrequest = _newrequestcode.getField(true,"RequestTagcode" /*RemoteObject*/ );Debug.locals.put("newRequest", _newrequest);
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 1937;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "returnshowtaskdetails"),BA.numberCast(int.class, 1000));
this.state = 44;
return;
case 44:
//C
this.state = 15;
;
 BA.debugLineNum = 1939;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETRE";
Debug.ShouldStop(262144);
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*RemoteObject*/ ;Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1940;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newRe";
Debug.ShouldStop(524288);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" and z.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1941;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942735",_ssql,0);
 BA.debugLineNum = 1942;BA.debugLine="Log(newRequest)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942736",_newrequest,0);
 BA.debugLineNum = 1943;BA.debugLine="Private incolitems As Cursor";
Debug.ShouldStop(4194304);
_incolitems = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("incolitems", _incolitems);
 BA.debugLineNum = 1944;BA.debugLine="incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL";
Debug.ShouldStop(8388608);
_incolitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1945;BA.debugLine="If (incolitems.RowCount >= 1) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 15:
//if
this.state = 36;
if ((RemoteObject.solveBoolean("g",_incolitems.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1946;BA.debugLine="incolitems.Position = 0";
Debug.ShouldStop(33554432);
_incolitems.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1948;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
Debug.ShouldStop(134217728);
_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 1949;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\"";
Debug.ShouldStop(268435456);
_tasktype = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type")));Debug.locals.put("tasktype", _tasktype);Debug.locals.put("tasktype", _tasktype);
 BA.debugLineNum = 1950;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"stat";
Debug.ShouldStop(536870912);
_status_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 1951;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"";
Debug.ShouldStop(1073741824);
_tagcode = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1952;BA.debugLine="Dim actionkey As String = incolitems.GetString";
Debug.ShouldStop(-2147483648);
_actionkey = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("action_tagcode")));Debug.locals.put("actionkey", _actionkey);Debug.locals.put("actionkey", _actionkey);
 BA.debugLineNum = 1953;BA.debugLine="Dim task As String = incolitems.GetString(\"tas";
Debug.ShouldStop(1);
_task = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")));Debug.locals.put("task", _task);Debug.locals.put("task", _task);
 BA.debugLineNum = 1954;BA.debugLine="Dim name As String = incolitems.GetString(\"nam";
Debug.ShouldStop(2);
_name = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 1957;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDat";
Debug.ShouldStop(16);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 1958;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
Debug.ShouldStop(32);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1959;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
Debug.ShouldStop(64);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1961;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(256);
_sdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("sDate", _sdate);Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 1962;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(512);
_stime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("sTime", _stime);Debug.locals.put("sTime", _stime);
 BA.debugLineNum = 1964;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"clo";
Debug.ShouldStop(2048);
_close_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("close_type")));Debug.locals.put("close_type", _close_type);Debug.locals.put("close_type", _close_type);
 BA.debugLineNum = 1965;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"re";
Debug.ShouldStop(4096);
_result_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("result_type")));Debug.locals.put("result_type", _result_type);Debug.locals.put("result_type", _result_type);
 BA.debugLineNum = 1966;BA.debugLine="Dim result_values As String = incolitems.GetSt";
Debug.ShouldStop(8192);
_result_values = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("result_values")));Debug.locals.put("result_values", _result_values);Debug.locals.put("result_values", _result_values);
 BA.debugLineNum = 1967;BA.debugLine="Dim repeatcounter As Int = incolitems.GetInt(\"";
Debug.ShouldStop(16384);
_repeatcounter = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 1969;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeReq";
Debug.ShouldStop(65536);
_clainfo = parent.mostCurrent._types.runMethod(false,"_makerequesttaskinfo" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 2)),(Object)(_close_type),(Object)(_result_type),(Object)(_result_values),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));Debug.locals.put("CLAInfo", _clainfo);Debug.locals.put("CLAInfo", _clainfo);
 BA.debugLineNum = 1970;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(t";
Debug.ShouldStop(131072);
_cla = parent.mostCurrent._types.runMethod(false,"_makerequestcla" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_actionkey),(Object)(_task),(Object)(_repeatcounter),(Object)(_tasktype),(Object)(parent.mostCurrent._types.runMethod(false,"_makeinterv" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_id),(Object)(_tagcode),(Object)(_status_id),(Object)(parent.mostCurrent._utils.runMethod(true,"_colorint" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_status_id))))),(Object)(_clainfo),(Object)(parent.mostCurrent._types.runMethod(false,"_makeothercla" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("CLA", _cla);Debug.locals.put("CLA", _cla);
 BA.debugLineNum = 1974;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
Debug.ShouldStop(2097152);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1976;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1978;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rel";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1980;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1982;BA.debugLine="Log(\"Grava Status na BD local Request\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942776",RemoteObject.createImmutable("Grava Status na BD local Request"),0);
 BA.debugLineNum = 1983;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1073741824);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1984;BA.debugLine="params.Initialize";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1985;BA.debugLine="params.Clear";
Debug.ShouldStop(1);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1986;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1987;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 1988;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 1989;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1990;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 1991;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 1992;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 1993;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1994;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1995;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1996;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1997;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1998;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1999;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2000;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2001;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 18:
//try
this.state = 23;
this.catchState = 22;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 23;
this.catchState = 22;
 BA.debugLineNum = 2002;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 2003;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 41;
 BA.debugLineNum = 2005;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942799",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2006;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2007;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2008;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\"";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 41;
;
 BA.debugLineNum = 2010;BA.debugLine="CLA.Info.Map1 = params";
Debug.ShouldStop(33554432);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map1" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 2012;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rel";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("' and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2014;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialog")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 2016;BA.debugLine="Log(\"Grava Status na BD local Request-Relation";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942810",RemoteObject.createImmutable("Grava Status na BD local Request-Relation"),0);
 BA.debugLineNum = 2018;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2019;BA.debugLine="params.Initialize";
Debug.ShouldStop(4);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2020;BA.debugLine="params.Clear";
Debug.ShouldStop(8);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2021;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2022;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 2023;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_actionkey)));
 BA.debugLineNum = 2024;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 2025;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2026;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 2027;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 2028;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 2029;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2030;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2031;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2032;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2033;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2034;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2035;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2036;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2037;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 2038;BA.debugLine="Try";
Debug.ShouldStop(2097152);
if (true) break;

case 24:
//try
this.state = 29;
this.catchState = 28;
this.state = 26;
if (true) break;

case 26:
//C
this.state = 29;
this.catchState = 28;
 BA.debugLineNum = 2039;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 2040;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 2041;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\"";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 41;
 BA.debugLineNum = 2043;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942837",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2044;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2045;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 41;
;
 BA.debugLineNum = 2047;BA.debugLine="CLA.Info.Map2 = params					'Utils.CallApi(0, p";
Debug.ShouldStop(1073741824);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map2" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 2050;BA.debugLine="CLA.Status.status = 2";
Debug.ShouldStop(2);
_cla.getField(false,"Status" /*RemoteObject*/ ).setField ("status" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 2051;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 30:
//try
this.state = 35;
this.catchState = 34;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 34;
 BA.debugLineNum = 2052;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activit";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",taskscl2.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("StartCLA_ActivityTasks")),(Object)((_cla)),(Object)((_name)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 41;
 BA.debugLineNum = 2054;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942848",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2055;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Shar";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("Call StartCLA_Activity")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
this.catchState = 41;
;
 if (true) break;

case 36:
//C
this.state = 39;
;
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 2059;BA.debugLine="MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectsavisopedidoseminfo /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),taskscl2.processBA);
 if (true) break;

case 39:
//C
this.state = 42;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 41:
//C
this.state = 42;
this.catchState = 0;
 BA.debugLineNum = 2062;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6184942856",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 42:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 2064;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2065;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",taskscl2.processBA, e0.toString());}
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
public static RemoteObject  _setthefilters(RemoteObject _flt) throws Exception{
try {
		Debug.PushSubsStack("SetTheFilters (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,216);
if (RapidSub.canDelegate("setthefilters")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","setthefilters", _flt);}
RemoteObject _filter = RemoteObject.createImmutable("");
RemoteObject _itemactive = RemoteObject.createImmutable("");
RemoteObject _itemgroup = RemoteObject.createImmutable("");
Debug.locals.put("flt", _flt);
 BA.debugLineNum = 216;BA.debugLine="Sub SetTheFilters(flt As TaskFilter)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="IsFiltered  = True";
Debug.ShouldStop(16777216);
taskscl2._isfiltered = taskscl2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 218;BA.debugLine="Dim Filter As String = \"\"";
Debug.ShouldStop(33554432);
_filter = BA.ObjectToString("");Debug.locals.put("Filter", _filter);Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 220;BA.debugLine="Dim ItemActive As String = \"\"";
Debug.ShouldStop(134217728);
_itemactive = BA.ObjectToString("");Debug.locals.put("ItemActive", _itemactive);Debug.locals.put("ItemActive", _itemactive);
 BA.debugLineNum = 221;BA.debugLine="If (ShareCode.TaskTPRInactive) Then";
Debug.ShouldStop(268435456);
if ((taskscl2.mostCurrent._sharecode._tasktprinactive /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 222;BA.debugLine="ItemActive = \"0\"";
Debug.ShouldStop(536870912);
_itemactive = BA.ObjectToString("0");Debug.locals.put("ItemActive", _itemactive);
 };
 BA.debugLineNum = 225;BA.debugLine="If (ShareCode.TaskTPRActive) Then";
Debug.ShouldStop(1);
if ((taskscl2.mostCurrent._sharecode._tasktpractive /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 226;BA.debugLine="If Utils.NNE(ItemActive) Then ItemActive = $\"${I";
Debug.ShouldStop(2);
if (taskscl2.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_itemactive)).<Boolean>get().booleanValue()) { 
_itemactive = (RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemactive))),RemoteObject.createImmutable(",")));Debug.locals.put("ItemActive", _itemactive);};
 BA.debugLineNum = 227;BA.debugLine="ItemActive = $\"${ItemActive}1\"$";
Debug.ShouldStop(4);
_itemactive = (RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemactive))),RemoteObject.createImmutable("1")));Debug.locals.put("ItemActive", _itemactive);
 };
 BA.debugLineNum = 230;BA.debugLine="If Utils.NNE(ItemActive) Then";
Debug.ShouldStop(32);
if (taskscl2.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_itemactive)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 231;BA.debugLine="ItemActive = $\" and (a.active in (${ItemActive})";
Debug.ShouldStop(64);
_itemactive = (RemoteObject.concat(RemoteObject.createImmutable(" and (a.active in ("),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemactive))),RemoteObject.createImmutable("))")));Debug.locals.put("ItemActive", _itemactive);
 };
 BA.debugLineNum = 235;BA.debugLine="Dim ItemGroup As String = \"\"";
Debug.ShouldStop(1024);
_itemgroup = BA.ObjectToString("");Debug.locals.put("ItemGroup", _itemgroup);Debug.locals.put("ItemGroup", _itemgroup);
 BA.debugLineNum = 236;BA.debugLine="If CurrentTab = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",taskscl2._currenttab,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 237;BA.debugLine="If (ShareCode.TaskTPRSingular) Then";
Debug.ShouldStop(4096);
if ((taskscl2.mostCurrent._sharecode._tasktprsingular /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 238;BA.debugLine="ItemGroup = \"0\"";
Debug.ShouldStop(8192);
_itemgroup = BA.ObjectToString("0");Debug.locals.put("ItemGroup", _itemgroup);
 };
 BA.debugLineNum = 240;BA.debugLine="If (ShareCode.TaskTPRPlural) Then";
Debug.ShouldStop(32768);
if ((taskscl2.mostCurrent._sharecode._tasktprplural /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 241;BA.debugLine="If Utils.NNE(ItemGroup) Then ItemGroup = $\"${It";
Debug.ShouldStop(65536);
if (taskscl2.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_itemgroup)).<Boolean>get().booleanValue()) { 
_itemgroup = (RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemgroup))),RemoteObject.createImmutable(",")));Debug.locals.put("ItemGroup", _itemgroup);};
 BA.debugLineNum = 242;BA.debugLine="ItemGroup = $\"${ItemGroup}1\"$";
Debug.ShouldStop(131072);
_itemgroup = (RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemgroup))),RemoteObject.createImmutable("1")));Debug.locals.put("ItemGroup", _itemgroup);
 };
 BA.debugLineNum = 244;BA.debugLine="If Utils.NNE(ItemGroup) Then";
Debug.ShouldStop(524288);
if (taskscl2.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_itemgroup)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 245;BA.debugLine="ItemGroup = $\" and (a.tr_is_model in (${ItemGro";
Debug.ShouldStop(1048576);
_itemgroup = (RemoteObject.concat(RemoteObject.createImmutable(" and (a.tr_is_model in ("),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemgroup))),RemoteObject.createImmutable("))")));Debug.locals.put("ItemGroup", _itemgroup);
 };
 };
 BA.debugLineNum = 249;BA.debugLine="Filter = $\"${ItemActive}${ItemGroup}\"$";
Debug.ShouldStop(16777216);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemactive))),RemoteObject.createImmutable(""),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemgroup))),RemoteObject.createImmutable("")));Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 278;BA.debugLine="StartTasksActivity(True, Filter, CurrentTab)";
Debug.ShouldStop(2097152);
_starttasksactivity(taskscl2.mostCurrent.__c.getField(true,"True"),_filter,taskscl2._currenttab);
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showrequestdetails(RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("ShowRequestDetails (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,683);
if (RapidSub.canDelegate("showrequestdetails")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","showrequestdetails", _tagcode);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sqlevc = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 683;BA.debugLine="Sub ShowRequestDetails(tagcode As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 684;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(2048);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 685;BA.debugLine="Dim SQLEVC As String = $\"select a.item_type, a.ta";
Debug.ShouldStop(4096);
_sqlevc = (RemoteObject.concat(RemoteObject.createImmutable("select a.item_type, a.task_tagcode, a.title \n"),RemoteObject.createImmutable("					from dta_tasks_items as a \n"),RemoteObject.createImmutable("					inner join dta_typerequests_tasks as b on (b.task_tagcode=a.task_tagcode)\n"),RemoteObject.createImmutable("					where b.typerequest_tagcode='"),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' order by b.position, a.position")));Debug.locals.put("SQLEVC", _sqlevc);Debug.locals.put("SQLEVC", _sqlevc);
 BA.debugLineNum = 689;BA.debugLine="Log(SQLEVC)";
Debug.ShouldStop(65536);
taskscl2.mostCurrent.__c.runVoidMethod ("LogImpl","6184221702",_sqlevc,0);
 BA.debugLineNum = 690;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)";
Debug.ShouldStop(131072);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), taskscl2.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlevc)));
 BA.debugLineNum = 691;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 692;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(524288);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 693;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(1048576);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);
 BA.debugLineNum = 694;BA.debugLine="Filter.getRequestTaskDetailsDialog(Activity, \"Ta";
Debug.ShouldStop(2097152);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getrequesttaskdetailsdialog" /*void*/ ,(Object)(taskscl2.mostCurrent._activity),(Object)(RemoteObject.createImmutable(("TasksCL2"))),(Object)(taskscl2.mostCurrent._sharecode._tarefasavisoinfodescritiva /*RemoteObject*/ ),(Object)(_record),(Object)(_tagcode));
 }else {
 BA.debugLineNum = 696;BA.debugLine="MsgboxAsync(ShareCode.checklistErroacesso, Share";
Debug.ShouldStop(8388608);
taskscl2.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(taskscl2.mostCurrent._sharecode._checklisterroacesso /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(taskscl2.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),taskscl2.processBA);
 BA.debugLineNum = 697;BA.debugLine="Record.Close";
Debug.ShouldStop(16777216);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 699;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showtaskdetails(RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("ShowTaskDetails (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,1780);
if (RapidSub.canDelegate("showtaskdetails")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","showtaskdetails", _tagcode);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sqlevc = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1780;BA.debugLine="Sub ShowTaskDetails(tagcode As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1781;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(1048576);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1782;BA.debugLine="Dim SQLEVC As String = $\"select a.item_type, a.ta";
Debug.ShouldStop(2097152);
_sqlevc = (RemoteObject.concat(RemoteObject.createImmutable("select a.item_type, a.task_tagcode, a.title from dta_tasks_items as a where a.task_tagcode='"),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' order by position")));Debug.locals.put("SQLEVC", _sqlevc);Debug.locals.put("SQLEVC", _sqlevc);
 BA.debugLineNum = 1783;BA.debugLine="Log(SQLEVC)";
Debug.ShouldStop(4194304);
taskscl2.mostCurrent.__c.runVoidMethod ("LogImpl","6184877059",_sqlevc,0);
 BA.debugLineNum = 1784;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)";
Debug.ShouldStop(8388608);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), taskscl2.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlevc)));
 BA.debugLineNum = 1785;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1786;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(33554432);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1787;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(67108864);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);
 BA.debugLineNum = 1788;BA.debugLine="Filter.getTaskDetailsDialog(Activity, \"TasksCL2\"";
Debug.ShouldStop(134217728);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_gettaskdetailsdialog" /*void*/ ,(Object)(taskscl2.mostCurrent._activity),(Object)(RemoteObject.createImmutable(("TasksCL2"))),(Object)(taskscl2.mostCurrent._sharecode._tarefasavisoinfodescritiva /*RemoteObject*/ ),(Object)(_record),(Object)(_tagcode));
 }else {
 BA.debugLineNum = 1790;BA.debugLine="MsgboxAsync(ShareCode.checklistErroacesso, Share";
Debug.ShouldStop(536870912);
taskscl2.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(taskscl2.mostCurrent._sharecode._checklisterroacesso /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(taskscl2.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),taskscl2.processBA);
 BA.debugLineNum = 1791;BA.debugLine="Record.Close";
Debug.ShouldStop(1073741824);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 1793;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttasksactivity(RemoteObject _clear,RemoteObject _filter,RemoteObject _tabposis) throws Exception{
try {
		Debug.PushSubsStack("StartTasksActivity (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,298);
if (RapidSub.canDelegate("starttasksactivity")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","starttasksactivity", _clear, _filter, _tabposis);}
RemoteObject _sfilter = RemoteObject.createImmutable("");
RemoteObject _tfilter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._taskfilter");
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _default_department = RemoteObject.createImmutable("");
RemoteObject _sqlevc = RemoteObject.createImmutable("");
int _row = 0;
RemoteObject _paramters = RemoteObject.createImmutable("");
RemoteObject _only_related_type_technicals = RemoteObject.createImmutable(0);
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _execute_location = RemoteObject.createImmutable("");
RemoteObject _authorized_technicals = RemoteObject.createImmutable("");
RemoteObject _can_fo = RemoteObject.createImmutable("");
RemoteObject _executa = RemoteObject.createImmutable(false);
Debug.locals.put("Clear", _clear);
Debug.locals.put("Filter", _filter);
Debug.locals.put("tabposis", _tabposis);
 BA.debugLineNum = 298;BA.debugLine="Sub StartTasksActivity(Clear As Boolean, Filter As";
Debug.ShouldStop(512);
 BA.debugLineNum = 301;BA.debugLine="Starter.TaskSearchFilter = Filter";
Debug.ShouldStop(4096);
taskscl2.mostCurrent._starter._tasksearchfilter /*RemoteObject*/  = _filter;
 BA.debugLineNum = 303;BA.debugLine="If Utils.NE(Filter) Then";
Debug.ShouldStop(16384);
if (taskscl2.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_filter)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 304;BA.debugLine="Filter = $\" and (a.active in (1))\"$";
Debug.ShouldStop(32768);
_filter = (RemoteObject.createImmutable(" and (a.active in (1))"));Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 305;BA.debugLine="ShareCode.TaskTPRInactive = False";
Debug.ShouldStop(65536);
taskscl2.mostCurrent._sharecode._tasktprinactive /*RemoteObject*/  = taskscl2.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 308;BA.debugLine="If (Starter.EntityKeepFilter = True) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",taskscl2.mostCurrent._starter._entitykeepfilter /*RemoteObject*/ ,taskscl2.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 309;BA.debugLine="Starter.EntityKeepFilter = False";
Debug.ShouldStop(1048576);
taskscl2.mostCurrent._starter._entitykeepfilter /*RemoteObject*/  = taskscl2.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 310;BA.debugLine="If (Starter.TaskSearchFilter <> \"\") Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("!",taskscl2.mostCurrent._starter._tasksearchfilter /*RemoteObject*/ ,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 311;BA.debugLine="Dim sFilter As String = Starter.TaskSearchFilte";
Debug.ShouldStop(4194304);
_sfilter = taskscl2.mostCurrent._starter._tasksearchfilter /*RemoteObject*/ ;Debug.locals.put("sFilter", _sfilter);Debug.locals.put("sFilter", _sfilter);
 BA.debugLineNum = 312;BA.debugLine="Starter.TaskSearchFilter = \"\"";
Debug.ShouldStop(8388608);
taskscl2.mostCurrent._starter._tasksearchfilter /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 313;BA.debugLine="Starter.TaskFilters = Types.MakeTaskFilter(0, 0";
Debug.ShouldStop(16777216);
taskscl2.mostCurrent._starter._taskfilters /*RemoteObject*/  = taskscl2.mostCurrent._types.runMethod(false,"_maketaskfilter" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 314;BA.debugLine="StartTasksActivity(True, sFilter, tabposis)";
Debug.ShouldStop(33554432);
_starttasksactivity(taskscl2.mostCurrent.__c.getField(true,"True"),_sfilter,_tabposis);
 }else {
 BA.debugLineNum = 316;BA.debugLine="Dim tFilter As TaskFilter = Starter.TaskFilters";
Debug.ShouldStop(134217728);
_tfilter = taskscl2.mostCurrent._starter._taskfilters /*RemoteObject*/ ;Debug.locals.put("tFilter", _tfilter);Debug.locals.put("tFilter", _tfilter);
 BA.debugLineNum = 317;BA.debugLine="Starter.TaskFilters = Types.MakeTaskFilter(0, 0";
Debug.ShouldStop(268435456);
taskscl2.mostCurrent._starter._taskfilters /*RemoteObject*/  = taskscl2.mostCurrent._types.runMethod(false,"_maketaskfilter" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 318;BA.debugLine="Starter.TaskSearchFilter = \"\"";
Debug.ShouldStop(536870912);
taskscl2.mostCurrent._starter._tasksearchfilter /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 319;BA.debugLine="SetTheFilters(tFilter)";
Debug.ShouldStop(1073741824);
_setthefilters(_tfilter);
 };
 }else {
 BA.debugLineNum = 323;BA.debugLine="If Clear Then";
Debug.ShouldStop(4);
if (_clear.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 324;BA.debugLine="If (CurrentTab = 0) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",taskscl2._currenttab,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 325;BA.debugLine="listTypeRequests.Clear";
Debug.ShouldStop(16);
taskscl2.mostCurrent._listtyperequests.runVoidMethod ("_clear");
 }else {
 BA.debugLineNum = 327;BA.debugLine="listChecklists.Clear";
Debug.ShouldStop(64);
taskscl2.mostCurrent._listchecklists.runVoidMethod ("_clear");
 };
 };
 BA.debugLineNum = 335;BA.debugLine="Dim height As Int = 85dip";
Debug.ShouldStop(16384);
_height = taskscl2.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 337;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(65536);
if ((taskscl2.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 338;BA.debugLine="height = 145dip";
Debug.ShouldStop(131072);
_height = taskscl2.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 145)));Debug.locals.put("height", _height);
 };
 BA.debugLineNum = 341;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(1048576);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 342;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(2097152);
taskscl2._itemscounter = BA.numberCast(int.class, 0);
 BA.debugLineNum = 344;BA.debugLine="If ShareCode.TaskTPRInactive = False And Not(Fil";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",taskscl2.mostCurrent._sharecode._tasktprinactive /*RemoteObject*/ ,taskscl2.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",taskscl2.mostCurrent.__c.runMethod(true,"Not",(Object)(_filter.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("and (a.active in (1))"))))))) { 
 BA.debugLineNum = 345;BA.debugLine="Filter = \" and (a.active in (1)) \" & Filter";
Debug.ShouldStop(16777216);
_filter = RemoteObject.concat(RemoteObject.createImmutable(" and (a.active in (1)) "),_filter);Debug.locals.put("Filter", _filter);
 };
 BA.debugLineNum = 352;BA.debugLine="Dim default_department As String = DBStructures.";
Debug.ShouldStop(-2147483648);
_default_department = taskscl2.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select default_department as value \n"),RemoteObject.createImmutable("								from dta_technicals_adds \n"),RemoteObject.createImmutable("								where technical_tagcode='"),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((taskscl2.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ .runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("value")));Debug.locals.put("default_department", _default_department);Debug.locals.put("default_department", _default_department);
 BA.debugLineNum = 355;BA.debugLine="If Utils.NNE(default_department) Then";
Debug.ShouldStop(4);
if (taskscl2.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_default_department)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 356;BA.debugLine="Filter = $\" and (e.departments like '%${default";
Debug.ShouldStop(8);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(" and (e.departments like '%"),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_default_department.runMethod(true,"trim")))),RemoteObject.createImmutable("%') "),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("")));Debug.locals.put("Filter", _filter);
 };
 BA.debugLineNum = 359;BA.debugLine="Dim SQLEVC As String = $\"SELECT a.tagcode, a.gro";
Debug.ShouldStop(64);
_sqlevc = (RemoteObject.concat(RemoteObject.createImmutable("SELECT a.tagcode, a.group_type, ifnull(b.tagdesc, '(Sem grupo)') AS taskgroup_desc, '' as typeresults_desc, \n"),RemoteObject.createImmutable("								a.title, a.details, 0 as dayslastupdate, a.group_tags, a.details,a.paramters,c.only_related_type_technicals,\n"),RemoteObject.createImmutable("								a.updated_at, a.active, a.published, a.tr_is_model, a.tr_model_modes,a.tagcode FROM dta_typerequests AS a\n"),RemoteObject.createImmutable("								LEFT JOIN type_tpgroupstypes AS b ON (b.tagcode=a.group_type) \n"),RemoteObject.createImmutable("								LEFT JOIN dta_typerequests_adds as c ON (c.typerequest_tagcode=a.tagcode)\n"),RemoteObject.createImmutable("								left join dta_typerequests_auths as d on (d.typerequest_tagcode=c.typerequest_tagcode)\n"),RemoteObject.createImmutable("								left join dta_auths as e on (e.tagcode=d.auths_tagcode)\n"),RemoteObject.createImmutable("								WHERE  1=1 \n"),RemoteObject.createImmutable("									and a.published=1 \n"),RemoteObject.createImmutable("									and a.is_internal=0 \n"),RemoteObject.createImmutable("									and published=1 \n"),RemoteObject.createImmutable("									"),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("									order by a.title")));Debug.locals.put("SQLEVC", _sqlevc);Debug.locals.put("SQLEVC", _sqlevc);
 BA.debugLineNum = 385;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)";
Debug.ShouldStop(1);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), taskscl2.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlevc)));
 BA.debugLineNum = 388;BA.debugLine="CurrentLineItemCL = 0";
Debug.ShouldStop(8);
taskscl2._currentlineitemcl = BA.numberCast(int.class, 0);
 BA.debugLineNum = 389;BA.debugLine="Log(SQLEVC)";
Debug.ShouldStop(16);
taskscl2.mostCurrent.__c.runVoidMethod ("LogImpl","6182845531",_sqlevc,0);
 BA.debugLineNum = 390;BA.debugLine="TotalLineItemsCL = Record.RowCount";
Debug.ShouldStop(32);
taskscl2._totallineitemscl = _record.runMethod(true,"getRowCount");
 BA.debugLineNum = 391;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 392;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(128);
{
final int step46 = 1;
final int limit46 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step46 > 0 && _row <= limit46) || (step46 < 0 && _row >= limit46) ;_row = ((int)(0 + _row + step46))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 393;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(256);
taskscl2._itemscounter = RemoteObject.solve(new RemoteObject[] {taskscl2._itemscounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 394;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(512);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 395;BA.debugLine="Dim paramters As String = Record.GetString(\"pa";
Debug.ShouldStop(1024);
_paramters = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("paramters")));Debug.locals.put("paramters", _paramters);Debug.locals.put("paramters", _paramters);
 BA.debugLineNum = 396;BA.debugLine="Dim only_related_type_technicals As Int = Reco";
Debug.ShouldStop(2048);
_only_related_type_technicals = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("only_related_type_technicals")));Debug.locals.put("only_related_type_technicals", _only_related_type_technicals);Debug.locals.put("only_related_type_technicals", _only_related_type_technicals);
 BA.debugLineNum = 398;BA.debugLine="Dim JSON As JSONParser";
Debug.ShouldStop(8192);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 399;BA.debugLine="Dim MapJson As Map";
Debug.ShouldStop(16384);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("MapJson", _mapjson);
 BA.debugLineNum = 400;BA.debugLine="JSON.Initialize(paramters)";
Debug.ShouldStop(32768);
_json.runVoidMethod ("Initialize",(Object)(_paramters));
 BA.debugLineNum = 401;BA.debugLine="MapJson = JSON.NextObject";
Debug.ShouldStop(65536);
_mapjson = _json.runMethod(false,"NextObject");Debug.locals.put("MapJson", _mapjson);
 BA.debugLineNum = 402;BA.debugLine="Dim execute_location As String = MapJson.Get(\"";
Debug.ShouldStop(131072);
_execute_location = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("execute_location")))));Debug.locals.put("execute_location", _execute_location);Debug.locals.put("execute_location", _execute_location);
 BA.debugLineNum = 403;BA.debugLine="Dim authorized_technicals As String = MapJson.";
Debug.ShouldStop(262144);
_authorized_technicals = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authorized_technicals")))));Debug.locals.put("authorized_technicals", _authorized_technicals);Debug.locals.put("authorized_technicals", _authorized_technicals);
 BA.debugLineNum = 404;BA.debugLine="JSON.Initialize(execute_location)";
Debug.ShouldStop(524288);
_json.runVoidMethod ("Initialize",(Object)(_execute_location));
 BA.debugLineNum = 405;BA.debugLine="MapJson = JSON.NextObject";
Debug.ShouldStop(1048576);
_mapjson = _json.runMethod(false,"NextObject");Debug.locals.put("MapJson", _mapjson);
 BA.debugLineNum = 406;BA.debugLine="Dim can_fo As String = MapJson.Get(\"can_fo\")";
Debug.ShouldStop(2097152);
_can_fo = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("can_fo")))));Debug.locals.put("can_fo", _can_fo);Debug.locals.put("can_fo", _can_fo);
 BA.debugLineNum = 407;BA.debugLine="If (can_fo = \"1\") Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",_can_fo,RemoteObject.createImmutable("1")))) { 
 BA.debugLineNum = 409;BA.debugLine="Dim executa As Boolean = True";
Debug.ShouldStop(16777216);
_executa = taskscl2.mostCurrent.__c.getField(true,"True");Debug.locals.put("executa", _executa);Debug.locals.put("executa", _executa);
 BA.debugLineNum = 410;BA.debugLine="If Utils.NNE(authorized_technicals) Then";
Debug.ShouldStop(33554432);
if (taskscl2.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_authorized_technicals)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 412;BA.debugLine="executa=authorized_technicals.Contains(Share";
Debug.ShouldStop(134217728);
_executa = _authorized_technicals.runMethod(true,"contains",(Object)(taskscl2.mostCurrent._sharecode._sess_user /*RemoteObject*/ ));Debug.locals.put("executa", _executa);
 };
 BA.debugLineNum = 415;BA.debugLine="If (executa) Then";
Debug.ShouldStop(1073741824);
if ((_executa).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 416;BA.debugLine="listTypeRequests.Add( CreateListItem(ItemsCo";
Debug.ShouldStop(-2147483648);
taskscl2.mostCurrent._listtyperequests.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistitem(taskscl2._itemscounter,_record,taskscl2.mostCurrent._listtyperequests.runMethod(false,"_asview").runMethod(true,"getWidth"),_height,taskscl2.mostCurrent.__c.getField(true,"True")).getObject()),(Object)((RemoteObject.createImmutable(""))));
 };
 };
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 424;BA.debugLine="Record.Close";
Debug.ShouldStop(128);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 510;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(536870912);
_windowstatusupdate();
 };
 BA.debugLineNum = 512;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(-2147483648);
taskscl2.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttasksactivityfirst(RemoteObject _clear,RemoteObject _filter) throws Exception{
try {
		Debug.PushSubsStack("StartTasksActivityFirst (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,285);
if (RapidSub.canDelegate("starttasksactivityfirst")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","starttasksactivityfirst", _clear, _filter);}
Debug.locals.put("Clear", _clear);
Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 285;BA.debugLine="Sub StartTasksActivityFirst(Clear As Boolean, Filt";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 287;BA.debugLine="If Filter = \"CalledFromMenu\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_filter,BA.ObjectToString("CalledFromMenu"))) { 
 BA.debugLineNum = 288;BA.debugLine="Filter = \"\"";
Debug.ShouldStop(-2147483648);
_filter = BA.ObjectToString("");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 289;BA.debugLine="EditSearch.Text = \"\"";
Debug.ShouldStop(1);
taskscl2.mostCurrent._editsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 292;BA.debugLine="StartTasksActivity(True, Filter, 0)";
Debug.ShouldStop(8);
_starttasksactivity(taskscl2.mostCurrent.__c.getField(true,"True"),_filter,BA.numberCast(int.class, 0));
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemainlayout() throws Exception{
try {
		Debug.PushSubsStack("UpdateMainLayout (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,137);
if (RapidSub.canDelegate("updatemainlayout")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","updatemainlayout");}
RemoteObject _gc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 137;BA.debugLine="Sub UpdateMainLayout";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
Debug.ShouldStop(512);
taskscl2.mostCurrent._mainlabeloptlists.runMethod(true,"setTextColor",taskscl2.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1024);
if (taskscl2.mostCurrent.__c.runMethod(true,"Not",(Object)(taskscl2.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 140;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
Debug.ShouldStop(2048);
taskscl2.mostCurrent._mainlogo.runMethod(true,"setGravity",taskscl2.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 141;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
Debug.ShouldStop(4096);
taskscl2.mostCurrent._mainlogo.runMethod(true,"setWidth",taskscl2.mostCurrent._consts._logowidth /*RemoteObject*/ );
 BA.debugLineNum = 142;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN";
Debug.ShouldStop(8192);
taskscl2.mostCurrent.__c.runVoidMethod ("LogImpl","6182452229",(RemoteObject.concat(RemoteObject.createImmutable("Inicialização de BMP: "),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((taskscl2.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 143;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) The";
Debug.ShouldStop(16384);
if ((taskscl2.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(taskscl2.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 144;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(S";
Debug.ShouldStop(32768);
taskscl2.mostCurrent._mainlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((taskscl2.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(taskscl2.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 };
 };
 BA.debugLineNum = 148;BA.debugLine="Dim gc As GradientDrawable";
Debug.ShouldStop(524288);
_gc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gc", _gc);
 BA.debugLineNum = 149;BA.debugLine="gc.Initialize(\"TOP_BOTTOM\", Array As Int(Consts.C";
Debug.ShouldStop(1048576);
_gc.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {taskscl2.mostCurrent._consts._colormain /*RemoteObject*/ ,taskscl2.mostCurrent._consts._colorsub /*RemoteObject*/ })));
 BA.debugLineNum = 150;BA.debugLine="ColorTabPanel.Background = gc";
Debug.ShouldStop(2097152);
taskscl2.mostCurrent._colortabpanel.runMethod(false,"setBackground",(_gc.getObject()));
 BA.debugLineNum = 151;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
Debug.ShouldStop(4194304);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), taskscl2.mostCurrent._liststabpanel);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 152;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(8388608);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 154;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
Debug.ShouldStop(33554432);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndicatorColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(taskscl2.mostCurrent._consts._colormain /*RemoteObject*/ )})));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemyposition(RemoteObject _lat,RemoteObject _lon) throws Exception{
try {
		Debug.PushSubsStack("UpdateMyPosition (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,576);
if (RapidSub.canDelegate("updatemyposition")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","updatemyposition", _lat, _lon);}
Debug.locals.put("Lat", _lat);
Debug.locals.put("Lon", _lon);
 BA.debugLineNum = 576;BA.debugLine="Public Sub UpdateMyPosition(Lat As String, Lon As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 577;BA.debugLine="If (LabelAppInfo.IsInitialized) Then";
Debug.ShouldStop(1);
if ((taskscl2.mostCurrent._labelappinfo.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 578;BA.debugLine="MyPositionLat = Lat";
Debug.ShouldStop(2);
taskscl2._mypositionlat = _lat;
 BA.debugLineNum = 579;BA.debugLine="MyPositionLon = Lon";
Debug.ShouldStop(4);
taskscl2._mypositionlon = _lon;
 BA.debugLineNum = 580;BA.debugLine="LabelAppInfo.Text =  $\"Latitude: ${MyPositionLat";
Debug.ShouldStop(8);
taskscl2.mostCurrent._labelappinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Latitude: "),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((taskscl2._mypositionlat))),RemoteObject.createImmutable(", Longitude: "),taskscl2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((taskscl2._mypositionlon))),RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 582;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateserverupdorins(RemoteObject _tablename,RemoteObject _operationtype,RemoteObject _request_tagcode,RemoteObject _task_tagcode,RemoteObject _item_tagcode,RemoteObject _rc,RemoteObject _rfc,RemoteObject _ric) throws Exception{
try {
		Debug.PushSubsStack("UpdateServerUPDorINS (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2695);
if (RapidSub.canDelegate("updateserverupdorins")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","updateserverupdorins", _tablename, _operationtype, _request_tagcode, _task_tagcode, _item_tagcode, _rc, _rfc, _ric);}
ResumableSub_UpdateServerUPDorINS rsub = new ResumableSub_UpdateServerUPDorINS(null,_tablename,_operationtype,_request_tagcode,_task_tagcode,_item_tagcode,_rc,_rfc,_ric);
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
public static class ResumableSub_UpdateServerUPDorINS extends BA.ResumableSub {
public ResumableSub_UpdateServerUPDorINS(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _tablename,RemoteObject _operationtype,RemoteObject _request_tagcode,RemoteObject _task_tagcode,RemoteObject _item_tagcode,RemoteObject _rc,RemoteObject _rfc,RemoteObject _ric) {
this.parent = parent;
this._tablename = _tablename;
this._operationtype = _operationtype;
this._request_tagcode = _request_tagcode;
this._task_tagcode = _task_tagcode;
this._item_tagcode = _item_tagcode;
this._rc = _rc;
this._rfc = _rfc;
this._ric = _ric;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _tablename;
RemoteObject _operationtype;
RemoteObject _request_tagcode;
RemoteObject _task_tagcode;
RemoteObject _item_tagcode;
RemoteObject _rc;
RemoteObject _rfc;
RemoteObject _ric;
RemoteObject _tablequery = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _mapfields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datafields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mapitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mapconditions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _colnum = 0;
RemoteObject _colname = RemoteObject.createImmutable("");
RemoteObject _colvalue = RemoteObject.createImmutable("");
RemoteObject _listconditions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _aclajson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newparams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _jobd2s = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");
RemoteObject _thedata = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
int step20;
int limit20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateServerUPDorINS (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2695);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Tablename", _tablename);
Debug.locals.put("Operationtype", _operationtype);
Debug.locals.put("request_tagcode", _request_tagcode);
Debug.locals.put("task_tagcode", _task_tagcode);
Debug.locals.put("item_tagcode", _item_tagcode);
Debug.locals.put("rc", _rc);
Debug.locals.put("rfc", _rfc);
Debug.locals.put("ric", _ric);
 BA.debugLineNum = 2698;BA.debugLine="If item_tagcode <> \"\" Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_item_tagcode,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2700;BA.debugLine="Dim TableQuery As ResultSet = Starter.LocalSQLEV";
Debug.ShouldStop(2048);
_tablequery = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_tablequery = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select * from "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tablename))),RemoteObject.createImmutable(" where 1=1\n"),RemoteObject.createImmutable("																	And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	and item_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	and repeatcounter = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rc))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("																	and repeatfieldcounter = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rfc))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("																	and repeatitemcounter = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ric))),RemoteObject.createImmutable(""))))));Debug.locals.put("TableQuery", _tablequery);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2708;BA.debugLine="Dim TableQuery As ResultSet = Starter.LocalSQLEV";
Debug.ShouldStop(524288);
_tablequery = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_tablequery = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("select * from "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tablename))),RemoteObject.createImmutable(" where 1=1\n"),RemoteObject.createImmutable("																	And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	and repeatcounter = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rc))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("																	and repeatitemcounter = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ric))),RemoteObject.createImmutable(""))))));Debug.locals.put("TableQuery", _tablequery);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2719;BA.debugLine="Dim MapFields As Map";
Debug.ShouldStop(1073741824);
_mapfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("MapFields", _mapfields);
 BA.debugLineNum = 2720;BA.debugLine="MapFields.Initialize";
Debug.ShouldStop(-2147483648);
_mapfields.runVoidMethod ("Initialize");
 BA.debugLineNum = 2721;BA.debugLine="Dim DataFields As List";
Debug.ShouldStop(1);
_datafields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("DataFields", _datafields);
 BA.debugLineNum = 2722;BA.debugLine="DataFields.Initialize";
Debug.ShouldStop(2);
_datafields.runVoidMethod ("Initialize");
 BA.debugLineNum = 2723;BA.debugLine="Dim MapItems As Map";
Debug.ShouldStop(4);
_mapitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("MapItems", _mapitems);
 BA.debugLineNum = 2724;BA.debugLine="MapItems.Initialize";
Debug.ShouldStop(8);
_mapitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 2725;BA.debugLine="Dim ListItems As List";
Debug.ShouldStop(16);
_listitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListItems", _listitems);
 BA.debugLineNum = 2726;BA.debugLine="ListItems.Initialize";
Debug.ShouldStop(32);
_listitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 2727;BA.debugLine="Dim MapConditions As Map";
Debug.ShouldStop(64);
_mapconditions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("MapConditions", _mapconditions);
 BA.debugLineNum = 2728;BA.debugLine="MapConditions.Initialize";
Debug.ShouldStop(128);
_mapconditions.runVoidMethod ("Initialize");
 BA.debugLineNum = 2730;BA.debugLine="MapItems.Put(\"table\",\"dta_requests_values\")";
Debug.ShouldStop(512);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("table"))),(Object)((RemoteObject.createImmutable("dta_requests_values"))));
 BA.debugLineNum = 2731;BA.debugLine="MapItems.Put(\"type\",Operationtype)";
Debug.ShouldStop(1024);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((_operationtype)));
 BA.debugLineNum = 2734;BA.debugLine="If TableQuery.RowCount > 0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//if
this.state = 69;
if (RemoteObject.solveBoolean(">",_tablequery.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2735;BA.debugLine="Do While TableQuery.NextRow";
Debug.ShouldStop(16384);
if (true) break;

case 10:
//do while
this.state = 40;
while (_tablequery.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 12;
if (true) break;
}
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2736;BA.debugLine="For colnum = 0 To TableQuery.ColumnCount -1";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//for
this.state = 39;
step20 = 1;
limit20 = RemoteObject.solve(new RemoteObject[] {_tablequery.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_colnum = 0 ;
Debug.locals.put("colnum", _colnum);
this.state = 70;
if (true) break;

case 70:
//C
this.state = 39;
if ((step20 > 0 && _colnum <= limit20) || (step20 < 0 && _colnum >= limit20)) this.state = 15;
if (true) break;

case 71:
//C
this.state = 70;
_colnum = ((int)(0 + _colnum + step20)) ;
Debug.locals.put("colnum", _colnum);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2737;BA.debugLine="Dim ColName As String = TableQuery.GetColumnNa";
Debug.ShouldStop(65536);
_colname = _tablequery.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _colnum)));Debug.locals.put("ColName", _colname);Debug.locals.put("ColName", _colname);
 BA.debugLineNum = 2738;BA.debugLine="Dim ColValue As String = TableQuery.GetString(";
Debug.ShouldStop(131072);
_colvalue = _tablequery.runMethod(true,"GetString",(Object)(_colname));Debug.locals.put("ColValue", _colvalue);Debug.locals.put("ColValue", _colvalue);
 BA.debugLineNum = 2739;BA.debugLine="If ColName.ToLowerCase.trim <> \"id\" And ColNam";
Debug.ShouldStop(262144);
if (true) break;

case 16:
//if
this.state = 38;
if (RemoteObject.solveBoolean("!",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("id")) && RemoteObject.solveBoolean("!",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("created_at")) && RemoteObject.solveBoolean("!",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("updated_at"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2740;BA.debugLine="If Utils.isNull(ColValue) Then";
Debug.ShouldStop(524288);
if (true) break;

case 19:
//if
this.state = 22;
if (parent.mostCurrent._utils.runMethod(true,"_isnull" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_colvalue)).<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2741;BA.debugLine="ColValue = \"\"";
Debug.ShouldStop(1048576);
_colvalue = BA.ObjectToString("");Debug.locals.put("ColValue", _colvalue);
 if (true) break;
;
 BA.debugLineNum = 2743;BA.debugLine="If Operationtype = \"update\" Then";
Debug.ShouldStop(4194304);

case 22:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_operationtype,BA.ObjectToString("update"))) { 
this.state = 24;
}else {
this.state = 36;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2744;BA.debugLine="MapFields.Put(\"execute_status\",\"1\")";
Debug.ShouldStop(8388608);
_mapfields.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_status"))),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 2745;BA.debugLine="If ColName.ToLowerCase.Trim = \"execute_value";
Debug.ShouldStop(16777216);
if (true) break;

case 25:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("execute_value"))) { 
this.state = 27;
}else 
{ BA.debugLineNum = 2747;BA.debugLine="Else If ColName.ToLowerCase.Trim = \"execute_";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("execute_value_title"))) { 
this.state = 29;
}else 
{ BA.debugLineNum = 2749;BA.debugLine="Else If ColName.ToLowerCase.Trim = \"title\" T";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("title"))) { 
this.state = 31;
}else 
{ BA.debugLineNum = 2751;BA.debugLine="Else If ColName.ToLowerCase.Trim = \"object_t";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_colname.runMethod(true,"toLowerCase").runMethod(true,"trim"),BA.ObjectToString("object_tagcode"))) { 
this.state = 33;
}}}}
if (true) break;

case 27:
//C
this.state = 34;
 BA.debugLineNum = 2746;BA.debugLine="MapFields.Put(ColName, ColValue)";
Debug.ShouldStop(33554432);
_mapfields.runVoidMethod ("Put",(Object)((_colname)),(Object)((_colvalue)));
 if (true) break;

case 29:
//C
this.state = 34;
 BA.debugLineNum = 2748;BA.debugLine="MapFields.Put(ColName, ColValue)";
Debug.ShouldStop(134217728);
_mapfields.runVoidMethod ("Put",(Object)((_colname)),(Object)((_colvalue)));
 if (true) break;

case 31:
//C
this.state = 34;
 BA.debugLineNum = 2750;BA.debugLine="MapFields.Put(ColName, ColValue)";
Debug.ShouldStop(536870912);
_mapfields.runVoidMethod ("Put",(Object)((_colname)),(Object)((_colvalue)));
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2752;BA.debugLine="MapFields.Put(ColName, ColValue)";
Debug.ShouldStop(-2147483648);
_mapfields.runVoidMethod ("Put",(Object)((_colname)),(Object)((_colvalue)));
 if (true) break;

case 34:
//C
this.state = 37;
;
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 2755;BA.debugLine="MapFields.Put(ColName, ColValue)";
Debug.ShouldStop(4);
_mapfields.runVoidMethod ("Put",(Object)((_colname)),(Object)((_colvalue)));
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = 71;
;
 if (true) break;
if (true) break;

case 39:
//C
this.state = 10;
Debug.locals.put("colnum", _colnum);
;
 BA.debugLineNum = 2761;BA.debugLine="DataFields.Add(MapFields)";
Debug.ShouldStop(256);
_datafields.runVoidMethod ("Add",(Object)((_mapfields.getObject())));
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 2765;BA.debugLine="MapItems.Put(\"fields\",DataFields)";
Debug.ShouldStop(4096);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fields"))),(Object)((_datafields.getObject())));
 BA.debugLineNum = 2767;BA.debugLine="If Operationtype = \"update\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 41:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_operationtype,BA.ObjectToString("update"))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 2769;BA.debugLine="MapConditions.Put(\"request_tagcode\",request_tag";
Debug.ShouldStop(65536);
_mapconditions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_request_tagcode.runMethod(true,"trim"))));
 BA.debugLineNum = 2770;BA.debugLine="MapConditions.Put(\"task_tagcode\",task_tagcode.t";
Debug.ShouldStop(131072);
_mapconditions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("task_tagcode"))),(Object)((_task_tagcode.runMethod(true,"trim"))));
 BA.debugLineNum = 2771;BA.debugLine="MapConditions.Put(\"item_tagcode\",item_tagcode.T";
Debug.ShouldStop(262144);
_mapconditions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item_tagcode"))),(Object)((_item_tagcode.runMethod(true,"trim"))));
 BA.debugLineNum = 2772;BA.debugLine="MapConditions.Put(\"repeatcounter\",rc)";
Debug.ShouldStop(524288);
_mapconditions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_rc)));
 BA.debugLineNum = 2773;BA.debugLine="MapConditions.Put(\"repeatitemcounter\",ric)";
Debug.ShouldStop(1048576);
_mapconditions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatitemcounter"))),(Object)((_ric)));
 BA.debugLineNum = 2774;BA.debugLine="MapConditions.Put(\"repeatfieldcounter\",rfc)";
Debug.ShouldStop(2097152);
_mapconditions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatfieldcounter"))),(Object)((_rfc)));
 BA.debugLineNum = 2776;BA.debugLine="Dim ListConditions As List";
Debug.ShouldStop(8388608);
_listconditions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListConditions", _listconditions);
 BA.debugLineNum = 2777;BA.debugLine="ListConditions.Initialize";
Debug.ShouldStop(16777216);
_listconditions.runVoidMethod ("Initialize");
 BA.debugLineNum = 2778;BA.debugLine="ListConditions.Add(MapConditions)";
Debug.ShouldStop(33554432);
_listconditions.runVoidMethod ("Add",(Object)((_mapconditions.getObject())));
 BA.debugLineNum = 2780;BA.debugLine="MapItems.Put(\"where\", ListConditions)";
Debug.ShouldStop(134217728);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("where"))),(Object)((_listconditions.getObject())));
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 2784;BA.debugLine="ListItems.Add(MapItems)";
Debug.ShouldStop(-2147483648);
_listitems.runVoidMethod ("Add",(Object)((_mapitems.getObject())));
 BA.debugLineNum = 2786;BA.debugLine="Dim ACLAJson As Map";
Debug.ShouldStop(2);
_aclajson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ACLAJson", _aclajson);
 BA.debugLineNum = 2787;BA.debugLine="ACLAJson.Initialize";
Debug.ShouldStop(4);
_aclajson.runVoidMethod ("Initialize");
 BA.debugLineNum = 2788;BA.debugLine="ACLAJson.put(\"items\",ListItems)";
Debug.ShouldStop(8);
_aclajson.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("items"))),(Object)((_listitems.getObject())));
 BA.debugLineNum = 2790;BA.debugLine="Dim NewParams As Map";
Debug.ShouldStop(32);
_newparams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("NewParams", _newparams);
 BA.debugLineNum = 2791;BA.debugLine="NewParams.Initialize";
Debug.ShouldStop(64);
_newparams.runVoidMethod ("Initialize");
 BA.debugLineNum = 2792;BA.debugLine="NewParams.Clear";
Debug.ShouldStop(128);
_newparams.runVoidMethod ("Clear");
 BA.debugLineNum = 2793;BA.debugLine="NewParams.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(256);
_newparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2794;BA.debugLine="NewParams.Put(\"ACLAJson\", ACLAJson)";
Debug.ShouldStop(512);
_newparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAJson"))),(Object)((_aclajson.getObject())));
 BA.debugLineNum = 2795;BA.debugLine="NewParams.Put(\"debug\", 1)";
Debug.ShouldStop(1024);
_newparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("debug"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2796;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(2048);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/insert-update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2798;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLO";
Debug.ShouldStop(8192);
if (true) break;

case 45:
//if
this.state = 68;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 47;
}else {
this.state = 67;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 2799;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(16384);
if (true) break;

case 48:
//if
this.state = 65;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 50;
}else {
this.state = 64;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 2801;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 51:
//try
this.state = 62;
this.catchState = 61;
this.state = 53;
if (true) break;

case 53:
//C
this.state = 54;
this.catchState = 61;
 BA.debugLineNum = 2802;BA.debugLine="Dim data As String";
Debug.ShouldStop(131072);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 2803;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(262144);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 2804;BA.debugLine="JSON.Initialize(NewParams)";
Debug.ShouldStop(524288);
_json.runVoidMethod ("Initialize",(Object)(_newparams));
 BA.debugLineNum = 2806;BA.debugLine="data = JSON.ToPrettyString(1)";
Debug.ShouldStop(2097152);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);
 BA.debugLineNum = 2807;BA.debugLine="Dim JobD2S As HttpJob";
Debug.ShouldStop(4194304);
_jobd2s = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("JobD2S", _jobd2s);
 BA.debugLineNum = 2808;BA.debugLine="JobD2S.Initialize(\"\",Me)";
Debug.ShouldStop(8388608);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,taskscl2.processBA,(Object)(BA.ObjectToString("")),(Object)(taskscl2.getObject()));
 BA.debugLineNum = 2809;BA.debugLine="Dim addr As String = Url";
Debug.ShouldStop(16777216);
_addr = _url;Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 2810;BA.debugLine="Log(data)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185598067",_data,0);
 BA.debugLineNum = 2811;BA.debugLine="JobD2S.PostString(addr, data )";
Debug.ShouldStop(67108864);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_data));
 BA.debugLineNum = 2812;BA.debugLine="JobD2S.GetRequest.SetContentType(\"application";
Debug.ShouldStop(134217728);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2814;BA.debugLine="Wait For (JobD2S) JobDone(JobD2S As HttpJob)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "updateserverupdorins"), (_jobd2s));
this.state = 72;
return;
case 72:
//C
this.state = 54;
_jobd2s = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("JobD2S", _jobd2s);
;
 BA.debugLineNum = 2816;BA.debugLine="If JobD2S.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 54:
//if
this.state = 59;
if (_jobd2s.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 56;
}else {
this.state = 58;
}if (true) break;

case 56:
//C
this.state = 59;
 BA.debugLineNum = 2817;BA.debugLine="Log(\"API Reply:\" & JobD2S.GetString)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185598074",RemoteObject.concat(RemoteObject.createImmutable("API Reply:"),_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 2819;BA.debugLine="Log(\"API ERROR Reply:\" & JobD2S.GetString)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185598076",RemoteObject.concat(RemoteObject.createImmutable("API ERROR Reply:"),_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 59:
//C
this.state = 62;
;
 BA.debugLineNum = 2821;BA.debugLine="JobD2S.Release";
Debug.ShouldStop(16);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 61:
//C
this.state = 62;
this.catchState = 0;
 BA.debugLineNum = 2823;BA.debugLine="Dim theData As String = $\"${LastException}, $";
Debug.ShouldStop(64);
_thedata = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_data))),RemoteObject.createImmutable("")));Debug.locals.put("theData", _thedata);Debug.locals.put("theData", _thedata);
 BA.debugLineNum = 2824;BA.debugLine="Log(theData)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185598081",_thedata,0);
 BA.debugLineNum = 2825;BA.debugLine="Utils.logError(\"JobD2S\", ShareCode.SESS_OPER_";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString("JobD2S")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(_thedata));
 if (true) break;
if (true) break;

case 62:
//C
this.state = 65;
this.catchState = 0;
;
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 2829;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(4096);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_request_tagcode.runMethod(true,"trim")),(Object)(_task_tagcode.runMethod(true,"trim")),(Object)(_item_tagcode.runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2830;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(NewPara";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newparams))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 65:
//C
this.state = 68;
;
 BA.debugLineNum = 2832;BA.debugLine="Sleep(250)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "updateserverupdorins"),BA.numberCast(int.class, 250));
this.state = 73;
return;
case 73:
//C
this.state = 68;
;
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 2835;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(262144);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_request_tagcode.runMethod(true,"trim")),(Object)(_task_tagcode.runMethod(true,"trim")),(Object)(_item_tagcode.runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2836;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(NewParam";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_newparams))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 68:
//C
this.state = 69;
;
 if (true) break;

case 69:
//C
this.state = -1;
;
 BA.debugLineNum = 2840;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2841;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",taskscl2.processBA, e0.toString());}
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
public static void  _uploadnewrequest2server(RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2067);
if (RapidSub.canDelegate("uploadnewrequest2server")) { xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","uploadnewrequest2server", _tagcode, _items, _origin); return;}
ResumableSub_UploadNewRequest2Server rsub = new ResumableSub_UploadNewRequest2Server(null,_tagcode,_items,_origin);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UploadNewRequest2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _tagcode;
RemoteObject _items;
RemoteObject _origin;
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2067);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("items", _items);
Debug.locals.put("origin", _origin);
 BA.debugLineNum = 2068;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(524288);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2069;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(1048576);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2070;BA.debugLine="ListOfMaps.Add(items)";
Debug.ShouldStop(2097152);
_listofmaps.runVoidMethod ("Add",(Object)((_items.getObject())));
 BA.debugLineNum = 2072;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8388608);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2073;BA.debugLine="params.Initialize";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2074;BA.debugLine="params.Clear";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2075;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 2076;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2077;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2078;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 2079;BA.debugLine="params.Put(\"origin\", origin)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)((_origin)));
 BA.debugLineNum = 2080;BA.debugLine="params.Put(\"data\", ListOfMaps)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2081;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2082;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2083;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2084;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2085;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2086;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2088;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(128);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 2089;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(256);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 2090;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(512);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2092;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(2048);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/upload/request/new")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 2093;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2094;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8192);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 2095;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(16384);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,taskscl2.processBA,(Object)(BA.ObjectToString("")),(Object)(taskscl2.getObject()));
 BA.debugLineNum = 2096;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(32768);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 2097;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(65536);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2098;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "uploadnewrequest2server"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 2099;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 2100;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185008161",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2102;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(2097152);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2103;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
Debug.ShouldStop(4194304);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 2105;BA.debugLine="Job.Release";
Debug.ShouldStop(16777216);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2107;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(67108864);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2108;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2111;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _uploadnewrequest2server2(RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server2 (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2113);
if (RapidSub.canDelegate("uploadnewrequest2server2")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","uploadnewrequest2server2", _tagcode, _items, _origin, _stage);}
ResumableSub_UploadNewRequest2Server2 rsub = new ResumableSub_UploadNewRequest2Server2(null,_tagcode,_items,_origin,_stage);
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
public static class ResumableSub_UploadNewRequest2Server2 extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server2(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin,RemoteObject _stage) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
this._stage = _stage;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _tagcode;
RemoteObject _items;
RemoteObject _origin;
RemoteObject _stage;
RemoteObject _retvalue = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._createrequestreturn");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server2 (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2113);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("items", _items);
Debug.locals.put("origin", _origin);
Debug.locals.put("stage", _stage);
 BA.debugLineNum = 2114;BA.debugLine="Dim RetValue As CreateRequestReturn = Types.MakeC";
Debug.ShouldStop(2);
_retvalue = parent.mostCurrent._types.runMethod(false,"_makecreaterequestreturnclear" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA);Debug.locals.put("RetValue", _retvalue);Debug.locals.put("RetValue", _retvalue);
 BA.debugLineNum = 2115;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(4);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2116;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(8);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2117;BA.debugLine="ListOfMaps.Add(items)";
Debug.ShouldStop(16);
_listofmaps.runVoidMethod ("Add",(Object)((_items.getObject())));
 BA.debugLineNum = 2119;BA.debugLine="Dim params As Map";
Debug.ShouldStop(64);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2120;BA.debugLine="params.Initialize";
Debug.ShouldStop(128);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2121;BA.debugLine="params.Clear";
Debug.ShouldStop(256);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2122;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 2123;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2124;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2125;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 2126;BA.debugLine="params.Put(\"origin\", origin)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)((_origin)));
 BA.debugLineNum = 2127;BA.debugLine="params.Put(\"data\", ListOfMaps)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2128;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2129;BA.debugLine="params.Put(\"stageCheck\", stage)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stageCheck"))),(Object)((_stage)));
 BA.debugLineNum = 2130;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2131;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2132;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2133;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2134;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2136;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(8388608);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 2137;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(16777216);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 2138;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(33554432);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2139;BA.debugLine="Log(data)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185073690",_data,0);
 BA.debugLineNum = 2140;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(134217728);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/upload/request/new")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 2141;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2142;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(536870912);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 2143;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(1073741824);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,taskscl2.processBA,(Object)(BA.ObjectToString("")),(Object)(taskscl2.getObject()));
 BA.debugLineNum = 2144;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 2145;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(1);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2146;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "uploadnewrequest2server2"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 2147;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 9;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 2148;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185073699",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2150;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(32);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 2151;BA.debugLine="JSON1.Initialize(Job.GetString)";
Debug.ShouldStop(64);
_json1.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 2152;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(128);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 2153;BA.debugLine="RetValue.RequestTagcode = Utils.IfNullOrEmpty(M";
Debug.ShouldStop(256);
_retvalue.setField ("RequestTagcode" /*RemoteObject*/ ,parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("newrequest")))))),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2154;BA.debugLine="RetValue.Status = Utils.IfNullOrEmptyInt(MapJSO";
Debug.ShouldStop(512);
_retvalue.setField ("Status" /*RemoteObject*/ ,parent.mostCurrent._utils.runMethod(true,"_ifnulloremptyint" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))))),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 2155;BA.debugLine="RetValue.Stage = Utils.IfNullOrEmptyInt(MapJSON";
Debug.ShouldStop(1024);
_retvalue.setField ("Stage" /*RemoteObject*/ ,parent.mostCurrent._utils.runMethod(true,"_ifnulloremptyint" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stage")))))),(Object)(BA.numberCast(int.class, 0))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2157;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(4096);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2158;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 2160;BA.debugLine="Job.Release";
Debug.ShouldStop(32768);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2162;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(131072);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2163;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
Debug.ShouldStop(262144);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2166;BA.debugLine="Return RetValue";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_retvalue));return;};
 BA.debugLineNum = 2167;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _uploadnewrequestrel2server(RemoteObject _tagcode,RemoteObject _relation,RemoteObject _counter,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequestRel2Server (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2584);
if (RapidSub.canDelegate("uploadnewrequestrel2server")) { return xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","uploadnewrequestrel2server", _tagcode, _relation, _counter, _items);}
ResumableSub_UploadNewRequestRel2Server rsub = new ResumableSub_UploadNewRequestRel2Server(null,_tagcode,_relation,_counter,_items);
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
public static class ResumableSub_UploadNewRequestRel2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequestRel2Server(xevolution.vrcg.devdemov2400.taskscl2 parent,RemoteObject _tagcode,RemoteObject _relation,RemoteObject _counter,RemoteObject _items) {
this.parent = parent;
this._tagcode = _tagcode;
this._relation = _relation;
this._counter = _counter;
this._items = _items;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;
RemoteObject _tagcode;
RemoteObject _relation;
RemoteObject _counter;
RemoteObject _items;
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequestRel2Server (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,2584);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("relation", _relation);
Debug.locals.put("counter", _counter);
Debug.locals.put("items", _items);
 BA.debugLineNum = 2585;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(16777216);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2586;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(33554432);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2587;BA.debugLine="ListOfMaps.Add(items)";
Debug.ShouldStop(67108864);
_listofmaps.runVoidMethod ("Add",(Object)((_items.getObject())));
 BA.debugLineNum = 2588;BA.debugLine="Dim params As Map";
Debug.ShouldStop(134217728);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2589;BA.debugLine="params.Initialize";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2590;BA.debugLine="params.Clear";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2591;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 2592;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2593;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2594;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 2595;BA.debugLine="params.Put(\"_relation\", relation)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_relation"))),(Object)((_relation)));
 BA.debugLineNum = 2596;BA.debugLine="params.Put(\"_repeatcounter\", counter)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_repeatcounter"))),(Object)((_counter)));
 BA.debugLineNum = 2597;BA.debugLine="params.Put(\"data\", ListOfMaps)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2598;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2599;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2600;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2601;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2602;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2603;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2605;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(4096);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 2606;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(8192);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 2607;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(16384);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2609;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(65536);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/upload/request/rel-new")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 2611;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 18;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2612;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(524288);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 2613;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(1048576);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,taskscl2.processBA,(Object)(BA.ObjectToString("")),(Object)(taskscl2.getObject()));
 BA.debugLineNum = 2614;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 2615;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(4194304);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2616;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", taskscl2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "uploadnewrequestrel2server"), (_job));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 2617;BA.debugLine="Try";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 BA.debugLineNum = 2618;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 12;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2619;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185466915",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2621;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(268435456);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2622;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Work";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = 15;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 2625;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6185466921",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",taskscl2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2626;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(2);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2627;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 0;
;
 BA.debugLineNum = 2630;BA.debugLine="Job.Release";
Debug.ShouldStop(32);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2632;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(128);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2633;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 2635;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2636;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",taskscl2.processBA, e0.toString());}
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
public static void  _windowstatusupdate() throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,157);
if (RapidSub.canDelegate("windowstatusupdate")) { xevolution.vrcg.devdemov2400.taskscl2.remoteMe.runUserSub(false, "taskscl2","windowstatusupdate"); return;}
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
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.taskscl2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.taskscl2 parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (taskscl2) ","taskscl2",59,taskscl2.mostCurrent.activityBA,taskscl2.mostCurrent,157);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 158;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,taskscl2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 159;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("StopService",taskscl2.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 160;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("StopService",taskscl2.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 162;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("StopService",taskscl2.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 163;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",taskscl2.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 164;BA.debugLine="Sleep(500)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",taskscl2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "taskscl2", "windowstatusupdate"),BA.numberCast(int.class, 500));
this.state = 22;
return;
case 22:
//C
this.state = 4;
;
 BA.debugLineNum = 165;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 167;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(64);
parent.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 168;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
Debug.ShouldStop(128);
parent.mostCurrent._labelcopyright.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/ ));
 BA.debugLineNum = 169;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
Debug.ShouldStop(256);
parent.mostCurrent._mainactiveuser.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ));
 BA.debugLineNum = 170;BA.debugLine="mainLabelOptLists.Text = ShareCode.MainOption_Tas";
Debug.ShouldStop(512);
parent.mostCurrent._mainlabeloptlists.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_tasks /*RemoteObject*/ .runMethod(true,"toUpperCase")));
 BA.debugLineNum = 173;BA.debugLine="ButtonAppNetwork.Enabled = False";
Debug.ShouldStop(4096);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 174;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
Debug.ShouldStop(8192);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 175;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 176;BA.debugLine="ButtonAppNetwork.Enabled = True";
Debug.ShouldStop(32768);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 177;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
Debug.ShouldStop(65536);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 179;BA.debugLine="ButtonUserUnavailable.Enabled = False";
Debug.ShouldStop(262144);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 180;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
Debug.ShouldStop(524288);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 181;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 182;BA.debugLine="ButtonUserUnavailable.Enabled = True";
Debug.ShouldStop(2097152);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 183;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
Debug.ShouldStop(4194304);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 186;BA.debugLine="ButtonActionPause.Enabled = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
Debug.ShouldStop(67108864);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 190;BA.debugLine="ButtonActionPause.Enabled = True";
Debug.ShouldStop(536870912);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 191;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorRedOra";
Debug.ShouldStop(1073741824);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 193;BA.debugLine="If (CurrentTab = 0) Then";
Debug.ShouldStop(1);

case 16:
//if
this.state = 21;
if ((RemoteObject.solveBoolean("=",parent._currenttab,BA.numberCast(double.class, 0)))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 194;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemCL} / $";
Debug.ShouldStop(2);
parent.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._currentlineitemcl))),RemoteObject.createImmutable(" / "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._totallineitemscl))),RemoteObject.createImmutable("")))));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 196;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemAC} / $";
Debug.ShouldStop(8);
parent.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._currentlineitemac))),RemoteObject.createImmutable(" / "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._totallineitemsac))),RemoteObject.createImmutable("")))));
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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