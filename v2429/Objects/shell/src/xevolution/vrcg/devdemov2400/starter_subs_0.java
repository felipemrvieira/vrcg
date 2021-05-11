package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",1,starter.processBA,starter.mostCurrent,672);
if (RapidSub.canDelegate("application_error")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 672;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 673;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 674;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _checkwebaccess() throws Exception{
try {
		Debug.PushSubsStack("CheckWebAccess (starter) ","starter",1,starter.processBA,starter.mostCurrent,680);
if (RapidSub.canDelegate("checkwebaccess")) { xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","checkwebaccess"); return;}
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
public ResumableSub_CheckWebAccess(xevolution.vrcg.devdemov2400.starter parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.starter parent;
RemoteObject _starttime = RemoteObject.createImmutable(0L);
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _prams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckWebAccess (starter) ","starter",1,starter.processBA,starter.mostCurrent,680);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 681;BA.debugLine="Dim startTime As Long = Utils.GetCurrentTicks";
Debug.ShouldStop(256);
_starttime = BA.numberCast(long.class, parent.mostCurrent._utils.runMethod(true,"_getcurrentticks" /*RemoteObject*/ ,starter.processBA));Debug.locals.put("startTime", _starttime);Debug.locals.put("startTime", _starttime);
 BA.debugLineNum = 682;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(512);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/timming")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 683;BA.debugLine="Dim Prams As Map";
Debug.ShouldStop(1024);
_prams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Prams", _prams);
 BA.debugLineNum = 684;BA.debugLine="Prams.Initialize";
Debug.ShouldStop(2048);
_prams.runVoidMethod ("Initialize");
 BA.debugLineNum = 685;BA.debugLine="Prams.Put(\"_first\", Utils.Bool2Int(FirstInstall))";
Debug.ShouldStop(4096);
_prams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_first"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,starter.processBA,(Object)(parent._firstinstall)))));
 BA.debugLineNum = 686;BA.debugLine="Prams.Put(\"authorization\", ShareCode.APP_Authoriz";
Debug.ShouldStop(8192);
_prams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 687;BA.debugLine="Prams.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16384);
_prams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 688;BA.debugLine="Log (ServerAddress)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61835016",_serveraddress,0);
 BA.debugLineNum = 689;BA.debugLine="Log(ShareCode.APP_Authorization)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61835017",parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ ,0);
 BA.debugLineNum = 690;BA.debugLine="Log(ShareCode.APP_TOKEN)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61835018",parent.mostCurrent._sharecode._app_token /*RemoteObject*/ ,0);
 BA.debugLineNum = 691;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(262144);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 692;BA.debugLine="JSON.Initialize(Prams)";
Debug.ShouldStop(524288);
_json.runVoidMethod ("Initialize",(Object)(_prams));
 BA.debugLineNum = 693;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(1048576);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 694;BA.debugLine="WEBISOK = False";
Debug.ShouldStop(2097152);
parent._webisok = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 695;BA.debugLine="Dim res  As ResumableSub = TestTheServer(ServerAd";
Debug.ShouldStop(4194304);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _testtheserver(_serveraddress,_data);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 696;BA.debugLine="Wait For(res) complete (finished As Boolean)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", starter.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "starter", "checkwebaccess"), _res);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 697;BA.debugLine="If finished Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 6;
if (_finished.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 701;BA.debugLine="WEBISOK = True";
Debug.ShouldStop(268435456);
parent._webisok = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 703;BA.debugLine="WEBISOK = False";
Debug.ShouldStop(1073741824);
parent._webisok = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 704;BA.debugLine="Log(\"Erro de identificação do servidor\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61835032",RemoteObject.createImmutable("Erro de identificação do servidor"),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 706;BA.debugLine="ShareCode.APP_WORKING_LOCAL = Not(WEBISOK)";
Debug.ShouldStop(2);
parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/  = parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._webisok));
 BA.debugLineNum = 708;BA.debugLine="Log($\"APP_WORKING_LOCAL: ${Utils.Bool2Int(ShareCo";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61835036",(RemoteObject.concat(RemoteObject.createImmutable("APP_WORKING_LOCAL: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,starter.processBA,(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ ))))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 710;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _clear_loc_userssession_table() throws Exception{
try {
		Debug.PushSubsStack("Clear_loc_userssession_Table (starter) ","starter",1,starter.processBA,starter.mostCurrent,659);
if (RapidSub.canDelegate("clear_loc_userssession_table")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","clear_loc_userssession_table");}
 BA.debugLineNum = 659;BA.debugLine="Sub Clear_loc_userssession_Table";
Debug.ShouldStop(262144);
 BA.debugLineNum = 660;BA.debugLine="If (LocalSQLWRK.IsInitialized) Then";
Debug.ShouldStop(524288);
if ((starter._localsqlwrk.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 661;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 662;BA.debugLine="DBUtils.ClearTable(LocalSQLWRK, \"loc_userssessi";
Debug.ShouldStop(2097152);
starter.mostCurrent._dbutils.runVoidMethod ("_cleartable" /*RemoteObject*/ ,starter.processBA,(Object)(starter._localsqlwrk),(Object)(RemoteObject.createImmutable("loc_userssession")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e5.toString()); BA.debugLineNum = 664;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","61638405",BA.ObjectToString(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 BA.debugLineNum = 665;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16777216);
starter.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA))));
 };
 };
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _copyandinitializeappstate() throws Exception{
try {
		Debug.PushSubsStack("CopyAndInitializeAppState (starter) ","starter",1,starter.processBA,starter.mostCurrent,601);
if (RapidSub.canDelegate("copyandinitializeappstate")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","copyandinitializeappstate");}
 BA.debugLineNum = 601;BA.debugLine="Sub CopyAndInitializeAppState";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 602;BA.debugLine="If Not(File.Exists(InternalFolder, \"AppState.set\"";
Debug.ShouldStop(33554432);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("AppState.set"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 603;BA.debugLine="File.Copy(File.DirAssets, \"AppState.set\", Intern";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("AppState.set")),(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("AppState.set")));
 };
 BA.debugLineNum = 606;BA.debugLine="If Not(AppState.IsInitialized) Then";
Debug.ShouldStop(536870912);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter._appstate.runMethod(true,"IsInitialized" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 607;BA.debugLine="AppState.Initialize(InternalFolder, \"AppState.se";
Debug.ShouldStop(1073741824);
starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("AppState.set")));
 BA.debugLineNum = 608;BA.debugLine="AppState.SetAutoFlush(True)";
Debug.ShouldStop(-2147483648);
starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_setautoflush" /*RemoteObject*/ ,(Object)(starter.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _copyandinitializedatabases() throws Exception{
try {
		Debug.PushSubsStack("CopyAndInitializeDatabases (starter) ","starter",1,starter.processBA,starter.mostCurrent,496);
if (RapidSub.canDelegate("copyandinitializedatabases")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","copyandinitializedatabases");}
 BA.debugLineNum = 496;BA.debugLine="Sub CopyAndInitializeDatabases";
Debug.ShouldStop(32768);
 BA.debugLineNum = 497;BA.debugLine="If Not(File.Exists(SharedFolder, \"orion.db\")) The";
Debug.ShouldStop(65536);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("orion.db"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 498;BA.debugLine="File.Copy(File.DirAssets, \"orion.db\", SharedFold";
Debug.ShouldStop(131072);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("orion.db")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("orion.db")));
 };
 BA.debugLineNum = 500;BA.debugLine="If Not(File.Exists(SharedFolder, \"evolutioncheck.";
Debug.ShouldStop(524288);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 501;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\",";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 };
 BA.debugLineNum = 503;BA.debugLine="If Not(File.Exists(SharedFolder, \"worker.db\")) Th";
Debug.ShouldStop(4194304);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("worker.db"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 504;BA.debugLine="File.Copy(File.DirAssets, \"worker.db\", SharedFol";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("worker.db")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("worker.db")));
 };
 BA.debugLineNum = 506;BA.debugLine="If Not(LocalSQL.IsInitialized) Then LocalSQL.Init";
Debug.ShouldStop(33554432);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter._localsql.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
starter._localsql.runVoidMethod ("Initialize",(Object)(starter._sharedfolder),(Object)(BA.ObjectToString("orion.db")),(Object)(starter.mostCurrent.__c.getField(true,"True")));};
 BA.debugLineNum = 507;BA.debugLine="If Not(LocalSQLEVC.IsInitialized) Then LocalSQLEV";
Debug.ShouldStop(67108864);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter._localsqlevc.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
starter._localsqlevc.runVoidMethod ("Initialize",(Object)(starter._sharedfolder),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(starter.mostCurrent.__c.getField(true,"True")));};
 BA.debugLineNum = 508;BA.debugLine="If Not(LocalSQLWRK.IsInitialized) Then LocalSQLWR";
Debug.ShouldStop(134217728);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter._localsqlwrk.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
starter._localsqlwrk.runVoidMethod ("Initialize",(Object)(starter._sharedfolder),(Object)(BA.ObjectToString("worker.db")),(Object)(starter.mostCurrent.__c.getField(true,"True")));};
 BA.debugLineNum = 509;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _copyfiles() throws Exception{
try {
		Debug.PushSubsStack("CopyFiles (starter) ","starter",1,starter.processBA,starter.mostCurrent,335);
if (RapidSub.canDelegate("copyfiles")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","copyfiles");}
 BA.debugLineNum = 335;BA.debugLine="Sub CopyFiles";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="If Not(File.Exists(SharedFolder, \"template1.html\"";
Debug.ShouldStop(32768);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template1.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 337;BA.debugLine="File.Copy(File.DirAssets, \"template1.html\", Shar";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template1.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template1.html")));
 };
 BA.debugLineNum = 340;BA.debugLine="If Not(File.Exists(SharedFolder, \"template_edp.ht";
Debug.ShouldStop(524288);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_edp.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 341;BA.debugLine="File.Copy(File.DirAssets, \"template_edp.html\", S";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template_edp.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_edp.html")));
 };
 BA.debugLineNum = 344;BA.debugLine="If Not(File.Exists(SharedFolder, \"template20.html";
Debug.ShouldStop(8388608);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 345;BA.debugLine="File.Copy(File.DirAssets, \"template20.html\", Sha";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template20.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20.html")));
 };
 BA.debugLineNum = 348;BA.debugLine="If Not(File.Exists(SharedFolder, \"template2.html\"";
Debug.ShouldStop(134217728);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template2.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 349;BA.debugLine="File.Copy(File.DirAssets, \"template2.html\", Shar";
Debug.ShouldStop(268435456);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template2.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template2.html")));
 };
 BA.debugLineNum = 352;BA.debugLine="If Not(File.Exists(SharedFolder, \"template3.html\"";
Debug.ShouldStop(-2147483648);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template3.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 353;BA.debugLine="File.Copy(File.DirAssets, \"template3.html\", Shar";
Debug.ShouldStop(1);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template3.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template3.html")));
 };
 BA.debugLineNum = 356;BA.debugLine="If Not(File.Exists(SharedFolder, \"template4.html\"";
Debug.ShouldStop(8);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template4.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 357;BA.debugLine="File.Copy(File.DirAssets, \"template4.html\", Shar";
Debug.ShouldStop(16);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template4.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template4.html")));
 };
 BA.debugLineNum = 360;BA.debugLine="If Not(File.Exists(SharedFolder, \"template5A.html";
Debug.ShouldStop(128);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template5A.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 361;BA.debugLine="File.Copy(File.DirAssets, \"template5A.html\", Sha";
Debug.ShouldStop(256);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template5A.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template5A.html")));
 };
 BA.debugLineNum = 364;BA.debugLine="If Not(File.Exists(SharedFolder, \"template5.html\"";
Debug.ShouldStop(2048);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template5.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 365;BA.debugLine="File.Copy(File.DirAssets, \"template5.html\", Shar";
Debug.ShouldStop(4096);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template5.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template5.html")));
 };
 BA.debugLineNum = 368;BA.debugLine="If Not(File.Exists(SharedFolder, \"template6.html\"";
Debug.ShouldStop(32768);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template6.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 369;BA.debugLine="File.Copy(File.DirAssets, \"template6.html\", Shar";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template6.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template6.html")));
 };
 BA.debugLineNum = 372;BA.debugLine="If Not(File.Exists(SharedFolder, \"template7.html\"";
Debug.ShouldStop(524288);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template7.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 373;BA.debugLine="File.Copy(File.DirAssets, \"template7.html\", Shar";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template7.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template7.html")));
 };
 BA.debugLineNum = 376;BA.debugLine="If Not(File.Exists(SharedFolder, \"template6A.html";
Debug.ShouldStop(8388608);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template6A.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 377;BA.debugLine="File.Copy(File.DirAssets, \"template6A.html\", Sha";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template6A.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template6A.html")));
 };
 BA.debugLineNum = 380;BA.debugLine="If Not(File.Exists(SharedFolder, \"template7A.html";
Debug.ShouldStop(134217728);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template7A.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 381;BA.debugLine="File.Copy(File.DirAssets, \"template7A.html\", Sha";
Debug.ShouldStop(268435456);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template7A.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template7A.html")));
 };
 BA.debugLineNum = 384;BA.debugLine="If Not(File.Exists(SharedFolder, \"template9.html\"";
Debug.ShouldStop(-2147483648);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template9.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 385;BA.debugLine="File.Copy(File.DirAssets, \"template9.html\", Shar";
Debug.ShouldStop(1);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template9.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template9.html")));
 };
 BA.debugLineNum = 388;BA.debugLine="If Not(File.Exists(SharedFolder, \"template10.html";
Debug.ShouldStop(8);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template10.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 389;BA.debugLine="File.Copy(File.DirAssets, \"template10.html\", Sha";
Debug.ShouldStop(16);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template10.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template10.html")));
 };
 BA.debugLineNum = 392;BA.debugLine="If Not(File.Exists(SharedFolder, \"template12.html";
Debug.ShouldStop(128);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 393;BA.debugLine="File.Copy(File.DirAssets, \"template12.html\", Sha";
Debug.ShouldStop(256);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template12.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12.html")));
 };
 BA.debugLineNum = 396;BA.debugLine="If Not(File.Exists(SharedFolder, \"template12heade";
Debug.ShouldStop(2048);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12header.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 397;BA.debugLine="File.Copy(File.DirAssets, \"template12header.html";
Debug.ShouldStop(4096);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template12header.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12header.html")));
 };
 BA.debugLineNum = 400;BA.debugLine="If Not(File.Exists(SharedFolder, \"template12foote";
Debug.ShouldStop(32768);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12footer.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 401;BA.debugLine="File.Copy(File.DirAssets, \"template12footer.html";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template12footer.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12footer.html")));
 };
 BA.debugLineNum = 404;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_header.htm";
Debug.ShouldStop(524288);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_header.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 405;BA.debugLine="File.Copy(File.DirAssets, \"page_header.html\", Sh";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_header.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_header.html")));
 };
 BA.debugLineNum = 408;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_footer.htm";
Debug.ShouldStop(8388608);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_footer.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 409;BA.debugLine="File.Copy(File.DirAssets, \"page_footer.html\", Sh";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_footer.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_footer.html")));
 };
 BA.debugLineNum = 412;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_content.ht";
Debug.ShouldStop(134217728);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 413;BA.debugLine="File.Copy(File.DirAssets, \"page_content.html\", S";
Debug.ShouldStop(268435456);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_content.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content.html")));
 };
 BA.debugLineNum = 416;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_identifica";
Debug.ShouldStop(-2147483648);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_first.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 417;BA.debugLine="File.Copy(File.DirAssets, \"page_identification_f";
Debug.ShouldStop(1);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_identification_first.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_first.html")));
 };
 BA.debugLineNum = 420;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_identifica";
Debug.ShouldStop(8);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_first_score.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 421;BA.debugLine="File.Copy(File.DirAssets, \"page_identification_f";
Debug.ShouldStop(16);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_identification_first_score.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_first_score.html")));
 };
 BA.debugLineNum = 424;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_identifica";
Debug.ShouldStop(128);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_next.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 425;BA.debugLine="File.Copy(File.DirAssets, \"page_identification_n";
Debug.ShouldStop(256);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_identification_next.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_next.html")));
 };
 BA.debugLineNum = 428;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_identifica";
Debug.ShouldStop(2048);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_last.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 429;BA.debugLine="File.Copy(File.DirAssets, \"page_identification_l";
Debug.ShouldStop(4096);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_identification_last.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_last.html")));
 };
 BA.debugLineNum = 432;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_content_im";
Debug.ShouldStop(32768);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_images.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 433;BA.debugLine="File.Copy(File.DirAssets, \"page_content_images.h";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_content_images.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_images.html")));
 };
 BA.debugLineNum = 435;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_content_no";
Debug.ShouldStop(262144);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_nonconformities.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 436;BA.debugLine="File.Copy(File.DirAssets, \"page_content_nonconfo";
Debug.ShouldStop(524288);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_content_nonconformities.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_nonconformities.html")));
 };
 BA.debugLineNum = 439;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_content_ob";
Debug.ShouldStop(4194304);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_observations.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 440;BA.debugLine="File.Copy(File.DirAssets, \"page_content_observat";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_content_observations.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_observations.html")));
 };
 BA.debugLineNum = 443;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_signature.";
Debug.ShouldStop(67108864);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_signature.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 444;BA.debugLine="File.Copy(File.DirAssets, \"page_signature.html\",";
Debug.ShouldStop(134217728);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_signature.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_signature.html")));
 };
 BA.debugLineNum = 447;BA.debugLine="If Not(File.Exists(SharedFolder, \"template20_VSto";
Debug.ShouldStop(1073741824);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20_VStorage.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 448;BA.debugLine="File.Copy(File.DirAssets, \"template20_VStorage.h";
Debug.ShouldStop(-2147483648);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template20_VStorage.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20_VStorage.html")));
 };
 BA.debugLineNum = 451;BA.debugLine="If Not(File.Exists(SharedFolder, \"template20_VCam";
Debug.ShouldStop(4);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20_VCampervans.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 452;BA.debugLine="File.Copy(File.DirAssets, \"template20_VCampervan";
Debug.ShouldStop(8);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template20_VCampervans.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20_VCampervans.html")));
 };
 BA.debugLineNum = 455;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_id_resopre";
Debug.ShouldStop(64);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_id_resopre_first.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 456;BA.debugLine="File.Copy(File.DirAssets, \"page_id_resopre_first";
Debug.ShouldStop(128);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_id_resopre_first.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_id_resopre_first.html")));
 };
 BA.debugLineNum = 459;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_resopre_fo";
Debug.ShouldStop(1024);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_resopre_footer.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 460;BA.debugLine="File.Copy(File.DirAssets, \"page_resopre_footer.h";
Debug.ShouldStop(2048);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_resopre_footer.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_resopre_footer.html")));
 };
 BA.debugLineNum = 463;BA.debugLine="If Not(File.Exists(SharedFolder, \"page_resopre_he";
Debug.ShouldStop(16384);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_resopre_header.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 464;BA.debugLine="File.Copy(File.DirAssets, \"page_resopre_header.h";
Debug.ShouldStop(32768);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("page_resopre_header.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_resopre_header.html")));
 };
 BA.debugLineNum = 467;BA.debugLine="If Not(File.Exists(SharedFolder, \"template_resopr";
Debug.ShouldStop(262144);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_resopre_group.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 468;BA.debugLine="File.Copy(File.DirAssets, \"template_resopre_grou";
Debug.ShouldStop(524288);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template_resopre_group.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_resopre_group.html")));
 };
 BA.debugLineNum = 471;BA.debugLine="If Not(File.Exists(SharedFolder, \"acail_distribui";
Debug.ShouldStop(4194304);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("acail_distribuicao_epis.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 472;BA.debugLine="File.Copy(File.DirAssets, \"acail_distribuicao_ep";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("acail_distribuicao_epis.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("acail_distribuicao_epis.html")));
 };
 BA.debugLineNum = 475;BA.debugLine="If Not(File.Exists(SharedFolder, \"acail_reg_despe";
Debug.ShouldStop(67108864);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("acail_reg_despesa.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 476;BA.debugLine="File.Copy(File.DirAssets, \"acail_reg_despesa.htm";
Debug.ShouldStop(134217728);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("acail_reg_despesa.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("acail_reg_despesa.html")));
 };
 BA.debugLineNum = 479;BA.debugLine="If Not(File.Exists(SharedFolder, \"template_limper";
Debug.ShouldStop(1073741824);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_limpersado_guia.html"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 480;BA.debugLine="File.Copy(File.DirAssets, \"template_limpersado_g";
Debug.ShouldStop(-2147483648);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("template_limpersado_guia.html")),(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_limpersado_guia.html")));
 };
 BA.debugLineNum = 483;BA.debugLine="If Not(File.Exists(InternalFolder, \"CROQUI.png\"))";
Debug.ShouldStop(4);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("CROQUI.png"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 484;BA.debugLine="File.Copy(File.DirAssets, \"CROQUI.png\", Internal";
Debug.ShouldStop(8);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("CROQUI.png")),(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("CROQUI.png")));
 };
 BA.debugLineNum = 487;BA.debugLine="If Not(File.Exists(InternalFolder, \"logo_monocrom";
Debug.ShouldStop(64);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("logo_monocromatico.png"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 488;BA.debugLine="File.Copy(File.DirAssets, \"logo_monocromatico.pn";
Debug.ShouldStop(128);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("logo_monocromatico.png")),(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("logo_monocromatico.png")));
 };
 BA.debugLineNum = 491;BA.debugLine="If Not(File.Exists(InternalFolder, \"logo_monocrom";
Debug.ShouldStop(1024);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("logo_monocromatico_mono.png"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 492;BA.debugLine="File.Copy(File.DirAssets, \"logo_monocromatico_mo";
Debug.ShouldStop(2048);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("logo_monocromatico_mono.png")),(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("logo_monocromatico_mono.png")));
 };
 BA.debugLineNum = 494;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create_dbchanges_table() throws Exception{
try {
		Debug.PushSubsStack("Create_dbchanges_Table (starter) ","starter",1,starter.processBA,starter.mostCurrent,178);
if (RapidSub.canDelegate("create_dbchanges_table")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","create_dbchanges_table");}
 BA.debugLineNum = 178;BA.debugLine="Sub Create_dbchanges_Table";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="If Not(DBUtils.TableExists(LocalSQLWRK, \"dbchange";
Debug.ShouldStop(262144);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent._dbutils.runMethod(true,"_tableexists" /*RemoteObject*/ ,starter.processBA,(Object)(starter._localsqlwrk),(Object)(RemoteObject.createImmutable("dbchanges"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 180;BA.debugLine="LocalSQLWRK.ExecNonQuery($\"CREATE TABLE `dbchang";
Debug.ShouldStop(524288);
starter._localsqlwrk.runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE `dbchanges` (\n"),RemoteObject.createImmutable("						`id` INT(10) NOT NULL,\n"),RemoteObject.createImmutable("						`app_version` VARCHAR(50) NOT NULL DEFAULT 'VERSION_',\n"),RemoteObject.createImmutable("						`tablename` VARCHAR(50) NOT NULL DEFAULT '',\n"),RemoteObject.createImmutable("						`datechange` DATE NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						`script` TEXT NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						`titlenotes` VARCHAR(100) NULL DEFAULT '',\n"),RemoteObject.createImmutable("						`created_at` TIMESTAMP NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						`updated_at` TIMESTAMP NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						`active` TINYINT(4) NOT NULL DEFAULT '1',\n"),RemoteObject.createImmutable("						`updated` TINYINT(4) NOT NULL DEFAULT '0',\n"),RemoteObject.createImmutable("						`dateupdate` DATE NULL DEFAULT NULL,\n"),RemoteObject.createImmutable("						PRIMARY KEY (`id`, `app_version`, `tablename`) \n"),RemoteObject.createImmutable("					);")))));
 };
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcpbuttons() throws Exception{
try {
		Debug.PushSubsStack("CreateCPButtons (starter) ","starter",1,starter.processBA,starter.mostCurrent,635);
if (RapidSub.canDelegate("createcpbuttons")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","createcpbuttons");}
 BA.debugLineNum = 635;BA.debugLine="Sub CreateCPButtons";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 636;BA.debugLine="CPButtons = Types.MakeComposedButtonDefs(Consts.W";
Debug.ShouldStop(134217728);
starter._cpbuttons = starter.mostCurrent._types.runMethod(false,"_makecomposedbuttondefs" /*RemoteObject*/ ,starter.processBA,(Object)(starter.mostCurrent._consts._whitesoftdusk /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._darkgray /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._blacknoalpha /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._whitesoftdusk /*RemoteObject*/ ),(Object)(starter._keepcolormain),(Object)(starter._keepcolorsub),(Object)(starter.mostCurrent._consts._colormain /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 640;BA.debugLine="CPButtonsOFF = Types.MakeComposedButtonDefs(Const";
Debug.ShouldStop(-2147483648);
starter._cpbuttonsoff = starter.mostCurrent._types.runMethod(false,"_makecomposedbuttondefs" /*RemoteObject*/ ,starter.processBA,(Object)(starter.mostCurrent._consts._whitesoftdusk /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._darkgray /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._blacknoalpha /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._whitesoftdusk /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._darkgray /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._darkgray /*RemoteObject*/ ),(Object)(starter.mostCurrent._consts._darkgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletefiles() throws Exception{
try {
		Debug.PushSubsStack("DeleteFiles (starter) ","starter",1,starter.processBA,starter.mostCurrent,197);
if (RapidSub.canDelegate("deletefiles")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","deletefiles");}
 BA.debugLineNum = 197;BA.debugLine="Sub DeleteFiles";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="If File.Exists(SharedFolder, \"template_edp.html\")";
Debug.ShouldStop(32);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_edp.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 199;BA.debugLine="File.Delete(SharedFolder, \"template_edp.html\" )";
Debug.ShouldStop(64);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_edp.html")));
 };
 BA.debugLineNum = 202;BA.debugLine="If Not(File.Exists(InternalFolder, \"vazio.png\"))";
Debug.ShouldStop(512);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("vazio.png"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 203;BA.debugLine="File.Copy(File.DirAssets, \"vazio.png\", InternalF";
Debug.ShouldStop(1024);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("vazio.png")),(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("vazio.png")));
 };
 BA.debugLineNum = 206;BA.debugLine="If File.Exists(SharedFolder, \"template2.html\") Th";
Debug.ShouldStop(8192);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template2.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 207;BA.debugLine="File.Delete(SharedFolder, \"template2.html\" )";
Debug.ShouldStop(16384);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template2.html")));
 };
 BA.debugLineNum = 210;BA.debugLine="If File.Exists(SharedFolder, \"template4.html\") Th";
Debug.ShouldStop(131072);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template4.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 211;BA.debugLine="File.Delete(SharedFolder, \"template4.html\" )";
Debug.ShouldStop(262144);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template4.html")));
 };
 BA.debugLineNum = 214;BA.debugLine="If File.Exists(SharedFolder, \"template5.html\") Th";
Debug.ShouldStop(2097152);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template5.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 215;BA.debugLine="File.Delete(SharedFolder, \"template5.html\" )";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template5.html")));
 };
 BA.debugLineNum = 218;BA.debugLine="If File.Exists(SharedFolder, \"template5A.html\") T";
Debug.ShouldStop(33554432);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template5A.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 219;BA.debugLine="File.Delete(SharedFolder, \"template5A.html\" )";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template5A.html")));
 };
 BA.debugLineNum = 222;BA.debugLine="If File.Exists(SharedFolder, \"template9.html\") Th";
Debug.ShouldStop(536870912);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template9.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 223;BA.debugLine="File.Delete(SharedFolder, \"template9.html\" )";
Debug.ShouldStop(1073741824);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template9.html")));
 };
 BA.debugLineNum = 226;BA.debugLine="If File.Exists(SharedFolder, \"template10.html\") T";
Debug.ShouldStop(2);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template10.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 227;BA.debugLine="File.Delete(SharedFolder, \"template10.html\" )";
Debug.ShouldStop(4);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template10.html")));
 };
 BA.debugLineNum = 230;BA.debugLine="If File.Exists(SharedFolder, \"template12.html\") T";
Debug.ShouldStop(32);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 231;BA.debugLine="File.Delete(SharedFolder, \"template12.html\" )";
Debug.ShouldStop(64);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12.html")));
 };
 BA.debugLineNum = 234;BA.debugLine="If File.Exists(SharedFolder, \"template12header.ht";
Debug.ShouldStop(512);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12header.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 235;BA.debugLine="File.Delete(SharedFolder, \"template12header.html";
Debug.ShouldStop(1024);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12header.html")));
 };
 BA.debugLineNum = 238;BA.debugLine="If File.Exists(SharedFolder, \"template12footer.ht";
Debug.ShouldStop(8192);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12footer.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 239;BA.debugLine="File.Delete(SharedFolder, \"template12footer.html";
Debug.ShouldStop(16384);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template12footer.html")));
 };
 BA.debugLineNum = 242;BA.debugLine="If File.Exists(SharedFolder, \"page_header.html\")";
Debug.ShouldStop(131072);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_header.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 243;BA.debugLine="File.Delete(SharedFolder, \"page_header.html\" )";
Debug.ShouldStop(262144);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_header.html")));
 };
 BA.debugLineNum = 246;BA.debugLine="If File.Exists(SharedFolder, \"page_footer.html\")";
Debug.ShouldStop(2097152);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_footer.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 247;BA.debugLine="File.Delete(SharedFolder, \"page_footer.html\" )";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_footer.html")));
 };
 BA.debugLineNum = 250;BA.debugLine="If File.Exists(SharedFolder, \"page_content.html\")";
Debug.ShouldStop(33554432);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 251;BA.debugLine="File.Delete(SharedFolder, \"page_content.html\" )";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content.html")));
 };
 BA.debugLineNum = 254;BA.debugLine="If File.Exists(SharedFolder, \"page_identification";
Debug.ShouldStop(536870912);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_first.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 255;BA.debugLine="File.Delete(SharedFolder, \"page_identification_f";
Debug.ShouldStop(1073741824);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_first.html")));
 };
 BA.debugLineNum = 258;BA.debugLine="If File.Exists(SharedFolder, \"age_identification_";
Debug.ShouldStop(2);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("age_identification_first_score.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 259;BA.debugLine="File.Delete(SharedFolder, \"age_identification_fi";
Debug.ShouldStop(4);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("age_identification_first_score.html")));
 };
 BA.debugLineNum = 262;BA.debugLine="If File.Exists(SharedFolder, \"page_identification";
Debug.ShouldStop(32);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_next.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 263;BA.debugLine="File.Delete(SharedFolder, \"page_identification_n";
Debug.ShouldStop(64);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_next.html")));
 };
 BA.debugLineNum = 266;BA.debugLine="If File.Exists(SharedFolder, \"page_identification";
Debug.ShouldStop(512);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_last.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 267;BA.debugLine="File.Delete(SharedFolder, \"page_identification_l";
Debug.ShouldStop(1024);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_identification_last.html")));
 };
 BA.debugLineNum = 270;BA.debugLine="If File.Exists(SharedFolder, \"page_content_images";
Debug.ShouldStop(8192);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_images.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 271;BA.debugLine="File.Delete(SharedFolder, \"page_content_images.h";
Debug.ShouldStop(16384);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_images.html")));
 };
 BA.debugLineNum = 274;BA.debugLine="If File.Exists(SharedFolder, \"page_content_noncon";
Debug.ShouldStop(131072);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_nonconformities.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 275;BA.debugLine="File.Delete(SharedFolder, \"page_content_nonconfo";
Debug.ShouldStop(262144);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_nonconformities.html")));
 };
 BA.debugLineNum = 278;BA.debugLine="If File.Exists(SharedFolder, \"page_content_observ";
Debug.ShouldStop(2097152);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_observations.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 279;BA.debugLine="File.Delete(SharedFolder, \"page_content_observat";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_content_observations.html")));
 };
 BA.debugLineNum = 282;BA.debugLine="If File.Exists(SharedFolder, \"page_signature.html";
Debug.ShouldStop(33554432);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_signature.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 283;BA.debugLine="File.Delete(SharedFolder, \"page_signature.html\"";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_signature.html")));
 };
 BA.debugLineNum = 286;BA.debugLine="If File.Exists(SharedFolder, \"template20.html\") T";
Debug.ShouldStop(536870912);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 287;BA.debugLine="File.Delete(SharedFolder, \"template20.html\" )";
Debug.ShouldStop(1073741824);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20.html")));
 };
 BA.debugLineNum = 290;BA.debugLine="If File.Exists(InternalFolder, \"CROQUI.png\") Then";
Debug.ShouldStop(2);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("CROQUI.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 291;BA.debugLine="File.Delete(InternalFolder, \"CROQUI.png\" )";
Debug.ShouldStop(4);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("CROQUI.png")));
 };
 BA.debugLineNum = 294;BA.debugLine="If File.Exists(InternalFolder, \"logo_monocromatic";
Debug.ShouldStop(32);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("logo_monocromatico.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 295;BA.debugLine="File.Delete(InternalFolder, \"logo_monocromatico.";
Debug.ShouldStop(64);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._internalfolder),(Object)(RemoteObject.createImmutable("logo_monocromatico.png")));
 };
 BA.debugLineNum = 298;BA.debugLine="If File.Exists(SharedFolder, \"template20_VStorage";
Debug.ShouldStop(512);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20_VStorage.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 299;BA.debugLine="File.Delete(SharedFolder, \"template20_VStorage.h";
Debug.ShouldStop(1024);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20_VStorage.html")));
 };
 BA.debugLineNum = 302;BA.debugLine="If File.Exists(SharedFolder, \"template20_VCamperv";
Debug.ShouldStop(8192);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20_VCampervans.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 303;BA.debugLine="File.Delete(SharedFolder, \"template20_VCampervan";
Debug.ShouldStop(16384);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template20_VCampervans.html")));
 };
 BA.debugLineNum = 306;BA.debugLine="If File.Exists(SharedFolder, \"page_id_resopre_fir";
Debug.ShouldStop(131072);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_id_resopre_first.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 307;BA.debugLine="File.Delete(SharedFolder, \"page_id_resopre_first";
Debug.ShouldStop(262144);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_id_resopre_first.html")));
 };
 BA.debugLineNum = 310;BA.debugLine="If File.Exists(SharedFolder, \"page_resopre_footer";
Debug.ShouldStop(2097152);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_resopre_footer.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 311;BA.debugLine="File.Delete(SharedFolder, \"page_resopre_footer.h";
Debug.ShouldStop(4194304);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_resopre_footer.html")));
 };
 BA.debugLineNum = 314;BA.debugLine="If File.Exists(SharedFolder, \"page_resopre_header";
Debug.ShouldStop(33554432);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_resopre_header.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 315;BA.debugLine="File.Delete(SharedFolder, \"page_resopre_header.h";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("page_resopre_header.html")));
 };
 BA.debugLineNum = 318;BA.debugLine="If File.Exists(SharedFolder, \"template_resopre_gr";
Debug.ShouldStop(536870912);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_resopre_group.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 319;BA.debugLine="File.Delete(SharedFolder, \"template_resopre_grou";
Debug.ShouldStop(1073741824);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_resopre_group.html")));
 };
 BA.debugLineNum = 322;BA.debugLine="If File.Exists(SharedFolder, \"acail_distribuicao_";
Debug.ShouldStop(2);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("acail_distribuicao_epis.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 323;BA.debugLine="File.Delete(SharedFolder, \"acail_distribuicao_ep";
Debug.ShouldStop(4);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("acail_distribuicao_epis.html")));
 };
 BA.debugLineNum = 326;BA.debugLine="If File.Exists(SharedFolder, \"acail_reg_despesa.h";
Debug.ShouldStop(32);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("acail_reg_despesa.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 327;BA.debugLine="File.Delete(SharedFolder, \"acail_reg_despesa.htm";
Debug.ShouldStop(64);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("acail_reg_despesa.html")));
 };
 BA.debugLineNum = 330;BA.debugLine="If File.Exists(SharedFolder, \"template_limpersado";
Debug.ShouldStop(512);
if (starter.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_limpersado_guia.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 331;BA.debugLine="File.Delete(SharedFolder, \"template_limpersado_g";
Debug.ShouldStop(1024);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter._sharedfolder),(Object)(RemoteObject.createImmutable("template_limpersado_guia.html")));
 };
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializeftp() throws Exception{
try {
		Debug.PushSubsStack("InitializeFTP (starter) ","starter",1,starter.processBA,starter.mostCurrent,518);
if (RapidSub.canDelegate("initializeftp")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","initializeftp");}
 BA.debugLineNum = 518;BA.debugLine="Sub InitializeFTP";
Debug.ShouldStop(32);
 BA.debugLineNum = 519;BA.debugLine="If Not(GlobalFTP.IsInitialized) Then";
Debug.ShouldStop(64);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter._globalftp.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 520;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(128);
starter._globalftp.runVoidMethod ("Initialize",starter.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 521;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(256);
starter._globalftp.runMethod(true,"setPassiveMode",starter.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializegps() throws Exception{
try {
		Debug.PushSubsStack("InitializeGPS (starter) ","starter",1,starter.processBA,starter.mostCurrent,511);
if (RapidSub.canDelegate("initializegps")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","initializegps");}
 BA.debugLineNum = 511;BA.debugLine="Sub InitializeGPS";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 512;BA.debugLine="If Not(GPSDEVICE.IsInitialized) Then";
Debug.ShouldStop(-2147483648);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter._gpsdevice.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 513;BA.debugLine="GPSDEVICE.Initialize(\"GPSDEVICE\")";
Debug.ShouldStop(1);
starter._gpsdevice.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPSDEVICE")));
 };
 BA.debugLineNum = 516;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isonline() throws Exception{
try {
		Debug.PushSubsStack("IsOnline (starter) ","starter",1,starter.processBA,starter.mostCurrent,735);
if (RapidSub.canDelegate("isonline")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","isonline");}
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
public ResumableSub_IsOnline(xevolution.vrcg.devdemov2400.starter parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.starter parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _error = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("IsOnline (starter) ","starter",1,starter.processBA,starter.mostCurrent,735);
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
 BA.debugLineNum = 737;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 738;BA.debugLine="Dim Response, Error As StringBuilder";
Debug.ShouldStop(2);
_response = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Response", _response);
_error = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Error", _error);
 BA.debugLineNum = 739;BA.debugLine="Response.Initialize";
Debug.ShouldStop(4);
_response.runVoidMethod ("Initialize");
 BA.debugLineNum = 740;BA.debugLine="Error.Initialize";
Debug.ShouldStop(8);
_error.runVoidMethod ("Initialize");
 BA.debugLineNum = 741;BA.debugLine="Try";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 743;BA.debugLine="p.Shell(\"ping -q -c 1 -W 2 8.8.8.8\",Null,Respons";
Debug.ShouldStop(64);
_p.runVoidMethod ("Shell",(Object)(BA.ObjectToString("ping -q -c 1 -W 2 8.8.8.8")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)((_response.getObject())),(Object)((_error.getObject())));
 BA.debugLineNum = 745;BA.debugLine="If Error.ToString = \"\" Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 746;BA.debugLine="If Response.ToString.Contains(\" 100% packet los";
Debug.ShouldStop(512);
if (true) break;

case 7:
//if
this.state = 12;
if (_response.runMethod(true,"ToString").runMethod(true,"contains",(Object)(RemoteObject.createImmutable(" 100% packet loss"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else 
{ BA.debugLineNum = 749;BA.debugLine="Else If Response.ToString.Contains(\" 0% packet";
Debug.ShouldStop(4096);
if (_response.runMethod(true,"ToString").runMethod(true,"contains",(Object)(RemoteObject.createImmutable(" 0% packet loss"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}}
if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 747;BA.debugLine="Log(\"Ping ran but no response \" &  Response.To";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61966092",RemoteObject.concat(RemoteObject.createImmutable("Ping ran but no response "),_response.runMethod(true,"ToString")),0);
 BA.debugLineNum = 748;BA.debugLine="Return False";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 750;BA.debugLine="Log(\"Ping Google OK\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61966095",RemoteObject.createImmutable("Ping Google OK"),0);
 BA.debugLineNum = 751;BA.debugLine="Return True";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 755;BA.debugLine="Return False";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 758;BA.debugLine="Log(\"Error pinging Google DNS: \"  & Error.ToStri";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61966103",RemoteObject.concat(RemoteObject.createImmutable("Error pinging Google DNS: "),_error.runMethod(true,"ToString")),0);
 BA.debugLineNum = 759;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 761;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e0.toString());}
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
public static RemoteObject  _pe_screenoff(RemoteObject _intent) throws Exception{
try {
		Debug.PushSubsStack("PE_ScreenOff (starter) ","starter",1,starter.processBA,starter.mostCurrent,569);
if (RapidSub.canDelegate("pe_screenoff")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","pe_screenoff", _intent);}
RemoteObject _phk = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
Debug.locals.put("Intent", _intent);
 BA.debugLineNum = 569;BA.debugLine="Sub PE_ScreenOff (Intent As Intent)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 571;BA.debugLine="Log(\"screen off by user\")";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","61114114",RemoteObject.createImmutable("screen off by user"),0);
 BA.debugLineNum = 572;BA.debugLine="Dim phk As PhoneWakeState";
Debug.ShouldStop(134217728);
_phk = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");Debug.locals.put("phk", _phk);
 BA.debugLineNum = 573;BA.debugLine="phk.ReleaseKeepAlive";
Debug.ShouldStop(268435456);
_phk.runVoidMethod ("ReleaseKeepAlive");
 BA.debugLineNum = 581;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(16);
starter.mostCurrent.__c.runVoidMethod ("StopService",starter.processBA,(Object)((starter.mostCurrent._comms.getObject())));
 BA.debugLineNum = 582;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(32);
starter.mostCurrent.__c.runVoidMethod ("StopService",starter.processBA,(Object)((starter.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 583;BA.debugLine="StopCommsCheck = True";
Debug.ShouldStop(64);
starter._stopcommscheck = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 584;BA.debugLine="StopLocationCheck = True";
Debug.ShouldStop(128);
starter._stoplocationcheck = starter.mostCurrent.__c.getField(true,"True");
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
public static RemoteObject  _pe_screenon(RemoteObject _intent) throws Exception{
try {
		Debug.PushSubsStack("PE_ScreenOn (starter) ","starter",1,starter.processBA,starter.mostCurrent,547);
if (RapidSub.canDelegate("pe_screenon")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","pe_screenon", _intent);}
RemoteObject _phk = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
Debug.locals.put("Intent", _intent);
 BA.debugLineNum = 547;BA.debugLine="Sub PE_ScreenOn (Intent As Intent)";
Debug.ShouldStop(4);
 BA.debugLineNum = 548;BA.debugLine="Log(\"PE_ScreenOn\")";
Debug.ShouldStop(8);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","61048577",RemoteObject.createImmutable("PE_ScreenOn"),0);
 BA.debugLineNum = 550;BA.debugLine="If IsPaused(Main)=False And Main.keepal Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",starter.mostCurrent.__c.runMethod(true,"IsPaused",starter.processBA,(Object)((starter.mostCurrent._main.getObject()))),starter.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",starter.mostCurrent._main._keepal /*RemoteObject*/ )) { 
 BA.debugLineNum = 551;BA.debugLine="Dim phk As PhoneWakeState";
Debug.ShouldStop(64);
_phk = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");Debug.locals.put("phk", _phk);
 BA.debugLineNum = 552;BA.debugLine="phk.ReleaseKeepAlive";
Debug.ShouldStop(128);
_phk.runVoidMethod ("ReleaseKeepAlive");
 BA.debugLineNum = 553;BA.debugLine="phk.KeepAlive(True)";
Debug.ShouldStop(256);
_phk.runVoidMethod ("KeepAlive",starter.processBA,(Object)(starter.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 562;BA.debugLine="StopCommsCheck = False";
Debug.ShouldStop(131072);
starter._stopcommscheck = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 563;BA.debugLine="StopLocationCheck = False";
Debug.ShouldStop(262144);
starter._stoplocationcheck = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 564;BA.debugLine="StartService(Comms)";
Debug.ShouldStop(524288);
starter.mostCurrent.__c.runVoidMethod ("StartService",starter.processBA,(Object)((starter.mostCurrent._comms.getObject())));
 BA.debugLineNum = 565;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.runVoidMethod ("StartService",starter.processBA,(Object)((starter.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pe_smsdelivered(RemoteObject _phonenumber,RemoteObject _intent) throws Exception{
try {
		Debug.PushSubsStack("PE_SmsDelivered (starter) ","starter",1,starter.processBA,starter.mostCurrent,588);
if (RapidSub.canDelegate("pe_smsdelivered")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","pe_smsdelivered", _phonenumber, _intent);}
Debug.locals.put("PhoneNumber", _phonenumber);
Debug.locals.put("Intent", _intent);
 BA.debugLineNum = 588;BA.debugLine="Sub PE_SmsDelivered (PhoneNumber As String, Intent";
Debug.ShouldStop(2048);
 BA.debugLineNum = 589;BA.debugLine="Log(\"phs_SmsDelivered: PhoneNumber=\" & PhoneNumbe";
Debug.ShouldStop(4096);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","61179649",RemoteObject.concat(RemoteObject.createImmutable("phs_SmsDelivered: PhoneNumber="),_phonenumber,RemoteObject.createImmutable(", message_id="),_intent.runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("message_id")))),0);
 BA.debugLineNum = 590;BA.debugLine="ToastMessageShow($\"${ShareCode.AvisoSMSSent} - ${";
Debug.ShouldStop(8192);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._avisosmssent /*RemoteObject*/ ))),RemoteObject.createImmutable(" - "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_phonenumber))),RemoteObject.createImmutable(""))))),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 591;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pe_smssentstatus(RemoteObject _success,RemoteObject _errormessage,RemoteObject _phonenumber,RemoteObject _intent) throws Exception{
try {
		Debug.PushSubsStack("PE_SmsSentStatus (starter) ","starter",1,starter.processBA,starter.mostCurrent,593);
if (RapidSub.canDelegate("pe_smssentstatus")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","pe_smssentstatus", _success, _errormessage, _phonenumber, _intent);}
Debug.locals.put("Success", _success);
Debug.locals.put("ErrorMessage", _errormessage);
Debug.locals.put("PhoneNumber", _phonenumber);
Debug.locals.put("Intent", _intent);
 BA.debugLineNum = 593;BA.debugLine="Sub PE_SmsSentStatus (Success As Boolean, ErrorMes";
Debug.ShouldStop(65536);
 BA.debugLineNum = 594;BA.debugLine="Log(\"phs_SmsSentStatus: PhoneNumber=\" & PhoneNumb";
Debug.ShouldStop(131072);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","61245185",RemoteObject.concat(RemoteObject.createImmutable("phs_SmsSentStatus: PhoneNumber="),_phonenumber,RemoteObject.createImmutable(", Success="),_success,RemoteObject.createImmutable(", message_id="),_intent.runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("message_id")))),0);
 BA.debugLineNum = 595;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(262144);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 596;BA.debugLine="ToastMessageShow($\"${ShareCode.GeneralErrorTitle";
Debug.ShouldStop(524288);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ ))),RemoteObject.createImmutable(":"),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._avisosmsnotsent /*RemoteObject*/ ))),RemoteObject.createImmutable(""))))),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 599;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim PE As PhoneEvents";
starter._pe = RemoteObject.createNew ("anywheresoftware.b4a.phone.PhoneEvents");
 //BA.debugLineNum = 8;BA.debugLine="Public GlobalFTP As FTP";
starter._globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Public CurrentWorkActivity As Object";
starter._currentworkactivity = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 10;BA.debugLine="Public CurrentFlowPosition As Int = 0";
starter._currentflowposition = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 11;BA.debugLine="Public WEBISOK As Boolean = False";
starter._webisok = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 13;BA.debugLine="Public LocalSQL As SQL";
starter._localsql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 14;BA.debugLine="Public LocalSQLEVC As SQL";
starter._localsqlevc = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 15;BA.debugLine="Public LocalSQLWRK As SQL";
starter._localsqlwrk = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 16;BA.debugLine="Public MakingLogin As Boolean = False";
starter._makinglogin = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 18;BA.debugLine="Public FirstInstall As Boolean = False";
starter._firstinstall = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 19;BA.debugLine="Public RunUpdate As Boolean = False";
starter._runupdate = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 20;BA.debugLine="Public GPSDEVICE As GPS";
starter._gpsdevice = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 21;BA.debugLine="Public AppState As TIniFile";
starter._appstate = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.tinifile");
 //BA.debugLineNum = 22;BA.debugLine="Public rp As RuntimePermissions";
starter._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 23;BA.debugLine="Public Params As ConfigParameters";
starter._params = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.configparameters");
 //BA.debugLineNum = 24;BA.debugLine="Public Provider As FileProvider";
starter._provider = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.fileprovider");
 //BA.debugLineNum = 25;BA.debugLine="Public StrFunc As StringFunctions";
starter._strfunc = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");
 //BA.debugLineNum = 26;BA.debugLine="Public LocalSessionCode As String";
starter._localsessioncode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Public SharedFolder As String";
starter._sharedfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Public SafeDefaultExternal As String";
starter._safedefaultexternal = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Public InternalFolder As String = File.DirInterna";
starter._internalfolder = starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 //BA.debugLineNum = 31;BA.debugLine="Public AssetsFolder As String = File.DirAssets";
starter._assetsfolder = starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets");
 //BA.debugLineNum = 32;BA.debugLine="Public WIFI As MLwifi";
starter._wifi = RemoteObject.createNew ("wifi.MLwifi");
 //BA.debugLineNum = 34;BA.debugLine="Public EntityKeepFilter As Boolean = False";
starter._entitykeepfilter = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 35;BA.debugLine="Public EntitySearchFilter As String = \"\"";
starter._entitysearchfilter = BA.ObjectToString("");
 //BA.debugLineNum = 36;BA.debugLine="Public EntityFilter As EntityFilter";
starter._entityfilter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._entityfilter");
 //BA.debugLineNum = 38;BA.debugLine="Public RequestFavorites As Int = 0";
starter._requestfavorites = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 39;BA.debugLine="Public RequestKeepFilter As Boolean = False";
starter._requestkeepfilter = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 40;BA.debugLine="Public RequestSearchFilter As String = \"\"";
starter._requestsearchfilter = BA.ObjectToString("");
 //BA.debugLineNum = 41;BA.debugLine="Public RequestFilters As RequestFilter";
starter._requestfilters = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestfilter");
 //BA.debugLineNum = 43;BA.debugLine="Public TaskKeepFilter As Boolean = False";
starter._taskkeepfilter = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 44;BA.debugLine="Public TaskSearchFilter As String = \"\"";
starter._tasksearchfilter = BA.ObjectToString("");
 //BA.debugLineNum = 45;BA.debugLine="Public TaskFilters As TaskFilter";
starter._taskfilters = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._taskfilter");
 //BA.debugLineNum = 47;BA.debugLine="Public ObjectKeepFilter As Boolean = False";
starter._objectkeepfilter = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 48;BA.debugLine="Public ObjectFiltered As Boolean = False";
starter._objectfiltered = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 49;BA.debugLine="Public ObjectSearchFilter As String = \"\"";
starter._objectsearchfilter = BA.ObjectToString("");
 //BA.debugLineNum = 50;BA.debugLine="Public ObjectFilter As ObjectFilter";
starter._objectfilter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._objectfilter");
 //BA.debugLineNum = 52;BA.debugLine="Public NotifyUserCount As Int = 0";
starter._notifyusercount = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 53;BA.debugLine="Public NotifyRequestCount As Int = 0";
starter._notifyrequestcount = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 54;BA.debugLine="Public NotifyActionCount As Int = 0";
starter._notifyactioncount = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 56;BA.debugLine="Public DevInfo As DeviceInformation";
starter._devinfo = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._deviceinformation");
 //BA.debugLineNum = 57;BA.debugLine="Public KeepColorMain As Int";
starter._keepcolormain = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 58;BA.debugLine="Public KeepColorSub As Int";
starter._keepcolorsub = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 60;BA.debugLine="Public CPButtons As ComposedButtonDefs";
starter._cpbuttons = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._composedbuttondefs");
 //BA.debugLineNum = 61;BA.debugLine="Public CPButtonsOFF As ComposedButtonDefs";
starter._cpbuttonsoff = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._composedbuttondefs");
 //BA.debugLineNum = 63;BA.debugLine="Public APP_FINE_LOCATION_ACCESS As Boolean = Fals";
starter._app_fine_location_access = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 64;BA.debugLine="Public APP_CAMERA_ACCESS As Boolean = False";
starter._app_camera_access = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 65;BA.debugLine="Public APP_RESET_INSTALL As Boolean = False";
starter._app_reset_install = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 66;BA.debugLine="Public APP_IN_EXECUTION As Boolean = False";
starter._app_in_execution = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 67;BA.debugLine="Public APP_INSTALL_APK As Boolean = False";
starter._app_install_apk = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 68;BA.debugLine="Public APP_SEND_SMS As Boolean = False";
starter._app_send_sms = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 70;BA.debugLine="Public StopLocationCheck As Boolean = False";
starter._stoplocationcheck = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 71;BA.debugLine="Public StopCommsCheck As Boolean = False";
starter._stopcommscheck = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 72;BA.debugLine="Public CalledFromSyncButton As Boolean = False";
starter._calledfromsyncbutton = starter.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 73;BA.debugLine="Public ApiCall As Api";
starter._apicall = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.api");
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _requestemailfrombo(RemoteObject _nrequest,RemoteObject _emailsto,RemoteObject _emailscc,RemoteObject _subject,RemoteObject _sendbcc) throws Exception{
try {
		Debug.PushSubsStack("RequestEmailFromBO (starter) ","starter",1,starter.processBA,starter.mostCurrent,764);
if (RapidSub.canDelegate("requestemailfrombo")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","requestemailfrombo", _nrequest, _emailsto, _emailscc, _subject, _sendbcc);}
ResumableSub_RequestEmailFromBO rsub = new ResumableSub_RequestEmailFromBO(null,_nrequest,_emailsto,_emailscc,_subject,_sendbcc);
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
public static class ResumableSub_RequestEmailFromBO extends BA.ResumableSub {
public ResumableSub_RequestEmailFromBO(xevolution.vrcg.devdemov2400.starter parent,RemoteObject _nrequest,RemoteObject _emailsto,RemoteObject _emailscc,RemoteObject _subject,RemoteObject _sendbcc) {
this.parent = parent;
this._nrequest = _nrequest;
this._emailsto = _emailsto;
this._emailscc = _emailscc;
this._subject = _subject;
this._sendbcc = _sendbcc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.starter parent;
RemoteObject _nrequest;
RemoteObject _emailsto;
RemoteObject _emailscc;
RemoteObject _subject;
RemoteObject _sendbcc;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _jobemail = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _paramseml = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _jsonstruct = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _message = RemoteObject.createImmutable("");
RemoteObject _eml_result_text = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RequestEmailFromBO (starter) ","starter",1,starter.processBA,starter.mostCurrent,764);
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
Debug.locals.put("NRequest", _nrequest);
Debug.locals.put("EmailsTO", _emailsto);
Debug.locals.put("EmailsCC", _emailscc);
Debug.locals.put("subject", _subject);
Debug.locals.put("sendBCC", _sendbcc);
 BA.debugLineNum = 766;BA.debugLine="EmailsTO = EmailsTO.Replace(\";;\", \";\")";
Debug.ShouldStop(536870912);
_emailsto = _emailsto.runMethod(true,"replace",(Object)(BA.ObjectToString(";;")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("EmailsTO", _emailsto);
 BA.debugLineNum = 767;BA.debugLine="EmailsTO = EmailsTO.Replace(\",\", \";\")";
Debug.ShouldStop(1073741824);
_emailsto = _emailsto.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("EmailsTO", _emailsto);
 BA.debugLineNum = 768;BA.debugLine="EmailsTO = EmailsTO.Replace(\"|\", \";\")";
Debug.ShouldStop(-2147483648);
_emailsto = _emailsto.runMethod(true,"replace",(Object)(BA.ObjectToString("|")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("EmailsTO", _emailsto);
 BA.debugLineNum = 769;BA.debugLine="EmailsTO = EmailsTO.Replace(\" \", \"\")";
Debug.ShouldStop(1);
_emailsto = _emailsto.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("EmailsTO", _emailsto);
 BA.debugLineNum = 771;BA.debugLine="EmailsCC = EmailsCC.Replace(\";;\", \";\")";
Debug.ShouldStop(4);
_emailscc = _emailscc.runMethod(true,"replace",(Object)(BA.ObjectToString(";;")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("EmailsCC", _emailscc);
 BA.debugLineNum = 772;BA.debugLine="EmailsCC = EmailsCC.Replace(\",\", \";\")";
Debug.ShouldStop(8);
_emailscc = _emailscc.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("EmailsCC", _emailscc);
 BA.debugLineNum = 773;BA.debugLine="EmailsCC = EmailsCC.Replace(\"|\", \";\")";
Debug.ShouldStop(16);
_emailscc = _emailscc.runMethod(true,"replace",(Object)(BA.ObjectToString("|")),(Object)(RemoteObject.createImmutable(";")));Debug.locals.put("EmailsCC", _emailscc);
 BA.debugLineNum = 774;BA.debugLine="EmailsCC = EmailsCC.Replace(\" \", \"\")";
Debug.ShouldStop(32);
_emailscc = _emailscc.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("EmailsCC", _emailscc);
 BA.debugLineNum = 776;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(128);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/cla/send/email")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 777;BA.debugLine="Dim JobEmail As HttpJob";
Debug.ShouldStop(256);
_jobemail = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("JobEmail", _jobemail);
 BA.debugLineNum = 778;BA.debugLine="JobEmail.Initialize(\"\", Me)";
Debug.ShouldStop(512);
_jobemail.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("")),(Object)(starter.getObject()));
 BA.debugLineNum = 779;BA.debugLine="Dim ParamsEml As Map";
Debug.ShouldStop(1024);
_paramseml = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ParamsEml", _paramseml);
 BA.debugLineNum = 780;BA.debugLine="ParamsEml.Initialize";
Debug.ShouldStop(2048);
_paramseml.runVoidMethod ("Initialize");
 BA.debugLineNum = 781;BA.debugLine="ParamsEml.Clear";
Debug.ShouldStop(4096);
_paramseml.runVoidMethod ("Clear");
 BA.debugLineNum = 782;BA.debugLine="ParamsEml.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(8192);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 783;BA.debugLine="ParamsEml.Put(\"request\",NRequest)";
Debug.ShouldStop(16384);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request"))),(Object)((_nrequest)));
 BA.debugLineNum = 784;BA.debugLine="ParamsEml.Put(\"emailsTO\",EmailsTO)";
Debug.ShouldStop(32768);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("emailsTO"))),(Object)((_emailsto)));
 BA.debugLineNum = 785;BA.debugLine="ParamsEml.Put(\"emailsCC\",EmailsCC)";
Debug.ShouldStop(65536);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("emailsCC"))),(Object)((_emailscc)));
 BA.debugLineNum = 786;BA.debugLine="ParamsEml.Put(\"subject\", subject)";
Debug.ShouldStop(131072);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("subject"))),(Object)((_subject)));
 BA.debugLineNum = 787;BA.debugLine="ParamsEml.Put(\"date\",Utils.GetCurrDatetime)";
Debug.ShouldStop(262144);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,starter.processBA))));
 BA.debugLineNum = 788;BA.debugLine="ParamsEml.Put(\"user\", ShareCode.SESS_OPER_User)";
Debug.ShouldStop(524288);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 789;BA.debugLine="ParamsEml.Put(\"SendBCC\", sendBCC)";
Debug.ShouldStop(1048576);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("SendBCC"))),(Object)((_sendbcc)));
 BA.debugLineNum = 790;BA.debugLine="ParamsEml.Put(\"debug\", 0)";
Debug.ShouldStop(2097152);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("debug"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 791;BA.debugLine="ParamsEml.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(4194304);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 792;BA.debugLine="ParamsEml.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(8388608);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 793;BA.debugLine="ParamsEml.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16777216);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 794;BA.debugLine="ParamsEml.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(33554432);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 795;BA.debugLine="ParamsEml.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(67108864);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 796;BA.debugLine="ParamsEml.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(134217728);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 797;BA.debugLine="ParamsEml.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(268435456);
_paramseml.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 798;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(536870912);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 799;BA.debugLine="JSON.Initialize(ParamsEml)";
Debug.ShouldStop(1073741824);
_json.runVoidMethod ("Initialize",(Object)(_paramseml));
 BA.debugLineNum = 801;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
Debug.ShouldStop(1);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 803;BA.debugLine="Utils.ShowProcinLog(\"Starter\",\"RequestEmailfromBO";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("Starter")),(Object)(BA.ObjectToString("RequestEmailfromBO")),(Object)(_data));
 BA.debugLineNum = 807;BA.debugLine="JobEmail.PostString(ServerAddress, data)";
Debug.ShouldStop(64);
_jobemail.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 808;BA.debugLine="JobEmail.GetRequest.SetContentType(\"application/j";
Debug.ShouldStop(128);
_jobemail.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 809;BA.debugLine="JobEmail.GetRequest.Timeout = 90000";
Debug.ShouldStop(256);
_jobemail.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 90000));
 BA.debugLineNum = 810;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",starter.processBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 811;BA.debugLine="Wait For (JobEmail) JobDone(JobEmail As HttpJob)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", starter.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "starter", "requestemailfrombo"), (_jobemail));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_jobemail = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("JobEmail", _jobemail);
;
 BA.debugLineNum = 813;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 815;BA.debugLine="If JobEmail.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 18;
if (_jobemail.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 816;BA.debugLine="Dim JsonStruct As String=\"\"";
Debug.ShouldStop(32768);
_jsonstruct = BA.ObjectToString("");Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 817;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 818;BA.debugLine="JsonStruct = JobEmail.GetString";
Debug.ShouldStop(131072);
_jsonstruct = _jobemail.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 819;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(262144);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 820;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(524288);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 821;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1048576);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 822;BA.debugLine="Dim Status As String = root.Get(\"status\")";
Debug.ShouldStop(2097152);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 823;BA.debugLine="Dim Message As String = root.Get(\"message\")";
Debug.ShouldStop(4194304);
_message = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("Message", _message);Debug.locals.put("Message", _message);
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 825;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62031677",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 BA.debugLineNum = 826;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",starter.processBA))));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
;
 BA.debugLineNum = 829;BA.debugLine="Log(JsonStruct)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62031681",_jsonstruct,0);
 BA.debugLineNum = 830;BA.debugLine="If Status = \"1\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("1"))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 831;BA.debugLine="ShareCode.EML_RESULT = \"SUCESSO\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._sharecode._eml_result /*RemoteObject*/  = BA.ObjectToString("SUCESSO");
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 833;BA.debugLine="ShareCode.EML_RESULT = \"ERRO\"";
Debug.ShouldStop(1);
parent.mostCurrent._sharecode._eml_result /*RemoteObject*/  = BA.ObjectToString("ERRO");
 if (true) break;

case 15:
//C
this.state = 18;
;
 BA.debugLineNum = 836;BA.debugLine="Utils.ShowProcinLog(\"ReportView\",\"RequestEmailfr";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("ReportView")),(Object)(BA.ObjectToString("RequestEmailfromBO")),(Object)(RemoteObject.createImmutable("Success")));
 BA.debugLineNum = 837;BA.debugLine="Dim Eml_result_Text As String = $\"${NRequest} -";
Debug.ShouldStop(16);
_eml_result_text = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nrequest))),RemoteObject.createImmutable(" - "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._eml_result /*RemoteObject*/ ))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsto))),RemoteObject.createImmutable("")));Debug.locals.put("Eml_result_Text", _eml_result_text);Debug.locals.put("Eml_result_Text", _eml_result_text);
 BA.debugLineNum = 838;BA.debugLine="Str_CreateEmailAlert(Eml_result_Text)";
Debug.ShouldStop(32);
_str_createemailalert(_eml_result_text);
 BA.debugLineNum = 839;BA.debugLine="MsgboxAsync(\"Verifique o estado do envio em Aler";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Verifique o estado do envio em Alertas, no Menu principal")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),starter.processBA);
 BA.debugLineNum = 840;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 842;BA.debugLine="Log(JobEmail.ErrorMessage)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62031694",_jobemail.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 BA.debugLineNum = 843;BA.debugLine="Utils.ShowProcinLog(\"ReportView\",\"RequestEmailfr";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("ReportView")),(Object)(BA.ObjectToString("RequestEmailfromBO")),(Object)(RemoteObject.createImmutable("JOB ERROR")));
 BA.debugLineNum = 844;BA.debugLine="Utils.Logerror(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_jobemail.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 845;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 847;BA.debugLine="JobEmail.Release";
Debug.ShouldStop(16384);
_jobemail.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 848;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e0.toString());}
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
public static void  _jobdone(RemoteObject _jobemail) throws Exception{
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",1,starter.processBA,starter.mostCurrent,86);
if (RapidSub.canDelegate("service_create")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 86;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 96;BA.debugLine="ApiCall.Initialize";
Debug.ShouldStop(-2147483648);
starter._apicall.runClassMethod (xevolution.vrcg.devdemov2400.api.class, "_initialize" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 97;BA.debugLine="SetDefaultLocale";
Debug.ShouldStop(1);
_setdefaultlocale();
 BA.debugLineNum = 98;BA.debugLine="DeleteFiles";
Debug.ShouldStop(2);
_deletefiles();
 BA.debugLineNum = 99;BA.debugLine="InitializeGPS";
Debug.ShouldStop(4);
_initializegps();
 BA.debugLineNum = 102;BA.debugLine="PE.Initialize(\"PE\")";
Debug.ShouldStop(32);
starter._pe.runVoidMethod ("Initialize",starter.processBA,(Object)(RemoteObject.createImmutable("PE")));
 BA.debugLineNum = 104;BA.debugLine="RunUpdate = False";
Debug.ShouldStop(128);
starter._runupdate = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",1,starter.processBA,starter.mostCurrent,676);
if (RapidSub.canDelegate("service_destroy")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 676;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8);
 BA.debugLineNum = 678;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Service_Start (starter) ","starter",1,starter.processBA,starter.mostCurrent,107);
if (RapidSub.canDelegate("service_start")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 107;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 117;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(1048576);
starter.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 120;BA.debugLine="ShareCode.CURRENT_APPDATE = Utils.GetCurrentDate";
Debug.ShouldStop(8388608);
starter.mostCurrent._sharecode._current_appdate /*RemoteObject*/  = starter.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 121;BA.debugLine="Params.Initialize";
Debug.ShouldStop(16777216);
starter._params.runClassMethod (xevolution.vrcg.devdemov2400.configparameters.class, "_initialize" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 122;BA.debugLine="SetFoldersLocation";
Debug.ShouldStop(33554432);
_setfolderslocation();
 BA.debugLineNum = 123;BA.debugLine="LocalSessionCode = $\"SESS_${Utils.MakeFileName}\"$";
Debug.ShouldStop(67108864);
starter._localsessioncode = (RemoteObject.concat(RemoteObject.createImmutable("SESS_"),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,starter.processBA)))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 125;BA.debugLine="CopyAndInitializeAppState";
Debug.ShouldStop(268435456);
_copyandinitializeappstate();
 BA.debugLineNum = 126;BA.debugLine="CopyAndInitializeDatabases";
Debug.ShouldStop(536870912);
_copyandinitializedatabases();
 BA.debugLineNum = 127;BA.debugLine="Create_dbchanges_Table";
Debug.ShouldStop(1073741824);
_create_dbchanges_table();
 BA.debugLineNum = 132;BA.debugLine="DBStructures.CreateTablesThatDoNotExists";
Debug.ShouldStop(8);
starter.mostCurrent._dbstructures.runVoidMethod ("_createtablesthatdonotexists" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 134;BA.debugLine="CopyFiles";
Debug.ShouldStop(32);
_copyfiles();
 BA.debugLineNum = 135;BA.debugLine="SetAppAndDeviceInfo";
Debug.ShouldStop(64);
_setappanddeviceinfo();
 BA.debugLineNum = 136;BA.debugLine="InitializeFTP";
Debug.ShouldStop(128);
_initializeftp();
 BA.debugLineNum = 137;BA.debugLine="Set_SESS_IN_PAUSE";
Debug.ShouldStop(256);
_set_sess_in_pause();
 BA.debugLineNum = 139;BA.debugLine="FirstInstall = (ShareCode.APPL_CONFIRMED = 0) Or";
Debug.ShouldStop(1024);
starter._firstinstall = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",starter.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ,BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",starter.mostCurrent._sharecode._first_install /*RemoteObject*/ ,BA.numberCast(double.class, 0))))));
 BA.debugLineNum = 140;BA.debugLine="ShareCode.APP_LAST_USER = AppState.ReadString(\"AP";
Debug.ShouldStop(2048);
starter.mostCurrent._sharecode._app_last_user /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("LAST_USER")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 142;BA.debugLine="DBStructures.getCurrentConfigValues";
Debug.ShouldStop(8192);
starter.mostCurrent._dbstructures.runVoidMethod ("_getcurrentconfigvalues" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 143;BA.debugLine="Log($\"API_TOKEN : ${ShareCode.APP_TOKEN}\"$)";
Debug.ShouldStop(16384);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","6458788",(RemoteObject.concat(RemoteObject.createImmutable("API_TOKEN : "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._app_token /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 144;BA.debugLine="DBStructures.updateConfigApp(ShareCode.APP_TOKEN)";
Debug.ShouldStop(32768);
starter.mostCurrent._dbstructures.runVoidMethod ("_updateconfigapp" /*RemoteObject*/ ,starter.processBA,(Object)(starter.mostCurrent._sharecode._app_token /*RemoteObject*/ ));
 BA.debugLineNum = 145;BA.debugLine="Log($\"SERVICE STARTER : ${Consts.ColorMain} -- ${";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","6458790",(RemoteObject.concat(RemoteObject.createImmutable("SERVICE STARTER : "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._consts._colormain /*RemoteObject*/ ))),RemoteObject.createImmutable(" -- "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._consts._colorsub /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 146;BA.debugLine="DBStructures.getConfigApp(ShareCode.APP_TOKEN)";
Debug.ShouldStop(131072);
starter.mostCurrent._dbstructures.runVoidMethod ("_getconfigapp" /*RemoteObject*/ ,starter.processBA,(Object)(starter.mostCurrent._sharecode._app_token /*RemoteObject*/ ));
 BA.debugLineNum = 148;BA.debugLine="KeepColorMain = Consts.ColorMain";
Debug.ShouldStop(524288);
starter._keepcolormain = starter.mostCurrent._consts._colormain /*RemoteObject*/ ;
 BA.debugLineNum = 149;BA.debugLine="KeepColorSub = Consts.ColorSub";
Debug.ShouldStop(1048576);
starter._keepcolorsub = starter.mostCurrent._consts._colorsub /*RemoteObject*/ ;
 BA.debugLineNum = 159;BA.debugLine="EntityKeepFilter = False";
Debug.ShouldStop(1073741824);
starter._entitykeepfilter = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 160;BA.debugLine="EntitySearchFilter = \"\"";
Debug.ShouldStop(-2147483648);
starter._entitysearchfilter = BA.ObjectToString("");
 BA.debugLineNum = 161;BA.debugLine="EntityFilter = Types.MakeEntityFilter(0, 0, 0, 0,";
Debug.ShouldStop(1);
starter._entityfilter = starter.mostCurrent._types.runMethod(false,"_makeentityfilter" /*RemoteObject*/ ,starter.processBA,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 163;BA.debugLine="ObjectKeepFilter  = True";
Debug.ShouldStop(4);
starter._objectkeepfilter = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 164;BA.debugLine="ObjectFiltered  = True";
Debug.ShouldStop(8);
starter._objectfiltered = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 165;BA.debugLine="ObjectSearchFilter = \"\"";
Debug.ShouldStop(16);
starter._objectsearchfilter = BA.ObjectToString("");
 BA.debugLineNum = 166;BA.debugLine="ObjectFilter = Types.MakeObjectFilter(ShareCode.O";
Debug.ShouldStop(32);
starter._objectfilter = starter.mostCurrent._types.runMethod(false,"_makeobjectfilter" /*RemoteObject*/ ,starter.processBA,(Object)(starter.mostCurrent._sharecode._obj_defaulttype /*RemoteObject*/ ),(Object)(starter.mostCurrent._sharecode._obj_defaultzone /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 167;BA.debugLine="Log($\"OBJECT_FILTER_CHANGED: ${ObjectFilter}\"$)";
Debug.ShouldStop(64);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","6458812",(RemoteObject.concat(RemoteObject.createImmutable("OBJECT_FILTER_CHANGED: "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter._objectfilter))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 169;BA.debugLine="CreateCPButtons";
Debug.ShouldStop(256);
_createcpbuttons();
 BA.debugLineNum = 170;BA.debugLine="SetAppInfo";
Debug.ShouldStop(512);
_setappinfo();
 BA.debugLineNum = 172;BA.debugLine="DevInfo = Utils.DeviceInfo";
Debug.ShouldStop(2048);
starter._devinfo = starter.mostCurrent._utils.runMethod(false,"_deviceinfo" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 173;BA.debugLine="ShareCode.ISPHONE = (DevInfo.Size < 6)";
Debug.ShouldStop(4096);
starter.mostCurrent._sharecode._isphone /*RemoteObject*/  = BA.ObjectToBoolean((RemoteObject.solveBoolean("<",starter._devinfo.getField(true,"Size" /*RemoteObject*/ ),BA.numberCast(double.class, 6))));
 BA.debugLineNum = 175;BA.debugLine="Clear_loc_userssession_Table";
Debug.ShouldStop(16384);
_clear_loc_userssession_table();
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _set_sess_in_pause() throws Exception{
try {
		Debug.PushSubsStack("Set_SESS_IN_PAUSE (starter) ","starter",1,starter.processBA,starter.mostCurrent,612);
if (RapidSub.canDelegate("set_sess_in_pause")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","set_sess_in_pause");}
 BA.debugLineNum = 612;BA.debugLine="Sub Set_SESS_IN_PAUSE";
Debug.ShouldStop(8);
 BA.debugLineNum = 613;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 614;BA.debugLine="ShareCode.SESS_IN_PAUSE = AppState.ReadInteger(\"";
Debug.ShouldStop(32);
starter.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(BA.numberCast(int.class, 0)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e4.toString()); BA.debugLineNum = 616;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","61376260",BA.ObjectToString(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 BA.debugLineNum = 617;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(256);
starter.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA))));
 BA.debugLineNum = 618;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(512);
starter.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 619;BA.debugLine="AppState.WriteInteger(\"APP_START\", \"SESS_IN_PAUS";
Debug.ShouldStop(1024);
starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 620;BA.debugLine="AppState.Flush";
Debug.ShouldStop(2048);
starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 };
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
public static RemoteObject  _setappanddeviceinfo() throws Exception{
try {
		Debug.PushSubsStack("SetAppAndDeviceInfo (starter) ","starter",1,starter.processBA,starter.mostCurrent,530);
if (RapidSub.canDelegate("setappanddeviceinfo")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","setappanddeviceinfo");}
 BA.debugLineNum = 530;BA.debugLine="Sub SetAppAndDeviceInfo";
Debug.ShouldStop(131072);
 BA.debugLineNum = 531;BA.debugLine="ShareCode.DEVICE_ORIENTATION = AppState.ReadInteg";
Debug.ShouldStop(262144);
starter.mostCurrent._sharecode._device_orientation /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("DEVICE_ORIENTATION")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 532;BA.debugLine="ShareCode.DEVICE_LANGUAGE_STR = AppState.ReadStri";
Debug.ShouldStop(524288);
starter.mostCurrent._sharecode._device_language_str /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("LANGUAGE")),(Object)(RemoteObject.createImmutable("PT")));
 BA.debugLineNum = 533;BA.debugLine="ShareCode.APPL_CONFIRMED = AppState.ReadInteger(\"";
Debug.ShouldStop(1048576);
starter.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_CONFIRMED")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 534;BA.debugLine="ShareCode.FIRST_INSTALL = AppState.ReadInteger(\"A";
Debug.ShouldStop(2097152);
starter.mostCurrent._sharecode._first_install /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("FIRST_INSTALL")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 535;BA.debugLine="ShareCode.APP_VERSION = AppState.ReadString(\"APP_";
Debug.ShouldStop(4194304);
starter.mostCurrent._sharecode._app_version /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_VERSION")),(Object)(RemoteObject.createImmutable("Orion V1.40.991")));
 BA.debugLineNum = 536;BA.debugLine="ShareCode.VERSION_BUILD = AppState.ReadString(\"AP";
Debug.ShouldStop(8388608);
starter.mostCurrent._sharecode._version_build /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("VERSION_BUILD")),(Object)(RemoteObject.createImmutable("2.01.013")));
 BA.debugLineNum = 537;BA.debugLine="ShareCode.VERSION_DATE = AppState.ReadString(\"APP";
Debug.ShouldStop(16777216);
starter.mostCurrent._sharecode._version_date /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("VERSION_DATE")),(Object)(RemoteObject.createImmutable("27-10-2019")));
 BA.debugLineNum = 538;BA.debugLine="ShareCode.APPL_ACCOUNT = AppState.ReadString(\"APP";
Debug.ShouldStop(33554432);
starter.mostCurrent._sharecode._appl_account /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_ACCOUNT")),(Object)(RemoteObject.createImmutable("demo")));
 BA.debugLineNum = 540;BA.debugLine="ShareCode.APP_LAST_LITE_UPDATE_DATETIME = AppStat";
Debug.ShouldStop(134217728);
starter.mostCurrent._sharecode._app_last_lite_update_datetime /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_LITE_LAST_UPDATE")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 542;BA.debugLine="ShareCode.APP_MAIN_LOGO = AppState.ReadString(\"AP";
Debug.ShouldStop(536870912);
starter.mostCurrent._sharecode._app_main_logo /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_MAIN_LOGO")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 543;BA.debugLine="ShareCode.APP_MAIN_LOGO_MINI = AppState.ReadStrin";
Debug.ShouldStop(1073741824);
starter.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_MAIN_LOGO_MINI")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 544;BA.debugLine="ShareCode.APPL_HOST = AppState.ReadString(\"APP_ST";
Debug.ShouldStop(-2147483648);
starter.mostCurrent._sharecode._appl_host /*RemoteObject*/  = starter._appstate.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_HOST")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setappinfo() throws Exception{
try {
		Debug.PushSubsStack("SetAppInfo (starter) ","starter",1,starter.processBA,starter.mostCurrent,645);
if (RapidSub.canDelegate("setappinfo")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","setappinfo");}
 BA.debugLineNum = 645;BA.debugLine="Sub SetAppInfo";
Debug.ShouldStop(16);
 BA.debugLineNum = 646;BA.debugLine="ShareCode.APP_VersionNocodeName = Consts.AppVersi";
Debug.ShouldStop(32);
starter.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/  = starter.mostCurrent._consts._appversioncodename /*RemoteObject*/ ;
 BA.debugLineNum = 647;BA.debugLine="ShareCode.APP_EntityBrand = \"\"";
Debug.ShouldStop(64);
starter.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 652;BA.debugLine="ShareCode.CURRENT_APPDATE = DateTime.Date(DateTim";
Debug.ShouldStop(2048);
starter.mostCurrent._sharecode._current_appdate /*RemoteObject*/  = starter.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(starter.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 653;BA.debugLine="Log(ShareCode.CURRENT_APPDATE)";
Debug.ShouldStop(4096);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","61572872",starter.mostCurrent._sharecode._current_appdate /*RemoteObject*/ ,0);
 BA.debugLineNum = 655;BA.debugLine="ShareCode.APPDATE_STARTRANGE = Utils.GetCurrentDa";
Debug.ShouldStop(16384);
starter.mostCurrent._sharecode._appdate_startrange /*RemoteObject*/  = starter.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 656;BA.debugLine="ShareCode.APPDATE_ENDRANGE = Utils.GetCurrentDate";
Debug.ShouldStop(32768);
starter.mostCurrent._sharecode._appdate_endrange /*RemoteObject*/  = starter.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 657;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaultlocale() throws Exception{
try {
		Debug.PushSubsStack("SetDefaultLocale (starter) ","starter",1,starter.processBA,starter.mostCurrent,525);
if (RapidSub.canDelegate("setdefaultlocale")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","setdefaultlocale");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 525;BA.debugLine="Sub SetDefaultLocale";
Debug.ShouldStop(4096);
 BA.debugLineNum = 526;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(8192);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 527;BA.debugLine="jo.InitializeStatic(\"java.util.Locale\").RunMethod";
Debug.ShouldStop(16384);
_jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("java.util.Locale"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDefault")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("US")))})));
 BA.debugLineNum = 528;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfolderslocation() throws Exception{
try {
		Debug.PushSubsStack("SetFoldersLocation (starter) ","starter",1,starter.processBA,starter.mostCurrent,624);
if (RapidSub.canDelegate("setfolderslocation")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","setfolderslocation");}
 BA.debugLineNum = 624;BA.debugLine="Sub SetFoldersLocation";
Debug.ShouldStop(32768);
 BA.debugLineNum = 625;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(65536);
starter._provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initialize" /*RemoteObject*/ ,starter.processBA);
 BA.debugLineNum = 626;BA.debugLine="Provider.SharedFolder = rp.GetSafeDirDefaultExter";
Debug.ShouldStop(131072);
starter._provider.setField ("_sharedfolder" /*RemoteObject*/ ,starter._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("orion"))));
 BA.debugLineNum = 627;BA.debugLine="Provider.UseFileProvider = True";
Debug.ShouldStop(262144);
starter._provider.setField ("_usefileprovider" /*RemoteObject*/ ,starter.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 628;BA.debugLine="SharedFolder = Provider.SharedFolder '    rp.GetS";
Debug.ShouldStop(524288);
starter._sharedfolder = starter._provider.getField(true,"_sharedfolder" /*RemoteObject*/ );
 BA.debugLineNum = 629;BA.debugLine="SafeDefaultExternal = SharedFolder 'rp.GetSafeDir";
Debug.ShouldStop(1048576);
starter._safedefaultexternal = starter._sharedfolder;
 BA.debugLineNum = 631;BA.debugLine="InternalFolder = File.DirInternal";
Debug.ShouldStop(4194304);
starter._internalfolder = starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 BA.debugLineNum = 632;BA.debugLine="AssetsFolder = File.DirAssets";
Debug.ShouldStop(8388608);
starter._assetsfolder = starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets");
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
public static RemoteObject  _str_createemailalert(RemoteObject _alert_text) throws Exception{
try {
		Debug.PushSubsStack("Str_CreateEmailAlert (starter) ","starter",1,starter.processBA,starter.mostCurrent,850);
if (RapidSub.canDelegate("str_createemailalert")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","str_createemailalert", _alert_text);}
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _alerttagcode = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
Debug.locals.put("Alert_Text", _alert_text);
 BA.debugLineNum = 850;BA.debugLine="Sub Str_CreateEmailAlert(Alert_Text As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 851;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_al";
Debug.ShouldStop(262144);
_mid = RemoteObject.solve(new RemoteObject[] {starter.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("dta_alerts")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 852;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateTa";
Debug.ShouldStop(524288);
_alerttagcode = (RemoteObject.concat(RemoteObject.createImmutable(""),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,starter.processBA,(Object)(RemoteObject.createImmutable("ALERTINF_")))))),RemoteObject.createImmutable("")));Debug.locals.put("alerttagcode", _alerttagcode);Debug.locals.put("alerttagcode", _alerttagcode);
 BA.debugLineNum = 853;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (id";
Debug.ShouldStop(1048576);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"),RemoteObject.createImmutable("							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"),RemoteObject.createImmutable("							values ("),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '', 'ALRTREL_REQUESTS', 'ALRTTYP_NOTIFY', 1, 1, '"),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alert_text))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("	'"),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("', '"),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((starter.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,starter.processBA)))),RemoteObject.createImmutable("', '', 1, 1, 0, 0)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 857;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL, \"";
Debug.ShouldStop(16777216);
starter.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("butSavePicture_Click")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 858;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
Debug.ShouldStop(33554432);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",starter.processBA,(Object)((starter.mostCurrent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("BadgeCheckUpdate")));
 BA.debugLineNum = 859;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("TestTheServer (starter) ","starter",1,starter.processBA,starter.mostCurrent,712);
if (RapidSub.canDelegate("testtheserver")) { return xevolution.vrcg.devdemov2400.starter.remoteMe.runUserSub(false, "starter","testtheserver", _serveraddress, _data);}
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
public ResumableSub_TestTheServer(xevolution.vrcg.devdemov2400.starter parent,RemoteObject _serveraddress,RemoteObject _data) {
this.parent = parent;
this._serveraddress = _serveraddress;
this._data = _data;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.starter parent;
RemoteObject _serveraddress;
RemoteObject _data;
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TestTheServer (starter) ","starter",1,starter.processBA,starter.mostCurrent,712);
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
 BA.debugLineNum = 713;BA.debugLine="Try";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 714;BA.debugLine="Dim Status As Int = 0";
Debug.ShouldStop(512);
_status = BA.numberCast(int.class, 0);Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 715;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1024);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 716;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString("")),(Object)(starter.getObject()));
 BA.debugLineNum = 717;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(4096);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 718;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(8192);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 719;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", starter.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "starter", "testtheserver"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 720;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 721;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
Debug.ShouldStop(65536);
_status = parent.mostCurrent._utils.runMethod(true,"_jobapistatus" /*RemoteObject*/ ,starter.processBA,(Object)(_job));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 722;BA.debugLine="Log(Status)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61900554",BA.NumberToString(_status),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 724;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61900556",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 726;BA.debugLine="Job.Release";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 728;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","61900560",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 BA.debugLineNum = 729;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,starter.processBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",starter.processBA))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 732;BA.debugLine="Return (Status >= 1)";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(((RemoteObject.solveBoolean("g",_status,BA.numberCast(double.class, 1))))));return;};
 BA.debugLineNum = 733;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e0.toString());}
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