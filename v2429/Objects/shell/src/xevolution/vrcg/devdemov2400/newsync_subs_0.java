package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class newsync_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (newsync) ","newsync",45,newsync.mostCurrent.activityBA,newsync.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.newsync.remoteMe.runUserSub(false, "newsync","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (newsync) ","newsync",45,newsync.mostCurrent.activityBA,newsync.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.newsync.remoteMe.runUserSub(false, "newsync","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (newsync) ","newsync",45,newsync.mostCurrent.activityBA,newsync.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.newsync.remoteMe.runUserSub(false, "newsync","activity_resume");}
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _getlistfromserver() throws Exception{
try {
		Debug.PushSubsStack("GetListfromServer (newsync) ","newsync",45,newsync.mostCurrent.activityBA,newsync.mostCurrent,32);
if (RapidSub.canDelegate("getlistfromserver")) { return xevolution.vrcg.devdemov2400.newsync.remoteMe.runUserSub(false, "newsync","getlistfromserver");}
ResumableSub_GetListfromServer rsub = new ResumableSub_GetListfromServer(null);
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
public static class ResumableSub_GetListfromServer extends BA.ResumableSub {
public ResumableSub_GetListfromServer(xevolution.vrcg.devdemov2400.newsync parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.newsync parent;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _newrecordscount = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetListfromServer (newsync) ","newsync",45,newsync.mostCurrent.activityBA,newsync.mostCurrent,32);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 35;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 36;BA.debugLine="params.Initialize";
Debug.ShouldStop(8);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="params.Clear";
Debug.ShouldStop(16);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 38;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="params.Put(\"name\", Utils.RandomString)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_randomstring" /*RemoteObject*/ ,newsync.mostCurrent.activityBA))));
 BA.debugLineNum = 41;BA.debugLine="params.Put(\"datetime\", Utils.GetCurrDatetime) ' d";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("datetime"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,newsync.mostCurrent.activityBA))));
 BA.debugLineNum = 42;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(524288);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 53;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(1048576);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 54;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(2097152);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 56;BA.debugLine="Log(data)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6146472984",_data,0);
 BA.debugLineNum = 61;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(268435456);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/requests-count-pending")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 62;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 20;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 63;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1073741824);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 64;BA.debugLine="Job.Initialize(\"\",DataUpdate)";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,newsync.processBA,(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._dataupdate.getObject())));
 BA.debugLineNum = 65;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(1);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 66;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(2);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 67;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", newsync.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "newsync", "getlistfromserver"), (_job));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 68;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 17;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 69;BA.debugLine="Log(\"Success\" & Job.GetString)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6146472997",RemoteObject.concat(RemoteObject.createImmutable("Success"),_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 71;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(64);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 72;BA.debugLine="JSON1.Initialize(Job.GetString)";
Debug.ShouldStop(128);
_json1.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(256);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 74;BA.debugLine="Dim status As Int = MapJSON.Get(\"status\")";
Debug.ShouldStop(512);
_status = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 75;BA.debugLine="If (status = 1) Then";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 14;
if ((RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1)))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 76;BA.debugLine="Dim NewRecordsCount As Int = MapJSON.Get(\"resu";
Debug.ShouldStop(2048);
_newrecordscount = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("results")))));Debug.locals.put("NewRecordsCount", _newrecordscount);Debug.locals.put("NewRecordsCount", _newrecordscount);
 BA.debugLineNum = 77;BA.debugLine="If NewRecordsCount > 0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean(">",_newrecordscount,BA.numberCast(double.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 79;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 85;BA.debugLine="Log(\"Success\" & Job.ErrorMessage)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6146473013",RemoteObject.concat(RemoteObject.createImmutable("Success"),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 17:
//C
this.state = 20;
;
 BA.debugLineNum = 87;BA.debugLine="Job.Release";
Debug.ShouldStop(4194304);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 89;BA.debugLine="Log(\"Error APP_WORKING_LOCAL\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6146473017",RemoteObject.createImmutable("Error APP_WORKING_LOCAL"),0);
 BA.debugLineNum = 90;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}