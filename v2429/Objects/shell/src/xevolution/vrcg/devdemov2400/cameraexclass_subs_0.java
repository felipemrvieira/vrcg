package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cameraexclass_subs_0 {


public static void  _camera_focusdone(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Camera_FocusDone (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("camera_focusdone")) { __ref.runUserSub(false, "cameraexclass","camera_focusdone", __ref, _success); return;}
ResumableSub_Camera_FocusDone rsub = new ResumableSub_Camera_FocusDone(null,__ref,_success);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Camera_FocusDone extends BA.ResumableSub {
public ResumableSub_Camera_FocusDone(xevolution.vrcg.devdemov2400.cameraexclass parent,RemoteObject __ref,RemoteObject _success) {
this.parent = parent;
this.__ref = __ref;
this._success = _success;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.cameraexclass parent;
RemoteObject _success;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Camera_FocusDone (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,353);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Success", _success);
 BA.debugLineNum = 354;BA.debugLine="If Success Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 355;BA.debugLine="Sleep(100)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraexclass", "camera_focusdone"),BA.numberCast(int.class, 100));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 356;BA.debugLine="TakePicture";
Debug.ShouldStop(8);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_takepicture" /*RemoteObject*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 358;BA.debugLine="Log(\"AutoFocus error.\")";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","6128974853",RemoteObject.createImmutable("AutoFocus error."),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static RemoteObject  _camera_picturetaken(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Camera_PictureTaken (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("camera_picturetaken")) { return __ref.runUserSub(false, "cameraexclass","camera_picturetaken", __ref, _data);}
Debug.locals.put("Data", _data);
 BA.debugLineNum = 123;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
Debug.ShouldStop(134217728);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_PictureTaken"))),(Object)((_data)));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera_preview(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Camera_Preview (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("camera_preview")) { return __ref.runUserSub(false, "cameraexclass","camera_preview", __ref, _data);}
Debug.locals.put("Data", _data);
 BA.debugLineNum = 108;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
Debug.ShouldStop(4096);
if (cameraexclass.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_preview")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 110;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
Debug.ShouldStop(8192);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_preview"))),(Object)((_data)));
 };
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera_ready(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Camera_Ready (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("camera_ready")) { return __ref.runUserSub(false, "cameraexclass","camera_ready", __ref, _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 95;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="If Success Then";
Debug.ShouldStop(-2147483648);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="r.target = cam";
Debug.ShouldStop(1);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",(__ref.getField(false,"_cam" /*RemoteObject*/ )));
 BA.debugLineNum = 98;BA.debugLine="nativeCam = r.GetField(\"camera\")";
Debug.ShouldStop(2);
__ref.setField ("_nativecam" /*RemoteObject*/ ,__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("camera"))));
 BA.debugLineNum = 99;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(4);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_nativecam" /*RemoteObject*/ ));
 BA.debugLineNum = 100;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
Debug.ShouldStop(8);
__ref.setField ("_parameters" /*RemoteObject*/ ,__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getParameters"))));
 BA.debugLineNum = 101;BA.debugLine="SetDisplayOrientation";
Debug.ShouldStop(16);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setdisplayorientation" /*void*/ );
 }else {
 BA.debugLineNum = 103;BA.debugLine="Log(\"success = false, \" & LastException.Message)";
Debug.ShouldStop(64);
cameraexclass.__c.runVoidMethod ("LogImpl","6126681096",RemoteObject.concat(RemoteObject.createImmutable("success = false, "),cameraexclass.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 105;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
Debug.ShouldStop(256);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_ready"))),(Object)((_success)));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private nativeCam As Object";
cameraexclass._nativecam = RemoteObject.createNew ("Object");__ref.setField("_nativecam",cameraexclass._nativecam);
 //BA.debugLineNum = 8;BA.debugLine="Private cam As Camera";
cameraexclass._cam = RemoteObject.createNew ("anywheresoftware.b4a.objects.CameraW");__ref.setField("_cam",cameraexclass._cam);
 //BA.debugLineNum = 9;BA.debugLine="Private r As Reflector";
cameraexclass._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");__ref.setField("_r",cameraexclass._r);
 //BA.debugLineNum = 10;BA.debugLine="Private target As Object";
cameraexclass._target = RemoteObject.createNew ("Object");__ref.setField("_target",cameraexclass._target);
 //BA.debugLineNum = 11;BA.debugLine="Private event As String";
cameraexclass._event = RemoteObject.createImmutable("");__ref.setField("_event",cameraexclass._event);
 //BA.debugLineNum = 12;BA.debugLine="Public Front As Boolean";
cameraexclass._front = RemoteObject.createImmutable(false);__ref.setField("_front",cameraexclass._front);
 //BA.debugLineNum = 13;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
 //BA.debugLineNum = 14;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
 //BA.debugLineNum = 15;BA.debugLine="Private parameters As Object";
cameraexclass._parameters = RemoteObject.createNew ("Object");__ref.setField("_parameters",cameraexclass._parameters);
 //BA.debugLineNum = 16;BA.debugLine="Public PreviewOrientation As Int";
cameraexclass._previeworientation = RemoteObject.createImmutable(0);__ref.setField("_previeworientation",cameraexclass._previeworientation);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _closenow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CloseNow (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("closenow")) { return __ref.runUserSub(false, "cameraexclass","closenow", __ref);}
 BA.debugLineNum = 342;BA.debugLine="Public Sub CloseNow";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="cam.Release";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("Release");
 BA.debugLineNum = 344;BA.debugLine="r.target = cam";
Debug.ShouldStop(8388608);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",(__ref.getField(false,"_cam" /*RemoteObject*/ )));
 BA.debugLineNum = 345;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
Debug.ShouldStop(16777216);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("releaseCameras")),(Object)(BA.ObjectToString(cameraexclass.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _commitparameters(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CommitParameters (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("commitparameters")) { return __ref.runUserSub(false, "cameraexclass","commitparameters", __ref);}
 BA.debugLineNum = 156;BA.debugLine="Public Sub CommitParameters";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 158;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(536870912);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_nativecam" /*RemoteObject*/ ));
 BA.debugLineNum = 159;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(pa";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setParameters")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_parameters" /*RemoteObject*/ )})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.hardware.Camera$Parameters")})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 161;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
cameraexclass.__c.runVoidMethod ("LogImpl","6127336453",BA.ObjectToString(cameraexclass.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _facedetection_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("FaceDetection_Event (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("facedetection_event")) { return __ref.runUserSub(false, "cameraexclass","facedetection_event", __ref, _methodname, _args);}
RemoteObject _faces = null;
RemoteObject _f = RemoteObject.declareNull("Object");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _facerect = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 408;BA.debugLine="Private Sub FaceDetection_Event (MethodName As Str";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 409;BA.debugLine="Dim faces() As Object = Args(0)";
Debug.ShouldStop(16777216);
_faces = (_args.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("faces", _faces);Debug.locals.put("faces", _faces);
 BA.debugLineNum = 410;BA.debugLine="For Each f As Object In faces";
Debug.ShouldStop(33554432);
{
final RemoteObject group2 = _faces;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_f = group2.getArrayElement(false,RemoteObject.createImmutable(index2));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 411;BA.debugLine="Dim jo As JavaObject = f";
Debug.ShouldStop(67108864);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _f);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 412;BA.debugLine="Dim faceRect As Rect = jo.GetField(\"rect\")";
Debug.ShouldStop(134217728);
_facerect = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
_facerect = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper"), _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("rect"))));Debug.locals.put("faceRect", _facerect);
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 414;BA.debugLine="Return Null";
Debug.ShouldStop(536870912);
if (true) return cameraexclass.__c.getField(false,"Null");
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findcamera(RemoteObject __ref,RemoteObject _frontcamera) throws Exception{
try {
		Debug.PushSubsStack("FindCamera (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("findcamera")) { return __ref.runUserSub(false, "cameraexclass","findcamera", __ref, _frontcamera);}
RemoteObject _ci = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid");
RemoteObject _camerainfo = RemoteObject.declareNull("Object");
RemoteObject _cameravalue = RemoteObject.createImmutable(0);
RemoteObject _numberofcameras = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("frontCamera", _frontcamera);
 BA.debugLineNum = 36;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Dim ci As CameraInfoAndId";
Debug.ShouldStop(16);
_ci = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid");Debug.locals.put("ci", _ci);
 BA.debugLineNum = 38;BA.debugLine="Dim cameraInfo As Object";
Debug.ShouldStop(32);
_camerainfo = RemoteObject.createNew ("Object");Debug.locals.put("cameraInfo", _camerainfo);
 BA.debugLineNum = 39;BA.debugLine="Dim cameraValue As Int";
Debug.ShouldStop(64);
_cameravalue = RemoteObject.createImmutable(0);Debug.locals.put("cameraValue", _cameravalue);
 BA.debugLineNum = 40;BA.debugLine="Log(\"findCamera\")";
Debug.ShouldStop(128);
cameraexclass.__c.runVoidMethod ("LogImpl","6126550020",RemoteObject.createImmutable("findCamera"),0);
 BA.debugLineNum = 41;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
Debug.ShouldStop(256);
if (_frontcamera.<Boolean>get().booleanValue()) { 
_cameravalue = BA.numberCast(int.class, 1);Debug.locals.put("cameraValue", _cameravalue);}
else {
_cameravalue = BA.numberCast(int.class, 0);Debug.locals.put("cameraValue", _cameravalue);};
 BA.debugLineNum = 42;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
Debug.ShouldStop(512);
_camerainfo = __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"CreateObject",(Object)(RemoteObject.createImmutable("android.hardware.Camera$CameraInfo")));Debug.locals.put("cameraInfo", _camerainfo);
 BA.debugLineNum = 43;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
Debug.ShouldStop(1024);
_numberofcameras = BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("android.hardware.Camera")),(Object)(BA.ObjectToString("getNumberOfCameras")),(Object)((cameraexclass.__c.getField(false,"Null"))),(Object)((cameraexclass.__c.getField(false,"Null")))));Debug.locals.put("numberOfCameras", _numberofcameras);Debug.locals.put("numberOfCameras", _numberofcameras);
 BA.debugLineNum = 44;BA.debugLine="Log(r.target)";
Debug.ShouldStop(2048);
cameraexclass.__c.runVoidMethod ("LogImpl","6126550024",BA.ObjectToString(__ref.getField(false,"_r" /*RemoteObject*/ ).getField(false,"Target")),0);
 BA.debugLineNum = 45;BA.debugLine="Log(numberOfCameras)";
Debug.ShouldStop(4096);
cameraexclass.__c.runVoidMethod ("LogImpl","6126550025",BA.NumberToString(_numberofcameras),0);
 BA.debugLineNum = 46;BA.debugLine="For i = 0 To numberOfCameras - 1";
Debug.ShouldStop(8192);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_numberofcameras,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 47;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
Debug.ShouldStop(16384);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunStaticMethod",(Object)(BA.ObjectToString("android.hardware.Camera")),(Object)(BA.ObjectToString("getCameraInfo")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((_i)),_camerainfo})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("android.hardware.Camera$CameraInfo")})));
 BA.debugLineNum = 49;BA.debugLine="r.target = cameraInfo";
Debug.ShouldStop(65536);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_camerainfo);
 BA.debugLineNum = 50;BA.debugLine="Log(\"facing: \" & r.GetField(\"facing\") & \", \" & c";
Debug.ShouldStop(131072);
cameraexclass.__c.runVoidMethod ("LogImpl","6126550030",RemoteObject.concat(RemoteObject.createImmutable("facing: "),__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("facing"))),RemoteObject.createImmutable(", "),_cameravalue),0);
 BA.debugLineNum = 51;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("facing"))),(_cameravalue))) { 
 BA.debugLineNum = 52;BA.debugLine="ci.cameraInfo = r.target";
Debug.ShouldStop(524288);
_ci.setField ("CameraInfo" /*RemoteObject*/ ,__ref.getField(false,"_r" /*RemoteObject*/ ).getField(false,"Target"));
 BA.debugLineNum = 53;BA.debugLine="ci.Id = i";
Debug.ShouldStop(1048576);
_ci.setField ("Id" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 54;BA.debugLine="Return ci";
Debug.ShouldStop(2097152);
if (true) return _ci;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 57;BA.debugLine="ci.id = -1";
Debug.ShouldStop(16777216);
_ci.setField ("Id" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 58;BA.debugLine="Return ci";
Debug.ShouldStop(33554432);
if (true) return _ci;
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _focusandtakepicture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FocusAndTakePicture (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("focusandtakepicture")) { return __ref.runUserSub(false, "cameraexclass","focusandtakepicture", __ref);}
 BA.debugLineNum = 348;BA.debugLine="Public Sub FocusAndTakePicture";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="cam.AutoFocus";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("AutoFocus");
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcoloreffect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetColorEffect (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("getcoloreffect")) { return __ref.runUserSub(false, "cameraexclass","getcoloreffect", __ref);}
 BA.debugLineNum = 165;BA.debugLine="Public Sub GetColorEffect As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Return GetParameter(\"effect\")";
Debug.ShouldStop(32);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getparameter" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("effect")));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getexposurecompensation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getExposureCompensation (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("getexposurecompensation")) { return __ref.runUserSub(false, "cameraexclass","getexposurecompensation", __ref);}
 BA.debugLineNum = 382;BA.debugLine="Public Sub getExposureCompensation As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 383;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 384;BA.debugLine="Return r.RunMethod(\"getExposureCompensation\")";
Debug.ShouldStop(-2147483648);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getExposureCompensation"))));
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getflashmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFlashMode (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("getflashmode")) { return __ref.runUserSub(false, "cameraexclass","getflashmode", __ref);}
 BA.debugLineNum = 220;BA.debugLine="Public Sub GetFlashMode As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="r.target = parameters";
Debug.ShouldStop(268435456);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 222;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString(__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getFlashMode"))));
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfocusdistances(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFocusDistances (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("getfocusdistances")) { return __ref.runUserSub(false, "cameraexclass","getfocusdistances", __ref);}
RemoteObject _f = null;
 BA.debugLineNum = 329;BA.debugLine="Public Sub GetFocusDistances As Float()";
Debug.ShouldStop(256);
 BA.debugLineNum = 330;BA.debugLine="Dim F(3) As Float";
Debug.ShouldStop(512);
_f = RemoteObject.createNewArray ("float", new int[] {3}, new Object[]{});Debug.locals.put("F", _f);
 BA.debugLineNum = 331;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1024);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 332;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
Debug.ShouldStop(2048);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("getFocusDistances")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_f)})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("[F")})));
 BA.debugLineNum = 333;BA.debugLine="Return F";
Debug.ShouldStop(4096);
if (true) return _f;
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaxexposurecompensation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMaxExposureCompensation (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,397);
if (RapidSub.canDelegate("getmaxexposurecompensation")) { return __ref.runUserSub(false, "cameraexclass","getmaxexposurecompensation", __ref);}
 BA.debugLineNum = 397;BA.debugLine="Public Sub getMaxExposureCompensation As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8192);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 399;BA.debugLine="Return r.RunMethod(\"getMaxExposureCompensation\")";
Debug.ShouldStop(16384);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getMaxExposureCompensation"))));
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaxzoom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetMaxZoom (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("getmaxzoom")) { return __ref.runUserSub(false, "cameraexclass","getmaxzoom", __ref);}
 BA.debugLineNum = 367;BA.debugLine="Public Sub GetMaxZoom As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 368;BA.debugLine="r.target = parameters";
Debug.ShouldStop(32768);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 369;BA.debugLine="Return r.RunMethod(\"getMaxZoom\")";
Debug.ShouldStop(65536);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getMaxZoom"))));
 BA.debugLineNum = 370;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getminexposurecompensation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMinExposureCompensation (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,392);
if (RapidSub.canDelegate("getminexposurecompensation")) { return __ref.runUserSub(false, "cameraexclass","getminexposurecompensation", __ref);}
 BA.debugLineNum = 392;BA.debugLine="Public Sub getMinExposureCompensation As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 393;BA.debugLine="r.target = parameters";
Debug.ShouldStop(256);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 394;BA.debugLine="Return r.RunMethod(\"getMinExposureCompensation\")";
Debug.ShouldStop(512);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getMinExposureCompensation"))));
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparameter(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetParameter (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("getparameter")) { return __ref.runUserSub(false, "cameraexclass","getparameter", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 151;BA.debugLine="Public Sub GetParameter(Key As String) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8388608);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 153;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString(__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("get")),(Object)(_key),(Object)(RemoteObject.createImmutable("java.lang.String"))));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpicturesize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPictureSize (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("getpicturesize")) { return __ref.runUserSub(false, "cameraexclass","getpicturesize", __ref);}
RemoteObject _cont = RemoteObject.createImmutable(false);
RemoteObject _cs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
 BA.debugLineNum = 264;BA.debugLine="Public Sub GetPictureSize As CameraSize";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Dim cont As Boolean= True";
Debug.ShouldStop(256);
_cont = cameraexclass.__c.getField(true,"True");Debug.locals.put("cont", _cont);Debug.locals.put("cont", _cont);
 BA.debugLineNum = 266;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 267;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1024);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 268;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPictureSize"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 270;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
cameraexclass.__c.runVoidMethod ("LogImpl","6128385030",BA.ObjectToString(cameraexclass.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 271;BA.debugLine="cont = False";
Debug.ShouldStop(16384);
_cont = cameraexclass.__c.getField(true,"False");Debug.locals.put("cont", _cont);
 };
 BA.debugLineNum = 274;BA.debugLine="Dim cs As CameraSize";
Debug.ShouldStop(131072);
_cs = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 277;BA.debugLine="cs.Initialize";
Debug.ShouldStop(1048576);
_cs.runVoidMethod ("Initialize");
 BA.debugLineNum = 278;BA.debugLine="If cont Then";
Debug.ShouldStop(2097152);
if (_cont.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 279;BA.debugLine="cs.Width = r.GetField(\"width\")";
Debug.ShouldStop(4194304);
_cs.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 280;BA.debugLine="cs.Height = r.GetField(\"height\")";
Debug.ShouldStop(8388608);
_cs.setField ("Height" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 };
 BA.debugLineNum = 283;BA.debugLine="Return cs";
Debug.ShouldStop(67108864);
if (true) return _cs;
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpreviewfpsrange(RemoteObject __ref,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("GetPreviewFpsRange (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("getpreviewfpsrange")) { return __ref.runUserSub(false, "cameraexclass","getpreviewfpsrange", __ref, _range);}
Debug.locals.put("Range", _range);
 BA.debugLineNum = 242;BA.debugLine="Public Sub GetPreviewFpsRange(Range() As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="r.target = parameters";
Debug.ShouldStop(262144);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 244;BA.debugLine="r.RunMethod4(\"getPreviewFpsRange\", Array As Objec";
Debug.ShouldStop(524288);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("getPreviewFpsRange")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_range)})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("[I")})));
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpreviewsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPreviewSize (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("getpreviewsize")) { return __ref.runUserSub(false, "cameraexclass","getpreviewsize", __ref);}
RemoteObject _cs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
 BA.debugLineNum = 253;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="r.target = parameters";
Debug.ShouldStop(536870912);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 255;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewSize"))));
 BA.debugLineNum = 256;BA.debugLine="Dim cs As CameraSize";
Debug.ShouldStop(-2147483648);
_cs = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 258;BA.debugLine="cs.Initialize";
Debug.ShouldStop(2);
_cs.runVoidMethod ("Initialize");
 BA.debugLineNum = 259;BA.debugLine="cs.Width = r.GetField(\"width\")";
Debug.ShouldStop(4);
_cs.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 260;BA.debugLine="cs.Height = r.GetField(\"height\")";
Debug.ShouldStop(8);
_cs.setField ("Height" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 BA.debugLineNum = 261;BA.debugLine="Return cs";
Debug.ShouldStop(16);
if (true) return _cs;
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedcoloreffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedColorEffects (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("getsupportedcoloreffects")) { return __ref.runUserSub(false, "cameraexclass","getsupportedcoloreffects", __ref);}
 BA.debugLineNum = 230;BA.debugLine="Public Sub GetSupportedColorEffects As List";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="r.target = parameters";
Debug.ShouldStop(64);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 232;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
Debug.ShouldStop(128);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedColorEffects"))));
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedflashmodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedFlashModes (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("getsupportedflashmodes")) { return __ref.runUserSub(false, "cameraexclass","getsupportedflashmodes", __ref);}
 BA.debugLineNum = 225;BA.debugLine="Public Sub GetSupportedFlashModes As List";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="r.target = parameters";
Debug.ShouldStop(2);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 227;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
Debug.ShouldStop(4);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedFlashModes"))));
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedfocusmodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedFocusModes (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("getsupportedfocusmodes")) { return __ref.runUserSub(false, "cameraexclass","getsupportedfocusmodes", __ref);}
 BA.debugLineNum = 308;BA.debugLine="Public Sub GetSupportedFocusModes As List";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1048576);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 310;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedFocusModes"))));
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedpictureformats(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedPictureFormats (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("getsupportedpictureformats")) { return __ref.runUserSub(false, "cameraexclass","getsupportedpictureformats", __ref);}
 BA.debugLineNum = 336;BA.debugLine="Public Sub GetSupportedPictureFormats As List";
Debug.ShouldStop(32768);
 BA.debugLineNum = 337;BA.debugLine="r.target = parameters";
Debug.ShouldStop(65536);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 338;BA.debugLine="Return r.RunMethod(\"getSupportedPictureFormats\")";
Debug.ShouldStop(131072);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedPictureFormats"))));
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedpicturessizes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedPicturesSizes (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("getsupportedpicturessizes")) { return __ref.runUserSub(false, "cameraexclass","getsupportedpicturessizes", __ref);}
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cs = null;
int _i = 0;
 BA.debugLineNum = 191;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="r.target = parameters";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 193;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
Debug.ShouldStop(1);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedPictureSizes"))));Debug.locals.put("list1", _list1);
 BA.debugLineNum = 194;BA.debugLine="Dim cs(list1.Size) As CameraSize";
Debug.ShouldStop(2);
_cs = RemoteObject.createNewArray ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize", new int[] {_list1.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cs", _cs);
 BA.debugLineNum = 195;BA.debugLine="For i = 0 To list1.Size - 1";
Debug.ShouldStop(4);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 196;BA.debugLine="r.target = list1.get(i)";
Debug.ShouldStop(8);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 198;BA.debugLine="cs(i).Initialize";
Debug.ShouldStop(32);
_cs.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
Debug.ShouldStop(64);
_cs.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 200;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
Debug.ShouldStop(128);
_cs.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).setField ("Height" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 202;BA.debugLine="Return cs";
Debug.ShouldStop(512);
if (true) return _cs;
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedpreviewfpsrange(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedPreviewFpsRange (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("getsupportedpreviewfpsrange")) { return __ref.runUserSub(false, "cameraexclass","getsupportedpreviewfpsrange", __ref);}
 BA.debugLineNum = 236;BA.debugLine="Public Sub GetSupportedPreviewFpsRange As List";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="r.target = parameters";
Debug.ShouldStop(4096);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 238;BA.debugLine="Return r.RunMethod(\"getSupportedPreviewFpsRange\")";
Debug.ShouldStop(8192);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedPreviewFpsRange"))));
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedpreviewsizes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedPreviewSizes (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("getsupportedpreviewsizes")) { return __ref.runUserSub(false, "cameraexclass","getsupportedpreviewsizes", __ref);}
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cs = null;
int _i = 0;
 BA.debugLineNum = 173;BA.debugLine="Public Sub GetSupportedPreviewSizes As CameraSize(";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8192);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 175;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPrev";
Debug.ShouldStop(16384);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedPreviewSizes"))));Debug.locals.put("list1", _list1);
 BA.debugLineNum = 176;BA.debugLine="Dim cs(list1.Size) As CameraSize";
Debug.ShouldStop(32768);
_cs = RemoteObject.createNewArray ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize", new int[] {_list1.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cs", _cs);
 BA.debugLineNum = 177;BA.debugLine="For i = 0 To list1.Size - 1";
Debug.ShouldStop(65536);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 178;BA.debugLine="r.target = list1.get(i)";
Debug.ShouldStop(131072);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 180;BA.debugLine="cs(i).Initialize";
Debug.ShouldStop(524288);
_cs.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).runVoidMethod ("Initialize");
 BA.debugLineNum = 181;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
Debug.ShouldStop(1048576);
_cs.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 182;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
Debug.ShouldStop(2097152);
_cs.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).setField ("Height" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 184;BA.debugLine="Return cs";
Debug.ShouldStop(8388608);
if (true) return _cs;
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getzoom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getZoom (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,372);
if (RapidSub.canDelegate("getzoom")) { return __ref.runUserSub(false, "cameraexclass","getzoom", __ref);}
 BA.debugLineNum = 372;BA.debugLine="Public Sub getZoom() As Int";
Debug.ShouldStop(524288);
 BA.debugLineNum = 373;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1048576);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 374;BA.debugLine="Return r.RunMethod(\"getZoom\")";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getZoom"))));
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _panel1,RemoteObject _frontcamera,RemoteObject _targetmodule,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cameraexclass","initialize", __ref, _ba, _panel1, _frontcamera, _targetmodule, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("Panel1", _panel1);
Debug.locals.put("FrontCamera", _frontcamera);
Debug.locals.put("TargetModule", _targetmodule);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="target = TargetModule";
Debug.ShouldStop(524288);
__ref.setField ("_target" /*RemoteObject*/ ,_targetmodule);
 BA.debugLineNum = 21;BA.debugLine="event = EventName";
Debug.ShouldStop(1048576);
__ref.setField ("_event" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="Front = FrontCamera";
Debug.ShouldStop(2097152);
__ref.setField ("_front" /*RemoteObject*/ ,_frontcamera);
 BA.debugLineNum = 23;BA.debugLine="Dim id As Int";
Debug.ShouldStop(4194304);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 24;BA.debugLine="id = FindCamera(Front).id";
Debug.ShouldStop(8388608);
_id = __ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_findcamera" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_front" /*RemoteObject*/ ))).getField(true,"Id" /*RemoteObject*/ );Debug.locals.put("id", _id);
 BA.debugLineNum = 25;BA.debugLine="If id = -1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 26;BA.debugLine="Front = Not(Front) 'try different camera";
Debug.ShouldStop(33554432);
__ref.setField ("_front" /*RemoteObject*/ ,cameraexclass.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_front" /*RemoteObject*/ ))));
 BA.debugLineNum = 27;BA.debugLine="id = FindCamera(Front).id";
Debug.ShouldStop(67108864);
_id = __ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_findcamera" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_front" /*RemoteObject*/ ))).getField(true,"Id" /*RemoteObject*/ );Debug.locals.put("id", _id);
 BA.debugLineNum = 28;BA.debugLine="If id = -1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 29;BA.debugLine="ToastMessageShow(\"No camera found.\", True)";
Debug.ShouldStop(268435456);
cameraexclass.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No camera found.")),(Object)(cameraexclass.__c.getField(true,"True")));
 BA.debugLineNum = 30;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 33;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
Debug.ShouldStop(1);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)((_panel1.getObject())),(Object)(BA.ObjectToString("camera")),(Object)(_id));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iszoomsupported(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsZoomSupported (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,362);
if (RapidSub.canDelegate("iszoomsupported")) { return __ref.runUserSub(false, "cameraexclass","iszoomsupported", __ref);}
 BA.debugLineNum = 362;BA.debugLine="Public Sub IsZoomSupported As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 363;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1024);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 364;BA.debugLine="Return r.RunMethod(\"isZoomSupported\")";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("isZoomSupported"))));
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _previewimagetojpeg(RemoteObject __ref,RemoteObject _data,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("PreviewImageToJpeg (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("previewimagetojpeg")) { return __ref.runUserSub(false, "cameraexclass","previewimagetojpeg", __ref, _data, _quality);}
RemoteObject _size = RemoteObject.declareNull("Object");
RemoteObject _previewformat = RemoteObject.declareNull("Object");
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _yuvimage = RemoteObject.declareNull("Object");
RemoteObject _rect1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("data", _data);
Debug.locals.put("quality", _quality);
 BA.debugLineNum = 288;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="Dim size, previewFormat As Object";
Debug.ShouldStop(1);
_size = RemoteObject.createNew ("Object");Debug.locals.put("size", _size);
_previewformat = RemoteObject.createNew ("Object");Debug.locals.put("previewFormat", _previewformat);
 BA.debugLineNum = 290;BA.debugLine="r.target = parameters";
Debug.ShouldStop(2);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 291;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
Debug.ShouldStop(4);
_size = __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewSize")));Debug.locals.put("size", _size);
 BA.debugLineNum = 292;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
Debug.ShouldStop(8);
_previewformat = __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewFormat")));Debug.locals.put("previewFormat", _previewformat);
 BA.debugLineNum = 293;BA.debugLine="r.target = size";
Debug.ShouldStop(16);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_size);
 BA.debugLineNum = 294;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
Debug.ShouldStop(32);
_width = BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width"))));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
_height = BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height"))));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 295;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
Debug.ShouldStop(64);
_yuvimage = __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"CreateObject2",(Object)(BA.ObjectToString("android.graphics.YuvImage")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_data),_previewformat,(_width),(_height),cameraexclass.__c.getField(false,"Null")})),(Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("[B"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("[I")})));Debug.locals.put("yuvImage", _yuvimage);Debug.locals.put("yuvImage", _yuvimage);
 BA.debugLineNum = 298;BA.debugLine="r.target = yuvImage";
Debug.ShouldStop(512);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_yuvimage);
 BA.debugLineNum = 299;BA.debugLine="Dim rect1 As Rect";
Debug.ShouldStop(1024);
_rect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("rect1", _rect1);
 BA.debugLineNum = 300;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
Debug.ShouldStop(2048);
_rect1.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWidth"))))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getHeight"))))));
 BA.debugLineNum = 301;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(4096);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 302;BA.debugLine="out.InitializeToBytesArray(100)";
Debug.ShouldStop(8192);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 303;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
Debug.ShouldStop(16384);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("compressToJpeg")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_rect1.getObject()),(_quality),(_out.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("android.graphics.Rect"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.io.OutputStream")})));
 BA.debugLineNum = 305;BA.debugLine="Return out.ToBytesArray";
Debug.ShouldStop(65536);
if (true) return _out.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _release(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Release (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("release")) { return __ref.runUserSub(false, "cameraexclass","release", __ref);}
 BA.debugLineNum = 135;BA.debugLine="Public Sub Release";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="cam.Release";
Debug.ShouldStop(128);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("Release");
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savepicturetofile(RemoteObject __ref,RemoteObject _data,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SavePictureToFile (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("savepicturetofile")) { return __ref.runUserSub(false, "cameraexclass","savepicturetofile", __ref, _data, _dir, _filename);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Data", _data);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 140;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
Debug.ShouldStop(4096);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = cameraexclass.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(cameraexclass.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 142;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
Debug.ShouldStop(8192);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 143;BA.debugLine="out.Close";
Debug.ShouldStop(16384);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcoloreffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("SetColorEffect (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setcoloreffect")) { return __ref.runUserSub(false, "cameraexclass","setcoloreffect", __ref, _effect);}
Debug.locals.put("Effect", _effect);
 BA.debugLineNum = 169;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="SetParameter(\"effect\", Effect)";
Debug.ShouldStop(512);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setparameter" /*RemoteObject*/ ,(Object)(BA.ObjectToString("effect")),(Object)(_effect));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcontinuousautofocus(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetContinuousAutoFocus (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("setcontinuousautofocus")) { return __ref.runUserSub(false, "cameraexclass","setcontinuousautofocus", __ref);}
RemoteObject _modes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 313;BA.debugLine="Public Sub SetContinuousAutoFocus";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
Debug.ShouldStop(33554432);
_modes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_modes = __ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedfocusmodes" /*RemoteObject*/ );Debug.locals.put("modes", _modes);Debug.locals.put("modes", _modes);
 BA.debugLineNum = 315;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_modes.runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("continuous-picture")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 316;BA.debugLine="SetFocusMode(\"continuous-picture\")";
Debug.ShouldStop(134217728);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setfocusmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("continuous-picture")));
 }else 
{ BA.debugLineNum = 317;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1 Th";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_modes.runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("continuous-video")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 318;BA.debugLine="SetFocusMode(\"continuous-video\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setfocusmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("continuous-video")));
 }else {
 BA.debugLineNum = 320;BA.debugLine="Log(\"Continuous focus mode is not available\")";
Debug.ShouldStop(-2147483648);
cameraexclass.__c.runVoidMethod ("LogImpl","6128581639",RemoteObject.createImmutable("Continuous focus mode is not available"),0);
 }}
;
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setdisplayorientation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDisplayOrientation (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setdisplayorientation")) { __ref.runUserSub(false, "cameraexclass","setdisplayorientation", __ref); return;}
ResumableSub_SetDisplayOrientation rsub = new ResumableSub_SetDisplayOrientation(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetDisplayOrientation extends BA.ResumableSub {
public ResumableSub_SetDisplayOrientation(xevolution.vrcg.devdemov2400.cameraexclass parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
xevolution.vrcg.devdemov2400.cameraexclass parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _degrees = RemoteObject.createImmutable(0);
RemoteObject _ci = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerainfoandid");
RemoteObject _orientation = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetDisplayOrientation (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,61);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 62;BA.debugLine="r.target = r.GetActivity";
Debug.ShouldStop(536870912);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",(__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetActivity",__ref.getField(false, "ba"))));
 BA.debugLineNum = 63;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWindowManager"))));
 BA.debugLineNum = 64;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getDefaultDisplay"))));
 BA.debugLineNum = 65;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
Debug.ShouldStop(1);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getRotation"))));
 BA.debugLineNum = 66;BA.debugLine="Dim result, degrees As Int = r.target * 90";
Debug.ShouldStop(2);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
_degrees = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_r" /*RemoteObject*/ ).getField(false,"Target")),RemoteObject.createImmutable(90)}, "*",0, 0));Debug.locals.put("degrees", _degrees);Debug.locals.put("degrees", _degrees);
 BA.debugLineNum = 67;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
Debug.ShouldStop(4);
_ci = __ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_findcamera" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_front" /*RemoteObject*/ )));Debug.locals.put("ci", _ci);Debug.locals.put("ci", _ci);
 BA.debugLineNum = 68;BA.debugLine="r.target = ci.CameraInfo";
Debug.ShouldStop(8);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_ci.getField(false,"CameraInfo" /*RemoteObject*/ ));
 BA.debugLineNum = 69;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
Debug.ShouldStop(16);
_orientation = BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("orientation"))));Debug.locals.put("orientation", _orientation);Debug.locals.put("orientation", _orientation);
 BA.debugLineNum = 70;BA.debugLine="If Front Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_front" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 71;BA.debugLine="PreviewOrientation = (orientation + degrees) Mod";
Debug.ShouldStop(64);
__ref.setField ("_previeworientation" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_orientation,_degrees}, "+",1, 1)),RemoteObject.createImmutable(360)}, "%",0, 1));
 BA.debugLineNum = 72;BA.debugLine="result = PreviewOrientation";
Debug.ShouldStop(128);
_result = __ref.getField(true,"_previeworientation" /*RemoteObject*/ );Debug.locals.put("result", _result);
 BA.debugLineNum = 73;BA.debugLine="PreviewOrientation = (360 - PreviewOrientation)";
Debug.ShouldStop(256);
__ref.setField ("_previeworientation" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),__ref.getField(true,"_previeworientation" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(360)}, "%",0, 1));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 75;BA.debugLine="PreviewOrientation = (orientation - degrees + 36";
Debug.ShouldStop(1024);
__ref.setField ("_previeworientation" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_orientation,_degrees,RemoteObject.createImmutable(360)}, "-+",2, 1)),RemoteObject.createImmutable(360)}, "%",0, 1));
 BA.debugLineNum = 76;BA.debugLine="result = PreviewOrientation";
Debug.ShouldStop(2048);
_result = __ref.getField(true,"_previeworientation" /*RemoteObject*/ );Debug.locals.put("result", _result);
 BA.debugLineNum = 77;BA.debugLine="Log(\"Preview Orientation: \" & PreviewOrientation";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","6126615568",RemoteObject.concat(RemoteObject.createImmutable("Preview Orientation: "),__ref.getField(true,"_previeworientation" /*RemoteObject*/ )),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 79;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(16384);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_nativecam" /*RemoteObject*/ ));
 BA.debugLineNum = 80;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", PreviewOrie";
Debug.ShouldStop(32768);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDisplayOrientation")),(Object)(BA.NumberToString(__ref.getField(true,"_previeworientation" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 81;BA.debugLine="r.target = parameters";
Debug.ShouldStop(65536);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 82;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
Debug.ShouldStop(131072);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setRotation")),(Object)(BA.NumberToString(_result)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 91;BA.debugLine="Sleep(100)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraexclass", "setdisplayorientation"),BA.numberCast(int.class, 100));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 92;BA.debugLine="CommitParameters";
Debug.ShouldStop(134217728);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _setexposurecompensation(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("setExposureCompensation (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("setexposurecompensation")) { return __ref.runUserSub(false, "cameraexclass","setexposurecompensation", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 387;BA.debugLine="Public Sub setExposureCompensation(v As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 389;BA.debugLine="r.RunMethod2(\"setExposureCompensation\", v, \"java.";
Debug.ShouldStop(16);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setExposureCompensation")),(Object)(BA.NumberToString(_v)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfacedetectionlistener(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetFaceDetectionListener (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,402);
if (RapidSub.canDelegate("setfacedetectionlistener")) { return __ref.runUserSub(false, "cameraexclass","setfacedetectionlistener", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _e = RemoteObject.declareNull("Object");
 BA.debugLineNum = 402;BA.debugLine="Public Sub SetFaceDetectionListener";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="Dim jo As JavaObject = nativeCam";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_nativecam" /*RemoteObject*/ ));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 404;BA.debugLine="Dim e As Object = jo.CreateEvent(\"android.hardwar";
Debug.ShouldStop(524288);
_e = _jo.runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("android.hardware.Camera.FaceDetectionListener")),(Object)(BA.ObjectToString("FaceDetection")),(Object)(cameraexclass.__c.getField(false,"Null")));Debug.locals.put("e", _e);Debug.locals.put("e", _e);
 BA.debugLineNum = 405;BA.debugLine="jo.RunMethod(\"setFaceDetectionListener\", Array(e)";
Debug.ShouldStop(1048576);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFaceDetectionListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_e})));
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setflashmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetFlashMode (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("setflashmode")) { return __ref.runUserSub(false, "cameraexclass","setflashmode", __ref, _mode);}
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 215;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8388608);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 217;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
Debug.ShouldStop(16777216);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setFlashMode")),(Object)(_mode),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfocusmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetFocusMode (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("setfocusmode")) { return __ref.runUserSub(false, "cameraexclass","setfocusmode", __ref, _mode);}
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 324;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="r.target = parameters";
Debug.ShouldStop(16);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 326;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.Str";
Debug.ShouldStop(32);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setFocusMode")),(Object)(_mode),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setjpegquality(RemoteObject __ref,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("SetJpegQuality (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("setjpegquality")) { return __ref.runUserSub(false, "cameraexclass","setjpegquality", __ref, _quality);}
Debug.locals.put("Quality", _quality);
 BA.debugLineNum = 210;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="r.target = parameters";
Debug.ShouldStop(262144);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 212;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
Debug.ShouldStop(524288);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setJpegQuality")),(Object)(BA.NumberToString(_quality)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setparameter(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetParameter (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("setparameter")) { return __ref.runUserSub(false, "cameraexclass","setparameter", __ref, _key, _value);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 146;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="r.target = parameters";
Debug.ShouldStop(262144);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 148;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
Debug.ShouldStop(524288);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("set")),(Object)(_key),(Object)(BA.ObjectToString("java.lang.String")),(Object)(_value),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpicturesize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetPictureSize (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("setpicturesize")) { return __ref.runUserSub(false, "cameraexclass","setpicturesize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 205;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8192);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 207;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
Debug.ShouldStop(16384);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("setPictureSize")),(Object)(BA.NumberToString(_width)),(Object)(BA.ObjectToString("java.lang.int")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpreviewfpsrange(RemoteObject __ref,RemoteObject _minvalue,RemoteObject _maxvalue) throws Exception{
try {
		Debug.PushSubsStack("SetPreviewFpsRange (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("setpreviewfpsrange")) { return __ref.runUserSub(false, "cameraexclass","setpreviewfpsrange", __ref, _minvalue, _maxvalue);}
Debug.locals.put("MinValue", _minvalue);
Debug.locals.put("MaxValue", _maxvalue);
 BA.debugLineNum = 247;BA.debugLine="Public Sub SetPreviewFpsRange(MinValue As Int, Max";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8388608);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 249;BA.debugLine="r.RunMethod4(\"setPreviewFpsRange\", Array As Objec";
Debug.ShouldStop(16777216);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setPreviewFpsRange")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_minvalue),(_maxvalue)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpreviewsize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetPreviewSize (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("setpreviewsize")) { return __ref.runUserSub(false, "cameraexclass","setpreviewsize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 187;BA.debugLine="Public Sub SetPreviewSize(Width As Int, Height As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="r.target = parameters";
Debug.ShouldStop(134217728);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 189;BA.debugLine="r.RunMethod3(\"setPreviewSize\", Width, \"java.lang.";
Debug.ShouldStop(268435456);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("setPreviewSize")),(Object)(BA.NumberToString(_width)),(Object)(BA.ObjectToString("java.lang.int")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzoom(RemoteObject __ref,RemoteObject _zoomvalue) throws Exception{
try {
		Debug.PushSubsStack("setZoom (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,377);
if (RapidSub.canDelegate("setzoom")) { return __ref.runUserSub(false, "cameraexclass","setzoom", __ref, _zoomvalue);}
Debug.locals.put("ZoomValue", _zoomvalue);
 BA.debugLineNum = 377;BA.debugLine="Public Sub setZoom(ZoomValue As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 378;BA.debugLine="r.target = parameters";
Debug.ShouldStop(33554432);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 379;BA.debugLine="r.RunMethod2(\"setZoom\", ZoomValue, \"java.lang.int";
Debug.ShouldStop(67108864);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setZoom")),(Object)(BA.NumberToString(_zoomvalue)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startfacedetection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartFaceDetection (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("startfacedetection")) { return __ref.runUserSub(false, "cameraexclass","startfacedetection", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 417;BA.debugLine="Public Sub StartFaceDetection";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="Dim jo As JavaObject = nativeCam";
Debug.ShouldStop(2);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_nativecam" /*RemoteObject*/ ));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 419;BA.debugLine="jo.RunMethod(\"startFaceDetection\", Null)";
Debug.ShouldStop(4);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startFaceDetection")),(Object)((cameraexclass.__c.getField(false,"Null"))));
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startpreview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartPreview (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("startpreview")) { return __ref.runUserSub(false, "cameraexclass","startpreview", __ref);}
 BA.debugLineNum = 127;BA.debugLine="Public Sub StartPreview";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="cam.StartPreview";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("StartPreview");
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopfacedetection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopFaceDetection (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,422);
if (RapidSub.canDelegate("stopfacedetection")) { return __ref.runUserSub(false, "cameraexclass","stopfacedetection", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 422;BA.debugLine="Public Sub StopFaceDetection";
Debug.ShouldStop(32);
 BA.debugLineNum = 423;BA.debugLine="Dim jo As JavaObject = nativeCam";
Debug.ShouldStop(64);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_nativecam" /*RemoteObject*/ ));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 424;BA.debugLine="jo.RunMethod(\"stopFaceDetection\", Null)";
Debug.ShouldStop(128);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("stopFaceDetection")),(Object)((cameraexclass.__c.getField(false,"Null"))));
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stoppreview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopPreview (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("stoppreview")) { return __ref.runUserSub(false, "cameraexclass","stoppreview", __ref);}
 BA.debugLineNum = 131;BA.debugLine="Public Sub StopPreview";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="cam.StopPreview";
Debug.ShouldStop(8);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("StopPreview");
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takepicture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TakePicture (cameraexclass) ","cameraexclass",28,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("takepicture")) { return __ref.runUserSub(false, "cameraexclass","takepicture", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Public Sub TakePicture";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 116;BA.debugLine="cam.TakePicture";
Debug.ShouldStop(524288);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("TakePicture");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e4.toString()); BA.debugLineNum = 118;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
cameraexclass.__c.runVoidMethod ("LogImpl","6126812164",BA.ObjectToString(cameraexclass.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}