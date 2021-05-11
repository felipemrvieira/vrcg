package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class imageedit_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,157);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 157;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 159;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(1073741824);
if ((imageedit.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 160;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(-2147483648);
imageedit._device.runVoidMethod ("SetScreenOrientation",imageedit.processBA,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 162;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(2);
imageedit._device.runVoidMethod ("SetScreenOrientation",imageedit.processBA,(Object)(imageedit.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 };
 BA.debugLineNum = 164;BA.debugLine="InnerCamShots.Initialize '.Add(ShotFileName)";
Debug.ShouldStop(8);
imageedit.mostCurrent._innercamshots.runVoidMethod ("Initialize");
 BA.debugLineNum = 165;BA.debugLine="CurrentCLAItem = Types.MakeRequestCLAItem(\"__REPO";
Debug.ShouldStop(16);
imageedit.mostCurrent._currentclaitem = imageedit.mostCurrent._types.runMethod(false,"_makerequestclaitem" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("__REPO__")),(Object)(BA.ObjectToString("__REPO__")),(Object)(BA.ObjectToString("__REPO__")),(Object)(BA.ObjectToString("__REPO__")),(Object)(BA.ObjectToString("__REPO__")),(Object)(BA.ObjectToString("__REPO__")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(imageedit.mostCurrent._dbstructures.runMethod(false,"_db2clataskitem" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("")));
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,179);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 179;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, imageedit.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 181;BA.debugLine="butClose_Click";
Debug.ShouldStop(1048576);
_butclose_click();
 };
 BA.debugLineNum = 183;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Pause (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,174);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 174;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,170);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","activity_resume");}
 BA.debugLineNum = 170;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bcbarcode_click() throws Exception{
try {
		Debug.PushSubsStack("BCBarcode_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1138);
if (RapidSub.canDelegate("bcbarcode_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","bcbarcode_click");}
 BA.debugLineNum = 1138;BA.debugLine="Sub BCBarcode_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1139;BA.debugLine="ButtonBCStates";
Debug.ShouldStop(262144);
_buttonbcstates();
 BA.debugLineNum = 1140;BA.debugLine="BCBarcode.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(524288);
imageedit.mostCurrent._bcbarcode.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1141;BA.debugLine="bb_Barcode = True";
Debug.ShouldStop(1048576);
imageedit._bb_barcode = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1142;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bcqrcode_click() throws Exception{
try {
		Debug.PushSubsStack("BCQRCode_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1132);
if (RapidSub.canDelegate("bcqrcode_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","bcqrcode_click");}
 BA.debugLineNum = 1132;BA.debugLine="Sub BCQRCode_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1133;BA.debugLine="ButtonBCStates";
Debug.ShouldStop(4096);
_buttonbcstates();
 BA.debugLineNum = 1134;BA.debugLine="BCQRCode.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(8192);
imageedit.mostCurrent._bcqrcode.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1135;BA.debugLine="bb_BCQRCode = True";
Debug.ShouldStop(16384);
imageedit._bb_bcqrcode = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1136;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bcstamp_click() throws Exception{
try {
		Debug.PushSubsStack("BCStamp_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1126);
if (RapidSub.canDelegate("bcstamp_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","bcstamp_click");}
 BA.debugLineNum = 1126;BA.debugLine="Sub BCStamp_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 1127;BA.debugLine="ButtonBCStates";
Debug.ShouldStop(64);
_buttonbcstates();
 BA.debugLineNum = 1128;BA.debugLine="BCStamp.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(128);
imageedit.mostCurrent._bcstamp.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1129;BA.debugLine="bb_BCStamp = True";
Debug.ShouldStop(256);
imageedit._bb_bcstamp = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1130;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bmrcreate(RemoteObject _bmp,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("BMRCreate (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,209);
if (RapidSub.canDelegate("bmrcreate")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","bmrcreate", _bmp, _r);}
RemoteObject _b = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._bmr");
Debug.locals.put("bmp", _bmp);
Debug.locals.put("r", _r);
 BA.debugLineNum = 209;BA.debugLine="Sub BMRCreate(bmp As B4XBitmap, r As B4XRect) As B";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim b As BMR";
Debug.ShouldStop(131072);
_b = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._bmr");Debug.locals.put("b", _b);
 BA.debugLineNum = 211;BA.debugLine="b.Initialize";
Debug.ShouldStop(262144);
_b.runVoidMethod ("Initialize");
 BA.debugLineNum = 212;BA.debugLine="b.btm = bmp";
Debug.ShouldStop(524288);
_b.setField ("btm" /*RemoteObject*/ ,_bmp);
 BA.debugLineNum = 213;BA.debugLine="b.rct = RReferCreate( r )";
Debug.ShouldStop(1048576);
_b.setField ("rct" /*RemoteObject*/ ,_rrefercreate(_r));
 BA.debugLineNum = 214;BA.debugLine="Return b";
Debug.ShouldStop(2097152);
if (true) return _b;
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butacceptcrop_click() throws Exception{
try {
		Debug.PushSubsStack("butAcceptCrop_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1393);
if (RapidSub.canDelegate("butacceptcrop_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butacceptcrop_click");}
 BA.debugLineNum = 1393;BA.debugLine="Sub butAcceptCrop_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1394;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1395;BA.debugLine="TryToCrop";
Debug.ShouldStop(262144);
_trytocrop();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",imageedit.processBA, e4.toString()); BA.debugLineNum = 1397;BA.debugLine="MsgboxAsync(\"Não foi possível efectuar o CROP! T";
Debug.ShouldStop(1048576);
imageedit.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Não foi possível efectuar o CROP! Tente novamente sff.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta!"))),imageedit.processBA);
 };
 BA.debugLineNum = 1399;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butactions_click() throws Exception{
try {
		Debug.PushSubsStack("butActions_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1110);
if (RapidSub.canDelegate("butactions_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butactions_click");}
 BA.debugLineNum = 1110;BA.debugLine="Sub butActions_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1111;BA.debugLine="If ActionsPanel.Visible = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",imageedit.mostCurrent._actionspanel.runMethod(true,"getVisible"),imageedit.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1112;BA.debugLine="ActionsPanel.Visible = False";
Debug.ShouldStop(8388608);
imageedit.mostCurrent._actionspanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 1114;BA.debugLine="ActionsPanel.Visible = True";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._actionspanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1116;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butbarcode_click() throws Exception{
try {
		Debug.PushSubsStack("butBarcode_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,913);
if (RapidSub.canDelegate("butbarcode_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butbarcode_click");}
 BA.debugLineNum = 913;BA.debugLine="Sub butBarcode_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 914;BA.debugLine="ButtonStates";
Debug.ShouldStop(131072);
_buttonstates();
 BA.debugLineNum = 916;BA.debugLine="bBarcode = setButtonState(butBarcode)";
Debug.ShouldStop(524288);
imageedit._bbarcode = _setbuttonstate(imageedit.mostCurrent._butbarcode);
 BA.debugLineNum = 917;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(1048576);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 918;BA.debugLine="BarCodePanel.Visible = True";
Debug.ShouldStop(2097152);
imageedit.mostCurrent._barcodepanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 919;BA.debugLine="BCBarcode_Click";
Debug.ShouldStop(4194304);
_bcbarcode_click();
 BA.debugLineNum = 920;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcamera_click() throws Exception{
try {
		Debug.PushSubsStack("butCamera_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,844);
if (RapidSub.canDelegate("butcamera_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butcamera_click");}
 BA.debugLineNum = 844;BA.debugLine="Sub butCamera_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 845;BA.debugLine="ButtonStates";
Debug.ShouldStop(4096);
_buttonstates();
 BA.debugLineNum = 847;BA.debugLine="bCamera = setButtonState(butCamera)";
Debug.ShouldStop(16384);
imageedit._bcamera = _setbuttonstate(imageedit.mostCurrent._butcamera);
 BA.debugLineNum = 848;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(32768);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 858;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcircle_click() throws Exception{
try {
		Debug.PushSubsStack("butCircle_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,896);
if (RapidSub.canDelegate("butcircle_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butcircle_click");}
 BA.debugLineNum = 896;BA.debugLine="Sub butCircle_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 897;BA.debugLine="ButtonStates";
Debug.ShouldStop(1);
_buttonstates();
 BA.debugLineNum = 899;BA.debugLine="bCircle = setButtonState(butCircle)";
Debug.ShouldStop(4);
imageedit._bcircle = _setbuttonstate(imageedit.mostCurrent._butcircle);
 BA.debugLineNum = 901;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(16);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
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
public static RemoteObject  _butclose_click() throws Exception{
try {
		Debug.PushSubsStack("butClose_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1355);
if (RapidSub.canDelegate("butclose_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butclose_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1355;BA.debugLine="Sub butClose_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1356;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2048);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1357;BA.debugLine="i = Msgbox2(ShareCode.ExitEditNotSaved, ShareCode";
Debug.ShouldStop(4096);
_i = imageedit.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(imageedit.mostCurrent._sharecode._exiteditnotsaved /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(imageedit.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(imageedit.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(imageedit.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((imageedit.mostCurrent.__c.getField(false,"Null"))),imageedit.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1358;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, imageedit.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1359;BA.debugLine="If (ExitToDialog) Then";
Debug.ShouldStop(16384);
if ((imageedit._exittodialog).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1363;BA.debugLine="If (CurrentCLAItem.Origin = 1) Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",imageedit.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1364;BA.debugLine="CallSubDelayed2(User, \"CallMOREActionsAgain\",";
Debug.ShouldStop(524288);
imageedit.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((imageedit.mostCurrent._user.getObject())),(Object)(BA.ObjectToString("CallMOREActionsAgain")),(Object)((imageedit.mostCurrent._currentclaitem)));
 }else 
{ BA.debugLineNum = 1365;BA.debugLine="Else If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",imageedit.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 1366;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
Debug.ShouldStop(2097152);
imageedit.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((imageedit.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((imageedit.mostCurrent._currentclaitem)));
 }else 
{ BA.debugLineNum = 1367;BA.debugLine="Else If (CurrentCLAItem.Origin = 3) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",imageedit.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 1368;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage2\", Curre";
Debug.ShouldStop(8388608);
imageedit.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((imageedit.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage2")),(Object)((imageedit.mostCurrent._currentclaitem)));
 }else 
{ BA.debugLineNum = 1369;BA.debugLine="Else If (CurrentCLAItem.Origin = 4) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",imageedit.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 4)))) { 
 BA.debugLineNum = 1370;BA.debugLine="CallSubDelayed2(CameraActivity2, \"CamImage\", C";
Debug.ShouldStop(33554432);
imageedit.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((imageedit.mostCurrent._cameraactivity2.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((imageedit.mostCurrent._currentclaitem)));
 }}}}
;
 };
 BA.debugLineNum = 1373;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 1374;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, imageedit.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
 }else {
 }}
;
 BA.debugLineNum = 1379;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcolors_click() throws Exception{
try {
		Debug.PushSubsStack("butColors_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1102);
if (RapidSub.canDelegate("butcolors_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butcolors_click");}
 BA.debugLineNum = 1102;BA.debugLine="Sub butColors_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1103;BA.debugLine="If ColorPanel.Visible = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",imageedit.mostCurrent._colorpanel.runMethod(true,"getVisible"),imageedit.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1104;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(32768);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 1106;BA.debugLine="ColorPanel.Visible = True";
Debug.ShouldStop(131072);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1108;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butfont16_click() throws Exception{
try {
		Debug.PushSubsStack("butFont16_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1095);
if (RapidSub.canDelegate("butfont16_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butfont16_click");}
 BA.debugLineNum = 1095;BA.debugLine="Sub butFont16_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 1096;BA.debugLine="ButtonFontStates";
Debug.ShouldStop(128);
_buttonfontstates();
 BA.debugLineNum = 1097;BA.debugLine="butFont16.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(256);
imageedit.mostCurrent._butfont16.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1098;BA.debugLine="FontSize = 16";
Debug.ShouldStop(512);
imageedit._fontsize = BA.numberCast(int.class, 16);
 BA.debugLineNum = 1099;BA.debugLine="FontPanel.Visible = False";
Debug.ShouldStop(1024);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1100;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butfont20_click() throws Exception{
try {
		Debug.PushSubsStack("butFont20_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1088);
if (RapidSub.canDelegate("butfont20_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butfont20_click");}
 BA.debugLineNum = 1088;BA.debugLine="Sub butFont20_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1089;BA.debugLine="ButtonFontStates";
Debug.ShouldStop(1);
_buttonfontstates();
 BA.debugLineNum = 1090;BA.debugLine="butFont20.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(2);
imageedit.mostCurrent._butfont20.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1091;BA.debugLine="FontSize = 20";
Debug.ShouldStop(4);
imageedit._fontsize = BA.numberCast(int.class, 20);
 BA.debugLineNum = 1092;BA.debugLine="FontPanel.Visible = False";
Debug.ShouldStop(8);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1093;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butfont24_click() throws Exception{
try {
		Debug.PushSubsStack("butFont24_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1081);
if (RapidSub.canDelegate("butfont24_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butfont24_click");}
 BA.debugLineNum = 1081;BA.debugLine="Sub butFont24_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1082;BA.debugLine="ButtonFontStates";
Debug.ShouldStop(33554432);
_buttonfontstates();
 BA.debugLineNum = 1083;BA.debugLine="butFont24.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(67108864);
imageedit.mostCurrent._butfont24.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1084;BA.debugLine="FontSize = 24";
Debug.ShouldStop(134217728);
imageedit._fontsize = BA.numberCast(int.class, 24);
 BA.debugLineNum = 1085;BA.debugLine="FontPanel.Visible = False";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1086;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butfont28_click() throws Exception{
try {
		Debug.PushSubsStack("butFont28_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1074);
if (RapidSub.canDelegate("butfont28_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butfont28_click");}
 BA.debugLineNum = 1074;BA.debugLine="Sub butFont28_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1075;BA.debugLine="ButtonFontStates";
Debug.ShouldStop(262144);
_buttonfontstates();
 BA.debugLineNum = 1076;BA.debugLine="butFont28.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(524288);
imageedit.mostCurrent._butfont28.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1077;BA.debugLine="FontSize = 28";
Debug.ShouldStop(1048576);
imageedit._fontsize = BA.numberCast(int.class, 28);
 BA.debugLineNum = 1078;BA.debugLine="FontPanel.Visible = False";
Debug.ShouldStop(2097152);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1079;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butfont32_click() throws Exception{
try {
		Debug.PushSubsStack("butFont32_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1067);
if (RapidSub.canDelegate("butfont32_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butfont32_click");}
 BA.debugLineNum = 1067;BA.debugLine="Sub butFont32_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1068;BA.debugLine="ButtonFontStates";
Debug.ShouldStop(2048);
_buttonfontstates();
 BA.debugLineNum = 1069;BA.debugLine="butFont32.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(4096);
imageedit.mostCurrent._butfont32.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1070;BA.debugLine="FontSize = 32";
Debug.ShouldStop(8192);
imageedit._fontsize = BA.numberCast(int.class, 32);
 BA.debugLineNum = 1071;BA.debugLine="FontPanel.Visible = False";
Debug.ShouldStop(16384);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1072;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butfont36_click() throws Exception{
try {
		Debug.PushSubsStack("butFont36_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1060);
if (RapidSub.canDelegate("butfont36_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butfont36_click");}
 BA.debugLineNum = 1060;BA.debugLine="Sub butFont36_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1061;BA.debugLine="ButtonFontStates";
Debug.ShouldStop(16);
_buttonfontstates();
 BA.debugLineNum = 1062;BA.debugLine="butFont36.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(32);
imageedit.mostCurrent._butfont36.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1063;BA.debugLine="FontSize = 36";
Debug.ShouldStop(64);
imageedit._fontsize = BA.numberCast(int.class, 36);
 BA.debugLineNum = 1064;BA.debugLine="FontPanel.Visible = False";
Debug.ShouldStop(128);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1065;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butfonts_click() throws Exception{
try {
		Debug.PushSubsStack("butFonts_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1118);
if (RapidSub.canDelegate("butfonts_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butfonts_click");}
 BA.debugLineNum = 1118;BA.debugLine="Sub butFonts_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1119;BA.debugLine="If FontPanel.Visible = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",imageedit.mostCurrent._fontpanel.runMethod(true,"getVisible"),imageedit.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1120;BA.debugLine="FontPanel.Visible = False";
Debug.ShouldStop(-2147483648);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 1122;BA.debugLine="FontPanel.Visible = True";
Debug.ShouldStop(2);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1124;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butmarker_click() throws Exception{
try {
		Debug.PushSubsStack("butMarker_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,889);
if (RapidSub.canDelegate("butmarker_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butmarker_click");}
 BA.debugLineNum = 889;BA.debugLine="Sub butMarker_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 890;BA.debugLine="ButtonStates";
Debug.ShouldStop(33554432);
_buttonstates();
 BA.debugLineNum = 892;BA.debugLine="bMarker = setButtonState(butMarker)";
Debug.ShouldStop(134217728);
imageedit._bmarker = _setbuttonstate(imageedit.mostCurrent._butmarker);
 BA.debugLineNum = 893;BA.debugLine="PinPanel.Visible = True";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._pinpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 894;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butocr_click() throws Exception{
try {
		Debug.PushSubsStack("butOCR_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,904);
if (RapidSub.canDelegate("butocr_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butocr_click");}
 BA.debugLineNum = 904;BA.debugLine="Sub butOCR_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 905;BA.debugLine="ButtonStates";
Debug.ShouldStop(256);
_buttonstates();
 BA.debugLineNum = 907;BA.debugLine="bOCR = setButtonState(butOCR)";
Debug.ShouldStop(1024);
imageedit._bocr = _setbuttonstate(imageedit.mostCurrent._butocr);
 BA.debugLineNum = 908;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(2048);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 909;BA.debugLine="OCROptPanel.Visible = True";
Debug.ShouldStop(4096);
imageedit.mostCurrent._ocroptpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 910;BA.debugLine="butOCRFindSelect_Click";
Debug.ShouldStop(8192);
_butocrfindselect_click();
 BA.debugLineNum = 911;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butocrfindall_click() throws Exception{
try {
		Debug.PushSubsStack("butOCRFindAll_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,992);
if (RapidSub.canDelegate("butocrfindall_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butocrfindall_click");}
 BA.debugLineNum = 992;BA.debugLine="Sub butOCRFindAll_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 993;BA.debugLine="ButtonOCRStates";
Debug.ShouldStop(1);
_buttonocrstates();
 BA.debugLineNum = 994;BA.debugLine="butOCRFindAll.Color = Colors.ARGB( 150, 2, 102, 1";
Debug.ShouldStop(2);
imageedit.mostCurrent._butocrfindall.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 995;BA.debugLine="bb_OCRFindAll = True";
Debug.ShouldStop(4);
imageedit._bb_ocrfindall = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 996;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butocrfindselect_click() throws Exception{
try {
		Debug.PushSubsStack("butOCRFindSelect_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,986);
if (RapidSub.canDelegate("butocrfindselect_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butocrfindselect_click");}
 BA.debugLineNum = 986;BA.debugLine="Sub butOCRFindSelect_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 987;BA.debugLine="ButtonOCRStates";
Debug.ShouldStop(67108864);
_buttonocrstates();
 BA.debugLineNum = 988;BA.debugLine="butOCRFindSelect.Color = Colors.ARGB( 150, 2, 102";
Debug.ShouldStop(134217728);
imageedit.mostCurrent._butocrfindselect.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 989;BA.debugLine="bb_OCRFindSelect = True";
Debug.ShouldStop(268435456);
imageedit._bb_ocrfindselect = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 990;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butpencil_click() throws Exception{
try {
		Debug.PushSubsStack("butPencil_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,867);
if (RapidSub.canDelegate("butpencil_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butpencil_click");}
 BA.debugLineNum = 867;BA.debugLine="Sub butPencil_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 868;BA.debugLine="ButtonStates";
Debug.ShouldStop(8);
_buttonstates();
 BA.debugLineNum = 870;BA.debugLine="bPencil = setButtonState(butPencil)";
Debug.ShouldStop(32);
imageedit._bpencil = _setbuttonstate(imageedit.mostCurrent._butpencil);
 BA.debugLineNum = 871;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(64);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 872;BA.debugLine="PencilPanel.Visible = True";
Debug.ShouldStop(128);
imageedit.mostCurrent._pencilpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 873;BA.debugLine="butPencilFree_Click";
Debug.ShouldStop(256);
_butpencilfree_click();
 BA.debugLineNum = 874;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butpencildistance_click() throws Exception{
try {
		Debug.PushSubsStack("butPencilDistance_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1174);
if (RapidSub.canDelegate("butpencildistance_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butpencildistance_click");}
 BA.debugLineNum = 1174;BA.debugLine="Sub butPencilDistance_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1175;BA.debugLine="ButtonPencilStates";
Debug.ShouldStop(4194304);
_buttonpencilstates();
 BA.debugLineNum = 1176;BA.debugLine="butPencilDistance.Color = Colors.ARGB( 150, 2, 10";
Debug.ShouldStop(8388608);
imageedit.mostCurrent._butpencildistance.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1177;BA.debugLine="bb_PencilDistance = True";
Debug.ShouldStop(16777216);
imageedit._bb_pencildistance = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1178;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butpencilfree_click() throws Exception{
try {
		Debug.PushSubsStack("butPencilFree_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1168);
if (RapidSub.canDelegate("butpencilfree_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butpencilfree_click");}
 BA.debugLineNum = 1168;BA.debugLine="Sub butPencilFree_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1169;BA.debugLine="ButtonPencilStates";
Debug.ShouldStop(65536);
_buttonpencilstates();
 BA.debugLineNum = 1170;BA.debugLine="butPencilFree.Color = Colors.ARGB( 150, 2, 102, 1";
Debug.ShouldStop(131072);
imageedit.mostCurrent._butpencilfree.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1171;BA.debugLine="bb_PencilFree = True";
Debug.ShouldStop(262144);
imageedit._bb_pencilfree = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1172;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butpencilline_click() throws Exception{
try {
		Debug.PushSubsStack("butPencilLine_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1162);
if (RapidSub.canDelegate("butpencilline_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butpencilline_click");}
 BA.debugLineNum = 1162;BA.debugLine="Sub butPencilLine_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 1163;BA.debugLine="ButtonPencilStates";
Debug.ShouldStop(1024);
_buttonpencilstates();
 BA.debugLineNum = 1164;BA.debugLine="butPencilLine.Color = Colors.ARGB( 150, 2, 102, 1";
Debug.ShouldStop(2048);
imageedit.mostCurrent._butpencilline.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1165;BA.debugLine="bb_PencilLine = True";
Debug.ShouldStop(4096);
imageedit._bb_pencilline = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1166;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butrect_click() throws Exception{
try {
		Debug.PushSubsStack("butRect_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,876);
if (RapidSub.canDelegate("butrect_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butrect_click");}
 BA.debugLineNum = 876;BA.debugLine="Sub butRect_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 877;BA.debugLine="ButtonStates";
Debug.ShouldStop(4096);
_buttonstates();
 BA.debugLineNum = 879;BA.debugLine="bRect = setButtonState(butRect)";
Debug.ShouldStop(16384);
imageedit._brect = _setbuttonstate(imageedit.mostCurrent._butrect);
 BA.debugLineNum = 880;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(32768);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 881;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butreset_click() throws Exception{
try {
		Debug.PushSubsStack("butReset_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1381);
if (RapidSub.canDelegate("butreset_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butreset_click");}
RemoteObject _img = RemoteObject.declareNull("b4a.example.bitmapcreator");
 BA.debugLineNum = 1381;BA.debugLine="Sub butReset_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 1382;BA.debugLine="UndoBMR = SaveRects.Get( 0 )";
Debug.ShouldStop(32);
imageedit.mostCurrent._undobmr = (imageedit._saverects.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 1383;BA.debugLine="cvs.DrawBitmap(UndoBMR.btm,RRefer2B4XRect(UndoBMR";
Debug.ShouldStop(64);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmap",(Object)((imageedit.mostCurrent._undobmr.getField(false,"btm" /*RemoteObject*/ ).getObject())),(Object)(_rrefer2b4xrect(imageedit.mostCurrent._undobmr.getField(false,"rct" /*RemoteObject*/ ))));
 BA.debugLineNum = 1385;BA.debugLine="SaveRects.Clear";
Debug.ShouldStop(256);
imageedit._saverects.runVoidMethod ("Clear");
 BA.debugLineNum = 1387;BA.debugLine="Dim img As BitmapCreator";
Debug.ShouldStop(1024);
_img = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("img", _img);
 BA.debugLineNum = 1388;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
Debug.ShouldStop(2048);
_img.runVoidMethod ("_initialize",imageedit.processBA,(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getHeight"))));
 BA.debugLineNum = 1389;BA.debugLine="img.DrawBitmap(cvs.CreateBitmap, cvsRect, True)";
Debug.ShouldStop(4096);
_img.runVoidMethod ("_drawbitmap",(Object)(imageedit.mostCurrent._cvs.runMethod(false,"CreateBitmap")),(Object)(imageedit.mostCurrent._cvsrect),(Object)(imageedit.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1390;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
Debug.ShouldStop(8192);
imageedit._saverects.runVoidMethod ("Add",(Object)((_bmrcreate(_img.runMethod(false,"_getbitmap"),imageedit.mostCurrent._cvsrect))));
 BA.debugLineNum = 1391;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _butsave_click() throws Exception{
try {
		Debug.PushSubsStack("butSave_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1192);
if (RapidSub.canDelegate("butsave_click")) { xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butsave_click"); return;}
ResumableSub_butSave_Click rsub = new ResumableSub_butSave_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butSave_Click extends BA.ResumableSub {
public ResumableSub_butSave_Click(xevolution.vrcg.devdemov2400.imageedit parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.imageedit parent;
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _ma = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appactiondialogs");
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _alerttagcode = RemoteObject.createImmutable("");
RemoteObject _apilist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butSave_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1192);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1193;BA.debugLine="Dim theFile As String = ShotFileName";
Debug.ShouldStop(256);
_thefile = parent._shotfilename;Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 1194;BA.debugLine="If (ShotFileLocation = File.DirAssets) Then ShotF";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if ((RemoteObject.solveBoolean("=",parent._shotfilelocation,parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._shotfilelocation = parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1195;BA.debugLine="If (isB64Image) Then";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._isb64image).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1196;BA.debugLine="theFile = $\"IMG-${Utils.MakeFileName}-000.png\"$";
Debug.ShouldStop(2048);
_thefile = (RemoteObject.concat(RemoteObject.createImmutable("IMG-"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA)))),RemoteObject.createImmutable("-000.png")));Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 1197;BA.debugLine="CurrentCLAItem.Value = \"IMG_B64_EDIT\"";
Debug.ShouldStop(4096);
parent.mostCurrent._currentclaitem.setField ("Value" /*RemoteObject*/ ,BA.ObjectToString("IMG_B64_EDIT"));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1200;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(ShotFil";
Debug.ShouldStop(32768);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent._shotfilelocation),(Object)(_thefile),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Out", _out);Debug.locals.put("Out", _out);
 BA.debugLineNum = 1201;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
Debug.ShouldStop(65536);
parent.mostCurrent._cvs.runMethod(false,"CreateBitmap").runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(parent.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),parent.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 1202;BA.debugLine="cvs.Release";
Debug.ShouldStop(131072);
parent.mostCurrent._cvs.runVoidMethod ("Release");
 BA.debugLineNum = 1203;BA.debugLine="Out.Close";
Debug.ShouldStop(262144);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 1210;BA.debugLine="If (ExitToDialog) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 11:
//if
this.state = 34;
if ((parent._exittodialog).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 33;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1212;BA.debugLine="Dim ma As AppActionDialogs";
Debug.ShouldStop(134217728);
_ma = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appactiondialogs");Debug.locals.put("ma", _ma);
 BA.debugLineNum = 1213;BA.debugLine="ma.Initialize";
Debug.ShouldStop(268435456);
_ma.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_initialize" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA);
 BA.debugLineNum = 1214;BA.debugLine="Try";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 1215;BA.debugLine="ma.CameraReturn(theFile, CurrentCLAItem)";
Debug.ShouldStop(1073741824);
_ma.runClassMethod (xevolution.vrcg.devdemov2400.appactiondialogs.class, "_camerareturn" /*void*/ ,(Object)(_thefile),(Object)(parent.mostCurrent._currentclaitem));
 Debug.CheckDeviceExceptions();
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
 BA.debugLineNum = 1217;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","635651609",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",imageedit.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
;
 BA.debugLineNum = 1219;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",imageedit.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "imageedit", "butsave_click"),BA.numberCast(int.class, 1000));
this.state = 35;
return;
case 35:
//C
this.state = 20;
;
 BA.debugLineNum = 1220;BA.debugLine="If (CurrentCLAItem.Origin = 1) Then";
Debug.ShouldStop(8);
if (true) break;

case 20:
//if
this.state = 31;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 1)))) { 
this.state = 22;
}else 
{ BA.debugLineNum = 1222;BA.debugLine="else If (CurrentCLAItem.Origin = 2) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 2)))) { 
this.state = 24;
}else 
{ BA.debugLineNum = 1224;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 3)))) { 
this.state = 26;
}else 
{ BA.debugLineNum = 1226;BA.debugLine="else If (CurrentCLAItem.Origin = 4) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._currentclaitem.getField(true,"Origin" /*RemoteObject*/ ),BA.numberCast(double.class, 4)))) { 
this.state = 28;
}else {
this.state = 30;
}}}}
if (true) break;

case 22:
//C
this.state = 31;
 BA.debugLineNum = 1221;BA.debugLine="CallSubDelayed2(User, \"CallMOREActionsAgain\", C";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((parent.mostCurrent._user.getObject())),(Object)(BA.ObjectToString("CallMOREActionsAgain")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 24:
//C
this.state = 31;
 BA.debugLineNum = 1223;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", CurrentC";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((parent.mostCurrent._requests3.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 26:
//C
this.state = 31;
 BA.debugLineNum = 1225;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage2\", Curren";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage2")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 1227;BA.debugLine="CallSubDelayed2(CameraActivity2, \"CamImage\", Cu";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((parent.mostCurrent._cameraactivity2.getObject())),(Object)(BA.ObjectToString("CamImage")),(Object)((parent.mostCurrent._currentclaitem)));
 if (true) break;

case 30:
//C
this.state = 31;
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1231;BA.debugLine="Dim this As RequestCLAItem = CurrentCLAItem";
Debug.ShouldStop(16384);
_this = parent.mostCurrent._currentclaitem;Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 1232;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(32768);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 1233;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(65536);
_base64con.runVoidMethod ("_initialize",imageedit.processBA);
 BA.debugLineNum = 1234;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImage";
Debug.ShouldStop(131072);
_imgb64 = _base64con.runMethod(true,"_v6",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thefile))),RemoteObject.createImmutable("")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1236;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(524288);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 1237;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(1048576);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images \n"),RemoteObject.createImmutable("					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report,\n"),RemoteObject.createImmutable("					repeatcounter, repeatitemcounter, repeatfieldcounter)\n"),RemoteObject.createImmutable("					values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("					'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thefile))),RemoteObject.createImmutable("', 1,\n"),RemoteObject.createImmutable("					"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(")")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1243;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"${sSQL}\"$)";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1245;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_a";
Debug.ShouldStop(268435456);
_mid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_alerts")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 1246;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateT";
Debug.ShouldStop(536870912);
_alerttagcode = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ALERTINF_")))))),RemoteObject.createImmutable("")));Debug.locals.put("alerttagcode", _alerttagcode);Debug.locals.put("alerttagcode", _alerttagcode);
 BA.debugLineNum = 1247;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (i";
Debug.ShouldStop(1073741824);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal, \n"),RemoteObject.createImmutable("				origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"),RemoteObject.createImmutable("				values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', 1, 1, 'Imagens adicionadas ao repositório por utilizar.', \n"),RemoteObject.createImmutable("				'"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA)))),RemoteObject.createImmutable("', '', 1, 1, 0, 0)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1251;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"${sSQL}\"$)";
Debug.ShouldStop(4);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1253;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_a";
Debug.ShouldStop(16);
_mid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_alerts_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 1254;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts_im";
Debug.ShouldStop(32);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts_images\n"),RemoteObject.createImmutable("					(id, tagcode, imageb64, imagename, assigned)\n"),RemoteObject.createImmutable("					values ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_thefile))),RemoteObject.createImmutable("', 0)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1257;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"${sSQL}\"$)";
Debug.ShouldStop(256);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1259;BA.debugLine="Dim ApiList As List";
Debug.ShouldStop(1024);
_apilist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ApiList", _apilist);
 BA.debugLineNum = 1260;BA.debugLine="ApiList.Initialize";
Debug.ShouldStop(2048);
_apilist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1261;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4096);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1262;BA.debugLine="params.Initialize";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1263;BA.debugLine="params.Clear";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1264;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1265;BA.debugLine="params.Put(\"tagcode\", alerttagcode)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_alerttagcode)));
 BA.debugLineNum = 1266;BA.debugLine="params.Put(\"relation_type\", \"ALRTREL_TASKS\")";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_type"))),(Object)((RemoteObject.createImmutable("ALRTREL_TASKS"))));
 BA.debugLineNum = 1267;BA.debugLine="params.Put(\"alert_type\", \"ALRTTYP_TASKS\")";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alert_type"))),(Object)((RemoteObject.createImmutable("ALRTTYP_TASKS"))));
 BA.debugLineNum = 1268;BA.debugLine="params.Put(\"internal\", 1)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("internal"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1269;BA.debugLine="params.Put(\"origin\", 1)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1270;BA.debugLine="params.Put(\"title\", \"Imagens adicionadas ao repo";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("Imagens adicionadas ao repositório por utilizar."))));
 BA.debugLineNum = 1271;BA.debugLine="params.Put(\"user_tagcode\", ShareCode.SESS_User)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1272;BA.debugLine="params.Put(\"date_alert\", Utils.GetCurrentDate)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_alert"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA))));
 BA.debugLineNum = 1273;BA.debugLine="params.Put(\"date_verification\", \"\")";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_verification"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1274;BA.debugLine="params.Put(\"alert_visible\", 1)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alert_visible"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1275;BA.debugLine="params.Put(\"imageb64\", ImgB64)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imageb64"))),(Object)((_imgb64)));
 BA.debugLineNum = 1276;BA.debugLine="params.Put(\"imagename\", theFile)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imagename"))),(Object)((_thefile)));
 BA.debugLineNum = 1277;BA.debugLine="params.Put(\"status_id\", 0)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1278;BA.debugLine="params.Put(\"kind_data\", 0)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("kind_data"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1279;BA.debugLine="params.Put(\"request_tagcode\", this.Request)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_this.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 1280;BA.debugLine="params.Put(\"action_tagcode\", this.Action)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action_tagcode"))),(Object)((_this.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 1281;BA.debugLine="params.Put(\"task_tagcode\", this.Task)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("task_tagcode"))),(Object)((_this.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1282;BA.debugLine="params.Put(\"item_tagcode\", this.Item)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("item_tagcode"))),(Object)((_this.getField(true,"Item" /*RemoteObject*/ ))));
 BA.debugLineNum = 1283;BA.debugLine="params.Put(\"uniquekey\", this.UniqueKey)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("uniquekey"))),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ ))));
 BA.debugLineNum = 1284;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1285;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1286;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1287;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1288;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1289;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1290;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1291;BA.debugLine="ApiList.Add(params)";
Debug.ShouldStop(1024);
_apilist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1297;BA.debugLine="CallSubDelayed3(MainMenu, \"ListsReturnUpdateServ";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",imageedit.processBA,(Object)((parent.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturnUpdateServer")),(Object)(((RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/alert/new"))))),(Object)((_apilist)));
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 1303;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1305;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",imageedit.processBA, e0.toString());}
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
public static RemoteObject  _butshot_click() throws Exception{
try {
		Debug.PushSubsStack("butShot_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,860);
if (RapidSub.canDelegate("butshot_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butshot_click");}
 BA.debugLineNum = 860;BA.debugLine="Sub butShot_Click 'crop";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 861;BA.debugLine="ButtonStates";
Debug.ShouldStop(268435456);
_buttonstates();
 BA.debugLineNum = 863;BA.debugLine="bShot = setButtonState(butShot)";
Debug.ShouldStop(1073741824);
imageedit._bshot = _setbuttonstate(imageedit.mostCurrent._butshot);
 BA.debugLineNum = 864;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(-2147483648);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 865;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttext_click() throws Exception{
try {
		Debug.PushSubsStack("butText_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,883);
if (RapidSub.canDelegate("buttext_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","buttext_click");}
 BA.debugLineNum = 883;BA.debugLine="Sub butText_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 884;BA.debugLine="ButtonStates";
Debug.ShouldStop(524288);
_buttonstates();
 BA.debugLineNum = 886;BA.debugLine="bText = setButtonState(butText)";
Debug.ShouldStop(2097152);
imageedit._btext = _setbuttonstate(imageedit.mostCurrent._buttext);
 BA.debugLineNum = 887;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,720);
if (RapidSub.canDelegate("button1_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","button1_click");}
 BA.debugLineNum = 720;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 722;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonbcstates() throws Exception{
try {
		Debug.PushSubsStack("ButtonBCStates (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,828);
if (RapidSub.canDelegate("buttonbcstates")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","buttonbcstates");}
 BA.debugLineNum = 828;BA.debugLine="Sub ButtonBCStates";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 829;BA.debugLine="BCBarcode.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._bcbarcode.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 830;BA.debugLine="BCQRCode.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(536870912);
imageedit.mostCurrent._bcqrcode.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 831;BA.debugLine="BCStamp.Color = Colors.ARGB( 150, 119, 218, 255 )";
Debug.ShouldStop(1073741824);
imageedit.mostCurrent._bcstamp.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 833;BA.debugLine="bb_BCBarcode = False";
Debug.ShouldStop(1);
imageedit._bb_bcbarcode = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 834;BA.debugLine="bb_BCQRCode = False";
Debug.ShouldStop(2);
imageedit._bb_bcqrcode = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 835;BA.debugLine="bb_BCStamp = False";
Debug.ShouldStop(4);
imageedit._bb_bcstamp = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 836;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonfontstates() throws Exception{
try {
		Debug.PushSubsStack("ButtonFontStates (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,788);
if (RapidSub.canDelegate("buttonfontstates")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","buttonfontstates");}
 BA.debugLineNum = 788;BA.debugLine="Sub ButtonFontStates";
Debug.ShouldStop(524288);
 BA.debugLineNum = 789;BA.debugLine="butFont16.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(1048576);
imageedit.mostCurrent._butfont16.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 790;BA.debugLine="butFont20.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(2097152);
imageedit.mostCurrent._butfont20.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 791;BA.debugLine="butFont24.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(4194304);
imageedit.mostCurrent._butfont24.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 792;BA.debugLine="butFont28.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(8388608);
imageedit.mostCurrent._butfont28.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 793;BA.debugLine="butFont32.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(16777216);
imageedit.mostCurrent._butfont32.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 794;BA.debugLine="butFont36.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._butfont36.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 798;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonocrstates() throws Exception{
try {
		Debug.PushSubsStack("ButtonOCRStates (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,810);
if (RapidSub.canDelegate("buttonocrstates")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","buttonocrstates");}
 BA.debugLineNum = 810;BA.debugLine="Sub ButtonOCRStates";
Debug.ShouldStop(512);
 BA.debugLineNum = 811;BA.debugLine="butOCRFindAll.Color = Colors.ARGB( 150, 119, 218,";
Debug.ShouldStop(1024);
imageedit.mostCurrent._butocrfindall.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 812;BA.debugLine="butOCRFindSelect.Color = Colors.ARGB( 150, 119, 2";
Debug.ShouldStop(2048);
imageedit.mostCurrent._butocrfindselect.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 814;BA.debugLine="bb_OCRFindAll = False";
Debug.ShouldStop(8192);
imageedit._bb_ocrfindall = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 815;BA.debugLine="bb_OCRFindSelect = False";
Debug.ShouldStop(16384);
imageedit._bb_ocrfindselect = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 816;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonpencilstates() throws Exception{
try {
		Debug.PushSubsStack("ButtonPencilStates (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,800);
if (RapidSub.canDelegate("buttonpencilstates")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","buttonpencilstates");}
 BA.debugLineNum = 800;BA.debugLine="Sub ButtonPencilStates";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 801;BA.debugLine="butPencilFree.Color = Colors.ARGB( 150, 119, 218,";
Debug.ShouldStop(1);
imageedit.mostCurrent._butpencilfree.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 802;BA.debugLine="butPencilDistance.Color = Colors.ARGB( 150, 119,";
Debug.ShouldStop(2);
imageedit.mostCurrent._butpencildistance.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 803;BA.debugLine="butPencilLine.Color = Colors.ARGB( 150, 119, 218,";
Debug.ShouldStop(4);
imageedit.mostCurrent._butpencilline.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 805;BA.debugLine="bb_PencilDistance = False";
Debug.ShouldStop(16);
imageedit._bb_pencildistance = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 806;BA.debugLine="bb_PencilFree = False";
Debug.ShouldStop(32);
imageedit._bb_pencilfree = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 807;BA.debugLine="bb_PencilLine = False";
Debug.ShouldStop(64);
imageedit._bb_pencilline = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 808;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonpinstates() throws Exception{
try {
		Debug.PushSubsStack("ButtonPINStates (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,818);
if (RapidSub.canDelegate("buttonpinstates")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","buttonpinstates");}
 BA.debugLineNum = 818;BA.debugLine="Sub ButtonPINStates";
Debug.ShouldStop(131072);
 BA.debugLineNum = 819;BA.debugLine="PINFoto.Color = Colors.ARGB( 150, 119, 218, 255 )";
Debug.ShouldStop(262144);
imageedit.mostCurrent._pinfoto.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 820;BA.debugLine="PINText.Color = Colors.ARGB( 150, 119, 218, 255 )";
Debug.ShouldStop(524288);
imageedit.mostCurrent._pintext.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 821;BA.debugLine="PINMarker.Color = Colors.ARGB( 150, 119, 218, 255";
Debug.ShouldStop(1048576);
imageedit.mostCurrent._pinmarker.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 218)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 823;BA.debugLine="bb_PINFoto = False";
Debug.ShouldStop(4194304);
imageedit._bb_pinfoto = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 824;BA.debugLine="bb_PINMarker = False";
Debug.ShouldStop(8388608);
imageedit._bb_pinmarker = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 825;BA.debugLine="bb_PINText = False";
Debug.ShouldStop(16777216);
imageedit._bb_pintext = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 826;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonstates() throws Exception{
try {
		Debug.PushSubsStack("ButtonStates (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,755);
if (RapidSub.canDelegate("buttonstates")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","buttonstates");}
 BA.debugLineNum = 755;BA.debugLine="Sub ButtonStates";
Debug.ShouldStop(262144);
 BA.debugLineNum = 759;BA.debugLine="butShot.Color = Colors.ARGB( 155, 78, 151, 255 )";
Debug.ShouldStop(4194304);
imageedit.mostCurrent._butshot.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 78)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 760;BA.debugLine="bShot = False";
Debug.ShouldStop(8388608);
imageedit._bshot = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 761;BA.debugLine="butRect.Color = Colors.ARGB( 155, 78, 151, 255 )";
Debug.ShouldStop(16777216);
imageedit.mostCurrent._butrect.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 78)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 762;BA.debugLine="bRect = False";
Debug.ShouldStop(33554432);
imageedit._brect = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 763;BA.debugLine="butCircle.Color = Colors.ARGB( 155, 78, 151, 255";
Debug.ShouldStop(67108864);
imageedit.mostCurrent._butcircle.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 78)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 764;BA.debugLine="bCircle = False";
Debug.ShouldStop(134217728);
imageedit._bcircle = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 765;BA.debugLine="butMarker.Color = Colors.ARGB( 155, 78, 151, 255";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._butmarker.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 78)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 766;BA.debugLine="bMarker = False";
Debug.ShouldStop(536870912);
imageedit._bmarker = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 767;BA.debugLine="butText.Color = Colors.ARGB( 155, 78, 151, 255 )";
Debug.ShouldStop(1073741824);
imageedit.mostCurrent._buttext.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 78)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 768;BA.debugLine="bText = False";
Debug.ShouldStop(-2147483648);
imageedit._btext = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 769;BA.debugLine="butOCR.Color = Colors.ARGB( 155, 78, 151, 255 )";
Debug.ShouldStop(1);
imageedit.mostCurrent._butocr.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 78)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 770;BA.debugLine="bOCR = False";
Debug.ShouldStop(2);
imageedit._bocr = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 771;BA.debugLine="butBarcode.Color = Colors.ARGB( 155, 78, 151, 255";
Debug.ShouldStop(4);
imageedit.mostCurrent._butbarcode.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 78)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 772;BA.debugLine="bBarcode = False";
Debug.ShouldStop(8);
imageedit._bbarcode = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 773;BA.debugLine="butPencil.Color = Colors.ARGB( 155, 78, 151, 255";
Debug.ShouldStop(16);
imageedit.mostCurrent._butpencil.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 78)),(Object)(BA.numberCast(int.class, 151)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 774;BA.debugLine="bPencil = False";
Debug.ShouldStop(32);
imageedit._bpencil = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 776;BA.debugLine="butCamera.Color = Colors.ARGB( 155, 0, 155, 255 )";
Debug.ShouldStop(128);
imageedit.mostCurrent._butcamera.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 777;BA.debugLine="bCamera = False";
Debug.ShouldStop(256);
imageedit._bcamera = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 779;BA.debugLine="PencilPanel.Visible = False";
Debug.ShouldStop(1024);
imageedit.mostCurrent._pencilpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 780;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(2048);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 781;BA.debugLine="OCROptPanel.Visible = False";
Debug.ShouldStop(4096);
imageedit.mostCurrent._ocroptpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 782;BA.debugLine="FontPanel.Visible = False";
Debug.ShouldStop(8192);
imageedit.mostCurrent._fontpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 783;BA.debugLine="PinPanel.Visible = False";
Debug.ShouldStop(16384);
imageedit.mostCurrent._pinpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 784;BA.debugLine="BarCodePanel.Visible = False";
Debug.ShouldStop(32768);
imageedit.mostCurrent._barcodepanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 785;BA.debugLine="ActionsPanel.Visible = False";
Debug.ShouldStop(65536);
imageedit.mostCurrent._actionspanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 786;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butundo_click() throws Exception{
try {
		Debug.PushSubsStack("butUndo_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1180);
if (RapidSub.canDelegate("butundo_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","butundo_click");}
 BA.debugLineNum = 1180;BA.debugLine="Sub butUndo_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1181;BA.debugLine="If SaveRects.Size >1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",imageedit._saverects.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1183;BA.debugLine="UndoBMR = SaveRects.Get( SaveRects.Size-1 )";
Debug.ShouldStop(1073741824);
imageedit.mostCurrent._undobmr = (imageedit._saverects.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {imageedit._saverects.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 1184;BA.debugLine="cvs.DrawBitmap(UndoBMR.btm,RRefer2B4XRect(UndoBM";
Debug.ShouldStop(-2147483648);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmap",(Object)((imageedit.mostCurrent._undobmr.getField(false,"btm" /*RemoteObject*/ ).getObject())),(Object)(_rrefer2b4xrect(imageedit.mostCurrent._undobmr.getField(false,"rct" /*RemoteObject*/ ))));
 BA.debugLineNum = 1186;BA.debugLine="SaveRects.RemoveAt( SaveRects.Size-1 )";
Debug.ShouldStop(2);
imageedit._saverects.runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {imageedit._saverects.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 };
 BA.debugLineNum = 1188;BA.debugLine="memoryLabel.Text = Utils.GetFreeMem";
Debug.ShouldStop(8);
imageedit.mostCurrent._memorylabel.runMethod(true,"setText",BA.ObjectToCharSequence(imageedit.mostCurrent._utils.runMethod(true,"_getfreemem" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA)));
 BA.debugLineNum = 1189;BA.debugLine="CheckStates";
Debug.ShouldStop(16);
_checkstates();
 BA.debugLineNum = 1190;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkstates() throws Exception{
try {
		Debug.PushSubsStack("CheckStates (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,685);
if (RapidSub.canDelegate("checkstates")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","checkstates");}
 BA.debugLineNum = 685;BA.debugLine="Sub CheckStates";
Debug.ShouldStop(4096);
 BA.debugLineNum = 686;BA.debugLine="MakeUndo = SaveRects.Size > 1";
Debug.ShouldStop(8192);
imageedit._makeundo = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",imageedit._saverects.runMethod(true,"getSize"),BA.numberCast(double.class, 1)));
 BA.debugLineNum = 687;BA.debugLine="butUndo.Enabled = MakeUndo";
Debug.ShouldStop(16384);
imageedit.mostCurrent._butundo.runMethod(true,"setEnabled",imageedit._makeundo);
 BA.debugLineNum = 688;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearundorect() throws Exception{
try {
		Debug.PushSubsStack("ClearUndoRect (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,467);
if (RapidSub.canDelegate("clearundorect")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","clearundorect");}
 BA.debugLineNum = 467;BA.debugLine="Sub ClearUndoRect";
Debug.ShouldStop(262144);
 BA.debugLineNum = 468;BA.debugLine="UndoRect.Left = 0";
Debug.ShouldStop(524288);
imageedit.mostCurrent._undorect.runMethod(true,"setLeft",BA.numberCast(float.class, 0));
 BA.debugLineNum = 469;BA.debugLine="UndoRect.Top = 0";
Debug.ShouldStop(1048576);
imageedit.mostCurrent._undorect.runMethod(true,"setTop",BA.numberCast(float.class, 0));
 BA.debugLineNum = 470;BA.debugLine="UndoRect.Right = 0";
Debug.ShouldStop(2097152);
imageedit.mostCurrent._undorect.runMethod(true,"setRight",BA.numberCast(float.class, 0));
 BA.debugLineNum = 471;BA.debugLine="UndoRect.Bottom = 0";
Debug.ShouldStop(4194304);
imageedit.mostCurrent._undorect.runMethod(true,"setBottom",BA.numberCast(float.class, 0));
 BA.debugLineNum = 472;BA.debugLine="UndoRect.Width = 0";
Debug.ShouldStop(8388608);
imageedit.mostCurrent._undorect.runMethod(true,"setWidth",BA.numberCast(int.class, 0));
 BA.debugLineNum = 473;BA.debugLine="UndoRect.Height = 0";
Debug.ShouldStop(16777216);
imageedit.mostCurrent._undorect.runMethod(true,"setHeight",BA.numberCast(float.class, 0));
 BA.debugLineNum = 474;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorblack_click() throws Exception{
try {
		Debug.PushSubsStack("ColorBlack_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,965);
if (RapidSub.canDelegate("colorblack_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","colorblack_click");}
 BA.debugLineNum = 965;BA.debugLine="Sub ColorBlack_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 966;BA.debugLine="LineColor = Colors.Black";
Debug.ShouldStop(32);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Black");
 BA.debugLineNum = 967;BA.debugLine="MarkerColorName = \"black\"";
Debug.ShouldStop(64);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("black");
 BA.debugLineNum = 968;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(128);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 969;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(256);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 970;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorblue_click() throws Exception{
try {
		Debug.PushSubsStack("ColorBlue_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,958);
if (RapidSub.canDelegate("colorblue_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","colorblue_click");}
 BA.debugLineNum = 958;BA.debugLine="Sub ColorBlue_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 959;BA.debugLine="LineColor = Colors.Blue";
Debug.ShouldStop(1073741824);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue");
 BA.debugLineNum = 960;BA.debugLine="MarkerColorName = \"blue\"";
Debug.ShouldStop(-2147483648);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("blue");
 BA.debugLineNum = 961;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(1);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 962;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(2);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 963;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorgreen_click() throws Exception{
try {
		Debug.PushSubsStack("ColorGreen_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,972);
if (RapidSub.canDelegate("colorgreen_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","colorgreen_click");}
 BA.debugLineNum = 972;BA.debugLine="Sub ColorGreen_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 973;BA.debugLine="LineColor = Colors.Green";
Debug.ShouldStop(4096);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Green");
 BA.debugLineNum = 974;BA.debugLine="MarkerColorName = \"green\"";
Debug.ShouldStop(8192);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("green");
 BA.debugLineNum = 975;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(16384);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 976;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(32768);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 977;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorgrey_click() throws Exception{
try {
		Debug.PushSubsStack("ColorGrey_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,951);
if (RapidSub.canDelegate("colorgrey_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","colorgrey_click");}
 BA.debugLineNum = 951;BA.debugLine="Sub ColorGrey_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 952;BA.debugLine="LineColor = Colors.Gray";
Debug.ShouldStop(8388608);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray");
 BA.debugLineNum = 953;BA.debugLine="MarkerColorName = \"grey\"";
Debug.ShouldStop(16777216);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("grey");
 BA.debugLineNum = 954;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 955;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(67108864);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 956;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colororange_click() throws Exception{
try {
		Debug.PushSubsStack("ColorOrange_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,944);
if (RapidSub.canDelegate("colororange_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","colororange_click");}
 BA.debugLineNum = 944;BA.debugLine="Sub ColorOrange_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 945;BA.debugLine="LineColor = Colors.RGB(239, 127, 26)";
Debug.ShouldStop(65536);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 127)),(Object)(BA.numberCast(int.class, 26)));
 BA.debugLineNum = 946;BA.debugLine="MarkerColorName = \"orange\"";
Debug.ShouldStop(131072);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("orange");
 BA.debugLineNum = 947;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(262144);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 948;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(524288);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 949;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorpurple_click() throws Exception{
try {
		Debug.PushSubsStack("ColorPurple_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,937);
if (RapidSub.canDelegate("colorpurple_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","colorpurple_click");}
 BA.debugLineNum = 937;BA.debugLine="Sub ColorPurple_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 938;BA.debugLine="LineColor = Colors.RGB(174, 74, 132)";
Debug.ShouldStop(512);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 174)),(Object)(BA.numberCast(int.class, 74)),(Object)(BA.numberCast(int.class, 132)));
 BA.debugLineNum = 939;BA.debugLine="MarkerColorName = \"purple\"";
Debug.ShouldStop(1024);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("purple");
 BA.debugLineNum = 940;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(2048);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 941;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(4096);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _colorred_click() throws Exception{
try {
		Debug.PushSubsStack("ColorRed_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,930);
if (RapidSub.canDelegate("colorred_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","colorred_click");}
 BA.debugLineNum = 930;BA.debugLine="Sub ColorRed_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 931;BA.debugLine="LineColor = Colors.Red";
Debug.ShouldStop(4);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");
 BA.debugLineNum = 932;BA.debugLine="MarkerColorName = \"red\"";
Debug.ShouldStop(8);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("red");
 BA.debugLineNum = 933;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(16);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 934;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(32);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 935;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorwhite_click() throws Exception{
try {
		Debug.PushSubsStack("ColorWhite_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,979);
if (RapidSub.canDelegate("colorwhite_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","colorwhite_click");}
 BA.debugLineNum = 979;BA.debugLine="Sub ColorWhite_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 980;BA.debugLine="LineColor = Colors.White";
Debug.ShouldStop(524288);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").getField(true,"White");
 BA.debugLineNum = 981;BA.debugLine="MarkerColorName = \"white\"";
Debug.ShouldStop(1048576);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("white");
 BA.debugLineNum = 982;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(2097152);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 983;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(4194304);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 984;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _coloryellow_click() throws Exception{
try {
		Debug.PushSubsStack("ColorYellow_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,923);
if (RapidSub.canDelegate("coloryellow_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","coloryellow_click");}
 BA.debugLineNum = 923;BA.debugLine="Sub ColorYellow_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 924;BA.debugLine="LineColor = Colors.Yellow";
Debug.ShouldStop(134217728);
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow");
 BA.debugLineNum = 925;BA.debugLine="MarkerColorName = \"yellow\"";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._markercolorname = BA.ObjectToString("yellow");
 BA.debugLineNum = 926;BA.debugLine="ColorPanelIndicator.Color = LineColor";
Debug.ShouldStop(536870912);
imageedit.mostCurrent._colorpanelindicator.runVoidMethod ("setColor",imageedit._linecolor);
 BA.debugLineNum = 927;BA.debugLine="ColorPanel.Visible = False";
Debug.ShouldStop(1073741824);
imageedit.mostCurrent._colorpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 928;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlinepoints(RemoteObject _lst,RemoteObject _clear,RemoteObject _rct) throws Exception{
try {
		Debug.PushSubsStack("CreateLinePoints (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,410);
if (RapidSub.canDelegate("createlinepoints")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","createlinepoints", _lst, _clear, _rct);}
RemoteObject _path = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _rr = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._point");
Debug.locals.put("lst", _lst);
Debug.locals.put("clear", _clear);
Debug.locals.put("rct", _rct);
 BA.debugLineNum = 410;BA.debugLine="Sub CreateLinePoints(lst As List, clear As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 411;BA.debugLine="Dim path As B4XPath";
Debug.ShouldStop(67108864);
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("path", _path);
 BA.debugLineNum = 413;BA.debugLine="Dim rr As B4XRect";
Debug.ShouldStop(268435456);
_rr = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rr", _rr);
 BA.debugLineNum = 414;BA.debugLine="rr.Initialize(0,0,0,0)";
Debug.ShouldStop(536870912);
_rr.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 415;BA.debugLine="For i = 0 To lst.Size-1";
Debug.ShouldStop(1073741824);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 416;BA.debugLine="Dim p As Point = lst.Get(i)";
Debug.ShouldStop(-2147483648);
_p = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 417;BA.debugLine="If (i=0) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 418;BA.debugLine="rr.Left = p.X";
Debug.ShouldStop(2);
_rr.runMethod(true,"setLeft",BA.numberCast(float.class, _p.getField(true,"X" /*RemoteObject*/ )));
 BA.debugLineNum = 419;BA.debugLine="rr.Right = p.X";
Debug.ShouldStop(4);
_rr.runMethod(true,"setRight",BA.numberCast(float.class, _p.getField(true,"X" /*RemoteObject*/ )));
 BA.debugLineNum = 420;BA.debugLine="rr.Top = p.Y";
Debug.ShouldStop(8);
_rr.runMethod(true,"setTop",BA.numberCast(float.class, _p.getField(true,"Y" /*RemoteObject*/ )));
 BA.debugLineNum = 421;BA.debugLine="rr.Bottom = p.Y";
Debug.ShouldStop(16);
_rr.runMethod(true,"setBottom",BA.numberCast(float.class, _p.getField(true,"Y" /*RemoteObject*/ )));
 BA.debugLineNum = 422;BA.debugLine="path.Initialize(p.X, p.Y)";
Debug.ShouldStop(32);
_path.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _p.getField(true,"X" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _p.getField(true,"Y" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 424;BA.debugLine="path.LineTo(p.X, p.Y)";
Debug.ShouldStop(128);
_path.runVoidMethod ("LineTo",(Object)(BA.numberCast(float.class, _p.getField(true,"X" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _p.getField(true,"Y" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 426;BA.debugLine="If p.X < rr.Left Then rr.Left = p.X";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("<",_p.getField(true,"X" /*RemoteObject*/ ),BA.numberCast(double.class, _rr.runMethod(true,"getLeft")))) { 
_rr.runMethod(true,"setLeft",BA.numberCast(float.class, _p.getField(true,"X" /*RemoteObject*/ )));};
 BA.debugLineNum = 427;BA.debugLine="If p.X > rr.Right Then rr.Right = p.X";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_p.getField(true,"X" /*RemoteObject*/ ),BA.numberCast(double.class, _rr.runMethod(true,"getRight")))) { 
_rr.runMethod(true,"setRight",BA.numberCast(float.class, _p.getField(true,"X" /*RemoteObject*/ )));};
 BA.debugLineNum = 428;BA.debugLine="If p.Y < rr.Top Then rr.Top = p.Y";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",_p.getField(true,"Y" /*RemoteObject*/ ),BA.numberCast(double.class, _rr.runMethod(true,"getTop")))) { 
_rr.runMethod(true,"setTop",BA.numberCast(float.class, _p.getField(true,"Y" /*RemoteObject*/ )));};
 BA.debugLineNum = 429;BA.debugLine="If p.Y > rr.Bottom Then rr.Bottom = p.Y";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_p.getField(true,"Y" /*RemoteObject*/ ),BA.numberCast(double.class, _rr.runMethod(true,"getBottom")))) { 
_rr.runMethod(true,"setBottom",BA.numberCast(float.class, _p.getField(true,"Y" /*RemoteObject*/ )));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 431;BA.debugLine="If clear Then";
Debug.ShouldStop(16384);
if (_clear.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 432;BA.debugLine="lst.Clear";
Debug.ShouldStop(32768);
_lst.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 434;BA.debugLine="rct = rr";
Debug.ShouldStop(131072);
_rct = _rr;Debug.locals.put("rct", _rct);
 BA.debugLineNum = 435;BA.debugLine="Return path";
Debug.ShouldStop(262144);
if (true) return _path;
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpin(RemoteObject _wsize,RemoteObject _hsize) throws Exception{
try {
		Debug.PushSubsStack("CreatePIN (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,376);
if (RapidSub.canDelegate("createpin")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","createpin", _wsize, _hsize);}
Debug.locals.put("wsize", _wsize);
Debug.locals.put("hsize", _hsize);
 BA.debugLineNum = 376;BA.debugLine="Sub CreatePIN(wsize As Int, hsize As Int) As B4XBi";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 377;BA.debugLine="Return xui.LoadBitmapResize(File.DirAssets, \"pins";
Debug.ShouldStop(16777216);
if (true) return imageedit.mostCurrent._xui.runMethod(false,"LoadBitmapResize",(Object)(imageedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pins_"),imageedit.mostCurrent._markercolorname,RemoteObject.createImmutable(".png"))),(Object)(_wsize),(Object)(_hsize),(Object)(imageedit.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpanel_touch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DrawPanel_Touch (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,480);
if (RapidSub.canDelegate("drawpanel_touch")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","drawpanel_touch", _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 480;BA.debugLine="Sub DrawPanel_Touch (Action As Int, X As Float, Y";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 481;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 482;BA.debugLine="DrawPanelTouch(Action, X, Y)";
Debug.ShouldStop(2);
_drawpaneltouch(_action,_x,_y);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",imageedit.processBA, e4.toString()); BA.debugLineNum = 484;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
imageedit.mostCurrent.__c.runVoidMethod ("LogImpl","631784964",BA.ObjectToString(imageedit.mostCurrent.__c.runMethod(false,"LastException",imageedit.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 486;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpanelclick(RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DrawPanelClick (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,690);
if (RapidSub.canDelegate("drawpanelclick")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","drawpanelclick", _x, _y);}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _rr = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _bmr = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 690;BA.debugLine="Sub DrawPanelClick(X As Int, Y As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 691;BA.debugLine="If ((bMarker)) Then";
Debug.ShouldStop(262144);
if (((imageedit._bmarker)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 692;BA.debugLine="Log(\"Marker: \" & X & \":\" & Y)";
Debug.ShouldStop(524288);
imageedit.mostCurrent.__c.runVoidMethod ("LogImpl","631981570",RemoteObject.concat(RemoteObject.createImmutable("Marker: "),_x,RemoteObject.createImmutable(":"),_y),0);
 BA.debugLineNum = 693;BA.debugLine="Dim bm As B4XBitmap = CreatePIN(30, 60)";
Debug.ShouldStop(1048576);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bm = _createpin(BA.numberCast(int.class, 30),BA.numberCast(int.class, 60));Debug.locals.put("bm", _bm);Debug.locals.put("bm", _bm);
 BA.debugLineNum = 694;BA.debugLine="Dim rr As B4XRect";
Debug.ShouldStop(2097152);
_rr = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rr", _rr);
 BA.debugLineNum = 695;BA.debugLine="rr.Initialize( X-(bm.Width/2), Y-bm.Height, (X-(";
Debug.ShouldStop(4194304);
_rr.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,(RemoteObject.solve(new RemoteObject[] {_bm.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,_bm.runMethod(true,"getHeight")}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,(RemoteObject.solve(new RemoteObject[] {_bm.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)),_bm.runMethod(true,"getWidth")}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_y,_bm.runMethod(true,"getHeight")}, "-",1, 0)),_bm.runMethod(true,"getHeight")}, "+",1, 0))));
 BA.debugLineNum = 696;BA.debugLine="SaveRectToUndo(rr)";
Debug.ShouldStop(8388608);
_saverecttoundo(_rr);
 BA.debugLineNum = 698;BA.debugLine="Dim bmr As B4XBitmap = cvs.CreateBitmap";
Debug.ShouldStop(33554432);
_bmr = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmr = imageedit.mostCurrent._cvs.runMethod(false,"CreateBitmap");Debug.locals.put("bmr", _bmr);Debug.locals.put("bmr", _bmr);
 BA.debugLineNum = 700;BA.debugLine="SaveRects.Add(BMRCreate(bmr.Crop(UndoRect.Left,";
Debug.ShouldStop(134217728);
imageedit._saverects.runVoidMethod ("Add",(Object)((_bmrcreate(_bmr.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, imageedit.mostCurrent._undorect.runMethod(true,"getLeft"))),(Object)(BA.numberCast(int.class, imageedit.mostCurrent._undorect.runMethod(true,"getTop"))),(Object)(BA.numberCast(int.class, imageedit.mostCurrent._undorect.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, imageedit.mostCurrent._undorect.runMethod(true,"getHeight")))),imageedit.mostCurrent._undorect))));
 BA.debugLineNum = 702;BA.debugLine="cvs.DrawBitmap(bm, rr)";
Debug.ShouldStop(536870912);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmap",(Object)((_bm.getObject())),(Object)(_rr));
 BA.debugLineNum = 703;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(1073741824);
imageedit.mostCurrent._cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 704;BA.debugLine="ClearUndoRect";
Debug.ShouldStop(-2147483648);
_clearundorect();
 }else {
 BA.debugLineNum = 707;BA.debugLine="Log(\"Others\")";
Debug.ShouldStop(4);
imageedit.mostCurrent.__c.runVoidMethod ("LogImpl","631981585",RemoteObject.createImmutable("Others"),0);
 };
 BA.debugLineNum = 709;BA.debugLine="memoryLabel.Text = Utils.GetFreeMem";
Debug.ShouldStop(16);
imageedit.mostCurrent._memorylabel.runMethod(true,"setText",BA.ObjectToCharSequence(imageedit.mostCurrent._utils.runMethod(true,"_getfreemem" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA)));
 BA.debugLineNum = 710;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpaneltext() throws Exception{
try {
		Debug.PushSubsStack("DrawPanelText (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,712);
if (RapidSub.canDelegate("drawpaneltext")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","drawpaneltext");}
 BA.debugLineNum = 712;BA.debugLine="Sub DrawPanelText";
Debug.ShouldStop(128);
 BA.debugLineNum = 713;BA.debugLine="If ((bText)) Then";
Debug.ShouldStop(256);
if (((imageedit._btext)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 714;BA.debugLine="TextPanel.Visible=True";
Debug.ShouldStop(512);
imageedit.mostCurrent._textpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 715;BA.debugLine="TextField.RequestFocus";
Debug.ShouldStop(1024);
imageedit.mostCurrent._textfield.runVoidMethod ("RequestFocus");
 };
 BA.debugLineNum = 718;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _drawpaneltouch(RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DrawPanelTouch (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,488);
if (RapidSub.canDelegate("drawpaneltouch")) { xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","drawpaneltouch", _action, _x, _y); return;}
ResumableSub_DrawPanelTouch rsub = new ResumableSub_DrawPanelTouch(null,_action,_x,_y);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DrawPanelTouch extends BA.ResumableSub {
public ResumableSub_DrawPanelTouch(xevolution.vrcg.devdemov2400.imageedit parent,RemoteObject _action,RemoteObject _x,RemoteObject _y) {
this.parent = parent;
this._action = _action;
this._x = _x;
this._y = _y;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.imageedit parent;
RemoteObject _action;
RemoteObject _x;
RemoteObject _y;
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _ww = RemoteObject.createImmutable(0);
RemoteObject _hh = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _textomedida = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _rrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DrawPanelTouch (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,488);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 493;BA.debugLine="If Action = DrawPanel.ACTION_DOWN Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 81;
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, parent.mostCurrent._drawpanel.getField(true,"ACTION_DOWN")))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 509;BA.debugLine="Else If Action = DrawPanel.ACTION_UP Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, parent.mostCurrent._drawpanel.getField(true,"ACTION_UP")))) { 
this.state = 17;
}else {
this.state = 62;
}}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 494;BA.debugLine="If ((bRect) Or (bShot) Or (bText) Or (bPencil))";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//if
this.state = 15;
if ((RemoteObject.solveBoolean(".",(parent._brect)) || RemoteObject.solveBoolean(".",(parent._bshot)) || RemoteObject.solveBoolean(".",(parent._btext)) || RemoteObject.solveBoolean(".",(parent._bpencil)))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 502;BA.debugLine="else If ((bCircle)) Then";
Debug.ShouldStop(2097152);
if (((parent._bcircle)).<Boolean>get().booleanValue()) { 
this.state = 14;
}}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 495;BA.debugLine="sx = X";
Debug.ShouldStop(16384);
parent._sx = BA.numberCast(int.class, _x);
 BA.debugLineNum = 496;BA.debugLine="sy = Y";
Debug.ShouldStop(32768);
parent._sy = BA.numberCast(int.class, _y);
 BA.debugLineNum = 497;BA.debugLine="If (bPencil) And (bb_PencilFree) Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(".",(parent._bpencil)) && RemoteObject.solveBoolean(".",(parent._bb_pencilfree))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 499;BA.debugLine="else if (bPencil) And (bb_PencilDistance) Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",(parent._bpencil)) && RemoteObject.solveBoolean(".",(parent._bb_pencildistance))) { 
this.state = 11;
}}
if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 498;BA.debugLine="PointsMap.Add( PointMakeImg(sx, sy) )";
Debug.ShouldStop(131072);
parent.mostCurrent._pointsmap.runVoidMethod ("Add",(Object)((_pointmakeimg(parent._sx,parent._sy))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 500;BA.debugLine="StartMetric = PointMakeImg(sx, sy)";
Debug.ShouldStop(524288);
parent.mostCurrent._startmetric = _pointmakeimg(parent._sx,parent._sy);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 503;BA.debugLine="x1 = X";
Debug.ShouldStop(4194304);
parent._x1 = BA.numberCast(int.class, _x);
 BA.debugLineNum = 504;BA.debugLine="y1 = Y";
Debug.ShouldStop(8388608);
parent._y1 = BA.numberCast(int.class, _y);
 if (true) break;

case 15:
//C
this.state = 81;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 511;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
Debug.ShouldStop(1073741824);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bm = parent.mostCurrent._cvs.runMethod(false,"CreateBitmap");Debug.locals.put("bm", _bm);Debug.locals.put("bm", _bm);
 BA.debugLineNum = 512;BA.debugLine="If isUndoRect Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 18:
//if
this.state = 28;
if (_isundorect().<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 514;BA.debugLine="Dim ww As Int = UndoRect.Width";
Debug.ShouldStop(2);
_ww = BA.numberCast(int.class, parent.mostCurrent._undorect.runMethod(true,"getWidth"));Debug.locals.put("ww", _ww);Debug.locals.put("ww", _ww);
 BA.debugLineNum = 515;BA.debugLine="Dim hh As Int = UndoRect.Height";
Debug.ShouldStop(4);
_hh = BA.numberCast(int.class, parent.mostCurrent._undorect.runMethod(true,"getHeight"));Debug.locals.put("hh", _hh);Debug.locals.put("hh", _hh);
 BA.debugLineNum = 516;BA.debugLine="If ww = 0 Then";
Debug.ShouldStop(8);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_ww,BA.numberCast(double.class, 0))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 517;BA.debugLine="ww = 1";
Debug.ShouldStop(16);
_ww = BA.numberCast(int.class, 1);Debug.locals.put("ww", _ww);
 BA.debugLineNum = 518;BA.debugLine="UndoRect.Width = ww";
Debug.ShouldStop(32);
parent.mostCurrent._undorect.runMethod(true,"setWidth",_ww);
 if (true) break;
;
 BA.debugLineNum = 520;BA.debugLine="If hh = 0 Then";
Debug.ShouldStop(128);

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_hh,BA.numberCast(double.class, 0))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 521;BA.debugLine="hh = 1";
Debug.ShouldStop(256);
_hh = BA.numberCast(int.class, 1);Debug.locals.put("hh", _hh);
 BA.debugLineNum = 522;BA.debugLine="UndoRect.Height = hh";
Debug.ShouldStop(512);
parent.mostCurrent._undorect.runMethod(true,"setHeight",BA.numberCast(float.class, _hh));
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 524;BA.debugLine="SaveRects.Add(BMRCreate(bm.Crop(UndoRect.Left,";
Debug.ShouldStop(2048);
parent._saverects.runVoidMethod ("Add",(Object)((_bmrcreate(_bm.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, parent.mostCurrent._undorect.runMethod(true,"getLeft"))),(Object)(BA.numberCast(int.class, parent.mostCurrent._undorect.runMethod(true,"getTop"))),(Object)(BA.numberCast(int.class, parent.mostCurrent._undorect.runMethod(true,"getWidth"))),(Object)(_hh)),parent.mostCurrent._undorect))));
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 527;BA.debugLine="CurrIndex = CurrIndex + 1";
Debug.ShouldStop(16384);
parent._currindex = RemoteObject.solve(new RemoteObject[] {parent._currindex,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 529;BA.debugLine="If ((bRect) Or (bShot) Or (bText) Or (bPencil))";
Debug.ShouldStop(65536);
if (true) break;

case 29:
//if
this.state = 60;
if ((RemoteObject.solveBoolean(".",(parent._brect)) || RemoteObject.solveBoolean(".",(parent._bshot)) || RemoteObject.solveBoolean(".",(parent._btext)) || RemoteObject.solveBoolean(".",(parent._bpencil)))) { 
this.state = 31;
}else 
{ BA.debugLineNum = 585;BA.debugLine="Else If ((bCircle)) Then";
Debug.ShouldStop(256);
if (((parent._bcircle)).<Boolean>get().booleanValue()) { 
this.state = 55;
}else 
{ BA.debugLineNum = 596;BA.debugLine="Else If ((bMarker)) Then";
Debug.ShouldStop(524288);
if (((parent._bmarker)).<Boolean>get().booleanValue()) { 
this.state = 57;
}else 
{ BA.debugLineNum = 613;BA.debugLine="Else If ((bCamera)) Then";
Debug.ShouldStop(16);
if (((parent._bcamera)).<Boolean>get().booleanValue()) { 
this.state = 59;
}}}}
if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 530;BA.debugLine="If ((bRect)) Then";
Debug.ShouldStop(131072);
if (true) break;

case 32:
//if
this.state = 53;
if (((parent._brect)).<Boolean>get().booleanValue()) { 
this.state = 34;
}else 
{ BA.debugLineNum = 532;BA.debugLine="else if ((bShot)) Then";
Debug.ShouldStop(524288);
if (((parent._bshot)).<Boolean>get().booleanValue()) { 
this.state = 36;
}else 
{ BA.debugLineNum = 543;BA.debugLine="Else if (bPencil) Then";
Debug.ShouldStop(1073741824);
if ((parent._bpencil).<Boolean>get().booleanValue()) { 
this.state = 38;
}else {
this.state = 52;
}}}
if (true) break;

case 34:
//C
this.state = 53;
 BA.debugLineNum = 531;BA.debugLine="cvs.DrawRect(DrawingRect, LineColor, False, Li";
Debug.ShouldStop(262144);
parent.mostCurrent._cvs.runVoidMethod ("DrawRect",(Object)(parent.mostCurrent._drawingrect),(Object)(parent._linecolor),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._linewidth)));
 if (true) break;

case 36:
//C
this.state = 53;
 BA.debugLineNum = 539;BA.debugLine="ShowImage.SetBackgroundImage(bm.Crop(DrawingRe";
Debug.ShouldStop(67108864);
parent.mostCurrent._showimage.runVoidMethod ("SetBackgroundImageNew",(Object)((_bm.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, parent.mostCurrent._drawingrect.runMethod(true,"getLeft"))),(Object)(BA.numberCast(int.class, parent.mostCurrent._drawingrect.runMethod(true,"getTop"))),(Object)(BA.numberCast(int.class, parent.mostCurrent._drawingrect.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, parent.mostCurrent._drawingrect.runMethod(true,"getHeight")))).getObject())));
 BA.debugLineNum = 540;BA.debugLine="LockPanel.Visible = True";
Debug.ShouldStop(134217728);
parent.mostCurrent._lockpanel.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 541;BA.debugLine="ShowPanel.Visible = True";
Debug.ShouldStop(268435456);
parent.mostCurrent._showpanel.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 544;BA.debugLine="If (bb_PencilLine) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 39:
//if
this.state = 50;
if ((parent._bb_pencilline).<Boolean>get().booleanValue()) { 
this.state = 41;
}else 
{ BA.debugLineNum = 550;BA.debugLine="Else If (bb_PencilDistance) Then";
Debug.ShouldStop(32);
if ((parent._bb_pencildistance).<Boolean>get().booleanValue()) { 
this.state = 43;
}else {
this.state = 49;
}}
if (true) break;

case 41:
//C
this.state = 50;
 BA.debugLineNum = 545;BA.debugLine="Dim P As B4XPath";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("P", _p);
 BA.debugLineNum = 546;BA.debugLine="P.Initialize(sx, sy)";
Debug.ShouldStop(2);
_p.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, parent._sx)),(Object)(BA.numberCast(float.class, parent._sy)));
 BA.debugLineNum = 547;BA.debugLine="P.LineTo(X, Y)";
Debug.ShouldStop(4);
_p.runVoidMethod ("LineTo",(Object)(_x),(Object)(_y));
 BA.debugLineNum = 548;BA.debugLine="cvs.DrawPath(P, LineColor, False, LineWidth)";
Debug.ShouldStop(8);
parent.mostCurrent._cvs.runVoidMethod ("DrawPath",(Object)(_p),(Object)(parent._linecolor),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._linewidth)));
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 551;BA.debugLine="Dim P As B4XPath";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("P", _p);
 BA.debugLineNum = 552;BA.debugLine="P.Initialize(sx, sy)";
Debug.ShouldStop(128);
_p.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, parent._sx)),(Object)(BA.numberCast(float.class, parent._sy)));
 BA.debugLineNum = 553;BA.debugLine="P.LineTo(X, Y)";
Debug.ShouldStop(256);
_p.runVoidMethod ("LineTo",(Object)(_x),(Object)(_y));
 BA.debugLineNum = 554;BA.debugLine="cvs.DrawPath(P, LineColor, False, LineWidth)";
Debug.ShouldStop(512);
parent.mostCurrent._cvs.runVoidMethod ("DrawPath",(Object)(_p),(Object)(parent._linecolor),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._linewidth)));
 BA.debugLineNum = 556;BA.debugLine="Dim TextoMedida As String = \"\"";
Debug.ShouldStop(2048);
_textomedida = BA.ObjectToString("");Debug.locals.put("TextoMedida", _textomedida);Debug.locals.put("TextoMedida", _textomedida);
 BA.debugLineNum = 558;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Intr";
Debug.ShouldStop(8192);
_sf = parent.mostCurrent._appldialog.runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Introduza a medida")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cancelar")),imageedit.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 559;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorSub, Co";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(_sf),(Object)(parent.mostCurrent._consts._colorsub /*RemoteObject*/ ),(Object)(parent.mostCurrent._consts._colormain /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 560;BA.debugLine="ApplDialog.SetSize(350dip, 250dip)";
Debug.ShouldStop(32768);
parent.mostCurrent._appldialog.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350)))),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 561;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", imageedit.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "imageedit", "drawpaneltouch"), _sf);
this.state = 82;
return;
case 82:
//C
this.state = 44;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 562;BA.debugLine="pnl.LoadLayout(\"Dialog_Item_InputText\")";
Debug.ShouldStop(131072);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Dialog_Item_InputText")),imageedit.mostCurrent.activityBA);
 BA.debugLineNum = 563;BA.debugLine="IntputTextField.Text = \"\"";
Debug.ShouldStop(262144);
parent.mostCurrent._intputtextfield.runMethod(true,"setText",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 564;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_result", imageedit.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "imageedit", "drawpaneltouch"), _sf);
this.state = 83;
return;
case 83:
//C
this.state = 44;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 565;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
if (true) break;

case 44:
//if
this.state = 47;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 566;BA.debugLine="TextoMedida = IntputTextField.Text";
Debug.ShouldStop(2097152);
_textomedida = parent.mostCurrent._intputtextfield.runMethod(true,"getText");Debug.locals.put("TextoMedida", _textomedida);
 if (true) break;

case 47:
//C
this.state = 50;
;
 BA.debugLineNum = 568;BA.debugLine="Dim rRect As B4XRect";
Debug.ShouldStop(8388608);
_rrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rRect", _rrect);
 BA.debugLineNum = 569;BA.debugLine="rRect.Initialize(StartMetric.X, StartMetric.Y";
Debug.ShouldStop(16777216);
_rrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, parent.mostCurrent._startmetric.getField(true,"X" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, parent.mostCurrent._startmetric.getField(true,"Y" /*RemoteObject*/ ))),(Object)(_x),(Object)(_y));
 BA.debugLineNum = 570;BA.debugLine="Dim f As B4XFont = xui.CreateFont(TextField.T";
Debug.ShouldStop(33554432);
_f = parent.mostCurrent._xui.runMethod(false,"CreateFont",(Object)(parent.mostCurrent._textfield.runMethod(false,"getTypeface")),(Object)(BA.numberCast(float.class, parent._fontsize)));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 572;BA.debugLine="DrawTextWithBorder3(cvs, TextoMedida, f, Line";
Debug.ShouldStop(134217728);
_drawtextwithborder3(parent.mostCurrent._cvs,_textomedida,_f,parent._linecolor,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_rrect.runMethod(true,"getLeft"),_rrect.runMethod(true,"getRight")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_rrect.runMethod(true,"getTop"),_rrect.runMethod(true,"getBottom")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 573;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(268435456);
parent.mostCurrent._cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 575;BA.debugLine="StartMetric = PointMakeImg(0, 0)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._startmetric = _pointmakeimg(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 577;BA.debugLine="Dim P As B4XPath = CreateLinePoints(PointsMap";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
_p = _createlinepoints(parent.mostCurrent._pointsmap,parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent._undorect);Debug.locals.put("P", _p);Debug.locals.put("P", _p);
 BA.debugLineNum = 578;BA.debugLine="cvs.DrawPath(P, LineColor, False, LineWidth)";
Debug.ShouldStop(2);
parent.mostCurrent._cvs.runVoidMethod ("DrawPath",(Object)(_p),(Object)(parent._linecolor),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._linewidth)));
 if (true) break;

case 50:
//C
this.state = 53;
;
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 583;BA.debugLine="DrawPanelText";
Debug.ShouldStop(64);
_drawpaneltext();
 if (true) break;

case 53:
//C
this.state = 60;
;
 if (true) break;

case 55:
//C
this.state = 60;
 BA.debugLineNum = 586;BA.debugLine="x0 = X";
Debug.ShouldStop(512);
parent._x0 = BA.numberCast(int.class, _x);
 BA.debugLineNum = 587;BA.debugLine="y0 = Y";
Debug.ShouldStop(1024);
parent._y0 = BA.numberCast(int.class, _y);
 BA.debugLineNum = 588;BA.debugLine="DrawingRect.Left = x1";
Debug.ShouldStop(2048);
parent.mostCurrent._drawingrect.runMethod(true,"setLeft",BA.numberCast(float.class, parent._x1));
 BA.debugLineNum = 589;BA.debugLine="DrawingRect.Top = y1";
Debug.ShouldStop(4096);
parent.mostCurrent._drawingrect.runMethod(true,"setTop",BA.numberCast(float.class, parent._y1));
 BA.debugLineNum = 590;BA.debugLine="DrawingRect.Right = x0";
Debug.ShouldStop(8192);
parent.mostCurrent._drawingrect.runMethod(true,"setRight",BA.numberCast(float.class, parent._x0));
 BA.debugLineNum = 591;BA.debugLine="DrawingRect.Bottom = y0";
Debug.ShouldStop(16384);
parent.mostCurrent._drawingrect.runMethod(true,"setBottom",BA.numberCast(float.class, parent._y0));
 BA.debugLineNum = 592;BA.debugLine="r0 = Sqrt(Power(x0 - x1, 2) + Power(y0 - y1, 2)";
Debug.ShouldStop(32768);
parent._r0 = BA.numberCast(int.class, parent.mostCurrent.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent._x0,parent._x1}, "-",1, 1))),(Object)(BA.numberCast(double.class, 2))),parent.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent._y0,parent._y1}, "-",1, 1))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));
 BA.debugLineNum = 593;BA.debugLine="cvs.DrawCircle(x1, y1, r0, LineColor, False, Ci";
Debug.ShouldStop(65536);
parent.mostCurrent._cvs.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, parent._x1)),(Object)(BA.numberCast(float.class, parent._y1)),(Object)(BA.numberCast(float.class, parent._r0)),(Object)(parent._linecolor),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._circlestroke)));
 BA.debugLineNum = 594;BA.debugLine="x0 = x1";
Debug.ShouldStop(131072);
parent._x0 = parent._x1;
 BA.debugLineNum = 595;BA.debugLine="y0 = y1";
Debug.ShouldStop(262144);
parent._y0 = parent._y1;
 if (true) break;

case 57:
//C
this.state = 60;
 BA.debugLineNum = 606;BA.debugLine="CurrIndex = CurrIndex + 1";
Debug.ShouldStop(536870912);
parent._currindex = RemoteObject.solve(new RemoteObject[] {parent._currindex,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 608;BA.debugLine="DrawPanelClick(X, Y)";
Debug.ShouldStop(-2147483648);
_drawpanelclick(BA.numberCast(int.class, _x),BA.numberCast(int.class, _y));
 BA.debugLineNum = 610;BA.debugLine="CheckStates";
Debug.ShouldStop(2);
_checkstates();
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 614;BA.debugLine="CurrIndex = CurrIndex + 1";
Debug.ShouldStop(32);
parent._currindex = RemoteObject.solve(new RemoteObject[] {parent._currindex,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 615;BA.debugLine="InnerCounter = InnerCounter + 1";
Debug.ShouldStop(64);
parent._innercounter = RemoteObject.solve(new RemoteObject[] {parent._innercounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 616;BA.debugLine="Touch_X = X";
Debug.ShouldStop(128);
parent._touch_x = BA.numberCast(int.class, _x);
 BA.debugLineNum = 617;BA.debugLine="Touch_Y = Y";
Debug.ShouldStop(256);
parent._touch_y = BA.numberCast(int.class, _y);
 BA.debugLineNum = 618;BA.debugLine="CallSubDelayed2(CameraActivity_InnerShot, \"Star";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",imageedit.processBA,(Object)((parent.mostCurrent._cameraactivity_innershot.getObject())),(Object)(BA.ObjectToString("StartCameraInner")),(Object)((parent._innercounter)));
 BA.debugLineNum = 619;BA.debugLine="CheckStates";
Debug.ShouldStop(1024);
_checkstates();
 if (true) break;

case 60:
//C
this.state = 81;
;
 BA.debugLineNum = 622;BA.debugLine="DrawingCanvas.ClearRect(DrawingCanvas.TargetRect";
Debug.ShouldStop(8192);
parent.mostCurrent._drawingcanvas.runVoidMethod ("ClearRect",(Object)(parent.mostCurrent._drawingcanvas.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 623;BA.debugLine="ClearUndoRect";
Debug.ShouldStop(16384);
_clearundorect();
 BA.debugLineNum = 624;BA.debugLine="CheckStates";
Debug.ShouldStop(32768);
_checkstates();
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 629;BA.debugLine="If Action = DrawPanel.ACTION_MOVE Then";
Debug.ShouldStop(1048576);
if (true) break;

case 63:
//if
this.state = 80;
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, parent.mostCurrent._drawpanel.getField(true,"ACTION_MOVE")))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 631;BA.debugLine="DrawingCanvas.ClearRect(DrawingCanvas.TargetRec";
Debug.ShouldStop(4194304);
parent.mostCurrent._drawingcanvas.runVoidMethod ("ClearRect",(Object)(parent.mostCurrent._drawingcanvas.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 634;BA.debugLine="If ((bRect) Or (bShot) Or (bText)) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 66:
//if
this.state = 79;
if ((RemoteObject.solveBoolean(".",(parent._brect)) || RemoteObject.solveBoolean(".",(parent._bshot)) || RemoteObject.solveBoolean(".",(parent._btext)))) { 
this.state = 68;
}else 
{ BA.debugLineNum = 644;BA.debugLine="Else if (bPencil) Then";
Debug.ShouldStop(8);
if ((parent._bpencil).<Boolean>get().booleanValue()) { 
this.state = 70;
}else 
{ BA.debugLineNum = 665;BA.debugLine="else If ((bCircle)) Then";
Debug.ShouldStop(16777216);
if (((parent._bcircle)).<Boolean>get().booleanValue()) { 
this.state = 78;
}}}
if (true) break;

case 68:
//C
this.state = 79;
 BA.debugLineNum = 636;BA.debugLine="DrawingRect.Left = Min(sx, X)";
Debug.ShouldStop(134217728);
parent.mostCurrent._drawingrect.runMethod(true,"setLeft",BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, parent._sx)),(Object)(BA.numberCast(double.class, _x)))));
 BA.debugLineNum = 637;BA.debugLine="DrawingRect.Right = Max(sx, X)";
Debug.ShouldStop(268435456);
parent.mostCurrent._drawingrect.runMethod(true,"setRight",BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, parent._sx)),(Object)(BA.numberCast(double.class, _x)))));
 BA.debugLineNum = 638;BA.debugLine="DrawingRect.Top = Min(sy, Y)";
Debug.ShouldStop(536870912);
parent.mostCurrent._drawingrect.runMethod(true,"setTop",BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, parent._sy)),(Object)(BA.numberCast(double.class, _y)))));
 BA.debugLineNum = 639;BA.debugLine="DrawingRect.Bottom = Max(sy, Y)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._drawingrect.runMethod(true,"setBottom",BA.numberCast(float.class, parent.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, parent._sy)),(Object)(BA.numberCast(double.class, _y)))));
 BA.debugLineNum = 640;BA.debugLine="DrawingCanvas.DrawRect(DrawingRect, Colors.Whi";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._drawingcanvas.runVoidMethod ("DrawRect",(Object)(parent.mostCurrent._drawingrect),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._linewidth)));
 BA.debugLineNum = 642;BA.debugLine="SaveRectToUndo(DrawingRect)";
Debug.ShouldStop(2);
_saverecttoundo(parent.mostCurrent._drawingrect);
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 645;BA.debugLine="PointsMap.Add( PointMakeImg(X, Y) )";
Debug.ShouldStop(16);
parent.mostCurrent._pointsmap.runVoidMethod ("Add",(Object)((_pointmakeimg(BA.numberCast(int.class, _x),BA.numberCast(int.class, _y)))));
 BA.debugLineNum = 646;BA.debugLine="Dim R As B4XRect";
Debug.ShouldStop(32);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("R", _r);
 BA.debugLineNum = 647;BA.debugLine="R.Initialize(sx, sy, X, Y)";
Debug.ShouldStop(64);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, parent._sx)),(Object)(BA.numberCast(float.class, parent._sy)),(Object)(_x),(Object)(_y));
 BA.debugLineNum = 648;BA.debugLine="DrawingCanvas.ClearRect(R)";
Debug.ShouldStop(128);
parent.mostCurrent._drawingcanvas.runVoidMethod ("ClearRect",(Object)(_r));
 BA.debugLineNum = 650;BA.debugLine="SaveRectToUndo(R)";
Debug.ShouldStop(512);
_saverecttoundo(_r);
 BA.debugLineNum = 652;BA.debugLine="If (bb_PencilLine) Or (bb_PencilDistance) Then";
Debug.ShouldStop(2048);
if (true) break;

case 71:
//if
this.state = 76;
if (RemoteObject.solveBoolean(".",(parent._bb_pencilline)) || RemoteObject.solveBoolean(".",(parent._bb_pencildistance))) { 
this.state = 73;
}else {
this.state = 75;
}if (true) break;

case 73:
//C
this.state = 76;
 BA.debugLineNum = 653;BA.debugLine="Dim P As B4XPath";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("P", _p);
 BA.debugLineNum = 654;BA.debugLine="P.Initialize(sx, sy)";
Debug.ShouldStop(8192);
_p.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, parent._sx)),(Object)(BA.numberCast(float.class, parent._sy)));
 BA.debugLineNum = 655;BA.debugLine="P.LineTo(X, Y)";
Debug.ShouldStop(16384);
_p.runVoidMethod ("LineTo",(Object)(_x),(Object)(_y));
 BA.debugLineNum = 656;BA.debugLine="DrawingCanvas.DrawPath(P, Colors.White, False";
Debug.ShouldStop(32768);
parent.mostCurrent._drawingcanvas.runVoidMethod ("DrawPath",(Object)(_p),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._linewidth)));
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 659;BA.debugLine="Dim P As B4XPath = CreateLinePoints(PointsMap";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
_p = _createlinepoints(parent.mostCurrent._pointsmap,parent.mostCurrent.__c.getField(true,"False"),_r);Debug.locals.put("P", _p);Debug.locals.put("P", _p);
 BA.debugLineNum = 660;BA.debugLine="SaveRectToUndo(R)";
Debug.ShouldStop(524288);
_saverecttoundo(_r);
 BA.debugLineNum = 661;BA.debugLine="DrawingCanvas.DrawPath(P, Colors.White, False";
Debug.ShouldStop(1048576);
parent.mostCurrent._drawingcanvas.runVoidMethod ("DrawPath",(Object)(_p),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._linewidth)));
 if (true) break;

case 76:
//C
this.state = 79;
;
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 666;BA.debugLine="DrawingRect.Left = x1";
Debug.ShouldStop(33554432);
parent.mostCurrent._drawingrect.runMethod(true,"setLeft",BA.numberCast(float.class, parent._x1));
 BA.debugLineNum = 667;BA.debugLine="DrawingRect.Right = X";
Debug.ShouldStop(67108864);
parent.mostCurrent._drawingrect.runMethod(true,"setRight",_x);
 BA.debugLineNum = 668;BA.debugLine="DrawingRect.Top = y1";
Debug.ShouldStop(134217728);
parent.mostCurrent._drawingrect.runMethod(true,"setTop",BA.numberCast(float.class, parent._y1));
 BA.debugLineNum = 669;BA.debugLine="DrawingRect.Bottom = Y";
Debug.ShouldStop(268435456);
parent.mostCurrent._drawingrect.runMethod(true,"setBottom",_y);
 BA.debugLineNum = 670;BA.debugLine="SaveRectToUndo(DrawingRect)";
Debug.ShouldStop(536870912);
_saverecttoundo(parent.mostCurrent._drawingrect);
 BA.debugLineNum = 671;BA.debugLine="x0 = X";
Debug.ShouldStop(1073741824);
parent._x0 = BA.numberCast(int.class, _x);
 BA.debugLineNum = 672;BA.debugLine="y0 = Y";
Debug.ShouldStop(-2147483648);
parent._y0 = BA.numberCast(int.class, _y);
 BA.debugLineNum = 673;BA.debugLine="r0 = Sqrt(Power(x0 - x1, 2) + Power(y0 - y1, 2";
Debug.ShouldStop(1);
parent._r0 = BA.numberCast(int.class, parent.mostCurrent.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent._x0,parent._x1}, "-",1, 1))),(Object)(BA.numberCast(double.class, 2))),parent.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent._y0,parent._y1}, "-",1, 1))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));
 BA.debugLineNum = 675;BA.debugLine="DrawingCanvas.DrawCircle(x1, y1, r0, Colors.Wh";
Debug.ShouldStop(4);
parent.mostCurrent._drawingcanvas.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, parent._x1)),(Object)(BA.numberCast(float.class, parent._y1)),(Object)(BA.numberCast(float.class, parent._r0)),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, parent._circlestroke)));
 if (true) break;

case 79:
//C
this.state = 80;
;
 BA.debugLineNum = 679;BA.debugLine="DrawPanel.Invalidate";
Debug.ShouldStop(64);
parent.mostCurrent._drawpanel.runVoidMethod ("Invalidate");
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;

case 81:
//C
this.state = -1;
;
 BA.debugLineNum = 682;BA.debugLine="memoryLabel.Text = Utils.GetFreeMem";
Debug.ShouldStop(512);
parent.mostCurrent._memorylabel.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._utils.runMethod(true,"_getfreemem" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA)));
 BA.debugLineNum = 683;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static void  _dialog_ready(RemoteObject _pnl) throws Exception{
}
public static void  _dialog_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _drawtextwithborder(RemoteObject _cvs1,RemoteObject _text,RemoteObject _fnt,RemoteObject _clr,RemoteObject _centerx,RemoteObject _centery,RemoteObject _border,RemoteObject _bline) throws Exception{
try {
		Debug.PushSubsStack("DrawTextWithBorder (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1005);
if (RapidSub.canDelegate("drawtextwithborder")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","drawtextwithborder", _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
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
 BA.debugLineNum = 1005;BA.debugLine="Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1007;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(16384);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 1008;BA.debugLine="Dim baseline As Int = CenterY - r.Height / 2 - r.";
Debug.ShouldStop(32768);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 1009;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(65536);
_cvs1.runVoidMethod ("DrawText",imageedit.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 1012;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(524288);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 1013;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1014;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(2097152);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 1016;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1017;BA.debugLine="cvs1.DrawRect(r, Clr, False, border)";
Debug.ShouldStop(16777216);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(_clr),(Object)(imageedit.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 1019;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("DrawTextWithBorder2 (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1021);
if (RapidSub.canDelegate("drawtextwithborder2")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","drawtextwithborder2", _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
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
 BA.debugLineNum = 1021;BA.debugLine="Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1023;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(1073741824);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 1024;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
Debug.ShouldStop(-2147483648);
_r.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 1025;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
Debug.ShouldStop(1);
_r.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 1027;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
Debug.ShouldStop(4);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),_fnt.runMethod(true,"getSize")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),_r.runMethod(true,"getTop")}, "--",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 1029;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(16);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 1030;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1031;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(64);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 1033;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1034;BA.debugLine="Dim ro As B4XRect";
Debug.ShouldStop(512);
_ro = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("ro", _ro);
 BA.debugLineNum = 1035;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
Debug.ShouldStop(1024);
_ro.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getLeft"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getRight"),_border}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getBottom"),_border}, "+",1, 0))));
 BA.debugLineNum = 1036;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
Debug.ShouldStop(2048);
_cvs1.runVoidMethod ("DrawRect",(Object)(_ro),(Object)(_clr),(Object)(imageedit.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 BA.debugLineNum = 1037;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
Debug.ShouldStop(4096);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(imageedit.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(imageedit.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 1040;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(32768);
_cvs1.runVoidMethod ("DrawText",imageedit.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 1041;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtextwithborder3(RemoteObject _cvs1,RemoteObject _text,RemoteObject _fnt,RemoteObject _clr,RemoteObject _centerx,RemoteObject _centery) throws Exception{
try {
		Debug.PushSubsStack("DrawTextWithBorder3 (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1043);
if (RapidSub.canDelegate("drawtextwithborder3")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","drawtextwithborder3", _cvs1, _text, _fnt, _clr, _centerx, _centery);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
Debug.locals.put("cvs1", _cvs1);
Debug.locals.put("Text", _text);
Debug.locals.put("Fnt", _fnt);
Debug.locals.put("Clr", _clr);
Debug.locals.put("CenterX", _centerx);
Debug.locals.put("CenterY", _centery);
 BA.debugLineNum = 1043;BA.debugLine="Sub DrawTextWithBorder3 (cvs1 As B4XCanvas, Text A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1044;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(524288);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 1045;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
Debug.ShouldStop(1048576);
_r.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 1046;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
Debug.ShouldStop(2097152);
_r.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 1047;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
Debug.ShouldStop(4194304);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),_fnt.runMethod(true,"getSize")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),_r.runMethod(true,"getTop")}, "--",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 1048;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(8388608);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 1049;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, 0)";
Debug.ShouldStop(16777216);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(imageedit.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(imageedit.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 1050;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(33554432);
_cvs1.runVoidMethod ("DrawText",imageedit.processBA,(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 1051;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _forceclose() throws Exception{
try {
		Debug.PushSubsStack("ForceClose (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1307);
if (RapidSub.canDelegate("forceclose")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","forceclose");}
 BA.debugLineNum = 1307;BA.debugLine="Sub ForceClose";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1308;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
imageedit.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1310;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
imageedit.mostCurrent._appldialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
 //BA.debugLineNum = 23;BA.debugLine="Private IntputTextField As FloatLabeledEditText";
imageedit.mostCurrent._intputtextfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private StartMetric As Point";
imageedit.mostCurrent._startmetric = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._point");
 //BA.debugLineNum = 25;BA.debugLine="Private xui As XUI";
imageedit.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 26;BA.debugLine="Private smiley As B4XBitmap";
imageedit.mostCurrent._smiley = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private deg, vx = 10dip, vy = 10dip As Double";
imageedit._deg = RemoteObject.createImmutable(0);
imageedit._vx = BA.numberCast(double.class, imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
imageedit._vy = BA.numberCast(double.class, imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
 //BA.debugLineNum = 28;BA.debugLine="Private SmileyRect As B4XRect";
imageedit.mostCurrent._smileyrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
 //BA.debugLineNum = 29;BA.debugLine="Private size As Double = 40dip";
imageedit._size = BA.numberCast(double.class, imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 //BA.debugLineNum = 30;BA.debugLine="Private ImagePanel As B4XView";
imageedit.mostCurrent._imagepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private DrawPanel As Panel";
imageedit.mostCurrent._drawpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelTemp As Panel";
imageedit.mostCurrent._paneltemp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private cvs As B4XCanvas";
imageedit.mostCurrent._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");
 //BA.debugLineNum = 34;BA.debugLine="Private isB64Image As Boolean = False";
imageedit._isb64image = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 35;BA.debugLine="Private RetToCamera As Boolean = False";
imageedit._rettocamera = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 37;BA.debugLine="Private UndoBMR As BMR";
imageedit.mostCurrent._undobmr = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._bmr");
 //BA.debugLineNum = 39;BA.debugLine="Private DrawingCanvas As B4XCanvas";
imageedit.mostCurrent._drawingcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");
 //BA.debugLineNum = 40;BA.debugLine="Private UndoRect, DrawingRect, cvsRect As B4XRect";
imageedit.mostCurrent._undorect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
imageedit.mostCurrent._drawingrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
imageedit.mostCurrent._cvsrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
 //BA.debugLineNum = 41;BA.debugLine="Private sx, sy As Int";
imageedit._sx = RemoteObject.createImmutable(0);
imageedit._sy = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 42;BA.debugLine="Private CurrIndex  As Int = 0";
imageedit._currindex = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 43;BA.debugLine="Private XPosis, YPosis As Int";
imageedit._xposis = RemoteObject.createImmutable(0);
imageedit._yposis = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 45;BA.debugLine="Private MarkerColorName As String = \"blue\"";
imageedit.mostCurrent._markercolorname = BA.ObjectToString("blue");
 //BA.debugLineNum = 46;BA.debugLine="Private LineColor As Int = Colors.Blue";
imageedit._linecolor = imageedit.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue");
 //BA.debugLineNum = 47;BA.debugLine="Private LineWidth As Int = 3dip";
imageedit._linewidth = imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)));
 //BA.debugLineNum = 48;BA.debugLine="Private FontSize As Int = 16";
imageedit._fontsize = BA.numberCast(int.class, 16);
 //BA.debugLineNum = 51;BA.debugLine="Private x0 = 50%x As Int";
imageedit._x0 = imageedit.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),imageedit.mostCurrent.activityBA);
 //BA.debugLineNum = 52;BA.debugLine="Private y0 = 50%y As Int";
imageedit._y0 = imageedit.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),imageedit.mostCurrent.activityBA);
 //BA.debugLineNum = 53;BA.debugLine="Private r0 = 50dip As Int";
imageedit._r0 = imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)));
 //BA.debugLineNum = 54;BA.debugLine="Private x1, y1 As Int";
imageedit._x1 = RemoteObject.createImmutable(0);
imageedit._y1 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 55;BA.debugLine="Private CircleStroke = 3dip As Int        			' ci";
imageedit._circlestroke = imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)));
 //BA.debugLineNum = 56;BA.debugLine="Private CircleColor As Int";
imageedit._circlecolor = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 58;BA.debugLine="Private MakeUndo As Boolean = False";
imageedit._makeundo = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 59;BA.debugLine="Private PointsMap As List";
imageedit.mostCurrent._pointsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 61;BA.debugLine="Private bCamera As Boolean = False";
imageedit._bcamera = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 62;BA.debugLine="Private bPencil As Boolean = False";
imageedit._bpencil = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 63;BA.debugLine="Private bRect As Boolean = False";
imageedit._brect = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 64;BA.debugLine="Private bCircle As Boolean = False";
imageedit._bcircle = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 65;BA.debugLine="Private bMarker As Boolean = False";
imageedit._bmarker = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 66;BA.debugLine="Private bText As Boolean = False";
imageedit._btext = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 67;BA.debugLine="Private bShot As Boolean = False";
imageedit._bshot = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 68;BA.debugLine="Private bOCR As Boolean = False";
imageedit._bocr = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 69;BA.debugLine="Private bBarcode As Boolean = False";
imageedit._bbarcode = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 71;BA.debugLine="Private bb_BCBarcode As Boolean = False";
imageedit._bb_bcbarcode = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 72;BA.debugLine="Private bb_BCQRCode As Boolean = False";
imageedit._bb_bcqrcode = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 73;BA.debugLine="Private bb_BCStamp As Boolean = False";
imageedit._bb_bcstamp = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 74;BA.debugLine="Private bb_PINFoto As Boolean = False";
imageedit._bb_pinfoto = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 75;BA.debugLine="Private bb_PINMarker As Boolean = False";
imageedit._bb_pinmarker = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 76;BA.debugLine="Private bb_PINText As Boolean = False";
imageedit._bb_pintext = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 77;BA.debugLine="Private bb_PencilDistance As Boolean = False";
imageedit._bb_pencildistance = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 78;BA.debugLine="Private bb_PencilFree As Boolean = False";
imageedit._bb_pencilfree = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 79;BA.debugLine="Private bb_PencilLine As Boolean = False";
imageedit._bb_pencilline = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 80;BA.debugLine="Private bb_Barcode As Boolean = False";
imageedit._bb_barcode = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 81;BA.debugLine="Private bb_OCRFindAll As Boolean = False";
imageedit._bb_ocrfindall = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 82;BA.debugLine="Private bb_OCRFindSelect As Boolean = False";
imageedit._bb_ocrfindselect = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 85;BA.debugLine="Private HideMe As Button";
imageedit.mostCurrent._hideme = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private ShowImage As ImageView";
imageedit.mostCurrent._showimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private ShowPanel As Panel";
imageedit.mostCurrent._showpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private butCircle As Button";
imageedit.mostCurrent._butcircle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private butMarker As Button";
imageedit.mostCurrent._butmarker = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private butRect As Button";
imageedit.mostCurrent._butrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private butShot As Button";
imageedit.mostCurrent._butshot = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private butText As Button";
imageedit.mostCurrent._buttext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private memoryLabel As Label";
imageedit.mostCurrent._memorylabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private ColorBlack As Button";
imageedit.mostCurrent._colorblack = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private ColorBlue As Button";
imageedit.mostCurrent._colorblue = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private ColorGrey As Button";
imageedit.mostCurrent._colorgrey = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private ColorOrange As Button";
imageedit.mostCurrent._colororange = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private ColorPanel As Panel";
imageedit.mostCurrent._colorpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Private ColorPurple As Button";
imageedit.mostCurrent._colorpurple = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private ColorRed As Button";
imageedit.mostCurrent._colorred = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private ColorYellow As Button";
imageedit.mostCurrent._coloryellow = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private ColorGreen As Button";
imageedit.mostCurrent._colorgreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private butCamera As Button";
imageedit.mostCurrent._butcamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private butOCR As Button";
imageedit.mostCurrent._butocr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private butBarcode As Button";
imageedit.mostCurrent._butbarcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private butOCRFindAll As Button";
imageedit.mostCurrent._butocrfindall = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private butOCRFindSelect As Button";
imageedit.mostCurrent._butocrfindselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private OCROptPanel As Panel";
imageedit.mostCurrent._ocroptpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Private ColorWhite As Button";
imageedit.mostCurrent._colorwhite = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 110;BA.debugLine="Private TextField As EditText";
imageedit.mostCurrent._textfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private TextPanel As Panel";
imageedit.mostCurrent._textpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private HideText As Button";
imageedit.mostCurrent._hidetext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private butFont16 As Button";
imageedit.mostCurrent._butfont16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 114;BA.debugLine="Private butFont20 As Button";
imageedit.mostCurrent._butfont20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private butFont24 As Button";
imageedit.mostCurrent._butfont24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private butFont28 As Button";
imageedit.mostCurrent._butfont28 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private butFont32 As Button";
imageedit.mostCurrent._butfont32 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private butFont36 As Button";
imageedit.mostCurrent._butfont36 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 119;BA.debugLine="Private FontPanel As Panel 'FontSize";
imageedit.mostCurrent._fontpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 120;BA.debugLine="Private ColorPanelIndicator As Panel";
imageedit.mostCurrent._colorpanelindicator = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 121;BA.debugLine="Private BarCodePanel As Panel";
imageedit.mostCurrent._barcodepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 122;BA.debugLine="Private BCBarcode As Button";
imageedit.mostCurrent._bcbarcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 123;BA.debugLine="Private BCQRCode As Button";
imageedit.mostCurrent._bcqrcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Private BCStamp As Button";
imageedit.mostCurrent._bcstamp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 125;BA.debugLine="Private butActions As Button";
imageedit.mostCurrent._butactions = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 126;BA.debugLine="Private butClose As Button";
imageedit.mostCurrent._butclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 127;BA.debugLine="Private butColors As Button";
imageedit.mostCurrent._butcolors = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 128;BA.debugLine="Private butPencil As Button";
imageedit.mostCurrent._butpencil = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private butSave As Button";
imageedit.mostCurrent._butsave = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 130;BA.debugLine="Private butUndo As Button";
imageedit.mostCurrent._butundo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Private PinPanel As Panel";
imageedit.mostCurrent._pinpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Private PINFoto As Button";
imageedit.mostCurrent._pinfoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private PINMarker As Button";
imageedit.mostCurrent._pinmarker = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private PINText As Button";
imageedit.mostCurrent._pintext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 135;BA.debugLine="Private butFonts As Button";
imageedit.mostCurrent._butfonts = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 136;BA.debugLine="Private ActionsPanel As Panel";
imageedit.mostCurrent._actionspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 137;BA.debugLine="Private butPencilDistance As Button";
imageedit.mostCurrent._butpencildistance = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 138;BA.debugLine="Private butPencilFree As Button";
imageedit.mostCurrent._butpencilfree = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 139;BA.debugLine="Private butPencilLine As Button";
imageedit.mostCurrent._butpencilline = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 140;BA.debugLine="Private PencilPanel As Panel";
imageedit.mostCurrent._pencilpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 141;BA.debugLine="Private ImageView1 As ImageView";
imageedit.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 142;BA.debugLine="Private butReset As Button";
imageedit.mostCurrent._butreset = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 143;BA.debugLine="Private butAcceptCrop As Button";
imageedit.mostCurrent._butacceptcrop = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 144;BA.debugLine="Private LockPanel As Panel";
imageedit.mostCurrent._lockpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 146;BA.debugLine="Private isGrid As Boolean = False";
imageedit._isgrid = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 147;BA.debugLine="Private CurrentCLAItem As RequestCLAItem";
imageedit.mostCurrent._currentclaitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");
 //BA.debugLineNum = 148;BA.debugLine="Private ExitToDialog As Boolean = False";
imageedit._exittodialog = imageedit.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 150;BA.debugLine="Private InnerCounter As Int = 0";
imageedit._innercounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 151;BA.debugLine="Private Touch_X As Int = 0, Touch_Y As Int = 0";
imageedit._touch_x = BA.numberCast(int.class, 0);
imageedit._touch_y = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 153;BA.debugLine="Private InnerCamShots As List '.Add(ShotFileName)";
imageedit.mostCurrent._innercamshots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hideme_click() throws Exception{
try {
		Debug.PushSubsStack("HideMe_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,724);
if (RapidSub.canDelegate("hideme_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","hideme_click");}
 BA.debugLineNum = 724;BA.debugLine="Sub HideMe_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 725;BA.debugLine="ShowPanel.Visible= False";
Debug.ShouldStop(1048576);
imageedit.mostCurrent._showpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 726;BA.debugLine="LockPanel.Visible = False";
Debug.ShouldStop(2097152);
imageedit.mostCurrent._lockpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 729;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 730;BA.debugLine="ShowImage.Bitmap = Null";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._showimage.runMethod(false,"setBitmap",(imageedit.mostCurrent.__c.getField(false,"Null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",imageedit.processBA, e6.toString()); BA.debugLineNum = 732;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
imageedit.mostCurrent.__c.runVoidMethod ("LogImpl","632178184",BA.ObjectToString(imageedit.mostCurrent.__c.runMethod(false,"LastException",imageedit.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 734;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidetext_click() throws Exception{
try {
		Debug.PushSubsStack("HideText_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1053);
if (RapidSub.canDelegate("hidetext_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","hidetext_click");}
 BA.debugLineNum = 1053;BA.debugLine="Sub HideText_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1054;BA.debugLine="ButtonFontStates";
Debug.ShouldStop(536870912);
_buttonfontstates();
 BA.debugLineNum = 1055;BA.debugLine="TextPanel.Visible=False";
Debug.ShouldStop(1073741824);
imageedit.mostCurrent._textpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1056;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(-2147483648);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 1058;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isundorect() throws Exception{
try {
		Debug.PushSubsStack("isUndoRect (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,476);
if (RapidSub.canDelegate("isundorect")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","isundorect");}
 BA.debugLineNum = 476;BA.debugLine="Sub isUndoRect As Boolean";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 477;BA.debugLine="Return (UndoRect.Left < UndoRect.Right) And (Undo";
Debug.ShouldStop(268435456);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",imageedit.mostCurrent._undorect.runMethod(true,"getLeft"),BA.numberCast(double.class, imageedit.mostCurrent._undorect.runMethod(true,"getRight")))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",imageedit.mostCurrent._undorect.runMethod(true,"getTop"),BA.numberCast(double.class, imageedit.mostCurrent._undorect.runMethod(true,"getBottom")))))));
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _paramstartblock() throws Exception{
try {
		Debug.PushSubsStack("ParamStartBlock (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,217);
if (RapidSub.canDelegate("paramstartblock")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","paramstartblock");}
 BA.debugLineNum = 217;BA.debugLine="Sub ParamStartBlock";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="DrawingCanvas.Initialize(DrawPanel)";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._drawingcanvas.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), imageedit.mostCurrent._drawpanel.getObject()));
 BA.debugLineNum = 219;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(67108864);
imageedit.mostCurrent._drawingrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 220;BA.debugLine="butPencil_Click";
Debug.ShouldStop(134217728);
_butpencil_click();
 BA.debugLineNum = 221;BA.debugLine="ColorRed_Click 'ColorBlack_Click";
Debug.ShouldStop(268435456);
_colorred_click();
 BA.debugLineNum = 222;BA.debugLine="memoryLabel.Text = Utils.GetFreeMem";
Debug.ShouldStop(536870912);
imageedit.mostCurrent._memorylabel.runMethod(true,"setText",BA.ObjectToCharSequence(imageedit.mostCurrent._utils.runMethod(true,"_getfreemem" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA)));
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
public static RemoteObject  _pinfoto_click() throws Exception{
try {
		Debug.PushSubsStack("PINFoto_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1156);
if (RapidSub.canDelegate("pinfoto_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","pinfoto_click");}
 BA.debugLineNum = 1156;BA.debugLine="Sub PINFoto_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1157;BA.debugLine="ButtonPINStates";
Debug.ShouldStop(16);
_buttonpinstates();
 BA.debugLineNum = 1158;BA.debugLine="PINFoto.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(32);
imageedit.mostCurrent._pinfoto.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1159;BA.debugLine="bb_PINFoto = True";
Debug.ShouldStop(64);
imageedit._bb_pinfoto = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1160;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pinmarker_click() throws Exception{
try {
		Debug.PushSubsStack("PINMarker_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1150);
if (RapidSub.canDelegate("pinmarker_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","pinmarker_click");}
 BA.debugLineNum = 1150;BA.debugLine="Sub PINMarker_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1151;BA.debugLine="ButtonPINStates";
Debug.ShouldStop(1073741824);
_buttonpinstates();
 BA.debugLineNum = 1152;BA.debugLine="PINMarker.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(-2147483648);
imageedit.mostCurrent._pinmarker.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1153;BA.debugLine="bb_PINMarker = True";
Debug.ShouldStop(1);
imageedit._bb_pinmarker = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1154;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pintext_click() throws Exception{
try {
		Debug.PushSubsStack("PINText_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1144);
if (RapidSub.canDelegate("pintext_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","pintext_click");}
 BA.debugLineNum = 1144;BA.debugLine="Sub PINText_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1145;BA.debugLine="ButtonPINStates";
Debug.ShouldStop(16777216);
_buttonpinstates();
 BA.debugLineNum = 1146;BA.debugLine="PINText.Color = Colors.ARGB( 150, 2, 102, 143 )";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._pintext.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 143))));
 BA.debugLineNum = 1147;BA.debugLine="bb_PINText = True";
Debug.ShouldStop(67108864);
imageedit._bb_pintext = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1148;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pointmakeimg(RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("PointMakeImg (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,402);
if (RapidSub.canDelegate("pointmakeimg")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","pointmakeimg", _x, _y);}
RemoteObject _p = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._point");
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 402;BA.debugLine="Sub PointMakeImg(X As Int, Y As Int) As Point";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="Dim p As Point";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._point");Debug.locals.put("p", _p);
 BA.debugLineNum = 404;BA.debugLine="p.Initialize";
Debug.ShouldStop(524288);
_p.runVoidMethod ("Initialize");
 BA.debugLineNum = 405;BA.debugLine="p.X=X";
Debug.ShouldStop(1048576);
_p.setField ("X" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 406;BA.debugLine="p.Y=Y";
Debug.ShouldStop(2097152);
_p.setField ("Y" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 407;BA.debugLine="Return p";
Debug.ShouldStop(4194304);
if (true) return _p;
 BA.debugLineNum = 408;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim SaveRects As List";
imageedit._saverects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 14;BA.debugLine="Public PinPointNumber As Int = 0";
imageedit._pinpointnumber = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 16;BA.debugLine="Public ShotFileLocation As String = File.DirInter";
imageedit._shotfilelocation = imageedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 //BA.debugLineNum = 17;BA.debugLine="Public ShotFileName As String = \"\"";
imageedit._shotfilename = BA.ObjectToString("");
 //BA.debugLineNum = 18;BA.debugLine="Public Device As Phone";
imageedit._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _rectchange(RemoteObject _rtc,RemoteObject _left,RemoteObject _top,RemoteObject _right,RemoteObject _bottom) throws Exception{
try {
		Debug.PushSubsStack("RectChange (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,186);
if (RapidSub.canDelegate("rectchange")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","rectchange", _rtc, _left, _top, _right, _bottom);}
Debug.locals.put("rtc", _rtc);
Debug.locals.put("left", _left);
Debug.locals.put("top", _top);
Debug.locals.put("right", _right);
Debug.locals.put("bottom", _bottom);
 BA.debugLineNum = 186;BA.debugLine="Sub RectChange(rtc As B4XRect, left As Int, top As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="rtc.Left = left";
Debug.ShouldStop(67108864);
_rtc.runMethod(true,"setLeft",BA.numberCast(float.class, _left));
 BA.debugLineNum = 188;BA.debugLine="rtc.Top = top";
Debug.ShouldStop(134217728);
_rtc.runMethod(true,"setTop",BA.numberCast(float.class, _top));
 BA.debugLineNum = 189;BA.debugLine="rtc.Right = right";
Debug.ShouldStop(268435456);
_rtc.runMethod(true,"setRight",BA.numberCast(float.class, _right));
 BA.debugLineNum = 190;BA.debugLine="rtc.Bottom = bottom";
Debug.ShouldStop(536870912);
_rtc.runMethod(true,"setBottom",BA.numberCast(float.class, _bottom));
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _redimrect(RemoteObject _rtc) throws Exception{
try {
		Debug.PushSubsStack("RedimRect (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,446);
if (RapidSub.canDelegate("redimrect")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","redimrect", _rtc);}
RemoteObject _l = RemoteObject.createImmutable(0f);
RemoteObject _t = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(0f);
Debug.locals.put("rtc", _rtc);
 BA.debugLineNum = 446;BA.debugLine="Sub RedimRect(rtc As B4XRect)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 447;BA.debugLine="Dim L, T, R, B As Float";
Debug.ShouldStop(1073741824);
_l = RemoteObject.createImmutable(0f);Debug.locals.put("L", _l);
_t = RemoteObject.createImmutable(0f);Debug.locals.put("T", _t);
_r = RemoteObject.createImmutable(0f);Debug.locals.put("R", _r);
_b = RemoteObject.createImmutable(0f);Debug.locals.put("B", _b);
 BA.debugLineNum = 448;BA.debugLine="L = rtc.Left";
Debug.ShouldStop(-2147483648);
_l = _rtc.runMethod(true,"getLeft");Debug.locals.put("L", _l);
 BA.debugLineNum = 449;BA.debugLine="T = rtc.Top";
Debug.ShouldStop(1);
_t = _rtc.runMethod(true,"getTop");Debug.locals.put("T", _t);
 BA.debugLineNum = 450;BA.debugLine="R = rtc.Right";
Debug.ShouldStop(2);
_r = _rtc.runMethod(true,"getRight");Debug.locals.put("R", _r);
 BA.debugLineNum = 451;BA.debugLine="B = rtc.Bottom";
Debug.ShouldStop(4);
_b = _rtc.runMethod(true,"getBottom");Debug.locals.put("B", _b);
 BA.debugLineNum = 452;BA.debugLine="If L > R Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_l,BA.numberCast(double.class, _r))) { 
 BA.debugLineNum = 453;BA.debugLine="L = R";
Debug.ShouldStop(16);
_l = _r;Debug.locals.put("L", _l);
 BA.debugLineNum = 454;BA.debugLine="R = L + (rtc.Left - rtc.Right)";
Debug.ShouldStop(32);
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_l,(RemoteObject.solve(new RemoteObject[] {_rtc.runMethod(true,"getLeft"),_rtc.runMethod(true,"getRight")}, "-",1, 0))}, "+",1, 0));Debug.locals.put("R", _r);
 BA.debugLineNum = 455;BA.debugLine="rtc.Left = L";
Debug.ShouldStop(64);
_rtc.runMethod(true,"setLeft",_l);
 BA.debugLineNum = 456;BA.debugLine="rtc.Right = R";
Debug.ShouldStop(128);
_rtc.runMethod(true,"setRight",_r);
 };
 BA.debugLineNum = 459;BA.debugLine="If T > B Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_t,BA.numberCast(double.class, _b))) { 
 BA.debugLineNum = 460;BA.debugLine="T = B";
Debug.ShouldStop(2048);
_t = _b;Debug.locals.put("T", _t);
 BA.debugLineNum = 461;BA.debugLine="B = T + (rtc.Top - rtc.Bottom)";
Debug.ShouldStop(4096);
_b = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_t,(RemoteObject.solve(new RemoteObject[] {_rtc.runMethod(true,"getTop"),_rtc.runMethod(true,"getBottom")}, "-",1, 0))}, "+",1, 0));Debug.locals.put("B", _b);
 BA.debugLineNum = 462;BA.debugLine="rtc.Top = T";
Debug.ShouldStop(8192);
_rtc.runMethod(true,"setTop",_t);
 BA.debugLineNum = 463;BA.debugLine="rtc.Bottom = B";
Debug.ShouldStop(16384);
_rtc.runMethod(true,"setBottom",_b);
 };
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize() throws Exception{
try {
		Debug.PushSubsStack("Resize (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,369);
if (RapidSub.canDelegate("resize")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","resize");}
 BA.debugLineNum = 369;BA.debugLine="Sub Resize 'ignore";
Debug.ShouldStop(65536);
 BA.debugLineNum = 370;BA.debugLine="cvs.Resize(DrawPanel.Width, DrawPanel.Height)";
Debug.ShouldStop(131072);
imageedit.mostCurrent._cvs.runVoidMethod ("Resize",(Object)(BA.numberCast(float.class, imageedit.mostCurrent._drawpanel.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._drawpanel.runMethod(true,"getHeight"))));
 BA.debugLineNum = 371;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.ShouldStop(262144);
imageedit.mostCurrent._cvs.runVoidMethod ("ClearRect",(Object)(imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 372;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(524288);
imageedit.mostCurrent._cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rrefer2b4xrect(RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("RRefer2B4XRect (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,203);
if (RapidSub.canDelegate("rrefer2b4xrect")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","rrefer2b4xrect", _r);}
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("r", _r);
 BA.debugLineNum = 203;BA.debugLine="Sub RRefer2B4XRect(r As RRefer) As B4XRect";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Dim f As B4XRect";
Debug.ShouldStop(2048);
_f = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("f", _f);
 BA.debugLineNum = 205;BA.debugLine="f.Initialize(r.Left,r.Top,r.Right,r.Bottom)";
Debug.ShouldStop(4096);
_f.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _r.getField(true,"Left" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _r.getField(true,"Top" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _r.getField(true,"Right" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _r.getField(true,"Bottom" /*RemoteObject*/ ))));
 BA.debugLineNum = 206;BA.debugLine="Return f";
Debug.ShouldStop(8192);
if (true) return _f;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rrefercreate(RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("RReferCreate (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,193);
if (RapidSub.canDelegate("rrefercreate")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","rrefercreate", _r);}
RemoteObject _f = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._rrefer");
Debug.locals.put("r", _r);
 BA.debugLineNum = 193;BA.debugLine="Sub RReferCreate(r As B4XRect) As RRefer";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="Dim f As RRefer";
Debug.ShouldStop(2);
_f = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._rrefer");Debug.locals.put("f", _f);
 BA.debugLineNum = 195;BA.debugLine="f.Initialize";
Debug.ShouldStop(4);
_f.runVoidMethod ("Initialize");
 BA.debugLineNum = 196;BA.debugLine="f.Top = r.Top";
Debug.ShouldStop(8);
_f.setField ("Top" /*RemoteObject*/ ,BA.numberCast(int.class, _r.runMethod(true,"getTop")));
 BA.debugLineNum = 197;BA.debugLine="f.Left = r.Left";
Debug.ShouldStop(16);
_f.setField ("Left" /*RemoteObject*/ ,BA.numberCast(int.class, _r.runMethod(true,"getLeft")));
 BA.debugLineNum = 198;BA.debugLine="f.Right = r.Right";
Debug.ShouldStop(32);
_f.setField ("Right" /*RemoteObject*/ ,BA.numberCast(int.class, _r.runMethod(true,"getRight")));
 BA.debugLineNum = 199;BA.debugLine="f.Bottom = r.Bottom";
Debug.ShouldStop(64);
_f.setField ("Bottom" /*RemoteObject*/ ,BA.numberCast(int.class, _r.runMethod(true,"getBottom")));
 BA.debugLineNum = 200;BA.debugLine="Return f";
Debug.ShouldStop(128);
if (true) return _f;
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveinnershot(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SaveInnerShot (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1322);
if (RapidSub.canDelegate("saveinnershot")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","saveinnershot", _filename);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
RemoteObject _thecounter = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
RemoteObject _imgb64 = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1322;BA.debugLine="Public Sub SaveInnerShot(FileName As String) ', th";
Debug.ShouldStop(512);
 BA.debugLineNum = 1323;BA.debugLine="Dim this As RequestCLAItem = CurrentCLAItem";
Debug.ShouldStop(1024);
_this = imageedit.mostCurrent._currentclaitem;Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 1324;BA.debugLine="Dim theCounter As Int = InnerCounter";
Debug.ShouldStop(2048);
_thecounter = imageedit._innercounter;Debug.locals.put("theCounter", _thecounter);Debug.locals.put("theCounter", _thecounter);
 BA.debugLineNum = 1325;BA.debugLine="Dim f As B4XFont = xui.CreateFont(TextField.Typef";
Debug.ShouldStop(4096);
_f = imageedit.mostCurrent._xui.runMethod(false,"CreateFont",(Object)(imageedit.mostCurrent._textfield.runMethod(false,"getTypeface")),(Object)(BA.numberCast(float.class, 22)));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 1329;BA.debugLine="DrawTextWithBorder2(cvs, theCounter, f, LineColor";
Debug.ShouldStop(65536);
_drawtextwithborder2(imageedit.mostCurrent._cvs,BA.NumberToString(_thecounter),_f,imageedit._linecolor,imageedit._touch_x,imageedit._touch_y,BA.numberCast(int.class, 2),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1332;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
Debug.ShouldStop(524288);
if (imageedit.mostCurrent.__c.runMethod(true,"Not",(Object)(imageedit.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(_filename)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1333;BA.debugLine="If Not(FileName.IndexOf(\".png\") >= 0) Then";
Debug.ShouldStop(1048576);
if (imageedit.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_filename.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".png"))),BA.numberCast(double.class, 0))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1334;BA.debugLine="FileName = $\"${FileName}.png\"$";
Debug.ShouldStop(2097152);
_filename = (RemoteObject.concat(RemoteObject.createImmutable(""),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(".png")));Debug.locals.put("FileName", _filename);
 };
 BA.debugLineNum = 1336;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(8388608);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 1337;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(16777216);
_base64con.runVoidMethod ("_initialize",imageedit.processBA);
 BA.debugLineNum = 1338;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImage";
Debug.ShouldStop(33554432);
_imgb64 = _base64con.runMethod(true,"_v6",(Object)(imageedit.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))));Debug.locals.put("ImgB64", _imgb64);Debug.locals.put("ImgB64", _imgb64);
 BA.debugLineNum = 1341;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(268435456);
_maxid = RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values_images")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(3),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 1342;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values_images	\n"),RemoteObject.createImmutable("					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report,\n"),RemoteObject.createImmutable("					repeatcounter, repeatitemcounter, repeatfieldcounter)\n"),RemoteObject.createImmutable("					values ("),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", '"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Request" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Action" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Task" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Item" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"UniqueKey" /*RemoteObject*/ )))),RemoteObject.createImmutable("', '"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"Tagcode" /*RemoteObject*/ )))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("					'"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imgb64))),RemoteObject.createImmutable("', '"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("', 1,\n"),RemoteObject.createImmutable("					"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"RepeatItemCounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_this.getField(true,"repeatfieldcounter" /*RemoteObject*/ )))),RemoteObject.createImmutable(")")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1349;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"${sSQL}\"$)";
Debug.ShouldStop(16);
imageedit.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1350;BA.debugLine="InnerCamShots.Add(FileName)";
Debug.ShouldStop(32);
imageedit.mostCurrent._innercamshots.runVoidMethod ("Add",(Object)((_filename)));
 };
 BA.debugLineNum = 1352;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(128);
imageedit.mostCurrent._cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 1353;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saverecttoundo(RemoteObject _rtc) throws Exception{
try {
		Debug.PushSubsStack("SaveRectToUndo (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,438);
if (RapidSub.canDelegate("saverecttoundo")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","saverecttoundo", _rtc);}
Debug.locals.put("rtc", _rtc);
 BA.debugLineNum = 438;BA.debugLine="Sub SaveRectToUndo( rtc As B4XRect)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 439;BA.debugLine="UndoRect.Left = rtc.Left - LineWidth";
Debug.ShouldStop(4194304);
imageedit.mostCurrent._undorect.runMethod(true,"setLeft",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_rtc.runMethod(true,"getLeft"),imageedit._linewidth}, "-",1, 0)));
 BA.debugLineNum = 440;BA.debugLine="UndoRect.Top = rtc.Top - LineWidth";
Debug.ShouldStop(8388608);
imageedit.mostCurrent._undorect.runMethod(true,"setTop",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_rtc.runMethod(true,"getTop"),imageedit._linewidth}, "-",1, 0)));
 BA.debugLineNum = 441;BA.debugLine="UndoRect.Right = rtc.Right + LineWidth";
Debug.ShouldStop(16777216);
imageedit.mostCurrent._undorect.runMethod(true,"setRight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_rtc.runMethod(true,"getRight"),imageedit._linewidth}, "+",1, 0)));
 BA.debugLineNum = 442;BA.debugLine="UndoRect.Bottom = rtc.Bottom + LineWidth";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._undorect.runMethod(true,"setBottom",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_rtc.runMethod(true,"getBottom"),imageedit._linewidth}, "+",1, 0)));
 BA.debugLineNum = 443;BA.debugLine="RedimRect(UndoRect)";
Debug.ShouldStop(67108864);
_redimrect(imageedit.mostCurrent._undorect);
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbuttonstate(RemoteObject _but) throws Exception{
try {
		Debug.PushSubsStack("setButtonState (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,838);
if (RapidSub.canDelegate("setbuttonstate")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","setbuttonstate", _but);}
Debug.locals.put("but", _but);
 BA.debugLineNum = 838;BA.debugLine="Sub setButtonState(but As Button) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 839;BA.debugLine="but.Color = Colors.ARGB( 155, 36, 88, 163 )";
Debug.ShouldStop(64);
_but.runVoidMethod ("setColor",imageedit.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 155)),(Object)(BA.numberCast(int.class, 36)),(Object)(BA.numberCast(int.class, 88)),(Object)(BA.numberCast(int.class, 163))));
 BA.debugLineNum = 840;BA.debugLine="ActionsPanel.Visible = False";
Debug.ShouldStop(128);
imageedit.mostCurrent._actionspanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 841;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) return imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 842;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showimage_click() throws Exception{
try {
		Debug.PushSubsStack("ShowImage_Click (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,736);
if (RapidSub.canDelegate("showimage_click")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","showimage_click");}
 BA.debugLineNum = 736;BA.debugLine="Sub ShowImage_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 753;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startdraw(RemoteObject _claitem,RemoteObject _ex2dlg) throws Exception{
try {
		Debug.PushSubsStack("StartDraw (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,225);
if (RapidSub.canDelegate("startdraw")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","startdraw", _claitem, _ex2dlg);}
RemoteObject _datename = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _drect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _img = RemoteObject.declareNull("b4a.example.bitmapcreator");
Debug.locals.put("CLAItem", _claitem);
Debug.locals.put("Ex2Dlg", _ex2dlg);
 BA.debugLineNum = 225;BA.debugLine="Public Sub StartDraw(CLAItem As RequestCLAItem, Ex";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="ShotFileLocation = File.DirAssets";
Debug.ShouldStop(2);
imageedit._shotfilelocation = imageedit.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets");
 BA.debugLineNum = 227;BA.debugLine="isGrid = True";
Debug.ShouldStop(4);
imageedit._isgrid = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 229;BA.debugLine="ExitToDialog = Ex2Dlg";
Debug.ShouldStop(16);
imageedit._exittodialog = _ex2dlg;
 BA.debugLineNum = 230;BA.debugLine="ShotFileName = \"grid.png\"";
Debug.ShouldStop(32);
imageedit._shotfilename = BA.ObjectToString("grid.png");
 BA.debugLineNum = 231;BA.debugLine="PinPointNumber = 0";
Debug.ShouldStop(64);
imageedit._pinpointnumber = BA.numberCast(int.class, 0);
 BA.debugLineNum = 232;BA.debugLine="Activity.LoadLayout(\"ImageWindow\")";
Debug.ShouldStop(128);
imageedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ImageWindow")),imageedit.mostCurrent.activityBA);
 BA.debugLineNum = 233;BA.debugLine="XPosis = 0";
Debug.ShouldStop(256);
imageedit._xposis = BA.numberCast(int.class, 0);
 BA.debugLineNum = 234;BA.debugLine="YPosis = 0";
Debug.ShouldStop(512);
imageedit._yposis = BA.numberCast(int.class, 0);
 BA.debugLineNum = 235;BA.debugLine="PointsMap.Initialize";
Debug.ShouldStop(1024);
imageedit.mostCurrent._pointsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 236;BA.debugLine="UndoRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(2048);
imageedit.mostCurrent._undorect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 237;BA.debugLine="UndoBMR.Initialize";
Debug.ShouldStop(4096);
imageedit.mostCurrent._undobmr.runVoidMethod ("Initialize");
 BA.debugLineNum = 241;BA.debugLine="PanelTemp.Initialize(\"\")";
Debug.ShouldStop(65536);
imageedit.mostCurrent._paneltemp.runVoidMethod ("Initialize",imageedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 242;BA.debugLine="SaveRects.Initialize";
Debug.ShouldStop(131072);
imageedit._saverects.runVoidMethod ("Initialize");
 BA.debugLineNum = 244;BA.debugLine="cvs.Initialize(ImagePanel)";
Debug.ShouldStop(524288);
imageedit.mostCurrent._cvs.runVoidMethod ("Initialize",(Object)(imageedit.mostCurrent._imagepanel));
 BA.debugLineNum = 245;BA.debugLine="cvsRect.Initialize(0,0,ImagePanel.Width, ImagePan";
Debug.ShouldStop(1048576);
imageedit.mostCurrent._cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._imagepanel.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._imagepanel.runMethod(true,"getHeight"))));
 BA.debugLineNum = 246;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocat";
Debug.ShouldStop(2097152);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmap",(Object)((imageedit.mostCurrent._xui.runMethod(false,"LoadBitmapResize",(Object)(imageedit._shotfilelocation),(Object)(imageedit._shotfilename),(Object)(imageedit.mostCurrent._imagepanel.runMethod(true,"getWidth")),(Object)(imageedit.mostCurrent._imagepanel.runMethod(true,"getHeight")),(Object)(imageedit.mostCurrent.__c.getField(true,"False"))).getObject())),(Object)(imageedit.mostCurrent._cvsrect));
 BA.debugLineNum = 247;BA.debugLine="Dim DateName As String = Utils.MakeFileName";
Debug.ShouldStop(4194304);
_datename = imageedit.mostCurrent._utils.runMethod(true,"_makefilename" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA);Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 250;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
Debug.ShouldStop(33554432);
_saclalatitude = imageedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(imageedit.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 251;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
Debug.ShouldStop(67108864);
_saclalongitude = imageedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(imageedit.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 253;BA.debugLine="DateName = $\"${DateName} - ${sACLALatitude}/${sAC";
Debug.ShouldStop(268435456);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datename))),RemoteObject.createImmutable(" - "),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalatitude))),RemoteObject.createImmutable("/"),imageedit.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalongitude))),RemoteObject.createImmutable("")));Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 254;BA.debugLine="cvs.DrawText(DateName, 10dip, cvs.TargetRect.Heig";
Debug.ShouldStop(536870912);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawText",imageedit.processBA,(Object)(_datename),(Object)(BA.numberCast(float.class, imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight"),imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0))),(Object)(imageedit.mostCurrent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, imageedit.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )))),(Object)(imageedit.mostCurrent._xui.getField(true,"Color_DarkGray")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("LEFT"))));
 BA.debugLineNum = 257;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCod";
Debug.ShouldStop(1);
_f = imageedit.mostCurrent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, imageedit.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 258;BA.debugLine="Dim dRect As B4XRect";
Debug.ShouldStop(2);
_drect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("dRect", _drect);
 BA.debugLineNum = 259;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.T";
Debug.ShouldStop(4);
_drect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight"),imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),imageedit.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 210)))}, "+",1, 0))),(Object)(imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight")));
 BA.debugLineNum = 260;BA.debugLine="DrawTextWithBorder2(cvs, DateName, f, Consts.Colo";
Debug.ShouldStop(8);
_drawtextwithborder2(imageedit.mostCurrent._cvs,_datename,_f,imageedit.mostCurrent._consts._colordarkgray /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getLeft"),_drect.runMethod(true,"getRight")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getTop"),_drect.runMethod(true,"getBottom")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 262;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(32);
imageedit.mostCurrent._cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 264;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
Debug.ShouldStop(128);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bm = imageedit.mostCurrent._cvs.runMethod(false,"CreateBitmap");Debug.locals.put("bm", _bm);Debug.locals.put("bm", _bm);
 BA.debugLineNum = 265;BA.debugLine="Dim img As BitmapCreator";
Debug.ShouldStop(256);
_img = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("img", _img);
 BA.debugLineNum = 266;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
Debug.ShouldStop(512);
_img.runVoidMethod ("_initialize",imageedit.processBA,(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getHeight"))));
 BA.debugLineNum = 267;BA.debugLine="img.DrawBitmap(bm, cvsRect, True)";
Debug.ShouldStop(1024);
_img.runVoidMethod ("_drawbitmap",(Object)(_bm),(Object)(imageedit.mostCurrent._cvsrect),(Object)(imageedit.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 268;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
Debug.ShouldStop(2048);
imageedit._saverects.runVoidMethod ("Add",(Object)((_bmrcreate(_img.runMethod(false,"_getbitmap"),imageedit.mostCurrent._cvsrect))));
 BA.debugLineNum = 271;BA.debugLine="ParamStartBlock";
Debug.ShouldStop(16384);
_paramstartblock();
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startdrawfrom(RemoteObject _filefolder,RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("StartDrawFrom (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,274);
if (RapidSub.canDelegate("startdrawfrom")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","startdrawfrom", _filefolder, _claitem);}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _img = RemoteObject.declareNull("b4a.example.bitmapcreator");
Debug.locals.put("Filefolder", _filefolder);
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 274;BA.debugLine="Public Sub StartDrawFrom(Filefolder As FileShot, C";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(262144);
imageedit.mostCurrent._currentclaitem = _claitem;
 BA.debugLineNum = 276;BA.debugLine="RetToCamera = False";
Debug.ShouldStop(524288);
imageedit._rettocamera = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 277;BA.debugLine="ShotFileLocation = Filefolder.Folder";
Debug.ShouldStop(1048576);
imageedit._shotfilelocation = _filefolder.getField(true,"Folder" /*RemoteObject*/ );
 BA.debugLineNum = 278;BA.debugLine="ShotFileName = Filefolder.Filename";
Debug.ShouldStop(2097152);
imageedit._shotfilename = _filefolder.getField(true,"Filename" /*RemoteObject*/ );
 BA.debugLineNum = 279;BA.debugLine="ExitToDialog = True";
Debug.ShouldStop(4194304);
imageedit._exittodialog = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 280;BA.debugLine="PinPointNumber = 0";
Debug.ShouldStop(8388608);
imageedit._pinpointnumber = BA.numberCast(int.class, 0);
 BA.debugLineNum = 281;BA.debugLine="Activity.LoadLayout(\"ImageWindow\")";
Debug.ShouldStop(16777216);
imageedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ImageWindow")),imageedit.mostCurrent.activityBA);
 BA.debugLineNum = 282;BA.debugLine="XPosis = 0";
Debug.ShouldStop(33554432);
imageedit._xposis = BA.numberCast(int.class, 0);
 BA.debugLineNum = 283;BA.debugLine="YPosis = 0";
Debug.ShouldStop(67108864);
imageedit._yposis = BA.numberCast(int.class, 0);
 BA.debugLineNum = 284;BA.debugLine="PointsMap.Initialize";
Debug.ShouldStop(134217728);
imageedit.mostCurrent._pointsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 285;BA.debugLine="UndoRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._undorect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 286;BA.debugLine="UndoBMR.Initialize";
Debug.ShouldStop(536870912);
imageedit.mostCurrent._undobmr.runVoidMethod ("Initialize");
 BA.debugLineNum = 288;BA.debugLine="PanelTemp.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
imageedit.mostCurrent._paneltemp.runVoidMethod ("Initialize",imageedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 290;BA.debugLine="SaveRects.Initialize";
Debug.ShouldStop(2);
imageedit._saverects.runVoidMethod ("Initialize");
 BA.debugLineNum = 291;BA.debugLine="cvs.Initialize(ImagePanel)";
Debug.ShouldStop(4);
imageedit.mostCurrent._cvs.runVoidMethod ("Initialize",(Object)(imageedit.mostCurrent._imagepanel));
 BA.debugLineNum = 292;BA.debugLine="cvsRect.Initialize(0,0,ImagePanel.Width, ImagePan";
Debug.ShouldStop(8);
imageedit.mostCurrent._cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._imagepanel.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._imagepanel.runMethod(true,"getHeight"))));
 BA.debugLineNum = 293;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocat";
Debug.ShouldStop(16);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmap",(Object)((imageedit.mostCurrent._xui.runMethod(false,"LoadBitmapResize",(Object)(imageedit._shotfilelocation),(Object)(imageedit._shotfilename),(Object)(imageedit.mostCurrent._imagepanel.runMethod(true,"getWidth")),(Object)(imageedit.mostCurrent._imagepanel.runMethod(true,"getHeight")),(Object)(imageedit.mostCurrent.__c.getField(true,"False"))).getObject())),(Object)(imageedit.mostCurrent._cvsrect));
 BA.debugLineNum = 295;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
Debug.ShouldStop(64);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bm = imageedit.mostCurrent._cvs.runMethod(false,"CreateBitmap");Debug.locals.put("bm", _bm);Debug.locals.put("bm", _bm);
 BA.debugLineNum = 296;BA.debugLine="Dim img As BitmapCreator";
Debug.ShouldStop(128);
_img = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("img", _img);
 BA.debugLineNum = 297;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
Debug.ShouldStop(256);
_img.runVoidMethod ("_initialize",imageedit.processBA,(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getHeight"))));
 BA.debugLineNum = 298;BA.debugLine="img.DrawBitmap(bm, cvsRect, True)";
Debug.ShouldStop(512);
_img.runVoidMethod ("_drawbitmap",(Object)(_bm),(Object)(imageedit.mostCurrent._cvsrect),(Object)(imageedit.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 299;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
Debug.ShouldStop(1024);
imageedit._saverects.runVoidMethod ("Add",(Object)((_bmrcreate(_img.runMethod(false,"_getbitmap"),imageedit.mostCurrent._cvsrect))));
 BA.debugLineNum = 300;BA.debugLine="ParamStartBlock";
Debug.ShouldStop(2048);
_paramstartblock();
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startdrawfrom2(RemoteObject _imgb64,RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("StartDrawFrom2 (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,304);
if (RapidSub.canDelegate("startdrawfrom2")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","startdrawfrom2", _imgb64, _claitem);}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _img = RemoteObject.declareNull("b4a.example.bitmapcreator");
Debug.locals.put("ImgB64", _imgb64);
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 304;BA.debugLine="Public Sub StartDrawFrom2(ImgB64 As String, CLAIte";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(65536);
imageedit.mostCurrent._currentclaitem = _claitem;
 BA.debugLineNum = 306;BA.debugLine="ExitToDialog = True";
Debug.ShouldStop(131072);
imageedit._exittodialog = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 307;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
Debug.ShouldStop(262144);
imageedit._shotfilelocation = imageedit.mostCurrent._starter._internalfolder /*RemoteObject*/ ;
 BA.debugLineNum = 308;BA.debugLine="ShotFileName = ImgB64";
Debug.ShouldStop(524288);
imageedit._shotfilename = _imgb64;
 BA.debugLineNum = 309;BA.debugLine="PinPointNumber = 0";
Debug.ShouldStop(1048576);
imageedit._pinpointnumber = BA.numberCast(int.class, 0);
 BA.debugLineNum = 310;BA.debugLine="Activity.LoadLayout(\"ImageWindow\")";
Debug.ShouldStop(2097152);
imageedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ImageWindow")),imageedit.mostCurrent.activityBA);
 BA.debugLineNum = 311;BA.debugLine="XPosis = 0";
Debug.ShouldStop(4194304);
imageedit._xposis = BA.numberCast(int.class, 0);
 BA.debugLineNum = 312;BA.debugLine="YPosis = 0";
Debug.ShouldStop(8388608);
imageedit._yposis = BA.numberCast(int.class, 0);
 BA.debugLineNum = 313;BA.debugLine="PointsMap.Initialize";
Debug.ShouldStop(16777216);
imageedit.mostCurrent._pointsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 314;BA.debugLine="UndoRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._undorect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 315;BA.debugLine="UndoBMR.Initialize";
Debug.ShouldStop(67108864);
imageedit.mostCurrent._undobmr.runVoidMethod ("Initialize");
 BA.debugLineNum = 317;BA.debugLine="PanelTemp.Initialize(\"\")";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._paneltemp.runVoidMethod ("Initialize",imageedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 319;BA.debugLine="SaveRects.Initialize";
Debug.ShouldStop(1073741824);
imageedit._saverects.runVoidMethod ("Initialize");
 BA.debugLineNum = 320;BA.debugLine="cvs.Initialize(ImagePanel)";
Debug.ShouldStop(-2147483648);
imageedit.mostCurrent._cvs.runVoidMethod ("Initialize",(Object)(imageedit.mostCurrent._imagepanel));
 BA.debugLineNum = 321;BA.debugLine="cvsRect.Initialize(0,0,ImagePanel.Width, ImagePan";
Debug.ShouldStop(1);
imageedit.mostCurrent._cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._imagepanel.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._imagepanel.runMethod(true,"getHeight"))));
 BA.debugLineNum = 323;BA.debugLine="cvs.DrawBitmap(Utils.B64ToBitmap(ShotFileName), c";
Debug.ShouldStop(4);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmap",(Object)((imageedit.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(imageedit._shotfilename)).getObject())),(Object)(imageedit.mostCurrent._cvsrect));
 BA.debugLineNum = 325;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
Debug.ShouldStop(16);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bm = imageedit.mostCurrent._cvs.runMethod(false,"CreateBitmap");Debug.locals.put("bm", _bm);Debug.locals.put("bm", _bm);
 BA.debugLineNum = 326;BA.debugLine="Dim img As BitmapCreator";
Debug.ShouldStop(32);
_img = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("img", _img);
 BA.debugLineNum = 327;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
Debug.ShouldStop(64);
_img.runVoidMethod ("_initialize",imageedit.processBA,(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getHeight"))));
 BA.debugLineNum = 328;BA.debugLine="img.DrawBitmap(bm, cvsRect, True)";
Debug.ShouldStop(128);
_img.runVoidMethod ("_drawbitmap",(Object)(_bm),(Object)(imageedit.mostCurrent._cvsrect),(Object)(imageedit.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 329;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
Debug.ShouldStop(256);
imageedit._saverects.runVoidMethod ("Add",(Object)((_bmrcreate(_img.runMethod(false,"_getbitmap"),imageedit.mostCurrent._cvsrect))));
 BA.debugLineNum = 332;BA.debugLine="ParamStartBlock";
Debug.ShouldStop(2048);
_paramstartblock();
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
public static RemoteObject  _startdrawfrom3(RemoteObject _imgb64,RemoteObject _claitem) throws Exception{
try {
		Debug.PushSubsStack("StartDrawFrom3 (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,335);
if (RapidSub.canDelegate("startdrawfrom3")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","startdrawfrom3", _imgb64, _claitem);}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _img = RemoteObject.declareNull("b4a.example.bitmapcreator");
Debug.locals.put("ImgB64", _imgb64);
Debug.locals.put("CLAItem", _claitem);
 BA.debugLineNum = 335;BA.debugLine="Public Sub StartDrawFrom3(ImgB64 As String, CLAIte";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="RetToCamera = False";
Debug.ShouldStop(32768);
imageedit._rettocamera = imageedit.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 337;BA.debugLine="isB64Image = True";
Debug.ShouldStop(65536);
imageedit._isb64image = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 338;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(131072);
imageedit.mostCurrent._currentclaitem = _claitem;
 BA.debugLineNum = 339;BA.debugLine="ExitToDialog = True";
Debug.ShouldStop(262144);
imageedit._exittodialog = imageedit.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 340;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
Debug.ShouldStop(524288);
imageedit._shotfilelocation = imageedit.mostCurrent._starter._internalfolder /*RemoteObject*/ ;
 BA.debugLineNum = 341;BA.debugLine="ShotFileName = ImgB64";
Debug.ShouldStop(1048576);
imageedit._shotfilename = _imgb64;
 BA.debugLineNum = 342;BA.debugLine="PinPointNumber = 0";
Debug.ShouldStop(2097152);
imageedit._pinpointnumber = BA.numberCast(int.class, 0);
 BA.debugLineNum = 343;BA.debugLine="Activity.LoadLayout(\"ImageWindow\")";
Debug.ShouldStop(4194304);
imageedit.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ImageWindow")),imageedit.mostCurrent.activityBA);
 BA.debugLineNum = 344;BA.debugLine="XPosis = 0";
Debug.ShouldStop(8388608);
imageedit._xposis = BA.numberCast(int.class, 0);
 BA.debugLineNum = 345;BA.debugLine="YPosis = 0";
Debug.ShouldStop(16777216);
imageedit._yposis = BA.numberCast(int.class, 0);
 BA.debugLineNum = 346;BA.debugLine="PointsMap.Initialize";
Debug.ShouldStop(33554432);
imageedit.mostCurrent._pointsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 347;BA.debugLine="UndoRect.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(67108864);
imageedit.mostCurrent._undorect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 348;BA.debugLine="UndoBMR.Initialize";
Debug.ShouldStop(134217728);
imageedit.mostCurrent._undobmr.runVoidMethod ("Initialize");
 BA.debugLineNum = 350;BA.debugLine="PanelTemp.Initialize(\"\")";
Debug.ShouldStop(536870912);
imageedit.mostCurrent._paneltemp.runVoidMethod ("Initialize",imageedit.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 352;BA.debugLine="SaveRects.Initialize";
Debug.ShouldStop(-2147483648);
imageedit._saverects.runVoidMethod ("Initialize");
 BA.debugLineNum = 353;BA.debugLine="cvs.Initialize(ImagePanel)";
Debug.ShouldStop(1);
imageedit.mostCurrent._cvs.runVoidMethod ("Initialize",(Object)(imageedit.mostCurrent._imagepanel));
 BA.debugLineNum = 354;BA.debugLine="cvsRect.Initialize(0,0,ImagePanel.Width, ImagePan";
Debug.ShouldStop(2);
imageedit.mostCurrent._cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._imagepanel.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, imageedit.mostCurrent._imagepanel.runMethod(true,"getHeight"))));
 BA.debugLineNum = 356;BA.debugLine="cvs.DrawBitmap(Utils.B64ToBitmap(ShotFileName), c";
Debug.ShouldStop(8);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmap",(Object)((imageedit.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(imageedit._shotfilename)).getObject())),(Object)(imageedit.mostCurrent._cvsrect));
 BA.debugLineNum = 358;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
Debug.ShouldStop(32);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bm = imageedit.mostCurrent._cvs.runMethod(false,"CreateBitmap");Debug.locals.put("bm", _bm);Debug.locals.put("bm", _bm);
 BA.debugLineNum = 359;BA.debugLine="Dim img As BitmapCreator";
Debug.ShouldStop(64);
_img = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("img", _img);
 BA.debugLineNum = 360;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
Debug.ShouldStop(128);
_img.runVoidMethod ("_initialize",imageedit.processBA,(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, imageedit.mostCurrent._cvsrect.runMethod(true,"getHeight"))));
 BA.debugLineNum = 361;BA.debugLine="img.DrawBitmap(bm, cvsRect, True)";
Debug.ShouldStop(256);
_img.runVoidMethod ("_drawbitmap",(Object)(_bm),(Object)(imageedit.mostCurrent._cvsrect),(Object)(imageedit.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 362;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
Debug.ShouldStop(512);
imageedit._saverects.runVoidMethod ("Add",(Object)((_bmrcreate(_img.runMethod(false,"_getbitmap"),imageedit.mostCurrent._cvsrect))));
 BA.debugLineNum = 365;BA.debugLine="ParamStartBlock";
Debug.ShouldStop(4096);
_paramstartblock();
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textfield_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("TextField_EnterPressed (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,998);
if (RapidSub.canDelegate("textfield_enterpressed")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","textfield_enterpressed");}
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
 BA.debugLineNum = 998;BA.debugLine="Sub TextField_EnterPressed";
Debug.ShouldStop(32);
 BA.debugLineNum = 999;BA.debugLine="Dim f As B4XFont = xui.CreateFont(TextField.Typef";
Debug.ShouldStop(64);
_f = imageedit.mostCurrent._xui.runMethod(false,"CreateFont",(Object)(imageedit.mostCurrent._textfield.runMethod(false,"getTypeface")),(Object)(BA.numberCast(float.class, imageedit._fontsize)));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 1000;BA.debugLine="DrawTextWithBorder(cvs, TextField.Text, f, LineCo";
Debug.ShouldStop(128);
_drawtextwithborder(imageedit.mostCurrent._cvs,imageedit.mostCurrent._textfield.runMethod(true,"getText"),_f,imageedit._linecolor,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._drawingrect.runMethod(true,"getLeft"),imageedit.mostCurrent._drawingrect.runMethod(true,"getRight")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._drawingrect.runMethod(true,"getTop"),imageedit.mostCurrent._drawingrect.runMethod(true,"getBottom")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1001;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(256);
imageedit.mostCurrent._cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 1002;BA.debugLine="HideText_Click";
Debug.ShouldStop(512);
_hidetext_click();
 BA.debugLineNum = 1003;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,380);
if (RapidSub.canDelegate("timer1_tick")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","timer1_tick");}
 BA.debugLineNum = 380;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 381;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.ShouldStop(268435456);
imageedit.mostCurrent._cvs.runVoidMethod ("ClearRect",(Object)(imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 382;BA.debugLine="If SmileyRect.Right > cvs.TargetRect.Width Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",imageedit.mostCurrent._smileyrect.runMethod(true,"getRight"),BA.numberCast(double.class, imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect").runMethod(true,"getWidth")))) { 
 BA.debugLineNum = 383;BA.debugLine="vx = -Abs(vx)";
Debug.ShouldStop(1073741824);
imageedit._vx = BA.numberCast(double.class, -imageedit.mostCurrent.__c.runMethod(true,"Abs",(Object)(imageedit._vx)).<Double>get().doubleValue());
 }else 
{ BA.debugLineNum = 384;BA.debugLine="Else If SmileyRect.Left < 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",imageedit.mostCurrent._smileyrect.runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 385;BA.debugLine="vx = Abs(vx)";
Debug.ShouldStop(1);
imageedit._vx = imageedit.mostCurrent.__c.runMethod(true,"Abs",(Object)(imageedit._vx));
 }}
;
 BA.debugLineNum = 387;BA.debugLine="If SmileyRect.Bottom > cvs.TargetRect.Height Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",imageedit.mostCurrent._smileyrect.runMethod(true,"getBottom"),BA.numberCast(double.class, imageedit.mostCurrent._cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 388;BA.debugLine="vy = -Abs(vy)";
Debug.ShouldStop(8);
imageedit._vy = BA.numberCast(double.class, -imageedit.mostCurrent.__c.runMethod(true,"Abs",(Object)(imageedit._vy)).<Double>get().doubleValue());
 }else 
{ BA.debugLineNum = 389;BA.debugLine="Else If SmileyRect.Top < 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",imageedit.mostCurrent._smileyrect.runMethod(true,"getTop"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 390;BA.debugLine="vy = Abs(vy)";
Debug.ShouldStop(32);
imageedit._vy = imageedit.mostCurrent.__c.runMethod(true,"Abs",(Object)(imageedit._vy));
 }}
;
 BA.debugLineNum = 392;BA.debugLine="SmileyRect.Left = SmileyRect.Left + vx";
Debug.ShouldStop(128);
imageedit.mostCurrent._smileyrect.runMethod(true,"setLeft",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._smileyrect.runMethod(true,"getLeft"),imageedit._vx}, "+",1, 0)));
 BA.debugLineNum = 393;BA.debugLine="SmileyRect.Top = SmileyRect.Top + vy";
Debug.ShouldStop(256);
imageedit.mostCurrent._smileyrect.runMethod(true,"setTop",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {imageedit.mostCurrent._smileyrect.runMethod(true,"getTop"),imageedit._vy}, "+",1, 0)));
 BA.debugLineNum = 394;BA.debugLine="SmileyRect.Width = size";
Debug.ShouldStop(512);
imageedit.mostCurrent._smileyrect.runMethod(true,"setWidth",BA.numberCast(int.class, imageedit._size));
 BA.debugLineNum = 395;BA.debugLine="SmileyRect.Height = size";
Debug.ShouldStop(1024);
imageedit.mostCurrent._smileyrect.runMethod(true,"setHeight",BA.numberCast(float.class, imageedit._size));
 BA.debugLineNum = 396;BA.debugLine="deg = deg + 1";
Debug.ShouldStop(2048);
imageedit._deg = RemoteObject.solve(new RemoteObject[] {imageedit._deg,RemoteObject.createImmutable(1)}, "+",1, 0);
 BA.debugLineNum = 397;BA.debugLine="cvs.DrawBitmapRotated(smiley, SmileyRect, deg)";
Debug.ShouldStop(4096);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmapRotated",(Object)((imageedit.mostCurrent._smiley.getObject())),(Object)(imageedit.mostCurrent._smileyrect),(Object)(BA.numberCast(float.class, imageedit._deg)));
 BA.debugLineNum = 399;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(16384);
imageedit.mostCurrent._cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trytocrop() throws Exception{
try {
		Debug.PushSubsStack("TryToCrop (imageedit) ","imageedit",7,imageedit.mostCurrent.activityBA,imageedit.mostCurrent,1401);
if (RapidSub.canDelegate("trytocrop")) { return xevolution.vrcg.devdemov2400.imageedit.remoteMe.runUserSub(false, "imageedit","trytocrop");}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _la = RemoteObject.createImmutable("");
RemoteObject _lo = RemoteObject.createImmutable("");
 BA.debugLineNum = 1401;BA.debugLine="Sub TryToCrop";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1402;BA.debugLine="Dim bm As B4XBitmap = ShowImage.Bitmap";
Debug.ShouldStop(33554432);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), imageedit.mostCurrent._showimage.runMethod(false,"getBitmap"));Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1404;BA.debugLine="RectChange(cvsRect, 0,0,ImagePanel.Width, ImagePa";
Debug.ShouldStop(134217728);
_rectchange(imageedit.mostCurrent._cvsrect,BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),imageedit.mostCurrent._imagepanel.runMethod(true,"getWidth"),imageedit.mostCurrent._imagepanel.runMethod(true,"getHeight"));
 BA.debugLineNum = 1406;BA.debugLine="cvs.DrawBitmap(bm, cvsRect)";
Debug.ShouldStop(536870912);
imageedit.mostCurrent._cvs.runVoidMethod ("DrawBitmap",(Object)((_bm.getObject())),(Object)(imageedit.mostCurrent._cvsrect));
 BA.debugLineNum = 1407;BA.debugLine="Dim la As String = Utils.IfNullOrEmpty(LocationSe";
Debug.ShouldStop(1073741824);
_la = imageedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(imageedit.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("la", _la);Debug.locals.put("la", _la);
 BA.debugLineNum = 1408;BA.debugLine="Dim lo As String = Utils.IfNullOrEmpty(LocationSe";
Debug.ShouldStop(-2147483648);
_lo = imageedit.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(imageedit.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("lo", _lo);Debug.locals.put("lo", _lo);
 BA.debugLineNum = 1409;BA.debugLine="cvs = Utils.DTGEOSave2Canvas(cvs, la, lo)";
Debug.ShouldStop(1);
imageedit.mostCurrent._cvs = imageedit.mostCurrent._utils.runMethod(false,"_dtgeosave2canvas" /*RemoteObject*/ ,imageedit.mostCurrent.activityBA,(Object)(imageedit.mostCurrent._cvs),(Object)(_la),(Object)(_lo));
 BA.debugLineNum = 1411;BA.debugLine="SaveRects.Clear";
Debug.ShouldStop(4);
imageedit._saverects.runVoidMethod ("Clear");
 BA.debugLineNum = 1412;BA.debugLine="SaveRects.Add(BMRCreate(bm, cvsRect))";
Debug.ShouldStop(8);
imageedit._saverects.runVoidMethod ("Add",(Object)((_bmrcreate(_bm,imageedit.mostCurrent._cvsrect))));
 BA.debugLineNum = 1413;BA.debugLine="ShowPanel.Visible= False";
Debug.ShouldStop(16);
imageedit.mostCurrent._showpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1414;BA.debugLine="LockPanel.Visible = False";
Debug.ShouldStop(32);
imageedit.mostCurrent._lockpanel.runMethod(true,"setVisible",imageedit.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1415;BA.debugLine="ShowImage.Bitmap = Null";
Debug.ShouldStop(64);
imageedit.mostCurrent._showimage.runMethod(false,"setBitmap",(imageedit.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 1417;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}