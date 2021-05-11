package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class structalerts_subs_0 {


public static RemoteObject  _actionitemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ActionItemClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,491);
if (RapidSub.canDelegate("actionitemclick")) { return __ref.runUserSub(false, "structalerts","actionitemclick", __ref, _index, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _val = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 491;BA.debugLine="Public Sub ActionItemClick (Index As Int, Value As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 492;BA.debugLine="Dim pnl As Panel = listActions.GetPanel(Index)";
Debug.ShouldStop(2048);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_listactions" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 494;BA.debugLine="Dim info As List = Regex.Split(\"\\|\", pnl.tag )";
Debug.ShouldStop(8192);
_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_info = structalerts.__c.runMethod(false, "ArrayToList", (Object)(structalerts.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_pnl.runMethod(false,"getTag"))))));Debug.locals.put("info", _info);Debug.locals.put("info", _info);
 BA.debugLineNum = 496;BA.debugLine="Dim val As Int = info.Get(1)";
Debug.ShouldStop(32768);
_val = BA.numberCast(int.class, _info.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 498;BA.debugLine="If (val = 0) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_val,BA.numberCast(double.class, 0)))) { 
 };
 BA.debugLineNum = 525;BA.debugLine="Log(\"listRecordsView_ItemClick\")";
Debug.ShouldStop(4096);
structalerts.__c.runVoidMethod ("LogImpl","6175898658",RemoteObject.createImmutable("listRecordsView_ItemClick"),0);
 BA.debugLineNum = 527;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _alertitemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AlertItemClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,763);
if (RapidSub.canDelegate("alertitemclick")) { return __ref.runUserSub(false, "structalerts","alertitemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 763;BA.debugLine="Public Sub AlertItemClick (Index As Int, Value As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 767;BA.debugLine="Log(\"listRecordsView_ItemClick\")";
Debug.ShouldStop(1073741824);
structalerts.__c.runVoidMethod ("LogImpl","6176488452",RemoteObject.createImmutable("listRecordsView_ItemClick"),0);
 BA.debugLineNum = 768;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _alertobjectselected(RemoteObject __ref,RemoteObject _currentselectedcode,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("AlertObjectSelected (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,923);
if (RapidSub.canDelegate("alertobjectselected")) { return __ref.runUserSub(false, "structalerts","alertobjectselected", __ref, _currentselectedcode, _pnl);}
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _ldata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tagcode = RemoteObject.createImmutable("");
Debug.locals.put("CurrentSelectedCode", _currentselectedcode);
Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 923;BA.debugLine="Sub AlertObjectSelected(CurrentSelectedCode As Str";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 924;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(134217728);
_continua = structalerts.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 925;BA.debugLine="Dim ldata As List = Regex.Split(\"\\|\", Pnl.tag )";
Debug.ShouldStop(268435456);
_ldata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ldata = structalerts.__c.runMethod(false, "ArrayToList", (Object)(structalerts.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_pnl.runMethod(false,"getTag"))))));Debug.locals.put("ldata", _ldata);Debug.locals.put("ldata", _ldata);
 BA.debugLineNum = 926;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 927;BA.debugLine="Dim TagCode As String = ldata.Get(0)";
Debug.ShouldStop(1073741824);
_tagcode = BA.ObjectToString(_ldata.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("TagCode", _tagcode);Debug.locals.put("TagCode", _tagcode);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 929;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
structalerts.__c.runVoidMethod ("LogImpl","6176881670",BA.ObjectToString(structalerts.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 930;BA.debugLine="Continua = False";
Debug.ShouldStop(2);
_continua = structalerts.__c.getField(true,"False");Debug.locals.put("Continua", _continua);
 };
 BA.debugLineNum = 933;BA.debugLine="If (Continua) Then";
Debug.ShouldStop(16);
if ((_continua).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 934;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF087)  'No";
Debug.ShouldStop(32);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(structalerts.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf087)))));
 BA.debugLineNum = 935;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Colo";
Debug.ShouldStop(64);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts._consts._colorgreen /*RemoteObject*/ );
 BA.debugLineNum = 936;BA.debugLine="updateTaskItemView(Pnl, TagCode, 1, 0, CurrentSe";
Debug.ShouldStop(128);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_updatetaskitemview" /*void*/ ,(Object)(_pnl),(Object)(_tagcode),(Object)(BA.NumberToString(1)),(Object)(BA.numberCast(int.class, 0)),(Object)(_currentselectedcode));
 };
 BA.debugLineNum = 939;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnalertremove_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("BtnAlertRemove_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,1087);
if (RapidSub.canDelegate("btnalertremove_stateclick")) { __ref.runUserSub(false, "structalerts","btnalertremove_stateclick", __ref, _state); return;}
ResumableSub_BtnAlertRemove_StateClick rsub = new ResumableSub_BtnAlertRemove_StateClick(null,__ref,_state);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnAlertRemove_StateClick extends BA.ResumableSub {
public ResumableSub_BtnAlertRemove_StateClick(xevolution.vrcg.devdemov2400.structalerts parent,RemoteObject __ref,RemoteObject _state) {
this.parent = parent;
this.__ref = __ref;
this._state = _state;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.structalerts parent;
RemoteObject _state;
RemoteObject _btn = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _sts = RemoteObject.createImmutable(0);
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _ldata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnAlertRemove_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,1087);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("State", _state);
 BA.debugLineNum = 1089;BA.debugLine="Dim btn As B4XStateButton = Sender";
Debug.ShouldStop(1);
_btn = (parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 1090;BA.debugLine="Dim Pnl As Panel = btn.Parent";
Debug.ShouldStop(2);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getparent" /*RemoteObject*/ ).getObject());Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 1091;BA.debugLine="Dim sts As Int = btn.State";
Debug.ShouldStop(4);
_sts = _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getstate" /*RemoteObject*/ );Debug.locals.put("sts", _sts);Debug.locals.put("sts", _sts);
 BA.debugLineNum = 1093;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(16);
_continua = parent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 1094;BA.debugLine="Dim ldata As List = Regex.Split(\"\\|\", Pnl.tag )";
Debug.ShouldStop(32);
_ldata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ldata = parent.__c.runMethod(false, "ArrayToList", (Object)(parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_pnl.runMethod(false,"getTag"))))));Debug.locals.put("ldata", _ldata);Debug.locals.put("ldata", _ldata);
 BA.debugLineNum = 1095;BA.debugLine="Try";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 1096;BA.debugLine="Dim TagCode As String = ldata.Get(0)";
Debug.ShouldStop(128);
_tagcode = BA.ObjectToString(_ldata.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("TagCode", _tagcode);Debug.locals.put("TagCode", _tagcode);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 1098;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","6177209355",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 1099;BA.debugLine="Continua = False";
Debug.ShouldStop(1024);
_continua = parent.__c.getField(true,"False");Debug.locals.put("Continua", _continua);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1102;BA.debugLine="If (Continua) And (Utils.NNE(TagCode)) Then";
Debug.ShouldStop(8192);

case 6:
//if
this.state = 15;
this.catchState = 0;
if (RemoteObject.solveBoolean(".",(_continua)) && RemoteObject.solveBoolean(".",(parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tagcode))))) { 
this.state = 8;
}else {
this.state = 14;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1103;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.RemoveRecordCon";
Debug.ShouldStop(16384);
_i = parent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent._sharecode._removerecordconfirm /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent._sharecode._option_no /*RemoteObject*/ ),(Object)((parent.__c.getField(false,"Null"))),__ref.getField(false, "ba"));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1104;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(32768);
if (true) break;

case 9:
//if
this.state = 12;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1105;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF087)  'N";
Debug.ShouldStop(65536);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf087)))));
 BA.debugLineNum = 1106;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Col";
Debug.ShouldStop(131072);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 1107;BA.debugLine="sts = 2";
Debug.ShouldStop(262144);
_sts = BA.numberCast(int.class, 2);Debug.locals.put("sts", _sts);
 BA.debugLineNum = 1108;BA.debugLine="updateTaskItemView(Pnl, TagCode, sts, 0, \"\")";
Debug.ShouldStop(524288);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_updatetaskitemview" /*void*/ ,(Object)(_pnl),(Object)(_tagcode),(Object)(BA.NumberToString(_sts)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1110;BA.debugLine="StartAlerts(True)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_startalerts" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1111;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
Debug.ShouldStop(4194304);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("BadgeCheckUpdate")));
 BA.debugLineNum = 1112;BA.debugLine="Sleep(500)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structalerts", "btnalertremove_stateclick"),BA.numberCast(int.class, 500));
this.state = 16;
return;
case 16:
//C
this.state = 12;
;
 BA.debugLineNum = 1113;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 1114;BA.debugLine="CallSubDelayed(Alerts,\"UpdateAlertsText\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((parent._alerts.getObject())),(Object)(RemoteObject.createImmutable("UpdateAlertsText")));
 BA.debugLineNum = 1115;BA.debugLine="Sleep(500)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structalerts", "btnalertremove_stateclick"),BA.numberCast(int.class, 500));
this.state = 17;
return;
case 17:
//C
this.state = 12;
;
 BA.debugLineNum = 1116;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1119;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF088)  'No";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf088)))));
 BA.debugLineNum = 1120;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Colo";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent._consts._colorgray /*RemoteObject*/ );
 if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 1122;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _claactionadd_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAActionAdd_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,661);
if (RapidSub.canDelegate("claactionadd_stateclick")) { return __ref.runUserSub(false, "structalerts","claactionadd_stateclick", __ref, _state);}
Debug.locals.put("State", _state);
 BA.debugLineNum = 661;BA.debugLine="Sub CLAActionAdd_StateClick (State As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claactionoptions_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAActionOptions_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,657);
if (RapidSub.canDelegate("claactionoptions_stateclick")) { return __ref.runUserSub(false, "structalerts","claactionoptions_stateclick", __ref, _state);}
Debug.locals.put("State", _state);
 BA.debugLineNum = 657;BA.debugLine="Sub CLAActionOptions_StateClick (State As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clabuttonoptions_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CLAButtonOptions_Click (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("clabuttonoptions_click")) { return __ref.runUserSub(false, "structalerts","clabuttonoptions_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _claitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
 BA.debugLineNum = 312;BA.debugLine="Sub CLAButtonOptions_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Dim Btn As Button = Sender 'CLAButtonOptions.Tag";
Debug.ShouldStop(16777216);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), structalerts.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("Btn", _btn);
 BA.debugLineNum = 314;BA.debugLine="Dim CLAItem As RequestCLAItem = Btn.Tag";
Debug.ShouldStop(33554432);
_claitem = (_btn.runMethod(false,"getTag"));Debug.locals.put("CLAItem", _claitem);Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 315;BA.debugLine="Dim Filter As AppActionDialogs";
Debug.ShouldStop(67108864);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 316;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(134217728);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 317;BA.debugLine="Filter.GetMoreActionsDialog(ActivityReference, \"A";
Debug.ShouldStop(268435456);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_getmoreactionsdialog" /*void*/ ,(Object)(__ref.getField(false,"_activityreference" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(("Alerts"))),(Object)(_claitem),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_getpressedanswertagcode" /*RemoteObject*/ ,(Object)(_claitem))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claitemactioncancel_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAItemActionCancel_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("claitemactioncancel_stateclick")) { return __ref.runUserSub(false, "structalerts","claitemactioncancel_stateclick", __ref, _state);}
RemoteObject _btn = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("State", _state);
 BA.debugLineNum = 529;BA.debugLine="Sub CLAItemActionCancel_StateClick (State As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 531;BA.debugLine="Dim btn As B4XStateButton = Sender";
Debug.ShouldStop(262144);
_btn = (structalerts.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 532;BA.debugLine="Dim Pnl As Panel = btn.Parent";
Debug.ShouldStop(524288);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getparent" /*RemoteObject*/ ).getObject());Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 533;BA.debugLine="MakeCLAItemActionClick(btn, btn.Tag, 2)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_makeclaitemactionclick" /*RemoteObject*/ ,(Object)(_btn),(Object)(BA.numberCast(int.class, _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claitemactionread_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAItemActionRead_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,537);
if (RapidSub.canDelegate("claitemactionread_stateclick")) { return __ref.runUserSub(false, "structalerts","claitemactionread_stateclick", __ref, _state);}
RemoteObject _btn = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
Debug.locals.put("State", _state);
 BA.debugLineNum = 537;BA.debugLine="Sub CLAItemActionRead_StateClick (State As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 549;BA.debugLine="Dim btn As B4XStateButton = Sender";
Debug.ShouldStop(16);
_btn = (structalerts.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 550;BA.debugLine="MakeCLAItemActionClick(btn, btn.Tag, 1)";
Debug.ShouldStop(32);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_makeclaitemactionclick" /*RemoteObject*/ ,(Object)(_btn),(Object)(BA.numberCast(int.class, _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 552;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claitemalertbutton_1_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAItemAlertButton_1_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,624);
if (RapidSub.canDelegate("claitemalertbutton_1_stateclick")) { return __ref.runUserSub(false, "structalerts","claitemalertbutton_1_stateclick", __ref, _state);}
Debug.locals.put("State", _state);
 BA.debugLineNum = 624;BA.debugLine="Sub CLAItemAlertButton_1_StateClick (State As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 626;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claitemalertbutton_2_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAItemAlertButton_2_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,628);
if (RapidSub.canDelegate("claitemalertbutton_2_stateclick")) { return __ref.runUserSub(false, "structalerts","claitemalertbutton_2_stateclick", __ref, _state);}
Debug.locals.put("State", _state);
 BA.debugLineNum = 628;BA.debugLine="Sub CLAItemAlertButton_2_StateClick (State As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 655;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _claitemalertbutton_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAItemAlertButton_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,832);
if (RapidSub.canDelegate("claitemalertbutton_stateclick")) { __ref.runUserSub(false, "structalerts","claitemalertbutton_stateclick", __ref, _state); return;}
ResumableSub_CLAItemAlertButton_StateClick rsub = new ResumableSub_CLAItemAlertButton_StateClick(null,__ref,_state);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLAItemAlertButton_StateClick extends BA.ResumableSub {
public ResumableSub_CLAItemAlertButton_StateClick(xevolution.vrcg.devdemov2400.structalerts parent,RemoteObject __ref,RemoteObject _state) {
this.parent = parent;
this.__ref = __ref;
this._state = _state;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.structalerts parent;
RemoteObject _state;
RemoteObject _btn = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _sts = RemoteObject.createImmutable(0);
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _ldata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
RemoteObject _i = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLAItemAlertButton_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,832);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("State", _state);
 BA.debugLineNum = 833;BA.debugLine="Dim btn As B4XStateButton = Sender";
Debug.ShouldStop(1);
_btn = (parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 834;BA.debugLine="Dim Pnl As Panel = btn.Parent";
Debug.ShouldStop(2);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getparent" /*RemoteObject*/ ).getObject());Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 835;BA.debugLine="Dim sts As Int = btn.State";
Debug.ShouldStop(4);
_sts = _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getstate" /*RemoteObject*/ );Debug.locals.put("sts", _sts);Debug.locals.put("sts", _sts);
 BA.debugLineNum = 837;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(16);
_continua = parent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 838;BA.debugLine="Dim ldata As List = Regex.Split(\"\\|\", Pnl.tag )";
Debug.ShouldStop(32);
_ldata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ldata = parent.__c.runMethod(false, "ArrayToList", (Object)(parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_pnl.runMethod(false,"getTag"))))));Debug.locals.put("ldata", _ldata);Debug.locals.put("ldata", _ldata);
 BA.debugLineNum = 839;BA.debugLine="Try";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 840;BA.debugLine="Dim TagCode As String = ldata.Get(0)";
Debug.ShouldStop(128);
_tagcode = BA.ObjectToString(_ldata.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("TagCode", _tagcode);Debug.locals.put("TagCode", _tagcode);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 842;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","6176750602",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 843;BA.debugLine="Continua = False";
Debug.ShouldStop(1024);
_continua = parent.__c.getField(true,"False");Debug.locals.put("Continua", _continua);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 846;BA.debugLine="If (Continua) And (Utils.NNE(TagCode)) Then";
Debug.ShouldStop(8192);

case 6:
//if
this.state = 21;
this.catchState = 0;
if (RemoteObject.solveBoolean(".",(_continua)) && RemoteObject.solveBoolean(".",(parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tagcode))))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 847;BA.debugLine="If (btn.tag = 1) Then";
Debug.ShouldStop(16384);
if (true) break;

case 9:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("=",_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ),RemoteObject.createImmutable((1))))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 855;BA.debugLine="else if (btn.Tag = 2) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ),RemoteObject.createImmutable((2))))) { 
this.state = 13;
}else {
this.state = 19;
}}
if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 851;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(262144);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 852;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(524288);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 853;BA.debugLine="Filter.getObjectSelectViewDialog(ActivityRefere";
Debug.ShouldStop(1048576);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectselectviewdialog" /*void*/ ,(Object)(__ref.getField(false,"_activityreference" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(("Alerts"))),(Object)(BA.ObjectToString("Seleção de Objecto")),(Object)(_pnl));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 856;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.RemoveRecordCo";
Debug.ShouldStop(8388608);
_i = parent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent._sharecode._removerecordconfirm /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent._sharecode._option_no /*RemoteObject*/ ),(Object)((parent.__c.getField(false,"Null"))),__ref.getField(false, "ba"));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 857;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 14:
//if
this.state = 17;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 858;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF087)  '";
Debug.ShouldStop(33554432);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf087)))));
 BA.debugLineNum = 859;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Co";
Debug.ShouldStop(67108864);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 860;BA.debugLine="sts = 2";
Debug.ShouldStop(134217728);
_sts = BA.numberCast(int.class, 2);Debug.locals.put("sts", _sts);
 BA.debugLineNum = 861;BA.debugLine="updateTaskItemView(Pnl, TagCode, sts, 0, \"\")";
Debug.ShouldStop(268435456);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_updatetaskitemview" /*void*/ ,(Object)(_pnl),(Object)(_tagcode),(Object)(BA.NumberToString(_sts)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 862;BA.debugLine="StartAlerts(True)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_startalerts" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 863;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
Debug.ShouldStop(1073741824);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("BadgeCheckUpdate")));
 BA.debugLineNum = 864;BA.debugLine="Sleep(500)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structalerts", "claitemalertbutton_stateclick"),BA.numberCast(int.class, 500));
this.state = 22;
return;
case 22:
//C
this.state = 17;
;
 BA.debugLineNum = 865;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPleas";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 866;BA.debugLine="CallSubDelayed(Alerts,\"UpdateAlertsText\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((parent._alerts.getObject())),(Object)(RemoteObject.createImmutable("UpdateAlertsText")));
 BA.debugLineNum = 867;BA.debugLine="Sleep(500)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structalerts", "claitemalertbutton_stateclick"),BA.numberCast(int.class, 500));
this.state = 23;
return;
case 23:
//C
this.state = 17;
;
 BA.debugLineNum = 868;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 871;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF088)  'N";
Debug.ShouldStop(64);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf088)))));
 BA.debugLineNum = 872;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Col";
Debug.ShouldStop(128);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent._consts._colorgray /*RemoteObject*/ );
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 875;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _claitembutton_stateclick(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("CLAItemButton_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,877);
if (RapidSub.canDelegate("claitembutton_stateclick")) { __ref.runUserSub(false, "structalerts","claitembutton_stateclick", __ref, _state); return;}
ResumableSub_CLAItemButton_StateClick rsub = new ResumableSub_CLAItemButton_StateClick(null,__ref,_state);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLAItemButton_StateClick extends BA.ResumableSub {
public ResumableSub_CLAItemButton_StateClick(xevolution.vrcg.devdemov2400.structalerts parent,RemoteObject __ref,RemoteObject _state) {
this.parent = parent;
this.__ref = __ref;
this._state = _state;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.structalerts parent;
RemoteObject _state;
RemoteObject _btn = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _sts = RemoteObject.createImmutable(0);
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _ldata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
RemoteObject _i = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLAItemButton_StateClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,877);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("State", _state);
 BA.debugLineNum = 878;BA.debugLine="Dim btn As B4XStateButton = Sender";
Debug.ShouldStop(8192);
_btn = (parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 879;BA.debugLine="Dim Pnl As Panel = btn.Parent";
Debug.ShouldStop(16384);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getparent" /*RemoteObject*/ ).getObject());Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 880;BA.debugLine="Dim sts As Int = btn.State";
Debug.ShouldStop(32768);
_sts = _btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_getstate" /*RemoteObject*/ );Debug.locals.put("sts", _sts);Debug.locals.put("sts", _sts);
 BA.debugLineNum = 882;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(131072);
_continua = parent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 883;BA.debugLine="Dim ldata As List = Regex.Split(\"\\|\", Pnl.tag )";
Debug.ShouldStop(262144);
_ldata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ldata = parent.__c.runMethod(false, "ArrayToList", (Object)(parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_pnl.runMethod(false,"getTag"))))));Debug.locals.put("ldata", _ldata);Debug.locals.put("ldata", _ldata);
 BA.debugLineNum = 884;BA.debugLine="Try";
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
 BA.debugLineNum = 885;BA.debugLine="Dim TagCode As String = ldata.Get(0)";
Debug.ShouldStop(1048576);
_tagcode = BA.ObjectToString(_ldata.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("TagCode", _tagcode);Debug.locals.put("TagCode", _tagcode);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 887;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","6176816138",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 888;BA.debugLine="Continua = False";
Debug.ShouldStop(8388608);
_continua = parent.__c.getField(true,"False");Debug.locals.put("Continua", _continua);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 891;BA.debugLine="If (Continua) And (Utils.NNE(TagCode)) Then";
Debug.ShouldStop(67108864);

case 6:
//if
this.state = 21;
this.catchState = 0;
if (RemoteObject.solveBoolean(".",(_continua)) && RemoteObject.solveBoolean(".",(parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_tagcode))))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 892;BA.debugLine="If (btn.tag = 1) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 9:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("=",_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ),RemoteObject.createImmutable((1))))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 900;BA.debugLine="else if (btn.Tag = 2) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",_btn.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_gettag" /*RemoteObject*/ ),RemoteObject.createImmutable((2))))) { 
this.state = 13;
}else {
this.state = 19;
}}
if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 896;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(-2147483648);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 897;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(1);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 898;BA.debugLine="Filter.getObjectSelectViewDialog(ActivityRefere";
Debug.ShouldStop(2);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectselectviewdialog" /*void*/ ,(Object)(__ref.getField(false,"_activityreference" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(("Alerts"))),(Object)(BA.ObjectToString("Seleção de Objecto")),(Object)(_pnl));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 901;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.RemoveRecordCo";
Debug.ShouldStop(16);
_i = parent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent._sharecode._removerecordconfirm /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent._sharecode._option_no /*RemoteObject*/ ),(Object)((parent.__c.getField(false,"Null"))),__ref.getField(false, "ba"));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 902;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(32);
if (true) break;

case 14:
//if
this.state = 17;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 903;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF087)  '";
Debug.ShouldStop(64);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf087)))));
 BA.debugLineNum = 904;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Co";
Debug.ShouldStop(128);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 905;BA.debugLine="sts = 2";
Debug.ShouldStop(256);
_sts = BA.numberCast(int.class, 2);Debug.locals.put("sts", _sts);
 BA.debugLineNum = 906;BA.debugLine="updateTaskItemView(Pnl, TagCode, sts, 0, \"\")";
Debug.ShouldStop(512);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_updatetaskitemview" /*void*/ ,(Object)(_pnl),(Object)(_tagcode),(Object)(BA.NumberToString(_sts)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 907;BA.debugLine="StartAlerts(True)";
Debug.ShouldStop(1024);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_startalerts" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 908;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
Debug.ShouldStop(2048);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((parent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("BadgeCheckUpdate")));
 BA.debugLineNum = 909;BA.debugLine="Sleep(500)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structalerts", "claitembutton_stateclick"),BA.numberCast(int.class, 500));
this.state = 22;
return;
case 22:
//C
this.state = 17;
;
 BA.debugLineNum = 910;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPleas";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 911;BA.debugLine="CallSubDelayed(Alerts,\"UpdateAlertsText\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((parent._alerts.getObject())),(Object)(RemoteObject.createImmutable("UpdateAlertsText")));
 BA.debugLineNum = 912;BA.debugLine="Sleep(500)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structalerts", "claitembutton_stateclick"),BA.numberCast(int.class, 500));
this.state = 23;
return;
case 23:
//C
this.state = 17;
;
 BA.debugLineNum = 913;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 916;BA.debugLine="ListItemObjectStatusIcon.Text = Chr(0xF088)  'N";
Debug.ShouldStop(524288);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf088)))));
 BA.debugLineNum = 917;BA.debugLine="ListItemObjectStatusIcon.TextColor = Consts.Col";
Debug.ShouldStop(1048576);
__ref.getField(false,"_listitemobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent._consts._colorgray /*RemoteObject*/ );
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 921;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private listAlerts As CustomListView";
structalerts._listalerts = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_listalerts",structalerts._listalerts);
 //BA.debugLineNum = 3;BA.debugLine="Private listTasks As CustomListView";
structalerts._listtasks = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_listtasks",structalerts._listtasks);
 //BA.debugLineNum = 4;BA.debugLine="Private listActions As CustomListView";
structalerts._listactions = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_listactions",structalerts._listactions);
 //BA.debugLineNum = 5;BA.debugLine="Private ItemsCounter As Int = 0";
structalerts._itemscounter = BA.numberCast(int.class, 0);__ref.setField("_itemscounter",structalerts._itemscounter);
 //BA.debugLineNum = 6;BA.debugLine="Public TasksList As List";
structalerts._taskslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_taskslist",structalerts._taskslist);
 //BA.debugLineNum = 7;BA.debugLine="Private ActivityReference As Activity";
structalerts._activityreference = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_activityreference",structalerts._activityreference);
 //BA.debugLineNum = 8;BA.debugLine="Private GoogleMaps As GoogleMap";
structalerts._googlemaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");__ref.setField("_googlemaps",structalerts._googlemaps);
 //BA.debugLineNum = 9;BA.debugLine="Private rp As RuntimePermissions";
structalerts._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",structalerts._rp);
 //BA.debugLineNum = 10;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
structalerts._appldialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");__ref.setField("_appldialog",structalerts._appldialog);
 //BA.debugLineNum = 12;BA.debugLine="Private ListItemReference As Label";
structalerts._listitemreference = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemreference",structalerts._listitemreference);
 //BA.debugLineNum = 13;BA.debugLine="Private ListItemTaskTitle As Label";
structalerts._listitemtasktitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemtasktitle",structalerts._listitemtasktitle);
 //BA.debugLineNum = 14;BA.debugLine="Private ListItemStatusPanel As Panel";
structalerts._listitemstatuspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_listitemstatuspanel",structalerts._listitemstatuspanel);
 //BA.debugLineNum = 15;BA.debugLine="Private ListItemDetails As Label";
structalerts._listitemdetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemdetails",structalerts._listitemdetails);
 //BA.debugLineNum = 16;BA.debugLine="Private listButCheckNew As Button";
structalerts._listbutchecknew = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_listbutchecknew",structalerts._listbutchecknew);
 //BA.debugLineNum = 17;BA.debugLine="Private ListItemStatus As Label";
structalerts._listitemstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemstatus",structalerts._listitemstatus);
 //BA.debugLineNum = 18;BA.debugLine="Private ListItemPriorities As Label";
structalerts._listitempriorities = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitempriorities",structalerts._listitempriorities);
 //BA.debugLineNum = 19;BA.debugLine="Private ListItem_ID As Label";
structalerts._listitem_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitem_id",structalerts._listitem_id);
 //BA.debugLineNum = 20;BA.debugLine="Private ListItem_StatusID As Label";
structalerts._listitem_statusid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitem_statusid",structalerts._listitem_statusid);
 //BA.debugLineNum = 21;BA.debugLine="Private ListItem_TypeID As Label";
structalerts._listitem_typeid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitem_typeid",structalerts._listitem_typeid);
 //BA.debugLineNum = 22;BA.debugLine="Private ListItem_Icon As Label";
structalerts._listitem_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitem_icon",structalerts._listitem_icon);
 //BA.debugLineNum = 23;BA.debugLine="Private ListItemObjectStatusIcon As Label";
structalerts._listitemobjectstatusicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemobjectstatusicon",structalerts._listitemobjectstatusicon);
 //BA.debugLineNum = 24;BA.debugLine="Private CLAItem_G1 As Label";
structalerts._claitem_g1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_claitem_g1",structalerts._claitem_g1);
 //BA.debugLineNum = 25;BA.debugLine="Private CLAItemButton_1 As B4XStateButton";
structalerts._claitembutton_1 = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_claitembutton_1",structalerts._claitembutton_1);
 //BA.debugLineNum = 26;BA.debugLine="Private CLAItemButton_2 As B4XStateButton";
structalerts._claitembutton_2 = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_claitembutton_2",structalerts._claitembutton_2);
 //BA.debugLineNum = 27;BA.debugLine="Private CLAButtonOptions As Button";
structalerts._clabuttonoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_clabuttonoptions",structalerts._clabuttonoptions);
 //BA.debugLineNum = 28;BA.debugLine="Private CLAItem_G2 As Label";
structalerts._claitem_g2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_claitem_g2",structalerts._claitem_g2);
 //BA.debugLineNum = 29;BA.debugLine="Private ALERT_VIEW As Int = 0";
structalerts._alert_view = BA.numberCast(int.class, 0);__ref.setField("_alert_view",structalerts._alert_view);
 //BA.debugLineNum = 30;BA.debugLine="Private TASK_VIEW As Int = 1";
structalerts._task_view = BA.numberCast(int.class, 1);__ref.setField("_task_view",structalerts._task_view);
 //BA.debugLineNum = 31;BA.debugLine="Private ACTION_VIEW As Int = 2";
structalerts._action_view = BA.numberCast(int.class, 2);__ref.setField("_action_view",structalerts._action_view);
 //BA.debugLineNum = 32;BA.debugLine="Private ListItemActionRequest As Label";
structalerts._listitemactionrequest = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemactionrequest",structalerts._listitemactionrequest);
 //BA.debugLineNum = 33;BA.debugLine="Private ListItemActionNew As Button";
structalerts._listitemactionnew = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_listitemactionnew",structalerts._listitemactionnew);
 //BA.debugLineNum = 34;BA.debugLine="Private ListItemActionStatus As Label";
structalerts._listitemactionstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemactionstatus",structalerts._listitemactionstatus);
 //BA.debugLineNum = 35;BA.debugLine="Private ListItemActionDetails As Label";
structalerts._listitemactiondetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemactiondetails",structalerts._listitemactiondetails);
 //BA.debugLineNum = 36;BA.debugLine="Private ListItemActionClose As Label";
structalerts._listitemactionclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemactionclose",structalerts._listitemactionclose);
 //BA.debugLineNum = 37;BA.debugLine="Private ActionObjectStatusIcon As Label";
structalerts._actionobjectstatusicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_actionobjectstatusicon",structalerts._actionobjectstatusicon);
 //BA.debugLineNum = 38;BA.debugLine="Private CLAActionAdd As B4XStateButton";
structalerts._claactionadd = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_claactionadd",structalerts._claactionadd);
 //BA.debugLineNum = 39;BA.debugLine="Private CLAActionOptions As B4XStateButton";
structalerts._claactionoptions = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_claactionoptions",structalerts._claactionoptions);
 //BA.debugLineNum = 40;BA.debugLine="Private CLAItem_G3 As Label";
structalerts._claitem_g3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_claitem_g3",structalerts._claitem_g3);
 //BA.debugLineNum = 41;BA.debugLine="Private CLAItemAlertButton_1 As B4XStateButton";
structalerts._claitemalertbutton_1 = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_claitemalertbutton_1",structalerts._claitemalertbutton_1);
 //BA.debugLineNum = 42;BA.debugLine="Private CLAItemAlertButton_2 As B4XStateButton";
structalerts._claitemalertbutton_2 = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_claitemalertbutton_2",structalerts._claitemalertbutton_2);
 //BA.debugLineNum = 43;BA.debugLine="Private CLAButtonAlertOptions As Button";
structalerts._clabuttonalertoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_clabuttonalertoptions",structalerts._clabuttonalertoptions);
 //BA.debugLineNum = 44;BA.debugLine="Private CLAItemAlertText As Label";
structalerts._claitemalerttext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_claitemalerttext",structalerts._claitemalerttext);
 //BA.debugLineNum = 45;BA.debugLine="Private lbl_Eml_Result As Label";
structalerts._lbl_eml_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_eml_result",structalerts._lbl_eml_result);
 //BA.debugLineNum = 46;BA.debugLine="Private Marker_Button As Button";
structalerts._marker_button = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_marker_button",structalerts._marker_button);
 //BA.debugLineNum = 47;BA.debugLine="Private BtnAlertRemove As B4XStateButton";
structalerts._btnalertremove = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.b4xstatebutton");__ref.setField("_btnalertremove",structalerts._btnalertremove);
 //BA.debugLineNum = 48;BA.debugLine="Private lbl_Alert_type As Label";
structalerts._lbl_alert_type = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_alert_type",structalerts._lbl_alert_type);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createactionitem(RemoteObject __ref,RemoteObject _posis,RemoteObject _colitems,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateActionItem (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("createactionitem")) { return __ref.runUserSub(false, "structalerts","createactionitem", __ref, _posis, _colitems, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _status_desc = RemoteObject.createImmutable("");
RemoteObject _priority_desc = RemoteObject.createImmutable("");
RemoteObject _urgency_desc = RemoteObject.createImmutable("");
RemoteObject _due_date = RemoteObject.createImmutable("");
RemoteObject _request_tagcode = RemoteObject.createImmutable("");
RemoteObject _checklistdesc = RemoteObject.createImmutable("");
RemoteObject _inner_title = RemoteObject.createImmutable("");
RemoteObject _operation_type = RemoteObject.createImmutable("");
RemoteObject _kind_data = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _s0 = RemoteObject.createImmutable("");
RemoteObject _s1 = RemoteObject.createImmutable("");
RemoteObject _s2 = RemoteObject.createImmutable("");
RemoteObject _s3 = RemoteObject.createImmutable("");
RemoteObject _claitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
Debug.locals.put("posis", _posis);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 425;BA.debugLine="Sub CreateActionItem(posis As Int, colitems As Cur";
Debug.ShouldStop(256);
 BA.debugLineNum = 426;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 427;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1024);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 428;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(2048);
__ref.getField(false,"_activityreference" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 429;BA.debugLine="p.LoadLayout(\"alerts_actionitem_new\") 'alerts_tas";
Debug.ShouldStop(4096);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("alerts_actionitem_new")),__ref.getField(false, "ba"));
 BA.debugLineNum = 430;BA.debugLine="p.RemoveView";
Debug.ShouldStop(8192);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 435;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(262144);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 436;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
Debug.ShouldStop(524288);
_title = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 437;BA.debugLine="Dim status_desc As String = colitems.GetString(\"s";
Debug.ShouldStop(1048576);
_status_desc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_desc")));Debug.locals.put("status_desc", _status_desc);Debug.locals.put("status_desc", _status_desc);
 BA.debugLineNum = 438;BA.debugLine="Dim priority_desc As String = colitems.GetString(";
Debug.ShouldStop(2097152);
_priority_desc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("priority_desc")));Debug.locals.put("priority_desc", _priority_desc);Debug.locals.put("priority_desc", _priority_desc);
 BA.debugLineNum = 439;BA.debugLine="Dim urgency_desc As String = colitems.GetString(\"";
Debug.ShouldStop(4194304);
_urgency_desc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("urgency_desc")));Debug.locals.put("urgency_desc", _urgency_desc);Debug.locals.put("urgency_desc", _urgency_desc);
 BA.debugLineNum = 440;BA.debugLine="Dim due_date As String = colitems.GetString(\"due_";
Debug.ShouldStop(8388608);
_due_date = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("due_date")));Debug.locals.put("due_date", _due_date);Debug.locals.put("due_date", _due_date);
 BA.debugLineNum = 441;BA.debugLine="Dim request_tagcode As String = colitems.GetStrin";
Debug.ShouldStop(16777216);
_request_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_tagcode")));Debug.locals.put("request_tagcode", _request_tagcode);Debug.locals.put("request_tagcode", _request_tagcode);
 BA.debugLineNum = 442;BA.debugLine="Dim ChecklistDesc As String = colitems.GetString(";
Debug.ShouldStop(33554432);
_checklistdesc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("checklist")));Debug.locals.put("ChecklistDesc", _checklistdesc);Debug.locals.put("ChecklistDesc", _checklistdesc);
 BA.debugLineNum = 443;BA.debugLine="Dim inner_title As String = colitems.GetString(\"i";
Debug.ShouldStop(67108864);
_inner_title = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("inner_title")));Debug.locals.put("inner_title", _inner_title);Debug.locals.put("inner_title", _inner_title);
 BA.debugLineNum = 444;BA.debugLine="Dim operation_type As String = Utils.IfNullOrEmpt";
Debug.ShouldStop(134217728);
_operation_type = structalerts._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("operation_type")))),(Object)(RemoteObject.createImmutable("TOPERT_01")));Debug.locals.put("operation_type", _operation_type);Debug.locals.put("operation_type", _operation_type);
 BA.debugLineNum = 446;BA.debugLine="Dim kind_data As Int = 0";
Debug.ShouldStop(536870912);
_kind_data = BA.numberCast(int.class, 0);Debug.locals.put("kind_data", _kind_data);Debug.locals.put("kind_data", _kind_data);
 BA.debugLineNum = 447;BA.debugLine="Dim id As Int = colitems.GetInt(\"id\")";
Debug.ShouldStop(1073741824);
_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 449;BA.debugLine="Dim s0 As String = Utils.IfNullOrEmpty(inner_titl";
Debug.ShouldStop(1);
_s0 = structalerts._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_inner_title),(Object)(structalerts._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_checklistdesc),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("s0", _s0);Debug.locals.put("s0", _s0);
 BA.debugLineNum = 450;BA.debugLine="If Utils.NNE(s0) Then s0 = $\" / ${s0}\"$";
Debug.ShouldStop(2);
if (structalerts._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_s0)).<Boolean>get().booleanValue()) { 
_s0 = (RemoteObject.concat(RemoteObject.createImmutable(" / "),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s0))),RemoteObject.createImmutable("")));Debug.locals.put("s0", _s0);};
 BA.debugLineNum = 451;BA.debugLine="Dim s1 As String = Utils.IfNullOrEmpty(title, \"\")";
Debug.ShouldStop(4);
_s1 = structalerts._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_title),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 452;BA.debugLine="If Utils.NNE(s1) Then s1 = $\" / ${s1}\"$";
Debug.ShouldStop(8);
if (structalerts._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_s1)).<Boolean>get().booleanValue()) { 
_s1 = (RemoteObject.concat(RemoteObject.createImmutable(" / "),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable("")));Debug.locals.put("s1", _s1);};
 BA.debugLineNum = 453;BA.debugLine="Dim s2 As String = $\"${request_tagcode}${s0}${s1}";
Debug.ShouldStop(16);
_s2 = (RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_tagcode))),RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s0))),RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable("")));Debug.locals.put("s2", _s2);Debug.locals.put("s2", _s2);
 BA.debugLineNum = 454;BA.debugLine="CLAItem_G1.Text = s2 'title";
Debug.ShouldStop(32);
__ref.getField(false,"_claitem_g1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_s2));
 BA.debugLineNum = 456;BA.debugLine="Dim s0 As String = Utils.IfNullOrEmpty(priority_d";
Debug.ShouldStop(128);
_s0 = structalerts._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_priority_desc),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s0", _s0);Debug.locals.put("s0", _s0);
 BA.debugLineNum = 457;BA.debugLine="If Utils.NNE(s0) Then s0 = $\" / ${s0}\"$";
Debug.ShouldStop(256);
if (structalerts._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_s0)).<Boolean>get().booleanValue()) { 
_s0 = (RemoteObject.concat(RemoteObject.createImmutable(" / "),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s0))),RemoteObject.createImmutable("")));Debug.locals.put("s0", _s0);};
 BA.debugLineNum = 458;BA.debugLine="Dim s1 As String = Utils.IfNullOrEmpty(urgency_de";
Debug.ShouldStop(512);
_s1 = structalerts._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_urgency_desc),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s1", _s1);Debug.locals.put("s1", _s1);
 BA.debugLineNum = 459;BA.debugLine="If Utils.NNE(s1) Then s1 = $\" / ${s1}\"$";
Debug.ShouldStop(1024);
if (structalerts._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_s1)).<Boolean>get().booleanValue()) { 
_s1 = (RemoteObject.concat(RemoteObject.createImmutable(" / "),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable("")));Debug.locals.put("s1", _s1);};
 BA.debugLineNum = 460;BA.debugLine="Dim s2 As String = Utils.IfNullOrEmpty(due_date,";
Debug.ShouldStop(2048);
_s2 = structalerts._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_due_date),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s2", _s2);Debug.locals.put("s2", _s2);
 BA.debugLineNum = 461;BA.debugLine="If Utils.NNE(s2) Then s2 = $\" / ${s2}\"$";
Debug.ShouldStop(4096);
if (structalerts._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_s2)).<Boolean>get().booleanValue()) { 
_s2 = (RemoteObject.concat(RemoteObject.createImmutable(" / "),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s2))),RemoteObject.createImmutable("")));Debug.locals.put("s2", _s2);};
 BA.debugLineNum = 462;BA.debugLine="Dim s3 As String = $\"${Utils.IfNullOrEmpty(status";
Debug.ShouldStop(8192);
_s3 = (RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((structalerts._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_status_desc),(Object)(RemoteObject.createImmutable("Novo")))))),RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s0))),RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s2))),RemoteObject.createImmutable("")));Debug.locals.put("s3", _s3);Debug.locals.put("s3", _s3);
 BA.debugLineNum = 463;BA.debugLine="CLAItem_G2.Text = s3 'date_verification";
Debug.ShouldStop(16384);
__ref.getField(false,"_claitem_g2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_s3));
 BA.debugLineNum = 465;BA.debugLine="If (operation_type = \"TOPERT_01\") Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_operation_type,RemoteObject.createImmutable("TOPERT_01")))) { 
 BA.debugLineNum = 466;BA.debugLine="ActionObjectStatusIcon.TextColor = Consts.ColorR";
Debug.ShouldStop(131072);
__ref.getField(false,"_actionobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts._consts._colorred /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 467;BA.debugLine="Else If (operation_type = \"TOPERT_02\") Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",_operation_type,RemoteObject.createImmutable("TOPERT_02")))) { 
 BA.debugLineNum = 468;BA.debugLine="ActionObjectStatusIcon.TextColor = Consts.ColorY";
Debug.ShouldStop(524288);
__ref.getField(false,"_actionobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts._consts._coloryellow /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 469;BA.debugLine="Else If (operation_type = \"TOPERT_03\") Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",_operation_type,RemoteObject.createImmutable("TOPERT_03")))) { 
 BA.debugLineNum = 470;BA.debugLine="ActionObjectStatusIcon.TextColor = Consts.ColorG";
Debug.ShouldStop(2097152);
__ref.getField(false,"_actionobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts._consts._colorgreen /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 472;BA.debugLine="ActionObjectStatusIcon.TextColor = Consts.ColorB";
Debug.ShouldStop(8388608);
__ref.getField(false,"_actionobjectstatusicon" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts._consts._colorblue /*RemoteObject*/ );
 }}}
;
 BA.debugLineNum = 475;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeRequest";
Debug.ShouldStop(67108864);
_claitem = structalerts._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_tagcode")))),(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("action_tagcode")))),(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")))),(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("item_tagcode")))),(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("uniquekey")))),(Object)(_colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")))),(Object)(_colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeatcounter")))),(Object)(_colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeatitemcounter")))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(structalerts._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("CLAItem", _claitem);Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 484;BA.debugLine="CLAActionAdd.Tag = CLAItem";
Debug.ShouldStop(8);
__ref.getField(false,"_claactionadd" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,(_claitem));
 BA.debugLineNum = 485;BA.debugLine="CLAActionOptions.Tag = CLAItem";
Debug.ShouldStop(16);
__ref.getField(false,"_claactionoptions" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,(_claitem));
 BA.debugLineNum = 487;BA.debugLine="p.Tag = $\"${tagcode}|${kind_data}|${id}|ACTION|${";
Debug.ShouldStop(64);
_p.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("|"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_kind_data))),RemoteObject.createImmutable("|"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("|ACTION|"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_posis))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 488;BA.debugLine="Return p";
Debug.ShouldStop(128);
if (true) return _p;
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createactionitem2(RemoteObject __ref,RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _bd) throws Exception{
try {
		Debug.PushSubsStack("CreateActionItem2 (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,681);
if (RapidSub.canDelegate("createactionitem2")) { return __ref.runUserSub(false, "structalerts","createactionitem2", __ref, _cnt, _colitems, _width, _height, _bd);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _urgency = RemoteObject.createImmutable(0);
RemoteObject _nature_type = RemoteObject.createImmutable(0);
RemoteObject _itype = RemoteObject.createImmutable(0);
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _priority = RemoteObject.createImmutable(0);
RemoteObject _creation_date = RemoteObject.createImmutable("");
RemoteObject _details = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _message_text = RemoteObject.createImmutable("");
RemoteObject _stat = RemoteObject.createImmutable("");
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("bd", _bd);
 BA.debugLineNum = 681;BA.debugLine="Sub CreateActionItem2(cnt As Int, colitems As Map,";
Debug.ShouldStop(256);
 BA.debugLineNum = 682;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 683;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1024);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 684;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(2048);
__ref.getField(false,"_activityreference" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 686;BA.debugLine="p.LoadLayout(\"alerts_actionitem_new\")";
Debug.ShouldStop(8192);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("alerts_actionitem_new")),__ref.getField(false, "ba"));
 BA.debugLineNum = 687;BA.debugLine="p.RemoveView";
Debug.ShouldStop(16384);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 691;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
Debug.ShouldStop(262144);
_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 692;BA.debugLine="Dim status_id As Int = colitems.Get(\"status_id\")";
Debug.ShouldStop(524288);
_status_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_id")))));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 693;BA.debugLine="Dim tagcode As String = colitems.Get(\"tagcode\")";
Debug.ShouldStop(1048576);
_tagcode = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcode")))));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 695;BA.debugLine="Dim urgency As Int = colitems.Get(\"urgency\")";
Debug.ShouldStop(4194304);
_urgency = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("urgency")))));Debug.locals.put("urgency", _urgency);Debug.locals.put("urgency", _urgency);
 BA.debugLineNum = 697;BA.debugLine="Dim nature_type As Int = colitems.Get(\"nature_typ";
Debug.ShouldStop(16777216);
_nature_type = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nature_type")))));Debug.locals.put("nature_type", _nature_type);Debug.locals.put("nature_type", _nature_type);
 BA.debugLineNum = 698;BA.debugLine="Dim iType As Int = colitems.Get(\"type\")";
Debug.ShouldStop(33554432);
_itype = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("iType", _itype);Debug.locals.put("iType", _itype);
 BA.debugLineNum = 699;BA.debugLine="Dim title As String = colitems.Get(\"title\")";
Debug.ShouldStop(67108864);
_title = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 700;BA.debugLine="Dim priority As Int = colitems.Get(\"priority\")";
Debug.ShouldStop(134217728);
_priority = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("priority")))));Debug.locals.put("priority", _priority);Debug.locals.put("priority", _priority);
 BA.debugLineNum = 702;BA.debugLine="Dim creation_date As String = colitems.Get(\"creat";
Debug.ShouldStop(536870912);
_creation_date = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("creation_date")))));Debug.locals.put("creation_date", _creation_date);Debug.locals.put("creation_date", _creation_date);
 BA.debugLineNum = 705;BA.debugLine="Dim details As Map = colitems.Get(\"details\")";
Debug.ShouldStop(1);
_details = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_details = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("details")))));Debug.locals.put("details", _details);
 BA.debugLineNum = 706;BA.debugLine="Dim message_text As String = details.Get(\"message";
Debug.ShouldStop(2);
_message_text = BA.ObjectToString(_details.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message_text")))));Debug.locals.put("message_text", _message_text);Debug.locals.put("message_text", _message_text);
 BA.debugLineNum = 708;BA.debugLine="ListItemTaskTitle.text = $\"#${cnt} - ${title}\"$";
Debug.ShouldStop(8);
__ref.getField(false,"_listitemtasktitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("#"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt))),RemoteObject.createImmutable(" - "),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 709;BA.debugLine="Dim stat As String = $\"${Structures.GetMapTitleBy";
Debug.ShouldStop(16);
_stat = (RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((structalerts._structures.runMethod(true,"_getmaptitlebyid" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(structalerts._structures._alerts_status /*RemoteObject*/ ),(Object)(_status_id))))),RemoteObject.createImmutable("")));Debug.locals.put("stat", _stat);Debug.locals.put("stat", _stat);
 BA.debugLineNum = 710;BA.debugLine="ListItemStatus.Text = stat";
Debug.ShouldStop(32);
__ref.getField(false,"_listitemstatus" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_stat));
 BA.debugLineNum = 711;BA.debugLine="ListItemStatusPanel.Color = Utils.ColorString(Str";
Debug.ShouldStop(64);
__ref.getField(false,"_listitemstatuspanel" /*RemoteObject*/ ).runVoidMethod ("setColor",structalerts._utils.runMethod(true,"_colorstring" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(structalerts._structures.runMethod(true,"_getmapcolorbyid" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(structalerts._structures._alerts_status /*RemoteObject*/ ),(Object)(_status_id)))));
 BA.debugLineNum = 712;BA.debugLine="ListItemStatusPanel.Tag = status_id";
Debug.ShouldStop(128);
__ref.getField(false,"_listitemstatuspanel" /*RemoteObject*/ ).runMethod(false,"setTag",(_status_id));
 BA.debugLineNum = 714;BA.debugLine="ListItemReference.text = $\"${tagcode} - ${creatio";
Debug.ShouldStop(512);
__ref.getField(false,"_listitemreference" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable(" - "),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_creation_date))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 715;BA.debugLine="ListItemReference.Tag = tagcode";
Debug.ShouldStop(1024);
__ref.getField(false,"_listitemreference" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 716;BA.debugLine="ListItemDetails.text = $\"${message_text}\"$";
Debug.ShouldStop(2048);
__ref.getField(false,"_listitemdetails" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_message_text))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 718;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(8192);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 719;BA.debugLine="Dim clr As Int = Colors.ARGB(255, 88,88,88)";
Debug.ShouldStop(16384);
_clr = structalerts.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 88)),(Object)(BA.numberCast(int.class, 88)),(Object)(BA.numberCast(int.class, 88)));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 720;BA.debugLine="cs.Initialize.Color(clr).Append($\"Prioridade: \"$)";
Debug.ShouldStop(32768);
_cs.runMethod(false,"Initialize").runMethod(false,"Color",(Object)(_clr)).runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence((RemoteObject.createImmutable("Prioridade: ")))));
 BA.debugLineNum = 721;BA.debugLine="cs.Bold.Color(clr).Append(Structures.GetMapTitleB";
Debug.ShouldStop(65536);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(_clr)).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(structalerts._structures.runMethod(true,"_getmaptitlebyid" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(structalerts._structures._alerts_priorities /*RemoteObject*/ ),(Object)(_priority))))).runMethod(false,"Pop").runVoidMethod ("Pop");
 BA.debugLineNum = 722;BA.debugLine="cs.Append($\", Gravidade: \"$)";
Debug.ShouldStop(131072);
_cs.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence((RemoteObject.createImmutable(", Gravidade: ")))));
 BA.debugLineNum = 723;BA.debugLine="cs.Bold.Color(clr).Append(Structures.GetMapTitleB";
Debug.ShouldStop(262144);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(_clr)).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(structalerts._structures.runMethod(true,"_getmaptitlebyid" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(structalerts._structures._alerts_urgency /*RemoteObject*/ ),(Object)(_urgency))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 728;BA.debugLine="ListItemPriorities.text =cs ' stat";
Debug.ShouldStop(8388608);
__ref.getField(false,"_listitempriorities" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 729;BA.debugLine="ListItemPriorities.Tag = $\"${priority}|${urgency}";
Debug.ShouldStop(16777216);
__ref.getField(false,"_listitempriorities" /*RemoteObject*/ ).runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_priority))),RemoteObject.createImmutable("|"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_urgency))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 731;BA.debugLine="ListItem_ID.Text = id";
Debug.ShouldStop(67108864);
__ref.getField(false,"_listitem_id" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 732;BA.debugLine="ListItem_StatusID.Text = status_id";
Debug.ShouldStop(134217728);
__ref.getField(false,"_listitem_statusid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_status_id));
 BA.debugLineNum = 733;BA.debugLine="ListItem_TypeID.Text = iType";
Debug.ShouldStop(268435456);
__ref.getField(false,"_listitem_typeid" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_itype));
 BA.debugLineNum = 735;BA.debugLine="If (nature_type = 0) Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",_nature_type,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 737;BA.debugLine="ListItem_Icon.Text = Chr(0xF085)";
Debug.ShouldStop(1);
__ref.getField(false,"_listitem_icon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(structalerts.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf085)))));
 }else 
{ BA.debugLineNum = 738;BA.debugLine="else if (nature_type = 1) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("=",_nature_type,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 740;BA.debugLine="ListItem_Icon.Text = Chr(0xF1B2)";
Debug.ShouldStop(8);
__ref.getField(false,"_listitem_icon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(structalerts.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1b2)))));
 }else 
{ BA.debugLineNum = 741;BA.debugLine="else if (nature_type = 2) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",_nature_type,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 743;BA.debugLine="ListItem_Icon.Text = Chr(0xF04)";
Debug.ShouldStop(64);
__ref.getField(false,"_listitem_icon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(structalerts.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf04)))));
 }else 
{ BA.debugLineNum = 744;BA.debugLine="else if (nature_type = 3) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",_nature_type,BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 746;BA.debugLine="ListItem_Icon.Text = Chr(0xF24A)";
Debug.ShouldStop(512);
__ref.getField(false,"_listitem_icon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(structalerts.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf24a)))));
 }else 
{ BA.debugLineNum = 747;BA.debugLine="else if (nature_type = 4) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",_nature_type,BA.numberCast(double.class, 4)))) { 
 BA.debugLineNum = 749;BA.debugLine="ListItem_Icon.Text = Chr(0xF0B1)";
Debug.ShouldStop(4096);
__ref.getField(false,"_listitem_icon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(structalerts.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf0b1)))));
 }}}}}
;
 BA.debugLineNum = 752;BA.debugLine="listButCheckNew.TextColor = Colors.ARGB(255, 60,1";
Debug.ShouldStop(32768);
__ref.getField(false,"_listbutchecknew" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 60)),(Object)(BA.numberCast(int.class, 184)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 753;BA.debugLine="If (status_id = 0) Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 754;BA.debugLine="listButCheckNew.TextColor = Colors.ARGB(255, 179";
Debug.ShouldStop(131072);
__ref.getField(false,"_listbutchecknew" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 179))));
 BA.debugLineNum = 755;BA.debugLine="listButCheckNew.Enabled = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_listbutchecknew" /*RemoteObject*/ ).runMethod(true,"setEnabled",structalerts.__c.getField(true,"False"));
 };
 BA.debugLineNum = 758;BA.debugLine="p.Color = Colors.ARGB(255, 250,250,250)";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("setColor",structalerts.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 250))));
 BA.debugLineNum = 759;BA.debugLine="If (status_id = 0) Then p.Color =Colors.ARGB(255,";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 0)))) { 
_p.runVoidMethod ("setColor",structalerts.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 199)),(Object)(BA.numberCast(int.class, 184))));};
 BA.debugLineNum = 760;BA.debugLine="Return p";
Debug.ShouldStop(8388608);
if (true) return _p;
 BA.debugLineNum = 761;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createalertitem(RemoteObject __ref,RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _bd) throws Exception{
try {
		Debug.PushSubsStack("CreateAlertItem (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("createalertitem")) { return __ref.runUserSub(false, "structalerts","createalertitem", __ref, _cnt, _colitems, _width, _height, _bd);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _date_verification = RemoteObject.createImmutable("");
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _kind_data = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _alerttype = RemoteObject.createImmutable("");
RemoteObject _claitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("bd", _bd);
 BA.debugLineNum = 170;BA.debugLine="Sub CreateAlertItem(cnt As Int, colitems As Cursor";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 172;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2048);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 173;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height";
Debug.ShouldStop(4096);
__ref.getField(false,"_activityreference" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(35)}, "+",1, 1)));
 BA.debugLineNum = 174;BA.debugLine="p.LoadLayout(\"alerts_alertitem_new\") 'alerts_aler";
Debug.ShouldStop(8192);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("alerts_alertitem_new")),__ref.getField(false, "ba"));
 BA.debugLineNum = 175;BA.debugLine="p.RemoveView";
Debug.ShouldStop(16384);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 180;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(524288);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 181;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
Debug.ShouldStop(1048576);
_title = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 182;BA.debugLine="Dim date_verification As String = colitems.GetStr";
Debug.ShouldStop(2097152);
_date_verification = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("date_verification")));Debug.locals.put("date_verification", _date_verification);Debug.locals.put("date_verification", _date_verification);
 BA.debugLineNum = 183;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
Debug.ShouldStop(4194304);
_status_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 184;BA.debugLine="Dim kind_data As Int = colitems.GetInt(\"kind_data";
Debug.ShouldStop(8388608);
_kind_data = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("kind_data")));Debug.locals.put("kind_data", _kind_data);Debug.locals.put("kind_data", _kind_data);
 BA.debugLineNum = 185;BA.debugLine="Dim id As Int = colitems.GetInt(\"id\")";
Debug.ShouldStop(16777216);
_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 186;BA.debugLine="Dim AlertType As String = colitems.GetString(\"ale";
Debug.ShouldStop(33554432);
_alerttype = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("alert_type")));Debug.locals.put("AlertType", _alerttype);Debug.locals.put("AlertType", _alerttype);
 BA.debugLineNum = 189;BA.debugLine="CLAItemAlertText.Text = $\"${title}\"$";
Debug.ShouldStop(268435456);
__ref.getField(false,"_claitemalerttext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 190;BA.debugLine="CLAItemAlertText.Text = CLAItemAlertText.Text.Rep";
Debug.ShouldStop(536870912);
__ref.getField(false,"_claitemalerttext" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_claitemalerttext" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(";")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(";"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((structalerts.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 192;BA.debugLine="If AlertType.ToUpperCase = \"ALRTTYP_EMAIL\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_alerttype.runMethod(true,"toUpperCase"),BA.ObjectToString("ALRTTYP_EMAIL"))) { 
 BA.debugLineNum = 193;BA.debugLine="Marker_Button.visible = False";
Debug.ShouldStop(1);
__ref.getField(false,"_marker_button" /*RemoteObject*/ ).runMethod(true,"setVisible",structalerts.__c.getField(true,"False"));
 BA.debugLineNum = 195;BA.debugLine="If title.Contains(\"ERRO\") Then";
Debug.ShouldStop(4);
if (_title.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("ERRO"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 196;BA.debugLine="CLAButtonAlertOptions.enabled = False";
Debug.ShouldStop(8);
__ref.getField(false,"_clabuttonalertoptions" /*RemoteObject*/ ).runMethod(true,"setEnabled",structalerts.__c.getField(true,"False"));
 BA.debugLineNum = 197;BA.debugLine="lbl_Eml_Result.Visible = True";
Debug.ShouldStop(16);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setVisible",structalerts.__c.getField(true,"True"));
 BA.debugLineNum = 198;BA.debugLine="lbl_Eml_Result.Text = \"E M A I L  N Ã O  E N V";
Debug.ShouldStop(32);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("E M A I L  N Ã O  E N V I A D O"));
 BA.debugLineNum = 199;BA.debugLine="lbl_Eml_Result.TextColor = Colors.Red";
Debug.ShouldStop(64);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts.__c.getField(false,"Colors").getField(true,"Red"));
 }else 
{ BA.debugLineNum = 200;BA.debugLine="Else if title.Contains (\"SUCESSO\") Then";
Debug.ShouldStop(128);
if (_title.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("SUCESSO"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 201;BA.debugLine="CLAButtonAlertOptions.enabled = False";
Debug.ShouldStop(256);
__ref.getField(false,"_clabuttonalertoptions" /*RemoteObject*/ ).runMethod(true,"setEnabled",structalerts.__c.getField(true,"False"));
 BA.debugLineNum = 202;BA.debugLine="lbl_Eml_Result.Visible = True";
Debug.ShouldStop(512);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setVisible",structalerts.__c.getField(true,"True"));
 BA.debugLineNum = 203;BA.debugLine="lbl_Eml_Result.Text = \"E M A I L   E N V I A D";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("E M A I L   E N V I A D O"));
 BA.debugLineNum = 204;BA.debugLine="lbl_Eml_Result.TextColor = Consts.ColorGreen";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts._consts._colorgreen /*RemoteObject*/ );
 }}
;
 }else 
{ BA.debugLineNum = 207;BA.debugLine="Else if AlertType.ToUpperCase = \"ALRTTYP_REQUESTS";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_alerttype.runMethod(true,"toUpperCase"),BA.ObjectToString("ALRTTYP_REQUESTS"))) { 
 BA.debugLineNum = 208;BA.debugLine="Marker_Button.visible = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_marker_button" /*RemoteObject*/ ).runMethod(true,"setVisible",structalerts.__c.getField(true,"True"));
 BA.debugLineNum = 209;BA.debugLine="CLAButtonAlertOptions.enabled = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_clabuttonalertoptions" /*RemoteObject*/ ).runMethod(true,"setEnabled",structalerts.__c.getField(true,"True"));
 BA.debugLineNum = 210;BA.debugLine="lbl_Eml_Result.Visible = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setVisible",structalerts.__c.getField(true,"True"));
 BA.debugLineNum = 211;BA.debugLine="lbl_Eml_Result.Text = \"N O V A  I N T E R V E N";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("N O V A  I N T E R V E N C A O"));
 BA.debugLineNum = 212;BA.debugLine="lbl_Eml_Result.TextColor = Colors.Red";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl_eml_result" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 214;BA.debugLine="Marker_Button.visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_marker_button" /*RemoteObject*/ ).runMethod(true,"setVisible",structalerts.__c.getField(true,"False"));
 }}
;
 BA.debugLineNum = 217;BA.debugLine="If (status_id = 1) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 1)))) { 
 }else 
{ BA.debugLineNum = 221;BA.debugLine="Else If (status_id = 2) Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 224;BA.debugLine="CLAItemAlertButton_2.State = 1";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_claitemalertbutton_2" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 }}
;
 BA.debugLineNum = 228;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeRequest";
Debug.ShouldStop(8);
_claitem = structalerts._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(structalerts._utils.runMethod(true,"_udid" /*RemoteObject*/ ,__ref.getField(false, "ba"))),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(_tagcode),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(structalerts._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("CLAItem", _claitem);Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 238;BA.debugLine="CLAButtonAlertOptions.Tag = CLAItem";
Debug.ShouldStop(8192);
__ref.getField(false,"_clabuttonalertoptions" /*RemoteObject*/ ).runMethod(false,"setTag",(_claitem));
 BA.debugLineNum = 241;BA.debugLine="CLAItemAlertButton_2.Tag = 2";
Debug.ShouldStop(65536);
__ref.getField(false,"_claitemalertbutton_2" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,RemoteObject.createImmutable((2)));
 BA.debugLineNum = 243;BA.debugLine="p.Tag = $\"${tagcode}|${kind_data}|${id}\"$";
Debug.ShouldStop(262144);
_p.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("|"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_kind_data))),RemoteObject.createImmutable("|"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 244;BA.debugLine="Return p";
Debug.ShouldStop(524288);
if (true) return _p;
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtaskitem(RemoteObject __ref,RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _bd) throws Exception{
try {
		Debug.PushSubsStack("CreateTaskItem (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("createtaskitem")) { return __ref.runUserSub(false, "structalerts","createtaskitem", __ref, _cnt, _colitems, _width, _height, _bd);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _date_verification = RemoteObject.createImmutable("");
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _kind_data = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _obs = RemoteObject.createImmutable("");
RemoteObject _imagename = RemoteObject.createImmutable("");
RemoteObject _claitem = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("bd", _bd);
 BA.debugLineNum = 248;BA.debugLine="Sub CreateTaskItem(cnt As Int, colitems As Cursor,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 250;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 251;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height+";
Debug.ShouldStop(67108864);
__ref.getField(false,"_activityreference" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(55)}, "+",1, 1)));
 BA.debugLineNum = 252;BA.debugLine="p.LoadLayout(\"alerts_taskitem_new2\") 'alerts_task";
Debug.ShouldStop(134217728);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("alerts_taskitem_new2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 253;BA.debugLine="p.RemoveView";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 258;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(2);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 259;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
Debug.ShouldStop(4);
_title = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 260;BA.debugLine="Dim date_verification As String = colitems.GetStr";
Debug.ShouldStop(8);
_date_verification = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("date_verification")));Debug.locals.put("date_verification", _date_verification);Debug.locals.put("date_verification", _date_verification);
 BA.debugLineNum = 261;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
Debug.ShouldStop(16);
_status_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 262;BA.debugLine="Dim kind_data As Int = colitems.GetInt(\"kind_data";
Debug.ShouldStop(32);
_kind_data = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("kind_data")));Debug.locals.put("kind_data", _kind_data);Debug.locals.put("kind_data", _kind_data);
 BA.debugLineNum = 263;BA.debugLine="Dim id As Int = colitems.GetInt(\"id\")";
Debug.ShouldStop(64);
_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 265;BA.debugLine="Dim obs As String = colitems.GetString(\"obs\")";
Debug.ShouldStop(256);
_obs = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("obs")));Debug.locals.put("obs", _obs);Debug.locals.put("obs", _obs);
 BA.debugLineNum = 266;BA.debugLine="Dim imagename As String = colitems.GetString(\"ima";
Debug.ShouldStop(512);
_imagename = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")));Debug.locals.put("imagename", _imagename);Debug.locals.put("imagename", _imagename);
 BA.debugLineNum = 268;BA.debugLine="CLAItem_G1.Text = $\"${title} (${imagename})\"$";
Debug.ShouldStop(2048);
__ref.getField(false,"_claitem_g1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable(" ("),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagename))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 269;BA.debugLine="CLAItem_G2.Text = date_verification";
Debug.ShouldStop(4096);
__ref.getField(false,"_claitem_g2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_date_verification));
 BA.debugLineNum = 270;BA.debugLine="CLAItem_G3.Text = obs";
Debug.ShouldStop(8192);
__ref.getField(false,"_claitem_g3" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_obs));
 BA.debugLineNum = 272;BA.debugLine="If title.Contains(\"Imagens adicionadas\") Then";
Debug.ShouldStop(32768);
if (_title.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Imagens adicionadas"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 273;BA.debugLine="lbl_Alert_type.Text = \"N O V A   I M A G E M\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbl_alert_type" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("N O V A   I M A G E M"));
 BA.debugLineNum = 274;BA.debugLine="lbl_Alert_type.TextColor = Colors.Red";
Debug.ShouldStop(131072);
__ref.getField(false,"_lbl_alert_type" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 276;BA.debugLine="lbl_Alert_type.Text = \"N O V A  I N T E R V E N";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl_alert_type" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("N O V A  I N T E R V E N C A O"));
 BA.debugLineNum = 277;BA.debugLine="lbl_Alert_type.TextColor = Colors.Red";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lbl_alert_type" /*RemoteObject*/ ).runMethod(true,"setTextColor",structalerts.__c.getField(false,"Colors").getField(true,"Red"));
 };
 BA.debugLineNum = 282;BA.debugLine="If (status_id = 1) Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 285;BA.debugLine="CLAItemButton_1.State = 1";
Debug.ShouldStop(268435456);
__ref.getField(false,"_claitembutton_1" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 }else 
{ BA.debugLineNum = 286;BA.debugLine="Else If (status_id = 2) Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 289;BA.debugLine="CLAItemButton_2.State = 1";
Debug.ShouldStop(1);
__ref.getField(false,"_claitembutton_2" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setstate" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 }}
;
 BA.debugLineNum = 293;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeRequest";
Debug.ShouldStop(16);
_claitem = structalerts._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(structalerts._utils.runMethod(true,"_udid" /*RemoteObject*/ ,__ref.getField(false, "ba"))),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_title),(Object)(BA.ObjectToString("")),(Object)(_tagcode),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(structalerts._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("CLAItem", _claitem);Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 303;BA.debugLine="CLAButtonOptions.Tag = CLAItem";
Debug.ShouldStop(16384);
__ref.getField(false,"_clabuttonoptions" /*RemoteObject*/ ).runMethod(false,"setTag",(_claitem));
 BA.debugLineNum = 305;BA.debugLine="CLAItemButton_1.Tag = 1";
Debug.ShouldStop(65536);
__ref.getField(false,"_claitembutton_1" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,RemoteObject.createImmutable((1)));
 BA.debugLineNum = 306;BA.debugLine="CLAItemButton_2.Tag = 2";
Debug.ShouldStop(131072);
__ref.getField(false,"_claitembutton_2" /*RemoteObject*/ ).runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_settag" /*RemoteObject*/ ,RemoteObject.createImmutable((2)));
 BA.debugLineNum = 308;BA.debugLine="p.Tag = $\"${tagcode}|${kind_data}|${id}\"$";
Debug.ShouldStop(524288);
_p.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("|"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_kind_data))),RemoteObject.createImmutable("|"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 309;BA.debugLine="Return p";
Debug.ShouldStop(1048576);
if (true) return _p;
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalertstotalrecs(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAlertsTotalRecs (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("getalertstotalrecs")) { return __ref.runUserSub(false, "structalerts","getalertstotalrecs", __ref);}
ResumableSub_GetAlertsTotalRecs rsub = new ResumableSub_GetAlertsTotalRecs(null,__ref);
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
public ResumableSub_GetAlertsTotalRecs(xevolution.vrcg.devdemov2400.structalerts parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.structalerts parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetAlertsTotalRecs (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,70);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 71;BA.debugLine="Log(ShareCode.SystemAlertsCount)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","6175112193",BA.NumberToString(parent._sharecode._systemalertscount /*RemoteObject*/ ),0);
 BA.debugLineNum = 72;BA.debugLine="Log(ShareCode.TasksAlertsCount)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","6175112194",BA.NumberToString(parent._sharecode._tasksalertscount /*RemoteObject*/ ),0);
 BA.debugLineNum = 73;BA.debugLine="Log(ShareCode.RequestsAlertsCount)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","6175112195",BA.NumberToString(parent._sharecode._requestsalertscount /*RemoteObject*/ ),0);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _getpressedanswertagcode(RemoteObject __ref,RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("GetPressedAnswerTagCode (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("getpressedanswertagcode")) { return __ref.runUserSub(false, "structalerts","getpressedanswertagcode", __ref, _claitem);}
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _ret = RemoteObject.createImmutable("");
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 320;BA.debugLine="Sub GetPressedAnswerTagCode(CLAItem As RequestCLAI";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="Dim sSQL As String = $\"select a.tagcode from  dta";
Debug.ShouldStop(1);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select a.tagcode from  dta_requests_values as a where 1=1\n"),RemoteObject.createImmutable("						and a.request_tagcode='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and a.inner_request_tagcode='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Action" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and a.task_tagcode='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and a.item_tagcode='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and a.unique_key='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"UniqueKey" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and a.execute_status=1\n"),RemoteObject.createImmutable("						and a.repeatcounter="),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and a.repeatitemcounter="),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and a.repeatfieldcounter="),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 332;BA.debugLine="Dim ret As String = DBStructures.GetScriptColumnS";
Debug.ShouldStop(2048);
_ret = structalerts._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_ssql),(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 333;BA.debugLine="Return ret";
Debug.ShouldStop(4096);
if (true) return _ret;
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _activity,RemoteObject _lstobj) throws Exception{
try {
		Debug.PushSubsStack("Initialize (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "structalerts","initialize", __ref, _ba, _activity, _lstobj);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Activity", _activity);
Debug.locals.put("lstobj", _lstobj);
 BA.debugLineNum = 52;BA.debugLine="Public Sub Initialize(Activity As Activity, lstobj";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="ALERT_VIEW = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_alert_view" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 54;BA.debugLine="TASK_VIEW = 1";
Debug.ShouldStop(2097152);
__ref.setField ("_task_view" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 55;BA.debugLine="ACTION_VIEW = 2";
Debug.ShouldStop(4194304);
__ref.setField ("_action_view" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 57;BA.debugLine="ActivityReference = Activity";
Debug.ShouldStop(16777216);
__ref.setField ("_activityreference" /*RemoteObject*/ ,_activity);
 BA.debugLineNum = 60;BA.debugLine="listAlerts = lstobj(ALERT_VIEW)";
Debug.ShouldStop(134217728);
__ref.setField ("_listalerts" /*RemoteObject*/ ,_lstobj.getArrayElement(false,__ref.getField(true,"_alert_view" /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="listTasks = lstobj(TASK_VIEW)";
Debug.ShouldStop(536870912);
__ref.setField ("_listtasks" /*RemoteObject*/ ,_lstobj.getArrayElement(false,__ref.getField(true,"_task_view" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="listActions = lstobj(ACTION_VIEW)";
Debug.ShouldStop(-2147483648);
__ref.setField ("_listactions" /*RemoteObject*/ ,_lstobj.getArrayElement(false,__ref.getField(true,"_action_view" /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="TasksList.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_taskslist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(4);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listactionrecords(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListActionRecords (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("listactionrecords")) { return __ref.runUserSub(false, "structalerts","listactionrecords", __ref);}
 BA.debugLineNum = 416;BA.debugLine="Public Sub ListActionRecords As Int";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 417;BA.debugLine="Return listActions.Size";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_listactions" /*RemoteObject*/ ).runMethod(true,"_getsize");
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listalertsrecords(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListAlertsRecords (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,420);
if (RapidSub.canDelegate("listalertsrecords")) { return __ref.runUserSub(false, "structalerts","listalertsrecords", __ref);}
 BA.debugLineNum = 420;BA.debugLine="public Sub ListAlertsRecords As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 421;BA.debugLine="Return listAlerts.Size";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_listalerts" /*RemoteObject*/ ).runMethod(true,"_getsize");
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutchecknew_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listButCheckNew_Click (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,810);
if (RapidSub.canDelegate("listbutchecknew_click")) { return __ref.runUserSub(false, "structalerts","listbutchecknew_click", __ref);}
 BA.debugLineNum = 810;BA.debugLine="Sub listButCheckNew_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 812;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutmoreactioninner_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listButMoreActionInner_Click (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,814);
if (RapidSub.canDelegate("listbutmoreactioninner_click")) { return __ref.runUserSub(false, "structalerts","listbutmoreactioninner_click", __ref);}
 BA.debugLineNum = 814;BA.debugLine="Sub listButMoreActionInner_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 830;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemactionclose_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListItemActionClose_Click (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,1040);
if (RapidSub.canDelegate("listitemactionclose_click")) { return __ref.runUserSub(false, "structalerts","listitemactionclose_click", __ref);}
 BA.debugLineNum = 1040;BA.debugLine="Sub ListItemActionClose_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1042;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemactionnew_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListItemActionNew_Click (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,1044);
if (RapidSub.canDelegate("listitemactionnew_click")) { return __ref.runUserSub(false, "structalerts","listitemactionnew_click", __ref);}
 BA.debugLineNum = 1044;BA.debugLine="Sub ListItemActionNew_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1046;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listtaskrecords(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListTaskRecords (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("listtaskrecords")) { return __ref.runUserSub(false, "structalerts","listtaskrecords", __ref);}
 BA.debugLineNum = 165;BA.debugLine="Public Sub ListTaskRecords As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Return listTasks.Size";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_listtasks" /*RemoteObject*/ ).runMethod(true,"_getsize");
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeclaitemactionclick(RemoteObject __ref,RemoteObject _btn,RemoteObject _btnstate,RemoteObject _btnorigin) throws Exception{
try {
		Debug.PushSubsStack("MakeCLAItemActionClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,554);
if (RapidSub.canDelegate("makeclaitemactionclick")) { return __ref.runUserSub(false, "structalerts","makeclaitemactionclick", __ref, _btn, _btnstate, _btnorigin);}
Debug.locals.put("btn", _btn);
Debug.locals.put("btnstate", _btnstate);
Debug.locals.put("btnOrigin", _btnorigin);
 BA.debugLineNum = 554;BA.debugLine="Sub MakeCLAItemActionClick(btn As B4XStateButton,";
Debug.ShouldStop(512);
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _marker_button_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Marker_Button_Click (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,1049);
if (RapidSub.canDelegate("marker_button_click")) { return __ref.runUserSub(false, "structalerts","marker_button_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblphoto1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblphoto2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblphoto1txt = RemoteObject.createImmutable("");
RemoteObject _lblphoto2txt = RemoteObject.createImmutable("");
RemoteObject _alertscoord = RemoteObject.createImmutable("");
RemoteObject _phototitle = RemoteObject.createImmutable("");
RemoteObject _typeofalert = RemoteObject.createImmutable("");
 BA.debugLineNum = 1049;BA.debugLine="Sub Marker_Button_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1051;BA.debugLine="Dim btn As Button = Sender";
Debug.ShouldStop(67108864);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), structalerts.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 1052;BA.debugLine="Dim pnl As Panel = btn.Parent";
Debug.ShouldStop(134217728);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _btn.runMethod(false,"getParent"));Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1053;BA.debugLine="Log(pnl.Tag)";
Debug.ShouldStop(268435456);
structalerts.__c.runVoidMethod ("LogImpl","6177143812",BA.ObjectToString(_pnl.runMethod(false,"getTag")),0);
 BA.debugLineNum = 1054;BA.debugLine="Dim LblPhoto1 As Label = pnl.GetView(1)";
Debug.ShouldStop(536870912);
_lblphoto1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblphoto1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("LblPhoto1", _lblphoto1);
 BA.debugLineNum = 1055;BA.debugLine="Dim LblPhoto2 As Label = pnl.GetView(6)";
Debug.ShouldStop(1073741824);
_lblphoto2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblphoto2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 6))).getObject());Debug.locals.put("LblPhoto2", _lblphoto2);
 BA.debugLineNum = 1056;BA.debugLine="Dim lblphoto1Txt As String = LblPhoto1.Text";
Debug.ShouldStop(-2147483648);
_lblphoto1txt = _lblphoto1.runMethod(true,"getText");Debug.locals.put("lblphoto1Txt", _lblphoto1txt);Debug.locals.put("lblphoto1Txt", _lblphoto1txt);
 BA.debugLineNum = 1057;BA.debugLine="Dim lblphoto2Txt As String = LblPhoto2.Text";
Debug.ShouldStop(1);
_lblphoto2txt = _lblphoto2.runMethod(true,"getText");Debug.locals.put("lblphoto2Txt", _lblphoto2txt);Debug.locals.put("lblphoto2Txt", _lblphoto2txt);
 BA.debugLineNum = 1058;BA.debugLine="Dim alertsCoord As String  = \"\"";
Debug.ShouldStop(2);
_alertscoord = BA.ObjectToString("");Debug.locals.put("alertsCoord", _alertscoord);Debug.locals.put("alertsCoord", _alertscoord);
 BA.debugLineNum = 1059;BA.debugLine="Dim PhotoTitle As String = \"\"";
Debug.ShouldStop(4);
_phototitle = BA.ObjectToString("");Debug.locals.put("PhotoTitle", _phototitle);Debug.locals.put("PhotoTitle", _phototitle);
 BA.debugLineNum = 1060;BA.debugLine="Dim TypeOfAlert As String = \"\"";
Debug.ShouldStop(8);
_typeofalert = BA.ObjectToString("");Debug.locals.put("TypeOfAlert", _typeofalert);Debug.locals.put("TypeOfAlert", _typeofalert);
 BA.debugLineNum = 1062;BA.debugLine="If lblphoto1Txt.Contains(\"Imagens adicionadas\") T";
Debug.ShouldStop(32);
if (_lblphoto1txt.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Imagens adicionadas"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1063;BA.debugLine="lblphoto1Txt = lblphoto1Txt.Replace(\"Imagens adi";
Debug.ShouldStop(64);
_lblphoto1txt = _lblphoto1txt.runMethod(true,"replace",(Object)(BA.ObjectToString("Imagens adicionadas ao repositório por utilizar.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("lblphoto1Txt", _lblphoto1txt);
 BA.debugLineNum = 1064;BA.debugLine="TypeOfAlert = \"FOTO\"";
Debug.ShouldStop(128);
_typeofalert = BA.ObjectToString("FOTO");Debug.locals.put("TypeOfAlert", _typeofalert);
 BA.debugLineNum = 1065;BA.debugLine="PhotoTitle = $\"${lblphoto1Txt} ${lblphoto2Txt}\"$";
Debug.ShouldStop(256);
_phototitle = (RemoteObject.concat(RemoteObject.createImmutable(""),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lblphoto1txt))),RemoteObject.createImmutable(" "),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lblphoto2txt))),RemoteObject.createImmutable("")));Debug.locals.put("PhotoTitle", _phototitle);
 BA.debugLineNum = 1067;BA.debugLine="If lblphoto2Txt.Length > 26 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_lblphoto2txt.runMethod(true,"length"),BA.numberCast(double.class, 26))) { 
 BA.debugLineNum = 1068;BA.debugLine="alertsCoord  = lblphoto2Txt.SubString(26)";
Debug.ShouldStop(2048);
_alertscoord = _lblphoto2txt.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 26)));Debug.locals.put("alertsCoord", _alertscoord);
 };
 }else {
 BA.debugLineNum = 1072;BA.debugLine="TypeOfAlert = \"INTERVENCAO\"";
Debug.ShouldStop(32768);
_typeofalert = BA.ObjectToString("INTERVENCAO");Debug.locals.put("TypeOfAlert", _typeofalert);
 BA.debugLineNum = 1074;BA.debugLine="If lblphoto2Txt.Length > 24 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_lblphoto2txt.runMethod(true,"length"),BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 1075;BA.debugLine="alertsCoord  = lblphoto2Txt.SubString(24)";
Debug.ShouldStop(262144);
_alertscoord = _lblphoto2txt.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 24)));Debug.locals.put("alertsCoord", _alertscoord);
 };
 };
 BA.debugLineNum = 1080;BA.debugLine="If Utils.NNE(alertsCoord) Then";
Debug.ShouldStop(8388608);
if (structalerts._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_alertscoord)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1081;BA.debugLine="CallSub3(Alerts,\"ShowAlertMaps\",PhotoTitle, aler";
Debug.ShouldStop(16777216);
structalerts.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)((structalerts._alerts.getObject())),(Object)(BA.ObjectToString("ShowAlertMaps")),(Object)((_phototitle)),(Object)((_alertscoord)));
 };
 BA.debugLineNum = 1085;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startactions(RemoteObject __ref,RemoteObject _clear) throws Exception{
try {
		Debug.PushSubsStack("StartActions (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("startactions")) { return __ref.runUserSub(false, "structalerts","startactions", __ref, _clear);}
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _row = 0;
Debug.locals.put("clear", _clear);
 BA.debugLineNum = 370;BA.debugLine="Public Sub StartActions(clear As Boolean) As Int";
Debug.ShouldStop(131072);
 BA.debugLineNum = 371;BA.debugLine="If (clear) Then";
Debug.ShouldStop(262144);
if ((_clear).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 372;BA.debugLine="listActions.Clear";
Debug.ShouldStop(524288);
__ref.getField(false,"_listactions" /*RemoteObject*/ ).runVoidMethod ("_clear");
 };
 BA.debugLineNum = 377;BA.debugLine="Dim height As Int = 90dip";
Debug.ShouldStop(16777216);
_height = structalerts.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 378;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(33554432);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 380;BA.debugLine="Dim SQL As String = $\"select ifnull(b.tagdesc,'')";
Debug.ShouldStop(134217728);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,\n"),RemoteObject.createImmutable("								ifnull(d.tagdesc,'') as urgency_desc, a.id, a.request_tagcode, a.repeatcounter, a.repeatitemcounter,\n"),RemoteObject.createImmutable("								a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.updated_at as actiondatetime,\n"),RemoteObject.createImmutable("								ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, ifnull(a.email_to, '') as email_to,\n"),RemoteObject.createImmutable("								ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,\n"),RemoteObject.createImmutable("								a.priority_tagcode,  ifnull(a.title,'') as title, a.gravity_tagcode,  a.due_date, b.tagcode as operation_type,\n"),RemoteObject.createImmutable("								a1.technical_tagcode, a1.sess_user, a2.inner_title, a3.title AS checklist\n"),RemoteObject.createImmutable("								from dta_actions as a \n"),RemoteObject.createImmutable("								INNER JOIN dta_requests AS a1 ON (a1.tagcode=a.request_tagcode)\n"),RemoteObject.createImmutable("								INNER JOIN dta_requests_relations AS a2 ON (a2.request_tagcode=a1.tagcode AND a2.relation_tagcode=a.action_tagcode)\n"),RemoteObject.createImmutable("								left JOIN dta_tasks AS a3 ON (a3.tagcode=a2.relation_tagcode)\n"),RemoteObject.createImmutable("								left join type_operationtypes as b ON (b.tagcode=(SELECT operation_type FROM dta_actions_items \n"),RemoteObject.createImmutable("									WHERE actions_tagcode=a.tagcode \n"),RemoteObject.createImmutable("									ORDER BY updated_at DESC LIMIT 1))\n"),RemoteObject.createImmutable("								left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)\n"),RemoteObject.createImmutable("								left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)\n"),RemoteObject.createImmutable("								where 1=1 and\n"),RemoteObject.createImmutable("								a.operation_type Not in ('TOPERT_04') and\n"),RemoteObject.createImmutable("								b.tagcode Not in ('TOPERT_04') and\n"),RemoteObject.createImmutable("								a.technical_tagcode='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((structalerts._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("'  \n"),RemoteObject.createImmutable("								order by a.request_tagcode, a.task_tagcode, a.id desc ")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 402;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(131072);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), structalerts._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 403;BA.debugLine="Dim ItemsCounter As Int = Record.RowCount";
Debug.ShouldStop(262144);
structalerts._itemscounter = _record.runMethod(true,"getRowCount");__ref.setField("_itemscounter",structalerts._itemscounter);
 BA.debugLineNum = 404;BA.debugLine="ShareCode.RequestsAlertsCount = ItemsCounter";
Debug.ShouldStop(524288);
structalerts._sharecode._requestsalertscount /*RemoteObject*/  = __ref.getField(true,"_itemscounter" /*RemoteObject*/ );
 BA.debugLineNum = 405;BA.debugLine="If ItemsCounter > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_itemscounter" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 406;BA.debugLine="For Row = 0 To ItemsCounter-1";
Debug.ShouldStop(2097152);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemscounter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step11 > 0 && _row <= limit11) || (step11 < 0 && _row >= limit11) ;_row = ((int)(0 + _row + step11))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 407;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(4194304);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 408;BA.debugLine="listActions.Add(CreateActionItem(Row, Record, l";
Debug.ShouldStop(8388608);
__ref.getField(false,"_listactions" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_createactionitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _row)),(Object)(_record),(Object)(__ref.getField(false,"_listactions" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(_height)).getObject()),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 412;BA.debugLine="Return ItemsCounter";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(true,"_itemscounter" /*RemoteObject*/ );
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startalerts(RemoteObject __ref,RemoteObject _clear) throws Exception{
try {
		Debug.PushSubsStack("StartAlerts (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("startalerts")) { return __ref.runUserSub(false, "structalerts","startalerts", __ref, _clear);}
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _nrows = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _alrtype = RemoteObject.createImmutable("");
Debug.locals.put("clear", _clear);
 BA.debugLineNum = 77;BA.debugLine="Public Sub StartAlerts(clear As Boolean) As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="If (clear) Then";
Debug.ShouldStop(8192);
if ((_clear).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="listAlerts.Clear";
Debug.ShouldStop(16384);
__ref.getField(false,"_listalerts" /*RemoteObject*/ ).runVoidMethod ("_clear");
 };
 BA.debugLineNum = 85;BA.debugLine="Dim height As Int = 65dip";
Debug.ShouldStop(1048576);
_height = structalerts.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 65)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 86;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(2097152);
if ((structalerts._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 87;BA.debugLine="height = 120dip";
Debug.ShouldStop(4194304);
_height = structalerts.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)));Debug.locals.put("height", _height);
 };
 BA.debugLineNum = 89;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(16777216);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 90;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(33554432);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 91;BA.debugLine="Dim SQL As String = $\"select ifnull(tagcode,'') a";
Debug.ShouldStop(67108864);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select ifnull(tagcode,'') as tagcode, ifnull(title,'') as title,\n"),RemoteObject.createImmutable("						ifnull(date_verification,'') as date_verification, status_id, kind_data, id,\n"),RemoteObject.createImmutable("						'' as obs, '' as imagename, alert_type from dta_alerts where 1=1\n"),RemoteObject.createImmutable("						 and alert_type = 'ALRTTYP_NOTIFY' and alert_visible=1 and active = 1\n"),RemoteObject.createImmutable("                         or alert_type = 'ALRTTYP_SMS' and alert_visible=1 and active = 1\n"),RemoteObject.createImmutable("						 or alert_type = 'ALRTTYP_ALERT' and alert_visible=1 and active = 1\n"),RemoteObject.createImmutable("                         or alert_type = 'ALRTTYP_EMAIL' and alert_visible=1 and active = 1")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 100;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(8);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), structalerts._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 102;BA.debugLine="Dim nRows As Int = Record.RowCount";
Debug.ShouldStop(32);
_nrows = _record.runMethod(true,"getRowCount");Debug.locals.put("nRows", _nrows);Debug.locals.put("nRows", _nrows);
 BA.debugLineNum = 103;BA.debugLine="ShareCode.SystemAlertsCount = nRows";
Debug.ShouldStop(64);
structalerts._sharecode._systemalertscount /*RemoteObject*/  = _nrows;
 BA.debugLineNum = 104;BA.debugLine="If nRows > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_nrows,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 105;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(256);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step15 > 0 && _row <= limit15) || (step15 < 0 && _row >= limit15) ;_row = ((int)(0 + _row + step15))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 106;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(512);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemscounter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 107;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(1024);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 108;BA.debugLine="Dim ALRTYPE As String = Record.GetString(\"alert";
Debug.ShouldStop(2048);
_alrtype = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("alert_type")));Debug.locals.put("ALRTYPE", _alrtype);Debug.locals.put("ALRTYPE", _alrtype);
 BA.debugLineNum = 109;BA.debugLine="listAlerts.Add( CreateAlertItem( nRows, Record,";
Debug.ShouldStop(4096);
__ref.getField(false,"_listalerts" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_createalertitem" /*RemoteObject*/ ,(Object)(_nrows),(Object)(_record),(Object)(__ref.getField(false,"_listalerts" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(_height),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.BitmapDrawable"), structalerts.__c.getField(false,"Null"))).getObject()),(Object)((_alrtype)));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 112;BA.debugLine="Record.Close";
Debug.ShouldStop(32768);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttasks(RemoteObject __ref,RemoteObject _clear) throws Exception{
try {
		Debug.PushSubsStack("StartTasks (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("starttasks")) { return __ref.runUserSub(false, "structalerts","starttasks", __ref, _clear);}
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _cdate = RemoteObject.createImmutable("");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _nrows = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _alrtype = RemoteObject.createImmutable("");
Debug.locals.put("clear", _clear);
 BA.debugLineNum = 120;BA.debugLine="Public Sub StartTasks(clear As Boolean) As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="If (clear) Then";
Debug.ShouldStop(16777216);
if ((_clear).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 122;BA.debugLine="listTasks.Clear";
Debug.ShouldStop(33554432);
__ref.getField(false,"_listtasks" /*RemoteObject*/ ).runVoidMethod ("_clear");
 };
 BA.debugLineNum = 128;BA.debugLine="Dim height As Int = 65dip";
Debug.ShouldStop(-2147483648);
_height = structalerts.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 65)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 129;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1);
if ((structalerts._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 130;BA.debugLine="height = 120dip";
Debug.ShouldStop(2);
_height = structalerts.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)));Debug.locals.put("height", _height);
 };
 BA.debugLineNum = 133;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(16);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 134;BA.debugLine="Dim cDate As String = Utils.GetLastWeekDate";
Debug.ShouldStop(32);
_cdate = structalerts._utils.runMethod(true,"_getlastweekdate" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("cDate", _cdate);Debug.locals.put("cDate", _cdate);
 BA.debugLineNum = 136;BA.debugLine="Dim SQL As String = $\"select distinct ifnull(a.ta";
Debug.ShouldStop(128);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct ifnull(a.tagcode,'') as tagcode, ifnull(a.title,'') as title,\n"),RemoteObject.createImmutable("			ifnull(a.date_verification,'') as date_verification, a.status_id, a.kind_data, a.id,\n"),RemoteObject.createImmutable("			(select obs from dta_alerts_images where tagcode=a.tagcode) as obs,\n"),RemoteObject.createImmutable("			(select imagename from dta_alerts_images where tagcode=a.tagcode) as imagename,\n"),RemoteObject.createImmutable("			a.alert_type from dta_alerts as a\n"),RemoteObject.createImmutable("			where a.alert_visible=1 \n"),RemoteObject.createImmutable("				and a.user_tagcode='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((structalerts._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("				and a.alert_type != 'ALRTTYP_NOTIFY'\n"),RemoteObject.createImmutable("				and a.alert_type != 'ALRTTYP_EMAIL'\n"),RemoteObject.createImmutable("				and a.alert_type != 'ALRTTYP_SMS'\n"),RemoteObject.createImmutable("				and a.alert_type != 'ALRTTYP_ALERT'\n"),RemoteObject.createImmutable("				and a.active=1 \n"),RemoteObject.createImmutable("				and a.date_alert>='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cdate))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 150;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(2097152);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), structalerts._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 152;BA.debugLine="Dim nRows As Int = Record.RowCount";
Debug.ShouldStop(8388608);
_nrows = _record.runMethod(true,"getRowCount");Debug.locals.put("nRows", _nrows);Debug.locals.put("nRows", _nrows);
 BA.debugLineNum = 153;BA.debugLine="ShareCode.TasksAlertsCount = nRows";
Debug.ShouldStop(16777216);
structalerts._sharecode._tasksalertscount /*RemoteObject*/  = _nrows;
 BA.debugLineNum = 154;BA.debugLine="If nRows > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_nrows,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 155;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(67108864);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step15 > 0 && _row <= limit15) || (step15 < 0 && _row >= limit15) ;_row = ((int)(0 + _row + step15))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 156;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(134217728);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemscounter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 157;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(268435456);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 158;BA.debugLine="Dim ALRTYPE As String = Record.GetString(\"alert";
Debug.ShouldStop(536870912);
_alrtype = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("alert_type")));Debug.locals.put("ALRTYPE", _alrtype);Debug.locals.put("ALRTYPE", _alrtype);
 BA.debugLineNum = 159;BA.debugLine="listTasks.Add( CreateTaskItem( nRows, Record, l";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_listtasks" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.structalerts.class, "_createtaskitem" /*RemoteObject*/ ,(Object)(_nrows),(Object)(_record),(Object)(__ref.getField(false,"_listtasks" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(_height),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.BitmapDrawable"), structalerts.__c.getField(false,"Null"))).getObject()),(Object)((_alrtype)));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 162;BA.debugLine="Record.Close";
Debug.ShouldStop(2);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _taskitemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TaskItemClick (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,770);
if (RapidSub.canDelegate("taskitemclick")) { return __ref.runUserSub(false, "structalerts","taskitemclick", __ref, _index, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _val = RemoteObject.createImmutable(0);
RemoteObject _imgdata = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._imageviewdata");
RemoteObject _imglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _nrows = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 770;BA.debugLine="Public Sub TaskItemClick (Index As Int, Value As O";
Debug.ShouldStop(2);
 BA.debugLineNum = 771;BA.debugLine="Dim pnl As Panel = listTasks.GetPanel(Index)";
Debug.ShouldStop(4);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_listtasks" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 773;BA.debugLine="Dim info As List = Regex.Split(\"\\|\", pnl.tag )";
Debug.ShouldStop(16);
_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_info = structalerts.__c.runMethod(false, "ArrayToList", (Object)(structalerts.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_pnl.runMethod(false,"getTag"))))));Debug.locals.put("info", _info);Debug.locals.put("info", _info);
 BA.debugLineNum = 774;BA.debugLine="Dim tagcode As String = info.Get(0)";
Debug.ShouldStop(32);
_tagcode = BA.ObjectToString(_info.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 775;BA.debugLine="Dim val As Int = info.Get(1)";
Debug.ShouldStop(64);
_val = BA.numberCast(int.class, _info.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 777;BA.debugLine="If (val = 0) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_val,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 778;BA.debugLine="Dim imgdata As ImageViewData = Types.MakeImageVi";
Debug.ShouldStop(512);
_imgdata = structalerts._types.runMethod(false,"_makeimageviewdataclear" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("imgdata", _imgdata);Debug.locals.put("imgdata", _imgdata);
 BA.debugLineNum = 779;BA.debugLine="Dim imgList As List";
Debug.ShouldStop(1024);
_imglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("imgList", _imglist);
 BA.debugLineNum = 780;BA.debugLine="imgList.Initialize";
Debug.ShouldStop(2048);
_imglist.runVoidMethod ("Initialize");
 BA.debugLineNum = 781;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(4096);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 782;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(8192);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 783;BA.debugLine="Dim SQL As String = $\"select id,tagcode,imageb64";
Debug.ShouldStop(16384);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select id,tagcode,imageb64,imagename\n"),RemoteObject.createImmutable("							from dta_alerts_images\n"),RemoteObject.createImmutable("							where 1=1 and tagcode='"),structalerts.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 786;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(131072);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), structalerts._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 788;BA.debugLine="Dim nRows As Int = Record.RowCount";
Debug.ShouldStop(524288);
_nrows = _record.runMethod(true,"getRowCount");Debug.locals.put("nRows", _nrows);Debug.locals.put("nRows", _nrows);
 BA.debugLineNum = 789;BA.debugLine="If nRows > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_nrows,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 790;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(2097152);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
for (;(step15 > 0 && _row <= limit15) || (step15 < 0 && _row >= limit15) ;_row = ((int)(0 + _row + step15))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 791;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(4194304);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemscounter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 792;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(8388608);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 793;BA.debugLine="Dim imgdata As ImageViewData = Types.MakeImage";
Debug.ShouldStop(16777216);
_imgdata = structalerts._types.runMethod(false,"_makeimageviewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imageb64")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")))));Debug.locals.put("imgdata", _imgdata);Debug.locals.put("imgdata", _imgdata);
 BA.debugLineNum = 794;BA.debugLine="imgList.Add(imgdata)";
Debug.ShouldStop(33554432);
_imglist.runVoidMethod ("Add",(Object)((_imgdata)));
 }
}Debug.locals.put("Row", _row);
;
 }else {
 BA.debugLineNum = 797;BA.debugLine="imgList.Add(imgdata)";
Debug.ShouldStop(268435456);
_imglist.runVoidMethod ("Add",(Object)((_imgdata)));
 };
 BA.debugLineNum = 799;BA.debugLine="Record.Close";
Debug.ShouldStop(1073741824);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 801;BA.debugLine="If Utils.NNE(imgdata.b64) Then";
Debug.ShouldStop(1);
if (structalerts._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_imgdata.getField(true,"b64" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 802;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(2);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 803;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(4);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 804;BA.debugLine="Filter.getShowImageViewListDialog(Me, imgList)";
Debug.ShouldStop(8);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getshowimageviewlistdialog" /*void*/ ,(Object)(__ref),(Object)(_imglist));
 };
 };
 BA.debugLineNum = 808;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatetaskitemview(RemoteObject __ref,RemoteObject _pnl,RemoteObject _tagcode,RemoteObject _sts,RemoteObject _active,RemoteObject _newobject) throws Exception{
try {
		Debug.PushSubsStack("updateTaskItemView (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,942);
if (RapidSub.canDelegate("updatetaskitemview")) { __ref.runUserSub(false, "structalerts","updatetaskitemview", __ref, _pnl, _tagcode, _sts, _active, _newobject); return;}
ResumableSub_updateTaskItemView rsub = new ResumableSub_updateTaskItemView(null,__ref,_pnl,_tagcode,_sts,_active,_newobject);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_updateTaskItemView extends BA.ResumableSub {
public ResumableSub_updateTaskItemView(xevolution.vrcg.devdemov2400.structalerts parent,RemoteObject __ref,RemoteObject _pnl,RemoteObject _tagcode,RemoteObject _sts,RemoteObject _active,RemoteObject _newobject) {
this.parent = parent;
this.__ref = __ref;
this._pnl = _pnl;
this._tagcode = _tagcode;
this._sts = _sts;
this._active = _active;
this._newobject = _newobject;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.structalerts parent;
RemoteObject _pnl;
RemoteObject _tagcode;
RemoteObject _sts;
RemoteObject _active;
RemoteObject _newobject;
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _this_b = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xstatebutton");
RemoteObject _cdate = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _group_tags = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _alertimage = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _imageb64 = RemoteObject.createImmutable("");
RemoteObject _imagename = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("updateTaskItemView (structalerts) ","structalerts",53,__ref.getField(false, "ba"),__ref,942);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("TagCode", _tagcode);
Debug.locals.put("sts", _sts);
Debug.locals.put("active", _active);
Debug.locals.put("NewObject", _newobject);
 BA.debugLineNum = 944;BA.debugLine="ProgressDialogShow2(ShareCode.AvisoAguarde, False";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("ProgressDialogShow2",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(parent._sharecode._avisoaguarde /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 945;BA.debugLine="For Each v As View In Pnl.GetAllViewsRecursive";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//for
this.state = 8;
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
group2 = _pnl.runMethod(false,"GetAllViewsRecursive");
index2 = 0;
groupLen2 = group2.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("v", _v);
this.state = 32;
if (true) break;

case 32:
//C
this.state = 8;
if (index2 < groupLen2) {
this.state = 3;
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), group2.runMethod(false,"Get",index2));}
if (true) break;

case 33:
//C
this.state = 32;
index2++;
Debug.locals.put("v", _v);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 946;BA.debugLine="If (v.tag Is B4XStateButton) Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean("i",_v.runMethod(false,"getTag"), RemoteObject.createImmutable("xevolution.vrcg.devdemov2400.b4xstatebutton")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 947;BA.debugLine="Dim this_b As B4XStateButton = v.tag";
Debug.ShouldStop(262144);
_this_b = (_v.runMethod(false,"getTag"));Debug.locals.put("this_b", _this_b);Debug.locals.put("this_b", _this_b);
 BA.debugLineNum = 948;BA.debugLine="this_b.AllowClick = False";
Debug.ShouldStop(524288);
_this_b.runClassMethod (xevolution.vrcg.devdemov2400.b4xstatebutton.class, "_setallowclick" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 7:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("v", _v);
;
 BA.debugLineNum = 952;BA.debugLine="Dim cDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(8388608);
_cdate = parent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("cDate", _cdate);Debug.locals.put("cDate", _cdate);
 BA.debugLineNum = 953;BA.debugLine="Dim sSQL As String = $\"update dta_alerts set stat";
Debug.ShouldStop(16777216);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_alerts set status_id='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sts))),RemoteObject.createImmutable("', active='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_active))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("							date_verification='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cdate))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("							where tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 956;BA.debugLine="Utils.SaveSQLToLog(\"CLAItemButton_StateClick\",sSQ";
Debug.ShouldStop(134217728);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CLAItemButton_StateClick")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 959;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1073741824);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 960;BA.debugLine="params.Initialize";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 961;BA.debugLine="params.Clear";
Debug.ShouldStop(1);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 962;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 963;BA.debugLine="params.Put(\"tagcode\", Pnl.Tag)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)(_pnl.runMethod(false,"getTag")));
 BA.debugLineNum = 964;BA.debugLine="params.Put(\"date_verification\", cDate)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_verification"))),(Object)((_cdate)));
 BA.debugLineNum = 965;BA.debugLine="params.Put(\"status_id\", sts)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)((_sts)));
 BA.debugLineNum = 966;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 967;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 968;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 969;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 970;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 971;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 972;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 973;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(4096);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/alert/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 974;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(8192);
if (true) break;

case 9:
//if
this.state = 14;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 975;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 977;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(65536);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 978;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(131072);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 980;BA.debugLine="Sleep(500)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structalerts", "updatetaskitemview"),BA.numberCast(int.class, 500));
this.state = 34;
return;
case 34:
//C
this.state = 15;
;
 BA.debugLineNum = 982;BA.debugLine="If Utils.NNE(NewObject) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 15:
//if
this.state = 31;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_newobject)).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 983;BA.debugLine="Dim group_tags As String = \"\"";
Debug.ShouldStop(4194304);
_group_tags = BA.ObjectToString("");Debug.locals.put("group_tags", _group_tags);Debug.locals.put("group_tags", _group_tags);
 BA.debugLineNum = 984;BA.debugLine="Dim Continua As Boolean = False";
Debug.ShouldStop(8388608);
_continua = parent.__c.getField(true,"False");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 985;BA.debugLine="Dim AlertImage As Cursor = Starter.LocalSQLEVC.E";
Debug.ShouldStop(16777216);
_alertimage = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_alertimage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select a.imageb64, a.imagename, \n"),RemoteObject.createImmutable("											a.uniquekey, ifnull(b.group_tags, '') as group_tags\n"),RemoteObject.createImmutable("											from dta_alerts_images as a\n"),RemoteObject.createImmutable("											inner join dta_alerts as b on (b.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("											where a.tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'"))))));Debug.locals.put("AlertImage", _alertimage);
 BA.debugLineNum = 990;BA.debugLine="If (AlertImage.RowCount >= 1) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 18:
//if
this.state = 21;
if ((RemoteObject.solveBoolean("g",_alertimage.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 991;BA.debugLine="AlertImage.Position = 0";
Debug.ShouldStop(1073741824);
_alertimage.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 992;BA.debugLine="Dim imageb64 As String = Utils.IfNullOrEmpty(Al";
Debug.ShouldStop(-2147483648);
_imageb64 = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_alertimage.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imageb64")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("imageb64", _imageb64);Debug.locals.put("imageb64", _imageb64);
 BA.debugLineNum = 993;BA.debugLine="Dim imagename As String = Utils.IfNullOrEmpty(A";
Debug.ShouldStop(1);
_imagename = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_alertimage.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("imagename")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("imagename", _imagename);Debug.locals.put("imagename", _imagename);
 BA.debugLineNum = 995;BA.debugLine="Dim group_tags As String = Utils.IfNullOrEmpty(";
Debug.ShouldStop(4);
_group_tags = parent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_alertimage.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("group_tags")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("group_tags", _group_tags);Debug.locals.put("group_tags", _group_tags);
 BA.debugLineNum = 997;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
Debug.ShouldStop(16);
_maxid = RemoteObject.solve(new RemoteObject[] {parent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dta_objects_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 998;BA.debugLine="Dim sSQL As String = $\"insert into dta_objects_";
Debug.ShouldStop(32);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_objects_images (id, object_tagcode, image, filename, request_tagcode, origin, title, sess_user) values\n"),RemoteObject.createImmutable("							("),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newobject))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imageb64))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagename))),RemoteObject.createImmutable("', '__DUMMY__', 1, '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_group_tags))),RemoteObject.createImmutable("', '"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1000;BA.debugLine="Continua = Utils.SaveSQLToLog(\"CLAItemButton_St";
Debug.ShouldStop(128);
_continua = parent._utils.runMethod(true,"_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CLAItemButton_StateClick")),(Object)(_ssql),(Object)(_tagcode));Debug.locals.put("Continua", _continua);
 if (true) break;
;
 BA.debugLineNum = 1003;BA.debugLine="If (Continua) Then";
Debug.ShouldStop(1024);

case 21:
//if
this.state = 30;
if ((_continua).<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1004;BA.debugLine="Dim sSQL As String = $\"update dta_alerts_images";
Debug.ShouldStop(2048);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_alerts_images set iu_tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newobject))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("							assigned=1, assigned_type='TASSGT_OBJECTS' \n"),RemoteObject.createImmutable("							where tagcode='"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1007;BA.debugLine="Utils.SaveSQLToLog(\"AssignImageToObject\",sSQL,";
Debug.ShouldStop(16384);
parent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("AssignImageToObject")),(Object)(_ssql),(Object)(_tagcode));
 BA.debugLineNum = 1009;BA.debugLine="Dim params As Map";
Debug.ShouldStop(65536);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1010;BA.debugLine="params.Initialize";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1011;BA.debugLine="params.Clear";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1012;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1013;BA.debugLine="params.Put(\"tagcode\", TagCode)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 1014;BA.debugLine="params.Put(\"iu_tagcode\", NewObject)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("iu_tagcode"))),(Object)((_newobject)));
 BA.debugLineNum = 1015;BA.debugLine="params.Put(\"assigned_type\", \"TASSGT_OBJECTS\")";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("assigned_type"))),(Object)((RemoteObject.createImmutable("TASSGT_OBJECTS"))));
 BA.debugLineNum = 1016;BA.debugLine="params.Put(\"sess_user\", ShareCode.SESS_OPER_Use";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sess_user"))),(Object)((parent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 1017;BA.debugLine="params.Put(\"group_tags\", group_tags)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("group_tags"))),(Object)((_group_tags)));
 BA.debugLineNum = 1018;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1019;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1020;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1021;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1022;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1023;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1024;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1025;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_D";
Debug.ShouldStop(1);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/alertimg/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 1026;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(2);
if (true) break;

case 24:
//if
this.state = 29;
if (parent.__c.runMethod(true,"Not",(Object)(parent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 1027;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
Debug.ShouldStop(4);
parent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(__ref),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1029;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(16);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1030;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
Debug.ShouldStop(32);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_url),(Object)(parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 1032;BA.debugLine="Sleep(500)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "structalerts", "updatetaskitemview"),BA.numberCast(int.class, 500));
this.state = 35;
return;
case 35:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 1035;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1036;BA.debugLine="CallSubDelayed2(Alerts, \"listsTabPanel_PageSelect";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((parent._alerts.getObject())),(Object)(BA.ObjectToString("listsTabPanel_PageSelected2")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1038;BA.debugLine="End Sub";
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
}