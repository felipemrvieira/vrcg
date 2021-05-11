package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cameraactivity2_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,42);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","activity_create", _firsttime);}
RemoteObject _dir = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(1024);
if ((cameraactivity2.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 44;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(2048);
cameraactivity2._device.runVoidMethod ("SetScreenOrientation",cameraactivity2.processBA,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 46;BA.debugLine="Device.SetScreenOrientation(0)";
Debug.ShouldStop(8192);
cameraactivity2._device.runVoidMethod ("SetScreenOrientation",cameraactivity2.processBA,(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 48;BA.debugLine="Activity.LoadLayout(\"camerawindowmultiple\")";
Debug.ShouldStop(32768);
cameraactivity2.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("camerawindowmultiple")),cameraactivity2.mostCurrent.activityBA);
 BA.debugLineNum = 49;BA.debugLine="CamShots.Initialize";
Debug.ShouldStop(65536);
cameraactivity2._camshots.runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="Dim dir As String = Starter.InternalFolder  '.Saf";
Debug.ShouldStop(131072);
_dir = cameraactivity2.mostCurrent._starter._internalfolder /*RemoteObject*/ ;Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 51;BA.debugLine="ShotFileLocation = dir";
Debug.ShouldStop(262144);
cameraactivity2._shotfilelocation = _dir;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_KeyPress (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,90);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 90;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, cameraactivity2.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 93;BA.debugLine="butCloseCamera_Click";
Debug.ShouldStop(268435456);
_butclosecamera_click();
 };
 BA.debugLineNum = 95;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) return cameraactivity2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,84);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 84;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="If camEx.IsInitialized Then";
Debug.ShouldStop(1048576);
if (cameraactivity2.mostCurrent._camex.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="camEx.Release";
Debug.ShouldStop(2097152);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_release" /*RemoteObject*/ );
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,78);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","activity_resume");}
RemoteObject _dir = RemoteObject.createImmutable("");
 BA.debugLineNum = 78;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="CamShots.Initialize";
Debug.ShouldStop(16384);
cameraactivity2._camshots.runVoidMethod ("Initialize");
 BA.debugLineNum = 80;BA.debugLine="Dim dir As String = Starter.InternalFolder  '.Saf";
Debug.ShouldStop(32768);
_dir = cameraactivity2.mostCurrent._starter._internalfolder /*RemoteObject*/ ;Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 81;BA.debugLine="ShotFileLocation = dir";
Debug.ShouldStop(65536);
cameraactivity2._shotfilelocation = _dir;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("btnEffect_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,444);
if (RapidSub.canDelegate("btneffect_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","btneffect_click");}
 BA.debugLineNum = 444;BA.debugLine="Sub btnEffect_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btnFlash_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,454);
if (RapidSub.canDelegate("btnflash_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","btnflash_click");}
RemoteObject _f = null;
RemoteObject _flashmodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flash = RemoteObject.createImmutable("");
 BA.debugLineNum = 454;BA.debugLine="Sub btnFlash_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 455;BA.debugLine="Dim f() As Float = camEx.GetFocusDistances";
Debug.ShouldStop(64);
_f = cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getfocusdistances" /*RemoteObject*/ );Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 456;BA.debugLine="Log(f(0) & \", \" & f(1) & \", \" & f(2))";
Debug.ShouldStop(128);
cameraactivity2.mostCurrent.__c.runVoidMethod ("LogImpl","6125632514",RemoteObject.concat(_f.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(", "),_f.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(", "),_f.getArrayElement(true,BA.numberCast(int.class, 2))),0);
 BA.debugLineNum = 457;BA.debugLine="Dim flashModes As List = camEx.GetSupportedFlashM";
Debug.ShouldStop(256);
_flashmodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_flashmodes = cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedflashmodes" /*RemoteObject*/ );Debug.locals.put("flashModes", _flashmodes);Debug.locals.put("flashModes", _flashmodes);
 BA.debugLineNum = 458;BA.debugLine="If flashModes.IsInitialized = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_flashmodes.runMethod(true,"IsInitialized"),cameraactivity2.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 459;BA.debugLine="ToastMessageShow(\"Flash não suportado.\", False)";
Debug.ShouldStop(1024);
cameraactivity2.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Flash não suportado.")),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 460;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 462;BA.debugLine="Dim flash As String = flashModes.Get((flashModes.";
Debug.ShouldStop(8192);
_flash = BA.ObjectToString(_flashmodes.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_flashmodes.runMethod(true,"IndexOf",(Object)((cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getflashmode" /*RemoteObject*/ )))),RemoteObject.createImmutable(1)}, "+",1, 1)),_flashmodes.runMethod(true,"getSize")}, "%",0, 1))));Debug.locals.put("flash", _flash);Debug.locals.put("flash", _flash);
 BA.debugLineNum = 463;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 464;BA.debugLine="camEx.SetFlashMode(flash)";
Debug.ShouldStop(32768);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setflashmode" /*RemoteObject*/ ,(Object)(_flash));
 BA.debugLineNum = 465;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(65536);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity2.processBA, e13.toString()); BA.debugLineNum = 467;BA.debugLine="ToastMessageShow(flash, False)";
Debug.ShouldStop(262144);
cameraactivity2.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_flash)),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("btnFocus_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,172);
if (RapidSub.canDelegate("btnfocus_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","btnfocus_click");}
 BA.debugLineNum = 172;BA.debugLine="Sub btnFocus_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(8192);
if (cameraactivity2._hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 175;BA.debugLine="HasFocus = False";
Debug.ShouldStop(16384);
cameraactivity2._hasfocus = cameraactivity2.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 176;BA.debugLine="btnFocus.Text = Chr(0xF1BE)";
Debug.ShouldStop(32768);
cameraactivity2.mostCurrent._btnfocus.runMethod(true,"setText",BA.ObjectToCharSequence(cameraactivity2.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf1be)))));
 }else {
 BA.debugLineNum = 178;BA.debugLine="HasFocus = True";
Debug.ShouldStop(131072);
cameraactivity2._hasfocus = cameraactivity2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 179;BA.debugLine="btnFocus.Text = \"AF\"";
Debug.ShouldStop(262144);
cameraactivity2.mostCurrent._btnfocus.runMethod(true,"setText",BA.ObjectToCharSequence("AF"));
 };
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btnPictureSize_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,471);
if (RapidSub.canDelegate("btnpicturesize_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","btnpicturesize_click");}
 BA.debugLineNum = 471;BA.debugLine="Sub btnPictureSize_Click";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _btntakepicture_click() throws Exception{
try {
		Debug.PushSubsStack("btnTakePicture_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,157);
if (RapidSub.canDelegate("btntakepicture_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","btntakepicture_click");}
 BA.debugLineNum = 157;BA.debugLine="Sub btnTakePicture_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 163;BA.debugLine="camEx.TakePicture";
Debug.ShouldStop(4);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_takepicture" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity2.processBA, e4.toString()); BA.debugLineNum = 167;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
cameraactivity2.mostCurrent.__c.runVoidMethod ("LogImpl","6124715018",BA.ObjectToString(cameraactivity2.mostCurrent.__c.runMethod(false,"LastException",cameraactivity2.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("butCloseCamera_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,904);
if (RapidSub.canDelegate("butclosecamera_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","butclosecamera_click");}
RemoteObject _docontinue = RemoteObject.createImmutable(false);
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 904;BA.debugLine="Sub butCloseCamera_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 906;BA.debugLine="Dim DoContinue As Boolean = True";
Debug.ShouldStop(512);
_docontinue = cameraactivity2.mostCurrent.__c.getField(true,"True");Debug.locals.put("DoContinue", _docontinue);Debug.locals.put("DoContinue", _docontinue);
 BA.debugLineNum = 909;BA.debugLine="If (CamShots.Size >= 1) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("g",cameraactivity2._camshots.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 910;BA.debugLine="Dim i As Int = Msgbox2(\"Existem fotos tiradas po";
Debug.ShouldStop(8192);
_i = cameraactivity2.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Existem fotos tiradas por gravar! Deseja sair do módulo na mesma sem gravar?")),(Object)(BA.ObjectToCharSequence(cameraactivity2.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(cameraactivity2.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(cameraactivity2.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((cameraactivity2.mostCurrent.__c.getField(false,"Null"))),cameraactivity2.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 911;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, cameraactivity2.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 912;BA.debugLine="DoContinue = True";
Debug.ShouldStop(32768);
_docontinue = cameraactivity2.mostCurrent.__c.getField(true,"True");Debug.locals.put("DoContinue", _docontinue);
 }else {
 BA.debugLineNum = 914;BA.debugLine="DoContinue = False";
Debug.ShouldStop(131072);
_docontinue = cameraactivity2.mostCurrent.__c.getField(true,"False");Debug.locals.put("DoContinue", _docontinue);
 };
 };
 BA.debugLineNum = 918;BA.debugLine="If (DoContinue) Then";
Debug.ShouldStop(2097152);
if ((_docontinue).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 919;BA.debugLine="If (ExitToDialog) Then";
Debug.ShouldStop(4194304);
if ((cameraactivity2._exittodialog).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 920;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("i",cameraactivity2._returnto, RemoteObject.createImmutable("xevolution.vrcg.devdemov2400.appactiondialogs")))) { 
 BA.debugLineNum = 921;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",cameraactivity2.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 922;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Curren";
Debug.ShouldStop(33554432);
cameraactivity2.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity2.processBA,(Object)((cameraactivity2.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((cameraactivity2.mostCurrent._currentclaitem)));
 }else 
{ BA.debugLineNum = 923;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",cameraactivity2.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 924;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage2\", Curr";
Debug.ShouldStop(134217728);
cameraactivity2.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity2.processBA,(Object)((cameraactivity2.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage2")),(Object)((cameraactivity2.mostCurrent._currentclaitem)));
 }}
;
 };
 }else {
 BA.debugLineNum = 928;BA.debugLine="CallSubDelayed(MainMenu, \"ListsReturnNoAction\")";
Debug.ShouldStop(-2147483648);
cameraactivity2.mostCurrent.__c.runVoidMethod ("CallSubDelayed",cameraactivity2.processBA,(Object)((cameraactivity2.mostCurrent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("ListsReturnNoAction")));
 };
 };
 BA.debugLineNum = 932;BA.debugLine="If DoContinue Then Activity.Finish";
Debug.ShouldStop(8);
if (_docontinue.<Boolean>get().booleanValue()) { 
cameraactivity2.mostCurrent._activity.runVoidMethod ("Finish");};
 BA.debugLineNum = 933;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _butsavepicture_click() throws Exception{
try {
		Debug.PushSubsStack("butSavePicture_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,576);
if (RapidSub.canDelegate("butsavepicture_click")) { xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","butsavepicture_click"); return;}
ResumableSub_butSavePicture_Click rsub = new ResumableSub_butSavePicture_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butSavePicture_Click extends BA.ResumableSub {
public ResumableSub_butSavePicture_Click(xevolution.vrcg.devdemov2400.cameraactivity2 parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
RemoteObject _docontinue = RemoteObject.createImmutable(false);
RemoteObject _justexit = RemoteObject.createImmutable(false);
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
RemoteObject _apilist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _thefoto = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._shotfoto");
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _grp = RemoteObject.createImmutable("");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _alerttagcode = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _titlefoto = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step38;
int limit38;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butSavePicture_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,576);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 577;BA.debugLine="Dim DoContinue As Boolean = True";
Debug.ShouldStop(1);
_docontinue = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("DoContinue", _docontinue);Debug.locals.put("DoContinue", _docontinue);
 BA.debugLineNum = 578;BA.debugLine="Dim JustExit As Boolean = False";
Debug.ShouldStop(2);
_justexit = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("JustExit", _justexit);Debug.locals.put("JustExit", _justexit);
 BA.debugLineNum = 580;BA.debugLine="If (CamShots.Size = 0) Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 10;
if ((RemoteObject.solveBoolean("=",parent._camshots.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 582;BA.debugLine="Msgbox2Async(\"Não existem fotos tiradas para gra";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Não existem fotos tiradas para gravar! Deseja sair do módulo?")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),cameraactivity2.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 583;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", cameraactivity2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "butsavepicture_click"), null);
this.state = 49;
return;
case 49:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 584;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 585;BA.debugLine="JustExit = True";
Debug.ShouldStop(256);
_justexit = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("JustExit", _justexit);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 587;BA.debugLine="JustExit = False";
Debug.ShouldStop(1024);
_justexit = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("JustExit", _justexit);
 BA.debugLineNum = 588;BA.debugLine="DoContinue = False";
Debug.ShouldStop(2048);
_docontinue = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DoContinue", _docontinue);
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;
;
 BA.debugLineNum = 592;BA.debugLine="If Not(JustExit) And (DoContinue) Then";
Debug.ShouldStop(32768);

case 10:
//if
this.state = 43;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_justexit))) && RemoteObject.solveBoolean(".",(_docontinue))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 593;BA.debugLine="If (ExitToDialog) Then";
Debug.ShouldStop(65536);
if (true) break;

case 13:
//if
this.state = 42;
if ((parent._exittodialog).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 33;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 594;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
Debug.ShouldStop(131072);
if (true) break;

case 16:
//if
this.state = 31;
if ((RemoteObject.solveBoolean("i",parent._returnto, RemoteObject.createImmutable("xevolution.vrcg.devdemov2400.appactiondialogs")))) { 
this.state = 18;
}else {
this.state = 26;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 595;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(262144);
if (true) break;

case 19:
//if
this.state = 24;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
this.state = 21;
}else 
{ BA.debugLineNum = 597;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 3)))) { 
this.state = 23;
}}
if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 596;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Curren";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity2.processBA,(Object)((parent.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 598;BA.debugLine="CallSubDelayed3(CheckList3, \"CamImage\", Curre";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",cameraactivity2.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)),(Object)((parent._camshots)));
 if (true) break;

case 24:
//C
this.state = 31;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 601;BA.debugLine="If (ReturnToName = \"checklist3\") Then";
Debug.ShouldStop(16777216);
if (true) break;

case 27:
//if
this.state = 30;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._returntoname,RemoteObject.createImmutable("checklist3")))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 602;BA.debugLine="CallSubDelayed3(CheckList3, \"CamImage\", Curre";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",cameraactivity2.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)),(Object)((parent._camshots)));
 BA.debugLineNum = 603;BA.debugLine="Dim DoContinue As Boolean = True";
Debug.ShouldStop(67108864);
_docontinue = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("DoContinue", _docontinue);Debug.locals.put("DoContinue", _docontinue);
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 42;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 607;BA.debugLine="Dim this As RequestCLAItem = CurrentCLAItem";
Debug.ShouldStop(1073741824);
_this = parent.mostCurrent._currentclaitem;Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 608;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(-2147483648);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 609;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(1);
_base64con.runVoidMethod ("_initialize",cameraactivity2.processBA);
 BA.debugLineNum = 610;BA.debugLine="If (ShotFileLocation = File.DirAssets) Then";
Debug.ShouldStop(2);
if (true) break;

case 34:
//if
this.state = 37;
if ((RemoteObject.solveBoolean("=",parent._shotfilelocation,parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 611;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
Debug.ShouldStop(4);
parent._shotfilelocation = parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ;
 if (true) break;

case 37:
//C
this.state = 38;
;
 BA.debugLineNum = 613;BA.debugLine="Dim ApiList As List";
Debug.ShouldStop(16);
_apilist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ApiList", _apilist);
 BA.debugLineNum = 614;BA.debugLine="ApiList.Initialize";
Debug.ShouldStop(32);
_apilist.runVoidMethod ("Initialize");
 BA.debugLineNum = 615;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessFoto";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._pg2msgprocessfotos /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 616;BA.debugLine="Dim i As Int = 0";
Debug.ShouldStop(128);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 617;BA.debugLine="For i=0 To CamShots.Size-1";
Debug.ShouldStop(256);
if (true) break;

case 38:
//for
this.state = 41;
step38 = 1;
limit38 = RemoteObject.solve(new RemoteObject[] {parent._camshots.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 50;
if (true) break;

case 50:
//C
this.state = 41;
if ((step38 > 0 && _i.<Integer>get().intValue() <= limit38) || (step38 < 0 && _i.<Integer>get().intValue() >= limit38)) this.state = 40;
if (true) break;

case 51:
//C
this.state = 50;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step38)) ;
Debug.locals.put("i", _i);
if (true) break;

case 40:
//C
this.state = 51;
 BA.debugLineNum = 618;BA.debugLine="Dim theFoto  As ShotFoto = CamShots.Get(i) 'Ty";
Debug.ShouldStop(512);
_thefoto = (parent._camshots.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("theFoto", _thefoto);Debug.locals.put("theFoto", _thefoto);
 BA.debugLineNum = 620;BA.debugLine="Dim theFile As String = theFoto.FileName  'Cam";
Debug.ShouldStop(2048);
_thefile = _thefoto.getField(true,"FileName" /*RemoteObject*/ );Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 621;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
Debug.ShouldStop(4096);
_imgb64 = _base64con.runMethod(true,"_v6",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thefile))),RemoteObject.createImmutable("")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 623;BA.debugLine="Dim grp As String = $\"${Utils.IfNullOrEmpty(th";
Debug.ShouldStop(16384);
_grp = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_thefoto.getField(true,"DateNTime" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("|"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_thefoto.getField(true,"Latitude" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("|"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_thefoto.getField(true,"Longitude" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("")));Debug.locals.put("grp", _grp);Debug.locals.put("grp", _grp);
 BA.debugLineNum = 626;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(131072);
_mid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_alerts")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 627;BA.debugLine="Dim alerttagcode As String = $\"${Utils.Generat";
Debug.ShouldStop(262144);
_alerttagcode = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ALERTINF_")))))),RemoteObject.createImmutable("")));Debug.locals.put("alerttagcode", _alerttagcode);Debug.locals.put("alerttagcode", _alerttagcode);
 BA.debugLineNum = 628;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts";
Debug.ShouldStop(524288);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"),RemoteObject.createImmutable("						origin, title, group_tags, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"),RemoteObject.createImmutable("						values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', \n"),RemoteObject.createImmutable("						1, 1, 'Imagens adicionadas ao repositório por utilizar.', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_grp))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("						'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA)))),RemoteObject.createImmutable("', '', 1, 1, 0, 0)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 633;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("butSavePicture_Click")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 635;BA.debugLine="Dim titleFoto As String = $\"${Utils.IfNullOrEm";
Debug.ShouldStop(67108864);
_titlefoto = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_thefoto.getField(true,"Title" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("")));Debug.locals.put("titleFoto", _titlefoto);Debug.locals.put("titleFoto", _titlefoto);
 BA.debugLineNum = 636;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(134217728);
_mid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_alerts_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 637;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts_";
Debug.ShouldStop(268435456);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts_images\n"),RemoteObject.createImmutable("							(id, tagcode, imageb64, imagename, assigned, obs)\n"),RemoteObject.createImmutable("							values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thefile))),RemoteObject.createImmutable("', 0, '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_titlefoto))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 641;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("butSavePicture_Click")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 643;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 644;BA.debugLine="params.Initialize";
Debug.ShouldStop(8);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 645;BA.debugLine="params.Clear";
Debug.ShouldStop(16);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 646;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 647;BA.debugLine="params.Put(\"tagcode\", alerttagcode)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_alerttagcode)));
 BA.debugLineNum = 648;BA.debugLine="params.Put(\"relation_type\", \"ALRTREL_TASKS\")";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_type"))),(Object)((RemoteObject.createImmutable("ALRTREL_TASKS"))));
 BA.debugLineNum = 649;BA.debugLine="params.Put(\"alert_type\", \"ALRTTYP_TASKS\")";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alert_type"))),(Object)((RemoteObject.createImmutable("ALRTTYP_TASKS"))));
 BA.debugLineNum = 650;BA.debugLine="params.Put(\"internal\", 1)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("internal"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 651;BA.debugLine="params.Put(\"origin\", 1)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 652;BA.debugLine="params.Put(\"title\", \"Imagens adicionadas ao re";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("Imagens adicionadas ao repositório por utilizar."))));
 BA.debugLineNum = 653;BA.debugLine="params.Put(\"user_tagcode\", ShareCode.SESS_User";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 654;BA.debugLine="params.Put(\"date_alert\", Utils.GetCurrentDate)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_alert"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA))));
 BA.debugLineNum = 655;BA.debugLine="params.Put(\"date_verification\", \"\")";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_verification"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 656;BA.debugLine="params.Put(\"alert_visible\", 1)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alert_visible"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 657;BA.debugLine="params.Put(\"imageb64\", ImgB64)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imageb64"))),(Object)((_imgb64)));
 BA.debugLineNum = 658;BA.debugLine="params.Put(\"imagename\", theFile)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imagename"))),(Object)((_thefile)));
 BA.debugLineNum = 659;BA.debugLine="params.Put(\"status_id\", 0)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 660;BA.debugLine="params.Put(\"kind_data\", 0)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("kind_data"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 661;BA.debugLine="params.Put(\"request_tagcode\", this.Request)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 662;BA.debugLine="params.Put(\"action_tagcode\", this.Action)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action_tagcode"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 663;BA.debugLine="params.Put(\"task_tagcode\", this.Task)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("task_tagcode"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 664;BA.debugLine="params.Put(\"item_tagcode\", this.Item)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item_tagcode"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 665;BA.debugLine="params.Put(\"uniquekey\", this.UniqueKey)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("uniquekey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 666;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 667;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 668;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 669;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 670;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 671;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 672;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 673;BA.debugLine="ApiList.Add(params)";
Debug.ShouldStop(1);
_apilist.runVoidMethod ("Add",(Object)((_params.getObject())));
 if (true) break;
if (true) break;

case 41:
//C
this.state = 42;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 675;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 676;BA.debugLine="Sleep(125)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "butsavepicture_click"),BA.numberCast(int.class, 125));
this.state = 52;
return;
case 52:
//C
this.state = 42;
;
 BA.debugLineNum = 677;BA.debugLine="CallSubDelayed3(MainMenu, \"ListsReturnUpdateSer";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",cameraactivity2.processBA,(Object)((parent.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturnUpdateServer")),(Object)(((RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/alert/new"))))),(Object)((_apilist)));
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 BA.debugLineNum = 681;BA.debugLine="If DoContinue Then Activity.Finish";
Debug.ShouldStop(256);

case 43:
//if
this.state = 48;
if (_docontinue.<Boolean>get().booleanValue()) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
parent.mostCurrent._activity.runVoidMethod ("Finish");
if (true) break;

case 48:
//C
this.state = -1;
;
 BA.debugLineNum = 682;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _bytestoimage(RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("BytesToImage (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,210);
if (RapidSub.canDelegate("bytestoimage")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","bytestoimage", _bytes);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 210;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As B4XBit";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(262144);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 212;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
Debug.ShouldStop(524288);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 214;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(2097152);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 215;BA.debugLine="bmp.Initialize2(In)";
Debug.ShouldStop(4194304);
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 220;BA.debugLine="Return bmp";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bmp.getObject());
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camerareturnshots(RemoteObject _filelist,RemoteObject _this) throws Exception{
try {
		Debug.PushSubsStack("CameraReturnShots (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,687);
if (RapidSub.canDelegate("camerareturnshots")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","camerareturnshots", _filelist, _this);}
ResumableSub_CameraReturnShots rsub = new ResumableSub_CameraReturnShots(null,_filelist,_this);
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
public static class ResumableSub_CameraReturnShots extends BA.ResumableSub {
public ResumableSub_CameraReturnShots(xevolution.vrcg.devdemov2400.cameraactivity2 parent,RemoteObject _filelist,RemoteObject _this) {
this.parent = parent;
this._filelist = _filelist;
this._this = _this;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
RemoteObject _filelist;
RemoteObject _this;
RemoteObject _obj = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _params33 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _nfile = 0;
RemoteObject _thefoto = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._shotfoto");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable(0);
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _upl = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
RemoteObject _serverlocation = RemoteObject.createImmutable("");
int step6;
int limit6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CameraReturnShots (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,687);
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
Debug.locals.put("FileList", _filelist);
Debug.locals.put("this", _this);
 BA.debugLineNum = 690;BA.debugLine="Dim obj As String = this.TagObject";
Debug.ShouldStop(131072);
_obj = _this.getField(true,"TagObject" /*RemoteObject*/ );Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 691;BA.debugLine="Dim params As Map";
Debug.ShouldStop(262144);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 692;BA.debugLine="Dim params33 As Map";
Debug.ShouldStop(524288);
_params33 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params33", _params33);
 BA.debugLineNum = 693;BA.debugLine="If (FileList.Size >0) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 60;
if ((RemoteObject.solveBoolean(">",_filelist.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 694;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._pg2msgprocessfotos /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 695;BA.debugLine="For nFile=0 To FileList.Size-1";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//for
this.state = 59;
step6 = 1;
limit6 = RemoteObject.solve(new RemoteObject[] {_filelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nfile = 0 ;
Debug.locals.put("nFile", _nfile);
this.state = 61;
if (true) break;

case 61:
//C
this.state = 59;
if ((step6 > 0 && _nfile <= limit6) || (step6 < 0 && _nfile >= limit6)) this.state = 6;
if (true) break;

case 62:
//C
this.state = 61;
_nfile = ((int)(0 + _nfile + step6)) ;
Debug.locals.put("nFile", _nfile);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 696;BA.debugLine="Dim theFoto  As ShotFoto = FileList.Get(nFile)";
Debug.ShouldStop(8388608);
_thefoto = (_filelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _nfile))));Debug.locals.put("theFoto", _thefoto);Debug.locals.put("theFoto", _thefoto);
 BA.debugLineNum = 697;BA.debugLine="Dim FileName As String = theFoto.FileName";
Debug.ShouldStop(16777216);
_filename = _thefoto.getField(true,"FileName" /*RemoteObject*/ );Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 698;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 24;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_filename)))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 699;BA.debugLine="If Not(FileName.IndexOf(\".png\") >= 0) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 10:
//if
this.state = 13;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_filename.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".png"))),BA.numberCast(double.class, 0))))).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 700;BA.debugLine="FileName = $\"${FileName}.png\"$";
Debug.ShouldStop(134217728);
_filename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(".png")));Debug.locals.put("FileName", _filename);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 702;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(536870912);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 703;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(1073741824);
_base64con.runVoidMethod ("_initialize",cameraactivity2.processBA);
 BA.debugLineNum = 704;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
Debug.ShouldStop(-2147483648);
_imgb64 = _base64con.runMethod(true,"_v6",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 707;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(4);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 708;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
Debug.ShouldStop(8);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images\n"),RemoteObject.createImmutable("						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"),RemoteObject.createImmutable("						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, \n"),RemoteObject.createImmutable("						execute_datetime, execute_latitude, execute_longitude)\n"),RemoteObject.createImmutable("						values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("', 1, "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(",\n"),RemoteObject.createImmutable("				'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_thefoto.getField(true,"DateNTime" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_thefoto.getField(true,"Latitude" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_thefoto.getField(true,"Longitude" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 718;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.R";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("CameraReturn")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 720;BA.debugLine="If (Utils.NNE(obj)) Then";
Debug.ShouldStop(32768);
if (true) break;

case 14:
//if
this.state = 17;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_obj))).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 721;BA.debugLine="Dim v As Int = Utils.DBDataCount(Starter.Loca";
Debug.ShouldStop(65536);
_v = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._utils.runMethod(true,"_dbdatacount" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("select count(0) as COUNTER from dta_objects_images ")))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 722;BA.debugLine="Dim sSQL As String = $\"insert into dta_object";
Debug.ShouldStop(131072);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_objects_images (id, object_tagcode, image, filename)\n"),RemoteObject.createImmutable("					values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_v))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_obj))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("')")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 724;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("CameraReturn")),(Object)(_ssql),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 727;BA.debugLine="params33.Initialize";
Debug.ShouldStop(4194304);
_params33.runVoidMethod ("Initialize");
 BA.debugLineNum = 728;BA.debugLine="params33.Clear";
Debug.ShouldStop(8388608);
_params33.runVoidMethod ("Clear");
 BA.debugLineNum = 729;BA.debugLine="params33.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16777216);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 730;BA.debugLine="params33.Put(\"ACLATagcode\", obj)";
Debug.ShouldStop(33554432);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_obj)));
 BA.debugLineNum = 731;BA.debugLine="params33.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(67108864);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 732;BA.debugLine="params33.Put(\"ACLAValueFileImage\", FileName)";
Debug.ShouldStop(134217728);
_params33.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_filename)));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 736;BA.debugLine="Private sACLADatetime As String = Utils.GetCur";
Debug.ShouldStop(-2147483648);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 737;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
Debug.ShouldStop(1);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 738;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
Debug.ShouldStop(2);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 740;BA.debugLine="params.Initialize";
Debug.ShouldStop(8);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 741;BA.debugLine="params.Clear";
Debug.ShouldStop(16);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 742;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 743;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 744;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 745;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 746;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 747;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 748;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 749;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 750;BA.debugLine="params.Put(\"ACLAValueFileImage\", FileName)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((_filename)));
 BA.debugLineNum = 751;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAOnReport"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 752;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounte";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 753;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCo";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 754;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 755;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 756;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 757;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 758;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 759;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 760;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 761;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 762;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 18:
//try
this.state = 23;
this.catchState = 22;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 23;
this.catchState = 22;
 BA.debugLineNum = 763;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 764;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
 BA.debugLineNum = 766;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 767;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 768;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126091345",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",cameraactivity2.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
;
 if (true) break;
;
 BA.debugLineNum = 807;BA.debugLine="If (params.IsInitialized) Then";
Debug.ShouldStop(64);

case 24:
//if
this.state = 49;
if ((_params.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 808;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(128);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 809;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(256);
if (true) break;

case 27:
//if
this.state = 32;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 810;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(cameraactivity2.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 812;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(2048);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 813;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(4096);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 815;BA.debugLine="Sleep(250)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "camerareturnshots"),BA.numberCast(int.class, 250));
this.state = 63;
return;
case 63:
//C
this.state = 33;
;
 BA.debugLineNum = 818;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(131072);
if (true) break;

case 33:
//if
this.state = 48;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 35;
}else {
this.state = 47;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 819;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 36:
//try
this.state = 45;
this.catchState = 44;
this.state = 38;
if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 44;
 BA.debugLineNum = 820;BA.debugLine="Dim upl As ResumableSub = UploadFilesWithFTP";
Debug.ShouldStop(524288);
_upl = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_upl = _uploadfileswithftp(_filename);Debug.locals.put("upl", _upl);Debug.locals.put("upl", _upl);
 BA.debugLineNum = 821;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", cameraactivity2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "camerareturnshots"), _upl);
this.state = 64;
return;
case 64:
//C
this.state = 39;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 822;BA.debugLine="If finish Then";
Debug.ShouldStop(2097152);
if (true) break;

case 39:
//if
this.state = 42;
if (_finish.<Boolean>get().booleanValue()) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 823;BA.debugLine="Log(\"UploadFilesWithFTP finish \" & finish )";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126091400",RemoteObject.concat(RemoteObject.createImmutable("UploadFilesWithFTP finish "),_finish),0);
 if (true) break;

case 42:
//C
this.state = 45;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 BA.debugLineNum = 827;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126091404",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",cameraactivity2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 828;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCod";
Debug.ShouldStop(134217728);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 829;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWo";
Debug.ShouldStop(268435456);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 830;BA.debugLine="Utils.save2update(ServerLocation, FileName,";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;
if (true) break;

case 45:
//C
this.state = 48;
this.catchState = 0;
;
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 833;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode";
Debug.ShouldStop(1);
_serverlocation = (RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/docs/")));Debug.locals.put("ServerLocation", _serverlocation);Debug.locals.put("ServerLocation", _serverlocation);
 BA.debugLineNum = 834;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(2);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 835;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_serverlocation),(Object)(_filename),(Object)(BA.numberCast(int.class, 1)),(Object)(_workernd));
 if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 837;BA.debugLine="Sleep(250)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "camerareturnshots"),BA.numberCast(int.class, 250));
this.state = 65;
return;
case 65:
//C
this.state = 49;
;
 if (true) break;
;
 BA.debugLineNum = 840;BA.debugLine="If (params33.IsInitialized) Then";
Debug.ShouldStop(128);

case 49:
//if
this.state = 58;
if ((_params33.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 842;BA.debugLine="Log(\"33333333333333333333333333333333333333333";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126091419",RemoteObject.createImmutable("3333333333333333333333333333333333333333333333"),0);
 BA.debugLineNum = 843;BA.debugLine="Log(Url)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126091420",_url,0);
 BA.debugLineNum = 844;BA.debugLine="Log(\"33333333333333333333333333333333333333333";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126091421",RemoteObject.createImmutable("3333333333333333333333333333333333333333333333"),0);
 BA.debugLineNum = 845;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(4096);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more2/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 846;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(8192);
if (true) break;

case 52:
//if
this.state = 57;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 54;
}else {
this.state = 56;
}if (true) break;

case 54:
//C
this.state = 57;
 BA.debugLineNum = 847;BA.debugLine="Utils.CallApi(0, params33, Me, Url, \"\", this.";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params33),(Object)(cameraactivity2.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_this.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 849;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(65536);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)),(Object)(_this.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_this.getField(true,"Item" /*RemoteObject*/ ).runMethod(true,"trim")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 850;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_params33))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 57:
//C
this.state = 58;
;
 BA.debugLineNum = 852;BA.debugLine="Sleep(250)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "camerareturnshots"),BA.numberCast(int.class, 250));
this.state = 66;
return;
case 66:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = 62;
;
 if (true) break;
if (true) break;

case 59:
//C
this.state = 60;
Debug.locals.put("nFile", _nfile);
;
 BA.debugLineNum = 857;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 60:
//C
this.state = -1;
;
 BA.debugLineNum = 860;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 861;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity2.processBA, e0.toString());}
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
public static void  _complete(RemoteObject _finish) throws Exception{
}
public static void  _camimage(RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("CamImage (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,495);
if (RapidSub.canDelegate("camimage")) { xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","camimage", _claitem); return;}
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
public ResumableSub_CamImage(xevolution.vrcg.devdemov2400.cameraactivity2 parent,RemoteObject _claitem) {
this.parent = parent;
this._claitem = _claitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
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
		Debug.PushSubsStack("CamImage (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,495);
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
 BA.debugLineNum = 496;BA.debugLine="If CLAItem.Origin = 4 Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 497;BA.debugLine="CurrentCLAItem.Origin = LastOrigin";
Debug.ShouldStop(65536);
parent.mostCurrent._currentclaitem.setField ("Origin" /*RemoteObject*/ ,parent._lastorigin);
 BA.debugLineNum = 498;BA.debugLine="If (ExitToDialog) Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 499;BA.debugLine="If (CurrentCLAItem.Origin = 1) Then";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//if
this.state = 26;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 501;BA.debugLine="else If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 503;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 3)))) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 26;
 BA.debugLineNum = 500;BA.debugLine="CallSubDelayed2(User, \"CallMOREActionsAgain\",";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity2.processBA,(Object)((parent.mostCurrent._user.getObject())),(Object)(BA.ObjectToString("CallMOREActionsAgain")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 11:
//C
this.state = 26;
 BA.debugLineNum = 502;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity2.processBA,(Object)((parent.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 505;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(16777216);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 506;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(33554432);
_base64con.runVoidMethod ("_initialize",cameraactivity2.processBA);
 BA.debugLineNum = 507;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
Debug.ShouldStop(67108864);
_imgb64 = _base64con.runMethod(true,"_v6",(Object)(parent._shotfilelocation),(Object)(parent.mostCurrent._currentfilename));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 514;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
Debug.ShouldStop(2);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 515;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
Debug.ShouldStop(4);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images\n"),RemoteObject.createImmutable("					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report, \n"),RemoteObject.createImmutable("						repeatcounter, repeatitemcounter, repeatfieldcounter)\n"),RemoteObject.createImmutable("					values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("				'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._currentfilename))),RemoteObject.createImmutable("', 1,\n"),RemoteObject.createImmutable("					"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_claitem.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(")")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 521;BA.debugLine="Utils.SaveSQLToLog(\"CamImage\",sSQL, CLAItem.Re";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("CamImage")),(Object)(_ssql),(Object)(_claitem.getField(true,"Request" /*RemoteObject*/ )));
 BA.debugLineNum = 525;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDat";
Debug.ShouldStop(4096);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 526;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
Debug.ShouldStop(8192);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 527;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
Debug.ShouldStop(16384);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 529;BA.debugLine="Dim params As Map";
Debug.ShouldStop(65536);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 530;BA.debugLine="params.Initialize";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 531;BA.debugLine="params.Clear";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 532;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 533;BA.debugLine="params.Put(\"ACLARequest\", CLAItem.Request)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_claitem.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 534;BA.debugLine="params.Put(\"ACLAAction\", CLAItem.Action)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_claitem.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 535;BA.debugLine="params.Put(\"ACLATask\", CLAItem.Task)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_claitem.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 536;BA.debugLine="params.Put(\"ACLAItem\", CLAItem.Item)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_claitem.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 537;BA.debugLine="params.Put(\"ACLAUniqueKey\", CLAItem.UniqueKey)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_claitem.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 538;BA.debugLine="params.Put(\"ACLATagcode\", CLAItem.Tagcode)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATagcode"))),(Object)((_claitem.getField(true,"Tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 539;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueImage"))),(Object)((_imgb64)));
 BA.debugLineNum = 540;BA.debugLine="params.Put(\"ACLAValueFileImage\", CurrentFileNa";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValueFileImage"))),(Object)((parent.mostCurrent._currentfilename)));
 BA.debugLineNum = 541;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAOnReport"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 542;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 543;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 544;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 545;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 546;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 547;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 548;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 549;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 550;BA.debugLine="Try";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 551;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 552;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
 BA.debugLineNum = 554;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 555;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 556;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6125960253",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",cameraactivity2.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
;
 BA.debugLineNum = 560;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
Debug.ShouldStop(32768);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai-more/img/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 561;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 562;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLAItem";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(cameraactivity2.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_claitem.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 564;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
Debug.ShouldStop(524288);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 565;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 567;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "camimage"),BA.numberCast(int.class, 250));
this.state = 29;
return;
case 29:
//C
this.state = 26;
;
 BA.debugLineNum = 569;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage\", Curren";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",cameraactivity2.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 571;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity2.processBA, e0.toString());}
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
public static void  _campanel_picturetaken(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("camPanel_PictureTaken (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,246);
if (RapidSub.canDelegate("campanel_picturetaken")) { xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","campanel_picturetaken", _data); return;}
ResumableSub_camPanel_PictureTaken rsub = new ResumableSub_camPanel_PictureTaken(null,_data);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_camPanel_PictureTaken extends BA.ResumableSub {
public ResumableSub_camPanel_PictureTaken(xevolution.vrcg.devdemov2400.cameraactivity2 parent,RemoteObject _data) {
this.parent = parent;
this._data = _data;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
RemoteObject _data;
RemoteObject _datename = RemoteObject.createImmutable("");
RemoteObject _datetimename = RemoteObject.createImmutable("");
RemoteObject _datetimedb = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _cmes = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
RemoteObject _flipv = RemoteObject.createImmutable(false);
RemoteObject _fliph = RemoteObject.createImmutable(false);
RemoteObject _flp = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _requestsuccessful = RemoteObject.createImmutable(false);
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _cvsrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _lat = RemoteObject.createImmutable("");
RemoteObject _lon = RemoteObject.createImmutable("");
RemoteObject _newdatetimename = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _stamp = RemoteObject.createImmutable("");
RemoteObject _drect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _bc1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _thefoto = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._shotfoto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("camPanel_PictureTaken (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,246);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Data", _data);
 BA.debugLineNum = 247;BA.debugLine="Dim DateName As String = Utils.MakeFileName";
Debug.ShouldStop(4194304);
_datename = parent.mostCurrent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA);Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 248;BA.debugLine="Dim DateTimeName As String = Utils.MakeDateTimeSl";
Debug.ShouldStop(8388608);
_datetimename = parent.mostCurrent._utils.runMethod(true,"_makedatetimeslash2" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA);Debug.locals.put("DateTimeName", _datetimename);Debug.locals.put("DateTimeName", _datetimename);
 BA.debugLineNum = 249;BA.debugLine="Dim DatetimeDB As String = Utils.GetCurrDatetimeE";
Debug.ShouldStop(16777216);
_datetimedb = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA);Debug.locals.put("DatetimeDB", _datetimedb);Debug.locals.put("DatetimeDB", _datetimedb);
 BA.debugLineNum = 250;BA.debugLine="CurrentFileName = $\"IMG-${DateName}-${Counter}\"$";
Debug.ShouldStop(33554432);
parent.mostCurrent._currentfilename = (RemoteObject.concat(RemoteObject.createImmutable("IMG-"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datename))),RemoteObject.createImmutable("-"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._counter))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 251;BA.debugLine="Dim filename As String = $\"${CurrentFileName}.png";
Debug.ShouldStop(67108864);
_filename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._currentfilename))),RemoteObject.createImmutable(".png")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 252;BA.debugLine="If LastFileName = \"\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._lastfilename,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 253;BA.debugLine="LastFileName = filename";
Debug.ShouldStop(268435456);
parent._lastfilename = _filename;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 256;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
Debug.ShouldStop(-2147483648);
parent._shotfilelocation = parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ;
 BA.debugLineNum = 258;BA.debugLine="If Starter.Params.CFG_TAKE_PICTURE_ALWAYS_AS_NEW";
Debug.ShouldStop(2);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._params /*RemoteObject*/ .getField(true,"_cfg_take_picture_always_as_new" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 259;BA.debugLine="filename = LastFileName";
Debug.ShouldStop(4);
_filename = parent._lastfilename;Debug.locals.put("filename", _filename);
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 264;BA.debugLine="ShotFileName = filename";
Debug.ShouldStop(128);
parent._shotfilename = _filename;
 BA.debugLineNum = 265;BA.debugLine="Dim cmes As CameraSize = camEx.GetPictureSize";
Debug.ShouldStop(256);
_cmes = parent.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getpicturesize" /*RemoteObject*/ );Debug.locals.put("cmes", _cmes);Debug.locals.put("cmes", _cmes);
 BA.debugLineNum = 267;BA.debugLine="camEx.SavePictureToFile(Data, ShotFileLocation, S";
Debug.ShouldStop(1024);
parent.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_savepicturetofile" /*RemoteObject*/ ,(Object)(_data),(Object)(parent._shotfilelocation),(Object)(parent._shotfilename));
 BA.debugLineNum = 271;BA.debugLine="Dim FlipV As Boolean = Utils.Int2Bool(ShareCode.D";
Debug.ShouldStop(16384);
_flipv = parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_param_inverted_foto_device /*RemoteObject*/ ));Debug.locals.put("FlipV", _flipv);Debug.locals.put("FlipV", _flipv);
 BA.debugLineNum = 272;BA.debugLine="Dim FlipH As Boolean = Utils.Int2Bool(ShareCode.D";
Debug.ShouldStop(32768);
_fliph = parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_param_inverted_horiz_foto_device /*RemoteObject*/ ));Debug.locals.put("FlipH", _fliph);Debug.locals.put("FlipH", _fliph);
 BA.debugLineNum = 283;BA.debugLine="If (FlipV) Or (FlipV) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean(".",(_flipv)) || RemoteObject.solveBoolean(".",(_flipv))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 284;BA.debugLine="Dim flp As ResumableSub = FlipPicture(ShotFileLo";
Debug.ShouldStop(134217728);
_flp = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_flp = _flippicture(parent._shotfilelocation,parent._shotfilename,_flipv,_fliph);Debug.locals.put("flp", _flp);Debug.locals.put("flp", _flp);
 BA.debugLineNum = 285;BA.debugLine="Wait For(flp) Complete (RequestSuccessful As Boo";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", cameraactivity2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "campanel_picturetaken"), _flp);
this.state = 32;
return;
case 32:
//C
this.state = 12;
_requestsuccessful = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RequestSuccessful", _requestsuccessful);
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 292;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultFont(ShareC";
Debug.ShouldStop(8);
_fnt = parent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, parent.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 293;BA.debugLine="Dim cvsRect As B4XRect";
Debug.ShouldStop(16);
_cvsrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("cvsRect", _cvsrect);
 BA.debugLineNum = 294;BA.debugLine="Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, c";
Debug.ShouldStop(32);
_cvs = _createcanvas(_cmes.getField(true,"Width" /*RemoteObject*/ ),_cmes.getField(true,"Height" /*RemoteObject*/ ));Debug.locals.put("cvs", _cvs);Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 295;BA.debugLine="cvsRect.Initialize(0,0,cmes.Width, cmes.Height)";
Debug.ShouldStop(64);
_cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _cmes.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _cmes.getField(true,"Height" /*RemoteObject*/ ))));
 BA.debugLineNum = 296;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, S";
Debug.ShouldStop(128);
_cvs.runVoidMethod ("DrawBitmap",(Object)((parent._xui.runMethod(false,"LoadBitmap",(Object)(parent._shotfilelocation),(Object)(parent._shotfilename)).getObject())),(Object)(_cvsrect));
 BA.debugLineNum = 297;BA.debugLine="Dim lat As String = LocationService.GeoLocal.lat";
Debug.ShouldStop(256);
_lat = parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ );Debug.locals.put("lat", _lat);Debug.locals.put("lat", _lat);
 BA.debugLineNum = 298;BA.debugLine="Dim lon As String = LocationService.GeoLocal.lon";
Debug.ShouldStop(512);
_lon = parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ );Debug.locals.put("lon", _lon);Debug.locals.put("lon", _lon);
 BA.debugLineNum = 303;BA.debugLine="If LocationService.GeoLocal.lat=\"Null\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ ),BA.ObjectToString("Null"))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 304;BA.debugLine="ToastMessageShow(\"Falha na obtencão de coordenad";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Falha na obtencão de coordenadas GPS")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 305;BA.debugLine="Dim NewDateTimeName As String = $\"${DateTimeName";
Debug.ShouldStop(65536);
_newdatetimename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datetimename))),RemoteObject.createImmutable("  -  -/-")));Debug.locals.put("NewDateTimeName", _newdatetimename);Debug.locals.put("NewDateTimeName", _newdatetimename);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 307;BA.debugLine="Dim NewDateTimeName As String = $\"${DateTimeName";
Debug.ShouldStop(262144);
_newdatetimename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datetimename))),RemoteObject.createImmutable("  -  "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lat))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lon))),RemoteObject.createImmutable("")));Debug.locals.put("NewDateTimeName", _newdatetimename);Debug.locals.put("NewDateTimeName", _newdatetimename);
 if (true) break;
;
 BA.debugLineNum = 312;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"printcri";
Debug.ShouldStop(8388608);

case 18:
//if
this.state = 21;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("printcriativa")))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 313;BA.debugLine="Dim sSQL As String = $\"select ' - '||c.title_imp";
Debug.ShouldStop(16777216);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select ' - '||c.title_import||' - '||d.title_import as stampname\n"),RemoteObject.createImmutable("								from dta_requests as a\n"),RemoteObject.createImmutable("								LEFT JOIN dta_objects AS c ON (c.tagcode=a.entity_tagcode)\n"),RemoteObject.createImmutable("								LEFT JOIN dta_objects AS d ON (d.tagcode=a.object_tagcode)\n"),RemoteObject.createImmutable("								where a.tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._currentclaitem.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 318;BA.debugLine="Dim stamp As String = DBStructures.GetScriptColu";
Debug.ShouldStop(536870912);
_stamp = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(_ssql),(Object)(RemoteObject.createImmutable("stampname")));Debug.locals.put("stamp", _stamp);Debug.locals.put("stamp", _stamp);
 BA.debugLineNum = 319;BA.debugLine="NewDateTimeName = $\"${stamp}\"$";
Debug.ShouldStop(1073741824);
_newdatetimename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stamp))),RemoteObject.createImmutable("")));Debug.locals.put("NewDateTimeName", _newdatetimename);
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 324;BA.debugLine="Dim dRect As B4XRect";
Debug.ShouldStop(8);
_drect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("dRect", _drect);
 BA.debugLineNum = 328;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(128);
if (true) break;

case 22:
//if
this.state = 27;
if ((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 329;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCo";
Debug.ShouldStop(256);
_f = parent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ ,RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 330;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.";
Debug.ShouldStop(512);
_drect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(10)}, "-",1, 0))),(Object)(_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight")));
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 332;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCo";
Debug.ShouldStop(2048);
_f = parent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, parent.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 333;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.";
Debug.ShouldStop(4096);
_drect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(10)}, "-",1, 0))),(Object)(_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight")));
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 338;BA.debugLine="DrawTextWithBorder2(cvs, NewDateTimeName, f, Cons";
Debug.ShouldStop(131072);
_drawtextwithborder2(_cvs,_newdatetimename,_f,parent.mostCurrent._consts._colordarkgray /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getLeft"),_drect.runMethod(true,"getRight")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getTop"),_drect.runMethod(true,"getBottom")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 340;BA.debugLine="Log($\"${ShareCode.DEVICE_DEF_QUALITY}, ${ShareCod";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6125173854",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 342;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(2097152);
_cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 345;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(ShotFil";
Debug.ShouldStop(16777216);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent._shotfilelocation),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._shotfilename))),RemoteObject.createImmutable("")))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Out", _out);Debug.locals.put("Out", _out);
 BA.debugLineNum = 346;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
Debug.ShouldStop(33554432);
_cvs.runMethod(false,"CreateBitmap").runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(parent.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),parent.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 347;BA.debugLine="cvs.Release";
Debug.ShouldStop(67108864);
_cvs.runVoidMethod ("Release");
 BA.debugLineNum = 348;BA.debugLine="Out.Close";
Debug.ShouldStop(134217728);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 350;BA.debugLine="Dim bc1 As B4XBitmap =  xui.LoadBitmapResize(Shot";
Debug.ShouldStop(536870912);
_bc1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bc1 = parent._xui.runMethod(false,"LoadBitmapResize",(Object)(parent._shotfilelocation),(Object)(parent._shotfilename),(Object)(parent.mostCurrent._showpictureimage.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._showpictureimage.runMethod(true,"getHeight")),(Object)(parent.mostCurrent.__c.getField(true,"True")));Debug.locals.put("bc1", _bc1);Debug.locals.put("bc1", _bc1);
 BA.debugLineNum = 351;BA.debugLine="showPictureImage.SetBackgroundImage(bc1)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._showpictureimage.runVoidMethod ("SetBackgroundImageNew",(Object)((_bc1.getObject())));
 BA.debugLineNum = 352;BA.debugLine="ShowPreviewShot(True)";
Debug.ShouldStop(-2147483648);
_showpreviewshot(parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 356;BA.debugLine="Dim theFoto As ShotFoto = Types.MakeShotFoto(Shot";
Debug.ShouldStop(8);
_thefoto = parent.mostCurrent._types.runMethod(false,"_makeshotfoto" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(parent._shotfilename),(Object)(_datetimedb),(Object)(_lat),(Object)(_lon),(Object)(_newdatetimename));Debug.locals.put("theFoto", _thefoto);Debug.locals.put("theFoto", _thefoto);
 BA.debugLineNum = 358;BA.debugLine="CamShots.Add(theFoto)";
Debug.ShouldStop(32);
parent._camshots.runVoidMethod ("Add",(Object)((_thefoto)));
 BA.debugLineNum = 359;BA.debugLine="If StayOnCamera Then";
Debug.ShouldStop(64);
if (true) break;

case 28:
//if
this.state = 31;
if (parent._stayoncamera.<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 360;BA.debugLine="camEx.StartPreview 'restart preview";
Debug.ShouldStop(128);
parent.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 BA.debugLineNum = 361;BA.debugLine="Counter = Counter + 1";
Debug.ShouldStop(256);
parent._counter = RemoteObject.solve(new RemoteObject[] {parent._counter,RemoteObject.createImmutable(1)}, "+",1, 1);
 if (true) break;

case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 363;BA.debugLine="Sleep(500)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "campanel_picturetaken"),BA.numberCast(int.class, 500));
this.state = 33;
return;
case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 364;BA.debugLine="ShowPreviewShot(False)";
Debug.ShouldStop(2048);
_showpreviewshot(parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 365;BA.debugLine="End Sub";
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
public static RemoteObject  _campanel_ready(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("camPanel_Ready (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,119);
if (RapidSub.canDelegate("campanel_ready")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","campanel_ready", _success);}
RemoteObject _fm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
Debug.locals.put("Success", _success);
 BA.debugLineNum = 119;BA.debugLine="Sub camPanel_Ready (Success As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="If Success Then";
Debug.ShouldStop(8388608);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 121;BA.debugLine="camEx.SetJpegQuality(ShareCode.DEVICE_DEF_QUALIT";
Debug.ShouldStop(16777216);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setjpegquality" /*RemoteObject*/ ,(Object)(cameraactivity2.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ));
 BA.debugLineNum = 122;BA.debugLine="camEx.SetPictureSize(ShareCode.DEVICE_DEF_IMG_WI";
Debug.ShouldStop(33554432);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setpicturesize" /*RemoteObject*/ ,(Object)(cameraactivity2.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ),(Object)(cameraactivity2.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ));
 BA.debugLineNum = 123;BA.debugLine="camEx.SetContinuousAutoFocus";
Debug.ShouldStop(67108864);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setcontinuousautofocus" /*RemoteObject*/ );
 BA.debugLineNum = 124;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(134217728);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="camEx.StartPreview";
Debug.ShouldStop(268435456);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 BA.debugLineNum = 127;BA.debugLine="HasFocus = False";
Debug.ShouldStop(1073741824);
cameraactivity2._hasfocus = cameraactivity2.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 128;BA.debugLine="btnFocus.Enabled = False";
Debug.ShouldStop(-2147483648);
cameraactivity2.mostCurrent._btnfocus.runMethod(true,"setEnabled",cameraactivity2.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 129;BA.debugLine="Dim fm As List = camEx.GetSupportedFocusModes";
Debug.ShouldStop(1);
_fm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_fm = cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedfocusmodes" /*RemoteObject*/ );Debug.locals.put("fm", _fm);Debug.locals.put("fm", _fm);
 BA.debugLineNum = 130;BA.debugLine="For n=0 To fm.Size -1";
Debug.ShouldStop(2);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_fm.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step10 > 0 && _n <= limit10) || (step10 < 0 && _n >= limit10) ;_n = ((int)(0 + _n + step10))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 131;BA.debugLine="If fm.Get(n) = \"auto\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_fm.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))),RemoteObject.createImmutable(("auto")))) { 
 BA.debugLineNum = 132;BA.debugLine="HasFocus = True";
Debug.ShouldStop(8);
cameraactivity2._hasfocus = cameraactivity2.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 133;BA.debugLine="btnFocus.Enabled = True";
Debug.ShouldStop(16);
cameraactivity2.mostCurrent._btnfocus.runMethod(true,"setEnabled",cameraactivity2.mostCurrent.__c.getField(true,"True"));
 };
 }
}Debug.locals.put("n", _n);
;
 }else {
 BA.debugLineNum = 138;BA.debugLine="ToastMessageShow(\"Não é possível abrir a camera.";
Debug.ShouldStop(512);
cameraactivity2.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Não é possível abrir a camera.")),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("camZoom_ValueChanged (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,475);
if (RapidSub.canDelegate("camzoom_valuechanged")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","camzoom_valuechanged", _value, _userchanged);}
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 475;BA.debugLine="Sub camZoom_ValueChanged (Value As Int, UserChange";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="If UserChanged = False Or camEx.IsZoomSupported =";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_userchanged,cameraactivity2.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_iszoomsupported" /*RemoteObject*/ ),cameraactivity2.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 477;BA.debugLine="camEx.Zoom = Value / 100 * camEx.GetMaxZoom";
Debug.ShouldStop(268435456);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setzoom" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100),cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getmaxzoom" /*RemoteObject*/ )}, "/*",0, 0)));
 BA.debugLineNum = 478;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(536870912);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 479;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("ChangeCamera_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,434);
if (RapidSub.canDelegate("changecamera_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","changecamera_click");}
 BA.debugLineNum = 434;BA.debugLine="Sub ChangeCamera_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 435;BA.debugLine="If Starter.Params.CFG_ALLOW_FRONT_CAMERA = 1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",cameraactivity2.mostCurrent._starter._params /*RemoteObject*/ .getField(true,"_cfg_allow_front_camera" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 436;BA.debugLine="camEx.Release";
Debug.ShouldStop(524288);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 437;BA.debugLine="frontCamera = Not(frontCamera)";
Debug.ShouldStop(1048576);
cameraactivity2._frontcamera = cameraactivity2.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity2._frontcamera));
 BA.debugLineNum = 438;BA.debugLine="InitializeCamera";
Debug.ShouldStop(2097152);
_initializecamera();
 }else {
 BA.debugLineNum = 440;BA.debugLine="ToastMessageShow(\"Apenas a camera traseira está";
Debug.ShouldStop(8388608);
cameraactivity2.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Apenas a camera traseira está activa.")),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("CloseActivity (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,491);
if (RapidSub.canDelegate("closeactivity")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","closeactivity");}
 BA.debugLineNum = 491;BA.debugLine="Public Sub CloseActivity";
Debug.ShouldStop(1024);
 BA.debugLineNum = 492;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
cameraactivity2.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("CreateCanvas (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,192);
if (RapidSub.canDelegate("createcanvas")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","createcanvas", _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 192;BA.debugLine="Private Sub CreateCanvas(width As Int, height As I";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = cameraactivity2._xui.runMethod(false,"CreatePanel",cameraactivity2.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 194;BA.debugLine="If width <= 0 Then width = 1";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("k",_width,BA.numberCast(double.class, 0))) { 
_width = BA.numberCast(int.class, 1);Debug.locals.put("width", _width);};
 BA.debugLineNum = 195;BA.debugLine="If height <=0 Then height = 1";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("k",_height,BA.numberCast(double.class, 0))) { 
_height = BA.numberCast(int.class, 1);Debug.locals.put("height", _height);};
 BA.debugLineNum = 196;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, height)";
Debug.ShouldStop(8);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 197;BA.debugLine="Dim cvs As B4XCanvas";
Debug.ShouldStop(16);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 198;BA.debugLine="cvs.Initialize(p)";
Debug.ShouldStop(32);
_cvs.runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 199;BA.debugLine="Return cvs";
Debug.ShouldStop(64);
if (true) return _cvs;
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("CreateFileProviderUri (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,481);
if (RapidSub.canDelegate("createfileprovideruri")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","createfileprovideruri", _dir, _filename);}
RemoteObject _fileprovider1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 481;BA.debugLine="Sub CreateFileProviderUri (Dir As String, FileName";
Debug.ShouldStop(1);
 BA.debugLineNum = 482;BA.debugLine="Dim FileProvider1 As JavaObject";
Debug.ShouldStop(2);
_fileprovider1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("FileProvider1", _fileprovider1);
 BA.debugLineNum = 483;BA.debugLine="Dim context As JavaObject";
Debug.ShouldStop(4);
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 484;BA.debugLine="context.InitializeContext";
Debug.ShouldStop(8);
_context.runVoidMethod ("InitializeContext",cameraactivity2.processBA);
 BA.debugLineNum = 485;BA.debugLine="FileProvider1.InitializeStatic(\"android.support.v";
Debug.ShouldStop(16);
_fileprovider1.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("androidx.core.content.FileProvider")));
 BA.debugLineNum = 486;BA.debugLine="Dim f As JavaObject";
Debug.ShouldStop(32);
_f = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("f", _f);
 BA.debugLineNum = 487;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Dir";
Debug.ShouldStop(64);
_f.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_dir),(_filename)})));
 BA.debugLineNum = 488;BA.debugLine="Return FileProvider1.RunMethod(\"getUriForFile\", A";
Debug.ShouldStop(128);
if (true) return _fileprovider1.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUriForFile")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_context.getObject()),(RemoteObject.concat(cameraactivity2.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".provider"))),(_f.getObject())})));
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("DrawTextWithBorder (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,374);
if (RapidSub.canDelegate("drawtextwithborder")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","drawtextwithborder", _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
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
 BA.debugLineNum = 374;BA.debugLine="Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 376;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(8388608);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 377;BA.debugLine="Dim baseline As Int = CenterY - r.Height / 2 - r.";
Debug.ShouldStop(16777216);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 378;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(33554432);
_cvs1.runVoidMethod ("DrawText",cameraactivity2.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 381;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(268435456);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 382;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 383;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(1073741824);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 385;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 386;BA.debugLine="cvs1.DrawRect(r, Clr, False, border)";
Debug.ShouldStop(2);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(_clr),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 388;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("DrawTextWithBorder2 (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,390);
if (RapidSub.canDelegate("drawtextwithborder2")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","drawtextwithborder2", _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
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
 BA.debugLineNum = 390;BA.debugLine="Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text A";
Debug.ShouldStop(32);
 BA.debugLineNum = 392;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(128);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 393;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
Debug.ShouldStop(256);
_r.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),cameraactivity2.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 394;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
Debug.ShouldStop(512);
_r.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),cameraactivity2.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 396;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
Debug.ShouldStop(2048);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),_fnt.runMethod(true,"getSize")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),_r.runMethod(true,"getTop")}, "--",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 398;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(8192);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 399;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 400;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(32768);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 402;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 403;BA.debugLine="Dim ro As B4XRect";
Debug.ShouldStop(262144);
_ro = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("ro", _ro);
 BA.debugLineNum = 404;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
Debug.ShouldStop(524288);
_ro.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getLeft"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getRight"),_border}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getBottom"),_border}, "+",1, 0))));
 BA.debugLineNum = 405;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
Debug.ShouldStop(1048576);
_cvs1.runVoidMethod ("DrawRect",(Object)(_ro),(Object)(_clr),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 BA.debugLineNum = 406;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
Debug.ShouldStop(2097152);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(cameraactivity2.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 409;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(16777216);
_cvs1.runVoidMethod ("DrawText",cameraactivity2.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("DrawTextWithBorder2Phone (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,412);
if (RapidSub.canDelegate("drawtextwithborder2phone")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","drawtextwithborder2phone", _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
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
 BA.debugLineNum = 412;BA.debugLine="Sub DrawTextWithBorder2Phone (cvs1 As B4XCanvas, T";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 414;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(536870912);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 415;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
Debug.ShouldStop(1073741824);
_r.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),cameraactivity2.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 416;BA.debugLine="r.Width = r.Width + (r.Width /2) + 50dip ' * 2";
Debug.ShouldStop(-2147483648);
_r.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),cameraactivity2.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "++",2, 0)));
 BA.debugLineNum = 418;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
Debug.ShouldStop(2);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),_fnt.runMethod(true,"getSize")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),_r.runMethod(true,"getTop")}, "--",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 420;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(8);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 421;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 422;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(32);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 424;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 425;BA.debugLine="Dim ro As B4XRect";
Debug.ShouldStop(256);
_ro = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("ro", _ro);
 BA.debugLineNum = 426;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
Debug.ShouldStop(512);
_ro.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getLeft"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getRight"),_border}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getBottom"),_border}, "+",1, 0))));
 BA.debugLineNum = 427;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
Debug.ShouldStop(1024);
_cvs1.runVoidMethod ("DrawRect",(Object)(_ro),(Object)(_clr),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 BA.debugLineNum = 428;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
Debug.ShouldStop(2048);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(cameraactivity2.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 431;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(16384);
_cvs1.runVoidMethod ("DrawText",cameraactivity2.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("LEFT"))));
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _flippicture(RemoteObject _imglocation,RemoteObject _imgfilename,RemoteObject _flipvert,RemoteObject _fliphoriz) throws Exception{
try {
		Debug.PushSubsStack("FlipPicture (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,223);
if (RapidSub.canDelegate("flippicture")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","flippicture", _imglocation, _imgfilename, _flipvert, _fliphoriz);}
ResumableSub_FlipPicture rsub = new ResumableSub_FlipPicture(null,_imglocation,_imgfilename,_flipvert,_fliphoriz);
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
public static class ResumableSub_FlipPicture extends BA.ResumableSub {
public ResumableSub_FlipPicture(xevolution.vrcg.devdemov2400.cameraactivity2 parent,RemoteObject _imglocation,RemoteObject _imgfilename,RemoteObject _flipvert,RemoteObject _fliphoriz) {
this.parent = parent;
this._imglocation = _imglocation;
this._imgfilename = _imgfilename;
this._flipvert = _flipvert;
this._fliphoriz = _fliphoriz;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
RemoteObject _imglocation;
RemoteObject _imgfilename;
RemoteObject _flipvert;
RemoteObject _fliphoriz;
RemoteObject _bitmapin = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _canvasout = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _destrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FlipPicture (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,223);
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
Debug.locals.put("ImgLocation", _imglocation);
Debug.locals.put("ImgFilename", _imgfilename);
Debug.locals.put("FlipVert", _flipvert);
Debug.locals.put("FlipHoriz", _fliphoriz);
 BA.debugLineNum = 225;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 226;BA.debugLine="Dim BitmapIn As Bitmap = LoadBitmap(ImgLocation,";
Debug.ShouldStop(2);
_bitmapin = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bitmapin = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(_imglocation),(Object)(_imgfilename));Debug.locals.put("BitmapIn", _bitmapin);Debug.locals.put("BitmapIn", _bitmapin);
 BA.debugLineNum = 227;BA.debugLine="Dim CanvasOut As Canvas";
Debug.ShouldStop(4);
_canvasout = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("CanvasOut", _canvasout);
 BA.debugLineNum = 228;BA.debugLine="Dim DestRect As Rect";
Debug.ShouldStop(8);
_destrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("DestRect", _destrect);
 BA.debugLineNum = 229;BA.debugLine="DestRect.Initialize(0,0,BitmapIn.Width,BitmapIn.";
Debug.ShouldStop(16);
_destrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_bitmapin.runMethod(true,"getWidth")),(Object)(_bitmapin.runMethod(true,"getHeight")));
 BA.debugLineNum = 230;BA.debugLine="CanvasOut.Initialize(Activity)";
Debug.ShouldStop(32);
_canvasout.runVoidMethod ("Initialize",(Object)((parent.mostCurrent._activity.getObject())));
 BA.debugLineNum = 231;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(64);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 233;BA.debugLine="CanvasOut.DrawBitmapFlipped(BitmapIn, Null, Dest";
Debug.ShouldStop(256);
_canvasout.runVoidMethod ("DrawBitmapFlipped",(Object)((_bitmapin.getObject())),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)((_destrect.getObject())),(Object)(_flipvert),(Object)(_fliphoriz));
 BA.debugLineNum = 235;BA.debugLine="out = File.OpenOutput(ImgLocation, ImgFilename,";
Debug.ShouldStop(1024);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_imglocation),(Object)(_imgfilename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 236;BA.debugLine="CanvasOut.Bitmap.WriteToStream(out, 100, \"PNG\")";
Debug.ShouldStop(2048);
_canvasout.runMethod(false,"getBitmap").runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("PNG"))));
 BA.debugLineNum = 237;BA.debugLine="out.Close";
Debug.ShouldStop(4096);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 238;BA.debugLine="Return True";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 240;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6125108241",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",cameraactivity2.mostCurrent.activityBA)),0);
 BA.debugLineNum = 241;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity2.processBA, e0.toString());}
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
public static RemoteObject  _getcamsize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("getCamsize (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,184);
if (RapidSub.canDelegate("getcamsize")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","getcamsize", _width, _height);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 184;BA.debugLine="Sub getCamsize(Width As Int, Height As Int) As Cam";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Dim ret As CameraSize";
Debug.ShouldStop(16777216);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 186;BA.debugLine="ret.initialize";
Debug.ShouldStop(33554432);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="ret.Width = Width";
Debug.ShouldStop(67108864);
_ret.setField ("Width" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 188;BA.debugLine="ret.Height = Height";
Debug.ShouldStop(134217728);
_ret.setField ("Height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 189;BA.debugLine="Return ret";
Debug.ShouldStop(268435456);
if (true) return _ret;
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
cameraactivity2.mostCurrent._campanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private camEx As CameraExClass";
cameraactivity2.mostCurrent._camex = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass");
 //BA.debugLineNum = 25;BA.debugLine="Private butCloseCamera As Button";
cameraactivity2.mostCurrent._butclosecamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private showPicturePanel As Panel";
cameraactivity2.mostCurrent._showpicturepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private showPictureImage As ImageView";
cameraactivity2.mostCurrent._showpictureimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ShowPictureClose As Button";
cameraactivity2.mostCurrent._showpictureclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private CurrentCLAItem As RequestCLAItem";
cameraactivity2.mostCurrent._currentclaitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");
 //BA.debugLineNum = 31;BA.debugLine="Private CurrentFileName As String = \"\"";
cameraactivity2.mostCurrent._currentfilename = BA.ObjectToString("");
 //BA.debugLineNum = 32;BA.debugLine="Private ReturnToName As String = \"requests3\"";
cameraactivity2.mostCurrent._returntoname = BA.ObjectToString("requests3");
 //BA.debugLineNum = 33;BA.debugLine="Private LastOrigin As Int = 0";
cameraactivity2._lastorigin = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 35;BA.debugLine="Private ExitToDialog As Boolean = False";
cameraactivity2._exittodialog = cameraactivity2.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 36;BA.debugLine="Private butCancelPicture As Button";
cameraactivity2.mostCurrent._butcancelpicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private butSavePicture As Button";
cameraactivity2.mostCurrent._butsavepicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btnTakePicture As Button";
cameraactivity2.mostCurrent._btntakepicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private btnFocus As Button";
cameraactivity2.mostCurrent._btnfocus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imagetobytes(RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("ImageToBytes (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,202);
if (RapidSub.canDelegate("imagetobytes")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","imagetobytes", _image);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 202;BA.debugLine="Public Sub ImageToBytes(Image As B4XBitmap) As Byt";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(1024);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 204;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(2048);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 205;BA.debugLine="Image.WriteToStream(out, ShareCode.DEVICE_DEF_QUA";
Debug.ShouldStop(4096);
_image.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(cameraactivity2.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),cameraactivity2.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 206;BA.debugLine="out.Close";
Debug.ShouldStop(8192);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 207;BA.debugLine="Return out.ToBytesArray";
Debug.ShouldStop(16384);
if (true) return _out.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("InitializeCamera (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,98);
if (RapidSub.canDelegate("initializecamera")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","initializecamera");}
 BA.debugLineNum = 98;BA.debugLine="Private Sub InitializeCamera";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 100;BA.debugLine="If (Starter.APP_CAMERA_ACCESS) Then";
Debug.ShouldStop(8);
if ((cameraactivity2.mostCurrent._starter._app_camera_access /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 101;BA.debugLine="camEx.Initialize(camPanel, frontCamera, Me, \"ca";
Debug.ShouldStop(16);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_initialize" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(cameraactivity2.mostCurrent._campanel),(Object)(cameraactivity2._frontcamera),(Object)(cameraactivity2.getObject()),(Object)(RemoteObject.createImmutable("camPanel")));
 BA.debugLineNum = 102;BA.debugLine="frontCamera = camEx.Front";
Debug.ShouldStop(32);
cameraactivity2._frontcamera = cameraactivity2.mostCurrent._camex.getField(true,"_front" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 104;BA.debugLine="ToastMessageShow(\"Sem Permissão!!!\", True)";
Debug.ShouldStop(128);
cameraactivity2.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Sem Permissão!!!")),(Object)(cameraactivity2.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",cameraactivity2.processBA, e9.toString()); BA.debugLineNum = 107;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(1024);
cameraactivity2.mostCurrent.__c.runVoidMethod ("LogImpl","6124518409",cameraactivity2.mostCurrent.__c.runMethod(false,"LastException",cameraactivity2.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
cameraactivity2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 9;BA.debugLine="Public StayOnCamera As Boolean = True";
cameraactivity2._stayoncamera = cameraactivity2.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 10;BA.debugLine="Public ShotFileLocation As String = File.DirInter";
cameraactivity2._shotfilelocation = cameraactivity2.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 //BA.debugLineNum = 11;BA.debugLine="Public ShotFileName As String = \"\"";
cameraactivity2._shotfilename = BA.ObjectToString("");
 //BA.debugLineNum = 12;BA.debugLine="Private frontCamera As Boolean = False";
cameraactivity2._frontcamera = cameraactivity2.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 13;BA.debugLine="Private Counter As Int = 1";
cameraactivity2._counter = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 14;BA.debugLine="Private LastFileName As String = \"\"";
cameraactivity2._lastfilename = BA.ObjectToString("");
 //BA.debugLineNum = 15;BA.debugLine="Private CamShots As List";
cameraactivity2._camshots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Private ReturnTo As Object";
cameraactivity2._returnto = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 17;BA.debugLine="Public Device As Phone";
cameraactivity2._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 18;BA.debugLine="Public Orientation As PhoneOrientation";
cameraactivity2._orientation = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneOrientation");
 //BA.debugLineNum = 19;BA.debugLine="Public HasFocus As Boolean = False";
cameraactivity2._hasfocus = cameraactivity2.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setminimumsize() throws Exception{
try {
		Debug.PushSubsStack("SetMinimumSize (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,143);
if (RapidSub.canDelegate("setminimumsize")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","setminimumsize");}
RemoteObject _mincs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
RemoteObject _cs = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");
 BA.debugLineNum = 143;BA.debugLine="Private Sub SetMinimumSize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Dim minCS As CameraSize";
Debug.ShouldStop(32768);
_mincs = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.cameraexclass._camerasize");Debug.locals.put("minCS", _mincs);
 BA.debugLineNum = 145;BA.debugLine="For Each cs As CameraSize In camEx.GetSupportedPi";
Debug.ShouldStop(65536);
{
final RemoteObject group2 = cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_getsupportedpicturessizes" /*RemoteObject*/ );
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_cs = group2.getArrayElement(false, /*RemoteObject*/ RemoteObject.createImmutable(index2));Debug.locals.put("cs", _cs);
Debug.locals.put("cs", _cs);
 BA.debugLineNum = 146;BA.debugLine="If minCS.Width = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_mincs.getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 147;BA.debugLine="minCS = cs";
Debug.ShouldStop(262144);
_mincs = _cs;Debug.locals.put("minCS", _mincs);
 }else {
 BA.debugLineNum = 149;BA.debugLine="If Power(minCS.Width, 2) + Power(minCS.Height,";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {cameraactivity2.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _mincs.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2))),cameraactivity2.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _mincs.getField(true,"Height" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {cameraactivity2.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _cs.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2))),cameraactivity2.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, _cs.getField(true,"Height" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))) { 
 BA.debugLineNum = 150;BA.debugLine="minCS = cs";
Debug.ShouldStop(2097152);
_mincs = _cs;Debug.locals.put("minCS", _mincs);
 };
 };
 }
}Debug.locals.put("cs", _cs);
;
 BA.debugLineNum = 154;BA.debugLine="camEx.SetPictureSize(minCS.Width, minCS.Height)";
Debug.ShouldStop(33554432);
cameraactivity2.mostCurrent._camex.runClassMethod (xevolution.vrcg.devdemov2400.cameraexclass.class, "_setpicturesize" /*RemoteObject*/ ,(Object)(_mincs.getField(true,"Width" /*RemoteObject*/ )),(Object)(_mincs.getField(true,"Height" /*RemoteObject*/ )));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("ShowPictureClose_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,900);
if (RapidSub.canDelegate("showpictureclose_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","showpictureclose_click");}
 BA.debugLineNum = 900;BA.debugLine="Sub ShowPictureClose_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 901;BA.debugLine="showPicturePanel.Visible = False";
Debug.ShouldStop(16);
cameraactivity2.mostCurrent._showpicturepanel.runMethod(true,"setVisible",cameraactivity2.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 902;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("showPictureImage_Click (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,935);
if (RapidSub.canDelegate("showpictureimage_click")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","showpictureimage_click");}
 BA.debugLineNum = 935;BA.debugLine="Sub showPictureImage_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 938;BA.debugLine="LastOrigin = CurrentCLAItem.Origin";
Debug.ShouldStop(512);
cameraactivity2._lastorigin = cameraactivity2.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ );
 BA.debugLineNum = 939;BA.debugLine="CurrentCLAItem.Origin = 4";
Debug.ShouldStop(1024);
cameraactivity2.mostCurrent._currentclaitem.setField ("Origin" /*RemoteObject*/ ,BA.numberCast(int.class, 4));
 BA.debugLineNum = 940;BA.debugLine="CurrentFileName = ShotFileName";
Debug.ShouldStop(2048);
cameraactivity2.mostCurrent._currentfilename = cameraactivity2._shotfilename;
 BA.debugLineNum = 942;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpreviewshot(RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("ShowPreviewShot (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,367);
if (RapidSub.canDelegate("showpreviewshot")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","showpreviewshot", _state);}
Debug.locals.put("state", _state);
 BA.debugLineNum = 367;BA.debugLine="Sub ShowPreviewShot(state As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 368;BA.debugLine="showPicturePanel.Visible = state";
Debug.ShouldStop(32768);
cameraactivity2.mostCurrent._showpicturepanel.runMethod(true,"setVisible",_state);
 BA.debugLineNum = 369;BA.debugLine="butCloseCamera.Enabled = Not(showPicturePanel.Vis";
Debug.ShouldStop(65536);
cameraactivity2.mostCurrent._butclosecamera.runMethod(true,"setEnabled",cameraactivity2.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity2.mostCurrent._showpicturepanel.runMethod(true,"getVisible"))));
 BA.debugLineNum = 370;BA.debugLine="btnTakePicture.Enabled = Not(showPicturePanel.Vis";
Debug.ShouldStop(131072);
cameraactivity2.mostCurrent._btntakepicture.runMethod(true,"setEnabled",cameraactivity2.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity2.mostCurrent._showpicturepanel.runMethod(true,"getVisible"))));
 BA.debugLineNum = 371;BA.debugLine="butSavePicture.Enabled = Not(showPicturePanel.Vis";
Debug.ShouldStop(262144);
cameraactivity2.mostCurrent._butsavepicture.runMethod(true,"setEnabled",cameraactivity2.mostCurrent.__c.runMethod(true,"Not",(Object)(cameraactivity2.mostCurrent._showpicturepanel.runMethod(true,"getVisible"))));
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("StartCamera (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,54);
if (RapidSub.canDelegate("startcamera")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","startcamera", _returntoactivity);}
Debug.locals.put("ReturnToActivity", _returntoactivity);
 BA.debugLineNum = 54;BA.debugLine="Public Sub StartCamera(ReturnToActivity As Object)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="ReturnTo = ReturnToActivity";
Debug.ShouldStop(4194304);
cameraactivity2._returnto = _returntoactivity;
 BA.debugLineNum = 56;BA.debugLine="CurrentCLAItem = Types.MakeRequestCLAItem(\"__DUMM";
Debug.ShouldStop(8388608);
cameraactivity2.mostCurrent._currentclaitem = cameraactivity2.mostCurrent._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(cameraactivity2.mostCurrent._utils.runMethod(true,"_udid" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA)),(Object)(BA.ObjectToString("__DUMMY__")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(cameraactivity2.mostCurrent._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,cameraactivity2.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 60;BA.debugLine="InitializeCamera";
Debug.ShouldStop(134217728);
_initializecamera();
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("StartCamera2 (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,63);
if (RapidSub.canDelegate("startcamera2")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","startcamera2", _returntoactivity, _claitem);}
Debug.locals.put("ReturnToActivity", _returntoactivity);
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 63;BA.debugLine="Public Sub StartCamera2(ReturnToActivity As Object";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="ReturnTo = ReturnToActivity";
Debug.ShouldStop(-2147483648);
cameraactivity2._returnto = _returntoactivity;
 BA.debugLineNum = 65;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(1);
cameraactivity2.mostCurrent._currentclaitem = _claitem;
 BA.debugLineNum = 66;BA.debugLine="ExitToDialog = True";
Debug.ShouldStop(2);
cameraactivity2._exittodialog = cameraactivity2.mostCurrent.__c.getField(true,"True");
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
public static void  _startcamera3(RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("StartCamera3 (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,70);
if (RapidSub.canDelegate("startcamera3")) { xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","startcamera3", _claitem); return;}
ResumableSub_StartCamera3 rsub = new ResumableSub_StartCamera3(null,_claitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartCamera3 extends BA.ResumableSub {
public ResumableSub_StartCamera3(xevolution.vrcg.devdemov2400.cameraactivity2 parent,RemoteObject _claitem) {
this.parent = parent;
this._claitem = _claitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
RemoteObject _claitem;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartCamera3 (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,70);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 71;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(64);
parent.mostCurrent._currentclaitem = _claitem;
 BA.debugLineNum = 72;BA.debugLine="ExitToDialog = True";
Debug.ShouldStop(128);
parent._exittodialog = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 73;BA.debugLine="ReturnToName = \"checklist3\"";
Debug.ShouldStop(256);
parent.mostCurrent._returntoname = BA.ObjectToString("checklist3");
 BA.debugLineNum = 74;BA.debugLine="Sleep(250)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "startcamera3"),BA.numberCast(int.class, 250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="InitializeCamera";
Debug.ShouldStop(1024);
_initializecamera();
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static RemoteObject  _uploadfileswithftp(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTP (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,864);
if (RapidSub.canDelegate("uploadfileswithftp")) { return xevolution.vrcg.devdemov2400.cameraactivity2.remoteMe.runUserSub(false, "cameraactivity2","uploadfileswithftp", _filename);}
ResumableSub_UploadFilesWithFTP rsub = new ResumableSub_UploadFilesWithFTP(null,_filename);
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
public static class ResumableSub_UploadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTP(xevolution.vrcg.devdemov2400.cameraactivity2 parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
RemoteObject _filename;
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadFilesWithFTP (cameraactivity2) ","cameraactivity2",27,cameraactivity2.mostCurrent.activityBA,cameraactivity2.mostCurrent,864);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 865;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(1);
_ret = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 866;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(2);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 867;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(4);
_myftp.runVoidMethod ("Initialize",cameraactivity2.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 868;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(8);
_myftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 872;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(128);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 873;BA.debugLine="Log(filename)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126156809",_filename,0);
 BA.debugLineNum = 874;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
Debug.ShouldStop(512);
_sf = _myftp.runMethod(false,"UploadFile",cameraactivity2.processBA,(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_filename)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 875;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", cameraactivity2.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "uploadfileswithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 876;BA.debugLine="If Success Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 877;BA.debugLine="Log(\"file was uploaded successfully\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126156813",RemoteObject.createImmutable("file was uploaded successfully"),0);
 BA.debugLineNum = 878;BA.debugLine="ret = True";
Debug.ShouldStop(8192);
_ret = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 880;BA.debugLine="Log(\"Error uploading file\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126156816",RemoteObject.createImmutable("Error uploading file"),0);
 BA.debugLineNum = 881;BA.debugLine="ret = False";
Debug.ShouldStop(65536);
_ret = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 883;BA.debugLine="myFTP.Close";
Debug.ShouldStop(262144);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 884;BA.debugLine="Sleep(250)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Sleep",cameraactivity2.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cameraactivity2", "uploadfileswithftp"),BA.numberCast(int.class, 250));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 886;BA.debugLine="Log(\"UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126156822",RemoteObject.createImmutable("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU"),0);
 BA.debugLineNum = 887;BA.debugLine="Log(\"upload\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126156823",RemoteObject.createImmutable("upload"),0);
 BA.debugLineNum = 888;BA.debugLine="Log(\"UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6126156824",RemoteObject.createImmutable("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU"),0);
 BA.debugLineNum = 889;BA.debugLine="Return ret";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ret));return;};
 BA.debugLineNum = 890;BA.debugLine="End Sub";
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
public static void  _ftp_uploadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
}