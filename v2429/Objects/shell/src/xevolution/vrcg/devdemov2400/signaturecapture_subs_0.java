package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class signaturecapture_subs_0 {


public static RemoteObject  _clear(RemoteObject _ba,RemoteObject _sd) throws Exception{
try {
		Debug.PushSubsStack("Clear (signaturecapture) ","signaturecapture",52,_ba,signaturecapture.mostCurrent,18);
if (RapidSub.canDelegate("clear")) { return xevolution.vrcg.devdemov2400.signaturecapture.remoteMe.runUserSub(false, "signaturecapture","clear", _ba, _sd);}
;
Debug.locals.put("SD", _sd);
 BA.debugLineNum = 18;BA.debugLine="Sub Clear(SD As SignatureData)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="If SD.IsInitialized Then";
Debug.ShouldStop(262144);
if (_sd.getField(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 20;BA.debugLine="SD.Canvas.DrawColor(Colors.White)";
Debug.ShouldStop(524288);
_sd.getField(false,"Canvas" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(signaturecapture.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 21;BA.debugLine="SD.Panel.Invalidate";
Debug.ShouldStop(1048576);
_sd.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 };
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel_touch(RemoteObject _ba,RemoteObject _sd,RemoteObject _x,RemoteObject _y,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("Panel_Touch (signaturecapture) ","signaturecapture",52,_ba,signaturecapture.mostCurrent,7);
if (RapidSub.canDelegate("panel_touch")) { return xevolution.vrcg.devdemov2400.signaturecapture.remoteMe.runUserSub(false, "signaturecapture","panel_touch", _ba, _sd, _x, _y, _action);}
;
Debug.locals.put("SD", _sd);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 7;BA.debugLine="Sub Panel_Touch(SD As SignatureData, x As Int,y As";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="If Action = 0 Then 'mouse down constant";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 9;BA.debugLine="px = x";
Debug.ShouldStop(256);
signaturecapture._px = _x;
 BA.debugLineNum = 10;BA.debugLine="py = y";
Debug.ShouldStop(512);
signaturecapture._py = _y;
 }else {
 BA.debugLineNum = 12;BA.debugLine="SD.Canvas.DrawLine(px, py, x, y, SD.SignatureCol";
Debug.ShouldStop(2048);
_sd.getField(false,"Canvas" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, signaturecapture._px)),(Object)(BA.numberCast(float.class, signaturecapture._py)),(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _y)),(Object)(_sd.getField(true,"SignatureColor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, _sd.getField(true,"SignatureWidth" /*RemoteObject*/ ))));
 BA.debugLineNum = 13;BA.debugLine="SD.Panel.Invalidate";
Debug.ShouldStop(4096);
_sd.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 14;BA.debugLine="px = x";
Debug.ShouldStop(8192);
signaturecapture._px = _x;
 BA.debugLineNum = 15;BA.debugLine="py = y";
Debug.ShouldStop(16384);
signaturecapture._py = _y;
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim px, py As Int";
signaturecapture._px = RemoteObject.createImmutable(0);
signaturecapture._py = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 4;BA.debugLine="Type SignatureData (Canvas As Canvas, Panel As Pa";
;
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _save(RemoteObject _ba,RemoteObject _sd,RemoteObject _dir,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("Save (signaturecapture) ","signaturecapture",52,_ba,signaturecapture.mostCurrent,24);
if (RapidSub.canDelegate("save")) { return xevolution.vrcg.devdemov2400.signaturecapture.remoteMe.runUserSub(false, "signaturecapture","save", _ba, _sd, _dir, _name);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
;
Debug.locals.put("SD", _sd);
Debug.locals.put("Dir", _dir);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 24;BA.debugLine="Sub Save(SD As SignatureData, Dir As String, Name";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(16777216);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 26;BA.debugLine="out = File.OpenOutput(Dir, Name, False)";
Debug.ShouldStop(33554432);
_out = signaturecapture.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_name),(Object)(signaturecapture.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 27;BA.debugLine="SD.Canvas.Bitmap.WriteToStream(out, ShareCode.DEV";
Debug.ShouldStop(67108864);
_sd.getField(false,"Canvas" /*RemoteObject*/ ).runMethod(false,"getBitmap").runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(signaturecapture.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),signaturecapture.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="out.Close";
Debug.ShouldStop(134217728);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}