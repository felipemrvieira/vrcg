package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cameraactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,41);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","activity_create", _firsttime);}
RemoteObject _dir = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(512);
if ((cameraactivity.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(1024);
cameraactivity._device.runVoidMethod ("SetScreenOrientation",cameraactivity.processBA,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 45;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(4096);
cameraactivity._device.runVoidMethod ("SetScreenOrientation",cameraactivity.processBA,(Object)(cameraactivity.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 };
 BA.debugLineNum = 47;BA.debugLine="Activity.LoadLayout(\"CameraWindow\")";
Debug.ShouldStop(16384);
cameraactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CameraWindow")),cameraactivity.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="CamShots.Initialize";
Debug.ShouldStop(32768);
cameraactivity._camshots.runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="Dim dir As String = Starter.InternalFolder  '.Saf";
Debug.ShouldStop(65536);
_dir = cameraactivity.mostCurrent._starter._internalfolder /*RemoteObject*/ ;Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 50;BA.debugLine="ShotFileLocation = dir";
Debug.ShouldStop(131072);
cameraactivity._shotfilelocation = _dir;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,80);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, cameraactivity.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 82;BA.debugLine="CloseActivity";
Debug.ShouldStop(131072);
_closeactivity();
 };
 BA.debugLineNum = 84;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return cameraactivity.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,74);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="If camEx.IsInitialized Then";
Debug.ShouldStop(1024);
if (cameraactivity.mostCurrent._camex.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="camEx.Release";
Debug.ShouldStop(2048);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_release" /*RemoteObject*/ );
 };
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,70);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","activity_resume");}
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
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
public static RemoteObject  _btneffect_click() throws Exception{
try {
		Debug.PushSubsStack("btnEffect_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,335);
if (RapidSub.canDelegate("btneffect_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","btneffect_click");}
RemoteObject _effects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _effect = RemoteObject.createImmutable("");
 BA.debugLineNum = 335;BA.debugLine="Sub btnEffect_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="Dim effects As List = camEx.GetSupportedColorEffe";
Debug.ShouldStop(32768);
_effects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_effects = cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedcoloreffects" /*RemoteObject*/ );Debug.locals.put("effects", _effects);Debug.locals.put("effects", _effects);
 BA.debugLineNum = 337;BA.debugLine="If effects.IsInitialized = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_effects.runMethod(true,"IsInitialized"),cameraactivity.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 338;BA.debugLine="ToastMessageShow(\"Efeitos não suportados.\", Fals";
Debug.ShouldStop(131072);
cameraactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Efeitos não suportados.")),(Object)(cameraactivity.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 339;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 341;BA.debugLine="Dim effect As String = effects.Get((effects.Index";
Debug.ShouldStop(1048576);
_effect = BA.ObjectToString(_effects.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_effects.runMethod(true,"IndexOf",(Object)((cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getcoloreffect" /*RemoteObject*/ )))),RemoteObject.createImmutable(1)}, "+",1, 1)),_effects.runMethod(true,"getSize")}, "%",0, 1))));Debug.locals.put("effect", _effect);Debug.locals.put("effect", _effect);
 BA.debugLineNum = 342;BA.debugLine="camEx.SetColorEffect(effect)";
Debug.ShouldStop(2097152);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setcoloreffect" /*RemoteObject*/ ,(Object)(_effect));
 BA.debugLineNum = 343;BA.debugLine="ToastMessageShow(effect, False)";
Debug.ShouldStop(4194304);
cameraactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_effect)),(Object)(cameraactivity.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 344;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(8388608);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnflash_click() throws Exception{
try {
		Debug.PushSubsStack("btnFlash_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,347);
if (RapidSub.canDelegate("btnflash_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","btnflash_click");}
RemoteObject _f = null;
RemoteObject _flashmodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flash = RemoteObject.createImmutable("");
 BA.debugLineNum = 347;BA.debugLine="Sub btnFlash_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 348;BA.debugLine="Dim f() As Float = camEx.GetFocusDistances";
Debug.ShouldStop(134217728);
_f = cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getfocusdistances" /*RemoteObject*/ );Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 349;BA.debugLine="Log(f(0) & \", \" & f(1) & \", \" & f(2))";
Debug.ShouldStop(268435456);
cameraactivity.mostCurrent.__c.runVoidMethod ("LogImpl","6121634818",RemoteObject.concat(_f.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(", "),_f.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(", "),_f.getArrayElement(true,BA.numberCast(int.class, 2))),0);
 BA.debugLineNum = 350;BA.debugLine="Dim flashModes As List = camEx.GetSupportedFlashM";
Debug.ShouldStop(536870912);
_flashmodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_flashmodes = cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedflashmodes" /*RemoteObject*/ );Debug.locals.put("flashModes", _flashmodes);Debug.locals.put("flashModes", _flashmodes);
 BA.debugLineNum = 351;BA.debugLine="If flashModes.IsInitialized = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_flashmodes.runMethod(true,"IsInitialized"),cameraactivity.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 352;BA.debugLine="ToastMessageShow(\"Flash não suportado.\", False)";
Debug.ShouldStop(-2147483648);
cameraactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Flash não suportado.")),(Object)(cameraactivity.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 353;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 355;BA.debugLine="Dim flash As String = flashModes.Get((flashModes.";
Debug.ShouldStop(4);
_flash = BA.ObjectToString(_flashmodes.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_flashmodes.runMethod(true,"IndexOf",(Object)((cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getflashmode" /*RemoteObject*/ )))),RemoteObject.createImmutable(1)}, "+",1, 1)),_flashmodes.runMethod(true,"getSize")}, "%",0, 1))));Debug.locals.put("flash", _flash);Debug.locals.put("flash", _flash);
 BA.debugLineNum = 356;BA.debugLine="camEx.SetFlashMode(flash)";
Debug.ShouldStop(8);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setflashmode" /*RemoteObject*/ ,(Object)(_flash));
 BA.debugLineNum = 357;BA.debugLine="ToastMessageShow(flash, False)";
Debug.ShouldStop(16);
cameraactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_flash)),(Object)(cameraactivity.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 358;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(32);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnfocus_click() throws Exception{
try {
		Debug.PushSubsStack("btnFocus_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,145);
if (RapidSub.canDelegate("btnfocus_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","btnfocus_click");}
 BA.debugLineNum = 145;BA.debugLine="Sub btnFocus_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="camEx.FocusAndTakePicture";
Debug.ShouldStop(131072);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_focusandtakepicture" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpicturesize_click() throws Exception{
try {
		Debug.PushSubsStack("btnPictureSize_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,361);
if (RapidSub.canDelegate("btnpicturesize_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","btnpicturesize_click");}
RemoteObject _picturesizes = null;
RemoteObject _current = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
int _i = 0;
RemoteObject _ps = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
 BA.debugLineNum = 361;BA.debugLine="Sub btnPictureSize_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 362;BA.debugLine="Dim pictureSizes() As CameraSize = camEx.GetSuppo";
Debug.ShouldStop(512);
_picturesizes = cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedpicturessizes" /*RemoteObject*/ );Debug.locals.put("pictureSizes", _picturesizes);Debug.locals.put("pictureSizes", _picturesizes);
 BA.debugLineNum = 363;BA.debugLine="Dim current As CameraSize = camEx.GetPictureSize";
Debug.ShouldStop(1024);
_current = cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getpicturesize" /*RemoteObject*/ );Debug.locals.put("current", _current);Debug.locals.put("current", _current);
 BA.debugLineNum = 364;BA.debugLine="For i = 0 To pictureSizes.Length - 1";
Debug.ShouldStop(2048);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_picturesizes.getField(true,"length" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 365;BA.debugLine="If pictureSizes(i).Width = current.Width And pic";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_picturesizes.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(double.class, _current.getField(true,"Width" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",_picturesizes.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).getField(true,"Height" /*RemoteObject*/ ),BA.numberCast(double.class, _current.getField(true,"Height" /*RemoteObject*/ )))) { 
if (true) break;};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 367;BA.debugLine="Dim ps As CameraSize = pictureSizes((i + 1) Mod p";
Debug.ShouldStop(16384);
_ps = _picturesizes.getArrayElement(false, /*RemoteObject*/ RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),_picturesizes.getField(true,"length" /*RemoteObject*/ )}, "%",0, 1));Debug.locals.put("ps", _ps);Debug.locals.put("ps", _ps);
 BA.debugLineNum = 368;BA.debugLine="camEx.SetPictureSize(ps.Width, ps.Height)";
Debug.ShouldStop(32768);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setpicturesize" /*RemoteObject*/ ,(Object)(_ps.getField(true,"Width" /*RemoteObject*/ )),(Object)(_ps.getField(true,"Height" /*RemoteObject*/ )));
 BA.debugLineNum = 369;BA.debugLine="ToastMessageShow(ps.Width & \"x\" & ps.Height, Fals";
Debug.ShouldStop(65536);
cameraactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_ps.getField(true,"Width" /*RemoteObject*/ ),RemoteObject.createImmutable("x"),_ps.getField(true,"Height" /*RemoteObject*/ )))),(Object)(cameraactivity.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 370;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(131072);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntakepicture_click() throws Exception{
try {
		Debug.PushSubsStack("btnTakePicture_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,136);
if (RapidSub.canDelegate("btntakepicture_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","btntakepicture_click");}
 BA.debugLineNum = 136;BA.debugLine="Sub btnTakePicture_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 138;BA.debugLine="camEx.TakePicture";
Debug.ShouldStop(512);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_takepicture" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity.processBA, e4.toString()); BA.debugLineNum = 140;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
cameraactivity.mostCurrent.__c.runVoidMethod ("LogImpl","6120848388",BA.ObjectToString(cameraactivity.mostCurrent.__c.runMethod(false,"LastException",cameraactivity.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcancelpicture_click() throws Exception{
try {
		Debug.PushSubsStack("butCancelPicture_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,575);
if (RapidSub.canDelegate("butcancelpicture_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","butcancelpicture_click");}
 BA.debugLineNum = 575;BA.debugLine="Sub butCancelPicture_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 576;BA.debugLine="showPictureImage.SetBackgroundImage(Null)";
Debug.ShouldStop(-2147483648);
cameraactivity.mostCurrent._showpictureimage.runVoidMethod ("SetBackgroundImageNew",(Object)((cameraactivity.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 577;BA.debugLine="showPicturePanel.Visible = False";
Debug.ShouldStop(1);
cameraactivity.mostCurrent._showpicturepanel.runMethod(true,"setVisible",cameraactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 578;BA.debugLine="butCloseCamera.Enabled = Not(showPicturePanel.Vis";
Debug.ShouldStop(2);
cameraactivity.mostCurrent._butclosecamera.runMethod(true,"setEnabled",cameraactivity.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity.mostCurrent._showpicturepanel.runMethod(true,"getVisible"))));
 BA.debugLineNum = 579;BA.debugLine="btnTakePicture.Enabled = Not(showPicturePanel.Vis";
Debug.ShouldStop(4);
cameraactivity.mostCurrent._btntakepicture.runMethod(true,"setEnabled",cameraactivity.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity.mostCurrent._showpicturepanel.runMethod(true,"getVisible"))));
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butclosecamera_click() throws Exception{
try {
		Debug.PushSubsStack("butCloseCamera_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,582);
if (RapidSub.canDelegate("butclosecamera_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","butclosecamera_click");}
RemoteObject _docontinue = RemoteObject.createImmutable(false);
 BA.debugLineNum = 582;BA.debugLine="Sub butCloseCamera_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 583;BA.debugLine="Dim DoContinue As Boolean = True";
Debug.ShouldStop(64);
_docontinue = cameraactivity.mostCurrent.__c.getField(true,"True");Debug.locals.put("DoContinue", _docontinue);Debug.locals.put("DoContinue", _docontinue);
 BA.debugLineNum = 584;BA.debugLine="If (ExitToDialog) Then";
Debug.ShouldStop(128);
if ((cameraactivity._exittodialog).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 589;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("i",cameraactivity._returnto, RemoteObject.createImmutable("xevolution.vrcg.devdemov2400.appactiondialogs")))) { 
 BA.debugLineNum = 590;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("=",cameraactivity.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 591;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
Debug.ShouldStop(16384);
cameraactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity.processBA,(Object)((cameraactivity.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((cameraactivity.mostCurrent._currentclaitem)));
 }else 
{ BA.debugLineNum = 592;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",cameraactivity.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 593;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage\", Curren";
Debug.ShouldStop(65536);
cameraactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity.processBA,(Object)((cameraactivity.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((cameraactivity.mostCurrent._currentclaitem)));
 }}
;
 };
 }else {
 BA.debugLineNum = 597;BA.debugLine="CallSubDelayed(MainMenu, \"ListsReturnNoAction\")";
Debug.ShouldStop(1048576);
cameraactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed",cameraactivity.processBA,(Object)((cameraactivity.mostCurrent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("ListsReturnNoAction")));
 };
 BA.debugLineNum = 599;BA.debugLine="If DoContinue Then Activity.Finish";
Debug.ShouldStop(4194304);
if (_docontinue.<Boolean>get().booleanValue()) { 
cameraactivity.mostCurrent._activity.runVoidMethod ("Finish");};
 BA.debugLineNum = 600;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butsavepicture_click() throws Exception{
try {
		Debug.PushSubsStack("butSavePicture_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,478);
if (RapidSub.canDelegate("butsavepicture_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","butsavepicture_click");}
RemoteObject _docontinue = RemoteObject.createImmutable(false);
RemoteObject _ma = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
RemoteObject _apilist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _alerttagcode = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 478;BA.debugLine="Sub butSavePicture_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 479;BA.debugLine="Dim DoContinue As Boolean = True";
Debug.ShouldStop(1073741824);
_docontinue = cameraactivity.mostCurrent.__c.getField(true,"True");Debug.locals.put("DoContinue", _docontinue);Debug.locals.put("DoContinue", _docontinue);
 BA.debugLineNum = 480;BA.debugLine="If (ExitToDialog) Then";
Debug.ShouldStop(-2147483648);
if ((cameraactivity._exittodialog).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 485;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("i",cameraactivity._returnto, RemoteObject.createImmutable("xevolution.vrcg.devdemov2400.appactiondialogs")))) { 
 BA.debugLineNum = 486;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 487;BA.debugLine="Dim ma As AppActionDialogs = ReturnTo";
Debug.ShouldStop(64);
_ma = (cameraactivity._returnto);Debug.locals.put("ma", _ma);Debug.locals.put("ma", _ma);
 BA.debugLineNum = 488;BA.debugLine="ma.CameraReturn(CurrentFileName, CurrentCLAIte";
Debug.ShouldStop(128);
_ma.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_camerareturn" /*void*/ ,(Object)(cameraactivity.mostCurrent._currentfilename),(Object)(cameraactivity.mostCurrent._currentclaitem));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity.processBA, e8.toString()); BA.debugLineNum = 490;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
cameraactivity.mostCurrent.__c.runVoidMethod ("LogImpl","6122093580",BA.ObjectToString(cameraactivity.mostCurrent.__c.runMethod(false,"LastException",cameraactivity.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 492;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",cameraactivity.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 493;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
Debug.ShouldStop(4096);
cameraactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity.processBA,(Object)((cameraactivity.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((cameraactivity.mostCurrent._currentclaitem)));
 }else 
{ BA.debugLineNum = 494;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("=",cameraactivity.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 495;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage\", Curren";
Debug.ShouldStop(16384);
cameraactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity.processBA,(Object)((cameraactivity.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((cameraactivity.mostCurrent._currentclaitem)));
 }}
;
 };
 }else {
 BA.debugLineNum = 499;BA.debugLine="Dim this As RequestCLAItem = CurrentCLAItem";
Debug.ShouldStop(262144);
_this = cameraactivity.mostCurrent._currentclaitem;Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 500;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(524288);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 501;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(1048576);
_base64con.runVoidMethod ("_initialize",cameraactivity.processBA);
 BA.debugLineNum = 502;BA.debugLine="If (ShotFileLocation = File.DirAssets) Then Shot";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",cameraactivity._shotfilelocation,cameraactivity.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")))) { 
cameraactivity._shotfilelocation = cameraactivity.mostCurrent._starter._internalfolder /*RemoteObject*/ ;};
 BA.debugLineNum = 503;BA.debugLine="Dim ApiList As List";
Debug.ShouldStop(4194304);
_apilist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ApiList", _apilist);
 BA.debugLineNum = 504;BA.debugLine="ApiList.Initialize";
Debug.ShouldStop(8388608);
_apilist.runVoidMethod ("Initialize");
 BA.debugLineNum = 506;BA.debugLine="For i=0 To CamShots.Size-1";
Debug.ShouldStop(33554432);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {cameraactivity._camshots.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 507;BA.debugLine="Dim theFile As String = CamShots.Get(i)";
Debug.ShouldStop(67108864);
_thefile = BA.ObjectToString(cameraactivity._camshots.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 508;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImag";
Debug.ShouldStop(134217728);
_imgb64 = _base64con.runMethod(true,"_v6",(Object)(cameraactivity.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thefile))),RemoteObject.createImmutable("")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 518;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_";
Debug.ShouldStop(32);
_mid = RemoteObject.solve(new RemoteObject[] {cameraactivity.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_alerts")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 519;BA.debugLine="Dim alerttagcode As String = $\"${Utils.Generate";
Debug.ShouldStop(64);
_alerttagcode = (RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ALERTINF_")))))),RemoteObject.createImmutable("")));Debug.locals.put("alerttagcode", _alerttagcode);Debug.locals.put("alerttagcode", _alerttagcode);
 BA.debugLineNum = 520;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"),RemoteObject.createImmutable("			origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"),RemoteObject.createImmutable("			values ("),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', 1, 1, 'Imagens adicionadas ao repositório por utilizar.', \n"),RemoteObject.createImmutable("			'"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("', '"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA)))),RemoteObject.createImmutable("', '', 1, 1, 0, 0)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 524;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL,";
Debug.ShouldStop(2048);
cameraactivity.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("butSavePicture_Click")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 528;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_";
Debug.ShouldStop(32768);
_mid = RemoteObject.solve(new RemoteObject[] {cameraactivity.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_alerts_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 529;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts_i";
Debug.ShouldStop(65536);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts_images\n"),RemoteObject.createImmutable("				(id, tagcode, imageb64, imagename, assigned)\n"),RemoteObject.createImmutable("				values ("),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thefile))),RemoteObject.createImmutable("', 0)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 533;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL,";
Debug.ShouldStop(1048576);
cameraactivity.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("butSavePicture_Click")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 536;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8388608);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 537;BA.debugLine="params.Initialize";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 538;BA.debugLine="params.Clear";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 539;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((cameraactivity.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 540;BA.debugLine="params.Put(\"tagcode\", alerttagcode)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_alerttagcode)));
 BA.debugLineNum = 541;BA.debugLine="params.Put(\"relation_type\", \"ALRTREL_TASKS\")";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_type"))),(Object)((RemoteObject.createImmutable("ALRTREL_TASKS"))));
 BA.debugLineNum = 542;BA.debugLine="params.Put(\"alert_type\", \"ALRTTYP_TASKS\")";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alert_type"))),(Object)((RemoteObject.createImmutable("ALRTTYP_TASKS"))));
 BA.debugLineNum = 543;BA.debugLine="params.Put(\"internal\", 1)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("internal"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 544;BA.debugLine="params.Put(\"origin\", 1)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 545;BA.debugLine="params.Put(\"title\", \"Imagens adicionadas ao rep";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("Imagens adicionadas ao repositório por utilizar."))));
 BA.debugLineNum = 546;BA.debugLine="params.Put(\"user_tagcode\", ShareCode.SESS_User)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user_tagcode"))),(Object)((cameraactivity.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 547;BA.debugLine="params.Put(\"date_alert\", Utils.GetCurrentDate)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_alert"))),(Object)((cameraactivity.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA))));
 BA.debugLineNum = 548;BA.debugLine="params.Put(\"date_verification\", \"\")";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_verification"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 549;BA.debugLine="params.Put(\"alert_visible\", 1)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alert_visible"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 550;BA.debugLine="params.Put(\"imageb64\", ImgB64)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imageb64"))),(Object)((_imgb64)));
 BA.debugLineNum = 551;BA.debugLine="params.Put(\"imagename\", theFile)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imagename"))),(Object)((_thefile)));
 BA.debugLineNum = 552;BA.debugLine="params.Put(\"status_id\", 0)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 553;BA.debugLine="params.Put(\"kind_data\", 0)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("kind_data"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 554;BA.debugLine="params.Put(\"request_tagcode\", this.Request)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 555;BA.debugLine="params.Put(\"action_tagcode\", this.Action)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action_tagcode"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 556;BA.debugLine="params.Put(\"task_tagcode\", this.Task)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("task_tagcode"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 557;BA.debugLine="params.Put(\"item_tagcode\", this.Item)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item_tagcode"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 558;BA.debugLine="params.Put(\"uniquekey\", this.UniqueKey)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("uniquekey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 559;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((cameraactivity.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 560;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((cameraactivity.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 561;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((cameraactivity.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 562;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((cameraactivity.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 563;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((cameraactivity.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 564;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((cameraactivity.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 565;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((cameraactivity.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 566;BA.debugLine="ApiList.Add(params)";
Debug.ShouldStop(2097152);
_apilist.runVoidMethod ("Add",(Object)((_params.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 569;BA.debugLine="CallSubDelayed3(MainMenu, \"ListsReturnUpdateServ";
Debug.ShouldStop(16777216);
cameraactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",cameraactivity.processBA,(Object)((cameraactivity.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturnUpdateServer")),(Object)(((RemoteObject.concat(RemoteObject.createImmutable("https://"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/alert/new"))))),(Object)((_apilist)));
 };
 BA.debugLineNum = 572;BA.debugLine="If DoContinue Then Activity.Finish";
Debug.ShouldStop(134217728);
if (_docontinue.<Boolean>get().booleanValue()) { 
cameraactivity.mostCurrent._activity.runVoidMethod ("Finish");};
 BA.debugLineNum = 573;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bytestoimage(RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("BytesToImage (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,173);
if (RapidSub.canDelegate("bytestoimage")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","bytestoimage", _bytes);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 173;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As B4XBit";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(8192);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 175;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
Debug.ShouldStop(16384);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 177;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(65536);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 178;BA.debugLine="bmp.Initialize2(In)";
Debug.ShouldStop(131072);
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 183;BA.debugLine="Return bmp";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bmp.getObject());
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _camimage(RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("CamImage (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,393);
if (RapidSub.canDelegate("camimage")) { xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","camimage", _claitem); return;}
ResumableSub_CamImage rsub = new ResumableSub_CamImage(null,_claitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CamImage extends BA.ResumableSub {
public ResumableSub_CamImage(xevolution.vrcg.devdemov2400.cameraactivity parent,RemoteObject _claitem) {
this.parent = parent;
this._claitem = _claitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.cameraactivity parent;
RemoteObject _claitem;
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CamImage (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,393);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 394;BA.debugLine="If CLAItem.Origin = 4 Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_claitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 4))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 395;BA.debugLine="CurrentCLAItem.Origin = LastOrigin";
Debug.ShouldStop(1024);
parent.mostCurrent._currentclaitem.setField ("Origin" /*RemoteObject*/ ,parent._lastorigin);
 BA.debugLineNum = 396;BA.debugLine="If (ExitToDialog) Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 27;
if ((parent._exittodialog).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 397;BA.debugLine="If (CurrentCLAItem.Origin = 1) Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 26;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 399;BA.debugLine="else If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 401;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 3)))) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 26;
 BA.debugLineNum = 398;BA.debugLine="CallSubDelayed2(User, \"CallMOREActionsAgain\",";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity.processBA,(Object)((parent.mostCurrent._user.getObject())),(Object)(BA.ObjectToString("CallMOREActionsAgain")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 11:
//C
this.state = 26;
 BA.debugLineNum = 400;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity.processBA,(Object)((parent.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 403;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(262144);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 404;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(524288);
_base64con.runVoidMethod ("_initialize",cameraactivity.processBA);
 BA.debugLineNum = 405;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
Debug.ShouldStop(1048576);
_imgb64 = _base64con.runMethod(true,"_v6",(Object)(parent._shotfilelocation),(Object)(parent.mostCurrent._currentfilename));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 412;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(134217728);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 413;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
Debug.ShouldStop(268435456);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images \n"),RemoteObject.createImmutable("					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report, \n"),RemoteObject.createImmutable("						repeatcounter, repeatitemcounter, repeatfieldcounter)\n"),RemoteObject.createImmutable("					values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("					'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._currentfilename))),RemoteObject.createImmutable("', 1, \n"),RemoteObject.createImmutable("					"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(")")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 419;BA.debugLine="Utils.SaveSQLToLog(\"CamImage\",sSQL, CLAItem.Re";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("CamImage")),(Object)(_ssql),(Object)(_claitem.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 423;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDat";
Debug.ShouldStop(64);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 424;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
Debug.ShouldStop(128);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 425;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
Debug.ShouldStop(256);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 427;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1024);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 428;BA.debugLine="params.Initialize";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 429;BA.debugLine="params.Clear";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 430;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 431;BA.debugLine="params.Put(\"ACLARequest\", CLAItem.Request)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_claitem.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 432;BA.debugLine="params.Put(\"ACLAAction\", CLAItem.Action)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_claitem.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 433;BA.debugLine="params.Put(\"ACLATask\", CLAItem.Task)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_claitem.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 434;BA.debugLine="params.Put(\"ACLAItem\", CLAItem.Item)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_claitem.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 435;BA.debugLine="params.Put(\"ACLAUniqueKey\", CLAItem.UniqueKey)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_claitem.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 436;BA.debugLine="params.Put(\"ACLATagcode\", CLAItem.Tagcode)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_claitem.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 437;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 438;BA.debugLine="params.Put(\"ACLAValueFileImage\", CurrentFileNa";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((parent.mostCurrent._currentfilename)));
 BA.debugLineNum = 439;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAOnReport"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 440;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 441;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 442;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 443;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 444;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 445;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 446;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 447;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 448;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 14:
//try
this.state = 19;
this.catchState = 18;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 19;
this.catchState = 18;
 BA.debugLineNum = 449;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 450;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
 BA.debugLineNum = 452;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 453;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 454;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6121962557",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",cameraactivity.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
;
 BA.debugLineNum = 458;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(512);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 459;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(1024);
if (true) break;

case 20:
//if
this.state = 25;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 460;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLAItem";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(cameraactivity.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_claitem.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 462;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(8192);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 463;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 465;BA.debugLine="Sleep(250)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity", "camimage"),BA.numberCast(int.class, 250));
this.state = 29;
return;
case 29:
//C
this.state = 26;
;
 BA.debugLineNum = 467;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage\", Curren";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 469;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 472;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity.processBA, e0.toString());}
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
public static RemoteObject  _campanel_picturetaken(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("camPanel_PictureTaken (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,187);
if (RapidSub.canDelegate("campanel_picturetaken")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","campanel_picturetaken", _data);}
RemoteObject _datename = RemoteObject.createImmutable("");
RemoteObject _datetimename = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _cmes = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _cvsrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _la = RemoteObject.createImmutable("");
RemoteObject _lo = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _stamp = RemoteObject.createImmutable("");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _drect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _bc1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 187;BA.debugLine="Sub camPanel_PictureTaken (Data() As Byte)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="Dim DateName As String = Utils.MakeFileName";
Debug.ShouldStop(134217728);
_datename = cameraactivity.mostCurrent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA);Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 189;BA.debugLine="Dim DateTimeName As String = Utils.MakeDateTimeSl";
Debug.ShouldStop(268435456);
_datetimename = cameraactivity.mostCurrent._utils.runMethod(true,"_makedatetimeslash2" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA);Debug.locals.put("DateTimeName", _datetimename);Debug.locals.put("DateTimeName", _datetimename);
 BA.debugLineNum = 191;BA.debugLine="CurrentFileName = $\"IMG-${DateName}-${Counter}\"$";
Debug.ShouldStop(1073741824);
cameraactivity.mostCurrent._currentfilename = (RemoteObject.concat(RemoteObject.createImmutable("IMG-"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datename))),RemoteObject.createImmutable("-"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity._counter))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 192;BA.debugLine="Dim filename As String = $\"${CurrentFileName}.png";
Debug.ShouldStop(-2147483648);
_filename = (RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._currentfilename))),RemoteObject.createImmutable(".png")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 193;BA.debugLine="If LastFileName = \"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",cameraactivity._lastfilename,BA.ObjectToString(""))) { 
 BA.debugLineNum = 194;BA.debugLine="LastFileName = filename";
Debug.ShouldStop(2);
cameraactivity._lastfilename = _filename;
 };
 BA.debugLineNum = 197;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
Debug.ShouldStop(16);
cameraactivity._shotfilelocation = cameraactivity.mostCurrent._starter._internalfolder /*RemoteObject*/ ;
 BA.debugLineNum = 199;BA.debugLine="If Starter.Params.CFG_TAKE_PICTURE_ALWAYS_AS_NEW";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",cameraactivity.mostCurrent._starter._params /*RemoteObject*/ .getField(true,"_cfg_take_picture_always_as_new" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 200;BA.debugLine="filename = LastFileName";
Debug.ShouldStop(128);
_filename = cameraactivity._lastfilename;Debug.locals.put("filename", _filename);
 };
 BA.debugLineNum = 205;BA.debugLine="ShotFileName = filename";
Debug.ShouldStop(4096);
cameraactivity._shotfilename = _filename;
 BA.debugLineNum = 206;BA.debugLine="Dim cmes As CameraSize = camEx.GetPictureSize";
Debug.ShouldStop(8192);
_cmes = cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getpicturesize" /*RemoteObject*/ );Debug.locals.put("cmes", _cmes);Debug.locals.put("cmes", _cmes);
 BA.debugLineNum = 207;BA.debugLine="camEx.SavePictureToFile(Data, ShotFileLocation, S";
Debug.ShouldStop(16384);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_savepicturetofile" /*RemoteObject*/ ,(Object)(_data),(Object)(cameraactivity._shotfilelocation),(Object)(cameraactivity._shotfilename));
 BA.debugLineNum = 212;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultFont(ShareC";
Debug.ShouldStop(524288);
_fnt = cameraactivity._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, cameraactivity.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 213;BA.debugLine="Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, c";
Debug.ShouldStop(1048576);
_cvs = _createcanvas(_cmes.getField(true,"Width" /*RemoteObject*/ ),_cmes.getField(true,"Height" /*RemoteObject*/ ));Debug.locals.put("cvs", _cvs);Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 215;BA.debugLine="Dim cvsRect As B4XRect";
Debug.ShouldStop(4194304);
_cvsrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("cvsRect", _cvsrect);
 BA.debugLineNum = 216;BA.debugLine="cvsRect.Initialize(0,0,cmes.Width, cmes.Height)";
Debug.ShouldStop(8388608);
_cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _cmes.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _cmes.getField(true,"Height" /*RemoteObject*/ ))));
 BA.debugLineNum = 217;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, S";
Debug.ShouldStop(16777216);
_cvs.runVoidMethod ("DrawBitmap",(Object)((cameraactivity._xui.runMethod(false,"LoadBitmap",(Object)(cameraactivity._shotfilelocation),(Object)(cameraactivity._shotfilename)).getObject())),(Object)(_cvsrect));
 BA.debugLineNum = 218;BA.debugLine="Dim la As String = LocationService.GeoLocal.lat";
Debug.ShouldStop(33554432);
_la = cameraactivity.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ );Debug.locals.put("la", _la);Debug.locals.put("la", _la);
 BA.debugLineNum = 219;BA.debugLine="Dim lo As String = LocationService.GeoLocal.lon";
Debug.ShouldStop(67108864);
_lo = cameraactivity.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ );Debug.locals.put("lo", _lo);Debug.locals.put("lo", _lo);
 BA.debugLineNum = 220;BA.debugLine="DateTimeName = $\"${DateTimeName}  -  ${la}/${lo}\"";
Debug.ShouldStop(134217728);
_datetimename = (RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datetimename))),RemoteObject.createImmutable("  -  "),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_la))),RemoteObject.createImmutable("/"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lo))),RemoteObject.createImmutable("")));Debug.locals.put("DateTimeName", _datetimename);
 BA.debugLineNum = 221;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"printcri";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",cameraactivity.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("printcriativa")))) { 
 BA.debugLineNum = 222;BA.debugLine="Dim sSQL As String = $\"select ' - '||c.title_imp";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select ' - '||c.title_import||' - '||d.title_import as stampname\n"),RemoteObject.createImmutable("								from dta_requests as a\n"),RemoteObject.createImmutable("								LEFT JOIN dta_objects AS c ON (c.tagcode=a.entity_tagcode)\n"),RemoteObject.createImmutable("								LEFT JOIN dta_objects AS d ON (d.tagcode=a.object_tagcode)\n"),RemoteObject.createImmutable("								where a.tagcode='"),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._currentclaitem.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 227;BA.debugLine="Dim stamp As String = DBStructures.GetScriptColu";
Debug.ShouldStop(4);
_stamp = cameraactivity.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(_ssql),(Object)(RemoteObject.createImmutable("stampname")));Debug.locals.put("stamp", _stamp);Debug.locals.put("stamp", _stamp);
 BA.debugLineNum = 228;BA.debugLine="DateTimeName = $\"${stamp}\"$";
Debug.ShouldStop(8);
_datetimename = (RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stamp))),RemoteObject.createImmutable("")));Debug.locals.put("DateTimeName", _datetimename);
 };
 BA.debugLineNum = 232;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCod";
Debug.ShouldStop(128);
_f = cameraactivity._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, cameraactivity.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 233;BA.debugLine="Dim dRect As B4XRect";
Debug.ShouldStop(256);
_drect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("dRect", _drect);
 BA.debugLineNum = 234;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.T";
Debug.ShouldStop(512);
_drect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),cameraactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight"),cameraactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),cameraactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350)))}, "+",1, 0))),(Object)(_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight")));
 BA.debugLineNum = 235;BA.debugLine="DrawTextWithBorder2(cvs, DateTimeName, f, Consts.";
Debug.ShouldStop(1024);
_drawtextwithborder2(_cvs,_datetimename,_f,cameraactivity.mostCurrent._consts._colordarkgray /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getLeft"),_drect.runMethod(true,"getRight")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getTop"),_drect.runMethod(true,"getBottom")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 237;BA.debugLine="Log($\"${ShareCode.DEVICE_DEF_QUALITY}, ${ShareCod";
Debug.ShouldStop(4096);
cameraactivity.mostCurrent.__c.runVoidMethod ("LogImpl","6121241650",(RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ))),RemoteObject.createImmutable(", "),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 239;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(16384);
_cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 242;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(ShotFil";
Debug.ShouldStop(131072);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = cameraactivity.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(cameraactivity._shotfilelocation),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity._shotfilename))),RemoteObject.createImmutable("")))),(Object)(cameraactivity.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Out", _out);Debug.locals.put("Out", _out);
 BA.debugLineNum = 243;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
Debug.ShouldStop(262144);
_cvs.runMethod(false,"CreateBitmap").runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(cameraactivity.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),cameraactivity.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 244;BA.debugLine="cvs.Release";
Debug.ShouldStop(524288);
_cvs.runVoidMethod ("Release");
 BA.debugLineNum = 245;BA.debugLine="Out.Close";
Debug.ShouldStop(1048576);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 248;BA.debugLine="Dim bc1 As B4XBitmap =  xui.LoadBitmapResize(Shot";
Debug.ShouldStop(8388608);
_bc1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bc1 = cameraactivity._xui.runMethod(false,"LoadBitmapResize",(Object)(cameraactivity._shotfilelocation),(Object)(cameraactivity._shotfilename),(Object)(cameraactivity.mostCurrent._showpictureimage.runMethod(true,"getWidth")),(Object)(cameraactivity.mostCurrent._showpictureimage.runMethod(true,"getHeight")),(Object)(cameraactivity.mostCurrent.__c.getField(true,"True")));Debug.locals.put("bc1", _bc1);Debug.locals.put("bc1", _bc1);
 BA.debugLineNum = 249;BA.debugLine="showPictureImage.SetBackgroundImage(bc1)";
Debug.ShouldStop(16777216);
cameraactivity.mostCurrent._showpictureimage.runVoidMethod ("SetBackgroundImageNew",(Object)((_bc1.getObject())));
 BA.debugLineNum = 250;BA.debugLine="showPicturePanel.Visible = True";
Debug.ShouldStop(33554432);
cameraactivity.mostCurrent._showpicturepanel.runMethod(true,"setVisible",cameraactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 251;BA.debugLine="butCloseCamera.Enabled = Not(showPicturePanel.Vis";
Debug.ShouldStop(67108864);
cameraactivity.mostCurrent._butclosecamera.runMethod(true,"setEnabled",cameraactivity.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity.mostCurrent._showpicturepanel.runMethod(true,"getVisible"))));
 BA.debugLineNum = 252;BA.debugLine="btnTakePicture.Enabled = Not(showPicturePanel.Vis";
Debug.ShouldStop(134217728);
cameraactivity.mostCurrent._btntakepicture.runMethod(true,"setEnabled",cameraactivity.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity.mostCurrent._showpicturepanel.runMethod(true,"getVisible"))));
 BA.debugLineNum = 255;BA.debugLine="CamShots.Add(ShotFileName)";
Debug.ShouldStop(1073741824);
cameraactivity._camshots.runVoidMethod ("Add",(Object)((cameraactivity._shotfilename)));
 BA.debugLineNum = 257;BA.debugLine="If StayOnCamera Then";
Debug.ShouldStop(1);
if (cameraactivity._stayoncamera.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 258;BA.debugLine="camEx.StartPreview 'restart preview";
Debug.ShouldStop(2);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 BA.debugLineNum = 259;BA.debugLine="Counter = Counter + 1";
Debug.ShouldStop(4);
cameraactivity._counter = RemoteObject.solve(new RemoteObject[] {cameraactivity._counter,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 };
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _campanel_ready(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("camPanel_Ready (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,108);
if (RapidSub.canDelegate("campanel_ready")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","campanel_ready", _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 108;BA.debugLine="Sub camPanel_Ready (Success As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="If Success Then";
Debug.ShouldStop(4096);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 110;BA.debugLine="camEx.SetJpegQuality(ShareCode.DEVICE_DEF_QUALIT";
Debug.ShouldStop(8192);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setjpegquality" /*RemoteObject*/ ,(Object)(cameraactivity.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ));
 BA.debugLineNum = 112;BA.debugLine="camEx.SetPictureSize(ShareCode.DEVICE_DEF_IMG_WI";
Debug.ShouldStop(32768);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setpicturesize" /*RemoteObject*/ ,(Object)(cameraactivity.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ),(Object)(cameraactivity.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ));
 BA.debugLineNum = 113;BA.debugLine="camEx.SetContinuousAutoFocus";
Debug.ShouldStop(65536);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setcontinuousautofocus" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(131072);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 115;BA.debugLine="camEx.StartPreview";
Debug.ShouldStop(262144);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 117;BA.debugLine="ToastMessageShow(\"Não é possível abrir a camera.";
Debug.ShouldStop(1048576);
cameraactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Não é possível abrir a camera.")),(Object)(cameraactivity.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camzoom_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("camZoom_ValueChanged (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,373);
if (RapidSub.canDelegate("camzoom_valuechanged")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","camzoom_valuechanged", _value, _userchanged);}
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 373;BA.debugLine="Sub camZoom_ValueChanged (Value As Int, UserChange";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 374;BA.debugLine="If UserChanged = False Or camEx.IsZoomSupported =";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_userchanged,cameraactivity.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_iszoomsupported" /*RemoteObject*/ ),cameraactivity.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 375;BA.debugLine="camEx.Zoom = Value / 100 * camEx.GetMaxZoom";
Debug.ShouldStop(4194304);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setzoom" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100),cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getmaxzoom" /*RemoteObject*/ )}, "/*",0, 0)));
 BA.debugLineNum = 376;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(8388608);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changecamera_click() throws Exception{
try {
		Debug.PushSubsStack("ChangeCamera_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,325);
if (RapidSub.canDelegate("changecamera_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","changecamera_click");}
 BA.debugLineNum = 325;BA.debugLine="Sub ChangeCamera_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="If Starter.Params.CFG_ALLOW_FRONT_CAMERA = 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",cameraactivity.mostCurrent._starter._params /*RemoteObject*/ .getField(true,"_cfg_allow_front_camera" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 327;BA.debugLine="camEx.Release";
Debug.ShouldStop(64);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 328;BA.debugLine="frontCamera = Not(frontCamera)";
Debug.ShouldStop(128);
cameraactivity._frontcamera = cameraactivity.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity._frontcamera));
 BA.debugLineNum = 329;BA.debugLine="InitializeCamera";
Debug.ShouldStop(256);
_initializecamera();
 }else {
 BA.debugLineNum = 331;BA.debugLine="ToastMessageShow(\"Apenas a camera traseira está";
Debug.ShouldStop(1024);
cameraactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Apenas a camera traseira está activa.")),(Object)(cameraactivity.mostCurrent.__c.getField(true,"True")));
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
public static RemoteObject  _closeactivity() throws Exception{
try {
		Debug.PushSubsStack("CloseActivity (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,389);
if (RapidSub.canDelegate("closeactivity")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","closeactivity");}
 BA.debugLineNum = 389;BA.debugLine="Public Sub CloseActivity";
Debug.ShouldStop(16);
 BA.debugLineNum = 390;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
cameraactivity.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcanvas(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateCanvas (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,157);
if (RapidSub.canDelegate("createcanvas")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","createcanvas", _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 157;BA.debugLine="Private Sub CreateCanvas(width As Int, height As I";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = cameraactivity._xui.runMethod(false,"CreatePanel",cameraactivity.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 159;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, height)";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 160;BA.debugLine="Dim cvs As B4XCanvas";
Debug.ShouldStop(-2147483648);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 161;BA.debugLine="cvs.Initialize(p)";
Debug.ShouldStop(1);
_cvs.runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 162;BA.debugLine="Return cvs";
Debug.ShouldStop(2);
if (true) return _cvs;
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfileprovideruri(RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CreateFileProviderUri (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,379);
if (RapidSub.canDelegate("createfileprovideruri")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","createfileprovideruri", _dir, _filename);}
RemoteObject _fileprovider1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 379;BA.debugLine="Sub CreateFileProviderUri (Dir As String, FileName";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="Dim FileProvider1 As JavaObject";
Debug.ShouldStop(134217728);
_fileprovider1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("FileProvider1", _fileprovider1);
 BA.debugLineNum = 381;BA.debugLine="Dim context As JavaObject";
Debug.ShouldStop(268435456);
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 382;BA.debugLine="context.InitializeContext";
Debug.ShouldStop(536870912);
_context.runVoidMethod ("InitializeContext",cameraactivity.processBA);
 BA.debugLineNum = 383;BA.debugLine="FileProvider1.InitializeStatic(\"android.support.v";
Debug.ShouldStop(1073741824);
_fileprovider1.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("androidx.core.content.FileProvider")));
 BA.debugLineNum = 384;BA.debugLine="Dim f As JavaObject";
Debug.ShouldStop(-2147483648);
_f = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("f", _f);
 BA.debugLineNum = 385;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Dir";
Debug.ShouldStop(1);
_f.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_dir),(_filename)})));
 BA.debugLineNum = 386;BA.debugLine="Return FileProvider1.RunMethod(\"getUriForFile\", A";
Debug.ShouldStop(2);
if (true) return _fileprovider1.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUriForFile")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_context.getObject()),(RemoteObject.concat(cameraactivity.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".provider"))),(_f.getObject())})));
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtextwithborder(RemoteObject _cvs1,RemoteObject _text,RemoteObject _fnt,RemoteObject _clr,RemoteObject _centerx,RemoteObject _centery,RemoteObject _border,RemoteObject _bline) throws Exception{
try {
		Debug.PushSubsStack("DrawTextWithBorder (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,264);
if (RapidSub.canDelegate("drawtextwithborder")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","drawtextwithborder", _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
Debug.locals.put("cvs1", _cvs1);
Debug.locals.put("Text", _text);
Debug.locals.put("Fnt", _fnt);
Debug.locals.put("Clr", _clr);
Debug.locals.put("CenterX", _centerx);
Debug.locals.put("CenterY", _centery);
Debug.locals.put("border", _border);
Debug.locals.put("bline", _bline);
 BA.debugLineNum = 264;BA.debugLine="Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As";
Debug.ShouldStop(128);
 BA.debugLineNum = 266;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(512);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 267;BA.debugLine="Dim baseline As Int = CenterY - r.Height / 2 - r.";
Debug.ShouldStop(1024);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 268;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(2048);
_cvs1.runVoidMethod ("DrawText",cameraactivity.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 271;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(16384);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 272;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 273;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(65536);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 275;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 276;BA.debugLine="cvs1.DrawRect(r, Clr, False, border)";
Debug.ShouldStop(524288);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(_clr),(Object)(cameraactivity.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtextwithborder2(RemoteObject _cvs1,RemoteObject _text,RemoteObject _fnt,RemoteObject _clr,RemoteObject _centerx,RemoteObject _centery,RemoteObject _border,RemoteObject _bline) throws Exception{
try {
		Debug.PushSubsStack("DrawTextWithBorder2 (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,280);
if (RapidSub.canDelegate("drawtextwithborder2")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","drawtextwithborder2", _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _ro = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("cvs1", _cvs1);
Debug.locals.put("Text", _text);
Debug.locals.put("Fnt", _fnt);
Debug.locals.put("Clr", _clr);
Debug.locals.put("CenterX", _centerx);
Debug.locals.put("CenterY", _centery);
Debug.locals.put("border", _border);
Debug.locals.put("bline", _bline);
 BA.debugLineNum = 280;BA.debugLine="Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 282;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(33554432);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 283;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
Debug.ShouldStop(67108864);
_r.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),cameraactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 284;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
Debug.ShouldStop(134217728);
_r.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),cameraactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 286;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
Debug.ShouldStop(536870912);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),_fnt.runMethod(true,"getSize")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),_r.runMethod(true,"getTop")}, "--",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 288;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(-2147483648);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 289;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 290;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(2);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 292;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 293;BA.debugLine="Dim ro As B4XRect";
Debug.ShouldStop(16);
_ro = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("ro", _ro);
 BA.debugLineNum = 294;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
Debug.ShouldStop(32);
_ro.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getLeft"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getRight"),_border}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getBottom"),_border}, "+",1, 0))));
 BA.debugLineNum = 295;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
Debug.ShouldStop(64);
_cvs1.runVoidMethod ("DrawRect",(Object)(_ro),(Object)(_clr),(Object)(cameraactivity.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 BA.debugLineNum = 296;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
Debug.ShouldStop(128);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(cameraactivity.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(cameraactivity.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 299;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(1024);
_cvs1.runVoidMethod ("DrawText",cameraactivity.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtextwithborder2phone(RemoteObject _cvs1,RemoteObject _text,RemoteObject _fnt,RemoteObject _clr,RemoteObject _centerx,RemoteObject _centery,RemoteObject _border,RemoteObject _bline) throws Exception{
try {
		Debug.PushSubsStack("DrawTextWithBorder2Phone (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,303);
if (RapidSub.canDelegate("drawtextwithborder2phone")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","drawtextwithborder2phone", _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _ro = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("cvs1", _cvs1);
Debug.locals.put("Text", _text);
Debug.locals.put("Fnt", _fnt);
Debug.locals.put("Clr", _clr);
Debug.locals.put("CenterX", _centerx);
Debug.locals.put("CenterY", _centery);
Debug.locals.put("border", _border);
Debug.locals.put("bline", _bline);
 BA.debugLineNum = 303;BA.debugLine="Sub DrawTextWithBorder2Phone (cvs1 As B4XCanvas, T";
Debug.ShouldStop(16384);
 BA.debugLineNum = 305;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(65536);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 306;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
Debug.ShouldStop(131072);
_r.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),cameraactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 307;BA.debugLine="r.Width = r.Width + (r.Width /2) + 50dip ' * 2";
Debug.ShouldStop(262144);
_r.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),cameraactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "++",2, 0)));
 BA.debugLineNum = 309;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
Debug.ShouldStop(1048576);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),_fnt.runMethod(true,"getSize")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),_r.runMethod(true,"getTop")}, "--",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 311;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(4194304);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 312;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 313;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(16777216);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 315;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 316;BA.debugLine="Dim ro As B4XRect";
Debug.ShouldStop(134217728);
_ro = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("ro", _ro);
 BA.debugLineNum = 317;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
Debug.ShouldStop(268435456);
_ro.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getLeft"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getRight"),_border}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getBottom"),_border}, "+",1, 0))));
 BA.debugLineNum = 318;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
Debug.ShouldStop(536870912);
_cvs1.runVoidMethod ("DrawRect",(Object)(_ro),(Object)(_clr),(Object)(cameraactivity.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 BA.debugLineNum = 319;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
Debug.ShouldStop(1073741824);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(cameraactivity.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(cameraactivity.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 322;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(2);
_cvs1.runVoidMethod ("DrawText",cameraactivity.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("LEFT"))));
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcamsize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("getCamsize (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,149);
if (RapidSub.canDelegate("getcamsize")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","getcamsize", _width, _height);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 149;BA.debugLine="Sub getCamsize(Width As Int, Height As Int) As Cam";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim ret As CameraSize";
Debug.ShouldStop(2097152);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 151;BA.debugLine="ret.initialize";
Debug.ShouldStop(4194304);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 152;BA.debugLine="ret.Width = Width";
Debug.ShouldStop(8388608);
_ret.setField ("Width" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 153;BA.debugLine="ret.Height = Height";
Debug.ShouldStop(16777216);
_ret.setField ("Height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 154;BA.debugLine="Return ret";
Debug.ShouldStop(33554432);
if (true) return _ret;
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private camPanel As Panel";
cameraactivity.mostCurrent._campanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private camEx As CameraExClass";
cameraactivity.mostCurrent._camex = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass");
 //BA.debugLineNum = 25;BA.debugLine="Private butCloseCamera As Button";
cameraactivity.mostCurrent._butclosecamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private showPicturePanel As Panel";
cameraactivity.mostCurrent._showpicturepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private showPictureImage As ImageView";
cameraactivity.mostCurrent._showpictureimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ShowPictureClose As Button";
cameraactivity.mostCurrent._showpictureclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private CurrentCLAItem As RequestCLAItem";
cameraactivity.mostCurrent._currentclaitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");
 //BA.debugLineNum = 31;BA.debugLine="Private CurrentFileName As String = \"\"";
cameraactivity.mostCurrent._currentfilename = BA.ObjectToString("");
 //BA.debugLineNum = 32;BA.debugLine="Private ReturnToName As String = \"requests3\"";
cameraactivity.mostCurrent._returntoname = BA.ObjectToString("requests3");
 //BA.debugLineNum = 33;BA.debugLine="Private LastOrigin As Int = 0";
cameraactivity._lastorigin = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 35;BA.debugLine="Private ExitToDialog As Boolean = False";
cameraactivity._exittodialog = cameraactivity.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 36;BA.debugLine="Private butCancelPicture As Button";
cameraactivity.mostCurrent._butcancelpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private butSavePicture As Button";
cameraactivity.mostCurrent._butsavepicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btnTakePicture As Button";
cameraactivity.mostCurrent._btntakepicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imagetobytes(RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("ImageToBytes (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,165);
if (RapidSub.canDelegate("imagetobytes")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","imagetobytes", _image);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 165;BA.debugLine="Public Sub ImageToBytes(Image As B4XBitmap) As Byt";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(32);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 167;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(64);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 168;BA.debugLine="Image.WriteToStream(out, ShareCode.DEVICE_DEF_QUA";
Debug.ShouldStop(128);
_image.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(cameraactivity.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),cameraactivity.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 169;BA.debugLine="out.Close";
Debug.ShouldStop(256);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 170;BA.debugLine="Return out.ToBytesArray";
Debug.ShouldStop(512);
if (true) return _out.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializecamera() throws Exception{
try {
		Debug.PushSubsStack("InitializeCamera (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,87);
if (RapidSub.canDelegate("initializecamera")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","initializecamera");}
 BA.debugLineNum = 87;BA.debugLine="Private Sub InitializeCamera";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 89;BA.debugLine="If (Starter.APP_CAMERA_ACCESS) Then";
Debug.ShouldStop(16777216);
if ((cameraactivity.mostCurrent._starter._app_camera_access /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 90;BA.debugLine="camEx.Initialize(camPanel, frontCamera, Me, \"ca";
Debug.ShouldStop(33554432);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_initialize" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(cameraactivity.mostCurrent._campanel),(Object)(cameraactivity._frontcamera),(Object)(cameraactivity.getObject()),(Object)(RemoteObject.createImmutable("camPanel")));
 BA.debugLineNum = 91;BA.debugLine="frontCamera = camEx.Front";
Debug.ShouldStop(67108864);
cameraactivity._frontcamera = cameraactivity.mostCurrent._camex.getField(true,"_front" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 93;BA.debugLine="ToastMessageShow(\"Sem Permissão!!!\", True)";
Debug.ShouldStop(268435456);
cameraactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Sem Permissão!!!")),(Object)(cameraactivity.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity.processBA, e9.toString()); BA.debugLineNum = 96;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(-2147483648);
cameraactivity.mostCurrent.__c.runVoidMethod ("LogImpl","6120651785",cameraactivity.mostCurrent.__c.runMethod(false,"LastException",cameraactivity.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
cameraactivity._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 9;BA.debugLine="Public StayOnCamera As Boolean = True";
cameraactivity._stayoncamera = cameraactivity.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 10;BA.debugLine="Public ShotFileLocation As String = File.DirInter";
cameraactivity._shotfilelocation = cameraactivity.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 //BA.debugLineNum = 11;BA.debugLine="Public ShotFileName As String = \"\"";
cameraactivity._shotfilename = BA.ObjectToString("");
 //BA.debugLineNum = 12;BA.debugLine="Private frontCamera As Boolean = False";
cameraactivity._frontcamera = cameraactivity.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 13;BA.debugLine="Private Counter As Int = 1";
cameraactivity._counter = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 14;BA.debugLine="Private LastFileName As String = \"\"";
cameraactivity._lastfilename = BA.ObjectToString("");
 //BA.debugLineNum = 15;BA.debugLine="Private CamShots As List";
cameraactivity._camshots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Private ReturnTo As Object";
cameraactivity._returnto = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 17;BA.debugLine="Public Device As Phone";
cameraactivity._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setminimumsize() throws Exception{
try {
		Debug.PushSubsStack("SetMinimumSize (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,122);
if (RapidSub.canDelegate("setminimumsize")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","setminimumsize");}
RemoteObject _mincs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
RemoteObject _cs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
 BA.debugLineNum = 122;BA.debugLine="Private Sub SetMinimumSize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim minCS As CameraSize";
Debug.ShouldStop(67108864);
_mincs = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");Debug.locals.put("minCS", _mincs);
 BA.debugLineNum = 124;BA.debugLine="For Each cs As CameraSize In camEx.GetSupportedPi";
Debug.ShouldStop(134217728);
{
final RemoteObject group2 = cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedpicturessizes" /*RemoteObject*/ );
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_cs = group2.getArrayElement(false, /*RemoteObject*/ RemoteObject.createImmutable(index2));Debug.locals.put("cs", _cs);
Debug.locals.put("cs", _cs);
 BA.debugLineNum = 125;BA.debugLine="If minCS.Width = 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_mincs.getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 126;BA.debugLine="minCS = cs";
Debug.ShouldStop(536870912);
_mincs = _cs;Debug.locals.put("minCS", _mincs);
 }else {
 BA.debugLineNum = 128;BA.debugLine="If Power(minCS.Width, 2) + Power(minCS.Height,";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {cameraactivity.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _mincs.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2))),cameraactivity.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _mincs.getField(true,"Height" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {cameraactivity.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _cs.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2))),cameraactivity.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _cs.getField(true,"Height" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))) { 
 BA.debugLineNum = 129;BA.debugLine="minCS = cs";
Debug.ShouldStop(1);
_mincs = _cs;Debug.locals.put("minCS", _mincs);
 };
 };
 }
}Debug.locals.put("cs", _cs);
;
 BA.debugLineNum = 133;BA.debugLine="camEx.SetPictureSize(minCS.Width, minCS.Height)";
Debug.ShouldStop(16);
cameraactivity.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setpicturesize" /*RemoteObject*/ ,(Object)(_mincs.getField(true,"Width" /*RemoteObject*/ )),(Object)(_mincs.getField(true,"Height" /*RemoteObject*/ )));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpictureclose_click() throws Exception{
try {
		Debug.PushSubsStack("ShowPictureClose_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,474);
if (RapidSub.canDelegate("showpictureclose_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","showpictureclose_click");}
 BA.debugLineNum = 474;BA.debugLine="Sub ShowPictureClose_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 475;BA.debugLine="showPicturePanel.Visible = False";
Debug.ShouldStop(67108864);
cameraactivity.mostCurrent._showpicturepanel.runMethod(true,"setVisible",cameraactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpictureimage_click() throws Exception{
try {
		Debug.PushSubsStack("showPictureImage_Click (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,602);
if (RapidSub.canDelegate("showpictureimage_click")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","showpictureimage_click");}
 BA.debugLineNum = 602;BA.debugLine="Sub showPictureImage_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 605;BA.debugLine="LastOrigin = CurrentCLAItem.Origin";
Debug.ShouldStop(268435456);
cameraactivity._lastorigin = cameraactivity.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ );
 BA.debugLineNum = 606;BA.debugLine="CurrentCLAItem.Origin = 4";
Debug.ShouldStop(536870912);
cameraactivity.mostCurrent._currentclaitem.setField ("Origin" /*RemoteObject*/ ,BA.numberCast(int.class, 4));
 BA.debugLineNum = 607;BA.debugLine="CurrentFileName = ShotFileName";
Debug.ShouldStop(1073741824);
cameraactivity.mostCurrent._currentfilename = cameraactivity._shotfilename;
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startcamera(RemoteObject _returntoactivity) throws Exception{
try {
		Debug.PushSubsStack("StartCamera (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,53);
if (RapidSub.canDelegate("startcamera")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","startcamera", _returntoactivity);}
Debug.locals.put("ReturnToActivity", _returntoactivity);
 BA.debugLineNum = 53;BA.debugLine="Public Sub StartCamera(ReturnToActivity As Object)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="ReturnTo = ReturnToActivity";
Debug.ShouldStop(2097152);
cameraactivity._returnto = _returntoactivity;
 BA.debugLineNum = 55;BA.debugLine="CurrentCLAItem = Types.MakeRequestCLAItem(\"__DUMM";
Debug.ShouldStop(4194304);
cameraactivity.mostCurrent._currentclaitem = cameraactivity.mostCurrent._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(cameraactivity.mostCurrent._utils.runMethod(true,"_udid" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA)),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(cameraactivity.mostCurrent._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,cameraactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 59;BA.debugLine="InitializeCamera";
Debug.ShouldStop(67108864);
_initializecamera();
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startcamera2(RemoteObject _returntoactivity,RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("StartCamera2 (cameraactivity) ","cameraactivity",25,cameraactivity.mostCurrent.activityBA,cameraactivity.mostCurrent,62);
if (RapidSub.canDelegate("startcamera2")) { return xevolution.vrcg.devdemov2400.cameraactivity.remoteMe.runUserSub(false, "cameraactivity","startcamera2", _returntoactivity, _claitem);}
Debug.locals.put("ReturnToActivity", _returntoactivity);
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 62;BA.debugLine="Public Sub StartCamera2(ReturnToActivity As Object";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="ReturnTo = ReturnToActivity";
Debug.ShouldStop(1073741824);
cameraactivity._returnto = _returntoactivity;
 BA.debugLineNum = 64;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(-2147483648);
cameraactivity.mostCurrent._currentclaitem = _claitem;
 BA.debugLineNum = 65;BA.debugLine="ExitToDialog = True";
Debug.ShouldStop(1);
cameraactivity._exittodialog = cameraactivity.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 67;BA.debugLine="InitializeCamera";
Debug.ShouldStop(4);
_initializecamera();
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}