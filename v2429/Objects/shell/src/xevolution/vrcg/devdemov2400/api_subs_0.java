package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class api_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public API_RESULT_STATE As Boolean = False";
api._api_result_state = api.__c.getField(true,"False");__ref.setField("_api_result_state",api._api_result_state);
 //BA.debugLineNum = 3;BA.debugLine="Private job_url As String";
api._job_url = RemoteObject.createImmutable("");__ref.setField("_job_url",api._job_url);
 //BA.debugLineNum = 4;BA.debugLine="Private job_funcReturn As String";
api._job_funcreturn = RemoteObject.createImmutable("");__ref.setField("_job_funcreturn",api._job_funcreturn);
 //BA.debugLineNum = 5;BA.debugLine="Private job_savelocal As Boolean";
api._job_savelocal = RemoteObject.createImmutable(false);__ref.setField("_job_savelocal",api._job_savelocal);
 //BA.debugLineNum = 6;BA.debugLine="Private job_target As Object";
api._job_target = RemoteObject.createNew ("Object");__ref.setField("_job_target",api._job_target);
 //BA.debugLineNum = 7;BA.debugLine="Private job_params As Map";
api._job_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_job_params",api._job_params);
 //BA.debugLineNum = 8;BA.debugLine="Private job_data As String";
api._job_data = RemoteObject.createImmutable("");__ref.setField("_job_data",api._job_data);
 //BA.debugLineNum = 9;BA.debugLine="Private job_done_result As Int = 0";
api._job_done_result = BA.numberCast(int.class, 0);__ref.setField("_job_done_result",api._job_done_result);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (api) ","api",13,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "api","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
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
public static RemoteObject  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (api) ","api",13,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "api","jobdone", __ref, _job);}
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _thisdata = RemoteObject.createImmutable("");
RemoteObject _thedata = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 84;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="If job_done_result = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_job_done_result" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 87;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4194304);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 88;BA.debugLine="Log(\"API Reply:\" & Job.GetString)";
Debug.ShouldStop(8388608);
api.__c.runVoidMethod ("LogImpl","666453508",RemoteObject.concat(RemoteObject.createImmutable("API Reply:"),_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 89;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
Debug.ShouldStop(16777216);
_status = api._utils.runMethod(true,"_jobapistatus" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_job));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 92;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(134217728);
api.__c.runVoidMethod ("LogImpl","666453512",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 93;BA.debugLine="Log(\"	SUCESSO \" & job_funcReturn )";
Debug.ShouldStop(268435456);
api.__c.runVoidMethod ("LogImpl","666453513",RemoteObject.concat(RemoteObject.createImmutable("	SUCESSO "),__ref.getField(true,"_job_funcreturn" /*RemoteObject*/ )),0);
 BA.debugLineNum = 94;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(536870912);
api.__c.runVoidMethod ("LogImpl","666453514",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 95;BA.debugLine="If Utils.NNE(job_funcReturn) Then";
Debug.ShouldStop(1073741824);
if (api._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_job_funcreturn" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="Log(\"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
Debug.ShouldStop(-2147483648);
api.__c.runVoidMethod ("LogImpl","666453516",RemoteObject.createImmutable("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR"),0);
 BA.debugLineNum = 97;BA.debugLine="Log(job_target)";
Debug.ShouldStop(1);
api.__c.runVoidMethod ("LogImpl","666453517",BA.ObjectToString(__ref.getField(false,"_job_target" /*RemoteObject*/ )),0);
 BA.debugLineNum = 98;BA.debugLine="Log(job_funcReturn)";
Debug.ShouldStop(2);
api.__c.runVoidMethod ("LogImpl","666453518",__ref.getField(true,"_job_funcreturn" /*RemoteObject*/ ),0);
 BA.debugLineNum = 99;BA.debugLine="Log(Status)";
Debug.ShouldStop(4);
api.__c.runVoidMethod ("LogImpl","666453519",BA.NumberToString(_status),0);
 BA.debugLineNum = 100;BA.debugLine="Log(\"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
Debug.ShouldStop(8);
api.__c.runVoidMethod ("LogImpl","666453520",RemoteObject.createImmutable("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR"),0);
 BA.debugLineNum = 101;BA.debugLine="CallSub2(job_target, job_funcReturn, Status)";
Debug.ShouldStop(16);
api.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_job_target" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_job_funcreturn" /*RemoteObject*/ )),(Object)((_status)));
 };
 }else {
 BA.debugLineNum = 104;BA.debugLine="Log(\"API ERROR Reply:\" & Job.GetString)";
Debug.ShouldStop(128);
api.__c.runVoidMethod ("LogImpl","666453524",RemoteObject.concat(RemoteObject.createImmutable("API ERROR Reply:"),_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 105;BA.debugLine="If (job_savelocal = True) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",__ref.getField(true,"_job_savelocal" /*RemoteObject*/ ),api.__c.getField(true,"True")))) { 
 BA.debugLineNum = 106;BA.debugLine="Dim thisData As String = Utils.MapToJson(job_p";
Debug.ShouldStop(512);
_thisdata = api._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(false,"_job_params" /*RemoteObject*/ )));Debug.locals.put("thisData", _thisdata);Debug.locals.put("thisData", _thisdata);
 BA.debugLineNum = 107;BA.debugLine="Dim theData As String = $\"${job_data}, ${thisD";
Debug.ShouldStop(1024);
_thedata = (RemoteObject.concat(RemoteObject.createImmutable(""),api.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_job_data" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),api.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thisdata))),RemoteObject.createImmutable("")));Debug.locals.put("theData", _thedata);Debug.locals.put("theData", _thedata);
 BA.debugLineNum = 108;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(2048);
_workernd = api._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 109;BA.debugLine="Utils.save2update(job_url, thisData, 0, Worker";
Debug.ShouldStop(4096);
api._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_job_url" /*RemoteObject*/ )),(Object)(_thisdata),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 };
 };
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatedata2server(RemoteObject __ref,RemoteObject _params,RemoteObject _target,RemoteObject _url,RemoteObject _funcreturn,RemoteObject _savelocal) throws Exception{
try {
		Debug.PushSubsStack("UpdateData2Server (api) ","api",13,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("updatedata2server")) { __ref.runUserSub(false, "api","updatedata2server", __ref, _params, _target, _url, _funcreturn, _savelocal); return;}
ResumableSub_UpdateData2Server rsub = new ResumableSub_UpdateData2Server(null,__ref,_params,_target,_url,_funcreturn,_savelocal);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateData2Server extends BA.ResumableSub {
public ResumableSub_UpdateData2Server(xevolution.vrcg.devdemov2400.api parent,RemoteObject __ref,RemoteObject _params,RemoteObject _target,RemoteObject _url,RemoteObject _funcreturn,RemoteObject _savelocal) {
this.parent = parent;
this.__ref = __ref;
this._params = _params;
this._target = _target;
this._url = _url;
this._funcreturn = _funcreturn;
this._savelocal = _savelocal;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.api parent;
RemoteObject _params;
RemoteObject _target;
RemoteObject _url;
RemoteObject _funcreturn;
RemoteObject _savelocal;
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _jobd2s = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _thisdata = RemoteObject.createImmutable("");
RemoteObject _thedata = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateData2Server (api) ","api",13,__ref.getField(false, "ba"),__ref,17);
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
Debug.locals.put("params", _params);
Debug.locals.put("target", _target);
Debug.locals.put("url", _url);
Debug.locals.put("funcReturn", _funcreturn);
Debug.locals.put("savelocal", _savelocal);
 BA.debugLineNum = 18;BA.debugLine="Dim data As String";
Debug.ShouldStop(131072);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 19;BA.debugLine="job_url = url";
Debug.ShouldStop(262144);
__ref.setField ("_job_url" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 20;BA.debugLine="job_funcReturn = funcReturn";
Debug.ShouldStop(524288);
__ref.setField ("_job_funcreturn" /*RemoteObject*/ ,_funcreturn);
 BA.debugLineNum = 21;BA.debugLine="job_savelocal = savelocal";
Debug.ShouldStop(1048576);
__ref.setField ("_job_savelocal" /*RemoteObject*/ ,_savelocal);
 BA.debugLineNum = 22;BA.debugLine="job_target = target";
Debug.ShouldStop(2097152);
__ref.setField ("_job_target" /*RemoteObject*/ ,_target);
 BA.debugLineNum = 23;BA.debugLine="job_params = params";
Debug.ShouldStop(4194304);
__ref.setField ("_job_params" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 25;BA.debugLine="API_RESULT_STATE = False";
Debug.ShouldStop(16777216);
__ref.setField ("_api_result_state" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 26;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//try
this.state = 24;
this.catchState = 19;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 19;
 BA.debugLineNum = 27;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(67108864);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 28;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(134217728);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 30;BA.debugLine="data = JSON.ToPrettyString(1)";
Debug.ShouldStop(536870912);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);
 BA.debugLineNum = 31;BA.debugLine="job_data = data";
Debug.ShouldStop(1073741824);
__ref.setField ("_job_data" /*RemoteObject*/ ,_data);
 BA.debugLineNum = 33;BA.debugLine="Dim JobD2S As HttpJob";
Debug.ShouldStop(1);
_jobd2s = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("JobD2S", _jobd2s);
 BA.debugLineNum = 34;BA.debugLine="JobD2S.Initialize(\"JobD2S\",target)";
Debug.ShouldStop(2);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("JobD2S")),(Object)(_target));
 BA.debugLineNum = 36;BA.debugLine="Dim addr As String = url";
Debug.ShouldStop(8);
_addr = _url;Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 37;BA.debugLine="Log(data)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","666387988",_data,0);
 BA.debugLineNum = 38;BA.debugLine="JobD2S.PostString(addr, data )";
Debug.ShouldStop(32);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_data));
 BA.debugLineNum = 39;BA.debugLine="JobD2S.GetRequest.SetContentType(\"application/js";
Debug.ShouldStop(64);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 41;BA.debugLine="Wait For (JobD2S) JobDone(JobD2S As HttpJob)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "api", "updatedata2server"), (_jobd2s));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_jobd2s = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("JobD2S", _jobd2s);
;
 BA.debugLineNum = 42;BA.debugLine="Log(\"API REPLY : \" & JobD2S.GetString)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","666387993",RemoteObject.concat(RemoteObject.createImmutable("API REPLY : "),_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 43;BA.debugLine="If JobD2S.Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 17;
if (_jobd2s.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 44;BA.debugLine="job_done_result = 1";
Debug.ShouldStop(2048);
__ref.setField ("_job_done_result" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 45;BA.debugLine="Log(\"API Reply:\" & JobD2S.GetString)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","666387996",RemoteObject.concat(RemoteObject.createImmutable("API Reply:"),_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 46;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(JobD2S)";
Debug.ShouldStop(8192);
_status = parent._utils.runMethod(true,"_jobapistatus" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_jobd2s));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 49;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","666388000",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 50;BA.debugLine="Log(\"	SUCESSO \" & funcReturn )";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","666388001",RemoteObject.concat(RemoteObject.createImmutable("	SUCESSO "),_funcreturn),0);
 BA.debugLineNum = 51;BA.debugLine="Log(\"**********************************\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","666388002",RemoteObject.createImmutable("**********************************"),0);
 BA.debugLineNum = 52;BA.debugLine="If Utils.NNE(funcReturn) Then";
Debug.ShouldStop(524288);
if (true) break;

case 7:
//if
this.state = 10;
if (parent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_funcreturn)).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 53;BA.debugLine="Log(\"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","666388004",RemoteObject.createImmutable("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR"),0);
 BA.debugLineNum = 54;BA.debugLine="Log(target)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","666388005",BA.ObjectToString(_target),0);
 BA.debugLineNum = 55;BA.debugLine="Log(funcReturn)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","666388006",_funcreturn,0);
 BA.debugLineNum = 56;BA.debugLine="Log(Status)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","666388007",BA.NumberToString(_status),0);
 BA.debugLineNum = 57;BA.debugLine="Log(\"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","666388008",RemoteObject.createImmutable("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR"),0);
 BA.debugLineNum = 58;BA.debugLine="CallSub2(target, funcReturn, Status)";
Debug.ShouldStop(33554432);
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_target),(Object)(_funcreturn),(Object)((_status)));
 if (true) break;

case 10:
//C
this.state = 17;
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 61;BA.debugLine="job_done_result = 1";
Debug.ShouldStop(268435456);
__ref.setField ("_job_done_result" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 62;BA.debugLine="Log(\"API ERROR Reply:\" & JobD2S.GetString)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","666388013",RemoteObject.concat(RemoteObject.createImmutable("API ERROR Reply:"),_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 63;BA.debugLine="If (savelocal = True) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("=",_savelocal,parent.__c.getField(true,"True")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 64;BA.debugLine="Dim thisData As String = Utils.MapToJson(param";
Debug.ShouldStop(-2147483648);
_thisdata = parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_params));Debug.locals.put("thisData", _thisdata);Debug.locals.put("thisData", _thisdata);
 BA.debugLineNum = 65;BA.debugLine="Dim theData As String = $\"${data}, ${thisData}";
Debug.ShouldStop(1);
_thedata = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_data))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thisdata))),RemoteObject.createImmutable("")));Debug.locals.put("theData", _thedata);Debug.locals.put("theData", _thedata);
 BA.debugLineNum = 66;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(2);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 67;BA.debugLine="Utils.save2update(url, thisData, 0, WorkerND)";
Debug.ShouldStop(4);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_url),(Object)(_thisdata),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 24;
;
 BA.debugLineNum = 70;BA.debugLine="JobD2S.Release";
Debug.ShouldStop(32);
_jobd2s.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 72;BA.debugLine="Dim theData As String = $\"${LastException}, ${da";
Debug.ShouldStop(128);
_thedata = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")).getObject()))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_data))),RemoteObject.createImmutable("")));Debug.locals.put("theData", _thedata);Debug.locals.put("theData", _thedata);
 BA.debugLineNum = 73;BA.debugLine="Log(theData)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","666388024",_thedata,0);
 BA.debugLineNum = 74;BA.debugLine="Utils.logError(\"JobD2S\", ShareCode.SESS_OPER_Use";
Debug.ShouldStop(512);
parent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToString("JobD2S")),(Object)(parent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(_thedata));
 BA.debugLineNum = 75;BA.debugLine="If (savelocal = True) Then";
Debug.ShouldStop(1024);
if (true) break;

case 20:
//if
this.state = 23;
if ((RemoteObject.solveBoolean("=",_savelocal,parent.__c.getField(true,"True")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 76;BA.debugLine="Dim thisData As String = Utils.MapToJson(params";
Debug.ShouldStop(2048);
_thisdata = parent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_params));Debug.locals.put("thisData", _thisdata);Debug.locals.put("thisData", _thisdata);
 BA.debugLineNum = 77;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(4096);
_workernd = parent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 78;BA.debugLine="Utils.save2update(url, thisData, 0, WorkerND)";
Debug.ShouldStop(8192);
parent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_url),(Object)(_thisdata),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
}