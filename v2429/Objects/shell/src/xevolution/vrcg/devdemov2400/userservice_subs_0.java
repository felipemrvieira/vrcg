package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class userservice_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (userservice) ","userservice",64,userservice.processBA,userservice.mostCurrent,11);
if (RapidSub.canDelegate("service_create")) { return xevolution.vrcg.devdemov2400.userservice.remoteMe.runUserSub(false, "userservice","service_create");}
 BA.debugLineNum = 11;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Service_Destroy (userservice) ","userservice",64,userservice.processBA,userservice.mostCurrent,26);
if (RapidSub.canDelegate("service_destroy")) { return xevolution.vrcg.devdemov2400.userservice.remoteMe.runUserSub(false, "userservice","service_destroy");}
 BA.debugLineNum = 26;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Service_Start (userservice) ","userservice",64,userservice.processBA,userservice.mostCurrent,15);
if (RapidSub.canDelegate("service_start")) { return xevolution.vrcg.devdemov2400.userservice.remoteMe.runUserSub(false, "userservice","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 15;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}