package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class comms_subs_0 {


public static void  _checkwebaccess() throws Exception{
try {
		Debug.PushSubsStack("CheckWebAccess (comms) ","comms",2,comms.processBA,comms.mostCurrent,51);
if (RapidSub.canDelegate("checkwebaccess")) { xevolution.vrcg.devdemov2400.comms.remoteMe.runUserSub(false, "comms","checkwebaccess"); return;}
ResumableSub_CheckWebAccess rsub = new ResumableSub_CheckWebAccess(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckWebAccess extends BA.ResumableSub {
public ResumableSub_CheckWebAccess(xevolution.vrcg.devdemov2400.comms parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.comms parent;
RemoteObject _starttime = RemoteObject.createImmutable(0L);
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _prams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _endtime = RemoteObject.createImmutable(0L);
RemoteObject _valref = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckWebAccess (comms) ","comms",2,comms.processBA,comms.mostCurrent,51);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 52;BA.debugLine="Dim startTime As Long = Utils.GetCurrentTicks";
Debug.ShouldStop(524288);
_starttime = BA.numberCast(long.class, parent.mostCurrent._utils.runMethod(true,"_getcurrentticks" /*RemoteObject*/ ,comms.processBA));Debug.locals.put("startTime", _starttime);Debug.locals.put("startTime", _starttime);
 BA.debugLineNum = 53;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(1048576);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/timming")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 54;BA.debugLine="Dim Prams As Map";
Debug.ShouldStop(2097152);
_prams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Prams", _prams);
 BA.debugLineNum = 55;BA.debugLine="Prams.Initialize";
Debug.ShouldStop(4194304);
_prams.runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="Prams.Put(\"_first\", Utils.Bool2Int(Starter.FirstI";
Debug.ShouldStop(8388608);
_prams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_first"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,comms.processBA,(Object)(parent.mostCurrent._starter._firstinstall /*RemoteObject*/ )))));
 BA.debugLineNum = 57;BA.debugLine="Prams.Put(\"authorization\", ShareCode.APP_Authoriz";
Debug.ShouldStop(16777216);
_prams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 58;BA.debugLine="Prams.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(33554432);
_prams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(536870912);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 63;BA.debugLine="JSON.Initialize(Prams)";
Debug.ShouldStop(1073741824);
_json.runVoidMethod ("Initialize",(Object)(_prams));
 BA.debugLineNum = 64;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(-2147483648);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 65;BA.debugLine="Starter.WEBISOK = False";
Debug.ShouldStop(1);
parent.mostCurrent._starter._webisok /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 67;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 1:
//try
this.state = 18;
this.catchState = 17;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 17;
 BA.debugLineNum = 68;BA.debugLine="Dim res  As ResumableSub = TestTheServer(Server";
Debug.ShouldStop(8);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _testtheserver(_serveraddress,_data);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 69;BA.debugLine="Wait For(res) complete (finished As Boolean)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", comms.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "comms", "checkwebaccess"), _res);
this.state = 19;
return;
case 19:
//C
this.state = 4;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 70;BA.debugLine="If finished Then";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 15;
if (_finished.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 71;BA.debugLine="Dim endTime As Long = Utils.GetCurrentTicks";
Debug.ShouldStop(64);
_endtime = BA.numberCast(long.class, parent.mostCurrent._utils.runMethod(true,"_getcurrentticks" /*RemoteObject*/ ,comms.processBA));Debug.locals.put("endTime", _endtime);Debug.locals.put("endTime", _endtime);
 BA.debugLineNum = 73;BA.debugLine="If ShareCode.IntensiveWorkLoad Then";
Debug.ShouldStop(256);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent._sharecode._intensiveworkload /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 74;BA.debugLine="Dim valRef As String = \" / Ref = 5000\"";
Debug.ShouldStop(512);
_valref = BA.ObjectToString(" / Ref = 5000");Debug.locals.put("valRef", _valref);Debug.locals.put("valRef", _valref);
 BA.debugLineNum = 75;BA.debugLine="Starter.WEBISOK = ((endTime - startTime) < 500";
Debug.ShouldStop(1024);
parent.mostCurrent._starter._webisok /*RemoteObject*/  = BA.ObjectToBoolean((RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {_endtime,_starttime}, "-",1, 2)),BA.numberCast(long.class, 5000))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 77;BA.debugLine="Starter.WEBISOK = ((endTime - startTime) < 350";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._webisok /*RemoteObject*/  = BA.ObjectToBoolean((RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {_endtime,_starttime}, "-",1, 2)),BA.numberCast(long.class, 3500))));
 BA.debugLineNum = 78;BA.debugLine="Dim valRef As String = \" / Ref = 3500\"";
Debug.ShouldStop(8192);
_valref = BA.ObjectToString(" / Ref = 3500");Debug.locals.put("valRef", _valref);Debug.locals.put("valRef", _valref);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 84;BA.debugLine="Log(\"Erro de identificação do servidor\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62490401",RemoteObject.createImmutable("Erro de identificação do servidor"),0);
 if (true) break;

case 15:
//C
this.state = 18;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 87;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62490404",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",comms.processBA)),0);
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 90;BA.debugLine="ShareCode.APP_WORKING_LOCAL = Not(Starter.WEBISOK";
Debug.ShouldStop(33554432);
parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/  = parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._webisok /*RemoteObject*/ ));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",comms.processBA, e0.toString());}
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
public static RemoteObject  _isonline() throws Exception{
try {
		Debug.PushSubsStack("IsOnline (comms) ","comms",2,comms.processBA,comms.mostCurrent,118);
if (RapidSub.canDelegate("isonline")) { return xevolution.vrcg.devdemov2400.comms.remoteMe.runUserSub(false, "comms","isonline");}
ResumableSub_IsOnline rsub = new ResumableSub_IsOnline(null);
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
public static class ResumableSub_IsOnline extends BA.ResumableSub {
public ResumableSub_IsOnline(xevolution.vrcg.devdemov2400.comms parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.comms parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _error = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("IsOnline (comms) ","comms",2,comms.processBA,comms.mostCurrent,118);
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
 BA.debugLineNum = 120;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(8388608);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 121;BA.debugLine="Dim Response, Error As StringBuilder";
Debug.ShouldStop(16777216);
_response = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Response", _response);
_error = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Error", _error);
 BA.debugLineNum = 122;BA.debugLine="Response.Initialize";
Debug.ShouldStop(33554432);
_response.runVoidMethod ("Initialize");
 BA.debugLineNum = 123;BA.debugLine="Error.Initialize";
Debug.ShouldStop(67108864);
_error.runVoidMethod ("Initialize");
 BA.debugLineNum = 124;BA.debugLine="Try";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//try
this.state = 18;
this.catchState = 17;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 17;
 BA.debugLineNum = 126;BA.debugLine="p.Shell(\"ping -q -c 1 -W 2 8.8.8.8\",Null,Respons";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("Shell",(Object)(BA.ObjectToString("ping -q -c 1 -W 2 8.8.8.8")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)((_response.getObject())),(Object)((_error.getObject())));
 BA.debugLineNum = 128;BA.debugLine="If Error.ToString = \"\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_error.runMethod(true,"ToString"),BA.ObjectToString(""))) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 130;BA.debugLine="If Response.ToString.Contains(\" 100% packet los";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 12;
if (_response.runMethod(true,"ToString").runMethod(true,"contains",(Object)(RemoteObject.createImmutable(" 100% packet loss"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else 
{ BA.debugLineNum = 133;BA.debugLine="Else If Response.ToString.Contains(\" 0% packet";
Debug.ShouldStop(16);
if (_response.runMethod(true,"ToString").runMethod(true,"contains",(Object)(RemoteObject.createImmutable(" 0% packet loss"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}}
if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 131;BA.debugLine="Log(\"Ping ran but no response \" & Response.ToS";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62621453",RemoteObject.concat(RemoteObject.createImmutable("Ping ran but no response "),_response.runMethod(true,"ToString")),0);
 BA.debugLineNum = 132;BA.debugLine="Return False";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 134;BA.debugLine="Log(\"Ping Google OK\")";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62621456",RemoteObject.createImmutable("Ping Google OK"),0);
 BA.debugLineNum = 135;BA.debugLine="Return True";
Debug.ShouldStop(64);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 139;BA.debugLine="Return False";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 15:
//C
this.state = 18;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 142;BA.debugLine="Log(\"Error pinging Google DNS: \" & Error.ToStrin";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62621464",RemoteObject.concat(RemoteObject.createImmutable("Error pinging Google DNS: "),_error.runMethod(true,"ToString")),0);
 BA.debugLineNum = 143;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",comms.processBA, e0.toString());}
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private nid As Int = 2";
comms._nid = BA.numberCast(int.class, 2);
 //BA.debugLineNum = 8;BA.debugLine="Private lock As PhoneWakeState";
comms._lock = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
 //BA.debugLineNum = 9;BA.debugLine="Private bigCounter As Int = 0";
comms._bigcounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 10;BA.debugLine="Public AlreadyStarted As Boolean = False";
comms._alreadystarted = comms.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (comms) ","comms",2,comms.processBA,comms.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) { return xevolution.vrcg.devdemov2400.comms.remoteMe.runUserSub(false, "comms","service_create");}
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (comms) ","comms",2,comms.processBA,comms.mostCurrent,35);
if (RapidSub.canDelegate("service_destroy")) { return xevolution.vrcg.devdemov2400.comms.remoteMe.runUserSub(false, "comms","service_destroy");}
 BA.debugLineNum = 35;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Service.StopAutomaticForeground";
Debug.ShouldStop(8);
comms.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (comms) ","comms",2,comms.processBA,comms.mostCurrent,17);
if (RapidSub.canDelegate("service_start")) { return xevolution.vrcg.devdemov2400.comms.remoteMe.runUserSub(false, "comms","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 20;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",comms.mostCurrent.__c.runMethod(true,"Not",(Object)(comms.mostCurrent._starter._app_reset_install /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",comms.mostCurrent.__c.runMethod(true,"Not",(Object)(comms.mostCurrent._starter._app_in_execution /*RemoteObject*/ )))) { 
 BA.debugLineNum = 22;BA.debugLine="UpdateData";
Debug.ShouldStop(2097152);
_updatedata();
 };
 BA.debugLineNum = 24;BA.debugLine="Service.StopAutomaticForeground";
Debug.ShouldStop(8388608);
comms.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 25;BA.debugLine="AlreadyStarted = True";
Debug.ShouldStop(16777216);
comms._alreadystarted = comms.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 27;BA.debugLine="If Not(Starter.StopCommsCheck) Then";
Debug.ShouldStop(67108864);
if (comms.mostCurrent.__c.runMethod(true,"Not",(Object)(comms.mostCurrent._starter._stopcommscheck /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 28;BA.debugLine="StartServiceAt(Me, DateTime.Now + 10 * 1000, Tru";
Debug.ShouldStop(134217728);
comms.mostCurrent.__c.runVoidMethod ("StartServiceAt",comms.processBA,(Object)(comms.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {comms.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(10),RemoteObject.createImmutable(1000)}, "+*",1, 2)),(Object)(comms.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 29;BA.debugLine="UpdateData";
Debug.ShouldStop(268435456);
_updatedata();
 };
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _testtheserver(RemoteObject _serveraddress,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("TestTheServer (comms) ","comms",2,comms.processBA,comms.mostCurrent,94);
if (RapidSub.canDelegate("testtheserver")) { return xevolution.vrcg.devdemov2400.comms.remoteMe.runUserSub(false, "comms","testtheserver", _serveraddress, _data);}
ResumableSub_TestTheServer rsub = new ResumableSub_TestTheServer(null,_serveraddress,_data);
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
public static class ResumableSub_TestTheServer extends BA.ResumableSub {
public ResumableSub_TestTheServer(xevolution.vrcg.devdemov2400.comms parent,RemoteObject _serveraddress,RemoteObject _data) {
this.parent = parent;
this._serveraddress = _serveraddress;
this._data = _data;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.comms parent;
RemoteObject _serveraddress;
RemoteObject _data;
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TestTheServer (comms) ","comms",2,comms.processBA,comms.mostCurrent,94);
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
Debug.locals.put("ServerAddress", _serveraddress);
Debug.locals.put("data", _data);
 BA.debugLineNum = 97;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 98;BA.debugLine="Dim Status As Int = 0";
Debug.ShouldStop(2);
_status = BA.numberCast(int.class, 0);Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 99;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 100;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(8);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,comms.processBA,(Object)(BA.ObjectToString("")),(Object)(comms.getObject()));
 BA.debugLineNum = 101;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(16);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 102;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(32);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 103;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", comms.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "comms", "testtheserver"), (_job));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 104;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 105;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
Debug.ShouldStop(256);
_status = parent.mostCurrent._utils.runMethod(true,"_jobapistatus" /*RemoteObject*/ ,comms.processBA,(Object)(_job));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 107;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62555917",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 108;BA.debugLine="Log(\"OFFLINE\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62555918",RemoteObject.createImmutable("OFFLINE"),0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 110;BA.debugLine="Job.Release";
Debug.ShouldStop(8192);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 112;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62555922",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",comms.processBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 114;BA.debugLine="If Utils.NE(Status) Then Status = 0";
Debug.ShouldStop(131072);

case 12:
//if
this.state = 17;
this.catchState = 0;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,comms.processBA,(Object)(BA.NumberToString(_status))).<Boolean>get().booleanValue()) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
_status = BA.numberCast(int.class, 0);Debug.locals.put("Status", _status);
if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 115;BA.debugLine="Return (Status >= 1)";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(((RemoteObject.solveBoolean("g",_status,BA.numberCast(double.class, 1))))));return;};
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",comms.processBA, e0.toString());}
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
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static RemoteObject  _updatedata() throws Exception{
try {
		Debug.PushSubsStack("UpdateData (comms) ","comms",2,comms.processBA,comms.mostCurrent,39);
if (RapidSub.canDelegate("updatedata")) { return xevolution.vrcg.devdemov2400.comms.remoteMe.runUserSub(false, "comms","updatedata");}
 BA.debugLineNum = 39;BA.debugLine="Public Sub UpdateData";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="If Not((Starter.RunUpdate) Or (Starter.FirstInsta";
Debug.ShouldStop(256);
if (comms.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",(comms.mostCurrent._starter._runupdate /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",(comms.mostCurrent._starter._firstinstall /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 43;BA.debugLine="CheckWebAccess";
Debug.ShouldStop(1024);
_checkwebaccess();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",comms.processBA, e5.toString()); BA.debugLineNum = 45;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
comms.mostCurrent.__c.runVoidMethod ("LogImpl","62424838",BA.ObjectToString(comms.mostCurrent.__c.runMethod(false,"LastException",comms.processBA)),0);
 };
 };
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}