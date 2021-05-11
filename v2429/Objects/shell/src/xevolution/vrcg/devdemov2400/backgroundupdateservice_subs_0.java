package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class backgroundupdateservice_subs_0 {


public static RemoteObject  _checkifupdateisavailable() throws Exception{
try {
		Debug.PushSubsStack("CheckIfUpdateIsAvailable (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,49);
if (RapidSub.canDelegate("checkifupdateisavailable")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","checkifupdateisavailable");}
ResumableSub_CheckIfUpdateIsAvailable rsub = new ResumableSub_CheckIfUpdateIsAvailable(null);
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
public static class ResumableSub_CheckIfUpdateIsAvailable extends BA.ResumableSub {
public ResumableSub_CheckIfUpdateIsAvailable(xevolution.vrcg.devdemov2400.backgroundupdateservice parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _quicksyncdate = RemoteObject.createImmutable("");
RemoteObject _loginupdatefilename = RemoteObject.createImmutable("");
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
		Debug.PushSubsStack("CheckIfUpdateIsAvailable (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,49);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 51;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_quicksync.def"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 52;BA.debugLine="Dim QuickSyncDate As String = File.readstring(St";
Debug.ShouldStop(524288);
_quicksyncdate = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_quicksync.def")))));Debug.locals.put("QuickSyncDate", _quicksyncdate);Debug.locals.put("QuickSyncDate", _quicksyncdate);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 54;BA.debugLine="Dim QuickSyncDate As String = Utils.GetCurrDatet";
Debug.ShouldStop(2097152);
_quicksyncdate = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,backgroundupdateservice.processBA);Debug.locals.put("QuickSyncDate", _quicksyncdate);Debug.locals.put("QuickSyncDate", _quicksyncdate);
 BA.debugLineNum = 55;BA.debugLine="File.writestring(Starter.InternalFolder,$\"${Shar";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_quicksync.def")))),(Object)(_quicksyncdate));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 58;BA.debugLine="Dim LoginUpdateFileName  As String= \"\"";
Debug.ShouldStop(33554432);
_loginupdatefilename = BA.ObjectToString("");Debug.locals.put("LoginUpdateFileName", _loginupdatefilename);Debug.locals.put("LoginUpdateFileName", _loginupdatefilename);
 BA.debugLineNum = 59;BA.debugLine="Dim params As Map";
Debug.ShouldStop(67108864);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 60;BA.debugLine="params.Initialize";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="params.Clear";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 62;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 63;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="params.Put(\"name\", ShareCode.SESS_User)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 65;BA.debugLine="params.Put(\"datetime\", QuickSyncDate)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("datetime"))),(Object)((_quicksyncdate)));
 BA.debugLineNum = 66;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 67;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 68;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 69;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 70;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 71;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 72;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 75;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(1024);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 76;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(2048);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 77;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(4096);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 79;BA.debugLine="Log(data)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440542",_data,0);
 BA.debugLineNum = 81;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(65536);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/requests-count-pending")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 82;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//if
this.state = 26;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 25;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 83;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(262144);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 84;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(524288);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("")),(Object)(backgroundupdateservice.getObject()));
 BA.debugLineNum = 85;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(1048576);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 86;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 87;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "checkifupdateisavailable"), (_job));
this.state = 27;
return;
case 27:
//C
this.state = 10;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 88;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//if
this.state = 23;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 22;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 89;BA.debugLine="Log(\"Success\" & Job.GetString)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440552",RemoteObject.concat(RemoteObject.createImmutable("Success"),_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 91;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(67108864);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 92;BA.debugLine="JSON1.Initialize(Job.GetString)";
Debug.ShouldStop(134217728);
_json1.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 93;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(268435456);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 94;BA.debugLine="Dim status As Int = MapJSON.Get(\"status\")";
Debug.ShouldStop(536870912);
_status = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 95;BA.debugLine="If (status = 1) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 13:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1)))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 96;BA.debugLine="Dim NewRecordsCount As Int = MapJSON.Get(\"resu";
Debug.ShouldStop(-2147483648);
_newrecordscount = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("results")))));Debug.locals.put("NewRecordsCount", _newrecordscount);Debug.locals.put("NewRecordsCount", _newrecordscount);
 BA.debugLineNum = 98;BA.debugLine="If NewRecordsCount > 0 Then";
Debug.ShouldStop(2);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",_newrecordscount,BA.numberCast(double.class, 0))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 99;BA.debugLine="RequestTagcodes = MapJSON.Get(\"requestTagcode";
Debug.ShouldStop(4);
parent._requesttagcodes = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("requestTagcodes")))));
 BA.debugLineNum = 100;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 101;BA.debugLine="Log(\">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440564",RemoteObject.createImmutable(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"),0);
 BA.debugLineNum = 102;BA.debugLine="Log(\"LITE UPDATES EXISTS\")";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440565",RemoteObject.createImmutable("LITE UPDATES EXISTS"),0);
 BA.debugLineNum = 103;BA.debugLine="Log(\">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440566",RemoteObject.createImmutable(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"),0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 109;BA.debugLine="Log(\"Success\" & Job.ErrorMessage)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440572",RemoteObject.concat(RemoteObject.createImmutable("Success"),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 23:
//C
this.state = 26;
;
 BA.debugLineNum = 111;BA.debugLine="Job.Release";
Debug.ShouldStop(16384);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 113;BA.debugLine="Log(\"Error APP_WORKING_LOCAL\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440576",RemoteObject.createImmutable("Error APP_WORKING_LOCAL"),0);
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 115;BA.debugLine="Log(\">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440578",RemoteObject.createImmutable(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"),0);
 BA.debugLineNum = 116;BA.debugLine="Log(\"NO LITE UPDATES\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440579",RemoteObject.createImmutable("NO LITE UPDATES"),0);
 BA.debugLineNum = 117;BA.debugLine="Log(\">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117440580",RemoteObject.createImmutable(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"),0);
 BA.debugLineNum = 118;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 119;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static RemoteObject  _deletesqlfiles(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DeleteSqlFiles (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,527);
if (RapidSub.canDelegate("deletesqlfiles")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","deletesqlfiles", _filename);}
ResumableSub_DeleteSqlFiles rsub = new ResumableSub_DeleteSqlFiles(null,_filename);
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
public static class ResumableSub_DeleteSqlFiles extends BA.ResumableSub {
public ResumableSub_DeleteSqlFiles(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _filename;
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
int step2;
int limit2;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteSqlFiles (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,527);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 528;BA.debugLine="If(SqlFilesTotal > 0)Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 12;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 529;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//for
this.state = 11;
step2 = 1;
limit2 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 11;
if ((step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2)) this.state = 6;
if (true) break;

case 14:
//C
this.state = 13;
_i = ((int)(0 + _i + step2)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 530;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
Debug.ShouldStop(131072);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 531;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, f";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//if
this.state = 10;
if ((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 532;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fil";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));
 if (true) break;

case 10:
//C
this.state = 14;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 535;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 537;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _downloadfileswithftp(RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,540);
if (RapidSub.canDelegate("downloadfileswithftp")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","downloadfileswithftp", _dlg);}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,_dlg);
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
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _dlg) {
this.parent = parent;
this._dlg = _dlg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _dlg;
RemoteObject _current_counter = RemoteObject.createImmutable(0);
RemoteObject _end_counter = RemoteObject.createImmutable(0);
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _lmdate = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _fname = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
int step16;
int limit16;
int step32;
int limit32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,540);
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
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 541;BA.debugLine="Dim CURRENT_COUNTER As Int = 0";
Debug.ShouldStop(268435456);
_current_counter = BA.numberCast(int.class, 0);Debug.locals.put("CURRENT_COUNTER", _current_counter);Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 542;BA.debugLine="Dim END_COUNTER As Int = 0";
Debug.ShouldStop(536870912);
_end_counter = BA.numberCast(int.class, 0);Debug.locals.put("END_COUNTER", _end_counter);Debug.locals.put("END_COUNTER", _end_counter);
 BA.debugLineNum = 543;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118095875",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 544;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APPL_HOST}/${Share";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118095876",(RemoteObject.concat(RemoteObject.createImmutable(" 		INITIAL : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 545;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118095877",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 546;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(2);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 547;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(4);
_globalftp.runVoidMethod ("Initialize",backgroundupdateservice.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 548;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(8);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 552;BA.debugLine="GlobalFTP.TimeoutMs =240000";
Debug.ShouldStop(128);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 553;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
Debug.ShouldStop(256);
_sfl = _globalftp.runMethod(false,"List",backgroundupdateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 557;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "downloadfileswithftp"), _sfl);
this.state = 49;
return;
case 49:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 558;BA.debugLine="If Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 22;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 21;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 563;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1) '";
Debug.ShouldStop(262144);
_lmdate = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("LMDate", _lmdate);Debug.locals.put("LMDate", _lmdate);
 BA.debugLineNum = 564;BA.debugLine="If (Files.Length >= 1) Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 19;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 565;BA.debugLine="FTPFileList.Initialize";
Debug.ShouldStop(1048576);
parent._ftpfilelist.runVoidMethod ("Initialize");
 BA.debugLineNum = 566;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//for
this.state = 18;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 50;
if (true) break;

case 50:
//C
this.state = 18;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 9;
if (true) break;

case 51:
//C
this.state = 50;
_i = ((int)(0 + _i + step16)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 567;BA.debugLine="Dim fName As String = Files(i).Name";
Debug.ShouldStop(4194304);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 568;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//if
this.state = 17;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx")))))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 572;BA.debugLine="If (Files(i).Timestamp >= LMDate) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_lmdate))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 573;BA.debugLine="FTPFileList.Add(Files(i).Name)";
Debug.ShouldStop(268435456);
parent._ftpfilelist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 51;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("i", _i);
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 579;BA.debugLine="Log(\"error getting files list\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118095911",RemoteObject.createImmutable("error getting files list"),0);
 BA.debugLineNum = 580;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(8);
_current_counter = _end_counter;Debug.locals.put("CURRENT_COUNTER", _current_counter);
 if (true) break;
;
 BA.debugLineNum = 583;BA.debugLine="If (FTPFileList.IsInitialized) Then";
Debug.ShouldStop(64);

case 22:
//if
this.state = 48;
if ((parent._ftpfilelist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 584;BA.debugLine="If (FTPFileList.Size>=1) Then";
Debug.ShouldStop(128);
if (true) break;

case 25:
//if
this.state = 47;
if ((RemoteObject.solveBoolean("g",parent._ftpfilelist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 585;BA.debugLine="END_COUNTER = FTPFileList.Size-1";
Debug.ShouldStop(256);
_end_counter = RemoteObject.solve(new RemoteObject[] {parent._ftpfilelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("END_COUNTER", _end_counter);
 BA.debugLineNum = 586;BA.debugLine="For i=0 To FTPFileList.Size-1";
Debug.ShouldStop(512);
if (true) break;

case 28:
//for
this.state = 46;
step32 = 1;
limit32 = RemoteObject.solve(new RemoteObject[] {parent._ftpfilelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 52;
if (true) break;

case 52:
//C
this.state = 46;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 30;
if (true) break;

case 53:
//C
this.state = 52;
_i = ((int)(0 + _i + step32)) ;
Debug.locals.put("i", _i);
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 587;BA.debugLine="Dim fName As String = FTPFileList.Get(i)";
Debug.ShouldStop(1024);
_fname = BA.ObjectToString(parent._ftpfilelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 589;BA.debugLine="Log(fName)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118095921",_fname,0);
 BA.debugLineNum = 590;BA.debugLine="Try";
Debug.ShouldStop(8192);
if (true) break;

case 31:
//try
this.state = 42;
this.catchState = 41;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 41;
 BA.debugLineNum = 591;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(16384);
_sf = _globalftp.runMethod(false,"DownloadFile",backgroundupdateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 592;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "downloadfileswithftp"), _sf);
this.state = 54;
return;
case 54:
//C
this.state = 34;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 594;BA.debugLine="If Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 34:
//if
this.state = 39;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 BA.debugLineNum = 595;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118095927",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 598;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118095930",RemoteObject.createImmutable("Error downloading file"),0);
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
 BA.debugLineNum = 602;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118095934",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",backgroundupdateservice.processBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 605;BA.debugLine="If (FTPFileList.Size-1 > CURRENT_COUNTER) Then";
Debug.ShouldStop(268435456);

case 42:
//if
this.state = 45;
this.catchState = 0;
if ((RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {parent._ftpfilelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, _current_counter)))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 606;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER+1";
Debug.ShouldStop(536870912);
_current_counter = RemoteObject.solve(new RemoteObject[] {_current_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CURRENT_COUNTER", _current_counter);
 if (true) break;

case 45:
//C
this.state = 53;
;
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
Debug.locals.put("i", _i);
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = -1;
;
 BA.debugLineNum = 612;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(8);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 613;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 614;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",backgroundupdateservice.processBA, e0.toString());}
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
public static void  _ftp_listcompleted(RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) throws Exception{
}
public static void  _ftp_downloadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _downloadsqlfilesliteupdate(RemoteObject _fileinfo,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFilesLiteUpdate (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,212);
if (RapidSub.canDelegate("downloadsqlfilesliteupdate")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","downloadsqlfilesliteupdate", _fileinfo, _filename);}
ResumableSub_DownloadSqlFilesLiteUpdate rsub = new ResumableSub_DownloadSqlFilesLiteUpdate(null,_fileinfo,_filename);
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
public static class ResumableSub_DownloadSqlFilesLiteUpdate extends BA.ResumableSub {
public ResumableSub_DownloadSqlFilesLiteUpdate(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _fileinfo,RemoteObject _filename) {
this.parent = parent;
this._fileinfo = _fileinfo;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _fileinfo;
RemoteObject _filename;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
int step6;
int limit6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFilesLiteUpdate (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,212);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("fileInfo", _fileinfo);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 214;BA.debugLine="SqlFilesTotal = 0";
Debug.ShouldStop(2097152);
parent._sqlfilestotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 215;BA.debugLine="Dim res As ResumableSub = GetLoginUpdateInstalSql";
Debug.ShouldStop(4194304);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _getloginupdateinstalsqlfilestotal(_fileinfo);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 216;BA.debugLine="Wait For(res) complete (result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "downloadsqlfilesliteupdate"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 217;BA.debugLine="SqlFilesTotal = result";
Debug.ShouldStop(16777216);
parent._sqlfilestotal = _result;
 BA.debugLineNum = 221;BA.debugLine="If(SqlFilesTotal > 0)Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 8;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 222;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step6)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 223;BA.debugLine="Dim Filen As String = $\"${Filename}${i}.sql\"$";
Debug.ShouldStop(1073741824);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("Filen", _filen);Debug.locals.put("Filen", _filen);
 BA.debugLineNum = 224;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithFTP";
Debug.ShouldStop(-2147483648);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _downloadsqlfilewithftp(_filen);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 225;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "downloadsqlfilesliteupdate"), _rs);
this.state = 12;
return;
case 12:
//C
this.state = 11;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 227;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 230;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 231;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _downloadsqlfilewithftp(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFileWithFTP (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,324);
if (RapidSub.canDelegate("downloadsqlfilewithftp")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","downloadsqlfilewithftp", _filename);}
ResumableSub_DownloadSqlFileWithFTP rsub = new ResumableSub_DownloadSqlFileWithFTP(null,_filename);
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
public static class ResumableSub_DownloadSqlFileWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadSqlFileWithFTP(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _filename;
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFileWithFTP (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,324);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 326;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(32);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 327;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(64);
_globalftp.runVoidMethod ("Initialize",backgroundupdateservice.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 328;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(128);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 329;BA.debugLine="GlobalFTP.TimeoutMs =240000";
Debug.ShouldStop(256);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 330;BA.debugLine="Log(Filename)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117768198",_filename,0);
 BA.debugLineNum = 331;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" & S";
Debug.ShouldStop(1024);
_sf = _globalftp.runMethod(false,"DownloadFile",backgroundupdateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 332;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath A";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "downloadsqlfilewithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 334;BA.debugLine="If Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 335;BA.debugLine="Log(Filename & \" file was download successfully\"";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117768203",RemoteObject.concat(_filename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 336;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(32768);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 337;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 339;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(262144);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 340;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 341;BA.debugLine="Log(\"Error downloading file \" & Filename)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117768209",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filename),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 343;BA.debugLine="End Sub";
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
public static RemoteObject  _executesqlfiles(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ExecuteSqlFiles (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,345);
if (RapidSub.canDelegate("executesqlfiles")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","executesqlfiles", _filename);}
ResumableSub_ExecuteSqlFiles rsub = new ResumableSub_ExecuteSqlFiles(null,_filename);
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
public static class ResumableSub_ExecuteSqlFiles extends BA.ResumableSub {
public ResumableSub_ExecuteSqlFiles(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _filename;
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _script2execute = RemoteObject.createImmutable("");
RemoteObject _splitscript = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _x = 0;
RemoteObject _dummy = RemoteObject.createImmutable("");
RemoteObject _request_tagcode = RemoteObject.createImmutable("");
int step7;
int limit7;
int step16;
int limit16;
int step23;
int limit23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExecuteSqlFiles (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,345);
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
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 346;BA.debugLine="If(SqlFilesTotal > 0)Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 46;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 349;BA.debugLine="If ShareCode.NewRequestsList.IsInitialized Then";
Debug.ShouldStop(268435456);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent._sharecode._newrequestslist /*RemoteObject*/ .runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 350;BA.debugLine="ShareCode.NewRequestsList.Clear";
Debug.ShouldStop(536870912);
parent.mostCurrent._sharecode._newrequestslist /*RemoteObject*/ .runVoidMethod ("Clear");
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 352;BA.debugLine="ShareCode.NewRequestsList.Initialize";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._sharecode._newrequestslist /*RemoteObject*/ .runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 355;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(4);

case 9:
//for
this.state = 45;
step7 = 1;
limit7 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 45;
if ((step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7)) this.state = 11;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step7)) ;
Debug.locals.put("i", _i);
if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 356;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
Debug.ShouldStop(8);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 357;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(16);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 359;BA.debugLine="Try";
Debug.ShouldStop(64);
if (true) break;

case 12:
//try
this.state = 17;
this.catchState = 16;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 17;
this.catchState = 16;
 BA.debugLineNum = 360;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedF";
Debug.ShouldStop(128);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("List1", _list1);
 Debug.CheckDeviceExceptions();
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
 BA.debugLineNum = 362;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117833745",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",backgroundupdateservice.processBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 365;BA.debugLine="If (List1.IsInitialized) Then";
Debug.ShouldStop(4096);

case 17:
//if
this.state = 44;
this.catchState = 0;
if ((_list1.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 43;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 366;BA.debugLine="For n = 0 To List1.Size - 1";
Debug.ShouldStop(8192);
if (true) break;

case 20:
//for
this.state = 41;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 49;
if (true) break;

case 49:
//C
this.state = 41;
if ((step16 > 0 && _n <= limit16) || (step16 < 0 && _n >= limit16)) this.state = 22;
if (true) break;

case 50:
//C
this.state = 49;
_n = ((int)(0 + _n + step16)) ;
Debug.locals.put("n", _n);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 367;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
Debug.ShouldStop(16384);
_script2execute = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("Script2Execute", _script2execute);Debug.locals.put("Script2Execute", _script2execute);
 BA.debugLineNum = 368;BA.debugLine="Log(Script2Execute)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117833751",_script2execute,0);
 BA.debugLineNum = 371;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 23:
//try
this.state = 40;
this.catchState = 39;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 39;
 BA.debugLineNum = 372;BA.debugLine="Utils.SaveSQLToLog(\"BackgroundUpdateService\"";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("BackgroundUpdateService")),(Object)(_script2execute),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 378;BA.debugLine="If Script2Execute.Contains(\"INSERT INTO `dta";
Debug.ShouldStop(33554432);
if (true) break;

case 26:
//if
this.state = 37;
if (_script2execute.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("INSERT INTO `dta_requests`"))).<Boolean>get().booleanValue()) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 379;BA.debugLine="Dim SplitScript As List  = Regex.Split(\",\",";
Debug.ShouldStop(67108864);
_splitscript = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_splitscript = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_script2execute))));Debug.locals.put("SplitScript", _splitscript);Debug.locals.put("SplitScript", _splitscript);
 BA.debugLineNum = 380;BA.debugLine="For x=0 To SplitScript.Size -1";
Debug.ShouldStop(134217728);
if (true) break;

case 29:
//for
this.state = 36;
step23 = 1;
limit23 = RemoteObject.solve(new RemoteObject[] {_splitscript.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
Debug.locals.put("x", _x);
this.state = 51;
if (true) break;

case 51:
//C
this.state = 36;
if ((step23 > 0 && _x <= limit23) || (step23 < 0 && _x >= limit23)) this.state = 31;
if (true) break;

case 52:
//C
this.state = 51;
_x = ((int)(0 + _x + step23)) ;
Debug.locals.put("x", _x);
if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 381;BA.debugLine="Dim dummy As String = SplitScript.Get(x)";
Debug.ShouldStop(268435456);
_dummy = BA.ObjectToString(_splitscript.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _x))));Debug.locals.put("dummy", _dummy);Debug.locals.put("dummy", _dummy);
 BA.debugLineNum = 382;BA.debugLine="If dummy.StartsWith(\"'I_\") Or dummy.Starts";
Debug.ShouldStop(536870912);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean(".",_dummy.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("'I_")))) || RemoteObject.solveBoolean(".",_dummy.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("'IP_"))))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 383;BA.debugLine="Dim Request_tagcode As String = SplitScri";
Debug.ShouldStop(1073741824);
_request_tagcode = BA.ObjectToString(_splitscript.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _x))));Debug.locals.put("Request_tagcode", _request_tagcode);Debug.locals.put("Request_tagcode", _request_tagcode);
 BA.debugLineNum = 384;BA.debugLine="Request_tagcode = Request_tagcode.Replace";
Debug.ShouldStop(-2147483648);
_request_tagcode = _request_tagcode.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Request_tagcode", _request_tagcode);
 BA.debugLineNum = 385;BA.debugLine="ShareCode.NewRequestsList.Add(Request_tag";
Debug.ShouldStop(1);
parent.mostCurrent._sharecode._newrequestslist /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_request_tagcode)));
 if (true) break;

case 35:
//C
this.state = 52;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
Debug.locals.put("x", _x);
;
 if (true) break;

case 37:
//C
this.state = 40;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 0;
 BA.debugLineNum = 392;BA.debugLine="Log($\"ERROR: ${Script2Execute} - EXCEPTION =";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117833775",(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_script2execute))),RemoteObject.createImmutable(" - EXCEPTION = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",backgroundupdateservice.processBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = 50;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 41:
//C
this.state = 44;
Debug.locals.put("n", _n);
;
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 396;BA.debugLine="Utils.logError(\"Update SQL\", ShareCode.SESS_OP";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("Update SQL")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")))));
 if (true) break;

case 44:
//C
this.state = 48;
;
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 400;BA.debugLine="InsertAlertNewRequests";
Debug.ShouldStop(32768);
_insertalertnewrequests();
 BA.debugLineNum = 401;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 46:
//C
this.state = -1;
;
 BA.debugLineNum = 406;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",backgroundupdateservice.processBA, e0.toString());}
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
public static RemoteObject  _generateliteupdatefiles() throws Exception{
try {
		Debug.PushSubsStack("GenerateLiteUpdateFiles (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,161);
if (RapidSub.canDelegate("generateliteupdatefiles")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","generateliteupdatefiles");}
ResumableSub_GenerateLiteUpdateFiles rsub = new ResumableSub_GenerateLiteUpdateFiles(null);
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
public static class ResumableSub_GenerateLiteUpdateFiles extends BA.ResumableSub {
public ResumableSub_GenerateLiteUpdateFiles(xevolution.vrcg.devdemov2400.backgroundupdateservice parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _quicksyncdate = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GenerateLiteUpdateFiles (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,161);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 163;BA.debugLine="Dim QuickSyncDate As String = File.readstring(Sta";
Debug.ShouldStop(4);
_quicksyncdate = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_quicksync.def")))));Debug.locals.put("QuickSyncDate", _quicksyncdate);Debug.locals.put("QuickSyncDate", _quicksyncdate);
 BA.debugLineNum = 165;BA.debugLine="RequestFileName = Utils.RandomString";
Debug.ShouldStop(16);
parent._requestfilename = parent.mostCurrent._utils.runMethod(true,"_randomstring" /*RemoteObject*/ ,backgroundupdateservice.processBA);
 BA.debugLineNum = 166;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 167;BA.debugLine="params.Initialize";
Debug.ShouldStop(64);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 168;BA.debugLine="params.Clear";
Debug.ShouldStop(128);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 169;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 170;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 171;BA.debugLine="params.Put(\"name\", RequestFileName)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((parent._requestfilename)));
 BA.debugLineNum = 172;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("newReturn"))),(Object)((parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ )));
 BA.debugLineNum = 173;BA.debugLine="params.Put(\"datetime\", QuickSyncDate)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("datetime"))),(Object)((_quicksyncdate)));
 BA.debugLineNum = 174;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 175;BA.debugLine="params.Put(\"requestTagcodes\", RequestTagcodes)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("requestTagcodes"))),(Object)((parent._requesttagcodes)));
 BA.debugLineNum = 176;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("smart"))),(Object)((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )));
 BA.debugLineNum = 177;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 178;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 179;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 180;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 181;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 182;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 183;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 185;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(16777216);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 186;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(33554432);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 187;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(67108864);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 189;BA.debugLine="Log(data)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117571612",_data,0);
 BA.debugLineNum = 191;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(1073741824);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/requests-pending")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 192;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 193;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 194;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(2);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("")),(Object)(backgroundupdateservice.getObject()));
 BA.debugLineNum = 195;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(4);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 196;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(8);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 197;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "generateliteupdatefiles"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 198;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 199;BA.debugLine="Log(\"Success\" & Job.GetString)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117571622",RemoteObject.concat(RemoteObject.createImmutable("Success"),_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 200;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 202;BA.debugLine="Log(\"Success\" & Job.ErrorMessage)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117571625",RemoteObject.concat(RemoteObject.createImmutable("Success"),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 204;BA.debugLine="Job.Release";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 206;BA.debugLine="Log(\"Error APP_WORKING_LOCAL\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117571629",RemoteObject.createImmutable("Error APP_WORKING_LOCAL"),0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 208;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _getloginupdateinstalsqlfilestotal(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetLoginUpdateInstalSqlFilesTotal (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,233);
if (RapidSub.canDelegate("getloginupdateinstalsqlfilestotal")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","getloginupdateinstalsqlfilestotal", _filename);}
ResumableSub_GetLoginUpdateInstalSqlFilesTotal rsub = new ResumableSub_GetLoginUpdateInstalSqlFilesTotal(null,_filename);
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
public static class ResumableSub_GetLoginUpdateInstalSqlFilesTotal extends BA.ResumableSub {
public ResumableSub_GetLoginUpdateInstalSqlFilesTotal(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _filename;
RemoteObject _trycount = RemoteObject.createImmutable(0);
RemoteObject _dotry = RemoteObject.createImmutable(false);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _ctm = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _jsonstruct = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datahora = RemoteObject.createImmutable("");
RemoteObject _totalfiles = RemoteObject.createImmutable(0);
RemoteObject _inserts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colinserts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mastertagcode = RemoteObject.createImmutable("");
RemoteObject _childfield = RemoteObject.createImmutable("");
RemoteObject _tagcodelist = RemoteObject.createImmutable("");
RemoteObject _newinfolist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _table = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject group26;
int index26;
int groupLen26;
int step37;
int limit37;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetLoginUpdateInstalSqlFilesTotal (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,233);
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
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 234;BA.debugLine="TagCodesString = \"\"";
Debug.ShouldStop(512);
parent._tagcodesstring = BA.ObjectToString("");
 BA.debugLineNum = 235;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(1024);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 236;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(2048);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 237;BA.debugLine="Dim total As Int = -1";
Debug.ShouldStop(4096);
_total = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 238;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(8192);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 239;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(16384);
_globalftp.runVoidMethod ("Initialize",backgroundupdateservice.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 240;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(32768);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 241;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(65536);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 242;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(131072);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 243;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(262144);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 244;BA.debugLine="GlobalFTP.TimeoutMs =240000";
Debug.ShouldStop(524288);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 245;BA.debugLine="Do While (dotry And (trycount <3))";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//do while
this.state = 36;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 246;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(2097152);
_sf = _globalftp.runMethod(false,"DownloadFile",backgroundupdateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 247;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "getloginupdateinstalsqlfilestotal"), _sf);
this.state = 37;
return;
case 37:
//C
this.state = 4;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 249;BA.debugLine="If Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 35;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 34;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 251;BA.debugLine="Try";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//try
this.state = 32;
this.catchState = 31;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 31;
 BA.debugLineNum = 252;BA.debugLine="Log(Filename & \" file was download successfull";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117702675",RemoteObject.concat(_filename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 254;BA.debugLine="If ShareCode.newReturn = 1 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 10:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 12;
}else {
this.state = 28;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 255;BA.debugLine="Dim JsonStruct As String = File.readstring(St";
Debug.ShouldStop(1073741824);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 256;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 257;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 258;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 259;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
Debug.ShouldStop(4);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 260;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
Debug.ShouldStop(8);
_totalfiles = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("Totalfiles", _totalfiles);Debug.locals.put("Totalfiles", _totalfiles);
 BA.debugLineNum = 261;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(16);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 266;BA.debugLine="For Each colinserts As Map In inserts";
Debug.ShouldStop(512);
if (true) break;

case 13:
//for
this.state = 26;
_colinserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group26 = _inserts;
index26 = 0;
groupLen26 = group26.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colinserts", _colinserts);
this.state = 38;
if (true) break;

case 38:
//C
this.state = 26;
if (index26 < groupLen26) {
this.state = 15;
_colinserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group26.runMethod(false,"Get",index26));}
if (true) break;

case 39:
//C
this.state = 38;
index26++;
Debug.locals.put("colinserts", _colinserts);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 267;BA.debugLine="Dim mastertagcode As String = colinserts.Get";
Debug.ShouldStop(1024);
_mastertagcode = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mastertagcode")))));Debug.locals.put("mastertagcode", _mastertagcode);Debug.locals.put("mastertagcode", _mastertagcode);
 BA.debugLineNum = 268;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 16:
//try
this.state = 21;
this.catchState = 20;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 21;
this.catchState = 20;
 BA.debugLineNum = 269;BA.debugLine="Dim childfield As String = colinserts.Get(\"";
Debug.ShouldStop(4096);
_childfield = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("childfield")))));Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 Debug.CheckDeviceExceptions();
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 31;
 BA.debugLineNum = 271;BA.debugLine="Dim childfield As String = \"\"";
Debug.ShouldStop(16384);
_childfield = BA.ObjectToString("");Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 BA.debugLineNum = 272;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117702695",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",backgroundupdateservice.processBA)),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 31;
;
 BA.debugLineNum = 274;BA.debugLine="Dim tagcodelist As String = colinserts.Get(\"";
Debug.ShouldStop(131072);
_tagcodelist = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcodelist")))));Debug.locals.put("tagcodelist", _tagcodelist);Debug.locals.put("tagcodelist", _tagcodelist);
 BA.debugLineNum = 275;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\",";
Debug.ShouldStop(262144);
_newinfolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newinfolist = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_tagcodelist))));Debug.locals.put("NewInfoList", _newinfolist);Debug.locals.put("NewInfoList", _newinfolist);
 BA.debugLineNum = 276;BA.debugLine="Dim table As String = colinserts.Get(\"table\"";
Debug.ShouldStop(524288);
_table = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 278;BA.debugLine="For i=0 To NewInfoList.Size -1";
Debug.ShouldStop(2097152);
if (true) break;

case 22:
//for
this.state = 25;
step37 = 1;
limit37 = RemoteObject.solve(new RemoteObject[] {_newinfolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 40;
if (true) break;

case 40:
//C
this.state = 25;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 24;
if (true) break;

case 41:
//C
this.state = 40;
_i = ((int)(0 + _i + step37)) ;
Debug.locals.put("i", _i);
if (true) break;

case 24:
//C
this.state = 41;
 BA.debugLineNum = 279;BA.debugLine="Dim res As ResumableSub = DBStructures.Remo";
Debug.ShouldStop(4194304);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtable" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_table),(Object)(_mastertagcode),(Object)(_childfield),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(_newinfolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 280;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "getloginupdateinstalsqlfilestotal"), _res);
this.state = 42;
return;
case 42:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 39;
Debug.locals.put("i", _i);
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
Debug.locals.put("colinserts", _colinserts);
;
 BA.debugLineNum = 285;BA.debugLine="total = Totalfiles";
Debug.ShouldStop(268435456);
_total = _totalfiles;Debug.locals.put("total", _total);
 BA.debugLineNum = 286;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(536870912);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 287;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_date));
 BA.debugLineNum = 288;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_date));
 BA.debugLineNum = 289;BA.debugLine="dotry = False";
Debug.ShouldStop(1);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 290;BA.debugLine="trycount = 3";
Debug.ShouldStop(2);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 291;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(4);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 294;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(32);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 295;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
Debug.ShouldStop(64);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 296;BA.debugLine="total = List1.Get(0) ' Numero de ficheiros pa";
Debug.ShouldStop(128);
_total = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("total", _total);
 BA.debugLineNum = 297;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(256);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 298;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_date));
 BA.debugLineNum = 299;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(1024);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_date));
 BA.debugLineNum = 300;BA.debugLine="dotry = False";
Debug.ShouldStop(2048);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 301;BA.debugLine="trycount = 3";
Debug.ShouldStop(4096);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 302;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(8192);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 29:
//C
this.state = 32;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 306;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117702729",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",backgroundupdateservice.processBA)),0);
 BA.debugLineNum = 307;BA.debugLine="trycount = trycount +1";
Debug.ShouldStop(262144);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 311;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117702734",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",backgroundupdateservice.processBA)),0);
 BA.debugLineNum = 312;BA.debugLine="Log(\"Error downloading file \" & Filename)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117702735",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filename),0);
 BA.debugLineNum = 313;BA.debugLine="trycount = trycount +1";
Debug.ShouldStop(16777216);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;

case 35:
//C
this.state = 1;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 318;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(536870912);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 319;BA.debugLine="Return total";
Debug.ShouldStop(1073741824);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_total));return;};
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",backgroundupdateservice.processBA, e0.toString());}
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
public static RemoteObject  _insertalertnewrequests() throws Exception{
try {
		Debug.PushSubsStack("InsertAlertNewRequests (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,409);
if (RapidSub.canDelegate("insertalertnewrequests")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","insertalertnewrequests");}
RemoteObject _nrecord = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _alert_text = RemoteObject.createImmutable("");
int _x = 0;
RemoteObject _itemfromlist = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _intervencao = RemoteObject.createImmutable("");
RemoteObject _nomeobjecto = RemoteObject.createImmutable("");
RemoteObject _tipointervencao = RemoteObject.createImmutable("");
RemoteObject _numerocliente = RemoteObject.createImmutable("");
RemoteObject _nomecliente = RemoteObject.createImmutable("");
RemoteObject _estabelecimento = RemoteObject.createImmutable("");
RemoteObject _morada = RemoteObject.createImmutable("");
RemoteObject _cpostal = RemoteObject.createImmutable("");
RemoteObject _localidade = RemoteObject.createImmutable("");
RemoteObject _latitude = RemoteObject.createImmutable("");
RemoteObject _longitude = RemoteObject.createImmutable("");
RemoteObject _datareq = RemoteObject.createImmutable("");
RemoteObject _horareq = RemoteObject.createImmutable("");
RemoteObject _alertsloc = RemoteObject.createImmutable("");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _alerttagcode = RemoteObject.createImmutable("");
RemoteObject _ssql1 = RemoteObject.createImmutable("");
RemoteObject _ssql2 = RemoteObject.createImmutable("");
 BA.debugLineNum = 409;BA.debugLine="Sub InsertAlertNewRequests";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 411;BA.debugLine="Log(\"INSERT ALERTA BACKGROUNDUPDATESERVICE\")";
Debug.ShouldStop(67108864);
backgroundupdateservice.mostCurrent.__c.runVoidMethod ("LogImpl","6117899266",RemoteObject.createImmutable("INSERT ALERTA BACKGROUNDUPDATESERVICE"),0);
 BA.debugLineNum = 412;BA.debugLine="Private nRecord As Cursor";
Debug.ShouldStop(134217728);
_nrecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("nRecord", _nrecord);
 BA.debugLineNum = 413;BA.debugLine="If ShareCode.NewRequestsList.Size > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",backgroundupdateservice.mostCurrent._sharecode._newrequestslist /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 414;BA.debugLine="Dim Alert_text As String = \"\"";
Debug.ShouldStop(536870912);
_alert_text = BA.ObjectToString("");Debug.locals.put("Alert_text", _alert_text);Debug.locals.put("Alert_text", _alert_text);
 BA.debugLineNum = 415;BA.debugLine="For x=0 To ShareCode.NewRequestsList.Size -1";
Debug.ShouldStop(1073741824);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {backgroundupdateservice.mostCurrent._sharecode._newrequestslist /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step5 > 0 && _x <= limit5) || (step5 < 0 && _x >= limit5) ;_x = ((int)(0 + _x + step5))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 416;BA.debugLine="Dim ItemFromList As String = ShareCode.NewReque";
Debug.ShouldStop(-2147483648);
_itemfromlist = BA.ObjectToString(backgroundupdateservice.mostCurrent._sharecode._newrequestslist /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _x))));Debug.locals.put("ItemFromList", _itemfromlist);Debug.locals.put("ItemFromList", _itemfromlist);
 BA.debugLineNum = 418;BA.debugLine="Dim sSQL As String = $\"SELECT  t.title as tipoi";
Debug.ShouldStop(2);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT  t.title as tipointervencao , ifnull(o.title_import,'') as nomeobjecto , r.tagcode as intervencao ,\n"),RemoteObject.createImmutable("					r.entity_tagcode,p.title_import AS nomecliente,ifnull(p.reference, 'x') AS numerocliente,o.title_import AS estabelecimento,\n"),RemoteObject.createImmutable("					r.req_date as datareq, r.req_time as horareq, l.address as morada, l.postalcode as cpostal, l.local as localidade,\n"),RemoteObject.createImmutable("					l.latitude as latitude, l.longitude as longitude from dta_requests AS r\n"),RemoteObject.createImmutable("					INNER JOIN dta_typerequests AS t ON (t.tagcode = r.typerequest_tagcode)\n"),RemoteObject.createImmutable("					LEFT JOIN dta_objects AS o ON (o.tagcode = r.object_tagcode)\n"),RemoteObject.createImmutable("					LEFT JOIN dta_objects AS p ON (p.tagcode = r.entity_tagcode)\n"),RemoteObject.createImmutable("					LEFT JOIN dta_locations as l on (l.tagcode = p.local_tagcode)\n"),RemoteObject.createImmutable("					WHERE 1=1 and r.tagcode ='"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemfromlist.runMethod(true,"trim")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 428;BA.debugLine="nRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(2048);
_nrecord = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), backgroundupdateservice.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 430;BA.debugLine="If nRecord.RowCount > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_nrecord.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 431;BA.debugLine="nRecord.Position = 0";
Debug.ShouldStop(16384);
_nrecord.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 432;BA.debugLine="Dim intervencao As String = nRecord.GetString(";
Debug.ShouldStop(32768);
_intervencao = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("intervencao")));Debug.locals.put("intervencao", _intervencao);Debug.locals.put("intervencao", _intervencao);
 BA.debugLineNum = 433;BA.debugLine="Dim nomeobjecto As String = nRecord.GetString(";
Debug.ShouldStop(65536);
_nomeobjecto = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nomeobjecto")));Debug.locals.put("nomeobjecto", _nomeobjecto);Debug.locals.put("nomeobjecto", _nomeobjecto);
 BA.debugLineNum = 434;BA.debugLine="Dim tipointervencao As String = nRecord.GetStr";
Debug.ShouldStop(131072);
_tipointervencao = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tipointervencao")));Debug.locals.put("tipointervencao", _tipointervencao);Debug.locals.put("tipointervencao", _tipointervencao);
 BA.debugLineNum = 435;BA.debugLine="Dim numerocliente As String = nRecord.GetStrin";
Debug.ShouldStop(262144);
_numerocliente = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("numerocliente")));Debug.locals.put("numerocliente", _numerocliente);Debug.locals.put("numerocliente", _numerocliente);
 BA.debugLineNum = 436;BA.debugLine="Dim nomecliente As String = nRecord.GetString(";
Debug.ShouldStop(524288);
_nomecliente = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nomecliente")));Debug.locals.put("nomecliente", _nomecliente);Debug.locals.put("nomecliente", _nomecliente);
 BA.debugLineNum = 437;BA.debugLine="Dim estabelecimento As String = nRecord.GetStr";
Debug.ShouldStop(1048576);
_estabelecimento = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("estabelecimento")));Debug.locals.put("estabelecimento", _estabelecimento);Debug.locals.put("estabelecimento", _estabelecimento);
 BA.debugLineNum = 438;BA.debugLine="Dim morada As String = nRecord.GetString(\"mora";
Debug.ShouldStop(2097152);
_morada = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("morada")));Debug.locals.put("morada", _morada);Debug.locals.put("morada", _morada);
 BA.debugLineNum = 439;BA.debugLine="Dim cpostal As String = nRecord.GetString(\"cpo";
Debug.ShouldStop(4194304);
_cpostal = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cpostal")));Debug.locals.put("cpostal", _cpostal);Debug.locals.put("cpostal", _cpostal);
 BA.debugLineNum = 440;BA.debugLine="Dim localidade As String = nRecord.GetString(\"";
Debug.ShouldStop(8388608);
_localidade = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("localidade")));Debug.locals.put("localidade", _localidade);Debug.locals.put("localidade", _localidade);
 BA.debugLineNum = 441;BA.debugLine="Dim latitude As String = nRecord.GetString(\"la";
Debug.ShouldStop(16777216);
_latitude = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("latitude")));Debug.locals.put("latitude", _latitude);Debug.locals.put("latitude", _latitude);
 BA.debugLineNum = 442;BA.debugLine="Dim longitude As String = nRecord.GetString(\"l";
Debug.ShouldStop(33554432);
_longitude = _nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("longitude")));Debug.locals.put("longitude", _longitude);Debug.locals.put("longitude", _longitude);
 BA.debugLineNum = 443;BA.debugLine="Dim datareq As String = Utils.IfNullOrEmpty(nR";
Debug.ShouldStop(67108864);
_datareq = backgroundupdateservice.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("datareq")))),(Object)(backgroundupdateservice.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,backgroundupdateservice.processBA)));Debug.locals.put("datareq", _datareq);Debug.locals.put("datareq", _datareq);
 BA.debugLineNum = 444;BA.debugLine="Dim horareq As String = Utils.IfNullOrEmpty(nR";
Debug.ShouldStop(134217728);
_horareq = backgroundupdateservice.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_nrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("horareq")))),(Object)(backgroundupdateservice.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,backgroundupdateservice.processBA)));Debug.locals.put("horareq", _horareq);Debug.locals.put("horareq", _horareq);
 BA.debugLineNum = 445;BA.debugLine="If numerocliente = \"\" Then numerocliente = \"0\"";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_numerocliente,BA.ObjectToString(""))) { 
_numerocliente = BA.ObjectToString("0");Debug.locals.put("numerocliente", _numerocliente);};
 BA.debugLineNum = 446;BA.debugLine="Dim AlertsLoc As String = $\"${datareq} - ${hor";
Debug.ShouldStop(536870912);
_alertsloc = (RemoteObject.concat(RemoteObject.createImmutable(""),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datareq))),RemoteObject.createImmutable(" - "),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_horareq))),RemoteObject.createImmutable(" - "),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_latitude))),RemoteObject.createImmutable("/"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_longitude))),RemoteObject.createImmutable("")));Debug.locals.put("AlertsLoc", _alertsloc);Debug.locals.put("AlertsLoc", _alertsloc);
 BA.debugLineNum = 447;BA.debugLine="Alert_text = Alert_text & $\"${tipointervencao}";
Debug.ShouldStop(1073741824);
_alert_text = RemoteObject.concat(_alert_text,(RemoteObject.concat(RemoteObject.createImmutable(""),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tipointervencao))),RemoteObject.createImmutable(" - "),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nomeobjecto))),RemoteObject.createImmutable(" ("),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_intervencao))),RemoteObject.createImmutable(")"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((backgroundupdateservice.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_numerocliente))),RemoteObject.createImmutable(":"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nomecliente))),RemoteObject.createImmutable(""),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((backgroundupdateservice.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_estabelecimento))),RemoteObject.createImmutable(""))));Debug.locals.put("Alert_text", _alert_text);
 };
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 452;BA.debugLine="nRecord.close";
Debug.ShouldStop(8);
_nrecord.runVoidMethod ("Close");
 BA.debugLineNum = 453;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_a";
Debug.ShouldStop(16);
_mid = RemoteObject.solve(new RemoteObject[] {backgroundupdateservice.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("dta_alerts")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 454;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateT";
Debug.ShouldStop(32);
_alerttagcode = (RemoteObject.concat(RemoteObject.createImmutable(""),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((backgroundupdateservice.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(RemoteObject.createImmutable("ALERTINF_")))))),RemoteObject.createImmutable("")));Debug.locals.put("alerttagcode", _alerttagcode);Debug.locals.put("alerttagcode", _alerttagcode);
 BA.debugLineNum = 455;BA.debugLine="Dim sSQL1 As String = $\"insert into dta_alerts (";
Debug.ShouldStop(64);
_ssql1 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"),RemoteObject.createImmutable("							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"),RemoteObject.createImmutable("							values ("),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '', 'ALRTREL_REQUESTS', 'ALRTTYP_REQUESTS', 1, 1, '"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alert_text))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("		'"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((backgroundupdateservice.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("', '"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((backgroundupdateservice.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,backgroundupdateservice.processBA)))),RemoteObject.createImmutable("', '', 1, 1, 0, 0)")));Debug.locals.put("sSQL1", _ssql1);Debug.locals.put("sSQL1", _ssql1);
 BA.debugLineNum = 459;BA.debugLine="Utils.SaveSQLToLog(\"InsertAlertNewRequests\",sSQL";
Debug.ShouldStop(1024);
backgroundupdateservice.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("InsertAlertNewRequests")),(Object)(_ssql1),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 461;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_a";
Debug.ShouldStop(4096);
_mid = RemoteObject.solve(new RemoteObject[] {backgroundupdateservice.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("dta_alerts_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 462;BA.debugLine="Dim sSQL2 As String = $\"insert into dta_alerts_i";
Debug.ShouldStop(8192);
_ssql2 = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts_images\n"),RemoteObject.createImmutable("				(id, tagcode, imageb64, imagename, assigned, active, obs)\n"),RemoteObject.createImmutable("				values ("),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '', '', 0, 1, '"),backgroundupdateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alertsloc))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL2", _ssql2);Debug.locals.put("sSQL2", _ssql2);
 BA.debugLineNum = 465;BA.debugLine="Utils.SaveSQLToLog(\"InsertAlertNewRequests_obs\",";
Debug.ShouldStop(65536);
backgroundupdateservice.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("InsertAlertNewRequests_obs")),(Object)(_ssql2),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 467;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
Debug.ShouldStop(262144);
backgroundupdateservice.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",backgroundupdateservice.processBA,(Object)((backgroundupdateservice.mostCurrent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("BadgeCheckUpdate")));
 };
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeexecutesqlfiles(RemoteObject _script,RemoteObject _isupdate) throws Exception{
try {
		Debug.PushSubsStack("MakeExecuteSqlFiles (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,475);
if (RapidSub.canDelegate("makeexecutesqlfiles")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","makeexecutesqlfiles", _script, _isupdate);}
ResumableSub_MakeExecuteSqlFiles rsub = new ResumableSub_MakeExecuteSqlFiles(null,_script,_isupdate);
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
public static class ResumableSub_MakeExecuteSqlFiles extends BA.ResumableSub {
public ResumableSub_MakeExecuteSqlFiles(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _script,RemoteObject _isupdate) {
this.parent = parent;
this._script = _script;
this._isupdate = _isupdate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _script;
RemoteObject _isupdate;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeExecuteSqlFiles (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,475);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("script", _script);
Debug.locals.put("isupdate", _isupdate);
 BA.debugLineNum = 525;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private SqlFilesTotal As Int";
backgroundupdateservice._sqlfilestotal = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Private RequestFileName As String";
backgroundupdateservice._requestfilename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Private FTPFileList As List";
backgroundupdateservice._ftpfilelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 13;BA.debugLine="Private TagCodesString As String";
backgroundupdateservice._tagcodesstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Private RequestTagcodes  As String";
backgroundupdateservice._requesttagcodes = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _runliteupdate() throws Exception{
try {
		Debug.PushSubsStack("RunLiteUpdate (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,122);
if (RapidSub.canDelegate("runliteupdate")) { xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","runliteupdate"); return;}
ResumableSub_RunLiteUpdate rsub = new ResumableSub_RunLiteUpdate(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RunLiteUpdate extends BA.ResumableSub {
public ResumableSub_RunLiteUpdate(xevolution.vrcg.devdemov2400.backgroundupdateservice parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _generatecomplete = RemoteObject.createImmutable(false);
RemoteObject _update_install_info = RemoteObject.createImmutable("");
RemoteObject _updateinstallfilesname = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _finish = RemoteObject.createImmutable(false);
RemoteObject _isfilesdeleted = RemoteObject.createImmutable(false);
RemoteObject _isdownloadfilesfinish = RemoteObject.createImmutable(false);
RemoteObject _quicksyncdate = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RunLiteUpdate (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,122);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 124;BA.debugLine="Dim res As ResumableSub = GenerateLiteUpdateFiles";
Debug.ShouldStop(134217728);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _generateliteupdatefiles();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 125;BA.debugLine="Wait For(res) Complete (GenerateComplete As Boole";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_generatecomplete = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("GenerateComplete", _generatecomplete);
;
 BA.debugLineNum = 127;BA.debugLine="If (GenerateComplete) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 20;
if ((_generatecomplete).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 129;BA.debugLine="Dim UPDATE_INSTALL_INFO As String = $\"${RequestF";
Debug.ShouldStop(1);
_update_install_info = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._requestfilename))),RemoteObject.createImmutable(".INFO")));Debug.locals.put("UPDATE_INSTALL_INFO", _update_install_info);Debug.locals.put("UPDATE_INSTALL_INFO", _update_install_info);
 BA.debugLineNum = 130;BA.debugLine="Dim updateInstallFilesName As String = RequestFi";
Debug.ShouldStop(2);
_updateinstallfilesname = parent._requestfilename;Debug.locals.put("updateInstallFilesName", _updateinstallfilesname);Debug.locals.put("updateInstallFilesName", _updateinstallfilesname);
 BA.debugLineNum = 131;BA.debugLine="Dim res As ResumableSub = DownloadSqlFilesLiteUp";
Debug.ShouldStop(4);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _downloadsqlfilesliteupdate(_update_install_info,_updateinstallfilesname);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 132;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 134;BA.debugLine="If(result)Then";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 19;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 136;BA.debugLine="Dim res As ResumableSub = ExecuteSqlFiles(updat";
Debug.ShouldStop(128);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _executesqlfiles(_updateinstallfilesname);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 137;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 23;
return;
case 23:
//C
this.state = 7;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 139;BA.debugLine="If(finish)Then";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 18;
if ((_finish).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 140;BA.debugLine="SendServerProcessComplete";
Debug.ShouldStop(2048);
_sendserverprocesscomplete();
 BA.debugLineNum = 141;BA.debugLine="Dim res As ResumableSub = DeleteSqlFiles(updat";
Debug.ShouldStop(4096);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _deletesqlfiles(_updateinstallfilesname);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 142;BA.debugLine="Wait For(res) Complete (IsFilesDeleted As Bool";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 24;
return;
case 24:
//C
this.state = 10;
_isfilesdeleted = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("IsFilesDeleted", _isfilesdeleted);
;
 BA.debugLineNum = 144;BA.debugLine="If(IsFilesDeleted) Then";
Debug.ShouldStop(32768);
if (true) break;

case 10:
//if
this.state = 17;
if ((_isfilesdeleted).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 145;BA.debugLine="Dim res As ResumableSub = UpdateFilesWithFTP(";
Debug.ShouldStop(65536);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _updatefileswithftp(RemoteObject.createImmutable(""));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 146;BA.debugLine="Wait For(res) Complete (IsDownloadFilesFinish";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "runliteupdate"), _res);
this.state = 25;
return;
case 25:
//C
this.state = 13;
_isdownloadfilesfinish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("IsDownloadFilesFinish", _isdownloadfilesfinish);
;
 BA.debugLineNum = 148;BA.debugLine="If (IsDownloadFilesFinish) Then";
Debug.ShouldStop(524288);
if (true) break;

case 13:
//if
this.state = 16;
if ((_isdownloadfilesfinish).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 149;BA.debugLine="Dim QuickSyncDate As String = Utils.GetCurrD";
Debug.ShouldStop(1048576);
_quicksyncdate = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,backgroundupdateservice.processBA);Debug.locals.put("QuickSyncDate", _quicksyncdate);Debug.locals.put("QuickSyncDate", _quicksyncdate);
 BA.debugLineNum = 150;BA.debugLine="File.writestring(Starter.InternalFolder,$\"${";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_quicksync.def")))),(Object)(_quicksyncdate));
 if (true) break;

case 16:
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
this.state = 19;
;
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
 BA.debugLineNum = 158;BA.debugLine="End Sub";
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
public static RemoteObject  _sendserverprocesscomplete() throws Exception{
try {
		Debug.PushSubsStack("SendServerProcessComplete (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,831);
if (RapidSub.canDelegate("sendserverprocesscomplete")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","sendserverprocesscomplete");}
ResumableSub_SendServerProcessComplete rsub = new ResumableSub_SendServerProcessComplete(null);
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
public static class ResumableSub_SendServerProcessComplete extends BA.ResumableSub {
public ResumableSub_SendServerProcessComplete(xevolution.vrcg.devdemov2400.backgroundupdateservice parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SendServerProcessComplete (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,831);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 832;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(-2147483648);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/removeFilesSqlite")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 833;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 834;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(2);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("")),(Object)(backgroundupdateservice.getObject()));
 BA.debugLineNum = 835;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 836;BA.debugLine="params.Initialize";
Debug.ShouldStop(8);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 837;BA.debugLine="params.Clear";
Debug.ShouldStop(16);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 838;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 839;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 840;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 841;BA.debugLine="params.Put(\"name\", RequestFileName)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((parent._requestfilename)));
 BA.debugLineNum = 842;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 843;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 844;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 845;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 846;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 847;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 848;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 849;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(65536);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 850;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(131072);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 852;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(524288);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 854;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 855;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(4194304);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 857;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "sendserverprocesscomplete"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 858;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 859;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 861;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 863;BA.debugLine="Job.Release";
Debug.ShouldStop(1073741824);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 865;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 866;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,17);
if (RapidSub.canDelegate("service_create")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","service_create");}
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Service_Destroy (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,43);
if (RapidSub.canDelegate("service_destroy")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","service_destroy");}
 BA.debugLineNum = 43;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,21);
if (RapidSub.canDelegate("service_start")) { xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","service_start", _startingintent); return;}
ResumableSub_Service_Start rsub = new ResumableSub_Service_Start(null,_startingintent);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Service_Start extends BA.ResumableSub {
public ResumableSub_Service_Start(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _startingintent;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _isupdateavailable = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,21);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 27;BA.debugLine="Log(\"BackgroundUpdateService: First Time\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117309446",RemoteObject.createImmutable("BackgroundUpdateService: First Time"),0);
 BA.debugLineNum = 29;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) And Not(Start";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._runupdate /*RemoteObject*/ )))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 30;BA.debugLine="Dim res As ResumableSub = CheckIfUpdateIsAvailab";
Debug.ShouldStop(536870912);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _checkifupdateisavailable();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 31;BA.debugLine="Wait For(res) Complete (IsUpdateAvailable As Boo";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "service_start"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_isupdateavailable = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("IsUpdateAvailable", _isupdateavailable);
;
 BA.debugLineNum = 32;BA.debugLine="If IsUpdateAvailable Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 7;
if (_isupdateavailable.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 33;BA.debugLine="RunLiteUpdate";
Debug.ShouldStop(1);
_runliteupdate();
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 35;BA.debugLine="Log(\"BackgroundUpdateService: Verify\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6117309454",RemoteObject.createImmutable("BackgroundUpdateService: Verify"),0);
 BA.debugLineNum = 36;BA.debugLine="Service.StopAutomaticForeground 'Call this when";
Debug.ShouldStop(8);
parent.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 39;BA.debugLine="StartServiceAt(Me, DateTime.Now + 150 * 1000, Tru";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("StartServiceAt",backgroundupdateservice.processBA,(Object)(backgroundupdateservice.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(150),RemoteObject.createImmutable(1000)}, "+*",1, 2)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static RemoteObject  _updatefileswithftp(RemoteObject _datacontrol) throws Exception{
try {
		Debug.PushSubsStack("UpdateFilesWithFTP (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,618);
if (RapidSub.canDelegate("updatefileswithftp")) { return xevolution.vrcg.devdemov2400.backgroundupdateservice.remoteMe.runUserSub(false, "backgroundupdateservice","updatefileswithftp", _datacontrol);}
ResumableSub_UpdateFilesWithFTP rsub = new ResumableSub_UpdateFilesWithFTP(null,_datacontrol);
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
public static class ResumableSub_UpdateFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UpdateFilesWithFTP(xevolution.vrcg.devdemov2400.backgroundupdateservice parent,RemoteObject _datacontrol) {
this.parent = parent;
this._datacontrol = _datacontrol;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.backgroundupdateservice parent;
RemoteObject _datacontrol;
RemoteObject _current_counter = RemoteObject.createImmutable(0);
RemoteObject _end_counter = RemoteObject.createImmutable(0);
RemoteObject _datacontrolparse = RemoteObject.createImmutable(0L);
RemoteObject _flist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flisthtml = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _fname = RemoteObject.createImmutable("");
RemoteObject _ext = RemoteObject.createImmutable("");
RemoteObject _flistlast = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fname1 = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._downupfile");
RemoteObject _makecopy = RemoteObject.createImmutable(false);
RemoteObject _sf = RemoteObject.declareNull("Object");
int step29;
int limit29;
int step59;
int limit59;
int step72;
int limit72;
int step98;
int limit98;
int step112;
int limit112;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateFilesWithFTP (backgroundupdateservice) ","backgroundupdateservice",22,backgroundupdateservice.processBA,backgroundupdateservice.mostCurrent,618);
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
Debug.locals.put("datacontrol", _datacontrol);
 BA.debugLineNum = 619;BA.debugLine="Dim CURRENT_COUNTER As Int = 0";
Debug.ShouldStop(1024);
_current_counter = BA.numberCast(int.class, 0);Debug.locals.put("CURRENT_COUNTER", _current_counter);Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 620;BA.debugLine="Dim END_COUNTER As Int = 0";
Debug.ShouldStop(2048);
_end_counter = BA.numberCast(int.class, 0);Debug.locals.put("END_COUNTER", _end_counter);Debug.locals.put("END_COUNTER", _end_counter);
 BA.debugLineNum = 621;BA.debugLine="If (Not(Starter.FirstInstall)) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 136;
if ((parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._firstinstall /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 135;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 622;BA.debugLine="If (Utils.isNullOrEmpty(datacontrol)) Then";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_datacontrol))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 623;BA.debugLine="datacontrol = Utils.GetCurrDatetimeFixed 'Utils";
Debug.ShouldStop(16384);
_datacontrol = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimefixed" /*RemoteObject*/ ,backgroundupdateservice.processBA);Debug.locals.put("datacontrol", _datacontrol);
 if (true) break;
;
 BA.debugLineNum = 626;BA.debugLine="Try";
Debug.ShouldStop(131072);

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
 BA.debugLineNum = 627;BA.debugLine="Dim datacontrolParse As Long = DateTime.DatePar";
Debug.ShouldStop(262144);
_datacontrolparse = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_datacontrol));Debug.locals.put("datacontrolParse", _datacontrolparse);Debug.locals.put("datacontrolParse", _datacontrolparse);
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 629;BA.debugLine="Dim datacontrolParse As Long = DateTime.Now   '";
Debug.ShouldStop(1048576);
_datacontrolparse = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("datacontrolParse", _datacontrolparse);Debug.locals.put("datacontrolParse", _datacontrolparse);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 BA.debugLineNum = 636;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161426",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 637;BA.debugLine="Log($\" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${Sh";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161427",(RemoteObject.concat(RemoteObject.createImmutable(" 		DOWNLOAD : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 638;BA.debugLine="Log( $\"${ShareCode.APP_FTP_USER}@${ShareCode.APP";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161428",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 639;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161429",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 640;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
Debug.ShouldStop(-2147483648);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flist", _flist);
 BA.debugLineNum = 640;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
Debug.ShouldStop(-2147483648);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 641;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
Debug.ShouldStop(1);
_flisthtml = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flisthtml", _flisthtml);
 BA.debugLineNum = 641;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
Debug.ShouldStop(1);
_flisthtml.runVoidMethod ("Initialize");
 BA.debugLineNum = 643;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(4);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 644;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(8);
_globalftp.runVoidMethod ("Initialize",backgroundupdateservice.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 645;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(16);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 649;BA.debugLine="GlobalFTP.TimeoutMs =240000";
Debug.ShouldStop(256);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 661;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCo";
Debug.ShouldStop(1048576);
_sfl = _globalftp.runMethod(false,"List",backgroundupdateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 664;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "updatefileswithftp"), _sfl);
this.state = 137;
return;
case 137:
//C
this.state = 13;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 666;BA.debugLine="If Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 13:
//if
this.state = 133;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 132;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 671;BA.debugLine="If (Files.Length >= 1) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 16:
//if
this.state = 51;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 672;BA.debugLine="flist.Initialize";
Debug.ShouldStop(-2147483648);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 673;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(1);
if (true) break;

case 19:
//for
this.state = 50;
step29 = 1;
limit29 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 138;
if (true) break;

case 138:
//C
this.state = 50;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 21;
if (true) break;

case 139:
//C
this.state = 138;
_i = ((int)(0 + _i + step29)) ;
Debug.locals.put("i", _i);
if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 674;BA.debugLine="Dim fName As String = Files(i).Name";
Debug.ShouldStop(2);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 675;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWit";
Debug.ShouldStop(4);
if (true) break;

case 22:
//if
this.state = 49;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx")))))) { 
this.state = 24;
}else 
{ BA.debugLineNum = 687;BA.debugLine="Else If (fName.EndsWith(\".html\")) Then";
Debug.ShouldStop(16384);
if ((_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".html")))).<Boolean>get().booleanValue()) { 
this.state = 36;
}else {
this.state = 48;
}}
if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 679;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
Debug.ShouldStop(64);
_ext = _fname.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fname.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 680;BA.debugLine="If (Files(i).Timestamp >= datacontrolParse)";
Debug.ShouldStop(128);
if (true) break;

case 25:
//if
this.state = 34;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_datacontrolparse))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 681;BA.debugLine="Try";
Debug.ShouldStop(256);
if (true) break;

case 28:
//try
this.state = 33;
this.catchState = 32;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 33;
this.catchState = 32;
 BA.debugLineNum = 682;BA.debugLine="flist.Add(Types.MakeDownUpFile(Files(i).Na";
Debug.ShouldStop(512);
_flist.runVoidMethod ("Add",(Object)((parent.mostCurrent._types.runMethod(false,"_makedownupfile" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName")),(Object)(_ext),(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
 BA.debugLineNum = 684;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161474",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",backgroundupdateservice.processBA)),0);
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 49;
;
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 688;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
Debug.ShouldStop(32768);
_ext = _fname.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fname.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 689;BA.debugLine="If ((Files(i).Timestamp >= datacontrolParse)";
Debug.ShouldStop(65536);
if (true) break;

case 37:
//if
this.state = 46;
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_datacontrolparse)))) || RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT_")))))))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 690;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 40:
//try
this.state = 45;
this.catchState = 44;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 45;
this.catchState = 44;
 BA.debugLineNum = 691;BA.debugLine="flisthtml.Add(Types.MakeDownUpFile(Files(i";
Debug.ShouldStop(262144);
_flisthtml.runVoidMethod ("Add",(Object)((parent.mostCurrent._types.runMethod(false,"_makedownupfile" /*RemoteObject*/ ,backgroundupdateservice.processBA,(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName")),(Object)(_ext),(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 BA.debugLineNum = 693;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161483",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",backgroundupdateservice.processBA)),0);
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 if (true) break;

case 46:
//C
this.state = 49;
;
 if (true) break;

case 48:
//C
this.state = 49;
 if (true) break;

case 49:
//C
this.state = 139;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 51;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 702;BA.debugLine="If (flist.Size >=1) Then '.IsInitialized) Then";
Debug.ShouldStop(536870912);

case 51:
//if
this.state = 92;
if ((RemoteObject.solveBoolean("g",_flist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 53;
}else {
this.state = 91;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 703;BA.debugLine="Dim flistLast As List";
Debug.ShouldStop(1073741824);
_flistlast = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flistLast", _flistlast);
 BA.debugLineNum = 704;BA.debugLine="If Not(flistLast.IsInitialized) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 54:
//if
this.state = 57;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_flistlast.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 705;BA.debugLine="flistLast.Initialize";
Debug.ShouldStop(1);
_flistlast.runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 711;BA.debugLine="If (flist.Size>=1) Then";
Debug.ShouldStop(64);

case 57:
//if
this.state = 71;
if ((RemoteObject.solveBoolean("g",_flist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 712;BA.debugLine="For i=0 To flist.Size-1";
Debug.ShouldStop(128);
if (true) break;

case 60:
//for
this.state = 70;
step59 = 1;
limit59 = RemoteObject.solve(new RemoteObject[] {_flist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 140;
if (true) break;

case 140:
//C
this.state = 70;
if ((step59 > 0 && _i <= limit59) || (step59 < 0 && _i >= limit59)) this.state = 62;
if (true) break;

case 141:
//C
this.state = 140;
_i = ((int)(0 + _i + step59)) ;
Debug.locals.put("i", _i);
if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 713;BA.debugLine="Dim fName1 As DownUpFile = flist.Get(i)";
Debug.ShouldStop(256);
_fname1 = (_flist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName1", _fname1);Debug.locals.put("fName1", _fname1);
 BA.debugLineNum = 714;BA.debugLine="Dim makeCopy As Boolean = False";
Debug.ShouldStop(512);
_makecopy = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("makeCopy", _makecopy);Debug.locals.put("makeCopy", _makecopy);
 BA.debugLineNum = 723;BA.debugLine="If Not(File.Exists(Starter.InternalFolder, f";
Debug.ShouldStop(262144);
if (true) break;

case 63:
//if
this.state = 66;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname1.getField(true,"Filename" /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 724;BA.debugLine="makeCopy = True";
Debug.ShouldStop(524288);
_makecopy = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("makeCopy", _makecopy);
 if (true) break;
;
 BA.debugLineNum = 727;BA.debugLine="If (makeCopy) Then";
Debug.ShouldStop(4194304);

case 66:
//if
this.state = 69;
if ((_makecopy).<Boolean>get().booleanValue()) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 728;BA.debugLine="flistLast.Add(fName1.Filename)";
Debug.ShouldStop(8388608);
_flistlast.runVoidMethod ("Add",(Object)((_fname1.getField(true,"Filename" /*RemoteObject*/ ))));
 if (true) break;

case 69:
//C
this.state = 141;
;
 if (true) break;
if (true) break;

case 70:
//C
this.state = 71;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 736;BA.debugLine="If (flistLast.Size>=1) Then";
Debug.ShouldStop(-2147483648);

case 71:
//if
this.state = 89;
if ((RemoteObject.solveBoolean("g",_flistlast.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 73;
}else {
this.state = 88;
}if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 737;BA.debugLine="END_COUNTER = flistLast.Size-1";
Debug.ShouldStop(1);
_end_counter = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("END_COUNTER", _end_counter);
 BA.debugLineNum = 738;BA.debugLine="For i=0 To flistLast.Size-1";
Debug.ShouldStop(2);
if (true) break;

case 74:
//for
this.state = 86;
step72 = 1;
limit72 = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 142;
if (true) break;

case 142:
//C
this.state = 86;
if ((step72 > 0 && _i <= limit72) || (step72 < 0 && _i >= limit72)) this.state = 76;
if (true) break;

case 143:
//C
this.state = 142;
_i = ((int)(0 + _i + step72)) ;
Debug.locals.put("i", _i);
if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 739;BA.debugLine="Dim fName As String = flistLast.Get(i)";
Debug.ShouldStop(4);
_fname = BA.ObjectToString(_flistlast.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 741;BA.debugLine="Log(fName)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161531",_fname,0);
 BA.debugLineNum = 743;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(64);
_sf = _globalftp.runMethod(false,"DownloadFile",backgroundupdateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 744;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "updatefileswithftp"), _sf);
this.state = 144;
return;
case 144:
//C
this.state = 77;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 745;BA.debugLine="If Success Then";
Debug.ShouldStop(256);
if (true) break;

case 77:
//if
this.state = 82;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 79;
}else {
this.state = 81;
}if (true) break;

case 79:
//C
this.state = 82;
 BA.debugLineNum = 746;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161536",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 748;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161538",RemoteObject.createImmutable("Error downloading file"),0);
 if (true) break;
;
 BA.debugLineNum = 752;BA.debugLine="If (flistLast.Size-1 > CURRENT_COUNTER) Then";
Debug.ShouldStop(32768);

case 82:
//if
this.state = 85;
if ((RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, _current_counter)))) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 753;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER+1";
Debug.ShouldStop(65536);
_current_counter = RemoteObject.solve(new RemoteObject[] {_current_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CURRENT_COUNTER", _current_counter);
 if (true) break;

case 85:
//C
this.state = 143;
;
 if (true) break;
if (true) break;

case 86:
//C
this.state = 89;
Debug.locals.put("i", _i);
;
 if (true) break;

case 88:
//C
this.state = 89;
 BA.debugLineNum = 757;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(1048576);
_current_counter = _end_counter;Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 758;BA.debugLine="Log(\"vazio 0\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161548",RemoteObject.createImmutable("vazio 0"),0);
 if (true) break;

case 89:
//C
this.state = 92;
;
 if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 761;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(16777216);
_current_counter = _end_counter;Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 762;BA.debugLine="Log(\"vazio 1\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161552",RemoteObject.createImmutable("vazio 1"),0);
 if (true) break;
;
 BA.debugLineNum = 765;BA.debugLine="If (flisthtml.Size >=1) Then '.IsInitialized) T";
Debug.ShouldStop(268435456);

case 92:
//if
this.state = 130;
if ((RemoteObject.solveBoolean("g",_flisthtml.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 94;
}else {
this.state = 129;
}if (true) break;

case 94:
//C
this.state = 95;
 BA.debugLineNum = 766;BA.debugLine="Dim flistLast As List";
Debug.ShouldStop(536870912);
_flistlast = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flistLast", _flistlast);
 BA.debugLineNum = 767;BA.debugLine="flistLast.Initialize";
Debug.ShouldStop(1073741824);
_flistlast.runVoidMethod ("Initialize");
 BA.debugLineNum = 771;BA.debugLine="If (flisthtml.Size>=1) Then";
Debug.ShouldStop(4);
if (true) break;

case 95:
//if
this.state = 109;
if ((RemoteObject.solveBoolean("g",_flisthtml.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 772;BA.debugLine="For i=0 To flisthtml.Size-1";
Debug.ShouldStop(8);
if (true) break;

case 98:
//for
this.state = 108;
step98 = 1;
limit98 = RemoteObject.solve(new RemoteObject[] {_flisthtml.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 145;
if (true) break;

case 145:
//C
this.state = 108;
if ((step98 > 0 && _i <= limit98) || (step98 < 0 && _i >= limit98)) this.state = 100;
if (true) break;

case 146:
//C
this.state = 145;
_i = ((int)(0 + _i + step98)) ;
Debug.locals.put("i", _i);
if (true) break;

case 100:
//C
this.state = 101;
 BA.debugLineNum = 773;BA.debugLine="Dim fName1 As DownUpFile = flisthtml.Get(i)";
Debug.ShouldStop(16);
_fname1 = (_flisthtml.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName1", _fname1);Debug.locals.put("fName1", _fname1);
 BA.debugLineNum = 774;BA.debugLine="Dim makeCopy As Boolean = False";
Debug.ShouldStop(32);
_makecopy = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("makeCopy", _makecopy);Debug.locals.put("makeCopy", _makecopy);
 BA.debugLineNum = 775;BA.debugLine="If Not(File.Exists(Starter.InternalFolder, f";
Debug.ShouldStop(64);
if (true) break;

case 101:
//if
this.state = 104;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname1.getField(true,"Filename" /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
this.state = 103;
}if (true) break;

case 103:
//C
this.state = 104;
 BA.debugLineNum = 776;BA.debugLine="makeCopy = True";
Debug.ShouldStop(128);
_makecopy = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("makeCopy", _makecopy);
 if (true) break;
;
 BA.debugLineNum = 779;BA.debugLine="If (makeCopy) Then";
Debug.ShouldStop(1024);

case 104:
//if
this.state = 107;
if ((_makecopy).<Boolean>get().booleanValue()) { 
this.state = 106;
}if (true) break;

case 106:
//C
this.state = 107;
 BA.debugLineNum = 780;BA.debugLine="flistLast.Add(fName1.Filename)";
Debug.ShouldStop(2048);
_flistlast.runVoidMethod ("Add",(Object)((_fname1.getField(true,"Filename" /*RemoteObject*/ ))));
 if (true) break;

case 107:
//C
this.state = 146;
;
 if (true) break;
if (true) break;

case 108:
//C
this.state = 109;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 788;BA.debugLine="If (flistLast.Size>=1) Then";
Debug.ShouldStop(524288);

case 109:
//if
this.state = 127;
if ((RemoteObject.solveBoolean("g",_flistlast.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 111;
}else {
this.state = 126;
}if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 789;BA.debugLine="CURRENT_COUNTER = 0";
Debug.ShouldStop(1048576);
_current_counter = BA.numberCast(int.class, 0);Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 790;BA.debugLine="END_COUNTER = flistLast.Size-1";
Debug.ShouldStop(2097152);
_end_counter = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("END_COUNTER", _end_counter);
 BA.debugLineNum = 791;BA.debugLine="For i=0 To flistLast.Size-1";
Debug.ShouldStop(4194304);
if (true) break;

case 112:
//for
this.state = 124;
step112 = 1;
limit112 = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 147;
if (true) break;

case 147:
//C
this.state = 124;
if ((step112 > 0 && _i <= limit112) || (step112 < 0 && _i >= limit112)) this.state = 114;
if (true) break;

case 148:
//C
this.state = 147;
_i = ((int)(0 + _i + step112)) ;
Debug.locals.put("i", _i);
if (true) break;

case 114:
//C
this.state = 115;
 BA.debugLineNum = 792;BA.debugLine="Dim fName As String = flistLast.Get(i)";
Debug.ShouldStop(8388608);
_fname = BA.ObjectToString(_flistlast.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 794;BA.debugLine="Log(fName)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161584",_fname,0);
 BA.debugLineNum = 795;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(67108864);
_sf = _globalftp.runMethod(false,"DownloadFile",backgroundupdateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 796;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", backgroundupdateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "backgroundupdateservice", "updatefileswithftp"), _sf);
this.state = 149;
return;
case 149:
//C
this.state = 115;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 797;BA.debugLine="If Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 115:
//if
this.state = 120;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 117;
}else {
this.state = 119;
}if (true) break;

case 117:
//C
this.state = 120;
 BA.debugLineNum = 798;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161588",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 800;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161590",RemoteObject.createImmutable("Error downloading file"),0);
 if (true) break;
;
 BA.debugLineNum = 803;BA.debugLine="If (flistLast.Size-1 > CURRENT_COUNTER) Then";
Debug.ShouldStop(4);

case 120:
//if
this.state = 123;
if ((RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, _current_counter)))) { 
this.state = 122;
}if (true) break;

case 122:
//C
this.state = 123;
 BA.debugLineNum = 804;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER+1";
Debug.ShouldStop(8);
_current_counter = RemoteObject.solve(new RemoteObject[] {_current_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CURRENT_COUNTER", _current_counter);
 if (true) break;

case 123:
//C
this.state = 148;
;
 if (true) break;
if (true) break;

case 124:
//C
this.state = 127;
Debug.locals.put("i", _i);
;
 if (true) break;

case 126:
//C
this.state = 127;
 BA.debugLineNum = 808;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(128);
_current_counter = _end_counter;Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 809;BA.debugLine="Log(\"vazio 0\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161599",RemoteObject.createImmutable("vazio 0"),0);
 if (true) break;

case 127:
//C
this.state = 130;
;
 if (true) break;

case 129:
//C
this.state = 130;
 BA.debugLineNum = 812;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(2048);
_current_counter = _end_counter;Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 813;BA.debugLine="Log(\"vazio 1\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161603",RemoteObject.createImmutable("vazio 1"),0);
 if (true) break;

case 130:
//C
this.state = 133;
;
 if (true) break;

case 132:
//C
this.state = 133;
 BA.debugLineNum = 817;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(65536);
_current_counter = _end_counter;Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 818;BA.debugLine="Log(\"Sem sucesso!\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161608",RemoteObject.createImmutable("Sem sucesso!"),0);
 if (true) break;

case 133:
//C
this.state = 136;
;
 BA.debugLineNum = 822;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2097152);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 823;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 825;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(16777216);
_current_counter = _end_counter;Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 826;BA.debugLine="Log(\"vazio 2\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6118161616",RemoteObject.createImmutable("vazio 2"),0);
 if (true) break;

case 136:
//C
this.state = -1;
;
 BA.debugLineNum = 828;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 829;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",backgroundupdateservice.processBA, e0.toString());}
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