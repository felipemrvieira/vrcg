package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class notas_subs_0 {


public static RemoteObject  _informa(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Informa (notas) ","notas",46,_ba,notas.mostCurrent,9);
if (RapidSub.canDelegate("informa")) { return xevolution.vrcg.devdemov2400.notas.remoteMe.runUserSub(false, "notas","informa", _ba);}
;
 BA.debugLineNum = 9;BA.debugLine="Sub Informa";
Debug.ShouldStop(256);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _merges(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Merges (notas) ","notas",46,_ba,notas.mostCurrent,74);
if (RapidSub.canDelegate("merges")) { return xevolution.vrcg.devdemov2400.notas.remoteMe.runUserSub(false, "notas","merges", _ba);}
;
 BA.debugLineNum = 74;BA.debugLine="Sub Merges";
Debug.ShouldStop(512);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}