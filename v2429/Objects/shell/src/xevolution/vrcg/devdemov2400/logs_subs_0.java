package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class logs_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private nid As Int = 1";
logs._nid = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 7;BA.debugLine="Private GPS As GPS";
logs._gps = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 8;BA.debugLine="Private Tracking As Boolean";
logs._tracking = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 9;BA.debugLine="Private LastUpdateTime As Long";
logs._lastupdatetime = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 10;BA.debugLine="Private lock As PhoneWakeState";
logs._lock = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
 //BA.debugLineNum = 11;BA.debugLine="Private bigCounter As Int = 0";
logs._bigcounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (logs) ","logs",42,logs.processBA,logs.mostCurrent,14);
if (RapidSub.canDelegate("service_create")) { return xevolution.vrcg.devdemov2400.logs.remoteMe.runUserSub(false, "logs","service_create");}
 BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Service.AutomaticForegroundMode = Service.AUTOMAT";
Debug.ShouldStop(16384);
logs.mostCurrent._service.setField ("AutomaticForegroundMode",logs.mostCurrent._service.getField(true,"AUTOMATIC_FOREGROUND_NEVER"));
 BA.debugLineNum = 16;BA.debugLine="lock.PartialLock";
Debug.ShouldStop(32768);
logs._lock.runVoidMethod ("PartialLock",logs.processBA);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Service_Start (logs) ","logs",42,logs.processBA,logs.mostCurrent,19);
if (RapidSub.canDelegate("service_start")) { return xevolution.vrcg.devdemov2400.logs.remoteMe.runUserSub(false, "logs","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 19;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",logs.mostCurrent.__c.runMethod(true,"Not",(Object)(logs.mostCurrent._starter._app_reset_install /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",logs.mostCurrent.__c.runMethod(true,"Not",(Object)(logs.mostCurrent._starter._app_in_execution /*RemoteObject*/ )))) { 
 BA.debugLineNum = 21;BA.debugLine="StartServiceAt(Me, DateTime.Now + 600 * 1000, Tr";
Debug.ShouldStop(1048576);
logs.mostCurrent.__c.runVoidMethod ("StartServiceAt",logs.processBA,(Object)(logs.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {logs.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(600),RemoteObject.createImmutable(1000)}, "+*",1, 2)),(Object)(logs.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 22;BA.debugLine="UpdateServer";
Debug.ShouldStop(2097152);
_updateserver();
 }else {
 BA.debugLineNum = 24;BA.debugLine="Service.StopAutomaticForeground";
Debug.ShouldStop(8388608);
logs.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 };
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updateserver() throws Exception{
try {
		Debug.PushSubsStack("UpdateServer (logs) ","logs",42,logs.processBA,logs.mostCurrent,28);
if (RapidSub.canDelegate("updateserver")) { xevolution.vrcg.devdemov2400.logs.remoteMe.runUserSub(false, "logs","updateserver"); return;}
ResumableSub_UpdateServer rsub = new ResumableSub_UpdateServer(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateServer extends BA.ResumableSub {
public ResumableSub_UpdateServer(xevolution.vrcg.devdemov2400.logs parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.logs parent;
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _status = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateServer (logs) ","logs",42,logs.processBA,logs.mostCurrent,28);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 29;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._app_reset_install /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._app_in_execution /*RemoteObject*/ )))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 30;BA.debugLine="Dim Job As HttpJob = Utils.CallJobAPI(ShareCode.";
Debug.ShouldStop(536870912);
_job = parent.mostCurrent._utils.runMethod(false,"_calljobapi" /*RemoteObject*/ ,logs.processBA,(Object)(parent.mostCurrent._sharecode._app_logsupload /*RemoteObject*/ ),(Object)(parent.mostCurrent._utils.runMethod(false,"_logs2server" /*RemoteObject*/ ,logs.processBA)),(Object)(logs.getObject()),(Object)(RemoteObject.createImmutable("Logs")));Debug.locals.put("Job", _job);Debug.locals.put("Job", _job);
 BA.debugLineNum = 31;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", logs.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "logs", "updateserver"), (_job));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 32;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 15;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 33;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
Debug.ShouldStop(1);
_status = parent.mostCurrent._utils.runMethod(true,"_jobapistatus" /*RemoteObject*/ ,logs.processBA,(Object)(_job));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 34;BA.debugLine="If Status = 1 Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 39;BA.debugLine="Log(\"Não foi possível actualizar o Servidor\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6143589387",RemoteObject.createImmutable("Não foi possível actualizar o Servidor"),0);
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 41;BA.debugLine="Job.Release";
Debug.ShouldStop(256);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _job) throws Exception{
}
}