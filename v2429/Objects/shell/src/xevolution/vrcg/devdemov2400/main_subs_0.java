package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,387);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 387;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 397;BA.debugLine="Call_CheckWebAccess";
Debug.ShouldStop(4096);
_call_checkwebaccess();
 BA.debugLineNum = 398;BA.debugLine="SetLanguage";
Debug.ShouldStop(8192);
_setlanguage();
 BA.debugLineNum = 399;BA.debugLine="SetDeviceInfo";
Debug.ShouldStop(16384);
_setdeviceinfo();
 BA.debugLineNum = 400;BA.debugLine="SetActivityLayout";
Debug.ShouldStop(32768);
_setactivitylayout();
 BA.debugLineNum = 401;BA.debugLine="SetFTPUser";
Debug.ShouldStop(65536);
_setftpuser();
 BA.debugLineNum = 402;BA.debugLine="CheckDeviceOrientation";
Debug.ShouldStop(131072);
_checkdeviceorientation();
 BA.debugLineNum = 403;BA.debugLine="SetTextLabels";
Debug.ShouldStop(262144);
_settextlabels();
 BA.debugLineNum = 405;BA.debugLine="LogoBackEVC.Visible = False";
Debug.ShouldStop(1048576);
main.mostCurrent._logobackevc.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 407;BA.debugLine="ShareCode.ScanList.Initialize";
Debug.ShouldStop(4194304);
main.mostCurrent._sharecode._scanlist /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 408;BA.debugLine="ShareCode.ListOfCodes2Compare.Initialize";
Debug.ShouldStop(8388608);
main.mostCurrent._sharecode._listofcodes2compare /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 410;BA.debugLine="Delete_srv_Files";
Debug.ShouldStop(33554432);
_delete_srv_files();
 BA.debugLineNum = 411;BA.debugLine="Check_Installed_Date";
Debug.ShouldStop(67108864);
_check_installed_date();
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1329);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 1329;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1330;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 1331;BA.debugLine="Dim Result As Int";
Debug.ShouldStop(262144);
_result = RemoteObject.createImmutable(0);Debug.locals.put("Result", _result);
 BA.debugLineNum = 1332;BA.debugLine="Result = Msgbox2(ShareCode.ApplicationExit, Shar";
Debug.ShouldStop(524288);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._applicationexit /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(main.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(main.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("Result", _result);
 BA.debugLineNum = 1333;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 1334;BA.debugLine="ActivityFinish";
Debug.ShouldStop(2097152);
_activityfinish();
 };
 };
 BA.debugLineNum = 1337;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1338;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,507);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 507;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 508;BA.debugLine="Log(\"Activity_Pause\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6262145",RemoteObject.createImmutable("Activity_Pause"),0);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,490);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 490;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 492;BA.debugLine="If (Starter.APP_FINE_LOCATION_ACCESS) Then";
Debug.ShouldStop(2048);
if ((main.mostCurrent._starter._app_fine_location_access /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 493;BA.debugLine="If Not(LocationService.FusedLocationProvider1.Is";
Debug.ShouldStop(4096);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._locationservice._fusedlocationprovider1 /*RemoteObject*/ .runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 494;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((main.mostCurrent._locationservice.getObject())));
 };
 };
 BA.debugLineNum = 500;BA.debugLine="GC.Initialize";
Debug.ShouldStop(524288);
main.mostCurrent._gc.runClassMethod (xevolution.vrcg.devdemov2400.force_gc.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 501;BA.debugLine="GC.Fire";
Debug.ShouldStop(1048576);
main.mostCurrent._gc.runClassMethod (xevolution.vrcg.devdemov2400.force_gc.class, "_fire" /*RemoteObject*/ );
 BA.debugLineNum = 503;BA.debugLine="GoStartApp";
Debug.ShouldStop(4194304);
_gostartapp();
 BA.debugLineNum = 505;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activityfinish() throws Exception{
try {
		Debug.PushSubsStack("ActivityFinish (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1320);
if (RapidSub.canDelegate("activityfinish")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","activityfinish");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 1320;BA.debugLine="Sub ActivityFinish";
Debug.ShouldStop(128);
 BA.debugLineNum = 1321;BA.debugLine="CloseAllServices";
Debug.ShouldStop(256);
_closeallservices();
 BA.debugLineNum = 1322;BA.debugLine="Log(\"closing\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6110755842",RemoteObject.createImmutable("closing"),0);
 BA.debugLineNum = 1323;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(1024);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1324;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(2048);
_jo.runVoidMethod ("InitializeContext",main.processBA);
 BA.debugLineNum = 1325;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
Debug.ShouldStop(4096);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("finishAffinity")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 1326;BA.debugLine="ExitApplication";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 1327;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activitynewlogin() throws Exception{
try {
		Debug.PushSubsStack("ActivityNewLogin (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1340);
if (RapidSub.canDelegate("activitynewlogin")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","activitynewlogin");}
 BA.debugLineNum = 1340;BA.debugLine="Sub ActivityNewLogin";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1341;BA.debugLine="mainSplashImageEffect.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._mainsplashimageeffect.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1342;BA.debugLine="ResetPanels";
Debug.ShouldStop(536870912);
_resetpanels();
 BA.debugLineNum = 1343;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(1073741824);
main.mostCurrent._panel_login.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1344;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(-2147483648);
main.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 BA.debugLineNum = 1345;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _butcancelqrcode_click() throws Exception{
try {
		Debug.PushSubsStack("butCancelQRCode_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2564);
if (RapidSub.canDelegate("butcancelqrcode_click")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","butcancelqrcode_click"); return;}
ResumableSub_butCancelQRCode_Click rsub = new ResumableSub_butCancelQRCode_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butCancelQRCode_Click extends BA.ResumableSub {
public ResumableSub_butCancelQRCode_Click(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butCancelQRCode_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2564);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 2565;BA.debugLine="QRCodeReader.stopScan";
Debug.ShouldStop(16);
parent.mostCurrent._qrcodereader.runVoidMethod ("stopScan");
 BA.debugLineNum = 2566;BA.debugLine="QRCodeReader.Visible = False";
Debug.ShouldStop(32);
parent.mostCurrent._qrcodereader.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2567;BA.debugLine="Sleep(0)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "butcancelqrcode_click"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 2568;BA.debugLine="QRCodePanel.Visible = False";
Debug.ShouldStop(128);
parent.mostCurrent._qrcodepanel.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2569;BA.debugLine="QRCodeKeyReceived = \"\"";
Debug.ShouldStop(256);
parent.mostCurrent._qrcodekeyreceived = BA.ObjectToString("");
 BA.debugLineNum = 2570;BA.debugLine="End Sub";
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
public static void  _butsaveqrcode_click() throws Exception{
try {
		Debug.PushSubsStack("butSaveQRCode_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2572);
if (RapidSub.canDelegate("butsaveqrcode_click")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","butsaveqrcode_click"); return;}
ResumableSub_butSaveQRCode_Click rsub = new ResumableSub_butSaveQRCode_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_butSaveQRCode_Click extends BA.ResumableSub {
public ResumableSub_butSaveQRCode_Click(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _kui = RemoteObject.createImmutable("");
RemoteObject _kua = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("butSaveQRCode_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2572);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2573;BA.debugLine="If (Utils.NNE(QRCodeKeyReceived)) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._qrcodekeyreceived))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2574;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(8192);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 2575;BA.debugLine="JSON1.Initialize(QRCodeKeyReceived)";
Debug.ShouldStop(16384);
_json1.runVoidMethod ("Initialize",(Object)(parent.mostCurrent._qrcodekeyreceived));
 BA.debugLineNum = 2576;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(32768);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 2577;BA.debugLine="Dim kui As String = MapJSON.Get(\"kui\")";
Debug.ShouldStop(65536);
_kui = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("kui")))));Debug.locals.put("kui", _kui);Debug.locals.put("kui", _kui);
 BA.debugLineNum = 2578;BA.debugLine="Dim kua As String = MapJSON.Get(\"kua\")";
Debug.ShouldStop(131072);
_kua = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("kua")))));Debug.locals.put("kua", _kua);Debug.locals.put("kua", _kua);
 BA.debugLineNum = 2580;BA.debugLine="EditAuthorization.Text = kua";
Debug.ShouldStop(524288);
parent.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_kua));
 BA.debugLineNum = 2581;BA.debugLine="EditInstance.Text = kui";
Debug.ShouldStop(1048576);
parent.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_kui));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2583;BA.debugLine="QRCodeReader.stopScan";
Debug.ShouldStop(4194304);
parent.mostCurrent._qrcodereader.runVoidMethod ("stopScan");
 BA.debugLineNum = 2584;BA.debugLine="QRCodeReader.Visible = False";
Debug.ShouldStop(8388608);
parent.mostCurrent._qrcodereader.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2585;BA.debugLine="Sleep(0)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "butsaveqrcode_click"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 2586;BA.debugLine="QRCodePanel.Visible = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._qrcodepanel.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2587;BA.debugLine="butSaveQRCode.Enabled = False";
Debug.ShouldStop(67108864);
parent.mostCurrent._butsaveqrcode.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2588;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _buttonappnetwork_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAppNetwork_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1942);
if (RapidSub.canDelegate("buttonappnetwork_click")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","buttonappnetwork_click");}
 BA.debugLineNum = 1942;BA.debugLine="Sub ButtonAppNetwork_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1944;BA.debugLine="MsgboxAsync(ShareCode.ConnectionBreak, ShareCode.";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._connectionbreak /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._generalnotetitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 1946;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonauthback_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAuthBack_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1371);
if (RapidSub.canDelegate("buttonauthback_click")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","buttonauthback_click");}
 BA.debugLineNum = 1371;BA.debugLine="Sub ButtonAuthBack_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1372;BA.debugLine="ResetPanels";
Debug.ShouldStop(134217728);
_resetpanels();
 BA.debugLineNum = 1373;BA.debugLine="Panel_Config.Visible = True";
Debug.ShouldStop(268435456);
main.mostCurrent._panel_config.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1374;BA.debugLine="Starter.CurrentFlowPosition = 0";
Debug.ShouldStop(536870912);
main.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1375;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonauthnext_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAuthNext_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1354);
if (RapidSub.canDelegate("buttonauthnext_click")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","buttonauthnext_click");}
RemoteObject _authdata = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._authorization");
 BA.debugLineNum = 1354;BA.debugLine="Sub ButtonAuthNext_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 1355;BA.debugLine="Log(\"ButtonAuthNext_Click\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6111017985",RemoteObject.createImmutable("ButtonAuthNext_Click"),0);
 BA.debugLineNum = 1356;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
Debug.ShouldStop(2048);
if (main.mostCurrent._sharecode._app_working_local /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1357;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoConnec";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._authorizationdata_noconnection_validate /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 }else {
 BA.debugLineNum = 1359;BA.debugLine="If Not(Utils.isNullOrEmpty(EditInstance.text)) A";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._editinstance.runMethod(true,"getText")))))) && RemoteObject.solveBoolean(".",main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._editauthorization.runMethod(true,"getText"))))))) { 
 BA.debugLineNum = 1361;BA.debugLine="Dim authData As Authorization = Types.MakeAutho";
Debug.ShouldStop(65536);
_authdata = main.mostCurrent._types.runMethod(false,"_makeauthorization" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._editinstance.runMethod(true,"getText")),(Object)(main.mostCurrent._editauthorization.runMethod(true,"getText")),(Object)(main.mostCurrent._sharecode._app_version /*RemoteObject*/ ),(Object)(main.mostCurrent._sharecode._app_domain /*RemoteObject*/ ));Debug.locals.put("authData", _authdata);Debug.locals.put("authData", _authdata);
 BA.debugLineNum = 1362;BA.debugLine="ResetPanels";
Debug.ShouldStop(131072);
_resetpanels();
 BA.debugLineNum = 1363;BA.debugLine="Panel_Verification.Visible = True";
Debug.ShouldStop(262144);
main.mostCurrent._panel_verification.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1364;BA.debugLine="SetAuthorization(authData)";
Debug.ShouldStop(524288);
_setauthorization(_authdata);
 }else {
 BA.debugLineNum = 1366;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoData,";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._authorizationdata_nodata /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 };
 };
 BA.debugLineNum = 1369;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonloginenter_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLoginEnter_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1256);
if (RapidSub.canDelegate("buttonloginenter_click")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","buttonloginenter_click"); return;}
ResumableSub_ButtonLoginEnter_Click rsub = new ResumableSub_ButtonLoginEnter_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonLoginEnter_Click extends BA.ResumableSub {
public ResumableSub_ButtonLoginEnter_Click(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _i = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonLoginEnter_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1256);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1257;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 26;
if (parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1258;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.OffLineMessage_";
Debug.ShouldStop(512);
_i = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._offlinemessage_confirm /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1259;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 17;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 1273;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
this.state = 14;
}else {
this.state = 16;
}}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1261;BA.debugLine="If Not(Utils.isNullOrEmpty(EditUserName.text))";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._editusername.runMethod(true,"getText")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._editpassword.runMethod(true,"getText"))))))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1262;BA.debugLine="ResetPanels";
Debug.ShouldStop(8192);
_resetpanels();
 BA.debugLineNum = 1263;BA.debugLine="Panel_Login_Validation.Visible = True";
Debug.ShouldStop(16384);
parent.mostCurrent._panel_login_validation.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1264;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(32768);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 BA.debugLineNum = 1265;BA.debugLine="Sleep(500)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "buttonloginenter_click"),BA.numberCast(int.class, 500));
this.state = 27;
return;
case 27:
//C
this.state = 12;
;
 BA.debugLineNum = 1267;BA.debugLine="SetLogin(EditUserName.text, EditPassword.text)";
Debug.ShouldStop(262144);
_setlogin(parent.mostCurrent._editusername.runMethod(true,"getText"),parent.mostCurrent._editpassword.runMethod(true,"getText"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1271;BA.debugLine="MsgboxAsync(ShareCode.Login_NoData, ShareCode.";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._login_nodata /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 if (true) break;

case 12:
//C
this.state = 17;
;
 if (true) break;

case 14:
//C
this.state = 17;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1276;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 17:
//C
this.state = 26;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1279;BA.debugLine="If Not(Utils.isNullOrEmpty(EditUserName.text)) A";
Debug.ShouldStop(1073741824);
if (true) break;

case 20:
//if
this.state = 25;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._editusername.runMethod(true,"getText")))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._editpassword.runMethod(true,"getText"))))))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 1280;BA.debugLine="ResetPanels";
Debug.ShouldStop(-2147483648);
_resetpanels();
 BA.debugLineNum = 1281;BA.debugLine="Panel_Login_Validation.Visible = True";
Debug.ShouldStop(1);
parent.mostCurrent._panel_login_validation.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1282;BA.debugLine="Sleep(500)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "buttonloginenter_click"),BA.numberCast(int.class, 500));
this.state = 28;
return;
case 28:
//C
this.state = 25;
;
 BA.debugLineNum = 1283;BA.debugLine="Starter.CurrentFlowPosition = 3123";
Debug.ShouldStop(4);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3123);
 BA.debugLineNum = 1285;BA.debugLine="ResetPanels";
Debug.ShouldStop(16);
_resetpanels();
 BA.debugLineNum = 1286;BA.debugLine="Panel_Login_Validation.Visible = True";
Debug.ShouldStop(32);
parent.mostCurrent._panel_login_validation.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1287;BA.debugLine="Sleep(500)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "buttonloginenter_click"),BA.numberCast(int.class, 500));
this.state = 29;
return;
case 29:
//C
this.state = 25;
;
 BA.debugLineNum = 1288;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(128);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 BA.debugLineNum = 1290;BA.debugLine="SetLogin(EditUserName.text, EditPassword.text)";
Debug.ShouldStop(512);
_setlogin(parent.mostCurrent._editusername.runMethod(true,"getText"),parent.mostCurrent._editpassword.runMethod(true,"getText"));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1293;BA.debugLine="MsgboxAsync(ShareCode.Login_NoData, ShareCode.G";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._login_nodata /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 1296;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _buttonloginexit_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLoginExit_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1252);
if (RapidSub.canDelegate("buttonloginexit_click")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","buttonloginexit_click");}
 BA.debugLineNum = 1252;BA.debugLine="Sub ButtonLoginExit_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1253;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1254;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonloginreset_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLoginReset_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1248);
if (RapidSub.canDelegate("buttonloginreset_click")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","buttonloginreset_click");}
 BA.debugLineNum = 1248;BA.debugLine="Sub ButtonLoginReset_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1250;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonwelcomenext_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonWelcomeNext_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1228);
if (RapidSub.canDelegate("buttonwelcomenext_click")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","buttonwelcomenext_click");}
 BA.debugLineNum = 1228;BA.debugLine="Sub ButtonWelcomeNext_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1234;BA.debugLine="If Not(ShareCode.DEVICE_ORIENTATION = SelectOrien";
Debug.ShouldStop(131072);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ,BA.numberCast(double.class, main.mostCurrent._selectorientation.runMethod(true,"getSelectedIndex")))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1235;BA.debugLine="ShareCode.DEVICE_ORIENTATION = SelectOrientation";
Debug.ShouldStop(262144);
main.mostCurrent._sharecode._device_orientation /*RemoteObject*/  = main.mostCurrent._selectorientation.runMethod(true,"getSelectedIndex");
 BA.debugLineNum = 1236;BA.debugLine="Device.SetScreenOrientation(SelectOrientation.Se";
Debug.ShouldStop(524288);
main._device.runVoidMethod ("SetScreenOrientation",main.processBA,(Object)(main.mostCurrent._selectorientation.runMethod(true,"getSelectedIndex")));
 }else {
 BA.debugLineNum = 1238;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
Debug.ShouldStop(2097152);
if (main.mostCurrent._sharecode._app_working_local /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1239;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoConne";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._authorizationdata_noconnection_validate /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(main.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 }else {
 BA.debugLineNum = 1241;BA.debugLine="ResetPanels";
Debug.ShouldStop(16777216);
_resetpanels();
 BA.debugLineNum = 1242;BA.debugLine="Panel_Authorization.Visible = True";
Debug.ShouldStop(33554432);
main.mostCurrent._panel_authorization.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1243;BA.debugLine="Starter.CurrentFlowPosition = 1";
Debug.ShouldStop(67108864);
main.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 1);
 };
 };
 BA.debugLineNum = 1246;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _call_checkwebaccess() throws Exception{
try {
		Debug.PushSubsStack("Call_CheckWebAccess (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,212);
if (RapidSub.canDelegate("call_checkwebaccess")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","call_checkwebaccess");}
 BA.debugLineNum = 212;BA.debugLine="Sub Call_CheckWebAccess";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 214;BA.debugLine="CallSub(Starter, \"CheckWebAccess\")";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",main.processBA,(Object)((main.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("CheckWebAccess")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e4.toString()); BA.debugLineNum = 216;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6108331012",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 217;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16777216);
main.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 };
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _canrequestpackageinstalls() throws Exception{
try {
		Debug.PushSubsStack("CanRequestPackageInstalls (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1131);
if (RapidSub.canDelegate("canrequestpackageinstalls")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","canrequestpackageinstalls");}
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _packagemanager = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 1131;BA.debugLine="Private Sub CanRequestPackageInstalls As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1132;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(2048);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 1133;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(4096);
_ctxt.runVoidMethod ("InitializeContext",main.processBA);
 BA.debugLineNum = 1134;BA.debugLine="Dim PackageManager As JavaObject = ctxt.RunMethod";
Debug.ShouldStop(8192);
_packagemanager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_packagemanager = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _ctxt.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPackageManager")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("PackageManager", _packagemanager);
 BA.debugLineNum = 1135;BA.debugLine="Return PackageManager.RunMethod(\"canRequestPackag";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToBoolean(_packagemanager.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("canRequestPackageInstalls")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));
 BA.debugLineNum = 1136;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _check_firstinstall_in_progress() throws Exception{
try {
		Debug.PushSubsStack("Check_FIRSTINSTALL_IN_PROGRESS (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2634);
if (RapidSub.canDelegate("check_firstinstall_in_progress")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","check_firstinstall_in_progress"); return;}
ResumableSub_Check_FIRSTINSTALL_IN_PROGRESS rsub = new ResumableSub_Check_FIRSTINSTALL_IN_PROGRESS(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Check_FIRSTINSTALL_IN_PROGRESS extends BA.ResumableSub {
public ResumableSub_Check_FIRSTINSTALL_IN_PROGRESS(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Check_FIRSTINSTALL_IN_PROGRESS (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2634);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2639;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTALL";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FIRSTINSTALL_IN_PROGRESS"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2642;BA.debugLine="Msgbox2Async($\"O sistema detectou uma instalação";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("O sistema detectou uma instalação anterior incompleta !"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("A instalação vai Reiniciar."))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2643;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "check_firstinstall_in_progress"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2644;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 2650;BA.debugLine="File.writestring(Starter.SharedFolder,\"FIRSTINSTA";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("FIRSTINSTALL_IN_PROGRESS")),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,main.mostCurrent.activityBA)));
 BA.debugLineNum = 2651;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _check_installed_date() throws Exception{
try {
		Debug.PushSubsStack("Check_Installed_Date (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,369);
if (RapidSub.canDelegate("check_installed_date")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","check_installed_date");}
 BA.debugLineNum = 369;BA.debugLine="Sub Check_Installed_Date";
Debug.ShouldStop(65536);
 BA.debugLineNum = 372;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_instal";
Debug.ShouldStop(524288);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 373;BA.debugLine="ShareCode.Installed_Date = File.ReadString(Start";
Debug.ShouldStop(1048576);
main.mostCurrent._sharecode._installed_date /*RemoteObject*/  = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))));
 }else {
 BA.debugLineNum = 375;BA.debugLine="ShareCode.Installed_Date = \"\"";
Debug.ShouldStop(4194304);
main.mostCurrent._sharecode._installed_date /*RemoteObject*/  = BA.ObjectToString("");
 };
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
public static RemoteObject  _checkappversion() throws Exception{
try {
		Debug.PushSubsStack("CheckAppVersion (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,929);
if (RapidSub.canDelegate("checkappversion")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","checkappversion");}
ResumableSub_CheckAppVersion rsub = new ResumableSub_CheckAppVersion(null);
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
public static class ResumableSub_CheckAppVersion extends BA.ResumableSub {
public ResumableSub_CheckAppVersion(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjsondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _version = RemoteObject.createImmutable("");
RemoteObject _releasedate = RemoteObject.createImmutable("");
RemoteObject _duedate = RemoteObject.createImmutable("");
RemoteObject _remove = RemoteObject.createImmutable(0);
RemoteObject _appl_auth = RemoteObject.createImmutable("");
RemoteObject _appl_instance = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckAppVersion (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,929);
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
 BA.debugLineNum = 931;BA.debugLine="Sleep(100)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkappversion"),BA.numberCast(int.class, 100));
this.state = 27;
return;
case 27:
//C
this.state = 1;
;
 BA.debugLineNum = 932;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(8);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/device/update")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 933;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6109576196",_serveraddress,0);
 BA.debugLineNum = 934;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 935;BA.debugLine="params.Initialize";
Debug.ShouldStop(64);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 936;BA.debugLine="params.Clear";
Debug.ShouldStop(128);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 937;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 938;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 939;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._versiontagcode)));
 BA.debugLineNum = 940;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._deviceauthorization)));
 BA.debugLineNum = 941;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._deviceinstance)));
 BA.debugLineNum = 942;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._devicebrand)));
 BA.debugLineNum = 943;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._devicemodel)));
 BA.debugLineNum = 944;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._devicemacaddress)));
 BA.debugLineNum = 945;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 947;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(262144);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 948;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(524288);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 950;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(2097152);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 952;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8388608);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 953;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(16777216);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 954;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(33554432);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 955;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 957;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkappversion"), (_job));
this.state = 28;
return;
case 28:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 958;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 26;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 959;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//try
this.state = 25;
this.catchState = 24;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 24;
 BA.debugLineNum = 960;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(-2147483648);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 961;BA.debugLine="JSON1.Initialize(Job.GetString())";
Debug.ShouldStop(1);
_json1.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 962;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(2);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 967;BA.debugLine="Dim JSON2 As JSONParser";
Debug.ShouldStop(64);
_json2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON2", _json2);
 BA.debugLineNum = 968;BA.debugLine="JSON2.Initialize(MapJSON.Get(\"data\"))";
Debug.ShouldStop(128);
_json2.runVoidMethod ("Initialize",(Object)(BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))))));
 BA.debugLineNum = 969;BA.debugLine="Dim MapJSONData As Map = JSON2.NextObject";
Debug.ShouldStop(256);
_mapjsondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjsondata = _json2.runMethod(false,"NextObject");Debug.locals.put("MapJSONData", _mapjsondata);Debug.locals.put("MapJSONData", _mapjsondata);
 BA.debugLineNum = 971;BA.debugLine="Dim filename As String = MapJSONData.Get(\"filen";
Debug.ShouldStop(1024);
_filename = BA.ObjectToString(_mapjsondata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("filename")))));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 972;BA.debugLine="Dim version As String = MapJSONData.Get(\"versio";
Debug.ShouldStop(2048);
_version = BA.ObjectToString(_mapjsondata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("version")))));Debug.locals.put("version", _version);Debug.locals.put("version", _version);
 BA.debugLineNum = 973;BA.debugLine="Dim releaseDate As String = MapJSONData.Get(\"re";
Debug.ShouldStop(4096);
_releasedate = BA.ObjectToString(_mapjsondata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("release_date")))));Debug.locals.put("releaseDate", _releasedate);Debug.locals.put("releaseDate", _releasedate);
 BA.debugLineNum = 974;BA.debugLine="Dim dueDate As String = MapJSONData.Get(\"due_da";
Debug.ShouldStop(8192);
_duedate = BA.ObjectToString(_mapjsondata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("due_date")))));Debug.locals.put("dueDate", _duedate);Debug.locals.put("dueDate", _duedate);
 BA.debugLineNum = 975;BA.debugLine="Dim remove As Int = MapJSONData.Get(\"remove\")";
Debug.ShouldStop(16384);
_remove = BA.numberCast(int.class, _mapjsondata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("remove")))));Debug.locals.put("remove", _remove);Debug.locals.put("remove", _remove);
 BA.debugLineNum = 976;BA.debugLine="Dim  APPL_AUTH As String = Utils.SelectFieldFro";
Debug.ShouldStop(32768);
_appl_auth = parent.mostCurrent._utils.runMethod(true,"_selectfieldfromlocalsqlwrkconfigtable" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("authorization")));Debug.locals.put("APPL_AUTH", _appl_auth);Debug.locals.put("APPL_AUTH", _appl_auth);
 BA.debugLineNum = 977;BA.debugLine="Dim  APPL_INSTANCE As String = Utils.SelectFiel";
Debug.ShouldStop(65536);
_appl_instance = parent.mostCurrent._utils.runMethod(true,"_selectfieldfromlocalsqlwrkconfigtable" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("instance")));Debug.locals.put("APPL_INSTANCE", _appl_instance);Debug.locals.put("APPL_INSTANCE", _appl_instance);
 BA.debugLineNum = 979;BA.debugLine="Sleep(100)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkappversion"),BA.numberCast(int.class, 100));
this.state = 29;
return;
case 29:
//C
this.state = 7;
;
 BA.debugLineNum = 981;BA.debugLine="If DateTime.DateParse(DateTime.Date(DateTime.No";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//if
this.state = 22;
if (RemoteObject.solveBoolean("k",parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))))),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_duedate)))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 996;BA.debugLine="Else If DateTime.DateParse(DateTime.Date(DateTi";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))))),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_duedate)))) { 
this.state = 15;
}}
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 982;BA.debugLine="Msgbox2Async(\"Existe uma versão mais recente d";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Existe uma versão mais recente da aplicação. Deseja Actualizar?")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 983;BA.debugLine="Wait For Msgbox_Result (Res As Int)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkappversion"), null);
this.state = 30;
return;
case 30:
//C
this.state = 10;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 984;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 986;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_AUTH")),(Object)(_appl_auth));
 BA.debugLineNum = 987;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_INSTANCE")),(Object)(_appl_instance));
 BA.debugLineNum = 988;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"R";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("RESET_APPLICATION")),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 990;BA.debugLine="DeleteLocalDatabase(remove)";
Debug.ShouldStop(536870912);
_deletelocaldatabase(_remove);
 BA.debugLineNum = 992;BA.debugLine="Wait For (DownloadAPK(filename)) Complete (Re";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkappversion"), _downloadapk(_filename));
this.state = 31;
return;
case 31:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 13:
//C
this.state = 22;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 998;BA.debugLine="Msgbox2Async(ShareCode.AvisoNovoAPK, ShareCode";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisonovoapk /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 999;BA.debugLine="Wait For Msgbox_Result (Res As Int)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkappversion"), null);
this.state = 32;
return;
case 32:
//C
this.state = 16;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 1000;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 1002;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
Debug.ShouldStop(512);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_AUTH")),(Object)(_appl_auth));
 BA.debugLineNum = 1003;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
Debug.ShouldStop(1024);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_INSTANCE")),(Object)(_appl_instance));
 BA.debugLineNum = 1004;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"R";
Debug.ShouldStop(2048);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("RESET_APPLICATION")),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 1006;BA.debugLine="DeleteLocalDatabase(remove)";
Debug.ShouldStop(8192);
_deletelocaldatabase(_remove);
 BA.debugLineNum = 1008;BA.debugLine="Wait For (DownloadAPK(filename)) Complete (Re";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkappversion"), _downloadapk(_filename));
this.state = 33;
return;
case 33:
//C
this.state = 21;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1010;BA.debugLine="Return True";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 25;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
 BA.debugLineNum = 1016;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6109576279",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1017;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 1019;BA.debugLine="Log(Job.ErrorMessage)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6109576282",_job.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1020;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 1021;BA.debugLine="Job.Release";
Debug.ShouldStop(268435456);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1022;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 1026;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6109576289",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1027;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 1028;BA.debugLine="Job.Release";
Debug.ShouldStop(8);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1029;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 1030;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _checkdeviceorientation() throws Exception{
try {
		Debug.PushSubsStack("CheckDeviceOrientation (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,307);
if (RapidSub.canDelegate("checkdeviceorientation")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","checkdeviceorientation"); return;}
ResumableSub_CheckDeviceOrientation rsub = new ResumableSub_CheckDeviceOrientation(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckDeviceOrientation extends BA.ResumableSub {
public ResumableSub_CheckDeviceOrientation(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckDeviceOrientation (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,307);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 308;BA.debugLine="If mainPanelSplash.Width > mainPanelSplash.Height";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._mainpanelsplash.runMethod(true,"getWidth"),BA.numberCast(double.class, parent.mostCurrent._mainpanelsplash.runMethod(true,"getHeight")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 309;BA.debugLine="CurrentOrientation = 0";
Debug.ShouldStop(1048576);
parent._currentorientation = BA.numberCast(int.class, 0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 311;BA.debugLine="CurrentOrientation = 1";
Debug.ShouldStop(4194304);
parent._currentorientation = BA.numberCast(int.class, 1);
 if (true) break;
;
 BA.debugLineNum = 314;BA.debugLine="If ShareCode.ISPHONE And CurrentOrientation = 0 T";
Debug.ShouldStop(33554432);

case 6:
//if
this.state = 19;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._sharecode._isphone /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",parent._currentorientation,BA.numberCast(double.class, 0))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 320;BA.debugLine="else if Not(ShareCode.ISPHONE) And CurrentOrienta";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._isphone /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",parent._currentorientation,BA.numberCast(double.class, 1))) { 
this.state = 14;
}}
if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 315;BA.debugLine="Msgbox2Async($\"A orientação do dispositivo está";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("A orientação do dispositivo está definida como landscape (Horizontal)"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Esta definição pode causar erros na aplicação. Continuar a execução ?"))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Não")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 316;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkdeviceorientation"), null);
this.state = 25;
return;
case 25:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 317;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(268435456);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 318;BA.debugLine="ExitApplication";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 12:
//C
this.state = 19;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 321;BA.debugLine="Msgbox2Async($\"A orientação do dispositivo está";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("A orientação do dispositivo está definida como portrait (Vertical)"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Esta definição pode causar erros na aplicação. Continuar a execução ?"))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Não")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 322;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkdeviceorientation"), null);
this.state = 26;
return;
case 26:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 323;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(4);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 324;BA.debugLine="ExitApplication";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;
;
 BA.debugLineNum = 328;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(128);

case 19:
//if
this.state = 24;
if ((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 329;BA.debugLine="ShareCode.DEVICE_ORIENTATION = 1";
Debug.ShouldStop(256);
parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 330;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(512);
parent._device.runVoidMethod ("SetScreenOrientation",main.processBA,(Object)(parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 332;BA.debugLine="ShareCode.DEVICE_ORIENTATION = 0";
Debug.ShouldStop(2048);
parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 333;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(4096);
parent._device.runVoidMethod ("SetScreenOrientation",main.processBA,(Object)(parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _checkdevicespecificparameters(RemoteObject _sp) throws Exception{
try {
		Debug.PushSubsStack("checkDeviceSpecificParameters (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,415);
if (RapidSub.canDelegate("checkdevicespecificparameters")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","checkdevicespecificparameters", _sp);}
ResumableSub_checkDeviceSpecificParameters rsub = new ResumableSub_checkDeviceSpecificParameters(null,_sp);
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
public static class ResumableSub_checkDeviceSpecificParameters extends BA.ResumableSub {
public ResumableSub_checkDeviceSpecificParameters(xevolution.vrcg.devdemov2400.main parent,RemoteObject _sp) {
this.parent = parent;
this._sp = _sp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _sp;
RemoteObject _marca = RemoteObject.createImmutable("");
RemoteObject _modelo = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("checkDeviceSpecificParameters (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,415);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("SP", _sp);
 BA.debugLineNum = 417;BA.debugLine="ShareCode.DEVICE_BRAND = Device.Manufacturer";
Debug.ShouldStop(1);
parent.mostCurrent._sharecode._device_brand /*RemoteObject*/  = parent._device.runMethod(true,"getManufacturer");
 BA.debugLineNum = 418;BA.debugLine="ShareCode.DEVICE_MODEL = Device.Model";
Debug.ShouldStop(2);
parent.mostCurrent._sharecode._device_model /*RemoteObject*/  = parent._device.runMethod(true,"getModel");
 BA.debugLineNum = 419;BA.debugLine="ShareCode.DEVICE_TYPE = Device.Product";
Debug.ShouldStop(4);
parent.mostCurrent._sharecode._device_type /*RemoteObject*/  = parent._device.runMethod(true,"getProduct");
 BA.debugLineNum = 421;BA.debugLine="Dim MARCA As String = ShareCode.DEVICE_BRAND.ToUp";
Debug.ShouldStop(16);
_marca = parent.mostCurrent._sharecode._device_brand /*RemoteObject*/ .runMethod(true,"toUpperCase");Debug.locals.put("MARCA", _marca);Debug.locals.put("MARCA", _marca);
 BA.debugLineNum = 422;BA.debugLine="Dim MODELO As String = ShareCode.DEVICE_MODEL.ToU";
Debug.ShouldStop(32);
_modelo = parent.mostCurrent._sharecode._device_model /*RemoteObject*/ .runMethod(true,"toUpperCase");Debug.locals.put("MODELO", _modelo);Debug.locals.put("MODELO", _modelo);
 BA.debugLineNum = 424;BA.debugLine="Select Case MARCA";
Debug.ShouldStop(128);
if (true) break;

case 1:
//select
this.state = 16;
switch (BA.switchObjectToInt(_marca,BA.ObjectToString("LENOVO"),BA.ObjectToString("SAMSUNG"),BA.ObjectToString("HUAWEI"),BA.ObjectToString("ALCATEL"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
case 2: {
this.state = 11;
if (true) break;
}
case 3: {
this.state = 13;
if (true) break;
}
default: {
this.state = 15;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 426;BA.debugLine="If MODELO = \"TB-7504X\" Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("TB-7504X"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 427;BA.debugLine="ShareCode.DEVICE_ORIENTATION = 1";
Debug.ShouldStop(1024);
parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 428;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(2048);
parent._device.runVoidMethod ("SetScreenOrientation",main.processBA,(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 429;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_O";
Debug.ShouldStop(4096);
parent._device.runVoidMethod ("SetScreenOrientation",main.processBA,(Object)(parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 if (true) break;

case 7:
//C
this.state = 16;
;
 if (true) break;

case 9:
//C
this.state = 16;
 if (true) break;

case 11:
//C
this.state = 16;
 if (true) break;

case 13:
//C
this.state = 16;
 if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 441;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 442;BA.debugLine="End Sub";
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
public static void  _checkif_files_isgreaterthanzero(RemoteObject _sqlfilestotal) throws Exception{
try {
		Debug.PushSubsStack("CheckIf_files_IsGreaterThanZero (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2670);
if (RapidSub.canDelegate("checkif_files_isgreaterthanzero")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","checkif_files_isgreaterthanzero", _sqlfilestotal); return;}
ResumableSub_CheckIf_files_IsGreaterThanZero rsub = new ResumableSub_CheckIf_files_IsGreaterThanZero(null,_sqlfilestotal);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckIf_files_IsGreaterThanZero extends BA.ResumableSub {
public ResumableSub_CheckIf_files_IsGreaterThanZero(xevolution.vrcg.devdemov2400.main parent,RemoteObject _sqlfilestotal) {
this.parent = parent;
this._sqlfilestotal = _sqlfilestotal;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _sqlfilestotal;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckIf_files_IsGreaterThanZero (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2670);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2671;BA.debugLine="If SqlFilesTotal = 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_sqlfilestotal,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2673;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_insta";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log")))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2674;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_install";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))));
 BA.debugLineNum = 2675;BA.debugLine="ShareCode.Installed_Date = \"\"";
Debug.ShouldStop(262144);
parent.mostCurrent._sharecode._installed_date /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 2678;BA.debugLine="Msgbox2Async($\"UM OU MAIS FICHEIROS DE INSTALAÇÃ";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!"))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2679;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkif_files_isgreaterthanzero"), null);
this.state = 13;
return;
case 13:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2680;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8388608);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2681;BA.debugLine="ExitApplication";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2684;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static void  _checkif_sqlfilestotal_isequaltozero(RemoteObject _sqlfilestotal) throws Exception{
try {
		Debug.PushSubsStack("CheckIf_SqlFilesTotal_IsEqualToZero (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2743);
if (RapidSub.canDelegate("checkif_sqlfilestotal_isequaltozero")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","checkif_sqlfilestotal_isequaltozero", _sqlfilestotal); return;}
ResumableSub_CheckIf_SqlFilesTotal_IsEqualToZero rsub = new ResumableSub_CheckIf_SqlFilesTotal_IsEqualToZero(null,_sqlfilestotal);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckIf_SqlFilesTotal_IsEqualToZero extends BA.ResumableSub {
public ResumableSub_CheckIf_SqlFilesTotal_IsEqualToZero(xevolution.vrcg.devdemov2400.main parent,RemoteObject _sqlfilestotal) {
this.parent = parent;
this._sqlfilestotal = _sqlfilestotal;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _sqlfilestotal;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckIf_SqlFilesTotal_IsEqualToZero (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2743);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2744;BA.debugLine="If SqlFilesTotal = 0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_sqlfilestotal,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2746;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_insta";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log")))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2747;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_install";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))));
 BA.debugLineNum = 2748;BA.debugLine="ShareCode.Installed_Date = \"\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._sharecode._installed_date /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 2751;BA.debugLine="Msgbox2Async($\"UM OU MAIS FICHEIROS DE INSTALAÇÃ";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!"))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2752;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkif_sqlfilestotal_isequaltozero"), null);
this.state = 13;
return;
case 13:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2753;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2754;BA.debugLine="ExitApplication";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2758;BA.debugLine="End Sub";
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
public static RemoteObject  _checkinstallationrequirements() throws Exception{
try {
		Debug.PushSubsStack("CheckInstallationRequirements (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1109);
if (RapidSub.canDelegate("checkinstallationrequirements")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","checkinstallationrequirements");}
ResumableSub_CheckInstallationRequirements rsub = new ResumableSub_CheckInstallationRequirements(null);
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
public static class ResumableSub_CheckInstallationRequirements extends BA.ResumableSub {
public ResumableSub_CheckInstallationRequirements(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckInstallationRequirements (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1109);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1110;BA.debugLine="If File.ExternalWritable = False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 1113;BA.debugLine="Else If phone.SdkVersion >= 26 And CanRequestPack";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("g",parent.mostCurrent._phone.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 26)) && RemoteObject.solveBoolean("=",_canrequestpackageinstalls(),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 1123;BA.debugLine="Else If CheckNonMarketAppsEnabled = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_checknonmarketappsenabled(),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 1111;BA.debugLine="MsgboxAsync(ShareCode.AvisoNotSDCard, ShareCode.";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisonotsdcard /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 1112;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 1115;BA.debugLine="MsgboxAsync(ShareCode.AvisoInstalarApp, ShareCod";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoinstalarapp /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 1116;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkinstallationrequirements"), null);
this.state = 11;
return;
case 11:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1117;BA.debugLine="Dim in As Intent";
Debug.ShouldStop(268435456);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 1118;BA.debugLine="in.Initialize(\"android.settings.MANAGE_UNKNOWN_A";
Debug.ShouldStop(536870912);
_in.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.settings.MANAGE_UNKNOWN_APP_SOURCES")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("package:"),parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"))));
 BA.debugLineNum = 1119;BA.debugLine="StartActivity(in)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((_in.getObject())));
 BA.debugLineNum = 1120;BA.debugLine="Wait For Activity_Resume '<-- wait for Activity_";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_resume", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "checkinstallationrequirements"), null);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 1121;BA.debugLine="Return CanRequestPackageInstalls";
Debug.ShouldStop(1);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_canrequestpackageinstalls()));return;};
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 1124;BA.debugLine="MsgboxAsync(ShareCode.AvisoInstalarFontes1 & CRL";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._avisoinstalarfontes1 /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent._sharecode._avisoinstalarfontes2 /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent._sharecode._avisoinstalarfontes3 /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 1125;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1127;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1129;BA.debugLine="End Sub";
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
public static RemoteObject  _checknonmarketappsenabled() throws Exception{
try {
		Debug.PushSubsStack("CheckNonMarketAppsEnabled (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1138);
if (RapidSub.canDelegate("checknonmarketappsenabled")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","checknonmarketappsenabled");}
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _resolver = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _global = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 1138;BA.debugLine="Private Sub CheckNonMarketAppsEnabled As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1139;BA.debugLine="If phone.SdkVersion >= 26 Then Return True";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("g",main.mostCurrent._phone.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 26))) { 
if (true) return main.mostCurrent.__c.getField(true,"True");};
 BA.debugLineNum = 1140;BA.debugLine="If phone.SdkVersion < 17 Or phone.SdkVersion >= 2";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",main.mostCurrent._phone.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 17)) || RemoteObject.solveBoolean("g",main.mostCurrent._phone.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 21))) { 
 BA.debugLineNum = 1141;BA.debugLine="Return phone.GetSettings(\"install_non_market_app";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",main.mostCurrent._phone.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("install_non_market_apps"))),BA.ObjectToString("1")));
 }else {
 BA.debugLineNum = 1143;BA.debugLine="Dim context As JavaObject";
Debug.ShouldStop(4194304);
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 1144;BA.debugLine="context.InitializeContext";
Debug.ShouldStop(8388608);
_context.runVoidMethod ("InitializeContext",main.processBA);
 BA.debugLineNum = 1145;BA.debugLine="Dim resolver As JavaObject = context.RunMethod(\"";
Debug.ShouldStop(16777216);
_resolver = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_resolver = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _context.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getContentResolver")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("resolver", _resolver);
 BA.debugLineNum = 1146;BA.debugLine="Dim global As JavaObject";
Debug.ShouldStop(33554432);
_global = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("global", _global);
 BA.debugLineNum = 1147;BA.debugLine="global.InitializeStatic(\"android.provider.Settin";
Debug.ShouldStop(67108864);
_global.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.provider.Settings.Global")));
 BA.debugLineNum = 1148;BA.debugLine="Return global.RunMethod(\"getString\", Array(resol";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_global.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getString")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_resolver.getObject()),(RemoteObject.createImmutable("install_non_market_apps"))}))),RemoteObject.createImmutable(("1"))));
 };
 BA.debugLineNum = 1150;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closeallservices() throws Exception{
try {
		Debug.PushSubsStack("CloseAllServices (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1298);
if (RapidSub.canDelegate("closeallservices")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","closeallservices");}
 BA.debugLineNum = 1298;BA.debugLine="Sub CloseAllServices";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1299;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1300;BA.debugLine="CancelScheduledService(Comms)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("CancelScheduledService",main.processBA,(Object)((main.mostCurrent._comms.getObject())));
 BA.debugLineNum = 1301;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._comms.getObject())));
 BA.debugLineNum = 1302;BA.debugLine="CancelScheduledService(BackgroundUpdateService)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("CancelScheduledService",main.processBA,(Object)((main.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 1303;BA.debugLine="StopService(BackgroundUpdateService)";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 1304;BA.debugLine="CancelScheduledService(LocationService)";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("CancelScheduledService",main.processBA,(Object)((main.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 1305;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 1306;BA.debugLine="CancelScheduledService(Logs)";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("CancelScheduledService",main.processBA,(Object)((main.mostCurrent._logs.getObject())));
 BA.debugLineNum = 1307;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._logs.getObject())));
 BA.debugLineNum = 1308;BA.debugLine="CancelScheduledService(Starter)";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("CancelScheduledService",main.processBA,(Object)((main.mostCurrent._starter.getObject())));
 BA.debugLineNum = 1309;BA.debugLine="StopService(Starter)";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._starter.getObject())));
 BA.debugLineNum = 1310;BA.debugLine="CancelScheduledService(UpdateService)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("CancelScheduledService",main.processBA,(Object)((main.mostCurrent._updateservice.getObject())));
 BA.debugLineNum = 1311;BA.debugLine="StopService(UpdateService)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._updateservice.getObject())));
 BA.debugLineNum = 1312;BA.debugLine="CancelScheduledService(UserService)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("CancelScheduledService",main.processBA,(Object)((main.mostCurrent._userservice.getObject())));
 BA.debugLineNum = 1313;BA.debugLine="StopService(UserService)";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._userservice.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e17.toString()); BA.debugLineNum = 1315;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6110690321",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1316;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(8);
main.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 };
 BA.debugLineNum = 1318;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createauthparams(RemoteObject _instance,RemoteObject _authorization,RemoteObject _version) throws Exception{
try {
		Debug.PushSubsStack("CreateAuthParams (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1683);
if (RapidSub.canDelegate("createauthparams")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","createauthparams", _instance, _authorization, _version);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Instance", _instance);
Debug.locals.put("Authorization", _authorization);
Debug.locals.put("Version", _version);
 BA.debugLineNum = 1683;BA.debugLine="Sub CreateAuthParams(Instance As String, Authoriza";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1684;BA.debugLine="Dim params As Map";
Debug.ShouldStop(524288);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1685;BA.debugLine="params.Initialize";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1686;BA.debugLine="params.Clear";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1688;BA.debugLine="params.Put(\"instance\", Instance)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("instance"))),(Object)((_instance)));
 BA.debugLineNum = 1689;BA.debugLine="params.Put(\"authorization\", Authorization)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((_authorization)));
 BA.debugLineNum = 1690;BA.debugLine="params.Put(\"version\", Version)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((_version)));
 BA.debugLineNum = 1691;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((main._versiontagcode)));
 BA.debugLineNum = 1692;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((main._deviceauthorization)));
 BA.debugLineNum = 1693;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((main._deviceinstance)));
 BA.debugLineNum = 1694;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((main._devicebrand)));
 BA.debugLineNum = 1695;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((main._devicemodel)));
 BA.debugLineNum = 1696;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((main._devicemacaddress)));
 BA.debugLineNum = 1697;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((main.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1699;BA.debugLine="Return params";
Debug.ShouldStop(4);
if (true) return _params;
 BA.debugLineNum = 1700;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createglobalftp() throws Exception{
try {
		Debug.PushSubsStack("CreateGlobalFTP (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,3050);
if (RapidSub.canDelegate("createglobalftp")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","createglobalftp");}
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _ctm = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");
 BA.debugLineNum = 3050;BA.debugLine="Sub CreateGlobalFTP As FTP";
Debug.ShouldStop(512);
 BA.debugLineNum = 3051;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(1024);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 3053;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(4096);
_globalftp.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 3054;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(8192);
_globalftp.runMethod(true,"setPassiveMode",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3055;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(16384);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 3056;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(32768);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 3057;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(65536);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 3058;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(131072);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 3059;BA.debugLine="Return GlobalFTP";
Debug.ShouldStop(262144);
if (true) return _globalftp;
 BA.debugLineNum = 3060;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createlocaluser(RemoteObject _tech,RemoteObject _utech,RemoteObject _udtech) throws Exception{
try {
		Debug.PushSubsStack("CreateLocalUser (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2140);
if (RapidSub.canDelegate("createlocaluser")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","createlocaluser", _tech, _utech, _udtech); return;}
ResumableSub_CreateLocalUser rsub = new ResumableSub_CreateLocalUser(null,_tech,_utech,_udtech);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateLocalUser extends BA.ResumableSub {
public ResumableSub_CreateLocalUser(xevolution.vrcg.devdemov2400.main parent,RemoteObject _tech,RemoteObject _utech,RemoteObject _udtech) {
this.parent = parent;
this._tech = _tech;
this._utech = _utech;
this._udtech = _udtech;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _tech;
RemoteObject _utech;
RemoteObject _udtech;
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateLocalUser (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2140);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("tech", _tech);
Debug.locals.put("utech", _utech);
Debug.locals.put("udtech", _udtech);
 BA.debugLineNum = 2144;BA.debugLine="Log(\"... Inserting\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112066564",RemoteObject.createImmutable("... Inserting"),0);
 BA.debugLineNum = 2145;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(1);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2146;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(2);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2147;BA.debugLine="InsertList.Add(tech)";
Debug.ShouldStop(4);
_insertlist.runVoidMethod ("Add",(Object)((_tech.getObject())));
 BA.debugLineNum = 2148;BA.debugLine="Try";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 2150;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_technicals")),(Object)(_insertlist),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2151;BA.debugLine="Sleep(100)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "createlocaluser"),BA.numberCast(int.class, 100));
this.state = 19;
return;
case 19:
//C
this.state = 6;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 2154;BA.debugLine="Log($\"ERRO INSERT dta_technicals :: ${LastExcept";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112066574",(RemoteObject.concat(RemoteObject.createImmutable("ERRO INSERT dta_technicals :: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2155;BA.debugLine="Utils.logError(\"Inserir Técnicos\", ShareCode.SES";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Inserir Técnicos")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
 BA.debugLineNum = 2159;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(16384);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2160;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(32768);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2161;BA.debugLine="InsertList.Add(utech)";
Debug.ShouldStop(65536);
_insertlist.runVoidMethod ("Add",(Object)((_utech.getObject())));
 BA.debugLineNum = 2162;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

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
 BA.debugLineNum = 2164;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("aut_users")),(Object)(_insertlist),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2165;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "createlocaluser"),BA.numberCast(int.class, 100));
this.state = 20;
return;
case 20:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 2168;BA.debugLine="Log($\"ERRO INSERT aut_users :: ${LastException}\"";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112066588",(RemoteObject.concat(RemoteObject.createImmutable("ERRO INSERT aut_users :: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2169;BA.debugLine="Utils.logError(\"Inserir Utilizadores\", ShareCode";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Inserir Utilizadores")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 BA.debugLineNum = 2172;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(134217728);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2173;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(268435456);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2174;BA.debugLine="InsertList.Add(udtech)";
Debug.ShouldStop(536870912);
_insertlist.runVoidMethod ("Add",(Object)((_udtech.getObject())));
 BA.debugLineNum = 2175;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
if (true) break;

case 13:
//try
this.state = 18;
this.catchState = 17;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 17;
 BA.debugLineNum = 2177;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("aut_users_details")),(Object)(_insertlist),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2178;BA.debugLine="Sleep(100)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "createlocaluser"),BA.numberCast(int.class, 100));
this.state = 21;
return;
case 21:
//C
this.state = 18;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 2181;BA.debugLine="Log($\"ERRO INSERT aut_users_details :: ${LastExc";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112066601",(RemoteObject.concat(RemoteObject.createImmutable("ERRO INSERT aut_users_details :: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2182;BA.debugLine="Utils.logError(\"Inserir Detalhes Utilizador\", Sh";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Inserir Detalhes Utilizador")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 2184;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static RemoteObject  _createloginslog() throws Exception{
try {
		Debug.PushSubsStack("CreateLoginsLog (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2218);
if (RapidSub.canDelegate("createloginslog")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","createloginslog");}
RemoteObject _maplogins = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _currentuserlastlogin = RemoteObject.createImmutable("");
RemoteObject _updfile = RemoteObject.createImmutable("");
 BA.debugLineNum = 2218;BA.debugLine="Sub CreateLoginsLog";
Debug.ShouldStop(512);
 BA.debugLineNum = 2219;BA.debugLine="Dim MapLogins As Map";
Debug.ShouldStop(1024);
_maplogins = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("MapLogins", _maplogins);
 BA.debugLineNum = 2221;BA.debugLine="If Not(MapLogins.IsInitialized) Then";
Debug.ShouldStop(4096);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(_maplogins.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2222;BA.debugLine="MapLogins.Initialize";
Debug.ShouldStop(8192);
_maplogins.runVoidMethod ("Initialize");
 }else {
 BA.debugLineNum = 2224;BA.debugLine="MapLogins.Clear";
Debug.ShouldStop(32768);
_maplogins.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 2227;BA.debugLine="If File.Exists(Starter.SharedFolder,\"logins.log\")";
Debug.ShouldStop(262144);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("logins.log"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2229;BA.debugLine="MapLogins = File.ReadMap(Starter.SharedFolder,\"l";
Debug.ShouldStop(1048576);
_maplogins = main.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("logins.log")));Debug.locals.put("MapLogins", _maplogins);
 BA.debugLineNum = 2230;BA.debugLine="Log(\"===========================================";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263180",RemoteObject.createImmutable("=================================================="),0);
 BA.debugLineNum = 2231;BA.debugLine="Log(\"logins.log\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263181",RemoteObject.createImmutable("logins.log"),0);
 BA.debugLineNum = 2232;BA.debugLine="For i = 0 To MapLogins.Size - 1";
Debug.ShouldStop(8388608);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_maplogins.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2233;BA.debugLine="Log(\"Key: \" & MapLogins.GetKeyAt(i))";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263183",RemoteObject.concat(RemoteObject.createImmutable("Key: "),_maplogins.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 2234;BA.debugLine="Log(\"Value: \" & MapLogins.GetValueAt(i))";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263184",RemoteObject.concat(RemoteObject.createImmutable("Value: "),_maplogins.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2236;BA.debugLine="Log(\"===========================================";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263186",RemoteObject.createImmutable("=================================================="),0);
 BA.debugLineNum = 2237;BA.debugLine="Dim CurrentUserLastLogin As String = MapLogins.G";
Debug.ShouldStop(268435456);
_currentuserlastlogin = BA.ObjectToString(_maplogins.runMethod(false,"Get",(Object)((main.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))));Debug.locals.put("CurrentUserLastLogin", _currentuserlastlogin);Debug.locals.put("CurrentUserLastLogin", _currentuserlastlogin);
 BA.debugLineNum = 2239;BA.debugLine="If Utils.NNE(CurrentUserLastLogin) Then";
Debug.ShouldStop(1073741824);
if (main.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_currentuserlastlogin)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2240;BA.debugLine="ShareCode.FIRSTLOGININDEVICE = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._sharecode._firstloginindevice /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2242;BA.debugLine="If Utils.GetCurrentDate = CurrentUserLastLogin";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,main.mostCurrent.activityBA),_currentuserlastlogin)) { 
 BA.debugLineNum = 2243;BA.debugLine="ShareCode.FIRSTDAILYLOGIN = False";
Debug.ShouldStop(4);
main.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 2245;BA.debugLine="ShareCode.FIRSTDAILYLOGIN = True";
Debug.ShouldStop(16);
main.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 2248;BA.debugLine="MapLogins.Put(ShareCode.SESS_OPER_User,Utils.Ge";
Debug.ShouldStop(128);
_maplogins.runVoidMethod ("Put",(Object)((main.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )),(Object)((main.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,main.mostCurrent.activityBA))));
 BA.debugLineNum = 2249;BA.debugLine="File.WriteMap(Starter.SharedFolder,\"logins.log\"";
Debug.ShouldStop(256);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("logins.log")),(Object)(_maplogins));
 }else {
 BA.debugLineNum = 2251;BA.debugLine="MapLogins.Put(ShareCode.SESS_OPER_User,Utils.Ge";
Debug.ShouldStop(1024);
_maplogins.runVoidMethod ("Put",(Object)((main.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )),(Object)((main.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,main.mostCurrent.activityBA))));
 BA.debugLineNum = 2252;BA.debugLine="File.WriteMap(Starter.SharedFolder,\"logins.log\"";
Debug.ShouldStop(2048);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("logins.log")),(Object)(_maplogins));
 BA.debugLineNum = 2253;BA.debugLine="ShareCode.FIRSTDAILYLOGIN = True";
Debug.ShouldStop(4096);
main.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2254;BA.debugLine="ShareCode.FIRSTLOGININDEVICE = True";
Debug.ShouldStop(8192);
main.mostCurrent._sharecode._firstloginindevice /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 };
 }else {
 BA.debugLineNum = 2257;BA.debugLine="MapLogins.Put(ShareCode.SESS_OPER_User,Utils.Get";
Debug.ShouldStop(65536);
_maplogins.runVoidMethod ("Put",(Object)((main.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )),(Object)((main.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,main.mostCurrent.activityBA))));
 BA.debugLineNum = 2258;BA.debugLine="File.WriteMap(Starter.SharedFolder,\"logins.log\",";
Debug.ShouldStop(131072);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("logins.log")),(Object)(_maplogins));
 BA.debugLineNum = 2259;BA.debugLine="ShareCode.FIRSTDAILYLOGIN = True";
Debug.ShouldStop(262144);
main.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2260;BA.debugLine="ShareCode.FIRSTLOGININDEVICE = True";
Debug.ShouldStop(524288);
main.mostCurrent._sharecode._firstloginindevice /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2262;BA.debugLine="Dim updfile As String = $\"${ShareCode.SESS_OPER_";
Debug.ShouldStop(2097152);
_updfile = (RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_upd.log")));Debug.locals.put("updfile", _updfile);Debug.locals.put("updfile", _updfile);
 BA.debugLineNum = 2263;BA.debugLine="If File.Exists(Starter.InternalFolder,updfile) T";
Debug.ShouldStop(4194304);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_updfile)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2264;BA.debugLine="File.Delete(Starter.InternalFolder,updfile)";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_updfile));
 };
 };
 BA.debugLineNum = 2268;BA.debugLine="Log(\"============================================";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263218",RemoteObject.createImmutable("=================================================="),0);
 BA.debugLineNum = 2269;BA.debugLine="Log($\"FIRSTDAILYLOGIN : ${ShareCode.FIRSTDAILYLOG";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263219",(RemoteObject.concat(RemoteObject.createImmutable("FIRSTDAILYLOGIN : "),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2270;BA.debugLine="Log($\"FIRSTLOGININDEVICE : ${ShareCode.FIRSTLOGIN";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263220",(RemoteObject.concat(RemoteObject.createImmutable("FIRSTLOGININDEVICE : "),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._firstloginindevice /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2271;BA.debugLine="Log(\"============================================";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112263221",RemoteObject.createImmutable("=================================================="),0);
 BA.debugLineNum = 2272;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createorupdatelocaluser(RemoteObject _mapjson,RemoteObject _uname) throws Exception{
try {
		Debug.PushSubsStack("CreateOrUpdateLocalUser (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2186);
if (RapidSub.canDelegate("createorupdatelocaluser")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","createorupdatelocaluser", _mapjson, _uname);}
RemoteObject _tech = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _utech = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _udtech = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _userin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _update_at = RemoteObject.createImmutable("");
RemoteObject _user_tagcode = RemoteObject.createImmutable("");
RemoteObject _recordtech = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("MapJSON", _mapjson);
Debug.locals.put("uname", _uname);
 BA.debugLineNum = 2186;BA.debugLine="Sub CreateOrUpdateLocalUser(MapJSON As Map, uname";
Debug.ShouldStop(512);
 BA.debugLineNum = 2187;BA.debugLine="Dim tech As Map = MapJSON.Get(\"tech\")";
Debug.ShouldStop(1024);
_tech = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tech")))));Debug.locals.put("tech", _tech);
 BA.debugLineNum = 2188;BA.debugLine="Dim utech As Map = MapJSON.Get(\"utech\")";
Debug.ShouldStop(2048);
_utech = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_utech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("utech")))));Debug.locals.put("utech", _utech);
 BA.debugLineNum = 2189;BA.debugLine="Dim udtech As Map = MapJSON.Get(\"udtech\")";
Debug.ShouldStop(4096);
_udtech = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_udtech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("udtech")))));Debug.locals.put("udtech", _udtech);
 BA.debugLineNum = 2190;BA.debugLine="Dim UserIn As Map = MapJSON.Get(\"user\")";
Debug.ShouldStop(8192);
_userin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_userin = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user")))));Debug.locals.put("UserIn", _userin);
 BA.debugLineNum = 2191;BA.debugLine="Dim update_at As String = Utils.IfNullOrEmpty(Use";
Debug.ShouldStop(16384);
_update_at = main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("update_at")))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("update_at", _update_at);Debug.locals.put("update_at", _update_at);
 BA.debugLineNum = 2192;BA.debugLine="Dim user_tagcode As String = UserIn.Get(\"user_tag";
Debug.ShouldStop(32768);
_user_tagcode = BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_tagcode")))));Debug.locals.put("user_tagcode", _user_tagcode);Debug.locals.put("user_tagcode", _user_tagcode);
 BA.debugLineNum = 2194;BA.debugLine="Private RecordTech As Cursor";
Debug.ShouldStop(131072);
_recordtech = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("RecordTech", _recordtech);
 BA.debugLineNum = 2195;BA.debugLine="RecordTech = Starter.LocalSQLEVC.ExecQuery($\"Sele";
Debug.ShouldStop(262144);
_recordtech = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Select * from dta_technicals where username='"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable("'"))))));
 BA.debugLineNum = 2199;BA.debugLine="If RecordTech.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_recordtech.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2200;BA.debugLine="RecordTech.Position = 0";
Debug.ShouldStop(8388608);
_recordtech.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2201;BA.debugLine="UpdateLocalUser(RecordTech, update_at, uname, te";
Debug.ShouldStop(16777216);
_updatelocaluser(_recordtech,_update_at,_uname,_tech,_utech,_udtech,_user_tagcode);
 }else {
 BA.debugLineNum = 2204;BA.debugLine="CreateLocalUser(tech, utech, udtech)";
Debug.ShouldStop(134217728);
_createlocaluser(_tech,_utech,_udtech);
 };
 BA.debugLineNum = 2206;BA.debugLine="RecordTech.Close";
Debug.ShouldStop(536870912);
_recordtech.runVoidMethod ("Close");
 BA.debugLineNum = 2208;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createuserauthparams(RemoteObject _uname,RemoteObject _upass) throws Exception{
try {
		Debug.PushSubsStack("CreateUserAuthParams (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2049);
if (RapidSub.canDelegate("createuserauthparams")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","createuserauthparams", _uname, _upass);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sccommand = RemoteObject.createImmutable("");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("uname", _uname);
Debug.locals.put("upass", _upass);
 BA.debugLineNum = 2049;BA.debugLine="Sub CreateUserAuthParams(uname As String, upass As";
Debug.ShouldStop(1);
 BA.debugLineNum = 2050;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2051;BA.debugLine="params.Initialize";
Debug.ShouldStop(4);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2052;BA.debugLine="params.Clear";
Debug.ShouldStop(8);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2053;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((main.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2054;BA.debugLine="params.Put(\"_user\", uname)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((_uname)));
 BA.debugLineNum = 2055;BA.debugLine="params.Put(\"_key\", upass)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_key"))),(Object)((_upass)));
 BA.debugLineNum = 2056;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((main._versiontagcode)));
 BA.debugLineNum = 2057;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((main._deviceauthorization)));
 BA.debugLineNum = 2058;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((main._deviceinstance)));
 BA.debugLineNum = 2059;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((main._devicebrand)));
 BA.debugLineNum = 2060;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((main._devicemodel)));
 BA.debugLineNum = 2061;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((main._devicemacaddress)));
 BA.debugLineNum = 2063;BA.debugLine="Dim sccommand As String = $\"username='${uname}',";
Debug.ShouldStop(16384);
_sccommand = (RemoteObject.concat(RemoteObject.createImmutable("username='"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable("', password='"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_upass))),RemoteObject.createImmutable("'")));Debug.locals.put("sccommand", _sccommand);Debug.locals.put("sccommand", _sccommand);
 BA.debugLineNum = 2064;BA.debugLine="Log(sccommand)";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6111935503",_sccommand,0);
 BA.debugLineNum = 2066;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(131072);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 2067;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(262144);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 2068;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
Debug.ShouldStop(524288);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2069;BA.debugLine="Log(data)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6111935508",_data,0);
 BA.debugLineNum = 2071;BA.debugLine="Return data";
Debug.ShouldStop(4194304);
if (true) return _data;
 BA.debugLineNum = 2072;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete_srv_files() throws Exception{
try {
		Debug.PushSubsStack("Delete_srv_Files (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,379);
if (RapidSub.canDelegate("delete_srv_files")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","delete_srv_files");}
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 379;BA.debugLine="Sub Delete_srv_Files";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="For Each FileName As String In File.ListFiles(Sta";
Debug.ShouldStop(134217728);
{
final RemoteObject group1 = main.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(main.mostCurrent._starter._internalfolder /*RemoteObject*/ ));
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_filename = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("FileName", _filename);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 381;BA.debugLine="If FileName.EndsWith(\".reqsvr\") Or FileName.Ends";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".reqsvr")))) || RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".objsvr"))))) { 
 BA.debugLineNum = 382;BA.debugLine="File.Delete(Starter.InternalFolder, FileName)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));
 };
 }
}Debug.locals.put("FileName", _filename);
;
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _deleteandcopydatabase() throws Exception{
try {
		Debug.PushSubsStack("DeleteAndCopyDatabase (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2653);
if (RapidSub.canDelegate("deleteandcopydatabase")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","deleteandcopydatabase"); return;}
ResumableSub_DeleteAndCopyDatabase rsub = new ResumableSub_DeleteAndCopyDatabase(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DeleteAndCopyDatabase extends BA.ResumableSub {
public ResumableSub_DeleteAndCopyDatabase(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteAndCopyDatabase (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2653);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 2655;BA.debugLine="Starter.LocalSQLEVC.Close";
Debug.ShouldStop(1073741824);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 2656;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolutionch";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2657;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionchec";
Debug.ShouldStop(1);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2659;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "deleteandcopydatabase"),BA.numberCast(int.class, 250));
this.state = 15;
return;
case 15:
//C
this.state = 5;
;
 BA.debugLineNum = 2661;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evoluti";
Debug.ShouldStop(16);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3"))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2662;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\",";
Debug.ShouldStop(32);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 2664;BA.debugLine="Sleep(250)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "deleteandcopydatabase"),BA.numberCast(int.class, 250));
this.state = 16;
return;
case 16:
//C
this.state = 9;
;
 BA.debugLineNum = 2666;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then St";
Debug.ShouldStop(512);
if (true) break;

case 9:
//if
this.state = 14;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("evolutioncheck.db3")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 2667;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "deleteandcopydatabase"),BA.numberCast(int.class, 100));
this.state = 17;
return;
case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 2668;BA.debugLine="End Sub";
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
public static RemoteObject  _deletelocaldatabase(RemoteObject _remove) throws Exception{
try {
		Debug.PushSubsStack("DeleteLocalDatabase (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1032);
if (RapidSub.canDelegate("deletelocaldatabase")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","deletelocaldatabase", _remove);}
Debug.locals.put("remove", _remove);
 BA.debugLineNum = 1032;BA.debugLine="Sub DeleteLocalDatabase(remove As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 1034;BA.debugLine="If(remove = 1) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",_remove,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1036;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, \"o";
Debug.ShouldStop(2048);
if ((main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("orion.db")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1037;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, \"ori";
Debug.ShouldStop(4096);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("orion.db")));
 };
 BA.debugLineNum = 1040;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, \"e";
Debug.ShouldStop(32768);
if ((main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1041;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, \"evo";
Debug.ShouldStop(65536);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("evolutioncheck.db3")));
 };
 BA.debugLineNum = 1044;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, \"w";
Debug.ShouldStop(524288);
if ((main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("worker.db")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1045;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, \"wor";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("worker.db")));
 };
 };
 BA.debugLineNum = 1050;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadapk(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DownloadAPK (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1075);
if (RapidSub.canDelegate("downloadapk")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","downloadapk", _filename);}
ResumableSub_DownloadAPK rsub = new ResumableSub_DownloadAPK(null,_filename);
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
public static class ResumableSub_DownloadAPK extends BA.ResumableSub {
public ResumableSub_DownloadAPK(xevolution.vrcg.devdemov2400.main parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _filename;
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadAPK (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1075);
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
 BA.debugLineNum = 1077;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1048576);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1078;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 1079;BA.debugLine="Wait For (CheckInstallationRequirements) Complete";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadapk"), _checkinstallationrequirements());
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1081;BA.debugLine="If Result Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 8;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1082;BA.debugLine="ProgressDialogShow(ShareCode.AvisoDownloadAPK)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisodownloadapk /*RemoteObject*/ )));
 BA.debugLineNum = 1083;BA.debugLine="Job.Download($\"${Consts.AppWebSiteLink}/deliver/";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_download" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._consts._appwebsitelink /*RemoteObject*/ ))),RemoteObject.createImmutable("/deliver/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1085;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadapk"), (_job));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1086;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1088;BA.debugLine="Dim out As  OutputStream";
Debug.ShouldStop(-2147483648);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 1089;BA.debugLine="out = File.OpenOutput(Starter.Provider.SharedFo";
Debug.ShouldStop(1);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 1090;BA.debugLine="File.Copy2(Job.GetInputStream,out)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 1091;BA.debugLine="out.Close";
Debug.ShouldStop(4);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 1093;BA.debugLine="Job.Release";
Debug.ShouldStop(16);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1094;BA.debugLine="SendInstallIntent(Filename)";
Debug.ShouldStop(32);
_sendinstallintent(_filename);
 BA.debugLineNum = 1095;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1096;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1099;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1102;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6109772827",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1103;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 1104;BA.debugLine="Job.Release";
Debug.ShouldStop(32768);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1105;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 1107;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _downloadevolutioncheckdbwithftp(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DownloadEvolutionCheckDbWithFTP (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1052);
if (RapidSub.canDelegate("downloadevolutioncheckdbwithftp")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","downloadevolutioncheckdbwithftp", _filename);}
ResumableSub_DownloadEvolutionCheckDbWithFTP rsub = new ResumableSub_DownloadEvolutionCheckDbWithFTP(null,_filename);
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
public static class ResumableSub_DownloadEvolutionCheckDbWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadEvolutionCheckDbWithFTP(xevolution.vrcg.devdemov2400.main parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _filename;
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadEvolutionCheckDbWithFTP (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1052);
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
 BA.debugLineNum = 1053;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(268435456);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 1054;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(536870912);
_myftp.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1055;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(1073741824);
_myftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1059;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(4);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1060;BA.debugLine="Log(filename)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6109707272",_filename,0);
 BA.debugLineNum = 1061;BA.debugLine="Dim sf As Object = Starter.GlobalFTP.DownloadFile";
Debug.ShouldStop(16);
_sf = parent.mostCurrent._starter._globalftp /*RemoteObject*/ .runMethod(false,"DownloadFile",main.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1062;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath A";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadevolutioncheckdbwithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1064;BA.debugLine="If Success Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 1065;BA.debugLine="Log(filename & \" file was download successfully\"";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6109707277",RemoteObject.concat(_filename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 1066;BA.debugLine="myFTP.Close";
Debug.ShouldStop(512);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 1067;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1069;BA.debugLine="myFTP.Close";
Debug.ShouldStop(4096);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 1070;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 1071;BA.debugLine="Log(\"Error downloading file \" & filename)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6109707283",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filename),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1073;BA.debugLine="End Sub";
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
public static void  _ftp_downloadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static void  _downloadfilestodocsfolder(RemoteObject _globalftp) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesToDocsFolder (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2920);
if (RapidSub.canDelegate("downloadfilestodocsfolder")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","downloadfilestodocsfolder", _globalftp); return;}
ResumableSub_DownloadFilesToDocsFolder rsub = new ResumableSub_DownloadFilesToDocsFolder(null,_globalftp);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadFilesToDocsFolder extends BA.ResumableSub {
public ResumableSub_DownloadFilesToDocsFolder(xevolution.vrcg.devdemov2400.main parent,RemoteObject _globalftp) {
this.parent = parent;
this._globalftp = _globalftp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _globalftp;
RemoteObject _ftpdocslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totaldocs = RemoteObject.createImmutable(0);
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _lmdate = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _fname = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
int step14;
int limit14;
int step30;
int limit30;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesToDocsFolder (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2920);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2924;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUpd";
Debug.ShouldStop(2048);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 2925;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508357",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2926;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APPL_HOST}/${Share";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508358",(RemoteObject.concat(RemoteObject.createImmutable(" 		INITIAL : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 2927;BA.debugLine="Log(\"/docs/\")";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508359",RemoteObject.createImmutable("/docs/"),0);
 BA.debugLineNum = 2928;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508360",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2930;BA.debugLine="Dim FTPDOCSLIST As List";
Debug.ShouldStop(131072);
_ftpdocslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPDOCSLIST", _ftpdocslist);
 BA.debugLineNum = 2931;BA.debugLine="Dim TotalDocs As Int = 0";
Debug.ShouldStop(262144);
_totaldocs = BA.numberCast(int.class, 0);Debug.locals.put("TotalDocs", _totaldocs);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 2933;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
Debug.ShouldStop(1048576);
_sfl = _globalftp.runMethod(false,"List",main.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 2936;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadfilestodocsfolder"), _sfl);
this.state = 46;
return;
case 46:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 2937;BA.debugLine="If Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 2943;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1) '";
Debug.ShouldStop(1073741824);
_lmdate = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("LMDate", _lmdate);Debug.locals.put("LMDate", _lmdate);
 BA.debugLineNum = 2945;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 2946;BA.debugLine="FTPDOCSLIST.Initialize";
Debug.ShouldStop(2);
_ftpdocslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2947;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(4);
if (true) break;

case 7:
//for
this.state = 18;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 18;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 9;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2948;BA.debugLine="Dim fName As String = files(i).Name";
Debug.ShouldStop(8);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 2949;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
Debug.ShouldStop(16);
if (true) break;

case 10:
//if
this.state = 17;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx"))))) || RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)((_fname.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT")))))))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2953;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 2954;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
Debug.ShouldStop(512);
_ftpdocslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 BA.debugLineNum = 2955;BA.debugLine="Log(files(i).Name)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508387",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 48;
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
 BA.debugLineNum = 2961;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallCompleteP";
Debug.ShouldStop(65536);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("FirstIntallCompleteProcedure")),(Object)(RemoteObject.createImmutable("error getting files list from /docs/")));
 if (true) break;
;
 BA.debugLineNum = 2964;BA.debugLine="If (FTPDOCSLIST.IsInitialized) Then";
Debug.ShouldStop(524288);

case 22:
//if
this.state = 45;
if ((_ftpdocslist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2965;BA.debugLine="If (FTPDOCSLIST.Size>=1) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 25:
//if
this.state = 44;
if ((RemoteObject.solveBoolean("g",_ftpdocslist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2966;BA.debugLine="TotalDocs = FTPDOCSLIST.Size-1";
Debug.ShouldStop(2097152);
_totaldocs = RemoteObject.solve(new RemoteObject[] {_ftpdocslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 2967;BA.debugLine="For i=0 To FTPDOCSLIST.Size-1";
Debug.ShouldStop(4194304);
if (true) break;

case 28:
//for
this.state = 43;
step30 = 1;
limit30 = RemoteObject.solve(new RemoteObject[] {_ftpdocslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 49;
if (true) break;

case 49:
//C
this.state = 43;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 30;
if (true) break;

case 50:
//C
this.state = 49;
_i = ((int)(0 + _i + step30)) ;
Debug.locals.put("i", _i);
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2968;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
Debug.ShouldStop(8388608);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/docs/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaldocs))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2969;BA.debugLine="Dim fName As String = FTPDOCSLIST.Get(i)";
Debug.ShouldStop(16777216);
_fname = BA.ObjectToString(_ftpdocslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 2970;BA.debugLine="Log(fName)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508402",_fname,0);
 BA.debugLineNum = 2971;BA.debugLine="Try";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 2972;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(134217728);
_sf = _globalftp.runMethod(false,"DownloadFile",main.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2973;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadfilestodocsfolder"), _sf);
this.state = 51;
return;
case 51:
//C
this.state = 34;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2975;BA.debugLine="If Success Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 2976;BA.debugLine="Log(\"/docs/ : file was download successfully";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508408",RemoteObject.createImmutable("/docs/ : file was download successfully"),0);
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 2979;BA.debugLine="Log(\"/docs/ : Error downloading file\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508411",RemoteObject.createImmutable("/docs/ : Error downloading file"),0);
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
 BA.debugLineNum = 2983;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113508415",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2984;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 42:
//C
this.state = 50;
this.catchState = 0;
;
 BA.debugLineNum = 2986;BA.debugLine="UpdateProgressBar(TotalDocs,i)";
Debug.ShouldStop(512);
_updateprogressbar(BA.numberCast(long.class, _totaldocs),BA.numberCast(long.class, _i));
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
Debug.locals.put("i", _i);
;
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = -1;
;
 BA.debugLineNum = 2992;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static void  _downloadfilestointernofolder(RemoteObject _globalftp) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesToInternoFolder (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2994);
if (RapidSub.canDelegate("downloadfilestointernofolder")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","downloadfilestointernofolder", _globalftp); return;}
ResumableSub_DownloadFilesToInternoFolder rsub = new ResumableSub_DownloadFilesToInternoFolder(null,_globalftp);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadFilesToInternoFolder extends BA.ResumableSub {
public ResumableSub_DownloadFilesToInternoFolder(xevolution.vrcg.devdemov2400.main parent,RemoteObject _globalftp) {
this.parent = parent;
this._globalftp = _globalftp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _globalftp;
RemoteObject _ftpinternolist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totaltemplates = RemoteObject.createImmutable(0);
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _fname2 = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
int step13;
int limit13;
int step24;
int limit24;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesToInternoFolder (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2994);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2998;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113573892",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2999;BA.debugLine="Log(\"/interno\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113573893",RemoteObject.createImmutable("/interno"),0);
 BA.debugLineNum = 3000;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113573894",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 3001;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(16777216);
_updateprogressbar(BA.numberCast(long.class, 100),BA.numberCast(long.class, 0));
 BA.debugLineNum = 3002;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUpd";
Debug.ShouldStop(33554432);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 3003;BA.debugLine="Dim FTPINTERNOLIST As List";
Debug.ShouldStop(67108864);
_ftpinternolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPINTERNOLIST", _ftpinternolist);
 BA.debugLineNum = 3004;BA.debugLine="Dim TotalTemplates As Int = 0";
Debug.ShouldStop(134217728);
_totaltemplates = BA.numberCast(int.class, 0);Debug.locals.put("TotalTemplates", _totaltemplates);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 3006;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/interno/\")";
Debug.ShouldStop(536870912);
_sfl = _globalftp.runMethod(false,"List",main.processBA,(Object)(RemoteObject.createImmutable("/interno/")));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 3007;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadfilestointernofolder"), _sfl);
this.state = 38;
return;
case 38:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 3008;BA.debugLine="If Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 14;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3010;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(2);
if (true) break;

case 4:
//if
this.state = 11;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3011;BA.debugLine="FTPINTERNOLIST.Initialize";
Debug.ShouldStop(4);
_ftpinternolist.runVoidMethod ("Initialize");
 BA.debugLineNum = 3012;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(8);
if (true) break;

case 7:
//for
this.state = 10;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 10;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 9;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 40;
 BA.debugLineNum = 3013;BA.debugLine="Dim fName2 As String = files(i).Name";
Debug.ShouldStop(16);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 3014;BA.debugLine="FTPINTERNOLIST.Add(files(i).Name)";
Debug.ShouldStop(32);
_ftpinternolist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 3018;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallCompleteP";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("FirstIntallCompleteProcedure")),(Object)(RemoteObject.createImmutable("error getting files list from /interno/")));
 if (true) break;
;
 BA.debugLineNum = 3021;BA.debugLine="If (FTPINTERNOLIST.IsInitialized) Then";
Debug.ShouldStop(4096);

case 14:
//if
this.state = 37;
if ((_ftpinternolist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 3022;BA.debugLine="If (FTPINTERNOLIST.Size>=1) Then";
Debug.ShouldStop(8192);
if (true) break;

case 17:
//if
this.state = 36;
if ((RemoteObject.solveBoolean("g",_ftpinternolist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 3023;BA.debugLine="TotalTemplates = FTPINTERNOLIST.Size-1";
Debug.ShouldStop(16384);
_totaltemplates = RemoteObject.solve(new RemoteObject[] {_ftpinternolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 3024;BA.debugLine="For i=0 To FTPINTERNOLIST.Size-1";
Debug.ShouldStop(32768);
if (true) break;

case 20:
//for
this.state = 35;
step24 = 1;
limit24 = RemoteObject.solve(new RemoteObject[] {_ftpinternolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 35;
if ((step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24)) this.state = 22;
if (true) break;

case 42:
//C
this.state = 41;
_i = ((int)(0 + _i + step24)) ;
Debug.locals.put("i", _i);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 3025;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
Debug.ShouldStop(65536);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/interno/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaltemplates))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 3026;BA.debugLine="Dim fName2 As String = FTPINTERNOLIST.Get(i)";
Debug.ShouldStop(131072);
_fname2 = BA.ObjectToString(_ftpinternolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 3027;BA.debugLine="Log(fName2)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113573921",_fname2,0);
 BA.debugLineNum = 3028;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 23:
//try
this.state = 34;
this.catchState = 33;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 33;
 BA.debugLineNum = 3029;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/i";
Debug.ShouldStop(1048576);
_sf = _globalftp.runMethod(false,"DownloadFile",main.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/interno/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3030;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadfilestointernofolder"), _sf);
this.state = 43;
return;
case 43:
//C
this.state = 26;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3032;BA.debugLine="If Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 26:
//if
this.state = 31;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 3033;BA.debugLine="Log(\"/interno/ : file was download successfu";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113573927",RemoteObject.createImmutable("/interno/ : file was download successfully"),0);
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 3036;BA.debugLine="Log(\"/interno/ : Error downloading file\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113573930",RemoteObject.createImmutable("/interno/ : Error downloading file"),0);
 if (true) break;

case 31:
//C
this.state = 34;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
 BA.debugLineNum = 3040;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113573934",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3041;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 34:
//C
this.state = 42;
this.catchState = 0;
;
 BA.debugLineNum = 3043;BA.debugLine="UpdateProgressBar(TotalTemplates,i)";
Debug.ShouldStop(4);
_updateprogressbar(BA.numberCast(long.class, _totaltemplates),BA.numberCast(long.class, _i));
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
Debug.locals.put("i", _i);
;
 if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
 BA.debugLineNum = 3048;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static void  _downloadfilestotemplatesfolder(RemoteObject _globalftp) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesToTemplatesFolder (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2851);
if (RapidSub.canDelegate("downloadfilestotemplatesfolder")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","downloadfilestotemplatesfolder", _globalftp); return;}
ResumableSub_DownloadFilesToTemplatesFolder rsub = new ResumableSub_DownloadFilesToTemplatesFolder(null,_globalftp);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadFilesToTemplatesFolder extends BA.ResumableSub {
public ResumableSub_DownloadFilesToTemplatesFolder(xevolution.vrcg.devdemov2400.main parent,RemoteObject _globalftp) {
this.parent = parent;
this._globalftp = _globalftp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _globalftp;
RemoteObject _ftptemplateslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totaltemplates = RemoteObject.createImmutable(0);
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _fname2 = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
int step13;
int limit13;
int step26;
int limit26;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesToTemplatesFolder (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2851);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2855;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113442820",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2856;BA.debugLine="Log(\"/docs/templates\")";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113442821",RemoteObject.createImmutable("/docs/templates"),0);
 BA.debugLineNum = 2857;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113442822",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2858;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(512);
_updateprogressbar(BA.numberCast(long.class, 100),BA.numberCast(long.class, 0));
 BA.debugLineNum = 2859;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUpd";
Debug.ShouldStop(1024);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 2860;BA.debugLine="Dim FTPTEMPLATESLIST As List";
Debug.ShouldStop(2048);
_ftptemplateslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPTEMPLATESLIST", _ftptemplateslist);
 BA.debugLineNum = 2861;BA.debugLine="Dim TotalTemplates As Int = 0";
Debug.ShouldStop(4096);
_totaltemplates = BA.numberCast(int.class, 0);Debug.locals.put("TotalTemplates", _totaltemplates);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 2863;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
Debug.ShouldStop(16384);
_sfl = _globalftp.runMethod(false,"List",main.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 2866;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadfilestotemplatesfolder"), _sfl);
this.state = 42;
return;
case 42:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 2867;BA.debugLine="If Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 18;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2874;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 15;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2875;BA.debugLine="FTPTEMPLATESLIST.Initialize";
Debug.ShouldStop(67108864);
_ftptemplateslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2876;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(134217728);
if (true) break;

case 7:
//for
this.state = 14;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 43;
if (true) break;

case 43:
//C
this.state = 14;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 9;
if (true) break;

case 44:
//C
this.state = 43;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2877;BA.debugLine="Dim fName2 As String = files(i).Name";
Debug.ShouldStop(268435456);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2878;BA.debugLine="If (fName2.EndsWith(\".png\")) Or (fName2.EndsWi";
Debug.ShouldStop(536870912);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".html"))))) || RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)((_fname2.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT"))))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("dictionary")))))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2883;BA.debugLine="FTPTEMPLATESLIST.Add(files(i).Name)";
Debug.ShouldStop(4);
_ftptemplateslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;

case 13:
//C
this.state = 44;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
Debug.locals.put("i", _i);
;
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2888;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallCompleteP";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("FirstIntallCompleteProcedure")),(Object)(RemoteObject.createImmutable("error getting files list from /docs/templates/")));
 if (true) break;
;
 BA.debugLineNum = 2891;BA.debugLine="If (FTPTEMPLATESLIST.IsInitialized) Then";
Debug.ShouldStop(1024);

case 18:
//if
this.state = 41;
if ((_ftptemplateslist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2892;BA.debugLine="If (FTPTEMPLATESLIST.Size>=1) Then";
Debug.ShouldStop(2048);
if (true) break;

case 21:
//if
this.state = 40;
if ((RemoteObject.solveBoolean("g",_ftptemplateslist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2893;BA.debugLine="TotalTemplates = FTPTEMPLATESLIST.Size-1";
Debug.ShouldStop(4096);
_totaltemplates = RemoteObject.solve(new RemoteObject[] {_ftptemplateslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 2894;BA.debugLine="For i=0 To FTPTEMPLATESLIST.Size-1";
Debug.ShouldStop(8192);
if (true) break;

case 24:
//for
this.state = 39;
step26 = 1;
limit26 = RemoteObject.solve(new RemoteObject[] {_ftptemplateslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 45;
if (true) break;

case 45:
//C
this.state = 39;
if ((step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26)) this.state = 26;
if (true) break;

case 46:
//C
this.state = 45;
_i = ((int)(0 + _i + step26)) ;
Debug.locals.put("i", _i);
if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2895;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
Debug.ShouldStop(16384);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/docs/templates/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaltemplates))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2896;BA.debugLine="Dim fName2 As String = FTPTEMPLATESLIST.Get(i)";
Debug.ShouldStop(32768);
_fname2 = BA.ObjectToString(_ftptemplateslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2897;BA.debugLine="Log(fName2)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113442862",_fname2,0);
 BA.debugLineNum = 2898;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 27:
//try
this.state = 38;
this.catchState = 37;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 37;
 BA.debugLineNum = 2899;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(262144);
_sf = _globalftp.runMethod(false,"DownloadFile",main.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2900;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadfilestotemplatesfolder"), _sf);
this.state = 47;
return;
case 47:
//C
this.state = 30;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2902;BA.debugLine="If Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 30:
//if
this.state = 35;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 32;
}else {
this.state = 34;
}if (true) break;

case 32:
//C
this.state = 35;
 BA.debugLineNum = 2903;BA.debugLine="Log(\"/docs/templates/ : file was download su";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113442868",RemoteObject.createImmutable("/docs/templates/ : file was download successfully"),0);
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 2906;BA.debugLine="Log(\"/docs/templates/ : Error downloading fi";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113442871",RemoteObject.createImmutable("/docs/templates/ : Error downloading file"),0);
 if (true) break;

case 35:
//C
this.state = 38;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
 BA.debugLineNum = 2910;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113442875",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2911;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 38:
//C
this.state = 46;
this.catchState = 0;
;
 BA.debugLineNum = 2913;BA.debugLine="UpdateProgressBar(TotalTemplates,i)";
Debug.ShouldStop(1);
_updateprogressbar(BA.numberCast(long.class, _totaltemplates),BA.numberCast(long.class, _i));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
Debug.locals.put("i", _i);
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
 BA.debugLineNum = 2918;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static RemoteObject  _downloadsqlfiles(RemoteObject _sqlfilestotal,RemoteObject _firstinstallfilesname) throws Exception{
try {
		Debug.PushSubsStack("DownloadSQLFiles (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2760);
if (RapidSub.canDelegate("downloadsqlfiles")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","downloadsqlfiles", _sqlfilestotal, _firstinstallfilesname);}
ResumableSub_DownloadSQLFiles rsub = new ResumableSub_DownloadSQLFiles(null,_sqlfilestotal,_firstinstallfilesname);
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
public static class ResumableSub_DownloadSQLFiles extends BA.ResumableSub {
public ResumableSub_DownloadSQLFiles(xevolution.vrcg.devdemov2400.main parent,RemoteObject _sqlfilestotal,RemoteObject _firstinstallfilesname) {
this.parent = parent;
this._sqlfilestotal = _sqlfilestotal;
this._firstinstallfilesname = _firstinstallfilesname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _sqlfilestotal;
RemoteObject _firstinstallfilesname;
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _msgfatal = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
int step5;
int limit5;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadSQLFiles (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2760);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
Debug.locals.put("firstInstallFilesName", _firstinstallfilesname);
 BA.debugLineNum = 2761;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(256);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2762;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(512);
_globalftp.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2763;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(1024);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2764;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(2048);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2766;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//for
this.state = 22;
step5 = 1;
limit5 = _sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 22;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 3;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2767;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUp";
Debug.ShouldStop(16384);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2768;BA.debugLine="Dim fileN As String = $\"${firstInstallFilesName}";
Debug.ShouldStop(32768);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_firstinstallfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 2770;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, fi";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2771;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, file";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 2776;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(8388608);
_sf = _globalftp.runMethod(false,"DownloadFile",main.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filen)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2777;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadsqlfiles"), _sf);
this.state = 25;
return;
case 25:
//C
this.state = 8;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2779;BA.debugLine="If Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 8:
//if
this.state = 21;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 21;
 BA.debugLineNum = 2780;BA.debugLine="Log(fileN & \" file was download successfully\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113311764",RemoteObject.concat(_filen,RemoteObject.createImmutable(" file was download successfully")),0);
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2782;BA.debugLine="Log(\"Error downloading file \" & fileN)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113311766",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filen),0);
 BA.debugLineNum = 2784;BA.debugLine="Dim MsgFatal As String = $\"Ocorreu um Erro ao d";
Debug.ShouldStop(-2147483648);
_msgfatal = (RemoteObject.concat(RemoteObject.createImmutable("Ocorreu um Erro ao descarregar um dos ficheiros mestres."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Ficheiro FIRSTINTALL"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".SQL"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("A aplicação vai terminar !"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Por favor verifique o acesso à internet e reinstale a aplicação, depois de desinstalar a actual !")));Debug.locals.put("MsgFatal", _msgfatal);Debug.locals.put("MsgFatal", _msgfatal);
 BA.debugLineNum = 2785;BA.debugLine="Msgbox2Async(MsgFatal, ShareCode.GeneralAlertTi";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_msgfatal)),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2787;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_inst";
Debug.ShouldStop(4);
if (true) break;

case 13:
//if
this.state = 16;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log")))).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2788;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_instal";
Debug.ShouldStop(8);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))));
 BA.debugLineNum = 2789;BA.debugLine="ShareCode.Installed_Date = \"\"";
Debug.ShouldStop(16);
parent.mostCurrent._sharecode._installed_date /*RemoteObject*/  = BA.ObjectToString("");
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 2792;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadsqlfiles"), null);
this.state = 26;
return;
case 26:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2794;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(512);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2795;BA.debugLine="ExitApplication";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 24;
;
 BA.debugLineNum = 2800;BA.debugLine="UpdateProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(32768);
_updateprogressbar(BA.numberCast(long.class, _sqlfilestotal),BA.numberCast(long.class, _i));
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2803;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(262144);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2805;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.mostCurrent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 2806;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static void  _filefoldertest() throws Exception{
try {
		Debug.PushSubsStack("FileFolderTest (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1167);
if (RapidSub.canDelegate("filefoldertest")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","filefoldertest"); return;}
ResumableSub_FileFolderTest rsub = new ResumableSub_FileFolderTest(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FileFolderTest extends BA.ResumableSub {
public ResumableSub_FileFolderTest(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
RemoteObject _permissionsgoodflag = RemoteObject.createImmutable(false);
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _yaeornay = RemoteObject.createImmutable(false);
RemoteObject _provider = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.fileprovider");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FileFolderTest (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1167);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1169;BA.debugLine="Private rp As RuntimePermissions";
Debug.ShouldStop(65536);
_rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rp", _rp);
 BA.debugLineNum = 1170;BA.debugLine="Dim PermissionsGoodFlag As Boolean = True";
Debug.ShouldStop(131072);
_permissionsgoodflag = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("PermissionsGoodFlag", _permissionsgoodflag);Debug.locals.put("PermissionsGoodFlag", _permissionsgoodflag);
 BA.debugLineNum = 1172;BA.debugLine="If PermissionsGoodFlag Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 8;
if (_permissionsgoodflag.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1173;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_S";
Debug.ShouldStop(1048576);
_rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(_rp.getField(true,"PERMISSION_READ_EXTERNAL_STORAGE")));
 BA.debugLineNum = 1174;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "filefoldertest"), null);
this.state = 16;
return;
case 16:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_yaeornay = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("YaeOrNay", _yaeornay);
;
 BA.debugLineNum = 1175;BA.debugLine="If YaeOrNay = False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_yaeornay,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1176;BA.debugLine="PermissionsGoodFlag = False";
Debug.ShouldStop(8388608);
_permissionsgoodflag = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("PermissionsGoodFlag", _permissionsgoodflag);
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;
;
 BA.debugLineNum = 1180;BA.debugLine="If PermissionsGoodFlag Then";
Debug.ShouldStop(134217728);

case 8:
//if
this.state = 15;
if (_permissionsgoodflag.<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1181;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_WRITE_EXTERNAL_";
Debug.ShouldStop(268435456);
_rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(_rp.getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 1182;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "filefoldertest"), null);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_yaeornay = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("YaeOrNay", _yaeornay);
;
 BA.debugLineNum = 1183;BA.debugLine="If YaeOrNay = False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_yaeornay,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1184;BA.debugLine="PermissionsGoodFlag = False";
Debug.ShouldStop(-2147483648);
_permissionsgoodflag = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("PermissionsGoodFlag", _permissionsgoodflag);
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 1188;BA.debugLine="Log(\"PermissionsGoodFlag = \" & PermissionsGoodFla";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6110100501",RemoteObject.concat(RemoteObject.createImmutable("PermissionsGoodFlag = "),_permissionsgoodflag),0);
 BA.debugLineNum = 1190;BA.debugLine="Private Provider As FileProvider";
Debug.ShouldStop(32);
_provider = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.fileprovider");Debug.locals.put("Provider", _provider);
 BA.debugLineNum = 1191;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(64);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 1192;BA.debugLine="Provider.GetApkFileUri()";
Debug.ShouldStop(128);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getapkfileuri" /*RemoteObject*/ );
 BA.debugLineNum = 1194;BA.debugLine="End Sub";
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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _yaeornay) throws Exception{
}
public static void  _first_ftp_downloadprogress(RemoteObject _serverpath,RemoteObject _totaldownloaded,RemoteObject _total) throws Exception{
try {
		Debug.PushSubsStack("FIRST_FTP_DownloadProgress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2629);
if (RapidSub.canDelegate("first_ftp_downloadprogress")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","first_ftp_downloadprogress", _serverpath, _totaldownloaded, _total); return;}
ResumableSub_FIRST_FTP_DownloadProgress rsub = new ResumableSub_FIRST_FTP_DownloadProgress(null,_serverpath,_totaldownloaded,_total);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FIRST_FTP_DownloadProgress extends BA.ResumableSub {
public ResumableSub_FIRST_FTP_DownloadProgress(xevolution.vrcg.devdemov2400.main parent,RemoteObject _serverpath,RemoteObject _totaldownloaded,RemoteObject _total) {
this.parent = parent;
this._serverpath = _serverpath;
this._totaldownloaded = _totaldownloaded;
this._total = _total;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _serverpath;
RemoteObject _totaldownloaded;
RemoteObject _total;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FIRST_FTP_DownloadProgress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2629);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("ServerPath", _serverpath);
Debug.locals.put("TotalDownloaded", _totaldownloaded);
Debug.locals.put("Total", _total);
 BA.debugLineNum = 2630;BA.debugLine="UpdateProgressBar(DB_Size,TotalDownloaded)";
Debug.ShouldStop(32);
_updateprogressbar(parent._db_size,_totaldownloaded);
 BA.debugLineNum = 2631;BA.debugLine="Sleep(50)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "first_ftp_downloadprogress"),BA.numberCast(int.class, 50));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 2632;BA.debugLine="End Sub";
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
public static RemoteObject  _firstinstallcompleteprocedure() throws Exception{
try {
		Debug.PushSubsStack("FirstInstallCompleteProcedure (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,3062);
if (RapidSub.canDelegate("firstinstallcompleteprocedure")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","firstinstallcompleteprocedure");}
ResumableSub_FirstInstallCompleteProcedure rsub = new ResumableSub_FirstInstallCompleteProcedure(null);
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
public static class ResumableSub_FirstInstallCompleteProcedure extends BA.ResumableSub {
public ResumableSub_FirstInstallCompleteProcedure(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _exceptionerror = RemoteObject.createImmutable("");
RemoteObject _first_install_info = RemoteObject.createImmutable("");
RemoteObject _firstinstallfilesname = RemoteObject.createImmutable("");
RemoteObject _sqlfilestotal = RemoteObject.createImmutable(0);
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _dotry = RemoteObject.createImmutable(false);
RemoteObject _trycount = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _testejson = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _resultobj = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FirstInstallCompleteProcedure (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,3062);
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
 BA.debugLineNum = 3068;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(134217728);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 3069;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 3070;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 3071;BA.debugLine="StopService(BackgroundUpdateService)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 3073;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(1);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3074;BA.debugLine="LabelTarefa.Visible = False";
Debug.ShouldStop(2);
parent.mostCurrent._labeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3076;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(8);
_updateprogressbar(BA.numberCast(long.class, 100),BA.numberCast(long.class, 0));
 BA.debugLineNum = 3077;BA.debugLine="UpdateProgressBar2(100,0)";
Debug.ShouldStop(16);
_updateprogressbar2(BA.numberCast(long.class, 100),BA.numberCast(long.class, 0));
 BA.debugLineNum = 3079;BA.debugLine="Private ExceptionError As String = \"\"";
Debug.ShouldStop(64);
_exceptionerror = BA.ObjectToString("");Debug.locals.put("ExceptionError", _exceptionerror);Debug.locals.put("ExceptionError", _exceptionerror);
 BA.debugLineNum = 3088;BA.debugLine="PanelDownloadInicial.Visible = True";
Debug.ShouldStop(32768);
parent.mostCurrent._paneldownloadinicial.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3091;BA.debugLine="ShareCode.AwakeDevice(True)";
Debug.ShouldStop(262144);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 3093;BA.debugLine="SetFTPUser";
Debug.ShouldStop(1048576);
_setftpuser();
 BA.debugLineNum = 3095;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//try
this.state = 45;
this.catchState = 44;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 44;
 BA.debugLineNum = 3096;BA.debugLine="LabelDownloadInicialTitle.Text = ShareCode.MsgUp";
Debug.ShouldStop(8388608);
parent.mostCurrent._labeldownloadinicialtitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlepasso1primeirainstalacao /*RemoteObject*/ ));
 BA.debugLineNum = 3098;BA.debugLine="Dim FIRST_INSTALL_INFO As String = \"FIRSTINSTALL";
Debug.ShouldStop(33554432);
_first_install_info = BA.ObjectToString("FIRSTINSTALL.INFO");Debug.locals.put("FIRST_INSTALL_INFO", _first_install_info);Debug.locals.put("FIRST_INSTALL_INFO", _first_install_info);
 BA.debugLineNum = 3099;BA.debugLine="Dim firstInstallFilesName As String = \"FIRSTINST";
Debug.ShouldStop(67108864);
_firstinstallfilesname = BA.ObjectToString("FIRSTINSTALL");Debug.locals.put("firstInstallFilesName", _firstinstallfilesname);Debug.locals.put("firstInstallFilesName", _firstinstallfilesname);
 BA.debugLineNum = 3101;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstInstallComplete";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("FirstInstallCompleteProc")),(Object)((RemoteObject.createImmutable("DOWNLOAD MESTRES"))));
 BA.debugLineNum = 3103;BA.debugLine="Check_FIRSTINSTALL_IN_PROGRESS";
Debug.ShouldStop(1073741824);
_check_firstinstall_in_progress();
 BA.debugLineNum = 3106;BA.debugLine="If File.Exists(Starter.Provider.SharedFolder, FI";
Debug.ShouldStop(2);
if (true) break;

case 4:
//if
this.state = 35;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info)).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 35;
 BA.debugLineNum = 3107;BA.debugLine="Log(\"FIRSTINSTALL JA EXISTE\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113705005",RemoteObject.createImmutable("FIRSTINSTALL JA EXISTE"),0);
 BA.debugLineNum = 3109;BA.debugLine="DeleteAndCopyDatabase";
Debug.ShouldStop(16);
_deleteandcopydatabase();
 BA.debugLineNum = 3110;BA.debugLine="SetInfo(FIRST_INSTALL_INFO)";
Debug.ShouldStop(32);
_setinfo(_first_install_info);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 3113;BA.debugLine="Log(\"FIRSTINSTALL NAO EXISTE\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113705011",RemoteObject.createImmutable("FIRSTINSTALL NAO EXISTE"),0);
 BA.debugLineNum = 3117;BA.debugLine="Dim SqlFilesTotal As Int = 0";
Debug.ShouldStop(4096);
_sqlfilestotal = BA.numberCast(int.class, 0);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 3118;BA.debugLine="Dim GlobalFTP As FTP = CreateGlobalFTP";
Debug.ShouldStop(8192);
_globalftp = _createglobalftp();Debug.locals.put("GlobalFTP", _globalftp);Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 3120;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(32768);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 3121;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(65536);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 3122;BA.debugLine="Do While (dotry And (trycount < 3))";
Debug.ShouldStop(131072);
if (true) break;

case 9:
//do while
this.state = 30;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 11;
if (true) break;
}
if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3124;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(524288);
_sf = _globalftp.runMethod(false,"DownloadFile",main.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_first_install_info)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3125;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "firstinstallcompleteprocedure"), _sf);
this.state = 46;
return;
case 46:
//C
this.state = 12;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3127;BA.debugLine="If Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 12:
//if
this.state = 29;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 28;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 3129;BA.debugLine="Try";
Debug.ShouldStop(16777216);
if (true) break;

case 15:
//try
this.state = 26;
this.catchState = 25;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 25;
 BA.debugLineNum = 3130;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.M";
Debug.ShouldStop(33554432);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*RemoteObject*/ ));
 BA.debugLineNum = 3131;BA.debugLine="Log(FIRST_INSTALL_INFO & \" file was download";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113705029",RemoteObject.concat(_first_install_info,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 3138;BA.debugLine="Dim TesteJson As String = File.readstring(St";
Debug.ShouldStop(2);
_testejson = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("TesteJson", _testejson);Debug.locals.put("TesteJson", _testejson);
 BA.debugLineNum = 3140;BA.debugLine="If ShareCode.newReturn = 1 Then";
Debug.ShouldStop(8);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 3141;BA.debugLine="SqlFilesTotal = Read_FIRST_INSTALL_INFO(FIR";
Debug.ShouldStop(16);
_sqlfilestotal = _read_first_install_info(_first_install_info,_testejson);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 3143;BA.debugLine="SqlFilesTotal = Read_FIRST_INSTALL_INFO_Lis";
Debug.ShouldStop(64);
_sqlfilestotal = _read_first_install_info_list(_first_install_info);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 if (true) break;

case 23:
//C
this.state = 26;
;
 BA.debugLineNum = 3146;BA.debugLine="dotry = False";
Debug.ShouldStop(512);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 3147;BA.debugLine="trycount = 3";
Debug.ShouldStop(1024);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 3148;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2048);
_globalftp.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 44;
 BA.debugLineNum = 3151;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113705049",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3152;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 3153;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(65536);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
this.catchState = 44;
;
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 3156;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113705054",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3157;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 3158;BA.debugLine="Log(\"Error downloading file :\" & FIRST_INSTAL";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113705056",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file :"),_first_install_info),0);
 BA.debugLineNum = 3159;BA.debugLine="Msgbox2Async($\"Sem informação de instalação n";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Sem informação de instalação no servidor."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Por favor desinstale a Aplicação"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("e contacte a assistencia antes de tentar de novo."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Obrigado"))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3160;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "firstinstallcompleteprocedure"), null);
this.state = 47;
return;
case 47:
//C
this.state = 29;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3161;BA.debugLine="ExceptionError = LastException";
Debug.ShouldStop(16777216);
_exceptionerror = BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA));Debug.locals.put("ExceptionError", _exceptionerror);
 BA.debugLineNum = 3162;BA.debugLine="trycount = 3";
Debug.ShouldStop(33554432);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 3163;BA.debugLine="ExitApplication";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 29:
//C
this.state = 9;
;
 BA.debugLineNum = 3165;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(268435456);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 3167;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(1073741824);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 3169;BA.debugLine="CheckIf_SqlFilesTotal_IsEqualToZero(SqlFilesTot";
Debug.ShouldStop(1);
_checkif_sqlfilestotal_isequaltozero(_sqlfilestotal);
 BA.debugLineNum = 3176;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(128);
if (true) break;

case 31:
//if
this.state = 34;
if ((RemoteObject.solveBoolean(">",_sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 3177;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
Debug.ShouldStop(256);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ));
 BA.debugLineNum = 3179;BA.debugLine="Wait For(DownloadSQLFiles(SqlFilesTotal, first";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "firstinstallcompleteprocedure"), _downloadsqlfiles(_sqlfilestotal,_firstinstallfilesname));
this.state = 48;
return;
case 48:
//C
this.state = 34;
_resultobj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("ResultObj", _resultobj);
;
 if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 3183;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(16384);
_updateprogressbar(BA.numberCast(long.class, 100),BA.numberCast(long.class, 0));
 BA.debugLineNum = 3184;BA.debugLine="Sleep(500)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "firstinstallcompleteprocedure"),BA.numberCast(int.class, 500));
this.state = 49;
return;
case 49:
//C
this.state = 35;
;
 if (true) break;
;
 BA.debugLineNum = 3191;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(4194304);

case 35:
//if
this.state = 38;
if ((RemoteObject.solveBoolean(">",_sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 3192;BA.debugLine="Wait For(ReadAndExecuteSQLFiles(SqlFilesTotal,";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "firstinstallcompleteprocedure"), _readandexecutesqlfiles(_sqlfilestotal,_firstinstallfilesname));
this.state = 50;
return;
case 50:
//C
this.state = 38;
_resultobj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("ResultObj", _resultobj);
;
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 3195;BA.debugLine="UpdateProgressBar2(100,0)";
Debug.ShouldStop(67108864);
_updateprogressbar2(BA.numberCast(long.class, 100),BA.numberCast(long.class, 0));
 BA.debugLineNum = 3196;BA.debugLine="ProgressoInicial2.visible = False";
Debug.ShouldStop(134217728);
parent.mostCurrent._progressoinicial2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3197;BA.debugLine="LabelTarefa.Visible = False";
Debug.ShouldStop(268435456);
parent.mostCurrent._labeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3198;BA.debugLine="UpdateProgressBar(100,0)";
Debug.ShouldStop(536870912);
_updateprogressbar(BA.numberCast(long.class, 100),BA.numberCast(long.class, 0));
 BA.debugLineNum = 3208;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTAL";
Debug.ShouldStop(128);
if (true) break;

case 39:
//if
this.state = 42;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FIRSTINSTALL_IN_PROGRESS"))).<Boolean>get().booleanValue()) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 3209;BA.debugLine="File.Delete(Starter.SharedFolder,\"FIRSTINSTALL_";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FIRSTINSTALL_IN_PROGRESS")));
 if (true) break;

case 42:
//C
this.state = 45;
;
 BA.debugLineNum = 3212;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(2048);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 3213;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(4096);
_globalftp.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 3214;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(8192);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3215;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(16384);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 3217;BA.debugLine="DownloadFilesToDocsFolder(GlobalFTP)";
Debug.ShouldStop(65536);
_downloadfilestodocsfolder(_globalftp);
 BA.debugLineNum = 3218;BA.debugLine="DownloadFilesToTemplatesFolder(GlobalFTP)";
Debug.ShouldStop(131072);
_downloadfilestotemplatesfolder(_globalftp);
 BA.debugLineNum = 3219;BA.debugLine="DownloadFilesToInternoFolder(GlobalFTP)";
Debug.ShouldStop(262144);
_downloadfilestointernofolder(_globalftp);
 BA.debugLineNum = 3221;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(1048576);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 3231;BA.debugLine="SetUserLanguage";
Debug.ShouldStop(1073741824);
_setuserlanguage();
 BA.debugLineNum = 3235;BA.debugLine="ShareCode.AwakeDevice(False)";
Debug.ShouldStop(4);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3237;BA.debugLine="Return True";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 BA.debugLineNum = 3243;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(1024);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 3244;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 3245;BA.debugLine="StartService(BackgroundUpdateService)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 3246;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(8192);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3247;BA.debugLine="Starter.FirstInstall = True";
Debug.ShouldStop(16384);
parent.mostCurrent._starter._firstinstall /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 3248;BA.debugLine="MsgboxAsync(LastException.Message, ShareCode.Gen";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).runMethod(true,"getMessage"))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 3249;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113705147",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3250;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 3253;BA.debugLine="ShareCode.AwakeDevice(False)";
Debug.ShouldStop(1048576);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3254;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 45:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 3256;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static void  _forceresetpassword(RemoteObject _reset,RemoteObject _uname) throws Exception{
try {
		Debug.PushSubsStack("ForceResetPassword (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1948);
if (RapidSub.canDelegate("forceresetpassword")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","forceresetpassword", _reset, _uname); return;}
ResumableSub_ForceResetPassword rsub = new ResumableSub_ForceResetPassword(null,_reset,_uname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ForceResetPassword extends BA.ResumableSub {
public ResumableSub_ForceResetPassword(xevolution.vrcg.devdemov2400.main parent,RemoteObject _reset,RemoteObject _uname) {
this.parent = parent;
this._reset = _reset;
this._uname = _uname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _reset;
RemoteObject _uname;
RemoteObject _appldialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sccommand = RemoteObject.createImmutable("");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _confuser = RemoteObject.createImmutable("");
RemoteObject _resultstr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ForceResetPassword (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1948);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Reset", _reset);
Debug.locals.put("uname", _uname);
 BA.debugLineNum = 1954;BA.debugLine="If Reset Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 31;
if (_reset.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1955;BA.debugLine="Dim appldialog As CustomLayoutDialog";
Debug.ShouldStop(4);
_appldialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");Debug.locals.put("appldialog", _appldialog);
 BA.debugLineNum = 1956;BA.debugLine="Dim sf As Object = appldialog.ShowAsync(\"Alteraç";
Debug.ShouldStop(8);
_sf = _appldialog.runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Alteração palavra passe")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),main.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1958;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Con";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_sf),(Object)(parent.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent.mostCurrent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 1959;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(64);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1960;BA.debugLine="appldialog.SetSize(60%x, 40%y)";
Debug.ShouldStop(128);
_appldialog.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),main.mostCurrent.activityBA)));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1962;BA.debugLine="appldialog.SetSize(60%x, 40%y)";
Debug.ShouldStop(512);
_appldialog.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),main.mostCurrent.activityBA)));
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 1964;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "forceresetpassword"), _sf);
this.state = 32;
return;
case 32:
//C
this.state = 10;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 1965;BA.debugLine="pnl.LoadLayout(\"dialogoforcepassword\")";
Debug.ShouldStop(4096);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialogoforcepassword")),main.mostCurrent.activityBA);
 BA.debugLineNum = 1968;BA.debugLine="If newpass1.Text = \"\" Or newpass2.Text = \"\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._newpass1.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",parent.mostCurrent._newpass2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1969;BA.debugLine="appldialog.GetButton(DialogResponse.POSITIVE).E";
Debug.ShouldStop(65536);
_appldialog.runMethod(false,"GetButton",(Object)(parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;
;
 BA.debugLineNum = 1972;BA.debugLine="If newpass2.text <> newpass1.Text Then";
Debug.ShouldStop(524288);

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._newpass2.runMethod(true,"getText"),parent.mostCurrent._newpass1.runMethod(true,"getText"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1973;BA.debugLine="appldialog.GetButton(DialogResponse.POSITIVE).E";
Debug.ShouldStop(1048576);
_appldialog.runMethod(false,"GetButton",(Object)(parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))).runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1976;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "forceresetpassword"), _sf);
this.state = 33;
return;
case 33:
//C
this.state = 17;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1978;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(33554432);
if (true) break;

case 17:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 19;
}else {
this.state = 25;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1980;BA.debugLine="ShareCode.newpass = newpass2.Text";
Debug.ShouldStop(134217728);
parent.mostCurrent._sharecode._newpass /*RemoteObject*/  = parent.mostCurrent._newpass2.runMethod(true,"getText");
 BA.debugLineNum = 1982;BA.debugLine="Dim params As Map";
Debug.ShouldStop(536870912);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1983;BA.debugLine="params.Initialize";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1984;BA.debugLine="params.Clear";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1985;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1986;BA.debugLine="params.Put(\"_user\", uname)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((_uname)));
 BA.debugLineNum = 1987;BA.debugLine="params.Put(\"_key\", ShareCode.newpass)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_key"))),(Object)((parent.mostCurrent._sharecode._newpass /*RemoteObject*/ )));
 BA.debugLineNum = 1988;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._versiontagcode)));
 BA.debugLineNum = 1989;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorizatio";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._deviceauthorization)));
 BA.debugLineNum = 1990;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._deviceinstance)));
 BA.debugLineNum = 1991;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._devicebrand)));
 BA.debugLineNum = 1992;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._devicemodel)));
 BA.debugLineNum = 1993;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddres";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._devicemacaddress)));
 BA.debugLineNum = 1995;BA.debugLine="Dim sccommand As String = $\"username='${ShareCo";
Debug.ShouldStop(1024);
_sccommand = (RemoteObject.concat(RemoteObject.createImmutable("username='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ))),RemoteObject.createImmutable("', password='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._newpass /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("sccommand", _sccommand);Debug.locals.put("sccommand", _sccommand);
 BA.debugLineNum = 1996;BA.debugLine="Log(sccommand)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111804464",_sccommand,0);
 BA.debugLineNum = 1998;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(8192);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1999;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(16384);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 2000;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(32768);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2001;BA.debugLine="Log(data)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111804469",_data,0);
 BA.debugLineNum = 2002;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(131072);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 2003;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(262144);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 2005;BA.debugLine="Dim ConfUser As String = ShareCode.APP_URL & \"o";
Debug.ShouldStop(1048576);
_confuser = RemoteObject.concat(parent.mostCurrent._sharecode._app_url /*RemoteObject*/ ,RemoteObject.createImmutable("orion/mobile/User/change/password"));Debug.locals.put("ConfUser", _confuser);Debug.locals.put("ConfUser", _confuser);
 BA.debugLineNum = 2006;BA.debugLine="Log(ConfUser)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111804474",_confuser,0);
 BA.debugLineNum = 2007;BA.debugLine="Job.PostString(ConfUser, data )";
Debug.ShouldStop(4194304);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_confuser),(Object)(_data));
 BA.debugLineNum = 2008;BA.debugLine="Job.GetRequest.SetContentType(\"application/json";
Debug.ShouldStop(8388608);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2009;BA.debugLine="ShareCode.newpass = \"\"";
Debug.ShouldStop(16777216);
parent.mostCurrent._sharecode._newpass /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 2010;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "forceresetpassword"), (_job));
this.state = 34;
return;
case 34:
//C
this.state = 20;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 2011;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 20:
//if
this.state = 23;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2012;BA.debugLine="MsgboxAsync(\"A Password foi alterada\",ShareCod";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("A Password foi alterada")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 2013;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111804481",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2014;BA.debugLine="Dim ResultStr As String = Job.GetString";
Debug.ShouldStop(536870912);
_resultstr = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("ResultStr", _resultstr);Debug.locals.put("ResultStr", _resultstr);
 BA.debugLineNum = 2015;BA.debugLine="Log(ResultStr)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111804483",_resultstr,0);
 if (true) break;

case 23:
//C
this.state = 30;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2019;BA.debugLine="ShareCode.newpass = \"Null\"";
Debug.ShouldStop(4);
parent.mostCurrent._sharecode._newpass /*RemoteObject*/  = BA.ObjectToString("Null");
 BA.debugLineNum = 2021;BA.debugLine="If ShareCode.newpass = \"Null\" Then";
Debug.ShouldStop(16);
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newpass /*RemoteObject*/ ,BA.ObjectToString("Null"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 2029;BA.debugLine="End Sub";
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
public static void  _dialog_ready(RemoteObject _pnl) throws Exception{
}
public static void  _dialog_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _getappversion(RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("GetAppVersion (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1196);
if (RapidSub.canDelegate("getappversion")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getappversion", _date);}
ResumableSub_GetAppVersion rsub = new ResumableSub_GetAppVersion(null,_date);
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
public static class ResumableSub_GetAppVersion extends BA.ResumableSub {
public ResumableSub_GetAppVersion(xevolution.vrcg.devdemov2400.main parent,RemoteObject _date) {
this.parent = parent;
this._date = _date;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _date;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetAppVersion (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1196);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("date", _date);
 BA.debugLineNum = 1198;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static void  _getauthorizationtousedeviceresources() throws Exception{
try {
		Debug.PushSubsStack("GetAuthorizationToUseDeviceResources (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,452);
if (RapidSub.canDelegate("getauthorizationtousedeviceresources")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getauthorizationtousedeviceresources"); return;}
ResumableSub_GetAuthorizationToUseDeviceResources rsub = new ResumableSub_GetAuthorizationToUseDeviceResources(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetAuthorizationToUseDeviceResources extends BA.ResumableSub {
public ResumableSub_GetAuthorizationToUseDeviceResources(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetAuthorizationToUseDeviceResources (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,452);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 453;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
Debug.ShouldStop(16);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_SEND_SMS")));
 BA.debugLineNum = 454;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 26;
return;
case 26:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 455;BA.debugLine="If Result Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 456;BA.debugLine="Starter.APP_SEND_SMS = True";
Debug.ShouldStop(128);
parent.mostCurrent._starter._app_send_sms /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 459;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
Debug.ShouldStop(1024);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 460;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 461;BA.debugLine="If Result Then";
Debug.ShouldStop(4096);
if (true) break;

case 5:
//if
this.state = 8;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 462;BA.debugLine="Starter.APP_FINE_LOCATION_ACCESS = True";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._app_fine_location_access /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 465;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 466;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 28;
return;
case 28:
//C
this.state = 9;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 467;BA.debugLine="If Result Then";
Debug.ShouldStop(262144);
if (true) break;

case 9:
//if
this.state = 12;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 468;BA.debugLine="Starter.APP_CAMERA_ACCESS = True";
Debug.ShouldStop(524288);
parent.mostCurrent._starter._app_camera_access /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 471;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
Debug.ShouldStop(4194304);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 472;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 29;
return;
case 29:
//C
this.state = 13;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 473;BA.debugLine="If Result Then";
Debug.ShouldStop(16777216);
if (true) break;

case 13:
//if
this.state = 16;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 474;BA.debugLine="Starter.APP_CAMERA_ACCESS = True";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._app_camera_access /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 477;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_READ_EXTERNAL_STORAGE")));
 BA.debugLineNum = 478;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 30;
return;
case 30:
//C
this.state = 17;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 479;BA.debugLine="If Result Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 17:
//if
this.state = 20;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 480;BA.debugLine="Starter.APP_CAMERA_ACCESS = True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._starter._app_camera_access /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;
;
 BA.debugLineNum = 483;BA.debugLine="If (Not(Starter.APP_FINE_LOCATION_ACCESS) And Not";
Debug.ShouldStop(4);

case 20:
//if
this.state = 25;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._app_fine_location_access /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._app_camera_access /*RemoteObject*/ ))))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 484;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 486;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 488;BA.debugLine="End Sub";
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
public static RemoteObject  _getdefaultlanguage() throws Exception{
try {
		Debug.PushSubsStack("GetDefaultLanguage (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,201);
if (RapidSub.canDelegate("getdefaultlanguage")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getdefaultlanguage");}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 201;BA.debugLine="Sub GetDefaultLanguage As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 203;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1024);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 204;BA.debugLine="r.Target = r.RunStaticMethod(\"java.util.Locale\",";
Debug.ShouldStop(2048);
_r.setField ("Target",_r.runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("java.util.Locale")),(Object)(BA.ObjectToString("getDefault")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),(Object)((main.mostCurrent.__c.getField(false,"Null")))));
 BA.debugLineNum = 205;BA.debugLine="Log(r.RunMethod(\"getDisplayName\"))";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6108265476",BA.ObjectToString(_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getDisplayName")))),0);
 BA.debugLineNum = 206;BA.debugLine="Log(r.RunMethod(\"getCountry\"))";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6108265477",BA.ObjectToString(_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getCountry")))),0);
 BA.debugLineNum = 207;BA.debugLine="Log(r.RunMethod(\"getLanguage\"))";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6108265478",BA.ObjectToString(_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getLanguage")))),0);
 BA.debugLineNum = 208;BA.debugLine="Return r.RunMethod(\"getLanguage\")";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString(_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getLanguage"))));
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdeviceparamsfromdatabase() throws Exception{
try {
		Debug.PushSubsStack("GetDeviceParamsFromDatabase (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1377);
if (RapidSub.canDelegate("getdeviceparamsfromdatabase")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getdeviceparamsfromdatabase");}
 BA.debugLineNum = 1377;BA.debugLine="Sub GetDeviceParamsFromDatabase";
Debug.ShouldStop(1);
 BA.debugLineNum = 1378;BA.debugLine="ShareCode.DEVICE_PARAM_AS_OBS2DETAILS = 0";
Debug.ShouldStop(2);
main.mostCurrent._sharecode._device_param_as_obs2details /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1380;BA.debugLine="ShareCode.DEVICE_ONLY_TECHORUSER 			= Utils.IfNul";
Debug.ShouldStop(8);
main.mostCurrent._sharecode._device_only_techoruser /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_ONLY_TECHORUSER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1381;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ID 			= Utils.IfNul";
Debug.ShouldStop(16);
main.mostCurrent._sharecode._device_show_request_id /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_SHOW_REQUEST_ID"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1382;BA.debugLine="ShareCode.DEVICE_PARAM_DATA_CONFIRM 		= Utils.IfN";
Debug.ShouldStop(32);
main.mostCurrent._sharecode._device_param_data_confirm /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DATA_CONFIRM"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1383;BA.debugLine="ShareCode.DEVICE_PARAM_AVAILABILITY 		= Utils.IfN";
Debug.ShouldStop(64);
main.mostCurrent._sharecode._device_param_availability /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_AVAILABILITY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1384;BA.debugLine="ShareCode.DEVICE_PARAM_FAVORITES 			= Utils.IfNul";
Debug.ShouldStop(128);
main.mostCurrent._sharecode._device_param_favorites /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_FAVORITES"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1385;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_REQUEST 		= Utils.If";
Debug.ShouldStop(256);
main.mostCurrent._sharecode._device_param_pause_request /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PAUSE_REQUEST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1386;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_TECH 			= Utils.IfNu";
Debug.ShouldStop(512);
main.mostCurrent._sharecode._device_param_pause_tech /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PAUSE_TECH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1387;BA.debugLine="ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION = Uti";
Debug.ShouldStop(1024);
main.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_UPLOAD_ONEXECUTION"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1388;BA.debugLine="ShareCode.DEVICE_REQUEST_AUTOUPDT_ONALERT 	= Util";
Debug.ShouldStop(2048);
main.mostCurrent._sharecode._device_request_autoupdt_onalert /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_AUTOUPDT_ONALERT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1389;BA.debugLine="ShareCode.DEVICE_AS_SEND_IMMEDIATLY 		= Utils.IfN";
Debug.ShouldStop(4096);
main.mostCurrent._sharecode._device_as_send_immediatly /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AS_SEND_IMMEDIATLY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1390;BA.debugLine="ShareCode.DEVICE_REQUEST_HIDECANCELED 		= Utils.I";
Debug.ShouldStop(8192);
main.mostCurrent._sharecode._device_request_hidecanceled /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_HIDECANCELED"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1391;BA.debugLine="ShareCode.DEVICE_AUTOUPDATE_ONLOGIN 		= Utils.IfN";
Debug.ShouldStop(16384);
main.mostCurrent._sharecode._device_autoupdate_onlogin /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AUTOUPDATE_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1392;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_FIRST 			= Utils.IfN";
Debug.ShouldStop(32768);
main.mostCurrent._sharecode._device_auto_expand_first /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AUTO_EXPAND_FIRST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1393;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_CHECKLIST 		= Utils.";
Debug.ShouldStop(65536);
main.mostCurrent._sharecode._device_auto_expand_checklist /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AUTO_EXPAND_CHECKLIST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1394;BA.debugLine="ShareCode.DEVICE_DEFAULT_ROUTE 				= Utils.IfNull";
Debug.ShouldStop(131072);
main.mostCurrent._sharecode._device_default_route /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_DEFAULT_ROUTE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1395;BA.debugLine="ShareCode.DEVICE_AS_INCLUDE_OBS_FIRST 		= Utils.I";
Debug.ShouldStop(262144);
main.mostCurrent._sharecode._device_as_include_obs_first /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_AS_INCLUDE_OBS_FIRST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1396;BA.debugLine="ShareCode.DEVICE_PARAM_PRINT_DRAFT 			= Utils.IfN";
Debug.ShouldStop(524288);
main.mostCurrent._sharecode._device_param_print_draft /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PRINT_DRAFT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1397;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ROUTE 		= Utils.IfN";
Debug.ShouldStop(1048576);
main.mostCurrent._sharecode._device_show_request_route /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_SHOW_REQUEST_ROUTE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1398;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER 		= Utils.IfN";
Debug.ShouldStop(2097152);
main.mostCurrent._sharecode._device_request_push_other /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_PUSH_OTHER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1399;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_QUALITY 		= Utils.If";
Debug.ShouldStop(4194304);
main.mostCurrent._sharecode._device_param_photo_quality /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PHOTO_QUALITY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1401;BA.debugLine="ShareCode.DEVICE_REOPEN_CHECKLISTS 			= Utils.IfN";
Debug.ShouldStop(16777216);
main.mostCurrent._sharecode._device_reopen_checklists /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REOPEN_CHECKLISTS"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1403;BA.debugLine="ShareCode.DEVICE_REQUEST_SIGNATURE_TRG 		= Utils.";
Debug.ShouldStop(67108864);
main.mostCurrent._sharecode._device_request_signature_trg /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SIGNATURE_TRG"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1404;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER_AUTH 	= Utils";
Debug.ShouldStop(134217728);
main.mostCurrent._sharecode._device_request_push_other_auth /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_PUSH_OTHER_AUTH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1405;BA.debugLine="ShareCode.DEVICE_PARAM_ORIENTATION 			= Utils.IfN";
Debug.ShouldStop(268435456);
main.mostCurrent._sharecode._device_param_orientation /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ORIENTATION"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1406;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE 		= Utils.I";
Debug.ShouldStop(536870912);
main.mostCurrent._sharecode._device_param_photo_fontsize /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_FONTSIZE")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(12))));
 BA.debugLineNum = 1407;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_HEIGHT 		= Utils.IfN";
Debug.ShouldStop(1073741824);
main.mostCurrent._sharecode._device_param_photo_height /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_HEIGHT")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(615))));
 BA.debugLineNum = 1408;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_WIDTH 			= Utils.IfN";
Debug.ShouldStop(-2147483648);
main.mostCurrent._sharecode._device_param_photo_width /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_WIDTH")),(Object)(RemoteObject.createImmutable("value")))),(Object)(BA.NumberToString(820))));
 BA.debugLineNum = 1409;BA.debugLine="ShareCode.DEVICE_REQUEST_CAN_DELETE_OWNED 	= Util";
Debug.ShouldStop(1);
main.mostCurrent._sharecode._device_request_can_delete_owned /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_CAN_DELETE_OWNED"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1410;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FILETYPE 		= Utils.I";
Debug.ShouldStop(2);
main.mostCurrent._sharecode._device_param_photo_filetype /*RemoteObject*/  = main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._dbstructures.runMethod(true,"_getparamstatefield" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("DEVICE_PARAM_PHOTO_FILETYPE")),(Object)(RemoteObject.createImmutable("value")))),(Object)(RemoteObject.createImmutable("PNG")));
 BA.debugLineNum = 1411;BA.debugLine="ShareCode.DEVICE_PARAM_PULL 				= Utils.IfNullOrE";
Debug.ShouldStop(4);
main.mostCurrent._sharecode._device_param_pull /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_PULL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1412;BA.debugLine="ShareCode.DEVICE_PARAM_ROUTES 				= Utils.IfNullO";
Debug.ShouldStop(8);
main.mostCurrent._sharecode._device_param_routes /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ROUTES"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1414;BA.debugLine="ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.I";
Debug.ShouldStop(32);
main.mostCurrent._sharecode._device_param_generatereport /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_GENERATEREPORT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1416;BA.debugLine="ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.";
Debug.ShouldStop(128);
main.mostCurrent._sharecode._device_param_resync_requests /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_RESYNC_REQUESTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1417;BA.debugLine="ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Uti";
Debug.ShouldStop(256);
main.mostCurrent._sharecode._device_param_runcl_notyperequest /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_RUNCL_NOTYPEREQUEST"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1418;BA.debugLine="ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.If";
Debug.ShouldStop(512);
main.mostCurrent._sharecode._device_param_foto_evidence /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_FOTO_EVIDENCE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1419;BA.debugLine="ShareCode.DEVICE_PARAM_DRAW_EVIDENCE 		= Utils.If";
Debug.ShouldStop(1024);
main.mostCurrent._sharecode._device_param_draw_evidence /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DRAW_EVIDENCE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1421;BA.debugLine="ShareCode.DEVICE_PARAM_SENDREPORT 					= Utils.if";
Debug.ShouldStop(4096);
main.mostCurrent._sharecode._device_param_sendreport /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_SENDREPORT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1422;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_OBJECT 			= Util";
Debug.ShouldStop(8192);
main.mostCurrent._sharecode._device_param_canchange_object /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_CANCHANGE_OBJECT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1423;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_ENTITY 			= Util";
Debug.ShouldStop(16384);
main.mostCurrent._sharecode._device_param_canchange_entity /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_CANCHANGE_ENTITY"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1424;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CANDUPLICATE 		= U";
Debug.ShouldStop(32768);
main.mostCurrent._sharecode._device_param_request_canduplicate /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_CANDUPLICATE"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1425;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSIGNTO 			= Util";
Debug.ShouldStop(65536);
main.mostCurrent._sharecode._device_param_request_assignto /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ASSIGNTO"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1426;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT";
Debug.ShouldStop(131072);
main.mostCurrent._sharecode._device_param_request_assto_mustaccept /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1427;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANG";
Debug.ShouldStop(262144);
main.mostCurrent._sharecode._device_param_request_infotitle_canchange /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1428;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE";
Debug.ShouldStop(524288);
main.mostCurrent._sharecode._device_param_request_cltitle_canchange /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1429;BA.debugLine="ShareCode.DEVICE_PARAM_ADDITIONAL_USERS_REGISTER";
Debug.ShouldStop(1048576);
main.mostCurrent._sharecode._device_param_additional_users_register /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ADDITIONAL_USERS_REGISTER"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1430;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY";
Debug.ShouldStop(2097152);
main.mostCurrent._sharecode._device_param_login_mustselect_comapny /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1431;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONME";
Debug.ShouldStop(4194304);
main.mostCurrent._sharecode._device_param_login_mustselect_environment /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1432;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRST";
Debug.ShouldStop(8388608);
main.mostCurrent._sharecode._device_param_login_passwordchange_firsttime /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1433;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL";
Debug.ShouldStop(16777216);
main.mostCurrent._sharecode._device_param_login_allow_qrcode_control /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1434;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL";
Debug.ShouldStop(33554432);
main.mostCurrent._sharecode._device_param_login_allow_facial_control /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1435;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL";
Debug.ShouldStop(67108864);
main.mostCurrent._sharecode._device_param_request_enddate_control /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ENDDATE_CONTROL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1436;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW";
Debug.ShouldStop(134217728);
main.mostCurrent._sharecode._device_param_request_enddate_inday_show /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1438;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOWNEWICON_ONALERT 		=";
Debug.ShouldStop(536870912);
main.mostCurrent._sharecode._device_request_shownewicon_onalert /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SHOWNEWICON_ONALERT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1439;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST";
Debug.ShouldStop(1073741824);
main.mostCurrent._sharecode._device_param_object_allow_new_request /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1440;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL 		=";
Debug.ShouldStop(-2147483648);
main.mostCurrent._sharecode._device_param_object_allow_view_all /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1441;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSO";
Debug.ShouldStop(1);
main.mostCurrent._sharecode._device_param_object_allow_evidence_associate /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1442;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB";
Debug.ShouldStop(2);
main.mostCurrent._sharecode._device_param_object_allow_requests_tab /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1443;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUM";
Debug.ShouldStop(4);
main.mostCurrent._sharecode._device_param_object_allow_relations_jump /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1444;BA.debugLine="ShareCode.DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE";
Debug.ShouldStop(8);
main.mostCurrent._sharecode._device_request_update_server_onclose /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1445;BA.debugLine="ShareCode.DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT 		=";
Debug.ShouldStop(16);
main.mostCurrent._sharecode._device_checklist_alldocs_in_object /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1446;BA.debugLine="ShareCode.DEVICE_PARAM_DEFAULT_DATE_PERIOD 			= U";
Debug.ShouldStop(32);
main.mostCurrent._sharecode._device_param_default_date_period /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_DEFAULT_DATE_PERIOD"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1447;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER 			= U";
Debug.ShouldStop(64);
main.mostCurrent._sharecode._device_request_show_date_divider /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_SHOW_DATE_DIVIDER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1449;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE 		=";
Debug.ShouldStop(256);
main.mostCurrent._sharecode._device_checklist_svrimgudp_onclose /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1450;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGE";
Debug.ShouldStop(512);
main.mostCurrent._sharecode._device_checklist_svrimgudp_width_trigger /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1451;BA.debugLine="ShareCode.DEVICE_ASKTOUPDATE_ONLOGIN 				= Utils.";
Debug.ShouldStop(1024);
main.mostCurrent._sharecode._device_asktoupdate_onlogin /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_ASKTOUPDATE_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1452;BA.debugLine="ShareCode.DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY";
Debug.ShouldStop(2048);
main.mostCurrent._sharecode._device_checklist_include_public_gallery /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1453;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REQUESTS 				= Util";
Debug.ShouldStop(4096);
main.mostCurrent._sharecode._device_param_access_requests /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_REQUESTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1454;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REPORTS 				= Utils";
Debug.ShouldStop(8192);
main.mostCurrent._sharecode._device_param_access_reports /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_REPORTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1455;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_ALERTS 				= Utils.";
Debug.ShouldStop(16384);
main.mostCurrent._sharecode._device_param_access_alerts /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_ALERTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1456;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_OBJECTS 				= Utils";
Debug.ShouldStop(32768);
main.mostCurrent._sharecode._device_param_access_objects /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_OBJECTS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1457;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_TASKS 				= Utils.i";
Debug.ShouldStop(65536);
main.mostCurrent._sharecode._device_param_access_tasks /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_TASKS"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1458;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_MYDATA 				= Utils.";
Debug.ShouldStop(131072);
main.mostCurrent._sharecode._device_param_access_mydata /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACCESS_MYDATA"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1459;BA.debugLine="ShareCode.DEVICE_REQUEST_CUSTOMORDER 				= Utils.";
Debug.ShouldStop(262144);
main.mostCurrent._sharecode._device_request_customorder /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REQUEST_CUSTOMORDER"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1461;BA.debugLine="ShareCode.DEVICE_CHECKLIST_STARTON_MYDATA 			= Ut";
Debug.ShouldStop(1048576);
main.mostCurrent._sharecode._device_checklist_starton_mydata /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_STARTON_MYDATA"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1462;BA.debugLine="ShareCode.DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP 		=";
Debug.ShouldStop(2097152);
main.mostCurrent._sharecode._device_checklist_mydata_docs_ontop /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1464;BA.debugLine="ShareCode.DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND";
Debug.ShouldStop(8388608);
main.mostCurrent._sharecode._device_checklist_objectmandatory_onend /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1465;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONE";
Debug.ShouldStop(16777216);
main.mostCurrent._sharecode._device_checklist_siganturemandatory_onend /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1466;BA.debugLine="ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE 		= U";
Debug.ShouldStop(33554432);
main.mostCurrent._sharecode._device_param_activate_printmodule /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_ACTIVATE_PRINTMODULE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1467;BA.debugLine="ShareCode.DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGI";
Debug.ShouldStop(67108864);
main.mostCurrent._sharecode._device_param_testconnected_print_onlogin /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1468;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOS";
Debug.ShouldStop(134217728);
main.mostCurrent._sharecode._device_checklist_autoreturn_after_fotoshot /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1469;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSA";
Debug.ShouldStop(268435456);
main.mostCurrent._sharecode._device_checklist_autoreturn_after_subsaction /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1470;BA.debugLine="ShareCode.DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS";
Debug.ShouldStop(536870912);
main.mostCurrent._sharecode._device_checklist_copy_asdetails_to_obs /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1471;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNA";
Debug.ShouldStop(1073741824);
main.mostCurrent._sharecode._device_checklist_autoreturn_after_signature /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1473;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE = Uti";
Debug.ShouldStop(1);
main.mostCurrent._sharecode._device_param_inverted_foto_device /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_INVERTED_FOTO_DEVICE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1474;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE";
Debug.ShouldStop(2);
main.mostCurrent._sharecode._device_param_inverted_horiz_foto_device /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1476;BA.debugLine="ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = Uti";
Debug.ShouldStop(8);
main.mostCurrent._sharecode._device_report_date_from_checklist /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_REPORT_DATE_FROM_CHECKLIST"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1478;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_START_NEWWAY = Utils";
Debug.ShouldStop(32);
main.mostCurrent._sharecode._device_typerequest_start_newway /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_TYPEREQUEST_START_NEWWAY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1479;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY";
Debug.ShouldStop(64);
main.mostCurrent._sharecode._device_typerequest_define_start_newway /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1481;BA.debugLine="ShareCode.DEVICE_EMAIL_OLD_MODEL = Utils.ifnullor";
Debug.ShouldStop(256);
main.mostCurrent._sharecode._device_email_old_model /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_EMAIL_OLD_MODEL"))))),(Object)(BA.NumberToString(1))));
 BA.debugLineNum = 1482;BA.debugLine="ShareCode.EmailOldModel = Utils.Int2Bool(ShareCod";
Debug.ShouldStop(512);
main.mostCurrent._sharecode._emailoldmodel /*RemoteObject*/  = main.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._sharecode._device_email_old_model /*RemoteObject*/ ));
 BA.debugLineNum = 1484;BA.debugLine="ShareCode.DEVICE_SHOW_GLOBAL_SEARCH = Utils.ifnul";
Debug.ShouldStop(2048);
main.mostCurrent._sharecode._device_show_global_search /*RemoteObject*/  = BA.numberCast(int.class, main.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.NumberToString(main.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_SHOW_GLOBAL_SEARCH"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 1488;BA.debugLine="If ShareCode.APP_DOMAIN.ToLowerCase = \"demo\" Or S";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),BA.ObjectToString("demo")) || RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),BA.ObjectToString("devdemo")) || RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),BA.ObjectToString("itg"))) { 
 BA.debugLineNum = 1489;BA.debugLine="ShareCode.DEVICE_SHOW_GLOBAL_SEARCH=1";
Debug.ShouldStop(65536);
main.mostCurrent._sharecode._device_show_global_search /*RemoteObject*/  = BA.numberCast(int.class, 1);
 };
 BA.debugLineNum = 1492;BA.debugLine="If ShareCode.APP_DOMAIN.ToLowerCase = \"engitagus\"";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),BA.ObjectToString("engitagus"))) { 
 BA.debugLineNum = 1493;BA.debugLine="ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST=0";
Debug.ShouldStop(1048576);
main.mostCurrent._sharecode._device_report_date_from_checklist /*RemoteObject*/  = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 1496;BA.debugLine="ShareCode.DEVICE_DEF_FONT_SIZE = ShareCode.DEVICE";
Debug.ShouldStop(8388608);
main.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/  = main.mostCurrent._sharecode._device_param_photo_fontsize /*RemoteObject*/ ;
 BA.debugLineNum = 1497;BA.debugLine="ShareCode.DEVICE_DEF_QUALITY = ShareCode.DEVICE_P";
Debug.ShouldStop(16777216);
main.mostCurrent._sharecode._device_def_quality /*RemoteObject*/  = main.mostCurrent._sharecode._device_param_photo_quality /*RemoteObject*/ ;
 BA.debugLineNum = 1498;BA.debugLine="ShareCode.DEVICE_DEF_IMG_FILETYPE = ShareCode.DEV";
Debug.ShouldStop(33554432);
main.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/  = main.mostCurrent._sharecode._device_param_photo_filetype /*RemoteObject*/ ;
 BA.debugLineNum = 1499;BA.debugLine="ShareCode.DEVICE_DEF_IMG_WIDTH = ShareCode.DEVICE";
Debug.ShouldStop(67108864);
main.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/  = main.mostCurrent._sharecode._device_param_photo_width /*RemoteObject*/ ;
 BA.debugLineNum = 1500;BA.debugLine="ShareCode.DEVICE_DEF_IMG_HEIGHT = ShareCode.DEVIC";
Debug.ShouldStop(134217728);
main.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/  = main.mostCurrent._sharecode._device_param_photo_height /*RemoteObject*/ ;
 BA.debugLineNum = 1502;BA.debugLine="ShareCode.STS005 = Utils.Int2Bool(ShareCode.DEVIC";
Debug.ShouldStop(536870912);
main.mostCurrent._sharecode._sts005 /*RemoteObject*/  = main.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._sharecode._device_request_hidecanceled /*RemoteObject*/ ));
 BA.debugLineNum = 1504;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getloginmainlogo() throws Exception{
try {
		Debug.PushSubsStack("getLoginMainLogo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1622);
if (RapidSub.canDelegate("getloginmainlogo")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getloginmainlogo");}
ResumableSub_getLoginMainLogo rsub = new ResumableSub_getLoginMainLogo(null);
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
public static class ResumableSub_getLoginMainLogo extends BA.ResumableSub {
public ResumableSub_getLoginMainLogo(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getLoginMainLogo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1622);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1623;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4194304);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1624;BA.debugLine="params.Initialize";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1625;BA.debugLine="params.Clear";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1626;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1627;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._versiontagcode)));
 BA.debugLineNum = 1628;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._deviceauthorization)));
 BA.debugLineNum = 1629;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._deviceinstance)));
 BA.debugLineNum = 1630;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._devicebrand)));
 BA.debugLineNum = 1631;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._devicemodel)));
 BA.debugLineNum = 1632;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._devicemacaddress)));
 BA.debugLineNum = 1633;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1634;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(2);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1635;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(4);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1636;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(8);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1637;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(16);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1638;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(32);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 1639;BA.debugLine="Dim addr As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(64);
_addr = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/mobile/login/logo")));Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 1640;BA.debugLine="Job.PostString(addr, data )";
Debug.ShouldStop(128);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_data));
 BA.debugLineNum = 1641;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(256);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1642;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getloginmainlogo"), (_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1643;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 8;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1644;BA.debugLine="ShareCode.APP_MAIN_LOGO = Job.GetString";
Debug.ShouldStop(2048);
parent.mostCurrent._sharecode._app_main_logo /*RemoteObject*/  = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );
 BA.debugLineNum = 1645;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_M";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_MAIN_LOGO")),(Object)(parent.mostCurrent._sharecode._app_main_logo /*RemoteObject*/ ));
 BA.debugLineNum = 1646;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 1647;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO)) Then";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_main_logo /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1648;BA.debugLine="mainPanSplashCustomLogo.SetBackgroundImage(Util";
Debug.ShouldStop(32768);
parent.mostCurrent._mainpansplashcustomlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_main_logo /*RemoteObject*/ )).getObject())));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1651;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1652;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static RemoteObject  _getloginmainlogomini() throws Exception{
try {
		Debug.PushSubsStack("getLoginMainLogoMini (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1654);
if (RapidSub.canDelegate("getloginmainlogomini")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getloginmainlogomini");}
ResumableSub_getLoginMainLogoMini rsub = new ResumableSub_getLoginMainLogoMini(null);
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
public static class ResumableSub_getLoginMainLogoMini extends BA.ResumableSub {
public ResumableSub_getLoginMainLogoMini(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getLoginMainLogoMini (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1654);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1655;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4194304);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1656;BA.debugLine="params.Initialize";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1657;BA.debugLine="params.Clear";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1658;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1659;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._versiontagcode)));
 BA.debugLineNum = 1660;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._deviceauthorization)));
 BA.debugLineNum = 1661;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._deviceinstance)));
 BA.debugLineNum = 1662;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._devicebrand)));
 BA.debugLineNum = 1663;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._devicemodel)));
 BA.debugLineNum = 1664;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._devicemacaddress)));
 BA.debugLineNum = 1665;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1666;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(2);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1667;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(4);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1668;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(8);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1669;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(16);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1670;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(32);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 1671;BA.debugLine="Dim addr As String = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(64);
_addr = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/mobile/login/logo/mini")));Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 1672;BA.debugLine="Job.PostString(addr, data )";
Debug.ShouldStop(128);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_data));
 BA.debugLineNum = 1673;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(256);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1674;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getloginmainlogomini"), (_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1675;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1676;BA.debugLine="ShareCode.APP_MAIN_LOGO_MINI = Job.GetString";
Debug.ShouldStop(2048);
parent.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/  = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );
 BA.debugLineNum = 1677;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_M";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_MAIN_LOGO_MINI")),(Object)(parent.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ));
 BA.debugLineNum = 1678;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1680;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1681;BA.debugLine="End Sub";
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
public static void  _getmainlogo(RemoteObject _authdata) throws Exception{
try {
		Debug.PushSubsStack("getMainLogo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1554);
if (RapidSub.canDelegate("getmainlogo")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getmainlogo", _authdata); return;}
ResumableSub_getMainLogo rsub = new ResumableSub_getMainLogo(null,_authdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getMainLogo extends BA.ResumableSub {
public ResumableSub_getMainLogo(xevolution.vrcg.devdemov2400.main parent,RemoteObject _authdata) {
this.parent = parent;
this._authdata = _authdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _authdata;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getMainLogo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1554);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("authData", _authdata);
 BA.debugLineNum = 1555;BA.debugLine="Dim params As Map";
Debug.ShouldStop(262144);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1556;BA.debugLine="params.Initialize";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1557;BA.debugLine="params.Clear";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1558;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1559;BA.debugLine="params.Put(\"instance\",authData.Instance)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("instance"))),(Object)((_authdata.getField(true,"Instance" /*RemoteObject*/ ))));
 BA.debugLineNum = 1560;BA.debugLine="params.Put(\"authorization\",authData.Authorization";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((_authdata.getField(true,"Authorization" /*RemoteObject*/ ))));
 BA.debugLineNum = 1561;BA.debugLine="params.Put(\"version\", authData.Version)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((_authdata.getField(true,"Version" /*RemoteObject*/ ))));
 BA.debugLineNum = 1562;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._versiontagcode)));
 BA.debugLineNum = 1563;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._deviceauthorization)));
 BA.debugLineNum = 1564;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._deviceinstance)));
 BA.debugLineNum = 1565;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._devicebrand)));
 BA.debugLineNum = 1566;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._devicemodel)));
 BA.debugLineNum = 1567;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._devicemacaddress)));
 BA.debugLineNum = 1568;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1569;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(1);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1570;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(2);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1571;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(4);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1572;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1573;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(16);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 1574;BA.debugLine="ShareCode.APP_URL  = $\"https://${ShareCode.APP_DO";
Debug.ShouldStop(32);
parent.mostCurrent._sharecode._app_url /*RemoteObject*/  = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/")));
 BA.debugLineNum = 1575;BA.debugLine="Dim addr As String = ShareCode.APP_URL & ShareCod";
Debug.ShouldStop(64);
_addr = RemoteObject.concat(parent.mostCurrent._sharecode._app_url /*RemoteObject*/ ,parent.mostCurrent._sharecode._app_confirmlinkmainlogo /*RemoteObject*/ );Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 1576;BA.debugLine="Job.PostString(addr, data )";
Debug.ShouldStop(128);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_data));
 BA.debugLineNum = 1577;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(256);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1578;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getmainlogo"), (_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1579;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 8;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1580;BA.debugLine="ShareCode.APP_MAIN_LOGO = Job.GetString";
Debug.ShouldStop(2048);
parent.mostCurrent._sharecode._app_main_logo /*RemoteObject*/  = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );
 BA.debugLineNum = 1581;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_M";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_MAIN_LOGO")),(Object)(parent.mostCurrent._sharecode._app_main_logo /*RemoteObject*/ ));
 BA.debugLineNum = 1582;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 1583;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO)) Then";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_main_logo /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1584;BA.debugLine="mainPanSplashCustomLogo.SetBackgroundImage(Util";
Debug.ShouldStop(32768);
parent.mostCurrent._mainpansplashcustomlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_main_logo /*RemoteObject*/ )).getObject())));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1587;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static void  _getmainlogomini(RemoteObject _authdata) throws Exception{
try {
		Debug.PushSubsStack("getMainLogoMini (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1589);
if (RapidSub.canDelegate("getmainlogomini")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getmainlogomini", _authdata); return;}
ResumableSub_getMainLogoMini rsub = new ResumableSub_getMainLogoMini(null,_authdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getMainLogoMini extends BA.ResumableSub {
public ResumableSub_getMainLogoMini(xevolution.vrcg.devdemov2400.main parent,RemoteObject _authdata) {
this.parent = parent;
this._authdata = _authdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _authdata;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getMainLogoMini (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1589);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("authData", _authdata);
 BA.debugLineNum = 1590;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2097152);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1591;BA.debugLine="params.Initialize";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1592;BA.debugLine="params.Clear";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1593;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1594;BA.debugLine="params.Put(\"instance\",authData.Instance)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("instance"))),(Object)((_authdata.getField(true,"Instance" /*RemoteObject*/ ))));
 BA.debugLineNum = 1595;BA.debugLine="params.Put(\"authorization\",authData.Authorization";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((_authdata.getField(true,"Authorization" /*RemoteObject*/ ))));
 BA.debugLineNum = 1596;BA.debugLine="params.Put(\"version\", authData.Version)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((_authdata.getField(true,"Version" /*RemoteObject*/ ))));
 BA.debugLineNum = 1597;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent._versiontagcode)));
 BA.debugLineNum = 1598;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent._deviceauthorization)));
 BA.debugLineNum = 1599;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent._deviceinstance)));
 BA.debugLineNum = 1600;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent._devicebrand)));
 BA.debugLineNum = 1601;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent._devicemodel)));
 BA.debugLineNum = 1602;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent._devicemacaddress)));
 BA.debugLineNum = 1603;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1604;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(8);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1605;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(16);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1606;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(32);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1607;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(64);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1608;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(128);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 1609;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.APP_D";
Debug.ShouldStop(256);
parent.mostCurrent._sharecode._app_url /*RemoteObject*/  = RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/"))));
 BA.debugLineNum = 1610;BA.debugLine="Dim addr As String = ShareCode.APP_URL & ShareCod";
Debug.ShouldStop(512);
_addr = RemoteObject.concat(parent.mostCurrent._sharecode._app_url /*RemoteObject*/ ,parent.mostCurrent._sharecode._app_confirmlinkmainlogomini /*RemoteObject*/ );Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 1611;BA.debugLine="Job.PostString(addr, data )";
Debug.ShouldStop(1024);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_data));
 BA.debugLineNum = 1612;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1613;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getmainlogomini"), (_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1614;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1615;BA.debugLine="ShareCode.APP_MAIN_LOGO_MINI = Job.GetString";
Debug.ShouldStop(16384);
parent.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/  = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );
 BA.debugLineNum = 1617;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_M";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_MAIN_LOGO_MINI")),(Object)(parent.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ));
 BA.debugLineNum = 1618;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(131072);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1620;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _getqrcode_click() throws Exception{
try {
		Debug.PushSubsStack("getQRCode_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2590);
if (RapidSub.canDelegate("getqrcode_click")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","getqrcode_click"); return;}
ResumableSub_getQRCode_Click rsub = new ResumableSub_getQRCode_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_getQRCode_Click extends BA.ResumableSub {
public ResumableSub_getQRCode_Click(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getQRCode_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2590);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 2592;BA.debugLine="QRCodePanel.Visible = True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._qrcodepanel.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2593;BA.debugLine="QRCodeReader.Visible = True";
Debug.ShouldStop(1);
parent.mostCurrent._qrcodereader.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2594;BA.debugLine="QRCodeReader.startScan";
Debug.ShouldStop(2);
parent.mostCurrent._qrcodereader.runVoidMethod ("startScan");
 BA.debugLineNum = 2595;BA.debugLine="Sleep(0)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getqrcode_click"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 2596;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 111;BA.debugLine="Private mainPanelSplash As Panel";
main.mostCurrent._mainpanelsplash = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private mainPanSplashImage As ImageView";
main.mostCurrent._mainpansplashimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private mainPanSplashLogo As ImageView";
main.mostCurrent._mainpansplashlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 114;BA.debugLine="Private mainSplashProgress As ProgressBar";
main.mostCurrent._mainsplashprogress = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private GC As Force_GC";
main.mostCurrent._gc = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.force_gc");
 //BA.debugLineNum = 118;BA.debugLine="Private MainPopMenu As MenuOnAnyView";
main.mostCurrent._mainpopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 119;BA.debugLine="Public LGO_PasswordMode As Boolean = True";
main._lgo_passwordmode = main.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 120;BA.debugLine="Private NetErrorTryCount As Int = 0";
main._neterrortrycount = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 121;BA.debugLine="Private mainLayout As String";
main.mostCurrent._mainlayout = RemoteObject.createImmutable("");
 //BA.debugLineNum = 122;BA.debugLine="Private ButtonAuthBack As Button";
main.mostCurrent._buttonauthback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 123;BA.debugLine="Private ButtonAuthNext As Button";
main.mostCurrent._buttonauthnext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Private ButtonLoginEnter As Button";
main.mostCurrent._buttonloginenter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 125;BA.debugLine="Private ButtonLoginExit As Button";
main.mostCurrent._buttonloginexit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 126;BA.debugLine="Private ButtonLoginReset As Button";
main.mostCurrent._buttonloginreset = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 127;BA.debugLine="Private ButtonWelcomeNext As Button";
main.mostCurrent._buttonwelcomenext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 128;BA.debugLine="Private EditAuthorization As EditText";
main.mostCurrent._editauthorization = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private EditInstance As EditText";
main.mostCurrent._editinstance = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 130;BA.debugLine="Private EditPassword As EditText";
main.mostCurrent._editpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Private EditUserName As EditText";
main.mostCurrent._editusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Private mainSplashImage As ImageView";
main.mostCurrent._mainsplashimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private Panel_Authorization As Panel";
main.mostCurrent._panel_authorization = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private Panel_Config As Panel";
main.mostCurrent._panel_config = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 135;BA.debugLine="Private Panel_Login As Panel";
main.mostCurrent._panel_login = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 136;BA.debugLine="Private Panel_Login_Validation As Panel";
main.mostCurrent._panel_login_validation = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 137;BA.debugLine="Private Panel_Verification As Panel";
main.mostCurrent._panel_verification = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 138;BA.debugLine="Private Panel_Welcome As Panel";
main.mostCurrent._panel_welcome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 139;BA.debugLine="Private SelectLanguage As Spinner";
main.mostCurrent._selectlanguage = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 140;BA.debugLine="Private SelectOrientation As Spinner";
main.mostCurrent._selectorientation = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 141;BA.debugLine="Private LabelVersion As Label";
main.mostCurrent._labelversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 142;BA.debugLine="Private ButtonAppNetwork As Button";
main.mostCurrent._buttonappnetwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 143;BA.debugLine="Private mainSplashImageEffect As ImageView";
main.mostCurrent._mainsplashimageeffect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 144;BA.debugLine="Private mainFirstInstall As Label";
main.mostCurrent._mainfirstinstall = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 145;BA.debugLine="Private isFirstInstall As Boolean = False";
main._isfirstinstall = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 146;BA.debugLine="Private mainPanSplashCustomLogo As ImageView";
main.mostCurrent._mainpansplashcustomlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 148;BA.debugLine="Private MainLayoutPanel As Panel";
main.mostCurrent._mainlayoutpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 149;BA.debugLine="Private LoginPanelIconImageView As ImageView";
main.mostCurrent._loginpaneliconimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 151;BA.debugLine="Private LoginValidationPanelIconImageView As Imag";
main.mostCurrent._loginvalidationpaneliconimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 152;BA.debugLine="Private VarificationPanelIconImageView As ImageVi";
main.mostCurrent._varificationpaneliconimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 153;BA.debugLine="Private AuthorizationPanelIconImageView As ImageV";
main.mostCurrent._authorizationpaneliconimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 154;BA.debugLine="Private WelcomePanelIconImageView As ImageView";
main.mostCurrent._welcomepaneliconimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 155;BA.debugLine="Private CompanyImageView As ImageView";
main.mostCurrent._companyimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 157;BA.debugLine="Private AppTitle As Label";
main.mostCurrent._apptitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 158;BA.debugLine="Private TimeStartCounter As Int = 0";
main._timestartcounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 159;BA.debugLine="Private phone As Phone";
main.mostCurrent._phone = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 161;BA.debugLine="Private butSaveQRCode As Button";
main.mostCurrent._butsaveqrcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 162;BA.debugLine="Private butCancelQRCode As Button";
main.mostCurrent._butcancelqrcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 163;BA.debugLine="Private QRCodeReader As QRCodeReaderView";
main.mostCurrent._qrcodereader = RemoteObject.createNew ("qrcodereaderviewwrapper.qrCodeReaderViewWrapper");
 //BA.debugLineNum = 164;BA.debugLine="Private QRCodePanel As Panel";
main.mostCurrent._qrcodepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 165;BA.debugLine="Private QRCodeKeyReceived As String = \"\"";
main.mostCurrent._qrcodekeyreceived = BA.ObjectToString("");
 //BA.debugLineNum = 166;BA.debugLine="Private getQRCode As Button";
main.mostCurrent._getqrcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 167;BA.debugLine="Private LiteUpdateTagCodes As String";
main.mostCurrent._liteupdatetagcodes = RemoteObject.createImmutable("");
 //BA.debugLineNum = 168;BA.debugLine="Private LoginUpdateFileName As String";
main.mostCurrent._loginupdatefilename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 170;BA.debugLine="Private LabelControloAcesso As Label";
main.mostCurrent._labelcontroloacesso = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 171;BA.debugLine="Private LabelNomeUtilizador As Label";
main.mostCurrent._labelnomeutilizador = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 172;BA.debugLine="Private LabelPasswordUtilizador As Label";
main.mostCurrent._labelpasswordutilizador = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 173;BA.debugLine="Private LabelTituloCredenciais As Label";
main.mostCurrent._labeltitulocredenciais = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 174;BA.debugLine="Private LabelWelcomeWarning As Label";
main.mostCurrent._labelwelcomewarning = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 175;BA.debugLine="Private LabelWelcomeEvolutionCheck As Label";
main.mostCurrent._labelwelcomeevolutioncheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 176;BA.debugLine="Private LabelHelpAutorizacao As Label 'Introduza";
main.mostCurrent._labelhelpautorizacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 177;BA.debugLine="Private LabelAutorizacao As Label 'Autorização da";
main.mostCurrent._labelautorizacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 178;BA.debugLine="Private LabelCodigoInstancia As Label 'Código da";
main.mostCurrent._labelcodigoinstancia = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 179;BA.debugLine="Private LabelCodigoAutorizacao As Label 'Código d";
main.mostCurrent._labelcodigoautorizacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 180;BA.debugLine="Private LabelValidacaoLogin As Label 'Aguarde por";
main.mostCurrent._labelvalidacaologin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 181;BA.debugLine="Private LabelValidacaoAcesso As Label 'Validação";
main.mostCurrent._labelvalidacaoacesso = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 182;BA.debugLine="Private LabelCheckValidacao As Label 'Aguarde por";
main.mostCurrent._labelcheckvalidacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 183;BA.debugLine="Private LabelVerificacao As Label 'Verificação";
main.mostCurrent._labelverificacao = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 184;BA.debugLine="Private PanelDownloadInicial As Panel";
main.mostCurrent._paneldownloadinicial = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 185;BA.debugLine="Private LabelDownloadInicialTitle As Label";
main.mostCurrent._labeldownloadinicialtitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 186;BA.debugLine="Private ProgressoInicial As ProgressBar";
main.mostCurrent._progressoinicial = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 187;BA.debugLine="Private ProgressoInicial2 As ProgressBar";
main.mostCurrent._progressoinicial2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 188;BA.debugLine="Private LabelDownloadInicialFases As Label";
main.mostCurrent._labeldownloadinicialfases = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 189;BA.debugLine="Private LabelTarefa As Label";
main.mostCurrent._labeltarefa = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 194;BA.debugLine="Private newpass1 As EditText";
main.mostCurrent._newpass1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 195;BA.debugLine="Private newpass2 As EditText";
main.mostCurrent._newpass2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 196;BA.debugLine="Private LogoBackEVC As ImageView";
main.mostCurrent._logobackevc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 197;BA.debugLine="Private CurrentOrientation As Int";
main._currentorientation = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gostartapp() throws Exception{
try {
		Debug.PushSubsStack("GoStartApp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,872);
if (RapidSub.canDelegate("gostartapp")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","gostartapp");}
RemoteObject _ambiente = RemoteObject.createImmutable("");
RemoteObject _authdata = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._authorization");
 BA.debugLineNum = 872;BA.debugLine="Sub GoStartApp";
Debug.ShouldStop(128);
 BA.debugLineNum = 886;BA.debugLine="TimeStart.Initialize(\"TimeStart\", 40)";
Debug.ShouldStop(2097152);
main._timestart.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("TimeStart")),(Object)(BA.numberCast(long.class, 40)));
 BA.debugLineNum = 887;BA.debugLine="TimeStart.Enabled = False";
Debug.ShouldStop(4194304);
main._timestart.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 889;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(16777216);
main.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = main.getObject();
 BA.debugLineNum = 891;BA.debugLine="SetWidgetColors";
Debug.ShouldStop(67108864);
_setwidgetcolors();
 BA.debugLineNum = 893;BA.debugLine="AppTitle.Text = Consts.AppTitle";
Debug.ShouldStop(268435456);
main.mostCurrent._apptitle.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._consts._apptitle /*RemoteObject*/ ));
 BA.debugLineNum = 895;BA.debugLine="SelectLanguage.Add(\"Português\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._selectlanguage.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Português")));
 BA.debugLineNum = 896;BA.debugLine="SelectLanguage.SelectedIndex = 0";
Debug.ShouldStop(-2147483648);
main.mostCurrent._selectlanguage.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 898;BA.debugLine="SelectOrientation.Add(\"Orientação Landscape\")";
Debug.ShouldStop(2);
main.mostCurrent._selectorientation.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Orientação Landscape")));
 BA.debugLineNum = 899;BA.debugLine="SelectOrientation.Add(\"Orientação Portrait\")";
Debug.ShouldStop(4);
main.mostCurrent._selectorientation.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Orientação Portrait")));
 BA.debugLineNum = 900;BA.debugLine="SelectOrientation.SelectedIndex = ShareCode.DEVIC";
Debug.ShouldStop(8);
main.mostCurrent._selectorientation.runMethod(true,"setSelectedIndex",main.mostCurrent._sharecode._device_orientation /*RemoteObject*/ );
 BA.debugLineNum = 902;BA.debugLine="GetAuthorizationToUseDeviceResources";
Debug.ShouldStop(32);
_getauthorizationtousedeviceresources();
 BA.debugLineNum = 903;BA.debugLine="Utils.SetProgressDrawableExt(mainSplashProgress,\"";
Debug.ShouldStop(64);
main.mostCurrent._utils.runVoidMethod ("_setprogressdrawableext" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._mainsplashprogress),(Object)(BA.ObjectToString("TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {main.mostCurrent._consts._colorwhite /*RemoteObject*/ ,main.mostCurrent._consts._colorwhite /*RemoteObject*/ })),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 905;BA.debugLine="Dim Ambiente As String = SetBuildInfo";
Debug.ShouldStop(256);
_ambiente = _setbuildinfo();Debug.locals.put("Ambiente", _ambiente);Debug.locals.put("Ambiente", _ambiente);
 BA.debugLineNum = 906;BA.debugLine="SetEnvironment(Ambiente)";
Debug.ShouldStop(512);
_setenvironment(_ambiente);
 BA.debugLineNum = 908;BA.debugLine="Public DeviceAuthorization As String = EditAuthor";
Debug.ShouldStop(2048);
main._deviceauthorization = main.mostCurrent._editauthorization.runMethod(true,"getText");
 BA.debugLineNum = 909;BA.debugLine="Public DeviceInstance As String = EditInstance.te";
Debug.ShouldStop(4096);
main._deviceinstance = main.mostCurrent._editinstance.runMethod(true,"getText");
 BA.debugLineNum = 912;BA.debugLine="Dim authData As Authorization = Types.MakeAuthori";
Debug.ShouldStop(32768);
_authdata = main.mostCurrent._types.runMethod(false,"_makeauthorization" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._editinstance.runMethod(true,"getText")),(Object)(main.mostCurrent._editauthorization.runMethod(true,"getText")),(Object)(main.mostCurrent._sharecode._app_version /*RemoteObject*/ ),(Object)(main.mostCurrent._sharecode._app_domain /*RemoteObject*/ ));Debug.locals.put("authData", _authdata);Debug.locals.put("authData", _authdata);
 BA.debugLineNum = 913;BA.debugLine="getMainLogo(authData)";
Debug.ShouldStop(65536);
_getmainlogo(_authdata);
 BA.debugLineNum = 914;BA.debugLine="getMainLogoMini(authData)";
Debug.ShouldStop(131072);
_getmainlogomini(_authdata);
 BA.debugLineNum = 916;BA.debugLine="SetLogos";
Debug.ShouldStop(524288);
_setlogos();
 BA.debugLineNum = 918;BA.debugLine="Starter.FirstInstall = (ShareCode.APPL_CONFIRMED";
Debug.ShouldStop(2097152);
main.mostCurrent._starter._firstinstall /*RemoteObject*/  = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ,BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._first_install /*RemoteObject*/ ,BA.numberCast(double.class, 0))))));
 BA.debugLineNum = 920;BA.debugLine="EditUserName.Text = ShareCode.APP_LAST_USER '\"use";
Debug.ShouldStop(8388608);
main.mostCurrent._editusername.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._app_last_user /*RemoteObject*/ ));
 BA.debugLineNum = 921;BA.debugLine="EditPassword.Text = \"\" '\"12345678\"";
Debug.ShouldStop(16777216);
main.mostCurrent._editpassword.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 923;BA.debugLine="StartComsService";
Debug.ShouldStop(67108864);
_startcomsservice();
 BA.debugLineNum = 924;BA.debugLine="ResetPanels";
Debug.ShouldStop(134217728);
_resetpanels();
 BA.debugLineNum = 925;BA.debugLine="SetPanelByInstallationStatus";
Debug.ShouldStop(268435456);
_setpanelbyinstallationstatus();
 BA.debugLineNum = 927;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newgetmac() throws Exception{
try {
		Debug.PushSubsStack("newGetMAC (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,3302);
if (RapidSub.canDelegate("newgetmac")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","newgetmac");}
RemoteObject _nativeme = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _s = RemoteObject.createImmutable("");
 BA.debugLineNum = 3302;BA.debugLine="Sub newGetMAC As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 3303;BA.debugLine="Private NativeMe As JavaObject";
Debug.ShouldStop(64);
_nativeme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("NativeMe", _nativeme);
 BA.debugLineNum = 3304;BA.debugLine="NativeMe.InitializeContext";
Debug.ShouldStop(128);
_nativeme.runVoidMethod ("InitializeContext",main.processBA);
 BA.debugLineNum = 3305;BA.debugLine="Dim s As String = NativeMe.RunMethod(\"getMacAddr\"";
Debug.ShouldStop(256);
_s = BA.ObjectToString(_nativeme.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getMacAddr")),(Object)((main.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 3306;BA.debugLine="Return s";
Debug.ShouldStop(512);
if (true) return _s;
 BA.debugLineNum = 3307;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prc_loginclose() throws Exception{
try {
		Debug.PushSubsStack("prc_LoginClose (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2496);
if (RapidSub.canDelegate("prc_loginclose")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","prc_loginclose");}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 2496;BA.debugLine="Sub prc_LoginClose";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2498;BA.debugLine="If Not(Utils.DBDataExists(Starter.LocalSQLWRK, $\"";
Debug.ShouldStop(2);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._utils.runMethod(true,"_dbdataexists" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable("select * from loc_userssession where session='"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._starter._localsessioncode /*RemoteObject*/ ))),RemoteObject.createImmutable("' and username='"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ))),RemoteObject.createImmutable("'"))))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2499;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2500;BA.debugLine="params.Initialize";
Debug.ShouldStop(8);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2501;BA.debugLine="params.Put(\"session\", Starter.LocalSessionCode)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("session"))),(Object)((main.mostCurrent._starter._localsessioncode /*RemoteObject*/ )));
 BA.debugLineNum = 2502;BA.debugLine="params.Put(\"username\", ShareCode.SESS_UWDUKEY)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((main.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ )));
 BA.debugLineNum = 2503;BA.debugLine="params.Put(\"tagcode\", ShareCode.SESS_User)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((main.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2504;BA.debugLine="params.Put(\"name\", ShareCode.SESS_UserName)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((main.mostCurrent._sharecode._sess_username /*RemoteObject*/ )));
 BA.debugLineNum = 2505;BA.debugLine="params.Put(\"active\", 1)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2506;BA.debugLine="params.Put(\"login\", 1)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("login"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2507;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(1024);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2508;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(2048);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2509;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(4096);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 2510;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"loc_use";
Debug.ShouldStop(8192);
main.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("loc_userssession")),(Object)(_insertlist));
 };
 BA.debugLineNum = 2512;BA.debugLine="If Not(isFirstInstall) Then";
Debug.ShouldStop(32768);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(main._isfirstinstall)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2513;BA.debugLine="mainFirstInstall.visible = True";
Debug.ShouldStop(65536);
main.mostCurrent._mainfirstinstall.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2514;BA.debugLine="mainFirstInstall.Text = \"A iniciar a aplicação.";
Debug.ShouldStop(131072);
main.mostCurrent._mainfirstinstall.runMethod(true,"setText",BA.ObjectToCharSequence("A iniciar a aplicação. Aguarde por favor."));
 };
 BA.debugLineNum = 2517;BA.debugLine="Log(\"*************************  START UPDATE_SERV";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6112394261",RemoteObject.createImmutable("*************************  START UPDATE_SERVICE  ************************"),0);
 BA.debugLineNum = 2528;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"LAST_U";
Debug.ShouldStop(-2147483648);
main.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("LAST_USER")),(Object)(main.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ));
 BA.debugLineNum = 2529;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"LAST_A";
Debug.ShouldStop(1);
main.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("LAST_ACCESS")),(Object)(main.mostCurrent._utils.runMethod(true,"_getcurrdatetimet" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("T")))));
 BA.debugLineNum = 2530;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(2);
main.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 2533;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"AppStat";
Debug.ShouldStop(16);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("AppState.txt"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2534;BA.debugLine="File.Copy(Starter.InternalFolder, \"AppState.set\"";
Debug.ShouldStop(32);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("AppState.set")),(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("AppState.txt")));
 };
 BA.debugLineNum = 2557;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _prc_savetojson(RemoteObject _authdata) throws Exception{
try {
		Debug.PushSubsStack("prc_SaveToJSON (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1866);
if (RapidSub.canDelegate("prc_savetojson")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","prc_savetojson", _authdata); return;}
ResumableSub_prc_SaveToJSON rsub = new ResumableSub_prc_SaveToJSON(null,_authdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_prc_SaveToJSON extends BA.ResumableSub {
public ResumableSub_prc_SaveToJSON(xevolution.vrcg.devdemov2400.main parent,RemoteObject _authdata) {
this.parent = parent;
this._authdata = _authdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _authdata;
RemoteObject _mapping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _condition = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _jobmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _host = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("prc_SaveToJSON (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1866);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("authData", _authdata);
 BA.debugLineNum = 1867;BA.debugLine="Dim Mapping As Map";
Debug.ShouldStop(1024);
_mapping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Mapping", _mapping);
 BA.debugLineNum = 1868;BA.debugLine="Mapping.Initialize";
Debug.ShouldStop(2048);
_mapping.runVoidMethod ("Initialize");
 BA.debugLineNum = 1869;BA.debugLine="Mapping.Put(\"instance\", authData.Instance)";
Debug.ShouldStop(4096);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("instance"))),(Object)((_authdata.getField(true,"Instance" /*RemoteObject*/ ))));
 BA.debugLineNum = 1870;BA.debugLine="Mapping.Put(\"authorization\", authData.Authorizati";
Debug.ShouldStop(8192);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((_authdata.getField(true,"Authorization" /*RemoteObject*/ ))));
 BA.debugLineNum = 1871;BA.debugLine="Mapping.Put(\"version\", authData.Version)";
Debug.ShouldStop(16384);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((_authdata.getField(true,"Version" /*RemoteObject*/ ))));
 BA.debugLineNum = 1872;BA.debugLine="Mapping.Put(\"versionid\", authData.Version)";
Debug.ShouldStop(32768);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionid"))),(Object)((_authdata.getField(true,"Version" /*RemoteObject*/ ))));
 BA.debugLineNum = 1873;BA.debugLine="Mapping.Put(\"confirmed\", ShareCode.APPL_CONFIRMED";
Debug.ShouldStop(65536);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("confirmed"))),(Object)((parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ )));
 BA.debugLineNum = 1874;BA.debugLine="Mapping.Put(\"token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(131072);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1875;BA.debugLine="Mapping.Put(\"orientation\", ShareCode.DEVICE_ORIEN";
Debug.ShouldStop(262144);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orientation"))),(Object)((parent.mostCurrent._sharecode._device_orientation /*RemoteObject*/ )));
 BA.debugLineNum = 1876;BA.debugLine="Mapping.Put(\"subdomain\", authData.SubDomain)";
Debug.ShouldStop(524288);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("subdomain"))),(Object)((_authdata.getField(true,"SubDomain" /*RemoteObject*/ ))));
 BA.debugLineNum = 1878;BA.debugLine="Dim Condition As Map";
Debug.ShouldStop(2097152);
_condition = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 1879;BA.debugLine="Condition.Initialize";
Debug.ShouldStop(4194304);
_condition.runVoidMethod ("Initialize");
 BA.debugLineNum = 1880;BA.debugLine="Condition.Put(\"id\", 1)";
Debug.ShouldStop(8388608);
_condition.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1882;BA.debugLine="If (DBStructures.getConfigValuesExists) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if ((parent.mostCurrent._dbstructures.runMethod(true,"_getconfigvaluesexists" /*RemoteObject*/ ,main.mostCurrent.activityBA)).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1883;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLWRK,";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("config")),(Object)(_mapping),(Object)(_condition),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1885;BA.debugLine="Mapping.Put(\"id\", 1)";
Debug.ShouldStop(268435456);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1886;BA.debugLine="Dim lstMap As List";
Debug.ShouldStop(536870912);
_lstmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstMap", _lstmap);
 BA.debugLineNum = 1887;BA.debugLine="lstMap.Initialize";
Debug.ShouldStop(1073741824);
_lstmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 1888;BA.debugLine="lstMap.Add(Mapping)";
Debug.ShouldStop(-2147483648);
_lstmap.runVoidMethod ("Add",(Object)((_mapping.getObject())));
 BA.debugLineNum = 1889;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"config\"";
Debug.ShouldStop(1);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("config")),(Object)(_lstmap));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1892;BA.debugLine="ShareCode.APP_Instance = authData.Instance";
Debug.ShouldStop(8);
parent.mostCurrent._sharecode._app_instance /*RemoteObject*/  = _authdata.getField(true,"Instance" /*RemoteObject*/ );
 BA.debugLineNum = 1893;BA.debugLine="ShareCode.APP_Authorization = authData.Authorizat";
Debug.ShouldStop(16);
parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/  = _authdata.getField(true,"Authorization" /*RemoteObject*/ );
 BA.debugLineNum = 1895;BA.debugLine="Dim lst As List = Utils.ListOfPairs( Array As Str";
Debug.ShouldStop(64);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = parent.mostCurrent._utils.runMethod(false,"_listofpairs" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {(RemoteObject.concat(RemoteObject.createImmutable("instance=>"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_authdata.getField(true,"Instance" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),(RemoteObject.concat(RemoteObject.createImmutable("authorization=>"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_authdata.getField(true,"Authorization" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))})),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1896;BA.debugLine="Dim Job As HttpJob = Utils.CallJobAPI(ShareCode.A";
Debug.ShouldStop(128);
_job = parent.mostCurrent._utils.runMethod(false,"_calljobapi" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_registerdevice /*RemoteObject*/ ),(Object)(_lst),(Object)(main.getObject()),(Object)(RemoteObject.createImmutable("AuthRegister")));Debug.locals.put("Job", _job);Debug.locals.put("Job", _job);
 BA.debugLineNum = 1897;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "prc_savetojson"), (_job));
this.state = 33;
return;
case 33:
//C
this.state = 7;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1898;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(512);
if (true) break;

case 7:
//if
this.state = 22;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 21;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1900;BA.debugLine="Dim JobMap As Map = Utils.JobAPIMAP(Job)";
Debug.ShouldStop(2048);
_jobmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_jobmap = parent.mostCurrent._utils.runMethod(false,"_jobapimap" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_job));Debug.locals.put("JobMap", _jobmap);Debug.locals.put("JobMap", _jobmap);
 BA.debugLineNum = 1901;BA.debugLine="Dim Status As Int = JobMap.Get(\"status\")";
Debug.ShouldStop(4096);
_status = BA.numberCast(int.class, _jobmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 1902;BA.debugLine="If Status = 1 Then";
Debug.ShouldStop(8192);
if (true) break;

case 10:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1))) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1903;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"APP";
Debug.ShouldStop(16384);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_CONFIRMED")),(Object)(parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ));
 BA.debugLineNum = 1904;BA.debugLine="Dim Host As String = JobMap.Get(\"host\")";
Debug.ShouldStop(32768);
_host = BA.ObjectToString(_jobmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("host")))));Debug.locals.put("Host", _host);Debug.locals.put("Host", _host);
 BA.debugLineNum = 1907;BA.debugLine="If Not(ShareCode.APPL_HOST = Host) Then";
Debug.ShouldStop(262144);
if (true) break;

case 13:
//if
this.state = 16;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ,_host)))).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1908;BA.debugLine="ShareCode.APPL_HOST = Host";
Debug.ShouldStop(524288);
parent.mostCurrent._sharecode._appl_host /*RemoteObject*/  = _host;
 BA.debugLineNum = 1909;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP";
Debug.ShouldStop(1048576);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_HOST")),(Object)(_host));
 if (true) break;

case 16:
//C
this.state = 19;
;
 BA.debugLineNum = 1912;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(8388608);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1914;BA.debugLine="WaitToConfirm = True";
Debug.ShouldStop(33554432);
parent._waittoconfirm = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1915;BA.debugLine="ShareCode.APPL_CONFIRMED = 0";
Debug.ShouldStop(67108864);
parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/  = BA.numberCast(int.class, 0);
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1918;BA.debugLine="WaitToConfirm = True";
Debug.ShouldStop(536870912);
parent._waittoconfirm = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1919;BA.debugLine="ShareCode.APPL_CONFIRMED = 0";
Debug.ShouldStop(1073741824);
parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/  = BA.numberCast(int.class, 0);
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 1921;BA.debugLine="Job.Release";
Debug.ShouldStop(1);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1923;BA.debugLine="If (WaitToConfirm) And (ShareCode.APPL_CONFIRMED";
Debug.ShouldStop(4);
if (true) break;

case 23:
//if
this.state = 32;
if (RemoteObject.solveBoolean(".",(parent._waittoconfirm)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ,BA.numberCast(double.class, 0)))))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1924;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AuthorizationDa";
Debug.ShouldStop(8);
_i = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_registerederror /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_try /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancelexit /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1926;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(32);
if (true) break;

case 26:
//if
this.state = 31;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 1927;BA.debugLine="ResetPanels";
Debug.ShouldStop(64);
_resetpanels();
 BA.debugLineNum = 1928;BA.debugLine="Panel_Login.Visible = False";
Debug.ShouldStop(128);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1929;BA.debugLine="Panel_Authorization.Visible = True";
Debug.ShouldStop(256);
parent.mostCurrent._panel_authorization.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1930;BA.debugLine="Starter.CurrentFlowPosition = 1";
Debug.ShouldStop(512);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 1932;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"APP";
Debug.ShouldStop(2048);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_CONFIRMED")),(Object)(parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ));
 BA.debugLineNum = 1933;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1935;BA.debugLine="ActivityFinish";
Debug.ShouldStop(16384);
_activityfinish();
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 1938;BA.debugLine="mainFirstInstall.visible = True";
Debug.ShouldStop(131072);
parent.mostCurrent._mainfirstinstall.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1939;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
comms_subs_0._process_globals();
utils_subs_0._process_globals();
dbstructures_subs_0._process_globals();
sharecode_subs_0._process_globals();
mainmenu_subs_0._process_globals();
imageedit_subs_0._process_globals();
checklist3_subs_0._process_globals();
locationservice_subs_0._process_globals();
dataupdate_subs_0._process_globals();
alerts_subs_0._process_globals();
backgroundupdateservice_subs_0._process_globals();
barcodescanner_subs_0._process_globals();
cameraactivity_subs_0._process_globals();
cameraactivity_innershot_subs_0._process_globals();
cameraactivity2_subs_0._process_globals();
checklistnew_subs_0._process_globals();
common_subs_0._process_globals();
consts_subs_0._process_globals();
dbutils_subs_0._process_globals();
helpdescriptors_subs_0._process_globals();
logs_subs_0._process_globals();
mapsactivity_subs_0._process_globals();
newsync_subs_0._process_globals();
notas_subs_0._process_globals();
objectedit_subs_0._process_globals();
objects_subs_0._process_globals();
report_subs_0._process_globals();
reportview_subs_0._process_globals();
requests3_subs_0._process_globals();
signaturecapture_subs_0._process_globals();
structures_subs_0._process_globals();
taskscl2_subs_0._process_globals();
types_subs_0._process_globals();
updateservice_subs_0._process_globals();
user_subs_0._process_globals();
userservice_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.main");
starter.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.starter");
comms.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.comms");
utils.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.utils");
dbstructures.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.dbstructures");
sharecode.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.sharecode");
mainmenu.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.mainmenu");
imageedit.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.imageedit");
checklist3.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.checklist3");
locationservice.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.locationservice");
dataupdate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.dataupdate");
alerts.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.alerts");
anotherdatepicker.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.anotherdatepicker");
api.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.api");
appactiondialogs.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.appactiondialogs");
appdialogs.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.appdialogs");
appfirstinstalldialog.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.appfirstinstalldialog");
b4xcombobox2.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xcombobox2");
b4xeval.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xeval");
b4xlistpanel.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xlistpanel");
b4xrulerpicker.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xrulerpicker");
b4xstatebutton.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xstatebutton");
backgroundupdateservice.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.backgroundupdateservice");
badger.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.badger");
barcodescanner.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.barcodescanner");
cameraactivity.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.cameraactivity");
cameraactivity_innershot.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.cameraactivity_innershot");
cameraactivity2.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.cameraactivity2");
cameraexclass.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.cameraexclass");
checklistnew.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.checklistnew");
colorwheeldialog.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.colorwheeldialog");
common.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.common");
configparameters.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.configparameters");
consts.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.consts");
customlistviewcollapse.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.customlistviewcollapse");
databaseutils.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.databaseutils");
dbutils.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.dbutils");
dialogitemactions.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.dialogitemactions");
expandedlistview.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.expandedlistview");
fileprovider.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.fileprovider");
force_gc.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.force_gc");
helpdescriptors.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.helpdescriptors");
logs.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.logs");
mapsactivity.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.mapsactivity");
monthviewcalendar.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.monthviewcalendar");
newsync.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.newsync");
notas.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.notas");
objectedit.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.objectedit");
objects.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.objects");
report.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.report");
reportview.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.reportview");
requests3.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.requests3");
signaturecapture.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.signaturecapture");
structalerts.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.structalerts");
structchecklist.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.structchecklist");
structchecklistitems.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.structchecklistitems");
structobjects.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.structobjects");
structures.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.structures");
tabstripviewpagerextendet.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.tabstripviewpagerextendet");
taskscl2.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.taskscl2");
tinifile.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.tinifile");
types.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.types");
updateservice.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.updateservice");
user.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.user");
userservice.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.userservice");
httputils2service.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.httputils2service");
httpjob.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.httpjob");
animatedcounter.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xplusminus");
b4xsearchtemplate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("xevolution.vrcg.devdemov2400.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 82;BA.debugLine="Private TimeStart As Timer";
main._timestart = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 83;BA.debugLine="Public AppStarted As Boolean";
main._appstarted = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 84;BA.debugLine="Public mainShowDialogResult As Int = 0";
main._mainshowdialogresult = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 85;BA.debugLine="Public Started As Boolean = False";
main._started = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 86;BA.debugLine="Public WaitToConfirm As Boolean = False";
main._waittoconfirm = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 87;BA.debugLine="Public isLoginDone As Boolean = False";
main._islogindone = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 88;BA.debugLine="Public isMainScreen As Boolean = False";
main._ismainscreen = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 89;BA.debugLine="Public Device As Phone";
main._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 91;BA.debugLine="Public AppBuildVersion As String = \"2.4.29\"";
main._appbuildversion = BA.ObjectToString("2.4.29");
 //BA.debugLineNum = 92;BA.debugLine="Public AppBuildVersionDate As String = \"2021-02-2";
main._appbuildversiondate = BA.ObjectToString("2021-02-25");
 //BA.debugLineNum = 93;BA.debugLine="Public VersionTagcode As String = \"VERSION_2429\"";
main._versiontagcode = BA.ObjectToString("VERSION_2429");
 //BA.debugLineNum = 94;BA.debugLine="Public keepal As Boolean = True";
main._keepal = main.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 95;BA.debugLine="Public DB_Size As Long = 0";
main._db_size = BA.numberCast(long.class, 0);
 //BA.debugLineNum = 96;BA.debugLine="Public CurrentBuild As String = \"\"";
main._currentbuild = BA.ObjectToString("");
 //BA.debugLineNum = 102;BA.debugLine="Public DeviceBrand As String = \"\"";
main._devicebrand = BA.ObjectToString("");
 //BA.debugLineNum = 103;BA.debugLine="Public DeviceModel As String = \"\"";
main._devicemodel = BA.ObjectToString("");
 //BA.debugLineNum = 104;BA.debugLine="Public DeviceMacAddress As String = \"\"";
main._devicemacaddress = BA.ObjectToString("");
 //BA.debugLineNum = 105;BA.debugLine="Public DeviceAuthorization As String = \"\"";
main._deviceauthorization = BA.ObjectToString("");
 //BA.debugLineNum = 106;BA.debugLine="Public DeviceInstance As String = \"\"";
main._deviceinstance = BA.ObjectToString("");
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _qrcodereader_result_found(RemoteObject _retval) throws Exception{
try {
		Debug.PushSubsStack("QRCodeReader_result_found (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2559);
if (RapidSub.canDelegate("qrcodereader_result_found")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","qrcodereader_result_found", _retval);}
Debug.locals.put("retval", _retval);
 BA.debugLineNum = 2559;BA.debugLine="Sub QRCodeReader_result_found(retval As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 2560;BA.debugLine="QRCodeKeyReceived = retval";
Debug.ShouldStop(-2147483648);
main.mostCurrent._qrcodekeyreceived = _retval;
 BA.debugLineNum = 2561;BA.debugLine="butSaveQRCode.Enabled = True";
Debug.ShouldStop(1);
main.mostCurrent._butsaveqrcode.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2562;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_first_install_info(RemoteObject _first_install_info,RemoteObject _testejson) throws Exception{
try {
		Debug.PushSubsStack("Read_FIRST_INSTALL_INFO (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2707);
if (RapidSub.canDelegate("read_first_install_info")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","read_first_install_info", _first_install_info, _testejson);}
RemoteObject _jsonstruct = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datahora = RemoteObject.createImmutable("");
RemoteObject _sqlfilestotal = RemoteObject.createImmutable(0);
RemoteObject _inserts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("FIRST_INSTALL_INFO", _first_install_info);
Debug.locals.put("TesteJson", _testejson);
 BA.debugLineNum = 2707;BA.debugLine="Sub Read_FIRST_INSTALL_INFO(FIRST_INSTALL_INFO As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2708;BA.debugLine="If TesteJson.Contains(\"{\") Then";
Debug.ShouldStop(524288);
if (_testejson.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("{"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2709;BA.debugLine="Dim JsonStruct As String = File.readstring(Start";
Debug.ShouldStop(1048576);
_jsonstruct = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 2710;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2097152);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2711;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(4194304);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 2712;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8388608);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2713;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
Debug.ShouldStop(16777216);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 2714;BA.debugLine="File.writeString(Starter.SharedFolder,$\"date_ins";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))),(Object)(_datahora));
 BA.debugLineNum = 2715;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Shar";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log")))),(Object)(_datahora));
 BA.debugLineNum = 2716;BA.debugLine="Dim SqlFilesTotal As Int = root.Get(\"files\")";
Debug.ShouldStop(134217728);
_sqlfilestotal = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("SqlFilesTotal", _sqlfilestotal);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2717;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(268435456);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 2718;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(536870912);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2719;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(1073741824);
main.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2720;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_date));
 }else {
 BA.debugLineNum = 2722;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(2);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2723;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedFol";
Debug.ShouldStop(4);
_list1 = main.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2724;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de ficheir";
Debug.ShouldStop(8);
_sqlfilestotal = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2725;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(16);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2726;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(32);
main.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2727;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(64);
main.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_date));
 };
 BA.debugLineNum = 2729;BA.debugLine="Return SqlFilesTotal";
Debug.ShouldStop(256);
if (true) return _sqlfilestotal;
 BA.debugLineNum = 2730;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_first_install_info_list(RemoteObject _first_install_info) throws Exception{
try {
		Debug.PushSubsStack("Read_FIRST_INSTALL_INFO_List (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2732);
if (RapidSub.canDelegate("read_first_install_info_list")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","read_first_install_info_list", _first_install_info);}
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sqlfilestotal = RemoteObject.createImmutable(0);
RemoteObject _date = RemoteObject.createImmutable("");
Debug.locals.put("FIRST_INSTALL_INFO", _first_install_info);
 BA.debugLineNum = 2732;BA.debugLine="Sub Read_FIRST_INSTALL_INFO_List(FIRST_INSTALL_INF";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2733;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(4096);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2734;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedFold";
Debug.ShouldStop(8192);
_list1 = main.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2735;BA.debugLine="Dim SqlFilesTotal As Int = List1.Get(0) ' Numero";
Debug.ShouldStop(16384);
_sqlfilestotal = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("SqlFilesTotal", _sqlfilestotal);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2736;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(32768);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2737;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(65536);
main.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2738;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(131072);
main.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2740;BA.debugLine="Return SqlFilesTotal";
Debug.ShouldStop(524288);
if (true) return _sqlfilestotal;
 BA.debugLineNum = 2741;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readandexecutesqlfiles(RemoteObject _sqlfilestotal,RemoteObject _firstinstallfilesname) throws Exception{
try {
		Debug.PushSubsStack("ReadAndExecuteSQLFiles (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2808);
if (RapidSub.canDelegate("readandexecutesqlfiles")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","readandexecutesqlfiles", _sqlfilestotal, _firstinstallfilesname);}
ResumableSub_ReadAndExecuteSQLFiles rsub = new ResumableSub_ReadAndExecuteSQLFiles(null,_sqlfilestotal,_firstinstallfilesname);
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
public static class ResumableSub_ReadAndExecuteSQLFiles extends BA.ResumableSub {
public ResumableSub_ReadAndExecuteSQLFiles(xevolution.vrcg.devdemov2400.main parent,RemoteObject _sqlfilestotal,RemoteObject _firstinstallfilesname) {
this.parent = parent;
this._sqlfilestotal = _sqlfilestotal;
this._firstinstallfilesname = _firstinstallfilesname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _sqlfilestotal;
RemoteObject _firstinstallfilesname;
int _i = 0;
RemoteObject _totallinesofscripts = RemoteObject.createImmutable(0);
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _script2execute = RemoteObject.createImmutable("");
int step1;
int limit1;
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadAndExecuteSQLFiles (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2808);
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
Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
Debug.locals.put("firstInstallFilesName", _firstinstallfilesname);
 BA.debugLineNum = 2809;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//for
this.state = 19;
step1 = 1;
limit1 = _sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 20;
if (true) break;

case 20:
//C
this.state = 19;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 21:
//C
this.state = 20;
_i = ((int)(0 + _i + step1)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2810;BA.debugLine="Dim TotalLinesOfScripts As Int = 0";
Debug.ShouldStop(33554432);
_totallinesofscripts = BA.numberCast(int.class, 0);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 BA.debugLineNum = 2811;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUp";
Debug.ShouldStop(67108864);
parent.mostCurrent._labeldownloadinicialfases.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2812;BA.debugLine="Dim fileN As String = $\"${firstInstallFilesName}";
Debug.ShouldStop(134217728);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_firstinstallfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 2814;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(536870912);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2816;BA.debugLine="If (List1.IsInitialized) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 9;
if ((_list1.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 2817;BA.debugLine="List1.Clear";
Debug.ShouldStop(1);
_list1.runVoidMethod ("Clear");
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2819;BA.debugLine="List1.Initialize";
Debug.ShouldStop(4);
_list1.runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 2822;BA.debugLine="Try";
Debug.ShouldStop(32);

case 9:
//try
this.state = 14;
this.catchState = 13;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 14;
this.catchState = 13;
 BA.debugLineNum = 2823;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedFo";
Debug.ShouldStop(64);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2824;BA.debugLine="TotalLinesOfScripts = List1.Size";
Debug.ShouldStop(128);
_totallinesofscripts = _list1.runMethod(true,"getSize");Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 2826;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6113377298",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2827;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
;
 BA.debugLineNum = 2830;BA.debugLine="UpdateProgressBar2(100,0)";
Debug.ShouldStop(8192);
_updateprogressbar2(BA.numberCast(long.class, 100),BA.numberCast(long.class, 0));
 BA.debugLineNum = 2831;BA.debugLine="ProgressoInicial2.visible = True";
Debug.ShouldStop(16384);
parent.mostCurrent._progressoinicial2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2832;BA.debugLine="LabelTarefa.Visible = True";
Debug.ShouldStop(32768);
parent.mostCurrent._labeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2834;BA.debugLine="For n = 0 To List1.Size -1";
Debug.ShouldStop(131072);
if (true) break;

case 15:
//for
this.state = 18;
step21 = 1;
limit21 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 22;
if (true) break;

case 22:
//C
this.state = 18;
if ((step21 > 0 && _n <= limit21) || (step21 < 0 && _n >= limit21)) this.state = 17;
if (true) break;

case 23:
//C
this.state = 22;
_n = ((int)(0 + _n + step21)) ;
Debug.locals.put("n", _n);
if (true) break;

case 17:
//C
this.state = 23;
 BA.debugLineNum = 2835;BA.debugLine="LabelTarefa.Text = ShareCode.MsgExecProcAct & $";
Debug.ShouldStop(262144);
parent.mostCurrent._labeltarefa.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgexecprocact /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totallinesofscripts))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2836;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
Debug.ShouldStop(524288);
_script2execute = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("Script2Execute", _script2execute);Debug.locals.put("Script2Execute", _script2execute);
 BA.debugLineNum = 2837;BA.debugLine="Utils.SaveSQLToLog(\"Main\",Script2Execute, \"\")";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(_script2execute),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2838;BA.debugLine="UpdateProgressBar2(TotalLinesOfScripts,n)";
Debug.ShouldStop(2097152);
_updateprogressbar2(BA.numberCast(long.class, _totallinesofscripts),BA.numberCast(long.class, _n));
 BA.debugLineNum = 2839;BA.debugLine="Sleep(1)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "readandexecutesqlfiles"),BA.numberCast(int.class, 1));
this.state = 24;
return;
case 24:
//C
this.state = 23;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2842;BA.debugLine="ProgressoInicial2.visible = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._progressoinicial2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2843;BA.debugLine="LabelTarefa.Visible = False";
Debug.ShouldStop(67108864);
parent.mostCurrent._labeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2844;BA.debugLine="UpdateProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(134217728);
_updateprogressbar(BA.numberCast(long.class, _sqlfilestotal),BA.numberCast(long.class, _i));
 BA.debugLineNum = 2845;BA.debugLine="Sleep(1)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "readandexecutesqlfiles"),BA.numberCast(int.class, 1));
this.state = 25;
return;
case 25:
//C
this.state = 21;
;
 if (true) break;
if (true) break;

case 19:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2848;BA.debugLine="Return Null";
Debug.ShouldStop(-2147483648);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.mostCurrent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 2849;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static RemoteObject  _removealllocalinfoandsqlfiles() throws Exception{
try {
		Debug.PushSubsStack("RemoveAllLocalInfoAndSqlFiles (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2598);
if (RapidSub.canDelegate("removealllocalinfoandsqlfiles")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","removealllocalinfoandsqlfiles");}
ResumableSub_RemoveAllLocalInfoAndSqlFiles rsub = new ResumableSub_RemoveAllLocalInfoAndSqlFiles(null);
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
public static class ResumableSub_RemoveAllLocalInfoAndSqlFiles extends BA.ResumableSub {
public ResumableSub_RemoveAllLocalInfoAndSqlFiles(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _locares = RemoteObject.createImmutable(false);
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject group4;
int index4;
int groupLen4;
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RemoveAllLocalInfoAndSqlFiles (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2598);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 2600;BA.debugLine="Dim LocaRes As Boolean = False";
Debug.ShouldStop(128);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);Debug.locals.put("LocaRes", _locares);
 BA.debugLineNum = 2601;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "removealllocalinfoandsqlfiles"), parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",main.processBA,(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ ))));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 2602;BA.debugLine="If Success Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 14;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2603;BA.debugLine="For Each F As String In Files";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//for
this.state = 11;
group4 = _files;
index4 = 0;
groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("F", _f);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 11;
if (index4 < groupLen4) {
this.state = 6;
_f = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("F", _f);}
if (true) break;

case 31:
//C
this.state = 30;
index4++;
Debug.locals.put("F", _f);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2604;BA.debugLine="If F.ToLowerCase.EndsWith(\".info\") And Not(F.To";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",_f.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".info")))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_f.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("firstinstall"))))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2605;BA.debugLine="File.Delete(Starter.SharedFolder,F)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_f));
 if (true) break;

case 10:
//C
this.state = 31;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("F", _f);
;
 BA.debugLineNum = 2608;BA.debugLine="LocaRes = True";
Debug.ShouldStop(32768);
_locares = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2610;BA.debugLine="LocaRes = False";
Debug.ShouldStop(131072);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 2613;BA.debugLine="Wait For (File.ListFilesAsync(Starter.SharedFolde";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "removealllocalinfoandsqlfiles"), parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",main.processBA,(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ )));
this.state = 32;
return;
case 32:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 2614;BA.debugLine="If Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 15:
//if
this.state = 28;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 27;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2615;BA.debugLine="For Each F As String In Files";
Debug.ShouldStop(4194304);
if (true) break;

case 18:
//for
this.state = 25;
group15 = _files;
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("F", _f);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 25;
if (index15 < groupLen15) {
this.state = 20;
_f = BA.ObjectToString(group15.runMethod(false,"Get",index15));Debug.locals.put("F", _f);}
if (true) break;

case 34:
//C
this.state = 33;
index15++;
Debug.locals.put("F", _f);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2616;BA.debugLine="If F.ToLowerCase.EndsWith(\".sql\") And Not(F.ToL";
Debug.ShouldStop(8388608);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean(".",_f.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".sql")))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_f.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("firstinstall"))))))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2617;BA.debugLine="File.Delete(Starter.SharedFolder,F)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_f));
 if (true) break;

case 24:
//C
this.state = 34;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 28;
Debug.locals.put("F", _f);
;
 BA.debugLineNum = 2620;BA.debugLine="LocaRes = True";
Debug.ShouldStop(134217728);
_locares = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2622;BA.debugLine="LocaRes = False";
Debug.ShouldStop(536870912);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 2625;BA.debugLine="Return LocaRes";
Debug.ShouldStop(1);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_locares));return;};
 BA.debugLineNum = 2627;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static RemoteObject  _resetpanels() throws Exception{
try {
		Debug.PushSubsStack("ResetPanels (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1219);
if (RapidSub.canDelegate("resetpanels")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","resetpanels");}
 BA.debugLineNum = 1219;BA.debugLine="Sub ResetPanels";
Debug.ShouldStop(4);
 BA.debugLineNum = 1220;BA.debugLine="Panel_Config.Visible = False";
Debug.ShouldStop(8);
main.mostCurrent._panel_config.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1221;BA.debugLine="Panel_Authorization.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._panel_authorization.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1222;BA.debugLine="Panel_Verification.Visible = False";
Debug.ShouldStop(32);
main.mostCurrent._panel_verification.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1223;BA.debugLine="Panel_Login.Visible = False";
Debug.ShouldStop(64);
main.mostCurrent._panel_login.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1224;BA.debugLine="Panel_Login_Validation.Visible = False";
Debug.ShouldStop(128);
main.mostCurrent._panel_login_validation.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1225;BA.debugLine="PanelDownloadInicial.Visible = False";
Debug.ShouldStop(256);
main.mostCurrent._paneldownloadinicial.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1226;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _restartapp(RemoteObject _newori) throws Exception{
try {
		Debug.PushSubsStack("RestartApp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1347);
if (RapidSub.canDelegate("restartapp")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","restartapp", _newori);}
Debug.locals.put("newOri", _newori);
 BA.debugLineNum = 1347;BA.debugLine="Sub RestartApp(newOri As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 1348;BA.debugLine="mainSplashImageEffect.Visible = False";
Debug.ShouldStop(8);
main.mostCurrent._mainsplashimageeffect.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1349;BA.debugLine="ShareCode.DEVICE_ORIENTATION = newOri";
Debug.ShouldStop(16);
main.mostCurrent._sharecode._device_orientation /*RemoteObject*/  = _newori;
 BA.debugLineNum = 1350;BA.debugLine="Device.SetScreenOrientation(newOri)";
Debug.ShouldStop(32);
main._device.runVoidMethod ("SetScreenOrientation",main.processBA,(Object)(_newori));
 BA.debugLineNum = 1351;BA.debugLine="GoStartApp";
Debug.ShouldStop(64);
_gostartapp();
 BA.debugLineNum = 1352;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendinstallintent(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SendInstallIntent (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1152);
if (RapidSub.canDelegate("sendinstallintent")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","sendinstallintent", _filename);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1152;BA.debugLine="Private Sub SendInstallIntent(FileName As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1153;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(1);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 1154;BA.debugLine="If phone.SdkVersion >= 24 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("g",main.mostCurrent._phone.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 1155;BA.debugLine="i.Initialize(\"android.intent.action.INSTALL_PACK";
Debug.ShouldStop(4);
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.intent.action.INSTALL_PACKAGE")),(Object)(BA.ObjectToString(main.mostCurrent._starter._provider /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename)))));
 BA.debugLineNum = 1156;BA.debugLine="i.Flags = Bit.Or(i.Flags, 1) 'FLAG_GRANT_READ_UR";
Debug.ShouldStop(8);
_i.runMethod(true,"setFlags",main.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_i.runMethod(true,"getFlags")),(Object)(BA.numberCast(int.class, 1))));
 }else {
 BA.debugLineNum = 1158;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"file://\" & File.Com";
Debug.ShouldStop(32);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("file://"),main.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename)))));
 BA.debugLineNum = 1159;BA.debugLine="i.SetType(\"application/vnd.android.package-archi";
Debug.ShouldStop(64);
_i.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/vnd.android.package-archive")));
 };
 BA.debugLineNum = 1162;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6110034954",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1163;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(1024);
main.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 1164;BA.debugLine="StartActivity(i)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((_i.getObject())));
 BA.debugLineNum = 1165;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivitylayout() throws Exception{
try {
		Debug.PushSubsStack("SetActivityLayout (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,289);
if (RapidSub.canDelegate("setactivitylayout")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setactivitylayout");}
 BA.debugLineNum = 289;BA.debugLine="Sub SetActivityLayout";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="If ((ShareCode.APPL_ACCOUNT.ToUpperCase = \"DEMO\")";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toUpperCase"),RemoteObject.createImmutable("DEMO"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toUpperCase"),RemoteObject.createImmutable("AGENTES"))))))) { 
 BA.debugLineNum = 291;BA.debugLine="mainLayout = \"mainlayout_v2_demo\"";
Debug.ShouldStop(4);
main.mostCurrent._mainlayout = BA.ObjectToString("mainlayout_v2_demo");
 }else {
 BA.debugLineNum = 293;BA.debugLine="mainLayout = \"mainlayout_v2\"";
Debug.ShouldStop(16);
main.mostCurrent._mainlayout = BA.ObjectToString("mainlayout_v2");
 };
 BA.debugLineNum = 296;BA.debugLine="Activity.LoadLayout(mainLayout)";
Debug.ShouldStop(128);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(main.mostCurrent._mainlayout),main.mostCurrent.activityBA);
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setauthorization(RemoteObject _authdata) throws Exception{
try {
		Debug.PushSubsStack("SetAuthorization (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1705);
if (RapidSub.canDelegate("setauthorization")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setauthorization", _authdata); return;}
ResumableSub_SetAuthorization rsub = new ResumableSub_SetAuthorization(null,_authdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetAuthorization extends BA.ResumableSub {
public ResumableSub_SetAuthorization(xevolution.vrcg.devdemov2400.main parent,RemoteObject _authdata) {
this.parent = parent;
this._authdata = _authdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _authdata;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");
RemoteObject _resultstr = RemoteObject.createImmutable("");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _active = RemoteObject.createImmutable(0);
RemoteObject _registered = RemoteObject.createImmutable(0);
RemoteObject _activeandnotregistered = RemoteObject.createImmutable(false);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _i = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetAuthorization (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1705);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("authData", _authdata);
 BA.debugLineNum = 1714;BA.debugLine="Dim params As Map = CreateAuthParams(authData.Ins";
Debug.ShouldStop(131072);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_params = _createauthparams(_authdata.getField(true,"Instance" /*RemoteObject*/ ),_authdata.getField(true,"Authorization" /*RemoteObject*/ ),_authdata.getField(true,"Version" /*RemoteObject*/ ));Debug.locals.put("params", _params);Debug.locals.put("params", _params);
 BA.debugLineNum = 1716;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(524288);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1717;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(1048576);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1718;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
Debug.ShouldStop(2097152);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1720;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8388608);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1721;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(16777216);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 1723;BA.debugLine="ShareCode.APP_DOMAIN = \"demo\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._sharecode._app_domain /*RemoteObject*/  = BA.ObjectToString("demo");
 BA.debugLineNum = 1724;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.APP_D";
Debug.ShouldStop(134217728);
parent.mostCurrent._sharecode._app_url /*RemoteObject*/  = RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/"))));
 BA.debugLineNum = 1725;BA.debugLine="Dim addr As String = ShareCode.APP_URL & ShareCod";
Debug.ShouldStop(268435456);
_addr = RemoteObject.concat(parent.mostCurrent._sharecode._app_url /*RemoteObject*/ ,parent.mostCurrent._sharecode._app_confirmlink /*RemoteObject*/ );Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 1727;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607830",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1728;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APP_DOMAIN} \"$)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607831",(RemoteObject.concat(RemoteObject.createImmutable(" 		INITIAL : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 1729;BA.debugLine="Log($\" 		URL : ${ShareCode.APP_URL} \"$)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607832",(RemoteObject.concat(RemoteObject.createImmutable(" 		URL : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_url /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 1730;BA.debugLine="Log($\" 		addr : ${addr} \"$)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607833",(RemoteObject.concat(RemoteObject.createImmutable(" 		addr : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_addr))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 1731;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607834",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1733;BA.debugLine="Job.PostString(addr, data )";
Debug.ShouldStop(16);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_data));
 BA.debugLineNum = 1734;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(32);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1739;BA.debugLine="ShareCode.FirstInstallBD = 0";
Debug.ShouldStop(1024);
parent.mostCurrent._sharecode._firstinstallbd /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1742;BA.debugLine="ShareCode.newreturn = 1";
Debug.ShouldStop(8192);
parent.mostCurrent._sharecode._newreturn /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 1746;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setauthorization"), (_job));
this.state = 49;
return;
case 49:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1748;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 48;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 41;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1749;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607852",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1752;BA.debugLine="Dim ResultStr As String = Job.GetString";
Debug.ShouldStop(8388608);
_resultstr = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("ResultStr", _resultstr);Debug.locals.put("ResultStr", _resultstr);
 BA.debugLineNum = 1753;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\") Th";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv6",(Object)(_resultstr),(Object)(BA.numberCast(long.class, 1))),RemoteObject.createImmutable("[")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1754;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrFun";
Debug.ShouldStop(33554432);
_resultstr = parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvvvvv4",(Object)(parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvv5",(Object)(_resultstr),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv7",(Object)(_resultstr)),RemoteObject.createImmutable(1)}, "-",1, 2))))));Debug.locals.put("ResultStr", _resultstr);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1757;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(268435456);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 1758;BA.debugLine="JSON1.Initialize(ResultStr)";
Debug.ShouldStop(536870912);
_json1.runVoidMethod ("Initialize",(Object)(_resultstr));
 BA.debugLineNum = 1759;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(1073741824);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 1760;BA.debugLine="Dim Active As Int = MapJSON.Get(\"active\")";
Debug.ShouldStop(-2147483648);
_active = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("active")))));Debug.locals.put("Active", _active);Debug.locals.put("Active", _active);
 BA.debugLineNum = 1762;BA.debugLine="Try";
Debug.ShouldStop(2);
if (true) break;

case 8:
//try
this.state = 39;
this.catchState = 38;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 38;
 BA.debugLineNum = 1763;BA.debugLine="If (Active = 1) Then";
Debug.ShouldStop(4);
if (true) break;

case 11:
//if
this.state = 36;
if ((RemoteObject.solveBoolean("=",_active,BA.numberCast(double.class, 1)))) { 
this.state = 13;
}else {
this.state = 35;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1764;BA.debugLine="Dim Registered As Int = MapJSON.Get(\"registere";
Debug.ShouldStop(8);
_registered = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("registered")))));Debug.locals.put("Registered", _registered);Debug.locals.put("Registered", _registered);
 BA.debugLineNum = 1765;BA.debugLine="ShareCode.APP_TOKEN = MapJSON.Get(\"_token\")";
Debug.ShouldStop(16);
parent.mostCurrent._sharecode._app_token /*RemoteObject*/  = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("_token")))));
 BA.debugLineNum = 1766;BA.debugLine="ShareCode.APP_DOMAIN = MapJSON.Get(\"subdomain\"";
Debug.ShouldStop(32);
parent.mostCurrent._sharecode._app_domain /*RemoteObject*/  = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("subdomain")))));
 BA.debugLineNum = 1768;BA.debugLine="If Not(ShareCode.APP_DOMAIN = authData.SubDoma";
Debug.ShouldStop(128);
if (true) break;

case 14:
//if
this.state = 17;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,_authdata.getField(true,"SubDomain" /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1769;BA.debugLine="authData.SubDomain = ShareCode.APP_DOMAIN";
Debug.ShouldStop(256);
_authdata.setField ("SubDomain" /*RemoteObject*/ ,parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ );
 BA.debugLineNum = 1770;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.A";
Debug.ShouldStop(512);
parent.mostCurrent._sharecode._app_url /*RemoteObject*/  = RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/"))));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 1773;BA.debugLine="Log(\"*****************************************";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607876",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1774;BA.debugLine="Log($\" 		REGISTER : ${ShareCode.APP_DOMAIN} \"$";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607877",(RemoteObject.concat(RemoteObject.createImmutable(" 		REGISTER : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 1775;BA.debugLine="Log(\"*****************************************";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607878",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1777;BA.debugLine="Log(ShareCode.APP_TOKEN)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607880",parent.mostCurrent._sharecode._app_token /*RemoteObject*/ ,0);
 BA.debugLineNum = 1779;BA.debugLine="Dim ActiveAndNotRegistered As Boolean = (Activ";
Debug.ShouldStop(262144);
_activeandnotregistered = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_active,BA.numberCast(double.class, 1))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_registered,BA.numberCast(double.class, 0))))));Debug.locals.put("ActiveAndNotRegistered", _activeandnotregistered);Debug.locals.put("ActiveAndNotRegistered", _activeandnotregistered);
 BA.debugLineNum = 1780;BA.debugLine="If ActiveAndNotRegistered Then";
Debug.ShouldStop(524288);
if (true) break;

case 18:
//if
this.state = 33;
if (_activeandnotregistered.<Boolean>get().booleanValue()) { 
this.state = 20;
}else {
this.state = 26;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1782;BA.debugLine="WaitToConfirm = False";
Debug.ShouldStop(2097152);
parent._waittoconfirm = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1784;BA.debugLine="ShareCode.APPL_CONFIRMED = 1";
Debug.ShouldStop(8388608);
parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 1785;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"A";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_CONFIRMED")),(Object)(parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ));
 BA.debugLineNum = 1786;BA.debugLine="ShareCode.APPL_ACCOUNT = ShareCode.APP_DOMAIN";
Debug.ShouldStop(33554432);
parent.mostCurrent._sharecode._appl_account /*RemoteObject*/  = parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ;
 BA.debugLineNum = 1787;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APPL_ACCOUNT")),(Object)(parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ ));
 BA.debugLineNum = 1788;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 1790;BA.debugLine="prc_SaveToJSON(authData)";
Debug.ShouldStop(536870912);
_prc_savetojson(_authdata);
 BA.debugLineNum = 1791;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setauthorization"),BA.numberCast(int.class, 200));
this.state = 50;
return;
case 50:
//C
this.state = 21;
;
 BA.debugLineNum = 1792;BA.debugLine="getMainLogo(authData)";
Debug.ShouldStop(-2147483648);
_getmainlogo(_authdata);
 BA.debugLineNum = 1793;BA.debugLine="getMainLogoMini(authData)";
Debug.ShouldStop(1);
_getmainlogomini(_authdata);
 BA.debugLineNum = 1802;BA.debugLine="ResetPanels";
Debug.ShouldStop(512);
_resetpanels();
 BA.debugLineNum = 1804;BA.debugLine="Dim res As ResumableSub = FirstInstallComplet";
Debug.ShouldStop(2048);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _firstinstallcompleteprocedure();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1805;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setauthorization"), _res);
this.state = 51;
return;
case 51:
//C
this.state = 21;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1807;BA.debugLine="If Not(result)Then";
Debug.ShouldStop(16384);
if (true) break;

case 21:
//if
this.state = 24;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_result)).<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1808;BA.debugLine="MsgboxAsync(ShareCode.AvisoErroComms,ShareCo";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoerrocomms /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 1809;BA.debugLine="Starter.APP_IN_EXECUTION = False";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._app_in_execution /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 24:
//C
this.state = 33;
;
 BA.debugLineNum = 1812;BA.debugLine="ResetPanels";
Debug.ShouldStop(524288);
_resetpanels();
 BA.debugLineNum = 1813;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(1048576);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1814;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(2097152);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 BA.debugLineNum = 1815;BA.debugLine="DBStructures.getConfigApp(ShareCode.APP_TOKEN";
Debug.ShouldStop(4194304);
parent.mostCurrent._dbstructures.runVoidMethod ("_getconfigapp" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_token /*RemoteObject*/ ));
 BA.debugLineNum = 1816;BA.debugLine="Starter.APP_IN_EXECUTION = True";
Debug.ShouldStop(8388608);
parent.mostCurrent._starter._app_in_execution /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1818;BA.debugLine="If (Registered = 1) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 27:
//if
this.state = 32;
if ((RemoteObject.solveBoolean("=",_registered,BA.numberCast(double.class, 1)))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 1819;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_Regi";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_registered /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1821;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_Inva";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_invalid /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 1823;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setauthorization"),BA.numberCast(int.class, 100));
this.state = 52;
return;
case 52:
//C
this.state = 33;
;
 BA.debugLineNum = 1824;BA.debugLine="ResetPanels";
Debug.ShouldStop(-2147483648);
_resetpanels();
 BA.debugLineNum = 1825;BA.debugLine="Panel_Authorization.Visible = True";
Debug.ShouldStop(1);
parent.mostCurrent._panel_authorization.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1826;BA.debugLine="Starter.CurrentFlowPosition = 1";
Debug.ShouldStop(2);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 1);
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1829;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_Invali";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_invalid /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 1830;BA.debugLine="Sleep(100)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setauthorization"),BA.numberCast(int.class, 100));
this.state = 53;
return;
case 53:
//C
this.state = 36;
;
 BA.debugLineNum = 1831;BA.debugLine="ResetPanels";
Debug.ShouldStop(64);
_resetpanels();
 BA.debugLineNum = 1832;BA.debugLine="Panel_Authorization.Visible = True";
Debug.ShouldStop(128);
parent.mostCurrent._panel_authorization.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1833;BA.debugLine="Starter.CurrentFlowPosition = 1";
Debug.ShouldStop(256);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 1);
 if (true) break;

case 36:
//C
this.state = 39;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 0;
 BA.debugLineNum = 1836;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6111607939",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1837;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(4096);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 1838;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoServe";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_noserver /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 1839;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setauthorization"),BA.numberCast(int.class, 100));
this.state = 54;
return;
case 54:
//C
this.state = 39;
;
 BA.debugLineNum = 1840;BA.debugLine="ResetPanels";
Debug.ShouldStop(32768);
_resetpanels();
 BA.debugLineNum = 1841;BA.debugLine="Panel_Authorization.Visible = True";
Debug.ShouldStop(65536);
parent.mostCurrent._panel_authorization.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1842;BA.debugLine="Starter.CurrentFlowPosition = 1";
Debug.ShouldStop(131072);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 1);
 if (true) break;
if (true) break;

case 39:
//C
this.state = 48;
this.catchState = 0;
;
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 1847;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AuthorizationDa";
Debug.ShouldStop(4194304);
_i = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_noserver /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_try /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1848;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 42:
//if
this.state = 47;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 47;
 BA.debugLineNum = 1849;BA.debugLine="ResetPanels";
Debug.ShouldStop(16777216);
_resetpanels();
 BA.debugLineNum = 1850;BA.debugLine="Panel_Authorization.Visible = True";
Debug.ShouldStop(33554432);
parent.mostCurrent._panel_authorization.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1851;BA.debugLine="Starter.CurrentFlowPosition = 1";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 1);
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1853;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
parent.mostCurrent._activity.runVoidMethod ("Finish");
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
 BA.debugLineNum = 1857;BA.debugLine="Job.Release";
Debug.ShouldStop(1);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1859;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static RemoteObject  _setbuildinfo() throws Exception{
try {
		Debug.PushSubsStack("SetBuildInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,841);
if (RapidSub.canDelegate("setbuildinfo")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setbuildinfo");}
RemoteObject _currentapplabel = RemoteObject.createImmutable("");
RemoteObject _currentversion = RemoteObject.createImmutable("");
RemoteObject _ambiente = RemoteObject.createImmutable("");
RemoteObject _author = RemoteObject.createImmutable("");
RemoteObject _buildconfig = RemoteObject.createImmutable("");
RemoteObject _posicaoespaco = RemoteObject.createImmutable(0);
 BA.debugLineNum = 841;BA.debugLine="Sub SetBuildInfo As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 849;BA.debugLine="Dim CurrentAppLabel As String = Application.Label";
Debug.ShouldStop(65536);
_currentapplabel = main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName").runMethod(true,"toUpperCase");Debug.locals.put("CurrentAppLabel", _currentapplabel);Debug.locals.put("CurrentAppLabel", _currentapplabel);
 BA.debugLineNum = 850;BA.debugLine="CurrentBuild = \"VRCG\"";
Debug.ShouldStop(131072);
main._currentbuild = BA.ObjectToString("VRCG");
 BA.debugLineNum = 851;BA.debugLine="Dim CurrentVersion As String = \"2.4\"";
Debug.ShouldStop(262144);
_currentversion = BA.ObjectToString("2.4");Debug.locals.put("CurrentVersion", _currentversion);Debug.locals.put("CurrentVersion", _currentversion);
 BA.debugLineNum = 852;BA.debugLine="Dim Ambiente As String = \"DEMO\"";
Debug.ShouldStop(524288);
_ambiente = BA.ObjectToString("DEMO");Debug.locals.put("Ambiente", _ambiente);Debug.locals.put("Ambiente", _ambiente);
 BA.debugLineNum = 853;BA.debugLine="Dim Author As String = \"xevolution\"";
Debug.ShouldStop(1048576);
_author = BA.ObjectToString("xevolution");Debug.locals.put("Author", _author);Debug.locals.put("Author", _author);
 BA.debugLineNum = 854;BA.debugLine="Dim BuildConfig As String = \"\" ' PACKAGENAME NAO";
Debug.ShouldStop(2097152);
_buildconfig = BA.ObjectToString("");Debug.locals.put("BuildConfig", _buildconfig);Debug.locals.put("BuildConfig", _buildconfig);
 BA.debugLineNum = 856;BA.debugLine="If CurrentAppLabel.Contains(\"VRCG\") Then";
Debug.ShouldStop(8388608);
if (_currentapplabel.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("VRCG"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 857;BA.debugLine="CurrentBuild = \"VRCG\"";
Debug.ShouldStop(16777216);
main._currentbuild = BA.ObjectToString("VRCG");
 }else {
 BA.debugLineNum = 859;BA.debugLine="CurrentBuild = \"EVC\"";
Debug.ShouldStop(67108864);
main._currentbuild = BA.ObjectToString("EVC");
 };
 BA.debugLineNum = 862;BA.debugLine="Dim PosicaoEspaco As Int = CurrentAppLabel.IndexO";
Debug.ShouldStop(536870912);
_posicaoespaco = _currentapplabel.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("PosicaoEspaco", _posicaoespaco);Debug.locals.put("PosicaoEspaco", _posicaoespaco);
 BA.debugLineNum = 863;BA.debugLine="If PosicaoEspaco > 1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_posicaoespaco,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 864;BA.debugLine="CurrentVersion = CurrentAppLabel.SubString(Posic";
Debug.ShouldStop(-2147483648);
_currentversion = _currentapplabel.runMethod(true,"substring",(Object)(_posicaoespaco)).runMethod(true,"trim");Debug.locals.put("CurrentVersion", _currentversion);
 };
 BA.debugLineNum = 867;BA.debugLine="Ambiente = CurrentAppLabel.Replace($\"${CurrentBui";
Debug.ShouldStop(4);
_ambiente = _currentapplabel.runMethod(true,"replace",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._currentbuild))),RemoteObject.createImmutable("-")))),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currentversion))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"trim");Debug.locals.put("Ambiente", _ambiente);
 BA.debugLineNum = 868;BA.debugLine="BuildConfig = $\"${Author.ToLowerCase}.${CurrentBu";
Debug.ShouldStop(8);
_buildconfig = (RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_author.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._currentbuild.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ambiente.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("v"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currentversion.runMethod(true,"replace",(Object)(BA.ObjectToString(".")),(Object)(RemoteObject.createImmutable("")))))),RemoteObject.createImmutable("")));Debug.locals.put("BuildConfig", _buildconfig);
 BA.debugLineNum = 869;BA.debugLine="Return Ambiente";
Debug.ShouldStop(16);
if (true) return _ambiente;
 BA.debugLineNum = 870;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcompanyimagegravity() throws Exception{
try {
		Debug.PushSubsStack("SetCompanyImageGravity (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1210);
if (RapidSub.canDelegate("setcompanyimagegravity")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setcompanyimagegravity");}
RemoteObject _vrcglogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 1210;BA.debugLine="Sub SetCompanyImageGravity";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1211;BA.debugLine="Dim VRCGLogo As Bitmap = LoadBitmap(File.DirAsset";
Debug.ShouldStop(67108864);
_vrcglogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_vrcglogo = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon_100px.png")));Debug.locals.put("VRCGLogo", _vrcglogo);Debug.locals.put("VRCGLogo", _vrcglogo);
 BA.debugLineNum = 1212;BA.debugLine="If VRCGLogo = Consts.AppLogo Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_vrcglogo,main.mostCurrent._consts._applogo /*RemoteObject*/ )) { 
 BA.debugLineNum = 1213;BA.debugLine="CompanyImageView.Gravity = Gravity.CENTER";
Debug.ShouldStop(268435456);
main.mostCurrent._companyimageview.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 }else {
 BA.debugLineNum = 1215;BA.debugLine="CompanyImageView.Gravity = Gravity.FILL";
Debug.ShouldStop(1073741824);
main.mostCurrent._companyimageview.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 };
 BA.debugLineNum = 1217;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdeviceinfo() throws Exception{
try {
		Debug.PushSubsStack("SetDeviceInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,243);
if (RapidSub.canDelegate("setdeviceinfo")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setdeviceinfo");}
RemoteObject _marca = RemoteObject.createImmutable("");
RemoteObject _modelo = RemoteObject.createImmutable("");
 BA.debugLineNum = 243;BA.debugLine="Sub SetDeviceInfo";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="ShareCode.DEVICE_BRAND = Device.Manufacturer";
Debug.ShouldStop(524288);
main.mostCurrent._sharecode._device_brand /*RemoteObject*/  = main._device.runMethod(true,"getManufacturer");
 BA.debugLineNum = 245;BA.debugLine="ShareCode.DEVICE_MODEL = Device.Model";
Debug.ShouldStop(1048576);
main.mostCurrent._sharecode._device_model /*RemoteObject*/  = main._device.runMethod(true,"getModel");
 BA.debugLineNum = 246;BA.debugLine="ShareCode.DEVICE_TYPE = Device.Product";
Debug.ShouldStop(2097152);
main.mostCurrent._sharecode._device_type /*RemoteObject*/  = main._device.runMethod(true,"getProduct");
 BA.debugLineNum = 248;BA.debugLine="Dim MARCA As String = ShareCode.DEVICE_BRAND.ToUp";
Debug.ShouldStop(8388608);
_marca = main.mostCurrent._sharecode._device_brand /*RemoteObject*/ .runMethod(true,"toUpperCase");Debug.locals.put("MARCA", _marca);Debug.locals.put("MARCA", _marca);
 BA.debugLineNum = 249;BA.debugLine="Dim MODELO As String = ShareCode.DEVICE_MODEL.ToU";
Debug.ShouldStop(16777216);
_modelo = main.mostCurrent._sharecode._device_model /*RemoteObject*/ .runMethod(true,"toUpperCase");Debug.locals.put("MODELO", _modelo);Debug.locals.put("MODELO", _modelo);
 BA.debugLineNum = 250;BA.debugLine="DeviceBrand = MARCA";
Debug.ShouldStop(33554432);
main._devicebrand = _marca;
 BA.debugLineNum = 251;BA.debugLine="DeviceModel = MODELO";
Debug.ShouldStop(67108864);
main._devicemodel = _modelo;
 BA.debugLineNum = 253;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 254;BA.debugLine="DeviceMacAddress = newGetMAC.ToUpperCase";
Debug.ShouldStop(536870912);
main._devicemacaddress = _newgetmac().runMethod(true,"toUpperCase");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e11.toString()); BA.debugLineNum = 256;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6108462093",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 257;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(1);
main.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 258;BA.debugLine="DeviceMacAddress = \"\"";
Debug.ShouldStop(2);
main._devicemacaddress = BA.ObjectToString("");
 };
 BA.debugLineNum = 261;BA.debugLine="ShareCode.GlobalReportviewSleepTimer = 50";
Debug.ShouldStop(16);
main.mostCurrent._sharecode._globalreportviewsleeptimer /*RemoteObject*/  = BA.numberCast(int.class, 50);
 BA.debugLineNum = 265;BA.debugLine="Select Case MARCA";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(_marca,BA.ObjectToString("LENOVO"),BA.ObjectToString("SAMSUNG"),BA.ObjectToString("HUAWEI"),BA.ObjectToString("ALCATEL"),BA.ObjectToString("XIAOMI"),BA.ObjectToString("TCL"))) {
case 0: {
 BA.debugLineNum = 267;BA.debugLine="If MODELO = \"LENOVO TB-7504X\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("LENOVO TB-7504X"))) { 
 BA.debugLineNum = 268;BA.debugLine="ShareCode.ISPHONE = True";
Debug.ShouldStop(2048);
main.mostCurrent._sharecode._isphone /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 };
 break; }
case 1: {
 BA.debugLineNum = 271;BA.debugLine="If MODELO = \"SM-A105FN\" Or MODELO = \"SM-A217F\"";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("SM-A105FN")) || RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("SM-A217F"))) { 
 BA.debugLineNum = 272;BA.debugLine="ShareCode.ISPHONE = True";
Debug.ShouldStop(32768);
main.mostCurrent._sharecode._isphone /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 };
 break; }
case 2: {
 BA.debugLineNum = 275;BA.debugLine="ShareCode.GlobalReportviewSleepTimer = 500";
Debug.ShouldStop(262144);
main.mostCurrent._sharecode._globalreportviewsleeptimer /*RemoteObject*/  = BA.numberCast(int.class, 500);
 break; }
case 3: {
 break; }
case 4: {
 BA.debugLineNum = 279;BA.debugLine="If MODELO = \"DANDELION\" Or MODELO = \"NOTE 9S\" O";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("DANDELION")) || RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("NOTE 9S")) || RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("REDMI NOTE 9S")) || RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("REDMI NOTE 7")) || RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("MI NOTE 10 LITE"))) { 
 BA.debugLineNum = 280;BA.debugLine="ShareCode.ISPHONE = True";
Debug.ShouldStop(8388608);
main.mostCurrent._sharecode._isphone /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 };
 break; }
case 5: {
 BA.debugLineNum = 283;BA.debugLine="If MODELO = \"8068_EEA\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_modelo,BA.ObjectToString("8068_EEA"))) { 
 BA.debugLineNum = 284;BA.debugLine="ShareCode.ISPHONE = True";
Debug.ShouldStop(134217728);
main.mostCurrent._sharecode._isphone /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 };
 break; }
}
;
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenvironment(RemoteObject _ambiente) throws Exception{
try {
		Debug.PushSubsStack("SetEnvironment (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,511);
if (RapidSub.canDelegate("setenvironment")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setenvironment", _ambiente);}
Debug.locals.put("Ambiente", _ambiente);
 BA.debugLineNum = 511;BA.debugLine="Sub SetEnvironment(Ambiente As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 512;BA.debugLine="Select Case Ambiente";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_ambiente,BA.ObjectToString("DEMO"),BA.ObjectToString("ACAIL"),BA.ObjectToString("DEVEL"),BA.ObjectToString("SCMS"),BA.ObjectToString("GA"),BA.ObjectToString("SIMGA"),BA.ObjectToString("EDP"),BA.ObjectToString("AGT"),BA.ObjectToString("BAX"),BA.ObjectToString("NVE"),BA.ObjectToString("STR"),BA.ObjectToString("PRT"),BA.ObjectToString("JMLX"),BA.ObjectToString("GRNLNK"),BA.ObjectToString("ITG"),BA.ObjectToString("LPS"),BA.ObjectToString("ERG"),BA.ObjectToString("FGIL"),BA.ObjectToString("HMR"),BA.ObjectToString("RPRE"),BA.ObjectToString("BRF"),BA.ObjectToString("ASC"),BA.ObjectToString("EGTAS"),BA.ObjectToString("TRTS"),BA.ObjectToString("GPSRS"),BA.ObjectToString("ANN"),BA.ObjectToString("VSEGP"),BA.ObjectToString("PSIL"),BA.ObjectToString("JFM"),BA.ObjectToString("SWBR"),BA.ObjectToString("SMFEL"),BA.ObjectToString("TRG"),BA.ObjectToString("ACL"),BA.ObjectToString("UBR"),BA.ObjectToString("SLV"),BA.ObjectToString("LUX"),BA.ObjectToString("JRS"),BA.ObjectToString("VMG"),BA.ObjectToString("TG"),BA.ObjectToString("SEV"),BA.ObjectToString("DEVEDP"),BA.ObjectToString("DEVSWBR"),BA.ObjectToString("DEVTRG"),BA.ObjectToString("DEVPAL"),BA.ObjectToString("DEVGBM"),BA.ObjectToString("DEVVTX"),BA.ObjectToString("DEVVUL"),BA.ObjectToString("TRIAL01"),BA.ObjectToString("TRIALFC"),BA.ObjectToString("DEVDEMO"))) {
case 0: {
 BA.debugLineNum = 515;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-XD01\"";
Debug.ShouldStop(4);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-XD01"));
 BA.debugLineNum = 516;BA.debugLine="EditInstance.Text = \"PT20180913-2105-003\"";
Debug.ShouldStop(8);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-003"));
 break; }
case 1: {
 BA.debugLineNum = 520;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X801\"";
Debug.ShouldStop(128);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-X801"));
 BA.debugLineNum = 521;BA.debugLine="EditInstance.Text = \"PT20180913-2105-008\"";
Debug.ShouldStop(256);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-008"));
 break; }
case 2: {
 BA.debugLineNum = 525;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-ASXD\"";
Debug.ShouldStop(4096);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-ASXD"));
 BA.debugLineNum = 526;BA.debugLine="EditInstance.Text = \"PT20180913-2105-004\"";
Debug.ShouldStop(8192);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-004"));
 break; }
case 3: {
 BA.debugLineNum = 529;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-ASX1\"";
Debug.ShouldStop(65536);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-ASX1"));
 BA.debugLineNum = 530;BA.debugLine="EditInstance.Text = \"PT20190913-2105-002\"";
Debug.ShouldStop(131072);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190913-2105-002"));
 break; }
case 4: {
 BA.debugLineNum = 533;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X601\"";
Debug.ShouldStop(1048576);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-X601"));
 BA.debugLineNum = 534;BA.debugLine="EditInstance.Text = \"PT20180913-2105-006\"";
Debug.ShouldStop(2097152);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-006"));
 BA.debugLineNum = 535;BA.debugLine="ShareCode.EmailOldModel = True";
Debug.ShouldStop(4194304);
main.mostCurrent._sharecode._emailoldmodel /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 5: {
 BA.debugLineNum = 539;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X600\"";
Debug.ShouldStop(67108864);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-X600"));
 BA.debugLineNum = 540;BA.debugLine="EditInstance.Text = \"PT20180913-2106-006\"";
Debug.ShouldStop(134217728);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2106-006"));
 BA.debugLineNum = 541;BA.debugLine="ShareCode.EmailOldModel = True";
Debug.ShouldStop(268435456);
main.mostCurrent._sharecode._emailoldmodel /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 6: {
 BA.debugLineNum = 545;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-XE11\"";
Debug.ShouldStop(1);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-XE11"));
 BA.debugLineNum = 546;BA.debugLine="EditInstance.Text = \"PT20180913-2105-011\"";
Debug.ShouldStop(2);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-011"));
 break; }
case 7: {
 BA.debugLineNum = 549;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X101\"";
Debug.ShouldStop(16);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-X101"));
 BA.debugLineNum = 550;BA.debugLine="EditInstance.Text = \"PT20180913-2105-010\"";
Debug.ShouldStop(32);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-010"));
 break; }
case 8: {
 BA.debugLineNum = 553;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-BX01\"";
Debug.ShouldStop(256);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-BX01"));
 BA.debugLineNum = 554;BA.debugLine="EditInstance.Text = \"PT20190909-0000-001\"";
Debug.ShouldStop(512);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190909-0000-001"));
 break; }
case 9: {
 BA.debugLineNum = 558;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-NV01\"";
Debug.ShouldStop(8192);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-NV01"));
 BA.debugLineNum = 559;BA.debugLine="EditInstance.Text = \"PT20190910-0000-001\"";
Debug.ShouldStop(16384);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190910-0000-001"));
 break; }
case 10: {
 BA.debugLineNum = 562;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-ST01\"";
Debug.ShouldStop(131072);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-ST01"));
 BA.debugLineNum = 563;BA.debugLine="EditInstance.Text = \"PT20180913-2105-113\"";
Debug.ShouldStop(262144);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-113"));
 break; }
case 11: {
 BA.debugLineNum = 567;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-PC010\"";
Debug.ShouldStop(4194304);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-PC010"));
 BA.debugLineNum = 568;BA.debugLine="EditInstance.Text = \"PT20190919-1600-001\"";
Debug.ShouldStop(8388608);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190919-1600-001"));
 break; }
case 12: {
 BA.debugLineNum = 571;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-AJ01\"";
Debug.ShouldStop(67108864);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-AJ01"));
 BA.debugLineNum = 572;BA.debugLine="EditInstance.Text = \"PT20180913-2105-001\"";
Debug.ShouldStop(134217728);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-001"));
 break; }
case 13: {
 BA.debugLineNum = 575;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-GL01\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-GL01"));
 BA.debugLineNum = 576;BA.debugLine="EditInstance.Text = \"PT20191018-1500-001\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20191018-1500-001"));
 break; }
case 14: {
 BA.debugLineNum = 579;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-IT010\"";
Debug.ShouldStop(4);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-IT010"));
 BA.debugLineNum = 580;BA.debugLine="EditInstance.Text = \"PT20190919-1600-003\"";
Debug.ShouldStop(8);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190919-1600-003"));
 break; }
case 15: {
 BA.debugLineNum = 584;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-LS011\"";
Debug.ShouldStop(128);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-LS011"));
 BA.debugLineNum = 585;BA.debugLine="EditInstance.Text = \"PT20190919-1600-002\"";
Debug.ShouldStop(256);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190919-1600-002"));
 break; }
case 16: {
 BA.debugLineNum = 588;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-EL011\"";
Debug.ShouldStop(2048);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-EL011"));
 BA.debugLineNum = 589;BA.debugLine="EditInstance.Text = \"PT20190919-1600-005\"";
Debug.ShouldStop(4096);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190919-1600-005"));
 BA.debugLineNum = 590;BA.debugLine="ShareCode.EmailOldModel = True";
Debug.ShouldStop(8192);
main.mostCurrent._sharecode._emailoldmodel /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 17: {
 BA.debugLineNum = 594;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-FG01\"";
Debug.ShouldStop(131072);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-FG01"));
 BA.debugLineNum = 595;BA.debugLine="EditInstance.Text = \"PT20190801-1947-111\"";
Debug.ShouldStop(262144);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190801-1947-111"));
 break; }
case 18: {
 BA.debugLineNum = 599;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-H001\"";
Debug.ShouldStop(4194304);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-H001"));
 BA.debugLineNum = 600;BA.debugLine="EditInstance.Text = \"PT20190913-2105-012\"";
Debug.ShouldStop(8388608);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190913-2105-012"));
 BA.debugLineNum = 601;BA.debugLine="ShareCode.EmailOldModel = True";
Debug.ShouldStop(16777216);
main.mostCurrent._sharecode._emailoldmodel /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 19: {
 BA.debugLineNum = 605;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-RP01\"";
Debug.ShouldStop(268435456);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-RP01"));
 BA.debugLineNum = 606;BA.debugLine="EditInstance.Text = \"PT20191121-1009-001\"";
Debug.ShouldStop(536870912);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20191121-1009-001"));
 break; }
case 20: {
 BA.debugLineNum = 610;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-BR01\"";
Debug.ShouldStop(2);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-BR01"));
 BA.debugLineNum = 611;BA.debugLine="EditInstance.Text = \"PT20190807-1933-001\"";
Debug.ShouldStop(4);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20190807-1933-001"));
 break; }
case 21: {
 BA.debugLineNum = 615;BA.debugLine="EditAuthorization.Text = \" RT123-C324D-AS01\"";
Debug.ShouldStop(64);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(" RT123-C324D-AS01"));
 BA.debugLineNum = 616;BA.debugLine="EditInstance.Text = \"PT20200907-0907-001\"";
Debug.ShouldStop(128);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200907-0907-001"));
 break; }
case 22: {
 BA.debugLineNum = 619;BA.debugLine="EditAuthorization.Text = \" RT123-C324D-ET01\"";
Debug.ShouldStop(1024);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(" RT123-C324D-ET01"));
 BA.debugLineNum = 620;BA.debugLine="EditInstance.Text = \"PT20200227-1707-001\"";
Debug.ShouldStop(2048);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200227-1707-001"));
 break; }
case 23: {
 BA.debugLineNum = 623;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TR01\"";
Debug.ShouldStop(16384);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-TR01"));
 BA.debugLineNum = 624;BA.debugLine="EditInstance.Text = \"PT20200203-1900-001\"";
Debug.ShouldStop(32768);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200203-1900-001"));
 break; }
case 24: {
 BA.debugLineNum = 627;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-GS01\"";
Debug.ShouldStop(262144);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-GS01"));
 BA.debugLineNum = 628;BA.debugLine="EditInstance.Text = \"PT20200127-0900-001\"";
Debug.ShouldStop(524288);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200127-0900-001"));
 break; }
case 25: {
 BA.debugLineNum = 631;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-AN01\"";
Debug.ShouldStop(4194304);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-AN01"));
 BA.debugLineNum = 632;BA.debugLine="EditInstance.Text = \"PT20200214-1800-001\"";
Debug.ShouldStop(8388608);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200214-1800-001"));
 break; }
case 26: {
 BA.debugLineNum = 636;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-VF01\"";
Debug.ShouldStop(134217728);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-VF01"));
 BA.debugLineNum = 637;BA.debugLine="EditInstance.Text = \"PT20200218-1730-001\"";
Debug.ShouldStop(268435456);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200218-1730-001"));
 break; }
case 27: {
 BA.debugLineNum = 641;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-PS01\"";
Debug.ShouldStop(1);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-PS01"));
 BA.debugLineNum = 642;BA.debugLine="EditInstance.Text = \"PT20200306-1611-001\"";
Debug.ShouldStop(2);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200306-1611-001"));
 break; }
case 28: {
 BA.debugLineNum = 646;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-JM01\"";
Debug.ShouldStop(32);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-JM01"));
 BA.debugLineNum = 647;BA.debugLine="EditInstance.Text = \"PT20200411-1400-001\"";
Debug.ShouldStop(64);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200411-1400-001"));
 break; }
case 29: {
 BA.debugLineNum = 651;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SB01\"";
Debug.ShouldStop(1024);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-SB01"));
 BA.debugLineNum = 652;BA.debugLine="EditInstance.Text = \"PT20200323-1800-001\"";
Debug.ShouldStop(2048);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200323-1800-001"));
 break; }
case 30: {
 BA.debugLineNum = 656;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SF01\"";
Debug.ShouldStop(32768);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-SF01"));
 BA.debugLineNum = 657;BA.debugLine="EditInstance.Text = \"PT20200615-1215-001\"";
Debug.ShouldStop(65536);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200615-1215-001"));
 break; }
case 31: {
 BA.debugLineNum = 661;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TG01\"";
Debug.ShouldStop(1048576);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-TG01"));
 BA.debugLineNum = 662;BA.debugLine="EditInstance.Text = \"PT20200710-1910-001\"";
Debug.ShouldStop(2097152);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200710-1910-001"));
 break; }
case 32: {
 BA.debugLineNum = 666;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-AC01\"";
Debug.ShouldStop(33554432);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-AC01"));
 BA.debugLineNum = 667;BA.debugLine="EditInstance.Text = \"PT20200716-1600-001\"";
Debug.ShouldStop(67108864);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200716-1600-001"));
 break; }
case 33: {
 BA.debugLineNum = 671;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X699\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-X699"));
 BA.debugLineNum = 672;BA.debugLine="EditInstance.Text = \"PT20180913-2105-005\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2105-005"));
 break; }
case 34: {
 BA.debugLineNum = 676;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SV01\"";
Debug.ShouldStop(8);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-SV01"));
 BA.debugLineNum = 677;BA.debugLine="EditInstance.Text = \"PT20200811-1036-001\"";
Debug.ShouldStop(16);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200811-1036-001"));
 break; }
case 35: {
 BA.debugLineNum = 681;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-LC01\"";
Debug.ShouldStop(256);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-LC01"));
 BA.debugLineNum = 682;BA.debugLine="EditInstance.Text = \"PT20200914-1206-001\"";
Debug.ShouldStop(512);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200914-1206-001"));
 break; }
case 36: {
 BA.debugLineNum = 686;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-JR01\"";
Debug.ShouldStop(8192);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-JR01"));
 BA.debugLineNum = 687;BA.debugLine="EditInstance.Text = \"PT20200914-1139-001\"";
Debug.ShouldStop(16384);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200914-1139-001"));
 break; }
case 37: {
 BA.debugLineNum = 691;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-XD10\"";
Debug.ShouldStop(262144);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-XD10"));
 BA.debugLineNum = 692;BA.debugLine="EditInstance.Text = \"PT20200909-1200-001\"";
Debug.ShouldStop(524288);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200909-1200-001"));
 break; }
case 38: {
 BA.debugLineNum = 695;BA.debugLine="EditAuthorization.Text = \"\"";
Debug.ShouldStop(4194304);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 696;BA.debugLine="EditInstance.Text = \"\"";
Debug.ShouldStop(8388608);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 break; }
case 39: {
 BA.debugLineNum = 699;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SFE01\"";
Debug.ShouldStop(67108864);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-SFE01"));
 BA.debugLineNum = 700;BA.debugLine="EditInstance.Text = \"PT20210118-1213-001\"";
Debug.ShouldStop(134217728);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20210118-1213-001"));
 break; }
case 40: {
 BA.debugLineNum = 704;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-XE00\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-XE00"));
 BA.debugLineNum = 705;BA.debugLine="EditInstance.Text = \"PT20180913-2106-011\"";
Debug.ShouldStop(1);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20180913-2106-011"));
 BA.debugLineNum = 706;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(2);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 41: {
 BA.debugLineNum = 709;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SB00\"";
Debug.ShouldStop(16);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-SB00"));
 BA.debugLineNum = 710;BA.debugLine="EditInstance.Text = \"PT20200323-DEV0-001\"";
Debug.ShouldStop(32);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20200323-DEV0-001"));
 BA.debugLineNum = 711;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(64);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 42: {
 BA.debugLineNum = 714;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TG01\"";
Debug.ShouldStop(512);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-TG01"));
 BA.debugLineNum = 715;BA.debugLine="EditInstance.Text = \"PT20201021-DEV2-001\"";
Debug.ShouldStop(1024);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20201021-DEV2-001"));
 BA.debugLineNum = 716;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(2048);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 43: {
 BA.debugLineNum = 719;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-PA01\"";
Debug.ShouldStop(16384);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-PA01"));
 BA.debugLineNum = 720;BA.debugLine="EditInstance.Text = \"PT20201102-0941-001\"";
Debug.ShouldStop(32768);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20201102-0941-001"));
 BA.debugLineNum = 721;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(65536);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 44: {
 BA.debugLineNum = 724;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-GB01\"";
Debug.ShouldStop(524288);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-GB01"));
 BA.debugLineNum = 725;BA.debugLine="EditInstance.Text = \"PT20201016-DEV1-001\"";
Debug.ShouldStop(1048576);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20201016-DEV1-001"));
 BA.debugLineNum = 726;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(2097152);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 45: {
 BA.debugLineNum = 729;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-VT01\"";
Debug.ShouldStop(16777216);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-VT01"));
 BA.debugLineNum = 730;BA.debugLine="EditInstance.Text = \"PT20201011-DEV0-001\"";
Debug.ShouldStop(33554432);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20201011-DEV0-001"));
 BA.debugLineNum = 731;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(67108864);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 46: {
 BA.debugLineNum = 734;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-VL01\"";
Debug.ShouldStop(536870912);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-VL01"));
 BA.debugLineNum = 735;BA.debugLine="EditInstance.Text = \"PT20210111-DEV5-001\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20210111-DEV5-001"));
 BA.debugLineNum = 736;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 47: {
 BA.debugLineNum = 739;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TR101\"";
Debug.ShouldStop(4);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-TR101"));
 BA.debugLineNum = 740;BA.debugLine="EditInstance.Text = \"PT20210113-1217-001\"";
Debug.ShouldStop(8);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20210113-1217-001"));
 BA.debugLineNum = 741;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(16);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
case 48: {
 BA.debugLineNum = 744;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TFC01\"";
Debug.ShouldStop(128);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-TFC01"));
 BA.debugLineNum = 745;BA.debugLine="EditInstance.Text = \"PT20210126-1135-001\"";
Debug.ShouldStop(256);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20210126-1135-001"));
 break; }
case 49: {
 BA.debugLineNum = 748;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-RT00\"";
Debug.ShouldStop(2048);
main.mostCurrent._editauthorization.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("RT123-C324D-RT00"));
 BA.debugLineNum = 749;BA.debugLine="EditInstance.Text = \"PT20201110-DEV4-001\"";
Debug.ShouldStop(4096);
main.mostCurrent._editinstance.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("PT20201110-DEV4-001"));
 BA.debugLineNum = 750;BA.debugLine="ShareCode.IsDevelopment = True";
Debug.ShouldStop(8192);
main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 break; }
}
;
 BA.debugLineNum = 752;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setftpuser() throws Exception{
try {
		Debug.PushSubsStack("SetFTPUser (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,299);
if (RapidSub.canDelegate("setftpuser")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setftpuser");}
 BA.debugLineNum = 299;BA.debugLine="Sub SetFTPUser";
Debug.ShouldStop(1024);
 BA.debugLineNum = 300;BA.debugLine="If ShareCode.IsDevelopment Then";
Debug.ShouldStop(2048);
if (main.mostCurrent._sharecode._isdevelopment /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 301;BA.debugLine="ShareCode.APP_FTP_USER = \"DevEvolutionCheck\"";
Debug.ShouldStop(4096);
main.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/  = BA.ObjectToString("DevEvolutionCheck");
 }else {
 BA.debugLineNum = 303;BA.debugLine="ShareCode.APP_FTP_USER = \"EvolutionCheck\"";
Debug.ShouldStop(16384);
main.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/  = BA.ObjectToString("EvolutionCheck");
 };
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinfo(RemoteObject _first_install_info) throws Exception{
try {
		Debug.PushSubsStack("SetInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2686);
if (RapidSub.canDelegate("setinfo")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setinfo", _first_install_info);}
RemoteObject _jsonstruct = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datahora = RemoteObject.createImmutable("");
RemoteObject _sqlfilestotal = RemoteObject.createImmutable(0);
RemoteObject _date = RemoteObject.createImmutable("");
Debug.locals.put("FIRST_INSTALL_INFO", _first_install_info);
 BA.debugLineNum = 2686;BA.debugLine="Sub SetInfo(FIRST_INSTALL_INFO As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2688;BA.debugLine="Dim JsonStruct As String = File.readstring(Starte";
Debug.ShouldStop(-2147483648);
_jsonstruct = main.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_first_install_info));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 2689;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2690;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(2);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 2691;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2693;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
Debug.ShouldStop(16);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 2694;BA.debugLine="File.writeString(Starter.SharedFolder,$\"date_inst";
Debug.ShouldStop(32);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.createImmutable("date_installed.log"))),(Object)(_datahora));
 BA.debugLineNum = 2695;BA.debugLine="ShareCode.Installed_Date = DataHora";
Debug.ShouldStop(64);
main.mostCurrent._sharecode._installed_date /*RemoteObject*/  = _datahora;
 BA.debugLineNum = 2696;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Share";
Debug.ShouldStop(128);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log")))),(Object)(_datahora));
 BA.debugLineNum = 2698;BA.debugLine="Dim SqlFilesTotal As Int = root.Get(\"files\")";
Debug.ShouldStop(512);
_sqlfilestotal = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("SqlFilesTotal", _sqlfilestotal);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 2700;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(2048);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2701;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(4096);
main.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2702;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(8192);
main.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2704;BA.debugLine="CheckIf_SqlFilesTotal_IsEqualToZero(SqlFilesTotal";
Debug.ShouldStop(32768);
_checkif_sqlfilestotal_isequaltozero(_sqlfilestotal);
 BA.debugLineNum = 2705;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlanguage() throws Exception{
try {
		Debug.PushSubsStack("SetLanguage (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,221);
if (RapidSub.canDelegate("setlanguage")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setlanguage");}
 BA.debugLineNum = 221;BA.debugLine="Sub SetLanguage";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 229;BA.debugLine="If ShareCode.DEVICE_LANGUAGE_STR = \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.mostCurrent._sharecode._device_language_str /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 230;BA.debugLine="ShareCode.DEVICE_LANGUAGE_STR = GetDefaultLangua";
Debug.ShouldStop(32);
main.mostCurrent._sharecode._device_language_str /*RemoteObject*/  = _getdefaultlanguage().runMethod(true,"toUpperCase");
 };
 BA.debugLineNum = 233;BA.debugLine="Log(ShareCode.DEVICE_LANGUAGE_STR)";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6108396556",main.mostCurrent._sharecode._device_language_str /*RemoteObject*/ ,0);
 BA.debugLineNum = 235;BA.debugLine="If Utils.NE(ShareCode.DEVICE_LANGUAGE_STR) Then";
Debug.ShouldStop(1024);
if (main.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._sharecode._device_language_str /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 236;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
Debug.ShouldStop(2048);
main.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PT")));
 }else {
 BA.debugLineNum = 238;BA.debugLine="ShareCode.CheckTranslations(ShareCode.DEVICE_LAN";
Debug.ShouldStop(8192);
main.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._sharecode._device_language_str /*RemoteObject*/ ));
 };
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setlogin(RemoteObject _uname,RemoteObject _upass) throws Exception{
try {
		Debug.PushSubsStack("SetLogin (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2274);
if (RapidSub.canDelegate("setlogin")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setlogin", _uname, _upass); return;}
ResumableSub_SetLogin rsub = new ResumableSub_SetLogin(null,_uname,_upass);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetLogin extends BA.ResumableSub {
public ResumableSub_SetLogin(xevolution.vrcg.devdemov2400.main parent,RemoteObject _uname,RemoteObject _upass) {
this.parent = parent;
this._uname = _uname;
this._upass = _upass;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _uname;
RemoteObject _upass;
RemoteObject _ok = RemoteObject.createImmutable(false);
RemoteObject _callagain = RemoteObject.createImmutable(false);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sqlscript = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _userauthparams = RemoteObject.createImmutable("");
RemoteObject _confuser = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _resultstr = RemoteObject.createImmutable("");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _active = RemoteObject.createImmutable(0);
RemoteObject _forcepassword = RemoteObject.createImmutable(false);
RemoteObject _userin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pwdrequest = RemoteObject.createImmutable(0);
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _profile_tagcode = RemoteObject.createImmutable("");
RemoteObject _warehouse = RemoteObject.createImmutable("");
RemoteObject _available = RemoteObject.createImmutable(0);
RemoteObject _rrpac = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finito = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetLogin (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2274);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("uname", _uname);
Debug.locals.put("upass", _upass);
 BA.debugLineNum = 2285;BA.debugLine="Dim OK As Boolean = False";
Debug.ShouldStop(4096);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);Debug.locals.put("OK", _ok);
 BA.debugLineNum = 2286;BA.debugLine="Dim CallAgain As Boolean = False";
Debug.ShouldStop(8192);
_callagain = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("CallAgain", _callagain);Debug.locals.put("CallAgain", _callagain);
 BA.debugLineNum = 2287;BA.debugLine="DBStructures.getCurrentConfigValues";
Debug.ShouldStop(16384);
parent.mostCurrent._dbstructures.runVoidMethod ("_getcurrentconfigvalues" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 2289;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.APP_D";
Debug.ShouldStop(65536);
parent.mostCurrent._sharecode._app_url /*RemoteObject*/  = RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/"))));
 BA.debugLineNum = 2291;BA.debugLine="If ((uname <> \"\") And (upass <> \"\")) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 60;
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_uname,RemoteObject.createImmutable(""))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_upass,RemoteObject.createImmutable(""))))))) { 
this.state = 3;
}else {
this.state = 59;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2293;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 57;
if (parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2295;BA.debugLine="Private Row As Int = 0";
Debug.ShouldStop(4194304);
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 2296;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(8388608);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 2300;BA.debugLine="Dim SQLScript As String = $\"SELECT ifnull(b.pro";
Debug.ShouldStop(134217728);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("SELECT ifnull(b.profile_tagcode, '') AS profile_tagcode, ifnull(b.email,'') AS email, a.*,\n"),RemoteObject.createImmutable("										ifnull(c.warehouse,'') AS warehouse, c.vehicleplate, c.vehicle, c.photo, b.available\n"),RemoteObject.createImmutable("										from dta_technicals AS a \n"),RemoteObject.createImmutable("										LEFT JOIN aut_users AS b ON (b.tagcode=a.user_tagcode)\n"),RemoteObject.createImmutable("										left join aut_users_details as c on (c.user_tagcode=a.user_tagcode)\n"),RemoteObject.createImmutable("										where a.username='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable("' and a.keypad='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_upass))),RemoteObject.createImmutable("'")));Debug.locals.put("SQLScript", _sqlscript);Debug.locals.put("SQLScript", _sqlscript);
 BA.debugLineNum = 2306;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQLScrip";
Debug.ShouldStop(2);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlscript)));
 BA.debugLineNum = 2308;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 2309;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(16);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 2310;BA.debugLine="SetUserInfo(Record, uname)";
Debug.ShouldStop(32);
_setuserinfo(_record,_uname);
 BA.debugLineNum = 2311;BA.debugLine="OK = True";
Debug.ShouldStop(64);
_ok = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OK", _ok);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2314;BA.debugLine="Msgbox2Async(ShareCode.LoginMessage_NOTOK, Sha";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginmessage_notok /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_try /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2315;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setlogin"), null);
this.state = 70;
return;
case 70:
//C
this.state = 12;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2316;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 2317;BA.debugLine="CallAgain = True";
Debug.ShouldStop(4096);
_callagain = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("CallAgain", _callagain);
 BA.debugLineNum = 2318;BA.debugLine="ResetPanels";
Debug.ShouldStop(8192);
_resetpanels();
 BA.debugLineNum = 2319;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(16384);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2320;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(32768);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2322;BA.debugLine="OK = False";
Debug.ShouldStop(131072);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 57;
;
 BA.debugLineNum = 2325;BA.debugLine="Record.Close";
Debug.ShouldStop(1048576);
_record.runVoidMethod ("Close");
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2327;BA.debugLine="Private UserAuthParams As String = CreateUserAu";
Debug.ShouldStop(4194304);
_userauthparams = _createuserauthparams(_uname,_upass);Debug.locals.put("UserAuthParams", _userauthparams);Debug.locals.put("UserAuthParams", _userauthparams);
 BA.debugLineNum = 2328;BA.debugLine="Dim ConfUser As String = ShareCode.APP_URL & Sh";
Debug.ShouldStop(8388608);
_confuser = RemoteObject.concat(parent.mostCurrent._sharecode._app_url /*RemoteObject*/ ,parent.mostCurrent._sharecode._app_confirmuser /*RemoteObject*/ );Debug.locals.put("ConfUser", _confuser);Debug.locals.put("ConfUser", _confuser);
 BA.debugLineNum = 2330;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(33554432);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 2331;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 2332;BA.debugLine="Job.PostString(ConfUser, UserAuthParams )";
Debug.ShouldStop(134217728);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_confuser),(Object)(_userauthparams));
 BA.debugLineNum = 2333;BA.debugLine="Job.GetRequest.SetContentType(\"application/json";
Debug.ShouldStop(268435456);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2335;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setlogin"), (_job));
this.state = 71;
return;
case 71:
//C
this.state = 21;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 2336;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 21:
//if
this.state = 56;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 49;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2338;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328768",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2339;BA.debugLine="Dim ResultStr As String = Job.GetString";
Debug.ShouldStop(4);
_resultstr = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("ResultStr", _resultstr);Debug.locals.put("ResultStr", _resultstr);
 BA.debugLineNum = 2340;BA.debugLine="Log(\"=========================================";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328770",RemoteObject.createImmutable("================================================================"),0);
 BA.debugLineNum = 2341;BA.debugLine="Log(\"                          AUTENTICAÇÃO";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328771",RemoteObject.createImmutable("                          AUTENTICAÇÃO                          "),0);
 BA.debugLineNum = 2342;BA.debugLine="Log(\"=========================================";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328772",RemoteObject.createImmutable("================================================================"),0);
 BA.debugLineNum = 2343;BA.debugLine="Log(ResultStr)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328773",_resultstr,0);
 BA.debugLineNum = 2344;BA.debugLine="Log(\"=========================================";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328774",RemoteObject.createImmutable("================================================================"),0);
 BA.debugLineNum = 2346;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(512);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 2348;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\")";
Debug.ShouldStop(2048);
if (true) break;

case 24:
//if
this.state = 27;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv6",(Object)(_resultstr),(Object)(BA.numberCast(long.class, 1))),RemoteObject.createImmutable("[")))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2349;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrF";
Debug.ShouldStop(4096);
_resultstr = parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvvvvv4",(Object)(parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvv5",(Object)(_resultstr),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv7",(Object)(_resultstr)),RemoteObject.createImmutable(1)}, "-",1, 2))))));Debug.locals.put("ResultStr", _resultstr);
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 2352;BA.debugLine="JSON1.Initialize(ResultStr)";
Debug.ShouldStop(32768);
_json1.runVoidMethod ("Initialize",(Object)(_resultstr));
 BA.debugLineNum = 2353;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(65536);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 2354;BA.debugLine="Dim Active As Int = MapJSON.Get(\"status\")";
Debug.ShouldStop(131072);
_active = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("Active", _active);Debug.locals.put("Active", _active);
 BA.debugLineNum = 2362;BA.debugLine="ShareCode.UserLanguage = MapJSON.Get(\"ulang\")";
Debug.ShouldStop(33554432);
parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/  = BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ulang")))));
 BA.debugLineNum = 2364;BA.debugLine="Log(\"=========================================";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328794",RemoteObject.createImmutable("================================================"),0);
 BA.debugLineNum = 2365;BA.debugLine="Log(\"LINGUAGEM DEFINIDA NO UTILIZADOR\")";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328795",RemoteObject.createImmutable("LINGUAGEM DEFINIDA NO UTILIZADOR"),0);
 BA.debugLineNum = 2366;BA.debugLine="Log(\"=========================================";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328796",RemoteObject.createImmutable("================================================"),0);
 BA.debugLineNum = 2367;BA.debugLine="Log($\"${uname}:${ShareCode.UserLanguage}\"$)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328797",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uname))),RemoteObject.createImmutable(":"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2368;BA.debugLine="Log(\"=========================================";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112328798",RemoteObject.createImmutable("================================================"),0);
 BA.debugLineNum = 2371;BA.debugLine="Dim ForcePassword As Boolean = False";
Debug.ShouldStop(4);
_forcepassword = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ForcePassword", _forcepassword);Debug.locals.put("ForcePassword", _forcepassword);
 BA.debugLineNum = 2372;BA.debugLine="ForcePassword = False";
Debug.ShouldStop(8);
_forcepassword = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ForcePassword", _forcepassword);
 BA.debugLineNum = 2374;BA.debugLine="ForceResetPassword(ForcePassword, uname)";
Debug.ShouldStop(32);
_forceresetpassword(_forcepassword,_uname);
 BA.debugLineNum = 2377;BA.debugLine="If (Active = 1) Then";
Debug.ShouldStop(256);
if (true) break;

case 28:
//if
this.state = 47;
if ((RemoteObject.solveBoolean("=",_active,BA.numberCast(double.class, 1)))) { 
this.state = 30;
}else {
this.state = 40;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2379;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_1\", Me)";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_loguseraction" /*void*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("TUSRLGOT_1")),(Object)(main.getObject()));
 BA.debugLineNum = 2380;BA.debugLine="Sleep(250)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setlogin"),BA.numberCast(int.class, 250));
this.state = 72;
return;
case 72:
//C
this.state = 31;
;
 BA.debugLineNum = 2382;BA.debugLine="CreateOrUpdateLocalUser(MapJSON, uname)";
Debug.ShouldStop(8192);
_createorupdatelocaluser(_mapjson,_uname);
 BA.debugLineNum = 2384;BA.debugLine="Dim UserIn As Map = MapJSON.Get(\"user\")";
Debug.ShouldStop(32768);
_userin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_userin = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user")))));Debug.locals.put("UserIn", _userin);
 BA.debugLineNum = 2385;BA.debugLine="Dim pwdrequest As Int = UserIn.Get(\"pwdreques";
Debug.ShouldStop(65536);
_pwdrequest = BA.numberCast(int.class, _userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pwdrequest")))));Debug.locals.put("pwdrequest", _pwdrequest);Debug.locals.put("pwdrequest", _pwdrequest);
 BA.debugLineNum = 2386;BA.debugLine="Dim Tagcode As String = UserIn.Get(\"tagcode\")";
Debug.ShouldStop(131072);
_tagcode = BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcode")))));Debug.locals.put("Tagcode", _tagcode);Debug.locals.put("Tagcode", _tagcode);
 BA.debugLineNum = 2387;BA.debugLine="Dim profile_tagcode As String = UserIn.Get(\"p";
Debug.ShouldStop(262144);
_profile_tagcode = BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("profile_tagcode")))));Debug.locals.put("profile_tagcode", _profile_tagcode);Debug.locals.put("profile_tagcode", _profile_tagcode);
 BA.debugLineNum = 2388;BA.debugLine="Dim WareHouse As String = Utils.IfNullOrEmpty";
Debug.ShouldStop(524288);
_warehouse = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("warehouse")))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WareHouse", _warehouse);Debug.locals.put("WareHouse", _warehouse);
 BA.debugLineNum = 2389;BA.debugLine="Dim Available As Int = UserIn.Get(\"available\"";
Debug.ShouldStop(1048576);
_available = BA.numberCast(int.class, _userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("available")))));Debug.locals.put("Available", _available);Debug.locals.put("Available", _available);
 BA.debugLineNum = 2392;BA.debugLine="If (pwdrequest = 0) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 31:
//if
this.state = 38;
if ((RemoteObject.solveBoolean("=",_pwdrequest,BA.numberCast(double.class, 0)))) { 
this.state = 33;
}else 
{ BA.debugLineNum = 2433;BA.debugLine="else If (pwdrequest = 1) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",_pwdrequest,BA.numberCast(double.class, 1)))) { 
this.state = 35;
}else 
{ BA.debugLineNum = 2439;BA.debugLine="else If (pwdrequest = 2) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",_pwdrequest,BA.numberCast(double.class, 2)))) { 
this.state = 37;
}}}
if (true) break;

case 33:
//C
this.state = 38;
 BA.debugLineNum = 2394;BA.debugLine="ShareCode.SESS_User = Tagcode";
Debug.ShouldStop(33554432);
parent.mostCurrent._sharecode._sess_user /*RemoteObject*/  = _tagcode;
 BA.debugLineNum = 2395;BA.debugLine="ShareCode.SESS_UserName = UserIn.Get(\"name\")";
Debug.ShouldStop(67108864);
parent.mostCurrent._sharecode._sess_username /*RemoteObject*/  = BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 2396;BA.debugLine="ShareCode.SESS_UWDUKEY = UserIn.Get(\"usernam";
Debug.ShouldStop(134217728);
parent.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/  = BA.ObjectToString(_userin.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));
 BA.debugLineNum = 2397;BA.debugLine="ShareCode.SESS_UserProfile = profile_tagcode";
Debug.ShouldStop(268435456);
parent.mostCurrent._sharecode._sess_userprofile /*RemoteObject*/  = _profile_tagcode;
 BA.debugLineNum = 2399;BA.debugLine="ShareCode.SESS_BLOCK_OPTIONS = False '(UserI";
Debug.ShouldStop(1073741824);
parent.mostCurrent._sharecode._sess_block_options /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2401;BA.debugLine="ShareCode.SESS_OPER_User = ShareCode.SESS_Us";
Debug.ShouldStop(1);
parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/  = parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ;
 BA.debugLineNum = 2402;BA.debugLine="ShareCode.SESS_OPER_UserName = ShareCode.SES";
Debug.ShouldStop(2);
parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/  = parent.mostCurrent._sharecode._sess_username /*RemoteObject*/ ;
 BA.debugLineNum = 2403;BA.debugLine="ShareCode.SESS_OPER_UWDUKEY = ShareCode.SESS";
Debug.ShouldStop(4);
parent.mostCurrent._sharecode._sess_oper_uwdukey /*RemoteObject*/  = parent.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ;
 BA.debugLineNum = 2405;BA.debugLine="ShareCode.SESS_WareHouse = WareHouse";
Debug.ShouldStop(16);
parent.mostCurrent._sharecode._sess_warehouse /*RemoteObject*/  = _warehouse;
 BA.debugLineNum = 2406;BA.debugLine="ShareCode.USR_STATE = Available";
Debug.ShouldStop(32);
parent.mostCurrent._sharecode._usr_state /*RemoteObject*/  = _available;
 BA.debugLineNum = 2407;BA.debugLine="ShareCode.APP_LAST_USER = ShareCode.SESS_UWD";
Debug.ShouldStop(64);
parent.mostCurrent._sharecode._app_last_user /*RemoteObject*/  = parent.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ;
 BA.debugLineNum = 2409;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"L";
Debug.ShouldStop(256);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("LAST_USER")),(Object)(parent.mostCurrent._sharecode._app_last_user /*RemoteObject*/ ));
 BA.debugLineNum = 2410;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(512);
parent.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 2417;BA.debugLine="SetUserLanguage";
Debug.ShouldStop(65536);
_setuserlanguage();
 BA.debugLineNum = 2423;BA.debugLine="CreateLoginsLog";
Debug.ShouldStop(4194304);
_createloginslog();
 BA.debugLineNum = 2425;BA.debugLine="OK = True";
Debug.ShouldStop(16777216);
_ok = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OK", _ok);
 BA.debugLineNum = 2427;BA.debugLine="Dim rrpac As ResumableSub = getLoginMainLogo";
Debug.ShouldStop(67108864);
_rrpac = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rrpac = _getloginmainlogo();Debug.locals.put("rrpac", _rrpac);Debug.locals.put("rrpac", _rrpac);
 BA.debugLineNum = 2428;BA.debugLine="Wait For(rrpac) Complete (Finito As Boolean)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setlogin"), _rrpac);
this.state = 73;
return;
case 73:
//C
this.state = 38;
_finito = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finito", _finito);
;
 BA.debugLineNum = 2430;BA.debugLine="Dim rrpac As ResumableSub = getLoginMainLogo";
Debug.ShouldStop(536870912);
_rrpac = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rrpac = _getloginmainlogomini();Debug.locals.put("rrpac", _rrpac);Debug.locals.put("rrpac", _rrpac);
 BA.debugLineNum = 2431;BA.debugLine="Wait For(rrpac) Complete (Finito As Boolean)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setlogin"), _rrpac);
this.state = 74;
return;
case 74:
//C
this.state = 38;
_finito = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finito", _finito);
;
 if (true) break;

case 35:
//C
this.state = 38;
 BA.debugLineNum = 2434;BA.debugLine="MsgboxAsync(ShareCode.LoginResetExists, Shar";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginresetexists /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 2435;BA.debugLine="CallAgain = True";
Debug.ShouldStop(4);
_callagain = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("CallAgain", _callagain);
 BA.debugLineNum = 2436;BA.debugLine="ResetPanels";
Debug.ShouldStop(8);
_resetpanels();
 BA.debugLineNum = 2437;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(16);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2438;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(32);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 2441;BA.debugLine="OK = True";
Debug.ShouldStop(256);
_ok = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OK", _ok);
 if (true) break;

case 38:
//C
this.state = 47;
;
 if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 2446;BA.debugLine="Msgbox2Async(ShareCode.LoginMessage_NOTOK, Sh";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginmessage_notok /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_try /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2447;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setlogin"), null);
this.state = 75;
return;
case 75:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2448;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (true) break;

case 41:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 46;
 BA.debugLineNum = 2449;BA.debugLine="CallAgain = True";
Debug.ShouldStop(65536);
_callagain = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("CallAgain", _callagain);
 BA.debugLineNum = 2450;BA.debugLine="ResetPanels";
Debug.ShouldStop(131072);
_resetpanels();
 BA.debugLineNum = 2451;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(262144);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2452;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(524288);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 2454;BA.debugLine="OK = False";
Debug.ShouldStop(2097152);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);
 if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 56;
;
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 2459;BA.debugLine="Msgbox2Async(ShareCode.LoginServerError, Share";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginservererror /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_try /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2460;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setlogin"), null);
this.state = 76;
return;
case 76:
//C
this.state = 50;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2461;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(268435456);
if (true) break;

case 50:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 55;
 BA.debugLineNum = 2462;BA.debugLine="OK = True";
Debug.ShouldStop(536870912);
_ok = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("OK", _ok);
 BA.debugLineNum = 2463;BA.debugLine="CallAgain = True";
Debug.ShouldStop(1073741824);
_callagain = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("CallAgain", _callagain);
 BA.debugLineNum = 2464;BA.debugLine="ResetPanels";
Debug.ShouldStop(-2147483648);
_resetpanels();
 BA.debugLineNum = 2465;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(1);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2466;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(2);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 2468;BA.debugLine="OK = False";
Debug.ShouldStop(8);
_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("OK", _ok);
 if (true) break;

case 55:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 2471;BA.debugLine="Job.Release";
Debug.ShouldStop(64);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 2474;BA.debugLine="MsgboxAsync(ShareCode.AllFieldsMandatoryMessage,";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._allfieldsmandatorymessage /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 2475;BA.debugLine="CallAgain = True";
Debug.ShouldStop(1024);
_callagain = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("CallAgain", _callagain);
 BA.debugLineNum = 2476;BA.debugLine="ResetPanels";
Debug.ShouldStop(2048);
_resetpanels();
 BA.debugLineNum = 2477;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(4096);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2478;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 if (true) break;
;
 BA.debugLineNum = 2482;BA.debugLine="If Not(CallAgain) Then";
Debug.ShouldStop(131072);

case 60:
//if
this.state = 69;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_callagain)).<Boolean>get().booleanValue()) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 2483;BA.debugLine="If (OK = True) Then";
Debug.ShouldStop(262144);
if (true) break;

case 63:
//if
this.state = 68;
if ((RemoteObject.solveBoolean("=",_ok,parent.mostCurrent.__c.getField(true,"True")))) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
 BA.debugLineNum = 2484;BA.debugLine="prc_LoginClose";
Debug.ShouldStop(524288);
_prc_loginclose();
 BA.debugLineNum = 2485;BA.debugLine="Sleep(500)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setlogin"),BA.numberCast(int.class, 500));
this.state = 77;
return;
case 77:
//C
this.state = 68;
;
 BA.debugLineNum = 2486;BA.debugLine="ResetPanels";
Debug.ShouldStop(2097152);
_resetpanels();
 BA.debugLineNum = 2487;BA.debugLine="TimeStart.Enabled = True";
Debug.ShouldStop(4194304);
parent._timestart.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 2489;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 68:
//C
this.state = 69;
;
 if (true) break;

case 69:
//C
this.state = -1;
;
 BA.debugLineNum = 2494;BA.debugLine="End Sub";
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
public static RemoteObject  _setlogos() throws Exception{
try {
		Debug.PushSubsStack("SetLogos (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,763);
if (RapidSub.canDelegate("setlogos")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setlogos");}
 BA.debugLineNum = 763;BA.debugLine="Sub SetLogos";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 764;BA.debugLine="LoginPanelIconImageView.Bitmap = Consts.AppLogo";
Debug.ShouldStop(134217728);
main.mostCurrent._loginpaneliconimageview.runMethod(false,"setBitmap",(main.mostCurrent._consts._applogo /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 765;BA.debugLine="LoginPanelIconImageView.Gravity = Gravity.CENTER";
Debug.ShouldStop(268435456);
main.mostCurrent._loginpaneliconimageview.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 767;BA.debugLine="CompanyImageView.Bitmap = Consts.CompanyImage";
Debug.ShouldStop(1073741824);
main.mostCurrent._companyimageview.runMethod(false,"setBitmap",(main.mostCurrent._consts._companyimage /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 768;BA.debugLine="CompanyImageView.Gravity = Gravity.FILL";
Debug.ShouldStop(-2147483648);
main.mostCurrent._companyimageview.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 770;BA.debugLine="LoginValidationPanelIconImageView.Bitmap = Consts";
Debug.ShouldStop(2);
main.mostCurrent._loginvalidationpaneliconimageview.runMethod(false,"setBitmap",(main.mostCurrent._consts._applogo /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 771;BA.debugLine="LoginValidationPanelIconImageView.Gravity = Gravi";
Debug.ShouldStop(4);
main.mostCurrent._loginvalidationpaneliconimageview.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 773;BA.debugLine="VarificationPanelIconImageView.Bitmap = Consts.Ap";
Debug.ShouldStop(16);
main.mostCurrent._varificationpaneliconimageview.runMethod(false,"setBitmap",(main.mostCurrent._consts._applogo /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 774;BA.debugLine="VarificationPanelIconImageView.Gravity = Gravity.";
Debug.ShouldStop(32);
main.mostCurrent._varificationpaneliconimageview.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 776;BA.debugLine="AuthorizationPanelIconImageView.Bitmap = Consts.A";
Debug.ShouldStop(128);
main.mostCurrent._authorizationpaneliconimageview.runMethod(false,"setBitmap",(main.mostCurrent._consts._applogo /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 777;BA.debugLine="AuthorizationPanelIconImageView.Gravity = Gravity";
Debug.ShouldStop(256);
main.mostCurrent._authorizationpaneliconimageview.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 779;BA.debugLine="WelcomePanelIconImageView.Bitmap = Consts.AppLogo";
Debug.ShouldStop(1024);
main.mostCurrent._welcomepaneliconimageview.runMethod(false,"setBitmap",(main.mostCurrent._consts._applogo /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 780;BA.debugLine="WelcomePanelIconImageView.Gravity = Gravity.CENTE";
Debug.ShouldStop(2048);
main.mostCurrent._welcomepaneliconimageview.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 782;BA.debugLine="mainPanSplashCustomLogo.Gravity = Gravity.CENTER";
Debug.ShouldStop(8192);
main.mostCurrent._mainpansplashcustomlogo.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 786;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO)) Then";
Debug.ShouldStop(131072);
if ((main.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._sharecode._app_main_logo /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 787;BA.debugLine="mainPanSplashCustomLogo.SetBackgroundImage(Utils";
Debug.ShouldStop(262144);
main.mostCurrent._mainpansplashcustomlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((main.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._sharecode._app_main_logo /*RemoteObject*/ )).getObject())));
 };
 BA.debugLineNum = 789;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setpanelbyinstallationstatus() throws Exception{
try {
		Debug.PushSubsStack("SetPanelByInstallationStatus (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,791);
if (RapidSub.canDelegate("setpanelbyinstallationstatus")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setpanelbyinstallationstatus"); return;}
ResumableSub_SetPanelByInstallationStatus rsub = new ResumableSub_SetPanelByInstallationStatus(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetPanelByInstallationStatus extends BA.ResumableSub {
public ResumableSub_SetPanelByInstallationStatus(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _reinstallation = RemoteObject.createImmutable(false);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetPanelByInstallationStatus (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,791);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 796;BA.debugLine="Dim Reinstallation As Boolean = False";
Debug.ShouldStop(134217728);
_reinstallation = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Reinstallation", _reinstallation);Debug.locals.put("Reinstallation", _reinstallation);
 BA.debugLineNum = 798;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTALL";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FIRSTINSTALL_IN_PROGRESS"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 799;BA.debugLine="Reinstallation = True";
Debug.ShouldStop(1073741824);
_reinstallation = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Reinstallation", _reinstallation);
 if (true) break;
;
 BA.debugLineNum = 803;BA.debugLine="If ((ShareCode.APPL_CONFIRMED = 0) And (Starter.C";
Debug.ShouldStop(4);

case 4:
//if
this.state = 17;
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ,BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent.mostCurrent._starter._currentflowposition /*RemoteObject*/ ,BA.numberCast(double.class, 0))))))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 807;BA.debugLine="else If ((ShareCode.APPL_CONFIRMED = 0) And (Star";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._appl_confirmed /*RemoteObject*/ ,BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent.mostCurrent._starter._currentflowposition /*RemoteObject*/ ,BA.numberCast(double.class, 1))))))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 811;BA.debugLine="else if Reinstallation Then";
Debug.ShouldStop(1024);
if (_reinstallation.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 16;
}}}
if (true) break;

case 6:
//C
this.state = 17;
 BA.debugLineNum = 804;BA.debugLine="isFirstInstall = True";
Debug.ShouldStop(8);
parent._isfirstinstall = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 805;BA.debugLine="Starter.FirstInstall = isFirstInstall";
Debug.ShouldStop(16);
parent.mostCurrent._starter._firstinstall /*RemoteObject*/  = parent._isfirstinstall;
 BA.debugLineNum = 806;BA.debugLine="Panel_Config.Visible = True";
Debug.ShouldStop(32);
parent.mostCurrent._panel_config.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 8:
//C
this.state = 17;
 BA.debugLineNum = 808;BA.debugLine="isFirstInstall = True";
Debug.ShouldStop(128);
parent._isfirstinstall = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 809;BA.debugLine="Panel_Authorization.Visible = True";
Debug.ShouldStop(256);
parent.mostCurrent._panel_authorization.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 810;BA.debugLine="Starter.FirstInstall = isFirstInstall";
Debug.ShouldStop(512);
parent.mostCurrent._starter._firstinstall /*RemoteObject*/  = parent._isfirstinstall;
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 812;BA.debugLine="isFirstInstall = True";
Debug.ShouldStop(2048);
parent._isfirstinstall = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 813;BA.debugLine="Starter.FirstInstall = isFirstInstall";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._firstinstall /*RemoteObject*/  = parent._isfirstinstall;
 BA.debugLineNum = 814;BA.debugLine="Dim rs As ResumableSub = FirstInstallCompletePro";
Debug.ShouldStop(8192);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _firstinstallcompleteprocedure();Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 815;BA.debugLine="Wait For(rs) Complete (R As Boolean)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "setpanelbyinstallationstatus"), _rs);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("R", _r);
;
 BA.debugLineNum = 817;BA.debugLine="If Not(R)Then";
Debug.ShouldStop(65536);
if (true) break;

case 11:
//if
this.state = 14;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_r)).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 818;BA.debugLine="MsgboxAsync(ShareCode.AvisoErroComms,ShareCode.";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoerrocomms /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),main.processBA);
 BA.debugLineNum = 819;BA.debugLine="Starter.APP_IN_EXECUTION = False";
Debug.ShouldStop(262144);
parent.mostCurrent._starter._app_in_execution /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 14:
//C
this.state = 17;
;
 BA.debugLineNum = 822;BA.debugLine="ResetPanels";
Debug.ShouldStop(2097152);
_resetpanels();
 BA.debugLineNum = 823;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(4194304);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 824;BA.debugLine="Starter.CurrentFlowPosition = 3";
Debug.ShouldStop(8388608);
parent.mostCurrent._starter._currentflowposition /*RemoteObject*/  = BA.numberCast(int.class, 3);
 BA.debugLineNum = 825;BA.debugLine="DBStructures.getConfigApp(ShareCode.APP_TOKEN)";
Debug.ShouldStop(16777216);
parent.mostCurrent._dbstructures.runVoidMethod ("_getconfigapp" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._app_token /*RemoteObject*/ ));
 BA.debugLineNum = 826;BA.debugLine="Starter.APP_IN_EXECUTION = True";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._app_in_execution /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 828;BA.debugLine="Panel_Login.Visible = True";
Debug.ShouldStop(134217728);
parent.mostCurrent._panel_login.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 830;BA.debugLine="End Sub";
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
public static RemoteObject  _setshowwhenlocked() throws Exception{
try {
		Debug.PushSubsStack("SetShowWhenLocked (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,444);
if (RapidSub.canDelegate("setshowwhenlocked")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setshowwhenlocked");}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 444;BA.debugLine="Sub SetShowWhenLocked";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(268435456);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 446;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(536870912);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",main.processBA)));
 BA.debugLineNum = 447;BA.debugLine="r.Target = r.RunMethod(\"getWindow\")";
Debug.ShouldStop(1073741824);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWindow"))));
 BA.debugLineNum = 448;BA.debugLine="r.RunMethod2(\"addFlags\", 6815872, \"java.lang.int\"";
Debug.ShouldStop(-2147483648);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("addFlags")),(Object)(BA.NumberToString(6815872)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 450;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextlabels() throws Exception{
try {
		Debug.PushSubsStack("SetTextLabels (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,337);
if (RapidSub.canDelegate("settextlabels")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","settextlabels");}
 BA.debugLineNum = 337;BA.debugLine="Sub SetTextLabels";
Debug.ShouldStop(65536);
 BA.debugLineNum = 340;BA.debugLine="mainFirstInstall.Text = ShareCode.mainlayoutmainF";
Debug.ShouldStop(524288);
main.mostCurrent._mainfirstinstall.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutmainfirstinstall /*RemoteObject*/ ));
 BA.debugLineNum = 341;BA.debugLine="ButtonLoginEnter.text = ShareCode.mainlayoutButto";
Debug.ShouldStop(1048576);
main.mostCurrent._buttonloginenter.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutbuttonloginenter /*RemoteObject*/ ));
 BA.debugLineNum = 342;BA.debugLine="ButtonLoginExit.text = ShareCode.mainlayoutButton";
Debug.ShouldStop(2097152);
main.mostCurrent._buttonloginexit.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutbuttonloginexit /*RemoteObject*/ ));
 BA.debugLineNum = 343;BA.debugLine="ButtonLoginReset.text = ShareCode.mainlayoutButto";
Debug.ShouldStop(4194304);
main.mostCurrent._buttonloginreset.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutbuttonloginreset /*RemoteObject*/ ));
 BA.debugLineNum = 344;BA.debugLine="LabelTituloCredenciais.text = ShareCode.mainlayou";
Debug.ShouldStop(8388608);
main.mostCurrent._labeltitulocredenciais.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabeltitulocredenciais /*RemoteObject*/ ));
 BA.debugLineNum = 345;BA.debugLine="LabelControloAcesso.text = ShareCode.mainlayoutLa";
Debug.ShouldStop(16777216);
main.mostCurrent._labelcontroloacesso.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelcontroloacesso /*RemoteObject*/ ));
 BA.debugLineNum = 346;BA.debugLine="LabelNomeUtilizador.text = ShareCode.mainlayoutLa";
Debug.ShouldStop(33554432);
main.mostCurrent._labelnomeutilizador.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelnomeutilizador /*RemoteObject*/ ));
 BA.debugLineNum = 347;BA.debugLine="LabelPasswordUtilizador.text = ShareCode.mainlayo";
Debug.ShouldStop(67108864);
main.mostCurrent._labelpasswordutilizador.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelpasswordutilizador /*RemoteObject*/ ));
 BA.debugLineNum = 348;BA.debugLine="ButtonAuthNext.Text = ShareCode.mainlayoutButtonA";
Debug.ShouldStop(134217728);
main.mostCurrent._buttonauthnext.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutbuttonauthnext /*RemoteObject*/ ));
 BA.debugLineNum = 349;BA.debugLine="ButtonAuthBack.Text = ShareCode.mainlayoutButtonA";
Debug.ShouldStop(268435456);
main.mostCurrent._buttonauthback.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutbuttonauthback /*RemoteObject*/ ));
 BA.debugLineNum = 350;BA.debugLine="LabelWelcomeWarning.Text = ShareCode.mainlayoutLa";
Debug.ShouldStop(536870912);
main.mostCurrent._labelwelcomewarning.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelwelcomewarning /*RemoteObject*/ ));
 BA.debugLineNum = 351;BA.debugLine="LabelWelcomeEvolutionCheck.Text=ShareCode.mainlay";
Debug.ShouldStop(1073741824);
main.mostCurrent._labelwelcomeevolutioncheck.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelwelcomeevolutioncheck /*RemoteObject*/ ));
 BA.debugLineNum = 352;BA.debugLine="ButtonAuthBack.Text=ShareCode.mainlayoutButtonAut";
Debug.ShouldStop(-2147483648);
main.mostCurrent._buttonauthback.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutbuttonauthback /*RemoteObject*/ ));
 BA.debugLineNum = 353;BA.debugLine="ButtonWelcomeNext.Text=ShareCode.mainlayoutButton";
Debug.ShouldStop(1);
main.mostCurrent._buttonwelcomenext.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutbuttonwelcomenext /*RemoteObject*/ ));
 BA.debugLineNum = 354;BA.debugLine="ButtonAuthNext.Text=ShareCode.mainlayoutButtonAut";
Debug.ShouldStop(2);
main.mostCurrent._buttonauthnext.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutbuttonauthnext /*RemoteObject*/ ));
 BA.debugLineNum = 355;BA.debugLine="LabelHelpAutorizacao.Text=ShareCode.mainlayoutLab";
Debug.ShouldStop(4);
main.mostCurrent._labelhelpautorizacao.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelhelpautorizacao /*RemoteObject*/ ));
 BA.debugLineNum = 356;BA.debugLine="LabelAutorizacao.Text=ShareCode.mainlayoutLabelAu";
Debug.ShouldStop(8);
main.mostCurrent._labelautorizacao.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelautorizacao /*RemoteObject*/ ));
 BA.debugLineNum = 357;BA.debugLine="LabelCodigoInstancia.Text=ShareCode.mainlayoutLab";
Debug.ShouldStop(16);
main.mostCurrent._labelcodigoinstancia.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelcodigoinstancia /*RemoteObject*/ ));
 BA.debugLineNum = 358;BA.debugLine="LabelCodigoAutorizacao.Text=ShareCode.mainlayoutL";
Debug.ShouldStop(32);
main.mostCurrent._labelcodigoautorizacao.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelcodigoautorizacao /*RemoteObject*/ ));
 BA.debugLineNum = 359;BA.debugLine="LabelValidacaoLogin.Text = ShareCode.mainlayoutLa";
Debug.ShouldStop(64);
main.mostCurrent._labelvalidacaologin.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelvalidacaologin /*RemoteObject*/ ));
 BA.debugLineNum = 360;BA.debugLine="LabelValidacaoAcesso.text = ShareCode.mainlayoutL";
Debug.ShouldStop(128);
main.mostCurrent._labelvalidacaoacesso.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelvalidacaoacesso /*RemoteObject*/ ));
 BA.debugLineNum = 361;BA.debugLine="LabelCheckValidacao.text = ShareCode.mainlayoutLa";
Debug.ShouldStop(256);
main.mostCurrent._labelcheckvalidacao.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelcheckvalidacao /*RemoteObject*/ ));
 BA.debugLineNum = 362;BA.debugLine="LabelVerificacao.text = ShareCode.mainlayoutLabel";
Debug.ShouldStop(512);
main.mostCurrent._labelverificacao.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._mainlayoutlabelverificacao /*RemoteObject*/ ));
 BA.debugLineNum = 364;BA.debugLine="ShareCode.APP_VersionNocodeName = AppBuildVersion";
Debug.ShouldStop(2048);
main.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/  = main._appbuildversion;
 BA.debugLineNum = 365;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(4096);
main.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setuserinfo(RemoteObject _record,RemoteObject _uname) throws Exception{
try {
		Debug.PushSubsStack("SetUserInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2031);
if (RapidSub.canDelegate("setuserinfo")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setuserinfo", _record, _uname);}
Debug.locals.put("Record", _record);
Debug.locals.put("uname", _uname);
 BA.debugLineNum = 2031;BA.debugLine="Sub SetUserInfo(Record As Cursor, uname As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 2032;BA.debugLine="If (Record.GetString(\"title\") <> \"\") Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("!",_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title"))),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 2033;BA.debugLine="ShareCode.SESS_User = Record.GetString(\"tagcode\"";
Debug.ShouldStop(65536);
main.mostCurrent._sharecode._sess_user /*RemoteObject*/  = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));
 BA.debugLineNum = 2034;BA.debugLine="ShareCode.SESS_UWDUKEY = uname";
Debug.ShouldStop(131072);
main.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/  = _uname;
 BA.debugLineNum = 2035;BA.debugLine="ShareCode.SESS_WareHouse = Record.GetString(\"war";
Debug.ShouldStop(262144);
main.mostCurrent._sharecode._sess_warehouse /*RemoteObject*/  = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("warehouse")));
 BA.debugLineNum = 2036;BA.debugLine="ShareCode.USR_STATE = Record.GetInt(\"available\")";
Debug.ShouldStop(524288);
main.mostCurrent._sharecode._usr_state /*RemoteObject*/  = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("available")));
 BA.debugLineNum = 2037;BA.debugLine="ShareCode.SESS_UserName = Record.GetString(\"titl";
Debug.ShouldStop(1048576);
main.mostCurrent._sharecode._sess_username /*RemoteObject*/  = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));
 BA.debugLineNum = 2038;BA.debugLine="ShareCode.SESS_UserProfile = Record.GetString(\"p";
Debug.ShouldStop(2097152);
main.mostCurrent._sharecode._sess_userprofile /*RemoteObject*/  = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("profile_tagcode")));
 BA.debugLineNum = 2039;BA.debugLine="ShareCode.SESS_UserTeam = \"\"";
Debug.ShouldStop(4194304);
main.mostCurrent._sharecode._sess_userteam /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 2041;BA.debugLine="ShareCode.SESS_OPER_User = ShareCode.SESS_User";
Debug.ShouldStop(16777216);
main.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/  = main.mostCurrent._sharecode._sess_user /*RemoteObject*/ ;
 BA.debugLineNum = 2042;BA.debugLine="ShareCode.SESS_OPER_UserName = ShareCode.SESS_Us";
Debug.ShouldStop(33554432);
main.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/  = main.mostCurrent._sharecode._sess_username /*RemoteObject*/ ;
 BA.debugLineNum = 2043;BA.debugLine="ShareCode.SESS_OPER_UWDUKEY = uname";
Debug.ShouldStop(67108864);
main.mostCurrent._sharecode._sess_oper_uwdukey /*RemoteObject*/  = _uname;
 BA.debugLineNum = 2045;BA.debugLine="ShareCode.APP_LAST_USER = ShareCode.SESS_UWDUKEY";
Debug.ShouldStop(268435456);
main.mostCurrent._sharecode._app_last_user /*RemoteObject*/  = main.mostCurrent._sharecode._sess_uwdukey /*RemoteObject*/ ;
 };
 BA.debugLineNum = 2047;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setuserlanguage() throws Exception{
try {
		Debug.PushSubsStack("SetUserLanguage (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2210);
if (RapidSub.canDelegate("setuserlanguage")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setuserlanguage");}
 BA.debugLineNum = 2210;BA.debugLine="Sub SetUserLanguage";
Debug.ShouldStop(2);
 BA.debugLineNum = 2211;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
Debug.ShouldStop(4);
if (main.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._sharecode._userlanguage /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2212;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangua";
Debug.ShouldStop(8);
main.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._sharecode._userlanguage /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 2214;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
Debug.ShouldStop(32);
main.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PT")));
 };
 BA.debugLineNum = 2216;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidgetcolors() throws Exception{
try {
		Debug.PushSubsStack("SetWidgetColors (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,754);
if (RapidSub.canDelegate("setwidgetcolors")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","setwidgetcolors");}
 BA.debugLineNum = 754;BA.debugLine="Sub SetWidgetColors";
Debug.ShouldStop(131072);
 BA.debugLineNum = 756;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(MainLayou";
Debug.ShouldStop(524288);
main.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,main.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main.mostCurrent._mainlayoutpanel.getObject()));
 BA.debugLineNum = 757;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(ButtonLog";
Debug.ShouldStop(1048576);
main.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,main.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main.mostCurrent._buttonloginenter.getObject()));
 BA.debugLineNum = 758;BA.debugLine="ButtonLoginReset.TextColor = Consts.ColorMain";
Debug.ShouldStop(2097152);
main.mostCurrent._buttonloginreset.runMethod(true,"setTextColor",main.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 759;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(ButtonAut";
Debug.ShouldStop(4194304);
main.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,main.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main.mostCurrent._buttonauthnext.getObject()));
 BA.debugLineNum = 760;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(ButtonWel";
Debug.ShouldStop(8388608);
main.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,main.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main.mostCurrent._buttonwelcomenext.getObject()));
 BA.debugLineNum = 761;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startcomsservice() throws Exception{
try {
		Debug.PushSubsStack("StartComsService (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,832);
if (RapidSub.canDelegate("startcomsservice")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","startcomsservice");}
 BA.debugLineNum = 832;BA.debugLine="Sub StartComsService";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 833;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 834;BA.debugLine="StartService(Comms)";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((main.mostCurrent._comms.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e4.toString()); BA.debugLineNum = 836;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6109379588",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 BA.debugLineNum = 837;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16);
main.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 };
 BA.debugLineNum = 839;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timestart_tick() throws Exception{
try {
		Debug.PushSubsStack("TimeStart_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1506);
if (RapidSub.canDelegate("timestart_tick")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","timestart_tick");}
 BA.debugLineNum = 1506;BA.debugLine="Sub TimeStart_Tick";
Debug.ShouldStop(2);
 BA.debugLineNum = 1507;BA.debugLine="Log(\"TimeStart_Tick\")";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6111214593",RemoteObject.createImmutable("TimeStart_Tick"),0);
 BA.debugLineNum = 1508;BA.debugLine="TimeStartCounter = TimeStartCounter + 1";
Debug.ShouldStop(8);
main._timestartcounter = RemoteObject.solve(new RemoteObject[] {main._timestartcounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 1509;BA.debugLine="mainSplashProgress.Progress = TimeStartCounter 'm";
Debug.ShouldStop(16);
main.mostCurrent._mainsplashprogress.runMethod(true,"setProgress",main._timestartcounter);
 BA.debugLineNum = 1511;BA.debugLine="If (TimeStartCounter >= 10) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("g",main._timestartcounter,BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 1513;BA.debugLine="TimeStart.Enabled = False";
Debug.ShouldStop(256);
main._timestart.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1514;BA.debugLine="mainSplashProgress.Visible = False";
Debug.ShouldStop(512);
main.mostCurrent._mainsplashprogress.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1515;BA.debugLine="mainSplashProgress.Progress = 0";
Debug.ShouldStop(1024);
main.mostCurrent._mainsplashprogress.runMethod(true,"setProgress",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1516;BA.debugLine="mainSplashImageEffect.Visible = True";
Debug.ShouldStop(2048);
main.mostCurrent._mainsplashimageeffect.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1518;BA.debugLine="GetDeviceParamsFromDatabase";
Debug.ShouldStop(8192);
_getdeviceparamsfromdatabase();
 BA.debugLineNum = 1520;BA.debugLine="Starter.MakingLogin = True";
Debug.ShouldStop(32768);
main.mostCurrent._starter._makinglogin /*RemoteObject*/  = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1522;BA.debugLine="SetFTPUser";
Debug.ShouldStop(131072);
_setftpuser();
 BA.debugLineNum = 1532;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(134217728);
if (main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1533;BA.debugLine="Log(\"-----------  Não é local\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6111214619",RemoteObject.createImmutable("-----------  Não é local"),0);
 BA.debugLineNum = 1541;BA.debugLine="CallSubDelayed(DataUpdate, \"FirstSubFromLogin\")";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed",main.processBA,(Object)((main.mostCurrent._dataupdate.getObject())),(Object)(RemoteObject.createImmutable("FirstSubFromLogin")));
 }else {
 BA.debugLineNum = 1544;BA.debugLine="Log(\"-----------  Aplicação em modo local\")";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6111214630",RemoteObject.createImmutable("-----------  Aplicação em modo local"),0);
 BA.debugLineNum = 1545;BA.debugLine="CallSubDelayed2(MainMenu, \"StartTheActivity\", T";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",main.processBA,(Object)((main.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("StartTheActivity")),(Object)((main.mostCurrent.__c.getField(true,"True"))));
 };
 BA.debugLineNum = 1548;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\"";
Debug.ShouldStop(2048);
main.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 };
 BA.debugLineNum = 1550;BA.debugLine="Log(\"**  START LOG_SERVICE  : \" & mainSplashProgr";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6111214636",RemoteObject.concat(RemoteObject.createImmutable("**  START LOG_SERVICE  : "),main.mostCurrent._mainsplashprogress.runMethod(true,"getProgress"),main._timestartcounter),0);
 BA.debugLineNum = 1552;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatelocaluser(RemoteObject _recordtech,RemoteObject _update_at,RemoteObject _uname,RemoteObject _tech,RemoteObject _utech,RemoteObject _udtech,RemoteObject _user_tagcode) throws Exception{
try {
		Debug.PushSubsStack("UpdateLocalUser (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2074);
if (RapidSub.canDelegate("updatelocaluser")) { xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","updatelocaluser", _recordtech, _update_at, _uname, _tech, _utech, _udtech, _user_tagcode); return;}
ResumableSub_UpdateLocalUser rsub = new ResumableSub_UpdateLocalUser(null,_recordtech,_update_at,_uname,_tech,_utech,_udtech,_user_tagcode);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateLocalUser extends BA.ResumableSub {
public ResumableSub_UpdateLocalUser(xevolution.vrcg.devdemov2400.main parent,RemoteObject _recordtech,RemoteObject _update_at,RemoteObject _uname,RemoteObject _tech,RemoteObject _utech,RemoteObject _udtech,RemoteObject _user_tagcode) {
this.parent = parent;
this._recordtech = _recordtech;
this._update_at = _update_at;
this._uname = _uname;
this._tech = _tech;
this._utech = _utech;
this._udtech = _udtech;
this._user_tagcode = _user_tagcode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.main parent;
RemoteObject _recordtech;
RemoteObject _update_at;
RemoteObject _uname;
RemoteObject _tech;
RemoteObject _utech;
RemoteObject _udtech;
RemoteObject _user_tagcode;
RemoteObject _datacheck = RemoteObject.createImmutable("");
RemoteObject _gravalocal = RemoteObject.createImmutable(0);
RemoteObject _insertlistm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tgcode = RemoteObject.createImmutable("");
RemoteObject _nc = RemoteObject.createImmutable(0);
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateLocalUser (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,2074);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("RecordTech", _recordtech);
Debug.locals.put("update_at", _update_at);
Debug.locals.put("uname", _uname);
Debug.locals.put("tech", _tech);
Debug.locals.put("utech", _utech);
Debug.locals.put("udtech", _udtech);
Debug.locals.put("user_tagcode", _user_tagcode);
 BA.debugLineNum = 2075;BA.debugLine="Log(\"... Updating\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112001025",RemoteObject.createImmutable("... Updating"),0);
 BA.debugLineNum = 2076;BA.debugLine="Dim datacheck As String = RecordTech.GetString(\"u";
Debug.ShouldStop(134217728);
_datacheck = _recordtech.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("updated_at")));Debug.locals.put("datacheck", _datacheck);Debug.locals.put("datacheck", _datacheck);
 BA.debugLineNum = 2077;BA.debugLine="Dim GravaLocal As Int = 0";
Debug.ShouldStop(268435456);
_gravalocal = BA.numberCast(int.class, 0);Debug.locals.put("GravaLocal", _gravalocal);Debug.locals.put("GravaLocal", _gravalocal);
 BA.debugLineNum = 2078;BA.debugLine="If (Utils.IfNullOrEmpty(datacheck, \"\") <> update_";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 34;
if ((RemoteObject.solveBoolean("!",parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_datacheck),(Object)(RemoteObject.createImmutable(""))),_update_at))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2079;BA.debugLine="Log(\"... Make update\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112001029",RemoteObject.createImmutable("... Make update"),0);
 BA.debugLineNum = 2080;BA.debugLine="Dim InsertListm As Map";
Debug.ShouldStop(-2147483648);
_insertlistm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("InsertListm", _insertlistm);
 BA.debugLineNum = 2081;BA.debugLine="InsertListm.Initialize";
Debug.ShouldStop(1);
_insertlistm.runVoidMethod ("Initialize");
 BA.debugLineNum = 2082;BA.debugLine="InsertListm.Put(\"username\", uname)";
Debug.ShouldStop(2);
_insertlistm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_uname)));
 BA.debugLineNum = 2083;BA.debugLine="Try";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 2084;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC,";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("dta_technicals")),(Object)(_tech),(Object)(_insertlistm),(Object)(_uname),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2085;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "updatelocaluser"),BA.numberCast(int.class, 100));
this.state = 35;
return;
case 35:
//C
this.state = 9;
;
 BA.debugLineNum = 2086;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(32);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 2088;BA.debugLine="Log($\"ERRO UPDATE dta_technicals :: ${LastExcep";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112001038",(RemoteObject.concat(RemoteObject.createImmutable("ERRO UPDATE dta_technicals :: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2089;BA.debugLine="Utils.logError(\"Actualizar Técnicos\", ShareCode";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Actualizar Técnicos")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
;
 BA.debugLineNum = 2092;BA.debugLine="Dim tgcode As String = tech.Get(\"user_tagcode\")";
Debug.ShouldStop(2048);
_tgcode = BA.ObjectToString(_tech.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_tagcode")))));Debug.locals.put("tgcode", _tgcode);Debug.locals.put("tgcode", _tgcode);
 BA.debugLineNum = 2094;BA.debugLine="Dim InsertListm As Map";
Debug.ShouldStop(8192);
_insertlistm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("InsertListm", _insertlistm);
 BA.debugLineNum = 2095;BA.debugLine="InsertListm.Initialize";
Debug.ShouldStop(16384);
_insertlistm.runVoidMethod ("Initialize");
 BA.debugLineNum = 2096;BA.debugLine="InsertListm.Put(\"tagcode\", tgcode)";
Debug.ShouldStop(32768);
_insertlistm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_tgcode)));
 BA.debugLineNum = 2097;BA.debugLine="Dim nC As Int = DBStructures.GetCountOfEVC(\"aut_";
Debug.ShouldStop(65536);
_nc = parent.mostCurrent._dbstructures.runMethod(true,"_getcountofevc" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("aut_users")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(" and tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_user_tagcode))),RemoteObject.createImmutable("'")))));Debug.locals.put("nC", _nc);Debug.locals.put("nC", _nc);
 BA.debugLineNum = 2098;BA.debugLine="If nC = 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 10:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_nc,BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2099;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 13:
//try
this.state = 18;
this.catchState = 17;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 17;
 BA.debugLineNum = 2100;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(524288);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 2101;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(1048576);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2102;BA.debugLine="InsertList.Add(utech)";
Debug.ShouldStop(2097152);
_insertlist.runVoidMethod ("Add",(Object)((_utech.getObject())));
 BA.debugLineNum = 2104;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("aut_users")),(Object)(_insertlist),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2105;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "updatelocaluser"),BA.numberCast(int.class, 100));
this.state = 36;
return;
case 36:
//C
this.state = 18;
;
 BA.debugLineNum = 2106;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(33554432);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 2108;BA.debugLine="Log($\"ERRO INSERT aut_users :: ${LastException";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112001058",(RemoteObject.concat(RemoteObject.createImmutable("ERRO INSERT aut_users :: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2109;BA.debugLine="Utils.logError(\"Inserir Utilizadores\", ShareCo";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Inserir Utilizadores")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2112;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 21:
//try
this.state = 26;
this.catchState = 25;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 26;
this.catchState = 25;
 BA.debugLineNum = 2114;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("aut_users")),(Object)(_utech),(Object)(_insertlistm),(Object)(_uname),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2115;BA.debugLine="Sleep(100)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "updatelocaluser"),BA.numberCast(int.class, 100));
this.state = 37;
return;
case 37:
//C
this.state = 26;
;
 BA.debugLineNum = 2116;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(8);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
 BA.debugLineNum = 2118;BA.debugLine="Log($\"ERRO UPDATE aut_users :: ${LastException";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112001068",(RemoteObject.concat(RemoteObject.createImmutable("ERRO UPDATE aut_users :: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2119;BA.debugLine="Utils.logError(\"Actualizar Utilizadores\", Shar";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Actualizar Utilizadores")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 2124;BA.debugLine="Dim InsertListm As Map";
Debug.ShouldStop(2048);
_insertlistm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("InsertListm", _insertlistm);
 BA.debugLineNum = 2125;BA.debugLine="InsertListm.Initialize";
Debug.ShouldStop(4096);
_insertlistm.runVoidMethod ("Initialize");
 BA.debugLineNum = 2126;BA.debugLine="InsertListm.Put(\"user_tagcode\", tgcode)";
Debug.ShouldStop(8192);
_insertlistm.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user_tagcode"))),(Object)((_tgcode)));
 BA.debugLineNum = 2127;BA.debugLine="Try";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 2129;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC,";
Debug.ShouldStop(65536);
parent.mostCurrent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("aut_users_details")),(Object)(_udtech),(Object)(_insertlistm),(Object)(_uname),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2130;BA.debugLine="Sleep(100)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "updatelocaluser"),BA.numberCast(int.class, 100));
this.state = 38;
return;
case 38:
//C
this.state = 33;
;
 BA.debugLineNum = 2131;BA.debugLine="GravaLocal = GravaLocal +1";
Debug.ShouldStop(262144);
_gravalocal = RemoteObject.solve(new RemoteObject[] {_gravalocal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GravaLocal", _gravalocal);
 Debug.CheckDeviceExceptions();
if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
 BA.debugLineNum = 2133;BA.debugLine="Log($\"ERRO UPDATE aut_users_details :: ${LastEx";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6112001083",(RemoteObject.concat(RemoteObject.createImmutable("ERRO UPDATE aut_users_details :: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2134;BA.debugLine="Utils.logError(\"Actualizar Detalhes Utilizador\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("Actualizar Detalhes Utilizador")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
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
this.state = -1;
;
 BA.debugLineNum = 2138;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static RemoteObject  _updateprogressbar(RemoteObject _maxval,RemoteObject _currentval) throws Exception{
try {
		Debug.PushSubsStack("UpdateProgressBar (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,3258);
if (RapidSub.canDelegate("updateprogressbar")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","updateprogressbar", _maxval, _currentval);}
Debug.locals.put("MaxVal", _maxval);
 BA.debugLineNum = 3258;BA.debugLine="Sub UpdateProgressBar(MaxVal As Long, CurrentVal A";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3259;BA.debugLine="Dim CurrentVal As Long = (100 * CurrentVal / MaxV";
Debug.ShouldStop(67108864);
_currentval = BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_currentval,_maxval}, "*/",0, 0)));Debug.locals.put("CurrentVal", _currentval);Debug.locals.put("CurrentVal", _currentval);
 BA.debugLineNum = 3260;BA.debugLine="ProgressoInicial.Progress = CurrentVal";
Debug.ShouldStop(134217728);
main.mostCurrent._progressoinicial.runMethod(true,"setProgress",BA.numberCast(int.class, _currentval));
 BA.debugLineNum = 3261;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateprogressbar2(RemoteObject _maxval,RemoteObject _currentval) throws Exception{
try {
		Debug.PushSubsStack("UpdateProgressBar2 (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,3263);
if (RapidSub.canDelegate("updateprogressbar2")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","updateprogressbar2", _maxval, _currentval);}
Debug.locals.put("MaxVal", _maxval);
 BA.debugLineNum = 3263;BA.debugLine="Sub UpdateProgressBar2(MaxVal As Long, CurrentVal";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 3264;BA.debugLine="Dim CurrentVal As Long = (100 * CurrentVal / MaxV";
Debug.ShouldStop(-2147483648);
_currentval = BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_currentval,_maxval}, "*/",0, 0)));Debug.locals.put("CurrentVal", _currentval);Debug.locals.put("CurrentVal", _currentval);
 BA.debugLineNum = 3265;BA.debugLine="ProgressoInicial2.Progress = CurrentVal";
Debug.ShouldStop(1);
main.mostCurrent._progressoinicial2.runMethod(true,"setProgress",BA.numberCast(int.class, _currentval));
 BA.debugLineNum = 3266;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _windowstatusupdate() throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1200);
if (RapidSub.canDelegate("windowstatusupdate")) { return xevolution.vrcg.devdemov2400.main.remoteMe.runUserSub(false, "main","windowstatusupdate");}
 BA.debugLineNum = 1200;BA.debugLine="Sub WindowStatusUpdate";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1201;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(65536);
main.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 1202;BA.debugLine="ButtonAppNetwork.Enabled = False";
Debug.ShouldStop(131072);
main.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1203;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
Debug.ShouldStop(262144);
main.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",main.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1204;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(524288);
if ((main.mostCurrent._sharecode._app_working_local /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1205;BA.debugLine="ButtonAppNetwork.Enabled = True";
Debug.ShouldStop(1048576);
main.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1206;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
Debug.ShouldStop(2097152);
main.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",main.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 };
 BA.debugLineNum = 1208;BA.debugLine="End Sub";
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