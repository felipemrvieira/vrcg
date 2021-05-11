package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cameraactivity_innershot_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","activity_create", _firsttime);}
RemoteObject _dir = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(8);
if ((cameraactivity_innershot.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 37;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(16);
cameraactivity_innershot._device.runVoidMethod ("SetScreenOrientation",cameraactivity_innershot.processBA,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 39;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(64);
cameraactivity_innershot._device.runVoidMethod ("SetScreenOrientation",cameraactivity_innershot.processBA,(Object)(cameraactivity_innershot.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 };
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"camerawindow_inner_shot\")";
Debug.ShouldStop(256);
cameraactivity_innershot.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("camerawindow_inner_shot")),cameraactivity_innershot.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="CamShots.Initialize";
Debug.ShouldStop(512);
cameraactivity_innershot._camshots.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="Dim dir As String = Starter.InternalFolder  '.Saf";
Debug.ShouldStop(1024);
_dir = cameraactivity_innershot.mostCurrent._starter._internalfolder /*RemoteObject*/ ;Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 44;BA.debugLine="ShotFileLocation = dir";
Debug.ShouldStop(2048);
cameraactivity_innershot._shotfilelocation = _dir;
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,64);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, cameraactivity_innershot.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 66;BA.debugLine="CloseActivity";
Debug.ShouldStop(2);
_closeactivity();
 };
 BA.debugLineNum = 68;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return cameraactivity_innershot.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Pause (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,76);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 76;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="If camExInner.IsInitialized Then";
Debug.ShouldStop(4096);
if (cameraactivity_innershot.mostCurrent._camexinner.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 78;BA.debugLine="camExInner.Release";
Debug.ShouldStop(8192);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_release" /*RemoteObject*/ );
 };
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,60);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","activity_resume");}
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("btnFlash_Click (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,241);
if (RapidSub.canDelegate("btnflash_click")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","btnflash_click");}
RemoteObject _f = null;
RemoteObject _flashmodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flash = RemoteObject.createImmutable("");
 BA.debugLineNum = 241;BA.debugLine="Sub btnFlash_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="Dim f() As Float = camExInner.GetFocusDistances";
Debug.ShouldStop(131072);
_f = cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getfocusdistances" /*RemoteObject*/ );Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 243;BA.debugLine="Log(f(0) & \", \" & f(1) & \", \" & f(2))";
Debug.ShouldStop(262144);
cameraactivity_innershot.mostCurrent.__c.runVoidMethod ("LogImpl","6123600898",RemoteObject.concat(_f.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(", "),_f.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(", "),_f.getArrayElement(true,BA.numberCast(int.class, 2))),0);
 BA.debugLineNum = 244;BA.debugLine="Dim flashModes As List = camExInner.GetSupportedF";
Debug.ShouldStop(524288);
_flashmodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_flashmodes = cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedflashmodes" /*RemoteObject*/ );Debug.locals.put("flashModes", _flashmodes);Debug.locals.put("flashModes", _flashmodes);
 BA.debugLineNum = 245;BA.debugLine="If flashModes.IsInitialized = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_flashmodes.runMethod(true,"IsInitialized"),cameraactivity_innershot.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 246;BA.debugLine="ToastMessageShow(\"Flash não suportado.\", False)";
Debug.ShouldStop(2097152);
cameraactivity_innershot.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Flash não suportado.")),(Object)(cameraactivity_innershot.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 247;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 249;BA.debugLine="Dim flash As String = flashModes.Get((flashModes.";
Debug.ShouldStop(16777216);
_flash = BA.ObjectToString(_flashmodes.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_flashmodes.runMethod(true,"IndexOf",(Object)((cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getflashmode" /*RemoteObject*/ )))),RemoteObject.createImmutable(1)}, "+",1, 1)),_flashmodes.runMethod(true,"getSize")}, "%",0, 1))));Debug.locals.put("flash", _flash);Debug.locals.put("flash", _flash);
 BA.debugLineNum = 250;BA.debugLine="camExInner.SetFlashMode(flash)";
Debug.ShouldStop(33554432);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setflashmode" /*RemoteObject*/ ,(Object)(_flash));
 BA.debugLineNum = 251;BA.debugLine="ToastMessageShow(flash, False)";
Debug.ShouldStop(67108864);
cameraactivity_innershot.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_flash)),(Object)(cameraactivity_innershot.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 252;BA.debugLine="camExInner.CommitParameters";
Debug.ShouldStop(134217728);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnFocus_Click (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,115);
if (RapidSub.canDelegate("btnfocus_click")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","btnfocus_click");}
 BA.debugLineNum = 115;BA.debugLine="Sub btnFocus_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="camExInner.FocusAndTakePicture";
Debug.ShouldStop(524288);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_focusandtakepicture" /*RemoteObject*/ );
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("btnTakePicture_Click (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,111);
if (RapidSub.canDelegate("btntakepicture_click")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","btntakepicture_click");}
 BA.debugLineNum = 111;BA.debugLine="Sub btnTakePicture_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="camExInner.TakePicture";
Debug.ShouldStop(32768);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_takepicture" /*RemoteObject*/ );
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("butCloseCamera_Click (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,275);
if (RapidSub.canDelegate("butclosecamera_click")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","butclosecamera_click");}
RemoteObject _docontinue = RemoteObject.createImmutable(false);
RemoteObject _ma = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
 BA.debugLineNum = 275;BA.debugLine="Sub butCloseCamera_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 277;BA.debugLine="Dim DoContinue As Boolean = True";
Debug.ShouldStop(1048576);
_docontinue = cameraactivity_innershot.mostCurrent.__c.getField(true,"True");Debug.locals.put("DoContinue", _docontinue);Debug.locals.put("DoContinue", _docontinue);
 BA.debugLineNum = 282;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("i",cameraactivity_innershot._returnto, RemoteObject.createImmutable("xevolution.vrcg.devdemov2400.appactiondialogs")))) { 
 BA.debugLineNum = 284;BA.debugLine="Dim ma As AppActionDialogs = ReturnTo";
Debug.ShouldStop(134217728);
_ma = (cameraactivity_innershot._returnto);Debug.locals.put("ma", _ma);Debug.locals.put("ma", _ma);
 BA.debugLineNum = 285;BA.debugLine="Dim i As Int";
Debug.ShouldStop(268435456);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 286;BA.debugLine="i = Msgbox2(ShareCode.SavePictureToCLAItem, Shar";
Debug.ShouldStop(536870912);
_i = cameraactivity_innershot.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(cameraactivity_innershot.mostCurrent._sharecode._savepicturetoclaitem /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(cameraactivity_innershot.mostCurrent._sharecode._generalnotetitle /*RemoteObject*/ )),(Object)(cameraactivity_innershot.mostCurrent._sharecode._option_exitsave /*RemoteObject*/ ),(Object)(cameraactivity_innershot.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(cameraactivity_innershot.mostCurrent._sharecode._option_exitnosave /*RemoteObject*/ ),(Object)((cameraactivity_innershot.mostCurrent.__c.getField(false,"Null"))),cameraactivity_innershot.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 287;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, cameraactivity_innershot.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 288;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",cameraactivity_innershot.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 289;BA.debugLine="ma.CameraReturn(CurrentFileName, CurrentCLAIte";
Debug.ShouldStop(1);
_ma.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_camerareturn" /*void*/ ,(Object)(cameraactivity_innershot.mostCurrent._currentfilename),(Object)(cameraactivity_innershot.mostCurrent._currentclaitem));
 BA.debugLineNum = 290;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
Debug.ShouldStop(2);
cameraactivity_innershot.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity_innershot.processBA,(Object)((cameraactivity_innershot.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((cameraactivity_innershot.mostCurrent._currentclaitem)));
 };
 }else 
{ BA.debugLineNum = 292;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, cameraactivity_innershot.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
 BA.debugLineNum = 293;BA.debugLine="ma.CameraReturnNothing";
Debug.ShouldStop(16);
_ma.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_camerareturnnothing" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 295;BA.debugLine="DoContinue = False";
Debug.ShouldStop(64);
_docontinue = cameraactivity_innershot.mostCurrent.__c.getField(true,"False");Debug.locals.put("DoContinue", _docontinue);
 }}
;
 }else {
 BA.debugLineNum = 299;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1024);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 300;BA.debugLine="i = Msgbox2(ShareCode.SavePictureToResoucesFolde";
Debug.ShouldStop(2048);
_i = cameraactivity_innershot.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(cameraactivity_innershot.mostCurrent._sharecode._savepicturetoresoucesfolder /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(cameraactivity_innershot.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(cameraactivity_innershot.mostCurrent._sharecode._option_action /*RemoteObject*/ ),(Object)(cameraactivity_innershot.mostCurrent._sharecode._option_resource /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((cameraactivity_innershot.mostCurrent.__c.getField(false,"Null"))),cameraactivity_innershot.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 301;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, cameraactivity_innershot.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 }else 
{ BA.debugLineNum = 305;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, cameraactivity_innershot.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
 BA.debugLineNum = 311;BA.debugLine="Private sACLALatitude As String = Utils.IfNullO";
Debug.ShouldStop(4194304);
_saclalatitude = cameraactivity_innershot.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA,(Object)(cameraactivity_innershot.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 312;BA.debugLine="Private sACLALongitude As String = Utils.IfNull";
Debug.ShouldStop(8388608);
_saclalongitude = cameraactivity_innershot.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA,(Object)(cameraactivity_innershot.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 314;BA.debugLine="For i=0 To CamShots.Size-1";
Debug.ShouldStop(33554432);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {cameraactivity_innershot._camshots.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step23 > 0 && _i.<Integer>get().intValue() <= limit23) || (step23 < 0 && _i.<Integer>get().intValue() >= limit23) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 315;BA.debugLine="DBStructures.InsertWorkingFiles( ShareCode.SES";
Debug.ShouldStop(67108864);
cameraactivity_innershot.mostCurrent._dbstructures.runVoidMethod ("_insertworkingfiles" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA,(Object)(cameraactivity_innershot.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(cameraactivity_innershot.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("WFF_")))),(Object)(BA.ObjectToString(cameraactivity_innershot._camshots.runMethod(false,"Get",(Object)(_i)))),(Object)(cameraactivity_innershot._shotfilelocation),(Object)(cameraactivity_innershot.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA)),(Object)(_saclalatitude),(Object)(_saclalongitude));
 }
}Debug.locals.put("i", _i);
;
 }else {
 }}
;
 };
 BA.debugLineNum = 326;BA.debugLine="If DoContinue Then Activity.Finish";
Debug.ShouldStop(32);
if (_docontinue.<Boolean>get().booleanValue()) { 
cameraactivity_innershot.mostCurrent._activity.runVoidMethod ("Finish");};
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
public static RemoteObject  _bytestoimage(RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("BytesToImage (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,143);
if (RapidSub.canDelegate("bytestoimage")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","bytestoimage", _bytes);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 143;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As B4XBit";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(32768);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 145;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
Debug.ShouldStop(65536);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 147;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(262144);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 148;BA.debugLine="bmp.Initialize2(In)";
Debug.ShouldStop(524288);
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 153;BA.debugLine="Return bmp";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bmp.getObject());
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _campanelinner_picturetaken(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("camPanelInner_PictureTaken (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,157);
if (RapidSub.canDelegate("campanelinner_picturetaken")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","campanelinner_picturetaken", _data);}
RemoteObject _datename = RemoteObject.createImmutable("");
RemoteObject _datetimename = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _cmes = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _cvsrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _scounter = RemoteObject.createImmutable("");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 157;BA.debugLine="Sub camPanelInner_PictureTaken (Data() As Byte)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Dim DateName As String = Utils.MakeFileName";
Debug.ShouldStop(536870912);
_datename = cameraactivity_innershot.mostCurrent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA);Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 159;BA.debugLine="Dim DateTimeName As String = Utils.MakeDateTimeSl";
Debug.ShouldStop(1073741824);
_datetimename = cameraactivity_innershot.mostCurrent._utils.runMethod(true,"_makedatetimeslash" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA);Debug.locals.put("DateTimeName", _datetimename);Debug.locals.put("DateTimeName", _datetimename);
 BA.debugLineNum = 161;BA.debugLine="CurrentFileName = $\"IMG-${DateName}-${Counter}-IN";
Debug.ShouldStop(1);
cameraactivity_innershot.mostCurrent._currentfilename = (RemoteObject.concat(RemoteObject.createImmutable("IMG-"),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datename))),RemoteObject.createImmutable("-"),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity_innershot._counter))),RemoteObject.createImmutable("-INNER-"),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity_innershot._intcounter))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 162;BA.debugLine="Dim filename As String = $\"${CurrentFileName}.png";
Debug.ShouldStop(2);
_filename = (RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity_innershot.mostCurrent._currentfilename))),RemoteObject.createImmutable(".png")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 163;BA.debugLine="If LastFileName = \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",cameraactivity_innershot._lastfilename,BA.ObjectToString(""))) { 
 BA.debugLineNum = 164;BA.debugLine="LastFileName = filename";
Debug.ShouldStop(8);
cameraactivity_innershot._lastfilename = _filename;
 };
 BA.debugLineNum = 167;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
Debug.ShouldStop(64);
cameraactivity_innershot._shotfilelocation = cameraactivity_innershot.mostCurrent._starter._internalfolder /*RemoteObject*/ ;
 BA.debugLineNum = 168;BA.debugLine="If Starter.Params.CFG_TAKE_PICTURE_ALWAYS_AS_NEW";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",cameraactivity_innershot.mostCurrent._starter._params /*RemoteObject*/ .getField(true,"_cfg_take_picture_always_as_new" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 169;BA.debugLine="filename = LastFileName";
Debug.ShouldStop(256);
_filename = cameraactivity_innershot._lastfilename;Debug.locals.put("filename", _filename);
 };
 BA.debugLineNum = 173;BA.debugLine="ShotFileName = filename";
Debug.ShouldStop(4096);
cameraactivity_innershot._shotfilename = _filename;
 BA.debugLineNum = 174;BA.debugLine="Dim cmes As CameraSize = camExInner.GetPictureSiz";
Debug.ShouldStop(8192);
_cmes = cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getpicturesize" /*RemoteObject*/ );Debug.locals.put("cmes", _cmes);Debug.locals.put("cmes", _cmes);
 BA.debugLineNum = 175;BA.debugLine="camExInner.SavePictureToFile(Data, ShotFileLocati";
Debug.ShouldStop(16384);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_savepicturetofile" /*RemoteObject*/ ,(Object)(_data),(Object)(cameraactivity_innershot._shotfilelocation),(Object)(cameraactivity_innershot._shotfilename));
 BA.debugLineNum = 181;BA.debugLine="Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, c";
Debug.ShouldStop(1048576);
_cvs = _createcanvas(_cmes.getField(true,"Width" /*RemoteObject*/ ),_cmes.getField(true,"Height" /*RemoteObject*/ ));Debug.locals.put("cvs", _cvs);Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 183;BA.debugLine="Dim cvsRect As B4XRect";
Debug.ShouldStop(4194304);
_cvsrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("cvsRect", _cvsrect);
 BA.debugLineNum = 184;BA.debugLine="cvsRect.Initialize(0,0,cmes.Width, cmes.Height)";
Debug.ShouldStop(8388608);
_cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _cmes.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _cmes.getField(true,"Height" /*RemoteObject*/ ))));
 BA.debugLineNum = 186;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, S";
Debug.ShouldStop(33554432);
_cvs.runVoidMethod ("DrawBitmap",(Object)((cameraactivity_innershot._xui.runMethod(false,"LoadBitmap",(Object)(cameraactivity_innershot._shotfilelocation),(Object)(cameraactivity_innershot._shotfilename)).getObject())),(Object)(_cvsrect));
 BA.debugLineNum = 189;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
Debug.ShouldStop(268435456);
_saclalatitude = cameraactivity_innershot.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA,(Object)(cameraactivity_innershot.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 190;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
Debug.ShouldStop(536870912);
_saclalongitude = cameraactivity_innershot.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA,(Object)(cameraactivity_innershot.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 191;BA.debugLine="DateTimeName = $\"${DateTimeName} - ${sACLALatitud";
Debug.ShouldStop(1073741824);
_datetimename = (RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datetimename))),RemoteObject.createImmutable(" - "),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalatitude))),RemoteObject.createImmutable("/"),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalongitude))),RemoteObject.createImmutable("")));Debug.locals.put("DateTimeName", _datetimename);
 BA.debugLineNum = 193;BA.debugLine="Dim SCounter As String = $\"Nº${IntCounter}\"$";
Debug.ShouldStop(1);
_scounter = (RemoteObject.concat(RemoteObject.createImmutable("Nº"),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity_innershot._intcounter))),RemoteObject.createImmutable("")));Debug.locals.put("SCounter", _scounter);Debug.locals.put("SCounter", _scounter);
 BA.debugLineNum = 194;BA.debugLine="cvs.DrawText(SCounter, 10dip, cvs.TargetRect.top+";
Debug.ShouldStop(2);
_cvs.runVoidMethod ("DrawText",cameraactivity_innershot.processBA,(Object)(_scounter),(Object)(BA.numberCast(float.class, cameraactivity_innershot.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getTop"),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "+",1, 0))),(Object)(cameraactivity_innershot._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, cameraactivity_innershot.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )))),(Object)(cameraactivity_innershot._xui.getField(true,"Color_White")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("LEFT"))));
 BA.debugLineNum = 195;BA.debugLine="cvs.DrawText(DateTimeName, 10dip, cvs.TargetRect.";
Debug.ShouldStop(4);
_cvs.runVoidMethod ("DrawText",cameraactivity_innershot.processBA,(Object)(_datetimename),(Object)(BA.numberCast(float.class, cameraactivity_innershot.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight"),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0))),(Object)(cameraactivity_innershot._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, cameraactivity_innershot.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )))),(Object)(cameraactivity_innershot._xui.getField(true,"Color_White")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("LEFT"))));
 BA.debugLineNum = 196;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(8);
_cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 197;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(ShotFil";
Debug.ShouldStop(16);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = cameraactivity_innershot.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(cameraactivity_innershot._shotfilelocation),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cameraactivity_innershot._shotfilename))),RemoteObject.createImmutable("")))),(Object)(cameraactivity_innershot.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Out", _out);Debug.locals.put("Out", _out);
 BA.debugLineNum = 198;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
Debug.ShouldStop(32);
_cvs.runMethod(false,"CreateBitmap").runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(cameraactivity_innershot.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),cameraactivity_innershot.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 199;BA.debugLine="cvs.Release";
Debug.ShouldStop(64);
_cvs.runVoidMethod ("Release");
 BA.debugLineNum = 200;BA.debugLine="Out.Close";
Debug.ShouldStop(128);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 201;BA.debugLine="CamShots.Add(ShotFileName)";
Debug.ShouldStop(256);
cameraactivity_innershot._camshots.runVoidMethod ("Add",(Object)((cameraactivity_innershot._shotfilename)));
 BA.debugLineNum = 227;BA.debugLine="CallSubDelayed2(ImageEdit, \"SaveInnerShot\", ShotF";
Debug.ShouldStop(4);
cameraactivity_innershot.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity_innershot.processBA,(Object)((cameraactivity_innershot.mostCurrent._imageedit.getObject())),(Object)(BA.ObjectToString("SaveInnerShot")),(Object)((cameraactivity_innershot._shotfilename)));
 BA.debugLineNum = 228;BA.debugLine="CloseActivity";
Debug.ShouldStop(8);
_closeactivity();
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _campanelinner_ready(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("camPanelInner_Ready (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,82);
if (RapidSub.canDelegate("campanelinner_ready")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","campanelinner_ready", _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 82;BA.debugLine="Sub camPanelInner_Ready (Success As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="If Success Then";
Debug.ShouldStop(262144);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 84;BA.debugLine="camExInner.SetJpegQuality(ShareCode.DEVICE_DEF_Q";
Debug.ShouldStop(524288);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setjpegquality" /*RemoteObject*/ ,(Object)(cameraactivity_innershot.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ));
 BA.debugLineNum = 87;BA.debugLine="camExInner.SetPictureSize(ShareCode.DEVICE_DEF_I";
Debug.ShouldStop(4194304);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setpicturesize" /*RemoteObject*/ ,(Object)(cameraactivity_innershot.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ),(Object)(cameraactivity_innershot.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ));
 BA.debugLineNum = 88;BA.debugLine="camExInner.SetContinuousAutoFocus";
Debug.ShouldStop(8388608);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setcontinuousautofocus" /*RemoteObject*/ );
 BA.debugLineNum = 89;BA.debugLine="camExInner.CommitParameters";
Debug.ShouldStop(16777216);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 90;BA.debugLine="camExInner.StartPreview";
Debug.ShouldStop(33554432);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 92;BA.debugLine="ToastMessageShow(\"Não é possível abrir a camera.";
Debug.ShouldStop(134217728);
cameraactivity_innershot.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Não é possível abrir a camera.")),(Object)(cameraactivity_innershot.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("camZoom_ValueChanged (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,255);
if (RapidSub.canDelegate("camzoom_valuechanged")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","camzoom_valuechanged", _value, _userchanged);}
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 255;BA.debugLine="Sub camZoom_ValueChanged (Value As Int, UserChange";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="If UserChanged = False Or camExInner.IsZoomSuppor";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_userchanged,cameraactivity_innershot.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_iszoomsupported" /*RemoteObject*/ ),cameraactivity_innershot.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 257;BA.debugLine="camExInner.Zoom = Value / 100 * camExInner.GetMax";
Debug.ShouldStop(1);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setzoom" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100),cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getmaxzoom" /*RemoteObject*/ )}, "/*",0, 0)));
 BA.debugLineNum = 258;BA.debugLine="camExInner.CommitParameters";
Debug.ShouldStop(2);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("ChangeCamera_Click (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,231);
if (RapidSub.canDelegate("changecamera_click")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","changecamera_click");}
 BA.debugLineNum = 231;BA.debugLine="Sub ChangeCamera_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="If Starter.Params.CFG_ALLOW_FRONT_CAMERA = 1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",cameraactivity_innershot.mostCurrent._starter._params /*RemoteObject*/ .getField(true,"_cfg_allow_front_camera" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 233;BA.debugLine="camExInner.Release";
Debug.ShouldStop(256);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 234;BA.debugLine="frontCamera = Not(frontCamera)";
Debug.ShouldStop(512);
cameraactivity_innershot._frontcamera = cameraactivity_innershot.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity_innershot._frontcamera));
 BA.debugLineNum = 235;BA.debugLine="InitializeCamera";
Debug.ShouldStop(1024);
_initializecamera();
 }else {
 BA.debugLineNum = 237;BA.debugLine="ToastMessageShow(\"Apenas a camera traseira está";
Debug.ShouldStop(4096);
cameraactivity_innershot.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Apenas a camera traseira está activa.")),(Object)(cameraactivity_innershot.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CloseActivity (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,271);
if (RapidSub.canDelegate("closeactivity")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","closeactivity");}
 BA.debugLineNum = 271;BA.debugLine="Public Sub CloseActivity";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
cameraactivity_innershot.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("CreateCanvas (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,127);
if (RapidSub.canDelegate("createcanvas")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","createcanvas", _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 127;BA.debugLine="Private Sub CreateCanvas(width As Int, height As I";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = cameraactivity_innershot._xui.runMethod(false,"CreatePanel",cameraactivity_innershot.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 129;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, height)";
Debug.ShouldStop(1);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 130;BA.debugLine="Dim cvs As B4XCanvas";
Debug.ShouldStop(2);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 131;BA.debugLine="cvs.Initialize(p)";
Debug.ShouldStop(4);
_cvs.runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 132;BA.debugLine="Return cvs";
Debug.ShouldStop(8);
if (true) return _cvs;
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("CreateFileProviderUri (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,261);
if (RapidSub.canDelegate("createfileprovideruri")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","createfileprovideruri", _dir, _filename);}
RemoteObject _fileprovider1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 261;BA.debugLine="Sub CreateFileProviderUri (Dir As String, FileName";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="Dim FileProvider1 As JavaObject";
Debug.ShouldStop(32);
_fileprovider1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("FileProvider1", _fileprovider1);
 BA.debugLineNum = 263;BA.debugLine="Dim context As JavaObject";
Debug.ShouldStop(64);
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 264;BA.debugLine="context.InitializeContext";
Debug.ShouldStop(128);
_context.runVoidMethod ("InitializeContext",cameraactivity_innershot.processBA);
 BA.debugLineNum = 265;BA.debugLine="FileProvider1.InitializeStatic(\"android.support.v";
Debug.ShouldStop(256);
_fileprovider1.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("androidx.core.content.FileProvider")));
 BA.debugLineNum = 266;BA.debugLine="Dim f As JavaObject";
Debug.ShouldStop(512);
_f = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("f", _f);
 BA.debugLineNum = 267;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Dir";
Debug.ShouldStop(1024);
_f.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_dir),(_filename)})));
 BA.debugLineNum = 268;BA.debugLine="Return FileProvider1.RunMethod(\"getUriForFile\", A";
Debug.ShouldStop(2048);
if (true) return _fileprovider1.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUriForFile")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_context.getObject()),(RemoteObject.concat(cameraactivity_innershot.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".provider"))),(_f.getObject())})));
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcamsize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("getCamsize (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,119);
if (RapidSub.canDelegate("getcamsize")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","getcamsize", _width, _height);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 119;BA.debugLine="Sub getCamsize(Width As Int, Height As Int) As Cam";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim ret As CameraSize";
Debug.ShouldStop(8388608);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 121;BA.debugLine="ret.initialize";
Debug.ShouldStop(16777216);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 122;BA.debugLine="ret.Width = Width";
Debug.ShouldStop(33554432);
_ret.setField ("Width" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 123;BA.debugLine="ret.Height = Height";
Debug.ShouldStop(67108864);
_ret.setField ("Height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 124;BA.debugLine="Return ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private camPanelInner As Panel";
cameraactivity_innershot.mostCurrent._campanelinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private camExInner As CameraExClass";
cameraactivity_innershot.mostCurrent._camexinner = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass");
 //BA.debugLineNum = 24;BA.debugLine="Private butCloseCamera As Button";
cameraactivity_innershot.mostCurrent._butclosecamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private showPicturePanel As Panel";
cameraactivity_innershot.mostCurrent._showpicturepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private showPictureImage As ImageView";
cameraactivity_innershot.mostCurrent._showpictureimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ShowPictureClose As Button";
cameraactivity_innershot.mostCurrent._showpictureclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private CurrentCLAItem As RequestCLAItem";
cameraactivity_innershot.mostCurrent._currentclaitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");
 //BA.debugLineNum = 29;BA.debugLine="Private ExitToDialog As Boolean = False";
cameraactivity_innershot._exittodialog = cameraactivity_innershot.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 30;BA.debugLine="Private CurrentFileName As String = \"\"";
cameraactivity_innershot.mostCurrent._currentfilename = BA.ObjectToString("");
 //BA.debugLineNum = 31;BA.debugLine="Private IntCounter As Int = 0";
cameraactivity_innershot._intcounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imagetobytes(RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("ImageToBytes (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,135);
if (RapidSub.canDelegate("imagetobytes")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","imagetobytes", _image);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 135;BA.debugLine="Public Sub ImageToBytes(Image As B4XBitmap) As Byt";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(128);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 137;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(256);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 138;BA.debugLine="Image.WriteToStream(out, ShareCode.DEVICE_DEF_QUA";
Debug.ShouldStop(512);
_image.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(cameraactivity_innershot.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),cameraactivity_innershot.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 139;BA.debugLine="out.Close";
Debug.ShouldStop(1024);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 140;BA.debugLine="Return out.ToBytesArray";
Debug.ShouldStop(2048);
if (true) return _out.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("InitializeCamera (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,71);
if (RapidSub.canDelegate("initializecamera")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","initializecamera");}
 BA.debugLineNum = 71;BA.debugLine="Private Sub InitializeCamera";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="camExInner.Initialize(camPanelInner, frontCamera,";
Debug.ShouldStop(128);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_initialize" /*RemoteObject*/ ,cameraactivity_innershot.mostCurrent.activityBA,(Object)(cameraactivity_innershot.mostCurrent._campanelinner),(Object)(cameraactivity_innershot._frontcamera),(Object)(cameraactivity_innershot.getObject()),(Object)(RemoteObject.createImmutable("camPanelInner")));
 BA.debugLineNum = 73;BA.debugLine="frontCamera = camExInner.Front";
Debug.ShouldStop(256);
cameraactivity_innershot._frontcamera = cameraactivity_innershot.mostCurrent._camexinner.getField(true,"_front" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
cameraactivity_innershot._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Public StayOnCamera As Boolean = True";
cameraactivity_innershot._stayoncamera = cameraactivity_innershot.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 11;BA.debugLine="Public ShotFileLocation As String = File.DirInter";
cameraactivity_innershot._shotfilelocation = cameraactivity_innershot.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 //BA.debugLineNum = 12;BA.debugLine="Public ShotFileName As String = \"\"";
cameraactivity_innershot._shotfilename = BA.ObjectToString("");
 //BA.debugLineNum = 13;BA.debugLine="Private frontCamera As Boolean = False";
cameraactivity_innershot._frontcamera = cameraactivity_innershot.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 14;BA.debugLine="Private Counter As Int = 1";
cameraactivity_innershot._counter = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 15;BA.debugLine="Private LastFileName As String = \"\"";
cameraactivity_innershot._lastfilename = BA.ObjectToString("");
 //BA.debugLineNum = 16;BA.debugLine="Private CamShots As List";
cameraactivity_innershot._camshots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 17;BA.debugLine="Private ReturnTo As Object";
cameraactivity_innershot._returnto = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 18;BA.debugLine="Public Device As Phone";
cameraactivity_innershot._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setminimumsize() throws Exception{
try {
		Debug.PushSubsStack("SetMinimumSize (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,97);
if (RapidSub.canDelegate("setminimumsize")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","setminimumsize");}
RemoteObject _mincs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
RemoteObject _cs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
 BA.debugLineNum = 97;BA.debugLine="Private Sub SetMinimumSize";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Dim minCS As CameraSize";
Debug.ShouldStop(2);
_mincs = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");Debug.locals.put("minCS", _mincs);
 BA.debugLineNum = 99;BA.debugLine="For Each cs As CameraSize In camExInner.GetSuppor";
Debug.ShouldStop(4);
{
final RemoteObject group2 = cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedpicturessizes" /*RemoteObject*/ );
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_cs = group2.getArrayElement(false, /*RemoteObject*/ RemoteObject.createImmutable(index2));Debug.locals.put("cs", _cs);
Debug.locals.put("cs", _cs);
 BA.debugLineNum = 100;BA.debugLine="If minCS.Width = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_mincs.getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 101;BA.debugLine="minCS = cs";
Debug.ShouldStop(16);
_mincs = _cs;Debug.locals.put("minCS", _mincs);
 }else {
 BA.debugLineNum = 103;BA.debugLine="If Power(minCS.Width, 2) + Power(minCS.Height,";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {cameraactivity_innershot.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _mincs.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2))),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _mincs.getField(true,"Height" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {cameraactivity_innershot.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _cs.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2))),cameraactivity_innershot.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _cs.getField(true,"Height" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))) { 
 BA.debugLineNum = 104;BA.debugLine="minCS = cs";
Debug.ShouldStop(128);
_mincs = _cs;Debug.locals.put("minCS", _mincs);
 };
 };
 }
}Debug.locals.put("cs", _cs);
;
 BA.debugLineNum = 108;BA.debugLine="camExInner.SetPictureSize(minCS.Width, minCS.Heig";
Debug.ShouldStop(2048);
cameraactivity_innershot.mostCurrent._camexinner.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setpicturesize" /*RemoteObject*/ ,(Object)(_mincs.getField(true,"Width" /*RemoteObject*/ )),(Object)(_mincs.getField(true,"Height" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startcamerainner(RemoteObject _icounter) throws Exception{
try {
		Debug.PushSubsStack("StartCameraInner (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,47);
if (RapidSub.canDelegate("startcamerainner")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","startcamerainner", _icounter);}
Debug.locals.put("ICounter", _icounter);
 BA.debugLineNum = 47;BA.debugLine="Public Sub StartCameraInner(ICounter As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="ReturnTo = \"ImageEdit\"";
Debug.ShouldStop(32768);
cameraactivity_innershot._returnto = RemoteObject.createImmutable(("ImageEdit"));
 BA.debugLineNum = 49;BA.debugLine="IntCounter = ICounter";
Debug.ShouldStop(65536);
cameraactivity_innershot._intcounter = _icounter;
 BA.debugLineNum = 50;BA.debugLine="InitializeCamera";
Debug.ShouldStop(131072);
_initializecamera();
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
public static RemoteObject  _startcamerainner2(RemoteObject _returntoactivity,RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("StartCameraInner2 (cameraactivity_innershot) ","cameraactivity_innershot",26,cameraactivity_innershot.mostCurrent.activityBA,cameraactivity_innershot.mostCurrent,53);
if (RapidSub.canDelegate("startcamerainner2")) { return xevolution.vrcg.devdemov2400.cameraactivity_innershot.remoteMe.runUserSub(false, "cameraactivity_innershot","startcamerainner2", _returntoactivity, _claitem);}
Debug.locals.put("ReturnToActivity", _returntoactivity);
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 53;BA.debugLine="Public Sub StartCameraInner2(ReturnToActivity As O";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="ReturnTo = ReturnToActivity";
Debug.ShouldStop(2097152);
cameraactivity_innershot._returnto = _returntoactivity;
 BA.debugLineNum = 55;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(4194304);
cameraactivity_innershot.mostCurrent._currentclaitem = _claitem;
 BA.debugLineNum = 56;BA.debugLine="ExitToDialog = True";
Debug.ShouldStop(8388608);
cameraactivity_innershot._exittodialog = cameraactivity_innershot.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 57;BA.debugLine="InitializeCamera";
Debug.ShouldStop(16777216);
_initializecamera();
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}